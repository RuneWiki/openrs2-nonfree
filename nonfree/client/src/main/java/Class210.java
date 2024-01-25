import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class210 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[B")
	private final byte[] aByteArray163;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public final int anInt5956;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public final int anInt5946;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public final int anInt5944;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
	public Class210(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(arg0);
		@Pc(12) int local12 = local8.method3737();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method3737() == 1;
		this.aByteArray163 = new byte[256];
		local8.method3690(this.aByteArray163, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method3737();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local49[local65] = local8.method3737();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method3693();
					local82[local84][local97] = local95;
				}
			}
			@Pc(128) byte[][] local128 = new byte[256][];
			@Pc(143) int local143;
			for (local97 = 0; local97 < 256; local97++) {
				local128[local97] = new byte[local46[local97]];
				@Pc(141) byte local141 = 0;
				for (local143 = 0; local143 < local128[local97].length; local143++) {
					local141 += local8.method3693();
					local128[local97][local143] = local141;
				}
			}
			this.aByteArrayArray18 = new byte[256][256];
			for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
				if (local182 != 32 && local182 != 160) {
					for (local143 = 0; local143 < 256; local143++) {
						if (local143 != 32 && local143 != 160) {
							this.aByteArrayArray18[local182][local143] = (byte) Static450.method6076(local128, local143, local46, local182, this.aByteArray163, local49, local82);
						}
					}
				}
			}
			this.anInt5956 = local49[32] + local46[32];
		} else {
			this.anInt5956 = local8.method3737();
		}
		local8.method3737();
		local8.method3737();
		this.anInt5946 = local8.method3737();
		this.anInt5944 = local8.method3737();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;II[Lclient!f;)I")
	public int method4745(@OriginalArg(1) String arg0, @OriginalArg(4) Class76[] arg1) {
		@Pc(5) int local5 = this.anInt5956;
		@Pc(22) int local22 = this.method4756(Static88.aStringArray10, arg0, arg1, new int[] { 100 });
		@Pc(28) int local28 = (local22 - 1) * local5;
		return local28 + this.anInt5946 + this.anInt5944;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjava/lang/String;[Lclient!f;)I")
	public int method4746(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class76[] arg2) {
		return this.method4756(Static88.aStringArray10, arg1, arg2, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
	public int method4747(@OriginalArg(0) int arg0) {
		return this.aByteArray163[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(CII)I")
	public int method4749(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray18 == null ? 0 : this.aByteArrayArray18[arg1][arg0];
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;B[Lclient!f;I)Ljava/lang/String;")
	public String method4751(@OriginalArg(0) String arg0, @OriginalArg(2) Class76[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method4759(arg0, arg1)) {
			return arg0;
		}
		@Pc(26) int local26 = arg2 - this.method4759("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(72) String local72 = arg0.substring(local28 + 1, local44);
					local28 = -1;
					if (local72.equals("lt")) {
						local50 = '<';
					} else if (local72.equals("gt")) {
						local50 = '>';
					} else if (local72.equals("nbsp")) {
						local50 = ' ';
					} else if (local72.equals("shy")) {
						local50 = '\u00ad';
					} else if (local72.equals("times")) {
						local50 = '×';
					} else if (local72.equals("euro")) {
						local50 = '€';
					} else if (local72.equals("copy")) {
						local50 = '©';
					} else {
						if (!local72.equals("reg")) {
							if (local72.startsWith("img=") && arg1 != null) {
								try {
									@Pc(142) int local142 = Static175.method2762(local72.substring(4));
									local30 = -1;
									local32 += arg1[local142].ja();
									if (local26 < local32) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(172) Exception local172) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray163[Static49.method988(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray18 != null && local30 != -1) {
						local32 += this.aByteArrayArray18[local30][local50];
					}
					local30 = local50;
					@Pc(217) int local217 = local32;
					if (this.aByteArrayArray18 != null) {
						local217 = local32 + this.aByteArrayArray18[local50][46];
					}
					if (local217 > local26) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ[Lclient!f;Ljava/lang/String;)I")
	public int method4754(@OriginalArg(0) int arg0, @OriginalArg(2) Class76[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method4756(Static88.aStringArray10, arg2, arg1, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
			@Pc(41) int local41 = this.method4759(Static88.aStringArray10[local31], arg1);
			if (local20 < local41) {
				local20 = local41;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[Lclient!f;B[I)I")
	public int method4756(@OriginalArg(0) String[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class76[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 == null) {
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
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static49.method988(arg1.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(65) int local65;
				if (local21 == -1) {
					local47 = this.method4747(local45);
					local65 = local35;
					if (this.aByteArrayArray18 != null && local23 != -1) {
						local47 += this.aByteArrayArray18[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local65 = local21;
					@Pc(72) String local72 = arg1.substring(local21 + 1, local35);
					local21 = -1;
					if (local72.equals("br")) {
						arg0[local25] = arg1.substring(local13, local35 + 1);
						local25++;
						if (arg0.length <= local25) {
							return 0;
						}
						local15 = -1;
						local11 = 0;
						local23 = -1;
						local13 = local35 + 1;
						continue;
					}
					if (local72.equals("lt")) {
						local47 = this.method4747(60);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][60];
						}
						local23 = 60;
					} else if (local72.equals("gt")) {
						local47 = this.method4747(62);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][62];
						}
						local23 = 62;
					} else if (local72.equals("nbsp")) {
						local47 = this.method4747(160);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][160];
						}
						local23 = 160;
					} else if (local72.equals("shy")) {
						local47 = this.method4747(173);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][173];
						}
						local23 = 173;
					} else if (local72.equals("times")) {
						local47 = this.method4747(215);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][215];
						}
						local23 = 215;
					} else if (local72.equals("euro")) {
						local47 = this.method4747(8364);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][8364];
						}
						local23 = 8364;
					} else if (local72.equals("copy")) {
						local47 = this.method4747(169);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][169];
						}
						local23 = 169;
					} else if (local72.equals("reg")) {
						local47 = this.method4747(174);
						if (this.aByteArrayArray18 != null && local23 != -1) {
							local47 += this.aByteArrayArray18[local23][174];
						}
						local23 = 174;
					} else if (local72.startsWith("img=") && arg2 != null) {
						try {
							@Pc(261) int local261 = Static175.method2762(local72.substring(4));
							local23 = -1;
							local47 = arg2[local261].ja();
						} catch (@Pc(272) Exception local272) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg3 != null) {
						if (local45 == 32) {
							local15 = local35;
							local17 = local11;
							local19 = 1;
						}
						if (arg3[arg3.length <= local25 ? arg3.length - 1 : local25] < local11) {
							if (local15 >= 0) {
								arg0[local25] = arg1.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg0.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local17;
								local23 = -1;
							} else {
								arg0[local25] = arg1.substring(local13, local65);
								local25++;
								if (arg0.length <= local25) {
									return 0;
								}
								local23 = -1;
								local13 = local65;
								local11 = local47;
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
		if (local13 < arg1.length()) {
			arg0[local25] = arg1.substring(local13, arg1.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4758(@OriginalArg(1) String arg0) {
		return this.method4759(arg0, null);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;[Lclient!f;)I")
	public int method4759(@OriginalArg(1) String arg0, @OriginalArg(2) Class76[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg0.substring(local11 + 1, local25);
					local11 = -1;
					if (local55.equals("lt")) {
						local31 = '<';
					} else if (local55.equals("gt")) {
						local31 = '>';
					} else if (local55.equals("nbsp")) {
						local31 = ' ';
					} else if (local55.equals("shy")) {
						local31 = '\u00ad';
					} else if (local55.equals("times")) {
						local31 = '×';
					} else if (local55.equals("euro")) {
						local31 = '€';
					} else if (local55.equals("copy")) {
						local31 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg1 != null) {
								try {
									@Pc(129) int local129 = Static175.method2762(local55.substring(4));
									local15 += arg1[local129].ja();
									local13 = -1;
								} catch (@Pc(140) Exception local140) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray163[Static49.method988(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray18 != null && local13 != -1) {
						local15 += this.aByteArrayArray18[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local15;
	}
}
