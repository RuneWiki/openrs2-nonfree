import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class114 {

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public final int anInt2905;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	public final int anInt2912;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public final int anInt2911;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V")
	public Class114(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class11_Sub25 local8 = new Class11_Sub25(arg0);
		@Pc(12) int local12 = local8.method5185();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method5185() == 1;
		this.aByteArray43 = new byte[256];
		local8.method5209(this.aByteArray43, 256);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			@Pc(57) int[] local57 = new int[256];
			for (@Pc(59) int local59 = 0; local59 < 256; local59++) {
				local54[local59] = local8.method5185();
			}
			for (@Pc(73) int local73 = 0; local73 < 256; local73++) {
				local57[local73] = local8.method5185();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local54[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method5175();
					local90[local92][local105] = local103;
				}
			}
			@Pc(140) byte[][] local140 = new byte[256][];
			@Pc(155) int local155;
			for (local105 = 0; local105 < 256; local105++) {
				local140[local105] = new byte[local54[local105]];
				@Pc(153) byte local153 = 0;
				for (local155 = 0; local155 < local140[local105].length; local155++) {
					local153 += local8.method5175();
					local140[local105][local155] = local153;
				}
			}
			this.aByteArrayArray21 = new byte[256][256];
			for (@Pc(192) int local192 = 0; local192 < 256; local192++) {
				if (local192 != 32 && local192 != 160) {
					for (local155 = 0; local155 < 256; local155++) {
						if (local155 != 32 && local155 != 160) {
							this.aByteArrayArray21[local192][local155] = (byte) Static194.method3159(local140, local90, this.aByteArray43, local155, local57, local54, local192);
						}
					}
				}
			}
			this.anInt2905 = local54[32] + local57[32];
		} else {
			this.anInt2905 = local8.method5185();
		}
		local8.method5185();
		local8.method5185();
		this.anInt2912 = local8.method5185();
		this.anInt2911 = local8.method5185();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(CII)I")
	public int method2467(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray21 == null ? 0 : this.aByteArrayArray21[arg1][arg0];
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([IZLjava/lang/String;[Ljava/lang/String;[Lclient!sg;)I")
	public int method2469(@OriginalArg(0) int[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class97[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(25) byte local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg1.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static171.method2793(arg1.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local27 = local36;
			} else {
				@Pc(68) int local68;
				if (local27 == -1) {
					local48 = this.method2475(local46);
					local68 = local36;
					if (this.aByteArrayArray21 != null && local29 != -1) {
						local48 += this.aByteArrayArray21[local29][local46];
					}
					local29 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local68 = local27;
					@Pc(75) String local75 = arg1.substring(local27 + 1, local36);
					local27 = -1;
					if (local75.equals("br")) {
						arg2[local31] = arg1.substring(local19, local36 + 1);
						local31++;
						if (local31 >= arg2.length) {
							return 0;
						}
						local17 = 0;
						local21 = -1;
						local19 = local36 + 1;
						local29 = -1;
						continue;
					}
					if (local75.equals("lt")) {
						local48 = this.method2475(60);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][60];
						}
						local29 = 60;
					} else if (local75.equals("gt")) {
						local48 = this.method2475(62);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][62];
						}
						local29 = 62;
					} else if (local75.equals("nbsp")) {
						local48 = this.method2475(160);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][160];
						}
						local29 = 160;
					} else if (local75.equals("shy")) {
						local48 = this.method2475(173);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][173];
						}
						local29 = 173;
					} else if (local75.equals("times")) {
						local48 = this.method2475(215);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][215];
						}
						local29 = 215;
					} else if (local75.equals("euro")) {
						local48 = this.method2475(8364);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][8364];
						}
						local29 = 8364;
					} else if (local75.equals("copy")) {
						local48 = this.method2475(169);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][169];
						}
						local29 = 169;
					} else if (local75.equals("reg")) {
						local48 = this.method2475(174);
						if (this.aByteArrayArray21 != null && local29 != -1) {
							local48 += this.aByteArrayArray21[local29][174];
						}
						local29 = 174;
					} else if (local75.startsWith("img=") && arg3 != null) {
						try {
							@Pc(258) int local258 = Static87.method1250(local75.substring(4));
							local48 = arg3[local258].method5542();
							local29 = -1;
						} catch (@Pc(269) Exception local269) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local17 += local48;
					if (arg0 != null) {
						if (local46 == 32) {
							local25 = 1;
							local23 = local17;
							local21 = local36;
						}
						if (local17 > arg0[arg0.length > local31 ? local31 : arg0.length - 1]) {
							if (local21 < 0) {
								arg2[local31] = arg1.substring(local19, local68);
								local31++;
								if (arg2.length <= local31) {
									return 0;
								}
								local17 = local48;
								local21 = -1;
								local29 = -1;
								local19 = local68;
							} else {
								arg2[local31] = arg1.substring(local19, local21 + 1 - local25);
								local31++;
								if (arg2.length <= local31) {
									return 0;
								}
								local19 = local21 + 1;
								local21 = -1;
								local17 -= local23;
								local29 = -1;
							}
						}
						if (local46 == 45) {
							local23 = local17;
							local21 = local36;
							local25 = 0;
						}
					}
				}
			}
		}
		if (arg1.length() > local19) {
			arg2[local31] = arg1.substring(local19, arg1.length());
			local31++;
		}
		return local31;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;Z[Lclient!sg;)I")
	public int method2470(@OriginalArg(0) String arg0, @OriginalArg(2) Class97[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = arg0.charAt(local20);
			if (local31 == '<') {
				local11 = local20;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local55.equals("lt")) {
						local31 = '<';
					} else if (local55.equals("gt")) {
						local31 = '>';
					} else if (local55.equals("nbsp")) {
						local31 = ' ';
					} else if (local55.equals("shy")) {
						local31 = '\u00ad';
					} else if (local55.equals("times")) {
						local31 = '×';
					} else if (local55.equals("euro")) {
						local31 = '€';
					} else if (local55.equals("copy")) {
						local31 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg1 != null) {
								try {
									@Pc(127) int local127 = Static87.method1250(local55.substring(4));
									local13 = -1;
									local15 += arg1[local127].method5542();
								} catch (@Pc(138) Exception local138) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray43[Static171.method2793(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray21 != null && local13 != -1) {
						local15 += this.aByteArrayArray21[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method2472(@OriginalArg(0) String arg0) {
		return this.method2470(arg0, null);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI[Lclient!sg;Ljava/lang/String;)I")
	public int method2474(@OriginalArg(1) int arg0, @OriginalArg(2) Class97[] arg1, @OriginalArg(3) String arg2) {
		return this.method2469(new int[] { arg0 }, arg2, Static172.aStringArray26, arg1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
	public int method2475(@OriginalArg(0) int arg0) {
		return this.aByteArray43[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([Lclient!sg;ILjava/lang/String;B)I")
	public int method2476(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(26) int local26 = this.method2469(new int[] { arg1 }, arg2, Static172.aStringArray26, arg0);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method2470(Static172.aStringArray26[local30], arg0);
			if (local40 > local28) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!sg;I)I")
	public int method2477(@OriginalArg(1) String arg0, @OriginalArg(3) Class97[] arg1) {
		@Pc(5) int local5 = this.anInt2905;
		@Pc(22) int local22 = this.method2469(new int[] { 100 }, arg0, Static172.aStringArray26, arg1);
		@Pc(28) int local28 = local5 * (local22 - 1);
		return this.anInt2911 + local28 + this.anInt2912;
	}
}
