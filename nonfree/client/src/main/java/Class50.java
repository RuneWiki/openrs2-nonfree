import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class50 {

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!hia;")
	private final Class133 aClass133_33;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!ha;")
	private final Class100 aClass100_12;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!hia;)V")
	protected Class50(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class133 arg1) {
		this.aClass133_33 = arg1;
		this.aClass100_12 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!pga;Lclient!aa;IIIIIIIII[IIIILjava/lang/String;)I")
	public final int method5731(@OriginalArg(0) int arg0, @OriginalArg(1) Class32[] arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) String arg15) {
		if (arg15 == null) {
			return 0;
		}
		this.method5744(arg10, arg13);
		if (arg4 == 0) {
			arg4 = this.aClass133_33.anInt4195;
		}
		@Pc(67) int[] local67;
		if (this.aClass133_33.anInt4190 + this.aClass133_33.anInt4192 + arg4 > arg0 && arg0 < arg4 + arg4) {
			local67 = null;
		} else {
			local67 = new int[] { arg14 };
		}
		@Pc(80) int local80 = this.aClass133_33.method3640(Static285.aStringArray35, local67, arg15, arg1);
		if (arg5 == -1) {
			arg5 = arg0 / arg4;
			if (arg5 <= 0) {
				arg5 = 1;
			}
		}
		if (arg5 > 0 && local80 >= arg5) {
			Static285.aStringArray35[arg5 - 1] = this.aClass133_33.method3637(arg14, arg1, Static285.aStringArray35[arg5 - 1]);
			local80 = arg5;
		}
		if (arg6 == 3 && local80 == 1) {
			arg6 = 1;
		}
		@Pc(142) int local142;
		@Pc(194) int local194;
		if (arg6 == 0) {
			local142 = arg3 + this.aClass133_33.anInt4192;
		} else if (arg6 == 1) {
			local142 = this.aClass133_33.anInt4192 + arg3 + (-((local80 + -1) * arg4) + -this.aClass133_33.anInt4190 + (arg0 - this.aClass133_33.anInt4192)) / 2;
		} else if (arg6 == 2) {
			local142 = arg3 + arg0 - this.aClass133_33.anInt4190 - (local80 + -1) * arg4;
		} else {
			local194 = (arg0 - (local80 - 1) * arg4 - this.aClass133_33.anInt4190 - this.aClass133_33.anInt4192) / (local80 + 1);
			if (local194 < 0) {
				local194 = 0;
			}
			arg4 += local194;
			local142 = this.aClass133_33.anInt4192 + arg3 + local194;
		}
		for (local194 = 0; local194 < local80; local194++) {
			if (arg8 == 0) {
				this.method5732(arg9, arg7, arg1, arg11, Static285.aStringArray35[local194], local142, arg2, arg12);
			} else if (arg8 == 1) {
				this.method5732(arg9, arg7, arg1, arg11, Static285.aStringArray35[local194], local142, arg2, arg12 + (arg14 - this.aClass133_33.method3643(Static285.aStringArray35[local194])) / 2);
			} else if (arg8 == 2) {
				this.method5732(arg9, arg7, arg1, arg11, Static285.aStringArray35[local194], local142, arg2, arg14 + arg12 - this.aClass133_33.method3643(Static285.aStringArray35[local194]));
			} else if (local194 == local80 - 1) {
				this.method5732(arg9, arg7, arg1, arg11, Static285.aStringArray35[local194], local142, arg2, arg12);
			} else {
				this.method5745(arg14, Static285.aStringArray35[local194]);
				this.method5732(arg9, arg7, arg1, arg11, Static285.aStringArray35[local194], local142, arg2, arg12);
				Static11.anInt223 = 0;
			}
			local142 += arg4;
		}
		return local80;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!pga;[ILjava/lang/String;ILclient!aa;II)V")
	private void method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7) {
		@Pc(19) int local19 = arg5 - this.aClass133_33.anInt4195;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg4.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static557.method8051(arg4.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local21 = local28;
			} else {
				if (local39 == '>' && local21 != -1) {
					@Pc(61) String local61 = arg4.substring(local21 + 1, local28);
					local21 = -1;
					if (local61.equals("lt")) {
						local39 = '<';
					} else if (local61.equals("gt")) {
						local39 = '>';
					} else if (local61.equals("nbsp")) {
						local39 = ' ';
					} else if (local61.equals("shy")) {
						local39 = '\u00ad';
					} else if (local61.equals("times")) {
						local39 = '×';
					} else if (local61.equals("euro")) {
						local39 = '€';
					} else if (local61.equals("copy")) {
						local39 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									@Pc(117) int local117 = Static355.method5682(local61.substring(4));
									@Pc(121) Class32 local121 = arg2[local117];
									@Pc(130) int local130 = arg3 == null ? local121.method5079() : arg3[local117];
									if ((-16777216 & Static390.anInt7657) == -16777216) {
										local121.method5088(arg7, this.aClass133_33.anInt4195 + local19 - local130, 1, 0, 1);
									} else {
										local121.method5088(arg7, local19 + this.aClass133_33.anInt4195 - local130, 0, Static390.anInt7657 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg7 += arg2[local117].method5080();
									local23 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else {
								this.method5743(local61);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg7 += this.aClass133_33.method3642(local23, local39);
					}
					if (local39 == ' ') {
						if (Static11.anInt223 > 0) {
							Static312.anInt5966 += Static11.anInt223;
							arg7 += Static312.anInt5966 >> 8;
							Static312.anInt5966 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static139.anInt2626 & 0xFF000000) != 0) {
							this.fa(local39, arg7 + 1, local19 - -1, Static139.anInt2626, true);
						}
						this.fa(local39, arg7, local19, Static390.anInt7657, false);
					} else {
						if ((Static139.anInt2626 & 0xFF000000) != 0) {
							this.method5738(local39, arg7 + 1, local19 + 1, Static139.anInt2626, true, arg6, arg0, arg1);
						}
						this.method5738(local39, arg7, local19, Static390.anInt7657, false, arg6, arg0, arg1);
					}
					@Pc(313) int local313 = this.aClass133_33.method3644(local39);
					if (Static480.anInt8338 != -1) {
						this.aClass100_12.method8790(local19 + (int) ((double) this.aClass133_33.anInt4195 * 0.7D), local313, Static480.anInt8338, arg7);
					}
					if (Static178.anInt3653 != -1) {
						this.aClass100_12.method8790(local19 + this.aClass133_33.anInt4195 + 1, local313, Static178.anInt3653, arg7);
					}
					arg7 += local313;
					local23 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZILjava/lang/String;II)V")
	public final void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5744(arg4, -16777216);
		@Pc(16) int local16 = arg3.length();
		@Pc(25) int[] local25 = new int[local16];
		for (@Pc(27) int local27 = 0; local27 < local16; local27++) {
			local25[local27] = (int) (Math.sin((double) arg1 / 5.0D + (double) local27 / 2.0D) * 5.0D);
		}
		this.method5741((Class32[]) null, (int[]) null, (int[]) null, arg2, arg3, local25, arg0 - this.aClass133_33.method3643(arg3) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IBII)V")
	public final void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5744(arg4, arg2);
			this.method5732(0, 0, (Class32[]) null, (int[]) null, arg1, arg3, (Class1) null, arg0 - this.aClass133_33.method3643(arg1) / 2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIB)V")
	public final void method5735(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			this.method5744(arg3, arg2);
			this.method5732(0, 0, (Class32[]) null, (int[]) null, arg1, arg4, (Class1) null, arg0 - this.aClass133_33.method3643(arg1));
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIILjava/lang/String;II)V")
	public final void method5736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5744(arg4, arg0);
			this.method5732(0, 0, (Class32[]) null, (int[]) null, arg2, arg3, (Class1) null, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII[Lclient!pga;I[ILjava/util/Random;III[I)I")
	public final int method5737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class32[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) Random arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg9.setSeed((long) arg4);
		@Pc(28) int local28 = (arg9.nextInt() & 0x1F) + 192;
		this.method5744(local28 << 24 | arg0 & 0xFFFFFF, arg12 & 0xFFFFFF | local28 << 24);
		@Pc(48) int local48 = arg2.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg9.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(77) int local77 = arg11;
		@Pc(83) int local83 = this.aClass133_33.anInt4192 + arg7;
		@Pc(85) int local85 = -1;
		if (arg10 == 1) {
			local83 += (arg5 - this.aClass133_33.anInt4190 - this.aClass133_33.anInt4192) / 2;
		} else if (arg10 == 2) {
			local83 = arg5 + arg7 - this.aClass133_33.anInt4190;
		}
		if (arg1 == 1) {
			local85 = local53 + this.aClass133_33.method3643(arg2);
			local77 = arg11 + (arg3 - local85) / 2;
		} else if (arg1 == 2) {
			local85 = this.aClass133_33.method3643(arg2) + local53;
			local77 = arg11 + arg3 - local85;
		}
		this.method5741(arg6, local51, arg8, local83, arg2, (int[]) null, local77);
		if (arg13 != null) {
			if (local85 == -1) {
				local85 = this.aClass133_33.method3643(arg2) + local53;
			}
			arg13[1] = local83 - this.aClass133_33.anInt4192;
			arg13[3] = this.aClass133_33.anInt4190 + this.aClass133_33.anInt4192;
			arg13[2] = local85;
			arg13[0] = local77;
		}
		return local53;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method5738(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI[I[Lclient!pga;Ljava/util/Random;Ljava/lang/String;III)I")
	public final int method5740(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) Class32[] arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg3.setSeed((long) arg0);
		@Pc(28) int local28 = (arg3.nextInt() & 0x1F) + 192;
		this.method5744(local28 << 24 | 0xFFFFFF, (local28 | 0x0) << 24);
		@Pc(48) int local48 = arg4.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg3.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		this.method5741(arg2, local51, arg1, arg5, arg4, (int[]) null, arg6);
		return local53;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!pga;Z[I[IILjava/lang/String;[II)V")
	private void method5741(@OriginalArg(0) Class32[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - this.aClass133_33.anInt4195;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			@Pc(38) char local38 = (char) (Static557.method8051(arg4.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				@Pc(121) int local121;
				@Pc(131) int local131;
				if (local38 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg4.substring(local13 + 1, local27);
					local13 = -1;
					if (local59.equals("lt")) {
						local38 = '<';
					} else if (local59.equals("gt")) {
						local38 = '>';
					} else if (local59.equals("nbsp")) {
						local38 = ' ';
					} else if (local59.equals("shy")) {
						local38 = '\u00ad';
					} else if (local59.equals("times")) {
						local38 = '×';
					} else if (local59.equals("euro")) {
						local38 = '€';
					} else if (local59.equals("copy")) {
						local38 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local121 = 0;
									} else {
										local121 = arg1[local17];
									}
									if (arg5 == null) {
										local131 = 0;
									} else {
										local131 = arg5[local17];
									}
									local17++;
									@Pc(144) int local144 = Static355.method5682(local59.substring(4));
									@Pc(148) Class32 local148 = arg0[local144];
									@Pc(157) int local157 = arg2 == null ? local148.method5079() : arg2[local144];
									local148.method5088(local121 + arg6, this.aClass133_33.anInt4195 + local7 - local157 - -local131, 1, 0, 1);
									arg6 += arg0[local144].method5080();
									local15 = -1;
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method5743(local59);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass133_33.method3642(local15, local38);
					}
					@Pc(225) int local225;
					if (arg1 == null) {
						local225 = 0;
					} else {
						local225 = arg1[local17];
					}
					if (arg5 == null) {
						local121 = 0;
					} else {
						local121 = arg5[local17];
					}
					if (local38 != ' ') {
						if ((Static139.anInt2626 & 0xFF000000) != 0) {
							this.fa(local38, arg6 + local225 + 1, local7 + 1 + local121, Static139.anInt2626, true);
						}
						this.fa(local38, arg6 + local225, local7 + local121, Static390.anInt7657, false);
					} else if (Static11.anInt223 > 0) {
						Static312.anInt5966 += Static11.anInt223;
						arg6 += Static312.anInt5966 >> 8;
						Static312.anInt5966 &= 0xFF;
					}
					local17++;
					local131 = this.aClass133_33.method3644(local38);
					if (Static480.anInt8338 != -1) {
						this.aClass100_12.method8790(local7 + (int) ((double) this.aClass133_33.anInt4195 * 0.7D), local131, Static480.anInt8338, arg6);
					}
					if (Static178.anInt3653 != -1) {
						this.aClass100_12.method8790(this.aClass133_33.anInt4195 + local7, local131, Static178.anInt3653, arg6);
					}
					arg6 += local131;
					local15 = local38;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIILclient!aa;ILjava/lang/String;IIIIII[Lclient!pga;)I")
	public final int method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class32[] arg14) {
		return this.method5731(arg10, arg14, arg5, arg2, arg4, 0, arg9, arg0, arg6, arg8, arg3, arg1, arg12, arg13, arg11, arg7);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5743(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static390.anInt7657 = Static390.anInt7657 & 0xFF000000 | Static141.method8187(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static390.anInt7657 = Static390.anInt7657 & 0xFF000000 | Static203.anInt4057 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static390.anInt7657 = Static141.method8187(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static390.anInt7657 = Static203.anInt4057;
			} else if (arg0.startsWith("str=")) {
				Static480.anInt8338 = Static390.anInt7657 & 0xFF000000 | Static141.method8187(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static480.anInt8338 = Static390.anInt7657 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static480.anInt8338 = -1;
			} else if (arg0.startsWith("u=")) {
				Static178.anInt3653 = Static390.anInt7657 & 0xFF000000 | Static141.method8187(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static178.anInt3653 = Static390.anInt7657 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static178.anInt3653 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static139.anInt2626 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static139.anInt2626 = Static390.anInt7657 & 0xFF000000 | Static141.method8187(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static139.anInt2626 = Static390.anInt7657 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static139.anInt2626 = Static251.anInt5032;
			} else if (arg0.equals("br")) {
				this.method5744(Static203.anInt4057, Static251.anInt5032);
			}
		} catch (@Pc(183) Exception local183) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method5744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static203.anInt4057 = arg0;
		Static390.anInt7657 = arg0;
		Static312.anInt5966 = 0;
		Static178.anInt3653 = -1;
		Static480.anInt8338 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static11.anInt223 = 0;
		Static251.anInt5032 = arg1;
		Static139.anInt2626 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method5745(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(17) int local17 = 0; arg1.length() > local17; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 == '<') {
				local9 = true;
			} else if (local23 == '>') {
				local9 = false;
			} else if (!local9 && local23 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static11.anInt223 = (arg0 - this.aClass133_33.method3643(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method5746(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5744(arg1, -16777216);
		@Pc(18) int local18 = arg0.length();
		@Pc(21) int[] local21 = new int[local18];
		@Pc(24) int[] local24 = new int[local18];
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			local21[local26] = (int) (Math.sin((double) local26 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local24[local26] = (int) (Math.sin((double) arg4 / 5.0D + (double) local26 / 3.0D) * 5.0D);
		}
		this.method5741((Class32[]) null, local21, (int[]) null, arg3, arg0, local24, arg2 - this.aClass133_33.method3643(arg0) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	public final void method5747(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method5744(arg0, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg1 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg3.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) arg4 + (double) local34 / 1.5D) * local20);
		}
		this.method5741((Class32[]) null, (int[]) null, (int[]) null, arg5, arg3, local32, arg2 - this.aClass133_33.method3643(arg3) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;I[Lclient!pga;[II)V")
	public final void method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Class32[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg3 != null) {
			this.method5744(arg1, 0);
			this.method5732(0, 0, arg4, arg5, arg3, arg2, (Class1) null, arg0);
		}
	}
}
