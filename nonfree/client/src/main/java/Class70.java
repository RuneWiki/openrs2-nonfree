import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class70 {

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	public final int anInt2276;

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
	public final int anInt2278;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	public final int anInt2270;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "([B)V")
	public Class70(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub7 local6 = new Class3_Sub7(arg0);
		@Pc(10) int local10 = local6.method2582();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(29) boolean local29 = local6.method2582() == 1;
		this.aByteArray29 = new byte[256];
		local6.method2580(256, this.aByteArray29);
		if (local29) {
			@Pc(45) int[] local45 = new int[256];
			for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
				local45[local47] = local6.method2582();
			}
			@Pc(63) int[] local63 = new int[256];
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local63[local65] = local6.method2582();
			}
			@Pc(79) byte[][] local79 = new byte[256][];
			@Pc(93) int local93;
			for (@Pc(81) int local81 = 0; local81 < 256; local81++) {
				local79[local81] = new byte[local45[local81]];
				@Pc(91) byte local91 = 0;
				for (local93 = 0; local93 < local79[local81].length; local93++) {
					local91 += local6.method2612();
					local79[local81][local93] = local91;
				}
			}
			@Pc(123) byte[][] local123 = new byte[256][];
			@Pc(137) int local137;
			for (local93 = 0; local93 < 256; local93++) {
				local123[local93] = new byte[local45[local93]];
				@Pc(135) byte local135 = 0;
				for (local137 = 0; local137 < local123[local93].length; local137++) {
					local135 += local6.method2612();
					local123[local93][local137] = local135;
				}
			}
			this.aByteArrayArray5 = new byte[256][256];
			for (@Pc(175) int local175 = 0; local175 < 256; local175++) {
				if (local175 != 32 && local175 != 160) {
					for (local137 = 0; local137 < 256; local137++) {
						if (local137 != 32 && local137 != 160) {
							this.aByteArrayArray5[local175][local137] = (byte) Static270.method3874(local175, local63, local45, this.aByteArray29, local123, local137, local79);
						}
					}
				}
			}
			this.anInt2276 = local45[32] + local63[32];
		} else {
			this.anInt2276 = local6.method2582();
		}
		local6.method2582();
		local6.method2582();
		this.anInt2278 = local6.method2582();
		this.anInt2270 = local6.method2582();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(CII)I")
	public int method1750(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray5 == null ? 0 : this.aByteArrayArray5[arg1][arg0];
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I[Lclient!f;IILjava/lang/String;)I")
	public int method1751(@OriginalArg(1) Class8[] arg0, @OriginalArg(4) String arg1) {
		@Pc(7) int local7 = this.anInt2276;
		@Pc(26) int local26 = this.method1757(Static258.aStringArray35, arg0, arg1, new int[] { 100 });
		@Pc(38) int local38 = local7 * (local26 - 1);
		return this.anInt2270 + this.anInt2278 + local38;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([Lclient!f;IILjava/lang/String;)I")
	public int method1752(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(16) int local16 = this.method1757(Static258.aStringArray35, arg0, arg2, new int[] { arg1 });
		@Pc(18) int local18 = 0;
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			@Pc(38) int local38 = this.method1756(arg0, Static258.aStringArray35[local29]);
			if (local18 < local38) {
				local18 = local38;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;IB[Lclient!f;)Ljava/lang/String;")
	public String method1753(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8[] arg2) {
		if (arg1 >= this.method1756(arg2, arg0)) {
			return arg0;
		}
		@Pc(20) int local20 = arg1 - this.method1756(null, "...");
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		@Pc(31) String local31 = "";
		for (@Pc(33) int local33 = 0; local33 < local29; local33++) {
			@Pc(38) char local38 = arg0.charAt(local33);
			if (local38 == '<') {
				local22 = local33;
			} else {
				if (local38 == '>' && local22 != -1) {
					@Pc(60) String local60 = arg0.substring(local22 + 1, local33);
					local22 = -1;
					if (local60.equals("lt")) {
						local38 = '<';
					} else if (local60.equals("gt")) {
						local38 = '>';
					} else if (local60.equals("nbsp")) {
						local38 = ' ';
					} else if (local60.equals("shy")) {
						local38 = '\u00ad';
					} else if (local60.equals("times")) {
						local38 = '×';
					} else if (local60.equals("euro")) {
						local38 = '€';
					} else if (local60.equals("copy")) {
						local38 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=") && arg2 != null) {
								try {
									@Pc(112) int local112 = Static247.method3714(local60.substring(4));
									local26 += arg2[local112].ja();
									local24 = -1;
									if (local20 < local26) {
										return local31 + "...";
									}
									local31 = arg0.substring(0, local33 + 1);
								} catch (@Pc(146) Exception local146) {
								}
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local22 == -1) {
					local26 += this.aByteArray29[Static177.method2821(local38) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local24 != -1) {
						local26 += this.aByteArrayArray5[local24][local38];
					}
					local24 = local38;
					@Pc(199) int local199 = local26;
					if (this.aByteArrayArray5 != null) {
						local199 = local26 + this.aByteArrayArray5[local38][46];
					}
					if (local20 < local199) {
						return local31 + "...";
					}
					local31 = arg0.substring(0, local33 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I")
	public int method1754(@OriginalArg(1) int arg0) {
		return this.aByteArray29[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I[Lclient!f;BLjava/lang/String;)I")
	public int method1755(@OriginalArg(0) int arg0, @OriginalArg(1) Class8[] arg1, @OriginalArg(3) String arg2) {
		return this.method1757(Static258.aStringArray35, arg1, arg2, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[Lclient!f;Ljava/lang/String;)I")
	public int method1756(@OriginalArg(1) Class8[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg1.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(29) char local29 = arg1.charAt(local24);
			if (local29 == '<') {
				local15 = local24;
			} else {
				if (local29 == '>' && local15 != -1) {
					@Pc(48) String local48 = arg1.substring(local15 + 1, local24);
					local15 = -1;
					if (local48.equals("lt")) {
						local29 = '<';
					} else if (local48.equals("gt")) {
						local29 = '>';
					} else if (local48.equals("nbsp")) {
						local29 = ' ';
					} else if (local48.equals("shy")) {
						local29 = '\u00ad';
					} else if (local48.equals("times")) {
						local29 = '×';
					} else if (local48.equals("euro")) {
						local29 = '€';
					} else if (local48.equals("copy")) {
						local29 = '©';
					} else {
						if (!local48.equals("reg")) {
							if (local48.startsWith("img=") && arg0 != null) {
								try {
									@Pc(103) int local103 = Static247.method3714(local48.substring(4));
									local17 = -1;
									local19 += arg0[local103].ja();
								} catch (@Pc(114) Exception local114) {
								}
							}
							continue;
						}
						local29 = '®';
					}
				}
				if (local15 == -1) {
					local19 += this.aByteArray29[Static177.method2821(local29) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local17 != -1) {
						local19 += this.aByteArrayArray5[local17][local29];
					}
					local17 = local29;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([Ljava/lang/String;[Lclient!f;Ljava/lang/String;I[I)I")
	public int method1757(@OriginalArg(0) String[] arg0, @OriginalArg(1) Class8[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg2.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(37) int local37 = Static177.method2821(arg2.charAt(local28)) & 0xFF;
			@Pc(39) int local39 = 0;
			if (local37 == 60) {
				local19 = local28;
			} else {
				@Pc(52) int local52;
				if (local19 == -1) {
					local52 = local28;
					local39 = this.method1754(local37);
					if (this.aByteArrayArray5 != null && local21 != -1) {
						local39 += this.aByteArrayArray5[local21][local37];
					}
					local21 = local37;
				} else {
					if (local37 != 62) {
						continue;
					}
					local52 = local19;
					@Pc(90) String local90 = arg2.substring(local19 + 1, local28);
					local19 = -1;
					if (local90.equals("br")) {
						arg0[local23] = arg2.substring(local11, local28 + 1);
						local23++;
						if (local23 >= arg0.length) {
							return 0;
						}
						local21 = -1;
						local13 = -1;
						local11 = local28 + 1;
						local9 = 0;
						continue;
					}
					if (local90.equals("lt")) {
						local39 = this.method1754(60);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][60];
						}
						local21 = 60;
					} else if (local90.equals("gt")) {
						local39 = this.method1754(62);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][62];
						}
						local21 = 62;
					} else if (local90.equals("nbsp")) {
						local39 = this.method1754(160);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][160];
						}
						local21 = 160;
					} else if (local90.equals("shy")) {
						local39 = this.method1754(173);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][173];
						}
						local21 = 173;
					} else if (local90.equals("times")) {
						local39 = this.method1754(215);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][215];
						}
						local21 = 215;
					} else if (local90.equals("euro")) {
						local39 = this.method1754(8364);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][8364];
						}
						local21 = 8364;
					} else if (local90.equals("copy")) {
						local39 = this.method1754(169);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][169];
						}
						local21 = 169;
					} else if (local90.equals("reg")) {
						local39 = this.method1754(174);
						if (this.aByteArrayArray5 != null && local21 != -1) {
							local39 += this.aByteArrayArray5[local21][174];
						}
						local21 = 174;
					} else if (local90.startsWith("img=") && arg1 != null) {
						try {
							@Pc(245) int local245 = Static247.method3714(local90.substring(4));
							local39 = arg1[local245].ja();
							local21 = -1;
						} catch (@Pc(256) Exception local256) {
						}
					}
					local37 = -1;
				}
				if (local39 > 0) {
					local9 += local39;
					if (arg3 != null) {
						if (local37 == 32) {
							local15 = local9;
							local13 = local28;
							local17 = 1;
						}
						if (local9 > arg3[local23 >= arg3.length ? arg3.length - 1 : local23]) {
							if (local13 >= 0) {
								arg0[local23] = arg2.substring(local11, local13 + 1 - local17);
								local23++;
								if (local23 >= arg0.length) {
									return 0;
								}
								local11 = local13 + 1;
								local13 = -1;
								local9 -= local15;
								local21 = -1;
							} else {
								arg0[local23] = arg2.substring(local11, local52);
								local23++;
								if (local23 >= arg0.length) {
									return 0;
								}
								local9 = local39;
								local13 = -1;
								local21 = -1;
								local11 = local52;
							}
						}
						if (local37 == 45) {
							local15 = local9;
							local13 = local28;
							local17 = 0;
						}
					}
				}
			}
		}
		if (arg2.length() > local11) {
			arg0[local23] = arg2.substring(local11, arg2.length());
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method1759(@OriginalArg(0) String arg0) {
		return this.method1756(null, arg0);
	}
}
