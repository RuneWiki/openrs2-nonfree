import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class57 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!ha;")
	private final Class22 aClass22_14;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!hw;")
	private final Class169 aClass169_13;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!hw;)V")
	protected Class57(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class169 arg1) {
		this.aClass22_14 = arg0;
		this.aClass169_13 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public final void method9131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method9140(arg0, arg2);
			this.method9141((Class178[]) null, arg1, 0, (Class1) null, arg3, 0, arg4, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([I[Lclient!kw;ILjava/lang/String;I[II[I)V")
	private void method9133(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class178[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg5 - this.aClass169_13.anInt4040;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static197.method6349(arg3.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(158) int local158;
				@Pc(168) int local168;
				if (local33 == '>' && local13 != -1) {
					@Pc(62) String local62 = arg3.substring(local13 + 1, local22);
					local13 = -1;
					if (local62.equals("lt")) {
						local33 = '<';
					} else if (local62.equals("gt")) {
						local33 = '>';
					} else if (local62.equals("nbsp")) {
						local33 = ' ';
					} else if (local62.equals("shy")) {
						local33 = '\u00ad';
					} else if (local62.equals("times")) {
						local33 = '×';
					} else if (local62.equals("euro")) {
						local33 = '€';
					} else if (local62.equals("copy")) {
						local33 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local158 = 0;
									} else {
										local158 = arg4[local17];
									}
									if (arg0 == null) {
										local168 = 0;
									} else {
										local168 = arg0[local17];
									}
									local17++;
									@Pc(181) int local181 = Static636.method8390(local62.substring(4));
									@Pc(185) Class178 local185 = arg1[local181];
									@Pc(195) int local195 = arg6 == null ? local185.method7632() : arg6[local181];
									local185.method7616(arg2 + local158, local168 + this.aClass169_13.anInt4040 + (local7 - local195), 1, 0, 1);
									arg2 += arg1[local181].method7627();
									local15 = -1;
								} catch (@Pc(224) Exception local224) {
								}
							} else {
								this.method9136(local62);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass169_13.method3656(local33, local15);
					}
					@Pc(268) int local268;
					if (arg4 == null) {
						local268 = 0;
					} else {
						local268 = arg4[local17];
					}
					if (arg0 == null) {
						local158 = 0;
					} else {
						local158 = arg0[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static636.anInt9852 & 0xFF000000) != 0) {
							this.fa(local33, local268 + arg2 + 1, local158 + 1 + local7, Static636.anInt9852, true);
						}
						this.fa(local33, arg2 + local268, local158 + local7, Static428.anInt6549, false);
					} else if (Static494.anInt7852 > 0) {
						Static50.anInt1333 += Static494.anInt7852;
						arg2 += Static50.anInt1333 >> 8;
						Static50.anInt1333 &= 0xFF;
					}
					local168 = this.aClass169_13.method3648(local33);
					if (Static474.anInt7473 != -1) {
						this.aClass22_14.method9402(local168, (int) ((double) this.aClass169_13.anInt4040 * 0.7D) + local7, Static474.anInt7473, arg2);
					}
					if (Static370.anInt5765 != -1) {
						this.aClass22_14.method9402(local168, local7 + this.aClass169_13.anInt4040, Static370.anInt5765, arg2);
					}
					local15 = local33;
					arg2 += local168;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
	public final void method9134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method9140(arg1, arg4);
			this.method9141((Class178[]) null, arg0, 0, (Class1) null, arg2 - this.aClass169_13.method3653(arg3), 0, arg3, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[III[Lclient!kw;IIIILjava/lang/String;ILclient!aa;BII)I")
	public final int method9135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class178[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) String arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class1 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method9138(arg13, arg1, arg7, arg8, arg2, arg0, arg3, arg6, arg9, arg5, arg10, arg12, arg14, arg4, 0, arg11);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method9136(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static428.anInt6549 = Static428.anInt6549 & 0xFF000000 | Static124.method2285(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static428.anInt6549 = Static300.anInt10426 & 0xFFFFFF | Static428.anInt6549 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static428.anInt6549 = Static124.method2285(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static428.anInt6549 = Static300.anInt10426;
			} else if (arg0.startsWith("str=")) {
				Static474.anInt7473 = Static428.anInt6549 & 0xFF000000 | Static124.method2285(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static474.anInt7473 = Static428.anInt6549 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static474.anInt7473 = -1;
			} else if (arg0.startsWith("u=")) {
				Static370.anInt5765 = Static428.anInt6549 & 0xFF000000 | Static124.method2285(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static370.anInt5765 = Static428.anInt6549 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static370.anInt5765 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static636.anInt9852 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static636.anInt9852 = Static428.anInt6549 & 0xFF000000 | Static124.method2285(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static636.anInt9852 = Static428.anInt6549 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static636.anInt9852 = Static313.anInt5066;
			} else if (arg0.equals("br")) {
				this.method9140(Static313.anInt5066, Static300.anInt10426);
			}
		} catch (@Pc(269) Exception local269) {
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIIIIIII[ILjava/util/Random;Ljava/lang/String;IB[Lclient!kw;)I")
	public final int method9137(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Random arg10, @OriginalArg(11) String arg11, @OriginalArg(12) int arg12, @OriginalArg(14) Class178[] arg13) {
		if (arg11 == null) {
			return 0;
		}
		arg10.setSeed((long) arg3);
		@Pc(21) int local21 = (arg10.nextInt() & 0x1F) + 192;
		this.method9140(arg5 & 0xFFFFFF | local21 << 24, local21 << 24 | arg6 & 0xFFFFFF);
		@Pc(41) int local41 = arg11.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg10.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(70) int local70 = arg7;
		@Pc(76) int local76 = this.aClass169_13.anInt4041 + arg8;
		if (arg2 == 1) {
			local76 += (arg4 - this.aClass169_13.anInt4042 - this.aClass169_13.anInt4041) / 2;
		} else if (arg2 == 2) {
			local76 = arg8 + arg4 - this.aClass169_13.anInt4042;
		}
		@Pc(115) int local115 = -1;
		if (arg1 == 1) {
			local115 = local46 + this.aClass169_13.method3653(arg11);
			local70 = arg7 + (arg12 - local115) / 2;
		} else if (arg1 == 2) {
			local115 = local46 + this.aClass169_13.method3653(arg11);
			local70 = arg7 + arg12 - local115;
		}
		this.method9133((int[]) null, arg13, local70, arg11, local44, local76, arg9);
		if (arg0 != null) {
			if (local115 == -1) {
				local115 = this.aClass169_13.method3653(arg11) + local46;
			}
			arg0[0] = local70;
			arg0[2] = local115;
			arg0[1] = local76 - this.aClass169_13.anInt4041;
			arg0[3] = this.aClass169_13.anInt4042 + this.aClass169_13.anInt4041;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[IIIII[Lclient!kw;Ljava/lang/String;Lclient!aa;IIIII)I")
	public final int method9138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class178[] arg9, @OriginalArg(10) String arg10, @OriginalArg(11) Class1 arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg10 == null) {
			return 0;
		}
		this.method9140(arg8, arg13);
		if (arg7 == 0) {
			arg7 = this.aClass169_13.anInt4040;
		}
		@Pc(56) int[] local56;
		if (arg3 < this.aClass169_13.anInt4042 + this.aClass169_13.anInt4041 + arg7 && arg3 < arg7 + arg7) {
			local56 = null;
		} else {
			local56 = new int[] { arg12 };
		}
		@Pc(74) int local74 = this.aClass169_13.method3649(arg9, arg10, local56, Static206.aStringArray20);
		if (arg14 == -1) {
			arg14 = arg3 / arg7;
			if (arg14 <= 0) {
				arg14 = 1;
			}
		}
		if (arg14 > 0 && arg14 <= local74) {
			Static206.aStringArray20[arg14 - 1] = this.aClass169_13.method3655(Static206.aStringArray20[arg14 - 1], arg12, arg9);
			local74 = arg14;
		}
		if (arg15 == 3 && local74 == 1) {
			arg15 = 1;
		}
		@Pc(137) int local137;
		@Pc(224) int local224;
		if (arg15 == 0) {
			local137 = this.aClass169_13.anInt4041 + arg1;
		} else if (arg15 == 1) {
			local137 = this.aClass169_13.anInt4041 + arg1 + (arg3 - (local74 - 1) * arg7 - this.aClass169_13.anInt4042 - this.aClass169_13.anInt4041) / 2;
		} else if (arg15 == 2) {
			local137 = arg1 + arg3 - (local74 - 1) * arg7 - this.aClass169_13.anInt4042;
		} else {
			local224 = (arg3 - (local74 - 1) * arg7 - this.aClass169_13.anInt4042 - this.aClass169_13.anInt4041) / (local74 + 1);
			if (local224 < 0) {
				local224 = 0;
			}
			arg7 += local224;
			local137 = local224 + arg1 + this.aClass169_13.anInt4041;
		}
		for (local224 = 0; local224 < local74; local224++) {
			if (arg0 == 0) {
				this.method9141(arg9, local137, arg5, arg11, arg2, arg6, Static206.aStringArray20[local224], arg4);
			} else if (arg0 == 1) {
				this.method9141(arg9, local137, arg5, arg11, arg2 + (arg12 - this.aClass169_13.method3653(Static206.aStringArray20[local224])) / 2, arg6, Static206.aStringArray20[local224], arg4);
			} else if (arg0 == 2) {
				this.method9141(arg9, local137, arg5, arg11, arg2 + arg12 - this.aClass169_13.method3653(Static206.aStringArray20[local224]), arg6, Static206.aStringArray20[local224], arg4);
			} else if (local224 == local74 - 1) {
				this.method9141(arg9, local137, arg5, arg11, arg2, arg6, Static206.aStringArray20[local224], arg4);
			} else {
				this.method9145(Static206.aStringArray20[local224], arg12);
				this.method9141(arg9, local137, arg5, arg11, arg2, arg6, Static206.aStringArray20[local224], arg4);
				Static494.anInt7852 = 0;
			}
			local137 += arg7;
		}
		return local74;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public final void method9139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method9140(-16777216, arg1);
		@Pc(22) double local22 = 7.0D - (double) arg4 / 8.0D;
		if (local22 < 0.0D) {
			local22 = 0.0D;
		}
		@Pc(44) int local44 = arg2.length();
		@Pc(47) int[] local47 = new int[local44];
		for (@Pc(49) int local49 = 0; local49 < local44; local49++) {
			local47[local49] = (int) (local22 * Math.sin((double) local49 / 1.5D + (double) arg5));
		}
		this.method9133(local47, (Class178[]) null, arg3 - this.aClass169_13.method3653(arg2) / 2, arg2, (int[]) null, arg0, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V")
	private void method9140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static300.anInt10426 = arg1;
		Static428.anInt6549 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static370.anInt5765 = -1;
		Static474.anInt7473 = -1;
		Static50.anInt1333 = 0;
		Static494.anInt7852 = 0;
		Static313.anInt5066 = arg0;
		Static636.anInt9852 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!kw;BIILclient!aa;IILjava/lang/String;[I)V")
	private void method9141(@OriginalArg(0) Class178[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int[] arg7) {
		@Pc(11) int local11 = arg1 - this.aClass169_13.anInt4040;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg6.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(35) char local35 = (char) (Static197.method6349(arg6.charAt(local20)) & 0xFF);
			if (local35 == '<') {
				local13 = local20;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg6.substring(local13 + 1, local20);
					local13 = -1;
					if (local60.equals("lt")) {
						local35 = '<';
					} else if (local60.equals("gt")) {
						local35 = '>';
					} else if (local60.equals("nbsp")) {
						local35 = ' ';
					} else if (local60.equals("shy")) {
						local35 = '\u00ad';
					} else if (local60.equals("times")) {
						local35 = '×';
					} else if (local60.equals("euro")) {
						local35 = '€';
					} else if (local60.equals("copy")) {
						local35 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									@Pc(142) int local142 = Static636.method8390(local60.substring(4));
									@Pc(146) Class178 local146 = arg0[local142];
									@Pc(156) int local156 = arg7 == null ? local146.method7632() : arg7[local142];
									if ((-16777216 & Static428.anInt6549) == -16777216) {
										local146.method7616(arg4, this.aClass169_13.anInt4040 + local11 - local156, 1, 0, 1);
									} else {
										local146.method7616(arg4, this.aClass169_13.anInt4040 + local11 - local156, 0, Static428.anInt6549 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg4 += arg0[local142].method7627();
								} catch (@Pc(209) Exception local209) {
								}
							} else {
								this.method9136(local60);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass169_13.method3656(local35, local15);
					}
					if (local35 == ' ') {
						if (Static494.anInt7852 > 0) {
							Static50.anInt1333 += Static494.anInt7852;
							arg4 += Static50.anInt1333 >> 8;
							Static50.anInt1333 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static636.anInt9852 & 0xFF000000) != 0) {
							this.fa(local35, arg4 + 1, local11 + 1, Static636.anInt9852, true);
						}
						this.fa(local35, arg4, local11, Static428.anInt6549, false);
					} else {
						if ((Static636.anInt9852 & 0xFF000000) != 0) {
							this.method9149(local35, arg4 + 1, local11 + 1, Static636.anInt9852, true, arg3, arg2, arg5);
						}
						this.method9149(local35, arg4, local11, Static428.anInt6549, false, arg3, arg2, arg5);
					}
					@Pc(365) int local365 = this.aClass169_13.method3648(local35);
					if (Static474.anInt7473 != -1) {
						this.aClass22_14.method9402(local365, (int) ((double) this.aClass169_13.anInt4040 * 0.7D) + local11, Static474.anInt7473, arg4);
					}
					if (Static370.anInt5765 != -1) {
						this.aClass22_14.method9402(local365, local11 + this.aClass169_13.anInt4040 + 1, Static370.anInt5765, arg4);
					}
					arg4 += local365;
					local15 = local35;
				}
			}
		}
		if (-106 != -106) {
			Static96.anInt10775 = -75;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
	public final void method9142(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method9140(-16777216, arg4);
		@Pc(17) int local17 = arg0.length();
		@Pc(20) int[] local20 = new int[local17];
		@Pc(23) int[] local23 = new int[local17];
		for (@Pc(25) int local25 = 0; local25 < local17; local25++) {
			local20[local25] = (int) (Math.sin((double) arg2 / 5.0D + (double) local25 / 5.0D) * 5.0D);
			local23[local25] = (int) (Math.sin((double) local25 / 3.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method9133(local23, (Class178[]) null, arg1 - this.aClass169_13.method3653(arg0) / 2, arg0, local20, arg3, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!kw;[IIILjava/lang/String;II)V")
	public final void method9143(@OriginalArg(1) Class178[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method9140(0, arg2);
			this.method9141(arg0, arg5, 0, (Class1) null, arg4, 0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!kw;IILjava/lang/String;[IIIILjava/util/Random;)I")
	public final int method9144(@OriginalArg(0) int arg0, @OriginalArg(1) Class178[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Random arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg6.setSeed((long) arg4);
		@Pc(22) int local22 = (arg6.nextInt() & 0x1F) + 192;
		this.method9140((local22 | 0x0) << 24, local22 << 24 | 0xFFFFFF);
		@Pc(42) int local42 = arg2.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg6.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		this.method9133((int[]) null, arg1, arg0, arg2, local45, arg5, arg3);
		return local47;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method9145(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
			@Pc(27) char local27 = arg0.charAt(local19);
			if (local27 == '<') {
				local17 = true;
			} else if (local27 == '>') {
				local17 = false;
			} else if (!local17 && local27 == ' ') {
				local15++;
			}
		}
		if (local15 > 0) {
			Static494.anInt7852 = (arg1 - this.aClass169_13.method3653(arg0) << 8) / local15;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method9146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method9140(arg4, arg2);
			this.method9141((Class178[]) null, arg1, 0, (Class1) null, arg0 - this.aClass169_13.method3653(arg3) / 2, 0, arg3, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method9148(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method9140(-16777216, arg3);
		@Pc(17) int local17 = arg0.length();
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(29) int local29 = 0; local29 < local17; local29++) {
			local20[local29] = (int) (Math.sin((double) local29 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method9133(local20, (Class178[]) null, arg2 - this.aClass169_13.method3653(arg0) / 2, arg0, (int[]) null, arg4, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method9149(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
