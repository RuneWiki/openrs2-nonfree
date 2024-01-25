import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class63 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!r;")
	private final Class31 aClass31_13;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!ufa;")
	private final Class328 aClass328_11;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!ufa;)V")
	protected Class63(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass31_13 = arg0;
		this.aClass328_11 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIILjava/lang/String;I)V")
	public final void method6876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method6890(-16777216, arg0);
		@Pc(22) int local22 = arg3.length();
		@Pc(25) int[] local25 = new int[local22];
		@Pc(28) int[] local28 = new int[local22];
		for (@Pc(30) int local30 = 0; local30 < local22; local30++) {
			local25[local30] = (int) (Math.sin((double) local30 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method6891(local25, arg4, arg3, local28, arg2 - this.aClass328_11.method7371(arg3) / 2, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!f;II[II)V")
	public final void method6877(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class73[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (arg0 != null) {
			this.method6890(0, arg1);
			this.method6880(null, arg3, arg0, arg2, 0, arg5, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public final void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null) {
			this.method6890(arg1, arg2);
			this.method6880(null, null, arg3, arg0, 0, null, 0, arg4 - this.aClass328_11.method7371(arg3) / 2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
	public final void method6879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method6890(arg1, arg3);
			this.method6880(null, null, arg4, arg0, 0, null, 0, arg2 - this.aClass328_11.method7371(arg4));
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ua;[Lclient!f;Ljava/lang/String;III[III)V")
	private void method6880(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class73[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg3 - this.aClass328_11.anInt9400;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg2.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(37) char local37 = (char) (Static411.method5771(arg2.charAt(local20)) & 0xFF);
			if (local37 == '<') {
				local13 = local20;
			} else {
				if (local37 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg2.substring(local13 + 1, local20);
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
									@Pc(123) int local123 = Static406.method5727(local59.substring(4));
									@Pc(127) Class73 local127 = arg1[local123];
									@Pc(136) int local136 = arg5 == null ? local127.ca() : arg5[local123];
									if ((Static378.anInt6563 & -16777216) == -16777216) {
										local127.V(arg7, this.aClass328_11.anInt9400 + local11 - local136, 1, 0, 1);
									} else {
										local127.V(arg7, local11 + this.aClass328_11.anInt9400 - local136, 0, Static378.anInt6563 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg7 += arg1[local123].A();
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method6887(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg7 += this.aClass328_11.method7372(local37, local15);
					}
					if (local37 == ' ') {
						if (Static93.anInt2349 > 0) {
							Static495.anInt8598 += Static93.anInt2349;
							arg7 += Static495.anInt8598 >> 8;
							Static495.anInt8598 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static70.anInt1960 & 0xFF000000) != 0) {
							this.OA(local37, arg7 + 1, local11 + 1, Static70.anInt1960, true);
						}
						this.OA(local37, arg7, local11, Static378.anInt6563, false);
					} else {
						if ((Static70.anInt1960 & 0xFF000000) != 0) {
							this.method6896(local37, arg7 + 1, local11 + 1, Static70.anInt1960, true, arg0, arg6, arg4);
						}
						this.method6896(local37, arg7, local11, Static378.anInt6563, false, arg0, arg6, arg4);
					}
					@Pc(303) int local303 = this.aClass328_11.method7375(local37);
					if (Static22.anInt217 != -1) {
						this.aClass31_13.method8042(Static22.anInt217, local303, arg7, (int) ((double) this.aClass328_11.anInt9400 * 0.7D) + local11);
					}
					if (Static82.anInt9715 != -1) {
						this.aClass31_13.method8042(Static82.anInt9715, local303, arg7, local11 + this.aClass328_11.anInt9400 + 1);
					}
					local15 = local37;
					arg7 += local303;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
	public final void method6881(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method6890(arg1, arg3);
			this.method6880(null, null, arg0, arg4, 0, null, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[IILjava/lang/String;IIIIIILclient!ua;[Lclient!f;I)I")
	public final int method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class53 arg12, @OriginalArg(14) Class73[] arg13, @OriginalArg(15) int arg14) {
		return this.method6894(arg1, arg8, arg6, arg7, arg10, arg14, arg11, arg0, arg2, arg5, arg3, 0, arg12, arg13, arg4, arg9);
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IILjava/lang/String;II[Lclient!f;ILjava/util/Random;I)I")
	public final int method6884(@OriginalArg(1) int[] arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class73[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Random arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg6.setSeed((long) arg2);
		@Pc(21) int local21 = (arg6.nextInt() & 0x1F) + 192;
		this.method6890((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg1.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local44[local53] = local51;
			if ((arg6.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method6891(local44, arg5, arg1, null, arg3, arg4, arg0);
		return local51;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method6885(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
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
			Static93.anInt2349 = (arg0 - this.aClass328_11.method7371(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZILjava/lang/String;IIII)V")
	public final void method6886(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method6890(-16777216, arg2);
		@Pc(20) double local20 = 7.0D - (double) arg0 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg1.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) arg5 + (double) local34 / 1.5D) * local20);
		}
		this.method6891(null, arg4, arg1, local32, arg3 - this.aClass328_11.method7371(arg1) / 2, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method6887(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static378.anInt6563 = Static378.anInt6563 & 0xFF000000 | Static435.method6012(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static378.anInt6563 = Static378.anInt6563 & 0xFF000000 | Static374.anInt6505 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static378.anInt6563 = Static435.method6012(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static378.anInt6563 = Static374.anInt6505;
			} else if (arg0.startsWith("str=")) {
				Static22.anInt217 = Static378.anInt6563 & 0xFF000000 | Static435.method6012(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static22.anInt217 = Static378.anInt6563 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static22.anInt217 = -1;
			} else if (arg0.startsWith("u=")) {
				Static82.anInt9715 = Static378.anInt6563 & 0xFF000000 | Static435.method6012(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static82.anInt9715 = Static378.anInt6563 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static82.anInt9715 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static70.anInt1960 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static70.anInt1960 = Static378.anInt6563 & 0xFF000000 | Static435.method6012(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static70.anInt1960 = Static378.anInt6563 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static70.anInt1960 = Static189.anInt4100;
			} else if (arg0.equals("br")) {
				this.method6890(Static189.anInt4100, Static374.anInt6505);
			}
		} catch (@Pc(196) Exception local196) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method6889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method6890(-16777216, arg1);
		@Pc(24) int local24 = arg4.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method6891(null, arg2, arg4, local27, arg0 - this.aClass328_11.method7371(arg4) / 2, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method6890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static82.anInt9715 = -1;
		Static495.anInt8598 = 0;
		Static374.anInt6505 = arg1;
		Static378.anInt6563 = arg1;
		Static22.anInt217 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static93.anInt2349 = 0;
		Static189.anInt4100 = arg0;
		Static70.anInt1960 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;[II[Lclient!f;I[I)V")
	private void method6891(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class73[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg1 - this.aClass328_11.anInt9400;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = arg2.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static411.method5771(arg2.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				@Pc(122) int local122;
				@Pc(130) int local130;
				if (local38 == '>' && local13 != -1) {
					@Pc(62) String local62 = arg2.substring(local13 + 1, local27);
					local13 = -1;
					if (local62.equals("lt")) {
						local38 = '<';
					} else if (local62.equals("gt")) {
						local38 = '>';
					} else if (local62.equals("nbsp")) {
						local38 = ' ';
					} else if (local62.equals("shy")) {
						local38 = '\u00ad';
					} else if (local62.equals("times")) {
						local38 = '×';
					} else if (local62.equals("euro")) {
						local38 = '€';
					} else if (local62.equals("copy")) {
						local38 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local122 = 0;
									} else {
										local122 = arg0[local17];
									}
									if (arg3 == null) {
										local130 = 0;
									} else {
										local130 = arg3[local17];
									}
									local17++;
									@Pc(143) int local143 = Static406.method5727(local62.substring(4));
									@Pc(147) Class73 local147 = arg5[local143];
									@Pc(156) int local156 = arg6 == null ? local147.ca() : arg6[local143];
									local147.V(arg4 + local122, local130 + -local156 + local7 + this.aClass328_11.anInt9400, 1, 0, 1);
									local15 = -1;
									arg4 += arg5[local143].A();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method6887(local62);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass328_11.method7372(local38, local15);
					}
					@Pc(228) int local228;
					if (arg0 == null) {
						local228 = 0;
					} else {
						local228 = arg0[local17];
					}
					if (arg3 == null) {
						local122 = 0;
					} else {
						local122 = arg3[local17];
					}
					local17++;
					if (local38 != ' ') {
						if ((Static70.anInt1960 & 0xFF000000) != 0) {
							this.OA(local38, arg4 + local228 + 1, local7 + 1 + local122, Static70.anInt1960, true);
						}
						this.OA(local38, arg4 + local228, local7 + local122, Static378.anInt6563, false);
					} else if (Static93.anInt2349 > 0) {
						Static495.anInt8598 += Static93.anInt2349;
						arg4 += Static495.anInt8598 >> 8;
						Static495.anInt8598 &= 0xFF;
					}
					local130 = this.aClass328_11.method7375(local38);
					if (Static22.anInt217 != -1) {
						this.aClass31_13.method8042(Static22.anInt217, local130, arg4, (int) ((double) this.aClass328_11.anInt9400 * 0.7D) + local7);
					}
					if (Static82.anInt9715 != -1) {
						this.aClass31_13.method8042(Static82.anInt9715, local130, arg4, this.aClass328_11.anInt9400 + local7);
					}
					arg4 += local130;
					local15 = local38;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIII[IIIILjava/util/Random;IIILjava/lang/String;[Lclient!f;)I")
	public final int method6892(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Random arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) Class73[] arg13) {
		if (arg12 == null) {
			return 0;
		}
		arg8.setSeed((long) arg9);
		@Pc(20) int local20 = (arg8.nextInt() & 0x1F) + 192;
		this.method6890(arg2 & 0xFFFFFF | local20 << 24, local20 << 24 | arg5 & 0xFFFFFF);
		@Pc(42) int local42 = arg12.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(57) int local57 = 0; local57 < local42; local57++) {
			local45[local57] = local47;
			if ((arg8.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		@Pc(75) int local75 = arg0;
		@Pc(81) int local81 = this.aClass328_11.anInt9395 + arg11;
		if (arg10 == 1) {
			local81 += (arg3 - this.aClass328_11.anInt9395 - this.aClass328_11.anInt9397) / 2;
		} else if (arg10 == 2) {
			local81 = arg3 + arg11 - this.aClass328_11.anInt9397;
		}
		@Pc(117) int local117 = -1;
		if (arg7 == 1) {
			local117 = local47 + this.aClass328_11.method7371(arg12);
			local75 = arg0 + (arg6 - local117) / 2;
		} else if (arg7 == 2) {
			local117 = local47 + this.aClass328_11.method7371(arg12);
			local75 = arg0 + arg6 - local117;
		}
		this.method6891(local45, local81, arg12, null, local75, arg13, arg1);
		if (arg4 != null) {
			if (local117 == -1) {
				local117 = local47 + this.aClass328_11.method7371(arg12);
			}
			arg4[1] = local81 - this.aClass328_11.anInt9395;
			arg4[3] = this.aClass328_11.anInt9395 + this.aClass328_11.anInt9397;
			arg4[0] = local75;
			arg4[2] = local117;
		}
		return local47;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIIIIIBIIILclient!ua;[Lclient!f;[II)I")
	public final int method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class53 arg12, @OriginalArg(14) Class73[] arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) int arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method6890(arg6, arg0);
		if (arg15 == 0) {
			arg15 = this.aClass328_11.anInt9400;
		}
		@Pc(45) int[] local45;
		if (this.aClass328_11.anInt9397 + this.aClass328_11.anInt9395 + arg15 > arg5 && arg15 + arg15 > arg5) {
			local45 = null;
		} else {
			local45 = new int[] { arg7 };
		}
		if (arg11 == -1) {
			arg11 = arg5 / arg15;
			if (arg11 <= 0) {
				arg11 = 1;
			}
		}
		@Pc(76) int local76 = this.aClass328_11.method7374(arg2, arg13, local45, Static451.aStringArray39);
		if (arg11 > 0 && local76 >= arg11) {
			local76 = arg11;
			Static451.aStringArray39[arg11 - 1] = this.aClass328_11.method7370(arg13, Static451.aStringArray39[arg11 - 1], arg7);
		}
		if (arg8 == 3 && local76 == 1) {
			arg8 = 1;
		}
		@Pc(130) int local130;
		@Pc(208) int local208;
		if (arg8 == 0) {
			local130 = arg9 + this.aClass328_11.anInt9395;
		} else if (arg8 == 1) {
			local130 = arg9 + this.aClass328_11.anInt9395 + (arg5 - this.aClass328_11.anInt9395 - this.aClass328_11.anInt9397 - arg15 * (local76 + -1)) / 2;
		} else if (arg8 == 2) {
			local130 = arg5 + arg9 - arg15 * (local76 - 1) - this.aClass328_11.anInt9397;
		} else {
			local208 = (arg5 - this.aClass328_11.anInt9397 - this.aClass328_11.anInt9395 - (local76 + -1) * arg15) / (local76 - -1);
			if (local208 < 0) {
				local208 = 0;
			}
			arg15 += local208;
			local130 = this.aClass328_11.anInt9395 + arg9 + local208;
		}
		for (local208 = 0; local208 < local76; local208++) {
			if (arg3 == 0) {
				this.method6880(arg12, arg13, Static451.aStringArray39[local208], local130, arg10, arg14, arg4, arg1);
			} else if (arg3 == 1) {
				this.method6880(arg12, arg13, Static451.aStringArray39[local208], local130, arg10, arg14, arg4, (arg7 - this.aClass328_11.method7371(Static451.aStringArray39[local208])) / 2 + arg1);
			} else if (arg3 == 2) {
				this.method6880(arg12, arg13, Static451.aStringArray39[local208], local130, arg10, arg14, arg4, arg7 + arg1 - this.aClass328_11.method7371(Static451.aStringArray39[local208]));
			} else if (local208 == local76 - 1) {
				this.method6880(arg12, arg13, Static451.aStringArray39[local208], local130, arg10, arg14, arg4, arg1);
			} else {
				this.method6885(arg7, Static451.aStringArray39[local208]);
				this.method6880(arg12, arg13, Static451.aStringArray39[local208], local130, arg10, arg14, arg4, arg1);
				Static93.anInt2349 = 0;
			}
			local130 += arg15;
		}
		return local76;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method6896(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
