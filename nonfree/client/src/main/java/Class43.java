import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TYRTFBBQ")
public final class Class43 implements Runnable {

	@OriginalMember(owner = "client!TYRTFBBQ", name = "h", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "i", descriptor = "I")
	private int anInt758;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "j", descriptor = "I")
	private int anInt759;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "b", descriptor = "I")
	private int anInt757 = -446;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "f", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "k", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "l", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "g", descriptor = "Lclient!NZBGSSTU;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!TYRTFBBQ", name = "<init>", descriptor = "(Lclient!NZBGSSTU;BLjava/net/Socket;)V")
	public Class43(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("87599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "()V")
	public void method545() {
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
		this.aByteArray19 = null;
	}

	@OriginalMember(owner = "client!TYRTFBBQ", name = "b", descriptor = "()I")
	public int method546() throws IOException {
		return this.aBoolean167 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!TYRTFBBQ", name = "c", descriptor = "()I")
	public int method547() throws IOException {
		return this.aBoolean167 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "([BII)V")
	public void method548(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
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

	@OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "(III[B)V")
	public void method549(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean167) {
				if (this.aBoolean169) {
					this.aBoolean169 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray19[this.anInt759] = arg1[local28 + 0];
						this.anInt759 = (this.anInt759 + 1) % 5000;
						if (this.anInt759 == (this.anInt758 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean168) {
						this.aBoolean168 = true;
						this.anApplet_Sub1_1.method585(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("97338, " + -484 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYRTFBBQ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean168) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt759 == this.anInt758) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean168) {
					return;
				}
				local27 = this.anInt758;
				if (this.anInt759 >= this.anInt758) {
					local38 = this.anInt759 - this.anInt758;
				} else {
					local38 = 5000 - this.anInt758;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray19, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean169 = true;
				}
				this.anInt758 = (this.anInt758 + local38) % 5000;
				try {
					if (this.anInt759 == this.anInt758) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean169 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!TYRTFBBQ", name = "a", descriptor = "(I)V")
	public void method550() {
		try {
			System.out.println("dummy:" + this.aBoolean167);
			System.out.println("tcycl:" + this.anInt758);
			System.out.println("tnum:" + this.anInt759);
			System.out.println("writer:" + this.aBoolean168);
			System.out.println("ioerror:" + this.aBoolean169);
			try {
				System.out.println("available:" + this.method547());
			} catch (@Pc(70) IOException local70) {
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("50133, " + 6 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
