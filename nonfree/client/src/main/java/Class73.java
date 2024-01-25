import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class73 {

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!ed;")
	private final Class82 aClass82_12;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!oa;")
	private final Class9 aClass9_13;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!oa;Lclient!ed;)V")
	protected Class73(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class82 arg1) {
		this.aClass82_12 = arg1;
		this.aClass9_13 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;BIIIII)V")
	public final void method7879(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7882(-16777216, arg3);
		@Pc(21) int local21 = arg0.length();
		@Pc(24) int[] local24 = new int[local21];
		for (@Pc(26) int local26 = 0; local26 < local21; local26++) {
			local24[local26] = (int) (Math.sin((double) local26 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7887(arg1, arg0, local24, null, arg2 - this.aClass82_12.method2292(arg0) / 2, null, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method7880(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static581.anInt9825 = Static581.anInt9825 & 0xFF000000 | Static288.method4720(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static581.anInt9825 = Static484.anInt8776 & 0xFFFFFF | Static581.anInt9825 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static581.anInt9825 = Static288.method4720(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static581.anInt9825 = Static484.anInt8776;
			} else if (arg0.startsWith("str=")) {
				Static499.anInt8898 = Static581.anInt9825 & 0xFF000000 | Static288.method4720(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static499.anInt8898 = Static581.anInt9825 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static499.anInt8898 = -1;
			} else if (arg0.startsWith("u=")) {
				Static177.anInt3969 = Static581.anInt9825 & 0xFF000000 | Static288.method4720(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static177.anInt3969 = Static581.anInt9825 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static177.anInt3969 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static71.anInt1726 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static71.anInt1726 = Static581.anInt9825 & 0xFF000000 | Static288.method4720(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static71.anInt1726 = Static581.anInt9825 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static71.anInt1726 = Static261.anInt5258;
			} else if (arg0.equals("br")) {
				this.method7882(Static261.anInt5258, Static484.anInt8776);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;B[ILjava/lang/String;Ljava/util/Random;IIIII)I")
	public final int method7881(@OriginalArg(0) Class66[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg3.setSeed((long) arg6);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method7882((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(61) int local61 = arg2.length();
		@Pc(64) int[] local64 = new int[local61];
		@Pc(66) int local66 = 0;
		for (@Pc(68) int local68 = 0; local68 < local61; local68++) {
			local64[local68] = local66;
			if ((arg3.nextInt() & 0x3) == 0) {
				local66++;
			}
		}
		this.method7887(arg4, arg2, null, local64, arg5, arg1, arg0);
		return local66;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)V")
	private void method7882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static305.anInt5752 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static499.anInt8898 = -1;
		Static177.anInt3969 = -1;
		Static484.anInt8776 = arg1;
		Static581.anInt9825 = arg1;
		Static539.anInt9278 = 0;
		Static261.anInt5258 = arg0;
		Static71.anInt1726 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
	protected abstract void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;ILclient!fa;I[Lclient!xa;II[I)V")
	private void method7883(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(5) Class66[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg2 - this.aClass82_12.anInt2528;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(23) int local23 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static139.method2605(arg1.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local18 = local25;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(61) String local61 = arg1.substring(local18 + 1, local25);
					local18 = -1;
					if (local61.equals("lt")) {
						local36 = '<';
					} else if (local61.equals("gt")) {
						local36 = '>';
					} else if (local61.equals("nbsp")) {
						local36 = ' ';
					} else if (local61.equals("shy")) {
						local36 = '\u00ad';
					} else if (local61.equals("times")) {
						local36 = '×';
					} else if (local61.equals("euro")) {
						local36 = '€';
					} else if (local61.equals("copy")) {
						local36 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									@Pc(127) int local127 = Static228.method4072(local61.substring(4));
									@Pc(131) Class66 local131 = arg4[local127];
									@Pc(140) int local140 = arg7 == null ? local131.a() : arg7[local127];
									if ((Static581.anInt9825 & 0xFF000000) == -16777216) {
										local131.I(arg0, local7 + this.aClass82_12.anInt2528 - local140, 1, 0, 1);
									} else {
										local131.I(arg0, local7 + this.aClass82_12.anInt2528 - local140, 0, Static581.anInt9825 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local20 = -1;
									arg0 += arg4[local127].AA();
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method7880(local61);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg0 += this.aClass82_12.method2296(local20, local36);
					}
					if (local36 == ' ') {
						if (Static305.anInt5752 > 0) {
							Static539.anInt9278 += Static305.anInt5752;
							arg0 += Static539.anInt9278 >> 8;
							Static539.anInt9278 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static71.anInt1726 & 0xFF000000) != 0) {
							this.q(local36, arg0 + 1, local7 + 1, Static71.anInt1726, true);
						}
						this.q(local36, arg0, local7, Static581.anInt9825, false);
					} else {
						if ((Static71.anInt1726 & 0xFF000000) != 0) {
							this.method7900(local36, arg0 + 1, local7 - -1, Static71.anInt1726, true, arg3, arg6, arg5);
						}
						this.method7900(local36, arg0, local7, Static581.anInt9825, false, arg3, arg6, arg5);
					}
					@Pc(315) int local315 = this.aClass82_12.method2289(local36);
					if (Static499.anInt8898 != -1) {
						this.aClass9_13.method5397(Static499.anInt8898, local315, local7 + (int) ((double) this.aClass82_12.anInt2528 * 0.7D), arg0);
					}
					if (Static177.anInt3969 != -1) {
						this.aClass9_13.method5397(Static177.anInt3969, local315, this.aClass82_12.anInt2528 + local7 + 1, arg0);
					}
					arg0 += local315;
					local20 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!xa;IIII[IIILjava/util/Random;I[II)I")
	public final int method7884(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class66[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Random arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg10.setSeed((long) arg9);
		@Pc(20) int local20 = (arg10.nextInt() & 0x1F) + 192;
		this.method7882(arg3 & 0xFFFFFF | local20 << 24, local20 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(49) int[] local49 = new int[local40];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local40; local53++) {
			local49[local53] = local51;
			if ((arg10.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		@Pc(78) int local78 = arg8;
		@Pc(85) int local85 = arg1 + this.aClass82_12.anInt2530;
		@Pc(87) int local87 = -1;
		if (arg11 == 1) {
			local85 += (arg4 - this.aClass82_12.anInt2530 - this.aClass82_12.anInt2524) / 2;
		} else if (arg11 == 2) {
			local85 = arg4 + arg1 - this.aClass82_12.anInt2524;
		}
		if (arg13 == 1) {
			local87 = local51 + this.aClass82_12.method2292(arg0);
			local78 = arg8 + (arg5 - local87) / 2;
		} else if (arg13 == 2) {
			local87 = local51 + this.aClass82_12.method2292(arg0);
			local78 = arg8 + arg5 - local87;
		}
		this.method7887(local85, arg0, null, local49, local78, arg7, arg2);
		if (arg12 != null) {
			if (local87 == -1) {
				local87 = local51 + this.aClass82_12.method2292(arg0);
			}
			arg12[1] = local85 - this.aClass82_12.anInt2530;
			arg12[0] = local78;
			arg12[3] = this.aClass82_12.anInt2524 + this.aClass82_12.anInt2530;
			arg12[2] = local87;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[II[Lclient!xa;IIILclient!fa;IIILjava/lang/String;IIIII)I")
	public final int method7885(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class19 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) String arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method7882(arg13, arg10);
		if (arg5 == 0) {
			arg5 = this.aClass82_12.anInt2528;
		}
		@Pc(47) int[] local47;
		if (this.aClass82_12.anInt2524 + this.aClass82_12.anInt2530 + arg5 > arg9 && arg5 + arg5 > arg9) {
			local47 = null;
		} else {
			local47 = new int[] { arg15 };
		}
		@Pc(65) int local65 = this.aClass82_12.method2291(arg11, arg3, Static155.aStringArray43, local47);
		if (arg6 == -1) {
			arg6 = arg9 / arg5;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		if (arg6 > 0 && local65 >= arg6) {
			local65 = arg6;
			Static155.aStringArray43[arg6 - 1] = this.aClass82_12.method2286(arg3, Static155.aStringArray43[arg6 - 1], arg15);
		}
		if (arg4 == 3 && local65 == 1) {
			arg4 = 1;
		}
		@Pc(122) int local122;
		@Pc(181) int local181;
		if (arg4 == 0) {
			local122 = arg12 + this.aClass82_12.anInt2530;
		} else if (arg4 == 1) {
			local122 = this.aClass82_12.anInt2530 + arg12 + (-(arg5 * (local65 + -1)) + -this.aClass82_12.anInt2530 + (arg9 - this.aClass82_12.anInt2524)) / 2;
		} else if (arg4 == 2) {
			local122 = arg9 + arg12 - this.aClass82_12.anInt2524 - (local65 + -1) * arg5;
		} else {
			local181 = (arg9 - this.aClass82_12.anInt2530 - this.aClass82_12.anInt2524 - arg5 * (local65 + -1)) / (local65 + 1);
			if (local181 < 0) {
				local181 = 0;
			}
			local122 = arg12 + this.aClass82_12.anInt2530 + local181;
			arg5 += local181;
		}
		for (local181 = 0; local181 < local65; local181++) {
			if (arg8 == 0) {
				this.method7883(arg14, Static155.aStringArray43[local181], local122, arg7, arg3, arg0, arg2, arg1);
			} else if (arg8 == 1) {
				this.method7883((arg15 - this.aClass82_12.method2292(Static155.aStringArray43[local181])) / 2 + arg14, Static155.aStringArray43[local181], local122, arg7, arg3, arg0, arg2, arg1);
			} else if (arg8 == 2) {
				this.method7883(arg15 + arg14 - this.aClass82_12.method2292(Static155.aStringArray43[local181]), Static155.aStringArray43[local181], local122, arg7, arg3, arg0, arg2, arg1);
			} else if (local181 == local65 - 1) {
				this.method7883(arg14, Static155.aStringArray43[local181], local122, arg7, arg3, arg0, arg2, arg1);
			} else {
				this.method7886(Static155.aStringArray43[local181], arg15);
				this.method7883(arg14, Static155.aStringArray43[local181], local122, arg7, arg3, arg0, arg2, arg1);
				Static305.anInt5752 = 0;
			}
			local122 += arg5;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method7886(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
			@Pc(22) char local22 = arg0.charAt(local11);
			if (local22 == '<') {
				local9 = true;
			} else if (local22 == '>') {
				local9 = false;
			} else if (!local9 && local22 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static305.anInt5752 = (arg1 - this.aClass82_12.method2292(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;[IZ[II[I[Lclient!xa;)V")
	private void method7887(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class66[] arg6) {
		@Pc(7) int local7 = arg0 - this.aClass82_12.anInt2528;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static139.method2605(arg1.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local19 = local28;
			} else {
				@Pc(134) int local134;
				@Pc(144) int local144;
				if (local39 == '>' && local19 != -1) {
					@Pc(62) String local62 = arg1.substring(local19 + 1, local28);
					local19 = -1;
					if (local62.equals("lt")) {
						local39 = '<';
					} else if (local62.equals("gt")) {
						local39 = '>';
					} else if (local62.equals("nbsp")) {
						local39 = ' ';
					} else if (local62.equals("shy")) {
						local39 = '\u00ad';
					} else if (local62.equals("times")) {
						local39 = '×';
					} else if (local62.equals("euro")) {
						local39 = '€';
					} else if (local62.equals("copy")) {
						local39 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local134 = 0;
									} else {
										local134 = arg3[local23];
									}
									if (arg2 == null) {
										local144 = 0;
									} else {
										local144 = arg2[local23];
									}
									local23++;
									@Pc(155) int local155 = Static228.method4072(local62.substring(4));
									@Pc(159) Class66 local159 = arg6[local155];
									@Pc(168) int local168 = arg5 == null ? local159.a() : arg5[local155];
									local159.I(local134 + arg4, local144 + this.aClass82_12.anInt2528 + local7 + -local168, 1, 0, 1);
									local21 = -1;
									arg4 += arg6[local155].AA();
								} catch (@Pc(197) Exception local197) {
								}
							} else {
								this.method7880(local62);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local19 == -1) {
					if (local21 != -1) {
						arg4 += this.aClass82_12.method2296(local21, local39);
					}
					@Pc(227) int local227;
					if (arg3 == null) {
						local227 = 0;
					} else {
						local227 = arg3[local23];
					}
					if (arg2 == null) {
						local134 = 0;
					} else {
						local134 = arg2[local23];
					}
					local23++;
					if (local39 != ' ') {
						if ((Static71.anInt1726 & 0xFF000000) != 0) {
							this.q(local39, local227 + arg4 + 1, local134 + 1 + local7, Static71.anInt1726, true);
						}
						this.q(local39, local227 + arg4, local134 + local7, Static581.anInt9825, false);
					} else if (Static305.anInt5752 > 0) {
						Static539.anInt9278 += Static305.anInt5752;
						arg4 += Static539.anInt9278 >> 8;
						Static539.anInt9278 &= 0xFF;
					}
					local144 = this.aClass82_12.method2289(local39);
					if (Static499.anInt8898 != -1) {
						this.aClass9_13.method5397(Static499.anInt8898, local144, local7 + (int) ((double) this.aClass82_12.anInt2528 * 0.7D), arg4);
					}
					if (Static177.anInt3969 != -1) {
						this.aClass9_13.method5397(Static177.anInt3969, local144, this.aClass82_12.anInt2528 + local7, arg4);
					}
					local21 = local39;
					arg4 += local144;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method7888(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7882(arg2, arg1);
			this.method7883(arg3, arg0, arg4, null, null, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILclient!fa;IIIIIIILjava/lang/String;I[Lclient!xa;Z[I)I")
	public final int method7891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class66[] arg12, @OriginalArg(15) int[] arg13) {
		return this.method7885(arg4, arg13, arg0, arg12, arg9, 0, 0, arg3, arg6, arg5, arg8, arg10, arg1, arg2, arg7, arg11);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7882(arg4, arg3);
			this.method7883(arg0 - this.aClass82_12.method2292(arg2) / 2, arg2, arg1, null, null, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;BII)V")
	public final void method7893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7882(arg1, arg3);
			this.method7883(arg0 - this.aClass82_12.method2292(arg2), arg2, arg4, null, null, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method7896(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7882(-16777216, arg1);
		@Pc(16) int local16 = arg3.length();
		@Pc(27) int[] local27 = new int[local16];
		@Pc(30) int[] local30 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7887(arg2, arg3, local30, local27, arg0 - this.aClass82_12.method2292(arg3) / 2, null, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public final void method7898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method7882(-16777216, arg3);
		@Pc(20) double local20 = 7.0D - (double) arg4 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg2.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (local20 * Math.sin((double) arg1 + (double) local34 / 1.5D));
		}
		this.method7887(arg0, arg2, local32, null, arg5 - this.aClass82_12.method2292(arg2) / 2, null, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;IIILjava/lang/String;[III)V")
	public final void method7899(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method7882(0, arg1);
			this.method7883(arg2, arg3, arg5, null, arg0, 0, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	protected abstract void method7900(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
