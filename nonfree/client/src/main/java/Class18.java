import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GXWEWMHV")
public final class Class18 implements Runnable {

	@OriginalMember(owner = "client!GXWEWMHV", name = "h", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!GXWEWMHV", name = "i", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!GXWEWMHV", name = "j", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!GXWEWMHV", name = "b", descriptor = "B")
	private byte aByte15 = 2;

	@OriginalMember(owner = "client!GXWEWMHV", name = "f", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!GXWEWMHV", name = "k", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!GXWEWMHV", name = "l", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!GXWEWMHV", name = "g", descriptor = "Lclient!JWWAIQPI;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!GXWEWMHV", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!GXWEWMHV", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!GXWEWMHV", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!GXWEWMHV", name = "<init>", descriptor = "(BLjava/net/Socket;Lclient!JWWAIQPI;)V")
	public Class18(@OriginalArg(0) byte arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg2;
			this.aSocket1 = arg1;
			if (arg0 == this.aByte15) {
				@Pc(25) boolean local25 = false;
			} else {
				this.anInt204 = -5;
			}
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("87665, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "()V")
	public void method116() {
		this.aBoolean55 = true;
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
		this.aBoolean56 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray9 = null;
	}

	@OriginalMember(owner = "client!GXWEWMHV", name = "b", descriptor = "()I")
	public int method117() throws IOException {
		return this.aBoolean55 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!GXWEWMHV", name = "c", descriptor = "()I")
	public int method118() throws IOException {
		return this.aBoolean55 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "([BII)V")
	public void method119(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean55) {
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

	@OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "(III[B)V")
	public void method120(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean55) {
				if (this.aBoolean57) {
					this.aBoolean57 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray9 == null) {
					this.aByteArray9 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray9[this.anInt206] = arg1[local28 + 0];
						this.anInt206 = (this.anInt206 + 1) % 5000;
						if (this.anInt206 == (this.anInt205 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean56) {
						this.aBoolean56 = true;
						this.anApplet_Sub1_1.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("53412, " + 0 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GXWEWMHV", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean56) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt206 == this.anInt205) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean56) {
					return;
				}
				local27 = this.anInt205;
				if (this.anInt206 >= this.anInt205) {
					local38 = this.anInt206 - this.anInt205;
				} else {
					local38 = 5000 - this.anInt205;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray9, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean57 = true;
				}
				this.anInt205 = (this.anInt205 + local38) % 5000;
				try {
					if (this.anInt206 == this.anInt205) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean57 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!GXWEWMHV", name = "a", descriptor = "(Z)V")
	public void method121() {
		try {
			System.out.println("dummy:" + this.aBoolean55);
			System.out.println("tcycl:" + this.anInt205);
			System.out.println("tnum:" + this.anInt206);
			System.out.println("writer:" + this.aBoolean56);
			System.out.println("ioerror:" + this.aBoolean57);
			try {
				System.out.println("available:" + this.method118());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("8814, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
