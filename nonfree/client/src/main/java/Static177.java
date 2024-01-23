import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!km;")
	public static Class91 aClass91_143;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "[Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2[] aClass1_Sub2_Sub11_Sub2Array2;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "Lclient!ue;")
	public static Class162 aClass162_3;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	public static int anInt3741 = 64;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public static void method2997() {
		Static283.aClass1_Sub11_Sub1_3.method2697(76);
		Static283.aClass1_Sub11_Sub1_3.method2673(0L);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method2999() {
		if (Static142.anInt3051 == -1 || Static190.anInt3922 == -1) {
			return;
		}
		@Pc(22) int local22 = Static296.anInt5589 + (Static291.anInt5519 * (Static267.anInt5214 - Static296.anInt5589) >> 16);
		@Pc(25) float[] local25 = new float[3];
		Static291.anInt5519 += local22;
		if (Static291.anInt5519 < 65535) {
			Static154.aBoolean241 = false;
			Static238.aBoolean292 = false;
		} else {
			if (Static238.aBoolean292) {
				Static154.aBoolean241 = false;
			} else {
				Static154.aBoolean241 = true;
			}
			Static291.anInt5519 = 65535;
			Static238.aBoolean292 = true;
		}
		@Pc(56) int local56 = Static72.anInt1527 * 2;
		@Pc(61) float local61 = (float) Static291.anInt5519 / 65535.0F;
		@Pc(111) int local111;
		@Pc(131) int local131;
		@Pc(101) int local101;
		@Pc(119) int local119;
		@Pc(161) int local161;
		@Pc(140) int local140;
		@Pc(156) int local156;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			local101 = (Static232.anIntArrayArrayArray11[Static142.anInt3051][local56 + 2][local63] + Static232.anIntArrayArrayArray11[Static142.anInt3051][local56 + 2][local63] - Static232.anIntArrayArrayArray11[Static142.anInt3051][local56 + 3][local63]) * 3;
			local111 = Static232.anIntArrayArrayArray11[Static142.anInt3051][local56][local63] * 3;
			local119 = Static232.anIntArrayArrayArray11[Static142.anInt3051][local56][local63];
			local131 = Static232.anIntArrayArrayArray11[Static142.anInt3051][local56 + 1][local63] * 3;
			local140 = local101 + local111 - local131 * 2;
			local156 = local131 + Static232.anIntArrayArrayArray11[Static142.anInt3051][local56 + 2][local63] - local119 - local101;
			local161 = local131 - local111;
			local25[local63] = local61 * ((float) local161 + (local61 * (float) local156 + (float) local140) * local61) + (float) local119;
		}
		Static297.anInt5618 = (int) local25[1] * -1;
		Static69.anInt1504 = (int) local25[0] - Static53.anInt5288 * 128;
		Static239.anInt4738 = (int) local25[2] - Static83.anInt1875 * 128;
		@Pc(213) float[] local213 = new float[3];
		local111 = Static283.anInt5397 * 2;
		for (local131 = 0; local131 < 3; local131++) {
			local101 = Static232.anIntArrayArrayArray11[Static190.anInt3922][local111][local131] * 3;
			local119 = Static232.anIntArrayArrayArray11[Static190.anInt3922][local111 + 1][local131] * 3;
			local161 = (Static232.anIntArrayArrayArray11[Static190.anInt3922][local111 + 2][local131] + Static232.anIntArrayArrayArray11[Static190.anInt3922][local111 + 2][local131] - Static232.anIntArrayArrayArray11[Static190.anInt3922][local111 + 3][local131]) * 3;
			local140 = Static232.anIntArrayArrayArray11[Static190.anInt3922][local111][local131];
			@Pc(295) int local295 = local161 + local101 - local119 * 2;
			@Pc(312) int local312 = local119 + Static232.anIntArrayArrayArray11[Static190.anInt3922][local111 + 2][local131] - local140 - local161;
			local156 = local119 - local101;
			local213[local131] = (float) local140 + local61 * ((float) local156 + ((float) local312 * local61 + (float) local295) * local61);
		}
		@Pc(349) float local349 = local213[0] - local25[0];
		@Pc(360) float local360 = (local213[1] - local25[1]) * -1.0F;
		@Pc(368) float local368 = local213[2] - local25[2];
		@Pc(378) double local378 = Math.sqrt((double) (local368 * local368 + local349 * local349));
		Static149.aFloat33 = (float) Math.atan2((double) local360, local378);
		Static139.aFloat25 = -((float) Math.atan2((double) local349, (double) local368));
		Static134.anInt2950 = (int) ((double) Static149.aFloat33 * 325.949D) & 0x7FF;
		Static91.anInt2040 = (int) ((double) Static139.aFloat25 * 325.949D) & 0x7FF;
	}
}
