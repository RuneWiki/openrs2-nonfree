import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public static int anInt6075;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "[I")
	public static final int[] anIntArray506 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	public static int anInt6077 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(CZ)B")
	public static byte method5155(@OriginalArg(0) char arg0) {
		@Pc(57) byte local57;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local57 = (byte) arg0;
		} else if (arg0 == '€') {
			local57 = -128;
		} else if (arg0 == '‚') {
			local57 = -126;
		} else if (arg0 == 'ƒ') {
			local57 = -125;
		} else if (arg0 == '„') {
			local57 = -124;
		} else if (arg0 == '…') {
			local57 = -123;
		} else if (arg0 == '†') {
			local57 = -122;
		} else if (arg0 == '‡') {
			local57 = -121;
		} else if (arg0 == 'ˆ') {
			local57 = -120;
		} else if (arg0 == '‰') {
			local57 = -119;
		} else if (arg0 == 'Š') {
			local57 = -118;
		} else if (arg0 == '‹') {
			local57 = -117;
		} else if (arg0 == 'Œ') {
			local57 = -116;
		} else if (arg0 == 'Ž') {
			local57 = -114;
		} else if (arg0 == '‘') {
			local57 = -111;
		} else if (arg0 == '’') {
			local57 = -110;
		} else if (arg0 == '“') {
			local57 = -109;
		} else if (arg0 == '”') {
			local57 = -108;
		} else if (arg0 == '•') {
			local57 = -107;
		} else if (arg0 == '–') {
			local57 = -106;
		} else if (arg0 == '—') {
			local57 = -105;
		} else if (arg0 == '˜') {
			local57 = -104;
		} else if (arg0 == '™') {
			local57 = -103;
		} else if (arg0 == 'š') {
			local57 = -102;
		} else if (arg0 == '›') {
			local57 = -101;
		} else if (arg0 == 'œ') {
			local57 = -100;
		} else if (arg0 == 'ž') {
			local57 = -98;
		} else if (arg0 == 'Ÿ') {
			local57 = -97;
		} else {
			local57 = 63;
		}
		return local57;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5156(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static367.method4034(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)I")
	public static int method5157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 >>> 24;
		@Pc(21) int local21 = 255 - local17;
		@Pc(39) int local39 = (local17 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local17 & 0xFF0000) >>> 8;
		return local39 + ((local21 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local21 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public static void method5158() {
		Static216.aClass198_39.method5230();
		Static164.aClass198_58.method5230();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIZI)V")
	public static void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static256.aClass45ArrayArrayArray2 == null) {
			Static212.aClass122_2.method4801(arg1, arg0, arg3, arg2, -16777216);
			return;
		}
		Static293.anInt6246++;
		if (Static349.aClass5_Sub4_Sub4_Sub1_2 != null && Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 + 64 - Static349.aClass5_Sub4_Sub4_Sub1_2.method4208() * 64 >> 7 == Static154.anInt6365 && Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 + 64 - Static349.aClass5_Sub4_Sub4_Sub1_2.method4208() * 64 >> 7 == Static355.anInt6865) {
			Static154.anInt6365 = -1;
			Static355.anInt6865 = -1;
			Static354.method5737();
		}
		Static208.method3584();
		if (!arg4) {
			Static212.method1612();
		}
		Static340.method5566();
		Static154.method5395(arg1, arg0, arg3, arg2, true);
		@Pc(91) int local91 = Static247.anInt4892;
		@Pc(93) int local93 = Static349.anInt6771;
		@Pc(95) int local95 = Static305.anInt6003;
		@Pc(97) int local97 = Static227.anInt4634;
		@Pc(103) int local103;
		@Pc(136) int local136;
		if (Static261.anInt5200 == 1) {
			local103 = (int) Static46.aFloat2;
			if (local103 < Static220.anInt4544 >> 8) {
				local103 = Static220.anInt4544 >> 8;
			}
			if (Static80.aBooleanArray7[4] && local103 < Static97.anIntArray121[4] + 128) {
				local103 = Static97.anIntArray121[4] + 128;
			}
			local136 = (int) Static57.aFloat3 + Static2.anInt29 & 0x3FFF;
			Static74.method1128(local93, local103, Static286.method4919(Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905, Static163.anInt3184) - 50, Static56.anInt1230, local136, (local103 >> 3) * 3 + 600, Static298.anInt5943);
		} else if (Static261.anInt5200 == 4) {
			local103 = (int) Static46.aFloat2;
			if (Static220.anInt4544 >> 8 > local103) {
				local103 = Static220.anInt4544 >> 8;
			}
			if (Static80.aBooleanArray7[4] && local103 < Static97.anIntArray121[4] + 128) {
				local103 = Static97.anIntArray121[4] + 128;
			}
			local136 = (int) Static57.aFloat3 & 0x3FFF;
			Static74.method1128(local93, local103, Static286.method4919(Static189.anInt3967, Static350.anInt6803, Static163.anInt3184) - 50, Static56.anInt1230, local136, (local103 >> 3) * 3 + 600, Static298.anInt5943);
		} else if (Static261.anInt5200 == 5) {
			Static143.method5633(local93);
		}
		local103 = Static110.anInt2324;
		local136 = Static175.anInt3631;
		@Pc(243) int local243 = Static210.anInt4317;
		@Pc(245) int local245 = Static154.anInt6368;
		@Pc(247) int local247 = Static350.anInt6797;
		@Pc(291) int local291;
		for (@Pc(249) int local249 = 0; local249 < 5; local249++) {
			if (Static80.aBooleanArray7[local249]) {
				local291 = (int) ((double) -Static180.anIntArray265[local249] + Math.random() * (double) (Static180.anIntArray265[local249] * 2 + 1) + Math.sin((double) Static200.anIntArray343[local249] / 100.0D * (double) Static27.anIntArray35[local249]) * (double) Static97.anIntArray121[local249]);
				if (local249 == 2) {
					Static210.anInt4317 += local291;
				}
				if (local249 == 0) {
					Static110.anInt2324 += local291;
				}
				if (local249 == 3) {
					Static350.anInt6797 = local291 + Static350.anInt6797 & 0x3FFF;
				}
				if (local249 == 1) {
					Static175.anInt3631 += local291;
				}
				if (local249 == 4) {
					Static154.anInt6368 += local291;
					if (Static154.anInt6368 < 1024) {
						Static154.anInt6368 = 1024;
					} else if (Static154.anInt6368 > 3072) {
						Static154.anInt6368 = 3072;
					}
				}
			}
		}
		if (Static110.anInt2324 < 0) {
			Static110.anInt2324 = 0;
		}
		if (Static210.anInt4317 < 0) {
			Static210.anInt4317 = 0;
		}
		if ((Static103.anInt2156 << 7) - 1 < Static110.anInt2324) {
			Static110.anInt2324 = (Static103.anInt2156 << 7) - 1;
		}
		if ((Static116.anInt2499 << 7) - 1 < Static210.anInt4317) {
			Static210.anInt4317 = (Static116.anInt2499 << 7) - 1;
		}
		Static123.method2162();
		Static56.method928();
		Static212.aClass122_2.method4768(local91, local97, local91 + local95, local97 + local93);
		Static212.aClass122_2.method4777();
		local291 = Static79.anInt5531;
		if (Static55.aClass26_3 == null) {
			Static212.aClass122_2.method4751(local291);
		} else {
			Static55.aClass26_3.method618(local291, local93, Static154.anInt6368, local91, Static212.aClass122_2, local97, Static350.anInt6797, local95, Static90.anInt1786 << 3);
		}
		Static123.method2158();
		Static200.aClass56_3.method4684(Static110.anInt2324, Static175.anInt3631, Static210.anInt4317, -Static154.anInt6368 & 0x3FFF, -Static350.anInt6797 & 0x3FFF, -Static40.anInt6448 & 0x3FFF);
		Static212.aClass122_2.method4785(Static200.aClass56_3);
		Static212.aClass122_2.method4772(local91 + local95 / 2, local97 + local93 / 2, Static20.anInt552 << 1, Static20.anInt552 << 1);
		Static201.method3516(Static20.anInt552 << 1, Static20.anInt552 << 1, local95 / 2 + local91, local93 / 2 + local97);
		Static274.method5036(Static110.anInt2324, -Static40.anInt6448 & 0x3FFF, -Static154.anInt6368 & 0x3FFF, Static175.anInt3631, Static210.anInt4317, -Static350.anInt6797 & 0x3FFF);
		@Pc(521) byte local521 = Static295.method5004() == 2 ? (byte) Static293.anInt6246 : 1;
		Static164.method5314(Static212.aClass122_2, Static51.anInt1101, Static189.anInt3970, Static200.aClass56_3, Static110.anInt2324, Static175.anInt3631, Static210.anInt4317, Static219.aByteArrayArrayArray10, Static51.anIntArray69, Static27.anIntArray36, Static111.anIntArray139, Static160.anIntArray218, Static122.anIntArray164, Static163.anInt3184 + 1, local521, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7, !Static274.aBoolean403);
		Static123.method2158();
		if (Static266.anInt5370 == 30) {
			Static232.method4001(local97, local91, local93, local95);
			Static19.method406(local93, local91, local95, local97);
			Static269.method4565(local95, local93, local97, local91);
			Static221.method3874(local91, local95, local97, local93);
		}
		Static353.method5711();
		Static350.anInt6797 = local247;
		Static110.anInt2324 = local103;
		Static154.anInt6368 = local245;
		Static210.anInt4317 = local243;
		Static175.anInt3631 = local136;
		if (Static165.aBoolean172 && Static10.aClass163_1.method4166() == 0) {
			Static165.aBoolean172 = false;
		}
		if (Static165.aBoolean172) {
			Static212.aClass122_2.method4801(local93, local91, local97, local95, -16777216);
			Static300.method5080(Static168.aString130, false, Static83.aClass120_1);
		}
	}
}
