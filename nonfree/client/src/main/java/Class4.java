import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public class Class4 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
	private final int[] anIntArray57 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "[I")
	private final int[] anIntArray58 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!er;")
	private final Class71 aClass71_2;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Z")
	public final boolean aBoolean46;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!vn;")
	private final Class252 aClass252_2;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	protected final int anInt804;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	public final int anInt808;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	protected final int anInt798;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIZLclient!er;Lclient!vn;)V")
	protected Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class71 arg4, @OriginalArg(5) Class252 arg5) {
		this.aClass71_2 = arg4;
		this.aBoolean46 = arg3;
		this.aClass252_2 = arg5;
		this.anInt804 = arg1;
		this.anInt808 = arg0;
		this.anInt798 = arg2;
		this.aByteArrayArrayArray12 = new byte[this.anInt808][this.anInt804][this.anInt798];
		this.aByteArrayArrayArray10 = new byte[this.anInt808][this.anInt804][this.anInt798];
		this.aByteArrayArrayArray11 = new byte[this.anInt808][this.anInt804 + 1][this.anInt798 + 1];
		this.aByteArrayArrayArray7 = new byte[this.anInt808][this.anInt804][this.anInt798];
		this.anIntArrayArrayArray2 = new int[this.anInt808][this.anInt804 + 1][this.anInt798 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt808][this.anInt804][this.anInt798];
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!na;Lclient!na;Lclient!qa;Lclient!na;[[III)V")
	private void method738(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray7[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray10[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray9[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt804; local27++) {
			@Pc(47) int local47 = local27 < this.anInt804 - 1 ? local27 + 1 : local27;
			for (@Pc(49) int local49 = 0; local49 < this.anInt798; local49++) {
				@Pc(63) int local63 = this.anInt798 - 1 > local49 ? local49 + 1 : local49;
				if (Static268.anInt5016 == -1 || Static352.method4307(local49, Static268.anInt5016, local27, arg5)) {
					@Pc(78) boolean local78 = false;
					@Pc(80) boolean local80 = false;
					@Pc(83) boolean[] local83 = new boolean[4];
					@Pc(89) int local89 = local10[local27][local49];
					@Pc(95) int local95 = local15[local27][local49];
					@Pc(103) int local103 = local25[local27][local49] & 0xFF;
					@Pc(111) int local111 = local20[local27][local49] & 0xFF;
					@Pc(119) int local119 = local20[local27][local63] & 0xFF;
					@Pc(127) int local127 = local20[local47][local63] & 0xFF;
					@Pc(135) int local135 = local20[local47][local49] & 0xFF;
					if (local103 != 0 || local111 != 0) {
						@Pc(160) Class81 local160 = local103 == 0 ? null : this.aClass71_2.method1743(local103 - 1);
						@Pc(172) Class243 local172 = local111 == 0 ? null : this.aClass252_2.method5695(local111 - 1);
						if (local89 == 0 && local160 == null) {
							local89 = 12;
						}
						@Pc(183) Class81 local183 = local160;
						if (local160 != null) {
							if (local160.anInt2631 == -1 && local160.anInt2627 == -1) {
								local183 = local160;
								local160 = null;
							} else if (local172 != null && local89 != 0) {
								local80 = local160.aBoolean203;
							}
						}
						@Pc(270) int local270;
						@Pc(327) int local327;
						@Pc(385) int local385;
						@Pc(394) int local394;
						if ((local89 == 0 || local89 == 12) && local27 > 0 && local49 > 0 && this.anInt804 > local27 && this.anInt798 > local49) {
							@Pc(253) int local253 = local111 == local20[local47][local63] ? 1 : -1;
							local270 = local111 == local20[local27 - 1][local49 - 1] ? 1 : -1;
							@Pc(289) int local289 = local20[local47][local49 - 1] == local111 ? 1 : -1;
							if (local111 == local20[local27][local49 - 1]) {
								local289++;
								local270++;
							} else {
								local289--;
								local270--;
							}
							local327 = local111 == local20[local27 - 1][local63] ? 1 : -1;
							if (local111 == local20[local47][local49]) {
								local253++;
								local289++;
							} else {
								local289--;
								local253--;
							}
							if (local20[local27][local63] == local111) {
								local253++;
								local327++;
							} else {
								local253--;
								local327--;
							}
							if (local20[local27 - 1][local49] == local111) {
								local270++;
								local327++;
							} else {
								local327--;
								local270--;
							}
							local385 = local270 - local253;
							if (local385 < 0) {
								local385 = -local385;
							}
							local394 = local289 - local327;
							if (local394 < 0) {
								local394 = -local394;
							}
							if (local385 == local394) {
								local385 = arg3.I(local27, local49) - arg3.I(local47, local63);
								if (local385 < 0) {
									local385 = -local385;
								}
								local394 = arg3.I(local47, local49) - arg3.I(local27, local63);
								if (local394 < 0) {
									local394 = -local394;
								}
							}
							local95 = local385 < local394 ? 1 : 0;
						}
						for (local270 = 0; local270 < 13; local270++) {
							Static88.anIntArray164[local270] = -1;
							Static81.anIntArray154[local270] = 1;
						}
						@Pc(480) boolean[] local480 = local160 != null && local160.aBoolean203 ? Static290.aBooleanArrayArray4[local89] : Static247.aBooleanArrayArray3[local89];
						this.method751(arg2, local25, local160, local49, local27, local95, local83, local172, local10, local89, this.anInt804, local15, this.anInt798);
						@Pc(513) boolean local513 = local160 != null && local160.anInt2631 != local160.anInt2627;
						if (!local513) {
							for (local327 = 0; local327 < 8; local327++) {
								if (Static88.anIntArray164[local327] >= 0 && Static57.anIntArray92[local327] != Static298.anIntArray414[local327]) {
									local513 = true;
									break;
								}
							}
						}
						if (!local480[local95 + 1 & 0x3]) {
							local83[1] = Static298.method4396(local83[1], (Static81.anIntArray154[4] & Static81.anIntArray154[2]) == 0);
						}
						if (!local480[local95 + 3 & 0x3]) {
							local83[3] = Static298.method4396(local83[3], (Static81.anIntArray154[6] & Static81.anIntArray154[0]) == 0);
						}
						if (!local480[local95 & 0x3]) {
							local83[0] = Static298.method4396(local83[0], (Static81.anIntArray154[0] & Static81.anIntArray154[2]) == 0);
						}
						if (!local480[local95 + 2 & 0x3]) {
							local83[2] = Static298.method4396(local83[2], (Static81.anIntArray154[6] & Static81.anIntArray154[4]) == 0);
						}
						if (!local80 && (local89 == 0 || local89 == 12)) {
							if (local83[0] && !local83[1] && !local83[2] && local83[3]) {
								local95 = 0;
								local89 = local89 == 0 ? 13 : 14;
								local83[0] = local83[3] = false;
							} else if (local83[0] && local83[1] && !local83[2] && !local83[3]) {
								local89 = local89 == 0 ? 13 : 14;
								local95 = 3;
								local83[0] = local83[1] = false;
							} else if (!local83[0] && local83[1] && local83[2] && !local83[3]) {
								local95 = 2;
								local83[1] = local83[2] = false;
								local89 = local89 == 0 ? 13 : 14;
							} else if (!local83[0] && !local83[1] && local83[2] && local83[3]) {
								local83[2] = local83[3] = false;
								local89 = local89 == 0 ? 13 : 14;
								local95 = 1;
							}
						}
						@Pc(830) boolean local830 = !local80 && !local83[0] && !local83[2] && !local83[1] && !local83[3];
						@Pc(832) int[] local832 = null;
						@Pc(840) int[] local840;
						@Pc(860) int[] local860;
						@Pc(844) int[] local844;
						if (local830) {
							local860 = Static448.anIntArrayArray67[local89];
							local844 = Static410.anIntArrayArray55[local89];
							local840 = Static106.anIntArrayArray26[local89];
							local394 = local160 == null ? 0 : Static239.anIntArray356[local89];
							local385 = local172 == null ? 0 : Static249.anIntArray361[local89];
						} else if (local80) {
							local840 = Static378.anIntArrayArray53[local89];
							local844 = Static338.anIntArrayArray7[local89];
							local394 = local160 == null ? 0 : Static315.anIntArray426[local89];
							local832 = Static224.anIntArrayArray35[local89];
							local860 = Static39.anIntArrayArray5[local89];
							local385 = local172 == null ? 0 : Static233.anIntArray352[local89];
						} else {
							local844 = Static332.anIntArrayArray49[local89];
							local385 = local172 == null ? 0 : Static296.anIntArray412[local89];
							local394 = local160 == null ? 0 : Static47.anIntArray74[local89];
							local832 = Static328.anIntArrayArray48[local89];
							local860 = Static227.anIntArrayArray47[local89];
							local840 = Static427.anIntArrayArray57[local89];
						}
						@Pc(934) int local934 = local385 + local394;
						if (local934 <= 0) {
							Static21.method587(arg5, local27, local49);
						} else {
							if (local83[0]) {
								local934++;
							}
							if (local83[2]) {
								local934++;
							}
							if (local83[1]) {
								local934++;
							}
							if (local83[3]) {
								local934++;
							}
							@Pc(964) int local964 = 0;
							@Pc(966) int local966 = 0;
							@Pc(970) int local970 = local934 * 3;
							@Pc(977) int[] local977 = local513 ? new int[local970] : null;
							@Pc(980) int[] local980 = new int[local970];
							@Pc(983) int[] local983 = new int[local970];
							@Pc(986) int[] local986 = new int[local970];
							@Pc(989) int[] local989 = new int[local970];
							@Pc(992) int[] local992 = new int[local970];
							@Pc(999) int[] local999 = arg0 == null ? null : new int[local970];
							@Pc(1008) int[] local1008 = arg0 == null && arg1 == null ? null : new int[local970];
							@Pc(1010) int local1010 = -1;
							@Pc(1012) int local1012 = -1;
							@Pc(1014) int local1014 = 256;
							@Pc(1110) byte local1110;
							@Pc(1064) int local1064;
							@Pc(1066) int local1066;
							@Pc(1293) int local1293;
							@Pc(1299) int local1299;
							@Pc(1308) int local1308;
							@Pc(1313) int local1313;
							@Pc(1323) int local1323;
							@Pc(1318) int local1318;
							@Pc(1328) int local1328;
							@Pc(1387) int local1387;
							@Pc(1394) int local1394;
							if (local160 != null) {
								local1010 = local160.anInt2631;
								local1012 = arg2.method2617() ? local160.anInt2618 : local160.anInt2622;
								local1014 = local160.anInt2628;
								local1064 = Static42.method928(local160, arg2);
								for (local1066 = 0; local1066 < local394; local1066++) {
									if (local83[-local95 & 0x3] && local964 == local832[0]) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 1;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 1;
										Static133.anIntArray235[4] = local860[local964];
										local1110 = 6;
										Static133.anIntArray235[5] = local844[local964];
									} else if (local83[2 - local95 & 0x3] && local832[2] == local964) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 5;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 5;
										Static133.anIntArray235[4] = local860[local964];
										Static133.anIntArray235[5] = local844[local964];
										local1110 = 6;
									} else if (local83[1 - local95 & 0x3] && local964 == local832[1]) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 3;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 3;
										Static133.anIntArray235[4] = local860[local964];
										local1110 = 6;
										Static133.anIntArray235[5] = local844[local964];
									} else if (local83[3 - local95 & 0x3] && local964 == local832[3]) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 7;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 7;
										Static133.anIntArray235[4] = local860[local964];
										Static133.anIntArray235[5] = local844[local964];
										local1110 = 6;
									} else {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = local860[local964];
										Static133.anIntArray235[2] = local844[local964];
										local1110 = 3;
									}
									local964++;
									for (local1293 = 0; local1293 < local1110; local1293++) {
										local1299 = Static133.anIntArray235[local1293];
										local1308 = local1299 - local95 * 2 & 0x7;
										local1313 = this.anIntArray57[local1299];
										local1318 = this.anIntArray58[local1299];
										if (local95 == 1) {
											local1323 = local1318;
											local1328 = 128 - local1313;
										} else if (local95 == 2) {
											local1323 = 128 - local1313;
											local1328 = 128 - local1318;
										} else if (local95 == 3) {
											local1328 = local1313;
											local1323 = 128 - local1318;
										} else {
											local1323 = local1313;
											local1328 = local1318;
										}
										local980[local966] = local1323;
										local983[local966] = local1328;
										if (local999 != null && Static301.aBooleanArrayArray5[local89][local1299]) {
											local1387 = (local27 << 7) + local1323;
											local1394 = (local49 << 7) + local1328;
											local999[local966] = arg0.va(local1387, local1394) - arg3.va(local1387, local1394);
										}
										if (local1008 != null) {
											if (arg0 != null && !Static301.aBooleanArrayArray5[local89][local1299]) {
												local1387 = local1323 + (local27 << 7);
												local1394 = local1328 + (local49 << 7);
												local1008[local966] = arg3.va(local1387, local1394) - arg0.va(local1387, local1394);
											} else if (arg1 != null && !Static135.aBooleanArrayArray1[local89][local1299]) {
												local1387 = local1323 + (local27 << 7);
												local1394 = (local49 << 7) + local1328;
												local1008[local966] = arg1.va(local1387, local1394) - arg3.va(local1387, local1394);
											}
										}
										if (local1299 < 8 && local160.anInt2621 < Static88.anIntArray164[local1308]) {
											if (local977 != null) {
												local977[local966] = Static57.anIntArray92[local1308];
											}
											local992[local966] = Static275.anIntArray396[local1308];
											local989[local966] = Static429.anIntArray517[local1308];
											local986[local966] = Static298.anIntArray414[local1308];
										} else {
											if (local977 != null) {
												local977[local966] = local1064;
											}
											local989[local966] = arg2.method2617() ? local160.anInt2618 : local160.anInt2622;
											local992[local966] = local160.anInt2628;
											local986[local966] = local1010;
										}
										local966++;
									}
								}
								if (!this.aBoolean46 && arg5 == 0) {
									Static164.method2885(local27, local49, local160.anInt2619, local160.anInt2626 * 8, local160.anInt2634);
								}
								if (local89 != 12 && local160.anInt2631 != -1 && local160.aBoolean205) {
									local78 = true;
								}
							} else if (local830) {
								local964 = Static239.anIntArray356[local89];
							} else if (local80) {
								local964 = Static315.anIntArray426[local89];
							} else {
								local964 = Static47.anIntArray74[local89];
							}
							if (local172 != null) {
								if (local127 == 0) {
									local127 = local111;
								}
								if (local119 == 0) {
									local119 = local111;
								}
								if (local135 == 0) {
									local135 = local111;
								}
								@Pc(1608) Class243 local1608 = this.aClass252_2.method5695(local111 - 1);
								@Pc(1616) Class243 local1616 = this.aClass252_2.method5695(local119 - 1);
								@Pc(1624) Class243 local1624 = this.aClass252_2.method5695(local127 - 1);
								@Pc(1632) Class243 local1632 = this.aClass252_2.method5695(local135 - 1);
								for (local1308 = 0; local1308 < local385; local1308++) {
									if (local83[-local95 & 0x3] && local964 == local832[0]) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 1;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 1;
										Static133.anIntArray235[4] = local860[local964];
										local1110 = 6;
										Static133.anIntArray235[5] = local844[local964];
									} else if (local83[2 - local95 & 0x3] && local964 == local832[2]) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 5;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 5;
										Static133.anIntArray235[4] = local860[local964];
										Static133.anIntArray235[5] = local844[local964];
										local1110 = 6;
									} else if (local83[1 - local95 & 0x3] && local832[1] == local964) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 3;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 3;
										Static133.anIntArray235[4] = local860[local964];
										local1110 = 6;
										Static133.anIntArray235[5] = local844[local964];
									} else if (local83[3 - local95 & 0x3] && local832[3] == local964) {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = 7;
										Static133.anIntArray235[2] = local844[local964];
										Static133.anIntArray235[3] = 7;
										Static133.anIntArray235[4] = local860[local964];
										local1110 = 6;
										Static133.anIntArray235[5] = local844[local964];
									} else {
										Static133.anIntArray235[0] = local840[local964];
										Static133.anIntArray235[1] = local860[local964];
										local1110 = 3;
										Static133.anIntArray235[2] = local844[local964];
									}
									for (local1313 = 0; local1313 < local1110; local1313++) {
										local1323 = Static133.anIntArray235[local1313];
										local1318 = local1323 - local95 * 2 & 0x7;
										local1328 = this.anIntArray57[local1323];
										local1394 = this.anIntArray58[local1323];
										@Pc(1903) int local1903;
										if (local95 == 1) {
											local1387 = local1394;
											local1903 = 128 - local1328;
										} else if (local95 == 2) {
											local1387 = 128 - local1328;
											local1903 = 128 - local1394;
										} else if (local95 == 3) {
											local1903 = local1328;
											local1387 = 128 - local1394;
										} else {
											local1387 = local1328;
											local1903 = local1394;
										}
										local980[local966] = local1387;
										local983[local966] = local1903;
										@Pc(1952) int local1952;
										@Pc(1958) int local1958;
										if (local999 != null && Static301.aBooleanArrayArray5[local89][local1323]) {
											local1952 = local1387 + (local27 << 7);
											local1958 = local1903 + (local49 << 7);
											local999[local966] = arg0.va(local1952, local1958) - arg3.va(local1952, local1958);
										}
										if (local1008 != null) {
											if (arg0 != null && !Static301.aBooleanArrayArray5[local89][local1323]) {
												local1952 = local1387 + (local27 << 7);
												local1958 = (local49 << 7) + local1903;
												local1008[local966] = arg3.va(local1952, local1958) - arg0.va(local1952, local1958);
											} else if (arg1 != null && !Static135.aBooleanArrayArray1[local89][local1323]) {
												local1952 = local1387 + (local27 << 7);
												local1958 = local1903 + (local49 << 7);
												local1008[local966] = arg1.va(local1952, local1958) - arg3.va(local1952, local1958);
											}
										}
										if (local1323 < 8 && Static88.anIntArray164[local1318] >= 0) {
											if (local977 != null) {
												local977[local966] = Static57.anIntArray92[local1318];
											}
											local992[local966] = Static275.anIntArray396[local1318];
											local989[local966] = Static429.anIntArray517[local1318];
											local986[local966] = Static298.anIntArray414[local1318];
										} else {
											if (local80 && Static301.aBooleanArrayArray5[local89][local1323]) {
												local989[local966] = local1012;
												local992[local966] = local1014;
												local986[local966] = local1010;
											} else if (local1387 == 0 && local1903 == 0) {
												local986[local966] = arg4[local27][local49];
												local989[local966] = local1608.anInt7170;
												local992[local966] = local1608.anInt7171;
											} else if (local1387 == 0 && local1903 == 128) {
												local986[local966] = arg4[local27][local63];
												local989[local966] = local1616.anInt7170;
												local992[local966] = local1616.anInt7171;
											} else if (local1387 == 128 && local1903 == 128) {
												local986[local966] = arg4[local47][local63];
												local989[local966] = local1624.anInt7170;
												local992[local966] = local1624.anInt7171;
											} else if (local1387 == 128 && local1903 == 0) {
												local986[local966] = arg4[local47][local49];
												local989[local966] = local1632.anInt7170;
												local992[local966] = local1632.anInt7171;
											} else {
												if (local1387 >= 64) {
													if (local1903 < 64) {
														local989[local966] = local1632.anInt7170;
														local992[local966] = local1632.anInt7171;
													} else {
														local989[local966] = local1624.anInt7170;
														local992[local966] = local1624.anInt7171;
													}
												} else if (local1903 >= 64) {
													local989[local966] = local1616.anInt7170;
													local992[local966] = local1616.anInt7171;
												} else {
													local989[local966] = local1608.anInt7170;
													local992[local966] = local1608.anInt7171;
												}
												local1952 = Static300.method4443(arg4[local47][local49], arg4[local27][local49], local1387 << 7 >> 7);
												local1958 = Static300.method4443(arg4[local47][local63], arg4[local27][local63], local1387 << 7 >> 7);
												local986[local966] = Static300.method4443(local1958, local1952, local1903 << 7 >> 7);
											}
											if (local977 != null) {
												local977[local966] = local986[local966];
											}
										}
										local966++;
									}
									local964++;
								}
								if (local89 != 0 && local172.aBoolean496) {
									local78 = true;
								}
							}
							local1064 = arg3.I(local27, local49);
							local1066 = arg3.I(local47, local49);
							local1293 = arg3.I(local47, local63);
							local1299 = arg3.I(local27, local63);
							if (arg5 > 0) {
								@Pc(2368) boolean local2368 = true;
								if (local111 == 0 && local89 != 0) {
									local2368 = false;
								}
								if (local103 > 0 && local183 != null && !local183.aBoolean204) {
									local2368 = false;
								}
								if (local2368 && local1064 == local1066 && local1293 == local1064 && local1064 == local1299) {
									this.aByteArrayArrayArray11[arg5][local27][local49] = (byte) (this.aByteArrayArrayArray11[arg5][local27][local49] | 0x4);
								}
							}
							local1308 = 0;
							local1313 = 0;
							local1323 = 0;
							if (this.aBoolean46) {
								local1308 = Static71.method1314(local27, local49);
								local1313 = Static350.method4981(local27, local49);
								local1323 = Static153.method2718(local27, local49);
							}
							arg3.JA(local27, local49, local980, local999, local983, local1008, local986, local977, local989, local992, local1308, local1313, local1323, local78);
							Static21.method587(arg5, local27, local49);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIZIIILclient!bt;I)V")
	private void method740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class3_Sub2 arg8, @OriginalArg(10) int arg9) {
		if (arg2 == 1) {
			arg0 = 1;
		} else if (arg2 == 2) {
			arg0 = 1;
			arg6 = 1;
		} else if (arg2 == 3) {
			arg6 = 1;
		}
		@Pc(49) int local49;
		if (arg7 < 0 || this.anInt804 <= arg7 || arg3 < 0 || this.anInt798 <= arg3) {
			while (true) {
				local49 = arg8.method6053();
				if (local49 == 0) {
					break;
				}
				if (local49 == 1) {
					arg8.method6053();
					break;
				}
				if (local49 <= 49) {
					arg8.method6053();
				}
			}
			return;
		}
		if (!this.aBoolean46 && !arg5) {
			Static325.aByteArrayArrayArray15[arg9][arg7][arg3] = 0;
		}
		while (true) {
			local49 = arg8.method6053();
			if (local49 == 0) {
				if (this.aBoolean46) {
					this.anIntArrayArrayArray2[0][arg7 + arg6][arg3 + arg0] = 0;
				} else if (arg9 == 0) {
					this.anIntArrayArrayArray2[0][arg7 + arg6][arg3 + arg0] = -Static132.method2287(arg1 + 932731, 556238 - -arg4) * 8 << 0;
				} else {
					this.anIntArrayArrayArray2[arg9][arg7 + arg6][arg0 + arg3] = this.anIntArrayArrayArray2[arg9 - 1][arg6 + arg7][arg3 + arg0] - 240;
				}
				break;
			}
			if (local49 == 1) {
				@Pc(187) int local187 = arg8.method6053();
				if (this.aBoolean46) {
					this.anIntArrayArrayArray2[0][arg6 + arg7][arg3 + arg0] = local187 * 8 << 0;
				} else {
					if (local187 == 1) {
						local187 = 0;
					}
					if (arg9 == 0) {
						this.anIntArrayArrayArray2[0][arg7 + arg6][arg0 + arg3] = -local187 * 8 << 0;
					} else {
						this.anIntArrayArrayArray2[arg9][arg6 + arg7][arg3 + arg0] = this.anIntArrayArrayArray2[arg9 - 1][arg7 + arg6][arg0 + arg3] - (local187 * 8 << 0);
					}
				}
				break;
			}
			if (local49 <= 49) {
				if (arg5) {
					arg8.method6053();
				} else {
					this.aByteArrayArrayArray9[arg9][arg7][arg3] = arg8.method6011();
					this.aByteArrayArrayArray12[arg9][arg7][arg3] = (byte) ((local49 - 2) / 4);
					this.aByteArrayArrayArray7[arg9][arg7][arg3] = (byte) (arg2 + local49 - 2 & 0x3);
				}
			} else if (local49 <= 81) {
				if (!this.aBoolean46 && !arg5) {
					Static325.aByteArrayArrayArray15[arg9][arg7][arg3] = (byte) (local49 - 49);
				}
			} else if (!arg5) {
				this.aByteArrayArrayArray10[arg9][arg7][arg3] = (byte) (local49 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!bt;IIII[Lclient!bm;I)V")
	public final void method741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class23[] arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg5 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean46) {
			@Pc(24) Class23 local24 = arg7[arg8];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static201.method3293(local26 & 0x7, arg4, local30 & 0x7) + arg1;
					local56 = Static421.method3673(arg4, local26 & 0x7, local30 & 0x7) + arg0;
					if (local44 > 0 && local44 < this.anInt804 - 1 && local56 > 0 && local56 < this.anInt798 - 1) {
						local24.method826(local44, local56);
					}
				}
			}
		}
		@Pc(100) int local100 = (arg2 & 0x1FFFFFF8) << 3;
		local26 = (arg5 & 0x1FFFFFF8) << 3;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (arg4 == 1) {
			local114 = 1;
		} else if (arg4 == 2) {
			local112 = 1;
			local114 = 1;
		} else if (arg4 == 3) {
			local112 = 1;
		}
		for (local56 = 0; local56 < this.anInt808; local56++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
					if (arg6 == local56 && local11 <= local145 && local11 + 8 >= local145 && local17 <= local149 && local149 <= local17 + 8) {
						@Pc(226) int local226;
						@Pc(219) int local219;
						if (local11 + 8 == local145 || local149 == local17 + 8) {
							if (arg4 == 0) {
								local219 = local149 + arg0 - local17;
								local226 = local145 + arg1 - local11;
							} else if (arg4 == 1) {
								local219 = arg0 + local11 + 8 - local145;
								local226 = local149 + arg1 - local17;
							} else if (arg4 == 2) {
								local219 = arg0 + local17 + 8 - local149;
								local226 = local11 + arg1 + 8 - local145;
							} else {
								local219 = local145 + arg0 - local11;
								local226 = arg1 + local17 + 8 - local149;
							}
							this.method740(0, local100 + local145, 0, local219, local26 + local149, true, 0, local226, arg3, arg8);
						} else {
							local226 = Static201.method3293(local145 & 0x7, arg4, local149 & 0x7) + arg1;
							local219 = Static421.method3673(arg4, local145 & 0x7, local149 & 0x7) + arg0;
							this.method740(local114, local145 + local100, arg4, local219, local26 + local149, false, local112, local226, arg3, arg8);
							if (local145 == 63 || local149 == 63) {
								@Pc(361) int local361 = local145 == 63 ? 64 : local145;
								@Pc(370) int local370 = local149 == 63 ? 64 : local149;
								@Pc(393) int local393;
								@Pc(387) int local387;
								if (arg4 == 0) {
									local387 = local370 + arg0 - local17;
									local393 = local361 + arg1 - local11;
								} else if (arg4 == 1) {
									local387 = local11 + arg0 + 8 - local361;
									local393 = local370 + arg1 - local17;
								} else if (arg4 == 2) {
									local393 = arg1 + local11 + 8 - local361;
									local387 = local17 + arg0 + 8 - local370;
								} else {
									local387 = arg0 + local361 - local11;
									local393 = local17 + arg1 + 8 - local370;
								}
								if (local393 >= 0 && local393 < this.anInt804 && local387 >= 0 && local387 < this.anInt798) {
									this.anIntArrayArrayArray2[arg8][local393][local387] = this.anIntArrayArrayArray2[arg8][local112 + local226][local114 + local219];
								}
							}
						}
					} else {
						this.method740(0, 0, 0, -1, 0, false, 0, -1, arg3, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([[III)V")
	public final void method743(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt804 + 1; local12++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt798 + 1; local25++) {
				local10[local12][local25] += arg0[local12][local25];
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public final void method744(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt808; local7++) {
			this.method750(arg1, 64, 64, local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!bt;IIZI[Lclient!bm;I)V")
	public final void method746(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class23[] arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean46) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class23 local12 = arg4[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg3;
						@Pc(28) int local28 = arg5 + local18;
						if (local24 >= 0 && this.anInt804 > local24 && local28 >= 0 && local28 < this.anInt798) {
							local12.method826(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg2 + arg3;
		@Pc(82) int local82 = arg1 + arg5;
		for (local14 = 0; local14 < this.anInt808; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method740(0, local6 + local18, 0, local24 + arg5, local24 + local82, false, 0, local18 + arg3, arg0, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!na;Lclient!na;ILclient!qa;)V")
	public final void method747(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(3) Class75 arg2) {
		if (Static266.anIntArray386 == null || this.anInt798 != Static266.anIntArray386.length) {
			Static397.anIntArray494 = new int[this.anInt798];
			Static266.anIntArray386 = new int[this.anInt798];
			Static324.anIntArray32 = new int[this.anInt798];
			Static116.anIntArray478 = new int[this.anInt798];
			Static376.anIntArray561 = new int[this.anInt798];
		}
		@Pc(42) int[][] local42 = new int[this.anInt804][this.anInt798];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt808; local44++) {
			for (local48 = 0; local48 < this.anInt798; local48++) {
				Static266.anIntArray386[local48] = 0;
				Static324.anIntArray32[local48] = 0;
				Static376.anIntArray561[local48] = 0;
				Static397.anIntArray494[local48] = 0;
				Static116.anIntArray478[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt804; local77++) {
				@Pc(87) int local87;
				@Pc(102) int local102;
				@Pc(171) int local171;
				for (@Pc(81) int local81 = 0; local81 < this.anInt798; local81++) {
					local87 = local77 + 5;
					@Pc(148) int local148;
					if (local87 < this.anInt804) {
						local102 = this.aByteArrayArrayArray10[local44][local87][local81] & 0xFF;
						if (local102 > 0) {
							@Pc(112) Class243 local112 = this.aClass252_2.method5695(local102 - 1);
							Static266.anIntArray386[local81] += local112.anInt7173;
							Static324.anIntArray32[local81] += local112.anInt7180;
							Static376.anIntArray561[local81] += local112.anInt7181;
							Static397.anIntArray494[local81] += local112.anInt7177;
							local148 = Static116.anIntArray478[local81]++;
						}
					}
					local102 = local77 - 5;
					if (local102 >= 0) {
						local171 = this.aByteArrayArrayArray10[local44][local102][local81] & 0xFF;
						if (local171 > 0) {
							@Pc(184) Class243 local184 = this.aClass252_2.method5695(local171 - 1);
							Static266.anIntArray386[local81] -= local184.anInt7173;
							Static324.anIntArray32[local81] -= local184.anInt7180;
							Static376.anIntArray561[local81] -= local184.anInt7181;
							Static397.anIntArray494[local81] -= local184.anInt7177;
							local148 = Static116.anIntArray478[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local102 = 0;
					local171 = 0;
					@Pc(242) int local242 = 0;
					@Pc(244) int local244 = 0;
					for (@Pc(246) int local246 = -5; local246 < this.anInt798; local246++) {
						@Pc(252) int local252 = local246 + 5;
						if (local252 < this.anInt798) {
							local244 += Static116.anIntArray478[local252];
							local87 += Static266.anIntArray386[local252];
							local242 += Static397.anIntArray494[local252];
							local171 += Static376.anIntArray561[local252];
							local102 += Static324.anIntArray32[local252];
						}
						@Pc(294) int local294 = local246 - 5;
						if (local294 >= 0) {
							local171 -= Static376.anIntArray561[local294];
							local244 -= Static116.anIntArray478[local294];
							local87 -= Static266.anIntArray386[local294];
							local102 -= Static324.anIntArray32[local294];
							local242 -= Static397.anIntArray494[local294];
						}
						if (local246 >= 0 && local242 > 0 && local244 > 0) {
							local42[local77][local246] = Static409.method5493(local87 * 256 / local242, local171 / local244, local102 / local244);
						}
					}
				}
			}
			if (Static433.aBoolean511) {
				this.method738(local44 == 0 ? arg1 : null, local44 == 0 ? arg0 : null, arg2, Static120.aClass64Array1[local44], local42, local44);
			} else {
				this.method749(local42, local44, local44 == 0 ? arg0 : null, local44 == 0 ? arg1 : null, arg2, Static120.aClass64Array1[local44]);
			}
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray9[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray7[local44] = null;
		}
		if (!this.aBoolean46) {
			if (Static451.anInt7602 != 0) {
				Static323.method4695();
			}
			if (Static380.aBoolean463) {
				Static398.method5370();
			}
		}
		for (local48 = 0; local48 < this.anInt808; local48++) {
			Static120.aClass64Array1[local48].f();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([[IILclient!na;BLclient!na;Lclient!qa;Lclient!na;)V")
	private void method749(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(4) Class64 arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) Class64 arg5) {
		for (@Pc(8) int local8 = 0; local8 < this.anInt804; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt798; local12++) {
				if (Static268.anInt5016 == -1 || Static352.method4307(local12, Static268.anInt5016, local8, arg1)) {
					@Pc(36) byte local36 = this.aByteArrayArrayArray12[arg1][local8][local12];
					@Pc(45) byte local45 = this.aByteArrayArrayArray7[arg1][local8][local12];
					@Pc(56) int local56 = this.aByteArrayArrayArray9[arg1][local8][local12] & 0xFF;
					@Pc(67) int local67 = this.aByteArrayArrayArray10[arg1][local8][local12] & 0xFF;
					@Pc(79) Class81 local79 = local56 == 0 ? null : this.aClass71_2.method1743(local56 - 1);
					@Pc(91) Class243 local91 = local67 == 0 ? null : this.aClass252_2.method5695(local67 - 1);
					@Pc(93) int local93 = 0;
					@Pc(95) int local95 = 0;
					if (local36 != 0) {
						local93 = local91 == null ? 0 : Static249.anIntArray361[local36];
						local95 = local79 == null ? 0 : Static239.anIntArray356[local36];
					} else if (local79 != null) {
						local95 = Static239.anIntArray356[local36];
					} else if (local91 != null) {
						local93 = Static239.anIntArray356[local36];
					}
					@Pc(136) int local136 = local93 + local95;
					@Pc(138) int local138 = 0;
					if (local136 != 0) {
						@Pc(143) int[] local143 = new int[local136];
						@Pc(146) int[] local146 = new int[local136];
						@Pc(149) int[] local149 = new int[local136];
						@Pc(152) int[] local152 = new int[local136];
						@Pc(154) boolean local154 = false;
						@Pc(171) int local171;
						@Pc(203) int local203;
						if (local79 == null || local79.anInt2631 == -1 && local79.anInt2627 == -1 && local79.anInt2618 == -1) {
							for (local171 = 0; local171 < local95; local171++) {
								local143[local138] = -1;
								local138++;
							}
						} else {
							local171 = arg4.method2617() ? local79.anInt2618 : local79.anInt2622;
							if (Static413.aBoolean306) {
								local171 = -1;
							}
							for (local203 = 0; local203 < local95; local203++) {
								local149[local138] = local171;
								local152[local138] = local79.anInt2628;
								if (local79.anInt2631 == -1) {
									local143[local138] = -1;
								} else {
									local143[local138] = local79.anInt2631;
								}
								if (local79.anInt2627 == -1) {
									local146[local138] = -1;
								} else {
									local146[local138] = local79.anInt2627;
									local154 = true;
								}
								local138++;
							}
							if (!this.aBoolean46 && arg1 == 0) {
								Static164.method2885(local8, local12, local79.anInt2619, local79.anInt2626 * 8, local79.anInt2634);
							}
						}
						if (!local154) {
							local146 = null;
						}
						if (local91 == null) {
							for (local171 = 0; local171 < local93; local171++) {
								local143[local138] = -1;
								local138++;
							}
						} else {
							local171 = local91.anInt7170;
							if (Static413.aBoolean306) {
								local171 = -1;
							}
							for (local203 = 0; local203 < local93; local203++) {
								local149[local138] = local171;
								local152[local138] = local91.anInt7171;
								local143[local138] = arg0[local8][local12];
								if (local146 != null) {
									local146[local138] = -1;
								}
								local138++;
							}
						}
						local171 = this.anIntArray57.length;
						@Pc(338) int[] local338 = new int[local171];
						@Pc(341) int[] local341 = new int[local171];
						@Pc(348) int[] local348 = arg3 == null ? null : new int[local171];
						@Pc(357) int[] local357 = arg3 == null && arg2 == null ? null : new int[local171];
						@Pc(366) int local366;
						@Pc(371) int local371;
						@Pc(455) int local455;
						@Pc(461) int local461;
						for (@Pc(359) int local359 = 0; local359 < local171; local359++) {
							local366 = this.anIntArray57[local359];
							local371 = this.anIntArray58[local359];
							if (local45 == 0) {
								local338[local359] = local366;
								local341[local359] = local371;
							} else if (local45 == 1) {
								local338[local359] = local371;
								local341[local359] = 128 - local366;
							} else if (local45 == 2) {
								local338[local359] = 128 - local366;
								local341[local359] = 128 - local371;
							} else if (local45 == 3) {
								local338[local359] = 128 - local371;
								local341[local359] = local366;
							}
							if (local348 != null && Static301.aBooleanArrayArray5[local36][local359]) {
								local455 = local366 + (local8 << 7);
								local461 = local366 + (local12 << 7);
								local348[local359] = arg3.va(local455, local461) - arg5.va(local455, local461);
							}
							if (local357 != null) {
								if (arg3 != null && !Static301.aBooleanArrayArray5[local36][local359]) {
									local455 = local366 + (local8 << 7);
									local461 = (local12 << 7) + local366;
									local357[local359] = arg5.va(local455, local461) - arg3.va(local455, local461);
								} else if (arg2 != null && !Static135.aBooleanArrayArray1[local36][local359]) {
									local455 = (local8 << 7) + local366;
									local461 = local366 + (local12 << 7);
									local357[local359] = arg2.va(local455, local461) - arg5.va(local455, local461);
								}
							}
						}
						local366 = arg5.I(local8, local12);
						local371 = arg5.I(local8 + 1, local12);
						local455 = arg5.I(local8 + 1, local12 + 1);
						local461 = arg5.I(local8, local12 + 1);
						if (arg1 > 0) {
							@Pc(583) boolean local583 = true;
							if (local67 == 0 && local36 != 0) {
								local583 = false;
							}
							if (local56 > 0 && local79 != null && !local79.aBoolean204) {
								local583 = false;
							}
							if (local583 && local366 == local371 && local366 == local455 && local461 == local366) {
								this.aByteArrayArrayArray11[arg1][local8][local12] = (byte) (this.aByteArrayArrayArray11[arg1][local8][local12] | 0x4);
							}
						}
						@Pc(645) int local645 = 0;
						@Pc(647) int local647 = 0;
						@Pc(649) int local649 = 0;
						if (this.aBoolean46) {
							local645 = Static71.method1314(local8, local12);
							local647 = Static350.method4981(local8, local12);
							local649 = Static153.method2718(local8, local12);
						}
						arg5.method5443(local8, local12, local338, local348, local341, local357, Static106.anIntArrayArray26[local36], Static448.anIntArrayArray67[local36], Static410.anIntArrayArray55[local36], local143, local146, local149, local152, local645, local647, local649);
						Static21.method587(arg1, local8, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
	public final void method750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9;
		for (@Pc(3) int local3 = arg0; local3 < arg0 + arg2; local3++) {
			for (local9 = arg4; local9 < arg1 + arg4; local9++) {
				if (local9 >= 0 && this.anInt804 > local9 && local3 >= 0 && this.anInt798 > local3) {
					this.anIntArrayArrayArray2[arg3][local9][local3] = arg3 <= 0 ? 0 : this.anIntArrayArrayArray2[arg3 - 1][local9][local3] - 240;
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt804) {
			for (local9 = arg0 + 1; local9 < arg2 + arg0; local9++) {
				if (local9 >= 0 && local9 < this.anInt798) {
					this.anIntArrayArrayArray2[arg3][arg4][local9] = this.anIntArrayArrayArray2[arg3][arg4 - 1][local9];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt798) {
			for (local9 = arg4 + 1; local9 < arg4 + arg1; local9++) {
				if (local9 >= 0 && this.anInt804 > local9) {
					this.anIntArrayArrayArray2[arg3][local9][arg0] = this.anIntArrayArrayArray2[arg3][local9][arg0 - 1];
				}
			}
		}
		if (arg4 < 0 || arg0 < 0 || this.anInt804 <= arg4 || arg0 >= this.anInt798) {
			return;
		}
		if (arg3 != 0) {
			if (arg4 > 0 && this.anIntArrayArrayArray2[arg3 - 1][arg4 - 1][arg0] != this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0]) {
				this.anIntArrayArrayArray2[arg3][arg4][arg0] = this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray2[arg3][arg4][arg0 - 1] != this.anIntArrayArrayArray2[arg3 - 1][arg4][arg0 - 1]) {
				this.anIntArrayArrayArray2[arg3][arg4][arg0] = this.anIntArrayArrayArray2[arg3][arg4][arg0 - 1];
				return;
			}
			if (arg4 > 0 && arg0 > 0 && this.anIntArrayArrayArray2[arg3 - 1][arg4 - 1][arg0 - 1] != this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray2[arg3][arg4][arg0] = this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0] != 0) {
			this.anIntArrayArrayArray2[arg3][arg4][arg0] = this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray2[arg3][arg4][arg0 - 1] != 0) {
			this.anIntArrayArrayArray2[arg3][arg4][arg0] = this.anIntArrayArrayArray2[arg3][arg4][arg0 - 1];
			return;
		}
		if (arg4 > 0 && arg0 > 0 && this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray2[arg3][arg4][arg0] = this.anIntArrayArrayArray2[arg3][arg4 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!qa;[[BLclient!fs;III[ZBLclient!uv;[[BII[[BI)V")
	private void method751(@OriginalArg(0) Class75 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(8) Class243 arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(46) int local46;
		if (arg2 != null && arg7 != null || arg7 != null && arg9 == 12 || arg2 != null && arg9 == 0) {
			@Pc(27) boolean[] local27 = arg2 != null && arg2.aBoolean203 ? Static290.aBooleanArrayArray4[arg9] : Static247.aBooleanArrayArray3[arg9];
			@Pc(58) Class81 local58;
			@Pc(75) byte local75;
			@Pc(91) int local91;
			@Pc(96) int local96;
			if (arg3 > 0) {
				if (arg4 > 0) {
					local46 = arg1[arg4 - 1][arg3 - 1] & 0xFF;
					if (local46 > 0) {
						local58 = this.aClass71_2.method1743(local46 - 1);
						if (local58.anInt2631 != -1 && local58.aBoolean203) {
							local75 = arg8[arg4 - 1][arg3 - 1];
							local91 = arg11[arg4 - 1][arg3 - 1] * 2 + 4 & 0x7;
							local96 = Static42.method928(local58, arg0);
							if (Static301.aBooleanArrayArray5[local75][local91]) {
								Static298.anIntArray414[0] = local58.anInt2631;
								Static57.anIntArray92[0] = local96;
								Static429.anIntArray517[0] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
								Static275.anIntArray396[0] = local58.anInt2628;
								Static88.anIntArray164[0] = local58.anInt2621;
								Static81.anIntArray154[0] = 256;
							}
						}
					}
				}
				if (arg10 - 1 > arg4) {
					local46 = arg1[arg4 + 1][arg3 - 1] & 0xFF;
					if (local46 > 0) {
						local58 = this.aClass71_2.method1743(local46 - 1);
						if (local58.anInt2631 != -1 && local58.aBoolean203) {
							local75 = arg8[arg4 + 1][arg3 - 1];
							local91 = arg11[arg4 + 1][arg3 - 1] * 2 + 6 & 0x7;
							local96 = Static42.method928(local58, arg0);
							if (Static301.aBooleanArrayArray5[local75][local91]) {
								Static298.anIntArray414[2] = local58.anInt2631;
								Static57.anIntArray92[2] = local96;
								Static429.anIntArray517[2] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
								Static275.anIntArray396[2] = local58.anInt2628;
								Static88.anIntArray164[2] = local58.anInt2621;
								Static81.anIntArray154[2] = 512;
							}
						}
					}
				}
			}
			if (arg12 - 1 > arg3) {
				if (arg4 > 0) {
					local46 = arg1[arg4 - 1][arg3 + 1] & 0xFF;
					if (local46 > 0) {
						local58 = this.aClass71_2.method1743(local46 - 1);
						if (local58.anInt2631 != -1 && local58.aBoolean203) {
							local75 = arg8[arg4 - 1][arg3 + 1];
							local91 = arg11[arg4 - 1][arg3 + 1] * 2 + 2 & 0x7;
							local96 = Static42.method928(local58, arg0);
							if (Static301.aBooleanArrayArray5[local75][local91]) {
								Static298.anIntArray414[6] = local58.anInt2631;
								Static57.anIntArray92[6] = local96;
								Static429.anIntArray517[6] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
								Static275.anIntArray396[6] = local58.anInt2628;
								Static88.anIntArray164[6] = local58.anInt2621;
								Static81.anIntArray154[6] = 64;
							}
						}
					}
				}
				if (arg4 < arg10 - 1) {
					local46 = arg1[arg4 + 1][arg3 + 1] & 0xFF;
					if (local46 > 0) {
						local58 = this.aClass71_2.method1743(local46 - 1);
						if (local58.anInt2631 != -1 && local58.aBoolean203) {
							local75 = arg8[arg4 + 1][arg3 + 1];
							local91 = arg11[arg4 + 1][arg3 + 1] * 2 & 0x7;
							local96 = Static42.method928(local58, arg0);
							if (Static301.aBooleanArrayArray5[local75][local91]) {
								Static298.anIntArray414[4] = local58.anInt2631;
								Static57.anIntArray92[4] = local96;
								Static429.anIntArray517[4] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
								Static275.anIntArray396[4] = local58.anInt2628;
								Static88.anIntArray164[4] = local58.anInt2621;
								Static81.anIntArray154[4] = 128;
							}
						}
					}
				}
			}
			@Pc(524) int local524;
			@Pc(529) int local529;
			@Pc(531) int local531;
			@Pc(512) byte local512;
			if (arg3 > 0) {
				local46 = arg1[arg4][arg3 - 1] & 0xFF;
				if (local46 > 0) {
					local58 = this.aClass71_2.method1743(local46 - 1);
					if (local58.anInt2631 != -1) {
						local75 = arg8[arg4][arg3 - 1];
						local512 = arg11[arg4][arg3 - 1];
						if (local58.aBoolean203) {
							local96 = 2;
							local524 = local512 * 2 + 4;
							local529 = Static42.method928(local58, arg0);
							for (local531 = 0; local531 < 3; local531++) {
								local524 &= 0x7;
								local96 &= 0x7;
								if (Static301.aBooleanArrayArray5[local75][local524] && Static88.anIntArray164[local96] <= local58.anInt2621) {
									Static298.anIntArray414[local96] = local58.anInt2631;
									Static57.anIntArray92[local96] = local529;
									Static429.anIntArray517[local96] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
									Static275.anIntArray396[local96] = local58.anInt2628;
									if (Static88.anIntArray164[local96] == local58.anInt2621) {
										Static81.anIntArray154[local96] |= 0x20;
									} else {
										Static81.anIntArray154[local96] = 32;
									}
									Static88.anIntArray164[local96] = local58.anInt2621;
								}
								local96--;
								local524++;
							}
							if (!local27[arg5 & 0x3]) {
								arg6[0] = Static290.aBooleanArrayArray4[local75][local512 + 2 & 0x3];
							}
						} else if (!local27[arg5 & 0x3]) {
							arg6[0] = Static247.aBooleanArrayArray3[local75][local512 + 2 & 0x3];
						}
					}
				}
			}
			if (arg3 < arg12 - 1) {
				local46 = arg1[arg4][arg3 + 1] & 0xFF;
				if (local46 > 0) {
					local58 = this.aClass71_2.method1743(local46 - 1);
					if (local58.anInt2631 != -1) {
						local75 = arg8[arg4][arg3 + 1];
						local512 = arg11[arg4][arg3 + 1];
						if (local58.aBoolean203) {
							local96 = 4;
							local524 = local512 * 2 + 2;
							local529 = Static42.method928(local58, arg0);
							for (local531 = 0; local531 < 3; local531++) {
								local524 &= 0x7;
								local96 &= 0x7;
								if (Static301.aBooleanArrayArray5[local75][local524] && Static88.anIntArray164[local96] <= local58.anInt2621) {
									Static298.anIntArray414[local96] = local58.anInt2631;
									Static57.anIntArray92[local96] = local529;
									Static429.anIntArray517[local96] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
									Static275.anIntArray396[local96] = local58.anInt2628;
									if (Static88.anIntArray164[local96] == local58.anInt2621) {
										Static81.anIntArray154[local96] |= 0x10;
									} else {
										Static81.anIntArray154[local96] = 16;
									}
									Static88.anIntArray164[local96] = local58.anInt2621;
								}
								local96++;
								local524--;
							}
							if (!local27[arg5 + 2 & 0x3]) {
								arg6[2] = Static290.aBooleanArrayArray4[local75][local512 & 0x3];
							}
						} else if (!local27[arg5 + 2 & 0x3]) {
							arg6[2] = Static247.aBooleanArrayArray3[local75][local512 & 0x3];
						}
					}
				}
			}
			if (arg4 > 0) {
				local46 = arg1[arg4 - 1][arg3] & 0xFF;
				if (local46 > 0) {
					local58 = this.aClass71_2.method1743(local46 - 1);
					if (local58.anInt2631 != -1) {
						local75 = arg8[arg4 - 1][arg3];
						local512 = arg11[arg4 - 1][arg3];
						if (local58.aBoolean203) {
							local96 = 6;
							local524 = local512 * 2 + 4;
							local529 = Static42.method928(local58, arg0);
							for (local531 = 0; local531 < 3; local531++) {
								local96 &= 0x7;
								local524 &= 0x7;
								if (Static301.aBooleanArrayArray5[local75][local524] && Static88.anIntArray164[local96] <= local58.anInt2621) {
									Static298.anIntArray414[local96] = local58.anInt2631;
									Static57.anIntArray92[local96] = local529;
									Static429.anIntArray517[local96] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
									Static275.anIntArray396[local96] = local58.anInt2628;
									if (Static88.anIntArray164[local96] == local58.anInt2621) {
										Static81.anIntArray154[local96] |= 0x8;
									} else {
										Static81.anIntArray154[local96] = 8;
									}
									Static88.anIntArray164[local96] = local58.anInt2621;
								}
								local524--;
								local96++;
							}
							if (!local27[arg5 + 3 & 0x3]) {
								arg6[3] = Static290.aBooleanArrayArray4[local75][local512 + 1 & 0x3];
							}
						} else if (!local27[arg5 + 3 & 0x3]) {
							arg6[3] = Static247.aBooleanArrayArray3[local75][local512 + 1 & 0x3];
						}
					}
				}
			}
			if (arg10 - 1 > arg4) {
				local46 = arg1[arg4 + 1][arg3] & 0xFF;
				if (local46 > 0) {
					local58 = this.aClass71_2.method1743(local46 - 1);
					if (local58.anInt2631 != -1) {
						local75 = arg8[arg4 + 1][arg3];
						local512 = arg11[arg4 + 1][arg3];
						if (local58.aBoolean203) {
							local96 = 4;
							local524 = local512 * 2 + 6;
							local529 = Static42.method928(local58, arg0);
							for (local531 = 0; local531 < 3; local531++) {
								local524 &= 0x7;
								local96 &= 0x7;
								if (Static301.aBooleanArrayArray5[local75][local524] && Static88.anIntArray164[local96] <= local58.anInt2621) {
									Static298.anIntArray414[local96] = local58.anInt2631;
									Static57.anIntArray92[local96] = local529;
									Static429.anIntArray517[local96] = arg0.method2617() ? local58.anInt2618 : local58.anInt2622;
									Static275.anIntArray396[local96] = local58.anInt2628;
									if (Static88.anIntArray164[local96] == local58.anInt2621) {
										Static81.anIntArray154[local96] |= 0x4;
									} else {
										Static81.anIntArray154[local96] = 4;
									}
									Static88.anIntArray164[local96] = local58.anInt2621;
								}
								local96--;
								local524++;
							}
							if (!local27[arg5 + 1 & 0x3]) {
								arg6[1] = Static290.aBooleanArrayArray4[local75][local512 + 3 & 0x3];
							}
						} else if (!local27[arg5 + 1 & 0x3]) {
							arg6[1] = Static247.aBooleanArrayArray3[local75][local512 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg2 == null) {
			return;
		}
		@Pc(1235) int local1235 = Static42.method928(arg2, arg0);
		if (!arg2.aBoolean203) {
			return;
		}
		for (local46 = 0; local46 < 8; local46++) {
			@Pc(1251) int local1251 = local46 - arg5 * 2 & 0x7;
			if (Static301.aBooleanArrayArray5[arg9][local46] && arg2.anInt2621 >= Static88.anIntArray164[local1251]) {
				Static298.anIntArray414[local1251] = arg2.anInt2631;
				Static57.anIntArray92[local1251] = local1235;
				Static429.anIntArray517[local1251] = arg0.method2617() ? arg2.anInt2618 : arg2.anInt2622;
				Static275.anIntArray396[local1251] = arg2.anInt2628;
				if (arg2.anInt2621 == Static88.anIntArray164[local1251]) {
					Static81.anIntArray154[local1251] |= 0x2;
				} else {
					Static81.anIntArray154[local1251] = 2;
				}
				Static88.anIntArray164[local1251] = arg2.anInt2621;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lclient!bm;[[[ILclient!qa;I)V")
	public final void method752(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class75 arg2) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!this.aBoolean46) {
			for (local21 = 0; local21 < 4; local21++) {
				for (local25 = 0; local25 < this.anInt804; local25++) {
					for (local29 = 0; local29 < this.anInt798; local29++) {
						if ((Static325.aByteArrayArrayArray15[local21][local25][local29] & 0x1) != 0) {
							@Pc(46) int local46 = local21;
							if ((Static325.aByteArrayArrayArray15[1][local25][local29] & 0x2) != 0) {
								local46 = local21 - 1;
							}
							if (local46 >= 0) {
								arg0[local46].method832(local25, local29);
							}
						}
					}
				}
			}
		}
		for (local21 = 0; local21 < this.anInt808; local21++) {
			local25 = 0;
			local29 = 0;
			if (!this.aBoolean46) {
				if (Static380.aBoolean463) {
					local25 = 2;
				}
				if (Static335.aBoolean432) {
					local29 = 8;
				}
				if (Static451.anInt7602 != 0) {
					if (local21 == 0 | Static337.aBoolean435) {
						local29 |= 0x10;
					}
					local25 |= 0x1;
				}
			}
			if (Static380.aBoolean463) {
				local29 |= 0x7;
			}
			if (!Static80.aBoolean137) {
				local29 |= 0x20;
			}
			@Pc(160) int[][] local160 = arg1 == null || arg1.length <= local21 ? this.anIntArrayArrayArray2[local21] : arg1[local21];
			Static112.method4944(local21, arg2.method2631(this.anInt804, this.anInt798, this.anIntArrayArrayArray2[local21], local160, local25, local29));
		}
	}
}
