import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class350 {

	@OriginalMember(owner = "client!tja", name = "k", descriptor = "[B")
	private final byte[] aByteArray103;

	@OriginalMember(owner = "client!tja", name = "o", descriptor = "I")
	public final int anInt9698;

	@OriginalMember(owner = "client!tja", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!tja", name = "e", descriptor = "I")
	public final int anInt9697;

	@OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
	public final int anInt9699;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "([B)V")
	public Class350(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class14_Sub21 local6 = new Class14_Sub21(arg0);
		@Pc(10) int local10 = local6.method7695(113);
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local6.method7695(96) == 1;
		this.aByteArray103 = new byte[256];
		local6.method7750(256, 0, this.aByteArray103);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			@Pc(59) int[] local59 = new int[256];
			for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
				local56[local61] = local6.method7695(105);
			}
			for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
				local59[local76] = local6.method7695(107);
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(106) int local106;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local56[local94]];
				@Pc(104) byte local104 = 0;
				for (local106 = 0; local106 < local92[local94].length; local106++) {
					local104 += local6.method7720();
					local92[local94][local106] = local104;
				}
			}
			@Pc(138) byte[][] local138 = new byte[256][];
			@Pc(152) int local152;
			for (local106 = 0; local106 < 256; local106++) {
				local138[local106] = new byte[local56[local106]];
				@Pc(150) byte local150 = 0;
				for (local152 = 0; local152 < local138[local106].length; local152++) {
					local150 += local6.method7720();
					local138[local106][local152] = local150;
				}
			}
			this.aByteArrayArray27 = new byte[256][256];
			for (@Pc(186) int local186 = 0; local186 < 256; local186++) {
				if (local186 != 32 && local186 != 160) {
					for (local152 = 0; local152 < 256; local152++) {
						if (local152 != 32 && local152 != 160) {
							this.aByteArrayArray27[local186][local152] = (byte) Static455.method6711(local186, this.aByteArray103, local152, local92, local56, local138, local59);
						}
					}
				}
			}
			this.anInt9698 = local59[32] + local56[32];
		} else {
			this.anInt9698 = local6.method7695(97);
		}
		local6.method7695(107);
		local6.method7695(113);
		this.anInt9697 = local6.method7695(108);
		this.anInt9699 = local6.method7695(102);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(II)I")
	public int method8350(@OriginalArg(0) int arg0) {
		return this.aByteArray103[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IZILjava/lang/String;[Lclient!fia;)I")
	public int method8351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class45[] arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt9698;
		}
		@Pc(29) int local29 = this.method8354(Static258.aStringArray22, new int[] { arg1 }, arg3, arg2);
		@Pc(35) int local35 = (local29 - 1) * arg0;
		return this.anInt9699 + local35 + this.anInt9697;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(B[Lclient!fia;ILjava/lang/String;)I")
	public int method8352(@OriginalArg(1) Class45[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(22) int local22 = this.method8354(Static258.aStringArray22, new int[] { arg1 }, arg0, arg2);
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local22; local26++) {
			@Pc(35) int local35 = this.method8357(arg0, Static258.aStringArray22[local26]);
			if (local35 > local24) {
				local24 = local35;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(CIB)I")
	public int method8353(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray27 == null ? 0 : this.aByteArrayArray27[arg1][arg0];
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "([Ljava/lang/String;[I[Lclient!fia;Ljava/lang/String;I)I")
	public int method8354(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class45[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = -1;
		@Pc(16) int local16 = 0;
		@Pc(18) byte local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int local27 = arg3.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(38) int local38 = Static621.method8722(arg3.charAt(local29)) & 0xFF;
			@Pc(40) int local40 = 0;
			if (local38 == 60) {
				local20 = local29;
			} else {
				@Pc(59) int local59;
				if (local20 == -1) {
					local59 = local29;
					local40 = this.method8350(local38);
					if (this.aByteArrayArray27 != null && local22 != -1) {
						local40 += this.aByteArrayArray27[local22][local38];
					}
					local22 = local38;
				} else {
					if (local38 != 62) {
						continue;
					}
					local59 = local20;
					@Pc(66) String local66 = arg3.substring(local20 + 1, local29);
					local20 = -1;
					if (local66.equals("br")) {
						arg0[local24] = arg3.substring(local12, local29 + 1);
						local24++;
						if (arg0.length <= local24) {
							return 0;
						}
						local22 = -1;
						local12 = local29 + 1;
						local14 = -1;
						local10 = 0;
						continue;
					}
					if (local66.equals("lt")) {
						local40 = this.method8350(60);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][60];
						}
						local22 = 60;
					} else if (local66.equals("gt")) {
						local40 = this.method8350(62);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][62];
						}
						local22 = 62;
					} else if (local66.equals("nbsp")) {
						local40 = this.method8350(160);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][160];
						}
						local22 = 160;
					} else if (local66.equals("shy")) {
						local40 = this.method8350(173);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][173];
						}
						local22 = 173;
					} else if (local66.equals("times")) {
						local40 = this.method8350(215);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][215];
						}
						local22 = 215;
					} else if (local66.equals("euro")) {
						local40 = this.method8350(8364);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][8364];
						}
						local22 = 8364;
					} else if (local66.equals("copy")) {
						local40 = this.method8350(169);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][169];
						}
						local22 = 169;
					} else if (local66.equals("reg")) {
						local40 = this.method8350(174);
						if (this.aByteArrayArray27 != null && local22 != -1) {
							local40 += this.aByteArrayArray27[local22][174];
						}
						local22 = 174;
					} else if (local66.startsWith("img=") && arg2 != null) {
						try {
							@Pc(233) int local233 = Static297.method4858(local66.substring(4), -39);
							local22 = -1;
							local40 = arg2[local233].method7508();
						} catch (@Pc(244) Exception local244) {
						}
					}
					local38 = -1;
				}
				if (local40 > 0) {
					local10 += local40;
					if (arg1 != null) {
						if (local38 == 32) {
							local16 = local10;
							local18 = 1;
							local14 = local29;
						}
						if (arg1[local24 >= arg1.length ? arg1.length - 1 : local24] < local10) {
							if (local14 < 0) {
								arg0[local24] = arg3.substring(local12, local59);
								local24++;
								if (local24 >= arg0.length) {
									return 0;
								}
								local10 = local40;
								local22 = -1;
								local14 = -1;
								local12 = local59;
							} else {
								arg0[local24] = arg3.substring(local12, local14 + 1 - local18);
								local24++;
								if (local24 >= arg0.length) {
									return 0;
								}
								local12 = local14 + 1;
								local22 = -1;
								local10 -= local16;
								local14 = -1;
							}
						}
						if (local38 == 45) {
							local18 = 0;
							local14 = local29;
							local16 = local10;
						}
					}
				}
			}
		}
		if (local12 < arg3.length()) {
			arg0[local24] = arg3.substring(local12, arg3.length());
			local24++;
		}
		return local24;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method8356(@OriginalArg(1) String arg0) {
		return this.method8357((Class45[]) null, arg0);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "([Lclient!fia;Ljava/lang/String;Z)I")
	public int method8357(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) char local31 = arg1.charAt(local26);
			if (local31 == '<') {
				local17 = local26;
			} else {
				if (local31 == '>' && local17 != -1) {
					@Pc(53) String local53 = arg1.substring(local17 + 1, local26);
					local17 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg0 != null) {
								try {
									@Pc(140) int local140 = Static297.method4858(local53.substring(4), 109);
									local19 = -1;
									local21 += arg0[local140].method7508();
								} catch (@Pc(151) Exception local151) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local17 == -1) {
					local21 += this.aByteArray103[Static621.method8722(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray27 != null && local19 != -1) {
						local21 += this.aByteArrayArray27[local19][local31];
					}
					local19 = local31;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!fia;I)I")
	public int method8358(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45[] arg2) {
		return this.method8354(Static258.aStringArray22, new int[] { arg1 }, arg2, arg0);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "([Lclient!fia;IILjava/lang/String;)Ljava/lang/String;")
	public String method8359(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (this.method8357(arg0, arg2) <= arg1) {
			return arg2;
		}
		@Pc(23) int local23 = arg1 - this.method8357((Class45[]) null, "...");
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = arg2.length();
		@Pc(34) String local34 = "";
		for (@Pc(36) int local36 = 0; local36 < local32; local36++) {
			@Pc(41) char local41 = arg2.charAt(local36);
			if (local41 == '<') {
				local25 = local36;
			} else {
				if (local41 == '>' && local25 != -1) {
					@Pc(62) String local62 = arg2.substring(local25 + 1, local36);
					local25 = -1;
					if (local62.equals("lt")) {
						local41 = '<';
					} else if (local62.equals("gt")) {
						local41 = '>';
					} else if (local62.equals("nbsp")) {
						local41 = ' ';
					} else if (local62.equals("shy")) {
						local41 = '\u00ad';
					} else if (local62.equals("times")) {
						local41 = '×';
					} else if (local62.equals("euro")) {
						local41 = '€';
					} else if (local62.equals("copy")) {
						local41 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=") && arg0 != null) {
								try {
									@Pc(151) int local151 = Static297.method4858(local62.substring(4), -79);
									local27 = -1;
									local29 += arg0[local151].method7508();
									if (local23 < local29) {
										return local34 + "...";
									}
									local34 = arg2.substring(0, local36 + 1);
								} catch (@Pc(188) Exception local188) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local25 == -1) {
					local29 += this.aByteArray103[Static621.method8722(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray27 != null && local27 != -1) {
						local29 += this.aByteArrayArray27[local27][local41];
					}
					local27 = local41;
					@Pc(230) int local230 = local29;
					if (this.aByteArrayArray27 != null) {
						local230 = local29 + this.aByteArrayArray27[local41][46];
					}
					if (local230 > local23) {
						return local34 + "...";
					}
					local34 = arg2.substring(0, local36 + 1);
				}
			}
		}
		return arg2;
	}
}
