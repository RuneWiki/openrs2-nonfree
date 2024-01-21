import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "Lclient!ce;")
	public static Class3_Sub4 aClass3_Sub4_7;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array11;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1914 = method3027("Loaded update list");

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1913 = aClass70_1914;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
	public static int anInt3927 = 2;

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	public static int anInt3928 = -1;

	@OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
	public static int anInt3931 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILclient!b;IIII)V")
	public static void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static40.aBoolean52) {
			Static130.anInt2545 = 32;
		} else {
			Static130.anInt2545 = 0;
		}
		Static40.aBoolean52 = false;
		@Pc(127) int local127;
		if (Static202.anInt4135 != 0) {
			if (arg1 <= arg5 && arg5 < arg1 + 16 && arg4 >= arg2 && arg2 + 16 > arg4) {
				arg3.anInt270 -= 4;
				Static9.method237(arg3);
			} else if (arg1 <= arg5 && arg5 < arg1 + 16 && arg2 + arg6 - 16 <= arg4 && arg2 + arg6 > arg4) {
				arg3.anInt270 += 4;
				Static9.method237(arg3);
			} else if (arg5 >= arg1 - Static130.anInt2545 && Static130.anInt2545 + arg1 + 16 > arg5 && arg2 + 16 <= arg4 && arg6 + arg2 - 16 > arg4) {
				local127 = (arg6 - 32) * arg6 / arg0;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(142) int local142 = arg4 - arg2 - local127 / 2 - 16;
				@Pc(149) int local149 = arg6 - local127 - 32;
				arg3.anInt270 = (arg0 - arg6) * local142 / local149;
				Static9.method237(arg3);
				Static40.aBoolean52 = true;
			}
		}
		if (Static136.anInt2779 == 0) {
			return;
		}
		local127 = arg3.anInt244;
		if (arg1 - local127 <= arg5 && arg4 >= arg2 && arg5 < arg1 + 16 && arg2 + arg6 >= arg4) {
			arg3.anInt270 += Static136.anInt2779 * 45;
			Static9.method237(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Lclient!g;")
	public static Class36 method3025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass36_1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method3026() {
		for (@Pc(8) Class3_Sub3_Sub13 local8 = (Class3_Sub3_Sub13) Static157.aClass10_90.method267(); local8 != null; local8 = (Class3_Sub3_Sub13) Static157.aClass10_90.method268()) {
			@Pc(15) Class26_Sub3 local15 = local8.aClass26_Sub3_1;
			if (local15.anInt2366 != Static137.anInt2795 || Static184.anInt3760 > local15.anInt2364) {
				local8.method3320();
			} else if (local15.anInt2365 <= Static184.anInt3760) {
				if (local15.anInt2362 > 0) {
					@Pc(45) Class26_Sub2_Sub2 local45 = Static8.aClass26_Sub2_Sub2Array1[local15.anInt2362 - 1];
					if (local45 != null && local45.anInt2593 >= 0 && local45.anInt2593 < 13312 && local45.anInt2611 >= 0 && local45.anInt2611 < 13312) {
						local15.method1692(Static184.anInt3760, local45.anInt2611, Static107.method2399(local45.anInt2611, local45.anInt2593, local15.anInt2366) - local15.anInt2371, local45.anInt2593);
					}
				}
				if (local15.anInt2362 < 0) {
					@Pc(91) int local91 = -local15.anInt2362 - 1;
					@Pc(102) Class26_Sub2_Sub1 local102;
					if (Static64.anInt1360 == local91) {
						local102 = Static144.aClass26_Sub2_Sub1_1;
					} else {
						local102 = Static146.aClass26_Sub2_Sub1Array1[local91];
					}
					if (local102 != null && local102.anInt2593 >= 0 && local102.anInt2593 < 13312 && local102.anInt2611 >= 0 && local102.anInt2611 < 13312) {
						local15.method1692(Static184.anInt3760, local102.anInt2611, Static107.method2399(local102.anInt2611, local102.anInt2593, local15.anInt2366) - local15.anInt2371, local102.anInt2593);
					}
				}
				local15.method1695(Static211.anInt4246);
				Static200.method3182(Static137.anInt2795, (int) local15.aDouble60, (int) local15.aDouble63, (int) local15.aDouble62, 60, local15, local15.anInt2363, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/lang/String;)Lclient!oc;")
	public static Class70 method3027(@OriginalArg(1) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(14) int local14 = local11.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class70 local20 = new Class70();
		local20.aByteArray30 = new byte[local14];
		while (local16 < local14) {
			@Pc(32) int local32 = local11[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local14 <= local16) {
					break;
				}
				@Pc(52) int local52 = local11[local16++] & 0xFF;
				local20.aByteArray30[local20.anInt2899++] = (byte) (local52 + local32 * 43 - 48 - 1720);
			} else if (local32 != 0) {
				local20.aByteArray30[local20.anInt2899++] = (byte) local32;
			}
		}
		local20.method2026();
		return local20.method2060();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method3028() {
		for (@Pc(3) int local3 = 0; local3 < Static45.anInt953; local3++) {
			@Pc(9) int local9 = Static53.anIntArray63[local3]--;
			if (Static53.anIntArray63[local3] >= -10) {
				@Pc(82) Class7 local82 = Static182.aClass7Array1[local3];
				if (local82 == null) {
					local82 = Static214.method241(Static199.aClass52_Sub1_26, Static89.anIntArray35[local3], 0);
					if (local82 == null) {
						continue;
					}
					Static53.anIntArray63[local3] += local82.method243();
					Static182.aClass7Array1[local3] = local82;
				}
				if (Static53.anIntArray63[local3] < 0) {
					@Pc(120) int local120;
					if (Static207.anIntArray373[local3] == 0) {
						local120 = Static153.anInt3166;
					} else {
						@Pc(130) int local130 = (Static207.anIntArray373[local3] & 0xFF) * 128;
						@Pc(138) int local138 = Static207.anIntArray373[local3] >> 16 & 0xFF;
						@Pc(148) int local148 = local138 * 128 + 64 - Static144.aClass26_Sub2_Sub1_1.anInt2593;
						if (local148 < 0) {
							local148 = -local148;
						}
						@Pc(164) int local164 = Static207.anIntArray373[local3] >> 8 & 0xFF;
						@Pc(174) int local174 = local164 * 128 + 64 - Static144.aClass26_Sub2_Sub1_1.anInt2611;
						if (local174 < 0) {
							local174 = -local174;
						}
						@Pc(188) int local188 = local148 + local174 - 128;
						if (local188 > local130) {
							Static53.anIntArray63[local3] = -100;
							continue;
						}
						if (local188 < 0) {
							local188 = 0;
						}
						local120 = (local130 - local188) * Static42.anInt879 / local130;
					}
					if (local120 > 0) {
						@Pc(217) Class3_Sub24_Sub1 local217 = local82.method242().method2831(Static71.aClass58_1);
						@Pc(222) Class3_Sub19_Sub4 local222 = Static220.method3252(local217, local120);
						local222.method3285(Static62.anIntArray72[local3] - 1);
						Static169.aClass3_Sub19_Sub3_2.method2922(local222);
					}
					Static53.anIntArray63[local3] = -100;
				}
			} else {
				Static45.anInt953--;
				for (@Pc(25) int local25 = local3; local25 < Static45.anInt953; local25++) {
					Static89.anIntArray35[local25] = Static89.anIntArray35[local25 + 1];
					Static182.aClass7Array1[local25] = Static182.aClass7Array1[local25 + 1];
					Static62.anIntArray72[local25] = Static62.anIntArray72[local25 + 1];
					Static53.anIntArray63[local25] = Static53.anIntArray63[local25 + 1];
					Static207.anIntArray373[local25] = Static207.anIntArray373[local25 + 1];
				}
				local3--;
			}
		}
		if (Static80.aBoolean91 && !Static14.method274()) {
			if (Static8.anInt186 != 0 && Static141.anInt2849 != -1) {
				Static209.method3300(Static10.aClass52_Sub1_2, Static8.anInt186, Static141.anInt2849);
			}
			Static80.aBoolean91 = false;
		} else if (Static8.anInt186 != 0 && Static141.anInt2849 != -1 && !Static14.method274()) {
			Static93.aClass3_Sub4_Sub1_18.method1298(179);
			Static93.aClass3_Sub4_Sub1_18.method1285(Static141.anInt2849);
			Static141.anInt2849 = -1;
		}
	}
}
