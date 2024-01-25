import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class69 {

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!ha;")
	private final Class13 aClass13_19;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!eia;")
	private final Class88 aClass88_22;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!eia;)V")
	protected Class69(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class88 arg1) {
		this.aClass13_19 = arg0;
		this.aClass88_22 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method8847(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			this.method8865(arg0, arg2);
			this.method8854((int[]) null, arg3 - this.aClass88_22.method2502(arg1), arg1, 0, (Class33[]) null, 0, (Class1) null, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8849(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;[Lclient!vr;ILjava/util/Random;III[I)I")
	public final int method8850(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class33[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int[] arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg4.setSeed((long) arg0);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method8865(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(45) int local45 = arg1.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method8863(arg1, arg5, arg6, arg3, local48, arg2, (int[]) null);
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method8851(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static189.anInt5580 = Static189.anInt5580 & 0xFF000000 | Static141.method2606(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static189.anInt5580 = Static189.anInt5580 & 0xFF000000 | Static337.anInt5568 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static189.anInt5580 = Static141.method2606(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static189.anInt5580 = Static337.anInt5568;
			} else if (arg0.startsWith("str=")) {
				Static249.anInt4508 = Static189.anInt5580 & 0xFF000000 | Static141.method2606(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static249.anInt4508 = Static189.anInt5580 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static249.anInt4508 = -1;
			} else if (arg0.startsWith("u=")) {
				Static389.anInt6126 = Static189.anInt5580 & 0xFF000000 | Static141.method2606(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static389.anInt6126 = Static189.anInt5580 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static389.anInt6126 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static567.anInt5908 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static567.anInt5908 = Static189.anInt5580 & 0xFF000000 | Static141.method2606(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static567.anInt5908 = Static189.anInt5580 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static567.anInt5908 = Static160.anInt3143;
			} else if (arg0.equals("br")) {
				this.method8865(Static337.anInt5568, Static160.anInt3143);
			}
		} catch (@Pc(183) Exception local183) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method8852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method8865(arg1, -16777216);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local19[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local22[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method8863(arg3, arg0 - this.aClass88_22.method2502(arg3) / 2, (int[]) null, arg2, local19, (Class33[]) null, local22);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!vr;IIIIIIIIILclient!aa;[II)I")
	public final int method8853(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1 arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14) {
		return this.method8861(arg14, arg10, 0, arg9, arg7, arg4, arg11, arg6, arg0, arg12, arg5, arg3, arg1, arg2, arg13, arg8);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIILjava/lang/String;I[Lclient!vr;ILclient!aa;I)V")
	private void method8854(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg7 - this.aClass88_22.anInt2723;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(23) int local23 = arg2.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static265.method4367(arg2.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local18 = local25;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(58) String local58 = arg2.substring(local18 + 1, local25);
					local18 = -1;
					if (local58.equals("lt")) {
						local36 = '<';
					} else if (local58.equals("gt")) {
						local36 = '>';
					} else if (local58.equals("nbsp")) {
						local36 = ' ';
					} else if (local58.equals("shy")) {
						local36 = '\u00ad';
					} else if (local58.equals("times")) {
						local36 = '×';
					} else if (local58.equals("euro")) {
						local36 = '€';
					} else if (local58.equals("copy")) {
						local36 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									@Pc(130) int local130 = Static63.method1308(local58.substring(4));
									@Pc(134) Class33 local134 = arg4[local130];
									@Pc(143) int local143 = arg0 == null ? local134.method7658() : arg0[local130];
									if ((Static189.anInt5580 & 0xFF000000) == -16777216) {
										local134.method7644(arg1, this.aClass88_22.anInt2723 + local16 - local143, 1, 0, 1);
									} else {
										local134.method7644(arg1, this.aClass88_22.anInt2723 + local16 - local143, 0, Static189.anInt5580 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local20 = -1;
									arg1 += arg4[local130].method7645();
								} catch (@Pc(195) Exception local195) {
								}
							} else {
								this.method8851(local58);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg1 += this.aClass88_22.method2504(local36, local20);
					}
					if (local36 == ' ') {
						if (Static572.anInt9225 > 0) {
							Static106.anInt2203 += Static572.anInt9225;
							arg1 += Static106.anInt2203 >> 8;
							Static106.anInt2203 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static567.anInt5908 & 0xFF000000) != 0) {
							this.fa(local36, arg1 + 1, local16 + 1, Static567.anInt5908, true);
						}
						this.fa(local36, arg1, local16, Static189.anInt5580, false);
					} else {
						if ((Static567.anInt5908 & 0xFF000000) != 0) {
							this.method8849(local36, arg1 + 1, local16 + 1, Static567.anInt5908, true, arg6, arg5, arg3);
						}
						this.method8849(local36, arg1, local16, Static189.anInt5580, false, arg6, arg5, arg3);
					}
					@Pc(311) int local311 = this.aClass88_22.method2506(local36);
					if (Static249.anInt4508 != -1) {
						this.aClass13_19.method8493((int) ((double) this.aClass88_22.anInt2723 * 0.7D) + local16, arg1, Static249.anInt4508, local311);
					}
					if (Static389.anInt6126 != -1) {
						this.aClass13_19.method8493(local16 + this.aClass88_22.anInt2723 + 1, arg1, Static389.anInt6126, local311);
					}
					local20 = local36;
					arg1 += local311;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method8855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method8865(arg3, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method8863(arg2, arg4 - this.aClass88_22.method2502(arg2) / 2, (int[]) null, arg1, (int[]) null, (Class33[]) null, local19);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method8856(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg1.length() > local11; local11++) {
			@Pc(17) char local17 = arg1.charAt(local11);
			if (local17 == '<') {
				local9 = true;
			} else if (local17 == '>') {
				local9 = false;
			} else if (!local9 && local17 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static572.anInt9225 = (arg0 - this.aClass88_22.method2502(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBIILjava/lang/String;)V")
	public final void method8857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method8865(arg3, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg2 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(33) int local33 = arg5.length();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = (int) (local20 * Math.sin((double) arg1 + (double) local38 / 1.5D));
		}
		this.method8863(arg5, arg0 - this.aClass88_22.method2502(arg5) / 2, (int[]) null, arg4, (int[]) null, (Class33[]) null, local36);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBLjava/lang/String;I)V")
	public final void method8858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method8865(arg2, arg1);
			this.method8854((int[]) null, arg0 - this.aClass88_22.method2502(arg3) / 2, arg3, 0, (Class33[]) null, 0, (Class1) null, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[I[Lclient!vr;ILjava/lang/String;I)V")
	public final void method8859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class33[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 != null) {
			this.method8865(arg0, 0);
			this.method8854(arg2, arg4, arg5, 0, arg3, 0, (Class1) null, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII[Lclient!vr;III[ILjava/util/Random;Ljava/lang/String;III[II)I")
	public final int method8860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Random arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg8 == null) {
			return 0;
		}
		arg7.setSeed((long) arg9);
		@Pc(28) int local28 = (arg7.nextInt() & 0x1F) + 192;
		this.method8865(arg10 & 0xFFFFFF | local28 << 24, arg1 & 0xFFFFFF | local28 << 24);
		@Pc(48) int local48 = arg8.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg7.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(76) int local76 = arg3;
		@Pc(83) int local83 = arg5 + this.aClass88_22.anInt2733;
		if (arg13 == 1) {
			local83 += (arg4 - this.aClass88_22.anInt2733 - this.aClass88_22.anInt2731) / 2;
		} else if (arg13 == 2) {
			local83 = arg5 + arg4 - this.aClass88_22.anInt2731;
		}
		@Pc(119) int local119 = -1;
		if (arg11 == 1) {
			local119 = local53 + this.aClass88_22.method2502(arg8);
			local76 = arg3 + (arg0 - local119) / 2;
		} else if (arg11 == 2) {
			local119 = this.aClass88_22.method2502(arg8) + local53;
			local76 = arg3 + arg0 - local119;
		}
		this.method8863(arg8, local76, arg12, local83, local51, arg2, (int[]) null);
		if (arg6 != null) {
			if (local119 == -1) {
				local119 = local53 + this.aClass88_22.method2502(arg8);
			}
			arg6[2] = local119;
			arg6[3] = this.aClass88_22.anInt2731 + this.aClass88_22.anInt2733;
			arg6[1] = local83 - this.aClass88_22.anInt2733;
			arg6[0] = local76;
		}
		return local53;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIILjava/lang/String;Lclient!aa;I[Lclient!vr;III[II)I")
	public final int method8861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(9) Class1 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class33[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) int arg15) {
		if (arg8 == null) {
			return 0;
		}
		this.method8865(arg10, arg6);
		if (arg3 == 0) {
			arg3 = this.aClass88_22.anInt2723;
		}
		@Pc(48) int[] local48;
		if (arg15 < arg3 + this.aClass88_22.anInt2731 + this.aClass88_22.anInt2733 && arg15 < arg3 + arg3) {
			local48 = null;
		} else {
			local48 = new int[] { arg4 };
		}
		if (arg2 == -1) {
			arg2 = arg15 / arg3;
			if (arg2 <= 0) {
				arg2 = 1;
			}
		}
		@Pc(72) int local72 = this.aClass88_22.method2512(arg11, Static385.aStringArray18, local48, arg8);
		if (arg2 > 0 && local72 >= arg2) {
			Static385.aStringArray18[arg2 - 1] = this.aClass88_22.method2505(arg4, Static385.aStringArray18[arg2 - 1], arg11);
			local72 = arg2;
		}
		if (arg1 == 3 && local72 == 1) {
			arg1 = 1;
		}
		@Pc(120) int local120;
		@Pc(199) int local199;
		if (arg1 == 0) {
			local120 = this.aClass88_22.anInt2733 + arg0;
		} else if (arg1 == 1) {
			local120 = (arg15 - arg3 * (local72 - 1) - this.aClass88_22.anInt2731 - this.aClass88_22.anInt2733) / 2 + arg0 + this.aClass88_22.anInt2733;
		} else if (arg1 == 2) {
			local120 = arg15 + arg0 - arg3 * (local72 - 1) - this.aClass88_22.anInt2731;
		} else {
			local199 = (arg15 - arg3 * (local72 - 1) - this.aClass88_22.anInt2731 - this.aClass88_22.anInt2733) / (local72 + 1);
			if (local199 < 0) {
				local199 = 0;
			}
			arg3 += local199;
			local120 = arg0 + this.aClass88_22.anInt2733 + local199;
		}
		for (local199 = 0; local199 < local72; local199++) {
			if (arg7 == 0) {
				this.method8854(arg14, arg5, Static385.aStringArray18[local199], arg13, arg11, arg12, arg9, local120);
			} else if (arg7 == 1) {
				this.method8854(arg14, arg5 + (arg4 - this.aClass88_22.method2502(Static385.aStringArray18[local199])) / 2, Static385.aStringArray18[local199], arg13, arg11, arg12, arg9, local120);
			} else if (arg7 == 2) {
				this.method8854(arg14, arg5 + arg4 - this.aClass88_22.method2502(Static385.aStringArray18[local199]), Static385.aStringArray18[local199], arg13, arg11, arg12, arg9, local120);
			} else if (local72 - 1 == local199) {
				this.method8854(arg14, arg5, Static385.aStringArray18[local199], arg13, arg11, arg12, arg9, local120);
			} else {
				this.method8856(arg4, Static385.aStringArray18[local199]);
				this.method8854(arg14, arg5, Static385.aStringArray18[local199], arg13, arg11, arg12, arg9, local120);
				Static572.anInt9225 = 0;
			}
			local120 += arg3;
		}
		return local72;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILjava/lang/String;II)V")
	public final void method8862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method8865(arg3, arg1);
			this.method8854((int[]) null, arg4, arg2, 0, (Class33[]) null, 0, (Class1) null, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[II[I[Lclient!vr;[II)V")
	private void method8863(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class33[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg3 - this.aClass88_22.anInt2723;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local20; local35++) {
			@Pc(48) char local48 = (char) (Static265.method4367(arg0.charAt(local35)) & 0xFF);
			if (local48 == '<') {
				local13 = local35;
			} else {
				@Pc(133) int local133;
				@Pc(143) int local143;
				if (local48 == '>' && local13 != -1) {
					@Pc(71) String local71 = arg0.substring(local13 + 1, local35);
					local13 = -1;
					if (local71.equals("lt")) {
						local48 = '<';
					} else if (local71.equals("gt")) {
						local48 = '>';
					} else if (local71.equals("nbsp")) {
						local48 = ' ';
					} else if (local71.equals("shy")) {
						local48 = '\u00ad';
					} else if (local71.equals("times")) {
						local48 = '×';
					} else if (local71.equals("euro")) {
						local48 = '€';
					} else if (local71.equals("copy")) {
						local48 = '©';
					} else {
						if (!local71.equals("reg")) {
							if (local71.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local133 = 0;
									} else {
										local133 = arg4[local17];
									}
									if (arg6 == null) {
										local143 = 0;
									} else {
										local143 = arg6[local17];
									}
									local17++;
									@Pc(156) int local156 = Static63.method1308(local71.substring(4));
									@Pc(160) Class33 local160 = arg5[local156];
									@Pc(169) int local169 = arg2 == null ? local160.method7658() : arg2[local156];
									local160.method7644(local133 + arg1, local143 + -local169 + this.aClass88_22.anInt2723 + local7, 1, 0, 1);
									arg1 += arg5[local156].method7645();
									local15 = -1;
								} catch (@Pc(198) Exception local198) {
								}
							} else {
								this.method8851(local71);
							}
							continue;
						}
						local48 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass88_22.method2504(local48, local15);
					}
					@Pc(236) int local236;
					if (arg4 == null) {
						local236 = 0;
					} else {
						local236 = arg4[local17];
					}
					if (arg6 == null) {
						local133 = 0;
					} else {
						local133 = arg6[local17];
					}
					local17++;
					if (local48 != ' ') {
						if ((Static567.anInt5908 & 0xFF000000) != 0) {
							this.fa(local48, arg1 + local236 + 1, local133 + 1 + local7, Static567.anInt5908, true);
						}
						this.fa(local48, local236 + arg1, local7 - -local133, Static189.anInt5580, false);
					} else if (Static572.anInt9225 > 0) {
						Static106.anInt2203 += Static572.anInt9225;
						arg1 += Static106.anInt2203 >> 8;
						Static106.anInt2203 &= 0xFF;
					}
					local143 = this.aClass88_22.method2506(local48);
					if (Static249.anInt4508 != -1) {
						this.aClass13_19.method8493(local7 + (int) ((double) this.aClass88_22.anInt2723 * 0.7D), arg1, Static249.anInt4508, local143);
					}
					if (Static389.anInt6126 != -1) {
						this.aClass13_19.method8493(local7 + this.aClass88_22.anInt2723, arg1, Static389.anInt6126, local143);
					}
					arg1 += local143;
					local15 = local48;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)V")
	private void method8865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static106.anInt2203 = 0;
		Static389.anInt6126 = -1;
		Static249.anInt4508 = -1;
		Static572.anInt9225 = 0;
		Static337.anInt5568 = arg0;
		Static189.anInt5580 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static160.anInt3143 = arg1;
		Static567.anInt5908 = arg1;
	}
}
