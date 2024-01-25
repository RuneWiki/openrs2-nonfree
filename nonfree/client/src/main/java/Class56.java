import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class56 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!re;")
	private final Class210 aClass210_9;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!qa;")
	private final Class26 aClass26_10;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qa;Lclient!re;)V")
	protected Class56(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class210 arg1) {
		this.aClass210_9 = arg1;
		this.aClass26_10 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method5837(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5854(arg1, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(25) int[] local25 = new int[local16];
		@Pc(28) int[] local28 = new int[local16];
		for (@Pc(30) int local30 = 0; local30 < local16; local30++) {
			local25[local30] = (int) (Math.sin((double) local30 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method5838(local28, arg0, null, arg2, local25, arg3 - this.aClass210_9.method4758(arg2) / 2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IBI[Lclient!f;Ljava/lang/String;[II[I)V")
	private void method5838(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg1 - this.aClass210_9.anInt5956;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg3.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static49.method988(arg3.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local13 = local30;
			} else {
				@Pc(124) int local124;
				@Pc(132) int local132;
				if (local41 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg3.substring(local13 + 1, local30);
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
									if (arg4 == null) {
										local124 = 0;
									} else {
										local124 = arg4[local25];
									}
									if (arg0 == null) {
										local132 = 0;
									} else {
										local132 = arg0[local25];
									}
									local25++;
									@Pc(145) int local145 = Static175.method2762(local64.substring(4));
									@Pc(149) Class76 local149 = arg2[local145];
									@Pc(158) int local158 = arg6 == null ? local149.JA() : arg6[local145];
									local149.YA(arg5 + local124, -local158 + this.aClass210_9.anInt5956 + local11 + local132, 1, 0, 1);
									arg5 += arg2[local145].ja();
									local15 = -1;
								} catch (@Pc(188) Exception local188) {
								}
							} else {
								this.method5856(local64);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass210_9.method4749(local41, local15);
					}
					@Pc(231) int local231;
					if (arg4 == null) {
						local231 = 0;
					} else {
						local231 = arg4[local25];
					}
					if (arg0 == null) {
						local124 = 0;
					} else {
						local124 = arg0[local25];
					}
					local25++;
					if (local41 != ' ') {
						if ((Static255.anInt4806 & 0xFF000000) != 0) {
							this.B(local41, arg5 + local231 + 1, local124 + local11 + 1, Static255.anInt4806, true);
						}
						this.B(local41, local231 + arg5, local11 - -local124, Static100.anInt7602, false);
					} else if (Static162.anInt3180 > 0) {
						Static422.anInt7374 += Static162.anInt3180;
						arg5 += Static422.anInt7374 >> 8;
						Static422.anInt7374 &= 0xFF;
					}
					local132 = this.aClass210_9.method4747(local41);
					if (Static19.anInt416 != -1) {
						this.aClass26_10.method2237(Static19.anInt416, local132, (int) ((double) this.aClass210_9.anInt5956 * 0.7D) + local11, arg5);
					}
					if (Static212.anInt4077 != -1) {
						this.aClass26_10.method2237(Static212.anInt4077, local132, local11 + this.aClass210_9.anInt5956, arg5);
					}
					arg5 += local132;
					local15 = local41;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIILclient!ea;Ljava/lang/String;[Lclient!f;I[III)I")
	public final int method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class14 arg10, @OriginalArg(11) String arg11, @OriginalArg(12) Class76[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int[] arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method5854(arg7, arg0);
		if (arg1 == 0) {
			arg1 = this.aClass210_9.anInt5956;
		}
		@Pc(50) int[] local50;
		if (arg1 + this.aClass210_9.anInt5944 + this.aClass210_9.anInt5946 > arg13 && arg13 < arg1 + arg1) {
			local50 = null;
		} else {
			local50 = new int[] { arg5 };
		}
		if (arg4 == -1) {
			arg4 = arg13 / arg1;
			if (arg4 <= 0) {
				arg4 = 1;
			}
		}
		@Pc(74) int local74 = this.aClass210_9.method4756(Static218.aStringArray5, arg11, arg12, local50);
		if (arg4 > 0 && local74 >= arg4) {
			local74 = arg4;
			Static218.aStringArray5[arg4 - 1] = this.aClass210_9.method4751(Static218.aStringArray5[arg4 - 1], arg12, arg5);
		}
		if (arg3 == 3 && local74 == 1) {
			arg3 = 1;
		}
		@Pc(145) int local145;
		@Pc(169) int local169;
		if (arg3 == 0) {
			local145 = arg2 + this.aClass210_9.anInt5946;
		} else if (arg3 == 1) {
			local145 = arg2 + this.aClass210_9.anInt5946 + (arg13 - this.aClass210_9.anInt5946 - this.aClass210_9.anInt5944 - (local74 + -1) * arg1) / 2;
		} else if (arg3 == 2) {
			local145 = arg2 + arg13 - this.aClass210_9.anInt5944 - (local74 + -1) * arg1;
		} else {
			local169 = (arg13 - this.aClass210_9.anInt5944 - this.aClass210_9.anInt5946 - arg1 * (local74 + -1)) / (local74 + 1);
			if (local169 < 0) {
				local169 = 0;
			}
			local145 = this.aClass210_9.anInt5946 + arg2 + local169;
			arg1 += local169;
		}
		for (local169 = 0; local169 < local74; local169++) {
			if (arg15 == 0) {
				this.method5846(arg9, arg12, arg6, arg10, arg8, Static218.aStringArray5[local169], local145, arg14);
			} else if (arg15 == 1) {
				this.method5846(arg9 + (arg5 - this.aClass210_9.method4758(Static218.aStringArray5[local169])) / 2, arg12, arg6, arg10, arg8, Static218.aStringArray5[local169], local145, arg14);
			} else if (arg15 == 2) {
				this.method5846(arg9 + arg5 - this.aClass210_9.method4758(Static218.aStringArray5[local169]), arg12, arg6, arg10, arg8, Static218.aStringArray5[local169], local145, arg14);
			} else if (local74 - 1 == local169) {
				this.method5846(arg9, arg12, arg6, arg10, arg8, Static218.aStringArray5[local169], local145, arg14);
			} else {
				this.method5845(arg5, Static218.aStringArray5[local169]);
				this.method5846(arg9, arg12, arg6, arg10, arg8, Static218.aStringArray5[local169], local145, arg14);
				Static162.anInt3180 = 0;
			}
			local145 += arg1;
		}
		return local74;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method5840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5854(arg2, -16777216);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) arg4 / 5.0D + (double) local21 / 2.0D) * 5.0D);
		}
		this.method5838(local19, arg0, null, arg3, null, arg1 - this.aClass210_9.method4758(arg3) / 2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;[IIILjava/util/Random;IIII[Lclient!f;)I")
	public final int method5843(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class76[] arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg2);
		@Pc(21) int local21 = (arg3.nextInt() & 0x1F) + 192;
		this.method5854(local21 << 24 | 0xFFFFFF, (local21 | 0x0) << 24);
		@Pc(41) int local41 = arg0.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local41; local56++) {
			local44[local56] = local54;
			if ((arg3.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		this.method5838(null, arg5, arg6, arg0, local44, arg4, arg1);
		return local54;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public final void method5844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5854(arg2, arg0);
			this.method5846(arg3 - this.aClass210_9.method4758(arg4) / 2, null, 0, null, 0, arg4, arg1, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5845(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
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
			Static162.anInt3180 = (arg0 - this.aClass210_9.method4758(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!f;IILclient!ea;ILjava/lang/String;I[I)V")
	private void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) Class76[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(11) int local11 = arg6 - this.aClass210_9.anInt5956;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg5.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static49.method988(arg5.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(51) String local51 = arg5.substring(local13 + 1, local20);
					local13 = -1;
					if (local51.equals("lt")) {
						local31 = '<';
					} else if (local51.equals("gt")) {
						local31 = '>';
					} else if (local51.equals("nbsp")) {
						local31 = ' ';
					} else if (local51.equals("shy")) {
						local31 = '\u00ad';
					} else if (local51.equals("times")) {
						local31 = '×';
					} else if (local51.equals("euro")) {
						local31 = '€';
					} else if (local51.equals("copy")) {
						local31 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=")) {
								try {
									@Pc(115) int local115 = Static175.method2762(local51.substring(4));
									@Pc(119) Class76 local119 = arg1[local115];
									@Pc(128) int local128 = arg7 == null ? local119.JA() : arg7[local115];
									if ((-16777216 & Static100.anInt7602) == -16777216) {
										local119.YA(arg0, local11 + this.aClass210_9.anInt5956 - local128, 1, 0, 1);
									} else {
										local119.YA(arg0, this.aClass210_9.anInt5956 + local11 - local128, 0, Static100.anInt7602 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg0 += arg1[local115].ja();
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method5856(local51);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass210_9.method4749(local31, local15);
					}
					if (local31 == ' ') {
						if (Static162.anInt3180 > 0) {
							Static422.anInt7374 += Static162.anInt3180;
							arg0 += Static422.anInt7374 >> 8;
							Static422.anInt7374 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static255.anInt4806 & 0xFF000000) != 0) {
							this.B(local31, arg0 + 1, local11 + 1, Static255.anInt4806, true);
						}
						this.B(local31, arg0, local11, Static100.anInt7602, false);
					} else {
						if ((Static255.anInt4806 & 0xFF000000) != 0) {
							this.method5850(local31, arg0 + 1, local11 + 1, Static255.anInt4806, true, arg3, arg4, arg2);
						}
						this.method5850(local31, arg0, local11, Static100.anInt7602, false, arg3, arg4, arg2);
					}
					@Pc(301) int local301 = this.aClass210_9.method4747(local31);
					if (Static19.anInt416 != -1) {
						this.aClass26_10.method2237(Static19.anInt416, local301, (int) ((double) this.aClass210_9.anInt5956 * 0.7D) + local11, arg0);
					}
					if (Static212.anInt4077 != -1) {
						this.aClass26_10.method2237(Static212.anInt4077, local301, local11 + this.aClass210_9.anInt5956 + 1, arg0);
					}
					local15 = local31;
					arg0 += local301;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
	public final void method5848(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5854(arg2, arg4);
			this.method5846(arg3, null, 0, null, 0, arg0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[Lclient!f;II[IILjava/lang/String;)V")
	public final void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method5854(arg3, 0);
			this.method5846(arg0, arg2, 0, null, 0, arg5, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	protected abstract void method5850(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLclient!ea;II[Lclient!f;IIIIII[IILjava/lang/String;)I")
	public final int method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class76[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(15) String arg12) {
		return this.method5839(arg0, 0, arg4, arg3, 0, arg7, arg6, arg8, arg1, arg10, arg2, arg12, arg5, arg9, arg11, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IBIIII)V")
	public final void method5852(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method5854(arg0, -16777216);
		@Pc(43) double local43 = 7.0D - (double) arg2 / 8.0D;
		if (local43 < 0.0D) {
			local43 = 0.0D;
		}
		@Pc(52) int local52 = arg1.length();
		@Pc(55) int[] local55 = new int[local52];
		for (@Pc(57) int local57 = 0; local57 < local52; local57++) {
			local55[local57] = (int) (local43 * Math.sin((double) local57 / 1.5D + (double) arg5));
		}
		this.method5838(local55, arg3, null, arg1, null, arg4 - this.aClass210_9.method4758(arg1) / 2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5853(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5854(arg3, -1);
			this.method5846(arg2 - this.aClass210_9.method4758(arg0), null, 0, null, 0, arg0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)V")
	private void method5854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static19.anInt416 = -1;
		Static422.anInt7374 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static317.anInt5608 = arg0;
		Static100.anInt7602 = arg0;
		Static212.anInt4077 = -1;
		Static162.anInt3180 = 0;
		Static432.anInt7524 = arg1;
		Static255.anInt4806 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5856(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static100.anInt7602 = Static100.anInt7602 & 0xFF000000 | Static286.method2990(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static100.anInt7602 = Static317.anInt5608 & 0xFFFFFF | Static100.anInt7602 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static100.anInt7602 = Static286.method2990(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static100.anInt7602 = Static317.anInt5608;
			} else if (arg0.startsWith("str=")) {
				Static19.anInt416 = Static286.method2990(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static19.anInt416 = -8388608;
			} else if (arg0.equals("/str")) {
				Static19.anInt416 = -1;
			} else if (arg0.startsWith("u=")) {
				Static212.anInt4077 = Static286.method2990(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static212.anInt4077 = -16777216;
			} else if (arg0.equals("/u")) {
				Static212.anInt4077 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static255.anInt4806 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static255.anInt4806 = Static286.method2990(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static255.anInt4806 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static255.anInt4806 = Static432.anInt7524;
				return;
			} else if (arg0.equals("br")) {
				this.method5854(Static317.anInt5608, Static432.anInt7524);
				return;
			}
		} catch (@Pc(163) Exception local163) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB[IILjava/util/Random;I[ILjava/lang/String;IIII[Lclient!f;II)I")
	public final int method5857(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class76[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return 0;
		}
		arg3.setSeed((long) arg9);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method5854(local20 << 24 | arg8 & 0xFFFFFF, local20 << 24 | arg12 & 0xFFFFFF);
		@Pc(40) int local40 = arg6.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg4;
		@Pc(78) int local78 = this.aClass210_9.anInt5946 + arg0;
		@Pc(80) int local80 = -1;
		if (arg10 == 1) {
			local78 += (arg2 - this.aClass210_9.anInt5946 - this.aClass210_9.anInt5944) / 2;
		} else if (arg10 == 2) {
			local78 = arg2 + arg0 - this.aClass210_9.anInt5944;
		}
		if (arg7 == 1) {
			local80 = this.aClass210_9.method4758(arg6) + local45;
			local72 = arg4 + (arg13 - local80) / 2;
		} else if (arg7 == 2) {
			local80 = this.aClass210_9.method4758(arg6) + local45;
			local72 = arg4 + arg13 - local80;
		}
		this.method5838(null, local78, arg11, arg6, local43, local72, arg5);
		if (arg1 != null) {
			if (local80 == -1) {
				local80 = this.aClass210_9.method4758(arg6) + local45;
			}
			arg1[1] = local78 - this.aClass210_9.anInt5946;
			arg1[2] = local80;
			arg1[0] = local72;
			arg1[3] = this.aClass210_9.anInt5944 + this.aClass210_9.anInt5946;
		}
		return local45;
	}
}
