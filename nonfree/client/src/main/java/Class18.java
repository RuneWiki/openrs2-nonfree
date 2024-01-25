import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class18 {

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!ju;")
	private final Class124 aClass124_13;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!qa;")
	private final Class167 aClass167_10;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!qa;Lclient!ju;)V")
	protected Class18(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class124 arg1) {
		this.aClass124_13 = arg1;
		this.aClass167_10 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII[Lclient!aa;ILjava/lang/String;[I)V")
	public final void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2[] arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int[] arg5) {
		if (arg4 != null) {
			this.method5165(arg1, 0);
			this.method5180(null, arg4, arg0, arg3, arg5, arg2, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(CIIIZLclient!i;II)V")
	protected abstract void method5162(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method5163(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5165(arg2, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method5176(null, local22, arg1, null, arg3, local19, arg0 - this.aClass124_13.method3099(arg1) / 2);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/util/Random;II[IIIILjava/lang/String;I[Lclient!aa;)I")
	public final int method5164(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) String arg5, @OriginalArg(9) Class2[] arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg0.setSeed((long) arg1);
		@Pc(21) int local21 = (arg0.nextInt() & 0x1F) + 192;
		this.method5165(local21 << 24 | 0xFFFFFF, (local21 | 0x0) << 24);
		@Pc(41) int local41 = arg5.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg0.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method5176(arg2, null, arg5, arg6, arg3, local44, arg4);
		return local46;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	private void method5165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static31.anInt590 = -1;
		Static234.anInt4003 = 0;
		Static171.anInt3094 = arg0;
		Static156.anInt2872 = arg0;
		Static69.anInt1287 = 0;
		Static120.anInt2109 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static386.anInt6511 = arg1;
		Static1.anInt7722 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method5166(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(15) int local15 = 0; arg0.length() > local15; local15++) {
			@Pc(21) char local21 = arg0.charAt(local15);
			if (local21 == '<') {
				local9 = true;
			} else if (local21 == '>') {
				local9 = false;
			} else if (!local9 && local21 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static69.anInt1287 = (arg1 - this.aClass124_13.method3099(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/String;IIII)V")
	public final void method5167(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5165(arg1, arg2);
			this.method5180(null, arg0, arg4, null, null, arg3, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5168(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5165(arg2, -1);
			this.method5180(null, arg0, arg1, null, null, arg3 - this.aClass124_13.method3099(arg0), 0, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
	public final void method5169(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5165(arg1, arg3);
			this.method5180(null, arg0, arg2, null, null, arg4 - this.aClass124_13.method3099(arg0) / 2, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIIIIIIIILclient!i;I[Lclient!aa;Ljava/lang/String;III)I")
	public final int method5170(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class14 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class2[] arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg12 == null) {
			return 0;
		}
		this.method5165(arg4, arg1);
		if (arg7 == 0) {
			arg7 = this.aClass124_13.anInt3601;
		}
		@Pc(52) int[] local52;
		if (arg7 + this.aClass124_13.anInt3597 + this.aClass124_13.anInt3604 > arg10 && arg7 + arg7 > arg10) {
			local52 = null;
		} else {
			local52 = new int[] { arg15 };
		}
		if (arg13 == -1) {
			arg13 = arg10 / arg7;
			if (arg13 <= 0) {
				arg13 = 1;
			}
		}
		@Pc(76) int local76 = this.aClass124_13.method3100(arg11, Static311.aStringArray33, arg12, local52);
		if (arg13 > 0 && arg13 <= local76) {
			local76 = arg13;
			Static311.aStringArray33[arg13 - 1] = this.aClass124_13.method3094(arg15, Static311.aStringArray33[arg13 - 1], arg11);
		}
		if (arg6 == 3 && local76 == 1) {
			arg6 = 1;
		}
		@Pc(131) int local131;
		@Pc(191) int local191;
		if (arg6 == 0) {
			local131 = this.aClass124_13.anInt3604 + arg5;
		} else if (arg6 == 1) {
			local131 = arg5 + this.aClass124_13.anInt3604 + (-((local76 + -1) * arg7) + arg10 + (-this.aClass124_13.anInt3604 - this.aClass124_13.anInt3597)) / 2;
		} else if (arg6 == 2) {
			local131 = arg5 + arg10 - arg7 * (local76 - 1) - this.aClass124_13.anInt3597;
		} else {
			local191 = (arg10 - this.aClass124_13.anInt3604 - this.aClass124_13.anInt3597 - arg7 * (local76 + -1)) / (local76 + 1);
			if (local191 < 0) {
				local191 = 0;
			}
			arg7 += local191;
			local131 = this.aClass124_13.anInt3604 + arg5 + local191;
		}
		for (local191 = 0; local191 < local76; local191++) {
			if (arg3 == 0) {
				this.method5180(arg9, Static311.aStringArray33[local191], local131, arg11, arg0, arg14, arg8, arg2);
			} else if (arg3 == 1) {
				this.method5180(arg9, Static311.aStringArray33[local191], local131, arg11, arg0, (arg15 - this.aClass124_13.method3099(Static311.aStringArray33[local191])) / 2 + arg14, arg8, arg2);
			} else if (arg3 == 2) {
				this.method5180(arg9, Static311.aStringArray33[local191], local131, arg11, arg0, arg14 + arg15 - this.aClass124_13.method3099(Static311.aStringArray33[local191]), arg8, arg2);
			} else if (local76 - 1 == local191) {
				this.method5180(arg9, Static311.aStringArray33[local191], local131, arg11, arg0, arg14, arg8, arg2);
			} else {
				this.method5166(Static311.aStringArray33[local191], arg15);
				this.method5180(arg9, Static311.aStringArray33[local191], local131, arg11, arg0, arg14, arg8, arg2);
				Static69.anInt1287 = 0;
			}
			local131 += arg7;
		}
		return local76;
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(CIIIZ)V")
	protected abstract void g(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;BIIIII)V")
	public final void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method5165(arg3, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg4 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(44) int local44 = arg1.length();
		@Pc(47) int[] local47 = new int[local44];
		for (@Pc(49) int local49 = 0; local49 < local44; local49++) {
			local47[local49] = (int) (local21 * Math.sin((double) local49 / 1.5D + (double) arg5));
		}
		this.method5176(null, local47, arg1, null, arg0, null, arg2 - this.aClass124_13.method3099(arg1) / 2);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method5173(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static156.anInt2872 = Static156.anInt2872 & 0xFF000000 | Static356.method5850(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static156.anInt2872 = Static171.anInt3094 & 0xFFFFFF | Static156.anInt2872 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static156.anInt2872 = Static356.method5850(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static156.anInt2872 = Static171.anInt3094;
			} else if (arg0.startsWith("str=")) {
				Static31.anInt590 = Static156.anInt2872 & 0xFF000000 | Static356.method5850(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static31.anInt590 = Static156.anInt2872 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static31.anInt590 = -1;
			} else if (arg0.startsWith("u=")) {
				Static120.anInt2109 = Static156.anInt2872 & 0xFF000000 | Static356.method5850(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static120.anInt2109 = Static156.anInt2872 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static120.anInt2109 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static1.anInt7722 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static1.anInt7722 = Static156.anInt2872 & 0xFF000000 | Static356.method5850(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static1.anInt7722 = Static156.anInt2872 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static1.anInt7722 = Static386.anInt6511;
			} else if (arg0.equals("br")) {
				this.method5165(Static171.anInt3094, Static386.anInt6511);
			}
		} catch (@Pc(192) Exception local192) {
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILjava/lang/String;Lclient!i;IIIII[II[Lclient!aa;III)I")
	public final int method5175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class2[] arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5170(arg7, arg4, arg10, 1, arg1, arg11, arg6, 0, arg12, arg3, arg0, arg9, arg2, 0, arg5, arg8);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([II[ILjava/lang/String;[Lclient!aa;I[II)V")
	private void method5176(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class2[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - this.aClass124_13.anInt3601;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg2.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static456.method6227(arg2.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(128) int local128;
				@Pc(136) int local136;
				if (local33 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg2.substring(local13 + 1, local22);
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
									if (arg5 == null) {
										local128 = 0;
									} else {
										local128 = arg5[local17];
									}
									if (arg1 == null) {
										local136 = 0;
									} else {
										local136 = arg1[local17];
									}
									local17++;
									@Pc(149) int local149 = Static160.method2518(local56.substring(4));
									@Pc(153) Class2 local153 = arg3[local149];
									@Pc(162) int local162 = arg0 == null ? local153.ga() : arg0[local149];
									local153.E(local128 + arg6, this.aClass124_13.anInt3601 + local7 + -local162 + local136, 1, 0, 1);
									arg6 += arg3[local149].d();
									local15 = -1;
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method5173(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass124_13.method3092(local15, local33);
					}
					@Pc(221) int local221;
					if (arg5 == null) {
						local221 = 0;
					} else {
						local221 = arg5[local17];
					}
					if (arg1 == null) {
						local128 = 0;
					} else {
						local128 = arg1[local17];
					}
					if (local33 != ' ') {
						if ((Static1.anInt7722 & 0xFF000000) != 0) {
							this.g(local33, arg6 + local221 + 1, local7 - (-local128 + -1), Static1.anInt7722, true);
						}
						this.g(local33, arg6 + local221, local128 + local7, Static156.anInt2872, false);
					} else if (Static69.anInt1287 > 0) {
						Static234.anInt4003 += Static69.anInt1287;
						arg6 += Static234.anInt4003 >> 8;
						Static234.anInt4003 &= 0xFF;
					}
					local17++;
					local136 = this.aClass124_13.method3089(local33);
					if (Static31.anInt590 != -1) {
						this.aClass167_10.method6018(local136, (int) ((double) this.aClass124_13.anInt3601 * 0.7D) + local7, Static31.anInt590, arg6);
					}
					if (Static120.anInt2109 != -1) {
						this.aClass167_10.method6018(local136, local7 + this.aClass124_13.anInt3601, Static120.anInt2109, arg6);
					}
					local15 = local33;
					arg6 += local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[I[Lclient!aa;IIIIIIILjava/util/Random;Ljava/lang/String;[III)I")
	public final int method5177(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Random arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg9.setSeed((long) arg6);
		@Pc(20) int local20 = (arg9.nextInt() & 0x1F) + 192;
		this.method5165(local20 << 24 | arg7 & 0xFFFFFF, local20 << 24 | arg12 & 0xFFFFFF);
		@Pc(40) int local40 = arg10.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg8;
		@Pc(75) int local75 = this.aClass124_13.anInt3604 + arg3;
		if (arg0 == 1) {
			local75 += (arg13 - this.aClass124_13.anInt3604 - this.aClass124_13.anInt3597) / 2;
		} else if (arg0 == 2) {
			local75 = arg3 + arg13 - this.aClass124_13.anInt3597;
		}
		@Pc(108) int local108 = -1;
		if (arg5 == 1) {
			local108 = local45 + this.aClass124_13.method3099(arg10);
			local69 = arg8 + (arg4 - local108) / 2;
		} else if (arg5 == 2) {
			local108 = this.aClass124_13.method3099(arg10) + local45;
			local69 = arg8 + arg4 - local108;
		}
		this.method5176(arg11, null, arg10, arg2, local75, local43, local69);
		if (arg1 != null) {
			if (local108 == -1) {
				local108 = local45 + this.aClass124_13.method3099(arg10);
			}
			arg1[1] = local75 - this.aClass124_13.anInt3604;
			arg1[3] = this.aClass124_13.anInt3597 + this.aClass124_13.anInt3604;
			arg1[2] = local108;
			arg1[0] = local69;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBILjava/lang/String;III)V")
	public final void method5178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5165(arg0, -16777216);
		@Pc(24) int local24 = arg2.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) arg1 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method5176(null, local27, arg2, null, arg4, null, arg3 - this.aClass124_13.method3099(arg2) / 2);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!i;Ljava/lang/String;I[Lclient!aa;[IIII)V")
	private void method5180(@OriginalArg(1) Class14 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass124_13.anInt3601;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static456.method6227(arg1.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(52) String local52 = arg1.substring(local13 + 1, local20);
					local13 = -1;
					if (local52.equals("lt")) {
						local31 = '<';
					} else if (local52.equals("gt")) {
						local31 = '>';
					} else if (local52.equals("nbsp")) {
						local31 = ' ';
					} else if (local52.equals("shy")) {
						local31 = '\u00ad';
					} else if (local52.equals("times")) {
						local31 = '×';
					} else if (local52.equals("euro")) {
						local31 = '€';
					} else if (local52.equals("copy")) {
						local31 = '©';
					} else {
						if (!local52.equals("reg")) {
							if (local52.startsWith("img=")) {
								try {
									@Pc(120) int local120 = Static160.method2518(local52.substring(4));
									@Pc(124) Class2 local124 = arg3[local120];
									@Pc(133) int local133 = arg4 == null ? local124.ga() : arg4[local120];
									if ((Static156.anInt2872 & -16777216) == -16777216) {
										local124.E(arg5, local7 + this.aClass124_13.anInt3601 - local133, 1, 0, 1);
									} else {
										local124.E(arg5, local7 + this.aClass124_13.anInt3601 - local133, 0, Static156.anInt2872 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg5 += arg3[local120].d();
									local15 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method5173(local52);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass124_13.method3092(local15, local31);
					}
					if (local31 == ' ') {
						if (Static69.anInt1287 > 0) {
							Static234.anInt4003 += Static69.anInt1287;
							arg5 += Static234.anInt4003 >> 8;
							Static234.anInt4003 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static1.anInt7722 & 0xFF000000) != 0) {
							this.g(local31, arg5 + 1, local7 + 1, Static1.anInt7722, true);
						}
						this.g(local31, arg5, local7, Static156.anInt2872, false);
					} else {
						if ((Static1.anInt7722 & 0xFF000000) != 0) {
							this.method5162(local31, arg5 + 1, local7 + 1, Static1.anInt7722, true, arg0, arg6, arg7);
						}
						this.method5162(local31, arg5, local7, Static156.anInt2872, false, arg0, arg6, arg7);
					}
					@Pc(300) int local300 = this.aClass124_13.method3089(local31);
					if (Static31.anInt590 != -1) {
						this.aClass167_10.method6018(local300, (int) ((double) this.aClass124_13.anInt3601 * 0.7D) + local7, Static31.anInt590, arg5);
					}
					if (Static120.anInt2109 != -1) {
						this.aClass167_10.method6018(local300, local7 + this.aClass124_13.anInt3601 + 1, Static120.anInt2109, arg5);
					}
					local15 = local31;
					arg5 += local300;
				}
			}
		}
	}
}
