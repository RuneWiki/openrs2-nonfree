import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public abstract class Class2_Sub3_Sub2_Sub4 extends Class2_Sub3_Sub2 {

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!vh", name = "gb", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!vh", name = "Q", descriptor = "[[B")
	protected byte[][] aByteArrayArray9 = new byte[256][];

	@OriginalMember(owner = "client!vh", name = "nb", descriptor = "I")
	public int anInt3712 = 0;

	@OriginalMember(owner = "client!vh", name = "I", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!vh", name = "ib", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!vh", name = "X", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!vh", name = "O", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
	private int anInt3703;

	@OriginalMember(owner = "client!vh", name = "fb", descriptor = "I")
	private int anInt3709;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub3_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray371 = arg1;
		this.anIntArray375 = arg2;
		this.anIntArray373 = arg3;
		this.anIntArray372 = arg4;
		this.method2514(arg0);
		this.aByteArrayArray9 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray375[local32] < local28 && this.anIntArray372[local32] != 0) {
				local28 = this.anIntArray375[local32];
			}
			if (this.anIntArray375[local32] + this.anIntArray372[local32] > local30) {
				local30 = this.anIntArray375[local32] + this.anIntArray372[local32];
			}
		}
		this.anInt3703 = this.anInt3712 - local28;
		this.anInt3709 = local30 - this.anInt3712;
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.method2514(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;IIIILjava/util/Random;I)I")
	public final int method2502(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2517(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt165];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt165; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method2527(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;I)I")
	public final int method2504(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		return this.method2505(arg0, new int[] { arg1 }, Static175.aClass6Array21);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;[I[Lclient!ai;)I")
	private int method2505(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class6[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class6 local11 = Static7.method83(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method107();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method128(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class6 local55 = arg0.method111(local29, local19 + 1);
					local19 = -1;
					local11.method123(60);
					local11.method117(local55);
					local11.method123(62);
					if (local55.method131(Static175.aClass6_1093)) {
						arg2[local23++] = local11.method111(local11.method107(), local7);
						local7 = local11.method107();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method131(Static175.aClass6_1105)) {
						local5 += this.method2513(60);
						if (this.aByteArray48 != null && local21 != -1) {
							local5 += this.aByteArray48[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method131(Static175.aClass6_1103)) {
						local5 += this.method2513(62);
						if (this.aByteArray48 != null && local21 != -1) {
							local5 += this.aByteArray48[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method103(Static175.aClass6_1097)) {
						try {
							@Pc(173) int local173 = local55.method119(4).method122();
							local5 += Static175.aClass2_Sub3_Sub2_Sub3Array9[local173].anInt3618;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method123(local35);
						local5 += this.method2513(local35);
						if (this.aByteArray48 != null && local21 != -1) {
							local5 += this.aByteArray48[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method107();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method111(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method107();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method107() > local7) {
			arg2[local23++] = local11.method111(local11.method107(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
	private void method2506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static175.anInt3704 = -1;
		Static175.anInt3708 = -1;
		Static175.anInt3702 = arg1;
		Static175.anInt3710 = arg1;
		Static175.anInt3711 = arg0;
		Static175.anInt3706 = arg0;
		Static175.anInt3713 = 256;
		Static175.anInt3707 = 256;
		Static175.anInt3705 = 0;
		Static175.anInt3701 = 0;
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method2507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;IIII)V")
	public final void method2508(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2506(arg3, arg4);
			this.method2519(arg0, arg1 - this.method2516(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!ai;IIII)V")
	public final void method2511(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2506(arg3, arg4);
			this.method2519(arg0, arg1 - this.method2516(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lclient!ai;IIII)V")
	public final void method2512(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2506(arg3, arg4);
			this.method2519(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)I")
	private int method2513(@OriginalArg(0) int arg0) {
		return this.anIntArray374[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([B)V")
	private void method2514(@OriginalArg(0) byte[] arg0) {
		this.anIntArray374 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray374.length; local9++) {
				this.anIntArray374[local9] = arg0[local9] & 0xFF;
			}
			this.anInt3712 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray374[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray48 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray48[(local182 << 8) + local150] = (byte) Static175.method2526(local93, local136, local58, this.anIntArray374, local55, local182, local150);
					}
				}
			}
		}
		this.anInt3712 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!ai;)V")
	private void method2515(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.method103(Static175.aClass6_1094)) {
				Static175.anInt3706 = arg0.method119(4).method133(16);
				return;
			}
			if (arg0.method131(Static175.aClass6_1100)) {
				Static175.anInt3706 = Static175.anInt3711;
				return;
			}
			if (arg0.method103(Static175.aClass6_1096)) {
				Static175.anInt3704 = arg0.method119(4).method133(16);
				return;
			}
			if (arg0.method131(Static175.aClass6_1106)) {
				Static175.anInt3704 = 8388608;
				return;
			}
			if (arg0.method131(Static175.aClass6_1102)) {
				Static175.anInt3704 = -1;
				return;
			}
			if (arg0.method103(Static175.aClass6_1098)) {
				Static175.anInt3708 = arg0.method119(2).method133(16);
				return;
			}
			if (arg0.method131(Static175.aClass6_1099)) {
				Static175.anInt3708 = 0;
				return;
			}
			if (arg0.method131(Static175.aClass6_1101)) {
				Static175.anInt3708 = -1;
				return;
			}
			if (arg0.method103(Static175.aClass6_1095)) {
				Static175.anInt3710 = arg0.method119(5).method133(16);
				return;
			}
			if (arg0.method131(Static175.aClass6_1092)) {
				Static175.anInt3710 = 0;
				return;
			}
			if (arg0.method131(Static175.aClass6_1104)) {
				Static175.anInt3710 = Static175.anInt3702;
				return;
			}
			if (arg0.method131(Static175.aClass6_1093)) {
				this.method2517(Static175.anInt3711, Static175.anInt3702, Static175.anInt3713);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lclient!ai;)I")
	public final int method2516(@OriginalArg(0) Class6 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt165; local11++) {
			@Pc(19) int local19 = arg0.aByteArray2[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class6 local39 = arg0.method111(local11, local5 + 1);
					local5 = -1;
					if (local39.method131(Static175.aClass6_1105)) {
						local19 = 60;
					} else {
						if (!local39.method131(Static175.aClass6_1103)) {
							if (local39.method103(Static175.aClass6_1097)) {
								try {
									@Pc(69) int local69 = local39.method119(4).method122();
									local9 += Static175.aClass2_Sub3_Sub2_Sub3Array9[local69].anInt3618;
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
					local9 += this.anIntArray374[local19];
					if (this.aByteArray48 != null && local7 != -1) {
						local9 += this.aByteArray48[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	private void method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static175.anInt3704 = -1;
		Static175.anInt3708 = -1;
		Static175.anInt3702 = arg1;
		Static175.anInt3710 = arg1;
		Static175.anInt3711 = arg0;
		Static175.anInt3706 = arg0;
		Static175.anInt3713 = arg2;
		Static175.anInt3707 = arg2;
		Static175.anInt3705 = 0;
		Static175.anInt3701 = 0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;II)V")
	private void method2519(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt3712;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt165; local10++) {
			@Pc(18) int local18 = arg0.aByteArray2[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class6 local38 = arg0.method111(local10, local6 + 1);
					local6 = -1;
					if (local38.method131(Static175.aClass6_1105)) {
						local18 = 60;
					} else {
						if (!local38.method131(Static175.aClass6_1103)) {
							if (local38.method103(Static175.aClass6_1097)) {
								try {
									local68 = local38.method119(4).method122();
									@Pc(72) Class2_Sub3_Sub2_Sub3 local72 = Static175.aClass2_Sub3_Sub2_Sub3Array9[local68];
									if (Static175.anInt3707 == 256) {
										local72.method2398(arg1, local4 + this.anInt3712 - local72.anInt3617);
									} else {
										local72.method2401(arg1, local4 + this.anInt3712 - local72.anInt3617, Static175.anInt3707);
									}
									arg1 += local72.anInt3618;
									local8 = -1;
								} catch (@Pc(106) Exception local106) {
								}
							} else {
								this.method2515(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray48 != null && local8 != -1) {
						arg1 += this.aByteArray48[(local8 << 8) + local18];
					}
					@Pc(136) int local136 = this.anIntArray373[local18];
					local68 = this.anIntArray372[local18];
					if (local18 == 32) {
						if (Static175.anInt3705 > 0) {
							Static175.anInt3701 += Static175.anInt3705;
							arg1 += Static175.anInt3701 >> 8;
							Static175.anInt3701 &= 0xFF;
						}
					} else if (Static175.anInt3707 == 256) {
						if (Static175.anInt3710 != -1) {
							this.method2524(local18, arg1 + this.anIntArray371[local18] + 1, local4 + this.anIntArray375[local18] + 1, local136, local68, Static175.anInt3710);
						}
						this.method2507(local18, arg1 + this.anIntArray371[local18], local4 + this.anIntArray375[local18], local136, local68, Static175.anInt3706);
					} else {
						if (Static175.anInt3710 != -1) {
							this.method2531(local18, arg1 + this.anIntArray371[local18] + 1, local4 + this.anIntArray375[local18] + 1, local136, local68, Static175.anInt3710, Static175.anInt3707);
						}
						this.method2518(local18, arg1 + this.anIntArray371[local18], local4 + this.anIntArray375[local18], local136, local68, Static175.anInt3706, Static175.anInt3707);
					}
					@Pc(258) int local258 = this.anIntArray374[local18];
					if (Static175.anInt3704 != -1) {
						Static53.method2499(arg1, local4 + (int) ((double) this.anInt3712 * 0.7D), local258, Static175.anInt3704);
					}
					if (Static175.anInt3708 != -1) {
						Static53.method2499(arg1, local4 + this.anInt3712 + 1, local258, Static175.anInt3708);
					}
					arg1 += local258;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;IIIIIIIIII)I")
	private int method2520(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2517(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt3712;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt3703 + this.anInt3709 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2505(arg0, local20, Static175.aClass6Array21);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt3703;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt3703 + (arg4 - this.anInt3703 - this.anInt3709 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt3709 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt3703 - this.anInt3709 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt3703 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method2519(Static175.aClass6Array21[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method2519(Static175.aClass6Array21[local118], arg1 + (arg3 - this.method2516(Static175.aClass6Array21[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2519(Static175.aClass6Array21[local118], arg1 + arg3 - this.method2516(Static175.aClass6Array21[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method2519(Static175.aClass6Array21[local118], arg1, local57);
			} else {
				this.method2521(Static175.aClass6Array21[local118], arg3);
				this.method2519(Static175.aClass6Array21[local118], arg1, local57);
				Static175.anInt3705 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!ai;I)V")
	private void method2521(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method107(); local5++) {
			@Pc(11) int local11 = arg0.method128(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static175.anInt3705 = (arg1 - this.method2516(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;IIIIIIIII)I")
	public final int method2522(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2520(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lclient!ai;I)I")
	public final int method2523(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2505(arg0, new int[] { arg1 }, Static175.aClass6Array21);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method2516(Static175.aClass6Array21[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(IIIIII)V")
	private void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static53.anInt3699;
		@Pc(9) int local9 = Static53.anInt3699 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static53.anInt3698) {
			local20 = Static53.anInt3698 - arg2;
			arg4 -= local20;
			arg2 = Static53.anInt3698;
			local13 = local20 * arg3;
			local5 += local20 * Static53.anInt3699;
		}
		if (arg2 + arg4 > Static53.anInt3697) {
			arg4 -= arg2 + arg4 - Static53.anInt3697;
		}
		if (arg1 < Static53.anInt3700) {
			local20 = Static53.anInt3700 - arg1;
			arg3 -= local20;
			arg1 = Static53.anInt3700;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static53.anInt3696) {
			local20 = arg1 + arg3 - Static53.anInt3696;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static175.method2529(Static53.anIntArray370, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;IIIIII)V")
	public final void method2525(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2506(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt165];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt165; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method2527(arg0, arg1 - this.method2516(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;II[I[I)V")
	private void method2527(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt3712;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt165; local12++) {
			@Pc(20) int local20 = arg0.aByteArray2[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class6 local40 = arg0.method111(local12, local6 + 1);
					local6 = -1;
					if (local40.method131(Static175.aClass6_1105)) {
						local20 = 60;
					} else {
						if (!local40.method131(Static175.aClass6_1103)) {
							if (local40.method103(Static175.aClass6_1097)) {
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
									local89 = local40.method119(4).method122();
									@Pc(93) Class2_Sub3_Sub2_Sub3 local93 = Static175.aClass2_Sub3_Sub2_Sub3Array9[local89];
									if (Static175.anInt3707 == 256) {
										local93.method2398(arg1 + local69, local4 + this.anInt3712 - local93.anInt3617 + local78);
									} else {
										local93.method2401(arg1 + local69, local4 + this.anInt3712 - local93.anInt3617 + local78, Static175.anInt3707);
									}
									arg1 += local93.anInt3618;
									local8 = -1;
								} catch (@Pc(135) Exception local135) {
								}
							} else {
								this.method2515(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray48 != null && local8 != -1) {
						arg1 += this.aByteArray48[(local8 << 8) + local20];
					}
					@Pc(165) int local165 = this.anIntArray373[local20];
					local69 = this.anIntArray372[local20];
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
						if (Static175.anInt3705 > 0) {
							Static175.anInt3701 += Static175.anInt3705;
							arg1 += Static175.anInt3701 >> 8;
							Static175.anInt3701 &= 0xFF;
						}
					} else if (Static175.anInt3707 == 256) {
						if (Static175.anInt3710 != -1) {
							this.method2524(local20, arg1 + this.anIntArray371[local20] + local78 + 1, local4 + this.anIntArray375[local20] + 1 + local89, local165, local69, Static175.anInt3710);
						}
						this.method2507(local20, arg1 + this.anIntArray371[local20] + local78, local4 + this.anIntArray375[local20] + local89, local165, local69, Static175.anInt3706);
					} else {
						if (Static175.anInt3710 != -1) {
							this.method2531(local20, arg1 + this.anIntArray371[local20] + local78 + 1, local4 + this.anIntArray375[local20] + 1 + local89, local165, local69, Static175.anInt3710, Static175.anInt3707);
						}
						this.method2518(local20, arg1 + this.anIntArray371[local20] + local78, local4 + this.anIntArray375[local20] + local89, local165, local69, Static175.anInt3706, Static175.anInt3707);
					}
					@Pc(322) int local322 = this.anIntArray374[local20];
					if (Static175.anInt3704 != -1) {
						Static53.method2499(arg1, local4 + (int) ((double) this.anInt3712 * 0.7D), local322, Static175.anInt3704);
					}
					if (Static175.anInt3708 != -1) {
						Static53.method2499(arg1, local4 + this.anInt3712, local322, Static175.anInt3708);
					}
					arg1 += local322;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;IIIII)V")
	public final void method2528(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2506(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt165];
		@Pc(14) int[] local14 = new int[arg0.anInt165];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt165; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2527(arg0, arg1 - this.method2516(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!ai;IIIII)V")
	public final void method2530(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2506(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt165];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt165; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2527(arg0, arg1 - this.method2516(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIIIII)V")
	private void method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static53.anInt3699;
		@Pc(9) int local9 = Static53.anInt3699 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static53.anInt3698) {
			local20 = Static53.anInt3698 - arg2;
			arg4 -= local20;
			arg2 = Static53.anInt3698;
			local13 = local20 * arg3;
			local5 += local20 * Static53.anInt3699;
		}
		if (arg2 + arg4 > Static53.anInt3697) {
			arg4 -= arg2 + arg4 - Static53.anInt3697;
		}
		if (arg1 < Static53.anInt3700) {
			local20 = Static53.anInt3700 - arg1;
			arg3 -= local20;
			arg1 = Static53.anInt3700;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static53.anInt3696) {
			local20 = arg1 + arg3 - Static53.anInt3696;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static175.method2503(Static53.anIntArray370, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
