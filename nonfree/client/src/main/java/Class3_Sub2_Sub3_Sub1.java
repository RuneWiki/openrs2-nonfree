import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public abstract class Class3_Sub2_Sub3_Sub1 extends Class3_Sub2_Sub3 {

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "[[B")
	protected byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!rb", name = "vb", descriptor = "I")
	public int anInt1152 = 0;

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
	private int anInt1145;

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "I")
	private int anInt1151;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class3_Sub2_Sub3_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray101 = arg1;
		this.anIntArray98 = arg2;
		this.anIntArray99 = arg3;
		this.anIntArray100 = arg4;
		this.method825(arg0);
		this.aByteArrayArray6 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray98[local32] < local28 && this.anIntArray100[local32] != 0) {
				local28 = this.anIntArray98[local32];
			}
			if (this.anIntArray98[local32] + this.anIntArray100[local32] > local30) {
				local30 = this.anIntArray98[local32] + this.anIntArray100[local32];
			}
		}
		this.anInt1145 = this.anInt1152 - local28;
		this.anInt1151 = local30 - this.anInt1152;
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub2_Sub3_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method825(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;IIIILjava/util/Random;I)I")
	public final int method802(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method822(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2034];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2034; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method827(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)I")
	private int method804(@OriginalArg(0) int arg0) {
		return this.anIntArray97[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;IIII)V")
	public final void method805(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method828(arg3, arg4);
			this.method826(arg0, arg1 - this.method813(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;IIIII)V")
	public final void method806(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method828(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2034];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2034; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method827(arg0, arg1 - this.method813(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;IIIIII)V")
	public final void method807(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method828(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2034];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2034; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method827(arg0, arg1 - this.method813(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIIIII)V")
	private void method808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static103.anInt3089;
		@Pc(9) int local9 = Static103.anInt3089 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static103.anInt3090) {
			local20 = Static103.anInt3090 - arg2;
			arg4 -= local20;
			arg2 = Static103.anInt3090;
			local13 = local20 * arg3;
			local5 += local20 * Static103.anInt3089;
		}
		if (arg2 + arg4 > Static103.anInt3087) {
			arg4 -= arg2 + arg4 - Static103.anInt3087;
		}
		if (arg1 < Static103.anInt3091) {
			local20 = Static103.anInt3091 - arg1;
			arg3 -= local20;
			arg1 = Static103.anInt3091;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static103.anInt3092) {
			local20 = arg1 + arg3 - Static103.anInt3092;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static138.method801(Static103.anIntArray344, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!kb;IIIII)V")
	public final void method810(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method828(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2034];
		@Pc(14) int[] local14 = new int[arg0.anInt2034];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2034; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method827(arg0, arg1 - this.method813(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;I)I")
	public final int method811(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method817(arg0, new int[] { arg1 }, Static138.aClass46Array7);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method813(Static138.aClass46Array7[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!kb;IIII)V")
	public final void method812(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method828(arg3, arg4);
			this.method826(arg0, arg1 - this.method813(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;)I")
	public final int method813(@OriginalArg(0) Class46 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2034; local11++) {
			@Pc(19) int local19 = arg0.aByteArray17[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class46 local39 = arg0.method1363(local11, local5 + 1);
					local5 = -1;
					if (local39.method1351(Static138.aClass46_361)) {
						local19 = 60;
					} else if (local39.method1351(Static138.aClass46_359)) {
						local19 = 62;
					} else if (local39.method1351(Static138.aClass46_355)) {
						local19 = 160;
					} else if (local39.method1351(Static138.aClass46_352)) {
						local19 = 173;
					} else if (local39.method1351(Static138.aClass46_362)) {
						local19 = 215;
					} else if (local39.method1351(Static138.aClass46_351)) {
						local19 = 128;
					} else if (local39.method1351(Static138.aClass46_356)) {
						local19 = 169;
					} else {
						if (!local39.method1351(Static138.aClass46_349)) {
							if (local39.method1367(Static138.aClass46_345)) {
								try {
									@Pc(117) int local117 = local39.method1380(4).method1386();
									local9 += Static138.aClass3_Sub2_Sub3_Sub2Array3[local117].anInt2496;
									local7 = -1;
								} catch (@Pc(128) Exception local128) {
								}
							}
							continue;
						}
						local19 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray97[local19];
					if (this.aByteArray10 != null && local7 != -1) {
						local9 += this.aByteArray10[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;IIIIIIIIII)I")
	private int method816(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method822(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1152;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1145 + this.anInt1151 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method817(arg0, local20, Static138.aClass46Array7);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1145;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1145 + (arg4 - this.anInt1145 - this.anInt1151 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1151 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1145 - this.anInt1151 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1145 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method826(Static138.aClass46Array7[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method826(Static138.aClass46Array7[local118], arg1 + (arg3 - this.method813(Static138.aClass46Array7[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method826(Static138.aClass46Array7[local118], arg1 + arg3 - this.method813(Static138.aClass46Array7[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method826(Static138.aClass46Array7[local118], arg1, local57);
			} else {
				this.method818(Static138.aClass46Array7[local118], arg3);
				this.method826(Static138.aClass46Array7[local118], arg1, local57);
				Static138.anInt1146 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;[I[Lclient!kb;)I")
	private int method817(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class46[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class46 local11 = Static94.method1564(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1376();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1357(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class46 local55 = arg0.method1363(local29, local19 + 1);
					local19 = -1;
					local11.method1361(60);
					local11.method1382(local55);
					local11.method1361(62);
					if (local55.method1351(Static138.aClass46_353)) {
						arg2[local23++] = local11.method1363(local11.method1376(), local7);
						local7 = local11.method1376();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1351(Static138.aClass46_361)) {
						local5 += this.method804(60);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1351(Static138.aClass46_359)) {
						local5 += this.method804(62);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1351(Static138.aClass46_355)) {
						local5 += this.method804(160);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1351(Static138.aClass46_352)) {
						local5 += this.method804(173);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1351(Static138.aClass46_362)) {
						local5 += this.method804(215);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1351(Static138.aClass46_351)) {
						local5 += this.method804(128);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1351(Static138.aClass46_356)) {
						local5 += this.method804(169);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1351(Static138.aClass46_349)) {
						local5 += this.method804(174);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1367(Static138.aClass46_345)) {
						try {
							@Pc(359) int local359 = local55.method1380(4).method1386();
							local5 += Static138.aClass3_Sub2_Sub3_Sub2Array3[local359].anInt2496;
							local21 = -1;
						} catch (@Pc(370) Exception local370) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1361(local35);
						local5 += this.method804(local35);
						if (this.aByteArray10 != null && local21 != -1) {
							local5 += this.aByteArray10[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1376();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1363(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1376();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1376() > local7) {
			arg2[local23++] = local11.method1363(local11.method1376(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!kb;I)V")
	private void method818(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1376(); local5++) {
			@Pc(11) int local11 = arg0.method1357(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static138.anInt1146 = (arg1 - this.method813(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;IIIIIIIII)I")
	public final int method819(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method816(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(IIIIII)V")
	private void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static103.anInt3089;
		@Pc(9) int local9 = Static103.anInt3089 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static103.anInt3090) {
			local20 = Static103.anInt3090 - arg2;
			arg4 -= local20;
			arg2 = Static103.anInt3090;
			local13 = local20 * arg3;
			local5 += local20 * Static103.anInt3089;
		}
		if (arg2 + arg4 > Static103.anInt3087) {
			arg4 -= arg2 + arg4 - Static103.anInt3087;
		}
		if (arg1 < Static103.anInt3091) {
			local20 = Static103.anInt3091 - arg1;
			arg3 -= local20;
			arg1 = Static103.anInt3091;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static103.anInt3092) {
			local20 = arg1 + arg3 - Static103.anInt3092;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static138.method809(Static103.anIntArray344, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lclient!kb;IIII)V")
	public final void method821(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method828(arg3, arg4);
			this.method826(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	private void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static138.anInt1144 = -1;
		Static138.anInt1149 = -1;
		Static138.anInt1142 = arg1;
		Static138.anInt1141 = arg1;
		Static138.anInt1143 = arg0;
		Static138.anInt1140 = arg0;
		Static138.anInt1147 = arg2;
		Static138.anInt1150 = arg2;
		Static138.anInt1146 = 0;
		Static138.anInt1148 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lclient!kb;)V")
	private void method824(@OriginalArg(0) Class46 arg0) {
		try {
			if (arg0.method1367(Static138.aClass46_357)) {
				Static138.anInt1140 = arg0.method1380(4).method1384(16);
				return;
			}
			if (arg0.method1351(Static138.aClass46_343)) {
				Static138.anInt1140 = Static138.anInt1143;
				return;
			}
			if (arg0.method1367(Static138.aClass46_344)) {
				Static138.anInt1144 = arg0.method1380(4).method1384(16);
				return;
			}
			if (arg0.method1351(Static138.aClass46_350)) {
				Static138.anInt1144 = 8388608;
				return;
			}
			if (arg0.method1351(Static138.aClass46_360)) {
				Static138.anInt1144 = -1;
				return;
			}
			if (arg0.method1367(Static138.aClass46_346)) {
				Static138.anInt1149 = arg0.method1380(2).method1384(16);
				return;
			}
			if (arg0.method1351(Static138.aClass46_358)) {
				Static138.anInt1149 = 0;
				return;
			}
			if (arg0.method1351(Static138.aClass46_363)) {
				Static138.anInt1149 = -1;
				return;
			}
			if (arg0.method1367(Static138.aClass46_348)) {
				Static138.anInt1141 = arg0.method1380(5).method1384(16);
				return;
			}
			if (arg0.method1351(Static138.aClass46_347)) {
				Static138.anInt1141 = 0;
				return;
			}
			if (arg0.method1351(Static138.aClass46_354)) {
				Static138.anInt1141 = Static138.anInt1142;
				return;
			}
			if (arg0.method1351(Static138.aClass46_353)) {
				this.method822(Static138.anInt1143, Static138.anInt1142, Static138.anInt1147);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V")
	private void method825(@OriginalArg(0) byte[] arg0) {
		this.anIntArray97 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray97.length; local9++) {
				this.anIntArray97[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1152 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray97[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(107) int local107;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(105) byte local105 = 0;
			for (local107 = 0; local107 < local93[local95].length; local107++) {
				local105 += arg0[local9++];
				local93[local95][local107] = local105;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(150) int local150;
		for (local107 = 0; local107 < 256; local107++) {
			local136[local107] = new byte[local55[local107]];
			@Pc(148) byte local148 = 0;
			for (local150 = 0; local150 < local136[local107].length; local150++) {
				local148 += arg0[local9++];
				local136[local107][local150] = local148;
			}
		}
		this.aByteArray10 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray10[(local182 << 8) + local150] = (byte) Static138.method830(local93, local136, local58, this.anIntArray97, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1152 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;II)V")
	private void method826(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1152;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2034; local10++) {
			@Pc(18) int local18 = arg0.aByteArray17[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class46 local38 = arg0.method1363(local10, local6 + 1);
					local6 = -1;
					if (local38.method1351(Static138.aClass46_361)) {
						local18 = 60;
					} else if (local38.method1351(Static138.aClass46_359)) {
						local18 = 62;
					} else if (local38.method1351(Static138.aClass46_355)) {
						local18 = 160;
					} else if (local38.method1351(Static138.aClass46_352)) {
						local18 = 173;
					} else if (local38.method1351(Static138.aClass46_362)) {
						local18 = 215;
					} else if (local38.method1351(Static138.aClass46_351)) {
						local18 = 128;
					} else if (local38.method1351(Static138.aClass46_356)) {
						local18 = 169;
					} else {
						if (!local38.method1351(Static138.aClass46_349)) {
							if (local38.method1367(Static138.aClass46_345)) {
								try {
									local116 = local38.method1380(4).method1386();
									@Pc(120) Class3_Sub2_Sub3_Sub2 local120 = Static138.aClass3_Sub2_Sub3_Sub2Array3[local116];
									if (Static138.anInt1150 == 256) {
										local120.method1713(arg1, local4 + this.anInt1152 - local120.anInt2492);
									} else {
										local120.method1710(arg1, local4 + this.anInt1152 - local120.anInt2492, Static138.anInt1150);
									}
									arg1 += local120.anInt2496;
									local8 = -1;
								} catch (@Pc(154) Exception local154) {
								}
							} else {
								this.method824(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray10 != null && local8 != -1) {
						arg1 += this.aByteArray10[(local8 << 8) + local18];
					}
					@Pc(184) int local184 = this.anIntArray99[local18];
					local116 = this.anIntArray100[local18];
					if (local18 == 32) {
						if (Static138.anInt1146 > 0) {
							Static138.anInt1148 += Static138.anInt1146;
							arg1 += Static138.anInt1148 >> 8;
							Static138.anInt1148 &= 0xFF;
						}
					} else if (Static138.anInt1150 == 256) {
						if (Static138.anInt1141 != -1) {
							this.method820(local18, arg1 + this.anIntArray101[local18] + 1, local4 + this.anIntArray98[local18] + 1, local184, local116, Static138.anInt1141);
						}
						this.method823(local18, arg1 + this.anIntArray101[local18], local4 + this.anIntArray98[local18], local184, local116, Static138.anInt1140);
					} else {
						if (Static138.anInt1141 != -1) {
							this.method808(local18, arg1 + this.anIntArray101[local18] + 1, local4 + this.anIntArray98[local18] + 1, local184, local116, Static138.anInt1141, Static138.anInt1150);
						}
						this.method803(local18, arg1 + this.anIntArray101[local18], local4 + this.anIntArray98[local18], local184, local116, Static138.anInt1140, Static138.anInt1150);
					}
					@Pc(306) int local306 = this.anIntArray97[local18];
					if (Static138.anInt1144 != -1) {
						Static103.method2223(arg1, local4 + (int) ((double) this.anInt1152 * 0.7D), local306, Static138.anInt1144);
					}
					if (Static138.anInt1149 != -1) {
						Static103.method2223(arg1, local4 + this.anInt1152 + 1, local306, Static138.anInt1149);
					}
					arg1 += local306;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;II[I[I)V")
	private void method827(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1152;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2034; local12++) {
			@Pc(20) int local20 = arg0.aByteArray17[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class46 local40 = arg0.method1363(local12, local6 + 1);
					local6 = -1;
					if (local40.method1351(Static138.aClass46_361)) {
						local20 = 60;
					} else if (local40.method1351(Static138.aClass46_359)) {
						local20 = 62;
					} else if (local40.method1351(Static138.aClass46_355)) {
						local20 = 160;
					} else if (local40.method1351(Static138.aClass46_352)) {
						local20 = 173;
					} else if (local40.method1351(Static138.aClass46_362)) {
						local20 = 215;
					} else if (local40.method1351(Static138.aClass46_351)) {
						local20 = 128;
					} else if (local40.method1351(Static138.aClass46_356)) {
						local20 = 169;
					} else {
						if (!local40.method1351(Static138.aClass46_349)) {
							if (local40.method1367(Static138.aClass46_345)) {
								try {
									if (arg3 == null) {
										local117 = 0;
									} else {
										local117 = arg3[local10];
									}
									if (arg4 == null) {
										local126 = 0;
									} else {
										local126 = arg4[local10];
									}
									local10++;
									local137 = local40.method1380(4).method1386();
									@Pc(141) Class3_Sub2_Sub3_Sub2 local141 = Static138.aClass3_Sub2_Sub3_Sub2Array3[local137];
									if (Static138.anInt1150 == 256) {
										local141.method1713(arg1 + local117, local4 + this.anInt1152 - local141.anInt2492 + local126);
									} else {
										local141.method1710(arg1 + local117, local4 + this.anInt1152 - local141.anInt2492 + local126, Static138.anInt1150);
									}
									arg1 += local141.anInt2496;
									local8 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method824(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray10 != null && local8 != -1) {
						arg1 += this.aByteArray10[(local8 << 8) + local20];
					}
					@Pc(213) int local213 = this.anIntArray99[local20];
					local117 = this.anIntArray100[local20];
					if (arg3 == null) {
						local126 = 0;
					} else {
						local126 = arg3[local10];
					}
					if (arg4 == null) {
						local137 = 0;
					} else {
						local137 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static138.anInt1146 > 0) {
							Static138.anInt1148 += Static138.anInt1146;
							arg1 += Static138.anInt1148 >> 8;
							Static138.anInt1148 &= 0xFF;
						}
					} else if (Static138.anInt1150 == 256) {
						if (Static138.anInt1141 != -1) {
							this.method820(local20, arg1 + this.anIntArray101[local20] + local126 + 1, local4 + this.anIntArray98[local20] + 1 + local137, local213, local117, Static138.anInt1141);
						}
						this.method823(local20, arg1 + this.anIntArray101[local20] + local126, local4 + this.anIntArray98[local20] + local137, local213, local117, Static138.anInt1140);
					} else {
						if (Static138.anInt1141 != -1) {
							this.method808(local20, arg1 + this.anIntArray101[local20] + local126 + 1, local4 + this.anIntArray98[local20] + 1 + local137, local213, local117, Static138.anInt1141, Static138.anInt1150);
						}
						this.method803(local20, arg1 + this.anIntArray101[local20] + local126, local4 + this.anIntArray98[local20] + local137, local213, local117, Static138.anInt1140, Static138.anInt1150);
					}
					@Pc(370) int local370 = this.anIntArray97[local20];
					if (Static138.anInt1144 != -1) {
						Static103.method2223(arg1, local4 + (int) ((double) this.anInt1152 * 0.7D), local370, Static138.anInt1144);
					}
					if (Static138.anInt1149 != -1) {
						Static103.method2223(arg1, local4 + this.anInt1152, local370, Static138.anInt1149);
					}
					arg1 += local370;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	private void method828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static138.anInt1144 = -1;
		Static138.anInt1149 = -1;
		Static138.anInt1142 = arg1;
		Static138.anInt1141 = arg1;
		Static138.anInt1143 = arg0;
		Static138.anInt1140 = arg0;
		Static138.anInt1147 = 256;
		Static138.anInt1150 = 256;
		Static138.anInt1146 = 0;
		Static138.anInt1148 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lclient!kb;I)I")
	public final int method829(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.method817(arg0, new int[] { arg1 }, Static138.aClass46Array7);
	}
}
