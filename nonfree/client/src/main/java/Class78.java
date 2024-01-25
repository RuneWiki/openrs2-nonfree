import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public abstract class Class78 {

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "Lclient!jp;")
	private final Class106 aClass106_6;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!vm;")
	private final Class92 aClass92_8;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!vm;Lclient!jp;)V")
	protected Class78(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class106 arg1) {
		this.aClass106_6 = arg1;
		this.aClass92_8 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IBII)V")
	public final void method4050(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4055(arg3, arg0);
			this.method4073(arg2, arg1, null, arg4, 0, null, 0, null);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[ILjava/util/Random;IIIII[Lclient!lg;Ljava/lang/String;[III)I")
	public final int method4053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class60[] arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg3.setSeed((long) arg8);
		@Pc(21) int local21 = (arg3.nextInt() & 0x1F) + 192;
		this.method4055(local21 << 24 | arg1 & 0xFFFFFF, arg13 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg10.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg3.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(66) int local66 = arg0;
		@Pc(73) int local73 = arg6 + this.aClass106_6.anInt3299;
		@Pc(75) int local75 = -1;
		if (arg4 == 1) {
			local73 += (arg5 - this.aClass106_6.anInt3299 - this.aClass106_6.anInt3309) / 2;
		} else if (arg4 == 2) {
			local73 = arg6 + arg5 - this.aClass106_6.anInt3309;
		}
		if (arg12 == 1) {
			local75 = this.aClass106_6.method2879(arg10) + local46;
			local66 = arg0 + (arg7 - local75) / 2;
		} else if (arg12 == 2) {
			local75 = local46 + this.aClass106_6.method2879(arg10);
			local66 = arg0 + arg7 - local75;
		}
		this.method4069(arg10, local66, local73, null, arg9, arg2, local44);
		if (arg11 != null) {
			if (local75 == -1) {
				local75 = this.aClass106_6.method2879(arg10) + local46;
			}
			arg11[1] = local73 - this.aClass106_6.anInt3299;
			arg11[2] = local75;
			arg11[0] = local66;
			arg11[3] = this.aClass106_6.anInt3309 + this.aClass106_6.anInt3299;
		}
		return local46;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method4054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method4055(-1, arg1);
			this.method4073(arg0 - this.aClass106_6.method2879(arg3), arg3, null, arg2, 0, null, 0, null);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)V")
	private void method4055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static5.anInt153 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static162.anInt3661 = 0;
		Static210.anInt5564 = 0;
		Static223.anInt4639 = -1;
		Static193.anInt4173 = arg1;
		Static270.anInt6613 = arg1;
		Static315.anInt1641 = arg0;
		Static106.anInt2367 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[Lclient!lg;ILjava/lang/String;III[I)V")
	public final void method4056(@OriginalArg(0) int arg0, @OriginalArg(1) Class60[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		if (arg3 != null) {
			this.method4055(arg2, arg0);
			this.method4073(arg4, arg3, arg6, arg5, 0, null, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZLclient!go;II)V")
	protected abstract void method4057(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method4059(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static270.anInt6613 = Static270.anInt6613 & 0xFF000000 | Static7.method236(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static270.anInt6613 = Static193.anInt4173 & 0xFFFFFF | Static270.anInt6613 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static270.anInt6613 = Static7.method236(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static270.anInt6613 = Static193.anInt4173;
			} else if (arg0.startsWith("str=")) {
				Static223.anInt4639 = Static7.method236(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static223.anInt4639 = -8388608;
			} else if (arg0.equals("/str")) {
				Static223.anInt4639 = -1;
			} else if (arg0.startsWith("u=")) {
				Static5.anInt153 = Static7.method236(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static5.anInt153 = -16777216;
			} else if (arg0.equals("/u")) {
				Static5.anInt153 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static106.anInt2367 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static106.anInt2367 = Static7.method236(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static106.anInt2367 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static106.anInt2367 = Static315.anInt1641;
			} else if (arg0.equals("br")) {
				this.method4055(Static315.anInt1641, Static193.anInt4173);
			}
		} catch (@Pc(171) Exception local171) {
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;I[II[Lclient!lg;II)V")
	public final void method4060(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class60[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 != null) {
			this.method4055(arg6, arg5);
			this.method4073(arg3 - this.aClass106_6.method2879(arg1), arg1, arg2, arg0, 0, null, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method4061(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method4062(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
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
			Static210.anInt5564 = (arg0 - this.aClass106_6.method2879(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;I[II[Lclient!lg;ILjava/util/Random;II)I")
	public final int method4063(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) Class60[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Random arg5, @OriginalArg(8) int arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg5.setSeed((long) arg4);
		@Pc(33) int local33 = (arg5.nextInt() & 0x1F) + 192;
		this.method4055((local33 | 0x0) << 24, local33 << 24 | 0xFFFFFF);
		@Pc(53) int local53 = arg1.length();
		@Pc(56) int[] local56 = new int[local53];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local53; local60++) {
			local56[local60] = local58;
			if ((arg5.nextInt() & 0x3) == 0) {
				local58++;
			}
		}
		this.method4069(arg1, arg6, arg0, null, arg3, arg2, local56);
		return local58;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BIII[ILjava/lang/String;[Lclient!lg;I)V")
	public final void method4064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class60[] arg5, @OriginalArg(7) int arg6) {
		if (arg4 != null) {
			this.method4055(arg1, arg2);
			this.method4073(arg6 - this.aClass106_6.method2879(arg4) / 2, arg4, arg3, arg0, 0, null, 0, arg5);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IIIBI)V")
	public final void method4066(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4055(-16777216, arg3);
		@Pc(24) int local24 = arg1.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method4069(arg1, arg4 - this.aClass106_6.method2879(arg1) / 2, arg2, local27, null, null, null);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[IZIILjava/lang/String;III[Lclient!lg;Lclient!go;III)I")
	public final int method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class60[] arg10, @OriginalArg(12) Class84 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg6 == null) {
			return 0;
		}
		this.method4055(arg2, arg14);
		if (arg5 == 0) {
			arg5 = this.aClass106_6.anInt3304;
		}
		@Pc(56) int[] local56;
		if (this.aClass106_6.anInt3309 + this.aClass106_6.anInt3299 + arg5 > arg8 && arg5 + arg5 > arg8) {
			local56 = null;
		} else {
			local56 = new int[] { arg0 };
		}
		@Pc(69) int local69 = this.aClass106_6.method2875(arg6, arg10, local56, Static73.aStringArray11);
		if (arg12 == 3 && local69 == 1) {
			arg12 = 1;
		}
		@Pc(111) int local111;
		@Pc(154) int local154;
		if (arg12 == 0) {
			local111 = this.aClass106_6.anInt3299 + arg7;
		} else if (arg12 == 1) {
			local111 = arg7 + this.aClass106_6.anInt3299 + (-((local69 + -1) * arg5) + (-this.aClass106_6.anInt3299 + arg8 - this.aClass106_6.anInt3309)) / 2;
		} else if (arg12 == 2) {
			local111 = arg8 + arg7 - this.aClass106_6.anInt3309 - (local69 - 1) * arg5;
		} else {
			local154 = (arg8 - arg5 * (local69 - 1) - this.aClass106_6.anInt3309 - this.aClass106_6.anInt3299) / (local69 + 1);
			if (local154 < 0) {
				local154 = 0;
			}
			arg5 += local154;
			local111 = this.aClass106_6.anInt3299 + arg7 + local154;
		}
		for (local154 = 0; local154 < local69; local154++) {
			if (arg13 == 0) {
				this.method4073(arg4, Static73.aStringArray11[local154], arg3, local111, arg1, arg11, arg9, arg10);
			} else if (arg13 == 1) {
				this.method4073((arg0 - this.aClass106_6.method2879(Static73.aStringArray11[local154])) / 2 + arg4, Static73.aStringArray11[local154], arg3, local111, arg1, arg11, arg9, arg10);
			} else if (arg13 == 2) {
				this.method4073(arg0 + arg4 - this.aClass106_6.method2879(Static73.aStringArray11[local154]), Static73.aStringArray11[local154], arg3, local111, arg1, arg11, arg9, arg10);
			} else if (local69 - 1 == local154) {
				this.method4073(arg4, Static73.aStringArray11[local154], arg3, local111, arg1, arg11, arg9, arg10);
			} else {
				this.method4062(arg0, Static73.aStringArray11[local154]);
				this.method4073(arg4, Static73.aStringArray11[local154], arg3, local111, arg1, arg11, arg9, arg10);
				Static210.anInt5564 = 0;
			}
			local111 += arg5;
		}
		return local69;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;III[I[Lclient!lg;[I[I)V")
	private void method4069(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class60[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg2 - this.aClass106_6.anInt3304;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static269.method4692(arg0.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				@Pc(127) int local127;
				@Pc(135) int local135;
				if (local39 == '>' && local13 != -1) {
					@Pc(61) String local61 = arg0.substring(local13 + 1, local28);
					local13 = -1;
					if (local61.equals("lt")) {
						local39 = '<';
					} else if (local61.equals("gt")) {
						local39 = '>';
					} else if (local61.equals("nbsp")) {
						local39 = ' ';
					} else if (local61.equals("shy")) {
						local39 = '\u00ad';
					} else if (local61.equals("times")) {
						local39 = '×';
					} else if (local61.equals("euro")) {
						local39 = '€';
					} else if (local61.equals("copy")) {
						local39 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local127 = 0;
									} else {
										local127 = arg6[local17];
									}
									if (arg3 == null) {
										local135 = 0;
									} else {
										local135 = arg3[local17];
									}
									local17++;
									@Pc(148) int local148 = Static120.method2435(local61.substring(4));
									@Pc(152) Class60 local152 = arg4[local148];
									@Pc(161) int local161 = arg5 == null ? local152.method5691() : arg5[local148];
									local152.method5682(arg1 + local127, local11 + (this.aClass106_6.anInt3304 - local161) - -local135, 0, 0);
									arg1 += arg4[local148].method5683();
									local15 = -1;
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method4059(local61);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass106_6.method2884(local15, local39);
					}
					@Pc(228) int local228;
					if (arg6 == null) {
						local228 = 0;
					} else {
						local228 = arg6[local17];
					}
					if (arg3 == null) {
						local127 = 0;
					} else {
						local127 = arg3[local17];
					}
					if (local39 != ' ') {
						if ((Static106.anInt2367 & 0xFF000000) != 0) {
							this.method4061(local39, arg1 + local228 + 1, local127 + 1 + local11, Static106.anInt2367, true);
						}
						this.method4061(local39, local228 + arg1, local127 + local11, Static270.anInt6613, false);
					} else if (Static210.anInt5564 > 0) {
						Static162.anInt3661 += Static210.anInt5564;
						arg1 += Static162.anInt3661 >> 8;
						Static162.anInt3661 &= 0xFF;
					}
					local17++;
					local135 = this.aClass106_6.method2873(local39);
					if (Static223.anInt4639 != -1) {
						this.aClass92_8.method4481((int) ((double) this.aClass106_6.anInt3304 * 0.7D) + local11, Static223.anInt4639, local135, arg1);
					}
					if (Static5.anInt153 != -1) {
						this.aClass92_8.method4481(this.aClass106_6.anInt3304 + local11, Static5.anInt153, local135, arg1);
					}
					arg1 += local135;
					local15 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4055(-16777216, arg2);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg3 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg3 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method4069(arg1, arg4 - this.aClass106_6.method2879(arg1) / 2, arg0, local22, null, null, local19);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method4071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method4055(-16777216, arg1);
		@Pc(25) double local25 = 7.0D - (double) arg4 / 8.0D;
		if (local25 < 0.0D) {
			local25 = 0.0D;
		}
		@Pc(34) int local34 = arg3.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
			local37[local39] = (int) (local25 * Math.sin((double) local39 / 1.5D + (double) arg5));
		}
		this.method4069(arg3, arg2 - this.aClass106_6.method2879(arg3) / 2, arg0, local37, null, null, null);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4072(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method4055(arg3, arg2);
			this.method4073(arg1 - this.aClass106_6.method2879(arg0) / 2, arg0, null, arg4, 0, null, 0, null);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;[IIILclient!go;I[Lclient!lg;I)V")
	private void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class60[] arg7) {
		@Pc(7) int local7 = arg3 - this.aClass106_6.anInt3304;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(36) char local36 = (char) (Static269.method4692(arg1.charAt(local20)) & 0xFF);
			if (local36 == '<') {
				local13 = local20;
			} else {
				if (local36 == '>' && local13 != -1) {
					@Pc(57) String local57 = arg1.substring(local13 + 1, local20);
					local13 = -1;
					if (local57.equals("lt")) {
						local36 = '<';
					} else if (local57.equals("gt")) {
						local36 = '>';
					} else if (local57.equals("nbsp")) {
						local36 = ' ';
					} else if (local57.equals("shy")) {
						local36 = '\u00ad';
					} else if (local57.equals("times")) {
						local36 = '×';
					} else if (local57.equals("euro")) {
						local36 = '€';
					} else if (local57.equals("copy")) {
						local36 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									@Pc(123) int local123 = Static120.method2435(local57.substring(4));
									@Pc(127) Class60 local127 = arg7[local123];
									@Pc(136) int local136 = arg2 == null ? local127.method5691() : arg2[local123];
									if ((Static270.anInt6613 & 0xFF000000) == -16777216) {
										local127.method5682(arg0, local7 + this.aClass106_6.anInt3304 - local136, 0, 0);
									} else {
										local127.method5682(arg0, this.aClass106_6.anInt3304 + local7 - local136, 1, Static270.anInt6613 & 0xFF000000 | 0xFFFFFF);
									}
									local15 = -1;
									arg0 += arg7[local123].method5683();
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method4059(local57);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass106_6.method2884(local15, local36);
					}
					if (local36 == ' ') {
						if (Static210.anInt5564 > 0) {
							Static162.anInt3661 += Static210.anInt5564;
							arg0 += Static162.anInt3661 >> 8;
							Static162.anInt3661 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static106.anInt2367 & 0xFF000000) != 0) {
							this.method4061(local36, arg0 + 1, local7 + 1, Static106.anInt2367, true);
						}
						this.method4061(local36, arg0, local7, Static270.anInt6613, false);
					} else {
						if ((Static106.anInt2367 & 0xFF000000) != 0) {
							this.method4057(local36, arg0 + 1, local7 + 1, Static106.anInt2367, true, arg5, arg6, arg4);
						}
						this.method4057(local36, arg0, local7, Static270.anInt6613, false, arg5, arg6, arg4);
					}
					@Pc(302) int local302 = this.aClass106_6.method2873(local36);
					if (Static223.anInt4639 != -1) {
						this.aClass92_8.method4481(local7 + (int) ((double) this.aClass106_6.anInt3304 * 0.7D), Static223.anInt4639, local302, arg0);
					}
					if (Static5.anInt153 != -1) {
						this.aClass92_8.method4481(this.aClass106_6.anInt3304 + local7 + 1, Static5.anInt153, local302, arg0);
					}
					arg0 += local302;
					local15 = local36;
				}
			}
		}
	}
}
