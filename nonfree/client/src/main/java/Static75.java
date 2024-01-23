import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
	public static int[] anIntArray175;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
	public static int anInt1495;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Lclient!ak;")
	public static Class7 aClass7_74;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "[I")
	public static int[] anIntArray177 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "[I")
	public static int[] anIntArray178 = new int[32768];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1281(@OriginalArg(1) String arg0) {
		return Static211.method784(10, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lclient!gg;")
	public static Class63 method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class63 local14 = local7.aClass63_1;
			local7.aClass63_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method1283() {
		for (@Pc(3) int local3 = 0; local3 < Static25.anInt2862; local3++) {
			@Pc(18) int local18 = Static207.anIntArray471[local3]--;
			if (Static207.anIntArray471[local3] >= -10) {
				@Pc(97) Class44 local97 = Static221.aClass44Array1[local3];
				if (local97 == null) {
					local97 = Static302.method1045(Static60.aClass7_60, Static55.anIntArray139[local3], 0);
					if (local97 == null) {
						continue;
					}
					Static207.anIntArray471[local3] += local97.method1044();
					Static221.aClass44Array1[local3] = local97;
				}
				if (Static207.anIntArray471[local3] < 0) {
					@Pc(143) int local143;
					if (Static93.anIntArray237[local3] == 0) {
						local143 = Static282.anIntArray689[local3] * Static73.anInt1433 >> 8;
					} else {
						@Pc(153) int local153 = (Static93.anIntArray237[local3] & 0xFF) * 128;
						@Pc(161) int local161 = Static93.anIntArray237[local3] >> 16 & 0xFF;
						@Pc(171) int local171 = local161 * 128 + 64 - Static28.aClass6_Sub6_Sub2_1.anInt4562;
						if (local171 < 0) {
							local171 = -local171;
						}
						@Pc(185) int local185 = Static93.anIntArray237[local3] >> 8 & 0xFF;
						@Pc(195) int local195 = local185 * 128 + 64 - Static28.aClass6_Sub6_Sub2_1.anInt4569;
						if (local195 < 0) {
							local195 = -local195;
						}
						@Pc(206) int local206 = local195 + local171 - 128;
						if (local206 > local153) {
							Static207.anIntArray471[local3] = -100;
							continue;
						}
						if (local206 < 0) {
							local206 = 0;
						}
						local143 = Static282.anIntArray689[local3] * (local153 - local206) * Static267.anInt5346 / local153 >> 8;
					}
					if (local143 > 0) {
						@Pc(246) Class1_Sub22_Sub1 local246 = local97.method1046().method2959(Static61.aClass151_1);
						@Pc(251) Class1_Sub8_Sub1 local251 = Static305.method1224(local246, local143);
						local251.method1252(Static237.anIntArray360[local3] - 1);
						Static28.aClass1_Sub8_Sub3_1.method2410(local251);
					}
					Static207.anIntArray471[local3] = -100;
				}
			} else {
				Static25.anInt2862--;
				for (@Pc(32) int local32 = local3; local32 < Static25.anInt2862; local32++) {
					Static55.anIntArray139[local32] = Static55.anIntArray139[local32 + 1];
					Static221.aClass44Array1[local32] = Static221.aClass44Array1[local32 + 1];
					Static237.anIntArray360[local32] = Static237.anIntArray360[local32 + 1];
					Static207.anIntArray471[local32] = Static207.anIntArray471[local32 + 1];
					Static93.anIntArray237[local32] = Static93.anIntArray237[local32 + 1];
					Static282.anIntArray689[local32] = Static282.anIntArray689[local32 + 1];
				}
				local3--;
			}
		}
		if (Static295.aBoolean448 && !Static138.method2189()) {
			if (Static259.anInt5233 != 0 && Static4.anInt146 != -1) {
				Static168.method2552(Static67.aClass7_68, Static4.anInt146, Static259.anInt5233);
			}
			Static295.aBoolean448 = false;
		} else if (Static259.anInt5233 != 0 && Static4.anInt146 != -1 && !Static138.method2189()) {
			Static270.aClass1_Sub18_Sub1_3.method3130(185);
			Static270.aClass1_Sub18_Sub1_3.method3119(Static4.anInt146);
			Static4.anInt146 = -1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIIIBI)V")
	public static void method1284(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (Static240.aBoolean369) {
			@Pc(29) int local29 = arg2 - 334;
			if (local29 < 0) {
				local29 = 0;
			} else if (local29 > 100) {
				local29 = 100;
			}
			@Pc(55) int local55 = local29 * (Static217.aShort36 - Static263.aShort38) / 100 + Static263.aShort38;
			if (local55 < Static188.aShort32) {
				local55 = Static188.aShort32;
			} else if (Static19.aShort1 < local55) {
				local55 = Static19.aShort1;
			}
			@Pc(77) int local77 = local55 * 512 * arg2 / (arg3 * 334);
			@Pc(115) int local115;
			@Pc(122) int local122;
			@Pc(89) short local89;
			if (local77 < Static43.aShort12) {
				local89 = Static43.aShort12;
				local55 = local89 * arg3 * 334 / (arg2 * 512);
				if (local55 > Static19.aShort1) {
					local55 = Static19.aShort1;
					local115 = arg2 * local55 * 512 / (local89 * 334);
					local122 = (arg3 - local115) / 2;
					if (arg0) {
						Static50.method869();
						Static50.method866(arg4, arg1, local122, arg2, 0);
						Static50.method866(arg3 + arg4 - local122, arg1, local122, arg2, 0);
					}
					arg4 += local122;
					arg3 -= local122 * 2;
				}
			} else if (local77 > Static113.aShort21) {
				local89 = Static113.aShort21;
				local55 = local89 * 334 * arg3 / (arg2 * 512);
				if (Static188.aShort32 > local55) {
					local55 = Static188.aShort32;
					local115 = local89 * 334 * arg3 / (local55 * 512);
					local122 = (arg2 - local115) / 2;
					if (arg0) {
						Static50.method869();
						Static50.method866(arg4, arg1, arg3, local122, 0);
						Static50.method866(arg4, arg2 + arg1 - local122, arg3, local122, 0);
					}
					arg1 += local122;
					arg2 -= local122 * 2;
				}
			}
			Static184.anInt3403 = local55 * arg2 / 334;
		}
		Static282.anInt5854 = (short) arg2;
		Static32.anInt713 = (short) arg3;
		Static229.anInt4800 = arg1;
		Static196.anInt3785 = arg4;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lclient!og;")
	public static Class127 method1287(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static86.aClass127ArrayArray1[local7] == null || Static86.aClass127ArrayArray1[local7][local11] == null) {
			@Pc(29) boolean local29 = Static228.method3502(local7);
			if (!local29) {
				return null;
			}
		}
		return Static86.aClass127ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
	public static void method1288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static122.anInt2367 == 1) {
			Static244.aClass1_Sub2_Sub2Array13[Static63.anInt1290 / 100].method3921(Static102.anInt1931 - 8, Static220.anInt4583 + -8);
		}
		if (Static122.anInt2367 == 2) {
			Static244.aClass1_Sub2_Sub2Array13[Static63.anInt1290 / 100 + 4].method3921(Static102.anInt1931 - 8, Static220.anInt4583 + -8);
		}
		Static212.method3959();
	}
}
