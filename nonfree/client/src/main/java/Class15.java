import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HHMTQDYM")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!HHMTQDYM", name = "j", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!HHMTQDYM", name = "k", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!HHMTQDYM", name = "l", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!HHMTQDYM", name = "a", descriptor = "I")
	private int anInt258 = 559;

	@OriginalMember(owner = "client!HHMTQDYM", name = "b", descriptor = "I")
	private int anInt259 = 262;

	@OriginalMember(owner = "client!HHMTQDYM", name = "c", descriptor = "I")
	private int anInt260 = -230;

	@OriginalMember(owner = "client!HHMTQDYM", name = "d", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!HHMTQDYM", name = "h", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!HHMTQDYM", name = "m", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!HHMTQDYM", name = "n", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!HHMTQDYM", name = "i", descriptor = "Lclient!OFXQYNOM;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!HHMTQDYM", name = "g", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!HHMTQDYM", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!HHMTQDYM", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!HHMTQDYM", name = "<init>", descriptor = "(Lclient!OFXQYNOM;Ljava/net/Socket;I)V")
	public Class15(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("61982, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HHMTQDYM", name = "a", descriptor = "()V")
	public void method183() {
		this.aBoolean77 = true;
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
		this.aBoolean78 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray7 = null;
	}

	@OriginalMember(owner = "client!HHMTQDYM", name = "b", descriptor = "()I")
	public int method184() throws IOException {
		return this.aBoolean77 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!HHMTQDYM", name = "c", descriptor = "()I")
	public int method185() throws IOException {
		return this.aBoolean77 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!HHMTQDYM", name = "a", descriptor = "([BII)V")
	public void method186(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean77) {
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

	@OriginalMember(owner = "client!HHMTQDYM", name = "a", descriptor = "(I[BII)V")
	public void method187(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (!this.aBoolean77) {
				if (this.aBoolean79) {
					this.aBoolean79 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray7 == null) {
					this.aByteArray7 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
						this.aByteArray7[this.anInt262] = arg0[local33 + 0];
						this.anInt262 = (this.anInt262 + 1) % 5000;
						if (this.anInt262 == (this.anInt261 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean78) {
						this.aBoolean78 = true;
						this.anApplet_Sub1_1.method584(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("48033, " + 0 + ", " + arg0 + ", " + arg1 + ", " + -230 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HHMTQDYM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean78) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt262 == this.anInt261) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean78) {
					return;
				}
				local27 = this.anInt261;
				if (this.anInt262 >= this.anInt261) {
					local38 = this.anInt262 - this.anInt261;
				} else {
					local38 = 5000 - this.anInt261;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray7, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean79 = true;
				}
				this.anInt261 = (this.anInt261 + local38) % 5000;
				try {
					if (this.anInt262 == this.anInt261) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean79 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!HHMTQDYM", name = "a", descriptor = "(Z)V")
	public void method188() {
		try {
			System.out.println("dummy:" + this.aBoolean77);
			System.out.println("tcycl:" + this.anInt261);
			System.out.println("tnum:" + this.anInt262);
			System.out.println("writer:" + this.aBoolean78);
			System.out.println("ioerror:" + this.aBoolean79);
			try {
				System.out.println("available:" + this.method185());
			} catch (@Pc(70) IOException local70) {
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("8056, " + false + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
