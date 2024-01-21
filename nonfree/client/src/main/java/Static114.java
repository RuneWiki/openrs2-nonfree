import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_5;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public static int anInt2537;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!ha;")
	public static Class2_Sub1_Sub1_Sub4_Sub1 aClass2_Sub1_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1075 = Static119.method1462("blaugr-Un:");

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1077 = Static119.method1462("Please try using a different world)3");

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1076 = aClass65_1077;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1078 = aClass65_1077;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1079 = Static119.method1462("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1080 = aClass65_1077;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1081 = aClass65_1077;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1082 = Static119.method1462("scrollbar");

	@OriginalMember(owner = "client!td", name = "t", descriptor = "[I")
	public static int[] anIntArray334 = new int[128];

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1083 = aClass65_1077;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1084 = aClass65_1077;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1830() {
		anIntArray334 = null;
		aClass2_Sub1_Sub1_Sub4_Sub1_1 = null;
		aClass65_1081 = null;
		aClass65_1084 = null;
		aClass65_1082 = null;
		aClass65_1076 = null;
		aClass65_1079 = null;
		aClass65_1075 = null;
		aClass65_1083 = null;
		aClass65_1080 = null;
		aClass65_1077 = null;
		aClass65_1078 = null;
		aClass2_Sub1_Sub4_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method1831() {
		Static110.anIntArrayArray24 = null;
		Static73.anIntArray199 = null;
		Static53.aByteArrayArrayArray1 = null;
		Static12.anIntArray34 = null;
		Static10.anIntArray418 = null;
		Static93.anIntArray277 = null;
		Static106.aByteArrayArrayArray4 = null;
		Static66.aByteArrayArrayArray2 = null;
		Static83.anIntArray237 = null;
		Static129.aByteArrayArrayArray7 = null;
		Static113.aByteArrayArrayArray5 = null;
		Static5.anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!na;II)Z")
	public static boolean method1832(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1675(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static38.method668(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public static void method1833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = -1;
		if (Static113.anInt2520 == 0 && !Static117.aBoolean103) {
			Static101.method1657(arg0 - arg3, Static63.aClass65_667, arg2 - arg1, 0, 40, Static110.aClass65_1038);
		}
		for (@Pc(31) int local31 = 0; local31 < Static131.anInt2871; local31++) {
			@Pc(37) int local37 = Static131.anIntArray404[local31];
			@Pc(41) int local41 = local37 & 0x7F;
			@Pc(47) int local47 = local37 >> 7 & 0x7F;
			@Pc(53) int local53 = local37 >> 29 & 0x3;
			@Pc(59) int local59 = local37 >> 14 & 0x7FFF;
			if (local37 != local7) {
				local7 = local37;
				@Pc(113) int local113;
				if (local53 == 2 && Static124.aClass49_1.method1159(Static59.anInt1479, local41, local47, local37) >= 0) {
					@Pc(82) Class2_Sub1_Sub15 local82 = Static73.method1248(local59);
					if (local82.anIntArray351 != null) {
						local82 = local82.method1917();
					}
					if (local82 == null) {
						continue;
					}
					if (Static113.anInt2520 == 1) {
						Static101.method1657(local41, Static76.aClass65_725, local47, local37, 17, Static35.method647(new Class65[] { Static18.aClass65_143, Static48.aClass65_525, local82.aClass65_1169 }));
					} else if (!Static117.aBoolean103) {
						@Pc(103) Class65[] local103 = local82.aClass65Array74;
						if (Static99.aBoolean91) {
							local103 = Static47.method810(local103);
						}
						if (local103 != null) {
							for (local113 = 4; local113 >= 0; local113--) {
								if (local103[local113] != null) {
									@Pc(125) short local125 = 0;
									if (local113 == 0) {
										local125 = 8;
									}
									if (local113 == 1) {
										local125 = 28;
									}
									if (local113 == 2) {
										local125 = 14;
									}
									if (local113 == 3) {
										local125 = 41;
									}
									if (local113 == 4) {
										local125 = 1002;
									}
									Static101.method1657(local41, local103[local113], local47, local37, local125, Static35.method647(new Class65[] { Static5.aClass65_74, local82.aClass65_1169 }));
								}
							}
						}
						Static101.method1657(local41, Static117.aClass65_1113, local47, local82.anInt2682 << 14, 1004, Static35.method647(new Class65[] { Static5.aClass65_74, local82.aClass65_1169 }));
					} else if ((Static16.anInt2217 & 0x4) == 4) {
						Static101.method1657(local41, Static103.aClass65_984, local47, local37, 51, Static35.method647(new Class65[] { Static22.aClass65_262, Static48.aClass65_525, local82.aClass65_1169 }));
					}
				}
				@Pc(303) int local303;
				@Pc(311) Class2_Sub1_Sub1_Sub4_Sub2 local311;
				@Pc(364) Class2_Sub1_Sub1_Sub4_Sub1 local364;
				if (local53 == 1) {
					@Pc(280) Class2_Sub1_Sub1_Sub4_Sub2 local280 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local59];
					if (local280.aClass2_Sub1_Sub12_1.anInt2142 == 1 && (local280.anInt1948 & 0x7F) == 64 && (local280.anInt1958 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static110.anInt2469; local303++) {
							local311 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static117.anIntArray340[local303]];
							if (local311 != null && local311 != local280 && local311.aClass2_Sub1_Sub12_1.anInt2142 == 1 && local280.anInt1948 == local311.anInt1948 && local311.anInt1958 == local280.anInt1958) {
								Static101.method1659(local311.aClass2_Sub1_Sub12_1, Static117.anIntArray340[local303], local47, local41);
							}
						}
						for (local113 = 0; local113 < Static35.anInt795; local113++) {
							local364 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static76.anIntArray223[local113]];
							if (local364 != null && local280.anInt1948 == local364.anInt1948 && local364.anInt1958 == local280.anInt1958) {
								Static37.method653(Static76.anIntArray223[local113], local47, local364, local41);
							}
						}
					}
					Static101.method1659(local280.aClass2_Sub1_Sub12_1, local59, local47, local41);
				}
				if (local53 == 0) {
					@Pc(412) Class2_Sub1_Sub1_Sub4_Sub1 local412 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local59];
					if ((local412.anInt1948 & 0x7F) == 64 && (local412.anInt1958 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static110.anInt2469; local303++) {
							local311 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static117.anIntArray340[local303]];
							if (local311 != null && local311.aClass2_Sub1_Sub12_1.anInt2142 == 1 && local412.anInt1948 == local311.anInt1948 && local412.anInt1958 == local311.anInt1958) {
								Static101.method1659(local311.aClass2_Sub1_Sub12_1, Static117.anIntArray340[local303], local47, local41);
							}
						}
						for (local113 = 0; local113 < Static35.anInt795; local113++) {
							local364 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static76.anIntArray223[local113]];
							if (local364 != null && local412 != local364 && local364.anInt1948 == local412.anInt1948 && local364.anInt1958 == local412.anInt1958) {
								Static37.method653(Static76.anIntArray223[local113], local47, local364, local41);
							}
						}
					}
					Static37.method653(local59, local47, local412, local41);
				}
				if (local53 == 3) {
					@Pc(536) Class13 local536 = Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local41][local47];
					if (local536 != null) {
						for (@Pc(543) Class2_Sub1_Sub1_Sub6 local543 = (Class2_Sub1_Sub1_Sub6) local536.method265(); local543 != null; local543 = (Class2_Sub1_Sub1_Sub6) local536.method268()) {
							@Pc(550) Class2_Sub1_Sub11 local550 = Static4.method872(local543.anInt2468);
							if (Static113.anInt2520 == 1) {
								Static101.method1657(local41, Static76.aClass65_725, local47, local543.anInt2468, 4, Static35.method647(new Class65[] { Static18.aClass65_143, Static26.aClass65_289, local550.aClass65_870 }));
							} else if (!Static117.aBoolean103) {
								@Pc(627) Class65[] local627 = local550.aClass65Array48;
								if (Static99.aBoolean91) {
									local627 = Static47.method810(local627);
								}
								for (@Pc(639) int local639 = 4; local639 >= 0; local639--) {
									if (local627 != null && local627[local639] != null) {
										@Pc(683) byte local683 = 0;
										if (local639 == 0) {
											local683 = 58;
										}
										if (local639 == 1) {
											local683 = 5;
										}
										if (local639 == 2) {
											local683 = 47;
										}
										if (local639 == 3) {
											local683 = 22;
										}
										if (local639 == 4) {
											local683 = 44;
										}
										Static101.method1657(local41, local627[local639], local47, local543.anInt2468, local683, Static35.method647(new Class65[] { Static42.aClass65_462, local550.aClass65_870 }));
									} else if (local639 == 2) {
										Static101.method1657(local41, Static93.aClass65_875, local47, local543.anInt2468, 47, Static35.method647(new Class65[] { Static42.aClass65_462, local550.aClass65_870 }));
									}
								}
								Static101.method1657(local41, Static117.aClass65_1113, local47, local543.anInt2468, 1006, Static35.method647(new Class65[] { Static42.aClass65_462, local550.aClass65_870 }));
							} else if ((Static16.anInt2217 & 0x1) == 1) {
								Static101.method1657(local41, Static103.aClass65_984, local47, local543.anInt2468, 49, Static35.method647(new Class65[] { Static22.aClass65_262, Static26.aClass65_289, local550.aClass65_870 }));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!wa;)I")
	public static int method1834(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(17) Class2_Sub24 local17 = (Class2_Sub24) Static82.aClass40_22.method851((long) arg0.anInt2814 + ((long) arg0.anInt2835 << 32));
		return local17 == null ? arg0.anInt2805 : local17.anInt2944;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IJ)V")
	public static void method1835(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static91.anInt2030 >= 100 && Static52.anInt1253 != 1 || Static91.anInt2030 >= 200) {
			Static59.method1098(0, Static110.aClass65_1038, Static42.aClass65_469);
			return;
		}
		@Pc(45) Class65 local45 = Static57.method1080(arg0).method1506();
		for (@Pc(47) int local47 = 0; local47 < Static91.anInt2030; local47++) {
			if (arg0 == Static93.aLongArray5[local47]) {
				Static59.method1098(0, Static110.aClass65_1038, Static35.method647(new Class65[] { local45, Static13.aClass65_1125 }));
				return;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < Static49.anInt1201; local86++) {
			if (Static30.aLongArray1[local86] == arg0) {
				Static59.method1098(0, Static110.aClass65_1038, Static35.method647(new Class65[] { Static75.aClass65_978, local45, Static94.aClass65_896 }));
				return;
			}
		}
		if (local45.method1512(aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass65_457)) {
			Static59.method1098(0, Static110.aClass65_1038, Static32.aClass65_353);
			return;
		}
		Static88.aClass65Array45[Static91.anInt2030] = local45;
		Static93.aLongArray5[Static91.anInt2030] = arg0;
		Static61.anIntArray178[Static91.anInt2030] = 0;
		Static11.anIntArray163[Static91.anInt2030] = 0;
		Static59.anInt1470 = Static8.anInt228;
		Static91.anInt2030++;
		Static49.aClass2_Sub4_Sub1_1.method962(66);
		Static49.aClass2_Sub4_Sub1_1.method948(arg0);
	}
}
