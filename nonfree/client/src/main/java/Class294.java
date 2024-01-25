import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class294 {

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "[B")
	private final byte[] aByteArray80;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public final int anInt8122;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public final int anInt8114;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public final int anInt8124;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
	public Class294(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg0);
		@Pc(12) int local12 = local8.method4325();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method4325() == 1;
		this.aByteArray80 = new byte[256];
		local8.method4346(this.aByteArray80, 256);
		if (local33) {
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local49[local51] = local8.method4325();
			}
			@Pc(66) int[] local66 = new int[256];
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local66[local68] = local8.method4325();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local49[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method4304();
					local85[local87][local100] = local98;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local100 = 0; local100 < 256; local100++) {
				local133[local100] = new byte[local49[local100]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local100].length; local148++) {
					local146 += local8.method4304();
					local133[local100][local148] = local146;
				}
			}
			this.aByteArrayArray31 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray31[local181][local148] = (byte) Static331.method5071(local85, this.aByteArray80, local66, local133, local49, local148, local181);
						}
					}
				}
			}
			this.anInt8122 = local49[32] + local66[32];
		} else {
			this.anInt8122 = local8.method4325();
		}
		local8.method4325();
		local8.method4325();
		this.anInt8114 = local8.method4325();
		this.anInt8124 = local8.method4325();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)I")
	public int method6717(@OriginalArg(0) int arg0) {
		return this.aByteArray80[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method6718(@OriginalArg(1) String arg0) {
		return this.method6720(null, arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B[Lclient!f;Ljava/lang/String;I)Ljava/lang/String;")
	public String method6719(@OriginalArg(1) Class39[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.method6720(arg0, arg1) <= arg2) {
			return arg1;
		}
		@Pc(22) int local22 = arg2 - this.method6720(null, "...");
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		@Pc(33) String local33 = "";
		for (@Pc(45) int local45 = 0; local45 < local31; local45++) {
			@Pc(51) char local51 = arg1.charAt(local45);
			if (local51 == '<') {
				local24 = local45;
			} else {
				if (local51 == '>' && local24 != -1) {
					@Pc(73) String local73 = arg1.substring(local24 + 1, local45);
					local24 = -1;
					if (local73.equals("lt")) {
						local51 = '<';
					} else if (local73.equals("gt")) {
						local51 = '>';
					} else if (local73.equals("nbsp")) {
						local51 = ' ';
					} else if (local73.equals("shy")) {
						local51 = '\u00ad';
					} else if (local73.equals("times")) {
						local51 = '×';
					} else if (local73.equals("euro")) {
						local51 = '€';
					} else if (local73.equals("copy")) {
						local51 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=") && arg0 != null) {
								try {
									@Pc(135) int local135 = Static158.method2594(local73.substring(4));
									local28 += arg0[local135].A();
									local26 = -1;
									if (local28 > local22) {
										return local33 + "...";
									}
									local33 = arg1.substring(0, local45 + 1);
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local51 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray80[Static396.method4002(local51) & 0xFF] & 0xFF;
					if (this.aByteArrayArray31 != null && local26 != -1) {
						local28 += this.aByteArrayArray31[local26][local51];
					}
					local26 = local51;
					@Pc(218) int local218 = local28;
					if (this.aByteArrayArray31 != null) {
						local218 = local28 + this.aByteArrayArray31[local51][46];
					}
					if (local218 > local22) {
						return local33 + "...";
					}
					local33 = arg1.substring(0, local45 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;I)I")
	public int method6720(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg1.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(53) String local53 = arg1.substring(local11 + 1, local26);
					local11 = -1;
					if (local53.equals("lt")) {
						local32 = '<';
					} else if (local53.equals("gt")) {
						local32 = '>';
					} else if (local53.equals("nbsp")) {
						local32 = ' ';
					} else if (local53.equals("shy")) {
						local32 = '\u00ad';
					} else if (local53.equals("times")) {
						local32 = '×';
					} else if (local53.equals("euro")) {
						local32 = '€';
					} else if (local53.equals("copy")) {
						local32 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg0 != null) {
								try {
									@Pc(127) int local127 = Static158.method2594(local53.substring(4));
									local21 += arg0[local127].A();
									local13 = -1;
								} catch (@Pc(138) Exception local138) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local21 += this.aByteArray80[Static396.method4002(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray31 != null && local13 != -1) {
						local21 += this.aByteArrayArray31[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;I[I[Lclient!f;)I")
	public int method6721(@OriginalArg(0) String arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class39[] arg3) {
		if (arg0 == null) {
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
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static396.method4002(arg0.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(57) int local57;
				if (local21 == -1) {
					local57 = local30;
					local42 = this.method6717(local40);
					if (this.aByteArrayArray31 != null && local23 != -1) {
						local42 += this.aByteArrayArray31[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local57 = local21;
					@Pc(96) String local96 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					if (local96.equals("br")) {
						arg1[local25] = arg0.substring(local13, local30 + 1);
						local25++;
						if (local25 >= arg1.length) {
							return 0;
						}
						local23 = -1;
						local13 = local30 + 1;
						local11 = 0;
						local15 = -1;
						continue;
					}
					if (local96.equals("lt")) {
						local42 = this.method6717(60);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][60];
						}
						local23 = 60;
					} else if (local96.equals("gt")) {
						local42 = this.method6717(62);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][62];
						}
						local23 = 62;
					} else if (local96.equals("nbsp")) {
						local42 = this.method6717(160);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][160];
						}
						local23 = 160;
					} else if (local96.equals("shy")) {
						local42 = this.method6717(173);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][173];
						}
						local23 = 173;
					} else if (local96.equals("times")) {
						local42 = this.method6717(215);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][215];
						}
						local23 = 215;
					} else if (local96.equals("euro")) {
						local42 = this.method6717(8364);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][8364];
						}
						local23 = 8364;
					} else if (local96.equals("copy")) {
						local42 = this.method6717(169);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][169];
						}
						local23 = 169;
					} else if (local96.equals("reg")) {
						local42 = this.method6717(174);
						if (this.aByteArrayArray31 != null && local23 != -1) {
							local42 += this.aByteArrayArray31[local23][174];
						}
						local23 = 174;
					} else if (local96.startsWith("img=") && arg3 != null) {
						try {
							@Pc(201) int local201 = Static158.method2594(local96.substring(4));
							local42 = arg3[local201].A();
							local23 = -1;
						} catch (@Pc(212) Exception local212) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg2 != null) {
						if (local40 == 32) {
							local15 = local30;
							local17 = local11;
							local19 = 1;
						}
						if (local11 > arg2[arg2.length <= local25 ? arg2.length - 1 : local25]) {
							if (local15 >= 0) {
								arg1[local25] = arg0.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local23 = -1;
								local15 = -1;
							} else {
								arg1[local25] = arg0.substring(local13, local57);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local23 = -1;
								local13 = local57;
								local15 = -1;
								local11 = local42;
							}
						}
						if (local40 == 45) {
							local17 = local11;
							local19 = 0;
							local15 = local30;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg1[local25] = arg0.substring(local13, arg0.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;II)I")
	public int method6722(@OriginalArg(0) String arg0, @OriginalArg(1) Class39[] arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = this.method6721(arg0, Static410.aStringArray134, new int[] { arg2 }, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method6720(arg1, Static410.aStringArray134[local30]);
			if (local40 > local20) {
				local20 = local40;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;[Lclient!f;I)I")
	public int method6726(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class39[] arg2) {
		return this.method6721(arg1, Static410.aStringArray134, new int[] { arg0 }, arg2);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjava/lang/String;B[Lclient!f;)I")
	public int method6727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class39[] arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt8122;
		}
		@Pc(29) int local29 = this.method6721(arg2, Static410.aStringArray134, new int[] { arg0 }, arg3);
		@Pc(35) int local35 = arg1 * (local29 - 1);
		return this.anInt8124 + this.anInt8114 + local35;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ICI)I")
	public int method6728(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray31 == null ? 0 : this.aByteArrayArray31[arg1][arg0];
	}
}
