import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString122;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "[I")
	public static int[] anIntArray731;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
	public static int anInt9621 = -1;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
	public static int anInt9625 = 500;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	public static void method7854() {
		Static330.aBoolean415 = false;
		Static41.method573(Static519.anInt8950, Static377.anInt6491, Static83.anInt1402, Static353.anInt6216);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7855(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static300.anInt4872 >= 200 && !Static2.aBoolean4 || Static300.anInt4872 >= 200) {
			Static418.method6132(Static141.aClass104_9.method2145(Static470.anInt7957));
			local30 = Static141.aClass104_10.method2145(Static470.anInt7957);
			if (local30 != null) {
				Static418.method6132(local30);
			}
			return;
		}
		local30 = Static502.method6919(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < Static300.anInt4872; local46++) {
			@Pc(54) String local54 = Static502.method6919(Static489.aStringArray30[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static418.method6132(arg0 + Static141.aClass104_83.method2145(Static470.anInt7957));
				return;
			}
			if (Static478.aStringArray28[local46] != null) {
				local85 = Static502.method6919(Static478.aStringArray28[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static418.method6132(arg0 + Static141.aClass104_83.method2145(Static470.anInt7957));
					return;
				}
			}
		}
		for (@Pc(112) int local112 = 0; local112 < Static383.anInt6691; local112++) {
			local85 = Static502.method6919(Static353.aStringArray23[local112]);
			if (local85 != null && local85.equals(local30)) {
				Static418.method6132(Static141.aClass104_88.method2145(Static470.anInt7957) + arg0 + Static141.aClass104_89.method2145(Static470.anInt7957));
				return;
			}
			if (Static129.aStringArray10[local112] != null) {
				@Pc(156) String local156 = Static502.method6919(Static129.aStringArray10[local112]);
				if (local156 != null && local156.equals(local30)) {
					Static418.method6132(Static141.aClass104_88.method2145(Static470.anInt7957) + arg0 + Static141.aClass104_89.method2145(Static470.anInt7957));
					return;
				}
			}
		}
		if (Static502.method6919(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108).equals(local30)) {
			Static418.method6132(Static141.aClass104_86.method2145(Static470.anInt7957));
		} else {
			Static136.method2051(Static133.aClass160_64);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(arg0));
			Static218.aClass6_Sub14_Sub2_1.method5989(arg0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!w;III[Z)V")
	public static void method7856(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static285.aClass60Array8 == Static127.aClass60Array7) {
			return;
		}
		@Pc(9) int local9 = Static34.aClass60Array10[arg1].sa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class60 local22 = Static34.aClass60Array10[local11];
				if (local22 != null) {
					local22.FA(arg0, arg2, local9 - local22.sa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!nn;)V")
	public static void method7858(@OriginalArg(1) Class216 arg0) {
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		if (Static39.aClass216_3 == arg0) {
			local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
			local19 = Static463.anInt9619 + (local12 & 0x7);
			local24 = local19 + Static167.anInt3048;
			local32 = (local12 >> 4 & 0x7) + Static479.anInt9649;
			local36 = Static218.anInt3718 + local32;
			local40 = Static420.aClass6_Sub14_Sub2_2.method6006();
			local44 = Static420.aClass6_Sub14_Sub2_2.method6006();
			local48 = Static420.aClass6_Sub14_Sub2_2.method6006();
			if (Static303.aClass212_22 != null) {
				@Pc(65) Class6_Sub32 local65 = (Class6_Sub32) Static303.aClass212_22.method5106((long) (Static392.anInt6964 << 28 | local24 << 14 | local36));
				if (local65 != null) {
					for (@Pc(73) Class6_Sub38 local73 = (Class6_Sub38) local65.aClass275_97.method6366(); local73 != null; local73 = (Class6_Sub38) local65.aClass275_97.method6364()) {
						if (local73.anInt5948 == (local40 & 0x7FFF) && local44 == local73.anInt5951) {
							local73.method7849();
							local73.anInt5951 = local48;
							Static51.method684(Static392.anInt6964, local24, local36, local73);
							break;
						}
					}
					if (local32 >= 0 && local19 >= 0 && Static301.anInt4912 > local32 && local19 < Static473.anInt7969) {
						Static20.method287(Static392.anInt6964, local32, local19);
					}
				}
			}
		} else if (Static320.aClass216_9 == arg0) {
			local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
			local19 = (local12 & 0x7) + Static463.anInt9619;
			local24 = Static167.anInt3048 + local19;
			local32 = Static479.anInt9649 + (local12 >> 4 & 0x7);
			local36 = local32 + Static218.anInt3718;
			local40 = Static420.aClass6_Sub14_Sub2_2.method5982();
			local44 = Static420.aClass6_Sub14_Sub2_2.method6006();
			@Pc(195) boolean local195 = local32 >= 0 && local19 >= 0 && Static301.anInt4912 > local32 && Static473.anInt7969 > local19;
			if (local195 || Static24.method4703(Static228.anInt3904)) {
				Static51.method684(Static392.anInt6964, local24, local36, new Class6_Sub38(local44, local40));
				if (local195) {
					Static20.method287(Static392.anInt6964, local32, local19);
				}
			}
		} else {
			@Pc(274) int local274;
			@Pc(299) int local299;
			if (arg0 == Static431.aClass216_14) {
				local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
				local19 = Static479.anInt9649 + (local12 >> 4 & 0x7);
				local24 = Static463.anInt9619 + (local12 & 0x7);
				local32 = Static420.aClass6_Sub14_Sub2_2.method6006();
				if (local32 == 65535) {
					local32 = -1;
				}
				local36 = Static420.aClass6_Sub14_Sub2_2.method6041();
				local40 = local36 >> 4 & 0xF;
				local44 = local36 & 0x7;
				local48 = Static420.aClass6_Sub14_Sub2_2.method6041();
				local274 = Static420.aClass6_Sub14_Sub2_2.method6041();
				if (local19 >= 0 && local24 >= 0 && Static301.anInt4912 > local19 && local24 < Static473.anInt7969) {
					local299 = local40 + 1;
					if (local19 - local299 <= Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] && Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] <= local299 + local19 && local24 - local299 <= Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0] && local299 + local24 >= Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0]) {
						Static130.method1959(local274, (local19 << 16) + ((Static392.anInt6964 << 24) - (-(local24 << 8) - local40)), local44, local32, local48);
					}
				}
			} else if (arg0 == Static467.aClass216_15) {
				local12 = Static420.aClass6_Sub14_Sub2_2.method6006();
				local19 = Static420.aClass6_Sub14_Sub2_2.method6041();
				Static260.aClass100_1.method2008(local12).method6971(local19);
			} else {
				@Pc(449) int local449;
				@Pc(453) int local453;
				@Pc(457) int local457;
				@Pc(461) int local461;
				@Pc(565) Class29_Sub2_Sub4 local565;
				if (Static576.aClass216_17 == arg0) {
					local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
					@Pc(399) boolean local399 = (local12 & 0x80) != 0;
					local24 = Static479.anInt9649 + (local12 >> 3 & 0x7);
					local32 = (local12 & 0x7) + Static463.anInt9619;
					local36 = local24 + Static420.aClass6_Sub14_Sub2_2.method6034();
					local40 = local32 + Static420.aClass6_Sub14_Sub2_2.method6034();
					local44 = Static420.aClass6_Sub14_Sub2_2.method6008();
					local48 = Static420.aClass6_Sub14_Sub2_2.method6006();
					local274 = Static420.aClass6_Sub14_Sub2_2.method6041() * 4;
					local299 = Static420.aClass6_Sub14_Sub2_2.method6041() * 4;
					local449 = Static420.aClass6_Sub14_Sub2_2.method6006();
					local453 = Static420.aClass6_Sub14_Sub2_2.method6006();
					local457 = Static420.aClass6_Sub14_Sub2_2.method6041();
					local461 = Static420.aClass6_Sub14_Sub2_2.method6006();
					if (local457 == 255) {
						local457 = -1;
					}
					if (local24 >= 0 && local32 >= 0 && Static301.anInt4912 > local24 && local32 < Static473.anInt7969 && local36 >= 0 && local40 >= 0 && Static301.anInt4912 > local36 && local40 < Static473.anInt7969 && local48 != 65535) {
						local40 = local40 * 512 + 256;
						local274 <<= 0x2;
						local461 <<= 0x2;
						local32 = local32 * 512 + 256;
						local24 = local24 * 512 + 256;
						local299 <<= 0x2;
						local36 = local36 * 512 + 256;
						local565 = new Class29_Sub2_Sub4(local48, Static392.anInt6964, local24, local32, local274, Static358.anInt6263 + local449, Static358.anInt6263 + local453, local457, local461, local44, local299, local399);
						local565.method6608(local40, Static490.method6768(local36, Static392.anInt6964, local40) - local299, Static358.anInt6263 + local449, local36);
						Static475.aClass275_170.method6370(new Class6_Sub1_Sub3(local565));
					}
				} else if (Static255.aClass216_6 == arg0) {
					local12 = Static420.aClass6_Sub14_Sub2_2.method6012();
					local19 = (local12 >> 4 & 0x7) + Static479.anInt9649;
					local24 = Static463.anInt9619 + (local12 & 0x7);
					local32 = Static420.aClass6_Sub14_Sub2_2.method6012();
					local36 = local32 >> 2;
					local40 = local32 & 0x3;
					local44 = Static242.anIntArray431[local36];
					if (Static24.method4703(Static228.anInt3904) || local19 >= 0 && local24 >= 0 && Static301.anInt4912 > local19 && local24 < Static473.anInt7969) {
						Static218.method3199(local19, local40, local44, local36, -1, local24, Static392.anInt6964);
					}
				} else if (arg0 == Static302.aClass216_10) {
					local12 = Static420.aClass6_Sub14_Sub2_2.method5982();
					local19 = Static420.aClass6_Sub14_Sub2_2.method6012();
					local24 = Static463.anInt9619 + (local19 & 0x7);
					local32 = Static167.anInt3048 + local24;
					local36 = Static479.anInt9649 + (local19 >> 4 & 0x7);
					local40 = local36 + Static218.anInt3718;
					@Pc(713) Class6_Sub32 local713 = (Class6_Sub32) Static303.aClass212_22.method5106((long) (Static392.anInt6964 << 28 | local32 << 14 | local40));
					if (local713 != null) {
						for (@Pc(721) Class6_Sub38 local721 = (Class6_Sub38) local713.aClass275_97.method6366(); local721 != null; local721 = (Class6_Sub38) local713.aClass275_97.method6364()) {
							if (local721.anInt5948 == (local12 & 0x7FFF)) {
								local721.method7849();
								break;
							}
						}
						if (local713.aClass275_97.method6371()) {
							local713.method7849();
						}
						if (local36 >= 0 && local24 >= 0 && Static301.anInt4912 > local36 && local24 < Static473.anInt7969) {
							Static20.method287(Static392.anInt6964, local36, local24);
						}
					}
				} else if (arg0 == Static20.aClass216_2) {
					Static420.aClass6_Sub14_Sub2_2.method6041();
					local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
					local19 = Static479.anInt9649 + (local12 >> 4 & 0x7);
					local24 = (local12 & 0x7) + Static463.anInt9619;
					local32 = Static420.aClass6_Sub14_Sub2_2.method6006();
					local36 = Static420.aClass6_Sub14_Sub2_2.method6041();
					local40 = Static420.aClass6_Sub14_Sub2_2.method5988();
					@Pc(820) String local820 = Static420.aClass6_Sub14_Sub2_2.method5991();
					Static320.method4180(local820, local32, local24, local40, local19, local36, Static392.anInt6964);
				} else {
					@Pc(867) boolean local867;
					if (arg0 == Static9.aClass216_1) {
						local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local19 = Static479.anInt9649 * 2 + (local12 >> 4 & 0xF);
						local24 = (local12 & 0xF) + Static463.anInt9619 * 2;
						local867 = Static420.aClass6_Sub14_Sub2_2.method6041() != 0;
						local36 = Static420.aClass6_Sub14_Sub2_2.method6034() + local19;
						local40 = Static420.aClass6_Sub14_Sub2_2.method6034() + local24;
						local44 = Static420.aClass6_Sub14_Sub2_2.method6008();
						local48 = Static420.aClass6_Sub14_Sub2_2.method6006();
						local274 = Static420.aClass6_Sub14_Sub2_2.method6041() * 4;
						local299 = Static420.aClass6_Sub14_Sub2_2.method6041() * 4;
						local449 = Static420.aClass6_Sub14_Sub2_2.method6006();
						local453 = Static420.aClass6_Sub14_Sub2_2.method6006();
						local457 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local461 = Static420.aClass6_Sub14_Sub2_2.method6006();
						if (local457 == 255) {
							local457 = -1;
						}
						if (local19 >= 0 && local24 >= 0 && Static301.anInt4912 * 2 > local19 && Static301.anInt4912 * 2 > local24 && local36 >= 0 && local40 >= 0 && Static473.anInt7969 * 2 > local36 && local40 < Static473.anInt7969 * 2 && local48 != 65535) {
							local461 <<= 0x2;
							local40 *= 256;
							local274 <<= 0x2;
							local24 *= 256;
							local36 = local36 * 256;
							local299 <<= 0x2;
							local19 = local19 * 256;
							local565 = new Class29_Sub2_Sub4(local48, Static392.anInt6964, local19, local24, local274, local449 + Static358.anInt6263, Static358.anInt6263 + local453, local457, local461, local44, local299, local867);
							local565.method6608(local40, Static490.method6768(local36, Static392.anInt6964, local40) - local299, Static358.anInt6263 + local449, local36);
							Static475.aClass275_170.method6370(new Class6_Sub1_Sub3(local565));
						}
					} else if (arg0 == Static276.aClass216_7) {
						@Pc(1055) byte local1055 = Static420.aClass6_Sub14_Sub2_2.method5983();
						local19 = Static420.aClass6_Sub14_Sub2_2.method6020();
						local24 = Static479.anInt9649 + (local19 >> 4 & 0x7);
						local32 = Static463.anInt9619 + (local19 & 0x7);
						local36 = Static420.aClass6_Sub14_Sub2_2.method6012();
						local40 = local36 >> 2;
						local44 = local36 & 0x3;
						@Pc(1091) byte local1091 = Static420.aClass6_Sub14_Sub2_2.method5983();
						local274 = Static420.aClass6_Sub14_Sub2_2.method5978();
						local299 = Static420.aClass6_Sub14_Sub2_2.method5996();
						@Pc(1103) byte local1103 = Static420.aClass6_Sub14_Sub2_2.method5983();
						local453 = Static420.aClass6_Sub14_Sub2_2.method5996();
						@Pc(1113) byte local1113 = Static420.aClass6_Sub14_Sub2_2.method6034();
						local461 = Static420.aClass6_Sub14_Sub2_2.method5996();
						if (!Static176.aClass121_5.method7142()) {
							Static15.method6950(local461, local299, local1103, local24, Static392.anInt6964, local1055, local1091, local453, local40, local1113, local274, local44, local32);
						}
					} else if (arg0 == Static336.aClass216_12) {
						local12 = Static420.aClass6_Sub14_Sub2_2.method6032();
						if (local12 == 65535) {
							local12 = -1;
						}
						local19 = Static420.aClass6_Sub14_Sub2_2.method6026();
						local24 = Static479.anInt9649 + (local19 >> 4 & 0x7);
						local32 = (local19 & 0x7) + Static463.anInt9619;
						local36 = Static420.aClass6_Sub14_Sub2_2.method6012();
						local40 = local36 >> 2;
						local44 = local36 & 0x3;
						local48 = Static242.anIntArray431[local40];
						Static147.method2191(local12, local24, local44, local32, Static392.anInt6964, local48, local40);
					} else if (Static321.aClass216_11 == arg0) {
						local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local19 = Static479.anInt9649 + (local12 >> 4 & 0x7);
						local24 = (local12 & 0x7) + Static463.anInt9619;
						local32 = Static420.aClass6_Sub14_Sub2_2.method6006();
						local36 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local40 = Static420.aClass6_Sub14_Sub2_2.method6006();
						local44 = Static420.aClass6_Sub14_Sub2_2.method6041();
						if (local19 >= 0 && local24 >= 0 && Static301.anInt4912 > local19 && Static473.anInt7969 > local24) {
							local48 = local19 * 512 + 256;
							local274 = local24 * 512 + 256;
							local299 = Static392.anInt6964;
							if (local299 < 3 && Static26.method401(local24, local19)) {
								local299++;
							}
							@Pc(1303) Class29_Sub2_Sub2 local1303 = new Class29_Sub2_Sub2(local32, local40, Static358.anInt6263, Static392.anInt6964, local299, local48, Static490.method6768(local48, Static392.anInt6964, local274) - local36, local274, local19, local19, local24, local24, local44);
							Static463.aClass275_203.method6370(new Class6_Sub1_Sub11(local1303));
						}
					} else if (Static565.aClass216_16 == arg0) {
						local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local19 = (local12 >> 4 & 0x7) + Static479.anInt9649;
						local24 = (local12 & 0x7) + Static463.anInt9619;
						local32 = Static420.aClass6_Sub14_Sub2_2.method6006();
						if (local32 == 65535) {
							local32 = -1;
						}
						local36 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local40 = local36 >> 4 & 0xF;
						local44 = local36 & 0x7;
						local48 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local274 = Static420.aClass6_Sub14_Sub2_2.method6041();
						if (local19 >= 0 && local24 >= 0 && local19 < Static301.anInt4912 && Static473.anInt7969 > local24) {
							local299 = local40 + 1;
							if (local19 - local299 <= Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] && Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] <= local19 + local299 && local24 - local299 <= Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0] && local299 + local24 >= Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0]) {
								Static387.method5774(local48, local32, local44, local274, local40 + (Static392.anInt6964 << 24) + (local19 << 16) + (local24 << 8));
							}
						}
					} else if (Static359.aClass216_13 == arg0) {
						local12 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local19 = (local12 >> 4 & 0xF) + Static479.anInt9649 * 2;
						local24 = (local12 & 0xF) + Static463.anInt9619 * 2;
						local867 = Static420.aClass6_Sub14_Sub2_2.method6041() != 0;
						local36 = Static420.aClass6_Sub14_Sub2_2.method6034() + local19;
						local40 = Static420.aClass6_Sub14_Sub2_2.method6034() + local24;
						local44 = Static420.aClass6_Sub14_Sub2_2.method6008();
						local48 = Static420.aClass6_Sub14_Sub2_2.method6008();
						local274 = Static420.aClass6_Sub14_Sub2_2.method6006();
						@Pc(1509) byte local1509 = Static420.aClass6_Sub14_Sub2_2.method6034();
						local449 = Static420.aClass6_Sub14_Sub2_2.method6041() * 4;
						local453 = Static420.aClass6_Sub14_Sub2_2.method6006();
						local457 = Static420.aClass6_Sub14_Sub2_2.method6006();
						local461 = Static420.aClass6_Sub14_Sub2_2.method6041();
						if (local461 == 255) {
							local461 = -1;
						}
						@Pc(1538) int local1538 = Static420.aClass6_Sub14_Sub2_2.method6006();
						if (local19 >= 0 && local24 >= 0 && Static301.anInt4912 * 2 > local19 && Static301.anInt4912 * 2 > local24 && local36 >= 0 && local40 >= 0 && local36 < Static473.anInt7969 * 2 && local40 < Static473.anInt7969 * 2 && local274 != 65535) {
							local19 *= 256;
							local40 *= 256;
							local36 *= 256;
							local449 <<= 0x2;
							local299 = local1509 << 2;
							local1538 <<= 0x2;
							local24 *= 256;
							if (local44 != 0) {
								@Pc(1619) Class29_Sub2_Sub1 local1619 = null;
								@Pc(1636) int local1636;
								@Pc(1626) int local1626;
								@Pc(1630) int local1630;
								if (local44 < 0) {
									local1626 = -local44 - 1;
									local1630 = local1626 & 0x7FF;
									local1636 = local1626 >> 11 & 0xF;
									if (Static44.anInt711 == local1630) {
										local1619 = Static426.aClass29_Sub2_Sub1_Sub2_2;
									} else {
										local1619 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local1630];
									}
								} else {
									local1626 = local44 - 1;
									local1630 = local1626 & 0x7FF;
									local1636 = local1626 >> 11 & 0xF;
									@Pc(1672) Class6_Sub28 local1672 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local1630);
									if (local1672 != null) {
										local1619 = local1672.aClass29_Sub2_Sub1_Sub1_2;
									}
								}
								if (local1619 != null) {
									@Pc(1683) Class120 local1683 = local1619.method7009();
									if (local1683.anIntArrayArray38 != null && local1683.anIntArrayArray38[local1636] != null) {
										local1630 = local1683.anIntArrayArray38[local1636][0];
										@Pc(1705) int local1705 = local1683.anIntArrayArray38[local1636][2];
										@Pc(1710) int local1710 = local1619.aClass293_7.method6528();
										@Pc(1714) int local1714 = Class138.anIntArray392[local1710];
										@Pc(1718) int local1718 = Class138.anIntArray393[local1710];
										@Pc(1729) int local1729 = local1705 * local1714 + local1718 * local1630 >> 14;
										@Pc(1740) int local1740 = local1718 * local1705 - local1714 * local1630 >> 14;
										local24 += local1740;
										local19 += local1729;
										local299 -= local1683.anIntArrayArray38[local1636][1];
									}
								}
							}
							@Pc(1779) Class29_Sub2_Sub4 local1779 = new Class29_Sub2_Sub4(local274, Static392.anInt6964, local19, local24, local299, Static358.anInt6263 + local453, Static358.anInt6263 + local457, local461, local1538, local48, local449, local867);
							local1779.method6608(local40, Static490.method6768(local36, Static392.anInt6964, local40) - local449, Static358.anInt6263 + local453, local36);
							Static475.aClass275_170.method6370(new Class6_Sub1_Sub3(local1779));
						}
					} else if (Static123.aClass216_5 == arg0) {
						local12 = Static420.aClass6_Sub14_Sub2_2.method5996();
						local19 = Static420.aClass6_Sub14_Sub2_2.method5996();
						local24 = Static420.aClass6_Sub14_Sub2_2.method5982();
						local32 = Static420.aClass6_Sub14_Sub2_2.method6041();
						local36 = Static463.anInt9619 + (local32 & 0x7);
						local40 = local36 + Static167.anInt3048;
						local44 = (local32 >> 4 & 0x7) + Static479.anInt9649;
						local48 = local44 + Static218.anInt3718;
						if (local12 != Static44.anInt711) {
							@Pc(1877) boolean local1877 = local44 >= 0 && local36 >= 0 && Static301.anInt4912 > local44 && local36 < Static473.anInt7969;
							if (local1877 || Static24.method4703(Static228.anInt3904)) {
								Static51.method684(Static392.anInt6964, local40, local48, new Class6_Sub38(local19, local24));
								if (local1877) {
									Static20.method287(Static392.anInt6964, local44, local36);
								}
							}
						}
					} else if (arg0 == Static53.aClass216_4) {
						local12 = Static420.aClass6_Sub14_Sub2_2.method6026();
						local19 = Static479.anInt9649 + (local12 >> 4 & 0x7);
						local24 = (local12 & 0x7) + Static463.anInt9619;
						local32 = Static420.aClass6_Sub14_Sub2_2.method6026();
						local36 = local32 >> 2;
						local40 = local32 & 0x3;
						local44 = Static242.anIntArray431[local36];
						local48 = Static420.aClass6_Sub14_Sub2_2.method6006();
						if (Static24.method4703(Static228.anInt3904) || local19 >= 0 && local24 >= 0 && Static301.anInt4912 > local19 && local24 < Static473.anInt7969) {
							Static218.method3199(local19, local40, local44, local36, local48, local24, Static392.anInt6964);
						}
					} else {
						Static169.method2641("T3 - " + arg0, null);
						Static155.method2280(false);
					}
				}
			}
		}
	}
}
