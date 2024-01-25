import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public abstract class Class37 {

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "Lclient!th;")
	private final Class188 aClass188_9;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "Lclient!ae;")
	private final Class4 aClass4_10;

	static {
		new Class93("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		new Class93("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ae;Lclient!th;)V")
	protected Class37(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class188 arg1) {
		this.aClass188_9 = arg1;
		this.aClass4_10 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method5246(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5260(-16777216, arg1);
		@Pc(16) int local16 = arg0.length();
		@Pc(31) int[] local31 = new int[local16];
		@Pc(34) int[] local34 = new int[local16];
		for (@Pc(36) int local36 = 0; local36 < local16; local36++) {
			local31[local36] = (int) (Math.sin((double) arg3 / 5.0D + (double) local36 / 5.0D) * 5.0D);
			local34[local36] = (int) (Math.sin((double) arg3 / 5.0D + (double) local36 / 3.0D) * 5.0D);
		}
		this.method5252(local31, arg4, arg0, local34, arg2 - this.aClass188_9.method5318(arg0) / 2, null, null);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILjava/util/Random;I[Lclient!gj;IILjava/lang/String;[I)I")
	public final int method5247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(5) Class31[] arg3, @OriginalArg(6) int arg4, @OriginalArg(8) String arg5, @OriginalArg(9) int[] arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg2.setSeed((long) arg1);
		@Pc(26) int local26 = (arg2.nextInt() & 0x1F) + 192;
		this.method5260((local26 | 0x0) << 24, local26 << 24 | 0xFFFFFF);
		@Pc(46) int local46 = arg5.length();
		@Pc(49) int[] local49 = new int[local46];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
			local49[local53] = local51;
			if ((arg2.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method5252(local49, arg0, arg5, null, arg4, arg6, arg3);
		return local51;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(CIIIZLclient!hb;II)V")
	protected abstract void method5248(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class77 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method5249(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method5260(-16777216, arg2);
		@Pc(26) double local26 = 7.0D - (double) arg1 / 8.0D;
		if (local26 < 0.0D) {
			local26 = 0.0D;
		}
		@Pc(35) int local35 = arg0.length();
		@Pc(38) int[] local38 = new int[local35];
		for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
			local38[local40] = (int) (Math.sin((double) local40 / 1.5D + (double) arg5) * local26);
		}
		this.method5252(null, arg3, arg0, local38, arg4 - this.aClass188_9.method5318(arg0) / 2, null, null);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLclient!hb;IIII[I[Lclient!gj;IIIILjava/lang/String;II)I")
	public final int method5251(@OriginalArg(0) int arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class31[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg12 == null) {
			return 0;
		}
		this.method5260(arg5, arg10);
		if (arg13 == 0) {
			arg13 = this.aClass188_9.anInt6090;
		}
		@Pc(46) int[] local46;
		if (this.aClass188_9.anInt6080 + this.aClass188_9.anInt6075 + arg13 > arg2 && arg2 < arg13 + arg13) {
			local46 = null;
		} else {
			local46 = new int[] { arg11 };
		}
		@Pc(59) int local59 = this.aClass188_9.method5316(arg12, local46, arg7, Static295.aStringArray56);
		if (arg8 == 3 && local59 == 1) {
			arg8 = 1;
		}
		@Pc(103) int local103;
		@Pc(131) int local131;
		if (arg8 == 0) {
			local103 = arg4 + this.aClass188_9.anInt6075;
		} else if (arg8 == 1) {
			local103 = arg4 + this.aClass188_9.anInt6075 + (arg2 - this.aClass188_9.anInt6075 - this.aClass188_9.anInt6080 - arg13 * (local59 - 1)) / 2;
		} else if (arg8 == 2) {
			local103 = arg2 + arg4 - (local59 - 1) * arg13 - this.aClass188_9.anInt6080;
		} else {
			local131 = (arg2 - (local59 - 1) * arg13 - this.aClass188_9.anInt6075 - this.aClass188_9.anInt6080) / (local59 + 1);
			if (local131 < 0) {
				local131 = 0;
			}
			local103 = arg4 + this.aClass188_9.anInt6075 + local131;
			arg13 += local131;
		}
		for (local131 = 0; local131 < local59; local131++) {
			if (arg14 == 0) {
				this.method5262(arg0, arg3, Static295.aStringArray56[local131], arg1, arg7, arg9, arg6, local103);
			} else if (arg14 == 1) {
				this.method5262((arg11 - this.aClass188_9.method5318(Static295.aStringArray56[local131])) / 2 + arg0, arg3, Static295.aStringArray56[local131], arg1, arg7, arg9, arg6, local103);
			} else if (arg14 == 2) {
				this.method5262(arg11 + arg0 - this.aClass188_9.method5318(Static295.aStringArray56[local131]), arg3, Static295.aStringArray56[local131], arg1, arg7, arg9, arg6, local103);
			} else if (local59 - 1 == local131) {
				this.method5262(arg0, arg3, Static295.aStringArray56[local131], arg1, arg7, arg9, arg6, local103);
			} else {
				this.method5255(arg11, Static295.aStringArray56[local131]);
				this.method5262(arg0, arg3, Static295.aStringArray56[local131], arg1, arg7, arg9, arg6, local103);
				Static324.anInt6540 = 0;
			}
			local103 += arg13;
		}
		return local59;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([IILjava/lang/String;I[II[I[Lclient!gj;)V")
	private void method5252(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class31[] arg6) {
		@Pc(11) int local11 = arg1 - this.aClass188_9.anInt6090;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg2.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static241.method4169(arg2.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local17 = local26;
			} else {
				@Pc(120) int local120;
				@Pc(132) int local132;
				if (local37 == '>' && local17 != -1) {
					@Pc(58) String local58 = arg2.substring(local17 + 1, local26);
					local17 = -1;
					if (local58.equals("lt")) {
						local37 = '<';
					} else if (local58.equals("gt")) {
						local37 = '>';
					} else if (local58.equals("nbsp")) {
						local37 = ' ';
					} else if (local58.equals("shy")) {
						local37 = '\u00ad';
					} else if (local58.equals("times")) {
						local37 = '×';
					} else if (local58.equals("euro")) {
						local37 = '€';
					} else if (local58.equals("copy")) {
						local37 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local120 = 0;
									} else {
										local120 = arg0[local21];
									}
									if (arg3 == null) {
										local132 = 0;
									} else {
										local132 = arg3[local21];
									}
									local21++;
									@Pc(143) int local143 = Static133.method2671(local58.substring(4));
									@Pc(147) Class31 local147 = arg6[local143];
									@Pc(156) int local156 = arg5 == null ? local147.method4378() : arg5[local143];
									local147.method4379(local120 + arg4, local132 + -local156 + this.aClass188_9.anInt6090 + local11, 0, 0);
									local19 = -1;
									arg4 += arg6[local143].method4376();
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method5257(local58);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg4 += this.aClass188_9.method5317(local37, local19);
					}
					@Pc(223) int local223;
					if (arg0 == null) {
						local223 = 0;
					} else {
						local223 = arg0[local21];
					}
					if (arg3 == null) {
						local120 = 0;
					} else {
						local120 = arg3[local21];
					}
					if (local37 != ' ') {
						if ((Static236.anInt4526 & 0xFF000000) != 0) {
							this.method5253(local37, local223 + arg4 + 1, local11 + 1 + local120, Static236.anInt4526, true);
						}
						this.method5253(local37, local223 + arg4, local11 - -local120, Static186.anInt5458, false);
					} else if (Static324.anInt6540 > 0) {
						Static65.anInt1419 += Static324.anInt6540;
						arg4 += Static65.anInt1419 >> 8;
						Static65.anInt1419 &= 0xFF;
					}
					local21++;
					local132 = this.aClass188_9.method5314(local37);
					if (Static60.anInt1312 != -1) {
						this.aClass4_10.method4260(local132, arg4, (int) ((double) this.aClass188_9.anInt6090 * 0.7D) + local11, Static60.anInt1312);
					}
					if (Static163.anInt1496 != -1) {
						this.aClass4_10.method4260(local132, arg4, local11 + this.aClass188_9.anInt6090, Static163.anInt1496);
					}
					local19 = local37;
					arg4 += local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5253(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null) {
			this.method5260(arg0, arg2);
			this.method5262(arg1, 0, arg3, null, null, 0, null, arg4);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg1.length() > local11; local11++) {
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
			Static324.anInt6540 = (arg0 - this.aClass188_9.method5318(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[III[Lclient!gj;IIIII[ILjava/lang/String;IILjava/util/Random;)I")
	public final int method5256(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class31[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Random arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg13.setSeed((long) arg12);
		@Pc(20) int local20 = (arg13.nextInt() & 0x1F) + 192;
		this.method5260(local20 << 24 | arg8 & 0xFFFFFF, arg7 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg10.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg13.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(65) int local65 = arg6;
		@Pc(78) int local78 = arg3 + this.aClass188_9.anInt6075;
		@Pc(80) int local80 = -1;
		if (arg11 == 1) {
			local78 += (arg0 - this.aClass188_9.anInt6080 - this.aClass188_9.anInt6075) / 2;
		} else if (arg11 == 2) {
			local78 = arg0 + arg3 - this.aClass188_9.anInt6080;
		}
		if (arg5 == 1) {
			local80 = this.aClass188_9.method5318(arg10) + local45;
			local65 = arg6 + (arg2 - local80) / 2;
		} else if (arg5 == 2) {
			local80 = this.aClass188_9.method5318(arg10) + local45;
			local65 = arg6 + arg2 - local80;
		}
		this.method5252(local43, local78, arg10, null, local65, arg9, arg4);
		if (arg1 != null) {
			if (local80 == -1) {
				local80 = this.aClass188_9.method5318(arg10) + local45;
			}
			arg1[2] = local80;
			arg1[0] = local65;
			arg1[3] = this.aClass188_9.anInt6080 + this.aClass188_9.anInt6075;
			arg1[1] = local78 - this.aClass188_9.anInt6075;
		}
		return local45;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5257(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static186.anInt5458 = Static186.anInt5458 & 0xFF000000 | Static126.method2621(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static186.anInt5458 = Static133.anInt2771 & 0xFFFFFF | Static186.anInt5458 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static186.anInt5458 = Static126.method2621(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static186.anInt5458 = Static133.anInt2771;
			} else if (arg0.startsWith("str=")) {
				Static60.anInt1312 = Static126.method2621(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static60.anInt1312 = -8388608;
			} else if (arg0.equals("/str")) {
				Static60.anInt1312 = -1;
			} else if (arg0.startsWith("u=")) {
				Static163.anInt1496 = Static126.method2621(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static163.anInt1496 = -16777216;
			} else if (arg0.equals("/u")) {
				Static163.anInt1496 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static236.anInt4526 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static236.anInt4526 = Static126.method2621(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static236.anInt4526 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static236.anInt4526 = Static170.anInt3042;
			} else if (arg0.equals("br")) {
				this.method5260(Static170.anInt3042, Static133.anInt2771);
			}
		} catch (@Pc(169) Exception local169) {
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIIILjava/lang/String;I[Lclient!gj;I)V")
	public final void method5258(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class31[] arg5) {
		if (arg3 != null) {
			this.method5260(0, arg4);
			this.method5262(arg2, 0, arg3, null, arg5, 0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;BIIII)V")
	public final void method5259(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5260(-1, arg1);
			this.method5262(arg3 - this.aClass188_9.method5318(arg0), 0, arg0, null, null, 0, null, arg2);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
	private void method5260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static163.anInt1496 = -1;
		Static60.anInt1312 = -1;
		Static65.anInt1419 = 0;
		Static324.anInt6540 = 0;
		Static133.anInt2771 = arg1;
		Static186.anInt5458 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static170.anInt3042 = arg0;
		Static236.anInt4526 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILjava/lang/String;Lclient!hb;[Lclient!gj;I[III)V")
	private void method5262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class77 arg3, @OriginalArg(4) Class31[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 - this.aClass188_9.anInt6090;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg2.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(39) char local39 = (char) (Static241.method4169(arg2.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				if (local39 == '>' && local13 != -1) {
					@Pc(62) String local62 = arg2.substring(local13 + 1, local28);
					local13 = -1;
					if (local62.equals("lt")) {
						local39 = '<';
					} else if (local62.equals("gt")) {
						local39 = '>';
					} else if (local62.equals("nbsp")) {
						local39 = ' ';
					} else if (local62.equals("shy")) {
						local39 = '\u00ad';
					} else if (local62.equals("times")) {
						local39 = '×';
					} else if (local62.equals("euro")) {
						local39 = '€';
					} else if (local62.equals("copy")) {
						local39 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									@Pc(126) int local126 = Static133.method2671(local62.substring(4));
									@Pc(130) Class31 local130 = arg4[local126];
									@Pc(139) int local139 = arg6 == null ? local130.method4378() : arg6[local126];
									if ((-16777216 & Static186.anInt5458) == -16777216) {
										local130.method4379(arg0, this.aClass188_9.anInt6090 + local11 - local139, 0, 0);
									} else {
										local130.method4379(arg0, local11 + this.aClass188_9.anInt6090 - local139, 1, Static186.anInt5458 & 0xFF000000 | 0xFFFFFF);
									}
									arg0 += arg4[local126].method4376();
									local15 = -1;
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method5257(local62);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass188_9.method5317(local39, local15);
					}
					if (local39 == ' ') {
						if (Static324.anInt6540 > 0) {
							Static65.anInt1419 += Static324.anInt6540;
							arg0 += Static65.anInt1419 >> 8;
							Static65.anInt1419 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static236.anInt4526 & 0xFF000000) != 0) {
							this.method5253(local39, arg0 + 1, local11 + 1, Static236.anInt4526, true);
						}
						this.method5253(local39, arg0, local11, Static186.anInt5458, false);
					} else {
						if ((Static236.anInt4526 & 0xFF000000) != 0) {
							this.method5248(local39, arg0 + 1, local11 + 1, Static236.anInt4526, true, arg3, arg5, arg1);
						}
						this.method5248(local39, arg0, local11, Static186.anInt5458, false, arg3, arg5, arg1);
					}
					@Pc(311) int local311 = this.aClass188_9.method5314(local39);
					if (Static60.anInt1312 != -1) {
						this.aClass4_10.method4260(local311, arg0, (int) ((double) this.aClass188_9.anInt6090 * 0.7D) + local11, Static60.anInt1312);
					}
					if (Static163.anInt1496 != -1) {
						this.aClass4_10.method4260(local311, arg0, this.aClass188_9.anInt6090 + local11 + 1, Static163.anInt1496);
					}
					arg0 += local311;
					local15 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5260(arg4, arg1);
			this.method5262(arg3 - this.aClass188_9.method5318(arg2) / 2, 0, arg2, null, null, 0, null, arg0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method5264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5260(-16777216, arg2);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			local19[local29] = (int) (Math.sin((double) arg1 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method5252(null, arg0, arg3, local19, arg4 - this.aClass188_9.method5318(arg3) / 2, null, null);
	}
}
