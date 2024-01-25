import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class96 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!vn;")
	private final Class352 aClass352_24;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!r;")
	private final Class78 aClass78_137;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!vn;)V")
	protected Class96(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class352 arg1) {
		this.aClass352_24 = arg1;
		this.aClass78_137 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method7241(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; arg0.length() > local19; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<') {
				local17 = true;
			} else if (local25 == '>') {
				local17 = false;
			} else if (!local17 && local25 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static178.anInt3299 = (arg1 - this.aClass352_24.method7572(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method7243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static50.anInt1021 = arg0;
		Static337.anInt6163 = arg0;
		Static189.anInt3744 = -1;
		Static311.anInt5707 = 0;
		Static345.anInt9500 = -1;
		Static178.anInt3299 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static131.anInt2625 = arg1;
		Static14.anInt397 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BIIII)V")
	public final void method7244(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7243(arg2, arg4);
			this.method7249(null, null, null, arg1 - this.aClass352_24.method7572(arg0), 0, arg3, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method7245(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class181 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIILjava/lang/String;III)V")
	public final void method7246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method7243(arg5, -16777216);
		@Pc(32) double local32 = 7.0D - (double) arg1 / 8.0D;
		if (local32 < 0.0D) {
			local32 = 0.0D;
		}
		@Pc(41) int local41 = arg3.length();
		@Pc(44) int[] local44 = new int[local41];
		for (@Pc(46) int local46 = 0; local46 < local41; local46++) {
			local44[local46] = (int) (Math.sin((double) arg2 + (double) local46 / 1.5D) * local32);
		}
		this.method7253(null, arg3, arg4, null, null, local44, arg0 - this.aClass352_24.method7572(arg3) / 2);
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IZIIII[Lclient!f;Ljava/lang/String;)V")
	public final void method7248(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class5[] arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method7243(arg3, 0);
			this.method7249(arg0, null, arg4, arg2, 0, arg1, 0, arg5);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([ILclient!ua;[Lclient!f;IIIIILjava/lang/String;)V")
	private void method7249(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7) {
		@Pc(11) int local11 = arg5 - this.aClass352_24.anInt9293;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg7.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static165.method2703(arg7.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(53) String local53 = arg7.substring(local13 + 1, local20);
					local13 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=")) {
								try {
									@Pc(119) int local119 = Static216.method3234(local53.substring(4));
									@Pc(123) Class5 local123 = arg2[local119];
									@Pc(132) int local132 = arg0 == null ? local123.ca() : arg0[local119];
									if ((Static337.anInt6163 & 0xFF000000) == -16777216) {
										local123.V(arg3, this.aClass352_24.anInt9293 + local11 - local132, 1, 0, 1);
									} else {
										local123.V(arg3, local11 + this.aClass352_24.anInt9293 - local132, 0, Static337.anInt6163 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg3 += arg2[local119].A();
									local15 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method7258(local53);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass352_24.method7576(local31, local15);
					}
					if (local31 == ' ') {
						if (Static178.anInt3299 > 0) {
							Static311.anInt5707 += Static178.anInt3299;
							arg3 += Static311.anInt5707 >> 8;
							Static311.anInt5707 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static14.anInt397 & 0xFF000000) != 0) {
							this.OA(local31, arg3 + 1, local11 + 1, Static14.anInt397, true);
						}
						this.OA(local31, arg3, local11, Static337.anInt6163, false);
					} else {
						if ((Static14.anInt397 & 0xFF000000) != 0) {
							this.method7245(local31, arg3 + 1, local11 + 1, Static14.anInt397, true, arg1, arg4, arg6);
						}
						this.method7245(local31, arg3, local11, Static337.anInt6163, false, arg1, arg4, arg6);
					}
					@Pc(306) int local306 = this.aClass352_24.method7579(local31);
					if (Static345.anInt9500 != -1) {
						this.aClass78_137.method6806(local306, local11 + (int) ((double) this.aClass352_24.anInt9293 * 0.7D), arg3, Static345.anInt9500);
					}
					if (Static189.anInt3744 != -1) {
						this.aClass78_137.method6806(local306, local11 + this.aClass352_24.anInt9293 + 1, arg3, Static189.anInt3744);
					}
					arg3 += local306;
					local15 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/util/Random;Ljava/lang/String;I[Lclient!f;II[III)I")
	public final int method7251(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class5[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg1.setSeed((long) arg0);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method7243(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(47) int local47 = arg2.length();
		@Pc(50) int[] local50 = new int[local47];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local47; local54++) {
			local50[local54] = local52;
			if ((arg1.nextInt() & 0x3) == 0) {
				local52++;
			}
		}
		this.method7253(local50, arg2, arg4, arg5, arg3, null, arg6);
		return local52;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILjava/lang/String;III)V")
	public final void method7252(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7243(arg3, arg0);
			this.method7249(null, null, null, arg4 - this.aClass352_24.method7572(arg1) / 2, 0, arg2, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B[ILjava/lang/String;I[I[Lclient!f;[II)V")
	private void method7253(@OriginalArg(1) int[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class5[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg2 - this.aClass352_24.anInt9293;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static165.method2703(arg1.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(115) int local115;
				@Pc(125) int local125;
				if (local33 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg1.substring(local13 + 1, local22);
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
									if (arg0 == null) {
										local115 = 0;
									} else {
										local115 = arg0[local17];
									}
									if (arg5 == null) {
										local125 = 0;
									} else {
										local125 = arg5[local17];
									}
									local17++;
									@Pc(136) int local136 = Static216.method3234(local55.substring(4));
									@Pc(140) Class5 local140 = arg4[local136];
									@Pc(149) int local149 = arg3 == null ? local140.ca() : arg3[local136];
									local140.V(local115 + arg6, local125 + this.aClass352_24.anInt9293 + (local11 - local149), 1, 0, 1);
									arg6 += arg4[local136].A();
									local15 = -1;
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method7258(local55);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass352_24.method7576(local33, local15);
					}
					@Pc(220) int local220;
					if (arg0 == null) {
						local220 = 0;
					} else {
						local220 = arg0[local17];
					}
					if (arg5 == null) {
						local115 = 0;
					} else {
						local115 = arg5[local17];
					}
					if (local33 != ' ') {
						if ((Static14.anInt397 & 0xFF000000) != 0) {
							this.OA(local33, arg6 + local220 + 1, local115 + 1 + local11, Static14.anInt397, true);
						}
						this.OA(local33, arg6 + local220, local115 + local11, Static337.anInt6163, false);
					} else if (Static178.anInt3299 > 0) {
						Static311.anInt5707 += Static178.anInt3299;
						arg6 += Static311.anInt5707 >> 8;
						Static311.anInt5707 &= 0xFF;
					}
					local17++;
					local125 = this.aClass352_24.method7579(local33);
					if (Static345.anInt9500 != -1) {
						this.aClass78_137.method6806(local125, (int) ((double) this.aClass352_24.anInt9293 * 0.7D) + local11, arg6, Static345.anInt9500);
					}
					if (Static189.anInt3744 != -1) {
						this.aClass78_137.method6806(local125, local11 + this.aClass352_24.anInt9293, arg6, Static189.anInt3744);
					}
					arg6 += local125;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lclient!f;IIILclient!ua;I[IIILjava/lang/String;IIIII)I")
	public final int method7255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class181 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) String arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method7243(arg5, arg3);
		if (arg0 == 0) {
			arg0 = this.aClass352_24.anInt9293;
		}
		@Pc(44) int[] local44;
		if (this.aClass352_24.anInt9302 + this.aClass352_24.anInt9290 + arg0 > arg7 && arg7 < arg0 + arg0) {
			local44 = null;
		} else {
			local44 = new int[] { arg13 };
		}
		if (arg1 == -1) {
			arg1 = arg7 / arg0;
			if (arg1 <= 0) {
				arg1 = 1;
			}
		}
		@Pc(74) int local74 = this.aClass352_24.method7575(local44, arg2, Static234.aStringArray11, arg11);
		if (arg1 > 0 && local74 >= arg1) {
			Static234.aStringArray11[arg1 - 1] = this.aClass352_24.method7573(arg2, Static234.aStringArray11[arg1 - 1], arg13);
			local74 = arg1;
		}
		if (arg14 == 3 && local74 == 1) {
			arg14 = 1;
		}
		@Pc(144) int local144;
		@Pc(173) int local173;
		if (arg14 == 0) {
			local144 = this.aClass352_24.anInt9290 + arg10;
		} else if (arg14 == 1) {
			local144 = (arg7 - this.aClass352_24.anInt9302 - this.aClass352_24.anInt9290 - (local74 + -1) * arg0) / 2 + arg10 + this.aClass352_24.anInt9290;
		} else if (arg14 == 2) {
			local144 = arg10 + arg7 - arg0 * (local74 - 1) - this.aClass352_24.anInt9302;
		} else {
			local173 = (arg7 - (local74 - 1) * arg0 - this.aClass352_24.anInt9290 - this.aClass352_24.anInt9302) / (local74 - -1);
			if (local173 < 0) {
				local173 = 0;
			}
			local144 = arg10 + this.aClass352_24.anInt9290 + local173;
			arg0 += local173;
		}
		for (local173 = 0; local173 < local74; local173++) {
			if (arg4 == 0) {
				this.method7249(arg8, arg6, arg2, arg12, arg15, local144, arg9, Static234.aStringArray11[local173]);
			} else if (arg4 == 1) {
				this.method7249(arg8, arg6, arg2, (arg13 - this.aClass352_24.method7572(Static234.aStringArray11[local173])) / 2 + arg12, arg15, local144, arg9, Static234.aStringArray11[local173]);
			} else if (arg4 == 2) {
				this.method7249(arg8, arg6, arg2, arg12 + arg13 - this.aClass352_24.method7572(Static234.aStringArray11[local173]), arg15, local144, arg9, Static234.aStringArray11[local173]);
			} else if (local173 == local74 - 1) {
				this.method7249(arg8, arg6, arg2, arg12, arg15, local144, arg9, Static234.aStringArray11[local173]);
			} else {
				this.method7241(Static234.aStringArray11[local173], arg13);
				this.method7249(arg8, arg6, arg2, arg12, arg15, local144, arg9, Static234.aStringArray11[local173]);
				Static178.anInt3299 = 0;
			}
			local144 += arg0;
		}
		return local74;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method7256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7243(arg0, -16777216);
		@Pc(38) int local38 = arg2.length();
		@Pc(41) int[] local41 = new int[local38];
		for (@Pc(43) int local43 = 0; local43 < local38; local43++) {
			local41[local43] = (int) (Math.sin((double) arg4 / 5.0D + (double) local43 / 2.0D) * 5.0D);
		}
		this.method7253(null, arg2, arg3, null, null, local41, arg1 - this.aClass352_24.method7572(arg2) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public final void method7257(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7243(arg2, arg4);
			this.method7249(null, null, null, arg1, 0, arg3, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7258(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static337.anInt6163 = Static337.anInt6163 & 0xFF000000 | Static318.method4729(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static337.anInt6163 = Static337.anInt6163 & 0xFF000000 | Static50.anInt1021 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static337.anInt6163 = Static318.method4729(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static337.anInt6163 = Static50.anInt1021;
			} else if (arg0.startsWith("str=")) {
				Static345.anInt9500 = Static337.anInt6163 & 0xFF000000 | Static318.method4729(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static345.anInt9500 = Static337.anInt6163 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static345.anInt9500 = -1;
			} else if (arg0.startsWith("u=")) {
				Static189.anInt3744 = Static337.anInt6163 & 0xFF000000 | Static318.method4729(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static189.anInt3744 = Static337.anInt6163 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static189.anInt3744 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static14.anInt397 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static14.anInt397 = Static337.anInt6163 & 0xFF000000 | Static318.method4729(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static14.anInt397 = Static337.anInt6163 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static14.anInt397 = Static131.anInt2625;
			} else if (arg0.equals("br")) {
				this.method7243(Static50.anInt1021, Static131.anInt2625);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7259(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7243(arg3, -16777216);
		@Pc(18) int local18 = arg0.length();
		@Pc(21) int[] local21 = new int[local18];
		@Pc(24) int[] local24 = new int[local18];
		for (@Pc(47) int local47 = 0; local47 < local18; local47++) {
			local21[local47] = (int) (Math.sin((double) arg1 / 5.0D + (double) local47 / 5.0D) * 5.0D);
			local24[local47] = (int) (Math.sin((double) local47 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method7253(local21, arg0, arg4, null, null, local24, arg2 - this.aClass352_24.method7572(arg0) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([ILjava/util/Random;IIII[Lclient!f;IILjava/lang/String;III[II)I")
	public final int method7260(@OriginalArg(0) int[] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int[] arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg1.setSeed((long) arg11);
		@Pc(26) int local26 = (arg1.nextInt() & 0x1F) + 192;
		this.method7243(local26 << 24 | arg3 & 0xFFFFFF, arg10 & 0xFFFFFF | local26 << 24);
		@Pc(46) int local46 = arg9.length();
		@Pc(49) int[] local49 = new int[local46];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
			local49[local53] = local51;
			if ((arg1.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		@Pc(78) int local78 = arg2;
		@Pc(84) int local84 = this.aClass352_24.anInt9290 + arg7;
		if (arg5 == 1) {
			local84 += (arg12 - this.aClass352_24.anInt9290 - this.aClass352_24.anInt9302) / 2;
		} else if (arg5 == 2) {
			local84 = arg12 + arg7 - this.aClass352_24.anInt9302;
		}
		@Pc(118) int local118 = -1;
		if (arg8 == 1) {
			local118 = this.aClass352_24.method7572(arg9) + local51;
			local78 = arg2 + (arg4 - local118) / 2;
		} else if (arg8 == 2) {
			local118 = local51 + this.aClass352_24.method7572(arg9);
			local78 = arg2 + arg4 - local118;
		}
		this.method7253(local49, arg9, local84, arg13, arg6, null, local78);
		if (arg0 != null) {
			if (local118 == -1) {
				local118 = this.aClass352_24.method7572(arg9) + local51;
			}
			arg0[2] = local118;
			arg0[1] = local84 - this.aClass352_24.anInt9290;
			arg0[3] = this.aClass352_24.anInt9302 + this.aClass352_24.anInt9290;
			arg0[0] = local78;
		}
		return local51;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ua;III[IIIIIBIILjava/lang/String;[Lclient!f;)I")
	public final int method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13, @OriginalArg(15) Class5[] arg14) {
		return this.method7255(arg5, 0, arg14, arg11, arg8, arg7, arg2, arg12, arg6, arg3, arg4, arg13, arg9, arg10, arg0, arg1);
	}
}
