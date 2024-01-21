import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Class2_Sub4_Sub3_Sub2 extends Class2_Sub4_Sub3 {

	@OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "[[B")
	protected byte[][] aByteArrayArray9 = new byte[256][];

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "I")
	public int anInt3536 = 0;

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
	private int anInt3537;

	@OriginalMember(owner = "client!he", name = "tb", descriptor = "I")
	private int anInt3539;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub4_Sub3_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray333 = arg1;
		this.anIntArray331 = arg2;
		this.anIntArray330 = arg3;
		this.anIntArray332 = arg4;
		this.method2450(arg0);
		this.aByteArrayArray9 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray331[local32] < local28 && this.anIntArray332[local32] != 0) {
				local28 = this.anIntArray331[local32];
			}
			if (this.anIntArray331[local32] + this.anIntArray332[local32] > local30) {
				local30 = this.anIntArray331[local32] + this.anIntArray332[local32];
			}
		}
		this.anInt3537 = this.anInt3536 - local28;
		this.anInt3539 = local30 - this.anInt3536;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
	public Class2_Sub4_Sub3_Sub2(@OriginalArg(0) byte[] arg0) {
		this.method2450(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	private void method2446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static68.anInt3533 = -1;
		Static68.anInt3538 = -1;
		Static68.anInt3534 = arg1;
		Static68.anInt3542 = arg1;
		Static68.anInt3535 = arg0;
		Static68.anInt3532 = arg0;
		Static68.anInt3531 = arg2;
		Static68.anInt3541 = arg2;
		Static68.anInt3543 = 0;
		Static68.anInt3540 = 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;IIIII)V")
	public final void method2447(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2468(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1718];
		@Pc(14) int[] local14 = new int[arg0.anInt1718];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1718; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2448(arg0, arg1 - this.method2475(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;II[I[I)V")
	private void method2448(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt3536;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1718; local12++) {
			@Pc(20) int local20 = arg0.aByteArray14[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class28 local40 = arg0.method1135(local6 + 1, local12);
					local6 = -1;
					if (local40.method1107(Static68.aClass28_2090)) {
						local20 = 60;
					} else if (local40.method1107(Static68.aClass28_2089)) {
						local20 = 62;
					} else if (local40.method1107(Static68.aClass28_2085)) {
						local20 = 160;
					} else if (local40.method1107(Static68.aClass28_2080)) {
						local20 = 173;
					} else if (local40.method1107(Static68.aClass28_2084)) {
						local20 = 215;
					} else if (local40.method1107(Static68.aClass28_2070)) {
						local20 = 128;
					} else if (local40.method1107(Static68.aClass28_2086)) {
						local20 = 169;
					} else {
						if (!local40.method1107(Static68.aClass28_2078)) {
							if (local40.method1132(Static68.aClass28_2079)) {
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
									local137 = local40.method1131(4).method1139();
									@Pc(141) Class2_Sub4_Sub3_Sub3 local141 = Static68.aClass2_Sub4_Sub3_Sub3Array8[local137];
									if (Static68.anInt3541 == 256) {
										local141.method2242(arg1 + local117, local4 + this.anInt3536 - local141.anInt3235 + local126);
									} else {
										local141.method2239(arg1 + local117, local4 + this.anInt3536 - local141.anInt3235 + local126, Static68.anInt3541);
									}
									arg1 += local141.anInt3238;
									local8 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method2465(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray47 != null && local8 != -1) {
						arg1 += this.aByteArray47[(local8 << 8) + local20];
					}
					@Pc(213) int local213 = this.anIntArray330[local20];
					local117 = this.anIntArray332[local20];
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
						if (Static68.anInt3543 > 0) {
							Static68.anInt3540 += Static68.anInt3543;
							arg1 += Static68.anInt3540 >> 8;
							Static68.anInt3540 &= 0xFF;
						}
					} else if (Static68.anInt3541 == 256) {
						if (Static68.anInt3542 != -1) {
							this.method2456(local20, arg1 + this.anIntArray333[local20] + local126 + 1, local4 + this.anIntArray331[local20] + 1 + local137, local213, local117, Static68.anInt3542);
						}
						this.method2466(local20, arg1 + this.anIntArray333[local20] + local126, local4 + this.anIntArray331[local20] + local137, local213, local117, Static68.anInt3532);
					} else {
						if (Static68.anInt3542 != -1) {
							this.method2463(local20, arg1 + this.anIntArray333[local20] + local126 + 1, local4 + this.anIntArray331[local20] + 1 + local137, local213, local117, Static68.anInt3542, Static68.anInt3541);
						}
						this.method2473(local20, arg1 + this.anIntArray333[local20] + local126, local4 + this.anIntArray331[local20] + local137, local213, local117, Static68.anInt3532, Static68.anInt3541);
					}
					@Pc(370) int local370 = this.anIntArray329[local20];
					if (Static68.anInt3533 != -1) {
						Static161.method2797(arg1, local4 + (int) ((double) this.anInt3536 * 0.7D), local370, Static68.anInt3533);
					}
					if (Static68.anInt3538 != -1) {
						Static161.method2797(arg1, local4 + this.anInt3536, local370, Static68.anInt3538);
					}
					arg1 += local370;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([B)V")
	private void method2450(@OriginalArg(0) byte[] arg0) {
		this.anIntArray329 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray329.length; local9++) {
				this.anIntArray329[local9] = arg0[local9] & 0xFF;
			}
			this.anInt3536 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray329[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray47 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray47[(local182 << 8) + local150] = (byte) Static68.method2467(local93, local136, local58, this.anIntArray329, local55, local182, local150);
					}
				}
			}
		}
		this.anInt3536 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;[I[Lclient!gg;)I")
	private int method2451(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class28[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class28 local11 = Static87.method1563(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1121();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1112(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class28 local55 = arg0.method1135(local19 + 1, local29);
					local19 = -1;
					local11.method1119(60);
					local11.method1109(local55);
					local11.method1119(62);
					if (local55.method1107(Static68.aClass28_2088)) {
						arg2[local23++] = local11.method1135(local7, local11.method1121());
						local7 = local11.method1121();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1107(Static68.aClass28_2090)) {
						local5 += this.method2460(60);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1107(Static68.aClass28_2089)) {
						local5 += this.method2460(62);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1107(Static68.aClass28_2085)) {
						local5 += this.method2460(160);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1107(Static68.aClass28_2080)) {
						local5 += this.method2460(173);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1107(Static68.aClass28_2084)) {
						local5 += this.method2460(215);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1107(Static68.aClass28_2070)) {
						local5 += this.method2460(128);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1107(Static68.aClass28_2086)) {
						local5 += this.method2460(169);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1107(Static68.aClass28_2078)) {
						local5 += this.method2460(174);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1132(Static68.aClass28_2079)) {
						try {
							@Pc(359) int local359 = local55.method1131(4).method1139();
							local5 += Static68.aClass2_Sub4_Sub3_Sub3Array8[local359].anInt3238;
							local21 = -1;
						} catch (@Pc(370) Exception local370) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1119(local35);
						local5 += this.method2460(local35);
						if (this.aByteArray47 != null && local21 != -1) {
							local5 += this.aByteArray47[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1121();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1135(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1121();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1121() > local7) {
			arg2[local23++] = local11.method1135(local7, local11.method1121());
		}
		return local23;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gg;IIIII)V")
	public final void method2452(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2468(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1718];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1718; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2448(arg0, arg1 - this.method2475(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;IIIILjava/util/Random;I)I")
	public final int method2453(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2446(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1718];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1718; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method2448(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;IIII)V")
	public final void method2454(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2468(arg3, arg4);
			this.method2461(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;I)I")
	public final int method2455(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		return this.method2451(arg0, new int[] { arg1 }, Static68.aClass28Array53);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(IIIIII)V")
	private void method2456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static161.anInt3975;
		@Pc(9) int local9 = Static161.anInt3975 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static161.anInt3979) {
			local20 = Static161.anInt3979 - arg2;
			arg4 -= local20;
			arg2 = Static161.anInt3979;
			local13 = local20 * arg3;
			local5 += local20 * Static161.anInt3975;
		}
		if (arg2 + arg4 > Static161.anInt3977) {
			arg4 -= arg2 + arg4 - Static161.anInt3977;
		}
		if (arg1 < Static161.anInt3976) {
			local20 = Static161.anInt3976 - arg1;
			arg3 -= local20;
			arg1 = Static161.anInt3976;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static161.anInt3978) {
			local20 = arg1 + arg3 - Static161.anInt3978;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static68.method2474(Static161.anIntArray365, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gg;IIII)V")
	public final void method2457(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2468(arg3, arg4);
			this.method2461(arg0, arg1 - this.method2475(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;IIIIIIIII)I")
	public final int method2458(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2462(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gg;I)I")
	public final int method2459(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2451(arg0, new int[] { arg1 }, Static68.aClass28Array53);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method2475(Static68.aClass28Array53[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)I")
	private int method2460(@OriginalArg(0) int arg0) {
		return this.anIntArray329[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;II)V")
	private void method2461(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt3536;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1718; local10++) {
			@Pc(18) int local18 = arg0.aByteArray14[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class28 local38 = arg0.method1135(local6 + 1, local10);
					local6 = -1;
					if (local38.method1107(Static68.aClass28_2090)) {
						local18 = 60;
					} else if (local38.method1107(Static68.aClass28_2089)) {
						local18 = 62;
					} else if (local38.method1107(Static68.aClass28_2085)) {
						local18 = 160;
					} else if (local38.method1107(Static68.aClass28_2080)) {
						local18 = 173;
					} else if (local38.method1107(Static68.aClass28_2084)) {
						local18 = 215;
					} else if (local38.method1107(Static68.aClass28_2070)) {
						local18 = 128;
					} else if (local38.method1107(Static68.aClass28_2086)) {
						local18 = 169;
					} else {
						if (!local38.method1107(Static68.aClass28_2078)) {
							if (local38.method1132(Static68.aClass28_2079)) {
								try {
									local116 = local38.method1131(4).method1139();
									@Pc(120) Class2_Sub4_Sub3_Sub3 local120 = Static68.aClass2_Sub4_Sub3_Sub3Array8[local116];
									if (Static68.anInt3541 == 256) {
										local120.method2242(arg1, local4 + this.anInt3536 - local120.anInt3235);
									} else {
										local120.method2239(arg1, local4 + this.anInt3536 - local120.anInt3235, Static68.anInt3541);
									}
									arg1 += local120.anInt3238;
									local8 = -1;
								} catch (@Pc(154) Exception local154) {
								}
							} else {
								this.method2465(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray47 != null && local8 != -1) {
						arg1 += this.aByteArray47[(local8 << 8) + local18];
					}
					@Pc(184) int local184 = this.anIntArray330[local18];
					local116 = this.anIntArray332[local18];
					if (local18 == 32) {
						if (Static68.anInt3543 > 0) {
							Static68.anInt3540 += Static68.anInt3543;
							arg1 += Static68.anInt3540 >> 8;
							Static68.anInt3540 &= 0xFF;
						}
					} else if (Static68.anInt3541 == 256) {
						if (Static68.anInt3542 != -1) {
							this.method2456(local18, arg1 + this.anIntArray333[local18] + 1, local4 + this.anIntArray331[local18] + 1, local184, local116, Static68.anInt3542);
						}
						this.method2466(local18, arg1 + this.anIntArray333[local18], local4 + this.anIntArray331[local18], local184, local116, Static68.anInt3532);
					} else {
						if (Static68.anInt3542 != -1) {
							this.method2463(local18, arg1 + this.anIntArray333[local18] + 1, local4 + this.anIntArray331[local18] + 1, local184, local116, Static68.anInt3542, Static68.anInt3541);
						}
						this.method2473(local18, arg1 + this.anIntArray333[local18], local4 + this.anIntArray331[local18], local184, local116, Static68.anInt3532, Static68.anInt3541);
					}
					@Pc(306) int local306 = this.anIntArray329[local18];
					if (Static68.anInt3533 != -1) {
						Static161.method2797(arg1, local4 + (int) ((double) this.anInt3536 * 0.7D), local306, Static68.anInt3533);
					}
					if (Static68.anInt3538 != -1) {
						Static161.method2797(arg1, local4 + this.anInt3536 + 1, local306, Static68.anInt3538);
					}
					arg1 += local306;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;IIIIIIIIII)I")
	private int method2462(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2446(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt3536;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt3537 + this.anInt3539 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2451(arg0, local20, Static68.aClass28Array53);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt3537;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt3537 + (arg4 - this.anInt3537 - this.anInt3539 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt3539 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt3537 - this.anInt3539 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt3537 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method2461(Static68.aClass28Array53[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method2461(Static68.aClass28Array53[local118], arg1 + (arg3 - this.method2475(Static68.aClass28Array53[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2461(Static68.aClass28Array53[local118], arg1 + arg3 - this.method2475(Static68.aClass28Array53[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method2461(Static68.aClass28Array53[local118], arg1, local57);
			} else {
				this.method2469(Static68.aClass28Array53[local118], arg3);
				this.method2461(Static68.aClass28Array53[local118], arg1, local57);
				Static68.anInt3543 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)V")
	private void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static161.anInt3975;
		@Pc(9) int local9 = Static161.anInt3975 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static161.anInt3979) {
			local20 = Static161.anInt3979 - arg2;
			arg4 -= local20;
			arg2 = Static161.anInt3979;
			local13 = local20 * arg3;
			local5 += local20 * Static161.anInt3975;
		}
		if (arg2 + arg4 > Static161.anInt3977) {
			arg4 -= arg2 + arg4 - Static161.anInt3977;
		}
		if (arg1 < Static161.anInt3976) {
			local20 = Static161.anInt3976 - arg1;
			arg3 -= local20;
			arg1 = Static161.anInt3976;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static161.anInt3978) {
			local20 = arg1 + arg3 - Static161.anInt3978;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static68.method2471(Static161.anIntArray365, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;IIIIII)V")
	public final void method2464(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2468(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1718];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1718; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method2448(arg0, arg1 - this.method2475(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gg;)V")
	private void method2465(@OriginalArg(0) Class28 arg0) {
		try {
			if (arg0.method1132(Static68.aClass28_2075)) {
				Static68.anInt3532 = arg0.method1131(4).method1134(16);
				return;
			}
			if (arg0.method1107(Static68.aClass28_2076)) {
				Static68.anInt3532 = Static68.anInt3535;
				return;
			}
			if (arg0.method1132(Static68.aClass28_2072)) {
				Static68.anInt3533 = arg0.method1131(4).method1134(16);
				return;
			}
			if (arg0.method1107(Static68.aClass28_2073)) {
				Static68.anInt3533 = 8388608;
				return;
			}
			if (arg0.method1107(Static68.aClass28_2074)) {
				Static68.anInt3533 = -1;
				return;
			}
			if (arg0.method1132(Static68.aClass28_2083)) {
				Static68.anInt3538 = arg0.method1131(2).method1134(16);
				return;
			}
			if (arg0.method1107(Static68.aClass28_2087)) {
				Static68.anInt3538 = 0;
				return;
			}
			if (arg0.method1107(Static68.aClass28_2082)) {
				Static68.anInt3538 = -1;
				return;
			}
			if (arg0.method1132(Static68.aClass28_2081)) {
				Static68.anInt3542 = arg0.method1131(5).method1134(16);
				return;
			}
			if (arg0.method1107(Static68.aClass28_2077)) {
				Static68.anInt3542 = 0;
				return;
			}
			if (arg0.method1107(Static68.aClass28_2071)) {
				Static68.anInt3542 = Static68.anInt3534;
				return;
			}
			if (arg0.method1107(Static68.aClass28_2088)) {
				this.method2446(Static68.anInt3535, Static68.anInt3534, Static68.anInt3531);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	private void method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static68.anInt3533 = -1;
		Static68.anInt3538 = -1;
		Static68.anInt3534 = arg1;
		Static68.anInt3542 = arg1;
		Static68.anInt3535 = arg0;
		Static68.anInt3532 = arg0;
		Static68.anInt3531 = 256;
		Static68.anInt3541 = 256;
		Static68.anInt3543 = 0;
		Static68.anInt3540 = 0;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!gg;I)V")
	private void method2469(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1121(); local5++) {
			@Pc(11) int local11 = arg0.method1112(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static68.anInt3543 = (arg1 - this.method2475(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!gg;IIII)V")
	public final void method2472(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2468(arg3, arg4);
			this.method2461(arg0, arg1 - this.method2475(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!gg;)I")
	public final int method2475(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1718; local11++) {
			@Pc(19) int local19 = arg0.aByteArray14[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class28 local39 = arg0.method1135(local5 + 1, local11);
					local5 = -1;
					if (local39.method1107(Static68.aClass28_2090)) {
						local19 = 60;
					} else if (local39.method1107(Static68.aClass28_2089)) {
						local19 = 62;
					} else if (local39.method1107(Static68.aClass28_2085)) {
						local19 = 160;
					} else if (local39.method1107(Static68.aClass28_2080)) {
						local19 = 173;
					} else if (local39.method1107(Static68.aClass28_2084)) {
						local19 = 215;
					} else if (local39.method1107(Static68.aClass28_2070)) {
						local19 = 128;
					} else if (local39.method1107(Static68.aClass28_2086)) {
						local19 = 169;
					} else {
						if (!local39.method1107(Static68.aClass28_2078)) {
							if (local39.method1132(Static68.aClass28_2079)) {
								try {
									@Pc(117) int local117 = local39.method1131(4).method1139();
									local9 += Static68.aClass2_Sub4_Sub3_Sub3Array8[local117].anInt3238;
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
					local9 += this.anIntArray329[local19];
					if (this.aByteArray47 != null && local7 != -1) {
						local9 += this.aByteArray47[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}
}
