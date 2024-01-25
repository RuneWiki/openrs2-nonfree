import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class23 {

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!ap;")
	private final Class14 aClass14_10;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!za;")
	private final Class200 aClass200_11;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!za;Lclient!ap;)V")
	protected Class23(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class14 arg1) {
		this.aClass14_10 = arg1;
		this.aClass200_11 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!o;[ILjava/lang/String;IIILclient!ta;I)V")
	private void method5738(@OriginalArg(0) int arg0, @OriginalArg(1) Class49[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class97 arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg7 - this.aClass14_10.anInt356;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(43) int local43 = 0; local43 < local18; local43++) {
			@Pc(54) char local54 = (char) (Static318.method3932(arg3.charAt(local43)) & 0xFF);
			if (local54 == '<') {
				local13 = local43;
			} else {
				if (local54 == '>' && local13 != -1) {
					@Pc(75) String local75 = arg3.substring(local13 + 1, local43);
					local13 = -1;
					if (local75.equals("lt")) {
						local54 = '<';
					} else if (local75.equals("gt")) {
						local54 = '>';
					} else if (local75.equals("nbsp")) {
						local54 = ' ';
					} else if (local75.equals("shy")) {
						local54 = '\u00ad';
					} else if (local75.equals("times")) {
						local54 = '×';
					} else if (local75.equals("euro")) {
						local54 = '€';
					} else if (local75.equals("copy")) {
						local54 = '©';
					} else {
						if (!local75.equals("reg")) {
							if (local75.startsWith("img=")) {
								try {
									@Pc(143) int local143 = Static311.method3824(local75.substring(4));
									@Pc(147) Class49 local147 = arg1[local143];
									@Pc(156) int local156 = arg2 == null ? local147.Q() : arg2[local143];
									if ((Static86.anInt1563 & 0xFF000000) == -16777216) {
										local147.W(arg0, this.aClass14_10.anInt356 + local7 - local156, 1, 0, 1);
									} else {
										local147.W(arg0, this.aClass14_10.anInt356 + local7 - local156, 0, Static86.anInt1563 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg0 += arg1[local143].RA();
									local15 = -1;
								} catch (@Pc(207) Exception local207) {
								}
							} else {
								this.method5755(local75);
							}
							continue;
						}
						local54 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass14_10.method279(local15, local54);
					}
					if (local54 == ' ') {
						if (Static395.anInt6456 > 0) {
							Static453.anInt6190 += Static395.anInt6456;
							arg0 += Static453.anInt6190 >> 8;
							Static453.anInt6190 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static229.anInt3805 & 0xFF000000) != 0) {
							this.B(local54, arg0 + 1, local7 + 1, Static229.anInt3805, true);
						}
						this.B(local54, arg0, local7, Static86.anInt1563, false);
					} else {
						if ((Static229.anInt3805 & 0xFF000000) != 0) {
							this.method5748(local54, arg0 + 1, local7 + 1, Static229.anInt3805, true, arg6, arg5, arg4);
						}
						this.method5748(local54, arg0, local7, Static86.anInt1563, false, arg6, arg5, arg4);
					}
					@Pc(323) int local323 = this.aClass14_10.method277(local54);
					if (Static229.anInt3800 != -1) {
						this.aClass200_11.method5815(Static229.anInt3800, arg0, local323, (int) ((double) this.aClass14_10.anInt356 * 0.7D) + local7);
					}
					if (Static78.anInt4644 != -1) {
						this.aClass200_11.method5815(Static78.anInt4644, arg0, local323, local7 + this.aClass14_10.anInt356 + 1);
					}
					local15 = local54;
					arg0 += local323;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5739(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5741(arg4, arg3);
			this.method5738(arg0 - this.aClass14_10.method286(arg1) / 2, null, null, arg1, 0, 0, null, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[Lclient!o;IILjava/lang/String;I)V")
	public final void method5740(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 != null) {
			this.method5741(0, arg2);
			this.method5738(arg4, arg3, arg1, arg5, 0, 0, null, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method5741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static453.anInt6190 = 0;
		Static78.anInt4644 = -1;
		Static345.anInt5644 = arg1;
		Static86.anInt1563 = arg1;
		Static395.anInt6456 = 0;
		Static229.anInt3800 = -1;
		Static380.anInt6264 = arg0;
		Static229.anInt3805 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method5741(-1, arg3);
			this.method5738(arg0 - this.aClass14_10.method286(arg1), null, null, arg1, 0, 0, null, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IBII)V")
	public final void method5743(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5741(-16777216, arg4);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			local19[local25] = (int) (Math.sin((double) local25 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5754(arg0 - this.aClass14_10.method286(arg1) / 2, arg1, null, null, null, arg2, local19);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
	public final void method5744(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5741(arg0, arg2);
			this.method5738(arg3, null, null, arg1, 0, 0, null, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IBIII)V")
	public final void method5745(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5741(-16777216, arg2);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local19[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local22[local32] = (int) (Math.sin((double) arg0 / 5.0D + (double) local32 / 3.0D) * 5.0D);
		}
		this.method5754(arg3 - this.aClass14_10.method286(arg1) / 2, arg1, local19, null, null, arg4, local22);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method5747(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method5741(-16777216, arg2);
		@Pc(27) double local27 = 7.0D - (double) arg3 / 8.0D;
		if (local27 < 0.0D) {
			local27 = 0.0D;
		}
		@Pc(36) int local36 = arg0.length();
		@Pc(39) int[] local39 = new int[local36];
		for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
			local39[local41] = (int) (Math.sin((double) arg1 + (double) local41 / 1.5D) * local27);
		}
		this.method5754(arg5 - this.aClass14_10.method286(arg0) / 2, arg0, null, null, null, arg4, local39);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	protected abstract void method5748(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IZIIII[Lclient!o;IILjava/util/Random;[I[I)I")
	public final int method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class49[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Random arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int[] arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg11.setSeed((long) arg7);
		@Pc(20) int local20 = (arg11.nextInt() & 0x1F) + 192;
		this.method5741(local20 << 24 | arg10 & 0xFFFFFF, arg6 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg2.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg11.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg0;
		@Pc(79) int local79 = arg3 + this.aClass14_10.anInt360;
		if (arg4 == 1) {
			local79 += (arg1 - this.aClass14_10.anInt360 - this.aClass14_10.anInt363) / 2;
		} else if (arg4 == 2) {
			local79 = arg3 + arg1 - this.aClass14_10.anInt363;
		}
		@Pc(126) int local126 = -1;
		if (arg5 == 1) {
			local126 = local45 + this.aClass14_10.method286(arg2);
			local72 = arg0 + (arg9 - local126) / 2;
		} else if (arg5 == 2) {
			local126 = local45 + this.aClass14_10.method286(arg2);
			local72 = arg0 + arg9 - local126;
		}
		this.method5754(local72, arg2, local43, arg12, arg8, local79, null);
		if (arg13 != null) {
			if (local126 == -1) {
				local126 = local45 + this.aClass14_10.method286(arg2);
			}
			arg13[1] = local79 - this.aClass14_10.anInt360;
			arg13[3] = this.aClass14_10.anInt360 + this.aClass14_10.anInt363;
			arg13[0] = local72;
			arg13[2] = local126;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI[Lclient!o;Ljava/lang/String;I[IIILjava/util/Random;I)I")
	public final int method5750(@OriginalArg(2) Class49[] arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) int arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg5.setSeed((long) arg2);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method5741((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg1.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg5.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5754(arg6, arg1, local43, arg3, arg0, arg4, null);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5751(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
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
			Static395.anInt6456 = (arg1 - this.aClass14_10.method286(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ta;IIIII[Lclient!o;I[IIIILjava/lang/String;III)I")
	public final int method5752(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class49[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(12) String arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5753(arg8, arg7, 0, arg1, 0, arg0, arg9, arg6, arg2, arg11, arg5, arg12, 1, arg4, arg10, arg3);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILclient!ta;Ljava/lang/String;[IBIIIII[Lclient!o;II)I")
	public final int method5753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class49[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg6 == null) {
			return 0;
		}
		this.method5741(arg9, arg15);
		if (arg2 == 0) {
			arg2 = this.aClass14_10.anInt356;
		}
		@Pc(52) int[] local52;
		if (arg2 + this.aClass14_10.anInt360 + this.aClass14_10.anInt363 > arg1 && arg1 < arg2 + arg2) {
			local52 = null;
		} else {
			local52 = new int[] { arg0 };
		}
		@Pc(65) int local65 = this.aClass14_10.method278(arg13, local52, arg6, Static362.aStringArray40);
		if (arg4 == -1) {
			arg4 = arg1 / arg2;
			if (arg4 <= 0) {
				arg4 = 1;
			}
		}
		if (arg4 > 0 && arg4 <= local65) {
			local65 = arg4;
			Static362.aStringArray40[arg4 - 1] = this.aClass14_10.method287(Static362.aStringArray40[arg4 - 1], arg13, arg0);
		}
		if (arg3 == 3 && local65 == 1) {
			arg3 = 1;
		}
		@Pc(142) int local142;
		@Pc(166) int local166;
		if (arg3 == 0) {
			local142 = this.aClass14_10.anInt360 + arg10;
		} else if (arg3 == 1) {
			local142 = this.aClass14_10.anInt360 + arg10 + (-this.aClass14_10.anInt363 + (arg1 - this.aClass14_10.anInt360 - (local65 + -1) * arg2)) / 2;
		} else if (arg3 == 2) {
			local142 = arg10 + arg1 - this.aClass14_10.anInt363 - arg2 * (local65 + -1);
		} else {
			local166 = (arg1 - this.aClass14_10.anInt360 - this.aClass14_10.anInt363 - arg2 * (local65 - 1)) / (local65 + 1);
			if (local166 < 0) {
				local166 = 0;
			}
			arg2 += local166;
			local142 = arg10 + this.aClass14_10.anInt360 + local166;
		}
		for (local166 = 0; local166 < local65; local166++) {
			if (arg12 == 0) {
				this.method5738(arg14, arg13, arg7, Static362.aStringArray40[local166], arg8, arg11, arg5, local142);
			} else if (arg12 == 1) {
				this.method5738(arg14 + (arg0 - this.aClass14_10.method286(Static362.aStringArray40[local166])) / 2, arg13, arg7, Static362.aStringArray40[local166], arg8, arg11, arg5, local142);
			} else if (arg12 == 2) {
				this.method5738(arg14 + arg0 - this.aClass14_10.method286(Static362.aStringArray40[local166]), arg13, arg7, Static362.aStringArray40[local166], arg8, arg11, arg5, local142);
			} else if (local65 - 1 == local166) {
				this.method5738(arg14, arg13, arg7, Static362.aStringArray40[local166], arg8, arg11, arg5, local142);
			} else {
				this.method5751(Static362.aStringArray40[local166], arg0);
				this.method5738(arg14, arg13, arg7, Static362.aStringArray40[local166], arg8, arg11, arg5, local142);
				Static395.anInt6456 = 0;
			}
			local142 += arg2;
		}
		return local65;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;[I[I[Lclient!o;IZ[I)V")
	private void method5754(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class49[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg5 - this.aClass14_10.anInt356;
		@Pc(13) int local13 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg1.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static318.method3932(arg1.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				@Pc(114) int local114;
				@Pc(122) int local122;
				if (local38 == '>' && local13 != -1) {
					@Pc(58) String local58 = arg1.substring(local13 + 1, local27);
					local13 = -1;
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
									if (arg2 == null) {
										local114 = 0;
									} else {
										local114 = arg2[local22];
									}
									if (arg6 == null) {
										local122 = 0;
									} else {
										local122 = arg6[local22];
									}
									local22++;
									@Pc(135) int local135 = Static311.method3824(local58.substring(4));
									@Pc(139) Class49 local139 = arg4[local135];
									@Pc(148) int local148 = arg3 == null ? local139.Q() : arg3[local135];
									local139.W(local114 + arg0, local122 + -local148 + local11 + this.aClass14_10.anInt356, 1, 0, 1);
									local20 = -1;
									arg0 += arg4[local135].RA();
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method5755(local58);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local20 != -1) {
						arg0 += this.aClass14_10.method279(local20, local38);
					}
					@Pc(222) int local222;
					if (arg2 == null) {
						local222 = 0;
					} else {
						local222 = arg2[local22];
					}
					if (arg6 == null) {
						local114 = 0;
					} else {
						local114 = arg6[local22];
					}
					if (local38 != ' ') {
						if ((Static229.anInt3805 & 0xFF000000) != 0) {
							this.B(local38, local222 + arg0 + 1, local114 + 1 + local11, Static229.anInt3805, true);
						}
						this.B(local38, local222 + arg0, local11 - -local114, Static86.anInt1563, false);
					} else if (Static395.anInt6456 > 0) {
						Static453.anInt6190 += Static395.anInt6456;
						arg0 += Static453.anInt6190 >> 8;
						Static453.anInt6190 &= 0xFF;
					}
					local22++;
					local122 = this.aClass14_10.method277(local38);
					if (Static229.anInt3800 != -1) {
						this.aClass200_11.method5815(Static229.anInt3800, arg0, local122, local11 + (int) ((double) this.aClass14_10.anInt356 * 0.7D));
					}
					if (Static78.anInt4644 != -1) {
						this.aClass200_11.method5815(Static78.anInt4644, arg0, local122, local11 + this.aClass14_10.anInt356);
					}
					arg0 += local122;
					local20 = local38;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method5755(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static86.anInt1563 = Static86.anInt1563 & 0xFF000000 | Static94.method1328(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static86.anInt1563 = Static86.anInt1563 & 0xFF000000 | Static345.anInt5644 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static86.anInt1563 = Static94.method1328(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static86.anInt1563 = Static345.anInt5644;
			} else if (arg0.startsWith("str=")) {
				Static229.anInt3800 = Static86.anInt1563 & 0xFF000000 | Static94.method1328(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static229.anInt3800 = Static86.anInt1563 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static229.anInt3800 = -1;
			} else if (arg0.startsWith("u=")) {
				Static78.anInt4644 = Static86.anInt1563 & 0xFF000000 | Static94.method1328(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static78.anInt4644 = Static86.anInt1563 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static78.anInt4644 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static229.anInt3805 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static229.anInt3805 = Static86.anInt1563 & 0xFF000000 | Static94.method1328(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static229.anInt3805 = Static86.anInt1563 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static229.anInt3805 = Static380.anInt6264;
			} else if (arg0.equals("br")) {
				this.method5741(Static380.anInt6264, Static345.anInt5644);
			}
		} catch (@Pc(179) Exception local179) {
		}
	}
}
