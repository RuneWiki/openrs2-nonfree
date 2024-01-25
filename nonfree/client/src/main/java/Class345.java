import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class345 {

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "[B")
	private final byte[] aByteArray103;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray161;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	public final int anInt10004;

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
	public final int anInt10013;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
	public final int anInt10003;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([B)V")
	public Class345(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class8_Sub8 local8 = new Class8_Sub8(arg0);
		@Pc(12) int local12 = local8.method8525();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method8525() == 1;
		this.aByteArray103 = new byte[256];
		local8.method8563(0, this.aByteArray103, 256);
		if (local33) {
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local49[local51] = local8.method8525();
			}
			@Pc(68) int[] local68 = new int[256];
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local68[local70] = local8.method8525();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local49[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method8550();
					local85[local87][local100] = local98;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local100 = 0; local100 < 256; local100++) {
				local131[local100] = new byte[local49[local100]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local100].length; local146++) {
					local144 += local8.method8550();
					local131[local100][local146] = local144;
				}
			}
			this.aByteArrayArray161 = new byte[256][256];
			for (@Pc(179) int local179 = 0; local179 < 256; local179++) {
				if (local179 != 32 && local179 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray161[local179][local146] = (byte) Static500.method7265(local146, local49, local179, local131, local85, this.aByteArray103, local68);
						}
					}
				}
			}
			this.anInt10004 = local68[32] + local49[32];
		} else {
			this.anInt10004 = local8.method8525();
		}
		local8.method8525();
		local8.method8525();
		this.anInt10013 = local8.method8525();
		this.anInt10003 = local8.method8525();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lclient!hu;Ljava/lang/String;II)I")
	public int method8111(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		return this.method8117(Static192.aStringArray9, arg1, new int[] { arg2 }, arg0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method8112(@OriginalArg(1) String arg0) {
		return this.method8114(arg0, null);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIB)I")
	public int method8113(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray161 == null ? 0 : this.aByteArrayArray161[arg1][arg0];
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;[Lclient!hu;)I")
	public int method8114(@OriginalArg(1) String arg0, @OriginalArg(2) Class21[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(52) String local52 = arg0.substring(local11 + 1, local25);
					local11 = -1;
					if (local52.equals("lt")) {
						local31 = '<';
					} else if (local52.equals("gt")) {
						local31 = '>';
					} else if (local52.equals("nbsp")) {
						local31 = ' ';
					} else if (local52.equals("shy")) {
						local31 = '\u00ad';
					} else if (local52.equals("times")) {
						local31 = '×';
					} else if (local52.equals("euro")) {
						local31 = '€';
					} else if (local52.equals("copy")) {
						local31 = '©';
					} else {
						if (!local52.equals("reg")) {
							if (local52.startsWith("img=") && arg1 != null) {
								try {
									@Pc(108) int local108 = Static82.method2080(local52.substring(4));
									local15 += arg1[local108].method5779();
									local13 = -1;
								} catch (@Pc(119) Exception local119) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray103[Static418.method6566(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray161 != null && local13 != -1) {
						local15 += this.aByteArrayArray161[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lclient!hu;Ljava/lang/String;BI)Ljava/lang/String;")
	public String method8115(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (this.method8114(arg1, arg0) <= arg2) {
			return arg1;
		}
		@Pc(34) int local34 = arg2 - this.method8114("...", null);
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
					@Pc(73) String local73 = arg1.substring(local36 + 1, local47);
					local36 = -1;
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
									@Pc(141) int local141 = Static82.method2080(local73.substring(4));
									local38 = -1;
									local40 += arg0[local141].method5779();
									if (local34 < local40) {
										return local45 + "...";
									}
									local45 = arg1.substring(0, local47 + 1);
								} catch (@Pc(175) Exception local175) {
								}
							}
							continue;
						}
						local53 = '®';
					}
				}
				if (local36 == -1) {
					local40 += this.aByteArray103[Static418.method6566(local53) & 0xFF] & 0xFF;
					if (this.aByteArrayArray161 != null && local38 != -1) {
						local40 += this.aByteArrayArray161[local38][local53];
					}
					local38 = local53;
					@Pc(223) int local223 = local40;
					if (this.aByteArrayArray161 != null) {
						local223 = local40 + this.aByteArrayArray161[local53][46];
					}
					if (local34 < local223) {
						return local45 + "...";
					}
					local45 = arg1.substring(0, local47 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lclient!hu;BLjava/lang/String;I)I")
	public int method8116(@OriginalArg(0) Class21[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = this.method8117(Static192.aStringArray9, arg1, new int[] { arg2 }, arg0);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method8114(Static192.aStringArray9[local30], arg0);
			if (local28 < local40) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[I[Lclient!hu;I)I")
	public int method8117(@OriginalArg(0) String[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class21[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(27) byte local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg1.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static418.method6566(arg1.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local29 = local38;
			} else {
				@Pc(67) int local67;
				if (local29 == -1) {
					local50 = this.method8119(local48);
					local67 = local38;
					if (this.aByteArrayArray161 != null && local31 != -1) {
						local50 += this.aByteArrayArray161[local31][local48];
					}
					local31 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local67 = local29;
					@Pc(74) String local74 = arg1.substring(local29 + 1, local38);
					local29 = -1;
					if (local74.equals("br")) {
						arg0[local33] = arg1.substring(local13, local38 + 1);
						local33++;
						if (arg0.length <= local33) {
							return 0;
						}
						local11 = 0;
						local15 = -1;
						local13 = local38 + 1;
						local31 = -1;
						continue;
					}
					if (local74.equals("lt")) {
						local50 = this.method8119(60);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][60];
						}
						local31 = 60;
					} else if (local74.equals("gt")) {
						local50 = this.method8119(62);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][62];
						}
						local31 = 62;
					} else if (local74.equals("nbsp")) {
						local50 = this.method8119(160);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][160];
						}
						local31 = 160;
					} else if (local74.equals("shy")) {
						local50 = this.method8119(173);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][173];
						}
						local31 = 173;
					} else if (local74.equals("times")) {
						local50 = this.method8119(215);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][215];
						}
						local31 = 215;
					} else if (local74.equals("euro")) {
						local50 = this.method8119(8364);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][8364];
						}
						local31 = 8364;
					} else if (local74.equals("copy")) {
						local50 = this.method8119(169);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][169];
						}
						local31 = 169;
					} else if (local74.equals("reg")) {
						local50 = this.method8119(174);
						if (this.aByteArrayArray161 != null && local31 != -1) {
							local50 += this.aByteArrayArray161[local31][174];
						}
						local31 = 174;
					} else if (local74.startsWith("img=") && arg3 != null) {
						try {
							@Pc(284) int local284 = Static82.method2080(local74.substring(4));
							local31 = -1;
							local50 = arg3[local284].method5779();
						} catch (@Pc(295) Exception local295) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg2 != null) {
						if (local48 == 32) {
							local27 = 1;
							local15 = local38;
							local17 = local11;
						}
						if (local11 > arg2[arg2.length > local33 ? local33 : arg2.length - 1]) {
							if (local15 < 0) {
								arg0[local33] = arg1.substring(local13, local67);
								local33++;
								if (local33 >= arg0.length) {
									return 0;
								}
								local15 = -1;
								local13 = local67;
								local11 = local50;
								local31 = -1;
							} else {
								arg0[local33] = arg1.substring(local13, local15 + 1 - local27);
								local33++;
								if (local33 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local17;
								local31 = -1;
							}
						}
						if (local48 == 45) {
							local27 = 0;
							local17 = local11;
							local15 = local38;
						}
					}
				}
			}
		}
		if (local13 < arg1.length()) {
			arg0[local33] = arg1.substring(local13, arg1.length());
			local33++;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!hu;)I")
	public int method8118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class21[] arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt10004;
		}
		@Pc(24) int local24 = this.method8117(Static192.aStringArray9, arg2, new int[] { arg0 }, arg3);
		@Pc(30) int local30 = (local24 - 1) * arg1;
		return local30 + this.anInt10013 + this.anInt10003;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)I")
	public int method8119(@OriginalArg(1) int arg0) {
		return this.aByteArray103[arg0] & 0xFF;
	}
}
