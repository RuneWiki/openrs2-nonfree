import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class158 {

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[B")
	private final byte[] aByteArray55;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public final int anInt4348;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	public final int anInt4354;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public final int anInt4347;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
	public Class158(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class14_Sub29 local8 = new Class14_Sub29(arg0);
		@Pc(12) int local12 = local8.method5866();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method5866() == 1;
		this.aByteArray55 = new byte[256];
		local8.method5860(this.aByteArray55, 0, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method5866();
			}
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local49[local67] = local8.method5866();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method5845();
					local82[local84][local97] = local95;
				}
			}
			@Pc(126) byte[][] local126 = new byte[256][];
			@Pc(141) int local141;
			for (local97 = 0; local97 < 256; local97++) {
				local126[local97] = new byte[local46[local97]];
				@Pc(139) byte local139 = 0;
				for (local141 = 0; local141 < local126[local97].length; local141++) {
					local139 += local8.method5845();
					local126[local97][local141] = local139;
				}
			}
			this.aByteArrayArray26 = new byte[256][256];
			for (@Pc(176) int local176 = 0; local176 < 256; local176++) {
				if (local176 != 32 && local176 != 160) {
					for (local141 = 0; local141 < 256; local141++) {
						if (local141 != 32 && local141 != 160) {
							this.aByteArrayArray26[local176][local141] = (byte) Static196.method3021(local46, local141, local176, local126, local49, this.aByteArray55, local82);
						}
					}
				}
			}
			this.anInt4348 = local46[32] + local49[32];
		} else {
			this.anInt4348 = local8.method5866();
		}
		local8.method5866();
		local8.method5866();
		this.anInt4354 = local8.method5866();
		this.anInt4347 = local8.method5866();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[Ljava/lang/String;[Lclient!jd;Ljava/lang/String;B)I")
	public int method3596(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg3.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static591.method8411(arg3.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(61) int local61;
				if (local21 == -1) {
					local61 = local35;
					local47 = this.method3606(local45);
					if (this.aByteArrayArray26 != null && local23 != -1) {
						local47 += this.aByteArrayArray26[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local61 = local21;
					@Pc(100) String local100 = arg3.substring(local21 + 1, local35);
					local21 = -1;
					if (local100.equals("br")) {
						arg1[local30] = arg3.substring(local13, local35 + 1);
						local30++;
						if (local30 >= arg1.length) {
							return 0;
						}
						local15 = -1;
						local23 = -1;
						local13 = local35 + 1;
						local11 = 0;
						continue;
					}
					if (local100.equals("lt")) {
						local47 = this.method3606(60);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][60];
						}
						local23 = 60;
					} else if (local100.equals("gt")) {
						local47 = this.method3606(62);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][62];
						}
						local23 = 62;
					} else if (local100.equals("nbsp")) {
						local47 = this.method3606(160);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][160];
						}
						local23 = 160;
					} else if (local100.equals("shy")) {
						local47 = this.method3606(173);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][173];
						}
						local23 = 173;
					} else if (local100.equals("times")) {
						local47 = this.method3606(215);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][215];
						}
						local23 = 215;
					} else if (local100.equals("euro")) {
						local47 = this.method3606(8364);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][8364];
						}
						local23 = 8364;
					} else if (local100.equals("copy")) {
						local47 = this.method3606(169);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][169];
						}
						local23 = 169;
					} else if (local100.equals("reg")) {
						local47 = this.method3606(174);
						if (this.aByteArrayArray26 != null && local23 != -1) {
							local47 += this.aByteArrayArray26[local23][174];
						}
						local23 = 174;
					} else if (local100.startsWith("img=") && arg2 != null) {
						try {
							@Pc(341) int local341 = Static235.method3555(local100.substring(4));
							local47 = arg2[local341].method7394();
							local23 = -1;
						} catch (@Pc(352) Exception local352) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local19 = 1;
							local17 = local11;
							local15 = local35;
						}
						if (arg0[local30 < arg0.length ? local30 : arg0.length - 1] < local11) {
							if (local15 < 0) {
								arg1[local30] = arg3.substring(local13, local61);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local23 = -1;
								local11 = local47;
								local15 = -1;
								local13 = local61;
							} else {
								arg1[local30] = arg3.substring(local13, local15 + 1 - local19);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local11 -= local17;
								local15 = -1;
							}
						}
						if (local45 == 45) {
							local15 = local35;
							local17 = local11;
							local19 = 0;
						}
					}
				}
			}
		}
		if (local13 < arg3.length()) {
			arg1[local30] = arg3.substring(local13, arg3.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lclient!jd;Ljava/lang/String;IB)I")
	public int method3599(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(27) int local27 = this.method3596(new int[] { arg2 }, Static52.aStringArray4, arg0, arg1);
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			@Pc(41) int local41 = this.method3600(Static52.aStringArray4[local31], arg0);
			if (local29 < local41) {
				local29 = local41;
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;[Lclient!jd;B)I")
	public int method3600(@OriginalArg(0) String arg0, @OriginalArg(1) Class20[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 == '<') {
				local11 = local20;
			} else {
				if (local26 == '>' && local11 != -1) {
					@Pc(47) String local47 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local47.equals("lt")) {
						local26 = '<';
					} else if (local47.equals("gt")) {
						local26 = '>';
					} else if (local47.equals("nbsp")) {
						local26 = ' ';
					} else if (local47.equals("shy")) {
						local26 = '\u00ad';
					} else if (local47.equals("times")) {
						local26 = '×';
					} else if (local47.equals("euro")) {
						local26 = '€';
					} else if (local47.equals("copy")) {
						local26 = '©';
					} else {
						if (!local47.equals("reg")) {
							if (local47.startsWith("img=") && arg1 != null) {
								try {
									@Pc(115) int local115 = Static235.method3555(local47.substring(4));
									local13 = -1;
									local15 += arg1[local115].method7394();
								} catch (@Pc(126) Exception local126) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray55[Static591.method8411(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray26 != null && local13 != -1) {
						local15 += this.aByteArrayArray26[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3601(@OriginalArg(0) String arg0) {
		return this.method3600(arg0, (Class20[]) null);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(CBI)I")
	public int method3602(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray26 == null ? 0 : this.aByteArrayArray26[arg1][arg0];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;B[Lclient!jd;I)I")
	public int method3603(@OriginalArg(0) String arg0, @OriginalArg(2) Class20[] arg1, @OriginalArg(3) int arg2) {
		return this.method3596(new int[] { arg2 }, Static52.aStringArray4, arg1, arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;[Lclient!jd;II)Ljava/lang/String;")
	public String method3604(@OriginalArg(0) String arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(3) int arg2) {
		if (this.method3600(arg0, arg1) <= arg2) {
			return arg0;
		}
		@Pc(26) int local26 = arg2 - this.method3600("...", (Class20[]) null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg0.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(68) String local68 = arg0.substring(local28 + 1, local39);
					local28 = -1;
					if (local68.equals("lt")) {
						local45 = '<';
					} else if (local68.equals("gt")) {
						local45 = '>';
					} else if (local68.equals("nbsp")) {
						local45 = ' ';
					} else if (local68.equals("shy")) {
						local45 = '\u00ad';
					} else if (local68.equals("times")) {
						local45 = '×';
					} else if (local68.equals("euro")) {
						local45 = '€';
					} else if (local68.equals("copy")) {
						local45 = '©';
					} else {
						if (!local68.equals("reg")) {
							if (local68.startsWith("img=") && arg1 != null) {
								try {
									@Pc(132) int local132 = Static235.method3555(local68.substring(4));
									local32 += arg1[local132].method7394();
									local30 = -1;
									if (local32 > local26) {
										return local37 + "...";
									}
									local37 = arg0.substring(0, local39 + 1);
								} catch (@Pc(166) Exception local166) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray55[Static591.method8411(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray26 != null && local30 != -1) {
						local32 += this.aByteArrayArray26[local30][local45];
					}
					local30 = local45;
					@Pc(218) int local218 = local32;
					if (this.aByteArrayArray26 != null) {
						local218 = local32 + this.aByteArrayArray26[local45][46];
					}
					if (local26 < local218) {
						return local37 + "...";
					}
					local37 = arg0.substring(0, local39 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)I")
	public int method3606(@OriginalArg(0) int arg0) {
		return this.aByteArray55[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[Lclient!jd;Ljava/lang/String;II)I")
	public int method3607(@OriginalArg(0) int arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt4348;
		}
		@Pc(26) int local26 = this.method3596(new int[] { arg0 }, Static52.aStringArray4, arg1, arg2);
		@Pc(32) int local32 = arg3 * (local26 - 1);
		return this.anInt4347 + local32 + this.anInt4354;
	}
}
