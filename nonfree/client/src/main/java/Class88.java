import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class88 {

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "[B")
	private final byte[] aByteArray19;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
	public final int anInt2723;

	@OriginalMember(owner = "client!eia", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
	public final int anInt2733;

	@OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
	public final int anInt2731;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "([B)V")
	public Class88(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(arg0);
		@Pc(12) int local12 = local8.method8632();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method8632() == 1;
		this.aByteArray19 = new byte[256];
		local8.method8623(0, 256, this.aByteArray19);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method8632();
			}
			@Pc(72) int[] local72 = new int[256];
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local72[local74] = local8.method8632();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local53[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method8621();
					local89[local91][local104] = local102;
				}
			}
			@Pc(139) byte[][] local139 = new byte[256][];
			@Pc(154) int local154;
			for (local104 = 0; local104 < 256; local104++) {
				local139[local104] = new byte[local53[local104]];
				@Pc(152) byte local152 = 0;
				for (local154 = 0; local154 < local139[local104].length; local154++) {
					local152 += local8.method8621();
					local139[local104][local154] = local152;
				}
			}
			this.aByteArrayArray9 = new byte[256][256];
			for (@Pc(187) int local187 = 0; local187 < 256; local187++) {
				if (local187 != 32 && local187 != 160) {
					for (local154 = 0; local154 < 256; local154++) {
						if (local154 != 32 && local154 != 160) {
							this.aByteArrayArray9[local187][local154] = (byte) Static148.method2892(local53, local154, this.aByteArray19, local187, local89, local72, local139);
						}
					}
				}
			}
			this.anInt2723 = local53[32] + local72[32];
		} else {
			this.anInt2723 = local8.method8632();
		}
		local8.method8632();
		local8.method8632();
		this.anInt2733 = local8.method8632();
		this.anInt2731 = local8.method8632();
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method2502(@OriginalArg(0) String arg0) {
		return this.method2508((Class33[]) null, arg0);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[Lclient!vr;Ljava/lang/String;I)I")
	public int method2503(@OriginalArg(1) Class33[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method2512(arg0, Static378.aStringArray17, new int[] { arg2 }, arg1);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(CII)I")
	public int method2504(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray9 == null ? 0 : this.aByteArrayArray9[arg1][arg0];
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILjava/lang/String;Z[Lclient!vr;)Ljava/lang/String;")
	public String method2505(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class33[] arg2) {
		if (arg0 >= this.method2508(arg2, arg1)) {
			return arg1;
		}
		@Pc(26) int local26 = arg0 - this.method2508((Class33[]) null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg1.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg1.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(71) String local71 = arg1.substring(local28 + 1, local44);
					local28 = -1;
					if (local71.equals("lt")) {
						local50 = '<';
					} else if (local71.equals("gt")) {
						local50 = '>';
					} else if (local71.equals("nbsp")) {
						local50 = ' ';
					} else if (local71.equals("shy")) {
						local50 = '\u00ad';
					} else if (local71.equals("times")) {
						local50 = '×';
					} else if (local71.equals("euro")) {
						local50 = '€';
					} else if (local71.equals("copy")) {
						local50 = '©';
					} else {
						if (!local71.equals("reg")) {
							if (local71.startsWith("img=") && arg2 != null) {
								try {
									@Pc(149) int local149 = Static63.method1308(local71.substring(4));
									local37 += arg2[local149].method7645();
									local30 = -1;
									if (local37 > local26) {
										return local42 + "...";
									}
									local42 = arg1.substring(0, local44 + 1);
								} catch (@Pc(179) Exception local179) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local37 += this.aByteArray19[Static265.method4367(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local30 != -1) {
						local37 += this.aByteArrayArray9[local30][local50];
					}
					local30 = local50;
					@Pc(218) int local218 = local37;
					if (this.aByteArrayArray9 != null) {
						local218 = local37 + this.aByteArrayArray9[local50][46];
					}
					if (local218 > local26) {
						return local42 + "...";
					}
					local42 = arg1.substring(0, local44 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZI)I")
	public int method2506(@OriginalArg(1) int arg0) {
		return this.aByteArray19[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BLjava/lang/String;I[Lclient!vr;)I")
	public int method2507(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33[] arg2) {
		@Pc(25) int local25 = this.method2512(arg2, Static378.aStringArray17, new int[] { arg1 }, arg0);
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local25; local29++) {
			@Pc(41) int local41 = this.method2508(arg2, Static378.aStringArray17[local29]);
			if (local27 < local41) {
				local27 = local41;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[Lclient!vr;Ljava/lang/String;)I")
	public int method2508(@OriginalArg(1) Class33[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg1.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(52) String local52 = arg1.substring(local11 + 1, local26);
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
							if (local52.startsWith("img=") && arg0 != null) {
								try {
									@Pc(104) int local104 = Static63.method1308(local52.substring(4));
									local21 += arg0[local104].method7645();
									local13 = -1;
								} catch (@Pc(115) Exception local115) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local21 += this.aByteArray19[Static265.method4367(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local13 != -1) {
						local21 += this.aByteArrayArray9[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZILjava/lang/String;[Lclient!vr;I)I")
	public int method2510(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class33[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt2723;
		}
		@Pc(24) int local24 = this.method2512(arg2, Static378.aStringArray17, new int[] { arg0 }, arg1);
		@Pc(40) int local40 = arg3 * (local24 - 1);
		return local40 + this.anInt2733 + this.anInt2731;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([Lclient!vr;[Ljava/lang/String;[ILjava/lang/String;I)I")
	public int method2512(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3) {
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
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static265.method4367(arg3.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(54) int local54;
				if (local21 == -1) {
					local54 = local30;
					local42 = this.method2506(local40);
					if (this.aByteArrayArray9 != null && local23 != -1) {
						local42 += this.aByteArrayArray9[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local54 = local21;
					@Pc(95) String local95 = arg3.substring(local21 + 1, local30);
					local21 = -1;
					if (local95.equals("br")) {
						arg1[local25] = arg3.substring(local13, local30 + 1);
						local25++;
						if (arg1.length <= local25) {
							return 0;
						}
						local15 = -1;
						local11 = 0;
						local13 = local30 + 1;
						local23 = -1;
						continue;
					}
					if (local95.equals("lt")) {
						local42 = this.method2506(60);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][60];
						}
						local23 = 60;
					} else if (local95.equals("gt")) {
						local42 = this.method2506(62);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][62];
						}
						local23 = 62;
					} else if (local95.equals("nbsp")) {
						local42 = this.method2506(160);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][160];
						}
						local23 = 160;
					} else if (local95.equals("shy")) {
						local42 = this.method2506(173);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][173];
						}
						local23 = 173;
					} else if (local95.equals("times")) {
						local42 = this.method2506(215);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][215];
						}
						local23 = 215;
					} else if (local95.equals("euro")) {
						local42 = this.method2506(8364);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][8364];
						}
						local23 = 8364;
					} else if (local95.equals("copy")) {
						local42 = this.method2506(169);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][169];
						}
						local23 = 169;
					} else if (local95.equals("reg")) {
						local42 = this.method2506(174);
						if (this.aByteArrayArray9 != null && local23 != -1) {
							local42 += this.aByteArrayArray9[local23][174];
						}
						local23 = 174;
					} else if (local95.startsWith("img=") && arg0 != null) {
						try {
							@Pc(337) int local337 = Static63.method1308(local95.substring(4));
							local23 = -1;
							local42 = arg0[local337].method7645();
						} catch (@Pc(348) Exception local348) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg2 != null) {
						if (local40 == 32) {
							local19 = 1;
							local15 = local30;
							local17 = local11;
						}
						if (arg2[local25 >= arg2.length ? arg2.length - 1 : local25] < local11) {
							if (local15 < 0) {
								arg1[local25] = arg3.substring(local13, local54);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local15 = -1;
								local23 = -1;
								local13 = local54;
								local11 = local42;
							} else {
								arg1[local25] = arg3.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local23 = -1;
								local15 = -1;
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
		if (local13 < arg3.length()) {
			arg1[local25] = arg3.substring(local13, arg3.length());
			local25++;
		}
		return local25;
	}
}
