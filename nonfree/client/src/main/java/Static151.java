import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!kl;")
	public static Class96 aClass96_2;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI[FIIIIIFI)V")
	public static void method2345(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg0 - arg6;
		@Pc(9) int local9 = arg3 - arg8;
		@Pc(17) int local17 = arg4 - arg2;
		@Pc(38) float local38 = (float) local9 * arg1[1] + arg1[0] * (float) local5 + arg1[2] * (float) local17;
		@Pc(59) float local59 = (float) local17 * arg1[5] + (float) local9 * arg1[4] + (float) local5 * arg1[3];
		@Pc(80) float local80 = (float) local17 * arg1[8] + (float) local9 * arg1[7] + arg1[6] * (float) local5;
		@Pc(99) float local99 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(110) float local110 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = (float) Math.asin((double) (local59 / local99)) / 3.1415927F + arg7 + 0.5F;
		@Pc(130) float local130;
		if (arg5 == 1) {
			local130 = local110;
			local110 = -local123;
			local123 = local130;
		} else if (arg5 == 2) {
			local123 = -local123;
			local110 = -local110;
		} else if (arg5 == 3) {
			local130 = local110;
			local110 = local123;
			local123 = -local130;
		}
		Static418.aFloat101 = local123;
		Static161.aFloat95 = local110;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method2346() {
		if (Static39.aClass79_Sub1_1.method1949(Static402.anInt6656) != 2) {
			return;
		}
		@Pc(25) byte local25 = (byte) (Static463.anInt7797 - 4 & 0xFF);
		@Pc(29) int local29 = Static463.anInt7797 % Static373.anInt6324;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static291.anInt5062; local35++) {
				Static6.aByteArrayArrayArray1[local31][local29][local35] = local25;
			}
		}
		if (Static276.anInt4606 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static204.anIntArray311[local35] = -1000000;
			Static124.anIntArray113[local35] = 1000000;
			Static123.anIntArray103[local35] = 0;
			Static130.anIntArray120[local35] = 1000000;
			Static256.anIntArray280[local35] = 0;
		}
		@Pc(138) int local138;
		if (Static27.anInt490 != 1) {
			local138 = Static181.method4212(Static276.anInt4606, Static152.anInt7561, Static266.anInt4433);
			if (local138 - Static410.anInt6946 >= 800 || (Static360.aByteArrayArrayArray16[Static276.anInt4606][Static266.anInt4433 >> 7][Static152.anInt7561 >> 7] & 0x4) == 0) {
				return;
			}
			Static363.method5077(1, Static389.aClass227ArrayArrayArray3, Static152.anInt7561 >> 7, Static266.anInt4433 >> 7, false);
			return;
		}
		if ((Static360.aByteArrayArrayArray16[Static276.anInt4606][Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7][Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7] & 0x4) != 0) {
			Static363.method5077(0, Static389.aClass227ArrayArrayArray3, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7, false);
		}
		if (Static419.anInt7092 >= 2560) {
			return;
		}
		local138 = Static266.anInt4433 >> 7;
		@Pc(142) int local142 = Static152.anInt7561 >> 7;
		@Pc(147) int local147 = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7;
		@Pc(152) int local152 = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7;
		@Pc(164) int local164;
		if (local147 <= local138) {
			local164 = local138 - local147;
		} else {
			local164 = local147 - local138;
		}
		@Pc(182) int local182;
		if (local142 < local152) {
			local182 = local152 - local142;
		} else {
			local182 = local142 - local152;
		}
		if ((local164 != 0 || local182 != 0) && local164 > -Static373.anInt6324 && local164 < Static373.anInt6324 && local182 > -Static291.anInt5062 && local182 < Static291.anInt5062) {
			@Pc(262) int local262;
			@Pc(264) int local264;
			if (local182 >= local164) {
				local262 = local164 * 65536 / local182;
				local264 = 32768;
				while (local142 != local152) {
					if (local142 < local152) {
						local142++;
					} else if (local152 < local142) {
						local142--;
					}
					if ((Static360.aByteArrayArrayArray16[Static276.anInt4606][local138][local142] & 0x4) != 0) {
						Static363.method5077(1, Static389.aClass227ArrayArrayArray3, local142, local138, false);
						return;
					}
					local264 += local262;
					if (local264 >= 65536) {
						local264 -= 65536;
						if (local138 < local147) {
							local138++;
						} else if (local138 > local147) {
							local138--;
						}
						if ((Static360.aByteArrayArrayArray16[Static276.anInt4606][local138][local142] & 0x4) != 0) {
							Static363.method5077(1, Static389.aClass227ArrayArrayArray3, local142, local138, false);
							return;
						}
					}
				}
				return;
			}
			local262 = local182 * 65536 / local164;
			local264 = 32768;
			while (local138 != local147) {
				if (local138 < local147) {
					local138++;
				} else if (local138 > local147) {
					local138--;
				}
				if ((Static360.aByteArrayArrayArray16[Static276.anInt4606][local138][local142] & 0x4) != 0) {
					Static363.method5077(1, Static389.aClass227ArrayArrayArray3, local142, local138, false);
					return;
				}
				local264 += local262;
				if (local264 >= 65536) {
					if (local152 > local142) {
						local142++;
					} else if (local152 < local142) {
						local142--;
					}
					local264 -= 65536;
					if ((Static360.aByteArrayArrayArray16[Static276.anInt4606][local138][local142] & 0x4) != 0) {
						Static363.method5077(1, Static389.aClass227ArrayArrayArray3, local142, local138, false);
						return;
					}
				}
			}
			return;
		}
		Static120.method1926("RC: " + local138 + "," + local142 + " " + local147 + "," + local152 + " " + Static59.anInt1127 + "," + Static49.anInt873, null);
		return;
	}
}
