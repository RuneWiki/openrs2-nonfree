import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public class Class155 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "[I")
	private final int[] anIntArray358 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
	private final int[] anIntArray357 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	public final int anInt4453;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Z")
	public final boolean aBoolean304;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Lclient!db;")
	private final Class47 aClass47_6;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!hn;")
	private final Class107 aClass107_5;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	protected final int anInt4446;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	protected final int anInt4452;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIZLclient!db;Lclient!hn;)V")
	protected Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class47 arg4, @OriginalArg(5) Class107 arg5) {
		this.anInt4453 = arg0;
		this.aBoolean304 = arg3;
		this.aClass47_6 = arg4;
		this.aClass107_5 = arg5;
		this.anInt4446 = arg2;
		this.anInt4452 = arg1;
		this.aByteArrayArrayArray15 = new byte[this.anInt4453][this.anInt4452][this.anInt4446];
		this.aByteArrayArrayArray13 = new byte[this.anInt4453][this.anInt4452][this.anInt4446];
		this.aByteArrayArrayArray14 = new byte[this.anInt4453][this.anInt4452][this.anInt4446];
		this.aByteArrayArrayArray11 = new byte[this.anInt4453][this.anInt4452 + 1][this.anInt4446 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt4453][this.anInt4452][this.anInt4446];
		this.anIntArrayArrayArray12 = new int[this.anInt4453][this.anInt4452 + 1][this.anInt4446 + 1];
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI[[I)V")
	public final void method3646(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray12[0];
		for (@Pc(17) int local17 = 0; local17 < this.anInt4452 + 1; local17++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt4446 + 1; local21++) {
				local10[local17][local21] += arg0[local17][local21];
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!qa;I[[BIII[[B[[BLclient!wp;Lclient!mv;[ZII)V")
	private void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class267 arg8, @OriginalArg(10) Class162 arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(53) int local53;
		if (arg9 != null && arg8 != null || arg8 != null && arg12 == 12 || arg9 != null && arg12 == 0) {
			@Pc(34) boolean[] local34 = arg9 != null && arg9.aBoolean318 ? Static380.aBooleanArrayArray5[arg12] : Static121.aBooleanArrayArray1[arg12];
			@Pc(66) Class162 local66;
			@Pc(83) byte local83;
			@Pc(100) int local100;
			@Pc(105) int local105;
			if (arg2 > 0) {
				if (arg11 > 0) {
					local53 = arg7[arg11 - 1][arg2 - 1] & 0xFF;
					if (local53 > 0) {
						local66 = this.aClass47_6.method1142(local53 - 1);
						if (local66.anInt4635 != -1 && local66.aBoolean318) {
							local83 = arg6[arg11 - 1][arg2 - 1];
							local100 = arg3[arg11 - 1][arg2 - 1] * 2 + 4 & 0x7;
							local105 = Static96.method1522(local66, arg1);
							if (Static307.aBooleanArrayArray4[local83][local100]) {
								Static253.anIntArray368[0] = local66.anInt4635;
								Static206.anIntArray316[0] = local105;
								Static189.anIntArray284[0] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
								Static109.anIntArray176[0] = local66.anInt4628;
								Static175.anIntArray268[0] = local66.anInt4637;
								Static246.anIntArray352[0] = 256;
							}
						}
					}
				}
				if (arg0 - 1 > arg11) {
					local53 = arg7[arg11 + 1][arg2 - 1] & 0xFF;
					if (local53 > 0) {
						local66 = this.aClass47_6.method1142(local53 - 1);
						if (local66.anInt4635 != -1 && local66.aBoolean318) {
							local83 = arg6[arg11 + 1][arg2 - 1];
							local100 = arg3[arg11 + 1][arg2 - 1] * 2 + 6 & 0x7;
							local105 = Static96.method1522(local66, arg1);
							if (Static307.aBooleanArrayArray4[local83][local100]) {
								Static253.anIntArray368[2] = local66.anInt4635;
								Static206.anIntArray316[2] = local105;
								Static189.anIntArray284[2] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
								Static109.anIntArray176[2] = local66.anInt4628;
								Static175.anIntArray268[2] = local66.anInt4637;
								Static246.anIntArray352[2] = 512;
							}
						}
					}
				}
			}
			if (arg2 < arg5 - 1) {
				if (arg11 > 0) {
					local53 = arg7[arg11 - 1][arg2 + 1] & 0xFF;
					if (local53 > 0) {
						local66 = this.aClass47_6.method1142(local53 - 1);
						if (local66.anInt4635 != -1 && local66.aBoolean318) {
							local83 = arg6[arg11 - 1][arg2 + 1];
							local100 = arg3[arg11 - 1][arg2 + 1] * 2 + 2 & 0x7;
							local105 = Static96.method1522(local66, arg1);
							if (Static307.aBooleanArrayArray4[local83][local100]) {
								Static253.anIntArray368[6] = local66.anInt4635;
								Static206.anIntArray316[6] = local105;
								Static189.anIntArray284[6] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
								Static109.anIntArray176[6] = local66.anInt4628;
								Static175.anIntArray268[6] = local66.anInt4637;
								Static246.anIntArray352[6] = 64;
							}
						}
					}
				}
				if (arg11 < arg0 - 1) {
					local53 = arg7[arg11 + 1][arg2 + 1] & 0xFF;
					if (local53 > 0) {
						local66 = this.aClass47_6.method1142(local53 - 1);
						if (local66.anInt4635 != -1 && local66.aBoolean318) {
							local83 = arg6[arg11 + 1][arg2 + 1];
							local100 = --(arg3[arg11 + 1][arg2 + 1] * 2) & 0x7;
							local105 = Static96.method1522(local66, arg1);
							if (Static307.aBooleanArrayArray4[local83][local100]) {
								Static253.anIntArray368[4] = local66.anInt4635;
								Static206.anIntArray316[4] = local105;
								Static189.anIntArray284[4] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
								Static109.anIntArray176[4] = local66.anInt4628;
								Static175.anIntArray268[4] = local66.anInt4637;
								Static246.anIntArray352[4] = 128;
							}
						}
					}
				}
			}
			@Pc(530) int local530;
			@Pc(535) int local535;
			@Pc(537) int local537;
			@Pc(519) byte local519;
			if (arg2 > 0) {
				local53 = arg7[arg11][arg2 - 1] & 0xFF;
				if (local53 > 0) {
					local66 = this.aClass47_6.method1142(local53 - 1);
					if (local66.anInt4635 != -1) {
						local83 = arg6[arg11][arg2 - 1];
						local519 = arg3[arg11][arg2 - 1];
						if (local66.aBoolean318) {
							local105 = 2;
							local530 = local519 * 2 + 4;
							local535 = Static96.method1522(local66, arg1);
							for (local537 = 0; local537 < 3; local537++) {
								local105 &= 0x7;
								local530 &= 0x7;
								if (Static307.aBooleanArrayArray4[local83][local530] && Static175.anIntArray268[local105] <= local66.anInt4637) {
									Static253.anIntArray368[local105] = local66.anInt4635;
									Static206.anIntArray316[local105] = local535;
									Static189.anIntArray284[local105] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
									Static109.anIntArray176[local105] = local66.anInt4628;
									if (local66.anInt4637 == Static175.anIntArray268[local105]) {
										Static246.anIntArray352[local105] |= 0x20;
									} else {
										Static246.anIntArray352[local105] = 32;
									}
									Static175.anIntArray268[local105] = local66.anInt4637;
								}
								local530++;
								local105--;
							}
							if (!local34[arg4 & 0x3]) {
								arg10[0] = Static380.aBooleanArrayArray5[local83][local519 + 2 & 0x3];
							}
						} else if (!local34[--arg4 & 0x3]) {
							arg10[0] = Static121.aBooleanArrayArray1[local83][local519 + 2 & 0x3];
						}
					}
				}
			}
			if (arg5 - 1 > arg2) {
				local53 = arg7[arg11][arg2 + 1] & 0xFF;
				if (local53 > 0) {
					local66 = this.aClass47_6.method1142(local53 - 1);
					if (local66.anInt4635 != -1) {
						local83 = arg6[arg11][arg2 + 1];
						local519 = arg3[arg11][arg2 + 1];
						if (local66.aBoolean318) {
							local105 = 4;
							local530 = local519 * 2 + 2;
							local535 = Static96.method1522(local66, arg1);
							for (local537 = 0; local537 < 3; local537++) {
								local105 &= 0x7;
								local530 &= 0x7;
								if (Static307.aBooleanArrayArray4[local83][local530] && Static175.anIntArray268[local105] <= local66.anInt4637) {
									Static253.anIntArray368[local105] = local66.anInt4635;
									Static206.anIntArray316[local105] = local535;
									Static189.anIntArray284[local105] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
									Static109.anIntArray176[local105] = local66.anInt4628;
									if (local66.anInt4637 == Static175.anIntArray268[local105]) {
										Static246.anIntArray352[local105] |= 0x10;
									} else {
										Static246.anIntArray352[local105] = 16;
									}
									Static175.anIntArray268[local105] = local66.anInt4637;
								}
								local530--;
								local105++;
							}
							if (!local34[arg4 + 2 & 0x3]) {
								arg10[2] = Static380.aBooleanArrayArray5[local83][local519 & 0x3];
							}
						} else if (!local34[arg4 + 2 & 0x3]) {
							arg10[2] = Static121.aBooleanArrayArray1[local83][local519 & 0x3];
						}
					}
				}
			}
			if (arg11 > 0) {
				local53 = arg7[arg11 - 1][arg2] & 0xFF;
				if (local53 > 0) {
					local66 = this.aClass47_6.method1142(local53 - 1);
					if (local66.anInt4635 != -1) {
						local83 = arg6[arg11 - 1][arg2];
						local519 = arg3[arg11 - 1][arg2];
						if (local66.aBoolean318) {
							local105 = 6;
							local530 = local519 * 2 + 4;
							local535 = Static96.method1522(local66, arg1);
							for (local537 = 0; local537 < 3; local537++) {
								local105 &= 0x7;
								local530 &= 0x7;
								if (Static307.aBooleanArrayArray4[local83][local530] && local66.anInt4637 >= Static175.anIntArray268[local105]) {
									Static253.anIntArray368[local105] = local66.anInt4635;
									Static206.anIntArray316[local105] = local535;
									Static189.anIntArray284[local105] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
									Static109.anIntArray176[local105] = local66.anInt4628;
									if (local66.anInt4637 == Static175.anIntArray268[local105]) {
										Static246.anIntArray352[local105] |= 0x8;
									} else {
										Static246.anIntArray352[local105] = 8;
									}
									Static175.anIntArray268[local105] = local66.anInt4637;
								}
								local530--;
								local105++;
							}
							if (!local34[arg4 + 3 & 0x3]) {
								arg10[3] = Static380.aBooleanArrayArray5[local83][local519 + 1 & 0x3];
							}
						} else if (!local34[arg4 + 3 & 0x3]) {
							arg10[3] = Static121.aBooleanArrayArray1[local83][local519 + 1 & 0x3];
						}
					}
				}
			}
			if (arg0 - 1 > arg11) {
				local53 = arg7[arg11 + 1][arg2] & 0xFF;
				if (local53 > 0) {
					local66 = this.aClass47_6.method1142(local53 - 1);
					if (local66.anInt4635 != -1) {
						local83 = arg6[arg11 + 1][arg2];
						local519 = arg3[arg11 + 1][arg2];
						if (local66.aBoolean318) {
							local105 = 4;
							local530 = local519 * 2 + 6;
							local535 = Static96.method1522(local66, arg1);
							for (local537 = 0; local537 < 3; local537++) {
								local105 &= 0x7;
								local530 &= 0x7;
								if (Static307.aBooleanArrayArray4[local83][local530] && local66.anInt4637 >= Static175.anIntArray268[local105]) {
									Static253.anIntArray368[local105] = local66.anInt4635;
									Static206.anIntArray316[local105] = local535;
									Static189.anIntArray284[local105] = arg1.method4703() ? local66.anInt4636 : local66.anInt4630;
									Static109.anIntArray176[local105] = local66.anInt4628;
									if (local66.anInt4637 == Static175.anIntArray268[local105]) {
										Static246.anIntArray352[local105] |= 0x4;
									} else {
										Static246.anIntArray352[local105] = 4;
									}
									Static175.anIntArray268[local105] = local66.anInt4637;
								}
								local530++;
								local105--;
							}
							if (!local34[arg4 + 1 & 0x3]) {
								arg10[1] = Static380.aBooleanArrayArray5[local83][local519 + 3 & 0x3];
							}
						} else if (!local34[arg4 + 1 & 0x3]) {
							arg10[1] = Static121.aBooleanArrayArray1[local83][local519 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		@Pc(1245) int local1245 = Static96.method1522(arg9, arg1);
		if (!arg9.aBoolean318) {
			return;
		}
		for (local53 = 0; local53 < 8; local53++) {
			@Pc(1261) int local1261 = local53 - arg4 * 2 & 0x7;
			if (Static307.aBooleanArrayArray4[arg12][local53] && Static175.anIntArray268[local1261] <= arg9.anInt4637) {
				Static253.anIntArray368[local1261] = arg9.anInt4635;
				Static206.anIntArray316[local1261] = local1245;
				Static189.anIntArray284[local1261] = arg1.method4703() ? arg9.anInt4636 : arg9.anInt4630;
				Static109.anIntArray176[local1261] = arg9.anInt4628;
				if (Static175.anIntArray268[local1261] == arg9.anInt4637) {
					Static246.anIntArray352[local1261] |= 0x2;
				} else {
					Static246.anIntArray352[local1261] = 2;
				}
				Static175.anIntArray268[local1261] = arg9.anInt4637;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLclient!lh;IIIIIII)V")
	private void method3648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == 1) {
			arg7 = 1;
		} else if (arg0 == 2) {
			arg7 = 1;
			arg8 = 1;
		} else if (arg0 == 3) {
			arg8 = 1;
		}
		@Pc(74) int local74;
		if (arg6 < 0 || this.anInt4452 <= arg6 || arg1 < 0 || this.anInt4446 <= arg1) {
			while (true) {
				local74 = arg3.method4130();
				if (local74 == 0) {
					return;
				}
				if (local74 == 1) {
					arg3.method4130();
					return;
				}
				if (local74 <= 49) {
					arg3.method4130();
				}
			}
			return;
		}
		if (!this.aBoolean304 && !arg2) {
			Static184.aByteArrayArrayArray3[arg4][arg6][arg1] = 0;
		}
		while (true) {
			local74 = arg3.method4130();
			if (local74 == 0) {
				if (this.aBoolean304) {
					this.anIntArrayArrayArray12[0][arg6 + arg8][arg7 + arg1] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray12[0][arg8 + arg6][arg7 + arg1] = -Static342.method4808(arg5 + 556238, arg9 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray12[arg4][arg8 + arg6][arg1 + arg7] = this.anIntArrayArrayArray12[arg4 - 1][arg8 + arg6][arg1 + arg7] - 240;
					return;
				}
			}
			if (local74 == 1) {
				@Pc(159) int local159 = arg3.method4130();
				if (this.aBoolean304) {
					this.anIntArrayArrayArray12[0][arg6 + arg8][arg1 + arg7] = local159 * 8 << 0;
					return;
				}
				if (local159 == 1) {
					local159 = 0;
				}
				if (arg4 == 0) {
					this.anIntArrayArrayArray12[0][arg8 + arg6][arg1 + arg7] = -local159 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray12[arg4][arg6 + arg8][arg7 + arg1] = this.anIntArrayArrayArray12[arg4 - 1][arg8 + arg6][arg7 + arg1] - (local159 * 8 << 0);
				return;
			}
			if (local74 <= 49) {
				if (arg2) {
					arg3.method4130();
				} else {
					this.aByteArrayArrayArray13[arg4][arg6][arg1] = arg3.method4112();
					this.aByteArrayArrayArray15[arg4][arg6][arg1] = (byte) ((local74 - 2) / 4);
					this.aByteArrayArrayArray14[arg4][arg6][arg1] = (byte) (local74 + arg0 - 2 & 0x3);
				}
			} else if (local74 <= 81) {
				if (!this.aBoolean304 && !arg2) {
					Static184.aByteArrayArrayArray3[arg4][arg6][arg1] = (byte) (local74 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray12[arg4][arg6][arg1] = (byte) (local74 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!qa;ILclient!na;Lclient!na;)V")
	public final void method3649(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Class136 arg1, @OriginalArg(3) Class136 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt4452][this.anInt4446];
		if (Static233.anIntArray339 == null || this.anInt4446 != Static233.anIntArray339.length) {
			Static148.anIntArray244 = new int[this.anInt4446];
			Static445.anIntArray665 = new int[this.anInt4446];
			Static400.anIntArray575 = new int[this.anInt4446];
			Static233.anIntArray339 = new int[this.anInt4446];
			Static204.anIntArray311 = new int[this.anInt4446];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt4453; local44++) {
			for (local48 = 0; local48 < this.anInt4446; local48++) {
				Static233.anIntArray339[local48] = 0;
				Static445.anIntArray665[local48] = 0;
				Static204.anIntArray311[local48] = 0;
				Static400.anIntArray575[local48] = 0;
				Static148.anIntArray244[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt4452; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(182) int local182;
				for (@Pc(85) int local85 = 0; local85 < this.anInt4446; local85++) {
					local91 = local81 + 5;
					@Pc(159) int local159;
					if (local91 < this.anInt4452) {
						local110 = this.aByteArrayArrayArray12[local44][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(123) Class267 local123 = this.aClass107_5.method2353(local110 - 1);
							Static233.anIntArray339[local85] += local123.anInt7709;
							Static445.anIntArray665[local85] += local123.anInt7699;
							Static204.anIntArray311[local85] += local123.anInt7707;
							Static400.anIntArray575[local85] += local123.anInt7701;
							local159 = Static148.anIntArray244[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local182 = this.aByteArrayArrayArray12[local44][local110][local85] & 0xFF;
						if (local182 > 0) {
							@Pc(195) Class267 local195 = this.aClass107_5.method2353(local182 - 1);
							Static233.anIntArray339[local85] -= local195.anInt7709;
							Static445.anIntArray665[local85] -= local195.anInt7699;
							Static204.anIntArray311[local85] -= local195.anInt7707;
							Static400.anIntArray575[local85] -= local195.anInt7701;
							local159 = Static148.anIntArray244[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local182 = 0;
					@Pc(253) int local253 = 0;
					@Pc(255) int local255 = 0;
					for (@Pc(257) int local257 = -5; local257 < this.anInt4446; local257++) {
						@Pc(263) int local263 = local257 + 5;
						if (this.anInt4446 > local263) {
							local110 += Static445.anIntArray665[local263];
							local91 += Static233.anIntArray339[local263];
							local253 += Static400.anIntArray575[local263];
							local255 += Static148.anIntArray244[local263];
							local182 += Static204.anIntArray311[local263];
						}
						@Pc(301) int local301 = local257 - 5;
						if (local301 >= 0) {
							local182 -= Static204.anIntArray311[local301];
							local110 -= Static445.anIntArray665[local301];
							local253 -= Static400.anIntArray575[local301];
							local91 -= Static233.anIntArray339[local301];
							local255 -= Static148.anIntArray244[local301];
						}
						if (local257 >= 0 && local253 > 0 && local255 > 0) {
							local11[local81][local257] = Static59.method1069(local91 * 256 / local253, local110 / local255, local182 / local255);
						}
					}
				}
			}
			if (Static342.aBoolean386) {
				this.method3652(arg0, local44, local44 == 0 ? arg1 : null, local11, local44 == 0 ? arg2 : null, Static92.aClass136Array1[local44]);
			} else {
				this.method3654(local44 == 0 ? arg1 : null, arg0, local11, local44 == 0 ? arg2 : null, local44, Static92.aClass136Array1[local44]);
			}
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
		}
		if (!this.aBoolean304) {
			if (Static348.anInt5978 != 0) {
				Static166.method4937();
			}
			if (Static304.aBoolean347) {
				Static78.method1353();
			}
		}
		for (local48 = 0; local48 < this.anInt4453; local48++) {
			Static92.aClass136Array1[local48].f();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLclient!lh;[Lclient!id;II)V")
	public final void method3650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1 arg2, @OriginalArg(4) Class112[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean304) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class112 local16 = arg3[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg5;
						@Pc(32) int local32 = local22 + arg0;
						if (local28 >= 0 && this.anInt4452 > local28 && local32 >= 0 && local32 < this.anInt4446) {
							local16.method2694(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg5 + arg1;
		@Pc(78) int local78 = arg4 + arg0;
		for (local18 = 0; local18 < this.anInt4453; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method3648(0, local28 + arg0, false, arg2, local18, local28 + local78, local22 + arg5, 0, 0, local22 + local10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public final void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg4; local7 < arg1 + arg4; local7++) {
			for (local11 = arg0; local11 < arg3 + arg0; local11++) {
				if (local11 >= 0 && this.anInt4452 > local11 && local7 >= 0 && local7 < this.anInt4446) {
					this.anIntArrayArrayArray12[arg2][local11][local7] = arg2 > 0 ? this.anIntArrayArrayArray12[arg2 - 1][local11][local7] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt4452) {
			for (local11 = arg4 + 1; local11 < arg1 + arg4; local11++) {
				if (local11 >= 0 && local11 < this.anInt4446) {
					this.anIntArrayArrayArray12[arg2][arg0][local11] = this.anIntArrayArrayArray12[arg2][arg0 - 1][local11];
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt4446) {
			for (local11 = arg0 + 1; local11 < arg0 + arg3; local11++) {
				if (local11 >= 0 && local11 < this.anInt4452) {
					this.anIntArrayArrayArray12[arg2][local11][arg4] = this.anIntArrayArrayArray12[arg2][local11][arg4 - 1];
				}
			}
		}
		if (arg0 < 0 || arg4 < 0 || arg0 >= this.anInt4452 || this.anInt4446 <= arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg4] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray12[arg2][arg0][arg4 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg4] = this.anIntArrayArrayArray12[arg2][arg0][arg4 - 1];
				return;
			}
			if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg0][arg4] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4] != this.anIntArrayArrayArray12[arg2 - 1][arg0 - 1][arg4]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg4] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray12[arg2][arg0][arg4 - 1] != this.anIntArrayArrayArray12[arg2 - 1][arg0][arg4 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg4] = this.anIntArrayArrayArray12[arg2][arg0][arg4 - 1];
			return;
		}
		if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray12[arg2 - 1][arg0 - 1][arg4 - 1] != this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg0][arg4] = this.anIntArrayArrayArray12[arg2][arg0 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!qa;ILclient!na;B[[ILclient!na;Lclient!na;)V")
	private void method3652(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class136 arg4, @OriginalArg(6) Class136 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray15[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray12[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray13[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt4452; local27++) {
			@Pc(60) int local60 = local27 >= this.anInt4452 - 1 ? local27 : local27 + 1;
			for (@Pc(62) int local62 = 0; local62 < this.anInt4446; local62++) {
				@Pc(80) int local80 = this.anInt4446 - 1 > local62 ? local62 + 1 : local62;
				if (Static434.anInt7473 == -1 || Static266.method3895(local27, local62, Static434.anInt7473, arg1)) {
					@Pc(94) boolean local94 = false;
					@Pc(96) boolean local96 = false;
					@Pc(99) boolean[] local99 = new boolean[4];
					@Pc(105) int local105 = local10[local27][local62];
					@Pc(111) int local111 = local15[local27][local62];
					@Pc(119) int local119 = local25[local27][local62] & 0xFF;
					@Pc(127) int local127 = local20[local27][local62] & 0xFF;
					@Pc(135) int local135 = local20[local27][local80] & 0xFF;
					@Pc(143) int local143 = local20[local60][local80] & 0xFF;
					@Pc(151) int local151 = local20[local60][local62] & 0xFF;
					if (local119 != 0 || local127 != 0) {
						@Pc(173) Class162 local173 = local119 == 0 ? null : this.aClass47_6.method1142(local119 - 1);
						@Pc(185) Class267 local185 = local127 == 0 ? null : this.aClass107_5.method2353(local127 - 1);
						if (local105 == 0 && local173 == null) {
							local105 = 12;
						}
						@Pc(196) Class162 local196 = local173;
						if (local173 != null) {
							if (local173.anInt4635 == -1 && local173.anInt4627 == -1) {
								local196 = local173;
								local173 = null;
							} else if (local185 != null && local105 != 0) {
								local96 = local173.aBoolean318;
							}
						}
						@Pc(275) int local275;
						@Pc(322) int local322;
						@Pc(387) int local387;
						@Pc(397) int local397;
						if ((local105 == 0 || local105 == 12) && local27 > 0 && local62 > 0 && local27 < this.anInt4452 && this.anInt4446 > local62) {
							local275 = local127 == local20[local27 - 1][local62 - 1] ? 1 : -1;
							@Pc(292) int local292 = local127 == local20[local60][local80] ? 1 : -1;
							@Pc(307) int local307 = local127 == local20[local60][local62 - 1] ? 1 : -1;
							local322 = local127 == local20[local27 - 1][local80] ? 1 : -1;
							if (local127 == local20[local27][local62 - 1]) {
								local307++;
								local275++;
							} else {
								local275--;
								local307--;
							}
							if (local20[local60][local62] == local127) {
								local292++;
								local307++;
							} else {
								local307--;
								local292--;
							}
							if (local127 == local20[local27][local80]) {
								local292++;
								local322++;
							} else {
								local292--;
								local322--;
							}
							if (local127 == local20[local27 - 1][local62]) {
								local275++;
								local322++;
							} else {
								local322--;
								local275--;
							}
							local387 = local275 - local292;
							if (local387 < 0) {
								local387 = -local387;
							}
							local397 = local307 - local322;
							if (local397 < 0) {
								local397 = -local397;
							}
							if (local397 == local387) {
								local387 = arg5.I(local27, local62) - arg5.I(local60, local80);
								if (local387 < 0) {
									local387 = -local387;
								}
								local397 = arg5.I(local60, local62) - arg5.I(local27, local80);
								if (local397 < 0) {
									local397 = -local397;
								}
							}
							local111 = local397 <= local387 ? 0 : 1;
						}
						for (local275 = 0; local275 < 13; local275++) {
							Static175.anIntArray268[local275] = -1;
							Static246.anIntArray352[local275] = 1;
						}
						@Pc(488) boolean[] local488 = local173 != null && local173.aBoolean318 ? Static380.aBooleanArrayArray5[local105] : Static121.aBooleanArrayArray1[local105];
						this.method3647(this.anInt4452, arg0, local62, local15, local111, this.anInt4446, local10, local25, local185, local173, local99, local27, local105);
						@Pc(521) boolean local521 = local173 != null && local173.anInt4635 != local173.anInt4627;
						if (!local521) {
							for (local322 = 0; local322 < 8; local322++) {
								if (Static175.anIntArray268[local322] >= 0 && Static253.anIntArray368[local322] != Static206.anIntArray316[local322]) {
									local521 = true;
									break;
								}
							}
						}
						if (!local488[local111 + 1 & 0x3]) {
							local99[1] = Static425.method5708(local99[1], (Static246.anIntArray352[4] & Static246.anIntArray352[2]) == 0);
						}
						if (!local488[local111 + 3 & 0x3]) {
							local99[3] = Static425.method5708(local99[3], (Static246.anIntArray352[0] & Static246.anIntArray352[6]) == 0);
						}
						if (!local488[local111 & 0x3]) {
							local99[0] = Static425.method5708(local99[0], (Static246.anIntArray352[2] & Static246.anIntArray352[0]) == 0);
						}
						if (!local488[local111 + 2 & 0x3]) {
							local99[2] = Static425.method5708(local99[2], (Static246.anIntArray352[6] & Static246.anIntArray352[4]) == 0);
						}
						if (!local96 && (local105 == 0 || local105 == 12)) {
							if (local99[0] && !local99[1] && !local99[2] && local99[3]) {
								local105 = local105 == 0 ? 13 : 14;
								local111 = 0;
								local99[0] = local99[3] = false;
							} else if (local99[0] && local99[1] && !local99[2] && !local99[3]) {
								local105 = local105 == 0 ? 13 : 14;
								local111 = 3;
								local99[0] = local99[1] = false;
							} else if (!local99[0] && local99[1] && local99[2] && !local99[3]) {
								local99[1] = local99[2] = false;
								local105 = local105 == 0 ? 13 : 14;
								local111 = 2;
							} else if (!local99[0] && !local99[1] && local99[2] && local99[3]) {
								local99[2] = local99[3] = false;
								local111 = 1;
								local105 = local105 == 0 ? 13 : 14;
							}
						}
						@Pc(831) boolean local831 = !local96 && !local99[0] && !local99[2] && !local99[1] && !local99[3];
						@Pc(833) int[] local833 = null;
						@Pc(855) int[] local855;
						@Pc(863) int[] local863;
						@Pc(859) int[] local859;
						if (local831) {
							local397 = local173 == null ? 0 : Static70.anIntArray96[local105];
							local387 = local185 == null ? 0 : Static106.anIntArray173[local105];
							local855 = Static375.anIntArrayArray180[local105];
							local859 = Static226.anIntArrayArray115[local105];
							local863 = Static273.anIntArrayArray134[local105];
						} else if (local96) {
							local863 = Static209.anIntArrayArray212[local105];
							local397 = local173 == null ? 0 : Static53.anIntArray72[local105];
							local833 = Static30.anIntArrayArray14[local105];
							local855 = Static144.anIntArrayArray75[local105];
							local387 = local185 == null ? 0 : Static391.anIntArray563[local105];
							local859 = Static313.anIntArrayArray159[local105];
						} else {
							local855 = Static56.anIntArrayArray194[local105];
							local387 = local185 == null ? 0 : Static329.anIntArray455[local105];
							local863 = Static435.anIntArrayArray204[local105];
							local859 = Static246.anIntArrayArray124[local105];
							local397 = local173 == null ? 0 : Static9.anIntArray11[local105];
							local833 = Static262.anIntArrayArray129[local105];
						}
						@Pc(936) int local936 = local387 + local397;
						if (local936 <= 0) {
							Static294.method4793(arg1, local27, local62);
						} else {
							if (local99[0]) {
								local936++;
							}
							if (local99[2]) {
								local936++;
							}
							if (local99[1]) {
								local936++;
							}
							if (local99[3]) {
								local936++;
							}
							@Pc(966) int local966 = 0;
							@Pc(968) int local968 = 0;
							@Pc(972) int local972 = local936 * 3;
							@Pc(979) int[] local979 = local521 ? new int[local972] : null;
							@Pc(982) int[] local982 = new int[local972];
							@Pc(985) int[] local985 = new int[local972];
							@Pc(988) int[] local988 = new int[local972];
							@Pc(991) int[] local991 = new int[local972];
							@Pc(994) int[] local994 = new int[local972];
							@Pc(1001) int[] local1001 = arg4 == null ? null : new int[local972];
							@Pc(1010) int[] local1010 = arg4 == null && arg2 == null ? null : new int[local972];
							@Pc(1012) int local1012 = -1;
							@Pc(1014) int local1014 = -1;
							@Pc(1016) int local1016 = 256;
							@Pc(1136) byte local1136;
							@Pc(1066) int local1066;
							@Pc(1068) int local1068;
							@Pc(1299) int local1299;
							@Pc(1305) int local1305;
							@Pc(1314) int local1314;
							@Pc(1319) int local1319;
							@Pc(1344) int local1344;
							@Pc(1324) int local1324;
							@Pc(1339) int local1339;
							@Pc(1391) int local1391;
							@Pc(1397) int local1397;
							if (local173 != null) {
								local1012 = local173.anInt4635;
								local1014 = arg0.method4703() ? local173.anInt4636 : local173.anInt4630;
								local1016 = local173.anInt4628;
								local1066 = Static96.method1522(local173, arg0);
								for (local1068 = 0; local1068 < local397; local1068++) {
									if (local99[-local111 & 0x3] && local833[0] == local966) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 1;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 1;
										Static70.anIntArray98[4] = local863[local966];
										local1136 = 6;
										Static70.anIntArray98[5] = local859[local966];
									} else if (local99[2 - local111 & 0x3] && local966 == local833[2]) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 5;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 5;
										Static70.anIntArray98[4] = local863[local966];
										Static70.anIntArray98[5] = local859[local966];
										local1136 = 6;
									} else if (local99[1 - local111 & 0x3] && local966 == local833[1]) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 3;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 3;
										Static70.anIntArray98[4] = local863[local966];
										Static70.anIntArray98[5] = local859[local966];
										local1136 = 6;
									} else if (local99[3 - local111 & 0x3] && local966 == local833[3]) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 7;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 7;
										Static70.anIntArray98[4] = local863[local966];
										Static70.anIntArray98[5] = local859[local966];
										local1136 = 6;
									} else {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = local863[local966];
										local1136 = 3;
										Static70.anIntArray98[2] = local859[local966];
									}
									for (local1299 = 0; local1299 < local1136; local1299++) {
										local1305 = Static70.anIntArray98[local1299];
										local1314 = local1305 - local111 * 2 & 0x7;
										local1319 = this.anIntArray357[local1305];
										local1324 = this.anIntArray358[local1305];
										if (local111 == 1) {
											local1339 = 128 - local1319;
											local1344 = local1324;
										} else if (local111 == 2) {
											local1344 = 128 - local1319;
											local1339 = 128 - local1324;
										} else if (local111 == 3) {
											local1339 = local1319;
											local1344 = 128 - local1324;
										} else {
											local1344 = local1319;
											local1339 = local1324;
										}
										local982[local968] = local1344;
										local985[local968] = local1339;
										if (local1001 != null && Static307.aBooleanArrayArray4[local105][local1305]) {
											local1391 = (local27 << 7) + local1344;
											local1397 = (local62 << 7) + local1339;
											local1001[local968] = arg4.va(local1391, local1397) - arg5.va(local1391, local1397);
										}
										if (local1010 != null) {
											if (arg4 != null && !Static307.aBooleanArrayArray4[local105][local1305]) {
												local1391 = local1344 + (local27 << 7);
												local1397 = local1339 + (local62 << 7);
												local1010[local968] = arg5.va(local1391, local1397) - arg4.va(local1391, local1397);
											} else if (arg2 != null && !Static211.aBooleanArrayArray2[local105][local1305]) {
												local1391 = local1344 + (local27 << 7);
												local1397 = local1339 + (local62 << 7);
												local1010[local968] = arg2.va(local1391, local1397) - arg5.va(local1391, local1397);
											}
										}
										if (local1305 < 8 && Static175.anIntArray268[local1314] > local173.anInt4637) {
											if (local979 != null) {
												local979[local968] = Static206.anIntArray316[local1314];
											}
											local994[local968] = Static109.anIntArray176[local1314];
											local991[local968] = Static189.anIntArray284[local1314];
											local988[local968] = Static253.anIntArray368[local1314];
										} else {
											if (local979 != null) {
												local979[local968] = local1066;
											}
											local991[local968] = arg0.method4703() ? local173.anInt4636 : local173.anInt4630;
											local994[local968] = local173.anInt4628;
											local988[local968] = local1012;
										}
										local968++;
									}
									local966++;
								}
								if (!this.aBoolean304 && arg1 == 0) {
									Static50.method824(local27, local62, local173.anInt4639, local173.anInt4633 * 8, local173.anInt4634);
								}
								if (local105 != 12 && local173.anInt4635 != -1 && local173.aBoolean319) {
									local94 = true;
								}
							} else if (local831) {
								local966 = Static70.anIntArray96[local105];
							} else if (local96) {
								local966 = Static53.anIntArray72[local105];
							} else {
								local966 = Static9.anIntArray11[local105];
							}
							if (local185 != null) {
								if (local151 == 0) {
									local151 = local127;
								}
								if (local135 == 0) {
									local135 = local127;
								}
								if (local143 == 0) {
									local143 = local127;
								}
								@Pc(1624) Class267 local1624 = this.aClass107_5.method2353(local127 - 1);
								@Pc(1632) Class267 local1632 = this.aClass107_5.method2353(local135 - 1);
								@Pc(1640) Class267 local1640 = this.aClass107_5.method2353(local143 - 1);
								@Pc(1648) Class267 local1648 = this.aClass107_5.method2353(local151 - 1);
								for (local1314 = 0; local1314 < local387; local1314++) {
									if (local99[-local111 & 0x3] && local966 == local833[0]) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 1;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 1;
										Static70.anIntArray98[4] = local863[local966];
										Static70.anIntArray98[5] = local859[local966];
										local1136 = 6;
									} else if (local99[2 - local111 & 0x3] && local833[2] == local966) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 5;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 5;
										Static70.anIntArray98[4] = local863[local966];
										local1136 = 6;
										Static70.anIntArray98[5] = local859[local966];
									} else if (local99[1 - local111 & 0x3] && local833[1] == local966) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 3;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 3;
										Static70.anIntArray98[4] = local863[local966];
										local1136 = 6;
										Static70.anIntArray98[5] = local859[local966];
									} else if (local99[3 - local111 & 0x3] && local966 == local833[3]) {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = 7;
										Static70.anIntArray98[2] = local859[local966];
										Static70.anIntArray98[3] = 7;
										Static70.anIntArray98[4] = local863[local966];
										Static70.anIntArray98[5] = local859[local966];
										local1136 = 6;
									} else {
										Static70.anIntArray98[0] = local855[local966];
										Static70.anIntArray98[1] = local863[local966];
										Static70.anIntArray98[2] = local859[local966];
										local1136 = 3;
									}
									for (local1319 = 0; local1319 < local1136; local1319++) {
										local1344 = Static70.anIntArray98[local1319];
										local1324 = local1344 - local111 * 2 & 0x7;
										local1339 = this.anIntArray357[local1344];
										local1397 = this.anIntArray358[local1344];
										@Pc(1914) int local1914;
										if (local111 == 1) {
											local1914 = 128 - local1339;
											local1391 = local1397;
										} else if (local111 == 2) {
											local1391 = 128 - local1339;
											local1914 = 128 - local1397;
										} else if (local111 == 3) {
											local1914 = local1339;
											local1391 = 128 - local1397;
										} else {
											local1391 = local1339;
											local1914 = local1397;
										}
										local982[local968] = local1391;
										local985[local968] = local1914;
										@Pc(1971) int local1971;
										@Pc(1977) int local1977;
										if (local1001 != null && Static307.aBooleanArrayArray4[local105][local1344]) {
											local1971 = (local27 << 7) + local1391;
											local1977 = (local62 << 7) + local1914;
											local1001[local968] = arg4.va(local1971, local1977) - arg5.va(local1971, local1977);
										}
										if (local1010 != null) {
											if (arg4 != null && !Static307.aBooleanArrayArray4[local105][local1344]) {
												local1971 = local1391 + (local27 << 7);
												local1977 = local1914 + (local62 << 7);
												local1010[local968] = arg5.va(local1971, local1977) - arg4.va(local1971, local1977);
											} else if (arg2 != null && !Static211.aBooleanArrayArray2[local105][local1344]) {
												local1971 = local1391 + (local27 << 7);
												local1977 = local1914 + (local62 << 7);
												local1010[local968] = arg2.va(local1971, local1977) - arg5.va(local1971, local1977);
											}
										}
										if (local1344 < 8 && Static175.anIntArray268[local1324] >= 0) {
											if (local979 != null) {
												local979[local968] = Static206.anIntArray316[local1324];
											}
											local994[local968] = Static109.anIntArray176[local1324];
											local991[local968] = Static189.anIntArray284[local1324];
											local988[local968] = Static253.anIntArray368[local1324];
										} else {
											if (local96 && Static307.aBooleanArrayArray4[local105][local1344]) {
												local991[local968] = local1014;
												local994[local968] = local1016;
												local988[local968] = local1012;
											} else if (local1391 == 0 && local1914 == 0) {
												local988[local968] = arg3[local27][local62];
												local991[local968] = local1624.anInt7698;
												local994[local968] = local1624.anInt7705;
											} else if (local1391 == 0 && local1914 == 128) {
												local988[local968] = arg3[local27][local80];
												local991[local968] = local1632.anInt7698;
												local994[local968] = local1632.anInt7705;
											} else if (local1391 == 128 && local1914 == 128) {
												local988[local968] = arg3[local60][local80];
												local991[local968] = local1640.anInt7698;
												local994[local968] = local1640.anInt7705;
											} else if (local1391 == 128 && local1914 == 0) {
												local988[local968] = arg3[local60][local62];
												local991[local968] = local1648.anInt7698;
												local994[local968] = local1648.anInt7705;
											} else {
												if (local1391 >= 64) {
													if (local1914 < 64) {
														local991[local968] = local1648.anInt7698;
														local994[local968] = local1648.anInt7705;
													} else {
														local991[local968] = local1640.anInt7698;
														local994[local968] = local1640.anInt7705;
													}
												} else if (local1914 >= 64) {
													local991[local968] = local1632.anInt7698;
													local994[local968] = local1632.anInt7705;
												} else {
													local991[local968] = local1624.anInt7698;
													local994[local968] = local1624.anInt7705;
												}
												local1971 = Static234.method3461(arg3[local27][local62], local1391 << 7 >> 7, arg3[local60][local62]);
												local1977 = Static234.method3461(arg3[local27][local80], local1391 << 7 >> 7, arg3[local60][local80]);
												local988[local968] = Static234.method3461(local1971, local1914 << 7 >> 7, local1977);
											}
											if (local979 != null) {
												local979[local968] = local988[local968];
											}
										}
										local968++;
									}
									local966++;
								}
								if (local105 != 0 && local185.aBoolean490) {
									local94 = true;
								}
							}
							local1066 = arg5.I(local27, local62);
							local1068 = arg5.I(local60, local62);
							local1299 = arg5.I(local60, local80);
							local1305 = arg5.I(local27, local80);
							if (arg1 > 0) {
								@Pc(2389) boolean local2389 = true;
								if (local127 == 0 && local105 != 0) {
									local2389 = false;
								}
								if (local119 > 0 && local196 != null && !local196.aBoolean320) {
									local2389 = false;
								}
								if (local2389 && local1066 == local1068 && local1299 == local1066 && local1066 == local1305) {
									this.aByteArrayArrayArray11[arg1][local27][local62] = (byte) (this.aByteArrayArrayArray11[arg1][local27][local62] | 0x4);
								}
							}
							local1314 = 0;
							local1319 = 0;
							local1344 = 0;
							if (this.aBoolean304) {
								local1314 = Static106.method1649(local27, local62);
								local1319 = Static352.method4874(local27, local62);
								local1344 = Static75.method1285(local27, local62);
							}
							arg5.JA(local27, local62, local982, local1001, local985, local1010, local988, local979, local991, local994, local1314, local1319, local1344, local94);
							Static294.method4793(arg1, local27, local62);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
	public final void method3653(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4453; local3++) {
			this.method3651(arg1, 64, local3, 64, arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!na;Lclient!qa;[[ILclient!na;IZLclient!na;)V")
	private void method3654(@OriginalArg(0) Class136 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class136 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class136 arg5) {
		for (@Pc(16) int local16 = 0; local16 < this.anInt4452; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt4446; local20++) {
				if (Static434.anInt7473 == -1 || Static266.method3895(local16, local20, Static434.anInt7473, arg4)) {
					@Pc(43) byte local43 = this.aByteArrayArrayArray15[arg4][local16][local20];
					@Pc(52) byte local52 = this.aByteArrayArrayArray14[arg4][local16][local20];
					@Pc(63) int local63 = this.aByteArrayArrayArray13[arg4][local16][local20] & 0xFF;
					@Pc(74) int local74 = this.aByteArrayArrayArray12[arg4][local16][local20] & 0xFF;
					@Pc(89) Class162 local89 = local63 == 0 ? null : this.aClass47_6.method1142(local63 - 1);
					@Pc(104) Class267 local104 = local74 == 0 ? null : this.aClass107_5.method2353(local74 - 1);
					@Pc(106) int local106 = 0;
					@Pc(108) int local108 = 0;
					if (local43 != 0) {
						local108 = local89 == null ? 0 : Static70.anIntArray96[local43];
						local106 = local104 == null ? 0 : Static106.anIntArray173[local43];
					} else if (local89 != null) {
						local108 = Static70.anIntArray96[local43];
					} else if (local104 != null) {
						local106 = Static70.anIntArray96[local43];
					}
					@Pc(146) int local146 = local106 + local108;
					@Pc(148) int local148 = 0;
					if (local146 != 0) {
						@Pc(153) int[] local153 = new int[local146];
						@Pc(156) int[] local156 = new int[local146];
						@Pc(159) int[] local159 = new int[local146];
						@Pc(162) int[] local162 = new int[local146];
						@Pc(164) boolean local164 = false;
						@Pc(189) int local189;
						@Pc(195) int local195;
						if (local89 == null || local89.anInt4635 == -1 && local89.anInt4627 == -1 && local89.anInt4636 == -1) {
							for (local189 = 0; local189 < local108; local189++) {
								local153[local148] = -1;
								local148++;
							}
						} else {
							local189 = arg1.method4703() ? local89.anInt4636 : local89.anInt4630;
							if (Static215.aBoolean271) {
								local189 = -1;
							}
							for (local195 = 0; local195 < local108; local195++) {
								local159[local148] = local189;
								local162[local148] = local89.anInt4628;
								if (local89.anInt4635 == -1) {
									local153[local148] = -1;
								} else {
									local153[local148] = local89.anInt4635;
								}
								if (local89.anInt4627 == -1) {
									local156[local148] = -1;
								} else {
									local156[local148] = local89.anInt4627;
									local164 = true;
								}
								local148++;
							}
							if (!this.aBoolean304 && arg4 == 0) {
								Static50.method824(local16, local20, local89.anInt4639, local89.anInt4633 * 8, local89.anInt4634);
							}
						}
						if (!local164) {
							local156 = null;
						}
						if (local104 == null) {
							for (local189 = 0; local189 < local106; local189++) {
								local153[local148] = -1;
								local148++;
							}
						} else {
							local189 = local104.anInt7698;
							if (Static215.aBoolean271) {
								local189 = -1;
							}
							for (local195 = 0; local195 < local106; local195++) {
								local159[local148] = local189;
								local162[local148] = local104.anInt7705;
								local153[local148] = arg2[local16][local20];
								if (local156 != null) {
									local156[local148] = -1;
								}
								local148++;
							}
						}
						local189 = this.anIntArray357.length;
						@Pc(356) int[] local356 = new int[local189];
						@Pc(359) int[] local359 = new int[local189];
						@Pc(366) int[] local366 = arg3 == null ? null : new int[local189];
						@Pc(375) int[] local375 = arg3 == null && arg0 == null ? null : new int[local189];
						@Pc(384) int local384;
						@Pc(389) int local389;
						@Pc(473) int local473;
						@Pc(480) int local480;
						for (@Pc(377) int local377 = 0; local377 < local189; local377++) {
							local384 = this.anIntArray357[local377];
							local389 = this.anIntArray358[local377];
							if (local52 == 0) {
								local356[local377] = local384;
								local359[local377] = local389;
							} else if (local52 == 1) {
								local356[local377] = local389;
								local359[local377] = 128 - local384;
							} else if (local52 == 2) {
								local356[local377] = 128 - local384;
								local359[local377] = 128 - local389;
							} else if (local52 == 3) {
								local356[local377] = 128 - local389;
								local359[local377] = local384;
							}
							if (local366 != null && Static307.aBooleanArrayArray4[local43][local377]) {
								local473 = (local16 << 7) + local384;
								local480 = (local20 << 7) + local384;
								local366[local377] = arg3.va(local473, local480) - arg5.va(local473, local480);
							}
							if (local375 != null) {
								if (arg3 != null && !Static307.aBooleanArrayArray4[local43][local377]) {
									local473 = (local16 << 7) + local384;
									local480 = (local20 << 7) + local384;
									local375[local377] = arg5.va(local473, local480) - arg3.va(local473, local480);
								} else if (arg0 != null && !Static211.aBooleanArrayArray2[local43][local377]) {
									local473 = local384 + (local16 << 7);
									local480 = (local20 << 7) + local384;
									local375[local377] = arg0.va(local473, local480) - arg5.va(local473, local480);
								}
							}
						}
						local384 = arg5.I(local16, local20);
						local389 = arg5.I(local16 + 1, local20);
						local473 = arg5.I(local16 + 1, local20 + 1);
						local480 = arg5.I(local16, local20 + 1);
						if (arg4 > 0) {
							@Pc(600) boolean local600 = true;
							if (local74 == 0 && local43 != 0) {
								local600 = false;
							}
							if (local63 > 0 && local89 != null && !local89.aBoolean320) {
								local600 = false;
							}
							if (local600 && local384 == local389 && local473 == local384 && local480 == local384) {
								this.aByteArrayArrayArray11[arg4][local16][local20] = (byte) (this.aByteArrayArrayArray11[arg4][local16][local20] | 0x4);
							}
						}
						@Pc(657) int local657 = 0;
						@Pc(659) int local659 = 0;
						@Pc(661) int local661 = 0;
						if (this.aBoolean304) {
							local657 = Static106.method1649(local16, local20);
							local659 = Static352.method4874(local16, local20);
							local661 = Static75.method1285(local16, local20);
						}
						arg5.method5974(local16, local20, local356, local366, local359, local375, Static375.anIntArrayArray180[local43], Static273.anIntArrayArray134[local43], Static226.anIntArrayArray115[local43], local153, local156, local159, local162, local657, local659, local661);
						Static294.method4793(arg4, local16, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([[[I[Lclient!id;Lclient!qa;I)V")
	public final void method3655(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class112[] arg1, @OriginalArg(2) Class109 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean304) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt4452; local10++) {
					for (local14 = 0; local14 < this.anInt4446; local14++) {
						if ((Static184.aByteArrayArrayArray3[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static184.aByteArrayArrayArray3[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method2689(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt4453; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean304) {
				if (Static220.aBoolean274) {
					local14 = 8;
				}
				if (Static304.aBoolean347) {
					local10 = 2;
				}
				if (Static348.anInt5978 != 0) {
					if (Static131.aBoolean469 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static304.aBoolean347) {
				local14 |= 0x7;
			}
			if (!Static37.aBoolean22) {
				local14 |= 0x20;
			}
			@Pc(147) int[][] local147 = arg0 == null || local6 >= arg0.length ? this.anIntArrayArrayArray12[local6] : arg0[local6];
			Static190.method2903(local6, arg2.method4750(this.anInt4452, this.anInt4446, this.anIntArrayArrayArray12[local6], local147, local10, local14));
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIILclient!lh;IIII[Lclient!id;)V")
	public final void method3656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class112[] arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg0 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean304) {
			@Pc(24) Class112 local24 = arg8[arg2];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg3 + Static419.method5631(arg5, local26 & 0x7, local30 & 0x7);
					local56 = Static271.method3947(local26 & 0x7, local30 & 0x7, arg5) + arg7;
					if (local44 > 0 && this.anInt4452 - 1 > local44 && local56 > 0 && this.anInt4446 - 1 > local56) {
						local24.method2694(local56, local44);
					}
				}
			}
		}
		@Pc(121) int local121 = (arg1 & 0xFFFFFFF8) << 3;
		local26 = (arg0 & 0xFFFFFFF8) << 3;
		@Pc(129) byte local129 = 0;
		@Pc(131) byte local131 = 0;
		if (arg5 == 1) {
			local131 = 1;
		} else if (arg5 == 2) {
			local131 = 1;
			local129 = 1;
		} else if (arg5 == 3) {
			local129 = 1;
		}
		for (local56 = 0; local56 < this.anInt4453; local56++) {
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
					if (arg6 == local56 && local11 <= local160 && local160 <= local11 + 8 && local17 <= local164 && local164 <= local17 + 8) {
						@Pc(248) int local248;
						@Pc(239) int local239;
						if (local160 == local11 + 8 || local17 + 8 == local164) {
							if (arg5 == 0) {
								local248 = arg3 + local160 - local11;
								local239 = arg7 + local164 - local17;
							} else if (arg5 == 1) {
								local239 = arg7 + local11 + 8 - local160;
								local248 = arg3 + local164 - local17;
							} else if (arg5 == 2) {
								local239 = local17 + arg7 + 8 - local164;
								local248 = arg3 + local11 + 8 - local160;
							} else {
								local239 = local160 + arg7 - local11;
								local248 = local17 + arg3 + 8 - local164;
							}
							this.method3648(0, local239, true, arg4, arg2, local26 + local164, local248, 0, 0, local160 + local121);
						} else {
							local248 = arg3 + Static419.method5631(arg5, local160 & 0x7, local164 & 0x7);
							local239 = Static271.method3947(local160 & 0x7, local164 & 0x7, arg5) + arg7;
							this.method3648(arg5, local239, false, arg4, arg2, local26 + local164, local248, local131, local129, local121 + local160);
							if (local160 == 63 || local164 == 63) {
								@Pc(381) int local381 = local160 == 63 ? 64 : local160;
								@Pc(390) int local390 = local164 == 63 ? 64 : local164;
								@Pc(402) int local402;
								@Pc(408) int local408;
								if (arg5 == 0) {
									local402 = arg3 + local381 - local11;
									local408 = local390 + arg7 - local17;
								} else if (arg5 == 1) {
									local402 = local390 + arg3 - local17;
									local408 = local11 + arg7 + 8 - local381;
								} else if (arg5 == 2) {
									local402 = local11 + arg3 + 8 - local381;
									local408 = local17 + arg7 + 8 - local390;
								} else {
									local402 = arg3 + local17 + 8 - local390;
									local408 = local381 + arg7 - local11;
								}
								if (local402 >= 0 && local402 < this.anInt4452 && local408 >= 0 && this.anInt4446 > local408) {
									this.anIntArrayArrayArray12[arg2][local402][local408] = this.anIntArrayArrayArray12[arg2][local129 + local248][local239 + local131];
								}
							}
						}
					} else {
						this.method3648(0, -1, false, arg4, 0, 0, -1, 0, 0, 0);
					}
				}
			}
		}
	}
}
