import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class106 {

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	public final int anInt3304;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
	public final int anInt3299;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public final int anInt3309;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
	public Class106(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub7 local8 = new Class4_Sub7(arg0);
		@Pc(12) int local12 = local8.method2380();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method2380() == 1;
		this.aByteArray44 = new byte[256];
		local8.method2381(this.aByteArray44, 256);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local47[local49] = local8.method2380();
			}
			@Pc(64) int[] local64 = new int[256];
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local64[local66] = local8.method2380();
			}
			@Pc(83) byte[][] local83 = new byte[256][];
			@Pc(98) int local98;
			for (@Pc(85) int local85 = 0; local85 < 256; local85++) {
				local83[local85] = new byte[local47[local85]];
				@Pc(96) byte local96 = 0;
				for (local98 = 0; local98 < local83[local85].length; local98++) {
					local96 += local8.method2393();
					local83[local85][local98] = local96;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local98 = 0; local98 < 256; local98++) {
				local133[local98] = new byte[local47[local98]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local98].length; local148++) {
					local146 += local8.method2393();
					local133[local98][local148] = local146;
				}
			}
			this.aByteArrayArray12 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray12[local181][local148] = (byte) Static67.method1251(local47, local83, local64, this.aByteArray44, local133, local148, local181);
						}
					}
				}
			}
			this.anInt3304 = local64[32] + local47[32];
		} else {
			this.anInt3304 = local8.method2380();
		}
		local8.method2380();
		local8.method2380();
		this.anInt3299 = local8.method2380();
		this.anInt3309 = local8.method2380();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)I")
	public int method2873(@OriginalArg(0) int arg0) {
		return this.aByteArray44[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[Lclient!lg;IILjava/lang/String;)I")
	public int method2874(@OriginalArg(1) Class60[] arg0, @OriginalArg(4) String arg1) {
		@Pc(22) int local22 = this.anInt3304;
		@Pc(35) int local35 = this.method2875(arg1, arg0, new int[] { 100 }, Static305.aStringArray42);
		@Pc(41) int local41 = (local35 - 1) * local22;
		return this.anInt3309 + this.anInt3299 + local41;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;[Lclient!lg;[II[Ljava/lang/String;)I")
	public int method2875(@OriginalArg(0) String arg0, @OriginalArg(1) Class60[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) String[] arg3) {
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
		for (@Pc(35) int local35 = 0; local35 < local28; local35++) {
			@Pc(45) int local45 = Static269.method4692(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(67) int local67;
				if (local21 == -1) {
					local47 = this.method2873(local45);
					local67 = local35;
					if (this.aByteArrayArray12 != null && local23 != -1) {
						local47 += this.aByteArrayArray12[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local67 = local21;
					@Pc(101) String local101 = arg0.substring(local21 + 1, local35);
					local21 = -1;
					if (local101.equals("br")) {
						arg3[local25] = arg0.substring(local13, local35 + 1);
						local15 = -1;
						local25++;
						local11 = 0;
						local13 = local35 + 1;
						local23 = -1;
						continue;
					}
					if (local101.equals("lt")) {
						local47 = this.method2873(60);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][60];
						}
						local23 = 60;
					} else if (local101.equals("gt")) {
						local47 = this.method2873(62);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][62];
						}
						local23 = 62;
					} else if (local101.equals("nbsp")) {
						local47 = this.method2873(160);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][160];
						}
						local23 = 160;
					} else if (local101.equals("shy")) {
						local47 = this.method2873(173);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][173];
						}
						local23 = 173;
					} else if (local101.equals("times")) {
						local47 = this.method2873(215);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][215];
						}
						local23 = 215;
					} else if (local101.equals("euro")) {
						local47 = this.method2873(8364);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][8364];
						}
						local23 = 8364;
					} else if (local101.equals("copy")) {
						local47 = this.method2873(169);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][169];
						}
						local23 = 169;
					} else if (local101.equals("reg")) {
						local47 = this.method2873(174);
						if (this.aByteArrayArray12 != null && local23 != -1) {
							local47 += this.aByteArrayArray12[local23][174];
						}
						local23 = 174;
					} else if (local101.startsWith("img=") && arg1 != null) {
						try {
							@Pc(257) int local257 = Static120.method2435(local101.substring(4));
							local47 = arg1[local257].method5683();
							local23 = -1;
						} catch (@Pc(268) Exception local268) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg2 != null) {
						if (local45 == 32) {
							local15 = local35;
							local19 = 1;
							local17 = local11;
						}
						if (arg2[arg2.length <= local25 ? arg2.length - 1 : local25] < local11) {
							if (local15 >= 0) {
								arg3[local25] = arg0.substring(local13, local15 + 1 - local19);
								local25++;
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local17;
								local23 = -1;
							} else {
								arg3[local25] = arg0.substring(local13, local67);
								local11 = local47;
								local25++;
								local13 = local67;
								local23 = -1;
								local15 = -1;
							}
						}
						if (local45 == 45) {
							local15 = local35;
							local19 = 0;
							local17 = local11;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg3[local25] = arg0.substring(local13, arg0.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILjava/lang/String;[Lclient!lg;)I")
	public int method2876(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class60[] arg2) {
		return this.method2875(arg1, arg2, new int[] { arg0 }, Static305.aStringArray42);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([Lclient!lg;Ljava/lang/String;I)I")
	public int method2877(@OriginalArg(0) Class60[] arg0, @OriginalArg(1) String arg1) {
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
					@Pc(49) String local49 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local49.equals("lt")) {
						local26 = '<';
					} else if (local49.equals("gt")) {
						local26 = '>';
					} else if (local49.equals("nbsp")) {
						local26 = ' ';
					} else if (local49.equals("shy")) {
						local26 = '\u00ad';
					} else if (local49.equals("times")) {
						local26 = '×';
					} else if (local49.equals("euro")) {
						local26 = '€';
					} else if (local49.equals("copy")) {
						local26 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=") && arg0 != null) {
								try {
									@Pc(111) int local111 = Static120.method2435(local49.substring(4));
									local13 = -1;
									local15 += arg0[local111].method5683();
								} catch (@Pc(122) Exception local122) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray44[Static269.method4692(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local13 != -1) {
						local15 += this.aByteArrayArray12[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method2879(@OriginalArg(0) String arg0) {
		return this.method2877(null, arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[Lclient!lg;Ljava/lang/String;I)I")
	public int method2882(@OriginalArg(0) int arg0, @OriginalArg(1) Class60[] arg1, @OriginalArg(2) String arg2) {
		@Pc(18) int local18 = this.method2875(arg2, arg1, new int[] { arg0 }, Static305.aStringArray42);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(31) int local31 = this.method2879(Static305.aStringArray42[local22]);
			if (local31 > local20) {
				local20 = local31;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIC)I")
	public int method2884(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray12 == null ? 0 : this.aByteArrayArray12[arg0][arg1];
	}
}
