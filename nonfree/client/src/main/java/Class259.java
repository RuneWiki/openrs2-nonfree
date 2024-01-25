import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class259 implements Runnable {

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
	private int anInt7854 = 0;

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
	private int anInt7856 = 0;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
	private final int anInt7861;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class259(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt7861 = arg1 + 1;
		this.aByteArray82 = new byte[this.anInt7861];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIB[B)V")
	public void method6578(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(53) int local53;
			if (this.anInt7854 > this.anInt7856) {
				local53 = this.anInt7854 - this.anInt7856 - 1;
			} else {
				local53 = this.anInt7861 + this.anInt7854 - this.anInt7856 - 1;
			}
			if (arg0 > local53) {
				throw new IOException("");
			}
			if (this.anInt7861 >= this.anInt7856 + arg0) {
				Static655.method6406(arg1, 0, this.aByteArray82, this.anInt7856, arg0);
			} else {
				@Pc(109) int local109 = this.anInt7861 - this.anInt7856;
				Static655.method6406(arg1, 0, this.aByteArray82, this.anInt7856, local109);
				Static655.method6406(arg1, local109, this.aByteArray82, 0, arg0 - local109);
			}
			this.anInt7856 = (this.anInt7856 + arg0) % this.anInt7861;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V")
	public void method6579() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
	public void method6582() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(40) InterruptedException local40) {
		}
	}

	@OriginalMember(owner = "client!pfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt7856 < this.anInt7854) {
						local34 = this.anInt7856 + this.anInt7861 - this.anInt7854;
					} else {
						local34 = this.anInt7856 - this.anInt7854;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (local34 + this.anInt7854 > this.anInt7861) {
					@Pc(69) int local69 = this.anInt7861 - this.anInt7854;
					this.anOutputStream1.write(this.aByteArray82, this.anInt7854, local69);
					this.anOutputStream1.write(this.aByteArray82, 0, local34 - local69);
				} else {
					this.anOutputStream1.write(this.aByteArray82, this.anInt7854, local34);
				}
			} catch (@Pc(98) IOException local98) {
				@Pc(98) IOException local98x = local98;
				synchronized (this) {
					this.anIOException1 = local98x;
					return;
				}
			}
			synchronized (this) {
				this.anInt7854 = (local34 + this.anInt7854) % this.anInt7861;
			}
		}
	}
}
