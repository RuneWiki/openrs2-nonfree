import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class38 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	public final int anInt1353;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public final int anInt1347;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	public final int anInt1355;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "([B)V")
	public Class38(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(arg0);
		@Pc(12) int local12 = local8.method3141();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method3141() == 1;
		this.aByteArray20 = new byte[256];
		local8.method3139(this.aByteArray20, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method3141();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local49[local65] = local8.method3141();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method3130();
					local82[local84][local97] = local95;
				}
			}
			@Pc(132) byte[][] local132 = new byte[256][];
			@Pc(147) int local147;
			for (local97 = 0; local97 < 256; local97++) {
				local132[local97] = new byte[local46[local97]];
				@Pc(145) byte local145 = 0;
				for (local147 = 0; local147 < local132[local97].length; local147++) {
					local145 += local8.method3130();
					local132[local97][local147] = local145;
				}
			}
			this.aByteArrayArray5 = new byte[256][256];
			for (@Pc(184) int local184 = 0; local184 < 256; local184++) {
				if (local184 != 32 && local184 != 160) {
					for (local147 = 0; local147 < 256; local147++) {
						if (local147 != 32 && local147 != 160) {
							this.aByteArrayArray5[local184][local147] = (byte) Static43.method2811(local49, local147, local82, local132, local46, this.aByteArray20, local184);
						}
					}
				}
			}
			this.anInt1353 = local49[32] + local46[32];
		} else {
			this.anInt1353 = local8.method3141();
		}
		local8.method3141();
		local8.method3141();
		this.anInt1347 = local8.method3141();
		this.anInt1355 = local8.method3141();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([Lclient!lf;Ljava/lang/String;I)I")
	public int method1307(@OriginalArg(0) Class90[] arg0, @OriginalArg(1) String arg1) {
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
									@Pc(115) int local115 = Static280.method4822(local47.substring(4));
									local13 = -1;
									local15 += arg0[local115].method5464();
								} catch (@Pc(126) Exception local126) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray20[Static191.method3006(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local13 != -1) {
						local15 += this.aByteArrayArray5[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)I")
	public int method1308(@OriginalArg(1) int arg0) {
		return this.aByteArray20[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([Lclient!lf;ILjava/lang/String;B)I")
	public int method1309(@OriginalArg(0) Class90[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(24) int local24 = this.method1314(new int[] { arg1 }, arg0, Static196.aStringArray28, arg2);
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(38) int local38 = this.method1307(arg0, Static196.aStringArray28[local28]);
			if (local38 > local26) {
				local26 = local38;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;[Lclient!lf;II)I")
	public int method1310(@OriginalArg(1) String arg0, @OriginalArg(2) Class90[] arg1) {
		@Pc(9) int local9 = this.anInt1353;
		@Pc(22) int local22 = this.method1314(new int[] { 100 }, arg1, Static196.aStringArray28, arg0);
		@Pc(28) int local28 = (local22 - 1) * local9;
		return local28 + this.anInt1347 + this.anInt1355;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([Lclient!lf;ZILjava/lang/String;)I")
	public int method1311(@OriginalArg(0) Class90[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method1314(new int[] { arg1 }, arg0, Static196.aStringArray28, arg2);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[I[Lclient!lf;[Ljava/lang/String;Ljava/lang/String;)I")
	public int method1314(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class90[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(27) byte local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg3.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static191.method3006(arg3.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local29 = local38;
			} else {
				@Pc(66) int local66;
				if (local29 == -1) {
					local66 = local38;
					local50 = this.method1308(local48);
					if (this.aByteArrayArray5 != null && local31 != -1) {
						local50 += this.aByteArrayArray5[local31][local48];
					}
					local31 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local66 = local29;
					@Pc(73) String local73 = arg3.substring(local29 + 1, local38);
					local29 = -1;
					if (local73.equals("br")) {
						arg2[local33] = arg3.substring(local21, local38 + 1);
						local33++;
						if (local33 >= arg2.length) {
							return 0;
						}
						local11 = 0;
						local21 = local38 + 1;
						local31 = -1;
						local23 = -1;
						continue;
					}
					if (local73.equals("lt")) {
						local50 = this.method1308(60);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][60];
						}
						local31 = 60;
					} else if (local73.equals("gt")) {
						local50 = this.method1308(62);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][62];
						}
						local31 = 62;
					} else if (local73.equals("nbsp")) {
						local50 = this.method1308(160);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][160];
						}
						local31 = 160;
					} else if (local73.equals("shy")) {
						local50 = this.method1308(173);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][173];
						}
						local31 = 173;
					} else if (local73.equals("times")) {
						local50 = this.method1308(215);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][215];
						}
						local31 = 215;
					} else if (local73.equals("euro")) {
						local50 = this.method1308(8364);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][8364];
						}
						local31 = 8364;
					} else if (local73.equals("copy")) {
						local50 = this.method1308(169);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][169];
						}
						local31 = 169;
					} else if (local73.equals("reg")) {
						local50 = this.method1308(174);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][174];
						}
						local31 = 174;
					} else if (local73.startsWith("img=") && arg1 != null) {
						try {
							@Pc(256) int local256 = Static280.method4822(local73.substring(4));
							local50 = arg1[local256].method5464();
							local31 = -1;
						} catch (@Pc(267) Exception local267) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg0 != null) {
						if (local48 == 32) {
							local23 = local38;
							local27 = 1;
							local25 = local11;
						}
						if (local11 > arg0[local33 < arg0.length ? local33 : arg0.length - 1]) {
							if (local23 >= 0) {
								arg2[local33] = arg3.substring(local21, local23 + 1 - local27);
								local33++;
								if (arg2.length <= local33) {
									return 0;
								}
								local21 = local23 + 1;
								local11 -= local25;
								local23 = -1;
								local31 = -1;
							} else {
								arg2[local33] = arg3.substring(local21, local66);
								local33++;
								if (local33 >= arg2.length) {
									return 0;
								}
								local11 = local50;
								local31 = -1;
								local21 = local66;
								local23 = -1;
							}
						}
						if (local48 == 45) {
							local27 = 0;
							local25 = local11;
							local23 = local38;
						}
					}
				}
			}
		}
		if (arg3.length() > local21) {
			arg2[local33] = arg3.substring(local21, arg3.length());
			local33++;
		}
		return local33;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZCI)I")
	public int method1315(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray5 == null ? 0 : this.aByteArrayArray5[arg1][arg0];
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method1316(@OriginalArg(1) String arg0) {
		return this.method1307(null, arg0);
	}
}
