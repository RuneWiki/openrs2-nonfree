import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
	public static int anInt2831;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
	public static int anInt2834;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "S")
	public static short aShort90 = 32767;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "[I")
	public static final int[] anIntArray233 = new int[2];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Z")
	public static boolean method2280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static378.aBoolean462) {
			return false;
		}
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(15) int local15 = arg0 & 0xFFFF;
		if (Static300.aClass68ArrayArray3[local11] == null || Static300.aClass68ArrayArray3[local11][local15] == null) {
			return false;
		}
		@Pc(38) Class68 local38 = Static300.aClass68ArrayArray3[local11][local15];
		@Pc(52) Class3_Sub38 local52;
		if (arg1 == -1 && local38.anInt2182 == 0) {
			for (local52 = (Class3_Sub38) Static374.aClass229_41.method5328(); local52 != null; local52 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
				if (local52.anInt6532 == 46 || local52.anInt6532 == 1008 || local52.anInt6532 == 45 || local52.anInt6532 == 18 || local52.anInt6532 == 3) {
					for (@Pc(133) Class68 local133 = Static321.method4661(local52.anInt6531); local133 != null; local133 = Static94.method1636(local133)) {
						if (local133.anInt2177 == local38.anInt2177) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class3_Sub38) Static374.aClass229_41.method5328(); local52 != null; local52 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
				if (arg1 == local52.anInt6525 && local52.anInt6531 == local38.anInt2177 && (local52.anInt6532 == 46 || local52.anInt6532 == 1008 || local52.anInt6532 == 45 || local52.anInt6532 == 18 || local52.anInt6532 == 3)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!gp;I)V")
	public static void method2281(@OriginalArg(0) Class87 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (Static146.aClass87_12 == arg0) {
			local12 = Static110.aClass3_Sub2_Sub2_1.method6013();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static188.anIntArray293[local16];
			local28 = Static110.aClass3_Sub2_Sub2_1.method5997();
			local36 = (local28 >> 4 & 0x7) + Static393.anInt6761;
			local42 = Static426.anInt7294 + (local28 & 0x7);
			if (Static341.method4904(Static197.anInt4304) || local36 >= 0 && local42 >= 0 && local36 < Static399.anInt6923 && local42 < Static127.anInt2696) {
				Static355.method5028(local16, local20, Static286.anInt6054, -1, local24, local42, local36);
			}
			return;
		}
		@Pc(132) int local132;
		@Pc(128) int local128;
		@Pc(153) int local153;
		if (arg0 == Static447.aClass87_22) {
			local12 = Static110.aClass3_Sub2_Sub2_1.method6053();
			local16 = Static393.anInt6761 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static426.anInt7294;
			local24 = Static110.aClass3_Sub2_Sub2_1.method6004();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static110.aClass3_Sub2_Sub2_1.method6053();
			local36 = local28 >> 4 & 0xF;
			local42 = local28 & 0x7;
			local128 = Static110.aClass3_Sub2_Sub2_1.method6053();
			local132 = Static110.aClass3_Sub2_Sub2_1.method6053();
			if (local16 >= 0 && local20 >= 0 && local16 < Static399.anInt6923 && Static127.anInt2696 > local20) {
				local153 = local36 + 1;
				if (local16 - local153 <= Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0] && Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0] <= local153 + local16 && local20 - local153 <= Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0] && Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0] <= local20 + local153) {
					Static126.method2878(local24, local132, local128, local36 + (local20 << 8) + (Static286.anInt6054 << 24) + (local16 << 16), local42);
				}
			}
		} else if (arg0 == Static183.aClass87_16) {
			local12 = Static110.aClass3_Sub2_Sub2_1.method6004();
			local16 = Static110.aClass3_Sub2_Sub2_1.method6006();
			local20 = Static110.aClass3_Sub2_Sub2_1.method6053();
			local24 = Static393.anInt6761 + (local20 >> 4 & 0x7);
			local28 = Static426.anInt7294 + (local20 & 0x7);
			if (local24 >= 0 && local28 >= 0 && Static399.anInt6923 > local24 && local28 < Static127.anInt2696) {
				Static21.method589(local28, local24, new Class3_Sub22(local16, local12), Static286.anInt6054);
				Static213.method3438(local28, local24, Static286.anInt6054);
			}
		} else if (arg0 == Static87.aClass87_15) {
			local12 = Static110.aClass3_Sub2_Sub2_1.method5997();
			local16 = Static393.anInt6761 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static426.anInt7294;
			local24 = Static110.aClass3_Sub2_Sub2_1.method6003();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static110.aClass3_Sub2_Sub2_1.method6013();
			local36 = local28 >> 2;
			local42 = local28 & 0x3;
			local128 = Static188.anIntArray293[local36];
			Static189.method3155(local128, local36, local20, local42, local24, local16, Static286.anInt6054);
		} else if (Static299.aClass87_18 == arg0) {
			Static110.aClass3_Sub2_Sub2_1.method6053();
			local12 = Static110.aClass3_Sub2_Sub2_1.method6053();
			local16 = (local12 >> 4 & 0x7) + Static393.anInt6761;
			local20 = (local12 & 0x7) + Static426.anInt7294;
			local24 = Static110.aClass3_Sub2_Sub2_1.method6004();
			local28 = Static110.aClass3_Sub2_Sub2_1.method6053();
			local36 = Static110.aClass3_Sub2_Sub2_1.method6020();
			@Pc(385) String local385 = Static110.aClass3_Sub2_Sub2_1.method6027();
			Static214.method3441(local20, local24, local36, local16, local28, Static286.anInt6054, local385);
		} else {
			@Pc(448) byte local448;
			@Pc(452) int local452;
			@Pc(456) int local456;
			@Pc(460) int local460;
			@Pc(464) int local464;
			if (Static442.aClass87_21 == arg0) {
				local12 = Static110.aClass3_Sub2_Sub2_1.method5997();
				local16 = Static393.anInt6761 + (local12 >> 4 & 0x7);
				local20 = Static426.anInt7294 + (local12 & 0x7);
				@Pc(422) byte local422 = Static110.aClass3_Sub2_Sub2_1.method6011();
				@Pc(426) byte local426 = Static110.aClass3_Sub2_Sub2_1.method6049();
				@Pc(430) byte local430 = Static110.aClass3_Sub2_Sub2_1.method6049();
				local42 = Static110.aClass3_Sub2_Sub2_1.method6039();
				local128 = Static110.aClass3_Sub2_Sub2_1.method6004();
				local132 = Static110.aClass3_Sub2_Sub2_1.method6004();
				local448 = Static110.aClass3_Sub2_Sub2_1.method6050();
				local452 = Static110.aClass3_Sub2_Sub2_1.method6044();
				local456 = local452 >> 2;
				local460 = local452 & 0x3;
				local464 = Static110.aClass3_Sub2_Sub2_1.method6041();
				if (!Static266.aClass75_7.method2617()) {
					Static70.method1309(local42, local132, local128, local460, local430, Static286.anInt6054, local20, local448, local422, local464, local16, local456, local426);
				}
			} else {
				@Pc(522) boolean local522;
				@Pc(670) Class1_Sub3_Sub5 local670;
				if (arg0 == Static82.aClass87_9) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6053();
					local16 = Static393.anInt6761 * 2 + (local12 >> 4 & 0xF);
					local20 = Static426.anInt7294 * 2 + (local12 & 0xF);
					local522 = Static110.aClass3_Sub2_Sub2_1.method6053() != 0;
					local28 = Static110.aClass3_Sub2_Sub2_1.method6011() + local16;
					local36 = local20 + Static110.aClass3_Sub2_Sub2_1.method6011();
					local42 = Static110.aClass3_Sub2_Sub2_1.method6039();
					local128 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local132 = Static110.aClass3_Sub2_Sub2_1.method6053() * 4;
					local153 = Static110.aClass3_Sub2_Sub2_1.method6053() * 4;
					local452 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local456 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local460 = Static110.aClass3_Sub2_Sub2_1.method6053();
					local464 = Static110.aClass3_Sub2_Sub2_1.method6053();
					if (local460 == 255) {
						local460 = -1;
					}
					if (local16 >= 0 && local20 >= 0 && Static399.anInt6923 * 2 > local16 && Static399.anInt6923 * 2 > local20 && local28 >= 0 && local36 >= 0 && local28 < Static127.anInt2696 * 2 && local36 < Static127.anInt2696 * 2 && local128 != 65535) {
						local16 *= 64;
						local153 <<= 0x0;
						local36 = local36 * 64;
						local132 <<= 0x0;
						local20 = local20 * 64;
						local28 = local28 * 64;
						local670 = new Class1_Sub3_Sub5(local128, Static286.anInt6054, local16, local20, local132, local452 + Static290.anInt5325, Static290.anInt5325 + local456, local460, local464, local42, local153, local522);
						local670.method3961(local28, Static124.method2209(Static286.anInt6054, local28, local36) - local153, local452 - -Static290.anInt5325, local36);
						Static144.aClass229_24.method5321(new Class3_Sub3_Sub8(local670));
					}
				} else if (arg0 == Static166.aClass87_13) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6041();
					local16 = Static110.aClass3_Sub2_Sub2_1.method6013();
					local20 = local16 >> 2;
					local24 = local16 & 0x3;
					local28 = Static188.anIntArray293[local20];
					local36 = Static110.aClass3_Sub2_Sub2_1.method6044();
					local42 = Static393.anInt6761 + (local36 >> 4 & 0x7);
					local128 = (local36 & 0x7) + Static426.anInt7294;
					if (Static341.method4904(Static197.anInt4304) || local42 >= 0 && local128 >= 0 && Static399.anInt6923 > local42 && local128 < Static127.anInt2696) {
						Static355.method5028(local20, local24, Static286.anInt6054, local12, local28, local128, local42);
					}
				} else if (Static169.aClass87_14 == arg0) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local16 = Static110.aClass3_Sub2_Sub2_1.method6053();
					Static55.aClass25_1.method855(local12).method3302(local16);
				} else if (arg0 == Static43.aClass87_3) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6053();
					@Pc(807) boolean local807 = (local12 & 0x80) != 0;
					local20 = Static393.anInt6761 + (local12 >> 3 & 0x7);
					local24 = (local12 & 0x7) + Static426.anInt7294;
					local28 = Static110.aClass3_Sub2_Sub2_1.method6011() + local20;
					local36 = local24 + Static110.aClass3_Sub2_Sub2_1.method6011();
					local42 = Static110.aClass3_Sub2_Sub2_1.method6039();
					local128 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local132 = Static110.aClass3_Sub2_Sub2_1.method6053() * 4;
					local153 = Static110.aClass3_Sub2_Sub2_1.method6053() * 4;
					local452 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local456 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local460 = Static110.aClass3_Sub2_Sub2_1.method6053();
					local464 = Static110.aClass3_Sub2_Sub2_1.method6053();
					if (local460 == 255) {
						local460 = -1;
					}
					if (local20 >= 0 && local24 >= 0 && Static399.anInt6923 > local20 && local24 < Static127.anInt2696 && local28 >= 0 && local36 >= 0 && Static399.anInt6923 > local28 && Static127.anInt2696 > local36 && local128 != 65535) {
						local36 = local36 * 128 + 64;
						local132 <<= 0x0;
						local28 = local28 * 128 + 64;
						local153 <<= 0x0;
						local20 = local20 * 128 + 64;
						local24 = local24 * 128 + 64;
						local670 = new Class1_Sub3_Sub5(local128, Static286.anInt6054, local20, local24, local132, Static290.anInt5325 + local452, local456 + Static290.anInt5325, local460, local464, local42, local153, local807);
						local670.method3961(local28, Static124.method2209(Static286.anInt6054, local28, local36) - local153, Static290.anInt5325 + local452, local36);
						Static144.aClass229_24.method5321(new Class3_Sub3_Sub8(local670));
					}
				} else if (arg0 == Static331.aClass87_19) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method5997();
					local16 = Static393.anInt6761 + (local12 >> 4 & 0x7);
					local20 = Static426.anInt7294 + (local12 & 0x7);
					local24 = Static110.aClass3_Sub2_Sub2_1.method6006();
					if (local16 >= 0 && local20 >= 0 && local16 < Static399.anInt6923 && local20 < Static127.anInt2696) {
						@Pc(1049) Class3_Sub44 local1049 = (Class3_Sub44) Static157.aClass127_15.method3246((long) (Static286.anInt6054 << 28 | local20 << 14 | local16));
						if (local1049 != null) {
							for (@Pc(1057) Class3_Sub22 local1057 = (Class3_Sub22) local1049.aClass229_46.method5328(); local1057 != null; local1057 = (Class3_Sub22) local1049.aClass229_46.method5325()) {
								if ((local24 & 0x7FFF) == local1057.anInt3545) {
									local1057.method5987();
									break;
								}
							}
							if (local1049.aClass229_46.method5317()) {
								local1049.method5987();
							}
							Static213.method3438(local20, local16, Static286.anInt6054);
						}
					}
				} else if (Static283.aClass87_17 == arg0) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6003();
					local16 = Static110.aClass3_Sub2_Sub2_1.method6013();
					local20 = Static393.anInt6761 + (local16 >> 4 & 0x7);
					local24 = (local16 & 0x7) + Static426.anInt7294;
					local28 = Static110.aClass3_Sub2_Sub2_1.method6041();
					local36 = Static110.aClass3_Sub2_Sub2_1.method6006();
					if (local20 >= 0 && local24 >= 0 && Static399.anInt6923 > local20 && local24 < Static127.anInt2696 && local36 != Static177.anInt3617) {
						Static21.method589(local24, local20, new Class3_Sub22(local12, local28), Static286.anInt6054);
						Static213.method3438(local24, local20, Static286.anInt6054);
					}
				} else if (arg0 == Static120.aClass87_10) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6053();
					local16 = Static393.anInt6761 + (local12 >> 4 & 0x7);
					local20 = (local12 & 0x7) + Static426.anInt7294;
					local24 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local28 = Static110.aClass3_Sub2_Sub2_1.method6053();
					local36 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local42 = Static110.aClass3_Sub2_Sub2_1.method6053();
					if (local16 >= 0 && local20 >= 0 && local16 < Static399.anInt6923 && local20 < Static127.anInt2696) {
						local128 = local16 * 128 + 64;
						local132 = local20 * 128 + 64;
						local153 = Static286.anInt6054;
						if (local153 < 3 && Static202.method3303(local20, local16)) {
							local153++;
						}
						@Pc(1274) Class1_Sub3_Sub4 local1274 = new Class1_Sub3_Sub4(local24, local36, Static290.anInt5325, Static286.anInt6054, local153, local128, Static124.method2209(Static286.anInt6054, local128, local132) - local28, local132, local16, local16, local20, local20, local42);
						Static324.aClass229_4.method5321(new Class3_Sub3_Sub14(local1274));
					}
				} else if (arg0 == Static406.aClass87_20) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6053();
					local16 = Static393.anInt6761 + (local12 >> 4 & 0x7);
					local20 = Static426.anInt7294 + (local12 & 0x7);
					local24 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local28 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local36 = Static110.aClass3_Sub2_Sub2_1.method6004();
					if (Static157.aClass127_15 != null && local16 >= 0 && local20 >= 0 && local16 < Static399.anInt6923 && local20 < Static127.anInt2696) {
						@Pc(1351) Class3_Sub44 local1351 = (Class3_Sub44) Static157.aClass127_15.method3246((long) (local16 | local20 << 14 | Static286.anInt6054 << 28));
						if (local1351 != null) {
							for (@Pc(1361) Class3_Sub22 local1361 = (Class3_Sub22) local1351.aClass229_46.method5328(); local1361 != null; local1361 = (Class3_Sub22) local1351.aClass229_46.method5325()) {
								if ((local24 & 0x7FFF) == local1361.anInt3545 && local1361.anInt3542 == local28) {
									local1361.method5987();
									local1361.anInt3542 = local36;
									Static21.method589(local20, local16, local1361, Static286.anInt6054);
									break;
								}
							}
							Static213.method3438(local20, local16, Static286.anInt6054);
						}
					}
				} else if (Static146.aClass87_11 == arg0) {
					local12 = Static110.aClass3_Sub2_Sub2_1.method6053();
					local16 = Static393.anInt6761 * 2 + (local12 >> 4 & 0xF);
					local20 = (local12 & 0xF) + Static426.anInt7294 * 2;
					local522 = Static110.aClass3_Sub2_Sub2_1.method6053() != 0;
					local28 = Static110.aClass3_Sub2_Sub2_1.method6011() + local16;
					local36 = Static110.aClass3_Sub2_Sub2_1.method6011() + local20;
					local42 = Static110.aClass3_Sub2_Sub2_1.method6039();
					local128 = Static110.aClass3_Sub2_Sub2_1.method6039();
					local132 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local448 = Static110.aClass3_Sub2_Sub2_1.method6011();
					local452 = Static110.aClass3_Sub2_Sub2_1.method6053() * 4;
					local456 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local460 = Static110.aClass3_Sub2_Sub2_1.method6004();
					local464 = Static110.aClass3_Sub2_Sub2_1.method6053();
					if (local464 == 255) {
						local464 = -1;
					}
					@Pc(1491) int local1491 = Static110.aClass3_Sub2_Sub2_1.method6053();
					if (local16 >= 0 && local20 >= 0 && local16 < Static399.anInt6923 * 2 && Static399.anInt6923 * 2 > local20 && local28 >= 0 && local36 >= 0 && Static127.anInt2696 * 2 > local28 && Static127.anInt2696 * 2 > local36 && local132 != 65535) {
						local16 *= 64;
						local20 *= 64;
						local28 *= 64;
						local153 = local448 << 0;
						local452 <<= 0x0;
						local36 *= 64;
						if (local42 != 0) {
							@Pc(1587) int local1587;
							@Pc(1595) Class1_Sub3_Sub3 local1595;
							@Pc(1581) int local1581;
							@Pc(1591) int local1591;
							if (local42 >= 0) {
								local1581 = local42 - 1;
								local1587 = local1581 >> 11 & 0xF;
								local1591 = local1581 & 0x7FF;
								local1595 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local1591];
							} else {
								local1581 = -local42 - 1;
								local1591 = local1581 & 0x7FF;
								local1587 = local1581 >> 11 & 0xF;
								if (Static177.anInt3617 == local1591) {
									local1595 = Static113.aClass1_Sub3_Sub3_Sub1_4;
								} else {
									local1595 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local1591];
								}
							}
							if (local1595 != null) {
								@Pc(1631) Class137 local1631 = local1595.method4837();
								if (local1631.anIntArrayArray34 != null && local1631.anIntArrayArray34[local1587] != null) {
									local1591 = local1631.anIntArrayArray34[local1587][0];
									@Pc(1653) int local1653 = local1631.anIntArrayArray34[local1587][2];
									@Pc(1658) int local1658 = local1595.aClass160_7.method3877();
									@Pc(1662) int local1662 = Applet_Sub1.anIntArray85[local1658];
									@Pc(1666) int local1666 = Applet_Sub1.anIntArray87[local1658];
									@Pc(1676) int local1676 = local1666 * local1591 + local1662 * local1653 >> 15;
									@Pc(1686) int local1686 = local1666 * local1653 - local1591 * local1662 >> 15;
									local153 -= local1631.anIntArrayArray34[local1587][1];
									local20 += local1686;
									local16 += local1676;
								}
							}
						}
						@Pc(1725) Class1_Sub3_Sub5 local1725 = new Class1_Sub3_Sub5(local132, Static286.anInt6054, local16, local20, local153, local456 + Static290.anInt5325, local460 + Static290.anInt5325, local464, local1491, local128, local452, local522);
						local1725.method3961(local28, Static124.method2209(Static286.anInt6054, local28, local36) - local452, local456 - -Static290.anInt5325, local36);
						Static144.aClass229_24.method5321(new Class3_Sub3_Sub8(local1725));
					}
				} else {
					Static379.method1671(null, "T3 - " + arg0);
					Static378.method5234();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBZ)V")
	public static void method2283(@OriginalArg(3) boolean arg0) {
		Static29.aBoolean45 = arg0;
		Static94.anInt2028 = 22050;
		Static392.anInt6751 = 2;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method2284() {
		if (Static97.aBoolean164) {
			return;
		}
		if (Static123.aClass21_Sub1_1.aBoolean72) {
			Static235.aFloat60 = (int) Static235.aFloat60 + 191 & 0xFFFFFF80;
		} else {
			Static393.aFloat92 += (24.0F - Static393.aFloat92) / 2.0F;
		}
		Static97.aBoolean164 = true;
		Static189.aBoolean300 = true;
	}
}
