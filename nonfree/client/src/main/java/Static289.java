import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[200];

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ss;)V")
	public static void method4749(@OriginalArg(1) Class213 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(35) int local35;
		@Pc(39) int local39;
		if (Static347.aClass213_14 == arg0) {
			local12 = Static321.aClass2_Sub24_Sub2_34.method5733();
			local20 = Static306.anInt5661 + (local12 >> 4 & 0x7);
			local27 = Static192.anInt4019 + (local12 & 0x7);
			local31 = Static321.aClass2_Sub24_Sub2_34.method5777();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local43 = Static307.anIntArray497[local35];
			local47 = Static321.aClass2_Sub24_Sub2_34.method5719();
			if (local20 >= 0 && local27 >= 0 && Static89.anInt1891 > local20 && local27 < Static85.anInt1839) {
				Static160.method2833(local27, local39, local43, Static276.anInt7132, local35, local20, local47);
			}
		} else if (Static206.aClass213_10 == arg0) {
			local12 = Static321.aClass2_Sub24_Sub2_34.method5732();
			local20 = Static306.anInt5661 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static192.anInt4019;
			local31 = Static321.aClass2_Sub24_Sub2_34.method5753();
			local35 = Static321.aClass2_Sub24_Sub2_34.method5753();
			local39 = Static321.aClass2_Sub24_Sub2_34.method5753();
			if (Static301.aClass243_24 != null && local20 >= 0 && local27 >= 0 && local20 < Static89.anInt1891 && local27 < Static85.anInt1839) {
				@Pc(139) Class2_Sub30 local139 = (Class2_Sub30) Static301.aClass243_24.method5967((long) (local27 << 14 | Static276.anInt7132 << 28 | local20));
				if (local139 != null) {
					for (@Pc(147) Class2_Sub34 local147 = (Class2_Sub34) local139.aClass238_22.method5795(); local147 != null; local147 = (Class2_Sub34) local139.aClass238_22.method5799()) {
						if (local147.anInt5599 == (local31 & 0x7FFF) && local35 == local147.anInt5603) {
							local147.method6130();
							local147.anInt5603 = local39;
							Static134.method2354(local20, local147, Static276.anInt7132, local27);
							break;
						}
					}
					Static89.method1500(Static276.anInt7132, local27, local20);
				}
			}
		} else {
			@Pc(244) int local244;
			@Pc(264) int local264;
			if (Static53.aClass213_5 == arg0) {
				local12 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local20 = Static306.anInt5661 + (local12 >> 4 & 0x7);
				local27 = (local12 & 0x7) + Static192.anInt4019;
				local31 = Static321.aClass2_Sub24_Sub2_34.method5753();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local39 = local35 >> 4 & 0xF;
				local43 = local35 & 0x7;
				local47 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local244 = Static321.aClass2_Sub24_Sub2_34.method5732();
				if (local20 >= 0 && local27 >= 0 && Static89.anInt1891 > local20 && Static85.anInt1839 > local27) {
					local264 = local39 + 1;
					if (Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0] >= local20 - local264 && Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0] <= local20 + local264 && local27 - local264 <= Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0] && Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0] <= local27 + local264 && Static107.anInt2388 != 0 && local43 > 0 && Static277.anInt5160 < 50 && local31 != -1) {
						Static104.anIntArray191[Static277.anInt5160] = local31;
						Static145.anIntArray459[Static277.anInt5160] = local43;
						Static321.anIntArray511[Static277.anInt5160] = local47;
						Static349.aClass80Array1[Static277.anInt5160] = null;
						Static283.anIntArray454[Static277.anInt5160] = local39 + (local20 << 16) + (Static276.anInt7132 << 24) + (local27 << 8);
						Static55.anIntArray87[Static277.anInt5160] = local244;
						Static277.anInt5160++;
					}
				}
			} else if (Static110.aClass213_7 == arg0) {
				local12 = Static321.aClass2_Sub24_Sub2_34.method5753();
				local20 = Static321.aClass2_Sub24_Sub2_34.method5732();
				Static230.aClass96_4.method2303(local12).method900(local20);
			} else if (Static265.aClass213_12 == arg0) {
				local12 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local20 = Static306.anInt5661 + (local12 >> 4 & 0x7);
				local27 = (local12 & 0x7) + Static192.anInt4019;
				local31 = Static321.aClass2_Sub24_Sub2_34.method5753();
				local35 = Static321.aClass2_Sub24_Sub2_34.method5732();
				local39 = Static321.aClass2_Sub24_Sub2_34.method5753();
				if (local20 >= 0 && local27 >= 0 && Static89.anInt1891 > local20 && local27 < Static85.anInt1839) {
					local43 = local20 * 128 + 64;
					local47 = local27 * 128 + 64;
					@Pc(475) Class1_Sub2_Sub6 local475 = new Class1_Sub2_Sub6(local31, local39, Static339.anInt6265, Static276.anInt7132, local43, Static36.method2335(local47, Static276.anInt7132, local43) - local35, local47, local20, local20, local27, local27);
					Static248.aClass238_25.method5796(new Class2_Sub7_Sub7(local475));
				}
			} else {
				@Pc(550) int local550;
				@Pc(554) int local554;
				@Pc(558) int local558;
				@Pc(652) Class1_Sub2_Sub5 local652;
				if (arg0 == Static13.aClass213_1) {
					local12 = Static321.aClass2_Sub24_Sub2_34.method5732();
					local20 = (local12 >> 4 & 0x7) + Static306.anInt5661;
					local27 = (local12 & 0x7) + Static192.anInt4019;
					local31 = local20 + Static321.aClass2_Sub24_Sub2_34.method5759();
					local35 = Static321.aClass2_Sub24_Sub2_34.method5759() + local27;
					local39 = Static321.aClass2_Sub24_Sub2_34.method5743();
					local43 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local47 = Static321.aClass2_Sub24_Sub2_34.method5732() * 4;
					local244 = Static321.aClass2_Sub24_Sub2_34.method5732() * 4;
					local264 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local550 = Static321.aClass2_Sub24_Sub2_34.method5753();
					local554 = Static321.aClass2_Sub24_Sub2_34.method5732();
					local558 = Static321.aClass2_Sub24_Sub2_34.method5732();
					if (local554 == 255) {
						local554 = -1;
					}
					if (local20 >= 0 && local27 >= 0 && Static89.anInt1891 > local20 && local27 < Static85.anInt1839 && local31 >= 0 && local35 >= 0 && Static89.anInt1891 > local31 && Static85.anInt1839 > local35 && local43 != 65535) {
						local20 = local20 * 128 + 64;
						local35 = local35 * 128 + 64;
						local27 = local27 * 128 + 64;
						local31 = local31 * 128 + 64;
						local652 = new Class1_Sub2_Sub5(local43, Static276.anInt7132, local20, local27, Static36.method2335(local27, Static276.anInt7132, local20) - local47, Static339.anInt6265 + local264, Static339.anInt6265 + local550, local554, local558, local39, local244);
						local652.method5124(Static339.anInt6265 + local264, local35, Static36.method2335(local35, Static276.anInt7132, local31) - local244, local31);
						Static307.aClass238_33.method5796(new Class2_Sub7_Sub15(local652));
					}
				} else {
					@Pc(751) int local751;
					if (arg0 == Static317.aClass213_13) {
						local12 = Static321.aClass2_Sub24_Sub2_34.method5732();
						local20 = (local12 >> 4 & 0xF) + Static306.anInt5661 * 2;
						local27 = Static192.anInt4019 * 2 + (local12 & 0xF);
						local31 = local20 + Static321.aClass2_Sub24_Sub2_34.method5759();
						local35 = local27 + Static321.aClass2_Sub24_Sub2_34.method5759();
						local39 = Static321.aClass2_Sub24_Sub2_34.method5743();
						local43 = Static321.aClass2_Sub24_Sub2_34.method5743();
						local47 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local244 = Static321.aClass2_Sub24_Sub2_34.method5759();
						local264 = Static321.aClass2_Sub24_Sub2_34.method5732() * 4;
						local550 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local554 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local558 = Static321.aClass2_Sub24_Sub2_34.method5732();
						local751 = Static321.aClass2_Sub24_Sub2_34.method5732();
						if (local558 == 255) {
							local558 = -1;
						}
						if (local20 >= 0 && local27 >= 0 && local20 < Static89.anInt1891 * 2 && local27 < Static89.anInt1891 * 2 && local31 >= 0 && local35 >= 0 && Static85.anInt1839 * 2 > local31 && Static85.anInt1839 * 2 > local35 && local47 != 65535) {
							local27 *= 64;
							local31 *= 64;
							local35 = local35 * 64;
							local20 = local20 * 64;
							if (local39 != 0) {
								@Pc(845) int local845;
								@Pc(850) Class1_Sub2_Sub1 local850;
								@Pc(835) int local835;
								@Pc(839) int local839;
								if (local39 < 0) {
									local835 = -local39 - 1;
									local839 = local835 & 0x7FF;
									local845 = local835 >> 11 & 0xF;
									if (Static93.anInt1976 == local839) {
										local850 = Static182.aClass1_Sub2_Sub1_Sub1_1;
									} else {
										local850 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local839];
									}
								} else {
									local835 = local39 - 1;
									local839 = local835 & 0x7FF;
									local845 = local835 >> 11 & 0xF;
									local850 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local839];
								}
								if (local850 != null) {
									@Pc(882) Class227 local882 = local850.method4799();
									if (local882.anIntArrayArray56 != null && local882.anIntArrayArray56[local845] != null) {
										local839 = local882.anIntArrayArray56[local845][0];
										@Pc(904) int local904 = local882.anIntArrayArray56[local845][2];
										@Pc(909) int local909 = local850.aClass217_7.method5455();
										@Pc(913) int local913 = Class106.anIntArray240[local909];
										@Pc(917) int local917 = Class106.anIntArray242[local909];
										@Pc(927) int local927 = local917 * local839 + local904 * local913 >> 15;
										@Pc(938) int local938 = local917 * local904 - local913 * local839 >> 15;
										local27 += local938;
										local20 += local927;
										local244 -= local882.anIntArrayArray56[local845][1];
									}
								}
							}
							@Pc(983) Class1_Sub2_Sub5 local983 = new Class1_Sub2_Sub5(local47, Static276.anInt7132, local20, local27, Static36.method2335(local27, Static276.anInt7132, local20) - local244, Static339.anInt6265 + local550, Static339.anInt6265 + local554, local558, local751, local43, local264);
							local983.method5124(Static339.anInt6265 + local550, local35, Static36.method2335(local35, Static276.anInt7132, local31) - local264, local31);
							Static307.aClass238_33.method5796(new Class2_Sub7_Sub15(local983));
						}
					} else if (Static13.aClass213_2 == arg0) {
						local12 = Static321.aClass2_Sub24_Sub2_34.method5723();
						local20 = local12 >> 2;
						local27 = local12 & 0x3;
						local31 = Static307.anIntArray497[local20];
						local35 = Static321.aClass2_Sub24_Sub2_34.method5777();
						local39 = Static306.anInt5661 + (local35 >> 4 & 0x7);
						local43 = (local35 & 0x7) + Static192.anInt4019;
						if (local39 >= 0 && local43 >= 0 && local39 < Static89.anInt1891 && local43 < Static85.anInt1839) {
							Static160.method2833(local43, local27, local31, Static276.anInt7132, local20, local39, -1);
						}
					} else if (Static28.aClass213_4 == arg0) {
						Static321.aClass2_Sub24_Sub2_34.method5732();
						local12 = Static321.aClass2_Sub24_Sub2_34.method5732();
						local20 = (local12 >> 4 & 0x7) + Static306.anInt5661;
						local27 = (local12 & 0x7) + Static192.anInt4019;
						local31 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local35 = Static321.aClass2_Sub24_Sub2_34.method5732();
						local39 = Static321.aClass2_Sub24_Sub2_34.method5736();
						@Pc(1115) String local1115 = Static321.aClass2_Sub24_Sub2_34.method5744();
						Static236.method4216(local20, Static276.anInt7132, local1115, local39, local31, local27, local35);
					} else if (Static247.aClass213_11 == arg0) {
						@Pc(1132) byte local1132 = Static321.aClass2_Sub24_Sub2_34.method5742();
						local20 = Static321.aClass2_Sub24_Sub2_34.method5777();
						local27 = (local20 >> 4 & 0x7) + Static306.anInt5661;
						local31 = (local20 & 0x7) + Static192.anInt4019;
						local35 = Static321.aClass2_Sub24_Sub2_34.method5778();
						@Pc(1158) byte local1158 = Static321.aClass2_Sub24_Sub2_34.method5730();
						@Pc(1162) byte local1162 = Static321.aClass2_Sub24_Sub2_34.method5742();
						@Pc(1166) byte local1166 = Static321.aClass2_Sub24_Sub2_34.method5759();
						local244 = Static321.aClass2_Sub24_Sub2_34.method5719();
						local264 = Static321.aClass2_Sub24_Sub2_34.method5733();
						local550 = local264 >> 2;
						local554 = local264 & 0x3;
						local558 = Static321.aClass2_Sub24_Sub2_34.method5720();
						local751 = Static321.aClass2_Sub24_Sub2_34.method5767();
						if (!Static383.aClass48_9.method2453()) {
							Static56.method4656(local1162, local35, local1158, local1166, local550, local558, Static276.anInt7132, local554, local244, local31, local27, local751, local1132);
						}
					} else if (arg0 == Static58.aClass213_6) {
						local12 = Static321.aClass2_Sub24_Sub2_34.method5777();
						local20 = (local12 >> 4 & 0x7) + Static306.anInt5661;
						local27 = Static192.anInt4019 + (local12 & 0x7);
						local31 = Static321.aClass2_Sub24_Sub2_34.method5767();
						if (local20 >= 0 && local27 >= 0 && Static89.anInt1891 > local20 && local27 < Static85.anInt1839) {
							@Pc(1271) Class2_Sub30 local1271 = (Class2_Sub30) Static301.aClass243_24.method5967((long) (local27 << 14 | Static276.anInt7132 << 28 | local20));
							if (local1271 != null) {
								for (@Pc(1279) Class2_Sub34 local1279 = (Class2_Sub34) local1271.aClass238_22.method5795(); local1279 != null; local1279 = (Class2_Sub34) local1271.aClass238_22.method5799()) {
									if (local1279.anInt5599 == (local31 & 0x7FFF)) {
										local1279.method6130();
										break;
									}
								}
								if (local1271.aClass238_22.method5805()) {
									local1271.method6130();
								}
								Static89.method1500(Static276.anInt7132, local27, local20);
							}
						}
					} else if (Static183.aClass213_9 == arg0) {
						local12 = Static321.aClass2_Sub24_Sub2_34.method5733();
						local20 = (local12 >> 4 & 0x7) + Static306.anInt5661;
						local27 = (local12 & 0x7) + Static192.anInt4019;
						local31 = Static321.aClass2_Sub24_Sub2_34.method5720();
						if (local31 == 65535) {
							local31 = -1;
						}
						local35 = Static321.aClass2_Sub24_Sub2_34.method5777();
						local39 = local35 >> 2;
						local43 = local35 & 0x3;
						local47 = Static307.anIntArray497[local39];
						Static193.method3519(local20, local31, local47, local43, Static276.anInt7132, local39, local27);
					} else if (arg0 == Static357.aClass213_15) {
						local12 = Static321.aClass2_Sub24_Sub2_34.method5732();
						local20 = (local12 >> 4 & 0xF) + Static306.anInt5661 * 2;
						local27 = (local12 & 0xF) + Static192.anInt4019 * 2;
						local31 = Static321.aClass2_Sub24_Sub2_34.method5759() + local20;
						local35 = Static321.aClass2_Sub24_Sub2_34.method5759() + local27;
						local39 = Static321.aClass2_Sub24_Sub2_34.method5743();
						local43 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local47 = Static321.aClass2_Sub24_Sub2_34.method5732() * 4;
						local244 = Static321.aClass2_Sub24_Sub2_34.method5732() * 4;
						local264 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local550 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local554 = Static321.aClass2_Sub24_Sub2_34.method5732();
						local558 = Static321.aClass2_Sub24_Sub2_34.method5732();
						if (local554 == 255) {
							local554 = -1;
						}
						if (local20 >= 0 && local27 >= 0 && local20 < Static89.anInt1891 * 2 && Static89.anInt1891 * 2 > local27 && local31 >= 0 && local35 >= 0 && local31 < Static85.anInt1839 * 2 && Static85.anInt1839 * 2 > local35 && local43 != 65535) {
							local20 *= 64;
							local31 = local31 * 64;
							local35 *= 64;
							local27 *= 64;
							local652 = new Class1_Sub2_Sub5(local43, Static276.anInt7132, local20, local27, Static36.method2335(local27, Static276.anInt7132, local20) - local47, local264 - -Static339.anInt6265, Static339.anInt6265 + local550, local554, local558, local39, local244);
							local652.method5124(local264 + Static339.anInt6265, local35, Static36.method2335(local35, Static276.anInt7132, local31) - local244, local31);
							Static307.aClass238_33.method5796(new Class2_Sub7_Sub15(local652));
						}
					} else if (arg0 == Static115.aClass213_8) {
						local12 = Static321.aClass2_Sub24_Sub2_34.method5723();
						local20 = Static306.anInt5661 + (local12 >> 4 & 0x7);
						local27 = Static192.anInt4019 + (local12 & 0x7);
						local31 = Static321.aClass2_Sub24_Sub2_34.method5753();
						local35 = Static321.aClass2_Sub24_Sub2_34.method5719();
						if (local20 >= 0 && local27 >= 0 && Static89.anInt1891 > local20 && local27 < Static85.anInt1839) {
							Static134.method2354(local20, new Class2_Sub34(local31, local35), Static276.anInt7132, local27);
							Static89.method1500(Static276.anInt7132, local27, local20);
						}
					} else if (Static18.aClass213_3 == arg0) {
						local12 = Static321.aClass2_Sub24_Sub2_34.method5767();
						local20 = Static321.aClass2_Sub24_Sub2_34.method5719();
						local27 = Static321.aClass2_Sub24_Sub2_34.method5720();
						local31 = Static321.aClass2_Sub24_Sub2_34.method5723();
						local35 = Static306.anInt5661 + (local31 >> 4 & 0x7);
						local39 = Static192.anInt4019 + (local31 & 0x7);
						if (local35 >= 0 && local39 >= 0 && Static89.anInt1891 > local35 && Static85.anInt1839 > local39 && Static93.anInt1976 != local20) {
							Static134.method2354(local35, new Class2_Sub34(local27, local12), Static276.anInt7132, local39);
							Static89.method1500(Static276.anInt7132, local39, local35);
						}
					} else {
						Static346.method5531(null, "T3 - " + arg0);
						Static241.method2190();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!g;Lclient!g;)V")
	public static void method4753(@OriginalArg(1) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		Static233.aClass83_83 = arg1;
		Static77.aClass83_36 = arg0;
	}
}
