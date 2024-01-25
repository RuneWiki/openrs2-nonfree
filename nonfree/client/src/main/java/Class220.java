import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class220 implements Runnable {

	@OriginalMember(owner = "client!lfa", name = "p", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
	private int anInt5816 = 0;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
	private int anInt5821 = 0;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	private final int anInt5815;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "[B")
	private final byte[] aByteArray68;

	@OriginalMember(owner = "client!lfa", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class220(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt5815 = arg1 + 1;
		this.aByteArray68 = new byte[this.anInt5815];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II[BI)I")
	public int method5225(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg1.length < arg0 + arg2) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(56) int local56;
			if (this.anInt5821 > this.anInt5816) {
				local56 = this.anInt5816 + this.anInt5815 - this.anInt5821;
			} else {
				local56 = this.anInt5816 - this.anInt5821;
			}
			if (local56 < arg0) {
				arg0 = local56;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg0 + this.anInt5821 <= this.anInt5815) {
				Static691.method82(this.aByteArray68, this.anInt5821, arg1, arg2, arg0);
			} else {
				@Pc(118) int local118 = this.anInt5815 - this.anInt5821;
				Static691.method82(this.aByteArray68, this.anInt5821, arg1, arg2, local118);
				Static691.method82(this.aByteArray68, 0, arg1, arg2 + local118, arg0 - local118);
			}
			this.anInt5821 = (this.anInt5821 + arg0) % this.anInt5815;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)V")
	public void method5226() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!lfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(42) int local42;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5821 == 0) {
						local42 = this.anInt5815 - this.anInt5816 - 1;
					} else if (this.anInt5821 > this.anInt5816) {
						local42 = this.anInt5821 - this.anInt5816 - 1;
					} else {
						local42 = this.anInt5815 - this.anInt5816;
					}
					if (local42 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(69) InterruptedException local69) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray68, this.anInt5816, local42);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95) {
				@Pc(95) IOException local95x = local95;
				synchronized (this) {
					this.anIOException2 = local95x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5816 = (local86 + this.anInt5816) % this.anInt5815;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
	public void method5227() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IB)Z")
	public boolean method5228(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt5815) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(51) int local51;
			if (this.anInt5816 < this.anInt5821) {
				local51 = this.anInt5816 + this.anInt5815 - this.anInt5821;
			} else {
				local51 = this.anInt5816 - this.anInt5821;
			}
			if (local51 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}
}
