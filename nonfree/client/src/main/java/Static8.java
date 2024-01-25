import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "Lclient!hca;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "[Lclient!te;")
	public static Class314[] aClass314Array1;

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
	public static int anInt182 = -1;

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "[I")
	public static final int[] anIntArray9 = new int[14];

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(JI)V")
	public static void method155(@OriginalArg(0) long arg0) {
		if (Static60.aClass53ArrayArrayArray1 != null) {
			if (Static166.anInt3419 == 1 || Static166.anInt3419 == 5) {
				Static185.method3293(arg0);
			} else if (Static166.anInt3419 == 4) {
				Static282.method4068(arg0);
			}
		}
		Static200.method3417((long) Static106.anInt2418, Static440.aClass44_12);
		if (Static332.anInt6370 != -1) {
			Static26.method343(Static332.anInt6370);
		}
		for (@Pc(39) int local39 = 0; local39 < Static68.anInt1112; local39++) {
			if (Static261.aBooleanArray18[local39]) {
				Static250.aBooleanArray13[local39] = true;
			}
			Static222.aBooleanArray9[local39] = Static261.aBooleanArray18[local39];
			Static261.aBooleanArray18[local39] = false;
		}
		Static47.anInt643 = Static106.anInt2418;
		if (Static332.anInt6370 != -1) {
			Static68.anInt1112 = 0;
			Static329.method5382();
		}
		Static440.aClass44_12.JA();
		Static59.method990(Static440.aClass44_12);
		@Pc(82) int local82 = Static142.method2738();
		if (local82 == -1) {
			local82 = Static180.anInt3622;
		}
		if (local82 == -1) {
			local82 = Static535.anInt9525;
		}
		Static483.method7218(local82);
		@Pc(101) int local101 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() << 8;
		Static437.method6785(Static356.anInt6930, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 + local101, local101 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126);
		Static356.anInt6930 = 0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZI)Z")
	public static boolean method156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static554.method8025(arg1, arg0) || Static401.method6308(arg0, arg1);
	}
}
