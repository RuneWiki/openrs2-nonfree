import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class208 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "[B")
	private final byte[] aByteArray93;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public final int anInt6377;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
	public final int anInt6381;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public final int anInt6371;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([B)V")
	public Class208(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class7_Sub3 local6 = new Class7_Sub3(arg0);
		@Pc(10) int local10 = local6.method2772();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(26) boolean local26 = local6.method2772() == 1;
		this.aByteArray93 = new byte[256];
		local6.method2793(256, this.aByteArray93);
		if (local26) {
			@Pc(48) int[] local48 = new int[256];
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local48[local53] = local6.method2772();
			}
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local51[local66] = local6.method2772();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(96) int local96;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local48[local84]];
				@Pc(94) byte local94 = 0;
				for (local96 = 0; local96 < local82[local84].length; local96++) {
					local94 += local6.method2779();
					local82[local84][local96] = local94;
				}
			}
			@Pc(128) byte[][] local128 = new byte[256][];
			@Pc(142) int local142;
			for (local96 = 0; local96 < 256; local96++) {
				local128[local96] = new byte[local48[local96]];
				@Pc(140) byte local140 = 0;
				for (local142 = 0; local142 < local128[local96].length; local142++) {
					local140 += local6.method2779();
					local128[local96][local142] = local140;
				}
			}
			this.aByteArrayArray20 = new byte[256][256];
			for (@Pc(176) int local176 = 0; local176 < 256; local176++) {
				if (local176 != 32 && local176 != 160) {
					for (local142 = 0; local142 < 256; local142++) {
						if (local142 != 32 && local142 != 160) {
							this.aByteArrayArray20[local176][local142] = (byte) Static140.method2822(local176, local142, this.aByteArray93, local82, local128, local51, local48);
						}
					}
				}
			}
			this.anInt6377 = local51[32] + local48[32];
		} else {
			this.anInt6377 = local6.method2772();
		}
		local6.method2772();
		local6.method2772();
		this.anInt6381 = local6.method2772();
		this.anInt6371 = local6.method2772();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I")
	public int method5372(@OriginalArg(0) int arg0) {
		return this.aByteArray93[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/String;[Lclient!kb;[I)I")
	public int method5373(@OriginalArg(1) String arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) Class52[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(37) int local37 = Static138.method2796(arg0.charAt(local28)) & 0xFF;
			@Pc(39) int local39 = 0;
			if (local37 == 60) {
				local19 = local28;
			} else {
				@Pc(57) int local57;
				if (local19 == -1) {
					local57 = local28;
					local39 = this.method5372(local37);
					if (this.aByteArrayArray20 != null && local21 != -1) {
						local39 += this.aByteArrayArray20[local21][local37];
					}
					local21 = local37;
				} else {
					if (local37 != 62) {
						continue;
					}
					local57 = local19;
					@Pc(64) String local64 = arg0.substring(local19 + 1, local28);
					local19 = -1;
					if (local64.equals("br")) {
						arg1[local23] = arg0.substring(local11, local28 + 1);
						local13 = -1;
						local9 = 0;
						local21 = -1;
						local11 = local28 + 1;
						local23++;
						continue;
					}
					if (local64.equals("lt")) {
						local39 = this.method5372(60);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][60];
						}
						local21 = 60;
					} else if (local64.equals("gt")) {
						local39 = this.method5372(62);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][62];
						}
						local21 = 62;
					} else if (local64.equals("nbsp")) {
						local39 = this.method5372(160);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][160];
						}
						local21 = 160;
					} else if (local64.equals("shy")) {
						local39 = this.method5372(173);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][173];
						}
						local21 = 173;
					} else if (local64.equals("times")) {
						local39 = this.method5372(215);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][215];
						}
						local21 = 215;
					} else if (local64.equals("euro")) {
						local39 = this.method5372(8364);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][8364];
						}
						local21 = 8364;
					} else if (local64.equals("copy")) {
						local39 = this.method5372(169);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][169];
						}
						local21 = 169;
					} else if (local64.equals("reg")) {
						local39 = this.method5372(174);
						if (this.aByteArrayArray20 != null && local21 != -1) {
							local39 += this.aByteArrayArray20[local21][174];
						}
						local21 = 174;
					} else if (local64.startsWith("img=") && arg2 != null) {
						try {
							@Pc(241) int local241 = Static281.method4414(local64.substring(4));
							local39 = arg2[local241].method4141();
							local21 = -1;
						} catch (@Pc(252) Exception local252) {
						}
					}
					local37 = -1;
				}
				if (local39 > 0) {
					local9 += local39;
					if (arg3 != null) {
						if (local37 == 32) {
							local15 = local9;
							local17 = 1;
							local13 = local28;
						}
						if (arg3[local23 >= arg3.length ? arg3.length - 1 : local23] < local9) {
							if (local13 < 0) {
								arg1[local23] = arg0.substring(local11, local57);
								local23++;
								local11 = local57;
								local13 = -1;
								local9 = local39;
								local21 = -1;
							} else {
								arg1[local23] = arg0.substring(local11, local13 + 1 - local17);
								local11 = local13 + 1;
								local23++;
								local21 = -1;
								local13 = -1;
								local9 -= local15;
							}
						}
						if (local37 == 45) {
							local15 = local9;
							local13 = local28;
							local17 = 0;
						}
					}
				}
			}
		}
		if (local11 < arg0.length()) {
			arg1[local23] = arg0.substring(local11, arg0.length());
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;BI[Lclient!kb;)I")
	public int method5375(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class52[] arg2) {
		return this.method5373(arg0, Static248.aStringArray43, arg2, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[Lclient!kb;ILjava/lang/String;)I")
	public int method5377(@OriginalArg(2) Class52[] arg0, @OriginalArg(4) String arg1) {
		@Pc(7) int local7 = this.anInt6377;
		@Pc(24) int local24 = this.method5373(arg1, Static248.aStringArray43, arg0, new int[] { 100 });
		@Pc(30) int local30 = local7 * (local24 - 1);
		return this.anInt6381 + local30 + this.anInt6371;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBC)I")
	public int method5379(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray20 == null ? 0 : this.aByteArrayArray20[arg0][arg1];
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B[Lclient!kb;I)I")
	public int method5380(@OriginalArg(0) String arg0, @OriginalArg(2) Class52[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.method5373(arg0, Static248.aStringArray43, arg1, new int[] { arg2 });
		@Pc(18) int local18 = 0;
		for (@Pc(30) int local30 = 0; local30 < local16; local30++) {
			@Pc(38) int local38 = this.method5385(Static248.aStringArray43[local30]);
			if (local18 < local38) {
				local18 = local38;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([Lclient!kb;ILjava/lang/String;)I")
	public int method5383(@OriginalArg(0) Class52[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg1.length();
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(28) char local28 = arg1.charAt(local23);
			if (local28 == '<') {
				local9 = local23;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(51) String local51 = arg1.substring(local9 + 1, local23);
					local9 = -1;
					if (local51.equals("lt")) {
						local28 = '<';
					} else if (local51.equals("gt")) {
						local28 = '>';
					} else if (local51.equals("nbsp")) {
						local28 = ' ';
					} else if (local51.equals("shy")) {
						local28 = '\u00ad';
					} else if (local51.equals("times")) {
						local28 = '×';
					} else if (local51.equals("euro")) {
						local28 = '€';
					} else if (local51.equals("copy")) {
						local28 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=") && arg0 != null) {
								try {
									@Pc(107) int local107 = Static281.method4414(local51.substring(4));
									local11 = -1;
									local13 += arg0[local107].method4141();
								} catch (@Pc(118) Exception local118) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray93[Static138.method2796(local28) & 0xFF] & 0xFF;
					if (this.aByteArrayArray20 != null && local11 != -1) {
						local13 += this.aByteArrayArray20[local11][local28];
					}
					local11 = local28;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5385(@OriginalArg(0) String arg0) {
		return this.method5383(null, arg0);
	}
}
