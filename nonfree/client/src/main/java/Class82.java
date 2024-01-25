import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class82 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public final int anInt2403;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public final int anInt2404;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public final int anInt2400;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V")
	public Class82(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub12 local8 = new Class2_Sub12(arg0);
		@Pc(12) int local12 = local8.method3124();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method3124() == 1;
		this.aByteArray22 = new byte[256];
		local8.method3137(this.aByteArray22, 256);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local8.method3124();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local47[local65] = local8.method3124();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local44[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method3122();
					local82[local84][local97] = local95;
				}
			}
			@Pc(128) byte[][] local128 = new byte[256][];
			@Pc(143) int local143;
			for (local97 = 0; local97 < 256; local97++) {
				local128[local97] = new byte[local44[local97]];
				@Pc(141) byte local141 = 0;
				for (local143 = 0; local143 < local128[local97].length; local143++) {
					local141 += local8.method3122();
					local128[local97][local143] = local141;
				}
			}
			this.aByteArrayArray6 = new byte[256][256];
			for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
				if (local182 != 32 && local182 != 160) {
					for (local143 = 0; local143 < 256; local143++) {
						if (local143 != 32 && local143 != 160) {
							this.aByteArrayArray6[local182][local143] = (byte) Static123.method2388(local128, local47, local82, this.aByteArray22, local182, local44, local143);
						}
					}
				}
			}
			this.anInt2403 = local44[32] + local47[32];
		} else {
			this.anInt2403 = local8.method3124();
		}
		local8.method3124();
		local8.method3124();
		this.anInt2404 = local8.method3124();
		this.anInt2400 = local8.method3124();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIC)I")
	public int method2228(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray6 == null ? 0 : this.aByteArrayArray6[arg0][arg1];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;[Lclient!kr;B)I")
	public int method2229(@OriginalArg(0) String arg0, @OriginalArg(1) Class46[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(24) int local24 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg0.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg0.substring(local11 + 1, local26);
					local11 = -1;
					if (local54.equals("lt")) {
						local32 = '<';
					} else if (local54.equals("gt")) {
						local32 = '>';
					} else if (local54.equals("nbsp")) {
						local32 = ' ';
					} else if (local54.equals("shy")) {
						local32 = '\u00ad';
					} else if (local54.equals("times")) {
						local32 = '×';
					} else if (local54.equals("euro")) {
						local32 = '€';
					} else if (local54.equals("copy")) {
						local32 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg1 != null) {
								try {
									@Pc(120) int local120 = Static16.method250(local54.substring(4));
									local13 = -1;
									local15 += arg1[local120].method5031();
								} catch (@Pc(131) Exception local131) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray22[Static263.method4649(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray6 != null && local13 != -1) {
						local15 += this.aByteArrayArray6[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2230(@OriginalArg(1) String arg0) {
		return this.method2229(arg0, null);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	public int method2233(@OriginalArg(1) int arg0) {
		return this.aByteArray22[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([Lclient!kr;Ljava/lang/String;IBI)I")
	public int method2234(@OriginalArg(0) Class46[] arg0, @OriginalArg(1) String arg1) {
		@Pc(16) int local16 = this.anInt2403;
		@Pc(29) int local29 = this.method2235(new int[] { 100 }, arg0, arg1, Static125.aStringArray18);
		@Pc(35) int local35 = (local29 - 1) * local16;
		return local35 + this.anInt2404 + this.anInt2400;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([I[Lclient!kr;BLjava/lang/String;[Ljava/lang/String;)I")
	public int method2235(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(26) byte local26 = 0;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg2.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(47) int local47 = Static263.method4649(arg2.charAt(local37)) & 0xFF;
			@Pc(49) int local49 = 0;
			if (local47 == 60) {
				local28 = local37;
			} else {
				@Pc(65) int local65;
				if (local28 == -1) {
					local65 = local37;
					local49 = this.method2233(local47);
					if (this.aByteArrayArray6 != null && local30 != -1) {
						local49 += this.aByteArrayArray6[local30][local47];
					}
					local30 = local47;
				} else {
					if (local47 != 62) {
						continue;
					}
					local65 = local28;
					@Pc(72) String local72 = arg2.substring(local28 + 1, local37);
					local28 = -1;
					if (local72.equals("br")) {
						arg3[local32] = arg2.substring(local20, local37 + 1);
						local32++;
						if (arg3.length <= local32) {
							return 0;
						}
						local22 = -1;
						local20 = local37 + 1;
						local18 = 0;
						local30 = -1;
						continue;
					}
					if (local72.equals("lt")) {
						local49 = this.method2233(60);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][60];
						}
						local30 = 60;
					} else if (local72.equals("gt")) {
						local49 = this.method2233(62);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][62];
						}
						local30 = 62;
					} else if (local72.equals("nbsp")) {
						local49 = this.method2233(160);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][160];
						}
						local30 = 160;
					} else if (local72.equals("shy")) {
						local49 = this.method2233(173);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][173];
						}
						local30 = 173;
					} else if (local72.equals("times")) {
						local49 = this.method2233(215);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][215];
						}
						local30 = 215;
					} else if (local72.equals("euro")) {
						local49 = this.method2233(8364);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][8364];
						}
						local30 = 8364;
					} else if (local72.equals("copy")) {
						local49 = this.method2233(169);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][169];
						}
						local30 = 169;
					} else if (local72.equals("reg")) {
						local49 = this.method2233(174);
						if (this.aByteArrayArray6 != null && local30 != -1) {
							local49 += this.aByteArrayArray6[local30][174];
						}
						local30 = 174;
					} else if (local72.startsWith("img=") && arg1 != null) {
						try {
							@Pc(228) int local228 = Static16.method250(local72.substring(4));
							local30 = -1;
							local49 = arg1[local228].method5031();
						} catch (@Pc(239) Exception local239) {
						}
					}
					local47 = -1;
				}
				if (local49 > 0) {
					local18 += local49;
					if (arg0 != null) {
						if (local47 == 32) {
							local24 = local18;
							local26 = 1;
							local22 = local37;
						}
						if (arg0[arg0.length <= local32 ? arg0.length - 1 : local32] < local18) {
							if (local22 >= 0) {
								arg3[local32] = arg2.substring(local20, local22 + 1 - local26);
								local32++;
								if (local32 >= arg3.length) {
									return 0;
								}
								local20 = local22 + 1;
								local18 -= local24;
								local22 = -1;
								local30 = -1;
							} else {
								arg3[local32] = arg2.substring(local20, local65);
								local32++;
								if (arg3.length <= local32) {
									return 0;
								}
								local22 = -1;
								local18 = local49;
								local20 = local65;
								local30 = -1;
							}
						}
						if (local47 == 45) {
							local24 = local18;
							local22 = local37;
							local26 = 0;
						}
					}
				}
			}
		}
		if (local20 < arg2.length()) {
			arg3[local32] = arg2.substring(local20, arg2.length());
			local32++;
		}
		return local32;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!kr;I)I")
	public int method2237(@OriginalArg(0) String arg0, @OriginalArg(2) Class46[] arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method2235(new int[] { arg2 }, arg1, arg0, Static125.aStringArray18);
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(39) int local39 = this.method2229(Static125.aStringArray18[local29], arg1);
			if (local27 < local39) {
				local27 = local39;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I[Lclient!kr;ILjava/lang/String;)I")
	public int method2238(@OriginalArg(0) int arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(3) String arg2) {
		return this.method2235(new int[] { arg0 }, arg1, arg2, Static125.aStringArray18);
	}
}
