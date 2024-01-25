import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public abstract class Class13 {

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Lclient!km;")
	private final Class82 aClass82_10;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "Lclient!ss;")
	private final Class216 aClass216_8;

	static {
		new Class221(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!km;Lclient!ss;)V")
	protected Class13(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class216 arg1) {
		this.aClass82_10 = arg0;
		this.aClass216_8 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
	public final void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5614(arg3, arg2);
			this.method5623(arg0, null, null, arg1, 0, null, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method5603(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static173.anInt3079 = Static173.anInt3079 & 0xFF000000 | Static156.method2599(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static173.anInt3079 = Static30.anInt682 & 0xFFFFFF | Static173.anInt3079 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static173.anInt3079 = Static156.method2599(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static173.anInt3079 = Static30.anInt682;
			} else if (arg0.startsWith("str=")) {
				Static79.anInt1520 = Static156.method2599(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static79.anInt1520 = -8388608;
			} else if (arg0.equals("/str")) {
				Static79.anInt1520 = -1;
			} else if (arg0.startsWith("u=")) {
				Static173.anInt3084 = Static156.method2599(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static173.anInt3084 = -16777216;
			} else if (arg0.equals("/u")) {
				Static173.anInt3084 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static319.anInt5628 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static319.anInt5628 = Static156.method2599(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static319.anInt5628 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static319.anInt5628 = Static1.anInt44;
			} else if (arg0.equals("br")) {
				this.method5614(Static1.anInt44, Static30.anInt682);
			}
		} catch (@Pc(169) Exception local169) {
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method5604(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			Static267.anInt4711 = (arg1 - this.aClass216_8.method5073(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5605(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5614(-1, arg3);
			this.method5623(arg2, null, null, arg0, 0, null, 0, arg1 - this.aClass216_8.method5073(arg0));
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public final void method5608(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method5614(-16777216, arg2);
		@Pc(21) double local21 = 7.0D - (double) arg5 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg0.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) local35 / 1.5D + (double) arg4) * local21);
		}
		this.method5618(null, local33, arg1, arg3 - this.aClass216_8.method5073(arg0) / 2, null, arg0, null);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIILclient!vb;IIILjava/lang/String;III[I[Lclient!aq;)I")
	public final int method5611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class201 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) Class5[] arg14) {
		if (arg9 == null) {
			return 0;
		}
		this.method5614(arg8, arg12);
		if (arg2 == 0) {
			arg2 = this.aClass216_8.anInt5795;
		}
		@Pc(55) int[] local55;
		if (arg4 < this.aClass216_8.anInt5799 + this.aClass216_8.anInt5794 + arg2 && arg2 + arg2 > arg4) {
			local55 = null;
		} else {
			local55 = new int[] { arg11 };
		}
		@Pc(68) int local68 = this.aClass216_8.method5072(arg14, arg9, local55, Static176.aStringArray20);
		if (arg3 == 3 && local68 == 1) {
			arg3 = 1;
		}
		@Pc(92) int local92;
		@Pc(172) int local172;
		if (arg3 == 0) {
			local92 = arg1 + this.aClass216_8.anInt5799;
		} else if (arg3 == 1) {
			local92 = (arg4 - (local68 - 1) * arg2 - this.aClass216_8.anInt5794 - this.aClass216_8.anInt5799) / 2 + this.aClass216_8.anInt5799 + arg1;
		} else if (arg3 == 2) {
			local92 = arg4 + arg1 - this.aClass216_8.anInt5794 - arg2 * (local68 + -1);
		} else {
			local172 = (arg4 - (local68 - 1) * arg2 - this.aClass216_8.anInt5799 - this.aClass216_8.anInt5794) / (local68 + 1);
			if (local172 < 0) {
				local172 = 0;
			}
			local92 = local172 + this.aClass216_8.anInt5799 + arg1;
			arg2 += local172;
		}
		for (local172 = 0; local172 < local68; local172++) {
			if (arg5 == 0) {
				this.method5623(local92, arg13, arg14, Static176.aStringArray20[local172], arg0, arg6, arg10, arg7);
			} else if (arg5 == 1) {
				this.method5623(local92, arg13, arg14, Static176.aStringArray20[local172], arg0, arg6, arg10, arg7 + (arg11 - this.aClass216_8.method5073(Static176.aStringArray20[local172])) / 2);
			} else if (arg5 == 2) {
				this.method5623(local92, arg13, arg14, Static176.aStringArray20[local172], arg0, arg6, arg10, arg11 + arg7 - this.aClass216_8.method5073(Static176.aStringArray20[local172]));
			} else if (local172 == local68 - 1) {
				this.method5623(local92, arg13, arg14, Static176.aStringArray20[local172], arg0, arg6, arg10, arg7);
			} else {
				this.method5604(Static176.aStringArray20[local172], arg11);
				this.method5623(local92, arg13, arg14, Static176.aStringArray20[local172], arg0, arg6, arg10, arg7);
				Static267.anInt4711 = 0;
			}
			local92 += arg2;
		}
		return local68;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(CIIIZLclient!vb;II)V")
	protected abstract void method5612(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class201 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method5613(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5614(-16777216, arg4);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) arg3 / 5.0D + (double) local24 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg3 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method5618(null, local22, arg2, arg1 - this.aClass216_8.method5073(arg0) / 2, local19, arg0, null);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
	private void method5614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static267.anInt4711 = 0;
		Static173.anInt3084 = -1;
		Static30.anInt682 = arg1;
		Static173.anInt3079 = arg1;
		Static283.anInt5009 = 0;
		Static79.anInt1520 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static1.anInt44 = arg0;
		Static319.anInt5628 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII[IBILjava/util/Random;IIILjava/lang/String;I[Lclient!aq;[I)I")
	public final int method5616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Random arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class5[] arg12, @OriginalArg(14) int[] arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg6.setSeed((long) arg1);
		@Pc(28) int local28 = (arg6.nextInt() & 0x1F) + 192;
		this.method5614(arg11 & 0xFFFFFF | local28 << 24, arg3 & 0xFFFFFF | local28 << 24);
		@Pc(48) int local48 = arg10.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg6.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(77) int local77 = arg2;
		@Pc(83) int local83 = arg9 + this.aClass216_8.anInt5799;
		if (arg8 == 1) {
			local83 += (arg7 - this.aClass216_8.anInt5794 - this.aClass216_8.anInt5799) / 2;
		} else if (arg8 == 2) {
			local83 = arg7 + arg9 - this.aClass216_8.anInt5794;
		}
		@Pc(118) int local118 = -1;
		if (arg0 == 1) {
			local118 = local53 + this.aClass216_8.method5073(arg10);
			local77 = arg2 + (arg5 - local118) / 2;
		} else if (arg0 == 2) {
			local118 = this.aClass216_8.method5073(arg10) + local53;
			local77 = arg2 + arg5 - local118;
		}
		this.method5618(arg12, null, local83, local77, local51, arg10, arg4);
		if (arg13 != null) {
			if (local118 == -1) {
				local118 = local53 + this.aClass216_8.method5073(arg10);
			}
			arg13[3] = this.aClass216_8.anInt5799 + this.aClass216_8.anInt5794;
			arg13[2] = local118;
			arg13[1] = local83 - this.aClass216_8.anInt5799;
			arg13[0] = local77;
		}
		return local53;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIILjava/lang/String;I)V")
	public final void method5617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5614(arg2, arg1);
			this.method5623(arg4, null, null, arg3, 0, null, 0, arg0 - this.aClass216_8.method5073(arg3) / 2);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([Lclient!aq;[III[IILjava/lang/String;[I)V")
	private void method5618(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int[] arg6) {
		@Pc(18) int local18 = arg2 - this.aClass216_8.anInt5795;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int local27 = arg5.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(40) char local40 = (char) (Static379.method1121(arg5.charAt(local29)) & 0xFF);
			if (local40 == '<') {
				local20 = local29;
			} else {
				@Pc(122) int local122;
				@Pc(134) int local134;
				if (local40 == '>' && local20 != -1) {
					@Pc(64) String local64 = arg5.substring(local20 + 1, local29);
					local20 = -1;
					if (local64.equals("lt")) {
						local40 = '<';
					} else if (local64.equals("gt")) {
						local40 = '>';
					} else if (local64.equals("nbsp")) {
						local40 = ' ';
					} else if (local64.equals("shy")) {
						local40 = '\u00ad';
					} else if (local64.equals("times")) {
						local40 = '×';
					} else if (local64.equals("euro")) {
						local40 = '€';
					} else if (local64.equals("copy")) {
						local40 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local122 = 0;
									} else {
										local122 = arg4[local24];
									}
									if (arg1 == null) {
										local134 = 0;
									} else {
										local134 = arg1[local24];
									}
									local24++;
									@Pc(145) int local145 = Static319.method4935(local64.substring(4));
									@Pc(149) Class5 local149 = arg0[local145];
									@Pc(158) int local158 = arg6 == null ? local149.method4992() : arg6[local145];
									local149.method5006(arg3 + local122, -local158 + this.aClass216_8.anInt5795 + (local18 - -local134), 0, 0);
									local22 = -1;
									arg3 += arg0[local145].method4990();
								} catch (@Pc(188) Exception local188) {
								}
							} else {
								this.method5603(local64);
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local20 == -1) {
					if (local22 != -1) {
						arg3 += this.aClass216_8.method5077(local22, local40);
					}
					@Pc(233) int local233;
					if (arg4 == null) {
						local233 = 0;
					} else {
						local233 = arg4[local24];
					}
					if (arg1 == null) {
						local122 = 0;
					} else {
						local122 = arg1[local24];
					}
					local24++;
					if (local40 != ' ') {
						if ((Static319.anInt5628 & 0xFF000000) != 0) {
							this.method5619(local40, arg3 + local233 + 1, local18 - -1 + local122, Static319.anInt5628, true);
						}
						this.method5619(local40, arg3 + local233, local18 + local122, Static173.anInt3079, false);
					} else if (Static267.anInt4711 > 0) {
						Static283.anInt5009 += Static267.anInt4711;
						arg3 += Static283.anInt5009 >> 8;
						Static283.anInt5009 &= 0xFF;
					}
					local134 = this.aClass216_8.method5071(local40);
					if (Static79.anInt1520 != -1) {
						this.aClass82_10.method4476(local134, arg3, Static79.anInt1520, local18 + (int) ((double) this.aClass216_8.anInt5795 * 0.7D));
					}
					if (Static173.anInt3084 != -1) {
						this.aClass82_10.method4476(local134, arg3, Static173.anInt3084, this.aClass216_8.anInt5795 + local18);
					}
					arg3 += local134;
					local22 = local40;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5619(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([ILjava/lang/String;IIII[Lclient!aq;I)V")
	public final void method5620(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class5[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 != null) {
			this.method5614(0, arg3);
			this.method5623(arg5, arg0, arg4, arg1, 0, null, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method5622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5614(-16777216, arg1);
		@Pc(32) int local32 = arg2.length();
		@Pc(35) int[] local35 = new int[local32];
		for (@Pc(37) int local37 = 0; local37 < local32; local37++) {
			local35[local37] = (int) (Math.sin((double) local37 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method5618(null, local35, arg0, arg3 - this.aClass216_8.method5073(arg2) / 2, null, arg2, null);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[I[Lclient!aq;BLjava/lang/String;ILclient!vb;II)V")
	private void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class201 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(33) int local33 = arg0 - this.aClass216_8.anInt5795;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(40) int local40 = arg3.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(53) char local53 = (char) (Static379.method1121(arg3.charAt(local42)) & 0xFF);
			if (local53 == '<') {
				local35 = local42;
			} else {
				if (local53 == '>' && local35 != -1) {
					@Pc(76) String local76 = arg3.substring(local35 + 1, local42);
					local35 = -1;
					if (local76.equals("lt")) {
						local53 = '<';
					} else if (local76.equals("gt")) {
						local53 = '>';
					} else if (local76.equals("nbsp")) {
						local53 = ' ';
					} else if (local76.equals("shy")) {
						local53 = '\u00ad';
					} else if (local76.equals("times")) {
						local53 = '×';
					} else if (local76.equals("euro")) {
						local53 = '€';
					} else if (local76.equals("copy")) {
						local53 = '©';
					} else {
						if (!local76.equals("reg")) {
							if (local76.startsWith("img=")) {
								try {
									@Pc(142) int local142 = Static319.method4935(local76.substring(4));
									@Pc(146) Class5 local146 = arg2[local142];
									@Pc(155) int local155 = arg1 == null ? local146.method4992() : arg1[local142];
									if ((Static173.anInt3079 & 0xFF000000) == -16777216) {
										local146.method5006(arg7, this.aClass216_8.anInt5795 + local33 - local155, 0, 0);
									} else {
										local146.method5006(arg7, local33 + this.aClass216_8.anInt5795 - local155, 1, Static173.anInt3079 & 0xFF000000 | 0xFFFFFF);
									}
									arg7 += arg2[local142].method4990();
									local37 = -1;
								} catch (@Pc(208) Exception local208) {
								}
							} else {
								this.method5603(local76);
							}
							continue;
						}
						local53 = '®';
					}
				}
				if (local35 == -1) {
					if (local37 != -1) {
						arg7 += this.aClass216_8.method5077(local37, local53);
					}
					if (local53 == ' ') {
						if (Static267.anInt4711 > 0) {
							Static283.anInt5009 += Static267.anInt4711;
							arg7 += Static283.anInt5009 >> 8;
							Static283.anInt5009 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static319.anInt5628 & 0xFF000000) != 0) {
							this.method5619(local53, arg7 + 1, local33 - -1, Static319.anInt5628, true);
						}
						this.method5619(local53, arg7, local33, Static173.anInt3079, false);
					} else {
						if ((Static319.anInt5628 & 0xFF000000) != 0) {
							this.method5612(local53, arg7 + 1, local33 + 1, Static319.anInt5628, true, arg5, arg4, arg6);
						}
						this.method5612(local53, arg7, local33, Static173.anInt3079, false, arg5, arg4, arg6);
					}
					@Pc(324) int local324 = this.aClass216_8.method5071(local53);
					if (Static79.anInt1520 != -1) {
						this.aClass82_10.method4476(local324, arg7, Static79.anInt1520, (int) ((double) this.aClass216_8.anInt5795 * 0.7D) + local33);
					}
					if (Static173.anInt3084 != -1) {
						this.aClass82_10.method4476(local324, arg7, Static173.anInt3084, this.aClass216_8.anInt5795 + local33 + 1);
					}
					arg7 += local324;
					local37 = local53;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII[I[Lclient!aq;Ljava/lang/String;Ljava/util/Random;I)I")
	public final int method5624(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) Class5[] arg4, @OriginalArg(7) String arg5, @OriginalArg(8) Random arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg6.setSeed((long) arg2);
		@Pc(31) int local31 = (arg6.nextInt() & 0x1F) + 192;
		this.method5614((local31 | 0x0) << 24, local31 << 24 | 0xFFFFFF);
		@Pc(51) int local51 = arg5.length();
		@Pc(54) int[] local54 = new int[local51];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local51; local58++) {
			local54[local58] = local56;
			if ((arg6.nextInt() & 0x3) == 0) {
				local56++;
			}
		}
		this.method5618(arg4, null, arg1, arg0, local54, arg5, arg3);
		return local56;
	}
}
