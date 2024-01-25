import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class297 {

	@OriginalMember(owner = "client!sga", name = "j", descriptor = "[B")
	private final byte[] aByteArray102;

	@OriginalMember(owner = "client!sga", name = "l", descriptor = "I")
	public final int anInt8933;

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "I")
	public final int anInt8936;

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "I")
	public final int anInt8935;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "([B)V")
	public Class297(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub7 local6 = new Class3_Sub7(arg0);
		@Pc(10) int local10 = local6.method6538();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local6.method6538() == 1;
		this.aByteArray102 = new byte[256];
		local6.method6540(this.aByteArray102, 256);
		if (local28) {
			@Pc(50) int[] local50 = new int[256];
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local50[local55] = local6.method6538();
			}
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local53[local68] = local6.method6538();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(96) int local96;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local50[local84]];
				@Pc(94) byte local94 = 0;
				for (local96 = 0; local96 < local82[local84].length; local96++) {
					local94 += local6.method6529();
					local82[local84][local96] = local94;
				}
			}
			@Pc(126) byte[][] local126 = new byte[256][];
			@Pc(140) int local140;
			for (local96 = 0; local96 < 256; local96++) {
				local126[local96] = new byte[local50[local96]];
				@Pc(138) byte local138 = 0;
				for (local140 = 0; local140 < local126[local96].length; local140++) {
					local138 += local6.method6529();
					local126[local96][local140] = local138;
				}
			}
			this.aByteArrayArray27 = new byte[256][256];
			for (@Pc(176) int local176 = 0; local176 < 256; local176++) {
				if (local176 != 32 && local176 != 160) {
					for (local140 = 0; local140 < 256; local140++) {
						if (local140 != 32 && local140 != 160) {
							this.aByteArrayArray27[local176][local140] = (byte) Static303.method5018(local50, this.aByteArray102, local140, local82, local53, local176, local126);
						}
					}
				}
			}
			this.anInt8933 = local53[32] + local50[32];
		} else {
			this.anInt8933 = local6.method6538();
		}
		local6.method6538();
		local6.method6538();
		this.anInt8936 = local6.method6538();
		this.anInt8935 = local6.method6538();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lclient!xa;IILjava/lang/String;)I")
	public int method7312(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(16) int local16 = this.method7320(new int[] { arg1 }, arg0, Static93.aStringArray10, arg2);
		@Pc(18) int local18 = 0;
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			@Pc(34) int local34 = this.method7321(Static93.aStringArray10[local25], arg0);
			if (local18 < local34) {
				local18 = local34;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lclient!xa;ILjava/lang/String;Z)I")
	public int method7313(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return this.method7320(new int[] { arg1 }, arg0, Static93.aStringArray10, arg2);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method7314(@OriginalArg(1) String arg0) {
		return this.method7321(arg0, null);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(CII)I")
	public int method7315(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray27 == null ? 0 : this.aByteArrayArray27[arg1][arg0];
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZI)I")
	public int method7317(@OriginalArg(1) int arg0) {
		return this.aByteArray102[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IILjava/lang/String;I[Lclient!xa;)I")
	public int method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class37[] arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt8933;
		}
		@Pc(21) int local21 = this.method7320(new int[] { arg1 }, arg3, Static93.aStringArray10, arg2);
		@Pc(27) int local27 = arg0 * (local21 - 1);
		return this.anInt8936 + local27 + this.anInt8935;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;[Lclient!xa;II)Ljava/lang/String;")
	public String method7319(@OriginalArg(0) String arg0, @OriginalArg(1) Class37[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= this.method7321(arg0, arg1)) {
			return arg0;
		}
		@Pc(31) int local31 = arg2 - this.method7321("...", null);
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(49) char local49 = arg0.charAt(local44);
			if (local49 == '<') {
				local33 = local44;
			} else {
				if (local49 == '>' && local33 != -1) {
					@Pc(71) String local71 = arg0.substring(local33 + 1, local44);
					local33 = -1;
					if (local71.equals("lt")) {
						local49 = '<';
					} else if (local71.equals("gt")) {
						local49 = '>';
					} else if (local71.equals("nbsp")) {
						local49 = ' ';
					} else if (local71.equals("shy")) {
						local49 = '\u00ad';
					} else if (local71.equals("times")) {
						local49 = '×';
					} else if (local71.equals("euro")) {
						local49 = '€';
					} else if (local71.equals("copy")) {
						local49 = '©';
					} else {
						if (!local71.equals("reg")) {
							if (local71.startsWith("img=") && arg1 != null) {
								try {
									@Pc(126) int local126 = Static403.method6559(local71.substring(4));
									local35 = -1;
									local37 += arg1[local126].AA();
									if (local37 > local31) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(160) Exception local160) {
								}
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local33 == -1) {
					local37 += this.aByteArray102[Static99.method2137(local49) & 0xFF] & 0xFF;
					if (this.aByteArrayArray27 != null && local35 != -1) {
						local37 += this.aByteArrayArray27[local35][local49];
					}
					local35 = local49;
					@Pc(211) int local211 = local37;
					if (this.aByteArrayArray27 != null) {
						local211 = local37 + this.aByteArrayArray27[local49][46];
					}
					if (local31 < local211) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B[I[Lclient!xa;[Ljava/lang/String;Ljava/lang/String;)I")
	public int method7320(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class37[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(23) byte local23 = 0;
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = arg3.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(43) int local43 = Static99.method2137(arg3.charAt(local34)) & 0xFF;
			@Pc(45) int local45 = 0;
			if (local43 == 60) {
				local25 = local34;
			} else {
				@Pc(62) int local62;
				if (local25 == -1) {
					local62 = local34;
					local45 = this.method7317(local43);
					if (this.aByteArrayArray27 != null && local27 != -1) {
						local45 += this.aByteArrayArray27[local27][local43];
					}
					local27 = local43;
				} else {
					if (local43 != 62) {
						continue;
					}
					local62 = local25;
					@Pc(69) String local69 = arg3.substring(local25 + 1, local34);
					local25 = -1;
					if (local69.equals("br")) {
						arg2[local29] = arg3.substring(local17, local34 + 1);
						local29++;
						if (arg2.length <= local29) {
							return 0;
						}
						local15 = 0;
						local19 = -1;
						local17 = local34 + 1;
						local27 = -1;
						continue;
					}
					if (local69.equals("lt")) {
						local45 = this.method7317(60);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][60];
						}
						local27 = 60;
					} else if (local69.equals("gt")) {
						local45 = this.method7317(62);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][62];
						}
						local27 = 62;
					} else if (local69.equals("nbsp")) {
						local45 = this.method7317(160);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][160];
						}
						local27 = 160;
					} else if (local69.equals("shy")) {
						local45 = this.method7317(173);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][173];
						}
						local27 = 173;
					} else if (local69.equals("times")) {
						local45 = this.method7317(215);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][215];
						}
						local27 = 215;
					} else if (local69.equals("euro")) {
						local45 = this.method7317(8364);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][8364];
						}
						local27 = 8364;
					} else if (local69.equals("copy")) {
						local45 = this.method7317(169);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][169];
						}
						local27 = 169;
					} else if (local69.equals("reg")) {
						local45 = this.method7317(174);
						if (this.aByteArrayArray27 != null && local27 != -1) {
							local45 += this.aByteArrayArray27[local27][174];
						}
						local27 = 174;
					} else if (local69.startsWith("img=") && arg1 != null) {
						try {
							@Pc(194) int local194 = Static403.method6559(local69.substring(4));
							local27 = -1;
							local45 = arg1[local194].AA();
						} catch (@Pc(205) Exception local205) {
						}
					}
					local43 = -1;
				}
				if (local45 > 0) {
					local15 += local45;
					if (arg0 != null) {
						if (local43 == 32) {
							local21 = local15;
							local19 = local34;
							local23 = 1;
						}
						if (local15 > arg0[local29 >= arg0.length ? arg0.length - 1 : local29]) {
							if (local19 < 0) {
								arg2[local29] = arg3.substring(local17, local62);
								local29++;
								if (arg2.length <= local29) {
									return 0;
								}
								local19 = -1;
								local17 = local62;
								local15 = local45;
								local27 = -1;
							} else {
								arg2[local29] = arg3.substring(local17, local19 + 1 - local23);
								local29++;
								if (arg2.length <= local29) {
									return 0;
								}
								local17 = local19 + 1;
								local15 -= local21;
								local19 = -1;
								local27 = -1;
							}
						}
						if (local43 == 45) {
							local21 = local15;
							local23 = 0;
							local19 = local34;
						}
					}
				}
			}
		}
		if (arg3.length() > local17) {
			arg2[local29] = arg3.substring(local17, arg3.length());
			local29++;
		}
		return local29;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;[Lclient!xa;I)I")
	public int method7321(@OriginalArg(0) String arg0, @OriginalArg(1) Class37[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(23) char local23 = arg0.charAt(local18);
			if (local23 == '<') {
				local9 = local18;
			} else {
				if (local23 == '>' && local9 != -1) {
					@Pc(44) String local44 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local44.equals("lt")) {
						local23 = '<';
					} else if (local44.equals("gt")) {
						local23 = '>';
					} else if (local44.equals("nbsp")) {
						local23 = ' ';
					} else if (local44.equals("shy")) {
						local23 = '\u00ad';
					} else if (local44.equals("times")) {
						local23 = '×';
					} else if (local44.equals("euro")) {
						local23 = '€';
					} else if (local44.equals("copy")) {
						local23 = '©';
					} else {
						if (!local44.equals("reg")) {
							if (local44.startsWith("img=") && arg1 != null) {
								try {
									@Pc(103) int local103 = Static403.method6559(local44.substring(4));
									local13 += arg1[local103].AA();
									local11 = -1;
								} catch (@Pc(114) Exception local114) {
								}
							}
							continue;
						}
						local23 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray102[Static99.method2137(local23) & 0xFF] & 0xFF;
					if (this.aByteArrayArray27 != null && local11 != -1) {
						local13 += this.aByteArrayArray27[local11][local23];
					}
					local11 = local23;
				}
			}
		}
		return local13;
	}
}
