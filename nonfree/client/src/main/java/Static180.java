import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(JJ)J")
	public static long method3527(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!kj;)V")
	public static void method3528(@OriginalArg(1) Class1_Sub17_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4510();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static207.anInt4085; local12++) {
			local18 = Static209.anIntArray327[local12];
			if ((Static165.aByteArray46[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static165.aByteArray46[local18] = (byte) (Static165.aByteArray46[local18] | 0x2);
				} else {
					local46 = arg0.method4517(1);
					if (local46 == 0) {
						local7 = Static104.method8230(arg0);
						Static165.aByteArray46[local18] = (byte) (Static165.aByteArray46[local18] | 0x2);
					} else {
						Static137.method2603(arg0, local18);
					}
				}
			}
		}
		arg0.method4518();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4510();
		@Pc(128) int local128;
		for (local18 = 0; local18 < Static207.anInt4085; local18++) {
			local46 = Static209.anIntArray327[local18];
			if ((Static165.aByteArray46[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static165.aByteArray46[local46] = (byte) (Static165.aByteArray46[local46] | 0x2);
					local7--;
				} else {
					local128 = arg0.method4517(1);
					if (local128 == 0) {
						local7 = Static104.method8230(arg0);
						Static165.aByteArray46[local46] = (byte) (Static165.aByteArray46[local46] | 0x2);
					} else {
						Static137.method2603(arg0, local46);
					}
				}
			}
		}
		arg0.method4518();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4510();
		@Pc(206) int local206;
		for (local46 = 0; local46 < Static262.anInt5082; local46++) {
			local128 = Static297.anIntArray451[local46];
			if ((Static165.aByteArray46[local128] & 0x1) != 0) {
				if (local7 > 0) {
					Static165.aByteArray46[local128] = (byte) (Static165.aByteArray46[local128] | 0x2);
					local7--;
				} else {
					local206 = arg0.method4517(1);
					if (local206 == 0) {
						local7 = Static104.method8230(arg0);
						Static165.aByteArray46[local128] = (byte) (Static165.aByteArray46[local128] | 0x2);
					} else if (Static538.method8164(arg0, local128)) {
						Static165.aByteArray46[local128] = (byte) (Static165.aByteArray46[local128] | 0x2);
					}
				}
			}
		}
		arg0.method4518();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4510();
		for (local128 = 0; local128 < Static262.anInt5082; local128++) {
			local206 = Static297.anIntArray451[local128];
			if ((Static165.aByteArray46[local206] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static165.aByteArray46[local206] = (byte) (Static165.aByteArray46[local206] | 0x2);
				} else {
					@Pc(293) int local293 = arg0.method4517(1);
					if (local293 == 0) {
						local7 = Static104.method8230(arg0);
						Static165.aByteArray46[local206] = (byte) (Static165.aByteArray46[local206] | 0x2);
					} else if (Static538.method8164(arg0, local206)) {
						Static165.aByteArray46[local206] = (byte) (Static165.aByteArray46[local206] | 0x2);
					}
				}
			}
		}
		arg0.method4518();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static262.anInt5082 = 0;
		Static207.anInt4085 = 0;
		for (local206 = 1; local206 < 2048; local206++) {
			Static165.aByteArray46[local206] = (byte) (Static165.aByteArray46[local206] >> 1);
			@Pc(364) Class20_Sub1_Sub1_Sub1 local364 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local206];
			if (local364 == null) {
				Static297.anIntArray451[Static262.anInt5082++] = local206;
			} else {
				Static209.anIntArray327[Static207.anInt4085++] = local206;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public static void method3529() {
		if (Static261.anInt5069 == -1 || Static76.anInt1815 == -1) {
			return;
		}
		@Pc(24) int local24 = Static543.anInt9603 + (Static333.anInt6232 * (Static375.anInt8464 - Static543.anInt9603) >> 16);
		Static333.anInt6232 += local24;
		if (Static333.anInt6232 >= 65535) {
			Static333.anInt6232 = 65535;
			if (Static34.aBoolean93) {
				Static274.aBoolean392 = false;
			} else {
				Static274.aBoolean392 = true;
			}
			Static34.aBoolean93 = true;
		} else {
			Static34.aBoolean93 = false;
			Static274.aBoolean392 = false;
		}
		@Pc(56) float local56 = (float) Static333.anInt6232 / 65535.0F;
		@Pc(63) float[] local63 = new float[3];
		@Pc(67) int local67 = Static523.anInt9228 * 2;
		@Pc(93) int local93;
		@Pc(126) int local126;
		@Pc(134) int local134;
		@Pc(139) int local139;
		@Pc(149) int local149;
		@Pc(167) int local167;
		for (@Pc(69) int local69 = 0; local69 < 3; local69++) {
			@Pc(81) int local81 = Static26.anIntArrayArrayArray7[Static261.anInt5069][local67][local69] * 3;
			local93 = Static26.anIntArrayArrayArray7[Static261.anInt5069][local67 + 1][local69] * 3;
			local126 = (Static26.anIntArrayArrayArray7[Static261.anInt5069][local67 + 2][local69] + Static26.anIntArrayArrayArray7[Static261.anInt5069][local67 + 2][local69] - Static26.anIntArrayArrayArray7[Static261.anInt5069][local67 + 3][local69]) * 3;
			local134 = Static26.anIntArrayArrayArray7[Static261.anInt5069][local67][local69];
			local139 = local93 - local81;
			local149 = local81 + local126 - local93 * 2;
			local167 = Static26.anIntArrayArrayArray7[Static261.anInt5069][local67 + 2][local69] + local93 - local126 - local134;
			local63[local69] = (float) local134 + local56 * ((float) local139 + ((float) local167 * local56 + (float) local149) * local56);
		}
		Static321.anInt6064 = (int) local63[0] - Static538.anInt9485 * 128;
		Static276.anInt8653 = (int) local63[1] * -1;
		Static46.anInt1256 = (int) local63[2] - Static282.anInt5380 * 128;
		@Pc(222) float[] local222 = new float[3];
		local93 = Static150.anInt2984 * 2;
		for (local126 = 0; local126 < 3; local126++) {
			local134 = Static26.anIntArrayArrayArray7[Static76.anInt1815][local93][local126] * 3;
			local139 = Static26.anIntArrayArrayArray7[Static76.anInt1815][local93 + 1][local126] * 3;
			local149 = (Static26.anIntArrayArrayArray7[Static76.anInt1815][local93 + 2][local126] + Static26.anIntArrayArrayArray7[Static76.anInt1815][local93 + 2][local126] - Static26.anIntArrayArrayArray7[Static76.anInt1815][local93 + 3][local126]) * 3;
			local167 = Static26.anIntArrayArrayArray7[Static76.anInt1815][local93][local126];
			@Pc(299) int local299 = local139 - local134;
			@Pc(309) int local309 = local134 + local149 - local139 * 2;
			@Pc(327) int local327 = Static26.anIntArrayArrayArray7[Static76.anInt1815][local93 + 2][local126] + local139 - local149 - local167;
			local222[local126] = ((float) local299 + ((float) local309 + (float) local327 * local56) * local56) * local56 + (float) local167;
		}
		@Pc(362) float local362 = local222[0] - local63[0];
		@Pc(373) float local373 = (local222[1] - local63[1]) * -1.0F;
		@Pc(382) float local382 = local222[2] - local63[2];
		@Pc(392) double local392 = Math.sqrt((double) (local362 * local362 + local382 * local382));
		Static536.anInt9434 = (int) (Math.atan2((double) local373, local392) * 2607.5945876176133D) & 0x3FFF;
		Static469.anInt8096 = (int) (-Math.atan2((double) local362, (double) local382) * 2607.5945876176133D) & 0x3FFF;
		Static505.anInt6155 = Static26.anIntArrayArrayArray7[Static261.anInt5069][local67][3] + ((Static26.anIntArrayArrayArray7[Static261.anInt5069][local67 + 2][3] - Static26.anIntArrayArrayArray7[Static261.anInt5069][local67][3]) * Static333.anInt6232 >> 16);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	public static void method3530(@OriginalArg(0) int arg0) {
		Static225.anInt4353 = arg0;
		Static461.aClass277_67.method7019();
	}
}
