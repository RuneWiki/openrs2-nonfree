import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class29 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!r;")
	private final Class100 aClass100_13;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!sa;")
	private final Class294 aClass294_13;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!sa;)V")
	protected Class29(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class294 arg1) {
		this.aClass100_13 = arg0;
		this.aClass294_13 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!f;[ILjava/lang/String;I[I[II)V")
	private void method7103(@OriginalArg(0) int arg0, @OriginalArg(1) Class39[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 - this.aClass294_13.anInt8122;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static396.method4002(arg3.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(105) int local105;
				@Pc(117) int local117;
				if (local33 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg3.substring(local13 + 1, local22);
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
									if (arg2 == null) {
										local105 = 0;
									} else {
										local105 = arg2[local17];
									}
									if (arg4 == null) {
										local117 = 0;
									} else {
										local117 = arg4[local17];
									}
									local17++;
									@Pc(130) int local130 = Static158.method2594(local55.substring(4));
									@Pc(134) Class39 local134 = arg1[local130];
									@Pc(143) int local143 = arg5 == null ? local134.ca() : arg5[local130];
									local134.V(local105 + arg6, local11 + this.aClass294_13.anInt8122 + (-local143 - -local117), 1, 0, 1);
									local15 = -1;
									arg6 += arg1[local130].A();
								} catch (@Pc(173) Exception local173) {
								}
							} else {
								this.method7105(local55);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass294_13.method6728(local33, local15);
					}
					@Pc(225) int local225;
					if (arg2 == null) {
						local225 = 0;
					} else {
						local225 = arg2[local17];
					}
					if (arg4 == null) {
						local105 = 0;
					} else {
						local105 = arg4[local17];
					}
					if (local33 != ' ') {
						if ((Static541.anInt8835 & 0xFF000000) != 0) {
							this.OA(local33, local225 + arg6 + 1, local105 + 1 + local11, Static541.anInt8835, true);
						}
						this.OA(local33, local225 + arg6, local105 + local11, Static516.anInt8580, false);
					} else if (Static216.anInt4141 > 0) {
						Static435.anInt873 += Static216.anInt4141;
						arg6 += Static435.anInt873 >> 8;
						Static435.anInt873 &= 0xFF;
					}
					local17++;
					local117 = this.aClass294_13.method6717(local33);
					if (Static62.anInt1430 != -1) {
						this.aClass100_13.method6232(local11 + (int) ((double) this.aClass294_13.anInt8122 * 0.7D), arg6, local117, Static62.anInt1430);
					}
					if (Static538.anInt8796 != -1) {
						this.aClass100_13.method6232(local11 + this.aClass294_13.anInt8122, arg6, local117, Static538.anInt8796);
					}
					arg6 += local117;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ua;ILjava/lang/String;IIIII[Lclient!f;[IIIII)I")
	public final int method7104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class39[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method7116(arg0, arg2, arg4, arg13, arg5, arg10, arg11, arg1, arg14, arg3, arg9, arg12, 0, arg7, arg8, arg6);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method7105(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static516.anInt8580 = Static516.anInt8580 & 0xFF000000 | Static256.method3989(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static516.anInt8580 = Static516.anInt8580 & 0xFF000000 | Static157.anInt3161 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static516.anInt8580 = Static256.method3989(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static516.anInt8580 = Static157.anInt3161;
			} else if (arg0.startsWith("str=")) {
				Static62.anInt1430 = Static516.anInt8580 & 0xFF000000 | Static256.method3989(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static62.anInt1430 = Static516.anInt8580 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static62.anInt1430 = -1;
			} else if (arg0.startsWith("u=")) {
				Static538.anInt8796 = Static516.anInt8580 & 0xFF000000 | Static256.method3989(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static538.anInt8796 = Static516.anInt8580 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static538.anInt8796 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static541.anInt8835 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static541.anInt8835 = Static516.anInt8580 & 0xFF000000 | Static256.method3989(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static541.anInt8835 = Static516.anInt8580 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static541.anInt8835 = Static577.anInt9375;
			} else if (arg0.equals("br")) {
				this.method7107(Static157.anInt3161, Static577.anInt9375);
				return;
			}
		} catch (@Pc(180) Exception local180) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method7107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static435.anInt873 = 0;
		Static538.anInt8796 = -1;
		Static157.anInt3161 = arg0;
		Static516.anInt8580 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static62.anInt1430 = -1;
		Static216.anInt4141 = 0;
		Static577.anInt9375 = arg1;
		Static541.anInt8835 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!f;IIIILjava/util/Random;Ljava/lang/String;I[III[IIII)I")
	public final int method7109(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return 0;
		}
		arg5.setSeed((long) arg12);
		@Pc(28) int local28 = (arg5.nextInt() & 0x1F) + 192;
		this.method7107(arg11 & 0xFFFFFF | local28 << 24, local28 << 24 | arg3 & 0xFFFFFF);
		@Pc(48) int local48 = arg6.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg5.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(76) int local76 = arg8;
		@Pc(83) int local83 = arg2 + this.aClass294_13.anInt8114;
		if (arg9 == 1) {
			local83 += (arg1 - this.aClass294_13.anInt8114 - this.aClass294_13.anInt8124) / 2;
		} else if (arg9 == 2) {
			local83 = arg2 + arg1 - this.aClass294_13.anInt8124;
		}
		@Pc(121) int local121 = -1;
		if (arg13 == 1) {
			local121 = local53 + this.aClass294_13.method6718(arg6);
			local76 = arg8 + (arg4 - local121) / 2;
		} else if (arg13 == 2) {
			local121 = this.aClass294_13.method6718(arg6) + local53;
			local76 = arg8 + arg4 - local121;
		}
		this.method7103(local83, arg0, local51, arg6, null, arg10, local76);
		if (arg7 != null) {
			if (local121 == -1) {
				local121 = this.aClass294_13.method6718(arg6) + local53;
			}
			arg7[3] = this.aClass294_13.anInt8114 + this.aClass294_13.anInt8124;
			arg7[2] = local121;
			arg7[1] = local83 - this.aClass294_13.anInt8114;
			arg7[0] = local76;
		}
		return local53;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IIB)V")
	public final void method7110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7107(arg1, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) local24 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7103(arg0, null, local19, arg2, local22, null, arg3 - this.aClass294_13.method6718(arg2) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZILjava/lang/String;II)V")
	public final void method7111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7107(arg0, arg3);
			this.method7115(arg2, 0, null, null, null, arg1, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lclient!f;I[IIILjava/lang/String;)V")
	public final void method7112(@OriginalArg(2) Class39[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method7107(arg3, 0);
			this.method7115(arg5, 0, arg0, arg2, null, arg4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([ILjava/util/Random;[Lclient!f;IIIILjava/lang/String;ZI)I")
	public final int method7113(@OriginalArg(0) int[] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) Class39[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) String arg5, @OriginalArg(9) int arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg1.setSeed((long) arg6);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method7107(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg5.length();
		@Pc(48) int[] local48 = new int[local40];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local48[local52] = local50;
			if ((arg1.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method7103(arg4, arg2, local48, arg5, null, arg0, arg3);
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;IIIII)V")
	public final void method7114(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method7107(arg3, -16777216);
		@Pc(34) double local34 = 7.0D - (double) arg4 / 8.0D;
		if (local34 < 0.0D) {
			local34 = 0.0D;
		}
		@Pc(43) int local43 = arg1.length();
		@Pc(46) int[] local46 = new int[local43];
		for (@Pc(48) int local48 = 0; local48 < local43; local48++) {
			local46[local48] = (int) (Math.sin((double) local48 / 1.5D + (double) arg0) * local34);
		}
		this.method7103(arg2, null, null, arg1, local46, null, arg5 - this.aClass294_13.method6718(arg1) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!f;[ILclient!ua;III)V")
	private void method7115(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class39[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class20 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 - this.aClass294_13.anInt8122;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(37) char local37 = (char) (Static396.method4002(arg0.charAt(local20)) & 0xFF);
			if (local37 == '<') {
				local13 = local20;
			} else {
				if (local37 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg0.substring(local13 + 1, local20);
					local13 = -1;
					if (local60.equals("lt")) {
						local37 = '<';
					} else if (local60.equals("gt")) {
						local37 = '>';
					} else if (local60.equals("nbsp")) {
						local37 = ' ';
					} else if (local60.equals("shy")) {
						local37 = '\u00ad';
					} else if (local60.equals("times")) {
						local37 = '×';
					} else if (local60.equals("euro")) {
						local37 = '€';
					} else if (local60.equals("copy")) {
						local37 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									@Pc(122) int local122 = Static158.method2594(local60.substring(4));
									@Pc(126) Class39 local126 = arg2[local122];
									@Pc(135) int local135 = arg3 == null ? local126.ca() : arg3[local122];
									if ((Static516.anInt8580 & 0xFF000000) == -16777216) {
										local126.V(arg5, this.aClass294_13.anInt8122 + local11 - local135, 1, 0, 1);
									} else {
										local126.V(arg5, local11 + this.aClass294_13.anInt8122 - local135, 0, Static516.anInt8580 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg5 += arg2[local122].A();
									local15 = -1;
								} catch (@Pc(188) Exception local188) {
								}
							} else {
								this.method7105(local60);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass294_13.method6728(local37, local15);
					}
					if (local37 == ' ') {
						if (Static216.anInt4141 > 0) {
							Static435.anInt873 += Static216.anInt4141;
							arg5 += Static435.anInt873 >> 8;
							Static435.anInt873 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static541.anInt8835 & 0xFF000000) != 0) {
							this.OA(local37, arg5 + 1, local11 + 1, Static541.anInt8835, true);
						}
						this.OA(local37, arg5, local11, Static516.anInt8580, false);
					} else {
						if ((Static541.anInt8835 & 0xFF000000) != 0) {
							this.method7122(local37, arg5 + 1, local11 + 1, Static541.anInt8835, true, arg4, arg1, arg6);
						}
						this.method7122(local37, arg5, local11, Static516.anInt8580, false, arg4, arg1, arg6);
					}
					@Pc(318) int local318 = this.aClass294_13.method6717(local37);
					if (Static62.anInt1430 != -1) {
						this.aClass100_13.method6232((int) ((double) this.aClass294_13.anInt8122 * 0.7D) + local11, arg5, local318, Static62.anInt1430);
					}
					if (Static538.anInt8796 != -1) {
						this.aClass100_13.method6232(local11 + this.aClass294_13.anInt8122 + 1, arg5, local318, Static538.anInt8796);
					}
					arg5 += local318;
					local15 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ua;Ljava/lang/String;IIZ[IIIII[Lclient!f;IIIII)I")
	public final int method7116(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class39[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method7107(arg4, arg0);
		if (arg7 == 0) {
			arg7 = this.aClass294_13.anInt8122;
		}
		@Pc(47) int[] local47;
		if (this.aClass294_13.anInt8124 + this.aClass294_13.anInt8114 + arg7 > arg14 && arg14 < arg7 + arg7) {
			local47 = null;
		} else {
			local47 = new int[] { arg9 };
		}
		if (arg12 == -1) {
			arg12 = arg14 / arg7;
			if (arg12 <= 0) {
				arg12 = 1;
			}
		}
		@Pc(77) int local77 = this.aClass294_13.method6721(arg2, Static141.aStringArray46, local47, arg10);
		if (arg12 > 0 && arg12 <= local77) {
			local77 = arg12;
			Static141.aStringArray46[arg12 - 1] = this.aClass294_13.method6719(arg10, Static141.aStringArray46[arg12 - 1], arg9);
		}
		if (arg13 == 3 && local77 == 1) {
			arg13 = 1;
		}
		@Pc(134) int local134;
		@Pc(196) int local196;
		if (arg13 == 0) {
			local134 = this.aClass294_13.anInt8114 + arg3;
		} else if (arg13 == 1) {
			local134 = (arg14 - arg7 * (local77 - 1) - this.aClass294_13.anInt8114 - this.aClass294_13.anInt8124) / 2 + arg3 + this.aClass294_13.anInt8114;
		} else if (arg13 == 2) {
			local134 = arg3 + arg14 - this.aClass294_13.anInt8124 - (local77 - 1) * arg7;
		} else {
			local196 = (arg14 - arg7 * (local77 - 1) - this.aClass294_13.anInt8124 - this.aClass294_13.anInt8114) / (local77 + 1);
			if (local196 < 0) {
				local196 = 0;
			}
			arg7 += local196;
			local134 = local196 + arg3 + this.aClass294_13.anInt8114;
		}
		for (local196 = 0; local196 < local77; local196++) {
			if (arg15 == 0) {
				this.method7115(Static141.aStringArray46[local196], arg6, arg10, arg5, arg1, arg8, arg11, local134);
			} else if (arg15 == 1) {
				this.method7115(Static141.aStringArray46[local196], arg6, arg10, arg5, arg1, (arg9 - this.aClass294_13.method6718(Static141.aStringArray46[local196])) / 2 + arg8, arg11, local134);
			} else if (arg15 == 2) {
				this.method7115(Static141.aStringArray46[local196], arg6, arg10, arg5, arg1, arg8 + arg9 - this.aClass294_13.method6718(Static141.aStringArray46[local196]), arg11, local134);
			} else if (local196 == local77 - 1) {
				this.method7115(Static141.aStringArray46[local196], arg6, arg10, arg5, arg1, arg8, arg11, local134);
			} else {
				this.method7120(arg9, Static141.aStringArray46[local196]);
				this.method7115(Static141.aStringArray46[local196], arg6, arg10, arg5, arg1, arg8, arg11, local134);
				Static216.anInt4141 = 0;
			}
			local134 += arg7;
		}
		return local77;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method7117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method7107(arg3, arg4);
			this.method7115(arg2, 0, null, null, null, arg0 - this.aClass294_13.method6718(arg2), 0, arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method7118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method7107(arg0, arg2);
			this.method7115(arg4, 0, null, null, null, arg1 - this.aClass294_13.method6718(arg4) / 2, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method7120(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; local16 < arg1.length(); local16++) {
			@Pc(22) char local22 = arg1.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local12++;
			}
		}
		if (local12 > 0) {
			Static216.anInt4141 = (arg0 - this.aClass294_13.method6718(arg1) << 8) / local12;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method7122(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method7124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method7107(arg3, -16777216);
		@Pc(16) int local16 = arg4.length();
		@Pc(30) int[] local30 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local30[local32] = (int) (Math.sin((double) local32 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method7103(arg1, null, null, arg4, local30, null, arg0 - this.aClass294_13.method6718(arg4) / 2);
	}
}
