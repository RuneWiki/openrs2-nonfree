import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
	public static boolean aBoolean191;

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1191 = Static181.method2795("labels)3dat");

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
	public static int anInt4149 = 0;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Lclient!qe;")
	public static Class83 method3166(@OriginalArg(1) int arg0) {
		@Pc(9) Class83 local9 = Static129.method2179(arg0);
		for (@Pc(15) int local15 = local9.method2428() - 3; local15 > 0; local15 -= 3) {
			local9 = Static67.method1268(new Class83[] { local9.method2416(local15, 0), Static49.aClass83_385, local9.method2422(local15) });
		}
		if (local9.method2428() > 9) {
			return Static67.method1268(new Class83[] { Static130.aClass83_838, local9.method2416(local9.method2428() - 8, 0), Static143.aClass83_884, Static55.aClass83_417, local9, Static182.aClass83_1064 });
		} else if (local9.method2428() > 6) {
			return Static67.method1268(new Class83[] { Static9.aClass83_58, local9.method2416(local9.method2428() - 4, 0), Static170.aClass83_1009, Static55.aClass83_417, local9, Static182.aClass83_1064 });
		} else {
			return Static67.method1268(new Class83[] { Static95.aClass83_623, local9, Static71.aClass83_525 });
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
	public static void method3167() {
		@Pc(35) int local35;
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (Static148.anInt3046 == 8) {
			local12 = Static33.aClass2_Sub3_Sub1_1.method260();
			local20 = Static83.anInt1852 + (local12 >> 4 & 0x7);
			local27 = Static124.anInt2520 + (local12 & 0x7);
			local31 = Static33.aClass2_Sub3_Sub1_1.method269();
			local35 = Static33.aClass2_Sub3_Sub1_1.method262();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				@Pc(57) Class24_Sub5 local57 = new Class24_Sub5();
				local57.anInt3071 = local35;
				local57.anInt3068 = local31;
				if (Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local20][local27] == null) {
					Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local20][local27] = new Class19();
				}
				Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local20][local27].method684(new Class2_Sub2_Sub19(local57));
				Static51.method1187(local27, local20);
			}
			return;
		}
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(146) int local146;
		@Pc(152) int local152;
		@Pc(156) int local156;
		@Pc(160) int local160;
		@Pc(164) int local164;
		@Pc(168) int local168;
		if (Static148.anInt3046 == 71) {
			local12 = Static33.aClass2_Sub3_Sub1_1.method260();
			local20 = Static83.anInt1852 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static124.anInt2520;
			local31 = Static33.aClass2_Sub3_Sub1_1.method221() + local20;
			local35 = Static33.aClass2_Sub3_Sub1_1.method221() + local27;
			local136 = Static33.aClass2_Sub3_Sub1_1.method242();
			local140 = Static33.aClass2_Sub3_Sub1_1.method269();
			local146 = Static33.aClass2_Sub3_Sub1_1.method260() * 4;
			local152 = Static33.aClass2_Sub3_Sub1_1.method260() * 4;
			local156 = Static33.aClass2_Sub3_Sub1_1.method269();
			local160 = Static33.aClass2_Sub3_Sub1_1.method269();
			local164 = Static33.aClass2_Sub3_Sub1_1.method260();
			local168 = Static33.aClass2_Sub3_Sub1_1.method260();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local140 != 65535) {
				local27 = local27 * 128 + 64;
				local35 = local35 * 128 + 64;
				local31 = local31 * 128 + 64;
				local20 = local20 * 128 + 64;
				@Pc(256) Class24_Sub1 local256 = new Class24_Sub1(local140, Static43.anInt1126, local20, local27, Static177.method2711(local20, Static43.anInt1126, local27) - local146, Static13.anInt386 + local156, local160 + Static13.anInt386, local164, local168, local136, local152);
				local256.method787(Static13.anInt386 + local156, local31, local35, Static177.method2711(local31, Static43.anInt1126, local35) - local152);
				Static81.aClass19_8.method684(new Class2_Sub2_Sub6(local256));
			}
		} else if (Static148.anInt3046 == 43) {
			local12 = Static33.aClass2_Sub3_Sub1_1.method260();
			local20 = Static83.anInt1852 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static124.anInt2520;
			local31 = Static33.aClass2_Sub3_Sub1_1.method269();
			local35 = Static33.aClass2_Sub3_Sub1_1.method260();
			local136 = Static33.aClass2_Sub3_Sub1_1.method269();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				local20 = local20 * 128 + 64;
				local27 = local27 * 128 + 64;
				@Pc(361) Class24_Sub6 local361 = new Class24_Sub6(local31, Static43.anInt1126, local20, local27, Static177.method2711(local20, Static43.anInt1126, local27) - local35, local136, Static13.anInt386);
				Static67.aClass19_6.method684(new Class2_Sub2_Sub12(local361));
			}
		} else if (Static148.anInt3046 == 162) {
			local12 = Static33.aClass2_Sub3_Sub1_1.method262();
			local20 = Static33.aClass2_Sub3_Sub1_1.method260();
			local31 = Static124.anInt2520 + (local20 & 0x7);
			local27 = Static83.anInt1852 + (local20 >> 4 & 0x7);
			if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104) {
				@Pc(419) Class19 local419 = Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local27][local31];
				if (local419 != null) {
					for (@Pc(426) Class2_Sub2_Sub19 local426 = (Class2_Sub2_Sub19) local419.method691(); local426 != null; local426 = (Class2_Sub2_Sub19) local419.method686()) {
						if (local426.aClass24_Sub5_1.anInt3068 == (local12 & 0x7FFF)) {
							local426.method3254();
							break;
						}
					}
					if (local419.method691() == null) {
						Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local27][local31] = null;
					}
					Static51.method1187(local31, local27);
				}
			}
		} else if (Static148.anInt3046 == 74) {
			local12 = Static33.aClass2_Sub3_Sub1_1.method260();
			local27 = (local12 & 0x7) + Static124.anInt2520;
			local20 = Static83.anInt1852 + (local12 >> 4 & 0x7);
			local31 = Static33.aClass2_Sub3_Sub1_1.method269();
			local35 = Static33.aClass2_Sub3_Sub1_1.method269();
			local136 = Static33.aClass2_Sub3_Sub1_1.method269();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				@Pc(525) Class19 local525 = Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local20][local27];
				if (local525 != null) {
					for (@Pc(532) Class2_Sub2_Sub19 local532 = (Class2_Sub2_Sub19) local525.method691(); local532 != null; local532 = (Class2_Sub2_Sub19) local525.method686()) {
						@Pc(537) Class24_Sub5 local537 = local532.aClass24_Sub5_1;
						if (local537.anInt3068 == (local31 & 0x7FFF) && local35 == local537.anInt3071) {
							local537.anInt3071 = local136;
							break;
						}
					}
					Static51.method1187(local27, local20);
				}
			}
		} else if (Static148.anInt3046 == 28) {
			local12 = Static33.aClass2_Sub3_Sub1_1.method220();
			local20 = local12 >> 2;
			local27 = local12 & 0x3;
			local31 = Static31.anIntArray64[local20];
			local35 = Static33.aClass2_Sub3_Sub1_1.method260();
			local136 = (local35 >> 4 & 0x7) + Static83.anInt1852;
			local140 = Static124.anInt2520 + (local35 & 0x7);
			if (local136 >= 0 && local140 >= 0 && local136 < 104 && local140 < 104) {
				Static74.method1402(local31, local140, Static43.anInt1126, local20, -1, 0, local27, local136, -1);
			}
		} else if (Static148.anInt3046 == 117) {
			local12 = Static33.aClass2_Sub3_Sub1_1.method219();
			local20 = (local12 >> 4 & 0x7) + Static83.anInt1852;
			local27 = (local12 & 0x7) + Static124.anInt2520;
			local31 = Static33.aClass2_Sub3_Sub1_1.method219();
			local136 = local31 & 0x3;
			local35 = local31 >> 2;
			local140 = Static31.anIntArray64[local35];
			local146 = Static33.aClass2_Sub3_Sub1_1.method269();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				Static74.method1402(local140, local27, Static43.anInt1126, local35, -1, 0, local136, local20, local146);
			}
		} else {
			if (Static148.anInt3046 == 109) {
				@Pc(706) byte local706 = Static33.aClass2_Sub3_Sub1_1.method224();
				@Pc(710) byte local710 = Static33.aClass2_Sub3_Sub1_1.method221();
				@Pc(714) byte local714 = Static33.aClass2_Sub3_Sub1_1.method224();
				@Pc(718) byte local718 = Static33.aClass2_Sub3_Sub1_1.method251();
				local35 = Static33.aClass2_Sub3_Sub1_1.method262();
				local136 = Static33.aClass2_Sub3_Sub1_1.method267();
				local140 = Static33.aClass2_Sub3_Sub1_1.method262();
				local146 = Static33.aClass2_Sub3_Sub1_1.method240();
				local152 = local146 >> 2;
				local156 = local146 & 0x3;
				local160 = Static31.anIntArray64[local152];
				local164 = Static33.aClass2_Sub3_Sub1_1.method262();
				local168 = Static33.aClass2_Sub3_Sub1_1.method220();
				@Pc(761) int local761 = Static124.anInt2520 + (local168 & 0x7);
				@Pc(769) int local769 = (local168 >> 4 & 0x7) + Static83.anInt1852;
				@Pc(774) Class24_Sub4_Sub1 local774;
				if (Static138.anInt2924 == local136) {
					local774 = Static54.aClass24_Sub4_Sub1_1;
				} else {
					local774 = Static22.aClass24_Sub4_Sub1Array1[local136];
				}
				if (local774 != null) {
					@Pc(786) Class2_Sub2_Sub20 local786 = Static99.method1689(local164);
					@Pc(799) int local799;
					@Pc(802) int local802;
					if (local156 == 1 || local156 == 3) {
						local802 = local786.anInt2670;
						local799 = local786.anInt2665;
					} else {
						local799 = local786.anInt2670;
						local802 = local786.anInt2665;
					}
					@Pc(816) int local816 = (local799 >> 1) + local769;
					@Pc(824) int local824 = (local799 + 1 >> 1) + local769;
					@Pc(830) int local830 = local761 + (local802 >> 1);
					@Pc(834) int[][] local834 = Static170.anIntArrayArrayArray10[Static43.anInt1126];
					@Pc(843) int local843 = (local769 << 7) + (local799 << 6);
					@Pc(851) int local851 = (local802 << 6) + (local761 << 7);
					@Pc(860) int local860 = local761 + (local802 + 1 >> 1);
					@Pc(888) int local888 = local834[local824][local860] + local834[local816][local830] + local834[local824][local830] + local834[local816][local860] >> 2;
					@Pc(899) Class2_Sub2_Sub13 local899 = local786.method2045(local851, local152, local888, local843, false, local156, local834);
					if (local899 != null) {
						Static74.method1402(local160, local761, Static43.anInt1126, 0, local35 + 1, local140 + 1, 0, local769, -1);
						local774.anInt2295 = local35 + Static13.anInt386;
						local774.anInt2301 = local799 * 64 + local769 * 128;
						@Pc(939) byte local939;
						if (local718 > local710) {
							local939 = local718;
							local718 = local710;
							local710 = local939;
						}
						local774.anInt2294 = local140 + Static13.anInt386;
						local774.aClass24_Sub3_1 = (Class24_Sub3) local899.aClass24_2;
						local774.anInt2293 = local710 + local769;
						local774.anInt2304 = local888;
						local774.anInt2310 = local769 + local718;
						local774.anInt2287 = local802 * 64 + local761 * 128;
						if (local706 < local714) {
							local939 = local714;
							local714 = local706;
							local706 = local939;
						}
						local774.anInt2297 = local761 + local706;
						local774.anInt2306 = local714 + local761;
					}
				}
			}
			if (Static148.anInt3046 == 223) {
				local12 = Static33.aClass2_Sub3_Sub1_1.method260();
				local20 = (local12 >> 4 & 0x7) + Static83.anInt1852;
				local27 = Static124.anInt2520 + (local12 & 0x7);
				local31 = Static33.aClass2_Sub3_Sub1_1.method219();
				local35 = local31 >> 2;
				local136 = local31 & 0x3;
				local140 = Static31.anIntArray64[local35];
				local146 = Static33.aClass2_Sub3_Sub1_1.method269();
				if (local146 == 65535) {
					local146 = -1;
				}
				if (local20 >= 0 && local27 >= 0 && local20 < 103 && local27 < 103) {
					if (local140 == 0) {
						@Pc(1067) Class105 local1067 = Static99.method1688(Static43.anInt1126, local20, local27);
						if (local1067 != null) {
							local156 = (int) (local1067.aLong146 >>> 32) & Integer.MAX_VALUE;
							if (local35 == 2) {
								local1067.aClass24_11 = new Class24_Sub2(local156, 2, local136 + 4, Static43.anInt1126, local20, local27, local146, false, local1067.aClass24_11);
								local1067.aClass24_10 = new Class24_Sub2(local156, 2, local136 + 1 & 0x3, Static43.anInt1126, local20, local27, local146, false, local1067.aClass24_10);
							} else {
								local1067.aClass24_11 = new Class24_Sub2(local156, local35, local136, Static43.anInt1126, local20, local27, local146, false, local1067.aClass24_11);
							}
						}
					}
					if (local140 == 1) {
						@Pc(1141) Class79 local1141 = Static5.method93(Static43.anInt1126, local20, local27);
						if (local1141 != null) {
							local156 = Integer.MAX_VALUE & (int) (local1141.aLong108 >>> 32);
							if (local35 == 4 || local35 == 5) {
								local1141.aClass24_6 = new Class24_Sub2(local156, 4, local136, Static43.anInt1126, local20, local27, local146, false, local1141.aClass24_6);
							} else if (local35 == 6) {
								local1141.aClass24_6 = new Class24_Sub2(local156, 4, local136 + 4, Static43.anInt1126, local20, local27, local146, false, local1141.aClass24_6);
							} else if (local35 == 7) {
								local1141.aClass24_6 = new Class24_Sub2(local156, 4, (local136 + 2 & 0x3) + 4, Static43.anInt1126, local20, local27, local146, false, local1141.aClass24_6);
							} else if (local35 == 8) {
								local1141.aClass24_6 = new Class24_Sub2(local156, 4, local136 + 4, Static43.anInt1126, local20, local27, local146, false, local1141.aClass24_6);
								local1141.aClass24_5 = new Class24_Sub2(local156, 4, (local136 + 2 & 0x3) + 4, Static43.anInt1126, local20, local27, local146, false, local1141.aClass24_5);
							}
						}
					}
					if (local140 == 2) {
						@Pc(1277) Class78 local1277 = Static130.method2183(Static43.anInt1126, local20, local27);
						if (local35 == 11) {
							local35 = 10;
						}
						if (local1277 != null) {
							local1277.aClass24_4 = new Class24_Sub2(Integer.MAX_VALUE & (int) (local1277.aLong107 >>> 32), local35, local136, Static43.anInt1126, local20, local27, local146, false, local1277.aClass24_4);
						}
					}
					if (local140 == 3) {
						@Pc(1315) Class26 local1315 = Static163.method2508(Static43.anInt1126, local20, local27);
						if (local1315 != null) {
							local1315.aClass24_1 = new Class24_Sub2((int) (local1315.aLong32 >>> 32) & Integer.MAX_VALUE, 22, local136, Static43.anInt1126, local20, local27, local146, false, local1315.aClass24_1);
						}
					}
				}
			} else if (Static148.anInt3046 == 131) {
				local12 = Static33.aClass2_Sub3_Sub1_1.method269();
				local20 = Static33.aClass2_Sub3_Sub1_1.method220();
				local31 = (local20 & 0x7) + Static124.anInt2520;
				local27 = (local20 >> 4 & 0x7) + Static83.anInt1852;
				local35 = Static33.aClass2_Sub3_Sub1_1.method262();
				local136 = Static33.aClass2_Sub3_Sub1_1.method269();
				if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && local136 != Static138.anInt2924) {
					@Pc(1394) Class24_Sub5 local1394 = new Class24_Sub5();
					local1394.anInt3068 = local12;
					local1394.anInt3071 = local35;
					if (Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local27][local31] == null) {
						Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local27][local31] = new Class19();
					}
					Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local27][local31].method684(new Class2_Sub2_Sub19(local1394));
					Static51.method1187(local31, local27);
				}
			} else if (Static148.anInt3046 == 211) {
				local12 = Static33.aClass2_Sub3_Sub1_1.method260();
				local20 = Static83.anInt1852 + (local12 >> 4 & 0x7);
				local27 = Static124.anInt2520 + (local12 & 0x7);
				local31 = Static33.aClass2_Sub3_Sub1_1.method269();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static33.aClass2_Sub3_Sub1_1.method260();
				local136 = local35 >> 4 & 0xF;
				local140 = local35 & 0x7;
				local146 = Static33.aClass2_Sub3_Sub1_1.method260();
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					local152 = local136 + 1;
					if (local20 - local152 <= Static54.aClass24_Sub4_Sub1_1.anIntArray319[0] && Static54.aClass24_Sub4_Sub1_1.anIntArray319[0] <= local20 + local152 && local27 - local152 <= Static54.aClass24_Sub4_Sub1_1.anIntArray316[0] && Static54.aClass24_Sub4_Sub1_1.anIntArray316[0] <= local152 + local27 && Static89.anInt4291 != 0 && local140 > 0 && Static194.anInt3846 < 50 && local31 != -1) {
						Static129.anIntArray283[Static194.anInt3846] = local31;
						Static140.anIntArray293[Static194.anInt3846] = local140;
						Static79.anIntArray170[Static194.anInt3846] = local146;
						Static86.aClass90Array1[Static194.anInt3846] = null;
						Static201.anIntArray392[Static194.anInt3846] = local136 + (local20 << 16) + (local27 << 8);
						Static194.anInt3846++;
						return;
					}
				}
			}
		}
	}
}
