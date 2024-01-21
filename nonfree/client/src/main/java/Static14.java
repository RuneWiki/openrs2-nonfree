import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray40;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[S")
	public static final short[] aShortArray22 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_684 = Static181.method2795("Enter your username (V password)3");

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!qe;")
	public static Class83 aClass83_683 = aClass83_684;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_685 = Static181.method2795("M");

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "[I")
	public static final int[] anIntArray235 = new int[2000];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([BB)V")
	public static void method1778(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = Static19.anInt545 >> 2 << 10;
		@Pc(15) byte[][] local15 = new byte[Static127.anInt2810][Static177.anInt3615];
		@Pc(24) int local24 = Static3.anInt66 >> 1;
		@Pc(26) int local26 = 0;
		while (true) {
			@Pc(40) int local40;
			@Pc(52) int local52;
			while (local26 < arg0.length) {
				local40 = (arg0[local26++] & 0xFF) * 64 - Static154.anInt3114;
				local52 = (arg0[local26++] & 0xFF) * 64 - Static57.anInt1431;
				if (local40 > 0 && local52 > 0 && Static127.anInt2810 > local40 + 64 && Static177.anInt3615 > local52 + 64) {
					for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
						@Pc(80) int local80 = Static177.anInt3615 - local52 - 1;
						@Pc(86) byte[] local86 = local15[local40 + local71];
						for (@Pc(88) int local88 = -64; local88 < 0; local88++) {
							local86[local80--] = arg0[local26++];
						}
					}
				} else {
					local26 += 4096;
				}
			}
			local40 = Static127.anInt2810;
			local52 = Static177.anInt3615;
			@Pc(122) int[] local122 = new int[local52];
			@Pc(125) int[] local125 = new int[local52];
			@Pc(128) int[] local128 = new int[local52];
			@Pc(131) int[] local131 = new int[local52];
			@Pc(134) int[] local134 = new int[local52];
			for (@Pc(136) int local136 = -5; local136 < local40; local136++) {
				@Pc(161) int local161;
				@Pc(225) int local225;
				for (@Pc(140) int local140 = 0; local140 < local52; local140++) {
					@Pc(146) int local146 = local136 + 5;
					@Pc(208) int local208;
					if (local40 > local146) {
						local161 = local15[local146][local140] & 0xFF;
						if (local161 > 0) {
							@Pc(172) Class2_Sub2_Sub11 local172 = Static66.method1260(local161 - 1);
							local122[local140] += local172.anInt1379;
							local128[local140] += local172.anInt1388;
							local125[local140] += local172.anInt1387;
							local131[local140] += local172.anInt1380;
							local208 = local134[local140]++;
						}
					}
					local161 = local136 - 5;
					if (local161 >= 0) {
						local225 = local15[local161][local140] & 0xFF;
						if (local225 > 0) {
							@Pc(236) Class2_Sub2_Sub11 local236 = Static66.method1260(local225 - 1);
							local122[local140] -= local236.anInt1379;
							local128[local140] -= local236.anInt1388;
							local125[local140] -= local236.anInt1387;
							local131[local140] -= local236.anInt1380;
							local208 = local134[local140]--;
						}
					}
				}
				if (local136 >= 0) {
					@Pc(290) int[][] local290 = Static211.anIntArrayArrayArray11[local136 >> 6];
					local225 = 0;
					local161 = 0;
					@Pc(296) int local296 = 0;
					@Pc(298) int local298 = 0;
					@Pc(300) int local300 = 0;
					for (@Pc(302) int local302 = -5; local302 < local52; local302++) {
						@Pc(308) int local308 = local302 + 5;
						if (local52 > local308) {
							local296 += local125[local308];
							local161 += local122[local308];
							local225 += local128[local308];
							local300 += local134[local308];
							local298 += local131[local308];
						}
						@Pc(345) int local345 = local302 - 5;
						if (local345 >= 0) {
							local225 -= local128[local345];
							local298 -= local131[local345];
							local296 -= local125[local345];
							local161 -= local122[local345];
							local300 -= local134[local345];
						}
						if (local302 >= 0 && local300 > 0) {
							@Pc(385) int local385 = local302 >> 6;
							@Pc(406) int local406 = local298 == 0 ? 0 : Static58.method1123(local296 / local300, local161 * 256 / local298, local225 / local300);
							if (local15[local136][local302] != 0) {
								if (local290[local385] == null) {
									local290[local385] = Static211.anIntArrayArrayArray11[local136 >> 6][local385] = new int[4096];
								}
								@Pc(438) int local438 = local24 + (local406 & 0x7F);
								if (local438 < 0) {
									local438 = 0;
								} else if (local438 > 127) {
									local438 = 127;
								}
								@Pc(467) int local467 = local438 + (local406 + local11 & 0xFC00) + (local406 & 0x380);
								local290[local385][(local136 & 0x3F) + ((local302 & 0x3F) << 6)] = Static24.anIntArray40[Static3.method63(local467, 96)];
							} else if (local290[local385] != null) {
								local290[local385][(local136 & 0x3F) + ((local302 & 0x3F) << 6)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
	public static void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static143.anInt3007 = arg2 * Static127.anInt2810 / arg0;
		Static113.anInt2598 = -1;
		Static62.anInt1512 = arg3 * Static177.anInt3615 / arg1;
		Static121.anInt2748 = -1;
		Static140.method2273();
	}
}
