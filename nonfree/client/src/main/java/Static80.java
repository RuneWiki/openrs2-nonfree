import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "Lclient!ld;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!ke;")
	public static Class39 aClass39_984 = Static2.method66("overlay_multiway");

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
	public static int anInt2185 = 0;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "Lclient!ke;")
	private static Class39 aClass39_985 = Static2.method66("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "Lclient!ke;")
	public static Class39 aClass39_986 = aClass39_985;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lclient!ke;")
	private static Class39 aClass39_991 = Static2.method66("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "Lclient!ke;")
	public static Class39 aClass39_987 = aClass39_991;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "Lclient!ke;")
	public static Class39 aClass39_988 = aClass39_991;

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "Lclient!ke;")
	public static Class39 aClass39_989 = Static2.method66("headicons_hint");

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
	public static int anInt2188 = 0;

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "Lclient!ke;")
	public static Class39 aClass39_990 = aClass39_991;

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "Lclient!rc;")
	public static Class57 aClass57_3 = new Class57(32);

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
	public static int anInt2189 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBLclient!jd;)Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 method1563(@OriginalArg(0) int arg0, @OriginalArg(2) Class36 arg1) {
		return Static88.method809(arg1, arg0) ? Static21.method1875() : null;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
	public static void method1564() {
		@Pc(11) int local11 = -1;
		if (Static16.anInt461 == 0 && Static87.anInt2324 == 0) {
			Static84.method2048(anInt2188, Static26.aClass39_365, Static86.aClass39_1048, 20, 0, Static45.anInt1237);
		}
		for (@Pc(35) int local35 = 0; local35 < Static32.anInt994; local35++) {
			@Pc(41) int local41 = Static32.anIntArray140[local35];
			@Pc(45) int local45 = local41 & 0x7F;
			@Pc(51) int local51 = local41 >> 7 & 0x7F;
			@Pc(57) int local57 = local41 >> 14 & 0x7FFF;
			@Pc(63) int local63 = local41 >> 29 & 0x3;
			if (local11 != local41) {
				local11 = local41;
				@Pc(194) int local194;
				if (local63 == 2 && Static77.aClass43_1.method1189(Static18.anInt560, local45, local51, local41) >= 0) {
					@Pc(89) Class2_Sub1_Sub5 local89 = Static48.method916(local57);
					if (local89.anIntArray61 != null) {
						local89 = local89.method422();
					}
					if (local89 == null) {
						continue;
					}
					if (Static16.anInt461 == 1) {
						Static84.method2048(local45, Static76.aClass39_936, Static20.method431(new Class39[] { Static87.aClass39_1062, Static85.aClass39_1041, local89.aClass39_280 }), 30, local41, local51);
					} else if (Static87.anInt2324 != 1) {
						@Pc(184) Class39[] local184 = local89.aClass39Array5;
						if (Static29.aBoolean51) {
							local184 = Static12.method253(local184);
						}
						if (local184 != null) {
							for (local194 = 4; local194 >= 0; local194--) {
								if (local184[local194] != null) {
									@Pc(206) short local206 = 0;
									if (local194 == 0) {
										local206 = 18;
									}
									if (local194 == 1) {
										local206 = 33;
									}
									if (local194 == 2) {
										local206 = 47;
									}
									if (local194 == 3) {
										local206 = 51;
									}
									if (local194 == 4) {
										local206 = 1003;
									}
									Static84.method2048(local45, local184[local194], Static20.method431(new Class39[] { Static99.aClass39_1229, local89.aClass39_280 }), local206, local41, local51);
								}
							}
						}
						Static84.method2048(local45, Static107.aClass39_1192, Static20.method431(new Class39[] { Static99.aClass39_1229, local89.aClass39_280 }), 1006, local89.anInt557 << 14, local51);
					} else if ((Static39.anInt1170 & 0x4) == 4) {
						Static84.method2048(local45, Static23.aClass39_304, Static20.method431(new Class39[] { Static41.aClass39_516, Static85.aClass39_1041, local89.aClass39_280 }), 11, local41, local51);
					}
				}
				@Pc(317) int local317;
				@Pc(325) Class2_Sub1_Sub2_Sub3_Sub2 local325;
				@Pc(368) Class2_Sub1_Sub2_Sub3_Sub1 local368;
				if (local63 == 1) {
					@Pc(296) Class2_Sub1_Sub2_Sub3_Sub2 local296 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local57];
					if (local296.aClass2_Sub1_Sub8_1.anInt1369 == 1 && (local296.anInt2896 & 0x7F) == 64 && (local296.anInt2899 & 0x7F) == 64) {
						for (local317 = 0; local317 < Static95.anInt2510; local317++) {
							local325 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[Static50.anIntArray193[local317]];
							if (local325 != null && local325 != local296 && local325.aClass2_Sub1_Sub8_1.anInt1369 == 1 && local325.anInt2896 == local296.anInt2896 && local296.anInt2899 == local325.anInt2899) {
								Static42.method835(local325.aClass2_Sub1_Sub8_1, local51, local45, Static50.anIntArray193[local317]);
							}
						}
						for (local194 = 0; local194 < Static61.anInt1740; local194++) {
							local368 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static7.anIntArray21[local194]];
							if (local368 != null && local296.anInt2896 == local368.anInt2896 && local368.anInt2899 == local296.anInt2899) {
								Static66.method1378(local45, Static7.anIntArray21[local194], local51, local368);
							}
						}
					}
					Static42.method835(local296.aClass2_Sub1_Sub8_1, local51, local45, local57);
				}
				if (local63 == 0) {
					@Pc(408) Class2_Sub1_Sub2_Sub3_Sub1 local408 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local57];
					if ((local408.anInt2896 & 0x7F) == 64 && (local408.anInt2899 & 0x7F) == 64) {
						for (local317 = 0; local317 < Static95.anInt2510; local317++) {
							local325 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[Static50.anIntArray193[local317]];
							if (local325 != null && local325.aClass2_Sub1_Sub8_1.anInt1369 == 1 && local325.anInt2896 == local408.anInt2896 && local325.anInt2899 == local408.anInt2899) {
								Static42.method835(local325.aClass2_Sub1_Sub8_1, local51, local45, Static50.anIntArray193[local317]);
							}
						}
						for (local194 = 0; local194 < Static61.anInt1740; local194++) {
							local368 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static7.anIntArray21[local194]];
							if (local368 != null && local368 != local408 && local368.anInt2896 == local408.anInt2896 && local408.anInt2899 == local368.anInt2899) {
								Static66.method1378(local45, Static7.anIntArray21[local194], local51, local368);
							}
						}
					}
					Static66.method1378(local45, local57, local51, local408);
				}
				if (local63 == 3) {
					@Pc(532) Class34 local532 = Static55.aClass34ArrayArrayArray1[Static18.anInt560][local45][local51];
					if (local532 != null) {
						for (@Pc(539) Class2_Sub1_Sub2_Sub5 local539 = (Class2_Sub1_Sub2_Sub5) local532.method877(); local539 != null; local539 = (Class2_Sub1_Sub2_Sub5) local532.method866()) {
							@Pc(546) Class2_Sub1_Sub7 local546 = Static66.method1384(local539.anInt2154);
							if (Static16.anInt461 == 1) {
								Static84.method2048(local45, Static76.aClass39_936, Static20.method431(new Class39[] { Static87.aClass39_1062, Static96.aClass39_1185, local546.aClass39_588 }), 28, local539.anInt2154, local51);
							} else if (Static87.anInt2324 != 1) {
								@Pc(632) Class39[] local632 = local546.aClass39Array9;
								if (Static29.aBoolean51) {
									local632 = Static12.method253(local632);
								}
								for (@Pc(640) int local640 = 4; local640 >= 0; local640--) {
									if (local632 != null && local632[local640] != null) {
										@Pc(686) byte local686 = 0;
										if (local640 == 0) {
											local686 = 1;
										}
										if (local640 == 1) {
											local686 = 39;
										}
										if (local640 == 2) {
											local686 = 14;
										}
										if (local640 == 3) {
											local686 = 43;
										}
										if (local640 == 4) {
											local686 = 7;
										}
										Static84.method2048(local45, local632[local640], Static20.method431(new Class39[] { Static51.aClass39_1126, local546.aClass39_588 }), local686, local539.anInt2154, local51);
									} else if (local640 == 2) {
										Static84.method2048(local45, Static45.aClass39_564, Static20.method431(new Class39[] { Static51.aClass39_1126, local546.aClass39_588 }), 14, local539.anInt2154, local51);
									}
								}
								Static84.method2048(local45, Static107.aClass39_1192, Static20.method431(new Class39[] { Static51.aClass39_1126, local546.aClass39_588 }), 1002, local539.anInt2154, local51);
							} else if ((Static39.anInt1170 & 0x1) == 1) {
								Static84.method2048(local45, Static23.aClass39_304, Static20.method431(new Class39[] { Static41.aClass39_516, Static96.aClass39_1185, local546.aClass39_588 }), 50, local539.anInt2154, local51);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(B)V")
	public static void method1565() {
		try {
			@Pc(6) Graphics local6 = Static7.aCanvas1.getGraphics();
			Static95.aClass51_52.method1967(0, 4, local6);
			Static105.aClass51_59.method1967(0, 357, local6);
			Static53.aClass51_31.method1967(722, 4, local6);
			Static9.aClass51_5.method1967(743, 205, local6);
			Static76.aClass51_43.method1967(0, 0, local6);
			Static45.aClass51_26.method1967(516, 4, local6);
			Static30.aClass51_17.method1967(516, 205, local6);
			Static4.aClass51_3.method1967(496, 357, local6);
			Static55.aClass51_35.method1967(0, 338, local6);
		} catch (@Pc(66) Exception local66) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method1566() {
		aBigInteger2 = null;
		aClass39_990 = null;
		aClass39_991 = null;
		aClass57_3 = null;
		aClass39_989 = null;
		aClass42_2 = null;
		aClass39_986 = null;
		aClass39_987 = null;
		aClass39_988 = null;
		aClass39_984 = null;
		aClass39_985 = null;
	}
}
