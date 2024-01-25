import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class101 {

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
	public final int anInt2367;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray50;

	@OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
	public final int anInt2378;

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
	public final int anInt2376;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "([B)V")
	public Class101(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(arg0);
		@Pc(12) int local12 = local8.method4130();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method4130() == 1;
		this.aByteArray36 = new byte[256];
		local8.method4102(this.aByteArray36, 256);
		if (local28) {
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local51[local53] = local8.method4130();
			}
			@Pc(70) int[] local70 = new int[256];
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local70[local72] = local8.method4130();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local51[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method4112();
					local89[local91][local104] = local102;
				}
			}
			@Pc(135) byte[][] local135 = new byte[256][];
			@Pc(150) int local150;
			for (local104 = 0; local104 < 256; local104++) {
				local135[local104] = new byte[local51[local104]];
				@Pc(148) byte local148 = 0;
				for (local150 = 0; local150 < local135[local104].length; local150++) {
					local148 += local8.method4112();
					local135[local104][local150] = local148;
				}
			}
			this.aByteArrayArray50 = new byte[256][256];
			for (@Pc(189) int local189 = 0; local189 < 256; local189++) {
				if (local189 != 32 && local189 != 160) {
					for (local150 = 0; local150 < 256; local150++) {
						if (local150 != 32 && local150 != 160) {
							this.aByteArrayArray50[local189][local150] = (byte) Static42.method688(this.aByteArray36, local70, local150, local189, local89, local51, local135);
						}
					}
				}
			}
			this.anInt2367 = local51[32] + local70[32];
		} else {
			this.anInt2367 = local8.method4130();
		}
		local8.method4130();
		local8.method4130();
		this.anInt2378 = local8.method4130();
		this.anInt2376 = local8.method4130();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method1963(@OriginalArg(0) String arg0) {
		return this.method1966(arg0, null);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;B)I")
	public int method1964(@OriginalArg(0) int arg0, @OriginalArg(1) Class80[] arg1, @OriginalArg(2) String arg2) {
		return this.method1968(arg1, new int[] { arg0 }, arg2, Static141.aStringArray26);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!f;)I")
	public int method1966(@OriginalArg(0) String arg0, @OriginalArg(2) Class80[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local16 = local25;
			} else {
				if (local31 == '>' && local16 != -1) {
					@Pc(56) String local56 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local56.equals("lt")) {
						local31 = '<';
					} else if (local56.equals("gt")) {
						local31 = '>';
					} else if (local56.equals("nbsp")) {
						local31 = ' ';
					} else if (local56.equals("shy")) {
						local31 = '\u00ad';
					} else if (local56.equals("times")) {
						local31 = '×';
					} else if (local56.equals("euro")) {
						local31 = '€';
					} else if (local56.equals("copy")) {
						local31 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg1 != null) {
								try {
									@Pc(116) int local116 = Static438.method5871(local56.substring(4));
									local20 += arg1[local116].ja();
									local18 = -1;
								} catch (@Pc(127) Exception local127) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local16 == -1) {
					local20 += this.aByteArray36[Static57.method1009(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray50 != null && local18 != -1) {
						local20 += this.aByteArrayArray50[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(CII)I")
	public int method1967(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray50 == null ? 0 : this.aByteArrayArray50[arg1][arg0];
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([Lclient!f;[ILjava/lang/String;Z[Ljava/lang/String;)I")
	public int method1968(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg2.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(50) int local50 = Static57.method1009(arg2.charAt(local40)) & 0xFF;
			@Pc(52) int local52 = 0;
			if (local50 == 60) {
				local31 = local40;
			} else {
				@Pc(68) int local68;
				if (local31 == -1) {
					local68 = local40;
					local52 = this.method1971(local50);
					if (this.aByteArrayArray50 != null && local33 != -1) {
						local52 += this.aByteArrayArray50[local33][local50];
					}
					local33 = local50;
				} else {
					if (local50 != 62) {
						continue;
					}
					local68 = local31;
					@Pc(75) String local75 = arg2.substring(local31 + 1, local40);
					local31 = -1;
					if (local75.equals("br")) {
						arg3[local35] = arg2.substring(local13, local40 + 1);
						local35++;
						if (arg3.length <= local35) {
							return 0;
						}
						local11 = 0;
						local13 = local40 + 1;
						local15 = -1;
						local33 = -1;
						continue;
					}
					if (local75.equals("lt")) {
						local52 = this.method1971(60);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][60];
						}
						local33 = 60;
					} else if (local75.equals("gt")) {
						local52 = this.method1971(62);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][62];
						}
						local33 = 62;
					} else if (local75.equals("nbsp")) {
						local52 = this.method1971(160);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][160];
						}
						local33 = 160;
					} else if (local75.equals("shy")) {
						local52 = this.method1971(173);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][173];
						}
						local33 = 173;
					} else if (local75.equals("times")) {
						local52 = this.method1971(215);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][215];
						}
						local33 = 215;
					} else if (local75.equals("euro")) {
						local52 = this.method1971(8364);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][8364];
						}
						local33 = 8364;
					} else if (local75.equals("copy")) {
						local52 = this.method1971(169);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][169];
						}
						local33 = 169;
					} else if (local75.equals("reg")) {
						local52 = this.method1971(174);
						if (this.aByteArrayArray50 != null && local33 != -1) {
							local52 += this.aByteArrayArray50[local33][174];
						}
						local33 = 174;
					} else if (local75.startsWith("img=") && arg0 != null) {
						try {
							@Pc(177) int local177 = Static438.method5871(local75.substring(4));
							local33 = -1;
							local52 = arg0[local177].ja();
						} catch (@Pc(188) Exception local188) {
						}
					}
					local50 = -1;
				}
				if (local52 > 0) {
					local11 += local52;
					if (arg1 != null) {
						if (local50 == 32) {
							local19 = 1;
							local17 = local11;
							local15 = local40;
						}
						if (arg1[arg1.length <= local35 ? arg1.length - 1 : local35] < local11) {
							if (local15 < 0) {
								arg3[local35] = arg2.substring(local13, local68);
								local35++;
								if (local35 >= arg3.length) {
									return 0;
								}
								local13 = local68;
								local15 = -1;
								local33 = -1;
								local11 = local52;
							} else {
								arg3[local35] = arg2.substring(local13, local15 + 1 - local19);
								local35++;
								if (arg3.length <= local35) {
									return 0;
								}
								local13 = local15 + 1;
								local33 = -1;
								local15 = -1;
								local11 -= local17;
							}
						}
						if (local50 == 45) {
							local17 = local11;
							local15 = local40;
							local19 = 0;
						}
					}
				}
			}
		}
		if (arg2.length() > local13) {
			arg3[local35] = arg2.substring(local13, arg2.length());
			local35++;
		}
		return local35;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[Lclient!f;Ljava/lang/String;)Ljava/lang/String;")
	public String method1969(@OriginalArg(0) int arg0, @OriginalArg(2) Class80[] arg1, @OriginalArg(3) String arg2) {
		if (arg0 >= this.method1966(arg2, arg1)) {
			return arg2;
		}
		@Pc(26) int local26 = arg0 - this.method1966("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg2.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg2.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(70) String local70 = arg2.substring(local28 + 1, local39);
					local28 = -1;
					if (local70.equals("lt")) {
						local45 = '<';
					} else if (local70.equals("gt")) {
						local45 = '>';
					} else if (local70.equals("nbsp")) {
						local45 = ' ';
					} else if (local70.equals("shy")) {
						local45 = '\u00ad';
					} else if (local70.equals("times")) {
						local45 = '×';
					} else if (local70.equals("euro")) {
						local45 = '€';
					} else if (local70.equals("copy")) {
						local45 = '©';
					} else {
						if (!local70.equals("reg")) {
							if (local70.startsWith("img=") && arg1 != null) {
								try {
									@Pc(126) int local126 = Static438.method5871(local70.substring(4));
									local30 = -1;
									local32 += arg1[local126].ja();
									if (local26 < local32) {
										return local37 + "...";
									}
									local37 = arg2.substring(0, local39 + 1);
								} catch (@Pc(156) Exception local156) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray36[Static57.method1009(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray50 != null && local30 != -1) {
						local32 += this.aByteArrayArray50[local30][local45];
					}
					local30 = local45;
					@Pc(216) int local216 = local32;
					if (this.aByteArrayArray50 != null) {
						local216 = local32 + this.aByteArrayArray50[local45][46];
					}
					if (local26 < local216) {
						return local37 + "...";
					}
					local37 = arg2.substring(0, local39 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)I")
	public int method1971(@OriginalArg(1) int arg0) {
		return this.aByteArray36[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;III)I")
	public int method1972(@OriginalArg(0) String arg0, @OriginalArg(1) Class80[] arg1) {
		@Pc(5) int local5 = this.anInt2367;
		@Pc(22) int local22 = this.method1968(arg1, new int[] { 100 }, arg0, Static141.aStringArray26);
		@Pc(28) int local28 = (local22 - 1) * local5;
		return this.anInt2378 + local28 + this.anInt2376;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[Lclient!f;ILjava/lang/String;)I")
	public int method1973(@OriginalArg(1) Class80[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(28) int local28 = this.method1968(arg0, new int[] { arg1 }, arg2, Static141.aStringArray26);
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local28; local32++) {
			@Pc(44) int local44 = this.method1966(Static141.aStringArray26[local32], arg0);
			if (local44 > local30) {
				local30 = local44;
			}
		}
		return local30;
	}
}
