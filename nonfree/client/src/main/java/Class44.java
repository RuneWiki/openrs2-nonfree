import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public abstract class Class44 {

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "Lclient!oj;")
	private final Class48 aClass48_8;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!bg;")
	private final Class24 aClass24_8;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!oj;Lclient!bg;)V")
	protected Class44(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class24 arg1) {
		this.aClass48_8 = arg0;
		this.aClass24_8 = arg1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(CIIIZLclient!hg;II)V")
	protected abstract void method4643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class8 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public final void method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method4648(arg1, arg0);
			this.method4657(arg4, null, null, 0, null, arg3 - this.aClass24_8.method325(arg4) / 2, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
	public final void method4645(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 != null) {
			this.method4648(-1, arg2);
			this.method4657(arg0, null, null, 0, null, arg1 - this.aClass24_8.method325(arg0), arg3, 0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[Lclient!rg;IIILjava/util/Random;I[III[IIILjava/lang/String;)I")
	public final int method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class27[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Random arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13) {
		if (arg13 == null) {
			return 0;
		}
		arg6.setSeed((long) arg9);
		@Pc(21) int local21 = (arg6.nextInt() & 0x1F) + 192;
		this.method4648(arg4 & 0xFFFFFF | local21 << 24, arg12 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg13.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg6.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(66) int local66 = arg5;
		@Pc(77) int local77 = arg0 + this.aClass24_8.anInt424;
		if (arg11 == 1) {
			local77 += (arg3 - this.aClass24_8.anInt418 - this.aClass24_8.anInt424) / 2;
		} else if (arg11 == 2) {
			local77 = arg3 + arg0 - this.aClass24_8.anInt418;
		}
		@Pc(114) int local114 = -1;
		if (arg1 == 1) {
			local114 = local46 + this.aClass24_8.method325(arg13);
			local66 = arg5 + (arg7 - local114) / 2;
		} else if (arg1 == 2) {
			local114 = local46 + this.aClass24_8.method325(arg13);
			local66 = arg5 + arg7 - local114;
		}
		this.method4662(local66, arg13, null, arg10, local44, local77, arg2);
		if (arg8 != null) {
			if (local114 == -1) {
				local114 = local46 + this.aClass24_8.method325(arg13);
			}
			arg8[3] = this.aClass24_8.anInt418 + this.aClass24_8.anInt424;
			arg8[2] = local114;
			arg8[1] = local77 - this.aClass24_8.anInt424;
			arg8[0] = local66;
		}
		return local46;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZII)V")
	private void method4648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static27.anInt2841 = arg1;
		Static23.anInt354 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static300.anInt5588 = 0;
		Static81.anInt1753 = -1;
		Static180.anInt3784 = -1;
		Static132.anInt2872 = 0;
		Static380.anInt6944 = arg0;
		Static339.anInt6262 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILjava/lang/String;IIBI)V")
	public final void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method4648(-16777216, arg3);
		@Pc(20) int local20 = arg2.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4662(arg1 - this.aClass24_8.method325(arg2) / 2, arg2, local26, null, local23, arg0, null);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method4650(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method4648(-16777216, arg4);
		@Pc(21) int local21 = arg0.length();
		@Pc(24) int[] local24 = new int[local21];
		for (@Pc(26) int local26 = 0; local26 < local21; local26++) {
			local24[local26] = (int) (Math.sin((double) arg1 / 5.0D + (double) local26 / 2.0D) * 5.0D);
		}
		this.method4662(arg2 - this.aClass24_8.method325(arg0) / 2, arg0, local24, null, null, arg3, null);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method4652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method4648(arg0, arg3);
			this.method4657(arg4, null, null, 0, null, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZILjava/lang/String;)V")
	private void method4653(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(16) int local16 = 0; arg1.length() > local16; local16++) {
			@Pc(22) char local22 = arg1.charAt(local16);
			if (local22 == '<') {
				local9 = true;
			} else if (local22 == '>') {
				local9 = false;
			} else if (!local9 && local22 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static132.anInt2872 = (arg0 - this.aClass24_8.method325(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method4654(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static23.anInt354 = Static23.anInt354 & 0xFF000000 | Static47.method608(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static23.anInt354 = Static23.anInt354 & 0xFF000000 | Static27.anInt2841 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static23.anInt354 = Static47.method608(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static23.anInt354 = Static27.anInt2841;
			} else if (arg0.startsWith("str=")) {
				Static180.anInt3784 = Static47.method608(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static180.anInt3784 = -8388608;
			} else if (arg0.equals("/str")) {
				Static180.anInt3784 = -1;
			} else if (arg0.startsWith("u=")) {
				Static81.anInt1753 = Static47.method608(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static81.anInt1753 = -16777216;
			} else if (arg0.equals("/u")) {
				Static81.anInt1753 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static339.anInt6262 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static339.anInt6262 = Static47.method608(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static339.anInt6262 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static339.anInt6262 = Static380.anInt6944;
			} else if (arg0.equals("br")) {
				this.method4648(Static380.anInt6944, Static27.anInt2841);
				return;
			}
		} catch (@Pc(160) Exception local160) {
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method4655(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;[Lclient!rg;Lclient!hg;I[IIIII)V")
	private void method4657(@OriginalArg(0) String arg0, @OriginalArg(1) Class27[] arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg6 - this.aClass24_8.anInt421;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static108.method1981(arg0.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(54) String local54 = arg0.substring(local13 + 1, local20);
					local13 = -1;
					if (local54.equals("lt")) {
						local31 = '<';
					} else if (local54.equals("gt")) {
						local31 = '>';
					} else if (local54.equals("nbsp")) {
						local31 = ' ';
					} else if (local54.equals("shy")) {
						local31 = '\u00ad';
					} else if (local54.equals("times")) {
						local31 = '×';
					} else if (local54.equals("euro")) {
						local31 = '€';
					} else if (local54.equals("copy")) {
						local31 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(128) int local128 = Static335.method5402(local54.substring(4));
									@Pc(132) Class27 local132 = arg1[local128];
									@Pc(141) int local141 = arg4 == null ? local132.method5328() : arg4[local128];
									if ((Static23.anInt354 & -16777216) == -16777216) {
										local132.method5319(arg5, this.aClass24_8.anInt421 + local11 - local141, 0, 0);
									} else {
										local132.method5319(arg5, this.aClass24_8.anInt421 + local11 - local141, 1, Static23.anInt354 & 0xFF000000 | 0xFFFFFF);
									}
									arg5 += arg1[local128].method5317();
									local15 = -1;
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method4654(local54);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass24_8.method323(local15, local31);
					}
					if (local31 == ' ') {
						if (Static132.anInt2872 > 0) {
							Static300.anInt5588 += Static132.anInt2872;
							arg5 += Static300.anInt5588 >> 8;
							Static300.anInt5588 &= 0xFF;
						}
					} else if (arg2 == null) {
						if ((Static339.anInt6262 & 0xFF000000) != 0) {
							this.method4655(local31, arg5 + 1, local11 + 1, Static339.anInt6262, true);
						}
						this.method4655(local31, arg5, local11, Static23.anInt354, false);
					} else {
						if ((Static339.anInt6262 & 0xFF000000) != 0) {
							this.method4643(local31, arg5 + 1, local11 + 1, Static339.anInt6262, true, arg2, arg3, arg7);
						}
						this.method4643(local31, arg5, local11, Static23.anInt354, false, arg2, arg3, arg7);
					}
					@Pc(304) int local304 = this.aClass24_8.method326(local31);
					if (Static180.anInt3784 != -1) {
						this.aClass48_8.method2493(Static180.anInt3784, arg5, (int) ((double) this.aClass24_8.anInt421 * 0.7D) + local11, local304);
					}
					if (Static81.anInt1753 != -1) {
						this.aClass48_8.method2493(Static81.anInt1753, arg5, this.aClass24_8.anInt421 + local11 + 1, local304);
					}
					local15 = local31;
					arg5 += local304;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([Lclient!rg;Ljava/lang/String;III[III)V")
	public final void method4658(@OriginalArg(0) Class27[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		if (arg1 != null) {
			this.method4648(0, arg2);
			this.method4657(arg1, arg0, null, 0, arg5, arg3, arg4, 0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IIIIIZI)V")
	public final void method4659(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method4648(-16777216, arg5);
		@Pc(21) double local21 = 7.0D - (double) arg4 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg0.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (local21 * Math.sin((double) arg2 + (double) local35 / 1.5D));
		}
		this.method4662(arg1 - this.aClass24_8.method325(arg0) / 2, arg0, local33, null, null, arg3, null);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!hg;I[IIIIII[Lclient!rg;ILjava/lang/String;IIII)I")
	public final int method4660(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class27[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg10 == null) {
			return 0;
		}
		this.method4648(arg11, arg14);
		if (arg12 == 0) {
			arg12 = this.aClass24_8.anInt421;
		}
		@Pc(47) int[] local47;
		if (arg13 < this.aClass24_8.anInt418 + this.aClass24_8.anInt424 + arg12 && arg12 + arg12 > arg13) {
			local47 = null;
		} else {
			local47 = new int[] { arg6 };
		}
		@Pc(65) int local65 = this.aClass24_8.method330(local47, Static278.aStringArray27, arg10, arg8);
		if (arg0 == 3 && local65 == 1) {
			arg0 = 1;
		}
		@Pc(84) int local84;
		@Pc(146) int local146;
		if (arg0 == 0) {
			local84 = this.aClass24_8.anInt424 + arg2;
		} else if (arg0 == 1) {
			local84 = (arg13 - this.aClass24_8.anInt424 - this.aClass24_8.anInt418 - (local65 + -1) * arg12) / 2 + arg2 + this.aClass24_8.anInt424;
		} else if (arg0 == 2) {
			local84 = arg2 + arg13 - this.aClass24_8.anInt418 - arg12 * (local65 + -1);
		} else {
			local146 = (arg13 - arg12 * (local65 - 1) - this.aClass24_8.anInt424 - this.aClass24_8.anInt418) / (local65 + 1);
			if (local146 < 0) {
				local146 = 0;
			}
			arg12 += local146;
			local84 = local146 + this.aClass24_8.anInt424 + arg2;
		}
		for (local146 = 0; local146 < local65; local146++) {
			if (arg4 == 0) {
				this.method4657(Static278.aStringArray27[local146], arg8, arg1, arg5, arg3, arg9, local84, arg7);
			} else if (arg4 == 1) {
				this.method4657(Static278.aStringArray27[local146], arg8, arg1, arg5, arg3, arg9 + (arg6 - this.aClass24_8.method325(Static278.aStringArray27[local146])) / 2, local84, arg7);
			} else if (arg4 == 2) {
				this.method4657(Static278.aStringArray27[local146], arg8, arg1, arg5, arg3, arg6 + arg9 - this.aClass24_8.method325(Static278.aStringArray27[local146]), local84, arg7);
			} else if (local65 - 1 == local146) {
				this.method4657(Static278.aStringArray27[local146], arg8, arg1, arg5, arg3, arg9, local84, arg7);
			} else {
				this.method4653(arg6, Static278.aStringArray27[local146]);
				this.method4657(Static278.aStringArray27[local146], arg8, arg1, arg5, arg3, arg9, local84, arg7);
				Static132.anInt2872 = 0;
			}
			local84 += arg12;
		}
		return local65;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLjava/lang/String;[I[I[II[Lclient!rg;)V")
	private void method4662(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class27[] arg6) {
		@Pc(13) int local13 = arg5 - this.aClass24_8.anInt421;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static108.method1981(arg1.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local19 = local28;
			} else {
				@Pc(134) int local134;
				@Pc(142) int local142;
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
									if (arg4 == null) {
										local134 = 0;
									} else {
										local134 = arg4[local23];
									}
									if (arg2 == null) {
										local142 = 0;
									} else {
										local142 = arg2[local23];
									}
									local23++;
									@Pc(155) int local155 = Static335.method5402(local62.substring(4));
									@Pc(159) Class27 local159 = arg6[local155];
									@Pc(168) int local168 = arg3 == null ? local159.method5328() : arg3[local155];
									local159.method5319(arg0 + local134, -local168 + this.aClass24_8.anInt421 + local13 + local142, 0, 0);
									arg0 += arg6[local155].method5317();
									local21 = -1;
								} catch (@Pc(197) Exception local197) {
								}
							} else {
								this.method4654(local62);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local19 == -1) {
					if (local21 != -1) {
						arg0 += this.aClass24_8.method323(local21, local39);
					}
					@Pc(228) int local228;
					if (arg4 == null) {
						local228 = 0;
					} else {
						local228 = arg4[local23];
					}
					if (arg2 == null) {
						local134 = 0;
					} else {
						local134 = arg2[local23];
					}
					if (local39 != ' ') {
						if ((Static339.anInt6262 & 0xFF000000) != 0) {
							this.method4655(local39, arg0 + local228 + 1, local134 + 1 + local13, Static339.anInt6262, true);
						}
						this.method4655(local39, arg0 + local228, local134 + local13, Static23.anInt354, false);
					} else if (Static132.anInt2872 > 0) {
						Static300.anInt5588 += Static132.anInt2872;
						arg0 += Static300.anInt5588 >> 8;
						Static300.anInt5588 &= 0xFF;
					}
					local23++;
					local142 = this.aClass24_8.method326(local39);
					if (Static180.anInt3784 != -1) {
						this.aClass48_8.method2493(Static180.anInt3784, arg0, (int) ((double) this.aClass24_8.anInt421 * 0.7D) + local13, local142);
					}
					if (Static81.anInt1753 != -1) {
						this.aClass48_8.method2493(Static81.anInt1753, arg0, this.aClass24_8.anInt421 + local13, local142);
					}
					arg0 += local142;
					local21 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;ILjava/util/Random;[IZI[Lclient!rg;II)I")
	public final int method4663(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class27[] arg5, @OriginalArg(8) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg2.setSeed((long) arg6);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method4648((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4662(arg4, arg0, null, arg3, local43, arg1, arg5);
		return local45;
	}
}
