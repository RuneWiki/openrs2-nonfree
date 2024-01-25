import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class190 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	public final int anInt4835;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public final int anInt4829;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public final int anInt4834;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
	public Class190(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub5 local8 = new Class3_Sub5(arg0);
		@Pc(12) int local12 = local8.method2739();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method2739() == 1;
		this.aByteArray64 = new byte[256];
		local8.method2744(this.aByteArray64, 256);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local8.method2739();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local47[local65] = local8.method2739();
			}
			@Pc(80) byte[][] local80 = new byte[256][];
			@Pc(95) int local95;
			for (@Pc(82) int local82 = 0; local82 < 256; local82++) {
				local80[local82] = new byte[local44[local82]];
				@Pc(93) byte local93 = 0;
				for (local95 = 0; local95 < local80[local82].length; local95++) {
					local93 += local8.method2753();
					local80[local82][local95] = local93;
				}
			}
			@Pc(128) byte[][] local128 = new byte[256][];
			@Pc(143) int local143;
			for (local95 = 0; local95 < 256; local95++) {
				local128[local95] = new byte[local44[local95]];
				@Pc(141) byte local141 = 0;
				for (local143 = 0; local143 < local128[local95].length; local143++) {
					local141 += local8.method2753();
					local128[local95][local143] = local141;
				}
			}
			this.aByteArrayArray16 = new byte[256][256];
			for (@Pc(180) int local180 = 0; local180 < 256; local180++) {
				if (local180 != 32 && local180 != 160) {
					for (local143 = 0; local143 < 256; local143++) {
						if (local143 != 32 && local143 != 160) {
							this.aByteArrayArray16[local180][local143] = (byte) Static66.method1126(this.aByteArray64, local47, local128, local44, local180, local80, local143);
						}
					}
				}
			}
			this.anInt4835 = local44[32] + local47[32];
		} else {
			this.anInt4835 = local8.method2739();
		}
		local8.method2739();
		local8.method2739();
		this.anInt4829 = local8.method2739();
		this.anInt4834 = local8.method2739();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!tr;Ljava/lang/String;II)I")
	public int method4350(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(26) int local26 = this.method4357(new int[] { arg2 }, Static45.aStringArray3, arg1, arg0);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method4356(arg0, Static45.aStringArray3[local30]);
			if (local40 > local28) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;[Lclient!tr;IZ)I")
	public int method4353(@OriginalArg(0) String arg0, @OriginalArg(1) Class110[] arg1, @OriginalArg(2) int arg2) {
		return this.method4357(new int[] { arg2 }, Static45.aStringArray3, arg0, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(CII)I")
	public int method4354(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray16 == null ? 0 : this.aByteArrayArray16[arg1][arg0];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!tr;II)I")
	public int method4355(@OriginalArg(0) String arg0, @OriginalArg(2) Class110[] arg1) {
		@Pc(7) int local7 = this.anInt4835;
		@Pc(24) int local24 = this.method4357(new int[] { 100 }, Static45.aStringArray3, arg0, arg1);
		@Pc(30) int local30 = (local24 - 1) * local7;
		return local30 + this.anInt4829 + this.anInt4834;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!tr;ILjava/lang/String;)I")
	public int method4356(@OriginalArg(0) Class110[] arg0, @OriginalArg(2) String arg1) {
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
					@Pc(53) String local53 = arg1.substring(local11 + 1, local25);
					local11 = -1;
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
							if (local53.startsWith("img=") && arg0 != null) {
								try {
									@Pc(117) int local117 = Static321.method2984(local53.substring(4));
									local13 = -1;
									local20 += arg0[local117].method5101();
								} catch (@Pc(128) Exception local128) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local20 += this.aByteArray64[Static281.method4462(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray16 != null && local13 != -1) {
						local20 += this.aByteArrayArray16[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B[I[Ljava/lang/String;Ljava/lang/String;[Lclient!tr;)I")
	public int method4357(@OriginalArg(1) int[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class110[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static281.method4462(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(67) int local67;
				if (local26 == -1) {
					local47 = this.method4359(local45);
					local67 = local35;
					if (this.aByteArrayArray16 != null && local28 != -1) {
						local47 += this.aByteArrayArray16[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local67 = local26;
					@Pc(99) String local99 = arg2.substring(local26 + 1, local35);
					local26 = -1;
					if (local99.equals("br")) {
						arg1[local30] = arg2.substring(local18, local35 + 1);
						local30++;
						if (local30 >= arg1.length) {
							return 0;
						}
						local18 = local35 + 1;
						local20 = -1;
						local16 = 0;
						local28 = -1;
						continue;
					}
					if (local99.equals("lt")) {
						local47 = this.method4359(60);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][60];
						}
						local28 = 60;
					} else if (local99.equals("gt")) {
						local47 = this.method4359(62);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][62];
						}
						local28 = 62;
					} else if (local99.equals("nbsp")) {
						local47 = this.method4359(160);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][160];
						}
						local28 = 160;
					} else if (local99.equals("shy")) {
						local47 = this.method4359(173);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][173];
						}
						local28 = 173;
					} else if (local99.equals("times")) {
						local47 = this.method4359(215);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][215];
						}
						local28 = 215;
					} else if (local99.equals("euro")) {
						local47 = this.method4359(8364);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][8364];
						}
						local28 = 8364;
					} else if (local99.equals("copy")) {
						local47 = this.method4359(169);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][169];
						}
						local28 = 169;
					} else if (local99.equals("reg")) {
						local47 = this.method4359(174);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][174];
						}
						local28 = 174;
					} else if (local99.startsWith("img=") && arg3 != null) {
						try {
							@Pc(203) int local203 = Static321.method2984(local99.substring(4));
							local47 = arg3[local203].method5101();
							local28 = -1;
						} catch (@Pc(214) Exception local214) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local22 = local16;
							local20 = local35;
							local24 = 1;
						}
						if (local16 > arg0[local30 < arg0.length ? local30 : arg0.length - 1]) {
							if (local20 < 0) {
								arg1[local30] = arg2.substring(local18, local67);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local16 = local47;
								local20 = -1;
								local28 = -1;
								local18 = local67;
							} else {
								arg1[local30] = arg2.substring(local18, local20 + 1 - local24);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local18 = local20 + 1;
								local20 = -1;
								local16 -= local22;
								local28 = -1;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local22 = local16;
							local20 = local35;
						}
					}
				}
			}
		}
		if (local18 < arg2.length()) {
			arg1[local30] = arg2.substring(local18, arg2.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method4358(@OriginalArg(1) String arg0) {
		return this.method4356(null, arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
	public int method4359(@OriginalArg(0) int arg0) {
		return this.aByteArray64[arg0] & 0xFF;
	}
}
