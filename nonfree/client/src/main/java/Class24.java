import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class24 {

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[B")
	private final byte[] aByteArray16;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public final int anInt421;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	public final int anInt424;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public final int anInt418;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
	public Class24(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub24 local8 = new Class2_Sub24(arg0);
		@Pc(12) int local12 = local8.method5732();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method5732() == 1;
		this.aByteArray16 = new byte[256];
		local8.method5756(this.aByteArray16, 256);
		if (local28) {
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local51[local53] = local8.method5732();
			}
			@Pc(68) int[] local68 = new int[256];
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local68[local70] = local8.method5732();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local51[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method5759();
					local85[local87][local100] = local98;
				}
			}
			@Pc(135) byte[][] local135 = new byte[256][];
			@Pc(150) int local150;
			for (local100 = 0; local100 < 256; local100++) {
				local135[local100] = new byte[local51[local100]];
				@Pc(148) byte local148 = 0;
				for (local150 = 0; local150 < local135[local100].length; local150++) {
					local148 += local8.method5759();
					local135[local100][local150] = local148;
				}
			}
			this.aByteArrayArray2 = new byte[256][256];
			for (@Pc(183) int local183 = 0; local183 < 256; local183++) {
				if (local183 != 32 && local183 != 160) {
					for (local150 = 0; local150 < 256; local150++) {
						if (local150 != 32 && local150 != 160) {
							this.aByteArrayArray2[local183][local150] = (byte) Static321.method5185(local68, local85, local150, local183, local135, this.aByteArray16, local51);
						}
					}
				}
			}
			this.anInt421 = local51[32] + local68[32];
		} else {
			this.anInt421 = local8.method5732();
		}
		local8.method5732();
		local8.method5732();
		this.anInt424 = local8.method5732();
		this.anInt418 = local8.method5732();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lclient!rg;Ljava/lang/String;III)I")
	public int method322(@OriginalArg(0) Class27[] arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = this.anInt421;
		@Pc(29) int local29 = this.method330(new int[] { 100 }, Static24.aStringArray5, arg1, arg0);
		@Pc(35) int local35 = (local29 - 1) * local12;
		return this.anInt418 + local35 + this.anInt424;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBC)I")
	public int method323(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lclient!rg;Ljava/lang/String;II)I")
	public int method324(@OriginalArg(0) Class27[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return this.method330(new int[] { arg2 }, Static24.aStringArray5, arg1, arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method325(@OriginalArg(1) String arg0) {
		return this.method329(null, arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)I")
	public int method326(@OriginalArg(0) int arg0) {
		return this.aByteArray16[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lclient!rg;ZLjava/lang/String;)I")
	public int method329(@OriginalArg(0) Class27[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(34) char local34 = arg1.charAt(local20);
			if (local34 == '<') {
				local11 = local20;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(58) String local58 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local58.equals("lt")) {
						local34 = '<';
					} else if (local58.equals("gt")) {
						local34 = '>';
					} else if (local58.equals("nbsp")) {
						local34 = ' ';
					} else if (local58.equals("shy")) {
						local34 = '\u00ad';
					} else if (local58.equals("times")) {
						local34 = '×';
					} else if (local58.equals("euro")) {
						local34 = '€';
					} else if (local58.equals("copy")) {
						local34 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=") && arg0 != null) {
								try {
									@Pc(128) int local128 = Static335.method5402(local58.substring(4));
									local13 = -1;
									local15 += arg0[local128].method5317();
								} catch (@Pc(139) Exception local139) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray16[Static108.method1981(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local13 != -1) {
						local15 += this.aByteArrayArray2[local13][local34];
					}
					local13 = local34;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([I[Ljava/lang/String;Ljava/lang/String;I[Lclient!rg;)I")
	public int method330(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class27[] arg3) {
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
			@Pc(48) int local48 = Static108.method1981(arg2.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local21 = local38;
			} else {
				@Pc(62) int local62;
				if (local21 == -1) {
					local62 = local38;
					local50 = this.method326(local48);
					if (this.aByteArrayArray2 != null && local23 != -1) {
						local50 += this.aByteArrayArray2[local23][local48];
					}
					local23 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local62 = local21;
					@Pc(101) String local101 = arg2.substring(local21 + 1, local38);
					local21 = -1;
					if (local101.equals("br")) {
						arg1[local25] = arg2.substring(local13, local38 + 1);
						local25++;
						if (local25 >= arg1.length) {
							return 0;
						}
						local11 = 0;
						local13 = local38 + 1;
						local15 = -1;
						local23 = -1;
						continue;
					}
					if (local101.equals("lt")) {
						local50 = this.method326(60);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][60];
						}
						local23 = 60;
					} else if (local101.equals("gt")) {
						local50 = this.method326(62);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][62];
						}
						local23 = 62;
					} else if (local101.equals("nbsp")) {
						local50 = this.method326(160);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][160];
						}
						local23 = 160;
					} else if (local101.equals("shy")) {
						local50 = this.method326(173);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][173];
						}
						local23 = 173;
					} else if (local101.equals("times")) {
						local50 = this.method326(215);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][215];
						}
						local23 = 215;
					} else if (local101.equals("euro")) {
						local50 = this.method326(8364);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][8364];
						}
						local23 = 8364;
					} else if (local101.equals("copy")) {
						local50 = this.method326(169);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][169];
						}
						local23 = 169;
					} else if (local101.equals("reg")) {
						local50 = this.method326(174);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local50 += this.aByteArrayArray2[local23][174];
						}
						local23 = 174;
					} else if (local101.startsWith("img=") && arg3 != null) {
						try {
							@Pc(288) int local288 = Static335.method5402(local101.substring(4));
							local23 = -1;
							local50 = arg3[local288].method5317();
						} catch (@Pc(299) Exception local299) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg0 != null) {
						if (local48 == 32) {
							local19 = 1;
							local17 = local11;
							local15 = local38;
						}
						if (local11 > arg0[arg0.length > local25 ? local25 : arg0.length - 1]) {
							if (local15 >= 0) {
								arg1[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local17;
								local23 = -1;
							} else {
								arg1[local25] = arg2.substring(local13, local62);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local23 = -1;
								local13 = local62;
								local15 = -1;
								local11 = local50;
							}
						}
						if (local48 == 45) {
							local15 = local38;
							local17 = local11;
							local19 = 0;
						}
					}
				}
			}
		}
		if (local13 < arg2.length()) {
			arg1[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[Lclient!rg;Ljava/lang/String;)I")
	public int method331(@OriginalArg(1) int arg0, @OriginalArg(2) Class27[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method330(new int[] { arg0 }, Static24.aStringArray5, arg2, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method329(arg1, Static24.aStringArray5[local30]);
			if (local20 < local40) {
				local20 = local40;
			}
		}
		return local20;
	}
}
