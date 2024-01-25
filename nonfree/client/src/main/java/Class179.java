import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class179 {

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "[B")
	private final byte[] aByteArray61;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
	public final int anInt5456;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
	public final int anInt5455;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
	public final int anInt5440;

	static {
		new Class175("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "([B)V")
	public Class179(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub2 local6 = new Class3_Sub2(arg0);
		@Pc(10) int local10 = local6.method6053();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(26) boolean local26 = local6.method6053() == 1;
		this.aByteArray61 = new byte[256];
		local6.method6032(this.aByteArray61, 256);
		if (local26) {
			@Pc(48) int[] local48 = new int[256];
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local48[local53] = local6.method6053();
			}
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local51[local66] = local6.method6053();
			}
			@Pc(80) byte[][] local80 = new byte[256][];
			@Pc(94) int local94;
			for (@Pc(82) int local82 = 0; local82 < 256; local82++) {
				local80[local82] = new byte[local48[local82]];
				@Pc(92) byte local92 = 0;
				for (local94 = 0; local94 < local80[local82].length; local94++) {
					local92 += local6.method6011();
					local80[local82][local94] = local92;
				}
			}
			@Pc(126) byte[][] local126 = new byte[256][];
			@Pc(140) int local140;
			for (local94 = 0; local94 < 256; local94++) {
				local126[local94] = new byte[local48[local94]];
				@Pc(138) byte local138 = 0;
				for (local140 = 0; local140 < local126[local94].length; local140++) {
					local138 += local6.method6011();
					local126[local94][local140] = local138;
				}
			}
			this.aByteArrayArray15 = new byte[256][256];
			for (@Pc(172) int local172 = 0; local172 < 256; local172++) {
				if (local172 != 32 && local172 != 160) {
					for (local140 = 0; local140 < 256; local140++) {
						if (local140 != 32 && local140 != 160) {
							this.aByteArrayArray15[local172][local140] = (byte) Static55.method1110(local172, local48, local140, local126, this.aByteArray61, local80, local51);
						}
					}
				}
			}
			this.anInt5456 = local51[32] + local48[32];
		} else {
			this.anInt5456 = local6.method6053();
		}
		local6.method6053();
		local6.method6053();
		this.anInt5455 = local6.method6053();
		this.anInt5440 = local6.method6053();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;I[Lclient!f;)Ljava/lang/String;")
	public String method4384(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22[] arg2) {
		if (arg1 >= this.method4390(arg2, arg0)) {
			return arg0;
		}
		@Pc(24) int local24 = arg1 - this.method4390(null, "...");
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(43) int local43 = arg0.length();
		@Pc(45) String local45 = "";
		for (@Pc(47) int local47 = 0; local47 < local43; local47++) {
			@Pc(52) char local52 = arg0.charAt(local47);
			if (local52 == '<') {
				local26 = local47;
			} else {
				if (local52 == '>' && local26 != -1) {
					@Pc(73) String local73 = arg0.substring(local26 + 1, local47);
					local26 = -1;
					if (local73.equals("lt")) {
						local52 = '<';
					} else if (local73.equals("gt")) {
						local52 = '>';
					} else if (local73.equals("nbsp")) {
						local52 = ' ';
					} else if (local73.equals("shy")) {
						local52 = '\u00ad';
					} else if (local73.equals("times")) {
						local52 = '×';
					} else if (local73.equals("euro")) {
						local52 = '€';
					} else if (local73.equals("copy")) {
						local52 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=") && arg2 != null) {
								try {
									@Pc(132) int local132 = Static110.method1873(local73.substring(4));
									local28 = -1;
									local30 += arg2[local132].ja();
									if (local30 > local24) {
										return local45 + "...";
									}
									local45 = arg0.substring(0, local47 + 1);
								} catch (@Pc(162) Exception local162) {
								}
							}
							continue;
						}
						local52 = '®';
					}
				}
				if (local26 == -1) {
					local30 += this.aByteArray61[Static278.method5344(local52) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local28 != -1) {
						local30 += this.aByteArrayArray15[local28][local52];
					}
					local28 = local52;
					@Pc(210) int local210 = local30;
					if (this.aByteArrayArray15 != null) {
						local210 = local30 + this.aByteArrayArray15[local52][46];
					}
					if (local210 > local24) {
						return local45 + "...";
					}
					local45 = arg0.substring(0, local47 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4385(@OriginalArg(1) String arg0) {
		return this.method4390(null, arg0);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IILjava/lang/String;I[Lclient!f;)I")
	public int method4387(@OriginalArg(2) String arg0, @OriginalArg(4) Class22[] arg1) {
		@Pc(7) int local7 = this.anInt5456;
		@Pc(24) int local24 = this.method4391(new int[] { 100 }, arg1, arg0, Static228.aStringArray177);
		@Pc(30) int local30 = local7 * (local24 - 1);
		return local30 + this.anInt5455 + this.anInt5440;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/String;B[Lclient!f;I)I")
	public int method4389(@OriginalArg(0) String arg0, @OriginalArg(2) Class22[] arg1, @OriginalArg(3) int arg2) {
		return this.method4391(new int[] { arg2 }, arg1, arg0, Static228.aStringArray177);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B[Lclient!f;Ljava/lang/String;)I")
	public int method4390(@OriginalArg(1) Class22[] arg0, @OriginalArg(2) String arg1) {
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
					@Pc(43) String local43 = arg1.substring(local9 + 1, local18);
					local9 = -1;
					if (local43.equals("lt")) {
						local23 = '<';
					} else if (local43.equals("gt")) {
						local23 = '>';
					} else if (local43.equals("nbsp")) {
						local23 = ' ';
					} else if (local43.equals("shy")) {
						local23 = '\u00ad';
					} else if (local43.equals("times")) {
						local23 = '×';
					} else if (local43.equals("euro")) {
						local23 = '€';
					} else if (local43.equals("copy")) {
						local23 = '©';
					} else {
						if (!local43.equals("reg")) {
							if (local43.startsWith("img=") && arg0 != null) {
								try {
									@Pc(102) int local102 = Static110.method1873(local43.substring(4));
									local13 += arg0[local102].ja();
									local11 = -1;
								} catch (@Pc(113) Exception local113) {
								}
							}
							continue;
						}
						local23 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray61[Static278.method5344(local23) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local11 != -1) {
						local13 += this.aByteArrayArray15[local11][local23];
					}
					local11 = local23;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B[I[Lclient!f;Ljava/lang/String;[Ljava/lang/String;)I")
	public int method4391(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class22[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg2.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(42) int local42 = Static278.method5344(arg2.charAt(local33)) & 0xFF;
			@Pc(44) int local44 = 0;
			if (local42 == 60) {
				local19 = local33;
			} else {
				@Pc(64) int local64;
				if (local19 == -1) {
					local44 = this.method4394(local42);
					local64 = local33;
					if (this.aByteArrayArray15 != null && local21 != -1) {
						local44 += this.aByteArrayArray15[local21][local42];
					}
					local21 = local42;
				} else {
					if (local42 != 62) {
						continue;
					}
					local64 = local19;
					@Pc(97) String local97 = arg2.substring(local19 + 1, local33);
					local19 = -1;
					if (local97.equals("br")) {
						arg3[local28] = arg2.substring(local11, local33 + 1);
						local28++;
						if (arg3.length <= local28) {
							return 0;
						}
						local11 = local33 + 1;
						local9 = 0;
						local21 = -1;
						local13 = -1;
						continue;
					}
					if (local97.equals("lt")) {
						local44 = this.method4394(60);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][60];
						}
						local21 = 60;
					} else if (local97.equals("gt")) {
						local44 = this.method4394(62);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][62];
						}
						local21 = 62;
					} else if (local97.equals("nbsp")) {
						local44 = this.method4394(160);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][160];
						}
						local21 = 160;
					} else if (local97.equals("shy")) {
						local44 = this.method4394(173);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][173];
						}
						local21 = 173;
					} else if (local97.equals("times")) {
						local44 = this.method4394(215);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][215];
						}
						local21 = 215;
					} else if (local97.equals("euro")) {
						local44 = this.method4394(8364);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][8364];
						}
						local21 = 8364;
					} else if (local97.equals("copy")) {
						local44 = this.method4394(169);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][169];
						}
						local21 = 169;
					} else if (local97.equals("reg")) {
						local44 = this.method4394(174);
						if (this.aByteArrayArray15 != null && local21 != -1) {
							local44 += this.aByteArrayArray15[local21][174];
						}
						local21 = 174;
					} else if (local97.startsWith("img=") && arg1 != null) {
						try {
							@Pc(279) int local279 = Static110.method1873(local97.substring(4));
							local21 = -1;
							local44 = arg1[local279].ja();
						} catch (@Pc(290) Exception local290) {
						}
					}
					local42 = -1;
				}
				if (local44 > 0) {
					local9 += local44;
					if (arg0 != null) {
						if (local42 == 32) {
							local17 = 1;
							local13 = local33;
							local15 = local9;
						}
						if (local9 > arg0[local28 >= arg0.length ? arg0.length - 1 : local28]) {
							if (local13 >= 0) {
								arg3[local28] = arg2.substring(local11, local13 + 1 - local17);
								local28++;
								if (arg3.length <= local28) {
									return 0;
								}
								local11 = local13 + 1;
								local13 = -1;
								local9 -= local15;
								local21 = -1;
							} else {
								arg3[local28] = arg2.substring(local11, local64);
								local28++;
								if (arg3.length <= local28) {
									return 0;
								}
								local21 = -1;
								local11 = local64;
								local13 = -1;
								local9 = local44;
							}
						}
						if (local42 == 45) {
							local17 = 0;
							local13 = local33;
							local15 = local9;
						}
					}
				}
			}
		}
		if (local11 < arg2.length()) {
			arg3[local28] = arg2.substring(local11, arg2.length());
			local28++;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!f;)I")
	public int method4392(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class22[] arg2) {
		@Pc(16) int local16 = this.method4391(new int[] { arg0 }, arg2, arg1, Static228.aStringArray177);
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			@Pc(37) int local37 = this.method4390(arg2, Static228.aStringArray177[local28]);
			if (local26 < local37) {
				local26 = local37;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(CZI)I")
	public int method4393(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray15 == null ? 0 : this.aByteArrayArray15[arg1][arg0];
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)I")
	public int method4394(@OriginalArg(0) int arg0) {
		return this.aByteArray61[arg0] & 0xFF;
	}
}
