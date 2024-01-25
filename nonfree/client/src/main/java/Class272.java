import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class272 {

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "[B")
	private final byte[] aByteArray73;

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
	public final int anInt7410;

	@OriginalMember(owner = "client!pia", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
	public final int anInt7414;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "I")
	public final int anInt7417;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "([B)V")
	public Class272(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub22 local8 = new Class5_Sub22(arg0);
		@Pc(12) int local12 = local8.method5966();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method5966() == 1;
		this.aByteArray73 = new byte[256];
		local8.method5915(0, 256, this.aByteArray73);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method5966();
			}
			@Pc(70) int[] local70 = new int[256];
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local70[local72] = local8.method5966();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local53[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method5963();
					local89[local91][local104] = local102;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local104 = 0; local104 < 256; local104++) {
				local133[local104] = new byte[local53[local104]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local104].length; local148++) {
					local146 += local8.method5963();
					local133[local104][local148] = local146;
				}
			}
			this.aByteArrayArray17 = new byte[256][256];
			for (@Pc(185) int local185 = 0; local185 < 256; local185++) {
				if (local185 != 32 && local185 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray17[local185][local148] = (byte) Static383.method5615(this.aByteArray73, local185, local148, local133, local53, local89, local70);
						}
					}
				}
			}
			this.anInt7410 = local70[32] + local53[32];
		} else {
			this.anInt7410 = local8.method5966();
		}
		local8.method5966();
		local8.method5966();
		this.anInt7414 = local8.method5966();
		this.anInt7417 = local8.method5966();
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!it;)I")
	public int method6566(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28[] arg2) {
		@Pc(18) int local18 = this.method6571(new int[] { arg1 }, arg2, arg0, Static512.aStringArray69);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method6568(arg2, Static512.aStringArray69[local22]);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "([Lclient!it;Ljava/lang/String;I)I")
	public int method6568(@OriginalArg(0) Class28[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg1.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(36) char local36 = arg1.charAt(local30);
			if (local36 == '<') {
				local21 = local30;
			} else {
				if (local36 == '>' && local21 != -1) {
					@Pc(60) String local60 = arg1.substring(local21 + 1, local30);
					local21 = -1;
					if (local60.equals("lt")) {
						local36 = '<';
					} else if (local60.equals("gt")) {
						local36 = '>';
					} else if (local60.equals("nbsp")) {
						local36 = ' ';
					} else if (local60.equals("shy")) {
						local36 = '\u00ad';
					} else if (local60.equals("times")) {
						local36 = '×';
					} else if (local60.equals("euro")) {
						local36 = '€';
					} else if (local60.equals("copy")) {
						local36 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=") && arg0 != null) {
								try {
									@Pc(124) int local124 = Static548.method7986(local60.substring(4));
									local25 += arg0[local124].method4035();
									local23 = -1;
								} catch (@Pc(135) Exception local135) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local21 == -1) {
					local25 += this.aByteArray73[Static573.method2156(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray17 != null && local23 != -1) {
						local25 += this.aByteArrayArray17[local23][local36];
					}
					local23 = local36;
				}
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZ)I")
	public int method6569(@OriginalArg(0) int arg0) {
		return this.aByteArray73[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method6570(@OriginalArg(0) String arg0) {
		return this.method6568(null, arg0);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "([II[Lclient!it;Ljava/lang/String;[Ljava/lang/String;)I")
	public int method6571(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class28[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static573.method2156(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(66) int local66;
				if (local26 == -1) {
					local66 = local35;
					local47 = this.method6569(local45);
					if (this.aByteArrayArray17 != null && local28 != -1) {
						local47 += this.aByteArrayArray17[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local66 = local26;
					@Pc(73) String local73 = arg2.substring(local26 + 1, local35);
					local26 = -1;
					if (local73.equals("br")) {
						arg3[local30] = arg2.substring(local13, local35 + 1);
						local30++;
						if (arg3.length <= local30) {
							return 0;
						}
						local28 = -1;
						local11 = 0;
						local15 = -1;
						local13 = local35 + 1;
						continue;
					}
					if (local73.equals("lt")) {
						local47 = this.method6569(60);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][60];
						}
						local28 = 60;
					} else if (local73.equals("gt")) {
						local47 = this.method6569(62);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][62];
						}
						local28 = 62;
					} else if (local73.equals("nbsp")) {
						local47 = this.method6569(160);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][160];
						}
						local28 = 160;
					} else if (local73.equals("shy")) {
						local47 = this.method6569(173);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][173];
						}
						local28 = 173;
					} else if (local73.equals("times")) {
						local47 = this.method6569(215);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][215];
						}
						local28 = 215;
					} else if (local73.equals("euro")) {
						local47 = this.method6569(8364);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][8364];
						}
						local28 = 8364;
					} else if (local73.equals("copy")) {
						local47 = this.method6569(169);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][169];
						}
						local28 = 169;
					} else if (local73.equals("reg")) {
						local47 = this.method6569(174);
						if (this.aByteArrayArray17 != null && local28 != -1) {
							local47 += this.aByteArrayArray17[local28][174];
						}
						local28 = 174;
					} else if (local73.startsWith("img=") && arg1 != null) {
						try {
							@Pc(228) int local228 = Static548.method7986(local73.substring(4));
							local47 = arg1[local228].method4035();
							local28 = -1;
						} catch (@Pc(239) Exception local239) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local19 = 1;
							local15 = local35;
							local17 = local11;
						}
						if (local11 > arg0[arg0.length <= local30 ? arg0.length - 1 : local30]) {
							if (local15 >= 0) {
								arg3[local30] = arg2.substring(local13, local15 + 1 - local19);
								local30++;
								if (local30 >= arg3.length) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local28 = -1;
								local15 = -1;
							} else {
								arg3[local30] = arg2.substring(local13, local66);
								local30++;
								if (local30 >= arg3.length) {
									return 0;
								}
								local13 = local66;
								local15 = -1;
								local28 = -1;
								local11 = local47;
							}
						}
						if (local45 == 45) {
							local15 = local35;
							local19 = 0;
							local17 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg2.length()) {
			arg3[local30] = arg2.substring(local13, arg2.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I[Lclient!it;ILjava/lang/String;I)I")
	public int method6572(@OriginalArg(0) int arg0, @OriginalArg(1) Class28[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt7410;
		}
		@Pc(21) int local21 = this.method6571(new int[] { arg3 }, arg1, arg2, Static512.aStringArray69);
		@Pc(38) int local38 = arg0 * (local21 - 1);
		return this.anInt7417 + local38 + this.anInt7414;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IILjava/lang/String;[Lclient!it;)Ljava/lang/String;")
	public String method6573(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class28[] arg2) {
		if (arg0 >= this.method6568(arg2, arg1)) {
			return arg1;
		}
		@Pc(26) int local26 = arg0 - this.method6568(null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg1.length();
		@Pc(46) String local46 = "";
		for (@Pc(48) int local48 = 0; local48 < local44; local48++) {
			@Pc(54) char local54 = arg1.charAt(local48);
			if (local54 == '<') {
				local28 = local48;
			} else {
				if (local54 == '>' && local28 != -1) {
					@Pc(75) String local75 = arg1.substring(local28 + 1, local48);
					local28 = -1;
					if (local75.equals("lt")) {
						local54 = '<';
					} else if (local75.equals("gt")) {
						local54 = '>';
					} else if (local75.equals("nbsp")) {
						local54 = ' ';
					} else if (local75.equals("shy")) {
						local54 = '\u00ad';
					} else if (local75.equals("times")) {
						local54 = '×';
					} else if (local75.equals("euro")) {
						local54 = '€';
					} else if (local75.equals("copy")) {
						local54 = '©';
					} else {
						if (!local75.equals("reg")) {
							if (local75.startsWith("img=") && arg2 != null) {
								try {
									@Pc(147) int local147 = Static548.method7986(local75.substring(4));
									local30 = -1;
									local41 += arg2[local147].method4035();
									if (local26 < local41) {
										return local46 + "...";
									}
									local46 = arg1.substring(0, local48 + 1);
								} catch (@Pc(177) Exception local177) {
								}
							}
							continue;
						}
						local54 = '®';
					}
				}
				if (local28 == -1) {
					local41 += this.aByteArray73[Static573.method2156(local54) & 0xFF] & 0xFF;
					if (this.aByteArrayArray17 != null && local30 != -1) {
						local41 += this.aByteArrayArray17[local30][local54];
					}
					local30 = local54;
					@Pc(222) int local222 = local41;
					if (this.aByteArrayArray17 != null) {
						local222 = local41 + this.aByteArrayArray17[local54][46];
					}
					if (local222 > local26) {
						return local46 + "...";
					}
					local46 = arg1.substring(0, local48 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ICI)I")
	public int method6575(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray17 == null ? 0 : this.aByteArrayArray17[arg1][arg0];
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILjava/lang/String;B[Lclient!it;)I")
	public int method6576(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class28[] arg2) {
		return this.method6571(new int[] { arg0 }, arg2, arg1, Static512.aStringArray69);
	}
}
