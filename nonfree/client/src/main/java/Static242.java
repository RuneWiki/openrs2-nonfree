import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Lclient!cg;")
	public static Class22 aClass22_80;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
	public static int anInt4775;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	public static int anInt4776;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
	public static int[] anIntArray380 = new int[100];

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Lclient!ul;")
	public static Class172 aClass172_39 = new Class172(30);

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
	public static int anInt4773 = -1;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString158 = "wave2:";

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public static int anInt4774 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	public static void method3715() {
		Static153.anInt3108 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static287.anInt5606; local3++) {
			@Pc(10) Class75 local10 = Static309.aClass75Array2[local3];
			@Pc(14) int local14;
			if (Static209.anIntArray341 != null) {
				for (local14 = 0; local14 < Static209.anIntArray341.length; local14++) {
					if (Static209.anIntArray341[local14] != -1000000 && (local10.anInt2347 <= Static209.anIntArray341[local14] || local10.anInt2345 <= Static209.anIntArray341[local14]) && (local10.anInt2336 <= Static173.anIntArray294[local14] || local10.anInt2352 <= Static173.anIntArray294[local14]) && (local10.anInt2336 >= Static244.anIntArray381[local14] || local10.anInt2352 >= Static244.anIntArray381[local14]) && (local10.anInt2346 <= Static208.anIntArray339[local14] || local10.anInt2339 <= Static208.anIntArray339[local14]) && (local10.anInt2346 >= Static8.anIntArray6[local14] || local10.anInt2339 >= Static8.anIntArray6[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt2340 == 1) {
				local14 = local10.anInt2350 + Static133.anInt2661 - Static279.anInt5465;
				if (local14 >= 0 && local14 <= Static133.anInt2661 + Static133.anInt2661) {
					local115 = local10.anInt2337 + Static133.anInt2661 - Static91.anInt1810;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt2329 + Static133.anInt2661 - Static91.anInt1810;
					if (local126 > Static133.anInt2661 + Static133.anInt2661) {
						local126 = Static133.anInt2661 + Static133.anInt2661;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static202.aBooleanArrayArray4[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static54.anInt1239 - local10.anInt2336;
						if (local158 > 32) {
							local10.anInt2349 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt2349 = 2;
							local158 = -local158;
						}
						local10.anInt2338 = (local10.anInt2346 - Static179.anInt3613 << 8) / local158;
						local10.anInt2351 = (local10.anInt2339 - Static179.anInt3613 << 8) / local158;
						local10.anInt2334 = (local10.anInt2347 - Static222.anInt4471 << 8) / local158;
						local10.anInt2332 = (local10.anInt2345 - Static222.anInt4471 << 8) / local158;
						Static280.aClass75Array3[Static153.anInt3108++] = local10;
					}
				}
			} else if (local10.anInt2340 == 2) {
				local14 = local10.anInt2337 + Static133.anInt2661 - Static91.anInt1810;
				if (local14 >= 0 && local14 <= Static133.anInt2661 + Static133.anInt2661) {
					local115 = local10.anInt2350 + Static133.anInt2661 - Static279.anInt5465;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt2335 + Static133.anInt2661 - Static279.anInt5465;
					if (local126 > Static133.anInt2661 + Static133.anInt2661) {
						local126 = Static133.anInt2661 + Static133.anInt2661;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static202.aBooleanArrayArray4[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static179.anInt3613 - local10.anInt2346;
						if (local158 > 32) {
							local10.anInt2349 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt2349 = 4;
							local158 = -local158;
						}
						local10.anInt2328 = (local10.anInt2336 - Static54.anInt1239 << 8) / local158;
						local10.anInt2341 = (local10.anInt2352 - Static54.anInt1239 << 8) / local158;
						local10.anInt2334 = (local10.anInt2347 - Static222.anInt4471 << 8) / local158;
						local10.anInt2332 = (local10.anInt2345 - Static222.anInt4471 << 8) / local158;
						Static280.aClass75Array3[Static153.anInt3108++] = local10;
					}
				}
			} else if (local10.anInt2340 == 4) {
				local14 = local10.anInt2347 - Static222.anInt4471;
				if (local14 > 128) {
					local115 = local10.anInt2337 + Static133.anInt2661 - Static91.anInt1810;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt2329 + Static133.anInt2661 - Static91.anInt1810;
					if (local126 > Static133.anInt2661 + Static133.anInt2661) {
						local126 = Static133.anInt2661 + Static133.anInt2661;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt2350 + Static133.anInt2661 - Static279.anInt5465;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt2335 + Static133.anInt2661 - Static279.anInt5465;
						if (local158 > Static133.anInt2661 + Static133.anInt2661) {
							local158 = Static133.anInt2661 + Static133.anInt2661;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static202.aBooleanArrayArray4[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt2349 = 5;
							local10.anInt2328 = (local10.anInt2336 - Static54.anInt1239 << 8) / local14;
							local10.anInt2341 = (local10.anInt2352 - Static54.anInt1239 << 8) / local14;
							local10.anInt2338 = (local10.anInt2346 - Static179.anInt3613 << 8) / local14;
							local10.anInt2351 = (local10.anInt2339 - Static179.anInt3613 << 8) / local14;
							Static280.aClass75Array3[Static153.anInt3108++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "()V")
	public static void method3716() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static75.aClass4_Sub21ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static75.aClass4_Sub21ArrayArrayArray1.length; local3++) {
				for (local9 = 0; local9 < Static246.anInt4853; local9++) {
					for (local14 = 0; local14 < Static64.anInt1393; local14++) {
						Static75.aClass4_Sub21ArrayArrayArray1[local3][local9][local14] = null;
					}
				}
			}
		}
		Static213.aClass4_Sub8ArrayArray2 = null;
		if (Static199.aClass4_Sub21ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static199.aClass4_Sub21ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static246.anInt4853; local9++) {
					for (local14 = 0; local14 < Static64.anInt1393; local14++) {
						Static199.aClass4_Sub21ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static244.aClass4_Sub8ArrayArray3 = null;
		Static287.anInt5606 = 0;
		if (Static309.aClass75Array2 != null) {
			for (local3 = 0; local3 < Static287.anInt5606; local3++) {
				Static309.aClass75Array2[local3] = null;
			}
		}
		if (Static181.aClass99Array36 != null) {
			for (local3 = 0; local3 < Static69.anInt1421; local3++) {
				Static181.aClass99Array36[local3] = null;
			}
			Static69.anInt1421 = 0;
		}
		if (Static102.aClass99Array13 != null) {
			for (local3 = 0; local3 < Static102.aClass99Array13.length; local3++) {
				Static102.aClass99Array13[local3] = null;
			}
		}
	}
}
