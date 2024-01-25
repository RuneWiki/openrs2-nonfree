import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)V")
	public static void method5204(@OriginalArg(1) boolean arg0) {
		Static194.method5131(Static277.anInt5201, Static483.anInt8181, arg0, Static654.anInt10064);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLclient!ha;II)Lclient!fha;")
	public static Class122 method5205(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static438.anIntArray459 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static438.anIntArray459.length; local14++) {
				if (arg2 == Static438.anIntArray459[local14]) {
					return Static49.aClass122Array1[local14];
				}
			}
		}
		@Pc(37) Class122 local37 = (Class122) Static416.aClass279_38.method6631((long) arg2);
		if (local37 != null) {
			if (arg0 && local37.aClass202_4 == null) {
				@Pc(54) Class202 local54 = Static199.method8735(arg2, Static114.aClass143_26);
				if (local54 == null) {
					return null;
				}
				local37.aClass202_4 = local54;
			}
			return local37;
		}
		@Pc(67) Class150[] local67 = Static683.method3281(Static647.aClass143_143, arg2);
		if (local67 == null) {
			return null;
		}
		@Pc(76) Class202 local76 = Static199.method8735(arg2, Static114.aClass143_26);
		if (local76 == null) {
			return null;
		}
		if (arg0) {
			local37 = new Class122(arg1.method8117(local76, local67), local76);
		} else {
			local37 = new Class122(arg1.method8117(local76, local67));
		}
		Static416.aClass279_38.method6635(local37, (long) arg2);
		return local37;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!lb;III)V")
	public static void method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub32 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt6055 == -1 && arg2.anIntArray388 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg2.anInt6059 * Static227.aClass3_Sub15_11.aClass17_Sub3_5.method741() >> 8;
		if (arg2.anInt6058 < arg0) {
			local15 = arg0 - arg2.anInt6058;
		} else if (arg2.anInt6061 > arg0) {
			local15 = arg2.anInt6061 - arg0;
		}
		if (arg2.anInt6057 < arg1) {
			local15 += arg1 - arg2.anInt6057;
		} else if (arg1 < arg2.anInt6071) {
			local15 += arg2.anInt6071 - arg1;
		}
		if (arg2.anInt6065 == 0 || arg2.anInt6065 < local15 - 256 || Static227.aClass3_Sub15_11.aClass17_Sub3_5.method741() == 0 || arg2.anInt6062 != arg4) {
			if (arg2.aClass3_Sub9_Sub2_1 != null) {
				Static557.aClass3_Sub9_Sub1_2.method1420(arg2.aClass3_Sub9_Sub2_1);
				arg2.aClass3_Sub9_Sub2_1 = null;
				arg2.aClass3_Sub12_Sub1_2 = null;
				arg2.aClass3_Sub51_1 = null;
			}
			if (arg2.aClass3_Sub9_Sub2_2 != null) {
				Static557.aClass3_Sub9_Sub1_2.method1420(arg2.aClass3_Sub9_Sub2_2);
				arg2.aClass3_Sub12_Sub1_1 = null;
				arg2.aClass3_Sub51_2 = null;
				arg2.aClass3_Sub9_Sub2_2 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(150) int local150 = arg2.anInt6065 - arg2.anInt6067;
		if (local150 < 0) {
			local150 = arg2.anInt6065;
		}
		@Pc(160) int local160 = local25;
		@Pc(166) int local166 = local15 - arg2.anInt6067;
		if (local166 > 0 && local150 > 0) {
			local160 = (local150 - local166) * local25 / local150;
		}
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625();
		@Pc(188) int local188 = 8192;
		@Pc(199) int local199 = (arg2.anInt6061 + arg2.anInt6058) / 2 - arg0;
		@Pc(210) int local210 = (arg2.anInt6071 + arg2.anInt6057) / 2 - arg1;
		@Pc(234) int local234;
		@Pc(246) int local246;
		if (local199 != 0 || local210 != 0) {
			local234 = -Static206.anInt3821 - (int) (Math.atan2((double) local199, (double) local210) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local234 > 8192) {
				local234 = 16384 - local234;
			}
			if (local15 <= 0) {
				local246 = 8192;
			} else if (local15 < 4096) {
				local246 = local15 * 8192 / 4096 + 8192;
			} else {
				local246 = 16384;
			}
			local188 = (16384 - local246 >> 1) + local246 * local234 / 8192;
		}
		@Pc(357) Class3_Sub9_Sub2 local357;
		if (arg2.aClass3_Sub9_Sub2_1 != null) {
			arg2.aClass3_Sub9_Sub2_1.method3728(local160);
			arg2.aClass3_Sub9_Sub2_1.method3739(local188);
		} else if (arg2.anInt6055 >= 0) {
			local234 = arg2.anInt6056 == 256 && arg2.anInt6064 == 256 ? 256 : Static618.method8107(arg2.anInt6056, arg2.anInt6064);
			if (arg2.aBoolean470) {
				if (arg2.aClass3_Sub51_1 == null) {
					arg2.aClass3_Sub51_1 = Static570.method7700(Static375.aClass143_92, arg2.anInt6055);
				}
				if (arg2.aClass3_Sub51_1 != null) {
					if (arg2.aClass3_Sub12_Sub1_2 == null) {
						arg2.aClass3_Sub12_Sub1_2 = arg2.aClass3_Sub51_1.method7708(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub12_Sub1_2 != null) {
						local357 = Static684.method3727(arg2.aClass3_Sub12_Sub1_2, local234, local160 << 6, local188);
						local357.method3730(-1);
						Static557.aClass3_Sub9_Sub1_2.method1419(local357);
						arg2.aClass3_Sub9_Sub2_1 = local357;
					}
				}
			} else {
				@Pc(374) Class36 local374 = Static681.method1237(Static571.aClass143_129, arg2.anInt6055, 0);
				if (local374 != null) {
					@Pc(381) Class3_Sub12_Sub1 local381 = local374.method1235().method7244(Static46.aClass334_1);
					@Pc(389) Class3_Sub9_Sub2 local389 = Static684.method3727(local381, local234, local160 << 6, local188);
					local389.method3730(-1);
					Static557.aClass3_Sub9_Sub1_2.method1419(local389);
					arg2.aClass3_Sub9_Sub2_1 = local389;
				}
			}
		}
		if (arg2.aClass3_Sub9_Sub2_2 != null) {
			arg2.aClass3_Sub9_Sub2_2.method3728(local160);
			arg2.aClass3_Sub9_Sub2_2.method3739(local188);
			if (!arg2.aClass3_Sub9_Sub2_2.method8771()) {
				arg2.aClass3_Sub51_2 = null;
				arg2.aClass3_Sub9_Sub2_2 = null;
				arg2.aClass3_Sub12_Sub1_1 = null;
			}
		} else if (arg2.anIntArray388 != null && (arg2.anInt6068 -= arg3) <= 0) {
			local234 = arg2.anInt6056 == 256 && arg2.anInt6064 == 256 ? 256 : (int) (Math.random() * (double) (arg2.anInt6056 - arg2.anInt6064)) + arg2.anInt6064;
			if (arg2.aBoolean471) {
				if (arg2.aClass3_Sub51_2 == null) {
					local246 = (int) ((double) arg2.anIntArray388.length * Math.random());
					arg2.aClass3_Sub51_2 = Static570.method7700(Static375.aClass143_92, arg2.anIntArray388[local246]);
				}
				if (arg2.aClass3_Sub51_2 != null) {
					if (arg2.aClass3_Sub12_Sub1_1 == null) {
						arg2.aClass3_Sub12_Sub1_1 = arg2.aClass3_Sub51_2.method7708(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub12_Sub1_1 != null) {
						local357 = Static684.method3727(arg2.aClass3_Sub12_Sub1_1, local234, local160 << 6, local188);
						local357.method3730(0);
						Static557.aClass3_Sub9_Sub1_2.method1419(local357);
						arg2.aClass3_Sub9_Sub2_2 = local357;
						arg2.anInt6068 = (int) (Math.random() * (double) (arg2.anInt6066 - arg2.anInt6060)) + arg2.anInt6060;
					}
				}
			} else {
				local246 = (int) (Math.random() * (double) arg2.anIntArray388.length);
				@Pc(483) Class36 local483 = Static681.method1237(Static571.aClass143_129, arg2.anIntArray388[local246], 0);
				if (local483 != null) {
					@Pc(490) Class3_Sub12_Sub1 local490 = local483.method1235().method7244(Static46.aClass334_1);
					@Pc(498) Class3_Sub9_Sub2 local498 = Static684.method3727(local490, local234, local160 << 6, local188);
					local498.method3730(0);
					Static557.aClass3_Sub9_Sub1_2.method1419(local498);
					arg2.aClass3_Sub9_Sub2_2 = local498;
					arg2.anInt6068 = (int) ((double) (arg2.anInt6066 - arg2.anInt6060) * Math.random()) + arg2.anInt6060;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!bi;Lclient!gka;Lclient!ha;I)V")
	public static void method5207(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(10) Class102 local10 = arg1.method3159(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method6957();
		if (local16 < local10.method6962()) {
			local16 = local10.method6962();
		}
		@Pc(32) int local32 = arg0.anInt1245;
		@Pc(35) int local35 = arg0.anInt1247;
		@Pc(37) int local37 = 0;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(65) int local65;
		@Pc(92) int local92;
		if (arg1.aString44 != null) {
			local37 = Static621.aClass202_13.method4623(arg1.aString44, (int[]) null, (Class102[]) null, Static467.aStringArray55);
			for (local65 = 0; local65 < local37; local65++) {
				@Pc(71) String local71 = Static467.aStringArray55[local65];
				if (local37 - 1 > local65) {
					local71 = local71.substring(0, local71.length() - 4);
				}
				local92 = Static374.aClass281_6.method6672(local71);
				if (local49 < local92) {
					local49 = local92;
				}
			}
			local51 = Static374.aClass281_6.method6670() * local37 + Static374.aClass281_6.method6668() / 2;
		}
		local65 = local16 / 2 + arg0.anInt1245;
		@Pc(130) int local130 = arg0.anInt1247;
		if (local32 < Static574.anInt8356 + local16) {
			local65 = local49 / 2 + Static574.anInt8356 + local16 / 2 + 5 + 10;
			local32 = Static574.anInt8356;
		} else if (local32 > Static574.anInt8362 - local16) {
			local32 = Static574.anInt8362 - local16;
			local65 = Static574.anInt8362 - local16 / 2 - local49 / 2 - 5 - 10;
		}
		if (local35 < Static574.anInt8359 + local16) {
			local130 = Static574.anInt8359 + local16 / 2 + 10;
			local35 = Static574.anInt8359;
		} else if (local35 > Static574.anInt8365 - local16) {
			local35 = Static574.anInt8365 - local16;
			local130 = Static574.anInt8365 - local51 - local16 / 2 - 10;
		}
		local92 = (int) (Math.atan2((double) (local32 - arg0.anInt1245), (double) (local35 - arg0.anInt1247)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6963((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local92);
		@Pc(271) int local271 = -2;
		@Pc(273) int local273 = -2;
		@Pc(275) int local275 = -2;
		@Pc(277) int local277 = -2;
		if (arg1.aString44 != null) {
			local271 = local65 - local49 / 2 - 5;
			local273 = local130;
			local275 = local271 + local49 + 10;
			local277 = Static374.aClass281_6.method6670() * local37 + local130 + 3;
			if (arg1.anInt3623 != 0) {
				arg2.method8113(local277 - local130, local271, local275 - local271, arg1.anInt3623, local130);
			}
			if (arg1.anInt3609 != 0) {
				arg2.method8180(arg1.anInt3609, local271, local275 - local271, local277 - local130, local130);
			}
			for (@Pc(348) int local348 = 0; local348 < local37; local348++) {
				@Pc(354) String local354 = Static467.aStringArray55[local348];
				if (local348 < local37 - 1) {
					local354 = local354.substring(0, local354.length() - 4);
				}
				Static374.aClass281_6.method6671(arg2, local354, local65, local130, arg1.anInt3601);
				local130 += Static374.aClass281_6.method6670();
			}
		}
		if (arg1.anInt3606 == -1 && arg1.aString44 == null) {
			return;
		}
		@Pc(402) Class3_Sub45 local402 = new Class3_Sub45(arg0);
		local16 >>= 0x1;
		local402.anInt8325 = local35 - local16;
		local402.anInt8321 = local35 + local16;
		local402.anInt8327 = local273;
		local402.anInt8326 = local32 + local16;
		local402.anInt8320 = local32 - local16;
		local402.anInt8323 = local271;
		local402.anInt8324 = local275;
		local402.anInt8322 = local277;
		Static553.aClass193_57.method4462(local402);
	}
}
