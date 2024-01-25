import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "Lclient!cea;")
	public static final Class50 aClass50_2 = new Class50();

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	public static int anInt2983 = 0;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "[S")
	public static final short[] aShortArray33 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;ILclient!fa;IILclient!ep;Lclient!ed;IIIZLclient!ta;)V")
	public static void method2626(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class93 arg5, @OriginalArg(6) Class82 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class73 arg10) {
		@Pc(14) int local14;
		if (Static84.anInt1994 == 4) {
			local14 = (int) Static412.aFloat175 & 0x3FFF;
		} else {
			local14 = (int) Static412.aFloat175 + Static47.anInt1291 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg5.anInt2777 / 2, arg5.anInt2738 / 2) + 10;
		@Pc(42) int local42 = arg9 * arg9 + arg4 * arg4;
		if (local42 > local33 * local33) {
			return;
		}
		@Pc(56) int local56 = Class179.anIntArray756[local14];
		@Pc(60) int local60 = Class179.anIntArray757[local14];
		if (Static84.anInt1994 != 4) {
			local56 = local56 * 256 / (Static146.anInt8629 + 256);
			local60 = local60 * 256 / (Static146.anInt8629 + 256);
		}
		@Pc(91) int local91 = arg9 * local60 + local56 * arg4 >> 14;
		@Pc(102) int local102 = arg4 * local60 - arg9 * local56 >> 14;
		@Pc(109) int local109 = arg6.method2287(arg0, 100, null);
		@Pc(117) int local117 = arg6.method2295(arg0, null);
		@Pc(123) int local123 = local91 - local109 / 2;
		if (-arg5.anInt2777 <= local123 && arg5.anInt2777 >= local123 && -arg5.anInt2738 <= local102 && arg5.anInt2738 >= local102) {
			arg10.method7891(arg8, arg5.anInt2738 / 2 + arg7 - arg1 - local102 - local117, 0, arg2, arg7, 50, 1, arg5.anInt2777 / 2 + local123 + arg8, arg3, 0, arg0, local109, null, null);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	public static void method2628(@OriginalArg(1) int arg0) {
		Static248.anInt5069 = arg0;
		Static572.aClass245_72.method6079();
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V")
	public static void method2630() {
		for (@Pc(12) int local12 = 0; local12 < Static521.anInt9062; local12++) {
			@Pc(18) Class161 local18 = Static360.aClass161Array1[local12];
			@Pc(20) boolean local20 = false;
			@Pc(144) int local144;
			if (local18.aClass6_Sub10_Sub2_3 == null) {
				local18.anInt4835--;
				if (local18.anInt4835 >= (local18.method4163() ? -1500 : -10)) {
					if (local18.aByte46 == 1 && local18.aClass33_1 == null) {
						local18.aClass33_1 = Static585.method1086(Static487.aClass168_112, local18.anInt4834, 0);
						if (local18.aClass33_1 == null) {
							continue;
						}
						local18.anInt4835 += local18.aClass33_1.method1088();
					} else if (local18.method4163() && (local18.aClass6_Sub37_3 == null || local18.aClass6_Sub12_Sub1_3 == null)) {
						if (local18.aClass6_Sub37_3 == null) {
							local18.aClass6_Sub37_3 = Static368.method5869(Static128.aClass168_35, local18.anInt4834);
						}
						if (local18.aClass6_Sub37_3 == null) {
							continue;
						}
						if (local18.aClass6_Sub12_Sub1_3 == null) {
							local18.aClass6_Sub12_Sub1_3 = local18.aClass6_Sub37_3.method5870(new int[] { 22050 });
							if (local18.aClass6_Sub12_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local18.anInt4835 < 0) {
						if (local18.anInt4833 == 0) {
							local144 = local18.anInt4831 * (local18.aByte46 == 3 ? Static104.aClass6_Sub6_Sub1_4.anInt1177 : Static104.aClass6_Sub6_Sub1_4.anInt1155) >> 8;
						} else {
							@Pc(153) int local153 = local18.anInt4833 >> 24 & 0x3;
							if (Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 == local153) {
								@Pc(168) int local168 = (local18.anInt4833 & 0xFF) << 9;
								@Pc(175) int local175 = local18.anInt4833 >> 16 & 0xFF;
								@Pc(185) int local185 = (local175 << 9) + 256 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347;
								if (local185 < 0) {
									local185 = -local185;
								}
								@Pc(197) int local197 = local18.anInt4833 >> 8 & 0xFF;
								@Pc(207) int local207 = (local197 << 9) + 256 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351;
								if (local207 < 0) {
									local207 = -local207;
								}
								@Pc(221) int local221 = local185 + local207 - 512;
								if (local168 < local221) {
									local18.anInt4835 = -99999;
									continue;
								}
								if (local221 < 0) {
									local221 = 0;
								}
								local144 = (local168 - local221) * Static104.aClass6_Sub6_Sub1_4.anInt1178 * local18.anInt4831 / local168 >> 8;
							} else {
								local144 = 0;
							}
						}
						if (local144 > 0) {
							@Pc(257) Class6_Sub12_Sub1 local257 = null;
							if (local18.aByte46 == 1) {
								local257 = local18.aClass33_1.method1085().method7958(Static184.aClass151_1);
							} else if (local18.method4163()) {
								local257 = local18.aClass6_Sub12_Sub1_3;
							}
							@Pc(283) Class6_Sub10_Sub2 local283 = local18.aClass6_Sub10_Sub2_3 = Static587.method3422(local257, local144);
							local283.method3434(local18.anInt4830 - 1);
							Static35.aClass6_Sub10_Sub3_1.method4737(local283);
						}
					}
				} else {
					local20 = true;
				}
			} else if (!local18.aClass6_Sub10_Sub2_3.method8152()) {
				local20 = true;
			}
			if (local20) {
				Static521.anInt9062--;
				for (local144 = local12; local144 < Static521.anInt9062; local144++) {
					Static360.aClass161Array1[local144] = Static360.aClass161Array1[local144 + 1];
				}
				local12--;
			}
		}
		if (Static439.aBoolean592 && !Static241.method4244()) {
			if (Static104.aClass6_Sub6_Sub1_4.anInt1170 != 0 && Static499.anInt8891 != -1) {
				Static386.method6071(Static378.aClass168_88, Static104.aClass6_Sub6_Sub1_4.anInt1170, Static499.anInt8891);
			}
			Static439.aBoolean592 = false;
		} else if (Static104.aClass6_Sub6_Sub1_4.anInt1170 != 0 && Static499.anInt8891 != -1 && !Static241.method4244()) {
			Static298.method4854(Static264.aClass181_68);
			Static547.aClass6_Sub26_Sub2_2.method4979(Static499.anInt8891);
			Static499.anInt8891 = -1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)Z")
	public static boolean method2631(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Z")
	public static boolean method2632(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
