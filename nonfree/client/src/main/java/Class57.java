import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class57 {

	@OriginalMember(owner = "client!du", name = "s", descriptor = "[B")
	private final byte[] aByteArray16;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public final int anInt1599;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public final int anInt1607;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	public final int anInt1596;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "([B)V")
	public Class57(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class7_Sub14 local8 = new Class7_Sub14(arg0);
		@Pc(12) int local12 = local8.method3981();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method3981() == 1;
		this.aByteArray16 = new byte[256];
		local8.method3932(this.aByteArray16, 256);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			@Pc(50) int[] local50 = new int[256];
			for (@Pc(52) int local52 = 0; local52 < 256; local52++) {
				local47[local52] = local8.method3981();
			}
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local50[local66] = local8.method3981();
			}
			@Pc(81) byte[][] local81 = new byte[256][];
			@Pc(96) int local96;
			for (@Pc(83) int local83 = 0; local83 < 256; local83++) {
				local81[local83] = new byte[local47[local83]];
				@Pc(94) byte local94 = 0;
				for (local96 = 0; local96 < local81[local83].length; local96++) {
					local94 += local8.method3930();
					local81[local83][local96] = local94;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local96 = 0; local96 < 256; local96++) {
				local131[local96] = new byte[local47[local96]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local96].length; local146++) {
					local144 += local8.method3930();
					local131[local96][local146] = local144;
				}
			}
			this.aByteArrayArray5 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray5[local181][local146] = (byte) Static33.method457(local146, local131, local47, this.aByteArray16, local181, local81, local50);
						}
					}
				}
			}
			this.anInt1599 = local47[32] + local50[32];
		} else {
			this.anInt1599 = local8.method3981();
		}
		local8.method3981();
		local8.method3981();
		this.anInt1607 = local8.method3981();
		this.anInt1596 = local8.method3981();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B[Lclient!l;Ljava/lang/String;)I")
	public int method1384(@OriginalArg(1) Class11[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
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
									@Pc(112) int local112 = Static259.method3459(local54.substring(4));
									local13 = -1;
									local15 += arg0[local112].j();
								} catch (@Pc(123) Exception local123) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray16[Static20.method1886(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local13 != -1) {
						local15 += this.aByteArrayArray5[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([Lclient!l;ILjava/lang/String;I)Ljava/lang/String;")
	public String method1385(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.method1384(arg0, arg2) <= arg1) {
			return arg2;
		}
		@Pc(22) int local22 = arg1 - this.method1384(null, "...");
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg2.length();
		@Pc(33) String local33 = "";
		for (@Pc(35) int local35 = 0; local35 < local31; local35++) {
			@Pc(41) char local41 = arg2.charAt(local35);
			if (local41 == '<') {
				local24 = local35;
			} else {
				if (local41 == '>' && local24 != -1) {
					@Pc(62) String local62 = arg2.substring(local24 + 1, local35);
					local24 = -1;
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
									@Pc(112) int local112 = Static259.method3459(local62.substring(4));
									local28 += arg0[local112].j();
									local26 = -1;
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg2.substring(0, local35 + 1);
								} catch (@Pc(146) Exception local146) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray16[Static20.method1886(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local26 != -1) {
						local28 += this.aByteArrayArray5[local26][local41];
					}
					local26 = local41;
					@Pc(211) int local211 = local28;
					if (this.aByteArrayArray5 != null) {
						local211 = local28 + this.aByteArrayArray5[local41][46];
					}
					if (local211 > local22) {
						return local33 + "...";
					}
					local33 = arg2.substring(0, local35 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([Lclient!l;Ljava/lang/String;III)I")
	public int method1386(@OriginalArg(0) Class11[] arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = this.anInt1599;
		@Pc(21) int local21 = this.method1389(Static181.aStringArray27, new int[] { 100 }, arg0, arg1);
		@Pc(32) int local32 = local8 * (local21 - 1);
		return this.anInt1596 + local32 + this.anInt1607;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method1387(@OriginalArg(0) String arg0) {
		return this.method1384(null, arg0);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([Ljava/lang/String;[I[Lclient!l;Ljava/lang/String;I)I")
	public int method1389(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class11[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
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
		@Pc(28) int local28 = arg3.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static20.method1886(arg3.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(63) int local63;
				if (local21 == -1) {
					local42 = this.method1391(local40);
					local63 = local30;
					if (this.aByteArrayArray5 != null && local23 != -1) {
						local42 += this.aByteArrayArray5[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local63 = local21;
					@Pc(95) String local95 = arg3.substring(local21 + 1, local30);
					local21 = -1;
					if (local95.equals("br")) {
						arg0[local25] = arg3.substring(local13, local30 + 1);
						local25++;
						if (arg0.length <= local25) {
							return 0;
						}
						local15 = -1;
						local13 = local30 + 1;
						local11 = 0;
						local23 = -1;
						continue;
					}
					if (local95.equals("lt")) {
						local42 = this.method1391(60);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][60];
						}
						local23 = 60;
					} else if (local95.equals("gt")) {
						local42 = this.method1391(62);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][62];
						}
						local23 = 62;
					} else if (local95.equals("nbsp")) {
						local42 = this.method1391(160);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][160];
						}
						local23 = 160;
					} else if (local95.equals("shy")) {
						local42 = this.method1391(173);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][173];
						}
						local23 = 173;
					} else if (local95.equals("times")) {
						local42 = this.method1391(215);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][215];
						}
						local23 = 215;
					} else if (local95.equals("euro")) {
						local42 = this.method1391(8364);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][8364];
						}
						local23 = 8364;
					} else if (local95.equals("copy")) {
						local42 = this.method1391(169);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][169];
						}
						local23 = 169;
					} else if (local95.equals("reg")) {
						local42 = this.method1391(174);
						if (this.aByteArrayArray5 != null && local23 != -1) {
							local42 += this.aByteArrayArray5[local23][174];
						}
						local23 = 174;
					} else if (local95.startsWith("img=") && arg2 != null) {
						try {
							@Pc(279) int local279 = Static259.method3459(local95.substring(4));
							local23 = -1;
							local42 = arg2[local279].j();
						} catch (@Pc(290) Exception local290) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg1 != null) {
						if (local40 == 32) {
							local19 = 1;
							local17 = local11;
							local15 = local30;
						}
						if (arg1[local25 < arg1.length ? local25 : arg1.length - 1] < local11) {
							if (local15 >= 0) {
								arg0[local25] = arg3.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg0.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local15 = -1;
								local11 -= local17;
							} else {
								arg0[local25] = arg3.substring(local13, local63);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local15 = -1;
								local11 = local42;
								local23 = -1;
								local13 = local63;
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
		if (arg3.length() > local13) {
			arg0[local25] = arg3.substring(local13, arg3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II[Lclient!l;Ljava/lang/String;)I")
	public int method1390(@OriginalArg(0) int arg0, @OriginalArg(2) Class11[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method1389(Static181.aStringArray27, new int[] { arg0 }, arg1, arg2);
		@Pc(20) int local20 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method1384(arg1, Static181.aStringArray27[local30]);
			if (local20 < local40) {
				local20 = local40;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)I")
	public int method1391(@OriginalArg(0) int arg0) {
		return this.aByteArray16[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Lclient!l;Ljava/lang/String;B)I")
	public int method1393(@OriginalArg(0) int arg0, @OriginalArg(1) Class11[] arg1, @OriginalArg(2) String arg2) {
		return this.method1389(Static181.aStringArray27, new int[] { arg0 }, arg1, arg2);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(CBI)I")
	public int method1394(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray5 == null ? 0 : this.aByteArrayArray5[arg1][arg0];
	}
}
