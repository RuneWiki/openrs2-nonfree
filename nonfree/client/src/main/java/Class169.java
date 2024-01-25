import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class169 {

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
	public final int anInt4040;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
	public final int anInt4041;

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
	public final int anInt4042;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V")
	public Class169(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg0);
		@Pc(12) int local12 = local8.method2048(255);
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(35) boolean local35 = local8.method2048(255) == 1;
		this.aByteArray40 = new byte[256];
		local8.method2064(256, 0, this.aByteArray40);
		if (local35) {
			@Pc(60) int[] local60 = new int[256];
			for (@Pc(62) int local62 = 0; local62 < 256; local62++) {
				local60[local62] = local8.method2048(255);
			}
			@Pc(81) int[] local81 = new int[256];
			for (@Pc(83) int local83 = 0; local83 < 256; local83++) {
				local81[local83] = local8.method2048(255);
			}
			@Pc(102) byte[][] local102 = new byte[256][];
			@Pc(121) int local121;
			for (@Pc(104) int local104 = 0; local104 < 256; local104++) {
				local102[local104] = new byte[local60[local104]];
				@Pc(119) byte local119 = 0;
				for (local121 = 0; local121 < local102[local104].length; local121++) {
					local119 += local8.method2022();
					local102[local104][local121] = local119;
				}
			}
			@Pc(156) byte[][] local156 = new byte[256][];
			@Pc(173) int local173;
			for (local121 = 0; local121 < 256; local121++) {
				local156[local121] = new byte[local60[local121]];
				@Pc(171) byte local171 = 0;
				for (local173 = 0; local173 < local156[local121].length; local173++) {
					local171 += local8.method2022();
					local156[local121][local173] = local171;
				}
			}
			this.aByteArrayArray7 = new byte[256][256];
			for (@Pc(216) int local216 = 0; local216 < 256; local216++) {
				if (local216 != 32 && local216 != 160) {
					for (local173 = 0; local173 < 256; local173++) {
						if (local173 != 32 && local173 != 160) {
							this.aByteArrayArray7[local216][local173] = (byte) Static509.method6644(local173, local216, this.aByteArray40, local102, local81, local156, local60);
						}
					}
				}
			}
			this.anInt4040 = local60[32] + local81[32];
		} else {
			this.anInt4040 = local8.method2048(255);
		}
		local8.method2048(255);
		local8.method2048(255);
		this.anInt4041 = local8.method2048(255);
		this.anInt4042 = local8.method2048(255);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lclient!kw;BLjava/lang/String;)I")
	public int method3646(@OriginalArg(0) Class178[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(36) char local36 = arg1.charAt(local28);
			if (local36 == '<') {
				local19 = local28;
			} else {
				if (local36 == '>' && local19 != -1) {
					@Pc(61) String local61 = arg1.substring(local19 + 1, local28);
					local19 = -1;
					if (local61.equals("lt")) {
						local36 = '<';
					} else if (local61.equals("gt")) {
						local36 = '>';
					} else if (local61.equals("nbsp")) {
						local36 = ' ';
					} else if (local61.equals("shy")) {
						local36 = '\u00ad';
					} else if (local61.equals("times")) {
						local36 = '×';
					} else if (local61.equals("euro")) {
						local36 = '€';
					} else if (local61.equals("copy")) {
						local36 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=") && arg0 != null) {
								try {
									@Pc(163) int local163 = Static636.method8390(local61.substring(4));
									local21 = -1;
									local23 += arg0[local163].method7627();
								} catch (@Pc(174) Exception local174) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local19 == -1) {
					local23 += this.aByteArray40[Static197.method6349(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray7 != null && local21 != -1) {
						local23 += this.aByteArrayArray7[local21][local36];
					}
					local21 = local36;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[Lclient!kw;Ljava/lang/String;)I")
	public int method3647(@OriginalArg(0) int arg0, @OriginalArg(2) Class178[] arg1, @OriginalArg(3) String arg2) {
		return this.method3649(arg1, arg2, new int[] { arg0 }, Static492.aStringArray32);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)I")
	public int method3648(@OriginalArg(0) int arg0) {
		return this.aByteArray40[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lclient!kw;Ljava/lang/String;Z[I[Ljava/lang/String;)I")
	public int method3649(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = 0;
		@Pc(20) byte local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg1.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(55) int local55 = Static197.method6349(arg1.charAt(local43)) & 0xFF;
			@Pc(57) int local57 = 0;
			if (local55 == 60) {
				local22 = local43;
			} else {
				@Pc(78) int local78;
				if (local22 == -1) {
					local78 = local43;
					local57 = this.method3648(local55);
					if (this.aByteArrayArray7 != null && local36 != -1) {
						local57 += this.aByteArrayArray7[local36][local55];
					}
					local36 = local55;
				} else {
					if (local55 != 62) {
						continue;
					}
					local78 = local22;
					@Pc(85) String local85 = arg1.substring(local22 + 1, local43);
					local22 = -1;
					if (local85.equals("br")) {
						arg3[local38] = arg1.substring(local14, local43 + 1);
						local38++;
						if (local38 >= arg3.length) {
							return 0;
						}
						local12 = 0;
						local16 = -1;
						local36 = -1;
						local14 = local43 + 1;
						continue;
					}
					if (local85.equals("lt")) {
						local57 = this.method3648(60);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][60];
						}
						local36 = 60;
					} else if (local85.equals("gt")) {
						local57 = this.method3648(62);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][62];
						}
						local36 = 62;
					} else if (local85.equals("nbsp")) {
						local57 = this.method3648(160);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][160];
						}
						local36 = 160;
					} else if (local85.equals("shy")) {
						local57 = this.method3648(173);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][173];
						}
						local36 = 173;
					} else if (local85.equals("times")) {
						local57 = this.method3648(215);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][215];
						}
						local36 = 215;
					} else if (local85.equals("euro")) {
						local57 = this.method3648(8364);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][8364];
						}
						local36 = 8364;
					} else if (local85.equals("copy")) {
						local57 = this.method3648(169);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][169];
						}
						local36 = 169;
					} else if (local85.equals("reg")) {
						local57 = this.method3648(174);
						if (this.aByteArrayArray7 != null && local36 != -1) {
							local57 += this.aByteArrayArray7[local36][174];
						}
						local36 = 174;
					} else if (local85.startsWith("img=") && arg0 != null) {
						try {
							@Pc(266) int local266 = Static636.method8390(local85.substring(4));
							local57 = arg0[local266].method7627();
							local36 = -1;
						} catch (@Pc(277) Exception local277) {
						}
					}
					local55 = -1;
				}
				if (local57 > 0) {
					local12 += local57;
					if (arg2 != null) {
						if (local55 == 32) {
							local16 = local43;
							local20 = 1;
							local18 = local12;
						}
						if (arg2[arg2.length <= local38 ? arg2.length - 1 : local38] < local12) {
							if (local16 >= 0) {
								arg3[local38] = arg1.substring(local14, local16 + 1 - local20);
								local38++;
								if (local38 >= arg3.length) {
									return 0;
								}
								local14 = local16 + 1;
								local16 = -1;
								local36 = -1;
								local12 -= local18;
							} else {
								arg3[local38] = arg1.substring(local14, local78);
								local38++;
								if (arg3.length <= local38) {
									return 0;
								}
								local36 = -1;
								local12 = local57;
								local14 = local78;
								local16 = -1;
							}
						}
						if (local55 == 45) {
							local18 = local12;
							local20 = 0;
							local16 = local43;
						}
					}
				}
			}
		}
		if (arg1.length() > local14) {
			arg3[local38] = arg1.substring(local14, arg1.length());
			local38++;
		}
		return local38;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[Lclient!kw;ILjava/lang/String;)I")
	public int method3651(@OriginalArg(1) int arg0, @OriginalArg(2) Class178[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt4040;
		}
		@Pc(27) int local27 = this.method3649(arg1, arg3, new int[] { arg2 }, Static492.aStringArray32);
		@Pc(33) int local33 = arg0 * (local27 - 1);
		return this.anInt4042 + this.anInt4041 + local33;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[Lclient!kw;ILjava/lang/String;)I")
	public int method3652(@OriginalArg(0) int arg0, @OriginalArg(1) Class178[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method3649(arg1, arg2, new int[] { arg0 }, Static492.aStringArray32);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(34) int local34 = this.method3646(arg1, Static492.aStringArray32[local22]);
			if (local34 > local20) {
				local20 = local34;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3653(@OriginalArg(1) String arg0) {
		return this.method3646((Class178[]) null, arg0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!kw;)Ljava/lang/String;")
	public String method3655(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class178[] arg2) {
		if (arg1 >= this.method3646(arg2, arg0)) {
			return arg0;
		}
		@Pc(25) int local25 = arg1 - this.method3646((Class178[]) null, "...");
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		@Pc(36) String local36 = "";
		for (@Pc(38) int local38 = 0; local38 < local34; local38++) {
			@Pc(46) char local46 = arg0.charAt(local38);
			if (local46 == '<') {
				local27 = local38;
			} else {
				if (local46 == '>' && local27 != -1) {
					@Pc(72) String local72 = arg0.substring(local27 + 1, local38);
					local27 = -1;
					if (local72.equals("lt")) {
						local46 = '<';
					} else if (local72.equals("gt")) {
						local46 = '>';
					} else if (local72.equals("nbsp")) {
						local46 = ' ';
					} else if (local72.equals("shy")) {
						local46 = '\u00ad';
					} else if (local72.equals("times")) {
						local46 = '×';
					} else if (local72.equals("euro")) {
						local46 = '€';
					} else if (local72.equals("copy")) {
						local46 = '©';
					} else {
						if (!local72.equals("reg")) {
							if (local72.startsWith("img=") && arg2 != null) {
								try {
									@Pc(162) int local162 = Static636.method8390(local72.substring(4));
									local29 = -1;
									local31 += arg2[local162].method7627();
									if (local25 < local31) {
										return local36 + "...";
									}
									local36 = arg0.substring(0, local38 + 1);
								} catch (@Pc(195) Exception local195) {
								}
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local27 == -1) {
					local31 += this.aByteArray40[Static197.method6349(local46) & 0xFF] & 0xFF;
					if (this.aByteArrayArray7 != null && local29 != -1) {
						local31 += this.aByteArrayArray7[local29][local46];
					}
					local29 = local46;
					@Pc(263) int local263 = local31;
					if (this.aByteArrayArray7 != null) {
						local263 = local31 + this.aByteArrayArray7[local46][46];
					}
					if (local25 < local263) {
						return local36 + "...";
					}
					local36 = arg0.substring(0, local38 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(CBI)I")
	public int method3656(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray7 == null ? 0 : this.aByteArrayArray7[arg1][arg0];
	}
}
