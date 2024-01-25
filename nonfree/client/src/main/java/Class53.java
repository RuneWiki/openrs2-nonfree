import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class53 {

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
	public final int anInt1516;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public final int anInt1511;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
	public final int anInt1514;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "([B)V")
	public Class53(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub27 local8 = new Class3_Sub27(arg0);
		@Pc(12) int local12 = local8.method7548();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method7548() == 1;
		this.aByteArray25 = new byte[256];
		local8.method7571(this.aByteArray25, 256);
		if (local28) {
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local51[local53] = local8.method7548();
			}
			@Pc(70) int[] local70 = new int[256];
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local70[local72] = local8.method7548();
			}
			@Pc(87) byte[][] local87 = new byte[256][];
			@Pc(102) int local102;
			for (@Pc(89) int local89 = 0; local89 < 256; local89++) {
				local87[local89] = new byte[local51[local89]];
				@Pc(100) byte local100 = 0;
				for (local102 = 0; local102 < local87[local89].length; local102++) {
					local100 += local8.method7584();
					local87[local89][local102] = local100;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local102 = 0; local102 < 256; local102++) {
				local131[local102] = new byte[local51[local102]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local102].length; local146++) {
					local144 += local8.method7584();
					local131[local102][local146] = local144;
				}
			}
			this.aByteArrayArray6 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray6[local181][local146] = (byte) Static136.method2318(local131, local146, local87, local51, local70, local181, this.aByteArray25);
						}
					}
				}
			}
			this.anInt1516 = local51[32] + local70[32];
		} else {
			this.anInt1516 = local8.method7548();
		}
		local8.method7548();
		local8.method7548();
		this.anInt1511 = local8.method7548();
		this.anInt1514 = local8.method7548();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(CIB)I")
	public int method1377(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray6 == null ? 0 : this.aByteArrayArray6[arg1][arg0];
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method1378(@OriginalArg(0) String arg0) {
		return this.method1384(arg0, null);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I")
	public int method1379(@OriginalArg(0) int arg0) {
		return this.aByteArray25[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[Lclient!xa;Ljava/lang/String;I)Ljava/lang/String;")
	public String method1380(@OriginalArg(0) int arg0, @OriginalArg(1) Class119[] arg1, @OriginalArg(2) String arg2) {
		if (arg0 >= this.method1384(arg2, arg1)) {
			return arg2;
		}
		@Pc(22) int local22 = arg0 - this.method1384("...", null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg2.length();
		@Pc(33) String local33 = "";
		for (@Pc(35) int local35 = 0; local35 < local31; local35++) {
			@Pc(41) char local41 = arg2.charAt(local35);
			if (local41 == '<') {
				local24 = local35;
			} else {
				if (local41 == '>' && local24 != -1) {
					@Pc(61) String local61 = arg2.substring(local24 + 1, local35);
					local24 = -1;
					if (local61.equals("lt")) {
						local41 = '<';
					} else if (local61.equals("gt")) {
						local41 = '>';
					} else if (local61.equals("nbsp")) {
						local41 = ' ';
					} else if (local61.equals("shy")) {
						local41 = '\u00ad';
					} else if (local61.equals("times")) {
						local41 = '×';
					} else if (local61.equals("euro")) {
						local41 = '€';
					} else if (local61.equals("copy")) {
						local41 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=") && arg1 != null) {
								try {
									@Pc(127) int local127 = Static454.method6837(local61.substring(4));
									local26 = -1;
									local28 += arg1[local127].AA();
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg2.substring(0, local35 + 1);
								} catch (@Pc(157) Exception local157) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray25[Static331.method5274(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray6 != null && local26 != -1) {
						local28 += this.aByteArrayArray6[local26][local41];
					}
					local26 = local41;
					@Pc(205) int local205 = local28;
					if (this.aByteArrayArray6 != null) {
						local205 = local28 + this.aByteArrayArray6[local41][46];
					}
					if (local205 > local22) {
						return local33 + "...";
					}
					local33 = arg2.substring(0, local35 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "([Lclient!xa;IILjava/lang/String;)I")
	public int method1381(@OriginalArg(0) Class119[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return this.method1385(arg2, new int[] { arg1 }, arg0, Static506.aStringArray47);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[Lclient!xa;Ljava/lang/String;I)I")
	public int method1383(@OriginalArg(1) Class119[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = this.method1385(arg1, new int[] { arg2 }, arg0, Static506.aStringArray47);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method1384(Static506.aStringArray47[local30], arg0);
			if (local28 < local40) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!xa;)I")
	public int method1384(@OriginalArg(0) String arg0, @OriginalArg(2) Class119[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(36) char local36 = arg0.charAt(local30);
			if (local36 == '<') {
				local11 = local30;
			} else {
				if (local36 == '>' && local11 != -1) {
					@Pc(58) String local58 = arg0.substring(local11 + 1, local30);
					local11 = -1;
					if (local58.equals("lt")) {
						local36 = '<';
					} else if (local58.equals("gt")) {
						local36 = '>';
					} else if (local58.equals("nbsp")) {
						local36 = ' ';
					} else if (local58.equals("shy")) {
						local36 = '\u00ad';
					} else if (local58.equals("times")) {
						local36 = '×';
					} else if (local58.equals("euro")) {
						local36 = '€';
					} else if (local58.equals("copy")) {
						local36 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=") && arg1 != null) {
								try {
									@Pc(130) int local130 = Static454.method6837(local58.substring(4));
									local13 = -1;
									local25 += arg1[local130].AA();
								} catch (@Pc(141) Exception local141) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local11 == -1) {
					local25 += this.aByteArray25[Static331.method5274(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray6 != null && local13 != -1) {
						local25 += this.aByteArrayArray6[local13][local36];
					}
					local13 = local36;
				}
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;[IB[Lclient!xa;[Ljava/lang/String;)I")
	public int method1385(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class119[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 == null) {
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
		@Pc(28) int local28 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local28; local35++) {
			@Pc(45) int local45 = Static331.method5274(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(62) int local62;
				if (local21 == -1) {
					local62 = local35;
					local47 = this.method1379(local45);
					if (this.aByteArrayArray6 != null && local23 != -1) {
						local47 += this.aByteArrayArray6[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local62 = local21;
					@Pc(100) String local100 = arg0.substring(local21 + 1, local35);
					local21 = -1;
					if (local100.equals("br")) {
						arg3[local25] = arg0.substring(local13, local35 + 1);
						local25++;
						if (local25 >= arg3.length) {
							return 0;
						}
						local15 = -1;
						local23 = -1;
						local11 = 0;
						local13 = local35 + 1;
						continue;
					}
					if (local100.equals("lt")) {
						local47 = this.method1379(60);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][60];
						}
						local23 = 60;
					} else if (local100.equals("gt")) {
						local47 = this.method1379(62);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][62];
						}
						local23 = 62;
					} else if (local100.equals("nbsp")) {
						local47 = this.method1379(160);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][160];
						}
						local23 = 160;
					} else if (local100.equals("shy")) {
						local47 = this.method1379(173);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][173];
						}
						local23 = 173;
					} else if (local100.equals("times")) {
						local47 = this.method1379(215);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][215];
						}
						local23 = 215;
					} else if (local100.equals("euro")) {
						local47 = this.method1379(8364);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][8364];
						}
						local23 = 8364;
					} else if (local100.equals("copy")) {
						local47 = this.method1379(169);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][169];
						}
						local23 = 169;
					} else if (local100.equals("reg")) {
						local47 = this.method1379(174);
						if (this.aByteArrayArray6 != null && local23 != -1) {
							local47 += this.aByteArrayArray6[local23][174];
						}
						local23 = 174;
					} else if (local100.startsWith("img=") && arg2 != null) {
						try {
							@Pc(261) int local261 = Static454.method6837(local100.substring(4));
							local23 = -1;
							local47 = arg2[local261].AA();
						} catch (@Pc(272) Exception local272) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg1 != null) {
						if (local45 == 32) {
							local15 = local35;
							local19 = 1;
							local17 = local11;
						}
						if (local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1]) {
							if (local15 >= 0) {
								arg3[local25] = arg0.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg3.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local15 = -1;
								local11 -= local17;
							} else {
								arg3[local25] = arg0.substring(local13, local62);
								local25++;
								if (arg3.length <= local25) {
									return 0;
								}
								local23 = -1;
								local11 = local47;
								local15 = -1;
								local13 = local62;
							}
						}
						if (local45 == 45) {
							local19 = 0;
							local15 = local35;
							local17 = local11;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg3[local25] = arg0.substring(local13, arg0.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[Lclient!xa;IILjava/lang/String;)I")
	public int method1386(@OriginalArg(1) Class119[] arg0, @OriginalArg(4) String arg1) {
		@Pc(11) int local11 = this.anInt1516;
		@Pc(30) int local30 = this.method1385(arg1, new int[] { 100 }, arg0, Static506.aStringArray47);
		@Pc(36) int local36 = local11 * (local30 - 1);
		return this.anInt1514 + local36 + this.anInt1511;
	}
}
