import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public class Class49 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
	private final int[] anIntArray668 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "[I")
	private final int[] anIntArray669 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public final int anInt9077;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "Lclient!gba;")
	private final Class119 aClass119_4;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
	public final boolean aBoolean636;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	protected final int anInt9083;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	protected final int anInt9081;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "Lclient!ufa;")
	private final Class350 aClass350_6;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIZLclient!ufa;Lclient!gba;)V")
	protected Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class350 arg4, @OriginalArg(5) Class119 arg5) {
		this.anInt9077 = arg0;
		this.aClass119_4 = arg5;
		this.aBoolean636 = arg3;
		this.anInt9083 = arg1;
		this.anInt9081 = arg2;
		this.aClass350_6 = arg4;
		this.aByteArrayArrayArray12 = new byte[this.anInt9077][this.anInt9083 + 1][this.anInt9081 + 1];
		this.anIntArrayArrayArray19 = new int[this.anInt9077][this.anInt9083 + 1][this.anInt9081 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt9077][this.anInt9083][this.anInt9081];
		this.aByteArrayArrayArray15 = new byte[this.anInt9077][this.anInt9083][this.anInt9081];
		this.aByteArrayArrayArray11 = new byte[this.anInt9077][this.anInt9083][this.anInt9081];
		this.aByteArrayArrayArray13 = new byte[this.anInt9077][this.anInt9083][this.anInt9081];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([[ILclient!s;Lclient!s;Lclient!ha;Lclient!s;II)V")
	private void method7503(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class137 arg3, @OriginalArg(4) Class51 arg4, @OriginalArg(5) int arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9083; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt9081; local11++) {
				if (Static360.anInt6730 == -1 || Static169.method2765(local7, arg5, local11, Static360.anInt6730)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray11[arg5][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray13[arg5][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray16[arg5][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray15[arg5][local7][local11] & 0xFF;
					@Pc(78) Class188 local78 = local55 == 0 ? null : this.aClass350_6.method8462(local55 - 1);
					if (local35 == 0 && local78 == null) {
						local35 = 12;
					}
					@Pc(99) Class208 local99 = local66 == 0 ? null : this.aClass119_4.method2838(local66 - 1);
					@Pc(101) Class188 local101 = local78;
					if (local78 != null && local78.anInt4901 == -1 && local78.anInt4909 == -1) {
						local101 = local78;
						local78 = null;
					}
					if (local78 != null || local99 != null) {
						@Pc(124) int local124 = Static618.anIntArray763[local35];
						@Pc(128) int local128 = Static392.anIntArray527[local35];
						@Pc(140) int local140 = (local99 == null ? 0 : local124) + (local78 == null ? 0 : local128);
						@Pc(142) int local142 = 0;
						@Pc(144) int local144 = 0;
						@Pc(151) int local151 = local78 == null ? -1 : local78.anInt4906;
						@Pc(158) int local158 = local99 == null ? -1 : local99.anInt6178;
						@Pc(161) int[] local161 = new int[local140];
						@Pc(164) int[] local164 = new int[local140];
						@Pc(167) int[] local167 = new int[local140];
						@Pc(170) int[] local170 = new int[local140];
						@Pc(173) int[] local173 = new int[local140];
						@Pc(176) int[] local176 = new int[local140];
						@Pc(188) int[] local188 = local78 == null || local78.anInt4909 == -1 ? null : new int[local140];
						@Pc(198) int local198;
						if (local78 == null) {
							local144 = local128;
						} else {
							for (local198 = 0; local198 < local128; local198++) {
								local161[local142] = Static438.anIntArrayArray46[local35][local144];
								local164[local142] = Static138.anIntArrayArray13[local35][local144];
								local167[local142] = Static608.anIntArrayArray57[local35][local144];
								local173[local142] = local151;
								local176[local142] = local78.anInt4903;
								local170[local142] = local78.anInt4901;
								if (local188 != null) {
									local188[local142] = local78.anInt4909;
								}
								local142++;
								local144++;
							}
							if (!this.aBoolean636 && arg5 == 0) {
								Static53.method1106(local7, local11, local78.anInt4902, local78.anInt4908 * 8, local78.anInt4900);
							}
						}
						if (local99 != null) {
							for (local198 = 0; local198 < local124; local198++) {
								local161[local142] = Static438.anIntArrayArray46[local35][local144];
								local164[local142] = Static138.anIntArrayArray13[local35][local144];
								local167[local142] = Static608.anIntArrayArray57[local35][local144];
								local173[local142] = local158;
								local176[local142] = local99.anInt6175;
								local170[local142] = arg0[local7][local11];
								if (local188 != null) {
									local188[local142] = local170[local142];
								}
								local142++;
								local144++;
							}
						}
						local198 = this.anIntArray669.length;
						@Pc(342) int[] local342 = new int[local198];
						@Pc(345) int[] local345 = new int[local198];
						@Pc(352) int[] local352 = arg1 == null ? null : new int[local198];
						@Pc(361) int[] local361 = arg1 == null && arg4 == null ? null : new int[local198];
						@Pc(370) int local370;
						@Pc(375) int local375;
						@Pc(458) int local458;
						@Pc(466) int local466;
						for (@Pc(363) int local363 = 0; local363 < local198; local363++) {
							local370 = this.anIntArray669[local363];
							local375 = this.anIntArray668[local363];
							if (local44 == 0) {
								local342[local363] = local370;
								local345[local363] = local375;
							} else if (local44 == 1) {
								local342[local363] = local375;
								local345[local363] = 512 - local370;
							} else if (local44 == 2) {
								local342[local363] = 512 - local370;
								local345[local363] = 512 - local375;
							} else if (local44 == 3) {
								local342[local363] = 512 - local375;
								local345[local363] = local370;
							}
							if (local352 != null && Static647.aBooleanArrayArray7[local35][local363]) {
								local458 = (local7 << 9) + local342[local363];
								local466 = local345[local363] + (local11 << 9);
								local352[local363] = arg1.method7866(local458, local466) - arg2.method7866(local458, local466);
							}
							if (local361 != null) {
								if (arg1 != null && !Static647.aBooleanArrayArray7[local35][local363]) {
									local458 = (local7 << 9) + local342[local363];
									local466 = local345[local363] + (local11 << 9);
									local361[local363] = arg2.method7866(local458, local466) - arg1.method7866(local458, local466);
								} else if (arg4 != null && !Static119.aBooleanArrayArray1[local35][local363]) {
									local458 = local342[local363] + (local7 << 9);
									local466 = local345[local363] + (local11 << 9);
									local361[local363] = arg4.method7866(local458, local466) - arg2.method7866(local458, local466);
								}
							}
						}
						local370 = arg2.method7857(local11, local7);
						local375 = arg2.method7857(local11, local7 + 1);
						local458 = arg2.method7857(local11 + 1, local7 + 1);
						local466 = arg2.method7857(local11 + 1, local7);
						@Pc(604) boolean local604 = Static329.method5158(local11, local7);
						if (local604 && arg5 > 1 || !local604 && arg5 > 0) {
							@Pc(615) boolean local615 = true;
							if (local99 != null && !local99.aBoolean430) {
								local615 = false;
							} else if (local66 == 0 && local35 != 0) {
								local615 = false;
							} else if (local55 > 0 && local101 != null && !local101.aBoolean334) {
								local615 = false;
							}
							if (local615 && local370 == local375 && local458 == local370 && local370 == local466) {
								this.aByteArrayArrayArray12[arg5][local7][local11] = (byte) (this.aByteArrayArrayArray12[arg5][local7][local11] | 0x4);
							}
						}
						@Pc(685) int local685 = 0;
						@Pc(687) int local687 = 0;
						@Pc(689) int local689 = 0;
						if (this.aBoolean636) {
							local685 = Static174.method9028(local7, local11);
							local687 = Static630.method8818(local7, local11);
							local689 = Static438.method6441(local7, local11);
						}
						arg2.method7856(local7, local11, local342, local352, local345, local361, local161, local164, local167, local170, local188, local173, local176, local685, local687, local689);
						Static143.method2263(arg5, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([[BIBILclient!ha;IILclient!lda;ILclient!jp;[[B[[BI[Z)V")
	private void method7504(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class137 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class208 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class188 arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean335 ? Static335.aBooleanArrayArray3[arg1] : Static407.aBooleanArrayArray4[arg1];
		@Pc(40) int local40;
		@Pc(53) Class188 local53;
		@Pc(71) byte local71;
		@Pc(88) int local88;
		@Pc(93) int local93;
		if (arg7 > 0) {
			if (arg4 > 0) {
				local40 = arg9[arg4 - 1][arg7 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass350_6.method8462(local40 - 1);
					if (local53.anInt4901 != -1 && local53.aBoolean335) {
						local71 = arg10[arg4 - 1][arg7 - 1];
						local88 = arg0[arg4 - 1][arg7 - 1] * 2 + 4 & 0x7;
						local93 = Static138.method2199(arg3, local53);
						if (Static647.aBooleanArrayArray7[local71][local88]) {
							Static73.anIntArray121[0] = local53.anInt4901;
							Static440.anIntArray593[0] = local93;
							Static31.anIntArray66[0] = local53.anInt4906;
							Static637.anIntArray793[0] = local53.anInt4903;
							Static592.anIntArray137[0] = local53.anInt4912;
							Static570.anIntArray711[0] = 256;
						}
					}
				}
			}
			if (arg11 - 1 > arg4) {
				local40 = arg9[arg4 + 1][arg7 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass350_6.method8462(local40 - 1);
					if (local53.anInt4901 != -1 && local53.aBoolean335) {
						local71 = arg10[arg4 + 1][arg7 - 1];
						local88 = arg0[arg4 + 1][arg7 - 1] * 2 + 6 & 0x7;
						local93 = Static138.method2199(arg3, local53);
						if (Static647.aBooleanArrayArray7[local71][local88]) {
							Static73.anIntArray121[2] = local53.anInt4901;
							Static440.anIntArray593[2] = local93;
							Static31.anIntArray66[2] = local53.anInt4906;
							Static637.anIntArray793[2] = local53.anInt4903;
							Static592.anIntArray137[2] = local53.anInt4912;
							Static570.anIntArray711[2] = 512;
						}
					}
				}
			}
		}
		if (arg2 - 1 > arg7) {
			if (arg4 > 0) {
				local40 = arg9[arg4 - 1][arg7 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass350_6.method8462(local40 - 1);
					if (local53.anInt4901 != -1 && local53.aBoolean335) {
						local71 = arg10[arg4 - 1][arg7 + 1];
						local88 = arg0[arg4 - 1][arg7 + 1] * 2 + 2 & 0x7;
						local93 = Static138.method2199(arg3, local53);
						if (Static647.aBooleanArrayArray7[local71][local88]) {
							Static73.anIntArray121[6] = local53.anInt4901;
							Static440.anIntArray593[6] = local93;
							Static31.anIntArray66[6] = local53.anInt4906;
							Static637.anIntArray793[6] = local53.anInt4903;
							Static592.anIntArray137[6] = local53.anInt4912;
							Static570.anIntArray711[6] = 64;
						}
					}
				}
			}
			if (arg4 < arg11 - 1) {
				local40 = arg9[arg4 + 1][arg7 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass350_6.method8462(local40 - 1);
					if (local53.anInt4901 != -1 && local53.aBoolean335) {
						local71 = arg10[arg4 + 1][arg7 + 1];
						local88 = arg0[arg4 + 1][arg7 + 1] * 2 & 0x7;
						local93 = Static138.method2199(arg3, local53);
						if (Static647.aBooleanArrayArray7[local71][local88]) {
							Static73.anIntArray121[4] = local53.anInt4901;
							Static440.anIntArray593[4] = local93;
							Static31.anIntArray66[4] = local53.anInt4906;
							Static637.anIntArray793[4] = local53.anInt4903;
							Static592.anIntArray137[4] = local53.anInt4912;
							Static570.anIntArray711[4] = 128;
						}
					}
				}
			}
		}
		@Pc(495) int local495;
		@Pc(502) int local502;
		@Pc(507) int local507;
		@Pc(509) int local509;
		@Pc(456) int local456;
		@Pc(469) Class188 local469;
		@Pc(482) byte local482;
		@Pc(490) byte local490;
		if (arg7 > 0) {
			local456 = arg9[arg4][arg7 - 1] & 0xFF;
			if (local456 > 0) {
				local469 = this.aClass350_6.method8462(local456 - 1);
				if (local469.anInt4901 != -1) {
					local482 = arg10[arg4][arg7 - 1];
					local490 = arg0[arg4][arg7 - 1];
					if (local469.aBoolean335) {
						local495 = 2;
						local502 = local490 * 2 + 4;
						local507 = Static138.method2199(arg3, local469);
						for (local509 = 0; local509 < 3; local509++) {
							local495 &= 0x7;
							local502 &= 0x7;
							if (Static647.aBooleanArrayArray7[local482][local502] && local469.anInt4912 >= Static592.anIntArray137[local495]) {
								Static73.anIntArray121[local495] = local469.anInt4901;
								Static440.anIntArray593[local495] = local507;
								Static31.anIntArray66[local495] = local469.anInt4906;
								Static637.anIntArray793[local495] = local469.anInt4903;
								if (local469.anInt4912 == Static592.anIntArray137[local495]) {
									Static570.anIntArray711[local495] |= 0x20;
								} else {
									Static570.anIntArray711[local495] = 32;
								}
								Static592.anIntArray137[local495] = local469.anInt4912;
							}
							local495--;
							local502++;
						}
						if (!local18[--arg5 & 0x3]) {
							arg12[0] = Static335.aBooleanArrayArray3[local482][local490 + 2 & 0x3];
						}
					} else if (!local18[arg5 & 0x3]) {
						arg12[0] = Static407.aBooleanArrayArray4[local482][local490 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg7) {
			local456 = arg9[arg4][arg7 + 1] & 0xFF;
			if (local456 > 0) {
				local469 = this.aClass350_6.method8462(local456 - 1);
				if (local469.anInt4901 != -1) {
					local482 = arg10[arg4][arg7 + 1];
					local490 = arg0[arg4][arg7 + 1];
					if (local469.aBoolean335) {
						local495 = 4;
						local502 = local490 * 2 + 2;
						local507 = Static138.method2199(arg3, local469);
						for (local509 = 0; local509 < 3; local509++) {
							local495 &= 0x7;
							local502 &= 0x7;
							if (Static647.aBooleanArrayArray7[local482][local502] && Static592.anIntArray137[local495] <= local469.anInt4912) {
								Static73.anIntArray121[local495] = local469.anInt4901;
								Static440.anIntArray593[local495] = local507;
								Static31.anIntArray66[local495] = local469.anInt4906;
								Static637.anIntArray793[local495] = local469.anInt4903;
								if (Static592.anIntArray137[local495] == local469.anInt4912) {
									Static570.anIntArray711[local495] |= 0x10;
								} else {
									Static570.anIntArray711[local495] = 16;
								}
								Static592.anIntArray137[local495] = local469.anInt4912;
							}
							local495++;
							local502--;
						}
						if (!local18[arg5 + 2 & 0x3]) {
							arg12[2] = Static335.aBooleanArrayArray3[local482][local490 & 0x3];
						}
					} else if (!local18[arg5 + 2 & 0x3]) {
						arg12[2] = Static407.aBooleanArrayArray4[local482][--local490 & 0x3];
					}
				}
			}
		}
		if (arg4 > 0) {
			local456 = arg9[arg4 - 1][arg7] & 0xFF;
			if (local456 > 0) {
				local469 = this.aClass350_6.method8462(local456 - 1);
				if (local469.anInt4901 != -1) {
					local482 = arg10[arg4 - 1][arg7];
					local490 = arg0[arg4 - 1][arg7];
					if (local469.aBoolean335) {
						local495 = 6;
						local502 = local490 * 2 + 4;
						local507 = Static138.method2199(arg3, local469);
						for (local509 = 0; local509 < 3; local509++) {
							local495 &= 0x7;
							local502 &= 0x7;
							if (Static647.aBooleanArrayArray7[local482][local502] && Static592.anIntArray137[local495] <= local469.anInt4912) {
								Static73.anIntArray121[local495] = local469.anInt4901;
								Static440.anIntArray593[local495] = local507;
								Static31.anIntArray66[local495] = local469.anInt4906;
								Static637.anIntArray793[local495] = local469.anInt4903;
								if (Static592.anIntArray137[local495] == local469.anInt4912) {
									Static570.anIntArray711[local495] |= 0x8;
								} else {
									Static570.anIntArray711[local495] = 8;
								}
								Static592.anIntArray137[local495] = local469.anInt4912;
							}
							local495++;
							local502--;
						}
						if (!local18[arg5 + 3 & 0x3]) {
							arg12[3] = Static335.aBooleanArrayArray3[local482][local490 + 1 & 0x3];
						}
					} else if (!local18[arg5 + 3 & 0x3]) {
						arg12[3] = Static407.aBooleanArrayArray4[local482][local490 + 1 & 0x3];
					}
				}
			}
		}
		if (arg4 < arg11 - 1) {
			local456 = arg9[arg4 + 1][arg7] & 0xFF;
			if (local456 > 0) {
				local469 = this.aClass350_6.method8462(local456 - 1);
				if (local469.anInt4901 != -1) {
					local482 = arg10[arg4 + 1][arg7];
					local490 = arg0[arg4 + 1][arg7];
					if (local469.aBoolean335) {
						local495 = 4;
						local502 = local490 * 2 + 6;
						local507 = Static138.method2199(arg3, local469);
						for (local509 = 0; local509 < 3; local509++) {
							local502 &= 0x7;
							local495 &= 0x7;
							if (Static647.aBooleanArrayArray7[local482][local502] && Static592.anIntArray137[local495] <= local469.anInt4912) {
								Static73.anIntArray121[local495] = local469.anInt4901;
								Static440.anIntArray593[local495] = local507;
								Static31.anIntArray66[local495] = local469.anInt4906;
								Static637.anIntArray793[local495] = local469.anInt4903;
								if (local469.anInt4912 == Static592.anIntArray137[local495]) {
									Static570.anIntArray711[local495] |= 0x4;
								} else {
									Static570.anIntArray711[local495] = 4;
								}
								Static592.anIntArray137[local495] = local469.anInt4912;
							}
							local502++;
							local495--;
						}
						if (!local18[arg5 + 1 & 0x3]) {
							arg12[1] = Static335.aBooleanArrayArray3[local482][local490 + 3 & 0x3];
						}
					} else if (!local18[arg5 + 1 & 0x3]) {
						arg12[1] = Static407.aBooleanArrayArray4[local482][local490 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local456 = Static138.method2199(arg3, arg8);
		if (!arg8.aBoolean335) {
			return;
		}
		for (@Pc(1203) int local1203 = 0; local1203 < 8; local1203++) {
			local88 = local1203 - arg5 * 2 & 0x7;
			if (Static647.aBooleanArrayArray7[arg1][local1203] && arg8.anInt4912 >= Static592.anIntArray137[local88]) {
				Static73.anIntArray121[local88] = arg8.anInt4901;
				Static440.anIntArray593[local88] = local456;
				Static31.anIntArray66[local88] = arg8.anInt4906;
				Static637.anIntArray793[local88] = arg8.anInt4903;
				if (Static592.anIntArray137[local88] == arg8.anInt4912) {
					Static570.anIntArray711[local88] |= 0x2;
				} else {
					Static570.anIntArray711[local88] = 2;
				}
				Static592.anIntArray137[local88] = arg8.anInt4912;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[[I)V")
	public final void method7505(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray19[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt9083 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt9081 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
	public final void method7506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) int local19 = 0; local19 < this.anInt9077; local19++) {
			this.method7514(arg0, 64, 64, arg1, local19);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!so;Z[Lclient!mb;III)V")
	public final void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub29 arg1, @OriginalArg(3) Class226[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean636) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class226 local16 = arg2[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg4;
						@Pc(32) int local32 = local22 + arg3;
						if (local28 >= 0 && local28 < this.anInt9083 && local32 >= 0 && this.anInt9081 > local32) {
							local16.method5366(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg4 + arg5;
		@Pc(81) int local81 = arg0 + arg3;
		for (local18 = 0; local18 < this.anInt9077; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method7516(0, arg1, 0, local18, local22 + arg4, arg3 + local28, 0, local10 + local22, false, local81 + local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ha;I[[[I[Lclient!mb;)V")
	public final void method7510(@OriginalArg(0) Class137 arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class226[] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean636) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt9083; local10++) {
					for (local14 = 0; local14 < this.anInt9081; local14++) {
						if ((Static553.aByteArrayArrayArray18[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static553.aByteArrayArrayArray18[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg2[local28].method5359(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt9077; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean636) {
				if (Static196.aBoolean276) {
					local14 = 8;
				}
				if (Static70.aBoolean121) {
					local10 = 2;
				}
				if (Static385.anInt7058 != 0) {
					local10 |= 0x1;
					if (Static162.aBoolean758 | local6 == 0) {
						local14 |= 0x10;
					}
				}
			}
			if (Static70.aBoolean121) {
				local14 |= 0x7;
			}
			if (!Static635.aBoolean732) {
				local14 |= 0x20;
			}
			@Pc(161) int[][] local161 = arg1 == null || local6 >= arg1.length ? this.anIntArrayArrayArray19[local6] : arg1[local6];
			Static397.method5941(local6, arg0.method7908(this.anInt9083, this.anInt9081, this.anIntArrayArrayArray19[local6], local161, local10, local14));
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIILclient!so;I[Lclient!mb;)V")
	public final void method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14_Sub29 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class226[] arg8) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean636) {
			@Pc(18) Class226 local18 = arg8[arg3];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg5 + Static328.method5136(local24 & 0x7, local20 & 0x7, arg1);
					local50 = Static62.method7509(arg1, local20 & 0x7, local24 & 0x7) + arg7;
					if (local38 > 0 && this.anInt9083 - 1 > local38 && local50 > 0 && local50 < this.anInt9081 - 1) {
						local18.method5366(local38, local50);
					}
				}
			}
		}
		@Pc(91) int local91 = (arg0 & 0x7) * 8;
		@Pc(97) int local97 = (arg2 & 0x1FFFFFF8) << 3;
		local20 = (arg0 & 0xFFFFFFF8) << 3;
		@Pc(105) byte local105 = 0;
		@Pc(113) byte local113 = 0;
		if (arg1 == 1) {
			local113 = 1;
		} else if (arg1 == 2) {
			local105 = 1;
			local113 = 1;
		} else if (arg1 == 3) {
			local105 = 1;
		}
		for (local50 = 0; local50 < this.anInt9077; local50++) {
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
					if (local50 == arg4 && local11 <= local142 && local142 <= local11 + 8 && local146 >= local91 && local91 + 8 >= local146) {
						@Pc(202) int local202;
						@Pc(214) int local214;
						if (local11 + 8 == local142 || local146 == local91 + 8) {
							if (arg1 == 0) {
								local202 = arg5 + local142 - local11;
								local214 = local146 + arg7 - local91;
							} else if (arg1 == 1) {
								local214 = local11 + arg7 + 8 - local142;
								local202 = local146 + arg5 - local91;
							} else if (arg1 == 2) {
								local214 = local91 + arg7 + 8 - local146;
								local202 = local11 + arg5 + 8 - local142;
							} else {
								local202 = local91 + arg5 + 8 - local146;
								local214 = arg7 + local142 - local11;
							}
							this.method7516(0, arg6, 0, arg3, local202, local214, 0, local142 + local97, true, local20 + local146);
						} else {
							local202 = arg5 + Static328.method5136(local146 & 0x7, local142 & 0x7, arg1);
							local214 = Static62.method7509(arg1, local142 & 0x7, local146 & 0x7) + arg7;
							this.method7516(local113, arg6, arg1, arg3, local202, local214, local105, local142 + local97, false, local20 + local146);
						}
						if (local142 == 63 || local146 == 63) {
							@Pc(337) byte local337 = 1;
							if (local142 == 63 && local146 == 63) {
								local337 = 3;
							}
							for (@Pc(349) int local349 = 0; local349 < local337; local349++) {
								@Pc(353) int local353 = local142;
								@Pc(355) int local355 = local146;
								if (local349 == 0) {
									local355 = local146 == 63 ? 64 : local146;
									local353 = local142 == 63 ? 64 : local142;
								} else if (local349 == 1) {
									local353 = 64;
								} else if (local349 == 2) {
									local355 = 64;
								}
								@Pc(409) int local409;
								@Pc(402) int local402;
								if (arg1 == 0) {
									local402 = arg7 + local355 - local91;
									local409 = arg5 + local353 - local11;
								} else if (arg1 == 1) {
									local409 = local355 + arg5 - local91;
									local402 = local11 + arg7 + 8 - local353;
								} else if (arg1 == 2) {
									local402 = local91 + arg7 + 8 - local355;
									local409 = arg5 + local11 + 8 - local353;
								} else {
									local409 = arg5 + local91 + 8 - local355;
									local402 = local353 + arg7 - local11;
								}
								if (local409 >= 0 && this.anInt9083 > local409 && local402 >= 0 && local402 < this.anInt9081) {
									this.anIntArrayArrayArray19[arg3][local409][local402] = this.anIntArrayArrayArray19[arg3][local202 + local105][local113 + local214];
								}
							}
						}
					} else {
						this.method7516(0, arg6, 0, 0, -1, -1, 0, 0, false, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ha;Lclient!s;Lclient!s;)V")
	public final void method7512(@OriginalArg(1) Class137 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) Class51 arg2) {
		if (Static237.anIntArray336 == null || this.anInt9081 != Static237.anIntArray336.length) {
			Static663.anIntArray818 = new int[this.anInt9081];
			Static230.anIntArray333 = new int[this.anInt9081];
			Static237.anIntArray336 = new int[this.anInt9081];
			Static471.anIntArray622 = new int[this.anInt9081];
			Static645.anIntArray807 = new int[this.anInt9081];
		}
		@Pc(38) int[][] local38 = new int[this.anInt9083][this.anInt9081];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt9077; local40++) {
			for (local44 = 0; local44 < this.anInt9081; local44++) {
				Static237.anIntArray336[local44] = 0;
				Static471.anIntArray622[local44] = 0;
				Static663.anIntArray818[local44] = 0;
				Static645.anIntArray807[local44] = 0;
				Static230.anIntArray333[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt9083; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(172) int local172;
				for (@Pc(81) int local81 = 0; local81 < this.anInt9081; local81++) {
					local87 = local77 + 5;
					@Pc(152) int local152;
					if (this.anInt9083 > local87) {
						local106 = this.aByteArrayArrayArray15[local40][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class208 local116 = this.aClass119_4.method2838(local106 - 1);
							Static237.anIntArray336[local81] += local116.anInt6179;
							Static471.anIntArray622[local81] += local116.anInt6183;
							Static663.anIntArray818[local81] += local116.anInt6180;
							Static645.anIntArray807[local81] += local116.anInt6177;
							local152 = Static230.anIntArray333[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local172 = this.aByteArrayArrayArray15[local40][local106][local81] & 0xFF;
						if (local172 > 0) {
							@Pc(182) Class208 local182 = this.aClass119_4.method2838(local172 - 1);
							Static237.anIntArray336[local81] -= local182.anInt6179;
							Static471.anIntArray622[local81] -= local182.anInt6183;
							Static663.anIntArray818[local81] -= local182.anInt6180;
							Static645.anIntArray807[local81] -= local182.anInt6177;
							local152 = Static230.anIntArray333[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local172 = 0;
					@Pc(239) int local239 = 0;
					@Pc(241) int local241 = 0;
					for (@Pc(243) int local243 = -5; local243 < this.anInt9081; local243++) {
						@Pc(249) int local249 = local243 + 5;
						if (local249 < this.anInt9081) {
							local106 += Static471.anIntArray622[local249];
							local241 += Static230.anIntArray333[local249];
							local172 += Static663.anIntArray818[local249];
							local87 += Static237.anIntArray336[local249];
							local239 += Static645.anIntArray807[local249];
						}
						@Pc(291) int local291 = local243 - 5;
						if (local291 >= 0) {
							local87 -= Static237.anIntArray336[local291];
							local172 -= Static663.anIntArray818[local291];
							local241 -= Static230.anIntArray333[local291];
							local239 -= Static645.anIntArray807[local291];
							local106 -= Static471.anIntArray622[local291];
						}
						if (local243 >= 0 && local239 > 0 && local241 > 0) {
							local38[local77][local243] = Static409.method6043(local87 * 256 / local239, local172 / local241, local106 / local241);
						}
					}
				}
			}
			if (Static519.aBoolean634) {
				this.method7515(arg0, Static576.aClass51Array3[local40], local40, local38, local40 == 0 ? arg2 : null, local40 == 0 ? arg1 : null);
			} else {
				this.method7503(local38, local40 == 0 ? arg1 : null, Static576.aClass51Array3[local40], arg0, local40 == 0 ? arg2 : null, local40);
			}
			this.aByteArrayArrayArray15[local40] = null;
			this.aByteArrayArrayArray16[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
		}
		if (!this.aBoolean636) {
			if (Static385.anInt7058 != 0) {
				Static405.method6012();
			}
			if (Static70.aBoolean121) {
				Static537.method7645();
			}
		}
		for (local44 = 0; local44 < this.anInt9077; local44++) {
			Static576.aClass51Array3[local44].YA();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIIIII)V")
	public final void method7514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17;
		for (@Pc(7) int local7 = arg3; local7 < arg2 + arg3; local7++) {
			for (local17 = arg0; local17 < arg0 + arg1; local17++) {
				if (local17 >= 0 && this.anInt9083 > local17 && local7 >= 0 && local7 < this.anInt9081) {
					this.anIntArrayArrayArray19[arg4][local17][local7] = arg4 > 0 ? this.anIntArrayArrayArray19[arg4 - 1][local17][local7] - 960 : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt9083) {
			for (local17 = arg3 + 1; local17 < arg3 + arg2; local17++) {
				if (local17 >= 0 && this.anInt9081 > local17) {
					this.anIntArrayArrayArray19[arg4][arg0][local17] = this.anIntArrayArrayArray19[arg4][arg0 - 1][local17];
				}
			}
		}
		if (arg3 > 0 && this.anInt9081 > arg3) {
			for (local17 = arg0 + 1; local17 < arg0 + arg1; local17++) {
				if (local17 >= 0 && this.anInt9083 > local17) {
					this.anIntArrayArrayArray19[arg4][local17][arg3] = this.anIntArrayArrayArray19[arg4][local17][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || this.anInt9083 <= arg0 || this.anInt9081 <= arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3] != 0) {
				this.anIntArrayArrayArray19[arg4][arg0][arg3] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3];
				return;
			}
			if (arg3 > 0 && this.anIntArrayArrayArray19[arg4][arg0][arg3 - 1] != 0) {
				this.anIntArrayArrayArray19[arg4][arg0][arg3] = this.anIntArrayArrayArray19[arg4][arg0][arg3 - 1];
				return;
			}
			if (arg0 > 0 && arg3 > 0 && this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3 - 1] != 0) {
				this.anIntArrayArrayArray19[arg4][arg0][arg3] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3] != this.anIntArrayArrayArray19[arg4 - 1][arg0 - 1][arg3]) {
			this.anIntArrayArrayArray19[arg4][arg0][arg3] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3];
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray19[arg4][arg0][arg3 - 1] != this.anIntArrayArrayArray19[arg4 - 1][arg0][arg3 - 1]) {
			this.anIntArrayArrayArray19[arg4][arg0][arg3] = this.anIntArrayArrayArray19[arg4][arg0][arg3 - 1];
			return;
		}
		if (arg0 > 0 && arg3 > 0 && this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3 - 1] != this.anIntArrayArrayArray19[arg4 - 1][arg0 - 1][arg3 - 1]) {
			this.anIntArrayArrayArray19[arg4][arg0][arg3] = this.anIntArrayArrayArray19[arg4][arg0 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ha;ILclient!s;I[[ILclient!s;Lclient!s;)V")
	private void method7515(@OriginalArg(0) Class137 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class51 arg4, @OriginalArg(6) Class51 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg2];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray15[arg2];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray16[arg2];
		for (@Pc(33) int local33 = 0; local33 < this.anInt9083; local33++) {
			@Pc(47) int local47 = local33 >= this.anInt9083 - 1 ? local33 : local33 + 1;
			for (@Pc(49) int local49 = 0; local49 < this.anInt9081; local49++) {
				@Pc(67) int local67 = this.anInt9081 - 1 <= local49 ? local49 : local49 + 1;
				if (Static360.anInt6730 == -1 || Static169.method2765(local33, arg2, local49, Static360.anInt6730)) {
					@Pc(83) boolean local83 = false;
					@Pc(85) boolean local85 = false;
					@Pc(88) boolean[] local88 = new boolean[4];
					@Pc(94) int local94 = local10[local33][local49];
					@Pc(100) int local100 = local15[local33][local49];
					@Pc(108) int local108 = local31[local33][local49] & 0xFF;
					@Pc(116) int local116 = local26[local33][local49] & 0xFF;
					@Pc(124) int local124 = local26[local33][local67] & 0xFF;
					@Pc(132) int local132 = local26[local47][local67] & 0xFF;
					@Pc(140) int local140 = local26[local47][local49] & 0xFF;
					if (local108 != 0 || local116 != 0) {
						@Pc(162) Class188 local162 = local108 == 0 ? null : this.aClass350_6.method8462(local108 - 1);
						if (local94 == 0 && local162 == null) {
							local94 = 12;
						}
						@Pc(183) Class208 local183 = local116 == 0 ? null : this.aClass119_4.method2838(local116 - 1);
						@Pc(185) Class188 local185 = local162;
						if (local162 != null) {
							if (local162.anInt4901 == -1 && local162.anInt4909 == -1) {
								local185 = local162;
								local162 = null;
							} else if (local183 != null && local94 != 0) {
								local85 = local162.aBoolean335;
							}
						}
						@Pc(300) int local300;
						@Pc(334) int local334;
						@Pc(388) int local388;
						@Pc(398) int local398;
						if ((local94 == 0 || local94 == 12) && local33 > 0 && local49 > 0 && local33 < this.anInt9083 && local49 < this.anInt9081) {
							@Pc(258) int local258 = local26[local47][local67] == local116 ? 1 : -1;
							@Pc(279) int local279 = local116 == local26[local47][local49 - 1] ? 1 : -1;
							local300 = local26[local33 - 1][local49 - 1] == local116 ? 1 : -1;
							if (local26[local33][local49 - 1] == local116) {
								local279++;
								local300++;
							} else {
								local279--;
								local300--;
							}
							local334 = local116 == local26[local33 - 1][local67] ? 1 : -1;
							if (local26[local47][local49] == local116) {
								local258++;
								local279++;
							} else {
								local258--;
								local279--;
							}
							if (local26[local33][local67] == local116) {
								local334++;
								local258++;
							} else {
								local258--;
								local334--;
							}
							if (local26[local33 - 1][local49] == local116) {
								local300++;
								local334++;
							} else {
								local334--;
								local300--;
							}
							local388 = local300 - local258;
							if (local388 < 0) {
								local388 = -local388;
							}
							local398 = local279 - local334;
							if (local398 < 0) {
								local398 = -local398;
							}
							if (local398 == local388) {
								local388 = arg1.method7857(local49, local33) - arg1.method7857(local67, local47);
								local398 = arg1.method7857(local49, local47) - arg1.method7857(local67, local33);
								if (local388 < 0) {
									local388 = -local388;
								}
								if (local398 < 0) {
									local398 = -local398;
								}
							}
							local100 = local398 > local388 ? 1 : 0;
						}
						for (local300 = 0; local300 < 13; local300++) {
							Static592.anIntArray137[local300] = -1;
							Static570.anIntArray711[local300] = 1;
						}
						@Pc(491) boolean[] local491 = local162 != null && local162.aBoolean335 ? Static335.aBooleanArrayArray3[local94] : Static407.aBooleanArrayArray4[local94];
						this.method7504(local15, local94, this.anInt9081, arg0, local33, local100, local183, local49, local162, local31, local10, this.anInt9083, local88);
						@Pc(524) boolean local524 = local162 != null && local162.anInt4901 != local162.anInt4909;
						if (!local524) {
							for (local334 = 0; local334 < 8; local334++) {
								if (Static592.anIntArray137[local334] >= 0 && Static73.anIntArray121[local334] != Static440.anIntArray593[local334]) {
									local524 = true;
									break;
								}
							}
						}
						if (!local491[local100 + 1 & 0x3]) {
							local88[1] = Static612.method8601(local88[1], (Static570.anIntArray711[4] & Static570.anIntArray711[2]) == 0);
						}
						if (!local491[local100 + 3 & 0x3]) {
							local88[3] = Static612.method8601(local88[3], (Static570.anIntArray711[0] & Static570.anIntArray711[6]) == 0);
						}
						if (!local491[local100 & 0x3]) {
							local88[0] = Static612.method8601(local88[0], (Static570.anIntArray711[2] & Static570.anIntArray711[0]) == 0);
						}
						if (!local491[local100 + 2 & 0x3]) {
							local88[2] = Static612.method8601(local88[2], (Static570.anIntArray711[6] & Static570.anIntArray711[4]) == 0);
						}
						if (!local85 && (local94 == 0 || local94 == 12)) {
							if (local88[0] && !local88[1] && !local88[2] && local88[3]) {
								local100 = 0;
								local94 = local94 == 0 ? 13 : 14;
								local88[0] = local88[3] = false;
							} else if (local88[0] && local88[1] && !local88[2] && !local88[3]) {
								local94 = local94 == 0 ? 13 : 14;
								local100 = 3;
								local88[0] = local88[1] = false;
							} else if (!local88[0] && local88[1] && local88[2] && !local88[3]) {
								local94 = local94 == 0 ? 13 : 14;
								local88[1] = local88[2] = false;
								local100 = 2;
							} else if (!local88[0] && !local88[1] && local88[2] && local88[3]) {
								local88[2] = local88[3] = false;
								local100 = 1;
								local94 = local94 == 0 ? 13 : 14;
							}
						}
						@Pc(833) boolean local833 = !local85 && !local88[0] && !local88[2] && !local88[1] && !local88[3];
						@Pc(835) int[] local835 = null;
						@Pc(853) int[] local853;
						@Pc(865) int[] local865;
						@Pc(841) int[] local841;
						if (local833) {
							local841 = Static608.anIntArrayArray57[local94];
							local388 = local183 == null ? 0 : Static618.anIntArray763[local94];
							local853 = Static438.anIntArrayArray46[local94];
							local398 = local162 == null ? 0 : Static392.anIntArray527[local94];
							local865 = Static138.anIntArrayArray13[local94];
						} else if (local85) {
							local835 = Static364.anIntArrayArray41[local94];
							local841 = Static149.anIntArrayArray42[local94];
							local853 = Static9.anIntArrayArray4[local94];
							local388 = local183 == null ? 0 : Static417.anIntArray787[local94];
							local865 = Static224.anIntArrayArray30[local94];
							local398 = local162 == null ? 0 : Static344.anIntArray829[local94];
						} else {
							local841 = Static83.anIntArrayArray8[local94];
							local865 = Static532.anIntArrayArray50[local94];
							local388 = local183 == null ? 0 : Static164.anIntArray267[local94];
							local398 = local162 == null ? 0 : Static176.anIntArray284[local94];
							local853 = Static317.anIntArrayArray36[local94];
							local835 = Static613.anIntArrayArray58[local94];
						}
						@Pc(938) int local938 = local388 + local398;
						if (local938 <= 0) {
							Static143.method2263(arg2, local33, local49);
						} else {
							if (local88[0]) {
								local938++;
							}
							if (local88[2]) {
								local938++;
							}
							if (local88[1]) {
								local938++;
							}
							if (local88[3]) {
								local938++;
							}
							@Pc(968) int local968 = 0;
							@Pc(970) int local970 = 0;
							@Pc(974) int local974 = local938 * 3;
							@Pc(981) int[] local981 = local524 ? new int[local974] : null;
							@Pc(984) int[] local984 = new int[local974];
							@Pc(987) int[] local987 = new int[local974];
							@Pc(990) int[] local990 = new int[local974];
							@Pc(993) int[] local993 = new int[local974];
							@Pc(996) int[] local996 = new int[local974];
							@Pc(1003) int[] local1003 = arg5 == null ? null : new int[local974];
							@Pc(1012) int[] local1012 = arg5 == null && arg4 == null ? null : new int[local974];
							@Pc(1014) int local1014 = -1;
							@Pc(1016) int local1016 = -1;
							@Pc(1018) int local1018 = 256;
							@Pc(1112) byte local1112;
							@Pc(1034) int local1034;
							@Pc(1036) int local1036;
							@Pc(1264) int local1264;
							@Pc(1270) int local1270;
							@Pc(1279) int local1279;
							@Pc(1284) int local1284;
							@Pc(1299) int local1299;
							@Pc(1289) int local1289;
							@Pc(1297) int local1297;
							@Pc(1356) int local1356;
							@Pc(1363) int local1363;
							if (local162 != null) {
								local1018 = local162.anInt4903;
								local1014 = local162.anInt4901;
								local1016 = local162.anInt4906;
								local1034 = Static138.method2199(arg0, local162);
								for (local1036 = 0; local1036 < local398; local1036++) {
									if (local88[-local100 & 0x3] && local835[0] == local968) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 1;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 1;
										Static271.anIntArray377[4] = local865[local968];
										Static271.anIntArray377[5] = local841[local968];
										local1112 = 6;
									} else if (local88[2 - local100 & 0x3] && local835[2] == local968) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 5;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 5;
										Static271.anIntArray377[4] = local865[local968];
										Static271.anIntArray377[5] = local841[local968];
										local1112 = 6;
									} else if (local88[1 - local100 & 0x3] && local968 == local835[1]) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 3;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 3;
										Static271.anIntArray377[4] = local865[local968];
										Static271.anIntArray377[5] = local841[local968];
										local1112 = 6;
									} else if (local88[3 - local100 & 0x3] && local835[3] == local968) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 7;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 7;
										Static271.anIntArray377[4] = local865[local968];
										local1112 = 6;
										Static271.anIntArray377[5] = local841[local968];
									} else {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = local865[local968];
										local1112 = 3;
										Static271.anIntArray377[2] = local841[local968];
									}
									for (local1264 = 0; local1264 < local1112; local1264++) {
										local1270 = Static271.anIntArray377[local1264];
										local1279 = local1270 - local100 * 2 & 0x7;
										local1284 = this.anIntArray669[local1270];
										local1289 = this.anIntArray668[local1270];
										if (local100 == 1) {
											local1297 = 512 - local1284;
											local1299 = local1289;
										} else if (local100 == 2) {
											local1299 = 512 - local1284;
											local1297 = 512 - local1289;
										} else if (local100 == 3) {
											local1297 = local1284;
											local1299 = 512 - local1289;
										} else {
											local1299 = local1284;
											local1297 = local1289;
										}
										local984[local970] = local1299;
										local987[local970] = local1297;
										if (local1003 != null && Static647.aBooleanArrayArray7[local94][local1270]) {
											local1356 = (local33 << 9) + local1299;
											local1363 = (local49 << 9) + local1297;
											local1003[local970] = arg5.method7866(local1356, local1363) - arg1.method7866(local1356, local1363);
										}
										if (local1012 != null) {
											if (arg5 != null && !Static647.aBooleanArrayArray7[local94][local1270]) {
												local1356 = (local33 << 9) + local1299;
												local1363 = (local49 << 9) + local1297;
												local1012[local970] = arg1.method7866(local1356, local1363) - arg5.method7866(local1356, local1363);
											} else if (arg4 != null && !Static119.aBooleanArrayArray1[local94][local1270]) {
												local1356 = (local33 << 9) + local1299;
												local1363 = local1297 + (local49 << 9);
												local1012[local970] = arg4.method7866(local1356, local1363) - arg1.method7866(local1356, local1363);
											}
										}
										if (local1270 < 8 && local162.anInt4912 < Static592.anIntArray137[local1279]) {
											if (local981 != null) {
												local981[local970] = Static440.anIntArray593[local1279];
											}
											local996[local970] = Static637.anIntArray793[local1279];
											local993[local970] = Static31.anIntArray66[local1279];
											local990[local970] = Static73.anIntArray121[local1279];
										} else {
											if (local981 != null) {
												local981[local970] = local1034;
											}
											local993[local970] = local162.anInt4906;
											local996[local970] = local162.anInt4903;
											local990[local970] = local1014;
										}
										local970++;
									}
									local968++;
								}
								if (!this.aBoolean636 && arg2 == 0) {
									Static53.method1106(local33, local49, local162.anInt4902, local162.anInt4908 * 8, local162.anInt4900);
								}
								if (local94 != 12 && local162.anInt4901 != -1 && local162.aBoolean336) {
									local83 = true;
								}
							} else if (local833) {
								local968 = Static392.anIntArray527[local94];
							} else if (local85) {
								local968 = Static344.anIntArray829[local94];
							} else {
								local968 = Static176.anIntArray284[local94];
							}
							if (local183 != null) {
								if (local132 == 0) {
									local132 = local116;
								}
								if (local124 == 0) {
									local124 = local116;
								}
								if (local140 == 0) {
									local140 = local116;
								}
								@Pc(1620) Class208 local1620 = this.aClass119_4.method2838(local116 - 1);
								@Pc(1628) Class208 local1628 = this.aClass119_4.method2838(local124 - 1);
								@Pc(1636) Class208 local1636 = this.aClass119_4.method2838(local132 - 1);
								@Pc(1644) Class208 local1644 = this.aClass119_4.method2838(local140 - 1);
								for (local1279 = 0; local1279 < local388; local1279++) {
									if (local88[-local100 & 0x3] && local835[0] == local968) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 1;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 1;
										Static271.anIntArray377[4] = local865[local968];
										local1112 = 6;
										Static271.anIntArray377[5] = local841[local968];
									} else if (local88[2 - local100 & 0x3] && local968 == local835[2]) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 5;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 5;
										Static271.anIntArray377[4] = local865[local968];
										Static271.anIntArray377[5] = local841[local968];
										local1112 = 6;
									} else if (local88[1 - local100 & 0x3] && local968 == local835[1]) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 3;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 3;
										Static271.anIntArray377[4] = local865[local968];
										local1112 = 6;
										Static271.anIntArray377[5] = local841[local968];
									} else if (local88[3 - local100 & 0x3] && local968 == local835[3]) {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = 7;
										Static271.anIntArray377[2] = local841[local968];
										Static271.anIntArray377[3] = 7;
										Static271.anIntArray377[4] = local865[local968];
										local1112 = 6;
										Static271.anIntArray377[5] = local841[local968];
									} else {
										Static271.anIntArray377[0] = local853[local968];
										Static271.anIntArray377[1] = local865[local968];
										Static271.anIntArray377[2] = local841[local968];
										local1112 = 3;
									}
									local968++;
									for (local1284 = 0; local1284 < local1112; local1284++) {
										local1299 = Static271.anIntArray377[local1284];
										local1289 = local1299 - local100 * 2 & 0x7;
										local1297 = this.anIntArray669[local1299];
										local1363 = this.anIntArray668[local1299];
										@Pc(1915) int local1915;
										if (local100 == 1) {
											local1356 = local1363;
											local1915 = 512 - local1297;
										} else if (local100 == 2) {
											local1915 = 512 - local1363;
											local1356 = 512 - local1297;
										} else if (local100 == 3) {
											local1356 = 512 - local1363;
											local1915 = local1297;
										} else {
											local1915 = local1363;
											local1356 = local1297;
										}
										local984[local970] = local1356;
										local987[local970] = local1915;
										@Pc(1970) int local1970;
										@Pc(1976) int local1976;
										if (local1003 != null && Static647.aBooleanArrayArray7[local94][local1299]) {
											local1970 = (local33 << 9) + local1356;
											local1976 = local1915 + (local49 << 9);
											local1003[local970] = arg5.method7866(local1970, local1976) - arg1.method7866(local1970, local1976);
										}
										if (local1012 != null) {
											if (arg5 != null && !Static647.aBooleanArrayArray7[local94][local1299]) {
												local1970 = local1356 + (local33 << 9);
												local1976 = (local49 << 9) + local1915;
												local1012[local970] = arg1.method7866(local1970, local1976) - arg5.method7866(local1970, local1976);
											} else if (arg4 != null && !Static119.aBooleanArrayArray1[local94][local1299]) {
												local1970 = local1356 + (local33 << 9);
												local1976 = local1915 + (local49 << 9);
												local1012[local970] = arg4.method7866(local1970, local1976) - arg1.method7866(local1970, local1976);
											}
										}
										if (local1299 < 8 && Static592.anIntArray137[local1289] >= 0) {
											if (local981 != null) {
												local981[local970] = Static440.anIntArray593[local1289];
											}
											local996[local970] = Static637.anIntArray793[local1289];
											local993[local970] = Static31.anIntArray66[local1289];
											local990[local970] = Static73.anIntArray121[local1289];
										} else {
											if (local85 && Static647.aBooleanArrayArray7[local94][local1299]) {
												local993[local970] = local1016;
												local996[local970] = local1018;
												local990[local970] = local1014;
											} else if (local1356 == 0 && local1915 == 0) {
												local990[local970] = arg3[local33][local49];
												local993[local970] = local1620.anInt6178;
												local996[local970] = local1620.anInt6175;
											} else if (local1356 == 0 && local1915 == 512) {
												local990[local970] = arg3[local33][local67];
												local993[local970] = local1628.anInt6178;
												local996[local970] = local1628.anInt6175;
											} else if (local1356 == 512 && local1915 == 512) {
												local990[local970] = arg3[local47][local67];
												local993[local970] = local1636.anInt6178;
												local996[local970] = local1636.anInt6175;
											} else if (local1356 == 512 && local1915 == 0) {
												local990[local970] = arg3[local47][local49];
												local993[local970] = local1644.anInt6178;
												local996[local970] = local1644.anInt6175;
											} else {
												if (local1356 < 256) {
													if (local1915 < 256) {
														local993[local970] = local1620.anInt6178;
														local996[local970] = local1620.anInt6175;
													} else {
														local993[local970] = local1628.anInt6178;
														local996[local970] = local1628.anInt6175;
													}
												} else if (local1915 < 256) {
													local993[local970] = local1644.anInt6178;
													local996[local970] = local1644.anInt6175;
												} else {
													local993[local970] = local1636.anInt6178;
													local996[local970] = local1636.anInt6175;
												}
												local1970 = Static531.method7617(arg3[local47][local49], arg3[local33][local49], local1356 << 7 >> 9);
												local1976 = Static531.method7617(arg3[local47][local67], arg3[local33][local67], local1356 << 7 >> 9);
												local990[local970] = Static531.method7617(local1976, local1970, local1915 << 7 >> 9);
											}
											if (local981 != null) {
												local981[local970] = local990[local970];
											}
										}
										local970++;
									}
								}
								if (local94 != 0 && local183.aBoolean429) {
									local83 = true;
								}
							}
							local1034 = arg1.method7857(local49, local33);
							local1036 = arg1.method7857(local49, local47);
							local1264 = arg1.method7857(local67, local47);
							local1270 = arg1.method7857(local67, local33);
							@Pc(2400) boolean local2400 = Static329.method5158(local49, local33);
							if (local2400 && arg2 > 1 || !local2400 && arg2 > 0) {
								@Pc(2416) boolean local2416 = true;
								if (local183 != null && !local183.aBoolean430) {
									local2416 = false;
								} else if (local116 == 0 && local94 != 0) {
									local2416 = false;
								} else if (local108 > 0 && local185 != null && !local185.aBoolean334) {
									local2416 = false;
								}
								if (local2416 && local1036 == local1034 && local1264 == local1034 && local1270 == local1034) {
									this.aByteArrayArrayArray12[arg2][local33][local49] = (byte) (this.aByteArrayArrayArray12[arg2][local33][local49] | 0x4);
								}
							}
							local1284 = 0;
							local1299 = 0;
							local1289 = 0;
							if (this.aBoolean636) {
								local1284 = Static174.method9028(local33, local49);
								local1299 = Static630.method8818(local33, local49);
								local1289 = Static438.method6441(local33, local49);
							}
							arg1.U(local33, local49, local984, local1003, local987, local1012, local990, local981, local993, local996, local1284, local1299, local1289, local83);
							Static143.method2263(arg2, local33, local49);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!so;IIIIIIIZI)V")
	private void method7516(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub29 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg2 == 1) {
			arg0 = 1;
		} else if (arg2 == 2) {
			arg6 = 1;
			arg0 = 1;
		} else if (arg2 == 3) {
			arg6 = 1;
		}
		@Pc(56) int local56;
		if (arg4 < 0 || arg4 >= this.anInt9083 || arg5 < 0 || this.anInt9081 <= arg5) {
			while (true) {
				local56 = arg1.method5866();
				if (local56 == 0) {
					return;
				}
				if (local56 == 1) {
					arg1.method5866();
					return;
				}
				if (local56 <= 49) {
					arg1.method5866();
				}
			}
			return;
		}
		if (!this.aBoolean636 && !arg8) {
			Static553.aByteArrayArrayArray18[arg3][arg4][arg5] = 0;
		}
		while (true) {
			local56 = arg1.method5866();
			if (local56 == 0) {
				if (this.aBoolean636) {
					this.anIntArrayArrayArray19[0][arg4 + arg6][arg0 + arg5] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray19[0][arg4 + arg6][arg0 + arg5] = -Static159.method6779(arg9 + 556238, arg7 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray19[arg3][arg6 + arg4][arg0 + arg5] = this.anIntArrayArrayArray19[arg3 - 1][arg6 + arg4][arg0 + arg5] - 960;
					return;
				}
			}
			if (local56 == 1) {
				@Pc(182) int local182 = arg1.method5866();
				if (this.aBoolean636) {
					this.anIntArrayArrayArray19[0][arg4 + arg6][arg0 + arg5] = local182 * 8 << 2;
					return;
				}
				if (local182 == 1) {
					local182 = 0;
				}
				if (arg3 == 0) {
					this.anIntArrayArrayArray19[0][arg4 + arg6][arg0 + arg5] = -local182 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray19[arg3][arg6 + arg4][arg5 + arg0] = this.anIntArrayArrayArray19[arg3 - 1][arg4 + arg6][arg5 + arg0] - (local182 * 8 << 2);
				return;
			}
			if (local56 <= 49) {
				if (arg8) {
					arg1.method5866();
				} else {
					this.aByteArrayArrayArray16[arg3][arg4][arg5] = arg1.method5845();
					this.aByteArrayArrayArray11[arg3][arg4][arg5] = (byte) ((local56 - 2) / 4);
					this.aByteArrayArrayArray13[arg3][arg4][arg5] = (byte) (local56 + arg2 - 2 & 0x3);
				}
			} else if (local56 <= 81) {
				if (!this.aBoolean636 && !arg8) {
					Static553.aByteArrayArrayArray18[arg3][arg4][arg5] = (byte) (local56 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray15[arg3][arg4][arg5] = (byte) (local56 - 81);
			}
		}
	}
}
