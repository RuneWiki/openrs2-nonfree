import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public abstract class Class92 {

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "Lclient!pm;")
	private final Class201 aClass201_8;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Lclient!qq;")
	private final Class28 aClass28_125;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!qq;Lclient!pm;)V")
	protected Class92(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class201 arg1) {
		this.aClass201_8 = arg1;
		this.aClass28_125 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
	public final void method5628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5629(arg0, -16777216);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5643(null, null, arg1, arg2 - this.aClass201_8.method4452(arg4) / 2, arg4, local19, null);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	private void method5629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static274.anInt4684 = -1;
		Static346.anInt5783 = arg0;
		Static362.anInt6109 = arg0;
		Static95.anInt1776 = 0;
		Static224.anInt3830 = -1;
		Static416.anInt4772 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static187.anInt3260 = arg1;
		Static97.anInt1792 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method5631(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
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
			Static416.anInt4772 = (arg0 - this.aClass201_8.method4452(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5629(arg2, arg3);
			this.method5639(arg1, null, null, arg0 - this.aClass201_8.method4452(arg4) / 2, 0, 0, null, arg4);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method5634(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static362.anInt6109 = Static362.anInt6109 & 0xFF000000 | Static418.method5678(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static362.anInt6109 = Static362.anInt6109 & 0xFF000000 | Static346.anInt5783 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static362.anInt6109 = Static418.method5678(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static362.anInt6109 = Static346.anInt5783;
			} else if (arg0.startsWith("str=")) {
				Static274.anInt4684 = Static418.method5678(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static274.anInt4684 = -8388608;
			} else if (arg0.equals("/str")) {
				Static274.anInt4684 = -1;
			} else if (arg0.startsWith("u=")) {
				Static224.anInt3830 = Static418.method5678(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static224.anInt3830 = -16777216;
			} else if (arg0.equals("/u")) {
				Static224.anInt3830 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static97.anInt1792 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static97.anInt1792 = Static418.method5678(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static97.anInt1792 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static97.anInt1792 = Static187.anInt3260;
			} else if (arg0.equals("br")) {
				this.method5629(Static346.anInt5783, Static187.anInt3260);
			}
		} catch (@Pc(174) Exception local174) {
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II[I[Lclient!ig;IIILjava/lang/String;Ljava/util/Random;I)I")
	public final int method5637(@OriginalArg(2) int[] arg0, @OriginalArg(3) Class12[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5, @OriginalArg(8) Random arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg6.setSeed((long) arg4);
		@Pc(25) int local25 = (arg6.nextInt() & 0x1F) + 192;
		this.method5629(local25 << 24 | 0xFFFFFF, (local25 | 0x0) << 24);
		@Pc(45) int local45 = arg5.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg6.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method5643(arg0, local48, arg2, arg3, arg5, null, arg1);
		return local50;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5629(arg0, arg4);
			this.method5639(arg1, null, null, arg2, 0, 0, null, arg3);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!be;[Lclient!ig;III[ILjava/lang/String;I)V")
	private void method5639(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class12[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) String arg7) {
		@Pc(11) int local11 = arg0 - this.aClass201_8.anInt5069;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg7.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static198.method3145(arg7.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(54) String local54 = arg7.substring(local13 + 1, local20);
					local13 = -1;
					if (local54.equals("lt")) {
						local31 = '<';
					} else if (local54.equals("gt")) {
						local31 = '>';
					} else if (local54.equals("nbsp")) {
						local31 = ' ';
					} else if (local54.equals("shy")) {
						local31 = '\u00ad';
					} else if (local54.equals("times")) {
						local31 = '×';
					} else if (local54.equals("euro")) {
						local31 = '€';
					} else if (local54.equals("copy")) {
						local31 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(114) int local114 = Static265.method4063(local54.substring(4));
									@Pc(118) Class12 local118 = arg2[local114];
									@Pc(127) int local127 = arg6 == null ? local118.method5655() : arg6[local114];
									if ((Static362.anInt6109 & -16777216) == -16777216) {
										local118.method5658(arg3, this.aClass201_8.anInt5069 + local11 - local127, 1, 0);
									} else {
										local118.method5658(arg3, this.aClass201_8.anInt5069 + local11 - local127, 0, Static362.anInt6109 & 0xFF000000 | 0xFFFFFF);
									}
									arg3 += arg2[local114].method5654();
									local15 = -1;
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method5634(local54);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass201_8.method4455(local15, local31);
					}
					if (local31 == ' ') {
						if (Static416.anInt4772 > 0) {
							Static95.anInt1776 += Static416.anInt4772;
							arg3 += Static95.anInt1776 >> 8;
							Static95.anInt1776 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static97.anInt1792 & 0xFF000000) != 0) {
							this.method5649(local31, arg3 + 1, local11 + 1, Static97.anInt1792, true);
						}
						this.method5649(local31, arg3, local11, Static362.anInt6109, false);
					} else {
						if ((Static97.anInt1792 & 0xFF000000) != 0) {
							this.method5640(local31, arg3 + 1, local11 + 1, Static97.anInt1792, true, arg1, arg4, arg5);
						}
						this.method5640(local31, arg3, local11, Static362.anInt6109, false, arg1, arg4, arg5);
					}
					@Pc(301) int local301 = this.aClass201_8.method4456(local31);
					if (Static274.anInt4684 != -1) {
						this.aClass28_125.method3477((int) ((double) this.aClass201_8.anInt5069 * 0.7D) + local11, Static274.anInt4684, local301, arg3);
					}
					if (Static224.anInt3830 != -1) {
						this.aClass28_125.method3477(this.aClass201_8.anInt5069 + local11 + 1, Static224.anInt3830, local301, arg3);
					}
					local15 = local31;
					arg3 += local301;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(CIIIZLclient!be;II)V")
	protected abstract void method5640(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III[IIIIIILjava/lang/String;IIILclient!be;[Lclient!ig;I)I")
	public final int method5641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(13) Class24 arg10, @OriginalArg(14) Class12[] arg11, @OriginalArg(15) int arg12) {
		return this.method5642(0, arg2, 0, arg3, arg11, arg9, arg1, arg7, arg5, arg4, arg12, arg8, arg6, arg0, 1, arg10);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[IIII[Lclient!ig;IIIIIILjava/lang/String;IIILclient!be;)I")
	public final int method5642(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class12[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class24 arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method5629(arg13, arg3);
		if (arg0 == 0) {
			arg0 = this.aClass201_8.anInt5069;
		}
		@Pc(40) int[] local40;
		if (arg8 < this.aClass201_8.anInt5070 + this.aClass201_8.anInt5071 + arg0 && arg0 + arg0 > arg8) {
			local40 = null;
		} else {
			local40 = new int[] { arg9 };
		}
		@Pc(58) int local58 = this.aClass201_8.method4458(Static288.aStringArray33, local40, arg11, arg4);
		if (arg2 == -1) {
			arg2 = arg8 / arg0;
			if (arg2 <= 0) {
				arg2 = 1;
			}
		}
		if (arg2 > 0 && local58 >= arg2) {
			local58 = arg2;
			Static288.aStringArray33[arg2 - 1] = this.aClass201_8.method4451(arg4, Static288.aStringArray33[arg2 - 1], arg9);
		}
		if (arg7 == 3 && local58 == 1) {
			arg7 = 1;
		}
		@Pc(130) int local130;
		@Pc(178) int local178;
		if (arg7 == 0) {
			local130 = arg12 + this.aClass201_8.anInt5071;
		} else if (arg7 == 1) {
			local130 = (arg8 - this.aClass201_8.anInt5070 - this.aClass201_8.anInt5071 - arg0 * (local58 + -1)) / 2 + this.aClass201_8.anInt5071 + arg12;
		} else if (arg7 == 2) {
			local130 = arg8 + arg12 - this.aClass201_8.anInt5070 - (local58 + -1) * arg0;
		} else {
			local178 = (arg8 - this.aClass201_8.anInt5070 - this.aClass201_8.anInt5071 - (local58 - 1) * arg0) / (local58 + 1);
			if (local178 < 0) {
				local178 = 0;
			}
			arg0 += local178;
			local130 = local178 + arg12 + this.aClass201_8.anInt5071;
		}
		for (local178 = 0; local178 < local58; local178++) {
			if (arg14 == 0) {
				this.method5639(local130, arg15, arg4, arg10, arg5, arg6, arg1, Static288.aStringArray33[local178]);
			} else if (arg14 == 1) {
				this.method5639(local130, arg15, arg4, (arg9 - this.aClass201_8.method4452(Static288.aStringArray33[local178])) / 2 + arg10, arg5, arg6, arg1, Static288.aStringArray33[local178]);
			} else if (arg14 == 2) {
				this.method5639(local130, arg15, arg4, arg9 + arg10 - this.aClass201_8.method4452(Static288.aStringArray33[local178]), arg5, arg6, arg1, Static288.aStringArray33[local178]);
			} else if (local178 == local58 - 1) {
				this.method5639(local130, arg15, arg4, arg10, arg5, arg6, arg1, Static288.aStringArray33[local178]);
			} else {
				this.method5631(arg9, Static288.aStringArray33[local178]);
				this.method5639(local130, arg15, arg4, arg10, arg5, arg6, arg1, Static288.aStringArray33[local178]);
				Static416.anInt4772 = 0;
			}
			local130 += arg0;
		}
		return local58;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([I[IIZILjava/lang/String;[I[Lclient!ig;)V")
	private void method5643(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class12[] arg6) {
		@Pc(11) int local11 = arg2 - this.aClass201_8.anInt5069;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(38) char local38 = (char) (Static198.method3145(arg4.charAt(local22)) & 0xFF);
			if (local38 == '<') {
				local13 = local22;
			} else {
				@Pc(127) int local127;
				@Pc(135) int local135;
				if (local38 == '>' && local13 != -1) {
					@Pc(63) String local63 = arg4.substring(local13 + 1, local22);
					local13 = -1;
					if (local63.equals("lt")) {
						local38 = '<';
					} else if (local63.equals("gt")) {
						local38 = '>';
					} else if (local63.equals("nbsp")) {
						local38 = ' ';
					} else if (local63.equals("shy")) {
						local38 = '\u00ad';
					} else if (local63.equals("times")) {
						local38 = '×';
					} else if (local63.equals("euro")) {
						local38 = '€';
					} else if (local63.equals("copy")) {
						local38 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local127 = 0;
									} else {
										local127 = arg1[local17];
									}
									if (arg5 == null) {
										local135 = 0;
									} else {
										local135 = arg5[local17];
									}
									local17++;
									@Pc(148) int local148 = Static265.method4063(local63.substring(4));
									@Pc(152) Class12 local152 = arg6[local148];
									@Pc(161) int local161 = arg0 == null ? local152.method5655() : arg0[local148];
									local152.method5658(local127 + arg3, local135 + -local161 + this.aClass201_8.anInt5069 + local11, 1, 0);
									arg3 += arg6[local148].method5654();
									local15 = -1;
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method5634(local63);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass201_8.method4455(local15, local38);
					}
					@Pc(232) int local232;
					if (arg1 == null) {
						local232 = 0;
					} else {
						local232 = arg1[local17];
					}
					if (arg5 == null) {
						local127 = 0;
					} else {
						local127 = arg5[local17];
					}
					if (local38 != ' ') {
						if ((Static97.anInt1792 & 0xFF000000) != 0) {
							this.method5649(local38, local232 + arg3 + 1, local11 + 1 + local127, Static97.anInt1792, true);
						}
						this.method5649(local38, arg3 + local232, local127 + local11, Static362.anInt6109, false);
					} else if (Static416.anInt4772 > 0) {
						Static95.anInt1776 += Static416.anInt4772;
						arg3 += Static95.anInt1776 >> 8;
						Static95.anInt1776 &= 0xFF;
					}
					local17++;
					local135 = this.aClass201_8.method4456(local38);
					if (Static274.anInt4684 != -1) {
						this.aClass28_125.method3477((int) ((double) this.aClass201_8.anInt5069 * 0.7D) + local11, Static274.anInt4684, local135, arg3);
					}
					if (Static224.anInt3830 != -1) {
						this.aClass28_125.method3477(this.aClass201_8.anInt5069 + local11, Static224.anInt3830, local135, arg3);
					}
					arg3 += local135;
					local15 = local38;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI[Lclient!ig;[IIILjava/lang/String;I)V")
	public final void method5644(@OriginalArg(1) int arg0, @OriginalArg(2) Class12[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 != null) {
			this.method5629(arg0, 0);
			this.method5639(arg4, null, arg1, arg3, 0, 0, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method5645(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5629(arg2, -16777216);
		@Pc(18) int local18 = arg0.length();
		@Pc(21) int[] local21 = new int[local18];
		@Pc(24) int[] local24 = new int[local18];
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			local21[local30] = (int) (Math.sin((double) local30 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local24[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method5643(null, local21, arg4, arg3 - this.aClass201_8.method4452(arg0) / 2, arg0, local24, null);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method5646(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method5629(arg0, -16777216);
		@Pc(28) double local28 = 7.0D - (double) arg5 / 8.0D;
		if (local28 < 0.0D) {
			local28 = 0.0D;
		}
		@Pc(37) int local37 = arg1.length();
		@Pc(40) int[] local40 = new int[local37];
		for (@Pc(42) int local42 = 0; local42 < local37; local42++) {
			local40[local42] = (int) (local28 * Math.sin((double) arg2 + (double) local42 / 1.5D));
		}
		this.method5643(null, null, arg4, arg3 - this.aClass201_8.method4452(arg1) / 2, arg1, local40, null);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBLjava/lang/String;II)V")
	public final void method5647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		if (arg2 != null) {
			this.method5629(arg1, -1);
			this.method5639(arg3, null, null, arg0 - this.aClass201_8.method4452(arg2), 0, 0, null, arg2);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III[ILjava/lang/String;Ljava/util/Random;I[IIIIII[Lclient!ig;I)I")
	public final int method5648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class12[] arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg4.setSeed((long) arg10);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method5629(local20 << 24 | arg0 & 0xFFFFFF, local20 << 24 | arg7 & 0xFFFFFF);
		@Pc(42) int local42 = arg3.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg4.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		@Pc(70) int local70 = arg9;
		@Pc(76) int local76 = arg8 + this.aClass201_8.anInt5071;
		if (arg1 == 1) {
			local76 += (arg11 - this.aClass201_8.anInt5070 - this.aClass201_8.anInt5071) / 2;
		} else if (arg1 == 2) {
			local76 = arg11 + arg8 - this.aClass201_8.anInt5070;
		}
		@Pc(121) int local121 = -1;
		if (arg13 == 1) {
			local121 = local47 + this.aClass201_8.method4452(arg3);
			local70 = arg9 + (arg5 - local121) / 2;
		} else if (arg13 == 2) {
			local121 = local47 + this.aClass201_8.method4452(arg3);
			local70 = arg9 + arg5 - local121;
		}
		this.method5643(arg6, local45, local76, local70, arg3, null, arg12);
		if (arg2 != null) {
			if (local121 == -1) {
				local121 = this.aClass201_8.method4452(arg3) + local47;
			}
			arg2[3] = this.aClass201_8.anInt5070 + this.aClass201_8.anInt5071;
			arg2[1] = local76 - this.aClass201_8.anInt5071;
			arg2[0] = local70;
			arg2[2] = local121;
		}
		return local47;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
