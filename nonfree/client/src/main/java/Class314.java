import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class314 implements Runnable {

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "[C")
	private static final char[] aCharArray50 = new char[64];

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	private int anInt9054 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	private int anInt9053 = 0;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	private final int anInt9061;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "[B")
	private final byte[] aByteArray125;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	static {
		for (@Pc(12) int local12 = 0; local12 < 26; local12++) {
			aCharArray50[local12] = (char) (local12 + 65);
		}
		for (@Pc(26) int local26 = 26; local26 < 52; local26++) {
			aCharArray50[local26] = (char) (local26 + 97 - 26);
		}
		for (@Pc(42) int local42 = 52; local42 < 62; local42++) {
			aCharArray50[local42] = (char) (local42 + 48 - 52);
		}
		aCharArray50[62] = '+';
		aCharArray50[63] = '/';
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class314(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt9061 = arg1 + 1;
		this.aByteArray125 = new byte[this.anInt9061];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public void method7443() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!wl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(37) int local37;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9054 == 0) {
						local37 = this.anInt9061 - this.anInt9053 - 1;
					} else if (this.anInt9053 > this.anInt9054) {
						local37 = this.anInt9061 - this.anInt9053;
					} else {
						local37 = this.anInt9054 - this.anInt9053 - 1;
					}
					if (local37 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(68) InterruptedException local68) {
					}
				}
			}
			@Pc(85) int local85;
			try {
				local85 = this.anInputStream2.read(this.aByteArray125, this.anInt9053, local37);
				if (local85 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(94) IOException local94) {
				@Pc(94) IOException local94x = local94;
				synchronized (this) {
					this.anIOException2 = local94x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9053 = (local85 + this.anInt9053) % this.anInt9061;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Z")
	public boolean method7448(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt9061 <= arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(39) int local39;
			if (this.anInt9053 < this.anInt9054) {
				local39 = this.anInt9053 + this.anInt9061 - this.anInt9054;
			} else {
				local39 = this.anInt9053 - this.anInt9054;
			}
			if (local39 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public void method7449() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([BBII)I")
	public int method7450(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(35) int local35;
			if (this.anInt9053 >= this.anInt9054) {
				local35 = this.anInt9053 - this.anInt9054;
			} else {
				local35 = this.anInt9061 + this.anInt9053 - this.anInt9054;
			}
			if (arg2 > local35) {
				arg2 = local35;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt9061 >= arg2 + this.anInt9054) {
				Static551.method3488(this.aByteArray125, this.anInt9054, arg0, arg1, arg2);
			} else {
				@Pc(99) int local99 = this.anInt9061 - this.anInt9054;
				Static551.method3488(this.aByteArray125, this.anInt9054, arg0, arg1, local99);
				Static551.method3488(this.aByteArray125, 0, arg0, arg1 + local99, -local99 + arg2);
			}
			this.anInt9054 = (this.anInt9054 + arg2) % this.anInt9061;
			this.notifyAll();
			return arg2;
		}
	}
}
