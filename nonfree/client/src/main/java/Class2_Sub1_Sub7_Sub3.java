import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public abstract class Class2_Sub1_Sub7_Sub3 extends Class2_Sub1_Sub7 {

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "[Lclient!fa;")
	private Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array5;

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!nh", name = "vb", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!nh", name = "Ab", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
	public int anInt2252 = 0;

	@OriginalMember(owner = "client!nh", name = "jb", descriptor = "[[B")
	protected byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!nh", name = "Cb", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!nh", name = "gb", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!nh", name = "pb", descriptor = "I")
	private int anInt2256;

	@OriginalMember(owner = "client!nh", name = "Db", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub1_Sub7_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray251 = arg1;
		this.anIntArray256 = arg2;
		this.anIntArray254 = arg3;
		this.anIntArray253 = arg4;
		this.method1792(arg0);
		this.aByteArrayArray3 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray256[local32] < local28 && this.anIntArray253[local32] != 0) {
				local28 = this.anIntArray256[local32];
			}
			if (this.anIntArray256[local32] + this.anIntArray253[local32] > local30) {
				local30 = this.anIntArray256[local32] + this.anIntArray253[local32];
			}
		}
		this.anInt2256 = this.anInt2252 - local28;
		this.anInt2260 = local30 - this.anInt2252;
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub7_Sub3(@OriginalArg(0) byte[] arg0) {
		this.method1792(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(IIIIII)V")
	private void method1776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static133.anInt2685;
		@Pc(9) int local9 = Static133.anInt2685 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static133.anInt2686) {
			local20 = Static133.anInt2686 - arg2;
			arg4 -= local20;
			arg2 = Static133.anInt2686;
			local13 = local20 * arg3;
			local5 += local20 * Static133.anInt2685;
		}
		if (arg2 + arg4 > Static133.anInt2689) {
			arg4 -= arg2 + arg4 - Static133.anInt2689;
		}
		if (arg1 < Static133.anInt2690) {
			local20 = Static133.anInt2690 - arg1;
			arg3 -= local20;
			arg1 = Static133.anInt2690;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static133.anInt2687) {
			local20 = arg1 + arg3 - Static133.anInt2687;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static124.method1798(Static133.anIntArray309, this.aByteArrayArray3[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;I)I")
	public final int method1778(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		return this.method1803(arg0, new int[] { arg1 }, Static124.aClass60Array15);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
	private void method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static124.anInt2249 = -1;
		Static124.anInt2255 = -1;
		Static124.anInt2257 = arg1;
		Static124.anInt2248 = arg1;
		Static124.anInt2254 = arg0;
		Static124.anInt2259 = arg0;
		Static124.anInt2258 = arg2;
		Static124.anInt2250 = arg2;
		Static124.anInt2251 = 0;
		Static124.anInt2253 = 0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;IIIII)V")
	public final void method1781(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1788(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3466];
		@Pc(14) int[] local14 = new int[arg0.anInt3466];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3466; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1794(arg0, arg1 - this.method1789(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)I")
	private int method1782(@OriginalArg(0) int arg0) {
		return this.anIntArray255[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;IIIIII)V")
	public final void method1783(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1788(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt3466];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3466; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1794(arg0, arg1 - this.method1789(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;IIIILjava/util/Random;I)I")
	public final int method1784(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1779(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt3466];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3466; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1794(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(IIIIII)V")
	protected abstract void method1785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;IIII)V")
	public final void method1786(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1788(arg3, arg4);
			this.method1805(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
	private void method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static124.anInt2249 = -1;
		Static124.anInt2255 = -1;
		Static124.anInt2257 = arg1;
		Static124.anInt2248 = arg1;
		Static124.anInt2254 = arg0;
		Static124.anInt2259 = arg0;
		Static124.anInt2258 = 256;
		Static124.anInt2250 = 256;
		Static124.anInt2251 = 0;
		Static124.anInt2253 = 0;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!ob;)I")
	public final int method1789(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3466; local11++) {
			@Pc(19) int local19 = arg0.aByteArray39[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class60 local39 = arg0.method2667(local11, local5 + 1);
					local5 = -1;
					if (local39.method2687(Static124.aClass60_593)) {
						local19 = 60;
					} else if (local39.method2687(Static124.aClass60_583)) {
						local19 = 62;
					} else if (local39.method2687(Static124.aClass60_581)) {
						local19 = 160;
					} else if (local39.method2687(Static124.aClass60_586)) {
						local19 = 173;
					} else if (local39.method2687(Static124.aClass60_578)) {
						local19 = 215;
					} else if (local39.method2687(Static124.aClass60_595)) {
						local19 = 128;
					} else if (local39.method2687(Static124.aClass60_594)) {
						local19 = 169;
					} else {
						if (!local39.method2687(Static124.aClass60_589)) {
							if (local39.method2697(Static124.aClass60_579)) {
								try {
									@Pc(117) int local117 = local39.method2672(4).method2692();
									local9 += this.aClass2_Sub1_Sub7_Sub2Array5[local117].anInt1591;
									local7 = -1;
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local19 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray255[local19];
					if (this.aByteArray29 != null && local7 != -1) {
						local9 += this.aByteArray29[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;IIIIIIIIII)I")
	private int method1790(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1779(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2252;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2256 + this.anInt2260 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1803(arg0, local20, Static124.aClass60Array15);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2256;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2256 + (arg4 - this.anInt2256 - this.anInt2260 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2260 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2256 - this.anInt2260 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2256 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1805(Static124.aClass60Array15[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1805(Static124.aClass60Array15[local118], arg1 + (arg3 - this.method1789(Static124.aClass60Array15[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1805(Static124.aClass60Array15[local118], arg1 + arg3 - this.method1789(Static124.aClass60Array15[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1805(Static124.aClass60Array15[local118], arg1, local57);
			} else {
				this.method1806(Static124.aClass60Array15[local118], arg3);
				this.method1805(Static124.aClass60Array15[local118], arg1, local57);
				Static124.anInt2251 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;IIIIIIIII)I")
	public final int method1791(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1790(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([B)V")
	private void method1792(@OriginalArg(0) byte[] arg0) {
		this.anIntArray255 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray255.length; local9++) {
				this.anIntArray255[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2252 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray255[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray29 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray29[(local182 << 8) + local150] = (byte) Static124.method1780(local93, local136, local58, this.anIntArray255, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2252 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!ob;IIII)V")
	public final void method1793(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1788(arg3, arg4);
			this.method1805(arg0, arg1 - this.method1789(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;II[I[I)V")
	private void method1794(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2252;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3466; local12++) {
			@Pc(20) int local20 = arg0.aByteArray39[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class60 local40 = arg0.method2667(local12, local6 + 1);
					local6 = -1;
					if (local40.method2687(Static124.aClass60_593)) {
						local20 = 60;
					} else if (local40.method2687(Static124.aClass60_583)) {
						local20 = 62;
					} else if (local40.method2687(Static124.aClass60_581)) {
						local20 = 160;
					} else if (local40.method2687(Static124.aClass60_586)) {
						local20 = 173;
					} else if (local40.method2687(Static124.aClass60_578)) {
						local20 = 215;
					} else if (local40.method2687(Static124.aClass60_595)) {
						local20 = 128;
					} else if (local40.method2687(Static124.aClass60_594)) {
						local20 = 169;
					} else {
						if (!local40.method2687(Static124.aClass60_589)) {
							if (local40.method2697(Static124.aClass60_579)) {
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
									local137 = local40.method2672(4).method2692();
									@Pc(142) Class2_Sub1_Sub7_Sub2 local142 = this.aClass2_Sub1_Sub7_Sub2Array5[local137];
									@Pc(153) int local153 = this.anIntArray252 == null ? local142.anInt1593 : this.anIntArray252[local137];
									if (Static124.anInt2250 == 256) {
										local142.method1202(arg1 + local117, local4 + this.anInt2252 - local153 + local126);
									} else {
										local142.method1201(arg1 + local117, local4 + this.anInt2252 - local153 + local126, Static124.anInt2250);
									}
									arg1 += local142.anInt1591;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method1796(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray29 != null && local8 != -1) {
						arg1 += this.aByteArray29[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray254[local20];
					local117 = this.anIntArray253[local20];
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
						if (Static124.anInt2251 > 0) {
							Static124.anInt2253 += Static124.anInt2251;
							arg1 += Static124.anInt2253 >> 8;
							Static124.anInt2253 &= 0xFF;
						}
					} else if (Static124.anInt2250 == 256) {
						if (Static124.anInt2248 != -1) {
							this.method1776(local20, arg1 + this.anIntArray251[local20] + local126 + 1, local4 + this.anIntArray256[local20] + 1 + local137, local223, local117, Static124.anInt2248);
						}
						this.method1785(local20, arg1 + this.anIntArray251[local20] + local126, local4 + this.anIntArray256[local20] + local137, local223, local117, Static124.anInt2259);
					} else {
						if (Static124.anInt2248 != -1) {
							this.method1802(local20, arg1 + this.anIntArray251[local20] + local126 + 1, local4 + this.anIntArray256[local20] + 1 + local137, local223, local117, Static124.anInt2248, Static124.anInt2250);
						}
						this.method1799(local20, arg1 + this.anIntArray251[local20] + local126, local4 + this.anIntArray256[local20] + local137, local223, local117, Static124.anInt2259, Static124.anInt2250);
					}
					@Pc(380) int local380 = this.anIntArray255[local20];
					if (Static124.anInt2249 != -1) {
						Static133.method2122(arg1, local4 + (int) ((double) this.anInt2252 * 0.7D), local380, Static124.anInt2249);
					}
					if (Static124.anInt2255 != -1) {
						Static133.method2122(arg1, local4 + this.anInt2252, local380, Static124.anInt2255);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Lclient!ob;)V")
	private void method1796(@OriginalArg(0) Class60 arg0) {
		try {
			if (arg0.method2697(Static124.aClass60_582)) {
				Static124.anInt2259 = arg0.method2672(4).method2680(16);
				return;
			}
			if (arg0.method2687(Static124.aClass60_587)) {
				Static124.anInt2259 = Static124.anInt2254;
				return;
			}
			if (arg0.method2697(Static124.aClass60_590)) {
				Static124.anInt2250 = arg0.method2672(6).method2692();
				return;
			}
			if (arg0.method2687(Static124.aClass60_598)) {
				Static124.anInt2250 = Static124.anInt2258;
				return;
			}
			if (arg0.method2697(Static124.aClass60_576)) {
				Static124.anInt2249 = arg0.method2672(4).method2680(16);
				return;
			}
			if (arg0.method2687(Static124.aClass60_580)) {
				Static124.anInt2249 = 8388608;
				return;
			}
			if (arg0.method2687(Static124.aClass60_584)) {
				Static124.anInt2249 = -1;
				return;
			}
			if (arg0.method2697(Static124.aClass60_585)) {
				Static124.anInt2255 = arg0.method2672(2).method2680(16);
				return;
			}
			if (arg0.method2687(Static124.aClass60_591)) {
				Static124.anInt2255 = 0;
				return;
			}
			if (arg0.method2687(Static124.aClass60_597)) {
				Static124.anInt2255 = -1;
				return;
			}
			if (arg0.method2697(Static124.aClass60_592)) {
				Static124.anInt2248 = arg0.method2672(5).method2680(16);
				return;
			}
			if (arg0.method2687(Static124.aClass60_577)) {
				Static124.anInt2248 = 0;
				return;
			}
			if (arg0.method2687(Static124.aClass60_588)) {
				Static124.anInt2248 = Static124.anInt2257;
				return;
			}
			if (arg0.method2687(Static124.aClass60_596)) {
				this.method1779(Static124.anInt2254, Static124.anInt2257, Static124.anInt2258);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!ob;I)I")
	public final int method1797(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1803(arg0, new int[] { arg1 }, Static124.aClass60Array15);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1789(Static124.aClass60Array15[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Lclient!ob;IIII)V")
	public final void method1800(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1788(arg3, arg4);
			this.method1805(arg0, arg1 - this.method1789(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!ob;IIIII)V")
	public final void method1801(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1788(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3466];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3466; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1794(arg0, arg1 - this.method1789(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIIIIII)V")
	private void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static133.anInt2685;
		@Pc(9) int local9 = Static133.anInt2685 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static133.anInt2686) {
			local20 = Static133.anInt2686 - arg2;
			arg4 -= local20;
			arg2 = Static133.anInt2686;
			local13 = local20 * arg3;
			local5 += local20 * Static133.anInt2685;
		}
		if (arg2 + arg4 > Static133.anInt2689) {
			arg4 -= arg2 + arg4 - Static133.anInt2689;
		}
		if (arg1 < Static133.anInt2690) {
			local20 = Static133.anInt2690 - arg1;
			arg3 -= local20;
			arg1 = Static133.anInt2690;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static133.anInt2687) {
			local20 = arg1 + arg3 - Static133.anInt2687;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static124.method1787(Static133.anIntArray309, this.aByteArrayArray3[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;[I[Lclient!ob;)I")
	private int method1803(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class60[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class60 local11 = Static185.method3428(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method2673();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method2665(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class60 local55 = arg0.method2667(local29, local19 + 1);
					local19 = -1;
					local11.method2694(60);
					local11.method2670(local55);
					local11.method2694(62);
					if (local55.method2687(Static124.aClass60_596)) {
						arg2[local23++] = local11.method2667(local11.method2673(), local7);
						local7 = local11.method2673();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method2687(Static124.aClass60_593)) {
						local5 += this.method1782(60);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method2687(Static124.aClass60_583)) {
						local5 += this.method1782(62);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method2687(Static124.aClass60_581)) {
						local5 += this.method1782(160);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method2687(Static124.aClass60_586)) {
						local5 += this.method1782(173);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method2687(Static124.aClass60_578)) {
						local5 += this.method1782(215);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method2687(Static124.aClass60_595)) {
						local5 += this.method1782(128);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method2687(Static124.aClass60_594)) {
						local5 += this.method1782(169);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method2687(Static124.aClass60_589)) {
						local5 += this.method1782(174);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method2697(Static124.aClass60_579)) {
						try {
							@Pc(359) int local359 = local55.method2672(4).method2692();
							local5 += this.aClass2_Sub1_Sub7_Sub2Array5[local359].anInt1591;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method2694(local35);
						local5 += this.method1782(local35);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method2673();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method2667(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method2673();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method2673() > local7) {
			arg2[local23++] = local11.method2667(local11.method2673(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([Lclient!fa;[I)V")
	public final void method1804(@OriginalArg(0) Class2_Sub1_Sub7_Sub2[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass2_Sub1_Sub7_Sub2Array5 = arg0;
		this.anIntArray252 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;II)V")
	private void method1805(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2252;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt3466; local10++) {
			@Pc(18) int local18 = arg0.aByteArray39[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class60 local38 = arg0.method2667(local10, local6 + 1);
					local6 = -1;
					if (local38.method2687(Static124.aClass60_593)) {
						local18 = 60;
					} else if (local38.method2687(Static124.aClass60_583)) {
						local18 = 62;
					} else if (local38.method2687(Static124.aClass60_581)) {
						local18 = 160;
					} else if (local38.method2687(Static124.aClass60_586)) {
						local18 = 173;
					} else if (local38.method2687(Static124.aClass60_578)) {
						local18 = 215;
					} else if (local38.method2687(Static124.aClass60_595)) {
						local18 = 128;
					} else if (local38.method2687(Static124.aClass60_594)) {
						local18 = 169;
					} else {
						if (!local38.method2687(Static124.aClass60_589)) {
							if (local38.method2697(Static124.aClass60_579)) {
								try {
									local116 = local38.method2672(4).method2692();
									@Pc(121) Class2_Sub1_Sub7_Sub2 local121 = this.aClass2_Sub1_Sub7_Sub2Array5[local116];
									@Pc(132) int local132 = this.anIntArray252 == null ? local121.anInt1593 : this.anIntArray252[local116];
									if (Static124.anInt2250 == 256) {
										local121.method1202(arg1, local4 + this.anInt2252 - local132);
									} else {
										local121.method1201(arg1, local4 + this.anInt2252 - local132, Static124.anInt2250);
									}
									arg1 += local121.anInt1591;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method1796(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray29 != null && local8 != -1) {
						arg1 += this.aByteArray29[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray254[local18];
					local116 = this.anIntArray253[local18];
					if (local18 == 32) {
						if (Static124.anInt2251 > 0) {
							Static124.anInt2253 += Static124.anInt2251;
							arg1 += Static124.anInt2253 >> 8;
							Static124.anInt2253 &= 0xFF;
						}
					} else if (Static124.anInt2250 == 256) {
						if (Static124.anInt2248 != -1) {
							this.method1776(local18, arg1 + this.anIntArray251[local18] + 1, local4 + this.anIntArray256[local18] + 1, local194, local116, Static124.anInt2248);
						}
						this.method1785(local18, arg1 + this.anIntArray251[local18], local4 + this.anIntArray256[local18], local194, local116, Static124.anInt2259);
					} else {
						if (Static124.anInt2248 != -1) {
							this.method1802(local18, arg1 + this.anIntArray251[local18] + 1, local4 + this.anIntArray256[local18] + 1, local194, local116, Static124.anInt2248, Static124.anInt2250);
						}
						this.method1799(local18, arg1 + this.anIntArray251[local18], local4 + this.anIntArray256[local18], local194, local116, Static124.anInt2259, Static124.anInt2250);
					}
					@Pc(316) int local316 = this.anIntArray255[local18];
					if (Static124.anInt2249 != -1) {
						Static133.method2122(arg1, local4 + (int) ((double) this.anInt2252 * 0.7D), local316, Static124.anInt2249);
					}
					if (Static124.anInt2255 != -1) {
						Static133.method2122(arg1, local4 + this.anInt2252 + 1, local316, Static124.anInt2255);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Lclient!ob;I)V")
	private void method1806(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method2673(); local5++) {
			@Pc(11) int local11 = arg0.method2665(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static124.anInt2251 = (arg1 - this.method1789(arg0) << 8) / local1;
		}
	}
}
