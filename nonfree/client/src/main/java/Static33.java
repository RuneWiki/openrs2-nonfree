import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "J")
	public static long aLong30;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Z")
	public static boolean aBoolean26;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt889;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array3;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_365 = Static121.method2047("");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_361 = aClass60_365;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_362 = aClass60_365;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_363 = Static121.method2047(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_364 = aClass60_365;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "[Lclient!hb;")
	public static Class29[] aClass29Array1 = new Class29[16];

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_366 = Static121.method2047("(U4");

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_367 = Static121.method2047("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_368 = aClass60_365;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_369 = aClass60_365;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_370 = Static121.method2047("titlebutton");

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Lclient!qc;")
	public static Class60 aClass60_371 = aClass60_365;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!wa;)V")
	public static void method612(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub4_Sub1_Sub2 arg1) {
		if (arg1.anInt2597 > Static81.anInt1944) {
			Static88.method1522(arg1);
		} else if (Static81.anInt1944 > arg1.anInt2618) {
			Static13.method280(arg1);
		} else {
			Static111.method1900(arg1);
		}
		if (arg1.anInt2620 < 128 || arg1.anInt2601 < 128 || arg1.anInt2620 >= 13184 || arg1.anInt2601 >= 13184) {
			arg1.anInt2618 = 0;
			arg1.anInt2630 = -1;
			arg1.anInt2633 = -1;
			arg1.anInt2601 = arg1.anIntArray288[0] * 128 + arg1.anInt2612 * 64;
			arg1.anInt2597 = 0;
			arg1.anInt2620 = arg1.anIntArray286[0] * 128 + arg1.anInt2612 * 64;
			arg1.method1883();
		}
		if (arg1 == Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1 && (arg1.anInt2620 < 1536 || arg1.anInt2601 < 1536 || arg1.anInt2620 >= 11776 || arg1.anInt2601 >= 11776)) {
			arg1.anInt2633 = -1;
			arg1.anInt2601 = arg1.anInt2612 * 64 + arg1.anIntArray288[0] * 128;
			arg1.anInt2618 = 0;
			arg1.anInt2630 = -1;
			arg1.anInt2597 = 0;
			arg1.anInt2620 = arg1.anInt2612 * 64 + arg1.anIntArray286[0] * 128;
			arg1.method1883();
		}
		Static90.method1547(arg1);
		Static31.method598(arg1);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)Lclient!qc;")
	public static Class60 method613(@OriginalArg(0) int arg0) {
		@Pc(12) Class60 local12 = new Class60();
		local12.anInt2310 = 0;
		local12.aByteArray89 = new byte[arg0];
		return local12;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method614() {
		aClass60_368 = null;
		aClass60_361 = null;
		aClass60_365 = null;
		aClass60_371 = null;
		aClass60_366 = null;
		aClass60_369 = null;
		aClass60_364 = null;
		aClass29Array1 = null;
		aClass60_367 = null;
		aClass60_363 = null;
		aClass60_370 = null;
		aClass60_362 = null;
		aClass4_Sub4_Sub3_Sub1Array3 = null;
	}
}
