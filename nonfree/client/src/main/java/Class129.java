import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class129 {

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!qa;")
	private final Class109 aClass109_12;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!gv;")
	private final Class101 aClass101_10;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qa;Lclient!gv;)V")
	protected Class129(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class101 arg1) {
		this.aClass109_12 = arg0;
		this.aClass101_10 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public final void method5816(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method5817(-16777216, arg4);
		@Pc(23) double local23 = 7.0D - (double) arg3 / 8.0D;
		if (local23 < 0.0D) {
			local23 = 0.0D;
		}
		@Pc(36) int local36 = arg2.length();
		@Pc(39) int[] local39 = new int[local36];
		for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
			local39[local41] = (int) (Math.sin((double) arg5 + (double) local41 / 1.5D) * local23);
		}
		this.method5831(arg0, null, arg1 - this.aClass101_10.method1963(arg2) / 2, null, local39, arg2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	private void method5817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static244.anInt4357 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static54.anInt1123 = -1;
		Static347.anInt5975 = arg1;
		Static453.anInt7844 = arg1;
		Static135.anInt2313 = 0;
		Static173.anInt3173 = 0;
		Static229.anInt5085 = arg0;
		Static24.anInt542 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method5818(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(17) int local17 = 0; arg0.length() > local17; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<') {
				local9 = true;
			} else if (local23 == '>') {
				local9 = false;
			} else if (!local9 && local23 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static135.anInt2313 = (arg1 - this.aClass101_10.method1963(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII[Lclient!f;ILjava/lang/String;Ljava/util/Random;IB[II[II)I")
	public final int method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class80[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Random arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg8.setSeed((long) arg13);
		@Pc(28) int local28 = (arg8.nextInt() & 0x1F) + 192;
		this.method5817(local28 << 24 | arg0 & 0xFFFFFF, local28 << 24 | arg9 & 0xFFFFFF);
		@Pc(48) int local48 = arg7.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg8.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(80) int local80 = arg2;
		@Pc(86) int local86 = this.aClass101_10.anInt2378 + arg11;
		@Pc(88) int local88 = -1;
		if (arg4 == 1) {
			local86 += (arg3 - this.aClass101_10.anInt2376 - this.aClass101_10.anInt2378) / 2;
		} else if (arg4 == 2) {
			local86 = arg3 + arg11 - this.aClass101_10.anInt2376;
		}
		if (arg6 == 1) {
			local88 = this.aClass101_10.method1963(arg7) + local53;
			local80 = arg2 + (arg1 - local88) / 2;
		} else if (arg6 == 2) {
			local88 = this.aClass101_10.method1963(arg7) + local53;
			local80 = arg2 + arg1 - local88;
		}
		this.method5831(local86, arg10, local80, local51, null, arg7, arg5);
		if (arg12 != null) {
			if (local88 == -1) {
				local88 = local53 + this.aClass101_10.method1963(arg7);
			}
			arg12[2] = local88;
			arg12[0] = local80;
			arg12[1] = local86 - this.aClass101_10.anInt2378;
			arg12[3] = this.aClass101_10.anInt2378 + this.aClass101_10.anInt2376;
		}
		return local53;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5821(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static453.anInt7844 = Static453.anInt7844 & 0xFF000000 | Static10.method281(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static453.anInt7844 = Static347.anInt5975 & 0xFFFFFF | Static453.anInt7844 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static453.anInt7844 = Static10.method281(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static453.anInt7844 = Static347.anInt5975;
			} else if (arg0.startsWith("str=")) {
				Static54.anInt1123 = Static10.method281(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static54.anInt1123 = -8388608;
			} else if (arg0.equals("/str")) {
				Static54.anInt1123 = -1;
			} else if (arg0.startsWith("u=")) {
				Static244.anInt4357 = Static10.method281(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static244.anInt4357 = -16777216;
			} else if (arg0.equals("/u")) {
				Static244.anInt4357 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static24.anInt542 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static24.anInt542 = Static10.method281(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static24.anInt542 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static24.anInt542 = Static229.anInt5085;
			} else if (arg0.equals("br")) {
				this.method5817(Static229.anInt5085, Static347.anInt5975);
				return;
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
	public final void method5823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5817(-16777216, arg2);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg0 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method5831(arg1, null, arg3 - this.aClass101_10.method1963(arg4) / 2, local19, local22, arg4, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	protected abstract void method5824(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class62 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;BIIII)V")
	public final void method5825(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5817(arg3, arg1);
			this.method5829(0, arg2, arg0, arg4, 0, null, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[IILjava/lang/String;I[Lclient!f;II)V")
	public final void method5826(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) Class80[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method5817(0, arg5);
			this.method5829(0, arg4, arg2, arg1, 0, arg3, null, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5817(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) arg1 / 5.0D + (double) local21 / 2.0D) * 5.0D);
		}
		this.method5831(arg3, null, arg4 - this.aClass101_10.method1963(arg2) / 2, null, local19, arg2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5817(arg3, arg2);
			this.method5829(0, arg1 - this.aClass101_10.method1963(arg4) / 2, arg4, arg0, 0, null, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;II[Lclient!f;BLclient!ea;[I)V")
	private void method5829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class80[] arg5, @OriginalArg(7) Class62 arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg3 - this.aClass101_10.anInt2367;
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg2.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static57.method1009(arg2.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(57) String local57 = arg2.substring(local13 + 1, local24);
					local13 = -1;
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
									@Pc(113) int local113 = Static438.method5871(local57.substring(4));
									@Pc(117) Class80 local117 = arg5[local113];
									@Pc(126) int local126 = arg7 == null ? local117.JA() : arg7[local113];
									if ((Static453.anInt7844 & -16777216) == -16777216) {
										local117.YA(arg1, local7 + this.aClass101_10.anInt2367 - local126, 1, 0, 1);
									} else {
										local117.YA(arg1, local7 + this.aClass101_10.anInt2367 - local126, 0, Static453.anInt7844 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local19 = -1;
									arg1 += arg5[local113].ja();
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method5821(local57);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local19 != -1) {
						arg1 += this.aClass101_10.method1967(local35, local19);
					}
					if (local35 == ' ') {
						if (Static135.anInt2313 > 0) {
							Static173.anInt3173 += Static135.anInt2313;
							arg1 += Static173.anInt3173 >> 8;
							Static173.anInt3173 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static24.anInt542 & 0xFF000000) != 0) {
							this.B(local35, arg1 + 1, local7 + 1, Static24.anInt542, true);
						}
						this.B(local35, arg1, local7, Static453.anInt7844, false);
					} else {
						if ((Static24.anInt542 & 0xFF000000) != 0) {
							this.method5824(local35, arg1 + 1, local7 + 1, Static24.anInt542, true, arg6, arg0, arg4);
						}
						this.method5824(local35, arg1, local7, Static453.anInt7844, false, arg6, arg0, arg4);
					}
					@Pc(306) int local306 = this.aClass101_10.method1971(local35);
					if (Static54.anInt1123 != -1) {
						this.aClass109_12.method4689(local7 + (int) ((double) this.aClass101_10.anInt2367 * 0.7D), Static54.anInt1123, arg1, local306);
					}
					if (Static244.anInt4357 != -1) {
						this.aClass109_12.method4689(this.aClass101_10.anInt2367 + local7 + 1, Static244.anInt4357, arg1, local306);
					}
					local19 = local35;
					arg1 += local306;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!ea;BI[IIIII[Lclient!f;IIILjava/lang/String;II)I")
	public final int method5830(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class80[] arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) String arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5833(arg10, arg8, arg9, 0, 1, arg11, arg2, 0, arg12, arg3, arg4, arg0, arg7, arg5, arg6, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[II[I[ILjava/lang/String;[Lclient!f;I)V")
	private void method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class80[] arg6) {
		@Pc(11) int local11 = arg0 - this.aClass101_10.anInt2367;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg5.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static57.method1009(arg5.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local17 = local26;
			} else {
				@Pc(120) int local120;
				@Pc(132) int local132;
				if (local37 == '>' && local17 != -1) {
					@Pc(58) String local58 = arg5.substring(local17 + 1, local26);
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
									if (arg3 == null) {
										local120 = 0;
									} else {
										local120 = arg3[local21];
									}
									if (arg4 == null) {
										local132 = 0;
									} else {
										local132 = arg4[local21];
									}
									local21++;
									@Pc(143) int local143 = Static438.method5871(local58.substring(4));
									@Pc(147) Class80 local147 = arg6[local143];
									@Pc(156) int local156 = arg1 == null ? local147.JA() : arg1[local143];
									local147.YA(arg2 + local120, local11 + this.aClass101_10.anInt2367 - local156 - -local132, 1, 0, 1);
									local19 = -1;
									arg2 += arg6[local143].ja();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method5821(local58);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg2 += this.aClass101_10.method1967(local37, local19);
					}
					@Pc(229) int local229;
					if (arg3 == null) {
						local229 = 0;
					} else {
						local229 = arg3[local21];
					}
					if (arg4 == null) {
						local120 = 0;
					} else {
						local120 = arg4[local21];
					}
					local21++;
					if (local37 != ' ') {
						if ((Static24.anInt542 & 0xFF000000) != 0) {
							this.B(local37, arg2 + local229 + 1, local11 - (-local120 + -1), Static24.anInt542, true);
						}
						this.B(local37, local229 + arg2, local11 + local120, Static453.anInt7844, false);
					} else if (Static135.anInt2313 > 0) {
						Static173.anInt3173 += Static135.anInt2313;
						arg2 += Static173.anInt3173 >> 8;
						Static173.anInt3173 &= 0xFF;
					}
					local132 = this.aClass101_10.method1971(local37);
					if (Static54.anInt1123 != -1) {
						this.aClass109_12.method4689((int) ((double) this.aClass101_10.anInt2367 * 0.7D) + local11, Static54.anInt1123, arg2, local132);
					}
					if (Static244.anInt4357 != -1) {
						this.aClass109_12.method4689(this.aClass101_10.anInt2367 + local11, Static244.anInt4357, arg2, local132);
					}
					local19 = local37;
					arg2 += local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;[Lclient!f;I[IILjava/util/Random;III)I")
	public final int method5832(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class80[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg4.setSeed((long) arg0);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method5817((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(47) int local47 = arg1.length();
		@Pc(50) int[] local50 = new int[local47];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local47; local54++) {
			local50[local54] = local52;
			if ((arg4.nextInt() & 0x3) == 0) {
				local52++;
			}
		}
		this.method5831(arg6, arg3, arg5, local50, null, arg1, arg2);
		return local52;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII[IIIIIIIII[Lclient!f;Lclient!ea;)I")
	public final int method5833(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class80[] arg14, @OriginalArg(16) Class62 arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method5817(arg1, arg11);
		if (arg3 == 0) {
			arg3 = this.aClass101_10.anInt2367;
		}
		@Pc(52) int[] local52;
		if (arg9 < this.aClass101_10.anInt2376 + this.aClass101_10.anInt2378 + arg3 && arg3 + arg3 > arg9) {
			local52 = null;
		} else {
			local52 = new int[] { arg5 };
		}
		if (arg7 == -1) {
			arg7 = arg9 / arg3;
			if (arg7 <= 0) {
				arg7 = 1;
			}
		}
		@Pc(79) int local79 = this.aClass101_10.method1968(arg14, local52, arg0, Static124.aStringArray25);
		if (arg7 > 0 && local79 >= arg7) {
			local79 = arg7;
			Static124.aStringArray25[arg7 - 1] = this.aClass101_10.method1969(arg5, arg14, Static124.aStringArray25[arg7 - 1]);
		}
		if (arg12 == 3 && local79 == 1) {
			arg12 = 1;
		}
		@Pc(176) int local176;
		@Pc(156) int local156;
		if (arg12 == 0) {
			local176 = this.aClass101_10.anInt2378 + arg8;
		} else if (arg12 == 1) {
			local176 = (arg9 - (local79 - 1) * arg3 - this.aClass101_10.anInt2378 - this.aClass101_10.anInt2376) / 2 + arg8 + this.aClass101_10.anInt2378;
		} else if (arg12 == 2) {
			local176 = arg9 + arg8 - (local79 - 1) * arg3 - this.aClass101_10.anInt2376;
		} else {
			local156 = (arg9 - arg3 * (local79 - 1) - this.aClass101_10.anInt2376 - this.aClass101_10.anInt2378) / (local79 + 1);
			if (local156 < 0) {
				local156 = 0;
			}
			arg3 += local156;
			local176 = arg8 + this.aClass101_10.anInt2378 + local156;
		}
		for (local156 = 0; local156 < local79; local156++) {
			if (arg4 == 0) {
				this.method5829(arg10, arg13, Static124.aStringArray25[local156], local176, arg2, arg14, arg15, arg6);
			} else if (arg4 == 1) {
				this.method5829(arg10, arg13 + (arg5 - this.aClass101_10.method1963(Static124.aStringArray25[local156])) / 2, Static124.aStringArray25[local156], local176, arg2, arg14, arg15, arg6);
			} else if (arg4 == 2) {
				this.method5829(arg10, arg5 + arg13 - this.aClass101_10.method1963(Static124.aStringArray25[local156]), Static124.aStringArray25[local156], local176, arg2, arg14, arg15, arg6);
			} else if (local79 - 1 == local156) {
				this.method5829(arg10, arg13, Static124.aStringArray25[local156], local176, arg2, arg14, arg15, arg6);
			} else {
				this.method5818(Static124.aStringArray25[local156], arg5);
				this.method5829(arg10, arg13, Static124.aStringArray25[local156], local176, arg2, arg14, arg15, arg6);
				Static135.anInt2313 = 0;
			}
			local176 += arg3;
		}
		return local79;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5834(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 != null) {
			this.method5817(-1, arg1);
			this.method5829(0, arg3 - this.aClass101_10.method1963(arg0), arg0, arg2, 0, null, null, null);
		}
	}
}
