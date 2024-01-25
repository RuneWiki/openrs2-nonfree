import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class16 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!je;")
	private final Class122 aClass122_9;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!qa;")
	private final Class128 aClass128_37;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qa;Lclient!je;)V")
	protected Class16(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class122 arg1) {
		this.aClass122_9 = arg1;
		this.aClass128_37 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method5478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5487(arg2, arg4);
			this.method5493(arg0, 0, null, null, arg1, null, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5479(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
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
			Static42.anInt7107 = (arg1 - this.aClass122_9.method2464(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method5480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5487(-16777216, arg1);
		@Pc(20) int local20 = arg4.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5489(local23, arg2 - this.aClass122_9.method2464(arg4) / 2, arg4, null, arg3, local26, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII[II[Lclient!f;ILclient!ea;IBILjava/lang/String;III)I")
	public final int method5481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class49[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class59 arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) String arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5485(arg10, arg1, arg4, 0, arg9, arg6, arg5, arg8, 1, arg12, arg11, 0, arg2, arg0, arg3, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	protected abstract void method5482(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class59 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[IIIILjava/lang/String;IILjava/util/Random;[Lclient!f;)I")
	public final int method5483(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) Class49[] arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg5.setSeed((long) arg1);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method5487((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(52) int local52 = arg3.length();
		@Pc(55) int[] local55 = new int[local52];
		@Pc(57) int local57 = 0;
		for (@Pc(59) int local59 = 0; local59 < local52; local59++) {
			local55[local59] = local57;
			if ((arg5.nextInt() & 0x3) == 0) {
				local57++;
			}
		}
		this.method5489(local55, arg4, arg3, arg6, arg2, null, arg0);
		return local57;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[Lclient!f;ILjava/lang/String;Lclient!ea;IIIIIII[IIII)I")
	public final int method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) Class59 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg4 == null) {
			return 0;
		}
		this.method5487(arg10, arg1);
		if (arg3 == 0) {
			arg3 = this.aClass122_9.anInt3008;
		}
		@Pc(54) int[] local54;
		if (arg14 < arg3 + this.aClass122_9.anInt3010 + this.aClass122_9.anInt3003 && arg3 + arg3 > arg14) {
			local54 = null;
		} else {
			local54 = new int[] { arg15 };
		}
		@Pc(72) int local72 = this.aClass122_9.method2472(arg2, arg4, local54, Static416.aStringArray52);
		if (arg11 == -1) {
			arg11 = arg14 / arg3;
			if (arg11 <= 0) {
				arg11 = 1;
			}
		}
		if (arg11 > 0 && arg11 <= local72) {
			Static416.aStringArray52[arg11 - 1] = this.aClass122_9.method2470(Static416.aStringArray52[arg11 - 1], arg15, arg2);
			local72 = arg11;
		}
		if (arg13 == 3 && local72 == 1) {
			arg13 = 1;
		}
		@Pc(148) int local148;
		@Pc(173) int local173;
		if (arg13 == 0) {
			local148 = this.aClass122_9.anInt3003 + arg0;
		} else if (arg13 == 1) {
			local148 = arg0 + this.aClass122_9.anInt3003 + (arg14 - this.aClass122_9.anInt3010 - this.aClass122_9.anInt3003 - arg3 * (local72 - 1)) / 2;
		} else if (arg13 == 2) {
			local148 = arg0 + arg14 - arg3 * (local72 - 1) - this.aClass122_9.anInt3010;
		} else {
			local173 = (arg14 - this.aClass122_9.anInt3010 - this.aClass122_9.anInt3003 - (local72 + -1) * arg3) / (local72 + 1);
			if (local173 < 0) {
				local173 = 0;
			}
			local148 = this.aClass122_9.anInt3003 + arg0 + local173;
			arg3 += local173;
		}
		for (local173 = 0; local173 < local72; local173++) {
			if (arg8 == 0) {
				this.method5493(arg7, arg6, arg2, arg12, local148, arg5, arg9, Static416.aStringArray52[local173]);
			} else if (arg8 == 1) {
				this.method5493(arg7 + (arg15 - this.aClass122_9.method2464(Static416.aStringArray52[local173])) / 2, arg6, arg2, arg12, local148, arg5, arg9, Static416.aStringArray52[local173]);
			} else if (arg8 == 2) {
				this.method5493(arg7 + arg15 - this.aClass122_9.method2464(Static416.aStringArray52[local173]), arg6, arg2, arg12, local148, arg5, arg9, Static416.aStringArray52[local173]);
			} else if (local173 == local72 - 1) {
				this.method5493(arg7, arg6, arg2, arg12, local148, arg5, arg9, Static416.aStringArray52[local173]);
			} else {
				this.method5479(Static416.aStringArray52[local173], arg15);
				this.method5493(arg7, arg6, arg2, arg12, local148, arg5, arg9, Static416.aStringArray52[local173]);
				Static42.anInt7107 = 0;
			}
			local148 += arg3;
		}
		return local72;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method5486(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5487(-16777216, arg4);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method5489(null, arg0 - this.aClass122_9.method2464(arg3) / 2, arg3, null, arg1, local19, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)V")
	private void method5487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static42.anInt7107 = 0;
		Static70.anInt1305 = -1;
		Static283.anInt4656 = arg1;
		Static65.anInt1144 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static265.anInt4221 = -1;
		Static314.anInt5208 = 0;
		Static446.anInt7387 = arg0;
		Static296.anInt4978 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method5488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method5487(-16777216, arg1);
		@Pc(21) double local21 = 7.0D - (double) arg2 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg3.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (local21 * Math.sin((double) local35 / 1.5D + (double) arg4));
		}
		this.method5489(null, arg0 - this.aClass122_9.method2464(arg3) / 2, arg3, null, arg5, local33, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IILjava/lang/String;[Lclient!f;I[II[I)V")
	private void method5489(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class49[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(14) int local14 = arg4 - this.aClass122_9.anInt3008;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int local27 = arg2.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(40) char local40 = (char) (Static5.method95(arg2.charAt(local29)) & 0xFF);
			if (local40 == '<') {
				local20 = local29;
			} else {
				@Pc(133) int local133;
				@Pc(141) int local141;
				if (local40 == '>' && local20 != -1) {
					@Pc(65) String local65 = arg2.substring(local20 + 1, local29);
					local20 = -1;
					if (local65.equals("lt")) {
						local40 = '<';
					} else if (local65.equals("gt")) {
						local40 = '>';
					} else if (local65.equals("nbsp")) {
						local40 = ' ';
					} else if (local65.equals("shy")) {
						local40 = '\u00ad';
					} else if (local65.equals("times")) {
						local40 = '×';
					} else if (local65.equals("euro")) {
						local40 = '€';
					} else if (local65.equals("copy")) {
						local40 = '©';
					} else {
						if (!local65.equals("reg")) {
							if (local65.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local133 = 0;
									} else {
										local133 = arg0[local24];
									}
									if (arg5 == null) {
										local141 = 0;
									} else {
										local141 = arg5[local24];
									}
									local24++;
									@Pc(154) int local154 = Static237.method3118(local65.substring(4));
									@Pc(158) Class49 local158 = arg3[local154];
									@Pc(167) int local167 = arg6 == null ? local158.JA() : arg6[local154];
									local158.YA(arg1 + local133, local141 + (-local167 + local14 - -this.aClass122_9.anInt3008), 1, 0, 1);
									arg1 += arg3[local154].ja();
									local22 = -1;
								} catch (@Pc(198) Exception local198) {
								}
							} else {
								this.method5490(local65);
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local20 == -1) {
					if (local22 != -1) {
						arg1 += this.aClass122_9.method2466(local40, local22);
					}
					@Pc(234) int local234;
					if (arg0 == null) {
						local234 = 0;
					} else {
						local234 = arg0[local24];
					}
					if (arg5 == null) {
						local133 = 0;
					} else {
						local133 = arg5[local24];
					}
					if (local40 != ' ') {
						if ((Static296.anInt4978 & 0xFF000000) != 0) {
							this.B(local40, local234 + arg1 + 1, local133 + 1 + local14, Static296.anInt4978, true);
						}
						this.B(local40, local234 + arg1, local14 - -local133, Static65.anInt1144, false);
					} else if (Static42.anInt7107 > 0) {
						Static314.anInt5208 += Static42.anInt7107;
						arg1 += Static314.anInt5208 >> 8;
						Static314.anInt5208 &= 0xFF;
					}
					local24++;
					local141 = this.aClass122_9.method2469(local40);
					if (Static265.anInt4221 != -1) {
						this.aClass128_37.method3607((int) ((double) this.aClass122_9.anInt3008 * 0.7D) + local14, arg1, local141, Static265.anInt4221);
					}
					if (Static70.anInt1305 != -1) {
						this.aClass128_37.method3607(local14 + this.aClass122_9.anInt3008, arg1, local141, Static70.anInt1305);
					}
					arg1 += local141;
					local22 = local40;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5490(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static65.anInt1144 = Static65.anInt1144 & 0xFF000000 | Static366.method4766(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static65.anInt1144 = Static283.anInt4656 & 0xFFFFFF | Static65.anInt1144 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static65.anInt1144 = Static366.method4766(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static65.anInt1144 = Static283.anInt4656;
			} else if (arg0.startsWith("str=")) {
				Static265.anInt4221 = Static366.method4766(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static265.anInt4221 = -8388608;
			} else if (arg0.equals("/str")) {
				Static265.anInt4221 = -1;
			} else if (arg0.startsWith("u=")) {
				Static70.anInt1305 = Static366.method4766(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static70.anInt1305 = -16777216;
			} else if (arg0.equals("/u")) {
				Static70.anInt1305 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static296.anInt4978 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static296.anInt4978 = Static366.method4766(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static296.anInt4978 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static296.anInt4978 = Static446.anInt7387;
			} else if (arg0.equals("br")) {
				this.method5487(Static446.anInt7387, Static283.anInt4656);
				return;
			}
		} catch (@Pc(163) Exception local163) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII[I[Lclient!f;IIIBILjava/lang/String;Ljava/util/Random;I)I")
	public final int method5491(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Class49[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) Random arg12, @OriginalArg(14) int arg13) {
		if (arg11 == null) {
			return 0;
		}
		arg12.setSeed((long) arg2);
		@Pc(31) int local31 = (arg12.nextInt() & 0x1F) + 192;
		this.method5487(arg10 & 0xFFFFFF | local31 << 24, arg13 & 0xFFFFFF | local31 << 24);
		@Pc(51) int local51 = arg11.length();
		@Pc(54) int[] local54 = new int[local51];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local51; local58++) {
			local54[local58] = local56;
			if ((arg12.nextInt() & 0x3) == 0) {
				local56++;
			}
		}
		@Pc(83) int local83 = arg9;
		@Pc(89) int local89 = this.aClass122_9.anInt3003 + arg1;
		if (arg4 == 1) {
			local89 += (arg8 - this.aClass122_9.anInt3010 - this.aClass122_9.anInt3003) / 2;
		} else if (arg4 == 2) {
			local89 = arg8 + arg1 - this.aClass122_9.anInt3010;
		}
		@Pc(128) int local128 = -1;
		if (arg3 == 1) {
			local128 = local56 + this.aClass122_9.method2464(arg11);
			local83 = arg9 + (arg7 - local128) / 2;
		} else if (arg3 == 2) {
			local128 = this.aClass122_9.method2464(arg11) + local56;
			local83 = arg9 + arg7 - local128;
		}
		this.method5489(local54, local83, arg11, arg6, local89, null, arg5);
		if (arg0 != null) {
			if (local128 == -1) {
				local128 = this.aClass122_9.method2464(arg11) + local56;
			}
			arg0[0] = local83;
			arg0[3] = this.aClass122_9.anInt3010 + this.aClass122_9.anInt3003;
			arg0[2] = local128;
			arg0[1] = local89 - this.aClass122_9.anInt3003;
		}
		return local56;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
	public final void method5492(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5487(-1, arg1);
			this.method5493(arg2 - this.aClass122_9.method2464(arg0), 0, null, null, arg3, null, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[Lclient!f;I[IILclient!ea;ILjava/lang/String;)V")
	private void method5493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(7) int local7 = arg4 - this.aClass122_9.anInt3008;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg7.length();
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			@Pc(35) char local35 = (char) (Static5.method95(arg7.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg7.substring(local13 + 1, local24);
					local13 = -1;
					if (local60.equals("lt")) {
						local35 = '<';
					} else if (local60.equals("gt")) {
						local35 = '>';
					} else if (local60.equals("nbsp")) {
						local35 = ' ';
					} else if (local60.equals("shy")) {
						local35 = '\u00ad';
					} else if (local60.equals("times")) {
						local35 = '×';
					} else if (local60.equals("euro")) {
						local35 = '€';
					} else if (local60.equals("copy")) {
						local35 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									@Pc(122) int local122 = Static237.method3118(local60.substring(4));
									@Pc(126) Class49 local126 = arg2[local122];
									@Pc(135) int local135 = arg3 == null ? local126.JA() : arg3[local122];
									if ((Static65.anInt1144 & 0xFF000000) == -16777216) {
										local126.YA(arg0, local7 + this.aClass122_9.anInt3008 - local135, 1, 0, 1);
									} else {
										local126.YA(arg0, this.aClass122_9.anInt3008 + local7 - local135, 0, Static65.anInt1144 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg0 += arg2[local122].ja();
									local15 = -1;
								} catch (@Pc(187) Exception local187) {
								}
							} else {
								this.method5490(local60);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass122_9.method2466(local35, local15);
					}
					if (local35 == ' ') {
						if (Static42.anInt7107 > 0) {
							Static314.anInt5208 += Static42.anInt7107;
							arg0 += Static314.anInt5208 >> 8;
							Static314.anInt5208 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static296.anInt4978 & 0xFF000000) != 0) {
							this.B(local35, arg0 + 1, local7 + 1, Static296.anInt4978, true);
						}
						this.B(local35, arg0, local7, Static65.anInt1144, false);
					} else {
						if ((Static296.anInt4978 & 0xFF000000) != 0) {
							this.method5482(local35, arg0 + 1, local7 + 1, Static296.anInt4978, true, arg5, arg6, arg1);
						}
						this.method5482(local35, arg0, local7, Static65.anInt1144, false, arg5, arg6, arg1);
					}
					@Pc(306) int local306 = this.aClass122_9.method2469(local35);
					if (Static265.anInt4221 != -1) {
						this.aClass128_37.method3607(local7 + (int) ((double) this.aClass122_9.anInt3008 * 0.7D), arg0, local306, Static265.anInt4221);
					}
					if (Static70.anInt1305 != -1) {
						this.aClass128_37.method3607(local7 + this.aClass122_9.anInt3008 + 1, arg0, local306, Static70.anInt1305);
					}
					local15 = local35;
					arg0 += local306;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;Z)V")
	public final void method5495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method5487(arg1, arg0);
			this.method5493(arg2 - this.aClass122_9.method2464(arg4) / 2, 0, null, null, arg3, null, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;III[III)V")
	public final void method5496(@OriginalArg(0) String arg0, @OriginalArg(1) Class49[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg0 != null) {
			this.method5487(0, arg5);
			this.method5493(arg3, 0, arg1, arg4, arg2, null, 0, arg0);
		}
	}
}
