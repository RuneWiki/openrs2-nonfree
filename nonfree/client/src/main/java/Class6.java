import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	private int anInt204 = 268;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(ILjava/net/Socket;Lclient!a;)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		this.anApplet_Sub1_2 = arg2;
		this.aSocket1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	public void method147() {
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
		this.aByteArray2 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
	public int method148() throws IOException {
		return this.aBoolean50 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
	public int method149() throws IOException {
		return this.aBoolean50 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BII)V")
	public void method150(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
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

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI)V")
	public void method151(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean50) {
			return;
		}
		if (this.aBoolean52) {
			this.aBoolean52 = false;
			throw new IOException("Error in writer thread");
		}
		if (this.aByteArray2 == null) {
			this.aByteArray2 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				this.aByteArray2[this.anInt206] = arg0[local30];
				this.anInt206 = (this.anInt206 + 1) % 5000;
				if (this.anInt206 == (this.anInt205 + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}
			if (!this.aBoolean51) {
				this.aBoolean51 = true;
				this.anApplet_Sub1_2.method67(this, 2);
			}
			this.notify();
		}
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		System.out.println("clientstream writer starting");
		while (this.aBoolean51) {
			@Pc(41) int local41;
			@Pc(30) int local30;
			synchronized (this) {
				if (this.anInt206 == this.anInt205) {
					try {
						this.wait();
					} catch (@Pc(19) InterruptedException local19) {
					}
				}
				if (!this.aBoolean51) {
					break;
				}
				local30 = this.anInt205;
				if (this.anInt206 >= this.anInt205) {
					local41 = this.anInt206 - this.anInt205;
				} else {
					local41 = 5000 - this.anInt205;
				}
			}
			if (local41 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray2, local30, local41);
				} catch (@Pc(65) IOException local65) {
					this.aBoolean52 = true;
				}
				this.anInt205 = (this.anInt205 + local41) % 5000;
				try {
					if (this.anInt206 == this.anInt205) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(86) IOException local86) {
					this.aBoolean52 = true;
				}
			}
		}
		System.out.println("clientstream writer stopping");
	}
}
