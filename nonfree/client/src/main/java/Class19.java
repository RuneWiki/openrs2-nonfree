import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class19 {

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!ha;")
	private final Class132 aClass132_11;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!hw;")
	private final Class151 aClass151_11;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!hw;)V")
	protected Class19(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class151 arg1) {
		this.aClass132_11 = arg0;
		this.aClass151_11 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method6319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6324(arg4, arg1);
			this.method6325((Class9[]) null, arg2, arg3 - this.aClass151_11.method3323(arg2), arg0, (Class1) null, 0, (int[]) null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;III[Lclient!ho;Ljava/util/Random;I)I")
	public final int method6321(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class9[] arg5, @OriginalArg(8) Random arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg6.setSeed((long) arg4);
		@Pc(21) int local21 = (arg6.nextInt() & 0x1F) + 192;
		this.method6324((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg2.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local44[local53] = local51;
			if ((arg6.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method6332(arg5, (int[]) null, local44, arg2, arg0, arg1, arg3);
		return local51;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII[Lclient!ho;Ljava/lang/String;B)V")
	public final void method6322(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9[] arg4, @OriginalArg(6) String arg5) {
		if (arg5 != null) {
			this.method6324(0, arg3);
			this.method6325(arg4, arg5, arg1, arg2, (Class1) null, 0, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method6323(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method6324(-16777216, arg3);
		@Pc(26) double local26 = 7.0D - (double) arg2 / 8.0D;
		if (local26 < 0.0D) {
			local26 = 0.0D;
		}
		@Pc(35) int local35 = arg1.length();
		@Pc(38) int[] local38 = new int[local35];
		for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
			local38[local40] = (int) (local26 * Math.sin((double) local40 / 1.5D + (double) arg5));
		}
		this.method6332((Class9[]) null, local38, (int[]) null, arg1, arg0 - this.aClass151_11.method3323(arg1) / 2, (int[]) null, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method6324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static504.anInt8477 = 0;
		Static553.anInt9283 = arg1;
		Static77.anInt1467 = arg1;
		Static651.anInt10481 = -1;
		Static476.anInt8175 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static590.anInt10558 = 0;
		Static62.anInt1175 = arg0;
		Static623.anInt10144 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ho;Ljava/lang/String;IIILclient!aa;I[II)V")
	private void method6325(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg3 - this.aClass151_11.anInt3920;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(33) char local33 = (char) (Static2.method8467(arg1.charAt(local20)) & 0xFF);
			if (local33 == '<') {
				local13 = local20;
			} else {
				if (local33 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg1.substring(local13 + 1, local20);
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
									@Pc(122) int local122 = Static368.method5312(local56.substring(4));
									@Pc(126) Class9 local126 = arg0[local122];
									@Pc(135) int local135 = arg6 == null ? local126.method8930() : arg6[local122];
									if ((Static77.anInt1467 & 0xFF000000) == -16777216) {
										local126.method8919(arg2, this.aClass151_11.anInt3920 + local11 - local135, 1, 0, 1);
									} else {
										local126.method8919(arg2, this.aClass151_11.anInt3920 + local11 - local135, 0, Static77.anInt1467 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg2 += arg0[local122].method8937();
									local15 = -1;
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method6327(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass151_11.method3332(local15, local33);
					}
					if (local33 == ' ') {
						if (Static504.anInt8477 > 0) {
							Static590.anInt10558 += Static504.anInt8477;
							arg2 += Static590.anInt10558 >> 8;
							Static590.anInt10558 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static623.anInt10144 & 0xFF000000) != 0) {
							this.fa(local33, arg2 + 1, local11 + 1, Static623.anInt10144, true);
						}
						this.fa(local33, arg2, local11, Static77.anInt1467, false);
					} else {
						if ((Static623.anInt10144 & 0xFF000000) != 0) {
							this.method6337(local33, arg2 + 1, local11 + 1, Static623.anInt10144, true, arg4, arg7, arg5);
						}
						this.method6337(local33, arg2, local11, Static77.anInt1467, false, arg4, arg7, arg5);
					}
					@Pc(308) int local308 = this.aClass151_11.method3322(local33);
					if (Static476.anInt8175 != -1) {
						this.aClass132_11.method7449(local308, arg2, local11 + (int) ((double) this.aClass151_11.anInt3920 * 0.7D), Static476.anInt8175);
					}
					if (Static651.anInt10481 != -1) {
						this.aClass132_11.method7449(local308, arg2, this.aClass151_11.anInt3920 + local11 + 1, Static651.anInt10481);
					}
					arg2 += local308;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[Lclient!ho;Ljava/lang/String;IBLclient!aa;III[I)I")
	public final int method6326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class9[] arg7, @OriginalArg(8) String arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class1 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[] arg14) {
		return this.method6330(0, arg4, arg10, arg8, arg7, arg1, arg2, arg0, arg13, arg14, arg11, arg5, arg9, arg6, arg12, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6327(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static77.anInt1467 = Static77.anInt1467 & 0xFF000000 | Static570.method7951(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static77.anInt1467 = Static553.anInt9283 & 0xFFFFFF | Static77.anInt1467 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static77.anInt1467 = Static570.method7951(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static77.anInt1467 = Static553.anInt9283;
			} else if (arg0.startsWith("str=")) {
				Static476.anInt8175 = Static77.anInt1467 & 0xFF000000 | Static570.method7951(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static476.anInt8175 = Static77.anInt1467 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static476.anInt8175 = -1;
			} else if (arg0.startsWith("u=")) {
				Static651.anInt10481 = Static77.anInt1467 & 0xFF000000 | Static570.method7951(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static651.anInt10481 = Static77.anInt1467 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static651.anInt10481 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static623.anInt10144 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static623.anInt10144 = Static77.anInt1467 & 0xFF000000 | Static570.method7951(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static623.anInt10144 = Static77.anInt1467 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static623.anInt10144 = Static62.anInt1175;
			} else if (arg0.equals("br")) {
				this.method6324(Static62.anInt1175, Static553.anInt9283);
			}
		} catch (@Pc(184) Exception local184) {
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IILjava/lang/String;III)V")
	public final void method6328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6324(arg3, arg1);
			this.method6325((Class9[]) null, arg2, arg4 - this.aClass151_11.method3323(arg2) / 2, arg0, (Class1) null, 0, (int[]) null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIIILjava/lang/String;)V")
	public final void method6329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method6324(-16777216, arg1);
		@Pc(24) int local24 = arg4.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg3 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) arg3 / 5.0D + (double) local32 / 3.0D) * 5.0D);
		}
		this.method6332((Class9[]) null, local30, local27, arg4, arg0 - this.aClass151_11.method3323(arg4) / 2, (int[]) null, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILclient!aa;Ljava/lang/String;[Lclient!ho;IIII[IIIIIII)I")
	public final int method6330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class9[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg3 == null) {
			return 0;
		}
		this.method6324(arg10, arg12);
		if (arg14 == 0) {
			arg14 = this.aClass151_11.anInt3920;
		}
		@Pc(52) int[] local52;
		if (arg13 < arg14 + this.aClass151_11.anInt3915 + this.aClass151_11.anInt3921 && arg14 + arg14 > arg13) {
			local52 = null;
		} else {
			local52 = new int[] { arg11 };
		}
		@Pc(65) int local65 = this.aClass151_11.method3325(arg4, Static314.aStringArray40, arg3, local52);
		if (arg0 == -1) {
			arg0 = arg13 / arg14;
			if (arg0 <= 0) {
				arg0 = 1;
			}
		}
		if (arg0 > 0 && arg0 <= local65) {
			local65 = arg0;
			Static314.aStringArray40[arg0 - 1] = this.aClass151_11.method3329(arg4, arg11, Static314.aStringArray40[arg0 - 1]);
		}
		if (arg6 == 3 && local65 == 1) {
			arg6 = 1;
		}
		@Pc(129) int local129;
		@Pc(211) int local211;
		if (arg6 == 0) {
			local129 = arg7 + this.aClass151_11.anInt3921;
		} else if (arg6 == 1) {
			local129 = this.aClass151_11.anInt3921 + arg7 + (arg13 - arg14 * (local65 - 1) - this.aClass151_11.anInt3915 - this.aClass151_11.anInt3921) / 2;
		} else if (arg6 == 2) {
			local129 = arg13 + arg7 - arg14 * (local65 - 1) - this.aClass151_11.anInt3915;
		} else {
			local211 = (arg13 - (local65 - 1) * arg14 - this.aClass151_11.anInt3921 - this.aClass151_11.anInt3915) / (local65 - -1);
			if (local211 < 0) {
				local211 = 0;
			}
			arg14 += local211;
			local129 = arg7 + this.aClass151_11.anInt3921 + local211;
		}
		for (local211 = 0; local211 < local65; local211++) {
			if (arg1 == 0) {
				this.method6325(arg4, Static314.aStringArray40[local211], arg15, local129, arg2, arg5, arg9, arg8);
			} else if (arg1 == 1) {
				this.method6325(arg4, Static314.aStringArray40[local211], (arg11 - this.aClass151_11.method3323(Static314.aStringArray40[local211])) / 2 + arg15, local129, arg2, arg5, arg9, arg8);
			} else if (arg1 == 2) {
				this.method6325(arg4, Static314.aStringArray40[local211], arg11 + arg15 - this.aClass151_11.method3323(Static314.aStringArray40[local211]), local129, arg2, arg5, arg9, arg8);
			} else if (local65 - 1 == local211) {
				this.method6325(arg4, Static314.aStringArray40[local211], arg15, local129, arg2, arg5, arg9, arg8);
			} else {
				this.method6333(Static314.aStringArray40[local211], arg11);
				this.method6325(arg4, Static314.aStringArray40[local211], arg15, local129, arg2, arg5, arg9, arg8);
				Static504.anInt8477 = 0;
			}
			local129 += arg14;
		}
		return local65;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/util/Random;III[ILjava/lang/String;I[II[Lclient!ho;I)I")
	public final int method6331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class9[] arg12, @OriginalArg(14) int arg13) {
		if (arg8 == null) {
			return 0;
		}
		arg4.setSeed((long) arg9);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method6324(arg1 & 0xFFFFFF | local20 << 24, arg5 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg8.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local45;
			if ((arg4.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(74) int local74 = arg13;
		@Pc(80) int local80 = this.aClass151_11.anInt3921 + arg6;
		@Pc(82) int local82 = -1;
		if (arg3 == 1) {
			local80 += (arg2 - this.aClass151_11.anInt3921 - this.aClass151_11.anInt3915) / 2;
		} else if (arg3 == 2) {
			local80 = arg2 + arg6 - this.aClass151_11.anInt3915;
		}
		if (arg0 == 1) {
			local82 = local45 + this.aClass151_11.method3323(arg8);
			local74 = arg13 + (arg11 - local82) / 2;
		} else if (arg0 == 2) {
			local82 = this.aClass151_11.method3323(arg8) + local45;
			local74 = arg13 + arg11 - local82;
		}
		this.method6332(arg12, (int[]) null, local43, arg8, local74, arg10, local80);
		if (arg7 != null) {
			if (local82 == -1) {
				local82 = this.aClass151_11.method3323(arg8) + local45;
			}
			arg7[0] = local74;
			arg7[1] = local80 - this.aClass151_11.anInt3921;
			arg7[3] = this.aClass151_11.anInt3915 + this.aClass151_11.anInt3921;
			arg7[2] = local82;
		}
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ho;[IZ[ILjava/lang/String;I[II)V")
	private void method6332(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 - this.aClass151_11.anInt3920;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static2.method8467(arg3.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(109) int local109;
				@Pc(119) int local119;
				if (local33 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg3.substring(local13 + 1, local22);
					local13 = -1;
					if (local55.equals("lt")) {
						local33 = '<';
					} else if (local55.equals("gt")) {
						local33 = '>';
					} else if (local55.equals("nbsp")) {
						local33 = ' ';
					} else if (local55.equals("shy")) {
						local33 = '\u00ad';
					} else if (local55.equals("times")) {
						local33 = '×';
					} else if (local55.equals("euro")) {
						local33 = '€';
					} else if (local55.equals("copy")) {
						local33 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=")) {
								try {
									if (arg2 == null) {
										local109 = 0;
									} else {
										local109 = arg2[local17];
									}
									if (arg1 == null) {
										local119 = 0;
									} else {
										local119 = arg1[local17];
									}
									local17++;
									@Pc(130) int local130 = Static368.method5312(local55.substring(4));
									@Pc(134) Class9 local134 = arg0[local130];
									@Pc(143) int local143 = arg5 == null ? local134.method8930() : arg5[local130];
									local134.method8919(local109 + arg4, -local143 + this.aClass151_11.anInt3920 + (local11 - -local119), 1, 0, 1);
									local15 = -1;
									arg4 += arg0[local130].method8937();
								} catch (@Pc(173) Exception local173) {
								}
							} else {
								this.method6327(local55);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass151_11.method3332(local15, local33);
					}
					@Pc(221) int local221;
					if (arg2 == null) {
						local221 = 0;
					} else {
						local221 = arg2[local17];
					}
					if (arg1 == null) {
						local109 = 0;
					} else {
						local109 = arg1[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static623.anInt10144 & 0xFF000000) != 0) {
							this.fa(local33, arg4 + local221 + 1, local11 - (-1 - local109), Static623.anInt10144, true);
						}
						this.fa(local33, arg4 + local221, local109 + local11, Static77.anInt1467, false);
					} else if (Static504.anInt8477 > 0) {
						Static590.anInt10558 += Static504.anInt8477;
						arg4 += Static590.anInt10558 >> 8;
						Static590.anInt10558 &= 0xFF;
					}
					local119 = this.aClass151_11.method3322(local33);
					if (Static476.anInt8175 != -1) {
						this.aClass132_11.method7449(local119, arg4, local11 + (int) ((double) this.aClass151_11.anInt3920 * 0.7D), Static476.anInt8175);
					}
					if (Static651.anInt10481 != -1) {
						this.aClass132_11.method7449(local119, arg4, local11 + this.aClass151_11.anInt3920, Static651.anInt10481);
					}
					local15 = local33;
					arg4 += local119;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method6333(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 0;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<') {
				local15 = true;
			} else if (local23 == '>') {
				local15 = false;
			} else if (!local15 && local23 == ' ') {
				local13++;
			}
		}
		if (local13 > 0) {
			Static504.anInt8477 = (arg1 - this.aClass151_11.method3323(arg0) << 8) / local13;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method6324(-16777216, arg3);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local19[local32] = (int) (Math.sin((double) local32 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method6332((Class9[]) null, local19, (int[]) null, arg4, arg0 - this.aClass151_11.method3323(arg4) / 2, (int[]) null, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method6336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method6324(arg2, arg1);
			this.method6325((Class9[]) null, arg4, arg3, arg0, (Class1) null, 0, (int[]) null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method6337(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
