import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public abstract class Class9 {

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "Lclient!k;")
	private final Class114 aClass114_6;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!uo;")
	private final Class129 aClass129_8;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!uo;Lclient!k;)V")
	protected Class9(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class114 arg1) {
		this.aClass114_6 = arg1;
		this.aClass129_8 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIIILjava/lang/String;I)V")
	public final void method3570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method3586(arg4, arg2);
			this.method3587(null, 0, null, arg0 - this.aClass114_6.method2472(arg3) / 2, null, arg3, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method3571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method3586(arg2, -1);
			this.method3587(null, 0, null, arg0 - this.aClass114_6.method2472(arg3), null, arg3, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/lang/String;IIB)V")
	public final void method3573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method3586(arg4, arg0);
			this.method3587(null, 0, null, arg3, null, arg2, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIILjava/lang/String;ZIIII[IILclient!ep;[Lclient!sg;)I")
	public final int method3574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class66 arg13, @OriginalArg(15) Class97[] arg14) {
		if (arg6 == null) {
			return 0;
		}
		this.method3586(arg3, arg0);
		if (arg9 == 0) {
			arg9 = this.aClass114_6.anInt2905;
		}
		@Pc(45) int[] local45;
		if (arg7 < this.aClass114_6.anInt2911 + this.aClass114_6.anInt2912 + arg9 && arg7 < arg9 + arg9) {
			local45 = null;
		} else {
			local45 = new int[] { arg2 };
		}
		@Pc(63) int local63 = this.aClass114_6.method2469(local45, arg6, Static303.aStringArray37, arg14);
		if (arg4 == 3 && local63 == 1) {
			arg4 = 1;
		}
		@Pc(102) int local102;
		@Pc(125) int local125;
		if (arg4 == 0) {
			local102 = arg5 + this.aClass114_6.anInt2912;
		} else if (arg4 == 1) {
			local102 = this.aClass114_6.anInt2912 + arg5 + (-(arg9 * (local63 - 1)) + arg7 + -this.aClass114_6.anInt2912 - this.aClass114_6.anInt2911) / 2;
		} else if (arg4 == 2) {
			local102 = arg7 + arg5 - this.aClass114_6.anInt2911 - (local63 - 1) * arg9;
		} else {
			local125 = (arg7 - this.aClass114_6.anInt2912 - this.aClass114_6.anInt2911 - (local63 + -1) * arg9) / (local63 + 1);
			if (local125 < 0) {
				local125 = 0;
			}
			local102 = local125 + arg5 + this.aClass114_6.anInt2912;
			arg9 += local125;
		}
		for (local125 = 0; local125 < local63; local125++) {
			if (arg8 == 0) {
				this.method3587(arg14, arg10, arg11, arg12, arg13, Static303.aStringArray37[local125], arg1, local102);
			} else if (arg8 == 1) {
				this.method3587(arg14, arg10, arg11, arg12 + (arg2 - this.aClass114_6.method2472(Static303.aStringArray37[local125])) / 2, arg13, Static303.aStringArray37[local125], arg1, local102);
			} else if (arg8 == 2) {
				this.method3587(arg14, arg10, arg11, arg12 + arg2 - this.aClass114_6.method2472(Static303.aStringArray37[local125]), arg13, Static303.aStringArray37[local125], arg1, local102);
			} else if (local125 == local63 - 1) {
				this.method3587(arg14, arg10, arg11, arg12, arg13, Static303.aStringArray37[local125], arg1, local102);
			} else {
				this.method3575(Static303.aStringArray37[local125], arg2);
				this.method3587(arg14, arg10, arg11, arg12, arg13, Static303.aStringArray37[local125], arg1, local102);
				Static99.anInt821 = 0;
			}
			local102 += arg9;
		}
		return local63;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method3575(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			Static99.anInt821 = (arg1 - this.aClass114_6.method2472(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/lang/String;ZIII)V")
	public final void method3576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method3586(arg3, -16777216);
		@Pc(20) int local20 = arg2.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 3.0D) * 5.0D);
		}
		this.method3584(arg4, null, arg2, null, local26, arg1 - this.aClass114_6.method2472(arg2) / 2, local23);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/util/Random;ILjava/lang/String;IIIIII[Lclient!sg;[I[III)I")
	public final int method3577(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class97[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg1.setSeed((long) arg13);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method3586(local20 << 24 | arg2 & 0xFFFFFF, local20 << 24 | arg6 & 0xFFFFFF);
		@Pc(45) int local45 = arg3.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg1.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(74) int local74 = arg5;
		@Pc(80) int local80 = this.aClass114_6.anInt2912 + arg4;
		@Pc(82) int local82 = -1;
		if (arg12 == 1) {
			local80 += (arg7 - this.aClass114_6.anInt2911 - this.aClass114_6.anInt2912) / 2;
		} else if (arg12 == 2) {
			local80 = arg7 + arg4 - this.aClass114_6.anInt2911;
		}
		if (arg0 == 1) {
			local82 = local50 + this.aClass114_6.method2472(arg3);
			local74 = arg5 + (arg8 - local82) / 2;
		} else if (arg0 == 2) {
			local82 = local50 + this.aClass114_6.method2472(arg3);
			local74 = arg5 + arg8 - local82;
		}
		this.method3584(local80, arg10, arg3, arg9, null, local74, local48);
		if (arg11 != null) {
			if (local82 == -1) {
				local82 = this.aClass114_6.method2472(arg3) + local50;
			}
			arg11[2] = local82;
			arg11[1] = local80 - this.aClass114_6.anInt2912;
			arg11[0] = local74;
			arg11[3] = this.aClass114_6.anInt2911 + this.aClass114_6.anInt2912;
		}
		return local50;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIII[Lclient!sg;[IIILjava/util/Random;Ljava/lang/String;)I")
	public final int method3578(@OriginalArg(2) int arg0, @OriginalArg(4) Class97[] arg1, @OriginalArg(5) int[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg5.setSeed((long) arg0);
		@Pc(21) int local21 = (arg5.nextInt() & 0x1F) + 192;
		this.method3586(local21 << 24 | 0xFFFFFF, (local21 | 0x0) << 24);
		@Pc(46) int local46 = arg6.length();
		@Pc(49) int[] local49 = new int[local46];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
			local49[local53] = local51;
			if ((arg5.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method3584(arg4, arg2, arg6, arg1, null, arg3, local49);
		return local51;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3579(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static131.anInt2422 = Static131.anInt2422 & 0xFF000000 | Static321.method5331(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static131.anInt2422 = Static69.anInt1297 & 0xFFFFFF | Static131.anInt2422 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static131.anInt2422 = Static321.method5331(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static131.anInt2422 = Static69.anInt1297;
			} else if (arg0.startsWith("str=")) {
				Static258.anInt5231 = Static321.method5331(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static258.anInt5231 = -8388608;
			} else if (arg0.equals("/str")) {
				Static258.anInt5231 = -1;
			} else if (arg0.startsWith("u=")) {
				Static78.anInt1447 = Static321.method5331(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static78.anInt1447 = -16777216;
			} else if (arg0.equals("/u")) {
				Static78.anInt1447 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static278.anInt6303 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static278.anInt6303 = Static321.method5331(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static278.anInt6303 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static278.anInt6303 = Static180.anInt4666;
				return;
			} else if (arg0.equals("br")) {
				this.method3586(Static69.anInt1297, Static180.anInt4666);
				return;
			}
		} catch (@Pc(160) Exception local160) {
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(CIIIZLclient!ep;II)V")
	protected abstract void method3580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class66 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method3581(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3586(arg3, -16777216);
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3584(arg2, null, arg0, null, local27, arg1 - this.aClass114_6.method2472(arg0) / 2, null);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method3583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method3586(arg3, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg2 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg5.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) arg0 + (double) local34 / 1.5D) * local20);
		}
		this.method3584(arg1, null, arg5, null, local32, arg4 - this.aClass114_6.method2472(arg5) / 2, null);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[ILjava/lang/String;[Lclient!sg;I[II[I)V")
	private void method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class97[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg0 - this.aClass114_6.anInt2905;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg2.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(41) char local41 = (char) (Static171.method2793(arg2.charAt(local22)) & 0xFF);
			if (local41 == '<') {
				local13 = local22;
			} else {
				@Pc(132) int local132;
				@Pc(144) int local144;
				if (local41 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg2.substring(local13 + 1, local22);
					local13 = -1;
					if (local64.equals("lt")) {
						local41 = '<';
					} else if (local64.equals("gt")) {
						local41 = '>';
					} else if (local64.equals("nbsp")) {
						local41 = ' ';
					} else if (local64.equals("shy")) {
						local41 = '\u00ad';
					} else if (local64.equals("times")) {
						local41 = '×';
					} else if (local64.equals("euro")) {
						local41 = '€';
					} else if (local64.equals("copy")) {
						local41 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local132 = 0;
									} else {
										local132 = arg6[local17];
									}
									if (arg4 == null) {
										local144 = 0;
									} else {
										local144 = arg4[local17];
									}
									local17++;
									@Pc(155) int local155 = Static87.method1250(local64.substring(4));
									@Pc(159) Class97 local159 = arg3[local155];
									@Pc(168) int local168 = arg1 == null ? local159.method5557() : arg1[local155];
									local159.method5544(arg5 + local132, local144 + -local168 + local11 + this.aClass114_6.anInt2905, 0, 0);
									arg5 += arg3[local155].method5542();
									local15 = -1;
								} catch (@Pc(198) Exception local198) {
								}
							} else {
								this.method3579(local64);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass114_6.method2467(local41, local15);
					}
					@Pc(230) int local230;
					if (arg6 == null) {
						local230 = 0;
					} else {
						local230 = arg6[local17];
					}
					if (arg4 == null) {
						local132 = 0;
					} else {
						local132 = arg4[local17];
					}
					local17++;
					if (local41 != ' ') {
						if ((Static278.anInt6303 & 0xFF000000) != 0) {
							this.method3588(local41, arg5 + local230 + 1, local11 + 1 + local132, Static278.anInt6303, true);
						}
						this.method3588(local41, local230 + arg5, local132 + local11, Static131.anInt2422, false);
					} else if (Static99.anInt821 > 0) {
						Static166.anInt3310 += Static99.anInt821;
						arg5 += Static166.anInt3310 >> 8;
						Static166.anInt3310 &= 0xFF;
					}
					local144 = this.aClass114_6.method2475(local41);
					if (Static258.anInt5231 != -1) {
						this.aClass129_8.method4998(local144, (int) ((double) this.aClass114_6.anInt2905 * 0.7D) + local11, Static258.anInt5231, arg5);
					}
					if (Static78.anInt1447 != -1) {
						this.aClass129_8.method4998(local144, local11 + this.aClass114_6.anInt2905, Static78.anInt1447, arg5);
					}
					local15 = local41;
					arg5 += local144;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[Lclient!sg;I[IILjava/lang/String;)V")
	public final void method3585(@OriginalArg(0) int arg0, @OriginalArg(3) Class97[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method3586(arg0, 0);
			this.method3587(arg1, 0, arg3, arg2, null, arg5, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZI)V")
	private void method3586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static166.anInt3310 = 0;
		Static69.anInt1297 = arg0;
		Static131.anInt2422 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static78.anInt1447 = -1;
		Static99.anInt821 = 0;
		Static258.anInt5231 = -1;
		Static180.anInt4666 = arg1;
		Static278.anInt6303 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([Lclient!sg;II[IILclient!ep;Ljava/lang/String;II)V")
	private void method3587(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class66 arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 - this.aClass114_6.anInt2905;
		@Pc(13) int local13 = -1;
		@Pc(29) int local29 = -1;
		@Pc(32) int local32 = arg5.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(45) char local45 = (char) (Static171.method2793(arg5.charAt(local34)) & 0xFF);
			if (local45 == '<') {
				local13 = local34;
			} else {
				if (local45 == '>' && local13 != -1) {
					@Pc(67) String local67 = arg5.substring(local13 + 1, local34);
					local13 = -1;
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
									@Pc(127) int local127 = Static87.method1250(local67.substring(4));
									@Pc(131) Class97 local131 = arg0[local127];
									@Pc(140) int local140 = arg2 == null ? local131.method5557() : arg2[local127];
									if ((-16777216 & Static131.anInt2422) == -16777216) {
										local131.method5544(arg3, local11 + this.aClass114_6.anInt2905 - local140, 0, 0);
									} else {
										local131.method5544(arg3, local11 + this.aClass114_6.anInt2905 - local140, 1, Static131.anInt2422 & 0xFF000000 | 0xFFFFFF);
									}
									arg3 += arg0[local127].method5542();
									local29 = -1;
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method3579(local67);
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local13 == -1) {
					if (local29 != -1) {
						arg3 += this.aClass114_6.method2467(local45, local29);
					}
					if (local45 == ' ') {
						if (Static99.anInt821 > 0) {
							Static166.anInt3310 += Static99.anInt821;
							arg3 += Static166.anInt3310 >> 8;
							Static166.anInt3310 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static278.anInt6303 & 0xFF000000) != 0) {
							this.method3588(local45, arg3 + 1, local11 + 1, Static278.anInt6303, true);
						}
						this.method3588(local45, arg3, local11, Static131.anInt2422, false);
					} else {
						if ((Static278.anInt6303 & 0xFF000000) != 0) {
							this.method3580(local45, arg3 + 1, local11 - -1, Static278.anInt6303, true, arg4, arg1, arg6);
						}
						this.method3580(local45, arg3, local11, Static131.anInt2422, false, arg4, arg1, arg6);
					}
					@Pc(317) int local317 = this.aClass114_6.method2475(local45);
					if (Static258.anInt5231 != -1) {
						this.aClass129_8.method4998(local317, local11 + (int) ((double) this.aClass114_6.anInt2905 * 0.7D), Static258.anInt5231, arg3);
					}
					if (Static78.anInt1447 != -1) {
						this.aClass129_8.method4998(local317, local11 + this.aClass114_6.anInt2905 + 1, Static78.anInt1447, arg3);
					}
					local29 = local45;
					arg3 += local317;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method3588(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
