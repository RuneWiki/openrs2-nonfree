import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class217 implements Runnable {

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	private int anInt5877 = 0;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	private int anInt5881 = 0;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	private final int anInt5875;

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "[B")
	private final byte[] aByteArray53;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class217(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt5875 = arg1 + 1;
		this.aByteArray53 = new byte[this.anInt5875];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public void method5097() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!lt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5877 <= this.anInt5881) {
						local31 = this.anInt5881 - this.anInt5877;
					} else {
						local31 = this.anInt5881 + this.anInt5875 - this.anInt5877;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(52) InterruptedException local52) {
					}
				}
			}
			try {
				if (this.anInt5875 >= local31 + this.anInt5877) {
					this.anOutputStream1.write(this.aByteArray53, this.anInt5877, local31);
				} else {
					@Pc(83) int local83 = this.anInt5875 - this.anInt5877;
					this.anOutputStream1.write(this.aByteArray53, this.anInt5877, local83);
					this.anOutputStream1.write(this.aByteArray53, 0, local31 - local83);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException1 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5877 = (this.anInt5877 + local31) % this.anInt5875;
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II[BZ)V")
	public void method5098(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(66) int local66;
			if (this.anInt5881 >= this.anInt5877) {
				local66 = this.anInt5875 + this.anInt5877 - this.anInt5881 - 1;
			} else {
				local66 = this.anInt5877 - this.anInt5881 - 1;
			}
			if (arg0 > local66) {
				throw new IOException("");
			}
			if (this.anInt5875 < this.anInt5881 + arg0) {
				@Pc(99) int local99 = this.anInt5875 - this.anInt5881;
				Static650.method2274(arg1, 0, this.aByteArray53, this.anInt5881, local99);
				Static650.method2274(arg1, local99, this.aByteArray53, 0, arg0 - local99);
			} else {
				Static650.method2274(arg1, 0, this.aByteArray53, this.anInt5881, arg0);
			}
			this.anInt5881 = (this.anInt5881 + arg0) % this.anInt5875;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V")
	public void method5100() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}
}
