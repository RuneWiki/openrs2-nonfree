import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class112 {

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
	public final int anInt2426;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public final int anInt2421;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
	public final int anInt2430;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([B)V")
	public Class112(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub7 local8 = new Class2_Sub7(arg0);
		@Pc(12) int local12 = local8.method4464();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method4464() == 1;
		this.aByteArray38 = new byte[256];
		local8.method4504(256, this.aByteArray38);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local56[local58] = local8.method4464();
			}
			@Pc(75) int[] local75 = new int[256];
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local75[local77] = local8.method4464();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local56[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method4477();
					local92[local94][local107] = local105;
				}
			}
			@Pc(142) byte[][] local142 = new byte[256][];
			@Pc(157) int local157;
			for (local107 = 0; local107 < 256; local107++) {
				local142[local107] = new byte[local56[local107]];
				@Pc(155) byte local155 = 0;
				for (local157 = 0; local157 < local142[local107].length; local157++) {
					local155 += local8.method4477();
					local142[local107][local157] = local155;
				}
			}
			this.aByteArrayArray4 = new byte[256][256];
			for (@Pc(194) int local194 = 0; local194 < 256; local194++) {
				if (local194 != 32 && local194 != 160) {
					for (local157 = 0; local157 < 256; local157++) {
						if (local157 != 32 && local157 != 160) {
							this.aByteArrayArray4[local194][local157] = (byte) Static564.method7371(local75, local194, local92, local157, this.aByteArray38, local142, local56);
						}
					}
				}
			}
			this.anInt2426 = local56[32] + local75[32];
		} else {
			this.anInt2426 = local8.method4464();
		}
		local8.method4464();
		local8.method4464();
		this.anInt2421 = local8.method4464();
		this.anInt2430 = local8.method4464();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI[Lclient!f;Ljava/lang/String;)I")
	public int method2075(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class38[] arg2, @OriginalArg(4) String arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt2426;
		}
		@Pc(29) int local29 = this.method2082(arg2, Static302.aStringArray27, new int[] { arg1 }, arg3);
		@Pc(35) int local35 = arg0 * (local29 - 1);
		return local35 + this.anInt2421 + this.anInt2430;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[Lclient!f;Ljava/lang/String;)Ljava/lang/String;")
	public String method2076(@OriginalArg(1) int arg0, @OriginalArg(2) Class38[] arg1, @OriginalArg(3) String arg2) {
		if (this.method2079(arg1, arg2) <= arg0) {
			return arg2;
		}
		@Pc(22) int local22 = arg0 - this.method2079(null, "...");
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
							if (local64.startsWith("img=") && arg1 != null) {
								try {
									@Pc(128) int local128 = Static559.method7310(local64.substring(4));
									local28 += arg1[local128].A();
									local26 = -1;
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
					local28 += this.aByteArray38[Static83.method1256(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray4 != null && local26 != -1) {
						local28 += this.aByteArrayArray4[local26][local41];
					}
					local26 = local41;
					@Pc(210) int local210 = local28;
					if (this.aByteArrayArray4 != null) {
						local210 = local28 + this.aByteArrayArray4[local41][46];
					}
					if (local22 < local210) {
						return local33 + "...";
					}
					local33 = arg2.substring(0, local35 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2078(@OriginalArg(0) String arg0) {
		return this.method2079(null, arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;I)I")
	public int method2079(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg1.charAt(local25);
			if (local31 == '<') {
				local16 = local25;
			} else {
				if (local31 == '>' && local16 != -1) {
					@Pc(53) String local53 = arg1.substring(local16 + 1, local25);
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
							if (local53.startsWith("img=") && arg0 != null) {
								try {
									@Pc(113) int local113 = Static559.method7310(local53.substring(4));
									local20 += arg0[local113].A();
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
					local20 += this.aByteArray38[Static83.method1256(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray4 != null && local18 != -1) {
						local20 += this.aByteArrayArray4[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(CBI)I")
	public int method2080(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray4 == null ? 0 : this.aByteArrayArray4[arg1][arg0];
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
	public int method2081(@OriginalArg(0) int arg0) {
		return this.aByteArray38[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!f;[Ljava/lang/String;[ILjava/lang/String;I)I")
	public int method2082(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3) {
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
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg3.length();
		for (@Pc(35) int local35 = 0; local35 < local28; local35++) {
			@Pc(45) int local45 = Static83.method1256(arg3.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(64) int local64;
				if (local21 == -1) {
					local64 = local35;
					local47 = this.method2081(local45);
					if (this.aByteArrayArray4 != null && local23 != -1) {
						local47 += this.aByteArrayArray4[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local64 = local21;
					@Pc(71) String local71 = arg3.substring(local21 + 1, local35);
					local21 = -1;
					if (local71.equals("br")) {
						arg1[local25] = arg3.substring(local13, local35 + 1);
						local25++;
						if (arg1.length <= local25) {
							return 0;
						}
						local15 = -1;
						local11 = 0;
						local13 = local35 + 1;
						local23 = -1;
						continue;
					}
					if (local71.equals("lt")) {
						local47 = this.method2081(60);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][60];
						}
						local23 = 60;
					} else if (local71.equals("gt")) {
						local47 = this.method2081(62);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][62];
						}
						local23 = 62;
					} else if (local71.equals("nbsp")) {
						local47 = this.method2081(160);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][160];
						}
						local23 = 160;
					} else if (local71.equals("shy")) {
						local47 = this.method2081(173);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][173];
						}
						local23 = 173;
					} else if (local71.equals("times")) {
						local47 = this.method2081(215);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][215];
						}
						local23 = 215;
					} else if (local71.equals("euro")) {
						local47 = this.method2081(8364);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][8364];
						}
						local23 = 8364;
					} else if (local71.equals("copy")) {
						local47 = this.method2081(169);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][169];
						}
						local23 = 169;
					} else if (local71.equals("reg")) {
						local47 = this.method2081(174);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local47 += this.aByteArrayArray4[local23][174];
						}
						local23 = 174;
					} else if (local71.startsWith("img=") && arg0 != null) {
						try {
							@Pc(253) int local253 = Static559.method7310(local71.substring(4));
							local23 = -1;
							local47 = arg0[local253].A();
						} catch (@Pc(264) Exception local264) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg2 != null) {
						if (local45 == 32) {
							local17 = local11;
							local15 = local35;
							local19 = 1;
						}
						if (local11 > arg2[local25 >= arg2.length ? arg2.length - 1 : local25]) {
							if (local15 < 0) {
								arg1[local25] = arg3.substring(local13, local64);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local11 = local47;
								local15 = -1;
								local23 = -1;
								local13 = local64;
							} else {
								arg1[local25] = arg3.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local15 = -1;
								local23 = -1;
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
			arg1[local25] = arg3.substring(local13, arg3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!f;ZILjava/lang/String;)I")
	public int method2083(@OriginalArg(0) Class38[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(26) int local26 = this.method2082(arg0, Static302.aStringArray27, new int[] { arg1 }, arg2);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method2079(arg0, Static302.aStringArray27[local30]);
			if (local40 > local28) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB[Lclient!f;Ljava/lang/String;)I")
	public int method2084(@OriginalArg(0) int arg0, @OriginalArg(2) Class38[] arg1, @OriginalArg(3) String arg2) {
		return this.method2082(arg1, Static302.aStringArray27, new int[] { arg0 }, arg2);
	}
}
