import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class31 {

	@OriginalMember(owner = "client!bq", name = "D", descriptor = "[Lclient!iga;")
	private static final Class164[] aClass164Array1 = new Class164[32];

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
	public final int anInt1106;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public final int anInt1098;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	public final int anInt1095;

	static {
		@Pc(89) Class164[] local89 = Static637.method8479();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass164Array1[local89[local91].anInt4099] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "([B)V")
	public Class31(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(12) int local12 = local8.method8865();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method8865() == 1;
		this.aByteArray20 = new byte[256];
		local8.method8870(this.aByteArray20, 0, 256);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local56[local58] = local8.method8865();
			}
			@Pc(75) int[] local75 = new int[256];
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local75[local77] = local8.method8865();
			}
			@Pc(94) byte[][] local94 = new byte[256][];
			@Pc(109) int local109;
			for (@Pc(96) int local96 = 0; local96 < 256; local96++) {
				local94[local96] = new byte[local56[local96]];
				@Pc(107) byte local107 = 0;
				for (local109 = 0; local109 < local94[local96].length; local109++) {
					local107 += local8.method8861();
					local94[local96][local109] = local107;
				}
			}
			@Pc(142) byte[][] local142 = new byte[256][];
			@Pc(157) int local157;
			for (local109 = 0; local109 < 256; local109++) {
				local142[local109] = new byte[local56[local109]];
				@Pc(155) byte local155 = 0;
				for (local157 = 0; local157 < local142[local109].length; local157++) {
					local155 += local8.method8861();
					local142[local109][local157] = local155;
				}
			}
			this.aByteArrayArray3 = new byte[256][256];
			for (@Pc(192) int local192 = 0; local192 < 256; local192++) {
				if (local192 != 32 && local192 != 160) {
					for (local157 = 0; local157 < 256; local157++) {
						if (local157 != 32 && local157 != 160) {
							this.aByteArrayArray3[local192][local157] = (byte) Static645.method8595(local157, local94, this.aByteArray20, local75, local56, local142, local192);
						}
					}
				}
			}
			this.anInt1106 = local56[32] + local75[32];
		} else {
			this.anInt1106 = local8.method8865();
		}
		local8.method8865();
		local8.method8865();
		this.anInt1098 = local8.method8865();
		this.anInt1095 = local8.method8865();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BCI)I")
	public int method1014(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray3 == null ? 0 : this.aByteArrayArray3[arg1][arg0];
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "([Lclient!tf;Ljava/lang/String;IZ)Ljava/lang/String;")
	public String method1015(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.method1022(arg1, arg0) <= arg2) {
			return arg1;
		}
		@Pc(22) int local22 = arg2 - this.method1022("...", (Class17[]) null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(42) int local42 = arg1.length();
		@Pc(44) String local44 = "";
		for (@Pc(46) int local46 = 0; local46 < local42; local46++) {
			@Pc(52) char local52 = arg1.charAt(local46);
			if (local52 == '<') {
				local24 = local46;
			} else {
				if (local52 == '>' && local24 != -1) {
					@Pc(77) String local77 = arg1.substring(local24 + 1, local46);
					local24 = -1;
					if (local77.equals("lt")) {
						local52 = '<';
					} else if (local77.equals("gt")) {
						local52 = '>';
					} else if (local77.equals("nbsp")) {
						local52 = ' ';
					} else if (local77.equals("shy")) {
						local52 = '\u00ad';
					} else if (local77.equals("times")) {
						local52 = '×';
					} else if (local77.equals("euro")) {
						local52 = '€';
					} else if (local77.equals("copy")) {
						local52 = '©';
					} else {
						if (!local77.equals("reg")) {
							if (local77.startsWith("img=") && arg0 != null) {
								try {
									@Pc(135) int local135 = Static613.method8035(local77.substring(4));
									local26 = -1;
									local28 += arg0[local135].method5256();
									if (local22 < local28) {
										return local44 + "...";
									}
									local44 = arg1.substring(0, local46 + 1);
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local52 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray20[Static180.method8496(local52) & 0xFF] & 0xFF;
					if (this.aByteArrayArray3 != null && local26 != -1) {
						local28 += this.aByteArrayArray3[local26][local52];
					}
					local26 = local52;
					@Pc(221) int local221 = local28;
					if (this.aByteArrayArray3 != null) {
						local221 = local28 + this.aByteArrayArray3[local52][46];
					}
					if (local22 < local221) {
						return local44 + "...";
					}
					local44 = arg1.substring(0, local46 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "([Lclient!tf;Ljava/lang/String;II)I")
	public int method1017(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		return this.method1023(new int[] { arg2 }, arg1, Static434.aStringArray35, arg0);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)I")
	public int method1019(@OriginalArg(0) int arg0) {
		return this.aByteArray20[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[Lclient!tf;Ljava/lang/String;I)I")
	public int method1020(@OriginalArg(1) Class17[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(24) int local24 = this.method1023(new int[] { arg2 }, arg1, Static434.aStringArray35, arg0);
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(38) int local38 = this.method1022(Static434.aStringArray35[local28], arg0);
			if (local26 < local38) {
				local26 = local38;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "([Lclient!tf;IIBLjava/lang/String;)I")
	public int method1021(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt1106;
		}
		@Pc(24) int local24 = this.method1023(new int[] { arg2 }, arg3, Static434.aStringArray35, arg0);
		@Pc(38) int local38 = (local24 - 1) * arg1;
		return local38 + this.anInt1098 + this.anInt1095;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLjava/lang/String;[Lclient!tf;)I")
	public int method1022(@OriginalArg(1) String arg0, @OriginalArg(2) Class17[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = arg0.charAt(local20);
			if (local31 == '<') {
				local11 = local20;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local54.equals("lt")) {
						local31 = '<';
					} else if (local54.equals("gt")) {
						local31 = '>';
					} else if (local54.equals("nbsp")) {
						local31 = ' ';
					} else if (local54.equals("shy")) {
						local31 = '\u00ad';
					} else if (local54.equals("times")) {
						local31 = '×';
					} else if (local54.equals("euro")) {
						local31 = '€';
					} else if (local54.equals("copy")) {
						local31 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg1 != null) {
								try {
									@Pc(116) int local116 = Static613.method8035(local54.substring(4));
									local15 += arg1[local116].method5256();
									local13 = -1;
								} catch (@Pc(127) Exception local127) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray20[Static180.method8496(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray3 != null && local13 != -1) {
						local15 += this.aByteArrayArray3[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[ILjava/lang/String;[Ljava/lang/String;[Lclient!tf;)I")
	public int method1023(@OriginalArg(1) int[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class17[] arg3) {
		if (arg1 == null) {
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
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static180.method8496(arg1.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(63) int local63;
				if (local26 == -1) {
					local47 = this.method1019(local45);
					local63 = local35;
					if (this.aByteArrayArray3 != null && local28 != -1) {
						local47 += this.aByteArrayArray3[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local63 = local26;
					@Pc(70) String local70 = arg1.substring(local26 + 1, local35);
					local26 = -1;
					if (local70.equals("br")) {
						arg2[local30] = arg1.substring(local18, local35 + 1);
						local30++;
						if (arg2.length <= local30) {
							return 0;
						}
						local28 = -1;
						local16 = 0;
						local18 = local35 + 1;
						local20 = -1;
						continue;
					}
					if (local70.equals("lt")) {
						local47 = this.method1019(60);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][60];
						}
						local28 = 60;
					} else if (local70.equals("gt")) {
						local47 = this.method1019(62);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][62];
						}
						local28 = 62;
					} else if (local70.equals("nbsp")) {
						local47 = this.method1019(160);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][160];
						}
						local28 = 160;
					} else if (local70.equals("shy")) {
						local47 = this.method1019(173);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][173];
						}
						local28 = 173;
					} else if (local70.equals("times")) {
						local47 = this.method1019(215);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][215];
						}
						local28 = 215;
					} else if (local70.equals("euro")) {
						local47 = this.method1019(8364);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][8364];
						}
						local28 = 8364;
					} else if (local70.equals("copy")) {
						local47 = this.method1019(169);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][169];
						}
						local28 = 169;
					} else if (local70.equals("reg")) {
						local47 = this.method1019(174);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][174];
						}
						local28 = 174;
					} else if (local70.startsWith("img=") && arg3 != null) {
						try {
							@Pc(200) int local200 = Static613.method8035(local70.substring(4));
							local47 = arg3[local200].method5256();
							local28 = -1;
						} catch (@Pc(211) Exception local211) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local20 = local35;
							local24 = 1;
							local22 = local16;
						}
						if (local16 > arg0[arg0.length <= local30 ? arg0.length - 1 : local30]) {
							if (local20 >= 0) {
								arg2[local30] = arg1.substring(local18, local20 + 1 - local24);
								local30++;
								if (local30 >= arg2.length) {
									return 0;
								}
								local18 = local20 + 1;
								local20 = -1;
								local16 -= local22;
								local28 = -1;
							} else {
								arg2[local30] = arg1.substring(local18, local63);
								local30++;
								if (arg2.length <= local30) {
									return 0;
								}
								local18 = local63;
								local16 = local47;
								local28 = -1;
								local20 = -1;
							}
						}
						if (local45 == 45) {
							local22 = local16;
							local20 = local35;
							local24 = 0;
						}
					}
				}
			}
		}
		if (arg1.length() > local18) {
			arg2[local30] = arg1.substring(local18, arg1.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method1024(@OriginalArg(0) String arg0) {
		return this.method1022(arg0, (Class17[]) null);
	}
}
