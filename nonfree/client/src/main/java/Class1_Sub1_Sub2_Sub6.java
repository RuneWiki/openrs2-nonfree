import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub1_Sub2_Sub6 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!qb", name = "Oc", descriptor = "[I")
	public static int[] anIntArray311 = new int[128];

	@OriginalMember(owner = "client!qb", name = "Ab", descriptor = "[Lclient!fd;")
	public Class20[] aClass20Array1;

	@OriginalMember(owner = "client!qb", name = "Fb", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!qb", name = "Hb", descriptor = "I")
	public int anInt2296;

	@OriginalMember(owner = "client!qb", name = "Ib", descriptor = "I")
	private int anInt2297;

	@OriginalMember(owner = "client!qb", name = "Mb", descriptor = "I")
	private int anInt2298;

	@OriginalMember(owner = "client!qb", name = "Ob", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!qb", name = "Pb", descriptor = "I")
	public int anInt2300;

	@OriginalMember(owner = "client!qb", name = "Tb", descriptor = "I")
	public int anInt2301;

	@OriginalMember(owner = "client!qb", name = "Vb", descriptor = "I")
	public int anInt2302;

	@OriginalMember(owner = "client!qb", name = "Xb", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!qb", name = "Yb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!qb", name = "Zb", descriptor = "[Lclient!fd;")
	public Class20[] aClass20Array2;

	@OriginalMember(owner = "client!qb", name = "dc", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!qb", name = "hc", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!qb", name = "Db", descriptor = "I")
	public int anInt2295 = 0;

	@OriginalMember(owner = "client!qb", name = "Bb", descriptor = "I")
	private int anInt2294 = 0;

	@OriginalMember(owner = "client!qb", name = "ac", descriptor = "I")
	private int anInt2304 = 0;

	@OriginalMember(owner = "client!qb", name = "Nb", descriptor = "I")
	public int anInt2299 = 0;

	@OriginalMember(owner = "client!qb", name = "Wb", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!qb", name = "jc", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!qb", name = "Qb", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!qb", name = "Ub", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!qb", name = "Sb", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!qb", name = "Rb", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!qb", name = "Lb", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!qb", name = "Ec", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!qb", name = "Kb", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!qb", name = "bc", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!qb", name = "ec", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!qb", name = "cc", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!qb", name = "Jb", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!qb", name = "fc", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!qb", name = "Gb", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!qb", name = "Cb", descriptor = "[I")
	private int[] anIntArray273;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray311[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray311[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray311[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray311[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray311[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub2_Sub6(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class1_Sub5 local21 = new Class1_Sub5(arg0);
		@Pc(26) Class1_Sub5 local26 = new Class1_Sub5(arg0);
		@Pc(31) Class1_Sub5 local31 = new Class1_Sub5(arg0);
		@Pc(36) Class1_Sub5 local36 = new Class1_Sub5(arg0);
		@Pc(41) Class1_Sub5 local41 = new Class1_Sub5(arg0);
		local21.anInt1266 = arg0.length - 18;
		@Pc(51) int local51 = local21.method715();
		@Pc(55) int local55 = local21.method715();
		@Pc(59) int local59 = local21.method716();
		@Pc(63) int local63 = local21.method716();
		@Pc(67) int local67 = local21.method716();
		@Pc(71) int local71 = local21.method716();
		@Pc(75) int local75 = local21.method716();
		@Pc(79) int local79 = local21.method716();
		@Pc(83) int local83 = local21.method715();
		@Pc(87) int local87 = local21.method715();
		@Pc(91) int local91 = local21.method715();
		@Pc(95) int local95 = local21.method715();
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
		this.anInt2299 = local51;
		this.anInt2295 = local55;
		this.anInt2294 = local59;
		this.anIntArray290 = new int[local51];
		this.anIntArray279 = new int[local51];
		this.anIntArray282 = new int[local51];
		this.anIntArray281 = new int[local55];
		this.anIntArray280 = new int[local55];
		this.anIntArray277 = new int[local55];
		this.anIntArray303 = new int[local59];
		this.anIntArray276 = new int[local59];
		this.anIntArray284 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray286 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray285 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray275 = new int[local55];
		} else {
			this.anInt2304 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray287 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray274 = new int[local55];
		}
		this.anIntArray273 = new int[local55];
		local21.anInt1266 = local97;
		local26.anInt1266 = local196;
		local31.anInt1266 = local202;
		local36.anInt1266 = local103;
		local41.anInt1266 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method716();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method706();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method706();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method706();
			}
			this.anIntArray290[local321] = local315 + local328;
			this.anIntArray279[local321] = local317 + local338;
			this.anIntArray282[local321] = local319 + local348;
			local315 = this.anIntArray290[local321];
			local317 = this.anIntArray279[local321];
			local319 = this.anIntArray282[local321];
			if (this.anIntArray286 != null) {
				this.anIntArray286[local321] = local41.method716();
			}
		}
		local21.anInt1266 = local180;
		local26.anInt1266 = local138;
		local31.anInt1266 = local111;
		local36.anInt1266 = local162;
		local41.anInt1266 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray273[local326] = local21.method715();
			if (this.anIntArray285 != null) {
				this.anIntArray285[local326] = local26.method716();
			}
			if (this.anIntArray275 != null) {
				this.anIntArray275[local326] = local31.method716();
			}
			if (this.anIntArray287 != null) {
				this.anIntArray287[local326] = local36.method716();
			}
			if (this.anIntArray274 != null) {
				this.anIntArray274[local326] = local41.method716();
			}
		}
		local21.anInt1266 = local174;
		local26.anInt1266 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method716();
			if (local496 == 1) {
				local328 = local21.method706() + local489;
				local338 = local21.method706() + local328;
				local348 = local21.method706() + local338;
				local489 = local348;
				this.anIntArray281[local491] = local328;
				this.anIntArray280[local491] = local338;
				this.anIntArray277[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method706() + local489;
				local489 = local348;
				this.anIntArray281[local491] = local328;
				this.anIntArray280[local491] = local338;
				this.anIntArray277[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method706() + local489;
				local489 = local348;
				this.anIntArray281[local491] = local328;
				this.anIntArray280[local491] = local338;
				this.anIntArray277[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method706() + local489;
				local489 = local348;
				this.anIntArray281[local491] = local328;
				this.anIntArray280[local491] = local599;
				this.anIntArray277[local491] = local348;
			}
		}
		local21.anInt1266 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray303[local496] = local21.method715();
			this.anIntArray276[local496] = local21.method715();
			this.anIntArray284[local496] = local21.method715();
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2_Sub6() {
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([Lclient!qb;I)V")
	public Class1_Sub1_Sub2_Sub6(@OriginalArg(0) Class1_Sub1_Sub2_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2299 = 0;
		this.anInt2295 = 0;
		this.anInt2294 = 0;
		this.anInt2304 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class1_Sub1_Sub2_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2299 += local43.anInt2299;
				this.anInt2295 += local43.anInt2295;
				this.anInt2294 += local43.anInt2294;
				local18 |= local43.anIntArray285 != null;
				if (local43.anIntArray275 == null) {
					if (this.anInt2304 == -1) {
						this.anInt2304 = local43.anInt2304;
					}
					if (this.anInt2304 != local43.anInt2304) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray287 != null;
				local24 |= local43.anIntArray274 != null;
			}
		}
		this.anIntArray290 = new int[this.anInt2299];
		this.anIntArray279 = new int[this.anInt2299];
		this.anIntArray282 = new int[this.anInt2299];
		this.anIntArray286 = new int[this.anInt2299];
		this.anIntArray281 = new int[this.anInt2295];
		this.anIntArray280 = new int[this.anInt2295];
		this.anIntArray277 = new int[this.anInt2295];
		this.anIntArray303 = new int[this.anInt2294];
		this.anIntArray276 = new int[this.anInt2294];
		this.anIntArray284 = new int[this.anInt2294];
		if (local18) {
			this.anIntArray285 = new int[this.anInt2295];
		}
		if (local20) {
			this.anIntArray275 = new int[this.anInt2295];
		}
		if (local22) {
			this.anIntArray287 = new int[this.anInt2295];
		}
		if (local24) {
			this.anIntArray274 = new int[this.anInt2295];
		}
		this.anIntArray273 = new int[this.anInt2295];
		this.anInt2299 = 0;
		this.anInt2295 = 0;
		this.anInt2294 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class1_Sub1_Sub2_Sub6 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt2295; local223++) {
					if (local18) {
						if (local219.anIntArray285 == null) {
							this.anIntArray285[this.anInt2295] = 0;
						} else {
							local241 = local219.anIntArray285[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray285[this.anInt2295] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray275 == null) {
							this.anIntArray275[this.anInt2295] = local219.anInt2304;
						} else {
							this.anIntArray275[this.anInt2295] = local219.anIntArray275[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray287 == null) {
							this.anIntArray287[this.anInt2295] = 0;
						} else {
							this.anIntArray287[this.anInt2295] = local219.anIntArray287[local223];
						}
					}
					if (local24 && local219.anIntArray274 != null) {
						this.anIntArray274[this.anInt2295] = local219.anIntArray274[local223];
					}
					this.anIntArray273[this.anInt2295] = local219.anIntArray273[local223];
					this.anIntArray281[this.anInt2295] = this.method1451(local219, local219.anIntArray281[local223]);
					this.anIntArray280[this.anInt2295] = this.method1451(local219, local219.anIntArray280[local223]);
					this.anIntArray277[this.anInt2295] = this.method1451(local219, local219.anIntArray277[local223]);
					this.anInt2295++;
				}
				for (local241 = 0; local241 < local219.anInt2294; local241++) {
					this.anIntArray303[this.anInt2294] = this.method1451(local219, local219.anIntArray303[local241]);
					this.anIntArray276[this.anInt2294] = this.method1451(local219, local219.anIntArray276[local241]);
					this.anIntArray284[this.anInt2294] = this.method1451(local219, local219.anIntArray284[local241]);
					this.anInt2294++;
				}
				local212 += local219.anInt2294;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([Lclient!qb;IZ)V")
	public Class1_Sub1_Sub2_Sub6(@OriginalArg(0) Class1_Sub1_Sub2_Sub6[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2299 = 0;
		this.anInt2295 = 0;
		this.anInt2294 = 0;
		this.anInt2304 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class1_Sub1_Sub2_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2299 += local43.anInt2299;
				this.anInt2295 += local43.anInt2295;
				this.anInt2294 += local43.anInt2294;
				local18 |= local43.anIntArray285 != null;
				if (local43.anIntArray275 == null) {
					if (this.anInt2304 == -1) {
						this.anInt2304 = local43.anInt2304;
					}
					if (this.anInt2304 != local43.anInt2304) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray287 != null;
				local24 |= local43.anIntArray273 != null;
			}
		}
		this.anIntArray290 = new int[this.anInt2299];
		this.anIntArray279 = new int[this.anInt2299];
		this.anIntArray282 = new int[this.anInt2299];
		this.anIntArray281 = new int[this.anInt2295];
		this.anIntArray280 = new int[this.anInt2295];
		this.anIntArray277 = new int[this.anInt2295];
		this.anIntArray278 = new int[this.anInt2295];
		this.anIntArray288 = new int[this.anInt2295];
		this.anIntArray283 = new int[this.anInt2295];
		this.anIntArray303 = new int[this.anInt2294];
		this.anIntArray276 = new int[this.anInt2294];
		this.anIntArray284 = new int[this.anInt2294];
		if (local18) {
			this.anIntArray285 = new int[this.anInt2295];
		}
		if (local20) {
			this.anIntArray275 = new int[this.anInt2295];
		}
		if (local22) {
			this.anIntArray287 = new int[this.anInt2295];
		}
		if (local24) {
			this.anIntArray273 = new int[this.anInt2295];
		}
		this.anInt2299 = 0;
		this.anInt2295 = 0;
		this.anInt2294 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class1_Sub1_Sub2_Sub6 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt2299;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt2299; local231++) {
					this.anIntArray290[this.anInt2299] = local224.anIntArray290[local231];
					this.anIntArray279[this.anInt2299] = local224.anIntArray279[local231];
					this.anIntArray282[this.anInt2299] = local224.anIntArray282[local231];
					this.anInt2299++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt2295; local272++) {
					this.anIntArray281[this.anInt2295] = local224.anIntArray281[local272] + local229;
					this.anIntArray280[this.anInt2295] = local224.anIntArray280[local272] + local229;
					this.anIntArray277[this.anInt2295] = local224.anIntArray277[local272] + local229;
					this.anIntArray278[this.anInt2295] = local224.anIntArray278[local272];
					this.anIntArray288[this.anInt2295] = local224.anIntArray288[local272];
					this.anIntArray283[this.anInt2295] = local224.anIntArray283[local272];
					if (local18) {
						if (local224.anIntArray285 == null) {
							this.anIntArray285[this.anInt2295] = 0;
						} else {
							local350 = local224.anIntArray285[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray285[this.anInt2295] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray275 == null) {
							this.anIntArray275[this.anInt2295] = local224.anInt2304;
						} else {
							this.anIntArray275[this.anInt2295] = local224.anIntArray275[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray287 == null) {
							this.anIntArray287[this.anInt2295] = 0;
						} else {
							this.anIntArray287[this.anInt2295] = local224.anIntArray287[local272];
						}
					}
					if (local24 && local224.anIntArray273 != null) {
						this.anIntArray273[this.anInt2295] = local224.anIntArray273[local272];
					}
					this.anInt2295++;
				}
				for (local350 = 0; local350 < local224.anInt2294; local350++) {
					this.anIntArray303[this.anInt2294] = local224.anIntArray303[local350] + local229;
					this.anIntArray276[this.anInt2294] = local224.anIntArray276[local350] + local229;
					this.anIntArray284[this.anInt2294] = local224.anIntArray284[local350] + local229;
					this.anInt2294++;
				}
				local217 += local224.anInt2294;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!qb;ZZZ)V")
	public Class1_Sub1_Sub2_Sub6(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2299 = arg0.anInt2299;
		this.anInt2295 = arg0.anInt2295;
		this.anInt2294 = arg0.anInt2294;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray290 = arg0.anIntArray290;
			this.anIntArray279 = arg0.anIntArray279;
			this.anIntArray282 = arg0.anIntArray282;
		} else {
			this.anIntArray290 = new int[this.anInt2299];
			this.anIntArray279 = new int[this.anInt2299];
			this.anIntArray282 = new int[this.anInt2299];
			for (local60 = 0; local60 < this.anInt2299; local60++) {
				this.anIntArray290[local60] = arg0.anIntArray290[local60];
				this.anIntArray279[local60] = arg0.anIntArray279[local60];
				this.anIntArray282[local60] = arg0.anIntArray282[local60];
			}
		}
		if (arg2) {
			this.anIntArray273 = arg0.anIntArray273;
		} else {
			this.anIntArray273 = new int[this.anInt2295];
			for (local60 = 0; local60 < this.anInt2295; local60++) {
				this.anIntArray273[local60] = arg0.anIntArray273[local60];
			}
		}
		this.anIntArray287 = arg0.anIntArray287;
		this.anIntArray286 = arg0.anIntArray286;
		this.anIntArray274 = arg0.anIntArray274;
		this.anIntArray285 = arg0.anIntArray285;
		this.anIntArray281 = arg0.anIntArray281;
		this.anIntArray280 = arg0.anIntArray280;
		this.anIntArray277 = arg0.anIntArray277;
		this.anIntArray275 = arg0.anIntArray275;
		this.anInt2304 = arg0.anInt2304;
		this.anIntArray303 = arg0.anIntArray303;
		this.anIntArray276 = arg0.anIntArray276;
		this.anIntArray284 = arg0.anIntArray284;
		this.aBoolean107 = arg0.aBoolean107;
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!qb;ZZ)V")
	public Class1_Sub1_Sub2_Sub6(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt2299 = arg0.anInt2299;
		this.anInt2295 = arg0.anInt2295;
		this.anInt2294 = arg0.anInt2294;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray279 = new int[this.anInt2299];
			for (local37 = 0; local37 < this.anInt2299; local37++) {
				this.anIntArray279[local37] = arg0.anIntArray279[local37];
			}
		} else {
			this.anIntArray279 = arg0.anIntArray279;
		}
		if (arg2) {
			this.anIntArray278 = new int[this.anInt2295];
			this.anIntArray288 = new int[this.anInt2295];
			this.anIntArray283 = new int[this.anInt2295];
			for (local37 = 0; local37 < this.anInt2295; local37++) {
				this.anIntArray278[local37] = arg0.anIntArray278[local37];
				this.anIntArray288[local37] = arg0.anIntArray288[local37];
				this.anIntArray283[local37] = arg0.anIntArray283[local37];
			}
			this.anIntArray285 = new int[this.anInt2295];
			@Pc(115) int local115;
			if (arg0.anIntArray285 == null) {
				for (local115 = 0; local115 < this.anInt2295; local115++) {
					this.anIntArray285[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt2295; local115++) {
					this.anIntArray285[local115] = arg0.anIntArray285[local115];
				}
			}
			this.aClass20Array2 = new Class20[this.anInt2299];
			for (local115 = 0; local115 < this.anInt2299; local115++) {
				@Pc(160) Class20 local160 = this.aClass20Array2[local115] = new Class20();
				@Pc(165) Class20 local165 = arg0.aClass20Array2[local115];
				local160.anInt879 = local165.anInt879;
				local160.anInt877 = local165.anInt877;
				local160.anInt875 = local165.anInt875;
				local160.anInt876 = local165.anInt876;
			}
			this.aClass20Array1 = arg0.aClass20Array1;
		} else {
			this.anIntArray278 = arg0.anIntArray278;
			this.anIntArray288 = arg0.anIntArray288;
			this.anIntArray283 = arg0.anIntArray283;
			this.anIntArray285 = arg0.anIntArray285;
		}
		this.anIntArray290 = arg0.anIntArray290;
		this.anIntArray282 = arg0.anIntArray282;
		this.anIntArray273 = arg0.anIntArray273;
		this.anIntArray287 = arg0.anIntArray287;
		this.anIntArray275 = arg0.anIntArray275;
		this.anInt2304 = arg0.anInt2304;
		this.anIntArray281 = arg0.anIntArray281;
		this.anIntArray280 = arg0.anIntArray280;
		this.anIntArray277 = arg0.anIntArray277;
		this.anIntArray303 = arg0.anIntArray303;
		this.anIntArray276 = arg0.anIntArray276;
		this.anIntArray284 = arg0.anIntArray284;
		this.aBoolean107 = arg0.aBoolean107;
		this.anInt2298 = arg0.anInt2298;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	public void method1422(@OriginalArg(0) int arg0) {
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		@Pc(9) int local9 = Static81.anIntArray300[arg0];
		@Pc(13) int local13 = Static81.anIntArray292[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2299; local15++) {
			@Pc(32) int local32 = this.anIntArray279[local15] * local13 - this.anIntArray282[local15] * local9 >> 16;
			this.anIntArray282[local15] = this.anIntArray279[local15] * local9 + this.anIntArray282[local15] * local13 >> 16;
			this.anIntArray279[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ve;I)V")
	public void method1423(@OriginalArg(0) Class1_Sub1_Sub18 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray47 == null || arg1 == -1) {
			return;
		}
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		@Pc(18) Class15 local18 = arg0.aClass15Array1[arg1];
		@Pc(21) Class1_Sub10 local21 = local18.aClass1_Sub10_1;
		Static81.anInt2307 = 0;
		Static81.anInt2309 = 0;
		Static81.anInt2306 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt733; local29++) {
			@Pc(35) int local35 = local18.anIntArray101[local29];
			this.method1425(local21.anIntArray232[local35], local21.anIntArrayArray39[local35], local18.anIntArray100[local29], local18.anIntArray98[local29], local18.anIntArray102[local29]);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public void method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2297 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2299; local4++) {
			this.anIntArray290[local4] += arg0;
			this.anIntArray279[local4] += arg1;
			this.anIntArray282[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIII)V")
	private void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static81.anInt2307 = 0;
			Static81.anInt2309 = 0;
			Static81.anInt2306 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray47.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray47[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static81.anInt2307 += this.anIntArray290[local36];
						Static81.anInt2309 += this.anIntArray279[local36];
						Static81.anInt2306 += this.anIntArray282[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static81.anInt2307 = Static81.anInt2307 / local6 + arg2;
				Static81.anInt2309 = Static81.anInt2309 / local6 + arg3;
				Static81.anInt2306 = Static81.anInt2306 / local6 + arg4;
			} else {
				Static81.anInt2307 = arg2;
				Static81.anInt2309 = arg3;
				Static81.anInt2306 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray47.length) {
					local115 = this.anIntArrayArray47[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray290[local31] += arg2;
						this.anIntArray279[local31] += arg3;
						this.anIntArray282[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray47.length) {
					local115 = this.anIntArrayArray47[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray290[local31] -= Static81.anInt2307;
						this.anIntArray279[local31] -= Static81.anInt2309;
						this.anIntArray282[local31] -= Static81.anInt2306;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static81.anIntArray300[local225];
							local235 = Static81.anIntArray292[local225];
							local251 = this.anIntArray279[local31] * local231 + this.anIntArray290[local31] * local235 >> 16;
							this.anIntArray279[local31] = this.anIntArray279[local31] * local235 - this.anIntArray290[local31] * local231 >> 16;
							this.anIntArray290[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static81.anIntArray300[local36];
							local235 = Static81.anIntArray292[local36];
							local251 = this.anIntArray279[local31] * local235 - this.anIntArray282[local31] * local231 >> 16;
							this.anIntArray282[local31] = this.anIntArray279[local31] * local231 + this.anIntArray282[local31] * local235 >> 16;
							this.anIntArray279[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static81.anIntArray300[local219];
							local235 = Static81.anIntArray292[local219];
							local251 = this.anIntArray282[local31] * local231 + this.anIntArray290[local31] * local235 >> 16;
							this.anIntArray282[local31] = this.anIntArray282[local31] * local235 - this.anIntArray290[local31] * local231 >> 16;
							this.anIntArray290[local31] = local251;
						}
						this.anIntArray290[local31] += Static81.anInt2307;
						this.anIntArray279[local31] += Static81.anInt2309;
						this.anIntArray282[local31] += Static81.anInt2306;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray47.length) {
					local115 = this.anIntArrayArray47[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray290[local31] -= Static81.anInt2307;
						this.anIntArray279[local31] -= Static81.anInt2309;
						this.anIntArray282[local31] -= Static81.anInt2306;
						this.anIntArray290[local31] = this.anIntArray290[local31] * arg2 / 128;
						this.anIntArray279[local31] = this.anIntArray279[local31] * arg3 / 128;
						this.anIntArray282[local31] = this.anIntArray282[local31] * arg4 / 128;
						this.anIntArray290[local31] += Static81.anInt2307;
						this.anIntArray279[local31] += Static81.anInt2309;
						this.anIntArray282[local31] += Static81.anInt2306;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray48 != null && this.anIntArray287 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray48.length) {
					local115 = this.anIntArrayArray48[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray287[local31] += arg2 * 8;
						if (this.anIntArray287[local31] < 0) {
							this.anIntArray287[local31] = 0;
						}
						if (this.anIntArray287[local31] > 255) {
							this.anIntArray287[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	public void method1426() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray286 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2299; local9++) {
				local15 = this.anIntArray286[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray47 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray47[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2299) {
				local65 = this.anIntArray286[local59];
				this.anIntArrayArray47[local65][local5[local65]++] = local59++;
			}
			this.anIntArray286 = null;
		}
		if (this.anIntArray274 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2295; local9++) {
			local15 = this.anIntArray274[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray48 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray48[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2295) {
			local65 = this.anIntArray274[local59];
			this.anIntArrayArray48[local65][local5[local65]++] = local59++;
		}
		this.anIntArray274 = null;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public void method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2295; local1++) {
			if (this.anIntArray273[local1] == arg0) {
				this.anIntArray273[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
	public void method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2299; local7++) {
			this.anIntArray290[local7] = this.anIntArray290[local7] * arg0 / 128;
			this.anIntArray279[local7] = this.anIntArray279[local7] * arg1 / 128;
			this.anIntArray282[local7] = this.anIntArray282[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	public void method1429() {
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2299; local7++) {
			this.anIntArray290[local7] = -this.anIntArray290[local7];
			this.anIntArray282[local7] = -this.anIntArray282[local7];
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
	public void method1430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.anInt2297 != 2 && this.anInt2297 != 1) {
			this.method1435();
		}
		@Pc(11) int local11 = Static93.anInt2474;
		@Pc(13) int local13 = Static93.anInt2470;
		@Pc(17) int local17 = Static81.anIntArray300[0];
		@Pc(21) int local21 = Static81.anIntArray292[0];
		@Pc(25) int local25 = Static81.anIntArray300[arg0];
		@Pc(29) int local29 = Static81.anIntArray292[arg0];
		@Pc(33) int local33 = Static81.anIntArray300[arg1];
		@Pc(37) int local37 = Static81.anIntArray292[arg1];
		@Pc(41) int local41 = Static81.anIntArray300[arg2];
		@Pc(45) int local45 = Static81.anIntArray292[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2299; local57++) {
			@Pc(63) int local63 = this.anIntArray290[local57];
			@Pc(68) int local68 = this.anIntArray279[local57];
			@Pc(73) int local73 = this.anIntArray282[local57];
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
			Static81.anIntArray312[local57] = local73 - local55;
			Static81.anIntArray306[local57] = local11 + (local63 << 9) / arg6;
			Static81.anIntArray291[local57] = local13 + (local85 << 9) / arg6;
			if (this.anInt2294 > 0) {
				Static81.anIntArray298[local57] = local63;
				Static81.anIntArray309[local57] = local85;
				Static81.anIntArray295[local57] = local73;
			}
		}
		try {
			this.method1440(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V")
	private void method1431(@OriginalArg(0) int arg0) {
		if (Static81.aBooleanArray8[arg0]) {
			this.method1446(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray281[arg0];
		@Pc(17) int local17 = this.anIntArray280[arg0];
		@Pc(22) int local22 = this.anIntArray277[arg0];
		Static93.aBoolean118 = Static81.aBooleanArray9[arg0];
		if (this.anIntArray287 == null) {
			Static93.anInt2477 = 0;
		} else {
			Static93.anInt2477 = this.anIntArray287[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray285 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray285[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static93.method1602(Static81.anIntArray291[local12], Static81.anIntArray291[local17], Static81.anIntArray291[local22], Static81.anIntArray306[local12], Static81.anIntArray306[local17], Static81.anIntArray306[local22], this.anIntArray278[arg0], this.anIntArray288[arg0], this.anIntArray283[arg0]);
		} else if (local42 == 1) {
			Static93.method1603(Static81.anIntArray291[local12], Static81.anIntArray291[local17], Static81.anIntArray291[local22], Static81.anIntArray306[local12], Static81.anIntArray306[local17], Static81.anIntArray306[local22], Static81.anIntArray304[this.anIntArray278[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray285[arg0] >> 2;
				local128 = this.anIntArray303[local123];
				local133 = this.anIntArray276[local123];
				local138 = this.anIntArray284[local123];
				Static93.method1599(Static81.anIntArray291[local12], Static81.anIntArray291[local17], Static81.anIntArray291[local22], Static81.anIntArray306[local12], Static81.anIntArray306[local17], Static81.anIntArray306[local22], this.anIntArray278[arg0], this.anIntArray288[arg0], this.anIntArray283[arg0], Static81.anIntArray298[local128], Static81.anIntArray298[local133], Static81.anIntArray298[local138], Static81.anIntArray309[local128], Static81.anIntArray309[local133], Static81.anIntArray309[local138], Static81.anIntArray295[local128], Static81.anIntArray295[local133], Static81.anIntArray295[local138], this.anIntArray273[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray285[arg0] >> 2;
				local128 = this.anIntArray303[local123];
				local133 = this.anIntArray276[local123];
				local138 = this.anIntArray284[local123];
				Static93.method1599(Static81.anIntArray291[local12], Static81.anIntArray291[local17], Static81.anIntArray291[local22], Static81.anIntArray306[local12], Static81.anIntArray306[local17], Static81.anIntArray306[local22], this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static81.anIntArray298[local128], Static81.anIntArray298[local133], Static81.anIntArray298[local138], Static81.anIntArray309[local128], Static81.anIntArray309[local133], Static81.anIntArray309[local138], Static81.anIntArray295[local128], Static81.anIntArray295[local133], Static81.anIntArray295[local138], this.anIntArray273[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(III)V")
	public void method1432() {
		@Pc(4) int local4 = this.anInt2298 >> 16;
		@Pc(11) int local11 = this.anInt2298 << 16 >> 16;
		this.method1449(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
	public void method1433() {
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2299; local7++) {
			this.anIntArray282[local7] = -this.anIntArray282[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt2295; local24++) {
			@Pc(30) int local30 = this.anIntArray281[local24];
			this.anIntArray281[local24] = this.anIntArray277[local24];
			this.anIntArray277[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!qb;[I)Lclient!qb;")
	private Class1_Sub1_Sub2_Sub6 method1434(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub6 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt2299 = this.anInt2299;
		arg1.anInt2295 = this.anInt2295;
		arg1.anInt2294 = this.anInt2294;
		if (arg1.anIntArray290 == null || arg1.anIntArray290.length < this.anInt2299) {
			arg1.anIntArray290 = new int[this.anInt2299 + 100];
			arg1.anIntArray279 = new int[this.anInt2299 + 100];
			arg1.anIntArray282 = new int[this.anInt2299 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2299; local43++) {
			arg1.anIntArray290[local43] = this.anIntArray290[local43];
			arg1.anIntArray279[local43] = this.anIntArray279[local43];
			arg1.anIntArray282[local43] = this.anIntArray282[local43];
		}
		if (arg0) {
			arg1.anIntArray287 = this.anIntArray287;
		} else {
			arg1.anIntArray287 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray287 == null) {
				for (local88 = 0; local88 < this.anInt2295; local88++) {
					arg1.anIntArray287[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2295; local88++) {
					arg1.anIntArray287[local88] = this.anIntArray287[local88];
				}
			}
		}
		arg1.anIntArray285 = this.anIntArray285;
		arg1.anIntArray273 = this.anIntArray273;
		arg1.anIntArray275 = this.anIntArray275;
		arg1.anInt2304 = this.anInt2304;
		arg1.anIntArrayArray48 = this.anIntArrayArray48;
		arg1.anIntArrayArray47 = this.anIntArrayArray47;
		arg1.anIntArray281 = this.anIntArray281;
		arg1.anIntArray280 = this.anIntArray280;
		arg1.anIntArray277 = this.anIntArray277;
		arg1.anIntArray278 = this.anIntArray278;
		arg1.anIntArray288 = this.anIntArray288;
		arg1.anIntArray283 = this.anIntArray283;
		arg1.anIntArray303 = this.anIntArray303;
		arg1.anIntArray276 = this.anIntArray276;
		arg1.anIntArray284 = this.anIntArray284;
		arg1.aBoolean107 = this.aBoolean107;
		arg1.anInt2297 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
	private void method1435() {
		if (this.anInt2297 == 2) {
			return;
		}
		this.anInt2297 = 2;
		this.anInt2301 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2299; local12++) {
			@Pc(18) int local18 = this.anIntArray290[local12];
			@Pc(23) int local23 = this.anIntArray279[local12];
			@Pc(28) int local28 = this.anIntArray282[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2301) {
				this.anInt2301 = local40;
			}
		}
		this.anInt2301 = (int) (Math.sqrt((double) this.anInt2301) + 0.99D);
		this.anInt2302 = this.anInt2301;
		this.anInt2303 = this.anInt2301 + this.anInt2301;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIZ)V")
	public void method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray278 == null) {
			this.anIntArray278 = new int[this.anInt2295];
			this.anIntArray288 = new int[this.anInt2295];
			this.anIntArray283 = new int[this.anInt2295];
		}
		@Pc(48) int local48;
		if (this.aClass20Array2 == null) {
			this.aClass20Array2 = new Class20[this.anInt2299];
			for (local48 = 0; local48 < this.anInt2299; local48++) {
				this.aClass20Array2[local48] = new Class20();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt2295; local48++) {
			local69 = this.anIntArray281[local48];
			@Pc(74) int local74 = this.anIntArray280[local48];
			@Pc(79) int local79 = this.anIntArray277[local48];
			@Pc(89) int local89 = this.anIntArray290[local74] - this.anIntArray290[local69];
			@Pc(99) int local99 = this.anIntArray279[local74] - this.anIntArray279[local69];
			@Pc(109) int local109 = this.anIntArray282[local74] - this.anIntArray282[local69];
			@Pc(119) int local119 = this.anIntArray290[local79] - this.anIntArray290[local69];
			@Pc(129) int local129 = this.anIntArray279[local79] - this.anIntArray279[local69];
			@Pc(139) int local139 = this.anIntArray282[local79] - this.anIntArray282[local69];
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
			if (this.anIntArray285 == null || (this.anIntArray285[local48] & 0x1) == 0) {
				@Pc(246) Class20 local246 = this.aClass20Array2[local69];
				local246.anInt879 += local147;
				local246.anInt877 += local155;
				local246.anInt875 += local163;
				local246.anInt876++;
				@Pc(275) Class20 local275 = this.aClass20Array2[local74];
				local275.anInt879 += local147;
				local275.anInt877 += local155;
				local275.anInt875 += local163;
				local275.anInt876++;
				@Pc(304) Class20 local304 = this.aClass20Array2[local79];
				local304.anInt879 += local147;
				local304.anInt877 += local155;
				local304.anInt875 += local163;
				local304.anInt876++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray278[local48] = Static81.method1453(this.anIntArray273[local48], local349, this.anIntArray285[local48]);
			}
		}
		if (arg5) {
			this.method1449(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass20Array1 = new Class20[this.anInt2299];
		for (local69 = 0; local69 < this.anInt2299; local69++) {
			@Pc(391) Class20 local391 = this.aClass20Array2[local69];
			@Pc(400) Class20 local400 = this.aClass20Array1[local69] = new Class20();
			local400.anInt879 = local391.anInt879;
			local400.anInt877 = local391.anInt877;
			local400.anInt875 = local391.anInt875;
			local400.anInt876 = local391.anInt876;
		}
		this.anInt2298 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ve;ILclient!ve;I[I)V")
	public void method1438(@OriginalArg(0) Class1_Sub1_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub18 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1423(arg0, arg1);
			return;
		}
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		@Pc(24) Class15 local24 = arg0.aClass15Array1[arg1];
		@Pc(29) Class15 local29 = arg2.aClass15Array1[arg3];
		@Pc(32) Class1_Sub10 local32 = local24.aClass1_Sub10_1;
		Static81.anInt2307 = 0;
		Static81.anInt2309 = 0;
		Static81.anInt2306 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt733; local47++) {
			local53 = local24.anIntArray101[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray232[local53] == 0) {
				this.method1425(local32.anIntArray232[local53], local32.anIntArrayArray39[local53], local24.anIntArray100[local47], local24.anIntArray98[local47], local24.anIntArray102[local47]);
			}
		}
		Static81.anInt2307 = 0;
		Static81.anInt2309 = 0;
		Static81.anInt2306 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt733; local53++) {
			@Pc(118) int local118 = local29.anIntArray101[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray232[local118] == 0) {
				this.method1425(local32.anIntArray232[local118], local32.anIntArrayArray39[local118], local29.anIntArray100[local53], local29.anIntArray98[local53], local29.anIntArray102[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Z)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1439(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static81.anIntArray289.length < this.anInt2295) {
			Static81.anIntArray289 = new int[this.anInt2295 + 100];
		}
		return this.method1434(arg0, Static81.aClass1_Sub1_Sub2_Sub6_2, Static81.anIntArray289);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZI)V")
	private void method1440(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2303 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2303; local6++) {
			Static81.anIntArray294[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2295; local18++) {
			if (this.anIntArray285 == null || this.anIntArray285[local18] != -1) {
				local33 = this.anIntArray281[local18];
				local38 = this.anIntArray280[local18];
				local43 = this.anIntArray277[local18];
				local47 = Static81.anIntArray306[local33];
				local51 = Static81.anIntArray306[local38];
				local55 = Static81.anIntArray306[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static81.anIntArray298[local33];
					local74 = Static81.anIntArray298[local38];
					@Pc(78) int local78 = Static81.anIntArray298[local43];
					@Pc(82) int local82 = Static81.anIntArray309[local33];
					local86 = Static81.anIntArray309[local38];
					local90 = Static81.anIntArray309[local43];
					@Pc(94) int local94 = Static81.anIntArray295[local33];
					local98 = Static81.anIntArray295[local38];
					@Pc(102) int local102 = Static81.anIntArray295[local43];
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
						Static81.aBooleanArray8[local18] = true;
						@Pc(183) int local183 = (Static81.anIntArray312[local33] + Static81.anIntArray312[local38] + Static81.anIntArray312[local43]) / 3 + this.anInt2302;
						Static81.anIntArrayArray50[local183][Static81.anIntArray294[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method1448(Static81.anInt2310, Static81.anInt2305, Static81.anIntArray291[local33], Static81.anIntArray291[local38], Static81.anIntArray291[local43], local47, local51, local55)) {
						Static81.anIntArray305[Static81.anInt2308++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static81.anIntArray291[local43] - Static81.anIntArray291[local38]) - (Static81.anIntArray291[local33] - Static81.anIntArray291[local38]) * (local55 - local51) > 0) {
						Static81.aBooleanArray8[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static93.anInt2472 && local51 <= Static93.anInt2472 && local55 <= Static93.anInt2472) {
							Static81.aBooleanArray9[local18] = false;
						} else {
							Static81.aBooleanArray9[local18] = true;
						}
						local70 = (Static81.anIntArray312[local33] + Static81.anIntArray312[local38] + Static81.anIntArray312[local43]) / 3 + this.anInt2302;
						Static81.anIntArrayArray50[local70][Static81.anIntArray294[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray275 == null) {
			for (local33 = this.anInt2303 - 1; local33 >= 0; local33--) {
				local38 = Static81.anIntArray294[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static81.anIntArrayArray50[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method1431(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static81.anIntArray297[local33] = 0;
			Static81.anIntArray307[local33] = 0;
		}
		for (local38 = this.anInt2303 - 1; local38 >= 0; local38--) {
			local43 = Static81.anIntArray294[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static81.anIntArrayArray50[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray275[local55];
					local74 = Static81.anIntArray297[local70]++;
					Static81.anIntArrayArray49[local70][local74] = local55;
					if (local70 < 10) {
						Static81.anIntArray307[local70] += local38;
					} else if (local70 == 10) {
						Static81.anIntArray301[local74] = local38;
					} else {
						Static81.anIntArray310[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static81.anIntArray297[1] > 0 || Static81.anIntArray297[2] > 0) {
			local43 = (Static81.anIntArray307[1] + Static81.anIntArray307[2]) / (Static81.anIntArray297[1] + Static81.anIntArray297[2]);
		}
		local47 = 0;
		if (Static81.anIntArray297[3] > 0 || Static81.anIntArray297[4] > 0) {
			local47 = (Static81.anIntArray307[3] + Static81.anIntArray307[4]) / (Static81.anIntArray297[3] + Static81.anIntArray297[4]);
		}
		local51 = 0;
		if (Static81.anIntArray297[6] > 0 || Static81.anIntArray297[8] > 0) {
			local51 = (Static81.anIntArray307[6] + Static81.anIntArray307[8]) / (Static81.anIntArray297[6] + Static81.anIntArray297[8]);
		}
		local70 = 0;
		local74 = Static81.anIntArray297[10];
		@Pc(524) int[] local524 = Static81.anIntArrayArray49[10];
		@Pc(526) int[] local526 = Static81.anIntArray301;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static81.anIntArray297[11];
			local524 = Static81.anIntArrayArray49[11];
			local526 = Static81.anIntArray310;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method1431(local524[local70++]);
				if (local70 == local74 && local524 != Static81.anIntArrayArray49[11]) {
					local70 = 0;
					local74 = Static81.anIntArray297[11];
					local524 = Static81.anIntArrayArray49[11];
					local526 = Static81.anIntArray310;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method1431(local524[local70++]);
				if (local70 == local74 && local524 != Static81.anIntArrayArray49[11]) {
					local70 = 0;
					local74 = Static81.anIntArray297[11];
					local524 = Static81.anIntArrayArray49[11];
					local526 = Static81.anIntArray310;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method1431(local524[local70++]);
				if (local70 == local74 && local524 != Static81.anIntArrayArray49[11]) {
					local70 = 0;
					local74 = Static81.anIntArray297[11];
					local524 = Static81.anIntArrayArray49[11];
					local526 = Static81.anIntArray310;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static81.anIntArray297[local86];
			@Pc(689) int[] local689 = Static81.anIntArrayArray49[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method1431(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method1431(local524[local70++]);
			if (local70 == local74 && local524 != Static81.anIntArrayArray49[11]) {
				local70 = 0;
				local524 = Static81.anIntArrayArray49[11];
				local74 = Static81.anIntArray297[11];
				local526 = Static81.anIntArray310;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "()I")
	public int method1441() {
		this.method1443();
		return this.anInt2301;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "()V")
	public void method1443() {
		if (this.anInt2297 == 1) {
			return;
		}
		this.anInt2297 = 1;
		super.anInt2285 = 0;
		this.anInt2300 = 0;
		this.anInt2301 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2299; local18++) {
			@Pc(24) int local24 = this.anIntArray290[local18];
			@Pc(29) int local29 = this.anIntArray279[local18];
			@Pc(34) int local34 = this.anIntArray282[local18];
			if (-local29 > super.anInt2285) {
				super.anInt2285 = -local29;
			}
			if (local29 > this.anInt2300) {
				this.anInt2300 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2301) {
				this.anInt2301 = local58;
			}
		}
		this.anInt2301 = (int) (Math.sqrt((double) this.anInt2301) + 0.99D);
		this.anInt2302 = (int) (Math.sqrt((double) (this.anInt2301 * this.anInt2301 + super.anInt2285 * super.anInt2285)) + 0.99D);
		this.anInt2303 = this.anInt2302 + (int) (Math.sqrt((double) (this.anInt2301 * this.anInt2301 + this.anInt2300 * this.anInt2300)) + 0.99D);
	}

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "()V")
	public void method1444() {
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2299; local7++) {
			@Pc(13) int local13 = this.anIntArray282[local7];
			this.anIntArray282[local7] = this.anIntArray290[local7];
			this.anIntArray290[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIII)V")
	public void method1445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt2297 != 2 && this.anInt2297 != 1) {
			this.method1435();
		}
		@Pc(11) int local11 = Static93.anInt2474;
		@Pc(13) int local13 = Static93.anInt2470;
		@Pc(17) int local17 = Static81.anIntArray300[0];
		@Pc(21) int local21 = Static81.anIntArray292[0];
		@Pc(25) int local25 = Static81.anIntArray300[arg0];
		@Pc(29) int local29 = Static81.anIntArray292[arg0];
		@Pc(33) int local33 = Static81.anIntArray300[arg1];
		@Pc(37) int local37 = Static81.anIntArray292[arg1];
		@Pc(41) int local41 = Static81.anIntArray300[arg2];
		@Pc(45) int local45 = Static81.anIntArray292[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2299; local57++) {
			@Pc(63) int local63 = this.anIntArray290[local57];
			@Pc(68) int local68 = this.anIntArray279[local57];
			@Pc(73) int local73 = this.anIntArray282[local57];
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
			Static81.anIntArray312[local57] = local73 - local55;
			Static81.anIntArray306[local57] = local11 + (local63 << 9) / local73;
			Static81.anIntArray291[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt2294 > 0) {
				Static81.anIntArray298[local57] = local63;
				Static81.anIntArray309[local57] = local85;
				Static81.anIntArray295[local57] = local73;
			}
		}
		try {
			this.method1440(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt2297 != 1) {
			this.method1443();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt2301 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt2301 << 9;
		if (local60 / local36 >= Static93.anInt2478) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt2301 << 9;
		if (local73 / local36 <= Static93.anInt2473) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt2301 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static93.anInt2471) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2285 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static93.anInt2475) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2285 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt2294 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static81.aBoolean108) {
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
			local215 = Static81.anInt2310 - Static93.anInt2474;
			local219 = Static81.anInt2305 - Static93.anInt2470;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean107) {
					Static81.anIntArray305[Static81.anInt2308++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static93.anInt2474;
		local215 = Static93.anInt2470;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static81.anIntArray300[arg0];
			local253 = Static81.anIntArray292[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt2299; local265++) {
			@Pc(271) int local271 = this.anIntArray290[local265];
			@Pc(276) int local276 = this.anIntArray279[local265];
			@Pc(281) int local281 = this.anIntArray282[local265];
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
			Static81.anIntArray312[local265] = local281 - local25;
			if (local281 >= 50) {
				Static81.anIntArray306[local265] = local168 + (local271 << 9) / local281;
				Static81.anIntArray291[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static81.anIntArray306[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static81.anIntArray298[local265] = local271;
				Static81.anIntArray309[local265] = local293;
				Static81.anIntArray295[local265] = local281;
			}
		}
		try {
			this.method1440(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "(I)V")
	private void method1446(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static93.anInt2474;
		@Pc(3) int local3 = Static93.anInt2470;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray281[arg0];
		@Pc(15) int local15 = this.anIntArray280[arg0];
		@Pc(20) int local20 = this.anIntArray277[arg0];
		@Pc(24) int local24 = Static81.anIntArray295[local10];
		@Pc(28) int local28 = Static81.anIntArray295[local15];
		@Pc(32) int local32 = Static81.anIntArray295[local20];
		if (this.anIntArray287 == null) {
			Static93.anInt2477 = 0;
		} else {
			Static93.anInt2477 = this.anIntArray287[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static81.anIntArray296[0] = Static81.anIntArray306[local10];
			Static81.anIntArray293[0] = Static81.anIntArray291[local10];
			local5++;
			Static81.anIntArray299[0] = this.anIntArray278[arg0];
		} else {
			local71 = Static81.anIntArray298[local10];
			local75 = Static81.anIntArray309[local10];
			local80 = this.anIntArray278[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static81.anIntArray302[local32 - local24];
				Static81.anIntArray296[0] = local1 + (local71 + ((Static81.anIntArray298[local20] - local71) * local93 >> 16) << 9) / 50;
				Static81.anIntArray293[0] = local3 + (local75 + ((Static81.anIntArray309[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static81.anIntArray299[0] = local80 + ((this.anIntArray283[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static81.anIntArray302[local28 - local24];
				Static81.anIntArray296[local5] = local1 + (local71 + ((Static81.anIntArray298[local15] - local71) * local93 >> 16) << 9) / 50;
				Static81.anIntArray293[local5] = local3 + (local75 + ((Static81.anIntArray309[local15] - local75) * local93 >> 16) << 9) / 50;
				Static81.anIntArray299[local5++] = local80 + ((this.anIntArray288[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static81.anIntArray296[local5] = Static81.anIntArray306[local15];
			Static81.anIntArray293[local5] = Static81.anIntArray291[local15];
			Static81.anIntArray299[local5++] = this.anIntArray288[arg0];
		} else {
			local71 = Static81.anIntArray298[local15];
			local75 = Static81.anIntArray309[local15];
			local80 = this.anIntArray288[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static81.anIntArray302[local24 - local28];
				Static81.anIntArray296[local5] = local1 + (local71 + ((Static81.anIntArray298[local10] - local71) * local93 >> 16) << 9) / 50;
				Static81.anIntArray293[local5] = local3 + (local75 + ((Static81.anIntArray309[local10] - local75) * local93 >> 16) << 9) / 50;
				Static81.anIntArray299[local5++] = local80 + ((this.anIntArray278[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static81.anIntArray302[local32 - local28];
				Static81.anIntArray296[local5] = local1 + (local71 + ((Static81.anIntArray298[local20] - local71) * local93 >> 16) << 9) / 50;
				Static81.anIntArray293[local5] = local3 + (local75 + ((Static81.anIntArray309[local20] - local75) * local93 >> 16) << 9) / 50;
				Static81.anIntArray299[local5++] = local80 + ((this.anIntArray283[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static81.anIntArray296[local5] = Static81.anIntArray306[local20];
			Static81.anIntArray293[local5] = Static81.anIntArray291[local20];
			Static81.anIntArray299[local5++] = this.anIntArray283[arg0];
		} else {
			local71 = Static81.anIntArray298[local20];
			local75 = Static81.anIntArray309[local20];
			local80 = this.anIntArray283[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static81.anIntArray302[local28 - local32];
				Static81.anIntArray296[local5] = local1 + (local71 + ((Static81.anIntArray298[local15] - local71) * local93 >> 16) << 9) / 50;
				Static81.anIntArray293[local5] = local3 + (local75 + ((Static81.anIntArray309[local15] - local75) * local93 >> 16) << 9) / 50;
				Static81.anIntArray299[local5++] = local80 + ((this.anIntArray288[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static81.anIntArray302[local24 - local32];
				Static81.anIntArray296[local5] = local1 + (local71 + ((Static81.anIntArray298[local10] - local71) * local93 >> 16) << 9) / 50;
				Static81.anIntArray293[local5] = local3 + (local75 + ((Static81.anIntArray309[local10] - local75) * local93 >> 16) << 9) / 50;
				Static81.anIntArray299[local5++] = local80 + ((this.anIntArray278[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static81.anIntArray296[0];
		local75 = Static81.anIntArray296[1];
		local80 = Static81.anIntArray296[2];
		local93 = Static81.anIntArray293[0];
		@Pc(588) int local588 = Static81.anIntArray293[1];
		@Pc(592) int local592 = Static81.anIntArray293[2];
		Static93.aBoolean118 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static93.anInt2472 || local75 > Static93.anInt2472 || local80 > Static93.anInt2472) {
				Static93.aBoolean118 = true;
			}
			if (this.anIntArray285 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray285[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static93.method1602(local93, local588, local592, local71, local75, local80, Static81.anIntArray299[0], Static81.anIntArray299[1], Static81.anIntArray299[2]);
			} else if (local619 == 1) {
				Static93.method1603(local93, local588, local592, local71, local75, local80, Static81.anIntArray304[this.anIntArray278[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray285[arg0] >> 2;
				local678 = this.anIntArray303[local673];
				local683 = this.anIntArray276[local673];
				local688 = this.anIntArray284[local673];
				Static93.method1599(local93, local588, local592, local71, local75, local80, Static81.anIntArray299[0], Static81.anIntArray299[1], Static81.anIntArray299[2], Static81.anIntArray298[local678], Static81.anIntArray298[local683], Static81.anIntArray298[local688], Static81.anIntArray309[local678], Static81.anIntArray309[local683], Static81.anIntArray309[local688], Static81.anIntArray295[local678], Static81.anIntArray295[local683], Static81.anIntArray295[local688], this.anIntArray273[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray285[arg0] >> 2;
				local678 = this.anIntArray303[local673];
				local683 = this.anIntArray276[local673];
				local688 = this.anIntArray284[local673];
				Static93.method1599(local93, local588, local592, local71, local75, local80, this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static81.anIntArray298[local678], Static81.anIntArray298[local683], Static81.anIntArray298[local688], Static81.anIntArray309[local678], Static81.anIntArray309[local683], Static81.anIntArray309[local688], Static81.anIntArray295[local678], Static81.anIntArray295[local683], Static81.anIntArray295[local688], this.anIntArray273[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static93.anInt2472 || local75 > Static93.anInt2472 || local80 > Static93.anInt2472 || Static81.anIntArray296[3] < 0 || Static81.anIntArray296[3] > Static93.anInt2472) {
			Static93.aBoolean118 = true;
		}
		if (this.anIntArray285 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray285[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static93.method1602(local93, local588, local592, local71, local75, local80, Static81.anIntArray299[0], Static81.anIntArray299[1], Static81.anIntArray299[2]);
			Static93.method1602(local93, local592, Static81.anIntArray293[3], local71, local80, Static81.anIntArray296[3], Static81.anIntArray299[0], Static81.anIntArray299[2], Static81.anIntArray299[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static81.anIntArray304[this.anIntArray278[arg0]];
			Static93.method1603(local93, local588, local592, local71, local75, local80, local673);
			Static93.method1603(local93, local592, Static81.anIntArray293[3], local71, local80, Static81.anIntArray296[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray285[arg0] >> 2;
			local678 = this.anIntArray303[local673];
			local683 = this.anIntArray276[local673];
			local688 = this.anIntArray284[local673];
			Static93.method1599(local93, local588, local592, local71, local75, local80, Static81.anIntArray299[0], Static81.anIntArray299[1], Static81.anIntArray299[2], Static81.anIntArray298[local678], Static81.anIntArray298[local683], Static81.anIntArray298[local688], Static81.anIntArray309[local678], Static81.anIntArray309[local683], Static81.anIntArray309[local688], Static81.anIntArray295[local678], Static81.anIntArray295[local683], Static81.anIntArray295[local688], this.anIntArray273[arg0]);
			Static93.method1599(local93, local592, Static81.anIntArray293[3], local71, local80, Static81.anIntArray296[3], Static81.anIntArray299[0], Static81.anIntArray299[2], Static81.anIntArray299[3], Static81.anIntArray298[local678], Static81.anIntArray298[local683], Static81.anIntArray298[local688], Static81.anIntArray309[local678], Static81.anIntArray309[local683], Static81.anIntArray309[local688], Static81.anIntArray295[local678], Static81.anIntArray295[local683], Static81.anIntArray295[local688], this.anIntArray273[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray285[arg0] >> 2;
		local678 = this.anIntArray303[local673];
		local683 = this.anIntArray276[local673];
		local688 = this.anIntArray284[local673];
		Static93.method1599(local93, local588, local592, local71, local75, local80, this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static81.anIntArray298[local678], Static81.anIntArray298[local683], Static81.anIntArray298[local688], Static81.anIntArray309[local678], Static81.anIntArray309[local683], Static81.anIntArray309[local688], Static81.anIntArray295[local678], Static81.anIntArray295[local683], Static81.anIntArray295[local688], this.anIntArray273[arg0]);
		Static93.method1599(local93, local592, Static81.anIntArray293[3], local71, local80, Static81.anIntArray296[3], this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static81.anIntArray298[local678], Static81.anIntArray298[local683], Static81.anIntArray298[local688], Static81.anIntArray309[local678], Static81.anIntArray309[local683], Static81.anIntArray309[local688], Static81.anIntArray295[local678], Static81.anIntArray295[local683], Static81.anIntArray295[local688], this.anIntArray273[arg0]);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(Z)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1447(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static81.anIntArray308.length < this.anInt2295) {
			Static81.anIntArray308 = new int[this.anInt2295 + 100];
		}
		return this.method1434(arg0, Static81.aClass1_Sub1_Sub2_Sub6_3, Static81.anIntArray308);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	private void method1449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2295; local1++) {
			local7 = this.anIntArray281[local1];
			@Pc(12) int local12 = this.anIntArray280[local1];
			@Pc(17) int local17 = this.anIntArray277[local1];
			@Pc(30) Class20 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray285 == null) {
				local25 = this.anIntArray273[local1];
				local30 = this.aClass20Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt879 + arg3 * local30.anInt877 + arg4 * local30.anInt875) / (arg1 * local30.anInt876);
				this.anIntArray278[local1] = Static81.method1453(local25, local52, 0);
				@Pc(65) Class20 local65 = this.aClass20Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt879 + arg3 * local65.anInt877 + arg4 * local65.anInt875) / (arg1 * local65.anInt876);
				this.anIntArray288[local1] = Static81.method1453(local25, local87, 0);
				@Pc(100) Class20 local100 = this.aClass20Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt879 + arg3 * local100.anInt877 + arg4 * local100.anInt875) / (arg1 * local100.anInt876);
				this.anIntArray283[local1] = Static81.method1453(local25, local122, 0);
			} else if ((this.anIntArray285[local1] & 0x1) == 0) {
				local25 = this.anIntArray273[local1];
				@Pc(148) int local148 = this.anIntArray285[local1];
				local30 = this.aClass20Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt879 + arg3 * local30.anInt877 + arg4 * local30.anInt875) / (arg1 * local30.anInt876);
				this.anIntArray278[local1] = Static81.method1453(local25, local52, local148);
				local30 = this.aClass20Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt879 + arg3 * local30.anInt877 + arg4 * local30.anInt875) / (arg1 * local30.anInt876);
				this.anIntArray288[local1] = Static81.method1453(local25, local52, local148);
				local30 = this.aClass20Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt879 + arg3 * local30.anInt877 + arg4 * local30.anInt875) / (arg1 * local30.anInt876);
				this.anIntArray283[local1] = Static81.method1453(local25, local52, local148);
			}
		}
		this.aClass20Array2 = null;
		this.aClass20Array1 = null;
		this.anIntArray286 = null;
		this.anIntArray274 = null;
		if (this.anIntArray285 != null) {
			for (local7 = 0; local7 < this.anInt2295; local7++) {
				if ((this.anIntArray285[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray273 = null;
	}

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "()V")
	public void method1450() {
		this.aClass20Array2 = null;
		this.anInt2297 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2299; local7++) {
			@Pc(13) int local13 = this.anIntArray290[local7];
			this.anIntArray290[local7] = this.anIntArray282[local7];
			this.anIntArray282[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!qb;I)I")
	private int method1451(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray290[arg1];
		@Pc(11) int local11 = arg0.anIntArray279[arg1];
		@Pc(16) int local16 = arg0.anIntArray282[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2299; local18++) {
			if (local6 == this.anIntArray290[local18] && local11 == this.anIntArray279[local18] && local16 == this.anIntArray282[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray290[this.anInt2299] = local6;
			this.anIntArray279[this.anInt2299] = local11;
			this.anIntArray282[this.anInt2299] = local16;
			if (arg0.anIntArray286 != null) {
				this.anIntArray286[this.anInt2299] = arg0.anIntArray286[arg1];
			}
			local1 = this.anInt2299++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "()V")
	public void method1452() {
		if (this.anInt2297 == 3) {
			return;
		}
		this.anInt2297 = 3;
		super.anInt2285 = 0;
		this.anInt2300 = 0;
		this.anInt2301 = 999999;
		this.anInt2303 = -999999;
		this.anInt2302 = -99999;
		this.anInt2296 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2299; local27++) {
			@Pc(33) int local33 = this.anIntArray290[local27];
			@Pc(38) int local38 = this.anIntArray279[local27];
			@Pc(43) int local43 = this.anIntArray282[local27];
			if (local33 < this.anInt2301) {
				this.anInt2301 = local33;
			}
			if (local33 > this.anInt2303) {
				this.anInt2303 = local33;
			}
			if (local43 < this.anInt2296) {
				this.anInt2296 = local43;
			}
			if (local43 > this.anInt2302) {
				this.anInt2302 = local43;
			}
			if (-local38 > super.anInt2285) {
				super.anInt2285 = -local38;
			}
			if (local38 > this.anInt2300) {
				this.anInt2300 = local38;
			}
		}
	}
}
