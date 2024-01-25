import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class133 {

	@OriginalMember(owner = "client!hia", name = "s", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
	public final int anInt4195;

	@OriginalMember(owner = "client!hia", name = "h", descriptor = "[[B")
	private byte[][] aByteArrayArray70;

	@OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
	public final int anInt4192;

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
	public final int anInt4190;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "([B)V")
	public Class133(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub40 local8 = new Class6_Sub40(arg0);
		@Pc(12) int local12 = local8.method8604();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method8604() == 1;
		this.aByteArray49 = new byte[256];
		local8.method8595(this.aByteArray49, 256, 0);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			@Pc(59) int[] local59 = new int[256];
			for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
				local56[local61] = local8.method8604();
			}
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local59[local77] = local8.method8604();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local56[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method8602();
					local92[local94][local107] = local105;
				}
			}
			@Pc(136) byte[][] local136 = new byte[256][];
			@Pc(151) int local151;
			for (local107 = 0; local107 < 256; local107++) {
				local136[local107] = new byte[local56[local107]];
				@Pc(149) byte local149 = 0;
				for (local151 = 0; local151 < local136[local107].length; local151++) {
					local149 += local8.method8602();
					local136[local107][local151] = local149;
				}
			}
			this.aByteArrayArray70 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local151 = 0; local151 < 256; local151++) {
						if (local151 != 32 && local151 != 160) {
							this.aByteArrayArray70[local190][local151] = (byte) Static197.method8801(local190, local56, local92, this.aByteArray49, local151, local136, local59);
						}
					}
				}
			}
			this.anInt4195 = local56[32] + local59[32];
		} else {
			this.anInt4195 = local8.method8604();
		}
		local8.method8604();
		local8.method8604();
		this.anInt4192 = local8.method8604();
		this.anInt4190 = local8.method8604();
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZI[Lclient!pga;Ljava/lang/String;)Ljava/lang/String;")
	public String method3637(@OriginalArg(1) int arg0, @OriginalArg(2) Class32[] arg1, @OriginalArg(3) String arg2) {
		if (arg0 >= this.method3645(arg2, arg1)) {
			return arg2;
		}
		@Pc(22) int local22 = arg0 - this.method3645("...", (Class32[]) null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg2.length();
		@Pc(33) String local33 = "";
		for (@Pc(43) int local43 = 0; local43 < local31; local43++) {
			@Pc(49) char local49 = arg2.charAt(local43);
			if (local49 == '<') {
				local24 = local43;
			} else {
				if (local49 == '>' && local24 != -1) {
					@Pc(72) String local72 = arg2.substring(local24 + 1, local43);
					local24 = -1;
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
									@Pc(140) int local140 = Static355.method5682(local72.substring(4));
									local26 = -1;
									local28 += arg1[local140].method5080();
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg2.substring(0, local43 + 1);
								} catch (@Pc(174) Exception local174) {
								}
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray49[Static557.method8051(local49) & 0xFF] & 0xFF;
					if (this.aByteArrayArray70 != null && local26 != -1) {
						local28 += this.aByteArrayArray70[local26][local49];
					}
					local26 = local49;
					@Pc(222) int local222 = local28;
					if (this.aByteArrayArray70 != null) {
						local222 = local28 + this.aByteArrayArray70[local49][46];
					}
					if (local22 < local222) {
						return local33 + "...";
					}
					local33 = arg2.substring(0, local43 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I[Lclient!pga;ILjava/lang/String;)I")
	public int method3639(@OriginalArg(0) int arg0, @OriginalArg(1) Class32[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method3640(Static614.aStringArray72, new int[] { arg0 }, arg2, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method3645(Static614.aStringArray72[local22], arg1);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "([Ljava/lang/String;[ILjava/lang/String;B[Lclient!pga;)I")
	public int method3640(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class32[] arg3) {
		if (arg2 == null) {
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
		@Pc(28) int local28 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local28; local35++) {
			@Pc(45) int local45 = Static557.method8051(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(65) int local65;
				if (local21 == -1) {
					local47 = this.method3644(local45);
					local65 = local35;
					if (this.aByteArrayArray70 != null && local23 != -1) {
						local47 += this.aByteArrayArray70[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local65 = local21;
					@Pc(72) String local72 = arg2.substring(local21 + 1, local35);
					local21 = -1;
					if (local72.equals("br")) {
						arg0[local25] = arg2.substring(local13, local35 + 1);
						local25++;
						if (arg0.length <= local25) {
							return 0;
						}
						local13 = local35 + 1;
						local11 = 0;
						local23 = -1;
						local15 = -1;
						continue;
					}
					if (local72.equals("lt")) {
						local47 = this.method3644(60);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][60];
						}
						local23 = 60;
					} else if (local72.equals("gt")) {
						local47 = this.method3644(62);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][62];
						}
						local23 = 62;
					} else if (local72.equals("nbsp")) {
						local47 = this.method3644(160);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][160];
						}
						local23 = 160;
					} else if (local72.equals("shy")) {
						local47 = this.method3644(173);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][173];
						}
						local23 = 173;
					} else if (local72.equals("times")) {
						local47 = this.method3644(215);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][215];
						}
						local23 = 215;
					} else if (local72.equals("euro")) {
						local47 = this.method3644(8364);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][8364];
						}
						local23 = 8364;
					} else if (local72.equals("copy")) {
						local47 = this.method3644(169);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][169];
						}
						local23 = 169;
					} else if (local72.equals("reg")) {
						local47 = this.method3644(174);
						if (this.aByteArrayArray70 != null && local23 != -1) {
							local47 += this.aByteArrayArray70[local23][174];
						}
						local23 = 174;
					} else if (local72.startsWith("img=") && arg3 != null) {
						try {
							@Pc(261) int local261 = Static355.method5682(local72.substring(4));
							local23 = -1;
							local47 = arg3[local261].method5080();
						} catch (@Pc(272) Exception local272) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg1 != null) {
						if (local45 == 32) {
							local15 = local35;
							local19 = 1;
							local17 = local11;
						}
						if (arg1[local25 >= arg1.length ? arg1.length - 1 : local25] < local11) {
							if (local15 >= 0) {
								arg0[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local23 = -1;
								local15 = -1;
							} else {
								arg0[local25] = arg2.substring(local13, local65);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local15 = -1;
								local23 = -1;
								local13 = local65;
								local11 = local47;
							}
						}
						if (local45 == 45) {
							local15 = local35;
							local19 = 0;
							local17 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg2.length()) {
			arg0[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BIC)I")
	public int method3642(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray70 == null ? 0 : this.aByteArrayArray70[arg0][arg1];
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3643(@OriginalArg(1) String arg0) {
		return this.method3645(arg0, (Class32[]) null);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)I")
	public int method3644(@OriginalArg(0) int arg0) {
		return this.aByteArray49[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!pga;)I")
	public int method3645(@OriginalArg(0) String arg0, @OriginalArg(2) Class32[] arg1) {
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
					@Pc(48) String local48 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local48.equals("lt")) {
						local26 = '<';
					} else if (local48.equals("gt")) {
						local26 = '>';
					} else if (local48.equals("nbsp")) {
						local26 = ' ';
					} else if (local48.equals("shy")) {
						local26 = '\u00ad';
					} else if (local48.equals("times")) {
						local26 = '×';
					} else if (local48.equals("euro")) {
						local26 = '€';
					} else if (local48.equals("copy")) {
						local26 = '©';
					} else {
						if (!local48.equals("reg")) {
							if (local48.startsWith("img=") && arg1 != null) {
								try {
									@Pc(108) int local108 = Static355.method5682(local48.substring(4));
									local13 = -1;
									local15 += arg1[local108].method5080();
								} catch (@Pc(119) Exception local119) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray49[Static557.method8051(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray70 != null && local13 != -1) {
						local15 += this.aByteArrayArray70[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I[Lclient!pga;Ljava/lang/String;II)I")
	public int method3646(@OriginalArg(1) Class32[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt4195;
		}
		@Pc(29) int local29 = this.method3640(Static614.aStringArray72, new int[] { arg2 }, arg1, arg0);
		@Pc(35) int local35 = (local29 - 1) * arg3;
		return local35 + this.anInt4192 + this.anInt4190;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IB[Lclient!pga;Ljava/lang/String;)I")
	public int method3648(@OriginalArg(0) int arg0, @OriginalArg(2) Class32[] arg1, @OriginalArg(3) String arg2) {
		return this.method3640(Static614.aStringArray72, new int[] { arg0 }, arg2, arg1);
	}
}
