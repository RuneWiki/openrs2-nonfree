import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class314 implements Runnable {

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "I")
	private int anInt9268 = 0;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "I")
	private int anInt9267 = 0;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	private final int anInt9266;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "[B")
	private final byte[] aByteArray85;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class314(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt9266 = arg1 + 1;
		this.aByteArray85 = new byte[this.anInt9266];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V")
	public void method7561() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!st", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9268 > this.anInt9267) {
						local34 = this.anInt9266 + this.anInt9267 - this.anInt9268;
					} else {
						local34 = this.anInt9267 - this.anInt9268;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(51) InterruptedException local51) {
					}
				}
			}
			try {
				if (local34 + this.anInt9268 > this.anInt9266) {
					@Pc(73) int local73 = this.anInt9266 - this.anInt9268;
					this.anOutputStream1.write(this.aByteArray85, this.anInt9268, local73);
					this.anOutputStream1.write(this.aByteArray85, 0, local34 - local73);
				} else {
					this.anOutputStream1.write(this.aByteArray85, this.anInt9268, local34);
				}
			} catch (@Pc(101) IOException local101) {
				@Pc(101) IOException local101x = local101;
				synchronized (this) {
					this.anIOException2 = local101x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9268 = (this.anInt9268 + local34) % this.anInt9266;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II[BI)V")
	public void method7563(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(50) int local50;
			if (this.anInt9268 <= this.anInt9267) {
				local50 = this.anInt9266 + this.anInt9268 - this.anInt9267 - 1;
			} else {
				local50 = this.anInt9268 - this.anInt9267 - 1;
			}
			if (local50 < arg0) {
				throw new IOException("");
			}
			if (arg0 + this.anInt9267 > this.anInt9266) {
				@Pc(88) int local88 = this.anInt9266 - this.anInt9267;
				Static653.method6537(arg1, 0, this.aByteArray85, this.anInt9267, local88);
				Static653.method6537(arg1, local88, this.aByteArray85, 0, arg0 - local88);
			} else {
				Static653.method6537(arg1, 0, this.aByteArray85, this.anInt9267, arg0);
			}
			this.anInt9267 = (arg0 + this.anInt9267) % this.anInt9266;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	public void method7564() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}
}
