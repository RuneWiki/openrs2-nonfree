import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	public static int anInt2573 = 0;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "Lclient!th;")
	public static Class169 aClass169_72 = new Class169(64);

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
	public static int anInt2576 = 0;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString92 = "Loaded update list";

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)Lclient!ub;")
	public static Class1_Sub1_Sub22 method2050(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub1_Sub22 local16 = (Class1_Sub1_Sub22) Static243.aClass58_14.method1233((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) byte[] local31 = Static109.aClass138_37.method3346(Static127.method2018(arg0), Static200.method4452(arg0));
		local16 = new Class1_Sub1_Sub22();
		if (local31 != null) {
			local16.method4179(new Class1_Sub14(local31));
		}
		Static243.aClass58_14.method1229((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	public static void method2051() {
		Static282.aClass169_150.method4018();
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "()V")
	public static void method2052() {
		Static239.anInt4831 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static208.anInt4105; local3++) {
			@Pc(10) Class47 local10 = Static198.aClass47Array6[local3];
			@Pc(14) int local14;
			if (Static66.anIntArray104 != null) {
				for (local14 = 0; local14 < Static66.anIntArray104.length; local14++) {
					if (Static66.anIntArray104[local14] != -1000000 && (local10.anInt1341 <= Static66.anIntArray104[local14] || local10.anInt1345 <= Static66.anIntArray104[local14]) && (local10.anInt1347 <= Static286.anIntArray497[local14] || local10.anInt1342 <= Static286.anIntArray497[local14]) && (local10.anInt1347 >= Static261.anIntArray454[local14] || local10.anInt1342 >= Static261.anIntArray454[local14]) && (local10.anInt1357 <= Static309.anIntArray528[local14] || local10.anInt1349 <= Static309.anIntArray528[local14]) && (local10.anInt1357 >= Static141.anIntArray225[local14] || local10.anInt1349 >= Static141.anIntArray225[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt1355 == 1) {
				local14 = local10.anInt1360 + Static59.anInt1196 - Static257.anInt5014;
				if (local14 >= 0 && local14 <= Static59.anInt1196 + Static59.anInt1196) {
					local115 = local10.anInt1354 + Static59.anInt1196 - Static198.anInt3993;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1333 + Static59.anInt1196 - Static198.anInt3993;
					if (local126 > Static59.anInt1196 + Static59.anInt1196) {
						local126 = Static59.anInt1196 + Static59.anInt1196;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static48.aBooleanArrayArray1[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static16.anInt247 - local10.anInt1347;
						if (local158 > 32) {
							local10.anInt1352 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1352 = 2;
							local158 = -local158;
						}
						local10.anInt1361 = (local10.anInt1357 - Static245.anInt2378 << 8) / local158;
						local10.anInt1343 = (local10.anInt1349 - Static245.anInt2378 << 8) / local158;
						local10.anInt1340 = (local10.anInt1341 - Static273.anInt5205 << 8) / local158;
						local10.anInt1338 = (local10.anInt1345 - Static273.anInt5205 << 8) / local158;
						Static64.aClass47Array5[Static239.anInt4831++] = local10;
					}
				}
			} else if (local10.anInt1355 == 2) {
				local14 = local10.anInt1354 + Static59.anInt1196 - Static198.anInt3993;
				if (local14 >= 0 && local14 <= Static59.anInt1196 + Static59.anInt1196) {
					local115 = local10.anInt1360 + Static59.anInt1196 - Static257.anInt5014;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1351 + Static59.anInt1196 - Static257.anInt5014;
					if (local126 > Static59.anInt1196 + Static59.anInt1196) {
						local126 = Static59.anInt1196 + Static59.anInt1196;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static48.aBooleanArrayArray1[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static245.anInt2378 - local10.anInt1357;
						if (local158 > 32) {
							local10.anInt1352 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1352 = 4;
							local158 = -local158;
						}
						local10.anInt1353 = (local10.anInt1347 - Static16.anInt247 << 8) / local158;
						local10.anInt1356 = (local10.anInt1342 - Static16.anInt247 << 8) / local158;
						local10.anInt1340 = (local10.anInt1341 - Static273.anInt5205 << 8) / local158;
						local10.anInt1338 = (local10.anInt1345 - Static273.anInt5205 << 8) / local158;
						Static64.aClass47Array5[Static239.anInt4831++] = local10;
					}
				}
			} else if (local10.anInt1355 == 4) {
				local14 = local10.anInt1341 - Static273.anInt5205;
				if (local14 > 128) {
					local115 = local10.anInt1354 + Static59.anInt1196 - Static198.anInt3993;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1333 + Static59.anInt1196 - Static198.anInt3993;
					if (local126 > Static59.anInt1196 + Static59.anInt1196) {
						local126 = Static59.anInt1196 + Static59.anInt1196;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt1360 + Static59.anInt1196 - Static257.anInt5014;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt1351 + Static59.anInt1196 - Static257.anInt5014;
						if (local158 > Static59.anInt1196 + Static59.anInt1196) {
							local158 = Static59.anInt1196 + Static59.anInt1196;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static48.aBooleanArrayArray1[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt1352 = 5;
							local10.anInt1353 = (local10.anInt1347 - Static16.anInt247 << 8) / local14;
							local10.anInt1356 = (local10.anInt1342 - Static16.anInt247 << 8) / local14;
							local10.anInt1361 = (local10.anInt1357 - Static245.anInt2378 << 8) / local14;
							local10.anInt1343 = (local10.anInt1349 - Static245.anInt2378 << 8) / local14;
							Static64.aClass47Array5[Static239.anInt4831++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!qf;I)Z")
	public static boolean method2054(@OriginalArg(0) Class146 arg0) {
		if (arg0.anIntArray352 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray352.length; local17++) {
			@Pc(31) int local31 = Static147.method2367(local17, arg0);
			@Pc(36) int local36 = arg0.anIntArray360[local17];
			if (arg0.anIntArray352[local17] == 2) {
				if (local36 <= local31) {
					return false;
				}
			} else if (arg0.anIntArray352[local17] == 3) {
				if (local36 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray352[local17] == 4) {
				if (local31 == local36) {
					return false;
				}
			} else if (local31 != local36) {
				return false;
			}
		}
		return true;
	}
}
