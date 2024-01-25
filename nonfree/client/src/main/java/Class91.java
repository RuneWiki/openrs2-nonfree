import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class91 {

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public final int anInt2208;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public final int anInt2198;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
	public final int anInt2205;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Class91(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(12) int local12 = local8.method7954();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method7954() == 1;
		this.aByteArray14 = new byte[256];
		local8.method7958(0, this.aByteArray14, 256);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local56[local58] = local8.method7954();
			}
			@Pc(75) int[] local75 = new int[256];
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local75[local77] = local8.method7954();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local56[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method7960();
					local92[local94][local107] = local105;
				}
			}
			@Pc(140) byte[][] local140 = new byte[256][];
			@Pc(155) int local155;
			for (local107 = 0; local107 < 256; local107++) {
				local140[local107] = new byte[local56[local107]];
				@Pc(153) byte local153 = 0;
				for (local155 = 0; local155 < local140[local107].length; local155++) {
					local153 += local8.method7960();
					local140[local107][local155] = local153;
				}
			}
			this.aByteArrayArray8 = new byte[256][256];
			for (@Pc(192) int local192 = 0; local192 < 256; local192++) {
				if (local192 != 32 && local192 != 160) {
					for (local155 = 0; local155 < 256; local155++) {
						if (local155 != 32 && local155 != 160) {
							this.aByteArrayArray8[local192][local155] = (byte) Static416.method5663(local92, local56, local75, local155, local192, local140, this.aByteArray14);
						}
					}
				}
			}
			this.anInt2208 = local56[32] + local75[32];
		} else {
			this.anInt2208 = local8.method7954();
		}
		local8.method7954();
		local8.method7954();
		this.anInt2198 = local8.method7954();
		this.anInt2205 = local8.method7954();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lclient!hh;ILjava/lang/String;I)I")
	public int method1845(@OriginalArg(0) Class6[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method1851(arg0, new int[] { arg2 }, Static177.aStringArray25, arg1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lclient!hh;IBILjava/lang/String;)I")
	public int method1846(@OriginalArg(0) Class6[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt2208;
		}
		@Pc(24) int local24 = this.method1851(arg0, new int[] { arg2 }, Static177.aStringArray25, arg3);
		@Pc(35) int local35 = arg1 * (local24 - 1);
		return this.anInt2198 + local35 + this.anInt2205;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[Lclient!hh;ILjava/lang/String;)Ljava/lang/String;")
	public String method1847(@OriginalArg(1) Class6[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 >= this.method1857(arg2, arg0)) {
			return arg2;
		}
		@Pc(22) int local22 = arg1 - this.method1857("...", (Class6[]) null);
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
					@Pc(64) String local64 = arg2.substring(local24 + 1, local35);
					local24 = -1;
					if (local64.equals("lt")) {
						local41 = '<';
					} else if (local64.equals("gt")) {
						local41 = '>';
					} else if (local64.equals("nbsp")) {
						local41 = ' ';
					} else if (local64.equals("shy")) {
						local41 = '\u00ad';
					} else if (local64.equals("times")) {
						local41 = '×';
					} else if (local64.equals("euro")) {
						local41 = '€';
					} else if (local64.equals("copy")) {
						local41 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=") && arg0 != null) {
								try {
									@Pc(124) int local124 = Static505.method6599(local64.substring(4));
									local26 = -1;
									local28 += arg0[local124].method5130();
									if (local28 > local22) {
										return local33 + "...";
									}
									local33 = arg2.substring(0, local35 + 1);
								} catch (@Pc(158) Exception local158) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray14[Static225.method3318(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray8 != null && local26 != -1) {
						local28 += this.aByteArrayArray8[local26][local41];
					}
					local26 = local41;
					@Pc(216) int local216 = local28;
					if (this.aByteArrayArray8 != null) {
						local216 = local28 + this.aByteArrayArray8[local41][46];
					}
					if (local22 < local216) {
						return local33 + "...";
					}
					local33 = arg2.substring(0, local35 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method1849(@OriginalArg(1) String arg0) {
		return this.method1857(arg0, (Class6[]) null);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lclient!hh;[I[Ljava/lang/String;Ljava/lang/String;B)I")
	public int method1851(@OriginalArg(0) Class6[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
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
		@Pc(33) int local33 = arg3.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static225.method3318(arg3.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(64) int local64;
				if (local26 == -1) {
					local47 = this.method1853(local45);
					local64 = local35;
					if (this.aByteArrayArray8 != null && local28 != -1) {
						local47 += this.aByteArrayArray8[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local64 = local26;
					@Pc(71) String local71 = arg3.substring(local26 + 1, local35);
					local26 = -1;
					if (local71.equals("br")) {
						arg2[local30] = arg3.substring(local13, local35 + 1);
						local30++;
						if (local30 >= arg2.length) {
							return 0;
						}
						local13 = local35 + 1;
						local15 = -1;
						local28 = -1;
						local11 = 0;
						continue;
					}
					if (local71.equals("lt")) {
						local47 = this.method1853(60);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][60];
						}
						local28 = 60;
					} else if (local71.equals("gt")) {
						local47 = this.method1853(62);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][62];
						}
						local28 = 62;
					} else if (local71.equals("nbsp")) {
						local47 = this.method1853(160);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][160];
						}
						local28 = 160;
					} else if (local71.equals("shy")) {
						local47 = this.method1853(173);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][173];
						}
						local28 = 173;
					} else if (local71.equals("times")) {
						local47 = this.method1853(215);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][215];
						}
						local28 = 215;
					} else if (local71.equals("euro")) {
						local47 = this.method1853(8364);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][8364];
						}
						local28 = 8364;
					} else if (local71.equals("copy")) {
						local47 = this.method1853(169);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][169];
						}
						local28 = 169;
					} else if (local71.equals("reg")) {
						local47 = this.method1853(174);
						if (this.aByteArrayArray8 != null && local28 != -1) {
							local47 += this.aByteArrayArray8[local28][174];
						}
						local28 = 174;
					} else if (local71.startsWith("img=") && arg0 != null) {
						try {
							@Pc(199) int local199 = Static505.method6599(local71.substring(4));
							local28 = -1;
							local47 = arg0[local199].method5130();
						} catch (@Pc(210) Exception local210) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg1 != null) {
						if (local45 == 32) {
							local17 = local11;
							local19 = 1;
							local15 = local35;
						}
						if (local11 > arg1[local30 >= arg1.length ? arg1.length - 1 : local30]) {
							if (local15 < 0) {
								arg2[local30] = arg3.substring(local13, local64);
								local30++;
								if (local30 >= arg2.length) {
									return 0;
								}
								local11 = local47;
								local28 = -1;
								local13 = local64;
								local15 = -1;
							} else {
								arg2[local30] = arg3.substring(local13, local15 + 1 - local19);
								local30++;
								if (local30 >= arg2.length) {
									return 0;
								}
								local13 = local15 + 1;
								local28 = -1;
								local11 -= local17;
								local15 = -1;
							}
						}
						if (local45 == 45) {
							local17 = local11;
							local19 = 0;
							local15 = local35;
						}
					}
				}
			}
		}
		if (local13 < arg3.length()) {
			arg2[local30] = arg3.substring(local13, arg3.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
	public int method1853(@OriginalArg(1) int arg0) {
		return this.aByteArray14[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ICI)I")
	public int method1855(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray8 == null ? 0 : this.aByteArrayArray8[arg1][arg0];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lclient!hh;Ljava/lang/String;ZI)I")
	public int method1856(@OriginalArg(0) Class6[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method1851(arg0, new int[] { arg2 }, Static177.aStringArray25, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method1857(Static177.aStringArray25[local27], arg0);
			if (local20 < local37) {
				local20 = local37;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;[Lclient!hh;I)I")
	public int method1857(@OriginalArg(0) String arg0, @OriginalArg(1) Class6[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local16 = local25;
			} else {
				if (local31 == '>' && local16 != -1) {
					@Pc(53) String local53 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg1 != null) {
								try {
									@Pc(113) int local113 = Static505.method6599(local53.substring(4));
									local20 += arg1[local113].method5130();
									local18 = -1;
								} catch (@Pc(124) Exception local124) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local16 == -1) {
					local20 += this.aByteArray14[Static225.method3318(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray8 != null && local18 != -1) {
						local20 += this.aByteArrayArray8[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}
}
