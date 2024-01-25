import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lclient!ida;")
	public static Class153 method1125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass153_3;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ks;II)V")
	public static void method1126(@OriginalArg(0) Class2_Sub15_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method4355(1) == 1;
		if (local15) {
			Static137.anIntArray168[Static572.anInt9306++] = arg1;
		}
		@Pc(30) int local30 = arg0.method4355(2);
		@Pc(34) Class6_Sub1_Sub1_Sub1_Sub2 local34 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local30 != 0) {
			@Pc(152) int local152;
			@Pc(157) int local157;
			@Pc(162) int local162;
			if (local30 == 1) {
				local152 = arg0.method4355(3);
				local157 = local34.anIntArray510[0];
				local162 = local34.anIntArray509[0];
				if (local152 == 0) {
					local162--;
					local157--;
				} else if (local152 == 1) {
					local162--;
				} else if (local152 == 2) {
					local157++;
					local162--;
				} else if (local152 == 3) {
					local157--;
				} else if (local152 == 4) {
					local157++;
				} else if (local152 == 5) {
					local157--;
					local162++;
				} else if (local152 == 6) {
					local162++;
				} else if (local152 == 7) {
					local157++;
					local162++;
				}
				if (local15) {
					local34.anInt7439 = local157;
					local34.anInt7445 = local162;
					local34.aBoolean574 = true;
				} else {
					local34.method6173(Static195.aByteArray43[arg1], local162, local157);
				}
			} else if (local30 == 2) {
				local152 = arg0.method4355(4);
				local157 = local34.anIntArray510[0];
				local162 = local34.anIntArray509[0];
				if (local152 == 0) {
					local157 -= 2;
					local162 -= 2;
				} else if (local152 == 1) {
					local157--;
					local162 -= 2;
				} else if (local152 == 2) {
					local162 -= 2;
				} else if (local152 == 3) {
					local157++;
					local162 -= 2;
				} else if (local152 == 4) {
					local157 += 2;
					local162 -= 2;
				} else if (local152 == 5) {
					local157 -= 2;
					local162--;
				} else if (local152 == 6) {
					local162--;
					local157 += 2;
				} else if (local152 == 7) {
					local157 -= 2;
				} else if (local152 == 8) {
					local157 += 2;
				} else if (local152 == 9) {
					local162++;
					local157 -= 2;
				} else if (local152 == 10) {
					local157 += 2;
					local162++;
				} else if (local152 == 11) {
					local157 -= 2;
					local162 += 2;
				} else if (local152 == 12) {
					local157--;
					local162 += 2;
				} else if (local152 == 13) {
					local162 += 2;
				} else if (local152 == 14) {
					local157++;
					local162 += 2;
				} else if (local152 == 15) {
					local157 += 2;
					local162 += 2;
				}
				if (local15) {
					local34.aBoolean574 = true;
					local34.anInt7439 = local157;
					local34.anInt7445 = local162;
				} else {
					local34.method6173(Static195.aByteArray43[arg1], local162, local157);
				}
			} else {
				local152 = arg0.method4355(1);
				@Pc(432) int local432;
				@Pc(440) int local440;
				@Pc(453) int local453;
				@Pc(460) int local460;
				if (local152 == 0) {
					local157 = arg0.method4355(12);
					local162 = local157 >> 10;
					local432 = local157 >> 5 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local440 = local157 & 0x1F;
					if (local440 > 15) {
						local440 -= 32;
					}
					local453 = local432 + local34.anIntArray510[0];
					local460 = local440 + local34.anIntArray509[0];
					if (local15) {
						local34.aBoolean574 = true;
						local34.anInt7445 = local460;
						local34.anInt7439 = local453;
					} else {
						local34.method6173(Static195.aByteArray43[arg1], local460, local453);
					}
					local34.aByte112 = local34.aByte111 = (byte) (local34.aByte112 + local162 & 0x3);
					if (Static551.method7475(local460, local453)) {
						local34.aByte111++;
					}
					if (arg1 == Static222.anInt4184) {
						Static566.anInt9278 = local34.aByte112;
					}
				} else {
					local157 = arg0.method4355(30);
					local162 = local157 >> 28;
					local432 = local157 >> 14 & 0x3FFF;
					local440 = local157 & 0x3FFF;
					local453 = (local34.anIntArray510[0] + Static35.anInt906 + local432 & 0x3FFF) - Static35.anInt906;
					local460 = (Static130.anInt5246 + local34.anIntArray509[0] + local440 & 0x3FFF) - Static130.anInt5246;
					if (local15) {
						local34.anInt7445 = local460;
						local34.anInt7439 = local453;
						local34.aBoolean574 = true;
					} else {
						local34.method6173(Static195.aByteArray43[arg1], local460, local453);
					}
					local34.aByte112 = local34.aByte111 = (byte) (local162 + local34.aByte112 & 0x3);
					if (Static551.method7475(local460, local453)) {
						local34.aByte111++;
					}
					if (arg1 == Static222.anInt4184) {
						Static566.anInt9278 = local34.aByte112;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean574 = false;
		} else if (Static222.anInt4184 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(62) Class274 local62 = Static119.aClass274Array1[arg1] = new Class274();
			local62.anInt7769 = (Static35.anInt906 + local34.anIntArray510[0] >> 6 << 14) + ((local34.aByte112 << 28) + (Static130.anInt5246 + local34.anIntArray509[0] >> 6));
			if (local34.anInt7434 == -1) {
				local62.anInt7766 = local34.aClass186_7.method4106();
			} else {
				local62.anInt7766 = local34.anInt7434;
			}
			local62.anInt7767 = local34.anInt7339;
			local62.aBoolean614 = local34.aBoolean575;
			if (local34.anInt7450 > 0) {
				Static255.method3969(local34);
			}
			Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method4355(1) != 0) {
				Static456.method6472(arg0, arg1);
			}
		}
	}
}
