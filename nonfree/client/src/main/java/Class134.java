import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class134 {

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	public final int anInt3766;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public final int anInt3765;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public final int anInt3760;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "([B)V")
	public Class134(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		@Pc(12) int local12 = local8.method5175();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method5175() == 1;
		this.aByteArray40 = new byte[256];
		local8.method5183(256, this.aByteArray40);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local47[local49] = local8.method5175();
			}
			@Pc(66) int[] local66 = new int[256];
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local66[local68] = local8.method5175();
			}
			@Pc(83) byte[][] local83 = new byte[256][];
			@Pc(98) int local98;
			for (@Pc(85) int local85 = 0; local85 < 256; local85++) {
				local83[local85] = new byte[local47[local85]];
				@Pc(96) byte local96 = 0;
				for (local98 = 0; local98 < local83[local85].length; local98++) {
					local96 += local8.method5212();
					local83[local85][local98] = local96;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local98 = 0; local98 < 256; local98++) {
				local133[local98] = new byte[local47[local98]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local98].length; local148++) {
					local146 += local8.method5212();
					local133[local98][local148] = local146;
				}
			}
			this.aByteArrayArray9 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray9[local181][local148] = (byte) Static569.method3160(local148, local83, this.aByteArray40, local66, local133, local181, local47);
						}
					}
				}
			}
			this.anInt3766 = local66[32] + local47[32];
		} else {
			this.anInt3766 = local8.method5175();
		}
		local8.method5175();
		local8.method5175();
		this.anInt3765 = local8.method5175();
		this.anInt3760 = local8.method5175();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB[Lclient!f;Ljava/lang/String;)Ljava/lang/String;")
	public String method3345(@OriginalArg(0) int arg0, @OriginalArg(2) Class14[] arg1, @OriginalArg(3) String arg2) {
		if (arg0 >= this.method3347(arg2, arg1)) {
			return arg2;
		}
		@Pc(34) int local34 = arg0 - this.method3347("...", null);
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = arg2.length();
		@Pc(45) String local45 = "";
		for (@Pc(47) int local47 = 0; local47 < local43; local47++) {
			@Pc(53) char local53 = arg2.charAt(local47);
			if (local53 == '<') {
				local36 = local47;
			} else {
				if (local53 == '>' && local36 != -1) {
					@Pc(76) String local76 = arg2.substring(local36 + 1, local47);
					local36 = -1;
					if (local76.equals("lt")) {
						local53 = '<';
					} else if (local76.equals("gt")) {
						local53 = '>';
					} else if (local76.equals("nbsp")) {
						local53 = ' ';
					} else if (local76.equals("shy")) {
						local53 = '\u00ad';
					} else if (local76.equals("times")) {
						local53 = '×';
					} else if (local76.equals("euro")) {
						local53 = '€';
					} else if (local76.equals("copy")) {
						local53 = '©';
					} else {
						if (!local76.equals("reg")) {
							if (local76.startsWith("img=") && arg1 != null) {
								try {
									@Pc(140) int local140 = Static213.method6524(local76.substring(4));
									local40 += arg1[local140].A();
									local38 = -1;
									if (local40 > local34) {
										return local45 + "...";
									}
									local45 = arg2.substring(0, local47 + 1);
								} catch (@Pc(174) Exception local174) {
								}
							}
							continue;
						}
						local53 = '®';
					}
				}
				if (local36 == -1) {
					local40 += this.aByteArray40[Static253.method3901(local53) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local38 != -1) {
						local40 += this.aByteArrayArray9[local38][local53];
					}
					local38 = local53;
					@Pc(227) int local227 = local40;
					if (this.aByteArrayArray9 != null) {
						local227 = local40 + this.aByteArrayArray9[local53][46];
					}
					if (local227 > local34) {
						return local45 + "...";
					}
					local45 = arg2.substring(0, local47 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!f;)I")
	public int method3347(@OriginalArg(0) String arg0, @OriginalArg(2) Class14[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg0.charAt(local28);
			if (local34 == '<') {
				local19 = local28;
			} else {
				if (local34 == '>' && local19 != -1) {
					@Pc(56) String local56 = arg0.substring(local19 + 1, local28);
					local19 = -1;
					if (local56.equals("lt")) {
						local34 = '<';
					} else if (local56.equals("gt")) {
						local34 = '>';
					} else if (local56.equals("nbsp")) {
						local34 = ' ';
					} else if (local56.equals("shy")) {
						local34 = '\u00ad';
					} else if (local56.equals("times")) {
						local34 = '×';
					} else if (local56.equals("euro")) {
						local34 = '€';
					} else if (local56.equals("copy")) {
						local34 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg1 != null) {
								try {
									@Pc(118) int local118 = Static213.method6524(local56.substring(4));
									local23 += arg1[local118].A();
									local21 = -1;
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local19 == -1) {
					local23 += this.aByteArray40[Static253.method3901(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local21 != -1) {
						local23 += this.aByteArrayArray9[local21][local34];
					}
					local21 = local34;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method3348(@OriginalArg(1) String arg0) {
		return this.method3347(arg0, null);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([Lclient!f;[ILjava/lang/String;B[Ljava/lang/String;)I")
	public int method3350(@OriginalArg(0) Class14[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static253.method3901(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(64) int local64;
				if (local26 == -1) {
					local64 = local35;
					local47 = this.method3353(local45);
					if (this.aByteArrayArray9 != null && local28 != -1) {
						local47 += this.aByteArrayArray9[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local64 = local26;
					@Pc(71) String local71 = arg2.substring(local26 + 1, local35);
					local26 = -1;
					if (local71.equals("br")) {
						arg3[local30] = arg2.substring(local18, local35 + 1);
						local30++;
						if (local30 >= arg3.length) {
							return 0;
						}
						local28 = -1;
						local16 = 0;
						local20 = -1;
						local18 = local35 + 1;
						continue;
					}
					if (local71.equals("lt")) {
						local47 = this.method3353(60);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][60];
						}
						local28 = 60;
					} else if (local71.equals("gt")) {
						local47 = this.method3353(62);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][62];
						}
						local28 = 62;
					} else if (local71.equals("nbsp")) {
						local47 = this.method3353(160);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][160];
						}
						local28 = 160;
					} else if (local71.equals("shy")) {
						local47 = this.method3353(173);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][173];
						}
						local28 = 173;
					} else if (local71.equals("times")) {
						local47 = this.method3353(215);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][215];
						}
						local28 = 215;
					} else if (local71.equals("euro")) {
						local47 = this.method3353(8364);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][8364];
						}
						local28 = 8364;
					} else if (local71.equals("copy")) {
						local47 = this.method3353(169);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][169];
						}
						local28 = 169;
					} else if (local71.equals("reg")) {
						local47 = this.method3353(174);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][174];
						}
						local28 = 174;
					} else if (local71.startsWith("img=") && arg0 != null) {
						try {
							@Pc(199) int local199 = Static213.method6524(local71.substring(4));
							local47 = arg0[local199].A();
							local28 = -1;
						} catch (@Pc(210) Exception local210) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg1 != null) {
						if (local45 == 32) {
							local20 = local35;
							local24 = 1;
							local22 = local16;
						}
						if (arg1[local30 >= arg1.length ? arg1.length - 1 : local30] < local16) {
							if (local20 >= 0) {
								arg3[local30] = arg2.substring(local18, local20 + 1 - local24);
								local30++;
								if (local30 >= arg3.length) {
									return 0;
								}
								local18 = local20 + 1;
								local20 = -1;
								local16 -= local22;
								local28 = -1;
							} else {
								arg3[local30] = arg2.substring(local18, local64);
								local30++;
								if (local30 >= arg3.length) {
									return 0;
								}
								local20 = -1;
								local18 = local64;
								local28 = -1;
								local16 = local47;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local22 = local16;
							local20 = local35;
						}
					}
				}
			}
		}
		if (local18 < arg2.length()) {
			arg3[local30] = arg2.substring(local18, arg2.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZILjava/lang/String;[Lclient!f;)I")
	public int method3351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class14[] arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt3766;
		}
		@Pc(34) int local34 = this.method3350(arg3, new int[] { arg0 }, arg2, Static505.aStringArray34);
		@Pc(40) int local40 = arg1 * (local34 - 1);
		return this.anInt3760 + local40 + this.anInt3765;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([Lclient!f;IILjava/lang/String;)I")
	public int method3352(@OriginalArg(0) Class14[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method3350(arg0, new int[] { arg1 }, arg2, Static505.aStringArray34);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)I")
	public int method3353(@OriginalArg(1) int arg0) {
		return this.aByteArray40[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZIC)I")
	public int method3354(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray9 == null ? 0 : this.aByteArrayArray9[arg0][arg1];
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;IB)I")
	public int method3355(@OriginalArg(0) String arg0, @OriginalArg(1) Class14[] arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = this.method3350(arg1, new int[] { arg2 }, arg0, Static505.aStringArray34);
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local18; local32++) {
			@Pc(42) int local42 = this.method3347(Static505.aStringArray34[local32], arg1);
			if (local30 < local42) {
				local30 = local42;
			}
		}
		return local30;
	}
}
