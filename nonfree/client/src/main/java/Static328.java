import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_81;

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "Lclient!pp;")
	public static Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!naa", name = "r", descriptor = "Lclient!ts;")
	public static Class6_Sub45 aClass6_Sub45_3;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "Lclient!ca;")
	public static final Class40 aClass40_5 = new Class40();

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "[I")
	public static int[] anIntArray441 = new int[1];

	@OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
	public static final int anInt5995 = -1;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!rr;I)Lclient!rr;")
	public static Class292 method5140(@OriginalArg(0) Class292 arg0) {
		@Pc(11) Class292 local11 = Static67.method1365(arg0);
		if (local11 == null) {
			local11 = arg0.aClass292_9;
		}
		return local11;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(FZFFI)F")
	public static float method5141(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(7) float[] local7 = Static91.aFloatArrayArray1[arg3];
		return arg0 * local7[2] + arg2 * local7[1] + arg1 * local7[0];
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V")
	public static void method5144(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg0, 16);
		local8.method2580();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5145(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static231.anInt4727;
		@Pc(9) int[] local9 = Static249.anIntArray372;
		@Pc(11) boolean local11 = false;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(28) Class4_Sub1_Sub1_Sub2 local28 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local9[local20]];
			if (local28 != null && local28 != aClass4_Sub1_Sub1_Sub2_2 && local28.aString63 != null && local28.aString63.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(73) Class6_Sub31 local73;
				if (arg0 == 1) {
					local73 = Static114.method2007(Static43.aClass47_19, Static337.aClass324_1);
					local73.aClass6_Sub21_Sub2_2.method6037(local9[local20]);
					local73.aClass6_Sub21_Sub2_2.method6015(0);
					Static534.method7251(local73);
				} else if (arg0 == 4) {
					local73 = Static114.method2007(Static186.aClass47_54, Static337.aClass324_1);
					local73.aClass6_Sub21_Sub2_2.method6062(0);
					local73.aClass6_Sub21_Sub2_2.method6052(local9[local20]);
					Static534.method7251(local73);
				} else if (arg0 == 5) {
					local73 = Static114.method2007(Static14.aClass47_9, Static337.aClass324_1);
					local73.aClass6_Sub21_Sub2_2.method6062(0);
					local73.aClass6_Sub21_Sub2_2.method6052(local9[local20]);
					Static534.method7251(local73);
				} else if (arg0 == 6) {
					local73 = Static114.method2007(Static22.aClass47_67, Static337.aClass324_1);
					local73.aClass6_Sub21_Sub2_2.method6015(0);
					local73.aClass6_Sub21_Sub2_2.method6037(local9[local20]);
					Static534.method7251(local73);
				} else if (arg0 == 7) {
					local73 = Static114.method2007(Static121.aClass47_38, Static337.aClass324_1);
					local73.aClass6_Sub21_Sub2_2.method6052(local9[local20]);
					local73.aClass6_Sub21_Sub2_2.method6024(0);
					Static534.method7251(local73);
				}
				break;
			}
		}
		if (!local11) {
			Static273.method4517(Static230.aClass156_20.method4065(Static25.anInt769) + arg1);
		}
	}
}
