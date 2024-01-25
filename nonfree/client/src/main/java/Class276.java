import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class276 implements Runnable {

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	private int anInt8386 = 0;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	private int anInt8389 = 0;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	private final int anInt8388;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "[B")
	private final byte[] aByteArray109;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		new Class202("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class276(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt8388 = arg1 + 1;
		this.aByteArray109 = new byte[this.anInt8388];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public void method7014() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I[BII)V")
	public void method7015(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(66) int local66;
			if (this.anInt8386 > this.anInt8389) {
				local66 = this.anInt8386 - this.anInt8389 - 1;
			} else {
				local66 = this.anInt8386 + this.anInt8388 - this.anInt8389 - 1;
			}
			if (arg0 > local66) {
				throw new IOException("");
			}
			if (this.anInt8388 >= this.anInt8389 + arg0) {
				Static553.method3373(arg1, 0, this.aByteArray109, this.anInt8389, arg0);
			} else {
				@Pc(121) int local121 = this.anInt8388 - this.anInt8389;
				Static553.method3373(arg1, 0, this.aByteArray109, this.anInt8389, local121);
				Static553.method3373(arg1, local121, this.aByteArray109, 0, arg0 - local121);
			}
			this.anInt8389 = (this.anInt8389 + arg0) % this.anInt8388;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt8389 < this.anInt8386) {
						local30 = this.anInt8388 + this.anInt8389 - this.anInt8386;
					} else {
						local30 = this.anInt8389 - this.anInt8386;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(45) InterruptedException local45) {
					}
				}
			}
			try {
				if (this.anInt8386 + local30 > this.anInt8388) {
					@Pc(68) int local68 = this.anInt8388 - this.anInt8386;
					this.anOutputStream2.write(this.aByteArray109, this.anInt8386, local68);
					this.anOutputStream2.write(this.aByteArray109, 0, local30 - local68);
				} else {
					this.anOutputStream2.write(this.aByteArray109, this.anInt8386, local30);
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException1 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8386 = (local30 + this.anInt8386) % this.anInt8388;
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public void method7017() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}
}
