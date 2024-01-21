import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ke", name = "zb", descriptor = "Lclient!aa;")
	public static Class2 aClass2_2;

	@OriginalMember(owner = "client!ke", name = "ub", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array16 = new Class45[100];

	@OriginalMember(owner = "client!ke", name = "Eb", descriptor = "I")
	public static int anInt1756 = 0;

	@OriginalMember(owner = "client!ke", name = "Fb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_713 = Static63.method1251("@or3@");

	@OriginalMember(owner = "client!ke", name = "Rb", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!ke", name = "Sb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_714 = Static63.method1251("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ke", name = "Vb", descriptor = "I")
	public static int anInt1770 = 0;

	@OriginalMember(owner = "client!ke", name = "fc", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
	public static void method1208() {
		Static75.aClass11_91.method2152();
		Static34.aClass5_Sub2_Sub6_Sub4Array2[Static30.aBoolean19 ? 1 : 0].method1874(Static75.aClass11_91.anInt3140 - 40, Static75.aClass11_91.anInt3134 + -40);
		Static19.aBoolean26 = true;
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V")
	public static void method1209() {
		Static69.anInt1989 = 0;
		Static53.anInt2368 = 0;
		Static23.anInt777 = -1;
		anInt1778 = 0;
		Static51.anInt1621 = 0;
		Static2.aBoolean2 = false;
		Static64.aClass5_Sub9_Sub1_2.anInt2140 = 0;
		Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
		Static74.anInt2504 = -1;
		Static85.anInt2444 = -1;
		Static14.anInt426 = 0;
		Static1.anInt6 = 0;
		Static60.anInt1800 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1.length; local35++) {
			if (Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local35] != null) {
				Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local35].anInt2411 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1.length; local53++) {
			if (Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local53] != null) {
				Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local53].anInt2411 = -1;
			}
		}
		Static91.method1707();
		Static39.method1422(30);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
	public static void method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static110.aClass34_1.method916(arg1, arg3, arg0);
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(27) int local27;
		@Pc(38) int local38;
		@Pc(53) int local53;
		@Pc(66) int local66;
		if (local11 != 0) {
			local23 = Static110.aClass34_1.method928(arg1, arg3, arg0, local11);
			local27 = local23 & 0x1F;
			local33 = local23 >> 6 & 0x3;
			@Pc(36) int[] local36 = Static84.aClass5_Sub2_Sub6_Sub3_2.anIntArray377;
			local38 = arg4;
			local53 = arg3 * 4 + (-arg0 + 103) * 4 * 512 + 24624;
			if (local11 > 0) {
				local38 = arg2;
			}
			local66 = local11 >> 14 & 0x7FFF;
			@Pc(70) Class5_Sub2_Sub7 local70 = Static62.method1232(local66);
			if (local70.anInt827 == -1) {
				if (local27 == 0 || local27 == 2) {
					if (local33 == 0) {
						local36[local53] = local38;
						local36[local53 + 512] = local38;
						local36[local53 + 1024] = local38;
						local36[local53 + 1536] = local38;
					} else if (local33 == 1) {
						local36[local53] = local38;
						local36[local53 + 1] = local38;
						local36[local53 + 2] = local38;
						local36[local53 + 3] = local38;
					} else if (local33 == 2) {
						local36[local53 + 3] = local38;
						local36[local53 + 3 + 512] = local38;
						local36[local53 + 1027] = local38;
						local36[local53 + 3 + 1536] = local38;
					} else if (local33 == 3) {
						local36[local53 + 1536] = local38;
						local36[local53 + 1537] = local38;
						local36[local53 + 1536 + 2] = local38;
						local36[local53 + 1539] = local38;
					}
				}
				if (local27 == 3) {
					if (local33 == 0) {
						local36[local53] = local38;
					} else if (local33 == 1) {
						local36[local53 + 3] = local38;
					} else if (local33 == 2) {
						local36[local53 + 1536 + 3] = local38;
					} else if (local33 == 3) {
						local36[local53 + 1536] = local38;
					}
				}
				if (local27 == 2) {
					if (local33 == 3) {
						local36[local53] = local38;
						local36[local53 + 512] = local38;
						local36[local53 + 1024] = local38;
						local36[local53 + 1536] = local38;
					} else if (local33 == 0) {
						local36[local53] = local38;
						local36[local53 + 1] = local38;
						local36[local53 + 2] = local38;
						local36[local53 + 3] = local38;
					} else if (local33 == 1) {
						local36[local53 + 3] = local38;
						local36[local53 + 515] = local38;
						local36[local53 + 1024 + 3] = local38;
						local36[local53 + 3 + 1536] = local38;
					} else if (local33 == 2) {
						local36[local53 + 1536] = local38;
						local36[local53 + 1537] = local38;
						local36[local53 + 1538] = local38;
						local36[local53 + 3 + 1536] = local38;
					}
				}
			} else {
				@Pc(380) Class5_Sub2_Sub6_Sub4 local380 = Static97.aClass5_Sub2_Sub6_Sub4Array5[local70.anInt827];
				if (local380 != null) {
					@Pc(392) int local392 = (local70.anInt839 * 4 - local380.anInt2731) / 2;
					@Pc(403) int local403 = (local70.anInt829 * 4 - local380.anInt2727) / 2;
					local380.method1874(arg3 * 4 + local392 + 48, 48 - -((104 - (arg0 - -local70.anInt829)) * 4) + local403);
				}
			}
		}
		local11 = Static110.aClass34_1.method909(arg1, arg3, arg0);
		if (local11 != 0) {
			local23 = Static110.aClass34_1.method928(arg1, arg3, arg0, local11);
			local33 = local23 >> 6 & 0x3;
			local27 = local23 & 0x1F;
			local38 = local11 >> 14 & 0x7FFF;
			@Pc(468) Class5_Sub2_Sub7 local468 = Static62.method1232(local38);
			@Pc(491) int local491;
			if (local468.anInt827 != -1) {
				@Pc(571) Class5_Sub2_Sub6_Sub4 local571 = Static97.aClass5_Sub2_Sub6_Sub4Array5[local468.anInt827];
				if (local571 != null) {
					local66 = (local468.anInt839 * 4 - local571.anInt2731) / 2;
					local491 = (local468.anInt829 * 4 - local571.anInt2727) / 2;
					local571.method1874(arg3 * 4 + local66 + 48, local491 + 48 + (-local468.anInt829 + 104 + -arg0) * 4);
				}
			} else if (local27 == 9) {
				local491 = (103 - arg0) * 4 * 512 + arg3 * 4 + 24624;
				local53 = 15658734;
				@Pc(496) int[] local496 = Static84.aClass5_Sub2_Sub6_Sub3_2.anIntArray377;
				if (local11 > 0) {
					local53 = 15597568;
				}
				if (local33 == 0 || local33 == 2) {
					local496[local491 + 1536] = local53;
					local496[local491 + 1 + 1024] = local53;
					local496[local491 + 512 + 2] = local53;
					local496[local491 + 3] = local53;
				} else {
					local496[local491] = local53;
					local496[local491 + 513] = local53;
					local496[local491 + 1024 + 2] = local53;
					local496[local491 + 1539] = local53;
				}
			}
		}
		local11 = Static110.aClass34_1.method888(arg1, arg3, arg0);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(637) Class5_Sub2_Sub7 local637 = Static62.method1232(local23);
		if (local637.anInt827 == -1) {
			return;
		}
		@Pc(647) Class5_Sub2_Sub6_Sub4 local647 = Static97.aClass5_Sub2_Sub6_Sub4Array5[local637.anInt827];
		if (local647 != null) {
			local38 = (local637.anInt839 * 4 - local647.anInt2731) / 2;
			@Pc(670) int local670 = (local637.anInt829 * 4 - local647.anInt2727) / 2;
			local647.method1874(arg3 * 4 + local38 + 48, local670 + 48 - -((104 - (arg0 + local637.anInt829)) * 4));
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)Lclient!mb;")
	public static Class45 method1211(@OriginalArg(2) int arg0) {
		return Static88.method1689(true, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!sd;ZIIIII)V")
	public static void method1212(@OriginalArg(0) Class29 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static34.aBoolean48 = false;
		Static112.anInt2938 = arg1;
		Static47.aClass29_31 = arg0;
		Static60.anInt1802 = arg3;
		Static45.anInt1317 = 1;
		Static51.anInt1613 = arg2;
		Static68.anInt1958 = 2;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Z")
	public static boolean method1213(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!mb;ILclient!mb;Z)V")
	public static void method1216(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) boolean arg2) {
		if (Static19.aBoolean26) {
			Static104.method1900();
			Static19.aBoolean26 = false;
			Static1.method7();
			Static12.method2139();
			Static39.method1441();
			Static79.method1501();
			Static49.method1104(Static78.aClass5_Sub2_Sub6_Sub1_5, Static71.anInt2080, Static70.anInt2023, Static36.anInt1058);
			Static17.method322(Static57.anIntArray262, Static53.anInt2372, -1, Static72.anInt2162 == -1);
			Static77.aBoolean101 = true;
			Static80.aBoolean103 = true;
			Static88.aBoolean114 = true;
		}
		Static88.method1688();
		@Pc(53) short local53 = 151;
		@Pc(54) int local54 = local53 - 3;
		Static78.aClass5_Sub2_Sub6_Sub1_5.method514(arg1, 257, 148, 0);
		Static78.aClass5_Sub2_Sub6_Sub1_5.method514(arg1, 256, 147, 16777215);
		if (arg0 != null) {
			local54 += 15;
			if (arg2) {
				@Pc(79) int local79 = Static78.aClass5_Sub2_Sub6_Sub1_5.method520(arg0) + 4;
				Static118.method1858(257 - local79 / 2, 152, local79, 11, 0);
			}
			Static78.aClass5_Sub2_Sub6_Sub1_5.method514(arg0, 257, 163, 0);
			Static78.aClass5_Sub2_Sub6_Sub1_5.method514(arg0, 256, 162, 16777215);
		}
		Static80.method1509();
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V")
	public static void method1217() {
		aClass45_714 = null;
		aClass2_2 = null;
		aClass45_713 = null;
		aClass45Array16 = null;
	}
}
