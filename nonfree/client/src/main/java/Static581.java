import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Lclient!kd;")
	public static Class6 aClass6_36;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
	public static int anInt9556;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "[I")
	public static final int[] anIntArray664 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_41 = new Class222(4);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[FII[FFIFIII)V")
	public static void method8032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg6 - arg1;
		@Pc(9) int local9 = arg9 - arg10;
		@Pc(13) int local13 = arg8 - arg3;
		@Pc(38) float local38 = (float) local9 * arg2[0] + arg2[1] * (float) local13 + (float) local5 * arg2[2];
		@Pc(59) float local59 = arg2[4] * (float) local13 + (float) local9 * arg2[3] + (float) local5 * arg2[5];
		@Pc(80) float local80 = (float) local5 * arg2[8] + arg2[7] * (float) local13 + (float) local9 * arg2[6];
		@Pc(107) float local107 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local107 *= arg5;
		}
		@Pc(121) float local121 = local59 + arg7 + 0.5F;
		@Pc(126) float local126;
		if (arg0 == 1) {
			local126 = local107;
			local107 = -local121;
			local121 = local126;
		} else if (arg0 == 2) {
			local121 = -local121;
			local107 = -local107;
		} else if (arg0 == 3) {
			local126 = local107;
			local107 = local121;
			local121 = -local126;
		}
		arg4[1] = local121;
		arg4[0] = local107;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z")
	public static boolean method8033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static228.method3854(arg1, arg0) || Static336.method5206(arg0, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	public static void method8035() {
		if (Static404.aClass2_Sub13_2.aClass33_Sub10_1.method4036() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static143.anInt3169 - 4 & 0xFF);
		@Pc(23) int local23 = Static143.anInt3169 % Static3.anInt46;
		@Pc(28) int local28;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local28 = 0; local28 < Static270.anInt5194; local28++) {
				Static198.aByteArrayArrayArray8[local25][local23][local28] = local19;
			}
		}
		if (Static16.anInt308 == 3) {
			return;
		}
		for (local28 = 0; local28 < 2; local28++) {
			Static118.anIntArray207[local28] = -1000000;
			Static386.anIntArray467[local28] = 1000000;
			Static498.anIntArray582[local28] = 0;
			Static382.anIntArray457[local28] = 1000000;
			Static611.anIntArray695[local28] = 0;
		}
		@Pc(87) int local87 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925;
		@Pc(90) int local90 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929;
		@Pc(147) int local147;
		if (Static2.anInt31 != 1 && Static23.anInt718 == -1) {
			local147 = Static582.method8038(Static16.anInt308, Static53.anInt1153, Static395.anInt3530);
			if (local147 - Static64.anInt1371 < 3200 && (Static244.aByteArrayArrayArray9[Static16.anInt308][Static53.anInt1153 >> 9][Static395.anInt3530 >> 9] & 0x4) != 0) {
				Static185.method3330(false, Static440.aClass217ArrayArrayArray3, Static395.anInt3530 >> 9, Static53.anInt1153 >> 9, 1);
				return;
			}
			return;
		}
		if (Static2.anInt31 != 1) {
			local90 = Static644.anInt10296;
			local87 = Static23.anInt718;
		}
		if ((Static244.aByteArrayArrayArray9[Static16.anInt308][local87 >> 9][local90 >> 9] & 0x4) != 0) {
			Static185.method3330(false, Static440.aClass217ArrayArrayArray3, local90 >> 9, local87 >> 9, 0);
		}
		if (Static512.anInt8589 >= 2560) {
			return;
		}
		local147 = Static53.anInt1153 >> 9;
		@Pc(151) int local151 = Static395.anInt3530 >> 9;
		@Pc(155) int local155 = local87 >> 9;
		@Pc(159) int local159 = local90 >> 9;
		@Pc(171) int local171;
		if (local147 >= local155) {
			local171 = local147 - local155;
		} else {
			local171 = local155 - local147;
		}
		@Pc(184) int local184;
		if (local159 > local151) {
			local184 = local159 - local151;
		} else {
			local184 = local151 - local159;
		}
		if ((local171 != 0 || local184 != 0) && local171 > (-Static3.anInt46) && local171 < Static3.anInt46 && -Static270.anInt5194 < local184 && local184 < Static270.anInt5194) {
			@Pc(262) int local262;
			@Pc(264) int local264;
			if (local171 > local184) {
				local262 = local184 * 65536 / local171;
				local264 = 32768;
				while (local147 != local155) {
					if (local155 > local147) {
						local147++;
					} else if (local155 < local147) {
						local147--;
					}
					if ((Static244.aByteArrayArrayArray9[Static16.anInt308][local147][local151] & 0x4) != 0) {
						Static185.method3330(false, Static440.aClass217ArrayArrayArray3, local151, local147, 1);
						return;
					}
					local264 += local262;
					if (local264 >= 65536) {
						if (local151 < local159) {
							local151++;
						} else if (local151 > local159) {
							local151--;
						}
						local264 -= 65536;
						if ((Static244.aByteArrayArrayArray9[Static16.anInt308][local147][local151] & 0x4) != 0) {
							Static185.method3330(false, Static440.aClass217ArrayArrayArray3, local151, local147, 1);
							return;
						}
					}
				}
				return;
			}
			local262 = local171 * 65536 / local184;
			local264 = 32768;
			while (local159 != local151) {
				if (local151 < local159) {
					local151++;
				} else if (local151 > local159) {
					local151--;
				}
				if ((Static244.aByteArrayArrayArray9[Static16.anInt308][local147][local151] & 0x4) != 0) {
					Static185.method3330(false, Static440.aClass217ArrayArrayArray3, local151, local147, 1);
					return;
				}
				local264 += local262;
				if (local264 >= 65536) {
					if (local155 > local147) {
						local147++;
					} else if (local147 > local155) {
						local147--;
					}
					local264 -= 65536;
					if ((Static244.aByteArrayArrayArray9[Static16.anInt308][local147][local151] & 0x4) != 0) {
						Static185.method3330(false, Static440.aClass217ArrayArrayArray3, local151, local147, 1);
						return;
					}
				}
			}
			return;
		}
		Static420.method6396("RC: " + local147 + "," + local151 + " " + local155 + "," + local159 + " " + Static451.anInt7933 + "," + Static470.anInt8063, null);
		return;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method8036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class61 local13 = local7.aClass61_2; local13 != null; local13 = local13.aClass61_1) {
			@Pc(17) Class11_Sub1_Sub1 local17 = local13.aClass11_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort95 == arg1 && local17.aShort97 == arg2) {
				Static515.method7242(local17, false);
				return;
			}
		}
	}
}
