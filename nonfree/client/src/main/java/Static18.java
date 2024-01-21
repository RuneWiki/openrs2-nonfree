import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_13;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array6;

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
	public static int anInt2017;

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
	public static int anInt2019;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "J")
	public static long aLong68 = 0L;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!s;")
	public static final Class86 aClass86_27 = new Class86(64);

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean104 = true;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_613 = Static181.method2795("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
	public static int anInt2016 = -1;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_614 = Static181.method2795("Sorry invited players only)3");

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_615 = Static181.method2795("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
	public static int anInt2018 = 0;

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "Lclient!qe;")
	public static Class83 aClass83_616 = aClass83_614;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "Lclient!qe;")
	public static Class83 aClass83_617 = aClass83_613;

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
	public static int anInt2020 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Z")
	public static boolean method1615() {
		try {
			if (Static92.anInt1969 == 2) {
				if (Static13.aClass2_Sub14_1 == null) {
					Static13.aClass2_Sub14_1 = Static220.method1574(Static138.aClass28_139, Static156.anInt4252, Static19.anInt540);
					if (Static13.aClass2_Sub14_1 == null) {
						return false;
					}
				}
				if (Static9.aClass82_1 == null) {
					Static9.aClass82_1 = new Class82(Static8.aClass28_13, Static214.aClass28_202);
				}
				if (Static211.aClass2_Sub9_Sub3_2.method1554(Static13.aClass2_Sub14_1, Static9.aClass82_1, Static29.aClass28_38)) {
					Static211.aClass2_Sub9_Sub3_2.method1540();
					Static211.aClass2_Sub9_Sub3_2.method1560(Static211.anInt4194);
					Static211.aClass2_Sub9_Sub3_2.method1549(Static13.aClass2_Sub14_1, Static207.aBoolean188);
					Static9.aClass82_1 = null;
					Static138.aClass28_139 = null;
					Static92.anInt1969 = 0;
					Static13.aClass2_Sub14_1 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static211.aClass2_Sub9_Sub3_2.method1544();
			Static92.anInt1969 = 0;
			Static9.aClass82_1 = null;
			Static138.aClass28_139 = null;
			Static13.aClass2_Sub14_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)I")
	public static int method1616(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
	public static void method1617(@OriginalArg(1) boolean arg0) {
		Static26.aBoolean39 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(131) int local131;
		@Pc(139) int local139;
		@Pc(148) int local148;
		if (!Static26.aBoolean39) {
			local17 = Static33.aClass2_Sub3_Sub1_1.method254();
			local21 = Static33.aClass2_Sub3_Sub1_1.method269();
			local29 = (Static131.anInt2843 - Static33.aClass2_Sub3_Sub1_1.anInt340) / 16;
			Static152.anIntArrayArray22 = new int[local29][4];
			for (local35 = 0; local35 < local29; local35++) {
				for (local39 = 0; local39 < 4; local39++) {
					Static152.anIntArrayArray22[local35][local39] = Static33.aClass2_Sub3_Sub1_1.method248();
				}
			}
			local39 = Static33.aClass2_Sub3_Sub1_1.method269();
			local67 = Static33.aClass2_Sub3_Sub1_1.method240();
			local71 = Static33.aClass2_Sub3_Sub1_1.method262();
			Static108.anIntArray243 = new int[local29];
			Static209.aByteArrayArray20 = new byte[local29][];
			Static72.anIntArray35 = new int[local29];
			Static52.anIntArray104 = new int[local29];
			@Pc(85) boolean local85 = false;
			if ((local39 / 8 == 48 || local39 / 8 == 49) && (local71 / 8) == 48) {
				local85 = true;
			}
			Static152.aByteArrayArray15 = new byte[local29][];
			local29 = 0;
			if (local39 / 8 == 48 && local71 / 8 == 148) {
				local85 = true;
			}
			for (local131 = (local39 - 6) / 8; local131 <= (local39 + 6) / 8; local131++) {
				for (local139 = (local71 - 6) / 8; local139 <= (local71 + 6) / 8; local139++) {
					local148 = (local131 << 8) + local139;
					if (local85 && (local139 == 49 || local139 == 149 || local139 == 147 || local131 == 50 || local131 == 49 && local139 == 47)) {
						Static108.anIntArray243[local29] = local148;
						Static72.anIntArray35[local29] = -1;
						Static52.anIntArray104[local29] = -1;
					} else {
						Static108.anIntArray243[local29] = local148;
						Static72.anIntArray35[local29] = Static32.aClass28_Sub1_3.method870(Static67.method1268(new Class83[] { Static199.aClass83_1139, Static129.method2179(local131), Static74.aClass83_536, Static129.method2179(local139) }));
						Static52.anIntArray104[local29] = Static32.aClass28_Sub1_3.method870(Static67.method1268(new Class83[] { Static60.aClass83_644, Static129.method2179(local131), Static74.aClass83_536, Static129.method2179(local139) }));
					}
					local29++;
				}
			}
			Static177.method2712(local17, local39, local71, local67, local21);
			return;
		}
		local17 = Static33.aClass2_Sub3_Sub1_1.method254();
		local21 = Static33.aClass2_Sub3_Sub1_1.method254();
		Static33.aClass2_Sub3_Sub1_1.method287();
		for (local29 = 0; local29 < 4; local29++) {
			for (local35 = 0; local35 < 13; local35++) {
				for (local39 = 0; local39 < 13; local39++) {
					local67 = Static33.aClass2_Sub3_Sub1_1.method285(1);
					if (local67 == 1) {
						Static155.anIntArrayArrayArray9[local29][local35][local39] = Static33.aClass2_Sub3_Sub1_1.method285(26);
					} else {
						Static155.anIntArrayArrayArray9[local29][local35][local39] = -1;
					}
				}
			}
		}
		Static33.aClass2_Sub3_Sub1_1.method279();
		local35 = (Static131.anInt2843 - Static33.aClass2_Sub3_Sub1_1.anInt340) / 16;
		Static152.anIntArrayArray22 = new int[local35][4];
		for (local39 = 0; local39 < local35; local39++) {
			for (local67 = 0; local67 < 4; local67++) {
				Static152.anIntArrayArray22[local39][local67] = Static33.aClass2_Sub3_Sub1_1.method248();
			}
		}
		local67 = Static33.aClass2_Sub3_Sub1_1.method269();
		local71 = Static33.aClass2_Sub3_Sub1_1.method260();
		@Pc(395) int local395 = Static33.aClass2_Sub3_Sub1_1.method267();
		Static52.anIntArray104 = new int[local35];
		Static72.anIntArray35 = new int[local35];
		Static209.aByteArrayArray20 = new byte[local35][];
		Static108.anIntArray243 = new int[local35];
		Static152.aByteArrayArray15 = new byte[local35][];
		local35 = 0;
		for (local131 = 0; local131 < 4; local131++) {
			for (local139 = 0; local139 < 13; local139++) {
				for (local148 = 0; local148 < 13; local148++) {
					@Pc(432) int local432 = Static155.anIntArrayArrayArray9[local131][local139][local148];
					if (local432 != -1) {
						@Pc(442) int local442 = local432 >> 14 & 0x3FF;
						@Pc(448) int local448 = local432 >> 3 & 0x7FF;
						@Pc(458) int local458 = local448 / 8 + (local442 / 8 << 8);
						for (@Pc(460) int local460 = 0; local460 < local35; local460++) {
							if (Static108.anIntArray243[local460] == local458) {
								local458 = -1;
								break;
							}
						}
						if (local458 != -1) {
							Static108.anIntArray243[local35] = local458;
							@Pc(490) int local490 = local458 & 0xFF;
							@Pc(496) int local496 = local458 >> 8 & 0xFF;
							Static72.anIntArray35[local35] = Static32.aClass28_Sub1_3.method870(Static67.method1268(new Class83[] { Static199.aClass83_1139, Static129.method2179(local496), Static74.aClass83_536, Static129.method2179(local490) }));
							Static52.anIntArray104[local35] = Static32.aClass28_Sub1_3.method870(Static67.method1268(new Class83[] { Static60.aClass83_644, Static129.method2179(local496), Static74.aClass83_536, Static129.method2179(local490) }));
							local35++;
						}
					}
				}
			}
		}
		Static177.method2712(local21, local17, local395, local71, local67);
	}
}
