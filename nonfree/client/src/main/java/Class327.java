import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class327 {

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[B")
	private final byte[] aByteArray110;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public final int anInt8788;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[B")
	private byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public final int anInt8785;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	public final int anInt8797;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
	public Class327(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub21 local8 = new Class6_Sub21(arg0);
		@Pc(12) int local12 = local8.method6069();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method6069() == 1;
		this.aByteArray110 = new byte[256];
		local8.method6053(256, this.aByteArray110);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			@Pc(57) int[] local57 = new int[256];
			for (@Pc(59) int local59 = 0; local59 < 256; local59++) {
				local54[local59] = local8.method6069();
			}
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local57[local75] = local8.method6069();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local54[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method6055();
					local92[local94][local107] = local105;
				}
			}
			@Pc(140) byte[][] local140 = new byte[256][];
			@Pc(155) int local155;
			for (local107 = 0; local107 < 256; local107++) {
				local140[local107] = new byte[local54[local107]];
				@Pc(153) byte local153 = 0;
				for (local155 = 0; local155 < local140[local107].length; local155++) {
					local153 += local8.method6055();
					local140[local107][local155] = local153;
				}
			}
			this.aByteArrayArray29 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local155 = 0; local155 < 256; local155++) {
						if (local155 != 32 && local155 != 160) {
							this.aByteArrayArray29[local190][local155] = (byte) Static474.method7125(this.aByteArray110, local57, local54, local92, local190, local140, local155);
						}
					}
				}
			}
			this.anInt8788 = local57[32] + local54[32];
		} else {
			this.anInt8788 = local8.method6069();
		}
		local8.method6069();
		local8.method6069();
		this.anInt8785 = local8.method6069();
		this.anInt8797 = local8.method6069();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/lang/String;[Lclient!xa;I)I")
	public int method7188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class58[] arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt8788;
		}
		@Pc(22) int local22 = this.method7191(arg3, arg2, new int[] { arg1 }, Static9.aStringArray1);
		@Pc(28) int local28 = (local22 - 1) * arg0;
		return this.anInt8785 + local28 + this.anInt8797;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILjava/lang/String;[Lclient!xa;)I")
	public int method7189(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class58[] arg2) {
		@Pc(18) int local18 = this.method7191(arg2, arg1, new int[] { arg0 }, Static9.aStringArray1);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method7198(Static9.aStringArray1[local22], arg2);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIC)I")
	public int method7190(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray29 == null ? 0 : this.aByteArrayArray29[arg0][arg1];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lclient!xa;Ljava/lang/String;[IB[Ljava/lang/String;)I")
	public int method7191(@OriginalArg(0) Class58[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg1.length();
		for (@Pc(38) int local38 = 0; local38 < local28; local38++) {
			@Pc(48) int local48 = Static124.method2555(arg1.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local21 = local38;
			} else {
				@Pc(64) int local64;
				if (local21 == -1) {
					local64 = local38;
					local50 = this.method7197(local48);
					if (this.aByteArrayArray29 != null && local23 != -1) {
						local50 += this.aByteArrayArray29[local23][local48];
					}
					local23 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local64 = local21;
					@Pc(104) String local104 = arg1.substring(local21 + 1, local38);
					local21 = -1;
					if (local104.equals("br")) {
						arg3[local25] = arg1.substring(local13, local38 + 1);
						local25++;
						if (arg3.length <= local25) {
							return 0;
						}
						local13 = local38 + 1;
						local23 = -1;
						local15 = -1;
						local11 = 0;
						continue;
					}
					if (local104.equals("lt")) {
						local50 = this.method7197(60);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][60];
						}
						local23 = 60;
					} else if (local104.equals("gt")) {
						local50 = this.method7197(62);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][62];
						}
						local23 = 62;
					} else if (local104.equals("nbsp")) {
						local50 = this.method7197(160);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][160];
						}
						local23 = 160;
					} else if (local104.equals("shy")) {
						local50 = this.method7197(173);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][173];
						}
						local23 = 173;
					} else if (local104.equals("times")) {
						local50 = this.method7197(215);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][215];
						}
						local23 = 215;
					} else if (local104.equals("euro")) {
						local50 = this.method7197(8364);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][8364];
						}
						local23 = 8364;
					} else if (local104.equals("copy")) {
						local50 = this.method7197(169);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][169];
						}
						local23 = 169;
					} else if (local104.equals("reg")) {
						local50 = this.method7197(174);
						if (this.aByteArrayArray29 != null && local23 != -1) {
							local50 += this.aByteArrayArray29[local23][174];
						}
						local23 = 174;
					} else if (local104.startsWith("img=") && arg0 != null) {
						try {
							@Pc(235) int local235 = Static444.method6313(local104.substring(4));
							local50 = arg0[local235].AA();
							local23 = -1;
						} catch (@Pc(246) Exception local246) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg2 != null) {
						if (local48 == 32) {
							local19 = 1;
							local15 = local38;
							local17 = local11;
						}
						if (arg2[arg2.length > local25 ? local25 : arg2.length - 1] < local11) {
							if (local15 < 0) {
								arg3[local25] = arg1.substring(local13, local64);
								local25++;
								if (arg3.length <= local25) {
									return 0;
								}
								local13 = local64;
								local23 = -1;
								local11 = local50;
								local15 = -1;
							} else {
								arg3[local25] = arg1.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg3.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local11 -= local17;
								local15 = -1;
							}
						}
						if (local48 == 45) {
							local15 = local38;
							local17 = local11;
							local19 = 0;
						}
					}
				}
			}
		}
		if (local13 < arg1.length()) {
			arg3[local25] = arg1.substring(local13, arg1.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/lang/String;[Lclient!xa;I)I")
	public int method7192(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class58[] arg2) {
		return this.method7191(arg2, arg1, new int[] { arg0 }, Static9.aStringArray1);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[Lclient!xa;ILjava/lang/String;)Ljava/lang/String;")
	public String method7194(@OriginalArg(1) Class58[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.method7198(arg2, arg0) <= arg1) {
			return arg2;
		}
		@Pc(26) int local26 = arg1 - this.method7198("...", null);
		@Pc(28) int local28 = -1;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg2.length();
		@Pc(46) String local46 = "";
		for (@Pc(48) int local48 = 0; local48 < local44; local48++) {
			@Pc(54) char local54 = arg2.charAt(local48);
			if (local54 == '<') {
				local28 = local48;
			} else {
				if (local54 == '>' && local28 != -1) {
					@Pc(79) String local79 = arg2.substring(local28 + 1, local48);
					local28 = -1;
					if (local79.equals("lt")) {
						local54 = '<';
					} else if (local79.equals("gt")) {
						local54 = '>';
					} else if (local79.equals("nbsp")) {
						local54 = ' ';
					} else if (local79.equals("shy")) {
						local54 = '\u00ad';
					} else if (local79.equals("times")) {
						local54 = '×';
					} else if (local79.equals("euro")) {
						local54 = '€';
					} else if (local79.equals("copy")) {
						local54 = '©';
					} else {
						if (!local79.equals("reg")) {
							if (local79.startsWith("img=") && arg0 != null) {
								try {
									@Pc(141) int local141 = Static444.method6313(local79.substring(4));
									local39 = -1;
									local41 += arg0[local141].AA();
									if (local26 < local41) {
										return local46 + "...";
									}
									local46 = arg2.substring(0, local48 + 1);
								} catch (@Pc(175) Exception local175) {
								}
							}
							continue;
						}
						local54 = '®';
					}
				}
				if (local28 == -1) {
					local41 += this.aByteArray110[Static124.method2555(local54) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local39 != -1) {
						local41 += this.aByteArrayArray29[local39][local54];
					}
					local39 = local54;
					@Pc(228) int local228 = local41;
					if (this.aByteArrayArray29 != null) {
						local228 = local41 + this.aByteArrayArray29[local54][46];
					}
					if (local26 < local228) {
						return local46 + "...";
					}
					local46 = arg2.substring(0, local48 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method7196(@OriginalArg(0) String arg0) {
		return this.method7198(arg0, null);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public int method7197(@OriginalArg(0) int arg0) {
		return this.aByteArray110[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;[Lclient!xa;B)I")
	public int method7198(@OriginalArg(0) String arg0, @OriginalArg(1) Class58[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) char local34 = arg0.charAt(local28);
			if (local34 == '<') {
				local11 = local28;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(59) String local59 = arg0.substring(local11 + 1, local28);
					local11 = -1;
					if (local59.equals("lt")) {
						local34 = '<';
					} else if (local59.equals("gt")) {
						local34 = '>';
					} else if (local59.equals("nbsp")) {
						local34 = ' ';
					} else if (local59.equals("shy")) {
						local34 = '\u00ad';
					} else if (local59.equals("times")) {
						local34 = '×';
					} else if (local59.equals("euro")) {
						local34 = '€';
					} else if (local59.equals("copy")) {
						local34 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=") && arg1 != null) {
								try {
									@Pc(135) int local135 = Static444.method6313(local59.substring(4));
									local15 += arg1[local135].AA();
									local13 = -1;
								} catch (@Pc(146) Exception local146) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray110[Static124.method2555(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray29 != null && local13 != -1) {
						local15 += this.aByteArrayArray29[local13][local34];
					}
					local13 = local34;
				}
			}
		}
		return local15;
	}
}
