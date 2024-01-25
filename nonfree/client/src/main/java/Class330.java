import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class330 {

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "[B")
	private final byte[] aByteArray96;

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
	public final int anInt9388;

	@OriginalMember(owner = "client!saa", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
	public final int anInt9384;

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
	public final int anInt9393;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "([B)V")
	public Class330(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub28 local8 = new Class3_Sub28(arg0);
		@Pc(12) int local12 = local8.method5322(-69);
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method5322(-12) == 1;
		this.aByteArray96 = new byte[256];
		local8.method5271(this.aByteArray96, 256, 0);
		if (local30) {
			@Pc(55) int[] local55 = new int[256];
			@Pc(58) int[] local58 = new int[256];
			for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
				local55[local60] = local8.method5322(-18);
			}
			for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
				local58[local76] = local8.method5322(-117);
			}
			@Pc(97) byte[][] local97 = new byte[256][];
			@Pc(116) int local116;
			for (@Pc(99) int local99 = 0; local99 < 256; local99++) {
				local97[local99] = new byte[local55[local99]];
				@Pc(114) byte local114 = 0;
				for (local116 = 0; local116 < local97[local99].length; local116++) {
					local114 += local8.method5288();
					local97[local99][local116] = local114;
				}
			}
			@Pc(153) byte[][] local153 = new byte[256][];
			@Pc(170) int local170;
			for (local116 = 0; local116 < 256; local116++) {
				local153[local116] = new byte[local55[local116]];
				@Pc(168) byte local168 = 0;
				for (local170 = 0; local170 < local153[local116].length; local170++) {
					local168 += local8.method5288();
					local153[local116][local170] = local168;
				}
			}
			this.aByteArrayArray19 = new byte[256][256];
			for (@Pc(211) int local211 = 0; local211 < 256; local211++) {
				if (local211 != 32 && local211 != 160) {
					for (local170 = 0; local170 < 256; local170++) {
						if (local170 != 32 && local170 != 160) {
							this.aByteArrayArray19[local211][local170] = (byte) Static364.method5205(local58, local55, local211, local153, local97, local170, this.aByteArray96);
						}
					}
				}
			}
			this.anInt9388 = local58[32] + local55[32];
		} else {
			this.anInt9388 = local8.method5322(-51);
		}
		local8.method5322(-93);
		local8.method5322(-52);
		this.anInt9384 = local8.method5322(-99);
		this.anInt9393 = local8.method5322(-47);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([Lclient!bka;Ljava/lang/String;B)I")
	public int method7905(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = arg1.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(42) char local42 = arg1.charAt(local34);
			if (local42 == '<') {
				local25 = local34;
			} else {
				if (local42 == '>' && local25 != -1) {
					@Pc(71) String local71 = arg1.substring(local25 + 1, local34);
					local25 = -1;
					if (local71.equals("lt")) {
						local42 = '<';
					} else if (local71.equals("gt")) {
						local42 = '>';
					} else if (local71.equals("nbsp")) {
						local42 = ' ';
					} else if (local71.equals("shy")) {
						local42 = '\u00ad';
					} else if (local71.equals("times")) {
						local42 = '×';
					} else if (local71.equals("euro")) {
						local42 = '€';
					} else if (local71.equals("copy")) {
						local42 = '©';
					} else {
						if (!local71.equals("reg")) {
							if (local71.startsWith("img=") && arg0 != null) {
								try {
									@Pc(161) int local161 = Static349.method5057(local71.substring(4));
									local29 += arg0[local161].method8619();
									local27 = -1;
								} catch (@Pc(172) Exception local172) {
								}
							}
							continue;
						}
						local42 = '®';
					}
				}
				if (local25 == -1) {
					local29 += this.aByteArray96[Static181.method2791(local42) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local27 != -1) {
						local29 += this.aByteArrayArray19[local27][local42];
					}
					local27 = local42;
				}
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BI)I")
	public int method7906(@OriginalArg(1) int arg0) {
		return this.aByteArray96[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!bka;)I")
	public int method7907(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9[] arg2) {
		@Pc(18) int local18 = this.method7912(arg0, new int[] { arg1 }, Static518.aStringArray33, arg2);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(34) int local34 = this.method7905(arg2, Static518.aStringArray33[local22]);
			if (local20 < local34) {
				local20 = local34;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([Lclient!bka;ZILjava/lang/String;)Ljava/lang/String;")
	public String method7908(@OriginalArg(0) Class9[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.method7905(arg0, arg2) <= arg1) {
			return arg2;
		}
		@Pc(29) int local29 = arg1 - this.method7905((Class9[]) null, "...");
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg2.length();
		@Pc(40) String local40 = "";
		for (@Pc(48) int local48 = 0; local48 < local38; local48++) {
			@Pc(56) char local56 = arg2.charAt(local48);
			if (local56 == '<') {
				local31 = local48;
			} else {
				if (local56 == '>' && local31 != -1) {
					@Pc(82) String local82 = arg2.substring(local31 + 1, local48);
					local31 = -1;
					if (local82.equals("lt")) {
						local56 = '<';
					} else if (local82.equals("gt")) {
						local56 = '>';
					} else if (local82.equals("nbsp")) {
						local56 = ' ';
					} else if (local82.equals("shy")) {
						local56 = '\u00ad';
					} else if (local82.equals("times")) {
						local56 = '×';
					} else if (local82.equals("euro")) {
						local56 = '€';
					} else if (local82.equals("copy")) {
						local56 = '©';
					} else {
						if (!local82.equals("reg")) {
							if (local82.startsWith("img=") && arg0 != null) {
								try {
									@Pc(188) int local188 = Static349.method5057(local82.substring(4));
									local33 = -1;
									local35 += arg0[local188].method8619();
									if (local29 < local35) {
										return local40 + "...";
									}
									local40 = arg2.substring(0, local48 + 1);
								} catch (@Pc(225) Exception local225) {
								}
							}
							continue;
						}
						local56 = '®';
					}
				}
				if (local31 == -1) {
					local35 += this.aByteArray96[Static181.method2791(local56) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local33 != -1) {
						local35 += this.aByteArrayArray19[local33][local56];
					}
					local33 = local56;
					@Pc(271) int local271 = local35;
					if (this.aByteArrayArray19 != null) {
						local271 = local35 + this.aByteArrayArray19[local56][46];
					}
					if (local271 > local29) {
						return local40 + "...";
					}
					local40 = arg2.substring(0, local48 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;IB[Lclient!bka;I)I")
	public int method7909(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class9[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt9388;
		}
		@Pc(32) int local32 = this.method7912(arg0, new int[] { arg3 }, Static518.aStringArray33, arg2);
		@Pc(38) int local38 = arg1 * (local32 - 1);
		return this.anInt9393 + local38 + this.anInt9384;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!bka;Z)I")
	public int method7910(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9[] arg2) {
		return this.method7912(arg0, new int[] { arg1 }, Static518.aStringArray33, arg2);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method7911(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 < 93 ? -62 : this.method7905((Class9[]) null, arg1);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;Z[I[Ljava/lang/String;[Lclient!bka;)I")
	public int method7912(@OriginalArg(0) String arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class9[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(28) byte local28 = 0;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(51) int local51 = Static181.method2791(arg0.charAt(local39)) & 0xFF;
			@Pc(53) int local53 = 0;
			if (local51 == 60) {
				local30 = local39;
			} else {
				@Pc(74) int local74;
				if (local30 == -1) {
					local74 = local39;
					local53 = this.method7906(local51);
					if (this.aByteArrayArray19 != null && local32 != -1) {
						local53 += this.aByteArrayArray19[local32][local51];
					}
					local32 = local51;
				} else {
					if (local51 != 62) {
						continue;
					}
					local74 = local30;
					@Pc(81) String local81 = arg0.substring(local30 + 1, local39);
					local30 = -1;
					if (local81.equals("br")) {
						arg2[local34] = arg0.substring(local14, local39 + 1);
						local34++;
						if (local34 >= arg2.length) {
							return 0;
						}
						local14 = local39 + 1;
						local32 = -1;
						local24 = -1;
						local12 = 0;
						continue;
					}
					if (local81.equals("lt")) {
						local53 = this.method7906(60);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][60];
						}
						local32 = 60;
					} else if (local81.equals("gt")) {
						local53 = this.method7906(62);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][62];
						}
						local32 = 62;
					} else if (local81.equals("nbsp")) {
						local53 = this.method7906(160);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][160];
						}
						local32 = 160;
					} else if (local81.equals("shy")) {
						local53 = this.method7906(173);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][173];
						}
						local32 = 173;
					} else if (local81.equals("times")) {
						local53 = this.method7906(215);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][215];
						}
						local32 = 215;
					} else if (local81.equals("euro")) {
						local53 = this.method7906(8364);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][8364];
						}
						local32 = 8364;
					} else if (local81.equals("copy")) {
						local53 = this.method7906(169);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][169];
						}
						local32 = 169;
					} else if (local81.equals("reg")) {
						local53 = this.method7906(174);
						if (this.aByteArrayArray19 != null && local32 != -1) {
							local53 += this.aByteArrayArray19[local32][174];
						}
						local32 = 174;
					} else if (local81.startsWith("img=") && arg3 != null) {
						try {
							@Pc(228) int local228 = Static349.method5057(local81.substring(4));
							local32 = -1;
							local53 = arg3[local228].method8619();
						} catch (@Pc(239) Exception local239) {
						}
					}
					local51 = -1;
				}
				if (local53 > 0) {
					local12 += local53;
					if (arg1 != null) {
						if (local51 == 32) {
							local26 = local12;
							local28 = 1;
							local24 = local39;
						}
						if (local12 > arg1[local34 >= arg1.length ? arg1.length - 1 : local34]) {
							if (local24 >= 0) {
								arg2[local34] = arg0.substring(local14, local24 + 1 - local28);
								local34++;
								if (arg2.length <= local34) {
									return 0;
								}
								local14 = local24 + 1;
								local24 = -1;
								local32 = -1;
								local12 -= local26;
							} else {
								arg2[local34] = arg0.substring(local14, local74);
								local34++;
								if (arg2.length <= local34) {
									return 0;
								}
								local12 = local53;
								local14 = local74;
								local32 = -1;
								local24 = -1;
							}
						}
						if (local51 == 45) {
							local26 = local12;
							local24 = local39;
							local28 = 0;
						}
					}
				}
			}
		}
		if (local14 < arg0.length()) {
			arg2[local34] = arg0.substring(local14, arg0.length());
			local34++;
		}
		return local34;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BIC)I")
	public int method7913(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray19 == null ? 0 : this.aByteArrayArray19[arg0][arg1];
	}
}
