import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[50][];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method4830(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4831(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static2.anInt57++;
		Static179.anInt3996 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static47.anInt779; local7 < Static32.anInt516; local7++) {
			@Pc(12) Class51[][] local12 = Static196.aClass51ArrayArrayArray3[local7];
			for (local14 = Static360.anInt6859; local14 < Static275.anInt5641; local14++) {
				for (@Pc(17) int local17 = Static174.anInt5316; local17 < Static51.anInt874; local17++) {
					@Pc(24) Class51 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static148.aBooleanArrayArray3[local14 + Static26.anInt3838 - Static250.anInt5229][local17 + Static26.anInt3838 - Static328.anInt6686] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean100 = true;
							local24.aBoolean99 = true;
							if (local24.aClass11_2 == null) {
								local24.aBoolean98 = false;
							} else {
								local24.aBoolean98 = true;
							}
							Static179.anInt3996++;
						} else {
							local24.aBoolean100 = false;
							local24.aBoolean99 = false;
							local24.aByte12 = 0;
							if (local14 >= Static250.anInt5229 - 16 && local14 <= Static250.anInt5229 + 16 && local17 >= Static328.anInt6686 - 16 && local17 <= Static328.anInt6686 + 16 && (local24.aClass1_Sub1_2 != null || local24.aClass1_Sub1_1 != null || local24.aClass1_Sub3_2 != null || local24.aClass1_Sub3_1 != null || local24.aClass1_Sub4_1 != null || local24.aClass11_2 != null)) {
								Static328.aClass80_29.method3920(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static121.aClass105Array3 == Static9.aClass105Array1;
		for (local14 = Static47.anInt779; local14 < Static32.anInt516; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static145.aClass37_8.method3738() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static148.aBooleanArrayArray3.length;
				if (Static360.anInt6859 + Static148.aBooleanArrayArray3.length > Static344.anInt6692) {
					local172 -= Static360.anInt6859 + Static148.aBooleanArrayArray3.length - Static344.anInt6692;
				}
				@Pc(192) int local192 = Static148.aBooleanArrayArray3[0].length;
				if (Static174.anInt5316 + Static148.aBooleanArrayArray3[0].length > Static63.anInt1129) {
					local192 -= Static174.anInt5316 + Static148.aBooleanArrayArray3[0].length - Static63.anInt1129;
				}
				@Pc(213) int local213 = Static8.anInt172;
				while (true) {
					if (local213 >= local172) {
						Static328.aClass80_29.method3927(local14, true, Static9.aClass105Array1[local14], local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static360.anInt6859 - Static8.anInt172;
					for (@Pc(222) int local222 = Static237.anInt5067; local222 < local192; local222++) {
						Static162.aBooleanArrayArray4[local213][local222] = false;
						if (Static148.aBooleanArrayArray3[local213][local222]) {
							@Pc(241) int local241 = local222 + Static174.anInt5316 - Static237.anInt5067;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static196.aClass51ArrayArrayArray3[local243][local220][local241] != null && Static196.aClass51ArrayArrayArray3[local243][local220][local241].aByte9 == local14) {
									Static162.aBooleanArrayArray4[local213][local222] = Static196.aClass51ArrayArrayArray3[local243][local220][local241].aBoolean100;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static328.aClass80_29.method3927(local14, false, Static9.aClass105Array1[local14], local161);
			}
			Static328.aClass80_29.method3924();
		}
		if (!Static333.method5426(true)) {
			Static333.method5426(false);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZIIIIF)[[I")
	public static int[][] method4832(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub3_Sub10 local13 = new Class2_Sub3_Sub10();
		local13.anInt1634 = 3;
		local13.anInt1635 = 8;
		local13.anInt1633 = 4;
		local13.anInt1628 = (int) (arg0 * 4096.0F);
		local13.aBoolean147 = false;
		local13.method5708();
		Static336.method5480(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method1740(local47, local9[local47]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public static void method4833() {
		Static316.aClass2_Sub31_1 = new Class2_Sub31(Static174.aClass140_126.method4155(Static239.anInt2803), "", Static145.anInt3131, 1004, 0L, 0, 0, true, false);
	}
}
