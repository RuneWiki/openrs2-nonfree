import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class237 implements Runnable {

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
	private int anInt7094 = 0;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
	private int anInt7096 = 0;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	private final int anInt7095;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "[B")
	private final byte[] aByteArray80;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class237(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt7095 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray80 = new byte[this.anInt7095];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[BII)V")
	public void method5925(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(62) int local62;
			if (this.anInt7094 > this.anInt7096) {
				local62 = this.anInt7094 - this.anInt7096 - 1;
			} else {
				local62 = this.anInt7095 + this.anInt7094 - this.anInt7096 - 1;
			}
			if (local62 < arg0) {
				throw new IOException("");
			}
			if (this.anInt7096 + arg0 <= this.anInt7095) {
				Static559.method5957(arg1, 0, this.aByteArray80, this.anInt7096, arg0);
			} else {
				@Pc(113) int local113 = this.anInt7095 - this.anInt7096;
				Static559.method5957(arg1, 0, this.aByteArray80, this.anInt7096, local113);
				Static559.method5957(arg1, local113, this.aByteArray80, 0, arg0 - local113);
			}
			this.anInt7096 = (this.anInt7096 + arg0) % this.anInt7095;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	public void method5926() {
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

	@OriginalMember(owner = "client!pu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt7096 < this.anInt7094) {
						local31 = this.anInt7095 + this.anInt7096 - this.anInt7094;
					} else {
						local31 = this.anInt7096 - this.anInt7094;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(46) InterruptedException local46) {
					}
				}
			}
			try {
				if (this.anInt7095 >= local31 + this.anInt7094) {
					this.anOutputStream1.write(this.aByteArray80, this.anInt7094, local31);
				} else {
					@Pc(78) int local78 = this.anInt7095 - this.anInt7094;
					this.anOutputStream1.write(this.aByteArray80, this.anInt7094, local78);
					this.anOutputStream1.write(this.aByteArray80, 0, local31 - local78);
				}
			} catch (@Pc(98) IOException local98) {
				@Pc(98) IOException local98x = local98;
				synchronized (this) {
					this.anIOException2 = local98x;
					return;
				}
			}
			synchronized (this) {
				this.anInt7094 = (local31 + this.anInt7094) % this.anInt7095;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public void method5927() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}
}
