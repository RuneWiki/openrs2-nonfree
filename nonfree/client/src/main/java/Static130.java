import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!nm;")
	public static Class119 aClass119_49;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_4;

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public static int anInt2581;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "Lclient!nm;")
	public static Class119 aClass119_50;

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
	public static int anInt2575 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
	public static void method2280() {
		Static217.aClass175_34.method4288(50);
		Static255.aClass175_38.method4288(50);
		Static45.aClass175_9.method4288(50);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)Lclient!af;")
	public static Class4_Sub1 method2282() {
		Static245.anInt4510 = 0;
		return Static172.method2961();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIZLclient!nm;II)V")
	public static void method2283(@OriginalArg(3) Class119 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static289.anInt5257 = 0;
		Static63.anInt1315 = 1;
		Static87.anInt1879 = 10000;
		Static101.anInt2158 = arg2;
		Static167.aClass119_12 = arg0;
		Static1.aBoolean6 = false;
		Static118.anInt2421 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
	public static void method2284() {
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(33) int local33;
		@Pc(25) int local25;
		@Pc(37) int local37;
		if (Static126.anInt1523 == 175) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1870();
			local19 = Static10.aClass1_Sub13_Sub1_117.method1845();
			local25 = (local19 & 0x7) + Static166.anInt3282;
			local33 = (local19 >> 4 & 0x7) + Static262.anInt4841;
			local37 = Static10.aClass1_Sub13_Sub1_117.method1856();
			if (local33 >= 0 && local25 >= 0 && local33 < 104 && local25 < 104) {
				@Pc(61) Class11_Sub7 local61 = new Class11_Sub7();
				local61.anInt5178 = local37;
				local61.anInt5176 = local15;
				if (Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local33][local25] == null) {
					Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local33][local25] = new Class96();
				}
				Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local33][local25].method2336(new Class1_Sub5_Sub11(local61));
				Static17.method274(local33, local25);
			}
			return;
		}
		@Pc(149) int local149;
		@Pc(155) int local155;
		@Pc(161) int local161;
		@Pc(165) int local165;
		@Pc(169) int local169;
		@Pc(173) int local173;
		@Pc(185) int local185;
		@Pc(145) int local145;
		@Pc(267) Class11_Sub3 local267;
		if (Static126.anInt1523 == 13) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local19 = Static262.anInt4841 + (local15 >> 4 & 0x7);
			local33 = (local15 & 0x7) + Static166.anInt3282;
			local25 = local19 + Static10.aClass1_Sub13_Sub1_117.method1829();
			local37 = local33 + Static10.aClass1_Sub13_Sub1_117.method1829();
			local145 = Static10.aClass1_Sub13_Sub1_117.method1843();
			local149 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local155 = Static10.aClass1_Sub13_Sub1_117.method1853() * 4;
			local161 = Static10.aClass1_Sub13_Sub1_117.method1853() * 4;
			local165 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local169 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local173 = Static10.aClass1_Sub13_Sub1_117.method1853();
			if (local173 == 255) {
				local173 = -1;
			}
			local185 = Static10.aClass1_Sub13_Sub1_117.method1853();
			if (local19 >= 0 && local33 >= 0 && local19 < 104 && local33 < 104 && local25 >= 0 && local37 >= 0 && local25 < 104 && local37 < 104 && local149 != 65535) {
				local37 = local37 * 128 + 64;
				local33 = local33 * 128 + 64;
				local19 = local19 * 128 + 64;
				local267 = new Class11_Sub3(local149, Static132.anInt2608, local19, local33, Static42.method768(local19, Static132.anInt2608, local33) - local155, Static167.anInt637 + local165, Static167.anInt637 + local169, local173, local185, local145, local161);
				local25 = local25 * 128 + 64;
				local267.method1683(local37, Static42.method768(local25, Static132.anInt2608, local37) - local161, local165 + Static167.anInt637, local25);
				Static18.aClass96_1.method2336(new Class1_Sub5_Sub24(local267));
			}
		} else if (Static126.anInt1523 == 183) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local19 = (local15 >> 4 & 0x7) + Static262.anInt4841;
			local33 = (local15 & 0x7) + Static166.anInt3282;
			local25 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local37 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local145 = local37 >> 4 & 0xF;
			local149 = local37 & 0x7;
			if (local25 == 65535) {
				local25 = -1;
			}
			local155 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local161 = Static10.aClass1_Sub13_Sub1_117.method1853();
			if (local19 >= 0 && local33 >= 0 && local19 < 104 && local33 < 104) {
				local165 = local145 + 1;
				if (local19 - local165 <= Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] && local19 + local165 >= Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] && Static138.aClass11_Sub4_Sub1_3.anIntArray406[0] >= local33 - local165 && Static138.aClass11_Sub4_Sub1_3.anIntArray406[0] <= local33 + local165 && Static167.anInt638 != 0 && local149 > 0 && Static173.anInt3382 < 50 && local25 != -1) {
					Static274.anIntArray560[Static173.anInt3382] = local25;
					Static231.anIntArray486[Static173.anInt3382] = local149;
					Static167.anIntArray68[Static173.anInt3382] = local155;
					Static21.aClass101Array1[Static173.anInt3382] = null;
					Static306.anIntArray603[Static173.anInt3382] = local145 + (local33 << 8) + (local19 << 16);
					Static184.anIntArray378[Static173.anInt3382] = local161;
					Static173.anInt3382++;
				}
			}
		} else if (Static126.anInt1523 == 163) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local19 = Static10.aClass1_Sub13_Sub1_117.method1867();
			local33 = local19 >> 2;
			local25 = local19 & 0x3;
			local37 = Static81.anIntArray138[local33];
			local145 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local155 = Static166.anInt3282 + (local145 & 0x7);
			local149 = Static262.anInt4841 + (local145 >> 4 & 0x7);
			if (local149 >= 0 && local155 >= 0 && local149 < 104 && local155 < 104) {
				Static222.method3590(local155, local25, local33, local15, -1, local37, 0, local149, Static132.anInt2608);
			}
		} else if (Static126.anInt1523 == 225) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local19 = Static262.anInt4841 + (local15 >> 4 & 0x7);
			local33 = (local15 & 0x7) + Static166.anInt3282;
			local25 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local37 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local145 = Static10.aClass1_Sub13_Sub1_117.method1879();
			if (local19 >= 0 && local33 >= 0 && local19 < 104 && local33 < 104) {
				@Pc(614) Class96 local614 = Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local19][local33];
				if (local614 != null) {
					for (@Pc(622) Class1_Sub5_Sub11 local622 = (Class1_Sub5_Sub11) local614.method2340(); local622 != null; local622 = (Class1_Sub5_Sub11) local614.method2342()) {
						@Pc(628) Class11_Sub7 local628 = local622.aClass11_Sub7_1;
						if (local628.anInt5178 == (local25 & 0x7FFF) && local37 == local628.anInt5176) {
							local628.anInt5176 = local145;
							break;
						}
					}
					Static17.method274(local19, local33);
				}
			}
		} else if (Static126.anInt1523 == 130) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local19 = (local15 >> 4 & 0x7) + Static262.anInt4841;
			local33 = Static166.anInt3282 + (local15 & 0x7);
			local25 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local37 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local145 = Static10.aClass1_Sub13_Sub1_117.method1879();
			if (local19 >= 0 && local33 >= 0 && local19 < 104 && local33 < 104) {
				local19 = local19 * 128 + 64;
				local33 = local33 * 128 + 64;
				@Pc(744) Class11_Sub2 local744 = new Class11_Sub2(local25, Static132.anInt2608, local19, local33, Static42.method768(local19, Static132.anInt2608, local33) - local37, local145, Static167.anInt637);
				Static311.aClass96_28.method2336(new Class1_Sub5_Sub12(local744));
			}
		} else if (Static126.anInt1523 == 45) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1856();
			local19 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local33 = Static262.anInt4841 + (local19 >> 4 & 0x7);
			local25 = (local19 & 0x7) + Static166.anInt3282;
			if (local33 >= 0 && local25 >= 0 && local33 < 104 && local25 < 104) {
				@Pc(814) Class96 local814 = Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local33][local25];
				if (local814 != null) {
					for (@Pc(824) Class1_Sub5_Sub11 local824 = (Class1_Sub5_Sub11) local814.method2340(); local824 != null; local824 = (Class1_Sub5_Sub11) local814.method2342()) {
						if ((local15 & 0x7FFF) == local824.aClass11_Sub7_1.anInt5178) {
							local824.method4573();
							break;
						}
					}
					if (local814.method2340() == null) {
						Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local33][local25] = null;
					}
					Static17.method274(local33, local25);
				}
			}
		} else if (Static126.anInt1523 == 185) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local19 = (local15 >> 4 & 0xF) + Static262.anInt4841 * 2;
			local33 = (local15 & 0xF) + Static166.anInt3282 * 2;
			local25 = Static10.aClass1_Sub13_Sub1_117.method1829() + local19;
			local37 = Static10.aClass1_Sub13_Sub1_117.method1829() + local33;
			local145 = Static10.aClass1_Sub13_Sub1_117.method1843();
			local149 = Static10.aClass1_Sub13_Sub1_117.method1843();
			local155 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local161 = Static10.aClass1_Sub13_Sub1_117.method1829();
			local165 = Static10.aClass1_Sub13_Sub1_117.method1853() * 4;
			local169 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local173 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local185 = Static10.aClass1_Sub13_Sub1_117.method1853();
			if (local185 == 255) {
				local185 = -1;
			}
			@Pc(954) int local954 = Static10.aClass1_Sub13_Sub1_117.method1853();
			if (local19 >= 0 && local33 >= 0 && local19 < 208 && local33 < 208 && local25 >= 0 && local37 >= 0 && local25 < 208 && local37 < 208 && local155 != 65535) {
				local19 = local19 * 64;
				local37 *= 64;
				local25 = local25 * 64;
				local33 *= 64;
				if (local145 != 0) {
					@Pc(1019) int local1019;
					@Pc(1027) Class11_Sub4 local1027;
					@Pc(1013) int local1013;
					@Pc(1023) int local1023;
					if (local145 >= 0) {
						local1013 = local145 - 1;
						local1019 = local1013 >> 11 & 0xF;
						local1023 = local1013 & 0x7FF;
						local1027 = Static138.aClass11_Sub4_Sub2Array2[local1023];
					} else {
						local1013 = -local145 - 1;
						local1023 = local1013 & 0x7FF;
						if (local1023 == Static68.anInt1471) {
							local1027 = Static138.aClass11_Sub4_Sub1_3;
						} else {
							local1027 = Static14.aClass11_Sub4_Sub1Array1[local1023];
						}
						local1019 = local1013 >> 11 & 0xF;
					}
					if (local1027 != null) {
						@Pc(1065) Class28 local1065 = local1027.method3348();
						if (local1065.anIntArrayArray7 != null && local1065.anIntArrayArray7[local1019] != null) {
							local1023 = local1065.anIntArrayArray7[local1019][0];
							local161 -= local1065.anIntArrayArray7[local1019][1];
							@Pc(1096) int local1096 = Class87.anIntArray173[local1027.anInt3852];
							@Pc(1103) int local1103 = local1065.anIntArrayArray7[local1019][2];
							@Pc(1108) int local1108 = Class87.anIntArray177[local1027.anInt3852];
							@Pc(1118) int local1118 = local1103 * local1096 + local1023 * local1108 >> 16;
							@Pc(1128) int local1128 = local1108 * local1103 - local1096 * local1023 >> 16;
							local33 += local1128;
							local19 += local1118;
						}
					}
				}
				@Pc(1164) Class11_Sub3 local1164 = new Class11_Sub3(local155, Static132.anInt2608, local19, local33, Static42.method768(local19, Static132.anInt2608, local33) - local161, local169 + Static167.anInt637, local173 + Static167.anInt637, local185, local954, local149, local165);
				local1164.method1683(local37, Static42.method768(local25, Static132.anInt2608, local37) - local165, local169 - -Static167.anInt637, local25);
				Static18.aClass96_1.method2336(new Class1_Sub5_Sub24(local1164));
			}
		} else if (Static126.anInt1523 == 147) {
			local15 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local19 = Static10.aClass1_Sub13_Sub1_117.method1853();
			Static160.method2744(local15).method3883(local19);
		} else {
			if (Static126.anInt1523 == 203) {
				@Pc(1223) byte local1223 = Static10.aClass1_Sub13_Sub1_117.method1837();
				local19 = Static10.aClass1_Sub13_Sub1_117.method1844();
				local33 = Static10.aClass1_Sub13_Sub1_117.method1844();
				@Pc(1235) byte local1235 = Static10.aClass1_Sub13_Sub1_117.method1829();
				@Pc(1239) byte local1239 = Static10.aClass1_Sub13_Sub1_117.method1815();
				local145 = Static10.aClass1_Sub13_Sub1_117.method1867();
				local149 = Static262.anInt4841 + (local145 >> 4 & 0x7);
				local155 = Static166.anInt3282 + (local145 & 0x7);
				local161 = Static10.aClass1_Sub13_Sub1_117.method1872();
				local165 = Static10.aClass1_Sub13_Sub1_117.method1867();
				local169 = local165 >> 2;
				local173 = local165 & 0x3;
				local185 = Static10.aClass1_Sub13_Sub1_117.method1856();
				@Pc(1285) byte local1285 = Static10.aClass1_Sub13_Sub1_117.method1829();
				if (!Static71.aBoolean165) {
					Static90.method1736(local185, local155, local1285, local1223, local149, local169, local161, local1239, local173, local33, local1235, local19);
				}
			}
			if (Static126.anInt1523 == 9) {
				local15 = Static10.aClass1_Sub13_Sub1_117.method1867();
				local19 = Static262.anInt4841 + (local15 >> 4 & 0x7);
				local33 = Static166.anInt3282 + (local15 & 0x7);
				local25 = Static10.aClass1_Sub13_Sub1_117.method1856();
				local37 = Static10.aClass1_Sub13_Sub1_117.method1844();
				local145 = Static10.aClass1_Sub13_Sub1_117.method1856();
				if (local19 >= 0 && local33 >= 0 && local19 < 104 && local33 < 104 && local37 != Static68.anInt1471) {
					@Pc(1366) Class11_Sub7 local1366 = new Class11_Sub7();
					local1366.anInt5176 = local25;
					local1366.anInt5178 = local145;
					if (Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local19][local33] == null) {
						Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local19][local33] = new Class96();
					}
					Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local19][local33].method2336(new Class1_Sub5_Sub11(local1366));
					Static17.method274(local19, local33);
				}
			} else if (Static126.anInt1523 == 246) {
				local15 = Static10.aClass1_Sub13_Sub1_117.method1853();
				local19 = Static262.anInt4841 * 2 + (local15 >> 4 & 0xF);
				local33 = (local15 & 0xF) + Static166.anInt3282 * 2;
				local25 = Static10.aClass1_Sub13_Sub1_117.method1829() + local19;
				local37 = Static10.aClass1_Sub13_Sub1_117.method1829() + local33;
				local145 = Static10.aClass1_Sub13_Sub1_117.method1843();
				local149 = Static10.aClass1_Sub13_Sub1_117.method1879();
				local155 = Static10.aClass1_Sub13_Sub1_117.method1853() * 4;
				local161 = Static10.aClass1_Sub13_Sub1_117.method1853() * 4;
				local165 = Static10.aClass1_Sub13_Sub1_117.method1879();
				local169 = Static10.aClass1_Sub13_Sub1_117.method1879();
				local173 = Static10.aClass1_Sub13_Sub1_117.method1853();
				if (local173 == 255) {
					local173 = -1;
				}
				local185 = Static10.aClass1_Sub13_Sub1_117.method1853();
				if (local19 >= 0 && local33 >= 0 && local19 < 208 && local33 < 208 && local25 >= 0 && local37 >= 0 && local25 < 208 && local37 < 208 && local149 != 65535) {
					local19 = local19 * 64;
					local25 = local25 * 64;
					local37 *= 64;
					local33 = local33 * 64;
					local267 = new Class11_Sub3(local149, Static132.anInt2608, local19, local33, Static42.method768(local19, Static132.anInt2608, local33) - local155, Static167.anInt637 + local165, Static167.anInt637 + local169, local173, local185, local145, local161);
					local267.method1683(local37, Static42.method768(local25, Static132.anInt2608, local37) - local161, Static167.anInt637 + local165, local25);
					Static18.aClass96_1.method2336(new Class1_Sub5_Sub24(local267));
				}
			} else if (Static126.anInt1523 == 208) {
				local15 = Static10.aClass1_Sub13_Sub1_117.method1867();
				local33 = local15 & 0x3;
				local19 = local15 >> 2;
				local25 = Static81.anIntArray138[local19];
				local37 = Static10.aClass1_Sub13_Sub1_117.method1870();
				if (local37 == 65535) {
					local37 = -1;
				}
				local145 = Static10.aClass1_Sub13_Sub1_117.method1853();
				local149 = Static262.anInt4841 + (local145 >> 4 & 0x7);
				local155 = Static166.anInt3282 + (local145 & 0x7);
				Static173.method2977(local33, local149, Static132.anInt2608, local19, local155, local25, local37);
			} else if (Static126.anInt1523 == 155) {
				local15 = Static10.aClass1_Sub13_Sub1_117.method1853();
				local19 = Static262.anInt4841 + (local15 >> 4 & 0x7);
				local33 = Static166.anInt3282 + (local15 & 0x7);
				local25 = Static10.aClass1_Sub13_Sub1_117.method1867();
				local37 = local25 >> 2;
				local145 = local25 & 0x3;
				local149 = Static81.anIntArray138[local37];
				if (local19 >= 0 && local33 >= 0 && local19 < 104 && local33 < 104) {
					Static222.method3590(local33, local145, local37, -1, -1, local149, 0, local19, Static132.anInt2608);
				}
			}
		}
	}
}
