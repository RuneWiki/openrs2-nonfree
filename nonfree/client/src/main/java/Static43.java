import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	public static int anInt1142 = 0;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt1143 = -1;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_688 = Static33.method650("(U3");

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt1146 = 0;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_689 = Static33.method650(")3runescape)3com");

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static int[] anIntArray76 = new int[] { 0, 0, 0, 10, 0, 0, 3, -2, 1, 2, 0, 0, 0, 3, 8, 2, 6, 0, 0, 0, 0, -2, 5, 0, -2, 0, 0, 2, 0, 6, 0, 7, 4, 0, 10, 0, 0, 0, -1, 11, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 10, 0, 0, 0, 2, 0, 0, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 6, 0, 0, 6, 0, -2, 1, 0, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 6, 0, 0, 4, -1, 0, 2, 2, 0, 0, 2, 3, 0, 0, 0, 0, 0, 6, 0, 3, 0, 0, 0, 4, 2, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 6, 0, 0, 14, 0, 0, 0, 0, 15, 4, 0, 2, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 1, 0, 0, 4, 4, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 1, 0, -2, -2, 0, 0, 6, 0, 0, -1, 0, 0, 0, 0, 2, 0, 3, 6, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt1150 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method799() {
		for (@Pc(15) int local15 = 0; local15 < Static109.anInt1678; local15++) {
			@Pc(21) int local21 = Static75.anIntArray176[local15];
			@Pc(25) Class3_Sub1_Sub2_Sub4_Sub2 local25 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local21];
			if (local25 != null) {
				Static8.method171(local25, local25.aClass3_Sub1_Sub17_1.anInt2927);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!cd;")
	public static Class3_Sub1_Sub3 method800(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = (Class3_Sub1_Sub3) Static86.aClass52_46.method1342((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static34.aClass44_20.method1146(13, arg0);
		local10 = new Class3_Sub1_Sub3();
		local10.anInt461 = arg0;
		if (local25 != null) {
			local10.method345(new Class3_Sub2(local25));
		}
		Static86.aClass52_46.method1344(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZIIII)Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 method801(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg2 << 40) + ((long) arg3 << 16) + (long) arg1 + ((long) arg4 << 38);
		@Pc(31) Class3_Sub1_Sub1_Sub2 local31;
		if (!arg0) {
			local31 = (Class3_Sub1_Sub1_Sub2) Static18.aClass52_11.method1342(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class3_Sub1_Sub8 local39 = Static12.method239(arg1);
		if (arg3 > 1 && local39.anIntArray136 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (local39.anIntArray135[local49] <= arg3 && local39.anIntArray135[local49] != 0) {
					local47 = local39.anIntArray136[local49];
				}
			}
			if (local47 != -1) {
				local39 = Static12.method239(local47);
			}
		}
		@Pc(87) Class3_Sub1_Sub2_Sub6 local87 = local39.method1190(1);
		if (local87 == null) {
			return null;
		}
		@Pc(93) Class3_Sub1_Sub1_Sub2 local93 = null;
		if (local39.anInt1762 != -1) {
			local93 = method801(true, local39.anInt1774, 0, 10, 1);
			if (local93 == null) {
				return null;
			}
		}
		@Pc(112) int[] local112 = Static6.anIntArray189;
		@Pc(114) int local114 = Static6.anInt2245;
		@Pc(121) int local121 = Static6.anInt2244;
		@Pc(124) int[] local124 = new int[4];
		Static6.method1488(local124);
		local31 = new Class3_Sub1_Sub1_Sub2(36, 32);
		Static6.method1499(local31.anIntArray101, 36, 32);
		Static6.method1486();
		Static55.method1046();
		Static55.method1059(16, 16);
		Static55.aBoolean71 = false;
		@Pc(147) int local147 = local39.anInt1740;
		if (arg0) {
			local147 = (int) ((double) local147 * 1.5D);
		} else if (arg4 == 2) {
			local147 = (int) ((double) local147 * 1.04D);
		}
		@Pc(177) int local177 = local147 * Class3_Sub1_Sub1_Sub3.anIntArray116[local39.anInt1766] >> 16;
		@Pc(186) int local186 = local147 * Class3_Sub1_Sub1_Sub3.anIntArray115[local39.anInt1766] >> 16;
		local87.method1798();
		local87.method1791(local39.anInt1751, local39.anInt1753, local39.anInt1766, local39.anInt1756, local177 + local87.anInt3141 / 2 + local39.anInt1760, local186 - -local39.anInt1760);
		if (arg4 >= 1) {
			local31.method947(1);
		}
		if (arg4 >= 2) {
			local31.method947(16777215);
		}
		if (arg2 != 0) {
			local31.method972(arg2);
		}
		Static6.method1499(local31.anIntArray101, 36, 32);
		if (local39.anInt1762 != -1) {
			local93.method967(0, 0);
		}
		if (!arg0 && (local39.anInt1731 == 1 || arg3 != 1) && arg3 != -1) {
			Static99.aClass3_Sub1_Sub1_Sub1_2.method738(Static27.method559(arg3), 1, 10, 1);
			Static99.aClass3_Sub1_Sub1_Sub1_2.method738(Static27.method559(arg3), 0, 9, 16776960);
		}
		if (!arg0) {
			Static18.aClass52_11.method1344(local31, local23);
		}
		Static6.method1499(local112, local121, local114);
		Static6.method1496(local124);
		Static55.method1046();
		Static55.aBoolean71 = true;
		return local31;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method802() {
		anIntArray76 = null;
		aByteArrayArrayArray5 = null;
		aClass56_689 = null;
		aClass56_688 = null;
		aBooleanArray1 = null;
		aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public static void method803() {
		Static31.aClass3_Sub2_Sub1_3.method322();
		@Pc(18) int local18 = Static31.aClass3_Sub2_Sub1_3.method323(8);
		@Pc(23) int local23;
		if (Static109.anInt1678 > local18) {
			for (local23 = local18; local23 < Static109.anInt1678; local23++) {
				Static7.anIntArray28[Static50.anInt1424++] = Static75.anIntArray176[local23];
			}
		}
		if (local18 > Static109.anInt1678) {
			throw new RuntimeException("gnpov1");
		}
		Static109.anInt1678 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(65) int local65 = Static75.anIntArray176[local23];
			@Pc(69) Class3_Sub1_Sub2_Sub4_Sub2 local69 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local65];
			@Pc(74) int local74 = Static31.aClass3_Sub2_Sub1_3.method323(1);
			if (local74 == 0) {
				Static75.anIntArray176[Static109.anInt1678++] = local65;
				local69.anInt3147 = Static98.anInt2566;
			} else {
				@Pc(97) int local97 = Static31.aClass3_Sub2_Sub1_3.method323(2);
				if (local97 == 0) {
					Static75.anIntArray176[Static109.anInt1678++] = local65;
					local69.anInt3147 = Static98.anInt2566;
					Static79.anIntArray186[Static60.anInt1776++] = local65;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Static75.anIntArray176[Static109.anInt1678++] = local65;
						local69.anInt3147 = Static98.anInt2566;
						local139 = Static31.aClass3_Sub2_Sub1_3.method323(3);
						local69.method2034(false, local139);
						local149 = Static31.aClass3_Sub2_Sub1_3.method323(1);
						if (local149 == 1) {
							Static79.anIntArray186[Static60.anInt1776++] = local65;
						}
					} else if (local97 == 2) {
						Static75.anIntArray176[Static109.anInt1678++] = local65;
						local69.anInt3147 = Static98.anInt2566;
						local139 = Static31.aClass3_Sub2_Sub1_3.method323(3);
						local69.method2034(true, local139);
						local149 = Static31.aClass3_Sub2_Sub1_3.method323(3);
						local69.method2034(true, local149);
						@Pc(203) int local203 = Static31.aClass3_Sub2_Sub1_3.method323(1);
						if (local203 == 1) {
							Static79.anIntArray186[Static60.anInt1776++] = local65;
						}
					} else if (local97 == 3) {
						Static7.anIntArray28[Static50.anInt1424++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!tb;Z)V")
	public static void method804(@OriginalArg(0) Class44 arg0) {
		Static96.aClass44_55 = arg0;
		Static106.anInt2626 = Static96.aClass44_55.method1151(16);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Z")
	public static boolean method805(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
