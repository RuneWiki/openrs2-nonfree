import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public abstract class Class71 {

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "Lclient!dr;")
	private final Class37 aClass37_9;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!go;")
	private final Class82 aClass82_8;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!dr;Lclient!go;)V")
	protected Class71(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class82 arg1) {
		this.aClass37_9 = arg0;
		this.aClass82_8 = arg1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBI)V")
	private void method5231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static149.anInt3400 = -1;
		Static280.anInt5668 = arg1;
		Static109.anInt2278 = arg1;
		Static244.anInt5185 = 0;
		Static84.anInt1573 = -1;
		Static335.anInt6498 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static75.anInt1414 = arg0;
		Static242.anInt5659 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5231(arg1, arg0);
			this.method5241(arg4, 0, arg3 - this.aClass82_8.method2230(arg4) / 2, null, 0, null, null, arg2);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public final void method5234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method5231(-16777216, arg0);
		@Pc(20) double local20 = 7.0D - (double) arg4 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(34) int local34 = arg2.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
			local37[local39] = (int) (local20 * Math.sin((double) local39 / 1.5D + (double) arg5));
		}
		this.method5248(arg2, null, arg1, null, local37, null, arg3 - this.aClass82_8.method2230(arg2) / 2);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method5235(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method5231(-1, arg0);
			this.method5241(arg1, 0, arg3 - this.aClass82_8.method2230(arg1), null, 0, null, null, arg2);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5236(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
			@Pc(17) char local17 = arg0.charAt(local11);
			if (local17 == '<') {
				local9 = true;
			} else if (local17 == '>') {
				local9 = false;
			} else if (!local9 && local17 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static335.anInt6498 = (arg1 - this.aClass82_8.method2230(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII[I[Lclient!kr;IILjava/lang/String;IILjava/util/Random;II[I)I")
	public final int method5237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class46[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Random arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg10.setSeed((long) arg6);
		@Pc(20) int local20 = (arg10.nextInt() & 0x1F) + 192;
		this.method5231(local20 << 24 | arg9 & 0xFFFFFF, local20 << 24 | arg0 & 0xFFFFFF);
		@Pc(40) int local40 = arg7.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg10.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg12;
		@Pc(75) int local75 = arg1 + this.aClass82_8.anInt2404;
		@Pc(77) int local77 = -1;
		if (arg11 == 1) {
			local75 += (arg2 - this.aClass82_8.anInt2404 - this.aClass82_8.anInt2400) / 2;
		} else if (arg11 == 2) {
			local75 = arg2 + arg1 - this.aClass82_8.anInt2400;
		}
		if (arg3 == 1) {
			local77 = this.aClass82_8.method2230(arg7) + local45;
			local69 = arg12 + (arg8 - local77) / 2;
		} else if (arg3 == 2) {
			local77 = this.aClass82_8.method2230(arg7) + local45;
			local69 = arg12 + arg8 - local77;
		}
		this.method5248(arg7, arg13, local75, arg5, null, local43, local69);
		if (arg4 != null) {
			if (local77 == -1) {
				local77 = this.aClass82_8.method2230(arg7) + local45;
			}
			arg4[0] = local69;
			arg4[2] = local77;
			arg4[3] = this.aClass82_8.anInt2404 + this.aClass82_8.anInt2400;
			arg4[1] = local75 - this.aClass82_8.anInt2404;
		}
		return local45;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;BIILclient!or;I[Lclient!kr;[II)V")
	private void method5241(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class124 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class46[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg7 - this.aClass82_8.anInt2403;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static263.method4649(arg0.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local18 = local25;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(61) String local61 = arg0.substring(local18 + 1, local25);
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
									@Pc(129) int local129 = Static16.method250(local61.substring(4));
									@Pc(133) Class46 local133 = arg5[local129];
									@Pc(142) int local142 = arg6 == null ? local133.method5022() : arg6[local129];
									if ((Static109.anInt2278 & 0xFF000000) == -16777216) {
										local133.method5034(arg2, this.aClass82_8.anInt2403 + local16 - local142, 0, 0);
									} else {
										local133.method5034(arg2, local16 + this.aClass82_8.anInt2403 - local142, 1, Static109.anInt2278 & 0xFF000000 | 0xFFFFFF);
									}
									arg2 += arg5[local129].method5031();
									local20 = -1;
								} catch (@Pc(195) Exception local195) {
								}
							} else {
								this.method5243(local61);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg2 += this.aClass82_8.method2228(local20, local36);
					}
					if (local36 == ' ') {
						if (Static335.anInt6498 > 0) {
							Static244.anInt5185 += Static335.anInt6498;
							arg2 += Static244.anInt5185 >> 8;
							Static244.anInt5185 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static242.anInt5659 & 0xFF000000) != 0) {
							this.method5247(local36, arg2 + 1, local16 + 1, Static242.anInt5659, true);
						}
						this.method5247(local36, arg2, local16, Static109.anInt2278, false);
					} else {
						if ((Static242.anInt5659 & 0xFF000000) != 0) {
							this.method5249(local36, arg2 + 1, local16 + 1, Static242.anInt5659, true, arg3, arg1, arg4);
						}
						this.method5249(local36, arg2, local16, Static109.anInt2278, false, arg3, arg1, arg4);
					}
					@Pc(317) int local317 = this.aClass82_8.method2233(local36);
					if (Static149.anInt3400 != -1) {
						this.aClass37_9.method3660(local317, local16 + (int) ((double) this.aClass82_8.anInt2403 * 0.7D), arg2, Static149.anInt3400);
					}
					if (Static84.anInt1573 != -1) {
						this.aClass37_9.method3660(local317, this.aClass82_8.anInt2403 + local16 + 1, arg2, Static84.anInt1573);
					}
					arg2 += local317;
					local20 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIZIILjava/lang/String;)V")
	public final void method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5231(-16777216, arg2);
		@Pc(27) int local27 = arg4.length();
		@Pc(30) int[] local30 = new int[local27];
		for (@Pc(32) int local32 = 0; local32 < local27; local32++) {
			local30[local32] = (int) (Math.sin((double) arg0 / 5.0D + (double) local32 / 2.0D) * 5.0D);
		}
		this.method5248(arg4, null, arg1, null, local30, null, arg3 - this.aClass82_8.method2230(arg4) / 2);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method5243(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static109.anInt2278 = Static109.anInt2278 & 0xFF000000 | Static182.method2437(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static109.anInt2278 = Static109.anInt2278 & 0xFF000000 | Static280.anInt5668 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static109.anInt2278 = Static182.method2437(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static109.anInt2278 = Static280.anInt5668;
			} else if (arg0.startsWith("str=")) {
				Static149.anInt3400 = Static182.method2437(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static149.anInt3400 = -8388608;
			} else if (arg0.equals("/str")) {
				Static149.anInt3400 = -1;
			} else if (arg0.startsWith("u=")) {
				Static84.anInt1573 = Static182.method2437(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static84.anInt1573 = -16777216;
			} else if (arg0.equals("/u")) {
				Static84.anInt1573 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static242.anInt5659 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static242.anInt5659 = Static182.method2437(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static242.anInt5659 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static242.anInt5659 = Static75.anInt1414;
			} else if (arg0.equals("br")) {
				this.method5231(Static75.anInt1414, Static280.anInt5668);
			}
		} catch (@Pc(169) Exception local169) {
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
	public final void method5244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5231(-16777216, arg1);
		@Pc(20) int local20 = arg4.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg3 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) arg3 / 5.0D + (double) local28 / 3.0D) * 5.0D);
		}
		this.method5248(arg4, null, arg2, null, local26, local23, arg0 - this.aClass82_8.method2230(arg4) / 2);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([I[Lclient!kr;IIIILjava/lang/String;I)V")
	public final void method5245(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 != null) {
			this.method5231(0, arg5);
			this.method5241(arg4, 0, arg2, null, 0, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII[II[Lclient!kr;IIILclient!or;Ljava/lang/String;III)I")
	public final int method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class46[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class124 arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg11 == null) {
			return 0;
		}
		this.method5231(arg1, arg2);
		if (arg12 == 0) {
			arg12 = this.aClass82_8.anInt2403;
		}
		@Pc(58) int[] local58;
		if (arg12 + this.aClass82_8.anInt2404 + this.aClass82_8.anInt2400 > arg0 && arg12 + arg12 > arg0) {
			local58 = null;
		} else {
			local58 = new int[] { arg9 };
		}
		@Pc(71) int local71 = this.aClass82_8.method2235(local58, arg7, arg11, Static78.aStringArray7);
		if (arg13 == 3 && local71 == 1) {
			arg13 = 1;
		}
		@Pc(92) int local92;
		@Pc(171) int local171;
		if (arg13 == 0) {
			local92 = arg8 + this.aClass82_8.anInt2404;
		} else if (arg13 == 1) {
			local92 = (arg0 - arg12 * (local71 - 1) - this.aClass82_8.anInt2400 - this.aClass82_8.anInt2404) / 2 + this.aClass82_8.anInt2404 + arg8;
		} else if (arg13 == 2) {
			local92 = arg0 + arg8 - this.aClass82_8.anInt2400 - (local71 - 1) * arg12;
		} else {
			local171 = (arg0 - this.aClass82_8.anInt2404 - this.aClass82_8.anInt2400 - (local71 + -1) * arg12) / (local71 + 1);
			if (local171 < 0) {
				local171 = 0;
			}
			local92 = local171 + this.aClass82_8.anInt2404 + arg8;
			arg12 += local171;
		}
		for (local171 = 0; local171 < local71; local171++) {
			if (arg14 == 0) {
				this.method5241(Static78.aStringArray7[local171], arg3, arg6, arg10, arg4, arg7, arg5, local92);
			} else if (arg14 == 1) {
				this.method5241(Static78.aStringArray7[local171], arg3, (arg9 - this.aClass82_8.method2230(Static78.aStringArray7[local171])) / 2 + arg6, arg10, arg4, arg7, arg5, local92);
			} else if (arg14 == 2) {
				this.method5241(Static78.aStringArray7[local171], arg3, arg9 + arg6 - this.aClass82_8.method2230(Static78.aStringArray7[local171]), arg10, arg4, arg7, arg5, local92);
			} else if (local71 - 1 == local171) {
				this.method5241(Static78.aStringArray7[local171], arg3, arg6, arg10, arg4, arg7, arg5, local92);
			} else {
				this.method5236(Static78.aStringArray7[local171], arg9);
				this.method5241(Static78.aStringArray7[local171], arg3, arg6, arg10, arg4, arg7, arg5, local92);
				Static335.anInt6498 = 0;
			}
			local92 += arg12;
		}
		return local71;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5247(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;[III[Lclient!kr;[I[II)V")
	private void method5248(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class46[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg2 - this.aClass82_8.anInt2403;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg0.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static263.method4649(arg0.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(107) int local107;
				@Pc(115) int local115;
				if (local33 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg0.substring(local13 + 1, local22);
					local13 = -1;
					if (local55.equals("lt")) {
						local33 = '<';
					} else if (local55.equals("gt")) {
						local33 = '>';
					} else if (local55.equals("nbsp")) {
						local33 = ' ';
					} else if (local55.equals("shy")) {
						local33 = '\u00ad';
					} else if (local55.equals("times")) {
						local33 = '×';
					} else if (local55.equals("euro")) {
						local33 = '€';
					} else if (local55.equals("copy")) {
						local33 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local107 = 0;
									} else {
										local107 = arg5[local17];
									}
									if (arg4 == null) {
										local115 = 0;
									} else {
										local115 = arg4[local17];
									}
									local17++;
									@Pc(128) int local128 = Static16.method250(local55.substring(4));
									@Pc(132) Class46 local132 = arg3[local128];
									@Pc(141) int local141 = arg1 == null ? local132.method5022() : arg1[local128];
									local132.method5034(arg6 + local107, local115 + -local141 + this.aClass82_8.anInt2403 + local11, 0, 0);
									arg6 += arg3[local128].method5031();
									local15 = -1;
								} catch (@Pc(170) Exception local170) {
								}
							} else {
								this.method5243(local55);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass82_8.method2228(local15, local33);
					}
					@Pc(222) int local222;
					if (arg5 == null) {
						local222 = 0;
					} else {
						local222 = arg5[local17];
					}
					if (arg4 == null) {
						local107 = 0;
					} else {
						local107 = arg4[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static242.anInt5659 & 0xFF000000) != 0) {
							this.method5247(local33, local222 + arg6 + 1, local11 + 1 + local107, Static242.anInt5659, true);
						}
						this.method5247(local33, arg6 + local222, local107 + local11, Static109.anInt2278, false);
					} else if (Static335.anInt6498 > 0) {
						Static244.anInt5185 += Static335.anInt6498;
						arg6 += Static244.anInt5185 >> 8;
						Static244.anInt5185 &= 0xFF;
					}
					local115 = this.aClass82_8.method2233(local33);
					if (Static149.anInt3400 != -1) {
						this.aClass37_9.method3660(local115, local11 + (int) ((double) this.aClass82_8.anInt2403 * 0.7D), arg6, Static149.anInt3400);
					}
					if (Static84.anInt1573 != -1) {
						this.aClass37_9.method3660(local115, local11 + this.aClass82_8.anInt2403, arg6, Static84.anInt1573);
					}
					local15 = local33;
					arg6 += local115;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(CIIIZLclient!or;II)V")
	protected abstract void method5249(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class124 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5250(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5231(arg3, arg2);
			this.method5241(arg0, 0, arg4, null, 0, null, null, arg1);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I[I[Lclient!kr;ILjava/util/Random;IIII)I")
	public final int method5251(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class46[] arg3, @OriginalArg(5) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg4.setSeed((long) arg6);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method5231((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(45) int local45 = arg0.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method5248(arg0, arg2, arg5, arg3, null, local48, arg1);
		return local50;
	}
}
