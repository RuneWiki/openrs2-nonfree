import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class244 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
	public final int anInt7380;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	public final int anInt7376;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
	public final int anInt7388;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "([B)V")
	public Class244(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class12_Sub8 local8 = new Class12_Sub8(arg0);
		@Pc(12) int local12 = local8.method5216();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method5216() == 1;
		this.aByteArray92 = new byte[256];
		local8.method5181(256, this.aByteArray92);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method5216();
			}
			@Pc(73) int[] local73 = new int[256];
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local73[local75] = local8.method5216();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local54[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method5173();
					local90[local92][local105] = local103;
				}
			}
			@Pc(134) byte[][] local134 = new byte[256][];
			@Pc(149) int local149;
			for (local105 = 0; local105 < 256; local105++) {
				local134[local105] = new byte[local54[local105]];
				@Pc(147) byte local147 = 0;
				for (local149 = 0; local149 < local134[local105].length; local149++) {
					local147 += local8.method5173();
					local134[local105][local149] = local147;
				}
			}
			this.aByteArrayArray22 = new byte[256][256];
			for (@Pc(184) int local184 = 0; local184 < 256; local184++) {
				if (local184 != 32 && local184 != 160) {
					for (local149 = 0; local149 < 256; local149++) {
						if (local149 != 32 && local149 != 160) {
							this.aByteArrayArray22[local184][local149] = (byte) Static332.method5311(local184, local149, local134, local73, local54, this.aByteArray92, local90);
						}
					}
				}
			}
			this.anInt7380 = local54[32] + local73[32];
		} else {
			this.anInt7380 = local8.method5216();
		}
		local8.method5216();
		local8.method5216();
		this.anInt7376 = local8.method5216();
		this.anInt7388 = local8.method5216();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method6147(@OriginalArg(0) String arg0) {
		return this.method6148(null, arg0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([Lclient!ha;Ljava/lang/String;I)I")
	public int method6148(@OriginalArg(0) Class84[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg1.charAt(local28);
			if (local34 == '<') {
				local11 = local28;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(59) String local59 = arg1.substring(local11 + 1, local28);
					local11 = -1;
					if (local59.equals("lt")) {
						local34 = '<';
					} else if (local59.equals("gt")) {
						local34 = '>';
					} else if (local59.equals("nbsp")) {
						local34 = ' ';
					} else if (local59.equals("shy")) {
						local34 = '\u00ad';
					} else if (local59.equals("times")) {
						local34 = '×';
					} else if (local59.equals("euro")) {
						local34 = '€';
					} else if (local59.equals("copy")) {
						local34 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=") && arg0 != null) {
								try {
									@Pc(125) int local125 = Static467.method7015(local59.substring(4));
									local23 += arg0[local125].EA();
									local21 = -1;
								} catch (@Pc(136) Exception local136) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local23 += this.aByteArray92[Static253.method4366(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray22 != null && local21 != -1) {
						local23 += this.aByteArrayArray22[local21][local34];
					}
					local21 = local34;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!ha;B)I")
	public int method6150(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84[] arg2) {
		return this.method6158(Static496.aStringArray42, arg2, arg0, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!ha;I)Ljava/lang/String;")
	public String method6152(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84[] arg2) {
		if (this.method6148(arg2, arg0) <= arg1) {
			return arg0;
		}
		@Pc(26) int local26 = arg1 - this.method6148(null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg0.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(68) String local68 = arg0.substring(local28 + 1, local39);
					local28 = -1;
					if (local68.equals("lt")) {
						local45 = '<';
					} else if (local68.equals("gt")) {
						local45 = '>';
					} else if (local68.equals("nbsp")) {
						local45 = ' ';
					} else if (local68.equals("shy")) {
						local45 = '\u00ad';
					} else if (local68.equals("times")) {
						local45 = '×';
					} else if (local68.equals("euro")) {
						local45 = '€';
					} else if (local68.equals("copy")) {
						local45 = '©';
					} else {
						if (!local68.equals("reg")) {
							if (local68.startsWith("img=") && arg2 != null) {
								try {
									@Pc(132) int local132 = Static467.method7015(local68.substring(4));
									local30 = -1;
									local32 += arg2[local132].EA();
									if (local32 > local26) {
										return local37 + "...";
									}
									local37 = arg0.substring(0, local39 + 1);
								} catch (@Pc(166) Exception local166) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray92[Static253.method4366(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray22 != null && local30 != -1) {
						local32 += this.aByteArrayArray22[local30][local45];
					}
					local30 = local45;
					@Pc(217) int local217 = local32;
					if (this.aByteArrayArray22 != null) {
						local217 = local32 + this.aByteArrayArray22[local45][46];
					}
					if (local26 < local217) {
						return local37 + "...";
					}
					local37 = arg0.substring(0, local39 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BIC)I")
	public int method6154(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1];
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
	public int method6155(@OriginalArg(0) int arg0) {
		return this.aByteArray92[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([Lclient!ha;ILjava/lang/String;II)I")
	public int method6157(@OriginalArg(0) Class84[] arg0, @OriginalArg(2) String arg1) {
		@Pc(4) int local4 = this.anInt7380;
		@Pc(26) int local26 = this.method6158(Static496.aStringArray42, arg0, arg1, new int[] { 100 });
		@Pc(32) int local32 = local4 * (local26 - 1);
		return this.anInt7388 + local32 + this.anInt7376;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([Ljava/lang/String;[Lclient!ha;ILjava/lang/String;[I)I")
	public int method6158(@OriginalArg(0) String[] arg0, @OriginalArg(1) Class84[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int[] arg3) {
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
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static253.method4366(arg2.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(59) int local59;
				if (local21 == -1) {
					local59 = local30;
					local42 = this.method6155(local40);
					if (this.aByteArrayArray22 != null && local23 != -1) {
						local42 += this.aByteArrayArray22[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local59 = local21;
					@Pc(66) String local66 = arg2.substring(local21 + 1, local30);
					local21 = -1;
					if (local66.equals("br")) {
						arg0[local25] = arg2.substring(local13, local30 + 1);
						local25++;
						if (local25 >= arg0.length) {
							return 0;
						}
						local23 = -1;
						local13 = local30 + 1;
						local15 = -1;
						local11 = 0;
						continue;
					}
					if (local66.equals("lt")) {
						local42 = this.method6155(60);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][60];
						}
						local23 = 60;
					} else if (local66.equals("gt")) {
						local42 = this.method6155(62);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][62];
						}
						local23 = 62;
					} else if (local66.equals("nbsp")) {
						local42 = this.method6155(160);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][160];
						}
						local23 = 160;
					} else if (local66.equals("shy")) {
						local42 = this.method6155(173);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][173];
						}
						local23 = 173;
					} else if (local66.equals("times")) {
						local42 = this.method6155(215);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][215];
						}
						local23 = 215;
					} else if (local66.equals("euro")) {
						local42 = this.method6155(8364);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][8364];
						}
						local23 = 8364;
					} else if (local66.equals("copy")) {
						local42 = this.method6155(169);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][169];
						}
						local23 = 169;
					} else if (local66.equals("reg")) {
						local42 = this.method6155(174);
						if (this.aByteArrayArray22 != null && local23 != -1) {
							local42 += this.aByteArrayArray22[local23][174];
						}
						local23 = 174;
					} else if (local66.startsWith("img=") && arg1 != null) {
						try {
							@Pc(233) int local233 = Static467.method7015(local66.substring(4));
							local23 = -1;
							local42 = arg1[local233].EA();
						} catch (@Pc(244) Exception local244) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg3 != null) {
						if (local40 == 32) {
							local19 = 1;
							local15 = local30;
							local17 = local11;
						}
						if (arg3[local25 >= arg3.length ? arg3.length - 1 : local25] < local11) {
							if (local15 < 0) {
								arg0[local25] = arg2.substring(local13, local59);
								local25++;
								if (arg0.length <= local25) {
									return 0;
								}
								local15 = -1;
								local23 = -1;
								local13 = local59;
								local11 = local42;
							} else {
								arg0[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg0.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local23 = -1;
								local11 -= local17;
							}
						}
						if (local40 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local30;
						}
					}
				}
			}
		}
		if (arg2.length() > local13) {
			arg0[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([Lclient!ha;ILjava/lang/String;I)I")
	public int method6159(@OriginalArg(0) Class84[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method6158(Static496.aStringArray42, arg0, arg1, new int[] { arg2 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method6148(arg0, Static496.aStringArray42[local22]);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}
}
