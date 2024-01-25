import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class258 implements Runnable {

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
	private int anInt7687 = 0;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
	private int anInt7688 = 0;

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
	private final int anInt7682;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!pda", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class258(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt7682 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray83 = new byte[this.anInt7682];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
	public void method6661() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!pda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt7687 == 0) {
						local26 = this.anInt7682 - this.anInt7688 - 1;
					} else if (this.anInt7688 > this.anInt7687) {
						local26 = this.anInt7682 - this.anInt7688;
					} else {
						local26 = this.anInt7687 - this.anInt7688 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(60) InterruptedException local60) {
					}
				}
			}
			@Pc(77) int local77;
			try {
				local77 = this.anInputStream1.read(this.aByteArray83, this.anInt7688, local26);
				if (local77 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException1 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt7688 = (this.anInt7688 + local77) % this.anInt7682;
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)V")
	public void method6662() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II[BZ)I")
	public int method6663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg2.length < arg0 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(38) int local38;
			if (this.anInt7688 < this.anInt7687) {
				local38 = this.anInt7682 + this.anInt7688 - this.anInt7687;
			} else {
				local38 = this.anInt7688 - this.anInt7687;
			}
			if (arg0 > local38) {
				arg0 = local38;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt7687 + arg0 <= this.anInt7682) {
				Static653.method6858(this.aByteArray83, this.anInt7687, arg2, arg1, arg0);
			} else {
				@Pc(108) int local108 = this.anInt7682 - this.anInt7687;
				Static653.method6858(this.aByteArray83, this.anInt7687, arg2, arg1, local108);
				Static653.method6858(this.aByteArray83, 0, arg2, arg1 + local108, arg0 - local108);
			}
			this.anInt7687 = (this.anInt7687 + arg0) % this.anInt7682;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZI)Z")
	public boolean method6664(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt7682 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt7688 >= this.anInt7687) {
				local36 = this.anInt7688 - this.anInt7687;
			} else {
				local36 = this.anInt7682 + this.anInt7688 - this.anInt7687;
			}
			if (local36 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}
}
