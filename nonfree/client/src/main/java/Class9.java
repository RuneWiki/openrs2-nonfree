import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EDOAEAIN")
public final class Class9 implements Runnable {

	@OriginalMember(owner = "client!EDOAEAIN", name = "i", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!EDOAEAIN", name = "j", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!EDOAEAIN", name = "k", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!EDOAEAIN", name = "a", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!EDOAEAIN", name = "b", descriptor = "B")
	private byte aByte7 = -89;

	@OriginalMember(owner = "client!EDOAEAIN", name = "c", descriptor = "B")
	private byte aByte8 = 42;

	@OriginalMember(owner = "client!EDOAEAIN", name = "g", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!EDOAEAIN", name = "l", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!EDOAEAIN", name = "m", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!EDOAEAIN", name = "h", descriptor = "Lclient!HXQNMAEJ;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!EDOAEAIN", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!EDOAEAIN", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!EDOAEAIN", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!EDOAEAIN", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!HXQNMAEJ;B)V")
	public Class9(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			if (arg2 != this.aByte7) {
				throw new NullPointerException();
			}
			this.anApplet_Sub1_2 = arg1;
			this.aSocket1 = arg0;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("50222, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDOAEAIN", name = "a", descriptor = "()V")
	public void method139() {
		this.aBoolean50 = true;
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
		this.aBoolean51 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray1 = null;
	}

	@OriginalMember(owner = "client!EDOAEAIN", name = "b", descriptor = "()I")
	public int method140() throws IOException {
		return this.aBoolean50 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!EDOAEAIN", name = "c", descriptor = "()I")
	public int method141() throws IOException {
		return this.aBoolean50 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!EDOAEAIN", name = "a", descriptor = "([BII)V")
	public void method142(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean50) {
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

	@OriginalMember(owner = "client!EDOAEAIN", name = "a", descriptor = "([BIZI)V")
	public void method143(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean50) {
				if (this.aBoolean52) {
					this.aBoolean52 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray1 == null) {
					this.aByteArray1 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
						this.aByteArray1[this.anInt238] = arg0[local38 + 0];
						this.anInt238 = (this.anInt238 + 1) % 5000;
						if (this.anInt238 == (this.anInt237 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean51) {
						this.aBoolean51 = true;
						this.anApplet_Sub1_2.method580(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("68973, " + arg0 + ", " + arg1 + ", " + true + ", " + 0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDOAEAIN", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean51) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt238 == this.anInt237) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean51) {
					return;
				}
				local27 = this.anInt237;
				if (this.anInt238 >= this.anInt237) {
					local38 = this.anInt238 - this.anInt237;
				} else {
					local38 = 5000 - this.anInt237;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray1, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean52 = true;
				}
				this.anInt237 = (this.anInt237 + local38) % 5000;
				try {
					if (this.anInt238 == this.anInt237) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean52 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EDOAEAIN", name = "a", descriptor = "(Z)V")
	public void method144() {
		try {
			System.out.println("dummy:" + this.aBoolean50);
			System.out.println("tcycl:" + this.anInt237);
			System.out.println("tnum:" + this.anInt238);
			System.out.println("writer:" + this.aBoolean51);
			System.out.println("ioerror:" + this.aBoolean52);
			try {
				System.out.println("available:" + this.method141());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("5829, " + true + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
