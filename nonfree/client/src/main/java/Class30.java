import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public abstract class Class30 {

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "Lclient!gh;")
	private final Class76 aClass76_11;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!e;")
	private final Class46 aClass46_9;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!e;Lclient!gh;)V")
	protected Class30(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class76 arg1) {
		this.aClass76_11 = arg1;
		this.aClass46_9 = arg0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Lclient!gl;III[ILjava/util/Random;Ljava/lang/String;II)I")
	public final int method5571(@OriginalArg(0) int arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Random arg5, @OriginalArg(7) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg5.setSeed((long) arg2);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method5574(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg6.length();
		@Pc(48) int[] local48 = new int[local40];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local48[local52] = local50;
			if ((arg5.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method5576(arg4, arg1, arg3, arg6, arg0, local48, null);
		return local50;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
	public final void method5572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5574(arg2, arg1);
			this.method5578(arg0, 0, arg4, null, null, null, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method5573(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
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
			Static7.anInt180 = (arg1 - this.aClass76_11.method2256(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
	private void method5574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static134.anInt2861 = -1;
		Static70.anInt1692 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static242.anInt4746 = arg0;
		Static309.anInt5878 = arg0;
		Static23.anInt598 = -1;
		Static7.anInt180 = 0;
		Static148.anInt3198 = arg1;
		Static355.anInt6757 = arg1;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;[IIIIB[Lclient!gl;)V")
	public final void method5575(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class2[] arg6) {
		if (arg1 != null) {
			this.method5574(arg4, arg3);
			this.method5578(arg5, 0, arg1, arg6, null, arg2, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([I[Lclient!gl;IZLjava/lang/String;I[I[I)V")
	private void method5576(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass76_11.anInt2280;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static185.method3545(arg3.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(124) int local124;
				@Pc(134) int local134;
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
									if (arg5 == null) {
										local124 = 0;
									} else {
										local124 = arg5[local17];
									}
									if (arg6 == null) {
										local134 = 0;
									} else {
										local134 = arg6[local17];
									}
									local17++;
									@Pc(145) int local145 = Static75.method1895(local56.substring(4));
									@Pc(149) Class2 local149 = arg1[local145];
									@Pc(158) int local158 = arg0 == null ? local149.method2627() : arg0[local145];
									local149.method2643(arg4 + local124, local134 + -local158 + this.aClass76_11.anInt2280 + local7, 0, 0);
									local15 = -1;
									arg4 += arg1[local145].method2630();
								} catch (@Pc(188) Exception local188) {
								}
							} else {
								this.method5583(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass76_11.method2255(local15, local33);
					}
					@Pc(221) int local221;
					if (arg5 == null) {
						local221 = 0;
					} else {
						local221 = arg5[local17];
					}
					if (arg6 == null) {
						local124 = 0;
					} else {
						local124 = arg6[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static355.anInt6757 & 0xFF000000) != 0) {
							this.method5582(local33, local221 + arg4 + 1, local124 + 1 + local7, Static355.anInt6757, true);
						}
						this.method5582(local33, arg4 + local221, local7 - -local124, Static309.anInt5878, false);
					} else if (Static7.anInt180 > 0) {
						Static70.anInt1692 += Static7.anInt180;
						arg4 += Static70.anInt1692 >> 8;
						Static70.anInt1692 &= 0xFF;
					}
					local134 = this.aClass76_11.method2248(local33);
					if (Static134.anInt2861 != -1) {
						this.aClass46_9.method5113(Static134.anInt2861, local7 + (int) ((double) this.aClass76_11.anInt2280 * 0.7D), arg4, local134);
					}
					if (Static23.anInt598 != -1) {
						this.aClass46_9.method5113(Static23.anInt598, this.aClass76_11.anInt2280 + local7, arg4, local134);
					}
					arg4 += local134;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II[Lclient!gl;I[ILclient!q;IIIIIILjava/lang/String;III)I")
	public final int method5577(@OriginalArg(1) int arg0, @OriginalArg(2) Class2[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class156 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg11 == null) {
			return 0;
		}
		this.method5574(arg8, arg14);
		if (arg9 == 0) {
			arg9 = this.aClass76_11.anInt2280;
		}
		@Pc(48) int[] local48;
		if (this.aClass76_11.anInt2286 + this.aClass76_11.anInt2285 + arg9 > arg5 && arg9 + arg9 > arg5) {
			local48 = null;
		} else {
			local48 = new int[] { arg7 };
		}
		@Pc(61) int local61 = this.aClass76_11.method2254(local48, Static214.aStringArray55, arg11, arg1);
		if (arg6 == 3 && local61 == 1) {
			arg6 = 1;
		}
		@Pc(82) int local82;
		@Pc(132) int local132;
		if (arg6 == 0) {
			local82 = arg0 + this.aClass76_11.anInt2285;
		} else if (arg6 == 1) {
			local82 = arg0 + this.aClass76_11.anInt2285 + (arg5 - this.aClass76_11.anInt2286 - this.aClass76_11.anInt2285 - (local61 + -1) * arg9) / 2;
		} else if (arg6 == 2) {
			local82 = arg0 + arg5 - this.aClass76_11.anInt2286 - (local61 + -1) * arg9;
		} else {
			local132 = (arg5 - this.aClass76_11.anInt2286 - this.aClass76_11.anInt2285 - (local61 - 1) * arg9) / (local61 + 1);
			if (local132 < 0) {
				local132 = 0;
			}
			arg9 += local132;
			local82 = local132 + this.aClass76_11.anInt2285 + arg0;
		}
		for (local132 = 0; local132 < local61; local132++) {
			if (arg2 == 0) {
				this.method5578(arg12, arg13, Static214.aStringArray55[local132], arg1, arg4, arg3, local82, arg10);
			} else if (arg2 == 1) {
				this.method5578(arg12 + (arg7 - this.aClass76_11.method2256(Static214.aStringArray55[local132])) / 2, arg13, Static214.aStringArray55[local132], arg1, arg4, arg3, local82, arg10);
			} else if (arg2 == 2) {
				this.method5578(arg12 + arg7 - this.aClass76_11.method2256(Static214.aStringArray55[local132]), arg13, Static214.aStringArray55[local132], arg1, arg4, arg3, local82, arg10);
			} else if (local61 - 1 == local132) {
				this.method5578(arg12, arg13, Static214.aStringArray55[local132], arg1, arg4, arg3, local82, arg10);
			} else {
				this.method5573(Static214.aStringArray55[local132], arg7);
				this.method5578(arg12, arg13, Static214.aStringArray55[local132], arg1, arg4, arg3, local82, arg10);
				Static7.anInt180 = 0;
			}
			local82 += arg9;
		}
		return local61;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILjava/lang/String;[Lclient!gl;ZLclient!q;[III)V")
	private void method5578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class2[] arg3, @OriginalArg(5) Class156 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg6 - this.aClass76_11.anInt2280;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(22) int local22 = arg2.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static185.method3545(arg2.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg2.substring(local13 + 1, local24);
					local13 = -1;
					if (local56.equals("lt")) {
						local35 = '<';
					} else if (local56.equals("gt")) {
						local35 = '>';
					} else if (local56.equals("nbsp")) {
						local35 = ' ';
					} else if (local56.equals("shy")) {
						local35 = '\u00ad';
					} else if (local56.equals("times")) {
						local35 = '×';
					} else if (local56.equals("euro")) {
						local35 = '€';
					} else if (local56.equals("copy")) {
						local35 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									@Pc(130) int local130 = Static75.method1895(local56.substring(4));
									@Pc(134) Class2 local134 = arg3[local130];
									@Pc(143) int local143 = arg5 == null ? local134.method2627() : arg5[local130];
									if ((Static309.anInt5878 & 0xFF000000) == -16777216) {
										local134.method2643(arg0, local7 + this.aClass76_11.anInt2280 - local143, 0, 0);
									} else {
										local134.method2643(arg0, local7 + this.aClass76_11.anInt2280 - local143, 1, Static309.anInt5878 & 0xFF000000 | 0xFFFFFF);
									}
									arg0 += arg3[local130].method2630();
									local15 = -1;
								} catch (@Pc(194) Exception local194) {
								}
							} else {
								this.method5583(local56);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass76_11.method2255(local15, local35);
					}
					if (local35 == ' ') {
						if (Static7.anInt180 > 0) {
							Static70.anInt1692 += Static7.anInt180;
							arg0 += Static70.anInt1692 >> 8;
							Static70.anInt1692 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static355.anInt6757 & 0xFF000000) != 0) {
							this.method5582(local35, arg0 + 1, local7 + 1, Static355.anInt6757, true);
						}
						this.method5582(local35, arg0, local7, Static309.anInt5878, false);
					} else {
						if ((Static355.anInt6757 & 0xFF000000) != 0) {
							this.method5581(local35, arg0 + 1, local7 - -1, Static355.anInt6757, true, arg4, arg7, arg1);
						}
						this.method5581(local35, arg0, local7, Static309.anInt5878, false, arg4, arg7, arg1);
					}
					@Pc(303) int local303 = this.aClass76_11.method2248(local35);
					if (Static134.anInt2861 != -1) {
						this.aClass46_9.method5113(Static134.anInt2861, local7 + (int) ((double) this.aClass76_11.anInt2280 * 0.7D), arg0, local303);
					}
					if (Static23.anInt598 != -1) {
						this.aClass46_9.method5113(Static23.anInt598, this.aClass76_11.anInt2280 + local7 + 1, arg0, local303);
					}
					arg0 += local303;
					local15 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLjava/util/Random;III[III[Lclient!gl;ILjava/lang/String;I[III)I")
	public final int method5579(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg0.setSeed((long) arg10);
		@Pc(26) int local26 = (arg0.nextInt() & 0x1F) + 192;
		this.method5574(arg13 & 0xFFFFFF | local26 << 24, local26 << 24 | arg8 & 0xFFFFFF);
		@Pc(46) int local46 = arg9.length();
		@Pc(49) int[] local49 = new int[local46];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
			local49[local53] = local51;
			if ((arg0.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		@Pc(78) int local78 = arg3;
		@Pc(85) int local85 = arg2 + this.aClass76_11.anInt2285;
		if (arg12 == 1) {
			local85 += (arg1 - this.aClass76_11.anInt2285 - this.aClass76_11.anInt2286) / 2;
		} else if (arg12 == 2) {
			local85 = arg1 + arg2 - this.aClass76_11.anInt2286;
		}
		@Pc(121) int local121 = -1;
		if (arg5 == 1) {
			local121 = this.aClass76_11.method2256(arg9) + local51;
			local78 = arg3 + (arg6 - local121) / 2;
		} else if (arg5 == 2) {
			local121 = this.aClass76_11.method2256(arg9) + local51;
			local78 = arg3 + arg6 - local121;
		}
		this.method5576(arg4, arg7, local85, arg9, local78, local49, null);
		if (arg11 != null) {
			if (local121 == -1) {
				local121 = this.aClass76_11.method2256(arg9) + local51;
			}
			arg11[1] = local85 - this.aClass76_11.anInt2285;
			arg11[3] = this.aClass76_11.anInt2286 + this.aClass76_11.anInt2285;
			arg11[2] = local121;
			arg11[0] = local78;
		}
		return local51;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;IBIII)V")
	public final void method5580(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5574(arg2, -16777216);
		@Pc(20) int local20 = arg1.length();
		@Pc(23) int[] local23 = new int[local20];
		for (@Pc(25) int local25 = 0; local25 < local20; local25++) {
			local23[local25] = (int) (Math.sin((double) arg0 / 5.0D + (double) local25 / 2.0D) * 5.0D);
		}
		this.method5576(null, null, arg4, arg1, arg3 - this.aClass76_11.method2256(arg1) / 2, null, local23);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(CIIIZLclient!q;II)V")
	protected abstract void method5581(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class156 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5582(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5583(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static309.anInt5878 = Static309.anInt5878 & 0xFF000000 | Static272.method4619(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static309.anInt5878 = Static242.anInt4746 & 0xFFFFFF | Static309.anInt5878 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static309.anInt5878 = Static272.method4619(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static309.anInt5878 = Static242.anInt4746;
			} else if (arg0.startsWith("str=")) {
				Static134.anInt2861 = Static272.method4619(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static134.anInt2861 = -8388608;
			} else if (arg0.equals("/str")) {
				Static134.anInt2861 = -1;
			} else if (arg0.startsWith("u=")) {
				Static23.anInt598 = Static272.method4619(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static23.anInt598 = -16777216;
			} else if (arg0.equals("/u")) {
				Static23.anInt598 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static355.anInt6757 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static355.anInt6757 = Static272.method4619(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static355.anInt6757 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static355.anInt6757 = Static148.anInt3198;
			} else if (arg0.equals("br")) {
				this.method5574(Static242.anInt4746, Static148.anInt3198);
			}
		} catch (@Pc(167) Exception local167) {
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
	public final void method5584(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5574(arg4, arg1);
			this.method5578(arg3 - this.aClass76_11.method2256(arg0) / 2, 0, arg0, null, null, null, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method5585(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method5574(arg1, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg4 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg0.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) local34 / 1.5D + (double) arg3) * local20);
		}
		this.method5576(null, null, arg2, arg0, arg5 - this.aClass76_11.method2256(arg0) / 2, null, local32);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([IIIILjava/lang/String;[Lclient!gl;ZI)V")
	public final void method5586(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) Class2[] arg5, @OriginalArg(7) int arg6) {
		if (arg4 != null) {
			this.method5574(arg3, arg1);
			this.method5578(arg6 - this.aClass76_11.method2256(arg4) / 2, 0, arg4, arg5, null, arg0, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
	public final void method5587(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5574(arg3, -1);
			this.method5578(arg2 - this.aClass76_11.method2256(arg0), 0, arg0, null, null, null, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method5588(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5574(arg4, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg2 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) local24 / 3.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method5576(null, null, arg0, arg1, arg3 - this.aClass76_11.method2256(arg1) / 2, local19, local22);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;II[II[Lclient!gl;II)V")
	public final void method5590(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Class2[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 != null) {
			this.method5574(arg6, arg5);
			this.method5578(arg2 - this.aClass76_11.method2256(arg0), 0, arg0, arg4, null, arg3, arg1, 0);
		}
	}
}
