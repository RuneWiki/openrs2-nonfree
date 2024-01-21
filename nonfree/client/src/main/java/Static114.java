import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1449 = Static14.method2017("T");

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
	public static int anInt2982 = 0;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1450 = Static14.method2017("leuchten2:");

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1451 = Static14.method2017("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1452 = Static14.method2017("Name eingeben:");

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1453 = Static14.method2017("Select");

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1454 = aClass36_1453;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
	public static void method2074() {
		aClass36_1454 = null;
		aBigInteger4 = null;
		aClass36_1451 = null;
		aClass36_1449 = null;
		aClass36_1450 = null;
		aClass36_1453 = null;
		aClass36_1452 = null;
		aBooleanArray15 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method2075() {
		Static105.aBoolean126 = true;
		Static33.method326();
		if (Static16.aBoolean8) {
			Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static105.aClass36_1343, 239, 40, 0);
			Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static49.method949(new Class36[] { Static105.aClass36_1347, Static18.aClass36_233 }), 239, 60, 128);
		} else if (Static32.anInt910 == 1) {
			Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static17.aClass36_225, 239, 40, 0);
			Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static49.method949(new Class36[] { Static105.aClass36_1346, Static18.aClass36_233 }), 239, 60, 128);
		} else if (Static32.anInt910 == 2) {
			Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static27.aClass36_395, 239, 40, 0);
			Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static49.method949(new Class36[] { Static105.aClass36_1346, Static18.aClass36_233 }), 239, 60, 128);
		} else {
			@Pc(67) Class2_Sub1_Sub1_Sub2 local67;
			@Pc(74) int local74;
			@Pc(85) int local85;
			if (Static32.anInt910 == 3) {
				if (Static105.aClass36_1350 != Static105.aClass36_1346) {
					Static59.method1106(Static105.aClass36_1346);
					Static105.aClass36_1350 = Static105.aClass36_1346;
				}
				local67 = Static11.aClass2_Sub1_Sub1_Sub2_1;
				Static54.method1577(0, 0, 463, 77);
				for (local74 = 0; local74 < Static118.anInt2997; local74++) {
					local85 = local74 * 14 + 18 - Static105.anInt2727;
					if (local85 > 0 && local85 < 110) {
						local67.method454(Static63.aClass36Array29[local74], 239, local85, 0);
					}
				}
				Static54.method1589();
				if (Static118.anInt2997 > 5) {
					Static92.method1683(Static105.anInt2727, 0, Static118.anInt2997 * 14 + 7, 77, 463);
				}
				if (Static105.aClass36_1346.method1028() == 0) {
					Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static55.aClass36_1323, 239, 40, 255);
				} else if (Static118.anInt2997 == 0) {
					Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static97.aClass36_1247, 239, 40, 0);
				}
				local67.method454(Static49.method949(new Class36[] { Static105.aClass36_1346, Static18.aClass36_233 }), 239, 90, 0);
				Static54.method1578(0, 77, 479, 0);
			} else if (Static90.aClass36_1092 == null) {
				@Pc(208) boolean local208;
				if (Static49.anInt1312 != -1) {
					local208 = Static81.method1494(96, 479, 2, Static49.anInt1312);
					if (!local208) {
						Static115.aBoolean77 = true;
					}
				} else if (Static39.anInt980 == -1) {
					local67 = Static11.aClass2_Sub1_Sub1_Sub2_1;
					Static54.method1577(0, 0, 463, 77);
					local74 = 0;
					for (local85 = 0; local85 < 100; local85++) {
						if (Static99.aClass36Array35[local85] != null) {
							@Pc(240) int local240 = Static92.anInt2407 + 70 - local74 * 14;
							@Pc(244) int local244 = Static88.anIntArray270[local85];
							@Pc(246) byte local246 = 0;
							@Pc(250) Class36 local250 = Static8.aClass36Array5[local85];
							if (local250 != null && local250.method1042(Static95.aClass36_1209)) {
								local246 = 1;
								local250 = local250.method1020(5);
							}
							if (local250 != null && local250.method1042(Static29.aClass36_421)) {
								local250 = local250.method1020(5);
								local246 = 2;
							}
							if (local244 == 0) {
								if (local240 > 0 && local240 < 110) {
									local67.method456(Static99.aClass36Array35[local85], 4, local240, 0);
								}
								local74++;
							}
							@Pc(325) int local325;
							if ((local244 == 1 || local244 == 2) && (local244 == 1 || Static15.anInt316 == 0 || Static15.anInt316 == 1 && Static26.method549(local250))) {
								if (local240 > 0 && local240 < 110) {
									local325 = 4;
									if (local246 == 1) {
										Static4.aClass2_Sub1_Sub1_Sub1Array5[0].method97(4, local240 - 12);
										local325 += 14;
									}
									if (local246 == 2) {
										Static4.aClass2_Sub1_Sub1_Sub1Array5[1].method97(local325, local240 - 12);
										local325 += 14;
									}
									local67.method456(Static49.method949(new Class36[] { local250, Static63.aClass36_785 }), local325, local240, 0);
									local325 += local67.method458(local250) + 8;
									local67.method456(Static99.aClass36Array35[local85], local325, local240, 255);
								}
								local74++;
							}
							if ((local244 == 3 || local244 == 7) && Static40.anInt2199 == 0 && (local244 == 7 || Static3.anInt1302 == 0 || Static3.anInt1302 == 1 && Static26.method549(local250))) {
								if (local240 > 0 && local240 < 110) {
									local67.method456(Static63.aClass36_787, 4, local240, 0);
									local325 = local67.method458(Static63.aClass36_787) + 4;
									local325 += local67.method460(32);
									if (local246 == 1) {
										Static4.aClass2_Sub1_Sub1_Sub1Array5[0].method97(local325, local240 - 12);
										local325 += 14;
									}
									if (local246 == 2) {
										Static4.aClass2_Sub1_Sub1_Sub1Array5[1].method97(local325, local240 - 12);
										local325 += 14;
									}
									local67.method456(Static49.method949(new Class36[] { local250, Static63.aClass36_785 }), local325, local240, 0);
									local325 += local67.method458(local250) + 8;
									local67.method456(Static99.aClass36Array35[local85], local325, local240, 8388608);
								}
								local74++;
							}
							if (local244 == 4 && (Static45.anInt1225 == 0 || Static45.anInt1225 == 1 && Static26.method549(local250))) {
								if (local240 > 0 && local240 < 110) {
									local67.method456(Static49.method949(new Class36[] { local250, Static34.aClass36_479, Static99.aClass36Array35[local85] }), 4, local240, 8388736);
								}
								local74++;
							}
							if (local244 == 5 && Static40.anInt2199 == 0 && Static3.anInt1302 < 2) {
								if (local240 > 0 && local240 < 110) {
									local67.method456(Static99.aClass36Array35[local85], 4, local240, 8388608);
								}
								local74++;
							}
							if (local244 == 6 && Static40.anInt2199 == 0 && Static3.anInt1302 < 2) {
								local74++;
								if (local240 > 0 && local240 < 110) {
									local67.method456(Static49.method949(new Class36[] { Static62.aClass36_772, Static34.aClass36_479, local250, Static63.aClass36_785 }), 4, local240, 0);
									local67.method456(Static99.aClass36Array35[local85], local67.method458(Static49.method949(new Class36[] { Static62.aClass36_772, Static34.aClass36_479, local250 })) + 12, local240, 8388608);
								}
							}
							if (local244 == 8 && (Static45.anInt1225 == 0 || Static45.anInt1225 == 1 && Static26.method549(local250))) {
								if (local240 > 0 && local240 < 110) {
									local67.method456(Static49.method949(new Class36[] { local250, Static34.aClass36_479, Static99.aClass36Array35[local85] }), 4, local240, 8270336);
								}
								local74++;
							}
						}
					}
					Static54.method1589();
					Static86.anInt2234 = local74 * 14 + 7;
					if (Static86.anInt2234 < 78) {
						Static86.anInt2234 = 78;
					}
					Static92.method1683(Static86.anInt2234 - Static92.anInt2407 - 77, 0, Static86.anInt2234, 77, 463);
					@Pc(730) Class36 local730;
					if (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3 == null || Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass36_1027 == null) {
						local730 = Static15.aClass36_186;
					} else {
						local730 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass36_1027;
					}
					local67.method456(Static49.method949(new Class36[] { local730, Static63.aClass36_785 }), 4, 90, 0);
					local67.method456(Static49.method949(new Class36[] { Static105.aClass36_1345, Static18.aClass36_233 }), local67.method458(Static49.method949(new Class36[] { local730, Static118.aClass36_1463 })) + 6, 90, 255);
					Static54.method1578(0, 77, 479, 0);
				} else {
					local208 = Static81.method1494(96, 479, 3, Static39.anInt980);
					if (!local208) {
						Static115.aBoolean77 = true;
					}
				}
			} else {
				Static97.aClass2_Sub1_Sub1_Sub2_4.method465(Static90.aClass36_1092, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static97.aClass2_Sub1_Sub1_Sub2_4.method454(Static4.aClass36_67, 239, 80, 128);
			}
		}
		if (Static73.aBoolean82 && Static24.anInt620 == 2) {
			Static95.method1789();
		}
		Static51.method1831();
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] method2076() {
		@Pc(8) Class2_Sub1_Sub1_Sub1[] local8 = new Class2_Sub1_Sub1_Sub1[Static79.anInt2057];
		for (@Pc(15) int local15 = 0; local15 < Static79.anInt2057; local15++) {
			@Pc(25) Class2_Sub1_Sub1_Sub1 local25 = local8[local15] = new Class2_Sub1_Sub1_Sub1();
			local25.anInt90 = Static96.anInt2558;
			local25.anInt91 = Static10.anInt247;
			local25.anInt92 = Static27.anIntArray60[local15];
			local25.anInt95 = Static64.anIntArray204[local15];
			local25.anInt94 = Static92.anIntArray293[local15];
			local25.anInt93 = Static36.anIntArray132[local15];
			local25.anIntArray8 = Static43.anIntArray161;
			local25.aByteArray1 = Static42.aByteArrayArray19[local15];
		}
		Static40.method1545();
		return local8;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JB)Lclient!kc;")
	public static Class36 method2077(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) long local35 = arg0;
			@Pc(37) int local37 = 0;
			while (local35 != 0L) {
				local37++;
				local35 /= 37L;
			}
			@Pc(51) byte[] local51 = new byte[local37];
			while (arg0 != 0L) {
				@Pc(55) long local55 = arg0;
				arg0 /= 37L;
				local37--;
				local51[local37] = Static63.aByteArray10[(int) (local55 - arg0 * 37L)];
			}
			@Pc(80) Class36 local80 = new Class36();
			local80.aByteArray9 = local51;
			local80.anInt1442 = local51.length;
			return local80;
		}
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
	public static void method2078() {
		for (@Pc(15) int local15 = 0; local15 < Static108.anInt2775; local15++) {
			@Pc(21) int local21 = Static51.anIntArray316[local15];
			@Pc(25) Class2_Sub1_Sub4_Sub2_Sub1 local25 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local21];
			if (local25 != null) {
				Static95.method1787(local25.aClass2_Sub1_Sub9_1.anInt1528, local25);
			}
		}
	}
}
