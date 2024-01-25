import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class25 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!tba;")
	private final Class315 aClass315_15;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!ha;")
	private final Class33 aClass33_12;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;)V")
	protected Class25(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class315 arg1) {
		this.aClass315_15 = arg1;
		this.aClass33_12 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ac;Ljava/util/Random;Ljava/lang/String;IBIII[II)I")
	public final int method5837(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int[] arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg1.setSeed((long) arg6);
		@Pc(21) int local21 = (arg1.nextInt() & 0x1F) + 192;
		this.method5839(local21 << 24 | 0xFFFFFF, (local21 | 0x0) << 24);
		@Pc(41) int local41 = arg2.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg1.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method5840(arg4, arg3, arg5, null, arg0, local44, arg2);
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method5839(arg0, arg1);
			this.method5849(null, null, 0, 0, arg4, arg3, arg2, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static22.anInt233 = arg0;
		Static137.anInt3520 = arg0;
		Static411.anInt7698 = -1;
		Static484.anInt8614 = 0;
		Static259.anInt5717 = 0;
		Static137.anInt3519 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static85.anInt2279 = arg1;
		Static178.anInt4222 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[II[I[Lclient!ac;[ILjava/lang/String;)V")
	private void method5840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class5[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6) {
		@Pc(11) int local11 = arg1 - this.aClass315_15.anInt9184;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg6.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(38) char local38 = (char) (Static306.method5197(arg6.charAt(local22)) & 0xFF);
			if (local38 == '<') {
				local13 = local22;
			} else {
				@Pc(106) int local106;
				@Pc(116) int local116;
				if (local38 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg6.substring(local13 + 1, local22);
					local13 = -1;
					if (local60.equals("lt")) {
						local38 = '<';
					} else if (local60.equals("gt")) {
						local38 = '>';
					} else if (local60.equals("nbsp")) {
						local38 = ' ';
					} else if (local60.equals("shy")) {
						local38 = '\u00ad';
					} else if (local60.equals("times")) {
						local38 = '×';
					} else if (local60.equals("euro")) {
						local38 = '€';
					} else if (local60.equals("copy")) {
						local38 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local106 = 0;
									} else {
										local106 = arg5[local17];
									}
									if (arg3 == null) {
										local116 = 0;
									} else {
										local116 = arg3[local17];
									}
									local17++;
									@Pc(129) int local129 = Static607.method8246(local60.substring(4));
									@Pc(133) Class5 local133 = arg4[local129];
									@Pc(142) int local142 = arg2 == null ? local133.method7585() : arg2[local129];
									local133.method7595(local106 + arg0, local116 + -local142 + this.aClass315_15.anInt9184 + local11, 1, 0, 1);
									local15 = -1;
									arg0 += arg4[local129].method7589();
								} catch (@Pc(171) Exception local171) {
								}
							} else {
								this.method5848(local60);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass315_15.method7567(local38, local15);
					}
					@Pc(230) int local230;
					if (arg5 == null) {
						local230 = 0;
					} else {
						local230 = arg5[local17];
					}
					if (arg3 == null) {
						local106 = 0;
					} else {
						local106 = arg3[local17];
					}
					local17++;
					if (local38 != ' ') {
						if ((Static178.anInt4222 & 0xFF000000) != 0) {
							this.fa(local38, arg0 + local230 + 1, local106 + local11 + 1, Static178.anInt4222, true);
						}
						this.fa(local38, local230 + arg0, local106 + local11, Static137.anInt3520, false);
					} else if (Static484.anInt8614 > 0) {
						Static259.anInt5717 += Static484.anInt8614;
						arg0 += Static259.anInt5717 >> 8;
						Static259.anInt5717 &= 0xFF;
					}
					local116 = this.aClass315_15.method7570(local38);
					if (Static411.anInt7698 != -1) {
						this.aClass33_12.method6162(local116, (int) ((double) this.aClass315_15.anInt9184 * 0.7D) + local11, Static411.anInt7698, arg0);
					}
					if (Static137.anInt3519 != -1) {
						this.aClass33_12.method6162(local116, this.aClass315_15.anInt9184 + local11, Static137.anInt3519, arg0);
					}
					local15 = local38;
					arg0 += local116;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIILjava/lang/String;II)V")
	public final void method5842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5839(arg4, -16777216);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
			local19[local33] = (int) (Math.sin((double) arg1 / 5.0D + (double) local33 / 2.0D) * 5.0D);
		}
		this.method5840(arg0 - this.aClass315_15.method7572(arg3) / 2, arg2, null, local19, null, null, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method5843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5839(arg2, arg1);
			this.method5849(null, null, 0, 0, arg0, arg4 - this.aClass315_15.method7572(arg3) / 2, arg3, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public final void method5844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 == null) {
			return;
		}
		this.method5839(arg1, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg2 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(33) int local33 = arg4.length();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = (int) (Math.sin((double) local38 / 1.5D + (double) arg5) * local20);
		}
		this.method5840(arg0 - this.aClass315_15.method7572(arg4) / 2, arg3, null, local36, null, null, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method5845(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ac;IILjava/lang/String;III[I)V")
	public final void method5846(@OriginalArg(0) Class5[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg2 != null) {
			this.method5839(arg1, 0);
			this.method5849(arg0, arg5, 0, 0, arg3, arg4, arg2, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5848(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static137.anInt3520 = Static137.anInt3520 & 0xFF000000 | Static484.method7111(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static137.anInt3520 = Static22.anInt233 & 0xFFFFFF | Static137.anInt3520 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static137.anInt3520 = Static484.method7111(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static137.anInt3520 = Static22.anInt233;
			} else if (arg0.startsWith("str=")) {
				Static411.anInt7698 = Static137.anInt3520 & 0xFF000000 | Static484.method7111(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static411.anInt7698 = Static137.anInt3520 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static411.anInt7698 = -1;
			} else if (arg0.startsWith("u=")) {
				Static137.anInt3519 = Static137.anInt3520 & 0xFF000000 | Static484.method7111(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static137.anInt3519 = Static137.anInt3520 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static137.anInt3519 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static178.anInt4222 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static178.anInt4222 = Static137.anInt3520 & 0xFF000000 | Static484.method7111(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static178.anInt4222 = Static137.anInt3520 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static178.anInt4222 = Static85.anInt2279;
			} else if (arg0.equals("br")) {
				this.method5839(Static22.anInt233, Static85.anInt2279);
			}
		} catch (@Pc(184) Exception local184) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ac;[IIIIIILjava/lang/String;Lclient!aa;)V")
	private void method5849(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(11) int local11 = arg4 - this.aClass315_15.anInt9184;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg6.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static306.method5197(arg6.charAt(local20)) & 0xFF);
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
									@Pc(116) int local116 = Static607.method8246(local56.substring(4));
									@Pc(120) Class5 local120 = arg0[local116];
									@Pc(129) int local129 = arg1 == null ? local120.method7585() : arg1[local116];
									if ((Static137.anInt3520 & 0xFF000000) == -16777216) {
										local120.method7595(arg5, this.aClass315_15.anInt9184 + local11 - local129, 1, 0, 1);
									} else {
										local120.method7595(arg5, this.aClass315_15.anInt9184 + local11 - local129, 0, Static137.anInt3520 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg5 += arg0[local116].method7589();
									local15 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else {
								this.method5848(local56);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass315_15.method7567(local31, local15);
					}
					if (local31 == ' ') {
						if (Static484.anInt8614 > 0) {
							Static259.anInt5717 += Static484.anInt8614;
							arg5 += Static259.anInt5717 >> 8;
							Static259.anInt5717 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static178.anInt4222 & 0xFF000000) != 0) {
							this.fa(local31, arg5 + 1, local11 + 1, Static178.anInt4222, true);
						}
						this.fa(local31, arg5, local11, Static137.anInt3520, false);
					} else {
						if ((Static178.anInt4222 & 0xFF000000) != 0) {
							this.method5845(local31, arg5 + 1, local11 + 1, Static178.anInt4222, true, arg7, arg2, arg3);
						}
						this.method5845(local31, arg5, local11, Static137.anInt3520, false, arg7, arg2, arg3);
					}
					@Pc(310) int local310 = this.aClass315_15.method7570(local31);
					if (Static411.anInt7698 != -1) {
						this.aClass33_12.method6162(local310, (int) ((double) this.aClass315_15.anInt9184 * 0.7D) + local11, Static411.anInt7698, arg5);
					}
					if (Static137.anInt3519 != -1) {
						this.aClass33_12.method6162(local310, local11 + this.aClass315_15.anInt9184 + 1, Static137.anInt3519, arg5);
					}
					local15 = local31;
					arg5 += local310;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;[IIIII[Lclient!ac;II[IIIILjava/util/Random;)I")
	public final int method5850(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Random arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg13.setSeed((long) arg3);
		@Pc(21) int local21 = (arg13.nextInt() & 0x1F) + 192;
		this.method5839(arg10 & 0xFFFFFF | local21 << 24, arg6 & 0xFFFFFF | local21 << 24);
		@Pc(63) int local63 = arg1.length();
		@Pc(66) int[] local66 = new int[local63];
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < local63; local70++) {
			local66[local70] = local68;
			if ((arg13.nextInt() & 0x3) == 0) {
				local68++;
			}
		}
		@Pc(88) int local88 = arg4;
		@Pc(94) int local94 = this.aClass315_15.anInt9174 + arg11;
		if (arg0 == 1) {
			local94 += (arg5 - this.aClass315_15.anInt9174 - this.aClass315_15.anInt9180) / 2;
		} else if (arg0 == 2) {
			local94 = arg11 + arg5 - this.aClass315_15.anInt9180;
		}
		@Pc(127) int local127 = -1;
		if (arg8 == 1) {
			local127 = local68 + this.aClass315_15.method7572(arg1);
			local88 = arg4 + (arg12 - local127) / 2;
		} else if (arg8 == 2) {
			local127 = this.aClass315_15.method7572(arg1) + local68;
			local88 = arg4 + arg12 - local127;
		}
		this.method5840(local88, local94, arg9, null, arg7, local66, arg1);
		if (arg2 != null) {
			if (local127 == -1) {
				local127 = this.aClass315_15.method7572(arg1) + local68;
			}
			arg2[1] = local94 - this.aClass315_15.anInt9174;
			arg2[0] = local88;
			arg2[3] = this.aClass315_15.anInt9180 + this.aClass315_15.anInt9174;
			arg2[2] = local127;
		}
		return local68;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII[Lclient!ac;IIII[IIILclient!aa;IILjava/lang/String;)I")
	public final int method5852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class1 arg13, @OriginalArg(14) int arg14, @OriginalArg(16) String arg15) {
		if (arg15 == null) {
			return 0;
		}
		this.method5839(arg2, arg8);
		if (arg9 == 0) {
			arg9 = this.aClass315_15.anInt9184;
		}
		@Pc(64) int[] local64;
		if (arg9 + this.aClass315_15.anInt9174 + this.aClass315_15.anInt9180 > arg14 && arg9 + arg9 > arg14) {
			local64 = null;
		} else {
			local64 = new int[] { arg7 };
		}
		if (arg6 == -1) {
			arg6 = arg14 / arg9;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		@Pc(89) int local89 = this.aClass315_15.method7573(arg5, local64, Static326.aStringArray25, arg15);
		if (arg6 > 0 && local89 >= arg6) {
			local89 = arg6;
			Static326.aStringArray25[arg6 - 1] = this.aClass315_15.method7565(Static326.aStringArray25[arg6 - 1], arg5, arg7);
		}
		if (arg1 == 3 && local89 == 1) {
			arg1 = 1;
		}
		@Pc(131) int local131;
		@Pc(160) int local160;
		if (arg1 == 0) {
			local131 = arg4 + this.aClass315_15.anInt9174;
		} else if (arg1 == 1) {
			local131 = this.aClass315_15.anInt9174 + arg4 + (arg14 - arg9 * (local89 - 1) - this.aClass315_15.anInt9180 - this.aClass315_15.anInt9174) / 2;
		} else if (arg1 == 2) {
			local131 = arg4 + arg14 - arg9 * (local89 - 1) - this.aClass315_15.anInt9180;
		} else {
			local160 = (arg14 - this.aClass315_15.anInt9180 - this.aClass315_15.anInt9174 - arg9 * (local89 + -1)) / (local89 + 1);
			if (local160 < 0) {
				local160 = 0;
			}
			arg9 += local160;
			local131 = local160 + this.aClass315_15.anInt9174 + arg4;
		}
		for (local160 = 0; local160 < local89; local160++) {
			if (arg12 == 0) {
				this.method5849(arg5, arg10, arg3, arg0, local131, arg11, Static326.aStringArray25[local160], arg13);
			} else if (arg12 == 1) {
				this.method5849(arg5, arg10, arg3, arg0, local131, (arg7 - this.aClass315_15.method7572(Static326.aStringArray25[local160])) / 2 + arg11, Static326.aStringArray25[local160], arg13);
			} else if (arg12 == 2) {
				this.method5849(arg5, arg10, arg3, arg0, local131, arg7 + arg11 - this.aClass315_15.method7572(Static326.aStringArray25[local160]), Static326.aStringArray25[local160], arg13);
			} else if (local160 == local89 - 1) {
				this.method5849(arg5, arg10, arg3, arg0, local131, arg11, Static326.aStringArray25[local160], arg13);
			} else {
				this.method5854(arg7, Static326.aStringArray25[local160]);
				this.method5849(arg5, arg10, arg3, arg0, local131, arg11, Static326.aStringArray25[local160], arg13);
				Static484.anInt8614 = 0;
			}
			local131 += arg9;
		}
		return local89;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method5854(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(17) int local17 = 0;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; arg1.length() > local21; local21++) {
			@Pc(27) char local27 = arg1.charAt(local21);
			if (local27 == '<') {
				local19 = true;
			} else if (local27 == '>') {
				local19 = false;
			} else if (!local19 && local27 == ' ') {
				local17++;
			}
		}
		if (local17 > 0) {
			Static484.anInt8614 = (arg0 - this.aClass315_15.method7572(arg1) << 8) / local17;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5855(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5839(arg4, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg0 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method5840(arg3 - this.aClass315_15.method7572(arg1) / 2, arg2, null, local22, null, local19, arg1);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IILjava/lang/String;III)V")
	public final void method5856(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5839(arg4, arg2);
			this.method5849(null, null, 0, 0, arg3, arg0 - this.aClass315_15.method7572(arg1), arg1, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILclient!aa;IILjava/lang/String;[II[Lclient!ac;IIIII)I")
	public final int method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class5[] arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method5852(arg14, arg9, arg6, arg13, arg11, arg10, 0, arg1, arg3, arg2, arg8, arg0, arg12, arg4, arg5, arg7);
	}
}
