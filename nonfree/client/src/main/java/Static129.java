import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
	public static int anInt3260;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "Lclient!ic;")
	public static Class58 aClass58_9 = new Class58(16);

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
	public static int anInt3253 = 0;

	@OriginalMember(owner = "client!l", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString209 = "Continue";

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method2453(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(24) char local24 = arg0.charAt(local13);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local13] = (byte) local24;
			} else if (local24 == '€') {
				local11[local13] = -128;
			} else if (local24 == '‚') {
				local11[local13] = -126;
			} else if (local24 == 'ƒ') {
				local11[local13] = -125;
			} else if (local24 == '„') {
				local11[local13] = -124;
			} else if (local24 == '…') {
				local11[local13] = -123;
			} else if (local24 == '†') {
				local11[local13] = -122;
			} else if (local24 == '‡') {
				local11[local13] = -121;
			} else if (local24 == 'ˆ') {
				local11[local13] = -120;
			} else if (local24 == '‰') {
				local11[local13] = -119;
			} else if (local24 == 'Š') {
				local11[local13] = -118;
			} else if (local24 == '‹') {
				local11[local13] = -117;
			} else if (local24 == 'Œ') {
				local11[local13] = -116;
			} else if (local24 == 'Ž') {
				local11[local13] = -114;
			} else if (local24 == '‘') {
				local11[local13] = -111;
			} else if (local24 == '’') {
				local11[local13] = -110;
			} else if (local24 == '“') {
				local11[local13] = -109;
			} else if (local24 == '”') {
				local11[local13] = -108;
			} else if (local24 == '•') {
				local11[local13] = -107;
			} else if (local24 == '–') {
				local11[local13] = -106;
			} else if (local24 == '—') {
				local11[local13] = -105;
			} else if (local24 == '˜') {
				local11[local13] = -104;
			} else if (local24 == '™') {
				local11[local13] = -103;
			} else if (local24 == 'š') {
				local11[local13] = -102;
			} else if (local24 == '›') {
				local11[local13] = -101;
			} else if (local24 == 'œ') {
				local11[local13] = -100;
			} else if (local24 == 'ž') {
				local11[local13] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(B)V")
	public static void method2455() {
		Static239.method3936();
		Static74.method1469();
		Static239.method3940();
		Static206.method3445();
		Static34.method620();
		Static181.method3123();
		Static212.method3502();
		Static168.method2917();
		Static116.method2306();
		Static128.method2427();
		Static237.method3926();
		Static221.method3653();
		Static93.method2004();
		Static205.method3439();
		Static8.method110();
		Static21.method408();
		Static164.method2854();
		Static263.method4205();
		Static150.method2866();
		Static87.method1876();
		Static127.aClass79_18.method2487();
		Static158.aClass79_21.method2487();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ql;)V")
	public static void method2456(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(11) int local11 = Static85.anInt2428 >> 2 << 10;
		@Pc(15) int local15 = Static147.anInt3563 >> 1;
		@Pc(19) byte[][] local19 = new byte[Static124.anInt3160][Static174.anInt3997];
		@Pc(25) int local25;
		@Pc(111) int local111;
		@Pc(121) int local121;
		while (arg0.anInt2395 < arg0.aByteArray29.length) {
			local25 = 0;
			@Pc(27) boolean local27 = false;
			@Pc(29) int local29 = 0;
			if (arg0.method1772() == 1) {
				local27 = true;
				local25 = arg0.method1772();
				local29 = arg0.method1772();
			}
			@Pc(50) int local50 = arg0.method1772();
			@Pc(54) int local54 = arg0.method1772();
			@Pc(64) int local64 = Static46.anInt1376 + Static174.anInt3997 - local54 * 64 - 1;
			@Pc(70) int local70 = local50 * 64 - Static209.anInt4574;
			if (local70 >= 0 && local64 - 63 >= 0 && local70 + 63 < Static124.anInt3160 && local64 < Static174.anInt3997) {
				for (local111 = 0; local111 < 64; local111++) {
					@Pc(119) byte[] local119 = local19[local70 + local111];
					for (local121 = 0; local121 < 64; local121++) {
						if (!local27 || local111 >= local25 * 8 && local111 < local25 * 8 + 8 && local121 >= local29 * 8 && local29 * 8 + 8 > local121) {
							local119[local64 - local121] = arg0.method1756();
						}
					}
				}
			} else if (local27) {
				arg0.anInt2395 += 64;
			} else {
				arg0.anInt2395 += 4096;
			}
		}
		local25 = Static174.anInt3997;
		@Pc(193) int[] local193 = new int[local25];
		@Pc(196) int[] local196 = new int[local25];
		@Pc(199) int[] local199 = new int[local25];
		@Pc(202) int[] local202 = new int[local25];
		@Pc(205) int[] local205 = new int[local25];
		@Pc(207) int local207 = Static124.anInt3160;
		for (local111 = -5; local111 < local207; local111++) {
			@Pc(234) int local234;
			@Pc(301) int local301;
			for (@Pc(213) int local213 = 0; local213 < local25; local213++) {
				local121 = local111 + 5;
				@Pc(281) int local281;
				if (local207 > local121) {
					local234 = local19[local121][local213] & 0xFF;
					if (local234 > 0) {
						@Pc(245) Class137 local245 = Static17.method326(local234 - 1);
						local193[local213] += local245.anInt5239;
						local196[local213] += local245.anInt5246;
						local202[local213] += local245.anInt5238;
						local205[local213] += local245.anInt5245;
						local281 = local199[local213]++;
					}
				}
				local234 = local111 - 5;
				if (local234 >= 0) {
					local301 = local19[local234][local213] & 0xFF;
					if (local301 > 0) {
						@Pc(309) Class137 local309 = Static17.method326(local301 - 1);
						local193[local213] -= local309.anInt5239;
						local196[local213] -= local309.anInt5246;
						local202[local213] -= local309.anInt5238;
						local205[local213] -= local309.anInt5245;
						local281 = local199[local213]--;
					}
				}
			}
			if (local111 >= 0) {
				@Pc(367) int[][] local367 = Static5.anIntArrayArrayArray2[local111 >> 6];
				local234 = 0;
				@Pc(371) int local371 = 0;
				local301 = 0;
				@Pc(375) int local375 = 0;
				@Pc(377) int local377 = 0;
				for (@Pc(379) int local379 = -5; local379 < local25; local379++) {
					@Pc(385) int local385 = local379 + 5;
					@Pc(389) int local389 = local379 - 5;
					if (local385 < local25) {
						local375 += local199[local385];
						local301 += local196[local385];
						local377 += local205[local385];
						local371 += local202[local385];
						local234 += local193[local385];
					}
					if (local389 >= 0) {
						local234 -= local193[local389];
						local377 -= local205[local389];
						local375 -= local199[local389];
						local301 -= local196[local389];
						local371 -= local202[local389];
					}
					if (local379 >= 0 && local375 > 0) {
						@Pc(470) int[] local470 = local367[local379 >> 6];
						@Pc(491) int local491 = local377 == 0 ? 0 : Static260.method2132(local234 * 256 / local377, local301 / local375, local371 / local375);
						if (local19[local111][local379] != 0) {
							if (local470 == null) {
								local470 = local367[local379 >> 6] = new int[4096];
							}
							@Pc(514) int local514 = (local491 & 0x7F) + local15;
							if (local514 < 0) {
								local514 = 0;
							} else if (local514 > 127) {
								local514 = 127;
							}
							@Pc(542) int local542 = (local491 & 0x380) + (local491 + local11 & 0xFC00) + local514;
							local470[(local111 & 0x3F) + ((local379 & 0x3F) << 6)] = Static235.anIntArray443[Static134.method2497(96, local542)];
						} else if (local470 != null) {
							local470[(local111 & 0x3F) + ((local379 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method2458(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
