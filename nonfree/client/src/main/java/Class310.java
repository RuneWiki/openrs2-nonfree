import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class310 implements Runnable {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
	private int anInt9331 = 0;

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
	private int anInt9336 = 0;

	@OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
	private final int anInt9334;

	@OriginalMember(owner = "client!taa", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!taa", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class310(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt9334 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray89 = new byte[this.anInt9334];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II[BI)V")
	public void method7168(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(67) int local67;
			if (this.anInt9331 <= this.anInt9336) {
				local67 = this.anInt9334 + this.anInt9331 - this.anInt9336 - 1;
			} else {
				local67 = this.anInt9331 - this.anInt9336 - 1;
			}
			if (arg1 > local67) {
				throw new IOException("");
			}
			if (this.anInt9334 >= arg1 + this.anInt9336) {
				Static599.method3060(arg0, 0, this.aByteArray89, this.anInt9336, arg1);
			} else {
				@Pc(114) int local114 = this.anInt9334 - this.anInt9336;
				Static599.method3060(arg0, 0, this.aByteArray89, this.anInt9336, local114);
				Static599.method3060(arg0, local114, this.aByteArray89, 0, arg1 - local114);
			}
			this.anInt9336 = (this.anInt9336 + arg1) % this.anInt9334;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public void method7169() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	public void method7170() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!taa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9336 < this.anInt9331) {
						local34 = this.anInt9336 + this.anInt9334 - this.anInt9331;
					} else {
						local34 = this.anInt9336 - this.anInt9331;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (this.anInt9331 + local34 > this.anInt9334) {
					@Pc(71) int local71 = this.anInt9334 - this.anInt9331;
					this.anOutputStream2.write(this.aByteArray89, this.anInt9331, local71);
					this.anOutputStream2.write(this.aByteArray89, 0, local34 - local71);
				} else {
					this.anOutputStream2.write(this.aByteArray89, this.anInt9331, local34);
				}
			} catch (@Pc(99) IOException local99) {
				@Pc(99) IOException local99x = local99;
				synchronized (this) {
					this.anIOException2 = local99x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9331 = (this.anInt9331 + local34) % this.anInt9334;
			}
		}
	}
}
