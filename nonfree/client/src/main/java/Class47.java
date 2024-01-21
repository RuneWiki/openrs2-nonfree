import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZPYOGBCY")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!ZPYOGBCY", name = "g", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "h", descriptor = "I")
	private int anInt800;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "i", descriptor = "I")
	private int anInt801;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "e", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "j", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "k", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "f", descriptor = "Lclient!SXKUAOFD;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ZPYOGBCY", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!SXKUAOFD;Z)V")
	public Class47(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) boolean arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("44727, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "()V")
	public void method557() {
		this.aBoolean205 = true;
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
		this.aBoolean206 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray20 = null;
	}

	@OriginalMember(owner = "client!ZPYOGBCY", name = "b", descriptor = "()I")
	public int method558() throws IOException {
		return this.aBoolean205 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!ZPYOGBCY", name = "c", descriptor = "()I")
	public int method559() throws IOException {
		return this.aBoolean205 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "([BII)V")
	public void method560(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean205) {
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

	@OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "(I[BII)V")
	public void method561(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean205) {
				if (this.aBoolean207) {
					this.aBoolean207 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray20 == null) {
					this.aByteArray20 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
						this.aByteArray20[this.anInt801] = arg1[local31 + 0];
						this.anInt801 = (this.anInt801 + 1) % 5000;
						if (this.anInt801 == (this.anInt800 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean206) {
						this.aBoolean206 = true;
						this.anApplet_Sub1_2.method585(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("58407, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPYOGBCY", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean206) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt801 == this.anInt800) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean206) {
					return;
				}
				local27 = this.anInt800;
				if (this.anInt801 >= this.anInt800) {
					local38 = this.anInt801 - this.anInt800;
				} else {
					local38 = 5000 - this.anInt800;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray20, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean207 = true;
				}
				this.anInt800 = (this.anInt800 + local38) % 5000;
				try {
					if (this.anInt801 == this.anInt800) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean207 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ZPYOGBCY", name = "a", descriptor = "(I)V")
	public void method562() {
		try {
			System.out.println("dummy:" + this.aBoolean205);
			System.out.println("tcycl:" + this.anInt800);
			System.out.println("tnum:" + this.anInt801);
			System.out.println("writer:" + this.aBoolean206);
			System.out.println("ioerror:" + this.aBoolean207);
			try {
				System.out.println("available:" + this.method559());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("58222, " + 744 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
