import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!il", name = "bb", descriptor = "[Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1[] aClass4_Sub2_Sub1_Sub1Array4;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "Lclient!vm;")
	public static Class177 aClass177_5 = new Class177();

	@OriginalMember(owner = "client!il", name = "Z", descriptor = "Z")
	public static volatile boolean aBoolean170 = false;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZIILclient!lc;Lclient!lc;)Lclient!sf;")
	public static Class4_Sub2_Sub19 method1984(@OriginalArg(2) int arg0, @OriginalArg(3) Class98 arg1, @OriginalArg(4) Class98 arg2) {
		@Pc(10) int[] local10 = arg1.method2384(arg0);
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < local10.length; local19++) {
			@Pc(31) byte[] local31 = arg1.method2397(arg0, local10[local19]);
			if (local31 == null) {
				local17 = false;
			} else {
				@Pc(52) int local52 = local31[1] & 0xFF | (local31[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg2.method2397(local52, 0);
				if (local60 == null) {
					local17 = false;
				}
			}
		}
		if (!local17) {
			return null;
		}
		try {
			return new Class4_Sub2_Sub19(arg1, arg2, arg0, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!cc;I)Lclient!cc;")
	public static Class22 method1988(@OriginalArg(0) Class22 arg0) {
		@Pc(2) Class22 local2 = Static40.method679(arg0);
		if (local2 == null) {
			local2 = arg0.aClass22_3;
		}
		return local2;
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(II)V")
	public static void method1990() {
		Static57.anInt1137 = 2;
		Static217.anInt4316 = 0;
		Static147.aBoolean197 = false;
		Static125.aClass98_78 = null;
		Static297.anInt5500 = -1;
		Static150.anInt3042 = -1;
		Static42.anInt863 = 1;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
	public static void method1992() {
		aClass177_5 = null;
		aClass4_Sub2_Sub1_Sub1Array4 = null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
	public static void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static220.anInt4365; local7++) {
			if (arg2 < Static77.anIntArray154[local7] + Static267.anIntArray300[local7] && Static77.anIntArray154[local7] < arg3 + arg2 && arg0 < Static197.anIntArray324[local7] + Static243.anIntArray427[local7] && Static197.anIntArray324[local7] < arg1 + arg0) {
				Static222.aBooleanArray20[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method1996() {
		@Pc(14) int local14;
		@Pc(32) int local32;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		if (Static92.anInt1908 == 172) {
			local14 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local22 = Static161.anInt3201 * 2 + (local14 & 0xF);
			local32 = (local14 >> 4 & 0xF) + Static233.anInt4547 * 2;
			local38 = local32 + Static101.aClass4_Sub17_Sub1_4.method1892();
			local44 = Static101.aClass4_Sub17_Sub1_4.method1892() + local22;
			local48 = Static101.aClass4_Sub17_Sub1_4.method1869();
			local52 = Static101.aClass4_Sub17_Sub1_4.method1869();
			local56 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local60 = Static101.aClass4_Sub17_Sub1_4.method1892();
			local66 = Static101.aClass4_Sub17_Sub1_4.method1874() * 4;
			local70 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local74 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local78 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local82 = Static101.aClass4_Sub17_Sub1_4.method1874();
			if (local78 == 255) {
				local78 = -1;
			}
			if (local32 >= 0 && local22 >= 0 && local32 < 208 && local22 < 208 && local38 >= 0 && local44 >= 0 && local38 < 208 && local44 < 208 && local56 != 65535) {
				local22 = local22 * 64;
				local38 = local38 * 64;
				local44 = local44 * 64;
				local32 *= 64;
				if (local48 != 0) {
					@Pc(157) int local157;
					@Pc(161) Class12_Sub3 local161;
					@Pc(147) int local147;
					@Pc(151) int local151;
					if (local48 >= 0) {
						local147 = local48 - 1;
						local151 = local147 & 0x7FF;
						local157 = local147 >> 11 & 0xF;
						local161 = Static100.aClass12_Sub3_Sub1Array1[local151];
					} else {
						local147 = -local48 - 1;
						local151 = local147 & 0x7FF;
						if (local151 == Static238.anInt4597) {
							local161 = Static239.aClass12_Sub3_Sub2_2;
						} else {
							local161 = Static257.aClass12_Sub3_Sub2Array1[local151];
						}
						local157 = local147 >> 11 & 0xF;
					}
					if (local161 != null) {
						@Pc(201) Class72 local201 = local161.method3361();
						if (local201.anIntArrayArray22 != null && local201.anIntArrayArray22[local157] != null) {
							local60 -= local201.anIntArrayArray22[local157][1];
							local151 = local201.anIntArrayArray22[local157][0];
							@Pc(232) int local232 = Class131.anIntArray355[local161.anInt4121];
							@Pc(239) int local239 = local201.anIntArrayArray22[local157][2];
							@Pc(244) int local244 = Class131.anIntArray353[local161.anInt4121];
							@Pc(254) int local254 = local244 * local151 + local232 * local239 >> 16;
							@Pc(265) int local265 = local244 * local239 - local232 * local151 >> 16;
							local32 += local254;
							local22 += local265;
						}
					}
				}
				@Pc(301) Class12_Sub5 local301 = new Class12_Sub5(local56, Static210.anInt4103, local32, local22, Static96.method1559(Static210.anInt4103, local22, local32) - local60, local70 + Static104.anInt2226, Static104.anInt2226 + local74, local78, local82, local52, local66);
				local301.method3128(local44, local38, local70 + Static104.anInt2226, -local66 + Static96.method1559(Static210.anInt4103, local44, local38));
				Static241.aClass10_50.method184(new Class4_Sub2_Sub18(local301));
			}
		} else if (Static92.anInt1908 == 81) {
			local14 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local32 = (local14 >> 4 & 0x7) + Static233.anInt4547;
			local22 = (local14 & 0x7) + Static161.anInt3201;
			local38 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local44 = Static101.aClass4_Sub17_Sub1_4.method1874();
			if (local38 == 65535) {
				local38 = -1;
			}
			local52 = local44 & 0x7;
			local48 = local44 >> 4 & 0xF;
			local56 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local60 = Static101.aClass4_Sub17_Sub1_4.method1874();
			if (local32 >= 0 && local22 >= 0 && local32 < 104 && local22 < 104) {
				local66 = local48 + 1;
				if (Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] >= local32 - local66 && local66 + local32 >= Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] && Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] >= local22 - local66 && Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] <= local22 + local66 && Static71.anInt1312 != 0 && local52 > 0 && Static7.anInt173 < 50 && local38 != -1) {
					Static92.anIntArray205[Static7.anInt173] = local38;
					Static66.anIntArray137[Static7.anInt173] = local52;
					Static262.anIntArray440[Static7.anInt173] = local56;
					Static211.aClass60Array1[Static7.anInt173] = null;
					Static200.anIntArray336[Static7.anInt173] = local48 + (local22 << 8) + (local32 << 16);
					Static10.anIntArray23[Static7.anInt173] = local60;
					Static7.anInt173++;
				}
			}
		} else if (Static92.anInt1908 == 6) {
			local14 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local22 = Static161.anInt3201 + (local14 & 0x7);
			local32 = Static233.anInt4547 + (local14 >> 4 & 0x7);
			local38 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local44 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local48 = Static101.aClass4_Sub17_Sub1_4.method1837();
			if (local32 >= 0 && local22 >= 0 && local32 < 104 && local22 < 104) {
				local32 = local32 * 128 + 64;
				local22 = local22 * 128 + 64;
				@Pc(583) Class12_Sub1 local583 = new Class12_Sub1(local38, Static210.anInt4103, local32, local22, Static96.method1559(Static210.anInt4103, local22, local32) - local44, local48, Static104.anInt2226);
				Static209.aClass10_61.method184(new Class4_Sub2_Sub7(local583));
			}
		} else if (Static92.anInt1908 == 138) {
			local14 = Static101.aClass4_Sub17_Sub1_4.method1865();
			local32 = local14 >> 2;
			local22 = local14 & 0x3;
			local38 = Static262.anIntArray441[local32];
			local44 = Static101.aClass4_Sub17_Sub1_4.method1882();
			local48 = (local44 >> 4 & 0x7) + Static233.anInt4547;
			local52 = (local44 & 0x7) + Static161.anInt3201;
			if (local48 >= 0 && local52 >= 0 && local48 < 104 && local52 < 104) {
				Static93.method1494(local52, local48, local32, -1, local22, 0, -1, Static210.anInt4103, local38);
			}
		} else if (Static92.anInt1908 == 130) {
			local14 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local32 = (local14 >> 4 & 0x7) + Static233.anInt4547;
			local22 = (local14 & 0x7) + Static161.anInt3201;
			local38 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local48 = local38 & 0x3;
			local44 = local38 >> 2;
			local52 = Static262.anIntArray441[local44];
			local56 = Static101.aClass4_Sub17_Sub1_4.method1868();
			if (local32 >= 0 && local22 >= 0 && local32 < 104 && local22 < 104) {
				Static93.method1494(local22, local32, local44, local56, local48, 0, -1, Static210.anInt4103, local52);
			}
		} else if (Static92.anInt1908 == 82) {
			local14 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local32 = Static101.aClass4_Sub17_Sub1_4.method1874();
			local38 = Static161.anInt3201 + (local32 & 0x7);
			local22 = Static233.anInt4547 + (local32 >> 4 & 0x7);
			local44 = Static101.aClass4_Sub17_Sub1_4.method1851();
			if (local22 >= 0 && local38 >= 0 && local22 < 104 && local38 < 104) {
				@Pc(778) Class12_Sub4 local778 = new Class12_Sub4();
				local778.anInt2883 = local44;
				local778.anInt2878 = local14;
				if (Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local22][local38] == null) {
					Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local22][local38] = new Class10();
				}
				Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local22][local38].method184(new Class4_Sub2_Sub20(local778));
				Static261.method3957(local22, local38);
			}
		} else {
			@Pc(990) Class12_Sub5 local990;
			if (Static92.anInt1908 == 18) {
				local14 = Static101.aClass4_Sub17_Sub1_4.method1874();
				local32 = (local14 >> 4 & 0x7) + Static233.anInt4547;
				local22 = (local14 & 0x7) + Static161.anInt3201;
				local38 = Static101.aClass4_Sub17_Sub1_4.method1892() + local32;
				local44 = local22 + Static101.aClass4_Sub17_Sub1_4.method1892();
				local48 = Static101.aClass4_Sub17_Sub1_4.method1869();
				local52 = Static101.aClass4_Sub17_Sub1_4.method1837();
				local56 = Static101.aClass4_Sub17_Sub1_4.method1874() * 4;
				local60 = Static101.aClass4_Sub17_Sub1_4.method1874() * 4;
				local66 = Static101.aClass4_Sub17_Sub1_4.method1837();
				local70 = Static101.aClass4_Sub17_Sub1_4.method1837();
				local74 = Static101.aClass4_Sub17_Sub1_4.method1874();
				if (local74 == 255) {
					local74 = -1;
				}
				local78 = Static101.aClass4_Sub17_Sub1_4.method1874();
				if (local32 >= 0 && local22 >= 0 && local32 < 104 && local22 < 104 && local38 >= 0 && local44 >= 0 && local38 < 104 && local44 < 104 && local52 != 65535) {
					local38 = local38 * 128 + 64;
					local32 = local32 * 128 + 64;
					local44 = local44 * 128 + 64;
					local22 = local22 * 128 + 64;
					local990 = new Class12_Sub5(local52, Static210.anInt4103, local32, local22, Static96.method1559(Static210.anInt4103, local22, local32) - local56, Static104.anInt2226 + local66, Static104.anInt2226 + local70, local74, local78, local48, local60);
					local990.method3128(local44, local38, Static104.anInt2226 + local66, Static96.method1559(Static210.anInt4103, local44, local38) + -local60);
					Static241.aClass10_50.method184(new Class4_Sub2_Sub18(local990));
				}
			} else if (Static92.anInt1908 == 111) {
				local14 = Static101.aClass4_Sub17_Sub1_4.method1865();
				local22 = Static161.anInt3201 + (local14 & 0x7);
				local32 = (local14 >> 4 & 0x7) + Static233.anInt4547;
				local38 = Static101.aClass4_Sub17_Sub1_4.method1851();
				local44 = Static101.aClass4_Sub17_Sub1_4.method1837();
				local48 = Static101.aClass4_Sub17_Sub1_4.method1851();
				if (local32 >= 0 && local22 >= 0 && local32 < 104 && local22 < 104 && local38 != Static238.anInt4597) {
					@Pc(1073) Class12_Sub4 local1073 = new Class12_Sub4();
					local1073.anInt2883 = local44;
					local1073.anInt2878 = local48;
					if (Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local32][local22] == null) {
						Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local32][local22] = new Class10();
					}
					Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local32][local22].method184(new Class4_Sub2_Sub20(local1073));
					Static261.method3957(local32, local22);
				}
			} else {
				if (Static92.anInt1908 == 211) {
					local14 = Static101.aClass4_Sub17_Sub1_4.method1869();
					@Pc(1126) byte local1126 = Static101.aClass4_Sub17_Sub1_4.method1842();
					@Pc(1130) byte local1130 = Static101.aClass4_Sub17_Sub1_4.method1892();
					local38 = Static101.aClass4_Sub17_Sub1_4.method1868();
					local44 = Static101.aClass4_Sub17_Sub1_4.method1874();
					local52 = (local44 & 0x7) + Static161.anInt3201;
					local48 = Static233.anInt4547 + (local44 >> 4 & 0x7);
					local56 = Static101.aClass4_Sub17_Sub1_4.method1837();
					@Pc(1161) byte local1161 = Static101.aClass4_Sub17_Sub1_4.method1894();
					@Pc(1165) byte local1165 = Static101.aClass4_Sub17_Sub1_4.method1892();
					local70 = Static101.aClass4_Sub17_Sub1_4.method1874();
					local82 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local78 = local70 & 0x3;
					local74 = local70 >> 2;
					if (!Static178.aBoolean216) {
						Static41.method685(local1126, local74, local56, local38, local48, local82, local1161, local1130, local1165, local78, local14, local52);
					}
				}
				if (Static92.anInt1908 == 137) {
					local14 = Static101.aClass4_Sub17_Sub1_4.method1874();
					local32 = (local14 >> 4 & 0x7) + Static233.anInt4547;
					local22 = (local14 & 0x7) + Static161.anInt3201;
					local38 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local44 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local48 = Static101.aClass4_Sub17_Sub1_4.method1837();
					if (local32 >= 0 && local22 >= 0 && local32 < 104 && local22 < 104) {
						@Pc(1254) Class10 local1254 = Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local32][local22];
						if (local1254 != null) {
							for (@Pc(1261) Class4_Sub2_Sub20 local1261 = (Class4_Sub2_Sub20) local1254.method190(); local1261 != null; local1261 = (Class4_Sub2_Sub20) local1254.method191()) {
								@Pc(1267) Class12_Sub4 local1267 = local1261.aClass12_Sub4_1;
								if ((local38 & 0x7FFF) == local1267.anInt2878 && local44 == local1267.anInt2883) {
									local1267.anInt2883 = local48;
									break;
								}
							}
							Static261.method3957(local32, local22);
						}
					}
				} else if (Static92.anInt1908 == 132) {
					local14 = Static101.aClass4_Sub17_Sub1_4.method1874();
					local22 = Static161.anInt3201 * 2 + (local14 & 0xF);
					local32 = Static233.anInt4547 * 2 + (local14 >> 4 & 0xF);
					local38 = local32 + Static101.aClass4_Sub17_Sub1_4.method1892();
					local44 = Static101.aClass4_Sub17_Sub1_4.method1892() + local22;
					local48 = Static101.aClass4_Sub17_Sub1_4.method1869();
					local52 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local56 = Static101.aClass4_Sub17_Sub1_4.method1874() * 4;
					local60 = Static101.aClass4_Sub17_Sub1_4.method1874() * 4;
					local66 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local70 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local74 = Static101.aClass4_Sub17_Sub1_4.method1874();
					local78 = Static101.aClass4_Sub17_Sub1_4.method1874();
					if (local74 == 255) {
						local74 = -1;
					}
					if (local32 >= 0 && local22 >= 0 && local32 < 208 && local22 < 208 && local38 >= 0 && local44 >= 0 && local38 < 208 && local44 < 208 && local52 != 65535) {
						local32 *= 64;
						local44 = local44 * 64;
						local38 = local38 * 64;
						local22 *= 64;
						local990 = new Class12_Sub5(local52, Static210.anInt4103, local32, local22, Static96.method1559(Static210.anInt4103, local22, local32) - local56, Static104.anInt2226 + local66, local70 + Static104.anInt2226, local74, local78, local48, local60);
						local990.method3128(local44, local38, local66 + Static104.anInt2226, Static96.method1559(Static210.anInt4103, local44, local38) - local60);
						Static241.aClass10_50.method184(new Class4_Sub2_Sub18(local990));
					}
				} else if (Static92.anInt1908 == 214) {
					local14 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local32 = Static101.aClass4_Sub17_Sub1_4.method1882();
					local22 = Static233.anInt4547 + (local32 >> 4 & 0x7);
					local38 = Static161.anInt3201 + (local32 & 0x7);
					if (local22 >= 0 && local38 >= 0 && local22 < 104 && local38 < 104) {
						@Pc(1540) Class10 local1540 = Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local22][local38];
						if (local1540 != null) {
							for (@Pc(1548) Class4_Sub2_Sub20 local1548 = (Class4_Sub2_Sub20) local1540.method190(); local1548 != null; local1548 = (Class4_Sub2_Sub20) local1540.method191()) {
								if ((local14 & 0x7FFF) == local1548.aClass12_Sub4_1.anInt2878) {
									local1548.method4391();
									break;
								}
							}
							if (local1540.method190() == null) {
								Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local22][local38] = null;
							}
							Static261.method3957(local22, local38);
						}
					}
				} else if (Static92.anInt1908 == 76) {
					local14 = Static101.aClass4_Sub17_Sub1_4.method1865();
					local32 = local14 >> 2;
					local38 = Static262.anIntArray441[local32];
					local22 = local14 & 0x3;
					local44 = Static101.aClass4_Sub17_Sub1_4.method1874();
					local48 = Static233.anInt4547 + (local44 >> 4 & 0x7);
					local52 = Static161.anInt3201 + (local44 & 0x7);
					local56 = Static101.aClass4_Sub17_Sub1_4.method1868();
					if (local56 == 65535) {
						local56 = -1;
					}
					Static35.method515(local52, local32, Static210.anInt4103, local38, local56, local48, local22);
				} else if (Static92.anInt1908 == 213) {
					local14 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local32 = Static101.aClass4_Sub17_Sub1_4.method1874();
					Static170.method2683(local14).method1094(local32);
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	public static void method1997() {
		while (true) {
			if (Static101.aClass4_Sub17_Sub1_4.method1900(Static131.anInt2781) >= 27) {
				@Pc(20) int local20 = Static101.aClass4_Sub17_Sub1_4.method1898(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static100.aClass12_Sub3_Sub1Array1[local20] == null) {
						local27 = true;
						Static100.aClass12_Sub3_Sub1Array1[local20] = new Class12_Sub3_Sub1();
					}
					@Pc(44) Class12_Sub3_Sub1 local44 = Static100.aClass12_Sub3_Sub1Array1[local20];
					Static10.anIntArray20[Static68.anInt1262++] = local20;
					local44.anInt4167 = Static104.anInt2226;
					if (local44.aClass175_1 != null && local44.aClass175_1.method4134()) {
						Static280.method4227(local44);
					}
					@Pc(72) int local72 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
					@Pc(77) int local77 = Static101.aClass4_Sub17_Sub1_4.method1898(5);
					if (local77 > 15) {
						local77 -= 32;
					}
					@Pc(87) int local87 = Static101.aClass4_Sub17_Sub1_4.method1898(5);
					if (local87 > 15) {
						local87 -= 32;
					}
					@Pc(101) int local101 = Static103.anIntArray225[Static101.aClass4_Sub17_Sub1_4.method1898(3)];
					if (local27) {
						local44.anInt4136 = local44.anInt4121 = local101;
					}
					local44.method1562(Static262.method3970(Static101.aClass4_Sub17_Sub1_4.method1898(14)));
					@Pc(127) int local127 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
					if (local127 == 1) {
						Static97.anIntArray219[Static84.anInt1709++] = local20;
					}
					local44.method3362(local44.aClass175_1.anInt5217);
					local44.anInt4126 = local44.aClass175_1.anInt5218;
					local44.anInt4115 = local44.aClass175_1.anInt5219;
					if (local44.anInt4115 == 0) {
						local44.anInt4121 = 0;
					}
					local44.method3367(Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] + local87, Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] - -local77, local44.method3375(), local72 == 1);
					if (local44.aClass175_1.method4134()) {
						Static54.method872(local44.anIntArray379[0], null, local44, 0, local44.anIntArray376[0], null, Static210.anInt4103);
					}
					continue;
				}
			}
			Static101.aClass4_Sub17_Sub1_4.method1901();
			return;
		}
	}
}
