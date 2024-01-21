import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QHZQTTDB")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!QHZQTTDB", name = "g", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!QHZQTTDB", name = "h", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!QHZQTTDB", name = "i", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!QHZQTTDB", name = "a", descriptor = "I")
	private int anInt638 = -75;

	@OriginalMember(owner = "client!QHZQTTDB", name = "e", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!QHZQTTDB", name = "j", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!QHZQTTDB", name = "k", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!QHZQTTDB", name = "f", descriptor = "Lclient!XHFSQKPU;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!QHZQTTDB", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!QHZQTTDB", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!QHZQTTDB", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!QHZQTTDB", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!XHFSQKPU;B)V")
	public Class36(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			if (arg2 != 6) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
			this.anApplet_Sub1_2 = arg1;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("3866, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QHZQTTDB", name = "a", descriptor = "()V")
	public void method425() {
		this.aBoolean167 = true;
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
		this.aBoolean168 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray17 = null;
	}

	@OriginalMember(owner = "client!QHZQTTDB", name = "b", descriptor = "()I")
	public int method426() throws IOException {
		return this.aBoolean167 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!QHZQTTDB", name = "c", descriptor = "()I")
	public int method427() throws IOException {
		return this.aBoolean167 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!QHZQTTDB", name = "a", descriptor = "([BII)V")
	public void method428(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean167) {
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

	@OriginalMember(owner = "client!QHZQTTDB", name = "a", descriptor = "([BIII)V")
	public void method429(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 == -3381 && !this.aBoolean167) {
				if (this.aBoolean169) {
					this.aBoolean169 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray17 == null) {
					this.aByteArray17 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
						this.aByteArray17[this.anInt640] = arg0[local32 + 0];
						this.anInt640 = (this.anInt640 + 1) % 5000;
						if (this.anInt640 == (this.anInt639 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean168) {
						this.aBoolean168 = true;
						this.anApplet_Sub1_2.method580(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("27414, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QHZQTTDB", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean168) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt640 == this.anInt639) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean168) {
					return;
				}
				local27 = this.anInt639;
				if (this.anInt640 >= this.anInt639) {
					local38 = this.anInt640 - this.anInt639;
				} else {
					local38 = 5000 - this.anInt639;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray17, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean169 = true;
				}
				this.anInt639 = (this.anInt639 + local38) % 5000;
				try {
					if (this.anInt640 == this.anInt639) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean169 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!QHZQTTDB", name = "a", descriptor = "(Z)V")
	public void method430() {
		try {
			System.out.println("dummy:" + this.aBoolean167);
			System.out.println("tcycl:" + this.anInt639);
			System.out.println("tnum:" + this.anInt640);
			System.out.println("writer:" + this.aBoolean168);
			System.out.println("ioerror:" + this.aBoolean169);
			try {
				System.out.println("available:" + this.method427());
			} catch (@Pc(66) IOException local66) {
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("51293, " + true + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
