import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class116 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!dq;")
	private final Class58 aClass58_13;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!ya;")
	private final Class49 aClass49_11;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ya;Lclient!dq;)V")
	protected Class116(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class58 arg1) {
		this.aClass58_13 = arg1;
		this.aClass49_11 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I[Lclient!l;Ljava/lang/String;IBI)V")
	public final void method4807(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class17[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method4823(0, arg5);
			this.method4826(0, arg2, 0, null, arg3, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method4823(-16777216, arg2);
		@Pc(22) int local22 = arg3.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) arg4 / 5.0D + (double) local27 / 2.0D) * 5.0D);
		}
		this.method4819(arg0, local25, arg3, null, null, null, arg1 - this.aClass58_13.method1340(arg3) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	protected abstract void method4809(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lclient!l;Ljava/util/Random;ILjava/lang/String;[IIII)I")
	public final int method4810(@OriginalArg(0) int arg0, @OriginalArg(2) Class17[] arg1, @OriginalArg(3) Random arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg2.setSeed((long) arg5);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method4823((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4819(arg6, null, arg3, local43, arg4, arg1, arg0);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[ILjava/lang/String;I[Lclient!l;ILjava/util/Random;IIIIII)I")
	public final int method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class17[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Random arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return 0;
		}
		arg8.setSeed((long) arg0);
		@Pc(20) int local20 = (arg8.nextInt() & 0x1F) + 192;
		this.method4823(local20 << 24 | arg12 & 0xFFFFFF, arg13 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg4.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg8.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg11;
		@Pc(78) int local78 = this.aClass58_13.anInt1595 + arg2;
		if (arg10 == 1) {
			local78 += (arg9 - this.aClass58_13.anInt1587 - this.aClass58_13.anInt1595) / 2;
		} else if (arg10 == 2) {
			local78 = arg2 + arg9 - this.aClass58_13.anInt1587;
		}
		@Pc(114) int local114 = -1;
		if (arg5 == 1) {
			local114 = local45 + this.aClass58_13.method1340(arg4);
			local72 = arg11 + (arg7 - local114) / 2;
		} else if (arg5 == 2) {
			local114 = local45 + this.aClass58_13.method1340(arg4);
			local72 = arg11 + arg7 - local114;
		}
		this.method4819(local78, null, arg4, local43, arg1, arg6, local72);
		if (arg3 != null) {
			if (local114 == -1) {
				local114 = local45 + this.aClass58_13.method1340(arg4);
			}
			arg3[2] = local114;
			arg3[3] = this.aClass58_13.anInt1595 + this.aClass58_13.anInt1587;
			arg3[1] = local78 - this.aClass58_13.anInt1595;
			arg3[0] = local72;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBILjava/lang/String;I)V")
	public final void method4812(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		if (arg2 != null) {
			this.method4823(-1, arg3);
			this.method4826(0, null, 0, null, arg2, arg0, null, arg1 - this.aClass58_13.method1340(arg2));
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ma;IIIILjava/lang/String;IIIII[Lclient!l;I[II)I")
	public final int method4813(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class17[] arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int[] arg12) {
		return this.method4822(arg12, arg0, arg8, 1, 0, 0, arg3, arg9, arg1, arg7, arg10, arg6, arg5, arg2, arg11, arg4);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4814(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4823(arg2, arg4);
			this.method4826(0, null, 0, null, arg1, arg3, null, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method4815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method4823(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(25) int[] local25 = new int[local16];
		@Pc(28) int[] local28 = new int[local16];
		for (@Pc(30) int local30 = 0; local30 < local16; local30++) {
			local25[local30] = (int) (Math.sin((double) arg1 / 5.0D + (double) local30 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method4819(arg4, local28, arg2, local25, null, null, arg3 - this.aClass58_13.method1340(arg2) / 2);
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[ILjava/lang/String;I[I[I[Lclient!l;I)V")
	private void method4819(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class17[] arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - this.aClass58_13.anInt1585;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg2.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static129.method2210(arg2.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(106) int local106;
				@Pc(116) int local116;
				if (local33 == '>' && local13 != -1) {
					@Pc(54) String local54 = arg2.substring(local13 + 1, local22);
					local13 = -1;
					if (local54.equals("lt")) {
						local33 = '<';
					} else if (local54.equals("gt")) {
						local33 = '>';
					} else if (local54.equals("nbsp")) {
						local33 = ' ';
					} else if (local54.equals("shy")) {
						local33 = '\u00ad';
					} else if (local54.equals("times")) {
						local33 = '×';
					} else if (local54.equals("euro")) {
						local33 = '€';
					} else if (local54.equals("copy")) {
						local33 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local106 = 0;
									} else {
										local106 = arg3[local17];
									}
									if (arg1 == null) {
										local116 = 0;
									} else {
										local116 = arg1[local17];
									}
									local17++;
									@Pc(129) int local129 = Static418.method5543(local54.substring(4));
									@Pc(133) Class17 local133 = arg5[local129];
									@Pc(142) int local142 = arg4 == null ? local133.T() : arg4[local129];
									local133.r(arg6 + local106, local116 + -local142 + this.aClass58_13.anInt1585 + local7, 1, 0, 1);
									arg6 += arg5[local129].j();
									local15 = -1;
								} catch (@Pc(171) Exception local171) {
								}
							} else {
								this.method4825(local54);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass58_13.method1347(local33, local15);
					}
					@Pc(221) int local221;
					if (arg3 == null) {
						local221 = 0;
					} else {
						local221 = arg3[local17];
					}
					if (arg1 == null) {
						local106 = 0;
					} else {
						local106 = arg1[local17];
					}
					if (local33 != ' ') {
						if ((Static154.anInt3156 & 0xFF000000) != 0) {
							this.OA(local33, arg6 + local221 + 1, local106 + 1 + local7, Static154.anInt3156, true);
						}
						this.OA(local33, arg6 + local221, local7 - -local106, Static344.anInt5890, false);
					} else if (Static50.anInt6157 > 0) {
						Static276.anInt5059 += Static50.anInt6157;
						arg6 += Static276.anInt5059 >> 8;
						Static276.anInt5059 &= 0xFF;
					}
					local17++;
					local116 = this.aClass58_13.method1341(local33);
					if (Static280.anInt5110 != -1) {
						this.aClass49_11.method4413(Static280.anInt5110, local116, (int) ((double) this.aClass58_13.anInt1585 * 0.7D) + local7, arg6);
					}
					if (Static188.anInt3662 != -1) {
						this.aClass49_11.method4413(Static188.anInt3662, local116, this.aClass58_13.anInt1585 + local7, arg6);
					}
					arg6 += local116;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public final void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method4823(-16777216, arg3);
		@Pc(26) double local26 = 7.0D - (double) arg4 / 8.0D;
		if (local26 < 0.0D) {
			local26 = 0.0D;
		}
		@Pc(35) int local35 = arg5.length();
		@Pc(38) int[] local38 = new int[local35];
		for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
			local38[local40] = (int) (local26 * Math.sin((double) arg2 + (double) local40 / 1.5D));
		}
		this.method4819(arg0, local38, arg5, null, null, null, arg1 - this.aClass58_13.method1340(arg5) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;III)V")
	public final void method4821(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4823(arg2, arg0);
			this.method4826(0, null, 0, null, arg1, arg3, null, arg4 - this.aClass58_13.method1340(arg1) / 2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IZIIIIIIILclient!ma;I[Lclient!l;Ljava/lang/String;IIII)I")
	public final int method4822(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class73 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class17[] arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method4823(arg9, arg15);
		if (arg5 == 0) {
			arg5 = this.aClass58_13.anInt1585;
		}
		@Pc(60) int[] local60;
		if (arg13 < arg5 + this.aClass58_13.anInt1595 + this.aClass58_13.anInt1587 && arg13 < arg5 + arg5) {
			local60 = null;
		} else {
			local60 = new int[] { arg14 };
		}
		if (arg4 == -1) {
			arg4 = arg13 / arg5;
			if (arg4 <= 0) {
				arg4 = 1;
			}
		}
		@Pc(88) int local88 = this.aClass58_13.method1348(Static174.aStringArray24, arg10, arg11, local60);
		if (arg4 > 0 && arg4 <= local88) {
			Static174.aStringArray24[arg4 - 1] = this.aClass58_13.method1345(arg14, arg10, Static174.aStringArray24[arg4 - 1]);
			local88 = arg4;
		}
		if (arg1 == 3 && local88 == 1) {
			arg1 = 1;
		}
		@Pc(160) int local160;
		@Pc(189) int local189;
		if (arg1 == 0) {
			local160 = this.aClass58_13.anInt1595 + arg7;
		} else if (arg1 == 1) {
			local160 = (arg13 - this.aClass58_13.anInt1595 - this.aClass58_13.anInt1587 - arg5 * (local88 + -1)) / 2 + arg7 + this.aClass58_13.anInt1595;
		} else if (arg1 == 2) {
			local160 = arg7 + arg13 - this.aClass58_13.anInt1587 - (local88 + -1) * arg5;
		} else {
			local189 = (arg13 - this.aClass58_13.anInt1587 - this.aClass58_13.anInt1595 - arg5 * (local88 + -1)) / (local88 + 1);
			if (local189 < 0) {
				local189 = 0;
			}
			local160 = local189 + this.aClass58_13.anInt1595 + arg7;
			arg5 += local189;
		}
		for (local189 = 0; local189 < local88; local189++) {
			if (arg3 == 0) {
				this.method4826(arg2, arg10, arg12, arg8, Static174.aStringArray24[local189], local160, arg0, arg6);
			} else if (arg3 == 1) {
				this.method4826(arg2, arg10, arg12, arg8, Static174.aStringArray24[local189], local160, arg0, arg6 + (arg14 - this.aClass58_13.method1340(Static174.aStringArray24[local189])) / 2);
			} else if (arg3 == 2) {
				this.method4826(arg2, arg10, arg12, arg8, Static174.aStringArray24[local189], local160, arg0, arg14 + arg6 - this.aClass58_13.method1340(Static174.aStringArray24[local189]));
			} else if (local88 - 1 == local189) {
				this.method4826(arg2, arg10, arg12, arg8, Static174.aStringArray24[local189], local160, arg0, arg6);
			} else {
				this.method4824(Static174.aStringArray24[local189], arg14);
				this.method4826(arg2, arg10, arg12, arg8, Static174.aStringArray24[local189], local160, arg0, arg6);
				Static50.anInt6157 = 0;
			}
			local160 += arg5;
		}
		return local88;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method4823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static50.anInt6157 = 0;
		Static276.anInt5059 = 0;
		Static280.anInt5110 = -1;
		Static188.anInt3662 = -1;
		Static413.anInt6885 = arg1;
		Static344.anInt5890 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static318.anInt6739 = arg0;
		Static154.anInt3156 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method4824(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
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
			Static50.anInt6157 = (arg1 - this.aClass58_13.method1340(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4825(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static344.anInt5890 = Static344.anInt5890 & 0xFF000000 | Static211.method3335(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static344.anInt5890 = Static344.anInt5890 & 0xFF000000 | Static413.anInt6885 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static344.anInt5890 = Static211.method3335(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static344.anInt5890 = Static413.anInt6885;
			} else if (arg0.startsWith("str=")) {
				Static280.anInt5110 = Static211.method3335(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static280.anInt5110 = -8388608;
			} else if (arg0.equals("/str")) {
				Static280.anInt5110 = -1;
			} else if (arg0.startsWith("u=")) {
				Static188.anInt3662 = Static211.method3335(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static188.anInt3662 = -16777216;
			} else if (arg0.equals("/u")) {
				Static188.anInt3662 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static154.anInt3156 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static154.anInt3156 = Static211.method3335(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static154.anInt3156 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static154.anInt3156 = Static318.anInt6739;
				return;
			} else if (arg0.equals("br")) {
				this.method4823(Static318.anInt6739, Static413.anInt6885);
				return;
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!l;ILclient!ma;ILjava/lang/String;I[II)V")
	private void method4826(@OriginalArg(0) int arg0, @OriginalArg(1) Class17[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class73 arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg5 - this.aClass58_13.anInt1585;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(23) int local23 = arg4.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static129.method2210(arg4.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local18 = local25;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(59) String local59 = arg4.substring(local18 + 1, local25);
					local18 = -1;
					if (local59.equals("lt")) {
						local36 = '<';
					} else if (local59.equals("gt")) {
						local36 = '>';
					} else if (local59.equals("nbsp")) {
						local36 = ' ';
					} else if (local59.equals("shy")) {
						local36 = '\u00ad';
					} else if (local59.equals("times")) {
						local36 = '×';
					} else if (local59.equals("euro")) {
						local36 = '€';
					} else if (local59.equals("copy")) {
						local36 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									@Pc(123) int local123 = Static418.method5543(local59.substring(4));
									@Pc(127) Class17 local127 = arg1[local123];
									@Pc(136) int local136 = arg6 == null ? local127.T() : arg6[local123];
									if ((-16777216 & Static344.anInt5890) == -16777216) {
										local127.r(arg7, local12 + this.aClass58_13.anInt1585 - local136, 1, 0, 1);
									} else {
										local127.r(arg7, local12 + this.aClass58_13.anInt1585 - local136, 0, Static344.anInt5890 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local20 = -1;
									arg7 += arg1[local123].j();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method4825(local59);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg7 += this.aClass58_13.method1347(local36, local20);
					}
					if (local36 == ' ') {
						if (Static50.anInt6157 > 0) {
							Static276.anInt5059 += Static50.anInt6157;
							arg7 += Static276.anInt5059 >> 8;
							Static276.anInt5059 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static154.anInt3156 & 0xFF000000) != 0) {
							this.OA(local36, arg7 + 1, local12 + 1, Static154.anInt3156, true);
						}
						this.OA(local36, arg7, local12, Static344.anInt5890, false);
					} else {
						if ((Static154.anInt3156 & 0xFF000000) != 0) {
							this.method4809(local36, arg7 + 1, local12 + 1, Static154.anInt3156, true, arg3, arg2, arg0);
						}
						this.method4809(local36, arg7, local12, Static344.anInt5890, false, arg3, arg2, arg0);
					}
					@Pc(309) int local309 = this.aClass58_13.method1341(local36);
					if (Static280.anInt5110 != -1) {
						this.aClass49_11.method4413(Static280.anInt5110, local309, local12 + (int) ((double) this.aClass58_13.anInt1585 * 0.7D), arg7);
					}
					if (Static188.anInt3662 != -1) {
						this.aClass49_11.method4413(Static188.anInt3662, local309, this.aClass58_13.anInt1585 + local12 + 1, arg7);
					}
					arg7 += local309;
					local20 = local36;
				}
			}
		}
	}
}
