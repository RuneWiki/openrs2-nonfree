import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "Lclient!df;")
	public static Class16 aClass16_46;

	@OriginalMember(owner = "client!kf", name = "hb", descriptor = "Lclient!me;")
	public static Class3_Sub14 aClass3_Sub14_1;

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "Lclient!qf;")
	private static Class60 aClass60_849 = Static59.method1195("Classic");

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_850 = aClass60_849;

	@OriginalMember(owner = "client!kf", name = "bb", descriptor = "Lclient!eb;")
	public static Class17 aClass17_32 = new Class17(64);

	@OriginalMember(owner = "client!kf", name = "ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_851 = Static59.method1195("null");

	@OriginalMember(owner = "client!kf", name = "sb", descriptor = "I")
	public static int anInt1942 = 0;

	@OriginalMember(owner = "client!kf", name = "tb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_852 = Static59.method1195("Ausw-=hlen");

	@OriginalMember(owner = "client!kf", name = "xb", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!kf", name = "yb", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!kf", name = "zb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_853 = Static59.method1195("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!kf", name = "Ab", descriptor = "Lclient!qf;")
	public static Class60 aClass60_854 = Static59.method1195("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public static void method1244() {
		if (Static73.anInt2349 == 0 && !Static72.aBoolean85) {
			Static118.method2137(Static122.anInt720, 33, Static120.aClass60_1369, Static12.anInt374, Static128.aClass60_1428, 0);
		}
		@Pc(26) int local26 = -1;
		for (@Pc(28) int local28 = 0; local28 < Static25.anInt974; local28++) {
			@Pc(39) int local39 = Static25.anIntArray111[local28];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 29 & 0x3;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local26 != local39) {
				local26 = local39;
				@Pc(146) int local146;
				if (local55 == 2 && Static13.aClass58_1.method1747(Static119.anInt3243, local43, local49, local39) >= 0) {
					@Pc(80) Class3_Sub1_Sub17 local80 = Static18.method517(local61);
					if (local80.anIntArray387 != null) {
						local80 = local80.method2275();
					}
					if (local80 == null) {
						continue;
					}
					if (Static73.anInt2349 == 1) {
						Static118.method2137(local43, 14, Static60.method1211(new Class60[] { Static124.aClass60_1361, Static118.aClass60_1347, local80.aClass60_1425 }), local49, Static8.aClass60_131, local39);
					} else if (!Static72.aBoolean85) {
						@Pc(132) Class60[] local132 = local80.aClass60Array22;
						if (Static120.aBoolean120) {
							local132 = Static28.method2224(local132);
						}
						if (local132 != null) {
							for (local146 = 4; local146 >= 0; local146--) {
								if (local132[local146] != null) {
									@Pc(158) short local158 = 0;
									if (local146 == 0) {
										local158 = 47;
									}
									if (local146 == 1) {
										local158 = 17;
									}
									if (local146 == 2) {
										local158 = 28;
									}
									if (local146 == 3) {
										local158 = 35;
									}
									if (local146 == 4) {
										local158 = 1003;
									}
									Static118.method2137(local43, local158, Static60.method1211(new Class60[] { Static120.aClass60_1371, local80.aClass60_1425 }), local49, local132[local146], local39);
								}
							}
						}
						Static118.method2137(local43, 1005, Static60.method1211(new Class60[] { Static120.aClass60_1371, local80.aClass60_1425 }), local49, Static39.aClass60_542, local80.anInt3412 << 14);
					} else if ((Static11.anInt335 & 0x4) == 4) {
						Static118.method2137(local43, 53, Static60.method1211(new Class60[] { Static96.aClass60_1181, Static118.aClass60_1347, local80.aClass60_1425 }), local49, Static73.aClass60_998, local39);
					}
				}
				@Pc(296) int local296;
				@Pc(304) Class3_Sub1_Sub1_Sub3_Sub2 local304;
				@Pc(353) Class3_Sub1_Sub1_Sub3_Sub1 local353;
				if (local55 == 1) {
					@Pc(273) Class3_Sub1_Sub1_Sub3_Sub2 local273 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local61];
					if (local273.aClass3_Sub1_Sub16_1.anInt3167 == 1 && (local273.anInt1524 & 0x7F) == 64 && (local273.anInt1494 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static20.anInt829; local296++) {
							local304 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[Static128.anIntArray390[local296]];
							if (local304 != null && local273 != local304 && local304.aClass3_Sub1_Sub16_1.anInt3167 == 1 && local304.anInt1524 == local273.anInt1524 && local273.anInt1494 == local304.anInt1494) {
								Static129.method2296(local43, local304.aClass3_Sub1_Sub16_1, Static128.anIntArray390[local296], local49);
							}
						}
						for (local146 = 0; local146 < Static53.anInt1744; local146++) {
							local353 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static14.anIntArray56[local146]];
							if (local353 != null && local353.anInt1524 == local273.anInt1524 && local353.anInt1494 == local273.anInt1494) {
								Static123.method2249(local49, local43, local353, Static14.anIntArray56[local146]);
							}
						}
					}
					Static129.method2296(local43, local273.aClass3_Sub1_Sub16_1, local61, local49);
				}
				if (local55 == 0) {
					@Pc(401) Class3_Sub1_Sub1_Sub3_Sub1 local401 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local61];
					if ((local401.anInt1524 & 0x7F) == 64 && (local401.anInt1494 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static20.anInt829; local296++) {
							local304 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[Static128.anIntArray390[local296]];
							if (local304 != null && local304.aClass3_Sub1_Sub16_1.anInt3167 == 1 && local401.anInt1524 == local304.anInt1524 && local304.anInt1494 == local401.anInt1494) {
								Static129.method2296(local43, local304.aClass3_Sub1_Sub16_1, Static128.anIntArray390[local296], local49);
							}
						}
						for (local146 = 0; local146 < Static53.anInt1744; local146++) {
							local353 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static14.anIntArray56[local146]];
							if (local353 != null && local353 != local401 && local353.anInt1524 == local401.anInt1524 && local401.anInt1494 == local353.anInt1494) {
								Static123.method2249(local49, local43, local353, Static14.anIntArray56[local146]);
							}
						}
					}
					Static123.method2249(local49, local43, local401, local61);
				}
				if (local55 == 3) {
					@Pc(525) Class5 local525 = Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local43][local49];
					if (local525 != null) {
						for (@Pc(532) Class3_Sub1_Sub1_Sub1 local532 = (Class3_Sub1_Sub1_Sub1) local525.method94(); local532 != null; local532 = (Class3_Sub1_Sub1_Sub1) local525.method79()) {
							@Pc(539) Class3_Sub1_Sub11 local539 = Static22.method568(local532.anInt122);
							if (Static73.anInt2349 == 1) {
								Static118.method2137(local43, 18, Static60.method1211(new Class60[] { Static124.aClass60_1361, Static75.aClass60_1019, local539.aClass60_816 }), local49, Static8.aClass60_131, local532.anInt122);
							} else if (!Static72.aBoolean85) {
								@Pc(553) Class60[] local553 = local539.aClass60Array8;
								if (Static120.aBoolean120) {
									local553 = Static28.method2224(local553);
								}
								for (@Pc(561) int local561 = 4; local561 >= 0; local561--) {
									if (local553 != null && local553[local561] != null) {
										@Pc(605) byte local605 = 0;
										if (local561 == 0) {
											local605 = 1;
										}
										if (local561 == 1) {
											local605 = 37;
										}
										if (local561 == 2) {
											local605 = 42;
										}
										if (local561 == 3) {
											local605 = 46;
										}
										if (local561 == 4) {
											local605 = 4;
										}
										Static118.method2137(local43, local605, Static60.method1211(new Class60[] { Static46.aClass60_633, local539.aClass60_816 }), local49, local553[local561], local532.anInt122);
									} else if (local561 == 2) {
										Static118.method2137(local43, 42, Static60.method1211(new Class60[] { Static46.aClass60_633, local539.aClass60_816 }), local49, Static11.aClass60_148, local532.anInt122);
									}
								}
								Static118.method2137(local43, 1004, Static60.method1211(new Class60[] { Static46.aClass60_633, local539.aClass60_816 }), local49, Static39.aClass60_542, local532.anInt122);
							} else if ((Static11.anInt335 & 0x1) == 1) {
								Static118.method2137(local43, 48, Static60.method1211(new Class60[] { Static96.aClass60_1181, Static75.aClass60_1019, local539.aClass60_816 }), local49, Static73.aClass60_998, local532.anInt122);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "(I)V")
	public static void method1245() {
		Static79.aClass17_41.method646();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!jb;BLclient!jb;Lclient!jb;)V")
	public static void method1246(@OriginalArg(0) Class25 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		Static64.aClass25_18 = arg0;
		Static65.aClass25_19 = arg1;
		Static63.aClass25_28 = arg2;
		Static120.aClass3_Sub15ArrayArray1 = new Class3_Sub15[Static63.aClass25_28.method910()][];
		Static20.aBooleanArray20 = new boolean[Static63.aClass25_28.method910()];
	}

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "(I)V")
	public static void method1248() {
		@Pc(1) Object local1 = Static52.anObject3;
		synchronized (Static52.anObject3) {
			if (Static97.anInt2770 == 0) {
				Static35.aClass74_1.method2122(new Class45(), 5);
			}
			Static97.anInt2770 = 600;
		}
	}

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "(I)V")
	public static void method1251() {
		aClass3_Sub14_1 = null;
		aClass17_32 = null;
		aClass60_854 = null;
		aClass60_852 = null;
		aClass60_850 = null;
		aClass60_851 = null;
		aClass60_853 = null;
		aClass60_849 = null;
		aClass16_46 = null;
	}
}
