import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class45 {

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!ll;")
	private final Class198 aClass198_9;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!r;")
	private final Class7 aClass7_13;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!ll;)V")
	protected Class45(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class198 arg1) {
		this.aClass198_9 = arg1;
		this.aClass7_13 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBIIILjava/lang/String;)V")
	public final void method4834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method4842(-16777216, arg3);
		@Pc(20) double local20 = 7.0D - (double) arg2 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg5.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) local34 / 1.5D + (double) arg4) * local20);
		}
		this.method4835(arg5, local32, null, null, arg1, null, arg0 - this.aClass198_9.method4769(arg5) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;[I[Lclient!f;[II[IIB)V")
	private void method4835(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class88[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg4 - this.aClass198_9.anInt6044;
		@Pc(13) int local13 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static220.method7179(arg0.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local13 = local30;
			} else {
				@Pc(126) int local126;
				@Pc(136) int local136;
				if (local41 == '>' && local13 != -1) {
					@Pc(62) String local62 = arg0.substring(local13 + 1, local30);
					local13 = -1;
					if (local62.equals("lt")) {
						local41 = '<';
					} else if (local62.equals("gt")) {
						local41 = '>';
					} else if (local62.equals("nbsp")) {
						local41 = ' ';
					} else if (local62.equals("shy")) {
						local41 = '\u00ad';
					} else if (local62.equals("times")) {
						local41 = '×';
					} else if (local62.equals("euro")) {
						local41 = '€';
					} else if (local62.equals("copy")) {
						local41 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local126 = 0;
									} else {
										local126 = arg5[local25];
									}
									if (arg1 == null) {
										local136 = 0;
									} else {
										local136 = arg1[local25];
									}
									local25++;
									@Pc(149) int local149 = Static393.method6016(local62.substring(4));
									@Pc(153) Class88 local153 = arg2[local149];
									@Pc(162) int local162 = arg3 == null ? local153.ca() : arg3[local149];
									local153.V(arg6 + local126, -local162 + this.aClass198_9.anInt6044 + local7 - -local136, 1, 0, 1);
									arg6 += arg2[local149].A();
									local23 = -1;
								} catch (@Pc(192) Exception local192) {
								}
							} else {
								this.method4848(local62);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local13 == -1) {
					if (local23 != -1) {
						arg6 += this.aClass198_9.method4764(local23, local41);
					}
					@Pc(229) int local229;
					if (arg5 == null) {
						local229 = 0;
					} else {
						local229 = arg5[local25];
					}
					if (arg1 == null) {
						local126 = 0;
					} else {
						local126 = arg1[local25];
					}
					local25++;
					if (local41 != ' ') {
						if ((Static380.anInt7471 & 0xFF000000) != 0) {
							this.OA(local41, arg6 + local229 + 1, local7 + 1 + local126, Static380.anInt7471, true);
						}
						this.OA(local41, local229 + arg6, local7 + local126, Static32.anInt1170, false);
					} else if (Static214.anInt4501 > 0) {
						Static224.anInt4662 += Static214.anInt4501;
						arg6 += Static224.anInt4662 >> 8;
						Static224.anInt4662 &= 0xFF;
					}
					local136 = this.aClass198_9.method4765(local41);
					if (Static50.anInt1333 != -1) {
						this.aClass7_13.method7809((int) ((double) this.aClass198_9.anInt6044 * 0.7D) + local7, local136, Static50.anInt1333, arg6);
					}
					if (Static66.anInt1735 != -1) {
						this.aClass7_13.method7809(local7 + this.aClass198_9.anInt6044, local136, Static66.anInt1735, arg6);
					}
					arg6 += local136;
					local23 = local41;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IBII)V")
	public final void method4836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method4842(-16777216, arg3);
		@Pc(24) int local24 = arg2.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4835(arg2, local27, null, null, arg1, null, arg0 - this.aClass198_9.method4769(arg2) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIIIILclient!ua;IIIIILjava/lang/String;III[Lclient!f;)I")
	public final int method4837(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class67 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class88[] arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method4842(arg9, arg4);
		if (arg3 == 0) {
			arg3 = this.aClass198_9.anInt6044;
		}
		@Pc(44) int[] local44;
		if (arg3 + this.aClass198_9.anInt6043 + this.aClass198_9.anInt6045 > arg2 && arg3 + arg3 > arg2) {
			local44 = null;
		} else {
			local44 = new int[] { arg12 };
		}
		@Pc(64) int local64 = this.aClass198_9.method4763(arg15, Static139.aStringArray10, local44, arg11);
		if (arg7 == -1) {
			arg7 = arg2 / arg3;
			if (arg7 <= 0) {
				arg7 = 1;
			}
		}
		if (arg7 > 0 && local64 >= arg7) {
			Static139.aStringArray10[arg7 - 1] = this.aClass198_9.method4768(arg12, Static139.aStringArray10[arg7 - 1], arg15);
			local64 = arg7;
		}
		if (arg10 == 3 && local64 == 1) {
			arg10 = 1;
		}
		@Pc(151) int local151;
		@Pc(178) int local178;
		if (arg10 == 0) {
			local151 = this.aClass198_9.anInt6043 + arg1;
		} else if (arg10 == 1) {
			local151 = this.aClass198_9.anInt6043 + arg1 + (-((local64 - 1) * arg3) + (-this.aClass198_9.anInt6045 + arg2 - this.aClass198_9.anInt6043)) / 2;
		} else if (arg10 == 2) {
			local151 = arg2 + arg1 - this.aClass198_9.anInt6045 - arg3 * (local64 + -1);
		} else {
			local178 = (arg2 - (local64 - 1) * arg3 - this.aClass198_9.anInt6043 - this.aClass198_9.anInt6045) / (local64 - -1);
			if (local178 < 0) {
				local178 = 0;
			}
			local151 = this.aClass198_9.anInt6043 + arg1 + local178;
			arg3 += local178;
		}
		for (local178 = 0; local178 < local64; local178++) {
			if (arg5 == 0) {
				this.method4838(Static139.aStringArray10[local178], arg13, arg8, arg14, local151, arg15, arg6, arg0);
			} else if (arg5 == 1) {
				this.method4838(Static139.aStringArray10[local178], arg13 + (arg12 - this.aClass198_9.method4769(Static139.aStringArray10[local178])) / 2, arg8, arg14, local151, arg15, arg6, arg0);
			} else if (arg5 == 2) {
				this.method4838(Static139.aStringArray10[local178], arg12 + arg13 - this.aClass198_9.method4769(Static139.aStringArray10[local178]), arg8, arg14, local151, arg15, arg6, arg0);
			} else if (local64 - 1 == local178) {
				this.method4838(Static139.aStringArray10[local178], arg13, arg8, arg14, local151, arg15, arg6, arg0);
			} else {
				this.method4840(Static139.aStringArray10[local178], arg12);
				this.method4838(Static139.aStringArray10[local178], arg13, arg8, arg14, local151, arg15, arg6, arg0);
				Static214.anInt4501 = 0;
			}
			local151 += arg3;
		}
		return local64;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIZ[Lclient!f;Lclient!ua;[I)V")
	private void method4838(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class88[] arg5, @OriginalArg(7) Class67 arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg4 - this.aClass198_9.anInt6044;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static220.method7179(arg0.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(54) String local54 = arg0.substring(local13 + 1, local20);
					local13 = -1;
					if (local54.equals("lt")) {
						local31 = '<';
					} else if (local54.equals("gt")) {
						local31 = '>';
					} else if (local54.equals("nbsp")) {
						local31 = ' ';
					} else if (local54.equals("shy")) {
						local31 = '\u00ad';
					} else if (local54.equals("times")) {
						local31 = '×';
					} else if (local54.equals("euro")) {
						local31 = '€';
					} else if (local54.equals("copy")) {
						local31 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(118) int local118 = Static393.method6016(local54.substring(4));
									@Pc(122) Class88 local122 = arg5[local118];
									@Pc(131) int local131 = arg7 == null ? local122.ca() : arg7[local118];
									if ((Static32.anInt1170 & -16777216) == -16777216) {
										local122.V(arg1, local7 + this.aClass198_9.anInt6044 - local131, 1, 0, 1);
									} else {
										local122.V(arg1, local7 + this.aClass198_9.anInt6044 - local131, 0, Static32.anInt1170 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg1 += arg5[local118].A();
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method4848(local54);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass198_9.method4764(local15, local31);
					}
					if (local31 == ' ') {
						if (Static214.anInt4501 > 0) {
							Static224.anInt4662 += Static214.anInt4501;
							arg1 += Static224.anInt4662 >> 8;
							Static224.anInt4662 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static380.anInt7471 & 0xFF000000) != 0) {
							this.OA(local31, arg1 + 1, local7 + 1, Static380.anInt7471, true);
						}
						this.OA(local31, arg1, local7, Static32.anInt1170, false);
					} else {
						if ((Static380.anInt7471 & 0xFF000000) != 0) {
							this.method4844(local31, arg1 + 1, local7 + 1, Static380.anInt7471, true, arg6, arg3, arg2);
						}
						this.method4844(local31, arg1, local7, Static32.anInt1170, false, arg6, arg3, arg2);
					}
					@Pc(306) int local306 = this.aClass198_9.method4765(local31);
					if (Static50.anInt1333 != -1) {
						this.aClass7_13.method7809(local7 + (int) ((double) this.aClass198_9.anInt6044 * 0.7D), local306, Static50.anInt1333, arg1);
					}
					if (Static66.anInt1735 != -1) {
						this.aClass7_13.method7809(this.aClass198_9.anInt6044 + local7 + 1, local306, Static66.anInt1735, arg1);
					}
					local15 = local31;
					arg1 += local306;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!f;IBILjava/util/Random;[IILjava/lang/String;II)I")
	public final int method4839(@OriginalArg(0) Class88[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Random arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5, @OriginalArg(8) int arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg2.setSeed((long) arg6);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method4842((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4835(arg5, null, arg0, arg3, arg1, local43, arg4);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method4840(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; arg0.length() > local16; local16++) {
			@Pc(22) char local22 = arg0.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local12++;
			}
		}
		if (local12 > 0) {
			Static214.anInt4501 = (arg1 - this.aClass198_9.method4769(arg0) << 8) / local12;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method4842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static19.anInt951 = arg1;
		Static32.anInt1170 = arg1;
		Static214.anInt4501 = 0;
		Static224.anInt4662 = 0;
		Static50.anInt1333 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static66.anInt1735 = -1;
		Static455.anInt8657 = arg0;
		Static380.anInt7471 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;III)V")
	public final void method4843(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4842(arg2, arg3);
			this.method4838(arg1, arg0, 0, 0, arg4, null, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method4844(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class67 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([II[IIIIILjava/lang/String;ILjava/util/Random;[Lclient!f;BIII)I")
	public final int method4845(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) Class88[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg9.setSeed((long) arg3);
		@Pc(20) int local20 = (arg9.nextInt() & 0x1F) + 192;
		this.method4842(local20 << 24 | arg13 & 0xFFFFFF, local20 << 24 | arg6 & 0xFFFFFF);
		@Pc(48) int local48 = arg7.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg9.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(77) int local77 = arg11;
		@Pc(83) int local83 = this.aClass198_9.anInt6043 + arg8;
		if (arg4 == 1) {
			local83 += (arg12 - this.aClass198_9.anInt6045 - this.aClass198_9.anInt6043) / 2;
		} else if (arg4 == 2) {
			local83 = arg12 + arg8 - this.aClass198_9.anInt6045;
		}
		@Pc(121) int local121 = -1;
		if (arg1 == 1) {
			local121 = local53 + this.aClass198_9.method4769(arg7);
			local77 = arg11 + (arg5 - local121) / 2;
		} else if (arg1 == 2) {
			local121 = this.aClass198_9.method4769(arg7) + local53;
			local77 = arg11 + arg5 - local121;
		}
		this.method4835(arg7, null, arg10, arg0, local83, local51, local77);
		if (arg2 != null) {
			if (local121 == -1) {
				local121 = this.aClass198_9.method4769(arg7) + local53;
			}
			arg2[2] = local121;
			arg2[3] = this.aClass198_9.anInt6045 + this.aClass198_9.anInt6043;
			arg2[1] = local83 - this.aClass198_9.anInt6043;
			arg2[0] = local77;
		}
		return local53;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;[III[Lclient!f;BI)V")
	public final void method4846(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class88[] arg5) {
		if (arg1 != null) {
			this.method4842(0, arg4);
			this.method4838(arg1, arg3, 0, 0, arg0, arg5, null, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4848(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static32.anInt1170 = Static32.anInt1170 & 0xFF000000 | Static228.method3711(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static32.anInt1170 = Static32.anInt1170 & 0xFF000000 | Static19.anInt951 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static32.anInt1170 = Static228.method3711(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static32.anInt1170 = Static19.anInt951;
			} else if (arg0.startsWith("str=")) {
				Static50.anInt1333 = Static32.anInt1170 & 0xFF000000 | Static228.method3711(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static50.anInt1333 = Static32.anInt1170 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static50.anInt1333 = -1;
			} else if (arg0.startsWith("u=")) {
				Static66.anInt1735 = Static32.anInt1170 & 0xFF000000 | Static228.method3711(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static66.anInt1735 = Static32.anInt1170 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static66.anInt1735 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static380.anInt7471 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static380.anInt7471 = Static32.anInt1170 & 0xFF000000 | Static228.method3711(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static380.anInt7471 = Static32.anInt1170 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static380.anInt7471 = Static455.anInt8657;
			} else if (arg0.equals("br")) {
				this.method4842(Static455.anInt8657, Static19.anInt951);
			}
		} catch (@Pc(179) Exception local179) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
	public final void method4849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method4842(arg3, arg0);
			this.method4838(arg4, arg1 - this.aClass198_9.method4769(arg4) / 2, 0, 0, arg2, null, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4842(-16777216, arg0);
		@Pc(18) int local18 = arg1.length();
		@Pc(27) int[] local27 = new int[local18];
		@Pc(30) int[] local30 = new int[local18];
		for (@Pc(32) int local32 = 0; local32 < local18; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4835(arg1, local30, null, null, arg3, local27, arg2 - this.aClass198_9.method4769(arg1) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[ILclient!ua;IIBIIIIIILjava/lang/String;I[Lclient!f;I)I")
	public final int method4852(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class88[] arg13, @OriginalArg(15) int arg14) {
		return this.method4837(arg1, arg8, arg3, arg6, arg10, arg0, arg2, 0, arg5, arg7, arg12, arg11, arg9, arg14, arg4, arg13);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method4853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method4842(arg3, arg0);
			this.method4838(arg4, arg2 - this.aClass198_9.method4769(arg4), 0, 0, arg1, null, null, null);
		}
	}
}
