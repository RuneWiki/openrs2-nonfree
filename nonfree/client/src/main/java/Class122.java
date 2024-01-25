import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class122 {

	@OriginalMember(owner = "client!je", name = "k", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public final int anInt3008;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public final int anInt3003;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public final int anInt3010;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class122(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub11 local8 = new Class1_Sub11(arg0);
		@Pc(12) int local12 = local8.method4463();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method4463() == 1;
		this.aByteArray32 = new byte[256];
		local8.method4471(this.aByteArray32, 256);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local8.method4463();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local47[local65] = local8.method4463();
			}
			@Pc(80) byte[][] local80 = new byte[256][];
			@Pc(95) int local95;
			for (@Pc(82) int local82 = 0; local82 < 256; local82++) {
				local80[local82] = new byte[local44[local82]];
				@Pc(93) byte local93 = 0;
				for (local95 = 0; local95 < local80[local82].length; local95++) {
					local93 += local8.method4452();
					local80[local82][local95] = local93;
				}
			}
			@Pc(130) byte[][] local130 = new byte[256][];
			@Pc(145) int local145;
			for (local95 = 0; local95 < 256; local95++) {
				local130[local95] = new byte[local44[local95]];
				@Pc(143) byte local143 = 0;
				for (local145 = 0; local145 < local130[local95].length; local145++) {
					local143 += local8.method4452();
					local130[local95][local145] = local143;
				}
			}
			this.aByteArrayArray26 = new byte[256][256];
			for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
				if (local182 != 32 && local182 != 160) {
					for (local145 = 0; local145 < 256; local145++) {
						if (local145 != 32 && local145 != 160) {
							this.aByteArrayArray26[local182][local145] = (byte) Static169.method2131(local145, local80, local44, this.aByteArray32, local47, local130, local182);
						}
					}
				}
			}
			this.anInt3008 = local44[32] + local47[32];
		} else {
			this.anInt3008 = local8.method4463();
		}
		local8.method4463();
		local8.method4463();
		this.anInt3003 = local8.method4463();
		this.anInt3010 = local8.method4463();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method2464(@OriginalArg(1) String arg0) {
		return this.method2474(arg0, null);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(CII)I")
	public int method2466(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray26 == null ? 0 : this.aByteArrayArray26[arg1][arg0];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLjava/lang/String;[Lclient!f;I)I")
	public int method2467(@OriginalArg(2) String arg0, @OriginalArg(3) Class49[] arg1) {
		@Pc(4) int local4 = this.anInt3008;
		@Pc(21) int local21 = this.method2472(arg1, arg0, new int[] { 100 }, Static291.aStringArray40);
		@Pc(33) int local33 = local4 * (local21 - 1);
		return this.anInt3010 + local33 + this.anInt3003;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
	public int method2469(@OriginalArg(1) int arg0) {
		return this.aByteArray32[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IB[Lclient!f;)Ljava/lang/String;")
	public String method2470(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class49[] arg2) {
		if (arg1 >= this.method2474(arg0, arg2)) {
			return arg0;
		}
		@Pc(26) int local26 = arg1 - this.method2474("...", null);
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local33 = local44;
			} else {
				if (local50 == '>' && local33 != -1) {
					@Pc(70) String local70 = arg0.substring(local33 + 1, local44);
					local33 = -1;
					if (local70.equals("lt")) {
						local50 = '<';
					} else if (local70.equals("gt")) {
						local50 = '>';
					} else if (local70.equals("nbsp")) {
						local50 = ' ';
					} else if (local70.equals("shy")) {
						local50 = '\u00ad';
					} else if (local70.equals("times")) {
						local50 = '×';
					} else if (local70.equals("euro")) {
						local50 = '€';
					} else if (local70.equals("copy")) {
						local50 = '©';
					} else {
						if (!local70.equals("reg")) {
							if (local70.startsWith("img=") && arg2 != null) {
								try {
									@Pc(132) int local132 = Static237.method3118(local70.substring(4));
									local37 += arg2[local132].ja();
									local35 = -1;
									if (local26 < local37) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(162) Exception local162) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local33 == -1) {
					local37 += this.aByteArray32[Static5.method95(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray26 != null && local35 != -1) {
						local37 += this.aByteArrayArray26[local35][local50];
					}
					local35 = local50;
					@Pc(214) int local214 = local37;
					if (this.aByteArrayArray26 != null) {
						local214 = local37 + this.aByteArrayArray26[local50][46];
					}
					if (local214 > local26) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IZ[Lclient!f;)I")
	public int method2471(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class49[] arg2) {
		return this.method2472(arg2, arg0, new int[] { arg1 }, Static291.aStringArray40);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;[I[Ljava/lang/String;)I")
	public int method2472(@OriginalArg(1) Class49[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg1.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static5.method95(arg1.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local29 = local38;
			} else {
				@Pc(67) int local67;
				if (local29 == -1) {
					local67 = local38;
					local50 = this.method2469(local48);
					if (this.aByteArrayArray26 != null && local31 != -1) {
						local50 += this.aByteArrayArray26[local31][local48];
					}
					local31 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local67 = local29;
					@Pc(74) String local74 = arg1.substring(local29 + 1, local38);
					local29 = -1;
					if (local74.equals("br")) {
						arg3[local33] = arg1.substring(local13, local38 + 1);
						local33++;
						if (arg3.length <= local33) {
							return 0;
						}
						local13 = local38 + 1;
						local15 = -1;
						local31 = -1;
						local11 = 0;
						continue;
					}
					if (local74.equals("lt")) {
						local50 = this.method2469(60);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][60];
						}
						local31 = 60;
					} else if (local74.equals("gt")) {
						local50 = this.method2469(62);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][62];
						}
						local31 = 62;
					} else if (local74.equals("nbsp")) {
						local50 = this.method2469(160);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][160];
						}
						local31 = 160;
					} else if (local74.equals("shy")) {
						local50 = this.method2469(173);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][173];
						}
						local31 = 173;
					} else if (local74.equals("times")) {
						local50 = this.method2469(215);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][215];
						}
						local31 = 215;
					} else if (local74.equals("euro")) {
						local50 = this.method2469(8364);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][8364];
						}
						local31 = 8364;
					} else if (local74.equals("copy")) {
						local50 = this.method2469(169);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][169];
						}
						local31 = 169;
					} else if (local74.equals("reg")) {
						local50 = this.method2469(174);
						if (this.aByteArrayArray26 != null && local31 != -1) {
							local50 += this.aByteArrayArray26[local31][174];
						}
						local31 = 174;
					} else if (local74.startsWith("img=") && arg0 != null) {
						try {
							@Pc(205) int local205 = Static237.method3118(local74.substring(4));
							local31 = -1;
							local50 = arg0[local205].ja();
						} catch (@Pc(216) Exception local216) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg2 != null) {
						if (local48 == 32) {
							local19 = 1;
							local17 = local11;
							local15 = local38;
						}
						if (local11 > arg2[local33 >= arg2.length ? arg2.length - 1 : local33]) {
							if (local15 >= 0) {
								arg3[local33] = arg1.substring(local13, local15 + 1 - local19);
								local33++;
								if (arg3.length <= local33) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local15 = -1;
								local31 = -1;
							} else {
								arg3[local33] = arg1.substring(local13, local67);
								local33++;
								if (arg3.length <= local33) {
									return 0;
								}
								local11 = local50;
								local15 = -1;
								local13 = local67;
								local31 = -1;
							}
						}
						if (local48 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local38;
						}
					}
				}
			}
		}
		if (local13 < arg1.length()) {
			arg3[local33] = arg1.substring(local13, arg1.length());
			local33++;
		}
		return local33;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[Lclient!f;ILjava/lang/String;)I")
	public int method2473(@OriginalArg(0) int arg0, @OriginalArg(1) Class49[] arg1, @OriginalArg(3) String arg2) {
		@Pc(24) int local24 = this.method2472(arg1, arg2, new int[] { arg0 }, Static291.aStringArray40);
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(38) int local38 = this.method2474(Static291.aStringArray40[local28], arg1);
			if (local38 > local26) {
				local26 = local38;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!f;)I")
	public int method2474(@OriginalArg(0) String arg0, @OriginalArg(2) Class49[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg0.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg0.substring(local11 + 1, local26);
					local11 = -1;
					if (local55.equals("lt")) {
						local32 = '<';
					} else if (local55.equals("gt")) {
						local32 = '>';
					} else if (local55.equals("nbsp")) {
						local32 = ' ';
					} else if (local55.equals("shy")) {
						local32 = '\u00ad';
					} else if (local55.equals("times")) {
						local32 = '×';
					} else if (local55.equals("euro")) {
						local32 = '€';
					} else if (local55.equals("copy")) {
						local32 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg1 != null) {
								try {
									@Pc(117) int local117 = Static237.method3118(local55.substring(4));
									local13 = -1;
									local21 += arg1[local117].ja();
								} catch (@Pc(128) Exception local128) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local21 += this.aByteArray32[Static5.method95(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray26 != null && local13 != -1) {
						local21 += this.aByteArrayArray26[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local21;
	}
}
