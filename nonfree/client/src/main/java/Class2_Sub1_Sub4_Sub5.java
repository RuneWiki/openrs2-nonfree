import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class2_Sub1_Sub4_Sub5 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!hb", name = "vc", descriptor = "[I")
	public static int[] anIntArray213 = new int[128];

	@OriginalMember(owner = "client!hb", name = "hb", descriptor = "I")
	public int anInt1347;

	@OriginalMember(owner = "client!hb", name = "nb", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!hb", name = "pb", descriptor = "I")
	public int anInt1348;

	@OriginalMember(owner = "client!hb", name = "rb", descriptor = "I")
	public int anInt1349;

	@OriginalMember(owner = "client!hb", name = "sb", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!hb", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!hb", name = "vb", descriptor = "I")
	private int anInt1351;

	@OriginalMember(owner = "client!hb", name = "zb", descriptor = "[Lclient!rb;")
	public Class52[] aClass52Array1;

	@OriginalMember(owner = "client!hb", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!hb", name = "Cb", descriptor = "I")
	public int anInt1352;

	@OriginalMember(owner = "client!hb", name = "Db", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!hb", name = "Gb", descriptor = "I")
	public int anInt1355;

	@OriginalMember(owner = "client!hb", name = "Kb", descriptor = "[Lclient!rb;")
	public Class52[] aClass52Array2;

	@OriginalMember(owner = "client!hb", name = "Mb", descriptor = "I")
	private int anInt1357;

	@OriginalMember(owner = "client!hb", name = "tb", descriptor = "I")
	private int anInt1350 = 0;

	@OriginalMember(owner = "client!hb", name = "Eb", descriptor = "I")
	public int anInt1353 = 0;

	@OriginalMember(owner = "client!hb", name = "Ob", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!hb", name = "Fb", descriptor = "I")
	public int anInt1354 = 0;

	@OriginalMember(owner = "client!hb", name = "Lb", descriptor = "I")
	private int anInt1356 = 0;

	@OriginalMember(owner = "client!hb", name = "mb", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!hb", name = "Jb", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!hb", name = "jb", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!hb", name = "kb", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!hb", name = "Ib", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!hb", name = "cc", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!hb", name = "Nb", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!hb", name = "xb", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!hb", name = "ib", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!hb", name = "Qb", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!hb", name = "qb", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!hb", name = "Hb", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!hb", name = "Ab", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!hb", name = "lb", descriptor = "[I")
	private int[] anIntArray179;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray213[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray213[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray213[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray213[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray213[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub4_Sub5(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class2_Sub6 local21 = new Class2_Sub6(arg0);
		@Pc(26) Class2_Sub6 local26 = new Class2_Sub6(arg0);
		@Pc(31) Class2_Sub6 local31 = new Class2_Sub6(arg0);
		@Pc(36) Class2_Sub6 local36 = new Class2_Sub6(arg0);
		@Pc(41) Class2_Sub6 local41 = new Class2_Sub6(arg0);
		local21.anInt952 = arg0.length - 18;
		@Pc(51) int local51 = local21.method627();
		@Pc(55) int local55 = local21.method627();
		@Pc(59) int local59 = local21.method665();
		@Pc(63) int local63 = local21.method665();
		@Pc(67) int local67 = local21.method665();
		@Pc(71) int local71 = local21.method665();
		@Pc(75) int local75 = local21.method665();
		@Pc(79) int local79 = local21.method665();
		@Pc(83) int local83 = local21.method627();
		@Pc(87) int local87 = local21.method627();
		@Pc(91) int local91 = local21.method627();
		@Pc(95) int local95 = local21.method627();
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
		this.anInt1353 = local51;
		this.anInt1354 = local55;
		this.anInt1356 = local59;
		this.anIntArray180 = new int[local51];
		this.anIntArray190 = new int[local51];
		this.anIntArray177 = new int[local51];
		this.anIntArray178 = new int[local55];
		this.anIntArray189 = new int[local55];
		this.anIntArray197 = new int[local55];
		this.anIntArray191 = new int[local59];
		this.anIntArray185 = new int[local59];
		this.anIntArray176 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray192 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray182 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray175 = new int[local55];
		} else {
			this.anInt1350 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray188 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray186 = new int[local55];
		}
		this.anIntArray179 = new int[local55];
		local21.anInt952 = local97;
		local26.anInt952 = local196;
		local31.anInt952 = local202;
		local36.anInt952 = local103;
		local41.anInt952 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method665();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method664();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method664();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method664();
			}
			this.anIntArray180[local321] = local315 + local328;
			this.anIntArray190[local321] = local317 + local338;
			this.anIntArray177[local321] = local319 + local348;
			local315 = this.anIntArray180[local321];
			local317 = this.anIntArray190[local321];
			local319 = this.anIntArray177[local321];
			if (this.anIntArray192 != null) {
				this.anIntArray192[local321] = local41.method665();
			}
		}
		local21.anInt952 = local180;
		local26.anInt952 = local138;
		local31.anInt952 = local111;
		local36.anInt952 = local162;
		local41.anInt952 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray179[local326] = local21.method627();
			if (this.anIntArray182 != null) {
				this.anIntArray182[local326] = local26.method665();
			}
			if (this.anIntArray175 != null) {
				this.anIntArray175[local326] = local31.method665();
			}
			if (this.anIntArray188 != null) {
				this.anIntArray188[local326] = local36.method665();
			}
			if (this.anIntArray186 != null) {
				this.anIntArray186[local326] = local41.method665();
			}
		}
		local21.anInt952 = local174;
		local26.anInt952 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method665();
			if (local496 == 1) {
				local328 = local21.method664() + local489;
				local338 = local21.method664() + local328;
				local348 = local21.method664() + local338;
				local489 = local348;
				this.anIntArray178[local491] = local328;
				this.anIntArray189[local491] = local338;
				this.anIntArray197[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method664() + local489;
				local489 = local348;
				this.anIntArray178[local491] = local328;
				this.anIntArray189[local491] = local338;
				this.anIntArray197[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method664() + local489;
				local489 = local348;
				this.anIntArray178[local491] = local328;
				this.anIntArray189[local491] = local338;
				this.anIntArray197[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method664() + local489;
				local489 = local348;
				this.anIntArray178[local491] = local328;
				this.anIntArray189[local491] = local599;
				this.anIntArray197[local491] = local348;
			}
		}
		local21.anInt952 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray191[local496] = local21.method627();
			this.anIntArray185[local496] = local21.method627();
			this.anIntArray176[local496] = local21.method627();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4_Sub5() {
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([Lclient!hb;I)V")
	public Class2_Sub1_Sub4_Sub5(@OriginalArg(0) Class2_Sub1_Sub4_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1353 = 0;
		this.anInt1354 = 0;
		this.anInt1356 = 0;
		this.anInt1350 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub4_Sub5 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1353 += local43.anInt1353;
				this.anInt1354 += local43.anInt1354;
				this.anInt1356 += local43.anInt1356;
				local18 |= local43.anIntArray182 != null;
				if (local43.anIntArray175 == null) {
					if (this.anInt1350 == -1) {
						this.anInt1350 = local43.anInt1350;
					}
					if (this.anInt1350 != local43.anInt1350) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray188 != null;
				local24 |= local43.anIntArray186 != null;
			}
		}
		this.anIntArray180 = new int[this.anInt1353];
		this.anIntArray190 = new int[this.anInt1353];
		this.anIntArray177 = new int[this.anInt1353];
		this.anIntArray192 = new int[this.anInt1353];
		this.anIntArray178 = new int[this.anInt1354];
		this.anIntArray189 = new int[this.anInt1354];
		this.anIntArray197 = new int[this.anInt1354];
		this.anIntArray191 = new int[this.anInt1356];
		this.anIntArray185 = new int[this.anInt1356];
		this.anIntArray176 = new int[this.anInt1356];
		if (local18) {
			this.anIntArray182 = new int[this.anInt1354];
		}
		if (local20) {
			this.anIntArray175 = new int[this.anInt1354];
		}
		if (local22) {
			this.anIntArray188 = new int[this.anInt1354];
		}
		if (local24) {
			this.anIntArray186 = new int[this.anInt1354];
		}
		this.anIntArray179 = new int[this.anInt1354];
		this.anInt1353 = 0;
		this.anInt1354 = 0;
		this.anInt1356 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class2_Sub1_Sub4_Sub5 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt1354; local223++) {
					if (local18) {
						if (local219.anIntArray182 == null) {
							this.anIntArray182[this.anInt1354] = 0;
						} else {
							local241 = local219.anIntArray182[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray182[this.anInt1354] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray175 == null) {
							this.anIntArray175[this.anInt1354] = local219.anInt1350;
						} else {
							this.anIntArray175[this.anInt1354] = local219.anIntArray175[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray188 == null) {
							this.anIntArray188[this.anInt1354] = 0;
						} else {
							this.anIntArray188[this.anInt1354] = local219.anIntArray188[local223];
						}
					}
					if (local24 && local219.anIntArray186 != null) {
						this.anIntArray186[this.anInt1354] = local219.anIntArray186[local223];
					}
					this.anIntArray179[this.anInt1354] = local219.anIntArray179[local223];
					this.anIntArray178[this.anInt1354] = this.method914(local219, local219.anIntArray178[local223]);
					this.anIntArray189[this.anInt1354] = this.method914(local219, local219.anIntArray189[local223]);
					this.anIntArray197[this.anInt1354] = this.method914(local219, local219.anIntArray197[local223]);
					this.anInt1354++;
				}
				for (local241 = 0; local241 < local219.anInt1356; local241++) {
					this.anIntArray191[this.anInt1356] = this.method914(local219, local219.anIntArray191[local241]);
					this.anIntArray185[this.anInt1356] = this.method914(local219, local219.anIntArray185[local241]);
					this.anIntArray176[this.anInt1356] = this.method914(local219, local219.anIntArray176[local241]);
					this.anInt1356++;
				}
				local212 += local219.anInt1356;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([Lclient!hb;IZ)V")
	public Class2_Sub1_Sub4_Sub5(@OriginalArg(0) Class2_Sub1_Sub4_Sub5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1353 = 0;
		this.anInt1354 = 0;
		this.anInt1356 = 0;
		this.anInt1350 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub4_Sub5 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1353 += local43.anInt1353;
				this.anInt1354 += local43.anInt1354;
				this.anInt1356 += local43.anInt1356;
				local18 |= local43.anIntArray182 != null;
				if (local43.anIntArray175 == null) {
					if (this.anInt1350 == -1) {
						this.anInt1350 = local43.anInt1350;
					}
					if (this.anInt1350 != local43.anInt1350) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray188 != null;
				local24 |= local43.anIntArray179 != null;
			}
		}
		this.anIntArray180 = new int[this.anInt1353];
		this.anIntArray190 = new int[this.anInt1353];
		this.anIntArray177 = new int[this.anInt1353];
		this.anIntArray178 = new int[this.anInt1354];
		this.anIntArray189 = new int[this.anInt1354];
		this.anIntArray197 = new int[this.anInt1354];
		this.anIntArray187 = new int[this.anInt1354];
		this.anIntArray183 = new int[this.anInt1354];
		this.anIntArray181 = new int[this.anInt1354];
		this.anIntArray191 = new int[this.anInt1356];
		this.anIntArray185 = new int[this.anInt1356];
		this.anIntArray176 = new int[this.anInt1356];
		if (local18) {
			this.anIntArray182 = new int[this.anInt1354];
		}
		if (local20) {
			this.anIntArray175 = new int[this.anInt1354];
		}
		if (local22) {
			this.anIntArray188 = new int[this.anInt1354];
		}
		if (local24) {
			this.anIntArray179 = new int[this.anInt1354];
		}
		this.anInt1353 = 0;
		this.anInt1354 = 0;
		this.anInt1356 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class2_Sub1_Sub4_Sub5 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt1353;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt1353; local231++) {
					this.anIntArray180[this.anInt1353] = local224.anIntArray180[local231];
					this.anIntArray190[this.anInt1353] = local224.anIntArray190[local231];
					this.anIntArray177[this.anInt1353] = local224.anIntArray177[local231];
					this.anInt1353++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt1354; local272++) {
					this.anIntArray178[this.anInt1354] = local224.anIntArray178[local272] + local229;
					this.anIntArray189[this.anInt1354] = local224.anIntArray189[local272] + local229;
					this.anIntArray197[this.anInt1354] = local224.anIntArray197[local272] + local229;
					this.anIntArray187[this.anInt1354] = local224.anIntArray187[local272];
					this.anIntArray183[this.anInt1354] = local224.anIntArray183[local272];
					this.anIntArray181[this.anInt1354] = local224.anIntArray181[local272];
					if (local18) {
						if (local224.anIntArray182 == null) {
							this.anIntArray182[this.anInt1354] = 0;
						} else {
							local350 = local224.anIntArray182[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray182[this.anInt1354] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray175 == null) {
							this.anIntArray175[this.anInt1354] = local224.anInt1350;
						} else {
							this.anIntArray175[this.anInt1354] = local224.anIntArray175[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray188 == null) {
							this.anIntArray188[this.anInt1354] = 0;
						} else {
							this.anIntArray188[this.anInt1354] = local224.anIntArray188[local272];
						}
					}
					if (local24 && local224.anIntArray179 != null) {
						this.anIntArray179[this.anInt1354] = local224.anIntArray179[local272];
					}
					this.anInt1354++;
				}
				for (local350 = 0; local350 < local224.anInt1356; local350++) {
					this.anIntArray191[this.anInt1356] = local224.anIntArray191[local350] + local229;
					this.anIntArray185[this.anInt1356] = local224.anIntArray185[local350] + local229;
					this.anIntArray176[this.anInt1356] = local224.anIntArray176[local350] + local229;
					this.anInt1356++;
				}
				local217 += local224.anInt1356;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!hb;ZZZ)V")
	public Class2_Sub1_Sub4_Sub5(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1353 = arg0.anInt1353;
		this.anInt1354 = arg0.anInt1354;
		this.anInt1356 = arg0.anInt1356;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray180 = arg0.anIntArray180;
			this.anIntArray190 = arg0.anIntArray190;
			this.anIntArray177 = arg0.anIntArray177;
		} else {
			this.anIntArray180 = new int[this.anInt1353];
			this.anIntArray190 = new int[this.anInt1353];
			this.anIntArray177 = new int[this.anInt1353];
			for (local60 = 0; local60 < this.anInt1353; local60++) {
				this.anIntArray180[local60] = arg0.anIntArray180[local60];
				this.anIntArray190[local60] = arg0.anIntArray190[local60];
				this.anIntArray177[local60] = arg0.anIntArray177[local60];
			}
		}
		if (arg2) {
			this.anIntArray179 = arg0.anIntArray179;
		} else {
			this.anIntArray179 = new int[this.anInt1354];
			for (local60 = 0; local60 < this.anInt1354; local60++) {
				this.anIntArray179[local60] = arg0.anIntArray179[local60];
			}
		}
		this.anIntArray188 = arg0.anIntArray188;
		this.anIntArray192 = arg0.anIntArray192;
		this.anIntArray186 = arg0.anIntArray186;
		this.anIntArray182 = arg0.anIntArray182;
		this.anIntArray178 = arg0.anIntArray178;
		this.anIntArray189 = arg0.anIntArray189;
		this.anIntArray197 = arg0.anIntArray197;
		this.anIntArray175 = arg0.anIntArray175;
		this.anInt1350 = arg0.anInt1350;
		this.anIntArray191 = arg0.anIntArray191;
		this.anIntArray185 = arg0.anIntArray185;
		this.anIntArray176 = arg0.anIntArray176;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!hb;ZZ)V")
	public Class2_Sub1_Sub4_Sub5(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt1353 = arg0.anInt1353;
		this.anInt1354 = arg0.anInt1354;
		this.anInt1356 = arg0.anInt1356;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray190 = new int[this.anInt1353];
			for (local37 = 0; local37 < this.anInt1353; local37++) {
				this.anIntArray190[local37] = arg0.anIntArray190[local37];
			}
		} else {
			this.anIntArray190 = arg0.anIntArray190;
		}
		if (arg2) {
			this.anIntArray187 = new int[this.anInt1354];
			this.anIntArray183 = new int[this.anInt1354];
			this.anIntArray181 = new int[this.anInt1354];
			for (local37 = 0; local37 < this.anInt1354; local37++) {
				this.anIntArray187[local37] = arg0.anIntArray187[local37];
				this.anIntArray183[local37] = arg0.anIntArray183[local37];
				this.anIntArray181[local37] = arg0.anIntArray181[local37];
			}
			this.anIntArray182 = new int[this.anInt1354];
			@Pc(115) int local115;
			if (arg0.anIntArray182 == null) {
				for (local115 = 0; local115 < this.anInt1354; local115++) {
					this.anIntArray182[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt1354; local115++) {
					this.anIntArray182[local115] = arg0.anIntArray182[local115];
				}
			}
			this.aClass52Array2 = new Class52[this.anInt1353];
			for (local115 = 0; local115 < this.anInt1353; local115++) {
				@Pc(160) Class52 local160 = this.aClass52Array2[local115] = new Class52();
				@Pc(165) Class52 local165 = arg0.aClass52Array2[local115];
				local160.anInt2327 = local165.anInt2327;
				local160.anInt2331 = local165.anInt2331;
				local160.anInt2329 = local165.anInt2329;
				local160.anInt2330 = local165.anInt2330;
			}
			this.aClass52Array1 = arg0.aClass52Array1;
		} else {
			this.anIntArray187 = arg0.anIntArray187;
			this.anIntArray183 = arg0.anIntArray183;
			this.anIntArray181 = arg0.anIntArray181;
			this.anIntArray182 = arg0.anIntArray182;
		}
		this.anIntArray180 = arg0.anIntArray180;
		this.anIntArray177 = arg0.anIntArray177;
		this.anIntArray179 = arg0.anIntArray179;
		this.anIntArray188 = arg0.anIntArray188;
		this.anIntArray175 = arg0.anIntArray175;
		this.anInt1350 = arg0.anInt1350;
		this.anIntArray178 = arg0.anIntArray178;
		this.anIntArray189 = arg0.anIntArray189;
		this.anIntArray197 = arg0.anIntArray197;
		this.anIntArray191 = arg0.anIntArray191;
		this.anIntArray185 = arg0.anIntArray185;
		this.anIntArray176 = arg0.anIntArray176;
		this.anInt1357 = arg0.anInt1357;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public void method894() {
		@Pc(4) int local4 = this.anInt1357 >> 16;
		@Pc(11) int local11 = this.anInt1357 << 16 >> 16;
		this.method917(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
	public void method895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1353; local7++) {
			this.anIntArray180[local7] = this.anIntArray180[local7] * arg0 / 128;
			this.anIntArray190[local7] = this.anIntArray190[local7] * arg1 / 128;
			this.anIntArray177[local7] = this.anIntArray177[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public void method897() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray192 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1353; local9++) {
				local15 = this.anIntArray192[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray40 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray40[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1353) {
				local65 = this.anIntArray192[local59];
				this.anIntArrayArray40[local65][local5[local65]++] = local59++;
			}
			this.anIntArray192 = null;
		}
		if (this.anIntArray186 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1354; local9++) {
			local15 = this.anIntArray186[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray41 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray41[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1354) {
			local65 = this.anIntArray186[local59];
			this.anIntArrayArray41[local65][local5[local65]++] = local59++;
		}
		this.anIntArray186 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ia;ILclient!ia;I[I)V")
	public void method898(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method913(arg0, arg1);
			return;
		}
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		@Pc(24) Class40 local24 = arg0.aClass40Array1[arg1];
		@Pc(29) Class40 local29 = arg2.aClass40Array1[arg3];
		@Pc(32) Class2_Sub11 local32 = local24.aClass2_Sub11_1;
		Static35.anInt1362 = 0;
		Static35.anInt1360 = 0;
		Static35.anInt1361 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt2231; local47++) {
			local53 = local24.anIntArray308[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray225[local53] == 0) {
				this.method918(local32.anIntArray225[local53], local32.anIntArrayArray46[local53], local24.anIntArray309[local47], local24.anIntArray311[local47], local24.anIntArray304[local47]);
			}
		}
		Static35.anInt1362 = 0;
		Static35.anInt1360 = 0;
		Static35.anInt1361 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt2231; local53++) {
			@Pc(118) int local118 = local29.anIntArray308[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray225[local118] == 0) {
				this.method918(local32.anIntArray225[local118], local32.anIntArrayArray46[local118], local29.anIntArray309[local53], local29.anIntArray311[local53], local29.anIntArray304[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZI)V")
	private void method899(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1349 >= 1500) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1349; local6++) {
			Static35.anIntArray202[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1354; local18++) {
			if (this.anIntArray182 == null || this.anIntArray182[local18] != -1) {
				local33 = this.anIntArray178[local18];
				local38 = this.anIntArray189[local18];
				local43 = this.anIntArray197[local18];
				local47 = Static35.anIntArray206[local33];
				local51 = Static35.anIntArray206[local38];
				local55 = Static35.anIntArray206[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static35.anIntArray214[local33];
					local74 = Static35.anIntArray214[local38];
					@Pc(78) int local78 = Static35.anIntArray214[local43];
					@Pc(82) int local82 = Static35.anIntArray199[local33];
					local86 = Static35.anIntArray199[local38];
					local90 = Static35.anIntArray199[local43];
					@Pc(94) int local94 = Static35.anIntArray198[local33];
					local98 = Static35.anIntArray198[local38];
					@Pc(102) int local102 = Static35.anIntArray198[local43];
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
						Static35.aBooleanArray31[local18] = true;
						@Pc(183) int local183 = (Static35.anIntArray209[local33] + Static35.anIntArray209[local38] + Static35.anIntArray209[local43]) / 3 + this.anInt1348;
						Static35.anIntArrayArray42[local183][Static35.anIntArray202[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method907(Static35.anInt1359, Static35.anInt1358, Static35.anIntArray207[local33], Static35.anIntArray207[local38], Static35.anIntArray207[local43], local47, local51, local55)) {
						Static35.anIntArray196[Static35.anInt1363++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static35.anIntArray207[local43] - Static35.anIntArray207[local38]) - (Static35.anIntArray207[local33] - Static35.anIntArray207[local38]) * (local55 - local51) > 0) {
						Static35.aBooleanArray31[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static97.anInt2638 && local51 <= Static97.anInt2638 && local55 <= Static97.anInt2638) {
							Static35.aBooleanArray32[local18] = false;
						} else {
							Static35.aBooleanArray32[local18] = true;
						}
						local70 = (Static35.anIntArray209[local33] + Static35.anIntArray209[local38] + Static35.anIntArray209[local43]) / 3 + this.anInt1348;
						Static35.anIntArrayArray42[local70][Static35.anIntArray202[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray175 == null) {
			for (local33 = this.anInt1349 - 1; local33 >= 0; local33--) {
				local38 = Static35.anIntArray202[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static35.anIntArrayArray42[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method912(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static35.anIntArray201[local33] = 0;
			Static35.anIntArray210[local33] = 0;
		}
		for (local38 = this.anInt1349 - 1; local38 >= 0; local38--) {
			local43 = Static35.anIntArray202[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static35.anIntArrayArray42[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray175[local55];
					local74 = Static35.anIntArray201[local70]++;
					Static35.anIntArrayArray43[local70][local74] = local55;
					if (local70 < 10) {
						Static35.anIntArray210[local70] += local38;
					} else if (local70 == 10) {
						Static35.anIntArray193[local74] = local38;
					} else {
						Static35.anIntArray212[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static35.anIntArray201[1] > 0 || Static35.anIntArray201[2] > 0) {
			local43 = (Static35.anIntArray210[1] + Static35.anIntArray210[2]) / (Static35.anIntArray201[1] + Static35.anIntArray201[2]);
		}
		local47 = 0;
		if (Static35.anIntArray201[3] > 0 || Static35.anIntArray201[4] > 0) {
			local47 = (Static35.anIntArray210[3] + Static35.anIntArray210[4]) / (Static35.anIntArray201[3] + Static35.anIntArray201[4]);
		}
		local51 = 0;
		if (Static35.anIntArray201[6] > 0 || Static35.anIntArray201[8] > 0) {
			local51 = (Static35.anIntArray210[6] + Static35.anIntArray210[8]) / (Static35.anIntArray201[6] + Static35.anIntArray201[8]);
		}
		local70 = 0;
		local74 = Static35.anIntArray201[10];
		@Pc(524) int[] local524 = Static35.anIntArrayArray43[10];
		@Pc(526) int[] local526 = Static35.anIntArray193;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static35.anIntArray201[11];
			local524 = Static35.anIntArrayArray43[11];
			local526 = Static35.anIntArray212;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method912(local524[local70++]);
				if (local70 == local74 && local524 != Static35.anIntArrayArray43[11]) {
					local70 = 0;
					local74 = Static35.anIntArray201[11];
					local524 = Static35.anIntArrayArray43[11];
					local526 = Static35.anIntArray212;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method912(local524[local70++]);
				if (local70 == local74 && local524 != Static35.anIntArrayArray43[11]) {
					local70 = 0;
					local74 = Static35.anIntArray201[11];
					local524 = Static35.anIntArrayArray43[11];
					local526 = Static35.anIntArray212;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method912(local524[local70++]);
				if (local70 == local74 && local524 != Static35.anIntArrayArray43[11]) {
					local70 = 0;
					local74 = Static35.anIntArray201[11];
					local524 = Static35.anIntArrayArray43[11];
					local526 = Static35.anIntArray212;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static35.anIntArray201[local86];
			@Pc(689) int[] local689 = Static35.anIntArrayArray43[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method912(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method912(local524[local70++]);
			if (local70 == local74 && local524 != Static35.anIntArrayArray43[11]) {
				local70 = 0;
				local524 = Static35.anIntArrayArray43[11];
				local74 = Static35.anIntArray201[11];
				local526 = Static35.anIntArray212;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!hb;[I)Lclient!hb;")
	private Class2_Sub1_Sub4_Sub5 method900(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub5 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt1353 = this.anInt1353;
		arg1.anInt1354 = this.anInt1354;
		arg1.anInt1356 = this.anInt1356;
		if (arg1.anIntArray180 == null || arg1.anIntArray180.length < this.anInt1353) {
			arg1.anIntArray180 = new int[this.anInt1353 + 100];
			arg1.anIntArray190 = new int[this.anInt1353 + 100];
			arg1.anIntArray177 = new int[this.anInt1353 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1353; local43++) {
			arg1.anIntArray180[local43] = this.anIntArray180[local43];
			arg1.anIntArray190[local43] = this.anIntArray190[local43];
			arg1.anIntArray177[local43] = this.anIntArray177[local43];
		}
		if (arg0) {
			arg1.anIntArray188 = this.anIntArray188;
		} else {
			arg1.anIntArray188 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray188 == null) {
				for (local88 = 0; local88 < this.anInt1354; local88++) {
					arg1.anIntArray188[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1354; local88++) {
					arg1.anIntArray188[local88] = this.anIntArray188[local88];
				}
			}
		}
		arg1.anIntArray182 = this.anIntArray182;
		arg1.anIntArray179 = this.anIntArray179;
		arg1.anIntArray175 = this.anIntArray175;
		arg1.anInt1350 = this.anInt1350;
		arg1.anIntArrayArray41 = this.anIntArrayArray41;
		arg1.anIntArrayArray40 = this.anIntArrayArray40;
		arg1.anIntArray178 = this.anIntArray178;
		arg1.anIntArray189 = this.anIntArray189;
		arg1.anIntArray197 = this.anIntArray197;
		arg1.anIntArray187 = this.anIntArray187;
		arg1.anIntArray183 = this.anIntArray183;
		arg1.anIntArray181 = this.anIntArray181;
		arg1.anIntArray191 = this.anIntArray191;
		arg1.anIntArray185 = this.anIntArray185;
		arg1.anIntArray176 = this.anIntArray176;
		arg1.anInt1351 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	public void method901() {
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1353; local7++) {
			@Pc(13) int local13 = this.anIntArray180[local7];
			this.anIntArray180[local7] = this.anIntArray177[local7];
			this.anIntArray177[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(Z)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method902(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static35.anIntArray184.length < this.anInt1354) {
			Static35.anIntArray184 = new int[this.anInt1354 + 100];
		}
		return this.method900(arg0, Static35.aClass2_Sub1_Sub4_Sub5_1, Static35.anIntArray184);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "()V")
	public void method903() {
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1353; local7++) {
			@Pc(13) int local13 = this.anIntArray177[local7];
			this.anIntArray177[local7] = this.anIntArray180[local7];
			this.anIntArray180[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZ)V")
	public void method904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray187 == null) {
			this.anIntArray187 = new int[this.anInt1354];
			this.anIntArray183 = new int[this.anInt1354];
			this.anIntArray181 = new int[this.anInt1354];
		}
		@Pc(48) int local48;
		if (this.aClass52Array2 == null) {
			this.aClass52Array2 = new Class52[this.anInt1353];
			for (local48 = 0; local48 < this.anInt1353; local48++) {
				this.aClass52Array2[local48] = new Class52();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt1354; local48++) {
			local69 = this.anIntArray178[local48];
			@Pc(74) int local74 = this.anIntArray189[local48];
			@Pc(79) int local79 = this.anIntArray197[local48];
			@Pc(89) int local89 = this.anIntArray180[local74] - this.anIntArray180[local69];
			@Pc(99) int local99 = this.anIntArray190[local74] - this.anIntArray190[local69];
			@Pc(109) int local109 = this.anIntArray177[local74] - this.anIntArray177[local69];
			@Pc(119) int local119 = this.anIntArray180[local79] - this.anIntArray180[local69];
			@Pc(129) int local129 = this.anIntArray190[local79] - this.anIntArray190[local69];
			@Pc(139) int local139 = this.anIntArray177[local79] - this.anIntArray177[local69];
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
			if (this.anIntArray182 == null || (this.anIntArray182[local48] & 0x1) == 0) {
				@Pc(246) Class52 local246 = this.aClass52Array2[local69];
				local246.anInt2327 += local147;
				local246.anInt2331 += local155;
				local246.anInt2329 += local163;
				local246.anInt2330++;
				@Pc(275) Class52 local275 = this.aClass52Array2[local74];
				local275.anInt2327 += local147;
				local275.anInt2331 += local155;
				local275.anInt2329 += local163;
				local275.anInt2330++;
				@Pc(304) Class52 local304 = this.aClass52Array2[local79];
				local304.anInt2327 += local147;
				local304.anInt2331 += local155;
				local304.anInt2329 += local163;
				local304.anInt2330++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray187[local48] = Static35.method916(this.anIntArray179[local48], local349, this.anIntArray182[local48]);
			}
		}
		if (arg5) {
			this.method917(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass52Array1 = new Class52[this.anInt1353];
		for (local69 = 0; local69 < this.anInt1353; local69++) {
			@Pc(391) Class52 local391 = this.aClass52Array2[local69];
			@Pc(400) Class52 local400 = this.aClass52Array1[local69] = new Class52();
			local400.anInt2327 = local391.anInt2327;
			local400.anInt2331 = local391.anInt2331;
			local400.anInt2329 = local391.anInt2329;
			local400.anInt2330 = local391.anInt2330;
		}
		this.anInt1357 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(Z)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method906(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static35.anIntArray195.length < this.anInt1354) {
			Static35.anIntArray195 = new int[this.anInt1354 + 100];
		}
		return this.method900(arg0, Static35.aClass2_Sub1_Sub4_Sub5_2, Static35.anIntArray195);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "()V")
	public void method908() {
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1353; local7++) {
			this.anIntArray180[local7] = -this.anIntArray180[local7];
			this.anIntArray177[local7] = -this.anIntArray177[local7];
		}
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "()V")
	public void method909() {
		if (this.anInt1351 == 3) {
			return;
		}
		this.anInt1351 = 3;
		super.anInt1974 = 0;
		this.anInt1347 = 0;
		this.anInt1355 = 999999;
		this.anInt1349 = -999999;
		this.anInt1348 = -99999;
		this.anInt1352 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1353; local27++) {
			@Pc(33) int local33 = this.anIntArray180[local27];
			@Pc(38) int local38 = this.anIntArray190[local27];
			@Pc(43) int local43 = this.anIntArray177[local27];
			if (local33 < this.anInt1355) {
				this.anInt1355 = local33;
			}
			if (local33 > this.anInt1349) {
				this.anInt1349 = local33;
			}
			if (local43 < this.anInt1352) {
				this.anInt1352 = local43;
			}
			if (local43 > this.anInt1348) {
				this.anInt1348 = local43;
			}
			if (-local38 > super.anInt1974) {
				super.anInt1974 = -local38;
			}
			if (local38 > this.anInt1347) {
				this.anInt1347 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "()V")
	public void method910() {
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1353; local7++) {
			this.anIntArray177[local7] = -this.anIntArray177[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt1354; local24++) {
			@Pc(30) int local30 = this.anIntArray178[local24];
			this.anIntArray178[local24] = this.anIntArray197[local24];
			this.anIntArray197[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
	public void method911(@OriginalArg(0) int arg0) {
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		@Pc(9) int local9 = Static35.anIntArray200[arg0];
		@Pc(13) int local13 = Static35.anIntArray205[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1353; local15++) {
			@Pc(32) int local32 = this.anIntArray190[local15] * local13 - this.anIntArray177[local15] * local9 >> 16;
			this.anIntArray177[local15] = this.anIntArray190[local15] * local9 + this.anIntArray177[local15] * local13 >> 16;
			this.anIntArray190[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
	private void method912(@OriginalArg(0) int arg0) {
		if (Static35.aBooleanArray31[arg0]) {
			this.method919(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray178[arg0];
		@Pc(17) int local17 = this.anIntArray189[arg0];
		@Pc(22) int local22 = this.anIntArray197[arg0];
		Static97.aBoolean137 = Static35.aBooleanArray32[arg0];
		if (this.anIntArray188 == null) {
			Static97.anInt2644 = 0;
		} else {
			Static97.anInt2644 = this.anIntArray188[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray182 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray182[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static97.method1652(Static35.anIntArray207[local12], Static35.anIntArray207[local17], Static35.anIntArray207[local22], Static35.anIntArray206[local12], Static35.anIntArray206[local17], Static35.anIntArray206[local22], this.anIntArray187[arg0], this.anIntArray183[arg0], this.anIntArray181[arg0]);
		} else if (local42 == 1) {
			Static97.method1655(Static35.anIntArray207[local12], Static35.anIntArray207[local17], Static35.anIntArray207[local22], Static35.anIntArray206[local12], Static35.anIntArray206[local17], Static35.anIntArray206[local22], Static35.anIntArray203[this.anIntArray187[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray182[arg0] >> 2;
				local128 = this.anIntArray191[local123];
				local133 = this.anIntArray185[local123];
				local138 = this.anIntArray176[local123];
				Static97.method1659(Static35.anIntArray207[local12], Static35.anIntArray207[local17], Static35.anIntArray207[local22], Static35.anIntArray206[local12], Static35.anIntArray206[local17], Static35.anIntArray206[local22], this.anIntArray187[arg0], this.anIntArray183[arg0], this.anIntArray181[arg0], Static35.anIntArray214[local128], Static35.anIntArray214[local133], Static35.anIntArray214[local138], Static35.anIntArray199[local128], Static35.anIntArray199[local133], Static35.anIntArray199[local138], Static35.anIntArray198[local128], Static35.anIntArray198[local133], Static35.anIntArray198[local138], this.anIntArray179[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray182[arg0] >> 2;
				local128 = this.anIntArray191[local123];
				local133 = this.anIntArray185[local123];
				local138 = this.anIntArray176[local123];
				Static97.method1659(Static35.anIntArray207[local12], Static35.anIntArray207[local17], Static35.anIntArray207[local22], Static35.anIntArray206[local12], Static35.anIntArray206[local17], Static35.anIntArray206[local22], this.anIntArray187[arg0], this.anIntArray187[arg0], this.anIntArray187[arg0], Static35.anIntArray214[local128], Static35.anIntArray214[local133], Static35.anIntArray214[local138], Static35.anIntArray199[local128], Static35.anIntArray199[local133], Static35.anIntArray199[local138], Static35.anIntArray198[local128], Static35.anIntArray198[local133], Static35.anIntArray198[local138], this.anIntArray179[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method913(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray40 == null || arg1 == -1) {
			return;
		}
		this.aClass52Array2 = null;
		this.anInt1351 = 0;
		@Pc(18) Class40 local18 = arg0.aClass40Array1[arg1];
		@Pc(21) Class2_Sub11 local21 = local18.aClass2_Sub11_1;
		Static35.anInt1362 = 0;
		Static35.anInt1360 = 0;
		Static35.anInt1361 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt2231; local29++) {
			@Pc(35) int local35 = local18.anIntArray308[local29];
			this.method918(local21.anIntArray225[local35], local21.anIntArrayArray46[local35], local18.anIntArray309[local29], local18.anIntArray311[local29], local18.anIntArray304[local29]);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hb;I)I")
	private int method914(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray180[arg1];
		@Pc(11) int local11 = arg0.anIntArray190[arg1];
		@Pc(16) int local16 = arg0.anIntArray177[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1353; local18++) {
			if (local6 == this.anIntArray180[local18] && local11 == this.anIntArray190[local18] && local16 == this.anIntArray177[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray180[this.anInt1353] = local6;
			this.anIntArray190[this.anInt1353] = local11;
			this.anIntArray177[this.anInt1353] = local16;
			if (arg0.anIntArray192 != null) {
				this.anIntArray192[this.anInt1353] = arg0.anIntArray192[arg1];
			}
			local1 = this.anInt1353++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "()V")
	private void method915() {
		if (this.anInt1351 == 2) {
			return;
		}
		this.anInt1351 = 2;
		this.anInt1355 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1353; local12++) {
			@Pc(18) int local18 = this.anIntArray180[local12];
			@Pc(23) int local23 = this.anIntArray190[local12];
			@Pc(28) int local28 = this.anIntArray177[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1355) {
				this.anInt1355 = local40;
			}
		}
		this.anInt1355 = (int) (Math.sqrt((double) this.anInt1355) + 0.99D);
		this.anInt1348 = this.anInt1355;
		this.anInt1349 = this.anInt1355 + this.anInt1355;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	private void method917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1354; local1++) {
			local7 = this.anIntArray178[local1];
			@Pc(12) int local12 = this.anIntArray189[local1];
			@Pc(17) int local17 = this.anIntArray197[local1];
			@Pc(30) Class52 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray182 == null) {
				local25 = this.anIntArray179[local1];
				local30 = this.aClass52Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2327 + arg3 * local30.anInt2331 + arg4 * local30.anInt2329) / (arg1 * local30.anInt2330);
				this.anIntArray187[local1] = Static35.method916(local25, local52, 0);
				@Pc(65) Class52 local65 = this.aClass52Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt2327 + arg3 * local65.anInt2331 + arg4 * local65.anInt2329) / (arg1 * local65.anInt2330);
				this.anIntArray183[local1] = Static35.method916(local25, local87, 0);
				@Pc(100) Class52 local100 = this.aClass52Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt2327 + arg3 * local100.anInt2331 + arg4 * local100.anInt2329) / (arg1 * local100.anInt2330);
				this.anIntArray181[local1] = Static35.method916(local25, local122, 0);
			} else if ((this.anIntArray182[local1] & 0x1) == 0) {
				local25 = this.anIntArray179[local1];
				@Pc(148) int local148 = this.anIntArray182[local1];
				local30 = this.aClass52Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2327 + arg3 * local30.anInt2331 + arg4 * local30.anInt2329) / (arg1 * local30.anInt2330);
				this.anIntArray187[local1] = Static35.method916(local25, local52, local148);
				local30 = this.aClass52Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt2327 + arg3 * local30.anInt2331 + arg4 * local30.anInt2329) / (arg1 * local30.anInt2330);
				this.anIntArray183[local1] = Static35.method916(local25, local52, local148);
				local30 = this.aClass52Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt2327 + arg3 * local30.anInt2331 + arg4 * local30.anInt2329) / (arg1 * local30.anInt2330);
				this.anIntArray181[local1] = Static35.method916(local25, local52, local148);
			}
		}
		this.aClass52Array2 = null;
		this.aClass52Array1 = null;
		this.anIntArray192 = null;
		this.anIntArray186 = null;
		if (this.anIntArray182 != null) {
			for (local7 = 0; local7 < this.anInt1354; local7++) {
				if ((this.anIntArray182[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray179 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[IIII)V")
	private void method918(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static35.anInt1362 = 0;
			Static35.anInt1360 = 0;
			Static35.anInt1361 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray40.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray40[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static35.anInt1362 += this.anIntArray180[local36];
						Static35.anInt1360 += this.anIntArray190[local36];
						Static35.anInt1361 += this.anIntArray177[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static35.anInt1362 = Static35.anInt1362 / local6 + arg2;
				Static35.anInt1360 = Static35.anInt1360 / local6 + arg3;
				Static35.anInt1361 = Static35.anInt1361 / local6 + arg4;
			} else {
				Static35.anInt1362 = arg2;
				Static35.anInt1360 = arg3;
				Static35.anInt1361 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray40.length) {
					local115 = this.anIntArrayArray40[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray180[local31] += arg2;
						this.anIntArray190[local31] += arg3;
						this.anIntArray177[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray40.length) {
					local115 = this.anIntArrayArray40[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray180[local31] -= Static35.anInt1362;
						this.anIntArray190[local31] -= Static35.anInt1360;
						this.anIntArray177[local31] -= Static35.anInt1361;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static35.anIntArray200[local225];
							local235 = Static35.anIntArray205[local225];
							local251 = this.anIntArray190[local31] * local231 + this.anIntArray180[local31] * local235 >> 16;
							this.anIntArray190[local31] = this.anIntArray190[local31] * local235 - this.anIntArray180[local31] * local231 >> 16;
							this.anIntArray180[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static35.anIntArray200[local36];
							local235 = Static35.anIntArray205[local36];
							local251 = this.anIntArray190[local31] * local235 - this.anIntArray177[local31] * local231 >> 16;
							this.anIntArray177[local31] = this.anIntArray190[local31] * local231 + this.anIntArray177[local31] * local235 >> 16;
							this.anIntArray190[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static35.anIntArray200[local219];
							local235 = Static35.anIntArray205[local219];
							local251 = this.anIntArray177[local31] * local231 + this.anIntArray180[local31] * local235 >> 16;
							this.anIntArray177[local31] = this.anIntArray177[local31] * local235 - this.anIntArray180[local31] * local231 >> 16;
							this.anIntArray180[local31] = local251;
						}
						this.anIntArray180[local31] += Static35.anInt1362;
						this.anIntArray190[local31] += Static35.anInt1360;
						this.anIntArray177[local31] += Static35.anInt1361;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray40.length) {
					local115 = this.anIntArrayArray40[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray180[local31] -= Static35.anInt1362;
						this.anIntArray190[local31] -= Static35.anInt1360;
						this.anIntArray177[local31] -= Static35.anInt1361;
						this.anIntArray180[local31] = this.anIntArray180[local31] * arg2 / 128;
						this.anIntArray190[local31] = this.anIntArray190[local31] * arg3 / 128;
						this.anIntArray177[local31] = this.anIntArray177[local31] * arg4 / 128;
						this.anIntArray180[local31] += Static35.anInt1362;
						this.anIntArray190[local31] += Static35.anInt1360;
						this.anIntArray177[local31] += Static35.anInt1361;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray41 != null && this.anIntArray188 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray41.length) {
					local115 = this.anIntArrayArray41[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray188[local31] += arg2 * 8;
						if (this.anIntArray188[local31] < 0) {
							this.anIntArray188[local31] = 0;
						}
						if (this.anIntArray188[local31] > 255) {
							this.anIntArray188[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)V")
	private void method919(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static97.anInt2641;
		@Pc(3) int local3 = Static97.anInt2645;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray178[arg0];
		@Pc(15) int local15 = this.anIntArray189[arg0];
		@Pc(20) int local20 = this.anIntArray197[arg0];
		@Pc(24) int local24 = Static35.anIntArray198[local10];
		@Pc(28) int local28 = Static35.anIntArray198[local15];
		@Pc(32) int local32 = Static35.anIntArray198[local20];
		if (this.anIntArray188 == null) {
			Static97.anInt2644 = 0;
		} else {
			Static97.anInt2644 = this.anIntArray188[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static35.anIntArray194[0] = Static35.anIntArray206[local10];
			Static35.anIntArray211[0] = Static35.anIntArray207[local10];
			local5++;
			Static35.anIntArray208[0] = this.anIntArray187[arg0];
		} else {
			local71 = Static35.anIntArray214[local10];
			local75 = Static35.anIntArray199[local10];
			local80 = this.anIntArray187[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static35.anIntArray204[local32 - local24];
				Static35.anIntArray194[0] = local1 + (local71 + ((Static35.anIntArray214[local20] - local71) * local93 >> 16) << 9) / 50;
				Static35.anIntArray211[0] = local3 + (local75 + ((Static35.anIntArray199[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static35.anIntArray208[0] = local80 + ((this.anIntArray181[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static35.anIntArray204[local28 - local24];
				Static35.anIntArray194[local5] = local1 + (local71 + ((Static35.anIntArray214[local15] - local71) * local93 >> 16) << 9) / 50;
				Static35.anIntArray211[local5] = local3 + (local75 + ((Static35.anIntArray199[local15] - local75) * local93 >> 16) << 9) / 50;
				Static35.anIntArray208[local5++] = local80 + ((this.anIntArray183[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static35.anIntArray194[local5] = Static35.anIntArray206[local15];
			Static35.anIntArray211[local5] = Static35.anIntArray207[local15];
			Static35.anIntArray208[local5++] = this.anIntArray183[arg0];
		} else {
			local71 = Static35.anIntArray214[local15];
			local75 = Static35.anIntArray199[local15];
			local80 = this.anIntArray183[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static35.anIntArray204[local24 - local28];
				Static35.anIntArray194[local5] = local1 + (local71 + ((Static35.anIntArray214[local10] - local71) * local93 >> 16) << 9) / 50;
				Static35.anIntArray211[local5] = local3 + (local75 + ((Static35.anIntArray199[local10] - local75) * local93 >> 16) << 9) / 50;
				Static35.anIntArray208[local5++] = local80 + ((this.anIntArray187[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static35.anIntArray204[local32 - local28];
				Static35.anIntArray194[local5] = local1 + (local71 + ((Static35.anIntArray214[local20] - local71) * local93 >> 16) << 9) / 50;
				Static35.anIntArray211[local5] = local3 + (local75 + ((Static35.anIntArray199[local20] - local75) * local93 >> 16) << 9) / 50;
				Static35.anIntArray208[local5++] = local80 + ((this.anIntArray181[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static35.anIntArray194[local5] = Static35.anIntArray206[local20];
			Static35.anIntArray211[local5] = Static35.anIntArray207[local20];
			Static35.anIntArray208[local5++] = this.anIntArray181[arg0];
		} else {
			local71 = Static35.anIntArray214[local20];
			local75 = Static35.anIntArray199[local20];
			local80 = this.anIntArray181[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static35.anIntArray204[local28 - local32];
				Static35.anIntArray194[local5] = local1 + (local71 + ((Static35.anIntArray214[local15] - local71) * local93 >> 16) << 9) / 50;
				Static35.anIntArray211[local5] = local3 + (local75 + ((Static35.anIntArray199[local15] - local75) * local93 >> 16) << 9) / 50;
				Static35.anIntArray208[local5++] = local80 + ((this.anIntArray183[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static35.anIntArray204[local24 - local32];
				Static35.anIntArray194[local5] = local1 + (local71 + ((Static35.anIntArray214[local10] - local71) * local93 >> 16) << 9) / 50;
				Static35.anIntArray211[local5] = local3 + (local75 + ((Static35.anIntArray199[local10] - local75) * local93 >> 16) << 9) / 50;
				Static35.anIntArray208[local5++] = local80 + ((this.anIntArray187[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static35.anIntArray194[0];
		local75 = Static35.anIntArray194[1];
		local80 = Static35.anIntArray194[2];
		local93 = Static35.anIntArray211[0];
		@Pc(588) int local588 = Static35.anIntArray211[1];
		@Pc(592) int local592 = Static35.anIntArray211[2];
		Static97.aBoolean137 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static97.anInt2638 || local75 > Static97.anInt2638 || local80 > Static97.anInt2638) {
				Static97.aBoolean137 = true;
			}
			if (this.anIntArray182 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray182[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static97.method1652(local93, local588, local592, local71, local75, local80, Static35.anIntArray208[0], Static35.anIntArray208[1], Static35.anIntArray208[2]);
			} else if (local619 == 1) {
				Static97.method1655(local93, local588, local592, local71, local75, local80, Static35.anIntArray203[this.anIntArray187[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray182[arg0] >> 2;
				local678 = this.anIntArray191[local673];
				local683 = this.anIntArray185[local673];
				local688 = this.anIntArray176[local673];
				Static97.method1659(local93, local588, local592, local71, local75, local80, Static35.anIntArray208[0], Static35.anIntArray208[1], Static35.anIntArray208[2], Static35.anIntArray214[local678], Static35.anIntArray214[local683], Static35.anIntArray214[local688], Static35.anIntArray199[local678], Static35.anIntArray199[local683], Static35.anIntArray199[local688], Static35.anIntArray198[local678], Static35.anIntArray198[local683], Static35.anIntArray198[local688], this.anIntArray179[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray182[arg0] >> 2;
				local678 = this.anIntArray191[local673];
				local683 = this.anIntArray185[local673];
				local688 = this.anIntArray176[local673];
				Static97.method1659(local93, local588, local592, local71, local75, local80, this.anIntArray187[arg0], this.anIntArray187[arg0], this.anIntArray187[arg0], Static35.anIntArray214[local678], Static35.anIntArray214[local683], Static35.anIntArray214[local688], Static35.anIntArray199[local678], Static35.anIntArray199[local683], Static35.anIntArray199[local688], Static35.anIntArray198[local678], Static35.anIntArray198[local683], Static35.anIntArray198[local688], this.anIntArray179[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static97.anInt2638 || local75 > Static97.anInt2638 || local80 > Static97.anInt2638 || Static35.anIntArray194[3] < 0 || Static35.anIntArray194[3] > Static97.anInt2638) {
			Static97.aBoolean137 = true;
		}
		if (this.anIntArray182 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray182[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static97.method1652(local93, local588, local592, local71, local75, local80, Static35.anIntArray208[0], Static35.anIntArray208[1], Static35.anIntArray208[2]);
			Static97.method1652(local93, local592, Static35.anIntArray211[3], local71, local80, Static35.anIntArray194[3], Static35.anIntArray208[0], Static35.anIntArray208[2], Static35.anIntArray208[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static35.anIntArray203[this.anIntArray187[arg0]];
			Static97.method1655(local93, local588, local592, local71, local75, local80, local673);
			Static97.method1655(local93, local592, Static35.anIntArray211[3], local71, local80, Static35.anIntArray194[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray182[arg0] >> 2;
			local678 = this.anIntArray191[local673];
			local683 = this.anIntArray185[local673];
			local688 = this.anIntArray176[local673];
			Static97.method1659(local93, local588, local592, local71, local75, local80, Static35.anIntArray208[0], Static35.anIntArray208[1], Static35.anIntArray208[2], Static35.anIntArray214[local678], Static35.anIntArray214[local683], Static35.anIntArray214[local688], Static35.anIntArray199[local678], Static35.anIntArray199[local683], Static35.anIntArray199[local688], Static35.anIntArray198[local678], Static35.anIntArray198[local683], Static35.anIntArray198[local688], this.anIntArray179[arg0]);
			Static97.method1659(local93, local592, Static35.anIntArray211[3], local71, local80, Static35.anIntArray194[3], Static35.anIntArray208[0], Static35.anIntArray208[2], Static35.anIntArray208[3], Static35.anIntArray214[local678], Static35.anIntArray214[local683], Static35.anIntArray214[local688], Static35.anIntArray199[local678], Static35.anIntArray199[local683], Static35.anIntArray199[local688], Static35.anIntArray198[local678], Static35.anIntArray198[local683], Static35.anIntArray198[local688], this.anIntArray179[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray182[arg0] >> 2;
		local678 = this.anIntArray191[local673];
		local683 = this.anIntArray185[local673];
		local688 = this.anIntArray176[local673];
		Static97.method1659(local93, local588, local592, local71, local75, local80, this.anIntArray187[arg0], this.anIntArray187[arg0], this.anIntArray187[arg0], Static35.anIntArray214[local678], Static35.anIntArray214[local683], Static35.anIntArray214[local688], Static35.anIntArray199[local678], Static35.anIntArray199[local683], Static35.anIntArray199[local688], Static35.anIntArray198[local678], Static35.anIntArray198[local683], Static35.anIntArray198[local688], this.anIntArray179[arg0]);
		Static97.method1659(local93, local592, Static35.anIntArray211[3], local71, local80, Static35.anIntArray194[3], this.anIntArray187[arg0], this.anIntArray187[arg0], this.anIntArray187[arg0], Static35.anIntArray214[local678], Static35.anIntArray214[local683], Static35.anIntArray214[local688], Static35.anIntArray199[local678], Static35.anIntArray199[local683], Static35.anIntArray199[local688], Static35.anIntArray198[local678], Static35.anIntArray198[local683], Static35.anIntArray198[local688], this.anIntArray179[arg0]);
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "()V")
	public void method920() {
		if (this.anInt1351 == 1) {
			return;
		}
		this.anInt1351 = 1;
		super.anInt1974 = 0;
		this.anInt1347 = 0;
		this.anInt1355 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1353; local18++) {
			@Pc(24) int local24 = this.anIntArray180[local18];
			@Pc(29) int local29 = this.anIntArray190[local18];
			@Pc(34) int local34 = this.anIntArray177[local18];
			if (-local29 > super.anInt1974) {
				super.anInt1974 = -local29;
			}
			if (local29 > this.anInt1347) {
				this.anInt1347 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1355) {
				this.anInt1355 = local58;
			}
		}
		this.anInt1355 = (int) (Math.sqrt((double) this.anInt1355) + 0.99D);
		this.anInt1348 = (int) (Math.sqrt((double) (this.anInt1355 * this.anInt1355 + super.anInt1974 * super.anInt1974)) + 0.99D);
		this.anInt1349 = this.anInt1348 + (int) (Math.sqrt((double) (this.anInt1355 * this.anInt1355 + this.anInt1347 * this.anInt1347)) + 0.99D);
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "()I")
	public int method921() {
		this.method920();
		return this.anInt1355;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt1351 != 1) {
			this.method920();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt1355 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt1355 << 9;
		if (local60 / local36 >= Static97.anInt2639) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt1355 << 9;
		if (local73 / local36 <= Static97.anInt2642) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt1355 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static97.anInt2643) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt1974 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static97.anInt2646) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt1974 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt1356 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static35.aBoolean75) {
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
			local215 = Static35.anInt1359 - Static97.anInt2641;
			local219 = Static35.anInt1358 - Static97.anInt2645;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean74) {
					Static35.anIntArray196[Static35.anInt1363++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static97.anInt2641;
		local215 = Static97.anInt2645;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static35.anIntArray200[arg0];
			local253 = Static35.anIntArray205[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt1353; local265++) {
			@Pc(271) int local271 = this.anIntArray180[local265];
			@Pc(276) int local276 = this.anIntArray190[local265];
			@Pc(281) int local281 = this.anIntArray177[local265];
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
			Static35.anIntArray209[local265] = local281 - local25;
			if (local281 >= 50) {
				Static35.anIntArray206[local265] = local168 + (local271 << 9) / local281;
				Static35.anIntArray207[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static35.anIntArray206[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static35.anIntArray214[local265] = local271;
				Static35.anIntArray199[local265] = local293;
				Static35.anIntArray198[local265] = local281;
			}
		}
		try {
			this.method899(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(III)V")
	public void method922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1351 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1353; local4++) {
			this.anIntArray180[local4] += arg0;
			this.anIntArray190[local4] += arg1;
			this.anIntArray177[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
	public void method923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt1351 != 2 && this.anInt1351 != 1) {
			this.method915();
		}
		@Pc(11) int local11 = Static97.anInt2641;
		@Pc(13) int local13 = Static97.anInt2645;
		@Pc(17) int local17 = Static35.anIntArray200[0];
		@Pc(21) int local21 = Static35.anIntArray205[0];
		@Pc(25) int local25 = Static35.anIntArray200[arg0];
		@Pc(29) int local29 = Static35.anIntArray205[arg0];
		@Pc(33) int local33 = Static35.anIntArray200[arg1];
		@Pc(37) int local37 = Static35.anIntArray205[arg1];
		@Pc(41) int local41 = Static35.anIntArray200[arg2];
		@Pc(45) int local45 = Static35.anIntArray205[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt1353; local57++) {
			@Pc(63) int local63 = this.anIntArray180[local57];
			@Pc(68) int local68 = this.anIntArray190[local57];
			@Pc(73) int local73 = this.anIntArray177[local57];
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
			Static35.anIntArray209[local57] = local73 - local55;
			Static35.anIntArray206[local57] = local11 + (local63 << 9) / local73;
			Static35.anIntArray207[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt1356 > 0) {
				Static35.anIntArray214[local57] = local63;
				Static35.anIntArray199[local57] = local85;
				Static35.anIntArray198[local57] = local73;
			}
		}
		try {
			this.method899(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public void method924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1354; local1++) {
			if (this.anIntArray179[local1] == arg0) {
				this.anIntArray179[local1] = arg1;
			}
		}
	}
}
