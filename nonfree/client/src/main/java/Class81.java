import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	private int anInt1929 = 0;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	private int anInt1937 = 0;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	private final int anInt1935;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class81(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1935 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray23 = new byte[this.anInt1935];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method1880() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!fl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt1937 > this.anInt1929) {
						local34 = this.anInt1929 + this.anInt1935 - this.anInt1937;
					} else {
						local34 = this.anInt1929 - this.anInt1937;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(52) InterruptedException local52) {
					}
				}
			}
			try {
				if (this.anInt1935 >= local34 + this.anInt1937) {
					this.anOutputStream1.write(this.aByteArray23, this.anInt1937, local34);
				} else {
					@Pc(83) int local83 = this.anInt1935 - this.anInt1937;
					this.anOutputStream1.write(this.aByteArray23, this.anInt1937, local83);
					this.anOutputStream1.write(this.aByteArray23, 0, local34 - local83);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException2 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt1937 = (local34 + this.anInt1937) % this.anInt1935;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[BII)V")
	public void method1884(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(56) int local56;
			if (this.anInt1929 >= this.anInt1937) {
				local56 = this.anInt1937 + this.anInt1935 - this.anInt1929 - 1;
			} else {
				local56 = this.anInt1937 - this.anInt1929 - 1;
			}
			if (arg1 > local56) {
				throw new IOException("");
			}
			if (this.anInt1935 >= this.anInt1929 + arg1) {
				Static472.method5022(arg0, 0, this.aByteArray23, this.anInt1929, arg1);
			} else {
				@Pc(103) int local103 = this.anInt1935 - this.anInt1929;
				Static472.method5022(arg0, 0, this.aByteArray23, this.anInt1929, local103);
				Static472.method5022(arg0, local103, this.aByteArray23, 0, arg1 - local103);
			}
			this.anInt1929 = (this.anInt1929 + arg1) % this.anInt1935;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	public void method1885() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}
}
