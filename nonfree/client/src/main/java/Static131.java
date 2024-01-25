import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_32;

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "[[Lclient!rr;")
	public static Class292[][] aClass292ArrayArray2;

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "Lclient!uv;")
	public static final Class340 aClass340_3 = new Class340();

	@OriginalMember(owner = "client!fca", name = "s", descriptor = "Lclient!gr;")
	public static final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!uc;I)V")
	public static void method2593(@OriginalArg(0) Class328 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (Static401.aClass328_21 == arg0) {
			local12 = Static282.aClass6_Sub21_Sub2_1.method6003();
			local16 = Static282.aClass6_Sub21_Sub2_1.method6026();
			local20 = Static282.aClass6_Sub21_Sub2_1.method6035();
			local27 = Static562.anInt9256 + (local20 & 0x7);
			local31 = local27 + Static138.anInt3088;
			local39 = (local20 >> 4 & 0x7) + Static364.anInt6396;
			local43 = local39 + Static39.anInt4952;
			@Pc(68) boolean local68 = local39 >= 0 && local27 >= 0 && Static473.anInt8075 > local39 && Static165.anInt6749 > local27;
			if (local68 || Static1.method7675(Static367.anInt6493)) {
				Static535.method7306(Static409.anInt9440, new Class6_Sub10(local16, local12), local31, local43);
				if (local68) {
					Static540.method3555(local27, local39, Static409.anInt9440);
				}
			}
		} else if (Static289.aClass328_16 == arg0) {
			local12 = Static282.aClass6_Sub21_Sub2_1.method6003();
			local16 = Static282.aClass6_Sub21_Sub2_1.method6069();
			Static412.aClass307_4.method6636(local12).method5788(local16);
		} else {
			@Pc(168) int local168;
			@Pc(174) int local174;
			@Pc(180) int local180;
			@Pc(184) int local184;
			@Pc(188) int local188;
			@Pc(192) int local192;
			@Pc(203) int local203;
			@Pc(300) Class4_Sub1_Sub5 local300;
			if (arg0 == Static173.aClass328_9) {
				local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
				@Pc(132) boolean local132 = (local12 & 0x80) != 0;
				local20 = Static364.anInt6396 + (local12 >> 3 & 0x7);
				local27 = Static562.anInt9256 + (local12 & 0x7);
				local31 = local20 + Static282.aClass6_Sub21_Sub2_1.method6055();
				local39 = Static282.aClass6_Sub21_Sub2_1.method6055() + local27;
				local43 = Static282.aClass6_Sub21_Sub2_1.method6058();
				local168 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local174 = Static282.aClass6_Sub21_Sub2_1.method6069() * 4;
				local180 = Static282.aClass6_Sub21_Sub2_1.method6069() * 4;
				local184 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local188 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local192 = Static282.aClass6_Sub21_Sub2_1.method6069();
				if (local192 == 255) {
					local192 = -1;
				}
				local203 = Static282.aClass6_Sub21_Sub2_1.method6003();
				if (local20 >= 0 && local27 >= 0 && Static473.anInt8075 > local20 && Static165.anInt6749 > local27 && local31 >= 0 && local39 >= 0 && Static473.anInt8075 > local31 && Static165.anInt6749 > local39 && local168 != 65535) {
					local39 = local39 * 512 + 256;
					local20 = local20 * 512 + 256;
					local180 <<= 0x2;
					local203 <<= 0x2;
					local31 = local31 * 512 + 256;
					local174 <<= 0x2;
					local27 = local27 * 512 + 256;
					local300 = new Class4_Sub1_Sub5(local168, Static409.anInt9440, local20, local27, local174, Static312.anInt5688 + local184, Static312.anInt5688 + local188, local192, local203, local43, local180, local132);
					local300.method5285(local39, local184 + Static312.anInt5688, Static160.method2951(local39, local31, Static409.anInt9440) + -local180, local31);
					Static83.aClass361_10.method7833(new Class6_Sub2_Sub15(local300));
				}
			} else if (Static303.aClass328_18 == arg0) {
				local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
				local16 = (local12 >> 4 & 0x7) + Static364.anInt6396;
				local20 = (local12 & 0x7) + Static562.anInt9256;
				local27 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local31 = Static282.aClass6_Sub21_Sub2_1.method6069();
				local39 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local43 = Static282.aClass6_Sub21_Sub2_1.method6069();
				if (local16 >= 0 && local20 >= 0 && local16 < Static473.anInt8075 && Static165.anInt6749 > local20) {
					local168 = local16 * 512 + 256;
					local174 = local20 * 512 + 256;
					local180 = Static409.anInt9440;
					if (local180 < 3 && Static270.method4475(local16, local20)) {
						local180++;
					}
					@Pc(423) Class4_Sub1_Sub6 local423 = new Class4_Sub1_Sub6(local27, local39, Static312.anInt5688, Static409.anInt9440, local180, local168, Static160.method2951(local174, local168, Static409.anInt9440) - local31, local174, local16, local16, local20, local20, local43);
					Static79.aClass361_9.method7833(new Class6_Sub2_Sub2(local423));
				}
			} else if (arg0 == Static120.aClass328_4) {
				local12 = Static282.aClass6_Sub21_Sub2_1.method6068();
				local16 = Static282.aClass6_Sub21_Sub2_1.method6069();
				local20 = (local16 & 0x7) + Static562.anInt9256;
				local27 = Static138.anInt3088 + local20;
				local31 = Static364.anInt6396 + (local16 >> 4 & 0x7);
				local39 = Static39.anInt4952 + local31;
				@Pc(480) Class6_Sub51 local480 = (Class6_Sub51) Static478.aClass128_40.method3263((long) (Static409.anInt9440 << 28 | local27 << 14 | local39));
				if (local480 != null) {
					for (@Pc(488) Class6_Sub10 local488 = (Class6_Sub10) local480.aClass361_68.method7838(); local488 != null; local488 = (Class6_Sub10) local480.aClass361_68.method7845()) {
						if (local488.anInt1069 == (local12 & 0x7FFF)) {
							local488.method7804();
							break;
						}
					}
					if (local480.aClass361_68.method7837()) {
						local480.method7804();
					}
					if (local31 >= 0 && local20 >= 0 && Static473.anInt8075 > local31 && local20 < Static165.anInt6749) {
						Static540.method3555(local20, local31, Static409.anInt9440);
					}
				}
			} else if (arg0 == Static510.aClass328_23) {
				local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
				local16 = (local12 >> 4 & 0x7) + Static364.anInt6396;
				local20 = Static562.anInt9256 + (local12 & 0x7);
				local27 = Static282.aClass6_Sub21_Sub2_1.method6003();
				if (local27 == 65535) {
					local27 = -1;
				}
				local31 = Static282.aClass6_Sub21_Sub2_1.method6069();
				local39 = local31 >> 4 & 0xF;
				local43 = local31 & 0x7;
				local168 = Static282.aClass6_Sub21_Sub2_1.method6069();
				local174 = Static282.aClass6_Sub21_Sub2_1.method6069();
				if (local16 >= 0 && local20 >= 0 && local16 < Static473.anInt8075 && Static165.anInt6749 > local20) {
					local180 = local39 + 1;
					if (local16 - local180 <= Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] && Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] <= local16 + local180 && Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0] >= local20 - local180 && local180 + local20 >= Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0]) {
						Static405.method5930(local174, local27, local168, local43, (local16 << 16) + (Static409.anInt9440 << 24) + (local20 << 8) + local39);
					}
				}
			} else {
				@Pc(706) boolean local706;
				if (arg0 == Static138.aClass328_5) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local16 = (local12 >> 4 & 0xF) + Static364.anInt6396 * 2;
					local20 = Static562.anInt9256 * 2 + (local12 & 0xF);
					local706 = Static282.aClass6_Sub21_Sub2_1.method6069() != 0;
					local31 = local16 + Static282.aClass6_Sub21_Sub2_1.method6055();
					local39 = local20 + Static282.aClass6_Sub21_Sub2_1.method6055();
					local43 = Static282.aClass6_Sub21_Sub2_1.method6058();
					local168 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local174 = Static282.aClass6_Sub21_Sub2_1.method6069() * 4;
					local180 = Static282.aClass6_Sub21_Sub2_1.method6069() * 4;
					local184 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local188 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local192 = Static282.aClass6_Sub21_Sub2_1.method6069();
					if (local192 == 255) {
						local192 = -1;
					}
					local203 = Static282.aClass6_Sub21_Sub2_1.method6003();
					if (local16 >= 0 && local20 >= 0 && Static473.anInt8075 * 2 > local16 && Static473.anInt8075 * 2 > local20 && local31 >= 0 && local39 >= 0 && local31 < Static165.anInt6749 * 2 && local39 < Static165.anInt6749 * 2 && local168 != 65535) {
						local39 = local39 * 256;
						local203 <<= 0x2;
						local16 *= 256;
						local31 *= 256;
						local174 <<= 0x2;
						local180 <<= 0x2;
						local20 = local20 * 256;
						local300 = new Class4_Sub1_Sub5(local168, Static409.anInt9440, local16, local20, local174, Static312.anInt5688 + local184, Static312.anInt5688 + local188, local192, local203, local43, local180, local706);
						local300.method5285(local39, Static312.anInt5688 + local184, -local180 + Static160.method2951(local39, local31, Static409.anInt9440), local31);
						Static83.aClass361_10.method7833(new Class6_Sub2_Sub15(local300));
					}
				} else if (Static536.aClass328_25 == arg0) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local16 = (local12 >> 4 & 0x7) + Static364.anInt6396;
					local20 = Static562.anInt9256 + (local12 & 0x7);
					local27 = Static282.aClass6_Sub21_Sub2_1.method6003();
					if (local27 == 65535) {
						local27 = -1;
					}
					local31 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local39 = local31 >> 4 & 0xF;
					local43 = local31 & 0x7;
					local168 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local174 = Static282.aClass6_Sub21_Sub2_1.method6069();
					if (local16 >= 0 && local20 >= 0 && Static473.anInt8075 > local16 && Static165.anInt6749 > local20) {
						local180 = local39 + 1;
						if (Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] >= local16 - local180 && Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] <= local16 + local180 && local20 - local180 <= Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0] && Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0] <= local180 + local20) {
							Static489.method6693(local174, local27, local168, local43, (Static409.anInt9440 << 24) + (local16 << 16) + (local20 << 8) + local39);
						}
					}
				} else if (arg0 == Static527.aClass328_24) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6026();
					local16 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local20 = Static364.anInt6396 + (local16 >> 4 & 0x7);
					local27 = Static562.anInt9256 + (local16 & 0x7);
					local31 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local39 = local31 >> 2;
					local43 = local31 & 0x3;
					local168 = Static279.anIntArray399[local39];
					if (Static1.method7675(Static367.anInt6493) || local20 >= 0 && local27 >= 0 && Static473.anInt8075 > local20 && Static165.anInt6749 > local27) {
						Static249.method4259(local168, local43, local39, local12, Static409.anInt9440, local27, local20);
					}
				} else if (arg0 == Static28.aClass328_1) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6035();
					local16 = (local12 & 0x7) + Static562.anInt9256;
					local20 = Static138.anInt3088 + local16;
					local27 = (local12 >> 4 & 0x7) + Static364.anInt6396;
					local31 = local27 + Static39.anInt4952;
					local39 = Static282.aClass6_Sub21_Sub2_1.method6068();
					local43 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local168 = Static282.aClass6_Sub21_Sub2_1.method6026();
					if (Static272.anInt5214 != local168) {
						@Pc(1161) boolean local1161 = local27 >= 0 && local16 >= 0 && local27 < Static473.anInt8075 && Static165.anInt6749 > local16;
						if (local1161 || Static1.method7675(Static367.anInt6493)) {
							Static535.method7306(Static409.anInt9440, new Class6_Sub10(local39, local43), local20, local31);
							if (local1161) {
								Static540.method3555(local16, local27, Static409.anInt9440);
							}
						}
					}
				} else if (Static471.aClass328_20 == arg0) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local16 = Static364.anInt6396 * 2 + (local12 >> 4 & 0xF);
					local20 = Static562.anInt9256 * 2 + (local12 & 0xF);
					local706 = Static282.aClass6_Sub21_Sub2_1.method6069() != 0;
					local31 = local16 + Static282.aClass6_Sub21_Sub2_1.method6055();
					local39 = local20 + Static282.aClass6_Sub21_Sub2_1.method6055();
					local43 = Static282.aClass6_Sub21_Sub2_1.method6058();
					local168 = Static282.aClass6_Sub21_Sub2_1.method6058();
					local174 = Static282.aClass6_Sub21_Sub2_1.method6003();
					@Pc(1248) byte local1248 = Static282.aClass6_Sub21_Sub2_1.method6055();
					local184 = Static282.aClass6_Sub21_Sub2_1.method6069() * 4;
					local188 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local192 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local203 = Static282.aClass6_Sub21_Sub2_1.method6069();
					if (local203 == 255) {
						local203 = -1;
					}
					@Pc(1277) int local1277 = Static282.aClass6_Sub21_Sub2_1.method6003();
					if (local16 >= 0 && local20 >= 0 && local16 < Static473.anInt8075 * 2 && Static473.anInt8075 * 2 > local20 && local31 >= 0 && local39 >= 0 && local31 < Static165.anInt6749 * 2 && Static165.anInt6749 * 2 > local39 && local174 != 65535) {
						local20 = local20 * 256;
						local184 <<= 0x2;
						local180 = local1248 << 2;
						local39 *= 256;
						local1277 <<= 0x2;
						local31 = local31 * 256;
						local16 *= 256;
						if (local43 != 0) {
							@Pc(1357) Class4_Sub1_Sub1 local1357 = null;
							@Pc(1377) int local1377;
							@Pc(1367) int local1367;
							@Pc(1371) int local1371;
							if (local43 < 0) {
								local1367 = -local43 - 1;
								local1371 = local1367 & 0x7FF;
								local1377 = local1367 >> 11 & 0xF;
								if (local1371 == Static272.anInt5214) {
									local1357 = Static328.aClass4_Sub1_Sub1_Sub2_2;
								} else {
									local1357 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local1371];
								}
							} else {
								local1367 = local43 - 1;
								local1371 = local1367 & 0x7FF;
								local1377 = local1367 >> 11 & 0xF;
								@Pc(1409) Class6_Sub34 local1409 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local1371);
								if (local1409 != null) {
									local1357 = local1409.aClass4_Sub1_Sub1_Sub1_2;
								}
							}
							if (local1357 != null) {
								@Pc(1420) Class118 local1420 = local1357.method5891();
								if (local1420.anIntArrayArray20 != null && local1420.anIntArrayArray20[local1377] != null) {
									local1371 = local1420.anIntArrayArray20[local1377][0];
									@Pc(1442) int local1442 = local1420.anIntArrayArray20[local1377][2];
									@Pc(1447) int local1447 = local1357.aClass354_7.method7776();
									@Pc(1451) int local1451 = Class6_Sub2_Sub7.anIntArray178[local1447];
									@Pc(1455) int local1455 = Class6_Sub2_Sub7.anIntArray177[local1447];
									@Pc(1465) int local1465 = local1442 * local1451 + local1455 * local1371 >> 14;
									@Pc(1476) int local1476 = local1455 * local1442 - local1371 * local1451 >> 14;
									local180 -= local1420.anIntArrayArray20[local1377][1];
									local16 += local1465;
									local20 += local1476;
								}
							}
						}
						@Pc(1515) Class4_Sub1_Sub5 local1515 = new Class4_Sub1_Sub5(local174, Static409.anInt9440, local16, local20, local180, local188 + Static312.anInt5688, Static312.anInt5688 + local192, local203, local1277, local168, local184, local706);
						local1515.method5285(local39, local188 + Static312.anInt5688, -local184 + Static160.method2951(local39, local31, Static409.anInt9440), local31);
						Static83.aClass361_10.method7833(new Class6_Sub2_Sub15(local1515));
					}
				} else if (arg0 == Static51.aClass328_3) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local16 = (local12 & 0x7) + Static562.anInt9256;
					local20 = Static138.anInt3088 + local16;
					local27 = (local12 >> 4 & 0x7) + Static364.anInt6396;
					local31 = local27 + Static39.anInt4952;
					local39 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local43 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local168 = Static282.aClass6_Sub21_Sub2_1.method6003();
					if (Static478.aClass128_40 != null) {
						@Pc(1597) Class6_Sub51 local1597 = (Class6_Sub51) Static478.aClass128_40.method3263((long) (local20 << 14 | Static409.anInt9440 << 28 | local31));
						if (local1597 != null) {
							for (@Pc(1605) Class6_Sub10 local1605 = (Class6_Sub10) local1597.aClass361_68.method7838(); local1605 != null; local1605 = (Class6_Sub10) local1597.aClass361_68.method7845()) {
								if (local1605.anInt1069 == (local39 & 0x7FFF) && local1605.anInt1068 == local43) {
									local1605.method7804();
									local1605.anInt1068 = local168;
									Static535.method7306(Static409.anInt9440, local1605, local20, local31);
									break;
								}
							}
							if (local27 >= 0 && local16 >= 0 && Static473.anInt8075 > local27 && local16 < Static165.anInt6749) {
								Static540.method3555(local16, local27, Static409.anInt9440);
							}
						}
					}
				} else if (Static316.aClass328_19 == arg0) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6040();
					local16 = Static364.anInt6396 + (local12 >> 4 & 0x7);
					local20 = Static562.anInt9256 + (local12 & 0x7);
					local27 = Static282.aClass6_Sub21_Sub2_1.method6068();
					@Pc(1707) byte local1707 = Static282.aClass6_Sub21_Sub2_1.method6038();
					local39 = Static282.aClass6_Sub21_Sub2_1.method6026();
					local43 = Static282.aClass6_Sub21_Sub2_1.method6003();
					@Pc(1719) byte local1719 = Static282.aClass6_Sub21_Sub2_1.method6059();
					local174 = Static282.aClass6_Sub21_Sub2_1.method6048();
					local180 = local174 >> 2;
					local184 = local174 & 0x3;
					local188 = Static282.aClass6_Sub21_Sub2_1.method6007();
					@Pc(1739) byte local1739 = Static282.aClass6_Sub21_Sub2_1.method6055();
					@Pc(1743) byte local1743 = Static282.aClass6_Sub21_Sub2_1.method6067();
					if (!Static240.aClass14_7.method6876()) {
						Static17.method404(local188, local180, local27, local20, local39, local16, local184, local1739, local43, local1743, local1719, Static409.anInt9440, local1707);
					}
				} else if (Static494.aClass328_22 == arg0) {
					Static282.aClass6_Sub21_Sub2_1.method6069();
					local12 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local16 = (local12 >> 4 & 0x7) + Static364.anInt6396;
					local20 = Static562.anInt9256 + (local12 & 0x7);
					local27 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local31 = Static282.aClass6_Sub21_Sub2_1.method6069();
					local39 = Static282.aClass6_Sub21_Sub2_1.method6031();
					@Pc(1803) String local1803 = Static282.aClass6_Sub21_Sub2_1.method6044();
					Static128.method2565(local1803, local20, local27, Static409.anInt9440, local39, local31, local16);
				} else if (arg0 == Static30.aClass328_2) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6048();
					local16 = local12 >> 2;
					local20 = local12 & 0x3;
					local27 = Static279.anIntArray399[local16];
					local31 = Static282.aClass6_Sub21_Sub2_1.method6003();
					if (local31 == 65535) {
						local31 = -1;
					}
					local39 = Static282.aClass6_Sub21_Sub2_1.method6048();
					local43 = Static364.anInt6396 + (local39 >> 4 & 0x7);
					local168 = Static562.anInt9256 + (local39 & 0x7);
					Static5.method174(local168, local20, local16, local43, local27, local31, Static409.anInt9440);
				} else if (Static206.aClass328_10 == arg0) {
					local12 = Static282.aClass6_Sub21_Sub2_1.method6035();
					local16 = (local12 >> 4 & 0x7) + Static364.anInt6396;
					local20 = (local12 & 0x7) + Static562.anInt9256;
					local27 = Static282.aClass6_Sub21_Sub2_1.method6035();
					local31 = local27 >> 2;
					local39 = local27 & 0x3;
					local43 = Static279.anIntArray399[local31];
					if (Static1.method7675(Static367.anInt6493) || local16 >= 0 && local20 >= 0 && Static473.anInt8075 > local16 && local20 < Static165.anInt6749) {
						Static249.method4259(local43, local39, local31, -1, Static409.anInt9440, local20, local16);
					}
				} else {
					Static256.method4328("T3 - " + arg0, null);
					Static40.method1024(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IB)V")
	public static void method2594() {
		@Pc(1) Class136 local1 = Static367.aClass136_73;
		synchronized (Static367.aClass136_73) {
			Static367.aClass136_73.method3474(5);
		}
		local1 = Static183.aClass136_44;
		synchronized (Static183.aClass136_44) {
			Static183.aClass136_44.method3474(5);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2595(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(27) String local27 = Static575.method7408(arg0);
		if (local27 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static574.anInt9426; local32++) {
			@Pc(38) String local38 = Static398.aStringArray29[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static575.method7408(local38);
			if (local38 != null && local38.equals(local27)) {
				Static574.anInt9426--;
				for (@Pc(62) int local62 = local32; local62 < Static574.anInt9426; local62++) {
					Static398.aStringArray29[local62] = Static398.aStringArray29[local62 + 1];
					Static183.aStringArray8[local62] = Static183.aStringArray8[local62 + 1];
					Static300.anIntArray409[local62] = Static300.anIntArray409[local62 + 1];
					Static299.aStringArray21[local62] = Static299.aStringArray21[local62 + 1];
					Static480.anIntArray599[local62] = Static480.anIntArray599[local62 + 1];
					Static18.aBooleanArray1[local62] = Static18.aBooleanArray1[local62 + 1];
				}
				Static449.anInt7763 = Static592.anInt9587;
				@Pc(131) Class6_Sub31 local131 = Static114.method2007(Static36.aClass47_17, Static337.aClass324_1);
				local131.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(arg0));
				local131.aClass6_Sub21_Sub2_2.method6022(arg0);
				Static534.method7251(local131);
				return;
			}
		}
	}
}
