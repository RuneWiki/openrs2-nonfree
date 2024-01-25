import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class62 {

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public final int anInt1462;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	public final int anInt1455;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	public final int anInt1460;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([B)V")
	public Class62(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(12) int local12 = local8.method4548();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method4548() == 1;
		this.aByteArray10 = new byte[256];
		local8.method4511(this.aByteArray10, 256);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			@Pc(57) int[] local57 = new int[256];
			for (@Pc(59) int local59 = 0; local59 < 256; local59++) {
				local54[local59] = local8.method4548();
			}
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local57[local75] = local8.method4548();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local54[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method4529();
					local90[local92][local105] = local103;
				}
			}
			@Pc(136) byte[][] local136 = new byte[256][];
			@Pc(151) int local151;
			for (local105 = 0; local105 < 256; local105++) {
				local136[local105] = new byte[local54[local105]];
				@Pc(149) byte local149 = 0;
				for (local151 = 0; local151 < local136[local105].length; local151++) {
					local149 += local8.method4529();
					local136[local105][local151] = local149;
				}
			}
			this.aByteArrayArray4 = new byte[256][256];
			for (@Pc(184) int local184 = 0; local184 < 256; local184++) {
				if (local184 != 32 && local184 != 160) {
					for (local151 = 0; local151 < 256; local151++) {
						if (local151 != 32 && local151 != 160) {
							this.aByteArrayArray4[local184][local151] = (byte) Static432.method5814(local184, local90, local54, local57, local151, this.aByteArray10, local136);
						}
					}
				}
			}
			this.anInt1462 = local57[32] + local54[32];
		} else {
			this.anInt1462 = local8.method4548();
		}
		local8.method4548();
		local8.method4548();
		this.anInt1455 = local8.method4548();
		this.anInt1460 = local8.method4548();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!f;)I")
	public int method1149(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class78[] arg2) {
		return this.method1158(Static226.aStringArray21, arg2, arg1, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;I)Ljava/lang/String;")
	public String method1151(@OriginalArg(1) Class78[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method1152(arg0, arg1)) {
			return arg1;
		}
		@Pc(34) int local34 = arg2 - this.method1152(null, "...");
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = arg1.length();
		@Pc(45) String local45 = "";
		for (@Pc(47) int local47 = 0; local47 < local43; local47++) {
			@Pc(53) char local53 = arg1.charAt(local47);
			if (local53 == '<') {
				local36 = local47;
			} else {
				if (local53 == '>' && local36 != -1) {
					@Pc(75) String local75 = arg1.substring(local36 + 1, local47);
					local36 = -1;
					if (local75.equals("lt")) {
						local53 = '<';
					} else if (local75.equals("gt")) {
						local53 = '>';
					} else if (local75.equals("nbsp")) {
						local53 = ' ';
					} else if (local75.equals("shy")) {
						local53 = '\u00ad';
					} else if (local75.equals("times")) {
						local53 = '×';
					} else if (local75.equals("euro")) {
						local53 = '€';
					} else if (local75.equals("copy")) {
						local53 = '©';
					} else {
						if (!local75.equals("reg")) {
							if (local75.startsWith("img=") && arg0 != null) {
								try {
									@Pc(135) int local135 = Static32.method455(local75.substring(4));
									local40 += arg0[local135].ja();
									local38 = -1;
									if (local40 > local34) {
										return local45 + "...";
									}
									local45 = arg1.substring(0, local47 + 1);
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local53 = '®';
					}
				}
				if (local36 == -1) {
					local40 += this.aByteArray10[Static359.method5126(local53) & 0xFF] & 0xFF;
					if (this.aByteArrayArray4 != null && local38 != -1) {
						local40 += this.aByteArrayArray4[local38][local53];
					}
					local38 = local53;
					@Pc(221) int local221 = local40;
					if (this.aByteArrayArray4 != null) {
						local221 = local40 + this.aByteArrayArray4[local53][46];
					}
					if (local221 > local34) {
						return local45 + "...";
					}
					local45 = arg1.substring(0, local47 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;)I")
	public int method1152(@OriginalArg(1) Class78[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg1.charAt(local28);
			if (local34 == '<') {
				local11 = local28;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg1.substring(local11 + 1, local28);
					local11 = -1;
					if (local54.equals("lt")) {
						local34 = '<';
					} else if (local54.equals("gt")) {
						local34 = '>';
					} else if (local54.equals("nbsp")) {
						local34 = ' ';
					} else if (local54.equals("shy")) {
						local34 = '\u00ad';
					} else if (local54.equals("times")) {
						local34 = '×';
					} else if (local54.equals("euro")) {
						local34 = '€';
					} else if (local54.equals("copy")) {
						local34 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg0 != null) {
								try {
									@Pc(120) int local120 = Static32.method455(local54.substring(4));
									local13 = -1;
									local15 += arg0[local120].ja();
								} catch (@Pc(131) Exception local131) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray10[Static359.method5126(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray4 != null && local13 != -1) {
						local15 += this.aByteArrayArray4[local13][local34];
					}
					local13 = local34;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;II)I")
	public int method1153(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = this.method1158(Static226.aStringArray21, arg0, arg1, new int[] { arg2 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(34) int local34 = this.method1152(arg0, Static226.aStringArray21[local22]);
			if (local20 < local34) {
				local20 = local34;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(CBI)I")
	public int method1154(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray4 == null ? 0 : this.aByteArrayArray4[arg1][arg0];
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)I")
	public int method1155(@OriginalArg(0) int arg0) {
		return this.aByteArray10[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!f;)I")
	public int method1156(@OriginalArg(3) String arg0, @OriginalArg(4) Class78[] arg1) {
		@Pc(11) int local11 = this.anInt1462;
		@Pc(24) int local24 = this.method1158(Static226.aStringArray21, arg1, arg0, new int[] { 100 });
		@Pc(30) int local30 = (local24 - 1) * local11;
		return this.anInt1460 + local30 + this.anInt1455;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method1157(@OriginalArg(0) String arg0) {
		return this.method1152(null, arg0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([Ljava/lang/String;[Lclient!f;Ljava/lang/String;[IZ)I")
	public int method1158(@OriginalArg(0) String[] arg0, @OriginalArg(1) Class78[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3) {
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
			@Pc(40) int local40 = Static359.method5126(arg2.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(60) int local60;
				if (local21 == -1) {
					local60 = local30;
					local42 = this.method1155(local40);
					if (this.aByteArrayArray4 != null && local23 != -1) {
						local42 += this.aByteArrayArray4[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local60 = local21;
					@Pc(67) String local67 = arg2.substring(local21 + 1, local30);
					local21 = -1;
					if (local67.equals("br")) {
						arg0[local25] = arg2.substring(local13, local30 + 1);
						local25++;
						if (arg0.length <= local25) {
							return 0;
						}
						local15 = -1;
						local23 = -1;
						local13 = local30 + 1;
						local11 = 0;
						continue;
					}
					if (local67.equals("lt")) {
						local42 = this.method1155(60);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][60];
						}
						local23 = 60;
					} else if (local67.equals("gt")) {
						local42 = this.method1155(62);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][62];
						}
						local23 = 62;
					} else if (local67.equals("nbsp")) {
						local42 = this.method1155(160);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][160];
						}
						local23 = 160;
					} else if (local67.equals("shy")) {
						local42 = this.method1155(173);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][173];
						}
						local23 = 173;
					} else if (local67.equals("times")) {
						local42 = this.method1155(215);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][215];
						}
						local23 = 215;
					} else if (local67.equals("euro")) {
						local42 = this.method1155(8364);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][8364];
						}
						local23 = 8364;
					} else if (local67.equals("copy")) {
						local42 = this.method1155(169);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][169];
						}
						local23 = 169;
					} else if (local67.equals("reg")) {
						local42 = this.method1155(174);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local42 += this.aByteArrayArray4[local23][174];
						}
						local23 = 174;
					} else if (local67.startsWith("img=") && arg1 != null) {
						try {
							@Pc(274) int local274 = Static32.method455(local67.substring(4));
							local42 = arg1[local274].ja();
							local23 = -1;
						} catch (@Pc(285) Exception local285) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg3 != null) {
						if (local40 == 32) {
							local17 = local11;
							local15 = local30;
							local19 = 1;
						}
						if (arg3[arg3.length > local25 ? local25 : arg3.length - 1] < local11) {
							if (local15 >= 0) {
								arg0[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg0.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local23 = -1;
								local15 = -1;
							} else {
								arg0[local25] = arg2.substring(local13, local60);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local11 = local42;
								local23 = -1;
								local15 = -1;
								local13 = local60;
							}
						}
						if (local40 == 45) {
							local19 = 0;
							local15 = local30;
							local17 = local11;
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
}
