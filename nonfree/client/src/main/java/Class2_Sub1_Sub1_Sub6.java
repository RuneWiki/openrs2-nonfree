import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub1_Sub1_Sub6 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!r", name = "hc", descriptor = "[I")
	public static int[] anIntArray348 = new int[128];

	@OriginalMember(owner = "client!r", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
	public int anInt2501;

	@OriginalMember(owner = "client!r", name = "ub", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!r", name = "yb", descriptor = "I")
	public int anInt2502;

	@OriginalMember(owner = "client!r", name = "Db", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!r", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!r", name = "Gb", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!r", name = "Hb", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!r", name = "Lb", descriptor = "[Lclient!lb;")
	public Class37[] aClass37Array1;

	@OriginalMember(owner = "client!r", name = "Ob", descriptor = "I")
	public int anInt2506;

	@OriginalMember(owner = "client!r", name = "Tb", descriptor = "I")
	private int anInt2509;

	@OriginalMember(owner = "client!r", name = "Ub", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!r", name = "Vb", descriptor = "I")
	public int anInt2511;

	@OriginalMember(owner = "client!r", name = "Zb", descriptor = "[Lclient!lb;")
	public Class37[] aClass37Array2;

	@OriginalMember(owner = "client!r", name = "Kb", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!r", name = "Cb", descriptor = "I")
	private int anInt2504 = 0;

	@OriginalMember(owner = "client!r", name = "Qb", descriptor = "I")
	public int anInt2507 = 0;

	@OriginalMember(owner = "client!r", name = "Rb", descriptor = "I")
	private int anInt2508 = 0;

	@OriginalMember(owner = "client!r", name = "zb", descriptor = "I")
	public int anInt2503 = 0;

	@OriginalMember(owner = "client!r", name = "cc", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!r", name = "Sb", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!r", name = "Pb", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!r", name = "Ib", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!r", name = "vb", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!r", name = "xb", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!r", name = "Ab", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!r", name = "Jb", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!r", name = "Nb", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!r", name = "Bb", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!r", name = "ac", descriptor = "[I")
	public int[] anIntArray342;

	@OriginalMember(owner = "client!r", name = "wb", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!r", name = "Yb", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!r", name = "Mb", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!r", name = "Wb", descriptor = "[I")
	private int[] anIntArray340;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray348[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray348[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray348[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray348[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray348[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class2_Sub8 local21 = new Class2_Sub8(arg0);
		@Pc(26) Class2_Sub8 local26 = new Class2_Sub8(arg0);
		@Pc(31) Class2_Sub8 local31 = new Class2_Sub8(arg0);
		@Pc(36) Class2_Sub8 local36 = new Class2_Sub8(arg0);
		@Pc(41) Class2_Sub8 local41 = new Class2_Sub8(arg0);
		local21.anInt2342 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1396();
		@Pc(55) int local55 = local21.method1396();
		@Pc(59) int local59 = local21.method1410();
		@Pc(63) int local63 = local21.method1410();
		@Pc(67) int local67 = local21.method1410();
		@Pc(71) int local71 = local21.method1410();
		@Pc(75) int local75 = local21.method1410();
		@Pc(79) int local79 = local21.method1410();
		@Pc(83) int local83 = local21.method1396();
		@Pc(87) int local87 = local21.method1396();
		@Pc(91) int local91 = local21.method1396();
		@Pc(95) int local95 = local21.method1396();
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
		this.anInt2507 = local51;
		this.anInt2503 = local55;
		this.anInt2508 = local59;
		this.anIntArray344 = new int[local51];
		this.anIntArray339 = new int[local51];
		this.anIntArray338 = new int[local51];
		this.anIntArray334 = new int[local55];
		this.anIntArray327 = new int[local55];
		this.anIntArray329 = new int[local55];
		this.anIntArray330 = new int[local59];
		this.anIntArray335 = new int[local59];
		this.anIntArray337 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray331 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray342 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray328 = new int[local55];
		} else {
			this.anInt2504 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray341 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray336 = new int[local55];
		}
		this.anIntArray340 = new int[local55];
		local21.anInt2342 = local97;
		local26.anInt2342 = local196;
		local31.anInt2342 = local202;
		local36.anInt2342 = local103;
		local41.anInt2342 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1410();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1399();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1399();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1399();
			}
			this.anIntArray344[local321] = local315 + local328;
			this.anIntArray339[local321] = local317 + local338;
			this.anIntArray338[local321] = local319 + local348;
			local315 = this.anIntArray344[local321];
			local317 = this.anIntArray339[local321];
			local319 = this.anIntArray338[local321];
			if (this.anIntArray331 != null) {
				this.anIntArray331[local321] = local41.method1410();
			}
		}
		local21.anInt2342 = local180;
		local26.anInt2342 = local138;
		local31.anInt2342 = local111;
		local36.anInt2342 = local162;
		local41.anInt2342 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray340[local326] = local21.method1396();
			if (this.anIntArray342 != null) {
				this.anIntArray342[local326] = local26.method1410();
			}
			if (this.anIntArray328 != null) {
				this.anIntArray328[local326] = local31.method1410();
			}
			if (this.anIntArray341 != null) {
				this.anIntArray341[local326] = local36.method1410();
			}
			if (this.anIntArray336 != null) {
				this.anIntArray336[local326] = local41.method1410();
			}
		}
		local21.anInt2342 = local174;
		local26.anInt2342 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1410();
			if (local496 == 1) {
				local328 = local21.method1399() + local489;
				local338 = local21.method1399() + local328;
				local348 = local21.method1399() + local338;
				local489 = local348;
				this.anIntArray334[local491] = local328;
				this.anIntArray327[local491] = local338;
				this.anIntArray329[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1399() + local489;
				local489 = local348;
				this.anIntArray334[local491] = local328;
				this.anIntArray327[local491] = local338;
				this.anIntArray329[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1399() + local489;
				local489 = local348;
				this.anIntArray334[local491] = local328;
				this.anIntArray327[local491] = local338;
				this.anIntArray329[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1399() + local489;
				local489 = local348;
				this.anIntArray334[local491] = local328;
				this.anIntArray327[local491] = local599;
				this.anIntArray329[local491] = local348;
			}
		}
		local21.anInt2342 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray330[local496] = local21.method1396();
			this.anIntArray335[local496] = local21.method1396();
			this.anIntArray337[local496] = local21.method1396();
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "([Lclient!r;I)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) Class2_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2507 = 0;
		this.anInt2503 = 0;
		this.anInt2508 = 0;
		this.anInt2504 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub1_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2507 += local43.anInt2507;
				this.anInt2503 += local43.anInt2503;
				this.anInt2508 += local43.anInt2508;
				local18 |= local43.anIntArray342 != null;
				if (local43.anIntArray328 == null) {
					if (this.anInt2504 == -1) {
						this.anInt2504 = local43.anInt2504;
					}
					if (this.anInt2504 != local43.anInt2504) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray341 != null;
				local24 |= local43.anIntArray336 != null;
			}
		}
		this.anIntArray344 = new int[this.anInt2507];
		this.anIntArray339 = new int[this.anInt2507];
		this.anIntArray338 = new int[this.anInt2507];
		this.anIntArray331 = new int[this.anInt2507];
		this.anIntArray334 = new int[this.anInt2503];
		this.anIntArray327 = new int[this.anInt2503];
		this.anIntArray329 = new int[this.anInt2503];
		this.anIntArray330 = new int[this.anInt2508];
		this.anIntArray335 = new int[this.anInt2508];
		this.anIntArray337 = new int[this.anInt2508];
		if (local18) {
			this.anIntArray342 = new int[this.anInt2503];
		}
		if (local20) {
			this.anIntArray328 = new int[this.anInt2503];
		}
		if (local22) {
			this.anIntArray341 = new int[this.anInt2503];
		}
		if (local24) {
			this.anIntArray336 = new int[this.anInt2503];
		}
		this.anIntArray340 = new int[this.anInt2503];
		this.anInt2507 = 0;
		this.anInt2503 = 0;
		this.anInt2508 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class2_Sub1_Sub1_Sub6 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt2503; local223++) {
					if (local18) {
						if (local219.anIntArray342 == null) {
							this.anIntArray342[this.anInt2503] = 0;
						} else {
							local241 = local219.anIntArray342[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray342[this.anInt2503] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray328 == null) {
							this.anIntArray328[this.anInt2503] = local219.anInt2504;
						} else {
							this.anIntArray328[this.anInt2503] = local219.anIntArray328[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray341 == null) {
							this.anIntArray341[this.anInt2503] = 0;
						} else {
							this.anIntArray341[this.anInt2503] = local219.anIntArray341[local223];
						}
					}
					if (local24 && local219.anIntArray336 != null) {
						this.anIntArray336[this.anInt2503] = local219.anIntArray336[local223];
					}
					this.anIntArray340[this.anInt2503] = local219.anIntArray340[local223];
					this.anIntArray334[this.anInt2503] = this.method1537(local219, local219.anIntArray334[local223]);
					this.anIntArray327[this.anInt2503] = this.method1537(local219, local219.anIntArray327[local223]);
					this.anIntArray329[this.anInt2503] = this.method1537(local219, local219.anIntArray329[local223]);
					this.anInt2503++;
				}
				for (local241 = 0; local241 < local219.anInt2508; local241++) {
					this.anIntArray330[this.anInt2508] = this.method1537(local219, local219.anIntArray330[local241]);
					this.anIntArray335[this.anInt2508] = this.method1537(local219, local219.anIntArray335[local241]);
					this.anIntArray337[this.anInt2508] = this.method1537(local219, local219.anIntArray337[local241]);
					this.anInt2508++;
				}
				local212 += local219.anInt2508;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "([Lclient!r;IZ)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) Class2_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2507 = 0;
		this.anInt2503 = 0;
		this.anInt2508 = 0;
		this.anInt2504 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub1_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2507 += local43.anInt2507;
				this.anInt2503 += local43.anInt2503;
				this.anInt2508 += local43.anInt2508;
				local18 |= local43.anIntArray342 != null;
				if (local43.anIntArray328 == null) {
					if (this.anInt2504 == -1) {
						this.anInt2504 = local43.anInt2504;
					}
					if (this.anInt2504 != local43.anInt2504) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray341 != null;
				local24 |= local43.anIntArray340 != null;
			}
		}
		this.anIntArray344 = new int[this.anInt2507];
		this.anIntArray339 = new int[this.anInt2507];
		this.anIntArray338 = new int[this.anInt2507];
		this.anIntArray334 = new int[this.anInt2503];
		this.anIntArray327 = new int[this.anInt2503];
		this.anIntArray329 = new int[this.anInt2503];
		this.anIntArray332 = new int[this.anInt2503];
		this.anIntArray326 = new int[this.anInt2503];
		this.anIntArray333 = new int[this.anInt2503];
		this.anIntArray330 = new int[this.anInt2508];
		this.anIntArray335 = new int[this.anInt2508];
		this.anIntArray337 = new int[this.anInt2508];
		if (local18) {
			this.anIntArray342 = new int[this.anInt2503];
		}
		if (local20) {
			this.anIntArray328 = new int[this.anInt2503];
		}
		if (local22) {
			this.anIntArray341 = new int[this.anInt2503];
		}
		if (local24) {
			this.anIntArray340 = new int[this.anInt2503];
		}
		this.anInt2507 = 0;
		this.anInt2503 = 0;
		this.anInt2508 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class2_Sub1_Sub1_Sub6 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt2507;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt2507; local231++) {
					this.anIntArray344[this.anInt2507] = local224.anIntArray344[local231];
					this.anIntArray339[this.anInt2507] = local224.anIntArray339[local231];
					this.anIntArray338[this.anInt2507] = local224.anIntArray338[local231];
					this.anInt2507++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt2503; local272++) {
					this.anIntArray334[this.anInt2503] = local224.anIntArray334[local272] + local229;
					this.anIntArray327[this.anInt2503] = local224.anIntArray327[local272] + local229;
					this.anIntArray329[this.anInt2503] = local224.anIntArray329[local272] + local229;
					this.anIntArray332[this.anInt2503] = local224.anIntArray332[local272];
					this.anIntArray326[this.anInt2503] = local224.anIntArray326[local272];
					this.anIntArray333[this.anInt2503] = local224.anIntArray333[local272];
					if (local18) {
						if (local224.anIntArray342 == null) {
							this.anIntArray342[this.anInt2503] = 0;
						} else {
							local350 = local224.anIntArray342[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray342[this.anInt2503] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray328 == null) {
							this.anIntArray328[this.anInt2503] = local224.anInt2504;
						} else {
							this.anIntArray328[this.anInt2503] = local224.anIntArray328[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray341 == null) {
							this.anIntArray341[this.anInt2503] = 0;
						} else {
							this.anIntArray341[this.anInt2503] = local224.anIntArray341[local272];
						}
					}
					if (local24 && local224.anIntArray340 != null) {
						this.anIntArray340[this.anInt2503] = local224.anIntArray340[local272];
					}
					this.anInt2503++;
				}
				for (local350 = 0; local350 < local224.anInt2508; local350++) {
					this.anIntArray330[this.anInt2508] = local224.anIntArray330[local350] + local229;
					this.anIntArray335[this.anInt2508] = local224.anIntArray335[local350] + local229;
					this.anIntArray337[this.anInt2508] = local224.anIntArray337[local350] + local229;
					this.anInt2508++;
				}
				local217 += local224.anInt2508;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!r;ZZZ)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2507 = arg0.anInt2507;
		this.anInt2503 = arg0.anInt2503;
		this.anInt2508 = arg0.anInt2508;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray344 = arg0.anIntArray344;
			this.anIntArray339 = arg0.anIntArray339;
			this.anIntArray338 = arg0.anIntArray338;
		} else {
			this.anIntArray344 = new int[this.anInt2507];
			this.anIntArray339 = new int[this.anInt2507];
			this.anIntArray338 = new int[this.anInt2507];
			for (local60 = 0; local60 < this.anInt2507; local60++) {
				this.anIntArray344[local60] = arg0.anIntArray344[local60];
				this.anIntArray339[local60] = arg0.anIntArray339[local60];
				this.anIntArray338[local60] = arg0.anIntArray338[local60];
			}
		}
		if (arg2) {
			this.anIntArray340 = arg0.anIntArray340;
		} else {
			this.anIntArray340 = new int[this.anInt2503];
			for (local60 = 0; local60 < this.anInt2503; local60++) {
				this.anIntArray340[local60] = arg0.anIntArray340[local60];
			}
		}
		this.anIntArray341 = arg0.anIntArray341;
		this.anIntArray331 = arg0.anIntArray331;
		this.anIntArray336 = arg0.anIntArray336;
		this.anIntArray342 = arg0.anIntArray342;
		this.anIntArray334 = arg0.anIntArray334;
		this.anIntArray327 = arg0.anIntArray327;
		this.anIntArray329 = arg0.anIntArray329;
		this.anIntArray328 = arg0.anIntArray328;
		this.anInt2504 = arg0.anInt2504;
		this.anIntArray330 = arg0.anIntArray330;
		this.anIntArray335 = arg0.anIntArray335;
		this.anIntArray337 = arg0.anIntArray337;
		this.aBoolean127 = arg0.aBoolean127;
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!r;ZZ)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt2507 = arg0.anInt2507;
		this.anInt2503 = arg0.anInt2503;
		this.anInt2508 = arg0.anInt2508;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray339 = new int[this.anInt2507];
			for (local37 = 0; local37 < this.anInt2507; local37++) {
				this.anIntArray339[local37] = arg0.anIntArray339[local37];
			}
		} else {
			this.anIntArray339 = arg0.anIntArray339;
		}
		if (arg2) {
			this.anIntArray332 = new int[this.anInt2503];
			this.anIntArray326 = new int[this.anInt2503];
			this.anIntArray333 = new int[this.anInt2503];
			for (local37 = 0; local37 < this.anInt2503; local37++) {
				this.anIntArray332[local37] = arg0.anIntArray332[local37];
				this.anIntArray326[local37] = arg0.anIntArray326[local37];
				this.anIntArray333[local37] = arg0.anIntArray333[local37];
			}
			this.anIntArray342 = new int[this.anInt2503];
			@Pc(115) int local115;
			if (arg0.anIntArray342 == null) {
				for (local115 = 0; local115 < this.anInt2503; local115++) {
					this.anIntArray342[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt2503; local115++) {
					this.anIntArray342[local115] = arg0.anIntArray342[local115];
				}
			}
			this.aClass37Array1 = new Class37[this.anInt2507];
			for (local115 = 0; local115 < this.anInt2507; local115++) {
				@Pc(160) Class37 local160 = this.aClass37Array1[local115] = new Class37();
				@Pc(165) Class37 local165 = arg0.aClass37Array1[local115];
				local160.anInt1841 = local165.anInt1841;
				local160.anInt1842 = local165.anInt1842;
				local160.anInt1846 = local165.anInt1846;
				local160.anInt1845 = local165.anInt1845;
			}
			this.aClass37Array2 = arg0.aClass37Array2;
		} else {
			this.anIntArray332 = arg0.anIntArray332;
			this.anIntArray326 = arg0.anIntArray326;
			this.anIntArray333 = arg0.anIntArray333;
			this.anIntArray342 = arg0.anIntArray342;
		}
		this.anIntArray344 = arg0.anIntArray344;
		this.anIntArray338 = arg0.anIntArray338;
		this.anIntArray340 = arg0.anIntArray340;
		this.anIntArray341 = arg0.anIntArray341;
		this.anIntArray328 = arg0.anIntArray328;
		this.anInt2504 = arg0.anInt2504;
		this.anIntArray334 = arg0.anIntArray334;
		this.anIntArray327 = arg0.anIntArray327;
		this.anIntArray329 = arg0.anIntArray329;
		this.anIntArray330 = arg0.anIntArray330;
		this.anIntArray335 = arg0.anIntArray335;
		this.anIntArray337 = arg0.anIntArray337;
		this.aBoolean127 = arg0.aBoolean127;
		this.anInt2510 = arg0.anInt2510;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public void method1514(@OriginalArg(0) int arg0) {
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		@Pc(9) int local9 = Static86.anIntArray354[arg0];
		@Pc(13) int local13 = Static86.anIntArray363[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2507; local15++) {
			@Pc(32) int local32 = this.anIntArray339[local15] * local13 - this.anIntArray338[local15] * local9 >> 16;
			this.anIntArray338[local15] = this.anIntArray339[local15] * local9 + this.anIntArray338[local15] * local13 >> 16;
			this.anIntArray339[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public void method1515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2503; local1++) {
			if (this.anIntArray340[local1] == arg0) {
				this.anIntArray340[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public void method1516() {
		if (this.anInt2509 == 1) {
			return;
		}
		this.anInt2509 = 1;
		super.anInt2496 = 0;
		this.anInt2501 = 0;
		this.anInt2505 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2507; local18++) {
			@Pc(24) int local24 = this.anIntArray344[local18];
			@Pc(29) int local29 = this.anIntArray339[local18];
			@Pc(34) int local34 = this.anIntArray338[local18];
			if (-local29 > super.anInt2496) {
				super.anInt2496 = -local29;
			}
			if (local29 > this.anInt2501) {
				this.anInt2501 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2505) {
				this.anInt2505 = local58;
			}
		}
		this.anInt2505 = (int) (Math.sqrt((double) this.anInt2505) + 0.99D);
		this.anInt2506 = (int) (Math.sqrt((double) (this.anInt2505 * this.anInt2505 + super.anInt2496 * super.anInt2496)) + 0.99D);
		this.anInt2502 = this.anInt2506 + (int) (Math.sqrt((double) (this.anInt2505 * this.anInt2505 + this.anInt2501 * this.anInt2501)) + 0.99D);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public void method1517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2507; local7++) {
			this.anIntArray344[local7] = this.anIntArray344[local7] * arg0 / 128;
			this.anIntArray339[local7] = this.anIntArray339[local7] * arg1 / 128;
			this.anIntArray338[local7] = this.anIntArray338[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLclient!r;[I)Lclient!r;")
	private Class2_Sub1_Sub1_Sub6 method1518(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt2507 = this.anInt2507;
		arg1.anInt2503 = this.anInt2503;
		arg1.anInt2508 = this.anInt2508;
		if (arg1.anIntArray344 == null || arg1.anIntArray344.length < this.anInt2507) {
			arg1.anIntArray344 = new int[this.anInt2507 + 100];
			arg1.anIntArray339 = new int[this.anInt2507 + 100];
			arg1.anIntArray338 = new int[this.anInt2507 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2507; local43++) {
			arg1.anIntArray344[local43] = this.anIntArray344[local43];
			arg1.anIntArray339[local43] = this.anIntArray339[local43];
			arg1.anIntArray338[local43] = this.anIntArray338[local43];
		}
		if (arg0) {
			arg1.anIntArray341 = this.anIntArray341;
		} else {
			arg1.anIntArray341 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray341 == null) {
				for (local88 = 0; local88 < this.anInt2503; local88++) {
					arg1.anIntArray341[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2503; local88++) {
					arg1.anIntArray341[local88] = this.anIntArray341[local88];
				}
			}
		}
		arg1.anIntArray342 = this.anIntArray342;
		arg1.anIntArray340 = this.anIntArray340;
		arg1.anIntArray328 = this.anIntArray328;
		arg1.anInt2504 = this.anInt2504;
		arg1.anIntArrayArray21 = this.anIntArrayArray21;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.anIntArray334 = this.anIntArray334;
		arg1.anIntArray327 = this.anIntArray327;
		arg1.anIntArray329 = this.anIntArray329;
		arg1.anIntArray332 = this.anIntArray332;
		arg1.anIntArray326 = this.anIntArray326;
		arg1.anIntArray333 = this.anIntArray333;
		arg1.anIntArray330 = this.anIntArray330;
		arg1.anIntArray335 = this.anIntArray335;
		arg1.anIntArray337 = this.anIntArray337;
		arg1.aBoolean127 = this.aBoolean127;
		arg1.anInt2509 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	private void method1519(@OriginalArg(0) int arg0) {
		if (Static86.aBooleanArray23[arg0]) {
			this.method1532(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray334[arg0];
		@Pc(17) int local17 = this.anIntArray327[arg0];
		@Pc(22) int local22 = this.anIntArray329[arg0];
		Static10.aBoolean30 = Static86.aBooleanArray24[arg0];
		if (this.anIntArray341 == null) {
			Static10.anInt405 = 0;
		} else {
			Static10.anInt405 = this.anIntArray341[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray342 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray342[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static10.method245(Static86.anIntArray350[local12], Static86.anIntArray350[local17], Static86.anIntArray350[local22], Static86.anIntArray361[local12], Static86.anIntArray361[local17], Static86.anIntArray361[local22], this.anIntArray332[arg0], this.anIntArray326[arg0], this.anIntArray333[arg0]);
		} else if (local42 == 1) {
			Static10.method244(Static86.anIntArray350[local12], Static86.anIntArray350[local17], Static86.anIntArray350[local22], Static86.anIntArray361[local12], Static86.anIntArray361[local17], Static86.anIntArray361[local22], Static86.anIntArray359[this.anIntArray332[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray342[arg0] >> 2;
				local128 = this.anIntArray330[local123];
				local133 = this.anIntArray335[local123];
				local138 = this.anIntArray337[local123];
				Static10.method242(Static86.anIntArray350[local12], Static86.anIntArray350[local17], Static86.anIntArray350[local22], Static86.anIntArray361[local12], Static86.anIntArray361[local17], Static86.anIntArray361[local22], this.anIntArray332[arg0], this.anIntArray326[arg0], this.anIntArray333[arg0], Static86.anIntArray365[local128], Static86.anIntArray365[local133], Static86.anIntArray365[local138], Static86.anIntArray356[local128], Static86.anIntArray356[local133], Static86.anIntArray356[local138], Static86.anIntArray362[local128], Static86.anIntArray362[local133], Static86.anIntArray362[local138], this.anIntArray340[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray342[arg0] >> 2;
				local128 = this.anIntArray330[local123];
				local133 = this.anIntArray335[local123];
				local138 = this.anIntArray337[local123];
				Static10.method242(Static86.anIntArray350[local12], Static86.anIntArray350[local17], Static86.anIntArray350[local22], Static86.anIntArray361[local12], Static86.anIntArray361[local17], Static86.anIntArray361[local22], this.anIntArray332[arg0], this.anIntArray332[arg0], this.anIntArray332[arg0], Static86.anIntArray365[local128], Static86.anIntArray365[local133], Static86.anIntArray365[local138], Static86.anIntArray356[local128], Static86.anIntArray356[local133], Static86.anIntArray356[local138], Static86.anIntArray362[local128], Static86.anIntArray362[local133], Static86.anIntArray362[local138], this.anIntArray340[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt2509 != 1) {
			this.method1516();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt2505 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt2505 << 9;
		if (local60 / local36 >= Static10.anInt401) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt2505 << 9;
		if (local73 / local36 <= Static10.anInt403) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt2505 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static10.anInt400) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2496 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static10.anInt406) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2496 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt2508 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static86.aBoolean128) {
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
			local215 = Static86.anInt2513 - Static10.anInt407;
			local219 = Static86.anInt2516 - Static10.anInt399;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean127) {
					Static86.anIntArray349[Static86.anInt2517++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static10.anInt407;
		local215 = Static10.anInt399;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static86.anIntArray354[arg0];
			local253 = Static86.anIntArray363[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt2507; local265++) {
			@Pc(271) int local271 = this.anIntArray344[local265];
			@Pc(276) int local276 = this.anIntArray339[local265];
			@Pc(281) int local281 = this.anIntArray338[local265];
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
			Static86.anIntArray358[local265] = local281 - local25;
			if (local281 >= 50) {
				Static86.anIntArray361[local265] = local168 + (local271 << 9) / local281;
				Static86.anIntArray350[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static86.anIntArray361[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static86.anIntArray365[local265] = local271;
				Static86.anIntArray356[local265] = local293;
				Static86.anIntArray362[local265] = local281;
			}
		}
		try {
			this.method1544(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[IIII)V")
	private void method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static86.anInt2515 = 0;
			Static86.anInt2514 = 0;
			Static86.anInt2512 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray22.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray22[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static86.anInt2515 += this.anIntArray344[local36];
						Static86.anInt2514 += this.anIntArray339[local36];
						Static86.anInt2512 += this.anIntArray338[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static86.anInt2515 = Static86.anInt2515 / local6 + arg2;
				Static86.anInt2514 = Static86.anInt2514 / local6 + arg3;
				Static86.anInt2512 = Static86.anInt2512 / local6 + arg4;
			} else {
				Static86.anInt2515 = arg2;
				Static86.anInt2514 = arg3;
				Static86.anInt2512 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray344[local31] += arg2;
						this.anIntArray339[local31] += arg3;
						this.anIntArray338[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray344[local31] -= Static86.anInt2515;
						this.anIntArray339[local31] -= Static86.anInt2514;
						this.anIntArray338[local31] -= Static86.anInt2512;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static86.anIntArray354[local225];
							local235 = Static86.anIntArray363[local225];
							local251 = this.anIntArray339[local31] * local231 + this.anIntArray344[local31] * local235 >> 16;
							this.anIntArray339[local31] = this.anIntArray339[local31] * local235 - this.anIntArray344[local31] * local231 >> 16;
							this.anIntArray344[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static86.anIntArray354[local36];
							local235 = Static86.anIntArray363[local36];
							local251 = this.anIntArray339[local31] * local235 - this.anIntArray338[local31] * local231 >> 16;
							this.anIntArray338[local31] = this.anIntArray339[local31] * local231 + this.anIntArray338[local31] * local235 >> 16;
							this.anIntArray339[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static86.anIntArray354[local219];
							local235 = Static86.anIntArray363[local219];
							local251 = this.anIntArray338[local31] * local231 + this.anIntArray344[local31] * local235 >> 16;
							this.anIntArray338[local31] = this.anIntArray338[local31] * local235 - this.anIntArray344[local31] * local231 >> 16;
							this.anIntArray344[local31] = local251;
						}
						this.anIntArray344[local31] += Static86.anInt2515;
						this.anIntArray339[local31] += Static86.anInt2514;
						this.anIntArray338[local31] += Static86.anInt2512;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray344[local31] -= Static86.anInt2515;
						this.anIntArray339[local31] -= Static86.anInt2514;
						this.anIntArray338[local31] -= Static86.anInt2512;
						this.anIntArray344[local31] = this.anIntArray344[local31] * arg2 / 128;
						this.anIntArray339[local31] = this.anIntArray339[local31] * arg3 / 128;
						this.anIntArray338[local31] = this.anIntArray338[local31] * arg4 / 128;
						this.anIntArray344[local31] += Static86.anInt2515;
						this.anIntArray339[local31] += Static86.anInt2514;
						this.anIntArray338[local31] += Static86.anInt2512;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray21 != null && this.anIntArray341 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray341[local31] += arg2 * 8;
						if (this.anIntArray341[local31] < 0) {
							this.anIntArray341[local31] = 0;
						}
						if (this.anIntArray341[local31] > 255) {
							this.anIntArray341[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1522(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static86.anIntArray343.length < this.anInt2503) {
			Static86.anIntArray343 = new int[this.anInt2503 + 100];
		}
		return this.method1518(arg0, Static86.aClass2_Sub1_Sub1_Sub6_2, Static86.anIntArray343);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public int method1523() {
		this.method1516();
		return this.anInt2505;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
	public void method1524() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray331 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2507; local9++) {
				local15 = this.anIntArray331[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray22 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray22[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2507) {
				local65 = this.anIntArray331[local59];
				this.anIntArrayArray22[local65][local5[local65]++] = local59++;
			}
			this.anIntArray331 = null;
		}
		if (this.anIntArray336 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2503; local9++) {
			local15 = this.anIntArray336[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray21 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray21[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2503) {
			local65 = this.anIntArray336[local59];
			this.anIntArrayArray21[local65][local5[local65]++] = local59++;
		}
		this.anIntArray336 = null;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	private void method1525() {
		if (this.anInt2509 == 2) {
			return;
		}
		this.anInt2509 = 2;
		this.anInt2505 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2507; local12++) {
			@Pc(18) int local18 = this.anIntArray344[local12];
			@Pc(23) int local23 = this.anIntArray339[local12];
			@Pc(28) int local28 = this.anIntArray338[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2505) {
				this.anInt2505 = local40;
			}
		}
		this.anInt2505 = (int) (Math.sqrt((double) this.anInt2505) + 0.99D);
		this.anInt2506 = this.anInt2505;
		this.anInt2502 = this.anInt2505 + this.anInt2505;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1527(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static86.anIntArray351.length < this.anInt2503) {
			Static86.anIntArray351 = new int[this.anInt2503 + 100];
		}
		return this.method1518(arg0, Static86.aClass2_Sub1_Sub1_Sub6_3, Static86.anIntArray351);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(III)V")
	public void method1528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2509 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2507; local4++) {
			this.anIntArray344[local4] += arg0;
			this.anIntArray339[local4] += arg1;
			this.anIntArray338[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	public void method1529() {
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2507; local7++) {
			this.anIntArray344[local7] = -this.anIntArray344[local7];
			this.anIntArray338[local7] = -this.anIntArray338[local7];
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public void method1530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt2509 != 2 && this.anInt2509 != 1) {
			this.method1525();
		}
		@Pc(11) int local11 = Static10.anInt407;
		@Pc(13) int local13 = Static10.anInt399;
		@Pc(17) int local17 = Static86.anIntArray354[0];
		@Pc(21) int local21 = Static86.anIntArray363[0];
		@Pc(25) int local25 = Static86.anIntArray354[arg0];
		@Pc(29) int local29 = Static86.anIntArray363[arg0];
		@Pc(33) int local33 = Static86.anIntArray354[arg1];
		@Pc(37) int local37 = Static86.anIntArray363[arg1];
		@Pc(41) int local41 = Static86.anIntArray354[arg2];
		@Pc(45) int local45 = Static86.anIntArray363[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2507; local57++) {
			@Pc(63) int local63 = this.anIntArray344[local57];
			@Pc(68) int local68 = this.anIntArray339[local57];
			@Pc(73) int local73 = this.anIntArray338[local57];
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
			Static86.anIntArray358[local57] = local73 - local55;
			Static86.anIntArray361[local57] = local11 + (local63 << 9) / local73;
			Static86.anIntArray350[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt2508 > 0) {
				Static86.anIntArray365[local57] = local63;
				Static86.anIntArray356[local57] = local85;
				Static86.anIntArray362[local57] = local73;
			}
		}
		try {
			this.method1544(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!na;ILclient!na;I[I)V")
	public void method1531(@OriginalArg(0) Class2_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1540(arg0, arg1);
			return;
		}
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		@Pc(24) Class44 local24 = arg0.aClass44Array1[arg1];
		@Pc(29) Class44 local29 = arg2.aClass44Array1[arg3];
		@Pc(32) Class2_Sub5 local32 = local24.aClass2_Sub5_1;
		Static86.anInt2515 = 0;
		Static86.anInt2514 = 0;
		Static86.anInt2512 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt2178; local47++) {
			local53 = local24.anIntArray299[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray96[local53] == 0) {
				this.method1521(local32.anIntArray96[local53], local32.anIntArrayArray7[local53], local24.anIntArray298[local47], local24.anIntArray292[local47], local24.anIntArray294[local47]);
			}
		}
		Static86.anInt2515 = 0;
		Static86.anInt2514 = 0;
		Static86.anInt2512 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt2178; local53++) {
			@Pc(118) int local118 = local29.anIntArray299[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray96[local118] == 0) {
				this.method1521(local32.anIntArray96[local118], local32.anIntArrayArray7[local118], local29.anIntArray298[local53], local29.anIntArray292[local53], local29.anIntArray294[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
	private void method1532(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static10.anInt407;
		@Pc(3) int local3 = Static10.anInt399;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray334[arg0];
		@Pc(15) int local15 = this.anIntArray327[arg0];
		@Pc(20) int local20 = this.anIntArray329[arg0];
		@Pc(24) int local24 = Static86.anIntArray362[local10];
		@Pc(28) int local28 = Static86.anIntArray362[local15];
		@Pc(32) int local32 = Static86.anIntArray362[local20];
		if (this.anIntArray341 == null) {
			Static10.anInt405 = 0;
		} else {
			Static10.anInt405 = this.anIntArray341[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static86.anIntArray345[0] = Static86.anIntArray361[local10];
			Static86.anIntArray347[0] = Static86.anIntArray350[local10];
			local5++;
			Static86.anIntArray355[0] = this.anIntArray332[arg0];
		} else {
			local71 = Static86.anIntArray365[local10];
			local75 = Static86.anIntArray356[local10];
			local80 = this.anIntArray332[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static86.anIntArray352[local32 - local24];
				Static86.anIntArray345[0] = local1 + (local71 + ((Static86.anIntArray365[local20] - local71) * local93 >> 16) << 9) / 50;
				Static86.anIntArray347[0] = local3 + (local75 + ((Static86.anIntArray356[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static86.anIntArray355[0] = local80 + ((this.anIntArray333[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static86.anIntArray352[local28 - local24];
				Static86.anIntArray345[local5] = local1 + (local71 + ((Static86.anIntArray365[local15] - local71) * local93 >> 16) << 9) / 50;
				Static86.anIntArray347[local5] = local3 + (local75 + ((Static86.anIntArray356[local15] - local75) * local93 >> 16) << 9) / 50;
				Static86.anIntArray355[local5++] = local80 + ((this.anIntArray326[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static86.anIntArray345[local5] = Static86.anIntArray361[local15];
			Static86.anIntArray347[local5] = Static86.anIntArray350[local15];
			Static86.anIntArray355[local5++] = this.anIntArray326[arg0];
		} else {
			local71 = Static86.anIntArray365[local15];
			local75 = Static86.anIntArray356[local15];
			local80 = this.anIntArray326[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static86.anIntArray352[local24 - local28];
				Static86.anIntArray345[local5] = local1 + (local71 + ((Static86.anIntArray365[local10] - local71) * local93 >> 16) << 9) / 50;
				Static86.anIntArray347[local5] = local3 + (local75 + ((Static86.anIntArray356[local10] - local75) * local93 >> 16) << 9) / 50;
				Static86.anIntArray355[local5++] = local80 + ((this.anIntArray332[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static86.anIntArray352[local32 - local28];
				Static86.anIntArray345[local5] = local1 + (local71 + ((Static86.anIntArray365[local20] - local71) * local93 >> 16) << 9) / 50;
				Static86.anIntArray347[local5] = local3 + (local75 + ((Static86.anIntArray356[local20] - local75) * local93 >> 16) << 9) / 50;
				Static86.anIntArray355[local5++] = local80 + ((this.anIntArray333[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static86.anIntArray345[local5] = Static86.anIntArray361[local20];
			Static86.anIntArray347[local5] = Static86.anIntArray350[local20];
			Static86.anIntArray355[local5++] = this.anIntArray333[arg0];
		} else {
			local71 = Static86.anIntArray365[local20];
			local75 = Static86.anIntArray356[local20];
			local80 = this.anIntArray333[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static86.anIntArray352[local28 - local32];
				Static86.anIntArray345[local5] = local1 + (local71 + ((Static86.anIntArray365[local15] - local71) * local93 >> 16) << 9) / 50;
				Static86.anIntArray347[local5] = local3 + (local75 + ((Static86.anIntArray356[local15] - local75) * local93 >> 16) << 9) / 50;
				Static86.anIntArray355[local5++] = local80 + ((this.anIntArray326[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static86.anIntArray352[local24 - local32];
				Static86.anIntArray345[local5] = local1 + (local71 + ((Static86.anIntArray365[local10] - local71) * local93 >> 16) << 9) / 50;
				Static86.anIntArray347[local5] = local3 + (local75 + ((Static86.anIntArray356[local10] - local75) * local93 >> 16) << 9) / 50;
				Static86.anIntArray355[local5++] = local80 + ((this.anIntArray332[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static86.anIntArray345[0];
		local75 = Static86.anIntArray345[1];
		local80 = Static86.anIntArray345[2];
		local93 = Static86.anIntArray347[0];
		@Pc(588) int local588 = Static86.anIntArray347[1];
		@Pc(592) int local592 = Static86.anIntArray347[2];
		Static10.aBoolean30 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static10.anInt404 || local75 > Static10.anInt404 || local80 > Static10.anInt404) {
				Static10.aBoolean30 = true;
			}
			if (this.anIntArray342 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray342[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static10.method245(local93, local588, local592, local71, local75, local80, Static86.anIntArray355[0], Static86.anIntArray355[1], Static86.anIntArray355[2]);
			} else if (local619 == 1) {
				Static10.method244(local93, local588, local592, local71, local75, local80, Static86.anIntArray359[this.anIntArray332[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray342[arg0] >> 2;
				local678 = this.anIntArray330[local673];
				local683 = this.anIntArray335[local673];
				local688 = this.anIntArray337[local673];
				Static10.method242(local93, local588, local592, local71, local75, local80, Static86.anIntArray355[0], Static86.anIntArray355[1], Static86.anIntArray355[2], Static86.anIntArray365[local678], Static86.anIntArray365[local683], Static86.anIntArray365[local688], Static86.anIntArray356[local678], Static86.anIntArray356[local683], Static86.anIntArray356[local688], Static86.anIntArray362[local678], Static86.anIntArray362[local683], Static86.anIntArray362[local688], this.anIntArray340[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray342[arg0] >> 2;
				local678 = this.anIntArray330[local673];
				local683 = this.anIntArray335[local673];
				local688 = this.anIntArray337[local673];
				Static10.method242(local93, local588, local592, local71, local75, local80, this.anIntArray332[arg0], this.anIntArray332[arg0], this.anIntArray332[arg0], Static86.anIntArray365[local678], Static86.anIntArray365[local683], Static86.anIntArray365[local688], Static86.anIntArray356[local678], Static86.anIntArray356[local683], Static86.anIntArray356[local688], Static86.anIntArray362[local678], Static86.anIntArray362[local683], Static86.anIntArray362[local688], this.anIntArray340[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static10.anInt404 || local75 > Static10.anInt404 || local80 > Static10.anInt404 || Static86.anIntArray345[3] < 0 || Static86.anIntArray345[3] > Static10.anInt404) {
			Static10.aBoolean30 = true;
		}
		if (this.anIntArray342 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray342[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static10.method245(local93, local588, local592, local71, local75, local80, Static86.anIntArray355[0], Static86.anIntArray355[1], Static86.anIntArray355[2]);
			Static10.method245(local93, local592, Static86.anIntArray347[3], local71, local80, Static86.anIntArray345[3], Static86.anIntArray355[0], Static86.anIntArray355[2], Static86.anIntArray355[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static86.anIntArray359[this.anIntArray332[arg0]];
			Static10.method244(local93, local588, local592, local71, local75, local80, local673);
			Static10.method244(local93, local592, Static86.anIntArray347[3], local71, local80, Static86.anIntArray345[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray342[arg0] >> 2;
			local678 = this.anIntArray330[local673];
			local683 = this.anIntArray335[local673];
			local688 = this.anIntArray337[local673];
			Static10.method242(local93, local588, local592, local71, local75, local80, Static86.anIntArray355[0], Static86.anIntArray355[1], Static86.anIntArray355[2], Static86.anIntArray365[local678], Static86.anIntArray365[local683], Static86.anIntArray365[local688], Static86.anIntArray356[local678], Static86.anIntArray356[local683], Static86.anIntArray356[local688], Static86.anIntArray362[local678], Static86.anIntArray362[local683], Static86.anIntArray362[local688], this.anIntArray340[arg0]);
			Static10.method242(local93, local592, Static86.anIntArray347[3], local71, local80, Static86.anIntArray345[3], Static86.anIntArray355[0], Static86.anIntArray355[2], Static86.anIntArray355[3], Static86.anIntArray365[local678], Static86.anIntArray365[local683], Static86.anIntArray365[local688], Static86.anIntArray356[local678], Static86.anIntArray356[local683], Static86.anIntArray356[local688], Static86.anIntArray362[local678], Static86.anIntArray362[local683], Static86.anIntArray362[local688], this.anIntArray340[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray342[arg0] >> 2;
		local678 = this.anIntArray330[local673];
		local683 = this.anIntArray335[local673];
		local688 = this.anIntArray337[local673];
		Static10.method242(local93, local588, local592, local71, local75, local80, this.anIntArray332[arg0], this.anIntArray332[arg0], this.anIntArray332[arg0], Static86.anIntArray365[local678], Static86.anIntArray365[local683], Static86.anIntArray365[local688], Static86.anIntArray356[local678], Static86.anIntArray356[local683], Static86.anIntArray356[local688], Static86.anIntArray362[local678], Static86.anIntArray362[local683], Static86.anIntArray362[local688], this.anIntArray340[arg0]);
		Static10.method242(local93, local592, Static86.anIntArray347[3], local71, local80, Static86.anIntArray345[3], this.anIntArray332[arg0], this.anIntArray332[arg0], this.anIntArray332[arg0], Static86.anIntArray365[local678], Static86.anIntArray365[local683], Static86.anIntArray365[local688], Static86.anIntArray356[local678], Static86.anIntArray356[local683], Static86.anIntArray356[local688], Static86.anIntArray362[local678], Static86.anIntArray362[local683], Static86.anIntArray362[local688], this.anIntArray340[arg0]);
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()V")
	public void method1533() {
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2507; local7++) {
			this.anIntArray338[local7] = -this.anIntArray338[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt2503; local24++) {
			@Pc(30) int local30 = this.anIntArray334[local24];
			this.anIntArray334[local24] = this.anIntArray329[local24];
			this.anIntArray329[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(III)V")
	public void method1534() {
		@Pc(4) int local4 = this.anInt2510 >> 16;
		@Pc(11) int local11 = this.anInt2510 << 16 >> 16;
		this.method1536(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIZ)V")
	public void method1535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray332 == null) {
			this.anIntArray332 = new int[this.anInt2503];
			this.anIntArray326 = new int[this.anInt2503];
			this.anIntArray333 = new int[this.anInt2503];
		}
		@Pc(48) int local48;
		if (this.aClass37Array1 == null) {
			this.aClass37Array1 = new Class37[this.anInt2507];
			for (local48 = 0; local48 < this.anInt2507; local48++) {
				this.aClass37Array1[local48] = new Class37();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt2503; local48++) {
			local69 = this.anIntArray334[local48];
			@Pc(74) int local74 = this.anIntArray327[local48];
			@Pc(79) int local79 = this.anIntArray329[local48];
			@Pc(89) int local89 = this.anIntArray344[local74] - this.anIntArray344[local69];
			@Pc(99) int local99 = this.anIntArray339[local74] - this.anIntArray339[local69];
			@Pc(109) int local109 = this.anIntArray338[local74] - this.anIntArray338[local69];
			@Pc(119) int local119 = this.anIntArray344[local79] - this.anIntArray344[local69];
			@Pc(129) int local129 = this.anIntArray339[local79] - this.anIntArray339[local69];
			@Pc(139) int local139 = this.anIntArray338[local79] - this.anIntArray338[local69];
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
			if (this.anIntArray342 == null || (this.anIntArray342[local48] & 0x1) == 0) {
				@Pc(246) Class37 local246 = this.aClass37Array1[local69];
				local246.anInt1841 += local147;
				local246.anInt1842 += local155;
				local246.anInt1846 += local163;
				local246.anInt1845++;
				@Pc(275) Class37 local275 = this.aClass37Array1[local74];
				local275.anInt1841 += local147;
				local275.anInt1842 += local155;
				local275.anInt1846 += local163;
				local275.anInt1845++;
				@Pc(304) Class37 local304 = this.aClass37Array1[local79];
				local304.anInt1841 += local147;
				local304.anInt1842 += local155;
				local304.anInt1846 += local163;
				local304.anInt1845++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray332[local48] = Static86.method1520(this.anIntArray340[local48], local349, this.anIntArray342[local48]);
			}
		}
		if (arg5) {
			this.method1536(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass37Array2 = new Class37[this.anInt2507];
		for (local69 = 0; local69 < this.anInt2507; local69++) {
			@Pc(391) Class37 local391 = this.aClass37Array1[local69];
			@Pc(400) Class37 local400 = this.aClass37Array2[local69] = new Class37();
			local400.anInt1841 = local391.anInt1841;
			local400.anInt1842 = local391.anInt1842;
			local400.anInt1846 = local391.anInt1846;
			local400.anInt1845 = local391.anInt1845;
		}
		this.anInt2510 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	private void method1536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2503; local1++) {
			local7 = this.anIntArray334[local1];
			@Pc(12) int local12 = this.anIntArray327[local1];
			@Pc(17) int local17 = this.anIntArray329[local1];
			@Pc(30) Class37 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray342 == null) {
				local25 = this.anIntArray340[local1];
				local30 = this.aClass37Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt1841 + arg3 * local30.anInt1842 + arg4 * local30.anInt1846) / (arg1 * local30.anInt1845);
				this.anIntArray332[local1] = Static86.method1520(local25, local52, 0);
				@Pc(65) Class37 local65 = this.aClass37Array1[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt1841 + arg3 * local65.anInt1842 + arg4 * local65.anInt1846) / (arg1 * local65.anInt1845);
				this.anIntArray326[local1] = Static86.method1520(local25, local87, 0);
				@Pc(100) Class37 local100 = this.aClass37Array1[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt1841 + arg3 * local100.anInt1842 + arg4 * local100.anInt1846) / (arg1 * local100.anInt1845);
				this.anIntArray333[local1] = Static86.method1520(local25, local122, 0);
			} else if ((this.anIntArray342[local1] & 0x1) == 0) {
				local25 = this.anIntArray340[local1];
				@Pc(148) int local148 = this.anIntArray342[local1];
				local30 = this.aClass37Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt1841 + arg3 * local30.anInt1842 + arg4 * local30.anInt1846) / (arg1 * local30.anInt1845);
				this.anIntArray332[local1] = Static86.method1520(local25, local52, local148);
				local30 = this.aClass37Array1[local12];
				local52 = arg0 + (arg2 * local30.anInt1841 + arg3 * local30.anInt1842 + arg4 * local30.anInt1846) / (arg1 * local30.anInt1845);
				this.anIntArray326[local1] = Static86.method1520(local25, local52, local148);
				local30 = this.aClass37Array1[local17];
				local52 = arg0 + (arg2 * local30.anInt1841 + arg3 * local30.anInt1842 + arg4 * local30.anInt1846) / (arg1 * local30.anInt1845);
				this.anIntArray333[local1] = Static86.method1520(local25, local52, local148);
			}
		}
		this.aClass37Array1 = null;
		this.aClass37Array2 = null;
		this.anIntArray331 = null;
		this.anIntArray336 = null;
		if (this.anIntArray342 != null) {
			for (local7 = 0; local7 < this.anInt2503; local7++) {
				if ((this.anIntArray342[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray340 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;I)I")
	private int method1537(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray344[arg1];
		@Pc(11) int local11 = arg0.anIntArray339[arg1];
		@Pc(16) int local16 = arg0.anIntArray338[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2507; local18++) {
			if (local6 == this.anIntArray344[local18] && local11 == this.anIntArray339[local18] && local16 == this.anIntArray338[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray344[this.anInt2507] = local6;
			this.anIntArray339[this.anInt2507] = local11;
			this.anIntArray338[this.anInt2507] = local16;
			if (arg0.anIntArray331 != null) {
				this.anIntArray331[this.anInt2507] = arg0.anIntArray331[arg1];
			}
			local1 = this.anInt2507++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
	public void method1538() {
		if (this.anInt2509 == 3) {
			return;
		}
		this.anInt2509 = 3;
		super.anInt2496 = 0;
		this.anInt2501 = 0;
		this.anInt2505 = 999999;
		this.anInt2502 = -999999;
		this.anInt2506 = -99999;
		this.anInt2511 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2507; local27++) {
			@Pc(33) int local33 = this.anIntArray344[local27];
			@Pc(38) int local38 = this.anIntArray339[local27];
			@Pc(43) int local43 = this.anIntArray338[local27];
			if (local33 < this.anInt2505) {
				this.anInt2505 = local33;
			}
			if (local33 > this.anInt2502) {
				this.anInt2502 = local33;
			}
			if (local43 < this.anInt2511) {
				this.anInt2511 = local43;
			}
			if (local43 > this.anInt2506) {
				this.anInt2506 = local43;
			}
			if (-local38 > super.anInt2496) {
				super.anInt2496 = -local38;
			}
			if (local38 > this.anInt2501) {
				this.anInt2501 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
	public void method1539() {
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2507; local7++) {
			@Pc(13) int local13 = this.anIntArray344[local7];
			this.anIntArray344[local7] = this.anIntArray338[local7];
			this.anIntArray338[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!na;I)V")
	public void method1540(@OriginalArg(0) Class2_Sub1_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray22 == null || arg1 == -1) {
			return;
		}
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		@Pc(18) Class44 local18 = arg0.aClass44Array1[arg1];
		@Pc(21) Class2_Sub5 local21 = local18.aClass2_Sub5_1;
		Static86.anInt2515 = 0;
		Static86.anInt2514 = 0;
		Static86.anInt2512 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt2178; local29++) {
			@Pc(35) int local35 = local18.anIntArray299[local29];
			this.method1521(local21.anIntArray96[local35], local21.anIntArrayArray7[local35], local18.anIntArray298[local29], local18.anIntArray292[local29], local18.anIntArray294[local29]);
		}
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
	public void method1541() {
		this.aClass37Array1 = null;
		this.anInt2509 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2507; local7++) {
			@Pc(13) int local13 = this.anIntArray338[local7];
			this.anIntArray338[local7] = this.anIntArray344[local7];
			this.anIntArray344[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZZI)V")
	private void method1544(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2502 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2502; local6++) {
			Static86.anIntArray357[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2503; local18++) {
			if (this.anIntArray342 == null || this.anIntArray342[local18] != -1) {
				local33 = this.anIntArray334[local18];
				local38 = this.anIntArray327[local18];
				local43 = this.anIntArray329[local18];
				local47 = Static86.anIntArray361[local33];
				local51 = Static86.anIntArray361[local38];
				local55 = Static86.anIntArray361[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static86.anIntArray365[local33];
					local74 = Static86.anIntArray365[local38];
					@Pc(78) int local78 = Static86.anIntArray365[local43];
					@Pc(82) int local82 = Static86.anIntArray356[local33];
					local86 = Static86.anIntArray356[local38];
					local90 = Static86.anIntArray356[local43];
					@Pc(94) int local94 = Static86.anIntArray362[local33];
					local98 = Static86.anIntArray362[local38];
					@Pc(102) int local102 = Static86.anIntArray362[local43];
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
						Static86.aBooleanArray23[local18] = true;
						@Pc(183) int local183 = (Static86.anIntArray358[local33] + Static86.anIntArray358[local38] + Static86.anIntArray358[local43]) / 3 + this.anInt2506;
						Static86.anIntArrayArray24[local183][Static86.anIntArray357[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method1526(Static86.anInt2513, Static86.anInt2516, Static86.anIntArray350[local33], Static86.anIntArray350[local38], Static86.anIntArray350[local43], local47, local51, local55)) {
						Static86.anIntArray349[Static86.anInt2517++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static86.anIntArray350[local43] - Static86.anIntArray350[local38]) - (Static86.anIntArray350[local33] - Static86.anIntArray350[local38]) * (local55 - local51) > 0) {
						Static86.aBooleanArray23[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static10.anInt404 && local51 <= Static10.anInt404 && local55 <= Static10.anInt404) {
							Static86.aBooleanArray24[local18] = false;
						} else {
							Static86.aBooleanArray24[local18] = true;
						}
						local70 = (Static86.anIntArray358[local33] + Static86.anIntArray358[local38] + Static86.anIntArray358[local43]) / 3 + this.anInt2506;
						Static86.anIntArrayArray24[local70][Static86.anIntArray357[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray328 == null) {
			for (local33 = this.anInt2502 - 1; local33 >= 0; local33--) {
				local38 = Static86.anIntArray357[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static86.anIntArrayArray24[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method1519(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static86.anIntArray346[local33] = 0;
			Static86.anIntArray364[local33] = 0;
		}
		for (local38 = this.anInt2502 - 1; local38 >= 0; local38--) {
			local43 = Static86.anIntArray357[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static86.anIntArrayArray24[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray328[local55];
					local74 = Static86.anIntArray346[local70]++;
					Static86.anIntArrayArray23[local70][local74] = local55;
					if (local70 < 10) {
						Static86.anIntArray364[local70] += local38;
					} else if (local70 == 10) {
						Static86.anIntArray353[local74] = local38;
					} else {
						Static86.anIntArray360[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static86.anIntArray346[1] > 0 || Static86.anIntArray346[2] > 0) {
			local43 = (Static86.anIntArray364[1] + Static86.anIntArray364[2]) / (Static86.anIntArray346[1] + Static86.anIntArray346[2]);
		}
		local47 = 0;
		if (Static86.anIntArray346[3] > 0 || Static86.anIntArray346[4] > 0) {
			local47 = (Static86.anIntArray364[3] + Static86.anIntArray364[4]) / (Static86.anIntArray346[3] + Static86.anIntArray346[4]);
		}
		local51 = 0;
		if (Static86.anIntArray346[6] > 0 || Static86.anIntArray346[8] > 0) {
			local51 = (Static86.anIntArray364[6] + Static86.anIntArray364[8]) / (Static86.anIntArray346[6] + Static86.anIntArray346[8]);
		}
		local70 = 0;
		local74 = Static86.anIntArray346[10];
		@Pc(524) int[] local524 = Static86.anIntArrayArray23[10];
		@Pc(526) int[] local526 = Static86.anIntArray353;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static86.anIntArray346[11];
			local524 = Static86.anIntArrayArray23[11];
			local526 = Static86.anIntArray360;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method1519(local524[local70++]);
				if (local70 == local74 && local524 != Static86.anIntArrayArray23[11]) {
					local70 = 0;
					local74 = Static86.anIntArray346[11];
					local524 = Static86.anIntArrayArray23[11];
					local526 = Static86.anIntArray360;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method1519(local524[local70++]);
				if (local70 == local74 && local524 != Static86.anIntArrayArray23[11]) {
					local70 = 0;
					local74 = Static86.anIntArray346[11];
					local524 = Static86.anIntArrayArray23[11];
					local526 = Static86.anIntArray360;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method1519(local524[local70++]);
				if (local70 == local74 && local524 != Static86.anIntArrayArray23[11]) {
					local70 = 0;
					local74 = Static86.anIntArray346[11];
					local524 = Static86.anIntArrayArray23[11];
					local526 = Static86.anIntArray360;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static86.anIntArray346[local86];
			@Pc(689) int[] local689 = Static86.anIntArrayArray23[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method1519(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method1519(local524[local70++]);
			if (local70 == local74 && local524 != Static86.anIntArrayArray23[11]) {
				local70 = 0;
				local524 = Static86.anIntArrayArray23[11];
				local74 = Static86.anIntArray346[11];
				local526 = Static86.anIntArray360;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}
}
