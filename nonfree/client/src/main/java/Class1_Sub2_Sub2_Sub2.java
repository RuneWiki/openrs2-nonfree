import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public abstract class Class1_Sub2_Sub2_Sub2 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "[Lclient!sc;")
	private Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array7;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!wg", name = "sb", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	public int anInt2496 = 0;

	@OriginalMember(owner = "client!wg", name = "Ab", descriptor = "[[B")
	protected byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!wg", name = "ub", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
	private int anInt2498;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub2_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray265 = arg1;
		this.anIntArray269 = arg2;
		this.anIntArray266 = arg3;
		this.anIntArray264 = arg4;
		this.method1939(arg0);
		this.aByteArrayArray6 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray269[local32] < local28 && this.anIntArray264[local32] != 0) {
				local28 = this.anIntArray269[local32];
			}
			if (this.anIntArray269[local32] + this.anIntArray264[local32] > local30) {
				local30 = this.anIntArray269[local32] + this.anIntArray264[local32];
			}
		}
		this.anInt2498 = this.anInt2496 - local28;
		this.anInt2493 = local30 - this.anInt2496;
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.method1939(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;I)I")
	public final int method1922(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1) {
		return this.method1933(arg0, new int[] { arg1 }, Static186.aClass81Array12);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;)V")
	private void method1924(@OriginalArg(0) Class81 arg0) {
		try {
			if (arg0.method2796(Static186.aClass81_892)) {
				Static186.anInt2497 = arg0.method2801(4).method2812(16);
				return;
			}
			if (arg0.method2800(Static186.aClass81_890)) {
				Static186.anInt2497 = Static186.anInt2505;
				return;
			}
			if (arg0.method2796(Static186.aClass81_907)) {
				Static186.anInt2502 = arg0.method2801(6).method2807();
				return;
			}
			if (arg0.method2800(Static186.aClass81_889)) {
				Static186.anInt2502 = Static186.anInt2503;
				return;
			}
			if (arg0.method2796(Static186.aClass81_895)) {
				Static186.anInt2501 = arg0.method2801(4).method2812(16);
				return;
			}
			if (arg0.method2800(Static186.aClass81_898)) {
				Static186.anInt2501 = 8388608;
				return;
			}
			if (arg0.method2800(Static186.aClass81_906)) {
				Static186.anInt2501 = -1;
				return;
			}
			if (arg0.method2796(Static186.aClass81_900)) {
				Static186.anInt2495 = arg0.method2801(2).method2812(16);
				return;
			}
			if (arg0.method2800(Static186.aClass81_904)) {
				Static186.anInt2495 = 0;
				return;
			}
			if (arg0.method2800(Static186.aClass81_886)) {
				Static186.anInt2495 = -1;
				return;
			}
			if (arg0.method2796(Static186.aClass81_894)) {
				Static186.anInt2500 = arg0.method2801(5).method2812(16);
				return;
			}
			if (arg0.method2800(Static186.aClass81_897)) {
				Static186.anInt2500 = 0;
				return;
			}
			if (arg0.method2800(Static186.aClass81_899)) {
				Static186.anInt2500 = Static186.anInt2499;
				return;
			}
			if (arg0.method2800(Static186.aClass81_908)) {
				this.method1928(Static186.anInt2505, Static186.anInt2499, Static186.anInt2503);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;II)V")
	private void method1925(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2496;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt3691; local10++) {
			@Pc(18) int local18 = arg0.aByteArray41[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class81 local38 = arg0.method2823(local6 + 1, local10);
					local6 = -1;
					if (local38.method2800(Static186.aClass81_901)) {
						local18 = 60;
					} else if (local38.method2800(Static186.aClass81_896)) {
						local18 = 62;
					} else if (local38.method2800(Static186.aClass81_887)) {
						local18 = 160;
					} else if (local38.method2800(Static186.aClass81_903)) {
						local18 = 173;
					} else if (local38.method2800(Static186.aClass81_902)) {
						local18 = 215;
					} else if (local38.method2800(Static186.aClass81_893)) {
						local18 = 128;
					} else if (local38.method2800(Static186.aClass81_891)) {
						local18 = 169;
					} else {
						if (!local38.method2800(Static186.aClass81_905)) {
							if (local38.method2796(Static186.aClass81_888)) {
								try {
									local116 = local38.method2801(4).method2807();
									@Pc(121) Class1_Sub2_Sub2_Sub4 local121 = this.aClass1_Sub2_Sub2_Sub4Array7[local116];
									@Pc(132) int local132 = this.anIntArray268 == null ? local121.anInt3359 : this.anIntArray268[local116];
									if (Static186.anInt2502 == 256) {
										local121.method2581(arg1, local4 + this.anInt2496 - local132);
									} else {
										local121.method2585(arg1, local4 + this.anInt2496 - local132, Static186.anInt2502);
									}
									arg1 += local121.anInt3360;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method1924(local38);
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
					@Pc(194) int local194 = this.anIntArray266[local18];
					local116 = this.anIntArray264[local18];
					if (local18 == 32) {
						if (Static186.anInt2504 > 0) {
							Static186.anInt2494 += Static186.anInt2504;
							arg1 += Static186.anInt2494 >> 8;
							Static186.anInt2494 &= 0xFF;
						}
					} else if (Static186.anInt2502 == 256) {
						if (Static186.anInt2500 != -1) {
							this.method1951(local18, arg1 + this.anIntArray265[local18] + 1, local4 + this.anIntArray269[local18] + 1, local194, local116, Static186.anInt2500);
						}
						this.method1936(local18, arg1 + this.anIntArray265[local18], local4 + this.anIntArray269[local18], local194, local116, Static186.anInt2497);
					} else {
						if (Static186.anInt2500 != -1) {
							this.method1943(local18, arg1 + this.anIntArray265[local18] + 1, local4 + this.anIntArray269[local18] + 1, local194, local116, Static186.anInt2500, Static186.anInt2502);
						}
						this.method1940(local18, arg1 + this.anIntArray265[local18], local4 + this.anIntArray269[local18], local194, local116, Static186.anInt2497, Static186.anInt2502);
					}
					@Pc(316) int local316 = this.anIntArray267[local18];
					if (Static186.anInt2501 != -1) {
						Static4.method2571(arg1, local4 + (int) ((double) this.anInt2496 * 0.7D), local316, Static186.anInt2501);
					}
					if (Static186.anInt2495 != -1) {
						Static4.method2571(arg1, local4 + this.anInt2496 + 1, local316, Static186.anInt2495);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	private void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static186.anInt2501 = -1;
		Static186.anInt2495 = -1;
		Static186.anInt2499 = arg1;
		Static186.anInt2500 = arg1;
		Static186.anInt2505 = arg0;
		Static186.anInt2497 = arg0;
		Static186.anInt2503 = 256;
		Static186.anInt2502 = 256;
		Static186.anInt2504 = 0;
		Static186.anInt2494 = 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;IIIII)V")
	public final void method1927(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1926(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3691];
		@Pc(14) int[] local14 = new int[arg0.anInt3691];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3691; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1938(arg0, arg1 - this.method1934(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
	private void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static186.anInt2501 = -1;
		Static186.anInt2495 = -1;
		Static186.anInt2499 = arg1;
		Static186.anInt2500 = arg1;
		Static186.anInt2505 = arg0;
		Static186.anInt2497 = arg0;
		Static186.anInt2503 = arg2;
		Static186.anInt2502 = arg2;
		Static186.anInt2504 = 0;
		Static186.anInt2494 = 0;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lclient!tg;IIIII)V")
	public final void method1929(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1926(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3691];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3691; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1938(arg0, arg1 - this.method1934(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;IIIIIIIIII)I")
	private int method1930(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1928(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2496;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2498 + this.anInt2493 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1933(arg0, local20, Static186.aClass81Array12);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2498;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2498 + (arg4 - this.anInt2498 - this.anInt2493 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2493 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2498 - this.anInt2493 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2498 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1925(Static186.aClass81Array12[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1925(Static186.aClass81Array12[local118], arg1 + (arg3 - this.method1934(Static186.aClass81Array12[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1925(Static186.aClass81Array12[local118], arg1 + arg3 - this.method1934(Static186.aClass81Array12[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1925(Static186.aClass81Array12[local118], arg1, local57);
			} else {
				this.method1932(Static186.aClass81Array12[local118], arg3);
				this.method1925(Static186.aClass81Array12[local118], arg1, local57);
				Static186.anInt2504 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lclient!tg;I)V")
	private void method1932(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method2820(); local5++) {
			@Pc(11) int local11 = arg0.method2826(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static186.anInt2504 = (arg1 - this.method1934(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;[I[Lclient!tg;)I")
	private int method1933(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class81[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class81 local11 = Static16.method235(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method2820();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method2826(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class81 local55 = arg0.method2823(local19 + 1, local29);
					local19 = -1;
					local11.method2818(60);
					local11.method2814(local55);
					local11.method2818(62);
					if (local55.method2800(Static186.aClass81_908)) {
						arg2[local23++] = local11.method2823(local7, local11.method2820());
						local7 = local11.method2820();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method2800(Static186.aClass81_901)) {
						local5 += this.method1944(60);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method2800(Static186.aClass81_896)) {
						local5 += this.method1944(62);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method2800(Static186.aClass81_887)) {
						local5 += this.method1944(160);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method2800(Static186.aClass81_903)) {
						local5 += this.method1944(173);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method2800(Static186.aClass81_902)) {
						local5 += this.method1944(215);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method2800(Static186.aClass81_893)) {
						local5 += this.method1944(128);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method2800(Static186.aClass81_891)) {
						local5 += this.method1944(169);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method2800(Static186.aClass81_905)) {
						local5 += this.method1944(174);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method2796(Static186.aClass81_888)) {
						try {
							@Pc(359) int local359 = local55.method2801(4).method2807();
							local5 += this.aClass1_Sub2_Sub2_Sub4Array7[local359].anInt3360;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method2818(local35);
						local5 += this.method1944(local35);
						if (this.aByteArray19 != null && local21 != -1) {
							local5 += this.aByteArray19[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method2820();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method2823(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method2820();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method2820() > local7) {
			arg2[local23++] = local11.method2823(local7, local11.method2820());
		}
		return local23;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lclient!tg;)I")
	public final int method1934(@OriginalArg(0) Class81 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3691; local11++) {
			@Pc(19) int local19 = arg0.aByteArray41[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class81 local39 = arg0.method2823(local5 + 1, local11);
					local5 = -1;
					if (local39.method2800(Static186.aClass81_901)) {
						local19 = 60;
					} else if (local39.method2800(Static186.aClass81_896)) {
						local19 = 62;
					} else if (local39.method2800(Static186.aClass81_887)) {
						local19 = 160;
					} else if (local39.method2800(Static186.aClass81_903)) {
						local19 = 173;
					} else if (local39.method2800(Static186.aClass81_902)) {
						local19 = 215;
					} else if (local39.method2800(Static186.aClass81_893)) {
						local19 = 128;
					} else if (local39.method2800(Static186.aClass81_891)) {
						local19 = 169;
					} else {
						if (!local39.method2800(Static186.aClass81_905)) {
							if (local39.method2796(Static186.aClass81_888)) {
								try {
									@Pc(117) int local117 = local39.method2801(4).method2807();
									local9 += this.aClass1_Sub2_Sub2_Sub4Array7[local117].anInt3360;
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
					local9 += this.anIntArray267[local19];
					if (this.aByteArray19 != null && local7 != -1) {
						local9 += this.aByteArray19[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;IIIIII)V")
	public final void method1935(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1926(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt3691];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3691; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1938(arg0, arg1 - this.method1934(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method1936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;IIIIIIIII)I")
	public final int method1937(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1930(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;II[I[I)V")
	private void method1938(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2496;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3691; local12++) {
			@Pc(20) int local20 = arg0.aByteArray41[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class81 local40 = arg0.method2823(local6 + 1, local12);
					local6 = -1;
					if (local40.method2800(Static186.aClass81_901)) {
						local20 = 60;
					} else if (local40.method2800(Static186.aClass81_896)) {
						local20 = 62;
					} else if (local40.method2800(Static186.aClass81_887)) {
						local20 = 160;
					} else if (local40.method2800(Static186.aClass81_903)) {
						local20 = 173;
					} else if (local40.method2800(Static186.aClass81_902)) {
						local20 = 215;
					} else if (local40.method2800(Static186.aClass81_893)) {
						local20 = 128;
					} else if (local40.method2800(Static186.aClass81_891)) {
						local20 = 169;
					} else {
						if (!local40.method2800(Static186.aClass81_905)) {
							if (local40.method2796(Static186.aClass81_888)) {
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
									local137 = local40.method2801(4).method2807();
									@Pc(142) Class1_Sub2_Sub2_Sub4 local142 = this.aClass1_Sub2_Sub2_Sub4Array7[local137];
									@Pc(153) int local153 = this.anIntArray268 == null ? local142.anInt3359 : this.anIntArray268[local137];
									if (Static186.anInt2502 == 256) {
										local142.method2581(arg1 + local117, local4 + this.anInt2496 - local153 + local126);
									} else {
										local142.method2585(arg1 + local117, local4 + this.anInt2496 - local153 + local126, Static186.anInt2502);
									}
									arg1 += local142.anInt3360;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method1924(local40);
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
					@Pc(223) int local223 = this.anIntArray266[local20];
					local117 = this.anIntArray264[local20];
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
						if (Static186.anInt2504 > 0) {
							Static186.anInt2494 += Static186.anInt2504;
							arg1 += Static186.anInt2494 >> 8;
							Static186.anInt2494 &= 0xFF;
						}
					} else if (Static186.anInt2502 == 256) {
						if (Static186.anInt2500 != -1) {
							this.method1951(local20, arg1 + this.anIntArray265[local20] + local126 + 1, local4 + this.anIntArray269[local20] + 1 + local137, local223, local117, Static186.anInt2500);
						}
						this.method1936(local20, arg1 + this.anIntArray265[local20] + local126, local4 + this.anIntArray269[local20] + local137, local223, local117, Static186.anInt2497);
					} else {
						if (Static186.anInt2500 != -1) {
							this.method1943(local20, arg1 + this.anIntArray265[local20] + local126 + 1, local4 + this.anIntArray269[local20] + 1 + local137, local223, local117, Static186.anInt2500, Static186.anInt2502);
						}
						this.method1940(local20, arg1 + this.anIntArray265[local20] + local126, local4 + this.anIntArray269[local20] + local137, local223, local117, Static186.anInt2497, Static186.anInt2502);
					}
					@Pc(380) int local380 = this.anIntArray267[local20];
					if (Static186.anInt2501 != -1) {
						Static4.method2571(arg1, local4 + (int) ((double) this.anInt2496 * 0.7D), local380, Static186.anInt2501);
					}
					if (Static186.anInt2495 != -1) {
						Static4.method2571(arg1, local4 + this.anInt2496, local380, Static186.anInt2495);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([B)V")
	private void method1939(@OriginalArg(0) byte[] arg0) {
		this.anIntArray267 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray267.length; local9++) {
				this.anIntArray267[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2496 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray267[local37] = arg0[local9++] & 0xFF;
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
						this.aByteArray19[(local182 << 8) + local150] = (byte) Static186.method1945(local93, local136, local58, this.anIntArray267, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2496 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;IIIILjava/util/Random;I)I")
	public final int method1942(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1928(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt3691];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3691; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1938(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIII)V")
	private void method1943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static4.anInt3357;
		@Pc(9) int local9 = Static4.anInt3357 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static4.anInt3354) {
			local20 = Static4.anInt3354 - arg2;
			arg4 -= local20;
			arg2 = Static4.anInt3354;
			local13 = local20 * arg3;
			local5 += local20 * Static4.anInt3357;
		}
		if (arg2 + arg4 > Static4.anInt3353) {
			arg4 -= arg2 + arg4 - Static4.anInt3353;
		}
		if (arg1 < Static4.anInt3355) {
			local20 = Static4.anInt3355 - arg1;
			arg3 -= local20;
			arg1 = Static4.anInt3355;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static4.anInt3356) {
			local20 = arg1 + arg3 - Static4.anInt3356;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static186.method1923(Static4.anIntArray355, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
	private int method1944(@OriginalArg(0) int arg0) {
		return this.anIntArray267[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([Lclient!sc;[I)V")
	public final void method1946(@OriginalArg(0) Class1_Sub2_Sub2_Sub4[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass1_Sub2_Sub2_Sub4Array7 = arg0;
		this.anIntArray268 = arg1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tg;IIII)V")
	public final void method1947(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1926(arg3, arg4);
			this.method1925(arg0, arg1 - this.method1934(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lclient!tg;IIII)V")
	public final void method1948(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1926(arg3, arg4);
			this.method1925(arg0, arg1 - this.method1934(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(Lclient!tg;IIII)V")
	public final void method1949(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1926(arg3, arg4);
			this.method1925(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(IIIIII)V")
	private void method1951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static4.anInt3357;
		@Pc(9) int local9 = Static4.anInt3357 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static4.anInt3354) {
			local20 = Static4.anInt3354 - arg2;
			arg4 -= local20;
			arg2 = Static4.anInt3354;
			local13 = local20 * arg3;
			local5 += local20 * Static4.anInt3357;
		}
		if (arg2 + arg4 > Static4.anInt3353) {
			arg4 -= arg2 + arg4 - Static4.anInt3353;
		}
		if (arg1 < Static4.anInt3355) {
			local20 = Static4.anInt3355 - arg1;
			arg3 -= local20;
			arg1 = Static4.anInt3355;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static4.anInt3356) {
			local20 = arg1 + arg3 - Static4.anInt3356;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static186.method1931(Static4.anIntArray355, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(Lclient!tg;I)I")
	public final int method1952(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1933(arg0, new int[] { arg1 }, Static186.aClass81Array12);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1934(Static186.aClass81Array12[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}
}
