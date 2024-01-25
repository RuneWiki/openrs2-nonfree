import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "B")
	public static byte aByte40;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([[BILclient!m;)V")
	public static void method1742(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class193_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt4861; local18++) {
			Static11.method182();
			for (@Pc(24) int local24 = 0; local24 < Static301.anInt4912 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static473.anInt7969 >> 3; local28++) {
					@Pc(38) int local38 = Static127.anIntArrayArrayArray9[local18][local24][local28];
					if (local38 != -1) {
						@Pc(48) int local48 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean293 || local48 == 0) {
							@Pc(59) int local59 = local38 >> 1 & 0x3;
							@Pc(65) int local65 = local38 >> 14 & 0x3FF;
							@Pc(71) int local71 = local38 >> 3 & 0x7FF;
							@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
							for (@Pc(83) int local83 = 0; local83 < Static35.anIntArray45.length; local83++) {
								if (Static35.anIntArray45[local83] == local81 && arg0[local83] != null) {
									@Pc(105) Class6_Sub14 local105 = new Class6_Sub14(arg0[local83]);
									arg1.method4174(local24 * 8, local65, local105, local71, local18, local59, Static296.aClass295Array3, local48, local28 * 8);
									arg1.method4193(local65, local18, local16[0] == -1 ? local16 : null, local28 * 8, Static176.aClass121_5, local24 * 8, local105, local48, local59, local71);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static285.aClass89_1 = Static316.aClass141_1.method3011(local16[2], local16[0], Static264.aClass124_1, local16[1], local16[3]);
			Static209.anInt3617 = local16[4];
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)Z")
	public static boolean method1743() {
		return Static374.anInt6451 > 0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!qe;I)V")
	public static void method1745(@OriginalArg(1) Class6_Sub14_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method6052(1) == 1;
		if (local15) {
			Static451.anIntArray617[Static480.anInt8070++] = arg1;
		}
		@Pc(30) int local30 = arg0.method6052(2);
		@Pc(34) Class29_Sub2_Sub1_Sub2 local34 = Static346.aClass29_Sub2_Sub1_Sub2Array1[arg1];
		if (local30 != 0) {
			@Pc(154) int local154;
			@Pc(159) int local159;
			@Pc(164) int local164;
			if (local30 == 1) {
				local154 = arg0.method6052(3);
				local159 = local34.anIntArray661[0];
				local164 = local34.anIntArray660[0];
				if (local154 == 0) {
					local159--;
					local164--;
				} else if (local154 == 1) {
					local164--;
				} else if (local154 == 2) {
					local159++;
					local164--;
				} else if (local154 == 3) {
					local159--;
				} else if (local154 == 4) {
					local159++;
				} else if (local154 == 5) {
					local164++;
					local159--;
				} else if (local154 == 6) {
					local164++;
				} else if (local154 == 7) {
					local164++;
					local159++;
				}
				if (local15) {
					local34.anInt8612 = local159;
					local34.anInt8593 = local164;
					local34.aBoolean603 = true;
				} else {
					local34.method7023(Static556.aByteArray122[arg1], local159, local164);
				}
			} else if (local30 == 2) {
				local154 = arg0.method6052(4);
				local159 = local34.anIntArray661[0];
				local164 = local34.anIntArray660[0];
				if (local154 == 0) {
					local159 -= 2;
					local164 -= 2;
				} else if (local154 == 1) {
					local159--;
					local164 -= 2;
				} else if (local154 == 2) {
					local164 -= 2;
				} else if (local154 == 3) {
					local159++;
					local164 -= 2;
				} else if (local154 == 4) {
					local164 -= 2;
					local159 += 2;
				} else if (local154 == 5) {
					local164--;
					local159 -= 2;
				} else if (local154 == 6) {
					local164--;
					local159 += 2;
				} else if (local154 == 7) {
					local159 -= 2;
				} else if (local154 == 8) {
					local159 += 2;
				} else if (local154 == 9) {
					local159 -= 2;
					local164++;
				} else if (local154 == 10) {
					local164++;
					local159 += 2;
				} else if (local154 == 11) {
					local159 -= 2;
					local164 += 2;
				} else if (local154 == 12) {
					local159--;
					local164 += 2;
				} else if (local154 == 13) {
					local164 += 2;
				} else if (local154 == 14) {
					local164 += 2;
					local159++;
				} else if (local154 == 15) {
					local164 += 2;
					local159 += 2;
				}
				if (local15) {
					local34.aBoolean603 = true;
					local34.anInt8593 = local164;
					local34.anInt8612 = local159;
				} else {
					local34.method7023(Static556.aByteArray122[arg1], local159, local164);
				}
			} else {
				local154 = arg0.method6052(1);
				@Pc(417) int local417;
				@Pc(427) int local427;
				@Pc(440) int local440;
				@Pc(448) int local448;
				if (local154 == 0) {
					local159 = arg0.method6052(12);
					local164 = local159 >> 10;
					local417 = local159 >> 5 & 0x1F;
					if (local417 > 15) {
						local417 -= 32;
					}
					local427 = local159 & 0x1F;
					if (local427 > 15) {
						local427 -= 32;
					}
					local440 = local417 + local34.anIntArray661[0];
					local448 = local34.anIntArray660[0] + local427;
					if (local15) {
						local34.anInt8612 = local440;
						local34.aBoolean603 = true;
						local34.anInt8593 = local448;
					} else {
						local34.method7023(Static556.aByteArray122[arg1], local440, local448);
					}
					local34.aByte103 = (byte) (local34.aByte103 + local164 & 0x3);
					if (arg1 == Static44.anInt711) {
						Static282.anInt4677 = local34.aByte103;
					}
				} else {
					local159 = arg0.method6052(30);
					local164 = local159 >> 28;
					local417 = local159 >> 14 & 0x3FFF;
					local427 = local159 & 0x3FFF;
					local440 = (local417 + local34.anIntArray661[0] + Static218.anInt3718 & 0x3FFF) - Static218.anInt3718;
					local448 = (local427 + Static167.anInt3048 + local34.anIntArray660[0] & 0x3FFF) - Static167.anInt3048;
					if (local15) {
						local34.aBoolean603 = true;
						local34.anInt8593 = local448;
						local34.anInt8612 = local440;
					} else {
						local34.method7023(Static556.aByteArray122[arg1], local440, local448);
					}
					local34.aByte103 = (byte) (local34.aByte103 + local164 & 0x3);
					if (Static44.anInt711 == arg1) {
						Static282.anInt4677 = local34.aByte103;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean603 = false;
		} else if (arg1 == Static44.anInt711) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(65) Class47 local65 = Static560.aClass47Array4[arg1] = new Class47();
			local65.anInt933 = (local34.aByte103 << 28) + (local34.anIntArray661[0] + Static218.anInt3718 >> 6 << 14) + (Static167.anInt3048 - -local34.anIntArray660[0] >> 6);
			if (local34.anInt8601 == -1) {
				local65.anInt936 = local34.aClass293_7.method6528();
			} else {
				local65.anInt936 = local34.anInt8601;
			}
			local65.aBoolean48 = local34.aBoolean601;
			local65.anInt934 = local34.anInt8513;
			if (local34.anInt8619 > 0) {
				Static534.method7435(local34);
			}
			Static346.aClass29_Sub2_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method6052(1) != 0) {
				Static525.method7355(arg1, arg0);
			}
		}
	}
}
