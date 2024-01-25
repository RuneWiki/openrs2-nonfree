import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public static int anInt5624;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "[Lclient!ya;")
	public static Class157[] aClass157Array2;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	public static int anInt5627;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Z")
	public static boolean aBoolean639 = false;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public static int anInt5623 = 0;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	public static int anInt5626 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!fq;ILclient!ug;B)V")
	public static void method4430(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub28 arg2) {
		@Pc(9) Class1_Sub20 local9 = new Class1_Sub20();
		local9.anInt2497 = arg2.method5337();
		local9.anInt2498 = arg2.method5355();
		local9.anIntArray168 = new int[local9.anInt2497];
		local9.aClass232Array1 = new Class232[local9.anInt2497];
		local9.anIntArray169 = new int[local9.anInt2497];
		local9.aClass232Array2 = new Class232[local9.anInt2497];
		local9.anIntArray170 = new int[local9.anInt2497];
		local9.aByteArrayArrayArray8 = new byte[local9.anInt2497][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2497; local56++) {
			try {
				@Pc(62) int local62 = arg2.method5337();
				@Pc(89) String local89;
				@Pc(93) String local93;
				@Pc(97) int local97;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local89 = arg2.method5381();
					local93 = arg2.method5381();
					local97 = 0;
					if (local62 == 1) {
						local97 = arg2.method5355();
					}
					local9.anIntArray170[local56] = local62;
					local9.anIntArray168[local56] = local97;
					local9.aClass232Array1[local56] = arg0.method1862(Static378.method2424(local89), local93);
				} else if (local62 == 3 || local62 == 4) {
					local89 = arg2.method5381();
					local93 = arg2.method5381();
					local97 = arg2.method5337();
					@Pc(100) String[] local100 = new String[local97];
					for (@Pc(102) int local102 = 0; local102 < local97; local102++) {
						local100[local102] = arg2.method5381();
					}
					@Pc(117) byte[][] local117 = new byte[local97][];
					@Pc(130) int local130;
					if (local62 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local97; local124++) {
							local130 = arg2.method5355();
							local117[local124] = new byte[local130];
							arg2.method5344(local117[local124], local130);
						}
					}
					local9.anIntArray170[local56] = local62;
					@Pc(159) Class[] local159 = new Class[local97];
					for (local130 = 0; local130 < local97; local130++) {
						local159[local130] = Static378.method2424(local100[local130]);
					}
					local9.aClass232Array2[local56] = arg0.method1861(local93, local159, Static378.method2424(local89));
					local9.aByteArrayArrayArray8[local56] = local117;
				}
			} catch (@Pc(240) ClassNotFoundException local240) {
				local9.anIntArray169[local56] = -1;
			} catch (@Pc(247) SecurityException local247) {
				local9.anIntArray169[local56] = -2;
			} catch (@Pc(254) NullPointerException local254) {
				local9.anIntArray169[local56] = -3;
			} catch (@Pc(261) Exception local261) {
				local9.anIntArray169[local56] = -4;
			} catch (@Pc(268) Throwable local268) {
				local9.anIntArray169[local56] = -5;
			}
		}
		Static423.aClass227_39.method4972(local9);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!za;Lclient!ot;IIIII)V")
	public static void method4431(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static105.anInt1943) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static37.anInt666) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static408.anInt6716 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class169 local62 = Static359.aClass169ArrayArrayArray5[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static94.aClass157Array1[local17].ua(local23, local32) + Static94.aClass157Array1[local17].ua(local23 + 1, local32) + Static94.aClass157Array1[local17].ua(local23, local32 + 1) + Static94.aClass157Array1[local17].ua(local23 + 1, local32 + 1)) / 4 - (Static94.aClass157Array1[arg2].ua(arg3, arg4) + Static94.aClass157Array1[arg2].ua(arg3 + 1, arg4) + Static94.aClass157Array1[arg2].ua(arg3, arg4 + 1) + Static94.aClass157Array1[arg2].ua(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class25_Sub4 local143 = local62.aClass25_Sub4_2;
									@Pc(146) Class25_Sub4 local146 = local62.aClass25_Sub4_1;
									if (local143 != null && local143.method4602()) {
										arg1.method4609((local32 - arg4) * Static5.anInt78 + (1 - arg6) * Static341.anInt5832, local140, local1, (local23 - arg3) * Static5.anInt78 + (1 - arg5) * Static341.anInt5832, local143, arg0);
									}
									if (local146 != null && local146.method4602()) {
										arg1.method4609((local32 - arg4) * Static5.anInt78 + (1 - arg6) * Static341.anInt5832, local140, local1, (local23 - arg3) * Static5.anInt78 + (1 - arg5) * Static341.anInt5832, local146, arg0);
									}
									for (@Pc(219) Class27 local219 = local62.aClass27_3; local219 != null; local219 = local219.aClass27_1) {
										@Pc(223) Class25_Sub5 local223 = local219.aClass25_Sub5_1;
										if (local223 != null && local223.method4602() && (local23 == local223.aShort97 || local23 == local3) && (local32 == local223.aShort94 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort96 + 1 - local223.aShort97;
											@Pc(260) int local260 = local223.aShort95 + 1 - local223.aShort94;
											arg1.method4609((local223.aShort94 - arg4) * Static5.anInt78 + (local260 - arg6) * Static341.anInt5832, local140, local1, (local223.aShort97 - arg3) * Static5.anInt78 + (local252 - arg5) * Static341.anInt5832, local223, arg0);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
