import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "Lclient!uv;")
	public static final Class334 aClass334_2 = new Class334();

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "Lclient!uv;")
	public static final Class334 aClass334_5 = new Class334();

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "Lclient!uv;")
	public static final Class334 aClass334_3 = new Class334();

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "Lclient!uv;")
	public static final Class334 aClass334_4 = new Class334();

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "[I")
	public static final int[] anIntArray519 = new int[3];

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
	public static final int anInt9680 = 1407;

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "Z")
	public static boolean aBoolean680 = false;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
	public static int anInt9681 = -1;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIILclient!r;)V")
	public static void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class44 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static534.anInt9515 == 0 || Static156.anInt3242 == 0) {
			return;
		}
		arg2.la(Static530.anInt9435, Static107.anInt8425, Static534.anInt9515, Static156.anInt3242);
		arg2.da(Static435.anInt8160, Static44.anInt579, Static534.anInt9515, Static156.anInt3242);
		@Pc(38) Class8 local38 = arg2.method5025();
		local38.na(Static76.anInt1269, Static226.anInt4163, Static436.anInt8165, Static190.anInt3735, Static283.anInt10292, Static404.anInt7679);
		arg2.method4999(local38);
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(129) int[] local129;
		@Pc(142) int local142;
		@Pc(150) int local150;
		@Pc(158) int local158;
		@Pc(171) int local171;
		if (Static444.aClass83Array7 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			local58 = arg2.BA();
			local66 = local58 * (arg1 - Static530.anInt9435) / Static534.anInt9515;
			local75 = local58 * (arg0 - Static107.anInt8425) / Static156.anInt3242;
			local78 = arg2.U();
			local87 = local78 * (arg1 - Static530.anInt9435) / Static534.anInt9515;
			local96 = (arg0 - Static107.anInt8425) * local78 / Static156.anInt3242;
			@Pc(111) int[] local111 = new int[] { local66, local75, local58 };
			local38.YA(local111);
			local129 = new int[] { local87, local96, local78 };
			local38.YA(local129);
			@Pc(134) float local134 = 0.0F;
			local142 = local129[0] - local111[0];
			local150 = local129[1] - local111[1];
			local158 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				local171 = (int) (local134 * (float) local142 + (float) local111[0]);
				@Pc(175) int local175 = local171 >> 9;
				@Pc(186) int local186 = (int) ((float) local111[2] + (float) local158 * local134);
				@Pc(190) int local190 = local186 >> 9;
				if (local175 > 0 && local190 > 0 && Static428.anInt8046 > local175 && Static119.anInt2717 > local190) {
					@Pc(207) int local207 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126;
					if (local207 < 3 && (Static262.aByteArrayArrayArray16[1][local175][local190] & 0x2) != 0) {
						local207++;
					}
					if ((float) Static444.aClass83Array7[local207].method7213(local171, local186) < (float) local111[1] + local134 * (float) local150) {
						local53 = local171 + (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() - 1 << 8) >> 9;
						local55 = local186 + (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() - 1 << 8) >> 9;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static418.aBoolean541 && (Static163.anInt3317 & 0x40) != 0) {
					@Pc(299) Class225 local299 = Static24.method318(Static7.anInt173, Static317.anInt10281);
					if (local299 == null) {
						Static419.method6558();
					} else {
						Static369.method5938(0L, 57, false, -1, Static397.anInt7611, local55, Static152.aString28, local53, true, " ->");
					}
				} else {
					if (Static394.aBoolean520) {
						Static369.method5938(0L, 17, false, -1, -1, local55, Static590.aClass364_31.method8334(Static154.anInt3181), local53, true, "");
					}
					Static369.method5938(0L, 60, false, -1, Static410.anInt7776, local55, Static478.aString85, local53, true, "");
				}
			}
		}
		@Pc(354) Class136 local354 = Static156.aClass136_5;
		for (@Pc(364) Class1_Sub8 local364 = (Class1_Sub8) local354.method3288(); local364 != null; local364 = (Class1_Sub8) local354.method3286()) {
			if ((Static324.aBoolean457 || local364.aClass1_Sub4_2.aByte126 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126) && local364.method5266(arg2, arg0, arg1)) {
				if (local364.aClass1_Sub4_2 instanceof Class1_Sub4_Sub2) {
					local58 = ((Class1_Sub4_Sub2) local364.aClass1_Sub4_2).aShort121;
					local66 = ((Class1_Sub4_Sub2) local364.aClass1_Sub4_2).aShort120;
				} else {
					local66 = local364.aClass1_Sub4_2.anInt9935 >> 9;
					local58 = local364.aClass1_Sub4_2.anInt9934 >> 9;
				}
				@Pc(493) int local493;
				@Pc(619) int local619;
				if (local364.aClass1_Sub4_2 instanceof Class1_Sub4_Sub2_Sub1_Sub2) {
					@Pc(425) Class1_Sub4_Sub2_Sub1_Sub2 local425 = (Class1_Sub4_Sub2_Sub1_Sub2) local364.aClass1_Sub4_2;
					local78 = local425.method6925();
					if ((local78 & 0x1) == 0 && (local425.anInt9934 & 0x1FF) == 0 && (local425.anInt9935 & 0x1FF) == 0 || (local78 & 0x1) == 1 && (local425.anInt9934 & 0x1FF) == 256 && (local425.anInt9935 & 0x1FF) == 256) {
						local87 = local425.anInt9934 - (local425.method6925() - 1 << 8);
						local96 = local425.anInt9935 - (local425.method6925() - 1 << 8);
						for (local493 = 0; local493 < Static418.anInt7866; local493++) {
							@Pc(504) Class4_Sub4 local504 = (Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local493]);
							if (local504 != null) {
								@Pc(509) Class1_Sub4_Sub2_Sub1_Sub1 local509 = local504.aClass1_Sub4_Sub2_Sub1_Sub1_1;
								if (Static106.anInt2418 != local509.anInt8440 && local509.aBoolean590) {
									local142 = local509.anInt9934 - (local509.aClass283_1.anInt8266 - 1 << 8);
									local150 = local509.anInt9935 - (local509.aClass283_1.anInt8266 - 1 << 8);
									if (local87 <= local142 && local509.aClass283_1.anInt8266 <= local425.method6925() - (local142 - local87 >> 9) && local96 <= local150 && local509.aClass283_1.anInt8266 <= local425.method6925() - (local150 - local96 >> 9)) {
										Static132.method2642(local364.aClass1_Sub4_2.aByte126 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, local509);
										local509.anInt8440 = Static106.anInt2418;
									}
								}
							}
						}
						local619 = Static413.anInt8212;
						@Pc(621) int[] local621 = Static229.anIntArray201;
						for (local142 = 0; local142 < local619; local142++) {
							@Pc(631) Class1_Sub4_Sub2_Sub1_Sub2 local631 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local621[local142]];
							if (local631 != null && local631.anInt8440 != Static106.anInt2418 && local425 != local631 && local631.aBoolean590) {
								local158 = local631.anInt9934 - (local631.method6925() - 1 << 8);
								local171 = local631.anInt9935 - (local631.method6925() - 1 << 8);
								if (local158 >= local87 && local631.method6925() <= local425.method6925() - (local158 - local87 >> 9) && local171 >= local96 && local631.method6925() <= local425.method6925() - (local171 - local96 >> 9)) {
									Static325.method8270(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 != local364.aClass1_Sub4_2.aByte126, local631);
									local631.anInt8440 = Static106.anInt2418;
								}
							}
						}
					}
					if (local425.anInt8440 == Static106.anInt2418) {
						continue;
					}
					Static325.method8270(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 != local364.aClass1_Sub4_2.aByte126, local425);
					local425.anInt8440 = Static106.anInt2418;
				}
				@Pc(875) int local875;
				if (local364.aClass1_Sub4_2 instanceof Class1_Sub4_Sub2_Sub1_Sub1) {
					@Pc(764) Class1_Sub4_Sub2_Sub1_Sub1 local764 = (Class1_Sub4_Sub2_Sub1_Sub1) local364.aClass1_Sub4_2;
					if (local764.aClass283_1 != null) {
						if ((local764.aClass283_1.anInt8266 & 0x1) == 0 && (local764.anInt9934 & 0x1FF) == 0 && (local764.anInt9935 & 0x1FF) == 0 || (local764.aClass283_1.anInt8266 & 0x1) == 1 && (local764.anInt9934 & 0x1FF) == 256 && (local764.anInt9935 & 0x1FF) == 256) {
							local78 = local764.anInt9934 - (local764.aClass283_1.anInt8266 - 1 << 8);
							local87 = local764.anInt9935 - (local764.aClass283_1.anInt8266 - 1 << 8);
							for (local96 = 0; local96 < Static418.anInt7866; local96++) {
								@Pc(846) Class4_Sub4 local846 = (Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local96]);
								if (local846 != null) {
									@Pc(851) Class1_Sub4_Sub2_Sub1_Sub1 local851 = local846.aClass1_Sub4_Sub2_Sub1_Sub1_1;
									if (Static106.anInt2418 != local851.anInt8440 && local764 != local851 && local851.aBoolean590) {
										local875 = local851.anInt9934 - (local851.aClass283_1.anInt8266 - 1 << 8);
										local142 = local851.anInt9935 - (local851.aClass283_1.anInt8266 - 1 << 8);
										if (local875 >= local78 && local764.aClass283_1.anInt8266 - (local875 - local78 >> 9) >= local851.aClass283_1.anInt8266 && local87 <= local142 && local764.aClass283_1.anInt8266 - (local142 - local87 >> 9) >= local851.aClass283_1.anInt8266) {
											Static132.method2642(local364.aClass1_Sub4_2.aByte126 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, local851);
											local851.anInt8440 = Static106.anInt2418;
										}
									}
								}
							}
							local493 = Static413.anInt8212;
							local129 = Static229.anIntArray201;
							for (local875 = 0; local875 < local493; local875++) {
								@Pc(975) Class1_Sub4_Sub2_Sub1_Sub2 local975 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local129[local875]];
								if (local975 != null && Static106.anInt2418 != local975.anInt8440 && local975.aBoolean590) {
									local150 = local975.anInt9934 - (local975.method6925() - 1 << 8);
									local158 = local975.anInt9935 - (local975.method6925() - 1 << 8);
									if (local150 >= local78 && local975.method6925() <= local764.aClass283_1.anInt8266 - (local150 - local78 >> 9) && local87 <= local158 && local975.method6925() <= local764.aClass283_1.anInt8266 - (local158 - local87 >> 9)) {
										Static325.method8270(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 != local364.aClass1_Sub4_2.aByte126, local975);
										local975.anInt8440 = Static106.anInt2418;
									}
								}
							}
						}
						if (Static106.anInt2418 == local764.anInt8440) {
							continue;
						}
						Static132.method2642(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 != local364.aClass1_Sub4_2.aByte126, local764);
						local764.anInt8440 = Static106.anInt2418;
					}
				}
				if (local364.aClass1_Sub4_2 instanceof Class1_Sub4_Sub3_Sub1) {
					local75 = Static552.anInt9805 + local58;
					local78 = Static254.anInt4667 + local66;
					@Pc(1120) Class4_Sub13 local1120 = (Class4_Sub13) Static251.aClass350_19.method8207((long) (local364.aClass1_Sub4_2.aByte126 << 28 | local78 << 14 | local75));
					if (local1120 != null) {
						for (@Pc(1128) Class4_Sub20 local1128 = (Class4_Sub20) local1120.aClass244_19.method5971(); local1128 != null; local1128 = (Class4_Sub20) local1120.aClass244_19.method5970()) {
							@Pc(1136) Class242 local1136 = Static521.aClass273_2.method6712(local1128.anInt3139);
							if (Static418.aBoolean541 && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 == local364.aClass1_Sub4_2.aByte126) {
								@Pc(1158) Class106 local1158 = Static52.anInt768 == -1 ? null : Static484.aClass313_2.method7381(Static52.anInt768);
								if ((Static163.anInt3317 & 0x1) != 0 && (local1158 == null || local1136.method5896(local1158.anInt3103, Static52.anInt768) != local1158.anInt3103)) {
									Static369.method5938((long) local1128.anInt3139, 58, false, -1, Static397.anInt7611, local66, Static152.aString28, local58, true, Static551.aString95 + " -> <col=ff9040>" + local1136.aString71);
								}
							}
							if (local364.aClass1_Sub4_2.aByte126 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126) {
								@Pc(1210) String[] local1210 = local1136.aStringArray43;
								for (local875 = 4; local875 >= 0; local875--) {
									if (local1210 != null && local1210[local875] != null) {
										@Pc(1222) byte local1222 = 0;
										local150 = Static114.anInt9773;
										if (local875 == 0) {
											local1222 = 6;
										}
										if (local875 == 1) {
											local1222 = 23;
										}
										if (local875 == 2) {
											local1222 = 45;
										}
										if (local875 == 3) {
											local1222 = 12;
										}
										if (local1136.anInt7124 == local875) {
											local150 = local1136.anInt7112;
										}
										if (local875 == 4) {
											local1222 = 25;
										}
										if (local1136.anInt7107 == local875) {
											local150 = local1136.anInt7103;
										}
										Static369.method5938((long) local1128.anInt3139, local1222, false, -1, local150, local66, local1210[local875], local58, true, "<col=ff9040>" + local1136.aString71);
									}
								}
							}
							Static369.method5938((long) local1128.anInt3139, 1009, local364.aClass1_Sub4_2.aByte126 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, -1, Static357.anInt6970, local66, Static590.aClass364_26.method8334(Static154.anInt3181), local58, true, "<col=ff9040>" + local1136.aString71);
						}
					}
				}
				if (local364.aClass1_Sub4_2 instanceof Interface19) {
					@Pc(1366) Interface19 local1366 = (Interface19) local364.aClass1_Sub4_2;
					@Pc(1373) Class101 local1373 = Static204.aClass139_8.method3309(local1366.method7827());
					if (local1373.anIntArray140 != null) {
						local1373 = local1373.method2710(Static45.aClass148_1);
					}
					if (local1373 != null) {
						if (Static418.aBoolean541 && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 == local364.aClass1_Sub4_2.aByte126) {
							@Pc(1401) Class106 local1401 = Static52.anInt768 == -1 ? null : Static484.aClass313_2.method7381(Static52.anInt768);
							if ((Static163.anInt3317 & 0x4) != 0 && (local1401 == null || local1373.method2704(local1401.anInt3103, Static52.anInt768) != local1401.anInt3103)) {
								Static369.method5938(Static213.method4333(local1366, local66, local58), 44, false, -1, Static397.anInt7611, local66, Static152.aString28, local58, true, Static551.aString95 + " -> <col=00ffff>" + local1373.aString25);
							}
						}
						if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 == local364.aClass1_Sub4_2.aByte126) {
							@Pc(1455) String[] local1455 = local1373.aStringArray18;
							if (local1455 != null) {
								for (local96 = 4; local96 >= 0; local96--) {
									if (local1455[local96] != null) {
										@Pc(1467) short local1467 = 0;
										local619 = Static114.anInt9773;
										if (local96 == 0) {
											local1467 = 2;
										}
										if (local96 == 1) {
											local1467 = 5;
										}
										if (local96 == 2) {
											local1467 = 10;
										}
										if (local96 == 3) {
											local1467 = 13;
										}
										if (local1373.anInt2970 == local96) {
											local619 = local1373.anInt2925;
										}
										if (local96 == 4) {
											local1467 = 1001;
										}
										if (local1373.anInt2938 == local96) {
											local619 = local1373.anInt2941;
										}
										Static369.method5938(Static213.method4333(local1366, local66, local58), local1467, false, -1, local619, local66, local1455[local96], local58, true, "<col=00ffff>" + local1373.aString25);
									}
								}
							}
						}
						Static369.method5938((long) local1373.anInt2942, 1011, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 != local364.aClass1_Sub4_2.aByte126, -1, Static357.anInt6970, local66, Static590.aClass364_26.method8334(Static154.anInt3181), local58, true, "<col=00ffff>" + local1373.aString25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!ifa;[III[I)Lclient!hv;")
	public static Class6_Sub2 method7905(@OriginalArg(1) Class44_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg0.method4311(Static362.aClass97_41, Static53.aClass42_4)) {
			@Pc(73) int[] local73 = new int[arg2 * arg3];
			for (local23 = 0; local23 < arg3; local23++) {
				local33 = arg2 * local23 + arg1[local23];
				for (local35 = 0; local35 < arg4[local23]; local35++) {
					local73[local33++] = -16777216;
				}
			}
			return new Class6_Sub2(arg0, arg2, arg3, local73);
		}
		@Pc(21) byte[] local21 = new byte[arg2 * arg3];
		for (local23 = 0; local23 < arg3; local23++) {
			local33 = arg1[local23] + local23 * arg2;
			for (local35 = 0; local35 < arg4[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class6_Sub2(arg0, arg2, arg3, local21);
	}
}
