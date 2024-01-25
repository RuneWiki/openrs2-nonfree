import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class188 {

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	public final int anInt6090;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public final int anInt6075;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	public final int anInt6080;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V")
	public Class188(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub10 local8 = new Class2_Sub10(arg0);
		@Pc(12) int local12 = local8.method4421();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method4421() == 1;
		this.aByteArray76 = new byte[256];
		local8.method4417(this.aByteArray76, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method4421();
			}
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local49[local65] = local8.method4421();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method4436();
					local82[local84][local97] = local95;
				}
			}
			@Pc(130) byte[][] local130 = new byte[256][];
			@Pc(145) int local145;
			for (local97 = 0; local97 < 256; local97++) {
				local130[local97] = new byte[local46[local97]];
				@Pc(143) byte local143 = 0;
				for (local145 = 0; local145 < local130[local97].length; local145++) {
					local143 += local8.method4436();
					local130[local97][local145] = local143;
				}
			}
			this.aByteArrayArray20 = new byte[256][256];
			for (@Pc(178) int local178 = 0; local178 < 256; local178++) {
				if (local178 != 32 && local178 != 160) {
					for (local145 = 0; local145 < 256; local145++) {
						if (local145 != 32 && local145 != 160) {
							this.aByteArrayArray20[local178][local145] = (byte) Static355.method5983(local49, this.aByteArray76, local130, local178, local46, local82, local145);
						}
					}
				}
			}
			this.anInt6090 = local46[32] + local49[32];
		} else {
			this.anInt6090 = local8.method4421();
		}
		local8.method4421();
		local8.method4421();
		this.anInt6075 = local8.method4421();
		this.anInt6080 = local8.method4421();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Z[Lclient!gj;)I")
	public int method5309(@OriginalArg(0) String arg0, @OriginalArg(2) Class31[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local16 = local25;
			} else {
				if (local31 == '>' && local16 != -1) {
					@Pc(56) String local56 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local56.equals("lt")) {
						local31 = '<';
					} else if (local56.equals("gt")) {
						local31 = '>';
					} else if (local56.equals("nbsp")) {
						local31 = ' ';
					} else if (local56.equals("shy")) {
						local31 = '\u00ad';
					} else if (local56.equals("times")) {
						local31 = '×';
					} else if (local56.equals("euro")) {
						local31 = '€';
					} else if (local56.equals("copy")) {
						local31 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg1 != null) {
								try {
									@Pc(126) int local126 = Static133.method2671(local56.substring(4));
									local18 = -1;
									local20 += arg1[local126].method4376();
								} catch (@Pc(137) Exception local137) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local16 == -1) {
					local20 += this.aByteArray76[Static241.method4169(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray20 != null && local18 != -1) {
						local20 += this.aByteArrayArray20[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([Lclient!gj;BILjava/lang/String;I)I")
	public int method5311(@OriginalArg(0) Class31[] arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = this.anInt6090;
		@Pc(21) int local21 = this.method5316(arg1, new int[] { 100 }, arg0, Static284.aStringArray52);
		@Pc(35) int local35 = local8 * (local21 - 1);
		return this.anInt6080 + local35 + this.anInt6075;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI[Lclient!gj;Ljava/lang/String;)I")
	public int method5313(@OriginalArg(1) int arg0, @OriginalArg(2) Class31[] arg1, @OriginalArg(3) String arg2) {
		return this.method5316(arg2, new int[] { arg0 }, arg1, Static284.aStringArray52);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
	public int method5314(@OriginalArg(0) int arg0) {
		return this.aByteArray76[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([Lclient!gj;ILjava/lang/String;I)I")
	public int method5315(@OriginalArg(0) Class31[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = this.method5316(arg1, new int[] { arg2 }, arg0, Static284.aStringArray52);
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local20; local24++) {
			@Pc(34) int local34 = this.method5309(Static284.aStringArray52[local24], arg0);
			if (local34 > local22) {
				local22 = local34;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;[I[Lclient!gj;[Ljava/lang/String;I)I")
	public int method5316(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class31[] arg2, @OriginalArg(3) String[] arg3) {
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
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static241.method4169(arg0.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local21 = local36;
			} else {
				@Pc(68) int local68;
				if (local21 == -1) {
					local48 = this.method5314(local46);
					local68 = local36;
					if (this.aByteArrayArray20 != null && local23 != -1) {
						local48 += this.aByteArrayArray20[local23][local46];
					}
					local23 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local68 = local21;
					@Pc(101) String local101 = arg0.substring(local21 + 1, local36);
					local21 = -1;
					if (local101.equals("br")) {
						arg3[local31] = arg0.substring(local13, local36 + 1);
						local31++;
						if (local31 >= arg3.length) {
							return 0;
						}
						local11 = 0;
						local13 = local36 + 1;
						local15 = -1;
						local23 = -1;
						continue;
					}
					if (local101.equals("lt")) {
						local48 = this.method5314(60);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][60];
						}
						local23 = 60;
					} else if (local101.equals("gt")) {
						local48 = this.method5314(62);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][62];
						}
						local23 = 62;
					} else if (local101.equals("nbsp")) {
						local48 = this.method5314(160);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][160];
						}
						local23 = 160;
					} else if (local101.equals("shy")) {
						local48 = this.method5314(173);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][173];
						}
						local23 = 173;
					} else if (local101.equals("times")) {
						local48 = this.method5314(215);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][215];
						}
						local23 = 215;
					} else if (local101.equals("euro")) {
						local48 = this.method5314(8364);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][8364];
						}
						local23 = 8364;
					} else if (local101.equals("copy")) {
						local48 = this.method5314(169);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][169];
						}
						local23 = 169;
					} else if (local101.equals("reg")) {
						local48 = this.method5314(174);
						if (this.aByteArrayArray20 != null && local23 != -1) {
							local48 += this.aByteArrayArray20[local23][174];
						}
						local23 = 174;
					} else if (local101.startsWith("img=") && arg2 != null) {
						try {
							@Pc(256) int local256 = Static133.method2671(local101.substring(4));
							local48 = arg2[local256].method4376();
							local23 = -1;
						} catch (@Pc(267) Exception local267) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local11 += local48;
					if (arg1 != null) {
						if (local46 == 32) {
							local17 = local11;
							local15 = local36;
							local19 = 1;
						}
						if (local11 > arg1[local31 >= arg1.length ? arg1.length - 1 : local31]) {
							if (local15 >= 0) {
								arg3[local31] = arg0.substring(local13, local15 + 1 - local19);
								local31++;
								if (arg3.length <= local31) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local11 -= local17;
								local15 = -1;
							} else {
								arg3[local31] = arg0.substring(local13, local68);
								local31++;
								if (arg3.length <= local31) {
									return 0;
								}
								local23 = -1;
								local15 = -1;
								local13 = local68;
								local11 = local48;
							}
						}
						if (local46 == 45) {
							local19 = 0;
							local15 = local36;
							local17 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg0.length()) {
			arg3[local31] = arg0.substring(local13, arg0.length());
			local31++;
		}
		return local31;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ICI)I")
	public int method5317(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray20 == null ? 0 : this.aByteArrayArray20[arg1][arg0];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5318(@OriginalArg(0) String arg0) {
		return this.method5309(arg0, null);
	}
}
