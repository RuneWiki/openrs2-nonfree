import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class4 {

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!ds;")
	private final Class62 aClass62_10;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!qa;")
	private final Class121 aClass121_10;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qa;Lclient!ds;)V")
	protected Class4(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class62 arg1) {
		this.aClass62_10 = arg1;
		this.aClass121_10 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	private void method5834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static275.anInt4642 = 0;
		Static401.anInt7120 = -1;
		Static220.anInt2598 = 0;
		Static80.anInt6557 = arg0;
		Static304.anInt5137 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static378.anInt6793 = -1;
		Static348.anInt6363 = arg1;
		Static192.anInt3513 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjava/lang/String;IIIII)V")
	public final void method5837(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5834(arg1, -16777216);
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) arg4 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method5854(arg3, null, local27, null, arg0, null, arg2 - this.aClass62_10.method1157(arg0) / 2);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5838(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static304.anInt5137 = Static304.anInt5137 & 0xFF000000 | Static286.method3912(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static304.anInt5137 = Static80.anInt6557 & 0xFFFFFF | Static304.anInt5137 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static304.anInt5137 = Static286.method3912(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static304.anInt5137 = Static80.anInt6557;
			} else if (arg0.startsWith("str=")) {
				Static378.anInt6793 = Static286.method3912(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static378.anInt6793 = -8388608;
			} else if (arg0.equals("/str")) {
				Static378.anInt6793 = -1;
			} else if (arg0.startsWith("u=")) {
				Static401.anInt7120 = Static286.method3912(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static401.anInt7120 = -16777216;
			} else if (arg0.equals("/u")) {
				Static401.anInt7120 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static192.anInt3513 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static192.anInt3513 = Static286.method3912(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static192.anInt3513 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static192.anInt3513 = Static348.anInt6363;
			} else if (arg0.equals("br")) {
				this.method5834(Static80.anInt6557, Static348.anInt6363);
			}
		} catch (@Pc(170) Exception local170) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
	public final void method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method5834(arg2, arg0);
			this.method5850(arg1, 0, arg3, null, arg4, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIILjava/lang/String;B)V")
	public final void method5840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method5834(arg0, arg2);
			this.method5850(arg1, 0, arg3 - this.aClass62_10.method1157(arg4) / 2, null, arg4, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5841(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method5834(arg2, -1);
			this.method5850(arg0, 0, arg1 - this.aClass62_10.method1157(arg3), null, arg3, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	protected abstract void method5842(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class34 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!f;III[IIBILclient!ea;ILjava/lang/String;IIIII)I")
	public final int method5843(@OriginalArg(0) Class78[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class34 arg6, @OriginalArg(10) String arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5855(arg1, arg7, arg3, arg0, arg10, arg8, arg4, arg9, arg11, arg2, arg6, 1, 0, 0, arg12, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBIILjava/lang/String;II)V")
	public final void method5844(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5834(arg4, -16777216);
		@Pc(24) int local24 = arg2.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) arg1 / 5.0D + (double) local32 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method5854(arg0, local27, local30, null, arg2, null, arg3 - this.aClass62_10.method1157(arg2) / 2);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;Ljava/util/Random;II[II[IIIIII[Lclient!f;B)I")
	public final int method5845(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class78[] arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg2.setSeed((long) arg9);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method5834(local20 << 24 | arg4 & 0xFFFFFF, arg12 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg1.length();
		@Pc(53) int[] local53 = new int[local40];
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < local40; local57++) {
			local53[local57] = local55;
			if ((arg2.nextInt() & 0x3) == 0) {
				local55++;
			}
		}
		@Pc(78) int local78 = arg3;
		@Pc(84) int local84 = this.aClass62_10.anInt1455 + arg8;
		if (arg0 == 1) {
			local84 += (arg10 - this.aClass62_10.anInt1455 - this.aClass62_10.anInt1460) / 2;
		} else if (arg0 == 2) {
			local84 = arg8 + arg10 - this.aClass62_10.anInt1460;
		}
		@Pc(122) int local122 = -1;
		if (arg11 == 1) {
			local122 = local55 + this.aClass62_10.method1157(arg1);
			local78 = arg3 + (arg6 - local122) / 2;
		} else if (arg11 == 2) {
			local122 = local55 + this.aClass62_10.method1157(arg1);
			local78 = arg3 + arg6 - local122;
		}
		this.method5854(local84, local53, null, arg5, arg1, arg13, local78);
		if (arg7 != null) {
			if (local122 == -1) {
				local122 = this.aClass62_10.method1157(arg1) + local55;
			}
			arg7[3] = this.aClass62_10.anInt1455 + this.aClass62_10.anInt1460;
			arg7[0] = local78;
			arg7[1] = local84 - this.aClass62_10.anInt1455;
			arg7[2] = local122;
		}
		return local55;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[Lclient!f;Ljava/lang/String;[III)V")
	public final void method5846(@OriginalArg(1) int arg0, @OriginalArg(3) Class78[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method5834(arg5, 0);
			this.method5850(arg4, 0, arg0, arg1, arg2, 0, arg3, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[IILjava/util/Random;BI[Lclient!f;ILjava/lang/String;)I")
	public final int method5847(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Random arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class78[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg2.setSeed((long) arg1);
		@Pc(29) int local29 = (arg2.nextInt() & 0x1F) + 192;
		this.method5834(local29 << 24 | 0xFFFFFF, (local29 | 0x0) << 24);
		@Pc(49) int local49 = arg6.length();
		@Pc(52) int[] local52 = new int[local49];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local52[local56] = local54;
			if ((arg2.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		this.method5854(arg3, local52, null, arg0, arg6, arg4, arg5);
		return local54;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5848(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
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
			Static220.anInt2598 = (arg1 - this.aClass62_10.method1157(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public final void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method5834(arg0, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg1 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(41) int local41 = arg2.length();
		@Pc(44) int[] local44 = new int[local41];
		for (@Pc(46) int local46 = 0; local46 < local41; local46++) {
			local44[local46] = (int) (local20 * Math.sin((double) local46 / 1.5D + (double) arg5));
		}
		this.method5854(arg4, null, local44, null, arg2, null, arg3 - this.aClass62_10.method1157(arg2) / 2);
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZI[Lclient!f;Ljava/lang/String;I[ILclient!ea;)V")
	private void method5850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class78[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class34 arg7) {
		@Pc(7) int local7 = arg0 - this.aClass62_10.anInt1462;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg4.length();
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(40) char local40 = (char) (Static359.method5126(arg4.charAt(local29)) & 0xFF);
			if (local40 == '<') {
				local13 = local29;
			} else {
				if (local40 == '>' && local13 != -1) {
					@Pc(62) String local62 = arg4.substring(local13 + 1, local29);
					local13 = -1;
					if (local62.equals("lt")) {
						local40 = '<';
					} else if (local62.equals("gt")) {
						local40 = '>';
					} else if (local62.equals("nbsp")) {
						local40 = ' ';
					} else if (local62.equals("shy")) {
						local40 = '\u00ad';
					} else if (local62.equals("times")) {
						local40 = '×';
					} else if (local62.equals("euro")) {
						local40 = '€';
					} else if (local62.equals("copy")) {
						local40 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									@Pc(128) int local128 = Static32.method455(local62.substring(4));
									@Pc(132) Class78 local132 = arg3[local128];
									@Pc(141) int local141 = arg6 == null ? local132.JA() : arg6[local128];
									if ((-16777216 & Static304.anInt5137) == -16777216) {
										local132.YA(arg2, local7 + this.aClass62_10.anInt1462 - local141, 1, 0, 1);
									} else {
										local132.YA(arg2, local7 + this.aClass62_10.anInt1462 - local141, 0, Static304.anInt5137 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg2 += arg3[local128].ja();
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method5838(local62);
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass62_10.method1154(local40, local15);
					}
					if (local40 == ' ') {
						if (Static220.anInt2598 > 0) {
							Static275.anInt4642 += Static220.anInt2598;
							arg2 += Static275.anInt4642 >> 8;
							Static275.anInt4642 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static192.anInt3513 & 0xFF000000) != 0) {
							this.B(local40, arg2 + 1, local7 + 1, Static192.anInt3513, true);
						}
						this.B(local40, arg2, local7, Static304.anInt5137, false);
					} else {
						if ((Static192.anInt3513 & 0xFF000000) != 0) {
							this.method5842(local40, arg2 + 1, local7 + 1, Static192.anInt3513, true, arg7, arg5, arg1);
						}
						this.method5842(local40, arg2, local7, Static304.anInt5137, false, arg7, arg5, arg1);
					}
					@Pc(312) int local312 = this.aClass62_10.method1155(local40);
					if (Static378.anInt6793 != -1) {
						this.aClass121_10.method4594(arg2, Static378.anInt6793, local312, local7 + (int) ((double) this.aClass62_10.anInt1462 * 0.7D));
					}
					if (Static401.anInt7120 != -1) {
						this.aClass121_10.method4594(arg2, Static401.anInt7120, local312, local7 + this.aClass62_10.anInt1462 + 1);
					}
					local15 = local40;
					arg2 += local312;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[I[I[ILjava/lang/String;[Lclient!f;II)V")
	private void method5854(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) Class78[] arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - this.aClass62_10.anInt1462;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(31) int local31 = arg4.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(44) char local44 = (char) (Static359.method5126(arg4.charAt(local33)) & 0xFF);
			if (local44 == '<') {
				local13 = local33;
			} else {
				@Pc(120) int local120;
				@Pc(130) int local130;
				if (local44 == '>' && local13 != -1) {
					@Pc(66) String local66 = arg4.substring(local13 + 1, local33);
					local13 = -1;
					if (local66.equals("lt")) {
						local44 = '<';
					} else if (local66.equals("gt")) {
						local44 = '>';
					} else if (local66.equals("nbsp")) {
						local44 = ' ';
					} else if (local66.equals("shy")) {
						local44 = '\u00ad';
					} else if (local66.equals("times")) {
						local44 = '×';
					} else if (local66.equals("euro")) {
						local44 = '€';
					} else if (local66.equals("copy")) {
						local44 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local120 = 0;
									} else {
										local120 = arg1[local17];
									}
									if (arg2 == null) {
										local130 = 0;
									} else {
										local130 = arg2[local17];
									}
									local17++;
									@Pc(143) int local143 = Static32.method455(local66.substring(4));
									@Pc(147) Class78 local147 = arg5[local143];
									@Pc(156) int local156 = arg3 == null ? local147.JA() : arg3[local143];
									local147.YA(arg6 + local120, -local156 + this.aClass62_10.anInt1462 + local7 - -local130, 1, 0, 1);
									local15 = -1;
									arg6 += arg5[local143].ja();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method5838(local66);
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass62_10.method1154(local44, local15);
					}
					@Pc(235) int local235;
					if (arg1 == null) {
						local235 = 0;
					} else {
						local235 = arg1[local17];
					}
					if (arg2 == null) {
						local120 = 0;
					} else {
						local120 = arg2[local17];
					}
					local17++;
					if (local44 != ' ') {
						if ((Static192.anInt3513 & 0xFF000000) != 0) {
							this.B(local44, local235 + arg6 + 1, local7 + 1 - -local120, Static192.anInt3513, true);
						}
						this.B(local44, arg6 + local235, local7 + local120, Static304.anInt5137, false);
					} else if (Static220.anInt2598 > 0) {
						Static275.anInt4642 += Static220.anInt2598;
						arg6 += Static275.anInt4642 >> 8;
						Static275.anInt4642 &= 0xFF;
					}
					local130 = this.aClass62_10.method1155(local44);
					if (Static378.anInt6793 != -1) {
						this.aClass121_10.method4594(arg6, Static378.anInt6793, local130, local7 + (int) ((double) this.aClass62_10.anInt1462 * 0.7D));
					}
					if (Static401.anInt7120 != -1) {
						this.aClass121_10.method4594(arg6, Static401.anInt7120, local130, this.aClass62_10.anInt1462 + local7);
					}
					arg6 += local130;
					local15 = local44;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;[I[Lclient!f;IIIIIIILclient!ea;IIIII)I")
	public final int method5855(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class78[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class34 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg1 == null) {
			return 0;
		}
		this.method5834(arg8, arg6);
		if (arg12 == 0) {
			arg12 = this.aClass62_10.anInt1462;
		}
		@Pc(45) int[] local45;
		if (arg12 + this.aClass62_10.anInt1460 + this.aClass62_10.anInt1455 > arg9 && arg9 < arg12 + arg12) {
			local45 = null;
		} else {
			local45 = new int[] { arg0 };
		}
		@Pc(63) int local63 = this.aClass62_10.method1158(Static5.aStringArray37, arg3, arg1, local45);
		if (arg13 == -1) {
			arg13 = arg9 / arg12;
			if (arg13 <= 0) {
				arg13 = 1;
			}
		}
		if (arg13 > 0 && arg13 <= local63) {
			local63 = arg13;
			Static5.aStringArray37[arg13 - 1] = this.aClass62_10.method1151(arg3, Static5.aStringArray37[arg13 - 1], arg0);
		}
		if (arg4 == 3 && local63 == 1) {
			arg4 = 1;
		}
		@Pc(151) int local151;
		@Pc(195) int local195;
		if (arg4 == 0) {
			local151 = this.aClass62_10.anInt1455 + arg14;
		} else if (arg4 == 1) {
			local151 = (arg9 - this.aClass62_10.anInt1455 - this.aClass62_10.anInt1460 - arg12 * (local63 + -1)) / 2 + this.aClass62_10.anInt1455 + arg14;
		} else if (arg4 == 2) {
			local151 = arg9 + arg14 - this.aClass62_10.anInt1460 - arg12 * (local63 + -1);
		} else {
			local195 = (arg9 - this.aClass62_10.anInt1455 - this.aClass62_10.anInt1460 - (local63 - 1) * arg12) / (local63 + 1);
			if (local195 < 0) {
				local195 = 0;
			}
			local151 = local195 + arg14 + this.aClass62_10.anInt1455;
			arg12 += local195;
		}
		for (local195 = 0; local195 < local63; local195++) {
			if (arg11 == 0) {
				this.method5850(local151, arg5, arg7, arg3, Static5.aStringArray37[local195], arg15, arg2, arg10);
			} else if (arg11 == 1) {
				this.method5850(local151, arg5, (arg0 - this.aClass62_10.method1157(Static5.aStringArray37[local195])) / 2 + arg7, arg3, Static5.aStringArray37[local195], arg15, arg2, arg10);
			} else if (arg11 == 2) {
				this.method5850(local151, arg5, arg7 + arg0 - this.aClass62_10.method1157(Static5.aStringArray37[local195]), arg3, Static5.aStringArray37[local195], arg15, arg2, arg10);
			} else if (local195 == local63 - 1) {
				this.method5850(local151, arg5, arg7, arg3, Static5.aStringArray37[local195], arg15, arg2, arg10);
			} else {
				this.method5848(Static5.aStringArray37[local195], arg0);
				this.method5850(local151, arg5, arg7, arg3, Static5.aStringArray37[local195], arg15, arg2, arg10);
				Static220.anInt2598 = 0;
			}
			local151 += arg12;
		}
		return local63;
	}
}
