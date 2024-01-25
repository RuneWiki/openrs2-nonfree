import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class315 {

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
	public final int anInt9184;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
	public final int anInt9174;

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
	public final int anInt9180;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "([B)V")
	public Class315(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub15 local8 = new Class3_Sub15(arg0);
		@Pc(12) int local12 = local8.method8401();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method8401() == 1;
		this.aByteArray92 = new byte[256];
		local8.method8403(256, 0, this.aByteArray92);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
				local46[local48] = local8.method8401();
			}
			@Pc(65) int[] local65 = new int[256];
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local65[local67] = local8.method8401();
			}
			@Pc(84) byte[][] local84 = new byte[256][];
			@Pc(99) int local99;
			for (@Pc(86) int local86 = 0; local86 < 256; local86++) {
				local84[local86] = new byte[local46[local86]];
				@Pc(97) byte local97 = 0;
				for (local99 = 0; local99 < local84[local86].length; local99++) {
					local97 += local8.method8440();
					local84[local86][local99] = local97;
				}
			}
			@Pc(134) byte[][] local134 = new byte[256][];
			@Pc(149) int local149;
			for (local99 = 0; local99 < 256; local99++) {
				local134[local99] = new byte[local46[local99]];
				@Pc(147) byte local147 = 0;
				for (local149 = 0; local149 < local134[local99].length; local149++) {
					local147 += local8.method8440();
					local134[local99][local149] = local147;
				}
			}
			this.aByteArrayArray23 = new byte[256][256];
			for (@Pc(188) int local188 = 0; local188 < 256; local188++) {
				if (local188 != 32 && local188 != 160) {
					for (local149 = 0; local149 < 256; local149++) {
						if (local149 != 32 && local149 != 160) {
							this.aByteArrayArray23[local188][local149] = (byte) Static65.method1479(local149, this.aByteArray92, local84, local188, local46, local134, local65);
						}
					}
				}
			}
			this.anInt9184 = local46[32] + local65[32];
		} else {
			this.anInt9184 = local8.method8401();
		}
		local8.method8401();
		local8.method8401();
		this.anInt9174 = local8.method8401();
		this.anInt9180 = local8.method8401();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B[Lclient!ac;Ljava/lang/String;)I")
	public int method7564(@OriginalArg(1) Class5[] arg0, @OriginalArg(2) String arg1) {
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
					@Pc(47) String local47 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local47.equals("lt")) {
						local26 = '<';
					} else if (local47.equals("gt")) {
						local26 = '>';
					} else if (local47.equals("nbsp")) {
						local26 = ' ';
					} else if (local47.equals("shy")) {
						local26 = '\u00ad';
					} else if (local47.equals("times")) {
						local26 = '×';
					} else if (local47.equals("euro")) {
						local26 = '€';
					} else if (local47.equals("copy")) {
						local26 = '©';
					} else {
						if (!local47.equals("reg")) {
							if (local47.startsWith("img=") && arg0 != null) {
								try {
									@Pc(119) int local119 = Static607.method8246(local47.substring(4));
									local13 = -1;
									local15 += arg0[local119].method7589();
								} catch (@Pc(130) Exception local130) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray92[Static306.method5197(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local13 != -1) {
						local15 += this.aByteArrayArray23[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ac;IB)Ljava/lang/String;")
	public String method7565(@OriginalArg(0) String arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= this.method7564(arg1, arg0)) {
			return arg0;
		}
		@Pc(27) int local27 = arg2 - this.method7564(null, "...");
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		@Pc(38) String local38 = "";
		for (@Pc(40) int local40 = 0; local40 < local36; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local46 == '<') {
				local29 = local40;
			} else {
				if (local46 == '>' && local29 != -1) {
					@Pc(69) String local69 = arg0.substring(local29 + 1, local40);
					local29 = -1;
					if (local69.equals("lt")) {
						local46 = '<';
					} else if (local69.equals("gt")) {
						local46 = '>';
					} else if (local69.equals("nbsp")) {
						local46 = ' ';
					} else if (local69.equals("shy")) {
						local46 = '\u00ad';
					} else if (local69.equals("times")) {
						local46 = '×';
					} else if (local69.equals("euro")) {
						local46 = '€';
					} else if (local69.equals("copy")) {
						local46 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=") && arg1 != null) {
								try {
									@Pc(127) int local127 = Static607.method8246(local69.substring(4));
									local31 = -1;
									local33 += arg1[local127].method7589();
									if (local33 > local27) {
										return local38 + "...";
									}
									local38 = arg0.substring(0, local40 + 1);
								} catch (@Pc(157) Exception local157) {
								}
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local29 == -1) {
					local33 += this.aByteArray92[Static306.method5197(local46) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local31 != -1) {
						local33 += this.aByteArrayArray23[local31][local46];
					}
					local31 = local46;
					@Pc(217) int local217 = local33;
					if (this.aByteArrayArray23 != null) {
						local217 = local33 + this.aByteArrayArray23[local46][46];
					}
					if (local217 > local27) {
						return local38 + "...";
					}
					local38 = arg0.substring(0, local40 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "([Lclient!ac;BILjava/lang/String;)I")
	public int method7566(@OriginalArg(0) Class5[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method7573(arg0, new int[] { arg1 }, Static212.aStringArray38, arg2);
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method7564(arg0, Static212.aStringArray38[local27]);
			if (local25 < local37) {
				local25 = local37;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(CII)I")
	public int method7567(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg1][arg0];
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!ac;)I")
	public int method7568(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class5[] arg2) {
		return this.method7573(arg2, new int[] { arg0 }, Static212.aStringArray38, arg1);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "([Lclient!ac;Ljava/lang/String;IBI)I")
	public int method7569(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt9184;
		}
		@Pc(26) int local26 = this.method7573(arg0, new int[] { arg2 }, Static212.aStringArray38, arg1);
		@Pc(32) int local32 = arg3 * (local26 - 1);
		return this.anInt9180 + local32 + this.anInt9174;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)I")
	public int method7570(@OriginalArg(1) int arg0) {
		return this.aByteArray92[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method7572(@OriginalArg(1) String arg0) {
		return this.method7564(null, arg0);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B[Lclient!ac;[I[Ljava/lang/String;Ljava/lang/String;)I")
	public int method7573(@OriginalArg(1) Class5[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(30) byte local30 = 0;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg3.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(51) int local51 = Static306.method5197(arg3.charAt(local41)) & 0xFF;
			@Pc(53) int local53 = 0;
			if (local51 == 60) {
				local32 = local41;
			} else {
				@Pc(68) int local68;
				if (local32 == -1) {
					local53 = this.method7570(local51);
					local68 = local41;
					if (this.aByteArrayArray23 != null && local34 != -1) {
						local53 += this.aByteArrayArray23[local34][local51];
					}
					local34 = local51;
				} else {
					if (local51 != 62) {
						continue;
					}
					local68 = local32;
					@Pc(75) String local75 = arg3.substring(local32 + 1, local41);
					local32 = -1;
					if (local75.equals("br")) {
						arg2[local36] = arg3.substring(local13, local41 + 1);
						local36++;
						if (local36 >= arg2.length) {
							return 0;
						}
						local13 = local41 + 1;
						local34 = -1;
						local26 = -1;
						local11 = 0;
						continue;
					}
					if (local75.equals("lt")) {
						local53 = this.method7570(60);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][60];
						}
						local34 = 60;
					} else if (local75.equals("gt")) {
						local53 = this.method7570(62);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][62];
						}
						local34 = 62;
					} else if (local75.equals("nbsp")) {
						local53 = this.method7570(160);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][160];
						}
						local34 = 160;
					} else if (local75.equals("shy")) {
						local53 = this.method7570(173);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][173];
						}
						local34 = 173;
					} else if (local75.equals("times")) {
						local53 = this.method7570(215);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][215];
						}
						local34 = 215;
					} else if (local75.equals("euro")) {
						local53 = this.method7570(8364);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][8364];
						}
						local34 = 8364;
					} else if (local75.equals("copy")) {
						local53 = this.method7570(169);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][169];
						}
						local34 = 169;
					} else if (local75.equals("reg")) {
						local53 = this.method7570(174);
						if (this.aByteArrayArray23 != null && local34 != -1) {
							local53 += this.aByteArrayArray23[local34][174];
						}
						local34 = 174;
					} else if (local75.startsWith("img=") && arg0 != null) {
						try {
							@Pc(178) int local178 = Static607.method8246(local75.substring(4));
							local53 = arg0[local178].method7589();
							local34 = -1;
						} catch (@Pc(189) Exception local189) {
						}
					}
					local51 = -1;
				}
				if (local53 > 0) {
					local11 += local53;
					if (arg1 != null) {
						if (local51 == 32) {
							local30 = 1;
							local28 = local11;
							local26 = local41;
						}
						if (arg1[arg1.length <= local36 ? arg1.length - 1 : local36] < local11) {
							if (local26 >= 0) {
								arg2[local36] = arg3.substring(local13, local26 + 1 - local30);
								local36++;
								if (arg2.length <= local36) {
									return 0;
								}
								local13 = local26 + 1;
								local26 = -1;
								local34 = -1;
								local11 -= local28;
							} else {
								arg2[local36] = arg3.substring(local13, local68);
								local36++;
								if (arg2.length <= local36) {
									return 0;
								}
								local34 = -1;
								local26 = -1;
								local13 = local68;
								local11 = local53;
							}
						}
						if (local51 == 45) {
							local28 = local11;
							local26 = local41;
							local30 = 0;
						}
					}
				}
			}
		}
		if (local13 < arg3.length()) {
			arg2[local36] = arg3.substring(local13, arg3.length());
			local36++;
		}
		return local36;
	}
}
