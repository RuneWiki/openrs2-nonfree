import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array9;

	@OriginalMember(owner = "client!qd", name = "V", descriptor = "[I")
	public static int[] anIntArray408;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
	public static int anInt3152;

	@OriginalMember(owner = "client!qd", name = "ib", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1247 = Static120.method1824("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1245 = aClass80_1247;

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1246 = Static120.method1824("logo");

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	public static void method2295() {
		@Pc(9) int local9 = Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2269(Static180.aClass80_1541);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static173.anInt3892; local11++) {
			local19 = Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2269(Static12.method47(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		Static27.anInt4466 = Static173.anInt3892 * 15 + 22;
		Static148.aBoolean134 = true;
		local19 = Static173.anInt3892 * 15 + 21;
		@Pc(48) int local48 = Static20.anInt497;
		local9 += 8;
		@Pc(56) int local56 = Static37.anInt855 - local9 / 2;
		if (local48 + local19 > 503) {
			local48 = 503 - local19;
		}
		if (local48 < 0) {
			local48 = 0;
		}
		Static191.anInt4389 = local48;
		Static46.anInt1056 = local9;
		if (local9 + local56 > 765) {
			local56 = 765 - local9;
		}
		if (local56 < 0) {
			local56 = 0;
		}
		Static58.anInt1293 = local56;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
	public static void method2296(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static73.anIntArray200[arg0];
		@Pc(14) int local14 = Static19.anIntArray67[arg0];
		@Pc(19) int local19 = (int) Static176.aLongArray9[arg0];
		@Pc(23) int local23 = Static160.aShortArray46[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(31) long local31 = Static176.aLongArray9[arg0];
		@Pc(50) Class77 local50;
		@Pc(70) int local70;
		if (local23 == 3) {
			Static146.aClass3_Sub17_Sub1_3.method2146(93);
			Static146.aClass3_Sub17_Sub1_3.method2131(local14);
			local50 = Static92.method2208(local14);
			if (local50.anIntArrayArray34 != null && local50.anIntArrayArray34[0][0] == 5) {
				local70 = local50.anIntArrayArray34[0][1];
				if (local50.anIntArray422[0] != Static41.anIntArray131[local70]) {
					Static41.anIntArray131[local70] = local50.anIntArray422[0];
					Static7.method152(local70);
				}
			}
		}
		@Pc(117) boolean local117;
		if (local23 == 19) {
			local117 = Static27.method3147(0, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
			if (!local117) {
				Static27.method3147(1, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
			}
			Static143.anInt3080 = 0;
			Static29.anInt730 = Static20.anInt497;
			Static138.anInt2981 = 2;
			Static17.anInt442 = Static37.anInt855;
			Static146.aClass3_Sub17_Sub1_3.method2146(230);
			Static146.aClass3_Sub17_Sub1_3.method2134(local19);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static39.anInt875 + local14);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static97.anInt2062 + local10);
		}
		if (local23 == 36) {
			Static194.method3134(local31, local10, local14);
			Static146.aClass3_Sub17_Sub1_3.method2146(192);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static97.anInt2062 + local10);
			Static146.aClass3_Sub17_Sub1_3.method2092((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static146.aClass3_Sub17_Sub1_3.method2118(local14 + Static39.anInt875);
		}
		@Pc(221) Class3_Sub1_Sub5_Sub4_Sub2 local221;
		if (local23 == 4) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static138.anInt2981 = 2;
				Static17.anInt442 = Static37.anInt855;
				Static29.anInt730 = Static20.anInt497;
				Static143.anInt3080 = 0;
				Static146.aClass3_Sub17_Sub1_3.method2146(111);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			}
		}
		if (local23 == 21) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static29.anInt730 = Static20.anInt497;
				Static143.anInt3080 = 0;
				Static17.anInt442 = Static37.anInt855;
				Static138.anInt2981 = 2;
				Static146.aClass3_Sub17_Sub1_3.method2146(122);
				Static146.aClass3_Sub17_Sub1_3.method2097(Static118.anInt2619);
				Static146.aClass3_Sub17_Sub1_3.method2092(local19);
				Static146.aClass3_Sub17_Sub1_3.method2134(Static38.anInt864);
			}
		}
		if (local23 == 20) {
			Static194.method3134(local31, local10, local14);
			Static146.aClass3_Sub17_Sub1_3.method2146(199);
			Static146.aClass3_Sub17_Sub1_3.method2125(local10 + Static97.anInt2062);
			Static146.aClass3_Sub17_Sub1_3.method2118(local14 + Static39.anInt875);
			Static146.aClass3_Sub17_Sub1_3.method2125(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (local23 == 16) {
			Static175.method2822();
		}
		if (local23 == 1006) {
			Static29.anInt730 = Static20.anInt497;
			Static138.anInt2981 = 2;
			Static143.anInt3080 = 0;
			Static17.anInt442 = Static37.anInt855;
			Static146.aClass3_Sub17_Sub1_3.method2146(124);
			Static146.aClass3_Sub17_Sub1_3.method2125(local19);
		}
		if (local23 == 40) {
			Static146.aClass3_Sub17_Sub1_3.method2146(142);
			Static146.aClass3_Sub17_Sub1_3.method2118(local19);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10);
			Static146.aClass3_Sub17_Sub1_3.method2129(local14);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 17) {
			local117 = Static27.method3147(0, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
			if (!local117) {
				Static27.method3147(1, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
			}
			Static143.anInt3080 = 0;
			Static17.anInt442 = Static37.anInt855;
			Static138.anInt2981 = 2;
			Static29.anInt730 = Static20.anInt497;
			Static146.aClass3_Sub17_Sub1_3.method2146(129);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10 + Static97.anInt2062);
			Static146.aClass3_Sub17_Sub1_3.method2125(Static39.anInt875 + local14);
			Static146.aClass3_Sub17_Sub1_3.method2125(local19);
		}
		if (local23 == 47) {
			@Pc(519) boolean local519 = true;
			local50 = Static92.method2208(local14);
			if (local50.anInt3256 > 0) {
				local519 = Static182.method2911(local50);
			}
			if (local519) {
				Static146.aClass3_Sub17_Sub1_3.method2146(93);
				Static146.aClass3_Sub17_Sub1_3.method2131(local14);
			}
		}
		@Pc(554) Class3_Sub1_Sub5_Sub4_Sub1 local554;
		if (local23 == 11) {
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				Static27.method3147(1, local554.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local554.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static29.anInt730 = Static20.anInt497;
				Static143.anInt3080 = 0;
				Static138.anInt2981 = 2;
				Static17.anInt442 = Static37.anInt855;
				Static146.aClass3_Sub17_Sub1_3.method2146(242);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			}
		}
		if (local23 == 12) {
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				Static27.method3147(1, local554.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local554.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static138.anInt2981 = 2;
				Static29.anInt730 = Static20.anInt497;
				Static143.anInt3080 = 0;
				Static17.anInt442 = Static37.anInt855;
				Static146.aClass3_Sub17_Sub1_3.method2146(31);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			}
		}
		if (local23 == 50) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static143.anInt3080 = 0;
				Static29.anInt730 = Static20.anInt497;
				Static138.anInt2981 = 2;
				Static17.anInt442 = Static37.anInt855;
				Static146.aClass3_Sub17_Sub1_3.method2146(97);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			}
		}
		if (local23 == 39) {
			Static146.aClass3_Sub17_Sub1_3.method2146(19);
			Static146.aClass3_Sub17_Sub1_3.method2118(local19);
			Static146.aClass3_Sub17_Sub1_3.method2134(local10);
			Static146.aClass3_Sub17_Sub1_3.method2097(local14);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 6) {
			local50 = Static26.method425(local14, local10);
			if (local50 != null) {
				Static154.method2447();
				Static113.method1745(local10, Static110.method1715(Static71.method1062(local50)), local14);
				Static7.anInt221 = 0;
				Static44.aClass80_376 = Static4.method128(local50);
				if (Static44.aClass80_376 == null) {
					Static44.aClass80_376 = Static2.aClass80_9;
				}
				if (!local50.aBoolean127) {
					Static38.aClass80_309 = Static154.method2467(new Class80[] { Static129.aClass80_1102, local50.aClass80_1256, Static141.aClass80_1179 });
					return;
				}
				Static38.aClass80_309 = Static154.method2467(new Class80[] { local50.aClass80_1259, Static141.aClass80_1179 });
			}
			return;
		}
		if (local23 == 35) {
			local117 = Static27.method3147(0, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
			if (!local117) {
				Static27.method3147(1, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
			}
			Static138.anInt2981 = 2;
			Static143.anInt3080 = 0;
			Static17.anInt442 = Static37.anInt855;
			Static29.anInt730 = Static20.anInt497;
			Static146.aClass3_Sub17_Sub1_3.method2146(58);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static97.anInt2062 + local10);
			Static146.aClass3_Sub17_Sub1_3.method2118(Static39.anInt875 + local14);
			Static146.aClass3_Sub17_Sub1_3.method2118(local19);
		}
		if (local23 == 49) {
			Static146.aClass3_Sub17_Sub1_3.method2146(56);
			Static146.aClass3_Sub17_Sub1_3.method2129(local14);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10);
			Static146.aClass3_Sub17_Sub1_3.method2134(local19);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 58) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static17.anInt442 = Static37.anInt855;
				Static138.anInt2981 = 2;
				Static143.anInt3080 = 0;
				Static29.anInt730 = Static20.anInt497;
				Static146.aClass3_Sub17_Sub1_3.method2146(243);
				Static146.aClass3_Sub17_Sub1_3.method2118(local19);
				Static146.aClass3_Sub17_Sub1_3.method2118(Static87.anInt1820);
				Static146.aClass3_Sub17_Sub1_3.method2097(Static129.anInt2788);
				Static146.aClass3_Sub17_Sub1_3.method2092(Static18.anInt461);
			}
		}
		if (local23 == 45) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static29.anInt730 = Static20.anInt497;
				Static138.anInt2981 = 2;
				Static143.anInt3080 = 0;
				Static17.anInt442 = Static37.anInt855;
				Static146.aClass3_Sub17_Sub1_3.method2146(198);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			}
		}
		if (local23 == 34) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static17.anInt442 = Static37.anInt855;
				Static138.anInt2981 = 2;
				Static29.anInt730 = Static20.anInt497;
				Static143.anInt3080 = 0;
				Static146.aClass3_Sub17_Sub1_3.method2146(211);
				Static146.aClass3_Sub17_Sub1_3.method2118(local19);
			}
		}
		if (local23 == 43) {
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				Static27.method3147(1, local554.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local554.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static138.anInt2981 = 2;
				Static17.anInt442 = Static37.anInt855;
				Static143.anInt3080 = 0;
				Static29.anInt730 = Static20.anInt497;
				Static146.aClass3_Sub17_Sub1_3.method2146(223);
				Static146.aClass3_Sub17_Sub1_3.method2092(local19);
			}
		}
		if (local23 == 42) {
			Static194.method3134(local31, local10, local14);
			Static146.aClass3_Sub17_Sub1_3.method2146(105);
			Static146.aClass3_Sub17_Sub1_3.method2125(Static39.anInt875 + local14);
			Static146.aClass3_Sub17_Sub1_3.method2092(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static146.aClass3_Sub17_Sub1_3.method2118(local10 + Static97.anInt2062);
		}
		if (local23 == 9) {
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				Static27.method3147(1, local554.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local554.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static138.anInt2981 = 2;
				Static143.anInt3080 = 0;
				Static17.anInt442 = Static37.anInt855;
				Static29.anInt730 = Static20.anInt497;
				Static146.aClass3_Sub17_Sub1_3.method2146(98);
				Static146.aClass3_Sub17_Sub1_3.method2092(local19);
			}
		}
		if (local23 == 44) {
			Static146.aClass3_Sub17_Sub1_3.method2146(46);
			Static146.aClass3_Sub17_Sub1_3.method2125(local10);
			Static146.aClass3_Sub17_Sub1_3.method2092(local19);
			Static146.aClass3_Sub17_Sub1_3.method2097(local14);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 15) {
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				Static27.method3147(1, local554.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local554.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static29.anInt730 = Static20.anInt497;
				Static17.anInt442 = Static37.anInt855;
				Static138.anInt2981 = 2;
				Static143.anInt3080 = 0;
				Static146.aClass3_Sub17_Sub1_3.method2146(114);
				Static146.aClass3_Sub17_Sub1_3.method2110(Static129.anInt2788);
				Static146.aClass3_Sub17_Sub1_3.method2118(Static87.anInt1820);
				Static146.aClass3_Sub17_Sub1_3.method2092(Static18.anInt461);
				Static146.aClass3_Sub17_Sub1_3.method2092(local19);
			}
		}
		if (local23 == 1) {
			local117 = Static27.method3147(0, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
			if (!local117) {
				Static27.method3147(1, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
			}
			Static138.anInt2981 = 2;
			Static143.anInt3080 = 0;
			Static29.anInt730 = Static20.anInt497;
			Static17.anInt442 = Static37.anInt855;
			Static146.aClass3_Sub17_Sub1_3.method2146(113);
			Static146.aClass3_Sub17_Sub1_3.method2134(local14 + Static39.anInt875);
			Static146.aClass3_Sub17_Sub1_3.method2118(Static97.anInt2062 + local10);
			Static146.aClass3_Sub17_Sub1_3.method2092(local19);
		}
		if (local23 == 29) {
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				Static27.method3147(1, local554.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local554.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static143.anInt3080 = 0;
				Static138.anInt2981 = 2;
				Static17.anInt442 = Static37.anInt855;
				Static29.anInt730 = Static20.anInt497;
				Static146.aClass3_Sub17_Sub1_3.method2146(121);
				Static146.aClass3_Sub17_Sub1_3.method2092(local19);
			}
		}
		if (local23 == 14) {
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				Static27.method3147(1, local554.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local554.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static29.anInt730 = Static20.anInt497;
				Static17.anInt442 = Static37.anInt855;
				Static138.anInt2981 = 2;
				Static143.anInt3080 = 0;
				Static146.aClass3_Sub17_Sub1_3.method2146(128);
				Static146.aClass3_Sub17_Sub1_3.method2118(Static38.anInt864);
				Static146.aClass3_Sub17_Sub1_3.method2092(local19);
				Static146.aClass3_Sub17_Sub1_3.method2131(Static118.anInt2619);
			}
		}
		if (local23 == 5) {
			Static146.aClass3_Sub17_Sub1_3.method2146(178);
			Static146.aClass3_Sub17_Sub1_3.method2092(local10);
			Static146.aClass3_Sub17_Sub1_3.method2134(local19);
			Static146.aClass3_Sub17_Sub1_3.method2092(Static38.anInt864);
			Static146.aClass3_Sub17_Sub1_3.method2097(local14);
			Static146.aClass3_Sub17_Sub1_3.method2131(Static118.anInt2619);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 48) {
			local117 = Static27.method3147(0, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
			if (!local117) {
				Static27.method3147(1, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
			}
			Static138.anInt2981 = 2;
			Static17.anInt442 = Static37.anInt855;
			Static143.anInt3080 = 0;
			Static29.anInt730 = Static20.anInt497;
			Static146.aClass3_Sub17_Sub1_3.method2146(236);
			Static146.aClass3_Sub17_Sub1_3.method2134(local14 + Static39.anInt875);
			Static146.aClass3_Sub17_Sub1_3.method2092(Static38.anInt864);
			Static146.aClass3_Sub17_Sub1_3.method2118(Static97.anInt2062 + local10);
			Static146.aClass3_Sub17_Sub1_3.method2118(local19);
			Static146.aClass3_Sub17_Sub1_3.method2131(Static118.anInt2619);
		}
		if (local23 == 41) {
			Static146.aClass3_Sub17_Sub1_3.method2146(251);
			Static146.aClass3_Sub17_Sub1_3.method2129(local14);
			Static146.aClass3_Sub17_Sub1_3.method2125(local10);
			Static146.aClass3_Sub17_Sub1_3.method2134(local19);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 30) {
			Static162.method2625(Static153.anInt673, local10, local14);
		}
		if (local23 == 32) {
			Static146.aClass3_Sub17_Sub1_3.method2146(93);
			Static146.aClass3_Sub17_Sub1_3.method2131(local14);
			local50 = Static92.method2208(local14);
			if (local50.anIntArrayArray34 != null && local50.anIntArrayArray34[0][0] == 5) {
				local70 = local50.anIntArrayArray34[0][1];
				Static41.anIntArray131[local70] = 1 - Static41.anIntArray131[local70];
				Static7.method152(local70);
			}
		}
		if (local23 == 46) {
			local117 = Static27.method3147(0, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
			if (!local117) {
				Static27.method3147(1, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
			}
			Static143.anInt3080 = 0;
			Static17.anInt442 = Static37.anInt855;
			Static29.anInt730 = Static20.anInt497;
			Static138.anInt2981 = 2;
			Static146.aClass3_Sub17_Sub1_3.method2146(119);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static87.anInt1820);
			Static146.aClass3_Sub17_Sub1_3.method2092(local10 + Static97.anInt2062);
			Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			Static146.aClass3_Sub17_Sub1_3.method2097(Static129.anInt2788);
			Static146.aClass3_Sub17_Sub1_3.method2092(Static39.anInt875 + local14);
			Static146.aClass3_Sub17_Sub1_3.method2125(Static18.anInt461);
		}
		if (local23 == 18 || local23 == 1001) {
			Static184.method2970(local19, Static18.aClass80Array5[arg0], local10, local14);
		}
		if (local23 == 10 && Static83.aClass77_4 == null) {
			Static150.method2413(local10, local14);
			Static83.aClass77_4 = Static26.method425(local14, local10);
			Static186.method3014(Static83.aClass77_4);
		}
		if (local23 == 37 && Static194.method3134(local31, local10, local14)) {
			Static146.aClass3_Sub17_Sub1_3.method2146(249);
			Static146.aClass3_Sub17_Sub1_3.method2125(local10 + Static97.anInt2062);
			Static146.aClass3_Sub17_Sub1_3.method2118(Static39.anInt875 + local14);
			Static146.aClass3_Sub17_Sub1_3.method2134((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static146.aClass3_Sub17_Sub1_3.method2125(Static38.anInt864);
			Static146.aClass3_Sub17_Sub1_3.method2097(Static118.anInt2619);
		}
		if (local23 == 8) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static138.anInt2981 = 2;
				Static143.anInt3080 = 0;
				Static17.anInt442 = Static37.anInt855;
				Static29.anInt730 = Static20.anInt497;
				Static146.aClass3_Sub17_Sub1_3.method2146(75);
				Static146.aClass3_Sub17_Sub1_3.method2134(local19);
			}
		}
		if (local23 == 26) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static143.anInt3080 = 0;
				Static29.anInt730 = Static20.anInt497;
				Static17.anInt442 = Static37.anInt855;
				Static138.anInt2981 = 2;
				Static146.aClass3_Sub17_Sub1_3.method2146(134);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			}
		}
		if (local23 == 1004) {
			Static29.anInt730 = Static20.anInt497;
			Static143.anInt3080 = 0;
			Static138.anInt2981 = 2;
			Static17.anInt442 = Static37.anInt855;
			local554 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local19];
			if (local554 != null) {
				@Pc(2124) Class3_Sub1_Sub7 local2124 = local554.aClass3_Sub1_Sub7_1;
				if (local2124.anIntArray133 != null) {
					local2124 = local2124.method623();
				}
				if (local2124 != null) {
					Static146.aClass3_Sub17_Sub1_3.method2146(152);
					Static146.aClass3_Sub17_Sub1_3.method2092(local2124.anInt910);
				}
			}
		}
		if (local23 == 2) {
			Static194.method3134(local31, local10, local14);
			Static146.aClass3_Sub17_Sub1_3.method2146(164);
			Static146.aClass3_Sub17_Sub1_3.method2092(local14 + Static39.anInt875);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10 + Static97.anInt2062);
			Static146.aClass3_Sub17_Sub1_3.method2092(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (local23 == 25) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static143.anInt3080 = 0;
				Static138.anInt2981 = 2;
				Static29.anInt730 = Static20.anInt497;
				Static17.anInt442 = Static37.anInt855;
				Static146.aClass3_Sub17_Sub1_3.method2146(253);
				Static146.aClass3_Sub17_Sub1_3.method2118(local19);
			}
		}
		if (local23 == 1003) {
			Static194.method3134(local31, local10, local14);
			Static146.aClass3_Sub17_Sub1_3.method2146(103);
			Static146.aClass3_Sub17_Sub1_3.method2134((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10 + Static97.anInt2062);
			Static146.aClass3_Sub17_Sub1_3.method2125(Static39.anInt875 + local14);
		}
		if (local23 == 24) {
			Static146.aClass3_Sub17_Sub1_3.method2146(246);
			Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			Static146.aClass3_Sub17_Sub1_3.method2125(local10);
			Static146.aClass3_Sub17_Sub1_3.method2110(local14);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 1002) {
			Static138.anInt2981 = 2;
			Static29.anInt730 = Static20.anInt497;
			Static143.anInt3080 = 0;
			Static17.anInt442 = Static37.anInt855;
			Static146.aClass3_Sub17_Sub1_3.method2146(235);
			Static146.aClass3_Sub17_Sub1_3.method2118(local19);
		}
		if (local23 == 7) {
			Static146.aClass3_Sub17_Sub1_3.method2146(68);
			Static146.aClass3_Sub17_Sub1_3.method2097(local14);
			Static146.aClass3_Sub17_Sub1_3.method2125(local10);
			Static146.aClass3_Sub17_Sub1_3.method2118(local19);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 57) {
			local221 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local19];
			if (local221 != null) {
				Static27.method3147(1, local221.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local221.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				Static143.anInt3080 = 0;
				Static29.anInt730 = Static20.anInt497;
				Static17.anInt442 = Static37.anInt855;
				Static138.anInt2981 = 2;
				Static146.aClass3_Sub17_Sub1_3.method2146(163);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			}
		}
		if (local23 == 13) {
			Static154.method2447();
			local50 = Static92.method2208(local14);
			Static129.anInt2788 = local14;
			Static18.anInt461 = local10;
			Static7.anInt221 = 1;
			Static87.anInt1820 = local19;
			Static186.method3014(local50);
			Static134.aClass80_1289 = Static154.method2467(new Class80[] { Static190.aClass80_1700, Static173.method2793(local19).aClass80_116, Static141.aClass80_1179 });
			if (Static134.aClass80_1289 == null) {
				Static134.aClass80_1289 = Static139.aClass80_1170;
			}
			return;
		}
		if (local23 == 33) {
			Static146.aClass3_Sub17_Sub1_3.method2146(150);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10);
			Static146.aClass3_Sub17_Sub1_3.method2131(local14);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static38.anInt864);
			Static146.aClass3_Sub17_Sub1_3.method2129(Static118.anInt2619);
		}
		if (local23 == 22) {
			Static146.aClass3_Sub17_Sub1_3.method2146(137);
			Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			Static146.aClass3_Sub17_Sub1_3.method2129(local14);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 1007) {
			local50 = Static92.method2208(local14);
			if (local50 == null || local50.anIntArray417[local10] < 100000) {
				Static146.aClass3_Sub17_Sub1_3.method2146(124);
				Static146.aClass3_Sub17_Sub1_3.method2125(local19);
			} else {
				Static147.method2354(Static185.aClass80_1637, 0, Static154.method2467(new Class80[] { Static83.method1219(local50.anIntArray417[local10]), Static108.aClass80_1149, Static173.method2793(local19).aClass80_116 }));
			}
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 23) {
			Static146.aClass3_Sub17_Sub1_3.method2146(6);
			Static146.aClass3_Sub17_Sub1_3.method2125(local10);
			Static146.aClass3_Sub17_Sub1_3.method2134(local19);
			Static146.aClass3_Sub17_Sub1_3.method2129(local14);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 31) {
			Static146.aClass3_Sub17_Sub1_3.method2146(123);
			Static146.aClass3_Sub17_Sub1_3.method2092(local19);
			Static146.aClass3_Sub17_Sub1_3.method2118(Static87.anInt1820);
			Static146.aClass3_Sub17_Sub1_3.method2125(Static18.anInt461);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10);
			Static146.aClass3_Sub17_Sub1_3.method2131(Static129.anInt2788);
			Static146.aClass3_Sub17_Sub1_3.method2129(local14);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (local23 == 38) {
			local117 = Static27.method3147(0, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
			if (!local117) {
				Static27.method3147(1, local14, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local10, false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
			}
			Static17.anInt442 = Static37.anInt855;
			Static29.anInt730 = Static20.anInt497;
			Static143.anInt3080 = 0;
			Static138.anInt2981 = 2;
			Static146.aClass3_Sub17_Sub1_3.method2146(8);
			Static146.aClass3_Sub17_Sub1_3.method2125(Static39.anInt875 + local14);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static97.anInt2062 + local10);
			Static146.aClass3_Sub17_Sub1_3.method2134(local19);
		}
		if (local23 == 28 && Static194.method3134(local31, local10, local14)) {
			Static146.aClass3_Sub17_Sub1_3.method2146(168);
			Static146.aClass3_Sub17_Sub1_3.method2125(local14 + Static39.anInt875);
			Static146.aClass3_Sub17_Sub1_3.method2092(Static18.anInt461);
			Static146.aClass3_Sub17_Sub1_3.method2092(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static146.aClass3_Sub17_Sub1_3.method2118(Static87.anInt1820);
			Static146.aClass3_Sub17_Sub1_3.method2134(local10 + Static97.anInt2062);
			Static146.aClass3_Sub17_Sub1_3.method2110(Static129.anInt2788);
		}
		if (local23 == 51) {
			Static146.aClass3_Sub17_Sub1_3.method2146(95);
			Static146.aClass3_Sub17_Sub1_3.method2092(local19);
			Static146.aClass3_Sub17_Sub1_3.method2118(local10);
			Static146.aClass3_Sub17_Sub1_3.method2110(local14);
			Static2.anInt81 = 0;
			Static68.aClass77_3 = Static92.method2208(local14);
			Static190.anInt4383 = local10;
		}
		if (Static7.anInt221 != 0) {
			Static7.anInt221 = 0;
			Static186.method3014(Static92.method2208(Static129.anInt2788));
		}
		if (Static162.aBoolean147) {
			Static154.method2447();
		}
		if (Static68.aClass77_3 != null && Static2.anInt81 == 0) {
			Static186.method3014(Static68.aClass77_3);
		}
	}
}
