import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public abstract class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!nc", name = "nb", descriptor = "[Lclient!uj;")
	private Class79[] aClass79Array3;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
	public int anInt1125 = 0;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!nc", name = "ob", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
	private int anInt1126;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
	private int anInt1124;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class2_Sub3_Sub7(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray195 = arg1;
		this.anIntArray196 = arg2;
		this.anIntArray197 = arg3;
		this.anIntArray199 = arg4;
		this.method900(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray196[local25] < local21 && this.anIntArray199[local25] != 0) {
				local21 = this.anIntArray196[local25];
			}
			if (this.anIntArray196[local25] + this.anIntArray199[local25] > local23) {
				local23 = this.anIntArray196[local25] + this.anIntArray199[local25];
			}
		}
		this.anInt1126 = this.anInt1125 - local21;
		this.anInt1124 = local23 - this.anInt1125;
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub7(@OriginalArg(0) byte[] arg0) {
		this.method900(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;IIII)V")
	public final void method877(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method890(arg3, arg4);
			this.method888(arg0, arg1 - this.method883(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;II[I[I)V")
	private void method878(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1125;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3831; local12++) {
			@Pc(20) int local20 = arg0.aByteArray48[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class78 local40 = arg0.method3010(local6 + 1, local12);
					local6 = -1;
					if (local40.method3043(Static135.aClass78_274)) {
						local20 = 60;
					} else if (local40.method3043(Static135.aClass78_262)) {
						local20 = 62;
					} else if (local40.method3043(Static135.aClass78_283)) {
						local20 = 160;
					} else if (local40.method3043(Static135.aClass78_264)) {
						local20 = 173;
					} else if (local40.method3043(Static135.aClass78_281)) {
						local20 = 215;
					} else if (local40.method3043(Static135.aClass78_285)) {
						local20 = 128;
					} else if (local40.method3043(Static135.aClass78_282)) {
						local20 = 169;
					} else {
						if (!local40.method3043(Static135.aClass78_263)) {
							if (local40.method3027(Static135.aClass78_266)) {
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
									local137 = local40.method3052(4).method3017();
									@Pc(142) Class79 local142 = this.aClass79Array3[local137];
									@Pc(153) int local153 = this.anIntArray194 == null ? local142.anInt3890 : this.anIntArray194[local137];
									if (Static135.anInt1131 == 256) {
										local142.method3071(arg1 + local117, local4 + this.anInt1125 - local153 + local126);
									} else {
										local142.method3069(arg1 + local117, local4 + this.anInt1125 - local153 + local126, Static135.anInt1131);
									}
									arg1 += local142.anInt3897;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method895(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray19 != null && local8 != -1) {
						arg1 += this.aByteArray19[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray197[local20];
					local117 = this.anIntArray199[local20];
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
						if (Static135.anInt1129 > 0) {
							Static135.anInt1136 += Static135.anInt1129;
							arg1 += Static135.anInt1136 >> 8;
							Static135.anInt1136 &= 0xFF;
						}
					} else if (Static135.anInt1131 == 256) {
						if (Static135.anInt1133 != -1) {
							this.method897(local20, arg1 + this.anIntArray195[local20] + local126 + 1, local4 + this.anIntArray196[local20] + 1 + local137, local223, local117, Static135.anInt1133);
						}
						this.method898(local20, arg1 + this.anIntArray195[local20] + local126, local4 + this.anIntArray196[local20] + local137, local223, local117, Static135.anInt1127);
					} else {
						if (Static135.anInt1133 != -1) {
							this.method902(local20, arg1 + this.anIntArray195[local20] + local126 + 1, local4 + this.anIntArray196[local20] + 1 + local137, local223, local117, Static135.anInt1133, Static135.anInt1131);
						}
						this.method899(local20, arg1 + this.anIntArray195[local20] + local126, local4 + this.anIntArray196[local20] + local137, local223, local117, Static135.anInt1127, Static135.anInt1131);
					}
					@Pc(380) int local380 = this.anIntArray198[local20];
					if (Static135.anInt1132 != -1) {
						Static217.method3762(arg1, local4 + (int) ((double) this.anInt1125 * 0.7D), local380, Static135.anInt1132);
					}
					if (Static135.anInt1128 != -1) {
						Static217.method3762(arg1, local4 + this.anInt1125, local380, Static135.anInt1128);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;IIIIIIIIII)I")
	private int method879(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method892(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1125;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1126 + this.anInt1124 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method884(arg0, local20, Static135.aClass78Array11);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1126;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1126 + (arg4 - this.anInt1126 - this.anInt1124 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1124 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1126 - this.anInt1124 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1126 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method888(Static135.aClass78Array11[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method888(Static135.aClass78Array11[local118], arg1 + (arg3 - this.method883(Static135.aClass78Array11[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method888(Static135.aClass78Array11[local118], arg1 + arg3 - this.method883(Static135.aClass78Array11[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method888(Static135.aClass78Array11[local118], arg1, local57);
			} else {
				this.method891(Static135.aClass78Array11[local118], arg3);
				this.method888(Static135.aClass78Array11[local118], arg1, local57);
				Static135.anInt1129 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lclient!uj;[I)V")
	public final void method880(@OriginalArg(0) Class79[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass79Array3 = arg0;
		this.anIntArray194 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;IIIIII)V")
	public final void method882(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method890(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt3831];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3831; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method878(arg0, arg1 - this.method883(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;)I")
	public final int method883(@OriginalArg(0) Class78 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3831; local11++) {
			@Pc(19) int local19 = arg0.aByteArray48[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class78 local39 = arg0.method3010(local5 + 1, local11);
					local5 = -1;
					if (local39.method3043(Static135.aClass78_274)) {
						local19 = 60;
					} else if (local39.method3043(Static135.aClass78_262)) {
						local19 = 62;
					} else if (local39.method3043(Static135.aClass78_283)) {
						local19 = 160;
					} else if (local39.method3043(Static135.aClass78_264)) {
						local19 = 173;
					} else if (local39.method3043(Static135.aClass78_281)) {
						local19 = 215;
					} else if (local39.method3043(Static135.aClass78_285)) {
						local19 = 128;
					} else if (local39.method3043(Static135.aClass78_282)) {
						local19 = 169;
					} else {
						if (!local39.method3043(Static135.aClass78_263)) {
							if (local39.method3027(Static135.aClass78_266)) {
								try {
									@Pc(117) int local117 = local39.method3052(4).method3017();
									local9 += this.aClass79Array3[local117].anInt3897;
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
					local9 += this.anIntArray198[local19];
					if (this.aByteArray19 != null && local7 != -1) {
						local9 += this.aByteArray19[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;[I[Lclient!qe;)I")
	private int method884(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class78[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static135.aClass78_278.method3040();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method3041();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method3042(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class78 local55 = arg0.method3010(local19 + 1, local29);
					local19 = -1;
					Static135.aClass78_278.method3008(60);
					Static135.aClass78_278.method3022(local55);
					Static135.aClass78_278.method3008(62);
					if (local55.method3043(Static135.aClass78_284)) {
						if (arg2[local23] == null) {
							arg2[local23] = Static135.aClass78_278.method3010(local11, Static135.aClass78_278.method3041());
						} else {
							arg2[local23].method3040();
							arg2[local23] = arg2[local23].method3015(Static135.aClass78_278, local11, Static135.aClass78_278.method3041());
						}
						local23++;
						local11 = Static135.aClass78_278.method3041();
						local9 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method3043(Static135.aClass78_274)) {
						local9 += this.method885(60);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method3043(Static135.aClass78_262)) {
						local9 += this.method885(62);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method3043(Static135.aClass78_283)) {
						local9 += this.method885(160);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method3043(Static135.aClass78_264)) {
						local9 += this.method885(173);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method3043(Static135.aClass78_281)) {
						local9 += this.method885(215);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method3043(Static135.aClass78_285)) {
						local9 += this.method885(128);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method3043(Static135.aClass78_282)) {
						local9 += this.method885(169);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method3043(Static135.aClass78_263)) {
						local9 += this.method885(174);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method3027(Static135.aClass78_266)) {
						try {
							@Pc(383) int local383 = local55.method3052(4).method3017();
							local9 += this.aClass79Array3[local383].anInt3897;
							local21 = -1;
						} catch (@Pc(395) Exception local395) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						Static135.aClass78_278.method3008(local35);
						local9 += this.method885(local35);
						if (this.aByteArray19 != null && local21 != -1) {
							local9 += this.aByteArray19[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = Static135.aClass78_278.method3041();
						local15 = local9;
						local17 = 1;
					}
					if (arg1 != null && local9 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						if (arg2[local23] == null) {
							arg2[local23] = Static135.aClass78_278.method3010(local11, local13 - local17);
						} else {
							arg2[local23].method3040();
							arg2[local23] = arg2[local23].method3015(Static135.aClass78_278, local11, local13 - local17);
						}
						local23++;
						local11 = local13;
						local13 = -1;
						local9 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = Static135.aClass78_278.method3041();
						local15 = local9;
						local17 = 0;
					}
				}
			}
		}
		if (Static135.aClass78_278.method3041() > local11) {
			if (arg2[local23] == null) {
				arg2[local23] = Static135.aClass78_278.method3010(local11, Static135.aClass78_278.method3041());
			} else {
				arg2[local23].method3040();
				arg2[local23] = arg2[local23].method3015(Static135.aClass78_278, local11, Static135.aClass78_278.method3041());
			}
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
	private int method885(@OriginalArg(0) int arg0) {
		return this.anIntArray198[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lclient!qe;IIII)V")
	public final void method886(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method890(arg3, arg4);
			this.method888(arg0, arg1 - this.method883(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;I)I")
	public final int method887(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method884(arg0, new int[] { arg1 }, Static135.aClass78Array11);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method883(Static135.aClass78Array11[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;II)V")
	private void method888(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1125;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt3831; local10++) {
			@Pc(18) int local18 = arg0.aByteArray48[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class78 local38 = arg0.method3010(local6 + 1, local10);
					local6 = -1;
					if (local38.method3043(Static135.aClass78_274)) {
						local18 = 60;
					} else if (local38.method3043(Static135.aClass78_262)) {
						local18 = 62;
					} else if (local38.method3043(Static135.aClass78_283)) {
						local18 = 160;
					} else if (local38.method3043(Static135.aClass78_264)) {
						local18 = 173;
					} else if (local38.method3043(Static135.aClass78_281)) {
						local18 = 215;
					} else if (local38.method3043(Static135.aClass78_285)) {
						local18 = 128;
					} else if (local38.method3043(Static135.aClass78_282)) {
						local18 = 169;
					} else {
						if (!local38.method3043(Static135.aClass78_263)) {
							if (local38.method3027(Static135.aClass78_266)) {
								try {
									local116 = local38.method3052(4).method3017();
									@Pc(121) Class79 local121 = this.aClass79Array3[local116];
									@Pc(132) int local132 = this.anIntArray194 == null ? local121.anInt3890 : this.anIntArray194[local116];
									if (Static135.anInt1131 == 256) {
										local121.method3071(arg1, local4 + this.anInt1125 - local132);
									} else {
										local121.method3069(arg1, local4 + this.anInt1125 - local132, Static135.anInt1131);
									}
									arg1 += local121.anInt3897;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method895(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray19 != null && local8 != -1) {
						arg1 += this.aByteArray19[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray197[local18];
					local116 = this.anIntArray199[local18];
					if (local18 == 32) {
						if (Static135.anInt1129 > 0) {
							Static135.anInt1136 += Static135.anInt1129;
							arg1 += Static135.anInt1136 >> 8;
							Static135.anInt1136 &= 0xFF;
						}
					} else if (Static135.anInt1131 == 256) {
						if (Static135.anInt1133 != -1) {
							this.method897(local18, arg1 + this.anIntArray195[local18] + 1, local4 + this.anIntArray196[local18] + 1, local194, local116, Static135.anInt1133);
						}
						this.method898(local18, arg1 + this.anIntArray195[local18], local4 + this.anIntArray196[local18], local194, local116, Static135.anInt1127);
					} else {
						if (Static135.anInt1133 != -1) {
							this.method902(local18, arg1 + this.anIntArray195[local18] + 1, local4 + this.anIntArray196[local18] + 1, local194, local116, Static135.anInt1133, Static135.anInt1131);
						}
						this.method899(local18, arg1 + this.anIntArray195[local18], local4 + this.anIntArray196[local18], local194, local116, Static135.anInt1127, Static135.anInt1131);
					}
					@Pc(316) int local316 = this.anIntArray198[local18];
					if (Static135.anInt1132 != -1) {
						Static217.method3762(arg1, local4 + (int) ((double) this.anInt1125 * 0.7D), local316, Static135.anInt1132);
					}
					if (Static135.anInt1128 != -1) {
						Static217.method3762(arg1, local4 + this.anInt1125 + 1, local316, Static135.anInt1128);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;IIIILjava/util/Random;I)I")
	public final int method889(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method892(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt3831];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3831; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method878(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V")
	private void method890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static135.anInt1132 = -1;
		Static135.anInt1128 = -1;
		Static135.anInt1135 = arg1;
		Static135.anInt1133 = arg1;
		Static135.anInt1130 = arg0;
		Static135.anInt1127 = arg0;
		Static135.anInt1134 = 256;
		Static135.anInt1131 = 256;
		Static135.anInt1129 = 0;
		Static135.anInt1136 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lclient!qe;I)V")
	private void method891(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method3041(); local5++) {
			@Pc(11) int local11 = arg0.method3042(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static135.anInt1129 = (arg1 - this.method883(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	private void method892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static135.anInt1132 = -1;
		Static135.anInt1128 = -1;
		Static135.anInt1135 = arg1;
		Static135.anInt1133 = arg1;
		Static135.anInt1130 = arg0;
		Static135.anInt1127 = arg0;
		Static135.anInt1134 = arg2;
		Static135.anInt1131 = arg2;
		Static135.anInt1129 = 0;
		Static135.anInt1136 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(Lclient!qe;I)I")
	public final int method893(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		return this.method884(arg0, new int[] { arg1 }, Static135.aClass78Array11);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(Lclient!qe;)V")
	private void method895(@OriginalArg(0) Class78 arg0) {
		try {
			if (arg0.method3027(Static135.aClass78_267)) {
				Static135.anInt1127 = arg0.method3052(4).method3044(16);
				return;
			}
			if (arg0.method3043(Static135.aClass78_275)) {
				Static135.anInt1127 = Static135.anInt1130;
				return;
			}
			if (arg0.method3027(Static135.aClass78_269)) {
				Static135.anInt1131 = arg0.method3052(6).method3017();
				return;
			}
			if (arg0.method3043(Static135.aClass78_271)) {
				Static135.anInt1131 = Static135.anInt1134;
				return;
			}
			if (arg0.method3027(Static135.aClass78_277)) {
				Static135.anInt1132 = arg0.method3052(4).method3044(16);
				return;
			}
			if (arg0.method3043(Static135.aClass78_276)) {
				Static135.anInt1132 = 8388608;
				return;
			}
			if (arg0.method3043(Static135.aClass78_268)) {
				Static135.anInt1132 = -1;
				return;
			}
			if (arg0.method3027(Static135.aClass78_280)) {
				Static135.anInt1128 = arg0.method3052(2).method3044(16);
				return;
			}
			if (arg0.method3043(Static135.aClass78_265)) {
				Static135.anInt1128 = 0;
				return;
			}
			if (arg0.method3043(Static135.aClass78_270)) {
				Static135.anInt1128 = -1;
				return;
			}
			if (arg0.method3027(Static135.aClass78_272)) {
				Static135.anInt1133 = arg0.method3052(5).method3044(16);
				return;
			}
			if (arg0.method3043(Static135.aClass78_273)) {
				Static135.anInt1133 = 0;
				return;
			}
			if (arg0.method3043(Static135.aClass78_279)) {
				Static135.anInt1133 = Static135.anInt1135;
				return;
			}
			if (arg0.method3043(Static135.aClass78_284)) {
				this.method892(Static135.anInt1130, Static135.anInt1135, Static135.anInt1134);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;IIIII)V")
	public final void method896(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method890(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3831];
		@Pc(14) int[] local14 = new int[arg0.anInt3831];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3831; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method878(arg0, arg1 - this.method883(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([B)V")
	private void method900(@OriginalArg(0) byte[] arg0) {
		this.anIntArray198 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray198.length; local9++) {
				this.anIntArray198[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1125 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray198[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray19 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray19[(local182 << 8) + local150] = (byte) Static135.method903(local93, local136, local58, this.anIntArray198, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1125 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lclient!qe;IIIII)V")
	public final void method901(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method890(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3831];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3831; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method878(arg0, arg1 - this.method883(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(Lclient!qe;IIII)V")
	public final void method904(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method890(arg3, arg4);
			this.method888(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!qe;IIIIIIIII)I")
	public final int method905(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method879(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}
}
