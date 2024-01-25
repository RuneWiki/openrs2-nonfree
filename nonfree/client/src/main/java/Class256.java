import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class256 {

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public final int anInt6425;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
	public final int anInt6414;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	public final int anInt6420;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
	public Class256(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		@Pc(12) int local12 = local8.method8547();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method8547() == 1;
		this.aByteArray78 = new byte[256];
		local8.method8502(this.aByteArray78, 0, 256);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local47[local49] = local8.method8547();
			}
			@Pc(64) int[] local64 = new int[256];
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local64[local66] = local8.method8547();
			}
			@Pc(83) byte[][] local83 = new byte[256][];
			@Pc(98) int local98;
			for (@Pc(85) int local85 = 0; local85 < 256; local85++) {
				local83[local85] = new byte[local47[local85]];
				@Pc(96) byte local96 = 0;
				for (local98 = 0; local98 < local83[local85].length; local98++) {
					local96 += local8.method8548();
					local83[local85][local98] = local96;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local98 = 0; local98 < 256; local98++) {
				local133[local98] = new byte[local47[local98]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local98].length; local148++) {
					local146 += local8.method8548();
					local133[local98][local148] = local146;
				}
			}
			this.aByteArrayArray23 = new byte[256][256];
			for (@Pc(187) int local187 = 0; local187 < 256; local187++) {
				if (local187 != 32 && local187 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray23[local187][local148] = (byte) Static636.method8558(local83, local187, this.aByteArray78, local47, local148, local64, local133);
						}
					}
				}
			}
			this.anInt6425 = local64[32] + local47[32];
		} else {
			this.anInt6425 = local8.method8547();
		}
		local8.method8547();
		local8.method8547();
		this.anInt6414 = local8.method8547();
		this.anInt6420 = local8.method8547();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!cw;)I")
	public int method5533(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class61[] arg2) {
		@Pc(18) int local18 = this.method5541(arg1, Static252.aStringArray22, arg2, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method5540(Static252.aStringArray22[local22], arg2);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method5534(@OriginalArg(1) String arg0) {
		return this.method5540(arg0, null);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I")
	public int method5535(@OriginalArg(1) int arg0) {
		return this.aByteArray78[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIBLjava/lang/String;[Lclient!cw;)I")
	public int method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class61[] arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt6425;
		}
		@Pc(32) int local32 = this.method5541(arg2, Static252.aStringArray22, arg3, new int[] { arg1 });
		@Pc(38) int local38 = (local32 - 1) * arg0;
		return this.anInt6420 + local38 + this.anInt6414;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([Lclient!cw;ILjava/lang/String;I)I")
	public int method5537(@OriginalArg(0) Class61[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method5541(arg1, Static252.aStringArray22, arg0, new int[] { arg2 });
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ICI)I")
	public int method5538(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg1][arg0];
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;[Lclient!cw;IB)Ljava/lang/String;")
	public String method5539(@OriginalArg(0) String arg0, @OriginalArg(1) Class61[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= this.method5540(arg0, arg1)) {
			return arg0;
		}
		@Pc(26) int local26 = arg2 - this.method5540("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(73) String local73 = arg0.substring(local28 + 1, local44);
					local28 = -1;
					if (local73.equals("lt")) {
						local50 = '<';
					} else if (local73.equals("gt")) {
						local50 = '>';
					} else if (local73.equals("nbsp")) {
						local50 = ' ';
					} else if (local73.equals("shy")) {
						local50 = '\u00ad';
					} else if (local73.equals("times")) {
						local50 = '×';
					} else if (local73.equals("euro")) {
						local50 = '€';
					} else if (local73.equals("copy")) {
						local50 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=") && arg1 != null) {
								try {
									@Pc(133) int local133 = Static445.method6066(local73.substring(4));
									local37 += arg1[local133].method6446();
									local30 = -1;
									if (local37 > local26) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(167) Exception local167) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local37 += this.aByteArray78[Static373.method5028(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local30 != -1) {
						local37 += this.aByteArrayArray23[local30][local50];
					}
					local30 = local50;
					@Pc(224) int local224 = local37;
					if (this.aByteArrayArray23 != null) {
						local224 = local37 + this.aByteArrayArray23[local50][46];
					}
					if (local26 < local224) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;[Lclient!cw;)I")
	public int method5540(@OriginalArg(1) String arg0, @OriginalArg(2) Class61[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(34) char local34 = arg0.charAt(local20);
			if (local34 == '<') {
				local11 = local20;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(58) String local58 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local58.equals("lt")) {
						local34 = '<';
					} else if (local58.equals("gt")) {
						local34 = '>';
					} else if (local58.equals("nbsp")) {
						local34 = ' ';
					} else if (local58.equals("shy")) {
						local34 = '\u00ad';
					} else if (local58.equals("times")) {
						local34 = '×';
					} else if (local58.equals("euro")) {
						local34 = '€';
					} else if (local58.equals("copy")) {
						local34 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=") && arg1 != null) {
								try {
									@Pc(124) int local124 = Static445.method6066(local58.substring(4));
									local15 += arg1[local124].method6446();
									local13 = -1;
								} catch (@Pc(135) Exception local135) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray78[Static373.method5028(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local13 != -1) {
						local15 += this.aByteArrayArray23[local13][local34];
					}
					local13 = local34;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/String;[Lclient!cw;[I)I")
	public int method5541(@OriginalArg(0) String arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) Class61[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static373.method5028(arg0.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local21 = local36;
			} else {
				@Pc(68) int local68;
				if (local21 == -1) {
					local48 = this.method5535(local46);
					local68 = local36;
					if (this.aByteArrayArray23 != null && local29 != -1) {
						local48 += this.aByteArrayArray23[local29][local46];
					}
					local29 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local68 = local21;
					@Pc(75) String local75 = arg0.substring(local21 + 1, local36);
					local21 = -1;
					if (local75.equals("br")) {
						arg1[local31] = arg0.substring(local13, local36 + 1);
						local31++;
						if (arg1.length <= local31) {
							return 0;
						}
						local29 = -1;
						local15 = -1;
						local11 = 0;
						local13 = local36 + 1;
						continue;
					}
					if (local75.equals("lt")) {
						local48 = this.method5535(60);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][60];
						}
						local29 = 60;
					} else if (local75.equals("gt")) {
						local48 = this.method5535(62);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][62];
						}
						local29 = 62;
					} else if (local75.equals("nbsp")) {
						local48 = this.method5535(160);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][160];
						}
						local29 = 160;
					} else if (local75.equals("shy")) {
						local48 = this.method5535(173);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][173];
						}
						local29 = 173;
					} else if (local75.equals("times")) {
						local48 = this.method5535(215);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][215];
						}
						local29 = 215;
					} else if (local75.equals("euro")) {
						local48 = this.method5535(8364);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][8364];
						}
						local29 = 8364;
					} else if (local75.equals("copy")) {
						local48 = this.method5535(169);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][169];
						}
						local29 = 169;
					} else if (local75.equals("reg")) {
						local48 = this.method5535(174);
						if (this.aByteArrayArray23 != null && local29 != -1) {
							local48 += this.aByteArrayArray23[local29][174];
						}
						local29 = 174;
					} else if (local75.startsWith("img=") && arg2 != null) {
						try {
							@Pc(231) int local231 = Static445.method6066(local75.substring(4));
							local29 = -1;
							local48 = arg2[local231].method6446();
						} catch (@Pc(242) Exception local242) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local11 += local48;
					if (arg3 != null) {
						if (local46 == 32) {
							local19 = 1;
							local15 = local36;
							local17 = local11;
						}
						if (local11 > arg3[arg3.length <= local31 ? arg3.length - 1 : local31]) {
							if (local15 < 0) {
								arg1[local31] = arg0.substring(local13, local68);
								local31++;
								if (arg1.length <= local31) {
									return 0;
								}
								local13 = local68;
								local11 = local48;
								local15 = -1;
								local29 = -1;
							} else {
								arg1[local31] = arg0.substring(local13, local15 + 1 - local19);
								local31++;
								if (local31 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local29 = -1;
								local11 -= local17;
							}
						}
						if (local46 == 45) {
							local17 = local11;
							local15 = local36;
							local19 = 0;
						}
					}
				}
			}
		}
		if (local13 < arg0.length()) {
			arg1[local31] = arg0.substring(local13, arg0.length());
			local31++;
		}
		return local31;
	}
}
