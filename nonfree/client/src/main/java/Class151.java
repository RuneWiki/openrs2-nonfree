import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class151 {

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public final int anInt4135;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	public final int anInt4134;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
	public final int anInt4125;

	static {
		new Class7("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
		new Class7("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V")
	public Class151(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class1_Sub5 local6 = new Class1_Sub5(arg0);
		@Pc(10) int local10 = local6.method5366();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(29) boolean local29 = local6.method5366() == 1;
		this.aByteArray63 = new byte[256];
		local6.method5391(this.aByteArray63, 256);
		if (local29) {
			@Pc(45) int[] local45 = new int[256];
			@Pc(48) int[] local48 = new int[256];
			for (@Pc(50) int local50 = 0; local50 < 256; local50++) {
				local45[local50] = local6.method5366();
			}
			for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
				local48[local63] = local6.method5366();
			}
			@Pc(77) byte[][] local77 = new byte[256][];
			@Pc(91) int local91;
			for (@Pc(79) int local79 = 0; local79 < 256; local79++) {
				local77[local79] = new byte[local45[local79]];
				@Pc(89) byte local89 = 0;
				for (local91 = 0; local91 < local77[local79].length; local91++) {
					local89 += local6.method5416();
					local77[local79][local91] = local89;
				}
			}
			@Pc(121) byte[][] local121 = new byte[256][];
			@Pc(135) int local135;
			for (local91 = 0; local91 < 256; local91++) {
				local121[local91] = new byte[local45[local91]];
				@Pc(133) byte local133 = 0;
				for (local135 = 0; local135 < local121[local91].length; local135++) {
					local133 += local6.method5416();
					local121[local91][local135] = local133;
				}
			}
			this.aByteArrayArray11 = new byte[256][256];
			for (@Pc(173) int local173 = 0; local173 < 256; local173++) {
				if (local173 != 32 && local173 != 160) {
					for (local135 = 0; local135 < 256; local135++) {
						if (local135 != 32 && local135 != 160) {
							this.aByteArrayArray11[local173][local135] = (byte) Static77.method1519(local48, local45, this.aByteArray63, local135, local77, local173, local121);
						}
					}
				}
			}
			this.anInt4135 = local45[32] + local48[32];
		} else {
			this.anInt4135 = local6.method5366();
		}
		local6.method5366();
		local6.method5366();
		this.anInt4134 = local6.method5366();
		this.anInt4125 = local6.method5366();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lclient!l;BLjava/lang/String;[I[Ljava/lang/String;)I")
	public int method3465(@OriginalArg(0) Class143[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(22) byte local22 = 0;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(42) int local42 = Static372.method5075(arg1.charAt(local33)) & 0xFF;
			@Pc(44) int local44 = 0;
			if (local42 == 60) {
				local24 = local33;
			} else {
				@Pc(63) int local63;
				if (local24 == -1) {
					local63 = local33;
					local44 = this.method3472(local42);
					if (this.aByteArrayArray11 != null && local26 != -1) {
						local44 += this.aByteArrayArray11[local26][local42];
					}
					local26 = local42;
				} else {
					if (local42 != 62) {
						continue;
					}
					local63 = local24;
					@Pc(70) String local70 = arg1.substring(local24 + 1, local33);
					local24 = -1;
					if (local70.equals("br")) {
						arg3[local28] = arg1.substring(local16, local33 + 1);
						local28++;
						if (arg3.length <= local28) {
							return 0;
						}
						local18 = -1;
						local14 = 0;
						local16 = local33 + 1;
						local26 = -1;
						continue;
					}
					if (local70.equals("lt")) {
						local44 = this.method3472(60);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][60];
						}
						local26 = 60;
					} else if (local70.equals("gt")) {
						local44 = this.method3472(62);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][62];
						}
						local26 = 62;
					} else if (local70.equals("nbsp")) {
						local44 = this.method3472(160);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][160];
						}
						local26 = 160;
					} else if (local70.equals("shy")) {
						local44 = this.method3472(173);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][173];
						}
						local26 = 173;
					} else if (local70.equals("times")) {
						local44 = this.method3472(215);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][215];
						}
						local26 = 215;
					} else if (local70.equals("euro")) {
						local44 = this.method3472(8364);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][8364];
						}
						local26 = 8364;
					} else if (local70.equals("copy")) {
						local44 = this.method3472(169);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][169];
						}
						local26 = 169;
					} else if (local70.equals("reg")) {
						local44 = this.method3472(174);
						if (this.aByteArrayArray11 != null && local26 != -1) {
							local44 += this.aByteArrayArray11[local26][174];
						}
						local26 = 174;
					} else if (local70.startsWith("img=") && arg0 != null) {
						try {
							@Pc(247) int local247 = Static313.method4460(local70.substring(4));
							local44 = arg0[local247].j();
							local26 = -1;
						} catch (@Pc(258) Exception local258) {
						}
					}
					local42 = -1;
				}
				if (local44 > 0) {
					local14 += local44;
					if (arg2 != null) {
						if (local42 == 32) {
							local20 = local14;
							local18 = local33;
							local22 = 1;
						}
						if (local14 > arg2[local28 >= arg2.length ? arg2.length - 1 : local28]) {
							if (local18 < 0) {
								arg3[local28] = arg1.substring(local16, local63);
								local28++;
								if (arg3.length <= local28) {
									return 0;
								}
								local18 = -1;
								local14 = local44;
								local26 = -1;
								local16 = local63;
							} else {
								arg3[local28] = arg1.substring(local16, local18 + 1 - local22);
								local28++;
								if (arg3.length <= local28) {
									return 0;
								}
								local16 = local18 + 1;
								local26 = -1;
								local18 = -1;
								local14 -= local20;
							}
						}
						if (local42 == 45) {
							local18 = local33;
							local22 = 0;
							local20 = local14;
						}
					}
				}
			}
		}
		if (arg1.length() > local16) {
			arg3[local28] = arg1.substring(local16, arg1.length());
			local28++;
		}
		return local28;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[Lclient!l;Ljava/lang/String;B)I")
	public int method3467(@OriginalArg(0) int arg0, @OriginalArg(1) Class143[] arg1, @OriginalArg(2) String arg2) {
		return this.method3465(arg1, arg2, new int[] { arg0 }, Static283.aStringArray32);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lclient!l;ILjava/lang/String;B)Ljava/lang/String;")
	public String method3468(@OriginalArg(0) Class143[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 >= this.method3471(arg2, arg0)) {
			return arg2;
		}
		@Pc(33) int local33 = arg1 - this.method3471("...", null);
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg2.length();
		@Pc(44) String local44 = "";
		for (@Pc(46) int local46 = 0; local46 < local42; local46++) {
			@Pc(51) char local51 = arg2.charAt(local46);
			if (local51 == '<') {
				local35 = local46;
			} else {
				if (local51 == '>' && local35 != -1) {
					@Pc(72) String local72 = arg2.substring(local35 + 1, local46);
					local35 = -1;
					if (local72.equals("lt")) {
						local51 = '<';
					} else if (local72.equals("gt")) {
						local51 = '>';
					} else if (local72.equals("nbsp")) {
						local51 = ' ';
					} else if (local72.equals("shy")) {
						local51 = '\u00ad';
					} else if (local72.equals("times")) {
						local51 = '×';
					} else if (local72.equals("euro")) {
						local51 = '€';
					} else if (local72.equals("copy")) {
						local51 = '©';
					} else {
						if (!local72.equals("reg")) {
							if (local72.startsWith("img=") && arg0 != null) {
								try {
									@Pc(124) int local124 = Static313.method4460(local72.substring(4));
									local39 += arg0[local124].j();
									local37 = -1;
									if (local33 < local39) {
										return local44 + "...";
									}
									local44 = arg2.substring(0, local46 + 1);
								} catch (@Pc(154) Exception local154) {
								}
							}
							continue;
						}
						local51 = '®';
					}
				}
				if (local35 == -1) {
					local39 += this.aByteArray63[Static372.method5075(local51) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local37 != -1) {
						local39 += this.aByteArrayArray11[local37][local51];
					}
					local37 = local51;
					@Pc(209) int local209 = local39;
					if (this.aByteArrayArray11 != null) {
						local209 = local39 + this.aByteArrayArray11[local51][46];
					}
					if (local33 < local209) {
						return local44 + "...";
					}
					local44 = arg2.substring(0, local46 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIC)I")
	public int method3469(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray11 == null ? 0 : this.aByteArrayArray11[arg0][arg1];
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;[Lclient!l;I)I")
	public int method3471(@OriginalArg(0) String arg0, @OriginalArg(1) Class143[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			@Pc(33) char local33 = arg0.charAt(local28);
			if (local33 == '<') {
				local9 = local28;
			} else {
				if (local33 == '>' && local9 != -1) {
					@Pc(53) String local53 = arg0.substring(local9 + 1, local28);
					local9 = -1;
					if (local53.equals("lt")) {
						local33 = '<';
					} else if (local53.equals("gt")) {
						local33 = '>';
					} else if (local53.equals("nbsp")) {
						local33 = ' ';
					} else if (local53.equals("shy")) {
						local33 = '\u00ad';
					} else if (local53.equals("times")) {
						local33 = '×';
					} else if (local53.equals("euro")) {
						local33 = '€';
					} else if (local53.equals("copy")) {
						local33 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg1 != null) {
								try {
									@Pc(114) int local114 = Static313.method4460(local53.substring(4));
									local11 = -1;
									local13 += arg1[local114].j();
								} catch (@Pc(125) Exception local125) {
								}
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray63[Static372.method5075(local33) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local11 != -1) {
						local13 += this.aByteArrayArray11[local11][local33];
					}
					local11 = local33;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I")
	public int method3472(@OriginalArg(0) int arg0) {
		return this.aByteArray63[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI[Lclient!l;Ljava/lang/String;)I")
	public int method3473(@OriginalArg(1) int arg0, @OriginalArg(2) Class143[] arg1, @OriginalArg(3) String arg2) {
		@Pc(21) int local21 = this.method3465(arg1, arg2, new int[] { arg0 }, Static283.aStringArray32);
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local21; local25++) {
			@Pc(34) int local34 = this.method3471(Static283.aStringArray32[local25], arg1);
			if (local23 < local34) {
				local23 = local34;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;II[Lclient!l;)I")
	public int method3474(@OriginalArg(1) String arg0, @OriginalArg(4) Class143[] arg1) {
		@Pc(8) int local8 = this.anInt4135;
		@Pc(21) int local21 = this.method3465(arg1, arg0, new int[] { 100 }, Static283.aStringArray32);
		@Pc(36) int local36 = local8 * (local21 - 1);
		return this.anInt4125 + this.anInt4134 + local36;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3475(@OriginalArg(1) String arg0) {
		return this.method3471(arg0, null);
	}
}
