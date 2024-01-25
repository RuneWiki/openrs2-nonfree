import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class328 {

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "[B")
	private final byte[] aByteArray218;

	@OriginalMember(owner = "client!ufa", name = "q", descriptor = "I")
	public final int anInt9400;

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray47;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
	public final int anInt9395;

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
	public final int anInt9397;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "([B)V")
	public Class328(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub26 local8 = new Class3_Sub26(arg0);
		@Pc(12) int local12 = local8.method6814();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method6814() == 1;
		this.aByteArray218 = new byte[256];
		local8.method6794(this.aByteArray218, 256);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method6814();
			}
			@Pc(70) int[] local70 = new int[256];
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local70[local72] = local8.method6814();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local53[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method6825();
					local89[local91][local104] = local102;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local104 = 0; local104 < 256; local104++) {
				local133[local104] = new byte[local53[local104]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local104].length; local148++) {
					local146 += local8.method6825();
					local133[local104][local148] = local146;
				}
			}
			this.aByteArrayArray47 = new byte[256][256];
			for (@Pc(183) int local183 = 0; local183 < 256; local183++) {
				if (local183 != 32 && local183 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray47[local183][local148] = (byte) Static287.method4310(local70, local133, local53, this.aByteArray218, local89, local148, local183);
						}
					}
				}
			}
			this.anInt9400 = local53[32] + local70[32];
		} else {
			this.anInt9400 = local8.method6814();
		}
		local8.method6814();
		local8.method6814();
		this.anInt9395 = local8.method6814();
		this.anInt9397 = local8.method6814();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;I)I")
	public int method7368(@OriginalArg(1) Class73[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method7374(arg1, arg0, new int[] { arg2 }, Static565.aStringArray48);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method7376(arg0, Static565.aStringArray48[local22]);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;III)I")
	public int method7369(@OriginalArg(0) String arg0, @OriginalArg(1) Class73[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt9400;
		}
		@Pc(24) int local24 = this.method7374(arg0, arg1, new int[] { arg3 }, Static565.aStringArray48);
		@Pc(30) int local30 = (local24 - 1) * arg2;
		return this.anInt9397 + local30 + this.anInt9395;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;IB)Ljava/lang/String;")
	public String method7370(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.method7376(arg0, arg1) <= arg2) {
			return arg1;
		}
		@Pc(33) int local33 = arg2 - this.method7376(null, "...");
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg1.length();
		@Pc(44) String local44 = "";
		for (@Pc(46) int local46 = 0; local46 < local42; local46++) {
			@Pc(52) char local52 = arg1.charAt(local46);
			if (local52 == '<') {
				local35 = local46;
			} else {
				if (local52 == '>' && local35 != -1) {
					@Pc(76) String local76 = arg1.substring(local35 + 1, local46);
					local35 = -1;
					if (local76.equals("lt")) {
						local52 = '<';
					} else if (local76.equals("gt")) {
						local52 = '>';
					} else if (local76.equals("nbsp")) {
						local52 = ' ';
					} else if (local76.equals("shy")) {
						local52 = '\u00ad';
					} else if (local76.equals("times")) {
						local52 = '×';
					} else if (local76.equals("euro")) {
						local52 = '€';
					} else if (local76.equals("copy")) {
						local52 = '©';
					} else {
						if (!local76.equals("reg")) {
							if (local76.startsWith("img=") && arg0 != null) {
								try {
									@Pc(142) int local142 = Static406.method5727(local76.substring(4));
									local37 = -1;
									local39 += arg0[local142].A();
									if (local39 > local33) {
										return local44 + "...";
									}
									local44 = arg1.substring(0, local46 + 1);
								} catch (@Pc(172) Exception local172) {
								}
							}
							continue;
						}
						local52 = '®';
					}
				}
				if (local35 == -1) {
					local39 += this.aByteArray218[Static411.method5771(local52) & 0xFF] & 0xFF;
					if (this.aByteArrayArray47 != null && local37 != -1) {
						local39 += this.aByteArrayArray47[local37][local52];
					}
					local37 = local52;
					@Pc(221) int local221 = local39;
					if (this.aByteArrayArray47 != null) {
						local221 = local39 + this.aByteArrayArray47[local52][46];
					}
					if (local221 > local33) {
						return local44 + "...";
					}
					local44 = arg1.substring(0, local46 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method7371(@OriginalArg(0) String arg0) {
		return this.method7376(null, arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(CII)I")
	public int method7372(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray47 == null ? 0 : this.aByteArrayArray47[arg1][arg0];
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILjava/lang/String;[Lclient!f;B)I")
	public int method7373(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class73[] arg2) {
		return this.method7374(arg1, arg2, new int[] { arg0 }, Static565.aStringArray48);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!f;[I[Ljava/lang/String;)I")
	public int method7374(@OriginalArg(0) String arg0, @OriginalArg(2) Class73[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(27) byte local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static411.method5771(arg0.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local29 = local38;
			} else {
				@Pc(67) int local67;
				if (local29 == -1) {
					local50 = this.method7375(local48);
					local67 = local38;
					if (this.aByteArrayArray47 != null && local31 != -1) {
						local50 += this.aByteArrayArray47[local31][local48];
					}
					local31 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local67 = local29;
					@Pc(74) String local74 = arg0.substring(local29 + 1, local38);
					local29 = -1;
					if (local74.equals("br")) {
						arg3[local33] = arg0.substring(local13, local38 + 1);
						local33++;
						if (arg3.length <= local33) {
							return 0;
						}
						local31 = -1;
						local11 = 0;
						local15 = -1;
						local13 = local38 + 1;
						continue;
					}
					if (local74.equals("lt")) {
						local50 = this.method7375(60);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][60];
						}
						local31 = 60;
					} else if (local74.equals("gt")) {
						local50 = this.method7375(62);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][62];
						}
						local31 = 62;
					} else if (local74.equals("nbsp")) {
						local50 = this.method7375(160);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][160];
						}
						local31 = 160;
					} else if (local74.equals("shy")) {
						local50 = this.method7375(173);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][173];
						}
						local31 = 173;
					} else if (local74.equals("times")) {
						local50 = this.method7375(215);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][215];
						}
						local31 = 215;
					} else if (local74.equals("euro")) {
						local50 = this.method7375(8364);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][8364];
						}
						local31 = 8364;
					} else if (local74.equals("copy")) {
						local50 = this.method7375(169);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][169];
						}
						local31 = 169;
					} else if (local74.equals("reg")) {
						local50 = this.method7375(174);
						if (this.aByteArrayArray47 != null && local31 != -1) {
							local50 += this.aByteArrayArray47[local31][174];
						}
						local31 = 174;
					} else if (local74.startsWith("img=") && arg1 != null) {
						try {
							@Pc(232) int local232 = Static406.method5727(local74.substring(4));
							local50 = arg1[local232].A();
							local31 = -1;
						} catch (@Pc(243) Exception local243) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg2 != null) {
						if (local48 == 32) {
							local27 = 1;
							local17 = local11;
							local15 = local38;
						}
						if (local11 > arg2[local33 >= arg2.length ? arg2.length - 1 : local33]) {
							if (local15 >= 0) {
								arg3[local33] = arg0.substring(local13, local15 + 1 - local27);
								local33++;
								if (arg3.length <= local33) {
									return 0;
								}
								local13 = local15 + 1;
								local31 = -1;
								local11 -= local17;
								local15 = -1;
							} else {
								arg3[local33] = arg0.substring(local13, local67);
								local33++;
								if (arg3.length <= local33) {
									return 0;
								}
								local31 = -1;
								local15 = -1;
								local13 = local67;
								local11 = local50;
							}
						}
						if (local48 == 45) {
							local15 = local38;
							local27 = 0;
							local17 = local11;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg3[local33] = arg0.substring(local13, arg0.length());
			local33++;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)I")
	public int method7375(@OriginalArg(1) int arg0) {
		return this.aByteArray218[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "([Lclient!f;BLjava/lang/String;)I")
	public int method7376(@OriginalArg(0) Class73[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg1.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(51) String local51 = arg1.substring(local11 + 1, local25);
					local11 = -1;
					if (local51.equals("lt")) {
						local31 = '<';
					} else if (local51.equals("gt")) {
						local31 = '>';
					} else if (local51.equals("nbsp")) {
						local31 = ' ';
					} else if (local51.equals("shy")) {
						local31 = '\u00ad';
					} else if (local51.equals("times")) {
						local31 = '×';
					} else if (local51.equals("euro")) {
						local31 = '€';
					} else if (local51.equals("copy")) {
						local31 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=") && arg0 != null) {
								try {
									@Pc(121) int local121 = Static406.method5727(local51.substring(4));
									local13 = -1;
									local20 += arg0[local121].A();
								} catch (@Pc(132) Exception local132) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local20 += this.aByteArray218[Static411.method5771(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray47 != null && local13 != -1) {
						local20 += this.aByteArrayArray47[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local20;
	}
}
