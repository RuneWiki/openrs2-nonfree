import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class166 {

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public final int anInt4594;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public final int anInt4596;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public final int anInt4593;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "([B)V")
	public Class166(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub1 local8 = new Class6_Sub1(arg0);
		@Pc(12) int local12 = local8.method6433();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method6433() == 1;
		this.aByteArray56 = new byte[256];
		local8.method6434(this.aByteArray56, 256);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method6433();
			}
			@Pc(71) int[] local71 = new int[256];
			for (@Pc(73) int local73 = 0; local73 < 256; local73++) {
				local71[local73] = local8.method6433();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local54[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method6438();
					local90[local92][local105] = local103;
				}
			}
			@Pc(136) byte[][] local136 = new byte[256][];
			@Pc(151) int local151;
			for (local105 = 0; local105 < 256; local105++) {
				local136[local105] = new byte[local54[local105]];
				@Pc(149) byte local149 = 0;
				for (local151 = 0; local151 < local136[local105].length; local151++) {
					local149 += local8.method6438();
					local136[local105][local151] = local149;
				}
			}
			this.aByteArrayArray15 = new byte[256][256];
			for (@Pc(186) int local186 = 0; local186 < 256; local186++) {
				if (local186 != 32 && local186 != 160) {
					for (local151 = 0; local151 < 256; local151++) {
						if (local151 != 32 && local151 != 160) {
							this.aByteArrayArray15[local186][local151] = (byte) Static161.method2675(local54, local90, local151, local136, this.aByteArray56, local186, local71);
						}
					}
				}
			}
			this.anInt4594 = local54[32] + local71[32];
		} else {
			this.anInt4594 = local8.method6433();
		}
		local8.method6433();
		local8.method6433();
		this.anInt4596 = local8.method6433();
		this.anInt4593 = local8.method6433();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([Lclient!qg;ILjava/lang/String;[Ljava/lang/String;[I)I")
	public int method3883(@OriginalArg(0) Class87[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = 0;
		@Pc(29) byte local29 = 0;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(50) int local50 = Static240.method3701(arg1.charAt(local40)) & 0xFF;
			@Pc(52) int local52 = 0;
			if (local50 == 60) {
				local31 = local40;
			} else {
				@Pc(67) int local67;
				if (local31 == -1) {
					local67 = local40;
					local52 = this.method3886(local50);
					if (this.aByteArrayArray15 != null && local33 != -1) {
						local52 += this.aByteArrayArray15[local33][local50];
					}
					local33 = local50;
				} else {
					if (local50 != 62) {
						continue;
					}
					local67 = local31;
					@Pc(106) String local106 = arg1.substring(local31 + 1, local40);
					local31 = -1;
					if (local106.equals("br")) {
						arg2[local35] = arg1.substring(local23, local40 + 1);
						local35++;
						if (local35 >= arg2.length) {
							return 0;
						}
						local23 = local40 + 1;
						local11 = 0;
						local33 = -1;
						local25 = -1;
						continue;
					}
					if (local106.equals("lt")) {
						local52 = this.method3886(60);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][60];
						}
						local33 = 60;
					} else if (local106.equals("gt")) {
						local52 = this.method3886(62);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][62];
						}
						local33 = 62;
					} else if (local106.equals("nbsp")) {
						local52 = this.method3886(160);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][160];
						}
						local33 = 160;
					} else if (local106.equals("shy")) {
						local52 = this.method3886(173);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][173];
						}
						local33 = 173;
					} else if (local106.equals("times")) {
						local52 = this.method3886(215);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][215];
						}
						local33 = 215;
					} else if (local106.equals("euro")) {
						local52 = this.method3886(8364);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][8364];
						}
						local33 = 8364;
					} else if (local106.equals("copy")) {
						local52 = this.method3886(169);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][169];
						}
						local33 = 169;
					} else if (local106.equals("reg")) {
						local52 = this.method3886(174);
						if (this.aByteArrayArray15 != null && local33 != -1) {
							local52 += this.aByteArrayArray15[local33][174];
						}
						local33 = 174;
					} else if (local106.startsWith("img=") && arg0 != null) {
						try {
							@Pc(319) int local319 = Static221.method3333(local106.substring(4));
							local52 = arg0[local319].method6565();
							local33 = -1;
						} catch (@Pc(330) Exception local330) {
						}
					}
					local50 = -1;
				}
				if (local52 > 0) {
					local11 += local52;
					if (arg3 != null) {
						if (local50 == 32) {
							local29 = 1;
							local25 = local40;
							local27 = local11;
						}
						if (local11 > arg3[local35 >= arg3.length ? arg3.length - 1 : local35]) {
							if (local25 < 0) {
								arg2[local35] = arg1.substring(local23, local67);
								local35++;
								if (arg2.length <= local35) {
									return 0;
								}
								local33 = -1;
								local23 = local67;
								local25 = -1;
								local11 = local52;
							} else {
								arg2[local35] = arg1.substring(local23, local25 + 1 - local29);
								local35++;
								if (local35 >= arg2.length) {
									return 0;
								}
								local23 = local25 + 1;
								local25 = -1;
								local11 -= local27;
								local33 = -1;
							}
						}
						if (local50 == 45) {
							local29 = 0;
							local27 = local11;
							local25 = local40;
						}
					}
				}
			}
		}
		if (local23 < arg1.length()) {
			arg2[local35] = arg1.substring(local23, arg1.length());
			local35++;
		}
		return local35;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!qg;)I")
	public int method3884(@OriginalArg(0) String arg0, @OriginalArg(2) Class87[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(37) char local37 = arg0.charAt(local31);
			if (local37 == '<') {
				local22 = local31;
			} else {
				if (local37 == '>' && local22 != -1) {
					@Pc(58) String local58 = arg0.substring(local22 + 1, local31);
					local22 = -1;
					if (local58.equals("lt")) {
						local37 = '<';
					} else if (local58.equals("gt")) {
						local37 = '>';
					} else if (local58.equals("nbsp")) {
						local37 = ' ';
					} else if (local58.equals("shy")) {
						local37 = '\u00ad';
					} else if (local58.equals("times")) {
						local37 = '×';
					} else if (local58.equals("euro")) {
						local37 = '€';
					} else if (local58.equals("copy")) {
						local37 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=") && arg1 != null) {
								try {
									@Pc(134) int local134 = Static221.method3333(local58.substring(4));
									local24 = -1;
									local26 += arg1[local134].method6565();
								} catch (@Pc(145) Exception local145) {
								}
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local22 == -1) {
					local26 += this.aByteArray56[Static240.method3701(local37) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local24 != -1) {
						local26 += this.aByteArrayArray15[local24][local37];
					}
					local24 = local37;
				}
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(CII)I")
	public int method3885(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray15 == null ? 0 : this.aByteArrayArray15[arg1][arg0];
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)I")
	public int method3886(@OriginalArg(1) int arg0) {
		return this.aByteArray56[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;[Lclient!qg;Z)I")
	public int method3887(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class87[] arg2) {
		@Pc(24) int local24 = this.method3883(arg2, arg1, Static159.aStringArray33, new int[] { arg0 });
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(38) int local38 = this.method3884(Static159.aStringArray33[local28], arg2);
			if (local26 < local38) {
				local26 = local38;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!qg;I)Ljava/lang/String;")
	public String method3888(@OriginalArg(0) String arg0, @OriginalArg(2) Class87[] arg1, @OriginalArg(3) int arg2) {
		if (this.method3884(arg0, arg1) <= arg2) {
			return arg0;
		}
		@Pc(22) int local22 = arg2 - this.method3884("...", null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		@Pc(33) String local33 = "";
		for (@Pc(35) int local35 = 0; local35 < local31; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local41 == '<') {
				local24 = local35;
			} else {
				if (local41 == '>' && local24 != -1) {
					@Pc(61) String local61 = arg0.substring(local24 + 1, local35);
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
									@Pc(119) int local119 = Static221.method3333(local61.substring(4));
									local28 += arg1[local119].method6565();
									local26 = -1;
									if (local28 > local22) {
										return local33 + "...";
									}
									local33 = arg0.substring(0, local35 + 1);
								} catch (@Pc(149) Exception local149) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray56[Static240.method3701(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local26 != -1) {
						local28 += this.aByteArrayArray15[local26][local41];
					}
					local26 = local41;
					@Pc(205) int local205 = local28;
					if (this.aByteArrayArray15 != null) {
						local205 = local28 + this.aByteArrayArray15[local41][46];
					}
					if (local205 > local22) {
						return local33 + "...";
					}
					local33 = arg0.substring(0, local35 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/lang/String;[Lclient!qg;I)I")
	public int method3889(@OriginalArg(1) String arg0, @OriginalArg(2) Class87[] arg1, @OriginalArg(3) int arg2) {
		return this.method3883(arg1, arg0, Static159.aStringArray33, new int[] { arg2 });
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3892(@OriginalArg(1) String arg0) {
		return this.method3884(arg0, null);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;[Lclient!qg;II)I")
	public int method3893(@OriginalArg(1) String arg0, @OriginalArg(2) Class87[] arg1) {
		@Pc(4) int local4 = this.anInt4594;
		@Pc(31) int local31 = this.method3883(arg1, arg0, Static159.aStringArray33, new int[] { 100 });
		@Pc(37) int local37 = (local31 - 1) * local4;
		return this.anInt4593 + local37 + this.anInt4596;
	}
}
