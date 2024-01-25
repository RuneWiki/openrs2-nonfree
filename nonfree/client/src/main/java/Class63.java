import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class63 {

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!du;")
	private final Class57 aClass57_16;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!ya;")
	private final Class51 aClass51_11;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ya;Lclient!du;)V")
	protected Class63(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class57 arg1) {
		this.aClass57_16 = arg1;
		this.aClass51_11 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!l;Ljava/lang/String;IBI[I[I[I)V")
	private void method4570(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg2 - this.aClass57_16.anInt1599;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static20.method1886(arg1.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(119) int local119;
				@Pc(127) int local127;
				if (local33 == '>' && local13 != -1) {
					@Pc(53) String local53 = arg1.substring(local13 + 1, local22);
					local13 = -1;
					if (local53.equals("lt")) {
						local33 = '<';
					} else if (local53.equals("gt")) {
						local33 = '>';
					} else if (local53.equals("nbsp")) {
						local33 = ' ';
					} else if (local53.equals("shy")) {
						local33 = '\u00ad';
					} else if (local53.equals("times")) {
						local33 = '×';
					} else if (local53.equals("euro")) {
						local33 = '€';
					} else if (local53.equals("copy")) {
						local33 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local119 = 0;
									} else {
										local119 = arg6[local17];
									}
									if (arg5 == null) {
										local127 = 0;
									} else {
										local127 = arg5[local17];
									}
									local17++;
									@Pc(140) int local140 = Static259.method3459(local53.substring(4));
									@Pc(144) Class11 local144 = arg0[local140];
									@Pc(153) int local153 = arg4 == null ? local144.T() : arg4[local140];
									local144.r(local119 + arg3, local11 + this.aClass57_16.anInt1599 - local153 - -local127, 1, 0, 1);
									arg3 += arg0[local140].j();
									local15 = -1;
								} catch (@Pc(182) Exception local182) {
								}
							} else {
								this.method4576(local53);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass57_16.method1394(local33, local15);
					}
					@Pc(219) int local219;
					if (arg6 == null) {
						local219 = 0;
					} else {
						local219 = arg6[local17];
					}
					if (arg5 == null) {
						local119 = 0;
					} else {
						local119 = arg5[local17];
					}
					if (local33 != ' ') {
						if ((Static119.anInt2394 & 0xFF000000) != 0) {
							this.OA(local33, arg3 + local219 + 1, local119 + local11 - -1, Static119.anInt2394, true);
						}
						this.OA(local33, arg3 + local219, local119 + local11, Static237.anInt4076, false);
					} else if (Static354.anInt5673 > 0) {
						Static290.anInt4843 += Static354.anInt5673;
						arg3 += Static290.anInt4843 >> 8;
						Static290.anInt4843 &= 0xFF;
					}
					local17++;
					local127 = this.aClass57_16.method1391(local33);
					if (Static437.anInt1833 != -1) {
						this.aClass51_11.method5313(arg3, Static437.anInt1833, (int) ((double) this.aClass57_16.anInt1599 * 0.7D) + local11, local127);
					}
					if (Static150.anInt2820 != -1) {
						this.aClass51_11.method5313(arg3, Static150.anInt2820, local11 + this.aClass57_16.anInt1599, local127);
					}
					arg3 += local127;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/util/Random;I[IIII[Lclient!l;ILjava/lang/String;[IIII)I")
	public final int method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class11[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg2.setSeed((long) arg13);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method4573(local20 << 24 | arg0 & 0xFFFFFF, arg5 & 0xFFFFFF | local20 << 24);
		@Pc(42) int local42 = arg9.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg2.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		@Pc(70) int local70 = arg3;
		@Pc(76) int local76 = arg1 + this.aClass57_16.anInt1607;
		@Pc(78) int local78 = -1;
		if (arg11 == 1) {
			local76 += (arg6 - this.aClass57_16.anInt1596 - this.aClass57_16.anInt1607) / 2;
		} else if (arg11 == 2) {
			local76 = arg1 + arg6 - this.aClass57_16.anInt1596;
		}
		if (arg12 == 1) {
			local78 = local47 + this.aClass57_16.method1387(arg9);
			local70 = arg3 + (arg8 - local78) / 2;
		} else if (arg12 == 2) {
			local78 = this.aClass57_16.method1387(arg9) + local47;
			local70 = arg3 + arg8 - local78;
		}
		this.method4570(arg7, arg9, local76, local70, arg10, null, local45);
		if (arg4 != null) {
			if (local78 == -1) {
				local78 = local47 + this.aClass57_16.method1387(arg9);
			}
			arg4[2] = local78;
			arg4[0] = local70;
			arg4[1] = local76 - this.aClass57_16.anInt1607;
			arg4[3] = this.aClass57_16.anInt1596 + this.aClass57_16.anInt1607;
		}
		return local47;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method4573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static290.anInt4843 = 0;
		Static354.anInt5673 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static437.anInt1833 = -1;
		Static52.anInt901 = arg0;
		Static237.anInt4076 = arg0;
		Static150.anInt2820 = -1;
		Static14.anInt213 = arg1;
		Static119.anInt2394 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	protected abstract void method4575(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class119 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method4576(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static237.anInt4076 = Static237.anInt4076 & 0xFF000000 | Static35.method3787(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static237.anInt4076 = Static237.anInt4076 & 0xFF000000 | Static52.anInt901 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static237.anInt4076 = Static35.method3787(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static237.anInt4076 = Static52.anInt901;
			} else if (arg0.startsWith("str=")) {
				Static437.anInt1833 = Static237.anInt4076 & 0xFF000000 | Static35.method3787(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static437.anInt1833 = Static237.anInt4076 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static437.anInt1833 = -1;
			} else if (arg0.startsWith("u=")) {
				Static150.anInt2820 = Static237.anInt4076 & 0xFF000000 | Static35.method3787(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static150.anInt2820 = Static237.anInt4076 & 0xFF000000;
				return;
			} else if (arg0.equals("/u")) {
				Static150.anInt2820 = -1;
				return;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static119.anInt2394 = 0;
				return;
			} else if (arg0.startsWith("shad=")) {
				Static119.anInt2394 = Static237.anInt4076 & 0xFF000000 | Static35.method3787(arg0.substring(5));
				return;
			} else if (arg0.equals("shad")) {
				Static119.anInt2394 = Static237.anInt4076 & 0xFF000000;
				return;
			} else if (arg0.equals("/shad")) {
				Static119.anInt2394 = Static14.anInt213;
				return;
			} else if (arg0.equals("br")) {
				this.method4573(Static52.anInt901, Static14.anInt213);
				return;
			}
		} catch (@Pc(183) Exception local183) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method4573(arg0, -16777216);
		@Pc(37) int local37 = arg3.length();
		@Pc(40) int[] local40 = new int[local37];
		@Pc(43) int[] local43 = new int[local37];
		for (@Pc(45) int local45 = 0; local45 < local37; local45++) {
			local40[local45] = (int) (Math.sin((double) arg2 / 5.0D + (double) local45 / 5.0D) * 5.0D);
			local43[local45] = (int) (Math.sin((double) arg2 / 5.0D + (double) local45 / 3.0D) * 5.0D);
		}
		this.method4570(null, arg3, arg1, arg4 - this.aClass57_16.method1387(arg3) / 2, null, local43, local40);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method4579(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
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
			Static354.anInt5673 = (arg1 - this.aClass57_16.method1387(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!l;IBILjava/lang/String;IILclient!ma;[I)V")
	private void method4580(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class119 arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg5 - this.aClass57_16.anInt1599;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			@Pc(35) char local35 = (char) (Static20.method1886(arg3.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg3.substring(local13 + 1, local24);
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
									@Pc(118) int local118 = Static259.method3459(local60.substring(4));
									@Pc(122) Class11 local122 = arg0[local118];
									@Pc(131) int local131 = arg7 == null ? local122.T() : arg7[local118];
									if ((-16777216 & Static237.anInt4076) == -16777216) {
										local122.r(arg1, local7 + this.aClass57_16.anInt1599 - local131, 1, 0, 1);
									} else {
										local122.r(arg1, local7 + this.aClass57_16.anInt1599 - local131, 0, Static237.anInt4076 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg0[local118].j();
									local15 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method4576(local60);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass57_16.method1394(local35, local15);
					}
					if (local35 == ' ') {
						if (Static354.anInt5673 > 0) {
							Static290.anInt4843 += Static354.anInt5673;
							arg1 += Static290.anInt4843 >> 8;
							Static290.anInt4843 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static119.anInt2394 & 0xFF000000) != 0) {
							this.OA(local35, arg1 + 1, local7 + 1, Static119.anInt2394, true);
						}
						this.OA(local35, arg1, local7, Static237.anInt4076, false);
					} else {
						if ((Static119.anInt2394 & 0xFF000000) != 0) {
							this.method4575(local35, arg1 + 1, local7 + 1, Static119.anInt2394, true, arg6, arg4, arg2);
						}
						this.method4575(local35, arg1, local7, Static237.anInt4076, false, arg6, arg4, arg2);
					}
					@Pc(312) int local312 = this.aClass57_16.method1391(local35);
					if (Static437.anInt1833 != -1) {
						this.aClass51_11.method5313(arg1, Static437.anInt1833, local7 + (int) ((double) this.aClass57_16.anInt1599 * 0.7D), local312);
					}
					if (Static150.anInt2820 != -1) {
						this.aClass51_11.method5313(arg1, Static150.anInt2820, local7 + this.aClass57_16.anInt1599 + 1, local312);
					}
					arg1 += local312;
					local15 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method4573(arg2, arg0);
			this.method4580(null, arg4, 0, arg3, 0, arg1, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II[I[Lclient!l;ILjava/util/Random;)I")
	public final int method4582(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int[] arg3, @OriginalArg(7) Class11[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Random arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg6.setSeed((long) arg0);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method4573(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg1.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local45;
			if ((arg6.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4570(arg4, arg1, arg5, arg2, arg3, null, local43);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;[IIIILclient!ma;IIIIII[Lclient!l;II)I")
	public final int method4583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class119 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class11[] arg14, @OriginalArg(16) int arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method4573(arg12, arg11);
		if (arg10 == 0) {
			arg10 = this.aClass57_16.anInt1599;
		}
		@Pc(38) int[] local38;
		if (arg0 < this.aClass57_16.anInt1607 + this.aClass57_16.anInt1596 + arg10 && arg10 + arg10 > arg0) {
			local38 = null;
		} else {
			local38 = new int[] { arg8 };
		}
		@Pc(56) int local56 = this.aClass57_16.method1389(Static48.aStringArray3, local38, arg14, arg2);
		if (arg5 == -1) {
			arg5 = arg0 / arg10;
			if (arg5 <= 0) {
				arg5 = 1;
			}
		}
		if (arg5 > 0 && arg5 <= local56) {
			local56 = arg5;
			Static48.aStringArray3[arg5 - 1] = this.aClass57_16.method1385(arg14, arg8, Static48.aStringArray3[arg5 - 1]);
		}
		if (arg1 == 3 && local56 == 1) {
			arg1 = 1;
		}
		@Pc(114) int local114;
		@Pc(175) int local175;
		if (arg1 == 0) {
			local114 = this.aClass57_16.anInt1607 + arg6;
		} else if (arg1 == 1) {
			local114 = arg6 + this.aClass57_16.anInt1607 + (arg0 + -this.aClass57_16.anInt1607 + -this.aClass57_16.anInt1596 + -(arg10 * (local56 + -1))) / 2;
		} else if (arg1 == 2) {
			local114 = arg0 + arg6 - (local56 - 1) * arg10 - this.aClass57_16.anInt1596;
		} else {
			local175 = (arg0 - arg10 * (local56 - 1) - this.aClass57_16.anInt1596 - this.aClass57_16.anInt1607) / (local56 + 1);
			if (local175 < 0) {
				local175 = 0;
			}
			arg10 += local175;
			local114 = this.aClass57_16.anInt1607 + arg6 + local175;
		}
		for (local175 = 0; local175 < local56; local175++) {
			if (arg15 == 0) {
				this.method4580(arg14, arg4, arg9, Static48.aStringArray3[local175], arg13, local114, arg7, arg3);
			} else if (arg15 == 1) {
				this.method4580(arg14, (arg8 - this.aClass57_16.method1387(Static48.aStringArray3[local175])) / 2 + arg4, arg9, Static48.aStringArray3[local175], arg13, local114, arg7, arg3);
			} else if (arg15 == 2) {
				this.method4580(arg14, arg8 + arg4 - this.aClass57_16.method1387(Static48.aStringArray3[local175]), arg9, Static48.aStringArray3[local175], arg13, local114, arg7, arg3);
			} else if (local56 - 1 == local175) {
				this.method4580(arg14, arg4, arg9, Static48.aStringArray3[local175], arg13, local114, arg7, arg3);
			} else {
				this.method4579(Static48.aStringArray3[local175], arg8);
				this.method4580(arg14, arg4, arg9, Static48.aStringArray3[local175], arg13, local114, arg7, arg3);
				Static354.anInt5673 = 0;
			}
			local114 += arg10;
		}
		return local56;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method4584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method4573(arg2, -1);
			this.method4580(null, arg1 - this.aClass57_16.method1387(arg3), 0, arg3, 0, arg0, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method4585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method4573(arg1, arg0);
			this.method4580(null, arg3 - this.aClass57_16.method1387(arg2) / 2, 0, arg2, 0, arg4, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIII[Lclient!l;ILjava/lang/String;)V")
	public final void method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11[] arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method4573(arg2, 0);
			this.method4580(arg4, arg0, 0, arg5, 0, arg3, null, arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!l;IIIIIIBII[IIILclient!ma;ILjava/lang/String;)I")
	public final int method4587(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8, @OriginalArg(11) int arg9, @OriginalArg(13) Class119 arg10, @OriginalArg(14) int arg11, @OriginalArg(15) String arg12) {
		return this.method4583(arg3, arg4, arg12, arg8, arg11, 0, arg7, arg10, arg9, arg2, 0, arg1, arg5, arg6, arg0, 1);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method4588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method4573(arg1, -16777216);
		@Pc(18) int local18 = arg3.length();
		@Pc(21) int[] local21 = new int[local18];
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			local21[local29] = (int) (Math.sin((double) arg2 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method4570(null, arg3, arg0, arg4 - this.aClass57_16.method1387(arg3) / 2, null, local21, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method4589(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method4573(arg0, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg1 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(46) int local46 = 0; local46 < local30; local46++) {
			local33[local46] = (int) (local21 * Math.sin((double) arg2 + (double) local46 / 1.5D));
		}
		this.method4570(null, arg5, arg4, arg3 - this.aClass57_16.method1387(arg5) / 2, null, local33, null);
	}
}
