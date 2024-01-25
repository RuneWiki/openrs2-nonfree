import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class80 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public final int anInt2617;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
	public final int anInt2625;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public final int anInt2611;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V")
	public Class80(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(arg0);
		@Pc(12) int local12 = local8.method2132();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method2132() == 1;
		this.aByteArray46 = new byte[256];
		local8.method2104(256, this.aByteArray46);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local8.method2132();
			}
			for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
				local47[local63] = local8.method2132();
			}
			@Pc(80) byte[][] local80 = new byte[256][];
			@Pc(95) int local95;
			for (@Pc(82) int local82 = 0; local82 < 256; local82++) {
				local80[local82] = new byte[local44[local82]];
				@Pc(93) byte local93 = 0;
				for (local95 = 0; local95 < local80[local82].length; local95++) {
					local93 += local8.method2122();
					local80[local82][local95] = local93;
				}
			}
			@Pc(128) byte[][] local128 = new byte[256][];
			@Pc(143) int local143;
			for (local95 = 0; local95 < 256; local95++) {
				local128[local95] = new byte[local44[local95]];
				@Pc(141) byte local141 = 0;
				for (local143 = 0; local143 < local128[local95].length; local143++) {
					local141 += local8.method2122();
					local128[local95][local143] = local141;
				}
			}
			this.aByteArrayArray8 = new byte[256][256];
			for (@Pc(178) int local178 = 0; local178 < 256; local178++) {
				if (local178 != 32 && local178 != 160) {
					for (local143 = 0; local143 < 256; local143++) {
						if (local143 != 32 && local143 != 160) {
							this.aByteArrayArray8[local178][local143] = (byte) Static96.method2067(local128, local47, local44, this.aByteArray46, local178, local143, local80);
						}
					}
				}
			}
			this.anInt2617 = local47[32] + local44[32];
		} else {
			this.anInt2617 = local8.method2132();
		}
		local8.method2132();
		local8.method2132();
		this.anInt2625 = local8.method2132();
		this.anInt2611 = local8.method2132();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([Lclient!ae;ILjava/lang/String;)I")
	public int method2530(@OriginalArg(0) Class4[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg1.charAt(local28);
			if (local34 == '<') {
				local11 = local28;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg1.substring(local11 + 1, local28);
					local11 = -1;
					if (local54.equals("lt")) {
						local34 = '<';
					} else if (local54.equals("gt")) {
						local34 = '>';
					} else if (local54.equals("nbsp")) {
						local34 = ' ';
					} else if (local54.equals("shy")) {
						local34 = '\u00ad';
					} else if (local54.equals("times")) {
						local34 = '×';
					} else if (local54.equals("euro")) {
						local34 = '€';
					} else if (local54.equals("copy")) {
						local34 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg0 != null) {
								try {
									@Pc(122) int local122 = Static171.method3207(local54.substring(4));
									local21 = -1;
									local23 += arg0[local122].method5961();
								} catch (@Pc(133) Exception local133) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local23 += this.aByteArray46[Static352.method1726(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray8 != null && local21 != -1) {
						local23 += this.aByteArrayArray8[local21][local34];
					}
					local21 = local34;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I")
	public int method2532(@OriginalArg(0) int arg0) {
		return this.aByteArray46[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!ae;)I")
	public int method2533(@OriginalArg(3) String arg0, @OriginalArg(4) Class4[] arg1) {
		@Pc(4) int local4 = this.anInt2617;
		@Pc(21) int local21 = this.method2540(arg1, new int[] { 100 }, Static193.aStringArray22, arg0);
		@Pc(27) int local27 = local4 * (local21 - 1);
		return this.anInt2611 + local27 + this.anInt2625;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ae;IB)I")
	public int method2535(@OriginalArg(0) String arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(2) int arg2) {
		return this.method2540(arg1, new int[] { arg2 }, Static193.aStringArray22, arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(CIZ)I")
	public int method2537(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray8 == null ? 0 : this.aByteArrayArray8[arg1][arg0];
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;[Lclient!ae;B)I")
	public int method2538(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class4[] arg2) {
		@Pc(18) int local18 = this.method2540(arg2, new int[] { arg0 }, Static193.aStringArray22, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method2530(arg2, Static193.aStringArray22[local27]);
			if (local37 > local20) {
				local20 = local37;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([Lclient!ae;I[I[Ljava/lang/String;Ljava/lang/String;)I")
	public int method2540(@OriginalArg(0) Class4[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) String arg3) {
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
			@Pc(40) int local40 = Static352.method1726(arg3.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(55) int local55;
				if (local21 == -1) {
					local55 = local30;
					local42 = this.method2532(local40);
					if (this.aByteArrayArray8 != null && local23 != -1) {
						local42 += this.aByteArrayArray8[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local55 = local21;
					@Pc(96) String local96 = arg3.substring(local21 + 1, local30);
					local21 = -1;
					if (local96.equals("br")) {
						arg2[local25] = arg3.substring(local13, local30 + 1);
						local25++;
						if (arg2.length <= local25) {
							return 0;
						}
						local11 = 0;
						local23 = -1;
						local13 = local30 + 1;
						local15 = -1;
						continue;
					}
					if (local96.equals("lt")) {
						local42 = this.method2532(60);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][60];
						}
						local23 = 60;
					} else if (local96.equals("gt")) {
						local42 = this.method2532(62);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][62];
						}
						local23 = 62;
					} else if (local96.equals("nbsp")) {
						local42 = this.method2532(160);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][160];
						}
						local23 = 160;
					} else if (local96.equals("shy")) {
						local42 = this.method2532(173);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][173];
						}
						local23 = 173;
					} else if (local96.equals("times")) {
						local42 = this.method2532(215);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][215];
						}
						local23 = 215;
					} else if (local96.equals("euro")) {
						local42 = this.method2532(8364);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][8364];
						}
						local23 = 8364;
					} else if (local96.equals("copy")) {
						local42 = this.method2532(169);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][169];
						}
						local23 = 169;
					} else if (local96.equals("reg")) {
						local42 = this.method2532(174);
						if (this.aByteArrayArray8 != null && local23 != -1) {
							local42 += this.aByteArrayArray8[local23][174];
						}
						local23 = 174;
					} else if (local96.startsWith("img=") && arg0 != null) {
						try {
							@Pc(225) int local225 = Static171.method3207(local96.substring(4));
							local42 = arg0[local225].method5961();
							local23 = -1;
						} catch (@Pc(236) Exception local236) {
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
						if (arg1[arg1.length > local25 ? local25 : arg1.length - 1] < local11) {
							if (local15 >= 0) {
								arg2[local25] = arg3.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg2.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local17;
								local23 = -1;
							} else {
								arg2[local25] = arg3.substring(local13, local55);
								local25++;
								if (local25 >= arg2.length) {
									return 0;
								}
								local13 = local55;
								local23 = -1;
								local11 = local42;
								local15 = -1;
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
		if (arg3.length() > local13) {
			arg2[local25] = arg3.substring(local13, arg3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2543(@OriginalArg(1) String arg0) {
		return this.method2530(null, arg0);
	}
}
