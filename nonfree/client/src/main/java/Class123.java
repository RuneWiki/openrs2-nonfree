import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class123 {

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!li;")
	private final Class158 aClass158_13;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!ya;")
	private final Class135 aClass135_13;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ya;Lclient!li;)V")
	protected Class123(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class158 arg1) {
		this.aClass158_13 = arg1;
		this.aClass135_13 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5783(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static345.anInt5713 = Static345.anInt5713 & 0xFF000000 | Static430.method5737(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static345.anInt5713 = Static271.anInt4514 & 0xFFFFFF | Static345.anInt5713 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static345.anInt5713 = Static430.method5737(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static345.anInt5713 = Static271.anInt4514;
			} else if (arg0.startsWith("str=")) {
				Static56.anInt968 = Static345.anInt5713 & 0xFF000000 | Static430.method5737(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static56.anInt968 = Static345.anInt5713 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static56.anInt968 = -1;
			} else if (arg0.startsWith("u=")) {
				Static311.anInt5078 = Static345.anInt5713 & 0xFF000000 | Static430.method5737(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static311.anInt5078 = Static345.anInt5713 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static311.anInt5078 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static137.anInt2490 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static137.anInt2490 = Static345.anInt5713 & 0xFF000000 | Static430.method5737(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static137.anInt2490 = Static345.anInt5713 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static137.anInt2490 = Static290.anInt4765;
			} else if (arg0.equals("br")) {
				this.method5801(Static290.anInt4765, Static271.anInt4514);
			}
		} catch (@Pc(183) Exception local183) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
	public final void method5784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5801(arg3, arg1);
			this.method5802(arg2, arg4, null, 0, null, arg0, null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	protected abstract void method5786(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class71 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method5788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5801(arg2, arg4);
			this.method5802(arg3, arg0, null, 0, null, arg1 - this.aClass158_13.method3038(arg3) / 2, null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[IIIIIIIILjava/lang/String;[Lclient!l;Lclient!ma;III)I")
	public final int method5789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) String arg7, @OriginalArg(11) Class95[] arg8, @OriginalArg(12) Class71 arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5790(arg6, arg0, arg9, arg4, 0, arg3, 1, arg12, arg11, arg10, arg5, arg2, arg7, arg1, 0, arg8);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ma;IIIIIIII[ILjava/lang/String;III[Lclient!l;)I")
	public final int method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) String arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class95[] arg15) {
		if (arg12 == null) {
			return 0;
		}
		this.method5801(arg1, arg7);
		if (arg4 == 0) {
			arg4 = this.aClass158_13.anInt3832;
		}
		@Pc(47) int[] local47;
		if (arg4 + this.aClass158_13.anInt3839 + this.aClass158_13.anInt3838 > arg10 && arg10 < arg4 + arg4) {
			local47 = null;
		} else {
			local47 = new int[] { arg3 };
		}
		if (arg14 == -1) {
			arg14 = arg10 / arg4;
			if (arg14 <= 0) {
				arg14 = 1;
			}
		}
		@Pc(72) int local72 = this.aClass158_13.method3029(arg12, arg15, local47, Static416.aStringArray44);
		if (arg14 > 0 && local72 >= arg14) {
			local72 = arg14;
			Static416.aStringArray44[arg14 - 1] = this.aClass158_13.method3026(Static416.aStringArray44[arg14 - 1], arg3, arg15);
		}
		if (arg8 == 3 && local72 == 1) {
			arg8 = 1;
		}
		@Pc(116) int local116;
		@Pc(150) int local150;
		if (arg8 == 0) {
			local116 = this.aClass158_13.anInt3838 + arg13;
		} else if (arg8 == 1) {
			local116 = this.aClass158_13.anInt3838 + arg13 + (arg10 + -this.aClass158_13.anInt3838 - (this.aClass158_13.anInt3839 + arg4 * (local72 + -1))) / 2;
		} else if (arg8 == 2) {
			local116 = arg10 + arg13 - this.aClass158_13.anInt3839 - arg4 * (local72 - 1);
		} else {
			local150 = (arg10 - this.aClass158_13.anInt3839 - this.aClass158_13.anInt3838 - (local72 - 1) * arg4) / (local72 + 1);
			if (local150 < 0) {
				local150 = 0;
			}
			local116 = local150 + this.aClass158_13.anInt3838 + arg13;
			arg4 += local150;
		}
		for (local150 = 0; local150 < local72; local150++) {
			if (arg6 == 0) {
				this.method5802(Static416.aStringArray44[local150], local116, arg15, arg5, arg11, arg0, arg2, arg9);
			} else if (arg6 == 1) {
				this.method5802(Static416.aStringArray44[local150], local116, arg15, arg5, arg11, arg0 + (arg3 - this.aClass158_13.method3038(Static416.aStringArray44[local150])) / 2, arg2, arg9);
			} else if (arg6 == 2) {
				this.method5802(Static416.aStringArray44[local150], local116, arg15, arg5, arg11, arg0 + arg3 - this.aClass158_13.method3038(Static416.aStringArray44[local150]), arg2, arg9);
			} else if (local72 - 1 == local150) {
				this.method5802(Static416.aStringArray44[local150], local116, arg15, arg5, arg11, arg0, arg2, arg9);
			} else {
				this.method5796(Static416.aStringArray44[local150], arg3);
				this.method5802(Static416.aStringArray44[local150], local116, arg15, arg5, arg11, arg0, arg2, arg9);
				Static441.anInt7332 = 0;
			}
			local116 += arg4;
		}
		return local72;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIZI[I[Lclient!l;ILjava/lang/String;ILjava/util/Random;IIIII)I")
	public final int method5791(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class95[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Random arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return 0;
		}
		arg8.setSeed((long) arg5);
		@Pc(25) int local25 = (arg8.nextInt() & 0x1F) + 192;
		this.method5801(arg11 & 0xFFFFFF | local25 << 24, local25 << 24 | arg12 & 0xFFFFFF);
		@Pc(45) int local45 = arg6.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg8.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(77) int local77 = arg1;
		@Pc(83) int local83 = arg10 + this.aClass158_13.anInt3838;
		@Pc(85) int local85 = -1;
		if (arg2 == 1) {
			local83 += (arg9 - this.aClass158_13.anInt3838 - this.aClass158_13.anInt3839) / 2;
		} else if (arg2 == 2) {
			local83 = arg9 + arg10 - this.aClass158_13.anInt3839;
		}
		if (arg7 == 1) {
			local85 = local50 + this.aClass158_13.method3038(arg6);
			local77 = arg1 + (arg13 - local85) / 2;
		} else if (arg7 == 2) {
			local85 = this.aClass158_13.method3038(arg6) + local50;
			local77 = arg1 + arg13 - local85;
		}
		this.method5800(local83, arg0, null, arg4, arg6, local48, local77);
		if (arg3 != null) {
			if (local85 == -1) {
				local85 = this.aClass158_13.method3038(arg6) + local50;
			}
			arg3[2] = local85;
			arg3[3] = this.aClass158_13.anInt3839 + this.aClass158_13.anInt3838;
			arg3[1] = local83 - this.aClass158_13.anInt3838;
			arg3[0] = local77;
		}
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[Lclient!l;IILjava/lang/String;I)V")
	public final void method5792(@OriginalArg(1) int[] arg0, @OriginalArg(3) Class95[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 != null) {
			this.method5801(0, arg5);
			this.method5802(arg4, arg2, arg1, 0, arg0, arg3, null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5801(-16777216, arg4);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5800(arg0, null, local19, null, arg2, null, arg1 - this.aClass158_13.method3038(arg2) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public final void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method5801(-16777216, arg2);
		@Pc(21) double local21 = 7.0D - (double) arg1 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) arg4 + (double) local35 / 1.5D) * local21);
		}
		this.method5800(arg0, null, local33, null, arg5, null, arg3 - this.aClass158_13.method3038(arg5) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method5796(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
			@Pc(22) char local22 = arg0.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local12++;
			}
		}
		if (local12 > 0) {
			Static441.anInt7332 = (arg1 - this.aClass158_13.method3038(arg0) << 8) / local12;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5801(-16777216, arg2);
		@Pc(32) int local32 = arg3.length();
		@Pc(35) int[] local35 = new int[local32];
		@Pc(38) int[] local38 = new int[local32];
		for (@Pc(40) int local40 = 0; local40 < local32; local40++) {
			local35[local40] = (int) (Math.sin((double) arg0 / 5.0D + (double) local40 / 5.0D) * 5.0D);
			local38[local40] = (int) (Math.sin((double) arg0 / 5.0D + (double) local40 / 3.0D) * 5.0D);
		}
		this.method5800(arg1, null, local38, null, arg3, local35, arg4 - this.aClass158_13.method3038(arg3) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIILjava/util/Random;IILjava/lang/String;[Lclient!l;II)I")
	public final int method5798(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) Class95[] arg5, @OriginalArg(9) int arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg2.setSeed((long) arg1);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method5801((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg4.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5800(arg3, arg0, null, arg5, arg4, local43, arg6);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIBII)V")
	public final void method5799(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 != null) {
			this.method5801(-1, arg2);
			this.method5802(arg0, arg1, null, 0, null, arg3 - this.aClass158_13.method3038(arg0), null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[I[Lclient!l;Ljava/lang/String;[II)V")
	private void method5800(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class95[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - this.aClass158_13.anInt3832;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			@Pc(38) char local38 = (char) (Static339.method4488(arg4.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				@Pc(122) int local122;
				@Pc(134) int local134;
				if (local38 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg4.substring(local13 + 1, local27);
					local13 = -1;
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
									if (arg5 == null) {
										local122 = 0;
									} else {
										local122 = arg5[local17];
									}
									if (arg2 == null) {
										local134 = 0;
									} else {
										local134 = arg2[local17];
									}
									local17++;
									@Pc(145) int local145 = Static113.method1676(local60.substring(4));
									@Pc(149) Class95 local149 = arg3[local145];
									@Pc(158) int local158 = arg1 == null ? local149.T() : arg1[local145];
									local149.r(arg6 + local122, this.aClass158_13.anInt3832 + local7 - (local158 - local134), 1, 0, 1);
									local15 = -1;
									arg6 += arg3[local145].j();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method5783(local60);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass158_13.method3031(local15, local38);
					}
					@Pc(223) int local223;
					if (arg5 == null) {
						local223 = 0;
					} else {
						local223 = arg5[local17];
					}
					if (arg2 == null) {
						local122 = 0;
					} else {
						local122 = arg2[local17];
					}
					if (local38 != ' ') {
						if ((Static137.anInt2490 & 0xFF000000) != 0) {
							this.OA(local38, arg6 + local223 + 1, local7 + 1 - -local122, Static137.anInt2490, true);
						}
						this.OA(local38, local223 + arg6, local122 + local7, Static345.anInt5713, false);
					} else if (Static441.anInt7332 > 0) {
						Static209.anInt3654 += Static441.anInt7332;
						arg6 += Static209.anInt3654 >> 8;
						Static209.anInt3654 &= 0xFF;
					}
					local17++;
					local134 = this.aClass158_13.method3030(local38);
					if (Static56.anInt968 != -1) {
						this.aClass135_13.method5402(local134, arg6, Static56.anInt968, (int) ((double) this.aClass158_13.anInt3832 * 0.7D) + local7);
					}
					if (Static311.anInt5078 != -1) {
						this.aClass135_13.method5402(local134, arg6, Static311.anInt5078, local7 + this.aClass158_13.anInt3832);
					}
					arg6 += local134;
					local15 = local38;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)V")
	private void method5801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static271.anInt4514 = arg1;
		Static345.anInt5713 = arg1;
		Static441.anInt7332 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static56.anInt968 = -1;
		Static209.anInt3654 = 0;
		Static311.anInt5078 = -1;
		Static290.anInt4765 = arg0;
		Static137.anInt2490 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!l;I[IIILclient!ma;I)V")
	private void method5802(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class71 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg1 - this.aClass158_13.anInt3832;
		@Pc(13) int local13 = -1;
		@Pc(27) int local27 = -1;
		@Pc(30) int local30 = arg0.length();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			@Pc(43) char local43 = (char) (Static339.method4488(arg0.charAt(local32)) & 0xFF);
			if (local43 == '<') {
				local13 = local32;
			} else {
				if (local43 == '>' && local13 != -1) {
					@Pc(68) String local68 = arg0.substring(local13 + 1, local32);
					local13 = -1;
					if (local68.equals("lt")) {
						local43 = '<';
					} else if (local68.equals("gt")) {
						local43 = '>';
					} else if (local68.equals("nbsp")) {
						local43 = ' ';
					} else if (local68.equals("shy")) {
						local43 = '\u00ad';
					} else if (local68.equals("times")) {
						local43 = '×';
					} else if (local68.equals("euro")) {
						local43 = '€';
					} else if (local68.equals("copy")) {
						local43 = '©';
					} else {
						if (!local68.equals("reg")) {
							if (local68.startsWith("img=")) {
								try {
									@Pc(138) int local138 = Static113.method1676(local68.substring(4));
									@Pc(142) Class95 local142 = arg2[local138];
									@Pc(151) int local151 = arg4 == null ? local142.T() : arg4[local138];
									if ((-16777216 & Static345.anInt5713) == -16777216) {
										local142.r(arg5, this.aClass158_13.anInt3832 + local11 - local151, 1, 0, 1);
									} else {
										local142.r(arg5, local11 + this.aClass158_13.anInt3832 - local151, 0, Static345.anInt5713 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local27 = -1;
									arg5 += arg2[local138].j();
								} catch (@Pc(202) Exception local202) {
								}
							} else {
								this.method5783(local68);
							}
							continue;
						}
						local43 = '®';
					}
				}
				if (local13 == -1) {
					if (local27 != -1) {
						arg5 += this.aClass158_13.method3031(local27, local43);
					}
					if (local43 == ' ') {
						if (Static441.anInt7332 > 0) {
							Static209.anInt3654 += Static441.anInt7332;
							arg5 += Static209.anInt3654 >> 8;
							Static209.anInt3654 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static137.anInt2490 & 0xFF000000) != 0) {
							this.OA(local43, arg5 + 1, local11 - -1, Static137.anInt2490, true);
						}
						this.OA(local43, arg5, local11, Static345.anInt5713, false);
					} else {
						if ((Static137.anInt2490 & 0xFF000000) != 0) {
							this.method5786(local43, arg5 + 1, local11 - -1, Static137.anInt2490, true, arg6, arg3, arg7);
						}
						this.method5786(local43, arg5, local11, Static345.anInt5713, false, arg6, arg3, arg7);
					}
					@Pc(318) int local318 = this.aClass158_13.method3030(local43);
					if (Static56.anInt968 != -1) {
						this.aClass135_13.method5402(local318, arg5, Static56.anInt968, local11 + (int) ((double) this.aClass158_13.anInt3832 * 0.7D));
					}
					if (Static311.anInt5078 != -1) {
						this.aClass135_13.method5402(local318, arg5, Static311.anInt5078, this.aClass158_13.anInt3832 + local11 + 1);
					}
					local27 = local43;
					arg5 += local318;
				}
			}
		}
	}
}
