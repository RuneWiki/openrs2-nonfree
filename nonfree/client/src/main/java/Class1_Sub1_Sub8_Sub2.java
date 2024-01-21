import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public abstract class Class1_Sub1_Sub8_Sub2 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ie", name = "zb", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "[[B")
	protected byte[][] aByteArrayArray14 = new byte[256][];

	@OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
	public int anInt2863 = 0;

	@OriginalMember(owner = "client!ie", name = "tb", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ie", name = "mb", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ie", name = "xb", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!ie", name = "pb", descriptor = "I")
	private int anInt2864;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub1_Sub8_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray258 = arg1;
		this.anIntArray257 = arg2;
		this.anIntArray255 = arg3;
		this.anIntArray259 = arg4;
		this.method2009(arg0);
		this.aByteArrayArray14 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray257[local32] < local28 && this.anIntArray259[local32] != 0) {
				local28 = this.anIntArray257[local32];
			}
			if (this.anIntArray257[local32] + this.anIntArray259[local32] > local30) {
				local30 = this.anIntArray257[local32] + this.anIntArray259[local32];
			}
		}
		this.anInt2861 = this.anInt2863 - local28;
		this.anInt2864 = local30 - this.anInt2863;
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub8_Sub2(@OriginalArg(0) byte[] arg0) {
		this.method2009(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;[I[Lclient!ea;)I")
	private int method2008(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class18[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class18 local11 = Static47.method2894(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method747();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method736(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class18 local55 = arg0.method744(local19 + 1, local29);
					local19 = -1;
					local11.method729(60);
					local11.method732(local55);
					local11.method729(62);
					if (local55.method723(Static67.aClass18_709)) {
						arg2[local23++] = local11.method744(local7, local11.method747());
						local7 = local11.method747();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method723(Static67.aClass18_716)) {
						local5 += this.method2024(60);
						if (this.aByteArray30 != null && local21 != -1) {
							local5 += this.aByteArray30[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method723(Static67.aClass18_710)) {
						local5 += this.method2024(62);
						if (this.aByteArray30 != null && local21 != -1) {
							local5 += this.aByteArray30[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method740(Static67.aClass18_712)) {
						try {
							@Pc(173) int local173 = local55.method733(4).method750();
							local5 += Static67.aClass1_Sub1_Sub8_Sub1Array5[local173].anInt1434;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method729(local35);
						local5 += this.method2024(local35);
						if (this.aByteArray30 != null && local21 != -1) {
							local5 += this.aByteArray30[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method747();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method744(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method747();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method747() > local7) {
			arg2[local23++] = local11.method744(local7, local11.method747());
		}
		return local23;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([B)V")
	private void method2009(@OriginalArg(0) byte[] arg0) {
		this.anIntArray256 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray256.length; local9++) {
				this.anIntArray256[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2863 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray256[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray30 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray30[(local182 << 8) + local150] = (byte) Static67.method2034(local93, local136, local58, this.anIntArray256, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2863 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;IIIIII)V")
	public final void method2010(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2011(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1129];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1129; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method2027(arg0, arg1 - this.method2026(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	private void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static67.anInt2856 = -1;
		Static67.anInt2866 = -1;
		Static67.anInt2860 = arg1;
		Static67.anInt2857 = arg1;
		Static67.anInt2855 = arg0;
		Static67.anInt2859 = arg0;
		Static67.anInt2854 = 256;
		Static67.anInt2858 = 256;
		Static67.anInt2862 = 0;
		Static67.anInt2865 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;IIII)V")
	public final void method2012(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2011(arg3, arg4);
			this.method2020(arg0, arg1 - this.method2026(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;IIIII)V")
	public final void method2013(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2011(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1129];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1129; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2027(arg0, arg1 - this.method2026(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!ea;IIII)V")
	public final void method2015(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2011(arg3, arg4);
			this.method2020(arg0, arg1 - this.method2026(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lclient!ea;IIII)V")
	public final void method2016(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2011(arg3, arg4);
			this.method2020(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;I)V")
	private void method2017(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method747(); local5++) {
			@Pc(11) int local11 = arg0.method736(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static67.anInt2862 = (arg1 - this.method2026(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!ea;IIIII)V")
	public final void method2018(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2011(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1129];
		@Pc(14) int[] local14 = new int[arg0.anInt1129];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1129; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2027(arg0, arg1 - this.method2026(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;IIIILjava/util/Random;I)I")
	public final int method2019(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2033(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1129];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1129; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method2027(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;II)V")
	private void method2020(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2863;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1129; local10++) {
			@Pc(18) int local18 = arg0.aByteArray6[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class18 local38 = arg0.method744(local6 + 1, local10);
					local6 = -1;
					if (local38.method723(Static67.aClass18_716)) {
						local18 = 60;
					} else {
						if (!local38.method723(Static67.aClass18_710)) {
							if (local38.method740(Static67.aClass18_712)) {
								try {
									local68 = local38.method733(4).method750();
									@Pc(72) Class1_Sub1_Sub8_Sub1 local72 = Static67.aClass1_Sub1_Sub8_Sub1Array5[local68];
									local72.method919(arg1, local4 + this.anInt2863 - local72.anInt1430);
									arg1 += local72.anInt1434;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method2036(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray30 != null && local8 != -1) {
						arg1 += this.aByteArray30[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray255[local18];
					local68 = this.anIntArray259[local18];
					if (local18 == 32) {
						if (Static67.anInt2862 > 0) {
							Static67.anInt2865 += Static67.anInt2862;
							arg1 += Static67.anInt2865 >> 8;
							Static67.anInt2865 &= 0xFF;
						}
					} else if (Static67.anInt2858 == 256) {
						if (Static67.anInt2857 != -1) {
							this.method2023(local18, arg1 + this.anIntArray258[local18] + 1, local4 + this.anIntArray257[local18] + 1, local121, local68, Static67.anInt2857);
						}
						this.method2025(local18, arg1 + this.anIntArray258[local18], local4 + this.anIntArray257[local18], local121, local68, Static67.anInt2859);
					} else {
						if (Static67.anInt2857 != -1) {
							this.method2035(local18, arg1 + this.anIntArray258[local18] + 1, local4 + this.anIntArray257[local18] + 1, local121, local68, Static67.anInt2857, Static67.anInt2858);
						}
						this.method2030(local18, arg1 + this.anIntArray258[local18], local4 + this.anIntArray257[local18], local121, local68, Static67.anInt2859, Static67.anInt2858);
					}
					@Pc(243) int local243 = this.anIntArray256[local18];
					if (Static67.anInt2856 != -1) {
						Static63.method1992(arg1, local4 + (int) ((double) this.anInt2863 * 0.7D), local243, Static67.anInt2856);
					}
					if (Static67.anInt2866 != -1) {
						Static63.method1992(arg1, local4 + this.anInt2863 + 1, local243, Static67.anInt2866);
					}
					arg1 += local243;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!ea;I)I")
	public final int method2021(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1) {
		return this.method2008(arg0, new int[] { arg1 }, Static67.aClass18Array16);
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(IIIIII)V")
	private void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static63.anInt2849;
		@Pc(9) int local9 = Static63.anInt2849 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static63.anInt2850) {
			local20 = Static63.anInt2850 - arg2;
			arg4 -= local20;
			arg2 = Static63.anInt2850;
			local13 = local20 * arg3;
			local5 += local20 * Static63.anInt2849;
		}
		if (arg2 + arg4 > Static63.anInt2851) {
			arg4 -= arg2 + arg4 - Static63.anInt2851;
		}
		if (arg1 < Static63.anInt2848) {
			local20 = Static63.anInt2848 - arg1;
			arg3 -= local20;
			arg1 = Static63.anInt2848;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static63.anInt2853) {
			local20 = arg1 + arg3 - Static63.anInt2853;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static67.method2029(Static63.anIntArray254, this.aByteArrayArray14[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)I")
	private int method2024(@OriginalArg(0) int arg0) {
		return this.anIntArray256[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!ea;)I")
	public final int method2026(@OriginalArg(0) Class18 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1129; local11++) {
			@Pc(19) int local19 = arg0.aByteArray6[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class18 local39 = arg0.method744(local5 + 1, local11);
					local5 = -1;
					if (local39.method723(Static67.aClass18_716)) {
						local19 = 60;
					} else {
						if (!local39.method723(Static67.aClass18_710)) {
							if (local39.method740(Static67.aClass18_712)) {
								try {
									@Pc(69) int local69 = local39.method733(4).method750();
									local9 += Static67.aClass1_Sub1_Sub8_Sub1Array5[local69].anInt1434;
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
					local9 += this.anIntArray256[local19];
					if (this.aByteArray30 != null && local7 != -1) {
						local9 += this.aByteArray30[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;II[I[I)V")
	private void method2027(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2863;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1129; local12++) {
			@Pc(20) int local20 = arg0.aByteArray6[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class18 local40 = arg0.method744(local6 + 1, local12);
					local6 = -1;
					if (local40.method723(Static67.aClass18_716)) {
						local20 = 60;
					} else {
						if (!local40.method723(Static67.aClass18_710)) {
							if (local40.method740(Static67.aClass18_712)) {
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
									local89 = local40.method733(4).method750();
									@Pc(93) Class1_Sub1_Sub8_Sub1 local93 = Static67.aClass1_Sub1_Sub8_Sub1Array5[local89];
									local93.method919(arg1 + local69, local4 + this.anInt2863 - local93.anInt1430 + local78);
									arg1 += local93.anInt1434;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method2036(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray30 != null && local8 != -1) {
						arg1 += this.aByteArray30[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray255[local20];
					local69 = this.anIntArray259[local20];
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
						if (Static67.anInt2862 > 0) {
							Static67.anInt2865 += Static67.anInt2862;
							arg1 += Static67.anInt2865 >> 8;
							Static67.anInt2865 &= 0xFF;
						}
					} else if (Static67.anInt2858 == 256) {
						if (Static67.anInt2857 != -1) {
							this.method2023(local20, arg1 + this.anIntArray258[local20] + local78 + 1, local4 + this.anIntArray257[local20] + 1 + local89, local146, local69, Static67.anInt2857);
						}
						this.method2025(local20, arg1 + this.anIntArray258[local20] + local78, local4 + this.anIntArray257[local20] + local89, local146, local69, Static67.anInt2859);
					} else {
						if (Static67.anInt2857 != -1) {
							this.method2035(local20, arg1 + this.anIntArray258[local20] + local78 + 1, local4 + this.anIntArray257[local20] + 1 + local89, local146, local69, Static67.anInt2857, Static67.anInt2858);
						}
						this.method2030(local20, arg1 + this.anIntArray258[local20] + local78, local4 + this.anIntArray257[local20] + local89, local146, local69, Static67.anInt2859, Static67.anInt2858);
					}
					@Pc(303) int local303 = this.anIntArray256[local20];
					if (Static67.anInt2856 != -1) {
						Static63.method1992(arg1, local4 + (int) ((double) this.anInt2863 * 0.7D), local303, Static67.anInt2856);
					}
					if (Static67.anInt2866 != -1) {
						Static63.method1992(arg1, local4 + this.anInt2863, local303, Static67.anInt2866);
					}
					arg1 += local303;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;IIIIIIIII)I")
	public final int method2028(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2032(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method2030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;IIIIIIIIII)I")
	private int method2032(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2033(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2863;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2861 + this.anInt2864 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2008(arg0, local20, Static67.aClass18Array16);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2861;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2861 + (arg4 - this.anInt2861 - this.anInt2864 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2864 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2861 - this.anInt2864 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2861 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method2020(Static67.aClass18Array16[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method2020(Static67.aClass18Array16[local118], arg1 + (arg3 - this.method2026(Static67.aClass18Array16[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2020(Static67.aClass18Array16[local118], arg1 + arg3 - this.method2026(Static67.aClass18Array16[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method2020(Static67.aClass18Array16[local118], arg1, local57);
			} else {
				this.method2017(Static67.aClass18Array16[local118], arg3);
				this.method2020(Static67.aClass18Array16[local118], arg1, local57);
				Static67.anInt2862 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	private void method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static67.anInt2856 = -1;
		Static67.anInt2866 = -1;
		Static67.anInt2860 = arg1;
		Static67.anInt2857 = arg1;
		Static67.anInt2855 = arg0;
		Static67.anInt2859 = arg0;
		Static67.anInt2854 = arg2;
		Static67.anInt2858 = arg2;
		Static67.anInt2862 = 0;
		Static67.anInt2865 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIIIIII)V")
	private void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static63.anInt2849;
		@Pc(9) int local9 = Static63.anInt2849 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static63.anInt2850) {
			local20 = Static63.anInt2850 - arg2;
			arg4 -= local20;
			arg2 = Static63.anInt2850;
			local13 = local20 * arg3;
			local5 += local20 * Static63.anInt2849;
		}
		if (arg2 + arg4 > Static63.anInt2851) {
			arg4 -= arg2 + arg4 - Static63.anInt2851;
		}
		if (arg1 < Static63.anInt2848) {
			local20 = Static63.anInt2848 - arg1;
			arg3 -= local20;
			arg1 = Static63.anInt2848;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static63.anInt2853) {
			local20 = arg1 + arg3 - Static63.anInt2853;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static67.method2031(Static63.anIntArray254, this.aByteArrayArray14[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lclient!ea;)V")
	private void method2036(@OriginalArg(0) Class18 arg0) {
		try {
			if (arg0.method740(Static67.aClass18_713)) {
				Static67.anInt2859 = arg0.method733(4).method730(16);
				return;
			}
			if (arg0.method723(Static67.aClass18_715)) {
				Static67.anInt2859 = Static67.anInt2855;
				return;
			}
			if (arg0.method740(Static67.aClass18_717)) {
				Static67.anInt2856 = arg0.method733(4).method730(16);
				return;
			}
			if (arg0.method723(Static67.aClass18_720)) {
				Static67.anInt2856 = 8388608;
				return;
			}
			if (arg0.method723(Static67.aClass18_714)) {
				Static67.anInt2856 = -1;
				return;
			}
			if (arg0.method740(Static67.aClass18_708)) {
				Static67.anInt2866 = arg0.method733(2).method730(16);
				return;
			}
			if (arg0.method723(Static67.aClass18_711)) {
				Static67.anInt2866 = 0;
				return;
			}
			if (arg0.method723(Static67.aClass18_707)) {
				Static67.anInt2866 = -1;
				return;
			}
			if (arg0.method740(Static67.aClass18_719)) {
				Static67.anInt2857 = arg0.method733(5).method730(16);
				return;
			}
			if (arg0.method723(Static67.aClass18_718)) {
				Static67.anInt2857 = 0;
				return;
			}
			if (arg0.method723(Static67.aClass18_706)) {
				Static67.anInt2857 = Static67.anInt2860;
				return;
			}
			if (arg0.method723(Static67.aClass18_709)) {
				this.method2033(Static67.anInt2855, Static67.anInt2860, Static67.anInt2854);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lclient!ea;I)I")
	public final int method2037(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2008(arg0, new int[] { arg1 }, Static67.aClass18Array16);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method2026(Static67.aClass18Array16[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}
}
