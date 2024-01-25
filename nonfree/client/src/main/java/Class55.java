import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class55 {

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!pia;")
	private final Class272 aClass272_14;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!ha;")
	private final Class133 aClass133_12;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!pia;)V")
	protected Class55(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class272 arg1) {
		this.aClass272_14 = arg1;
		this.aClass133_12 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method6007(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[Lclient!it;Ljava/lang/String;II[ILclient!aa;III)I")
	public final int method6008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class28[] arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) Class1 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method6020(arg14, arg5, arg8, arg0, arg10, 0, arg2, arg11, arg6, arg12, arg3, arg9, arg7, arg13, arg1, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/util/Random;ILjava/lang/String;II[Lclient!it;II[I[IIIII)I")
	public final int method6009(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class28[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg1.setSeed((long) arg5);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method6018(local20 << 24 | arg8 & 0xFFFFFF, arg4 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg1.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg7;
		@Pc(83) int local83 = arg12 + this.aClass272_14.anInt7414;
		@Pc(85) int local85 = -1;
		if (arg0 == 1) {
			local83 += (arg11 - this.aClass272_14.anInt7417 - this.aClass272_14.anInt7414) / 2;
		} else if (arg0 == 2) {
			local83 = arg12 + arg11 - this.aClass272_14.anInt7417;
		}
		if (arg13 == 1) {
			local85 = this.aClass272_14.method6570(arg3) + local45;
			local69 = arg7 + (arg2 - local85) / 2;
		} else if (arg13 == 2) {
			local85 = this.aClass272_14.method6570(arg3) + local45;
			local69 = arg7 + arg2 - local85;
		}
		this.method6016(null, local69, local83, local43, arg10, arg6, arg3);
		if (arg9 != null) {
			if (local85 == -1) {
				local85 = this.aClass272_14.method6570(arg3) + local45;
			}
			arg9[2] = local85;
			arg9[3] = this.aClass272_14.anInt7417 + this.aClass272_14.anInt7414;
			arg9[1] = local83 - this.aClass272_14.anInt7414;
			arg9[0] = local69;
		}
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6011(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static498.anInt8651 = Static498.anInt8651 & 0xFF000000 | Static574.method8328(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static498.anInt8651 = Static563.anInt9470 & 0xFFFFFF | Static498.anInt8651 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static498.anInt8651 = Static574.method8328(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static498.anInt8651 = Static563.anInt9470;
			} else if (arg0.startsWith("str=")) {
				Static372.anInt6186 = Static498.anInt8651 & 0xFF000000 | Static574.method8328(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static372.anInt6186 = Static498.anInt8651 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static372.anInt6186 = -1;
			} else if (arg0.startsWith("u=")) {
				Static631.anInt10491 = Static498.anInt8651 & 0xFF000000 | Static574.method8328(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static631.anInt10491 = Static498.anInt8651 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static631.anInt10491 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static44.anInt944 = 0;
				return;
			} else if (arg0.startsWith("shad=")) {
				Static44.anInt944 = Static498.anInt8651 & 0xFF000000 | Static574.method8328(arg0.substring(5));
				return;
			} else if (arg0.equals("shad")) {
				Static44.anInt944 = Static498.anInt8651 & 0xFF000000;
				return;
			} else if (arg0.equals("/shad")) {
				Static44.anInt944 = Static457.anInt7735;
				return;
			} else if (arg0.equals("br")) {
				this.method6018(Static563.anInt9470, Static457.anInt7735);
				return;
			}
		} catch (@Pc(173) Exception local173) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!it;[IIBI)V")
	public final void method6012(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class28[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 != null) {
			this.method6018(arg0, 0);
			this.method6021(0, arg5, arg3, arg1, 0, arg4, null, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILjava/lang/String;III)V")
	public final void method6013(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6018(arg3, arg0);
			this.method6021(0, arg4 - this.aClass272_14.method6570(arg1) / 2, null, arg1, 0, arg2, null, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method6014(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
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
			Static55.anInt1106 = (arg1 - this.aClass272_14.method6570(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIII[I[I[Lclient!it;Ljava/lang/String;)V")
	private void method6016(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class28[] arg5, @OriginalArg(7) String arg6) {
		@Pc(11) int local11 = arg2 - this.aClass272_14.anInt7410;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg6.length();
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(37) char local37 = (char) (Static573.method2156(arg6.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				@Pc(120) int local120;
				@Pc(132) int local132;
				if (local37 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg6.substring(local13 + 1, local26);
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
									if (arg3 == null) {
										local120 = 0;
									} else {
										local120 = arg3[local17];
									}
									if (arg0 == null) {
										local132 = 0;
									} else {
										local132 = arg0[local17];
									}
									local17++;
									@Pc(143) int local143 = Static548.method7986(local60.substring(4));
									@Pc(147) Class28 local147 = arg5[local143];
									@Pc(156) int local156 = arg4 == null ? local147.method4042() : arg4[local143];
									local147.method4034(arg1 + local120, -local156 + this.aClass272_14.anInt7410 + (local11 - -local132), 1, 0, 1);
									arg1 += arg5[local143].method4035();
									local15 = -1;
								} catch (@Pc(187) Exception local187) {
								}
							} else {
								this.method6011(local60);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass272_14.method6575(local37, local15);
					}
					@Pc(229) int local229;
					if (arg3 == null) {
						local229 = 0;
					} else {
						local229 = arg3[local17];
					}
					if (arg0 == null) {
						local120 = 0;
					} else {
						local120 = arg0[local17];
					}
					local17++;
					if (local37 != ' ') {
						if ((Static44.anInt944 & 0xFF000000) != 0) {
							this.fa(local37, local229 + arg1 + 1, local120 + (local11 - -1), Static44.anInt944, true);
						}
						this.fa(local37, local229 + arg1, local11 - -local120, Static498.anInt8651, false);
					} else if (Static55.anInt1106 > 0) {
						Static349.anInt5873 += Static55.anInt1106;
						arg1 += Static349.anInt5873 >> 8;
						Static349.anInt5873 &= 0xFF;
					}
					local132 = this.aClass272_14.method6569(local37);
					if (Static372.anInt6186 != -1) {
						this.aClass133_12.method7287(local132, Static372.anInt6186, local11 + (int) ((double) this.aClass272_14.anInt7410 * 0.7D), arg1);
					}
					if (Static631.anInt10491 != -1) {
						this.aClass133_12.method7287(local132, Static631.anInt10491, this.aClass272_14.anInt7410 + local11, arg1);
					}
					local15 = local37;
					arg1 += local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method6017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method6018(arg2, -16777216);
		@Pc(20) int local20 = arg4.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method6016(local26, arg3 - this.aClass272_14.method6570(arg4) / 2, arg1, local23, null, null, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method6018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static55.anInt1106 = 0;
		Static631.anInt10491 = -1;
		Static372.anInt6186 = -1;
		Static563.anInt9470 = arg0;
		Static498.anInt8651 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static349.anInt5873 = 0;
		Static457.anInt7735 = arg1;
		Static44.anInt944 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIIZ)V")
	public final void method6019(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method6018(arg0, -16777216);
		@Pc(31) double local31 = 7.0D - (double) arg3 / 8.0D;
		if (local31 < 0.0D) {
			local31 = 0.0D;
		}
		@Pc(40) int local40 = arg1.length();
		@Pc(43) int[] local43 = new int[local40];
		for (@Pc(45) int local45 = 0; local45 < local40; local45++) {
			local43[local45] = (int) (local31 * Math.sin((double) arg4 + (double) local45 / 1.5D));
		}
		this.method6016(local43, arg2 - this.aClass272_14.method6570(arg1) / 2, arg5, null, null, null, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII[IIILclient!aa;[Lclient!it;IIILjava/lang/String;III)I")
	public final int method6020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) Class28[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg12 == null) {
			return 0;
		}
		this.method6018(arg9, arg2);
		if (arg3 == 0) {
			arg3 = this.aClass272_14.anInt7410;
		}
		@Pc(42) int[] local42;
		if (arg11 < arg3 + this.aClass272_14.anInt7417 + this.aClass272_14.anInt7414 && arg3 + arg3 > arg11) {
			local42 = null;
		} else {
			local42 = new int[] { arg0 };
		}
		if (arg5 == -1) {
			arg5 = arg11 / arg3;
			if (arg5 <= 0) {
				arg5 = 1;
			}
		}
		@Pc(72) int local72 = this.aClass272_14.method6571(local42, arg8, arg12, Static171.aStringArray19);
		if (arg5 > 0 && local72 >= arg5) {
			Static171.aStringArray19[arg5 - 1] = this.aClass272_14.method6573(arg0, Static171.aStringArray19[arg5 - 1], arg8);
			local72 = arg5;
		}
		if (arg6 == 3 && local72 == 1) {
			arg6 = 1;
		}
		@Pc(145) int local145;
		if (arg6 == 0) {
			local145 = this.aClass272_14.anInt7414 + arg15;
		} else if (arg6 == 1) {
			local145 = (arg11 - this.aClass272_14.anInt7414 - this.aClass272_14.anInt7417 - (local72 + -1) * arg3) / 2 + arg15 + this.aClass272_14.anInt7414;
		} else if (arg6 == 2) {
			local145 = arg15 + arg11 - arg3 * (local72 - 1) - this.aClass272_14.anInt7417;
		} else {
			@Pc(191) int local191 = (arg11 - arg3 * (local72 - 1) - this.aClass272_14.anInt7417 - this.aClass272_14.anInt7414) / (local72 + 1);
			if (local191 < 0) {
				local191 = 0;
			}
			arg3 += local191;
			local145 = this.aClass272_14.anInt7414 + arg15 + local191;
		}
		for (@Pc(228) int local228 = 0; local228 < local72; local228++) {
			if (arg13 == 0) {
				this.method6021(arg10, arg1, arg4, Static171.aStringArray19[local228], arg14, local145, arg7, arg8);
			} else if (arg13 == 1) {
				this.method6021(arg10, (arg0 - this.aClass272_14.method6570(Static171.aStringArray19[local228])) / 2 + arg1, arg4, Static171.aStringArray19[local228], arg14, local145, arg7, arg8);
			} else if (arg13 == 2) {
				this.method6021(arg10, arg1 + arg0 - this.aClass272_14.method6570(Static171.aStringArray19[local228]), arg4, Static171.aStringArray19[local228], arg14, local145, arg7, arg8);
			} else if (local228 == local72 - 1) {
				this.method6021(arg10, arg1, arg4, Static171.aStringArray19[local228], arg14, local145, arg7, arg8);
			} else {
				this.method6014(Static171.aStringArray19[local228], arg0);
				this.method6021(arg10, arg1, arg4, Static171.aStringArray19[local228], arg14, local145, arg7, arg8);
				Static55.anInt1106 = 0;
			}
			local145 += arg3;
		}
		return local72;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;IILclient!aa;Z[Lclient!it;)V")
	private void method6021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(8) Class28[] arg7) {
		@Pc(7) int local7 = arg5 - this.aClass272_14.anInt7410;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(52) char local52 = (char) (Static573.method2156(arg3.charAt(local20)) & 0xFF);
			if (local52 == '<') {
				local13 = local20;
			} else {
				if (local52 == '>' && local13 != -1) {
					@Pc(74) String local74 = arg3.substring(local13 + 1, local20);
					local13 = -1;
					if (local74.equals("lt")) {
						local52 = '<';
					} else if (local74.equals("gt")) {
						local52 = '>';
					} else if (local74.equals("nbsp")) {
						local52 = ' ';
					} else if (local74.equals("shy")) {
						local52 = '\u00ad';
					} else if (local74.equals("times")) {
						local52 = '×';
					} else if (local74.equals("euro")) {
						local52 = '€';
					} else if (local74.equals("copy")) {
						local52 = '©';
					} else {
						if (!local74.equals("reg")) {
							if (local74.startsWith("img=")) {
								try {
									@Pc(134) int local134 = Static548.method7986(local74.substring(4));
									@Pc(138) Class28 local138 = arg7[local134];
									@Pc(147) int local147 = arg2 == null ? local138.method4042() : arg2[local134];
									if ((Static498.anInt8651 & -16777216) == -16777216) {
										local138.method4034(arg1, this.aClass272_14.anInt7410 + local7 - local147, 1, 0, 1);
									} else {
										local138.method4034(arg1, local7 + this.aClass272_14.anInt7410 - local147, 0, Static498.anInt8651 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg7[local134].method4035();
									local15 = -1;
								} catch (@Pc(196) Exception local196) {
								}
							} else {
								this.method6011(local74);
							}
							continue;
						}
						local52 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass272_14.method6575(local52, local15);
					}
					if (local52 == ' ') {
						if (Static55.anInt1106 > 0) {
							Static349.anInt5873 += Static55.anInt1106;
							arg1 += Static349.anInt5873 >> 8;
							Static349.anInt5873 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static44.anInt944 & 0xFF000000) != 0) {
							this.fa(local52, arg1 + 1, local7 + 1, Static44.anInt944, true);
						}
						this.fa(local52, arg1, local7, Static498.anInt8651, false);
					} else {
						if ((Static44.anInt944 & 0xFF000000) != 0) {
							this.method6007(local52, arg1 + 1, local7 + 1, Static44.anInt944, true, arg6, arg4, arg0);
						}
						this.method6007(local52, arg1, local7, Static498.anInt8651, false, arg6, arg4, arg0);
					}
					@Pc(325) int local325 = this.aClass272_14.method6569(local52);
					if (Static372.anInt6186 != -1) {
						this.aClass133_12.method7287(local325, Static372.anInt6186, (int) ((double) this.aClass272_14.anInt7410 * 0.7D) + local7, arg1);
					}
					if (Static631.anInt10491 != -1) {
						this.aClass133_12.method7287(local325, Static631.anInt10491, local7 + this.aClass272_14.anInt7410 + 1, arg1);
					}
					local15 = local52;
					arg1 += local325;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method6022(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method6018(arg3, arg1);
			this.method6021(0, arg2 - this.aClass272_14.method6570(arg0), null, arg0, 0, arg4, null, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6018(arg0, arg4);
			this.method6021(0, arg1, null, arg2, 0, arg3, null, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!it;Ljava/util/Random;III[IILjava/lang/String;)I")
	public final int method6025(@OriginalArg(0) int arg0, @OriginalArg(2) Class28[] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg2.setSeed((long) arg0);
		@Pc(21) int local21 = (arg2.nextInt() & 0x1F) + 192;
		this.method6018(local21 << 24 | 0xFFFFFF, (local21 | 0x0) << 24);
		@Pc(41) int local41 = arg6.length();
		@Pc(49) int[] local49 = new int[local41];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local49[local53] = local51;
			if ((arg2.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method6016(null, arg3, arg5, local49, arg4, arg1, arg6);
		return local51;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method6026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method6018(arg1, -16777216);
		@Pc(16) int local16 = arg4.length();
		@Pc(27) int[] local27 = new int[local16];
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			local27[local29] = (int) (Math.sin((double) arg0 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method6016(local27, arg3 - this.aClass272_14.method6570(arg4) / 2, arg2, null, null, null, arg4);
	}
}
