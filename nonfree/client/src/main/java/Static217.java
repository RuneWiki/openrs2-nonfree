import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ns", name = "N", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!ns", name = "Q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "I")
	public static int anInt4544;

	@OriginalMember(owner = "client!ns", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ns", name = "O", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!ns", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString167 = " is already on your friend list.";

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method3757(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V")
	public static void method3758() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(28) int local28;
		@Pc(36) int local36;
		if (Static94.anInt2092 == 40) {
			local12 = Static200.aClass4_Sub7_Sub1_2.method2361();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static264.anIntArray302[local16];
			local28 = Static200.aClass4_Sub7_Sub1_2.method2361();
			local36 = (local28 >> 4 & 0x7) + Static37.anInt825;
			local43 = Static212.anInt4423 + (local28 & 0x7);
			local47 = Static200.aClass4_Sub7_Sub1_2.method2386();
			if (local36 >= 0 && local43 >= 0 && local36 < Static92.anInt2048 && local43 < Static290.anInt5893) {
				Static322.method5312(local16, -1, local47, local20, Static279.anInt5645, local36, local24, 0, local43);
			}
			return;
		}
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(142) int local142;
		@Pc(157) int local157;
		@Pc(368) Class2_Sub2_Sub5 local368;
		@Pc(128) int local128;
		@Pc(146) int local146;
		if (Static94.anInt2092 == 203) {
			local12 = Static200.aClass4_Sub7_Sub1_2.method2380();
			local16 = (local12 >> 4 & 0xF) + Static37.anInt825 * 2;
			local20 = Static212.anInt4423 * 2 + (local12 & 0xF);
			local24 = local16 + Static200.aClass4_Sub7_Sub1_2.method2393();
			local28 = local20 + Static200.aClass4_Sub7_Sub1_2.method2393();
			local36 = Static200.aClass4_Sub7_Sub1_2.method2396();
			local43 = Static200.aClass4_Sub7_Sub1_2.method2396();
			local47 = Static200.aClass4_Sub7_Sub1_2.method2404();
			local128 = Static200.aClass4_Sub7_Sub1_2.method2393();
			local134 = Static200.aClass4_Sub7_Sub1_2.method2380() * 4;
			local138 = Static200.aClass4_Sub7_Sub1_2.method2404();
			local142 = Static200.aClass4_Sub7_Sub1_2.method2404();
			local146 = Static200.aClass4_Sub7_Sub1_2.method2380();
			if (local146 == 255) {
				local146 = -1;
			}
			local157 = Static200.aClass4_Sub7_Sub1_2.method2380();
			if (local16 >= 0 && local20 >= 0 && local16 < 208 && local20 < 208 && local24 >= 0 && local28 >= 0 && local24 < 208 && local28 < 208 && local47 != 65535) {
				local16 *= 64;
				local28 = local28 * 64;
				local24 = local24 * 64;
				local20 *= 64;
				if (local36 != 0) {
					@Pc(235) Class2_Sub2_Sub1 local235;
					@Pc(221) int local221;
					@Pc(225) int local225;
					@Pc(231) int local231;
					if (local36 >= 0) {
						local221 = local36 - 1;
						local225 = local221 & 0x7FF;
						local231 = local221 >> 11 & 0xF;
						local235 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local225];
					} else {
						local221 = -local36 - 1;
						local225 = local221 & 0x7FF;
						local231 = local221 >> 11 & 0xF;
						if (local225 == Static321.anInt6343) {
							local235 = Static110.aClass2_Sub2_Sub1_Sub1_1;
						} else {
							local235 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local225];
						}
					}
					if (local235 != null) {
						@Pc(269) Class10 local269 = local235.method5428();
						if (local269.anIntArrayArray6 != null && local269.anIntArrayArray6[local231] != null) {
							local225 = local269.anIntArrayArray6[local231][0];
							@Pc(291) int local291 = local269.anIntArrayArray6[local231][2];
							@Pc(296) int local296 = local235.aClass108_7.method2976();
							@Pc(300) int local300 = Class4_Sub4_Sub25.anIntArray384[local296];
							@Pc(304) int local304 = Class4_Sub4_Sub25.anIntArray383[local296];
							@Pc(314) int local314 = local300 * local291 + local304 * local225 >> 15;
							@Pc(324) int local324 = local291 * local304 - local300 * local225 >> 15;
							local128 -= local269.anIntArrayArray6[local231][1];
							local20 += local324;
							local16 += local314;
						}
					}
				}
				local368 = new Class2_Sub2_Sub5(local47, Static279.anInt5645, local16, local20, Static119.method2125(local16, local20, Static279.anInt5645) - local128, local138 + Static342.anInt6706, Static342.anInt6706 + local142, local146, local157, local43, local134);
				local368.method3843(Static342.anInt6706 + local138, Static119.method2125(local24, local28, Static279.anInt5645) - local134, local28, local24);
				Static146.aClass130_70.method3510(new Class4_Sub1_Sub2(local368));
			}
		} else if (Static94.anInt2092 == 114) {
			local12 = Static200.aClass4_Sub7_Sub1_2.method2404();
			local16 = Static200.aClass4_Sub7_Sub1_2.method2364();
			local20 = Static200.aClass4_Sub7_Sub1_2.method2361();
			local24 = Static37.anInt825 + (local20 >> 4 & 0x7);
			local28 = Static212.anInt4423 + (local20 & 0x7);
			local36 = Static200.aClass4_Sub7_Sub1_2.method2394();
			if (local24 >= 0 && local28 >= 0 && local24 < Static92.anInt2048 && Static290.anInt5893 > local28 && local12 != Static321.anInt6343) {
				Static50.method926(local28, local24, Static279.anInt5645, new Class4_Sub28(local16, local36));
				Static152.method2934(local24, local28, Static279.anInt5645);
			}
		} else if (Static94.anInt2092 == 247) {
			local12 = Static200.aClass4_Sub7_Sub1_2.method2374();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static264.anIntArray302[local16];
			local28 = Static200.aClass4_Sub7_Sub1_2.method2374();
			local36 = Static37.anInt825 + (local28 >> 4 & 0x7);
			local43 = (local28 & 0x7) + Static212.anInt4423;
			if (local36 >= 0 && local43 >= 0 && Static92.anInt2048 > local36 && Static290.anInt5893 > local43) {
				Static322.method5312(local16, -1, -1, local20, Static279.anInt5645, local36, local24, 0, local43);
			}
		} else if (Static94.anInt2092 == 99) {
			local12 = Static200.aClass4_Sub7_Sub1_2.method2404();
			local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
			Static320.method5290(local12).method1084(local16);
		} else {
			if (Static94.anInt2092 == 17) {
				local12 = Static200.aClass4_Sub7_Sub1_2.method2364();
				local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local20 = Static37.anInt825 + (local16 >> 4 & 0x7);
				local24 = (local16 & 0x7) + Static212.anInt4423;
				@Pc(577) byte local577 = Static200.aClass4_Sub7_Sub1_2.method2405();
				@Pc(581) byte local581 = Static200.aClass4_Sub7_Sub1_2.method2365();
				local43 = Static200.aClass4_Sub7_Sub1_2.method2386();
				local47 = Static200.aClass4_Sub7_Sub1_2.method2404();
				@Pc(593) byte local593 = Static200.aClass4_Sub7_Sub1_2.method2365();
				local134 = Static200.aClass4_Sub7_Sub1_2.method2374();
				local138 = local134 >> 2;
				local142 = local134 & 0x3;
				@Pc(609) byte local609 = Static200.aClass4_Sub7_Sub1_2.method2367();
				local157 = Static200.aClass4_Sub7_Sub1_2.method2411();
				if (!Static164.aClass92_7.method4463()) {
					Static51.method956(local12, local157, local43, local138, local142, local20, local581, local24, local47, local577, local593, local609);
				}
			}
			if (Static94.anInt2092 == 11) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2417();
				local20 = local16 >> 2;
				local24 = local16 & 0x3;
				local28 = Static264.anIntArray302[local20];
				local36 = Static200.aClass4_Sub7_Sub1_2.method2361();
				local43 = Static37.anInt825 + (local36 >> 4 & 0x7);
				local47 = Static212.anInt4423 + (local36 & 0x7);
				local128 = Static200.aClass4_Sub7_Sub1_2.method2404();
				if (local128 == 65535) {
					local128 = -1;
				}
				Static128.method2577(local47, local43, local24, local20, local28, Static279.anInt5645, local128);
			} else if (Static94.anInt2092 == 218) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2361();
				local20 = Static37.anInt825 + (local16 >> 4 & 0x7);
				local24 = (local16 & 0x7) + Static212.anInt4423;
				local28 = Static200.aClass4_Sub7_Sub1_2.method2364();
				local36 = Static200.aClass4_Sub7_Sub1_2.method2386();
				if (local20 >= 0 && local24 >= 0 && local20 < Static92.anInt2048 && Static290.anInt5893 > local24) {
					Static50.method926(local24, local20, Static279.anInt5645, new Class4_Sub28(local36, local28));
					Static152.method2934(local20, local24, Static279.anInt5645);
				}
			} else if (Static94.anInt2092 == 3) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local20 = Static37.anInt825 + (local16 >> 4 & 0x7);
				local24 = (local16 & 0x7) + Static212.anInt4423;
				local28 = Static200.aClass4_Sub7_Sub1_2.method2393() + local20;
				local36 = local24 + Static200.aClass4_Sub7_Sub1_2.method2393();
				local43 = Static200.aClass4_Sub7_Sub1_2.method2396();
				local47 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local128 = Static200.aClass4_Sub7_Sub1_2.method2380() * 4;
				local134 = Static200.aClass4_Sub7_Sub1_2.method2380() * 4;
				local138 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local142 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local146 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local157 = Static200.aClass4_Sub7_Sub1_2.method2380();
				if (local146 == 255) {
					local146 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && Static92.anInt2048 > local20 && Static290.anInt5893 > local24 && local28 >= 0 && local36 >= 0 && local28 < Static92.anInt2048 && Static290.anInt5893 > local36 && local47 != 65535) {
					local20 = local20 * 128 + 64;
					local28 = local28 * 128 + 64;
					local36 = local36 * 128 + 64;
					local24 = local24 * 128 + 64;
					local368 = new Class2_Sub2_Sub5(local47, Static279.anInt5645, local20, local24, Static119.method2125(local20, local24, Static279.anInt5645) - local128, Static342.anInt6706 + local138, local142 + Static342.anInt6706, local146, local157, local43, local134);
					local368.method3843(Static342.anInt6706 + local138, -local134 + Static119.method2125(local28, local36, Static279.anInt5645), local36, local28);
					Static146.aClass130_70.method3510(new Class4_Sub1_Sub2(local368));
				}
			} else if (Static94.anInt2092 == 111) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local20 = Static37.anInt825 + (local16 >> 4 & 0x7);
				local24 = Static212.anInt4423 + (local16 & 0x7);
				local28 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local36 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local43 = Static200.aClass4_Sub7_Sub1_2.method2404();
				if (Static178.aClass198_35 != null && local20 >= 0 && local24 >= 0 && Static92.anInt2048 > local20 && Static290.anInt5893 > local24) {
					@Pc(1013) Class4_Sub21 local1013 = (Class4_Sub21) Static178.aClass198_35.method5261((long) (local20 | local24 << 14 | Static279.anInt5645 << 28));
					if (local1013 != null) {
						for (@Pc(1021) Class4_Sub28 local1021 = (Class4_Sub28) local1013.aClass130_65.method3499(); local1021 != null; local1021 = (Class4_Sub28) local1013.aClass130_65.method3512()) {
							if (local1021.anInt4053 == (local28 & 0x7FFF) && local1021.anInt4051 == local36) {
								local1021.method5667();
								local1021.anInt4051 = local43;
								Static50.method926(local24, local20, Static279.anInt5645, local1021);
								break;
							}
						}
						Static152.method2934(local20, local24, Static279.anInt5645);
					}
				}
			} else if (Static94.anInt2092 == 183) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local20 = Static37.anInt825 * 2 + (local16 >> 4 & 0xF);
				local24 = Static212.anInt4423 * 2 + (local16 & 0xF);
				local28 = Static200.aClass4_Sub7_Sub1_2.method2393() + local20;
				local36 = Static200.aClass4_Sub7_Sub1_2.method2393() + local24;
				local43 = Static200.aClass4_Sub7_Sub1_2.method2396();
				local47 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local128 = Static200.aClass4_Sub7_Sub1_2.method2380() * 4;
				local134 = Static200.aClass4_Sub7_Sub1_2.method2380() * 4;
				local138 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local142 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local146 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local157 = Static200.aClass4_Sub7_Sub1_2.method2380();
				if (local146 == 255) {
					local146 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && local20 < 208 && local24 < 208 && local28 >= 0 && local36 >= 0 && local28 < 208 && local36 < 208 && local47 != 65535) {
					local24 = local24 * 64;
					local20 = local20 * 64;
					local36 *= 64;
					local28 = local28 * 64;
					local368 = new Class2_Sub2_Sub5(local47, Static279.anInt5645, local20, local24, Static119.method2125(local20, local24, Static279.anInt5645) - local128, Static342.anInt6706 + local138, Static342.anInt6706 + local142, local146, local157, local43, local134);
					local368.method3843(Static342.anInt6706 + local138, -local134 + Static119.method2125(local28, local36, Static279.anInt5645), local36, local28);
					Static146.aClass130_70.method3510(new Class4_Sub1_Sub2(local368));
				}
			} else if (Static94.anInt2092 == 101) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2417();
				local20 = Static37.anInt825 + (local16 >> 4 & 0x7);
				local24 = Static212.anInt4423 + (local16 & 0x7);
				local28 = Static200.aClass4_Sub7_Sub1_2.method2394();
				if (local20 >= 0 && local24 >= 0 && Static92.anInt2048 > local20 && local24 < Static290.anInt5893) {
					@Pc(1319) Class4_Sub21 local1319 = (Class4_Sub21) Static178.aClass198_35.method5261((long) (local20 | Static279.anInt5645 << 28 | local24 << 14));
					if (local1319 != null) {
						for (@Pc(1327) Class4_Sub28 local1327 = (Class4_Sub28) local1319.aClass130_65.method3499(); local1327 != null; local1327 = (Class4_Sub28) local1319.aClass130_65.method3512()) {
							if (local1327.anInt4053 == (local28 & 0x7FFF)) {
								local1327.method5667();
								break;
							}
						}
						if (local1319.aClass130_65.method3508()) {
							local1319.method5667();
						}
						Static152.method2934(local20, local24, Static279.anInt5645);
					}
				}
			} else if (Static94.anInt2092 == 233) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local20 = Static37.anInt825 + (local16 >> 4 & 0x7);
				local24 = (local16 & 0x7) + Static212.anInt4423;
				local28 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local36 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local43 = Static200.aClass4_Sub7_Sub1_2.method2404();
				if (local20 >= 0 && local24 >= 0 && Static92.anInt2048 > local20 && Static290.anInt5893 > local24) {
					local47 = local20 * 128 + 64;
					local128 = local24 * 128 + 64;
					@Pc(1453) Class2_Sub2_Sub4 local1453 = new Class2_Sub2_Sub4(local28, local43, Static342.anInt6706, Static279.anInt5645, local47, Static119.method2125(local47, local128, Static279.anInt5645) - local36, local128, local20, local20, local24, local24);
					Static108.aClass130_44.method3510(new Class4_Sub1_Sub20(local1453));
				}
			} else if (Static94.anInt2092 == 139) {
				Static200.aClass4_Sub7_Sub1_2.method2380();
				local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local20 = (local16 >> 4 & 0x7) + Static37.anInt825;
				local24 = Static212.anInt4423 + (local16 & 0x7);
				local28 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local36 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local43 = Static200.aClass4_Sub7_Sub1_2.method2402();
				@Pc(1503) String local1503 = Static200.aClass4_Sub7_Sub1_2.method2379();
				Static155.method2993(local28, local20, local1503, local24, local43, local36);
			} else if (Static94.anInt2092 == 12) {
				local16 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local20 = Static37.anInt825 + (local16 >> 4 & 0x7);
				local24 = (local16 & 0x7) + Static212.anInt4423;
				local28 = Static200.aClass4_Sub7_Sub1_2.method2404();
				if (local28 == 65535) {
					local28 = -1;
				}
				local36 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local43 = local36 >> 4 & 0xF;
				local47 = local36 & 0x7;
				local128 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local134 = Static200.aClass4_Sub7_Sub1_2.method2380();
				if (local20 >= 0 && local24 >= 0 && local20 < Static92.anInt2048 && Static290.anInt5893 > local24) {
					local138 = local43 + 1;
					if (local20 - local138 <= Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0] && Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0] <= local20 + local138 && Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0] >= local24 - local138 && local138 + local24 >= Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0] && Static235.anInt6709 != 0 && local47 > 0 && Static234.anInt4843 < 50 && local28 != -1) {
						Static196.anIntArray362[Static234.anInt4843] = local28;
						Static115.anIntArray241[Static234.anInt4843] = local47;
						Static169.anIntArray331[Static234.anInt4843] = local128;
						Static268.aClass112Array1[Static234.anInt4843] = null;
						Static111.anIntArray236[Static234.anInt4843] = (local24 << 8) + (local20 << 16) + local43;
						Static349.anIntArray540[Static234.anInt4843] = local134;
						Static234.anInt4843++;
					}
				}
			}
		}
	}
}
