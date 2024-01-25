import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_39 = new Class139(4);

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
	public static final int[] anIntArray372 = new int[2048];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
	public static boolean method2924() {
		return Static238.aClass171_4 != Static291.aClass171_5 || Static315.anInt5429 >= 2;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!oa;IILclient!ck;I)V")
	public static void method2926(@OriginalArg(0) Class28_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub5_Sub1 arg2, @OriginalArg(4) int arg3) {
		if ((arg3 & 0x40) != 0) {
			Static338.aByteArray81[arg1] = arg2.method2734();
		}
		@Pc(20) byte local20 = -1;
		@Pc(28) int local28;
		@Pc(39) int local39;
		@Pc(45) int local45;
		if ((arg3 & 0x200) != 0) {
			local28 = arg2.method2784();
			@Pc(31) int[] local31 = new int[local28];
			@Pc(34) int[] local34 = new int[local28];
			@Pc(37) int[] local37 = new int[local28];
			for (local39 = 0; local39 < local28; local39++) {
				local45 = arg2.method2787();
				if (local45 == 65535) {
					local45 = -1;
				}
				local31[local39] = local45;
				local34[local39] = arg2.method2739();
				local37[local39] = arg2.method2778();
			}
			Static236.method3896(local31, local34, local37, arg0);
		}
		if ((arg3 & 0x2000) != 0) {
			local28 = arg2.method2767();
			arg0.anInt4323 = arg2.method2773();
			arg0.anInt4348 = arg2.method2784();
			arg0.aBoolean338 = (local28 & 0x8000) != 0;
			arg0.anInt4330 = local28 & 0x7FFF;
			arg0.anInt4362 = arg0.anInt4323 + Static76.anInt1617 + arg0.anInt4330;
		}
		if ((arg3 & 0x2) != 0) {
			local28 = arg2.method2739();
			@Pc(146) byte[] local146 = new byte[local28];
			@Pc(151) Class3_Sub5 local151 = new Class3_Sub5(local146);
			arg2.method2744(local146, local28);
			Static192.aClass3_Sub5Array1[arg1] = local151;
			arg0.method4030(local151);
		}
		if ((arg3 & 0x800) != 0) {
			arg0.anInt4359 = arg2.method2776();
			arg0.anInt4319 = arg2.method2738();
			arg0.anInt4353 = arg2.method2776();
			arg0.anInt4342 = arg2.method2738();
			arg0.anInt4339 = arg2.method2778() + Static76.anInt1617;
			arg0.anInt4368 = arg2.method2747() + Static76.anInt1617;
			arg0.anInt4354 = arg2.method2739();
			arg0.anInt4375 = 0;
			if (arg0.aBoolean343) {
				arg0.anInt4342 += arg0.anInt4390;
				arg0.anInt4378 = 0;
				arg0.anInt4319 += arg0.anInt4390;
				arg0.anInt4353 += arg0.anInt4397;
				arg0.anInt4359 += arg0.anInt4397;
			} else {
				arg0.anInt4359 += arg0.anIntArray491[0];
				arg0.anInt4378 = 1;
				arg0.anInt4342 += arg0.anIntArray490[0];
				arg0.anInt4353 += arg0.anIntArray491[0];
				arg0.anInt4319 += arg0.anIntArray490[0];
			}
		}
		@Pc(306) int local306;
		@Pc(310) int local310;
		@Pc(313) int local313;
		if ((arg3 & 0x8) != 0) {
			local28 = arg2.method2778();
			local306 = arg2.method2784();
			local310 = arg2.method2735();
			local313 = arg2.anInt3121;
			@Pc(321) boolean local321 = (local28 & 0x8000) != 0;
			if (arg0.aString51 != null && arg0.aClass49_1 != null) {
				@Pc(329) boolean local329 = false;
				if (local306 <= 1) {
					if (!local321 && (Static246.aBoolean345 && !Static345.aBoolean446 || Static348.aBoolean347)) {
						local329 = true;
					} else if (Static185.method2922(arg0.aString51)) {
						local329 = true;
					}
				}
				if (!local329 && Static246.anInt4422 == 0) {
					Static102.aClass3_Sub5_5.anInt3121 = 0;
					arg2.method2744(Static102.aClass3_Sub5_5.aByteArray42, local310);
					Static102.aClass3_Sub5_5.anInt3121 = 0;
					@Pc(375) int local375 = -1;
					@Pc(394) String local394;
					if (local321) {
						local28 &= 0x7FFF;
						@Pc(385) Class216 local385 = Static364.method5428(Static102.aClass3_Sub5_5);
						local375 = local385.anInt5450;
						local394 = local385.aClass3_Sub7_Sub5_1.method1631(Static102.aClass3_Sub5_5);
					} else {
						local394 = Static256.method4150(Static91.method2651(Static102.aClass3_Sub5_5));
					}
					arg0.aString49 = local394.trim();
					arg0.anInt4346 = local28 & 0xFF;
					arg0.anInt4334 = local28 >> 8;
					arg0.anInt4318 = 150;
					@Pc(435) int local435;
					if (local306 == 1 || local306 == 2) {
						local435 = local321 ? 17 : 1;
					} else {
						local435 = local321 ? 17 : 2;
					}
					if (local306 == 2) {
						Static362.method5404("<img=1>" + arg0.method4020(), local435, null, "<img=1>" + arg0.method4031(), 0, local375, local394);
					} else if (local306 == 1) {
						Static362.method5404("<img=0>" + arg0.method4020(), local435, null, "<img=0>" + arg0.method4031(), 0, local375, local394);
					} else {
						Static362.method5404(arg0.method4020(), local435, null, arg0.method4031(), 0, local375, local394);
					}
				}
			}
			arg2.anInt3121 = local310 + local313;
		}
		if ((arg3 & 0x10) != 0) {
			local28 = arg2.method2750();
			local306 = arg2.method2784();
			arg0.method4004(Static76.anInt1617, local28, local306);
			arg0.anInt4369 = Static76.anInt1617 + 300;
			arg0.anInt4360 = arg2.method2773();
		}
		if ((arg3 & 0x1000) != 0) {
			local28 = arg2.method2767();
			if (local28 == 65535) {
				local28 = -1;
			}
			local306 = arg2.method2726();
			@Pc(583) boolean local583 = true;
			@Pc(667) Class177 local667;
			if (local28 != -1 && arg0.anInt4367 != -1) {
				@Pc(600) Class125 local600;
				if (arg0.anInt4367 == local28) {
					local600 = Static224.aClass203_2.method4559(local28);
					if (local600.aBoolean236 && local600.anInt3050 != -1) {
						@Pc(613) Class177 local613 = Static176.aClass43_2.method930(local600.anInt3050);
						local45 = local613.anInt4500;
						if (local45 == 0) {
							local583 = false;
						} else if (local45 == 1) {
							local583 = true;
						} else if (local45 == 2) {
							local583 = false;
							arg0.anInt4315 = 0;
						}
					}
				} else {
					local600 = Static224.aClass203_2.method4559(local28);
					@Pc(652) Class125 local652 = Static224.aClass203_2.method4559(arg0.anInt4367);
					if (local600.anInt3050 != -1 && local652.anInt3050 != -1) {
						local667 = Static176.aClass43_2.method930(local600.anInt3050);
						@Pc(673) Class177 local673 = Static176.aClass43_2.method930(local652.anInt3050);
						if (local667.anInt4520 < local673.anInt4520) {
							local583 = false;
						}
					}
				}
			}
			if (local583) {
				arg0.anInt4367 = local28;
				local313 = Static76.anInt1617;
				arg0.anInt4331 = local306 >> 16;
				arg0.anInt4361 = 0;
				arg0.anInt4341 = 1;
				arg0.anInt4329 = (local306 & 0xFFFF) + local313;
				arg0.anInt4351 = 0;
				if (arg0.anInt4329 > local313) {
					arg0.anInt4351 = -1;
				}
				if (arg0.anInt4367 != -1 && local313 == arg0.anInt4329) {
					local39 = Static224.aClass203_2.method4559(arg0.anInt4367).anInt3050;
					if (local39 != -1) {
						local667 = Static176.aClass43_2.method930(local39);
						if (local667 != null && local667.anIntArray499 != null) {
							Static351.method2911(arg0.aByte73, arg0.anInt5774, 0, local667, arg0.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0);
						}
					}
				}
			}
		}
		if ((arg3 & 0x400) != 0) {
			local20 = arg2.method2734();
		}
		if ((arg3 & 0x20) != 0) {
			arg0.anInt4380 = arg2.method2747();
			if (arg0.anInt4378 == 0) {
				arg0.method4010(arg0.anInt4380);
				arg0.anInt4380 = -1;
			}
		}
		if ((arg3 & 0x100) != 0) {
			arg0.aString49 = arg2.method2788();
			if (arg0.aString49.charAt(0) == '~') {
				arg0.aString49 = arg0.aString49.substring(1);
				Static24.method309(arg0.method4031(), arg0.aString49, arg0.method4020(), 0, 2);
			} else if (Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0) {
				Static24.method309(arg0.method4031(), arg0.aString49, arg0.method4020(), 0, 2);
			}
			arg0.anInt4318 = 150;
			arg0.anInt4346 = 0;
			arg0.anInt4334 = 0;
		}
		if ((arg3 & 0x1) != 0) {
			local28 = arg2.method2787();
			if (local28 == 65535) {
				local28 = -1;
			}
			arg0.anInt4347 = local28;
		}
		if ((arg3 & 0x80) != 0) {
			local28 = arg2.method2747();
			if (local28 == 65535) {
				local28 = -1;
			}
			local306 = arg2.method2735();
			Static140.method2226(arg0, local306, local28);
		}
		if ((arg3 & 0x4000) != 0) {
			local28 = Static76.anInt1617;
			local306 = arg2.method2750();
			local310 = arg2.method2773();
			arg0.method4004(local28, local306, local310);
		}
		if (!arg0.aBoolean343) {
			return;
		}
		if (local20 == 127) {
			arg0.method4023(arg0.anInt4390, arg0.anInt4397);
			return;
		}
		@Pc(953) byte local953;
		if (local20 == -1) {
			local953 = Static338.aByteArray81[arg1];
		} else {
			local953 = local20;
		}
		arg0.method4025(arg0.anInt4397, arg0.anInt4390, local953);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V")
	public static void method2929(@OriginalArg(0) int arg0) {
		Static264.method4215();
		Static245.method4026();
		Static290.method4521(true, arg0);
		Static277.method4348(Static347.aClass155_9, Static77.aClass20_19, Static368.aClass20_95);
		Static164.method2515(Static77.aClass20_19, Static347.aClass155_9);
		Static272.method4266(Static110.aClass110Array4);
		Static304.method2789();
		Static71.method1197();
		if (Static348.anInt4439 == 10) {
			Static275.method4304(false);
		} else if (Static348.anInt4439 == 30) {
			Static310.method4763(25);
		} else if (Static348.anInt4439 == 5) {
			Static32.method489(Static77.aClass20_19, Static347.aClass155_9);
		}
	}
}
