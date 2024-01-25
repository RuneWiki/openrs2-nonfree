import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public abstract class Class29 {

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Lclient!ii;")
	private final Class105 aClass105_11;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Lclient!cl;")
	private final Class34 aClass34_7;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ii;Lclient!cl;)V")
	protected Class29(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class34 arg1) {
		this.aClass105_11 = arg0;
		this.aClass34_7 = arg1;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method3739(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method3748(-16777216, arg1);
		@Pc(31) double local31 = 7.0D - (double) arg4 / 8.0D;
		if (local31 < 0.0D) {
			local31 = 0.0D;
		}
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		for (@Pc(45) int local45 = 0; local45 < local40; local45++) {
			local43[local45] = (int) (Math.sin((double) arg0 + (double) local45 / 1.5D) * local31);
		}
		this.method3750(arg3, arg5, local43, null, null, null, arg2 - this.aClass34_7.method796(arg5) / 2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method3740(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			this.method3748(-1, arg2);
			this.method3751(arg3, null, null, 0, null, arg0, arg1 - this.aClass34_7.method796(arg0), 0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILjava/lang/String;[IIII[Lclient!cq;IILclient!ud;IIBII)I")
	public final int method3741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class8[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class15 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg2 == null) {
			return 0;
		}
		this.method3748(arg6, arg4);
		if (arg11 == 0) {
			arg11 = this.aClass34_7.anInt1008;
		}
		@Pc(51) int[] local51;
		if (arg12 < this.aClass34_7.anInt1017 + this.aClass34_7.anInt1003 + arg11 && arg12 < arg11 + arg11) {
			local51 = null;
		} else {
			local51 = new int[] { arg9 };
		}
		@Pc(69) int local69 = this.aClass34_7.method797(Static262.aStringArray19, arg2, local51, arg7);
		if (arg13 == 3 && local69 == 1) {
			arg13 = 1;
		}
		@Pc(90) int local90;
		@Pc(170) int local170;
		if (arg13 == 0) {
			local90 = arg1 + this.aClass34_7.anInt1003;
		} else if (arg13 == 1) {
			local90 = (arg12 - this.aClass34_7.anInt1003 - this.aClass34_7.anInt1017 - arg11 * (local69 + -1)) / 2 + this.aClass34_7.anInt1003 + arg1;
		} else if (arg13 == 2) {
			local90 = arg1 + arg12 - (local69 - 1) * arg11 - this.aClass34_7.anInt1017;
		} else {
			local170 = (arg12 - this.aClass34_7.anInt1017 - this.aClass34_7.anInt1003 - (local69 - 1) * arg11) / (local69 + 1);
			if (local170 < 0) {
				local170 = 0;
			}
			arg11 += local170;
			local90 = local170 + this.aClass34_7.anInt1003 + arg1;
		}
		for (local170 = 0; local170 < local69; local170++) {
			if (arg14 == 0) {
				this.method3751(local90, arg7, arg10, arg5, arg3, Static262.aStringArray19[local170], arg8, arg0);
			} else if (arg14 == 1) {
				this.method3751(local90, arg7, arg10, arg5, arg3, Static262.aStringArray19[local170], arg8 + (arg9 - this.aClass34_7.method796(Static262.aStringArray19[local170])) / 2, arg0);
			} else if (arg14 == 2) {
				this.method3751(local90, arg7, arg10, arg5, arg3, Static262.aStringArray19[local170], arg9 + arg8 - this.aClass34_7.method796(Static262.aStringArray19[local170]), arg0);
			} else if (local170 == local69 - 1) {
				this.method3751(local90, arg7, arg10, arg5, arg3, Static262.aStringArray19[local170], arg8, arg0);
			} else {
				this.method3749(Static262.aStringArray19[local170], arg9);
				this.method3751(local90, arg7, arg10, arg5, arg3, Static262.aStringArray19[local170], arg8, arg0);
				Static328.anInt484 = 0;
			}
			local90 += arg11;
		}
		return local69;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/lang/String;BI)V")
	public final void method3742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method3748(arg1, arg2);
			this.method3751(arg0, null, null, 0, null, arg3, arg4, 0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method3743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method3748(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3750(arg1, arg2, local19, null, null, null, arg3 - this.aClass34_7.method796(arg2) / 2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(CIIIZLclient!ud;II)V")
	protected abstract void method3744(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;BI[III[Lclient!cq;I)V")
	public final void method3745(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class8[] arg5, @OriginalArg(7) int arg6) {
		if (arg0 != null) {
			this.method3748(arg6, arg3);
			this.method3751(arg4, arg5, null, 0, arg2, arg0, arg1 - this.aClass34_7.method796(arg0) / 2, 0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method3746(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			this.method3748(arg3, arg4);
			this.method3751(arg2, null, null, 0, null, arg1, arg0 - this.aClass34_7.method796(arg1) / 2, 0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII[Lclient!cq;I[IILjava/lang/String;)V")
	public final void method3747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		if (arg6 != null) {
			this.method3748(arg5, arg3);
			this.method3751(arg1, arg2, null, 0, arg4, arg6, arg0 - this.aClass34_7.method796(arg6), 0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
	private void method3748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static16.anInt325 = 0;
		Static189.anInt6105 = -1;
		Static197.anInt4152 = -1;
		Static328.anInt484 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static326.anInt5669 = arg1;
		Static111.anInt2139 = arg1;
		Static182.anInt3807 = arg0;
		Static213.anInt4529 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method3749(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
			@Pc(30) char local30 = arg0.charAt(local11);
			if (local30 == '<') {
				local9 = true;
			} else if (local30 == '>') {
				local9 = false;
			} else if (!local9 && local30 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static328.anInt484 = (arg1 - this.aClass34_7.method796(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;[I[I[Lclient!cq;[IZI)V")
	private void method3750(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class8[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg0 - this.aClass34_7.anInt1008;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static331.method3176(arg1.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local19 = local28;
			} else {
				@Pc(121) int local121;
				@Pc(133) int local133;
				if (local39 == '>' && local19 != -1) {
					@Pc(63) String local63 = arg1.substring(local19 + 1, local28);
					local19 = -1;
					if (local63.equals("lt")) {
						local39 = '<';
					} else if (local63.equals("gt")) {
						local39 = '>';
					} else if (local63.equals("nbsp")) {
						local39 = ' ';
					} else if (local63.equals("shy")) {
						local39 = '\u00ad';
					} else if (local63.equals("times")) {
						local39 = '×';
					} else if (local63.equals("euro")) {
						local39 = '€';
					} else if (local63.equals("copy")) {
						local39 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local121 = 0;
									} else {
										local121 = arg3[local23];
									}
									if (arg2 == null) {
										local133 = 0;
									} else {
										local133 = arg2[local23];
									}
									local23++;
									@Pc(144) int local144 = Static38.method2707(local63.substring(4));
									@Pc(148) Class8 local148 = arg4[local144];
									@Pc(157) int local157 = arg5 == null ? local148.method4395() : arg5[local144];
									local148.method4394(arg6 + local121, local17 + this.aClass34_7.anInt1008 + -local157 + local133, 0, 0);
									local21 = -1;
									arg6 += arg4[local144].method4381();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method3755(local63);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local19 == -1) {
					if (local21 != -1) {
						arg6 += this.aClass34_7.method788(local39, local21);
					}
					@Pc(229) int local229;
					if (arg3 == null) {
						local229 = 0;
					} else {
						local229 = arg3[local23];
					}
					if (arg2 == null) {
						local121 = 0;
					} else {
						local121 = arg2[local23];
					}
					local23++;
					if (local39 != ' ') {
						if ((Static213.anInt4529 & 0xFF000000) != 0) {
							this.method3760(local39, local229 + arg6 + 1, local121 + 1 + local17, Static213.anInt4529, true);
						}
						this.method3760(local39, arg6 + local229, local121 + local17, Static111.anInt2139, false);
					} else if (Static328.anInt484 > 0) {
						Static16.anInt325 += Static328.anInt484;
						arg6 += Static16.anInt325 >> 8;
						Static16.anInt325 &= 0xFF;
					}
					local133 = this.aClass34_7.method787(local39);
					if (Static189.anInt6105 != -1) {
						this.aClass105_11.method4248(arg6, Static189.anInt6105, (int) ((double) this.aClass34_7.anInt1008 * 0.7D) + local17, local133);
					}
					if (Static197.anInt4152 != -1) {
						this.aClass105_11.method4248(arg6, Static197.anInt4152, this.aClass34_7.anInt1008 + local17, local133);
					}
					local21 = local39;
					arg6 += local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[Lclient!cq;Lclient!ud;I[IZLjava/lang/String;II)V")
	private void method3751(@OriginalArg(0) int arg0, @OriginalArg(1) Class8[] arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg0 - this.aClass34_7.anInt1008;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg5.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(33) char local33 = (char) (Static331.method3176(arg5.charAt(local20)) & 0xFF);
			if (local33 == '<') {
				local13 = local20;
			} else {
				if (local33 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg5.substring(local13 + 1, local20);
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
									@Pc(117) int local117 = Static38.method2707(local55.substring(4));
									@Pc(121) Class8 local121 = arg1[local117];
									@Pc(130) int local130 = arg4 == null ? local121.method4395() : arg4[local117];
									if ((Static111.anInt2139 & 0xFF000000) == -16777216) {
										local121.method4394(arg6, local7 + this.aClass34_7.anInt1008 - local130, 0, 0);
									} else {
										local121.method4394(arg6, this.aClass34_7.anInt1008 + local7 - local130, 1, Static111.anInt2139 & 0xFF000000 | 0xFFFFFF);
									}
									arg6 += arg1[local117].method4381();
									local15 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else {
								this.method3755(local55);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass34_7.method788(local33, local15);
					}
					if (local33 == ' ') {
						if (Static328.anInt484 > 0) {
							Static16.anInt325 += Static328.anInt484;
							arg6 += Static16.anInt325 >> 8;
							Static16.anInt325 &= 0xFF;
						}
					} else if (arg2 == null) {
						if ((Static213.anInt4529 & 0xFF000000) != 0) {
							this.method3760(local33, arg6 + 1, local7 - -1, Static213.anInt4529, true);
						}
						this.method3760(local33, arg6, local7, Static111.anInt2139, false);
					} else {
						if ((Static213.anInt4529 & 0xFF000000) != 0) {
							this.method3744(local33, arg6 + 1, local7 + 1, Static213.anInt4529, true, arg2, arg3, arg7);
						}
						this.method3744(local33, arg6, local7, Static111.anInt2139, false, arg2, arg3, arg7);
					}
					@Pc(306) int local306 = this.aClass34_7.method787(local33);
					if (Static189.anInt6105 != -1) {
						this.aClass105_11.method4248(arg6, Static189.anInt6105, (int) ((double) this.aClass34_7.anInt1008 * 0.7D) + local7, local306);
					}
					if (Static197.anInt4152 != -1) {
						this.aClass105_11.method4248(arg6, Static197.anInt4152, this.aClass34_7.anInt1008 + local7 + 1, local306);
					}
					arg6 += local306;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII[ILjava/lang/String;[Lclient!cq;I)V")
	public final void method3754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class8[] arg5, @OriginalArg(7) int arg6) {
		if (arg4 != null) {
			this.method3748(arg6, arg0);
			this.method3751(arg2, arg5, null, 0, arg3, arg4, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3755(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static111.anInt2139 = Static111.anInt2139 & 0xFF000000 | Static310.method5335(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static111.anInt2139 = Static326.anInt5669 & 0xFFFFFF | Static111.anInt2139 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static111.anInt2139 = Static310.method5335(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static111.anInt2139 = Static326.anInt5669;
			} else if (arg0.startsWith("str=")) {
				Static189.anInt6105 = Static310.method5335(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static189.anInt6105 = -8388608;
			} else if (arg0.equals("/str")) {
				Static189.anInt6105 = -1;
			} else if (arg0.startsWith("u=")) {
				Static197.anInt4152 = Static310.method5335(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static197.anInt4152 = -16777216;
			} else if (arg0.equals("/u")) {
				Static197.anInt4152 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static213.anInt4529 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static213.anInt4529 = Static310.method5335(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static213.anInt4529 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static213.anInt4529 = Static182.anInt3807;
			} else if (arg0.equals("br")) {
				this.method3748(Static182.anInt3807, Static326.anInt5669);
			}
		} catch (@Pc(165) Exception local165) {
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;IIZIII)V")
	public final void method3756(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3748(-16777216, arg3);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(45) int local45 = 0; local45 < local16; local45++) {
			local19[local45] = (int) (Math.sin((double) arg4 / 5.0D + (double) local45 / 5.0D) * 5.0D);
			local22[local45] = (int) (Math.sin((double) arg4 / 5.0D + (double) local45 / 3.0D) * 5.0D);
		}
		this.method3750(arg1, arg0, local22, local19, null, null, arg2 - this.aClass34_7.method796(arg0) / 2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/util/Random;[Lclient!cq;Ljava/lang/String;Z[III)I")
	public final int method3758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) Class8[] arg3, @OriginalArg(5) String arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg2.setSeed((long) arg0);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method3748((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg4.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method3750(arg6, arg4, null, local43, arg3, arg5, arg1);
		return local45;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([Lclient!cq;I[IIILjava/lang/String;IIILjava/util/Random;IIII[I)I")
	public final int method3759(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Random arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg5 == null) {
			return 0;
		}
		arg8.setSeed((long) arg1);
		@Pc(33) int local33 = (arg8.nextInt() & 0x1F) + 192;
		this.method3748(arg9 & 0xFFFFFF | local33 << 24, arg4 & 0xFFFFFF | local33 << 24);
		@Pc(53) int local53 = arg5.length();
		@Pc(56) int[] local56 = new int[local53];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local53; local60++) {
			local56[local60] = local58;
			if ((arg8.nextInt() & 0x3) == 0) {
				local58++;
			}
		}
		@Pc(78) int local78 = arg10;
		@Pc(85) int local85 = arg3 + this.aClass34_7.anInt1003;
		@Pc(87) int local87 = -1;
		if (arg6 == 1) {
			local85 += (arg11 - this.aClass34_7.anInt1003 - this.aClass34_7.anInt1017) / 2;
		} else if (arg6 == 2) {
			local85 = arg3 + arg11 - this.aClass34_7.anInt1017;
		}
		if (arg12 == 1) {
			local87 = local58 + this.aClass34_7.method796(arg5);
			local78 = arg10 + (arg7 - local87) / 2;
		} else if (arg12 == 2) {
			local87 = local58 + this.aClass34_7.method796(arg5);
			local78 = arg10 + arg7 - local87;
		}
		this.method3750(local85, arg5, null, local56, arg0, arg2, local78);
		if (arg13 != null) {
			if (local87 == -1) {
				local87 = this.aClass34_7.method796(arg5) + local58;
			}
			arg13[2] = local87;
			arg13[0] = local78;
			arg13[1] = local85 - this.aClass34_7.anInt1003;
			arg13[3] = this.aClass34_7.anInt1003 + this.aClass34_7.anInt1017;
		}
		return local58;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method3760(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
