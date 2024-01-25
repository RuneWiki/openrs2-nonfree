import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class67 {

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!cd;")
	private final Class53 aClass53_14;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!ha;")
	private final Class75 aClass75_16;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!cd;)V")
	protected Class67(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class53 arg1) {
		this.aClass53_14 = arg1;
		this.aClass75_16 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[IIIIIII[Lclient!tb;IILclient!aa;ILjava/lang/String;)I")
	public final int method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class49[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) String arg14) {
		return this.method8293(arg5, arg3, arg13, arg14, arg11, arg6, arg9, arg10, arg1, arg7, arg12, arg2, arg0, arg8, 0, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;IIIII)V")
	public final void method8283(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method8287(-16777216, arg5);
		@Pc(22) double local22 = 7.0D - (double) arg2 / 8.0D;
		if (local22 < 0.0D) {
			local22 = 0.0D;
		}
		@Pc(31) int local31 = arg0.length();
		@Pc(34) int[] local34 = new int[local31];
		for (@Pc(36) int local36 = 0; local36 < local31; local36++) {
			local34[local36] = (int) (Math.sin((double) local36 / 1.5D + (double) arg1) * local22);
		}
		this.method8297(arg0, local34, arg3 - this.aClass53_14.method824(arg0) / 2, (int[]) null, arg4, (Class49[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method8287(-16777216, arg3);
		@Pc(24) int local24 = arg1.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method8297(arg1, local30, arg2 - this.aClass53_14.method824(arg1) / 2, (int[]) null, arg0, (Class49[]) null, local27);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method8285(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method8287(arg4, arg2);
			this.method8295(arg3, (int[]) null, 0, 0, arg0, (Class49[]) null, (Class1) null, arg1 - this.aClass53_14.method824(arg0));
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method8286(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; arg0.length() > local19; local19++) {
			@Pc(27) char local27 = arg0.charAt(local19);
			if (local27 == '<') {
				local17 = true;
			} else if (local27 == '>') {
				local17 = false;
			} else if (!local17 && local27 == ' ') {
				local15++;
			}
		}
		if (local15 > 0) {
			Static141.anInt8734 = (arg1 - this.aClass53_14.method824(arg0) << 8) / local15;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V")
	private void method8287(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static347.anInt5923 = -1;
		Static488.anInt8266 = arg1;
		Static690.anInt10544 = arg1;
		Static508.anInt3294 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static141.anInt8734 = 0;
		Static221.anInt4358 = -1;
		Static184.anInt3698 = arg0;
		Static641.anInt9964 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IBI)V")
	public final void method8289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method8287(-16777216, arg0);
		@Pc(17) int local17 = arg2.length();
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			local20[local27] = (int) (Math.sin((double) arg4 / 5.0D + (double) local27 / 2.0D) * 5.0D);
		}
		this.method8297(arg2, local20, arg3 - this.aClass53_14.method824(arg2) / 2, (int[]) null, arg1, (Class49[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!tb;IILjava/lang/String;Ljava/util/Random;III[I)I")
	public final int method8290(@OriginalArg(1) Class49[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int[] arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg4.setSeed((long) arg1);
		@Pc(22) int local22 = (arg4.nextInt() & 0x1F) + 192;
		this.method8287((local22 | 0x0) << 24, local22 << 24 | 0xFFFFFF);
		@Pc(42) int local42 = arg3.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg4.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		this.method8297(arg3, (int[]) null, arg5, arg6, arg2, arg0, local45);
		return local47;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBLjava/lang/String;)V")
	public final void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method8287(arg3, arg2);
			this.method8295(arg0, (int[]) null, 0, 0, arg4, (Class49[]) null, (Class1) null, arg1 - this.aClass53_14.method824(arg4) / 2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;III[Lclient!tb;IILclient!aa;IIIIBI)I")
	public final int method8293(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class49[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class1 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(16) int arg15) {
		if (arg3 == null) {
			return 0;
		}
		this.method8287(arg4, arg8);
		if (arg9 == 0) {
			arg9 = this.aClass53_14.anInt822;
		}
		@Pc(46) int[] local46;
		if (arg0 < this.aClass53_14.anInt811 + this.aClass53_14.anInt817 + arg9 && arg9 + arg9 > arg0) {
			local46 = null;
		} else {
			local46 = new int[] { arg2 };
		}
		@Pc(64) int local64 = this.aClass53_14.method812(arg7, local46, arg3, Static7.aStringArray3);
		if (arg14 == -1) {
			arg14 = arg0 / arg9;
			if (arg14 <= 0) {
				arg14 = 1;
			}
		}
		if (arg14 > 0 && arg14 <= local64) {
			Static7.aStringArray3[arg14 - 1] = this.aClass53_14.method817(arg7, arg2, Static7.aStringArray3[arg14 - 1]);
			local64 = arg14;
		}
		if (arg13 == 3 && local64 == 1) {
			arg13 = 1;
		}
		@Pc(130) int local130;
		@Pc(197) int local197;
		if (arg13 == 0) {
			local130 = this.aClass53_14.anInt817 + arg12;
		} else if (arg13 == 1) {
			local130 = (arg0 - arg9 * (local64 - 1) - this.aClass53_14.anInt817 - this.aClass53_14.anInt811) / 2 + arg12 + this.aClass53_14.anInt817;
		} else if (arg13 == 2) {
			local130 = arg12 + arg0 - this.aClass53_14.anInt811 - arg9 * (local64 - 1);
		} else {
			local197 = (arg0 - arg9 * (local64 - 1) - this.aClass53_14.anInt817 - this.aClass53_14.anInt811) / (local64 + 1);
			if (local197 < 0) {
				local197 = 0;
			}
			local130 = arg12 + this.aClass53_14.anInt817 + local197;
			arg9 += local197;
		}
		for (local197 = 0; local197 < local64; local197++) {
			if (arg15 == 0) {
				this.method8295(local130, arg1, arg5, arg6, Static7.aStringArray3[local197], arg7, arg10, arg11);
			} else if (arg15 == 1) {
				this.method8295(local130, arg1, arg5, arg6, Static7.aStringArray3[local197], arg7, arg10, arg11 + (arg2 - this.aClass53_14.method824(Static7.aStringArray3[local197])) / 2);
			} else if (arg15 == 2) {
				this.method8295(local130, arg1, arg5, arg6, Static7.aStringArray3[local197], arg7, arg10, arg11 + arg2 - this.aClass53_14.method824(Static7.aStringArray3[local197]));
			} else if (local197 == local64 - 1) {
				this.method8295(local130, arg1, arg5, arg6, Static7.aStringArray3[local197], arg7, arg10, arg11);
			} else {
				this.method8286(Static7.aStringArray3[local197], arg2);
				this.method8295(local130, arg1, arg5, arg6, Static7.aStringArray3[local197], arg7, arg10, arg11);
				Static141.anInt8734 = 0;
			}
			local130 += arg9;
		}
		return local64;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
	public final void method8294(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method8287(arg2, arg4);
			this.method8295(arg0, (int[]) null, 0, 0, arg1, (Class49[]) null, (Class1) null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB[IIILjava/lang/String;[Lclient!tb;Lclient!aa;I)V")
	private void method8295(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class49[] arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 - this.aClass53_14.anInt822;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg4.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static438.method6628(arg4.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local21 = local28;
			} else {
				if (local39 == '>' && local21 != -1) {
					@Pc(68) String local68 = arg4.substring(local21 + 1, local28);
					local21 = -1;
					if (local68.equals("lt")) {
						local39 = '<';
					} else if (local68.equals("gt")) {
						local39 = '>';
					} else if (local68.equals("nbsp")) {
						local39 = ' ';
					} else if (local68.equals("shy")) {
						local39 = '\u00ad';
					} else if (local68.equals("times")) {
						local39 = '×';
					} else if (local68.equals("euro")) {
						local39 = '€';
					} else if (local68.equals("copy")) {
						local39 = '©';
					} else {
						if (!local68.equals("reg")) {
							if (local68.startsWith("img=")) {
								try {
									@Pc(164) int local164 = Static543.method7715(local68.substring(4));
									@Pc(168) Class49 local168 = arg5[local164];
									@Pc(178) int local178 = arg1 == null ? local168.method8987() : arg1[local164];
									if ((Static690.anInt10544 & -16777216) == -16777216) {
										local168.method8981(arg7, local11 + this.aClass53_14.anInt822 - local178, 1, 0, 1);
									} else {
										local168.method8981(arg7, this.aClass53_14.anInt822 + local11 - local178, 0, Static690.anInt10544 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local23 = -1;
									arg7 += arg5[local164].method8991();
								} catch (@Pc(232) Exception local232) {
								}
							} else {
								this.method8296(local68);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg7 += this.aClass53_14.method820(local23, local39);
					}
					if (local39 == ' ') {
						if (Static141.anInt8734 > 0) {
							Static508.anInt3294 += Static141.anInt8734;
							arg7 += Static508.anInt3294 >> 8;
							Static508.anInt3294 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static641.anInt9964 & 0xFF000000) != 0) {
							this.fa(local39, arg7 + 1, local11 + 1, Static641.anInt9964, true);
						}
						this.fa(local39, arg7, local11, Static690.anInt10544, false);
					} else {
						if ((Static641.anInt9964 & 0xFF000000) != 0) {
							this.method8300(local39, arg7 + 1, local11 + 1, Static641.anInt9964, true, arg6, arg3, arg2);
						}
						this.method8300(local39, arg7, local11, Static690.anInt10544, false, arg6, arg3, arg2);
					}
					@Pc(375) int local375 = this.aClass53_14.method813(local39);
					if (Static221.anInt4358 != -1) {
						this.aClass75_16.method6661(local11 + (int) ((double) this.aClass53_14.anInt822 * 0.7D), local375, arg7, Static221.anInt4358);
					}
					if (Static347.anInt5923 != -1) {
						this.aClass75_16.method6661(local11 + this.aClass53_14.anInt822 + 1, local375, arg7, Static347.anInt5923);
					}
					local23 = local39;
					arg7 += local375;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method8296(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static690.anInt10544 = Static690.anInt10544 & 0xFF000000 | Static521.method7920(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static690.anInt10544 = Static690.anInt10544 & 0xFF000000 | Static488.anInt8266 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static690.anInt10544 = Static521.method7920(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static690.anInt10544 = Static488.anInt8266;
			} else if (arg0.startsWith("str=")) {
				Static221.anInt4358 = Static690.anInt10544 & 0xFF000000 | Static521.method7920(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static221.anInt4358 = Static690.anInt10544 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static221.anInt4358 = -1;
			} else if (arg0.startsWith("u=")) {
				Static347.anInt5923 = Static690.anInt10544 & 0xFF000000 | Static521.method7920(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static347.anInt5923 = Static690.anInt10544 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static347.anInt5923 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static641.anInt9964 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static641.anInt9964 = Static690.anInt10544 & 0xFF000000 | Static521.method7920(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static641.anInt9964 = Static690.anInt10544 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static641.anInt9964 = Static184.anInt3698;
			} else if (arg0.equals("br")) {
				this.method8287(Static184.anInt3698, Static488.anInt8266);
				return;
			}
		} catch (@Pc(233) Exception local233) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;[II[IBI[Lclient!tb;[I)V")
	private void method8297(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class49[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(16) int local16 = arg4 - this.aClass53_14.anInt822;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg0.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static438.method6628(arg0.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local18 = local27;
			} else {
				@Pc(167) int local167;
				@Pc(175) int local175;
				if (local38 == '>' && local18 != -1) {
					@Pc(65) String local65 = arg0.substring(local18 + 1, local27);
					local18 = -1;
					if (local65.equals("lt")) {
						local38 = '<';
					} else if (local65.equals("gt")) {
						local38 = '>';
					} else if (local65.equals("nbsp")) {
						local38 = ' ';
					} else if (local65.equals("shy")) {
						local38 = '\u00ad';
					} else if (local65.equals("times")) {
						local38 = '×';
					} else if (local65.equals("euro")) {
						local38 = '€';
					} else if (local65.equals("copy")) {
						local38 = '©';
					} else {
						if (!local65.equals("reg")) {
							if (local65.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local167 = 0;
									} else {
										local167 = arg6[local22];
									}
									if (arg1 == null) {
										local175 = 0;
									} else {
										local175 = arg1[local22];
									}
									local22++;
									@Pc(188) int local188 = Static543.method7715(local65.substring(4));
									@Pc(192) Class49 local192 = arg5[local188];
									@Pc(202) int local202 = arg3 == null ? local192.method8987() : arg3[local188];
									local192.method8981(local167 + arg2, local175 + local16 - -this.aClass53_14.anInt822 - local202, 1, 0, 1);
									arg2 += arg5[local188].method8991();
									local20 = -1;
								} catch (@Pc(231) Exception local231) {
								}
							} else {
								this.method8296(local65);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg2 += this.aClass53_14.method820(local20, local38);
					}
					@Pc(269) int local269;
					if (arg6 == null) {
						local269 = 0;
					} else {
						local269 = arg6[local22];
					}
					if (arg1 == null) {
						local167 = 0;
					} else {
						local167 = arg1[local22];
					}
					if (local38 != ' ') {
						if ((Static641.anInt9964 & 0xFF000000) != 0) {
							this.fa(local38, local269 + arg2 + 1, local167 + local16 - -1, Static641.anInt9964, true);
						}
						this.fa(local38, arg2 + local269, local16 - -local167, Static690.anInt10544, false);
					} else if (Static141.anInt8734 > 0) {
						Static508.anInt3294 += Static141.anInt8734;
						arg2 += Static508.anInt3294 >> 8;
						Static508.anInt3294 &= 0xFF;
					}
					local22++;
					local175 = this.aClass53_14.method813(local38);
					if (Static221.anInt4358 != -1) {
						this.aClass75_16.method6661(local16 + (int) ((double) this.aClass53_14.anInt822 * 0.7D), local175, arg2, Static221.anInt4358);
					}
					if (Static347.anInt5923 != -1) {
						this.aClass75_16.method6661(local16 + this.aClass53_14.anInt822, local175, arg2, Static347.anInt5923);
					}
					local20 = local38;
					arg2 += local175;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!tb;IIILjava/lang/String;[IIIILjava/util/Random;I[IIII)I")
	public final int method8299(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Random arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg8.setSeed((long) arg11);
		@Pc(21) int local21 = (arg8.nextInt() & 0x1F) + 192;
		this.method8287(local21 << 24 | arg7 & 0xFFFFFF, arg13 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg3.length();
		@Pc(50) int[] local50 = new int[local41];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local41; local54++) {
			local50[local54] = local52;
			if ((arg8.nextInt() & 0x3) == 0) {
				local52++;
			}
		}
		@Pc(76) int local76 = arg6;
		@Pc(82) int local82 = arg12 + this.aClass53_14.anInt817;
		@Pc(84) int local84 = -1;
		if (arg1 == 1) {
			local82 += (arg5 - this.aClass53_14.anInt811 - this.aClass53_14.anInt817) / 2;
		} else if (arg1 == 2) {
			local82 = arg12 + arg5 - this.aClass53_14.anInt811;
		}
		if (arg9 == 1) {
			local84 = local52 + this.aClass53_14.method824(arg3);
			local76 = arg6 + (arg2 - local84) / 2;
		} else if (arg9 == 2) {
			local84 = local52 + this.aClass53_14.method824(arg3);
			local76 = arg6 + arg2 - local84;
		}
		this.method8297(arg3, (int[]) null, local76, arg10, local82, arg0, local50);
		if (arg4 != null) {
			if (local84 == -1) {
				local84 = this.aClass53_14.method824(arg3) + local52;
			}
			arg4[2] = local84;
			arg4[1] = local82 - this.aClass53_14.anInt817;
			arg4[3] = this.aClass53_14.anInt811 + this.aClass53_14.anInt817;
			arg4[0] = local76;
		}
		return local52;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[Lclient!tb;Ljava/lang/String;[II)V")
	public final void method8301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class49[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null) {
			this.method8287(0, arg0);
			this.method8295(arg1, arg5, 0, 0, arg4, arg3, (Class1) null, arg2);
		}
	}
}
