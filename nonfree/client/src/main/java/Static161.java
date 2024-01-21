import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
	public static int anInt4013;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "J")
	public static long aLong131;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	public static int anInt4012 = 0;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1091 = Static158.method3034("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1092 = Static158.method3034("Hidden");

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1093 = aClass60_1092;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "[I")
	public static final int[] anIntArray443 = new int[50];

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1094 = Static158.method3034("");

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1095 = Static158.method3034("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method3038() {
		for (@Pc(15) int local15 = 0; local15 < Static174.anInt4255; local15++) {
			@Pc(21) int local21 = Static180.anIntArray370[local15];
			@Pc(25) Class2_Sub1_Sub1_Sub3_Sub2 local25 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local21];
			if (local25 != null) {
				Static94.method2239(local25, local25.aClass2_Sub1_Sub2_1.anInt343);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public static void method3039() {
		@Pc(3) Class82 local3 = Static134.aClass82_1;
		synchronized (Static134.aClass82_1) {
			Static66.anInt2048++;
			Static119.anInt3313 = Static76.anInt2320;
			@Pc(28) int local28;
			if (Static148.anInt3847 >= 0) {
				while (Static148.anInt3847 != Static96.anInt3101) {
					local28 = Static164.anIntArray451[Static96.anInt3101];
					Static96.anInt3101 = Static96.anInt3101 + 1 & 0x7F;
					if (local28 < 0) {
						Static57.aBooleanArray7[~local28] = false;
					} else {
						Static57.aBooleanArray7[local28] = true;
					}
				}
			} else {
				for (local28 = 0; local28 < 112; local28++) {
					Static57.aBooleanArray7[local28] = false;
				}
				Static148.anInt3847 = Static96.anInt3101;
			}
			Static76.anInt2320 = Static134.anInt3575;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!ud;)V")
	public static void method3041(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt3295 == Static20.anInt580 || arg0.anInt3270 == -1 || arg0.anInt3280 != 0 || arg0.anInt3261 + 1 > Static103.method2357(arg0.anInt3270).anIntArray83[arg0.anInt3290]) {
			@Pc(34) int local34 = arg0.anInt3295 - arg0.anInt3263;
			@Pc(40) int local40 = Static20.anInt580 - arg0.anInt3263;
			@Pc(50) int local50 = arg0.anInt3286 * 64 + arg0.anInt3298 * 128;
			@Pc(60) int local60 = arg0.anInt3271 * 128 + arg0.anInt3286 * 64;
			@Pc(71) int local71 = arg0.anInt3257 * 128 + arg0.anInt3286 * 64;
			@Pc(82) int local82 = arg0.anInt3287 * 128 + arg0.anInt3286 * 64;
			arg0.anInt3302 = ((local34 - local40) * local50 + local40 * local60) / local34;
			arg0.anInt3273 = ((local34 - local40) * local71 + local82 * local40) / local34;
		}
		if (arg0.anInt3267 == 0) {
			arg0.anInt3255 = 1024;
		}
		if (arg0.anInt3267 == 1) {
			arg0.anInt3255 = 1536;
		}
		if (arg0.anInt3267 == 2) {
			arg0.anInt3255 = 0;
		}
		if (arg0.anInt3267 == 3) {
			arg0.anInt3255 = 512;
		}
		arg0.anInt3265 = arg0.anInt3255;
		arg0.anInt3275 = 0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)Z")
	public static boolean method3042(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
