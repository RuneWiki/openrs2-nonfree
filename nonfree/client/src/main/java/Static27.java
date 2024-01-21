import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!eb", name = "db", descriptor = "Lclient!gd;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	public static final int anInt963 = 5063219;

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lclient!he;")
	private static Class26 aClass26_470 = Static6.method100("Loaded wordpack");

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_466 = aClass26_470;

	@OriginalMember(owner = "client!eb", name = "bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_467 = Static6.method100("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!eb", name = "eb", descriptor = "Lclient!he;")
	public static Class26 aClass26_468 = Static6.method100(":chalreq:");

	@OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
	public static int anInt972 = 0;

	@OriginalMember(owner = "client!eb", name = "ob", descriptor = "Lclient!he;")
	public static Class26 aClass26_469 = Static6.method100("mapscene");

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	public static int anInt978 = 0;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB[Lclient!nc;)V")
	public static void method583(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub14[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
			@Pc(16) Class3_Sub14 local16 = arg1[local10];
			if (local16 != null) {
				if (local16.anInt2204 == 0) {
					if (local16.aClass3_Sub14Array2 != null) {
						method583(arg0, local16.aClass3_Sub14Array2);
					}
					@Pc(37) Class3_Sub17 local37 = (Class3_Sub17) Static52.aClass17_9.method599((long) local16.anInt2154);
					if (local37 != null) {
						Static96.method1776(arg0, local37.anInt2552);
					}
				}
				@Pc(56) Class3_Sub15 local56;
				if (arg0 == 0 && local16.anObjectArray4 != null) {
					local56 = new Class3_Sub15();
					local56.anObjectArray28 = local16.anObjectArray4;
					local56.aClass3_Sub14_11 = local16;
					Static28.method595(local56);
				}
				if (arg0 == 1 && local16.anObjectArray22 != null) {
					if (local16.anInt2150 >= 0) {
						@Pc(82) Class3_Sub14 local82 = Static100.method2212(local16.anInt2154);
						if (local82 == null || local82.aClass3_Sub14Array2 == null || local82.aClass3_Sub14Array2.length <= local16.anInt2150 || local16 != local82.aClass3_Sub14Array2[local16.anInt2150]) {
							continue;
						}
					}
					local56 = new Class3_Sub15();
					local56.aClass3_Sub14_11 = local16;
					local56.anObjectArray28 = local16.anObjectArray22;
					Static28.method595(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIB)V")
	public static void method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(16) Class3_Sub22 local16 = (Class3_Sub22) Static70.aClass65_38.method1958(); local16 != null; local16 = (Class3_Sub22) Static70.aClass65_38.method1962()) {
			if (local16.anInt3036 != -1 || local16.anIntArray366 != null) {
				@Pc(27) int local27 = 0;
				if (local16.anInt3029 < arg3) {
					local27 = arg3 - local16.anInt3029;
				} else if (local16.anInt3032 > arg3) {
					local27 = local16.anInt3032 - arg3;
				}
				if (local16.anInt3040 < arg2) {
					local27 += arg2 - local16.anInt3040;
				} else if (local16.anInt3039 > arg2) {
					local27 += local16.anInt3039 - arg2;
				}
				if (local27 - 64 > local16.anInt3027 || Static115.anInt3051 == 0 || arg0 != local16.anInt3033) {
					if (local16.aClass3_Sub3_Sub3_3 != null) {
						Static5.aClass3_Sub3_Sub2_63.method1074(local16.aClass3_Sub3_Sub3_3);
						local16.aClass3_Sub3_Sub3_3 = null;
					}
					if (local16.aClass3_Sub3_Sub3_2 != null) {
						Static5.aClass3_Sub3_Sub2_63.method1074(local16.aClass3_Sub3_Sub3_2);
						local16.aClass3_Sub3_Sub3_2 = null;
					}
				} else {
					local27 -= 64;
					if (local27 < 0) {
						local27 = 0;
					}
					@Pc(150) int local150 = (local16.anInt3027 - local27) * Static115.anInt3051 / local16.anInt3027;
					if (local16.aClass3_Sub3_Sub3_3 != null) {
						local16.aClass3_Sub3_Sub3_3.method1830(local150);
					} else if (local16.anInt3036 >= 0) {
						@Pc(168) Class36 local168 = Static136.method1154(Static107.aClass16_Sub1_16, local16.anInt3036, 0);
						if (local168 != null) {
							@Pc(175) Class3_Sub5_Sub1 local175 = local168.method1157().method1371(Static12.aClass9_1);
							@Pc(180) Class3_Sub3_Sub3 local180 = Static139.method1840(local175, local150);
							local180.method1829(-1);
							Static5.aClass3_Sub3_Sub2_63.method1072(local180);
							local16.aClass3_Sub3_Sub3_3 = local180;
						}
					}
					if (local16.aClass3_Sub3_Sub3_2 != null) {
						local16.aClass3_Sub3_Sub3_2.method1830(local150);
						if (!local16.aClass3_Sub3_Sub3_2.method2203()) {
							local16.aClass3_Sub3_Sub3_2 = null;
						}
					} else if (local16.anIntArray366 != null && (local16.anInt3041 -= arg1) <= 0) {
						@Pc(225) int local225 = (int) (Math.random() * (double) local16.anIntArray366.length);
						@Pc(233) Class36 local233 = Static136.method1154(Static107.aClass16_Sub1_16, local16.anIntArray366[local225], 0);
						if (local233 != null) {
							@Pc(240) Class3_Sub5_Sub1 local240 = local233.method1157().method1371(Static12.aClass9_1);
							@Pc(245) Class3_Sub3_Sub3 local245 = Static139.method1840(local240, local150);
							local245.method1829(0);
							Static5.aClass3_Sub3_Sub2_63.method1072(local245);
							local16.anInt3041 = (int) ((double) (local16.anInt3028 - local16.anInt3025) * Math.random()) + local16.anInt3025;
							local16.aClass3_Sub3_Sub3_2 = local245;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB)Lclient!he;")
	public static Class26 method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static62.aClass26_934;
		} else if (local7 < -6) {
			return Static7.aClass26_108;
		} else if (local7 < -3) {
			return Static69.aClass26_1338;
		} else if (local7 < 0) {
			return Static80.aClass26_1125;
		} else if (local7 > 9) {
			return Static80.aClass26_1120;
		} else if (local7 > 6) {
			return Static14.aClass26_210;
		} else if (local7 > 3) {
			return Static9.aClass26_134;
		} else if (local7 > 0) {
			return Static81.aClass26_1144;
		} else {
			return Static130.aClass26_1766;
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public static void method588() {
		Static131.anIntArray410 = new int[151];
		Static102.anIntArray336 = new int[33];
		Static78.anIntArray207 = new int[151];
		Static131.anIntArray409 = new int[33];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static4.aClass3_Sub1_Sub4_Sub1_1.aByteArray2[local27 + local19 * Static4.aClass3_Sub1_Sub4_Sub1_1.anInt509] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static102.anIntArray336[local19] = local23;
			Static131.anIntArray409[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local25 = 999;
			local27 = 0;
			for (@Pc(92) int local92 = 25; local92 < 172; local92++) {
				if (Static4.aClass3_Sub1_Sub4_Sub1_1.aByteArray2[local23 * Static4.aClass3_Sub1_Sub4_Sub1_1.anInt509 + local92] == 0 && (local92 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local92;
					}
				} else if (local25 != 999) {
					local27 = local92;
					break;
				}
			}
			Static131.anIntArray410[local23 - 5] = local25 - 25;
			Static78.anIntArray207[local23 - 5] = local27 - local25;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
	public static void method591() {
		aClass26_467 = null;
		aClass22_2 = null;
		aClass26_469 = null;
		aClass26_470 = null;
		aClass26_466 = null;
		aClass26_468 = null;
	}
}
