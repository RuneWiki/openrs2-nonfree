import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class80 implements Runnable {

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!kea;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
	private final int[] anIntArray94 = new int[3];

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "[Lclient!tw;")
	private final Class1_Sub24[] aClass1_Sub24Array3 = new Class1_Sub24[8];

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "Z")
	private volatile boolean aBoolean185 = true;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Z")
	private volatile boolean aBoolean186 = true;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
	private volatile boolean aBoolean184 = false;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	private final int anInt2455;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Lclient!r;")
	private final Class78 aClass78_45;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1) {
		this.anInt2455 = arg0;
		this.aClass78_45 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!kea;)V")
	public void method2143(@OriginalArg(0) Class187 arg0) {
		if (this.aClass187_1 != null) {
			this.aClass187_1.method3891(null);
		}
		this.aClass187_1 = arg0;
		if (this.aClass187_1 != null) {
			this.aClass187_1.method3891(this);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	public void method2144() {
		this.aBoolean185 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()V")
	private void method2145() {
		this.aClass78_45.method6849(this.anInt2455);
		while (!this.aBoolean185 && this.aBoolean186) {
			if (this.aClass187_1 == null || this.aClass187_1.method3888()) {
				this.aBoolean184 = false;
				this.aLong64 = Static183.aClass210_1.method6281();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean184 = true;
				@Pc(21) Class11 local21 = this.aClass187_1.method3890();
				if (local21 instanceof Class11_Sub1) {
					@Pc(27) Class11_Sub1 local27 = (Class11_Sub1) local21;
					if (local27.aBoolean666) {
						local27.method7206(Static458.aClass78_153);
					} else {
						Static426.method6096(local27, this.aClass1_Sub24Array3);
						if (Static120.aClass96_7 != null) {
							Static120.aClass96_7.method7257(this.aClass187_1.aString54, local27.anInt8900, -256, local27.anInt8909, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class11_Sub7) local21).anInt4785;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class129 local70 = Static310.aClass129Array5[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static548.anInt9156 + Static548.anInt9156; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static548.anInt9156 + Static548.anInt9156; local75++) {
								if (Static288.aBooleanArrayArrayArray4[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static115.anInt1985 + local72 - Static548.anInt9156;
									@Pc(98) int local98 = Static326.anInt4975 + local75 - Static548.anInt9156;
									if (local92 >= 0 && local92 < local70.anInt8065 && local98 >= 0 && local98 < local70.anInt8058) {
										Static458.aClass78_153.MA(local92 << Static166.anInt7796, local70.method6481(local98, local92), local98 << Static166.anInt7796, this.anIntArray94);
										if (Static310.method4636(this.anIntArray94[0]) == this.anInt2455 - 1) {
											local70.method6475(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass78_45.method6785(this.anInt2455);
		while (this.aBoolean185 && this.aBoolean186) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
	public void method2146() {
		this.aBoolean185 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()J")
	public long method2147() {
		return this.aLong64;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "()Z")
	public boolean method2148() {
		return this.aClass187_1 == null || !this.aBoolean184 && this.aClass187_1.method3888();
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "()V")
	public void method2149() {
		this.aBoolean185 = false;
		this.aBoolean186 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ei", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean186) {
			this.method2145();
		}
	}
}
