import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class279 implements Runnable {

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	private int anInt8067 = 0;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
	private int anInt8063 = 0;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	private final int anInt8062;

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "[B")
	private final byte[] aByteArray77;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class279(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt8062 = arg1 + 1;
		this.aByteArray77 = new byte[this.anInt8062];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!pu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8063 >= this.anInt8067) {
						local26 = this.anInt8063 - this.anInt8067;
					} else {
						local26 = this.anInt8063 + this.anInt8062 - this.anInt8067;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(47) InterruptedException local47) {
					}
				}
			}
			try {
				if (this.anInt8062 < this.anInt8067 + local26) {
					@Pc(74) int local74 = this.anInt8062 - this.anInt8067;
					this.anOutputStream1.write(this.aByteArray77, this.anInt8067, local74);
					this.anOutputStream1.write(this.aByteArray77, 0, local26 - local74);
				} else {
					this.anOutputStream1.write(this.aByteArray77, this.anInt8067, local26);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException2 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8067 = (local26 + this.anInt8067) % this.anInt8062;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public void method6852() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	public void method6855() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[BII)V")
	public void method6856(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(58) int local58;
			if (this.anInt8067 > this.anInt8063) {
				local58 = this.anInt8067 - this.anInt8063 - 1;
			} else {
				local58 = this.anInt8067 + this.anInt8062 - this.anInt8063 - 1;
			}
			if (arg1 > local58) {
				throw new IOException("");
			}
			if (arg1 + this.anInt8063 > this.anInt8062) {
				@Pc(98) int local98 = this.anInt8062 - this.anInt8063;
				Static685.method8328(arg0, 0, this.aByteArray77, this.anInt8063, local98);
				Static685.method8328(arg0, local98, this.aByteArray77, 0, arg1 - local98);
			} else {
				Static685.method8328(arg0, 0, this.aByteArray77, this.anInt8063, arg1);
			}
			this.anInt8063 = (this.anInt8063 + arg1) % this.anInt8062;
			this.notifyAll();
		}
	}
}
