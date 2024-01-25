import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class53 {

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public final int anInt822;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public final int anInt817;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public final int anInt811;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
	public Class53(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub15 local8 = new Class6_Sub15(arg0);
		@Pc(12) int local12 = local8.method3030();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(35) boolean local35 = local8.method3030() == 1;
		this.aByteArray8 = new byte[256];
		local8.method3019(256, 0, this.aByteArray8);
		if (local35) {
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local51[local53] = local8.method3030();
			}
			@Pc(72) int[] local72 = new int[256];
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local72[local74] = local8.method3030();
			}
			@Pc(93) byte[][] local93 = new byte[256][];
			@Pc(112) int local112;
			for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
				local93[local95] = new byte[local51[local95]];
				@Pc(110) byte local110 = 0;
				for (local112 = 0; local112 < local93[local95].length; local112++) {
					local110 += local8.method3027();
					local93[local95][local112] = local110;
				}
			}
			@Pc(151) byte[][] local151 = new byte[256][];
			@Pc(168) int local168;
			for (local112 = 0; local112 < 256; local112++) {
				local151[local112] = new byte[local51[local112]];
				@Pc(166) byte local166 = 0;
				for (local168 = 0; local168 < local151[local112].length; local168++) {
					local166 += local8.method3027();
					local151[local112][local168] = local166;
				}
			}
			this.aByteArrayArray23 = new byte[256][256];
			for (@Pc(207) int local207 = 0; local207 < 256; local207++) {
				if (local207 != 32 && local207 != 160) {
					for (local168 = 0; local168 < 256; local168++) {
						if (local168 != 32 && local168 != 160) {
							this.aByteArrayArray23[local207][local168] = (byte) Static330.method5160(local168, local151, this.aByteArray8, local207, local72, local93, local51);
						}
					}
				}
			}
			this.anInt822 = local51[32] + local72[32];
		} else {
			this.anInt822 = local8.method3030();
		}
		local8.method3030();
		local8.method3030();
		this.anInt817 = local8.method3030();
		this.anInt811 = local8.method3030();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!tb;[IZLjava/lang/String;[Ljava/lang/String;)I")
	public int method812(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = 0;
		@Pc(20) byte local20 = 0;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg2.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(52) int local52 = Static438.method6628(arg2.charAt(local40)) & 0xFF;
			@Pc(54) int local54 = 0;
			if (local52 == 60) {
				local31 = local40;
			} else {
				@Pc(75) int local75;
				if (local31 == -1) {
					local75 = local40;
					local54 = this.method813(local52);
					if (this.aByteArrayArray23 != null && local33 != -1) {
						local54 += this.aByteArrayArray23[local33][local52];
					}
					local33 = local52;
				} else {
					if (local52 != 62) {
						continue;
					}
					local75 = local31;
					@Pc(82) String local82 = arg2.substring(local31 + 1, local40);
					local31 = -1;
					if (local82.equals("br")) {
						arg3[local35] = arg2.substring(local14, local40 + 1);
						local35++;
						if (arg3.length <= local35) {
							return 0;
						}
						local12 = 0;
						local16 = -1;
						local14 = local40 + 1;
						local33 = -1;
						continue;
					}
					if (local82.equals("lt")) {
						local54 = this.method813(60);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][60];
						}
						local33 = 60;
					} else if (local82.equals("gt")) {
						local54 = this.method813(62);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][62];
						}
						local33 = 62;
					} else if (local82.equals("nbsp")) {
						local54 = this.method813(160);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][160];
						}
						local33 = 160;
					} else if (local82.equals("shy")) {
						local54 = this.method813(173);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][173];
						}
						local33 = 173;
					} else if (local82.equals("times")) {
						local54 = this.method813(215);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][215];
						}
						local33 = 215;
					} else if (local82.equals("euro")) {
						local54 = this.method813(8364);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][8364];
						}
						local33 = 8364;
					} else if (local82.equals("copy")) {
						local54 = this.method813(169);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][169];
						}
						local33 = 169;
					} else if (local82.equals("reg")) {
						local54 = this.method813(174);
						if (this.aByteArrayArray23 != null && local33 != -1) {
							local54 += this.aByteArrayArray23[local33][174];
						}
						local33 = 174;
					} else if (local82.startsWith("img=") && arg0 != null) {
						try {
							@Pc(316) int local316 = Static543.method7715(local82.substring(4));
							local33 = -1;
							local54 = arg0[local316].method8991();
						} catch (@Pc(327) Exception local327) {
						}
					}
					local52 = -1;
				}
				if (local54 > 0) {
					local12 += local54;
					if (arg1 != null) {
						if (local52 == 32) {
							local20 = 1;
							local16 = local40;
							local18 = local12;
						}
						if (local12 > arg1[local35 >= arg1.length ? arg1.length - 1 : local35]) {
							if (local16 < 0) {
								arg3[local35] = arg2.substring(local14, local75);
								local35++;
								if (local35 >= arg3.length) {
									return 0;
								}
								local16 = -1;
								local12 = local54;
								local33 = -1;
								local14 = local75;
							} else {
								arg3[local35] = arg2.substring(local14, local16 + 1 - local20);
								local35++;
								if (local35 >= arg3.length) {
									return 0;
								}
								local14 = local16 + 1;
								local16 = -1;
								local12 -= local18;
								local33 = -1;
							}
						}
						if (local52 == 45) {
							local20 = 0;
							local16 = local40;
							local18 = local12;
						}
					}
				}
			}
		}
		if (arg2.length() > local14) {
			arg3[local35] = arg2.substring(local14, arg2.length());
			local35++;
		}
		return local35;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I")
	public int method813(@OriginalArg(1) int arg0) {
		return this.aByteArray8[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILjava/lang/String;[Lclient!tb;)I")
	public int method814(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class49[] arg2) {
		@Pc(28) int local28 = this.method812(arg2, new int[] { arg0 }, arg1, Static316.aStringArray27);
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local28; local32++) {
			@Pc(44) int local44 = this.method822(arg2, Static316.aStringArray27[local32]);
			if (local44 > local30) {
				local30 = local44;
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!tb;IBLjava/lang/String;I)I")
	public int method815(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt822;
		}
		@Pc(24) int local24 = this.method812(arg0, new int[] { arg1 }, arg2, Static316.aStringArray27);
		@Pc(30) int local30 = (local24 - 1) * arg3;
		return this.anInt817 + local30 + this.anInt811;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!tb;IILjava/lang/String;)Ljava/lang/String;")
	public String method817(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 >= this.method822(arg0, arg2)) {
			return arg2;
		}
		@Pc(25) int local25 = arg1 - this.method822((Class49[]) null, "...");
		@Pc(27) int local27 = -1;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = arg2.length();
		@Pc(48) String local48 = "";
		for (@Pc(50) int local50 = 0; local50 < local46; local50++) {
			@Pc(58) char local58 = arg2.charAt(local50);
			if (local58 == '<') {
				local27 = local50;
			} else {
				if (local58 == '>' && local27 != -1) {
					@Pc(82) String local82 = arg2.substring(local27 + 1, local50);
					local27 = -1;
					if (local82.equals("lt")) {
						local58 = '<';
					} else if (local82.equals("gt")) {
						local58 = '>';
					} else if (local82.equals("nbsp")) {
						local58 = ' ';
					} else if (local82.equals("shy")) {
						local58 = '\u00ad';
					} else if (local82.equals("times")) {
						local58 = '×';
					} else if (local82.equals("euro")) {
						local58 = '€';
					} else if (local82.equals("copy")) {
						local58 = '©';
					} else {
						if (!local82.equals("reg")) {
							if (local82.startsWith("img=") && arg0 != null) {
								try {
									@Pc(192) int local192 = Static543.method7715(local82.substring(4));
									local43 += arg0[local192].method8991();
									local41 = -1;
									if (local43 > local25) {
										return local48 + "...";
									}
									local48 = arg2.substring(0, local50 + 1);
								} catch (@Pc(229) Exception local229) {
								}
							}
							continue;
						}
						local58 = '®';
					}
				}
				if (local27 == -1) {
					local43 += this.aByteArray8[Static438.method6628(local58) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local41 != -1) {
						local43 += this.aByteArrayArray23[local41][local58];
					}
					local41 = local58;
					@Pc(275) int local275 = local43;
					if (this.aByteArrayArray23 != null) {
						local275 = local43 + this.aByteArrayArray23[local58][46];
					}
					if (local25 < local275) {
						return local48 + "...";
					}
					local48 = arg2.substring(0, local50 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIC)I")
	public int method820(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!tb;ILjava/lang/String;)I")
	public int method822(@OriginalArg(0) Class49[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg1.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(35) char local35 = arg1.charAt(local27);
			if (local35 == '<') {
				local12 = local27;
			} else {
				if (local35 == '>' && local12 != -1) {
					@Pc(60) String local60 = arg1.substring(local12 + 1, local27);
					local12 = -1;
					if (local60.equals("lt")) {
						local35 = '<';
					} else if (local60.equals("gt")) {
						local35 = '>';
					} else if (local60.equals("nbsp")) {
						local35 = ' ';
					} else if (local60.equals("shy")) {
						local35 = '\u00ad';
					} else if (local60.equals("times")) {
						local35 = '×';
					} else if (local60.equals("euro")) {
						local35 = '€';
					} else if (local60.equals("copy")) {
						local35 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=") && arg0 != null) {
								try {
									@Pc(146) int local146 = Static543.method7715(local60.substring(4));
									local22 += arg0[local146].method8991();
									local14 = -1;
								} catch (@Pc(157) Exception local157) {
								}
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local12 == -1) {
					local22 += this.aByteArray8[Static438.method6628(local35) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local14 != -1) {
						local22 += this.aByteArrayArray23[local14][local35];
					}
					local14 = local35;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lclient!tb;Ljava/lang/String;B)I")
	public int method823(@OriginalArg(0) int arg0, @OriginalArg(1) Class49[] arg1, @OriginalArg(2) String arg2) {
		return this.method812(arg1, new int[] { arg0 }, arg2, Static316.aStringArray27);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method824(@OriginalArg(0) String arg0) {
		return this.method822((Class49[]) null, arg0);
	}
}
