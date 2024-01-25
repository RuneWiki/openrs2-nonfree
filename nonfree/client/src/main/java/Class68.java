import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class68 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!tja;")
	private final Class350 aClass350_13;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!ha;")
	private final Class144 aClass144_16;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!tja;)V")
	protected Class68(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class350 arg1) {
		this.aClass350_13 = arg1;
		this.aClass144_16 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIZI[Lclient!fia;IIIIIIILclient!aa;IILjava/lang/String;)I")
	public final int method9421(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class45[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) String arg15) {
		if (arg15 == null) {
			return 0;
		}
		this.method9427(arg11, arg5);
		if (arg2 == 0) {
			arg2 = this.aClass350_13.anInt9698;
		}
		@Pc(54) int[] local54;
		if (arg9 < this.aClass350_13.anInt9697 + this.aClass350_13.anInt9699 + arg2 && arg2 + arg2 > arg9) {
			local54 = null;
		} else {
			local54 = new int[] { arg0 };
		}
		@Pc(66) int local66 = this.aClass350_13.method8354(Static32.aStringArray50, local54, arg4, arg15);
		if (arg3 == -1) {
			arg3 = arg9 / arg2;
			if (arg3 <= 0) {
				arg3 = 1;
			}
		}
		if (arg3 > 0 && arg3 <= local66) {
			local66 = arg3;
			Static32.aStringArray50[arg3 - 1] = this.aClass350_13.method8359(arg4, arg0, Static32.aStringArray50[arg3 - 1]);
		}
		if (arg13 == 3 && local66 == 1) {
			arg13 = 1;
		}
		@Pc(158) int local158;
		@Pc(187) int local187;
		if (arg13 == 0) {
			local158 = arg6 + this.aClass350_13.anInt9697;
		} else if (arg13 == 1) {
			local158 = this.aClass350_13.anInt9697 + arg6 + (-((local66 + -1) * arg2) + -this.aClass350_13.anInt9697 + arg9 + -this.aClass350_13.anInt9699) / 2;
		} else if (arg13 == 2) {
			local158 = arg9 + arg6 - (local66 - 1) * arg2 - this.aClass350_13.anInt9699;
		} else {
			local187 = (arg9 - (local66 - 1) * arg2 - this.aClass350_13.anInt9697 - this.aClass350_13.anInt9699) / (local66 + 1);
			if (local187 < 0) {
				local187 = 0;
			}
			local158 = this.aClass350_13.anInt9697 + arg6 + local187;
			arg2 += local187;
		}
		for (local187 = 0; local187 < local66; local187++) {
			if (arg10 == 0) {
				this.method9435(-16777216, arg12, arg14, Static32.aStringArray50[local187], arg8, arg1, local158, arg4, arg7);
			} else if (arg10 == 1) {
				this.method9435(-16777216, arg12, arg14, Static32.aStringArray50[local187], (arg0 - this.aClass350_13.method8356(Static32.aStringArray50[local187])) / 2 + arg8, arg1, local158, arg4, arg7);
			} else if (arg10 == 2) {
				this.method9435(-16777216, arg12, arg14, Static32.aStringArray50[local187], arg0 + arg8 - this.aClass350_13.method8356(Static32.aStringArray50[local187]), arg1, local158, arg4, arg7);
			} else if (local187 == local66 - 1) {
				this.method9435(-16777216, arg12, arg14, Static32.aStringArray50[local187], arg8, arg1, local158, arg4, arg7);
			} else {
				this.method9439(Static32.aStringArray50[local187], arg0);
				this.method9435(-16777216, arg12, arg14, Static32.aStringArray50[local187], arg8, arg1, local158, arg4, arg7);
				Static23.anInt325 = 0;
			}
			local158 += arg2;
		}
		return local66;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method9422(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method9427(arg2, arg4);
			this.method9435(-16777216, (Class1) null, 0, arg0, arg3, (int[]) null, arg1, (Class45[]) null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!fia;I[ILjava/lang/String;IIII)V")
	public final void method9423(@OriginalArg(0) Class45[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 != null) {
			this.method9427(0, arg5);
			this.method9435(-16777216, (Class1) null, 0, arg2, arg3, arg1, arg4, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIILjava/lang/String;II)V")
	public final void method9425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method9427(-16777216, arg4);
		@Pc(17) int local17 = arg3.length();
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			local20[local22] = (int) (Math.sin((double) local22 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method9431((Class45[]) null, (int[]) null, arg1, local20, arg2 - this.aClass350_13.method8356(arg3) / 2, arg3, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!fia;IIILjava/util/Random;BLjava/lang/String;I[IIII[III)I")
	public final int method9426(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg5 == null) {
			return 0;
		}
		arg4.setSeed((long) arg2);
		@Pc(21) int local21 = (arg4.nextInt() & 0x1F) + 192;
		this.method9427(local21 << 24 | arg13 & 0xFFFFFF, arg3 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg5.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg4.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(74) int local74 = arg12;
		@Pc(81) int local81 = arg6 + this.aClass350_13.anInt9697;
		@Pc(83) int local83 = -1;
		if (arg9 == 1) {
			local81 += (arg1 - this.aClass350_13.anInt9699 - this.aClass350_13.anInt9697) / 2;
		} else if (arg9 == 2) {
			local81 = arg6 + arg1 - this.aClass350_13.anInt9699;
		}
		if (arg8 == 1) {
			local83 = this.aClass350_13.method8356(arg5) + local46;
			local74 = arg12 + (arg10 - local83) / 2;
		} else if (arg8 == 2) {
			local83 = this.aClass350_13.method8356(arg5) + local46;
			local74 = arg12 + arg10 - local83;
		}
		this.method9431(arg0, arg7, local81, (int[]) null, local74, arg5, local44);
		if (arg11 != null) {
			if (local83 == -1) {
				local83 = this.aClass350_13.method8356(arg5) + local46;
			}
			arg11[2] = local83;
			arg11[1] = local81 - this.aClass350_13.anInt9697;
			arg11[3] = this.aClass350_13.anInt9697 + this.aClass350_13.anInt9699;
			arg11[0] = local74;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method9427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static23.anInt325 = 0;
		Static521.anInt8908 = -1;
		Static489.anInt8464 = arg1;
		Static168.anInt2601 = arg1;
		Static21.anInt288 = 0;
		Static145.anInt2284 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static126.anInt9521 = arg0;
		Static595.anInt9825 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;ILjava/util/Random;III[Lclient!fia;[II)I")
	public final int method9428(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class45[] arg4, @OriginalArg(8) int[] arg5, @OriginalArg(9) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg2.setSeed((long) arg3);
		@Pc(21) int local21 = (arg2.nextInt() & 0x1F) + 192;
		this.method9427((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg0.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg2.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method9431(arg4, arg5, arg1, (int[]) null, arg6, arg0, local44);
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public final void method9429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method9427(arg3, arg0);
			this.method9435(-16777216, (Class1) null, 0, arg4, arg1 - this.aClass350_13.method8356(arg4), (int[]) null, arg2, (Class45[]) null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method9430(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method9427(-16777216, arg1);
		@Pc(21) double local21 = 7.0D - (double) arg3 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg0.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) local35 / 1.5D + (double) arg5) * local21);
		}
		if (60 != 60) {
			this.method9435(-45, (Class1) null, 88, (String) null, -91, (int[]) null, -92, (Class45[]) null, 66);
		}
		this.method9431((Class45[]) null, (int[]) null, arg4, local33, arg2 - this.aClass350_13.method8356(arg0) / 2, arg0, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!fia;[II[IILjava/lang/String;[I)V")
	private void method9431(@OriginalArg(1) Class45[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass350_13.anInt9698;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg5.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static621.method8722(arg5.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(170) int local170;
				@Pc(182) int local182;
				if (local33 == '>' && local13 != -1) {
					@Pc(58) String local58 = arg5.substring(local13 + 1, local22);
					local13 = -1;
					if (local58.equals("lt")) {
						local33 = '<';
					} else if (local58.equals("gt")) {
						local33 = '>';
					} else if (local58.equals("nbsp")) {
						local33 = ' ';
					} else if (local58.equals("shy")) {
						local33 = '\u00ad';
					} else if (local58.equals("times")) {
						local33 = '×';
					} else if (local58.equals("euro")) {
						local33 = '€';
					} else if (local58.equals("copy")) {
						local33 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local170 = 0;
									} else {
										local170 = arg6[local17];
									}
									if (arg3 == null) {
										local182 = 0;
									} else {
										local182 = arg3[local17];
									}
									local17++;
									@Pc(193) int local193 = Static297.method4858(local58.substring(4), -83);
									@Pc(197) Class45 local197 = arg0[local193];
									@Pc(207) int local207 = arg1 == null ? local197.method7504() : arg1[local193];
									local197.method7491(local170 + arg4, -local207 + this.aClass350_13.anInt9698 + local7 + local182, 1, 0, 1);
									local15 = -1;
									arg4 += arg0[local193].method7508();
								} catch (@Pc(236) Exception local236) {
								}
							} else {
								this.method9432(local58);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass350_13.method8353(local33, local15);
					}
					@Pc(262) int local262;
					if (arg6 == null) {
						local262 = 0;
					} else {
						local262 = arg6[local17];
					}
					if (arg3 == null) {
						local170 = 0;
					} else {
						local170 = arg3[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static595.anInt9825 & 0xFF000000) != 0) {
							this.fa(local33, arg4 + local262 + 1, local7 + 1 + local170, Static595.anInt9825, true);
						}
						this.fa(local33, local262 + arg4, local170 + local7, Static168.anInt2601, false);
					} else if (Static23.anInt325 > 0) {
						Static21.anInt288 += Static23.anInt325;
						arg4 += Static21.anInt288 >> 8;
						Static21.anInt288 &= 0xFF;
					}
					local182 = this.aClass350_13.method8350(local33);
					if (Static521.anInt8908 != -1) {
						this.aClass144_16.method6949(Static521.anInt8908, arg4, 24805, local182, local7 + (int) ((double) this.aClass350_13.anInt9698 * 0.7D));
					}
					if (Static145.anInt2284 != -1) {
						this.aClass144_16.method6949(Static145.anInt2284, arg4, 24805, local182, local7 + this.aClass350_13.anInt9698);
					}
					arg4 += local182;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method9432(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static168.anInt2601 = Static168.anInt2601 & 0xFF000000 | Static643.method9006(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static168.anInt2601 = Static168.anInt2601 & 0xFF000000 | Static489.anInt8464 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static168.anInt2601 = Static643.method9006(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static168.anInt2601 = Static489.anInt8464;
			} else if (arg0.startsWith("str=")) {
				Static521.anInt8908 = Static168.anInt2601 & 0xFF000000 | Static643.method9006(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static521.anInt8908 = Static168.anInt2601 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static521.anInt8908 = -1;
			} else if (arg0.startsWith("u=")) {
				Static145.anInt2284 = Static168.anInt2601 & 0xFF000000 | Static643.method9006(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static145.anInt2284 = Static168.anInt2601 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static145.anInt2284 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static595.anInt9825 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static595.anInt9825 = Static168.anInt2601 & 0xFF000000 | Static643.method9006(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static595.anInt9825 = Static168.anInt2601 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static595.anInt9825 = Static126.anInt9521;
			} else if (arg0.equals("br")) {
				this.method9427(Static126.anInt9521, Static489.anInt8464);
			}
		} catch (@Pc(211) Exception local211) {
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method9434(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!aa;ILjava/lang/String;I[II[Lclient!fia;I)V")
	private void method9435(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class45[] arg7, @OriginalArg(8) int arg8) {
		@Pc(5) int local5 = arg6 - this.aClass350_13.anInt9698;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(16) int local16 = arg3.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(28) char local28 = (char) (Static621.method8722(arg3.charAt(local18)) & 0xFF);
			if (local28 == '<') {
				local11 = local18;
			} else {
				if (local28 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg3.substring(local11 + 1, local18);
					local11 = -1;
					if (local54.equals("lt")) {
						local28 = '<';
					} else if (local54.equals("gt")) {
						local28 = '>';
					} else if (local54.equals("nbsp")) {
						local28 = ' ';
					} else if (local54.equals("shy")) {
						local28 = '\u00ad';
					} else if (local54.equals("times")) {
						local28 = '×';
					} else if (local54.equals("euro")) {
						local28 = '€';
					} else if (local54.equals("copy")) {
						local28 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(147) int local147 = Static297.method4858(local54.substring(4), arg0 ^ 0xFF000061);
									@Pc(151) Class45 local151 = arg7[local147];
									@Pc(161) int local161 = arg5 == null ? local151.method7504() : arg5[local147];
									if ((Static168.anInt2601 & 0xFF000000) == -16777216) {
										local151.method7491(arg4, this.aClass350_13.anInt9698 + local5 - local161, 1, 0, 1);
									} else {
										local151.method7491(arg4, local5 + this.aClass350_13.anInt9698 - local161, 0, Static168.anInt2601 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg4 += arg7[local147].method7508();
									local13 = -1;
								} catch (@Pc(213) Exception local213) {
								}
							} else {
								this.method9432(local54);
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg4 += this.aClass350_13.method8353(local28, local13);
					}
					if (local28 == ' ') {
						if (Static23.anInt325 > 0) {
							Static21.anInt288 += Static23.anInt325;
							arg4 += Static21.anInt288 >> 8;
							Static21.anInt288 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static595.anInt9825 & 0xFF000000) != 0) {
							this.fa(local28, arg4 + 1, local5 + 1, Static595.anInt9825, true);
						}
						this.fa(local28, arg4, local5, Static168.anInt2601, false);
					} else {
						if ((Static595.anInt9825 & 0xFF000000) != 0) {
							this.method9434(local28, arg4 + 1, local5 - -1, Static595.anInt9825, true, arg1, arg2, arg8);
						}
						this.method9434(local28, arg4, local5, Static168.anInt2601, false, arg1, arg2, arg8);
					}
					@Pc(325) int local325 = this.aClass350_13.method8350(local28);
					if (Static521.anInt8908 != -1) {
						this.aClass144_16.method6949(Static521.anInt8908, arg4, 24805, local325, local5 + (int) ((double) this.aClass350_13.anInt9698 * 0.7D));
					}
					if (Static145.anInt2284 != -1) {
						this.aClass144_16.method6949(Static145.anInt2284, arg4, arg0 ^ 0xFF0060E5, local325, local5 + this.aClass350_13.anInt9698 + 1);
					}
					local13 = local28;
					arg4 += local325;
				}
			}
		}
		if (arg0 != -16777216) {
			Static92.method9440();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILjava/lang/String;Lclient!aa;II[III[Lclient!fia;I)I")
	public final int method9436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class45[] arg13, @OriginalArg(15) int arg14) {
		return this.method9421(arg4, arg10, arg11, 0, arg13, arg2, arg3, arg9, arg5, arg1, arg14, arg8, arg7, arg12, arg0, arg6);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZIILjava/lang/String;)V")
	public final void method9438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method9427(-16777216, arg0);
		@Pc(17) int local17 = arg4.length();
		@Pc(20) int[] local20 = new int[local17];
		@Pc(23) int[] local23 = new int[local17];
		for (@Pc(25) int local25 = 0; local25 < local17; local25++) {
			local20[local25] = (int) (Math.sin((double) local25 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local23[local25] = (int) (Math.sin((double) local25 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method9431((Class45[]) null, (int[]) null, arg3, local23, arg2 - this.aClass350_13.method8356(arg4) / 2, arg4, local20);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method9439(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; arg0.length() > local9; local9++) {
			@Pc(14) char local14 = arg0.charAt(local9);
			if (local14 == '<') {
				local7 = true;
			} else if (local14 == '>') {
				local7 = false;
			} else if (!local7 && local14 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static23.anInt325 = (arg1 - this.aClass350_13.method8356(arg0) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method9441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method9427(arg0, arg1);
			this.method9435(-16777216, (Class1) null, 0, arg2, arg4 - this.aClass350_13.method8356(arg2) / 2, (int[]) null, arg3, (Class45[]) null, 0);
		}
	}
}
