import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class247 {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[B")
	private final byte[] aByteArray66;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public final int anInt6972;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public final int anInt6974;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public final int anInt6966;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public Class247(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class5_Sub41 local6 = new Class5_Sub41(arg0);
		@Pc(10) int local10 = local6.method7816();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local6.method7816() == 1;
		this.aByteArray66 = new byte[256];
		local6.method7802(256, 0, this.aByteArray66);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local6.method7816();
			}
			for (@Pc(64) int local64 = 0; local64 < 256; local64++) {
				local47[local64] = local6.method7816();
			}
			@Pc(78) byte[][] local78 = new byte[256][];
			@Pc(92) int local92;
			for (@Pc(80) int local80 = 0; local80 < 256; local80++) {
				local78[local80] = new byte[local44[local80]];
				@Pc(90) byte local90 = 0;
				for (local92 = 0; local92 < local78[local80].length; local92++) {
					local90 += local6.method7861();
					local78[local80][local92] = local90;
				}
			}
			@Pc(126) byte[][] local126 = new byte[256][];
			@Pc(140) int local140;
			for (local92 = 0; local92 < 256; local92++) {
				local126[local92] = new byte[local44[local92]];
				@Pc(138) byte local138 = 0;
				for (local140 = 0; local140 < local126[local92].length; local140++) {
					local138 += local6.method7861();
					local126[local92][local140] = local138;
				}
			}
			this.aByteArrayArray22 = new byte[256][256];
			for (@Pc(176) int local176 = 0; local176 < 256; local176++) {
				if (local176 != 32 && local176 != 160) {
					for (local140 = 0; local140 < 256; local140++) {
						if (local140 != 32 && local140 != 160) {
							this.aByteArrayArray22[local176][local140] = (byte) Static6.method67(this.aByteArray66, local47, local126, local78, local140, local176, local44);
						}
					}
				}
			}
			this.anInt6972 = local47[32] + local44[32];
		} else {
			this.anInt6972 = local6.method7816();
		}
		local6.method7816();
		local6.method7816();
		this.anInt6974 = local6.method7816();
		this.anInt6966 = local6.method7816();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5759(@OriginalArg(1) String arg0) {
		return this.method5764(arg0, (Class50[]) null);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(CIB)I")
	public int method5761(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg1][arg0];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	public int method5762(@OriginalArg(1) int arg0) {
		return this.aByteArray66[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;[Lclient!pu;III)I")
	public int method5763(@OriginalArg(0) String arg0, @OriginalArg(1) Class50[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt6972;
		}
		@Pc(34) int local34 = this.method5768(arg0, new int[] { arg2 }, Static556.aStringArray52, arg1);
		@Pc(40) int local40 = arg3 * (local34 - 1);
		return this.anInt6966 + this.anInt6974 + local40;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Z[Lclient!pu;)I")
	public int method5764(@OriginalArg(0) String arg0, @OriginalArg(2) Class50[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.length();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(28) char local28 = arg0.charAt(local23);
			if (local28 == '<') {
				local9 = local23;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(50) String local50 = arg0.substring(local9 + 1, local23);
					local9 = -1;
					if (local50.equals("lt")) {
						local28 = '<';
					} else if (local50.equals("gt")) {
						local28 = '>';
					} else if (local50.equals("nbsp")) {
						local28 = ' ';
					} else if (local50.equals("shy")) {
						local28 = '\u00ad';
					} else if (local50.equals("times")) {
						local28 = '×';
					} else if (local50.equals("euro")) {
						local28 = '€';
					} else if (local50.equals("copy")) {
						local28 = '©';
					} else {
						if (!local50.equals("reg")) {
							if (local50.startsWith("img=") && arg1 != null) {
								try {
									@Pc(109) int local109 = Static270.method4173(local50.substring(4));
									local18 += arg1[local109].method6003();
									local11 = -1;
								} catch (@Pc(120) Exception local120) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					local18 += this.aByteArray66[Static651.method8726(local28) & 0xFF] & 0xFF;
					if (this.aByteArrayArray22 != null && local11 != -1) {
						local18 += this.aByteArrayArray22[local11][local28];
					}
					local11 = local28;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!pu;)I")
	public int method5766(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class50[] arg2) {
		return this.method5768(arg1, new int[] { arg0 }, Static556.aStringArray52, arg2);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;B[Lclient!pu;)I")
	public int method5768(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) Class50[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(46) int local46 = Static651.method8726(arg0.charAt(local28)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local19 = local28;
			} else {
				@Pc(65) int local65;
				if (local19 == -1) {
					local65 = local28;
					local48 = this.method5762(local46);
					if (this.aByteArrayArray22 != null && local21 != -1) {
						local48 += this.aByteArrayArray22[local21][local46];
					}
					local21 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local65 = local19;
					@Pc(72) String local72 = arg0.substring(local19 + 1, local28);
					local19 = -1;
					if (local72.equals("br")) {
						arg2[local23] = arg0.substring(local11, local28 + 1);
						local23++;
						if (arg2.length <= local23) {
							return 0;
						}
						local9 = 0;
						local11 = local28 + 1;
						local21 = -1;
						local13 = -1;
						continue;
					}
					if (local72.equals("lt")) {
						local48 = this.method5762(60);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][60];
						}
						local21 = 60;
					} else if (local72.equals("gt")) {
						local48 = this.method5762(62);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][62];
						}
						local21 = 62;
					} else if (local72.equals("nbsp")) {
						local48 = this.method5762(160);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][160];
						}
						local21 = 160;
					} else if (local72.equals("shy")) {
						local48 = this.method5762(173);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][173];
						}
						local21 = 173;
					} else if (local72.equals("times")) {
						local48 = this.method5762(215);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][215];
						}
						local21 = 215;
					} else if (local72.equals("euro")) {
						local48 = this.method5762(8364);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][8364];
						}
						local21 = 8364;
					} else if (local72.equals("copy")) {
						local48 = this.method5762(169);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][169];
						}
						local21 = 169;
					} else if (local72.equals("reg")) {
						local48 = this.method5762(174);
						if (this.aByteArrayArray22 != null && local21 != -1) {
							local48 += this.aByteArrayArray22[local21][174];
						}
						local21 = 174;
					} else if (local72.startsWith("img=") && arg3 != null) {
						try {
							@Pc(273) int local273 = Static270.method4173(local72.substring(4));
							local21 = -1;
							local48 = arg3[local273].method6003();
						} catch (@Pc(284) Exception local284) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local9 += local48;
					if (arg1 != null) {
						if (local46 == 32) {
							local13 = local28;
							local17 = 1;
							local15 = local9;
						}
						if (local9 > arg1[local23 >= arg1.length ? arg1.length - 1 : local23]) {
							if (local13 >= 0) {
								arg2[local23] = arg0.substring(local11, local13 + 1 - local17);
								local23++;
								if (arg2.length <= local23) {
									return 0;
								}
								local11 = local13 + 1;
								local21 = -1;
								local9 -= local15;
								local13 = -1;
							} else {
								arg2[local23] = arg0.substring(local11, local65);
								local23++;
								if (arg2.length <= local23) {
									return 0;
								}
								local11 = local65;
								local21 = -1;
								local9 = local48;
								local13 = -1;
							}
						}
						if (local46 == 45) {
							local13 = local28;
							local15 = local9;
							local17 = 0;
						}
					}
				}
			}
		}
		if (local11 < arg0.length()) {
			arg2[local23] = arg0.substring(local11, arg0.length());
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;[Lclient!pu;I)I")
	public int method5769(@OriginalArg(1) String arg0, @OriginalArg(2) Class50[] arg1, @OriginalArg(3) int arg2) {
		@Pc(22) int local22 = this.method5768(arg0, new int[] { arg2 }, Static556.aStringArray52, arg1);
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local22; local26++) {
			@Pc(35) int local35 = this.method5764(Static556.aStringArray52[local26], arg1);
			if (local35 > local24) {
				local24 = local35;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZILjava/lang/String;[Lclient!pu;)Ljava/lang/String;")
	public String method5770(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class50[] arg2) {
		if (arg0 >= this.method5764(arg1, arg2)) {
			return arg1;
		}
		@Pc(20) int local20 = arg0 - this.method5764("...", (Class50[]) null);
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg1.length();
		@Pc(31) String local31 = "";
		for (@Pc(33) int local33 = 0; local33 < local29; local33++) {
			@Pc(38) char local38 = arg1.charAt(local33);
			if (local38 == '<') {
				local22 = local33;
			} else {
				if (local38 == '>' && local22 != -1) {
					@Pc(59) String local59 = arg1.substring(local22 + 1, local33);
					local22 = -1;
					if (local59.equals("lt")) {
						local38 = '<';
					} else if (local59.equals("gt")) {
						local38 = '>';
					} else if (local59.equals("nbsp")) {
						local38 = ' ';
					} else if (local59.equals("shy")) {
						local38 = '\u00ad';
					} else if (local59.equals("times")) {
						local38 = '×';
					} else if (local59.equals("euro")) {
						local38 = '€';
					} else if (local59.equals("copy")) {
						local38 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=") && arg2 != null) {
								try {
									@Pc(117) int local117 = Static270.method4173(local59.substring(4));
									local26 += arg2[local117].method6003();
									local24 = -1;
									if (local20 < local26) {
										return local31 + "...";
									}
									local31 = arg1.substring(0, local33 + 1);
								} catch (@Pc(151) Exception local151) {
								}
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local22 == -1) {
					local26 += this.aByteArray66[Static651.method8726(local38) & 0xFF] & 0xFF;
					if (this.aByteArrayArray22 != null && local24 != -1) {
						local26 += this.aByteArrayArray22[local24][local38];
					}
					local24 = local38;
					@Pc(200) int local200 = local26;
					if (this.aByteArrayArray22 != null) {
						local200 = local26 + this.aByteArrayArray22[local38][46];
					}
					if (local200 > local20) {
						return local31 + "...";
					}
					local31 = arg1.substring(0, local33 + 1);
				}
			}
		}
		return arg1;
	}
}
