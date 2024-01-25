import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	private int anInt127 = 0;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private int anInt133 = 0;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	private final int anInt128;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		for (@Pc(9) int local9 = 0; local9 < 26; local9++) {
			aCharArray1[local9] = (char) (local9 + 65);
		}
		for (@Pc(25) int local25 = 26; local25 < 52; local25++) {
			aCharArray1[local25] = (char) (local25 + 97 - 26);
		}
		for (@Pc(41) int local41 = 52; local41 < 62; local41++) {
			aCharArray1[local41] = (char) (local41 + 48 - 52);
		}
		aCharArray1[63] = '/';
		aCharArray1[62] = '+';
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class7(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt128 = arg1 + 1;
		this.aByteArray1 = new byte[this.anInt128];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BIIZ)V")
	public void method123(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(55) int local55;
			if (this.anInt133 > this.anInt127) {
				local55 = this.anInt133 - this.anInt127 - 1;
			} else {
				local55 = this.anInt128 + this.anInt133 - this.anInt127 - 1;
			}
			if (local55 < arg1) {
				throw new IOException("");
			}
			if (arg1 + this.anInt127 <= this.anInt128) {
				Static604.method5910(arg0, 0, this.aByteArray1, this.anInt127, arg1);
			} else {
				@Pc(104) int local104 = this.anInt128 - this.anInt127;
				Static604.method5910(arg0, 0, this.aByteArray1, this.anInt127, local104);
				Static604.method5910(arg0, local104, this.aByteArray1, 0, arg1 - local104);
			}
			this.anInt127 = (this.anInt127 + arg1) % this.anInt128;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public void method124() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
	public void method125() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(36) InterruptedException local36) {
		}
	}

	@OriginalMember(owner = "client!af", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt127 >= this.anInt133) {
						local31 = this.anInt127 - this.anInt133;
					} else {
						local31 = this.anInt128 + this.anInt127 - this.anInt133;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(52) InterruptedException local52) {
					}
				}
			}
			try {
				if (this.anInt133 + local31 > this.anInt128) {
					@Pc(74) int local74 = this.anInt128 - this.anInt133;
					this.anOutputStream1.write(this.aByteArray1, this.anInt133, local74);
					this.anOutputStream1.write(this.aByteArray1, 0, local31 - local74);
				} else {
					this.anOutputStream1.write(this.aByteArray1, this.anInt133, local31);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException1 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt133 = (this.anInt133 + local31) % this.anInt128;
			}
		}
	}
}
