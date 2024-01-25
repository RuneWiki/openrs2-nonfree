import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public abstract class Class137 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!is;")
	private final Class110 aClass110_9;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "Lclient!tq;")
	private final Class164 aClass164_9;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!tq;Lclient!is;)V")
	protected Class137(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class110 arg1) {
		this.aClass110_9 = arg1;
		this.aClass164_9 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5089(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([IIII[ILjava/lang/String;ILjava/util/Random;IBIIII[Lclient!dp;)I")
	public final int method5090(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Random arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class51[] arg13) {
		if (arg5 == null) {
			return 0;
		}
		arg7.setSeed((long) arg9);
		@Pc(20) int local20 = (arg7.nextInt() & 0x1F) + 192;
		this.method5106(local20 << 24 | arg12 & 0xFFFFFF, arg3 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg7.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(68) int local68 = arg8;
		@Pc(74) int local74 = this.aClass110_9.anInt2963 + arg10;
		@Pc(87) int local87 = -1;
		if (arg1 == 1) {
			local74 += (arg11 - this.aClass110_9.anInt2963 - this.aClass110_9.anInt2957) / 2;
		} else if (arg1 == 2) {
			local74 = arg11 + arg10 - this.aClass110_9.anInt2957;
		}
		if (arg6 == 1) {
			local87 = local45 + this.aClass110_9.method2413(arg5);
			local68 = arg8 + (arg2 - local87) / 2;
		} else if (arg6 == 2) {
			local87 = this.aClass110_9.method2413(arg5) + local45;
			local68 = arg8 + arg2 - local87;
		}
		this.method5097(null, arg4, local74, local43, local68, arg5, arg13);
		if (arg0 != null) {
			if (local87 == -1) {
				local87 = this.aClass110_9.method2413(arg5) + local45;
			}
			arg0[0] = local68;
			arg0[1] = local74 - this.aClass110_9.anInt2963;
			arg0[3] = this.aClass110_9.anInt2963 + this.aClass110_9.anInt2957;
			arg0[2] = local87;
		}
		return local45;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method5092(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5106(-16777216, arg1);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method5097(local19, null, arg4, null, arg3 - this.aClass110_9.method2413(arg0) / 2, arg0, null);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5094(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			this.method5106(-1, arg1);
			this.method5110(arg2 - this.aClass110_9.method2413(arg0), arg0, null, null, arg3, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5095(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static208.anInt3628 = Static208.anInt3628 & 0xFF000000 | Static337.method4820(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static208.anInt3628 = Static36.anInt706 & 0xFFFFFF | Static208.anInt3628 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static208.anInt3628 = Static337.method4820(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static208.anInt3628 = Static36.anInt706;
			} else if (arg0.startsWith("str=")) {
				Static122.anInt2189 = Static337.method4820(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static122.anInt2189 = -8388608;
			} else if (arg0.equals("/str")) {
				Static122.anInt2189 = -1;
			} else if (arg0.startsWith("u=")) {
				Static261.anInt4557 = Static337.method4820(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static261.anInt4557 = -16777216;
			} else if (arg0.equals("/u")) {
				Static261.anInt4557 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static143.anInt2674 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static143.anInt2674 = Static337.method4820(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static143.anInt2674 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static143.anInt2674 = Static333.anInt855;
			} else if (arg0.equals("br")) {
				this.method5106(Static333.anInt855, Static36.anInt706);
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIILjava/lang/String;IILclient!us;[IIIII[Lclient!dp;III)I")
	public final int method5096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class34 arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) Class51[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg3 == null) {
			return 0;
		}
		this.method5106(arg5, arg13);
		if (arg12 == 0) {
			arg12 = this.aClass110_9.anInt2954;
		}
		@Pc(46) int[] local46;
		if (this.aClass110_9.anInt2963 + this.aClass110_9.anInt2957 + arg12 > arg0 && arg12 + arg12 > arg0) {
			local46 = null;
		} else {
			local46 = new int[] { arg1 };
		}
		@Pc(64) int local64 = this.aClass110_9.method2414(arg3, arg11, Static134.aStringArray37, local46);
		if (arg10 == 3 && local64 == 1) {
			arg10 = 1;
		}
		@Pc(123) int local123;
		@Pc(108) int local108;
		if (arg10 == 0) {
			local123 = this.aClass110_9.anInt2963 + arg14;
		} else if (arg10 == 1) {
			local123 = (arg0 - this.aClass110_9.anInt2957 - this.aClass110_9.anInt2963 - arg12 * (local64 + -1)) / 2 + this.aClass110_9.anInt2963 + arg14;
		} else if (arg10 == 2) {
			local123 = arg14 + arg0 - arg12 * (local64 - 1) - this.aClass110_9.anInt2957;
		} else {
			local108 = (arg0 - arg12 * (local64 - 1) - this.aClass110_9.anInt2963 - this.aClass110_9.anInt2957) / (local64 + 1);
			if (local108 < 0) {
				local108 = 0;
			}
			local123 = local108 + arg14 + this.aClass110_9.anInt2963;
			arg12 += local108;
		}
		for (local108 = 0; local108 < local64; local108++) {
			if (arg9 == 0) {
				this.method5110(arg8, Static134.aStringArray37[local108], arg11, arg7, local123, arg4, arg2, arg6);
			} else if (arg9 == 1) {
				this.method5110(arg8 + (arg1 - this.aClass110_9.method2413(Static134.aStringArray37[local108])) / 2, Static134.aStringArray37[local108], arg11, arg7, local123, arg4, arg2, arg6);
			} else if (arg9 == 2) {
				this.method5110(arg1 + arg8 - this.aClass110_9.method2413(Static134.aStringArray37[local108]), Static134.aStringArray37[local108], arg11, arg7, local123, arg4, arg2, arg6);
			} else if (local108 == local64 - 1) {
				this.method5110(arg8, Static134.aStringArray37[local108], arg11, arg7, local123, arg4, arg2, arg6);
			} else {
				this.method5099(Static134.aStringArray37[local108], arg1);
				this.method5110(arg8, Static134.aStringArray37[local108], arg11, arg7, local123, arg4, arg2, arg6);
				Static53.anInt1108 = 0;
			}
			local123 += arg12;
		}
		return local64;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([I[II[IIILjava/lang/String;[Lclient!dp;)V")
	private void method5097(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class51[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass110_9.anInt2954;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg5.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static158.method2162(arg5.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local18 = local27;
			} else {
				@Pc(132) int local132;
				@Pc(142) int local142;
				if (local38 == '>' && local18 != -1) {
					@Pc(60) String local60 = arg5.substring(local18 + 1, local27);
					local18 = -1;
					if (local60.equals("lt")) {
						local38 = '<';
					} else if (local60.equals("gt")) {
						local38 = '>';
					} else if (local60.equals("nbsp")) {
						local38 = ' ';
					} else if (local60.equals("shy")) {
						local38 = '\u00ad';
					} else if (local60.equals("times")) {
						local38 = '×';
					} else if (local60.equals("euro")) {
						local38 = '€';
					} else if (local60.equals("copy")) {
						local38 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local132 = 0;
									} else {
										local132 = arg3[local22];
									}
									if (arg0 == null) {
										local142 = 0;
									} else {
										local142 = arg0[local22];
									}
									local22++;
									@Pc(155) int local155 = Static147.method2202(local60.substring(4));
									@Pc(159) Class51 local159 = arg6[local155];
									@Pc(168) int local168 = arg1 == null ? local159.method4673() : arg1[local155];
									local159.method4671(arg4 + local132, -local168 + local7 - (-this.aClass110_9.anInt2954 - local142), 0, 0);
									local20 = -1;
									arg4 += arg6[local155].method4682();
								} catch (@Pc(199) Exception local199) {
								}
							} else {
								this.method5095(local60);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg4 += this.aClass110_9.method2420(local38, local20);
					}
					@Pc(227) int local227;
					if (arg3 == null) {
						local227 = 0;
					} else {
						local227 = arg3[local22];
					}
					if (arg0 == null) {
						local132 = 0;
					} else {
						local132 = arg0[local22];
					}
					if (local38 != ' ') {
						if ((Static143.anInt2674 & 0xFF000000) != 0) {
							this.method5089(local38, local227 + arg4 + 1, local132 + 1 + local7, Static143.anInt2674, true);
						}
						this.method5089(local38, local227 + arg4, local132 + local7, Static208.anInt3628, false);
					} else if (Static53.anInt1108 > 0) {
						Static323.anInt5474 += Static53.anInt1108;
						arg4 += Static323.anInt5474 >> 8;
						Static323.anInt5474 &= 0xFF;
					}
					local22++;
					local142 = this.aClass110_9.method2419(local38);
					if (Static122.anInt2189 != -1) {
						this.aClass164_9.method5395(local7 + (int) ((double) this.aClass110_9.anInt2954 * 0.7D), local142, Static122.anInt2189, arg4);
					}
					if (Static261.anInt4557 != -1) {
						this.aClass164_9.method5395(this.aClass110_9.anInt2954 + local7, local142, Static261.anInt4557, arg4);
					}
					arg4 += local142;
					local20 = local38;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIBLjava/lang/String;I)V")
	public final void method5098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5106(arg0, arg1);
			this.method5110(arg2 - this.aClass110_9.method2413(arg3) / 2, arg3, null, null, arg4, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method5099(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<') {
				local9 = true;
			} else if (local25 == '>') {
				local9 = false;
			} else if (!local9 && local25 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static53.anInt1108 = (arg1 - this.aClass110_9.method2413(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;IBII)V")
	public final void method5101(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5106(arg0, arg3);
			this.method5110(arg2, arg1, null, null, arg4, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method5102(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5106(-16777216, arg0);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			local19[local29] = (int) (Math.sin((double) arg3 / 5.0D + (double) local29 / 5.0D) * 5.0D);
			local22[local29] = (int) (Math.sin((double) local29 / 3.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5097(local22, null, arg2, local19, arg4 - this.aClass110_9.method2413(arg1) / 2, arg1, null);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method5104(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method5106(-16777216, arg3);
		@Pc(26) double local26 = 7.0D - (double) arg1 / 8.0D;
		if (local26 < 0.0D) {
			local26 = 0.0D;
		}
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
			local38[local40] = (int) (Math.sin((double) local40 / 1.5D + (double) arg4) * local26);
		}
		this.method5097(local38, null, arg2, null, arg5 - this.aClass110_9.method2413(arg0) / 2, arg0, null);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(CIIIZLclient!us;II)V")
	protected abstract void method5105(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class34 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIB)V")
	private void method5106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static323.anInt5474 = 0;
		Static122.anInt2189 = -1;
		Static36.anInt706 = arg1;
		Static208.anInt3628 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static53.anInt1108 = 0;
		Static261.anInt4557 = -1;
		Static333.anInt855 = arg0;
		Static143.anInt2674 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIII[I[Lclient!dp;)V")
	public final void method5109(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) Class51[] arg5) {
		if (arg0 != null) {
			this.method5106(0, arg3);
			this.method5110(arg1, arg0, arg5, arg4, arg2, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILjava/lang/String;[Lclient!dp;[IIIILclient!us;)V")
	private void method5110(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class51[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class34 arg7) {
		@Pc(7) int local7 = arg4 - this.aClass110_9.anInt2954;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			@Pc(35) char local35 = (char) (Static158.method2162(arg1.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(57) String local57 = arg1.substring(local13 + 1, local24);
					local13 = -1;
					if (local57.equals("lt")) {
						local35 = '<';
					} else if (local57.equals("gt")) {
						local35 = '>';
					} else if (local57.equals("nbsp")) {
						local35 = ' ';
					} else if (local57.equals("shy")) {
						local35 = '\u00ad';
					} else if (local57.equals("times")) {
						local35 = '×';
					} else if (local57.equals("euro")) {
						local35 = '€';
					} else if (local57.equals("copy")) {
						local35 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									@Pc(125) int local125 = Static147.method2202(local57.substring(4));
									@Pc(129) Class51 local129 = arg2[local125];
									@Pc(138) int local138 = arg3 == null ? local129.method4673() : arg3[local125];
									if ((Static208.anInt3628 & 0xFF000000) == -16777216) {
										local129.method4671(arg0, this.aClass110_9.anInt2954 + local7 - local138, 0, 0);
									} else {
										local129.method4671(arg0, local7 + this.aClass110_9.anInt2954 - local138, 1, Static208.anInt3628 & 0xFF000000 | 0xFFFFFF);
									}
									local15 = -1;
									arg0 += arg2[local125].method4682();
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method5095(local57);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass110_9.method2420(local35, local15);
					}
					if (local35 == ' ') {
						if (Static53.anInt1108 > 0) {
							Static323.anInt5474 += Static53.anInt1108;
							arg0 += Static323.anInt5474 >> 8;
							Static323.anInt5474 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static143.anInt2674 & 0xFF000000) != 0) {
							this.method5089(local35, arg0 + 1, local7 - -1, Static143.anInt2674, true);
						}
						this.method5089(local35, arg0, local7, Static208.anInt3628, false);
					} else {
						if ((Static143.anInt2674 & 0xFF000000) != 0) {
							this.method5105(local35, arg0 + 1, local7 + 1, Static143.anInt2674, true, arg7, arg6, arg5);
						}
						this.method5105(local35, arg0, local7, Static208.anInt3628, false, arg7, arg6, arg5);
					}
					@Pc(306) int local306 = this.aClass110_9.method2419(local35);
					if (Static122.anInt2189 != -1) {
						this.aClass164_9.method5395(local7 + (int) ((double) this.aClass110_9.anInt2954 * 0.7D), local306, Static122.anInt2189, arg0);
					}
					if (Static261.anInt4557 != -1) {
						this.aClass164_9.method5395(local7 + this.aClass110_9.anInt2954 + 1, local306, Static261.anInt4557, arg0);
					}
					arg0 += local306;
					local15 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III[Lclient!dp;ILjava/lang/String;ZILjava/util/Random;[I)I")
	public final int method5111(@OriginalArg(2) int arg0, @OriginalArg(3) Class51[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) int[] arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg5.setSeed((long) arg4);
		@Pc(25) int local25 = (arg5.nextInt() & 0x1F) + 192;
		this.method5106((local25 | 0x0) << 24, local25 << 24 | 0xFFFFFF);
		@Pc(45) int local45 = arg3.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg5.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method5097(null, arg6, arg0, local48, arg2, arg3, arg1);
		return local50;
	}
}
