import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class14 {

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public final int anInt356;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	public final int anInt360;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	public final int anInt363;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([B)V")
	public Class14(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(arg0);
		@Pc(12) int local12 = local8.method5539();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method5539() == 1;
		this.aByteArray5 = new byte[256];
		local8.method5540(256, this.aByteArray5);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method5539();
			}
			@Pc(73) int[] local73 = new int[256];
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local73[local75] = local8.method5539();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local54[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method5600();
					local92[local94][local107] = local105;
				}
			}
			@Pc(142) byte[][] local142 = new byte[256][];
			@Pc(157) int local157;
			for (local107 = 0; local107 < 256; local107++) {
				local142[local107] = new byte[local54[local107]];
				@Pc(155) byte local155 = 0;
				for (local157 = 0; local157 < local142[local107].length; local157++) {
					local155 += local8.method5600();
					local142[local107][local157] = local155;
				}
			}
			this.aByteArrayArray1 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local157 = 0; local157 < 256; local157++) {
						if (local157 != 32 && local157 != 160) {
							this.aByteArrayArray1[local190][local157] = (byte) Static291.method3607(local54, local73, local190, local92, local157, local142, this.aByteArray5);
						}
					}
				}
			}
			this.anInt356 = local54[32] + local73[32];
		} else {
			this.anInt356 = local8.method5539();
		}
		local8.method5539();
		local8.method5539();
		this.anInt360 = local8.method5539();
		this.anInt363 = local8.method5539();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I")
	public int method277(@OriginalArg(1) int arg0) {
		return this.aByteArray5[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lclient!o;[ILjava/lang/String;[Ljava/lang/String;I)I")
	public int method278(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(30) byte local30 = 0;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg2.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(51) int local51 = Static318.method3932(arg2.charAt(local41)) & 0xFF;
			@Pc(53) int local53 = 0;
			if (local51 == 60) {
				local32 = local41;
			} else {
				@Pc(67) int local67;
				if (local32 == -1) {
					local67 = local41;
					local53 = this.method277(local51);
					if (this.aByteArrayArray1 != null && local34 != -1) {
						local53 += this.aByteArrayArray1[local34][local51];
					}
					local34 = local51;
				} else {
					if (local51 != 62) {
						continue;
					}
					local67 = local32;
					@Pc(107) String local107 = arg2.substring(local32 + 1, local41);
					local32 = -1;
					if (local107.equals("br")) {
						arg3[local36] = arg2.substring(local24, local41 + 1);
						local36++;
						if (arg3.length <= local36) {
							return 0;
						}
						local26 = -1;
						local22 = 0;
						local34 = -1;
						local24 = local41 + 1;
						continue;
					}
					if (local107.equals("lt")) {
						local53 = this.method277(60);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][60];
						}
						local34 = 60;
					} else if (local107.equals("gt")) {
						local53 = this.method277(62);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][62];
						}
						local34 = 62;
					} else if (local107.equals("nbsp")) {
						local53 = this.method277(160);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][160];
						}
						local34 = 160;
					} else if (local107.equals("shy")) {
						local53 = this.method277(173);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][173];
						}
						local34 = 173;
					} else if (local107.equals("times")) {
						local53 = this.method277(215);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][215];
						}
						local34 = 215;
					} else if (local107.equals("euro")) {
						local53 = this.method277(8364);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][8364];
						}
						local34 = 8364;
					} else if (local107.equals("copy")) {
						local53 = this.method277(169);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][169];
						}
						local34 = 169;
					} else if (local107.equals("reg")) {
						local53 = this.method277(174);
						if (this.aByteArrayArray1 != null && local34 != -1) {
							local53 += this.aByteArrayArray1[local34][174];
						}
						local34 = 174;
					} else if (local107.startsWith("img=") && arg0 != null) {
						try {
							@Pc(265) int local265 = Static311.method3824(local107.substring(4));
							local34 = -1;
							local53 = arg0[local265].RA();
						} catch (@Pc(276) Exception local276) {
						}
					}
					local51 = -1;
				}
				if (local53 > 0) {
					local22 += local53;
					if (arg1 != null) {
						if (local51 == 32) {
							local30 = 1;
							local28 = local22;
							local26 = local41;
						}
						if (arg1[local36 >= arg1.length ? arg1.length - 1 : local36] < local22) {
							if (local26 >= 0) {
								arg3[local36] = arg2.substring(local24, local26 + 1 - local30);
								local36++;
								if (local36 >= arg3.length) {
									return 0;
								}
								local24 = local26 + 1;
								local22 -= local28;
								local34 = -1;
								local26 = -1;
							} else {
								arg3[local36] = arg2.substring(local24, local67);
								local36++;
								if (arg3.length <= local36) {
									return 0;
								}
								local22 = local53;
								local26 = -1;
								local24 = local67;
								local34 = -1;
							}
						}
						if (local51 == 45) {
							local30 = 0;
							local28 = local22;
							local26 = local41;
						}
					}
				}
			}
		}
		if (local24 < arg2.length()) {
			arg3[local36] = arg2.substring(local24, arg2.length());
			local36++;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIC)I")
	public int method279(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!o;I)I")
	public int method280(@OriginalArg(0) String arg0, @OriginalArg(3) Class49[] arg1) {
		@Pc(4) int local4 = this.anInt356;
		@Pc(26) int local26 = this.method278(arg1, new int[] { 100 }, arg0, Static458.aStringArray47);
		@Pc(32) int local32 = local4 * (local26 - 1);
		return this.anInt360 + local32 + this.anInt363;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[Lclient!o;Ljava/lang/String;)I")
	public int method282(@OriginalArg(1) Class49[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) char local26 = arg1.charAt(local20);
			if (local26 == '<') {
				local11 = local20;
			} else {
				if (local26 == '>' && local11 != -1) {
					@Pc(47) String local47 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local47.equals("lt")) {
						local26 = '<';
					} else if (local47.equals("gt")) {
						local26 = '>';
					} else if (local47.equals("nbsp")) {
						local26 = ' ';
					} else if (local47.equals("shy")) {
						local26 = '\u00ad';
					} else if (local47.equals("times")) {
						local26 = '×';
					} else if (local47.equals("euro")) {
						local26 = '€';
					} else if (local47.equals("copy")) {
						local26 = '©';
					} else {
						if (!local47.equals("reg")) {
							if (local47.startsWith("img=") && arg0 != null) {
								try {
									@Pc(101) int local101 = Static311.method3824(local47.substring(4));
									local15 += arg0[local101].RA();
									local13 = -1;
								} catch (@Pc(112) Exception local112) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray5[Static318.method3932(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local13 != -1) {
						local15 += this.aByteArrayArray1[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;[Lclient!o;B)I")
	public int method284(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class49[] arg2) {
		return this.method278(arg2, new int[] { arg0 }, arg1, Static458.aStringArray47);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!o;)I")
	public int method285(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class49[] arg2) {
		@Pc(18) int local18 = this.method278(arg2, new int[] { arg0 }, arg1, Static458.aStringArray47);
		@Pc(20) int local20 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method282(arg2, Static458.aStringArray47[local27]);
			if (local20 < local37) {
				local20 = local37;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method286(@OriginalArg(0) String arg0) {
		return this.method282(null, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!o;I)Ljava/lang/String;")
	public String method287(@OriginalArg(0) String arg0, @OriginalArg(2) Class49[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method282(arg1, arg0)) {
			return arg0;
		}
		@Pc(22) int local22 = arg2 - this.method282(null, "...");
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg0.length();
		@Pc(41) String local41 = "";
		for (@Pc(43) int local43 = 0; local43 < local39; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local24 = local43;
			} else {
				if (local49 == '>' && local24 != -1) {
					@Pc(70) String local70 = arg0.substring(local24 + 1, local43);
					local24 = -1;
					if (local70.equals("lt")) {
						local49 = '<';
					} else if (local70.equals("gt")) {
						local49 = '>';
					} else if (local70.equals("nbsp")) {
						local49 = ' ';
					} else if (local70.equals("shy")) {
						local49 = '\u00ad';
					} else if (local70.equals("times")) {
						local49 = '×';
					} else if (local70.equals("euro")) {
						local49 = '€';
					} else if (local70.equals("copy")) {
						local49 = '©';
					} else {
						if (!local70.equals("reg")) {
							if (local70.startsWith("img=") && arg1 != null) {
								try {
									@Pc(128) int local128 = Static311.method3824(local70.substring(4));
									local36 += arg1[local128].RA();
									local26 = -1;
									if (local22 < local36) {
										return local41 + "...";
									}
									local41 = arg0.substring(0, local43 + 1);
								} catch (@Pc(158) Exception local158) {
								}
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local24 == -1) {
					local36 += this.aByteArray5[Static318.method3932(local49) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local26 != -1) {
						local36 += this.aByteArrayArray1[local26][local49];
					}
					local26 = local49;
					@Pc(215) int local215 = local36;
					if (this.aByteArrayArray1 != null) {
						local215 = local36 + this.aByteArrayArray1[local49][46];
					}
					if (local215 > local22) {
						return local41 + "...";
					}
					local41 = arg0.substring(0, local43 + 1);
				}
			}
		}
		return arg0;
	}
}
