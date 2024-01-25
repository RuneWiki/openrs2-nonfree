import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class247 implements Runnable {

	@OriginalMember(owner = "client!um", name = "t", descriptor = "[B")
	private byte[] aByteArray91;

	@OriginalMember(owner = "client!um", name = "C", descriptor = "Lclient!tf;")
	private Class236 aClass236_6;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "I")
	private int anInt6482 = 0;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	private int anInt6481 = 0;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "Lclient!ec;")
	private final Class61 aClass61_5;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class55("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ec;)V")
	public Class247(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class61 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass61_5 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III[B)V")
	public void method5151(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean419) {
			return;
		}
		if (this.aBoolean420) {
			this.aBoolean420 = false;
			throw new IOException();
		}
		if (this.aByteArray91 == null) {
			this.aByteArray91 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray91[this.anInt6481] = arg1[local38];
				this.anInt6481 = (this.anInt6481 + 1) % 5000;
				if (this.anInt6481 == (this.anInt6482 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass236_6 == null) {
				this.aClass236_6 = this.aClass61_5.method1459(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public void method5154() {
		if (!this.aBoolean419) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
	public int method5155() throws IOException {
		return this.aBoolean419 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public void method5156() throws IOException {
		if (!this.aBoolean419 && this.aBoolean420) {
			this.aBoolean420 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!um", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(39) int local39;
					@Pc(50) int local50;
					synchronized (this) {
						if (this.anInt6481 == this.anInt6482) {
							if (this.aBoolean419) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt6482 > this.anInt6481) {
							local39 = 5000 - this.anInt6482;
						} else {
							local39 = this.anInt6481 - this.anInt6482;
						}
						local50 = this.anInt6482;
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray91, local50, local39);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean420 = true;
					}
					this.anInt6482 = (local39 + this.anInt6482) % 5000;
					try {
						if (this.anInt6481 == this.anInt6482) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean420 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray91 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static419.method5247(local121, null);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([BBII)V")
	public void method5157(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean419) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg1 += local23;
			arg2 -= local23;
		}
	}

	@OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5162();
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I")
	public int method5161() throws IOException {
		return this.aBoolean419 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V")
	public void method5162() {
		if (this.aBoolean419) {
			return;
		}
		synchronized (this) {
			this.aBoolean419 = true;
			this.notifyAll();
		}
		if (this.aClass236_6 != null) {
			while (this.aClass236_6.anInt6178 == 0) {
				Static214.method2089(1L);
			}
			if (this.aClass236_6.anInt6178 == 1) {
				try {
					((Thread) this.aClass236_6.anObject8).join();
				} catch (@Pc(52) InterruptedException local52) {
				}
			}
		}
		this.aClass236_6 = null;
	}
}
