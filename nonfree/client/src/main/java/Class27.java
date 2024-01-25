import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class27 implements Runnable {

	@OriginalMember(owner = "client!br", name = "j", descriptor = "Lclient!qd;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "I")
	private int anInt1032 = 0;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	private int anInt1029 = 0;

	@OriginalMember(owner = "client!br", name = "q", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!hs;")
	private final Class103 aClass103_1;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class175("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
		new Class175("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!hs;)V")
	public Class27(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class103 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass103_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)I")
	public int method890() throws IOException {
		return this.aBoolean89 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB[BI)V")
	public void method891(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean89) {
			return;
		}
		if (this.aBoolean90) {
			this.aBoolean90 = false;
			throw new IOException();
		}
		if (this.aByteArray9 == null) {
			this.aByteArray9 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray9[this.anInt1029] = arg0[local38];
				this.anInt1029 = (this.anInt1029 + 1) % 5000;
				if ((this.anInt1032 + 4900) % 5000 == this.anInt1029) {
					throw new IOException();
				}
			}
			if (this.aClass190_1 == null) {
				this.aClass190_1 = this.aClass103_1.method2832(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method892() throws IOException {
		if (!this.aBoolean89 && this.aBoolean90) {
			this.aBoolean90 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!br", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt1029 == this.anInt1032) {
							if (this.aBoolean89) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt1029 < this.anInt1032) {
							local44 = 5000 - this.anInt1032;
						} else {
							local44 = this.anInt1029 - this.anInt1032;
						}
						local56 = this.anInt1032;
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray9, local56, local44);
					} catch (@Pc(76) IOException local76) {
						this.aBoolean90 = true;
					}
					this.anInt1032 = (this.anInt1032 + local44) % 5000;
					try {
						if (this.anInt1029 == this.anInt1032) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(102) IOException local102) {
						this.aBoolean90 = true;
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
				} catch (@Pc(126) IOException local126) {
				}
				this.aByteArray9 = null;
				return;
			}
		} catch (@Pc(131) Exception local131) {
			Static379.method1671(local131, null);
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	public void method893() {
		if (this.aBoolean89) {
			return;
		}
		synchronized (this) {
			this.aBoolean89 = true;
			this.notifyAll();
		}
		if (this.aClass190_1 != null) {
			while (this.aClass190_1.anInt5799 == 0) {
				Static135.method2458(1L);
			}
			if (this.aClass190_1.anInt5799 == 1) {
				try {
					((Thread) this.aClass190_1.anObject7).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass190_1 = null;
	}

	@OriginalMember(owner = "client!br", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method893();
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)I")
	public int method894() throws IOException {
		return this.aBoolean89 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([BIII)V")
	public void method896(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean89) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
	public void method897() {
		if (!this.aBoolean89) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
