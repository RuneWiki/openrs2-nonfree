import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!op", name = "F", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!op", name = "G", descriptor = "Lclient!qn;")
	public static Class211 aClass211_72;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_13 = new Class43("", 17);

	@OriginalMember(owner = "client!op", name = "D", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_65 = new Class146(4, 2);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method3797(@OriginalArg(1) Class135 arg0) {
		if (Static351.anInt5841 < 2 && !Static70.aBoolean94 || Static11.aClass110_1 != null) {
			return;
		}
		@Pc(46) String local46;
		if (Static70.aBoolean94 && Static351.anInt5841 < 2) {
			local46 = Static304.aString54 + Static210.aClass15_57.method180(Static429.anInt6999) + Static368.aString66 + " ->";
		} else if (Static196.aBoolean269 && Static180.aClass107_1.method2003(81) && Static351.anInt5841 > 2) {
			local46 = Static156.method2205((Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262.aClass4_262);
		} else {
			@Pc(75) Class4_Sub30 local75 = (Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262;
			local46 = Static156.method2205(local75);
			@Pc(81) int[] local81 = null;
			if (Static176.method2473(local75.anInt4615)) {
				local81 = Static416.aClass64_2.method1372((int) local75.aLong136).anIntArray153;
			} else if (local75.anInt4620 != -1) {
				local81 = Static416.aClass64_2.method1372(local75.anInt4620).anIntArray153;
			} else if (Static418.method5662(local75.anInt4615)) {
				@Pc(119) Class8_Sub3_Sub1_Sub2 local119 = Static367.aClass8_Sub3_Sub1_Sub2Array1[(int) local75.aLong136];
				if (local119 != null) {
					@Pc(124) Class78 local124 = local119.aClass78_1;
					if (local124.anIntArray145 != null) {
						local124 = local124.method1547(Static52.aClass81_1);
					}
					if (local124 != null) {
						local81 = local124.anIntArray146;
					}
				}
			} else if (Static100.method1513(local75.anInt4615)) {
				@Pc(158) Class114 local158;
				if (local75.anInt4615 == 1004) {
					local158 = Static51.aClass151_1.method2917((int) local75.aLong136);
				} else {
					local158 = Static51.aClass151_1.method2917((int) (local75.aLong136 >>> 32 & 0x7FFFFFFFL));
				}
				if (local158.anIntArray235 != null) {
					local158 = local158.method2181(Static52.aClass81_1);
				}
				if (local158 != null) {
					local81 = local158.anIntArray233;
				}
			}
			if (local81 != null) {
				local46 = local46 + Static24.method335(local81);
			}
		}
		if (Static351.anInt5841 > 2) {
			local46 = local46 + "<col=ffffff> / " + (Static351.anInt5841 - 2) + Static343.aClass15_103.method180(Static429.anInt6999);
		}
		if (Static286.aClass110_13 != null) {
			@Pc(260) Class123 local260 = Static286.aClass110_13.method2057(arg0);
			if (local260 == null) {
				local260 = Static49.aClass123_1;
			}
			local260.method5791(Static226.anIntArray283, Static175.anInt3189, Static286.aClass110_13.anInt2631, Static340.anIntArray443, Static243.aClass95Array8, Static198.anInt5149, local46, Static286.aClass110_13.anInt2592, Static370.aRandom1, Static286.aClass110_13.anInt2590, Static246.anInt4070, Static286.aClass110_13.anInt2661, Static286.aClass110_13.anInt2665, Static286.aClass110_13.anInt2617);
			Static204.method2868(Static340.anIntArray443[3], Static340.anIntArray443[0], Static340.anIntArray443[1], Static340.anIntArray443[2]);
		} else if (Static245.aClass110_10 != null && Static231.aClass6_7 == Static43.aClass6_6) {
			@Pc(241) int local241 = Static49.aClass123_1.method5798(Static226.anIntArray283, Static198.anInt5149, Static370.aRandom1, Static268.anInt4434 + 16, local46, Static243.aClass95Array8, Static130.anInt2342 + 4);
			Static204.method2868(16, Static130.anInt2342 + 4, Static268.anInt4434, Static363.aClass158_11.method3038(local46) + local241);
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I[Lclient!hd;IIZI)V")
	public static void method3801(@OriginalArg(0) int arg0, @OriginalArg(1) Class110[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class110 local13 = arg1[local7];
			if (local13 != null && local13.anInt2649 == arg4) {
				Static115.method1686(arg2, local13, arg3, arg0);
				Static31.method432(arg0, local13, arg2);
				if (local13.anInt2634 - local13.anInt2617 < local13.anInt2630) {
					local13.anInt2630 = local13.anInt2634 - local13.anInt2617;
				}
				if (local13.anInt2642 > local13.anInt2596 - local13.anInt2590) {
					local13.anInt2642 = local13.anInt2596 - local13.anInt2590;
				}
				if (local13.anInt2630 < 0) {
					local13.anInt2630 = 0;
				}
				if (local13.anInt2642 < 0) {
					local13.anInt2642 = 0;
				}
				if (local13.anInt2627 == 0) {
					Static453.method6005(local13, arg3);
				}
			}
		}
	}
}
