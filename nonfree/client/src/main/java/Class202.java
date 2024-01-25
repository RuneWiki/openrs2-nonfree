import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class202 {

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public final int anInt5467;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public final int anInt5465;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public final int anInt5456;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
	public Class202(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub17 local8 = new Class3_Sub17(arg0);
		@Pc(12) int local12 = local8.method4888();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method4888() == 1;
		this.aByteArray56 = new byte[256];
		local8.method4832(this.aByteArray56, 0, 256);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method4888();
			}
			@Pc(71) int[] local71 = new int[256];
			for (@Pc(73) int local73 = 0; local73 < 256; local73++) {
				local71[local73] = local8.method4888();
			}
			@Pc(88) byte[][] local88 = new byte[256][];
			@Pc(103) int local103;
			for (@Pc(90) int local90 = 0; local90 < 256; local90++) {
				local88[local90] = new byte[local54[local90]];
				@Pc(101) byte local101 = 0;
				for (local103 = 0; local103 < local88[local90].length; local103++) {
					local101 += local8.method4861();
					local88[local90][local103] = local101;
				}
			}
			@Pc(136) byte[][] local136 = new byte[256][];
			@Pc(151) int local151;
			for (local103 = 0; local103 < 256; local103++) {
				local136[local103] = new byte[local54[local103]];
				@Pc(149) byte local149 = 0;
				for (local151 = 0; local151 < local136[local103].length; local151++) {
					local149 += local8.method4861();
					local136[local103][local151] = local149;
				}
			}
			this.aByteArrayArray12 = new byte[256][256];
			for (@Pc(186) int local186 = 0; local186 < 256; local186++) {
				if (local186 != 32 && local186 != 160) {
					for (local151 = 0; local151 < 256; local151++) {
						if (local151 != 32 && local151 != 160) {
							this.aByteArrayArray12[local186][local151] = (byte) Static191.method3077(local186, local71, local136, local151, local54, local88, this.aByteArray56);
						}
					}
				}
			}
			this.anInt5467 = local71[32] + local54[32];
		} else {
			this.anInt5467 = local8.method4888();
		}
		local8.method4888();
		local8.method4888();
		this.anInt5465 = local8.method4888();
		this.anInt5456 = local8.method4888();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Z[I[Lclient!nf;[Ljava/lang/String;)I")
	public int method4623(@OriginalArg(0) String arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class102[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(30) byte local30 = 0;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(51) int local51 = Static560.method7658(arg0.charAt(local41)) & 0xFF;
			@Pc(53) int local53 = 0;
			if (local51 == 60) {
				local32 = local41;
			} else {
				@Pc(71) int local71;
				if (local32 == -1) {
					local53 = this.method4631(local51);
					local71 = local41;
					if (this.aByteArrayArray12 != null && local34 != -1) {
						local53 += this.aByteArrayArray12[local34][local51];
					}
					local34 = local51;
				} else {
					if (local51 != 62) {
						continue;
					}
					local71 = local32;
					@Pc(78) String local78 = arg0.substring(local32 + 1, local41);
					local32 = -1;
					if (local78.equals("br")) {
						arg3[local36] = arg0.substring(local13, local41 + 1);
						local36++;
						if (arg3.length <= local36) {
							return 0;
						}
						local26 = -1;
						local13 = local41 + 1;
						local34 = -1;
						local11 = 0;
						continue;
					}
					if (local78.equals("lt")) {
						local53 = this.method4631(60);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][60];
						}
						local34 = 60;
					} else if (local78.equals("gt")) {
						local53 = this.method4631(62);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][62];
						}
						local34 = 62;
					} else if (local78.equals("nbsp")) {
						local53 = this.method4631(160);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][160];
						}
						local34 = 160;
					} else if (local78.equals("shy")) {
						local53 = this.method4631(173);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][173];
						}
						local34 = 173;
					} else if (local78.equals("times")) {
						local53 = this.method4631(215);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][215];
						}
						local34 = 215;
					} else if (local78.equals("euro")) {
						local53 = this.method4631(8364);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][8364];
						}
						local34 = 8364;
					} else if (local78.equals("copy")) {
						local53 = this.method4631(169);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][169];
						}
						local34 = 169;
					} else if (local78.equals("reg")) {
						local53 = this.method4631(174);
						if (this.aByteArrayArray12 != null && local34 != -1) {
							local53 += this.aByteArrayArray12[local34][174];
						}
						local34 = 174;
					} else if (local78.startsWith("img=") && arg2 != null) {
						try {
							@Pc(232) int local232 = Static305.method4695(local78.substring(4));
							local53 = arg2[local232].method6951();
							local34 = -1;
						} catch (@Pc(243) Exception local243) {
						}
					}
					local51 = -1;
				}
				if (local53 > 0) {
					local11 += local53;
					if (arg1 != null) {
						if (local51 == 32) {
							local30 = 1;
							local26 = local41;
							local28 = local11;
						}
						if (arg1[arg1.length <= local36 ? arg1.length - 1 : local36] < local11) {
							if (local26 >= 0) {
								arg3[local36] = arg0.substring(local13, local26 + 1 - local30);
								local36++;
								if (local36 >= arg3.length) {
									return 0;
								}
								local13 = local26 + 1;
								local11 -= local28;
								local34 = -1;
								local26 = -1;
							} else {
								arg3[local36] = arg0.substring(local13, local71);
								local36++;
								if (arg3.length <= local36) {
									return 0;
								}
								local26 = -1;
								local13 = local71;
								local34 = -1;
								local11 = local53;
							}
						}
						if (local51 == 45) {
							local30 = 0;
							local26 = local41;
							local28 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg0.length()) {
			arg3[local36] = arg0.substring(local13, arg0.length());
			local36++;
		}
		return local36;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!nf;)I")
	public int method4624(@OriginalArg(0) String arg0, @OriginalArg(2) Class102[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			@Pc(32) char local32 = arg0.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(52) String local52 = arg0.substring(local11 + 1, local26);
					local11 = -1;
					if (local52.equals("lt")) {
						local32 = '<';
					} else if (local52.equals("gt")) {
						local32 = '>';
					} else if (local52.equals("nbsp")) {
						local32 = ' ';
					} else if (local52.equals("shy")) {
						local32 = '\u00ad';
					} else if (local52.equals("times")) {
						local32 = '×';
					} else if (local52.equals("euro")) {
						local32 = '€';
					} else if (local52.equals("copy")) {
						local32 = '©';
					} else {
						if (!local52.equals("reg")) {
							if (local52.startsWith("img=") && arg1 != null) {
								try {
									@Pc(106) int local106 = Static305.method4695(local52.substring(4));
									local13 = -1;
									local15 += arg1[local106].method6951();
								} catch (@Pc(117) Exception local117) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray56[Static560.method7658(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local13 != -1) {
						local15 += this.aByteArrayArray12[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([Lclient!nf;ILjava/lang/String;II)I")
	public int method4625(@OriginalArg(0) Class102[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt5467;
		}
		@Pc(22) int local22 = this.method4623(arg2, new int[] { arg3 }, arg0, Static199.aStringArray78);
		@Pc(28) int local28 = arg1 * (local22 - 1);
		return local28 + this.anInt5465 + this.anInt5456;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI[Lclient!nf;Ljava/lang/String;)I")
	public int method4626(@OriginalArg(1) int arg0, @OriginalArg(2) Class102[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method4623(arg2, new int[] { arg0 }, arg1, Static199.aStringArray78);
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(38) int local38 = this.method4624(Static199.aStringArray78[local28], arg1);
			if (local38 > local26) {
				local26 = local38;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIC)I")
	public int method4627(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray12 == null ? 0 : this.aByteArrayArray12[arg0][arg1];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/lang/String;[Lclient!nf;)Ljava/lang/String;")
	public String method4629(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class102[] arg2) {
		if (arg0 >= this.method4624(arg1, arg2)) {
			return arg1;
		}
		@Pc(22) int local22 = arg0 - this.method4624("...", (Class102[]) null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		@Pc(33) String local33 = "";
		for (@Pc(35) int local35 = 0; local35 < local31; local35++) {
			@Pc(41) char local41 = arg1.charAt(local35);
			if (local41 == '<') {
				local24 = local35;
			} else {
				if (local41 == '>' && local24 != -1) {
					@Pc(66) String local66 = arg1.substring(local24 + 1, local35);
					local24 = -1;
					if (local66.equals("lt")) {
						local41 = '<';
					} else if (local66.equals("gt")) {
						local41 = '>';
					} else if (local66.equals("nbsp")) {
						local41 = ' ';
					} else if (local66.equals("shy")) {
						local41 = '\u00ad';
					} else if (local66.equals("times")) {
						local41 = '×';
					} else if (local66.equals("euro")) {
						local41 = '€';
					} else if (local66.equals("copy")) {
						local41 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=") && arg2 != null) {
								try {
									@Pc(128) int local128 = Static305.method4695(local66.substring(4));
									local28 += arg2[local128].method6951();
									local26 = -1;
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg1.substring(0, local35 + 1);
								} catch (@Pc(162) Exception local162) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray56[Static560.method7658(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local26 != -1) {
						local28 += this.aByteArrayArray12[local26][local41];
					}
					local26 = local41;
					@Pc(215) int local215 = local28;
					if (this.aByteArrayArray12 != null) {
						local215 = local28 + this.aByteArrayArray12[local41][46];
					}
					if (local22 < local215) {
						return local33 + "...";
					}
					local33 = arg1.substring(0, local35 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
	public int method4631(@OriginalArg(1) int arg0) {
		return this.aByteArray56[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method4632(@OriginalArg(0) String arg0) {
		return this.method4624(arg0, (Class102[]) null);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!nf;)I")
	public int method4633(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class102[] arg2) {
		return this.method4623(arg0, new int[] { arg1 }, arg2, Static199.aStringArray78);
	}
}
