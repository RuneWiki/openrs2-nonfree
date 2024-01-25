import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public class Class56 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "Lclient!af;")
	private final Class5 aClass5_6;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	protected final int anInt4594;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public final int anInt4586;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Z")
	public final boolean aBoolean341;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "Lclient!di;")
	private final Class47 aClass47_5;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	protected final int anInt4580;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIZLclient!af;Lclient!di;)V")
	protected Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class47 arg5) {
		this.aClass5_6 = arg4;
		this.anInt4594 = arg2;
		this.anInt4586 = arg0;
		this.aBoolean341 = arg3;
		this.aClass47_5 = arg5;
		this.anInt4580 = arg1;
		this.aByteArrayArrayArray15 = new byte[this.anInt4586][this.anInt4580][this.anInt4594];
		this.aByteArrayArrayArray13 = new byte[this.anInt4586][this.anInt4580][this.anInt4594];
		this.aByteArrayArrayArray16 = new byte[this.anInt4586][this.anInt4580 + 1][this.anInt4594 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt4586][this.anInt4580][this.anInt4594];
		this.anIntArrayArrayArray12 = new int[this.anInt4586][this.anInt4580 + 1][this.anInt4594 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt4586][this.anInt4580][this.anInt4594];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!kk;IIIII[Lclient!pf;)V")
	public final void method4056(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class188[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean341) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class188 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg2;
						@Pc(28) int local28 = local18 + arg3;
						if (local24 >= 0 && this.anInt4580 > local24 && local28 >= 0 && local28 < this.anInt4594) {
							local12.method4049(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg2 + arg1;
		@Pc(95) int local95 = arg3 + arg4;
		for (local14 = 0; local14 < this.anInt4586; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method4064(local24 + arg3, 0, local18 + local6, false, local14, 0, arg0, local18 + arg2, 0, local24 + local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ij;Lclient!ij;[[ILclient!vc;ILclient!ij;I)V")
	private void method4057(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(5) Class107 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray14[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray12[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt4580; local27++) {
			@Pc(41) int local41 = this.anInt4580 - 1 <= local27 ? local27 : local27 + 1;
			for (@Pc(43) int local43 = 0; local43 < this.anInt4594; local43++) {
				@Pc(57) int local57 = local43 >= this.anInt4594 - 1 ? local43 : local43 + 1;
				if (Static41.anInt832 == -1 || Static90.method1687(local43, Static41.anInt832, arg5, local27)) {
					@Pc(71) boolean local71 = false;
					@Pc(73) boolean local73 = false;
					@Pc(76) boolean[] local76 = new boolean[4];
					@Pc(82) int local82 = local10[local27][local43];
					@Pc(88) int local88 = local15[local27][local43];
					@Pc(96) int local96 = local25[local27][local43] & 0xFF;
					@Pc(104) int local104 = local20[local27][local43] & 0xFF;
					@Pc(112) int local112 = local20[local27][local57] & 0xFF;
					@Pc(120) int local120 = local20[local41][local57] & 0xFF;
					@Pc(128) int local128 = local20[local41][local43] & 0xFF;
					if (local96 != 0 || local104 != 0) {
						@Pc(147) Class55 local147 = local96 == 0 ? null : this.aClass5_6.method86(local96 - 1);
						if (local82 == 0 && local147 == null) {
							local82 = 12;
						}
						@Pc(165) Class58 local165 = local104 == 0 ? null : this.aClass47_5.method946(local104 - 1);
						@Pc(167) Class55 local167 = local147;
						if (local147 != null) {
							if (local147.anInt1294 == -1 && local147.anInt1283 == -1) {
								local167 = local147;
								local147 = null;
							} else if (local165 != null && local82 != 0) {
								local73 = local147.aBoolean94;
							}
						}
						@Pc(257) int local257;
						@Pc(310) int local310;
						@Pc(360) int local360;
						@Pc(373) int local373;
						if ((local82 == 0 || local82 == 12) && local27 > 0 && local43 > 0 && this.anInt4580 > local27 && local43 < this.anInt4594) {
							@Pc(240) int local240 = local20[local41][local43 - 1] == local104 ? 1 : -1;
							local257 = local104 == local20[local27 - 1][local43 - 1] ? 1 : -1;
							@Pc(274) int local274 = local20[local41][local57] == local104 ? 1 : -1;
							if (local104 == local20[local27][local43 - 1]) {
								local240++;
								local257++;
							} else {
								local240--;
								local257--;
							}
							local310 = local104 == local20[local27 - 1][local57] ? 1 : -1;
							if (local20[local41][local43] == local104) {
								local240++;
								local274++;
							} else {
								local274--;
								local240--;
							}
							if (local104 == local20[local27][local57]) {
								local310++;
								local274++;
							} else {
								local310--;
								local274--;
							}
							if (local104 == local20[local27 - 1][local43]) {
								local310++;
								local257++;
							} else {
								local257--;
								local310--;
							}
							local360 = local257 - local274;
							if (local360 < 0) {
								local360 = -local360;
							}
							local373 = local240 - local310;
							if (local373 < 0) {
								local373 = -local373;
							}
							if (local373 == local360) {
								local360 = arg0.method4685(local27, local43) - arg0.method4685(local41, local57);
								if (local360 < 0) {
									local360 = -local360;
								}
								local373 = arg0.method4685(local41, local43) - arg0.method4685(local27, local57);
								if (local373 < 0) {
									local373 = -local373;
								}
							}
							local88 = local373 > local360 ? 1 : 0;
						}
						for (local257 = 0; local257 < 13; local257++) {
							Static301.anIntArray1057[local257] = -1;
							Static128.anIntArray536[local257] = 1;
						}
						@Pc(462) boolean[] local462 = local147 != null && local147.aBoolean94 ? Static349.aBooleanArrayArray6[local82] : Static106.aBooleanArrayArray1[local82];
						this.method4063(local27, local165, local15, local147, local10, local88, local43, local25, local76, this.anInt4594, arg3, this.anInt4580, local82);
						@Pc(491) boolean local491 = local147 != null && local147.anInt1294 != local147.anInt1283;
						if (!local491) {
							for (local310 = 0; local310 < 8; local310++) {
								if (Static301.anIntArray1057[local310] >= 0 && Static68.anIntArray283[local310] != Static64.anIntArray272[local310]) {
									local491 = true;
									break;
								}
							}
						}
						if (!local462[local88 + 1 & 0x3]) {
							local76[1] = Static158.method2856(local76[1], (Static128.anIntArray536[4] & Static128.anIntArray536[2]) == 0);
						}
						if (!local462[local88 + 3 & 0x3]) {
							local76[3] = Static158.method2856(local76[3], (Static128.anIntArray536[0] & Static128.anIntArray536[6]) == 0);
						}
						if (!local462[local88 & 0x3]) {
							local76[0] = Static158.method2856(local76[0], (Static128.anIntArray536[0] & Static128.anIntArray536[2]) == 0);
						}
						if (!local462[local88 + 2 & 0x3]) {
							local76[2] = Static158.method2856(local76[2], (Static128.anIntArray536[6] & Static128.anIntArray536[4]) == 0);
						}
						if (!local73 && (local82 == 0 || local82 == 12)) {
							if (local76[0] && !local76[1] && !local76[2] && local76[3]) {
								local88 = 0;
								local76[0] = local76[3] = false;
								local82 = local82 == 0 ? 13 : 14;
							} else if (local76[0] && local76[1] && !local76[2] && !local76[3]) {
								local82 = local82 == 0 ? 13 : 14;
								local76[0] = local76[1] = false;
								local88 = 3;
							} else if (!local76[0] && local76[1] && local76[2] && !local76[3]) {
								local82 = local82 == 0 ? 13 : 14;
								local88 = 2;
								local76[1] = local76[2] = false;
							} else if (!local76[0] && !local76[1] && local76[2] && local76[3]) {
								local76[2] = local76[3] = false;
								local82 = local82 == 0 ? 13 : 14;
								local88 = 1;
							}
						}
						@Pc(797) boolean local797 = !local73 && !local76[0] && !local76[2] && !local76[1] && !local76[3];
						@Pc(799) int[] local799 = null;
						@Pc(819) int[] local819;
						@Pc(835) int[] local835;
						@Pc(815) int[] local815;
						if (local797) {
							local815 = Static302.anIntArrayArray23[local82];
							local360 = local165 == null ? 0 : Static180.anIntArray1331[local82];
							local819 = Static85.anIntArrayArray16[local82];
							local835 = Static234.anIntArrayArray32[local82];
							local373 = local147 == null ? 0 : Static232.anIntArray808[local82];
						} else if (local73) {
							local373 = local147 == null ? 0 : Static203.anIntArray751[local82];
							local815 = Static269.anIntArrayArray38[local82];
							local819 = Static82.anIntArrayArray15[local82];
							local799 = Static342.anIntArrayArray49[local82];
							local360 = local165 == null ? 0 : Static344.anIntArray924[local82];
							local835 = Static307.anIntArrayArray40[local82];
						} else {
							local799 = Static106.anIntArrayArray19[local82];
							local373 = local147 == null ? 0 : Static192.anIntArray723[local82];
							local360 = local165 == null ? 0 : Static292.anIntArray1000[local82];
							local815 = Static379.anIntArrayArray58[local82];
							local835 = Static203.anIntArrayArray31[local82];
							local819 = Static79.anIntArrayArray36[local82];
						}
						@Pc(901) int local901 = local360 + local373;
						if (local901 <= 0) {
							Static335.method4945(arg5, local27, local43);
						} else {
							if (local76[0]) {
								local901++;
							}
							if (local76[2]) {
								local901++;
							}
							if (local76[1]) {
								local901++;
							}
							if (local76[3]) {
								local901++;
							}
							@Pc(934) int local934 = 0;
							@Pc(936) int local936 = 0;
							@Pc(940) int local940 = local901 * 3;
							@Pc(947) int[] local947 = local491 ? new int[local940] : null;
							@Pc(950) int[] local950 = new int[local940];
							@Pc(953) int[] local953 = new int[local940];
							@Pc(956) int[] local956 = new int[local940];
							@Pc(959) int[] local959 = new int[local940];
							@Pc(962) int[] local962 = new int[local940];
							@Pc(969) int[] local969 = arg1 == null ? null : new int[local940];
							@Pc(978) int[] local978 = arg1 == null && arg4 == null ? null : new int[local940];
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = -1;
							@Pc(984) int local984 = 256;
							@Pc(1084) byte local1084;
							@Pc(1034) int local1034;
							@Pc(1036) int local1036;
							@Pc(1267) int local1267;
							@Pc(1273) int local1273;
							@Pc(1282) int local1282;
							@Pc(1286) int local1286;
							@Pc(1295) int local1295;
							@Pc(1290) int local1290;
							@Pc(1300) int local1300;
							@Pc(1357) int local1357;
							@Pc(1363) int local1363;
							if (local147 != null) {
								local980 = local147.anInt1294;
								local982 = arg3.method2032() ? local147.anInt1288 : local147.anInt1289;
								local984 = local147.anInt1292;
								local1034 = Static30.method551(local147, arg3);
								for (local1036 = 0; local1036 < local373; local1036++) {
									if (local76[-local88 & 0x3] && local799[0] == local934) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 1;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 1;
										Static343.anIntArray1178[4] = local835[local934];
										local1084 = 6;
										Static343.anIntArray1178[5] = local815[local934];
									} else if (local76[2 - local88 & 0x3] && local799[2] == local934) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 5;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 5;
										Static343.anIntArray1178[4] = local835[local934];
										local1084 = 6;
										Static343.anIntArray1178[5] = local815[local934];
									} else if (local76[1 - local88 & 0x3] && local799[1] == local934) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 3;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 3;
										Static343.anIntArray1178[4] = local835[local934];
										local1084 = 6;
										Static343.anIntArray1178[5] = local815[local934];
									} else if (local76[3 - local88 & 0x3] && local934 == local799[3]) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 7;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 7;
										Static343.anIntArray1178[4] = local835[local934];
										local1084 = 6;
										Static343.anIntArray1178[5] = local815[local934];
									} else {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = local835[local934];
										Static343.anIntArray1178[2] = local815[local934];
										local1084 = 3;
									}
									for (local1267 = 0; local1267 < local1084; local1267++) {
										local1273 = Static343.anIntArray1178[local1267];
										local1282 = local1273 - local88 * 2 & 0x7;
										local1286 = Static98.anIntArray436[local1273];
										local1290 = Static329.anIntArray1148[local1273];
										if (local88 == 1) {
											local1295 = local1290;
											local1300 = 128 - local1286;
										} else if (local88 == 2) {
											local1300 = 128 - local1290;
											local1295 = 128 - local1286;
										} else if (local88 == 3) {
											local1300 = local1286;
											local1295 = 128 - local1290;
										} else {
											local1300 = local1290;
											local1295 = local1286;
										}
										local950[local936] = local1295;
										local953[local936] = local1300;
										if (local969 != null && Static144.aBooleanArrayArray2[local82][local1273]) {
											local1357 = (local27 << 7) + local1295;
											local1363 = local1300 + (local43 << 7);
											local969[local936] = arg1.method4673(local1357, local1363) - arg0.method4673(local1357, local1363);
										}
										if (local978 != null) {
											if (arg1 != null && !Static144.aBooleanArrayArray2[local82][local1273]) {
												local1357 = (local27 << 7) + local1295;
												local1363 = local1300 + (local43 << 7);
												local978[local936] = arg0.method4673(local1357, local1363) - arg1.method4673(local1357, local1363);
											} else if (arg4 != null && !Static191.aBooleanArrayArray3[local82][local1273]) {
												local1357 = (local27 << 7) + local1295;
												local1363 = (local43 << 7) + local1300;
												local978[local936] = arg4.method4673(local1357, local1363) - arg0.method4673(local1357, local1363);
											}
										}
										if (local1273 < 8 && local147.anInt1284 < Static301.anIntArray1057[local1282]) {
											if (local947 != null) {
												local947[local936] = Static68.anIntArray283[local1282];
											}
											local962[local936] = Static110.anIntArray450[local1282];
											local959[local936] = Static391.anIntArray1357[local1282];
											local956[local936] = Static64.anIntArray272[local1282];
										} else {
											if (local947 != null) {
												local947[local936] = local1034;
											}
											local959[local936] = arg3.method2032() ? local147.anInt1288 : local147.anInt1289;
											local962[local936] = local147.anInt1292;
											local956[local936] = local980;
										}
										local936++;
									}
									local934++;
								}
								if (!this.aBoolean341 && arg5 == 0) {
									Static27.method497(local27, local43, local147.anInt1281, local147.anInt1293 * 8, local147.anInt1295);
								}
								if (local82 != 12 && local147.anInt1294 != -1 && local147.aBoolean93) {
									local71 = true;
								}
							} else if (local797) {
								local934 = Static232.anIntArray808[local82];
							} else if (local73) {
								local934 = Static203.anIntArray751[local82];
							} else {
								local934 = Static192.anIntArray723[local82];
							}
							if (local165 != null) {
								if (local128 == 0) {
									local128 = local104;
								}
								if (local120 == 0) {
									local120 = local104;
								}
								if (local112 == 0) {
									local112 = local104;
								}
								@Pc(1578) Class58 local1578 = this.aClass47_5.method946(local104 - 1);
								@Pc(1586) Class58 local1586 = this.aClass47_5.method946(local112 - 1);
								@Pc(1594) Class58 local1594 = this.aClass47_5.method946(local120 - 1);
								@Pc(1602) Class58 local1602 = this.aClass47_5.method946(local128 - 1);
								for (local1282 = 0; local1282 < local360; local1282++) {
									if (local76[-local88 & 0x3] && local934 == local799[0]) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 1;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 1;
										Static343.anIntArray1178[4] = local835[local934];
										local1084 = 6;
										Static343.anIntArray1178[5] = local815[local934];
									} else if (local76[2 - local88 & 0x3] && local934 == local799[2]) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 5;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 5;
										Static343.anIntArray1178[4] = local835[local934];
										local1084 = 6;
										Static343.anIntArray1178[5] = local815[local934];
									} else if (local76[1 - local88 & 0x3] && local799[1] == local934) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 3;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 3;
										Static343.anIntArray1178[4] = local835[local934];
										local1084 = 6;
										Static343.anIntArray1178[5] = local815[local934];
									} else if (local76[3 - local88 & 0x3] && local799[3] == local934) {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = 7;
										Static343.anIntArray1178[2] = local815[local934];
										Static343.anIntArray1178[3] = 7;
										Static343.anIntArray1178[4] = local835[local934];
										Static343.anIntArray1178[5] = local815[local934];
										local1084 = 6;
									} else {
										Static343.anIntArray1178[0] = local819[local934];
										Static343.anIntArray1178[1] = local835[local934];
										local1084 = 3;
										Static343.anIntArray1178[2] = local815[local934];
									}
									local934++;
									for (local1286 = 0; local1286 < local1084; local1286++) {
										local1295 = Static343.anIntArray1178[local1286];
										local1290 = local1295 - local88 * 2 & 0x7;
										local1300 = Static98.anIntArray436[local1295];
										local1363 = Static329.anIntArray1148[local1295];
										@Pc(1868) int local1868;
										if (local88 == 1) {
											local1868 = 128 - local1300;
											local1357 = local1363;
										} else if (local88 == 2) {
											local1868 = 128 - local1363;
											local1357 = 128 - local1300;
										} else if (local88 == 3) {
											local1868 = local1300;
											local1357 = 128 - local1363;
										} else {
											local1868 = local1363;
											local1357 = local1300;
										}
										local950[local936] = local1357;
										local953[local936] = local1868;
										@Pc(1927) int local1927;
										@Pc(1933) int local1933;
										if (local969 != null && Static144.aBooleanArrayArray2[local82][local1295]) {
											local1927 = local1357 + (local27 << 7);
											local1933 = local1868 + (local43 << 7);
											local969[local936] = arg1.method4673(local1927, local1933) - arg0.method4673(local1927, local1933);
										}
										if (local978 != null) {
											if (arg1 != null && !Static144.aBooleanArrayArray2[local82][local1295]) {
												local1927 = (local27 << 7) + local1357;
												local1933 = local1868 + (local43 << 7);
												local978[local936] = arg0.method4673(local1927, local1933) - arg1.method4673(local1927, local1933);
											} else if (arg4 != null && !Static191.aBooleanArrayArray3[local82][local1295]) {
												local1927 = (local27 << 7) + local1357;
												local1933 = local1868 + (local43 << 7);
												local978[local936] = arg4.method4673(local1927, local1933) - arg0.method4673(local1927, local1933);
											}
										}
										if (local1295 < 8 && Static301.anIntArray1057[local1290] >= 0) {
											if (local947 != null) {
												local947[local936] = Static68.anIntArray283[local1290];
											}
											local962[local936] = Static110.anIntArray450[local1290];
											local959[local936] = Static391.anIntArray1357[local1290];
											local956[local936] = Static64.anIntArray272[local1290];
										} else {
											if (local73 && Static144.aBooleanArrayArray2[local82][local1295]) {
												local959[local936] = local982;
												local962[local936] = local984;
												local956[local936] = local980;
											} else if (local1357 == 0 && local1868 == 0) {
												local956[local936] = arg2[local27][local43];
												local959[local936] = local1578.anInt1438;
												local962[local936] = local1578.anInt1446;
											} else if (local1357 == 0 && local1868 == 128) {
												local956[local936] = arg2[local27][local57];
												local959[local936] = local1586.anInt1438;
												local962[local936] = local1586.anInt1446;
											} else if (local1357 == 128 && local1868 == 128) {
												local956[local936] = arg2[local41][local57];
												local959[local936] = local1594.anInt1438;
												local962[local936] = local1594.anInt1446;
											} else if (local1357 == 128 && local1868 == 0) {
												local956[local936] = arg2[local41][local43];
												local959[local936] = local1602.anInt1438;
												local962[local936] = local1602.anInt1446;
											} else {
												if (local1357 < 64) {
													if (local1868 >= 64) {
														local959[local936] = local1586.anInt1438;
														local962[local936] = local1586.anInt1446;
													} else {
														local959[local936] = local1578.anInt1438;
														local962[local936] = local1578.anInt1446;
													}
												} else if (local1868 < 64) {
													local959[local936] = local1602.anInt1438;
													local962[local936] = local1602.anInt1446;
												} else {
													local959[local936] = local1594.anInt1438;
													local962[local936] = local1594.anInt1446;
												}
												local1927 = Static30.method553(arg2[local27][local43], local1357 << 7 >> 7, arg2[local41][local43]);
												local1933 = Static30.method553(arg2[local27][local57], local1357 << 7 >> 7, arg2[local41][local57]);
												local956[local936] = Static30.method553(local1927, local1868 << 7 >> 7, local1933);
											}
											if (local947 != null) {
												local947[local936] = local956[local936];
											}
										}
										local936++;
									}
								}
								if (local82 != 0 && local165.aBoolean108) {
									local71 = true;
								}
							}
							local1034 = arg0.method4685(local27, local43);
							local1036 = arg0.method4685(local41, local43);
							local1267 = arg0.method4685(local41, local57);
							local1273 = arg0.method4685(local27, local57);
							if (arg5 > 0) {
								@Pc(2340) boolean local2340 = true;
								if (local104 == 0 && local82 != 0) {
									local2340 = false;
								}
								if (local96 > 0 && local167 != null && !local167.aBoolean95) {
									local2340 = false;
								}
								if (local2340 && local1034 == local1036 && local1034 == local1267 && local1034 == local1273) {
									this.aByteArrayArrayArray16[arg5][local27][local43] = (byte) (this.aByteArrayArrayArray16[arg5][local27][local43] | 0x4);
								}
							}
							local1282 = 0;
							local1286 = 0;
							local1295 = 0;
							if (this.aBoolean341) {
								local1282 = Static218.method4032(local27, local43);
								local1286 = Static143.method2681(local27, local43);
								local1295 = Static290.method4403(local27, local43);
							}
							arg0.method4682(local27, local43, local950, local969, local953, local978, local956, local947, local959, local962, local1282, local1286, local1295, local71);
							Static335.method4945(arg5, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([[III)V")
	public final void method4058(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray12[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4580 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt4594 + 1; local20++) {
				local10[local16][local20] += arg0[local16][local20];
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
	public final void method4059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = arg1; local15 < arg1 + arg0; local15++) {
			for (local19 = arg3; local19 < arg2 + arg3; local19++) {
				if (local19 >= 0 && this.anInt4580 > local19 && local15 >= 0 && local15 < this.anInt4594) {
					this.anIntArrayArrayArray12[arg4][local19][local15] = arg4 > 0 ? this.anIntArrayArrayArray12[arg4 - 1][local19][local15] - 240 : 0;
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt4580) {
			for (local19 = arg1 + 1; local19 < arg0 + arg1; local19++) {
				if (local19 >= 0 && this.anInt4594 > local19) {
					this.anIntArrayArrayArray12[arg4][arg3][local19] = this.anIntArrayArrayArray12[arg4][arg3 - 1][local19];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt4594) {
			for (local19 = arg3 + 1; local19 < arg2 + arg3; local19++) {
				if (local19 >= 0 && local19 < this.anInt4580) {
					this.anIntArrayArrayArray12[arg4][local19][arg1] = this.anIntArrayArrayArray12[arg4][local19][arg1 - 1];
				}
			}
		}
		if (arg3 < 0 || arg1 < 0 || arg3 >= this.anInt4580 || this.anInt4594 <= arg1) {
			return;
		}
		if (arg4 != 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray12[arg4 - 1][arg3 - 1][arg1] != this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1]) {
				this.anIntArrayArrayArray12[arg4][arg3][arg1] = this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray12[arg4][arg3][arg1 - 1] != this.anIntArrayArrayArray12[arg4 - 1][arg3][arg1 - 1]) {
				this.anIntArrayArrayArray12[arg4][arg3][arg1] = this.anIntArrayArrayArray12[arg4][arg3][arg1 - 1];
				return;
			}
			if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1 - 1] != this.anIntArrayArrayArray12[arg4 - 1][arg3 - 1][arg1 - 1]) {
				this.anIntArrayArrayArray12[arg4][arg3][arg1] = this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1] != 0) {
			this.anIntArrayArrayArray12[arg4][arg3][arg1] = this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray12[arg4][arg3][arg1 - 1] != 0) {
			this.anIntArrayArrayArray12[arg4][arg3][arg1] = this.anIntArrayArrayArray12[arg4][arg3][arg1 - 1];
			return;
		}
		if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1 - 1] != 0) {
			this.anIntArrayArrayArray12[arg4][arg3][arg1] = this.anIntArrayArrayArray12[arg4][arg3 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lclient!pf;IIIIIIBILclient!kk;)V")
	public final void method4062(@OriginalArg(0) Class188[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub16 arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean341) {
			@Pc(24) Class188 local24 = arg0[arg4];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg1 + Static96.method1915(arg2, local30 & 0x7, local26 & 0x7);
					local56 = Static218.method4029(arg2, local30 & 0x7, local26 & 0x7) + arg3;
					if (local44 > 0 && this.anInt4580 - 1 > local44 && local56 > 0 && local56 < this.anInt4594 - 1) {
						local24.method4049(local44, local56);
					}
				}
			}
		}
		@Pc(103) int local103 = (arg6 & 0xFFFFFFF8) << 3;
		local26 = (arg7 & 0xFFFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg2 == 1) {
			local117 = 1;
		} else if (arg2 == 2) {
			local115 = 1;
			local117 = 1;
		} else if (arg2 == 3) {
			local115 = 1;
		}
		for (local56 = 0; local56 < this.anInt4586; local56++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
					if (arg5 == local56 && local11 <= local148 && local148 <= local11 + 8 && local17 <= local152 && local17 + 8 >= local152) {
						@Pc(242) int local242;
						@Pc(233) int local233;
						if (local148 == local11 + 8 || local17 + 8 == local152) {
							if (arg2 == 0) {
								local233 = arg3 + local152 - local17;
								local242 = arg1 + local148 - local11;
							} else if (arg2 == 1) {
								local233 = arg3 + local11 + 8 - local148;
								local242 = local152 + arg1 - local17;
							} else if (arg2 == 2) {
								local233 = local17 + arg3 + 8 - local152;
								local242 = arg1 + local11 + 8 - local148;
							} else {
								local233 = local148 + arg3 - local11;
								local242 = local17 + arg1 + 8 - local152;
							}
							this.method4064(local233, 0, local103 + local148, true, arg4, 0, arg8, local242, 0, local26 + local152);
						} else {
							local242 = arg1 + Static96.method1915(arg2, local152 & 0x7, local148 & 0x7);
							local233 = arg3 + Static218.method4029(arg2, local152 & 0x7, local148 & 0x7);
							this.method4064(local233, local115, local148 + local103, false, arg4, arg2, arg8, local242, local117, local152 + local26);
							if (local148 == 63 || local152 == 63) {
								@Pc(373) int local373 = local148 == 63 ? 64 : local148;
								@Pc(382) int local382 = local152 == 63 ? 64 : local152;
								@Pc(398) int local398;
								@Pc(391) int local391;
								if (arg2 == 0) {
									local391 = local382 + arg3 - local17;
									local398 = arg1 + local373 - local11;
								} else if (arg2 == 1) {
									local398 = arg1 + local382 - local17;
									local391 = local11 + arg3 + 8 - local373;
								} else if (arg2 == 2) {
									local391 = local17 + arg3 + 8 - local382;
									local398 = local11 + arg1 + 8 - local373;
								} else {
									local391 = local373 + arg3 - local11;
									local398 = arg1 + local17 + 8 - local382;
								}
								if (local398 >= 0 && this.anInt4580 > local398 && local391 >= 0 && local391 < this.anInt4594) {
									this.anIntArrayArrayArray12[arg4][local398][local391] = this.anIntArrayArrayArray12[arg4][local115 + local242][local233 + local117];
								}
							}
						}
					} else {
						this.method4064(-1, 0, 0, false, 0, 0, arg8, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ei;[[BLclient!du;[[BIII[[B[ZILclient!vc;II)V")
	private void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class55 arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class63 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(53) int local53;
		if (arg3 != null && arg1 != null || arg1 != null && arg12 == 12 || arg3 != null && arg12 == 0) {
			@Pc(31) boolean[] local31 = arg3 != null && arg3.aBoolean94 ? Static349.aBooleanArrayArray6[arg12] : Static106.aBooleanArrayArray1[arg12];
			@Pc(63) Class55 local63;
			@Pc(80) byte local80;
			@Pc(96) int local96;
			@Pc(101) int local101;
			if (arg6 > 0) {
				if (arg0 > 0) {
					local53 = arg7[arg0 - 1][arg6 - 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass5_6.method86(local53 - 1);
						if (local63.anInt1294 != -1 && local63.aBoolean94) {
							local80 = arg4[arg0 - 1][arg6 - 1];
							local96 = arg2[arg0 - 1][arg6 - 1] * 2 + 4 & 0x7;
							local101 = Static30.method551(local63, arg10);
							if (Static144.aBooleanArrayArray2[local80][local96]) {
								Static64.anIntArray272[0] = local63.anInt1294;
								Static68.anIntArray283[0] = local101;
								Static391.anIntArray1357[0] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
								Static110.anIntArray450[0] = local63.anInt1292;
								Static301.anIntArray1057[0] = local63.anInt1284;
								Static128.anIntArray536[0] = 256;
							}
						}
					}
				}
				if (arg0 < arg11 - 1) {
					local53 = arg7[arg0 + 1][arg6 - 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass5_6.method86(local53 - 1);
						if (local63.anInt1294 != -1 && local63.aBoolean94) {
							local80 = arg4[arg0 + 1][arg6 - 1];
							local96 = arg2[arg0 + 1][arg6 - 1] * 2 + 6 & 0x7;
							local101 = Static30.method551(local63, arg10);
							if (Static144.aBooleanArrayArray2[local80][local96]) {
								Static64.anIntArray272[2] = local63.anInt1294;
								Static68.anIntArray283[2] = local101;
								Static391.anIntArray1357[2] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
								Static110.anIntArray450[2] = local63.anInt1292;
								Static301.anIntArray1057[2] = local63.anInt1284;
								Static128.anIntArray536[2] = 512;
							}
						}
					}
				}
			}
			if (arg6 < arg9 - 1) {
				if (arg0 > 0) {
					local53 = arg7[arg0 - 1][arg6 + 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass5_6.method86(local53 - 1);
						if (local63.anInt1294 != -1 && local63.aBoolean94) {
							local80 = arg4[arg0 - 1][arg6 + 1];
							local96 = arg2[arg0 - 1][arg6 + 1] * 2 + 2 & 0x7;
							local101 = Static30.method551(local63, arg10);
							if (Static144.aBooleanArrayArray2[local80][local96]) {
								Static64.anIntArray272[6] = local63.anInt1294;
								Static68.anIntArray283[6] = local101;
								Static391.anIntArray1357[6] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
								Static110.anIntArray450[6] = local63.anInt1292;
								Static301.anIntArray1057[6] = local63.anInt1284;
								Static128.anIntArray536[6] = 64;
							}
						}
					}
				}
				if (arg11 - 1 > arg0) {
					local53 = arg7[arg0 + 1][arg6 + 1] & 0xFF;
					if (local53 > 0) {
						local63 = this.aClass5_6.method86(local53 - 1);
						if (local63.anInt1294 != -1 && local63.aBoolean94) {
							local80 = arg4[arg0 + 1][arg6 + 1];
							local96 = --(arg2[arg0 + 1][arg6 + 1] * 2) & 0x7;
							local101 = Static30.method551(local63, arg10);
							if (Static144.aBooleanArrayArray2[local80][local96]) {
								Static64.anIntArray272[4] = local63.anInt1294;
								Static68.anIntArray283[4] = local101;
								Static391.anIntArray1357[4] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
								Static110.anIntArray450[4] = local63.anInt1292;
								Static301.anIntArray1057[4] = local63.anInt1284;
								Static128.anIntArray536[4] = 128;
							}
						}
					}
				}
			}
			@Pc(527) int local527;
			@Pc(532) int local532;
			@Pc(534) int local534;
			@Pc(516) byte local516;
			if (arg6 > 0) {
				local53 = arg7[arg0][arg6 - 1] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass5_6.method86(local53 - 1);
					if (local63.anInt1294 != -1) {
						local80 = arg4[arg0][arg6 - 1];
						local516 = arg2[arg0][arg6 - 1];
						if (local63.aBoolean94) {
							local101 = 2;
							local527 = local516 * 2 + 4;
							local532 = Static30.method551(local63, arg10);
							for (local534 = 0; local534 < 3; local534++) {
								local527 &= 0x7;
								local101 &= 0x7;
								if (Static144.aBooleanArrayArray2[local80][local527] && local63.anInt1284 >= Static301.anIntArray1057[local101]) {
									Static64.anIntArray272[local101] = local63.anInt1294;
									Static68.anIntArray283[local101] = local532;
									Static391.anIntArray1357[local101] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
									Static110.anIntArray450[local101] = local63.anInt1292;
									if (local63.anInt1284 == Static301.anIntArray1057[local101]) {
										Static128.anIntArray536[local101] |= 0x20;
									} else {
										Static128.anIntArray536[local101] = 32;
									}
									Static301.anIntArray1057[local101] = local63.anInt1284;
								}
								local527++;
								local101--;
							}
							if (!local31[arg5 & 0x3]) {
								arg8[0] = Static349.aBooleanArrayArray6[local80][local516 + 2 & 0x3];
							}
						} else if (!local31[--arg5 & 0x3]) {
							arg8[0] = Static106.aBooleanArrayArray1[local80][local516 + 2 & 0x3];
						}
					}
				}
			}
			if (arg6 < arg9 - 1) {
				local53 = arg7[arg0][arg6 + 1] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass5_6.method86(local53 - 1);
					if (local63.anInt1294 != -1) {
						local80 = arg4[arg0][arg6 + 1];
						local516 = arg2[arg0][arg6 + 1];
						if (local63.aBoolean94) {
							local101 = 4;
							local527 = local516 * 2 + 2;
							local532 = Static30.method551(local63, arg10);
							for (local534 = 0; local534 < 3; local534++) {
								local527 &= 0x7;
								local101 &= 0x7;
								if (Static144.aBooleanArrayArray2[local80][local527] && Static301.anIntArray1057[local101] <= local63.anInt1284) {
									Static64.anIntArray272[local101] = local63.anInt1294;
									Static68.anIntArray283[local101] = local532;
									Static391.anIntArray1357[local101] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
									Static110.anIntArray450[local101] = local63.anInt1292;
									if (Static301.anIntArray1057[local101] == local63.anInt1284) {
										Static128.anIntArray536[local101] |= 0x10;
									} else {
										Static128.anIntArray536[local101] = 16;
									}
									Static301.anIntArray1057[local101] = local63.anInt1284;
								}
								local101++;
								local527--;
							}
							if (!local31[arg5 + 2 & 0x3]) {
								arg8[2] = Static349.aBooleanArrayArray6[local80][local516 & 0x3];
							}
						} else if (!local31[arg5 + 2 & 0x3]) {
							arg8[2] = Static106.aBooleanArrayArray1[local80][local516 & 0x3];
						}
					}
				}
			}
			if (arg0 > 0) {
				local53 = arg7[arg0 - 1][arg6] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass5_6.method86(local53 - 1);
					if (local63.anInt1294 != -1) {
						local80 = arg4[arg0 - 1][arg6];
						local516 = arg2[arg0 - 1][arg6];
						if (local63.aBoolean94) {
							local101 = 6;
							local527 = local516 * 2 + 4;
							local532 = Static30.method551(local63, arg10);
							for (local534 = 0; local534 < 3; local534++) {
								local101 &= 0x7;
								local527 &= 0x7;
								if (Static144.aBooleanArrayArray2[local80][local527] && local63.anInt1284 >= Static301.anIntArray1057[local101]) {
									Static64.anIntArray272[local101] = local63.anInt1294;
									Static68.anIntArray283[local101] = local532;
									Static391.anIntArray1357[local101] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
									Static110.anIntArray450[local101] = local63.anInt1292;
									if (Static301.anIntArray1057[local101] == local63.anInt1284) {
										Static128.anIntArray536[local101] |= 0x8;
									} else {
										Static128.anIntArray536[local101] = 8;
									}
									Static301.anIntArray1057[local101] = local63.anInt1284;
								}
								local527--;
								local101++;
							}
							if (!local31[arg5 + 3 & 0x3]) {
								arg8[3] = Static349.aBooleanArrayArray6[local80][local516 + 1 & 0x3];
							}
						} else if (!local31[arg5 + 3 & 0x3]) {
							arg8[3] = Static106.aBooleanArrayArray1[local80][local516 + 1 & 0x3];
						}
					}
				}
			}
			if (arg0 < arg11 - 1) {
				local53 = arg7[arg0 + 1][arg6] & 0xFF;
				if (local53 > 0) {
					local63 = this.aClass5_6.method86(local53 - 1);
					if (local63.anInt1294 != -1) {
						local80 = arg4[arg0 + 1][arg6];
						local516 = arg2[arg0 + 1][arg6];
						if (local63.aBoolean94) {
							local101 = 4;
							local527 = local516 * 2 + 6;
							local532 = Static30.method551(local63, arg10);
							for (local534 = 0; local534 < 3; local534++) {
								local527 &= 0x7;
								local101 &= 0x7;
								if (Static144.aBooleanArrayArray2[local80][local527] && Static301.anIntArray1057[local101] <= local63.anInt1284) {
									Static64.anIntArray272[local101] = local63.anInt1294;
									Static68.anIntArray283[local101] = local532;
									Static391.anIntArray1357[local101] = arg10.method2032() ? local63.anInt1288 : local63.anInt1289;
									Static110.anIntArray450[local101] = local63.anInt1292;
									if (local63.anInt1284 == Static301.anIntArray1057[local101]) {
										Static128.anIntArray536[local101] |= 0x4;
									} else {
										Static128.anIntArray536[local101] = 4;
									}
									Static301.anIntArray1057[local101] = local63.anInt1284;
								}
								local101--;
								local527++;
							}
							if (!local31[arg5 + 1 & 0x3]) {
								arg8[1] = Static349.aBooleanArrayArray6[local80][local516 + 3 & 0x3];
							}
						} else if (!local31[arg5 + 1 & 0x3]) {
							arg8[1] = Static106.aBooleanArrayArray1[local80][local516 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		@Pc(1234) int local1234 = Static30.method551(arg3, arg10);
		if (!arg3.aBoolean94) {
			return;
		}
		for (local53 = 0; local53 < 8; local53++) {
			@Pc(1250) int local1250 = local53 - arg5 * 2 & 0x7;
			if (Static144.aBooleanArrayArray2[arg12][local53] && Static301.anIntArray1057[local1250] <= arg3.anInt1284) {
				Static64.anIntArray272[local1250] = arg3.anInt1294;
				Static68.anIntArray283[local1250] = local1234;
				Static391.anIntArray1357[local1250] = arg10.method2032() ? arg3.anInt1288 : arg3.anInt1289;
				Static110.anIntArray450[local1250] = arg3.anInt1292;
				if (arg3.anInt1284 == Static301.anIntArray1057[local1250]) {
					Static128.anIntArray536[local1250] |= 0x2;
				} else {
					Static128.anIntArray536[local1250] = 2;
				}
				Static301.anIntArray1057[local1250] = arg3.anInt1284;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZIILclient!kk;BIII)V")
	private void method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub16 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 == 1) {
			arg8 = 1;
		} else if (arg5 == 2) {
			arg1 = 1;
			arg8 = 1;
		} else if (arg5 == 3) {
			arg1 = 1;
		}
		@Pc(48) int local48;
		if (arg7 < 0 || arg7 >= this.anInt4580 || arg0 < 0 || arg0 >= this.anInt4594) {
			while (true) {
				local48 = arg6.method5350();
				if (local48 == 0) {
					break;
				}
				if (local48 == 1) {
					arg6.method5350();
					break;
				}
				if (local48 <= 49) {
					arg6.method5350();
				}
			}
			return;
		}
		if (!this.aBoolean341 && !arg3) {
			Static96.aByteArrayArrayArray8[arg4][arg7][arg0] = 0;
		}
		while (true) {
			local48 = arg6.method5350();
			if (local48 == 0) {
				if (this.aBoolean341) {
					this.anIntArrayArrayArray12[0][arg7 + arg1][arg8 + arg0] = 0;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray12[0][arg1 + arg7][arg8 + arg0] = -Static70.method1031(arg2 + 932731, arg9 + 556238) * 8;
				} else {
					this.anIntArrayArrayArray12[arg4][arg7 + arg1][arg0 + arg8] = this.anIntArrayArrayArray12[arg4 - 1][arg1 + arg7][arg0 + arg8] - 240;
				}
				break;
			}
			if (local48 == 1) {
				@Pc(178) int local178 = arg6.method5350();
				if (this.aBoolean341) {
					this.anIntArrayArrayArray12[0][arg7 + arg1][arg8 + arg0] = local178 * 8;
				} else {
					if (local178 == 1) {
						local178 = 0;
					}
					if (arg4 == 0) {
						this.anIntArrayArrayArray12[0][arg1 + arg7][arg0 + arg8] = -local178 * 8;
					} else {
						this.anIntArrayArrayArray12[arg4][arg7 + arg1][arg0 + arg8] = this.anIntArrayArrayArray12[arg4 - 1][arg7 + arg1][arg8 + arg0] - local178 * 8;
					}
				}
				break;
			}
			if (local48 <= 49) {
				if (arg3) {
					arg6.method5350();
				} else {
					this.aByteArrayArrayArray15[arg4][arg7][arg0] = arg6.method5330();
					this.aByteArrayArrayArray14[arg4][arg7][arg0] = (byte) ((local48 - 2) / 4);
					this.aByteArrayArrayArray13[arg4][arg7][arg0] = (byte) (local48 + arg5 - 2 & 0x3);
				}
			} else if (local48 <= 81) {
				if (!this.aBoolean341 && !arg3) {
					Static96.aByteArrayArrayArray8[arg4][arg7][arg0] = (byte) (local48 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray12[arg4][arg7][arg0] = (byte) (local48 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ij;Lclient!ij;Lclient!ij;[[ILclient!vc;II)V")
	private void method4066(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Class63 arg4, @OriginalArg(5) int arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4580; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt4594; local11++) {
				if (Static41.anInt832 == -1 || Static90.method1687(local11, Static41.anInt832, arg5, local7)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray14[arg5][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray13[arg5][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray15[arg5][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray12[arg5][local7][local11] & 0xFF;
					@Pc(78) Class55 local78 = local55 == 0 ? null : this.aClass5_6.method86(local55 - 1);
					@Pc(93) Class58 local93 = local66 == 0 ? null : this.aClass47_5.method946(local66 - 1);
					@Pc(95) int local95 = 0;
					@Pc(97) int local97 = 0;
					if (local35 != 0) {
						local97 = local78 == null ? 0 : Static232.anIntArray808[local35];
						local95 = local93 == null ? 0 : Static180.anIntArray1331[local35];
					} else if (local78 != null) {
						local97 = Static232.anIntArray808[local35];
					} else if (local93 != null) {
						local95 = Static232.anIntArray808[local35];
					}
					@Pc(135) int local135 = local95 + local97;
					@Pc(137) int local137 = 0;
					if (local135 != 0) {
						@Pc(145) int[] local145 = new int[local135];
						@Pc(148) int[] local148 = new int[local135];
						@Pc(151) int[] local151 = new int[local135];
						@Pc(154) int[] local154 = new int[local135];
						@Pc(156) boolean local156 = false;
						@Pc(175) int local175;
						@Pc(207) int local207;
						if (local78 == null || local78.anInt1294 == -1 && local78.anInt1283 == -1 && local78.anInt1288 == -1) {
							for (local175 = 0; local175 < local97; local175++) {
								local145[local137] = -1;
								local137++;
							}
						} else {
							local175 = arg4.method2032() ? local78.anInt1288 : local78.anInt1289;
							if (Static267.aBoolean347) {
								local175 = -1;
							}
							for (local207 = 0; local207 < local97; local207++) {
								local151[local137] = local175;
								local154[local137] = local78.anInt1292;
								if (local78.anInt1294 == -1) {
									local145[local137] = -1;
								} else {
									local145[local137] = local78.anInt1294;
								}
								if (local78.anInt1283 == -1) {
									local148[local137] = -1;
								} else {
									local156 = true;
									local148[local137] = local78.anInt1283;
								}
								local137++;
							}
							if (!this.aBoolean341 && arg5 == 0) {
								Static27.method497(local7, local11, local78.anInt1281, local78.anInt1293 * 8, local78.anInt1295);
							}
						}
						if (!local156) {
							local148 = null;
						}
						if (local93 == null) {
							for (local175 = 0; local175 < local95; local175++) {
								local145[local137] = -1;
								local137++;
							}
						} else {
							local175 = local93.anInt1438;
							if (Static267.aBoolean347) {
								local175 = -1;
							}
							for (local207 = 0; local207 < local95; local207++) {
								local151[local137] = local175;
								local154[local137] = local93.anInt1446;
								local145[local137] = arg3[local7][local11];
								if (local148 != null) {
									local148[local137] = -1;
								}
								local137++;
							}
						}
						local175 = Static98.anIntArray436.length;
						@Pc(349) int[] local349 = new int[local175];
						@Pc(352) int[] local352 = new int[local175];
						@Pc(359) int[] local359 = arg2 == null ? null : new int[local175];
						@Pc(368) int[] local368 = arg2 == null && arg1 == null ? null : new int[local175];
						@Pc(376) int local376;
						@Pc(380) int local380;
						@Pc(463) int local463;
						@Pc(469) int local469;
						for (@Pc(370) int local370 = 0; local370 < local175; local370++) {
							local376 = Static98.anIntArray436[local370];
							local380 = Static329.anIntArray1148[local370];
							if (local44 == 0) {
								local349[local370] = local376;
								local352[local370] = local380;
							} else if (local44 == 1) {
								local349[local370] = local380;
								local352[local370] = 128 - local376;
							} else if (local44 == 2) {
								local349[local370] = 128 - local376;
								local352[local370] = 128 - local380;
							} else if (local44 == 3) {
								local349[local370] = 128 - local380;
								local352[local370] = local376;
							}
							if (local359 != null && Static144.aBooleanArrayArray2[local35][local370]) {
								local463 = local376 + (local7 << 7);
								local469 = (local11 << 7) + local376;
								local359[local370] = arg2.method4673(local463, local469) - arg0.method4673(local463, local469);
							}
							if (local368 != null) {
								if (arg2 != null && !Static144.aBooleanArrayArray2[local35][local370]) {
									local463 = (local7 << 7) + local376;
									local469 = (local11 << 7) + local376;
									local368[local370] = arg0.method4673(local463, local469) - arg2.method4673(local463, local469);
								} else if (arg1 != null && !Static191.aBooleanArrayArray3[local35][local370]) {
									local463 = (local7 << 7) + local376;
									local469 = (local11 << 7) + local376;
									local368[local370] = arg1.method4673(local463, local469) - arg0.method4673(local463, local469);
								}
							}
						}
						local376 = arg0.method4685(local7, local11);
						local380 = arg0.method4685(local7 + 1, local11);
						local463 = arg0.method4685(local7 + 1, local11 + 1);
						local469 = arg0.method4685(local7, local11 + 1);
						if (arg5 > 0) {
							@Pc(597) boolean local597 = true;
							if (local66 == 0 && local35 != 0) {
								local597 = false;
							}
							if (local55 > 0 && local78 != null && !local78.aBoolean95) {
								local597 = false;
							}
							if (local597 && local376 == local380 && local463 == local376 && local469 == local376) {
								this.aByteArrayArrayArray16[arg5][local7][local11] = (byte) (this.aByteArrayArrayArray16[arg5][local7][local11] | 0x4);
							}
						}
						@Pc(644) int local644 = 0;
						@Pc(646) int local646 = 0;
						@Pc(648) int local648 = 0;
						if (this.aBoolean341) {
							local644 = Static218.method4032(local7, local11);
							local646 = Static143.method2681(local7, local11);
							local648 = Static290.method4403(local7, local11);
						}
						arg0.method4666(local7, local11, local349, local359, local352, local368, Static85.anIntArrayArray16[local35], Static234.anIntArrayArray32[local35], Static302.anIntArrayArray23[local35], local145, local148, local151, local154, local644, local646, local648);
						Static335.method4945(arg5, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
	public final void method4069(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt4586; local15++) {
			this.method4059(64, arg1, 64, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[Lclient!pf;Lclient!vc;[[[I)V")
	public final void method4071(@OriginalArg(1) Class188[] arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(32) int local32;
		if (!this.aBoolean341) {
			for (local10 = 0; local10 < 4; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt4580; local14++) {
					for (local18 = 0; local18 < this.anInt4594; local18++) {
						if ((Static96.aByteArrayArrayArray8[local10][local14][local18] & 0x1) != 0) {
							local32 = local10;
							if ((Static96.aByteArrayArrayArray8[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg0[local32].method4050(local14, local18);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt4586; local10++) {
			local18 = 0;
			local32 = 0;
			if (!this.aBoolean341) {
				if (Static380.aBoolean463) {
					local32 = 8;
				}
				if (Static196.aBoolean308) {
					local18 = 2;
				}
				if (Static174.anInt3334 != 0) {
					local18 |= 0x1;
					if (Static92.aBoolean130 | local10 == 0) {
						local32 |= 0x10;
					}
				}
			}
			if (Static196.aBoolean308) {
				local32 |= 0x7;
			}
			@Pc(154) int[][] local154 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray12[local10] : arg2[local10];
			Static72.method4065(local10, arg1.method1972(this.anInt4580, this.anInt4594, this.anIntArrayArrayArray12[local10], local154, local18, local32));
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ij;Lclient!ij;BLclient!vc;)V")
	public final void method4072(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(3) Class63 arg2) {
		if (Static314.anIntArray1060 == null || this.anInt4594 != Static314.anIntArray1060.length) {
			Static314.anIntArray1060 = new int[this.anInt4594];
			Static140.anIntArray577 = new int[this.anInt4594];
			Static49.anIntArray203 = new int[this.anInt4594];
			Static83.anIntArray357 = new int[this.anInt4594];
			Static235.anIntArray815 = new int[this.anInt4594];
		}
		@Pc(42) int[][] local42 = new int[this.anInt4580][this.anInt4594];
		@Pc(56) int local56;
		for (@Pc(52) int local52 = 0; local52 < this.anInt4586; local52++) {
			for (local56 = 0; local56 < this.anInt4594; local56++) {
				Static314.anIntArray1060[local56] = 0;
				Static235.anIntArray815[local56] = 0;
				Static83.anIntArray357[local56] = 0;
				Static49.anIntArray203[local56] = 0;
				Static140.anIntArray577[local56] = 0;
			}
			for (@Pc(85) int local85 = -5; local85 < this.anInt4580; local85++) {
				@Pc(95) int local95;
				@Pc(110) int local110;
				@Pc(179) int local179;
				for (@Pc(89) int local89 = 0; local89 < this.anInt4594; local89++) {
					local95 = local85 + 5;
					@Pc(156) int local156;
					if (local95 < this.anInt4580) {
						local110 = this.aByteArrayArrayArray12[local52][local95][local89] & 0xFF;
						if (local110 > 0) {
							@Pc(120) Class58 local120 = this.aClass47_5.method946(local110 - 1);
							Static314.anIntArray1060[local89] += local120.anInt1447;
							Static235.anIntArray815[local89] += local120.anInt1448;
							Static83.anIntArray357[local89] += local120.anInt1441;
							Static49.anIntArray203[local89] += local120.anInt1440;
							local156 = Static140.anIntArray577[local89]++;
						}
					}
					local110 = local85 - 5;
					if (local110 >= 0) {
						local179 = this.aByteArrayArrayArray12[local52][local110][local89] & 0xFF;
						if (local179 > 0) {
							@Pc(189) Class58 local189 = this.aClass47_5.method946(local179 - 1);
							Static314.anIntArray1060[local89] -= local189.anInt1447;
							Static235.anIntArray815[local89] -= local189.anInt1448;
							Static83.anIntArray357[local89] -= local189.anInt1441;
							Static49.anIntArray203[local89] -= local189.anInt1440;
							local156 = Static140.anIntArray577[local89]--;
						}
					}
				}
				if (local85 >= 0) {
					local95 = 0;
					local110 = 0;
					local179 = 0;
					@Pc(246) int local246 = 0;
					@Pc(248) int local248 = 0;
					for (@Pc(250) int local250 = -5; local250 < this.anInt4594; local250++) {
						@Pc(256) int local256 = local250 + 5;
						if (this.anInt4594 > local256) {
							local110 += Static235.anIntArray815[local256];
							local246 += Static49.anIntArray203[local256];
							local95 += Static314.anIntArray1060[local256];
							local248 += Static140.anIntArray577[local256];
							local179 += Static83.anIntArray357[local256];
						}
						@Pc(298) int local298 = local250 - 5;
						if (local298 >= 0) {
							local110 -= Static235.anIntArray815[local298];
							local246 -= Static49.anIntArray203[local298];
							local95 -= Static314.anIntArray1060[local298];
							local248 -= Static140.anIntArray577[local298];
							local179 -= Static83.anIntArray357[local298];
						}
						if (local250 >= 0 && local246 > 0 && local248 > 0) {
							local42[local85][local250] = Static332.method4904(local179 / local248, local110 / local248, local95 * 256 / local246);
						}
					}
				}
			}
			if (Static92.aBoolean131) {
				this.method4057(Static350.aClass107Array4[local52], local52 == 0 ? arg0 : null, local42, arg2, local52 == 0 ? arg1 : null, local52);
			} else {
				this.method4066(Static350.aClass107Array4[local52], local52 == 0 ? arg1 : null, local52 == 0 ? arg0 : null, local42, arg2, local52);
			}
			this.aByteArrayArrayArray12[local52] = null;
			this.aByteArrayArrayArray15[local52] = null;
			this.aByteArrayArrayArray14[local52] = null;
			this.aByteArrayArrayArray13[local52] = null;
		}
		if (!this.aBoolean341) {
			if (Static174.anInt3334 != 0) {
				Static353.method5192();
			}
			if (Static196.aBoolean308) {
				Static45.method775();
			}
		}
		for (local56 = 0; local56 < this.anInt4586; local56++) {
			Static350.aClass107Array4[local56].method4684();
		}
	}
}
