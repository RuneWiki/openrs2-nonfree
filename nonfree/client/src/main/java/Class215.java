import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class215 {

	@OriginalMember(owner = "client!se", name = "g", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	public final int anInt6383;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public final int anInt6387;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public final int anInt6376;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
	public Class215(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub30 local8 = new Class4_Sub30(arg0);
		@Pc(12) int local12 = local8.method4864();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method4864() == 1;
		this.aByteArray83 = new byte[256];
		local8.method4863(256, this.aByteArray83);
		if (local28) {
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local51[local53] = local8.method4864();
			}
			@Pc(68) int[] local68 = new int[256];
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local68[local70] = local8.method4864();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local51[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method4865();
					local85[local87][local100] = local98;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local100 = 0; local100 < 256; local100++) {
				local133[local100] = new byte[local51[local100]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local100].length; local148++) {
					local146 += local8.method4865();
					local133[local100][local148] = local146;
				}
			}
			this.aByteArrayArray17 = new byte[256][256];
			for (@Pc(185) int local185 = 0; local185 < 256; local185++) {
				if (local185 != 32 && local185 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray17[local185][local148] = (byte) Static109.method5363(local85, local68, this.aByteArray83, local51, local148, local185, local133);
						}
					}
				}
			}
			this.anInt6383 = local51[32] + local68[32];
		} else {
			this.anInt6383 = local8.method4864();
		}
		local8.method4864();
		local8.method4864();
		this.anInt6387 = local8.method4864();
		this.anInt6376 = local8.method4864();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[I[Ljava/lang/String;Ljava/lang/String;[Lclient!f;)I")
	public int method4966(@OriginalArg(1) int[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class3[] arg3) {
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
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static257.method3522(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(64) int local64;
				if (local21 == -1) {
					local47 = this.method4971(local45);
					local64 = local35;
					if (this.aByteArrayArray17 != null && local23 != -1) {
						local47 += this.aByteArrayArray17[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local64 = local21;
					@Pc(71) String local71 = arg2.substring(local21 + 1, local35);
					local21 = -1;
					if (local71.equals("br")) {
						arg1[local25] = arg2.substring(local13, local35 + 1);
						local25++;
						if (arg1.length <= local25) {
							return 0;
						}
						local15 = -1;
						local11 = 0;
						local13 = local35 + 1;
						local23 = -1;
						continue;
					}
					if (local71.equals("lt")) {
						local47 = this.method4971(60);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][60];
						}
						local23 = 60;
					} else if (local71.equals("gt")) {
						local47 = this.method4971(62);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][62];
						}
						local23 = 62;
					} else if (local71.equals("nbsp")) {
						local47 = this.method4971(160);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][160];
						}
						local23 = 160;
					} else if (local71.equals("shy")) {
						local47 = this.method4971(173);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][173];
						}
						local23 = 173;
					} else if (local71.equals("times")) {
						local47 = this.method4971(215);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][215];
						}
						local23 = 215;
					} else if (local71.equals("euro")) {
						local47 = this.method4971(8364);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][8364];
						}
						local23 = 8364;
					} else if (local71.equals("copy")) {
						local47 = this.method4971(169);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][169];
						}
						local23 = 169;
					} else if (local71.equals("reg")) {
						local47 = this.method4971(174);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local47 += this.aByteArrayArray17[local23][174];
						}
						local23 = 174;
					} else if (local71.startsWith("img=") && arg3 != null) {
						try {
							@Pc(174) int local174 = Static297.method4115(local71.substring(4));
							local23 = -1;
							local47 = arg3[local174].ja();
						} catch (@Pc(185) Exception local185) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local15 = local35;
							local17 = local11;
							local19 = 1;
						}
						if (arg0[arg0.length > local25 ? local25 : arg0.length - 1] < local11) {
							if (local15 >= 0) {
								arg1[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local15 = -1;
								local11 -= local17;
							} else {
								arg1[local25] = arg2.substring(local13, local64);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local11 = local47;
								local15 = -1;
								local23 = -1;
								local13 = local64;
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
			arg1[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([Lclient!f;ILjava/lang/String;II)I")
	public int method4967(@OriginalArg(0) Class3[] arg0, @OriginalArg(2) String arg1) {
		@Pc(11) int local11 = this.anInt6383;
		@Pc(24) int local24 = this.method4966(new int[] { 100 }, Static173.aStringArray23, arg1, arg0);
		@Pc(35) int local35 = local11 * (local24 - 1);
		return this.anInt6387 + local35 + this.anInt6376;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B[Lclient!f;ILjava/lang/String;)I")
	public int method4968(@OriginalArg(1) Class3[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method4966(new int[] { arg1 }, Static173.aStringArray23, arg2, arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;I)I")
	public int method4969(@OriginalArg(0) int arg0, @OriginalArg(1) Class3[] arg1, @OriginalArg(2) String arg2) {
		@Pc(18) int local18 = this.method4966(new int[] { arg0 }, Static173.aStringArray23, arg2, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method4973(Static173.aStringArray23[local22], arg1);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(CII)I")
	public int method4970(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray17 == null ? 0 : this.aByteArrayArray17[arg1][arg0];
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)I")
	public int method4971(@OriginalArg(0) int arg0) {
		return this.aByteArray83[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[Lclient!f;ILjava/lang/String;)Ljava/lang/String;")
	public String method4972(@OriginalArg(1) Class3[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.method4973(arg2, arg0) <= arg1) {
			return arg2;
		}
		@Pc(26) int local26 = arg1 - this.method4973("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(43) int local43 = arg2.length();
		@Pc(45) String local45 = "";
		for (@Pc(47) int local47 = 0; local47 < local43; local47++) {
			@Pc(53) char local53 = arg2.charAt(local47);
			if (local53 == '<') {
				local28 = local47;
			} else {
				if (local53 == '>' && local28 != -1) {
					@Pc(73) String local73 = arg2.substring(local28 + 1, local47);
					local28 = -1;
					if (local73.equals("lt")) {
						local53 = '<';
					} else if (local73.equals("gt")) {
						local53 = '>';
					} else if (local73.equals("nbsp")) {
						local53 = ' ';
					} else if (local73.equals("shy")) {
						local53 = '\u00ad';
					} else if (local73.equals("times")) {
						local53 = '×';
					} else if (local73.equals("euro")) {
						local53 = '€';
					} else if (local73.equals("copy")) {
						local53 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=") && arg0 != null) {
								try {
									@Pc(119) int local119 = Static297.method4115(local73.substring(4));
									local32 += arg0[local119].ja();
									local30 = -1;
									if (local26 < local32) {
										return local45 + "...";
									}
									local45 = arg2.substring(0, local47 + 1);
								} catch (@Pc(149) Exception local149) {
								}
							}
							continue;
						}
						local53 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray83[Static257.method3522(local53) & 0xFF] & 0xFF;
					if (this.aByteArrayArray17 != null && local30 != -1) {
						local32 += this.aByteArrayArray17[local30][local53];
					}
					local30 = local53;
					@Pc(217) int local217 = local32;
					if (this.aByteArrayArray17 != null) {
						local217 = local32 + this.aByteArrayArray17[local53][46];
					}
					if (local217 > local26) {
						return local45 + "...";
					}
					local45 = arg2.substring(0, local47 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/lang/String;[Lclient!f;)I")
	public int method4973(@OriginalArg(1) String arg0, @OriginalArg(2) Class3[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg0.substring(local11 + 1, local25);
					local11 = -1;
					if (local55.equals("lt")) {
						local31 = '<';
					} else if (local55.equals("gt")) {
						local31 = '>';
					} else if (local55.equals("nbsp")) {
						local31 = ' ';
					} else if (local55.equals("shy")) {
						local31 = '\u00ad';
					} else if (local55.equals("times")) {
						local31 = '×';
					} else if (local55.equals("euro")) {
						local31 = '€';
					} else if (local55.equals("copy")) {
						local31 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg1 != null) {
								try {
									@Pc(115) int local115 = Static297.method4115(local55.substring(4));
									local18 = -1;
									local20 += arg1[local115].ja();
								} catch (@Pc(126) Exception local126) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local20 += this.aByteArray83[Static257.method3522(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray17 != null && local18 != -1) {
						local20 += this.aByteArrayArray17[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method4976(@OriginalArg(0) String arg0) {
		return this.method4973(arg0, null);
	}
}
