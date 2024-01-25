import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class151 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
	public final int anInt3920;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
	public final int anInt3921;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
	public final int anInt3915;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V")
	public Class151(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub23 local8 = new Class6_Sub23(arg0);
		@Pc(12) int local12 = local8.method8374();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method8374() == 1;
		this.aByteArray47 = new byte[256];
		local8.method8375(256, this.aByteArray47, 0);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			@Pc(59) int[] local59 = new int[256];
			for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
				local56[local61] = local8.method8374();
			}
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local59[local75] = local8.method8374();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local56[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method8391();
					local90[local92][local105] = local103;
				}
			}
			@Pc(136) byte[][] local136 = new byte[256][];
			@Pc(151) int local151;
			for (local105 = 0; local105 < 256; local105++) {
				local136[local105] = new byte[local56[local105]];
				@Pc(149) byte local149 = 0;
				for (local151 = 0; local151 < local136[local105].length; local151++) {
					local149 += local8.method8391();
					local136[local105][local151] = local149;
				}
			}
			this.aByteArrayArray12 = new byte[256][256];
			for (@Pc(184) int local184 = 0; local184 < 256; local184++) {
				if (local184 != 32 && local184 != 160) {
					for (local151 = 0; local151 < 256; local151++) {
						if (local151 != 32 && local151 != 160) {
							this.aByteArrayArray12[local184][local151] = (byte) Static16.method464(local151, local136, local59, this.aByteArray47, local90, local56, local184);
						}
					}
				}
			}
			this.anInt3920 = local59[32] + local56[32];
		} else {
			this.anInt3920 = local8.method8374();
		}
		local8.method8374();
		local8.method8374();
		this.anInt3921 = local8.method8374();
		this.anInt3915 = local8.method8374();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)I")
	public int method3322(@OriginalArg(1) int arg0) {
		return this.aByteArray47[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3323(@OriginalArg(0) String arg0) {
		return this.method3326((Class9[]) null, arg0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLjava/lang/String;II[Lclient!ho;)I")
	public int method3324(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt3920;
		}
		@Pc(24) int local24 = this.method3325(arg3, Static579.aStringArray60, arg0, new int[] { arg1 });
		@Pc(30) int local30 = (local24 - 1) * arg2;
		return this.anInt3915 + this.anInt3921 + local30;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lclient!ho;[Ljava/lang/String;Ljava/lang/String;[IZ)I")
	public int method3325(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 == null) {
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
		@Pc(28) int local28 = arg2.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static2.method8467(arg2.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(58) int local58;
				if (local21 == -1) {
					local58 = local30;
					local42 = this.method3322(local40);
					if (this.aByteArrayArray12 != null && local23 != -1) {
						local42 += this.aByteArrayArray12[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local58 = local21;
					@Pc(65) String local65 = arg2.substring(local21 + 1, local30);
					local21 = -1;
					if (local65.equals("br")) {
						arg1[local25] = arg2.substring(local13, local30 + 1);
						local25++;
						if (arg1.length <= local25) {
							return 0;
						}
						local13 = local30 + 1;
						local11 = 0;
						local15 = -1;
						local23 = -1;
						continue;
					}
					if (local65.equals("lt")) {
						local42 = this.method3322(60);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][60];
						}
						local23 = 60;
					} else if (local65.equals("gt")) {
						local42 = this.method3322(62);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][62];
						}
						local23 = 62;
					} else if (local65.equals("nbsp")) {
						local42 = this.method3322(160);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][160];
						}
						local23 = 160;
					} else if (local65.equals("shy")) {
						local42 = this.method3322(173);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][173];
						}
						local23 = 173;
					} else if (local65.equals("times")) {
						local42 = this.method3322(215);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][215];
						}
						local23 = 215;
					} else if (local65.equals("euro")) {
						local42 = this.method3322(8364);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][8364];
						}
						local23 = 8364;
					} else if (local65.equals("copy")) {
						local42 = this.method3322(169);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][169];
						}
						local23 = 169;
					} else if (local65.equals("reg")) {
						local42 = this.method3322(174);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local42 += this.aByteArrayArray12[local23][174];
						}
						local23 = 174;
					} else if (local65.startsWith("img=") && arg0 != null) {
						try {
							@Pc(303) int local303 = Static368.method5312(local65.substring(4));
							local23 = -1;
							local42 = arg0[local303].method8937();
						} catch (@Pc(314) Exception local314) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg3 != null) {
						if (local40 == 32) {
							local17 = local11;
							local15 = local30;
							local19 = 1;
						}
						if (local11 > arg3[arg3.length <= local25 ? arg3.length - 1 : local25]) {
							if (local15 >= 0) {
								arg1[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local11 -= local17;
								local15 = -1;
							} else {
								arg1[local25] = arg2.substring(local13, local58);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local13 = local58;
								local11 = local42;
								local15 = -1;
								local23 = -1;
							}
						}
						if (local40 == 45) {
							local17 = local11;
							local15 = local30;
							local19 = 0;
						}
					}
				}
			}
		}
		if (arg2.length() > local13) {
			arg1[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lclient!ho;Ljava/lang/String;Z)I")
	public int method3326(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg1.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(37) char local37 = arg1.charAt(local31);
			if (local37 == '<') {
				local22 = local31;
			} else {
				if (local37 == '>' && local22 != -1) {
					@Pc(62) String local62 = arg1.substring(local22 + 1, local31);
					local22 = -1;
					if (local62.equals("lt")) {
						local37 = '<';
					} else if (local62.equals("gt")) {
						local37 = '>';
					} else if (local62.equals("nbsp")) {
						local37 = ' ';
					} else if (local62.equals("shy")) {
						local37 = '\u00ad';
					} else if (local62.equals("times")) {
						local37 = '×';
					} else if (local62.equals("euro")) {
						local37 = '€';
					} else if (local62.equals("copy")) {
						local37 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=") && arg0 != null) {
								try {
									@Pc(124) int local124 = Static368.method5312(local62.substring(4));
									local26 += arg0[local124].method8937();
									local24 = -1;
								} catch (@Pc(135) Exception local135) {
								}
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local22 == -1) {
					local26 += this.aByteArray47[Static2.method8467(local37) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local24 != -1) {
						local26 += this.aByteArrayArray12[local24][local37];
					}
					local24 = local37;
				}
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[Lclient!ho;Ljava/lang/String;)I")
	public int method3327(@OriginalArg(1) int arg0, @OriginalArg(2) Class9[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method3325(arg1, Static579.aStringArray60, arg2, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method3326(arg1, Static579.aStringArray60[local22]);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lclient!ho;IILjava/lang/String;)Ljava/lang/String;")
	public String method3329(@OriginalArg(0) Class9[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 >= this.method3326(arg0, arg2)) {
			return arg2;
		}
		@Pc(26) int local26 = arg1 - this.method3326((Class9[]) null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg2.length();
		@Pc(37) String local37 = "";
		for (@Pc(44) int local44 = 0; local44 < local35; local44++) {
			@Pc(50) char local50 = arg2.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(72) String local72 = arg2.substring(local28 + 1, local44);
					local28 = -1;
					if (local72.equals("lt")) {
						local50 = '<';
					} else if (local72.equals("gt")) {
						local50 = '>';
					} else if (local72.equals("nbsp")) {
						local50 = ' ';
					} else if (local72.equals("shy")) {
						local50 = '\u00ad';
					} else if (local72.equals("times")) {
						local50 = '×';
					} else if (local72.equals("euro")) {
						local50 = '€';
					} else if (local72.equals("copy")) {
						local50 = '©';
					} else {
						if (!local72.equals("reg")) {
							if (local72.startsWith("img=") && arg0 != null) {
								try {
									@Pc(138) int local138 = Static368.method5312(local72.substring(4));
									local30 = -1;
									local32 += arg0[local138].method8937();
									if (local32 > local26) {
										return local37 + "...";
									}
									local37 = arg2.substring(0, local44 + 1);
								} catch (@Pc(168) Exception local168) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray47[Static2.method8467(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local30 != -1) {
						local32 += this.aByteArrayArray12[local30][local50];
					}
					local30 = local50;
					@Pc(215) int local215 = local32;
					if (this.aByteArrayArray12 != null) {
						local215 = local32 + this.aByteArrayArray12[local50][46];
					}
					if (local215 > local26) {
						return local37 + "...";
					}
					local37 = arg2.substring(0, local44 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!ho;)I")
	public int method3330(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class9[] arg2) {
		return this.method3325(arg2, Static579.aStringArray60, arg1, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ICI)I")
	public int method3332(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray12 == null ? 0 : this.aByteArrayArray12[arg0][arg1];
	}
}
