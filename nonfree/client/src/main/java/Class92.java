import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class92 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!ub;")
	private final Class327 aClass327_11;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!oa;")
	private final Class14 aClass14_13;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!oa;Lclient!ub;)V")
	protected Class92(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class327 arg1) {
		this.aClass327_11 = arg1;
		this.aClass14_13 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method6386(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static261.anInt5088 = Static261.anInt5088 & 0xFF000000 | Static565.method5599(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static261.anInt5088 = Static261.anInt5088 & 0xFF000000 | Static418.anInt7258 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static261.anInt5088 = Static565.method5599(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static261.anInt5088 = Static418.anInt7258;
			} else if (arg0.startsWith("str=")) {
				Static391.anInt6845 = Static261.anInt5088 & 0xFF000000 | Static565.method5599(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static391.anInt6845 = Static261.anInt5088 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static391.anInt6845 = -1;
			} else if (arg0.startsWith("u=")) {
				Static138.anInt3067 = Static261.anInt5088 & 0xFF000000 | Static565.method5599(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static138.anInt3067 = Static261.anInt5088 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static138.anInt3067 = -1;
				return;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static237.anInt4800 = 0;
				return;
			} else if (arg0.startsWith("shad=")) {
				Static237.anInt4800 = Static261.anInt5088 & 0xFF000000 | Static565.method5599(arg0.substring(5));
				return;
			} else if (arg0.equals("shad")) {
				Static237.anInt4800 = Static261.anInt5088 & 0xFF000000;
				return;
			} else if (arg0.equals("/shad")) {
				Static237.anInt4800 = Static9.anInt277;
				return;
			} else if (arg0.equals("br")) {
				this.method6394(Static9.anInt277, Static418.anInt7258);
				return;
			}
		} catch (@Pc(177) Exception local177) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILjava/lang/String;III)V")
	public final void method6387(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6394(arg3, arg2);
			this.method6395(null, arg1, 0, arg0 - this.aClass327_11.method7196(arg1) / 2, null, arg4, null, 0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method6388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		if (arg2 != null) {
			this.method6394(-1, arg0);
			this.method6395(null, arg2, 0, arg3 - this.aClass327_11.method7196(arg2), null, arg1, null, 0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method6389(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
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
			Static70.anInt4047 = (arg1 - this.aClass327_11.method7196(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIIIILjava/lang/String;)V")
	public final void method6390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method6394(arg3, arg1);
			this.method6395(null, arg4, 0, arg2, null, arg0, null, 0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public final void method6392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 == null) {
			return;
		}
		this.method6394(-16777216, arg0);
		@Pc(20) double local20 = 7.0D - (double) arg3 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg4.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (local20 * Math.sin((double) local34 / 1.5D + (double) arg2));
		}
		this.method6404(null, null, arg4, local32, arg1 - this.aClass327_11.method7196(arg4) / 2, arg5, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;IIB)V")
	public final void method6393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method6394(-16777216, arg4);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg0 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method6404(null, local19, arg3, local22, arg2 - this.aClass327_11.method7196(arg3) / 2, arg1, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V")
	private void method6394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static112.anInt2179 = 0;
		Static418.anInt7258 = arg1;
		Static261.anInt5088 = arg1;
		Static138.anInt3067 = -1;
		Static70.anInt4047 = 0;
		Static391.anInt6845 = -1;
		Static9.anInt277 = arg0;
		Static237.anInt4800 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;Ljava/lang/String;IIILclient!fa;I[II)V")
	private void method6395(@OriginalArg(0) Class58[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class86 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg5 - this.aClass327_11.anInt8788;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static124.method2555(arg1.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local19 = local26;
			} else {
				if (local37 == '>' && local19 != -1) {
					@Pc(59) String local59 = arg1.substring(local19 + 1, local26);
					local19 = -1;
					if (local59.equals("lt")) {
						local37 = '<';
					} else if (local59.equals("gt")) {
						local37 = '>';
					} else if (local59.equals("nbsp")) {
						local37 = ' ';
					} else if (local59.equals("shy")) {
						local37 = '\u00ad';
					} else if (local59.equals("times")) {
						local37 = '×';
					} else if (local59.equals("euro")) {
						local37 = '€';
					} else if (local59.equals("copy")) {
						local37 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									@Pc(125) int local125 = Static444.method6313(local59.substring(4));
									@Pc(129) Class58 local129 = arg0[local125];
									@Pc(138) int local138 = arg6 == null ? local129.a() : arg6[local125];
									if ((Static261.anInt5088 & 0xFF000000) == -16777216) {
										local129.I(arg3, this.aClass327_11.anInt8788 + local7 - local138, 1, 0, 1);
									} else {
										local129.I(arg3, local7 + this.aClass327_11.anInt8788 - local138, 0, Static261.anInt5088 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg3 += arg0[local125].AA();
									local21 = -1;
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method6386(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local19 == -1) {
					if (local21 != -1) {
						arg3 += this.aClass327_11.method7190(local21, local37);
					}
					if (local37 == ' ') {
						if (Static70.anInt4047 > 0) {
							Static112.anInt2179 += Static70.anInt4047;
							arg3 += Static112.anInt2179 >> 8;
							Static112.anInt2179 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static237.anInt4800 & 0xFF000000) != 0) {
							this.q(local37, arg3 + 1, local7 + 1, Static237.anInt4800, true);
						}
						this.q(local37, arg3, local7, Static261.anInt5088, false);
					} else {
						if ((Static237.anInt4800 & 0xFF000000) != 0) {
							this.method6398(local37, arg3 + 1, local7 + 1, Static237.anInt4800, true, arg4, arg2, arg7);
						}
						this.method6398(local37, arg3, local7, Static261.anInt5088, false, arg4, arg2, arg7);
					}
					@Pc(314) int local314 = this.aClass327_11.method7197(local37);
					if (Static391.anInt6845 != -1) {
						this.aClass14_13.method6899(Static391.anInt6845, local314, arg3, local7 + (int) ((double) this.aClass327_11.anInt8788 * 0.7D));
					}
					if (Static138.anInt3067 != -1) {
						this.aClass14_13.method6899(Static138.anInt3067, local314, arg3, this.aClass327_11.anInt8788 + local7 + 1);
					}
					arg3 += local314;
					local21 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method6396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method6394(-16777216, arg2);
		@Pc(22) int local22 = arg3.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) arg1 / 5.0D + (double) local27 / 2.0D) * 5.0D);
		}
		this.method6404(null, null, arg3, local25, arg4 - this.aClass327_11.method7196(arg3) / 2, arg0, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	protected abstract void method6398(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class86 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([III[Lclient!xa;III[IIIILjava/util/Random;IILjava/lang/String;)I")
	public final int method6400(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class58[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Random arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13) {
		if (arg13 == null) {
			return 0;
		}
		arg10.setSeed((long) arg4);
		@Pc(20) int local20 = (arg10.nextInt() & 0x1F) + 192;
		this.method6394(arg9 & 0xFFFFFF | local20 << 24, arg12 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg13.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local45;
			if ((arg10.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(70) int local70 = arg3;
		@Pc(76) int local76 = this.aClass327_11.anInt8785 + arg7;
		if (arg1 == 1) {
			local76 += (arg5 - this.aClass327_11.anInt8797 - this.aClass327_11.anInt8785) / 2;
		} else if (arg1 == 2) {
			local76 = arg7 + arg5 - this.aClass327_11.anInt8797;
		}
		@Pc(113) int local113 = -1;
		if (arg8 == 1) {
			local113 = this.aClass327_11.method7196(arg13) + local45;
			local70 = arg3 + (arg11 - local113) / 2;
		} else if (arg8 == 2) {
			local113 = this.aClass327_11.method7196(arg13) + local45;
			local70 = arg3 + arg11 - local113;
		}
		this.method6404(arg2, local43, arg13, null, local70, local76, arg0);
		if (arg6 != null) {
			if (local113 == -1) {
				local113 = this.aClass327_11.method7196(arg13) + local45;
			}
			arg6[0] = local70;
			arg6[2] = local113;
			arg6[3] = this.aClass327_11.anInt8797 + this.aClass327_11.anInt8785;
			arg6[1] = local76 - this.aClass327_11.anInt8785;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;II[Lclient!xa;BI[IIIIIIILclient!fa;)I")
	public final int method6401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class58[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class86 arg14) {
		return this.method6405(arg13, arg10, arg12, arg5, arg2, arg11, arg3, arg4, arg1, arg0, arg7, arg6, arg14, arg8, arg9, 0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;III[I[Lclient!xa;I)V")
	public final void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) Class58[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 != null) {
			this.method6394(0, arg0);
			this.method6395(arg4, arg1, 0, arg5, null, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Lclient!xa;ILjava/util/Random;ILjava/lang/String;[IIII)I")
	public final int method6403(@OriginalArg(0) int arg0, @OriginalArg(1) Class58[] arg1, @OriginalArg(3) Random arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg2.setSeed((long) arg5);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method6394((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local40; local55++) {
			local43[local55] = local53;
			if ((arg2.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		this.method6404(arg1, local43, arg3, null, arg0, arg6, arg4);
		return local53;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;[ILjava/lang/String;[IIIB[I)V")
	private void method6404(@OriginalArg(0) Class58[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg5 - this.aClass327_11.anInt8788;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg2.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static124.method2555(arg2.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local17 = local26;
			} else {
				@Pc(123) int local123;
				@Pc(133) int local133;
				if (local37 == '>' && local17 != -1) {
					@Pc(57) String local57 = arg2.substring(local17 + 1, local26);
					local17 = -1;
					if (local57.equals("lt")) {
						local37 = '<';
					} else if (local57.equals("gt")) {
						local37 = '>';
					} else if (local57.equals("nbsp")) {
						local37 = ' ';
					} else if (local57.equals("shy")) {
						local37 = '\u00ad';
					} else if (local57.equals("times")) {
						local37 = '×';
					} else if (local57.equals("euro")) {
						local37 = '€';
					} else if (local57.equals("copy")) {
						local37 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local123 = 0;
									} else {
										local123 = arg1[local21];
									}
									if (arg3 == null) {
										local133 = 0;
									} else {
										local133 = arg3[local21];
									}
									local21++;
									@Pc(148) int local148 = Static444.method6313(local57.substring(4));
									@Pc(152) Class58 local152 = arg0[local148];
									@Pc(161) int local161 = arg6 == null ? local152.a() : arg6[local148];
									local152.I(local123 + arg4, -local161 + this.aClass327_11.anInt8788 + local7 + local133, 1, 0, 1);
									arg4 += arg0[local148].AA();
									local19 = -1;
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method6386(local57);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg4 += this.aClass327_11.method7190(local19, local37);
					}
					@Pc(228) int local228;
					if (arg1 == null) {
						local228 = 0;
					} else {
						local228 = arg1[local21];
					}
					if (arg3 == null) {
						local123 = 0;
					} else {
						local123 = arg3[local21];
					}
					local21++;
					if (local37 != ' ') {
						if ((Static237.anInt4800 & 0xFF000000) != 0) {
							this.q(local37, local228 + arg4 + 1, local7 + 1 - -local123, Static237.anInt4800, true);
						}
						this.q(local37, arg4 + local228, local123 + local7, Static261.anInt5088, false);
					} else if (Static70.anInt4047 > 0) {
						Static112.anInt2179 += Static70.anInt4047;
						arg4 += Static112.anInt2179 >> 8;
						Static112.anInt2179 &= 0xFF;
					}
					local133 = this.aClass327_11.method7197(local37);
					if (Static391.anInt6845 != -1) {
						this.aClass14_13.method6899(Static391.anInt6845, local133, arg4, local7 + (int) ((double) this.aClass327_11.anInt8788 * 0.7D));
					}
					if (Static138.anInt3067 != -1) {
						this.aClass14_13.method6899(Static138.anInt3067, local133, arg4, local7 + this.aClass327_11.anInt8788);
					}
					local19 = local37;
					arg4 += local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
	protected abstract void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[Lclient!xa;Ljava/lang/String;IIIII[IILclient!fa;IIBI)I")
	public final int method6405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class58[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class86 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(16) int arg15) {
		if (arg4 == null) {
			return 0;
		}
		this.method6394(arg0, arg9);
		if (arg13 == 0) {
			arg13 = this.aClass327_11.anInt8788;
		}
		@Pc(48) int[] local48;
		if (arg6 < this.aClass327_11.anInt8797 + this.aClass327_11.anInt8785 + arg13 && arg6 < arg13 + arg13) {
			local48 = null;
		} else {
			local48 = new int[] { arg1 };
		}
		@Pc(66) int local66 = this.aClass327_11.method7191(arg3, arg4, local48, Static203.aStringArray10);
		if (arg15 == -1) {
			arg15 = arg6 / arg13;
			if (arg15 <= 0) {
				arg15 = 1;
			}
		}
		if (arg15 > 0 && arg15 <= local66) {
			local66 = arg15;
			Static203.aStringArray10[arg15 - 1] = this.aClass327_11.method7194(arg3, arg1, Static203.aStringArray10[arg15 - 1]);
		}
		if (arg7 == 3 && local66 == 1) {
			arg7 = 1;
		}
		@Pc(120) int local120;
		@Pc(198) int local198;
		if (arg7 == 0) {
			local120 = arg14 + this.aClass327_11.anInt8785;
		} else if (arg7 == 1) {
			local120 = (arg6 - arg13 * (local66 - 1) - this.aClass327_11.anInt8797 - this.aClass327_11.anInt8785) / 2 + this.aClass327_11.anInt8785 + arg14;
		} else if (arg7 == 2) {
			local120 = arg6 + arg14 - (local66 - 1) * arg13 - this.aClass327_11.anInt8797;
		} else {
			local198 = (arg6 - this.aClass327_11.anInt8785 - this.aClass327_11.anInt8797 - arg13 * (local66 + -1)) / (local66 + 1);
			if (local198 < 0) {
				local198 = 0;
			}
			arg13 += local198;
			local120 = this.aClass327_11.anInt8785 + arg14 + local198;
		}
		for (local198 = 0; local198 < local66; local198++) {
			if (arg5 == 0) {
				this.method6395(arg3, Static203.aStringArray10[local198], arg8, arg11, arg12, local120, arg10, arg2);
			} else if (arg5 == 1) {
				this.method6395(arg3, Static203.aStringArray10[local198], arg8, (arg1 - this.aClass327_11.method7196(Static203.aStringArray10[local198])) / 2 + arg11, arg12, local120, arg10, arg2);
			} else if (arg5 == 2) {
				this.method6395(arg3, Static203.aStringArray10[local198], arg8, arg1 + arg11 - this.aClass327_11.method7196(Static203.aStringArray10[local198]), arg12, local120, arg10, arg2);
			} else if (local66 - 1 == local198) {
				this.method6395(arg3, Static203.aStringArray10[local198], arg8, arg11, arg12, local120, arg10, arg2);
			} else {
				this.method6389(Static203.aStringArray10[local198], arg1);
				this.method6395(arg3, Static203.aStringArray10[local198], arg8, arg11, arg12, local120, arg10, arg2);
				Static70.anInt4047 = 0;
			}
			local120 += arg13;
		}
		return local66;
	}
}
