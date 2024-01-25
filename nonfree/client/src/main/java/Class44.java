import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class44 {

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!ha;")
	private final Class67 aClass67_14;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!saa;")
	private final Class330 aClass330_12;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!saa;)V")
	protected Class44(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class330 arg1) {
		this.aClass67_14 = arg0;
		this.aClass330_12 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!bka;I[IIB)V")
	public final void method8116(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg0 != null) {
			this.method8120(0, arg5);
			this.method8122(0, 0, arg3, arg1, arg2, arg4, arg0, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
	public final void method8117(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method8120(arg0, arg2);
			this.method8122(0, 0, (Class9[]) null, arg4 - this.aClass330_12.method7911(97, arg1), arg3, (int[]) null, arg1, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method8118(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static291.anInt5231 = Static291.anInt5231 & 0xFF000000 | Static555.method7791(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static291.anInt5231 = Static507.anInt8639 & 0xFFFFFF | Static291.anInt5231 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static291.anInt5231 = Static555.method7791(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static291.anInt5231 = Static507.anInt8639;
			} else if (arg0.startsWith("str=")) {
				Static3.anInt28 = Static291.anInt5231 & 0xFF000000 | Static555.method7791(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static3.anInt28 = Static291.anInt5231 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static3.anInt28 = -1;
			} else if (arg0.startsWith("u=")) {
				Static663.anInt10562 = Static291.anInt5231 & 0xFF000000 | Static555.method7791(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static663.anInt10562 = Static291.anInt5231 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static663.anInt10562 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static5.anInt75 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static5.anInt75 = Static291.anInt5231 & 0xFF000000 | Static555.method7791(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static5.anInt75 = Static291.anInt5231 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static5.anInt75 = Static506.anInt8625;
			} else if (arg0.equals("br")) {
				this.method8120(Static506.anInt8625, Static507.anInt8639);
				return;
			}
		} catch (@Pc(227) Exception local227) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method8119(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 != -9902) {
			Static100.aShortArray147 = null;
		}
		if (arg0 != null) {
			this.method8120(arg4, arg2);
			this.method8122(0, 0, (Class9[]) null, arg3 - this.aClass330_12.method7911(arg1 + 10014, arg0) / 2, arg5, (int[]) null, arg0, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method8120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static663.anInt10568 = 0;
		Static604.anInt9833 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static663.anInt10562 = -1;
		Static507.anInt8639 = arg1;
		Static291.anInt5231 = arg1;
		Static3.anInt28 = -1;
		Static506.anInt8625 = arg0;
		Static5.anInt75 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method8121(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(14) int local14 = 0;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; arg1.length() > local18; local18++) {
			@Pc(26) char local26 = arg1.charAt(local18);
			if (local26 == '<') {
				local16 = true;
			} else if (local26 == '>') {
				local16 = false;
			} else if (!local16 && local26 == ' ') {
				local14++;
			}
		}
		if (local14 > 0) {
			Static604.anInt9833 = (arg0 - this.aClass330_12.method7911(120, arg1) << 8) / local14;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!bka;II[ILjava/lang/String;Lclient!aa;I)V")
	private void method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) String arg6, @OriginalArg(7) Class1 arg7) {
		@Pc(11) int local11 = arg4 - this.aClass330_12.anInt9388;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg6.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(39) char local39 = (char) (Static181.method2791(arg6.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				if (local39 == '>' && local13 != -1) {
					@Pc(66) String local66 = arg6.substring(local13 + 1, local28);
					local13 = -1;
					if (local66.equals("lt")) {
						local39 = '<';
					} else if (local66.equals("gt")) {
						local39 = '>';
					} else if (local66.equals("nbsp")) {
						local39 = ' ';
					} else if (local66.equals("shy")) {
						local39 = '\u00ad';
					} else if (local66.equals("times")) {
						local39 = '×';
					} else if (local66.equals("euro")) {
						local39 = '€';
					} else if (local66.equals("copy")) {
						local39 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=")) {
								try {
									@Pc(164) int local164 = Static349.method5057(local66.substring(4));
									@Pc(168) Class9 local168 = arg2[local164];
									@Pc(178) int local178 = arg5 == null ? local168.method8613() : arg5[local164];
									if ((Static291.anInt5231 & -16777216) == -16777216) {
										local168.method8621(arg3, this.aClass330_12.anInt9388 + local11 - local178, 1, 0, 1);
									} else {
										local168.method8621(arg3, local11 + this.aClass330_12.anInt9388 - local178, 0, Static291.anInt5231 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg3 += arg2[local164].method8619();
								} catch (@Pc(233) Exception local233) {
								}
							} else {
								this.method8118(local66);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass330_12.method7913(local15, local39);
					}
					if (local39 == ' ') {
						if (Static604.anInt9833 > 0) {
							Static663.anInt10568 += Static604.anInt9833;
							arg3 += Static663.anInt10568 >> 8;
							Static663.anInt10568 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static5.anInt75 & 0xFF000000) != 0) {
							this.fa(local39, arg3 + 1, local11 + 1, Static5.anInt75, true);
						}
						this.fa(local39, arg3, local11, Static291.anInt5231, false);
					} else {
						if ((Static5.anInt75 & 0xFF000000) != 0) {
							this.method8130(local39, arg3 + 1, local11 + 1, Static5.anInt75, true, arg7, arg1, arg0);
						}
						this.method8130(local39, arg3, local11, Static291.anInt5231, false, arg7, arg1, arg0);
					}
					@Pc(371) int local371 = this.aClass330_12.method7906(local39);
					if (Static3.anInt28 != -1) {
						this.aClass67_14.method7701(arg3, local11 + (int) ((double) this.aClass330_12.anInt9388 * 0.7D), local371, Static3.anInt28);
					}
					if (Static663.anInt10562 != -1) {
						this.aClass67_14.method7701(arg3, this.aClass330_12.anInt9388 + local11 + 1, local371, Static663.anInt10562);
					}
					local15 = local39;
					arg3 += local371;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;[IIIILjava/lang/String;[Lclient!bka;III)I")
	public final int method8123(@OriginalArg(0) Random arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) Class9[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg0.setSeed((long) arg5);
		@Pc(22) int local22 = (arg0.nextInt() & 0x1F) + 192;
		this.method8120((local22 | 0x0) << 24, local22 << 24 | 0xFFFFFF);
		@Pc(42) int local42 = arg3.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg0.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		this.method8127(arg1, arg2, local45, arg6, arg3, arg4, (int[]) null);
		return local47;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method8124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method8120(-16777216, arg4);
		@Pc(17) int local17 = arg3.length();
		@Pc(20) int[] local20 = new int[local17];
		@Pc(23) int[] local23 = new int[local17];
		for (@Pc(25) int local25 = 0; local25 < local17; local25++) {
			local20[local25] = (int) (Math.sin((double) arg0 / 5.0D + (double) local25 / 5.0D) * 5.0D);
			local23[local25] = (int) (Math.sin((double) local25 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method8127((int[]) null, arg2 - this.aClass330_12.method7911(120, arg3) / 2, local20, arg1, arg3, (Class9[]) null, local23);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V")
	public final void method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method8120(-16777216, arg3);
		@Pc(22) double local22 = 7.0D - (double) arg4 / 8.0D;
		if (local22 < 0.0D) {
			local22 = 0.0D;
		}
		@Pc(36) int local36 = arg5.length();
		@Pc(39) int[] local39 = new int[local36];
		for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
			local39[local41] = (int) (local22 * Math.sin((double) local41 / 1.5D + (double) arg2));
		}
		this.method8127((int[]) null, arg0 - this.aClass330_12.method7911(119, arg5) / 2, (int[]) null, arg1, arg5, (Class9[]) null, local39);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([II[IIILjava/lang/String;[Lclient!bka;[I)V")
	private void method8127(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class9[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg3 - this.aClass330_12.anInt9388;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(35) char local35 = (char) (Static181.method2791(arg4.charAt(local22)) & 0xFF);
			if (local35 == '<') {
				local13 = local22;
			} else {
				@Pc(156) int local156;
				@Pc(166) int local166;
				if (local35 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg4.substring(local13 + 1, local22);
					local13 = -1;
					if (local64.equals("lt")) {
						local35 = '<';
					} else if (local64.equals("gt")) {
						local35 = '>';
					} else if (local64.equals("nbsp")) {
						local35 = ' ';
					} else if (local64.equals("shy")) {
						local35 = '\u00ad';
					} else if (local64.equals("times")) {
						local35 = '×';
					} else if (local64.equals("euro")) {
						local35 = '€';
					} else if (local64.equals("copy")) {
						local35 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									if (arg2 == null) {
										local156 = 0;
									} else {
										local156 = arg2[local17];
									}
									if (arg6 == null) {
										local166 = 0;
									} else {
										local166 = arg6[local17];
									}
									local17++;
									@Pc(179) int local179 = Static349.method5057(local64.substring(4));
									@Pc(183) Class9 local183 = arg5[local179];
									@Pc(193) int local193 = arg0 == null ? local183.method8613() : arg0[local179];
									local183.method8621(arg1 + local156, local166 + local7 + this.aClass330_12.anInt9388 + -local193, 1, 0, 1);
									arg1 += arg5[local179].method8619();
									local15 = -1;
								} catch (@Pc(222) Exception local222) {
								}
							} else {
								this.method8118(local64);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass330_12.method7913(local15, local35);
					}
					@Pc(269) int local269;
					if (arg2 == null) {
						local269 = 0;
					} else {
						local269 = arg2[local17];
					}
					if (arg6 == null) {
						local156 = 0;
					} else {
						local156 = arg6[local17];
					}
					if (local35 != ' ') {
						if ((Static5.anInt75 & 0xFF000000) != 0) {
							this.fa(local35, arg1 + local269 + 1, local7 + 1 + local156, Static5.anInt75, true);
						}
						this.fa(local35, arg1 + local269, local156 + local7, Static291.anInt5231, false);
					} else if (Static604.anInt9833 > 0) {
						Static663.anInt10568 += Static604.anInt9833;
						arg1 += Static663.anInt10568 >> 8;
						Static663.anInt10568 &= 0xFF;
					}
					local17++;
					local166 = this.aClass330_12.method7906(local35);
					if (Static3.anInt28 != -1) {
						this.aClass67_14.method7701(arg1, (int) ((double) this.aClass330_12.anInt9388 * 0.7D) + local7, local166, Static3.anInt28);
					}
					if (Static663.anInt10562 != -1) {
						this.aClass67_14.method7701(arg1, local7 + this.aClass330_12.anInt9388, local166, Static663.anInt10562);
					}
					arg1 += local166;
					local15 = local35;
				}
			}
		}
		if (-15748 != -15748) {
			this.method8119((String) null, 18, -123, 68, 33, -88);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;ZIIII)V")
	public final void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method8120(-16777216, arg0);
		@Pc(22) int local22 = arg1.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) arg3 / 5.0D + (double) local27 / 2.0D) * 5.0D);
		}
		this.method8127((int[]) null, arg2 - this.aClass330_12.method7911(120, arg1) / 2, (int[]) null, arg4, arg1, (Class9[]) null, local25);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method8129(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method8120(arg2, arg0);
			this.method8122(0, 0, (Class9[]) null, arg3, arg4, (int[]) null, arg1, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8130(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!aa;IIIIIII[Lclient!bka;IIILjava/lang/String;II[II)I")
	public final int method8131(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class9[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method8120(arg5, arg6);
		if (arg10 == 0) {
			arg10 = this.aClass330_12.anInt9388;
		}
		@Pc(52) int[] local52;
		if (this.aClass330_12.anInt9384 + this.aClass330_12.anInt9393 + arg10 > arg12 && arg10 + arg10 > arg12) {
			local52 = null;
		} else {
			local52 = new int[] { arg1 };
		}
		if (arg8 == -1) {
			arg8 = arg12 / arg10;
			if (arg8 <= 0) {
				arg8 = 1;
			}
		}
		@Pc(80) int local80 = this.aClass330_12.method7912(arg11, local52, Static698.aStringArray40, arg7);
		if (arg8 > 0 && arg8 <= local80) {
			Static698.aStringArray40[arg8 - 1] = this.aClass330_12.method7908(arg7, arg1, Static698.aStringArray40[arg8 - 1]);
			local80 = arg8;
		}
		if (arg15 == 3 && local80 == 1) {
			arg15 = 1;
		}
		@Pc(161) int local161;
		@Pc(190) int local190;
		if (arg15 == 0) {
			local161 = this.aClass330_12.anInt9384 + arg9;
		} else if (arg15 == 1) {
			local161 = (arg12 - arg10 * (local80 - 1) - this.aClass330_12.anInt9384 - this.aClass330_12.anInt9393) / 2 + arg9 + this.aClass330_12.anInt9384;
		} else if (arg15 == 2) {
			local161 = arg9 + arg12 - (local80 - 1) * arg10 - this.aClass330_12.anInt9393;
		} else {
			local190 = (arg12 - (local80 - 1) * arg10 - this.aClass330_12.anInt9393 - this.aClass330_12.anInt9384) / (local80 + 1);
			if (local190 < 0) {
				local190 = 0;
			}
			arg10 += local190;
			local161 = arg9 + this.aClass330_12.anInt9384 + local190;
		}
		for (local190 = 0; local190 < local80; local190++) {
			if (arg13 == 0) {
				this.method8122(arg4, arg2, arg7, arg3, local161, arg14, Static698.aStringArray40[local190], arg0);
			} else if (arg13 == 1) {
				this.method8122(arg4, arg2, arg7, arg3 + (arg1 - this.aClass330_12.method7911(106, Static698.aStringArray40[local190])) / 2, local161, arg14, Static698.aStringArray40[local190], arg0);
			} else if (arg13 == 2) {
				this.method8122(arg4, arg2, arg7, arg1 + arg3 - this.aClass330_12.method7911(109, Static698.aStringArray40[local190]), local161, arg14, Static698.aStringArray40[local190], arg0);
			} else if (local80 - 1 == local190) {
				this.method8122(arg4, arg2, arg7, arg3, local161, arg14, Static698.aStringArray40[local190], arg0);
			} else {
				this.method8121(arg1, Static698.aStringArray40[local190]);
				this.method8122(arg4, arg2, arg7, arg3, local161, arg14, Static698.aStringArray40[local190], arg0);
				Static604.anInt9833 = 0;
			}
			local161 += arg10;
		}
		return local80;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!bka;ILjava/lang/String;IIILclient!aa;[IIIIIIII)I")
	public final int method8132(@OriginalArg(0) int arg0, @OriginalArg(1) Class9[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1 arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method8131(arg7, arg6, arg10, arg5, arg12, arg2, arg11, arg1, 0, arg0, arg4, arg3, arg13, arg14, arg8, arg9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IILjava/util/Random;IIIIIIIILjava/lang/String;[Lclient!bka;I[I)I")
	public final int method8133(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) Class9[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg2.setSeed((long) arg4);
		@Pc(21) int local21 = (arg2.nextInt() & 0x1F) + 192;
		this.method8120(arg8 & 0xFFFFFF | local21 << 24, arg7 & 0xFFFFFF | local21 << 24);
		@Pc(47) int local47 = arg10.length();
		@Pc(50) int[] local50 = new int[local47];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local47; local54++) {
			local50[local54] = local52;
			if ((arg2.nextInt() & 0x3) == 0) {
				local52++;
			}
		}
		@Pc(77) int local77 = arg12;
		@Pc(84) int local84 = arg3 + this.aClass330_12.anInt9384;
		@Pc(86) int local86 = -1;
		if (arg1 == 1) {
			local84 += (arg6 - this.aClass330_12.anInt9393 - this.aClass330_12.anInt9384) / 2;
		} else if (arg1 == 2) {
			local84 = arg3 + arg6 - this.aClass330_12.anInt9393;
		}
		if (arg5 == 1) {
			local86 = this.aClass330_12.method7911(107, arg10) + local52;
			local77 = arg12 + (arg9 - local86) / 2;
		} else if (arg5 == 2) {
			local86 = local52 + this.aClass330_12.method7911(108, arg10);
			local77 = arg12 + arg9 - local86;
		}
		this.method8127(arg0, local77, local50, local84, arg10, arg11, (int[]) null);
		if (arg13 != null) {
			if (local86 == -1) {
				local86 = local52 + this.aClass330_12.method7911(102, arg10);
			}
			arg13[1] = local84 - this.aClass330_12.anInt9384;
			arg13[0] = local77;
			arg13[2] = local86;
			arg13[3] = this.aClass330_12.anInt9393 + this.aClass330_12.anInt9384;
		}
		return local52;
	}
}
