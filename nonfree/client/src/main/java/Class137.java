import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class137 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!za;")
	private final Class117 aClass117_10;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!ul;")
	private final Class252 aClass252_109;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!za;Lclient!ul;)V")
	protected Class137(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class252 arg1) {
		this.aClass117_10 = arg0;
		this.aClass252_109 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;IIZ)V")
	public final void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		if (arg4 == null) {
			return;
		}
		this.method4588(arg5, -16777216);
		@Pc(25) double local25 = 7.0D - (double) arg1 / 8.0D;
		if (local25 < 0.0D) {
			local25 = 0.0D;
		}
		@Pc(34) int local34 = arg4.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
			local37[local43] = (int) (local25 * Math.sin((double) arg3 + (double) local43 / 1.5D));
		}
		this.method4601(local37, null, null, arg4, null, arg2, arg0 - this.aClass252_109.method5291(arg4) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
	public final void method4586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method4588(arg1, arg2);
			this.method4596(arg4 - this.aClass252_109.method5291(arg0) / 2, 0, 0, arg0, null, arg3, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method4587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method4588(arg3, arg4);
			this.method4596(arg1, 0, 0, arg2, null, arg0, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)V")
	private void method4588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static266.anInt4660 = 0;
		Static379.anInt125 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static436.anInt6900 = arg0;
		Static359.anInt5010 = arg0;
		Static409.anInt6537 = -1;
		Static388.anInt6816 = 0;
		Static117.anInt1772 = arg1;
		Static126.anInt1907 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4590(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static359.anInt5010 = Static359.anInt5010 & 0xFF000000 | Static31.method447(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static359.anInt5010 = Static436.anInt6900 & 0xFFFFFF | Static359.anInt5010 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static359.anInt5010 = Static31.method447(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static359.anInt5010 = Static436.anInt6900;
			} else if (arg0.startsWith("str=")) {
				Static379.anInt125 = Static359.anInt5010 & 0xFF000000 | Static31.method447(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static379.anInt125 = Static359.anInt5010 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static379.anInt125 = -1;
			} else if (arg0.startsWith("u=")) {
				Static409.anInt6537 = Static359.anInt5010 & 0xFF000000 | Static31.method447(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static409.anInt6537 = Static359.anInt5010 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static409.anInt6537 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static126.anInt1907 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static126.anInt1907 = Static359.anInt5010 & 0xFF000000 | Static31.method447(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static126.anInt1907 = Static359.anInt5010 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static126.anInt1907 = Static117.anInt1772;
			} else if (arg0.equals("br")) {
				this.method4588(Static436.anInt6900, Static117.anInt1772);
			}
		} catch (@Pc(183) Exception local183) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[ILjava/lang/String;I[Lclient!o;I)V")
	public final void method4591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String arg3, @OriginalArg(6) Class85[] arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method4588(arg0, 0);
			this.method4596(arg1, 0, 0, arg3, arg2, arg5, arg4, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I[IILjava/util/Random;IBI[Lclient!o;I)I")
	public final int method4592(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class85[] arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg1);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method4588(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4601(null, arg2, local43, arg0, arg6, arg5, arg4);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!o;IIIIIIILclient!ta;IIIIILjava/lang/String;[II)I")
	public final int method4593(@OriginalArg(0) Class85[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class73 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) int arg15) {
		if (arg13 == null) {
			return 0;
		}
		this.method4588(arg3, arg6);
		if (arg2 == 0) {
			arg2 = this.aClass252_109.anInt6659;
		}
		@Pc(41) int[] local41;
		if (arg4 < this.aClass252_109.anInt6663 + this.aClass252_109.anInt6656 + arg2 && arg2 + arg2 > arg4) {
			local41 = null;
		} else {
			local41 = new int[] { arg10 };
		}
		if (arg1 == -1) {
			arg1 = arg4 / arg2;
			if (arg1 <= 0) {
				arg1 = 1;
			}
		}
		@Pc(70) int local70 = this.aClass252_109.method5297(arg13, Static214.aStringArray29, arg0, local41);
		if (arg1 > 0 && arg1 <= local70) {
			Static214.aStringArray29[arg1 - 1] = this.aClass252_109.method5294(Static214.aStringArray29[arg1 - 1], arg10, arg0);
			local70 = arg1;
		}
		if (arg11 == 3 && local70 == 1) {
			arg11 = 1;
		}
		@Pc(119) int local119;
		@Pc(196) int local196;
		if (arg11 == 0) {
			local119 = arg15 + this.aClass252_109.anInt6656;
		} else if (arg11 == 1) {
			local119 = (arg4 - arg2 * (local70 - 1) - this.aClass252_109.anInt6663 - this.aClass252_109.anInt6656) / 2 + arg15 + this.aClass252_109.anInt6656;
		} else if (arg11 == 2) {
			local119 = arg15 + arg4 - this.aClass252_109.anInt6663 - (local70 - 1) * arg2;
		} else {
			local196 = (arg4 - this.aClass252_109.anInt6656 - this.aClass252_109.anInt6663 - (local70 + -1) * arg2) / (local70 + 1);
			if (local196 < 0) {
				local196 = 0;
			}
			local119 = local196 + this.aClass252_109.anInt6656 + arg15;
			arg2 += local196;
		}
		for (local196 = 0; local196 < local70; local196++) {
			if (arg12 == 0) {
				this.method4596(arg5, arg9, arg8, Static214.aStringArray29[local196], arg14, local119, arg0, arg7);
			} else if (arg12 == 1) {
				this.method4596(arg5 + (arg10 - this.aClass252_109.method5291(Static214.aStringArray29[local196])) / 2, arg9, arg8, Static214.aStringArray29[local196], arg14, local119, arg0, arg7);
			} else if (arg12 == 2) {
				this.method4596(arg5 + arg10 - this.aClass252_109.method5291(Static214.aStringArray29[local196]), arg9, arg8, Static214.aStringArray29[local196], arg14, local119, arg0, arg7);
			} else if (local70 - 1 == local196) {
				this.method4596(arg5, arg9, arg8, Static214.aStringArray29[local196], arg14, local119, arg0, arg7);
			} else {
				this.method4599(arg10, Static214.aStringArray29[local196]);
				this.method4596(arg5, arg9, arg8, Static214.aStringArray29[local196], arg14, local119, arg0, arg7);
				Static266.anInt4660 = 0;
			}
			local119 += arg2;
		}
		return local70;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IILjava/lang/String;III)V")
	public final void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		if (arg2 != null) {
			this.method4588(arg3, -1);
			this.method4596(arg1 - this.aClass252_109.method5291(arg2), 0, 0, arg2, null, arg0, null, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILclient!ta;IIII[Lclient!o;I[ILjava/lang/String;I)I")
	public final int method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class85[] arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) String arg12) {
		return this.method4593(arg9, 0, 0, arg4, arg0, arg6, arg1, arg5, arg10, arg7, arg8, arg3, 1, arg12, arg11, arg2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIILjava/lang/String;[II[Lclient!o;Lclient!ta;)V")
	private void method4596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class85[] arg6, @OriginalArg(8) Class73 arg7) {
		@Pc(7) int local7 = arg5 - this.aClass252_109.anInt6659;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static200.method2869(arg3.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(53) String local53 = arg3.substring(local13 + 1, local20);
					local13 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=")) {
								try {
									@Pc(119) int local119 = Static252.method3564(local53.substring(4));
									@Pc(123) Class85 local123 = arg6[local119];
									@Pc(132) int local132 = arg4 == null ? local123.Q() : arg4[local119];
									if ((Static359.anInt5010 & -16777216) == -16777216) {
										local123.W(arg0, this.aClass252_109.anInt6659 + local7 - local132, 1, 0, 1);
									} else {
										local123.W(arg0, this.aClass252_109.anInt6659 + local7 - local132, 0, Static359.anInt5010 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg0 += arg6[local119].RA();
									local15 = -1;
								} catch (@Pc(182) Exception local182) {
								}
							} else {
								this.method4590(local53);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass252_109.method5290(local15, local31);
					}
					if (local31 == ' ') {
						if (Static266.anInt4660 > 0) {
							Static388.anInt6816 += Static266.anInt4660;
							arg0 += Static388.anInt6816 >> 8;
							Static388.anInt6816 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static126.anInt1907 & 0xFF000000) != 0) {
							this.B(local31, arg0 + 1, local7 + 1, Static126.anInt1907, true);
						}
						this.B(local31, arg0, local7, Static359.anInt5010, false);
					} else {
						if ((Static126.anInt1907 & 0xFF000000) != 0) {
							this.method4597(local31, arg0 + 1, local7 + 1, Static126.anInt1907, true, arg7, arg2, arg1);
						}
						this.method4597(local31, arg0, local7, Static359.anInt5010, false, arg7, arg2, arg1);
					}
					@Pc(297) int local297 = this.aClass252_109.method5299(local31);
					if (Static379.anInt125 != -1) {
						this.aClass117_10.method5658(arg0, Static379.anInt125, local297, local7 + (int) ((double) this.aClass252_109.anInt6659 * 0.7D));
					}
					if (Static409.anInt6537 != -1) {
						this.aClass117_10.method5658(arg0, Static409.anInt6537, local297, local7 + this.aClass252_109.anInt6659 + 1);
					}
					arg0 += local297;
					local15 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	protected abstract void method4597(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method4598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method4588(arg2, -16777216);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method4601(local19, null, null, arg4, null, arg1, arg0 - this.aClass252_109.method5291(arg4) / 2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;)V")
	private void method4599(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
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
			Static266.anInt4660 = (arg0 - this.aClass252_109.method5291(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;II[Lclient!o;I[I[IIILjava/util/Random;)I")
	public final int method4600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class85[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Random arg13) {
		if (arg5 == null) {
			return 0;
		}
		arg13.setSeed((long) arg8);
		@Pc(20) int local20 = (arg13.nextInt() & 0x1F) + 192;
		this.method4588(arg11 & 0xFFFFFF | local20 << 24, local20 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg13.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg3;
		@Pc(76) int local76 = arg12 + this.aClass252_109.anInt6656;
		@Pc(78) int local78 = -1;
		if (arg4 == 1) {
			local76 += (arg1 - this.aClass252_109.anInt6656 - this.aClass252_109.anInt6663) / 2;
		} else if (arg4 == 2) {
			local76 = arg12 + arg1 - this.aClass252_109.anInt6663;
		}
		if (arg2 == 1) {
			local78 = local45 + this.aClass252_109.method5291(arg5);
			local69 = arg3 + (arg0 - local78) / 2;
		} else if (arg2 == 2) {
			local78 = local45 + this.aClass252_109.method5291(arg5);
			local69 = arg3 + arg0 - local78;
		}
		this.method4601(null, arg9, local43, arg5, arg7, local76, local69);
		if (arg10 != null) {
			if (local78 == -1) {
				local78 = local45 + this.aClass252_109.method5291(arg5);
			}
			arg10[0] = local69;
			arg10[3] = this.aClass252_109.anInt6656 + this.aClass252_109.anInt6663;
			arg10[2] = local78;
			arg10[1] = local76 - this.aClass252_109.anInt6656;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([I[I[ILjava/lang/String;[Lclient!o;III)V")
	private void method4601(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class85[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = arg5 - this.aClass252_109.anInt6659;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static200.method2869(arg3.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(114) int local114;
				@Pc(126) int local126;
				if (local33 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg3.substring(local13 + 1, local22);
					local13 = -1;
					if (local56.equals("lt")) {
						local33 = '<';
					} else if (local56.equals("gt")) {
						local33 = '>';
					} else if (local56.equals("nbsp")) {
						local33 = ' ';
					} else if (local56.equals("shy")) {
						local33 = '\u00ad';
					} else if (local56.equals("times")) {
						local33 = '×';
					} else if (local56.equals("euro")) {
						local33 = '€';
					} else if (local56.equals("copy")) {
						local33 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									if (arg2 == null) {
										local114 = 0;
									} else {
										local114 = arg2[local17];
									}
									if (arg0 == null) {
										local126 = 0;
									} else {
										local126 = arg0[local17];
									}
									local17++;
									@Pc(137) int local137 = Static252.method3564(local56.substring(4));
									@Pc(141) Class85 local141 = arg4[local137];
									@Pc(150) int local150 = arg1 == null ? local141.Q() : arg1[local137];
									local141.W(local114 + arg6, local126 + -local150 + this.aClass252_109.anInt6659 + local11, 1, 0, 1);
									local15 = -1;
									arg6 += arg4[local137].RA();
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method4590(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass252_109.method5290(local15, local33);
					}
					@Pc(221) int local221;
					if (arg2 == null) {
						local221 = 0;
					} else {
						local221 = arg2[local17];
					}
					if (arg0 == null) {
						local114 = 0;
					} else {
						local114 = arg0[local17];
					}
					if (local33 != ' ') {
						if ((Static126.anInt1907 & 0xFF000000) != 0) {
							this.B(local33, arg6 + local221 + 1, local114 + local11 - -1, Static126.anInt1907, true);
						}
						this.B(local33, arg6 + local221, local114 + local11, Static359.anInt5010, false);
					} else if (Static266.anInt4660 > 0) {
						Static388.anInt6816 += Static266.anInt4660;
						arg6 += Static388.anInt6816 >> 8;
						Static388.anInt6816 &= 0xFF;
					}
					local17++;
					local126 = this.aClass252_109.method5299(local33);
					if (Static379.anInt125 != -1) {
						this.aClass117_10.method5658(arg6, Static379.anInt125, local126, local11 + (int) ((double) this.aClass252_109.anInt6659 * 0.7D));
					}
					if (Static409.anInt6537 != -1) {
						this.aClass117_10.method5658(arg6, Static409.anInt6537, local126, local11 + this.aClass252_109.anInt6659);
					}
					arg6 += local126;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method4602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method4588(arg1, -16777216);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) arg3 / 5.0D + (double) local24 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg3 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method4601(local22, null, local19, arg4, null, arg0, arg2 - this.aClass252_109.method5291(arg4) / 2);
	}

	@OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
