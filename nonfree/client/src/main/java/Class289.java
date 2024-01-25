import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class289 {

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "[B")
	private final byte[] aByteArray99;

	@OriginalMember(owner = "client!pga", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
	public final int anInt7755;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
	public final int anInt7758;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
	public final int anInt7763;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "([B)V")
	public Class289(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(arg0);
		@Pc(12) int local12 = local8.method8581(-17416);
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(32) boolean local32 = local8.method8581(-17416) == 1;
		this.aByteArray99 = new byte[256];
		local8.method8573(256, 0, this.aByteArray99);
		if (local32) {
			@Pc(48) int[] local48 = new int[256];
			for (@Pc(50) int local50 = 0; local50 < 256; local50++) {
				local48[local50] = local8.method8581(-17416);
			}
			@Pc(69) int[] local69 = new int[256];
			for (@Pc(71) int local71 = 0; local71 < 256; local71++) {
				local69[local71] = local8.method8581(-17416);
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(111) int local111;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local48[local94]];
				@Pc(109) byte local109 = 0;
				for (local111 = 0; local111 < local92[local94].length; local111++) {
					local109 += local8.method8536();
					local92[local94][local111] = local109;
				}
			}
			@Pc(144) byte[][] local144 = new byte[256][];
			@Pc(161) int local161;
			for (local111 = 0; local111 < 256; local111++) {
				local144[local111] = new byte[local48[local111]];
				@Pc(159) byte local159 = 0;
				for (local161 = 0; local161 < local144[local111].length; local161++) {
					local159 += local8.method8536();
					local144[local111][local161] = local159;
				}
			}
			this.aByteArrayArray15 = new byte[256][256];
			for (@Pc(204) int local204 = 0; local204 < 256; local204++) {
				if (local204 != 32 && local204 != 160) {
					for (local161 = 0; local161 < 256; local161++) {
						if (local161 != 32 && local161 != 160) {
							this.aByteArrayArray15[local204][local161] = (byte) Static369.method5298(local48, local92, local144, local204, local161, this.aByteArray99, local69);
						}
					}
				}
			}
			this.anInt7755 = local69[32] + local48[32];
		} else {
			this.anInt7755 = local8.method8581(-17416);
		}
		local8.method8581(-17416);
		local8.method8581(-17416);
		this.anInt7758 = local8.method8581(-17416);
		this.anInt7763 = local8.method8581(-17416);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ug;Z)I")
	public int method6930(@OriginalArg(0) String arg0, @OriginalArg(1) Class43[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(36) char local36 = arg0.charAt(local28);
			if (local36 == '<') {
				local19 = local28;
			} else {
				if (local36 == '>' && local19 != -1) {
					@Pc(62) String local62 = arg0.substring(local19 + 1, local28);
					local19 = -1;
					if (local62.equals("lt")) {
						local36 = '<';
					} else if (local62.equals("gt")) {
						local36 = '>';
					} else if (local62.equals("nbsp")) {
						local36 = ' ';
					} else if (local62.equals("shy")) {
						local36 = '\u00ad';
					} else if (local62.equals("times")) {
						local36 = '×';
					} else if (local62.equals("euro")) {
						local36 = '€';
					} else if (local62.equals("copy")) {
						local36 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=") && arg1 != null) {
								try {
									@Pc(160) int local160 = Static171.method2545(local62.substring(4));
									local23 += arg1[local160].method9587();
									local21 = -1;
								} catch (@Pc(171) Exception local171) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local19 == -1) {
					local23 += this.aByteArray99[Static575.method7988(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local21 != -1) {
						local23 += this.aByteArrayArray15[local21][local36];
					}
					local21 = local36;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/String;I[I[Ljava/lang/String;[Lclient!ug;)I")
	public int method6931(@OriginalArg(0) String arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class43[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(28) byte local28 = 0;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(51) int local51 = Static575.method7988(arg0.charAt(local39)) & 0xFF;
			@Pc(53) int local53 = 0;
			if (local51 == 60) {
				local30 = local39;
			} else {
				@Pc(75) int local75;
				if (local30 == -1) {
					local53 = this.method6941(local51);
					local75 = local39;
					if (this.aByteArrayArray15 != null && local32 != -1) {
						local53 += this.aByteArrayArray15[local32][local51];
					}
					local32 = local51;
				} else {
					if (local51 != 62) {
						continue;
					}
					local75 = local30;
					@Pc(113) String local113 = arg0.substring(local30 + 1, local39);
					local30 = -1;
					if (local113.equals("br")) {
						arg2[local34] = arg0.substring(local22, local39 + 1);
						local34++;
						if (arg2.length <= local34) {
							return 0;
						}
						local32 = -1;
						local22 = local39 + 1;
						local20 = 0;
						local24 = -1;
						continue;
					}
					if (local113.equals("lt")) {
						local53 = this.method6941(60);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][60];
						}
						local32 = 60;
					} else if (local113.equals("gt")) {
						local53 = this.method6941(62);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][62];
						}
						local32 = 62;
					} else if (local113.equals("nbsp")) {
						local53 = this.method6941(160);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][160];
						}
						local32 = 160;
					} else if (local113.equals("shy")) {
						local53 = this.method6941(173);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][173];
						}
						local32 = 173;
					} else if (local113.equals("times")) {
						local53 = this.method6941(215);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][215];
						}
						local32 = 215;
					} else if (local113.equals("euro")) {
						local53 = this.method6941(8364);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][8364];
						}
						local32 = 8364;
					} else if (local113.equals("copy")) {
						local53 = this.method6941(169);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][169];
						}
						local32 = 169;
					} else if (local113.equals("reg")) {
						local53 = this.method6941(174);
						if (this.aByteArrayArray15 != null && local32 != -1) {
							local53 += this.aByteArrayArray15[local32][174];
						}
						local32 = 174;
					} else if (local113.startsWith("img=") && arg3 != null) {
						try {
							@Pc(324) int local324 = Static171.method2545(local113.substring(4));
							local32 = -1;
							local53 = arg3[local324].method9587();
						} catch (@Pc(335) Exception local335) {
						}
					}
					local51 = -1;
				}
				if (local53 > 0) {
					local20 += local53;
					if (arg1 != null) {
						if (local51 == 32) {
							local26 = local20;
							local28 = 1;
							local24 = local39;
						}
						if (arg1[arg1.length > local34 ? local34 : arg1.length - 1] < local20) {
							if (local24 >= 0) {
								arg2[local34] = arg0.substring(local22, local24 + 1 - local28);
								local34++;
								if (local34 >= arg2.length) {
									return 0;
								}
								local22 = local24 + 1;
								local24 = -1;
								local32 = -1;
								local20 -= local26;
							} else {
								arg2[local34] = arg0.substring(local22, local75);
								local34++;
								if (local34 >= arg2.length) {
									return 0;
								}
								local22 = local75;
								local32 = -1;
								local20 = local53;
								local24 = -1;
							}
						}
						if (local51 == 45) {
							local28 = 0;
							local24 = local39;
							local26 = local20;
						}
					}
				}
			}
		}
		if (arg0.length() > local22) {
			arg2[local34] = arg0.substring(local22, arg0.length());
			local34++;
		}
		return local34;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILjava/lang/String;II[Lclient!ug;)I")
	public int method6934(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class43[] arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt7755;
		}
		@Pc(23) int local23 = this.method6931(arg1, new int[] { arg2 }, Static551.aStringArray28, arg3);
		@Pc(29) int local29 = arg0 * (local23 - 1);
		return this.anInt7763 + this.anInt7758 + local29;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method6935(@OriginalArg(0) String arg0) {
		return this.method6930(arg0, (Class43[]) null);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(CII)I")
	public int method6938(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray15 == null ? 0 : this.aByteArrayArray15[arg1][arg0];
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILjava/lang/String;[Lclient!ug;I)I")
	public int method6939(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class43[] arg2) {
		@Pc(18) int local18 = this.method6931(arg1, new int[] { arg0 }, Static551.aStringArray28, arg2);
		@Pc(20) int local20 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(42) int local42 = this.method6930(Static551.aStringArray28[local30], arg2);
			if (local42 > local20) {
				local20 = local42;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([Lclient!ug;IILjava/lang/String;)Ljava/lang/String;")
	public String method6940(@OriginalArg(0) Class43[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.method6930(arg2, arg0) <= arg1) {
			return arg2;
		}
		@Pc(29) int local29 = arg1 - this.method6930("...", (Class43[]) null);
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg2.length();
		@Pc(46) String local46 = "";
		for (@Pc(48) int local48 = 0; local48 < local44; local48++) {
			@Pc(56) char local56 = arg2.charAt(local48);
			if (local56 == '<') {
				local31 = local48;
			} else {
				if (local56 == '>' && local31 != -1) {
					@Pc(84) String local84 = arg2.substring(local31 + 1, local48);
					local31 = -1;
					if (local84.equals("lt")) {
						local56 = '<';
					} else if (local84.equals("gt")) {
						local56 = '>';
					} else if (local84.equals("nbsp")) {
						local56 = ' ';
					} else if (local84.equals("shy")) {
						local56 = '\u00ad';
					} else if (local84.equals("times")) {
						local56 = '×';
					} else if (local84.equals("euro")) {
						local56 = '€';
					} else if (local84.equals("copy")) {
						local56 = '©';
					} else {
						if (!local84.equals("reg")) {
							if (local84.startsWith("img=") && arg0 != null) {
								try {
									@Pc(192) int local192 = Static171.method2545(local84.substring(4));
									local41 += arg0[local192].method9587();
									local33 = -1;
									if (local41 > local29) {
										return local46 + "...";
									}
									local46 = arg2.substring(0, local48 + 1);
								} catch (@Pc(225) Exception local225) {
								}
							}
							continue;
						}
						local56 = '®';
					}
				}
				if (local31 == -1) {
					local41 += this.aByteArray99[Static575.method7988(local56) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local33 != -1) {
						local41 += this.aByteArrayArray15[local33][local56];
					}
					local33 = local56;
					@Pc(274) int local274 = local41;
					if (this.aByteArrayArray15 != null) {
						local274 = local41 + this.aByteArrayArray15[local56][46];
					}
					if (local274 > local29) {
						return local46 + "...";
					}
					local46 = arg2.substring(0, local48 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)I")
	public int method6941(@OriginalArg(1) int arg0) {
		return this.aByteArray99[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!ug;I)I")
	public int method6942(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43[] arg2) {
		return this.method6931(arg0, new int[] { arg1 }, Static551.aStringArray28, arg2);
	}
}
