import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class183 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "[B")
	private final byte[] aByteArray42;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	public final int anInt5073;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "[[B")
	private byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	public final int anInt5062;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public final int anInt5064;

	static {
		new Class312("", 76);
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "([B)V")
	public Class183(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class2_Sub17 local6 = new Class2_Sub17(arg0);
		@Pc(10) int local10 = local6.method2859();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local6.method2859() == 1;
		this.aByteArray42 = new byte[256];
		local6.method2832(this.aByteArray42, 256, 0);
		if (local28) {
			@Pc(50) int[] local50 = new int[256];
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local50[local55] = local6.method2859();
			}
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local53[local68] = local6.method2859();
			}
			@Pc(84) byte[][] local84 = new byte[256][];
			@Pc(98) int local98;
			for (@Pc(86) int local86 = 0; local86 < 256; local86++) {
				local84[local86] = new byte[local50[local86]];
				@Pc(96) byte local96 = 0;
				for (local98 = 0; local98 < local84[local86].length; local98++) {
					local96 += local6.method2860();
					local84[local86][local98] = local96;
				}
			}
			@Pc(132) byte[][] local132 = new byte[256][];
			@Pc(146) int local146;
			for (local98 = 0; local98 < 256; local98++) {
				local132[local98] = new byte[local50[local98]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local132[local98].length; local146++) {
					local144 += local6.method2860();
					local132[local98][local146] = local144;
				}
			}
			this.aByteArrayArray13 = new byte[256][256];
			for (@Pc(180) int local180 = 0; local180 < 256; local180++) {
				if (local180 != 32 && local180 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray13[local180][local146] = (byte) Static308.method4798(local180, local53, local50, this.aByteArray42, local132, local84, local146);
						}
					}
				}
			}
			this.anInt5073 = local50[32] + local53[32];
		} else {
			this.anInt5073 = local6.method2859();
		}
		local6.method2859();
		local6.method2859();
		this.anInt5062 = local6.method2859();
		this.anInt5064 = local6.method2859();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIC)I")
	public int method4449(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray13 == null ? 0 : this.aByteArrayArray13[arg0][arg1];
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([Lclient!iea;IILjava/lang/String;)I")
	public int method4450(@OriginalArg(0) Class31[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method4458(arg2, Static346.aStringArray34, new int[] { arg1 }, arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;B[Lclient!iea;)Ljava/lang/String;")
	public String method4451(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class31[] arg2) {
		if (arg0 >= this.method4454(arg1, arg2)) {
			return arg1;
		}
		@Pc(20) int local20 = arg0 - this.method4454("...", (Class31[]) null);
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(37) int local37 = arg1.length();
		@Pc(39) String local39 = "";
		for (@Pc(41) int local41 = 0; local41 < local37; local41++) {
			@Pc(46) char local46 = arg1.charAt(local41);
			if (local46 == '<') {
				local22 = local41;
			} else {
				if (local46 == '>' && local22 != -1) {
					@Pc(68) String local68 = arg1.substring(local22 + 1, local41);
					local22 = -1;
					if (local68.equals("lt")) {
						local46 = '<';
					} else if (local68.equals("gt")) {
						local46 = '>';
					} else if (local68.equals("nbsp")) {
						local46 = ' ';
					} else if (local68.equals("shy")) {
						local46 = '\u00ad';
					} else if (local68.equals("times")) {
						local46 = '×';
					} else if (local68.equals("euro")) {
						local46 = '€';
					} else if (local68.equals("copy")) {
						local46 = '©';
					} else {
						if (!local68.equals("reg")) {
							if (local68.startsWith("img=") && arg2 != null) {
								try {
									@Pc(124) int local124 = Static307.method4785(local68.substring(4));
									local26 += arg2[local124].method8788();
									local24 = -1;
									if (local26 > local20) {
										return local39 + "...";
									}
									local39 = arg1.substring(0, local41 + 1);
								} catch (@Pc(154) Exception local154) {
								}
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local22 == -1) {
					local26 += this.aByteArray42[Static81.method1771(local46) & 0xFF] & 0xFF;
					if (this.aByteArrayArray13 != null && local24 != -1) {
						local26 += this.aByteArrayArray13[local24][local46];
					}
					local24 = local46;
					@Pc(204) int local204 = local26;
					if (this.aByteArrayArray13 != null) {
						local204 = local26 + this.aByteArrayArray13[local46][46];
					}
					if (local20 < local204) {
						return local39 + "...";
					}
					local39 = arg1.substring(0, local41 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[Lclient!iea;Ljava/lang/String;I)I")
	public int method4452(@OriginalArg(0) int arg0, @OriginalArg(1) Class31[] arg1, @OriginalArg(2) String arg2) {
		@Pc(16) int local16 = this.method4458(arg2, Static346.aStringArray34, new int[] { arg0 }, arg1);
		@Pc(18) int local18 = 0;
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			@Pc(36) int local36 = this.method4454(Static346.aStringArray34[local25], arg1);
			if (local36 > local18) {
				local18 = local36;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method4453(@OriginalArg(1) String arg0) {
		return this.method4454(arg0, (Class31[]) null);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;[Lclient!iea;I)I")
	public int method4454(@OriginalArg(0) String arg0, @OriginalArg(1) Class31[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) char local31 = arg0.charAt(local26);
			if (local31 == '<') {
				local9 = local26;
			} else {
				if (local31 == '>' && local9 != -1) {
					@Pc(53) String local53 = arg0.substring(local9 + 1, local26);
					local9 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg1 != null) {
								try {
									@Pc(111) int local111 = Static307.method4785(local53.substring(4));
									local21 += arg1[local111].method8788();
									local19 = -1;
								} catch (@Pc(122) Exception local122) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local9 == -1) {
					local21 += this.aByteArray42[Static81.method1771(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray13 != null && local19 != -1) {
						local21 += this.aByteArrayArray13[local19][local31];
					}
					local19 = local31;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([Lclient!iea;Ljava/lang/String;III)I")
	public int method4456(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt5073;
		}
		@Pc(21) int local21 = this.method4458(arg1, Static346.aStringArray34, new int[] { arg2 }, arg0);
		@Pc(32) int local32 = (local21 - 1) * arg3;
		return this.anInt5064 + local32 + this.anInt5062;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)I")
	public int method4457(@OriginalArg(0) int arg0) {
		return this.aByteArray42[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;Z[I[Lclient!iea;)I")
	public int method4458(@OriginalArg(0) String arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class31[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(51) int local51 = Static81.method1771(arg0.charAt(local38)) & 0xFF;
			@Pc(53) int local53 = 0;
			if (local51 == 60) {
				local19 = local38;
			} else {
				@Pc(64) int local64;
				if (local19 == -1) {
					local64 = local38;
					local53 = this.method4457(local51);
					if (this.aByteArrayArray13 != null && local31 != -1) {
						local53 += this.aByteArrayArray13[local31][local51];
					}
					local31 = local51;
				} else {
					if (local51 != 62) {
						continue;
					}
					local64 = local19;
					@Pc(107) String local107 = arg0.substring(local19 + 1, local38);
					local19 = -1;
					if (local107.equals("br")) {
						arg1[local33] = arg0.substring(local11, local38 + 1);
						local33++;
						if (arg1.length <= local33) {
							return 0;
						}
						local11 = local38 + 1;
						local13 = -1;
						local31 = -1;
						local9 = 0;
						continue;
					}
					if (local107.equals("lt")) {
						local53 = this.method4457(60);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][60];
						}
						local31 = 60;
					} else if (local107.equals("gt")) {
						local53 = this.method4457(62);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][62];
						}
						local31 = 62;
					} else if (local107.equals("nbsp")) {
						local53 = this.method4457(160);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][160];
						}
						local31 = 160;
					} else if (local107.equals("shy")) {
						local53 = this.method4457(173);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][173];
						}
						local31 = 173;
					} else if (local107.equals("times")) {
						local53 = this.method4457(215);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][215];
						}
						local31 = 215;
					} else if (local107.equals("euro")) {
						local53 = this.method4457(8364);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][8364];
						}
						local31 = 8364;
					} else if (local107.equals("copy")) {
						local53 = this.method4457(169);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][169];
						}
						local31 = 169;
					} else if (local107.equals("reg")) {
						local53 = this.method4457(174);
						if (this.aByteArrayArray13 != null && local31 != -1) {
							local53 += this.aByteArrayArray13[local31][174];
						}
						local31 = 174;
					} else if (local107.startsWith("img=") && arg3 != null) {
						try {
							@Pc(183) int local183 = Static307.method4785(local107.substring(4));
							local53 = arg3[local183].method8788();
							local31 = -1;
						} catch (@Pc(194) Exception local194) {
						}
					}
					local51 = -1;
				}
				if (local53 > 0) {
					local9 += local53;
					if (arg2 != null) {
						if (local51 == 32) {
							local17 = 1;
							local15 = local9;
							local13 = local38;
						}
						if (local9 > arg2[local33 >= arg2.length ? arg2.length - 1 : local33]) {
							if (local13 < 0) {
								arg1[local33] = arg0.substring(local11, local64);
								local33++;
								if (local33 >= arg1.length) {
									return 0;
								}
								local31 = -1;
								local11 = local64;
								local13 = -1;
								local9 = local53;
							} else {
								arg1[local33] = arg0.substring(local11, local13 + 1 - local17);
								local33++;
								if (arg1.length <= local33) {
									return 0;
								}
								local11 = local13 + 1;
								local31 = -1;
								local9 -= local15;
								local13 = -1;
							}
						}
						if (local51 == 45) {
							local17 = 0;
							local13 = local38;
							local15 = local9;
						}
					}
				}
			}
		}
		if (local11 < arg0.length()) {
			arg1[local33] = arg0.substring(local11, arg0.length());
			local33++;
		}
		return local33;
	}
}
