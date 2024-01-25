import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class209 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "[B")
	private final byte[] aByteArray77;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public final int anInt6109;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public final int anInt6116;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public final int anInt6104;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "([B)V")
	public Class209(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class1_Sub3 local6 = new Class1_Sub3(arg0);
		@Pc(10) int local10 = local6.method1171();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local6.method1171() == 1;
		this.aByteArray77 = new byte[256];
		local6.method1173(this.aByteArray77, 256);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local47[local49] = local6.method1171();
			}
			@Pc(65) int[] local65 = new int[256];
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local65[local67] = local6.method1171();
			}
			@Pc(81) byte[][] local81 = new byte[256][];
			@Pc(95) int local95;
			for (@Pc(83) int local83 = 0; local83 < 256; local83++) {
				local81[local83] = new byte[local47[local83]];
				@Pc(93) byte local93 = 0;
				for (local95 = 0; local95 < local81[local83].length; local95++) {
					local93 += local6.method1212();
					local81[local83][local95] = local93;
				}
			}
			@Pc(127) byte[][] local127 = new byte[256][];
			@Pc(141) int local141;
			for (local95 = 0; local95 < 256; local95++) {
				local127[local95] = new byte[local47[local95]];
				@Pc(139) byte local139 = 0;
				for (local141 = 0; local141 < local127[local95].length; local141++) {
					local139 += local6.method1212();
					local127[local95][local141] = local139;
				}
			}
			this.aByteArrayArray19 = new byte[256][256];
			for (@Pc(173) int local173 = 0; local173 < 256; local173++) {
				if (local173 != 32 && local173 != 160) {
					for (local141 = 0; local141 < 256; local141++) {
						if (local141 != 32 && local141 != 160) {
							this.aByteArrayArray19[local173][local141] = (byte) Static119.method1933(local81, this.aByteArray77, local141, local173, local127, local65, local47);
						}
					}
				}
			}
			this.anInt6109 = local47[32] + local65[32];
		} else {
			this.anInt6109 = local6.method1171();
		}
		local6.method1171();
		local6.method1171();
		this.anInt6116 = local6.method1171();
		this.anInt6104 = local6.method1171();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!o;I)I")
	public int method4686(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137[] arg2) {
		@Pc(22) int local22 = this.method4692(arg2, arg0, new int[] { arg1 }, Static325.aStringArray39);
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local22; local26++) {
			@Pc(35) int local35 = this.method4687(Static325.aStringArray39[local26], arg2);
			if (local24 < local35) {
				local24 = local35;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjava/lang/String;[Lclient!o;)I")
	public int method4687(@OriginalArg(1) String arg0, @OriginalArg(2) Class137[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) char local31 = arg0.charAt(local26);
			if (local31 == '<') {
				local17 = local26;
			} else {
				if (local31 == '>' && local17 != -1) {
					@Pc(51) String local51 = arg0.substring(local17 + 1, local26);
					local17 = -1;
					if (local51.equals("lt")) {
						local31 = '<';
					} else if (local51.equals("gt")) {
						local31 = '>';
					} else if (local51.equals("nbsp")) {
						local31 = ' ';
					} else if (local51.equals("shy")) {
						local31 = '\u00ad';
					} else if (local51.equals("times")) {
						local31 = '×';
					} else if (local51.equals("euro")) {
						local31 = '€';
					} else if (local51.equals("copy")) {
						local31 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=") && arg1 != null) {
								try {
									@Pc(115) int local115 = Static293.method3599(local51.substring(4));
									local21 += arg1[local115].RA();
									local19 = -1;
								} catch (@Pc(126) Exception local126) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local17 == -1) {
					local21 += this.aByteArray77[Static244.method3646(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local19 != -1) {
						local21 += this.aByteArrayArray19[local19][local31];
					}
					local19 = local31;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([Lclient!o;IILjava/lang/String;)I")
	public int method4688(@OriginalArg(0) Class137[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method4692(arg0, arg2, new int[] { arg1 }, Static325.aStringArray39);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ICI)I")
	public int method4691(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray19 == null ? 0 : this.aByteArrayArray19[arg1][arg0];
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([Lclient!o;ZLjava/lang/String;[I[Ljava/lang/String;)I")
	public int method4692(@OriginalArg(0) Class137[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(20) int local20 = 0;
		@Pc(22) byte local22 = 0;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(42) int local42 = Static244.method3646(arg1.charAt(local33)) & 0xFF;
			@Pc(44) int local44 = 0;
			if (local42 == 60) {
				local24 = local33;
			} else {
				@Pc(56) int local56;
				if (local24 == -1) {
					local56 = local33;
					local44 = this.method4697(local42);
					if (this.aByteArrayArray19 != null && local26 != -1) {
						local44 += this.aByteArrayArray19[local26][local42];
					}
					local26 = local42;
				} else {
					if (local42 != 62) {
						continue;
					}
					local56 = local24;
					@Pc(95) String local95 = arg1.substring(local24 + 1, local33);
					local24 = -1;
					if (local95.equals("br")) {
						arg3[local28] = arg1.substring(local11, local33 + 1);
						local28++;
						if (local28 >= arg3.length) {
							return 0;
						}
						local26 = -1;
						local11 = local33 + 1;
						local13 = -1;
						local9 = 0;
						continue;
					}
					if (local95.equals("lt")) {
						local44 = this.method4697(60);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][60];
						}
						local26 = 60;
					} else if (local95.equals("gt")) {
						local44 = this.method4697(62);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][62];
						}
						local26 = 62;
					} else if (local95.equals("nbsp")) {
						local44 = this.method4697(160);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][160];
						}
						local26 = 160;
					} else if (local95.equals("shy")) {
						local44 = this.method4697(173);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][173];
						}
						local26 = 173;
					} else if (local95.equals("times")) {
						local44 = this.method4697(215);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][215];
						}
						local26 = 215;
					} else if (local95.equals("euro")) {
						local44 = this.method4697(8364);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][8364];
						}
						local26 = 8364;
					} else if (local95.equals("copy")) {
						local44 = this.method4697(169);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][169];
						}
						local26 = 169;
					} else if (local95.equals("reg")) {
						local44 = this.method4697(174);
						if (this.aByteArrayArray19 != null && local26 != -1) {
							local44 += this.aByteArrayArray19[local26][174];
						}
						local26 = 174;
					} else if (local95.startsWith("img=") && arg0 != null) {
						try {
							@Pc(299) int local299 = Static293.method3599(local95.substring(4));
							local26 = -1;
							local44 = arg0[local299].RA();
						} catch (@Pc(310) Exception local310) {
						}
					}
					local42 = -1;
				}
				if (local44 > 0) {
					local9 += local44;
					if (arg2 != null) {
						if (local42 == 32) {
							local13 = local33;
							local20 = local9;
							local22 = 1;
						}
						if (arg2[local28 < arg2.length ? local28 : arg2.length - 1] < local9) {
							if (local13 >= 0) {
								arg3[local28] = arg1.substring(local11, local13 + 1 - local22);
								local28++;
								if (local28 >= arg3.length) {
									return 0;
								}
								local11 = local13 + 1;
								local13 = -1;
								local26 = -1;
								local9 -= local20;
							} else {
								arg3[local28] = arg1.substring(local11, local56);
								local28++;
								if (arg3.length <= local28) {
									return 0;
								}
								local13 = -1;
								local26 = -1;
								local9 = local44;
								local11 = local56;
							}
						}
						if (local42 == 45) {
							local20 = local9;
							local22 = 0;
							local13 = local33;
						}
					}
				}
			}
		}
		if (local11 < arg1.length()) {
			arg3[local28] = arg1.substring(local11, arg1.length());
			local28++;
		}
		return local28;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([Lclient!o;IBILjava/lang/String;)I")
	public int method4693(@OriginalArg(0) Class137[] arg0, @OriginalArg(4) String arg1) {
		@Pc(8) int local8 = this.anInt6109;
		@Pc(26) int local26 = this.method4692(arg0, arg1, new int[] { 100 }, Static325.aStringArray39);
		@Pc(32) int local32 = (local26 - 1) * local8;
		return local32 + this.anInt6116 + this.anInt6104;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4694(@OriginalArg(1) String arg0) {
		return this.method4687(arg0, null);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "([Lclient!o;IILjava/lang/String;)Ljava/lang/String;")
	public String method4695(@OriginalArg(0) Class137[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (this.method4687(arg2, arg0) <= arg1) {
			return arg2;
		}
		@Pc(22) int local22 = arg1 - this.method4687("...", null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg2.length();
		@Pc(33) String local33 = "";
		for (@Pc(35) int local35 = 0; local35 < local31; local35++) {
			@Pc(40) char local40 = arg2.charAt(local35);
			if (local40 == '<') {
				local24 = local35;
			} else {
				if (local40 == '>' && local24 != -1) {
					@Pc(61) String local61 = arg2.substring(local24 + 1, local35);
					local24 = -1;
					if (local61.equals("lt")) {
						local40 = '<';
					} else if (local61.equals("gt")) {
						local40 = '>';
					} else if (local61.equals("nbsp")) {
						local40 = ' ';
					} else if (local61.equals("shy")) {
						local40 = '\u00ad';
					} else if (local61.equals("times")) {
						local40 = '×';
					} else if (local61.equals("euro")) {
						local40 = '€';
					} else if (local61.equals("copy")) {
						local40 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=") && arg0 != null) {
								try {
									@Pc(119) int local119 = Static293.method3599(local61.substring(4));
									local28 += arg0[local119].RA();
									local26 = -1;
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg2.substring(0, local35 + 1);
								} catch (@Pc(149) Exception local149) {
								}
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray77[Static244.method3646(local40) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local26 != -1) {
						local28 += this.aByteArrayArray19[local26][local40];
					}
					local26 = local40;
					@Pc(200) int local200 = local28;
					if (this.aByteArrayArray19 != null) {
						local200 = local28 + this.aByteArrayArray19[local40][46];
					}
					if (local22 < local200) {
						return local33 + "...";
					}
					local33 = arg2.substring(0, local35 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I")
	public int method4697(@OriginalArg(1) int arg0) {
		return this.aByteArray77[arg0] & 0xFF;
	}
}
