import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class59 {

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!rt;")
	private final Class324 aClass324_13;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!ha;")
	private final Class101 aClass101_16;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!rt;)V")
	protected Class59(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class324 arg1) {
		this.aClass324_13 = arg1;
		this.aClass101_16 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method9570(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method9587(arg2, arg0);
			this.method9583(0, (Class71[]) null, arg3 - this.aClass324_13.method8181(arg1), 0, (int[]) null, arg1, (Class1) null, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;[I[Lclient!mq;IBIII)V")
	public final void method9571(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class71[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 != null) {
			this.method9587(0, arg5);
			this.method9583(0, arg2, arg4, 0, arg1, arg0, (Class1) null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!mq;I[IILjava/lang/String;ILjava/util/Random;II)I")
	public final int method9572(@OriginalArg(1) Class71[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Random arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg5.setSeed((long) arg4);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method9587((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(47) int local47 = arg3.length();
		@Pc(50) int[] local50 = new int[local47];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local47; local54++) {
			local50[local54] = local52;
			if ((arg5.nextInt() & 0x3) == 0) {
				local52++;
			}
		}
		this.method9579(arg2, arg6, (int[]) null, arg1, local50, arg0, arg3);
		return local52;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIIBI[ILclient!aa;II[Lclient!mq;III)I")
	public final int method9573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) Class1 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class71[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method9587(arg15, arg14);
		if (arg1 == 0) {
			arg1 = this.aClass324_13.anInt9270;
		}
		@Pc(50) int[] local50;
		if (arg1 + this.aClass324_13.anInt9271 + this.aClass324_13.anInt9272 > arg5 && arg5 < arg1 + arg1) {
			local50 = null;
		} else {
			local50 = new int[] { arg7 };
		}
		@Pc(68) int local68 = this.aClass324_13.method8186(Static104.aStringArray8, arg12, arg2, local50);
		if (arg3 == -1) {
			arg3 = arg5 / arg1;
			if (arg3 <= 0) {
				arg3 = 1;
			}
		}
		if (arg3 > 0 && local68 >= arg3) {
			local68 = arg3;
			Static104.aStringArray8[arg3 - 1] = this.aClass324_13.method8184(Static104.aStringArray8[arg3 - 1], arg12, arg7);
		}
		if (arg13 == 3 && local68 == 1) {
			arg13 = 1;
		}
		@Pc(156) int local156;
		@Pc(185) int local185;
		if (arg13 == 0) {
			local156 = arg10 + this.aClass324_13.anInt9272;
		} else if (arg13 == 1) {
			local156 = (arg5 - this.aClass324_13.anInt9271 - this.aClass324_13.anInt9272 - arg1 * (local68 - 1)) / 2 + this.aClass324_13.anInt9272 + arg10;
		} else if (arg13 == 2) {
			local156 = arg5 + arg10 - this.aClass324_13.anInt9271 - (local68 + -1) * arg1;
		} else {
			local185 = (arg5 - (local68 - 1) * arg1 - this.aClass324_13.anInt9271 - this.aClass324_13.anInt9272) / (local68 + 1);
			if (local185 < 0) {
				local185 = 0;
			}
			local156 = this.aClass324_13.anInt9272 + arg10 + local185;
			arg1 += local185;
		}
		for (local185 = 0; local185 < local68; local185++) {
			if (arg0 == 0) {
				this.method9583(arg4, arg12, arg6, arg11, arg8, Static104.aStringArray8[local185], arg9, local156);
			} else if (arg0 == 1) {
				this.method9583(arg4, arg12, arg6 + (arg7 - this.aClass324_13.method8181(Static104.aStringArray8[local185])) / 2, arg11, arg8, Static104.aStringArray8[local185], arg9, local156);
			} else if (arg0 == 2) {
				this.method9583(arg4, arg12, arg6 + arg7 - this.aClass324_13.method8181(Static104.aStringArray8[local185]), arg11, arg8, Static104.aStringArray8[local185], arg9, local156);
			} else if (local68 - 1 == local185) {
				this.method9583(arg4, arg12, arg6, arg11, arg8, Static104.aStringArray8[local185], arg9, local156);
			} else {
				this.method9581(arg7, Static104.aStringArray8[local185]);
				this.method9583(arg4, arg12, arg6, arg11, arg8, Static104.aStringArray8[local185], arg9, local156);
				Static26.anInt459 = 0;
			}
			local156 += arg1;
		}
		return local68;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBLjava/lang/String;II)V")
	public final void method9574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method9587(-16777216, arg2);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(47) int local47 = 0; local47 < local16; local47++) {
			local19[local47] = (int) (Math.sin((double) arg4 / 5.0D + (double) local47 / 5.0D) * 5.0D);
			local22[local47] = (int) (Math.sin((double) local47 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method9579(arg0, arg1 - this.aClass324_13.method8181(arg3) / 2, local22, (int[]) null, local19, (Class71[]) null, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method9575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method9587(-16777216, arg1);
		@Pc(27) int local27 = arg4.length();
		@Pc(30) int[] local30 = new int[local27];
		for (@Pc(32) int local32 = 0; local32 < local27; local32++) {
			local30[local32] = (int) (Math.sin((double) local32 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method9579(arg0, arg3 - this.aClass324_13.method8181(arg4) / 2, local30, (int[]) null, (int[]) null, (Class71[]) null, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIIIILclient!aa;II[III[Lclient!mq;)I")
	public final int method9576(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class1 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class71[] arg14) {
		return this.method9573(arg0, arg5, arg1, 0, arg11, arg7, arg4, arg3, arg12, arg9, arg13, arg8, arg14, arg6, arg2, arg10);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method9577(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method9587(arg4, arg0);
			this.method9583(0, (Class71[]) null, arg2, 0, (int[]) null, arg1, (Class1) null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIII[Lclient!mq;Ljava/lang/String;I[II[IIILjava/util/Random;)I")
	public final int method9578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class71[] arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Random arg13) {
		if (arg6 == null) {
			return 0;
		}
		arg13.setSeed((long) arg1);
		@Pc(21) int local21 = (arg13.nextInt() & 0x1F) + 192;
		this.method9587(arg11 & 0xFFFFFF | local21 << 24, local21 << 24 | arg12 & 0xFFFFFF);
		@Pc(41) int local41 = arg6.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg13.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(69) int local69 = arg9;
		@Pc(80) int local80 = this.aClass324_13.anInt9272 + arg3;
		@Pc(82) int local82 = -1;
		if (arg4 == 1) {
			local80 += (arg7 - this.aClass324_13.anInt9271 - this.aClass324_13.anInt9272) / 2;
		} else if (arg4 == 2) {
			local80 = arg7 + arg3 - this.aClass324_13.anInt9271;
		}
		if (arg2 == 1) {
			local82 = this.aClass324_13.method8181(arg6) + local46;
			local69 = arg9 + (arg0 - local82) / 2;
		} else if (arg2 == 2) {
			local82 = this.aClass324_13.method8181(arg6) + local46;
			local69 = arg9 + arg0 - local82;
		}
		this.method9579(local80, local69, (int[]) null, arg10, local44, arg5, arg6);
		if (arg8 != null) {
			if (local82 == -1) {
				local82 = local46 + this.aClass324_13.method8181(arg6);
			}
			arg8[2] = local82;
			arg8[1] = local80 - this.aClass324_13.anInt9272;
			arg8[3] = this.aClass324_13.anInt9271 + this.aClass324_13.anInt9272;
			arg8[0] = local69;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[Lclient!mq;ILjava/lang/String;)V")
	private void method9579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class71[] arg5, @OriginalArg(7) String arg6) {
		@Pc(11) int local11 = arg0 - this.aClass324_13.anInt9270;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg6.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static131.method2331(arg6.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				@Pc(130) int local130;
				@Pc(138) int local138;
				if (local38 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg6.substring(local13 + 1, local27);
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
									if (arg4 == null) {
										local130 = 0;
									} else {
										local130 = arg4[local22];
									}
									if (arg2 == null) {
										local138 = 0;
									} else {
										local138 = arg2[local22];
									}
									local22++;
									@Pc(151) int local151 = Static77.method1385(local60.substring(4));
									@Pc(155) Class71 local155 = arg5[local151];
									@Pc(164) int local164 = arg3 == null ? local155.method7711() : arg3[local151];
									local155.method7697(local130 + arg1, local138 + local11 - (-this.aClass324_13.anInt9270 - -local164), 1, 0, 1);
									arg1 += arg5[local151].method7709();
									local15 = -1;
								} catch (@Pc(194) Exception local194) {
								}
							} else {
								this.method9582(local60);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass324_13.method8182(local15, local38);
					}
					@Pc(226) int local226;
					if (arg4 == null) {
						local226 = 0;
					} else {
						local226 = arg4[local22];
					}
					if (arg2 == null) {
						local130 = 0;
					} else {
						local130 = arg2[local22];
					}
					local22++;
					if (local38 != ' ') {
						if ((Static630.anInt7992 & 0xFF000000) != 0) {
							this.fa(local38, arg1 + local226 + 1, local130 + local11 + 1, Static630.anInt7992, true);
						}
						this.fa(local38, local226 + arg1, local130 + local11, Static520.anInt9185, false);
					} else if (Static26.anInt459 > 0) {
						Static58.anInt1132 += Static26.anInt459;
						arg1 += Static58.anInt1132 >> 8;
						Static58.anInt1132 &= 0xFF;
					}
					local138 = this.aClass324_13.method8176(local38);
					if (Static144.anInt2710 != -1) {
						this.aClass101_16.method8099(local11 + (int) ((double) this.aClass324_13.anInt9270 * 0.7D), local138, arg1, Static144.anInt2710);
					}
					if (Static41.anInt903 != -1) {
						this.aClass101_16.method8099(this.aClass324_13.anInt9270 + local11, local138, arg1, Static41.anInt903);
					}
					local15 = local38;
					arg1 += local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method9580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method9581(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) int local13 = 0;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < arg1.length(); local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 == '<') {
				local15 = true;
			} else if (local23 == '>') {
				local15 = false;
			} else if (!local15 && local23 == ' ') {
				local13++;
			}
		}
		if (local13 > 0) {
			Static26.anInt459 = (arg0 - this.aClass324_13.method8181(arg1) << 8) / local13;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method9582(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static520.anInt9185 = Static520.anInt9185 & 0xFF000000 | Static343.method5737(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static520.anInt9185 = Static483.anInt8682 & 0xFFFFFF | Static520.anInt9185 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static520.anInt9185 = Static343.method5737(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static520.anInt9185 = Static483.anInt8682;
			} else if (arg0.startsWith("str=")) {
				Static144.anInt2710 = Static520.anInt9185 & 0xFF000000 | Static343.method5737(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static144.anInt2710 = Static520.anInt9185 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static144.anInt2710 = -1;
			} else if (arg0.startsWith("u=")) {
				Static41.anInt903 = Static520.anInt9185 & 0xFF000000 | Static343.method5737(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static41.anInt903 = Static520.anInt9185 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static41.anInt903 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static630.anInt7992 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static630.anInt7992 = Static520.anInt9185 & 0xFF000000 | Static343.method5737(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static630.anInt7992 = Static520.anInt9185 & 0xFF000000;
				return;
			} else if (arg0.equals("/shad")) {
				Static630.anInt7992 = Static160.anInt10663;
				return;
			} else if (arg0.equals("br")) {
				this.method9587(Static160.anInt10663, Static483.anInt8682);
				return;
			}
		} catch (@Pc(179) Exception local179) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!mq;III[ILjava/lang/String;Lclient!aa;I)V")
	private void method9583(@OriginalArg(0) int arg0, @OriginalArg(1) Class71[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg7 - this.aClass324_13.anInt9270;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg5.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static131.method2331(arg5.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local17 = local24;
			} else {
				if (local35 == '>' && local17 != -1) {
					@Pc(55) String local55 = arg5.substring(local17 + 1, local24);
					local17 = -1;
					if (local55.equals("lt")) {
						local35 = '<';
					} else if (local55.equals("gt")) {
						local35 = '>';
					} else if (local55.equals("nbsp")) {
						local35 = ' ';
					} else if (local55.equals("shy")) {
						local35 = '\u00ad';
					} else if (local55.equals("times")) {
						local35 = '×';
					} else if (local55.equals("euro")) {
						local35 = '€';
					} else if (local55.equals("copy")) {
						local35 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=")) {
								try {
									@Pc(121) int local121 = Static77.method1385(local55.substring(4));
									@Pc(125) Class71 local125 = arg1[local121];
									@Pc(134) int local134 = arg4 == null ? local125.method7711() : arg4[local121];
									if ((Static520.anInt9185 & 0xFF000000) == -16777216) {
										local125.method7697(arg2, this.aClass324_13.anInt9270 + local7 - local134, 1, 0, 1);
									} else {
										local125.method7697(arg2, this.aClass324_13.anInt9270 + local7 - local134, 0, Static520.anInt9185 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local19 = -1;
									arg2 += arg1[local121].method7709();
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method9582(local55);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg2 += this.aClass324_13.method8182(local19, local35);
					}
					if (local35 == ' ') {
						if (Static26.anInt459 > 0) {
							Static58.anInt1132 += Static26.anInt459;
							arg2 += Static58.anInt1132 >> 8;
							Static58.anInt1132 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static630.anInt7992 & 0xFF000000) != 0) {
							this.fa(local35, arg2 + 1, local7 + 1, Static630.anInt7992, true);
						}
						this.fa(local35, arg2, local7, Static520.anInt9185, false);
					} else {
						if ((Static630.anInt7992 & 0xFF000000) != 0) {
							this.method9580(local35, arg2 + 1, local7 + 1, Static630.anInt7992, true, arg6, arg0, arg3);
						}
						this.method9580(local35, arg2, local7, Static520.anInt9185, false, arg6, arg0, arg3);
					}
					@Pc(307) int local307 = this.aClass324_13.method8176(local35);
					if (Static144.anInt2710 != -1) {
						this.aClass101_16.method8099(local7 + (int) ((double) this.aClass324_13.anInt9270 * 0.7D), local307, arg2, Static144.anInt2710);
					}
					if (Static41.anInt903 != -1) {
						this.aClass101_16.method8099(this.aClass324_13.anInt9270 + local7 + 1, local307, arg2, Static41.anInt903);
					}
					arg2 += local307;
					local19 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method9585(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method9587(arg3, arg2);
			this.method9583(0, (Class71[]) null, arg0 - this.aClass324_13.method8181(arg1) / 2, 0, (int[]) null, arg1, (Class1) null, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method9586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method9587(-16777216, arg3);
		@Pc(25) double local25 = 7.0D - (double) arg4 / 8.0D;
		if (local25 < 0.0D) {
			local25 = 0.0D;
		}
		@Pc(34) int local34 = arg5.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
			local37[local39] = (int) (local25 * Math.sin((double) arg1 + (double) local39 / 1.5D));
		}
		this.method9579(arg0, arg2 - this.aClass324_13.method8181(arg5) / 2, local37, (int[]) null, (int[]) null, (Class71[]) null, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method9587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static41.anInt903 = -1;
		Static483.anInt8682 = arg1;
		Static520.anInt9185 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static26.anInt459 = 0;
		Static144.anInt2710 = -1;
		Static58.anInt1132 = 0;
		Static160.anInt10663 = arg0;
		Static630.anInt7992 = arg0;
	}
}
