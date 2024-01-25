import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class82 {

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public final int anInt2528;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public final int anInt2530;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public final int anInt2524;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
	public Class82(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub26 local8 = new Class6_Sub26(arg0);
		@Pc(12) int local12 = local8.method4966();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method4966() == 1;
		this.aByteArray43 = new byte[256];
		local8.method4977(256, this.aByteArray43);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local53[local58] = local8.method4966();
			}
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local56[local72] = local8.method4966();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local53[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method4972();
					local89[local91][local104] = local102;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local104 = 0; local104 < 256; local104++) {
				local133[local104] = new byte[local53[local104]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local104].length; local148++) {
					local146 += local8.method4972();
					local133[local104][local148] = local146;
				}
			}
			this.aByteArrayArray8 = new byte[256][256];
			for (@Pc(183) int local183 = 0; local183 < 256; local183++) {
				if (local183 != 32 && local183 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray8[local183][local148] = (byte) Static84.method1836(local56, local89, local133, local148, this.aByteArray43, local183, local53);
						}
					}
				}
			}
			this.anInt2528 = local56[32] + local53[32];
		} else {
			this.anInt2528 = local8.method4966();
		}
		local8.method4966();
		local8.method4966();
		this.anInt2530 = local8.method4966();
		this.anInt2524 = local8.method4966();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lclient!xa;Ljava/lang/String;I)Ljava/lang/String;")
	public String method2286(@OriginalArg(1) Class66[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method2294(arg1, arg0)) {
			return arg1;
		}
		@Pc(22) int local22 = arg2 - this.method2294("...", null);
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
							if (local66.startsWith("img=") && arg0 != null) {
								try {
									@Pc(130) int local130 = Static228.method4072(local66.substring(4));
									local28 += arg0[local130].AA();
									local26 = -1;
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg1.substring(0, local35 + 1);
								} catch (@Pc(164) Exception local164) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray43[Static139.method2605(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray8 != null && local26 != -1) {
						local28 += this.aByteArrayArray8[local26][local41];
					}
					local26 = local41;
					@Pc(216) int local216 = local28;
					if (this.aByteArrayArray8 != null) {
						local216 = local28 + this.aByteArrayArray8[local41][46];
					}
					if (local22 < local216) {
						return local33 + "...";
					}
					local33 = arg1.substring(0, local35 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!xa;)I")
	public int method2287(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class66[] arg2) {
		@Pc(18) int local18 = this.method2291(arg0, arg2, Static129.aStringArray19, new int[] { arg1 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method2294(Static129.aStringArray19[local22], arg2);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([Lclient!xa;IILjava/lang/String;)I")
	public int method2288(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return this.method2291(arg2, arg0, Static129.aStringArray19, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	public int method2289(@OriginalArg(1) int arg0) {
		return this.aByteArray43[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;[Lclient!xa;I[Ljava/lang/String;[I)I")
	public int method2291(@OriginalArg(0) String arg0, @OriginalArg(1) Class66[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(28) byte local28 = 0;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(49) int local49 = Static139.method2605(arg0.charAt(local39)) & 0xFF;
			@Pc(51) int local51 = 0;
			if (local49 == 60) {
				local30 = local39;
			} else {
				@Pc(72) int local72;
				if (local30 == -1) {
					local51 = this.method2289(local49);
					local72 = local39;
					if (this.aByteArrayArray8 != null && local32 != -1) {
						local51 += this.aByteArrayArray8[local32][local49];
					}
					local32 = local49;
				} else {
					if (local49 != 62) {
						continue;
					}
					local72 = local30;
					@Pc(106) String local106 = arg0.substring(local30 + 1, local39);
					local30 = -1;
					if (local106.equals("br")) {
						arg2[local34] = arg0.substring(local22, local39 + 1);
						local34++;
						if (local34 >= arg2.length) {
							return 0;
						}
						local32 = -1;
						local24 = -1;
						local22 = local39 + 1;
						local20 = 0;
						continue;
					}
					if (local106.equals("lt")) {
						local51 = this.method2289(60);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][60];
						}
						local32 = 60;
					} else if (local106.equals("gt")) {
						local51 = this.method2289(62);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][62];
						}
						local32 = 62;
					} else if (local106.equals("nbsp")) {
						local51 = this.method2289(160);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][160];
						}
						local32 = 160;
					} else if (local106.equals("shy")) {
						local51 = this.method2289(173);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][173];
						}
						local32 = 173;
					} else if (local106.equals("times")) {
						local51 = this.method2289(215);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][215];
						}
						local32 = 215;
					} else if (local106.equals("euro")) {
						local51 = this.method2289(8364);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][8364];
						}
						local32 = 8364;
					} else if (local106.equals("copy")) {
						local51 = this.method2289(169);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][169];
						}
						local32 = 169;
					} else if (local106.equals("reg")) {
						local51 = this.method2289(174);
						if (this.aByteArrayArray8 != null && local32 != -1) {
							local51 += this.aByteArrayArray8[local32][174];
						}
						local32 = 174;
					} else if (local106.startsWith("img=") && arg1 != null) {
						try {
							@Pc(239) int local239 = Static228.method4072(local106.substring(4));
							local51 = arg1[local239].AA();
							local32 = -1;
						} catch (@Pc(250) Exception local250) {
						}
					}
					local49 = -1;
				}
				if (local51 > 0) {
					local20 += local51;
					if (arg3 != null) {
						if (local49 == 32) {
							local28 = 1;
							local26 = local20;
							local24 = local39;
						}
						if (arg3[arg3.length > local34 ? local34 : arg3.length - 1] < local20) {
							if (local24 < 0) {
								arg2[local34] = arg0.substring(local22, local72);
								local34++;
								if (arg2.length <= local34) {
									return 0;
								}
								local22 = local72;
								local32 = -1;
								local20 = local51;
								local24 = -1;
							} else {
								arg2[local34] = arg0.substring(local22, local24 + 1 - local28);
								local34++;
								if (local34 >= arg2.length) {
									return 0;
								}
								local22 = local24 + 1;
								local20 -= local26;
								local24 = -1;
								local32 = -1;
							}
						}
						if (local49 == 45) {
							local24 = local39;
							local28 = 0;
							local26 = local20;
						}
					}
				}
			}
		}
		if (arg0.length() > local22) {
			arg2[local34] = arg0.substring(local22, arg0.length());
			local34++;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2292(@OriginalArg(1) String arg0) {
		return this.method2294(arg0, null);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;[Lclient!xa;)I")
	public int method2294(@OriginalArg(1) String arg0, @OriginalArg(2) Class66[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(36) char local36 = arg0.charAt(local20);
			if (local36 == '<') {
				local11 = local20;
			} else {
				if (local36 == '>' && local11 != -1) {
					@Pc(59) String local59 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local59.equals("lt")) {
						local36 = '<';
					} else if (local59.equals("gt")) {
						local36 = '>';
					} else if (local59.equals("nbsp")) {
						local36 = ' ';
					} else if (local59.equals("shy")) {
						local36 = '\u00ad';
					} else if (local59.equals("times")) {
						local36 = '×';
					} else if (local59.equals("euro")) {
						local36 = '€';
					} else if (local59.equals("copy")) {
						local36 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=") && arg1 != null) {
								try {
									@Pc(119) int local119 = Static228.method4072(local59.substring(4));
									local15 += arg1[local119].AA();
									local13 = -1;
								} catch (@Pc(130) Exception local130) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray43[Static139.method2605(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray8 != null && local13 != -1) {
						local15 += this.aByteArrayArray8[local13][local36];
					}
					local13 = local36;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!xa;I)I")
	public int method2295(@OriginalArg(1) String arg0, @OriginalArg(3) Class66[] arg1) {
		@Pc(7) int local7 = this.anInt2528;
		@Pc(26) int local26 = this.method2291(arg0, arg1, Static129.aStringArray19, new int[] { 100 });
		@Pc(32) int local32 = local7 * (local26 - 1);
		return local32 + this.anInt2530 + this.anInt2524;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ICB)I")
	public int method2296(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray8 == null ? 0 : this.aByteArrayArray8[arg0][arg1];
	}
}
