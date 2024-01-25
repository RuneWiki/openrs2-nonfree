import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class89 {

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "[B")
	private final byte[] aByteArray33;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public final int anInt2314;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public final int anInt2308;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public final int anInt2311;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B)V")
	public Class89(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub28 local8 = new Class1_Sub28(arg0);
		@Pc(12) int local12 = local8.method5337();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method5337() == 1;
		this.aByteArray33 = new byte[256];
		local8.method5344(this.aByteArray33, 256);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local53[local58] = local8.method5337();
			}
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local56[local74] = local8.method5337();
			}
			@Pc(91) byte[][] local91 = new byte[256][];
			@Pc(106) int local106;
			for (@Pc(93) int local93 = 0; local93 < 256; local93++) {
				local91[local93] = new byte[local53[local93]];
				@Pc(104) byte local104 = 0;
				for (local106 = 0; local106 < local91[local93].length; local106++) {
					local104 += local8.method5367();
					local91[local93][local106] = local104;
				}
			}
			@Pc(139) byte[][] local139 = new byte[256][];
			@Pc(154) int local154;
			for (local106 = 0; local106 < 256; local106++) {
				local139[local106] = new byte[local53[local106]];
				@Pc(152) byte local152 = 0;
				for (local154 = 0; local154 < local139[local106].length; local154++) {
					local152 += local8.method5367();
					local139[local106][local154] = local152;
				}
			}
			this.aByteArrayArray6 = new byte[256][256];
			for (@Pc(187) int local187 = 0; local187 < 256; local187++) {
				if (local187 != 32 && local187 != 160) {
					for (local154 = 0; local154 < 256; local154++) {
						if (local154 != 32 && local154 != 160) {
							this.aByteArrayArray6[local187][local154] = (byte) Static311.method4229(local187, local91, local154, local53, local56, local139, this.aByteArray33);
						}
					}
				}
			}
			this.anInt2314 = local56[32] + local53[32];
		} else {
			this.anInt2314 = local8.method5337();
		}
		local8.method5337();
		local8.method5337();
		this.anInt2308 = local8.method5337();
		this.anInt2311 = local8.method5337();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!o;I)I")
	public int method1985(@OriginalArg(0) String arg0, @OriginalArg(2) Class6[] arg1, @OriginalArg(3) int arg2) {
		return this.method1993(arg1, new int[] { arg2 }, Static319.aStringArray36, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[Lclient!o;ILjava/lang/String;)Ljava/lang/String;")
	public String method1986(@OriginalArg(0) int arg0, @OriginalArg(1) Class6[] arg1, @OriginalArg(3) String arg2) {
		if (arg0 >= this.method1987(arg2, arg1)) {
			return arg2;
		}
		@Pc(30) int local30 = arg0 - this.method1987("...", null);
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg2.length();
		@Pc(41) String local41 = "";
		for (@Pc(43) int local43 = 0; local43 < local39; local43++) {
			@Pc(49) char local49 = arg2.charAt(local43);
			if (local49 == '<') {
				local32 = local43;
			} else {
				if (local49 == '>' && local32 != -1) {
					@Pc(72) String local72 = arg2.substring(local32 + 1, local43);
					local32 = -1;
					if (local72.equals("lt")) {
						local49 = '<';
					} else if (local72.equals("gt")) {
						local49 = '>';
					} else if (local72.equals("nbsp")) {
						local49 = ' ';
					} else if (local72.equals("shy")) {
						local49 = '\u00ad';
					} else if (local72.equals("times")) {
						local49 = '×';
					} else if (local72.equals("euro")) {
						local49 = '€';
					} else if (local72.equals("copy")) {
						local49 = '©';
					} else {
						if (!local72.equals("reg")) {
							if (local72.startsWith("img=") && arg1 != null) {
								try {
									@Pc(142) int local142 = Static219.method3201(local72.substring(4));
									local36 += arg1[local142].RA();
									local34 = -1;
									if (local36 > local30) {
										return local41 + "...";
									}
									local41 = arg2.substring(0, local43 + 1);
								} catch (@Pc(176) Exception local176) {
								}
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local32 == -1) {
					local36 += this.aByteArray33[Static97.method1513(local49) & 0xFF] & 0xFF;
					if (this.aByteArrayArray6 != null && local34 != -1) {
						local36 += this.aByteArrayArray6[local34][local49];
					}
					local34 = local49;
					@Pc(221) int local221 = local36;
					if (this.aByteArrayArray6 != null) {
						local221 = local36 + this.aByteArrayArray6[local49][46];
					}
					if (local30 < local221) {
						return local41 + "...";
					}
					local41 = arg2.substring(0, local43 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;[Lclient!o;)I")
	public int method1987(@OriginalArg(1) String arg0, @OriginalArg(2) Class6[] arg1) {
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
					@Pc(46) String local46 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local46.equals("lt")) {
						local26 = '<';
					} else if (local46.equals("gt")) {
						local26 = '>';
					} else if (local46.equals("nbsp")) {
						local26 = ' ';
					} else if (local46.equals("shy")) {
						local26 = '\u00ad';
					} else if (local46.equals("times")) {
						local26 = '×';
					} else if (local46.equals("euro")) {
						local26 = '€';
					} else if (local46.equals("copy")) {
						local26 = '©';
					} else {
						if (!local46.equals("reg")) {
							if (local46.startsWith("img=") && arg1 != null) {
								try {
									@Pc(114) int local114 = Static219.method3201(local46.substring(4));
									local15 += arg1[local114].RA();
									local13 = -1;
								} catch (@Pc(125) Exception local125) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray33[Static97.method1513(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray6 != null && local13 != -1) {
						local15 += this.aByteArrayArray6[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;[Lclient!o;II)I")
	public int method1988(@OriginalArg(1) String arg0, @OriginalArg(2) Class6[] arg1) {
		@Pc(19) int local19 = this.anInt2314;
		@Pc(32) int local32 = this.method1993(arg1, new int[] { 100 }, Static319.aStringArray36, arg0);
		@Pc(38) int local38 = (local32 - 1) * local19;
		return this.anInt2311 + local38 + this.anInt2308;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(CIB)I")
	public int method1991(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray6 == null ? 0 : this.aByteArrayArray6[arg1][arg0];
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[Lclient!o;[I[Ljava/lang/String;Ljava/lang/String;)I")
	public int method1993(@OriginalArg(1) Class6[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg3.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static97.method1513(arg3.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local21 = local38;
			} else {
				@Pc(65) int local65;
				if (local21 == -1) {
					local65 = local38;
					local50 = this.method1996(local48);
					if (this.aByteArrayArray6 != null && local31 != -1) {
						local50 += this.aByteArrayArray6[local31][local48];
					}
					local31 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local65 = local21;
					@Pc(104) String local104 = arg3.substring(local21 + 1, local38);
					local21 = -1;
					if (local104.equals("br")) {
						arg2[local33] = arg3.substring(local13, local38 + 1);
						local33++;
						if (arg2.length <= local33) {
							return 0;
						}
						local31 = -1;
						local11 = 0;
						local15 = -1;
						local13 = local38 + 1;
						continue;
					}
					if (local104.equals("lt")) {
						local50 = this.method1996(60);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][60];
						}
						local31 = 60;
					} else if (local104.equals("gt")) {
						local50 = this.method1996(62);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][62];
						}
						local31 = 62;
					} else if (local104.equals("nbsp")) {
						local50 = this.method1996(160);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][160];
						}
						local31 = 160;
					} else if (local104.equals("shy")) {
						local50 = this.method1996(173);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][173];
						}
						local31 = 173;
					} else if (local104.equals("times")) {
						local50 = this.method1996(215);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][215];
						}
						local31 = 215;
					} else if (local104.equals("euro")) {
						local50 = this.method1996(8364);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][8364];
						}
						local31 = 8364;
					} else if (local104.equals("copy")) {
						local50 = this.method1996(169);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][169];
						}
						local31 = 169;
					} else if (local104.equals("reg")) {
						local50 = this.method1996(174);
						if (this.aByteArrayArray6 != null && local31 != -1) {
							local50 += this.aByteArrayArray6[local31][174];
						}
						local31 = 174;
					} else if (local104.startsWith("img=") && arg0 != null) {
						try {
							@Pc(288) int local288 = Static219.method3201(local104.substring(4));
							local31 = -1;
							local50 = arg0[local288].RA();
						} catch (@Pc(299) Exception local299) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg1 != null) {
						if (local48 == 32) {
							local19 = 1;
							local15 = local38;
							local17 = local11;
						}
						if (local11 > arg1[arg1.length > local33 ? local33 : arg1.length - 1]) {
							if (local15 < 0) {
								arg2[local33] = arg3.substring(local13, local65);
								local33++;
								if (arg2.length <= local33) {
									return 0;
								}
								local13 = local65;
								local31 = -1;
								local15 = -1;
								local11 = local50;
							} else {
								arg2[local33] = arg3.substring(local13, local15 + 1 - local19);
								local33++;
								if (arg2.length <= local33) {
									return 0;
								}
								local13 = local15 + 1;
								local31 = -1;
								local15 = -1;
								local11 -= local17;
							}
						}
						if (local48 == 45) {
							local19 = 0;
							local15 = local38;
							local17 = local11;
						}
					}
				}
			}
		}
		if (arg3.length() > local13) {
			arg2[local33] = arg3.substring(local13, arg3.length());
			local33++;
		}
		return local33;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1995(@OriginalArg(1) String arg0) {
		return this.method1987(arg0, null);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
	public int method1996(@OriginalArg(0) int arg0) {
		return this.aByteArray33[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;BI[Lclient!o;)I")
	public int method1997(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6[] arg2) {
		@Pc(18) int local18 = this.method1993(arg2, new int[] { arg1 }, Static319.aStringArray36, arg0);
		@Pc(20) int local20 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method1987(Static319.aStringArray36[local27], arg2);
			if (local37 > local20) {
				local20 = local37;
			}
		}
		return local20;
	}
}
