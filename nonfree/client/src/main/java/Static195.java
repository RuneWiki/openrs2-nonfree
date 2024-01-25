import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "J")
	public static long aLong203;

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
	public static int anInt7212;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_21 = new Class10(15, 0, 1, 0);

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
	public static int anInt7211 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[FIIII)V")
	public static void method5945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 > 0 && !Static99.method4914(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static99.method4914(arg0)) {
			@Pc(31) int local31 = Static443.method6419(6408);
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg0 <= arg3 ? arg0 : arg3;
			@Pc(49) int local49 = arg3 >> 1;
			@Pc(53) int local53 = arg0 >> 1;
			@Pc(55) float[] local55 = arg2;
			@Pc(62) float[] local62 = new float[local31 * local49 * local53];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg3, arg0, 0, 6408, 5126, local55, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(82) int local82 = local31 * arg3;
				for (@Pc(84) int local84 = 0; local84 < local31; local84++) {
					@Pc(88) int local88 = local84;
					@Pc(90) int local90 = local84;
					@Pc(94) int local94 = local84 + local82;
					for (@Pc(96) int local96 = 0; local96 < local53; local96++) {
						for (@Pc(100) int local100 = 0; local100 < local49; local100++) {
							@Pc(106) float local106 = local55[local90];
							local90 += local31;
							@Pc(116) float local116 = local106 + local55[local90];
							@Pc(122) float local122 = local116 + local55[local94];
							local90 += local31;
							local94 += local31;
							@Pc(136) float local136 = local122 + local55[local94];
							local94 += local31;
							local62[local88] = local136 * 0.25F;
							local88 += local31;
						}
						local90 += local82;
						local94 += local82;
					}
				}
				@Pc(184) float[] local184 = local62;
				local62 = local55;
				arg3 = local49;
				arg0 = local53;
				local55 = local184;
				local33++;
				local53 >>= 0x1;
				local40 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BZILclient!ts;I)V")
	public static void method5946(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class239 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = arg2.anInt6898;
		@Pc(19) int local19 = arg2.anInt6899;
		if (arg2.aByte99 == 0) {
			arg2.anInt6898 = arg2.anInt6896;
		} else if (arg2.aByte99 == 1) {
			arg2.anInt6898 = arg1 - arg2.anInt6896;
		} else if (arg2.aByte99 == 2) {
			arg2.anInt6898 = arg1 * arg2.anInt6896 >> 14;
		}
		if (arg2.aByte97 == 0) {
			arg2.anInt6899 = arg2.anInt6938;
		} else if (arg2.aByte97 == 1) {
			arg2.anInt6899 = arg3 - arg2.anInt6938;
		} else if (arg2.aByte97 == 2) {
			arg2.anInt6899 = arg3 * arg2.anInt6938 >> 14;
		}
		if (arg2.aByte99 == 4) {
			arg2.anInt6898 = arg2.anInt6899 * arg2.anInt6942 / arg2.anInt6963;
		}
		if (arg2.aByte97 == 4) {
			arg2.anInt6899 = arg2.anInt6963 * arg2.anInt6898 / arg2.anInt6942;
		}
		if (Static27.aBoolean39 && (Static50.method1150(arg2).anInt1492 != 0 || arg2.anInt6900 == 0)) {
			if (arg2.anInt6899 < 5 && arg2.anInt6898 < 5) {
				arg2.anInt6899 = 5;
				arg2.anInt6898 = 5;
			} else {
				if (arg2.anInt6899 <= 0) {
					arg2.anInt6899 = 5;
				}
				if (arg2.anInt6898 <= 0) {
					arg2.anInt6898 = 5;
				}
			}
		}
		if (arg2.anInt6911 == Static267.anInt4852) {
			Static433.aClass239_15 = arg2;
		}
		if (arg0 && arg2.anObjectArray31 != null && (local16 != arg2.anInt6898 || arg2.anInt6899 != local19)) {
			@Pc(195) Class6_Sub42 local195 = new Class6_Sub42();
			local195.aClass239_13 = arg2;
			local195.anObjectArray36 = arg2.anObjectArray31;
			Static376.aClass244_40.method5966(local195);
		}
	}

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)V")
	public static void method5948() {
		for (@Pc(6) Class6_Sub34 local6 = (Class6_Sub34) Static352.aClass244_39.method5976(); local6 != null; local6 = (Class6_Sub34) Static352.aClass244_39.method5964()) {
			if (Static409.aClass101ArrayArrayArray3 == null) {
				local6.method6525();
			} else {
				@Pc(24) int local24;
				@Pc(34) Class3_Sub3 local34;
				@Pc(47) Class3_Sub3_Sub2 local47;
				@Pc(126) Class3_Sub2 local126;
				@Pc(83) Class3_Sub5 local83;
				@Pc(165) Class3_Sub1 local165;
				@Pc(96) Class3_Sub5_Sub3 local96;
				@Pc(178) Class3_Sub1_Sub2 local178;
				if (local6.anInt6215 <= Static66.anInt1741) {
					local24 = Static414.anIntArray487[local6.anInt6209];
					if (local24 == 0) {
						local34 = Static86.method825(local6.anInt6210, local6.anInt6208, local6.anInt6216);
						if (local34 instanceof Class3_Sub3_Sub2) {
							Static289.method4353(local6.anInt6210, local6.anInt6208, local6.anInt6216);
							local47 = (Class3_Sub3_Sub2) local34;
							if (local47.aClass3_Sub3_3 != null) {
								Static163.method2695(local6.anInt6210, local6.anInt6208, local6.anInt6216, local47.aClass3_Sub3_3, null);
							}
						}
					} else if (local24 == 1) {
						local165 = Static273.method4127(local6.anInt6210, local6.anInt6208, local6.anInt6216);
						if (local165 instanceof Class3_Sub1_Sub2) {
							Static242.method3802(local6.anInt6210, local6.anInt6208, local6.anInt6216);
							local178 = (Class3_Sub1_Sub2) local165;
							if (local178.aClass3_Sub1_1 != null) {
								Static445.method6519(local6.anInt6210, local6.anInt6208, local6.anInt6216, local178.aClass3_Sub1_1, null);
							}
						}
					} else if (local24 == 2) {
						local126 = Static415.method6101(local6.anInt6210, local6.anInt6208, local6.anInt6216, sq.class);
						if (local126 instanceof Class3_Sub2_Sub2) {
							Static18.method494(local6.anInt6210, local6.anInt6208, local6.anInt6216, sq.class);
							@Pc(147) Class3_Sub2_Sub2 local147 = (Class3_Sub2_Sub2) local126;
							if (local147.aClass3_Sub2_1 != null) {
								Static411.method6066(local147.aClass3_Sub2_1, false);
							}
						}
					} else if (local24 == 3) {
						local83 = Static109.method4308(local6.anInt6210, local6.anInt6208, local6.anInt6216);
						if (local83 instanceof Class3_Sub5_Sub3) {
							Static250.method3879(local6.anInt6210, local6.anInt6208, local6.anInt6216);
							local96 = (Class3_Sub5_Sub3) local83;
							if (local96.aClass3_Sub5_2 != null) {
								Static225.method3367(local6.anInt6210, local6.anInt6208, local6.anInt6216, local96.aClass3_Sub5_2);
							}
						}
					}
					local6.method6525();
				} else if (local6.anInt6222 == Static66.anInt1741) {
					local24 = Static414.anIntArray487[local6.anInt6209];
					if (local24 == 0) {
						local34 = Static86.method825(local6.anInt6210, local6.anInt6208, local6.anInt6216);
						if (local34 instanceof Class3_Sub3_Sub2) {
							local6.method6525();
						} else if (Static142.method2451(local6.anInt6210, local6.anInt6208, local6.anInt6216) == null) {
							local47 = new Class3_Sub3_Sub2(local6.anInt6209, local6.anInt6212, local6.anInt6213, local6.anInt6223, local6.anInt6211, local34);
							Static163.method2695(local6.anInt6210, local6.anInt6208, local6.anInt6216, local47, null);
						} else {
							local6.method6525();
						}
					} else if (local24 == 1) {
						local165 = Static273.method4127(local6.anInt6210, local6.anInt6208, local6.anInt6216);
						if (local165 instanceof Class3_Sub1_Sub2) {
							local6.method6525();
						} else if (Static371.method5568(local6.anInt6210, local6.anInt6208, local6.anInt6216) == null) {
							local178 = new Class3_Sub1_Sub2(local6.anInt6209, local6.anInt6212, local6.anInt6213, local6.anInt6223, local6.anInt6211, local165);
							Static445.method6519(local6.anInt6210, local6.anInt6208, local6.anInt6216, local178, null);
						} else {
							local6.method6525();
						}
					} else if (local24 == 2) {
						local126 = Static415.method6101(local6.anInt6210, local6.anInt6208, local6.anInt6216, sq.class);
						if (local126 instanceof Class3_Sub2_Sub2) {
							local6.method6525();
						} else {
							Static18.method494(local6.anInt6210, local6.anInt6208, local6.anInt6216, sq.class);
							@Pc(300) Class106 local300 = Static448.aClass104_4.method2616(local6.anInt6214);
							@Pc(313) int local313;
							@Pc(316) int local316;
							if (local6.anInt6212 == 1 || local6.anInt6212 == 3) {
								local313 = local300.anInt3194;
								local316 = local300.anInt3158;
							} else {
								local313 = local300.anInt3158;
								local316 = local300.anInt3194;
							}
							@Pc(357) Class3_Sub2_Sub2 local357 = new Class3_Sub2_Sub2(local6.anInt6209, local6.anInt6212, local6.anInt6210, local6.anInt6213, local6.anInt6223, local6.anInt6211, local6.anInt6208, local6.anInt6208 + local313 - 1, local6.anInt6216, local316 + local6.anInt6216 - 1, local126);
							Static411.method6066(local357, false);
						}
					} else if (local24 == 3) {
						local83 = Static109.method4308(local6.anInt6210, local6.anInt6208, local6.anInt6216);
						if (local83 instanceof Class3_Sub5_Sub3) {
							local6.method6525();
						} else {
							local96 = new Class3_Sub5_Sub3(local6.anInt6213, local6.anInt6223, local6.anInt6211, local83);
							Static225.method3367(local6.anInt6210, local6.anInt6208, local6.anInt6216, local96);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5949(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static354.anInt6329++;
		Static110.anInt6980 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static435.anInt7711; local7 < Static295.anInt5507; local7++) {
			@Pc(12) Class101[][] local12 = Static409.aClass101ArrayArrayArray3[local7];
			for (local14 = Static211.anInt3900; local14 < Static163.anInt3256; local14++) {
				for (@Pc(17) int local17 = Static238.anInt4363; local17 < Static103.anInt2239; local17++) {
					@Pc(24) Class101 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static202.aBooleanArrayArray7[local14 + anInt7212 - Static6.anInt253][local17 + anInt7212 - Static370.anInt6673] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean193 = true;
							local24.aBoolean194 = true;
							if (local24.aClass145_1 == null) {
								local24.aBoolean192 = false;
							} else {
								local24.aBoolean192 = true;
							}
							Static110.anInt6980++;
						} else {
							local24.aBoolean193 = false;
							local24.aBoolean194 = false;
							local24.aByte44 = 0;
							if (local14 >= Static6.anInt253 - 16 && local14 <= Static6.anInt253 + 16 && local17 >= Static370.anInt6673 - 16 && local17 <= Static370.anInt6673 + 16 && (local24.aClass3_Sub3_2 != null || local24.aClass3_Sub3_1 != null || local24.aClass3_Sub1_2 != null || local24.aClass3_Sub1_3 != null || local24.aClass3_Sub5_1 != null || local24.aClass145_1 != null)) {
								Static401.aClass120_1.method6073(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static288.aClass86Array3 == Static55.aClass86Array1;
		for (local14 = Static435.anInt7711; local14 < Static295.anInt5507; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static165.aClass66_8.method5065() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static202.aBooleanArrayArray7.length;
				if (Static211.anInt3900 + Static202.aBooleanArrayArray7.length > Static229.anInt4189) {
					local172 -= Static211.anInt3900 + Static202.aBooleanArrayArray7.length - Static229.anInt4189;
				}
				@Pc(192) int local192 = Static202.aBooleanArrayArray7[0].length;
				if (Static238.anInt4363 + Static202.aBooleanArrayArray7[0].length > Static61.anInt1698) {
					local192 -= Static238.anInt4363 + Static202.aBooleanArrayArray7[0].length - Static61.anInt1698;
				}
				@Pc(213) int local213 = Static358.anInt6378;
				while (true) {
					if (local213 >= local172) {
						Static401.aClass120_1.method6071(Static55.aClass86Array1[local14], local14, local161, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static211.anInt3900 - Static358.anInt6378;
					for (@Pc(222) int local222 = Static53.anInt1469; local222 < local192; local222++) {
						Static59.aBooleanArrayArray4[local213][local222] = false;
						if (Static202.aBooleanArrayArray7[local213][local222]) {
							@Pc(241) int local241 = local222 + Static238.anInt4363 - Static53.anInt1469;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static409.aClass101ArrayArrayArray3[local243][local220][local241] != null && Static409.aClass101ArrayArrayArray3[local243][local220][local241].aByte43 == local14) {
									Static59.aBooleanArrayArray4[local213][local222] = Static409.aClass101ArrayArrayArray3[local243][local220][local241].aBoolean193;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static401.aClass120_1.method6071(Static55.aClass86Array1[local14], local14, local161, false);
			}
			Static401.aClass120_1.method6079();
		}
		if (!Static296.method4393(true)) {
			Static296.method4393(false);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5951(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local8 + local10);
		for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
			@Pc(54) char local54 = arg0.charAt(local48);
			if (local54 == '<') {
				local46.append("<lt>");
			} else if (local54 == '>') {
				local46.append("<gt>");
			} else {
				local46.append(local54);
			}
		}
		return local46.toString();
	}
}
