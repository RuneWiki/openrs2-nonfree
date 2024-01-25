import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class395 implements Runnable {

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	private int anInt10816 = 0;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	private int anInt10820 = 0;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	private final int anInt10817;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "[B")
	private final byte[] aByteArray108;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class395(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt10817 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray108 = new byte[this.anInt10817];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public void method9166() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z")
	public boolean method9167(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt10817 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(43) int local43;
			if (this.anInt10816 > this.anInt10820) {
				local43 = this.anInt10820 + this.anInt10817 - this.anInt10816;
			} else {
				local43 = this.anInt10820 - this.anInt10816;
			}
			if (arg0 <= local43) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II[BI)I")
	public int method9168(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg0 + arg2 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(47) int local47;
			if (this.anInt10820 < this.anInt10816) {
				local47 = this.anInt10817 + this.anInt10820 - this.anInt10816;
			} else {
				local47 = this.anInt10820 - this.anInt10816;
			}
			if (local47 < arg2) {
				arg2 = local47;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt10817 < this.anInt10816 + arg2) {
				@Pc(85) int local85 = this.anInt10817 - this.anInt10816;
				Static679.method1563(this.aByteArray108, this.anInt10816, arg1, arg0, local85);
				Static679.method1563(this.aByteArray108, 0, arg1, local85 + arg0, -local85 + arg2);
			} else {
				Static679.method1563(this.aByteArray108, this.anInt10816, arg1, arg0, arg2);
			}
			this.anInt10816 = (this.anInt10816 + arg2) % this.anInt10817;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!wv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10816 == 0) {
						local27 = this.anInt10817 - this.anInt10820 - 1;
					} else if (this.anInt10820 <= this.anInt10816) {
						local27 = this.anInt10816 - this.anInt10820 - 1;
					} else {
						local27 = this.anInt10817 - this.anInt10820;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(56) InterruptedException local56) {
					}
				}
			}
			@Pc(73) int local73;
			try {
				local73 = this.anInputStream2.read(this.aByteArray108, this.anInt10820, local27);
				if (local73 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(81) IOException local81) {
				@Pc(81) IOException local81x = local81;
				synchronized (this) {
					this.anIOException2 = local81x;
					return;
				}
			}
			synchronized (this) {
				this.anInt10820 = (local73 + this.anInt10820) % this.anInt10817;
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public void method9170() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}
}
