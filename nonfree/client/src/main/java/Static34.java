import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!b", name = "m", descriptor = "I")
	public static int anInt8577;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_162 = new Class225(47, -2);

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_163 = new Class225(64, 3);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "J")
	public static long aLong270 = 0L;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "J")
	public static long aLong271 = -1L;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
	public static boolean method7588(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIIBII)V")
	public static void method7590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static268.method3778(arg5)) {
			return;
		}
		if (Static39.aClass273ArrayArray1[arg5] == null) {
			Static91.method1400(Static581.aClass273ArrayArray2[arg5], -1, arg8, arg10, arg6, arg1, arg7, arg4, arg0, arg2, arg9, arg3);
		} else {
			Static91.method1400(Static39.aClass273ArrayArray1[arg5], -1, arg8, arg10, arg6, arg1, arg7, arg4, arg0, arg2, arg9, arg3);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLclient!os;)V")
	public static void method7593(@OriginalArg(1) Class281 arg0) {
		@Pc(8) Class2_Sub20_Sub2 local8 = Static487.aClass221_2.aClass2_Sub20_Sub2_2;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (arg0 == Static241.aClass281_11) {
			local15 = local8.method8554(31493);
			local19 = local8.method8554(31493);
			local23 = local8.method8593();
			local29 = (local23 & 0x7) + Static152.anInt2510;
			local33 = Static224.anInt11062 + local29;
			local41 = (local23 >> 4 & 0x7) + Static592.anInt9253;
			local45 = local41 + Static243.anInt3820;
			@Pc(70) boolean local70 = local41 >= 0 && local29 >= 0 && local41 < Static426.anInt6942 && Static280.anInt6752 > local29;
			if (local70 || Static209.method2952(Static718.anInt10954)) {
				Static421.method6145(new Class2_Sub48(local19, local15), local45, Static548.anInt8645, local33);
				if (local70) {
					Static246.method3454(Static548.anInt8645, local29, local41);
				}
			}
			return;
		}
		@Pc(155) int local155;
		@Pc(167) int local167;
		@Pc(171) int local171;
		@Pc(175) int local175;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(161) int local161;
		if (arg0 == Static335.aClass281_12) {
			local15 = local8.method8581(-17416);
			@Pc(119) boolean local119 = (local15 & 0x80) != 0;
			local23 = (local15 >> 3 & 0x7) + Static592.anInt9253;
			local29 = Static152.anInt2510 + (local15 & 0x7);
			local33 = local23 + local8.method8536();
			local41 = local29 + local8.method8536();
			local45 = local8.method8598();
			local155 = local8.method8575();
			local161 = local8.method8581(-17416) * 4;
			local167 = local8.method8581(-17416) * 4;
			local171 = local8.method8575();
			local175 = local8.method8575();
			local179 = local8.method8581(-17416);
			if (local179 == 255) {
				local179 = -1;
			}
			local188 = local8.method8575();
			if (local23 >= 0 && local29 >= 0 && local23 < Static426.anInt6942 && Static280.anInt6752 > local29 && local33 >= 0 && local41 >= 0 && local33 < Static426.anInt6942 && local41 < Static280.anInt6752 && local155 != 65535) {
				local188 <<= 0x2;
				local167 <<= 0x2;
				local161 <<= 0x2;
				local41 = local41 * 512 + 256;
				local23 = local23 * 512 + 256;
				local33 = local33 * 512 + 256;
				local29 = local29 * 512 + 256;
				@Pc(308) Class4_Sub2_Sub1_Sub3 local308 = new Class4_Sub2_Sub1_Sub3(local155, Static548.anInt8645, Static548.anInt8645, local23, local29, local161, Static528.anInt8386 + local171, local175 + Static528.anInt8386, local179, local188, 0, local45, local167, local119, -1);
				local308.method7309(local33, local41, 3, Static324.method4554(Static548.anInt8645, local33, local41) - local167, local171 + Static528.anInt8386);
				Static120.aClass60_37.method1233(new Class2_Sub6_Sub17(local308));
			}
			return;
		}
		@Pc(486) int local486;
		@Pc(515) int local515;
		if (Static676.aClass281_17 == arg0) {
			local15 = local8.method8581(-17416);
			local19 = local8.method8581(-17416);
			local23 = local19 >> 2;
			local29 = Static259.anIntArray302[local23];
			local33 = local8.method8581(-17416);
			local41 = Static592.anInt9253 + (local33 >> 4 & 0x7);
			local45 = Static152.anInt2510 + (local33 & 0x7);
			local155 = local8.method8530();
			if (local23 == 11) {
				local23 = 10;
			}
			@Pc(384) Class81 local384 = Static148.aClass153_3.method3342(local155);
			local167 = 0;
			if (local384.aByteArray23 != null) {
				local171 = -1;
				for (local175 = 0; local175 < local384.aByteArray23.length; local175++) {
					if (local23 == local384.aByteArray23[local175]) {
						local171 = local175;
						break;
					}
				}
				local167 = local384.anIntArrayArray11[local171].length;
			}
			local171 = 0;
			if (local384.aShortArray29 != null) {
				local171 = local384.aShortArray29.length;
			}
			local175 = 0;
			if (local384.aShortArray28 != null) {
				local175 = local384.aShortArray28.length;
			}
			if ((local15 & 0x1) == 1) {
				Static119.method1747(local41, local29, local45, (Class202) null, Static548.anInt8645);
			} else {
				@Pc(450) int[] local450 = null;
				if ((local15 & 0x2) == 2) {
					local450 = new int[local167];
					for (local188 = 0; local188 < local167; local188++) {
						local450[local188] = local8.method8575();
					}
				}
				@Pc(476) short[] local476 = null;
				if ((local15 & 0x4) == 4) {
					local476 = new short[local171];
					for (local486 = 0; local486 < local171; local486++) {
						local476[local486] = (short) local8.method8575();
					}
				}
				@Pc(503) short[] local503 = null;
				if ((local15 & 0x8) == 8) {
					local503 = new short[local175];
					for (local515 = 0; local515 < local175; local515++) {
						local503[local515] = (short) local8.method8575();
					}
				}
				Static119.method1747(local41, local29, local45, new Class202((long) Static177.aLong107++, local450, local476, local503), Static548.anInt8645);
			}
		} else if (arg0 == Static61.aClass281_4) {
			local15 = local8.method8559();
			local19 = local8.method8593();
			local23 = Static592.anInt9253 + (local19 >> 4 & 0x7);
			local29 = Static152.anInt2510 + (local19 & 0x7);
			local33 = local8.method8588();
			local41 = local33 >> 2;
			local45 = local33 & 0x3;
			local155 = Static259.anIntArray302[local41];
			if (Static209.method2952(Static718.anInt10954) || local23 >= 0 && local29 >= 0 && Static426.anInt6942 > local23 && local29 < Static280.anInt6752) {
				Static283.method7819(local23, local45, Static548.anInt8645, local41, local29, local15, local155);
			}
		} else if (arg0 == Static233.aClass281_10) {
			local15 = local8.method8581(-17416);
			local19 = Static592.anInt9253 + (local15 >> 4 & 0x7);
			local23 = Static152.anInt2510 + (local15 & 0x7);
			local29 = local8.method8575();
			if (local29 == 65535) {
				local29 = -1;
			}
			local33 = local8.method8581(-17416);
			local41 = local8.method8575();
			local45 = local8.method8581(-17416);
			if (local19 >= 0 && local23 >= 0 && local19 < Static426.anInt6942 && local23 < Static280.anInt6752) {
				if (local29 != -1) {
					local155 = local19 * 512 + 256;
					local161 = local23 * 512 + 256;
					local167 = Static548.anInt8645;
					if (local167 < 3 && Static83.method1237(local19, local23)) {
						local167++;
					}
					@Pc(759) Class4_Sub2_Sub1_Sub1 local759 = new Class4_Sub2_Sub1_Sub1(local29, local41, Static548.anInt8645, local167, local155, Static324.method4554(Static548.anInt8645, local155, local161) - local33, local161, local19, local19, local23, local23, local45, false);
					Static211.aClass218_18.method5099(new Class2_Sub6_Sub2(local759), (long) (local19 << 16 | local23));
					return;
				}
				@Pc(784) Class2_Sub6_Sub2 local784 = (Class2_Sub6_Sub2) Static211.aClass218_18.method5095((long) (local19 << 16 | local23), 0);
				if (local784 != null) {
					local784.aClass4_Sub2_Sub1_Sub1_1.method185();
					local784.method9872();
				}
			}
		} else if (Static111.aClass281_5 == arg0) {
			local15 = local8.method8588();
			local19 = local15 >> 2;
			local23 = local15 & 0x3;
			local29 = Static259.anIntArray302[local19];
			local33 = local8.method8559();
			if (local33 == 65535) {
				local33 = -1;
			}
			local41 = local8.method8581(-17416);
			local45 = Static592.anInt9253 + (local41 >> 4 & 0x7);
			local155 = (local41 & 0x7) + Static152.anInt2510;
			Static162.method2426(local155, local33, local23, local19, local45, Static548.anInt8645, local29);
		} else if (Static346.aClass281_13 == arg0) {
			local15 = local8.method8559();
			local19 = local8.method8581(-17416);
			local23 = (local19 & 0x7) + Static152.anInt2510;
			local29 = local23 + Static224.anInt11062;
			local33 = Static592.anInt9253 + (local19 >> 4 & 0x7);
			local41 = Static243.anInt3820 + local33;
			@Pc(904) Class2_Sub53 local904 = (Class2_Sub53) Static596.aClass218_41.method5095((long) (local41 | local29 << 14 | Static548.anInt8645 << 28), 0);
			if (local904 != null) {
				for (@Pc(912) Class2_Sub48 local912 = (Class2_Sub48) local904.aClass60_217.method1226(7); local912 != null; local912 = (Class2_Sub48) local904.aClass60_217.method1228()) {
					if (local912.anInt8383 == (local15 & 0x7FFF)) {
						local912.method9872();
						break;
					}
				}
				if (local904.aClass60_217.method1221()) {
					local904.method9872();
				}
				if (local33 >= 0 && local23 >= 0 && local33 < Static426.anInt6942 && Static280.anInt6752 > local23) {
					Static246.method3454(Static548.anInt8645, local23, local33);
				}
			}
		} else if (Static383.aClass281_2 == arg0) {
			local15 = local8.method8581(-17416);
			local19 = Static592.anInt9253 * 2 + (local15 >> 4 & 0xF);
			local23 = Static152.anInt2510 * 2 + (local15 & 0xF);
			local29 = local8.method8581(-17416);
			@Pc(1017) boolean local1017 = (local29 & 0x1) != 0;
			@Pc(1029) boolean local1029 = (local29 & 0x2) != 0;
			local45 = local1029 ? local29 >> 2 : -1;
			local155 = local8.method8536() + local19;
			local161 = local8.method8536() + local23;
			local167 = local8.method8598();
			local171 = local8.method8598();
			local175 = local8.method8575();
			local179 = local8.method8581(-17416);
			if (local1029) {
				local179 = (byte) local179;
			} else {
				local179 *= 4;
			}
			local188 = local8.method8581(-17416) * 4;
			local486 = local8.method8575();
			local515 = local8.method8575();
			@Pc(1095) int local1095 = local8.method8581(-17416);
			@Pc(1099) int local1099 = local8.method8575();
			if (local1095 == 255) {
				local1095 = -1;
			}
			if (local19 >= 0 && local23 >= 0 && local19 < Static426.anInt6942 * 2 && local23 < Static426.anInt6942 * 2 && local155 >= 0 && local161 >= 0 && Static280.anInt6752 * 2 > local155 && Static280.anInt6752 * 2 > local161 && local175 != 65535) {
				local179 <<= 0x2;
				local19 *= 256;
				local161 = local161 * 256;
				local23 *= 256;
				local188 <<= 0x2;
				local1099 <<= 0x2;
				local155 *= 256;
				if (local167 != 0 && local45 != -1) {
					@Pc(1210) Class4_Sub2_Sub1_Sub2 local1210 = null;
					@Pc(1220) int local1220;
					if (local167 < 0) {
						local1220 = -local167 - 1;
						if (local1220 == Class4_Sub2_Sub1_Sub2.lb) {
							local1210 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2;
						} else {
							local1210 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local1220];
						}
					} else {
						local1220 = local167 - 1;
						@Pc(1246) Class2_Sub49 local1246 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local1220, 0);
						if (local1246 != null) {
							local1210 = local1246.aClass4_Sub2_Sub1_Sub2_Sub2_3;
						}
					}
					if (local1210 != null) {
						@Pc(1257) Class49 local1257 = local1210.method2064(-60);
						if (local1257.anIntArrayArray6 != null && local1257.anIntArrayArray6[local45] != null) {
							local179 -= local1257.anIntArrayArray6[local45][1];
						}
						if (local1257.anIntArrayArray7 != null && local1257.anIntArrayArray7[local45] != null) {
							local179 -= local1257.anIntArrayArray7[local45][1];
						}
					}
				}
				@Pc(1318) Class4_Sub2_Sub1_Sub3 local1318 = new Class4_Sub2_Sub1_Sub3(local175, Static548.anInt8645, Static548.anInt8645, local19, local23, local179, Static528.anInt8386 + local486, Static528.anInt8386 + local515, local1095, local1099, local167, local171, local188, local1017, local45);
				local1318.method7309(local155, local161, 3, Static324.method4554(Static548.anInt8645, local155, local161) - local188, local486 + Static528.anInt8386);
				Static120.aClass60_37.method1233(new Class2_Sub6_Sub17(local1318));
			}
		} else if (arg0 == Static151.aClass281_15) {
			local15 = local8.method8575();
			local19 = local8.method8581(-17416);
			Static148.aClass153_3.method3342(local15).method1641(local19);
		} else if (Static476.aClass281_14 == arg0) {
			local15 = local8.method8581(-17416);
			local19 = (local15 & 0x7) + Static152.anInt2510;
			local23 = local19 + Static224.anInt11062;
			local29 = Static592.anInt9253 + (local15 >> 4 & 0x7);
			local33 = Static243.anInt3820 + local29;
			local41 = local8.method8575();
			local45 = local8.method8575();
			local155 = local8.method8575();
			if (Static596.aClass218_41 != null) {
				@Pc(1422) Class2_Sub53 local1422 = (Class2_Sub53) Static596.aClass218_41.method5095((long) (local33 | Static548.anInt8645 << 28 | local23 << 14), 0);
				if (local1422 != null) {
					for (@Pc(1430) Class2_Sub48 local1430 = (Class2_Sub48) local1422.aClass60_217.method1226(7); local1430 != null; local1430 = (Class2_Sub48) local1422.aClass60_217.method1228()) {
						if ((local41 & 0x7FFF) == local1430.anInt8383 && local45 == local1430.anInt8384) {
							local1430.method9872();
							local1430.anInt8384 = local155;
							Static421.method6145(local1430, local33, Static548.anInt8645, local23);
							break;
						}
					}
					if (local29 >= 0 && local19 >= 0 && local29 < Static426.anInt6942 && local19 < Static280.anInt6752) {
						Static246.method3454(Static548.anInt8645, local19, local29);
					}
				}
			}
		} else if (Static213.aClass281_9 == arg0) {
			local15 = local8.method8581(-17416);
			local19 = Static592.anInt9253 + (local15 >> 4 & 0x7);
			local23 = Static152.anInt2510 + (local15 & 0x7);
			local29 = local8.method8575();
			if (local29 == 65535) {
				local29 = -1;
			}
			local33 = local8.method8581(-17416);
			local41 = local33 >> 4 & 0xF;
			local45 = local33 & 0x7;
			local155 = local8.method8581(-17416);
			local161 = local8.method8581(-17416);
			local167 = local8.method8575();
			if (local19 >= 0 && local23 >= 0 && Static426.anInt6942 > local19 && local23 < Static280.anInt6752) {
				local171 = local41 + 1;
				if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] >= local19 - local171 && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] <= local171 + local19 && local23 - local171 <= Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0] && local171 + local23 >= Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0]) {
					Static706.method9436(local29, local155, local41 + (local23 << 8) + (local19 << 16) + (Static548.anInt8645 << 24), local161, local167, local45);
				}
			}
		} else if (Static127.aClass281_8 == arg0) {
			local15 = local8.method8593();
			local19 = local15 >> 2;
			local23 = local15 & 0x3;
			local29 = Static259.anIntArray302[local19];
			local33 = local8.method8581(-17416);
			local41 = (local33 >> 4 & 0x7) + Static592.anInt9253;
			local45 = Static152.anInt2510 + (local33 & 0x7);
			if (Static209.method2952(Static718.anInt10954) || local41 >= 0 && local45 >= 0 && local41 < Static426.anInt6942 && Static280.anInt6752 > local45) {
				Static283.method7819(local41, local23, Static548.anInt8645, local19, local45, -1, local29);
			}
		} else if (arg0 == Static635.aClass281_16) {
			local15 = local8.method8581(-17416);
			local19 = (local15 >> 4 & 0x7) + Static592.anInt9253;
			local23 = Static152.anInt2510 + (local15 & 0x7);
			local29 = local8.method8575();
			if (local29 == 65535) {
				local29 = -1;
			}
			local33 = local8.method8581(-17416);
			local41 = local33 >> 4 & 0xF;
			local45 = local33 & 0x7;
			local155 = local8.method8581(-17416);
			local161 = local8.method8581(-17416);
			local167 = local8.method8575();
			if (local19 >= 0 && local23 >= 0 && local19 < Static426.anInt6942 && Static280.anInt6752 > local23) {
				local171 = local41 + 1;
				if (local19 - local171 <= Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] <= local19 + local171 && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0] >= local23 - local171 && local171 + local23 >= Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0]) {
					Static586.method8129(0, local167, local29, local161, local45, (local19 << 16) + ((Static548.anInt8645 << 24) + (local23 << 8)) + local41, local155);
				}
			}
		} else if (Static54.aClass281_3 == arg0) {
			local8.method8581(-17416);
			local15 = local8.method8581(-17416);
			local19 = (local15 >> 4 & 0x7) + Static592.anInt9253;
			local23 = (local15 & 0x7) + Static152.anInt2510;
			local29 = local8.method8575();
			local33 = local8.method8581(-17416);
			local41 = local8.method8583();
			@Pc(1948) String local1948 = local8.method8553();
			Static513.method7265(local29, local1948, Static548.anInt8645, local23, local33, local41, local19);
		} else if (Static717.aClass281_18 == arg0) {
			local15 = local8.method8554(31493);
			local19 = local8.method8530();
			local23 = local8.method8581(-17416);
			local29 = Static152.anInt2510 + (local23 & 0x7);
			local33 = Static224.anInt11062 + local29;
			local41 = (local23 >> 4 & 0x7) + Static592.anInt9253;
			local45 = Static243.anInt3820 + local41;
			local155 = local8.method8559();
			if (local15 != Class4_Sub2_Sub1_Sub2.lb) {
				@Pc(2033) boolean local2033 = local41 >= 0 && local29 >= 0 && Static426.anInt6942 > local41 && local29 < Static280.anInt6752;
				if (local2033 || Static209.method2952(Static718.anInt10954)) {
					Static421.method6145(new Class2_Sub48(local19, local155), local45, Static548.anInt8645, local33);
					if (local2033) {
						Static246.method3454(Static548.anInt8645, local29, local41);
					}
				}
			}
		} else {
			Static329.method4572("T3 - " + arg0, (Throwable) null);
			Static264.method3744(false);
		}
	}
}
