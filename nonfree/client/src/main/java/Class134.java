import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public class Class134 {

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!wg;")
	private final Class246 aClass246_6;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	protected final int anInt6292;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	protected final int anInt6280;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
	public final int anInt6287;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "Z")
	public final boolean aBoolean468;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "Lclient!i;")
	private final Class108 aClass108_5;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIZLclient!wg;Lclient!i;)V")
	protected Class134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class246 arg4, @OriginalArg(5) Class108 arg5) {
		this.aClass246_6 = arg4;
		this.anInt6292 = arg1;
		this.anInt6280 = arg2;
		this.anInt6287 = arg0;
		this.aBoolean468 = arg3;
		this.aClass108_5 = arg5;
		this.anIntArrayArrayArray15 = new int[this.anInt6287][this.anInt6292 + 1][this.anInt6280 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt6287][this.anInt6292][this.anInt6280];
		this.aByteArrayArrayArray14 = new byte[this.anInt6287][this.anInt6292 + 1][this.anInt6280 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt6287][this.anInt6292][this.anInt6280];
		this.aByteArrayArrayArray18 = new byte[this.anInt6287][this.anInt6292][this.anInt6280];
		this.aByteArrayArrayArray17 = new byte[this.anInt6287][this.anInt6292][this.anInt6280];
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIB)V")
	public final void method5412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		for (@Pc(3) int local3 = arg0; local3 < arg3 + arg0; local3++) {
			for (local15 = arg1; local15 < arg1 + arg4; local15++) {
				if (local15 >= 0 && local15 < this.anInt6292 && local3 >= 0 && this.anInt6280 > local3) {
					this.anIntArrayArrayArray15[arg2][local15][local3] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray15[arg2 - 1][local15][local3] - 240;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt6292) {
			for (local15 = arg0 + 1; local15 < arg0 + arg3; local15++) {
				if (local15 >= 0 && this.anInt6280 > local15) {
					this.anIntArrayArrayArray15[arg2][arg1][local15] = this.anIntArrayArrayArray15[arg2][arg1 - 1][local15];
				}
			}
		}
		if (arg0 > 0 && this.anInt6280 > arg0) {
			for (local15 = arg1 + 1; local15 < arg4 + arg1; local15++) {
				if (local15 >= 0 && local15 < this.anInt6292) {
					this.anIntArrayArrayArray15[arg2][local15][arg0] = this.anIntArrayArrayArray15[arg2][local15][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt6292 || this.anInt6280 <= arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0] != 0) {
				this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray15[arg2 - 1][arg1 - 1][arg0] != this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0]) {
			this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray15[arg2 - 1][arg1][arg0 - 1]) {
			this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray15[arg2 - 1][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray15[arg2][arg1][arg0] = this.anIntArrayArrayArray15[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBILclient!lk;[Lclient!vk;II)V")
	public final void method5413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub13 arg2, @OriginalArg(4) Class239[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean468) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class239 local12 = arg3[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg5;
						@Pc(29) int local29 = arg0 + local18;
						if (local24 >= 0 && this.anInt6292 > local24 && local29 >= 0 && local29 < this.anInt6280) {
							local12.method5559(local24, local29);
						}
					}
				}
			}
		}
		local6 = arg1 + arg5;
		@Pc(81) int local81 = arg4 + arg0;
		for (local14 = 0; local14 < this.anInt6287; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method5420(arg5 + local18, 0, arg2, false, local18 + local6, local24 - -arg0, local14, 0, 0, local81 + local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!dh;Lclient!dh;IILclient!km;Lclient!dh;[[I)V")
	private void method5415(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class82 arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray18[arg2];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray17[arg2];
		@Pc(36) byte[][] local36 = this.aByteArrayArrayArray13[arg2];
		@Pc(41) byte[][] local41 = this.aByteArrayArrayArray15[arg2];
		for (@Pc(43) int local43 = 0; local43 < this.anInt6292; local43++) {
			@Pc(61) int local61 = this.anInt6292 - 1 > local43 ? local43 + 1 : local43;
			for (@Pc(63) int local63 = 0; local63 < this.anInt6280; local63++) {
				@Pc(77) int local77 = local63 < this.anInt6280 - 1 ? local63 + 1 : local63;
				if (Static234.anInt4284 == -1 || Static122.method2233(Static234.anInt4284, local43, arg2, local63)) {
					@Pc(91) boolean local91 = false;
					@Pc(93) boolean local93 = false;
					@Pc(96) boolean[] local96 = new boolean[4];
					@Pc(102) int local102 = local26[local43][local63];
					@Pc(108) int local108 = local31[local43][local63];
					@Pc(116) int local116 = local41[local43][local63] & 0xFF;
					@Pc(124) int local124 = local36[local43][local63] & 0xFF;
					@Pc(132) int local132 = local36[local43][local77] & 0xFF;
					@Pc(140) int local140 = local36[local61][local77] & 0xFF;
					@Pc(148) int local148 = local36[local61][local63] & 0xFF;
					if (local116 != 0 || local124 != 0) {
						@Pc(170) Class96 local170 = local116 == 0 ? null : this.aClass246_6.method5680(local116 - 1);
						if (local102 == 0 && local170 == null) {
							local102 = 12;
						}
						@Pc(196) Class167 local196 = local124 == 0 ? null : this.aClass108_5.method2466(local124 - 1);
						@Pc(198) Class96 local198 = local170;
						if (local170 != null) {
							if (local170.anInt2406 == -1 && local170.anInt2413 == -1) {
								local198 = local170;
								local170 = null;
							} else if (local196 != null && local102 != 0) {
								local93 = local170.aBoolean185;
							}
						}
						@Pc(305) int local305;
						@Pc(343) int local343;
						@Pc(388) int local388;
						@Pc(398) int local398;
						if ((local102 == 0 || local102 == 12) && local43 > 0 && local63 > 0 && local43 < this.anInt6292 && local63 < this.anInt6280) {
							@Pc(267) int local267 = local124 == local36[local61][local77] ? 1 : -1;
							@Pc(288) int local288 = local124 == local36[local61][local63 - 1] ? 1 : -1;
							local305 = local36[local43 - 1][local63 - 1] == local124 ? 1 : -1;
							if (local124 == local36[local43][local63 - 1]) {
								local288++;
								local305++;
							} else {
								local288--;
								local305--;
							}
							local343 = local36[local43 - 1][local77] == local124 ? 1 : -1;
							if (local124 == local36[local61][local63]) {
								local288++;
								local267++;
							} else {
								local267--;
								local288--;
							}
							if (local124 == local36[local43][local77]) {
								local267++;
								local343++;
							} else {
								local267--;
								local343--;
							}
							if (local36[local43 - 1][local63] == local124) {
								local343++;
								local305++;
							} else {
								local343--;
								local305--;
							}
							local388 = local305 - local267;
							if (local388 < 0) {
								local388 = -local388;
							}
							local398 = local288 - local343;
							if (local398 < 0) {
								local398 = -local398;
							}
							if (local398 == local388) {
								local388 = arg1.method4057(local43, local63) - arg1.method4057(local61, local77);
								local398 = arg1.method4057(local61, local63) - arg1.method4057(local43, local77);
								if (local388 < 0) {
									local388 = -local388;
								}
								if (local398 < 0) {
									local398 = -local398;
								}
							}
							local108 = local388 >= local398 ? 0 : 1;
						}
						for (local305 = 0; local305 < 13; local305++) {
							Static301.anIntArray660[local305] = -1;
							Static311.anIntArray673[local305] = 1;
						}
						@Pc(481) boolean[] local481 = local170 != null && local170.aBoolean185 ? Static38.aBooleanArrayArray3[local102] : Static382.aBooleanArrayArray6[local102];
						this.method5426(local31, local170, local196, local43, local41, local26, arg3, local96, this.anInt6292, local102, local108, local63, this.anInt6280);
						@Pc(516) boolean local516 = local170 != null && local170.anInt2406 != local170.anInt2413;
						if (!local516) {
							for (local343 = 0; local343 < 8; local343++) {
								if (Static301.anIntArray660[local343] >= 0 && Static269.anIntArray581[local343] != Static72.anIntArray183[local343]) {
									local516 = true;
									break;
								}
							}
						}
						if (!local481[local108 + 1 & 0x3]) {
							local96[1] = Static52.method3356(local96[1], (Static311.anIntArray673[2] & Static311.anIntArray673[4]) == 0);
						}
						if (!local481[local108 + 3 & 0x3]) {
							local96[3] = Static52.method3356(local96[3], (Static311.anIntArray673[6] & Static311.anIntArray673[0]) == 0);
						}
						if (!local481[local108 & 0x3]) {
							local96[0] = Static52.method3356(local96[0], (Static311.anIntArray673[2] & Static311.anIntArray673[0]) == 0);
						}
						if (!local481[local108 + 2 & 0x3]) {
							local96[2] = Static52.method3356(local96[2], (Static311.anIntArray673[4] & Static311.anIntArray673[6]) == 0);
						}
						if (!local93 && (local102 == 0 || local102 == 12)) {
							if (local96[0] && !local96[1] && !local96[2] && local96[3]) {
								local102 = local102 == 0 ? 13 : 14;
								local108 = 0;
								local96[0] = local96[3] = false;
							} else if (local96[0] && local96[1] && !local96[2] && !local96[3]) {
								local102 = local102 == 0 ? 13 : 14;
								local96[0] = local96[1] = false;
								local108 = 3;
							} else if (!local96[0] && local96[1] && local96[2] && !local96[3]) {
								local102 = local102 == 0 ? 13 : 14;
								local108 = 2;
								local96[1] = local96[2] = false;
							} else if (!local96[0] && !local96[1] && local96[2] && local96[3]) {
								local102 = local102 == 0 ? 13 : 14;
								local96[2] = local96[3] = false;
								local108 = 1;
							}
						}
						@Pc(825) boolean local825 = !local93 && !local96[0] && !local96[2] && !local96[1] && !local96[3];
						@Pc(827) int[] local827 = null;
						@Pc(863) int[] local863;
						@Pc(843) int[] local843;
						@Pc(847) int[] local847;
						if (local825) {
							local843 = Static387.anIntArrayArray50[local102];
							local398 = local170 == null ? 0 : Static339.anIntArray724[local102];
							local863 = Static357.anIntArrayArray7[local102];
							local388 = local196 == null ? 0 : Static358.anIntArray759[local102];
							local847 = Static160.anIntArrayArray12[local102];
						} else if (local93) {
							local398 = local170 == null ? 0 : Static332.anIntArray707[local102];
							local843 = Static281.anIntArrayArray43[local102];
							local847 = Static279.anIntArrayArray39[local102];
							local388 = local196 == null ? 0 : Static159.anIntArray328[local102];
							local827 = Static250.anIntArrayArray35[local102];
							local863 = Static164.anIntArrayArray13[local102];
						} else {
							local388 = local196 == null ? 0 : Static47.anIntArray130[local102];
							local847 = Static211.anIntArrayArray25[local102];
							local398 = local170 == null ? 0 : Static346.anIntArray731[local102];
							local827 = Static369.anIntArrayArray55[local102];
							local863 = Static326.anIntArrayArray48[local102];
							local843 = Static30.anIntArrayArray4[local102];
						}
						@Pc(929) int local929 = local398 + local388;
						if (local929 <= 0) {
							Static390.method5728(arg2, local43, local63);
						} else {
							if (local96[0]) {
								local929++;
							}
							if (local96[2]) {
								local929++;
							}
							if (local96[1]) {
								local929++;
							}
							if (local96[3]) {
								local929++;
							}
							@Pc(959) int local959 = 0;
							@Pc(961) int local961 = 0;
							@Pc(965) int local965 = local929 * 3;
							@Pc(972) int[] local972 = local516 ? new int[local965] : null;
							@Pc(975) int[] local975 = new int[local965];
							@Pc(978) int[] local978 = new int[local965];
							@Pc(981) int[] local981 = new int[local965];
							@Pc(984) int[] local984 = new int[local965];
							@Pc(987) int[] local987 = new int[local965];
							@Pc(994) int[] local994 = arg4 == null ? null : new int[local965];
							@Pc(1003) int[] local1003 = arg4 == null && arg0 == null ? null : new int[local965];
							@Pc(1005) int local1005 = -1;
							@Pc(1007) int local1007 = -1;
							@Pc(1009) int local1009 = 256;
							@Pc(1105) byte local1105;
							@Pc(1059) int local1059;
							@Pc(1061) int local1061;
							@Pc(1289) int local1289;
							@Pc(1295) int local1295;
							@Pc(1304) int local1304;
							@Pc(1308) int local1308;
							@Pc(1319) int local1319;
							@Pc(1312) int local1312;
							@Pc(1324) int local1324;
							@Pc(1381) int local1381;
							@Pc(1387) int local1387;
							if (local170 != null) {
								local1005 = local170.anInt2406;
								local1007 = arg3.method4543() ? local170.anInt2408 : local170.anInt2410;
								local1009 = local170.anInt2403;
								local1059 = Static214.method3620(local170, arg3);
								for (local1061 = 0; local1061 < local398; local1061++) {
									if (local96[-local108 & 0x3] && local827[0] == local959) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 1;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 1;
										Static143.anIntArray296[4] = local843[local959];
										local1105 = 6;
										Static143.anIntArray296[5] = local847[local959];
									} else if (local96[2 - local108 & 0x3] && local827[2] == local959) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 5;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 5;
										Static143.anIntArray296[4] = local843[local959];
										local1105 = 6;
										Static143.anIntArray296[5] = local847[local959];
									} else if (local96[1 - local108 & 0x3] && local827[1] == local959) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 3;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 3;
										Static143.anIntArray296[4] = local843[local959];
										local1105 = 6;
										Static143.anIntArray296[5] = local847[local959];
									} else if (local96[3 - local108 & 0x3] && local827[3] == local959) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 7;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 7;
										Static143.anIntArray296[4] = local843[local959];
										Static143.anIntArray296[5] = local847[local959];
										local1105 = 6;
									} else {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = local843[local959];
										Static143.anIntArray296[2] = local847[local959];
										local1105 = 3;
									}
									local959++;
									for (local1289 = 0; local1289 < local1105; local1289++) {
										local1295 = Static143.anIntArray296[local1289];
										local1304 = local1295 - local108 * 2 & 0x7;
										local1308 = Static217.anIntArray497[local1295];
										local1312 = Static5.anIntArray809[local1295];
										if (local108 == 1) {
											local1319 = local1312;
											local1324 = 128 - local1308;
										} else if (local108 == 2) {
											local1324 = 128 - local1312;
											local1319 = 128 - local1308;
										} else if (local108 == 3) {
											local1324 = local1308;
											local1319 = 128 - local1312;
										} else {
											local1324 = local1312;
											local1319 = local1308;
										}
										local975[local961] = local1319;
										local978[local961] = local1324;
										if (local994 != null && Static75.aBooleanArrayArray4[local102][local1295]) {
											local1381 = local1319 + (local43 << 7);
											local1387 = local1324 + (local63 << 7);
											local994[local961] = arg4.method4055(local1381, local1387) - arg1.method4055(local1381, local1387);
										}
										if (local1003 != null) {
											if (arg4 != null && !Static75.aBooleanArrayArray4[local102][local1295]) {
												local1381 = (local43 << 7) + local1319;
												local1387 = (local63 << 7) + local1324;
												local1003[local961] = arg1.method4055(local1381, local1387) - arg4.method4055(local1381, local1387);
											} else if (arg0 != null && !Static34.aBooleanArrayArray2[local102][local1295]) {
												local1381 = local1319 + (local43 << 7);
												local1387 = local1324 + (local63 << 7);
												local1003[local961] = arg0.method4055(local1381, local1387) - arg1.method4055(local1381, local1387);
											}
										}
										if (local1295 < 8 && local170.anInt2417 < Static301.anIntArray660[local1304]) {
											if (local972 != null) {
												local972[local961] = Static269.anIntArray581[local1304];
											}
											local987[local961] = Static159.anIntArray327[local1304];
											local984[local961] = Static349.anIntArray747[local1304];
											local981[local961] = Static72.anIntArray183[local1304];
										} else {
											if (local972 != null) {
												local972[local961] = local1059;
											}
											local984[local961] = arg3.method4543() ? local170.anInt2408 : local170.anInt2410;
											local987[local961] = local170.anInt2403;
											local981[local961] = local1005;
										}
										local961++;
									}
								}
								if (!this.aBoolean468 && arg2 == 0) {
									Static355.method5390(local43, local63, local170.anInt2405, local170.anInt2414 * 8, local170.anInt2404);
								}
								if (local102 != 12 && local170.anInt2406 != -1 && local170.aBoolean187) {
									local91 = true;
								}
							} else if (local825) {
								local959 = Static339.anIntArray724[local102];
							} else if (local93) {
								local959 = Static332.anIntArray707[local102];
							} else {
								local959 = Static346.anIntArray731[local102];
							}
							if (local196 != null) {
								if (local140 == 0) {
									local140 = local124;
								}
								if (local148 == 0) {
									local148 = local124;
								}
								if (local132 == 0) {
									local132 = local124;
								}
								@Pc(1608) Class167 local1608 = this.aClass108_5.method2466(local124 - 1);
								@Pc(1616) Class167 local1616 = this.aClass108_5.method2466(local132 - 1);
								@Pc(1624) Class167 local1624 = this.aClass108_5.method2466(local140 - 1);
								@Pc(1634) Class167 local1634 = this.aClass108_5.method2466(local148 - 1);
								for (local1304 = 0; local1304 < local388; local1304++) {
									if (local96[-local108 & 0x3] && local827[0] == local959) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 1;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 1;
										Static143.anIntArray296[4] = local843[local959];
										local1105 = 6;
										Static143.anIntArray296[5] = local847[local959];
									} else if (local96[2 - local108 & 0x3] && local827[2] == local959) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 5;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 5;
										Static143.anIntArray296[4] = local843[local959];
										local1105 = 6;
										Static143.anIntArray296[5] = local847[local959];
									} else if (local96[1 - local108 & 0x3] && local959 == local827[1]) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 3;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 3;
										Static143.anIntArray296[4] = local843[local959];
										Static143.anIntArray296[5] = local847[local959];
										local1105 = 6;
									} else if (local96[3 - local108 & 0x3] && local827[3] == local959) {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = 7;
										Static143.anIntArray296[2] = local847[local959];
										Static143.anIntArray296[3] = 7;
										Static143.anIntArray296[4] = local843[local959];
										Static143.anIntArray296[5] = local847[local959];
										local1105 = 6;
									} else {
										Static143.anIntArray296[0] = local863[local959];
										Static143.anIntArray296[1] = local843[local959];
										Static143.anIntArray296[2] = local847[local959];
										local1105 = 3;
									}
									local959++;
									for (local1308 = 0; local1308 < local1105; local1308++) {
										local1319 = Static143.anIntArray296[local1308];
										local1312 = local1319 - local108 * 2 & 0x7;
										local1324 = Static217.anIntArray497[local1319];
										local1387 = Static5.anIntArray809[local1319];
										@Pc(1903) int local1903;
										if (local108 == 1) {
											local1903 = 128 - local1324;
											local1381 = local1387;
										} else if (local108 == 2) {
											local1381 = 128 - local1324;
											local1903 = 128 - local1387;
										} else if (local108 == 3) {
											local1381 = 128 - local1387;
											local1903 = local1324;
										} else {
											local1381 = local1324;
											local1903 = local1387;
										}
										local975[local961] = local1381;
										local978[local961] = local1903;
										@Pc(1960) int local1960;
										@Pc(1966) int local1966;
										if (local994 != null && Static75.aBooleanArrayArray4[local102][local1319]) {
											local1960 = (local43 << 7) + local1381;
											local1966 = local1903 + (local63 << 7);
											local994[local961] = arg4.method4055(local1960, local1966) - arg1.method4055(local1960, local1966);
										}
										if (local1003 != null) {
											if (arg4 != null && !Static75.aBooleanArrayArray4[local102][local1319]) {
												local1960 = local1381 + (local43 << 7);
												local1966 = (local63 << 7) + local1903;
												local1003[local961] = arg1.method4055(local1960, local1966) - arg4.method4055(local1960, local1966);
											} else if (arg0 != null && !Static34.aBooleanArrayArray2[local102][local1319]) {
												local1960 = local1381 + (local43 << 7);
												local1966 = local1903 + (local63 << 7);
												local1003[local961] = arg0.method4055(local1960, local1966) - arg1.method4055(local1960, local1966);
											}
										}
										if (local1319 < 8 && Static301.anIntArray660[local1312] >= 0) {
											if (local972 != null) {
												local972[local961] = Static269.anIntArray581[local1312];
											}
											local987[local961] = Static159.anIntArray327[local1312];
											local984[local961] = Static349.anIntArray747[local1312];
											local981[local961] = Static72.anIntArray183[local1312];
										} else {
											if (local93 && Static75.aBooleanArrayArray4[local102][local1319]) {
												local984[local961] = local1007;
												local987[local961] = local1009;
												local981[local961] = local1005;
											} else if (local1381 == 0 && local1903 == 0) {
												local981[local961] = arg5[local43][local63];
												local984[local961] = local1608.anInt4514;
												local987[local961] = local1608.anInt4512;
											} else if (local1381 == 0 && local1903 == 128) {
												local981[local961] = arg5[local43][local77];
												local984[local961] = local1616.anInt4514;
												local987[local961] = local1616.anInt4512;
											} else if (local1381 == 128 && local1903 == 128) {
												local981[local961] = arg5[local61][local77];
												local984[local961] = local1624.anInt4514;
												local987[local961] = local1624.anInt4512;
											} else if (local1381 == 128 && local1903 == 0) {
												local981[local961] = arg5[local61][local63];
												local984[local961] = local1634.anInt4514;
												local987[local961] = local1634.anInt4512;
											} else {
												if (local1381 >= 64) {
													if (local1903 < 64) {
														local984[local961] = local1634.anInt4514;
														local987[local961] = local1634.anInt4512;
													} else {
														local984[local961] = local1624.anInt4514;
														local987[local961] = local1624.anInt4512;
													}
												} else if (local1903 < 64) {
													local984[local961] = local1608.anInt4514;
													local987[local961] = local1608.anInt4512;
												} else {
													local984[local961] = local1616.anInt4514;
													local987[local961] = local1616.anInt4512;
												}
												local1960 = Static1.method32(arg5[local43][local63], arg5[local61][local63], local1381 << 7 >> 7);
												local1966 = Static1.method32(arg5[local43][local77], arg5[local61][local77], local1381 << 7 >> 7);
												local981[local961] = Static1.method32(local1960, local1966, local1903 << 7 >> 7);
											}
											if (local972 != null) {
												local972[local961] = local981[local961];
											}
										}
										local961++;
									}
								}
								if (local102 != 0 && local196.aBoolean338) {
									local91 = true;
								}
							}
							local1059 = arg1.method4057(local43, local63);
							local1061 = arg1.method4057(local61, local63);
							local1289 = arg1.method4057(local61, local77);
							local1295 = arg1.method4057(local43, local77);
							if (arg2 > 0) {
								@Pc(2379) boolean local2379 = true;
								if (local124 == 0 && local102 != 0) {
									local2379 = false;
								}
								if (local116 > 0 && local198 != null && !local198.aBoolean186) {
									local2379 = false;
								}
								if (local2379 && local1061 == local1059 && local1059 == local1289 && local1295 == local1059) {
									this.aByteArrayArrayArray14[arg2][local43][local63] = (byte) (this.aByteArrayArrayArray14[arg2][local43][local63] | 0x4);
								}
							}
							local1304 = 0;
							local1308 = 0;
							local1319 = 0;
							if (this.aBoolean468) {
								local1304 = Static187.method3022(local43, local63);
								local1308 = Static104.method1847(local43, local63);
								local1319 = Static57.method4060(local43, local63);
							}
							arg1.method4064(local43, local63, local975, local994, local978, local1003, local981, local972, local984, local987, local1304, local1308, local1319, local91);
							Static390.method5728(arg2, local43, local63);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIBLclient!lk;[Lclient!vk;I)V")
	public final void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class2_Sub13 arg6, @OriginalArg(8) Class239[] arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg3 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(52) int local52;
		if (!this.aBoolean468) {
			@Pc(18) Class239 local18 = arg7[arg2];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(39) int local39 = arg8 + Static315.method4888(local20 & 0x7, arg0, local24 & 0x7);
					local52 = arg5 + Static58.method4851(arg0, local20 & 0x7, local24 & 0x7);
					if (local39 > 0 && this.anInt6292 - 1 > local39 && local52 > 0 && this.anInt6280 - 1 > local52) {
						local18.method5559(local39, local52);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg4 & 0x7) * 8;
		@Pc(104) int local104 = (arg3 & 0x1FFFFFF8) << 3;
		local20 = (arg4 & 0xFFFFFFF8) << 3;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (arg0 == 1) {
			local114 = 1;
		} else if (arg0 == 2) {
			local112 = 1;
			local114 = 1;
		} else if (arg0 == 3) {
			local112 = 1;
		}
		for (local52 = 0; local52 < this.anInt6287; local52++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
					if (local52 == arg1 && local11 <= local145 && local11 + 8 >= local145 && local149 >= local98 && local149 <= local98 + 8) {
						@Pc(204) int local204;
						@Pc(216) int local216;
						if (local145 == local11 + 8 || local149 == local98 + 8) {
							if (arg0 == 0) {
								local204 = local145 + arg8 - local11;
								local216 = local149 + arg5 - local98;
							} else if (arg0 == 1) {
								local216 = local11 + arg5 + 8 - local145;
								local204 = arg8 + local149 - local98;
							} else if (arg0 == 2) {
								local204 = local11 + arg8 + 8 - local145;
								local216 = local98 + arg5 + 8 - local149;
							} else {
								local204 = arg8 + local98 + 8 - local149;
								local216 = local145 + arg5 - local11;
							}
							this.method5420(local204, 0, arg6, true, local145 + local104, local216, arg2, 0, 0, local149 + local20);
						} else {
							local204 = Static315.method4888(local145 & 0x7, arg0, local149 & 0x7) + arg8;
							local216 = arg5 + Static58.method4851(arg0, local145 & 0x7, local149 & 0x7);
							this.method5420(local204, arg0, arg6, false, local145 + local104, local216, arg2, local114, local112, local20 + local149);
							if (local145 == 63 || local149 == 63) {
								@Pc(251) int local251 = local145 == 63 ? 64 : local145;
								@Pc(258) int local258 = local149 == 63 ? 64 : local149;
								@Pc(277) int local277;
								@Pc(287) int local287;
								if (arg0 == 0) {
									local287 = local258 + arg5 - local98;
									local277 = local251 + arg8 - local11;
								} else if (arg0 == 1) {
									local287 = local11 + arg5 + 8 - local251;
									local277 = arg8 + local258 - local98;
								} else if (arg0 == 2) {
									local277 = local11 + arg8 + 8 - local251;
									local287 = local98 + arg5 + 8 - local258;
								} else {
									local277 = local98 + arg8 + 8 - local258;
									local287 = local251 + arg5 - local11;
								}
								if (local277 >= 0 && local277 < this.anInt6292 && local287 >= 0 && this.anInt6280 > local287) {
									this.anIntArrayArrayArray15[arg2][local277][local287] = this.anIntArrayArrayArray15[arg2][local112 + local204][local216 + local114];
								}
							}
						}
					} else {
						this.method5420(-1, 0, arg6, false, 0, -1, 0, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLclient!km;[Lclient!vk;[[[I)V")
	public final void method5417(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class239[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean468) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt6292; local10++) {
					for (local14 = 0; local14 < this.anInt6280; local14++) {
						if ((Static244.aByteArrayArrayArray4[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static244.aByteArrayArrayArray4[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method5558(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt6287; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean468) {
				if (Static2.aBoolean280) {
					local10 = 2;
				}
				if (Static46.aBoolean85) {
					local14 = 8;
				}
				if (Static19.anInt458 != 0) {
					local10 |= 0x1;
					if (local6 == 0 | Static123.aBoolean184) {
						local14 |= 0x10;
					}
				}
			}
			if (Static2.aBoolean280) {
				local14 |= 0x7;
			}
			@Pc(145) int[][] local145 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray15[local6] : arg2[local6];
			Static281.method4316(local6, arg0.method4538(this.anInt6292, this.anInt6280, this.anIntArrayArrayArray15[local6], local145, local10, local14));
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([[III)V")
	public final void method5419(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray15[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6292 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt6280 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!lk;ZIIIIIII)V")
	private void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg7 = 1;
		} else if (arg1 == 2) {
			arg8 = 1;
			arg7 = 1;
		} else if (arg1 == 3) {
			arg8 = 1;
		}
		@Pc(74) int local74;
		if (arg0 < 0 || this.anInt6292 <= arg0 || arg5 < 0 || arg5 >= this.anInt6280) {
			while (true) {
				local74 = arg2.method4240();
				if (local74 == 0) {
					return;
				}
				if (local74 == 1) {
					arg2.method4240();
					return;
				}
				if (local74 <= 49) {
					arg2.method4240();
				}
			}
			return;
		}
		if (!this.aBoolean468 && !arg3) {
			Static244.aByteArrayArrayArray4[arg6][arg0][arg5] = 0;
		}
		while (true) {
			local74 = arg2.method4240();
			if (local74 == 0) {
				if (this.aBoolean468) {
					this.anIntArrayArrayArray15[0][arg8 + arg0][arg7 + arg5] = 0;
					return;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray15[0][arg8 + arg0][arg5 + arg7] = -Static184.method5421(arg4 + 932731, arg9 + 556238) * 8;
					return;
				} else {
					this.anIntArrayArrayArray15[arg6][arg0 + arg8][arg5 + arg7] = this.anIntArrayArrayArray15[arg6 - 1][arg8 + arg0][arg5 + arg7] - 240;
					return;
				}
			}
			if (local74 == 1) {
				@Pc(161) int local161 = arg2.method4240();
				if (!this.aBoolean468) {
					if (local161 == 1) {
						local161 = 0;
					}
					if (arg6 != 0) {
						this.anIntArrayArrayArray15[arg6][arg0 + arg8][arg5 + arg7] = this.anIntArrayArrayArray15[arg6 - 1][arg8 + arg0][arg7 + arg5] - local161 * 8;
						return;
					}
					this.anIntArrayArrayArray15[0][arg8 + arg0][arg7 + arg5] = -local161 * 8;
					return;
				}
				this.anIntArrayArrayArray15[0][arg8 + arg0][arg5 + arg7] = local161 * 8;
				return;
			}
			if (local74 <= 49) {
				if (arg3) {
					arg2.method4240();
				} else {
					this.aByteArrayArrayArray15[arg6][arg0][arg5] = arg2.method4217();
					this.aByteArrayArrayArray18[arg6][arg0][arg5] = (byte) ((local74 - 2) / 4);
					this.aByteArrayArrayArray17[arg6][arg0][arg5] = (byte) (arg1 + local74 - 2 & 0x3);
				}
			} else if (local74 <= 81) {
				if (!this.aBoolean468 && !arg3) {
					Static244.aByteArrayArrayArray4[arg6][arg0][arg5] = (byte) (local74 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray13[arg6][arg0][arg5] = (byte) (local74 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIBII)V")
	public final void method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6287; local7++) {
			this.method5412(arg1, arg0, local7, 64, 64);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([[ILclient!dh;ILclient!dh;Lclient!dh;ILclient!km;)V")
	private void method5423(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(6) Class82 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6292; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt6280; local11++) {
				if (Static234.anInt4284 == -1 || Static122.method2233(Static234.anInt4284, local7, arg2, local11)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray18[arg2][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray17[arg2][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray15[arg2][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray13[arg2][local7][local11] & 0xFF;
					@Pc(78) Class96 local78 = local55 == 0 ? null : this.aClass246_6.method5680(local55 - 1);
					@Pc(90) Class167 local90 = local66 == 0 ? null : this.aClass108_5.method2466(local66 - 1);
					@Pc(92) int local92 = 0;
					@Pc(94) int local94 = 0;
					if (local35 != 0) {
						local92 = local90 == null ? 0 : Static358.anIntArray759[local35];
						local94 = local78 == null ? 0 : Static339.anIntArray724[local35];
					} else if (local78 != null) {
						local94 = Static339.anIntArray724[local35];
					} else if (local90 != null) {
						local92 = Static339.anIntArray724[local35];
					}
					@Pc(132) int local132 = local92 + local94;
					@Pc(134) int local134 = 0;
					if (local132 != 0) {
						@Pc(142) int[] local142 = new int[local132];
						@Pc(145) int[] local145 = new int[local132];
						@Pc(148) int[] local148 = new int[local132];
						@Pc(151) int[] local151 = new int[local132];
						@Pc(153) boolean local153 = false;
						@Pc(170) int local170;
						@Pc(202) int local202;
						if (local78 == null || local78.anInt2406 == -1 && local78.anInt2413 == -1 && local78.anInt2408 == -1) {
							for (local170 = 0; local170 < local94; local170++) {
								local142[local134] = -1;
								local134++;
							}
						} else {
							local170 = arg5.method4543() ? local78.anInt2408 : local78.anInt2410;
							if (Static283.aBoolean360) {
								local170 = -1;
							}
							for (local202 = 0; local202 < local94; local202++) {
								local148[local134] = local170;
								local151[local134] = local78.anInt2403;
								if (local78.anInt2406 == -1) {
									local142[local134] = -1;
								} else {
									local142[local134] = local78.anInt2406;
								}
								if (local78.anInt2413 == -1) {
									local145[local134] = -1;
								} else {
									local145[local134] = local78.anInt2413;
									local153 = true;
								}
								local134++;
							}
							if (!this.aBoolean468 && arg2 == 0) {
								Static355.method5390(local7, local11, local78.anInt2405, local78.anInt2414 * 8, local78.anInt2404);
							}
						}
						if (!local153) {
							local145 = null;
						}
						if (local90 == null) {
							for (local170 = 0; local170 < local92; local170++) {
								local142[local134] = -1;
								local134++;
							}
						} else {
							local170 = local90.anInt4514;
							if (Static283.aBoolean360) {
								local170 = -1;
							}
							for (local202 = 0; local202 < local92; local202++) {
								local148[local134] = local170;
								local151[local134] = local90.anInt4512;
								local142[local134] = arg0[local7][local11];
								if (local145 != null) {
									local145[local134] = -1;
								}
								local134++;
							}
						}
						local170 = Static217.anIntArray497.length;
						@Pc(344) int[] local344 = new int[local170];
						@Pc(347) int[] local347 = new int[local170];
						@Pc(354) int[] local354 = arg4 == null ? null : new int[local170];
						@Pc(363) int[] local363 = arg4 == null && arg1 == null ? null : new int[local170];
						@Pc(371) int local371;
						@Pc(375) int local375;
						@Pc(457) int local457;
						@Pc(463) int local463;
						for (@Pc(365) int local365 = 0; local365 < local170; local365++) {
							local371 = Static217.anIntArray497[local365];
							local375 = Static5.anIntArray809[local365];
							if (local44 == 0) {
								local344[local365] = local371;
								local347[local365] = local375;
							} else if (local44 == 1) {
								local344[local365] = local375;
								local347[local365] = 128 - local371;
							} else if (local44 == 2) {
								local344[local365] = 128 - local371;
								local347[local365] = 128 - local375;
							} else if (local44 == 3) {
								local344[local365] = 128 - local375;
								local347[local365] = local371;
							}
							if (local354 != null && Static75.aBooleanArrayArray4[local35][local365]) {
								local457 = (local7 << 7) + local371;
								local463 = local371 + (local11 << 7);
								local354[local365] = arg4.method4055(local457, local463) - arg3.method4055(local457, local463);
							}
							if (local363 != null) {
								if (arg4 != null && !Static75.aBooleanArrayArray4[local35][local365]) {
									local457 = local371 + (local7 << 7);
									local463 = local371 + (local11 << 7);
									local363[local365] = arg3.method4055(local457, local463) - arg4.method4055(local457, local463);
								} else if (arg1 != null && !Static34.aBooleanArrayArray2[local35][local365]) {
									local457 = local371 + (local7 << 7);
									local463 = (local11 << 7) + local371;
									local363[local365] = arg1.method4055(local457, local463) - arg3.method4055(local457, local463);
								}
							}
						}
						local371 = arg3.method4057(local7, local11);
						local375 = arg3.method4057(local7 + 1, local11);
						local457 = arg3.method4057(local7 + 1, local11 + 1);
						local463 = arg3.method4057(local7, local11 + 1);
						if (arg2 > 0) {
							@Pc(588) boolean local588 = true;
							if (local66 == 0 && local35 != 0) {
								local588 = false;
							}
							if (local55 > 0 && local78 != null && !local78.aBoolean186) {
								local588 = false;
							}
							if (local588 && local371 == local375 && local371 == local457 && local371 == local463) {
								this.aByteArrayArrayArray14[arg2][local7][local11] = (byte) (this.aByteArrayArrayArray14[arg2][local7][local11] | 0x4);
							}
						}
						@Pc(646) int local646 = 0;
						@Pc(648) int local648 = 0;
						@Pc(650) int local650 = 0;
						if (this.aBoolean468) {
							local646 = Static187.method3022(local7, local11);
							local648 = Static104.method1847(local7, local11);
							local650 = Static57.method4060(local7, local11);
						}
						arg3.method4065(local7, local11, local344, local354, local347, local363, Static357.anIntArrayArray7[local35], Static387.anIntArrayArray50[local35], Static160.anIntArrayArray12[local35], local142, local145, local148, local151, local646, local648, local650);
						Static390.method5728(arg2, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I[[BLclient!hc;Lclient!oc;I[[B[[BLclient!km;[ZIIIII)V")
	private void method5426(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class96 arg1, @OriginalArg(3) Class167 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) Class82 arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(57) int local57;
		if (arg1 != null && arg2 != null || arg2 != null && arg9 == 12 || arg1 != null && arg9 == 0) {
			@Pc(41) boolean[] local41 = arg1 != null && arg1.aBoolean185 ? Static38.aBooleanArrayArray3[arg9] : Static382.aBooleanArrayArray6[arg9];
			@Pc(67) Class96 local67;
			@Pc(85) byte local85;
			@Pc(101) int local101;
			@Pc(106) int local106;
			if (arg11 > 0) {
				if (arg3 > 0) {
					local57 = arg4[arg3 - 1][arg11 - 1] & 0xFF;
					if (local57 > 0) {
						local67 = this.aClass246_6.method5680(local57 - 1);
						if (local67.anInt2406 != -1 && local67.aBoolean185) {
							local85 = arg5[arg3 - 1][arg11 - 1];
							local101 = arg0[arg3 - 1][arg11 - 1] * 2 + 4 & 0x7;
							local106 = Static214.method3620(local67, arg6);
							if (Static75.aBooleanArrayArray4[local85][local101]) {
								Static72.anIntArray183[0] = local67.anInt2406;
								Static269.anIntArray581[0] = local106;
								Static349.anIntArray747[0] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
								Static159.anIntArray327[0] = local67.anInt2403;
								Static301.anIntArray660[0] = local67.anInt2417;
								Static311.anIntArray673[0] = 256;
							}
						}
					}
				}
				if (arg3 < arg8 - 1) {
					local57 = arg4[arg3 + 1][arg11 - 1] & 0xFF;
					if (local57 > 0) {
						local67 = this.aClass246_6.method5680(local57 - 1);
						if (local67.anInt2406 != -1 && local67.aBoolean185) {
							local85 = arg5[arg3 + 1][arg11 - 1];
							local101 = arg0[arg3 + 1][arg11 - 1] * 2 + 6 & 0x7;
							local106 = Static214.method3620(local67, arg6);
							if (Static75.aBooleanArrayArray4[local85][local101]) {
								Static72.anIntArray183[2] = local67.anInt2406;
								Static269.anIntArray581[2] = local106;
								Static349.anIntArray747[2] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
								Static159.anIntArray327[2] = local67.anInt2403;
								Static301.anIntArray660[2] = local67.anInt2417;
								Static311.anIntArray673[2] = 512;
							}
						}
					}
				}
			}
			if (arg12 - 1 > arg11) {
				if (arg3 > 0) {
					local57 = arg4[arg3 - 1][arg11 + 1] & 0xFF;
					if (local57 > 0) {
						local67 = this.aClass246_6.method5680(local57 - 1);
						if (local67.anInt2406 != -1 && local67.aBoolean185) {
							local85 = arg5[arg3 - 1][arg11 + 1];
							local101 = arg0[arg3 - 1][arg11 + 1] * 2 + 2 & 0x7;
							local106 = Static214.method3620(local67, arg6);
							if (Static75.aBooleanArrayArray4[local85][local101]) {
								Static72.anIntArray183[6] = local67.anInt2406;
								Static269.anIntArray581[6] = local106;
								Static349.anIntArray747[6] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
								Static159.anIntArray327[6] = local67.anInt2403;
								Static301.anIntArray660[6] = local67.anInt2417;
								Static311.anIntArray673[6] = 64;
							}
						}
					}
				}
				if (arg8 - 1 > arg3) {
					local57 = arg4[arg3 + 1][arg11 + 1] & 0xFF;
					if (local57 > 0) {
						local67 = this.aClass246_6.method5680(local57 - 1);
						if (local67.anInt2406 != -1 && local67.aBoolean185) {
							local85 = arg5[arg3 + 1][arg11 + 1];
							local101 = arg0[arg3 + 1][arg11 + 1] * 2 & 0x7;
							local106 = Static214.method3620(local67, arg6);
							if (Static75.aBooleanArrayArray4[local85][local101]) {
								Static72.anIntArray183[4] = local67.anInt2406;
								Static269.anIntArray581[4] = local106;
								Static349.anIntArray747[4] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
								Static159.anIntArray327[4] = local67.anInt2403;
								Static301.anIntArray660[4] = local67.anInt2417;
								Static311.anIntArray673[4] = 128;
							}
						}
					}
				}
			}
			@Pc(558) int local558;
			@Pc(563) int local563;
			@Pc(565) int local565;
			@Pc(527) byte local527;
			if (arg11 > 0) {
				local57 = arg4[arg3][arg11 - 1] & 0xFF;
				if (local57 > 0) {
					local67 = this.aClass246_6.method5680(local57 - 1);
					if (local67.anInt2406 != -1) {
						local85 = arg5[arg3][arg11 - 1];
						local527 = arg0[arg3][arg11 - 1];
						if (local67.aBoolean185) {
							local106 = 2;
							local558 = local527 * 2 + 4;
							local563 = Static214.method3620(local67, arg6);
							for (local565 = 0; local565 < 3; local565++) {
								local558 &= 0x7;
								local106 &= 0x7;
								if (Static75.aBooleanArrayArray4[local85][local558] && Static301.anIntArray660[local106] <= local67.anInt2417) {
									Static72.anIntArray183[local106] = local67.anInt2406;
									Static269.anIntArray581[local106] = local563;
									Static349.anIntArray747[local106] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
									Static159.anIntArray327[local106] = local67.anInt2403;
									if (local67.anInt2417 == Static301.anIntArray660[local106]) {
										Static311.anIntArray673[local106] |= 0x20;
									} else {
										Static311.anIntArray673[local106] = 32;
									}
									Static301.anIntArray660[local106] = local67.anInt2417;
								}
								local558++;
								local106--;
							}
							if (!local41[arg10 & 0x3]) {
								arg7[0] = Static38.aBooleanArrayArray3[local85][local527 + 2 & 0x3];
							}
						} else if (!local41[arg10 & 0x3]) {
							arg7[0] = Static382.aBooleanArrayArray6[local85][local527 + 2 & 0x3];
						}
					}
				}
			}
			if (arg11 < arg12 - 1) {
				local57 = arg4[arg3][arg11 + 1] & 0xFF;
				if (local57 > 0) {
					local67 = this.aClass246_6.method5680(local57 - 1);
					if (local67.anInt2406 != -1) {
						local85 = arg5[arg3][arg11 + 1];
						local527 = arg0[arg3][arg11 + 1];
						if (local67.aBoolean185) {
							local106 = 4;
							local558 = local527 * 2 + 2;
							local563 = Static214.method3620(local67, arg6);
							for (local565 = 0; local565 < 3; local565++) {
								local106 &= 0x7;
								local558 &= 0x7;
								if (Static75.aBooleanArrayArray4[local85][local558] && Static301.anIntArray660[local106] <= local67.anInt2417) {
									Static72.anIntArray183[local106] = local67.anInt2406;
									Static269.anIntArray581[local106] = local563;
									Static349.anIntArray747[local106] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
									Static159.anIntArray327[local106] = local67.anInt2403;
									if (local67.anInt2417 == Static301.anIntArray660[local106]) {
										Static311.anIntArray673[local106] |= 0x10;
									} else {
										Static311.anIntArray673[local106] = 16;
									}
									Static301.anIntArray660[local106] = local67.anInt2417;
								}
								local106++;
								local558--;
							}
							if (!local41[arg10 + 2 & 0x3]) {
								arg7[2] = Static38.aBooleanArrayArray3[local85][--local527 & 0x3];
							}
						} else if (!local41[arg10 + 2 & 0x3]) {
							arg7[2] = Static382.aBooleanArrayArray6[local85][--local527 & 0x3];
						}
					}
				}
			}
			if (arg3 > 0) {
				local57 = arg4[arg3 - 1][arg11] & 0xFF;
				if (local57 > 0) {
					local67 = this.aClass246_6.method5680(local57 - 1);
					if (local67.anInt2406 != -1) {
						local85 = arg5[arg3 - 1][arg11];
						local527 = arg0[arg3 - 1][arg11];
						if (local67.aBoolean185) {
							local106 = 6;
							local558 = local527 * 2 + 4;
							local563 = Static214.method3620(local67, arg6);
							for (local565 = 0; local565 < 3; local565++) {
								local558 &= 0x7;
								local106 &= 0x7;
								if (Static75.aBooleanArrayArray4[local85][local558] && local67.anInt2417 >= Static301.anIntArray660[local106]) {
									Static72.anIntArray183[local106] = local67.anInt2406;
									Static269.anIntArray581[local106] = local563;
									Static349.anIntArray747[local106] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
									Static159.anIntArray327[local106] = local67.anInt2403;
									if (local67.anInt2417 == Static301.anIntArray660[local106]) {
										Static311.anIntArray673[local106] |= 0x8;
									} else {
										Static311.anIntArray673[local106] = 8;
									}
									Static301.anIntArray660[local106] = local67.anInt2417;
								}
								local558--;
								local106++;
							}
							if (!local41[arg10 + 3 & 0x3]) {
								arg7[3] = Static38.aBooleanArrayArray3[local85][local527 + 1 & 0x3];
							}
						} else if (!local41[arg10 + 3 & 0x3]) {
							arg7[3] = Static382.aBooleanArrayArray6[local85][local527 + 1 & 0x3];
						}
					}
				}
			}
			if (arg3 < arg8 - 1) {
				local57 = arg4[arg3 + 1][arg11] & 0xFF;
				if (local57 > 0) {
					local67 = this.aClass246_6.method5680(local57 - 1);
					if (local67.anInt2406 != -1) {
						local85 = arg5[arg3 + 1][arg11];
						local527 = arg0[arg3 + 1][arg11];
						if (local67.aBoolean185) {
							local106 = 4;
							local558 = local527 * 2 + 6;
							local563 = Static214.method3620(local67, arg6);
							for (local565 = 0; local565 < 3; local565++) {
								local106 &= 0x7;
								local558 &= 0x7;
								if (Static75.aBooleanArrayArray4[local85][local558] && Static301.anIntArray660[local106] <= local67.anInt2417) {
									Static72.anIntArray183[local106] = local67.anInt2406;
									Static269.anIntArray581[local106] = local563;
									Static349.anIntArray747[local106] = arg6.method4543() ? local67.anInt2408 : local67.anInt2410;
									Static159.anIntArray327[local106] = local67.anInt2403;
									if (local67.anInt2417 == Static301.anIntArray660[local106]) {
										Static311.anIntArray673[local106] |= 0x4;
									} else {
										Static311.anIntArray673[local106] = 4;
									}
									Static301.anIntArray660[local106] = local67.anInt2417;
								}
								local558++;
								local106--;
							}
							if (!local41[arg10 + 1 & 0x3]) {
								arg7[1] = Static38.aBooleanArrayArray3[local85][local527 + 3 & 0x3];
							}
						} else if (!local41[arg10 + 1 & 0x3]) {
							arg7[1] = Static382.aBooleanArrayArray6[local85][local527 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg1 == null) {
			return;
		}
		@Pc(1235) int local1235 = Static214.method3620(arg1, arg6);
		if (!arg1.aBoolean185) {
			return;
		}
		for (local57 = 0; local57 < 8; local57++) {
			@Pc(1251) int local1251 = local57 - arg10 * 2 & 0x7;
			if (Static75.aBooleanArrayArray4[arg9][local57] && Static301.anIntArray660[local1251] <= arg1.anInt2417) {
				Static72.anIntArray183[local1251] = arg1.anInt2406;
				Static269.anIntArray581[local1251] = local1235;
				Static349.anIntArray747[local1251] = arg6.method4543() ? arg1.anInt2408 : arg1.anInt2410;
				Static159.anIntArray327[local1251] = arg1.anInt2403;
				if (arg1.anInt2417 == Static301.anIntArray660[local1251]) {
					Static311.anIntArray673[local1251] |= 0x2;
				} else {
					Static311.anIntArray673[local1251] = 2;
				}
				Static301.anIntArray660[local1251] = arg1.anInt2417;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!km;ILclient!dh;Lclient!dh;)V")
	public final void method5427(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt6292][this.anInt6280];
		if (Static275.anIntArray603 == null || Static275.anIntArray603.length != this.anInt6280) {
			Static275.anIntArray603 = new int[this.anInt6280];
			Static222.anIntArray502 = new int[this.anInt6280];
			Static366.anIntArray778 = new int[this.anInt6280];
			Static193.anIntArray807 = new int[this.anInt6280];
			Static344.anIntArray764 = new int[this.anInt6280];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt6287; local40++) {
			for (local44 = 0; local44 < this.anInt6280; local44++) {
				Static275.anIntArray603[local44] = 0;
				Static344.anIntArray764[local44] = 0;
				Static222.anIntArray502[local44] = 0;
				Static193.anIntArray807[local44] = 0;
				Static366.anIntArray778[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt6292; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(174) int local174;
				for (@Pc(81) int local81 = 0; local81 < this.anInt6280; local81++) {
					local87 = local77 + 5;
					@Pc(154) int local154;
					if (local87 < this.anInt6292) {
						local106 = this.aByteArrayArrayArray13[local40][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(118) Class167 local118 = this.aClass108_5.method2466(local106 - 1);
							Static275.anIntArray603[local81] += local118.anInt4511;
							Static344.anIntArray764[local81] += local118.anInt4513;
							Static222.anIntArray502[local81] += local118.anInt4507;
							Static193.anIntArray807[local81] += local118.anInt4506;
							local154 = Static366.anIntArray778[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local174 = this.aByteArrayArrayArray13[local40][local106][local81] & 0xFF;
						if (local174 > 0) {
							@Pc(184) Class167 local184 = this.aClass108_5.method2466(local174 - 1);
							Static275.anIntArray603[local81] -= local184.anInt4511;
							Static344.anIntArray764[local81] -= local184.anInt4513;
							Static222.anIntArray502[local81] -= local184.anInt4507;
							Static193.anIntArray807[local81] -= local184.anInt4506;
							local154 = Static366.anIntArray778[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local174 = 0;
					@Pc(238) int local238 = 0;
					@Pc(240) int local240 = 0;
					for (@Pc(242) int local242 = -5; local242 < this.anInt6280; local242++) {
						@Pc(248) int local248 = local242 + 5;
						if (this.anInt6280 > local248) {
							local174 += Static222.anIntArray502[local248];
							local106 += Static344.anIntArray764[local248];
							local238 += Static193.anIntArray807[local248];
							local87 += Static275.anIntArray603[local248];
							local240 += Static366.anIntArray778[local248];
						}
						@Pc(286) int local286 = local242 - 5;
						if (local286 >= 0) {
							local174 -= Static222.anIntArray502[local286];
							local240 -= Static366.anIntArray778[local286];
							local106 -= Static344.anIntArray764[local286];
							local238 -= Static193.anIntArray807[local286];
							local87 -= Static275.anIntArray603[local286];
						}
						if (local242 >= 0 && local238 > 0 && local240 > 0) {
							local11[local77][local242] = Static138.method2405(local106 / local240, local87 * 256 / local238, local174 / local240);
						}
					}
				}
			}
			if (Static369.aBoolean478) {
				this.method5415(local40 == 0 ? arg2 : null, Static17.aClass33Array1[local40], local40, arg0, local40 == 0 ? arg1 : null, local11);
			} else {
				this.method5423(local11, local40 == 0 ? arg2 : null, local40, Static17.aClass33Array1[local40], local40 == 0 ? arg1 : null, arg0);
			}
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray15[local40] = null;
			this.aByteArrayArrayArray18[local40] = null;
			this.aByteArrayArrayArray17[local40] = null;
		}
		if (!this.aBoolean468) {
			if (Static19.anInt458 != 0) {
				Static347.method5293();
			}
			if (Static2.aBoolean280) {
				Static256.method4023();
			}
		}
		for (local44 = 0; local44 < this.anInt6287; local44++) {
			Static17.aClass33Array1[local44].method4063();
		}
	}
}
