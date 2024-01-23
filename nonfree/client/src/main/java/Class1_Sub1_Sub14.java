import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public abstract class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mg", name = "X", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!mg", name = "Y", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!mg", name = "pb", descriptor = "[Lclient!r;")
	private Class73[] aClass73Array9;

	@OriginalMember(owner = "client!mg", name = "qb", descriptor = "[I")
	private int[] anIntArray591;

	@OriginalMember(owner = "client!mg", name = "yb", descriptor = "I")
	public int anInt4516 = 0;

	@OriginalMember(owner = "client!mg", name = "sb", descriptor = "[I")
	private int[] anIntArray592;

	@OriginalMember(owner = "client!mg", name = "ob", descriptor = "[I")
	private int[] anIntArray590;

	@OriginalMember(owner = "client!mg", name = "eb", descriptor = "[I")
	private int[] anIntArray589;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "[I")
	private int[] anIntArray587;

	@OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
	private int anInt4508;

	@OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
	private int anInt4510;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class1_Sub1_Sub14(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray592 = arg1;
		this.anIntArray590 = arg2;
		this.anIntArray589 = arg3;
		this.anIntArray587 = arg4;
		this.method3319(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray590[local25] < local21 && this.anIntArray587[local25] != 0) {
				local21 = this.anIntArray590[local25];
			}
			if (this.anIntArray590[local25] + this.anIntArray587[local25] > local23) {
				local23 = this.anIntArray590[local25] + this.anIntArray587[local25];
			}
		}
		this.anInt4508 = this.anInt4516 - local21;
		this.anInt4510 = local23 - this.anInt4516;
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.method3319(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;[I[Lclient!kh;)I")
	private int method3297(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class60[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class60 local11 = Static32.method599(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1835();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1793(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class60 local55 = arg0.method1797(local19 + 1, local29);
					local19 = -1;
					local11.method1816(60);
					local11.method1823(local55);
					local11.method1816(62);
					if (local55.method1826(Static123.aClass60_1557)) {
						arg2[local23++] = local11.method1797(local7, local11.method1835());
						local7 = local11.method1835();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1826(Static123.aClass60_1541)) {
						local5 += this.method3301(60);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1826(Static123.aClass60_1539)) {
						local5 += this.method3301(62);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1826(Static123.aClass60_1554)) {
						local5 += this.method3301(160);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1826(Static123.aClass60_1555)) {
						local5 += this.method3301(173);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1826(Static123.aClass60_1536)) {
						local5 += this.method3301(215);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1826(Static123.aClass60_1543)) {
						local5 += this.method3301(128);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1826(Static123.aClass60_1540)) {
						local5 += this.method3301(169);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1826(Static123.aClass60_1537)) {
						local5 += this.method3301(174);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1838(Static123.aClass60_1556)) {
						try {
							@Pc(359) int local359 = local55.method1818(4).method1841();
							local5 += this.aClass73Array9[local359].anInt2953;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1816(local35);
						local5 += this.method3301(local35);
						if (this.aByteArray62 != null && local21 != -1) {
							local5 += this.aByteArray62[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1835();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1797(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1835();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1835() > local7) {
			arg2[local23++] = local11.method1797(local7, local11.method1835());
		}
		return local23;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;IIIIIIIII)I")
	public final int method3298(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method3324(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method3299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;I)I")
	public final int method3300(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		return this.method3297(arg0, new int[] { arg1 }, Static123.aClass60Array31);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)I")
	private int method3301(@OriginalArg(0) int arg0) {
		return this.anIntArray588[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;IIIII)V")
	public final void method3302(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3323(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2439];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2439; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3316(arg0, arg1 - this.method3307(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Lclient!kh;IIIII)V")
	public final void method3303(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3323(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2439];
		@Pc(14) int[] local14 = new int[arg0.anInt2439];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2439; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3316(arg0, arg1 - this.method3307(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;II)V")
	private void method3305(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt4516;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2439; local10++) {
			@Pc(18) int local18 = arg0.aByteArray34[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class60 local38 = arg0.method1797(local6 + 1, local10);
					local6 = -1;
					if (local38.method1826(Static123.aClass60_1541)) {
						local18 = 60;
					} else if (local38.method1826(Static123.aClass60_1539)) {
						local18 = 62;
					} else if (local38.method1826(Static123.aClass60_1554)) {
						local18 = 160;
					} else if (local38.method1826(Static123.aClass60_1555)) {
						local18 = 173;
					} else if (local38.method1826(Static123.aClass60_1536)) {
						local18 = 215;
					} else if (local38.method1826(Static123.aClass60_1543)) {
						local18 = 128;
					} else if (local38.method1826(Static123.aClass60_1540)) {
						local18 = 169;
					} else {
						if (!local38.method1826(Static123.aClass60_1537)) {
							if (local38.method1838(Static123.aClass60_1556)) {
								try {
									local116 = local38.method1818(4).method1841();
									@Pc(121) Class73 local121 = this.aClass73Array9[local116];
									@Pc(132) int local132 = this.anIntArray591 == null ? local121.anInt2954 : this.anIntArray591[local116];
									if (Static123.anInt4515 == 256) {
										local121.method2270(arg1, local4 + this.anInt4516 - local132);
									} else {
										local121.method2267(arg1, local4 + this.anInt4516 - local132, Static123.anInt4515);
									}
									arg1 += local121.anInt2953;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method3325(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray62 != null && local8 != -1) {
						arg1 += this.aByteArray62[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray589[local18];
					local116 = this.anIntArray587[local18];
					if (local18 == 32) {
						if (Static123.anInt4512 > 0) {
							Static123.anInt4507 += Static123.anInt4512;
							arg1 += Static123.anInt4507 >> 8;
							Static123.anInt4507 &= 0xFF;
						}
					} else if (Static123.anInt4515 == 256) {
						if (Static123.anInt4506 != -1) {
							this.method3318(local18, arg1 + this.anIntArray592[local18] + 1, local4 + this.anIntArray590[local18] + 1, local194, local116, Static123.anInt4506);
						}
						this.method3299(local18, arg1 + this.anIntArray592[local18], local4 + this.anIntArray590[local18], local194, local116, Static123.anInt4511);
					} else {
						if (Static123.anInt4506 != -1) {
							this.method3311(local18, arg1 + this.anIntArray592[local18] + 1, local4 + this.anIntArray590[local18] + 1, local194, local116, Static123.anInt4506, Static123.anInt4515);
						}
						this.method3312(local18, arg1 + this.anIntArray592[local18], local4 + this.anIntArray590[local18], local194, local116, Static123.anInt4511, Static123.anInt4515);
					}
					@Pc(316) int local316 = this.anIntArray588[local18];
					if (Static123.anInt4509 != -1) {
						Static76.method1357(arg1, local4 + (int) ((double) this.anInt4516 * 0.7D), local316, Static123.anInt4509);
					}
					if (Static123.anInt4513 != -1) {
						Static76.method1357(arg1, local4 + this.anInt4516 + 1, local316, Static123.anInt4513);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;IIIILjava/util/Random;I)I")
	public final int method3306(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method3315(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2439];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2439; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method3316(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Lclient!kh;)I")
	public final int method3307(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2439; local11++) {
			@Pc(19) int local19 = arg0.aByteArray34[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class60 local39 = arg0.method1797(local5 + 1, local11);
					local5 = -1;
					if (local39.method1826(Static123.aClass60_1541)) {
						local19 = 60;
					} else if (local39.method1826(Static123.aClass60_1539)) {
						local19 = 62;
					} else if (local39.method1826(Static123.aClass60_1554)) {
						local19 = 160;
					} else if (local39.method1826(Static123.aClass60_1555)) {
						local19 = 173;
					} else if (local39.method1826(Static123.aClass60_1536)) {
						local19 = 215;
					} else if (local39.method1826(Static123.aClass60_1543)) {
						local19 = 128;
					} else if (local39.method1826(Static123.aClass60_1540)) {
						local19 = 169;
					} else {
						if (!local39.method1826(Static123.aClass60_1537)) {
							if (local39.method1838(Static123.aClass60_1556)) {
								try {
									@Pc(117) int local117 = local39.method1818(4).method1841();
									local9 += this.aClass73Array9[local117].anInt2953;
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
					local9 += this.anIntArray588[local19];
					if (this.aByteArray62 != null && local7 != -1) {
						local9 += this.aByteArray62[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;IIII)V")
	public final void method3308(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3323(arg3, arg4);
			this.method3305(arg0, arg1 - this.method3307(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Lclient!kh;I)V")
	private void method3309(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1835(); local5++) {
			@Pc(11) int local11 = arg0.method1793(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static123.anInt4512 = (arg1 - this.method3307(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([Lclient!r;[I)V")
	public final void method3310(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass73Array9 = arg0;
		this.anIntArray591 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method3311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method3312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;IIIIII)V")
	public final void method3313(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3323(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2439];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2439; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method3316(arg0, arg1 - this.method3307(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Lclient!kh;IIII)V")
	public final void method3314(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3323(arg3, arg4);
			this.method3305(arg0, arg1 - this.method3307(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
	private void method3315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static123.anInt4509 = -1;
		Static123.anInt4513 = -1;
		Static123.anInt4504 = arg1;
		Static123.anInt4506 = arg1;
		Static123.anInt4505 = arg0;
		Static123.anInt4511 = arg0;
		Static123.anInt4514 = arg2;
		Static123.anInt4515 = arg2;
		Static123.anInt4512 = 0;
		Static123.anInt4507 = 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;II[I[I)V")
	private void method3316(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt4516;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2439; local12++) {
			@Pc(20) int local20 = arg0.aByteArray34[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class60 local40 = arg0.method1797(local6 + 1, local12);
					local6 = -1;
					if (local40.method1826(Static123.aClass60_1541)) {
						local20 = 60;
					} else if (local40.method1826(Static123.aClass60_1539)) {
						local20 = 62;
					} else if (local40.method1826(Static123.aClass60_1554)) {
						local20 = 160;
					} else if (local40.method1826(Static123.aClass60_1555)) {
						local20 = 173;
					} else if (local40.method1826(Static123.aClass60_1536)) {
						local20 = 215;
					} else if (local40.method1826(Static123.aClass60_1543)) {
						local20 = 128;
					} else if (local40.method1826(Static123.aClass60_1540)) {
						local20 = 169;
					} else {
						if (!local40.method1826(Static123.aClass60_1537)) {
							if (local40.method1838(Static123.aClass60_1556)) {
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
									local137 = local40.method1818(4).method1841();
									@Pc(142) Class73 local142 = this.aClass73Array9[local137];
									@Pc(153) int local153 = this.anIntArray591 == null ? local142.anInt2954 : this.anIntArray591[local137];
									if (Static123.anInt4515 == 256) {
										local142.method2270(arg1 + local117, local4 + this.anInt4516 - local153 + local126);
									} else {
										local142.method2267(arg1 + local117, local4 + this.anInt4516 - local153 + local126, Static123.anInt4515);
									}
									arg1 += local142.anInt2953;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method3325(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray62 != null && local8 != -1) {
						arg1 += this.aByteArray62[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray589[local20];
					local117 = this.anIntArray587[local20];
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
						if (Static123.anInt4512 > 0) {
							Static123.anInt4507 += Static123.anInt4512;
							arg1 += Static123.anInt4507 >> 8;
							Static123.anInt4507 &= 0xFF;
						}
					} else if (Static123.anInt4515 == 256) {
						if (Static123.anInt4506 != -1) {
							this.method3318(local20, arg1 + this.anIntArray592[local20] + local126 + 1, local4 + this.anIntArray590[local20] + 1 + local137, local223, local117, Static123.anInt4506);
						}
						this.method3299(local20, arg1 + this.anIntArray592[local20] + local126, local4 + this.anIntArray590[local20] + local137, local223, local117, Static123.anInt4511);
					} else {
						if (Static123.anInt4506 != -1) {
							this.method3311(local20, arg1 + this.anIntArray592[local20] + local126 + 1, local4 + this.anIntArray590[local20] + 1 + local137, local223, local117, Static123.anInt4506, Static123.anInt4515);
						}
						this.method3312(local20, arg1 + this.anIntArray592[local20] + local126, local4 + this.anIntArray590[local20] + local137, local223, local117, Static123.anInt4511, Static123.anInt4515);
					}
					@Pc(380) int local380 = this.anIntArray588[local20];
					if (Static123.anInt4509 != -1) {
						Static76.method1357(arg1, local4 + (int) ((double) this.anInt4516 * 0.7D), local380, Static123.anInt4509);
					}
					if (Static123.anInt4513 != -1) {
						Static76.method1357(arg1, local4 + this.anInt4516, local380, Static123.anInt4513);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(Lclient!kh;IIII)V")
	public final void method3317(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3323(arg3, arg4);
			this.method3305(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method3318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([B)V")
	private void method3319(@OriginalArg(0) byte[] arg0) {
		this.anIntArray588 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray588.length; local9++) {
				this.anIntArray588[local9] = arg0[local9] & 0xFF;
			}
			this.anInt4516 = arg0[256] & 0xFF;
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
		this.aByteArray62 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray62[(local182 << 8) + local150] = (byte) Static123.method3320(local93, local136, local58, this.anIntArray588, local55, local182, local150);
					}
				}
			}
		}
		this.anInt4516 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(Lclient!kh;I)I")
	public final int method3322(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method3297(arg0, new int[] { arg1 }, Static123.aClass60Array31);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method3307(Static123.aClass60Array31[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	private void method3323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static123.anInt4509 = -1;
		Static123.anInt4513 = -1;
		Static123.anInt4504 = arg1;
		Static123.anInt4506 = arg1;
		Static123.anInt4505 = arg0;
		Static123.anInt4511 = arg0;
		Static123.anInt4514 = 256;
		Static123.anInt4515 = 256;
		Static123.anInt4512 = 0;
		Static123.anInt4507 = 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;IIIIIIIIII)I")
	private int method3324(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method3315(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt4516;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt4508 + this.anInt4510 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method3297(arg0, local20, Static123.aClass60Array31);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt4508;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt4508 + (arg4 - this.anInt4508 - this.anInt4510 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt4510 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt4508 - this.anInt4510 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt4508 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method3305(Static123.aClass60Array31[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method3305(Static123.aClass60Array31[local118], arg1 + (arg3 - this.method3307(Static123.aClass60Array31[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method3305(Static123.aClass60Array31[local118], arg1 + arg3 - this.method3307(Static123.aClass60Array31[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method3305(Static123.aClass60Array31[local118], arg1, local57);
			} else {
				this.method3309(Static123.aClass60Array31[local118], arg3);
				this.method3305(Static123.aClass60Array31[local118], arg1, local57);
				Static123.anInt4512 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(Lclient!kh;)V")
	private void method3325(@OriginalArg(0) Class60 arg0) {
		try {
			if (arg0.method1838(Static123.aClass60_1545)) {
				Static123.anInt4511 = arg0.method1818(4).method1794(16);
				return;
			}
			if (arg0.method1826(Static123.aClass60_1535)) {
				Static123.anInt4511 = Static123.anInt4505;
				return;
			}
			if (arg0.method1838(Static123.aClass60_1551)) {
				Static123.anInt4515 = arg0.method1818(6).method1841();
				return;
			}
			if (arg0.method1826(Static123.aClass60_1548)) {
				Static123.anInt4515 = Static123.anInt4514;
				return;
			}
			if (arg0.method1838(Static123.aClass60_1553)) {
				Static123.anInt4509 = arg0.method1818(4).method1794(16);
				return;
			}
			if (arg0.method1826(Static123.aClass60_1544)) {
				Static123.anInt4509 = 8388608;
				return;
			}
			if (arg0.method1826(Static123.aClass60_1550)) {
				Static123.anInt4509 = -1;
				return;
			}
			if (arg0.method1838(Static123.aClass60_1538)) {
				Static123.anInt4513 = arg0.method1818(2).method1794(16);
				return;
			}
			if (arg0.method1826(Static123.aClass60_1552)) {
				Static123.anInt4513 = 0;
				return;
			}
			if (arg0.method1826(Static123.aClass60_1549)) {
				Static123.anInt4513 = -1;
				return;
			}
			if (arg0.method1838(Static123.aClass60_1546)) {
				Static123.anInt4506 = arg0.method1818(5).method1794(16);
				return;
			}
			if (arg0.method1826(Static123.aClass60_1547)) {
				Static123.anInt4506 = 0;
				return;
			}
			if (arg0.method1826(Static123.aClass60_1542)) {
				Static123.anInt4506 = Static123.anInt4504;
				return;
			}
			if (arg0.method1826(Static123.aClass60_1557)) {
				this.method3315(Static123.anInt4505, Static123.anInt4504, Static123.anInt4514);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}
}
