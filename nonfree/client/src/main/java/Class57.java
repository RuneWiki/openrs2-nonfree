import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class57 {

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!za;")
	private final Class50 aClass50_10;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!fj;")
	private final Class79 aClass79_9;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!za;Lclient!fj;)V")
	protected Class57(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class79 arg1) {
		this.aClass50_10 = arg0;
		this.aClass79_9 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!o;[IIILclient!ta;IILjava/lang/String;I)V")
	private void method5941(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class49 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		@Pc(11) int local11 = arg2 - this.aClass79_9.anInt2294;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(31) int local31 = arg7.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(44) char local44 = (char) (Static292.method4104(arg7.charAt(local33)) & 0xFF);
			if (local44 == '<') {
				local26 = local33;
			} else {
				if (local44 == '>' && local26 != -1) {
					@Pc(69) String local69 = arg7.substring(local26 + 1, local33);
					local26 = -1;
					if (local69.equals("lt")) {
						local44 = '<';
					} else if (local69.equals("gt")) {
						local44 = '>';
					} else if (local69.equals("nbsp")) {
						local44 = ' ';
					} else if (local69.equals("shy")) {
						local44 = '\u00ad';
					} else if (local69.equals("times")) {
						local44 = '×';
					} else if (local69.equals("euro")) {
						local44 = '€';
					} else if (local69.equals("copy")) {
						local44 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=")) {
								try {
									@Pc(129) int local129 = Static335.method4519(local69.substring(4));
									@Pc(133) Class80 local133 = arg0[local129];
									@Pc(142) int local142 = arg1 == null ? local133.Q() : arg1[local129];
									if ((Static309.anInt5346 & 0xFF000000) == -16777216) {
										local133.W(arg6, local11 + this.aClass79_9.anInt2294 - local142, 1, 0, 1);
									} else {
										local133.W(arg6, local11 + this.aClass79_9.anInt2294 - local142, 0, Static309.anInt5346 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg6 += arg0[local129].RA();
									local28 = -1;
								} catch (@Pc(196) Exception local196) {
								}
							} else {
								this.method5956(local69);
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local26 == -1) {
					if (local28 != -1) {
						arg6 += this.aClass79_9.method1975(local44, local28);
					}
					if (local44 == ' ') {
						if (Static2.anInt12 > 0) {
							Static230.anInt4290 += Static2.anInt12;
							arg6 += Static230.anInt4290 >> 8;
							Static230.anInt4290 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static104.anInt2112 & 0xFF000000) != 0) {
							this.B(local44, arg6 + 1, local11 - -1, Static104.anInt2112, true);
						}
						this.B(local44, arg6, local11, Static309.anInt5346, false);
					} else {
						if ((Static104.anInt2112 & 0xFF000000) != 0) {
							this.method5945(local44, arg6 + 1, local11 + 1, Static104.anInt2112, true, arg4, arg5, arg3);
						}
						this.method5945(local44, arg6, local11, Static309.anInt5346, false, arg4, arg5, arg3);
					}
					@Pc(321) int local321 = this.aClass79_9.method1976(local44);
					if (Static417.anInt6985 != -1) {
						this.aClass50_10.method5870(local321, Static417.anInt6985, (int) ((double) this.aClass79_9.anInt2294 * 0.7D) + local11, arg6);
					}
					if (Static315.anInt5441 != -1) {
						this.aClass50_10.method5870(local321, Static315.anInt5441, this.aClass79_9.anInt2294 + local11 + 1, arg6);
					}
					local28 = local44;
					arg6 += local321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method5942(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			Static2.anInt12 = (arg1 - this.aClass79_9.method1977(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
	public final void method5943(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5959(-16777216, arg3);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) arg0 / 5.0D + (double) local24 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) local24 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5948(local19, null, arg1, arg2, arg4 - this.aClass79_9.method1977(arg1) / 2, null, local22);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIBLjava/util/Random;[Lclient!o;[ILjava/lang/String;IIIII[I)I")
	public final int method5944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) Class80[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg4.setSeed((long) arg9);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method5959(arg10 & 0xFFFFFF | local20 << 24, arg1 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg7.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(70) int local70 = arg8;
		@Pc(77) int local77 = arg11 + this.aClass79_9.anInt2290;
		if (arg3 == 1) {
			local77 += (arg2 - this.aClass79_9.anInt2284 - this.aClass79_9.anInt2290) / 2;
		} else if (arg3 == 2) {
			local77 = arg11 + arg2 - this.aClass79_9.anInt2284;
		}
		@Pc(112) int local112 = -1;
		if (arg0 == 1) {
			local112 = local50 + this.aClass79_9.method1977(arg7);
			local70 = arg8 + (arg12 - local112) / 2;
		} else if (arg0 == 2) {
			local112 = this.aClass79_9.method1977(arg7) + local50;
			local70 = arg8 + arg12 - local112;
		}
		this.method5948(local43, arg5, arg7, local77, local70, arg6, null);
		if (arg13 != null) {
			if (local112 == -1) {
				local112 = local50 + this.aClass79_9.method1977(arg7);
			}
			arg13[0] = local70;
			arg13[3] = this.aClass79_9.anInt2290 + this.aClass79_9.anInt2284;
			arg13[1] = local77 - this.aClass79_9.anInt2290;
			arg13[2] = local112;
		}
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	protected abstract void method5945(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class49 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ta;[Lclient!o;II[IIIIBIIILjava/lang/String;IIII)I")
	public final int method5946(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class80[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method5959(arg5, arg2);
		if (arg8 == 0) {
			arg8 = this.aClass79_9.anInt2294;
		}
		@Pc(63) int[] local63;
		if (this.aClass79_9.anInt2284 + this.aClass79_9.anInt2290 + arg8 > arg14 && arg8 + arg8 > arg14) {
			local63 = null;
		} else {
			local63 = new int[] { arg13 };
		}
		@Pc(76) int local76 = this.aClass79_9.method1986(Static72.aStringArray5, arg11, arg1, local63);
		if (arg10 == -1) {
			arg10 = arg14 / arg8;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local76 >= arg10) {
			Static72.aStringArray5[arg10 - 1] = this.aClass79_9.method1985(arg1, arg13, Static72.aStringArray5[arg10 - 1]);
			local76 = arg10;
		}
		if (arg15 == 3 && local76 == 1) {
			arg15 = 1;
		}
		@Pc(138) int local138;
		@Pc(188) int local188;
		if (arg15 == 0) {
			local138 = arg6 + this.aClass79_9.anInt2290;
		} else if (arg15 == 1) {
			local138 = this.aClass79_9.anInt2290 + arg6 + (arg14 - this.aClass79_9.anInt2284 - this.aClass79_9.anInt2290 - arg8 * (local76 + -1)) / 2;
		} else if (arg15 == 2) {
			local138 = arg6 + arg14 - arg8 * (local76 - 1) - this.aClass79_9.anInt2284;
		} else {
			local188 = (arg14 - this.aClass79_9.anInt2284 - this.aClass79_9.anInt2290 - arg8 * (local76 + -1)) / (local76 + 1);
			if (local188 < 0) {
				local188 = 0;
			}
			arg8 += local188;
			local138 = arg6 + this.aClass79_9.anInt2290 + local188;
		}
		for (local188 = 0; local188 < local76; local188++) {
			if (arg12 == 0) {
				this.method5941(arg1, arg4, local138, arg9, arg0, arg7, arg3, Static72.aStringArray5[local188]);
			} else if (arg12 == 1) {
				this.method5941(arg1, arg4, local138, arg9, arg0, arg7, arg3 + (arg13 - this.aClass79_9.method1977(Static72.aStringArray5[local188])) / 2, Static72.aStringArray5[local188]);
			} else if (arg12 == 2) {
				this.method5941(arg1, arg4, local138, arg9, arg0, arg7, arg3 + arg13 - this.aClass79_9.method1977(Static72.aStringArray5[local188]), Static72.aStringArray5[local188]);
			} else if (local188 == local76 - 1) {
				this.method5941(arg1, arg4, local138, arg9, arg0, arg7, arg3, Static72.aStringArray5[local188]);
			} else {
				this.method5942(Static72.aStringArray5[local188], arg13);
				this.method5941(arg1, arg4, local138, arg9, arg0, arg7, arg3, Static72.aStringArray5[local188]);
				Static2.anInt12 = 0;
			}
			local138 += arg8;
		}
		return local76;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method5947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5959(-16777216, arg2);
		@Pc(20) int local20 = arg4.length();
		@Pc(23) int[] local23 = new int[local20];
		for (@Pc(25) int local25 = 0; local25 < local20; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5948(null, null, arg4, arg1, arg3 - this.aClass79_9.method1977(arg4) / 2, null, local23);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([I[Lclient!o;Ljava/lang/String;II[I[II)V")
	private void method5948(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class80[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg3 - this.aClass79_9.anInt2294;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg2.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static292.method4104(arg2.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local21 = local30;
			} else {
				@Pc(124) int local124;
				@Pc(136) int local136;
				if (local41 == '>' && local21 != -1) {
					@Pc(66) String local66 = arg2.substring(local21 + 1, local30);
					local21 = -1;
					if (local66.equals("lt")) {
						local41 = '<';
					} else if (local66.equals("gt")) {
						local41 = '>';
					} else if (local66.equals("nbsp")) {
						local41 = ' ';
					} else if (local66.equals("shy")) {
						local41 = '\u00ad';
					} else if (local66.equals("times")) {
						local41 = '×';
					} else if (local66.equals("euro")) {
						local41 = '€';
					} else if (local66.equals("copy")) {
						local41 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local124 = 0;
									} else {
										local124 = arg0[local25];
									}
									if (arg6 == null) {
										local136 = 0;
									} else {
										local136 = arg6[local25];
									}
									local25++;
									@Pc(147) int local147 = Static335.method4519(local66.substring(4));
									@Pc(151) Class80 local151 = arg1[local147];
									@Pc(160) int local160 = arg5 == null ? local151.Q() : arg5[local147];
									local151.W(arg4 + local124, -local160 + local7 + this.aClass79_9.anInt2294 - -local136, 1, 0, 1);
									arg4 += arg1[local147].RA();
									local23 = -1;
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method5956(local66);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg4 += this.aClass79_9.method1975(local41, local23);
					}
					@Pc(232) int local232;
					if (arg0 == null) {
						local232 = 0;
					} else {
						local232 = arg0[local25];
					}
					if (arg6 == null) {
						local124 = 0;
					} else {
						local124 = arg6[local25];
					}
					local25++;
					if (local41 != ' ') {
						if ((Static104.anInt2112 & 0xFF000000) != 0) {
							this.B(local41, arg4 + local232 + 1, local7 - -local124 + 1, Static104.anInt2112, true);
						}
						this.B(local41, local232 + arg4, local124 + local7, Static309.anInt5346, false);
					} else if (Static2.anInt12 > 0) {
						Static230.anInt4290 += Static2.anInt12;
						arg4 += Static230.anInt4290 >> 8;
						Static230.anInt4290 &= 0xFF;
					}
					local136 = this.aClass79_9.method1976(local41);
					if (Static417.anInt6985 != -1) {
						this.aClass50_10.method5870(local136, Static417.anInt6985, (int) ((double) this.aClass79_9.anInt2294 * 0.7D) + local7, arg4);
					}
					if (Static315.anInt5441 != -1) {
						this.aClass50_10.method5870(local136, Static315.anInt5441, local7 + this.aClass79_9.anInt2294, arg4);
					}
					local23 = local41;
					arg4 += local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public final void method5949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method5959(-16777216, arg2);
		@Pc(21) double local21 = 7.0D - (double) arg5 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(34) int local34 = arg3.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
			local37[local39] = (int) (Math.sin((double) local39 / 1.5D + (double) arg4) * local21);
		}
		this.method5948(null, null, arg3, arg0, arg1 - this.aClass79_9.method1977(arg3) / 2, null, local37);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!o;Ljava/lang/String;IIII[I)V")
	public final void method5950(@OriginalArg(1) Class80[] arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 != null) {
			this.method5959(0, arg2);
			this.method5941(arg0, arg5, arg3, 0, null, 0, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5953(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			this.method5959(arg4, arg2);
			this.method5941(null, null, arg3, 0, null, 0, arg0 - this.aClass79_9.method1977(arg1) / 2, arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIIILjava/lang/String;IIII[Lclient!o;IILclient!ta;[I)I")
	public final int method5955(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) Class80[] arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) Class49 arg11, @OriginalArg(15) int[] arg12) {
		return this.method5946(arg11, arg8, arg10, arg3, arg12, arg7, arg1, arg0, 0, arg2, 0, arg4, 1, arg9, arg5, arg6);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5956(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static309.anInt5346 = Static309.anInt5346 & 0xFF000000 | Static205.method3203(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static309.anInt5346 = Static309.anInt5346 & 0xFF000000 | Static146.anInt3032 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static309.anInt5346 = Static205.method3203(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static309.anInt5346 = Static146.anInt3032;
			} else if (arg0.startsWith("str=")) {
				Static417.anInt6985 = Static309.anInt5346 & 0xFF000000 | Static205.method3203(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static417.anInt6985 = Static309.anInt5346 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static417.anInt6985 = -1;
			} else if (arg0.startsWith("u=")) {
				Static315.anInt5441 = Static309.anInt5346 & 0xFF000000 | Static205.method3203(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static315.anInt5441 = Static309.anInt5346 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static315.anInt5441 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static104.anInt2112 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static104.anInt2112 = Static309.anInt5346 & 0xFF000000 | Static205.method3203(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static104.anInt2112 = Static309.anInt5346 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static104.anInt2112 = Static45.anInt7314;
			} else if (arg0.equals("br")) {
				this.method5959(Static45.anInt7314, Static146.anInt3032);
			}
		} catch (@Pc(202) Exception local202) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI[I[Lclient!o;IIIILjava/util/Random;Ljava/lang/String;)I")
	public final int method5957(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class80[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg5.setSeed((long) arg4);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method5959((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg6.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local40; local60++) {
			local43[local60] = local58;
			if ((arg5.nextInt() & 0x3) == 0) {
				local58++;
			}
		}
		this.method5948(local43, arg2, arg6, arg0, arg3, arg1, null);
		return local58;
	}

	@OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5958(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5959(-1, arg3);
			this.method5941(null, null, arg1, 0, null, 0, arg2 - this.aClass79_9.method1977(arg0), arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method5959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static2.anInt12 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static146.anInt3032 = arg1;
		Static309.anInt5346 = arg1;
		Static315.anInt5441 = -1;
		Static417.anInt6985 = -1;
		Static230.anInt4290 = 0;
		Static45.anInt7314 = arg0;
		Static104.anInt2112 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBILjava/lang/String;)V")
	public final void method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5959(arg2, arg1);
			this.method5941(null, null, arg3, 0, null, 0, arg0, arg4);
		}
	}
}
