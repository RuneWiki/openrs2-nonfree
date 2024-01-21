import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "Lclient!sd;")
	public static Class60 aClass60_4;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_506 = Static118.method2249("Nehmen");

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	public static int anInt685 = 100;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "[I")
	public static final int[] anIntArray71 = new int[4000];

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_507 = Static118.method2249("OFF");

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_508 = Static118.method2249("::autoshadow off");

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_509 = Static118.method2249(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lclient!oc;")
	public static Class65 aClass65_510 = aClass65_507;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_511 = Static118.method2249("Texturen geladen)3");

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!oc;IZ)V")
	public static void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class97 local4 = Static173.method2926(arg0, arg3);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray22 != null) {
			@Pc(18) Class1_Sub26 local18 = new Class1_Sub26();
			local18.anInt4253 = arg1;
			local18.aClass97_14 = local4;
			local18.aClass65_2538 = arg2;
			local18.anObjectArray3 = local4.anObjectArray22;
			Static94.method1780(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt4314 > 0) {
			local36 = Static145.method2632(local4);
		}
		if (!local36 || !Static101.method1915(Static153.method2677(local4), arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static45.aClass1_Sub14_Sub1_8.method1761(60);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 2) {
			Static45.aClass1_Sub14_Sub1_8.method1761(149);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 3) {
			Static45.aClass1_Sub14_Sub1_8.method1761(81);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 4) {
			Static45.aClass1_Sub14_Sub1_8.method1761(43);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 5) {
			Static45.aClass1_Sub14_Sub1_8.method1761(3);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 6) {
			Static45.aClass1_Sub14_Sub1_8.method1761(246);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 7) {
			Static45.aClass1_Sub14_Sub1_8.method1761(80);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 8) {
			Static45.aClass1_Sub14_Sub1_8.method1761(12);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 9) {
			Static45.aClass1_Sub14_Sub1_8.method1761(124);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
		if (arg1 == 10) {
			Static45.aClass1_Sub14_Sub1_8.method1761(68);
			Static45.aClass1_Sub14_Sub1_8.method1724(arg0);
			Static45.aClass1_Sub14_Sub1_8.method1726(arg3);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public static void method418() {
		for (@Pc(1) int local1 = 0; local1 < Static100.anInt2522; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static201.anInt3978; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static198.anInt4264; local7++) {
					@Pc(16) Class1_Sub7 local16 = Static83.aClass1_Sub7ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class10 local21 = local16.aClass10_1;
						if (local21 != null && local21.aClass6_2.method2986()) {
							Static174.method2962(local21.aClass6_2, local1, local4, local7, 1, 1);
							if (local21.aClass6_1 != null && local21.aClass6_1.method2986()) {
								Static174.method2962(local21.aClass6_1, local1, local4, local7, 1, 1);
								local21.aClass6_2.method2990(local21.aClass6_1, 0, 0, 0, false);
								local21.aClass6_1 = local21.aClass6_1.method2988();
							}
							local21.aClass6_2 = local21.aClass6_2.method2988();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt1677; local77++) {
							@Pc(83) Class54 local83 = local16.aClass54Array2[local77];
							if (local83 != null && local83.aClass6_5.method2986()) {
								Static174.method2962(local83.aClass6_5, local1, local4, local7, local83.anInt2636 + 1 - local83.anInt2639, local83.anInt2640 - local83.anInt2632 + 1);
								local83.aClass6_5 = local83.aClass6_5.method2988();
							}
						}
						@Pc(125) Class33 local125 = local16.aClass33_1;
						if (local125 != null && local125.aClass6_3.method2986()) {
							Static92.method1757(local125.aClass6_3, local1, local4, local7);
							local125.aClass6_3 = local125.aClass6_3.method2988();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method419() {
		@Pc(15) int local15;
		if (Static5.anInt96 > 0) {
			for (local15 = 0; local15 < 256; local15++) {
				if (Static5.anInt96 > 768) {
					Static121.anIntArray336[local15] = Static161.method2760(Static93.anIntArray265[local15], 1024 - Static5.anInt96, Static209.anIntArray517[local15]);
				} else if (Static5.anInt96 > 256) {
					Static121.anIntArray336[local15] = Static209.anIntArray517[local15];
				} else {
					Static121.anIntArray336[local15] = Static161.method2760(Static209.anIntArray517[local15], 256 - Static5.anInt96, Static93.anIntArray265[local15]);
				}
			}
		} else if (Static58.anInt1540 > 0) {
			for (local15 = 0; local15 < 256; local15++) {
				if (Static58.anInt1540 > 768) {
					Static121.anIntArray336[local15] = Static161.method2760(Static93.anIntArray265[local15], 1024 - Static58.anInt1540, Static142.anIntArray393[local15]);
				} else if (Static58.anInt1540 > 256) {
					Static121.anIntArray336[local15] = Static142.anIntArray393[local15];
				} else {
					Static121.anIntArray336[local15] = Static161.method2760(Static142.anIntArray393[local15], 256 - Static58.anInt1540, Static93.anIntArray265[local15]);
				}
			}
		} else {
			for (local15 = 0; local15 < 256; local15++) {
				Static121.anIntArray336[local15] = Static93.anIntArray265[local15];
			}
		}
		@Pc(154) int local154 = Static19.aClass1_Sub2_Sub5_Sub3_5.anInt1851 * 9;
		local15 = 0;
		@Pc(158) int local158 = 0;
		@Pc(176) int local176;
		@Pc(186) int local186;
		@Pc(193) int local193;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(207) int local207;
		for (@Pc(160) int local160 = 1; local160 < 255; local160++) {
			local176 = Static57.anIntArray146[local160] * (256 - local160) / 256 + 22;
			if (local176 < 0) {
				local176 = 0;
			}
			local15 += local176;
			for (local186 = local176; local186 < 128; local186++) {
				local193 = Static168.anIntArray352[local15++];
				local199 = Static19.aClass1_Sub2_Sub5_Sub3_5.anIntArray204[local154++];
				if (local193 == 0) {
					Static185.aClass1_Sub2_Sub5_Sub3_7.anIntArray204[local158++] = local199;
				} else {
					local203 = local193;
					local207 = 256 - local193;
					local193 = Static121.anIntArray336[local193];
					Static185.aClass1_Sub2_Sub5_Sub3_7.anIntArray204[local158++] = ((local193 & 0xFF00FF) * local203 + local207 * (local199 & 0xFF00FF) & 0xFF00FF00) + ((local199 & 0xFF00) * local207 + (local193 & 0xFF00) * local203 & 0xFF0000) >> 8;
				}
			}
			for (local193 = 0; local193 < local176; local193++) {
				Static185.aClass1_Sub2_Sub5_Sub3_7.anIntArray204[local158++] = Static19.aClass1_Sub2_Sub5_Sub3_5.anIntArray204[local154++];
			}
			local154 += Static19.aClass1_Sub2_Sub5_Sub3_5.anInt1851 - 128;
		}
		Static185.aClass1_Sub2_Sub5_Sub3_7.method1314(0, 9);
		local158 = 0;
		local15 = 0;
		local154 = Static19.aClass1_Sub2_Sub5_Sub3_5.anInt1851 * 9 + 128;
		for (local176 = 1; local176 < 255; local176++) {
			local186 = Static57.anIntArray146[local176] * (256 - local176) / 256 + 22;
			if (local186 < 0) {
				local186 = 0;
			}
			for (local193 = 0; local193 < local186; local193++) {
				@Pc(342) int local342 = local158++;
				local154--;
				Static11.aClass1_Sub2_Sub5_Sub3_2.anIntArray204[local342] = Static19.aClass1_Sub2_Sub5_Sub3_5.anIntArray204[local154];
			}
			for (local199 = local186; local199 < 128; local199++) {
				local203 = Static168.anIntArray352[local15++];
				local154--;
				local207 = Static19.aClass1_Sub2_Sub5_Sub3_5.anIntArray204[local154];
				if (local203 == 0) {
					Static11.aClass1_Sub2_Sub5_Sub3_2.anIntArray204[local158++] = local207;
				} else {
					@Pc(377) int local377 = 256 - local203;
					@Pc(379) int local379 = local203;
					local203 = Static121.anIntArray336[local203];
					Static11.aClass1_Sub2_Sub5_Sub3_2.anIntArray204[local158++] = ((local207 & 0xFF00) * local377 + (local203 & 0xFF00) * local379 & 0xFF0000) + (local377 * (local207 & 0xFF00FF) + local379 * (local203 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local154 += Static19.aClass1_Sub2_Sub5_Sub3_5.anInt1851 + 128;
			local15 += local186;
		}
		Static11.aClass1_Sub2_Sub5_Sub3_2.method1314(637, 9);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V")
	public static void method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static71.anInt1744 <= arg5 && arg0 <= anInt685 && arg3 >= Static206.anInt4385 && arg2 <= Static133.anInt3309) {
			if (arg1 == 1) {
				Static2.method50(arg3, arg4, arg5, arg0, arg2);
			} else {
				Static124.method2357(arg0, arg3, arg4, arg1, arg2, arg5);
			}
		} else if (arg1 == 1) {
			Static150.method2665(arg5, arg2, arg0, arg3, arg4);
		} else {
			Static105.method1956(arg5, arg3, arg1, arg0, arg4, arg2);
		}
	}
}
