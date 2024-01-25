import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class334 {

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "[B")
	private final byte[] aByteArray96;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
	public final int anInt9012;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
	public final int anInt9005;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
	public final int anInt9008;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "([B)V")
	public Class334(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub35 local8 = new Class1_Sub35(arg0);
		@Pc(12) int local12 = local8.method5750();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method5750() == 1;
		this.aByteArray96 = new byte[256];
		local8.method5800(this.aByteArray96, 256);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local56[local58] = local8.method5750();
			}
			@Pc(73) int[] local73 = new int[256];
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local73[local75] = local8.method5750();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local56[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method5751();
					local92[local94][local107] = local105;
				}
			}
			@Pc(140) byte[][] local140 = new byte[256][];
			@Pc(155) int local155;
			for (local107 = 0; local107 < 256; local107++) {
				local140[local107] = new byte[local56[local107]];
				@Pc(153) byte local153 = 0;
				for (local155 = 0; local155 < local140[local107].length; local155++) {
					local153 += local8.method5751();
					local140[local107][local155] = local153;
				}
			}
			this.aByteArrayArray33 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local155 = 0; local155 < 256; local155++) {
						if (local155 != 32 && local155 != 160) {
							this.aByteArrayArray33[local190][local155] = (byte) Static299.method4181(local56, local140, this.aByteArray96, local92, local73, local190, local155);
						}
					}
				}
			}
			this.anInt9012 = local73[32] + local56[32];
		} else {
			this.anInt9012 = local8.method5750();
		}
		local8.method5750();
		local8.method5750();
		this.anInt9005 = local8.method5750();
		this.anInt9008 = local8.method5750();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;IBI)I")
	public int method7351(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt9012;
		}
		@Pc(21) int local21 = this.method7357(new int[] { arg2 }, arg0, arg1, Static265.aStringArray23);
		@Pc(27) int local27 = (local21 - 1) * arg3;
		return this.anInt9008 + local27 + this.anInt9005;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;IZ)I")
	public int method7352(@OriginalArg(0) String arg0, @OriginalArg(1) Class22[] arg1, @OriginalArg(2) int arg2) {
		@Pc(22) int local22 = this.method7357(new int[] { arg2 }, arg1, arg0, Static265.aStringArray23);
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local22; local26++) {
			@Pc(36) int local36 = this.method7358(arg1, Static265.aStringArray23[local26]);
			if (local24 < local36) {
				local24 = local36;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIC)I")
	public int method7353(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray33 == null ? 0 : this.aByteArrayArray33[arg0][arg1];
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method7354(@OriginalArg(1) String arg0) {
		return this.method7358(null, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z[I[Lclient!f;Ljava/lang/String;[Ljava/lang/String;)I")
	public int method7357(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class22[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String[] arg3) {
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
		for (@Pc(38) int local38 = 0; local38 < local28; local38++) {
			@Pc(48) int local48 = Static514.method7147(arg2.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local21 = local38;
			} else {
				@Pc(68) int local68;
				if (local21 == -1) {
					local68 = local38;
					local50 = this.method7360(local48);
					if (this.aByteArrayArray33 != null && local23 != -1) {
						local50 += this.aByteArrayArray33[local23][local48];
					}
					local23 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local68 = local21;
					@Pc(75) String local75 = arg2.substring(local21 + 1, local38);
					local21 = -1;
					if (local75.equals("br")) {
						arg3[local25] = arg2.substring(local13, local38 + 1);
						local25++;
						if (local25 >= arg3.length) {
							return 0;
						}
						local11 = 0;
						local13 = local38 + 1;
						local23 = -1;
						local15 = -1;
						continue;
					}
					if (local75.equals("lt")) {
						local50 = this.method7360(60);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][60];
						}
						local23 = 60;
					} else if (local75.equals("gt")) {
						local50 = this.method7360(62);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][62];
						}
						local23 = 62;
					} else if (local75.equals("nbsp")) {
						local50 = this.method7360(160);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][160];
						}
						local23 = 160;
					} else if (local75.equals("shy")) {
						local50 = this.method7360(173);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][173];
						}
						local23 = 173;
					} else if (local75.equals("times")) {
						local50 = this.method7360(215);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][215];
						}
						local23 = 215;
					} else if (local75.equals("euro")) {
						local50 = this.method7360(8364);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][8364];
						}
						local23 = 8364;
					} else if (local75.equals("copy")) {
						local50 = this.method7360(169);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][169];
						}
						local23 = 169;
					} else if (local75.equals("reg")) {
						local50 = this.method7360(174);
						if (this.aByteArrayArray33 != null && local23 != -1) {
							local50 += this.aByteArrayArray33[local23][174];
						}
						local23 = 174;
					} else if (local75.startsWith("img=") && arg1 != null) {
						try {
							@Pc(231) int local231 = Static21.method7701(local75.substring(4));
							local23 = -1;
							local50 = arg1[local231].A();
						} catch (@Pc(242) Exception local242) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg0 != null) {
						if (local48 == 32) {
							local19 = 1;
							local15 = local38;
							local17 = local11;
						}
						if (local11 > arg0[local25 >= arg0.length ? arg0.length - 1 : local25]) {
							if (local15 >= 0) {
								arg3[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg3.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local17;
								local23 = -1;
							} else {
								arg3[local25] = arg2.substring(local13, local68);
								local25++;
								if (local25 >= arg3.length) {
									return 0;
								}
								local15 = -1;
								local23 = -1;
								local13 = local68;
								local11 = local50;
							}
						}
						if (local48 == 45) {
							local17 = local11;
							local19 = 0;
							local15 = local38;
						}
					}
				}
			}
		}
		if (arg2.length() > local13) {
			arg3[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;)I")
	public int method7358(@OriginalArg(1) Class22[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg1.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg1.substring(local11 + 1, local26);
					local11 = -1;
					if (local54.equals("lt")) {
						local32 = '<';
					} else if (local54.equals("gt")) {
						local32 = '>';
					} else if (local54.equals("nbsp")) {
						local32 = ' ';
					} else if (local54.equals("shy")) {
						local32 = '\u00ad';
					} else if (local54.equals("times")) {
						local32 = '×';
					} else if (local54.equals("euro")) {
						local32 = '€';
					} else if (local54.equals("copy")) {
						local32 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg0 != null) {
								try {
									@Pc(116) int local116 = Static21.method7701(local54.substring(4));
									local21 += arg0[local116].A();
									local19 = -1;
								} catch (@Pc(127) Exception local127) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local21 += this.aByteArray96[Static514.method7147(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray33 != null && local19 != -1) {
						local21 += this.aByteArrayArray33[local19][local32];
					}
					local19 = local32;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;I)Ljava/lang/String;")
	public String method7359(@OriginalArg(1) Class22[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method7358(arg0, arg1)) {
			return arg1;
		}
		@Pc(22) int local22 = arg2 - this.method7358(null, "...");
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		@Pc(38) String local38 = "";
		for (@Pc(40) int local40 = 0; local40 < local31; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local46 == '<') {
				local24 = local40;
			} else {
				if (local46 == '>' && local24 != -1) {
					@Pc(71) String local71 = arg1.substring(local24 + 1, local40);
					local24 = -1;
					if (local71.equals("lt")) {
						local46 = '<';
					} else if (local71.equals("gt")) {
						local46 = '>';
					} else if (local71.equals("nbsp")) {
						local46 = ' ';
					} else if (local71.equals("shy")) {
						local46 = '\u00ad';
					} else if (local71.equals("times")) {
						local46 = '×';
					} else if (local71.equals("euro")) {
						local46 = '€';
					} else if (local71.equals("copy")) {
						local46 = '©';
					} else {
						if (!local71.equals("reg")) {
							if (local71.startsWith("img=") && arg0 != null) {
								try {
									@Pc(133) int local133 = Static21.method7701(local71.substring(4));
									local26 = -1;
									local28 += arg0[local133].A();
									if (local28 > local22) {
										return local38 + "...";
									}
									local38 = arg1.substring(0, local40 + 1);
								} catch (@Pc(167) Exception local167) {
								}
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray96[Static514.method7147(local46) & 0xFF] & 0xFF;
					if (this.aByteArrayArray33 != null && local26 != -1) {
						local28 += this.aByteArrayArray33[local26][local46];
					}
					local26 = local46;
					@Pc(219) int local219 = local28;
					if (this.aByteArrayArray33 != null) {
						local219 = local28 + this.aByteArrayArray33[local46][46];
					}
					if (local219 > local22) {
						return local38 + "...";
					}
					local38 = arg1.substring(0, local40 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
	public int method7360(@OriginalArg(1) int arg0) {
		return this.aByteArray96[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[Lclient!f;Ljava/lang/String;)I")
	public int method7361(@OriginalArg(0) int arg0, @OriginalArg(2) Class22[] arg1, @OriginalArg(3) String arg2) {
		return this.method7357(new int[] { arg0 }, arg1, arg2, Static265.aStringArray23);
	}
}
