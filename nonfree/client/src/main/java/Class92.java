import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class92 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!kt;")
	private final Class141 aClass141_10;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!za;")
	private final Class163 aClass163_9;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!za;Lclient!kt;)V")
	protected Class92(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class141 arg1) {
		this.aClass141_10 = arg1;
		this.aClass163_9 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!o;ILjava/lang/String;[IIILclient!ta;B)V")
	private void method4501(@OriginalArg(0) int arg0, @OriginalArg(1) Class13[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class35 arg7) {
		@Pc(7) int local7 = arg0 - this.aClass141_10.anInt3615;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static409.method5179(arg3.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg3.substring(local13 + 1, local20);
					local13 = -1;
					if (local55.equals("lt")) {
						local31 = '<';
					} else if (local55.equals("gt")) {
						local31 = '>';
					} else if (local55.equals("nbsp")) {
						local31 = ' ';
					} else if (local55.equals("shy")) {
						local31 = '\u00ad';
					} else if (local55.equals("times")) {
						local31 = '×';
					} else if (local55.equals("euro")) {
						local31 = '€';
					} else if (local55.equals("copy")) {
						local31 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=")) {
								try {
									@Pc(115) int local115 = Static205.method2736(local55.substring(4));
									@Pc(119) Class13 local119 = arg1[local115];
									@Pc(128) int local128 = arg4 == null ? local119.Q() : arg4[local115];
									if ((Static106.anInt2010 & 0xFF000000) == -16777216) {
										local119.W(arg2, this.aClass141_10.anInt3615 + local7 - local128, 1, 0, 1);
									} else {
										local119.W(arg2, this.aClass141_10.anInt3615 + local7 - local128, 0, Static106.anInt2010 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg2 += arg1[local115].RA();
									local15 = -1;
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method4514(local55);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass141_10.method2907(local31, local15);
					}
					if (local31 == ' ') {
						if (Static445.anInt7138 > 0) {
							Static182.anInt3109 += Static445.anInt7138;
							arg2 += Static182.anInt3109 >> 8;
							Static182.anInt3109 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static443.anInt7117 & 0xFF000000) != 0) {
							this.B(local31, arg2 + 1, local7 - -1, Static443.anInt7117, true);
						}
						this.B(local31, arg2, local7, Static106.anInt2010, false);
					} else {
						if ((Static443.anInt7117 & 0xFF000000) != 0) {
							this.method4518(local31, arg2 + 1, local7 - -1, Static443.anInt7117, true, arg7, arg5, arg6);
						}
						this.method4518(local31, arg2, local7, Static106.anInt2010, false, arg7, arg5, arg6);
					}
					@Pc(302) int local302 = this.aClass141_10.method2913(local31);
					if (Static45.anInt811 != -1) {
						this.aClass163_9.method5543(local302, Static45.anInt811, local7 + (int) ((double) this.aClass141_10.anInt3615 * 0.7D), arg2);
					}
					if (Static93.anInt1804 != -1) {
						this.aClass163_9.method5543(local302, Static93.anInt1804, this.aClass141_10.anInt3615 + local7 + 1, arg2);
					}
					local15 = local31;
					arg2 += local302;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;IZI)V")
	public final void method4502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		if (arg4 == null) {
			return;
		}
		this.method4511(-16777216, arg3);
		@Pc(21) double local21 = 7.0D - (double) arg1 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(34) int local34 = arg4.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
			local37[local39] = (int) (local21 * Math.sin((double) arg2 + (double) local39 / 1.5D));
		}
		this.method4504(arg0, arg5 - this.aClass141_10.method2914(arg4) / 2, null, local37, null, arg4, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([II[Lclient!o;ILjava/lang/String;III)V")
	public final void method4503(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5) {
		if (arg4 != null) {
			this.method4511(0, arg3);
			this.method4501(arg5, arg2, arg1, arg4, arg0, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I[I[ILjava/lang/String;[Lclient!o;Z)V")
	private void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class13[] arg6) {
		@Pc(7) int local7 = arg0 - this.aClass141_10.anInt3615;
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg5.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static409.method5179(arg5.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				@Pc(118) int local118;
				@Pc(130) int local130;
				if (local37 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg5.substring(local13 + 1, local26);
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
									if (arg4 == null) {
										local118 = 0;
									} else {
										local118 = arg4[local21];
									}
									if (arg3 == null) {
										local130 = 0;
									} else {
										local130 = arg3[local21];
									}
									local21++;
									@Pc(141) int local141 = Static205.method2736(local60.substring(4));
									@Pc(145) Class13 local145 = arg6[local141];
									@Pc(154) int local154 = arg2 == null ? local145.Q() : arg2[local141];
									local145.W(arg1 + local118, local130 + local7 + this.aClass141_10.anInt3615 + -local154, 1, 0, 1);
									local19 = -1;
									arg1 += arg6[local141].RA();
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method4514(local60);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local19 != -1) {
						arg1 += this.aClass141_10.method2907(local37, local19);
					}
					@Pc(226) int local226;
					if (arg4 == null) {
						local226 = 0;
					} else {
						local226 = arg4[local21];
					}
					if (arg3 == null) {
						local118 = 0;
					} else {
						local118 = arg3[local21];
					}
					if (local37 != ' ') {
						if ((Static443.anInt7117 & 0xFF000000) != 0) {
							this.B(local37, arg1 + local226 + 1, local7 + 1 + local118, Static443.anInt7117, true);
						}
						this.B(local37, local226 + arg1, local7 - -local118, Static106.anInt2010, false);
					} else if (Static445.anInt7138 > 0) {
						Static182.anInt3109 += Static445.anInt7138;
						arg1 += Static182.anInt3109 >> 8;
						Static182.anInt3109 &= 0xFF;
					}
					local21++;
					local130 = this.aClass141_10.method2913(local37);
					if (Static45.anInt811 != -1) {
						this.aClass163_9.method5543(local130, Static45.anInt811, local7 + (int) ((double) this.aClass141_10.anInt3615 * 0.7D), arg1);
					}
					if (Static93.anInt1804 != -1) {
						this.aClass163_9.method5543(local130, Static93.anInt1804, local7 + this.aClass141_10.anInt3615, arg1);
					}
					arg1 += local130;
					local19 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!o;Ljava/lang/String;III[IIIILclient!ta;IIIIII)I")
	public final int method4505(@OriginalArg(0) int arg0, @OriginalArg(1) Class13[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class35 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method4511(arg3, arg6);
		if (arg13 == 0) {
			arg13 = this.aClass141_10.anInt3615;
		}
		@Pc(38) int[] local38;
		if (arg10 < arg13 + this.aClass141_10.anInt3614 + this.aClass141_10.anInt3623 && arg13 + arg13 > arg10) {
			local38 = null;
		} else {
			local38 = new int[] { arg14 };
		}
		if (arg8 == -1) {
			arg8 = arg10 / arg13;
			if (arg8 <= 0) {
				arg8 = 1;
			}
		}
		@Pc(68) int local68 = this.aClass141_10.method2910(arg1, local38, arg2, Static270.aStringArray27);
		if (arg8 > 0 && arg8 <= local68) {
			Static270.aStringArray27[arg8 - 1] = this.aClass141_10.method2911(arg14, Static270.aStringArray27[arg8 - 1], arg1);
			local68 = arg8;
		}
		if (arg12 == 3 && local68 == 1) {
			arg12 = 1;
		}
		@Pc(128) int local128;
		@Pc(152) int local152;
		if (arg12 == 0) {
			local128 = this.aClass141_10.anInt3623 + arg11;
		} else if (arg12 == 1) {
			local128 = arg11 + this.aClass141_10.anInt3623 + (arg10 - arg13 * (local68 - 1) - this.aClass141_10.anInt3623 - this.aClass141_10.anInt3614) / 2;
		} else if (arg12 == 2) {
			local128 = arg11 + arg10 - this.aClass141_10.anInt3614 - arg13 * (local68 + -1);
		} else {
			local152 = (arg10 - this.aClass141_10.anInt3623 - this.aClass141_10.anInt3614 - (local68 + -1) * arg13) / (local68 + 1);
			if (local152 < 0) {
				local152 = 0;
			}
			local128 = arg11 + this.aClass141_10.anInt3623 + local152;
			arg13 += local152;
		}
		for (local152 = 0; local152 < local68; local152++) {
			if (arg4 == 0) {
				this.method4501(local128, arg1, arg7, Static270.aStringArray27[local152], arg5, arg0, arg15, arg9);
			} else if (arg4 == 1) {
				this.method4501(local128, arg1, arg7 + (arg14 - this.aClass141_10.method2914(Static270.aStringArray27[local152])) / 2, Static270.aStringArray27[local152], arg5, arg0, arg15, arg9);
			} else if (arg4 == 2) {
				this.method4501(local128, arg1, arg7 + arg14 - this.aClass141_10.method2914(Static270.aStringArray27[local152]), Static270.aStringArray27[local152], arg5, arg0, arg15, arg9);
			} else if (local68 - 1 == local152) {
				this.method4501(local128, arg1, arg7, Static270.aStringArray27[local152], arg5, arg0, arg15, arg9);
			} else {
				this.method4509(Static270.aStringArray27[local152], arg14);
				this.method4501(local128, arg1, arg7, Static270.aStringArray27[local152], arg5, arg0, arg15, arg9);
				Static445.anInt7138 = 0;
			}
			local128 += arg13;
		}
		return local68;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!o;I[IILjava/lang/String;ILjava/util/Random;IBI)I")
	public final int method4506(@OriginalArg(0) Class13[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg4.setSeed((long) arg5);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method4511((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg3.length();
		@Pc(48) int[] local48 = new int[local40];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local48[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method4504(arg2, arg6, arg1, null, local48, arg3, arg0);
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIII[Lclient!o;IILjava/util/Random;I[II[I)I")
	public final int method4507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class13[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Random arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg10.setSeed((long) arg12);
		@Pc(20) int local20 = (arg10.nextInt() & 0x1F) + 192;
		this.method4511(arg0 & 0xFFFFFF | local20 << 24, local20 << 24 | arg4 & 0xFFFFFF);
		@Pc(40) int local40 = arg2.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local40; local55++) {
			local43[local55] = local53;
			if ((arg10.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(77) int local77 = arg5;
		@Pc(83) int local83 = this.aClass141_10.anInt3623 + arg8;
		@Pc(85) int local85 = -1;
		if (arg3 == 1) {
			local83 += (arg6 - this.aClass141_10.anInt3614 - this.aClass141_10.anInt3623) / 2;
		} else if (arg3 == 2) {
			local83 = arg8 + arg6 - this.aClass141_10.anInt3614;
		}
		if (arg9 == 1) {
			local85 = local53 + this.aClass141_10.method2914(arg2);
			local77 = arg5 + (arg1 - local85) / 2;
		} else if (arg9 == 2) {
			local85 = this.aClass141_10.method2914(arg2) + local53;
			local77 = arg5 + arg1 - local85;
		}
		this.method4504(local83, local77, arg11, null, local43, arg2, arg7);
		if (arg13 != null) {
			if (local85 == -1) {
				local85 = this.aClass141_10.method2914(arg2) + local53;
			}
			arg13[3] = this.aClass141_10.anInt3623 + this.aClass141_10.anInt3614;
			arg13[0] = local77;
			arg13[2] = local85;
			arg13[1] = local83 - this.aClass141_10.anInt3623;
		}
		return local53;
	}

	@OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method4509(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
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
			Static445.anInt7138 = (arg1 - this.aClass141_10.method2914(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static93.anInt1804 = -1;
		Static45.anInt811 = -1;
		Static415.anInt6794 = arg1;
		Static106.anInt2010 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static182.anInt3109 = 0;
		Static445.anInt7138 = 0;
		Static149.anInt2625 = arg0;
		Static443.anInt7117 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method4512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method4511(arg4, arg3);
			this.method4501(arg0, null, arg1, arg2, null, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method4511(-16777216, arg1);
		@Pc(24) int local24 = arg4.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method4504(arg0, arg3 - this.aClass141_10.method2914(arg4) / 2, null, local27, null, arg4, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4514(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static106.anInt2010 = Static106.anInt2010 & 0xFF000000 | Static209.method2806(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static106.anInt2010 = Static415.anInt6794 & 0xFFFFFF | Static106.anInt2010 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static106.anInt2010 = Static209.method2806(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static106.anInt2010 = Static415.anInt6794;
			} else if (arg0.startsWith("str=")) {
				Static45.anInt811 = Static106.anInt2010 & 0xFF000000 | Static209.method2806(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static45.anInt811 = Static106.anInt2010 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static45.anInt811 = -1;
			} else if (arg0.startsWith("u=")) {
				Static93.anInt1804 = Static106.anInt2010 & 0xFF000000 | Static209.method2806(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static93.anInt1804 = Static106.anInt2010 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static93.anInt1804 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static443.anInt7117 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static443.anInt7117 = Static106.anInt2010 & 0xFF000000 | Static209.method2806(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static443.anInt7117 = Static106.anInt2010 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static443.anInt7117 = Static149.anInt2625;
			} else if (arg0.equals("br")) {
				this.method4511(Static149.anInt2625, Static415.anInt6794);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4511(arg2, arg0);
			this.method4501(arg3, null, arg4 - this.aClass141_10.method2914(arg1) / 2, arg1, null, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBLjava/lang/String;III)V")
	public final void method4516(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4511(-16777216, arg2);
		@Pc(20) int local20 = arg1.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method4504(arg3, arg4 - this.aClass141_10.method2914(arg1) / 2, null, local26, local23, arg1, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ta;IIIIIIII[Lclient!o;[IIILjava/lang/String;II)I")
	public final int method4517(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class13[] arg7, @OriginalArg(10) int[] arg8, @OriginalArg(11) int arg9, @OriginalArg(13) String arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method4505(arg6, arg7, arg10, arg12, 1, arg8, arg9, arg2, 0, arg0, arg11, arg3, arg5, 0, arg1, arg4);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	protected abstract void method4518(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class35 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;III)V")
	public final void method4519(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method4511(-1, arg3);
			this.method4501(arg2, null, arg1 - this.aClass141_10.method2914(arg0), arg0, null, 0, 0, null);
		}
	}
}
