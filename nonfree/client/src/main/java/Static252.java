import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_111 = new Class163(59, 8);

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public static int anInt4255 = 0;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
	public static void method3554() {
		if (Static275.aFloat61 < 1024.0F) {
			Static275.aFloat61 = 1024.0F;
		}
		if (Static275.aFloat61 > 3072.0F) {
			Static275.aFloat61 = 3072.0F;
		}
		while (Static19.aFloat6 >= 16384.0F) {
			Static19.aFloat6 -= 16384.0F;
		}
		while (Static19.aFloat6 < 0.0F) {
			Static19.aFloat6 += 16384.0F;
		}
		@Pc(41) int local41 = Static43.anInt5650 >> 7;
		@Pc(45) int local45 = Static32.anInt603 >> 7;
		@Pc(51) int local51 = Static181.method4212(Static276.anInt4606, Static32.anInt603, Static43.anInt5650);
		@Pc(61) int local61 = 0;
		@Pc(91) int local91;
		if (local41 > 3 && local45 > 3 && Static373.anInt6324 - 4 > local41 && local45 < Static291.anInt5062 - 4) {
			for (local91 = local41 - 4; local91 <= local41 + 4; local91++) {
				for (@Pc(97) int local97 = local45 - 4; local97 <= local45 + 4; local97++) {
					@Pc(101) int local101 = Static276.anInt4606;
					if (local101 < 3 && Static24.method2475(local91, local97)) {
						local101++;
					}
					@Pc(112) int local112 = 0;
					if (Static36.aClass22_Sub1_2.aByteArrayArrayArray14 != null && Static36.aClass22_Sub1_2.aByteArrayArrayArray14[local101] != null) {
						local112 = (Static36.aClass22_Sub1_2.aByteArrayArrayArray14[local101][local91][local97] & 0xFF) * 8;
					}
					@Pc(145) int local145 = local51 + local112 - Static178.aClass55Array1[local101].oa(local91, local97);
					if (local145 > local61) {
						local61 = local145;
					}
				}
			}
		}
		local91 = (local61 >> 0) * 1536;
		if (local91 > 786432) {
			local91 = 786432;
		}
		if (local91 < 262144) {
			local91 = 262144;
		}
		if (Static286.anInt2876 < local91) {
			Static286.anInt2876 += (local91 - Static286.anInt2876) / 24;
		} else if (local91 < Static286.anInt2876) {
			Static286.anInt2876 += (local91 - Static286.anInt2876) / 80;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method3556(@OriginalArg(0) Class167 arg0) {
		if (Static276.anInt4608 < 2 && !Static73.aBoolean88 || Static296.aClass82_16 != null) {
			return;
		}
		@Pc(43) String local43;
		if (Static73.aBoolean88 && Static276.anInt4608 < 2) {
			local43 = Static320.aString12 + Static54.aClass174_34.method4208(Static300.anInt5192) + Static296.aString56 + " ->";
		} else if (Static310.aBoolean386 && Static137.aClass143_1.method5471(81) && Static276.anInt4608 > 2) {
			local43 = Static413.method5691((Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267.aClass3_267);
		} else {
			@Pc(39) Class3_Sub38 local39 = (Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267;
			local43 = Static413.method5691(local39);
			@Pc(45) int[] local45 = null;
			if (Static56.method1096(local39.anInt5875)) {
				local45 = Static158.aClass272_1.method6283((int) local39.aLong199).anIntArray365;
			} else if (local39.anInt5869 != -1) {
				local45 = Static158.aClass272_1.method6283(local39.anInt5869).anIntArray365;
			} else if (Static419.method5747(local39.anInt5875)) {
				@Pc(85) Class3_Sub40 local85 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local39.aLong199);
				if (local85 != null) {
					@Pc(90) Class1_Sub2_Sub6_Sub1 local90 = local85.aClass1_Sub2_Sub6_Sub1_2;
					@Pc(93) Class158 local93 = local90.aClass158_1;
					if (local93.anIntArray294 != null) {
						local93 = local93.method3705(Static119.aClass47_1);
					}
					if (local93 != null) {
						local45 = local93.anIntArray295;
					}
				}
			} else if (Static396.method5462(local39.anInt5875)) {
				@Pc(131) Class31 local131;
				if (local39.anInt5875 == 1007) {
					local131 = Static9.aClass149_1.method3573((int) local39.aLong199);
				} else {
					local131 = Static9.aClass149_1.method3573((int) (local39.aLong199 >>> 32 & 0x7FFFFFFFL));
				}
				if (local131.anIntArray44 != null) {
					local131 = local131.method863(Static119.aClass47_1);
				}
				if (local131 != null) {
					local45 = local131.anIntArray43;
				}
			}
			if (local45 != null) {
				local43 = local43 + Static270.method3761(local45);
			}
		}
		if (Static276.anInt4608 > 2) {
			local43 = local43 + "<col=ffffff> / " + (Static276.anInt4608 - 2) + Static148.aClass174_84.method4208(Static300.anInt5192);
		}
		if (Static266.aClass82_15 != null) {
			@Pc(267) Class18 local267 = Static266.aClass82_15.method1971(arg0);
			if (local267 == null) {
				local267 = Static266.aClass18_2;
			}
			local267.method5177(Static266.aClass82_15.anInt2211, Static20.anIntArray384, Static306.aClass2Array15, Static223.anInt3769, Static266.aClass82_15.anInt2192, Static266.aClass82_15.anInt2229, Static104.anInt1869, Static266.aClass82_15.anInt2274, Static455.anInt7670, Static456.aRandom1, local43, Static39.anIntArray31, Static266.aClass82_15.anInt2226, Static266.aClass82_15.anInt2216);
			Static208.method3163(Static20.anIntArray384[2], Static20.anIntArray384[0], Static20.anIntArray384[3], Static20.anIntArray384[1]);
		} else if (Static124.aClass82_8 != null && Static154.aClass113_3 == Static145.aClass113_2) {
			@Pc(248) int local248 = Static266.aClass18_2.method5164(Static456.aRandom1, Static104.anInt1869, Static39.anIntArray31, Static186.anInt3413 + 16, Static207.anInt3659 + 4, local43, Static306.aClass2Array15);
			Static208.method3163(local248 + Static251.aClass124_14.method3099(local43), Static207.anInt3659 + 4, 16, Static186.anInt3413);
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(FIFFIZII)[F")
	public static float[] method3559(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[6] = -local25;
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(83) float local83 = (float) arg6 / 32767.0F;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(97) float local97 = 1.0F - local83;
		@Pc(108) float local108 = (float) Math.sqrt((double) (arg4 * arg4 + arg5 * arg5));
		if (local108 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local108 != 0.0F) {
				local73 = (float) arg5 / local108;
				local71 = (float) -arg4 / local108;
			}
			local69[6] = local97 * local73 * local71;
			local69[7] = -local71 * local93;
			local69[4] = local83;
			local69[3] = local93 * -local73;
			local69[8] = local73 * local73 * local97 + local83;
			local69[2] = local71 * local73 * local97;
			local69[0] = local83 + local97 * local71 * local71;
			local69[1] = local73 * local93;
			local69[5] = local93 * local71;
			local9[0] = local69[0] * local6[0] + local69[3] * local6[1] + local69[6] * local6[2];
			local9[1] = local69[7] * local6[2] + local69[4] * local6[1] + local6[0] * local69[1];
			local9[3] = local6[4] * local69[3] + local69[0] * local6[3] + local6[5] * local69[6];
			local9[2] = local6[2] * local69[8] + local69[5] * local6[1] + local6[0] * local69[2];
			local9[4] = local69[1] * local6[3] + local6[4] * local69[4] + local69[7] * local6[5];
			local9[6] = local6[6] * local69[0] + local6[7] * local69[3] + local69[6] * local6[8];
			local9[5] = local6[4] * local69[5] + local6[3] * local69[2] + local6[5] * local69[8];
			local9[7] = local69[1] * local6[6] + local69[4] * local6[7] + local6[8] * local69[7];
			local9[8] = local6[8] * local69[8] + local6[6] * local69[2] + local6[7] * local69[5];
		}
		local9[1] *= arg3;
		local9[7] *= arg2;
		local9[8] *= arg2;
		local9[6] *= arg2;
		local9[4] *= arg0;
		local9[3] *= arg0;
		local9[2] *= arg3;
		local9[0] *= arg3;
		local9[5] *= arg0;
		return local9;
	}
}
