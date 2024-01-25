import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class224 {

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	public final int anInt6145;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	public final int anInt6135;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	public final int anInt6133;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([B)V")
	public Class224(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub23 local8 = new Class5_Sub23(arg0);
		@Pc(12) int local12 = local8.method8529();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(35) boolean local35 = local8.method8529() == 1;
		this.aByteArray49 = new byte[256];
		local8.method8487(this.aByteArray49, 256, 0);
		if (local35) {
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local51[local53] = local8.method8529();
			}
			@Pc(72) int[] local72 = new int[256];
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local72[local74] = local8.method8529();
			}
			@Pc(93) byte[][] local93 = new byte[256][];
			@Pc(112) int local112;
			for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
				local93[local95] = new byte[local51[local95]];
				@Pc(110) byte local110 = 0;
				for (local112 = 0; local112 < local93[local95].length; local112++) {
					local110 += local8.method8488();
					local93[local95][local112] = local110;
				}
			}
			@Pc(147) byte[][] local147 = new byte[256][];
			@Pc(164) int local164;
			for (local112 = 0; local112 < 256; local112++) {
				local147[local112] = new byte[local51[local112]];
				@Pc(162) byte local162 = 0;
				for (local164 = 0; local164 < local147[local112].length; local164++) {
					local162 += local8.method8488();
					local147[local112][local164] = local162;
				}
			}
			this.aByteArrayArray18 = new byte[256][256];
			for (@Pc(201) int local201 = 0; local201 < 256; local201++) {
				if (local201 != 32 && local201 != 160) {
					for (local164 = 0; local164 < 256; local164++) {
						if (local164 != 32 && local164 != 160) {
							this.aByteArrayArray18[local201][local164] = (byte) Static344.method5205(this.aByteArray49, local93, local72, local164, local51, local147, local201);
						}
					}
				}
			}
			this.anInt6145 = local51[32] + local72[32];
		} else {
			this.anInt6145 = local8.method8529();
		}
		local8.method8529();
		local8.method8529();
		this.anInt6135 = local8.method8529();
		this.anInt6133 = local8.method8529();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[Lclient!fs;BLjava/lang/String;)I")
	public int method5249(@OriginalArg(0) int arg0, @OriginalArg(1) Class134[] arg1, @OriginalArg(3) String arg2) {
		return this.method5255(arg2, arg1, Static295.aStringArray34, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;[Lclient!fs;B)I")
	public int method5250(@OriginalArg(0) String arg0, @OriginalArg(1) Class134[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(41) char local41 = arg0.charAt(local33);
			if (local41 == '<') {
				local24 = local33;
			} else {
				if (local41 == '>' && local24 != -1) {
					@Pc(69) String local69 = arg0.substring(local24 + 1, local33);
					local24 = -1;
					if (local69.equals("lt")) {
						local41 = '<';
					} else if (local69.equals("gt")) {
						local41 = '>';
					} else if (local69.equals("nbsp")) {
						local41 = ' ';
					} else if (local69.equals("shy")) {
						local41 = '\u00ad';
					} else if (local69.equals("times")) {
						local41 = '×';
					} else if (local69.equals("euro")) {
						local41 = '€';
					} else if (local69.equals("copy")) {
						local41 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=") && arg1 != null) {
								try {
									@Pc(167) int local167 = Static595.method8613(local69.substring(4));
									local28 += arg1[local167].method9231();
									local26 = -1;
								} catch (@Pc(178) Exception local178) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray49[Static133.method1920(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray18 != null && local26 != -1) {
						local28 += this.aByteArrayArray18[local26][local41];
					}
					local26 = local41;
				}
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([Lclient!fs;IZILjava/lang/String;)I")
	public int method5251(@OriginalArg(0) Class134[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt6145;
		}
		@Pc(32) int local32 = this.method5255(arg3, arg0, Static295.aStringArray34, new int[] { arg1 });
		@Pc(38) int local38 = (local32 - 1) * arg2;
		return this.anInt6133 + this.anInt6135 + local38;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(CII)I")
	public int method5253(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray18 == null ? 0 : this.aByteArrayArray18[arg1][arg0];
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)I")
	public int method5254(@OriginalArg(0) int arg0) {
		return this.aByteArray49[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;[Lclient!fs;B[Ljava/lang/String;[I)I")
	public int method5255(@OriginalArg(0) String arg0, @OriginalArg(1) Class134[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = 0;
		@Pc(20) byte local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(43) int local43 = Static133.method1920(arg0.charAt(local31)) & 0xFF;
			@Pc(45) int local45 = 0;
			if (local43 == 60) {
				local22 = local31;
			} else {
				@Pc(69) int local69;
				if (local22 == -1) {
					local69 = local31;
					local45 = this.method5254(local43);
					if (this.aByteArrayArray18 != null && local24 != -1) {
						local45 += this.aByteArrayArray18[local24][local43];
					}
					local24 = local43;
				} else {
					if (local43 != 62) {
						continue;
					}
					local69 = local22;
					@Pc(76) String local76 = arg0.substring(local22 + 1, local31);
					local22 = -1;
					if (local76.equals("br")) {
						arg2[local26] = arg0.substring(local14, local31 + 1);
						local26++;
						if (arg2.length <= local26) {
							return 0;
						}
						local12 = 0;
						local24 = -1;
						local14 = local31 + 1;
						local16 = -1;
						continue;
					}
					if (local76.equals("lt")) {
						local45 = this.method5254(60);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][60];
						}
						local24 = 60;
					} else if (local76.equals("gt")) {
						local45 = this.method5254(62);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][62];
						}
						local24 = 62;
					} else if (local76.equals("nbsp")) {
						local45 = this.method5254(160);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][160];
						}
						local24 = 160;
					} else if (local76.equals("shy")) {
						local45 = this.method5254(173);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][173];
						}
						local24 = 173;
					} else if (local76.equals("times")) {
						local45 = this.method5254(215);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][215];
						}
						local24 = 215;
					} else if (local76.equals("euro")) {
						local45 = this.method5254(8364);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][8364];
						}
						local24 = 8364;
					} else if (local76.equals("copy")) {
						local45 = this.method5254(169);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][169];
						}
						local24 = 169;
					} else if (local76.equals("reg")) {
						local45 = this.method5254(174);
						if (this.aByteArrayArray18 != null && local24 != -1) {
							local45 += this.aByteArrayArray18[local24][174];
						}
						local24 = 174;
					} else if (local76.startsWith("img=") && arg1 != null) {
						try {
							@Pc(195) int local195 = Static595.method8613(local76.substring(4));
							local45 = arg1[local195].method9231();
							local24 = -1;
						} catch (@Pc(206) Exception local206) {
						}
					}
					local43 = -1;
				}
				if (local45 > 0) {
					local12 += local45;
					if (arg3 != null) {
						if (local43 == 32) {
							local20 = 1;
							local18 = local12;
							local16 = local31;
						}
						if (local12 > arg3[local26 >= arg3.length ? arg3.length - 1 : local26]) {
							if (local16 >= 0) {
								arg2[local26] = arg0.substring(local14, local16 + 1 - local20);
								local26++;
								if (arg2.length <= local26) {
									return 0;
								}
								local14 = local16 + 1;
								local16 = -1;
								local12 -= local18;
								local24 = -1;
							} else {
								arg2[local26] = arg0.substring(local14, local69);
								local26++;
								if (arg2.length <= local26) {
									return 0;
								}
								local14 = local69;
								local16 = -1;
								local24 = -1;
								local12 = local45;
							}
						}
						if (local43 == 45) {
							local18 = local12;
							local16 = local31;
							local20 = 0;
						}
					}
				}
			}
		}
		if (local14 < arg0.length()) {
			arg2[local26] = arg0.substring(local14, arg0.length());
			local26++;
		}
		return local26;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5256(@OriginalArg(1) String arg0) {
		return this.method5250(arg0, (Class134[]) null);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([Lclient!fs;Ljava/lang/String;IB)Ljava/lang/String;")
	public String method5258(@OriginalArg(0) Class134[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= this.method5250(arg1, arg0)) {
			return arg1;
		}
		@Pc(29) int local29 = arg2 - this.method5250("...", (Class134[]) null);
		@Pc(31) int local31 = -1;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg1.length();
		@Pc(46) String local46 = "";
		for (@Pc(48) int local48 = 0; local48 < local44; local48++) {
			@Pc(56) char local56 = arg1.charAt(local48);
			if (local56 == '<') {
				local31 = local48;
			} else {
				if (local56 == '>' && local31 != -1) {
					@Pc(83) String local83 = arg1.substring(local31 + 1, local48);
					local31 = -1;
					if (local83.equals("lt")) {
						local56 = '<';
					} else if (local83.equals("gt")) {
						local56 = '>';
					} else if (local83.equals("nbsp")) {
						local56 = ' ';
					} else if (local83.equals("shy")) {
						local56 = '\u00ad';
					} else if (local83.equals("times")) {
						local56 = '×';
					} else if (local83.equals("euro")) {
						local56 = '€';
					} else if (local83.equals("copy")) {
						local56 = '©';
					} else {
						if (!local83.equals("reg")) {
							if (local83.startsWith("img=") && arg0 != null) {
								try {
									@Pc(189) int local189 = Static595.method8613(local83.substring(4));
									local39 = -1;
									local41 += arg0[local189].method9231();
									if (local41 > local29) {
										return local46 + "...";
									}
									local46 = arg1.substring(0, local48 + 1);
								} catch (@Pc(222) Exception local222) {
								}
							}
							continue;
						}
						local56 = '®';
					}
				}
				if (local31 == -1) {
					local41 += this.aByteArray49[Static133.method1920(local56) & 0xFF] & 0xFF;
					if (this.aByteArrayArray18 != null && local39 != -1) {
						local41 += this.aByteArrayArray18[local39][local56];
					}
					local39 = local56;
					@Pc(272) int local272 = local41;
					if (this.aByteArrayArray18 != null) {
						local272 = local41 + this.aByteArrayArray18[local56][46];
					}
					if (local29 < local272) {
						return local46 + "...";
					}
					local46 = arg1.substring(0, local48 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[Lclient!fs;Ljava/lang/String;I)I")
	public int method5259(@OriginalArg(0) int arg0, @OriginalArg(1) Class134[] arg1, @OriginalArg(2) String arg2) {
		@Pc(18) int local18 = this.method5255(arg2, arg1, Static295.aStringArray34, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(40) int local40 = this.method5250(Static295.aStringArray34[local28], arg1);
			if (local20 < local40) {
				local20 = local40;
			}
		}
		return local20;
	}
}
