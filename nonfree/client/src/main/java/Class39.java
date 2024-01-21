import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UUQNASSN")
public final class Class39 implements Runnable {

	@OriginalMember(owner = "client!UUQNASSN", name = "g", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!UUQNASSN", name = "h", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!UUQNASSN", name = "i", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!UUQNASSN", name = "e", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!UUQNASSN", name = "j", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!UUQNASSN", name = "k", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!UUQNASSN", name = "f", descriptor = "Lclient!NCIKLCII;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!UUQNASSN", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!UUQNASSN", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!UUQNASSN", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!UUQNASSN", name = "<init>", descriptor = "(ILclient!NCIKLCII;Ljava/net/Socket;)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("9055, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "()V")
	public void method513() {
		this.aBoolean162 = true;
		try {
			if (this.anInputStream2 != null) {
				this.anInputStream2.close();
			}
			if (this.anOutputStream2 != null) {
				this.anOutputStream2.close();
			}
			if (this.aSocket2 != null) {
				this.aSocket2.close();
			}
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean163 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray19 = null;
	}

	@OriginalMember(owner = "client!UUQNASSN", name = "b", descriptor = "()I")
	public int method514() throws IOException {
		return this.aBoolean162 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!UUQNASSN", name = "c", descriptor = "()I")
	public int method515() throws IOException {
		return this.aBoolean162 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "([BII)V")
	public void method516(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean162) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream2.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "(IZ[BI)V")
	public void method517(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean162) {
				if (this.aBoolean164) {
					this.aBoolean164 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray19[this.anInt707] = arg0[local28 + 0];
						this.anInt707 = (this.anInt707 + 1) % 5000;
						if (this.anInt707 == (this.anInt706 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean163) {
						this.aBoolean163 = true;
						this.anApplet_Sub1_2.method585(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("39749, " + 0 + ", " + false + ", " + arg0 + ", " + arg1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UUQNASSN", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean163) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt707 == this.anInt706) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean163) {
					return;
				}
				local27 = this.anInt706;
				if (this.anInt707 >= this.anInt706) {
					local38 = this.anInt707 - this.anInt706;
				} else {
					local38 = 5000 - this.anInt706;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray19, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean164 = true;
				}
				this.anInt706 = (this.anInt706 + local38) % 5000;
				try {
					if (this.anInt707 == this.anInt706) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean164 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!UUQNASSN", name = "a", descriptor = "(I)V")
	public void method518(@OriginalArg(0) int arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean162);
			System.out.println("tcycl:" + this.anInt706);
			System.out.println("tnum:" + this.anInt707);
			System.out.println("writer:" + this.aBoolean163);
			System.out.println("ioerror:" + this.aBoolean164);
			@Pc(53) boolean local53 = false;
			try {
				System.out.println("available:" + this.method515());
			} catch (@Pc(65) IOException local65) {
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("4758, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
