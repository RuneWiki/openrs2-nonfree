import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class37 {

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!r;")
	private final Class162 aClass162_18;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!fo;")
	private final Class112 aClass112_13;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!fo;)V")
	protected Class37(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class112 arg1) {
		this.aClass162_18 = arg0;
		this.aClass112_13 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < arg1.length(); local15++) {
			@Pc(21) char local21 = arg1.charAt(local15);
			if (local21 == '<') {
				local13 = true;
			} else if (local21 == '>') {
				local13 = false;
			} else if (!local13 && local21 == ' ') {
				local11++;
			}
		}
		if (local11 > 0) {
			Static403.anInt9325 = (arg0 - this.aClass112_13.method2078(arg1) << 8) / local11;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method7709(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7726(arg2, arg0);
			this.method7713(arg3 - this.aClass112_13.method2078(arg1), null, null, null, 0, 0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!f;[ILjava/lang/String;IIIIIIIIIILclient!ua;II)I")
	public final int method7710(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class84 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method7716(arg5, arg8, arg9, arg0, arg3, arg14, arg2, arg1, arg11, 0, arg12, arg6, arg7, arg4, arg13, arg10);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;II[III[Lclient!f;Ljava/util/Random;I[IIII)I")
	public final int method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class38[] arg7, @OriginalArg(9) Random arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg8.setSeed((long) arg13);
		@Pc(20) int local20 = (arg8.nextInt() & 0x1F) + 192;
		this.method7726(arg9 & 0xFFFFFF | local20 << 24, arg4 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg2.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg8.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg1;
		@Pc(78) int local78 = arg3 + this.aClass112_13.anInt2421;
		if (arg12 == 1) {
			local78 += (arg6 - this.aClass112_13.anInt2430 - this.aClass112_13.anInt2421) / 2;
		} else if (arg12 == 2) {
			local78 = arg3 + arg6 - this.aClass112_13.anInt2430;
		}
		@Pc(115) int local115 = -1;
		if (arg0 == 1) {
			local115 = local45 + this.aClass112_13.method2078(arg2);
			local72 = arg1 + (arg11 - local115) / 2;
		} else if (arg0 == 2) {
			local115 = local45 + this.aClass112_13.method2078(arg2);
			local72 = arg1 + arg11 - local115;
		}
		this.method7717(null, arg7, local43, arg5, arg2, local78, local72);
		if (arg10 != null) {
			if (local115 == -1) {
				local115 = local45 + this.aClass112_13.method2078(arg2);
			}
			arg10[1] = local78 - this.aClass112_13.anInt2421;
			arg10[0] = local72;
			arg10[3] = this.aClass112_13.anInt2421 + this.aClass112_13.anInt2430;
			arg10[2] = local115;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;[ILjava/util/Random;IIIIII)I")
	public final int method7712(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Random arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg3.setSeed((long) arg5);
		@Pc(21) int local21 = (arg3.nextInt() & 0x1F) + 192;
		this.method7726((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg1.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg3.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method7717(null, arg0, local44, arg2, arg1, arg6, arg4);
		return local46;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ua;[Lclient!f;[IIILjava/lang/String;I)V")
	private void method7713(@OriginalArg(1) int arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(3) Class38[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg7 - this.aClass112_13.anInt2426;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = -1;
		@Pc(25) int local25 = arg6.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static83.method1256(arg6.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local20 = local27;
			} else {
				if (local38 == '>' && local20 != -1) {
					@Pc(58) String local58 = arg6.substring(local20 + 1, local27);
					local20 = -1;
					if (local58.equals("lt")) {
						local38 = '<';
					} else if (local58.equals("gt")) {
						local38 = '>';
					} else if (local58.equals("nbsp")) {
						local38 = ' ';
					} else if (local58.equals("shy")) {
						local38 = '\u00ad';
					} else if (local58.equals("times")) {
						local38 = '×';
					} else if (local58.equals("euro")) {
						local38 = '€';
					} else if (local58.equals("copy")) {
						local38 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									@Pc(124) int local124 = Static559.method7310(local58.substring(4));
									@Pc(128) Class38 local128 = arg2[local124];
									@Pc(137) int local137 = arg3 == null ? local128.ca() : arg3[local124];
									if ((Static562.anInt9208 & -16777216) == -16777216) {
										local128.V(arg0, local14 + this.aClass112_13.anInt2426 - local137, 1, 0, 1);
									} else {
										local128.V(arg0, this.aClass112_13.anInt2426 + local14 - local137, 0, Static562.anInt9208 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg0 += arg2[local124].A();
									local22 = -1;
								} catch (@Pc(187) Exception local187) {
								}
							} else {
								this.method7725(local58);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local20 == -1) {
					if (local22 != -1) {
						arg0 += this.aClass112_13.method2080(local38, local22);
					}
					if (local38 == ' ') {
						if (Static403.anInt9325 > 0) {
							Static434.anInt6975 += Static403.anInt9325;
							arg0 += Static434.anInt6975 >> 8;
							Static434.anInt6975 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static553.anInt9053 & 0xFF000000) != 0) {
							this.OA(local38, arg0 + 1, local14 + 1, Static553.anInt9053, true);
						}
						this.OA(local38, arg0, local14, Static562.anInt9208, false);
					} else {
						if ((Static553.anInt9053 & 0xFF000000) != 0) {
							this.method7722(local38, arg0 + 1, local14 + 1, Static553.anInt9053, true, arg1, arg5, arg4);
						}
						this.method7722(local38, arg0, local14, Static562.anInt9208, false, arg1, arg5, arg4);
					}
					@Pc(307) int local307 = this.aClass112_13.method2081(local38);
					if (Static531.anInt8749 != -1) {
						this.aClass162_18.method6873(Static531.anInt8749, local14 + (int) ((double) this.aClass112_13.anInt2426 * 0.7D), arg0, local307);
					}
					if (Static51.anInt914 != -1) {
						this.aClass162_18.method6873(Static51.anInt914, local14 + this.aClass112_13.anInt2426 + 1, arg0, local307);
					}
					local22 = local38;
					arg0 += local307;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII[ILjava/lang/String;[Lclient!f;)V")
	public final void method7714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) String arg4, @OriginalArg(7) Class38[] arg5) {
		if (arg4 != null) {
			this.method7726(0, arg2);
			this.method7713(arg0, null, arg5, arg3, 0, 0, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public final void method7715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7726(-16777216, arg3);
		@Pc(20) double local20 = 7.0D - (double) arg4 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(33) int local33 = arg5.length();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = (int) (local20 * Math.sin((double) local38 / 1.5D + (double) arg1));
		}
		this.method7717(local36, null, null, null, arg5, arg2, arg0 - this.aClass112_13.method2078(arg5) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lclient!f;IILjava/lang/String;[IIILclient!ua;IIIIII)I")
	public final int method7716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class38[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class84 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(16) int arg15) {
		if (arg6 == null) {
			return 0;
		}
		this.method7726(arg15, arg11);
		if (arg14 == 0) {
			arg14 = this.aClass112_13.anInt2426;
		}
		@Pc(44) int[] local44;
		if (this.aClass112_13.anInt2421 + this.aClass112_13.anInt2430 + arg14 > arg0 && arg14 + arg14 > arg0) {
			local44 = null;
		} else {
			local44 = new int[] { arg4 };
		}
		if (arg9 == -1) {
			arg9 = arg0 / arg14;
			if (arg9 <= 0) {
				arg9 = 1;
			}
		}
		@Pc(74) int local74 = this.aClass112_13.method2082(arg3, Static258.aStringArray24, local44, arg6);
		if (arg9 > 0 && local74 >= arg9) {
			local74 = arg9;
			Static258.aStringArray24[arg9 - 1] = this.aClass112_13.method2076(arg4, arg3, Static258.aStringArray24[arg9 - 1]);
		}
		if (arg8 == 3 && local74 == 1) {
			arg8 = 1;
		}
		@Pc(144) int local144;
		@Pc(189) int local189;
		if (arg8 == 0) {
			local144 = arg12 + this.aClass112_13.anInt2421;
		} else if (arg8 == 1) {
			local144 = (arg0 - this.aClass112_13.anInt2430 - this.aClass112_13.anInt2421 - (local74 + -1) * arg14) / 2 + arg12 + this.aClass112_13.anInt2421;
		} else if (arg8 == 2) {
			local144 = arg12 + arg0 - (local74 - 1) * arg14 - this.aClass112_13.anInt2430;
		} else {
			local189 = (arg0 - (local74 - 1) * arg14 - this.aClass112_13.anInt2430 - this.aClass112_13.anInt2421) / (local74 + 1);
			if (local189 < 0) {
				local189 = 0;
			}
			arg14 += local189;
			local144 = this.aClass112_13.anInt2421 + arg12 + local189;
		}
		for (local189 = 0; local189 < local74; local189++) {
			if (arg1 == 0) {
				this.method7713(arg13, arg10, arg3, arg7, arg5, arg2, Static258.aStringArray24[local189], local144);
			} else if (arg1 == 1) {
				this.method7713(arg13 + (arg4 - this.aClass112_13.method2078(Static258.aStringArray24[local189])) / 2, arg10, arg3, arg7, arg5, arg2, Static258.aStringArray24[local189], local144);
			} else if (arg1 == 2) {
				this.method7713(arg13 + arg4 - this.aClass112_13.method2078(Static258.aStringArray24[local189]), arg10, arg3, arg7, arg5, arg2, Static258.aStringArray24[local189], local144);
			} else if (local189 == local74 - 1) {
				this.method7713(arg13, arg10, arg3, arg7, arg5, arg2, Static258.aStringArray24[local189], local144);
			} else {
				this.method7708(arg4, Static258.aStringArray24[local189]);
				this.method7713(arg13, arg10, arg3, arg7, arg5, arg2, Static258.aStringArray24[local189], local144);
				Static403.anInt9325 = 0;
			}
			local144 += arg14;
		}
		return local74;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([I[Lclient!f;[I[ILjava/lang/String;III)V")
	private void method7717(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class38[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg5 - this.aClass112_13.anInt2426;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static83.method1256(arg4.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(109) int local109;
				@Pc(121) int local121;
				if (local33 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg4.substring(local13 + 1, local22);
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
										local109 = 0;
									} else {
										local109 = arg2[local17];
									}
									if (arg0 == null) {
										local121 = 0;
									} else {
										local121 = arg0[local17];
									}
									local17++;
									@Pc(132) int local132 = Static559.method7310(local55.substring(4));
									@Pc(136) Class38 local136 = arg1[local132];
									@Pc(145) int local145 = arg3 == null ? local136.ca() : arg3[local132];
									local136.V(arg6 + local109, this.aClass112_13.anInt2426 + (local7 - local145 - -local121), 1, 0, 1);
									local15 = -1;
									arg6 += arg1[local132].A();
								} catch (@Pc(174) Exception local174) {
								}
							} else {
								this.method7725(local55);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass112_13.method2080(local33, local15);
					}
					@Pc(221) int local221;
					if (arg2 == null) {
						local221 = 0;
					} else {
						local221 = arg2[local17];
					}
					if (arg0 == null) {
						local109 = 0;
					} else {
						local109 = arg0[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static553.anInt9053 & 0xFF000000) != 0) {
							this.OA(local33, arg6 + local221 + 1, local7 + 1 - -local109, Static553.anInt9053, true);
						}
						this.OA(local33, arg6 + local221, local7 + local109, Static562.anInt9208, false);
					} else if (Static403.anInt9325 > 0) {
						Static434.anInt6975 += Static403.anInt9325;
						arg6 += Static434.anInt6975 >> 8;
						Static434.anInt6975 &= 0xFF;
					}
					local121 = this.aClass112_13.method2081(local33);
					if (Static531.anInt8749 != -1) {
						this.aClass162_18.method6873(Static531.anInt8749, (int) ((double) this.aClass112_13.anInt2426 * 0.7D) + local7, arg6, local121);
					}
					if (Static51.anInt914 != -1) {
						this.aClass162_18.method6873(Static51.anInt914, this.aClass112_13.anInt2426 + local7, arg6, local121);
					}
					local15 = local33;
					arg6 += local121;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method7718(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7726(-16777216, arg0);
		@Pc(20) int local20 = arg1.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7717(local26, null, local23, null, arg1, arg2, arg3 - this.aClass112_13.method2078(arg1) / 2);
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBIIIILjava/lang/String;)V")
	public final void method7721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method7726(-16777216, arg1);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) arg0 / 5.0D + (double) local21 / 2.0D) * 5.0D);
		}
		this.method7717(local19, null, null, null, arg4, arg2, arg3 - this.aClass112_13.method2078(arg4) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method7722(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method7723(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7726(arg4, arg2);
			this.method7713(arg0, null, null, null, 0, 0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIILjava/lang/String;II)V")
	public final void method7724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7726(arg1, arg0);
			this.method7713(arg4 - this.aClass112_13.method2078(arg2) / 2, null, null, null, 0, 0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method7725(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static562.anInt9208 = Static562.anInt9208 & 0xFF000000 | Static574.method7451(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static562.anInt9208 = Static562.anInt9208 & 0xFF000000 | Static28.anInt475 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static562.anInt9208 = Static574.method7451(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static562.anInt9208 = Static28.anInt475;
			} else if (arg0.startsWith("str=")) {
				Static531.anInt8749 = Static562.anInt9208 & 0xFF000000 | Static574.method7451(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static531.anInt8749 = Static562.anInt9208 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static531.anInt8749 = -1;
			} else if (arg0.startsWith("u=")) {
				Static51.anInt914 = Static562.anInt9208 & 0xFF000000 | Static574.method7451(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static51.anInt914 = Static562.anInt9208 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static51.anInt914 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static553.anInt9053 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static553.anInt9053 = Static562.anInt9208 & 0xFF000000 | Static574.method7451(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static553.anInt9053 = Static562.anInt9208 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static553.anInt9053 = Static256.anInt4267;
			} else if (arg0.equals("br")) {
				this.method7726(Static256.anInt4267, Static28.anInt475);
				return;
			}
		} catch (@Pc(177) Exception local177) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V")
	private void method7726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static28.anInt475 = arg1;
		Static562.anInt9208 = arg1;
		Static403.anInt9325 = 0;
		Static51.anInt914 = -1;
		Static434.anInt6975 = 0;
		Static531.anInt8749 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static256.anInt4267 = arg0;
		Static553.anInt9053 = arg0;
	}
}
