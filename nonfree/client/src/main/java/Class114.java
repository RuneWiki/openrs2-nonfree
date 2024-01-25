import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class114 {

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "[B")
	private final byte[] aByteArray34;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public final int anInt3643;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	public final int anInt3638;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public final int anInt3631;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "([B)V")
	public Class114(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class2_Sub34 local6 = new Class2_Sub34(arg0);
		@Pc(10) int local10 = local6.method6904();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(29) boolean local29 = local6.method6904() == 1;
		this.aByteArray34 = new byte[256];
		local6.method6891(this.aByteArray34, 256, 0);
		if (local29) {
			@Pc(45) int[] local45 = new int[256];
			for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
				local45[local47] = local6.method6904();
			}
			@Pc(63) int[] local63 = new int[256];
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local63[local65] = local6.method6904();
			}
			@Pc(81) byte[][] local81 = new byte[256][];
			@Pc(95) int local95;
			for (@Pc(83) int local83 = 0; local83 < 256; local83++) {
				local81[local83] = new byte[local45[local83]];
				@Pc(93) byte local93 = 0;
				for (local95 = 0; local95 < local81[local83].length; local95++) {
					local93 += local6.method6908();
					local81[local83][local95] = local93;
				}
			}
			@Pc(125) byte[][] local125 = new byte[256][];
			@Pc(139) int local139;
			for (local95 = 0; local95 < 256; local95++) {
				local125[local95] = new byte[local45[local95]];
				@Pc(137) byte local137 = 0;
				for (local139 = 0; local139 < local125[local95].length; local139++) {
					local137 += local6.method6908();
					local125[local95][local139] = local137;
				}
			}
			this.aByteArrayArray9 = new byte[256][256];
			for (@Pc(173) int local173 = 0; local173 < 256; local173++) {
				if (local173 != 32 && local173 != 160) {
					for (local139 = 0; local139 < 256; local139++) {
						if (local139 != 32 && local139 != 160) {
							this.aByteArrayArray9[local173][local139] = (byte) Static465.method6728(local125, this.aByteArray34, local63, local45, local81, local139, local173);
						}
					}
				}
			}
			this.anInt3643 = local63[32] + local45[32];
		} else {
			this.anInt3643 = local6.method6904();
		}
		local6.method6904();
		local6.method6904();
		this.anInt3638 = local6.method6904();
		this.anInt3631 = local6.method6904();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lclient!kr;Ljava/lang/String;)I")
	public int method3008(@OriginalArg(1) Class20[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg1.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(23) char local23 = arg1.charAt(local18);
			if (local23 == '<') {
				local9 = local18;
			} else {
				if (local23 == '>' && local9 != -1) {
					@Pc(44) String local44 = arg1.substring(local9 + 1, local18);
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
							if (local44.startsWith("img=") && arg0 != null) {
								try {
									@Pc(96) int local96 = Static56.method1026(local44.substring(4));
									local13 += arg0[local96].method4588();
									local11 = -1;
								} catch (@Pc(107) Exception local107) {
								}
							}
							continue;
						}
						local23 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray34[Static124.method2512(local23) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local11 != -1) {
						local13 += this.aByteArrayArray9[local11][local23];
					}
					local11 = local23;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ICI)I")
	public int method3009(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray9 == null ? 0 : this.aByteArrayArray9[arg0][arg1];
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lclient!kr;[I[Ljava/lang/String;Ljava/lang/String;)I")
	public int method3010(@OriginalArg(1) Class20[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
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
		@Pc(31) int local31 = arg3.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(42) int local42 = Static124.method2512(arg3.charAt(local33)) & 0xFF;
			@Pc(44) int local44 = 0;
			if (local42 == 60) {
				local24 = local33;
			} else {
				@Pc(58) int local58;
				if (local24 == -1) {
					local58 = local33;
					local44 = this.method3011(local42);
					if (this.aByteArrayArray9 != null && local26 != -1) {
						local44 += this.aByteArrayArray9[local26][local42];
					}
					local26 = local42;
				} else {
					if (local42 != 62) {
						continue;
					}
					local58 = local24;
					@Pc(65) String local65 = arg3.substring(local24 + 1, local33);
					local24 = -1;
					if (local65.equals("br")) {
						arg2[local28] = arg3.substring(local11, local33 + 1);
						local28++;
						if (arg2.length <= local28) {
							return 0;
						}
						local11 = local33 + 1;
						local9 = 0;
						local13 = -1;
						local26 = -1;
						continue;
					}
					if (local65.equals("lt")) {
						local44 = this.method3011(60);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][60];
						}
						local26 = 60;
					} else if (local65.equals("gt")) {
						local44 = this.method3011(62);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][62];
						}
						local26 = 62;
					} else if (local65.equals("nbsp")) {
						local44 = this.method3011(160);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][160];
						}
						local26 = 160;
					} else if (local65.equals("shy")) {
						local44 = this.method3011(173);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][173];
						}
						local26 = 173;
					} else if (local65.equals("times")) {
						local44 = this.method3011(215);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][215];
						}
						local26 = 215;
					} else if (local65.equals("euro")) {
						local44 = this.method3011(8364);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][8364];
						}
						local26 = 8364;
					} else if (local65.equals("copy")) {
						local44 = this.method3011(169);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][169];
						}
						local26 = 169;
					} else if (local65.equals("reg")) {
						local44 = this.method3011(174);
						if (this.aByteArrayArray9 != null && local26 != -1) {
							local44 += this.aByteArrayArray9[local26][174];
						}
						local26 = 174;
					} else if (local65.startsWith("img=") && arg0 != null) {
						try {
							@Pc(191) int local191 = Static56.method1026(local65.substring(4));
							local26 = -1;
							local44 = arg0[local191].method4588();
						} catch (@Pc(202) Exception local202) {
						}
					}
					local42 = -1;
				}
				if (local44 > 0) {
					local9 += local44;
					if (arg1 != null) {
						if (local42 == 32) {
							local22 = 1;
							local13 = local33;
							local20 = local9;
						}
						if (local9 > arg1[arg1.length <= local28 ? arg1.length - 1 : local28]) {
							if (local13 < 0) {
								arg2[local28] = arg3.substring(local11, local58);
								local28++;
								if (local28 >= arg2.length) {
									return 0;
								}
								local11 = local58;
								local13 = -1;
								local9 = local44;
								local26 = -1;
							} else {
								arg2[local28] = arg3.substring(local11, local13 + 1 - local22);
								local28++;
								if (local28 >= arg2.length) {
									return 0;
								}
								local11 = local13 + 1;
								local9 -= local20;
								local26 = -1;
								local13 = -1;
							}
						}
						if (local42 == 45) {
							local22 = 0;
							local13 = local33;
							local20 = local9;
						}
					}
				}
			}
		}
		if (arg3.length() > local11) {
			arg2[local28] = arg3.substring(local11, arg3.length());
			local28++;
		}
		return local28;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I")
	public int method3011(@OriginalArg(1) int arg0) {
		return this.aByteArray34[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lclient!kr;Ljava/lang/String;B)I")
	public int method3012(@OriginalArg(0) int arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(2) String arg2) {
		@Pc(18) int local18 = this.method3010(arg1, new int[] { arg0 }, Static453.aStringArray33, arg2);
		@Pc(20) int local20 = 0;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(37) int local37 = this.method3008(arg1, Static453.aStringArray33[local28]);
			if (local37 > local20) {
				local20 = local37;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method3015(@OriginalArg(1) String arg0) {
		return this.method3008(null, arg0);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;[Lclient!kr;I)I")
	public int method3016(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class20[] arg2) {
		return this.method3010(arg2, new int[] { arg0 }, Static453.aStringArray33, arg1);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lclient!kr;IILjava/lang/String;)I")
	public int method3017(@OriginalArg(1) Class20[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt3643;
		}
		@Pc(21) int local21 = this.method3010(arg0, new int[] { arg2 }, Static453.aStringArray33, arg3);
		@Pc(27) int local27 = arg1 * (local21 - 1);
		return this.anInt3631 + this.anInt3638 + local27;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lclient!kr;ILjava/lang/String;)Ljava/lang/String;")
	public String method3018(@OriginalArg(0) int arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(3) String arg2) {
		if (this.method3008(arg1, arg2) <= arg0) {
			return arg2;
		}
		@Pc(26) int local26 = arg0 - this.method3008(null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg2.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(44) char local44 = arg2.charAt(local39);
			if (local44 == '<') {
				local28 = local39;
			} else {
				if (local44 == '>' && local28 != -1) {
					@Pc(66) String local66 = arg2.substring(local28 + 1, local39);
					local28 = -1;
					if (local66.equals("lt")) {
						local44 = '<';
					} else if (local66.equals("gt")) {
						local44 = '>';
					} else if (local66.equals("nbsp")) {
						local44 = ' ';
					} else if (local66.equals("shy")) {
						local44 = '\u00ad';
					} else if (local66.equals("times")) {
						local44 = '×';
					} else if (local66.equals("euro")) {
						local44 = '€';
					} else if (local66.equals("copy")) {
						local44 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=") && arg1 != null) {
								try {
									@Pc(118) int local118 = Static56.method1026(local66.substring(4));
									local30 = -1;
									local32 += arg1[local118].method4588();
									if (local26 < local32) {
										return local37 + "...";
									}
									local37 = arg2.substring(0, local39 + 1);
								} catch (@Pc(148) Exception local148) {
								}
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray34[Static124.method2512(local44) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local30 != -1) {
						local32 += this.aByteArrayArray9[local30][local44];
					}
					local30 = local44;
					@Pc(204) int local204 = local32;
					if (this.aByteArrayArray9 != null) {
						local204 = local32 + this.aByteArrayArray9[local44][46];
					}
					if (local26 < local204) {
						return local37 + "...";
					}
					local37 = arg2.substring(0, local39 + 1);
				}
			}
		}
		return arg2;
	}
}
