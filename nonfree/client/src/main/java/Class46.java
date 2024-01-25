import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class46 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!gt;")
	private final Class89 aClass89_9;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!ya;")
	private final Class19 aClass19_38;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ya;Lclient!gt;)V")
	protected Class46(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class89 arg1) {
		this.aClass89_9 = arg1;
		this.aClass19_38 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5054(-16777216, arg4);
		@Pc(16) int local16 = arg2.length();
		@Pc(24) int[] local24 = new int[local16];
		@Pc(27) int[] local27 = new int[local16];
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			local24[local29] = (int) (Math.sin((double) arg3 / 5.0D + (double) local29 / 5.0D) * 5.0D);
			local27[local29] = (int) (Math.sin((double) arg3 / 5.0D + (double) local29 / 3.0D) * 5.0D);
		}
		this.method5052(null, arg0, arg1 - this.aClass89_9.method2340(arg2) / 2, arg2, local24, null, local27);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[I[Lclient!l;ILjava/util/Random;Ljava/lang/String;IIIII[II)I")
	public final int method5047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class57[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Random arg6, @OriginalArg(7) String arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg6.setSeed((long) arg2);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method5054(arg10 & 0xFFFFFF | local20 << 24, local20 << 24 | arg8 & 0xFFFFFF);
		@Pc(40) int local40 = arg7.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local45;
			if ((arg6.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(73) int local73 = arg5;
		@Pc(80) int local80 = arg13 + this.aClass89_9.anInt2783;
		@Pc(82) int local82 = -1;
		if (arg11 == 1) {
			local80 += (arg1 - this.aClass89_9.anInt2778 - this.aClass89_9.anInt2783) / 2;
		} else if (arg11 == 2) {
			local80 = arg13 + arg1 - this.aClass89_9.anInt2778;
		}
		if (arg0 == 1) {
			local82 = local45 + this.aClass89_9.method2340(arg7);
			local73 = arg5 + (arg9 - local82) / 2;
		} else if (arg0 == 2) {
			local82 = this.aClass89_9.method2340(arg7) + local45;
			local73 = arg5 + arg9 - local82;
		}
		this.method5052(arg3, local80, local73, arg7, local43, arg4, null);
		if (arg12 != null) {
			if (local82 == -1) {
				local82 = this.aClass89_9.method2340(arg7) + local45;
			}
			arg12[1] = local80 - this.aClass89_9.anInt2783;
			arg12[3] = this.aClass89_9.anInt2783 + this.aClass89_9.anInt2778;
			arg12[2] = local82;
			arg12[0] = local73;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lclient!l;[IZIIIIILjava/lang/String;IILclient!ma;II)I")
	public final int method5048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class57[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class145 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg10 == null) {
			return 0;
		}
		this.method5054(arg5, arg2);
		if (arg6 == 0) {
			arg6 = this.aClass89_9.anInt2786;
		}
		@Pc(44) int[] local44;
		if (arg1 < this.aClass89_9.anInt2778 + this.aClass89_9.anInt2783 + arg6 && arg1 < arg6 + arg6) {
			local44 = null;
		} else {
			local44 = new int[] { arg15 };
		}
		@Pc(57) int local57 = this.aClass89_9.method2339(arg3, local44, Static227.aStringArray17, arg10);
		if (arg12 == -1) {
			arg12 = arg1 / arg6;
			if (arg12 <= 0) {
				arg12 = 1;
			}
		}
		if (arg12 > 0 && arg12 <= local57) {
			Static227.aStringArray17[arg12 - 1] = this.aClass89_9.method2346(arg3, Static227.aStringArray17[arg12 - 1], arg15);
			local57 = arg12;
		}
		if (arg9 == 3 && local57 == 1) {
			arg9 = 1;
		}
		@Pc(111) int local111;
		@Pc(173) int local173;
		if (arg9 == 0) {
			local111 = this.aClass89_9.anInt2783 + arg11;
		} else if (arg9 == 1) {
			local111 = (arg1 - arg6 * (local57 - 1) - this.aClass89_9.anInt2778 - this.aClass89_9.anInt2783) / 2 + this.aClass89_9.anInt2783 + arg11;
		} else if (arg9 == 2) {
			local111 = arg1 + arg11 - (local57 - 1) * arg6 - this.aClass89_9.anInt2778;
		} else {
			local173 = (arg1 - arg6 * (local57 - 1) - this.aClass89_9.anInt2783 - this.aClass89_9.anInt2778) / (local57 - -1);
			if (local173 < 0) {
				local173 = 0;
			}
			local111 = arg11 + this.aClass89_9.anInt2783 + local173;
			arg6 += local173;
		}
		for (local173 = 0; local173 < local57; local173++) {
			if (arg14 == 0) {
				this.method5062(Static227.aStringArray17[local173], arg8, arg4, arg7, arg3, local111, arg13, arg0);
			} else if (arg14 == 1) {
				this.method5062(Static227.aStringArray17[local173], arg8, arg4, arg7, arg3, local111, arg13, arg0 + (arg15 - this.aClass89_9.method2340(Static227.aStringArray17[local173])) / 2);
			} else if (arg14 == 2) {
				this.method5062(Static227.aStringArray17[local173], arg8, arg4, arg7, arg3, local111, arg13, arg15 + arg0 - this.aClass89_9.method2340(Static227.aStringArray17[local173]));
			} else if (local173 == local57 - 1) {
				this.method5062(Static227.aStringArray17[local173], arg8, arg4, arg7, arg3, local111, arg13, arg0);
			} else {
				this.method5060(Static227.aStringArray17[local173], arg15);
				this.method5062(Static227.aStringArray17[local173], arg8, arg4, arg7, arg3, local111, arg13, arg0);
				Static182.anInt3495 = 0;
			}
			local111 += arg6;
		}
		return local57;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method5050(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5054(-16777216, arg0);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method5052(null, arg2, arg3 - this.aClass89_9.method2340(arg1) / 2, arg1, null, null, local19);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	protected abstract void method5051(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIILjava/lang/String;[I[Lclient!l;[I)V")
	private void method5052(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class57[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg1 - this.aClass89_9.anInt2786;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			@Pc(39) char local39 = (char) (Static153.method2605(arg3.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				@Pc(131) int local131;
				@Pc(141) int local141;
				if (local39 == '>' && local13 != -1) {
					@Pc(63) String local63 = arg3.substring(local13 + 1, local28);
					local13 = -1;
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
									if (arg4 == null) {
										local131 = 0;
									} else {
										local131 = arg4[local17];
									}
									if (arg6 == null) {
										local141 = 0;
									} else {
										local141 = arg6[local17];
									}
									local17++;
									@Pc(152) int local152 = Static198.method3113(local63.substring(4));
									@Pc(156) Class57 local156 = arg5[local152];
									@Pc(165) int local165 = arg0 == null ? local156.T() : arg0[local152];
									local156.r(local131 + arg2, -local165 + this.aClass89_9.anInt2786 + local7 - -local141, 1, 0, 1);
									local15 = -1;
									arg2 += arg5[local152].j();
								} catch (@Pc(195) Exception local195) {
								}
							} else {
								this.method5055(local63);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass89_9.method2341(local15, local39);
					}
					@Pc(231) int local231;
					if (arg4 == null) {
						local231 = 0;
					} else {
						local231 = arg4[local17];
					}
					if (arg6 == null) {
						local131 = 0;
					} else {
						local131 = arg6[local17];
					}
					if (local39 != ' ') {
						if ((Static382.anInt6447 & 0xFF000000) != 0) {
							this.OA(local39, local231 + arg2 + 1, local7 - -local131 + 1, Static382.anInt6447, true);
						}
						this.OA(local39, local231 + arg2, local7 - -local131, Static187.anInt3560, false);
					} else if (Static182.anInt3495 > 0) {
						Static344.anInt5913 += Static182.anInt3495;
						arg2 += Static344.anInt5913 >> 8;
						Static344.anInt5913 &= 0xFF;
					}
					local17++;
					local141 = this.aClass89_9.method2343(local39);
					if (Static305.anInt5387 != -1) {
						this.aClass19_38.method4256(local141, local7 + (int) ((double) this.aClass89_9.anInt2786 * 0.7D), arg2, Static305.anInt5387);
					}
					if (Static81.anInt1642 != -1) {
						this.aClass19_38.method4256(local141, local7 + this.aClass89_9.anInt2786, arg2, Static81.anInt1642);
					}
					arg2 += local141;
					local15 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;[Lclient!l;I[IILjava/lang/String;IIII)I")
	public final int method5053(@OriginalArg(0) Random arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg0.setSeed((long) arg3);
		@Pc(21) int local21 = (arg0.nextInt() & 0x1F) + 192;
		this.method5054((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg4.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg0.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method5052(arg2, arg6, arg5, arg4, local44, arg1, null);
		return local46;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)V")
	private void method5054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static182.anInt3495 = 0;
		Static81.anInt1642 = -1;
		Static344.anInt5913 = 0;
		Static305.anInt5387 = -1;
		Static123.anInt6260 = arg1;
		Static187.anInt3560 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static118.anInt2492 = arg0;
		Static382.anInt6447 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5055(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static187.anInt3560 = Static187.anInt3560 & 0xFF000000 | Static371.method4962(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static187.anInt3560 = Static123.anInt6260 & 0xFFFFFF | Static187.anInt3560 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static187.anInt3560 = Static371.method4962(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static187.anInt3560 = Static123.anInt6260;
			} else if (arg0.startsWith("str=")) {
				Static305.anInt5387 = Static371.method4962(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static305.anInt5387 = -8388608;
			} else if (arg0.equals("/str")) {
				Static305.anInt5387 = -1;
			} else if (arg0.startsWith("u=")) {
				Static81.anInt1642 = Static371.method4962(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static81.anInt1642 = -16777216;
			} else if (arg0.equals("/u")) {
				Static81.anInt1642 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static382.anInt6447 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static382.anInt6447 = Static371.method4962(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static382.anInt6447 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static382.anInt6447 = Static118.anInt2492;
			} else if (arg0.equals("br")) {
				this.method5054(Static118.anInt2492, Static123.anInt6260);
			}
		} catch (@Pc(173) Exception local173) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5054(arg3, arg1);
			this.method5062(arg4, 0, null, 0, null, arg2, null, arg0 - this.aClass89_9.method2340(arg4) / 2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B[II[Lclient!l;ILjava/lang/String;II)V")
	public final void method5057(@OriginalArg(1) int[] arg0, @OriginalArg(3) Class57[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method5054(0, arg2);
			this.method5062(arg3, 0, arg0, 0, arg1, arg5, null, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method5054(arg0, arg1);
			this.method5062(arg2, 0, null, 0, null, arg3, null, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;III)V")
	public final void method5059(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5054(-1, arg2);
			this.method5062(arg0, 0, null, 0, null, arg1, null, arg3 - this.aClass89_9.method2340(arg0));
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method5060(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
			@Pc(22) char local22 = arg0.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static182.anInt3495 = (arg1 - this.aClass89_9.method2340(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I[II[Lclient!l;IZLclient!ma;I)V")
	private void method5062(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class57[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class145 arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg5 - this.aClass89_9.anInt2786;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(39) char local39 = (char) (Static153.method2605(arg0.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				if (local39 == '>' && local13 != -1) {
					@Pc(61) String local61 = arg0.substring(local13 + 1, local28);
					local13 = -1;
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
									@Pc(127) int local127 = Static198.method3113(local61.substring(4));
									@Pc(131) Class57 local131 = arg4[local127];
									@Pc(140) int local140 = arg2 == null ? local131.T() : arg2[local127];
									if ((-16777216 & Static187.anInt3560) == -16777216) {
										local131.r(arg7, local7 + this.aClass89_9.anInt2786 - local140, 1, 0, 1);
									} else {
										local131.r(arg7, this.aClass89_9.anInt2786 + local7 - local140, 0, Static187.anInt3560 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg7 += arg4[local127].j();
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method5055(local61);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg7 += this.aClass89_9.method2341(local15, local39);
					}
					if (local39 == ' ') {
						if (Static182.anInt3495 > 0) {
							Static344.anInt5913 += Static182.anInt3495;
							arg7 += Static344.anInt5913 >> 8;
							Static344.anInt5913 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static382.anInt6447 & 0xFF000000) != 0) {
							this.OA(local39, arg7 + 1, local7 - -1, Static382.anInt6447, true);
						}
						this.OA(local39, arg7, local7, Static187.anInt3560, false);
					} else {
						if ((Static382.anInt6447 & 0xFF000000) != 0) {
							this.method5051(local39, arg7 + 1, local7 - -1, Static382.anInt6447, true, arg6, arg1, arg3);
						}
						this.method5051(local39, arg7, local7, Static187.anInt3560, false, arg6, arg1, arg3);
					}
					@Pc(308) int local308 = this.aClass89_9.method2343(local39);
					if (Static305.anInt5387 != -1) {
						this.aClass19_38.method4256(local308, (int) ((double) this.aClass89_9.anInt2786 * 0.7D) + local7, arg7, Static305.anInt5387);
					}
					if (Static81.anInt1642 != -1) {
						this.aClass19_38.method4256(local308, this.aClass89_9.anInt2786 + local7 + 1, arg7, Static81.anInt1642);
					}
					arg7 += local308;
					local15 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lclient!l;IILclient!ma;IIIIIIIILjava/lang/String;[I)I")
	public final int method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class145 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) String arg11, @OriginalArg(15) int[] arg12) {
		return this.method5048(arg6, arg7, arg9, arg2, arg12, arg0, 0, arg1, arg3, arg10, arg11, arg5, 0, arg4, 1, arg8);
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public final void method5064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method5054(-16777216, arg0);
		@Pc(21) double local21 = 7.0D - (double) arg5 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg2.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) local35 / 1.5D + (double) arg4) * local21);
		}
		this.method5052(null, arg1, arg3 - this.aClass89_9.method2340(arg2) / 2, arg2, null, null, local33);
	}
}
