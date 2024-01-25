import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class198 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
	private final byte[] aByteArray52;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public final int anInt4637;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public final int anInt4647;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public final int anInt4648;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
	public Class198(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class5_Sub15 local6 = new Class5_Sub15(arg0);
		@Pc(10) int local10 = local6.method3642();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(26) boolean local26 = local6.method3642() == 1;
		this.aByteArray52 = new byte[256];
		local6.method3650(0, 256, this.aByteArray52);
		if (local26) {
			@Pc(42) int[] local42 = new int[256];
			@Pc(45) int[] local45 = new int[256];
			for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
				local42[local47] = local6.method3642();
			}
			for (@Pc(62) int local62 = 0; local62 < 256; local62++) {
				local45[local62] = local6.method3642();
			}
			@Pc(76) byte[][] local76 = new byte[256][];
			@Pc(90) int local90;
			for (@Pc(78) int local78 = 0; local78 < 256; local78++) {
				local76[local78] = new byte[local42[local78]];
				@Pc(88) byte local88 = 0;
				for (local90 = 0; local90 < local76[local78].length; local90++) {
					local88 += local6.method3677();
					local76[local78][local90] = local88;
				}
			}
			@Pc(124) byte[][] local124 = new byte[256][];
			@Pc(138) int local138;
			for (local90 = 0; local90 < 256; local90++) {
				local124[local90] = new byte[local42[local90]];
				@Pc(136) byte local136 = 0;
				for (local138 = 0; local138 < local124[local90].length; local138++) {
					local136 += local6.method3677();
					local124[local90][local138] = local136;
				}
			}
			this.aByteArrayArray10 = new byte[256][256];
			for (@Pc(174) int local174 = 0; local174 < 256; local174++) {
				if (local174 != 32 && local174 != 160) {
					for (local138 = 0; local138 < 256; local138++) {
						if (local138 != 32 && local138 != 160) {
							this.aByteArrayArray10[local174][local138] = (byte) Static649.method8548(local76, local174, local42, this.aByteArray52, local45, local124, local138);
						}
					}
				}
			}
			this.anInt4637 = local42[32] + local45[32];
		} else {
			this.anInt4637 = local6.method3642();
		}
		local6.method3642();
		local6.method3642();
		this.anInt4647 = local6.method3642();
		this.anInt4648 = local6.method3642();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;ZI[Lclient!qda;)Ljava/lang/String;")
	public String method4075(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class59[] arg2) {
		if (arg1 >= this.method4083(arg2, arg0)) {
			return arg0;
		}
		@Pc(20) int local20 = arg1 - this.method4083((Class59[]) null, "...");
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(44) char local44 = arg0.charAt(local39);
			if (local44 == '<') {
				local22 = local39;
			} else {
				if (local44 == '>' && local22 != -1) {
					@Pc(64) String local64 = arg0.substring(local22 + 1, local39);
					local22 = -1;
					if (local64.equals("lt")) {
						local44 = '<';
					} else if (local64.equals("gt")) {
						local44 = '>';
					} else if (local64.equals("nbsp")) {
						local44 = ' ';
					} else if (local64.equals("shy")) {
						local44 = '\u00ad';
					} else if (local64.equals("times")) {
						local44 = '×';
					} else if (local64.equals("euro")) {
						local44 = '€';
					} else if (local64.equals("copy")) {
						local44 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=") && arg2 != null) {
								try {
									@Pc(129) int local129 = Static171.method2534(local64.substring(4));
									local32 += arg2[local129].method8053();
									local24 = -1;
									if (local32 > local20) {
										return local37 + "...";
									}
									local37 = arg0.substring(0, local39 + 1);
								} catch (@Pc(163) Exception local163) {
								}
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local22 == -1) {
					local32 += this.aByteArray52[Static404.method5902(local44) & 0xFF] & 0xFF;
					if (this.aByteArrayArray10 != null && local24 != -1) {
						local32 += this.aByteArrayArray10[local24][local44];
					}
					local24 = local44;
					@Pc(205) int local205 = local32;
					if (this.aByteArrayArray10 != null) {
						local205 = local32 + this.aByteArrayArray10[local44][46];
					}
					if (local20 < local205) {
						return local37 + "...";
					}
					local37 = arg0.substring(0, local39 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4076(@OriginalArg(0) String arg0) {
		return this.method4083((Class59[]) null, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
	public int method4077(@OriginalArg(0) int arg0) {
		return this.aByteArray52[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(CII)I")
	public int method4079(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray10 == null ? 0 : this.aByteArrayArray10[arg1][arg0];
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;[Lclient!qda;II)I")
	public int method4081(@OriginalArg(0) String arg0, @OriginalArg(1) Class59[] arg1, @OriginalArg(2) int arg2) {
		return this.method4085(Static190.aStringArray8, arg1, arg0, new int[] { arg2 });
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!qda;)I")
	public int method4082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class59[] arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt4637;
		}
		@Pc(22) int local22 = this.method4085(Static190.aStringArray8, arg3, arg2, new int[] { arg0 });
		@Pc(28) int local28 = (local22 - 1) * arg1;
		return local28 + this.anInt4647 + this.anInt4648;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B[Lclient!qda;Ljava/lang/String;)I")
	public int method4083(@OriginalArg(1) Class59[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg1.length();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
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
									@Pc(106) int local106 = Static171.method2534(local51.substring(4));
									local11 = -1;
									local18 += arg0[local106].method8053();
								} catch (@Pc(117) Exception local117) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					local18 += this.aByteArray52[Static404.method5902(local28) & 0xFF] & 0xFF;
					if (this.aByteArrayArray10 != null && local11 != -1) {
						local18 += this.aByteArrayArray10[local11][local28];
					}
					local11 = local28;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[Lclient!qda;Ljava/lang/String;I)I")
	public int method4084(@OriginalArg(0) int arg0, @OriginalArg(1) Class59[] arg1, @OriginalArg(2) String arg2) {
		@Pc(16) int local16 = this.method4085(Static190.aStringArray8, arg1, arg2, new int[] { arg0 });
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(29) int local29 = this.method4083(arg1, Static190.aStringArray8[local20]);
			if (local18 < local29) {
				local18 = local29;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ljava/lang/String;[Lclient!qda;Ljava/lang/String;[IZ)I")
	public int method4085(@OriginalArg(0) String[] arg0, @OriginalArg(1) Class59[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 == null) {
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
		@Pc(31) int local31 = arg2.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(42) int local42 = Static404.method5902(arg2.charAt(local33)) & 0xFF;
			@Pc(44) int local44 = 0;
			if (local42 == 60) {
				local19 = local33;
			} else {
				@Pc(62) int local62;
				if (local19 == -1) {
					local44 = this.method4077(local42);
					local62 = local33;
					if (this.aByteArrayArray10 != null && local21 != -1) {
						local44 += this.aByteArrayArray10[local21][local42];
					}
					local21 = local42;
				} else {
					if (local42 != 62) {
						continue;
					}
					local62 = local19;
					@Pc(69) String local69 = arg2.substring(local19 + 1, local33);
					local19 = -1;
					if (local69.equals("br")) {
						arg0[local23] = arg2.substring(local11, local33 + 1);
						local23++;
						if (local23 >= arg0.length) {
							return 0;
						}
						local9 = 0;
						local11 = local33 + 1;
						local21 = -1;
						local13 = -1;
						continue;
					}
					if (local69.equals("lt")) {
						local44 = this.method4077(60);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][60];
						}
						local21 = 60;
					} else if (local69.equals("gt")) {
						local44 = this.method4077(62);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][62];
						}
						local21 = 62;
					} else if (local69.equals("nbsp")) {
						local44 = this.method4077(160);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][160];
						}
						local21 = 160;
					} else if (local69.equals("shy")) {
						local44 = this.method4077(173);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][173];
						}
						local21 = 173;
					} else if (local69.equals("times")) {
						local44 = this.method4077(215);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][215];
						}
						local21 = 215;
					} else if (local69.equals("euro")) {
						local44 = this.method4077(8364);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][8364];
						}
						local21 = 8364;
					} else if (local69.equals("copy")) {
						local44 = this.method4077(169);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][169];
						}
						local21 = 169;
					} else if (local69.equals("reg")) {
						local44 = this.method4077(174);
						if (this.aByteArrayArray10 != null && local21 != -1) {
							local44 += this.aByteArrayArray10[local21][174];
						}
						local21 = 174;
					} else if (local69.startsWith("img=") && arg1 != null) {
						try {
							@Pc(171) int local171 = Static171.method2534(local69.substring(4));
							local21 = -1;
							local44 = arg1[local171].method8053();
						} catch (@Pc(182) Exception local182) {
						}
					}
					local42 = -1;
				}
				if (local44 > 0) {
					local9 += local44;
					if (arg3 != null) {
						if (local42 == 32) {
							local15 = local9;
							local17 = 1;
							local13 = local33;
						}
						if (local9 > arg3[arg3.length <= local23 ? arg3.length - 1 : local23]) {
							if (local13 >= 0) {
								arg0[local23] = arg2.substring(local11, local13 + 1 - local17);
								local23++;
								if (arg0.length <= local23) {
									return 0;
								}
								local11 = local13 + 1;
								local21 = -1;
								local9 -= local15;
								local13 = -1;
							} else {
								arg0[local23] = arg2.substring(local11, local62);
								local23++;
								if (arg0.length <= local23) {
									return 0;
								}
								local21 = -1;
								local13 = -1;
								local11 = local62;
								local9 = local44;
							}
						}
						if (local42 == 45) {
							local15 = local9;
							local17 = 0;
							local13 = local33;
						}
					}
				}
			}
		}
		if (arg2.length() > local11) {
			arg0[local23] = arg2.substring(local11, arg2.length());
			local23++;
		}
		return local23;
	}
}
