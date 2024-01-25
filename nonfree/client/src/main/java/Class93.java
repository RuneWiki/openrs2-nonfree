import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class93 {

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public final int anInt2762;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public final int anInt2765;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
	public final int anInt2767;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([B)V")
	public Class93(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub9 local8 = new Class3_Sub9(arg0);
		@Pc(12) int local12 = local8.method5633();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method5633() == 1;
		this.aByteArray25 = new byte[256];
		local8.method5577(0, 256, this.aByteArray25);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local8.method5633();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local47[local65] = local8.method5633();
			}
			@Pc(80) byte[][] local80 = new byte[256][];
			@Pc(95) int local95;
			for (@Pc(82) int local82 = 0; local82 < 256; local82++) {
				local80[local82] = new byte[local44[local82]];
				@Pc(93) byte local93 = 0;
				for (local95 = 0; local95 < local80[local82].length; local95++) {
					local93 += local8.method5619();
					local80[local82][local95] = local93;
				}
			}
			@Pc(124) byte[][] local124 = new byte[256][];
			@Pc(139) int local139;
			for (local95 = 0; local95 < 256; local95++) {
				local124[local95] = new byte[local44[local95]];
				@Pc(137) byte local137 = 0;
				for (local139 = 0; local139 < local124[local95].length; local139++) {
					local137 += local8.method5619();
					local124[local95][local139] = local137;
				}
			}
			this.aByteArrayArray9 = new byte[256][256];
			for (@Pc(174) int local174 = 0; local174 < 256; local174++) {
				if (local174 != 32 && local174 != 160) {
					for (local139 = 0; local139 < 256; local139++) {
						if (local139 != 32 && local139 != 160) {
							this.aByteArrayArray9[local174][local139] = (byte) Static200.method3188(local124, local44, this.aByteArray25, local47, local139, local174, local80);
						}
					}
				}
			}
			this.anInt2762 = local47[32] + local44[32];
		} else {
			this.anInt2762 = local8.method5633();
		}
		local8.method5633();
		local8.method5633();
		this.anInt2765 = local8.method5633();
		this.anInt2767 = local8.method5633();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/String;[Lclient!fd;[I)I")
	public int method2311(@OriginalArg(1) String arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) Class103[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(25) byte local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static605.method8320(arg0.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local27 = local36;
			} else {
				@Pc(67) int local67;
				if (local27 == -1) {
					local48 = this.method2317(local46);
					local67 = local36;
					if (this.aByteArrayArray9 != null && local29 != -1) {
						local48 += this.aByteArrayArray9[local29][local46];
					}
					local29 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local67 = local27;
					@Pc(98) String local98 = arg0.substring(local27 + 1, local36);
					local27 = -1;
					if (local98.equals("br")) {
						arg1[local31] = arg0.substring(local13, local36 + 1);
						local31++;
						if (arg1.length <= local31) {
							return 0;
						}
						local11 = 0;
						local15 = -1;
						local29 = -1;
						local13 = local36 + 1;
						continue;
					}
					if (local98.equals("lt")) {
						local48 = this.method2317(60);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][60];
						}
						local29 = 60;
					} else if (local98.equals("gt")) {
						local48 = this.method2317(62);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][62];
						}
						local29 = 62;
					} else if (local98.equals("nbsp")) {
						local48 = this.method2317(160);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][160];
						}
						local29 = 160;
					} else if (local98.equals("shy")) {
						local48 = this.method2317(173);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][173];
						}
						local29 = 173;
					} else if (local98.equals("times")) {
						local48 = this.method2317(215);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][215];
						}
						local29 = 215;
					} else if (local98.equals("euro")) {
						local48 = this.method2317(8364);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][8364];
						}
						local29 = 8364;
					} else if (local98.equals("copy")) {
						local48 = this.method2317(169);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][169];
						}
						local29 = 169;
					} else if (local98.equals("reg")) {
						local48 = this.method2317(174);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][174];
						}
						local29 = 174;
					} else if (local98.startsWith("img=") && arg2 != null) {
						try {
							@Pc(280) int local280 = Static508.method7720(local98.substring(4));
							local48 = arg2[local280].method7454();
							local29 = -1;
						} catch (@Pc(291) Exception local291) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local11 += local48;
					if (arg3 != null) {
						if (local46 == 32) {
							local17 = local11;
							local15 = local36;
							local25 = 1;
						}
						if (local11 > arg3[local31 < arg3.length ? local31 : arg3.length - 1]) {
							if (local15 >= 0) {
								arg1[local31] = arg0.substring(local13, local15 + 1 - local25);
								local31++;
								if (local31 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local29 = -1;
								local15 = -1;
							} else {
								arg1[local31] = arg0.substring(local13, local67);
								local31++;
								if (arg1.length <= local31) {
									return 0;
								}
								local15 = -1;
								local13 = local67;
								local29 = -1;
								local11 = local48;
							}
						}
						if (local46 == 45) {
							local25 = 0;
							local17 = local11;
							local15 = local36;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg1[local31] = arg0.substring(local13, arg0.length());
			local31++;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(CII)I")
	public int method2312(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray9 == null ? 0 : this.aByteArrayArray9[arg1][arg0];
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/String;I[Lclient!fd;)I")
	public int method2314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class103[] arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt2762;
		}
		@Pc(24) int local24 = this.method2311(arg2, Static149.aStringArray23, arg3, new int[] { arg0 });
		@Pc(36) int local36 = arg1 * (local24 - 1);
		return this.anInt2765 + local36 + this.anInt2767;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2315(@OriginalArg(1) String arg0) {
		return this.method2319((Class103[]) null, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([Lclient!fd;Ljava/lang/String;II)I")
	public int method2316(@OriginalArg(0) Class103[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = this.method2311(arg1, Static149.aStringArray23, arg0, new int[] { arg2 });
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(42) int local42 = this.method2319(arg0, Static149.aStringArray23[local30]);
			if (local42 > local28) {
				local28 = local42;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
	public int method2317(@OriginalArg(0) int arg0) {
		return this.aByteArray25[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!fd;)I")
	public int method2318(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class103[] arg2) {
		return this.method2311(arg0, Static149.aStringArray23, arg2, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[Lclient!fd;Ljava/lang/String;)I")
	public int method2319(@OriginalArg(1) Class103[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			@Pc(32) char local32 = arg1.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg1.substring(local11 + 1, local26);
					local11 = -1;
					if (local54.equals("lt")) {
						local32 = '<';
					} else if (local54.equals("gt")) {
						local32 = '>';
					} else if (local54.equals("nbsp")) {
						local32 = ' ';
					} else if (local54.equals("shy")) {
						local32 = '\u00ad';
					} else if (local54.equals("times")) {
						local32 = '×';
					} else if (local54.equals("euro")) {
						local32 = '€';
					} else if (local54.equals("copy")) {
						local32 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg0 != null) {
								try {
									@Pc(104) int local104 = Static508.method7720(local54.substring(4));
									local13 = -1;
									local15 += arg0[local104].method7454();
								} catch (@Pc(115) Exception local115) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray25[Static605.method8320(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local13 != -1) {
						local15 += this.aByteArrayArray9[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z[Lclient!fd;Ljava/lang/String;I)Ljava/lang/String;")
	public String method2320(@OriginalArg(1) Class103[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.method2319(arg0, arg1) <= arg2) {
			return arg1;
		}
		@Pc(27) int local27 = arg2 - this.method2319((Class103[]) null, "...");
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg1.length();
		@Pc(38) String local38 = "";
		for (@Pc(40) int local40 = 0; local40 < local36; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local46 == '<') {
				local29 = local40;
			} else {
				if (local46 == '>' && local29 != -1) {
					@Pc(69) String local69 = arg1.substring(local29 + 1, local40);
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
							if (local69.startsWith("img=") && arg0 != null) {
								try {
									@Pc(125) int local125 = Static508.method7720(local69.substring(4));
									local33 += arg0[local125].method7454();
									local31 = -1;
									if (local27 < local33) {
										return local38 + "...";
									}
									local38 = arg1.substring(0, local40 + 1);
								} catch (@Pc(159) Exception local159) {
								}
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local29 == -1) {
					local33 += this.aByteArray25[Static605.method8320(local46) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local31 != -1) {
						local33 += this.aByteArrayArray9[local31][local46];
					}
					local31 = local46;
					@Pc(220) int local220 = local33;
					if (this.aByteArrayArray9 != null) {
						local220 = local33 + this.aByteArrayArray9[local46][46];
					}
					if (local220 > local27) {
						return local38 + "...";
					}
					local38 = arg1.substring(0, local40 + 1);
				}
			}
		}
		return arg1;
	}
}
