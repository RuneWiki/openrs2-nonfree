import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class185 implements Runnable {

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	private int anInt4309 = 0;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	private int anInt4311 = 0;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
	private final int anInt4312;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class185(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt4312 = arg1 + 1;
		this.aByteArray46 = new byte[this.anInt4312];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III[B)V")
	public void method3673(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(71) int local71;
			if (this.anInt4311 <= this.anInt4309) {
				local71 = this.anInt4312 + this.anInt4311 - this.anInt4309 - 1;
			} else {
				local71 = this.anInt4311 - this.anInt4309 - 1;
			}
			if (arg0 > local71) {
				throw new IOException("");
			}
			if (arg0 + this.anInt4309 > this.anInt4312) {
				@Pc(104) int local104 = this.anInt4312 - this.anInt4309;
				Static598.method4261(arg1, 0, this.aByteArray46, this.anInt4309, local104);
				Static598.method4261(arg1, local104, this.aByteArray46, 0, arg0 - local104);
			} else {
				Static598.method4261(arg1, 0, this.aByteArray46, this.anInt4309, arg0);
			}
			this.anInt4309 = (this.anInt4309 + arg0) % this.anInt4312;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
	public void method3675() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V")
	public void method3676() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
	}

	@OriginalMember(owner = "client!jv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4311 > this.anInt4309) {
						local30 = this.anInt4309 + this.anInt4312 - this.anInt4311;
					} else {
						local30 = this.anInt4309 - this.anInt4311;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (this.anInt4312 >= local30 + this.anInt4311) {
					this.anOutputStream1.write(this.aByteArray46, this.anInt4311, local30);
				} else {
					@Pc(84) int local84 = this.anInt4312 - this.anInt4311;
					this.anOutputStream1.write(this.aByteArray46, this.anInt4311, local84);
					this.anOutputStream1.write(this.aByteArray46, 0, local30 - local84);
				}
			} catch (@Pc(104) IOException local104) {
				@Pc(104) IOException local104x = local104;
				synchronized (this) {
					this.anIOException1 = local104x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4311 = (local30 + this.anInt4311) % this.anInt4312;
			}
		}
	}
}
