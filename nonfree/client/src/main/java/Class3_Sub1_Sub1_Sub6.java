import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub1_Sub1_Sub6 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!v", name = "Yb", descriptor = "[I")
	public static int[] anIntArray348 = new int[128];

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
	public int anInt2768;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[Lclient!oe;")
	public Class50[] aClass50Array1;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
	public int anInt2769;

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!v", name = "ub", descriptor = "I")
	public int anInt2772;

	@OriginalMember(owner = "client!v", name = "zb", descriptor = "I")
	private int anInt2773;

	@OriginalMember(owner = "client!v", name = "Cb", descriptor = "[Lclient!oe;")
	public Class50[] aClass50Array2;

	@OriginalMember(owner = "client!v", name = "Db", descriptor = "I")
	private int anInt2774;

	@OriginalMember(owner = "client!v", name = "Fb", descriptor = "I")
	public int anInt2775;

	@OriginalMember(owner = "client!v", name = "Ib", descriptor = "I")
	public int anInt2777;

	@OriginalMember(owner = "client!v", name = "Kb", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!v", name = "db", descriptor = "I")
	private int anInt2767 = 0;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
	public int anInt2770 = 0;

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!v", name = "Gb", descriptor = "I")
	private int anInt2776 = 0;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
	public int anInt2771 = 0;

	@OriginalMember(owner = "client!v", name = "yb", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!v", name = "Hb", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!v", name = "sb", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!v", name = "vb", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!v", name = "Jb", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!v", name = "Ab", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!v", name = "Bb", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!v", name = "xb", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!v", name = "tb", descriptor = "[I")
	private int[] anIntArray331;

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

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class3_Sub6 local21 = new Class3_Sub6(arg0);
		@Pc(26) Class3_Sub6 local26 = new Class3_Sub6(arg0);
		@Pc(31) Class3_Sub6 local31 = new Class3_Sub6(arg0);
		@Pc(36) Class3_Sub6 local36 = new Class3_Sub6(arg0);
		@Pc(41) Class3_Sub6 local41 = new Class3_Sub6(arg0);
		local21.anInt2416 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1603();
		@Pc(55) int local55 = local21.method1603();
		@Pc(59) int local59 = local21.method1587();
		@Pc(63) int local63 = local21.method1587();
		@Pc(67) int local67 = local21.method1587();
		@Pc(71) int local71 = local21.method1587();
		@Pc(75) int local75 = local21.method1587();
		@Pc(79) int local79 = local21.method1587();
		@Pc(83) int local83 = local21.method1603();
		@Pc(87) int local87 = local21.method1603();
		@Pc(91) int local91 = local21.method1603();
		@Pc(95) int local95 = local21.method1603();
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
		this.anInt2771 = local51;
		this.anInt2770 = local55;
		this.anInt2767 = local59;
		this.anIntArray334 = new int[local51];
		this.anIntArray322 = new int[local51];
		this.anIntArray324 = new int[local51];
		this.anIntArray337 = new int[local55];
		this.anIntArray325 = new int[local55];
		this.anIntArray328 = new int[local55];
		this.anIntArray330 = new int[local59];
		this.anIntArray332 = new int[local59];
		this.anIntArray338 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray323 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray335 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray327 = new int[local55];
		} else {
			this.anInt2776 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray336 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray333 = new int[local55];
		}
		this.anIntArray331 = new int[local55];
		local21.anInt2416 = local97;
		local26.anInt2416 = local196;
		local31.anInt2416 = local202;
		local36.anInt2416 = local103;
		local41.anInt2416 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1587();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1620();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1620();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1620();
			}
			this.anIntArray334[local321] = local315 + local328;
			this.anIntArray322[local321] = local317 + local338;
			this.anIntArray324[local321] = local319 + local348;
			local315 = this.anIntArray334[local321];
			local317 = this.anIntArray322[local321];
			local319 = this.anIntArray324[local321];
			if (this.anIntArray323 != null) {
				this.anIntArray323[local321] = local41.method1587();
			}
		}
		local21.anInt2416 = local180;
		local26.anInt2416 = local138;
		local31.anInt2416 = local111;
		local36.anInt2416 = local162;
		local41.anInt2416 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray331[local326] = local21.method1603();
			if (this.anIntArray335 != null) {
				this.anIntArray335[local326] = local26.method1587();
			}
			if (this.anIntArray327 != null) {
				this.anIntArray327[local326] = local31.method1587();
			}
			if (this.anIntArray336 != null) {
				this.anIntArray336[local326] = local36.method1587();
			}
			if (this.anIntArray333 != null) {
				this.anIntArray333[local326] = local41.method1587();
			}
		}
		local21.anInt2416 = local174;
		local26.anInt2416 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1587();
			if (local496 == 1) {
				local328 = local21.method1620() + local489;
				local338 = local21.method1620() + local328;
				local348 = local21.method1620() + local338;
				local489 = local348;
				this.anIntArray337[local491] = local328;
				this.anIntArray325[local491] = local338;
				this.anIntArray328[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1620() + local489;
				local489 = local348;
				this.anIntArray337[local491] = local328;
				this.anIntArray325[local491] = local338;
				this.anIntArray328[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1620() + local489;
				local489 = local348;
				this.anIntArray337[local491] = local328;
				this.anIntArray325[local491] = local338;
				this.anIntArray328[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1620() + local489;
				local489 = local348;
				this.anIntArray337[local491] = local328;
				this.anIntArray325[local491] = local599;
				this.anIntArray328[local491] = local348;
			}
		}
		local21.anInt2416 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray330[local496] = local21.method1603();
			this.anIntArray332[local496] = local21.method1603();
			this.anIntArray338[local496] = local21.method1603();
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([Lclient!v;I)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) Class3_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2771 = 0;
		this.anInt2770 = 0;
		this.anInt2767 = 0;
		this.anInt2776 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub1_Sub1_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2771 += local43.anInt2771;
				this.anInt2770 += local43.anInt2770;
				this.anInt2767 += local43.anInt2767;
				local18 |= local43.anIntArray335 != null;
				if (local43.anIntArray327 == null) {
					if (this.anInt2776 == -1) {
						this.anInt2776 = local43.anInt2776;
					}
					if (this.anInt2776 != local43.anInt2776) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray336 != null;
				local24 |= local43.anIntArray333 != null;
			}
		}
		this.anIntArray334 = new int[this.anInt2771];
		this.anIntArray322 = new int[this.anInt2771];
		this.anIntArray324 = new int[this.anInt2771];
		this.anIntArray323 = new int[this.anInt2771];
		this.anIntArray337 = new int[this.anInt2770];
		this.anIntArray325 = new int[this.anInt2770];
		this.anIntArray328 = new int[this.anInt2770];
		this.anIntArray330 = new int[this.anInt2767];
		this.anIntArray332 = new int[this.anInt2767];
		this.anIntArray338 = new int[this.anInt2767];
		if (local18) {
			this.anIntArray335 = new int[this.anInt2770];
		}
		if (local20) {
			this.anIntArray327 = new int[this.anInt2770];
		}
		if (local22) {
			this.anIntArray336 = new int[this.anInt2770];
		}
		if (local24) {
			this.anIntArray333 = new int[this.anInt2770];
		}
		this.anIntArray331 = new int[this.anInt2770];
		this.anInt2771 = 0;
		this.anInt2770 = 0;
		this.anInt2767 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class3_Sub1_Sub1_Sub6 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt2770; local223++) {
					if (local18) {
						if (local219.anIntArray335 == null) {
							this.anIntArray335[this.anInt2770] = 0;
						} else {
							local241 = local219.anIntArray335[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray335[this.anInt2770] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray327 == null) {
							this.anIntArray327[this.anInt2770] = local219.anInt2776;
						} else {
							this.anIntArray327[this.anInt2770] = local219.anIntArray327[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray336 == null) {
							this.anIntArray336[this.anInt2770] = 0;
						} else {
							this.anIntArray336[this.anInt2770] = local219.anIntArray336[local223];
						}
					}
					if (local24 && local219.anIntArray333 != null) {
						this.anIntArray333[this.anInt2770] = local219.anIntArray333[local223];
					}
					this.anIntArray331[this.anInt2770] = local219.anIntArray331[local223];
					this.anIntArray337[this.anInt2770] = this.method1814(local219, local219.anIntArray337[local223]);
					this.anIntArray325[this.anInt2770] = this.method1814(local219, local219.anIntArray325[local223]);
					this.anIntArray328[this.anInt2770] = this.method1814(local219, local219.anIntArray328[local223]);
					this.anInt2770++;
				}
				for (local241 = 0; local241 < local219.anInt2767; local241++) {
					this.anIntArray330[this.anInt2767] = this.method1814(local219, local219.anIntArray330[local241]);
					this.anIntArray332[this.anInt2767] = this.method1814(local219, local219.anIntArray332[local241]);
					this.anIntArray338[this.anInt2767] = this.method1814(local219, local219.anIntArray338[local241]);
					this.anInt2767++;
				}
				local212 += local219.anInt2767;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([Lclient!v;IZ)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) Class3_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2771 = 0;
		this.anInt2770 = 0;
		this.anInt2767 = 0;
		this.anInt2776 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub1_Sub1_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2771 += local43.anInt2771;
				this.anInt2770 += local43.anInt2770;
				this.anInt2767 += local43.anInt2767;
				local18 |= local43.anIntArray335 != null;
				if (local43.anIntArray327 == null) {
					if (this.anInt2776 == -1) {
						this.anInt2776 = local43.anInt2776;
					}
					if (this.anInt2776 != local43.anInt2776) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray336 != null;
				local24 |= local43.anIntArray331 != null;
			}
		}
		this.anIntArray334 = new int[this.anInt2771];
		this.anIntArray322 = new int[this.anInt2771];
		this.anIntArray324 = new int[this.anInt2771];
		this.anIntArray337 = new int[this.anInt2770];
		this.anIntArray325 = new int[this.anInt2770];
		this.anIntArray328 = new int[this.anInt2770];
		this.anIntArray321 = new int[this.anInt2770];
		this.anIntArray329 = new int[this.anInt2770];
		this.anIntArray326 = new int[this.anInt2770];
		this.anIntArray330 = new int[this.anInt2767];
		this.anIntArray332 = new int[this.anInt2767];
		this.anIntArray338 = new int[this.anInt2767];
		if (local18) {
			this.anIntArray335 = new int[this.anInt2770];
		}
		if (local20) {
			this.anIntArray327 = new int[this.anInt2770];
		}
		if (local22) {
			this.anIntArray336 = new int[this.anInt2770];
		}
		if (local24) {
			this.anIntArray331 = new int[this.anInt2770];
		}
		this.anInt2771 = 0;
		this.anInt2770 = 0;
		this.anInt2767 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class3_Sub1_Sub1_Sub6 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt2771;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt2771; local231++) {
					this.anIntArray334[this.anInt2771] = local224.anIntArray334[local231];
					this.anIntArray322[this.anInt2771] = local224.anIntArray322[local231];
					this.anIntArray324[this.anInt2771] = local224.anIntArray324[local231];
					this.anInt2771++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt2770; local272++) {
					this.anIntArray337[this.anInt2770] = local224.anIntArray337[local272] + local229;
					this.anIntArray325[this.anInt2770] = local224.anIntArray325[local272] + local229;
					this.anIntArray328[this.anInt2770] = local224.anIntArray328[local272] + local229;
					this.anIntArray321[this.anInt2770] = local224.anIntArray321[local272];
					this.anIntArray329[this.anInt2770] = local224.anIntArray329[local272];
					this.anIntArray326[this.anInt2770] = local224.anIntArray326[local272];
					if (local18) {
						if (local224.anIntArray335 == null) {
							this.anIntArray335[this.anInt2770] = 0;
						} else {
							local350 = local224.anIntArray335[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray335[this.anInt2770] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray327 == null) {
							this.anIntArray327[this.anInt2770] = local224.anInt2776;
						} else {
							this.anIntArray327[this.anInt2770] = local224.anIntArray327[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray336 == null) {
							this.anIntArray336[this.anInt2770] = 0;
						} else {
							this.anIntArray336[this.anInt2770] = local224.anIntArray336[local272];
						}
					}
					if (local24 && local224.anIntArray331 != null) {
						this.anIntArray331[this.anInt2770] = local224.anIntArray331[local272];
					}
					this.anInt2770++;
				}
				for (local350 = 0; local350 < local224.anInt2767; local350++) {
					this.anIntArray330[this.anInt2767] = local224.anIntArray330[local350] + local229;
					this.anIntArray332[this.anInt2767] = local224.anIntArray332[local350] + local229;
					this.anIntArray338[this.anInt2767] = local224.anIntArray338[local350] + local229;
					this.anInt2767++;
				}
				local217 += local224.anInt2767;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!v;ZZZ)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2771 = arg0.anInt2771;
		this.anInt2770 = arg0.anInt2770;
		this.anInt2767 = arg0.anInt2767;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray334 = arg0.anIntArray334;
			this.anIntArray322 = arg0.anIntArray322;
			this.anIntArray324 = arg0.anIntArray324;
		} else {
			this.anIntArray334 = new int[this.anInt2771];
			this.anIntArray322 = new int[this.anInt2771];
			this.anIntArray324 = new int[this.anInt2771];
			for (local60 = 0; local60 < this.anInt2771; local60++) {
				this.anIntArray334[local60] = arg0.anIntArray334[local60];
				this.anIntArray322[local60] = arg0.anIntArray322[local60];
				this.anIntArray324[local60] = arg0.anIntArray324[local60];
			}
		}
		if (arg2) {
			this.anIntArray331 = arg0.anIntArray331;
		} else {
			this.anIntArray331 = new int[this.anInt2770];
			for (local60 = 0; local60 < this.anInt2770; local60++) {
				this.anIntArray331[local60] = arg0.anIntArray331[local60];
			}
		}
		this.anIntArray336 = arg0.anIntArray336;
		this.anIntArray323 = arg0.anIntArray323;
		this.anIntArray333 = arg0.anIntArray333;
		this.anIntArray335 = arg0.anIntArray335;
		this.anIntArray337 = arg0.anIntArray337;
		this.anIntArray325 = arg0.anIntArray325;
		this.anIntArray328 = arg0.anIntArray328;
		this.anIntArray327 = arg0.anIntArray327;
		this.anInt2776 = arg0.anInt2776;
		this.anIntArray330 = arg0.anIntArray330;
		this.anIntArray332 = arg0.anIntArray332;
		this.anIntArray338 = arg0.anIntArray338;
		this.aBoolean149 = arg0.aBoolean149;
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!v;ZZ)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt2771 = arg0.anInt2771;
		this.anInt2770 = arg0.anInt2770;
		this.anInt2767 = arg0.anInt2767;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray322 = new int[this.anInt2771];
			for (local37 = 0; local37 < this.anInt2771; local37++) {
				this.anIntArray322[local37] = arg0.anIntArray322[local37];
			}
		} else {
			this.anIntArray322 = arg0.anIntArray322;
		}
		if (arg2) {
			this.anIntArray321 = new int[this.anInt2770];
			this.anIntArray329 = new int[this.anInt2770];
			this.anIntArray326 = new int[this.anInt2770];
			for (local37 = 0; local37 < this.anInt2770; local37++) {
				this.anIntArray321[local37] = arg0.anIntArray321[local37];
				this.anIntArray329[local37] = arg0.anIntArray329[local37];
				this.anIntArray326[local37] = arg0.anIntArray326[local37];
			}
			this.anIntArray335 = new int[this.anInt2770];
			@Pc(115) int local115;
			if (arg0.anIntArray335 == null) {
				for (local115 = 0; local115 < this.anInt2770; local115++) {
					this.anIntArray335[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt2770; local115++) {
					this.anIntArray335[local115] = arg0.anIntArray335[local115];
				}
			}
			this.aClass50Array1 = new Class50[this.anInt2771];
			for (local115 = 0; local115 < this.anInt2771; local115++) {
				@Pc(160) Class50 local160 = this.aClass50Array1[local115] = new Class50();
				@Pc(165) Class50 local165 = arg0.aClass50Array1[local115];
				local160.anInt1999 = local165.anInt1999;
				local160.anInt2003 = local165.anInt2003;
				local160.anInt1998 = local165.anInt1998;
				local160.anInt2007 = local165.anInt2007;
			}
			this.aClass50Array2 = arg0.aClass50Array2;
		} else {
			this.anIntArray321 = arg0.anIntArray321;
			this.anIntArray329 = arg0.anIntArray329;
			this.anIntArray326 = arg0.anIntArray326;
			this.anIntArray335 = arg0.anIntArray335;
		}
		this.anIntArray334 = arg0.anIntArray334;
		this.anIntArray324 = arg0.anIntArray324;
		this.anIntArray331 = arg0.anIntArray331;
		this.anIntArray336 = arg0.anIntArray336;
		this.anIntArray327 = arg0.anIntArray327;
		this.anInt2776 = arg0.anInt2776;
		this.anIntArray337 = arg0.anIntArray337;
		this.anIntArray325 = arg0.anIntArray325;
		this.anIntArray328 = arg0.anIntArray328;
		this.anIntArray330 = arg0.anIntArray330;
		this.anIntArray332 = arg0.anIntArray332;
		this.anIntArray338 = arg0.anIntArray338;
		this.aBoolean149 = arg0.aBoolean149;
		this.anInt2773 = arg0.anInt2773;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!od;ILclient!od;I[I)V")
	public void method1796(@OriginalArg(0) Class3_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1815(arg0, arg1);
			return;
		}
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		@Pc(24) Class53 local24 = arg0.aClass53Array1[arg1];
		@Pc(29) Class53 local29 = arg2.aClass53Array1[arg3];
		@Pc(32) Class3_Sub12 local32 = local24.aClass3_Sub12_1;
		Static107.anInt2783 = 0;
		Static107.anInt2782 = 0;
		Static107.anInt2778 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt2173; local47++) {
			local53 = local24.anIntArray243[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray314[local53] == 0) {
				this.method1803(local32.anIntArray314[local53], local32.anIntArrayArray21[local53], local24.anIntArray240[local47], local24.anIntArray244[local47], local24.anIntArray242[local47]);
			}
		}
		Static107.anInt2783 = 0;
		Static107.anInt2782 = 0;
		Static107.anInt2778 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt2173; local53++) {
			@Pc(118) int local118 = local29.anIntArray243[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray314[local118] == 0) {
				this.method1803(local32.anIntArray314[local118], local32.anIntArrayArray21[local118], local29.anIntArray240[local53], local29.anIntArray244[local53], local29.anIntArray242[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	public void method1797() {
		@Pc(4) int local4 = this.anInt2773 >> 16;
		@Pc(11) int local11 = this.anInt2773 << 16 >> 16;
		this.method1818(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(IIIIIIII)V")
	public void method1798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.anInt2774 != 2 && this.anInt2774 != 1) {
			this.method1826();
		}
		@Pc(11) int local11 = Static25.anInt783;
		@Pc(13) int local13 = Static25.anInt786;
		@Pc(17) int local17 = Static107.anIntArray343[0];
		@Pc(21) int local21 = Static107.anIntArray357[0];
		@Pc(25) int local25 = Static107.anIntArray343[arg0];
		@Pc(29) int local29 = Static107.anIntArray357[arg0];
		@Pc(33) int local33 = Static107.anIntArray343[arg1];
		@Pc(37) int local37 = Static107.anIntArray357[arg1];
		@Pc(41) int local41 = Static107.anIntArray343[arg2];
		@Pc(45) int local45 = Static107.anIntArray357[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2771; local57++) {
			@Pc(63) int local63 = this.anIntArray334[local57];
			@Pc(68) int local68 = this.anIntArray322[local57];
			@Pc(73) int local73 = this.anIntArray324[local57];
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
			Static107.anIntArray350[local57] = local73 - local55;
			Static107.anIntArray344[local57] = local11 + (local63 << 9) / arg6;
			Static107.anIntArray349[local57] = local13 + (local85 << 9) / arg6;
			if (this.anInt2767 > 0) {
				Static107.anIntArray341[local57] = local63;
				Static107.anIntArray359[local57] = local85;
				Static107.anIntArray355[local57] = local73;
			}
		}
		try {
			this.method1804(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	public void method1800() {
		if (this.anInt2774 == 1) {
			return;
		}
		this.anInt2774 = 1;
		super.anInt2758 = 0;
		this.anInt2769 = 0;
		this.anInt2777 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2771; local18++) {
			@Pc(24) int local24 = this.anIntArray334[local18];
			@Pc(29) int local29 = this.anIntArray322[local18];
			@Pc(34) int local34 = this.anIntArray324[local18];
			if (-local29 > super.anInt2758) {
				super.anInt2758 = -local29;
			}
			if (local29 > this.anInt2769) {
				this.anInt2769 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2777) {
				this.anInt2777 = local58;
			}
		}
		this.anInt2777 = (int) (Math.sqrt((double) this.anInt2777) + 0.99D);
		this.anInt2768 = (int) (Math.sqrt((double) (this.anInt2777 * this.anInt2777 + super.anInt2758 * super.anInt2758)) + 0.99D);
		this.anInt2772 = this.anInt2768 + (int) (Math.sqrt((double) (this.anInt2777 * this.anInt2777 + this.anInt2769 * this.anInt2769)) + 0.99D);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	public void method1801() {
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2771; local7++) {
			this.anIntArray324[local7] = -this.anIntArray324[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt2770; local24++) {
			@Pc(30) int local30 = this.anIntArray337[local24];
			this.anIntArray337[local24] = this.anIntArray328[local24];
			this.anIntArray328[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!v;[I)Lclient!v;")
	private Class3_Sub1_Sub1_Sub6 method1802(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt2771 = this.anInt2771;
		arg1.anInt2770 = this.anInt2770;
		arg1.anInt2767 = this.anInt2767;
		if (arg1.anIntArray334 == null || arg1.anIntArray334.length < this.anInt2771) {
			arg1.anIntArray334 = new int[this.anInt2771 + 100];
			arg1.anIntArray322 = new int[this.anInt2771 + 100];
			arg1.anIntArray324 = new int[this.anInt2771 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2771; local43++) {
			arg1.anIntArray334[local43] = this.anIntArray334[local43];
			arg1.anIntArray322[local43] = this.anIntArray322[local43];
			arg1.anIntArray324[local43] = this.anIntArray324[local43];
		}
		if (arg0) {
			arg1.anIntArray336 = this.anIntArray336;
		} else {
			arg1.anIntArray336 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray336 == null) {
				for (local88 = 0; local88 < this.anInt2770; local88++) {
					arg1.anIntArray336[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2770; local88++) {
					arg1.anIntArray336[local88] = this.anIntArray336[local88];
				}
			}
		}
		arg1.anIntArray335 = this.anIntArray335;
		arg1.anIntArray331 = this.anIntArray331;
		arg1.anIntArray327 = this.anIntArray327;
		arg1.anInt2776 = this.anInt2776;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.anIntArrayArray23 = this.anIntArrayArray23;
		arg1.anIntArray337 = this.anIntArray337;
		arg1.anIntArray325 = this.anIntArray325;
		arg1.anIntArray328 = this.anIntArray328;
		arg1.anIntArray321 = this.anIntArray321;
		arg1.anIntArray329 = this.anIntArray329;
		arg1.anIntArray326 = this.anIntArray326;
		arg1.anIntArray330 = this.anIntArray330;
		arg1.anIntArray332 = this.anIntArray332;
		arg1.anIntArray338 = this.anIntArray338;
		arg1.aBoolean149 = this.aBoolean149;
		arg1.anInt2774 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIII)V")
	private void method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static107.anInt2783 = 0;
			Static107.anInt2782 = 0;
			Static107.anInt2778 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray23.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray23[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static107.anInt2783 += this.anIntArray334[local36];
						Static107.anInt2782 += this.anIntArray322[local36];
						Static107.anInt2778 += this.anIntArray324[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static107.anInt2783 = Static107.anInt2783 / local6 + arg2;
				Static107.anInt2782 = Static107.anInt2782 / local6 + arg3;
				Static107.anInt2778 = Static107.anInt2778 / local6 + arg4;
			} else {
				Static107.anInt2783 = arg2;
				Static107.anInt2782 = arg3;
				Static107.anInt2778 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray334[local31] += arg2;
						this.anIntArray322[local31] += arg3;
						this.anIntArray324[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray334[local31] -= Static107.anInt2783;
						this.anIntArray322[local31] -= Static107.anInt2782;
						this.anIntArray324[local31] -= Static107.anInt2778;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static107.anIntArray343[local225];
							local235 = Static107.anIntArray357[local225];
							local251 = this.anIntArray322[local31] * local231 + this.anIntArray334[local31] * local235 >> 16;
							this.anIntArray322[local31] = this.anIntArray322[local31] * local235 - this.anIntArray334[local31] * local231 >> 16;
							this.anIntArray334[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static107.anIntArray343[local36];
							local235 = Static107.anIntArray357[local36];
							local251 = this.anIntArray322[local31] * local235 - this.anIntArray324[local31] * local231 >> 16;
							this.anIntArray324[local31] = this.anIntArray322[local31] * local231 + this.anIntArray324[local31] * local235 >> 16;
							this.anIntArray322[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static107.anIntArray343[local219];
							local235 = Static107.anIntArray357[local219];
							local251 = this.anIntArray324[local31] * local231 + this.anIntArray334[local31] * local235 >> 16;
							this.anIntArray324[local31] = this.anIntArray324[local31] * local235 - this.anIntArray334[local31] * local231 >> 16;
							this.anIntArray334[local31] = local251;
						}
						this.anIntArray334[local31] += Static107.anInt2783;
						this.anIntArray322[local31] += Static107.anInt2782;
						this.anIntArray324[local31] += Static107.anInt2778;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray334[local31] -= Static107.anInt2783;
						this.anIntArray322[local31] -= Static107.anInt2782;
						this.anIntArray324[local31] -= Static107.anInt2778;
						this.anIntArray334[local31] = this.anIntArray334[local31] * arg2 / 128;
						this.anIntArray322[local31] = this.anIntArray322[local31] * arg3 / 128;
						this.anIntArray324[local31] = this.anIntArray324[local31] * arg4 / 128;
						this.anIntArray334[local31] += Static107.anInt2783;
						this.anIntArray322[local31] += Static107.anInt2782;
						this.anIntArray324[local31] += Static107.anInt2778;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray22 != null && this.anIntArray336 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray336[local31] += arg2 * 8;
						if (this.anIntArray336[local31] < 0) {
							this.anIntArray336[local31] = 0;
						}
						if (this.anIntArray336[local31] > 255) {
							this.anIntArray336[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZZI)V")
	private void method1804(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2772 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2772; local6++) {
			Static107.anIntArray353[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2770; local18++) {
			if (this.anIntArray335 == null || this.anIntArray335[local18] != -1) {
				local33 = this.anIntArray337[local18];
				local38 = this.anIntArray325[local18];
				local43 = this.anIntArray328[local18];
				local47 = Static107.anIntArray344[local33];
				local51 = Static107.anIntArray344[local38];
				local55 = Static107.anIntArray344[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static107.anIntArray341[local33];
					local74 = Static107.anIntArray341[local38];
					@Pc(78) int local78 = Static107.anIntArray341[local43];
					@Pc(82) int local82 = Static107.anIntArray359[local33];
					local86 = Static107.anIntArray359[local38];
					local90 = Static107.anIntArray359[local43];
					@Pc(94) int local94 = Static107.anIntArray355[local33];
					local98 = Static107.anIntArray355[local38];
					@Pc(102) int local102 = Static107.anIntArray355[local43];
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
						Static107.aBooleanArray22[local18] = true;
						@Pc(183) int local183 = (Static107.anIntArray350[local33] + Static107.anIntArray350[local38] + Static107.anIntArray350[local43]) / 3 + this.anInt2768;
						Static107.anIntArrayArray25[local183][Static107.anIntArray353[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method1795(Static107.anInt2779, Static107.anInt2780, Static107.anIntArray349[local33], Static107.anIntArray349[local38], Static107.anIntArray349[local43], local47, local51, local55)) {
						Static107.anIntArray352[Static107.anInt2781++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static107.anIntArray349[local43] - Static107.anIntArray349[local38]) - (Static107.anIntArray349[local33] - Static107.anIntArray349[local38]) * (local55 - local51) > 0) {
						Static107.aBooleanArray22[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static25.anInt782 && local51 <= Static25.anInt782 && local55 <= Static25.anInt782) {
							Static107.aBooleanArray23[local18] = false;
						} else {
							Static107.aBooleanArray23[local18] = true;
						}
						local70 = (Static107.anIntArray350[local33] + Static107.anIntArray350[local38] + Static107.anIntArray350[local43]) / 3 + this.anInt2768;
						Static107.anIntArrayArray25[local70][Static107.anIntArray353[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray327 == null) {
			for (local33 = this.anInt2772 - 1; local33 >= 0; local33--) {
				local38 = Static107.anIntArray353[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static107.anIntArrayArray25[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method1810(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static107.anIntArray356[local33] = 0;
			Static107.anIntArray340[local33] = 0;
		}
		for (local38 = this.anInt2772 - 1; local38 >= 0; local38--) {
			local43 = Static107.anIntArray353[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static107.anIntArrayArray25[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray327[local55];
					local74 = Static107.anIntArray356[local70]++;
					Static107.anIntArrayArray24[local70][local74] = local55;
					if (local70 < 10) {
						Static107.anIntArray340[local70] += local38;
					} else if (local70 == 10) {
						Static107.anIntArray360[local74] = local38;
					} else {
						Static107.anIntArray345[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static107.anIntArray356[1] > 0 || Static107.anIntArray356[2] > 0) {
			local43 = (Static107.anIntArray340[1] + Static107.anIntArray340[2]) / (Static107.anIntArray356[1] + Static107.anIntArray356[2]);
		}
		local47 = 0;
		if (Static107.anIntArray356[3] > 0 || Static107.anIntArray356[4] > 0) {
			local47 = (Static107.anIntArray340[3] + Static107.anIntArray340[4]) / (Static107.anIntArray356[3] + Static107.anIntArray356[4]);
		}
		local51 = 0;
		if (Static107.anIntArray356[6] > 0 || Static107.anIntArray356[8] > 0) {
			local51 = (Static107.anIntArray340[6] + Static107.anIntArray340[8]) / (Static107.anIntArray356[6] + Static107.anIntArray356[8]);
		}
		local70 = 0;
		local74 = Static107.anIntArray356[10];
		@Pc(524) int[] local524 = Static107.anIntArrayArray24[10];
		@Pc(526) int[] local526 = Static107.anIntArray360;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static107.anIntArray356[11];
			local524 = Static107.anIntArrayArray24[11];
			local526 = Static107.anIntArray345;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method1810(local524[local70++]);
				if (local70 == local74 && local524 != Static107.anIntArrayArray24[11]) {
					local70 = 0;
					local74 = Static107.anIntArray356[11];
					local524 = Static107.anIntArrayArray24[11];
					local526 = Static107.anIntArray345;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method1810(local524[local70++]);
				if (local70 == local74 && local524 != Static107.anIntArrayArray24[11]) {
					local70 = 0;
					local74 = Static107.anIntArray356[11];
					local524 = Static107.anIntArrayArray24[11];
					local526 = Static107.anIntArray345;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method1810(local524[local70++]);
				if (local70 == local74 && local524 != Static107.anIntArrayArray24[11]) {
					local70 = 0;
					local74 = Static107.anIntArray356[11];
					local524 = Static107.anIntArrayArray24[11];
					local526 = Static107.anIntArray345;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static107.anIntArray356[local86];
			@Pc(689) int[] local689 = Static107.anIntArrayArray24[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method1810(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method1810(local524[local70++]);
			if (local70 == local74 && local524 != Static107.anIntArrayArray24[11]) {
				local70 = 0;
				local524 = Static107.anIntArrayArray24[11];
				local74 = Static107.anIntArray356[11];
				local526 = Static107.anIntArray345;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(Z)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1805(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static107.anIntArray351.length < this.anInt2770) {
			Static107.anIntArray351 = new int[this.anInt2770 + 100];
		}
		return this.method1802(arg0, Static107.aClass3_Sub1_Sub1_Sub6_3, Static107.anIntArray351);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIZ)V")
	public void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray321 == null) {
			this.anIntArray321 = new int[this.anInt2770];
			this.anIntArray329 = new int[this.anInt2770];
			this.anIntArray326 = new int[this.anInt2770];
		}
		@Pc(48) int local48;
		if (this.aClass50Array1 == null) {
			this.aClass50Array1 = new Class50[this.anInt2771];
			for (local48 = 0; local48 < this.anInt2771; local48++) {
				this.aClass50Array1[local48] = new Class50();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt2770; local48++) {
			local69 = this.anIntArray337[local48];
			@Pc(74) int local74 = this.anIntArray325[local48];
			@Pc(79) int local79 = this.anIntArray328[local48];
			@Pc(89) int local89 = this.anIntArray334[local74] - this.anIntArray334[local69];
			@Pc(99) int local99 = this.anIntArray322[local74] - this.anIntArray322[local69];
			@Pc(109) int local109 = this.anIntArray324[local74] - this.anIntArray324[local69];
			@Pc(119) int local119 = this.anIntArray334[local79] - this.anIntArray334[local69];
			@Pc(129) int local129 = this.anIntArray322[local79] - this.anIntArray322[local69];
			@Pc(139) int local139 = this.anIntArray324[local79] - this.anIntArray324[local69];
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
			if (this.anIntArray335 == null || (this.anIntArray335[local48] & 0x1) == 0) {
				@Pc(246) Class50 local246 = this.aClass50Array1[local69];
				local246.anInt1999 += local147;
				local246.anInt2003 += local155;
				local246.anInt1998 += local163;
				local246.anInt2007++;
				@Pc(275) Class50 local275 = this.aClass50Array1[local74];
				local275.anInt1999 += local147;
				local275.anInt2003 += local155;
				local275.anInt1998 += local163;
				local275.anInt2007++;
				@Pc(304) Class50 local304 = this.aClass50Array1[local79];
				local304.anInt1999 += local147;
				local304.anInt2003 += local155;
				local304.anInt1998 += local163;
				local304.anInt2007++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray321[local48] = Static107.method1824(this.anIntArray331[local48], local349, this.anIntArray335[local48]);
			}
		}
		if (arg5) {
			this.method1818(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass50Array2 = new Class50[this.anInt2771];
		for (local69 = 0; local69 < this.anInt2771; local69++) {
			@Pc(391) Class50 local391 = this.aClass50Array1[local69];
			@Pc(400) Class50 local400 = this.aClass50Array2[local69] = new Class50();
			local400.anInt1999 = local391.anInt1999;
			local400.anInt2003 = local391.anInt2003;
			local400.anInt1998 = local391.anInt1998;
			local400.anInt2007 = local391.anInt2007;
		}
		this.anInt2773 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
	public void method1807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt2774 != 2 && this.anInt2774 != 1) {
			this.method1826();
		}
		@Pc(11) int local11 = Static25.anInt783;
		@Pc(13) int local13 = Static25.anInt786;
		@Pc(17) int local17 = Static107.anIntArray343[0];
		@Pc(21) int local21 = Static107.anIntArray357[0];
		@Pc(25) int local25 = Static107.anIntArray343[arg0];
		@Pc(29) int local29 = Static107.anIntArray357[arg0];
		@Pc(33) int local33 = Static107.anIntArray343[arg1];
		@Pc(37) int local37 = Static107.anIntArray357[arg1];
		@Pc(41) int local41 = Static107.anIntArray343[arg2];
		@Pc(45) int local45 = Static107.anIntArray357[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2771; local57++) {
			@Pc(63) int local63 = this.anIntArray334[local57];
			@Pc(68) int local68 = this.anIntArray322[local57];
			@Pc(73) int local73 = this.anIntArray324[local57];
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
			Static107.anIntArray350[local57] = local73 - local55;
			Static107.anIntArray344[local57] = local11 + (local63 << 9) / local73;
			Static107.anIntArray349[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt2767 > 0) {
				Static107.anIntArray341[local57] = local63;
				Static107.anIntArray359[local57] = local85;
				Static107.anIntArray355[local57] = local73;
			}
		}
		try {
			this.method1804(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
	public void method1809() {
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2771; local7++) {
			@Pc(13) int local13 = this.anIntArray324[local7];
			this.anIntArray324[local7] = this.anIntArray334[local7];
			this.anIntArray334[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
	private void method1810(@OriginalArg(0) int arg0) {
		if (Static107.aBooleanArray22[arg0]) {
			this.method1816(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray337[arg0];
		@Pc(17) int local17 = this.anIntArray325[arg0];
		@Pc(22) int local22 = this.anIntArray328[arg0];
		Static25.aBoolean38 = Static107.aBooleanArray23[arg0];
		if (this.anIntArray336 == null) {
			Static25.anInt787 = 0;
		} else {
			Static25.anInt787 = this.anIntArray336[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray335 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray335[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static25.method510(Static107.anIntArray349[local12], Static107.anIntArray349[local17], Static107.anIntArray349[local22], Static107.anIntArray344[local12], Static107.anIntArray344[local17], Static107.anIntArray344[local22], this.anIntArray321[arg0], this.anIntArray329[arg0], this.anIntArray326[arg0]);
		} else if (local42 == 1) {
			Static25.method512(Static107.anIntArray349[local12], Static107.anIntArray349[local17], Static107.anIntArray349[local22], Static107.anIntArray344[local12], Static107.anIntArray344[local17], Static107.anIntArray344[local22], Static107.anIntArray347[this.anIntArray321[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray335[arg0] >> 2;
				local128 = this.anIntArray330[local123];
				local133 = this.anIntArray332[local123];
				local138 = this.anIntArray338[local123];
				Static25.method515(Static107.anIntArray349[local12], Static107.anIntArray349[local17], Static107.anIntArray349[local22], Static107.anIntArray344[local12], Static107.anIntArray344[local17], Static107.anIntArray344[local22], this.anIntArray321[arg0], this.anIntArray329[arg0], this.anIntArray326[arg0], Static107.anIntArray341[local128], Static107.anIntArray341[local133], Static107.anIntArray341[local138], Static107.anIntArray359[local128], Static107.anIntArray359[local133], Static107.anIntArray359[local138], Static107.anIntArray355[local128], Static107.anIntArray355[local133], Static107.anIntArray355[local138], this.anIntArray331[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray335[arg0] >> 2;
				local128 = this.anIntArray330[local123];
				local133 = this.anIntArray332[local123];
				local138 = this.anIntArray338[local123];
				Static25.method515(Static107.anIntArray349[local12], Static107.anIntArray349[local17], Static107.anIntArray349[local22], Static107.anIntArray344[local12], Static107.anIntArray344[local17], Static107.anIntArray344[local22], this.anIntArray321[arg0], this.anIntArray321[arg0], this.anIntArray321[arg0], Static107.anIntArray341[local128], Static107.anIntArray341[local133], Static107.anIntArray341[local138], Static107.anIntArray359[local128], Static107.anIntArray359[local133], Static107.anIntArray359[local138], Static107.anIntArray355[local128], Static107.anIntArray355[local133], Static107.anIntArray355[local138], this.anIntArray331[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
	public void method1811() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray323 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2771; local9++) {
				local15 = this.anIntArray323[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray23 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray23[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2771) {
				local65 = this.anIntArray323[local59];
				this.anIntArrayArray23[local65][local5[local65]++] = local59++;
			}
			this.anIntArray323 = null;
		}
		if (this.anIntArray333 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2770; local9++) {
			local15 = this.anIntArray333[local9];
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
		while (local59 < this.anInt2770) {
			local65 = this.anIntArray333[local59];
			this.anIntArrayArray22[local65][local5[local65]++] = local59++;
		}
		this.anIntArray333 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
	public void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2774 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2771; local4++) {
			this.anIntArray334[local4] += arg0;
			this.anIntArray322[local4] += arg1;
			this.anIntArray324[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
	public void method1813() {
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2771; local7++) {
			@Pc(13) int local13 = this.anIntArray334[local7];
			this.anIntArray334[local7] = this.anIntArray324[local7];
			this.anIntArray324[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;I)I")
	private int method1814(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray334[arg1];
		@Pc(11) int local11 = arg0.anIntArray322[arg1];
		@Pc(16) int local16 = arg0.anIntArray324[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2771; local18++) {
			if (local6 == this.anIntArray334[local18] && local11 == this.anIntArray322[local18] && local16 == this.anIntArray324[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray334[this.anInt2771] = local6;
			this.anIntArray322[this.anInt2771] = local11;
			this.anIntArray324[this.anInt2771] = local16;
			if (arg0.anIntArray323 != null) {
				this.anIntArray323[this.anInt2771] = arg0.anIntArray323[arg1];
			}
			local1 = this.anInt2771++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt2774 != 1) {
			this.method1800();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt2777 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt2777 << 9;
		if (local60 / local36 >= Static25.anInt781) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt2777 << 9;
		if (local73 / local36 <= Static25.anInt779) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt2777 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static25.anInt785) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2758 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static25.anInt780) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2758 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt2767 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static107.aBoolean150) {
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
			local215 = Static107.anInt2779 - Static25.anInt783;
			local219 = Static107.anInt2780 - Static25.anInt786;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean149) {
					Static107.anIntArray352[Static107.anInt2781++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static25.anInt783;
		local215 = Static25.anInt786;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static107.anIntArray343[arg0];
			local253 = Static107.anIntArray357[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt2771; local265++) {
			@Pc(271) int local271 = this.anIntArray334[local265];
			@Pc(276) int local276 = this.anIntArray322[local265];
			@Pc(281) int local281 = this.anIntArray324[local265];
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
			Static107.anIntArray350[local265] = local281 - local25;
			if (local281 >= 50) {
				Static107.anIntArray344[local265] = local168 + (local271 << 9) / local281;
				Static107.anIntArray349[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static107.anIntArray344[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static107.anIntArray341[local265] = local271;
				Static107.anIntArray359[local265] = local293;
				Static107.anIntArray355[local265] = local281;
			}
		}
		try {
			this.method1804(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!od;I)V")
	public void method1815(@OriginalArg(0) Class3_Sub1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray23 == null || arg1 == -1) {
			return;
		}
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		@Pc(18) Class53 local18 = arg0.aClass53Array1[arg1];
		@Pc(21) Class3_Sub12 local21 = local18.aClass3_Sub12_1;
		Static107.anInt2783 = 0;
		Static107.anInt2782 = 0;
		Static107.anInt2778 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt2173; local29++) {
			@Pc(35) int local35 = local18.anIntArray243[local29];
			this.method1803(local21.anIntArray314[local35], local21.anIntArrayArray21[local35], local18.anIntArray240[local29], local18.anIntArray244[local29], local18.anIntArray242[local29]);
		}
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V")
	private void method1816(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static25.anInt783;
		@Pc(3) int local3 = Static25.anInt786;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray337[arg0];
		@Pc(15) int local15 = this.anIntArray325[arg0];
		@Pc(20) int local20 = this.anIntArray328[arg0];
		@Pc(24) int local24 = Static107.anIntArray355[local10];
		@Pc(28) int local28 = Static107.anIntArray355[local15];
		@Pc(32) int local32 = Static107.anIntArray355[local20];
		if (this.anIntArray336 == null) {
			Static25.anInt787 = 0;
		} else {
			Static25.anInt787 = this.anIntArray336[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static107.anIntArray358[0] = Static107.anIntArray344[local10];
			Static107.anIntArray342[0] = Static107.anIntArray349[local10];
			local5++;
			Static107.anIntArray354[0] = this.anIntArray321[arg0];
		} else {
			local71 = Static107.anIntArray341[local10];
			local75 = Static107.anIntArray359[local10];
			local80 = this.anIntArray321[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static107.anIntArray346[local32 - local24];
				Static107.anIntArray358[0] = local1 + (local71 + ((Static107.anIntArray341[local20] - local71) * local93 >> 16) << 9) / 50;
				Static107.anIntArray342[0] = local3 + (local75 + ((Static107.anIntArray359[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static107.anIntArray354[0] = local80 + ((this.anIntArray326[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static107.anIntArray346[local28 - local24];
				Static107.anIntArray358[local5] = local1 + (local71 + ((Static107.anIntArray341[local15] - local71) * local93 >> 16) << 9) / 50;
				Static107.anIntArray342[local5] = local3 + (local75 + ((Static107.anIntArray359[local15] - local75) * local93 >> 16) << 9) / 50;
				Static107.anIntArray354[local5++] = local80 + ((this.anIntArray329[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static107.anIntArray358[local5] = Static107.anIntArray344[local15];
			Static107.anIntArray342[local5] = Static107.anIntArray349[local15];
			Static107.anIntArray354[local5++] = this.anIntArray329[arg0];
		} else {
			local71 = Static107.anIntArray341[local15];
			local75 = Static107.anIntArray359[local15];
			local80 = this.anIntArray329[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static107.anIntArray346[local24 - local28];
				Static107.anIntArray358[local5] = local1 + (local71 + ((Static107.anIntArray341[local10] - local71) * local93 >> 16) << 9) / 50;
				Static107.anIntArray342[local5] = local3 + (local75 + ((Static107.anIntArray359[local10] - local75) * local93 >> 16) << 9) / 50;
				Static107.anIntArray354[local5++] = local80 + ((this.anIntArray321[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static107.anIntArray346[local32 - local28];
				Static107.anIntArray358[local5] = local1 + (local71 + ((Static107.anIntArray341[local20] - local71) * local93 >> 16) << 9) / 50;
				Static107.anIntArray342[local5] = local3 + (local75 + ((Static107.anIntArray359[local20] - local75) * local93 >> 16) << 9) / 50;
				Static107.anIntArray354[local5++] = local80 + ((this.anIntArray326[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static107.anIntArray358[local5] = Static107.anIntArray344[local20];
			Static107.anIntArray342[local5] = Static107.anIntArray349[local20];
			Static107.anIntArray354[local5++] = this.anIntArray326[arg0];
		} else {
			local71 = Static107.anIntArray341[local20];
			local75 = Static107.anIntArray359[local20];
			local80 = this.anIntArray326[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static107.anIntArray346[local28 - local32];
				Static107.anIntArray358[local5] = local1 + (local71 + ((Static107.anIntArray341[local15] - local71) * local93 >> 16) << 9) / 50;
				Static107.anIntArray342[local5] = local3 + (local75 + ((Static107.anIntArray359[local15] - local75) * local93 >> 16) << 9) / 50;
				Static107.anIntArray354[local5++] = local80 + ((this.anIntArray329[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static107.anIntArray346[local24 - local32];
				Static107.anIntArray358[local5] = local1 + (local71 + ((Static107.anIntArray341[local10] - local71) * local93 >> 16) << 9) / 50;
				Static107.anIntArray342[local5] = local3 + (local75 + ((Static107.anIntArray359[local10] - local75) * local93 >> 16) << 9) / 50;
				Static107.anIntArray354[local5++] = local80 + ((this.anIntArray321[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static107.anIntArray358[0];
		local75 = Static107.anIntArray358[1];
		local80 = Static107.anIntArray358[2];
		local93 = Static107.anIntArray342[0];
		@Pc(588) int local588 = Static107.anIntArray342[1];
		@Pc(592) int local592 = Static107.anIntArray342[2];
		Static25.aBoolean38 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static25.anInt782 || local75 > Static25.anInt782 || local80 > Static25.anInt782) {
				Static25.aBoolean38 = true;
			}
			if (this.anIntArray335 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray335[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static25.method510(local93, local588, local592, local71, local75, local80, Static107.anIntArray354[0], Static107.anIntArray354[1], Static107.anIntArray354[2]);
			} else if (local619 == 1) {
				Static25.method512(local93, local588, local592, local71, local75, local80, Static107.anIntArray347[this.anIntArray321[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray335[arg0] >> 2;
				local678 = this.anIntArray330[local673];
				local683 = this.anIntArray332[local673];
				local688 = this.anIntArray338[local673];
				Static25.method515(local93, local588, local592, local71, local75, local80, Static107.anIntArray354[0], Static107.anIntArray354[1], Static107.anIntArray354[2], Static107.anIntArray341[local678], Static107.anIntArray341[local683], Static107.anIntArray341[local688], Static107.anIntArray359[local678], Static107.anIntArray359[local683], Static107.anIntArray359[local688], Static107.anIntArray355[local678], Static107.anIntArray355[local683], Static107.anIntArray355[local688], this.anIntArray331[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray335[arg0] >> 2;
				local678 = this.anIntArray330[local673];
				local683 = this.anIntArray332[local673];
				local688 = this.anIntArray338[local673];
				Static25.method515(local93, local588, local592, local71, local75, local80, this.anIntArray321[arg0], this.anIntArray321[arg0], this.anIntArray321[arg0], Static107.anIntArray341[local678], Static107.anIntArray341[local683], Static107.anIntArray341[local688], Static107.anIntArray359[local678], Static107.anIntArray359[local683], Static107.anIntArray359[local688], Static107.anIntArray355[local678], Static107.anIntArray355[local683], Static107.anIntArray355[local688], this.anIntArray331[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static25.anInt782 || local75 > Static25.anInt782 || local80 > Static25.anInt782 || Static107.anIntArray358[3] < 0 || Static107.anIntArray358[3] > Static25.anInt782) {
			Static25.aBoolean38 = true;
		}
		if (this.anIntArray335 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray335[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static25.method510(local93, local588, local592, local71, local75, local80, Static107.anIntArray354[0], Static107.anIntArray354[1], Static107.anIntArray354[2]);
			Static25.method510(local93, local592, Static107.anIntArray342[3], local71, local80, Static107.anIntArray358[3], Static107.anIntArray354[0], Static107.anIntArray354[2], Static107.anIntArray354[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static107.anIntArray347[this.anIntArray321[arg0]];
			Static25.method512(local93, local588, local592, local71, local75, local80, local673);
			Static25.method512(local93, local592, Static107.anIntArray342[3], local71, local80, Static107.anIntArray358[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray335[arg0] >> 2;
			local678 = this.anIntArray330[local673];
			local683 = this.anIntArray332[local673];
			local688 = this.anIntArray338[local673];
			Static25.method515(local93, local588, local592, local71, local75, local80, Static107.anIntArray354[0], Static107.anIntArray354[1], Static107.anIntArray354[2], Static107.anIntArray341[local678], Static107.anIntArray341[local683], Static107.anIntArray341[local688], Static107.anIntArray359[local678], Static107.anIntArray359[local683], Static107.anIntArray359[local688], Static107.anIntArray355[local678], Static107.anIntArray355[local683], Static107.anIntArray355[local688], this.anIntArray331[arg0]);
			Static25.method515(local93, local592, Static107.anIntArray342[3], local71, local80, Static107.anIntArray358[3], Static107.anIntArray354[0], Static107.anIntArray354[2], Static107.anIntArray354[3], Static107.anIntArray341[local678], Static107.anIntArray341[local683], Static107.anIntArray341[local688], Static107.anIntArray359[local678], Static107.anIntArray359[local683], Static107.anIntArray359[local688], Static107.anIntArray355[local678], Static107.anIntArray355[local683], Static107.anIntArray355[local688], this.anIntArray331[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray335[arg0] >> 2;
		local678 = this.anIntArray330[local673];
		local683 = this.anIntArray332[local673];
		local688 = this.anIntArray338[local673];
		Static25.method515(local93, local588, local592, local71, local75, local80, this.anIntArray321[arg0], this.anIntArray321[arg0], this.anIntArray321[arg0], Static107.anIntArray341[local678], Static107.anIntArray341[local683], Static107.anIntArray341[local688], Static107.anIntArray359[local678], Static107.anIntArray359[local683], Static107.anIntArray359[local688], Static107.anIntArray355[local678], Static107.anIntArray355[local683], Static107.anIntArray355[local688], this.anIntArray331[arg0]);
		Static25.method515(local93, local592, Static107.anIntArray342[3], local71, local80, Static107.anIntArray358[3], this.anIntArray321[arg0], this.anIntArray321[arg0], this.anIntArray321[arg0], Static107.anIntArray341[local678], Static107.anIntArray341[local683], Static107.anIntArray341[local688], Static107.anIntArray359[local678], Static107.anIntArray359[local683], Static107.anIntArray359[local688], Static107.anIntArray355[local678], Static107.anIntArray355[local683], Static107.anIntArray355[local688], this.anIntArray331[arg0]);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
	public void method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2771; local7++) {
			this.anIntArray334[local7] = this.anIntArray334[local7] * arg0 / 128;
			this.anIntArray322[local7] = this.anIntArray322[local7] * arg1 / 128;
			this.anIntArray324[local7] = this.anIntArray324[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
	private void method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2770; local1++) {
			local7 = this.anIntArray337[local1];
			@Pc(12) int local12 = this.anIntArray325[local1];
			@Pc(17) int local17 = this.anIntArray328[local1];
			@Pc(30) Class50 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray335 == null) {
				local25 = this.anIntArray331[local1];
				local30 = this.aClass50Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt1999 + arg3 * local30.anInt2003 + arg4 * local30.anInt1998) / (arg1 * local30.anInt2007);
				this.anIntArray321[local1] = Static107.method1824(local25, local52, 0);
				@Pc(65) Class50 local65 = this.aClass50Array1[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt1999 + arg3 * local65.anInt2003 + arg4 * local65.anInt1998) / (arg1 * local65.anInt2007);
				this.anIntArray329[local1] = Static107.method1824(local25, local87, 0);
				@Pc(100) Class50 local100 = this.aClass50Array1[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt1999 + arg3 * local100.anInt2003 + arg4 * local100.anInt1998) / (arg1 * local100.anInt2007);
				this.anIntArray326[local1] = Static107.method1824(local25, local122, 0);
			} else if ((this.anIntArray335[local1] & 0x1) == 0) {
				local25 = this.anIntArray331[local1];
				@Pc(148) int local148 = this.anIntArray335[local1];
				local30 = this.aClass50Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt1999 + arg3 * local30.anInt2003 + arg4 * local30.anInt1998) / (arg1 * local30.anInt2007);
				this.anIntArray321[local1] = Static107.method1824(local25, local52, local148);
				local30 = this.aClass50Array1[local12];
				local52 = arg0 + (arg2 * local30.anInt1999 + arg3 * local30.anInt2003 + arg4 * local30.anInt1998) / (arg1 * local30.anInt2007);
				this.anIntArray329[local1] = Static107.method1824(local25, local52, local148);
				local30 = this.aClass50Array1[local17];
				local52 = arg0 + (arg2 * local30.anInt1999 + arg3 * local30.anInt2003 + arg4 * local30.anInt1998) / (arg1 * local30.anInt2007);
				this.anIntArray326[local1] = Static107.method1824(local25, local52, local148);
			}
		}
		this.aClass50Array1 = null;
		this.aClass50Array2 = null;
		this.anIntArray323 = null;
		this.anIntArray333 = null;
		if (this.anIntArray335 != null) {
			for (local7 = 0; local7 < this.anInt2770; local7++) {
				if ((this.anIntArray335[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray331 = null;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "()I")
	public int method1819() {
		this.method1800();
		return this.anInt2777;
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "()V")
	public void method1820() {
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2771; local7++) {
			this.anIntArray334[local7] = -this.anIntArray334[local7];
			this.anIntArray324[local7] = -this.anIntArray324[local7];
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
	public void method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2770; local1++) {
			if (this.anIntArray331[local1] == arg0) {
				this.anIntArray331[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "()V")
	public void method1822() {
		if (this.anInt2774 == 3) {
			return;
		}
		this.anInt2774 = 3;
		super.anInt2758 = 0;
		this.anInt2769 = 0;
		this.anInt2777 = 999999;
		this.anInt2772 = -999999;
		this.anInt2768 = -99999;
		this.anInt2775 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2771; local27++) {
			@Pc(33) int local33 = this.anIntArray334[local27];
			@Pc(38) int local38 = this.anIntArray322[local27];
			@Pc(43) int local43 = this.anIntArray324[local27];
			if (local33 < this.anInt2777) {
				this.anInt2777 = local33;
			}
			if (local33 > this.anInt2772) {
				this.anInt2772 = local33;
			}
			if (local43 < this.anInt2775) {
				this.anInt2775 = local43;
			}
			if (local43 > this.anInt2768) {
				this.anInt2768 = local43;
			}
			if (-local38 > super.anInt2758) {
				super.anInt2758 = -local38;
			}
			if (local38 > this.anInt2769) {
				this.anInt2769 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
	public void method1823(@OriginalArg(0) int arg0) {
		this.aClass50Array1 = null;
		this.anInt2774 = 0;
		@Pc(9) int local9 = Static107.anIntArray343[arg0];
		@Pc(13) int local13 = Static107.anIntArray357[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2771; local15++) {
			@Pc(32) int local32 = this.anIntArray322[local15] * local13 - this.anIntArray324[local15] * local9 >> 16;
			this.anIntArray324[local15] = this.anIntArray322[local15] * local9 + this.anIntArray324[local15] * local13 >> 16;
			this.anIntArray322[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(Z)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1825(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static107.anIntArray339.length < this.anInt2770) {
			Static107.anIntArray339 = new int[this.anInt2770 + 100];
		}
		return this.method1802(arg0, Static107.aClass3_Sub1_Sub1_Sub6_2, Static107.anIntArray339);
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "()V")
	private void method1826() {
		if (this.anInt2774 == 2) {
			return;
		}
		this.anInt2774 = 2;
		this.anInt2777 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2771; local12++) {
			@Pc(18) int local18 = this.anIntArray334[local12];
			@Pc(23) int local23 = this.anIntArray322[local12];
			@Pc(28) int local28 = this.anIntArray324[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2777) {
				this.anInt2777 = local40;
			}
		}
		this.anInt2777 = (int) (Math.sqrt((double) this.anInt2777) + 0.99D);
		this.anInt2768 = this.anInt2777;
		this.anInt2772 = this.anInt2777 + this.anInt2777;
	}
}
