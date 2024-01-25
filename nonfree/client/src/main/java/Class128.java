import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class128 implements Runnable {

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Lclient!su;")
	private Class318 aClass318_1;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "[Lclient!tg;")
	private final Class2_Sub11[] aClass2_Sub11Array1 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Z")
	private volatile boolean aBoolean189 = true;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "[I")
	private final int[] anIntArray221 = new int[3];

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "Z")
	private volatile boolean aBoolean191 = true;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "Z")
	private volatile boolean aBoolean190 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
	private final int anInt2678;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Lclient!r;")
	private final Class162 aClass162_7;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1) {
		this.anInt2678 = arg0;
		this.aClass162_7 = arg1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()Z")
	public boolean method2300() {
		return this.aClass318_1 == null || !this.aBoolean190 && this.aClass318_1.method6442();
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "()V")
	public void method2301() {
		this.aBoolean189 = false;
		this.aBoolean191 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "()V")
	private void method2302() {
		this.aClass162_7.method6850(this.anInt2678);
		while (!this.aBoolean189 && this.aBoolean191) {
			if (this.aClass318_1 == null || this.aClass318_1.method6442()) {
				this.aBoolean190 = false;
				this.aLong78 = Static539.aClass139_1.method7431();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean190 = true;
				@Pc(21) Class12 local21 = this.aClass318_1.method6443();
				if (local21 instanceof Class12_Sub2) {
					@Pc(27) Class12_Sub2 local27 = (Class12_Sub2) local21;
					if (local27.aBoolean781) {
						local27.method7498(Static337.aClass162_13);
					} else {
						Static390.method5390(local27, this.aClass2_Sub11Array1);
						if (Static562.aClass37_19 != null) {
							Static562.aClass37_19.method7723(local27.anInt9378, this.aClass318_1.aString122, -256, local27.anInt9381, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class12_Sub8) local21).anInt7417;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class151 local70 = Static114.aClass151Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static351.anInt6012 + Static351.anInt6012; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static351.anInt6012 + Static351.anInt6012; local75++) {
								if (Static362.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static258.anInt4281 + local72 - Static351.anInt6012;
									@Pc(98) int local98 = Static505.anInt8016 + local75 - Static351.anInt6012;
									if (local92 >= 0 && local92 < local70.anInt9572 && local98 >= 0 && local98 < local70.anInt9574) {
										Static337.aClass162_13.MA(local92 << Static562.anInt9207, local70.method7676(local98, local92), local98 << Static562.anInt9207, this.anIntArray221);
										if (Static141.method1948(this.anIntArray221[0]) == this.anInt2678 - 1) {
											local70.method7682(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass162_7.method6830(this.anInt2678);
		while (this.aBoolean189 && this.aBoolean191) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "()V")
	public void method2303() {
		this.aBoolean189 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "()J")
	public long method2304() {
		return this.aLong78;
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "()V")
	public void method2305() {
		this.aBoolean189 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!su;)V")
	public void method2306(@OriginalArg(0) Class318 arg0) {
		if (this.aClass318_1 != null) {
			this.aClass318_1.method6438(null);
		}
		this.aClass318_1 = arg0;
		if (this.aClass318_1 != null) {
			this.aClass318_1.method6438(this);
		}
	}

	@OriginalMember(owner = "client!gq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean191) {
			this.method2302();
		}
	}
}
