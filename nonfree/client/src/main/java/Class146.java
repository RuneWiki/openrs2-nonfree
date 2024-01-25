import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class146 {

	@OriginalMember(owner = "client!il", name = "j", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public final int anInt3684;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public final int anInt3688;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "I")
	public final int anInt3689;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "([B)V")
	public Class146(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub14 local8 = new Class6_Sub14(arg0);
		@Pc(12) int local12 = local8.method6041();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method6041() == 1;
		this.aByteArray49 = new byte[256];
		local8.method6018(256, this.aByteArray49);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method6041();
			}
			@Pc(73) int[] local73 = new int[256];
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local73[local75] = local8.method6041();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local54[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method6034();
					local90[local92][local105] = local103;
				}
			}
			@Pc(138) byte[][] local138 = new byte[256][];
			@Pc(153) int local153;
			for (local105 = 0; local105 < 256; local105++) {
				local138[local105] = new byte[local54[local105]];
				@Pc(151) byte local151 = 0;
				for (local153 = 0; local153 < local138[local105].length; local153++) {
					local151 += local8.method6034();
					local138[local105][local153] = local151;
				}
			}
			this.aByteArrayArray12 = new byte[256][256];
			for (@Pc(188) int local188 = 0; local188 < 256; local188++) {
				if (local188 != 32 && local188 != 160) {
					for (local153 = 0; local153 < 256; local153++) {
						if (local153 != 32 && local153 != 160) {
							this.aByteArrayArray12[local188][local153] = (byte) Static101.method1650(local188, local153, this.aByteArray49, local73, local138, local90, local54);
						}
					}
				}
			}
			this.anInt3684 = local54[32] + local73[32];
		} else {
			this.anInt3684 = local8.method6041();
		}
		local8.method6041();
		local8.method6041();
		this.anInt3688 = local8.method6041();
		this.anInt3689 = local8.method6041();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;[Lclient!xa;I)I")
	public int method3169(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class4[] arg2) {
		@Pc(18) int local18 = this.method3172(arg1, Static238.aStringArray17, arg2, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method3174(arg2, Static238.aStringArray17[local22]);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!xa;B)Ljava/lang/String;")
	public String method3171(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4[] arg2) {
		if (this.method3174(arg2, arg0) <= arg1) {
			return arg0;
		}
		@Pc(26) int local26 = arg1 - this.method3174(null, "...");
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = arg0.length();
		@Pc(45) String local45 = "";
		for (@Pc(47) int local47 = 0; local47 < local43; local47++) {
			@Pc(53) char local53 = arg0.charAt(local47);
			if (local53 == '<') {
				local36 = local47;
			} else {
				if (local53 == '>' && local36 != -1) {
					@Pc(77) String local77 = arg0.substring(local36 + 1, local47);
					local36 = -1;
					if (local77.equals("lt")) {
						local53 = '<';
					} else if (local77.equals("gt")) {
						local53 = '>';
					} else if (local77.equals("nbsp")) {
						local53 = ' ';
					} else if (local77.equals("shy")) {
						local53 = '\u00ad';
					} else if (local77.equals("times")) {
						local53 = '×';
					} else if (local77.equals("euro")) {
						local53 = '€';
					} else if (local77.equals("copy")) {
						local53 = '©';
					} else {
						if (!local77.equals("reg")) {
							if (local77.startsWith("img=") && arg2 != null) {
								try {
									@Pc(135) int local135 = Static467.method6543(local77.substring(4));
									local38 = -1;
									local40 += arg2[local135].AA();
									if (local40 > local26) {
										return local45 + "...";
									}
									local45 = arg0.substring(0, local47 + 1);
								} catch (@Pc(169) Exception local169) {
								}
							}
							continue;
						}
						local53 = '®';
					}
				}
				if (local36 == -1) {
					local40 += this.aByteArray49[Static176.method2702(local53) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local38 != -1) {
						local40 += this.aByteArrayArray12[local38][local53];
					}
					local38 = local53;
					@Pc(225) int local225 = local40;
					if (this.aByteArrayArray12 != null) {
						local225 = local40 + this.aByteArrayArray12[local53][46];
					}
					if (local26 < local225) {
						return local45 + "...";
					}
					local45 = arg0.substring(0, local47 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[Lclient!xa;[II)I")
	public int method3172(@OriginalArg(0) String arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) Class4[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(49) int local49 = Static176.method2702(arg0.charAt(local39)) & 0xFF;
			@Pc(51) int local51 = 0;
			if (local49 == 60) {
				local21 = local39;
			} else {
				@Pc(69) int local69;
				if (local21 == -1) {
					local69 = local39;
					local51 = this.method3178(local49);
					if (this.aByteArrayArray12 != null && local32 != -1) {
						local51 += this.aByteArrayArray12[local32][local49];
					}
					local32 = local49;
				} else {
					if (local49 != 62) {
						continue;
					}
					local69 = local21;
					@Pc(76) String local76 = arg0.substring(local21 + 1, local39);
					local21 = -1;
					if (local76.equals("br")) {
						arg1[local34] = arg0.substring(local13, local39 + 1);
						local34++;
						if (arg1.length <= local34) {
							return 0;
						}
						local11 = 0;
						local15 = -1;
						local13 = local39 + 1;
						local32 = -1;
						continue;
					}
					if (local76.equals("lt")) {
						local51 = this.method3178(60);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][60];
						}
						local32 = 60;
					} else if (local76.equals("gt")) {
						local51 = this.method3178(62);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][62];
						}
						local32 = 62;
					} else if (local76.equals("nbsp")) {
						local51 = this.method3178(160);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][160];
						}
						local32 = 160;
					} else if (local76.equals("shy")) {
						local51 = this.method3178(173);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][173];
						}
						local32 = 173;
					} else if (local76.equals("times")) {
						local51 = this.method3178(215);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][215];
						}
						local32 = 215;
					} else if (local76.equals("euro")) {
						local51 = this.method3178(8364);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][8364];
						}
						local32 = 8364;
					} else if (local76.equals("copy")) {
						local51 = this.method3178(169);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][169];
						}
						local32 = 169;
					} else if (local76.equals("reg")) {
						local51 = this.method3178(174);
						if (this.aByteArrayArray12 != null && local32 != -1) {
							local51 += this.aByteArrayArray12[local32][174];
						}
						local32 = 174;
					} else if (local76.startsWith("img=") && arg2 != null) {
						try {
							@Pc(230) int local230 = Static467.method6543(local76.substring(4));
							local51 = arg2[local230].AA();
							local32 = -1;
						} catch (@Pc(241) Exception local241) {
						}
					}
					local49 = -1;
				}
				if (local51 > 0) {
					local11 += local51;
					if (arg3 != null) {
						if (local49 == 32) {
							local17 = local11;
							local19 = 1;
							local15 = local39;
						}
						if (arg3[arg3.length > local34 ? local34 : arg3.length - 1] < local11) {
							if (local15 < 0) {
								arg1[local34] = arg0.substring(local13, local69);
								local34++;
								if (local34 >= arg1.length) {
									return 0;
								}
								local15 = -1;
								local32 = -1;
								local13 = local69;
								local11 = local51;
							} else {
								arg1[local34] = arg0.substring(local13, local15 + 1 - local19);
								local34++;
								if (arg1.length <= local34) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local32 = -1;
								local15 = -1;
							}
						}
						if (local49 == 45) {
							local15 = local39;
							local17 = local11;
							local19 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg1[local34] = arg0.substring(local13, arg0.length());
			local34++;
		}
		return local34;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3173(@OriginalArg(1) String arg0) {
		return this.method3174(null, arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([Lclient!xa;BLjava/lang/String;)I")
	public int method3174(@OriginalArg(0) Class4[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) char local26 = arg1.charAt(local20);
			if (local26 == '<') {
				local11 = local20;
			} else {
				if (local26 == '>' && local11 != -1) {
					@Pc(49) String local49 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local49.equals("lt")) {
						local26 = '<';
					} else if (local49.equals("gt")) {
						local26 = '>';
					} else if (local49.equals("nbsp")) {
						local26 = ' ';
					} else if (local49.equals("shy")) {
						local26 = '\u00ad';
					} else if (local49.equals("times")) {
						local26 = '×';
					} else if (local49.equals("euro")) {
						local26 = '€';
					} else if (local49.equals("copy")) {
						local26 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=") && arg0 != null) {
								try {
									@Pc(117) int local117 = Static467.method6543(local49.substring(4));
									local15 += arg0[local117].AA();
									local13 = -1;
								} catch (@Pc(128) Exception local128) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray49[Static176.method2702(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local13 != -1) {
						local15 += this.aByteArrayArray12[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;[Lclient!xa;ZI)I")
	public int method3175(@OriginalArg(0) String arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(3) int arg2) {
		return this.method3172(arg0, Static238.aStringArray17, arg1, new int[] { arg2 });
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BII[Lclient!xa;Ljava/lang/String;)I")
	public int method3176(@OriginalArg(3) Class4[] arg0, @OriginalArg(4) String arg1) {
		@Pc(7) int local7 = this.anInt3684;
		@Pc(32) int local32 = this.method3172(arg1, Static238.aStringArray17, arg0, new int[] { 100 });
		@Pc(38) int local38 = local7 * (local32 - 1);
		return this.anInt3689 + local38 + this.anInt3688;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(CII)I")
	public int method3177(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray12 == null ? 0 : this.aByteArrayArray12[arg1][arg0];
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)I")
	public int method3178(@OriginalArg(0) int arg0) {
		return this.aByteArray49[arg0] & 0xFF;
	}
}
