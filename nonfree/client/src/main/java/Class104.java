import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public class Class104 {

	@OriginalMember(owner = "client!um", name = "s", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
	private final int[] anIntArray150 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!um", name = "v", descriptor = "[I")
	private final int[] anIntArray151 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Lclient!qha;")
	private final Class289 aClass289_3;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "I")
	protected final int anInt2531;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "Z")
	public final boolean aBoolean199;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "I")
	protected final int anInt2535;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Lclient!au;")
	private final Class23 aClass23_2;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "I")
	public final int anInt2524;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!um", name = "G", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIZLclient!qha;Lclient!au;)V")
	protected Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class289 arg4, @OriginalArg(5) Class23 arg5) {
		this.aClass289_3 = arg4;
		this.anInt2531 = arg1;
		this.aBoolean199 = arg3;
		this.anInt2535 = arg2;
		this.aClass23_2 = arg5;
		this.anInt2524 = arg0;
		this.aByteArrayArrayArray12 = new byte[this.anInt2524][this.anInt2531][this.anInt2535];
		this.anIntArrayArrayArray2 = new int[this.anInt2524][this.anInt2531 + 1][this.anInt2535 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt2524][this.anInt2531 + 1][this.anInt2535 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt2524][this.anInt2531][this.anInt2535];
		this.aByteArrayArrayArray11 = new byte[this.anInt2524][this.anInt2531][this.anInt2535];
		this.aByteArrayArrayArray10 = new byte[this.anInt2524][this.anInt2531][this.anInt2535];
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIII)V")
	public final void method2147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg4; local7 < arg3 + arg4; local7++) {
			for (local11 = arg1; local11 < arg2 + arg1; local11++) {
				if (local11 >= 0 && this.anInt2531 > local11 && local7 >= 0 && local7 < this.anInt2535) {
					this.anIntArrayArrayArray2[arg0][local11][local7] = arg0 > 0 ? this.anIntArrayArrayArray2[arg0 - 1][local11][local7] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && this.anInt2531 > arg1) {
			for (local11 = arg4 + 1; local11 < arg4 + arg3; local11++) {
				if (local11 >= 0 && local11 < this.anInt2535) {
					this.anIntArrayArrayArray2[arg0][arg1][local11] = this.anIntArrayArrayArray2[arg0][arg1 - 1][local11];
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt2535) {
			for (local11 = arg1 + 1; local11 < arg2 + arg1; local11++) {
				if (local11 >= 0 && local11 < this.anInt2531) {
					this.anIntArrayArrayArray2[arg0][local11][arg4] = this.anIntArrayArrayArray2[arg0][local11][arg4 - 1];
				}
			}
		}
		if (arg1 < 0 || arg4 < 0 || this.anInt2531 <= arg1 || arg4 >= this.anInt2535) {
			return;
		}
		if (arg0 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4] != this.anIntArrayArrayArray2[arg0 - 1][arg1 - 1][arg4]) {
				this.anIntArrayArrayArray2[arg0][arg1][arg4] = this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray2[arg0][arg1][arg4 - 1] != this.anIntArrayArrayArray2[arg0 - 1][arg1][arg4 - 1]) {
				this.anIntArrayArrayArray2[arg0][arg1][arg4] = this.anIntArrayArrayArray2[arg0][arg1][arg4 - 1];
				return;
			}
			if (arg1 > 0 && arg4 > 0 && this.anIntArrayArrayArray2[arg0 - 1][arg1 - 1][arg4 - 1] != this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1]) {
				this.anIntArrayArrayArray2[arg0][arg1][arg4] = this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4] != 0) {
			this.anIntArrayArrayArray2[arg0][arg1][arg4] = this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray2[arg0][arg1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray2[arg0][arg1][arg4] = this.anIntArrayArrayArray2[arg0][arg1][arg4 - 1];
			return;
		}
		if (arg1 > 0 && arg4 > 0 && this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray2[arg0][arg1][arg4] = this.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[Lclient!up;IIIILclient!ofa;)V")
	public final void method2149(@OriginalArg(0) int arg0, @OriginalArg(1) Class352[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub22 arg5) {
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (!this.aBoolean199) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class352 local16 = arg1[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg2;
						local32 = local22 + arg3;
						if (local28 >= 0 && local28 < this.anInt2531 && local32 >= 0 && local32 < this.anInt2535) {
							local16.method8336(local28, local32);
						}
					}
				}
			}
		}
		@Pc(82) int local82 = arg4 + arg2;
		local18 = arg0 + arg3;
		for (local22 = 0; local22 < this.anInt2524; local22++) {
			for (local28 = 0; local28 < 64; local28++) {
				for (local32 = 0; local32 < 64; local32++) {
					this.method2161(local32 + local18, false, 0, local22, local28 + arg2, local82 + local28, 0, 0, arg3 + local32, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;II[[ILclient!s;)V")
	private void method2150(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class61 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2531; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2535; local7++) {
				if (Static149.anInt2602 == -1 || Static601.method8613(local7, Static149.anInt2602, arg3, local3)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray15[arg3][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray10[arg3][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray12[arg3][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray11[arg3][local3][local7] & 0xFF;
					@Pc(77) Class239 local77 = local51 == 0 ? null : this.aClass289_3.method6822(local51 - 1);
					if (local31 == 0 && local77 == null) {
						local31 = 12;
					}
					@Pc(101) Class297 local101 = local62 == 0 ? null : this.aClass23_2.method312(local62 - 1);
					@Pc(103) Class239 local103 = local77;
					if (local77 != null && local77.anInt5977 == -1 && local77.anInt5970 == -1) {
						local103 = local77;
						local77 = null;
					}
					if (local77 != null || local101 != null) {
						@Pc(125) int local125 = Static628.anIntArray594[local31];
						@Pc(129) int local129 = Static500.anIntArray484[local31];
						@Pc(141) int local141 = (local101 == null ? 0 : local125) + (local77 == null ? 0 : local129);
						@Pc(143) int local143 = 0;
						@Pc(145) int local145 = 0;
						@Pc(152) int local152 = local77 == null ? -1 : local77.anInt5979;
						@Pc(159) int local159 = local101 == null ? -1 : local101.anInt8069;
						@Pc(162) int[] local162 = new int[local141];
						@Pc(165) int[] local165 = new int[local141];
						@Pc(168) int[] local168 = new int[local141];
						@Pc(171) int[] local171 = new int[local141];
						@Pc(174) int[] local174 = new int[local141];
						@Pc(177) int[] local177 = new int[local141];
						@Pc(189) int[] local189 = local77 == null || local77.anInt5970 == -1 ? null : new int[local141];
						@Pc(199) int local199;
						if (local77 == null) {
							local145 = local129;
						} else {
							for (local199 = 0; local199 < local129; local199++) {
								local162[local143] = Static217.anIntArrayArray19[local31][local145];
								local165[local143] = Static338.anIntArrayArray39[local31][local145];
								local168[local143] = Static4.anIntArrayArray1[local31][local145];
								local174[local143] = local152;
								local177[local143] = local77.anInt5976;
								local171[local143] = local77.anInt5977;
								if (local189 != null) {
									local189[local143] = local77.anInt5970;
								}
								local145++;
								local143++;
							}
							if (!this.aBoolean199 && arg3 == 0) {
								Static631.method8920(local3, local7, local77.anInt5972, local77.anInt5971 * 8, local77.anInt5967);
							}
						}
						if (local101 != null) {
							for (local199 = 0; local199 < local125; local199++) {
								local162[local143] = Static217.anIntArrayArray19[local31][local145];
								local165[local143] = Static338.anIntArrayArray39[local31][local145];
								local168[local143] = Static4.anIntArrayArray1[local31][local145];
								local174[local143] = local159;
								local177[local143] = local101.anInt8066;
								local171[local143] = arg4[local3][local7];
								if (local189 != null) {
									local189[local143] = local171[local143];
								}
								local145++;
								local143++;
							}
						}
						local199 = this.anIntArray150.length;
						@Pc(347) int[] local347 = new int[local199];
						@Pc(350) int[] local350 = new int[local199];
						@Pc(357) int[] local357 = arg2 == null ? null : new int[local199];
						@Pc(366) int[] local366 = arg2 == null && arg0 == null ? null : new int[local199];
						@Pc(375) int local375;
						@Pc(380) int local380;
						@Pc(464) int local464;
						@Pc(472) int local472;
						for (@Pc(368) int local368 = 0; local368 < local199; local368++) {
							local375 = this.anIntArray150[local368];
							local380 = this.anIntArray151[local368];
							if (local40 == 0) {
								local347[local368] = local375;
								local350[local368] = local380;
							} else if (local40 == 1) {
								local347[local368] = local380;
								local350[local368] = 512 - local375;
							} else if (local40 == 2) {
								local347[local368] = 512 - local375;
								local350[local368] = 512 - local380;
							} else if (local40 == 3) {
								local347[local368] = 512 - local380;
								local350[local368] = local375;
							}
							if (local357 != null && Static299.aBooleanArrayArray5[local31][local368]) {
								local464 = (local3 << 9) + local347[local368];
								local472 = local350[local368] + (local7 << 9);
								local357[local368] = arg2.method8584(local472, local464) - arg5.method8584(local472, local464);
							}
							if (local366 != null) {
								if (arg2 != null && !Static299.aBooleanArrayArray5[local31][local368]) {
									local464 = local347[local368] + (local3 << 9);
									local472 = (local7 << 9) + local350[local368];
									local366[local368] = arg5.method8584(local472, local464) - arg2.method8584(local472, local464);
								} else if (arg0 != null && !Static157.aBooleanArrayArray2[local31][local368]) {
									local464 = local347[local368] + (local3 << 9);
									local472 = local350[local368] + (local7 << 9);
									local366[local368] = arg0.method8584(local472, local464) - arg5.method8584(local472, local464);
								}
							}
						}
						local375 = arg5.method8580(local7, local3);
						local380 = arg5.method8580(local7, local3 + 1);
						local464 = arg5.method8580(local7 + 1, local3 + 1);
						local472 = arg5.method8580(local7 + 1, local3);
						@Pc(608) boolean local608 = Static23.method285(local3, local7);
						if (local608 && arg3 > 1 || !local608 && arg3 > 0) {
							@Pc(624) boolean local624 = true;
							if (local101 != null && !local101.aBoolean585) {
								local624 = false;
							} else if (local62 == 0 && local31 != 0) {
								local624 = false;
							} else if (local51 > 0 && local103 != null && !local103.aBoolean433) {
								local624 = false;
							}
							if (local624 && local380 == local375 && local375 == local464 && local375 == local472) {
								this.aByteArrayArrayArray13[arg3][local3][local7] = (byte) (this.aByteArrayArrayArray13[arg3][local3][local7] | 0x4);
							}
						}
						@Pc(688) int local688 = 0;
						@Pc(690) int local690 = 0;
						@Pc(692) int local692 = 0;
						if (this.aBoolean199) {
							local688 = Static251.method4163(local3, local7);
							local690 = Static613.method8743(local3, local7);
							local692 = Static626.method5555(local3, local7);
						}
						arg5.method8585(local3, local7, local347, local357, local350, local366, local162, local165, local168, local171, local189, local174, local177, local688, local690, local692);
						Static308.method6295(arg3, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[Lclient!up;IIIIILclient!ofa;B)V")
	public final void method2151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class352[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5_Sub22 arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg4 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean199) {
			@Pc(24) Class352 local24 = arg2[arg6];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static337.method5087(local26 & 0x7, local30 & 0x7, arg7) + arg5;
					local56 = arg0 + Static442.method6692(local30 & 0x7, local26 & 0x7, arg7);
					if (local44 > 0 && this.anInt2531 - 1 > local44 && local56 > 0 && local56 < this.anInt2535 - 1) {
						local24.method8336(local44, local56);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg1 & 0x1FFFFFF8) << 3;
		local26 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (arg7 == 1) {
			local108 = 1;
		} else if (arg7 == 2) {
			local108 = 1;
			local106 = 1;
		} else if (arg7 == 3) {
			local106 = 1;
		}
		for (local56 = 0; local56 < this.anInt2524; local56++) {
			for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
				for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
					if (arg3 == local56 && local11 <= local139 && local11 + 8 >= local139 && local17 <= local143 && local17 + 8 >= local143) {
						@Pc(218) int local218;
						@Pc(208) int local208;
						if (local11 + 8 == local139 || local17 + 8 == local143) {
							if (arg7 == 0) {
								local218 = local139 + arg5 - local11;
								local208 = arg0 + local143 - local17;
							} else if (arg7 == 1) {
								local208 = local11 + arg0 + 8 - local139;
								local218 = local143 + arg5 - local17;
							} else if (arg7 == 2) {
								local218 = local11 + arg5 + 8 - local139;
								local208 = arg0 + local17 + 8 - local143;
							} else {
								local208 = arg0 + local139 - local11;
								local218 = arg5 + local17 + 8 - local143;
							}
							this.method2161(local143 + local26, true, 0, arg6, local218, local139 + local98, 0, 0, local208, arg8);
						} else {
							local218 = Static337.method5087(local139 & 0x7, local143 & 0x7, arg7) + arg5;
							local208 = Static442.method6692(local143 & 0x7, local139 & 0x7, arg7) + arg0;
							this.method2161(local143 + local26, false, arg7, arg6, local218, local98 + local139, local108, local106, local208, arg8);
						}
						if (local139 == 63 || local143 == 63) {
							@Pc(338) byte local338 = 1;
							if (local139 == 63 && local143 == 63) {
								local338 = 3;
							}
							for (@Pc(350) int local350 = 0; local350 < local338; local350++) {
								@Pc(354) int local354 = local139;
								@Pc(356) int local356 = local143;
								if (local350 == 0) {
									local356 = local143 == 63 ? 64 : local143;
									local354 = local139 == 63 ? 64 : local139;
								} else if (local350 == 1) {
									local354 = 64;
								} else if (local350 == 2) {
									local356 = 64;
								}
								@Pc(409) int local409;
								@Pc(402) int local402;
								if (arg7 == 0) {
									local402 = arg0 + local356 - local17;
									local409 = arg5 + local354 - local11;
								} else if (arg7 == 1) {
									local402 = arg0 + local11 + 8 - local354;
									local409 = local356 + arg5 - local17;
								} else if (arg7 == 2) {
									local402 = arg0 + local17 + 8 - local356;
									local409 = arg5 + local11 + 8 - local354;
								} else {
									local409 = arg5 + local17 + 8 - local356;
									local402 = arg0 + local354 - local11;
								}
								if (local409 >= 0 && this.anInt2531 > local409 && local402 >= 0 && local402 < this.anInt2535) {
									this.anIntArrayArrayArray2[arg6][local409][local402] = this.anIntArrayArrayArray2[arg6][local106 + local218][local108 + local208];
								}
							}
						}
					} else {
						this.method2161(0, false, 0, 0, -1, 0, 0, 0, -1, arg8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIII)V")
	public final void method2152(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2524; local3++) {
			this.method2147(local3, arg1, 64, 64, arg0);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!ha;[Lclient!up;[[[IB)V")
	public final void method2155(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class352[] arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean199) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt2531; local10++) {
					for (local14 = 0; local14 < this.anInt2535; local14++) {
						if ((Static305.aByteArrayArrayArray18[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static305.aByteArrayArrayArray18[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method8350(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt2524; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean199) {
				if (Static214.aBoolean304) {
					local14 = 8;
				}
				if (Static513.aBoolean54) {
					local10 = 2;
				}
				if (Static268.anInt4813 != 0) {
					local10 |= 0x1;
					if (local6 == 0 | Static506.aBoolean649) {
						local14 |= 0x10;
					}
				}
			}
			if (Static513.aBoolean54) {
				local14 |= 0x7;
			}
			if (!Static633.aBoolean756) {
				local14 |= 0x20;
			}
			@Pc(155) int[][] local155 = arg2 == null || local6 >= arg2.length ? this.anIntArrayArrayArray2[local6] : arg2[local6];
			Static397.method5886(local6, arg0.method7277(this.anInt2531, this.anInt2535, this.anIntArrayArrayArray2[local6], local155, local10, local14));
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!ha;Lclient!s;Lclient!s;)V")
	public final void method2158(@OriginalArg(1) Class133 arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) Class61 arg2) {
		if (Static236.anIntArray217 == null || Static236.anIntArray217.length != this.anInt2535) {
			Static236.anIntArray217 = new int[this.anInt2535];
			Static465.anIntArray443 = new int[this.anInt2535];
			Static139.anIntArray146 = new int[this.anInt2535];
			Static283.anIntArray270 = new int[this.anInt2535];
			Static170.anIntArray170 = new int[this.anInt2535];
		}
		@Pc(42) int[][] local42 = new int[this.anInt2531][this.anInt2535];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt2524; local44++) {
			for (local48 = 0; local48 < this.anInt2535; local48++) {
				Static236.anIntArray217[local48] = 0;
				Static283.anIntArray270[local48] = 0;
				Static465.anIntArray443[local48] = 0;
				Static170.anIntArray170[local48] = 0;
				Static139.anIntArray146[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt2531; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(179) int local179;
				for (@Pc(85) int local85 = 0; local85 < this.anInt2535; local85++) {
					local91 = local81 + 5;
					@Pc(159) int local159;
					if (this.anInt2531 > local91) {
						local110 = this.aByteArrayArrayArray11[local44][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class297 local123 = this.aClass23_2.method312(local110 - 1);
							Static236.anIntArray217[local85] += local123.anInt8075;
							Static283.anIntArray270[local85] += local123.anInt8070;
							Static465.anIntArray443[local85] += local123.anInt8067;
							Static170.anIntArray170[local85] += local123.anInt8074;
							local159 = Static139.anIntArray146[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local179 = this.aByteArrayArrayArray11[local44][local110][local85] & 0xFF;
						if (local179 > 0) {
							@Pc(189) Class297 local189 = this.aClass23_2.method312(local179 - 1);
							Static236.anIntArray217[local85] -= local189.anInt8075;
							Static283.anIntArray270[local85] -= local189.anInt8070;
							Static465.anIntArray443[local85] -= local189.anInt8067;
							Static170.anIntArray170[local85] -= local189.anInt8074;
							local159 = Static139.anIntArray146[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local179 = 0;
					@Pc(250) int local250 = 0;
					@Pc(252) int local252 = 0;
					for (@Pc(254) int local254 = -5; local254 < this.anInt2535; local254++) {
						@Pc(260) int local260 = local254 + 5;
						if (this.anInt2535 > local260) {
							local91 += Static236.anIntArray217[local260];
							local250 += Static170.anIntArray170[local260];
							local252 += Static139.anIntArray146[local260];
							local179 += Static465.anIntArray443[local260];
							local110 += Static283.anIntArray270[local260];
						}
						@Pc(302) int local302 = local254 - 5;
						if (local302 >= 0) {
							local179 -= Static465.anIntArray443[local302];
							local91 -= Static236.anIntArray217[local302];
							local110 -= Static283.anIntArray270[local302];
							local250 -= Static170.anIntArray170[local302];
							local252 -= Static139.anIntArray146[local302];
						}
						if (local254 >= 0 && local250 > 0 && local252 > 0) {
							local42[local81][local254] = Static553.method8055(local91 * 256 / local250, local110 / local252, local179 / local252);
						}
					}
				}
			}
			if (Static589.aBoolean383) {
				this.method2162(local44, local44 == 0 ? arg1 : null, arg0, local42, local44 == 0 ? arg2 : null, Static11.aClass61Array1[local44]);
			} else {
				this.method2150(local44 == 0 ? arg1 : null, arg0, local44 == 0 ? arg2 : null, local44, local42, Static11.aClass61Array1[local44]);
			}
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
		}
		if (!this.aBoolean199) {
			if (Static268.anInt4813 != 0) {
				Static58.method966();
			}
			if (Static513.aBoolean54) {
				Static637.method7521();
			}
		}
		for (local48 = 0; local48 < this.anInt2524; local48++) {
			Static11.aClass61Array1[local48].YA();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([[IBI)V")
	public final void method2159(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2531 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2535 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[[BILclient!mw;Lclient!ha;II[[BZ[[B[ZILclient!rc;I)V")
	private void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) Class133 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class297 arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg3 != null && arg3.aBoolean431 ? Static583.aBooleanArrayArray9[arg12] : Static462.aBooleanArrayArray7[arg12];
		@Pc(40) int local40;
		@Pc(53) Class239 local53;
		@Pc(70) byte local70;
		@Pc(86) int local86;
		@Pc(91) int local91;
		if (arg0 > 0) {
			if (arg10 > 0) {
				local40 = arg7[arg10 - 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass289_3.method6822(local40 - 1);
					if (local53.anInt5977 != -1 && local53.aBoolean431) {
						local70 = arg1[arg10 - 1][arg0 - 1];
						local86 = arg8[arg10 - 1][arg0 - 1] * 2 + 4 & 0x7;
						local91 = Static329.method2415(local53, arg4);
						if (Static299.aBooleanArrayArray5[local70][local86]) {
							Static509.anIntArray489[0] = local53.anInt5977;
							Static103.anIntArray126[0] = local91;
							Static642.anIntArray577[0] = local53.anInt5979;
							Static383.anIntArray352[0] = local53.anInt5976;
							Static398.anIntArray368[0] = local53.anInt5973;
							Static504.anIntArray488[0] = 256;
						}
					}
				}
			}
			if (arg5 - 1 > arg10) {
				local40 = arg7[arg10 + 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass289_3.method6822(local40 - 1);
					if (local53.anInt5977 != -1 && local53.aBoolean431) {
						local70 = arg1[arg10 + 1][arg0 - 1];
						local86 = arg8[arg10 + 1][arg0 - 1] * 2 + 6 & 0x7;
						local91 = Static329.method2415(local53, arg4);
						if (Static299.aBooleanArrayArray5[local70][local86]) {
							Static509.anIntArray489[2] = local53.anInt5977;
							Static103.anIntArray126[2] = local91;
							Static642.anIntArray577[2] = local53.anInt5979;
							Static383.anIntArray352[2] = local53.anInt5976;
							Static398.anIntArray368[2] = local53.anInt5973;
							Static504.anIntArray488[2] = 512;
						}
					}
				}
			}
		}
		if (arg2 - 1 > arg0) {
			if (arg10 > 0) {
				local40 = arg7[arg10 - 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass289_3.method6822(local40 - 1);
					if (local53.anInt5977 != -1 && local53.aBoolean431) {
						local70 = arg1[arg10 - 1][arg0 + 1];
						local86 = arg8[arg10 - 1][arg0 + 1] * 2 + 2 & 0x7;
						local91 = Static329.method2415(local53, arg4);
						if (Static299.aBooleanArrayArray5[local70][local86]) {
							Static509.anIntArray489[6] = local53.anInt5977;
							Static103.anIntArray126[6] = local91;
							Static642.anIntArray577[6] = local53.anInt5979;
							Static383.anIntArray352[6] = local53.anInt5976;
							Static398.anIntArray368[6] = local53.anInt5973;
							Static504.anIntArray488[6] = 64;
						}
					}
				}
			}
			if (arg5 - 1 > arg10) {
				local40 = arg7[arg10 + 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass289_3.method6822(local40 - 1);
					if (local53.anInt5977 != -1 && local53.aBoolean431) {
						local70 = arg1[arg10 + 1][arg0 + 1];
						local86 = --(arg8[arg10 + 1][arg0 + 1] * 2) & 0x7;
						local91 = Static329.method2415(local53, arg4);
						if (Static299.aBooleanArrayArray5[local70][local86]) {
							Static509.anIntArray489[4] = local53.anInt5977;
							Static103.anIntArray126[4] = local91;
							Static642.anIntArray577[4] = local53.anInt5979;
							Static383.anIntArray352[4] = local53.anInt5976;
							Static398.anIntArray368[4] = local53.anInt5973;
							Static504.anIntArray488[4] = 128;
						}
					}
				}
			}
		}
		@Pc(516) int local516;
		@Pc(521) int local521;
		@Pc(523) int local523;
		@Pc(485) byte local485;
		if (arg0 > 0) {
			local40 = arg7[arg10][arg0 - 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass289_3.method6822(local40 - 1);
				if (local53.anInt5977 != -1) {
					local70 = arg1[arg10][arg0 - 1];
					local485 = arg8[arg10][arg0 - 1];
					if (local53.aBoolean431) {
						local91 = 2;
						local516 = local485 * 2 + 4;
						local521 = Static329.method2415(local53, arg4);
						for (local523 = 0; local523 < 3; local523++) {
							local516 &= 0x7;
							local91 &= 0x7;
							if (Static299.aBooleanArrayArray5[local70][local516] && Static398.anIntArray368[local91] <= local53.anInt5973) {
								Static509.anIntArray489[local91] = local53.anInt5977;
								Static103.anIntArray126[local91] = local521;
								Static642.anIntArray577[local91] = local53.anInt5979;
								Static383.anIntArray352[local91] = local53.anInt5976;
								if (Static398.anIntArray368[local91] == local53.anInt5973) {
									Static504.anIntArray488[local91] |= 0x20;
								} else {
									Static504.anIntArray488[local91] = 32;
								}
								Static398.anIntArray368[local91] = local53.anInt5973;
							}
							local516++;
							local91--;
						}
						if (!local18[arg6 & 0x3]) {
							arg9[0] = Static583.aBooleanArrayArray9[local70][local485 + 2 & 0x3];
						}
					} else if (!local18[arg6 & 0x3]) {
						arg9[0] = Static462.aBooleanArrayArray7[local70][local485 + 2 & 0x3];
					}
				}
			}
		}
		if (arg0 < arg2 - 1) {
			local40 = arg7[arg10][arg0 + 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass289_3.method6822(local40 - 1);
				if (local53.anInt5977 != -1) {
					local70 = arg1[arg10][arg0 + 1];
					local485 = arg8[arg10][arg0 + 1];
					if (local53.aBoolean431) {
						local91 = 4;
						local516 = local485 * 2 + 2;
						local521 = Static329.method2415(local53, arg4);
						for (local523 = 0; local523 < 3; local523++) {
							local91 &= 0x7;
							local516 &= 0x7;
							if (Static299.aBooleanArrayArray5[local70][local516] && local53.anInt5973 >= Static398.anIntArray368[local91]) {
								Static509.anIntArray489[local91] = local53.anInt5977;
								Static103.anIntArray126[local91] = local521;
								Static642.anIntArray577[local91] = local53.anInt5979;
								Static383.anIntArray352[local91] = local53.anInt5976;
								if (local53.anInt5973 == Static398.anIntArray368[local91]) {
									Static504.anIntArray488[local91] |= 0x10;
								} else {
									Static504.anIntArray488[local91] = 16;
								}
								Static398.anIntArray368[local91] = local53.anInt5973;
							}
							local91++;
							local516--;
						}
						if (!local18[arg6 + 2 & 0x3]) {
							arg9[2] = Static583.aBooleanArrayArray9[local70][local485 & 0x3];
						}
					} else if (!local18[arg6 + 2 & 0x3]) {
						arg9[2] = Static462.aBooleanArrayArray7[local70][--local485 & 0x3];
					}
				}
			}
		}
		if (arg10 > 0) {
			local40 = arg7[arg10 - 1][arg0] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass289_3.method6822(local40 - 1);
				if (local53.anInt5977 != -1) {
					local70 = arg1[arg10 - 1][arg0];
					local485 = arg8[arg10 - 1][arg0];
					if (local53.aBoolean431) {
						local91 = 6;
						local516 = local485 * 2 + 4;
						local521 = Static329.method2415(local53, arg4);
						for (local523 = 0; local523 < 3; local523++) {
							local91 &= 0x7;
							local516 &= 0x7;
							if (Static299.aBooleanArrayArray5[local70][local516] && local53.anInt5973 >= Static398.anIntArray368[local91]) {
								Static509.anIntArray489[local91] = local53.anInt5977;
								Static103.anIntArray126[local91] = local521;
								Static642.anIntArray577[local91] = local53.anInt5979;
								Static383.anIntArray352[local91] = local53.anInt5976;
								if (Static398.anIntArray368[local91] == local53.anInt5973) {
									Static504.anIntArray488[local91] |= 0x8;
								} else {
									Static504.anIntArray488[local91] = 8;
								}
								Static398.anIntArray368[local91] = local53.anInt5973;
							}
							local91++;
							local516--;
						}
						if (!local18[arg6 + 3 & 0x3]) {
							arg9[3] = Static583.aBooleanArrayArray9[local70][local485 + 1 & 0x3];
						}
					} else if (!local18[arg6 + 3 & 0x3]) {
						arg9[3] = Static462.aBooleanArrayArray7[local70][local485 + 1 & 0x3];
					}
				}
			}
		}
		if (arg10 < arg5 - 1) {
			local40 = arg7[arg10 + 1][arg0] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass289_3.method6822(local40 - 1);
				if (local53.anInt5977 != -1) {
					local70 = arg1[arg10 + 1][arg0];
					local485 = arg8[arg10 + 1][arg0];
					if (local53.aBoolean431) {
						local91 = 4;
						local516 = local485 * 2 + 6;
						local521 = Static329.method2415(local53, arg4);
						for (local523 = 0; local523 < 3; local523++) {
							local91 &= 0x7;
							local516 &= 0x7;
							if (Static299.aBooleanArrayArray5[local70][local516] && local53.anInt5973 >= Static398.anIntArray368[local91]) {
								Static509.anIntArray489[local91] = local53.anInt5977;
								Static103.anIntArray126[local91] = local521;
								Static642.anIntArray577[local91] = local53.anInt5979;
								Static383.anIntArray352[local91] = local53.anInt5976;
								if (local53.anInt5973 == Static398.anIntArray368[local91]) {
									Static504.anIntArray488[local91] |= 0x4;
								} else {
									Static504.anIntArray488[local91] = 4;
								}
								Static398.anIntArray368[local91] = local53.anInt5973;
							}
							local91--;
							local516++;
						}
						if (!local18[arg6 + 1 & 0x3]) {
							arg9[1] = Static583.aBooleanArrayArray9[local70][local485 + 3 & 0x3];
						}
					} else if (!local18[arg6 + 1 & 0x3]) {
						arg9[1] = Static462.aBooleanArrayArray7[local70][local485 + 3 & 0x3];
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		local40 = Static329.method2415(arg3, arg4);
		if (!arg3.aBoolean431) {
			return;
		}
		for (@Pc(1176) int local1176 = 0; local1176 < 8; local1176++) {
			@Pc(1187) int local1187 = local1176 - arg6 * 2 & 0x7;
			if (Static299.aBooleanArrayArray5[arg12][local1176] && arg3.anInt5973 >= Static398.anIntArray368[local1187]) {
				Static509.anIntArray489[local1187] = arg3.anInt5977;
				Static103.anIntArray126[local1187] = local40;
				Static642.anIntArray577[local1187] = arg3.anInt5979;
				Static383.anIntArray352[local1187] = arg3.anInt5976;
				if (arg3.anInt5973 == Static398.anIntArray368[local1187]) {
					Static504.anIntArray488[local1187] |= 0x2;
				} else {
					Static504.anIntArray488[local1187] = 2;
				}
				Static398.anIntArray368[local1187] = arg3.anInt5973;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIIIIIIIILclient!ofa;)V")
	private void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class5_Sub22 arg9) {
		if (arg2 == 1) {
			arg6 = 1;
		} else if (arg2 == 2) {
			arg7 = 1;
			arg6 = 1;
		} else if (arg2 == 3) {
			arg7 = 1;
		}
		@Pc(51) int local51;
		if (arg4 < 0 || this.anInt2531 <= arg4 || arg8 < 0 || this.anInt2535 <= arg8) {
			while (true) {
				local51 = arg9.method5966();
				if (local51 == 0) {
					break;
				}
				if (local51 == 1) {
					arg9.method5966();
					break;
				}
				if (local51 <= 49) {
					arg9.method5966();
				}
			}
			return;
		}
		if (!this.aBoolean199 && !arg1) {
			Static305.aByteArrayArrayArray18[arg3][arg4][arg8] = 0;
		}
		while (true) {
			local51 = arg9.method5966();
			if (local51 == 0) {
				if (this.aBoolean199) {
					this.anIntArrayArrayArray2[0][arg4 + arg7][arg8 + arg6] = 0;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray2[0][arg7 + arg4][arg6 + arg8] = -Static365.method4248(arg0 + 556238, arg5 + 932731) * 8 << 2;
				} else {
					this.anIntArrayArrayArray2[arg3][arg4 + arg7][arg6 + arg8] = this.anIntArrayArrayArray2[arg3 - 1][arg7 + arg4][arg8 + arg6] - 960;
				}
				break;
			}
			if (local51 == 1) {
				@Pc(187) int local187 = arg9.method5966();
				if (this.aBoolean199) {
					this.anIntArrayArrayArray2[0][arg7 + arg4][arg6 + arg8] = local187 * 8 << 2;
				} else {
					if (local187 == 1) {
						local187 = 0;
					}
					if (arg3 == 0) {
						this.anIntArrayArrayArray2[0][arg4 + arg7][arg8 + arg6] = -local187 * 8 << 2;
					} else {
						this.anIntArrayArrayArray2[arg3][arg4 + arg7][arg8 + arg6] = this.anIntArrayArrayArray2[arg3 - 1][arg4 + arg7][arg8 + arg6] - (local187 * 8 << 2);
					}
				}
				break;
			}
			if (local51 <= 49) {
				if (arg1) {
					arg9.method5966();
				} else {
					this.aByteArrayArrayArray12[arg3][arg4][arg8] = arg9.method5963();
					this.aByteArrayArrayArray15[arg3][arg4][arg8] = (byte) ((local51 - 2) / 4);
					this.aByteArrayArrayArray10[arg3][arg4][arg8] = (byte) (arg2 + local51 - 2 & 0x3);
				}
			} else if (local51 <= 81) {
				if (!this.aBoolean199 && !arg1) {
					Static305.aByteArrayArrayArray18[arg3][arg4][arg8] = (byte) (local51 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray11[arg3][arg4][arg8] = (byte) (local51 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!s;Lclient!ha;[[ILclient!s;Lclient!s;)V")
	private void method2162(@OriginalArg(0) int arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) Class133 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class61 arg4, @OriginalArg(6) Class61 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray15[arg0];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray10[arg0];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray11[arg0];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray12[arg0];
		for (@Pc(35) int local35 = 0; local35 < this.anInt2531; local35++) {
			@Pc(49) int local49 = local35 < this.anInt2531 - 1 ? local35 + 1 : local35;
			for (@Pc(51) int local51 = 0; local51 < this.anInt2535; local51++) {
				@Pc(69) int local69 = this.anInt2535 - 1 <= local51 ? local51 : local51 + 1;
				if (Static149.anInt2602 == -1 || Static601.method8613(local51, Static149.anInt2602, arg0, local35)) {
					@Pc(83) boolean local83 = false;
					@Pc(85) boolean local85 = false;
					@Pc(88) boolean[] local88 = new boolean[4];
					@Pc(94) int local94 = local10[local35][local51];
					@Pc(100) int local100 = local15[local35][local51];
					@Pc(108) int local108 = local33[local35][local51] & 0xFF;
					@Pc(116) int local116 = local28[local35][local51] & 0xFF;
					@Pc(124) int local124 = local28[local35][local69] & 0xFF;
					@Pc(132) int local132 = local28[local49][local69] & 0xFF;
					@Pc(140) int local140 = local28[local49][local51] & 0xFF;
					if (local108 != 0 || local116 != 0) {
						@Pc(162) Class239 local162 = local108 == 0 ? null : this.aClass289_3.method6822(local108 - 1);
						if (local94 == 0 && local162 == null) {
							local94 = 12;
						}
						@Pc(183) Class297 local183 = local116 == 0 ? null : this.aClass23_2.method312(local116 - 1);
						@Pc(185) Class239 local185 = local162;
						if (local162 != null) {
							if (local162.anInt5977 == -1 && local162.anInt5970 == -1) {
								local185 = local162;
								local162 = null;
							} else if (local183 != null && local94 != 0) {
								local85 = local162.aBoolean431;
							}
						}
						@Pc(273) int local273;
						@Pc(309) int local309;
						@Pc(382) int local382;
						@Pc(392) int local392;
						if ((local94 == 0 || local94 == 12) && local35 > 0 && local51 > 0 && local35 < this.anInt2531 && local51 < this.anInt2535) {
							@Pc(256) int local256 = local28[local49][local69] == local116 ? 1 : -1;
							local273 = local116 == local28[local35 - 1][local51 - 1] ? 1 : -1;
							@Pc(288) int local288 = local28[local49][local51 - 1] == local116 ? 1 : -1;
							local309 = local28[local35 - 1][local69] == local116 ? 1 : -1;
							if (local28[local35][local51 - 1] == local116) {
								local288++;
								local273++;
							} else {
								local288--;
								local273--;
							}
							if (local28[local49][local51] == local116) {
								local288++;
								local256++;
							} else {
								local288--;
								local256--;
							}
							if (local28[local35][local69] == local116) {
								local256++;
								local309++;
							} else {
								local256--;
								local309--;
							}
							if (local116 == local28[local35 - 1][local51]) {
								local273++;
								local309++;
							} else {
								local273--;
								local309--;
							}
							local382 = local273 - local256;
							if (local382 < 0) {
								local382 = -local382;
							}
							local392 = local288 - local309;
							if (local392 < 0) {
								local392 = -local392;
							}
							if (local382 == local392) {
								local382 = arg5.method8580(local51, local35) - arg5.method8580(local69, local49);
								if (local382 < 0) {
									local382 = -local382;
								}
								local392 = arg5.method8580(local51, local49) - arg5.method8580(local69, local35);
								if (local392 < 0) {
									local392 = -local392;
								}
							}
							local100 = local382 < local392 ? 1 : 0;
						}
						for (local273 = 0; local273 < 13; local273++) {
							Static398.anIntArray368[local273] = -1;
							Static504.anIntArray488[local273] = 1;
						}
						@Pc(480) boolean[] local480 = local162 != null && local162.aBoolean431 ? Static583.aBooleanArrayArray9[local94] : Static462.aBooleanArrayArray7[local94];
						this.method2160(local51, local10, this.anInt2535, local162, arg2, this.anInt2531, local100, local33, local15, local88, local35, local183, local94);
						@Pc(509) boolean local509 = local162 != null && local162.anInt5970 != local162.anInt5977;
						if (!local509) {
							for (local309 = 0; local309 < 8; local309++) {
								if (Static398.anIntArray368[local309] >= 0 && Static103.anIntArray126[local309] != Static509.anIntArray489[local309]) {
									local509 = true;
									break;
								}
							}
						}
						if (!local480[local100 + 1 & 0x3]) {
							local88[1] = Static368.method5444(local88[1], (Static504.anIntArray488[4] & Static504.anIntArray488[2]) == 0);
						}
						if (!local480[local100 + 3 & 0x3]) {
							local88[3] = Static368.method5444(local88[3], (Static504.anIntArray488[6] & Static504.anIntArray488[0]) == 0);
						}
						if (!local480[local100 & 0x3]) {
							local88[0] = Static368.method5444(local88[0], (Static504.anIntArray488[0] & Static504.anIntArray488[2]) == 0);
						}
						if (!local480[local100 + 2 & 0x3]) {
							local88[2] = Static368.method5444(local88[2], (Static504.anIntArray488[6] & Static504.anIntArray488[4]) == 0);
						}
						if (!local85 && (local94 == 0 || local94 == 12)) {
							if (local88[0] && !local88[1] && !local88[2] && local88[3]) {
								local100 = 0;
								local94 = local94 == 0 ? 13 : 14;
								local88[0] = local88[3] = false;
							} else if (local88[0] && local88[1] && !local88[2] && !local88[3]) {
								local100 = 3;
								local88[0] = local88[1] = false;
								local94 = local94 == 0 ? 13 : 14;
							} else if (!local88[0] && local88[1] && local88[2] && !local88[3]) {
								local100 = 2;
								local94 = local94 == 0 ? 13 : 14;
								local88[1] = local88[2] = false;
							} else if (!local88[0] && !local88[1] && local88[2] && local88[3]) {
								local100 = 1;
								local88[2] = local88[3] = false;
								local94 = local94 == 0 ? 13 : 14;
							}
						}
						@Pc(820) boolean local820 = !local85 && !local88[0] && !local88[2] && !local88[1] && !local88[3];
						@Pc(822) int[] local822 = null;
						@Pc(846) int[] local846;
						@Pc(842) int[] local842;
						@Pc(858) int[] local858;
						if (local820) {
							local858 = Static4.anIntArrayArray1[local94];
							local842 = Static338.anIntArrayArray39[local94];
							local392 = local162 == null ? 0 : Static500.anIntArray484[local94];
							local382 = local183 == null ? 0 : Static628.anIntArray594[local94];
							local846 = Static217.anIntArrayArray19[local94];
						} else if (local85) {
							local822 = Static471.anIntArrayArray54[local94];
							local858 = Static592.anIntArrayArray69[local94];
							local382 = local183 == null ? 0 : Static2.anIntArray1[local94];
							local392 = local162 == null ? 0 : Static569.anIntArray527[local94];
							local846 = Static522.anIntArrayArray61[local94];
							local842 = Static90.anIntArrayArray8[local94];
						} else {
							local382 = local183 == null ? 0 : Static267.anIntArray240[local94];
							local822 = Static410.anIntArrayArray48[local94];
							local842 = Static512.anIntArrayArray60[local94];
							local846 = Static47.anIntArrayArray3[local94];
							local392 = local162 == null ? 0 : Static31.anIntArray20[local94];
							local858 = Static274.anIntArrayArray29[local94];
						}
						@Pc(924) int local924 = local382 + local392;
						if (local924 <= 0) {
							Static308.method6295(arg0, local35, local51);
						} else {
							if (local88[0]) {
								local924++;
							}
							if (local88[2]) {
								local924++;
							}
							if (local88[1]) {
								local924++;
							}
							if (local88[3]) {
								local924++;
							}
							@Pc(957) int local957 = 0;
							@Pc(959) int local959 = 0;
							@Pc(963) int local963 = local924 * 3;
							@Pc(970) int[] local970 = local509 ? new int[local963] : null;
							@Pc(973) int[] local973 = new int[local963];
							@Pc(976) int[] local976 = new int[local963];
							@Pc(979) int[] local979 = new int[local963];
							@Pc(982) int[] local982 = new int[local963];
							@Pc(985) int[] local985 = new int[local963];
							@Pc(992) int[] local992 = arg4 == null ? null : new int[local963];
							@Pc(1001) int[] local1001 = arg4 == null && arg1 == null ? null : new int[local963];
							@Pc(1003) int local1003 = -1;
							@Pc(1005) int local1005 = -1;
							@Pc(1007) int local1007 = 256;
							@Pc(1069) byte local1069;
							@Pc(1023) int local1023;
							@Pc(1025) int local1025;
							@Pc(1252) int local1252;
							@Pc(1258) int local1258;
							@Pc(1266) int local1266;
							@Pc(1271) int local1271;
							@Pc(1283) int local1283;
							@Pc(1276) int local1276;
							@Pc(1288) int local1288;
							@Pc(1343) int local1343;
							@Pc(1349) int local1349;
							if (local162 != null) {
								local1007 = local162.anInt5976;
								local1005 = local162.anInt5979;
								local1003 = local162.anInt5977;
								local1023 = Static329.method2415(local162, arg2);
								for (local1025 = 0; local1025 < local392; local1025++) {
									if (local88[-local100 & 0x3] && local822[0] == local957) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 1;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 1;
										Static6.anIntArray3[4] = local842[local957];
										local1069 = 6;
										Static6.anIntArray3[5] = local858[local957];
									} else if (local88[2 - local100 & 0x3] && local822[2] == local957) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 5;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 5;
										Static6.anIntArray3[4] = local842[local957];
										Static6.anIntArray3[5] = local858[local957];
										local1069 = 6;
									} else if (local88[1 - local100 & 0x3] && local822[1] == local957) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 3;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 3;
										Static6.anIntArray3[4] = local842[local957];
										Static6.anIntArray3[5] = local858[local957];
										local1069 = 6;
									} else if (local88[3 - local100 & 0x3] && local957 == local822[3]) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 7;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 7;
										Static6.anIntArray3[4] = local842[local957];
										local1069 = 6;
										Static6.anIntArray3[5] = local858[local957];
									} else {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = local842[local957];
										Static6.anIntArray3[2] = local858[local957];
										local1069 = 3;
									}
									for (local1252 = 0; local1252 < local1069; local1252++) {
										local1258 = Static6.anIntArray3[local1252];
										local1266 = local1258 - local100 * 2 & 0x7;
										local1271 = this.anIntArray150[local1258];
										local1276 = this.anIntArray151[local1258];
										if (local100 == 1) {
											local1283 = local1276;
											local1288 = 512 - local1271;
										} else if (local100 == 2) {
											local1283 = 512 - local1271;
											local1288 = 512 - local1276;
										} else if (local100 == 3) {
											local1288 = local1271;
											local1283 = 512 - local1276;
										} else {
											local1288 = local1276;
											local1283 = local1271;
										}
										local973[local959] = local1283;
										local976[local959] = local1288;
										if (local992 != null && Static299.aBooleanArrayArray5[local94][local1258]) {
											local1343 = (local35 << 9) + local1283;
											local1349 = (local51 << 9) + local1288;
											local992[local959] = arg4.method8584(local1349, local1343) - arg5.method8584(local1349, local1343);
										}
										if (local1001 != null) {
											if (arg4 != null && !Static299.aBooleanArrayArray5[local94][local1258]) {
												local1343 = local1283 + (local35 << 9);
												local1349 = (local51 << 9) + local1288;
												local1001[local959] = arg5.method8584(local1349, local1343) - arg4.method8584(local1349, local1343);
											} else if (arg1 != null && !Static157.aBooleanArrayArray2[local94][local1258]) {
												local1343 = (local35 << 9) + local1283;
												local1349 = (local51 << 9) + local1288;
												local1001[local959] = arg1.method8584(local1349, local1343) - arg5.method8584(local1349, local1343);
											}
										}
										if (local1258 < 8 && Static398.anIntArray368[local1266] > local162.anInt5973) {
											if (local970 != null) {
												local970[local959] = Static103.anIntArray126[local1266];
											}
											local985[local959] = Static383.anIntArray352[local1266];
											local982[local959] = Static642.anIntArray577[local1266];
											local979[local959] = Static509.anIntArray489[local1266];
										} else {
											if (local970 != null) {
												local970[local959] = local1023;
											}
											local982[local959] = local162.anInt5979;
											local985[local959] = local162.anInt5976;
											local979[local959] = local1003;
										}
										local959++;
									}
									local957++;
								}
								if (!this.aBoolean199 && arg0 == 0) {
									Static631.method8920(local35, local51, local162.anInt5972, local162.anInt5971 * 8, local162.anInt5967);
								}
								if (local94 != 12 && local162.anInt5977 != -1 && local162.aBoolean430) {
									local83 = true;
								}
							} else if (local820) {
								local957 = Static500.anIntArray484[local94];
							} else if (local85) {
								local957 = Static569.anIntArray527[local94];
							} else {
								local957 = Static31.anIntArray20[local94];
							}
							if (local183 != null) {
								if (local132 == 0) {
									local132 = local116;
								}
								if (local140 == 0) {
									local140 = local116;
								}
								if (local124 == 0) {
									local124 = local116;
								}
								@Pc(1600) Class297 local1600 = this.aClass23_2.method312(local116 - 1);
								@Pc(1608) Class297 local1608 = this.aClass23_2.method312(local124 - 1);
								@Pc(1616) Class297 local1616 = this.aClass23_2.method312(local132 - 1);
								@Pc(1624) Class297 local1624 = this.aClass23_2.method312(local140 - 1);
								for (local1266 = 0; local1266 < local382; local1266++) {
									if (local88[-local100 & 0x3] && local957 == local822[0]) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 1;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 1;
										Static6.anIntArray3[4] = local842[local957];
										Static6.anIntArray3[5] = local858[local957];
										local1069 = 6;
									} else if (local88[2 - local100 & 0x3] && local822[2] == local957) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 5;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 5;
										Static6.anIntArray3[4] = local842[local957];
										local1069 = 6;
										Static6.anIntArray3[5] = local858[local957];
									} else if (local88[1 - local100 & 0x3] && local822[1] == local957) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 3;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 3;
										Static6.anIntArray3[4] = local842[local957];
										local1069 = 6;
										Static6.anIntArray3[5] = local858[local957];
									} else if (local88[3 - local100 & 0x3] && local822[3] == local957) {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = 7;
										Static6.anIntArray3[2] = local858[local957];
										Static6.anIntArray3[3] = 7;
										Static6.anIntArray3[4] = local842[local957];
										local1069 = 6;
										Static6.anIntArray3[5] = local858[local957];
									} else {
										Static6.anIntArray3[0] = local846[local957];
										Static6.anIntArray3[1] = local842[local957];
										local1069 = 3;
										Static6.anIntArray3[2] = local858[local957];
									}
									local957++;
									for (local1271 = 0; local1271 < local1069; local1271++) {
										local1283 = Static6.anIntArray3[local1271];
										local1276 = local1283 - local100 * 2 & 0x7;
										local1288 = this.anIntArray150[local1283];
										local1349 = this.anIntArray151[local1283];
										@Pc(1896) int local1896;
										if (local100 == 1) {
											local1343 = local1349;
											local1896 = 512 - local1288;
										} else if (local100 == 2) {
											local1343 = 512 - local1288;
											local1896 = 512 - local1349;
										} else if (local100 == 3) {
											local1896 = local1288;
											local1343 = 512 - local1349;
										} else {
											local1343 = local1288;
											local1896 = local1349;
										}
										local973[local959] = local1343;
										local976[local959] = local1896;
										@Pc(1955) int local1955;
										@Pc(1962) int local1962;
										if (local992 != null && Static299.aBooleanArrayArray5[local94][local1283]) {
											local1955 = (local35 << 9) + local1343;
											local1962 = (local51 << 9) + local1896;
											local992[local959] = arg4.method8584(local1962, local1955) - arg5.method8584(local1962, local1955);
										}
										if (local1001 != null) {
											if (arg4 != null && !Static299.aBooleanArrayArray5[local94][local1283]) {
												local1955 = local1343 + (local35 << 9);
												local1962 = (local51 << 9) + local1896;
												local1001[local959] = arg5.method8584(local1962, local1955) - arg4.method8584(local1962, local1955);
											} else if (arg1 != null && !Static157.aBooleanArrayArray2[local94][local1283]) {
												local1955 = local1343 + (local35 << 9);
												local1962 = (local51 << 9) + local1896;
												local1001[local959] = arg1.method8584(local1962, local1955) - arg5.method8584(local1962, local1955);
											}
										}
										if (local1283 < 8 && Static398.anIntArray368[local1276] >= 0) {
											if (local970 != null) {
												local970[local959] = Static103.anIntArray126[local1276];
											}
											local985[local959] = Static383.anIntArray352[local1276];
											local982[local959] = Static642.anIntArray577[local1276];
											local979[local959] = Static509.anIntArray489[local1276];
										} else {
											if (local85 && Static299.aBooleanArrayArray5[local94][local1283]) {
												local982[local959] = local1005;
												local985[local959] = local1007;
												local979[local959] = local1003;
											} else if (local1343 == 0 && local1896 == 0) {
												local979[local959] = arg3[local35][local51];
												local982[local959] = local1600.anInt8069;
												local985[local959] = local1600.anInt8066;
											} else if (local1343 == 0 && local1896 == 512) {
												local979[local959] = arg3[local35][local69];
												local982[local959] = local1608.anInt8069;
												local985[local959] = local1608.anInt8066;
											} else if (local1343 == 512 && local1896 == 512) {
												local979[local959] = arg3[local49][local69];
												local982[local959] = local1616.anInt8069;
												local985[local959] = local1616.anInt8066;
											} else if (local1343 == 512 && local1896 == 0) {
												local979[local959] = arg3[local49][local51];
												local982[local959] = local1624.anInt8069;
												local985[local959] = local1624.anInt8066;
											} else {
												if (local1343 < 256) {
													if (local1896 < 256) {
														local982[local959] = local1600.anInt8069;
														local985[local959] = local1600.anInt8066;
													} else {
														local982[local959] = local1608.anInt8069;
														local985[local959] = local1608.anInt8066;
													}
												} else if (local1896 < 256) {
													local982[local959] = local1624.anInt8069;
													local985[local959] = local1624.anInt8066;
												} else {
													local982[local959] = local1616.anInt8069;
													local985[local959] = local1616.anInt8066;
												}
												local1955 = Static120.method1840(arg3[local49][local51], local1343 << 7 >> 9, arg3[local35][local51]);
												local1962 = Static120.method1840(arg3[local49][local69], local1343 << 7 >> 9, arg3[local35][local69]);
												local979[local959] = Static120.method1840(local1962, local1896 << 7 >> 9, local1955);
											}
											if (local970 != null) {
												local970[local959] = local979[local959];
											}
										}
										local959++;
									}
								}
								if (local94 != 0 && local183.aBoolean584) {
									local83 = true;
								}
							}
							local1023 = arg5.method8580(local51, local35);
							local1025 = arg5.method8580(local51, local49);
							local1252 = arg5.method8580(local69, local49);
							local1258 = arg5.method8580(local69, local35);
							@Pc(2391) boolean local2391 = Static23.method285(local35, local51);
							if (local2391 && arg0 > 1 || !local2391 && arg0 > 0) {
								@Pc(2404) boolean local2404 = true;
								if (local183 != null && !local183.aBoolean585) {
									local2404 = false;
								} else if (local116 == 0 && local94 != 0) {
									local2404 = false;
								} else if (local108 > 0 && local185 != null && !local185.aBoolean433) {
									local2404 = false;
								}
								if (local2404 && local1025 == local1023 && local1252 == local1023 && local1023 == local1258) {
									this.aByteArrayArrayArray13[arg0][local35][local51] = (byte) (this.aByteArrayArrayArray13[arg0][local35][local51] | 0x4);
								}
							}
							local1271 = 0;
							local1283 = 0;
							local1276 = 0;
							if (this.aBoolean199) {
								local1271 = Static251.method4163(local35, local51);
								local1283 = Static613.method8743(local35, local51);
								local1276 = Static626.method5555(local35, local51);
							}
							arg5.U(local35, local51, local973, local992, local976, local1001, local979, local970, local982, local985, local1271, local1283, local1276, local83);
							Static308.method6295(arg0, local35, local51);
						}
					}
				}
			}
		}
	}
}
