import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public abstract class Class1_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "[Lclient!bg;")
	private Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array3;

	@OriginalMember(owner = "client!vb", name = "Fb", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "[[B")
	protected byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
	public int anInt225 = 0;

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!vb", name = "mb", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub2_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray26 = arg1;
		this.anIntArray23 = arg2;
		this.anIntArray25 = arg3;
		this.anIntArray24 = arg4;
		this.method244(arg0);
		this.aByteArrayArray2 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray23[local32] < local28 && this.anIntArray24[local32] != 0) {
				local28 = this.anIntArray23[local32];
			}
			if (this.anIntArray23[local32] + this.anIntArray24[local32] > local30) {
				local30 = this.anIntArray23[local32] + this.anIntArray24[local32];
			}
		}
		this.anInt232 = this.anInt225 - local28;
		this.anInt231 = local30 - this.anInt225;
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method244(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
	private void method234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static128.anInt509;
		@Pc(9) int local9 = Static128.anInt509 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static128.anInt507) {
			local20 = Static128.anInt507 - arg2;
			arg4 -= local20;
			arg2 = Static128.anInt507;
			local13 = local20 * arg3;
			local5 += local20 * Static128.anInt509;
		}
		if (arg2 + arg4 > Static128.anInt510) {
			arg4 -= arg2 + arg4 - Static128.anInt510;
		}
		if (arg1 < Static128.anInt508) {
			local20 = Static128.anInt508 - arg1;
			arg3 -= local20;
			arg1 = Static128.anInt508;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static128.anInt506) {
			local20 = arg1 + arg3 - Static128.anInt506;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static177.method233(Static128.anIntArray75, this.aByteArrayArray2[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;II[I[I)V")
	private void method235(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt225;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1080; local12++) {
			@Pc(20) int local20 = arg0.aByteArray19[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class13 local40 = arg0.method883(local6 + 1, local12);
					local6 = -1;
					if (local40.method889(Static177.aClass13_125)) {
						local20 = 60;
					} else if (local40.method889(Static177.aClass13_123)) {
						local20 = 62;
					} else if (local40.method889(Static177.aClass13_121)) {
						local20 = 160;
					} else if (local40.method889(Static177.aClass13_110)) {
						local20 = 173;
					} else if (local40.method889(Static177.aClass13_117)) {
						local20 = 215;
					} else if (local40.method889(Static177.aClass13_112)) {
						local20 = 128;
					} else if (local40.method889(Static177.aClass13_128)) {
						local20 = 169;
					} else {
						if (!local40.method889(Static177.aClass13_116)) {
							if (local40.method892(Static177.aClass13_115)) {
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
									local137 = local40.method901(4).method887();
									@Pc(142) Class1_Sub2_Sub1_Sub4 local142 = this.aClass1_Sub2_Sub1_Sub4Array3[local137];
									@Pc(153) int local153 = this.anIntArray22 == null ? local142.anInt515 : this.anIntArray22[local137];
									if (Static177.anInt229 == 256) {
										local142.method570(arg1 + local117, local4 + this.anInt225 - local153 + local126);
									} else {
										local142.method568(arg1 + local117, local4 + this.anInt225 - local153 + local126, Static177.anInt229);
									}
									arg1 += local142.anInt513;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method259(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray5 != null && local8 != -1) {
						arg1 += this.aByteArray5[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray25[local20];
					local117 = this.anIntArray24[local20];
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
						if (Static177.anInt235 > 0) {
							Static177.anInt226 += Static177.anInt235;
							arg1 += Static177.anInt226 >> 8;
							Static177.anInt226 &= 0xFF;
						}
					} else if (Static177.anInt229 == 256) {
						if (Static177.anInt236 != -1) {
							this.method260(local20, arg1 + this.anIntArray26[local20] + local126 + 1, local4 + this.anIntArray23[local20] + 1 + local137, local223, local117, Static177.anInt236);
						}
						this.method232(local20, arg1 + this.anIntArray26[local20] + local126, local4 + this.anIntArray23[local20] + local137, local223, local117, Static177.anInt230);
					} else {
						if (Static177.anInt236 != -1) {
							this.method234(local20, arg1 + this.anIntArray26[local20] + local126 + 1, local4 + this.anIntArray23[local20] + 1 + local137, local223, local117, Static177.anInt236, Static177.anInt229);
						}
						this.method236(local20, arg1 + this.anIntArray26[local20] + local126, local4 + this.anIntArray23[local20] + local137, local223, local117, Static177.anInt230, Static177.anInt229);
					}
					@Pc(380) int local380 = this.anIntArray21[local20];
					if (Static177.anInt227 != -1) {
						Static128.method558(arg1, local4 + (int) ((double) this.anInt225 * 0.7D), local380, Static177.anInt227);
					}
					if (Static177.anInt224 != -1) {
						Static128.method558(arg1, local4 + this.anInt225, local380, Static177.anInt224);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;IIIIIIIIII)I")
	private int method239(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method247(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt225;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt232 + this.anInt231 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method242(arg0, local20, Static177.aClass13Array3);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt232;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt232 + (arg4 - this.anInt232 - this.anInt231 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt231 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt232 - this.anInt231 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt232 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method253(Static177.aClass13Array3[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method253(Static177.aClass13Array3[local118], arg1 + (arg3 - this.method246(Static177.aClass13Array3[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method253(Static177.aClass13Array3[local118], arg1 + arg3 - this.method246(Static177.aClass13Array3[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method253(Static177.aClass13Array3[local118], arg1, local57);
			} else {
				this.method257(Static177.aClass13Array3[local118], arg3);
				this.method253(Static177.aClass13Array3[local118], arg1, local57);
				Static177.anInt235 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;IIIII)V")
	public final void method240(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method249(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1080];
		@Pc(14) int[] local14 = new int[arg0.anInt1080];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1080; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method235(arg0, arg1 - this.method246(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;[I[Lclient!dd;)I")
	private int method242(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class13[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class13 local11 = Static79.method1661(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method904();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method898(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class13 local55 = arg0.method883(local19 + 1, local29);
					local19 = -1;
					local11.method891(60);
					local11.method900(local55);
					local11.method891(62);
					if (local55.method889(Static177.aClass13_124)) {
						arg2[local23++] = local11.method883(local7, local11.method904());
						local7 = local11.method904();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method889(Static177.aClass13_125)) {
						local5 += this.method261(60);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method889(Static177.aClass13_123)) {
						local5 += this.method261(62);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method889(Static177.aClass13_121)) {
						local5 += this.method261(160);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method889(Static177.aClass13_110)) {
						local5 += this.method261(173);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method889(Static177.aClass13_117)) {
						local5 += this.method261(215);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method889(Static177.aClass13_112)) {
						local5 += this.method261(128);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method889(Static177.aClass13_128)) {
						local5 += this.method261(169);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method889(Static177.aClass13_116)) {
						local5 += this.method261(174);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method892(Static177.aClass13_115)) {
						try {
							@Pc(359) int local359 = local55.method901(4).method887();
							local5 += this.aClass1_Sub2_Sub1_Sub4Array3[local359].anInt513;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method891(local35);
						local5 += this.method261(local35);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method904();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method883(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method904();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method904() > local7) {
			arg2[local23++] = local11.method883(local7, local11.method904());
		}
		return local23;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;IIIIII)V")
	public final void method243(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method249(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1080];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1080; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method235(arg0, arg1 - this.method246(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([B)V")
	private void method244(@OriginalArg(0) byte[] arg0) {
		this.anIntArray21 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray21.length; local9++) {
				this.anIntArray21[local9] = arg0[local9] & 0xFF;
			}
			this.anInt225 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray21[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray5 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray5[(local182 << 8) + local150] = (byte) Static177.method238(local93, local136, local58, this.anIntArray21, local55, local182, local150);
					}
				}
			}
		}
		this.anInt225 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;IIIIIIIII)I")
	public final int method245(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method239(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lclient!dd;)I")
	public final int method246(@OriginalArg(0) Class13 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1080; local11++) {
			@Pc(19) int local19 = arg0.aByteArray19[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class13 local39 = arg0.method883(local5 + 1, local11);
					local5 = -1;
					if (local39.method889(Static177.aClass13_125)) {
						local19 = 60;
					} else if (local39.method889(Static177.aClass13_123)) {
						local19 = 62;
					} else if (local39.method889(Static177.aClass13_121)) {
						local19 = 160;
					} else if (local39.method889(Static177.aClass13_110)) {
						local19 = 173;
					} else if (local39.method889(Static177.aClass13_117)) {
						local19 = 215;
					} else if (local39.method889(Static177.aClass13_112)) {
						local19 = 128;
					} else if (local39.method889(Static177.aClass13_128)) {
						local19 = 169;
					} else {
						if (!local39.method889(Static177.aClass13_116)) {
							if (local39.method892(Static177.aClass13_115)) {
								try {
									@Pc(117) int local117 = local39.method901(4).method887();
									local9 += this.aClass1_Sub2_Sub1_Sub4Array3[local117].anInt513;
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
					local9 += this.anIntArray21[local19];
					if (this.aByteArray5 != null && local7 != -1) {
						local9 += this.aByteArray5[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	private void method247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static177.anInt227 = -1;
		Static177.anInt224 = -1;
		Static177.anInt234 = arg1;
		Static177.anInt236 = arg1;
		Static177.anInt233 = arg0;
		Static177.anInt230 = arg0;
		Static177.anInt228 = arg2;
		Static177.anInt229 = arg2;
		Static177.anInt235 = 0;
		Static177.anInt226 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;I)I")
	public final int method248(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		return this.method242(arg0, new int[] { arg1 }, Static177.aClass13Array3);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	private void method249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static177.anInt227 = -1;
		Static177.anInt224 = -1;
		Static177.anInt234 = arg1;
		Static177.anInt236 = arg1;
		Static177.anInt233 = arg0;
		Static177.anInt230 = arg0;
		Static177.anInt228 = 256;
		Static177.anInt229 = 256;
		Static177.anInt235 = 0;
		Static177.anInt226 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lclient!dd;I)I")
	public final int method250(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method242(arg0, new int[] { arg1 }, Static177.aClass13Array3);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method246(Static177.aClass13Array3[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lclient!dd;IIIII)V")
	public final void method252(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method249(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1080];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1080; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method235(arg0, arg1 - this.method246(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;II)V")
	private void method253(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt225;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1080; local10++) {
			@Pc(18) int local18 = arg0.aByteArray19[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class13 local38 = arg0.method883(local6 + 1, local10);
					local6 = -1;
					if (local38.method889(Static177.aClass13_125)) {
						local18 = 60;
					} else if (local38.method889(Static177.aClass13_123)) {
						local18 = 62;
					} else if (local38.method889(Static177.aClass13_121)) {
						local18 = 160;
					} else if (local38.method889(Static177.aClass13_110)) {
						local18 = 173;
					} else if (local38.method889(Static177.aClass13_117)) {
						local18 = 215;
					} else if (local38.method889(Static177.aClass13_112)) {
						local18 = 128;
					} else if (local38.method889(Static177.aClass13_128)) {
						local18 = 169;
					} else {
						if (!local38.method889(Static177.aClass13_116)) {
							if (local38.method892(Static177.aClass13_115)) {
								try {
									local116 = local38.method901(4).method887();
									@Pc(121) Class1_Sub2_Sub1_Sub4 local121 = this.aClass1_Sub2_Sub1_Sub4Array3[local116];
									@Pc(132) int local132 = this.anIntArray22 == null ? local121.anInt515 : this.anIntArray22[local116];
									if (Static177.anInt229 == 256) {
										local121.method570(arg1, local4 + this.anInt225 - local132);
									} else {
										local121.method568(arg1, local4 + this.anInt225 - local132, Static177.anInt229);
									}
									arg1 += local121.anInt513;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method259(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray5 != null && local8 != -1) {
						arg1 += this.aByteArray5[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray25[local18];
					local116 = this.anIntArray24[local18];
					if (local18 == 32) {
						if (Static177.anInt235 > 0) {
							Static177.anInt226 += Static177.anInt235;
							arg1 += Static177.anInt226 >> 8;
							Static177.anInt226 &= 0xFF;
						}
					} else if (Static177.anInt229 == 256) {
						if (Static177.anInt236 != -1) {
							this.method260(local18, arg1 + this.anIntArray26[local18] + 1, local4 + this.anIntArray23[local18] + 1, local194, local116, Static177.anInt236);
						}
						this.method232(local18, arg1 + this.anIntArray26[local18], local4 + this.anIntArray23[local18], local194, local116, Static177.anInt230);
					} else {
						if (Static177.anInt236 != -1) {
							this.method234(local18, arg1 + this.anIntArray26[local18] + 1, local4 + this.anIntArray23[local18] + 1, local194, local116, Static177.anInt236, Static177.anInt229);
						}
						this.method236(local18, arg1 + this.anIntArray26[local18], local4 + this.anIntArray23[local18], local194, local116, Static177.anInt230, Static177.anInt229);
					}
					@Pc(316) int local316 = this.anIntArray21[local18];
					if (Static177.anInt227 != -1) {
						Static128.method558(arg1, local4 + (int) ((double) this.anInt225 * 0.7D), local316, Static177.anInt227);
					}
					if (Static177.anInt224 != -1) {
						Static128.method558(arg1, local4 + this.anInt225 + 1, local316, Static177.anInt224);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;IIII)V")
	public final void method254(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method249(arg3, arg4);
			this.method253(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lclient!dd;IIII)V")
	public final void method255(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method249(arg3, arg4);
			this.method253(arg0, arg1 - this.method246(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dd;IIIILjava/util/Random;I)I")
	public final int method256(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method247(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1080];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1080; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method235(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Lclient!dd;I)V")
	private void method257(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method904(); local5++) {
			@Pc(11) int local11 = arg0.method898(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static177.anInt235 = (arg1 - this.method246(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Lclient!dd;IIII)V")
	public final void method258(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method249(arg3, arg4);
			this.method253(arg0, arg1 - this.method246(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Lclient!dd;)V")
	private void method259(@OriginalArg(0) Class13 arg0) {
		try {
			if (arg0.method892(Static177.aClass13_119)) {
				Static177.anInt230 = arg0.method901(4).method912(16);
				return;
			}
			if (arg0.method889(Static177.aClass13_120)) {
				Static177.anInt230 = Static177.anInt233;
				return;
			}
			if (arg0.method892(Static177.aClass13_126)) {
				Static177.anInt229 = arg0.method901(6).method887();
				return;
			}
			if (arg0.method889(Static177.aClass13_127)) {
				Static177.anInt229 = Static177.anInt228;
				return;
			}
			if (arg0.method892(Static177.aClass13_129)) {
				Static177.anInt227 = arg0.method901(4).method912(16);
				return;
			}
			if (arg0.method889(Static177.aClass13_118)) {
				Static177.anInt227 = 8388608;
				return;
			}
			if (arg0.method889(Static177.aClass13_108)) {
				Static177.anInt227 = -1;
				return;
			}
			if (arg0.method892(Static177.aClass13_113)) {
				Static177.anInt224 = arg0.method901(2).method912(16);
				return;
			}
			if (arg0.method889(Static177.aClass13_109)) {
				Static177.anInt224 = 0;
				return;
			}
			if (arg0.method889(Static177.aClass13_111)) {
				Static177.anInt224 = -1;
				return;
			}
			if (arg0.method892(Static177.aClass13_114)) {
				Static177.anInt236 = arg0.method901(5).method912(16);
				return;
			}
			if (arg0.method889(Static177.aClass13_122)) {
				Static177.anInt236 = 0;
				return;
			}
			if (arg0.method889(Static177.aClass13_107)) {
				Static177.anInt236 = Static177.anInt234;
				return;
			}
			if (arg0.method889(Static177.aClass13_124)) {
				this.method247(Static177.anInt233, Static177.anInt234, Static177.anInt228);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(IIIIII)V")
	private void method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static128.anInt509;
		@Pc(9) int local9 = Static128.anInt509 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static128.anInt507) {
			local20 = Static128.anInt507 - arg2;
			arg4 -= local20;
			arg2 = Static128.anInt507;
			local13 = local20 * arg3;
			local5 += local20 * Static128.anInt509;
		}
		if (arg2 + arg4 > Static128.anInt510) {
			arg4 -= arg2 + arg4 - Static128.anInt510;
		}
		if (arg1 < Static128.anInt508) {
			local20 = Static128.anInt508 - arg1;
			arg3 -= local20;
			arg1 = Static128.anInt508;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static128.anInt506) {
			local20 = arg1 + arg3 - Static128.anInt506;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static177.method251(Static128.anIntArray75, this.aByteArrayArray2[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I")
	private int method261(@OriginalArg(0) int arg0) {
		return this.anIntArray21[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([Lclient!bg;[I)V")
	public final void method262(@OriginalArg(0) Class1_Sub2_Sub1_Sub4[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass1_Sub2_Sub1_Sub4Array3 = arg0;
		this.anIntArray22 = arg1;
	}
}
