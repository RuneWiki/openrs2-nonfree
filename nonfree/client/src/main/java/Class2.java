import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 implements Runnable {

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	private int anInt4 = 0;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
	private int anInt9 = 0;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
	private final int anInt11;

	@OriginalMember(owner = "client!aaa", name = "o", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class2(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt11 = arg1 + 1;
		this.aByteArray1 = new byte[this.anInt11];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!aaa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4 == 0) {
						local27 = this.anInt11 - this.anInt9 - 1;
					} else if (this.anInt4 >= this.anInt9) {
						local27 = this.anInt4 - this.anInt9 - 1;
					} else {
						local27 = this.anInt11 - this.anInt9;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(65) InterruptedException local65) {
					}
				}
			}
			@Pc(82) int local82;
			try {
				local82 = this.anInputStream1.read(this.aByteArray1, this.anInt9, local27);
				if (local82 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(91) IOException local91) {
				@Pc(91) IOException local91x = local91;
				synchronized (this) {
					this.anIOException1 = local91x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9 = (local82 + this.anInt9) % this.anInt11;
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	public void method19() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V")
	public void method20() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II[BB)I")
	public int method21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg2.length < arg1 + arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt9 >= this.anInt4) {
				local46 = this.anInt9 - this.anInt4;
			} else {
				local46 = this.anInt11 + this.anInt9 - this.anInt4;
			}
			if (arg1 > local46) {
				arg1 = local46;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt11 >= arg1 + this.anInt4) {
				Static655.method5836(this.aByteArray1, this.anInt4, arg2, arg0, arg1);
			} else {
				@Pc(110) int local110 = this.anInt11 - this.anInt4;
				Static655.method5836(this.aByteArray1, this.anInt4, arg2, arg0, local110);
				Static655.method5836(this.aByteArray1, 0, arg2, arg0 + local110, arg1 - local110);
			}
			this.anInt4 = (this.anInt4 + arg1) % this.anInt11;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Z")
	public boolean method22(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt11 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(32) int local32;
			if (this.anInt9 >= this.anInt4) {
				local32 = this.anInt9 - this.anInt4;
			} else {
				local32 = this.anInt11 + this.anInt9 - this.anInt4;
			}
			if (local32 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}
}
