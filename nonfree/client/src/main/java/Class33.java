import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class33 {

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!hi;")
	private final Class80 aClass80_18;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!fp;")
	private final Class63 aClass63_8;

	static {
		new Class106(" days.", " Tage.", " jours.", " dias.");
		new Class106("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!fp;Lclient!hi;)V")
	protected Class33(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class80 arg1) {
		this.aClass80_18 = arg1;
		this.aClass63_8 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/util/Random;ILjava/lang/String;[Lclient!ae;IIIII[I)I")
	public final int method6020(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class4[] arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int[] arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg0.setSeed((long) arg4);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method6031(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(45) int local45 = arg2.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg0.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method6037(arg6, arg3, arg1, arg5, local48, null, arg2);
		return local50;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public final void method6021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method6031(arg2, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg0 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg3.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(40) int local40 = 0; local40 < local29; local40++) {
			local32[local40] = (int) (Math.sin((double) arg4 + (double) local40 / 1.5D) * local20);
		}
		this.method6037(null, null, arg5, arg1 - this.aClass80_18.method2543(arg3) / 2, null, local32, arg3);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method6022(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) int local13 = 0;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < arg1.length(); local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 == '<') {
				local15 = true;
			} else if (local23 == '>') {
				local15 = false;
			} else if (!local15 && local23 == ' ') {
				local13++;
			}
		}
		if (local13 > 0) {
			Static229.anInt4649 = (arg0 - this.aClass80_18.method2543(arg1) << 8) / local13;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(CIIIZLclient!tm;II)V")
	protected abstract void method6023(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class92 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method6024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6031(arg3, arg0);
			this.method6029(null, null, arg1, 0, arg2, null, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method6025(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method6031(arg2, -1);
			this.method6029(null, null, arg0, 0, arg3, null, 0, arg1 - this.aClass80_18.method2543(arg3));
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII[IZII[Lclient!ae;IILclient!tm;ILjava/lang/String;I)I")
	public final int method6026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class92 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13, @OriginalArg(15) int arg14) {
		if (arg13 == null) {
			return 0;
		}
		this.method6031(arg6, arg0);
		if (arg3 == 0) {
			arg3 = this.aClass80_18.anInt2617;
		}
		@Pc(49) int[] local49;
		if (arg3 + this.aClass80_18.anInt2625 + this.aClass80_18.anInt2611 > arg12 && arg3 + arg3 > arg12) {
			local49 = null;
		} else {
			local49 = new int[] { arg10 };
		}
		@Pc(62) int local62 = this.aClass80_18.method2540(arg8, local49, Static9.aStringArray1, arg13);
		if (arg4 == 3 && local62 == 1) {
			arg4 = 1;
		}
		@Pc(78) int local78;
		@Pc(128) int local128;
		if (arg4 == 0) {
			local78 = this.aClass80_18.anInt2625 + arg1;
		} else if (arg4 == 1) {
			local78 = (arg12 - this.aClass80_18.anInt2625 - this.aClass80_18.anInt2611 - arg3 * (local62 + -1)) / 2 + this.aClass80_18.anInt2625 + arg1;
		} else if (arg4 == 2) {
			local78 = arg1 + arg12 - arg3 * (local62 - 1) - this.aClass80_18.anInt2611;
		} else {
			local128 = (arg12 - arg3 * (local62 - 1) - this.aClass80_18.anInt2625 - this.aClass80_18.anInt2611) / (local62 - -1);
			if (local128 < 0) {
				local128 = 0;
			}
			arg3 += local128;
			local78 = arg1 + this.aClass80_18.anInt2625 + local128;
		}
		for (local128 = 0; local128 < local62; local128++) {
			if (arg14 == 0) {
				this.method6029(arg8, arg11, local78, arg2, Static9.aStringArray1[local128], arg5, arg7, arg9);
			} else if (arg14 == 1) {
				this.method6029(arg8, arg11, local78, arg2, Static9.aStringArray1[local128], arg5, arg7, (arg10 - this.aClass80_18.method2543(Static9.aStringArray1[local128])) / 2 + arg9);
			} else if (arg14 == 2) {
				this.method6029(arg8, arg11, local78, arg2, Static9.aStringArray1[local128], arg5, arg7, arg9 + arg10 - this.aClass80_18.method2543(Static9.aStringArray1[local128]));
			} else if (local62 - 1 == local128) {
				this.method6029(arg8, arg11, local78, arg2, Static9.aStringArray1[local128], arg5, arg7, arg9);
			} else {
				this.method6022(arg10, Static9.aStringArray1[local128]);
				this.method6029(arg8, arg11, local78, arg2, Static9.aStringArray1[local128], arg5, arg7, arg9);
				Static229.anInt4649 = 0;
			}
			local78 += arg3;
		}
		return local62;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6027(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static301.anInt5791 = Static301.anInt5791 & 0xFF000000 | Static327.method3849(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static301.anInt5791 = Static182.anInt3709 & 0xFFFFFF | Static301.anInt5791 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static301.anInt5791 = Static327.method3849(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static301.anInt5791 = Static182.anInt3709;
			} else if (arg0.startsWith("str=")) {
				Static56.anInt1436 = Static327.method3849(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static56.anInt1436 = -8388608;
			} else if (arg0.equals("/str")) {
				Static56.anInt1436 = -1;
			} else if (arg0.startsWith("u=")) {
				Static139.anInt3014 = Static327.method3849(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static139.anInt3014 = -16777216;
			} else if (arg0.equals("/u")) {
				Static139.anInt3014 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static343.anInt6512 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static343.anInt6512 = Static327.method3849(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static343.anInt6512 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static343.anInt6512 = Static291.anInt5646;
			} else if (arg0.equals("br")) {
				this.method6031(Static182.anInt3709, Static291.anInt5646);
				return;
			}
		} catch (@Pc(159) Exception local159) {
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method6028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method6031(arg1, -16777216);
		@Pc(14) int local14 = arg3.length();
		@Pc(17) int[] local17 = new int[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = (int) (Math.sin((double) arg4 / 5.0D + (double) local19 / 2.0D) * 5.0D);
		}
		this.method6037(null, null, arg2, arg0 - this.aClass80_18.method2543(arg3) / 2, null, local17, arg3);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([Lclient!ae;Lclient!tm;IILjava/lang/String;[IZII)V")
	private void method6029(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass80_18.anInt2617;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg4.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static352.method1726(arg4.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local17 = local24;
			} else {
				if (local35 == '>' && local17 != -1) {
					@Pc(57) String local57 = arg4.substring(local17 + 1, local24);
					local17 = -1;
					if (local57.equals("lt")) {
						local35 = '<';
					} else if (local57.equals("gt")) {
						local35 = '>';
					} else if (local57.equals("nbsp")) {
						local35 = ' ';
					} else if (local57.equals("shy")) {
						local35 = '\u00ad';
					} else if (local57.equals("times")) {
						local35 = '×';
					} else if (local57.equals("euro")) {
						local35 = '€';
					} else if (local57.equals("copy")) {
						local35 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									@Pc(113) int local113 = Static171.method3207(local57.substring(4));
									@Pc(117) Class4 local117 = arg0[local113];
									@Pc(126) int local126 = arg5 == null ? local117.method5963() : arg5[local113];
									if ((Static301.anInt5791 & 0xFF000000) == -16777216) {
										local117.method5957(arg7, this.aClass80_18.anInt2617 + local7 - local126, 0, 0);
									} else {
										local117.method5957(arg7, this.aClass80_18.anInt2617 + local7 - local126, 1, Static301.anInt5791 & 0xFF000000 | 0xFFFFFF);
									}
									local19 = -1;
									arg7 += arg0[local113].method5961();
								} catch (@Pc(178) Exception local178) {
								}
							} else {
								this.method6027(local57);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg7 += this.aClass80_18.method2537(local35, local19);
					}
					if (local35 == ' ') {
						if (Static229.anInt4649 > 0) {
							Static345.anInt6539 += Static229.anInt4649;
							arg7 += Static345.anInt6539 >> 8;
							Static345.anInt6539 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static343.anInt6512 & 0xFF000000) != 0) {
							this.method6035(local35, arg7 + 1, local7 + 1, Static343.anInt6512, true);
						}
						this.method6035(local35, arg7, local7, Static301.anInt5791, false);
					} else {
						if ((Static343.anInt6512 & 0xFF000000) != 0) {
							this.method6023(local35, arg7 + 1, local7 - -1, Static343.anInt6512, true, arg1, arg6, arg3);
						}
						this.method6023(local35, arg7, local7, Static301.anInt5791, false, arg1, arg6, arg3);
					}
					@Pc(309) int local309 = this.aClass80_18.method2532(local35);
					if (Static56.anInt1436 != -1) {
						this.aClass63_8.method4615(arg7, Static56.anInt1436, local309, (int) ((double) this.aClass80_18.anInt2617 * 0.7D) + local7);
					}
					if (Static139.anInt3014 != -1) {
						this.aClass63_8.method4615(arg7, Static139.anInt3014, local309, local7 + this.aClass80_18.anInt2617 + 1);
					}
					arg7 += local309;
					local19 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	private void method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static139.anInt3014 = -1;
		Static182.anInt3709 = arg0;
		Static301.anInt5791 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static56.anInt1436 = -1;
		Static229.anInt4649 = 0;
		Static345.anInt6539 = 0;
		Static291.anInt5646 = arg1;
		Static343.anInt6512 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;[Lclient!ae;III[II)V")
	public final void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class4[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 != null) {
			this.method6031(arg5, 0);
			this.method6029(arg2, null, arg0, 0, arg1, arg4, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[Lclient!ae;IIIIIBILjava/util/Random;ILjava/lang/String;I[I[I)I")
	public final int method6033(@OriginalArg(0) int arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Random arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int[] arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg8.setSeed((long) arg5);
		@Pc(20) int local20 = (arg8.nextInt() & 0x1F) + 192;
		this.method6031(arg0 & 0xFFFFFF | local20 << 24, arg2 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg10.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(53) int local53 = 0; local53 < local40; local53++) {
			local43[local53] = local45;
			if ((arg8.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(78) int local78 = arg4;
		@Pc(85) int local85 = arg3 + this.aClass80_18.anInt2625;
		@Pc(87) int local87 = -1;
		if (arg11 == 1) {
			local85 += (arg6 - this.aClass80_18.anInt2625 - this.aClass80_18.anInt2611) / 2;
		} else if (arg11 == 2) {
			local85 = arg6 + arg3 - this.aClass80_18.anInt2611;
		}
		if (arg7 == 1) {
			local87 = this.aClass80_18.method2543(arg10) + local45;
			local78 = arg4 + (arg9 - local87) / 2;
		} else if (arg7 == 2) {
			local87 = this.aClass80_18.method2543(arg10) + local45;
			local78 = arg4 + arg9 - local87;
		}
		this.method6037(arg13, arg1, local85, local78, local43, null, arg10);
		if (arg12 != null) {
			if (local87 == -1) {
				local87 = local45 + this.aClass80_18.method2543(arg10);
			}
			arg12[0] = local78;
			arg12[1] = local85 - this.aClass80_18.anInt2625;
			arg12[2] = local87;
			arg12[3] = this.aClass80_18.anInt2625 + this.aClass80_18.anInt2611;
		}
		return local45;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method6035(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
	public final void method6036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6031(arg0, arg3);
			this.method6029(null, null, arg1, 0, arg2, null, 0, arg4 - this.aClass80_18.method2543(arg2) / 2);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([I[Lclient!ae;III[I[ILjava/lang/String;)V")
	private void method6037(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6) {
		@Pc(7) int local7 = arg2 - this.aClass80_18.anInt2617;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg6.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static352.method1726(arg6.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(116) int local116;
				@Pc(124) int local124;
				if (local33 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg6.substring(local13 + 1, local22);
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
									if (arg4 == null) {
										local116 = 0;
									} else {
										local116 = arg4[local17];
									}
									if (arg5 == null) {
										local124 = 0;
									} else {
										local124 = arg5[local17];
									}
									local17++;
									@Pc(137) int local137 = Static171.method3207(local56.substring(4));
									@Pc(141) Class4 local141 = arg1[local137];
									@Pc(150) int local150 = arg0 == null ? local141.method5963() : arg0[local137];
									local141.method5957(arg3 + local116, local124 + -local150 + this.aClass80_18.anInt2617 + local7, 0, 0);
									local15 = -1;
									arg3 += arg1[local137].method5961();
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method6027(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass80_18.method2537(local33, local15);
					}
					@Pc(227) int local227;
					if (arg4 == null) {
						local227 = 0;
					} else {
						local227 = arg4[local17];
					}
					if (arg5 == null) {
						local116 = 0;
					} else {
						local116 = arg5[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static343.anInt6512 & 0xFF000000) != 0) {
							this.method6035(local33, arg3 + local227 + 1, local7 + 1 + local116, Static343.anInt6512, true);
						}
						this.method6035(local33, local227 + arg3, local116 + local7, Static301.anInt5791, false);
					} else if (Static229.anInt4649 > 0) {
						Static345.anInt6539 += Static229.anInt4649;
						arg3 += Static345.anInt6539 >> 8;
						Static345.anInt6539 &= 0xFF;
					}
					local124 = this.aClass80_18.method2532(local33);
					if (Static56.anInt1436 != -1) {
						this.aClass63_8.method4615(arg3, Static56.anInt1436, local124, local7 + (int) ((double) this.aClass80_18.anInt2617 * 0.7D));
					}
					if (Static139.anInt3014 != -1) {
						this.aClass63_8.method4615(arg3, Static139.anInt3014, local124, this.aClass80_18.anInt2617 + local7);
					}
					arg3 += local124;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method6038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method6031(arg4, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg3 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg3 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method6037(null, null, arg0, arg1 - this.aClass80_18.method2543(arg2) / 2, local19, local22, arg2);
	}
}
