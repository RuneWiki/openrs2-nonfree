import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class10 implements Runnable {

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "Lclient!wu;")
	private Class394 aClass394_1;

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "[Lclient!kp;")
	private final Class4_Sub29[] aClass4_Sub29Array1 = new Class4_Sub29[8];

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "Z")
	private volatile boolean aBoolean11 = true;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "Z")
	private volatile boolean aBoolean13 = true;

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "[I")
	private final int[] anIntArray11 = new int[3];

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "Z")
	private volatile boolean aBoolean12 = false;

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
	private final int anInt164;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "Lclient!ha;")
	private final Class33 aClass33_2;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		this.anInt164 = arg0;
		this.aClass33_2 = arg1;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "()V")
	public void method194() {
		this.aBoolean11 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "()V")
	private void method195() {
		this.aClass33_2.method8109(this.anInt164);
		while (!this.aBoolean11 && this.aBoolean13) {
			if (this.aClass394_1 == null || this.aClass394_1.method8973()) {
				this.aBoolean12 = false;
				this.aLong6 = Static269.aClass69_1.method6856();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean12 = true;
				@Pc(21) Class3 local21 = this.aClass394_1.method8979();
				if (local21 instanceof Class3_Sub1) {
					@Pc(27) Class3_Sub1 local27 = (Class3_Sub1) local21;
					if (local27.aBoolean770) {
						local27.method8492(Static246.aClass33_6);
					} else {
						Static390.method5013(local27, this.aClass4_Sub29Array1);
						if (Static436.aClass56_14 != null) {
							Static436.aClass56_14.method8052(local27.anInt9921, this.aClass394_1.aString125, local27.anInt9914, -256, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class3_Sub8) local21).anInt9906;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class42 local70 = Static140.aClass42Array4[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static112.anInt2200 + Static112.anInt2200; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static112.anInt2200 + Static112.anInt2200; local75++) {
								if (Static444.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static323.anInt5049 + local72 - Static112.anInt2200;
									@Pc(98) int local98 = Static417.anInt6041 + local75 - Static112.anInt2200;
									if (local92 >= 0 && local92 < local70.anInt8638 && local98 >= 0 && local98 < local70.anInt8630) {
										Static246.aClass33_6.H(local92 << Static273.anInt4424, local70.method7450(local98, local92), local98 << Static273.anInt4424, this.anIntArray11);
										if (Static664.method8791(this.anIntArray11[0]) == this.anInt164 - 1) {
											local70.method7449(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass33_2.method8087(this.anInt164);
		while (this.aBoolean11 && this.aBoolean13) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "()Z")
	public boolean method196() {
		return this.aClass394_1 == null || !this.aBoolean12 && this.aClass394_1.method8973();
	}

	@OriginalMember(owner = "client!afa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean13) {
			this.method195();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!wu;)V")
	public void method197(@OriginalArg(0) Class394 arg0) {
		if (this.aClass394_1 != null) {
			this.aClass394_1.method8976((Class10) null);
		}
		this.aClass394_1 = arg0;
		if (this.aClass394_1 != null) {
			this.aClass394_1.method8976(this);
		}
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "()V")
	public void method198() {
		this.aBoolean11 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "()V")
	public void method199() {
		this.aBoolean11 = false;
		this.aBoolean13 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "()J")
	public long method200() {
		return this.aLong6;
	}
}
