import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!pa", name = "vc", descriptor = "[I")
	public static int[] anIntArray244 = new int[128];

	@OriginalMember(owner = "client!pa", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!pa", name = "Lb", descriptor = "I")
	public int anInt2030;

	@OriginalMember(owner = "client!pa", name = "Rb", descriptor = "I")
	private int anInt2033;

	@OriginalMember(owner = "client!pa", name = "Tb", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!pa", name = "Ub", descriptor = "[Lclient!pc;")
	public Class47[] aClass47Array1;

	@OriginalMember(owner = "client!pa", name = "Wb", descriptor = "[Lclient!pc;")
	public Class47[] aClass47Array2;

	@OriginalMember(owner = "client!pa", name = "Xb", descriptor = "I")
	public int anInt2035;

	@OriginalMember(owner = "client!pa", name = "Yb", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!pa", name = "Zb", descriptor = "I")
	public int anInt2036;

	@OriginalMember(owner = "client!pa", name = "dc", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!pa", name = "gc", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!pa", name = "ic", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!pa", name = "lc", descriptor = "I")
	public int anInt2038;

	@OriginalMember(owner = "client!pa", name = "pc", descriptor = "I")
	private int anInt2039;

	@OriginalMember(owner = "client!pa", name = "Qb", descriptor = "I")
	public int anInt2032 = 0;

	@OriginalMember(owner = "client!pa", name = "Mb", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!pa", name = "cc", descriptor = "I")
	private int anInt2037 = 0;

	@OriginalMember(owner = "client!pa", name = "Pb", descriptor = "I")
	public int anInt2031 = 0;

	@OriginalMember(owner = "client!pa", name = "tc", descriptor = "I")
	private int anInt2040 = 0;

	@OriginalMember(owner = "client!pa", name = "kc", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!pa", name = "jc", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!pa", name = "Kb", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!pa", name = "ec", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!pa", name = "sc", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!pa", name = "Nb", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!pa", name = "bc", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!pa", name = "mc", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!pa", name = "qc", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!pa", name = "Vb", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!pa", name = "ac", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!pa", name = "hc", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!pa", name = "fc", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!pa", name = "Ob", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!pa", name = "nc", descriptor = "[I")
	private int[] anIntArray240;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray244[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray244[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray244[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray244[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray244[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class2_Sub3 local21 = new Class2_Sub3(arg0);
		@Pc(26) Class2_Sub3 local26 = new Class2_Sub3(arg0);
		@Pc(31) Class2_Sub3 local31 = new Class2_Sub3(arg0);
		@Pc(36) Class2_Sub3 local36 = new Class2_Sub3(arg0);
		@Pc(41) Class2_Sub3 local41 = new Class2_Sub3(arg0);
		local21.anInt1168 = arg0.length - 18;
		@Pc(51) int local51 = local21.method792();
		@Pc(55) int local55 = local21.method792();
		@Pc(59) int local59 = local21.method791();
		@Pc(63) int local63 = local21.method791();
		@Pc(67) int local67 = local21.method791();
		@Pc(71) int local71 = local21.method791();
		@Pc(75) int local75 = local21.method791();
		@Pc(79) int local79 = local21.method791();
		@Pc(83) int local83 = local21.method792();
		@Pc(87) int local87 = local21.method792();
		@Pc(91) int local91 = local21.method792();
		@Pc(95) int local95 = local21.method792();
		@Pc(97) byte local97 = 0;
		@Pc(103) int local103 = local97 + local51;
		@Pc(105) int local105 = local103;
		local103 += local55;
		@Pc(111) int local111 = local103;
		if (local67 == 255) {
			local103 += local55;
		} else {
			local111 = -local67 - 1;
		}
		@Pc(126) int local126 = local103;
		if (local75 == 1) {
			local103 += local55;
		} else {
			local126 = -1;
		}
		@Pc(138) int local138 = local103;
		if (local63 == 1) {
			local103 += local55;
		} else {
			local138 = -1;
		}
		@Pc(150) int local150 = local103;
		if (local79 == 1) {
			local103 += local51;
		} else {
			local150 = -1;
		}
		@Pc(162) int local162 = local103;
		if (local71 == 1) {
			local103 += local55;
		} else {
			local162 = -1;
		}
		@Pc(174) int local174 = local103;
		local103 += local95;
		@Pc(180) int local180 = local103;
		local103 += local55 * 2;
		@Pc(188) int local188 = local103;
		local103 += local59 * 6;
		@Pc(196) int local196 = local103;
		local103 += local83;
		@Pc(202) int local202 = local103;
		local103 += local87;
		this.anInt2031 = local51;
		this.anInt2032 = local55;
		this.anInt2037 = local59;
		this.anIntArray238 = new int[local51];
		this.anIntArray237 = new int[local51];
		this.anIntArray225 = new int[local51];
		this.anIntArray232 = new int[local55];
		this.anIntArray243 = new int[local55];
		this.anIntArray226 = new int[local55];
		this.anIntArray230 = new int[local59];
		this.anIntArray239 = new int[local59];
		this.anIntArray242 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray228 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray229 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray235 = new int[local55];
		} else {
			this.anInt2040 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray233 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray227 = new int[local55];
		}
		this.anIntArray240 = new int[local55];
		local21.anInt1168 = local97;
		local26.anInt1168 = local196;
		local31.anInt1168 = local202;
		local36.anInt1168 = local103;
		local41.anInt1168 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method791();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method805();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method805();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method805();
			}
			this.anIntArray238[local321] = local315 + local328;
			this.anIntArray237[local321] = local317 + local338;
			this.anIntArray225[local321] = local319 + local348;
			local315 = this.anIntArray238[local321];
			local317 = this.anIntArray237[local321];
			local319 = this.anIntArray225[local321];
			if (this.anIntArray228 != null) {
				this.anIntArray228[local321] = local41.method791();
			}
		}
		local21.anInt1168 = local180;
		local26.anInt1168 = local138;
		local31.anInt1168 = local111;
		local36.anInt1168 = local162;
		local41.anInt1168 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray240[local326] = local21.method792();
			if (this.anIntArray229 != null) {
				this.anIntArray229[local326] = local26.method791();
			}
			if (this.anIntArray235 != null) {
				this.anIntArray235[local326] = local31.method791();
			}
			if (this.anIntArray233 != null) {
				this.anIntArray233[local326] = local36.method791();
			}
			if (this.anIntArray227 != null) {
				this.anIntArray227[local326] = local41.method791();
			}
		}
		local21.anInt1168 = local174;
		local26.anInt1168 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method791();
			if (local496 == 1) {
				local328 = local21.method805() + local489;
				local338 = local21.method805() + local328;
				local348 = local21.method805() + local338;
				local489 = local348;
				this.anIntArray232[local491] = local328;
				this.anIntArray243[local491] = local338;
				this.anIntArray226[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method805() + local489;
				local489 = local348;
				this.anIntArray232[local491] = local328;
				this.anIntArray243[local491] = local338;
				this.anIntArray226[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method805() + local489;
				local489 = local348;
				this.anIntArray232[local491] = local328;
				this.anIntArray243[local491] = local338;
				this.anIntArray226[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method805() + local489;
				local489 = local348;
				this.anIntArray232[local491] = local328;
				this.anIntArray243[local491] = local599;
				this.anIntArray226[local491] = local348;
			}
		}
		local21.anInt1168 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray230[local496] = local21.method792();
			this.anIntArray239[local496] = local21.method792();
			this.anIntArray242[local496] = local21.method792();
		}
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1_Sub5() {
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([Lclient!pa;I)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) Class2_Sub1_Sub1_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2031 = 0;
		this.anInt2032 = 0;
		this.anInt2037 = 0;
		this.anInt2040 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub1_Sub5 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2031 += local43.anInt2031;
				this.anInt2032 += local43.anInt2032;
				this.anInt2037 += local43.anInt2037;
				local18 |= local43.anIntArray229 != null;
				if (local43.anIntArray235 == null) {
					if (this.anInt2040 == -1) {
						this.anInt2040 = local43.anInt2040;
					}
					if (this.anInt2040 != local43.anInt2040) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray233 != null;
				local24 |= local43.anIntArray227 != null;
			}
		}
		this.anIntArray238 = new int[this.anInt2031];
		this.anIntArray237 = new int[this.anInt2031];
		this.anIntArray225 = new int[this.anInt2031];
		this.anIntArray228 = new int[this.anInt2031];
		this.anIntArray232 = new int[this.anInt2032];
		this.anIntArray243 = new int[this.anInt2032];
		this.anIntArray226 = new int[this.anInt2032];
		this.anIntArray230 = new int[this.anInt2037];
		this.anIntArray239 = new int[this.anInt2037];
		this.anIntArray242 = new int[this.anInt2037];
		if (local18) {
			this.anIntArray229 = new int[this.anInt2032];
		}
		if (local20) {
			this.anIntArray235 = new int[this.anInt2032];
		}
		if (local22) {
			this.anIntArray233 = new int[this.anInt2032];
		}
		if (local24) {
			this.anIntArray227 = new int[this.anInt2032];
		}
		this.anIntArray240 = new int[this.anInt2032];
		this.anInt2031 = 0;
		this.anInt2032 = 0;
		this.anInt2037 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class2_Sub1_Sub1_Sub5 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt2032; local223++) {
					if (local18) {
						if (local219.anIntArray229 == null) {
							this.anIntArray229[this.anInt2032] = 0;
						} else {
							local241 = local219.anIntArray229[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray229[this.anInt2032] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray235 == null) {
							this.anIntArray235[this.anInt2032] = local219.anInt2040;
						} else {
							this.anIntArray235[this.anInt2032] = local219.anIntArray235[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray233 == null) {
							this.anIntArray233[this.anInt2032] = 0;
						} else {
							this.anIntArray233[this.anInt2032] = local219.anIntArray233[local223];
						}
					}
					if (local24 && local219.anIntArray227 != null) {
						this.anIntArray227[this.anInt2032] = local219.anIntArray227[local223];
					}
					this.anIntArray240[this.anInt2032] = local219.anIntArray240[local223];
					this.anIntArray232[this.anInt2032] = this.method1430(local219, local219.anIntArray232[local223]);
					this.anIntArray243[this.anInt2032] = this.method1430(local219, local219.anIntArray243[local223]);
					this.anIntArray226[this.anInt2032] = this.method1430(local219, local219.anIntArray226[local223]);
					this.anInt2032++;
				}
				for (local241 = 0; local241 < local219.anInt2037; local241++) {
					this.anIntArray230[this.anInt2037] = this.method1430(local219, local219.anIntArray230[local241]);
					this.anIntArray239[this.anInt2037] = this.method1430(local219, local219.anIntArray239[local241]);
					this.anIntArray242[this.anInt2037] = this.method1430(local219, local219.anIntArray242[local241]);
					this.anInt2037++;
				}
				local212 += local219.anInt2037;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([Lclient!pa;IZ)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) Class2_Sub1_Sub1_Sub5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2031 = 0;
		this.anInt2032 = 0;
		this.anInt2037 = 0;
		this.anInt2040 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub1_Sub5 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2031 += local43.anInt2031;
				this.anInt2032 += local43.anInt2032;
				this.anInt2037 += local43.anInt2037;
				local18 |= local43.anIntArray229 != null;
				if (local43.anIntArray235 == null) {
					if (this.anInt2040 == -1) {
						this.anInt2040 = local43.anInt2040;
					}
					if (this.anInt2040 != local43.anInt2040) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray233 != null;
				local24 |= local43.anIntArray240 != null;
			}
		}
		this.anIntArray238 = new int[this.anInt2031];
		this.anIntArray237 = new int[this.anInt2031];
		this.anIntArray225 = new int[this.anInt2031];
		this.anIntArray232 = new int[this.anInt2032];
		this.anIntArray243 = new int[this.anInt2032];
		this.anIntArray226 = new int[this.anInt2032];
		this.anIntArray234 = new int[this.anInt2032];
		this.anIntArray231 = new int[this.anInt2032];
		this.anIntArray236 = new int[this.anInt2032];
		this.anIntArray230 = new int[this.anInt2037];
		this.anIntArray239 = new int[this.anInt2037];
		this.anIntArray242 = new int[this.anInt2037];
		if (local18) {
			this.anIntArray229 = new int[this.anInt2032];
		}
		if (local20) {
			this.anIntArray235 = new int[this.anInt2032];
		}
		if (local22) {
			this.anIntArray233 = new int[this.anInt2032];
		}
		if (local24) {
			this.anIntArray240 = new int[this.anInt2032];
		}
		this.anInt2031 = 0;
		this.anInt2032 = 0;
		this.anInt2037 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class2_Sub1_Sub1_Sub5 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt2031;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt2031; local231++) {
					this.anIntArray238[this.anInt2031] = local224.anIntArray238[local231];
					this.anIntArray237[this.anInt2031] = local224.anIntArray237[local231];
					this.anIntArray225[this.anInt2031] = local224.anIntArray225[local231];
					this.anInt2031++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt2032; local272++) {
					this.anIntArray232[this.anInt2032] = local224.anIntArray232[local272] + local229;
					this.anIntArray243[this.anInt2032] = local224.anIntArray243[local272] + local229;
					this.anIntArray226[this.anInt2032] = local224.anIntArray226[local272] + local229;
					this.anIntArray234[this.anInt2032] = local224.anIntArray234[local272];
					this.anIntArray231[this.anInt2032] = local224.anIntArray231[local272];
					this.anIntArray236[this.anInt2032] = local224.anIntArray236[local272];
					if (local18) {
						if (local224.anIntArray229 == null) {
							this.anIntArray229[this.anInt2032] = 0;
						} else {
							local350 = local224.anIntArray229[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray229[this.anInt2032] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray235 == null) {
							this.anIntArray235[this.anInt2032] = local224.anInt2040;
						} else {
							this.anIntArray235[this.anInt2032] = local224.anIntArray235[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray233 == null) {
							this.anIntArray233[this.anInt2032] = 0;
						} else {
							this.anIntArray233[this.anInt2032] = local224.anIntArray233[local272];
						}
					}
					if (local24 && local224.anIntArray240 != null) {
						this.anIntArray240[this.anInt2032] = local224.anIntArray240[local272];
					}
					this.anInt2032++;
				}
				for (local350 = 0; local350 < local224.anInt2037; local350++) {
					this.anIntArray230[this.anInt2037] = local224.anIntArray230[local350] + local229;
					this.anIntArray239[this.anInt2037] = local224.anIntArray239[local350] + local229;
					this.anIntArray242[this.anInt2037] = local224.anIntArray242[local350] + local229;
					this.anInt2037++;
				}
				local217 += local224.anInt2037;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!pa;ZZZ)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2031 = arg0.anInt2031;
		this.anInt2032 = arg0.anInt2032;
		this.anInt2037 = arg0.anInt2037;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray238 = arg0.anIntArray238;
			this.anIntArray237 = arg0.anIntArray237;
			this.anIntArray225 = arg0.anIntArray225;
		} else {
			this.anIntArray238 = new int[this.anInt2031];
			this.anIntArray237 = new int[this.anInt2031];
			this.anIntArray225 = new int[this.anInt2031];
			for (local60 = 0; local60 < this.anInt2031; local60++) {
				this.anIntArray238[local60] = arg0.anIntArray238[local60];
				this.anIntArray237[local60] = arg0.anIntArray237[local60];
				this.anIntArray225[local60] = arg0.anIntArray225[local60];
			}
		}
		if (arg2) {
			this.anIntArray240 = arg0.anIntArray240;
		} else {
			this.anIntArray240 = new int[this.anInt2032];
			for (local60 = 0; local60 < this.anInt2032; local60++) {
				this.anIntArray240[local60] = arg0.anIntArray240[local60];
			}
		}
		this.anIntArray233 = arg0.anIntArray233;
		this.anIntArray228 = arg0.anIntArray228;
		this.anIntArray227 = arg0.anIntArray227;
		this.anIntArray229 = arg0.anIntArray229;
		this.anIntArray232 = arg0.anIntArray232;
		this.anIntArray243 = arg0.anIntArray243;
		this.anIntArray226 = arg0.anIntArray226;
		this.anIntArray235 = arg0.anIntArray235;
		this.anInt2040 = arg0.anInt2040;
		this.anIntArray230 = arg0.anIntArray230;
		this.anIntArray239 = arg0.anIntArray239;
		this.anIntArray242 = arg0.anIntArray242;
		this.aBoolean111 = arg0.aBoolean111;
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!pa;ZZ)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt2031 = arg0.anInt2031;
		this.anInt2032 = arg0.anInt2032;
		this.anInt2037 = arg0.anInt2037;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray237 = new int[this.anInt2031];
			for (local37 = 0; local37 < this.anInt2031; local37++) {
				this.anIntArray237[local37] = arg0.anIntArray237[local37];
			}
		} else {
			this.anIntArray237 = arg0.anIntArray237;
		}
		if (arg2) {
			this.anIntArray234 = new int[this.anInt2032];
			this.anIntArray231 = new int[this.anInt2032];
			this.anIntArray236 = new int[this.anInt2032];
			for (local37 = 0; local37 < this.anInt2032; local37++) {
				this.anIntArray234[local37] = arg0.anIntArray234[local37];
				this.anIntArray231[local37] = arg0.anIntArray231[local37];
				this.anIntArray236[local37] = arg0.anIntArray236[local37];
			}
			this.anIntArray229 = new int[this.anInt2032];
			@Pc(115) int local115;
			if (arg0.anIntArray229 == null) {
				for (local115 = 0; local115 < this.anInt2032; local115++) {
					this.anIntArray229[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt2032; local115++) {
					this.anIntArray229[local115] = arg0.anIntArray229[local115];
				}
			}
			this.aClass47Array2 = new Class47[this.anInt2031];
			for (local115 = 0; local115 < this.anInt2031; local115++) {
				@Pc(160) Class47 local160 = this.aClass47Array2[local115] = new Class47();
				@Pc(165) Class47 local165 = arg0.aClass47Array2[local115];
				local160.anInt2068 = local165.anInt2068;
				local160.anInt2066 = local165.anInt2066;
				local160.anInt2069 = local165.anInt2069;
				local160.anInt2075 = local165.anInt2075;
			}
			this.aClass47Array1 = arg0.aClass47Array1;
		} else {
			this.anIntArray234 = arg0.anIntArray234;
			this.anIntArray231 = arg0.anIntArray231;
			this.anIntArray236 = arg0.anIntArray236;
			this.anIntArray229 = arg0.anIntArray229;
		}
		this.anIntArray238 = arg0.anIntArray238;
		this.anIntArray225 = arg0.anIntArray225;
		this.anIntArray240 = arg0.anIntArray240;
		this.anIntArray233 = arg0.anIntArray233;
		this.anIntArray235 = arg0.anIntArray235;
		this.anInt2040 = arg0.anInt2040;
		this.anIntArray232 = arg0.anIntArray232;
		this.anIntArray243 = arg0.anIntArray243;
		this.anIntArray226 = arg0.anIntArray226;
		this.anIntArray230 = arg0.anIntArray230;
		this.anIntArray239 = arg0.anIntArray239;
		this.anIntArray242 = arg0.anIntArray242;
		this.aBoolean111 = arg0.aBoolean111;
		this.anInt2039 = arg0.anInt2039;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
	public void method1400() {
		if (this.anInt2033 == 1) {
			return;
		}
		this.anInt2033 = 1;
		super.anInt2698 = 0;
		this.anInt2035 = 0;
		this.anInt2034 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2031; local18++) {
			@Pc(24) int local24 = this.anIntArray238[local18];
			@Pc(29) int local29 = this.anIntArray237[local18];
			@Pc(34) int local34 = this.anIntArray225[local18];
			if (-local29 > super.anInt2698) {
				super.anInt2698 = -local29;
			}
			if (local29 > this.anInt2035) {
				this.anInt2035 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2034) {
				this.anInt2034 = local58;
			}
		}
		this.anInt2034 = (int) (Math.sqrt((double) this.anInt2034) + 0.99D);
		this.anInt2038 = (int) (Math.sqrt((double) (this.anInt2034 * this.anInt2034 + super.anInt2698 * super.anInt2698)) + 0.99D);
		this.anInt2030 = this.anInt2038 + (int) (Math.sqrt((double) (this.anInt2034 * this.anInt2034 + this.anInt2035 * this.anInt2035)) + 0.99D);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt2033 != 1) {
			this.method1400();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt2034 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt2034 << 9;
		if (local60 / local36 >= Static24.anInt988) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt2034 << 9;
		if (local73 / local36 <= Static24.anInt992) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt2034 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static24.anInt989) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2698 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static24.anInt991) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2698 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt2037 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static75.aBoolean112) {
			local168 = local25 - local32;
			if (local168 <= 50) {
				local168 = 50;
			}
			if (local53 > 0) {
				local60 /= local36;
				local73 /= local168;
			} else {
				local73 /= local36;
				local60 /= local168;
			}
			if (local89 > 0) {
				local123 /= local36;
				local102 /= local168;
			} else {
				local102 /= local36;
				local123 /= local168;
			}
			local215 = Static75.anInt2046 - Static24.anInt990;
			local219 = Static75.anInt2041 - Static24.anInt986;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean111) {
					Static75.anIntArray251[Static75.anInt2045++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static24.anInt990;
		local215 = Static24.anInt986;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static75.anIntArray254[arg0];
			local253 = Static75.anIntArray256[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt2031; local265++) {
			@Pc(271) int local271 = this.anIntArray238[local265];
			@Pc(276) int local276 = this.anIntArray237[local265];
			@Pc(281) int local281 = this.anIntArray225[local265];
			@Pc(293) int local293;
			if (arg0 != 0) {
				local293 = local281 * local219 + local271 * local253 >> 16;
				local281 = local281 * local253 - local271 * local219 >> 16;
				local271 = local293;
			}
			local271 += arg5;
			local276 += arg6;
			local281 += arg7;
			local293 = local281 * arg3 + local271 * arg4 >> 16;
			local281 = local281 * arg4 - local271 * arg3 >> 16;
			local271 = local293;
			local293 = local276 * arg2 - local281 * arg1 >> 16;
			local281 = local276 * arg1 + local281 * arg2 >> 16;
			Static75.anIntArray252[local265] = local281 - local25;
			if (local281 >= 50) {
				Static75.anIntArray250[local265] = local168 + (local271 << 9) / local281;
				Static75.anIntArray248[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static75.anIntArray250[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static75.anIntArray261[local265] = local271;
				Static75.anIntArray247[local265] = local293;
				Static75.anIntArray260[local265] = local281;
			}
		}
		try {
			this.method1416(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V")
	public void method1402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.anInt2033 != 2 && this.anInt2033 != 1) {
			this.method1428();
		}
		@Pc(11) int local11 = Static24.anInt990;
		@Pc(13) int local13 = Static24.anInt986;
		@Pc(17) int local17 = Static75.anIntArray254[0];
		@Pc(21) int local21 = Static75.anIntArray256[0];
		@Pc(25) int local25 = Static75.anIntArray254[arg0];
		@Pc(29) int local29 = Static75.anIntArray256[arg0];
		@Pc(33) int local33 = Static75.anIntArray254[arg1];
		@Pc(37) int local37 = Static75.anIntArray256[arg1];
		@Pc(41) int local41 = Static75.anIntArray254[arg2];
		@Pc(45) int local45 = Static75.anIntArray256[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2031; local57++) {
			@Pc(63) int local63 = this.anIntArray238[local57];
			@Pc(68) int local68 = this.anIntArray237[local57];
			@Pc(73) int local73 = this.anIntArray225[local57];
			@Pc(85) int local85;
			if (arg1 != 0) {
				local85 = local68 * local33 + local63 * local37 >> 16;
				local68 = local68 * local37 - local63 * local33 >> 16;
				local63 = local85;
			}
			if (arg0 != 0) {
				local85 = local73 * local25 + local63 * local29 >> 16;
				local73 = local73 * local29 - local63 * local25 >> 16;
				local63 = local85;
			}
			local63 += arg3;
			local68 += arg4;
			local73 += arg5;
			local85 = local68 * local45 - local73 * local41 >> 16;
			local73 = local68 * local41 + local73 * local45 >> 16;
			Static75.anIntArray252[local57] = local73 - local55;
			Static75.anIntArray250[local57] = local11 + (local63 << 9) / arg6;
			Static75.anIntArray248[local57] = local13 + (local85 << 9) / arg6;
			if (this.anInt2037 > 0) {
				Static75.anIntArray261[local57] = local63;
				Static75.anIntArray247[local57] = local85;
				Static75.anIntArray260[local57] = local73;
			}
		}
		try {
			this.method1416(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIZ)V")
	public void method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray234 == null) {
			this.anIntArray234 = new int[this.anInt2032];
			this.anIntArray231 = new int[this.anInt2032];
			this.anIntArray236 = new int[this.anInt2032];
		}
		@Pc(48) int local48;
		if (this.aClass47Array2 == null) {
			this.aClass47Array2 = new Class47[this.anInt2031];
			for (local48 = 0; local48 < this.anInt2031; local48++) {
				this.aClass47Array2[local48] = new Class47();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt2032; local48++) {
			local69 = this.anIntArray232[local48];
			@Pc(74) int local74 = this.anIntArray243[local48];
			@Pc(79) int local79 = this.anIntArray226[local48];
			@Pc(89) int local89 = this.anIntArray238[local74] - this.anIntArray238[local69];
			@Pc(99) int local99 = this.anIntArray237[local74] - this.anIntArray237[local69];
			@Pc(109) int local109 = this.anIntArray225[local74] - this.anIntArray225[local69];
			@Pc(119) int local119 = this.anIntArray238[local79] - this.anIntArray238[local69];
			@Pc(129) int local129 = this.anIntArray237[local79] - this.anIntArray237[local69];
			@Pc(139) int local139 = this.anIntArray225[local79] - this.anIntArray225[local69];
			@Pc(147) int local147 = local99 * local139 - local129 * local109;
			@Pc(155) int local155 = local109 * local119 - local139 * local89;
			@Pc(163) int local163;
			for (local163 = local89 * local129 - local119 * local99; local147 > 8192 || local155 > 8192 || local163 > 8192 || local147 < -8192 || local155 < -8192 || local163 < -8192; local163 >>= 0x1) {
				local147 >>= 0x1;
				local155 >>= 0x1;
			}
			@Pc(209) int local209 = (int) Math.sqrt((double) (local147 * local147 + local155 * local155 + local163 * local163));
			if (local209 <= 0) {
				local209 = 1;
			}
			local147 = local147 * 256 / local209;
			local155 = local155 * 256 / local209;
			local163 = local163 * 256 / local209;
			if (this.anIntArray229 == null || (this.anIntArray229[local48] & 0x1) == 0) {
				@Pc(246) Class47 local246 = this.aClass47Array2[local69];
				local246.anInt2068 += local147;
				local246.anInt2066 += local155;
				local246.anInt2069 += local163;
				local246.anInt2075++;
				@Pc(275) Class47 local275 = this.aClass47Array2[local74];
				local275.anInt2068 += local147;
				local275.anInt2066 += local155;
				local275.anInt2069 += local163;
				local275.anInt2075++;
				@Pc(304) Class47 local304 = this.aClass47Array2[local79];
				local304.anInt2068 += local147;
				local304.anInt2066 += local155;
				local304.anInt2069 += local163;
				local304.anInt2075++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray234[local48] = Static75.method1417(this.anIntArray240[local48], local349, this.anIntArray229[local48]);
			}
		}
		if (arg5) {
			this.method1409(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass47Array1 = new Class47[this.anInt2031];
		for (local69 = 0; local69 < this.anInt2031; local69++) {
			@Pc(391) Class47 local391 = this.aClass47Array2[local69];
			@Pc(400) Class47 local400 = this.aClass47Array1[local69] = new Class47();
			local400.anInt2068 = local391.anInt2068;
			local400.anInt2066 = local391.anInt2066;
			local400.anInt2069 = local391.anInt2069;
			local400.anInt2075 = local391.anInt2075;
		}
		this.anInt2039 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)V")
	public void method1404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2032; local1++) {
			if (this.anIntArray240[local1] == arg0) {
				this.anIntArray240[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	public void method1405(@OriginalArg(0) int arg0) {
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		@Pc(9) int local9 = Static75.anIntArray254[arg0];
		@Pc(13) int local13 = Static75.anIntArray256[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2031; local15++) {
			@Pc(32) int local32 = this.anIntArray237[local15] * local13 - this.anIntArray225[local15] * local9 >> 16;
			this.anIntArray225[local15] = this.anIntArray237[local15] * local9 + this.anIntArray225[local15] * local13 >> 16;
			this.anIntArray237[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "()I")
	public int method1406() {
		this.method1400();
		return this.anInt2034;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1407(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static75.anIntArray253.length < this.anInt2032) {
			Static75.anIntArray253 = new int[this.anInt2032 + 100];
		}
		return this.method1421(arg0, Static75.aClass2_Sub1_Sub1_Sub5_3, Static75.anIntArray253);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
	private void method1409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2032; local1++) {
			local7 = this.anIntArray232[local1];
			@Pc(12) int local12 = this.anIntArray243[local1];
			@Pc(17) int local17 = this.anIntArray226[local1];
			@Pc(30) Class47 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray229 == null) {
				local25 = this.anIntArray240[local1];
				local30 = this.aClass47Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2068 + arg3 * local30.anInt2066 + arg4 * local30.anInt2069) / (arg1 * local30.anInt2075);
				this.anIntArray234[local1] = Static75.method1417(local25, local52, 0);
				@Pc(65) Class47 local65 = this.aClass47Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt2068 + arg3 * local65.anInt2066 + arg4 * local65.anInt2069) / (arg1 * local65.anInt2075);
				this.anIntArray231[local1] = Static75.method1417(local25, local87, 0);
				@Pc(100) Class47 local100 = this.aClass47Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt2068 + arg3 * local100.anInt2066 + arg4 * local100.anInt2069) / (arg1 * local100.anInt2075);
				this.anIntArray236[local1] = Static75.method1417(local25, local122, 0);
			} else if ((this.anIntArray229[local1] & 0x1) == 0) {
				local25 = this.anIntArray240[local1];
				@Pc(148) int local148 = this.anIntArray229[local1];
				local30 = this.aClass47Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2068 + arg3 * local30.anInt2066 + arg4 * local30.anInt2069) / (arg1 * local30.anInt2075);
				this.anIntArray234[local1] = Static75.method1417(local25, local52, local148);
				local30 = this.aClass47Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt2068 + arg3 * local30.anInt2066 + arg4 * local30.anInt2069) / (arg1 * local30.anInt2075);
				this.anIntArray231[local1] = Static75.method1417(local25, local52, local148);
				local30 = this.aClass47Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt2068 + arg3 * local30.anInt2066 + arg4 * local30.anInt2069) / (arg1 * local30.anInt2075);
				this.anIntArray236[local1] = Static75.method1417(local25, local52, local148);
			}
		}
		this.aClass47Array2 = null;
		this.aClass47Array1 = null;
		this.anIntArray228 = null;
		this.anIntArray227 = null;
		if (this.anIntArray229 != null) {
			for (local7 = 0; local7 < this.anInt2032; local7++) {
				if ((this.anIntArray229[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray240 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!t;ILclient!t;I[I)V")
	public void method1410(@OriginalArg(0) Class2_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1426(arg0, arg1);
			return;
		}
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		@Pc(24) Class42 local24 = arg0.aClass42Array1[arg1];
		@Pc(29) Class42 local29 = arg2.aClass42Array1[arg3];
		@Pc(32) Class2_Sub13 local32 = local24.aClass2_Sub13_1;
		Static75.anInt2044 = 0;
		Static75.anInt2043 = 0;
		Static75.anInt2042 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt1960; local47++) {
			local53 = local24.anIntArray212[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray336[local53] == 0) {
				this.method1412(local32.anIntArray336[local53], local32.anIntArrayArray26[local53], local24.anIntArray211[local47], local24.anIntArray214[local47], local24.anIntArray213[local47]);
			}
		}
		Static75.anInt2044 = 0;
		Static75.anInt2043 = 0;
		Static75.anInt2042 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt1960; local53++) {
			@Pc(118) int local118 = local29.anIntArray212[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray336[local118] == 0) {
				this.method1412(local32.anIntArray336[local118], local32.anIntArrayArray26[local118], local29.anIntArray211[local53], local29.anIntArray214[local53], local29.anIntArray213[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
	public void method1411() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray228 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2031; local9++) {
				local15 = this.anIntArray228[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray14 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray14[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2031) {
				local65 = this.anIntArray228[local59];
				this.anIntArrayArray14[local65][local5[local65]++] = local59++;
			}
			this.anIntArray228 = null;
		}
		if (this.anIntArray227 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2032; local9++) {
			local15 = this.anIntArray227[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray15 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray15[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2032) {
			local65 = this.anIntArray227[local59];
			this.anIntArrayArray15[local65][local5[local65]++] = local59++;
		}
		this.anIntArray227 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[IIII)V")
	private void method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static75.anInt2044 = 0;
			Static75.anInt2043 = 0;
			Static75.anInt2042 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray14.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray14[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static75.anInt2044 += this.anIntArray238[local36];
						Static75.anInt2043 += this.anIntArray237[local36];
						Static75.anInt2042 += this.anIntArray225[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static75.anInt2044 = Static75.anInt2044 / local6 + arg2;
				Static75.anInt2043 = Static75.anInt2043 / local6 + arg3;
				Static75.anInt2042 = Static75.anInt2042 / local6 + arg4;
			} else {
				Static75.anInt2044 = arg2;
				Static75.anInt2043 = arg3;
				Static75.anInt2042 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray14.length) {
					local115 = this.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray238[local31] += arg2;
						this.anIntArray237[local31] += arg3;
						this.anIntArray225[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray14.length) {
					local115 = this.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray238[local31] -= Static75.anInt2044;
						this.anIntArray237[local31] -= Static75.anInt2043;
						this.anIntArray225[local31] -= Static75.anInt2042;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static75.anIntArray254[local225];
							local235 = Static75.anIntArray256[local225];
							local251 = this.anIntArray237[local31] * local231 + this.anIntArray238[local31] * local235 >> 16;
							this.anIntArray237[local31] = this.anIntArray237[local31] * local235 - this.anIntArray238[local31] * local231 >> 16;
							this.anIntArray238[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static75.anIntArray254[local36];
							local235 = Static75.anIntArray256[local36];
							local251 = this.anIntArray237[local31] * local235 - this.anIntArray225[local31] * local231 >> 16;
							this.anIntArray225[local31] = this.anIntArray237[local31] * local231 + this.anIntArray225[local31] * local235 >> 16;
							this.anIntArray237[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static75.anIntArray254[local219];
							local235 = Static75.anIntArray256[local219];
							local251 = this.anIntArray225[local31] * local231 + this.anIntArray238[local31] * local235 >> 16;
							this.anIntArray225[local31] = this.anIntArray225[local31] * local235 - this.anIntArray238[local31] * local231 >> 16;
							this.anIntArray238[local31] = local251;
						}
						this.anIntArray238[local31] += Static75.anInt2044;
						this.anIntArray237[local31] += Static75.anInt2043;
						this.anIntArray225[local31] += Static75.anInt2042;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray14.length) {
					local115 = this.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray238[local31] -= Static75.anInt2044;
						this.anIntArray237[local31] -= Static75.anInt2043;
						this.anIntArray225[local31] -= Static75.anInt2042;
						this.anIntArray238[local31] = this.anIntArray238[local31] * arg2 / 128;
						this.anIntArray237[local31] = this.anIntArray237[local31] * arg3 / 128;
						this.anIntArray225[local31] = this.anIntArray225[local31] * arg4 / 128;
						this.anIntArray238[local31] += Static75.anInt2044;
						this.anIntArray237[local31] += Static75.anInt2043;
						this.anIntArray225[local31] += Static75.anInt2042;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray15 != null && this.anIntArray233 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray15.length) {
					local115 = this.anIntArrayArray15[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray233[local31] += arg2 * 8;
						if (this.anIntArray233[local31] < 0) {
							this.anIntArray233[local31] = 0;
						}
						if (this.anIntArray233[local31] > 255) {
							this.anIntArray233[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
	public void method1413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt2033 != 2 && this.anInt2033 != 1) {
			this.method1428();
		}
		@Pc(11) int local11 = Static24.anInt990;
		@Pc(13) int local13 = Static24.anInt986;
		@Pc(17) int local17 = Static75.anIntArray254[0];
		@Pc(21) int local21 = Static75.anIntArray256[0];
		@Pc(25) int local25 = Static75.anIntArray254[arg0];
		@Pc(29) int local29 = Static75.anIntArray256[arg0];
		@Pc(33) int local33 = Static75.anIntArray254[arg1];
		@Pc(37) int local37 = Static75.anIntArray256[arg1];
		@Pc(41) int local41 = Static75.anIntArray254[arg2];
		@Pc(45) int local45 = Static75.anIntArray256[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2031; local57++) {
			@Pc(63) int local63 = this.anIntArray238[local57];
			@Pc(68) int local68 = this.anIntArray237[local57];
			@Pc(73) int local73 = this.anIntArray225[local57];
			@Pc(85) int local85;
			if (arg1 != 0) {
				local85 = local68 * local33 + local63 * local37 >> 16;
				local68 = local68 * local37 - local63 * local33 >> 16;
				local63 = local85;
			}
			if (arg0 != 0) {
				local85 = local73 * local25 + local63 * local29 >> 16;
				local73 = local73 * local29 - local63 * local25 >> 16;
				local63 = local85;
			}
			local63 += arg3;
			local68 += arg4;
			local73 += arg5;
			local85 = local68 * local45 - local73 * local41 >> 16;
			local73 = local68 * local41 + local73 * local45 >> 16;
			Static75.anIntArray252[local57] = local73 - local55;
			Static75.anIntArray250[local57] = local11 + (local63 << 9) / local73;
			Static75.anIntArray248[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt2037 > 0) {
				Static75.anIntArray261[local57] = local63;
				Static75.anIntArray247[local57] = local85;
				Static75.anIntArray260[local57] = local73;
			}
		}
		try {
			this.method1416(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
	public void method1414() {
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2031; local7++) {
			@Pc(13) int local13 = this.anIntArray238[local7];
			this.anIntArray238[local7] = this.anIntArray225[local7];
			this.anIntArray225[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V")
	private void method1415(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static24.anInt990;
		@Pc(3) int local3 = Static24.anInt986;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray232[arg0];
		@Pc(15) int local15 = this.anIntArray243[arg0];
		@Pc(20) int local20 = this.anIntArray226[arg0];
		@Pc(24) int local24 = Static75.anIntArray260[local10];
		@Pc(28) int local28 = Static75.anIntArray260[local15];
		@Pc(32) int local32 = Static75.anIntArray260[local20];
		if (this.anIntArray233 == null) {
			Static24.anInt987 = 0;
		} else {
			Static24.anInt987 = this.anIntArray233[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static75.anIntArray263[0] = Static75.anIntArray250[local10];
			Static75.anIntArray249[0] = Static75.anIntArray248[local10];
			local5++;
			Static75.anIntArray259[0] = this.anIntArray234[arg0];
		} else {
			local71 = Static75.anIntArray261[local10];
			local75 = Static75.anIntArray247[local10];
			local80 = this.anIntArray234[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static75.anIntArray264[local32 - local24];
				Static75.anIntArray263[0] = local1 + (local71 + ((Static75.anIntArray261[local20] - local71) * local93 >> 16) << 9) / 50;
				Static75.anIntArray249[0] = local3 + (local75 + ((Static75.anIntArray247[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static75.anIntArray259[0] = local80 + ((this.anIntArray236[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static75.anIntArray264[local28 - local24];
				Static75.anIntArray263[local5] = local1 + (local71 + ((Static75.anIntArray261[local15] - local71) * local93 >> 16) << 9) / 50;
				Static75.anIntArray249[local5] = local3 + (local75 + ((Static75.anIntArray247[local15] - local75) * local93 >> 16) << 9) / 50;
				Static75.anIntArray259[local5++] = local80 + ((this.anIntArray231[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static75.anIntArray263[local5] = Static75.anIntArray250[local15];
			Static75.anIntArray249[local5] = Static75.anIntArray248[local15];
			Static75.anIntArray259[local5++] = this.anIntArray231[arg0];
		} else {
			local71 = Static75.anIntArray261[local15];
			local75 = Static75.anIntArray247[local15];
			local80 = this.anIntArray231[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static75.anIntArray264[local24 - local28];
				Static75.anIntArray263[local5] = local1 + (local71 + ((Static75.anIntArray261[local10] - local71) * local93 >> 16) << 9) / 50;
				Static75.anIntArray249[local5] = local3 + (local75 + ((Static75.anIntArray247[local10] - local75) * local93 >> 16) << 9) / 50;
				Static75.anIntArray259[local5++] = local80 + ((this.anIntArray234[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static75.anIntArray264[local32 - local28];
				Static75.anIntArray263[local5] = local1 + (local71 + ((Static75.anIntArray261[local20] - local71) * local93 >> 16) << 9) / 50;
				Static75.anIntArray249[local5] = local3 + (local75 + ((Static75.anIntArray247[local20] - local75) * local93 >> 16) << 9) / 50;
				Static75.anIntArray259[local5++] = local80 + ((this.anIntArray236[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static75.anIntArray263[local5] = Static75.anIntArray250[local20];
			Static75.anIntArray249[local5] = Static75.anIntArray248[local20];
			Static75.anIntArray259[local5++] = this.anIntArray236[arg0];
		} else {
			local71 = Static75.anIntArray261[local20];
			local75 = Static75.anIntArray247[local20];
			local80 = this.anIntArray236[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static75.anIntArray264[local28 - local32];
				Static75.anIntArray263[local5] = local1 + (local71 + ((Static75.anIntArray261[local15] - local71) * local93 >> 16) << 9) / 50;
				Static75.anIntArray249[local5] = local3 + (local75 + ((Static75.anIntArray247[local15] - local75) * local93 >> 16) << 9) / 50;
				Static75.anIntArray259[local5++] = local80 + ((this.anIntArray231[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static75.anIntArray264[local24 - local32];
				Static75.anIntArray263[local5] = local1 + (local71 + ((Static75.anIntArray261[local10] - local71) * local93 >> 16) << 9) / 50;
				Static75.anIntArray249[local5] = local3 + (local75 + ((Static75.anIntArray247[local10] - local75) * local93 >> 16) << 9) / 50;
				Static75.anIntArray259[local5++] = local80 + ((this.anIntArray234[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static75.anIntArray263[0];
		local75 = Static75.anIntArray263[1];
		local80 = Static75.anIntArray263[2];
		local93 = Static75.anIntArray249[0];
		@Pc(588) int local588 = Static75.anIntArray249[1];
		@Pc(592) int local592 = Static75.anIntArray249[2];
		Static24.aBoolean43 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static24.anInt993 || local75 > Static24.anInt993 || local80 > Static24.anInt993) {
				Static24.aBoolean43 = true;
			}
			if (this.anIntArray229 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray229[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static24.method694(local93, local588, local592, local71, local75, local80, Static75.anIntArray259[0], Static75.anIntArray259[1], Static75.anIntArray259[2]);
			} else if (local619 == 1) {
				Static24.method700(local93, local588, local592, local71, local75, local80, Static75.anIntArray246[this.anIntArray234[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray229[arg0] >> 2;
				local678 = this.anIntArray230[local673];
				local683 = this.anIntArray239[local673];
				local688 = this.anIntArray242[local673];
				Static24.method687(local93, local588, local592, local71, local75, local80, Static75.anIntArray259[0], Static75.anIntArray259[1], Static75.anIntArray259[2], Static75.anIntArray261[local678], Static75.anIntArray261[local683], Static75.anIntArray261[local688], Static75.anIntArray247[local678], Static75.anIntArray247[local683], Static75.anIntArray247[local688], Static75.anIntArray260[local678], Static75.anIntArray260[local683], Static75.anIntArray260[local688], this.anIntArray240[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray229[arg0] >> 2;
				local678 = this.anIntArray230[local673];
				local683 = this.anIntArray239[local673];
				local688 = this.anIntArray242[local673];
				Static24.method687(local93, local588, local592, local71, local75, local80, this.anIntArray234[arg0], this.anIntArray234[arg0], this.anIntArray234[arg0], Static75.anIntArray261[local678], Static75.anIntArray261[local683], Static75.anIntArray261[local688], Static75.anIntArray247[local678], Static75.anIntArray247[local683], Static75.anIntArray247[local688], Static75.anIntArray260[local678], Static75.anIntArray260[local683], Static75.anIntArray260[local688], this.anIntArray240[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static24.anInt993 || local75 > Static24.anInt993 || local80 > Static24.anInt993 || Static75.anIntArray263[3] < 0 || Static75.anIntArray263[3] > Static24.anInt993) {
			Static24.aBoolean43 = true;
		}
		if (this.anIntArray229 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray229[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static24.method694(local93, local588, local592, local71, local75, local80, Static75.anIntArray259[0], Static75.anIntArray259[1], Static75.anIntArray259[2]);
			Static24.method694(local93, local592, Static75.anIntArray249[3], local71, local80, Static75.anIntArray263[3], Static75.anIntArray259[0], Static75.anIntArray259[2], Static75.anIntArray259[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static75.anIntArray246[this.anIntArray234[arg0]];
			Static24.method700(local93, local588, local592, local71, local75, local80, local673);
			Static24.method700(local93, local592, Static75.anIntArray249[3], local71, local80, Static75.anIntArray263[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray229[arg0] >> 2;
			local678 = this.anIntArray230[local673];
			local683 = this.anIntArray239[local673];
			local688 = this.anIntArray242[local673];
			Static24.method687(local93, local588, local592, local71, local75, local80, Static75.anIntArray259[0], Static75.anIntArray259[1], Static75.anIntArray259[2], Static75.anIntArray261[local678], Static75.anIntArray261[local683], Static75.anIntArray261[local688], Static75.anIntArray247[local678], Static75.anIntArray247[local683], Static75.anIntArray247[local688], Static75.anIntArray260[local678], Static75.anIntArray260[local683], Static75.anIntArray260[local688], this.anIntArray240[arg0]);
			Static24.method687(local93, local592, Static75.anIntArray249[3], local71, local80, Static75.anIntArray263[3], Static75.anIntArray259[0], Static75.anIntArray259[2], Static75.anIntArray259[3], Static75.anIntArray261[local678], Static75.anIntArray261[local683], Static75.anIntArray261[local688], Static75.anIntArray247[local678], Static75.anIntArray247[local683], Static75.anIntArray247[local688], Static75.anIntArray260[local678], Static75.anIntArray260[local683], Static75.anIntArray260[local688], this.anIntArray240[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray229[arg0] >> 2;
		local678 = this.anIntArray230[local673];
		local683 = this.anIntArray239[local673];
		local688 = this.anIntArray242[local673];
		Static24.method687(local93, local588, local592, local71, local75, local80, this.anIntArray234[arg0], this.anIntArray234[arg0], this.anIntArray234[arg0], Static75.anIntArray261[local678], Static75.anIntArray261[local683], Static75.anIntArray261[local688], Static75.anIntArray247[local678], Static75.anIntArray247[local683], Static75.anIntArray247[local688], Static75.anIntArray260[local678], Static75.anIntArray260[local683], Static75.anIntArray260[local688], this.anIntArray240[arg0]);
		Static24.method687(local93, local592, Static75.anIntArray249[3], local71, local80, Static75.anIntArray263[3], this.anIntArray234[arg0], this.anIntArray234[arg0], this.anIntArray234[arg0], Static75.anIntArray261[local678], Static75.anIntArray261[local683], Static75.anIntArray261[local688], Static75.anIntArray247[local678], Static75.anIntArray247[local683], Static75.anIntArray247[local688], Static75.anIntArray260[local678], Static75.anIntArray260[local683], Static75.anIntArray260[local688], this.anIntArray240[arg0]);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZI)V")
	private void method1416(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2030 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2030; local6++) {
			Static75.anIntArray245[local6] = 0;
		}
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(86) int local86;
		@Pc(90) int local90;
		@Pc(98) int local98;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2032; local18++) {
			if (this.anIntArray229 == null || this.anIntArray229[local18] != -1) {
				local33 = this.anIntArray232[local18];
				local38 = this.anIntArray243[local18];
				local43 = this.anIntArray226[local18];
				local47 = Static75.anIntArray250[local33];
				local51 = Static75.anIntArray250[local38];
				local55 = Static75.anIntArray250[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static75.anIntArray261[local33];
					local74 = Static75.anIntArray261[local38];
					@Pc(78) int local78 = Static75.anIntArray261[local43];
					@Pc(82) int local82 = Static75.anIntArray247[local33];
					local86 = Static75.anIntArray247[local38];
					local90 = Static75.anIntArray247[local43];
					@Pc(94) int local94 = Static75.anIntArray260[local33];
					local98 = Static75.anIntArray260[local38];
					@Pc(102) int local102 = Static75.anIntArray260[local43];
					local70 -= local74;
					@Pc(110) int local110 = local78 - local74;
					@Pc(114) int local114 = local82 - local86;
					@Pc(118) int local118 = local90 - local86;
					@Pc(122) int local122 = local94 - local98;
					@Pc(126) int local126 = local102 - local98;
					@Pc(134) int local134 = local114 * local126 - local122 * local118;
					@Pc(142) int local142 = local122 * local110 - local70 * local126;
					@Pc(150) int local150 = local70 * local118 - local114 * local110;
					if (local74 * local134 + local86 * local142 + local98 * local150 > 0) {
						Static75.aBooleanArray16[local18] = true;
						@Pc(183) int local183 = (Static75.anIntArray252[local33] + Static75.anIntArray252[local38] + Static75.anIntArray252[local43]) / 3 + this.anInt2038;
						Static75.anIntArrayArray17[local183][Static75.anIntArray245[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method1408(Static75.anInt2046, Static75.anInt2041, Static75.anIntArray248[local33], Static75.anIntArray248[local38], Static75.anIntArray248[local43], local47, local51, local55)) {
						Static75.anIntArray251[Static75.anInt2045++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static75.anIntArray248[local43] - Static75.anIntArray248[local38]) - (Static75.anIntArray248[local33] - Static75.anIntArray248[local38]) * (local55 - local51) > 0) {
						Static75.aBooleanArray16[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static24.anInt993 && local51 <= Static24.anInt993 && local55 <= Static24.anInt993) {
							Static75.aBooleanArray15[local18] = false;
						} else {
							Static75.aBooleanArray15[local18] = true;
						}
						local70 = (Static75.anIntArray252[local33] + Static75.anIntArray252[local38] + Static75.anIntArray252[local43]) / 3 + this.anInt2038;
						Static75.anIntArrayArray17[local70][Static75.anIntArray245[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray235 == null) {
			for (local33 = this.anInt2030 - 1; local33 >= 0; local33--) {
				local38 = Static75.anIntArray245[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static75.anIntArrayArray17[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method1424(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static75.anIntArray262[local33] = 0;
			Static75.anIntArray258[local33] = 0;
		}
		for (local38 = this.anInt2030 - 1; local38 >= 0; local38--) {
			local43 = Static75.anIntArray245[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static75.anIntArrayArray17[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray235[local55];
					local74 = Static75.anIntArray262[local70]++;
					Static75.anIntArrayArray16[local70][local74] = local55;
					if (local70 < 10) {
						Static75.anIntArray258[local70] += local38;
					} else if (local70 == 10) {
						Static75.anIntArray257[local74] = local38;
					} else {
						Static75.anIntArray255[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static75.anIntArray262[1] > 0 || Static75.anIntArray262[2] > 0) {
			local43 = (Static75.anIntArray258[1] + Static75.anIntArray258[2]) / (Static75.anIntArray262[1] + Static75.anIntArray262[2]);
		}
		local47 = 0;
		if (Static75.anIntArray262[3] > 0 || Static75.anIntArray262[4] > 0) {
			local47 = (Static75.anIntArray258[3] + Static75.anIntArray258[4]) / (Static75.anIntArray262[3] + Static75.anIntArray262[4]);
		}
		local51 = 0;
		if (Static75.anIntArray262[6] > 0 || Static75.anIntArray262[8] > 0) {
			local51 = (Static75.anIntArray258[6] + Static75.anIntArray258[8]) / (Static75.anIntArray262[6] + Static75.anIntArray262[8]);
		}
		local70 = 0;
		local74 = Static75.anIntArray262[10];
		@Pc(524) int[] local524 = Static75.anIntArrayArray16[10];
		@Pc(526) int[] local526 = Static75.anIntArray257;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static75.anIntArray262[11];
			local524 = Static75.anIntArrayArray16[11];
			local526 = Static75.anIntArray255;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method1424(local524[local70++]);
				if (local70 == local74 && local524 != Static75.anIntArrayArray16[11]) {
					local70 = 0;
					local74 = Static75.anIntArray262[11];
					local524 = Static75.anIntArrayArray16[11];
					local526 = Static75.anIntArray255;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method1424(local524[local70++]);
				if (local70 == local74 && local524 != Static75.anIntArrayArray16[11]) {
					local70 = 0;
					local74 = Static75.anIntArray262[11];
					local524 = Static75.anIntArrayArray16[11];
					local526 = Static75.anIntArray255;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method1424(local524[local70++]);
				if (local70 == local74 && local524 != Static75.anIntArrayArray16[11]) {
					local70 = 0;
					local74 = Static75.anIntArray262[11];
					local524 = Static75.anIntArrayArray16[11];
					local526 = Static75.anIntArray255;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static75.anIntArray262[local86];
			@Pc(689) int[] local689 = Static75.anIntArrayArray16[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method1424(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method1424(local524[local70++]);
			if (local70 == local74 && local524 != Static75.anIntArrayArray16[11]) {
				local70 = 0;
				local524 = Static75.anIntArrayArray16[11];
				local74 = Static75.anIntArray262[11];
				local526 = Static75.anIntArray255;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1418(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static75.anIntArray241.length < this.anInt2032) {
			Static75.anIntArray241 = new int[this.anInt2032 + 100];
		}
		return this.method1421(arg0, Static75.aClass2_Sub1_Sub1_Sub5_2, Static75.anIntArray241);
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "()V")
	public void method1419() {
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2031; local7++) {
			this.anIntArray225[local7] = -this.anIntArray225[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt2032; local24++) {
			@Pc(30) int local30 = this.anIntArray232[local24];
			this.anIntArray232[local24] = this.anIntArray226[local24];
			this.anIntArray226[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "()V")
	public void method1420() {
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2031; local7++) {
			this.anIntArray238[local7] = -this.anIntArray238[local7];
			this.anIntArray225[local7] = -this.anIntArray225[local7];
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!pa;[I)Lclient!pa;")
	private Class2_Sub1_Sub1_Sub5 method1421(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub5 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt2031 = this.anInt2031;
		arg1.anInt2032 = this.anInt2032;
		arg1.anInt2037 = this.anInt2037;
		if (arg1.anIntArray238 == null || arg1.anIntArray238.length < this.anInt2031) {
			arg1.anIntArray238 = new int[this.anInt2031 + 100];
			arg1.anIntArray237 = new int[this.anInt2031 + 100];
			arg1.anIntArray225 = new int[this.anInt2031 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2031; local43++) {
			arg1.anIntArray238[local43] = this.anIntArray238[local43];
			arg1.anIntArray237[local43] = this.anIntArray237[local43];
			arg1.anIntArray225[local43] = this.anIntArray225[local43];
		}
		if (arg0) {
			arg1.anIntArray233 = this.anIntArray233;
		} else {
			arg1.anIntArray233 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray233 == null) {
				for (local88 = 0; local88 < this.anInt2032; local88++) {
					arg1.anIntArray233[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2032; local88++) {
					arg1.anIntArray233[local88] = this.anIntArray233[local88];
				}
			}
		}
		arg1.anIntArray229 = this.anIntArray229;
		arg1.anIntArray240 = this.anIntArray240;
		arg1.anIntArray235 = this.anIntArray235;
		arg1.anInt2040 = this.anInt2040;
		arg1.anIntArrayArray15 = this.anIntArrayArray15;
		arg1.anIntArrayArray14 = this.anIntArrayArray14;
		arg1.anIntArray232 = this.anIntArray232;
		arg1.anIntArray243 = this.anIntArray243;
		arg1.anIntArray226 = this.anIntArray226;
		arg1.anIntArray234 = this.anIntArray234;
		arg1.anIntArray231 = this.anIntArray231;
		arg1.anIntArray236 = this.anIntArray236;
		arg1.anIntArray230 = this.anIntArray230;
		arg1.anIntArray239 = this.anIntArray239;
		arg1.anIntArray242 = this.anIntArray242;
		arg1.aBoolean111 = this.aBoolean111;
		arg1.anInt2033 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
	public void method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2031; local7++) {
			this.anIntArray238[local7] = this.anIntArray238[local7] * arg0 / 128;
			this.anIntArray237[local7] = this.anIntArray237[local7] * arg1 / 128;
			this.anIntArray225[local7] = this.anIntArray225[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "()V")
	public void method1423() {
		if (this.anInt2033 == 3) {
			return;
		}
		this.anInt2033 = 3;
		super.anInt2698 = 0;
		this.anInt2035 = 0;
		this.anInt2034 = 999999;
		this.anInt2030 = -999999;
		this.anInt2038 = -99999;
		this.anInt2036 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2031; local27++) {
			@Pc(33) int local33 = this.anIntArray238[local27];
			@Pc(38) int local38 = this.anIntArray237[local27];
			@Pc(43) int local43 = this.anIntArray225[local27];
			if (local33 < this.anInt2034) {
				this.anInt2034 = local33;
			}
			if (local33 > this.anInt2030) {
				this.anInt2030 = local33;
			}
			if (local43 < this.anInt2036) {
				this.anInt2036 = local43;
			}
			if (local43 > this.anInt2038) {
				this.anInt2038 = local43;
			}
			if (-local38 > super.anInt2698) {
				super.anInt2698 = -local38;
			}
			if (local38 > this.anInt2035) {
				this.anInt2035 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "(I)V")
	private void method1424(@OriginalArg(0) int arg0) {
		if (Static75.aBooleanArray16[arg0]) {
			this.method1415(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray232[arg0];
		@Pc(17) int local17 = this.anIntArray243[arg0];
		@Pc(22) int local22 = this.anIntArray226[arg0];
		Static24.aBoolean43 = Static75.aBooleanArray15[arg0];
		if (this.anIntArray233 == null) {
			Static24.anInt987 = 0;
		} else {
			Static24.anInt987 = this.anIntArray233[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray229 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray229[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static24.method694(Static75.anIntArray248[local12], Static75.anIntArray248[local17], Static75.anIntArray248[local22], Static75.anIntArray250[local12], Static75.anIntArray250[local17], Static75.anIntArray250[local22], this.anIntArray234[arg0], this.anIntArray231[arg0], this.anIntArray236[arg0]);
		} else if (local42 == 1) {
			Static24.method700(Static75.anIntArray248[local12], Static75.anIntArray248[local17], Static75.anIntArray248[local22], Static75.anIntArray250[local12], Static75.anIntArray250[local17], Static75.anIntArray250[local22], Static75.anIntArray246[this.anIntArray234[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray229[arg0] >> 2;
				local128 = this.anIntArray230[local123];
				local133 = this.anIntArray239[local123];
				local138 = this.anIntArray242[local123];
				Static24.method687(Static75.anIntArray248[local12], Static75.anIntArray248[local17], Static75.anIntArray248[local22], Static75.anIntArray250[local12], Static75.anIntArray250[local17], Static75.anIntArray250[local22], this.anIntArray234[arg0], this.anIntArray231[arg0], this.anIntArray236[arg0], Static75.anIntArray261[local128], Static75.anIntArray261[local133], Static75.anIntArray261[local138], Static75.anIntArray247[local128], Static75.anIntArray247[local133], Static75.anIntArray247[local138], Static75.anIntArray260[local128], Static75.anIntArray260[local133], Static75.anIntArray260[local138], this.anIntArray240[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray229[arg0] >> 2;
				local128 = this.anIntArray230[local123];
				local133 = this.anIntArray239[local123];
				local138 = this.anIntArray242[local123];
				Static24.method687(Static75.anIntArray248[local12], Static75.anIntArray248[local17], Static75.anIntArray248[local22], Static75.anIntArray250[local12], Static75.anIntArray250[local17], Static75.anIntArray250[local22], this.anIntArray234[arg0], this.anIntArray234[arg0], this.anIntArray234[arg0], Static75.anIntArray261[local128], Static75.anIntArray261[local133], Static75.anIntArray261[local138], Static75.anIntArray247[local128], Static75.anIntArray247[local133], Static75.anIntArray247[local138], Static75.anIntArray260[local128], Static75.anIntArray260[local133], Static75.anIntArray260[local138], this.anIntArray240[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "()V")
	public void method1425() {
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2031; local7++) {
			@Pc(13) int local13 = this.anIntArray225[local7];
			this.anIntArray225[local7] = this.anIntArray238[local7];
			this.anIntArray238[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!t;I)V")
	public void method1426(@OriginalArg(0) Class2_Sub1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray14 == null || arg1 == -1) {
			return;
		}
		this.aClass47Array2 = null;
		this.anInt2033 = 0;
		@Pc(18) Class42 local18 = arg0.aClass42Array1[arg1];
		@Pc(21) Class2_Sub13 local21 = local18.aClass2_Sub13_1;
		Static75.anInt2044 = 0;
		Static75.anInt2043 = 0;
		Static75.anInt2042 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt1960; local29++) {
			@Pc(35) int local35 = local18.anIntArray212[local29];
			this.method1412(local21.anIntArray336[local35], local21.anIntArrayArray26[local35], local18.anIntArray211[local29], local18.anIntArray214[local29], local18.anIntArray213[local29]);
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)V")
	public void method1427() {
		@Pc(4) int local4 = this.anInt2039 >> 16;
		@Pc(11) int local11 = this.anInt2039 << 16 >> 16;
		this.method1409(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "()V")
	private void method1428() {
		if (this.anInt2033 == 2) {
			return;
		}
		this.anInt2033 = 2;
		this.anInt2034 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2031; local12++) {
			@Pc(18) int local18 = this.anIntArray238[local12];
			@Pc(23) int local23 = this.anIntArray237[local12];
			@Pc(28) int local28 = this.anIntArray225[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2034) {
				this.anInt2034 = local40;
			}
		}
		this.anInt2034 = (int) (Math.sqrt((double) this.anInt2034) + 0.99D);
		this.anInt2038 = this.anInt2034;
		this.anInt2030 = this.anInt2034 + this.anInt2034;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(III)V")
	public void method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2033 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2031; local4++) {
			this.anIntArray238[local4] += arg0;
			this.anIntArray237[local4] += arg1;
			this.anIntArray225[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!pa;I)I")
	private int method1430(@OriginalArg(0) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray238[arg1];
		@Pc(11) int local11 = arg0.anIntArray237[arg1];
		@Pc(16) int local16 = arg0.anIntArray225[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2031; local18++) {
			if (local6 == this.anIntArray238[local18] && local11 == this.anIntArray237[local18] && local16 == this.anIntArray225[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray238[this.anInt2031] = local6;
			this.anIntArray237[this.anInt2031] = local11;
			this.anIntArray225[this.anInt2031] = local16;
			if (arg0.anIntArray228 != null) {
				this.anIntArray228[this.anInt2031] = arg0.anIntArray228[arg1];
			}
			local1 = this.anInt2031++;
		}
		return local1;
	}
}
