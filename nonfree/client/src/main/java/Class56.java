import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class56 {

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Lclient!oa;")
	private final Class121 aClass121_17;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!il;")
	private final Class146 aClass146_12;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!oa;Lclient!il;)V")
	protected Class56(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class146 arg1) {
		this.aClass121_17 = arg0;
		this.aClass146_12 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZILjava/lang/String;III)V")
	public final void method7865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7877(-16777216, arg1);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(43) int local43 = 0; local43 < local16; local43++) {
			local19[local43] = (int) (Math.sin((double) arg0 / 5.0D + (double) local43 / 2.0D) * 5.0D);
		}
		this.method7878(null, arg4, arg3 - this.aClass146_12.method3173(arg2) / 2, local19, null, null, arg2);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method7877(arg1, arg4);
			this.method7868(null, null, 0, null, arg0 - this.aClass146_12.method3173(arg2) / 2, arg2, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
	public final void method7867(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7877(arg1, arg4);
			this.method7868(null, null, 0, null, arg3 - this.aClass146_12.method3173(arg0), arg0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!fa;[II[Lclient!xa;ILjava/lang/String;IIB)V")
	private void method7868(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) int local11 = arg7 - this.aClass146_12.anInt3684;
		@Pc(13) int local13 = -1;
		@Pc(31) int local31 = -1;
		@Pc(34) int local34 = arg5.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(49) char local49 = (char) (Static176.method2702(arg5.charAt(local36)) & 0xFF);
			if (local49 == '<') {
				local13 = local36;
			} else {
				if (local49 == '>' && local13 != -1) {
					@Pc(73) String local73 = arg5.substring(local13 + 1, local36);
					local13 = -1;
					if (local73.equals("lt")) {
						local49 = '<';
					} else if (local73.equals("gt")) {
						local49 = '>';
					} else if (local73.equals("nbsp")) {
						local49 = ' ';
					} else if (local73.equals("shy")) {
						local49 = '\u00ad';
					} else if (local73.equals("times")) {
						local49 = '×';
					} else if (local73.equals("euro")) {
						local49 = '€';
					} else if (local73.equals("copy")) {
						local49 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=")) {
								try {
									@Pc(139) int local139 = Static467.method6543(local73.substring(4));
									@Pc(143) Class4 local143 = arg3[local139];
									@Pc(152) int local152 = arg1 == null ? local143.a() : arg1[local139];
									if ((Static105.anInt1964 & 0xFF000000) == -16777216) {
										local143.I(arg4, this.aClass146_12.anInt3684 + local11 - local152, 1, 0, 1);
									} else {
										local143.I(arg4, this.aClass146_12.anInt3684 + local11 - local152, 0, Static105.anInt1964 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local31 = -1;
									arg4 += arg3[local139].AA();
								} catch (@Pc(204) Exception local204) {
								}
							} else {
								this.method7876(local73);
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local13 == -1) {
					if (local31 != -1) {
						arg4 += this.aClass146_12.method3177(local49, local31);
					}
					if (local49 == ' ') {
						if (Static69.anInt1151 > 0) {
							Static397.anInt328 += Static69.anInt1151;
							arg4 += Static397.anInt328 >> 8;
							Static397.anInt328 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static386.anInt6902 & 0xFF000000) != 0) {
							this.q(local49, arg4 + 1, local11 - -1, Static386.anInt6902, true);
						}
						this.q(local49, arg4, local11, Static105.anInt1964, false);
					} else {
						if ((Static386.anInt6902 & 0xFF000000) != 0) {
							this.method7882(local49, arg4 + 1, local11 + 1, Static386.anInt6902, true, arg0, arg2, arg6);
						}
						this.method7882(local49, arg4, local11, Static105.anInt1964, false, arg0, arg2, arg6);
					}
					@Pc(330) int local330 = this.aClass146_12.method3178(local49);
					if (Static271.anInt4465 != -1) {
						this.aClass121_17.method7138(local330, (int) ((double) this.aClass146_12.anInt3684 * 0.7D) + local11, Static271.anInt4465, arg4);
					}
					if (Static80.anInt1397 != -1) {
						this.aClass121_17.method7138(local330, this.aClass146_12.anInt3684 + local11 + 1, Static80.anInt1397, arg4);
					}
					local31 = local49;
					arg4 += local330;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7877(-16777216, arg2);
		@Pc(20) double local20 = 7.0D - (double) arg3 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg5.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) arg0 + (double) local34 / 1.5D) * local20);
		}
		this.method7878(null, arg4, arg1 - this.aClass146_12.method3173(arg5) / 2, local32, null, null, arg5);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[IIIIILclient!fa;[Lclient!xa;Ljava/lang/String;IIIBIIII)I")
	public final int method7870(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(7) Class4[] arg7, @OriginalArg(8) String arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg8 == null) {
			return 0;
		}
		this.method7877(arg12, arg14);
		if (arg13 == 0) {
			arg13 = this.aClass146_12.anInt3684;
		}
		@Pc(49) int[] local49;
		if (arg9 < arg13 + this.aClass146_12.anInt3688 + this.aClass146_12.anInt3689 && arg9 < arg13 + arg13) {
			local49 = null;
		} else {
			local49 = new int[] { arg15 };
		}
		@Pc(62) int local62 = this.aClass146_12.method3172(arg8, Static232.aStringArray16, arg7, local49);
		if (arg2 == -1) {
			arg2 = arg9 / arg13;
			if (arg2 <= 0) {
				arg2 = 1;
			}
		}
		if (arg2 > 0 && arg2 <= local62) {
			Static232.aStringArray16[arg2 - 1] = this.aClass146_12.method3171(Static232.aStringArray16[arg2 - 1], arg15, arg7);
			local62 = arg2;
		}
		if (arg0 == 3 && local62 == 1) {
			arg0 = 1;
		}
		@Pc(127) int local127;
		@Pc(188) int local188;
		if (arg0 == 0) {
			local127 = this.aClass146_12.anInt3688 + arg10;
		} else if (arg0 == 1) {
			local127 = arg10 + this.aClass146_12.anInt3688 + (arg9 - (local62 - 1) * arg13 - this.aClass146_12.anInt3689 - this.aClass146_12.anInt3688) / 2;
		} else if (arg0 == 2) {
			local127 = arg10 + arg9 - this.aClass146_12.anInt3689 - arg13 * (local62 + -1);
		} else {
			local188 = (arg9 - (local62 - 1) * arg13 - this.aClass146_12.anInt3688 - this.aClass146_12.anInt3689) / (local62 + 1);
			if (local188 < 0) {
				local188 = 0;
			}
			arg13 += local188;
			local127 = local188 + this.aClass146_12.anInt3688 + arg10;
		}
		for (local188 = 0; local188 < local62; local188++) {
			if (arg4 == 0) {
				this.method7868(arg6, arg1, arg5, arg7, arg11, Static232.aStringArray16[local188], arg3, local127);
			} else if (arg4 == 1) {
				this.method7868(arg6, arg1, arg5, arg7, arg11 + (arg15 - this.aClass146_12.method3173(Static232.aStringArray16[local188])) / 2, Static232.aStringArray16[local188], arg3, local127);
			} else if (arg4 == 2) {
				this.method7868(arg6, arg1, arg5, arg7, arg11 + arg15 - this.aClass146_12.method3173(Static232.aStringArray16[local188]), Static232.aStringArray16[local188], arg3, local127);
			} else if (local188 == local62 - 1) {
				this.method7868(arg6, arg1, arg5, arg7, arg11, Static232.aStringArray16[local188], arg3, local127);
			} else {
				this.method7874(arg15, Static232.aStringArray16[local188]);
				this.method7868(arg6, arg1, arg5, arg7, arg11, Static232.aStringArray16[local188], arg3, local127);
				Static69.anInt1151 = 0;
			}
			local127 += arg13;
		}
		return local62;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method7874(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; arg1.length() > local19; local19++) {
			@Pc(25) char local25 = arg1.charAt(local19);
			if (local25 == '<') {
				local17 = true;
			} else if (local25 == '>') {
				local17 = false;
			} else if (!local17 && local25 == ' ') {
				local15++;
			}
		}
		if (local15 > 0) {
			Static69.anInt1151 = (arg0 - this.aClass146_12.method3173(arg1) << 8) / local15;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;[Lclient!xa;I[IILjava/util/Random;IB)I")
	public final int method7875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class4[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) Random arg5, @OriginalArg(8) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg5.setSeed((long) arg1);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method7877((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg2.length();
		@Pc(49) int[] local49 = new int[local40];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local40; local53++) {
			local49[local53] = local51;
			if ((arg5.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method7878(arg3, arg6, arg0, null, local49, arg4, arg2);
		return local51;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7876(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static105.anInt1964 = Static105.anInt1964 & 0xFF000000 | Static133.method4069(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static105.anInt1964 = Static291.anInt4748 & 0xFFFFFF | Static105.anInt1964 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static105.anInt1964 = Static133.method4069(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static105.anInt1964 = Static291.anInt4748;
			} else if (arg0.startsWith("str=")) {
				Static271.anInt4465 = Static105.anInt1964 & 0xFF000000 | Static133.method4069(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static271.anInt4465 = Static105.anInt1964 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static271.anInt4465 = -1;
			} else if (arg0.startsWith("u=")) {
				Static80.anInt1397 = Static105.anInt1964 & 0xFF000000 | Static133.method4069(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static80.anInt1397 = Static105.anInt1964 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static80.anInt1397 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static386.anInt6902 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static386.anInt6902 = Static105.anInt1964 & 0xFF000000 | Static133.method4069(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static386.anInt6902 = Static105.anInt1964 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static386.anInt6902 = Static345.anInt6135;
			} else if (arg0.equals("br")) {
				this.method7877(Static345.anInt6135, Static291.anInt4748);
			}
		} catch (@Pc(189) Exception local189) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	private void method7877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static291.anInt4748 = arg1;
		Static105.anInt1964 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static80.anInt1397 = -1;
		Static271.anInt4465 = -1;
		Static397.anInt328 = 0;
		Static69.anInt1151 = 0;
		Static345.anInt6135 = arg0;
		Static386.anInt6902 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;II[II[I[ILjava/lang/String;)V")
	private void method7878(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6) {
		@Pc(7) int local7 = arg1 - this.aClass146_12.anInt3684;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg6.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static176.method2702(arg6.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(113) int local113;
				@Pc(125) int local125;
				if (local33 == '>' && local13 != -1) {
					@Pc(57) String local57 = arg6.substring(local13 + 1, local22);
					local13 = -1;
					if (local57.equals("lt")) {
						local33 = '<';
					} else if (local57.equals("gt")) {
						local33 = '>';
					} else if (local57.equals("nbsp")) {
						local33 = ' ';
					} else if (local57.equals("shy")) {
						local33 = '\u00ad';
					} else if (local57.equals("times")) {
						local33 = '×';
					} else if (local57.equals("euro")) {
						local33 = '€';
					} else if (local57.equals("copy")) {
						local33 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local113 = 0;
									} else {
										local113 = arg4[local17];
									}
									if (arg3 == null) {
										local125 = 0;
									} else {
										local125 = arg3[local17];
									}
									local17++;
									@Pc(136) int local136 = Static467.method6543(local57.substring(4));
									@Pc(140) Class4 local140 = arg0[local136];
									@Pc(149) int local149 = arg5 == null ? local140.a() : arg5[local136];
									local140.I(local113 + arg2, local125 + -local149 + this.aClass146_12.anInt3684 + local7, 1, 0, 1);
									local15 = -1;
									arg2 += arg0[local136].AA();
								} catch (@Pc(178) Exception local178) {
								}
							} else {
								this.method7876(local57);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass146_12.method3177(local33, local15);
					}
					@Pc(223) int local223;
					if (arg4 == null) {
						local223 = 0;
					} else {
						local223 = arg4[local17];
					}
					if (arg3 == null) {
						local113 = 0;
					} else {
						local113 = arg3[local17];
					}
					if (local33 != ' ') {
						if ((Static386.anInt6902 & 0xFF000000) != 0) {
							this.q(local33, local223 + arg2 + 1, local113 + local7 + 1, Static386.anInt6902, true);
						}
						this.q(local33, arg2 + local223, local113 + local7, Static105.anInt1964, false);
					} else if (Static69.anInt1151 > 0) {
						Static397.anInt328 += Static69.anInt1151;
						arg2 += Static397.anInt328 >> 8;
						Static397.anInt328 &= 0xFF;
					}
					local17++;
					local125 = this.aClass146_12.method3178(local33);
					if (Static271.anInt4465 != -1) {
						this.aClass121_17.method7138(local125, local7 + (int) ((double) this.aClass146_12.anInt3684 * 0.7D), Static271.anInt4465, arg2);
					}
					if (Static80.anInt1397 != -1) {
						this.aClass121_17.method7138(local125, this.aClass146_12.anInt3684 + local7, Static80.anInt1397, arg2);
					}
					arg2 += local125;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7879(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7877(arg4, arg2);
			this.method7868(null, null, 0, null, arg1, arg0, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;[I[Lclient!xa;IBI)V")
	public final void method7880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class4[] arg4, @OriginalArg(5) int arg5) {
		if (arg2 != null) {
			this.method7877(0, arg5);
			this.method7868(null, arg3, 0, arg4, arg0, arg2, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;IIILjava/lang/String;BIIILclient!fa;[IIIIII)I")
	public final int method7881(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class16 arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13) {
		return this.method7870(arg1, arg9, 0, arg7, arg6, arg5, arg8, arg0, arg4, arg2, arg13, arg10, arg11, 0, arg12, arg3);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	protected abstract void method7882(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class16 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;BIIIII)V")
	public final void method7883(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7877(-16777216, arg2);
		@Pc(16) int local16 = arg0.length();
		@Pc(23) int[] local23 = new int[local16];
		@Pc(26) int[] local26 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local23[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) arg4 / 5.0D + (double) local28 / 3.0D) * 5.0D);
		}
		this.method7878(null, arg1, arg3 - this.aClass146_12.method3173(arg0) / 2, local26, local23, null, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII[IIIBLjava/lang/String;I[IILjava/util/Random;I[Lclient!xa;)I")
	public final int method7884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Random arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class4[] arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg11.setSeed((long) arg5);
		@Pc(21) int local21 = (arg11.nextInt() & 0x1F) + 192;
		this.method7877(arg10 & 0xFFFFFF | local21 << 24, arg1 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg7.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg11.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(70) int local70 = arg2;
		@Pc(81) int local81 = this.aClass146_12.anInt3688 + arg8;
		if (arg0 == 1) {
			local81 += (arg3 - this.aClass146_12.anInt3689 - this.aClass146_12.anInt3688) / 2;
		} else if (arg0 == 2) {
			local81 = arg3 + arg8 - this.aClass146_12.anInt3689;
		}
		@Pc(116) int local116 = -1;
		if (arg6 == 1) {
			local116 = this.aClass146_12.method3173(arg7) + local46;
			local70 = arg2 + (arg12 - local116) / 2;
		} else if (arg6 == 2) {
			local116 = this.aClass146_12.method3173(arg7) + local46;
			local70 = arg2 + arg12 - local116;
		}
		this.method7878(arg13, local81, local70, null, local44, arg9, arg7);
		if (arg4 != null) {
			if (local116 == -1) {
				local116 = local46 + this.aClass146_12.method3173(arg7);
			}
			arg4[3] = this.aClass146_12.anInt3689 + this.aClass146_12.anInt3688;
			arg4[2] = local116;
			arg4[0] = local70;
			arg4[1] = local81 - this.aClass146_12.anInt3688;
		}
		return local46;
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
	protected abstract void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
