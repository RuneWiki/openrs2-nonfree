import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static int anInt3959 = 0;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public static void method3637() {
		@Pc(16) int local16;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		if (Static1.anInt4 == 13) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
			local25 = Static152.anInt3091 + (local16 >> 4 & 0x7);
			local31 = (local16 & 0x7) + Static203.anInt3939;
			local35 = Static6.aClass5_Sub1_Sub1_1.method1845();
			if (local25 >= 0 && local31 >= 0 && Static266.anInt5101 > local25 && local31 < Static339.anInt6352) {
				@Pc(60) Class5_Sub16 local60 = (Class5_Sub16) Static3.aClass42_56.method1052((long) (local25 | local31 << 14 | Static156.anInt3123 << 28));
				if (local60 != null) {
					for (@Pc(68) Class5_Sub36 local68 = (Class5_Sub36) local60.aClass211_7.method5608(); local68 != null; local68 = (Class5_Sub36) local60.aClass211_7.method5603()) {
						if (local68.anInt5029 == (local35 & 0x7FFF)) {
							local68.method5803();
							break;
						}
					}
					if (local60.aClass211_7.method5606()) {
						local60.method5803();
					}
					Static60.method1250(Static156.anInt3123, local31, local25);
				}
			}
		} else if (Static1.anInt4 == 116) {
			local16 = Static6.aClass5_Sub1_Sub1_1.method1845();
			local25 = Static6.aClass5_Sub1_Sub1_1.method1832();
			Static228.method3923(local16).method3710(local25);
		} else {
			@Pc(158) int local158;
			@Pc(165) int local165;
			if (Static1.anInt4 == 24) {
				local16 = Static6.aClass5_Sub1_Sub1_1.method1875();
				local25 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local31 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local35 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local158 = Static152.anInt3091 + (local35 >> 4 & 0x7);
				local165 = Static203.anInt3939 + (local35 & 0x7);
				if (local158 >= 0 && local165 >= 0 && Static266.anInt5101 > local158 && local165 < Static339.anInt6352 && Static99.anInt2186 != local31) {
					Static254.method4681(local165, new Class5_Sub36(local25, local16), local158, Static156.anInt3123);
					Static60.method1250(Static156.anInt3123, local165, local158);
				}
			} else if (Static1.anInt4 == 44) {
				local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local25 = Static152.anInt3091 + (local16 >> 4 & 0x7);
				local31 = Static203.anInt3939 + (local16 & 0x7);
				local35 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local158 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local165 = Static6.aClass5_Sub1_Sub1_1.method1845();
				if (Static3.aClass42_56 != null && local25 >= 0 && local31 >= 0 && local25 < Static266.anInt5101 && Static339.anInt6352 > local31) {
					@Pc(270) Class5_Sub16 local270 = (Class5_Sub16) Static3.aClass42_56.method1052((long) (local25 | Static156.anInt3123 << 28 | local31 << 14));
					if (local270 != null) {
						for (@Pc(278) Class5_Sub36 local278 = (Class5_Sub36) local270.aClass211_7.method5608(); local278 != null; local278 = (Class5_Sub36) local270.aClass211_7.method5603()) {
							if (local278.anInt5029 == (local35 & 0x7FFF) && local278.anInt5028 == local158) {
								local278.method5803();
								local278.anInt5028 = local165;
								Static254.method4681(local31, local278, local25, Static156.anInt3123);
								break;
							}
						}
						Static60.method1250(Static156.anInt3123, local31, local25);
					}
				}
			} else {
				@Pc(364) int local364;
				@Pc(370) int local370;
				if (Static1.anInt4 == 42) {
					local16 = Static6.aClass5_Sub1_Sub1_1.method1867();
					local25 = Static6.aClass5_Sub1_Sub1_1.method1885();
					local31 = local25 >> 2;
					local35 = local25 & 0x3;
					local158 = Static353.anIntArray564[local31];
					local165 = Static6.aClass5_Sub1_Sub1_1.method1872();
					local364 = Static152.anInt3091 + (local165 >> 4 & 0x7);
					local370 = Static203.anInt3939 + (local165 & 0x7);
					if (local364 >= 0 && local370 >= 0 && Static266.anInt5101 > local364 && local370 < Static339.anInt6352) {
						Static181.method3374(local364, Static156.anInt3123, local16, local35, local370, local158, 0, -1, local31);
					}
				} else {
					@Pc(456) int local456;
					@Pc(460) int local460;
					@Pc(464) int local464;
					@Pc(468) int local468;
					@Pc(472) int local472;
					@Pc(558) Class25_Sub1_Sub3 local558;
					if (Static1.anInt4 == 244) {
						local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local25 = (local16 >> 4 & 0xF) + Static152.anInt3091 * 2;
						local31 = (local16 & 0xF) + Static203.anInt3939 * 2;
						local35 = local25 + Static6.aClass5_Sub1_Sub1_1.method1863();
						local158 = local31 + Static6.aClass5_Sub1_Sub1_1.method1863();
						local165 = Static6.aClass5_Sub1_Sub1_1.method1834();
						local364 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local370 = Static6.aClass5_Sub1_Sub1_1.method1832() * 4;
						local456 = Static6.aClass5_Sub1_Sub1_1.method1832() * 4;
						local460 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local464 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local468 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local472 = Static6.aClass5_Sub1_Sub1_1.method1832();
						if (local468 == 255) {
							local468 = -1;
						}
						if (local25 >= 0 && local31 >= 0 && local25 < 208 && local31 < 208 && local35 >= 0 && local158 >= 0 && local35 < 208 && local158 < 208 && local364 != 65535) {
							local31 = local31 * 64;
							local158 *= 64;
							local35 = local35 * 64;
							local25 = local25 * 64;
							local558 = new Class25_Sub1_Sub3(local364, Static156.anInt3123, local25, local31, Static66.method1393(local31, Static156.anInt3123, local25) - local370, local460 - -Static180.anInt3606, local464 + Static180.anInt3606, local468, local472, local165, local456);
							local558.method1316(local158, Static66.method1393(local158, Static156.anInt3123, local35) - local456, local35, local460 + Static180.anInt3606);
							Static262.aClass211_32.method5609(new Class5_Sub9_Sub4(local558));
						}
					} else if (Static1.anInt4 == 204) {
						local16 = Static6.aClass5_Sub1_Sub1_1.method1846();
						local25 = (local16 >> 4 & 0x7) + Static152.anInt3091;
						local31 = Static203.anInt3939 + (local16 & 0x7);
						local35 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local158 = Static6.aClass5_Sub1_Sub1_1.method1867();
						if (local25 >= 0 && local31 >= 0 && local25 < Static266.anInt5101 && local31 < Static339.anInt6352) {
							Static254.method4681(local31, new Class5_Sub36(local158, local35), local25, Static156.anInt3123);
							Static60.method1250(Static156.anInt3123, local31, local25);
						}
					} else if (Static1.anInt4 == 149) {
						local16 = Static6.aClass5_Sub1_Sub1_1.method1885();
						local25 = Static152.anInt3091 + (local16 >> 4 & 0x7);
						local31 = Static203.anInt3939 + (local16 & 0x7);
						local35 = Static6.aClass5_Sub1_Sub1_1.method1885();
						local158 = local35 >> 2;
						local165 = local35 & 0x3;
						local364 = Static353.anIntArray564[local158];
						if (local25 >= 0 && local31 >= 0 && Static266.anInt5101 > local25 && local31 < Static339.anInt6352) {
							Static181.method3374(local25, Static156.anInt3123, -1, local165, local31, local364, 0, -1, local158);
						}
					} else if (Static1.anInt4 == 99) {
						Static6.aClass5_Sub1_Sub1_1.method1832();
						local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local25 = Static152.anInt3091 + (local16 >> 4 & 0x7);
						local31 = Static203.anInt3939 + (local16 & 0x7);
						local35 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local158 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local165 = Static6.aClass5_Sub1_Sub1_1.method1843();
						@Pc(746) String local746 = Static6.aClass5_Sub1_Sub1_1.method1840();
						Static208.method3701(local165, local25, local746, local35, local31, local158);
					} else {
						if (Static1.anInt4 == 232) {
							@Pc(764) byte local764 = Static6.aClass5_Sub1_Sub1_1.method1831();
							@Pc(768) byte local768 = Static6.aClass5_Sub1_Sub1_1.method1878();
							local31 = Static6.aClass5_Sub1_Sub1_1.method1872();
							local35 = (local31 >> 4 & 0x7) + Static152.anInt3091;
							local158 = Static203.anInt3939 + (local31 & 0x7);
							@Pc(791) byte local791 = Static6.aClass5_Sub1_Sub1_1.method1841();
							local364 = Static6.aClass5_Sub1_Sub1_1.method1834();
							local370 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local456 = Static6.aClass5_Sub1_Sub1_1.method1872();
							local460 = local456 >> 2;
							local464 = local456 & 0x3;
							local468 = Static6.aClass5_Sub1_Sub1_1.method1839();
							local472 = Static6.aClass5_Sub1_Sub1_1.method1839();
							@Pc(823) byte local823 = Static6.aClass5_Sub1_Sub1_1.method1878();
							if (!Static15.aClass59_1.method4862()) {
								Static192.method3483(local35, local768, local158, local464, local823, local460, local472, local791, local364, local468, local370, local764);
							}
						}
						if (Static1.anInt4 == 195) {
							local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local25 = (local16 >> 4 & 0x7) + Static152.anInt3091;
							local31 = (local16 & 0x7) + Static203.anInt3939;
							local35 = local25 + Static6.aClass5_Sub1_Sub1_1.method1863();
							local158 = Static6.aClass5_Sub1_Sub1_1.method1863() + local31;
							local165 = Static6.aClass5_Sub1_Sub1_1.method1834();
							local364 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local370 = Static6.aClass5_Sub1_Sub1_1.method1832() * 4;
							local456 = Static6.aClass5_Sub1_Sub1_1.method1832() * 4;
							local460 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local464 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local468 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local472 = Static6.aClass5_Sub1_Sub1_1.method1832();
							if (local468 == 255) {
								local468 = -1;
							}
							if (local25 >= 0 && local31 >= 0 && local25 < Static266.anInt5101 && Static339.anInt6352 > local31 && local35 >= 0 && local158 >= 0 && local35 < Static266.anInt5101 && Static339.anInt6352 > local158 && local364 != 65535) {
								local35 = local35 * 128 + 64;
								local31 = local31 * 128 + 64;
								local25 = local25 * 128 + 64;
								local158 = local158 * 128 + 64;
								local558 = new Class25_Sub1_Sub3(local364, Static156.anInt3123, local25, local31, Static66.method1393(local31, Static156.anInt3123, local25) - local370, local460 + Static180.anInt3606, Static180.anInt3606 + local464, local468, local472, local165, local456);
								local558.method1316(local158, Static66.method1393(local158, Static156.anInt3123, local35) - local456, local35, Static180.anInt3606 + local460);
								Static262.aClass211_32.method5609(new Class5_Sub9_Sub4(local558));
							}
						} else if (Static1.anInt4 == 133) {
							local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local25 = Static152.anInt3091 + (local16 >> 4 & 0x7);
							local31 = Static203.anInt3939 + (local16 & 0x7);
							local35 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (local35 == 65535) {
								local35 = -1;
							}
							local158 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local165 = local158 >> 4 & 0xF;
							local364 = local158 & 0x7;
							local370 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local456 = Static6.aClass5_Sub1_Sub1_1.method1832();
							if (local25 >= 0 && local31 >= 0 && local25 < Static266.anInt5101 && Static339.anInt6352 > local31) {
								local460 = local165 + 1;
								if (local25 - local460 <= Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] && Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] <= local460 + local25 && Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] >= local31 - local460 && Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] <= local460 + local31 && Static123.anInt2600 != 0 && local364 > 0 && Static225.anInt4428 < 50 && local35 != -1) {
									Static77.anIntArray100[Static225.anInt4428] = local35;
									Static70.anIntArray82[Static225.anInt4428] = local364;
									Static144.anIntArray189[Static225.anInt4428] = local370;
									Static94.aClass196Array1[Static225.anInt4428] = null;
									Static337.anIntArray548[Static225.anInt4428] = local165 + (local25 << 16) + (local31 << 8);
									Static48.anIntArray57[Static225.anInt4428] = local456;
									Static225.anInt4428++;
								}
							}
						} else if (Static1.anInt4 == 78) {
							local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local25 = Static152.anInt3091 * 2 + (local16 >> 4 & 0xF);
							local31 = (local16 & 0xF) + Static203.anInt3939 * 2;
							local35 = local25 + Static6.aClass5_Sub1_Sub1_1.method1863();
							local158 = local31 + Static6.aClass5_Sub1_Sub1_1.method1863();
							local165 = Static6.aClass5_Sub1_Sub1_1.method1834();
							local364 = Static6.aClass5_Sub1_Sub1_1.method1834();
							local370 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local456 = Static6.aClass5_Sub1_Sub1_1.method1863();
							local460 = Static6.aClass5_Sub1_Sub1_1.method1832() * 4;
							local464 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local468 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local472 = Static6.aClass5_Sub1_Sub1_1.method1832();
							if (local472 == 255) {
								local472 = -1;
							}
							@Pc(1283) int local1283 = Static6.aClass5_Sub1_Sub1_1.method1832();
							if (local25 >= 0 && local31 >= 0 && local25 < 208 && local31 < 208 && local35 >= 0 && local158 >= 0 && local35 < 208 && local158 < 208 && local370 != 65535) {
								local31 *= 64;
								local35 *= 64;
								local158 = local158 * 64;
								local25 *= 64;
								if (local165 != 0) {
									@Pc(1355) int local1355;
									@Pc(1359) Class25_Sub1_Sub1 local1359;
									@Pc(1345) int local1345;
									@Pc(1349) int local1349;
									if (local165 >= 0) {
										local1345 = local165 - 1;
										local1349 = local1345 & 0x7FF;
										local1355 = local1345 >> 11 & 0xF;
										local1359 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local1349];
									} else {
										local1345 = -local165 - 1;
										local1355 = local1345 >> 11 & 0xF;
										local1349 = local1345 & 0x7FF;
										if (local1349 == Static99.anInt2186) {
											local1359 = Static85.aClass25_Sub1_Sub1_Sub1_1;
										} else {
											local1359 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local1349];
										}
									}
									if (local1359 != null) {
										@Pc(1393) Class33 local1393 = local1359.method4659();
										if (local1393.anIntArrayArray5 != null && local1393.anIntArrayArray5[local1355] != null) {
											local1349 = local1393.anIntArrayArray5[local1355][0];
											@Pc(1415) int local1415 = local1393.anIntArrayArray5[local1355][2];
											@Pc(1420) int local1420 = local1359.aClass131_7.method3517();
											@Pc(1424) int local1424 = Class5_Sub9_Sub12.anIntArray169[local1420];
											@Pc(1428) int local1428 = Class5_Sub9_Sub12.anIntArray170[local1420];
											@Pc(1438) int local1438 = local1349 * local1428 + local1424 * local1415 >> 15;
											@Pc(1449) int local1449 = local1415 * local1428 - local1349 * local1424 >> 15;
											local25 += local1438;
											local456 -= local1393.anIntArrayArray5[local1355][1];
											local31 += local1449;
										}
									}
								}
								@Pc(1494) Class25_Sub1_Sub3 local1494 = new Class25_Sub1_Sub3(local370, Static156.anInt3123, local25, local31, Static66.method1393(local31, Static156.anInt3123, local25) - local456, local464 - -Static180.anInt3606, Static180.anInt3606 + local468, local472, local1283, local364, local460);
								local1494.method1316(local158, Static66.method1393(local158, Static156.anInt3123, local35) - local460, local35, Static180.anInt3606 + local464);
								Static262.aClass211_32.method5609(new Class5_Sub9_Sub4(local1494));
							}
						} else if (Static1.anInt4 == 141) {
							local16 = Static6.aClass5_Sub1_Sub1_1.method1846();
							local25 = local16 >> 2;
							local31 = local16 & 0x3;
							local35 = Static353.anIntArray564[local25];
							local158 = Static6.aClass5_Sub1_Sub1_1.method1872();
							local165 = Static152.anInt3091 + (local158 >> 4 & 0x7);
							local364 = Static203.anInt3939 + (local158 & 0x7);
							local370 = Static6.aClass5_Sub1_Sub1_1.method1867();
							if (local370 == 65535) {
								local370 = -1;
							}
							Static48.method1062(local364, local31, local35, local165, local25, Static156.anInt3123, local370);
						} else if (Static1.anInt4 == 183) {
							local16 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local25 = Static152.anInt3091 + (local16 >> 4 & 0x7);
							local31 = (local16 & 0x7) + Static203.anInt3939;
							local35 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local158 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local165 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (local25 >= 0 && local31 >= 0 && local25 < Static266.anInt5101 && local31 < Static339.anInt6352) {
								local364 = local25 * 128 + 64;
								local370 = local31 * 128 + 64;
								@Pc(1664) Class25_Sub1_Sub5 local1664 = new Class25_Sub1_Sub5(local35, local165, Static180.anInt3606, Static156.anInt3123, local364, Static66.method1393(local370, Static156.anInt3123, local364) - local158, local370, local25, local25, local31, local31);
								Static316.aClass211_37.method5609(new Class5_Sub9_Sub7(local1664));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method3638(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static240.aString269 = arg2;
		Static40.anInt989 = arg1;
		Static354.aString382 = arg0;
		if (Static354.aString382.equals("") || Static240.aString269.equals("")) {
			Static29.anInt782 = 3;
		} else if (Static315.anInt6021 == -1) {
			Static170.anInt3491 = 0;
			Static262.anInt5044 = 0;
			Static29.anInt782 = -3;
			Static126.anInt2645 = 1;
			@Pc(42) Class5_Sub1 local42 = new Class5_Sub1(128);
			local42.method1886(10);
			local42.method1851((int) (Math.random() * 9.9999999E7D));
			local42.method1871(Static204.method3630(Static354.aString382));
			local42.method1851((int) (Math.random() * 9.9999999E7D));
			local42.method1849(Static240.aString269);
			local42.method1851((int) (Math.random() * 9.9999999E7D));
			local42.method1859(Static180.aBigInteger2, Static44.aBigInteger3);
			Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
			Static335.aClass5_Sub1_Sub1_3.method1886(24);
			Static335.aClass5_Sub1_Sub1_3.method1886(local42.anInt2029 + 2);
			Static335.aClass5_Sub1_Sub1_3.method1870(560);
			Static335.aClass5_Sub1_Sub1_3.method1850(local42.aByteArray18, local42.anInt2029);
		} else {
			Static131.method2526();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([[BI[[B[[BZ[[ILclient!ac;B[[BLclient!en;Lclient!ac;II)V")
	public static void method3639(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) Class3 arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class59 arg8, @OriginalArg(10) Class3 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		for (@Pc(12) int local12 = 0; local12 < arg11; local12++) {
			@Pc(29) int local29 = arg11 - 1 > local12 ? local12 + 1 : local12;
			for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
				@Pc(44) int local44 = arg1 - 1 > local31 ? local31 + 1 : local31;
				if (Static26.method628() || Static289.method4920(local12, Static9.anInt297, arg10, local31)) {
					@Pc(58) boolean local58 = false;
					@Pc(60) boolean local60 = false;
					@Pc(63) boolean[] local63 = new boolean[4];
					@Pc(69) int local69 = arg3[local12][local31];
					@Pc(75) int local75 = arg0[local12][local31];
					@Pc(83) int local83 = arg7[local12][local31] & 0xFF;
					@Pc(91) int local91 = arg2[local12][local31] & 0xFF;
					@Pc(99) int local99 = arg2[local12][local44] & 0xFF;
					@Pc(107) int local107 = arg2[local29][local44] & 0xFF;
					@Pc(115) int local115 = arg2[local29][local31] & 0xFF;
					if (local83 != 0 || local91 != 0) {
						@Pc(132) Class135 local132 = local83 == 0 ? null : Static301.method5317(local83 - 1);
						if (local69 == 0 && local132 == null) {
							local69 = 12;
						}
						@Pc(154) Class71 local154 = local91 == 0 ? null : Static248.method4359(local91 - 1);
						@Pc(156) Class135 local156 = local132;
						if (local132 != null) {
							if (local132.anInt3954 == -1 && local132.anInt3941 == -1) {
								local156 = local132;
								local132 = null;
							} else if (local154 != null && local69 != 0) {
								local60 = local132.aBoolean280;
							}
						}
						@Pc(273) int local273;
						@Pc(288) int local288;
						@Pc(357) int local357;
						@Pc(367) int local367;
						if ((local69 == 0 || local69 == 12) && local12 > 0 && local31 > 0 && local12 < arg11 && local31 < arg1) {
							@Pc(237) int local237 = arg2[local29][local31 - 1] == local91 ? 1 : -1;
							@Pc(256) int local256 = local91 == arg2[local29][local44] ? 1 : -1;
							local273 = arg2[local12 - 1][local31 - 1] == local91 ? 1 : -1;
							local288 = local91 == arg2[local12 - 1][local44] ? 1 : -1;
							if (local91 == arg2[local12][local31 - 1]) {
								local237++;
								local273++;
							} else {
								local237--;
								local273--;
							}
							if (arg2[local29][local31] == local91) {
								local237++;
								local256++;
							} else {
								local256--;
								local237--;
							}
							if (arg2[local12][local44] == local91) {
								local256++;
								local288++;
							} else {
								local256--;
								local288--;
							}
							if (local91 == arg2[local12 - 1][local31]) {
								local273++;
								local288++;
							} else {
								local288--;
								local273--;
							}
							local357 = local273 - local256;
							if (local357 < 0) {
								local357 = -local357;
							}
							local367 = local237 - local288;
							if (local367 < 0) {
								local367 = -local367;
							}
							if (local357 == local367) {
								local357 = arg9.method5638(local12, local31) - arg9.method5638(local29, local44);
								local367 = arg9.method5638(local29, local31) - arg9.method5638(local12, local44);
								if (local357 < 0) {
									local357 = -local357;
								}
								if (local367 < 0) {
									local367 = -local367;
								}
							}
							local75 = local367 > local357 ? 1 : 0;
						}
						for (local273 = 0; local273 < 13; local273++) {
							Static124.anIntArray159[local273] = -1;
							Static166.anIntArray232[local273] = 1;
						}
						@Pc(456) boolean[] local456 = local132 != null && local132.aBoolean280 ? Static109.aBooleanArrayArray15[local69] : Static133.aBooleanArrayArray46[local69];
						Static311.method5709(local69, local75, local12, arg3, arg0, arg8, arg1, local132, local63, arg7, local154, arg11, local31);
						@Pc(482) boolean local482 = local132 != null && local132.anInt3941 != local132.anInt3954;
						if (!local482) {
							for (local288 = 0; local288 < 8; local288++) {
								if (Static124.anIntArray159[local288] >= 0 && Static244.anIntArray372[local288] != Static92.anIntArray125[local288]) {
									local482 = true;
									break;
								}
							}
						}
						if (!local456[local75 + 1 & 0x3]) {
							local63[1] = Static98.method2008(local63[1], (Static166.anIntArray232[2] & Static166.anIntArray232[4]) == 0);
						}
						if (!local456[local75 + 3 & 0x3]) {
							local63[3] = Static98.method2008(local63[3], (Static166.anIntArray232[0] & Static166.anIntArray232[6]) == 0);
						}
						if (!local456[local75 & 0x3]) {
							local63[0] = Static98.method2008(local63[0], (Static166.anIntArray232[2] & Static166.anIntArray232[0]) == 0);
						}
						if (!local456[local75 + 2 & 0x3]) {
							local63[2] = Static98.method2008(local63[2], (Static166.anIntArray232[4] & Static166.anIntArray232[6]) == 0);
						}
						if (!local60 && (local69 == 0 || local69 == 12)) {
							if (local63[0] && !local63[1] && !local63[2] && local63[3]) {
								local63[0] = local63[3] = false;
								local69 = local69 == 0 ? 13 : 14;
								local75 = 0;
							} else if (local63[0] && local63[1] && !local63[2] && !local63[3]) {
								local63[0] = local63[1] = false;
								local75 = 3;
								local69 = local69 == 0 ? 13 : 14;
							} else if (!local63[0] && local63[1] && local63[2] && !local63[3]) {
								local63[1] = local63[2] = false;
								local69 = local69 == 0 ? 13 : 14;
								local75 = 2;
							} else if (!local63[0] && !local63[1] && local63[2] && local63[3]) {
								local63[2] = local63[3] = false;
								local75 = 1;
								local69 = local69 == 0 ? 13 : 14;
							}
						}
						@Pc(793) boolean local793 = !local60 && !local63[0] && !local63[2] && !local63[1] && !local63[3];
						@Pc(795) int[] local795 = null;
						@Pc(821) int[] local821;
						@Pc(801) int[] local801;
						@Pc(825) int[] local825;
						if (local793) {
							local801 = Static238.anIntArrayArray38[local69];
							local367 = local132 == null ? 0 : Static307.anIntArray487[local69];
							local357 = local154 == null ? 0 : Static294.anIntArray426[local69];
							local821 = Static270.anIntArrayArray41[local69];
							local825 = Static334.anIntArrayArray57[local69];
						} else if (local60) {
							local821 = Static29.anIntArrayArray3[local69];
							local367 = local132 == null ? 0 : Static260.anIntArray554[local69];
							local825 = Static79.anIntArrayArray12[local69];
							local795 = Static331.anIntArrayArray55[local69];
							local801 = Static39.anIntArrayArray4[local69];
							local357 = local154 == null ? 0 : Static310.anIntArray502[local69];
						} else {
							local801 = Static70.anIntArrayArray9[local69];
							local821 = Static241.anIntArrayArray39[local69];
							local795 = Static130.anIntArrayArray17[local69];
							local357 = local154 == null ? 0 : Static84.anIntArray122[local69];
							local367 = local132 == null ? 0 : Static147.anIntArray201[local69];
							local825 = Static254.anIntArrayArray42[local69];
						}
						@Pc(898) int local898 = local357 + local367;
						if (local898 <= 0) {
							Static168.method3164(arg10, local12, local31);
						} else {
							if (local63[0]) {
								local898++;
							}
							if (local63[2]) {
								local898++;
							}
							if (local63[1]) {
								local898++;
							}
							if (local63[3]) {
								local898++;
							}
							@Pc(931) int local931 = 0;
							@Pc(933) int local933 = 0;
							@Pc(937) int local937 = local898 * 3;
							@Pc(944) int[] local944 = arg4 ? new int[local937] : null;
							@Pc(951) int[] local951 = local482 ? new int[local937] : null;
							@Pc(954) int[] local954 = new int[local937];
							@Pc(957) int[] local957 = new int[local937];
							@Pc(960) int[] local960 = new int[local937];
							@Pc(963) int[] local963 = new int[local937];
							@Pc(966) int[] local966 = new int[local937];
							@Pc(968) int local968 = -1;
							@Pc(970) int local970 = -1;
							@Pc(972) int local972 = 256;
							@Pc(1060) byte local1060;
							@Pc(994) int local994;
							@Pc(996) int local996;
							@Pc(1229) int local1229;
							@Pc(1235) int local1235;
							@Pc(1244) int local1244;
							@Pc(1248) int local1248;
							@Pc(1252) int local1252;
							@Pc(1326) int local1326;
							@Pc(1334) int local1334;
							if (local132 != null) {
								local968 = local132.anInt3954;
								local970 = arg8.method4862() ? local132.anInt3944 : local132.anInt3951;
								local972 = local132.anInt3942;
								local994 = Static323.method5436(arg8, local132);
								for (local996 = 0; local996 < local367; local996++) {
									if (local63[-local75 & 0x3] && local795[0] == local931) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 1;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 1;
										Static258.anIntArray387[4] = local801[local931];
										local1060 = 6;
										Static258.anIntArray387[5] = local825[local931];
									} else if (local63[2 - local75 & 0x3] && local931 == local795[2]) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 5;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 5;
										Static258.anIntArray387[4] = local801[local931];
										Static258.anIntArray387[5] = local825[local931];
										local1060 = 6;
									} else if (local63[1 - local75 & 0x3] && local795[1] == local931) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 3;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 3;
										Static258.anIntArray387[4] = local801[local931];
										Static258.anIntArray387[5] = local825[local931];
										local1060 = 6;
									} else if (local63[3 - local75 & 0x3] && local795[3] == local931) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 7;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 7;
										Static258.anIntArray387[4] = local801[local931];
										Static258.anIntArray387[5] = local825[local931];
										local1060 = 6;
									} else {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = local801[local931];
										local1060 = 3;
										Static258.anIntArray387[2] = local825[local931];
									}
									local931++;
									for (local1229 = 0; local1229 < local1060; local1229++) {
										local1235 = Static258.anIntArray387[local1229];
										local1244 = local1235 - local75 * 2 & 0x7;
										local1248 = Static323.anIntArray526[local1235];
										local1252 = Static230.anIntArray324[local1235];
										if (local75 == 1) {
											local954[local933] = local1252;
											local957[local933] = 128 - local1248;
										} else if (local75 == 2) {
											local954[local933] = 128 - local1248;
											local957[local933] = 128 - local1252;
										} else if (local75 == 3) {
											local954[local933] = 128 - local1252;
											local957[local933] = local1248;
										} else {
											local954[local933] = local1248;
											local957[local933] = local1252;
										}
										if (arg4 && Static129.aBooleanArrayArray20[local69][local1235]) {
											local1326 = (local12 << 7) + local954[local933];
											local1334 = local957[local933] + (local31 << 7);
											local944[local933] = arg6.method5639(local1326, local1334) - arg9.method5639(local1326, local1334);
										}
										if (local1235 < 8 && local132.anInt3953 < Static124.anIntArray159[local1244]) {
											if (local951 != null) {
												local951[local933] = Static92.anIntArray125[local1244];
											}
											local966[local933] = Static38.anIntArray46[local1244];
											local963[local933] = Static57.anIntArray66[local1244];
											local960[local933] = Static244.anIntArray372[local1244];
										} else {
											if (local951 != null) {
												local951[local933] = local994;
											}
											local963[local933] = arg8.method4862() ? local132.anInt3944 : local132.anInt3951;
											local966[local933] = local132.anInt3942;
											local960[local933] = local968;
										}
										local933++;
									}
								}
								if (!arg4 && arg10 == 0) {
									Static156.method2910(local12, local31, local132.anInt3949, local132.anInt3948 * 8);
								}
								if (local69 != 12 && local132.anInt3954 != -1 && local132.aBoolean282) {
									local58 = true;
								}
							} else if (local793) {
								local931 = Static307.anIntArray487[local69];
							} else if (local60) {
								local931 = Static260.anIntArray554[local69];
							} else {
								local931 = Static147.anIntArray201[local69];
							}
							if (local154 != null) {
								if (local107 == 0) {
									local107 = local91;
								}
								if (local99 == 0) {
									local99 = local91;
								}
								if (local115 == 0) {
									local115 = local91;
								}
								@Pc(1504) Class71 local1504 = Static248.method4359(local91 - 1);
								@Pc(1510) Class71 local1510 = Static248.method4359(local99 - 1);
								@Pc(1516) Class71 local1516 = Static248.method4359(local107 - 1);
								@Pc(1522) Class71 local1522 = Static248.method4359(local115 - 1);
								for (local1244 = 0; local1244 < local357; local1244++) {
									if (local63[-local75 & 0x3] && local931 == local795[0]) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 1;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 1;
										Static258.anIntArray387[4] = local801[local931];
										local1060 = 6;
										Static258.anIntArray387[5] = local825[local931];
									} else if (local63[2 - local75 & 0x3] && local795[2] == local931) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 5;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 5;
										Static258.anIntArray387[4] = local801[local931];
										local1060 = 6;
										Static258.anIntArray387[5] = local825[local931];
									} else if (local63[1 - local75 & 0x3] && local795[1] == local931) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 3;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 3;
										Static258.anIntArray387[4] = local801[local931];
										Static258.anIntArray387[5] = local825[local931];
										local1060 = 6;
									} else if (local63[3 - local75 & 0x3] && local931 == local795[3]) {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = 7;
										Static258.anIntArray387[2] = local825[local931];
										Static258.anIntArray387[3] = 7;
										Static258.anIntArray387[4] = local801[local931];
										Static258.anIntArray387[5] = local825[local931];
										local1060 = 6;
									} else {
										Static258.anIntArray387[0] = local821[local931];
										Static258.anIntArray387[1] = local801[local931];
										local1060 = 3;
										Static258.anIntArray387[2] = local825[local931];
									}
									for (local1248 = 0; local1248 < local1060; local1248++) {
										local1252 = Static258.anIntArray387[local1248];
										local1326 = local1252 - local75 * 2 & 0x7;
										local1334 = Static323.anIntArray526[local1252];
										@Pc(1778) int local1778 = Static230.anIntArray324[local1252];
										@Pc(1791) int local1791;
										@Pc(1795) int local1795;
										if (local75 == 1) {
											local1795 = 128 - local1334;
											local1791 = local1778;
										} else if (local75 == 2) {
											local1791 = 128 - local1334;
											local1795 = 128 - local1778;
										} else if (local75 == 3) {
											local1791 = 128 - local1778;
											local1795 = local1334;
										} else {
											local1791 = local1334;
											local1795 = local1778;
										}
										local954[local933] = local1791;
										local957[local933] = local1795;
										@Pc(1843) int local1843;
										@Pc(1849) int local1849;
										if (arg4 && Static129.aBooleanArrayArray20[local69][local1252]) {
											local1843 = (local12 << 7) + local1791;
											local1849 = local1795 + (local31 << 7);
											local944[local933] = arg6.method5639(local1843, local1849) - arg9.method5639(local1843, local1849);
										}
										if (local1252 < 8 && Static124.anIntArray159[local1326] >= 0) {
											if (local951 != null) {
												local951[local933] = Static92.anIntArray125[local1326];
											}
											local966[local933] = Static38.anIntArray46[local1326];
											local963[local933] = Static57.anIntArray66[local1326];
											local960[local933] = Static244.anIntArray372[local1326];
										} else {
											if (local60 && Static129.aBooleanArrayArray20[local69][local1252]) {
												local963[local933] = local970;
												local966[local933] = local972;
												local960[local933] = local968;
											} else if (local1791 == 0 && local1795 == 0) {
												local960[local933] = arg5[local12][local31];
												local963[local933] = local1504.anInt2214;
												local966[local933] = local1504.anInt2216;
											} else if (local1791 == 0 && local1795 == 128) {
												local960[local933] = arg5[local12][local44];
												local963[local933] = local1510.anInt2214;
												local966[local933] = local1510.anInt2216;
											} else if (local1791 == 128 && local1795 == 128) {
												local960[local933] = arg5[local29][local44];
												local963[local933] = local1516.anInt2214;
												local966[local933] = local1516.anInt2216;
											} else if (local1791 == 128 && local1795 == 0) {
												local960[local933] = arg5[local29][local31];
												local963[local933] = local1522.anInt2214;
												local966[local933] = local1522.anInt2216;
											} else {
												if (local1791 < 64) {
													if (local1795 < 64) {
														local963[local933] = local1504.anInt2214;
														local966[local933] = local1504.anInt2216;
													} else {
														local963[local933] = local1510.anInt2214;
														local966[local933] = local1510.anInt2216;
													}
												} else if (local1795 >= 64) {
													local963[local933] = local1516.anInt2214;
													local966[local933] = local1516.anInt2216;
												} else {
													local963[local933] = local1522.anInt2214;
													local966[local933] = local1522.anInt2216;
												}
												local1843 = Static238.method4050(arg5[local29][local31], arg5[local12][local31], local1791 << 7 >> 7);
												local1849 = Static238.method4050(arg5[local29][local44], arg5[local12][local44], local1791 << 7 >> 7);
												local960[local933] = Static238.method4050(local1849, local1843, local1795 << 7 >> 7);
											}
											if (local951 != null) {
												local951[local933] = local960[local933];
											}
										}
										local933++;
									}
									local931++;
								}
								if (local69 != 0 && local154.aBoolean141) {
									local58 = true;
								}
							}
							local994 = arg9.method5638(local12, local31);
							local996 = arg9.method5638(local29, local31);
							local1229 = arg9.method5638(local29, local44);
							local1235 = arg9.method5638(local12, local44);
							if (arg10 > 0) {
								@Pc(2187) boolean local2187 = true;
								if (local91 == 0 && local69 != 0) {
									local2187 = false;
								}
								if (local83 > 0 && local156 != null && !local156.aBoolean281) {
									local2187 = false;
								}
								if (local2187 && local994 == local996 && local994 == local1229 && local994 == local1235) {
									Static296.aByteArrayArrayArray26[arg10][local12][local31] = (byte) (Static296.aByteArrayArrayArray26[arg10][local12][local31] | 0x4);
								}
							}
							local1244 = 0;
							local1248 = 0;
							if (arg4) {
								local1244 = Static261.method4487(local12, local31);
								local1248 = Static241.method4106(local12, local31);
							}
							arg9.method5641(local12, local31, local954, local944, local957, local960, local951, local963, local966, local1244, local1248, local58);
							Static168.method3164(arg10, local12, local31);
						}
					}
				}
			}
		}
	}
}
