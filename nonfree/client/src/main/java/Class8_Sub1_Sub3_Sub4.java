import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public abstract class Class8_Sub1_Sub3_Sub4 extends Class8_Sub1_Sub3 {

	@OriginalMember(owner = "client!wc", name = "mb", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!wc", name = "xb", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!wc", name = "qb", descriptor = "I")
	public int anInt2723 = 0;

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "[[B")
	protected byte[][] aByteArrayArray62 = new byte[256][];

	@OriginalMember(owner = "client!wc", name = "ab", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!wc", name = "tb", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!wc", name = "yb", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!wc", name = "cb", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
	private int anInt2719;

	@OriginalMember(owner = "client!wc", name = "Bb", descriptor = "I")
	private int anInt2729;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class8_Sub1_Sub3_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray377 = arg1;
		this.anIntArray380 = arg2;
		this.anIntArray381 = arg3;
		this.anIntArray378 = arg4;
		this.method1748(arg0);
		this.aByteArrayArray62 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray380[local32] < local28 && this.anIntArray378[local32] != 0) {
				local28 = this.anIntArray380[local32];
			}
			if (this.anIntArray380[local32] + this.anIntArray378[local32] > local30) {
				local30 = this.anIntArray380[local32] + this.anIntArray378[local32];
			}
		}
		this.anInt2719 = this.anInt2723 - local28;
		this.anInt2729 = local30 - this.anInt2723;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
	public Class8_Sub1_Sub3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.method1748(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;IIIIIIIIII)I")
	private int method1740(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1756(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2723;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2719 + this.anInt2729 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1752(arg0, local20, Static131.aClass34Array20);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2719;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2719 + (arg4 - this.anInt2719 - this.anInt2729 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2729 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2719 - this.anInt2729 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2719 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1744(Static131.aClass34Array20[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1744(Static131.aClass34Array20[local118], arg1 + (arg3 - this.method1766(Static131.aClass34Array20[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1744(Static131.aClass34Array20[local118], arg1 + arg3 - this.method1766(Static131.aClass34Array20[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1744(Static131.aClass34Array20[local118], arg1, local57);
			} else {
				this.method1767(Static131.aClass34Array20[local118], arg3);
				this.method1744(Static131.aClass34Array20[local118], arg1, local57);
				Static131.anInt2731 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;IIII)V")
	public final void method1741(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1749(arg3, arg4);
			this.method1744(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!ic;IIII)V")
	public final void method1742(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1749(arg3, arg4);
			this.method1744(arg0, arg1 - this.method1766(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;IIIILjava/util/Random;I)I")
	public final int method1743(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1756(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1418];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1418; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1754(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;II)V")
	private void method1744(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2723;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1418; local10++) {
			@Pc(18) int local18 = arg0.aByteArray20[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class34 local38 = arg0.method810(local10, local6 + 1);
					local6 = -1;
					if (local38.method804(Static131.aClass34_1299)) {
						local18 = 60;
					} else {
						if (!local38.method804(Static131.aClass34_1289)) {
							if (local38.method826(Static131.aClass34_1286)) {
								try {
									local68 = local38.method835(4).method823();
									@Pc(72) Class8_Sub1_Sub3_Sub2 local72 = Static131.aClass8_Sub1_Sub3_Sub2Array10[local68];
									local72.method300(arg1, local4 + this.anInt2723 - local72.anInt487);
									arg1 += local72.anInt483;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method1747(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray42 != null && local8 != -1) {
						arg1 += this.aByteArray42[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray381[local18];
					local68 = this.anIntArray378[local18];
					if (local18 == 32) {
						if (Static131.anInt2731 > 0) {
							Static131.anInt2722 += Static131.anInt2731;
							arg1 += Static131.anInt2722 >> 8;
							Static131.anInt2722 &= 0xFF;
						}
					} else if (Static131.anInt2720 == 256) {
						if (Static131.anInt2727 != -1) {
							this.method1751(local18, arg1 + this.anIntArray377[local18] + 1, local4 + this.anIntArray380[local18] + 1, local121, local68, Static131.anInt2727);
						}
						this.method1765(local18, arg1 + this.anIntArray377[local18], local4 + this.anIntArray380[local18], local121, local68, Static131.anInt2724);
					} else {
						if (Static131.anInt2727 != -1) {
							this.method1746(local18, arg1 + this.anIntArray377[local18] + 1, local4 + this.anIntArray380[local18] + 1, local121, local68, Static131.anInt2727, Static131.anInt2720);
						}
						this.method1762(local18, arg1 + this.anIntArray377[local18], local4 + this.anIntArray380[local18], local121, local68, Static131.anInt2724, Static131.anInt2720);
					}
					@Pc(243) int local243 = this.anIntArray379[local18];
					if (Static131.anInt2725 != -1) {
						Static110.method1737(arg1, local4 + (int) ((double) this.anInt2723 * 0.7D), local243, Static131.anInt2725);
					}
					if (Static131.anInt2728 != -1) {
						Static110.method1737(arg1, local4 + this.anInt2723 + 1, local243, Static131.anInt2728);
					}
					arg1 += local243;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;IIIII)V")
	public final void method1745(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1749(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1418];
		@Pc(14) int[] local14 = new int[arg0.anInt1418];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1418; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1754(arg0, arg1 - this.method1766(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V")
	private void method1746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static110.anInt2717;
		@Pc(9) int local9 = Static110.anInt2717 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static110.anInt2718) {
			local20 = Static110.anInt2718 - arg2;
			arg4 -= local20;
			arg2 = Static110.anInt2718;
			local13 = local20 * arg3;
			local5 += local20 * Static110.anInt2717;
		}
		if (arg2 + arg4 > Static110.anInt2715) {
			arg4 -= arg2 + arg4 - Static110.anInt2715;
		}
		if (arg1 < Static110.anInt2713) {
			local20 = Static110.anInt2713 - arg1;
			arg3 -= local20;
			arg1 = Static110.anInt2713;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static110.anInt2716) {
			local20 = arg1 + arg3 - Static110.anInt2716;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static131.method1755(Static110.anIntArray376, this.aByteArrayArray62[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;)V")
	private void method1747(@OriginalArg(0) Class34 arg0) {
		try {
			if (arg0.method826(Static131.aClass34_1292)) {
				Static131.anInt2724 = arg0.method835(4).method811(16);
				return;
			}
			if (arg0.method804(Static131.aClass34_1298)) {
				Static131.anInt2724 = Static131.anInt2730;
				return;
			}
			if (arg0.method826(Static131.aClass34_1287)) {
				Static131.anInt2725 = arg0.method835(4).method811(16);
				return;
			}
			if (arg0.method804(Static131.aClass34_1288)) {
				Static131.anInt2725 = 8388608;
				return;
			}
			if (arg0.method804(Static131.aClass34_1297)) {
				Static131.anInt2725 = -1;
				return;
			}
			if (arg0.method826(Static131.aClass34_1291)) {
				Static131.anInt2728 = arg0.method835(2).method811(16);
				return;
			}
			if (arg0.method804(Static131.aClass34_1293)) {
				Static131.anInt2728 = 0;
				return;
			}
			if (arg0.method804(Static131.aClass34_1296)) {
				Static131.anInt2728 = -1;
				return;
			}
			if (arg0.method826(Static131.aClass34_1300)) {
				Static131.anInt2727 = arg0.method835(5).method811(16);
				return;
			}
			if (arg0.method804(Static131.aClass34_1294)) {
				Static131.anInt2727 = 0;
				return;
			}
			if (arg0.method804(Static131.aClass34_1290)) {
				Static131.anInt2727 = Static131.anInt2721;
				return;
			}
			if (arg0.method804(Static131.aClass34_1295)) {
				this.method1756(Static131.anInt2730, Static131.anInt2721, Static131.anInt2726);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
	private void method1748(@OriginalArg(0) byte[] arg0) {
		this.anIntArray379 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray379.length; local9++) {
				this.anIntArray379[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2723 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray379[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray42 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray42[(local182 << 8) + local150] = (byte) Static131.method1768(local93, local136, local58, this.anIntArray379, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2723 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	private void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static131.anInt2725 = -1;
		Static131.anInt2728 = -1;
		Static131.anInt2721 = arg1;
		Static131.anInt2727 = arg1;
		Static131.anInt2730 = arg0;
		Static131.anInt2724 = arg0;
		Static131.anInt2726 = 256;
		Static131.anInt2720 = 256;
		Static131.anInt2731 = 0;
		Static131.anInt2722 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	private int method1750(@OriginalArg(0) int arg0) {
		return this.anIntArray379[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(IIIIII)V")
	private void method1751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static110.anInt2717;
		@Pc(9) int local9 = Static110.anInt2717 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static110.anInt2718) {
			local20 = Static110.anInt2718 - arg2;
			arg4 -= local20;
			arg2 = Static110.anInt2718;
			local13 = local20 * arg3;
			local5 += local20 * Static110.anInt2717;
		}
		if (arg2 + arg4 > Static110.anInt2715) {
			arg4 -= arg2 + arg4 - Static110.anInt2715;
		}
		if (arg1 < Static110.anInt2713) {
			local20 = Static110.anInt2713 - arg1;
			arg3 -= local20;
			arg1 = Static110.anInt2713;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static110.anInt2716) {
			local20 = arg1 + arg3 - Static110.anInt2716;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static131.method1739(Static110.anIntArray376, this.aByteArrayArray62[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;[I[Lclient!ic;)I")
	private int method1752(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class34[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class34 local11 = Static82.method1198(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method820();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method808(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class34 local55 = arg0.method810(local29, local19 + 1);
					local19 = -1;
					local11.method817(60);
					local11.method807(local55);
					local11.method817(62);
					if (local55.method804(Static131.aClass34_1295)) {
						arg2[local23++] = local11.method810(local11.method820(), local7);
						local7 = local11.method820();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method804(Static131.aClass34_1299)) {
						local5 += this.method1750(60);
						if (this.aByteArray42 != null && local21 != -1) {
							local5 += this.aByteArray42[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method804(Static131.aClass34_1289)) {
						local5 += this.method1750(62);
						if (this.aByteArray42 != null && local21 != -1) {
							local5 += this.aByteArray42[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method826(Static131.aClass34_1286)) {
						try {
							@Pc(173) int local173 = local55.method835(4).method823();
							local5 += Static131.aClass8_Sub1_Sub3_Sub2Array10[local173].anInt483;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method817(local35);
						local5 += this.method1750(local35);
						if (this.aByteArray42 != null && local21 != -1) {
							local5 += this.aByteArray42[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method820();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method810(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method820();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method820() > local7) {
			arg2[local23++] = local11.method810(local11.method820(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lclient!ic;IIII)V")
	public final void method1753(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1749(arg3, arg4);
			this.method1744(arg0, arg1 - this.method1766(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;II[I[I)V")
	private void method1754(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2723;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1418; local12++) {
			@Pc(20) int local20 = arg0.aByteArray20[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class34 local40 = arg0.method810(local12, local6 + 1);
					local6 = -1;
					if (local40.method804(Static131.aClass34_1299)) {
						local20 = 60;
					} else {
						if (!local40.method804(Static131.aClass34_1289)) {
							if (local40.method826(Static131.aClass34_1286)) {
								try {
									if (arg3 == null) {
										local69 = 0;
									} else {
										local69 = arg3[local10];
									}
									if (arg4 == null) {
										local78 = 0;
									} else {
										local78 = arg4[local10];
									}
									local10++;
									local89 = local40.method835(4).method823();
									@Pc(93) Class8_Sub1_Sub3_Sub2 local93 = Static131.aClass8_Sub1_Sub3_Sub2Array10[local89];
									local93.method300(arg1 + local69, local4 + this.anInt2723 - local93.anInt487 + local78);
									arg1 += local93.anInt483;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method1747(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray42 != null && local8 != -1) {
						arg1 += this.aByteArray42[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray381[local20];
					local69 = this.anIntArray378[local20];
					if (arg3 == null) {
						local78 = 0;
					} else {
						local78 = arg3[local10];
					}
					if (arg4 == null) {
						local89 = 0;
					} else {
						local89 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static131.anInt2731 > 0) {
							Static131.anInt2722 += Static131.anInt2731;
							arg1 += Static131.anInt2722 >> 8;
							Static131.anInt2722 &= 0xFF;
						}
					} else if (Static131.anInt2720 == 256) {
						if (Static131.anInt2727 != -1) {
							this.method1751(local20, arg1 + this.anIntArray377[local20] + local78 + 1, local4 + this.anIntArray380[local20] + 1 + local89, local146, local69, Static131.anInt2727);
						}
						this.method1765(local20, arg1 + this.anIntArray377[local20] + local78, local4 + this.anIntArray380[local20] + local89, local146, local69, Static131.anInt2724);
					} else {
						if (Static131.anInt2727 != -1) {
							this.method1746(local20, arg1 + this.anIntArray377[local20] + local78 + 1, local4 + this.anIntArray380[local20] + 1 + local89, local146, local69, Static131.anInt2727, Static131.anInt2720);
						}
						this.method1762(local20, arg1 + this.anIntArray377[local20] + local78, local4 + this.anIntArray380[local20] + local89, local146, local69, Static131.anInt2724, Static131.anInt2720);
					}
					@Pc(303) int local303 = this.anIntArray379[local20];
					if (Static131.anInt2725 != -1) {
						Static110.method1737(arg1, local4 + (int) ((double) this.anInt2723 * 0.7D), local303, Static131.anInt2725);
					}
					if (Static131.anInt2728 != -1) {
						Static110.method1737(arg1, local4 + this.anInt2723, local303, Static131.anInt2728);
					}
					arg1 += local303;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	private void method1756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static131.anInt2725 = -1;
		Static131.anInt2728 = -1;
		Static131.anInt2721 = arg1;
		Static131.anInt2727 = arg1;
		Static131.anInt2730 = arg0;
		Static131.anInt2724 = arg0;
		Static131.anInt2726 = arg2;
		Static131.anInt2720 = arg2;
		Static131.anInt2731 = 0;
		Static131.anInt2722 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;IIIIII)V")
	public final void method1758(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1749(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1418];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1418; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1754(arg0, arg1 - this.method1766(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;I)I")
	public final int method1759(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		return this.method1752(arg0, new int[] { arg1 }, Static131.aClass34Array20);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!ic;IIIII)V")
	public final void method1761(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1749(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1418];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1418; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1754(arg0, arg1 - this.method1766(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ic;IIIIIIIII)I")
	public final int method1763(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1740(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!ic;I)I")
	public final int method1764(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1752(arg0, new int[] { arg1 }, Static131.aClass34Array20);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1766(Static131.aClass34Array20[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method1765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lclient!ic;)I")
	public final int method1766(@OriginalArg(0) Class34 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1418; local11++) {
			@Pc(19) int local19 = arg0.aByteArray20[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class34 local39 = arg0.method810(local11, local5 + 1);
					local5 = -1;
					if (local39.method804(Static131.aClass34_1299)) {
						local19 = 60;
					} else {
						if (!local39.method804(Static131.aClass34_1289)) {
							if (local39.method826(Static131.aClass34_1286)) {
								try {
									@Pc(69) int local69 = local39.method835(4).method823();
									local9 += Static131.aClass8_Sub1_Sub3_Sub2Array10[local69].anInt483;
									local7 = -1;
								} catch (@Pc(80) Exception local80) {
								}
							}
							continue;
						}
						local19 = 62;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray379[local19];
					if (this.aByteArray42 != null && local7 != -1) {
						local9 += this.aByteArray42[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lclient!ic;I)V")
	private void method1767(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method820(); local5++) {
			@Pc(11) int local11 = arg0.method808(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static131.anInt2731 = (arg1 - this.method1766(arg0) << 8) / local1;
		}
	}
}
