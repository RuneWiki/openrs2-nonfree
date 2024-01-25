import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class56 {

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!bq;")
	private final Class31 aClass31_13;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!ha;")
	private final Class33 aClass33_15;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!bq;)V")
	protected Class56(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class31 arg1) {
		this.aClass31_13 = arg1;
		this.aClass33_15 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method8049(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method8064(arg3, -16777216);
		@Pc(26) double local26 = 7.0D - (double) arg0 / 8.0D;
		if (local26 < 0.0D) {
			local26 = 0.0D;
		}
		@Pc(35) int local35 = arg1.length();
		@Pc(38) int[] local38 = new int[local35];
		for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
			local38[local40] = (int) (local26 * Math.sin((double) local40 / 1.5D + (double) arg4));
		}
		this.method8058((int[]) null, arg5 - this.aClass31_13.method1024(arg1) / 2, (Class17[]) null, (int[]) null, local38, arg2, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B[Lclient!tf;IIII[ILjava/util/Random;Ljava/lang/String;III[III)I")
	public final int method8050(@OriginalArg(1) Class17[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Random arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg6.setSeed((long) arg1);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method8064(arg8 & 0xFFFFFF | local20 << 24, local20 << 24 | arg9 & 0xFFFFFF);
		@Pc(40) int local40 = arg7.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg6.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg10;
		@Pc(75) int local75 = this.aClass31_13.anInt1098 + arg12;
		if (arg4 == 1) {
			local75 += (arg2 - this.aClass31_13.anInt1098 - this.aClass31_13.anInt1095) / 2;
		} else if (arg4 == 2) {
			local75 = arg2 + arg12 - this.aClass31_13.anInt1095;
		}
		@Pc(117) int local117 = -1;
		if (arg3 == 1) {
			local117 = this.aClass31_13.method1024(arg7) + local45;
			local69 = arg10 + (arg13 - local117) / 2;
		} else if (arg3 == 2) {
			local117 = local45 + this.aClass31_13.method1024(arg7);
			local69 = arg10 + arg13 - local117;
		}
		this.method8058(arg11, local69, arg0, local43, (int[]) null, local75, arg7);
		if (arg5 != null) {
			if (local117 == -1) {
				local117 = this.aClass31_13.method1024(arg7) + local45;
			}
			arg5[0] = local69;
			arg5[2] = local117;
			arg5[1] = local75 - this.aClass31_13.anInt1098;
			arg5[3] = this.aClass31_13.anInt1098 + this.aClass31_13.anInt1095;
		}
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8051(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method8052(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			this.method8064(arg3, arg4);
			this.method8060(0, arg0, arg2, arg1, (Class17[]) null, 0, (Class1) null, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!tf;IIII[IILjava/lang/String;)V")
	public final void method8053(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method8064(arg4, 0);
			this.method8060(0, arg2, arg1, arg5, arg0, 0, (Class1) null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method8054(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method8064(arg2, arg1);
			this.method8060(0, arg4 - this.aClass31_13.method1024(arg0) / 2, arg3, arg0, (Class17[]) null, 0, (Class1) null, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIB)V")
	public final void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method8064(arg0, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(25) int[] local25 = new int[local16];
		@Pc(28) int[] local28 = new int[local16];
		for (@Pc(30) int local30 = 0; local30 < local16; local30++) {
			local25[local30] = (int) (Math.sin((double) arg3 / 5.0D + (double) local30 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) arg3 / 5.0D + (double) local30 / 3.0D) * 5.0D);
		}
		this.method8058((int[]) null, arg2 - this.aClass31_13.method1024(arg1) / 2, (Class17[]) null, local25, local28, arg4, arg1);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method8057(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method8064(arg3, arg4);
			this.method8060(0, arg2 - this.aClass31_13.method1024(arg0), arg1, arg0, (Class17[]) null, 0, (Class1) null, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([II[Lclient!tf;[I[IIILjava/lang/String;)V")
	private void method8058(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(11) int local11 = arg5 - this.aClass31_13.anInt1106;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg6.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static180.method8496(arg6.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(121) int local121;
				@Pc(133) int local133;
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
									if (arg3 == null) {
										local121 = 0;
									} else {
										local121 = arg3[local17];
									}
									if (arg4 == null) {
										local133 = 0;
									} else {
										local133 = arg4[local17];
									}
									local17++;
									@Pc(144) int local144 = Static613.method8035(local57.substring(4));
									@Pc(148) Class17 local148 = arg2[local144];
									@Pc(157) int local157 = arg0 == null ? local148.method5251() : arg0[local144];
									local148.method5260(local121 + arg1, local133 + -local157 + (local11 - -this.aClass31_13.anInt1106), 1, 0, 1);
									arg1 += arg2[local144].method5256();
									local15 = -1;
								} catch (@Pc(187) Exception local187) {
								}
							} else {
								this.method8059(local57);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass31_13.method1014(local33, local15);
					}
					@Pc(223) int local223;
					if (arg3 == null) {
						local223 = 0;
					} else {
						local223 = arg3[local17];
					}
					if (arg4 == null) {
						local121 = 0;
					} else {
						local121 = arg4[local17];
					}
					if (local33 != ' ') {
						if ((Static584.anInt4441 & 0xFF000000) != 0) {
							this.fa(local33, local223 + arg1 + 1, local121 + 1 + local11, Static584.anInt4441, true);
						}
						this.fa(local33, local223 + arg1, local121 + local11, Static9.anInt10388, false);
					} else if (Static420.anInt6625 > 0) {
						Static369.anInt5535 += Static420.anInt6625;
						arg1 += Static369.anInt5535 >> 8;
						Static369.anInt5535 &= 0xFF;
					}
					local17++;
					local133 = this.aClass31_13.method1019(local33);
					if (Static304.anInt10195 != -1) {
						this.aClass33_15.method8082(arg1, (int) ((double) this.aClass31_13.anInt1106 * 0.7D) + local11, Static304.anInt10195, local133);
					}
					if (Static158.anInt9730 != -1) {
						this.aClass33_15.method8082(arg1, local11 + this.aClass31_13.anInt1106, Static158.anInt9730, local133);
					}
					arg1 += local133;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8059(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static9.anInt10388 = Static9.anInt10388 & 0xFF000000 | Static211.method8989(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static9.anInt10388 = Static408.anInt5885 & 0xFFFFFF | Static9.anInt10388 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static9.anInt10388 = Static211.method8989(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static9.anInt10388 = Static408.anInt5885;
			} else if (arg0.startsWith("str=")) {
				Static304.anInt10195 = Static9.anInt10388 & 0xFF000000 | Static211.method8989(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static304.anInt10195 = Static9.anInt10388 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static304.anInt10195 = -1;
			} else if (arg0.startsWith("u=")) {
				Static158.anInt9730 = Static9.anInt10388 & 0xFF000000 | Static211.method8989(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static158.anInt9730 = Static9.anInt10388 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static158.anInt9730 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static584.anInt4441 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static584.anInt4441 = Static9.anInt10388 & 0xFF000000 | Static211.method8989(arg0.substring(5));
				return;
			} else if (arg0.equals("shad")) {
				Static584.anInt4441 = Static9.anInt10388 & 0xFF000000;
				return;
			} else if (arg0.equals("/shad")) {
				Static584.anInt4441 = Static642.anInt10095;
				return;
			} else if (arg0.equals("br")) {
				this.method8064(Static408.anInt5885, Static642.anInt10095);
				return;
			}
		} catch (@Pc(179) Exception local179) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!tf;BILclient!aa;[I)V")
	private void method8060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class17[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int[] arg7) {
		@Pc(11) int local11 = arg2 - this.aClass31_13.anInt1106;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(37) char local37 = (char) (Static180.method8496(arg3.charAt(local20)) & 0xFF);
			if (local37 == '<') {
				local13 = local20;
			} else {
				if (local37 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg3.substring(local13 + 1, local20);
					local13 = -1;
					if (local59.equals("lt")) {
						local37 = '<';
					} else if (local59.equals("gt")) {
						local37 = '>';
					} else if (local59.equals("nbsp")) {
						local37 = ' ';
					} else if (local59.equals("shy")) {
						local37 = '\u00ad';
					} else if (local59.equals("times")) {
						local37 = '×';
					} else if (local59.equals("euro")) {
						local37 = '€';
					} else if (local59.equals("copy")) {
						local37 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									@Pc(121) int local121 = Static613.method8035(local59.substring(4));
									@Pc(125) Class17 local125 = arg4[local121];
									@Pc(134) int local134 = arg7 == null ? local125.method5251() : arg7[local121];
									if ((-16777216 & Static9.anInt10388) == -16777216) {
										local125.method5260(arg1, local11 + this.aClass31_13.anInt1106 - local134, 1, 0, 1);
									} else {
										local125.method5260(arg1, local11 + this.aClass31_13.anInt1106 - local134, 0, Static9.anInt10388 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg1 += arg4[local121].method5256();
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method8059(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass31_13.method1014(local37, local15);
					}
					if (local37 == ' ') {
						if (Static420.anInt6625 > 0) {
							Static369.anInt5535 += Static420.anInt6625;
							arg1 += Static369.anInt5535 >> 8;
							Static369.anInt5535 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static584.anInt4441 & 0xFF000000) != 0) {
							this.fa(local37, arg1 + 1, local11 + 1, Static584.anInt4441, true);
						}
						this.fa(local37, arg1, local11, Static9.anInt10388, false);
					} else {
						if ((Static584.anInt4441 & 0xFF000000) != 0) {
							this.method8051(local37, arg1 + 1, local11 - -1, Static584.anInt4441, true, arg6, arg5, arg0);
						}
						this.method8051(local37, arg1, local11, Static9.anInt10388, false, arg6, arg5, arg0);
					}
					@Pc(304) int local304 = this.aClass31_13.method1019(local37);
					if (Static304.anInt10195 != -1) {
						this.aClass33_15.method8082(arg1, local11 + (int) ((double) this.aClass31_13.anInt1106 * 0.7D), Static304.anInt10195, local304);
					}
					if (Static158.anInt9730 != -1) {
						this.aClass33_15.method8082(arg1, this.aClass31_13.anInt1106 + local11 + 1, Static158.anInt9730, local304);
					}
					arg1 += local304;
					local15 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method8061(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(33) int local33 = 0; arg1.length() > local33; local33++) {
			@Pc(39) char local39 = arg1.charAt(local33);
			if (local39 == '<') {
				local9 = true;
			} else if (local39 == '>') {
				local9 = false;
			} else if (!local9 && local39 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static420.anInt6625 = (arg0 - this.aClass31_13.method1024(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method8062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method8064(arg3, -16777216);
		@Pc(21) int local21 = arg4.length();
		@Pc(24) int[] local24 = new int[local21];
		for (@Pc(26) int local26 = 0; local26 < local21; local26++) {
			local24[local26] = (int) (Math.sin((double) local26 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method8058((int[]) null, arg2 - this.aClass31_13.method1024(arg4) / 2, (Class17[]) null, (int[]) null, local24, arg0, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!tf;IILjava/lang/String;IIIIIIIII[IBLclient!aa;I)I")
	public final int method8063(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int[] arg13, @OriginalArg(15) Class1 arg14, @OriginalArg(16) int arg15) {
		if (arg3 == null) {
			return 0;
		}
		this.method8064(arg1, arg12);
		if (arg5 == 0) {
			arg5 = this.aClass31_13.anInt1106;
		}
		@Pc(46) int[] local46;
		if (arg10 < arg5 + this.aClass31_13.anInt1098 + this.aClass31_13.anInt1095 && arg10 < arg5 + arg5) {
			local46 = null;
		} else {
			local46 = new int[] { arg15 };
		}
		@Pc(59) int local59 = this.aClass31_13.method1023(local46, arg3, Static326.aStringArray26, arg0);
		if (arg7 == -1) {
			arg7 = arg10 / arg5;
			if (arg7 <= 0) {
				arg7 = 1;
			}
		}
		if (arg7 > 0 && arg7 <= local59) {
			local59 = arg7;
			Static326.aStringArray26[arg7 - 1] = this.aClass31_13.method1015(arg0, Static326.aStringArray26[arg7 - 1], arg15);
		}
		if (arg11 == 3 && local59 == 1) {
			arg11 = 1;
		}
		@Pc(130) int local130;
		@Pc(155) int local155;
		if (arg11 == 0) {
			local130 = arg6 + this.aClass31_13.anInt1098;
		} else if (arg11 == 1) {
			local130 = (arg10 - this.aClass31_13.anInt1098 - this.aClass31_13.anInt1095 - (local59 + -1) * arg5) / 2 + this.aClass31_13.anInt1098 + arg6;
		} else if (arg11 == 2) {
			local130 = arg6 + arg10 - arg5 * (local59 - 1) - this.aClass31_13.anInt1095;
		} else {
			local155 = (arg10 - (local59 - 1) * arg5 - this.aClass31_13.anInt1095 - this.aClass31_13.anInt1098) / (local59 + 1);
			if (local155 < 0) {
				local155 = 0;
			}
			arg5 += local155;
			local130 = arg6 + this.aClass31_13.anInt1098 + local155;
		}
		for (local155 = 0; local155 < local59; local155++) {
			if (arg9 == 0) {
				this.method8060(arg4, arg2, local130, Static326.aStringArray26[local155], arg0, arg8, arg14, arg13);
			} else if (arg9 == 1) {
				this.method8060(arg4, (arg15 - this.aClass31_13.method1024(Static326.aStringArray26[local155])) / 2 + arg2, local130, Static326.aStringArray26[local155], arg0, arg8, arg14, arg13);
			} else if (arg9 == 2) {
				this.method8060(arg4, arg15 + arg2 - this.aClass31_13.method1024(Static326.aStringArray26[local155]), local130, Static326.aStringArray26[local155], arg0, arg8, arg14, arg13);
			} else if (local155 == local59 - 1) {
				this.method8060(arg4, arg2, local130, Static326.aStringArray26[local155], arg0, arg8, arg14, arg13);
			} else {
				this.method8061(arg15, Static326.aStringArray26[local155]);
				this.method8060(arg4, arg2, local130, Static326.aStringArray26[local155], arg0, arg8, arg14, arg13);
				Static420.anInt6625 = 0;
			}
			local130 += arg5;
		}
		return local59;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static158.anInt9730 = -1;
		Static408.anInt5885 = arg0;
		Static9.anInt10388 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static420.anInt6625 = 0;
		Static369.anInt5535 = 0;
		Static304.anInt10195 = -1;
		Static642.anInt10095 = arg1;
		Static584.anInt4441 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZIIIILjava/lang/String;II[Lclient!tf;Lclient!aa;I[III)I")
	public final int method8065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class17[] arg9, @OriginalArg(11) Class1 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method8063(arg9, arg14, arg13, arg6, arg0, arg7, arg4, 0, arg3, arg2, arg8, arg5, arg1, arg12, arg10, arg11);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[Lclient!tf;ILjava/lang/String;ILjava/util/Random;II)I")
	public final int method8066(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class17[] arg2, @OriginalArg(5) String arg3, @OriginalArg(7) Random arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg4.setSeed((long) arg6);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method8064(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg3.length();
		@Pc(48) int[] local48 = new int[local40];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local48[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method8058(arg1, arg5, arg2, local48, (int[]) null, arg0, arg3);
		return local50;
	}
}
