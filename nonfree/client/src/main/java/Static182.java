import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!fla", name = "g", descriptor = "I")
	public static int anInt3160;

	@OriginalMember(owner = "client!fla", name = "i", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(II)V")
	public static void method2885(@OriginalArg(0) int arg0) {
		Static701.anInt10939 = arg0;
		Static164.aClass307_40.method7006();
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2886(@OriginalArg(0) Class22 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static347.aBoolean360) {
			local7 = Static308.method4570();
			local9 = Static541.method7180();
		}
		Static170.method2745(Static284.anInt4357, local9 + Static177.anInt3132, Static123.anInt2492 - -local7, Static332.anInt5338, arg0);
		Static561.aClass57_10.method9131(-1, local9 + Static177.anInt3132 + 14, -10660793, Static123.anInt2492 + 3 + local7, Static430.aClass257_24.method5699(Static456.anInt7118));
		@Pc(58) int local58 = Static334.aClass18_1.method4192() + local7;
		@Pc(66) int local66 = local9 + Static334.aClass18_1.method4196();
		@Pc(70) int local70;
		@Pc(94) int local94;
		if (Static228.aBoolean744) {
			local70 = 0;
			for (@Pc(130) Class3_Sub7_Sub5 local130 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local130 != null; local130 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
				local94 = local70 * 16 + local9 + Static177.anInt3132 + 31;
				local70++;
				if (local130.anInt2315 == 1) {
					Static695.method6730(-1, (Class3_Sub7_Sub10) local130.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67, Static284.anInt4357, local9 + Static177.anInt3132, local66, local58, Static123.anInt2492 + local7, arg0, -256, Static332.anInt5338, local94);
				} else {
					Static435.method5754(local58, local66, Static284.anInt4357, local94, arg0, local130, Static123.anInt2492 + local7, local9 + Static177.anInt3132, Static332.anInt5338, -256, -1);
				}
			}
			if (Static15.aClass3_Sub7_Sub5_1 != null) {
				Static170.method2745(Static558.anInt8545, Static225.anInt3682, Static440.anInt6770, Static331.anInt5337, arg0);
				local70 = 0;
				Static561.aClass57_10.method9131(-1, Static225.anInt3682 + 14, -10660793, Static440.anInt6770 + 3, Static15.aClass3_Sub7_Sub5_1.aString40);
				for (@Pc(234) Class3_Sub7_Sub10 local234 = (Class3_Sub7_Sub10) Static15.aClass3_Sub7_Sub5_1.aClass147_1.method3334(); local234 != null; local234 = (Class3_Sub7_Sub10) Static15.aClass3_Sub7_Sub5_1.aClass147_1.method3332()) {
					@Pc(247) int local247 = Static225.anInt3682 + local70 * 16 + 31;
					Static695.method6730(-1, local234, Static558.anInt8545, Static225.anInt3682, local66, local58, Static440.anInt6770, arg0, -256, Static331.anInt5337, local247);
					local70++;
				}
				Static630.method8287(Static331.anInt5337, Static558.anInt8545, Static225.anInt3682, Static440.anInt6770);
			}
		} else {
			local70 = 0;
			for (@Pc(77) Class3_Sub7_Sub10 local77 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local77 != null; local77 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
				local94 = (Static716.anInt11158 - local70 - 1) * 16 + local9 + Static177.anInt3132 + 31;
				local70++;
				Static695.method6730(-1, local77, Static284.anInt4357, Static177.anInt3132 + local9, local66, local58, Static123.anInt2492 + local7, arg0, -256, Static332.anInt5338, local94);
			}
		}
		Static630.method8287(Static332.anInt5338, Static284.anInt4357, Static177.anInt3132 + local9, local7 + Static123.anInt2492);
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(II)Z")
	public static boolean method2887(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
