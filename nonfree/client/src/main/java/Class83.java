import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public class Class83 {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!eaa", name = "B", descriptor = "[I")
	private final int[] anIntArray570 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "[I")
	private final int[] anIntArray569 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
	protected final int anInt9096;

	@OriginalMember(owner = "client!eaa", name = "r", descriptor = "Z")
	public final boolean aBoolean675;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lclient!pg;")
	private final Class263 aClass263_5;

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
	protected final int anInt9098;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
	public final int anInt9095;

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "Lclient!bj;")
	private final Class32 aClass32_6;

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!eaa", name = "v", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray36;

	@OriginalMember(owner = "client!eaa", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(IIIZLclient!bj;Lclient!pg;)V")
	protected Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class32 arg4, @OriginalArg(5) Class263 arg5) {
		this.anInt9096 = arg2;
		this.aBoolean675 = arg3;
		this.aClass263_5 = arg5;
		this.anInt9098 = arg1;
		this.anInt9095 = arg0;
		this.aClass32_6 = arg4;
		this.aByteArrayArrayArray16 = new byte[this.anInt9095][this.anInt9098][this.anInt9096];
		this.aByteArrayArrayArray15 = new byte[this.anInt9095][this.anInt9098][this.anInt9096];
		this.aByteArrayArrayArray12 = new byte[this.anInt9095][this.anInt9098][this.anInt9096];
		this.anIntArrayArrayArray36 = new int[this.anInt9095][this.anInt9098 + 1][this.anInt9096 + 1];
		this.aByteArrayArrayArray17 = new byte[this.anInt9095][this.anInt9098][this.anInt9096];
		this.aByteArrayArrayArray14 = new byte[this.anInt9095][this.anInt9098 + 1][this.anInt9096 + 1];
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIII)V")
	public final void method7797(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt9095; local13++) {
			this.method7809(arg1, 64, 64, arg0, local13);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!dc;IIB[Lclient!nfa;IIIII)V")
	public final void method7798(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class237[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(26) int local26 = (arg5 & 0x7) * 8;
		@Pc(35) int local35;
		@Pc(66) int local66;
		if (!this.aBoolean675) {
			@Pc(33) Class237 local33 = arg3[arg8];
			for (local35 = 0; local35 < 8; local35++) {
				for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
					@Pc(53) int local53 = arg4 + Static267.method4470(local39 & 0x7, arg2, local35 & 0x7);
					local66 = arg7 + Static267.method4467(arg2, local35 & 0x7, local39 & 0x7);
					if (local53 > 0 && local53 < this.anInt9098 - 1 && local66 > 0 && local66 < this.anInt9096 - 1) {
						local33.method5912(local66, local53);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg1 & 0x1FFFFFF8) << 3;
		local35 = (arg5 & 0x1FFFFFF8) << 3;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (arg2 == 1) {
			local111 = 1;
		} else if (arg2 == 2) {
			local111 = 1;
			local109 = 1;
		} else if (arg2 == 3) {
			local109 = 1;
		}
		for (local66 = 0; local66 < this.anInt9095; local66++) {
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
					if (arg6 == local66 && local11 <= local142 && local142 <= local11 + 8 && local146 >= local26 && local146 <= local26 + 8) {
						@Pc(232) int local232;
						@Pc(224) int local224;
						if (local11 + 8 == local142 || local146 == local26 + 8) {
							if (arg2 == 0) {
								local232 = local142 + arg4 - local11;
								local224 = arg7 + local146 - local26;
							} else if (arg2 == 1) {
								local224 = arg7 + local11 + 8 - local142;
								local232 = arg4 + local146 - local26;
							} else if (arg2 == 2) {
								local224 = arg7 + local26 + 8 - local146;
								local232 = arg4 + local11 + 8 - local142;
							} else {
								local224 = arg7 + local142 - local11;
								local232 = local26 + arg4 + 8 - local146;
							}
							this.method7800(local101 + local142, local35 + local146, arg0, 0, local224, 0, 0, arg8, local232, true);
						} else {
							local232 = Static267.method4470(local146 & 0x7, arg2, local142 & 0x7) + arg4;
							local224 = arg7 + Static267.method4467(arg2, local142 & 0x7, local146 & 0x7);
							this.method7800(local101 + local142, local35 - -local146, arg0, local111, local224, arg2, local109, arg8, local232, false);
						}
						if (local142 == 63 || local146 == 63) {
							@Pc(356) byte local356 = 1;
							if (local142 == 63 && local146 == 63) {
								local356 = 3;
							}
							for (@Pc(368) int local368 = 0; local368 < local356; local368++) {
								@Pc(372) int local372 = local142;
								@Pc(374) int local374 = local146;
								if (local368 == 0) {
									local374 = local146 == 63 ? 64 : local146;
									local372 = local142 == 63 ? 64 : local142;
								} else if (local368 == 1) {
									local372 = 64;
								} else if (local368 == 2) {
									local374 = 64;
								}
								@Pc(418) int local418;
								@Pc(424) int local424;
								if (arg2 == 0) {
									local418 = local372 + arg4 - local11;
									local424 = arg7 + local374 - local26;
								} else if (arg2 == 1) {
									local418 = local374 + arg4 - local26;
									local424 = arg7 + local11 + 8 - local372;
								} else if (arg2 == 2) {
									local418 = arg4 + local11 + 8 - local372;
									local424 = arg7 + local26 + 8 - local374;
								} else {
									local418 = arg4 + local26 + 8 - local374;
									local424 = local372 + arg7 - local11;
								}
								if (local418 >= 0 && this.anInt9098 > local418 && local424 >= 0 && this.anInt9096 > local424) {
									this.anIntArrayArrayArray36[arg8][local418][local424] = this.anIntArrayArrayArray36[arg8][local109 + local232][local111 + local224];
								}
							}
						}
					} else {
						this.method7800(0, 0, arg0, 0, -1, 0, 0, 0, -1, false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!s;ILclient!s;Lclient!s;Lclient!ha;[[II)V")
	private void method7799(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray16[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray17[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt9098; local27++) {
			@Pc(41) int local41 = local27 >= this.anInt9098 - 1 ? local27 : local27 + 1;
			for (@Pc(43) int local43 = 0; local43 < this.anInt9096; local43++) {
				@Pc(57) int local57 = local43 < this.anInt9096 - 1 ? local43 + 1 : local43;
				if (Static416.anInt7323 == -1 || Static168.method2814(local43, arg1, Static416.anInt7323, local27)) {
					@Pc(72) boolean local72 = false;
					@Pc(74) boolean local74 = false;
					@Pc(77) boolean[] local77 = new boolean[4];
					@Pc(83) int local83 = local10[local27][local43];
					@Pc(89) int local89 = local15[local27][local43];
					@Pc(97) int local97 = local25[local27][local43] & 0xFF;
					@Pc(105) int local105 = local20[local27][local43] & 0xFF;
					@Pc(113) int local113 = local20[local27][local57] & 0xFF;
					@Pc(121) int local121 = local20[local41][local57] & 0xFF;
					@Pc(129) int local129 = local20[local41][local43] & 0xFF;
					if (local97 != 0 || local105 != 0) {
						@Pc(154) Class27 local154 = local97 == 0 ? null : this.aClass32_6.method747(local97 - 1);
						@Pc(166) Class295 local166 = local105 == 0 ? null : this.aClass263_5.method6567(local105 - 1);
						if (local83 == 0 && local154 == null) {
							local83 = 12;
						}
						@Pc(174) Class27 local174 = local154;
						if (local154 != null) {
							if (local154.anInt542 == -1 && local154.anInt541 == -1) {
								local174 = local154;
								local154 = null;
							} else if (local166 != null && local83 != 0) {
								local74 = local154.aBoolean28;
							}
						}
						@Pc(248) int local248;
						@Pc(301) int local301;
						@Pc(373) int local373;
						@Pc(383) int local383;
						if ((local83 == 0 || local83 == 12) && local27 > 0 && local43 > 0 && local27 < this.anInt9098 && local43 < this.anInt9096) {
							local248 = local20[local27 - 1][local43 - 1] == local105 ? 1 : -1;
							@Pc(263) int local263 = local105 == local20[local41][local43 - 1] ? 1 : -1;
							@Pc(282) int local282 = local105 == local20[local41][local57] ? 1 : -1;
							local301 = local20[local27 - 1][local57] == local105 ? 1 : -1;
							if (local105 == local20[local27][local43 - 1]) {
								local263++;
								local248++;
							} else {
								local263--;
								local248--;
							}
							if (local105 == local20[local41][local43]) {
								local282++;
								local263++;
							} else {
								local263--;
								local282--;
							}
							if (local105 == local20[local27][local57]) {
								local301++;
								local282++;
							} else {
								local282--;
								local301--;
							}
							if (local20[local27 - 1][local43] == local105) {
								local248++;
								local301++;
							} else {
								local301--;
								local248--;
							}
							local373 = local248 - local282;
							if (local373 < 0) {
								local373 = -local373;
							}
							local383 = local263 - local301;
							if (local383 < 0) {
								local383 = -local383;
							}
							if (local383 == local373) {
								local373 = arg3.method7724(local43, local27) - arg3.method7724(local57, local41);
								if (local373 < 0) {
									local373 = -local373;
								}
								local383 = arg3.method7724(local43, local41) - arg3.method7724(local57, local27);
								if (local383 < 0) {
									local383 = -local383;
								}
							}
							local89 = local383 > local373 ? 1 : 0;
						}
						for (local248 = 0; local248 < 13; local248++) {
							Static217.anIntArray242[local248] = -1;
							Static406.anIntArray429[local248] = 1;
						}
						@Pc(470) boolean[] local470 = local154 != null && local154.aBoolean28 ? Static480.aBooleanArrayArray5[local83] : Static555.aBooleanArrayArray6[local83];
						this.method7802(local166, local77, local83, local10, local25, arg4, this.anInt9096, this.anInt9098, local89, local15, local43, local27, local154);
						@Pc(503) boolean local503 = local154 != null && local154.anInt542 != local154.anInt541;
						if (!local503) {
							for (local301 = 0; local301 < 8; local301++) {
								if (Static217.anIntArray242[local301] >= 0 && Static102.anIntArray134[local301] != Static532.anIntArray562[local301]) {
									local503 = true;
									break;
								}
							}
						}
						if (!local470[local89 + 1 & 0x3]) {
							local77[1] = Static539.method7786(local77[1], (Static406.anIntArray429[4] & Static406.anIntArray429[2]) == 0);
						}
						if (!local470[local89 + 3 & 0x3]) {
							local77[3] = Static539.method7786(local77[3], (Static406.anIntArray429[6] & Static406.anIntArray429[0]) == 0);
						}
						if (!local470[local89 & 0x3]) {
							local77[0] = Static539.method7786(local77[0], (Static406.anIntArray429[0] & Static406.anIntArray429[2]) == 0);
						}
						if (!local470[local89 + 2 & 0x3]) {
							local77[2] = Static539.method7786(local77[2], (Static406.anIntArray429[6] & Static406.anIntArray429[4]) == 0);
						}
						if (!local74 && (local83 == 0 || local83 == 12)) {
							if (local77[0] && !local77[1] && !local77[2] && local77[3]) {
								local89 = 0;
								local77[0] = local77[3] = false;
								local83 = local83 == 0 ? 13 : 14;
							} else if (local77[0] && local77[1] && !local77[2] && !local77[3]) {
								local89 = 3;
								local83 = local83 == 0 ? 13 : 14;
								local77[0] = local77[1] = false;
							} else if (!local77[0] && local77[1] && local77[2] && !local77[3]) {
								local77[1] = local77[2] = false;
								local83 = local83 == 0 ? 13 : 14;
								local89 = 2;
							} else if (!local77[0] && !local77[1] && local77[2] && local77[3]) {
								local83 = local83 == 0 ? 13 : 14;
								local77[2] = local77[3] = false;
								local89 = 1;
							}
						}
						@Pc(811) boolean local811 = !local74 && !local77[0] && !local77[2] && !local77[1] && !local77[3];
						@Pc(813) int[] local813 = null;
						@Pc(821) int[] local821;
						@Pc(833) int[] local833;
						@Pc(841) int[] local841;
						if (local811) {
							local841 = Static409.anIntArrayArray35[local83];
							local833 = Static45.anIntArrayArray3[local83];
							local383 = local154 == null ? 0 : Static614.anIntArray634[local83];
							local821 = Static144.anIntArrayArray15[local83];
							local373 = local166 == null ? 0 : Static269.anIntArray290[local83];
						} else if (local74) {
							local821 = Static620.anIntArrayArray58[local83];
							local373 = local166 == null ? 0 : Static26.anIntArray32[local83];
							local833 = Static475.anIntArrayArray49[local83];
							local813 = Static61.anIntArrayArray4[local83];
							local841 = Static101.anIntArrayArray6[local83];
							local383 = local154 == null ? 0 : Static85.anIntArray115[local83];
						} else {
							local813 = Static367.anIntArrayArray32[local83];
							local833 = Static639.anIntArrayArray61[local83];
							local841 = Static173.anIntArrayArray18[local83];
							local373 = local166 == null ? 0 : Static466.anIntArray487[local83];
							local383 = local154 == null ? 0 : Static50.anIntArray61[local83];
							local821 = Static153.anIntArrayArray16[local83];
						}
						@Pc(915) int local915 = local383 + local373;
						if (local915 <= 0) {
							Static456.method6762(arg1, local27, local43);
						} else {
							if (local77[0]) {
								local915++;
							}
							if (local77[2]) {
								local915++;
							}
							if (local77[1]) {
								local915++;
							}
							if (local77[3]) {
								local915++;
							}
							@Pc(948) int local948 = 0;
							@Pc(950) int local950 = 0;
							@Pc(954) int local954 = local915 * 3;
							@Pc(961) int[] local961 = local503 ? new int[local954] : null;
							@Pc(964) int[] local964 = new int[local954];
							@Pc(967) int[] local967 = new int[local954];
							@Pc(970) int[] local970 = new int[local954];
							@Pc(973) int[] local973 = new int[local954];
							@Pc(976) int[] local976 = new int[local954];
							@Pc(983) int[] local983 = arg2 == null ? null : new int[local954];
							@Pc(992) int[] local992 = arg2 == null && arg0 == null ? null : new int[local954];
							@Pc(994) int local994 = -1;
							@Pc(996) int local996 = -1;
							@Pc(998) int local998 = 256;
							@Pc(1070) byte local1070;
							@Pc(1014) int local1014;
							@Pc(1016) int local1016;
							@Pc(1249) int local1249;
							@Pc(1255) int local1255;
							@Pc(1263) int local1263;
							@Pc(1268) int local1268;
							@Pc(1282) int local1282;
							@Pc(1273) int local1273;
							@Pc(1280) int local1280;
							@Pc(1339) int local1339;
							@Pc(1345) int local1345;
							if (local154 != null) {
								local998 = local154.anInt544;
								local996 = local154.anInt550;
								local994 = local154.anInt542;
								local1014 = Static496.method782(local154, arg4);
								for (local1016 = 0; local1016 < local383; local1016++) {
									if (local77[-local89 & 0x3] && local948 == local813[0]) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 1;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 1;
										Static530.anIntArray560[4] = local833[local948];
										Static530.anIntArray560[5] = local841[local948];
										local1070 = 6;
									} else if (local77[2 - local89 & 0x3] && local948 == local813[2]) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 5;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 5;
										Static530.anIntArray560[4] = local833[local948];
										Static530.anIntArray560[5] = local841[local948];
										local1070 = 6;
									} else if (local77[1 - local89 & 0x3] && local813[1] == local948) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 3;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 3;
										Static530.anIntArray560[4] = local833[local948];
										Static530.anIntArray560[5] = local841[local948];
										local1070 = 6;
									} else if (local77[3 - local89 & 0x3] && local948 == local813[3]) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 7;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 7;
										Static530.anIntArray560[4] = local833[local948];
										Static530.anIntArray560[5] = local841[local948];
										local1070 = 6;
									} else {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = local833[local948];
										local1070 = 3;
										Static530.anIntArray560[2] = local841[local948];
									}
									local948++;
									for (local1249 = 0; local1249 < local1070; local1249++) {
										local1255 = Static530.anIntArray560[local1249];
										local1263 = local1255 - local89 * 2 & 0x7;
										local1268 = this.anIntArray570[local1255];
										local1273 = this.anIntArray569[local1255];
										if (local89 == 1) {
											local1280 = 512 - local1268;
											local1282 = local1273;
										} else if (local89 == 2) {
											local1282 = 512 - local1268;
											local1280 = 512 - local1273;
										} else if (local89 == 3) {
											local1280 = local1268;
											local1282 = 512 - local1273;
										} else {
											local1280 = local1273;
											local1282 = local1268;
										}
										local964[local950] = local1282;
										local967[local950] = local1280;
										if (local983 != null && Static170.aBooleanArrayArray3[local83][local1255]) {
											local1339 = (local27 << 9) + local1282;
											local1345 = local1280 + (local43 << 9);
											local983[local950] = arg2.method7725(local1339, local1345) - arg3.method7725(local1339, local1345);
										}
										if (local992 != null) {
											if (arg2 != null && !Static170.aBooleanArrayArray3[local83][local1255]) {
												local1339 = local1282 + (local27 << 9);
												local1345 = local1280 + (local43 << 9);
												local992[local950] = arg3.method7725(local1339, local1345) - arg2.method7725(local1339, local1345);
											} else if (arg0 != null && !Static409.aBooleanArrayArray4[local83][local1255]) {
												local1339 = local1282 + (local27 << 9);
												local1345 = local1280 + (local43 << 9);
												local992[local950] = arg0.method7725(local1339, local1345) - arg3.method7725(local1339, local1345);
											}
										}
										if (local1255 < 8 && local154.anInt546 < Static217.anIntArray242[local1263]) {
											if (local961 != null) {
												local961[local950] = Static532.anIntArray562[local1263];
											}
											local976[local950] = Static573.anIntArray397[local1263];
											local973[local950] = Static495.anIntArray528[local1263];
											local970[local950] = Static102.anIntArray134[local1263];
										} else {
											if (local961 != null) {
												local961[local950] = local1014;
											}
											local973[local950] = local154.anInt550;
											local976[local950] = local154.anInt544;
											local970[local950] = local994;
										}
										local950++;
									}
								}
								if (!this.aBoolean675 && arg1 == 0) {
									Static266.method4465(local27, local43, local154.anInt543, local154.anInt551 * 8, local154.anInt547);
								}
								if (local83 != 12 && local154.anInt542 != -1 && local154.aBoolean29) {
									local72 = true;
								}
							} else if (local811) {
								local948 = Static614.anIntArray634[local83];
							} else if (local74) {
								local948 = Static85.anIntArray115[local83];
							} else {
								local948 = Static50.anIntArray61[local83];
							}
							if (local166 != null) {
								if (local113 == 0) {
									local113 = local105;
								}
								if (local129 == 0) {
									local129 = local105;
								}
								if (local121 == 0) {
									local121 = local105;
								}
								@Pc(1604) Class295 local1604 = this.aClass263_5.method6567(local105 - 1);
								@Pc(1614) Class295 local1614 = this.aClass263_5.method6567(local113 - 1);
								@Pc(1622) Class295 local1622 = this.aClass263_5.method6567(local121 - 1);
								@Pc(1630) Class295 local1630 = this.aClass263_5.method6567(local129 - 1);
								for (local1263 = 0; local1263 < local373; local1263++) {
									if (local77[-local89 & 0x3] && local813[0] == local948) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 1;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 1;
										Static530.anIntArray560[4] = local833[local948];
										Static530.anIntArray560[5] = local841[local948];
										local1070 = 6;
									} else if (local77[2 - local89 & 0x3] && local813[2] == local948) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 5;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 5;
										Static530.anIntArray560[4] = local833[local948];
										Static530.anIntArray560[5] = local841[local948];
										local1070 = 6;
									} else if (local77[1 - local89 & 0x3] && local948 == local813[1]) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 3;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 3;
										Static530.anIntArray560[4] = local833[local948];
										Static530.anIntArray560[5] = local841[local948];
										local1070 = 6;
									} else if (local77[3 - local89 & 0x3] && local813[3] == local948) {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = 7;
										Static530.anIntArray560[2] = local841[local948];
										Static530.anIntArray560[3] = 7;
										Static530.anIntArray560[4] = local833[local948];
										local1070 = 6;
										Static530.anIntArray560[5] = local841[local948];
									} else {
										Static530.anIntArray560[0] = local821[local948];
										Static530.anIntArray560[1] = local833[local948];
										local1070 = 3;
										Static530.anIntArray560[2] = local841[local948];
									}
									local948++;
									for (local1268 = 0; local1268 < local1070; local1268++) {
										local1282 = Static530.anIntArray560[local1268];
										local1273 = local1282 - local89 * 2 & 0x7;
										local1280 = this.anIntArray570[local1282];
										local1345 = this.anIntArray569[local1282];
										@Pc(1891) int local1891;
										if (local89 == 1) {
											local1891 = 512 - local1280;
											local1339 = local1345;
										} else if (local89 == 2) {
											local1891 = 512 - local1345;
											local1339 = 512 - local1280;
										} else if (local89 == 3) {
											local1339 = 512 - local1345;
											local1891 = local1280;
										} else {
											local1339 = local1280;
											local1891 = local1345;
										}
										local964[local950] = local1339;
										local967[local950] = local1891;
										@Pc(1952) int local1952;
										@Pc(1959) int local1959;
										if (local983 != null && Static170.aBooleanArrayArray3[local83][local1282]) {
											local1952 = local1339 + (local27 << 9);
											local1959 = (local43 << 9) + local1891;
											local983[local950] = arg2.method7725(local1952, local1959) - arg3.method7725(local1952, local1959);
										}
										if (local992 != null) {
											if (arg2 != null && !Static170.aBooleanArrayArray3[local83][local1282]) {
												local1952 = local1339 + (local27 << 9);
												local1959 = (local43 << 9) + local1891;
												local992[local950] = arg3.method7725(local1952, local1959) - arg2.method7725(local1952, local1959);
											} else if (arg0 != null && !Static409.aBooleanArrayArray4[local83][local1282]) {
												local1952 = (local27 << 9) + local1339;
												local1959 = local1891 + (local43 << 9);
												local992[local950] = arg0.method7725(local1952, local1959) - arg3.method7725(local1952, local1959);
											}
										}
										if (local1282 < 8 && Static217.anIntArray242[local1273] >= 0) {
											if (local961 != null) {
												local961[local950] = Static532.anIntArray562[local1273];
											}
											local976[local950] = Static573.anIntArray397[local1273];
											local973[local950] = Static495.anIntArray528[local1273];
											local970[local950] = Static102.anIntArray134[local1273];
										} else {
											if (local74 && Static170.aBooleanArrayArray3[local83][local1282]) {
												local973[local950] = local996;
												local976[local950] = local998;
												local970[local950] = local994;
											} else if (local1339 == 0 && local1891 == 0) {
												local970[local950] = arg5[local27][local43];
												local973[local950] = local1604.anInt8385;
												local976[local950] = local1604.anInt8380;
											} else if (local1339 == 0 && local1891 == 512) {
												local970[local950] = arg5[local27][local57];
												local973[local950] = local1614.anInt8385;
												local976[local950] = local1614.anInt8380;
											} else if (local1339 == 512 && local1891 == 512) {
												local970[local950] = arg5[local41][local57];
												local973[local950] = local1622.anInt8385;
												local976[local950] = local1622.anInt8380;
											} else if (local1339 == 512 && local1891 == 0) {
												local970[local950] = arg5[local41][local43];
												local973[local950] = local1630.anInt8385;
												local976[local950] = local1630.anInt8380;
											} else {
												if (local1339 < 256) {
													if (local1891 < 256) {
														local973[local950] = local1604.anInt8385;
														local976[local950] = local1604.anInt8380;
													} else {
														local973[local950] = local1614.anInt8385;
														local976[local950] = local1614.anInt8380;
													}
												} else if (local1891 >= 256) {
													local973[local950] = local1622.anInt8385;
													local976[local950] = local1622.anInt8380;
												} else {
													local973[local950] = local1630.anInt8385;
													local976[local950] = local1630.anInt8380;
												}
												local1952 = Static65.method1151(arg5[local27][local43], local1339 << 7 >> 9, arg5[local41][local43]);
												local1959 = Static65.method1151(arg5[local27][local57], local1339 << 7 >> 9, arg5[local41][local57]);
												local970[local950] = Static65.method1151(local1952, local1891 << 7 >> 9, local1959);
											}
											if (local961 != null) {
												local961[local950] = local970[local950];
											}
										}
										local950++;
									}
								}
								if (local83 != 0 && local166.aBoolean606) {
									local72 = true;
								}
							}
							local1014 = arg3.method7724(local43, local27);
							local1016 = arg3.method7724(local43, local41);
							local1249 = arg3.method7724(local57, local41);
							local1255 = arg3.method7724(local57, local27);
							@Pc(2395) boolean local2395 = Static97.method1657(local43, local27);
							if (local2395 && arg1 > 1 || !local2395 && arg1 > 0) {
								@Pc(2408) boolean local2408 = true;
								if (local166 != null && !local166.aBoolean607) {
									local2408 = false;
								} else if (local105 == 0 && local83 != 0) {
									local2408 = false;
								} else if (local97 > 0 && local174 != null && !local174.aBoolean30) {
									local2408 = false;
								}
								if (local2408 && local1016 == local1014 && local1249 == local1014 && local1255 == local1014) {
									this.aByteArrayArrayArray14[arg1][local27][local43] = (byte) (this.aByteArrayArrayArray14[arg1][local27][local43] | 0x4);
								}
							}
							local1268 = 0;
							local1282 = 0;
							local1273 = 0;
							if (this.aBoolean675) {
								local1268 = Static549.method7850(local27, local43);
								local1282 = Static557.method7914(local27, local43);
								local1273 = Static613.method8370(local27, local43);
							}
							arg3.U(local27, local43, local964, local983, local967, local992, local970, local961, local973, local976, local1268, local1282, local1273, local72);
							Static456.method6762(arg1, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILclient!dc;IIIIIIZI)V")
	private void method7800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		if (arg5 == 1) {
			arg3 = 1;
		} else if (arg5 == 2) {
			arg3 = 1;
			arg6 = 1;
		} else if (arg5 == 3) {
			arg6 = 1;
		}
		@Pc(48) int local48;
		if (arg8 < 0 || this.anInt9098 <= arg8 || arg4 < 0 || arg4 >= this.anInt9096) {
			while (true) {
				local48 = arg2.method5633();
				if (local48 == 0) {
					return;
				}
				if (local48 == 1) {
					arg2.method5633();
					return;
				}
				if (local48 <= 49) {
					arg2.method5633();
				}
			}
			return;
		}
		if (!this.aBoolean675 && !arg9) {
			Static546.aByteArrayArrayArray18[arg7][arg8][arg4] = 0;
		}
		while (true) {
			local48 = arg2.method5633();
			if (local48 == 0) {
				if (this.aBoolean675) {
					this.anIntArrayArrayArray36[0][arg6 + arg8][arg3 + arg4] = 0;
					return;
				} else if (arg7 == 0) {
					this.anIntArrayArrayArray36[0][arg8 + arg6][arg4 + arg3] = -Static327.method5370(arg0 + 932731, 556238 - -arg1) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray36[arg7][arg6 + arg8][arg4 + arg3] = this.anIntArrayArrayArray36[arg7 - 1][arg8 + arg6][arg3 + arg4] - 960;
					return;
				}
			}
			if (local48 == 1) {
				@Pc(179) int local179 = arg2.method5633();
				if (this.aBoolean675) {
					this.anIntArrayArrayArray36[0][arg6 + arg8][arg3 + arg4] = local179 * 8 << 2;
					return;
				}
				if (local179 == 1) {
					local179 = 0;
				}
				if (arg7 != 0) {
					this.anIntArrayArrayArray36[arg7][arg6 + arg8][arg4 + arg3] = this.anIntArrayArrayArray36[arg7 - 1][arg8 + arg6][arg4 + arg3] - (local179 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray36[0][arg8 + arg6][arg4 + arg3] = -local179 * 8 << 2;
				return;
			}
			if (local48 <= 49) {
				if (arg9) {
					arg2.method5633();
				} else {
					this.aByteArrayArrayArray15[arg7][arg8][arg4] = arg2.method5619();
					this.aByteArrayArrayArray12[arg7][arg8][arg4] = (byte) ((local48 - 2) / 4);
					this.aByteArrayArrayArray16[arg7][arg8][arg4] = (byte) (arg5 + local48 - 2 & 0x3);
				}
			} else if (local48 <= 81) {
				if (!this.aBoolean675 && !arg9) {
					Static546.aByteArrayArrayArray18[arg7][arg8][arg4] = (byte) (local48 - 49);
				}
			} else if (!arg9) {
				this.aByteArrayArrayArray17[arg7][arg8][arg4] = (byte) (local48 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!rh;[ZI[[B[[BLclient!ha;IIII[[BIILclient!be;)V")
	private void method7802(@OriginalArg(0) Class295 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class82 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class27 arg12) {
		@Pc(18) boolean[] local18 = arg12 != null && arg12.aBoolean28 ? Static480.aBooleanArrayArray5[arg2] : Static555.aBooleanArrayArray6[arg2];
		@Pc(44) int local44;
		@Pc(57) Class27 local57;
		@Pc(75) byte local75;
		@Pc(91) int local91;
		@Pc(96) int local96;
		if (arg10 > 0) {
			if (arg11 > 0) {
				local44 = arg4[arg11 - 1][arg10 - 1] & 0xFF;
				if (local44 > 0) {
					local57 = this.aClass32_6.method747(local44 - 1);
					if (local57.anInt542 != -1 && local57.aBoolean28) {
						local75 = arg3[arg11 - 1][arg10 - 1];
						local91 = arg9[arg11 - 1][arg10 - 1] * 2 + 4 & 0x7;
						local96 = Static496.method782(local57, arg5);
						if (Static170.aBooleanArrayArray3[local75][local91]) {
							Static102.anIntArray134[0] = local57.anInt542;
							Static532.anIntArray562[0] = local96;
							Static495.anIntArray528[0] = local57.anInt550;
							Static573.anIntArray397[0] = local57.anInt544;
							Static217.anIntArray242[0] = local57.anInt546;
							Static406.anIntArray429[0] = 256;
						}
					}
				}
			}
			if (arg7 - 1 > arg11) {
				local44 = arg4[arg11 + 1][arg10 - 1] & 0xFF;
				if (local44 > 0) {
					local57 = this.aClass32_6.method747(local44 - 1);
					if (local57.anInt542 != -1 && local57.aBoolean28) {
						local75 = arg3[arg11 + 1][arg10 - 1];
						local91 = arg9[arg11 + 1][arg10 - 1] * 2 + 6 & 0x7;
						local96 = Static496.method782(local57, arg5);
						if (Static170.aBooleanArrayArray3[local75][local91]) {
							Static102.anIntArray134[2] = local57.anInt542;
							Static532.anIntArray562[2] = local96;
							Static495.anIntArray528[2] = local57.anInt550;
							Static573.anIntArray397[2] = local57.anInt544;
							Static217.anIntArray242[2] = local57.anInt546;
							Static406.anIntArray429[2] = 512;
						}
					}
				}
			}
		}
		if (arg10 < arg6 - 1) {
			if (arg11 > 0) {
				local44 = arg4[arg11 - 1][arg10 + 1] & 0xFF;
				if (local44 > 0) {
					local57 = this.aClass32_6.method747(local44 - 1);
					if (local57.anInt542 != -1 && local57.aBoolean28) {
						local75 = arg3[arg11 - 1][arg10 + 1];
						local91 = arg9[arg11 - 1][arg10 + 1] * 2 + 2 & 0x7;
						local96 = Static496.method782(local57, arg5);
						if (Static170.aBooleanArrayArray3[local75][local91]) {
							Static102.anIntArray134[6] = local57.anInt542;
							Static532.anIntArray562[6] = local96;
							Static495.anIntArray528[6] = local57.anInt550;
							Static573.anIntArray397[6] = local57.anInt544;
							Static217.anIntArray242[6] = local57.anInt546;
							Static406.anIntArray429[6] = 64;
						}
					}
				}
			}
			if (arg7 - 1 > arg11) {
				local44 = arg4[arg11 + 1][arg10 + 1] & 0xFF;
				if (local44 > 0) {
					local57 = this.aClass32_6.method747(local44 - 1);
					if (local57.anInt542 != -1 && local57.aBoolean28) {
						local75 = arg3[arg11 + 1][arg10 + 1];
						local91 = arg9[arg11 + 1][arg10 + 1] * 2 & 0x7;
						local96 = Static496.method782(local57, arg5);
						if (Static170.aBooleanArrayArray3[local75][local91]) {
							Static102.anIntArray134[4] = local57.anInt542;
							Static532.anIntArray562[4] = local96;
							Static495.anIntArray528[4] = local57.anInt550;
							Static573.anIntArray397[4] = local57.anInt544;
							Static217.anIntArray242[4] = local57.anInt546;
							Static406.anIntArray429[4] = 128;
						}
					}
				}
			}
		}
		@Pc(521) int local521;
		@Pc(526) int local526;
		@Pc(528) int local528;
		@Pc(488) byte local488;
		if (arg10 > 0) {
			local44 = arg4[arg11][arg10 - 1] & 0xFF;
			if (local44 > 0) {
				local57 = this.aClass32_6.method747(local44 - 1);
				if (local57.anInt542 != -1) {
					local75 = arg3[arg11][arg10 - 1];
					local488 = arg9[arg11][arg10 - 1];
					if (local57.aBoolean28) {
						local96 = 2;
						local521 = local488 * 2 + 4;
						local526 = Static496.method782(local57, arg5);
						for (local528 = 0; local528 < 3; local528++) {
							local521 &= 0x7;
							local96 &= 0x7;
							if (Static170.aBooleanArrayArray3[local75][local521] && local57.anInt546 >= Static217.anIntArray242[local96]) {
								Static102.anIntArray134[local96] = local57.anInt542;
								Static532.anIntArray562[local96] = local526;
								Static495.anIntArray528[local96] = local57.anInt550;
								Static573.anIntArray397[local96] = local57.anInt544;
								if (Static217.anIntArray242[local96] == local57.anInt546) {
									Static406.anIntArray429[local96] |= 0x20;
								} else {
									Static406.anIntArray429[local96] = 32;
								}
								Static217.anIntArray242[local96] = local57.anInt546;
							}
							local96--;
							local521++;
						}
						if (!local18[arg8 & 0x3]) {
							arg1[0] = Static480.aBooleanArrayArray5[local75][local488 + 2 & 0x3];
						}
					} else if (!local18[--arg8 & 0x3]) {
						arg1[0] = Static555.aBooleanArrayArray6[local75][local488 + 2 & 0x3];
					}
				}
			}
		}
		if (arg6 - 1 > arg10) {
			local44 = arg4[arg11][arg10 + 1] & 0xFF;
			if (local44 > 0) {
				local57 = this.aClass32_6.method747(local44 - 1);
				if (local57.anInt542 != -1) {
					local75 = arg3[arg11][arg10 + 1];
					local488 = arg9[arg11][arg10 + 1];
					if (local57.aBoolean28) {
						local96 = 4;
						local521 = local488 * 2 + 2;
						local526 = Static496.method782(local57, arg5);
						for (local528 = 0; local528 < 3; local528++) {
							local521 &= 0x7;
							local96 &= 0x7;
							if (Static170.aBooleanArrayArray3[local75][local521] && local57.anInt546 >= Static217.anIntArray242[local96]) {
								Static102.anIntArray134[local96] = local57.anInt542;
								Static532.anIntArray562[local96] = local526;
								Static495.anIntArray528[local96] = local57.anInt550;
								Static573.anIntArray397[local96] = local57.anInt544;
								if (Static217.anIntArray242[local96] == local57.anInt546) {
									Static406.anIntArray429[local96] |= 0x10;
								} else {
									Static406.anIntArray429[local96] = 16;
								}
								Static217.anIntArray242[local96] = local57.anInt546;
							}
							local96++;
							local521--;
						}
						if (!local18[arg8 + 2 & 0x3]) {
							arg1[2] = Static480.aBooleanArrayArray5[local75][local488 & 0x3];
						}
					} else if (!local18[arg8 + 2 & 0x3]) {
						arg1[2] = Static555.aBooleanArrayArray6[local75][local488 & 0x3];
					}
				}
			}
		}
		if (arg11 > 0) {
			local44 = arg4[arg11 - 1][arg10] & 0xFF;
			if (local44 > 0) {
				local57 = this.aClass32_6.method747(local44 - 1);
				if (local57.anInt542 != -1) {
					local75 = arg3[arg11 - 1][arg10];
					local488 = arg9[arg11 - 1][arg10];
					if (local57.aBoolean28) {
						local96 = 6;
						local521 = local488 * 2 + 4;
						local526 = Static496.method782(local57, arg5);
						for (local528 = 0; local528 < 3; local528++) {
							local521 &= 0x7;
							local96 &= 0x7;
							if (Static170.aBooleanArrayArray3[local75][local521] && Static217.anIntArray242[local96] <= local57.anInt546) {
								Static102.anIntArray134[local96] = local57.anInt542;
								Static532.anIntArray562[local96] = local526;
								Static495.anIntArray528[local96] = local57.anInt550;
								Static573.anIntArray397[local96] = local57.anInt544;
								if (local57.anInt546 == Static217.anIntArray242[local96]) {
									Static406.anIntArray429[local96] |= 0x8;
								} else {
									Static406.anIntArray429[local96] = 8;
								}
								Static217.anIntArray242[local96] = local57.anInt546;
							}
							local96++;
							local521--;
						}
						if (!local18[arg8 + 3 & 0x3]) {
							arg1[3] = Static480.aBooleanArrayArray5[local75][local488 + 1 & 0x3];
						}
					} else if (!local18[arg8 + 3 & 0x3]) {
						arg1[3] = Static555.aBooleanArrayArray6[local75][local488 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 < arg7 - 1) {
			local44 = arg4[arg11 + 1][arg10] & 0xFF;
			if (local44 > 0) {
				local57 = this.aClass32_6.method747(local44 - 1);
				if (local57.anInt542 != -1) {
					local75 = arg3[arg11 + 1][arg10];
					local488 = arg9[arg11 + 1][arg10];
					if (local57.aBoolean28) {
						local96 = 4;
						local521 = local488 * 2 + 6;
						local526 = Static496.method782(local57, arg5);
						for (local528 = 0; local528 < 3; local528++) {
							local521 &= 0x7;
							local96 &= 0x7;
							if (Static170.aBooleanArrayArray3[local75][local521] && Static217.anIntArray242[local96] <= local57.anInt546) {
								Static102.anIntArray134[local96] = local57.anInt542;
								Static532.anIntArray562[local96] = local526;
								Static495.anIntArray528[local96] = local57.anInt550;
								Static573.anIntArray397[local96] = local57.anInt544;
								if (Static217.anIntArray242[local96] == local57.anInt546) {
									Static406.anIntArray429[local96] |= 0x4;
								} else {
									Static406.anIntArray429[local96] = 4;
								}
								Static217.anIntArray242[local96] = local57.anInt546;
							}
							local521++;
							local96--;
						}
						if (!local18[arg8 + 1 & 0x3]) {
							arg1[1] = Static480.aBooleanArrayArray5[local75][local488 + 3 & 0x3];
						}
					} else if (!local18[arg8 + 1 & 0x3]) {
						arg1[1] = Static555.aBooleanArrayArray6[local75][local488 + 3 & 0x3];
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		local44 = Static496.method782(arg12, arg5);
		if (!arg12.aBoolean28) {
			return;
		}
		for (@Pc(1176) int local1176 = 0; local1176 < 8; local1176++) {
			@Pc(1187) int local1187 = local1176 - arg8 * 2 & 0x7;
			if (Static170.aBooleanArrayArray3[arg2][local1176] && arg12.anInt546 >= Static217.anIntArray242[local1187]) {
				Static102.anIntArray134[local1187] = arg12.anInt542;
				Static532.anIntArray562[local1187] = local44;
				Static495.anIntArray528[local1187] = arg12.anInt550;
				Static573.anIntArray397[local1187] = arg12.anInt544;
				if (arg12.anInt546 == Static217.anIntArray242[local1187]) {
					Static406.anIntArray429[local1187] |= 0x2;
				} else {
					Static406.anIntArray429[local1187] = 2;
				}
				Static217.anIntArray242[local1187] = arg12.anInt546;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!s;BLclient!s;Lclient!ha;)V")
	public final void method7803(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class91 arg1, @OriginalArg(3) Class82 arg2) {
		if (Static225.anIntArray250 == null || Static225.anIntArray250.length != this.anInt9096) {
			Static440.anIntArray460 = new int[this.anInt9096];
			Static225.anIntArray250 = new int[this.anInt9096];
			Static423.anIntArray442 = new int[this.anInt9096];
			Static84.anIntArray568 = new int[this.anInt9096];
			Static268.anIntArray287 = new int[this.anInt9096];
		}
		@Pc(46) int[][] local46 = new int[this.anInt9098][this.anInt9096];
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < this.anInt9095; local48++) {
			for (local52 = 0; local52 < this.anInt9096; local52++) {
				Static225.anIntArray250[local52] = 0;
				Static440.anIntArray460[local52] = 0;
				Static84.anIntArray568[local52] = 0;
				Static423.anIntArray442[local52] = 0;
				Static268.anIntArray287[local52] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt9098; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(182) int local182;
				for (@Pc(85) int local85 = 0; local85 < this.anInt9096; local85++) {
					local91 = local81 + 5;
					@Pc(159) int local159;
					if (local91 < this.anInt9098) {
						local110 = this.aByteArrayArrayArray17[local48][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class295 local123 = this.aClass263_5.method6567(local110 - 1);
							Static225.anIntArray250[local85] += local123.anInt8378;
							Static440.anIntArray460[local85] += local123.anInt8383;
							Static84.anIntArray568[local85] += local123.anInt8376;
							Static423.anIntArray442[local85] += local123.anInt8384;
							local159 = Static268.anIntArray287[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local182 = this.aByteArrayArrayArray17[local48][local110][local85] & 0xFF;
						if (local182 > 0) {
							@Pc(195) Class295 local195 = this.aClass263_5.method6567(local182 - 1);
							Static225.anIntArray250[local85] -= local195.anInt8378;
							Static440.anIntArray460[local85] -= local195.anInt8383;
							Static84.anIntArray568[local85] -= local195.anInt8376;
							Static423.anIntArray442[local85] -= local195.anInt8384;
							local159 = Static268.anIntArray287[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local182 = 0;
					@Pc(249) int local249 = 0;
					@Pc(251) int local251 = 0;
					for (@Pc(253) int local253 = -5; local253 < this.anInt9096; local253++) {
						@Pc(259) int local259 = local253 + 5;
						if (local259 < this.anInt9096) {
							local249 += Static423.anIntArray442[local259];
							local91 += Static225.anIntArray250[local259];
							local110 += Static440.anIntArray460[local259];
							local251 += Static268.anIntArray287[local259];
							local182 += Static84.anIntArray568[local259];
						}
						@Pc(297) int local297 = local253 - 5;
						if (local297 >= 0) {
							local110 -= Static440.anIntArray460[local297];
							local91 -= Static225.anIntArray250[local297];
							local182 -= Static84.anIntArray568[local297];
							local251 -= Static268.anIntArray287[local297];
							local249 -= Static423.anIntArray442[local297];
						}
						if (local253 >= 0 && local249 > 0 && local251 > 0) {
							local46[local81][local253] = Static543.method7813(local91 * 256 / local249, local110 / local251, local182 / local251);
						}
					}
				}
			}
			if (Static469.aBoolean573) {
				this.method7799(local48 == 0 ? arg0 : null, local48, local48 == 0 ? arg1 : null, Static637.aClass91Array4[local48], arg2, local46);
			} else {
				this.method7808(Static637.aClass91Array4[local48], local46, local48 == 0 ? arg0 : null, local48, local48 == 0 ? arg1 : null, arg2);
			}
			this.aByteArrayArrayArray17[local48] = null;
			this.aByteArrayArrayArray15[local48] = null;
			this.aByteArrayArrayArray12[local48] = null;
			this.aByteArrayArrayArray16[local48] = null;
		}
		if (!this.aBoolean675) {
			if (Static164.anInt3251 != 0) {
				Static514.method7503();
			}
			if (Static236.aBoolean345) {
				Static36.method8219();
			}
		}
		for (local52 = 0; local52 < this.anInt9095; local52++) {
			Static637.aClass91Array4[local52].YA();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[[I)V")
	public final void method7804(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray36[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt9098 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt9096 + 1; local22++) {
				local10[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "([[[I[Lclient!nfa;ILclient!ha;)V")
	public final void method7806(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class237[] arg1, @OriginalArg(3) Class82 arg2) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (!this.aBoolean675) {
			for (local19 = 0; local19 < 4; local19++) {
				for (local23 = 0; local23 < this.anInt9098; local23++) {
					for (local27 = 0; local27 < this.anInt9096; local27++) {
						if ((Static546.aByteArrayArrayArray18[local19][local23][local27] & 0x1) != 0) {
							@Pc(41) int local41 = local19;
							if ((Static546.aByteArrayArrayArray18[1][local23][local27] & 0x2) != 0) {
								local41 = local19 - 1;
							}
							if (local41 >= 0) {
								arg1[local41].method5904(local27, local23);
							}
						}
					}
				}
			}
		}
		for (local19 = 0; local19 < this.anInt9095; local19++) {
			local23 = 0;
			local27 = 0;
			if (!this.aBoolean675) {
				if (Static48.aBoolean705) {
					local27 = 8;
				}
				if (Static236.aBoolean345) {
					local23 = 2;
				}
				if (Static164.anInt3251 != 0) {
					local23 |= 0x1;
					if (local19 == 0 | Static464.aBoolean568) {
						local27 |= 0x10;
					}
				}
			}
			if (Static236.aBoolean345) {
				local27 |= 0x7;
			}
			if (!Static23.aBoolean19) {
				local27 |= 0x20;
			}
			@Pc(155) int[][] local155 = arg0 == null || local19 >= arg0.length ? this.anIntArrayArrayArray36[local19] : arg0[local19];
			Static355.method8491(local19, arg2.method6139(this.anInt9098, this.anInt9096, this.anIntArrayArrayArray36[local19], local155, local23, local27));
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BIILclient!dc;II[Lclient!nfa;)V")
	public final void method7807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class237[] arg5) {
		@Pc(10) int local10;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (!this.aBoolean675) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class237 local16 = arg5[local10];
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg0 + local18;
						local33 = local22 + arg3;
						if (local29 >= 0 && this.anInt9098 > local29 && local33 >= 0 && this.anInt9096 > local33) {
							local16.method5912(local33, local29);
						}
					}
				}
			}
		}
		local10 = arg4 + arg0;
		@Pc(79) int local79 = arg3 + arg1;
		for (local22 = 0; local22 < this.anInt9095; local22++) {
			for (local29 = 0; local29 < 64; local29++) {
				for (local33 = 0; local33 < 64; local33++) {
					this.method7800(local29 + local10, local33 + local79, arg2, 0, local33 + arg3, 0, 0, local22, arg0 + local29, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!s;[[ILclient!s;IILclient!s;Lclient!ha;)V")
	private void method7808(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class91 arg4, @OriginalArg(6) Class82 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9098; local3++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt9096; local26++) {
				if (Static416.anInt7323 == -1 || Static168.method2814(local26, arg3, Static416.anInt7323, local3)) {
					@Pc(49) byte local49 = this.aByteArrayArrayArray12[arg3][local3][local26];
					@Pc(58) byte local58 = this.aByteArrayArrayArray16[arg3][local3][local26];
					@Pc(69) int local69 = this.aByteArrayArrayArray15[arg3][local3][local26] & 0xFF;
					@Pc(80) int local80 = this.aByteArrayArrayArray17[arg3][local3][local26] & 0xFF;
					@Pc(92) Class27 local92 = local69 == 0 ? null : this.aClass32_6.method747(local69 - 1);
					if (local49 == 0 && local92 == null) {
						local49 = 12;
					}
					@Pc(110) Class295 local110 = local80 == 0 ? null : this.aClass263_5.method6567(local80 - 1);
					@Pc(112) Class27 local112 = local92;
					if (local92 != null && local92.anInt542 == -1 && local92.anInt541 == -1) {
						local112 = local92;
						local92 = null;
					}
					if (local92 != null || local110 != null) {
						@Pc(135) int local135 = Static269.anIntArray290[local49];
						@Pc(139) int local139 = Static614.anIntArray634[local49];
						@Pc(152) int local152 = (local92 == null ? 0 : local139) + (local110 == null ? 0 : local135);
						@Pc(154) int local154 = 0;
						@Pc(156) int local156 = 0;
						@Pc(163) int local163 = local92 == null ? -1 : local92.anInt550;
						@Pc(170) int local170 = local110 == null ? -1 : local110.anInt8385;
						@Pc(173) int[] local173 = new int[local152];
						@Pc(176) int[] local176 = new int[local152];
						@Pc(179) int[] local179 = new int[local152];
						@Pc(182) int[] local182 = new int[local152];
						@Pc(185) int[] local185 = new int[local152];
						@Pc(188) int[] local188 = new int[local152];
						@Pc(199) int[] local199 = local92 == null || local92.anInt541 == -1 ? null : new int[local152];
						@Pc(203) int local203;
						if (local92 == null) {
							local156 = local139;
						} else {
							for (local203 = 0; local203 < local139; local203++) {
								local173[local154] = Static144.anIntArrayArray15[local49][local156];
								local176[local154] = Static45.anIntArrayArray3[local49][local156];
								local179[local154] = Static409.anIntArrayArray35[local49][local156];
								local185[local154] = local163;
								local188[local154] = local92.anInt544;
								local182[local154] = local92.anInt542;
								if (local199 != null) {
									local199[local154] = local92.anInt541;
								}
								local154++;
								local156++;
							}
							if (!this.aBoolean675 && arg3 == 0) {
								Static266.method4465(local3, local26, local92.anInt543, local92.anInt551 * 8, local92.anInt547);
							}
						}
						if (local110 != null) {
							for (local203 = 0; local203 < local135; local203++) {
								local173[local154] = Static144.anIntArrayArray15[local49][local156];
								local176[local154] = Static45.anIntArrayArray3[local49][local156];
								local179[local154] = Static409.anIntArrayArray35[local49][local156];
								local185[local154] = local170;
								local188[local154] = local110.anInt8380;
								local182[local154] = arg1[local3][local26];
								if (local199 != null) {
									local199[local154] = local182[local154];
								}
								local154++;
								local156++;
							}
						}
						local203 = this.anIntArray570.length;
						@Pc(346) int[] local346 = new int[local203];
						@Pc(349) int[] local349 = new int[local203];
						@Pc(356) int[] local356 = arg4 == null ? null : new int[local203];
						@Pc(365) int[] local365 = arg4 == null && arg2 == null ? null : new int[local203];
						@Pc(374) int local374;
						@Pc(379) int local379;
						@Pc(464) int local464;
						@Pc(472) int local472;
						for (@Pc(367) int local367 = 0; local367 < local203; local367++) {
							local374 = this.anIntArray570[local367];
							local379 = this.anIntArray569[local367];
							if (local58 == 0) {
								local346[local367] = local374;
								local349[local367] = local379;
							} else if (local58 == 1) {
								local346[local367] = local379;
								local349[local367] = 512 - local374;
							} else if (local58 == 2) {
								local346[local367] = 512 - local374;
								local349[local367] = 512 - local379;
							} else if (local58 == 3) {
								local346[local367] = 512 - local379;
								local349[local367] = local374;
							}
							if (local356 != null && Static170.aBooleanArrayArray3[local49][local367]) {
								local464 = (local3 << 9) + local346[local367];
								local472 = (local26 << 9) + local349[local367];
								local356[local367] = arg4.method7725(local464, local472) - arg0.method7725(local464, local472);
							}
							if (local365 != null) {
								if (arg4 != null && !Static170.aBooleanArrayArray3[local49][local367]) {
									local464 = local346[local367] + (local3 << 9);
									local472 = local349[local367] + (local26 << 9);
									local365[local367] = arg0.method7725(local464, local472) - arg4.method7725(local464, local472);
								} else if (arg2 != null && !Static409.aBooleanArrayArray4[local49][local367]) {
									local464 = (local3 << 9) + local346[local367];
									local472 = (local26 << 9) + local349[local367];
									local365[local367] = arg2.method7725(local464, local472) - arg0.method7725(local464, local472);
								}
							}
						}
						local374 = arg0.method7724(local26, local3);
						local379 = arg0.method7724(local26, local3 + 1);
						local464 = arg0.method7724(local26 + 1, local3 + 1);
						local472 = arg0.method7724(local26 + 1, local3);
						@Pc(610) boolean local610 = Static97.method1657(local26, local3);
						if (local610 && arg3 > 1 || !local610 && arg3 > 0) {
							@Pc(621) boolean local621 = true;
							if (local110 != null && !local110.aBoolean607) {
								local621 = false;
							} else if (local80 == 0 && local49 != 0) {
								local621 = false;
							} else if (local69 > 0 && local112 != null && !local112.aBoolean30) {
								local621 = false;
							}
							if (local621 && local379 == local374 && local374 == local464 && local374 == local472) {
								this.aByteArrayArrayArray14[arg3][local3][local26] = (byte) (this.aByteArrayArrayArray14[arg3][local3][local26] | 0x4);
							}
						}
						@Pc(700) int local700 = 0;
						@Pc(702) int local702 = 0;
						@Pc(704) int local704 = 0;
						if (this.aBoolean675) {
							local700 = Static549.method7850(local3, local26);
							local702 = Static557.method7914(local3, local26);
							local704 = Static613.method8370(local3, local26);
						}
						arg0.method7718(local3, local26, local346, local356, local349, local365, local173, local176, local179, local182, local199, local185, local188, local700, local702, local704);
						Static456.method6762(arg3, local3, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIII)V")
	public final void method7809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg2 + arg0; local3++) {
			for (local7 = arg3; local7 < arg1 + arg3; local7++) {
				if (local7 >= 0 && this.anInt9098 > local7 && local3 >= 0 && this.anInt9096 > local3) {
					this.anIntArrayArrayArray36[arg4][local7][local3] = arg4 > 0 ? this.anIntArrayArrayArray36[arg4 - 1][local7][local3] - 960 : 0;
				}
			}
		}
		if (arg3 > 0 && this.anInt9098 > arg3) {
			for (local7 = arg0 + 1; local7 < arg2 + arg0; local7++) {
				if (local7 >= 0 && this.anInt9096 > local7) {
					this.anIntArrayArrayArray36[arg4][arg3][local7] = this.anIntArrayArrayArray36[arg4][arg3 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt9096) {
			for (local7 = arg3 + 1; local7 < arg1 + arg3; local7++) {
				if (local7 >= 0 && local7 < this.anInt9098) {
					this.anIntArrayArrayArray36[arg4][local7][arg0] = this.anIntArrayArrayArray36[arg4][local7][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || arg3 >= this.anInt9098 || arg0 >= this.anInt9096) {
			return;
		}
		if (arg4 != 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0] != this.anIntArrayArrayArray36[arg4 - 1][arg3 - 1][arg0]) {
				this.anIntArrayArrayArray36[arg4][arg3][arg0] = this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray36[arg4 - 1][arg3][arg0 - 1] != this.anIntArrayArrayArray36[arg4][arg3][arg0 - 1]) {
				this.anIntArrayArrayArray36[arg4][arg3][arg0] = this.anIntArrayArrayArray36[arg4][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0 - 1] != this.anIntArrayArrayArray36[arg4 - 1][arg3 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray36[arg4][arg3][arg0] = this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0] != 0) {
			this.anIntArrayArrayArray36[arg4][arg3][arg0] = this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray36[arg4][arg3][arg0 - 1] != 0) {
			this.anIntArrayArrayArray36[arg4][arg3][arg0] = this.anIntArrayArrayArray36[arg4][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray36[arg4][arg3][arg0] = this.anIntArrayArrayArray36[arg4][arg3 - 1][arg0 - 1];
			return;
		}
	}
}
