import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!d")
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!a;B)V")
	public Class6(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket1 = arg0;
			@Pc(24) boolean local24 = false;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("11841, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	public void method190() {
		this.aBoolean81 = true;
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
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean82 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray6 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
	public int method191() throws IOException {
		return this.aBoolean81 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
	public int method192() throws IOException {
		return this.aBoolean81 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BII)V")
	public void method193(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean81) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BZII)V")
	public void method194(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (!this.aBoolean81) {
				if (this.aBoolean83) {
					this.aBoolean83 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray6 == null) {
					this.aByteArray6 = new byte[5000];
				}
				synchronized (this) {
					@Pc(30) int local30 = 0;
					while (true) {
						if (local30 >= arg2) {
							if (!this.aBoolean82) {
								this.aBoolean82 = true;
								this.anApplet_Sub1_2.method73(this, 2);
							}
							this.notify();
							break;
						}
						this.aByteArray6[this.anInt327] = arg0[local30];
						this.anInt327 = (this.anInt327 + 1) % 5000;
						if (this.anInt327 == (this.anInt326 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
						local30++;
					}
				}
				if (arg1) {
					for (@Pc(92) int local92 = 1; local92 > 0; local92++) {
					}
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("75111, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean82) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt327 == this.anInt326) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean82) {
					return;
				}
				local27 = this.anInt326;
				if (this.anInt327 >= this.anInt326) {
					local38 = this.anInt327 - this.anInt326;
				} else {
					local38 = 5000 - this.anInt326;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray6, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean83 = true;
				}
				this.anInt326 = (this.anInt326 + local38) % 5000;
				try {
					if (this.anInt327 == this.anInt326) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean83 = true;
				}
			}
		}
	}
}
