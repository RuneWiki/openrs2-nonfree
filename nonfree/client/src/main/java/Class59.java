import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class59 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!eu;")
	private final Class70 aClass70_33;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!qa;")
	private final Class172 aClass172_11;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;)V")
	protected Class59(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class70 arg1) {
		this.aClass70_33 = arg1;
		this.aClass172_11 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5770(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static7.anInt116 = Static7.anInt116 & 0xFF000000 | Static347.method4609(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static7.anInt116 = Static7.anInt116 & 0xFF000000 | Static344.anInt5834 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static7.anInt116 = Static347.method4609(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static7.anInt116 = Static344.anInt5834;
			} else if (arg0.startsWith("str=")) {
				Static289.anInt5233 = Static347.method4609(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static289.anInt5233 = -8388608;
			} else if (arg0.equals("/str")) {
				Static289.anInt5233 = -1;
			} else if (arg0.startsWith("u=")) {
				Static437.anInt7361 = Static347.method4609(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static437.anInt7361 = -16777216;
			} else if (arg0.equals("/u")) {
				Static437.anInt7361 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static31.anInt6061 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static31.anInt6061 = Static347.method4609(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static31.anInt6061 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static31.anInt6061 = Static360.anInt6098;
			} else if (arg0.equals("br")) {
				this.method5775(Static344.anInt5834, Static360.anInt6098);
			}
		} catch (@Pc(167) Exception local167) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII[IILjava/util/Random;Ljava/lang/String;[Lclient!f;II[III)I")
	public final int method5771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Random arg6, @OriginalArg(8) String arg7, @OriginalArg(9) Class8[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg6.setSeed((long) arg1);
		@Pc(26) int local26 = (arg6.nextInt() & 0x1F) + 192;
		this.method5775(arg10 & 0xFFFFFF | local26 << 24, arg0 & 0xFFFFFF | local26 << 24);
		@Pc(46) int local46 = arg7.length();
		@Pc(49) int[] local49 = new int[local46];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
			local49[local53] = local51;
			if ((arg6.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		@Pc(70) int local70 = arg2;
		@Pc(76) int local76 = this.aClass70_33.anInt2278 + arg13;
		@Pc(78) int local78 = -1;
		if (arg9 == 1) {
			local76 += (arg5 - this.aClass70_33.anInt2270 - this.aClass70_33.anInt2278) / 2;
		} else if (arg9 == 2) {
			local76 = arg5 + arg13 - this.aClass70_33.anInt2270;
		}
		if (arg12 == 1) {
			local78 = local51 + this.aClass70_33.method1759(arg7);
			local70 = arg2 + (arg3 - local78) / 2;
		} else if (arg12 == 2) {
			local78 = local51 + this.aClass70_33.method1759(arg7);
			local70 = arg2 + arg3 - local78;
		}
		this.method5787(arg7, arg8, local70, local49, local76, null, arg11);
		if (arg4 != null) {
			if (local78 == -1) {
				local78 = local51 + this.aClass70_33.method1759(arg7);
			}
			arg4[0] = local70;
			arg4[3] = this.aClass70_33.anInt2278 + this.aClass70_33.anInt2270;
			arg4[2] = local78;
			arg4[1] = local76 - this.aClass70_33.anInt2278;
		}
		return local51;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method5772(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5775(arg3, -16777216);
		@Pc(18) int local18 = arg0.length();
		@Pc(21) int[] local21 = new int[local18];
		for (@Pc(23) int local23 = 0; local23 < local18; local23++) {
			local21[local23] = (int) (Math.sin((double) local23 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method5787(arg0, null, arg4 - this.aClass70_33.method1759(arg0) / 2, null, arg2, local21, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method5773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method5775(arg2, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg4 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg5.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (local20 * Math.sin((double) local34 / 1.5D + (double) arg1));
		}
		this.method5787(arg5, null, arg3 - this.aClass70_33.method1759(arg5) / 2, null, arg0, local32, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5774(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5775(arg1, arg2);
			this.method5780(null, 0, 0, arg4 - this.aClass70_33.method1759(arg0) / 2, arg3, arg0, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	private void method5775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static80.anInt2016 = 0;
		Static289.anInt5233 = -1;
		Static344.anInt5834 = arg0;
		Static7.anInt116 = arg0;
		Static199.anInt3933 = 0;
		Static437.anInt7361 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static360.anInt6098 = arg1;
		Static31.anInt6061 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method5776(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(14) int local14 = 0; local14 < arg1.length(); local14++) {
			@Pc(19) char local19 = arg1.charAt(local14);
			if (local19 == '<') {
				local7 = true;
			} else if (local19 == '>') {
				local7 = false;
			} else if (!local7 && local19 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static199.anInt3933 = (arg0 - this.aClass70_33.method1759(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	protected abstract void method5777(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class58 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5775(arg0, -16777216);
		@Pc(14) int local14 = arg2.length();
		@Pc(17) int[] local17 = new int[local14];
		@Pc(20) int[] local20 = new int[local14];
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local17[local22] = (int) (Math.sin((double) arg4 / 5.0D + (double) local22 / 5.0D) * 5.0D);
			local20[local22] = (int) (Math.sin((double) local22 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method5787(arg2, null, arg3 - this.aClass70_33.method1759(arg2) / 2, local17, arg1, local20, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ea;IIIIILjava/lang/String;[Lclient!f;[I)V")
	private void method5780(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class8[] arg6, @OriginalArg(8) int[] arg7) {
		@Pc(9) int local9 = arg4 - this.aClass70_33.anInt2276;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = -1;
		@Pc(20) int local20 = arg5.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(32) char local32 = (char) (Static177.method2821(arg5.charAt(local22)) & 0xFF);
			if (local32 == '<') {
				local15 = local22;
			} else {
				if (local32 == '>' && local15 != -1) {
					@Pc(53) String local53 = arg5.substring(local15 + 1, local22);
					local15 = -1;
					if (local53.equals("lt")) {
						local32 = '<';
					} else if (local53.equals("gt")) {
						local32 = '>';
					} else if (local53.equals("nbsp")) {
						local32 = ' ';
					} else if (local53.equals("shy")) {
						local32 = '\u00ad';
					} else if (local53.equals("times")) {
						local32 = '×';
					} else if (local53.equals("euro")) {
						local32 = '€';
					} else if (local53.equals("copy")) {
						local32 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=")) {
								try {
									@Pc(114) int local114 = Static247.method3714(local53.substring(4));
									@Pc(118) Class8 local118 = arg6[local114];
									@Pc(127) int local127 = arg7 == null ? local118.JA() : arg7[local114];
									if ((Static7.anInt116 & 0xFF000000) == -16777216) {
										local118.YA(arg3, this.aClass70_33.anInt2276 + local9 - local127, 1, 0, 1);
									} else {
										local118.YA(arg3, local9 + this.aClass70_33.anInt2276 - local127, 0, Static7.anInt116 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg3 += arg6[local114].ja();
									local17 = -1;
								} catch (@Pc(178) Exception local178) {
								}
							} else {
								this.method5770(local53);
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local15 == -1) {
					if (local17 != -1) {
						arg3 += this.aClass70_33.method1750(local32, local17);
					}
					if (local32 == ' ') {
						if (Static199.anInt3933 > 0) {
							Static80.anInt2016 += Static199.anInt3933;
							arg3 += Static80.anInt2016 >> 8;
							Static80.anInt2016 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static31.anInt6061 & 0xFF000000) != 0) {
							this.B(local32, arg3 + 1, local9 - -1, Static31.anInt6061, true);
						}
						this.B(local32, arg3, local9, Static7.anInt116, false);
					} else {
						if ((Static31.anInt6061 & 0xFF000000) != 0) {
							this.method5777(local32, arg3 + 1, local9 + 1, Static31.anInt6061, true, arg0, arg1, arg2);
						}
						this.method5777(local32, arg3, local9, Static7.anInt116, false, arg0, arg1, arg2);
					}
					@Pc(295) int local295 = this.aClass70_33.method1754(local32);
					if (Static289.anInt5233 != -1) {
						this.aClass172_11.method5517(arg3, Static289.anInt5233, local9 + (int) ((double) this.aClass70_33.anInt2276 * 0.7D), local295);
					}
					if (Static437.anInt7361 != -1) {
						this.aClass172_11.method5517(arg3, Static437.anInt7361, local9 + this.aClass70_33.anInt2276 + 1, local295);
					}
					arg3 += local295;
					local17 = local32;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5781(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method5775(arg1, -1);
			this.method5780(null, 0, 0, arg0 - this.aClass70_33.method1759(arg3), arg2, arg3, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[IILclient!ea;IILjava/lang/String;IIIII[Lclient!f;I)I")
	public final int method5783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) Class58 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) String arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) Class8[] arg11, @OriginalArg(15) int arg12) {
		return this.method5786(0, arg12, arg7, arg10, arg9, arg5, arg6, arg1, arg3, 1, 0, arg2, arg4, arg0, arg8, arg11);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([ILjava/util/Random;ILjava/lang/String;IIIZ[Lclient!f;I)I")
	public final int method5784(@OriginalArg(0) int[] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(8) Class8[] arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg1.setSeed((long) arg2);
		@Pc(18) int local18 = (arg1.nextInt() & 0x1F) + 192;
		this.method5775(local18 << 24 | 0xFFFFFF, (local18 | 0x0) << 24);
		@Pc(38) int local38 = arg3.length();
		@Pc(41) int[] local41 = new int[local38];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local38; local45++) {
			local41[local45] = local43;
			if ((arg1.nextInt() & 0x3) == 0) {
				local43++;
			}
		}
		this.method5787(arg3, arg5, arg4, local41, arg6, null, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILjava/lang/String;ILclient!ea;II[IIIII[Lclient!f;)I")
	public final int method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class58 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(16) Class8[] arg15) {
		if (arg6 == null) {
			return 0;
		}
		this.method5775(arg2, arg5);
		if (arg0 == 0) {
			arg0 = this.aClass70_33.anInt2276;
		}
		@Pc(52) int[] local52;
		if (arg0 + this.aClass70_33.anInt2270 + this.aClass70_33.anInt2278 > arg14 && arg0 + arg0 > arg14) {
			local52 = null;
		} else {
			local52 = new int[] { arg12 };
		}
		if (arg10 == -1) {
			arg10 = arg14 / arg0;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		@Pc(79) int local79 = this.aClass70_33.method1757(Static319.aStringArray17, arg15, arg6, local52);
		if (arg10 > 0 && local79 >= arg10) {
			Static319.aStringArray17[arg10 - 1] = this.aClass70_33.method1753(Static319.aStringArray17[arg10 - 1], arg12, arg15);
			local79 = arg10;
		}
		if (arg13 == 3 && local79 == 1) {
			arg13 = 1;
		}
		@Pc(158) int local158;
		@Pc(201) int local201;
		if (arg13 == 0) {
			local158 = this.aClass70_33.anInt2278 + arg1;
		} else if (arg13 == 1) {
			local158 = (arg14 - arg0 * (local79 - 1) - this.aClass70_33.anInt2270 - this.aClass70_33.anInt2278) / 2 + arg1 + this.aClass70_33.anInt2278;
		} else if (arg13 == 2) {
			local158 = arg14 + arg1 - this.aClass70_33.anInt2270 - arg0 * (local79 - 1);
		} else {
			local201 = (arg14 - arg0 * (local79 - 1) - this.aClass70_33.anInt2278 - this.aClass70_33.anInt2270) / (local79 - -1);
			if (local201 < 0) {
				local201 = 0;
			}
			local158 = arg1 + this.aClass70_33.anInt2278 + local201;
			arg0 += local201;
		}
		for (local201 = 0; local201 < local79; local201++) {
			if (arg9 == 0) {
				this.method5780(arg8, arg7, arg4, arg3, local158, Static319.aStringArray17[local201], arg15, arg11);
			} else if (arg9 == 1) {
				this.method5780(arg8, arg7, arg4, (arg12 - this.aClass70_33.method1759(Static319.aStringArray17[local201])) / 2 + arg3, local158, Static319.aStringArray17[local201], arg15, arg11);
			} else if (arg9 == 2) {
				this.method5780(arg8, arg7, arg4, arg3 + arg12 - this.aClass70_33.method1759(Static319.aStringArray17[local201]), local158, Static319.aStringArray17[local201], arg15, arg11);
			} else if (local201 == local79 - 1) {
				this.method5780(arg8, arg7, arg4, arg3, local158, Static319.aStringArray17[local201], arg15, arg11);
			} else {
				this.method5776(arg12, Static319.aStringArray17[local201]);
				this.method5780(arg8, arg7, arg4, arg3, local158, Static319.aStringArray17[local201], arg15, arg11);
				Static199.anInt3933 = 0;
			}
			local158 += arg0;
		}
		return local79;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;I[IBI[I[I)V")
	private void method5787(@OriginalArg(0) String arg0, @OriginalArg(1) Class8[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg4 - this.aClass70_33.anInt2276;
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg0.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static177.method2821(arg0.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local11 = local24;
			} else {
				@Pc(117) int local117;
				@Pc(128) int local128;
				if (local34 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg0.substring(local11 + 1, local24);
					local11 = -1;
					if (local55.equals("lt")) {
						local34 = '<';
					} else if (local55.equals("gt")) {
						local34 = '>';
					} else if (local55.equals("nbsp")) {
						local34 = ' ';
					} else if (local55.equals("shy")) {
						local34 = '\u00ad';
					} else if (local55.equals("times")) {
						local34 = '×';
					} else if (local55.equals("euro")) {
						local34 = '€';
					} else if (local55.equals("copy")) {
						local34 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local117 = 0;
									} else {
										local117 = arg3[local19];
									}
									if (arg5 == null) {
										local128 = 0;
									} else {
										local128 = arg5[local19];
									}
									local19++;
									@Pc(140) int local140 = Static247.method3714(local55.substring(4));
									@Pc(144) Class8 local144 = arg1[local140];
									@Pc(153) int local153 = arg6 == null ? local144.JA() : arg6[local140];
									local144.YA(arg2 + local117, local128 + (-local153 + local9 - -this.aClass70_33.anInt2276), 1, 0, 1);
									local17 = -1;
									arg2 += arg1[local140].ja();
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method5770(local55);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					if (local17 != -1) {
						arg2 += this.aClass70_33.method1750(local34, local17);
					}
					@Pc(216) int local216;
					if (arg3 == null) {
						local216 = 0;
					} else {
						local216 = arg3[local19];
					}
					if (arg5 == null) {
						local117 = 0;
					} else {
						local117 = arg5[local19];
					}
					local19++;
					if (local34 != ' ') {
						if ((Static31.anInt6061 & 0xFF000000) != 0) {
							this.B(local34, arg2 + local216 + 1, local9 + 1 + local117, Static31.anInt6061, true);
						}
						this.B(local34, local216 + arg2, local117 + local9, Static7.anInt116, false);
					} else if (Static199.anInt3933 > 0) {
						Static80.anInt2016 += Static199.anInt3933;
						arg2 += Static80.anInt2016 >> 8;
						Static80.anInt2016 &= 0xFF;
					}
					local128 = this.aClass70_33.method1754(local34);
					if (Static289.anInt5233 != -1) {
						this.aClass172_11.method5517(arg2, Static289.anInt5233, (int) ((double) this.aClass70_33.anInt2276 * 0.7D) + local9, local128);
					}
					if (Static437.anInt7361 != -1) {
						this.aClass172_11.method5517(arg2, Static437.anInt7361, local9 + this.aClass70_33.anInt2276, local128);
					}
					arg2 += local128;
					local17 = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5788(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5775(arg2, arg0);
			this.method5780(null, 0, 0, arg3, arg4, arg1, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI[Lclient!f;I[ILjava/lang/String;II)V")
	public final void method5789(@OriginalArg(1) int arg0, @OriginalArg(2) Class8[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		if (arg4 != null) {
			this.method5775(arg2, 0);
			this.method5780(null, 0, 0, arg0, arg5, arg4, arg1, arg3);
		}
	}
}
