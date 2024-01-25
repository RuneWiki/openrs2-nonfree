import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class38 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!ie;")
	private final Class158 aClass158_13;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!ha;")
	private final Class137 aClass137_45;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!ie;)V")
	protected Class38(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class158 arg1) {
		this.aClass158_13 = arg1;
		this.aClass137_45 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method8977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method8996(-16777216, arg1);
		@Pc(21) double local21 = 7.0D - (double) arg5 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg3.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (local21 * Math.sin((double) arg0 + (double) local35 / 1.5D));
		}
		this.method8979(arg4, arg3, local33, arg2 - this.aClass158_13.method3601(arg3) / 2, (int[]) null, (int[]) null, (Class20[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method8978(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; arg1.length() > local16; local16++) {
			@Pc(22) char local22 = arg1.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static182.anInt3496 = (arg0 - this.aClass158_13.method3601(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;[II[II[I[Lclient!jd;)V")
	private void method8979(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class20[] arg6) {
		@Pc(7) int local7 = arg0 - this.aClass158_13.anInt4348;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(37) char local37 = (char) (Static591.method8411(arg1.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				@Pc(120) int local120;
				@Pc(130) int local130;
				if (local37 == '>' && local13 != -1) {
					@Pc(58) String local58 = arg1.substring(local13 + 1, local26);
					local13 = -1;
					if (local58.equals("lt")) {
						local37 = '<';
					} else if (local58.equals("gt")) {
						local37 = '>';
					} else if (local58.equals("nbsp")) {
						local37 = ' ';
					} else if (local58.equals("shy")) {
						local37 = '\u00ad';
					} else if (local58.equals("times")) {
						local37 = '×';
					} else if (local58.equals("euro")) {
						local37 = '€';
					} else if (local58.equals("copy")) {
						local37 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local120 = 0;
									} else {
										local120 = arg5[local17];
									}
									if (arg2 == null) {
										local130 = 0;
									} else {
										local130 = arg2[local17];
									}
									local17++;
									@Pc(143) int local143 = Static235.method3555(local58.substring(4));
									@Pc(147) Class20 local147 = arg6[local143];
									@Pc(156) int local156 = arg4 == null ? local147.method7408() : arg4[local143];
									local147.method7402(local120 + arg3, local130 + -local156 + (local7 - -this.aClass158_13.anInt4348), 1, 0, 1);
									local15 = -1;
									arg3 += arg6[local143].method7394();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method8980(local58);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass158_13.method3602(local37, local15);
					}
					@Pc(224) int local224;
					if (arg5 == null) {
						local224 = 0;
					} else {
						local224 = arg5[local17];
					}
					if (arg2 == null) {
						local120 = 0;
					} else {
						local120 = arg2[local17];
					}
					local17++;
					if (local37 != ' ') {
						if ((Static102.anInt2165 & 0xFF000000) != 0) {
							this.fa(local37, arg3 + local224 + 1, local120 + 1 + local7, Static102.anInt2165, true);
						}
						this.fa(local37, arg3 + local224, local120 + local7, Static87.anInt1952, false);
					} else if (Static182.anInt3496 > 0) {
						Static309.anInt1948 += Static182.anInt3496;
						arg3 += Static309.anInt1948 >> 8;
						Static309.anInt1948 &= 0xFF;
					}
					local130 = this.aClass158_13.method3606(local37);
					if (Static548.anInt9335 != -1) {
						this.aClass137_45.method7891(local130, (int) ((double) this.aClass158_13.anInt4348 * 0.7D) + local7, Static548.anInt9335, arg3);
					}
					if (Static557.anInt9472 != -1) {
						this.aClass137_45.method7891(local130, local7 + this.aClass158_13.anInt4348, Static557.anInt9472, arg3);
					}
					arg3 += local130;
					local15 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method8980(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static87.anInt1952 = Static87.anInt1952 & 0xFF000000 | Static310.method4520(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static87.anInt1952 = Static176.anInt3423 & 0xFFFFFF | Static87.anInt1952 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static87.anInt1952 = Static310.method4520(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static87.anInt1952 = Static176.anInt3423;
			} else if (arg0.startsWith("str=")) {
				Static548.anInt9335 = Static87.anInt1952 & 0xFF000000 | Static310.method4520(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static548.anInt9335 = Static87.anInt1952 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static548.anInt9335 = -1;
			} else if (arg0.startsWith("u=")) {
				Static557.anInt9472 = Static87.anInt1952 & 0xFF000000 | Static310.method4520(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static557.anInt9472 = Static87.anInt1952 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static557.anInt9472 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static102.anInt2165 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static102.anInt2165 = Static87.anInt1952 & 0xFF000000 | Static310.method4520(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static102.anInt2165 = Static87.anInt1952 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static102.anInt2165 = Static308.anInt5376;
			} else if (arg0.equals("br")) {
				this.method8996(Static308.anInt5376, Static176.anInt3423);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/util/Random;[Lclient!jd;[IZILjava/lang/String;III)I")
	public final int method8981(@OriginalArg(1) Random arg0, @OriginalArg(2) Class20[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg0.setSeed((long) arg5);
		@Pc(25) int local25 = (arg0.nextInt() & 0x1F) + 192;
		this.method8996((local25 | 0x0) << 24, local25 << 24 | 0xFFFFFF);
		@Pc(45) int local45 = arg4.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg0.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method8979(arg6, arg4, (int[]) null, arg3, arg2, local48, arg1);
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;I[Lclient!jd;I[ILjava/util/Random;IIIII[II)I")
	public final int method8983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Random arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg6.setSeed((long) arg0);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method8996(arg13 & 0xFFFFFF | local20 << 24, arg8 & 0xFFFFFF | local20 << 24);
		@Pc(42) int local42 = arg2.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg6.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		@Pc(71) int local71 = arg1;
		@Pc(77) int local77 = this.aClass158_13.anInt4354 + arg3;
		@Pc(79) int local79 = -1;
		if (arg9 == 1) {
			local77 += (arg11 - this.aClass158_13.anInt4347 - this.aClass158_13.anInt4354) / 2;
		} else if (arg9 == 2) {
			local77 = arg3 + arg11 - this.aClass158_13.anInt4347;
		}
		if (arg7 == 1) {
			local79 = local47 + this.aClass158_13.method3601(arg2);
			local71 = arg1 + (arg10 - local79) / 2;
		} else if (arg7 == 2) {
			local79 = local47 + this.aClass158_13.method3601(arg2);
			local71 = arg1 + arg10 - local79;
		}
		this.method8979(local77, arg2, (int[]) null, local71, arg5, local45, arg4);
		if (arg12 != null) {
			if (local79 == -1) {
				local79 = this.aClass158_13.method3601(arg2) + local47;
			}
			arg12[2] = local79;
			arg12[3] = this.aClass158_13.anInt4354 + this.aClass158_13.anInt4347;
			arg12[1] = local77 - this.aClass158_13.anInt4354;
			arg12[0] = local71;
		}
		return local47;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;BIIII)V")
	public final void method8985(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method8996(arg2, arg1);
			this.method8987((Class20[]) null, (int[]) null, 0, arg0, arg4, (Class1) null, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8986(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!jd;[IILjava/lang/String;ILclient!aa;IBI)V")
	private void method8987(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(25) int local25 = arg6 - this.aClass158_13.anInt4348;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(32) int local32 = arg3.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(45) char local45 = (char) (Static591.method8411(arg3.charAt(local34)) & 0xFF);
			if (local45 == '<') {
				local27 = local34;
			} else {
				if (local45 == '>' && local27 != -1) {
					@Pc(67) String local67 = arg3.substring(local27 + 1, local34);
					local27 = -1;
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
									@Pc(125) int local125 = Static235.method3555(local67.substring(4));
									@Pc(129) Class20 local129 = arg0[local125];
									@Pc(138) int local138 = arg1 == null ? local129.method7408() : arg1[local125];
									if ((Static87.anInt1952 & 0xFF000000) == -16777216) {
										local129.method7402(arg4, this.aClass158_13.anInt4348 + local25 - local138, 1, 0, 1);
									} else {
										local129.method7402(arg4, this.aClass158_13.anInt4348 + local25 - local138, 0, Static87.anInt1952 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg4 += arg0[local125].method7394();
									local29 = -1;
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method8980(local67);
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local27 == -1) {
					if (local29 != -1) {
						arg4 += this.aClass158_13.method3602(local45, local29);
					}
					if (local45 == ' ') {
						if (Static182.anInt3496 > 0) {
							Static309.anInt1948 += Static182.anInt3496;
							arg4 += Static309.anInt1948 >> 8;
							Static309.anInt1948 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static102.anInt2165 & 0xFF000000) != 0) {
							this.fa(local45, arg4 + 1, local25 + 1, Static102.anInt2165, true);
						}
						this.fa(local45, arg4, local25, Static87.anInt1952, false);
					} else {
						if ((Static102.anInt2165 & 0xFF000000) != 0) {
							this.method8986(local45, arg4 + 1, local25 + 1, Static102.anInt2165, true, arg5, arg2, arg7);
						}
						this.method8986(local45, arg4, local25, Static87.anInt1952, false, arg5, arg2, arg7);
					}
					@Pc(314) int local314 = this.aClass158_13.method3606(local45);
					if (Static548.anInt9335 != -1) {
						this.aClass137_45.method7891(local314, (int) ((double) this.aClass158_13.anInt4348 * 0.7D) + local25, Static548.anInt9335, arg4);
					}
					if (Static557.anInt9472 != -1) {
						this.aClass137_45.method7891(local314, this.aClass158_13.anInt4348 + local25 + 1, Static557.anInt9472, arg4);
					}
					arg4 += local314;
					local29 = local45;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILclient!aa;I[Lclient!jd;Ljava/lang/String;II[IIII)I")
	public final int method8988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class20[] arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg9 == null) {
			return 0;
		}
		this.method8996(arg14, arg4);
		if (arg0 == 0) {
			arg0 = this.aClass158_13.anInt4348;
		}
		@Pc(59) int[] local59;
		if (arg0 + this.aClass158_13.anInt4347 + this.aClass158_13.anInt4354 > arg7 && arg7 < arg0 + arg0) {
			local59 = null;
		} else {
			local59 = new int[] { arg2 };
		}
		if (arg15 == -1) {
			arg15 = arg7 / arg0;
			if (arg15 <= 0) {
				arg15 = 1;
			}
		}
		@Pc(84) int local84 = this.aClass158_13.method3596(local59, Static513.aStringArray32, arg8, arg9);
		if (arg15 > 0 && local84 >= arg15) {
			local84 = arg15;
			Static513.aStringArray32[arg15 - 1] = this.aClass158_13.method3604(Static513.aStringArray32[arg15 - 1], arg8, arg2);
		}
		if (arg1 == 3 && local84 == 1) {
			arg1 = 1;
		}
		@Pc(127) int local127;
		@Pc(185) int local185;
		if (arg1 == 0) {
			local127 = this.aClass158_13.anInt4354 + arg13;
		} else if (arg1 == 1) {
			local127 = (arg7 - arg0 * (local84 - 1) - this.aClass158_13.anInt4354 - this.aClass158_13.anInt4347) / 2 + this.aClass158_13.anInt4354 + arg13;
		} else if (arg1 == 2) {
			local127 = arg7 + arg13 - this.aClass158_13.anInt4347 - (local84 + -1) * arg0;
		} else {
			local185 = (arg7 - this.aClass158_13.anInt4354 - this.aClass158_13.anInt4347 - arg0 * (local84 + -1)) / (local84 + 1);
			if (local185 < 0) {
				local185 = 0;
			}
			local127 = arg13 + this.aClass158_13.anInt4354 + local185;
			arg0 += local185;
		}
		for (local185 = 0; local185 < local84; local185++) {
			if (arg11 == 0) {
				this.method8987(arg8, arg12, arg5, Static513.aStringArray32[local185], arg3, arg6, local127, arg10);
			} else if (arg11 == 1) {
				this.method8987(arg8, arg12, arg5, Static513.aStringArray32[local185], (arg2 - this.aClass158_13.method3601(Static513.aStringArray32[local185])) / 2 + arg3, arg6, local127, arg10);
			} else if (arg11 == 2) {
				this.method8987(arg8, arg12, arg5, Static513.aStringArray32[local185], arg2 + arg3 - this.aClass158_13.method3601(Static513.aStringArray32[local185]), arg6, local127, arg10);
			} else if (local84 - 1 == local185) {
				this.method8987(arg8, arg12, arg5, Static513.aStringArray32[local185], arg3, arg6, local127, arg10);
			} else {
				this.method8978(arg2, Static513.aStringArray32[local185]);
				this.method8987(arg8, arg12, arg5, Static513.aStringArray32[local185], arg3, arg6, local127, arg10);
				Static182.anInt3496 = 0;
			}
			local127 += arg0;
		}
		return local84;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method8989(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method8996(arg3, arg1);
			this.method8987((Class20[]) null, (int[]) null, 0, arg0, arg4 - this.aClass158_13.method3601(arg0) / 2, (Class1) null, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method8990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method8996(arg3, arg0);
			this.method8987((Class20[]) null, (int[]) null, 0, arg4, arg1 - this.aClass158_13.method3601(arg4), (Class1) null, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method8991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method8996(-16777216, arg1);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg0 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method8979(arg2, arg4, local22, arg3 - this.aClass158_13.method3601(arg4) / 2, (int[]) null, local19, (Class20[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I[Lclient!jd;IIILjava/lang/String;I)V")
	public final void method8993(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 != null) {
			this.method8996(0, arg0);
			this.method8987(arg2, arg1, 0, arg4, arg5, (Class1) null, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!jd;IIIIIILjava/lang/String;I[IIIILclient!aa;I)I")
	public final int method8994(@OriginalArg(0) int arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class1 arg13, @OriginalArg(15) int arg14) {
		return this.method8988(arg6, arg2, arg3, arg10, arg12, arg11, arg13, arg8, arg1, arg7, arg0, arg5, arg9, arg4, arg14, 0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBILjava/lang/String;II)V")
	public final void method8995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method8996(-16777216, arg2);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			local19[local25] = (int) (Math.sin((double) local25 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method8979(arg0, arg3, local19, arg4 - this.aClass158_13.method3601(arg3) / 2, (int[]) null, (int[]) null, (Class20[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method8996(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static557.anInt9472 = -1;
		Static176.anInt3423 = arg1;
		Static87.anInt1952 = arg1;
		Static309.anInt1948 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static548.anInt9335 = -1;
		Static182.anInt3496 = 0;
		Static308.anInt5376 = arg0;
		Static102.anInt2165 = arg0;
	}
}
