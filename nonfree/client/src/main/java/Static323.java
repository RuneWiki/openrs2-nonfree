import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!up", name = "v", descriptor = "I")
	public static int anInt5956;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "Lclient!dp;")
	public static Class53 aClass53_146;

	@OriginalMember(owner = "client!up", name = "B", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_102 = new Class70(8);

	@OriginalMember(owner = "client!up", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray206 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!up", name = "t", descriptor = "[I")
	public static final int[] anIntArray680 = new int[128];

	@OriginalMember(owner = "client!up", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString277 = "Opened title screen";

	@OriginalMember(owner = "client!up", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString278 = "";

	@OriginalMember(owner = "client!up", name = "z", descriptor = "I")
	public static int anInt5958 = -1;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	public static void method5374() {
		Static142.aClass6_Sub10_Sub1_3.method2887();
		@Pc(13) int local13 = Static142.aClass6_Sub10_Sub1_3.method2883(8);
		@Pc(22) int local22;
		if (Static149.anInt2759 > local13) {
			for (local22 = local13; local22 < Static149.anInt2759; local22++) {
				Static105.anIntArray264[Static162.anInt3066++] = Static191.anIntArray428[local22];
			}
		}
		if (Static149.anInt2759 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static149.anInt2759 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static191.anIntArray428[local22];
			@Pc(68) Class44_Sub4_Sub4_Sub2 local68 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local64];
			@Pc(73) int local73 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
			if (local73 == 0) {
				Static191.anIntArray428[Static149.anInt2759++] = local64;
				local68.anInt5105 = Static76.anInt2853;
			} else {
				@Pc(96) int local96 = Static142.aClass6_Sub10_Sub1_3.method2883(2);
				if (local96 == 0) {
					Static191.anIntArray428[Static149.anInt2759++] = local64;
					local68.anInt5105 = Static76.anInt2853;
					Static151.anIntArray352[Static15.anInt281++] = local64;
				} else {
					@Pc(141) int local141;
					@Pc(153) int local153;
					if (local96 == 1) {
						Static191.anIntArray428[Static149.anInt2759++] = local64;
						local68.anInt5105 = Static76.anInt2853;
						local141 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
						local68.method4705(local141, 1);
						local153 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
						if (local153 == 1) {
							Static151.anIntArray352[Static15.anInt281++] = local64;
						}
					} else if (local96 == 2) {
						Static191.anIntArray428[Static149.anInt2759++] = local64;
						local68.anInt5105 = Static76.anInt2853;
						if (Static142.aClass6_Sub10_Sub1_3.method2883(1) == 1) {
							local141 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
							local68.method4705(local141, 2);
							local153 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
							local68.method4705(local153, 2);
						} else {
							local141 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
							local68.method4705(local141, 0);
						}
						local141 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
						if (local141 == 1) {
							Static151.anIntArray352[Static15.anInt281++] = local64;
						}
					} else if (local96 == 3) {
						Static105.anIntArray264[Static162.anInt3066++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZ)V")
	public static void method5375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(14, arg0);
		local8.method2648();
		local8.anInt2511 = arg1;
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
	public static void method5376() {
		if (Static61.anInt1126 < 0) {
			Static61.anInt1126 = 0;
			Static17.anInt6198 = -1;
			Static192.anInt3645 = -1;
		}
		if (Static61.anInt1126 > Static307.anInt1202) {
			Static61.anInt1126 = Static307.anInt1202;
			Static17.anInt6198 = -1;
			Static192.anInt3645 = -1;
		}
		if (Static23.anInt371 < 0) {
			Static192.anInt3645 = -1;
			Static17.anInt6198 = -1;
			Static23.anInt371 = 0;
		}
		if (Static23.anInt371 > Static307.anInt1198) {
			Static17.anInt6198 = -1;
			Static23.anInt371 = Static307.anInt1198;
			Static192.anInt3645 = -1;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!dp;Lclient!ja;Lclient!dp;)V")
	public static void method5377(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) Class53 arg2) {
		Static139.aClass26_5 = Static61.method994(Static53.anInt1015, arg0);
		Static350.aClass30_6 = arg1.method3046(Static139.aClass26_5, Static363.method2249(arg2, Static53.anInt1015));
		Static38.aClass26_3 = Static61.method994(Static210.anInt3845, arg0);
		Static298.aClass30_4 = arg1.method3046(Static38.aClass26_3, Static363.method2249(arg2, Static210.anInt3845));
		Static220.aClass26_6 = Static61.method994(Static336.anInt6137, arg0);
		Static309.aClass30_5 = arg1.method3046(Static220.aClass26_6, Static363.method2249(arg2, Static336.anInt6137));
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg1) {
			Static300.method5155(arg2, arg0, arg6, arg3, arg4, arg1);
		} else if (arg0 - arg1 >= Static311.anInt5837 && arg0 + arg1 <= Static265.anInt4933 && Static327.anInt3039 <= arg4 - arg5 && arg5 + arg4 <= Static230.anInt4308) {
			Static74.method1301(arg3, arg5, arg1, arg4, arg0, arg2, arg6);
		} else {
			Static50.method849(arg4, arg2, arg6, arg0, arg1, arg5, arg3);
		}
	}
}
