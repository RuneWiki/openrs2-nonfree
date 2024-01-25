import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public class Class123 {

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "[I")
	private final int[] anIntArray360 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
	private final int[] anIntArray361 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Z")
	public final boolean aBoolean443;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "Lclient!us;")
	private final Class335 aClass335_2;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
	protected final int anInt6521;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	public final int anInt6514;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!ud;")
	private final Class324 aClass324_4;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
	protected final int anInt6523;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!gg", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIZLclient!ud;Lclient!us;)V")
	protected Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class324 arg4, @OriginalArg(5) Class335 arg5) {
		this.aBoolean443 = arg3;
		this.aClass335_2 = arg5;
		this.anInt6521 = arg1;
		this.anInt6514 = arg0;
		this.aClass324_4 = arg4;
		this.anInt6523 = arg2;
		this.aByteArrayArrayArray11 = new byte[this.anInt6514][this.anInt6521][this.anInt6523];
		this.aByteArrayArrayArray13 = new byte[this.anInt6514][this.anInt6521][this.anInt6523];
		this.aByteArrayArrayArray12 = new byte[this.anInt6514][this.anInt6521][this.anInt6523];
		this.aByteArrayArrayArray16 = new byte[this.anInt6514][this.anInt6521][this.anInt6523];
		this.anIntArrayArrayArray14 = new int[this.anInt6514][this.anInt6521 + 1][this.anInt6523 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt6514][this.anInt6521 + 1][this.anInt6523 + 1];
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIIIILclient!ek;IIIII)V")
	private void method5152(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub13 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg4 = 1;
		} else if (arg1 == 2) {
			arg4 = 1;
			arg9 = 1;
		} else if (arg1 == 3) {
			arg9 = 1;
		}
		@Pc(79) int local79;
		if (arg7 < 0 || arg7 >= this.anInt6521 || arg3 < 0 || this.anInt6523 <= arg3) {
			while (true) {
				local79 = arg5.method7004();
				if (local79 == 0) {
					return;
				}
				if (local79 == 1) {
					arg5.method7004();
					return;
				}
				if (local79 <= 49) {
					arg5.method7004();
				}
			}
			return;
		}
		if (!this.aBoolean443 && !arg0) {
			Static266.aByteArrayArrayArray10[arg8][arg7][arg3] = 0;
		}
		while (true) {
			local79 = arg5.method7004();
			if (local79 == 0) {
				if (this.aBoolean443) {
					this.anIntArrayArrayArray14[0][arg7 + arg9][arg4 + arg3] = 0;
					return;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray14[0][arg9 + arg7][arg4 + arg3] = -Static352.method5322(arg6 + 556238, arg2 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray14[arg8][arg7 + arg9][arg4 + arg3] = this.anIntArrayArrayArray14[arg8 - 1][arg7 + arg9][arg3 + arg4] - 960;
					return;
				}
			}
			if (local79 == 1) {
				@Pc(169) int local169 = arg5.method7004();
				if (!this.aBoolean443) {
					if (local169 == 1) {
						local169 = 0;
					}
					if (arg8 == 0) {
						this.anIntArrayArrayArray14[0][arg9 + arg7][arg4 + arg3] = -local169 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray14[arg8][arg7 + arg9][arg3 + arg4] = this.anIntArrayArrayArray14[arg8 - 1][arg7 + arg9][arg3 + arg4] - (local169 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray14[0][arg7 + arg9][arg4 + arg3] = local169 * 8 << 2;
				return;
			}
			if (local79 <= 49) {
				if (arg0) {
					arg5.method7004();
				} else {
					this.aByteArrayArrayArray11[arg8][arg7][arg3] = arg5.method7011();
					this.aByteArrayArrayArray12[arg8][arg7][arg3] = (byte) ((local79 - 2) / 4);
					this.aByteArrayArrayArray13[arg8][arg7][arg3] = (byte) (local79 + arg1 - 2 & 0x3);
				}
			} else if (local79 <= 81) {
				if (!this.aBoolean443 && !arg0) {
					Static266.aByteArrayArrayArray10[arg8][arg7][arg3] = (byte) (local79 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray16[arg8][arg7][arg3] = (byte) (local79 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!r;Lclient!i;Lclient!i;I)V")
	public final void method5153(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) Class115 arg2) {
		if (Static492.anIntArray532 == null || Static492.anIntArray532.length != this.anInt6523) {
			Static574.anIntArray580 = new int[this.anInt6523];
			Static268.anIntArray292 = new int[this.anInt6523];
			Static60.anIntArray58 = new int[this.anInt6523];
			Static233.anIntArray241 = new int[this.anInt6523];
			Static492.anIntArray532 = new int[this.anInt6523];
		}
		@Pc(42) int[][] local42 = new int[this.anInt6521][this.anInt6523];
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < this.anInt6514; local50++) {
			for (local54 = 0; local54 < this.anInt6523; local54++) {
				Static492.anIntArray532[local54] = 0;
				Static268.anIntArray292[local54] = 0;
				Static233.anIntArray241[local54] = 0;
				Static574.anIntArray580[local54] = 0;
				Static60.anIntArray58[local54] = 0;
			}
			for (@Pc(87) int local87 = -5; local87 < this.anInt6521; local87++) {
				@Pc(97) int local97;
				@Pc(112) int local112;
				@Pc(183) int local183;
				for (@Pc(91) int local91 = 0; local91 < this.anInt6523; local91++) {
					local97 = local87 + 5;
					@Pc(160) int local160;
					if (this.anInt6521 > local97) {
						local112 = this.aByteArrayArrayArray16[local50][local97][local91] & 0xFF;
						if (local112 > 0) {
							@Pc(124) Class25 local124 = this.aClass335_2.method7602(local112 - 1);
							Static492.anIntArray532[local91] += local124.anInt1028;
							Static268.anIntArray292[local91] += local124.anInt1034;
							Static233.anIntArray241[local91] += local124.anInt1032;
							Static574.anIntArray580[local91] += local124.anInt1037;
							local160 = Static60.anIntArray58[local91]++;
						}
					}
					local112 = local87 - 5;
					if (local112 >= 0) {
						local183 = this.aByteArrayArrayArray16[local50][local112][local91] & 0xFF;
						if (local183 > 0) {
							@Pc(193) Class25 local193 = this.aClass335_2.method7602(local183 - 1);
							Static492.anIntArray532[local91] -= local193.anInt1028;
							Static268.anIntArray292[local91] -= local193.anInt1034;
							Static233.anIntArray241[local91] -= local193.anInt1032;
							Static574.anIntArray580[local91] -= local193.anInt1037;
							local160 = Static60.anIntArray58[local91]--;
						}
					}
				}
				if (local87 >= 0) {
					local97 = 0;
					local112 = 0;
					local183 = 0;
					@Pc(247) int local247 = 0;
					@Pc(249) int local249 = 0;
					for (@Pc(251) int local251 = -5; local251 < this.anInt6523; local251++) {
						@Pc(257) int local257 = local251 + 5;
						if (this.anInt6523 > local257) {
							local183 += Static233.anIntArray241[local257];
							local112 += Static268.anIntArray292[local257];
							local247 += Static574.anIntArray580[local257];
							local97 += Static492.anIntArray532[local257];
							local249 += Static60.anIntArray58[local257];
						}
						@Pc(299) int local299 = local251 - 5;
						if (local299 >= 0) {
							local97 -= Static492.anIntArray532[local299];
							local112 -= Static268.anIntArray292[local299];
							local183 -= Static233.anIntArray241[local299];
							local249 -= Static60.anIntArray58[local299];
							local247 -= Static574.anIntArray580[local299];
						}
						if (local251 >= 0 && local247 > 0 && local249 > 0) {
							local42[local87][local251] = Static177.method2938(local112 / local249, local97 * 256 / local247, local183 / local249);
						}
					}
				}
			}
			if (Static170.aBoolean268) {
				this.method5155(Static255.aClass115Array2[local50], local50, arg0, local50 == 0 ? arg1 : null, local42, local50 == 0 ? arg2 : null);
			} else {
				this.method5162(arg0, local50 == 0 ? arg2 : null, local42, local50, local50 == 0 ? arg1 : null, Static255.aClass115Array2[local50]);
			}
			this.aByteArrayArrayArray16[local50] = null;
			this.aByteArrayArrayArray11[local50] = null;
			this.aByteArrayArrayArray12[local50] = null;
			this.aByteArrayArrayArray13[local50] = null;
		}
		if (!this.aBoolean443) {
			if (Static2.anInt11 != 0) {
				Static600.method3512();
			}
			if (Static250.aBoolean364) {
				Static506.method7292();
			}
		}
		for (local54 = 0; local54 < this.anInt6514; local54++) {
			Static255.aClass115Array2[local54].BA();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)V")
	public final void method5154(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6514; local3++) {
			this.method5158(local3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!i;ILclient!r;Lclient!i;[[ILclient!i;)V")
	private void method5155(@OriginalArg(1) Class115 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class115 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class115 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg1];
		@Pc(19) byte[][] local19 = this.aByteArrayArrayArray13[arg1];
		@Pc(24) byte[][] local24 = this.aByteArrayArrayArray16[arg1];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray11[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt6521; local31++) {
			@Pc(45) int local45 = this.anInt6521 - 1 <= local31 ? local31 : local31 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt6523; local47++) {
				@Pc(61) int local61 = this.anInt6523 - 1 <= local47 ? local47 : local47 + 1;
				if (Static100.anInt2434 == -1 || Static592.method8254(local31, local47, Static100.anInt2434, arg1)) {
					@Pc(75) boolean local75 = false;
					@Pc(77) boolean local77 = false;
					@Pc(80) boolean[] local80 = new boolean[4];
					@Pc(86) int local86 = local10[local31][local47];
					@Pc(92) int local92 = local19[local31][local47];
					@Pc(100) int local100 = local29[local31][local47] & 0xFF;
					@Pc(108) int local108 = local24[local31][local47] & 0xFF;
					@Pc(116) int local116 = local24[local31][local61] & 0xFF;
					@Pc(124) int local124 = local24[local45][local61] & 0xFF;
					@Pc(132) int local132 = local24[local45][local47] & 0xFF;
					if (local100 != 0 || local108 != 0) {
						@Pc(151) Class54 local151 = local100 == 0 ? null : this.aClass324_4.method7429(local100 - 1);
						if (local86 == 0 && local151 == null) {
							local86 = 12;
						}
						@Pc(172) Class25 local172 = local108 == 0 ? null : this.aClass335_2.method7602(local108 - 1);
						@Pc(174) Class54 local174 = local151;
						if (local151 != null) {
							if (local151.anInt1744 == -1 && local151.anInt1739 == -1) {
								local174 = local151;
								local151 = null;
							} else if (local172 != null && local86 != 0) {
								local77 = local151.aBoolean136;
							}
						}
						@Pc(255) int local255;
						@Pc(306) int local306;
						@Pc(371) int local371;
						@Pc(384) int local384;
						if ((local86 == 0 || local86 == 12) && local31 > 0 && local47 > 0 && this.anInt6521 > local31 && this.anInt6523 > local47) {
							local255 = local108 == local24[local31 - 1][local47 - 1] ? 1 : -1;
							@Pc(274) int local274 = local24[local45][local47 - 1] == local108 ? 1 : -1;
							@Pc(287) int local287 = local108 == local24[local45][local61] ? 1 : -1;
							local306 = local24[local31 - 1][local61] == local108 ? 1 : -1;
							if (local108 == local24[local31][local47 - 1]) {
								local274++;
								local255++;
							} else {
								local274--;
								local255--;
							}
							if (local108 == local24[local45][local47]) {
								local287++;
								local274++;
							} else {
								local287--;
								local274--;
							}
							if (local108 == local24[local31][local61]) {
								local287++;
								local306++;
							} else {
								local306--;
								local287--;
							}
							if (local24[local31 - 1][local47] == local108) {
								local306++;
								local255++;
							} else {
								local255--;
								local306--;
							}
							local371 = local255 - local287;
							if (local371 < 0) {
								local371 = -local371;
							}
							local384 = local274 - local306;
							if (local384 < 0) {
								local384 = -local384;
							}
							if (local384 == local371) {
								local371 = arg0.method8055(local47, local31) - arg0.method8055(local61, local45);
								if (local371 < 0) {
									local371 = -local371;
								}
								local384 = arg0.method8055(local47, local45) - arg0.method8055(local61, local31);
								if (local384 < 0) {
									local384 = -local384;
								}
							}
							local92 = local384 <= local371 ? 0 : 1;
						}
						for (local255 = 0; local255 < 13; local255++) {
							Static327.anIntArray490[local255] = -1;
							Static60.anIntArray64[local255] = 1;
						}
						@Pc(471) boolean[] local471 = local151 != null && local151.aBoolean136 ? Static81.aBooleanArrayArray11[local86] : Static47.aBooleanArrayArray1[local86];
						this.method5164(local47, local80, local31, this.anInt6523, local29, this.anInt6521, local172, arg2, local86, local19, local10, local92, local151);
						@Pc(500) boolean local500 = local151 != null && local151.anInt1744 != local151.anInt1739;
						if (!local500) {
							for (local306 = 0; local306 < 8; local306++) {
								if (Static327.anIntArray490[local306] >= 0 && Static581.anIntArray586[local306] != Static239.anIntArray274[local306]) {
									local500 = true;
									break;
								}
							}
						}
						if (!local471[local92 + 1 & 0x3]) {
							local80[1] = Static91.method1835(local80[1], (Static60.anIntArray64[2] & Static60.anIntArray64[4]) == 0);
						}
						if (!local471[local92 + 3 & 0x3]) {
							local80[3] = Static91.method1835(local80[3], (Static60.anIntArray64[6] & Static60.anIntArray64[0]) == 0);
						}
						if (!local471[--local92 & 0x3]) {
							local80[0] = Static91.method1835(local80[0], (Static60.anIntArray64[0] & Static60.anIntArray64[2]) == 0);
						}
						if (!local471[local92 + 2 & 0x3]) {
							local80[2] = Static91.method1835(local80[2], (Static60.anIntArray64[6] & Static60.anIntArray64[4]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local80[0] = local80[3] = false;
								local92 = 0;
								local86 = local86 == 0 ? 13 : 14;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local92 = 3;
								local80[0] = local80[1] = false;
								local86 = local86 == 0 ? 13 : 14;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local80[1] = local80[2] = false;
								local86 = local86 == 0 ? 13 : 14;
								local92 = 2;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local80[2] = local80[3] = false;
								local92 = 1;
							}
						}
						@Pc(804) boolean local804 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(806) int[] local806 = null;
						@Pc(812) int[] local812;
						@Pc(836) int[] local836;
						@Pc(816) int[] local816;
						if (local804) {
							local812 = Static134.anIntArrayArray37[local86];
							local816 = Static571.anIntArrayArray60[local86];
							local384 = local151 == null ? 0 : Static200.anIntArray194[local86];
							local371 = local172 == null ? 0 : Static124.anIntArray130[local86];
							local836 = Static48.anIntArrayArray55[local86];
						} else if (local77) {
							local384 = local151 == null ? 0 : Static595.anIntArray591[local86];
							local371 = local172 == null ? 0 : Static217.anIntArray502[local86];
							local836 = Static207.anIntArrayArray21[local86];
							local816 = Static77.anIntArrayArray8[local86];
							local812 = Static419.anIntArrayArray41[local86];
							local806 = Static9.anIntArrayArray1[local86];
						} else {
							local836 = Static535.anIntArrayArray58[local86];
							local816 = Static37.anIntArrayArray3[local86];
							local812 = Static37.anIntArrayArray2[local86];
							local806 = Static110.anIntArrayArray11[local86];
							local384 = local151 == null ? 0 : Static191.anIntArray188[local86];
							local371 = local172 == null ? 0 : Static443.anIntArray492[local86];
						}
						@Pc(910) int local910 = local384 + local371;
						if (local910 <= 0) {
							Static20.method828(arg1, local31, local47);
						} else {
							if (local80[0]) {
								local910++;
							}
							if (local80[2]) {
								local910++;
							}
							if (local80[1]) {
								local910++;
							}
							if (local80[3]) {
								local910++;
							}
							@Pc(940) int local940 = 0;
							@Pc(942) int local942 = 0;
							@Pc(946) int local946 = local910 * 3;
							@Pc(953) int[] local953 = local500 ? new int[local946] : null;
							@Pc(956) int[] local956 = new int[local946];
							@Pc(959) int[] local959 = new int[local946];
							@Pc(962) int[] local962 = new int[local946];
							@Pc(965) int[] local965 = new int[local946];
							@Pc(968) int[] local968 = new int[local946];
							@Pc(975) int[] local975 = arg3 == null ? null : new int[local946];
							@Pc(984) int[] local984 = arg3 == null && arg5 == null ? null : new int[local946];
							@Pc(986) int local986 = -1;
							@Pc(988) int local988 = -1;
							@Pc(990) int local990 = 256;
							@Pc(1058) byte local1058;
							@Pc(1006) int local1006;
							@Pc(1008) int local1008;
							@Pc(1236) int local1236;
							@Pc(1242) int local1242;
							@Pc(1251) int local1251;
							@Pc(1256) int local1256;
							@Pc(1268) int local1268;
							@Pc(1261) int local1261;
							@Pc(1273) int local1273;
							@Pc(1329) int local1329;
							@Pc(1335) int local1335;
							if (local151 != null) {
								local988 = local151.anInt1740;
								local986 = local151.anInt1744;
								local990 = local151.anInt1743;
								local1006 = Static14.method8200(local151, arg2);
								for (local1008 = 0; local1008 < local384; local1008++) {
									if (local80[-local92 & 0x3] && local940 == local806[0]) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 1;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 1;
										Static465.anIntArray517[4] = local836[local940];
										Static465.anIntArray517[5] = local816[local940];
										local1058 = 6;
									} else if (local80[2 - local92 & 0x3] && local806[2] == local940) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 5;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 5;
										Static465.anIntArray517[4] = local836[local940];
										local1058 = 6;
										Static465.anIntArray517[5] = local816[local940];
									} else if (local80[1 - local92 & 0x3] && local940 == local806[1]) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 3;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 3;
										Static465.anIntArray517[4] = local836[local940];
										Static465.anIntArray517[5] = local816[local940];
										local1058 = 6;
									} else if (local80[3 - local92 & 0x3] && local806[3] == local940) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 7;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 7;
										Static465.anIntArray517[4] = local836[local940];
										Static465.anIntArray517[5] = local816[local940];
										local1058 = 6;
									} else {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = local836[local940];
										local1058 = 3;
										Static465.anIntArray517[2] = local816[local940];
									}
									for (local1236 = 0; local1236 < local1058; local1236++) {
										local1242 = Static465.anIntArray517[local1236];
										local1251 = local1242 - local92 * 2 & 0x7;
										local1256 = this.anIntArray361[local1242];
										local1261 = this.anIntArray360[local1242];
										if (local92 == 1) {
											local1268 = local1261;
											local1273 = 512 - local1256;
										} else if (local92 == 2) {
											local1273 = 512 - local1261;
											local1268 = 512 - local1256;
										} else if (local92 == 3) {
											local1273 = local1256;
											local1268 = 512 - local1261;
										} else {
											local1268 = local1256;
											local1273 = local1261;
										}
										local956[local942] = local1268;
										local959[local942] = local1273;
										if (local975 != null && Static145.aBooleanArrayArray4[local86][local1242]) {
											local1329 = local1268 + (local31 << 9);
											local1335 = local1273 + (local47 << 9);
											local975[local942] = arg3.method8064(local1329, local1335) - arg0.method8064(local1329, local1335);
										}
										if (local984 != null) {
											if (arg3 != null && !Static145.aBooleanArrayArray4[local86][local1242]) {
												local1329 = (local31 << 9) + local1268;
												local1335 = local1273 + (local47 << 9);
												local984[local942] = arg0.method8064(local1329, local1335) - arg3.method8064(local1329, local1335);
											} else if (arg5 != null && !Static159.aBooleanArrayArray6[local86][local1242]) {
												local1329 = (local31 << 9) + local1268;
												local1335 = (local47 << 9) + local1273;
												local984[local942] = arg5.method8064(local1329, local1335) - arg0.method8064(local1329, local1335);
											}
										}
										if (local1242 < 8 && Static327.anIntArray490[local1251] > local151.anInt1741) {
											if (local953 != null) {
												local953[local942] = Static581.anIntArray586[local1251];
											}
											local968[local942] = Static526.anIntArray548[local1251];
											local965[local942] = Static260.anIntArray286[local1251];
											local962[local942] = Static239.anIntArray274[local1251];
										} else {
											if (local953 != null) {
												local953[local942] = local1006;
											}
											local965[local942] = local151.anInt1740;
											local968[local942] = local151.anInt1743;
											local962[local942] = local986;
										}
										local942++;
									}
									local940++;
								}
								if (!this.aBoolean443 && arg1 == 0) {
									Static450.method6618(local31, local47, local151.anInt1742, local151.anInt1745 * 8, local151.anInt1747);
								}
								if (local86 != 12 && local151.anInt1744 != -1 && local151.aBoolean135) {
									local75 = true;
								}
							} else if (local804) {
								local940 = Static200.anIntArray194[local86];
							} else if (local77) {
								local940 = Static595.anIntArray591[local86];
							} else {
								local940 = Static191.anIntArray188[local86];
							}
							if (local172 != null) {
								if (local132 == 0) {
									local132 = local108;
								}
								if (local124 == 0) {
									local124 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								@Pc(1592) Class25 local1592 = this.aClass335_2.method7602(local108 - 1);
								@Pc(1600) Class25 local1600 = this.aClass335_2.method7602(local116 - 1);
								@Pc(1608) Class25 local1608 = this.aClass335_2.method7602(local124 - 1);
								@Pc(1616) Class25 local1616 = this.aClass335_2.method7602(local132 - 1);
								for (local1251 = 0; local1251 < local371; local1251++) {
									if (local80[-local92 & 0x3] && local940 == local806[0]) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 1;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 1;
										Static465.anIntArray517[4] = local836[local940];
										local1058 = 6;
										Static465.anIntArray517[5] = local816[local940];
									} else if (local80[2 - local92 & 0x3] && local806[2] == local940) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 5;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 5;
										Static465.anIntArray517[4] = local836[local940];
										Static465.anIntArray517[5] = local816[local940];
										local1058 = 6;
									} else if (local80[1 - local92 & 0x3] && local940 == local806[1]) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 3;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 3;
										Static465.anIntArray517[4] = local836[local940];
										local1058 = 6;
										Static465.anIntArray517[5] = local816[local940];
									} else if (local80[3 - local92 & 0x3] && local806[3] == local940) {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = 7;
										Static465.anIntArray517[2] = local816[local940];
										Static465.anIntArray517[3] = 7;
										Static465.anIntArray517[4] = local836[local940];
										Static465.anIntArray517[5] = local816[local940];
										local1058 = 6;
									} else {
										Static465.anIntArray517[0] = local812[local940];
										Static465.anIntArray517[1] = local836[local940];
										local1058 = 3;
										Static465.anIntArray517[2] = local816[local940];
									}
									local940++;
									for (local1256 = 0; local1256 < local1058; local1256++) {
										local1268 = Static465.anIntArray517[local1256];
										local1261 = local1268 - local92 * 2 & 0x7;
										local1273 = this.anIntArray361[local1268];
										local1335 = this.anIntArray360[local1268];
										@Pc(1895) int local1895;
										if (local92 == 1) {
											local1329 = local1335;
											local1895 = 512 - local1273;
										} else if (local92 == 2) {
											local1329 = 512 - local1273;
											local1895 = 512 - local1335;
										} else if (local92 == 3) {
											local1895 = local1273;
											local1329 = 512 - local1335;
										} else {
											local1329 = local1273;
											local1895 = local1335;
										}
										local956[local942] = local1329;
										local959[local942] = local1895;
										@Pc(1944) int local1944;
										@Pc(1950) int local1950;
										if (local975 != null && Static145.aBooleanArrayArray4[local86][local1268]) {
											local1944 = local1329 + (local31 << 9);
											local1950 = local1895 + (local47 << 9);
											local975[local942] = arg3.method8064(local1944, local1950) - arg0.method8064(local1944, local1950);
										}
										if (local984 != null) {
											if (arg3 != null && !Static145.aBooleanArrayArray4[local86][local1268]) {
												local1944 = local1329 + (local31 << 9);
												local1950 = local1895 + (local47 << 9);
												local984[local942] = arg0.method8064(local1944, local1950) - arg3.method8064(local1944, local1950);
											} else if (arg5 != null && !Static159.aBooleanArrayArray6[local86][local1268]) {
												local1944 = (local31 << 9) + local1329;
												local1950 = local1895 + (local47 << 9);
												local984[local942] = arg5.method8064(local1944, local1950) - arg0.method8064(local1944, local1950);
											}
										}
										if (local1268 < 8 && Static327.anIntArray490[local1261] >= 0) {
											if (local953 != null) {
												local953[local942] = Static581.anIntArray586[local1261];
											}
											local968[local942] = Static526.anIntArray548[local1261];
											local965[local942] = Static260.anIntArray286[local1261];
											local962[local942] = Static239.anIntArray274[local1261];
										} else {
											if (local77 && Static145.aBooleanArrayArray4[local86][local1268]) {
												local965[local942] = local988;
												local968[local942] = local990;
												local962[local942] = local986;
											} else if (local1329 == 0 && local1895 == 0) {
												local962[local942] = arg4[local31][local47];
												local965[local942] = local1592.anInt1036;
												local968[local942] = local1592.anInt1030;
											} else if (local1329 == 0 && local1895 == 512) {
												local962[local942] = arg4[local31][local61];
												local965[local942] = local1600.anInt1036;
												local968[local942] = local1600.anInt1030;
											} else if (local1329 == 512 && local1895 == 512) {
												local962[local942] = arg4[local45][local61];
												local965[local942] = local1608.anInt1036;
												local968[local942] = local1608.anInt1030;
											} else if (local1329 == 512 && local1895 == 0) {
												local962[local942] = arg4[local45][local47];
												local965[local942] = local1616.anInt1036;
												local968[local942] = local1616.anInt1030;
											} else {
												if (local1329 >= 256) {
													if (local1895 >= 256) {
														local965[local942] = local1608.anInt1036;
														local968[local942] = local1608.anInt1030;
													} else {
														local965[local942] = local1616.anInt1036;
														local968[local942] = local1616.anInt1030;
													}
												} else if (local1895 >= 256) {
													local965[local942] = local1600.anInt1036;
													local968[local942] = local1600.anInt1030;
												} else {
													local965[local942] = local1592.anInt1036;
													local968[local942] = local1592.anInt1030;
												}
												local1944 = Static222.method3619(arg4[local45][local47], arg4[local31][local47], local1329 << 7 >> 9);
												local1950 = Static222.method3619(arg4[local45][local61], arg4[local31][local61], local1329 << 7 >> 9);
												local962[local942] = Static222.method3619(local1950, local1944, local1895 << 7 >> 9);
											}
											if (local953 != null) {
												local953[local942] = local962[local942];
											}
										}
										local942++;
									}
								}
								if (local86 != 0 && local172.aBoolean96) {
									local75 = true;
								}
							}
							local1006 = arg0.method8055(local47, local31);
							local1008 = arg0.method8055(local47, local45);
							local1236 = arg0.method8055(local61, local45);
							local1242 = arg0.method8055(local61, local31);
							@Pc(2369) boolean local2369 = Static193.method3175(local47, local31);
							if (local2369 && arg1 > 1 || !local2369 && arg1 > 0) {
								@Pc(2383) boolean local2383 = true;
								if (local172 != null && !local172.aBoolean95) {
									local2383 = false;
								} else if (local108 == 0 && local86 != 0) {
									local2383 = false;
								} else if (local100 > 0 && local174 != null && !local174.aBoolean137) {
									local2383 = false;
								}
								if (local2383 && local1008 == local1006 && local1006 == local1236 && local1242 == local1006) {
									this.aByteArrayArrayArray15[arg1][local31][local47] = (byte) (this.aByteArrayArrayArray15[arg1][local31][local47] | 0x4);
								}
							}
							local1256 = 0;
							local1268 = 0;
							local1261 = 0;
							if (this.aBoolean443) {
								local1256 = Static418.method6588(local31, local47);
								local1268 = Static600.method3511(local31, local47);
								local1261 = Static493.method7124(local31, local47);
							}
							arg0.O(local31, local47, local956, local975, local959, local984, local962, local953, local965, local968, local1256, local1268, local1261, local75);
							Static20.method828(arg1, local31, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ek;I[Lclient!nea;III)V")
	public final void method5157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class232[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(29) int local29;
		if (!this.aBoolean443) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class232 local12 = arg3[local6];
				for (@Pc(14) int local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg2;
						local29 = arg0 + local18;
						if (local24 >= 0 && local24 < this.anInt6521 && local29 >= 0 && local29 < this.anInt6523) {
							local12.method5270(local24, local29);
						}
					}
				}
			}
		}
		local6 = arg2 + arg5;
		@Pc(72) int local72 = arg0 + arg4;
		for (local18 = 0; local18 < this.anInt6514; local18++) {
			for (local24 = 0; local24 < 64; local24++) {
				for (local29 = 0; local29 < 64; local29++) {
					this.method5152(false, 0, local6 + local24, arg0 + local29, 0, arg1, local29 + local72, arg2 + local24, local18, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIZI)V")
	private void method5158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = arg2; local12 < arg2 + 64; local12++) {
			for (local16 = arg1; local16 < arg1 + 64; local16++) {
				if (local16 >= 0 && local16 < this.anInt6521 && local12 >= 0 && this.anInt6523 > local12) {
					this.anIntArrayArrayArray14[arg0][local16][local12] = arg0 > 0 ? this.anIntArrayArrayArray14[arg0 - 1][local16][local12] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt6521) {
			for (local16 = arg2 + 1; local16 < arg2 + 64; local16++) {
				if (local16 >= 0 && local16 < this.anInt6523) {
					this.anIntArrayArrayArray14[arg0][arg1][local16] = this.anIntArrayArrayArray14[arg0][arg1 - 1][local16];
				}
			}
		}
		if (arg2 > 0 && this.anInt6523 > arg2) {
			for (local16 = arg1 + 1; local16 < arg1 + 64; local16++) {
				if (local16 >= 0 && this.anInt6521 > local16) {
					this.anIntArrayArrayArray14[arg0][local16][arg2] = this.anIntArrayArrayArray14[arg0][local16][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || this.anInt6521 <= arg1 || arg2 >= this.anInt6523) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray14[arg0][arg1][arg2] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray14[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray14[arg0][arg1][arg2] = this.anIntArrayArrayArray14[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray14[arg0][arg1][arg2] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2] != this.anIntArrayArrayArray14[arg0 - 1][arg1 - 1][arg2]) {
			this.anIntArrayArrayArray14[arg0][arg1][arg2] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray14[arg0 - 1][arg1][arg2 - 1] != this.anIntArrayArrayArray14[arg0][arg1][arg2 - 1]) {
			this.anIntArrayArrayArray14[arg0][arg1][arg2] = this.anIntArrayArrayArray14[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray14[arg0 - 1][arg1 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray14[arg0][arg1][arg2] = this.anIntArrayArrayArray14[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[[ILclient!r;Z[Lclient!nea;)V")
	public final void method5159(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(3) Class232[] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean443) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt6521; local10++) {
					for (local14 = 0; local14 < this.anInt6523; local14++) {
						if ((Static266.aByteArrayArrayArray10[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static266.aByteArrayArrayArray10[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg2[local31].method5269(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt6514; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean443) {
				if (Static416.aBoolean573) {
					local14 = 8;
				}
				if (Static250.aBoolean364) {
					local10 = 2;
				}
				if (Static2.anInt11 != 0) {
					if (local6 == 0 | Static179.aBoolean277) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static250.aBoolean364) {
				local14 |= 0x7;
			}
			if (!Static246.aBoolean359) {
				local14 |= 0x20;
			}
			@Pc(151) int[][] local151 = arg0 == null || arg0.length <= local6 ? this.anIntArrayArrayArray14[local6] : arg0[local6];
			Static248.method3963(local6, arg1.method7804(this.anInt6521, this.anInt6523, this.anIntArrayArrayArray14[local6], local151, local10, local14));
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!ek;IIIIIII[Lclient!nea;)V")
	public final void method5161(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class232[] arg8) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg5 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean443) {
			@Pc(24) Class232 local24 = arg8[arg6];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg4 + Static313.method4939(arg7, local26 & 0x7, local30 & 0x7);
					local57 = Static505.method7288(local30 & 0x7, local26 & 0x7, arg7) + arg1;
					if (local45 > 0 && this.anInt6521 - 1 > local45 && local57 > 0 && local57 < this.anInt6523 - 1) {
						local24.method5270(local45, local57);
					}
				}
			}
		}
		@Pc(107) int local107 = (arg2 & 0xFFFFFFF8) << 3;
		local26 = (arg5 & 0xFFFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg7 == 1) {
			local117 = 1;
		} else if (arg7 == 2) {
			local117 = 1;
			local115 = 1;
		} else if (arg7 == 3) {
			local115 = 1;
		}
		for (local57 = 0; local57 < this.anInt6514; local57++) {
			for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
				for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
					if (arg3 == local57 && local11 <= local146 && local146 <= local11 + 8 && local150 >= local17 && local150 <= local17 + 8) {
						@Pc(229) int local229;
						@Pc(241) int local241;
						if (local11 + 8 == local146 || local17 + 8 == local150) {
							if (arg7 == 0) {
								local241 = arg1 + local150 - local17;
								local229 = local146 + arg4 - local11;
							} else if (arg7 == 1) {
								local241 = arg1 + local11 + 8 - local146;
								local229 = arg4 + local150 - local17;
							} else if (arg7 == 2) {
								local229 = arg4 + local11 + 8 - local146;
								local241 = local17 + arg1 + 8 - local150;
							} else {
								local229 = local17 + arg4 + 8 - local150;
								local241 = arg1 + local146 - local11;
							}
							this.method5152(true, 0, local146 + local107, local241, 0, arg0, local26 + local150, local229, arg6, 0);
						} else {
							local229 = arg4 + Static313.method4939(arg7, local146 & 0x7, local150 & 0x7);
							local241 = Static505.method7288(local150 & 0x7, local146 & 0x7, arg7) + arg1;
							this.method5152(false, arg7, local107 + local146, local241, local117, arg0, local150 + local26, local229, arg6, local115);
						}
						if (local146 == 63 || local150 == 63) {
							@Pc(372) byte local372 = 1;
							if (local146 == 63 && local150 == 63) {
								local372 = 3;
							}
							for (@Pc(382) int local382 = 0; local382 < local372; local382++) {
								@Pc(386) int local386 = local146;
								@Pc(388) int local388 = local150;
								if (local382 == 0) {
									local388 = local150 == 63 ? 64 : local150;
									local386 = local146 == 63 ? 64 : local146;
								} else if (local382 == 1) {
									local386 = 64;
								} else if (local382 == 2) {
									local388 = 64;
								}
								@Pc(439) int local439;
								@Pc(447) int local447;
								if (arg7 == 0) {
									local447 = arg1 + local388 - local17;
									local439 = arg4 + local386 - local11;
								} else if (arg7 == 1) {
									local439 = local388 + arg4 - local17;
									local447 = local11 + arg1 + 8 - local386;
								} else if (arg7 == 2) {
									local447 = local17 + arg1 + 8 - local388;
									local439 = arg4 + local11 + 8 - local386;
								} else {
									local439 = arg4 + local17 + 8 - local388;
									local447 = arg1 + local386 - local11;
								}
								if (local439 >= 0 && local439 < this.anInt6521 && local447 >= 0 && this.anInt6523 > local447) {
									this.anIntArrayArrayArray14[arg6][local439][local447] = this.anIntArrayArrayArray14[arg6][local115 + local229][local117 + local241];
								}
							}
						}
					} else {
						this.method5152(false, 0, 0, -1, 0, arg0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!r;Lclient!i;[[IIILclient!i;Lclient!i;)V")
	private void method5162(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class115 arg4, @OriginalArg(6) Class115 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6521; local3++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt6523; local26++) {
				if (Static100.anInt2434 == -1 || Static592.method8254(local3, local26, Static100.anInt2434, arg3)) {
					@Pc(49) byte local49 = this.aByteArrayArrayArray12[arg3][local3][local26];
					@Pc(58) byte local58 = this.aByteArrayArrayArray13[arg3][local3][local26];
					@Pc(69) int local69 = this.aByteArrayArrayArray11[arg3][local3][local26] & 0xFF;
					@Pc(80) int local80 = this.aByteArrayArrayArray16[arg3][local3][local26] & 0xFF;
					@Pc(94) Class54 local94 = local69 == 0 ? null : this.aClass324_4.method7429(local69 - 1);
					@Pc(106) Class25 local106 = local80 == 0 ? null : this.aClass335_2.method7602(local80 - 1);
					@Pc(108) int local108 = 0;
					@Pc(110) int local110 = 0;
					if (local49 != 0) {
						local108 = local106 == null ? 0 : Static124.anIntArray130[local49];
						local110 = local94 == null ? 0 : Static200.anIntArray194[local49];
					} else if (local94 != null) {
						local110 = Static200.anIntArray194[local49];
					} else if (local106 != null) {
						local108 = Static200.anIntArray194[local49];
					}
					@Pc(151) int local151 = local108 + local110;
					@Pc(153) int local153 = 0;
					if (local151 != 0) {
						@Pc(164) int local164;
						if (Static12.aBoolean81) {
							local164 = local94 == null ? -1 : local94.anInt1740;
						} else {
							local164 = -1;
						}
						@Pc(171) int[] local171 = new int[local151];
						@Pc(174) int[] local174 = new int[local151];
						@Pc(177) int[] local177 = new int[local151];
						@Pc(180) int[] local180 = new int[local151];
						@Pc(182) boolean local182 = false;
						@Pc(199) int local199;
						if (local94 == null || local94.anInt1744 == -1 && local94.anInt1739 == -1 && local164 == -1) {
							for (local199 = 0; local199 < local110; local199++) {
								local171[local153] = -1;
								local153++;
							}
						} else {
							for (local199 = 0; local199 < local110; local199++) {
								local177[local153] = local164;
								local180[local153] = local94.anInt1743;
								if (local94.anInt1744 == -1) {
									local171[local153] = -1;
								} else {
									local171[local153] = local94.anInt1744;
								}
								if (local94.anInt1739 == -1) {
									local174[local153] = -1;
								} else {
									local174[local153] = local94.anInt1739;
									local182 = true;
								}
								local153++;
							}
							if (!this.aBoolean443 && arg3 == 0) {
								Static450.method6618(local3, local26, local94.anInt1742, local94.anInt1745 * 8, local94.anInt1747);
							}
						}
						if (!local182) {
							local174 = null;
						}
						if (local106 == null) {
							for (local199 = 0; local199 < local108; local199++) {
								local171[local153] = -1;
								local153++;
							}
						} else {
							local199 = local106.anInt1036;
							if (Static12.aBoolean81) {
								local199 = -1;
							}
							for (@Pc(319) int local319 = 0; local319 < local108; local319++) {
								local177[local153] = local199;
								local180[local153] = local106.anInt1030;
								local171[local153] = arg2[local3][local26];
								if (local174 != null) {
									local174[local153] = -1;
								}
								local153++;
							}
						}
						local199 = this.anIntArray361.length;
						@Pc(360) int[] local360 = new int[local199];
						@Pc(363) int[] local363 = new int[local199];
						@Pc(370) int[] local370 = arg4 == null ? null : new int[local199];
						@Pc(379) int[] local379 = arg4 == null && arg1 == null ? null : new int[local199];
						@Pc(388) int local388;
						@Pc(393) int local393;
						@Pc(475) int local475;
						@Pc(482) int local482;
						for (@Pc(381) int local381 = 0; local381 < local199; local381++) {
							local388 = this.anIntArray361[local381];
							local393 = this.anIntArray360[local381];
							if (local58 == 0) {
								local360[local381] = local388;
								local363[local381] = local393;
							} else if (local58 == 1) {
								local360[local381] = local393;
								local363[local381] = 512 - local388;
							} else if (local58 == 2) {
								local360[local381] = 512 - local388;
								local363[local381] = 512 - local393;
							} else if (local58 == 3) {
								local360[local381] = 512 - local393;
								local363[local381] = local388;
							}
							if (local370 != null && Static145.aBooleanArrayArray4[local49][local381]) {
								local475 = local388 + (local3 << 9);
								local482 = (local26 << 9) + local388;
								local370[local381] = arg4.method8064(local475, local482) - arg5.method8064(local475, local482);
							}
							if (local379 != null) {
								if (arg4 != null && !Static145.aBooleanArrayArray4[local49][local381]) {
									local475 = local388 + (local3 << 9);
									local482 = local388 + (local26 << 9);
									local379[local381] = arg5.method8064(local475, local482) - arg4.method8064(local475, local482);
								} else if (arg1 != null && !Static159.aBooleanArrayArray6[local49][local381]) {
									local475 = (local3 << 9) + local388;
									local482 = local388 + (local26 << 9);
									local379[local381] = arg1.method8064(local475, local482) - arg5.method8064(local475, local482);
								}
							}
						}
						local388 = arg5.method8055(local26, local3);
						local393 = arg5.method8055(local26, local3 + 1);
						local475 = arg5.method8055(local26 + 1, local3 + 1);
						local482 = arg5.method8055(local26 + 1, local3);
						@Pc(615) boolean local615 = Static193.method3175(local26, local3);
						if (local615 && arg3 > 1 || !local615 && arg3 > 0) {
							@Pc(626) boolean local626 = true;
							if (local106 != null && !local106.aBoolean95) {
								local626 = false;
							} else if (local80 == 0 && local49 != 0) {
								local626 = false;
							} else if (local69 > 0 && local94 != null && !local94.aBoolean137) {
								local626 = false;
							}
							if (local626 && local393 == local388 && local388 == local475 && local482 == local388) {
								this.aByteArrayArrayArray15[arg3][local3][local26] = (byte) (this.aByteArrayArrayArray15[arg3][local3][local26] | 0x4);
							}
						}
						@Pc(694) int local694 = 0;
						@Pc(696) int local696 = 0;
						@Pc(698) int local698 = 0;
						if (this.aBoolean443) {
							local694 = Static418.method6588(local3, local26);
							local696 = Static600.method3511(local3, local26);
							local698 = Static493.method7124(local3, local26);
						}
						arg5.method8058(local3, local26, local360, local370, local363, local379, Static134.anIntArrayArray37[local49], Static48.anIntArrayArray55[local49], Static571.anIntArrayArray60[local49], local171, local174, local177, local180, local694, local696, local698);
						Static20.method828(arg3, local3, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[III)V")
	public final void method5163(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray14[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6521 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt6523 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[ZII[[BILclient!b;Lclient!r;I[[BZ[[BILclient!ch;)V")
	private void method5164(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class25 arg6, @OriginalArg(7) Class7 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class54 arg12) {
		@Pc(24) boolean[] local24 = arg12 != null && arg12.aBoolean136 ? Static81.aBooleanArrayArray11[arg8] : Static47.aBooleanArrayArray1[arg8];
		@Pc(40) int local40;
		@Pc(50) Class54 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg0 > 0) {
			if (arg2 > 0) {
				local40 = arg4[arg2 - 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass324_4.method7429(local40 - 1);
					if (local50.anInt1744 != -1 && local50.aBoolean136) {
						local67 = arg10[arg2 - 1][arg0 - 1];
						local83 = arg9[arg2 - 1][arg0 - 1] * 2 + 4 & 0x7;
						local88 = Static14.method8200(local50, arg7);
						if (Static145.aBooleanArrayArray4[local67][local83]) {
							Static239.anIntArray274[0] = local50.anInt1744;
							Static581.anIntArray586[0] = local88;
							Static260.anIntArray286[0] = local50.anInt1740;
							Static526.anIntArray548[0] = local50.anInt1743;
							Static327.anIntArray490[0] = local50.anInt1741;
							Static60.anIntArray64[0] = 256;
						}
					}
				}
			}
			if (arg2 < arg5 - 1) {
				local40 = arg4[arg2 + 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass324_4.method7429(local40 - 1);
					if (local50.anInt1744 != -1 && local50.aBoolean136) {
						local67 = arg10[arg2 + 1][arg0 - 1];
						local83 = arg9[arg2 + 1][arg0 - 1] * 2 + 6 & 0x7;
						local88 = Static14.method8200(local50, arg7);
						if (Static145.aBooleanArrayArray4[local67][local83]) {
							Static239.anIntArray274[2] = local50.anInt1744;
							Static581.anIntArray586[2] = local88;
							Static260.anIntArray286[2] = local50.anInt1740;
							Static526.anIntArray548[2] = local50.anInt1743;
							Static327.anIntArray490[2] = local50.anInt1741;
							Static60.anIntArray64[2] = 512;
						}
					}
				}
			}
		}
		if (arg0 < arg3 - 1) {
			if (arg2 > 0) {
				local40 = arg4[arg2 - 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass324_4.method7429(local40 - 1);
					if (local50.anInt1744 != -1 && local50.aBoolean136) {
						local67 = arg10[arg2 - 1][arg0 + 1];
						local83 = arg9[arg2 - 1][arg0 + 1] * 2 + 2 & 0x7;
						local88 = Static14.method8200(local50, arg7);
						if (Static145.aBooleanArrayArray4[local67][local83]) {
							Static239.anIntArray274[6] = local50.anInt1744;
							Static581.anIntArray586[6] = local88;
							Static260.anIntArray286[6] = local50.anInt1740;
							Static526.anIntArray548[6] = local50.anInt1743;
							Static327.anIntArray490[6] = local50.anInt1741;
							Static60.anIntArray64[6] = 64;
						}
					}
				}
			}
			if (arg5 - 1 > arg2) {
				local40 = arg4[arg2 + 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass324_4.method7429(local40 - 1);
					if (local50.anInt1744 != -1 && local50.aBoolean136) {
						local67 = arg10[arg2 + 1][arg0 + 1];
						local83 = --(arg9[arg2 + 1][arg0 + 1] * 2) & 0x7;
						local88 = Static14.method8200(local50, arg7);
						if (Static145.aBooleanArrayArray4[local67][local83]) {
							Static239.anIntArray274[4] = local50.anInt1744;
							Static581.anIntArray586[4] = local88;
							Static260.anIntArray286[4] = local50.anInt1740;
							Static526.anIntArray548[4] = local50.anInt1743;
							Static327.anIntArray490[4] = local50.anInt1741;
							Static60.anIntArray64[4] = 128;
						}
					}
				}
			}
		}
		@Pc(513) int local513;
		@Pc(518) int local518;
		@Pc(520) int local520;
		@Pc(481) byte local481;
		if (arg0 > 0) {
			local40 = arg4[arg2][arg0 - 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass324_4.method7429(local40 - 1);
				if (local50.anInt1744 != -1) {
					local67 = arg10[arg2][arg0 - 1];
					local481 = arg9[arg2][arg0 - 1];
					if (local50.aBoolean136) {
						local88 = 2;
						local513 = local481 * 2 + 4;
						local518 = Static14.method8200(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local88 &= 0x7;
							local513 &= 0x7;
							if (Static145.aBooleanArrayArray4[local67][local513] && local50.anInt1741 >= Static327.anIntArray490[local88]) {
								Static239.anIntArray274[local88] = local50.anInt1744;
								Static581.anIntArray586[local88] = local518;
								Static260.anIntArray286[local88] = local50.anInt1740;
								Static526.anIntArray548[local88] = local50.anInt1743;
								if (Static327.anIntArray490[local88] == local50.anInt1741) {
									Static60.anIntArray64[local88] |= 0x20;
								} else {
									Static60.anIntArray64[local88] = 32;
								}
								Static327.anIntArray490[local88] = local50.anInt1741;
							}
							local88--;
							local513++;
						}
						if (!local24[arg11 & 0x3]) {
							arg1[0] = Static81.aBooleanArrayArray11[local67][local481 + 2 & 0x3];
						}
					} else if (!local24[arg11 & 0x3]) {
						arg1[0] = Static47.aBooleanArrayArray1[local67][local481 + 2 & 0x3];
					}
				}
			}
		}
		if (arg3 - 1 > arg0) {
			local40 = arg4[arg2][arg0 + 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass324_4.method7429(local40 - 1);
				if (local50.anInt1744 != -1) {
					local67 = arg10[arg2][arg0 + 1];
					local481 = arg9[arg2][arg0 + 1];
					if (local50.aBoolean136) {
						local88 = 4;
						local513 = local481 * 2 + 2;
						local518 = Static14.method8200(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local88 &= 0x7;
							local513 &= 0x7;
							if (Static145.aBooleanArrayArray4[local67][local513] && local50.anInt1741 >= Static327.anIntArray490[local88]) {
								Static239.anIntArray274[local88] = local50.anInt1744;
								Static581.anIntArray586[local88] = local518;
								Static260.anIntArray286[local88] = local50.anInt1740;
								Static526.anIntArray548[local88] = local50.anInt1743;
								if (local50.anInt1741 == Static327.anIntArray490[local88]) {
									Static60.anIntArray64[local88] |= 0x10;
								} else {
									Static60.anIntArray64[local88] = 16;
								}
								Static327.anIntArray490[local88] = local50.anInt1741;
							}
							local513--;
							local88++;
						}
						if (!local24[arg11 + 2 & 0x3]) {
							arg1[2] = Static81.aBooleanArrayArray11[local67][--local481 & 0x3];
						}
					} else if (!local24[arg11 + 2 & 0x3]) {
						arg1[2] = Static47.aBooleanArrayArray1[local67][--local481 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local40 = arg4[arg2 - 1][arg0] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass324_4.method7429(local40 - 1);
				if (local50.anInt1744 != -1) {
					local67 = arg10[arg2 - 1][arg0];
					local481 = arg9[arg2 - 1][arg0];
					if (local50.aBoolean136) {
						local88 = 6;
						local513 = local481 * 2 + 4;
						local518 = Static14.method8200(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local88 &= 0x7;
							local513 &= 0x7;
							if (Static145.aBooleanArrayArray4[local67][local513] && Static327.anIntArray490[local88] <= local50.anInt1741) {
								Static239.anIntArray274[local88] = local50.anInt1744;
								Static581.anIntArray586[local88] = local518;
								Static260.anIntArray286[local88] = local50.anInt1740;
								Static526.anIntArray548[local88] = local50.anInt1743;
								if (Static327.anIntArray490[local88] == local50.anInt1741) {
									Static60.anIntArray64[local88] |= 0x8;
								} else {
									Static60.anIntArray64[local88] = 8;
								}
								Static327.anIntArray490[local88] = local50.anInt1741;
							}
							local88++;
							local513--;
						}
						if (!local24[arg11 + 3 & 0x3]) {
							arg1[3] = Static81.aBooleanArrayArray11[local67][local481 + 1 & 0x3];
						}
					} else if (!local24[arg11 + 3 & 0x3]) {
						arg1[3] = Static47.aBooleanArrayArray1[local67][local481 + 1 & 0x3];
					}
				}
			}
		}
		if (arg5 - 1 > arg2) {
			local40 = arg4[arg2 + 1][arg0] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass324_4.method7429(local40 - 1);
				if (local50.anInt1744 != -1) {
					local67 = arg10[arg2 + 1][arg0];
					local481 = arg9[arg2 + 1][arg0];
					if (local50.aBoolean136) {
						local88 = 4;
						local513 = local481 * 2 + 6;
						local518 = Static14.method8200(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local513 &= 0x7;
							local88 &= 0x7;
							if (Static145.aBooleanArrayArray4[local67][local513] && local50.anInt1741 >= Static327.anIntArray490[local88]) {
								Static239.anIntArray274[local88] = local50.anInt1744;
								Static581.anIntArray586[local88] = local518;
								Static260.anIntArray286[local88] = local50.anInt1740;
								Static526.anIntArray548[local88] = local50.anInt1743;
								if (Static327.anIntArray490[local88] == local50.anInt1741) {
									Static60.anIntArray64[local88] |= 0x4;
								} else {
									Static60.anIntArray64[local88] = 4;
								}
								Static327.anIntArray490[local88] = local50.anInt1741;
							}
							local513++;
							local88--;
						}
						if (!local24[arg11 + 1 & 0x3]) {
							arg1[1] = Static81.aBooleanArrayArray11[local67][local481 + 3 & 0x3];
						}
					} else if (!local24[arg11 + 1 & 0x3]) {
						arg1[1] = Static47.aBooleanArrayArray1[local67][local481 + 3 & 0x3];
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		local40 = Static14.method8200(arg12, arg7);
		if (!arg12.aBoolean136) {
			return;
		}
		for (@Pc(1173) int local1173 = 0; local1173 < 8; local1173++) {
			@Pc(1184) int local1184 = local1173 - arg11 * 2 & 0x7;
			if (Static145.aBooleanArrayArray4[arg8][local1173] && Static327.anIntArray490[local1184] <= arg12.anInt1741) {
				Static239.anIntArray274[local1184] = arg12.anInt1744;
				Static581.anIntArray586[local1184] = local40;
				Static260.anIntArray286[local1184] = arg12.anInt1740;
				Static526.anIntArray548[local1184] = arg12.anInt1743;
				if (Static327.anIntArray490[local1184] == arg12.anInt1741) {
					Static60.anIntArray64[local1184] |= 0x2;
				} else {
					Static60.anIntArray64[local1184] = 2;
				}
				Static327.anIntArray490[local1184] = arg12.anInt1741;
			}
		}
		return;
	}
}
