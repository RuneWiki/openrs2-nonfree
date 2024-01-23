import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString135 = "Members object";

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
	public static int anInt2368 = -1;

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "[I")
	public static int[] anIntArray211 = new int[200];

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "[I")
	public static int[] anIntArray212 = new int[2];

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "Lclient!in;")
	public static Class71 aClass71_12 = null;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
	public static void method1871() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(57) int local57;
		@Pc(49) int local49;
		@Pc(80) int local80;
		@Pc(53) int local53;
		if (Static201.anInt4077 == 7) {
			local12 = Static187.aClass1_Sub11_Sub1_2.method2690();
			local20 = Static135.anInt2980 + (local12 >> 4 & 0x7);
			local26 = Static49.anInt1133 + (local12 & 0x7);
			local30 = Static187.aClass1_Sub11_Sub1_2.method2691();
			local34 = Static187.aClass1_Sub11_Sub1_2.method2690();
			if (local30 == 65535) {
				local30 = -1;
			}
			local45 = local34 >> 4 & 0xF;
			local49 = Static187.aClass1_Sub11_Sub1_2.method2690();
			local53 = Static187.aClass1_Sub11_Sub1_2.method2690();
			local57 = local34 & 0x7;
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local80 = local45 + 1;
				if (Static197.aClass14_Sub2_Sub1_2.anIntArray415[0] >= local20 - local80 && Static197.aClass14_Sub2_Sub1_2.anIntArray415[0] <= local20 + local80 && Static197.aClass14_Sub2_Sub1_2.anIntArray418[0] >= local26 - local80 && local80 + local26 >= Static197.aClass14_Sub2_Sub1_2.anIntArray418[0] && Static119.anInt2761 != 0 && local57 > 0 && Static103.anInt2427 < 50 && local30 != -1) {
					Static252.anIntArray439[Static103.anInt2427] = local30;
					Static30.anIntArray298[Static103.anInt2427] = local57;
					Static192.anIntArray355[Static103.anInt2427] = local49;
					Static59.aClass169Array5[Static103.anInt2427] = null;
					Static256.anIntArray443[Static103.anInt2427] = (local20 << 16) - (-(local26 << 8) - local45);
					Static23.anIntArray57[Static103.anInt2427] = local53;
					Static103.anInt2427++;
				}
			}
		} else if (Static201.anInt4077 == 247) {
			local12 = Static187.aClass1_Sub11_Sub1_2.method2661();
			local20 = Static187.aClass1_Sub11_Sub1_2.method2654();
			local26 = (local20 >> 4 & 0x7) + Static135.anInt2980;
			local30 = Static49.anInt1133 + (local20 & 0x7);
			local34 = Static187.aClass1_Sub11_Sub1_2.method2691();
			local45 = Static187.aClass1_Sub11_Sub1_2.method2639();
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && local34 != Static71.anInt1526) {
				@Pc(238) Class14_Sub5 local238 = new Class14_Sub5();
				local238.anInt2755 = local45;
				local238.anInt2754 = local12;
				if (Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local26][local30] == null) {
					Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local26][local30] = new Class61();
				}
				Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local26][local30].method1839(new Class1_Sub2_Sub19(local238));
				Static183.method3509(local26, local30);
			}
		} else if (Static201.anInt4077 == 101) {
			local12 = Static187.aClass1_Sub11_Sub1_2.method2654();
			local26 = Static49.anInt1133 + (local12 & 0x7);
			local20 = (local12 >> 4 & 0x7) + Static135.anInt2980;
			local30 = Static187.aClass1_Sub11_Sub1_2.method2691();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(330) Class61 local330 = Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local20][local26];
				if (local330 != null) {
					for (@Pc(338) Class1_Sub2_Sub19 local338 = (Class1_Sub2_Sub19) local330.method1835(); local338 != null; local338 = (Class1_Sub2_Sub19) local330.method1836()) {
						if (local338.aClass14_Sub5_1.anInt2755 == (local30 & 0x7FFF)) {
							local338.method4441();
							break;
						}
					}
					if (local330.method1835() == null) {
						Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local20][local26] = null;
					}
					Static183.method3509(local20, local26);
				}
			}
		} else if (Static201.anInt4077 == 70) {
			local12 = Static187.aClass1_Sub11_Sub1_2.method2690();
			local20 = (local12 >> 4 & 0x7) + Static135.anInt2980;
			local26 = (local12 & 0x7) + Static49.anInt1133;
			local30 = Static187.aClass1_Sub11_Sub1_2.method2691();
			local34 = Static187.aClass1_Sub11_Sub1_2.method2690();
			local45 = Static187.aClass1_Sub11_Sub1_2.method2691();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local26 = local26 * 128 + 64;
				local20 = local20 * 128 + 64;
				@Pc(459) Class14_Sub7 local459 = new Class14_Sub7(local30, Static140.anInt3034, local20, local26, Static20.method383(local26, Static140.anInt3034, local20) - local34, local45, Static237.anInt4710);
				Static211.aClass61_23.method1839(new Class1_Sub2_Sub5(local459));
			}
		} else if (Static201.anInt4077 == 215) {
			local12 = Static187.aClass1_Sub11_Sub1_2.method2647();
			local20 = local12 >> 2;
			local26 = local12 & 0x3;
			local30 = Static23.anIntArray58[local20];
			local34 = Static187.aClass1_Sub11_Sub1_2.method2654();
			local57 = (local34 & 0x7) + Static49.anInt1133;
			local45 = (local34 >> 4 & 0x7) + Static135.anInt2980;
			local49 = Static187.aClass1_Sub11_Sub1_2.method2691();
			if (local45 >= 0 && local57 >= 0 && local45 < 104 && local57 < 104) {
				Static1.method3387(local30, local57, 0, local45, local26, local20, -1, Static140.anInt3034, local49);
			}
		} else {
			@Pc(613) int local613;
			@Pc(605) int local605;
			@Pc(609) int local609;
			@Pc(687) Class14_Sub4 local687;
			if (Static201.anInt4077 == 140) {
				local12 = Static187.aClass1_Sub11_Sub1_2.method2690();
				local20 = Static135.anInt2980 * 2 + (local12 >> 4 & 0xF);
				local26 = (local12 & 0xF) + Static49.anInt1133 * 2;
				local30 = Static187.aClass1_Sub11_Sub1_2.method2663() + local20;
				local34 = Static187.aClass1_Sub11_Sub1_2.method2663() + local26;
				local45 = Static187.aClass1_Sub11_Sub1_2.method2632();
				local57 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local49 = Static187.aClass1_Sub11_Sub1_2.method2690() * 4;
				local53 = Static187.aClass1_Sub11_Sub1_2.method2690() * 4;
				local80 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local605 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local609 = Static187.aClass1_Sub11_Sub1_2.method2690();
				local613 = Static187.aClass1_Sub11_Sub1_2.method2690();
				if (local609 == 255) {
					local609 = -1;
				}
				if (local20 >= 0 && local26 >= 0 && local20 < 208 && local26 < 208 && local30 >= 0 && local34 >= 0 && local30 < 208 && local34 < 208 && local57 != 65535) {
					local26 *= 64;
					local20 = local20 * 64;
					local687 = new Class14_Sub4(local57, Static140.anInt3034, local20, local26, Static20.method383(local26, Static140.anInt3034, local20) - local49, Static237.anInt4710 + local80, Static237.anInt4710 + local605, local609, local613, local45, local53);
					local34 *= 64;
					local30 = local30 * 64;
					local687.method1787(Static20.method383(local34, Static140.anInt3034, local30) - local53, local34, local30, local80 + Static237.anInt4710);
					Static201.aClass61_22.method1839(new Class1_Sub2_Sub8(local687));
				}
			} else if (Static201.anInt4077 == 136) {
				local12 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local20 = Static187.aClass1_Sub11_Sub1_2.method2690();
				Static183.method3511(local12).method4423(local20);
			} else if (Static201.anInt4077 == 197) {
				local12 = Static187.aClass1_Sub11_Sub1_2.method2675();
				local26 = local12 & 0x3;
				local20 = local12 >> 2;
				local30 = Static23.anIntArray58[local20];
				local34 = Static187.aClass1_Sub11_Sub1_2.method2654();
				local45 = (local34 >> 4 & 0x7) + Static135.anInt2980;
				local57 = Static49.anInt1133 + (local34 & 0x7);
				if (local45 >= 0 && local57 >= 0 && local45 < 104 && local57 < 104) {
					Static1.method3387(local30, local57, 0, local45, local26, local20, -1, Static140.anInt3034, -1);
				}
			} else if (Static201.anInt4077 == 159) {
				local12 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local20 = Static187.aClass1_Sub11_Sub1_2.method2675();
				local30 = (local20 & 0x7) + Static49.anInt1133;
				local26 = (local20 >> 4 & 0x7) + Static135.anInt2980;
				local34 = Static187.aClass1_Sub11_Sub1_2.method2661();
				if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
					@Pc(848) Class14_Sub5 local848 = new Class14_Sub5();
					local848.anInt2755 = local34;
					local848.anInt2754 = local12;
					if (Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local26][local30] == null) {
						Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local26][local30] = new Class61();
					}
					Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local26][local30].method1839(new Class1_Sub2_Sub19(local848));
					Static183.method3509(local26, local30);
				}
			} else if (Static201.anInt4077 == 111) {
				local12 = Static187.aClass1_Sub11_Sub1_2.method2690();
				local26 = Static49.anInt1133 + (local12 & 0x7);
				local20 = Static135.anInt2980 + (local12 >> 4 & 0x7);
				local30 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local34 = Static187.aClass1_Sub11_Sub1_2.method2691();
				local45 = Static187.aClass1_Sub11_Sub1_2.method2691();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					@Pc(953) Class61 local953 = Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local20][local26];
					if (local953 != null) {
						for (@Pc(961) Class1_Sub2_Sub19 local961 = (Class1_Sub2_Sub19) local953.method1835(); local961 != null; local961 = (Class1_Sub2_Sub19) local953.method1836()) {
							@Pc(966) Class14_Sub5 local966 = local961.aClass14_Sub5_1;
							if (local966.anInt2755 == (local30 & 0x7FFF) && local34 == local966.anInt2754) {
								local966.anInt2754 = local45;
								break;
							}
						}
						Static183.method3509(local20, local26);
					}
				}
			} else {
				@Pc(1064) int local1064;
				if (Static201.anInt4077 == 133) {
					@Pc(1006) byte local1006 = Static187.aClass1_Sub11_Sub1_2.method2663();
					@Pc(1010) byte local1010 = Static187.aClass1_Sub11_Sub1_2.method2666();
					local26 = Static187.aClass1_Sub11_Sub1_2.method2661();
					local30 = Static187.aClass1_Sub11_Sub1_2.method2675();
					local34 = Static135.anInt2980 + (local30 >> 4 & 0x7);
					local45 = (local30 & 0x7) + Static49.anInt1133;
					local57 = Static187.aClass1_Sub11_Sub1_2.method2639();
					local49 = Static187.aClass1_Sub11_Sub1_2.method2654();
					local80 = local49 & 0x3;
					local53 = local49 >> 2;
					@Pc(1052) byte local1052 = Static187.aClass1_Sub11_Sub1_2.method2663();
					@Pc(1056) byte local1056 = Static187.aClass1_Sub11_Sub1_2.method2667();
					local613 = Static187.aClass1_Sub11_Sub1_2.method2661();
					local1064 = Static187.aClass1_Sub11_Sub1_2.method2657();
					if (!Static277.aBoolean412) {
						Static215.method3398(local57, local26, local34, local1010, local53, local1064, local1056, local45, local1006, local80, local613, local1052);
					}
				}
				if (Static201.anInt4077 == 46) {
					local12 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local20 = (local12 >> 4 & 0xF) + Static135.anInt2980 * 2;
					local26 = Static49.anInt1133 * 2 + (local12 & 0xF);
					local30 = local20 + Static187.aClass1_Sub11_Sub1_2.method2663();
					local34 = local26 + Static187.aClass1_Sub11_Sub1_2.method2663();
					local45 = Static187.aClass1_Sub11_Sub1_2.method2632();
					local57 = Static187.aClass1_Sub11_Sub1_2.method2632();
					local49 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local53 = Static187.aClass1_Sub11_Sub1_2.method2663();
					local80 = Static187.aClass1_Sub11_Sub1_2.method2690() * 4;
					local605 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local609 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local613 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local1064 = Static187.aClass1_Sub11_Sub1_2.method2690();
					if (local613 == 255) {
						local613 = -1;
					}
					if (local20 >= 0 && local26 >= 0 && local20 < 208 && local26 < 208 && local30 >= 0 && local34 >= 0 && local30 < 208 && local34 < 208 && local49 != 65535) {
						local26 = local26 * 64;
						local34 *= 64;
						local30 = local30 * 64;
						local20 *= 64;
						if (local45 != 0) {
							@Pc(1248) int local1248;
							@Pc(1252) Class14_Sub2 local1252;
							@Pc(1238) int local1238;
							@Pc(1242) int local1242;
							if (local45 >= 0) {
								local1238 = local45 - 1;
								local1242 = local1238 & 0x7FF;
								local1248 = local1238 >> 11 & 0xF;
								local1252 = Static254.aClass14_Sub2_Sub2Array1[local1242];
							} else {
								local1238 = -local45 - 1;
								local1248 = local1238 >> 11 & 0xF;
								local1242 = local1238 & 0x7FF;
								if (local1242 == Static71.anInt1526) {
									local1252 = Static197.aClass14_Sub2_Sub1_2;
								} else {
									local1252 = Static98.aClass14_Sub2_Sub1Array1[local1242];
								}
							}
							if (local1252 != null) {
								@Pc(1288) Class164 local1288 = local1252.method3650();
								if (local1288.anIntArrayArray35 != null && local1288.anIntArrayArray35[local1248] != null) {
									local1242 = local1288.anIntArrayArray35[local1248][0];
									local53 -= local1288.anIntArrayArray35[local1248][1];
									@Pc(1321) int local1321 = local1288.anIntArrayArray35[local1248][2];
									@Pc(1326) int local1326 = Class68.anIntArray229[local1252.anInt4681];
									@Pc(1331) int local1331 = Class68.anIntArray226[local1252.anInt4681];
									@Pc(1342) int local1342 = local1326 * local1321 + local1242 * local1331 >> 16;
									@Pc(1353) int local1353 = local1321 * local1331 - local1326 * local1242 >> 16;
									local20 += local1342;
									local26 += local1353;
								}
							}
						}
						@Pc(1390) Class14_Sub4 local1390 = new Class14_Sub4(local49, Static140.anInt3034, local20, local26, Static20.method383(local26, Static140.anInt3034, local20) - local53, Static237.anInt4710 + local605, local609 + Static237.anInt4710, local613, local1064, local57, local80);
						local1390.method1787(Static20.method383(local34, Static140.anInt3034, local30) - local80, local34, local30, local605 + Static237.anInt4710);
						Static201.aClass61_22.method1839(new Class1_Sub2_Sub8(local1390));
					}
				} else if (Static201.anInt4077 == 41) {
					local12 = Static187.aClass1_Sub11_Sub1_2.method2690();
					local20 = (local12 >> 4 & 0x7) + Static135.anInt2980;
					local26 = (local12 & 0x7) + Static49.anInt1133;
					local30 = local20 + Static187.aClass1_Sub11_Sub1_2.method2663();
					local34 = Static187.aClass1_Sub11_Sub1_2.method2663() + local26;
					local45 = Static187.aClass1_Sub11_Sub1_2.method2632();
					local57 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local49 = Static187.aClass1_Sub11_Sub1_2.method2690() * 4;
					local53 = Static187.aClass1_Sub11_Sub1_2.method2690() * 4;
					local80 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local605 = Static187.aClass1_Sub11_Sub1_2.method2691();
					local609 = Static187.aClass1_Sub11_Sub1_2.method2690();
					if (local609 == 255) {
						local609 = -1;
					}
					local613 = Static187.aClass1_Sub11_Sub1_2.method2690();
					if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104 && local57 != 65535) {
						local20 = local20 * 128 + 64;
						local26 = local26 * 128 + 64;
						local687 = new Class14_Sub4(local57, Static140.anInt3034, local20, local26, Static20.method383(local26, Static140.anInt3034, local20) - local49, local80 - -Static237.anInt4710, Static237.anInt4710 + local605, local609, local613, local45, local53);
						local30 = local30 * 128 + 64;
						local34 = local34 * 128 + 64;
						local687.method1787(Static20.method383(local34, Static140.anInt3034, local30) - local53, local34, local30, local80 + Static237.anInt4710);
						Static201.aClass61_22.method1839(new Class1_Sub2_Sub8(local687));
					}
				} else if (Static201.anInt4077 == 193) {
					local12 = Static187.aClass1_Sub11_Sub1_2.method2675();
					local20 = local12 >> 2;
					local26 = local12 & 0x3;
					local30 = Static23.anIntArray58[local20];
					local34 = Static187.aClass1_Sub11_Sub1_2.method2647();
					local57 = (local34 & 0x7) + Static49.anInt1133;
					local45 = (local34 >> 4 & 0x7) + Static135.anInt2980;
					local49 = Static187.aClass1_Sub11_Sub1_2.method2639();
					if (local49 == 65535) {
						local49 = -1;
					}
					Static99.method1842(Static140.anInt3034, local30, local45, local57, local20, local49, local26);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method1873(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(33) int local33 = arg1[local18 + arg2] & 0xFF;
			if (local33 != 0) {
				if (local33 >= 128 && local33 < 160) {
					@Pc(52) char local52 = Static78.aCharArray2[local33 - 128];
					if (local52 == '\u0000') {
						local52 = '?';
					}
					local33 = local52;
				}
				local8[local10++] = (char) local33;
			}
		}
		return new String(local8, 0, local10);
	}
}
