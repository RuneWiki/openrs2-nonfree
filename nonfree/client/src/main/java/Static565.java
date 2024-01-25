import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIBIII)I")
	public static int method7634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static310.aClass129Array5 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(22) int local22 = arg2 >> 9;
			@Pc(26) int local26 = arg3 >> 9;
			if (arg0 < 0 || arg1 < 0 || arg0 > Static458.anInt9736 - 1 || arg1 > Static378.anInt6747 - 1) {
				return 0;
			}
			if (local22 < 1 || local26 < 1 || Static458.anInt9736 - 1 < local22 || local26 > Static378.anInt6747 - 1) {
				return 0;
			}
			@Pc(86) boolean local86 = (Static85.aByteArrayArrayArray1[1][arg2 >> 9][arg3 >> 9] & 0x2) != 0;
			@Pc(114) boolean local114;
			@Pc(133) boolean local133;
			if ((arg2 & 0x1FF) == 0) {
				local114 = (Static85.aByteArrayArrayArray1[1][local22 - 1][arg3 >> 9] & 0x2) != 0;
				local133 = (Static85.aByteArrayArrayArray1[1][local22][arg3 >> 9] & 0x2) != 0;
				if (local114 != local133) {
					local86 = (Static85.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) != 0;
				}
			}
			if ((arg3 & 0x1FF) == 0) {
				local114 = (Static85.aByteArrayArrayArray1[1][arg2 >> 9][local26 - 1] & 0x2) != 0;
				local133 = (Static85.aByteArrayArrayArray1[1][arg2 >> 9][local26] & 0x2) != 0;
				if (local114 != local133) {
					local86 = (Static85.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) != 0;
				}
			}
			if (local86) {
				arg4++;
			}
		}
		return Static310.aClass129Array5[arg4].method6480(arg3, arg2);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)I")
	public static int method7635() {
		return Static274.method4004(false);
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
	public static void method7636() {
		for (@Pc(7) int local7 = 0; local7 < Static439.anInt8379; local7++) {
			@Pc(13) Class239 local13 = Static73.aClass239Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(143) int local143;
			if (local13.aClass1_Sub6_Sub4_4 == null) {
				local13.anInt6459--;
				if (local13.anInt6459 < (local13.method5242() ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte87 == 1 && local13.aClass249_1 == null) {
						local13.aClass249_1 = Static603.method5368(Static341.aClass308_120, local13.anInt6458, 0);
						if (local13.aClass249_1 == null) {
							continue;
						}
						local13.anInt6459 += local13.aClass249_1.method5370();
					} else if (local13.method5242() && (local13.aClass1_Sub49_3 == null || local13.aClass1_Sub13_Sub1_4 == null)) {
						if (local13.aClass1_Sub49_3 == null) {
							local13.aClass1_Sub49_3 = Static562.method7595(Static133.aClass308_53, local13.anInt6458);
						}
						if (local13.aClass1_Sub49_3 == null) {
							continue;
						}
						if (local13.aClass1_Sub13_Sub1_4 == null) {
							local13.aClass1_Sub13_Sub1_4 = local13.aClass1_Sub49_3.method7594(new int[] { 22050 });
							if (local13.aClass1_Sub13_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local13.anInt6459 < 0) {
						@Pc(123) int local123 = 8192;
						if (local13.anInt6462 == 0) {
							local143 = (local13.aByte87 == 3 ? Static86.aClass1_Sub30_Sub1_1.anInt6205 : Static86.aClass1_Sub30_Sub1_1.anInt6185) * local13.anInt6456 >> 2;
						} else {
							@Pc(133) int local133 = local13.anInt6462 >> 24 & 0x3;
							if (local133 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) {
								@Pc(152) int local152 = (local13.anInt6462 & 0xFF) << 9;
								@Pc(158) int local158 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() << 8;
								@Pc(165) int local165 = local13.anInt6462 >> 16 & 0xFF;
								@Pc(177) int local177 = local158 + (local165 << 9) + 256 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902;
								@Pc(184) int local184 = local13.anInt6462 >> 8 & 0xFF;
								@Pc(197) int local197 = (local184 << 9) + local158 + 256 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906;
								@Pc(206) int local206 = Math.abs(local177) + Math.abs(local197) - 512;
								if (local152 < local206) {
									local13.anInt6459 = -99999;
									continue;
								}
								if (local206 < 0) {
									local206 = 0;
								}
								local143 = (local152 - local206) * Static86.aClass1_Sub30_Sub1_1.anInt6196 * local13.anInt6456 / local152 >> 2;
								if (local13.aClass11_Sub1_2 != null && local13.aClass11_Sub1_2 instanceof Class11_Sub1_Sub1) {
									@Pc(248) Class11_Sub1_Sub1 local248 = (Class11_Sub1_Sub1) local13.aClass11_Sub1_2;
									@Pc(251) short local251 = local248.aShort88;
									@Pc(254) short local254 = local248.aShort90;
								}
								if (local177 != 0 || local197 != 0) {
									@Pc(277) int local277 = -Static175.anInt3256 - (int) (Math.atan2((double) local177, (double) local197) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local277 > 8192) {
										local277 = 16384 - local277;
									}
									@Pc(291) int local291;
									if (local206 <= 0) {
										local291 = 8192;
									} else if (local206 >= 4096) {
										local291 = 16384;
									} else {
										local291 = (8192 - local206) / 4096 + 8192;
									}
									local123 = (16384 - local291 >> 1) + local277 * local291 / 8192;
								}
							} else {
								local143 = 0;
							}
						}
						if (local143 > 0) {
							@Pc(342) Class1_Sub13_Sub1 local342 = null;
							if (local13.aByte87 == 1) {
								local342 = local13.aClass249_1.method5369().method805(Static44.aClass227_1);
							} else if (local13.method5242()) {
								local342 = local13.aClass1_Sub13_Sub1_4;
							}
							@Pc(372) Class1_Sub6_Sub4 local372 = local13.aClass1_Sub6_Sub4_4 = Static605.method6617(local342, local13.anInt6466, local143, local123);
							local372.method6620(local13.anInt6463 - 1);
							Static425.aClass1_Sub6_Sub3_2.method6530(local372);
						}
					}
				}
			} else if (!local13.aClass1_Sub6_Sub4_4.method7907()) {
				local15 = true;
			}
			if (local15) {
				Static439.anInt8379--;
				for (local143 = local7; local143 < Static439.anInt8379; local143++) {
					Static73.aClass239Array1[local143] = Static73.aClass239Array1[local143 + 1];
				}
				local7--;
			}
		}
		if (Static11.aBoolean8 && !Static389.method5594()) {
			if (Static86.aClass1_Sub30_Sub1_1.anInt6189 != 0 && Static106.anInt1789 != -1) {
				if (Static80.aClass1_Sub6_Sub2_3 == null) {
					Static33.method637(Static106.anInt1789, Static86.aClass1_Sub30_Sub1_1.anInt6189, Static51.aClass308_24);
				} else {
					Static95.method1441(Static106.anInt1789, Static51.aClass308_24, Static86.aClass1_Sub30_Sub1_1.anInt6189, Static80.aClass1_Sub6_Sub2_3);
				}
			}
			Static11.aBoolean8 = false;
			Static80.aClass1_Sub6_Sub2_3 = null;
		} else if (Static86.aClass1_Sub30_Sub1_1.anInt6189 != 0 && Static106.anInt1789 != -1 && !Static389.method5594()) {
			@Pc(474) Class1_Sub9 local474 = Static123.method2194(Static469.aClass235_2, Static7.aClass208_3);
			local474.aClass1_Sub3_Sub1_1.method7936(Static106.anInt1789);
			Static42.method746(local474);
			Static106.anInt1789 = -1;
		}
	}
}
