import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class82 {

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!mj;")
	private final Class202 aClass202_15;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!oa;")
	private final Class90 aClass90_13;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!oa;Lclient!mj;)V")
	protected Class82(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class202 arg1) {
		this.aClass202_15 = arg1;
		this.aClass90_13 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[Lclient!xa;IILjava/lang/String;IZ[IIILclient!fa;IIIII)I")
	public final int method7867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class17 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg5 == null) {
			return 0;
		}
		this.method7870(arg3, arg1);
		if (arg13 == 0) {
			arg13 = this.aClass202_15.anInt6130;
		}
		@Pc(57) int[] local57;
		if (this.aClass202_15.anInt6135 + this.aClass202_15.anInt6139 + arg13 > arg0 && arg13 + arg13 > arg0) {
			local57 = null;
		} else {
			local57 = new int[] { arg4 };
		}
		@Pc(70) int local70 = this.aClass202_15.method4975(Static560.aStringArray39, arg5, arg2, local57);
		if (arg11 == -1) {
			arg11 = arg0 / arg13;
			if (arg11 <= 0) {
				arg11 = 1;
			}
		}
		if (arg11 > 0 && arg11 <= local70) {
			local70 = arg11;
			Static560.aStringArray39[arg11 - 1] = this.aClass202_15.method4973(Static560.aStringArray39[arg11 - 1], arg2, arg4);
		}
		if (arg15 == 3 && local70 == 1) {
			arg15 = 1;
		}
		@Pc(143) int local143;
		@Pc(168) int local168;
		if (arg15 == 0) {
			local143 = this.aClass202_15.anInt6139 + arg12;
		} else if (arg15 == 1) {
			local143 = this.aClass202_15.anInt6139 + arg12 + (arg0 - arg13 * (local70 - 1) - this.aClass202_15.anInt6139 - this.aClass202_15.anInt6135) / 2;
		} else if (arg15 == 2) {
			local143 = arg0 + arg12 - this.aClass202_15.anInt6135 - (local70 + -1) * arg13;
		} else {
			local168 = (arg0 - this.aClass202_15.anInt6135 - this.aClass202_15.anInt6139 - (local70 - 1) * arg13) / (local70 + 1);
			if (local168 < 0) {
				local168 = 0;
			}
			arg13 += local168;
			local143 = arg12 + this.aClass202_15.anInt6139 + local168;
		}
		for (local168 = 0; local168 < local70; local168++) {
			if (arg14 == 0) {
				this.method7884(arg10, arg2, arg6, Static560.aStringArray39[local168], arg9, local143, arg8, arg7);
			} else if (arg14 == 1) {
				this.method7884(arg10, arg2, arg6 + (arg4 - this.aClass202_15.method4970(Static560.aStringArray39[local168])) / 2, Static560.aStringArray39[local168], arg9, local143, arg8, arg7);
			} else if (arg14 == 2) {
				this.method7884(arg10, arg2, arg4 + arg6 - this.aClass202_15.method4970(Static560.aStringArray39[local168]), Static560.aStringArray39[local168], arg9, local143, arg8, arg7);
			} else if (local168 == local70 - 1) {
				this.method7884(arg10, arg2, arg6, Static560.aStringArray39[local168], arg9, local143, arg8, arg7);
			} else {
				this.method7883(Static560.aStringArray39[local168], arg4);
				this.method7884(arg10, arg2, arg6, Static560.aStringArray39[local168], arg9, local143, arg8, arg7);
				Static69.anInt1171 = 0;
			}
			local143 += arg13;
		}
		return local70;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7870(arg4, arg2);
			this.method7884(null, null, arg1 - this.aClass202_15.method4970(arg3), arg3, 0, arg0, 0, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	private void method7870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static39.anInt747 = -1;
		Static270.anInt4764 = 0;
		Static562.anInt352 = arg1;
		Static65.anInt1101 = arg1;
		Static5.anInt70 = -1;
		Static69.anInt1171 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static182.anInt3498 = arg0;
		Static192.anInt3733 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7870(-16777216, arg2);
		@Pc(24) int local24 = arg1.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7882(arg3, arg1, null, arg0 - this.aClass202_15.method4970(arg1) / 2, null, null, local27);
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
	protected abstract void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
	public final void method7873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7870(arg4, arg0);
			this.method7884(null, null, arg3 - this.aClass202_15.method4970(arg2) / 2, arg2, 0, arg1, 0, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;IBIILjava/util/Random;[IILjava/lang/String;I)I")
	public final int method7874(@OriginalArg(0) Class71[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int[] arg4, @OriginalArg(8) String arg5, @OriginalArg(9) int arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg3.setSeed((long) arg6);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method7870((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method7882(arg2, arg5, arg0, arg1, arg4, local43, null);
		return local45;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIILjava/lang/String;I)V")
	public final void method7875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7870(arg1, arg2);
			this.method7884(null, null, arg4, arg3, 0, arg0, 0, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIIILjava/util/Random;[IIILjava/lang/String;III[Lclient!xa;[I)I")
	public final int method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class71[] arg12, @OriginalArg(14) int[] arg13) {
		if (arg8 == null) {
			return 0;
		}
		arg4.setSeed((long) arg2);
		@Pc(34) int local34 = (arg4.nextInt() & 0x1F) + 192;
		this.method7870(arg7 & 0xFFFFFF | local34 << 24, arg6 & 0xFFFFFF | local34 << 24);
		@Pc(54) int local54 = arg8.length();
		@Pc(57) int[] local57 = new int[local54];
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < local54; local61++) {
			local57[local61] = local59;
			if ((arg4.nextInt() & 0x3) == 0) {
				local59++;
			}
		}
		@Pc(83) int local83 = arg3;
		@Pc(89) int local89 = this.aClass202_15.anInt6139 + arg10;
		if (arg11 == 1) {
			local89 += (arg0 - this.aClass202_15.anInt6139 - this.aClass202_15.anInt6135) / 2;
		} else if (arg11 == 2) {
			local89 = arg0 + arg10 - this.aClass202_15.anInt6135;
		}
		@Pc(126) int local126 = -1;
		if (arg9 == 1) {
			local126 = this.aClass202_15.method4970(arg8) + local59;
			local83 = arg3 + (arg1 - local126) / 2;
		} else if (arg9 == 2) {
			local126 = local59 + this.aClass202_15.method4970(arg8);
			local83 = arg3 + arg1 - local126;
		}
		this.method7882(local89, arg8, arg12, local83, arg5, local57, null);
		if (arg13 != null) {
			if (local126 == -1) {
				local126 = this.aClass202_15.method4970(arg8) + local59;
			}
			arg13[0] = local83;
			arg13[2] = local126;
			arg13[1] = local89 - this.aClass202_15.anInt6139;
			arg13[3] = this.aClass202_15.anInt6139 + this.aClass202_15.anInt6135;
		}
		return local59;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIBLjava/lang/String;I)V")
	public final void method7877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7870(-16777216, arg0);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(30) int[] local30 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local19[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method7882(arg2, arg3, null, arg4 - this.aClass202_15.method4970(arg3) / 2, null, local19, local30);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!fa;Ljava/lang/String;I[IIIBIII[Lclient!xa;IIII)I")
	public final int method7878(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class71[] arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13) {
		return this.method7867(arg3, arg10, arg9, arg8, arg7, arg2, arg12, arg4, arg5, arg13, arg1, 0, arg11, 0, arg0, arg6);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	protected abstract void method7879(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class17 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;[IIII[Lclient!xa;I)V")
	public final void method7880(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class71[] arg5) {
		if (arg1 != null) {
			this.method7870(0, arg0);
			this.method7884(null, arg5, arg4, arg1, 0, arg3, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method7881(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static65.anInt1101 = Static65.anInt1101 & 0xFF000000 | Static105.method1623(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static65.anInt1101 = Static562.anInt352 & 0xFFFFFF | Static65.anInt1101 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static65.anInt1101 = Static105.method1623(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static65.anInt1101 = Static562.anInt352;
			} else if (arg0.startsWith("str=")) {
				Static39.anInt747 = Static65.anInt1101 & 0xFF000000 | Static105.method1623(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static39.anInt747 = Static65.anInt1101 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static39.anInt747 = -1;
			} else if (arg0.startsWith("u=")) {
				Static5.anInt70 = Static65.anInt1101 & 0xFF000000 | Static105.method1623(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static5.anInt70 = Static65.anInt1101 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static5.anInt70 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static192.anInt3733 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static192.anInt3733 = Static65.anInt1101 & 0xFF000000 | Static105.method1623(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static192.anInt3733 = Static65.anInt1101 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static192.anInt3733 = Static182.anInt3498;
			} else if (arg0.equals("br")) {
				this.method7870(Static182.anInt3498, Static562.anInt352);
				return;
			}
		} catch (@Pc(179) Exception local179) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;[Lclient!xa;I[II[I[I)V")
	private void method7882(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class71[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg0 - this.aClass202_15.anInt6130;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static492.method6861(arg1.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local17 = local26;
			} else {
				@Pc(130) int local130;
				@Pc(140) int local140;
				if (local37 == '>' && local17 != -1) {
					@Pc(62) String local62 = arg1.substring(local17 + 1, local26);
					local17 = -1;
					if (local62.equals("lt")) {
						local37 = '<';
					} else if (local62.equals("gt")) {
						local37 = '>';
					} else if (local62.equals("nbsp")) {
						local37 = ' ';
					} else if (local62.equals("shy")) {
						local37 = '\u00ad';
					} else if (local62.equals("times")) {
						local37 = '×';
					} else if (local62.equals("euro")) {
						local37 = '€';
					} else if (local62.equals("copy")) {
						local37 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local130 = 0;
									} else {
										local130 = arg5[local21];
									}
									if (arg6 == null) {
										local140 = 0;
									} else {
										local140 = arg6[local21];
									}
									local21++;
									@Pc(153) int local153 = Static443.method6265(local62.substring(4));
									@Pc(157) Class71 local157 = arg2[local153];
									@Pc(166) int local166 = arg4 == null ? local157.a() : arg4[local153];
									local157.I(local130 + arg3, local140 + -local166 + local11 + this.aClass202_15.anInt6130, 1, 0, 1);
									local19 = -1;
									arg3 += arg2[local153].AA();
								} catch (@Pc(195) Exception local195) {
								}
							} else {
								this.method7881(local62);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg3 += this.aClass202_15.method4979(local19, local37);
					}
					@Pc(230) int local230;
					if (arg5 == null) {
						local230 = 0;
					} else {
						local230 = arg5[local21];
					}
					if (arg6 == null) {
						local130 = 0;
					} else {
						local130 = arg6[local21];
					}
					if (local37 != ' ') {
						if ((Static192.anInt3733 & 0xFF000000) != 0) {
							this.q(local37, local230 + arg3 + 1, local11 + 1 + local130, Static192.anInt3733, true);
						}
						this.q(local37, arg3 + local230, local130 + local11, Static65.anInt1101, false);
					} else if (Static69.anInt1171 > 0) {
						Static270.anInt4764 += Static69.anInt1171;
						arg3 += Static270.anInt4764 >> 8;
						Static270.anInt4764 &= 0xFF;
					}
					local21++;
					local140 = this.aClass202_15.method4972(local37);
					if (Static39.anInt747 != -1) {
						this.aClass90_13.method7463(local11 + (int) ((double) this.aClass202_15.anInt6130 * 0.7D), local140, arg3, Static39.anInt747);
					}
					if (Static5.anInt70 != -1) {
						this.aClass90_13.method7463(this.aClass202_15.anInt6130 + local11, local140, arg3, Static5.anInt70);
					}
					local19 = local37;
					arg3 += local140;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method7883(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
			@Pc(27) char local27 = arg0.charAt(local11);
			if (local27 == '<') {
				local9 = true;
			} else if (local27 == '>') {
				local9 = false;
			} else if (!local9 && local27 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static69.anInt1171 = (arg1 - this.aClass202_15.method4970(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!fa;[Lclient!xa;ILjava/lang/String;III[I)V")
	private void method7884(@OriginalArg(1) Class17 arg0, @OriginalArg(2) Class71[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg5 - this.aClass202_15.anInt6130;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			@Pc(37) char local37 = (char) (Static492.method6861(arg3.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				if (local37 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg3.substring(local13 + 1, local26);
					local13 = -1;
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
									@Pc(115) int local115 = Static443.method6265(local59.substring(4));
									@Pc(119) Class71 local119 = arg1[local115];
									@Pc(128) int local128 = arg7 == null ? local119.a() : arg7[local115];
									if ((-16777216 & Static65.anInt1101) == -16777216) {
										local119.I(arg2, local7 + this.aClass202_15.anInt6130 - local128, 1, 0, 1);
									} else {
										local119.I(arg2, this.aClass202_15.anInt6130 + local7 - local128, 0, Static65.anInt1101 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg2 += arg1[local115].AA();
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method7881(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass202_15.method4979(local15, local37);
					}
					if (local37 == ' ') {
						if (Static69.anInt1171 > 0) {
							Static270.anInt4764 += Static69.anInt1171;
							arg2 += Static270.anInt4764 >> 8;
							Static270.anInt4764 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static192.anInt3733 & 0xFF000000) != 0) {
							this.q(local37, arg2 + 1, local7 + 1, Static192.anInt3733, true);
						}
						this.q(local37, arg2, local7, Static65.anInt1101, false);
					} else {
						if ((Static192.anInt3733 & 0xFF000000) != 0) {
							this.method7879(local37, arg2 + 1, local7 + 1, Static192.anInt3733, true, arg0, arg4, arg6);
						}
						this.method7879(local37, arg2, local7, Static65.anInt1101, false, arg0, arg4, arg6);
					}
					@Pc(309) int local309 = this.aClass202_15.method4972(local37);
					if (Static39.anInt747 != -1) {
						this.aClass90_13.method7463(local7 + (int) ((double) this.aClass202_15.anInt6130 * 0.7D), local309, arg2, Static39.anInt747);
					}
					if (Static5.anInt70 != -1) {
						this.aClass90_13.method7463(this.aClass202_15.anInt6130 + local7 + 1, local309, arg2, Static5.anInt70);
					}
					local15 = local37;
					arg2 += local309;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public final void method7885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7870(-16777216, arg4);
		@Pc(20) double local20 = 7.0D - (double) arg0 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg5.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) local34 / 1.5D + (double) arg2) * local20);
		}
		this.method7882(arg3, arg5, null, arg1 - this.aClass202_15.method4970(arg5) / 2, null, null, local32);
	}
}
