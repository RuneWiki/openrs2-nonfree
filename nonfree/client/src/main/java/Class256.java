import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class256 {

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "[B")
	private final byte[] aByteArray103;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	public final int anInt7544;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray39;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public final int anInt7541;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public final int anInt7540;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([B)V")
	public Class256(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub3 local8 = new Class5_Sub3(arg0);
		@Pc(12) int local12 = local8.method4220();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method4220() == 1;
		this.aByteArray103 = new byte[256];
		local8.method4177(this.aByteArray103, 256);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local53[local58] = local8.method4220();
			}
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local56[local74] = local8.method4220();
			}
			@Pc(91) byte[][] local91 = new byte[256][];
			@Pc(106) int local106;
			for (@Pc(93) int local93 = 0; local93 < 256; local93++) {
				local91[local93] = new byte[local53[local93]];
				@Pc(104) byte local104 = 0;
				for (local106 = 0; local106 < local91[local93].length; local106++) {
					local104 += local8.method4196();
					local91[local93][local106] = local104;
				}
			}
			@Pc(135) byte[][] local135 = new byte[256][];
			@Pc(150) int local150;
			for (local106 = 0; local106 < 256; local106++) {
				local135[local106] = new byte[local53[local106]];
				@Pc(148) byte local148 = 0;
				for (local150 = 0; local150 < local135[local106].length; local150++) {
					local148 += local8.method4196();
					local135[local106][local150] = local148;
				}
			}
			this.aByteArrayArray39 = new byte[256][256];
			for (@Pc(187) int local187 = 0; local187 < 256; local187++) {
				if (local187 != 32 && local187 != 160) {
					for (local150 = 0; local150 < 256; local150++) {
						if (local150 != 32 && local150 != 160) {
							this.aByteArrayArray39[local187][local150] = (byte) Static226.method4331(this.aByteArray103, local56, local187, local91, local150, local135, local53);
						}
					}
				}
			}
			this.anInt7544 = local56[32] + local53[32];
		} else {
			this.anInt7544 = local8.method4220();
		}
		local8.method4220();
		local8.method4220();
		this.anInt7541 = local8.method4220();
		this.anInt7540 = local8.method4220();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!ha;I)I")
	public int method6110(@OriginalArg(0) String arg0, @OriginalArg(2) Class25[] arg1, @OriginalArg(3) int arg2) {
		return this.method6122(arg0, arg1, new int[] { arg2 }, Static35.aStringArray10);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lclient!ha;Ljava/lang/String;II)I")
	public int method6112(@OriginalArg(0) Class25[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method6122(arg1, arg0, new int[] { arg2 }, Static35.aStringArray10);
		@Pc(20) int local20 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method6116(arg0, Static35.aStringArray10[local27]);
			if (local20 < local37) {
				local20 = local37;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method6113(@OriginalArg(1) String arg0) {
		return this.method6116(null, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lclient!ha;Ljava/lang/String;I)I")
	public int method6116(@OriginalArg(0) Class25[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) char local34 = arg1.charAt(local28);
			if (local34 == '<') {
				local11 = local28;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(57) String local57 = arg1.substring(local11 + 1, local28);
					local11 = -1;
					if (local57.equals("lt")) {
						local34 = '<';
					} else if (local57.equals("gt")) {
						local34 = '>';
					} else if (local57.equals("nbsp")) {
						local34 = ' ';
					} else if (local57.equals("shy")) {
						local34 = '\u00ad';
					} else if (local57.equals("times")) {
						local34 = '×';
					} else if (local57.equals("euro")) {
						local34 = '€';
					} else if (local57.equals("copy")) {
						local34 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=") && arg0 != null) {
								try {
									@Pc(121) int local121 = Static412.method5992(local57.substring(4));
									local15 += arg0[local121].EA();
									local13 = -1;
								} catch (@Pc(132) Exception local132) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray103[Static410.method5971(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray39 != null && local13 != -1) {
						local15 += this.aByteArrayArray39[local13][local34];
					}
					local13 = local34;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;IB[Lclient!ha;)Ljava/lang/String;")
	public String method6117(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class25[] arg2) {
		if (arg1 >= this.method6116(arg2, arg0)) {
			return arg0;
		}
		@Pc(22) int local22 = arg1 - this.method6116(null, "...");
		@Pc(24) int local24 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		@Pc(38) String local38 = "";
		for (@Pc(40) int local40 = 0; local40 < local36; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local46 == '<') {
				local24 = local40;
			} else {
				if (local46 == '>' && local24 != -1) {
					@Pc(70) String local70 = arg0.substring(local24 + 1, local40);
					local24 = -1;
					if (local70.equals("lt")) {
						local46 = '<';
					} else if (local70.equals("gt")) {
						local46 = '>';
					} else if (local70.equals("nbsp")) {
						local46 = ' ';
					} else if (local70.equals("shy")) {
						local46 = '\u00ad';
					} else if (local70.equals("times")) {
						local46 = '×';
					} else if (local70.equals("euro")) {
						local46 = '€';
					} else if (local70.equals("copy")) {
						local46 = '©';
					} else {
						if (!local70.equals("reg")) {
							if (local70.startsWith("img=") && arg2 != null) {
								try {
									@Pc(130) int local130 = Static412.method5992(local70.substring(4));
									local31 = -1;
									local33 += arg2[local130].EA();
									if (local22 < local33) {
										return local38 + "...";
									}
									local38 = arg0.substring(0, local40 + 1);
								} catch (@Pc(160) Exception local160) {
								}
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local24 == -1) {
					local33 += this.aByteArray103[Static410.method5971(local46) & 0xFF] & 0xFF;
					if (this.aByteArrayArray39 != null && local31 != -1) {
						local33 += this.aByteArrayArray39[local31][local46];
					}
					local31 = local46;
					@Pc(216) int local216 = local33;
					if (this.aByteArrayArray39 != null) {
						local216 = local33 + this.aByteArrayArray39[local46][46];
					}
					if (local22 < local216) {
						return local38 + "...";
					}
					local38 = arg0.substring(0, local40 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lclient!ha;ILjava/lang/String;II)I")
	public int method6120(@OriginalArg(0) Class25[] arg0, @OriginalArg(2) String arg1) {
		@Pc(11) int local11 = this.anInt7544;
		@Pc(32) int local32 = this.method6122(arg1, arg0, new int[] { 100 }, Static35.aStringArray10);
		@Pc(38) int local38 = (local32 - 1) * local11;
		return this.anInt7540 + this.anInt7541 + local38;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)I")
	public int method6121(@OriginalArg(0) int arg0) {
		return this.aByteArray103[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!ha;[I[Ljava/lang/String;)I")
	public int method6122(@OriginalArg(0) String arg0, @OriginalArg(2) Class25[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(25) byte local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static410.method5971(arg0.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local27 = local36;
			} else {
				@Pc(68) int local68;
				if (local27 == -1) {
					local48 = this.method6121(local46);
					local68 = local36;
					if (this.aByteArrayArray39 != null && local29 != -1) {
						local48 += this.aByteArrayArray39[local29][local46];
					}
					local29 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local68 = local27;
					@Pc(75) String local75 = arg0.substring(local27 + 1, local36);
					local27 = -1;
					if (local75.equals("br")) {
						arg3[local31] = arg0.substring(local19, local36 + 1);
						local31++;
						if (local31 >= arg3.length) {
							return 0;
						}
						local17 = 0;
						local29 = -1;
						local21 = -1;
						local19 = local36 + 1;
						continue;
					}
					if (local75.equals("lt")) {
						local48 = this.method6121(60);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][60];
						}
						local29 = 60;
					} else if (local75.equals("gt")) {
						local48 = this.method6121(62);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][62];
						}
						local29 = 62;
					} else if (local75.equals("nbsp")) {
						local48 = this.method6121(160);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][160];
						}
						local29 = 160;
					} else if (local75.equals("shy")) {
						local48 = this.method6121(173);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][173];
						}
						local29 = 173;
					} else if (local75.equals("times")) {
						local48 = this.method6121(215);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][215];
						}
						local29 = 215;
					} else if (local75.equals("euro")) {
						local48 = this.method6121(8364);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][8364];
						}
						local29 = 8364;
					} else if (local75.equals("copy")) {
						local48 = this.method6121(169);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][169];
						}
						local29 = 169;
					} else if (local75.equals("reg")) {
						local48 = this.method6121(174);
						if (this.aByteArrayArray39 != null && local29 != -1) {
							local48 += this.aByteArrayArray39[local29][174];
						}
						local29 = 174;
					} else if (local75.startsWith("img=") && arg1 != null) {
						try {
							@Pc(178) int local178 = Static412.method5992(local75.substring(4));
							local48 = arg1[local178].EA();
							local29 = -1;
						} catch (@Pc(189) Exception local189) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local17 += local48;
					if (arg2 != null) {
						if (local46 == 32) {
							local21 = local36;
							local23 = local17;
							local25 = 1;
						}
						if (local17 > arg2[arg2.length <= local31 ? arg2.length - 1 : local31]) {
							if (local21 < 0) {
								arg3[local31] = arg0.substring(local19, local68);
								local31++;
								if (arg3.length <= local31) {
									return 0;
								}
								local17 = local48;
								local19 = local68;
								local21 = -1;
								local29 = -1;
							} else {
								arg3[local31] = arg0.substring(local19, local21 + 1 - local25);
								local31++;
								if (arg3.length <= local31) {
									return 0;
								}
								local19 = local21 + 1;
								local21 = -1;
								local29 = -1;
								local17 -= local23;
							}
						}
						if (local46 == 45) {
							local25 = 0;
							local23 = local17;
							local21 = local36;
						}
					}
				}
			}
		}
		if (arg0.length() > local19) {
			arg3[local31] = arg0.substring(local19, arg0.length());
			local31++;
		}
		return local31;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(CII)I")
	public int method6124(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray39 == null ? 0 : this.aByteArrayArray39[arg1][arg0];
	}
}
