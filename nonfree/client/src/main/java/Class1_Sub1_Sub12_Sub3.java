import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public abstract class Class1_Sub1_Sub12_Sub3 extends Class1_Sub1_Sub12 {

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!qf", name = "sb", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!qf", name = "jb", descriptor = "[[B")
	protected byte[][] aByteArrayArray11 = new byte[256][];

	@OriginalMember(owner = "client!qf", name = "qb", descriptor = "I")
	public int anInt4238 = 0;

	@OriginalMember(owner = "client!qf", name = "ob", descriptor = "[I")
	private int[] anIntArray591;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "[I")
	private int[] anIntArray587;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "[I")
	private int[] anIntArray590;

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "[I")
	private int[] anIntArray589;

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
	private int anInt4236;

	@OriginalMember(owner = "client!qf", name = "yb", descriptor = "I")
	private int anInt4242;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub1_Sub12_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray591 = arg1;
		this.anIntArray587 = arg2;
		this.anIntArray590 = arg3;
		this.anIntArray589 = arg4;
		this.method3046(arg0);
		this.aByteArrayArray11 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray587[local32] < local28 && this.anIntArray589[local32] != 0) {
				local28 = this.anIntArray587[local32];
			}
			if (this.anIntArray587[local32] + this.anIntArray589[local32] > local30) {
				local30 = this.anIntArray587[local32] + this.anIntArray589[local32];
			}
		}
		this.anInt4236 = this.anInt4238 - local28;
		this.anInt4242 = local30 - this.anInt4238;
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub12_Sub3(@OriginalArg(0) byte[] arg0) {
		this.method3046(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;IIIII)V")
	public final void method3035(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3050(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1053];
		@Pc(14) int[] local14 = new int[arg0.anInt1053];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1053; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3059(arg0, arg1 - this.method3056(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)I")
	private int method3036(@OriginalArg(0) int arg0) {
		return this.anIntArray588[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;IIIIII)V")
	public final void method3037(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3050(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1053];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1053; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method3059(arg0, arg1 - this.method3056(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(IIIIII)V")
	private void method3038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static150.anInt4227;
		@Pc(9) int local9 = Static150.anInt4227 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static150.anInt4225) {
			local20 = Static150.anInt4225 - arg2;
			arg4 -= local20;
			arg2 = Static150.anInt4225;
			local13 = local20 * arg3;
			local5 += local20 * Static150.anInt4227;
		}
		if (arg2 + arg4 > Static150.anInt4228) {
			arg4 -= arg2 + arg4 - Static150.anInt4228;
		}
		if (arg1 < Static150.anInt4229) {
			local20 = Static150.anInt4229 - arg1;
			arg3 -= local20;
			arg1 = Static150.anInt4229;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static150.anInt4224) {
			local20 = arg1 + arg3 - Static150.anInt4224;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static136.method3054(Static150.anIntArray586, this.aByteArrayArray11[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;IIII)V")
	public final void method3039(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3050(arg3, arg4);
			this.method3042(arg0, arg1 - this.method3056(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;)V")
	private void method3040(@OriginalArg(0) Class23 arg0) {
		try {
			if (arg0.method634(Static136.aClass23_1624)) {
				Static136.anInt4234 = arg0.method632(4).method640(16);
				return;
			}
			if (arg0.method651(Static136.aClass23_1623)) {
				Static136.anInt4234 = Static136.anInt4241;
				return;
			}
			if (arg0.method634(Static136.aClass23_1626)) {
				Static136.anInt4239 = arg0.method632(4).method640(16);
				return;
			}
			if (arg0.method651(Static136.aClass23_1617)) {
				Static136.anInt4239 = 8388608;
				return;
			}
			if (arg0.method651(Static136.aClass23_1621)) {
				Static136.anInt4239 = -1;
				return;
			}
			if (arg0.method634(Static136.aClass23_1615)) {
				Static136.anInt4235 = arg0.method632(2).method640(16);
				return;
			}
			if (arg0.method651(Static136.aClass23_1614)) {
				Static136.anInt4235 = 0;
				return;
			}
			if (arg0.method651(Static136.aClass23_1616)) {
				Static136.anInt4235 = -1;
				return;
			}
			if (arg0.method634(Static136.aClass23_1625)) {
				Static136.anInt4231 = arg0.method632(5).method640(16);
				return;
			}
			if (arg0.method651(Static136.aClass23_1613)) {
				Static136.anInt4231 = 0;
				return;
			}
			if (arg0.method651(Static136.aClass23_1618)) {
				Static136.anInt4231 = Static136.anInt4230;
				return;
			}
			if (arg0.method651(Static136.aClass23_1620)) {
				this.method3060(Static136.anInt4241, Static136.anInt4230, Static136.anInt4232);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;I)I")
	public final int method3041(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		return this.method3047(arg0, new int[] { arg1 }, Static136.aClass23Array23);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;II)V")
	private void method3042(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt4238;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1053; local10++) {
			@Pc(18) int local18 = arg0.aByteArray10[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class23 local38 = arg0.method635(local6 + 1, local10);
					local6 = -1;
					if (local38.method651(Static136.aClass23_1622)) {
						local18 = 60;
					} else {
						if (!local38.method651(Static136.aClass23_1612)) {
							if (local38.method634(Static136.aClass23_1619)) {
								try {
									local68 = local38.method632(4).method658();
									@Pc(72) Class1_Sub1_Sub12_Sub4 local72 = Static136.aClass1_Sub1_Sub12_Sub4Array10[local68];
									if (Static136.anInt4237 == 256) {
										local72.method2746(arg1, local4 + this.anInt4238 - local72.anInt3903);
									} else {
										local72.method2747(arg1, local4 + this.anInt4238 - local72.anInt3903, Static136.anInt4237);
									}
									arg1 += local72.anInt3908;
									local8 = -1;
								} catch (@Pc(106) Exception local106) {
								}
							} else {
								this.method3040(local38);
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
					@Pc(136) int local136 = this.anIntArray590[local18];
					local68 = this.anIntArray589[local18];
					if (local18 == 32) {
						if (Static136.anInt4240 > 0) {
							Static136.anInt4233 += Static136.anInt4240;
							arg1 += Static136.anInt4233 >> 8;
							Static136.anInt4233 &= 0xFF;
						}
					} else if (Static136.anInt4237 == 256) {
						if (Static136.anInt4231 != -1) {
							this.method3038(local18, arg1 + this.anIntArray591[local18] + 1, local4 + this.anIntArray587[local18] + 1, local136, local68, Static136.anInt4231);
						}
						this.method3048(local18, arg1 + this.anIntArray591[local18], local4 + this.anIntArray587[local18], local136, local68, Static136.anInt4234);
					} else {
						if (Static136.anInt4231 != -1) {
							this.method3063(local18, arg1 + this.anIntArray591[local18] + 1, local4 + this.anIntArray587[local18] + 1, local136, local68, Static136.anInt4231, Static136.anInt4237);
						}
						this.method3061(local18, arg1 + this.anIntArray591[local18], local4 + this.anIntArray587[local18], local136, local68, Static136.anInt4234, Static136.anInt4237);
					}
					@Pc(258) int local258 = this.anIntArray588[local18];
					if (Static136.anInt4239 != -1) {
						Static150.method3018(arg1, local4 + (int) ((double) this.anInt4238 * 0.7D), local258, Static136.anInt4239);
					}
					if (Static136.anInt4235 != -1) {
						Static150.method3018(arg1, local4 + this.anInt4238 + 1, local258, Static136.anInt4235);
					}
					arg1 += local258;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;IIIIIIIIII)I")
	private int method3044(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method3060(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt4238;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt4236 + this.anInt4242 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method3047(arg0, local20, Static136.aClass23Array23);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt4236;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt4236 + (arg4 - this.anInt4236 - this.anInt4242 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt4242 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt4236 - this.anInt4242 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt4236 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method3042(Static136.aClass23Array23[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method3042(Static136.aClass23Array23[local118], arg1 + (arg3 - this.method3056(Static136.aClass23Array23[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method3042(Static136.aClass23Array23[local118], arg1 + arg3 - this.method3056(Static136.aClass23Array23[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method3042(Static136.aClass23Array23[local118], arg1, local57);
			} else {
				this.method3057(Static136.aClass23Array23[local118], arg3);
				this.method3042(Static136.aClass23Array23[local118], arg1, local57);
				Static136.anInt4240 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
	private void method3046(@OriginalArg(0) byte[] arg0) {
		this.anIntArray588 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray588.length; local9++) {
				this.anIntArray588[local9] = arg0[local9] & 0xFF;
			}
			this.anInt4238 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray588[local37] = arg0[local9++] & 0xFF;
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
						this.aByteArray48[(local182 << 8) + local150] = (byte) Static136.method3045(local93, local136, local58, this.anIntArray588, local55, local182, local150);
					}
				}
			}
		}
		this.anInt4238 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;[I[Lclient!ed;)I")
	private int method3047(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class23[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class23 local11 = Static38.method621(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method642();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method650(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class23 local55 = arg0.method635(local19 + 1, local29);
					local19 = -1;
					local11.method661(60);
					local11.method663(local55);
					local11.method661(62);
					if (local55.method651(Static136.aClass23_1620)) {
						arg2[local23++] = local11.method635(local7, local11.method642());
						local7 = local11.method642();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method651(Static136.aClass23_1622)) {
						local5 += this.method3036(60);
						if (this.aByteArray48 != null && local21 != -1) {
							local5 += this.aByteArray48[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method651(Static136.aClass23_1612)) {
						local5 += this.method3036(62);
						if (this.aByteArray48 != null && local21 != -1) {
							local5 += this.aByteArray48[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method634(Static136.aClass23_1619)) {
						try {
							@Pc(173) int local173 = local55.method632(4).method658();
							local5 += Static136.aClass1_Sub1_Sub12_Sub4Array10[local173].anInt3908;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method661(local35);
						local5 += this.method3036(local35);
						if (this.aByteArray48 != null && local21 != -1) {
							local5 += this.aByteArray48[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method642();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method635(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method642();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method642() > local7) {
			arg2[local23++] = local11.method635(local7, local11.method642());
		}
		return local23;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method3048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	private void method3050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static136.anInt4239 = -1;
		Static136.anInt4235 = -1;
		Static136.anInt4230 = arg1;
		Static136.anInt4231 = arg1;
		Static136.anInt4241 = arg0;
		Static136.anInt4234 = arg0;
		Static136.anInt4232 = 256;
		Static136.anInt4237 = 256;
		Static136.anInt4240 = 0;
		Static136.anInt4233 = 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;IIIIIIIII)I")
	public final int method3052(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method3044(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!ed;IIII)V")
	public final void method3053(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3050(arg3, arg4);
			this.method3042(arg0, arg1 - this.method3056(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;IIIILjava/util/Random;I)I")
	public final int method3055(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method3060(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1053];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1053; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method3059(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!ed;)I")
	public final int method3056(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1053; local11++) {
			@Pc(19) int local19 = arg0.aByteArray10[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class23 local39 = arg0.method635(local5 + 1, local11);
					local5 = -1;
					if (local39.method651(Static136.aClass23_1622)) {
						local19 = 60;
					} else {
						if (!local39.method651(Static136.aClass23_1612)) {
							if (local39.method634(Static136.aClass23_1619)) {
								try {
									@Pc(69) int local69 = local39.method632(4).method658();
									local9 += Static136.aClass1_Sub1_Sub12_Sub4Array10[local69].anInt3908;
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
					local9 += this.anIntArray588[local19];
					if (this.aByteArray48 != null && local7 != -1) {
						local9 += this.aByteArray48[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!ed;I)V")
	private void method3057(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method642(); local5++) {
			@Pc(11) int local11 = arg0.method650(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static136.anInt4240 = (arg1 - this.method3056(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!ed;IIII)V")
	public final void method3058(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3050(arg3, arg4);
			this.method3042(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ed;II[I[I)V")
	private void method3059(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt4238;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1053; local12++) {
			@Pc(20) int local20 = arg0.aByteArray10[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class23 local40 = arg0.method635(local6 + 1, local12);
					local6 = -1;
					if (local40.method651(Static136.aClass23_1622)) {
						local20 = 60;
					} else {
						if (!local40.method651(Static136.aClass23_1612)) {
							if (local40.method634(Static136.aClass23_1619)) {
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
									local89 = local40.method632(4).method658();
									@Pc(93) Class1_Sub1_Sub12_Sub4 local93 = Static136.aClass1_Sub1_Sub12_Sub4Array10[local89];
									if (Static136.anInt4237 == 256) {
										local93.method2746(arg1 + local69, local4 + this.anInt4238 - local93.anInt3903 + local78);
									} else {
										local93.method2747(arg1 + local69, local4 + this.anInt4238 - local93.anInt3903 + local78, Static136.anInt4237);
									}
									arg1 += local93.anInt3908;
									local8 = -1;
								} catch (@Pc(135) Exception local135) {
								}
							} else {
								this.method3040(local40);
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
					@Pc(165) int local165 = this.anIntArray590[local20];
					local69 = this.anIntArray589[local20];
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
						if (Static136.anInt4240 > 0) {
							Static136.anInt4233 += Static136.anInt4240;
							arg1 += Static136.anInt4233 >> 8;
							Static136.anInt4233 &= 0xFF;
						}
					} else if (Static136.anInt4237 == 256) {
						if (Static136.anInt4231 != -1) {
							this.method3038(local20, arg1 + this.anIntArray591[local20] + local78 + 1, local4 + this.anIntArray587[local20] + 1 + local89, local165, local69, Static136.anInt4231);
						}
						this.method3048(local20, arg1 + this.anIntArray591[local20] + local78, local4 + this.anIntArray587[local20] + local89, local165, local69, Static136.anInt4234);
					} else {
						if (Static136.anInt4231 != -1) {
							this.method3063(local20, arg1 + this.anIntArray591[local20] + local78 + 1, local4 + this.anIntArray587[local20] + 1 + local89, local165, local69, Static136.anInt4231, Static136.anInt4237);
						}
						this.method3061(local20, arg1 + this.anIntArray591[local20] + local78, local4 + this.anIntArray587[local20] + local89, local165, local69, Static136.anInt4234, Static136.anInt4237);
					}
					@Pc(322) int local322 = this.anIntArray588[local20];
					if (Static136.anInt4239 != -1) {
						Static150.method3018(arg1, local4 + (int) ((double) this.anInt4238 * 0.7D), local322, Static136.anInt4239);
					}
					if (Static136.anInt4235 != -1) {
						Static150.method3018(arg1, local4 + this.anInt4238, local322, Static136.anInt4235);
					}
					arg1 += local322;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V")
	private void method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static136.anInt4239 = -1;
		Static136.anInt4235 = -1;
		Static136.anInt4230 = arg1;
		Static136.anInt4231 = arg1;
		Static136.anInt4241 = arg0;
		Static136.anInt4234 = arg0;
		Static136.anInt4232 = arg2;
		Static136.anInt4237 = arg2;
		Static136.anInt4240 = 0;
		Static136.anInt4233 = 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method3061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!ed;I)I")
	public final int method3062(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method3047(arg0, new int[] { arg1 }, Static136.aClass23Array23);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method3056(Static136.aClass23Array23[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)V")
	private void method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static150.anInt4227;
		@Pc(9) int local9 = Static150.anInt4227 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static150.anInt4225) {
			local20 = Static150.anInt4225 - arg2;
			arg4 -= local20;
			arg2 = Static150.anInt4225;
			local13 = local20 * arg3;
			local5 += local20 * Static150.anInt4227;
		}
		if (arg2 + arg4 > Static150.anInt4228) {
			arg4 -= arg2 + arg4 - Static150.anInt4228;
		}
		if (arg1 < Static150.anInt4229) {
			local20 = Static150.anInt4229 - arg1;
			arg3 -= local20;
			arg1 = Static150.anInt4229;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static150.anInt4224) {
			local20 = arg1 + arg3 - Static150.anInt4224;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static136.method3051(Static150.anIntArray586, this.aByteArrayArray11[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!ed;IIIII)V")
	public final void method3064(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3050(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1053];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1053; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3059(arg0, arg1 - this.method3056(arg0) / 2, arg2, null, local10);
	}
}
