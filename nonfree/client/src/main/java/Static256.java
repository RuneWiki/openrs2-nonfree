import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "Lclient!un;")
	public static Class1_Sub8_Sub4 aClass1_Sub8_Sub4_3;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Lclient!og;")
	public static Class127 aClass127_11;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray13 = new byte[50][];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ak;I)V")
	public static void method3979(@OriginalArg(0) Class7 arg0) {
		Static278.aClass7_225 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)Lclient!em;")
	public static Class48 method3980() {
		@Pc(29) Class48 local29;
		if (Static240.aBoolean369) {
			local29 = new Class48_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], Static299.aByteArrayArray15[0], Static158.anIntArray366);
		} else {
			local29 = new Class48_Sub2(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], Static299.aByteArrayArray15[0], Static158.anIntArray366);
		}
		Static247.method3867();
		return local29;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BJ)V")
	public static void method3981(@OriginalArg(1) long arg0) {
		if (Static109.anInt2057 == 1 || Static109.anInt2057 == 5) {
			Static151.method2345(arg0);
		} else if (Static109.anInt2057 == 2) {
			Static218.method964();
		} else {
			Static199.method3037();
		}
		if (!Static192.aBoolean414) {
			Static276.aShortArray92[0] = 1003;
			Static29.anInt626 = 1;
			Static64.anIntArray148[0] = Static223.anInt4684;
			if (Static270.anInt5407 != 0) {
				Static223.anInt4678 = Static119.anInt4988;
				Static54.anInt1146 = Static279.anInt5594;
			} else if (Static143.anInt2663 == 0) {
				Static223.anInt4678 = Static293.anInt5833;
				Static54.anInt1146 = Static224.anInt4700;
			} else {
				Static54.anInt1146 = Static207.anInt4122;
				Static223.anInt4678 = Static72.anInt1427;
			}
			Static277.aStringArray35[0] = Static174.aString110;
			Static190.aStringArray19[0] = "";
		}
		if (Static121.anInt2350 != -1) {
			Static39.method719(Static121.anInt2350);
		}
		@Pc(80) int local80;
		for (local80 = 0; local80 < Static166.anInt3059; local80++) {
			if (Static267.aBooleanArray25[local80]) {
				Static260.aBooleanArray24[local80] = true;
			}
			Static44.aBooleanArray5[local80] = Static267.aBooleanArray25[local80];
			Static267.aBooleanArray25[local80] = false;
		}
		Static162.anInt2990 = -1;
		if (Static240.aBoolean369) {
			Static29.aBoolean56 = true;
		}
		Static267.aClass127_14 = null;
		Static93.anInt1770 = -1;
		aClass127_11 = null;
		Static51.anInt1077 = Static261.anInt5259;
		if (Static121.anInt2350 != -1) {
			Static166.anInt3059 = 0;
			Static54.method925();
		}
		if (Static240.aBoolean369) {
			Static50.method869();
		} else {
			Static213.method3371();
		}
		Static280.method4297();
		if (Static192.aBoolean414) {
			if (Static91.aBoolean128) {
				Static189.method2840();
			} else {
				Static171.method2603();
			}
		} else if (Static267.aClass127_14 != null) {
			Static198.method3032(Static147.anInt2706, Static267.aClass127_14, Static158.anInt2964);
		} else if (Static162.anInt2990 != -1) {
			Static198.method3032(Static93.anInt1770, null, Static162.anInt2990);
		}
		local80 = Static192.aBoolean414 ? -1 : Static112.method1748();
		if (local80 == -1) {
			local80 = Static186.anInt3489;
		}
		Static257.method3986(local80);
		if (Static121.anInt2351 == 1) {
			Static121.anInt2351 = 2;
		}
		if (Static242.anInt4996 == 1) {
			Static242.anInt4996 = 2;
		}
		if (Static58.anInt1223 == 3) {
			for (@Pc(211) int local211 = 0; local211 < Static166.anInt3059; local211++) {
				if (Static44.aBooleanArray5[local211]) {
					if (Static240.aBoolean369) {
						Static50.method871(Static174.anIntArray383[local211], Static217.anIntArray514[local211], Static171.anIntArray380[local211], Static38.anIntArray118[local211], 16711935, 128);
					} else {
						Static213.method3374(Static174.anIntArray383[local211], Static217.anIntArray514[local211], Static171.anIntArray380[local211], Static38.anIntArray118[local211], 16711935, 128);
					}
				} else if (Static260.aBooleanArray24[local211]) {
					if (Static240.aBoolean369) {
						Static50.method871(Static174.anIntArray383[local211], Static217.anIntArray514[local211], Static171.anIntArray380[local211], Static38.anIntArray118[local211], 16711680, 128);
					} else {
						Static213.method3374(Static174.anIntArray383[local211], Static217.anIntArray514[local211], Static171.anIntArray380[local211], Static38.anIntArray118[local211], 16711680, 128);
					}
				}
			}
		}
		Static90.method3586(Static159.anInt2978, Static47.anInt5866, Static28.aClass6_Sub6_Sub2_1.anInt4562, Static28.aClass6_Sub6_Sub2_1.anInt4569);
		Static47.anInt5866 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method3982() {
		Static196.method2977();
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			Static27.aClass2Array1[local14].method110();
		}
		System.gc();
	}
}
