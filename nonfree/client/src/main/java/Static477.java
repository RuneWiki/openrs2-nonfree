import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
	public static int anInt8336;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "Lclient!br;")
	public static Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
	public static int anInt8337 = -1;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
	public static void method6995() {
		if (Static713.aClass3_Sub55_31.aClass15_Sub7_2.method2473() != 2) {
			return;
		}
		@Pc(22) byte local22 = (byte) (Static220.anInt4252 - 4 & 0xFF);
		@Pc(26) int local26 = Static220.anInt4252 % Static362.anInt8653;
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			for (local34 = 0; local34 < Static206.anInt11291; local34++) {
				Static221.aByteArrayArrayArray15[local28][local26][local34] = local22;
			}
		}
		if (127 <= 114) {
			aClass37_1 = null;
		}
		if (Static712.anInt11117 == 3) {
			return;
		}
		for (local34 = 0; local34 < 2; local34++) {
			Static287.anIntArray305[local34] = -1000000;
			Static167.anIntArray153[local34] = 1000000;
			Static228.anIntArray503[local34] = 0;
			Static603.anIntArray546[local34] = 1000000;
			Static482.anIntArray460[local34] = 0;
		}
		@Pc(113) int local113 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204;
		@Pc(116) int local116 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211;
		@Pc(175) int local175;
		if (Static175.anInt10579 != 1 && Static283.anInt5140 == -1) {
			local175 = Static505.method7237(Static712.anInt11117, Static235.anInt4471, Static173.anInt3144);
			if (local175 - Static376.anInt6408 < 3200 && (Static6.aByteArrayArrayArray1[Static712.anInt11117][Static173.anInt3144 >> 9][Static235.anInt4471 >> 9] & 0x4) != 0) {
				Static472.method6962(Static235.anInt4471 >> 9, false, Static584.aClass262ArrayArrayArray2, 1, Static173.anInt3144 >> 9);
				return;
			}
			return;
		}
		if (Static175.anInt10579 != 1) {
			local116 = Static573.anInt9429;
			local113 = Static283.anInt5140;
		}
		if ((Static6.aByteArrayArrayArray1[Static712.anInt11117][local113 >> 9][local116 >> 9] & 0x4) != 0) {
			Static472.method6962(local116 >> 9, false, Static584.aClass262ArrayArrayArray2, 0, local113 >> 9);
		}
		if (Static228.anInt9136 >= 2560) {
			return;
		}
		local175 = Static173.anInt3144 >> 9;
		@Pc(179) int local179 = Static235.anInt4471 >> 9;
		@Pc(183) int local183 = local113 >> 9;
		@Pc(187) int local187 = local116 >> 9;
		@Pc(195) int local195;
		if (local183 > local175) {
			local195 = local183 - local175;
		} else {
			local195 = local175 - local183;
		}
		@Pc(210) int local210;
		if (local179 < local187) {
			local210 = local187 - local179;
		} else {
			local210 = local179 - local187;
		}
		if ((local195 != 0 || local210 != 0) && -Static362.anInt8653 < local195 && Static362.anInt8653 > local195 && -Static206.anInt11291 < local210 && Static206.anInt11291 > local210) {
			@Pc(306) int local306;
			@Pc(308) int local308;
			if (local210 >= local195) {
				local306 = local195 * 65536 / local210;
				local308 = 32768;
				while (local187 != local179) {
					if (local187 > local179) {
						local179++;
					} else if (local187 < local179) {
						local179--;
					}
					if ((Static6.aByteArrayArrayArray1[Static712.anInt11117][local175][local179] & 0x4) != 0) {
						Static472.method6962(local179, false, Static584.aClass262ArrayArrayArray2, 1, local175);
						return;
					}
					local308 += local306;
					if (local308 >= 65536) {
						local308 -= 65536;
						if (local175 < local183) {
							local175++;
						} else if (local175 > local183) {
							local175--;
						}
						if ((Static6.aByteArrayArrayArray1[Static712.anInt11117][local175][local179] & 0x4) != 0) {
							Static472.method6962(local179, false, Static584.aClass262ArrayArrayArray2, 1, local175);
							return;
						}
					}
				}
				return;
			}
			local306 = local210 * 65536 / local195;
			local308 = 32768;
			while (local183 != local175) {
				if (local183 > local175) {
					local175++;
				} else if (local183 < local175) {
					local175--;
				}
				if ((Static6.aByteArrayArrayArray1[Static712.anInt11117][local175][local179] & 0x4) != 0) {
					Static472.method6962(local179, false, Static584.aClass262ArrayArrayArray2, 1, local175);
					return;
				}
				local308 += local306;
				if (local308 >= 65536) {
					if (local187 > local179) {
						local179++;
					} else if (local187 < local179) {
						local179--;
					}
					local308 -= 65536;
					if ((Static6.aByteArrayArrayArray1[Static712.anInt11117][local175][local179] & 0x4) != 0) {
						Static472.method6962(local179, false, Static584.aClass262ArrayArrayArray2, 1, local175);
						return;
					}
				}
			}
			return;
		}
		Static64.method799("RC: " + local175 + "," + local179 + " " + local183 + "," + local187 + " " + Static714.anInt11156 + "," + Static339.anInt5859, (Throwable) null);
		return;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIB)V")
	public static void method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static654.aFloat160 < Static654.aFloat159) {
			Static654.aFloat160 = (float) ((double) Static654.aFloat160 + (double) Static654.aFloat160 / 30.0D);
			if (Static654.aFloat159 < Static654.aFloat160) {
				Static654.aFloat160 = Static654.aFloat159;
			}
			Static276.method4222(0);
			Static654.anInt8142 = (int) Static654.aFloat160 >> 1;
			Static654.aByteArrayArrayArray18 = Static4.method42(Static654.anInt8142);
		} else if (Static654.aFloat160 > Static654.aFloat159) {
			Static654.aFloat160 = (float) ((double) Static654.aFloat160 - (double) Static654.aFloat160 / 30.0D);
			if (Static654.aFloat159 > Static654.aFloat160) {
				Static654.aFloat160 = Static654.aFloat159;
			}
			Static276.method4222(0);
			Static654.anInt8142 = (int) Static654.aFloat160 >> 1;
			Static654.aByteArrayArrayArray18 = Static4.method42(Static654.anInt8142);
		}
		if (Static332.anInt5824 != -1 && Static407.anInt7261 != -1) {
			@Pc(92) int local92 = Static332.anInt5824 - Static481.anInt8380;
			if (local92 < 2 || local92 > 2) {
				local92 /= 8;
			}
			@Pc(109) int local109 = Static407.anInt7261 - Static442.anInt10084;
			if (local109 < 2 || local109 > 2) {
				local109 /= 8;
			}
			Static481.anInt8380 -= -local92;
			Static442.anInt10084 += local109;
			if (local92 == 0 && local109 == 0) {
				Static407.anInt7261 = -1;
				Static332.anInt5824 = -1;
			}
			Static276.method4222(0);
		}
		if (Static148.anInt2790 <= 0) {
			Static143.anInt2734 = -1;
			Static541.anInt6223 = -1;
		} else {
			Static608.anInt9862--;
			if (Static608.anInt9862 == 0) {
				Static148.anInt2790--;
				Static608.anInt9862 = 100;
			}
		}
		if (!Static615.aBoolean725 || Static335.aClass357_28 == null) {
			return;
		}
		for (@Pc(198) Class3_Sub45 local198 = (Class3_Sub45) Static335.aClass357_28.method8391(); local198 != null; local198 = (Class3_Sub45) Static335.aClass357_28.method8392()) {
			@Pc(207) Class105 local207 = Static654.aClass98_4.method2452(local198.aClass3_Sub12_1.anInt950);
			if (local198.method7250(arg0, arg1)) {
				if (local207.aStringArray10 != null) {
					if (local207.aStringArray10[4] != null) {
						Static91.method1249(-1, local207.aStringArray10[4], (long) local198.aClass3_Sub12_1.anInt950, (long) local198.aClass3_Sub12_1.anInt950, 1009, 0, false, false, local207.anInt3089, local207.aString58, true, -1);
					}
					if (local207.aStringArray10[3] != null) {
						Static91.method1249(-1, local207.aStringArray10[3], (long) local198.aClass3_Sub12_1.anInt950, (long) local198.aClass3_Sub12_1.anInt950, 1002, 0, false, false, local207.anInt3089, local207.aString58, true, -1);
					}
					if (local207.aStringArray10[2] != null) {
						Static91.method1249(-1, local207.aStringArray10[2], (long) local198.aClass3_Sub12_1.anInt950, (long) local198.aClass3_Sub12_1.anInt950, 1008, 0, false, false, local207.anInt3089, local207.aString58, true, -1);
					}
					if (local207.aStringArray10[1] != null) {
						Static91.method1249(-1, local207.aStringArray10[1], (long) local198.aClass3_Sub12_1.anInt950, (long) local198.aClass3_Sub12_1.anInt950, 1003, 0, false, false, local207.anInt3089, local207.aString58, true, -1);
					}
					if (local207.aStringArray10[0] != null) {
						Static91.method1249(-1, local207.aStringArray10[0], (long) local198.aClass3_Sub12_1.anInt950, (long) local198.aClass3_Sub12_1.anInt950, 1010, 0, false, false, local207.anInt3089, local207.aString58, true, -1);
					}
				}
				if (!local198.aClass3_Sub12_1.aBoolean76) {
					local198.aClass3_Sub12_1.aBoolean76 = true;
					Static185.method2825(Static317.aClass258_11, local198.aClass3_Sub12_1.anInt950, local207.anInt3089);
				}
				if (local198.aClass3_Sub12_1.aBoolean76) {
					Static185.method2825(Static233.aClass258_8, local198.aClass3_Sub12_1.anInt950, local207.anInt3089);
				}
			} else if (local198.aClass3_Sub12_1.aBoolean76) {
				local198.aClass3_Sub12_1.aBoolean76 = false;
				Static185.method2825(Static165.aClass258_4, local198.aClass3_Sub12_1.anInt950, local207.anInt3089);
			}
		}
	}
}
