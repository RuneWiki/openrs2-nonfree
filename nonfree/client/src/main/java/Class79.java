import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class79 {

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
	public final int anInt2294;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public final int anInt2290;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	public final int anInt2284;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B)V")
	public Class79(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class10_Sub8 local8 = new Class10_Sub8(arg0);
		@Pc(12) int local12 = local8.method2502();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method2502() == 1;
		this.aByteArray23 = new byte[256];
		local8.method2493(256, this.aByteArray23);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method2502();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local49[local65] = local8.method2502();
			}
			@Pc(80) byte[][] local80 = new byte[256][];
			@Pc(95) int local95;
			for (@Pc(82) int local82 = 0; local82 < 256; local82++) {
				local80[local82] = new byte[local46[local82]];
				@Pc(93) byte local93 = 0;
				for (local95 = 0; local95 < local80[local82].length; local95++) {
					local93 += local8.method2460();
					local80[local82][local95] = local93;
				}
			}
			@Pc(130) byte[][] local130 = new byte[256][];
			@Pc(145) int local145;
			for (local95 = 0; local95 < 256; local95++) {
				local130[local95] = new byte[local46[local95]];
				@Pc(143) byte local143 = 0;
				for (local145 = 0; local145 < local130[local95].length; local145++) {
					local143 += local8.method2460();
					local130[local95][local145] = local143;
				}
			}
			this.aByteArrayArray17 = new byte[256][256];
			for (@Pc(178) int local178 = 0; local178 < 256; local178++) {
				if (local178 != 32 && local178 != 160) {
					for (local145 = 0; local145 < 256; local145++) {
						if (local145 != 32 && local145 != 160) {
							this.aByteArrayArray17[local178][local145] = (byte) Static369.method4951(local49, local80, local130, local178, local46, local145, this.aByteArray23);
						}
					}
				}
			}
			this.anInt2294 = local49[32] + local46[32];
		} else {
			this.anInt2294 = local8.method2502();
		}
		local8.method2502();
		local8.method2502();
		this.anInt2290 = local8.method2502();
		this.anInt2284 = local8.method2502();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/lang/String;IB[Lclient!o;)I")
	public int method1974(@OriginalArg(1) String arg0, @OriginalArg(4) Class80[] arg1) {
		@Pc(7) int local7 = this.anInt2294;
		@Pc(35) int local35 = this.method1986(Static411.aStringArray52, arg0, arg1, new int[] { 100 });
		@Pc(41) int local41 = local7 * (local35 - 1);
		return this.anInt2290 + local41 + this.anInt2284;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZCI)I")
	public int method1975(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray17 == null ? 0 : this.aByteArrayArray17[arg1][arg0];
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
	public int method1976(@OriginalArg(1) int arg0) {
		return this.aByteArray23[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method1977(@OriginalArg(0) String arg0) {
		return this.method1980(null, arg0);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([Lclient!o;Ljava/lang/String;Z)I")
	public int method1980(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) String arg1) {
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
					@Pc(49) String local49 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local49.equals("lt")) {
						local26 = '<';
					} else if (local49.equals("gt")) {
						local26 = '>';
					} else if (local49.equals("nbsp")) {
						local26 = ' ';
					} else if (local49.equals("shy")) {
						local26 = '\u00ad';
					} else if (local49.equals("times")) {
						local26 = '×';
					} else if (local49.equals("euro")) {
						local26 = '€';
					} else if (local49.equals("copy")) {
						local26 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=") && arg0 != null) {
								try {
									@Pc(113) int local113 = Static335.method4519(local49.substring(4));
									local13 = -1;
									local15 += arg0[local113].RA();
								} catch (@Pc(124) Exception local124) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray23[Static292.method4104(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray17 != null && local13 != -1) {
						local15 += this.aByteArrayArray17[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([Lclient!o;IZLjava/lang/String;)I")
	public int method1982(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(27) int local27 = this.method1986(Static411.aStringArray52, arg2, arg0, new int[] { arg1 });
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			@Pc(41) int local41 = this.method1980(arg0, Static411.aStringArray52[local31]);
			if (local41 > local29) {
				local29 = local41;
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!o;I)I")
	public int method1984(@OriginalArg(0) String arg0, @OriginalArg(2) Class80[] arg1, @OriginalArg(3) int arg2) {
		return this.method1986(Static411.aStringArray52, arg0, arg1, new int[] { arg2 });
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([Lclient!o;ILjava/lang/String;I)Ljava/lang/String;")
	public String method1985(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.method1980(arg0, arg2) <= arg1) {
			return arg2;
		}
		@Pc(26) int local26 = arg1 - this.method1980(null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg2.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg2.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(70) String local70 = arg2.substring(local28 + 1, local39);
					local28 = -1;
					if (local70.equals("lt")) {
						local45 = '<';
					} else if (local70.equals("gt")) {
						local45 = '>';
					} else if (local70.equals("nbsp")) {
						local45 = ' ';
					} else if (local70.equals("shy")) {
						local45 = '\u00ad';
					} else if (local70.equals("times")) {
						local45 = '×';
					} else if (local70.equals("euro")) {
						local45 = '€';
					} else if (local70.equals("copy")) {
						local45 = '©';
					} else {
						if (!local70.equals("reg")) {
							if (local70.startsWith("img=") && arg0 != null) {
								try {
									@Pc(130) int local130 = Static335.method4519(local70.substring(4));
									local30 = -1;
									local32 += arg0[local130].RA();
									if (local26 < local32) {
										return local37 + "...";
									}
									local37 = arg2.substring(0, local39 + 1);
								} catch (@Pc(160) Exception local160) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray23[Static292.method4104(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray17 != null && local30 != -1) {
						local32 += this.aByteArrayArray17[local30][local45];
					}
					local30 = local45;
					@Pc(216) int local216 = local32;
					if (this.aByteArrayArray17 != null) {
						local216 = local32 + this.aByteArrayArray17[local45][46];
					}
					if (local216 > local26) {
						return local37 + "...";
					}
					local37 = arg2.substring(0, local39 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[Ljava/lang/String;Ljava/lang/String;[Lclient!o;[I)I")
	public int method1986(@OriginalArg(1) String[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class80[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(23) int local23 = 0;
		@Pc(25) byte local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg1.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static292.method4104(arg1.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local27 = local36;
			} else {
				@Pc(61) int local61;
				if (local27 == -1) {
					local61 = local36;
					local48 = this.method1976(local46);
					if (this.aByteArrayArray17 != null && local29 != -1) {
						local48 += this.aByteArrayArray17[local29][local46];
					}
					local29 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local61 = local27;
					@Pc(101) String local101 = arg1.substring(local27 + 1, local36);
					local27 = -1;
					if (local101.equals("br")) {
						arg0[local31] = arg1.substring(local13, local36 + 1);
						local31++;
						if (arg0.length <= local31) {
							return 0;
						}
						local15 = -1;
						local13 = local36 + 1;
						local11 = 0;
						local29 = -1;
						continue;
					}
					if (local101.equals("lt")) {
						local48 = this.method1976(60);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][60];
						}
						local29 = 60;
					} else if (local101.equals("gt")) {
						local48 = this.method1976(62);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][62];
						}
						local29 = 62;
					} else if (local101.equals("nbsp")) {
						local48 = this.method1976(160);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][160];
						}
						local29 = 160;
					} else if (local101.equals("shy")) {
						local48 = this.method1976(173);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][173];
						}
						local29 = 173;
					} else if (local101.equals("times")) {
						local48 = this.method1976(215);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][215];
						}
						local29 = 215;
					} else if (local101.equals("euro")) {
						local48 = this.method1976(8364);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][8364];
						}
						local29 = 8364;
					} else if (local101.equals("copy")) {
						local48 = this.method1976(169);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][169];
						}
						local29 = 169;
					} else if (local101.equals("reg")) {
						local48 = this.method1976(174);
						if (this.aByteArrayArray17 != null && local29 != -1) {
							local48 += this.aByteArrayArray17[local29][174];
						}
						local29 = 174;
					} else if (local101.startsWith("img=") && arg2 != null) {
						try {
							@Pc(311) int local311 = Static335.method4519(local101.substring(4));
							local48 = arg2[local311].RA();
							local29 = -1;
						} catch (@Pc(322) Exception local322) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local11 += local48;
					if (arg3 != null) {
						if (local46 == 32) {
							local23 = local11;
							local25 = 1;
							local15 = local36;
						}
						if (local11 > arg3[local31 < arg3.length ? local31 : arg3.length - 1]) {
							if (local15 >= 0) {
								arg0[local31] = arg1.substring(local13, local15 + 1 - local25);
								local31++;
								if (local31 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local23;
								local29 = -1;
								local15 = -1;
							} else {
								arg0[local31] = arg1.substring(local13, local61);
								local31++;
								if (arg0.length <= local31) {
									return 0;
								}
								local13 = local61;
								local15 = -1;
								local11 = local48;
								local29 = -1;
							}
						}
						if (local46 == 45) {
							local23 = local11;
							local25 = 0;
							local15 = local36;
						}
					}
				}
			}
		}
		if (local13 < arg1.length()) {
			arg0[local31] = arg1.substring(local13, arg1.length());
			local31++;
		}
		return local31;
	}
}
