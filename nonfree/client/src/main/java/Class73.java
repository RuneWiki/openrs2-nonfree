import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
	private int anInt1798 = 0;

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
	private int anInt1803 = 0;

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
	private final int anInt1799;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class73(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1799 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray10 = new byte[this.anInt1799];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)Z")
	public boolean method1500(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt1799 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt1803 < this.anInt1798) {
				local41 = this.anInt1803 + this.anInt1799 - this.anInt1798;
			} else {
				local41 = this.anInt1803 - this.anInt1798;
			}
			if (arg0 <= local41) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt1798 == 0) {
						local34 = this.anInt1799 - this.anInt1803 - 1;
					} else if (this.anInt1798 < this.anInt1803) {
						local34 = this.anInt1799 - this.anInt1803;
					} else {
						local34 = this.anInt1798 - this.anInt1803 - 1;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(63) InterruptedException local63) {
					}
				}
			}
			@Pc(80) int local80;
			try {
				local80 = this.anInputStream1.read(this.aByteArray10, this.anInt1803, local34);
				if (local80 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(88) IOException local88) {
				@Pc(88) IOException local88x = local88;
				synchronized (this) {
					this.anIOException2 = local88x;
					return;
				}
			}
			synchronized (this) {
				this.anInt1803 = (this.anInt1803 + local80) % this.anInt1799;
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public void method1501() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
	public void method1502() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBI[B)I")
	public int method1504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg2.length < arg0 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(55) int local55;
			if (this.anInt1803 < this.anInt1798) {
				local55 = this.anInt1799 + this.anInt1803 - this.anInt1798;
			} else {
				local55 = this.anInt1803 - this.anInt1798;
			}
			if (local55 < arg0) {
				arg0 = local55;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt1799 >= arg0 + this.anInt1798) {
				Static598.method774(this.aByteArray10, this.anInt1798, arg2, arg1, arg0);
			} else {
				@Pc(105) int local105 = this.anInt1799 - this.anInt1798;
				Static598.method774(this.aByteArray10, this.anInt1798, arg2, arg1, local105);
				Static598.method774(this.aByteArray10, 0, arg2, arg1 + local105, arg0 + -local105);
			}
			this.anInt1798 = (arg0 + this.anInt1798) % this.anInt1799;
			this.notifyAll();
			return arg0;
		}
	}
}
