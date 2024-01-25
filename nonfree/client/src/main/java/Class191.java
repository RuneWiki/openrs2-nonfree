import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public class Class191 {

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "[I")
	private final int[] anIntArray559 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "[I")
	private final int[] anIntArray560 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "Lclient!jj;")
	private final Class121 aClass121_5;

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "Lclient!ef;")
	private final Class59 aClass59_5;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	protected final int anInt6959;

	@OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
	public final int anInt6970;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
	protected final int anInt6958;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "Z")
	public final boolean aBoolean513;

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ot", name = "G", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(IIIZLclient!ef;Lclient!jj;)V")
	protected Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class59 arg4, @OriginalArg(5) Class121 arg5) {
		this.aClass121_5 = arg5;
		this.aClass59_5 = arg4;
		this.anInt6959 = arg1;
		this.anInt6970 = arg0;
		this.anInt6958 = arg2;
		this.aBoolean513 = arg3;
		this.aByteArrayArrayArray16 = new byte[this.anInt6970][this.anInt6959][this.anInt6958];
		this.aByteArrayArrayArray15 = new byte[this.anInt6970][this.anInt6959][this.anInt6958];
		this.aByteArrayArrayArray11 = new byte[this.anInt6970][this.anInt6959 + 1][this.anInt6958 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt6970][this.anInt6959][this.anInt6958];
		this.aByteArrayArrayArray12 = new byte[this.anInt6970][this.anInt6959][this.anInt6958];
		this.anIntArrayArrayArray12 = new int[this.anInt6970][this.anInt6959 + 1][this.anInt6958 + 1];
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIBI)V")
	public final void method5565(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6970; local3++) {
			this.method5567(local3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!o;Lclient!qa;I[[ILclient!o;Lclient!o;)V")
	private void method5566(@OriginalArg(1) Class14 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class14 arg4, @OriginalArg(6) Class14 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg2];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray16[arg2];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg2];
		for (@Pc(27) int local27 = 0; local27 < this.anInt6959; local27++) {
			@Pc(45) int local45 = local27 >= this.anInt6959 - 1 ? local27 : local27 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt6958; local47++) {
				@Pc(65) int local65 = local47 >= this.anInt6958 - 1 ? local47 : local47 + 1;
				if (Static462.anInt7858 == -1 || Static404.method5662(local27, arg2, local47, Static462.anInt7858)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local10[local27][local47];
					@Pc(97) int local97 = local15[local27][local47];
					@Pc(105) int local105 = local25[local27][local47] & 0xFF;
					@Pc(113) int local113 = local20[local27][local47] & 0xFF;
					@Pc(121) int local121 = local20[local27][local65] & 0xFF;
					@Pc(129) int local129 = local20[local45][local65] & 0xFF;
					@Pc(137) int local137 = local20[local45][local47] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(159) Class271 local159 = local105 == 0 ? null : this.aClass59_5.method1763(local105 - 1);
						@Pc(171) Class92 local171 = local113 == 0 ? null : this.aClass121_5.method3390(local113 - 1);
						if (local91 == 0 && local159 == null) {
							local91 = 12;
						}
						@Pc(182) Class271 local182 = local159;
						if (local159 != null) {
							if (local159.anInt7791 == -1 && local159.anInt7788 == -1) {
								local182 = local159;
								local159 = null;
							} else if (local171 != null && local91 != 0) {
								local82 = local159.aBoolean569;
							}
						}
						@Pc(290) int local290;
						@Pc(309) int local309;
						@Pc(373) int local373;
						@Pc(386) int local386;
						if ((local91 == 0 || local91 == 12) && local27 > 0 && local47 > 0 && local27 < this.anInt6959 && local47 < this.anInt6958) {
							@Pc(250) int local250 = local113 == local20[local45][local47 - 1] ? 1 : -1;
							@Pc(269) int local269 = local113 == local20[local45][local65] ? 1 : -1;
							local290 = local113 == local20[local27 - 1][local47 - 1] ? 1 : -1;
							local309 = local113 == local20[local27 - 1][local65] ? 1 : -1;
							if (local20[local27][local47 - 1] == local113) {
								local250++;
								local290++;
							} else {
								local250--;
								local290--;
							}
							if (local113 == local20[local45][local47]) {
								local250++;
								local269++;
							} else {
								local250--;
								local269--;
							}
							if (local113 == local20[local27][local65]) {
								local269++;
								local309++;
							} else {
								local309--;
								local269--;
							}
							if (local113 == local20[local27 - 1][local47]) {
								local309++;
								local290++;
							} else {
								local309--;
								local290--;
							}
							local373 = local290 - local269;
							if (local373 < 0) {
								local373 = -local373;
							}
							local386 = local250 - local309;
							if (local386 < 0) {
								local386 = -local386;
							}
							if (local373 == local386) {
								local373 = arg4.oa(local27, local47) - arg4.oa(local45, local65);
								if (local373 < 0) {
									local373 = -local373;
								}
								local386 = arg4.oa(local45, local47) - arg4.oa(local27, local65);
								if (local386 < 0) {
									local386 = -local386;
								}
							}
							local97 = local386 <= local373 ? 0 : 1;
						}
						for (local290 = 0; local290 < 13; local290++) {
							Static17.anIntArray21[local290] = -1;
							Static448.anIntArray616[local290] = 1;
						}
						@Pc(461) boolean[] local461 = local159 != null && local159.aBoolean569 ? Static88.aBooleanArrayArray11[local91] : Static92.aBooleanArrayArray2[local91];
						this.method5576(arg1, local97, this.anInt6958, local10, local25, local15, local47, this.anInt6959, local91, local27, local171, local85, local159);
						@Pc(494) boolean local494 = local159 != null && local159.anInt7791 != local159.anInt7788;
						if (!local494) {
							for (local309 = 0; local309 < 8; local309++) {
								if (Static17.anIntArray21[local309] >= 0 && Static337.anIntArray489[local309] != Static252.anIntArray379[local309]) {
									local494 = true;
									break;
								}
							}
						}
						if (!local461[local97 + 1 & 0x3]) {
							local85[1] = Static136.method2526(local85[1], (Static448.anIntArray616[4] & Static448.anIntArray616[2]) == 0);
						}
						if (!local461[local97 + 3 & 0x3]) {
							local85[3] = Static136.method2526(local85[3], (Static448.anIntArray616[6] & Static448.anIntArray616[0]) == 0);
						}
						if (!local461[local97 & 0x3]) {
							local85[0] = Static136.method2526(local85[0], (Static448.anIntArray616[0] & Static448.anIntArray616[2]) == 0);
						}
						if (!local461[local97 + 2 & 0x3]) {
							local85[2] = Static136.method2526(local85[2], (Static448.anIntArray616[4] & Static448.anIntArray616[6]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local97 = 0;
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[3] = false;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local85[0] = local85[1] = false;
								local91 = local91 == 0 ? 13 : 14;
								local97 = 3;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local85[1] = local85[2] = false;
								local91 = local91 == 0 ? 13 : 14;
								local97 = 2;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local85[2] = local85[3] = false;
								local97 = 1;
								local91 = local91 == 0 ? 13 : 14;
							}
						}
						@Pc(796) boolean local796 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(798) int[] local798 = null;
						@Pc(816) int[] local816;
						@Pc(820) int[] local820;
						@Pc(804) int[] local804;
						if (local796) {
							local804 = Static452.anIntArrayArray62[local91];
							local373 = local171 == null ? 0 : Static352.anIntArray500[local91];
							local816 = Static259.anIntArrayArray35[local91];
							local820 = Static390.anIntArrayArray50[local91];
							local386 = local159 == null ? 0 : Static45.anIntArray60[local91];
						} else if (local82) {
							local804 = Static227.anIntArrayArray32[local91];
							local798 = Static16.anIntArrayArray2[local91];
							local386 = local159 == null ? 0 : Static278.anIntArray401[local91];
							local816 = Static186.anIntArrayArray26[local91];
							local373 = local171 == null ? 0 : Static173.anIntArray280[local91];
							local820 = Static131.anIntArrayArray17[local91];
						} else {
							local804 = Static86.anIntArrayArray15[local91];
							local373 = local171 == null ? 0 : Static129.anIntArray231[local91];
							local820 = Static330.anIntArrayArray43[local91];
							local816 = Static143.anIntArrayArray23[local91];
							local798 = Static56.anIntArrayArray6[local91];
							local386 = local159 == null ? 0 : Static206.anIntArray320[local91];
						}
						@Pc(901) int local901 = local373 + local386;
						if (local901 <= 0) {
							Static242.method4029(arg2, local27, local47);
						} else {
							if (local85[0]) {
								local901++;
							}
							if (local85[2]) {
								local901++;
							}
							if (local85[1]) {
								local901++;
							}
							if (local85[3]) {
								local901++;
							}
							@Pc(934) int local934 = 0;
							@Pc(936) int local936 = 0;
							@Pc(940) int local940 = local901 * 3;
							@Pc(947) int[] local947 = local494 ? new int[local940] : null;
							@Pc(950) int[] local950 = new int[local940];
							@Pc(953) int[] local953 = new int[local940];
							@Pc(956) int[] local956 = new int[local940];
							@Pc(959) int[] local959 = new int[local940];
							@Pc(962) int[] local962 = new int[local940];
							@Pc(969) int[] local969 = arg0 == null ? null : new int[local940];
							@Pc(978) int[] local978 = arg0 == null && arg5 == null ? null : new int[local940];
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = -1;
							@Pc(984) int local984 = 256;
							@Pc(1072) byte local1072;
							@Pc(1008) int local1008;
							@Pc(1010) int local1010;
							@Pc(1242) int local1242;
							@Pc(1248) int local1248;
							@Pc(1256) int local1256;
							@Pc(1261) int local1261;
							@Pc(1273) int local1273;
							@Pc(1266) int local1266;
							@Pc(1277) int local1277;
							@Pc(1334) int local1334;
							@Pc(1340) int local1340;
							if (local159 != null) {
								local980 = local159.anInt7791;
								local982 = arg1.method2052() ? local159.anInt7803 : local159.anInt7789;
								local984 = local159.anInt7801;
								local1008 = Static421.method5858(arg1, local159);
								for (local1010 = 0; local1010 < local386; local1010++) {
									if (local85[-local97 & 0x3] && local798[0] == local934) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 1;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 1;
										Static126.anIntArray229[4] = local820[local934];
										local1072 = 6;
										Static126.anIntArray229[5] = local804[local934];
									} else if (local85[2 - local97 & 0x3] && local798[2] == local934) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 5;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 5;
										Static126.anIntArray229[4] = local820[local934];
										local1072 = 6;
										Static126.anIntArray229[5] = local804[local934];
									} else if (local85[1 - local97 & 0x3] && local798[1] == local934) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 3;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 3;
										Static126.anIntArray229[4] = local820[local934];
										local1072 = 6;
										Static126.anIntArray229[5] = local804[local934];
									} else if (local85[3 - local97 & 0x3] && local798[3] == local934) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 7;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 7;
										Static126.anIntArray229[4] = local820[local934];
										Static126.anIntArray229[5] = local804[local934];
										local1072 = 6;
									} else {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = local820[local934];
										local1072 = 3;
										Static126.anIntArray229[2] = local804[local934];
									}
									for (local1242 = 0; local1242 < local1072; local1242++) {
										local1248 = Static126.anIntArray229[local1242];
										local1256 = local1248 - local97 * 2 & 0x7;
										local1261 = this.anIntArray560[local1248];
										local1266 = this.anIntArray559[local1248];
										if (local97 == 1) {
											local1273 = local1266;
											local1277 = 128 - local1261;
										} else if (local97 == 2) {
											local1273 = 128 - local1261;
											local1277 = 128 - local1266;
										} else if (local97 == 3) {
											local1273 = 128 - local1266;
											local1277 = local1261;
										} else {
											local1273 = local1261;
											local1277 = local1266;
										}
										local950[local936] = local1273;
										local953[local936] = local1277;
										if (local969 != null && Static228.aBooleanArrayArray8[local91][local1248]) {
											local1334 = local1273 + (local27 << 7);
											local1340 = local1277 + (local47 << 7);
											local969[local936] = arg0.R(local1334, local1340) - arg4.R(local1334, local1340);
										}
										if (local978 != null) {
											if (arg0 != null && !Static228.aBooleanArrayArray8[local91][local1248]) {
												local1334 = local1273 + (local27 << 7);
												local1340 = (local47 << 7) + local1277;
												local978[local936] = arg4.R(local1334, local1340) - arg0.R(local1334, local1340);
											} else if (arg5 != null && !Static182.aBooleanArrayArray7[local91][local1248]) {
												local1334 = (local27 << 7) + local1273;
												local1340 = local1277 + (local47 << 7);
												local978[local936] = arg5.R(local1334, local1340) - arg4.R(local1334, local1340);
											}
										}
										if (local1248 < 8 && Static17.anIntArray21[local1256] > local159.anInt7793) {
											if (local947 != null) {
												local947[local936] = Static252.anIntArray379[local1256];
											}
											local962[local936] = Static431.anIntArray601[local1256];
											local959[local936] = Static427.anIntArray595[local1256];
											local956[local936] = Static337.anIntArray489[local1256];
										} else {
											if (local947 != null) {
												local947[local936] = local1008;
											}
											local959[local936] = arg1.method2052() ? local159.anInt7803 : local159.anInt7789;
											local962[local936] = local159.anInt7801;
											local956[local936] = local980;
										}
										local936++;
									}
									local934++;
								}
								if (!this.aBoolean513 && arg2 == 0) {
									Static100.method1889(local27, local47, local159.anInt7787, local159.anInt7786 * 8, local159.anInt7800);
								}
								if (local91 != 12 && local159.anInt7791 != -1 && local159.aBoolean568) {
									local80 = true;
								}
							} else if (local796) {
								local934 = Static45.anIntArray60[local91];
							} else if (local82) {
								local934 = Static278.anIntArray401[local91];
							} else {
								local934 = Static206.anIntArray320[local91];
							}
							if (local171 != null) {
								if (local129 == 0) {
									local129 = local113;
								}
								if (local121 == 0) {
									local121 = local113;
								}
								if (local137 == 0) {
									local137 = local113;
								}
								@Pc(1584) Class92 local1584 = this.aClass121_5.method3390(local113 - 1);
								@Pc(1592) Class92 local1592 = this.aClass121_5.method3390(local121 - 1);
								@Pc(1600) Class92 local1600 = this.aClass121_5.method3390(local129 - 1);
								@Pc(1608) Class92 local1608 = this.aClass121_5.method3390(local137 - 1);
								for (local1256 = 0; local1256 < local373; local1256++) {
									if (local85[-local97 & 0x3] && local798[0] == local934) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 1;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 1;
										Static126.anIntArray229[4] = local820[local934];
										local1072 = 6;
										Static126.anIntArray229[5] = local804[local934];
									} else if (local85[2 - local97 & 0x3] && local934 == local798[2]) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 5;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 5;
										Static126.anIntArray229[4] = local820[local934];
										Static126.anIntArray229[5] = local804[local934];
										local1072 = 6;
									} else if (local85[1 - local97 & 0x3] && local798[1] == local934) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 3;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 3;
										Static126.anIntArray229[4] = local820[local934];
										Static126.anIntArray229[5] = local804[local934];
										local1072 = 6;
									} else if (local85[3 - local97 & 0x3] && local798[3] == local934) {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = 7;
										Static126.anIntArray229[2] = local804[local934];
										Static126.anIntArray229[3] = 7;
										Static126.anIntArray229[4] = local820[local934];
										Static126.anIntArray229[5] = local804[local934];
										local1072 = 6;
									} else {
										Static126.anIntArray229[0] = local816[local934];
										Static126.anIntArray229[1] = local820[local934];
										local1072 = 3;
										Static126.anIntArray229[2] = local804[local934];
									}
									for (local1261 = 0; local1261 < local1072; local1261++) {
										local1273 = Static126.anIntArray229[local1261];
										local1266 = local1273 - local97 * 2 & 0x7;
										local1277 = this.anIntArray560[local1273];
										local1340 = this.anIntArray559[local1273];
										@Pc(1882) int local1882;
										if (local97 == 1) {
											local1334 = local1340;
											local1882 = 128 - local1277;
										} else if (local97 == 2) {
											local1334 = 128 - local1277;
											local1882 = 128 - local1340;
										} else if (local97 == 3) {
											local1882 = local1277;
											local1334 = 128 - local1340;
										} else {
											local1334 = local1277;
											local1882 = local1340;
										}
										local950[local936] = local1334;
										local953[local936] = local1882;
										@Pc(1933) int local1933;
										@Pc(1940) int local1940;
										if (local969 != null && Static228.aBooleanArrayArray8[local91][local1273]) {
											local1933 = local1334 + (local27 << 7);
											local1940 = (local47 << 7) + local1882;
											local969[local936] = arg0.R(local1933, local1940) - arg4.R(local1933, local1940);
										}
										if (local978 != null) {
											if (arg0 != null && !Static228.aBooleanArrayArray8[local91][local1273]) {
												local1933 = local1334 + (local27 << 7);
												local1940 = (local47 << 7) + local1882;
												local978[local936] = arg4.R(local1933, local1940) - arg0.R(local1933, local1940);
											} else if (arg5 != null && !Static182.aBooleanArrayArray7[local91][local1273]) {
												local1933 = (local27 << 7) + local1334;
												local1940 = local1882 + (local47 << 7);
												local978[local936] = arg5.R(local1933, local1940) - arg4.R(local1933, local1940);
											}
										}
										if (local1273 < 8 && Static17.anIntArray21[local1266] >= 0) {
											if (local947 != null) {
												local947[local936] = Static252.anIntArray379[local1266];
											}
											local962[local936] = Static431.anIntArray601[local1266];
											local959[local936] = Static427.anIntArray595[local1266];
											local956[local936] = Static337.anIntArray489[local1266];
										} else {
											if (local82 && Static228.aBooleanArrayArray8[local91][local1273]) {
												local959[local936] = local982;
												local962[local936] = local984;
												local956[local936] = local980;
											} else if (local1334 == 0 && local1882 == 0) {
												local956[local936] = arg3[local27][local47];
												local959[local936] = local1584.anInt2917;
												local962[local936] = local1584.anInt2924;
											} else if (local1334 == 0 && local1882 == 128) {
												local956[local936] = arg3[local27][local65];
												local959[local936] = local1592.anInt2917;
												local962[local936] = local1592.anInt2924;
											} else if (local1334 == 128 && local1882 == 128) {
												local956[local936] = arg3[local45][local65];
												local959[local936] = local1600.anInt2917;
												local962[local936] = local1600.anInt2924;
											} else if (local1334 == 128 && local1882 == 0) {
												local956[local936] = arg3[local45][local47];
												local959[local936] = local1608.anInt2917;
												local962[local936] = local1608.anInt2924;
											} else {
												if (local1334 < 64) {
													if (local1882 >= 64) {
														local959[local936] = local1592.anInt2917;
														local962[local936] = local1592.anInt2924;
													} else {
														local959[local936] = local1584.anInt2917;
														local962[local936] = local1584.anInt2924;
													}
												} else if (local1882 < 64) {
													local959[local936] = local1608.anInt2917;
													local962[local936] = local1608.anInt2924;
												} else {
													local959[local936] = local1600.anInt2917;
													local962[local936] = local1600.anInt2924;
												}
												local1933 = Static293.method4488(arg3[local27][local47], arg3[local45][local47], local1334 << 7 >> 7);
												local1940 = Static293.method4488(arg3[local27][local65], arg3[local45][local65], local1334 << 7 >> 7);
												local956[local936] = Static293.method4488(local1933, local1940, local1882 << 7 >> 7);
											}
											if (local947 != null) {
												local947[local936] = local956[local936];
											}
										}
										local936++;
									}
									local934++;
								}
								if (local91 != 0 && local171.aBoolean188) {
									local80 = true;
								}
							}
							local1008 = arg4.oa(local27, local47);
							local1010 = arg4.oa(local45, local47);
							local1242 = arg4.oa(local45, local65);
							local1248 = arg4.oa(local27, local65);
							if (arg2 > 0) {
								@Pc(2359) boolean local2359 = true;
								if (local113 == 0 && local91 != 0) {
									local2359 = false;
								}
								if (local105 > 0 && local182 != null && !local182.aBoolean570) {
									local2359 = false;
								}
								if (local2359 && local1010 == local1008 && local1008 == local1242 && local1248 == local1008) {
									this.aByteArrayArrayArray11[arg2][local27][local47] = (byte) (this.aByteArrayArrayArray11[arg2][local27][local47] | 0x4);
								}
							}
							local1256 = 0;
							local1261 = 0;
							local1273 = 0;
							if (this.aBoolean513) {
								local1256 = Static108.method2148(local27, local47);
								local1261 = Static133.method2458(local27, local47);
								local1273 = Static329.method4880(local27, local47);
							}
							arg4.ta(local27, local47, local950, local969, local953, local978, local956, local947, local959, local962, local1256, local1261, local1273, local80);
							Static242.method4029(arg2, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII)V")
	private void method5567(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg1; local7 < arg1 + 64; local7++) {
			for (local11 = arg2; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && this.anInt6959 > local11 && local7 >= 0 && this.anInt6958 > local7) {
					this.anIntArrayArrayArray12[arg0][local11][local7] = arg0 > 0 ? this.anIntArrayArrayArray12[arg0 - 1][local11][local7] - 240 : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt6959) {
			for (local11 = arg1 + 1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && this.anInt6958 > local11) {
					this.anIntArrayArrayArray12[arg0][arg2][local11] = this.anIntArrayArrayArray12[arg0][arg2 - 1][local11];
				}
			}
		}
		if (arg1 > 0 && this.anInt6958 > arg1) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt6959) {
					this.anIntArrayArrayArray12[arg0][local11][arg1] = this.anIntArrayArrayArray12[arg0][local11][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || this.anInt6959 <= arg2 || this.anInt6958 <= arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1] != 0) {
				this.anIntArrayArrayArray12[arg0][arg2][arg1] = this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1];
			} else if (arg1 > 0 && this.anIntArrayArrayArray12[arg0][arg2][arg1 - 1] != 0) {
				this.anIntArrayArrayArray12[arg0][arg2][arg1] = this.anIntArrayArrayArray12[arg0][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray12[arg0][arg2][arg1] = this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1 - 1];
			}
		} else if (arg2 > 0 && this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1] != this.anIntArrayArrayArray12[arg0 - 1][arg2 - 1][arg1]) {
			this.anIntArrayArrayArray12[arg0][arg2][arg1] = this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && this.anIntArrayArrayArray12[arg0][arg2][arg1 - 1] != this.anIntArrayArrayArray12[arg0 - 1][arg2][arg1 - 1]) {
			this.anIntArrayArrayArray12[arg0][arg2][arg1] = this.anIntArrayArrayArray12[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1 - 1] != this.anIntArrayArrayArray12[arg0 - 1][arg2 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray12[arg0][arg2][arg1] = this.anIntArrayArrayArray12[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([Lclient!ue;IIIIILclient!wn;)V")
	public final void method5568(@OriginalArg(0) Class253[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub20 arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean513) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class253 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg2;
						@Pc(33) int local33 = arg3 + local22;
						if (local28 >= 0 && local28 < this.anInt6959 && local33 >= 0 && local33 < this.anInt6958) {
							local16.method5725(local28, local33);
						}
					}
				}
			}
		}
		local10 = arg2 + arg1;
		@Pc(88) int local88 = arg4 + arg3;
		for (local18 = 0; local18 < this.anInt6970; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method5578(0, local18, local28 + local88, 0, arg5, 0, arg2 + local22, arg3 + local28, local10 + local22, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI[[I)V")
	public final void method5569(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray12[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6959 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6958 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!qa;[Lclient!ue;[[[I)V")
	public final void method5571(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class253[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (!this.aBoolean513) {
			for (local12 = 0; local12 < 4; local12++) {
				for (local16 = 0; local16 < this.anInt6959; local16++) {
					for (local20 = 0; local20 < this.anInt6958; local20++) {
						if ((Static398.aByteArrayArrayArray17[local12][local16][local20] & 0x1) != 0) {
							@Pc(34) int local34 = local12;
							if ((Static398.aByteArrayArrayArray17[1][local16][local20] & 0x2) != 0) {
								local34 = local12 - 1;
							}
							if (local34 >= 0) {
								arg1[local34].method5728(local16, local20);
							}
						}
					}
				}
			}
		}
		for (local12 = 0; local12 < this.anInt6970; local12++) {
			local16 = 0;
			local20 = 0;
			if (!this.aBoolean513) {
				if (Static25.aBoolean21) {
					local16 = 2;
				}
				if (Static290.aBoolean385) {
					local20 = 8;
				}
				if (Static422.anInt7302 != 0) {
					if (Static418.aBoolean196 | local12 == 0) {
						local20 |= 0x10;
					}
					local16 |= 0x1;
				}
			}
			if (Static25.aBoolean21) {
				local20 |= 0x7;
			}
			if (!Static178.aBoolean230) {
				local20 |= 0x20;
			}
			@Pc(151) int[][] local151 = arg2 == null || arg2.length <= local12 ? this.anIntArrayArrayArray12[local12] : arg2[local12];
			Static330.method4884(local12, arg0.method2089(this.anInt6959, this.anInt6958, this.anIntArrayArrayArray12[local12], local151, local16, local20));
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIZLclient!wn;[Lclient!ue;I)V")
	public final void method5572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class4_Sub20 arg6, @OriginalArg(8) Class253[] arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(51) int local51;
		if (!this.aBoolean513) {
			@Pc(18) Class253 local18 = arg7[arg5];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(39) int local39 = arg4 + Static250.method4108(arg0, local20 & 0x7, local24 & 0x7);
					local51 = Static443.method6061(local24 & 0x7, arg0, local20 & 0x7) + arg3;
					if (local39 > 0 && local39 < this.anInt6959 - 1 && local51 > 0 && local51 < this.anInt6958 - 1) {
						local18.method5725(local39, local51);
					}
				}
			}
		}
		@Pc(95) int local95 = (arg2 & 0x7) * 8;
		@Pc(105) int local105 = (arg1 & 0xFFFFFFF8) << 3;
		local20 = (arg2 & 0xFFFFFFF8) << 3;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (arg0 == 1) {
			local115 = 1;
		} else if (arg0 == 2) {
			local113 = 1;
			local115 = 1;
		} else if (arg0 == 3) {
			local113 = 1;
		}
		for (local51 = 0; local51 < this.anInt6970; local51++) {
			for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
				for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
					if (arg8 == local51 && local11 <= local144 && local144 <= local11 + 8 && local95 <= local148 && local148 <= local95 + 8) {
						@Pc(210) int local210;
						@Pc(216) int local216;
						if (local11 + 8 == local144 || local95 + 8 == local148) {
							if (arg0 == 0) {
								local210 = local144 + arg4 - local11;
								local216 = local148 + arg3 - local95;
							} else if (arg0 == 1) {
								local210 = local148 + arg4 - local95;
								local216 = local11 + arg3 + 8 - local144;
							} else if (arg0 == 2) {
								local210 = local11 + arg4 + 8 - local144;
								local216 = arg3 + local95 + 8 - local148;
							} else {
								local210 = arg4 + local95 + 8 - local148;
								local216 = local144 + arg3 - local11;
							}
							this.method5578(0, arg5, local20 + local148, 0, arg6, 0, local210, local216, local105 + local144, true);
						} else {
							local210 = arg4 + Static250.method4108(arg0, local144 & 0x7, local148 & 0x7);
							local216 = arg3 + Static443.method6061(local148 & 0x7, arg0, local144 & 0x7);
							this.method5578(local113, arg5, local148 + local20, arg0, arg6, local115, local210, local216, local105 + local144, false);
						}
						if (local144 == 63 || local148 == 63) {
							@Pc(353) byte local353 = 1;
							if (local144 == 63 && local148 == 63) {
								local353 = 3;
							}
							for (@Pc(363) int local363 = 0; local363 < local353; local363++) {
								@Pc(367) int local367 = local144;
								@Pc(369) int local369 = local148;
								if (local363 == 0) {
									local367 = local144 == 63 ? 64 : local144;
									local369 = local148 == 63 ? 64 : local148;
								} else if (local363 == 1) {
									local367 = 64;
								} else if (local363 == 2) {
									local369 = 64;
								}
								@Pc(432) int local432;
								@Pc(423) int local423;
								if (arg0 == 0) {
									local432 = arg4 + local367 - local11;
									local423 = local369 + arg3 - local95;
								} else if (arg0 == 1) {
									local423 = arg3 + local11 + 8 - local367;
									local432 = local369 + arg4 - local95;
								} else if (arg0 == 2) {
									local423 = local95 + arg3 + 8 - local369;
									local432 = arg4 + local11 + 8 - local367;
								} else {
									local432 = local95 + arg4 + 8 - local369;
									local423 = arg3 + local367 - local11;
								}
								if (local432 >= 0 && this.anInt6959 > local432 && local423 >= 0 && local423 < this.anInt6958) {
									this.anIntArrayArrayArray12[arg5][local432][local423] = this.anIntArrayArrayArray12[arg5][local210 + local113][local216 + local115];
								}
							}
						}
					} else {
						this.method5578(0, 0, 0, 0, arg6, 0, -1, -1, 0, false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!o;BI[[ILclient!o;Lclient!o;Lclient!qa;)V")
	private void method5574(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) Class14 arg4, @OriginalArg(6) Class30 arg5) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt6959; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt6958; local16++) {
				if (Static462.anInt7858 == -1 || Static404.method5662(local12, arg1, local16, Static462.anInt7858)) {
					@Pc(40) byte local40 = this.aByteArrayArrayArray12[arg1][local12][local16];
					@Pc(49) byte local49 = this.aByteArrayArrayArray14[arg1][local12][local16];
					@Pc(60) int local60 = this.aByteArrayArrayArray15[arg1][local12][local16] & 0xFF;
					@Pc(71) int local71 = this.aByteArrayArrayArray16[arg1][local12][local16] & 0xFF;
					@Pc(85) Class271 local85 = local60 == 0 ? null : this.aClass59_5.method1763(local60 - 1);
					@Pc(100) Class92 local100 = local71 == 0 ? null : this.aClass121_5.method3390(local71 - 1);
					@Pc(102) int local102 = 0;
					@Pc(104) int local104 = 0;
					if (local40 != 0) {
						local104 = local85 == null ? 0 : Static45.anIntArray60[local40];
						local102 = local100 == null ? 0 : Static352.anIntArray500[local40];
					} else if (local85 != null) {
						local104 = Static45.anIntArray60[local40];
					} else if (local100 != null) {
						local102 = Static45.anIntArray60[local40];
					}
					@Pc(145) int local145 = local102 + local104;
					@Pc(147) int local147 = 0;
					if (local145 != 0) {
						@Pc(152) int[] local152 = new int[local145];
						@Pc(155) int[] local155 = new int[local145];
						@Pc(158) int[] local158 = new int[local145];
						@Pc(161) int[] local161 = new int[local145];
						@Pc(163) boolean local163 = false;
						@Pc(188) int local188;
						@Pc(194) int local194;
						if (local85 == null || local85.anInt7791 == -1 && local85.anInt7788 == -1 && local85.anInt7803 == -1) {
							for (local188 = 0; local188 < local104; local188++) {
								local152[local147] = -1;
								local147++;
							}
						} else {
							local188 = arg5.method2052() ? local85.anInt7803 : local85.anInt7789;
							if (Static231.aBoolean299) {
								local188 = -1;
							}
							for (local194 = 0; local194 < local104; local194++) {
								local158[local147] = local188;
								local161[local147] = local85.anInt7801;
								if (local85.anInt7791 == -1) {
									local152[local147] = -1;
								} else {
									local152[local147] = local85.anInt7791;
								}
								if (local85.anInt7788 == -1) {
									local155[local147] = -1;
								} else {
									local163 = true;
									local155[local147] = local85.anInt7788;
								}
								local147++;
							}
							if (!this.aBoolean513 && arg1 == 0) {
								Static100.method1889(local12, local16, local85.anInt7787, local85.anInt7786 * 8, local85.anInt7800);
							}
						}
						if (!local163) {
							local155 = null;
						}
						if (local100 == null) {
							for (local188 = 0; local188 < local102; local188++) {
								local152[local147] = -1;
								local147++;
							}
						} else {
							local188 = local100.anInt2917;
							if (Static231.aBoolean299) {
								local188 = -1;
							}
							for (local194 = 0; local194 < local102; local194++) {
								local158[local147] = local188;
								local161[local147] = local100.anInt2924;
								local152[local147] = arg2[local12][local16];
								if (local155 != null) {
									local155[local147] = -1;
								}
								local147++;
							}
						}
						local188 = this.anIntArray560.length;
						@Pc(356) int[] local356 = new int[local188];
						@Pc(359) int[] local359 = new int[local188];
						@Pc(366) int[] local366 = arg4 == null ? null : new int[local188];
						@Pc(375) int[] local375 = arg4 == null && arg3 == null ? null : new int[local188];
						@Pc(384) int local384;
						@Pc(389) int local389;
						@Pc(475) int local475;
						@Pc(481) int local481;
						for (@Pc(377) int local377 = 0; local377 < local188; local377++) {
							local384 = this.anIntArray560[local377];
							local389 = this.anIntArray559[local377];
							if (local49 == 0) {
								local356[local377] = local384;
								local359[local377] = local389;
							} else if (local49 == 1) {
								local356[local377] = local389;
								local359[local377] = 128 - local384;
							} else if (local49 == 2) {
								local356[local377] = 128 - local384;
								local359[local377] = 128 - local389;
							} else if (local49 == 3) {
								local356[local377] = 128 - local389;
								local359[local377] = local384;
							}
							if (local366 != null && Static228.aBooleanArrayArray8[local40][local377]) {
								local475 = (local12 << 7) + local384;
								local481 = local384 + (local16 << 7);
								local366[local377] = arg4.R(local475, local481) - arg0.R(local475, local481);
							}
							if (local375 != null) {
								if (arg4 != null && !Static228.aBooleanArrayArray8[local40][local377]) {
									local475 = (local12 << 7) + local384;
									local481 = (local16 << 7) + local384;
									local375[local377] = arg0.R(local475, local481) - arg4.R(local475, local481);
								} else if (arg3 != null && !Static182.aBooleanArrayArray7[local40][local377]) {
									local475 = (local12 << 7) + local384;
									local481 = (local16 << 7) + local384;
									local375[local377] = arg3.R(local475, local481) - arg0.R(local475, local481);
								}
							}
						}
						local384 = arg0.oa(local12, local16);
						local389 = arg0.oa(local12 + 1, local16);
						local475 = arg0.oa(local12 + 1, local16 + 1);
						local481 = arg0.oa(local12, local16 + 1);
						if (arg1 > 0) {
							@Pc(598) boolean local598 = true;
							if (local71 == 0 && local40 != 0) {
								local598 = false;
							}
							if (local60 > 0 && local85 != null && !local85.aBoolean570) {
								local598 = false;
							}
							if (local598 && local384 == local389 && local384 == local475 && local384 == local481) {
								this.aByteArrayArrayArray11[arg1][local12][local16] = (byte) (this.aByteArrayArrayArray11[arg1][local12][local16] | 0x4);
							}
						}
						@Pc(658) int local658 = 0;
						@Pc(660) int local660 = 0;
						@Pc(662) int local662 = 0;
						if (this.aBoolean513) {
							local658 = Static108.method2148(local12, local16);
							local660 = Static133.method2458(local12, local16);
							local662 = Static329.method4880(local12, local16);
						}
						arg0.method2552(local12, local16, local356, local366, local359, local375, Static259.anIntArrayArray35[local40], Static390.anIntArrayArray50[local40], Static452.anIntArrayArray62[local40], local152, local155, local158, local161, local658, local660, local662);
						Static242.method4029(arg1, local12, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!o;Lclient!o;Lclient!qa;I)V")
	public final void method5575(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class30 arg2) {
		if (Static416.anIntArray588 == null || this.anInt6958 != Static416.anIntArray588.length) {
			Static266.anIntArray388 = new int[this.anInt6958];
			Static113.anIntArray206 = new int[this.anInt6958];
			Static405.anIntArray575 = new int[this.anInt6958];
			Static416.anIntArray588 = new int[this.anInt6958];
			Static123.anIntArray223 = new int[this.anInt6958];
		}
		@Pc(42) int[][] local42 = new int[this.anInt6959][this.anInt6958];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt6970; local44++) {
			for (local48 = 0; local48 < this.anInt6958; local48++) {
				Static416.anIntArray588[local48] = 0;
				Static123.anIntArray223[local48] = 0;
				Static266.anIntArray388[local48] = 0;
				Static113.anIntArray206[local48] = 0;
				Static405.anIntArray575[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt6959; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(175) int local175;
				for (@Pc(85) int local85 = 0; local85 < this.anInt6958; local85++) {
					local91 = local81 + 5;
					@Pc(152) int local152;
					if (local91 < this.anInt6959) {
						local106 = this.aByteArrayArrayArray16[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class92 local116 = this.aClass121_5.method3390(local106 - 1);
							Static416.anIntArray588[local85] += local116.anInt2923;
							Static123.anIntArray223[local85] += local116.anInt2927;
							Static266.anIntArray388[local85] += local116.anInt2916;
							Static113.anIntArray206[local85] += local116.anInt2928;
							local152 = Static405.anIntArray575[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local175 = this.aByteArrayArrayArray16[local44][local106][local85] & 0xFF;
						if (local175 > 0) {
							@Pc(188) Class92 local188 = this.aClass121_5.method3390(local175 - 1);
							Static416.anIntArray588[local85] -= local188.anInt2923;
							Static123.anIntArray223[local85] -= local188.anInt2927;
							Static266.anIntArray388[local85] -= local188.anInt2916;
							Static113.anIntArray206[local85] -= local188.anInt2928;
							local152 = Static405.anIntArray575[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local175 = 0;
					@Pc(246) int local246 = 0;
					@Pc(248) int local248 = 0;
					for (@Pc(250) int local250 = -5; local250 < this.anInt6958; local250++) {
						@Pc(256) int local256 = local250 + 5;
						if (this.anInt6958 > local256) {
							local246 += Static113.anIntArray206[local256];
							local175 += Static266.anIntArray388[local256];
							local248 += Static405.anIntArray575[local256];
							local106 += Static123.anIntArray223[local256];
							local91 += Static416.anIntArray588[local256];
						}
						@Pc(294) int local294 = local250 - 5;
						if (local294 >= 0) {
							local175 -= Static266.anIntArray388[local294];
							local91 -= Static416.anIntArray588[local294];
							local246 -= Static113.anIntArray206[local294];
							local248 -= Static405.anIntArray575[local294];
							local106 -= Static123.anIntArray223[local294];
						}
						if (local250 >= 0 && local246 > 0 && local248 > 0) {
							local42[local81][local250] = Static239.method4011(local91 * 256 / local246, local106 / local248, local175 / local248);
						}
					}
				}
			}
			if (Static127.aBoolean176) {
				this.method5566(local44 == 0 ? arg1 : null, arg2, local44, local42, Static389.aClass14Array3[local44], local44 == 0 ? arg0 : null);
			} else {
				this.method5574(Static389.aClass14Array3[local44], local44, local42, local44 == 0 ? arg0 : null, local44 == 0 ? arg1 : null, arg2);
			}
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
		}
		if (!this.aBoolean513) {
			if (Static422.anInt7302 != 0) {
				Static83.method5666();
			}
			if (Static25.aBoolean21) {
				Static376.method5362();
			}
		}
		for (local48 = 0; local48 < this.anInt6970; local48++) {
			Static389.aClass14Array3[local48].U();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!qa;II[[B[[B[[BIIIILclient!hb;[ZILclient!wi;)V")
	private void method5576(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class92 arg10, @OriginalArg(11) boolean[] arg11, @OriginalArg(13) Class271 arg12) {
		@Pc(18) boolean[] local18 = arg12 != null && arg12.aBoolean569 ? Static88.aBooleanArrayArray11[arg8] : Static92.aBooleanArrayArray2[arg8];
		@Pc(40) int local40;
		@Pc(50) Class271 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg6 > 0) {
			if (arg9 > 0) {
				local40 = arg4[arg9 - 1][arg6 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass59_5.method1763(local40 - 1);
					if (local50.anInt7791 != -1 && local50.aBoolean569) {
						local67 = arg3[arg9 - 1][arg6 - 1];
						local83 = arg5[arg9 - 1][arg6 - 1] * 2 + 4 & 0x7;
						local88 = Static421.method5858(arg0, local50);
						if (Static228.aBooleanArrayArray8[local67][local83]) {
							Static337.anIntArray489[0] = local50.anInt7791;
							Static252.anIntArray379[0] = local88;
							Static427.anIntArray595[0] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
							Static431.anIntArray601[0] = local50.anInt7801;
							Static17.anIntArray21[0] = local50.anInt7793;
							Static448.anIntArray616[0] = 256;
						}
					}
				}
			}
			if (arg7 - 1 > arg9) {
				local40 = arg4[arg9 + 1][arg6 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass59_5.method1763(local40 - 1);
					if (local50.anInt7791 != -1 && local50.aBoolean569) {
						local67 = arg3[arg9 + 1][arg6 - 1];
						local83 = arg5[arg9 + 1][arg6 - 1] * 2 + 6 & 0x7;
						local88 = Static421.method5858(arg0, local50);
						if (Static228.aBooleanArrayArray8[local67][local83]) {
							Static337.anIntArray489[2] = local50.anInt7791;
							Static252.anIntArray379[2] = local88;
							Static427.anIntArray595[2] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
							Static431.anIntArray601[2] = local50.anInt7801;
							Static17.anIntArray21[2] = local50.anInt7793;
							Static448.anIntArray616[2] = 512;
						}
					}
				}
			}
		}
		if (arg6 < arg2 - 1) {
			if (arg9 > 0) {
				local40 = arg4[arg9 - 1][arg6 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass59_5.method1763(local40 - 1);
					if (local50.anInt7791 != -1 && local50.aBoolean569) {
						local67 = arg3[arg9 - 1][arg6 + 1];
						local83 = arg5[arg9 - 1][arg6 + 1] * 2 + 2 & 0x7;
						local88 = Static421.method5858(arg0, local50);
						if (Static228.aBooleanArrayArray8[local67][local83]) {
							Static337.anIntArray489[6] = local50.anInt7791;
							Static252.anIntArray379[6] = local88;
							Static427.anIntArray595[6] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
							Static431.anIntArray601[6] = local50.anInt7801;
							Static17.anIntArray21[6] = local50.anInt7793;
							Static448.anIntArray616[6] = 64;
						}
					}
				}
			}
			if (arg9 < arg7 - 1) {
				local40 = arg4[arg9 + 1][arg6 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass59_5.method1763(local40 - 1);
					if (local50.anInt7791 != -1 && local50.aBoolean569) {
						local67 = arg3[arg9 + 1][arg6 + 1];
						local83 = --(arg5[arg9 + 1][arg6 + 1] * 2) & 0x7;
						local88 = Static421.method5858(arg0, local50);
						if (Static228.aBooleanArrayArray8[local67][local83]) {
							Static337.anIntArray489[4] = local50.anInt7791;
							Static252.anIntArray379[4] = local88;
							Static427.anIntArray595[4] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
							Static431.anIntArray601[4] = local50.anInt7801;
							Static17.anIntArray21[4] = local50.anInt7793;
							Static448.anIntArray616[4] = 128;
						}
					}
				}
			}
		}
		@Pc(534) int local534;
		@Pc(541) int local541;
		@Pc(543) int local543;
		@Pc(503) byte local503;
		if (arg6 > 0) {
			local40 = arg4[arg9][arg6 - 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass59_5.method1763(local40 - 1);
				if (local50.anInt7791 != -1) {
					local67 = arg3[arg9][arg6 - 1];
					local503 = arg5[arg9][arg6 - 1];
					if (local50.aBoolean569) {
						local88 = 2;
						local534 = local503 * 2 + 4;
						local541 = Static421.method5858(arg0, local50);
						for (local543 = 0; local543 < 3; local543++) {
							local534 &= 0x7;
							local88 &= 0x7;
							if (Static228.aBooleanArrayArray8[local67][local534] && local50.anInt7793 >= Static17.anIntArray21[local88]) {
								Static337.anIntArray489[local88] = local50.anInt7791;
								Static252.anIntArray379[local88] = local541;
								Static427.anIntArray595[local88] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
								Static431.anIntArray601[local88] = local50.anInt7801;
								if (Static17.anIntArray21[local88] == local50.anInt7793) {
									Static448.anIntArray616[local88] |= 0x20;
								} else {
									Static448.anIntArray616[local88] = 32;
								}
								Static17.anIntArray21[local88] = local50.anInt7793;
							}
							local88--;
							local534++;
						}
						if (!local18[arg1 & 0x3]) {
							arg11[0] = Static88.aBooleanArrayArray11[local67][local503 + 2 & 0x3];
						}
					} else if (!local18[arg1 & 0x3]) {
						arg11[0] = Static92.aBooleanArrayArray2[local67][local503 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg6) {
			local40 = arg4[arg9][arg6 + 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass59_5.method1763(local40 - 1);
				if (local50.anInt7791 != -1) {
					local67 = arg3[arg9][arg6 + 1];
					local503 = arg5[arg9][arg6 + 1];
					if (local50.aBoolean569) {
						local88 = 4;
						local534 = local503 * 2 + 2;
						local541 = Static421.method5858(arg0, local50);
						for (local543 = 0; local543 < 3; local543++) {
							local88 &= 0x7;
							local534 &= 0x7;
							if (Static228.aBooleanArrayArray8[local67][local534] && Static17.anIntArray21[local88] <= local50.anInt7793) {
								Static337.anIntArray489[local88] = local50.anInt7791;
								Static252.anIntArray379[local88] = local541;
								Static427.anIntArray595[local88] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
								Static431.anIntArray601[local88] = local50.anInt7801;
								if (Static17.anIntArray21[local88] == local50.anInt7793) {
									Static448.anIntArray616[local88] |= 0x10;
								} else {
									Static448.anIntArray616[local88] = 16;
								}
								Static17.anIntArray21[local88] = local50.anInt7793;
							}
							local88++;
							local534--;
						}
						if (!local18[arg1 + 2 & 0x3]) {
							arg11[2] = Static88.aBooleanArrayArray11[local67][local503 & 0x3];
						}
					} else if (!local18[arg1 + 2 & 0x3]) {
						arg11[2] = Static92.aBooleanArrayArray2[local67][--local503 & 0x3];
					}
				}
			}
		}
		if (arg9 > 0) {
			local40 = arg4[arg9 - 1][arg6] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass59_5.method1763(local40 - 1);
				if (local50.anInt7791 != -1) {
					local67 = arg3[arg9 - 1][arg6];
					local503 = arg5[arg9 - 1][arg6];
					if (local50.aBoolean569) {
						local88 = 6;
						local534 = local503 * 2 + 4;
						local541 = Static421.method5858(arg0, local50);
						for (local543 = 0; local543 < 3; local543++) {
							local534 &= 0x7;
							local88 &= 0x7;
							if (Static228.aBooleanArrayArray8[local67][local534] && Static17.anIntArray21[local88] <= local50.anInt7793) {
								Static337.anIntArray489[local88] = local50.anInt7791;
								Static252.anIntArray379[local88] = local541;
								Static427.anIntArray595[local88] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
								Static431.anIntArray601[local88] = local50.anInt7801;
								if (local50.anInt7793 == Static17.anIntArray21[local88]) {
									Static448.anIntArray616[local88] |= 0x8;
								} else {
									Static448.anIntArray616[local88] = 8;
								}
								Static17.anIntArray21[local88] = local50.anInt7793;
							}
							local534--;
							local88++;
						}
						if (!local18[arg1 + 3 & 0x3]) {
							arg11[3] = Static88.aBooleanArrayArray11[local67][local503 + 1 & 0x3];
						}
					} else if (!local18[arg1 + 3 & 0x3]) {
						arg11[3] = Static92.aBooleanArrayArray2[local67][local503 + 1 & 0x3];
					}
				}
			}
		}
		if (arg9 < arg7 - 1) {
			local40 = arg4[arg9 + 1][arg6] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass59_5.method1763(local40 - 1);
				if (local50.anInt7791 != -1) {
					local67 = arg3[arg9 + 1][arg6];
					local503 = arg5[arg9 + 1][arg6];
					if (local50.aBoolean569) {
						local88 = 4;
						local534 = local503 * 2 + 6;
						local541 = Static421.method5858(arg0, local50);
						for (local543 = 0; local543 < 3; local543++) {
							local534 &= 0x7;
							local88 &= 0x7;
							if (Static228.aBooleanArrayArray8[local67][local534] && Static17.anIntArray21[local88] <= local50.anInt7793) {
								Static337.anIntArray489[local88] = local50.anInt7791;
								Static252.anIntArray379[local88] = local541;
								Static427.anIntArray595[local88] = arg0.method2052() ? local50.anInt7803 : local50.anInt7789;
								Static431.anIntArray601[local88] = local50.anInt7801;
								if (Static17.anIntArray21[local88] == local50.anInt7793) {
									Static448.anIntArray616[local88] |= 0x4;
								} else {
									Static448.anIntArray616[local88] = 4;
								}
								Static17.anIntArray21[local88] = local50.anInt7793;
							}
							local88--;
							local534++;
						}
						if (!local18[arg1 + 1 & 0x3]) {
							arg11[1] = Static88.aBooleanArrayArray11[local67][local503 + 3 & 0x3];
						}
					} else if (!local18[arg1 + 1 & 0x3]) {
						arg11[1] = Static92.aBooleanArrayArray2[local67][local503 + 3 & 0x3];
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		local40 = Static421.method5858(arg0, arg12);
		if (!arg12.aBoolean569) {
			return;
		}
		for (@Pc(1245) int local1245 = 0; local1245 < 8; local1245++) {
			@Pc(1256) int local1256 = local1245 - arg1 * 2 & 0x7;
			if (Static228.aBooleanArrayArray8[arg8][local1245] && arg12.anInt7793 >= Static17.anIntArray21[local1256]) {
				Static337.anIntArray489[local1256] = arg12.anInt7791;
				Static252.anIntArray379[local1256] = local40;
				Static427.anIntArray595[local1256] = arg0.method2052() ? arg12.anInt7803 : arg12.anInt7789;
				Static431.anIntArray601[local1256] = arg12.anInt7801;
				if (arg12.anInt7793 == Static17.anIntArray21[local1256]) {
					Static448.anIntArray616[local1256] |= 0x2;
				} else {
					Static448.anIntArray616[local1256] = 2;
				}
				Static17.anIntArray21[local1256] = arg12.anInt7793;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIILclient!wn;IIIIZI)V")
	private void method5578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub20 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		if (arg3 == 1) {
			arg5 = 1;
		} else if (arg3 == 2) {
			arg0 = 1;
			arg5 = 1;
		} else if (arg3 == 3) {
			arg0 = 1;
		}
		@Pc(50) int local50;
		if (arg6 < 0 || this.anInt6959 <= arg6 || arg7 < 0 || arg7 >= this.anInt6958) {
			while (true) {
				local50 = arg4.method4614();
				if (local50 == 0) {
					return;
				}
				if (local50 == 1) {
					arg4.method4614();
					return;
				}
				if (local50 <= 49) {
					arg4.method4614();
				}
			}
			return;
		}
		if (!this.aBoolean513 && !arg9) {
			Static398.aByteArrayArrayArray17[arg1][arg6][arg7] = 0;
		}
		while (true) {
			local50 = arg4.method4614();
			if (local50 == 0) {
				if (this.aBoolean513) {
					this.anIntArrayArrayArray12[0][arg0 + arg6][arg5 + arg7] = 0;
					return;
				} else if (arg1 == 0) {
					this.anIntArrayArrayArray12[0][arg0 + arg6][arg7 + arg5] = -Static182.method3326(arg2 + 556238, arg8 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray12[arg1][arg6 + arg0][arg7 + arg5] = this.anIntArrayArrayArray12[arg1 - 1][arg6 + arg0][arg7 + arg5] - 240;
					return;
				}
			}
			if (local50 == 1) {
				@Pc(188) int local188 = arg4.method4614();
				if (this.aBoolean513) {
					this.anIntArrayArrayArray12[0][arg6 + arg0][arg5 + arg7] = local188 * 8 << 0;
					return;
				}
				if (local188 == 1) {
					local188 = 0;
				}
				if (arg1 != 0) {
					this.anIntArrayArrayArray12[arg1][arg6 + arg0][arg5 + arg7] = this.anIntArrayArrayArray12[arg1 - 1][arg6 + arg0][arg7 + arg5] - (local188 * 8 << 0);
					return;
				}
				this.anIntArrayArrayArray12[0][arg6 + arg0][arg7 + arg5] = -local188 * 8 << 0;
				return;
			}
			if (local50 <= 49) {
				if (arg9) {
					arg4.method4614();
				} else {
					this.aByteArrayArrayArray15[arg1][arg6][arg7] = arg4.method4576();
					this.aByteArrayArrayArray12[arg1][arg6][arg7] = (byte) ((local50 - 2) / 4);
					this.aByteArrayArrayArray14[arg1][arg6][arg7] = (byte) (arg3 + local50 - 2 & 0x3);
				}
			} else if (local50 <= 81) {
				if (!this.aBoolean513 && !arg9) {
					Static398.aByteArrayArrayArray17[arg1][arg6][arg7] = (byte) (local50 - 49);
				}
			} else if (!arg9) {
				this.aByteArrayArrayArray16[arg1][arg6][arg7] = (byte) (local50 - 81);
			}
		}
	}
}
