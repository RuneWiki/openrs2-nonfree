import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class76 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!gf;")
	private final Class89 aClass89_8;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!za;")
	private final Class34 aClass34_10;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!za;Lclient!gf;)V")
	protected Class76(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class89 arg1) {
		this.aClass89_8 = arg1;
		this.aClass34_10 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method4575(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method4595(-16777216, arg1);
		@Pc(21) double local21 = 7.0D - (double) arg0 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg3.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) local35 / 1.5D + (double) arg2) * local21);
		}
		this.method4579(null, null, arg5, local33, arg4 - this.aClass89_8.method1995(arg3) / 2, arg3, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[Lclient!o;ILclient!ta;Ljava/lang/String;[I)V")
	private void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class104 arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg1 - this.aClass89_8.anInt2314;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg6.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static97.method1513(arg6.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg6.substring(local13 + 1, local20);
					local13 = -1;
					if (local56.equals("lt")) {
						local31 = '<';
					} else if (local56.equals("gt")) {
						local31 = '>';
					} else if (local56.equals("nbsp")) {
						local31 = ' ';
					} else if (local56.equals("shy")) {
						local31 = '\u00ad';
					} else if (local56.equals("times")) {
						local31 = '×';
					} else if (local56.equals("euro")) {
						local31 = '€';
					} else if (local56.equals("copy")) {
						local31 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									@Pc(110) int local110 = Static219.method3201(local56.substring(4));
									@Pc(114) Class6 local114 = arg3[local110];
									@Pc(123) int local123 = arg7 == null ? local114.Q() : arg7[local110];
									if ((-16777216 & Static448.anInt7429) == -16777216) {
										local114.W(arg4, local7 + this.aClass89_8.anInt2314 - local123, 1, 0, 1);
									} else {
										local114.W(arg4, local7 + this.aClass89_8.anInt2314 - local123, 0, Static448.anInt7429 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg4 += arg3[local110].RA();
									local15 = -1;
								} catch (@Pc(175) Exception local175) {
								}
							} else {
								this.method4592(local56);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass89_8.method1991(local31, local15);
					}
					if (local31 == ' ') {
						if (Static213.anInt259 > 0) {
							Static355.anInt6067 += Static213.anInt259;
							arg4 += Static355.anInt6067 >> 8;
							Static355.anInt6067 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static420.anInt7132 & 0xFF000000) != 0) {
							this.B(local31, arg4 + 1, local7 + 1, Static420.anInt7132, true);
						}
						this.B(local31, arg4, local7, Static448.anInt7429, false);
					} else {
						if ((Static420.anInt7132 & 0xFF000000) != 0) {
							this.method4580(local31, arg4 + 1, local7 + 1, Static420.anInt7132, true, arg5, arg2, arg0);
						}
						this.method4580(local31, arg4, local7, Static448.anInt7429, false, arg5, arg2, arg0);
					}
					@Pc(305) int local305 = this.aClass89_8.method1996(local31);
					if (Static323.anInt5530 != -1) {
						this.aClass34_10.method5731(arg4, local305, local7 + (int) ((double) this.aClass89_8.anInt2314 * 0.7D), Static323.anInt5530);
					}
					if (Static401.anInt6680 != -1) {
						this.aClass34_10.method5731(arg4, local305, local7 + this.aClass89_8.anInt2314 + 1, Static401.anInt6680);
					}
					arg4 += local305;
					local15 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([I[II[IIILjava/lang/String;[Lclient!o;)V")
	private void method4579(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class6[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass89_8.anInt2314;
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = arg5.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(45) char local45 = (char) (Static97.method1513(arg5.charAt(local34)) & 0xFF);
			if (local45 == '<') {
				local25 = local34;
			} else {
				@Pc(133) int local133;
				@Pc(143) int local143;
				if (local45 == '>' && local25 != -1) {
					@Pc(67) String local67 = arg5.substring(local25 + 1, local34);
					local25 = -1;
					if (local67.equals("lt")) {
						local45 = '<';
					} else if (local67.equals("gt")) {
						local45 = '>';
					} else if (local67.equals("nbsp")) {
						local45 = ' ';
					} else if (local67.equals("shy")) {
						local45 = '\u00ad';
					} else if (local67.equals("times")) {
						local45 = '×';
					} else if (local67.equals("euro")) {
						local45 = '€';
					} else if (local67.equals("copy")) {
						local45 = '©';
					} else {
						if (!local67.equals("reg")) {
							if (local67.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local133 = 0;
									} else {
										local133 = arg1[local29];
									}
									if (arg3 == null) {
										local143 = 0;
									} else {
										local143 = arg3[local29];
									}
									local29++;
									@Pc(156) int local156 = Static219.method3201(local67.substring(4));
									@Pc(160) Class6 local160 = arg6[local156];
									@Pc(169) int local169 = arg0 == null ? local160.Q() : arg0[local156];
									local160.W(local133 + arg4, local143 + -local169 + this.aClass89_8.anInt2314 + local7, 1, 0, 1);
									arg4 += arg6[local156].RA();
									local27 = -1;
								} catch (@Pc(198) Exception local198) {
								}
							} else {
								this.method4592(local67);
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local25 == -1) {
					if (local27 != -1) {
						arg4 += this.aClass89_8.method1991(local45, local27);
					}
					@Pc(235) int local235;
					if (arg1 == null) {
						local235 = 0;
					} else {
						local235 = arg1[local29];
					}
					if (arg3 == null) {
						local133 = 0;
					} else {
						local133 = arg3[local29];
					}
					if (local45 != ' ') {
						if ((Static420.anInt7132 & 0xFF000000) != 0) {
							this.B(local45, local235 + arg4 + 1, local7 + 1 + local133, Static420.anInt7132, true);
						}
						this.B(local45, arg4 + local235, local133 + local7, Static448.anInt7429, false);
					} else if (Static213.anInt259 > 0) {
						Static355.anInt6067 += Static213.anInt259;
						arg4 += Static355.anInt6067 >> 8;
						Static355.anInt6067 &= 0xFF;
					}
					local29++;
					local143 = this.aClass89_8.method1996(local45);
					if (Static323.anInt5530 != -1) {
						this.aClass34_10.method5731(arg4, local143, local7 + (int) ((double) this.aClass89_8.anInt2314 * 0.7D), Static323.anInt5530);
					}
					if (Static401.anInt6680 != -1) {
						this.aClass34_10.method5731(arg4, local143, local7 + this.aClass89_8.anInt2314, Static401.anInt6680);
					}
					local27 = local45;
					arg4 += local143;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	protected abstract void method4580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class104 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[I[Lclient!o;Ljava/lang/String;ILjava/util/Random;I)I")
	public final int method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class6[] arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Random arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg6.setSeed((long) arg5);
		@Pc(18) int local18 = (arg6.nextInt() & 0x1F) + 192;
		this.method4595((local18 | 0x0) << 24, local18 << 24 | 0xFFFFFF);
		@Pc(38) int local38 = arg4.length();
		@Pc(41) int[] local41 = new int[local38];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local38; local45++) {
			local41[local45] = local43;
			if ((arg6.nextInt() & 0x3) == 0) {
				local43++;
			}
		}
		this.method4579(arg2, local41, arg0, null, arg1, arg4, arg3);
		return local43;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method4583(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; local16 < arg1.length(); local16++) {
			@Pc(22) char local22 = arg1.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local12++;
			}
		}
		if (local12 > 0) {
			Static213.anInt259 = (arg0 - this.aClass89_8.method1995(arg1) << 8) / local12;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIIIIILjava/util/Random;[II[Lclient!o;Ljava/lang/String;III)I")
	public final int method4584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Random arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class6[] arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg6.setSeed((long) arg13);
		@Pc(25) int local25 = (arg6.nextInt() & 0x1F) + 192;
		this.method4595(arg5 & 0xFFFFFF | local25 << 24, arg2 & 0xFFFFFF | local25 << 24);
		@Pc(45) int local45 = arg10.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg6.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(77) int local77 = arg11;
		@Pc(83) int local83 = this.aClass89_8.anInt2308 + arg8;
		if (arg1 == 1) {
			local83 += (arg12 - this.aClass89_8.anInt2311 - this.aClass89_8.anInt2308) / 2;
		} else if (arg1 == 2) {
			local83 = arg12 + arg8 - this.aClass89_8.anInt2311;
		}
		@Pc(119) int local119 = -1;
		if (arg4 == 1) {
			local119 = local50 + this.aClass89_8.method1995(arg10);
			local77 = arg11 + (arg3 - local119) / 2;
		} else if (arg4 == 2) {
			local119 = this.aClass89_8.method1995(arg10) + local50;
			local77 = arg11 + arg3 - local119;
		}
		this.method4579(arg7, local48, local83, null, local77, arg10, arg9);
		if (arg0 != null) {
			if (local119 == -1) {
				local119 = this.aClass89_8.method1995(arg10) + local50;
			}
			arg0[1] = local83 - this.aClass89_8.anInt2308;
			arg0[0] = local77;
			arg0[3] = this.aClass89_8.anInt2308 + this.aClass89_8.anInt2311;
			arg0[2] = local119;
		}
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[II[Lclient!o;ILclient!ta;BIIIIILjava/lang/String;II)I")
	public final int method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class6[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class104 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) String arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method4590(arg8, arg10, arg11, arg7, arg4, arg2, 0, arg3, arg12, arg0, arg9, arg1, arg5, arg6, 1, 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method4586(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method4595(-1, arg3);
			this.method4576(0, arg2, 0, null, arg0 - this.aClass89_8.method1995(arg1), null, arg1, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIB)V")
	public final void method4587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method4595(arg0, arg3);
			this.method4576(0, arg1, 0, null, arg4, null, arg2, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBILjava/lang/String;I)V")
	public final void method4589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method4595(-16777216, arg0);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4579(null, null, arg1, local19, arg2 - this.aClass89_8.method1995(arg3) / 2, arg3, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;BIII[II[Lclient!o;IIIILclient!ta;III)I")
	public final int method4590(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class6[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class104 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg1 == null) {
			return 0;
		}
		this.method4595(arg13, arg8);
		if (arg15 == 0) {
			arg15 = this.aClass89_8.anInt2314;
		}
		@Pc(48) int[] local48;
		if (arg15 + this.aClass89_8.anInt2308 + this.aClass89_8.anInt2311 > arg9 && arg15 + arg15 > arg9) {
			local48 = null;
		} else {
			local48 = new int[] { arg3 };
		}
		if (arg6 == -1) {
			arg6 = arg9 / arg15;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		@Pc(81) int local81 = this.aClass89_8.method1993(arg7, local48, Static3.aStringArray40, arg1);
		if (arg6 > 0 && local81 >= arg6) {
			Static3.aStringArray40[arg6 - 1] = this.aClass89_8.method1986(arg3, arg7, Static3.aStringArray40[arg6 - 1]);
			local81 = arg6;
		}
		if (arg0 == 3 && local81 == 1) {
			arg0 = 1;
		}
		@Pc(155) int local155;
		@Pc(199) int local199;
		if (arg0 == 0) {
			local155 = arg2 + this.aClass89_8.anInt2308;
		} else if (arg0 == 1) {
			local155 = (arg9 - (local81 - 1) * arg15 - this.aClass89_8.anInt2308 - this.aClass89_8.anInt2311) / 2 + this.aClass89_8.anInt2308 + arg2;
		} else if (arg0 == 2) {
			local155 = arg9 + arg2 - this.aClass89_8.anInt2311 - arg15 * (local81 + -1);
		} else {
			local199 = (arg9 - this.aClass89_8.anInt2311 - this.aClass89_8.anInt2308 - arg15 * (local81 + -1)) / (local81 + 1);
			if (local199 < 0) {
				local199 = 0;
			}
			local155 = local199 + arg2 + this.aClass89_8.anInt2308;
			arg15 += local199;
		}
		for (local199 = 0; local199 < local81; local199++) {
			if (arg14 == 0) {
				this.method4576(arg10, local155, arg4, arg7, arg11, arg12, Static3.aStringArray40[local199], arg5);
			} else if (arg14 == 1) {
				this.method4576(arg10, local155, arg4, arg7, (arg3 - this.aClass89_8.method1995(Static3.aStringArray40[local199])) / 2 + arg11, arg12, Static3.aStringArray40[local199], arg5);
			} else if (arg14 == 2) {
				this.method4576(arg10, local155, arg4, arg7, arg11 + arg3 - this.aClass89_8.method1995(Static3.aStringArray40[local199]), arg12, Static3.aStringArray40[local199], arg5);
			} else if (local81 - 1 == local199) {
				this.method4576(arg10, local155, arg4, arg7, arg11, arg12, Static3.aStringArray40[local199], arg5);
			} else {
				this.method4583(arg3, Static3.aStringArray40[local199]);
				this.method4576(arg10, local155, arg4, arg7, arg11, arg12, Static3.aStringArray40[local199], arg5);
				Static213.anInt259 = 0;
			}
			local155 += arg15;
		}
		return local81;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!o;IIILjava/lang/String;[IBI)V")
	public final void method4591(@OriginalArg(0) Class6[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method4595(0, arg5);
			this.method4576(0, arg2, 0, arg0, arg1, null, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method4592(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static448.anInt7429 = Static448.anInt7429 & 0xFF000000 | Static194.method5865(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static448.anInt7429 = Static262.anInt4708 & 0xFFFFFF | Static448.anInt7429 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static448.anInt7429 = Static194.method5865(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static448.anInt7429 = Static262.anInt4708;
			} else if (arg0.startsWith("str=")) {
				Static323.anInt5530 = Static448.anInt7429 & 0xFF000000 | Static194.method5865(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static323.anInt5530 = Static448.anInt7429 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static323.anInt5530 = -1;
			} else if (arg0.startsWith("u=")) {
				Static401.anInt6680 = Static448.anInt7429 & 0xFF000000 | Static194.method5865(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static401.anInt6680 = Static448.anInt7429 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static401.anInt6680 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static420.anInt7132 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static420.anInt7132 = Static448.anInt7429 & 0xFF000000 | Static194.method5865(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static420.anInt7132 = Static448.anInt7429 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static420.anInt7132 = Static161.anInt2686;
			} else if (arg0.equals("br")) {
				this.method4595(Static161.anInt2686, Static262.anInt4708);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIIB)V")
	public final void method4593(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method4595(-16777216, arg3);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(26) int[] local26 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local19[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4579(null, local19, arg1, local26, arg2 - this.aClass89_8.method1995(arg0) / 2, arg0, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method4594(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method4595(arg0, arg1);
			this.method4576(0, arg4, 0, null, arg2 - this.aClass89_8.method1995(arg3) / 2, null, arg3, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)V")
	private void method4595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static355.anInt6067 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static262.anInt4708 = arg1;
		Static448.anInt7429 = arg1;
		Static213.anInt259 = 0;
		Static401.anInt6680 = -1;
		Static323.anInt5530 = -1;
		Static161.anInt2686 = arg0;
		Static420.anInt7132 = arg0;
	}
}
