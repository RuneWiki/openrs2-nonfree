import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class3_Sub1_Sub3_Sub3 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!lb", name = "nc", descriptor = "[I")
	public static int[] anIntArray160 = new int[128];

	@OriginalMember(owner = "client!lb", name = "jb", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!lb", name = "lb", descriptor = "I")
	public int anInt1598;

	@OriginalMember(owner = "client!lb", name = "sb", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!lb", name = "ub", descriptor = "I")
	public int anInt1601;

	@OriginalMember(owner = "client!lb", name = "vb", descriptor = "[Lclient!od;")
	public Class51[] aClass51Array1;

	@OriginalMember(owner = "client!lb", name = "xb", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!lb", name = "zb", descriptor = "[Lclient!od;")
	public Class51[] aClass51Array2;

	@OriginalMember(owner = "client!lb", name = "Ab", descriptor = "I")
	public int anInt1602;

	@OriginalMember(owner = "client!lb", name = "Fb", descriptor = "I")
	public int anInt1603;

	@OriginalMember(owner = "client!lb", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!lb", name = "Ib", descriptor = "I")
	public int anInt1604;

	@OriginalMember(owner = "client!lb", name = "Kb", descriptor = "I")
	private int anInt1605;

	@OriginalMember(owner = "client!lb", name = "Nb", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!lb", name = "Qb", descriptor = "I")
	private int anInt1607;

	@OriginalMember(owner = "client!lb", name = "mb", descriptor = "I")
	public int anInt1599 = 0;

	@OriginalMember(owner = "client!lb", name = "ob", descriptor = "Z")
	public boolean aBoolean85 = false;

	@OriginalMember(owner = "client!lb", name = "tb", descriptor = "I")
	private int anInt1600 = 0;

	@OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
	private int anInt1597 = 0;

	@OriginalMember(owner = "client!lb", name = "Lb", descriptor = "I")
	public int anInt1606 = 0;

	@OriginalMember(owner = "client!lb", name = "gb", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!lb", name = "Cb", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!lb", name = "Eb", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!lb", name = "Db", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!lb", name = "wb", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!lb", name = "nb", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!lb", name = "Pb", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!lb", name = "hb", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!lb", name = "Bb", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!lb", name = "Jb", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!lb", name = "qb", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!lb", name = "pb", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!lb", name = "rb", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!lb", name = "Hb", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!lb", name = "kb", descriptor = "[I")
	private int[] anIntArray129;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray160[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray160[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray160[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray160[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray160[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub3_Sub3(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class3_Sub8 local21 = new Class3_Sub8(arg0);
		@Pc(26) Class3_Sub8 local26 = new Class3_Sub8(arg0);
		@Pc(31) Class3_Sub8 local31 = new Class3_Sub8(arg0);
		@Pc(36) Class3_Sub8 local36 = new Class3_Sub8(arg0);
		@Pc(41) Class3_Sub8 local41 = new Class3_Sub8(arg0);
		local21.anInt2704 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1789();
		@Pc(55) int local55 = local21.method1789();
		@Pc(59) int local59 = local21.method1803();
		@Pc(63) int local63 = local21.method1803();
		@Pc(67) int local67 = local21.method1803();
		@Pc(71) int local71 = local21.method1803();
		@Pc(75) int local75 = local21.method1803();
		@Pc(79) int local79 = local21.method1803();
		@Pc(83) int local83 = local21.method1789();
		@Pc(87) int local87 = local21.method1789();
		@Pc(91) int local91 = local21.method1789();
		@Pc(95) int local95 = local21.method1789();
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
		this.anInt1599 = local51;
		this.anInt1606 = local55;
		this.anInt1597 = local59;
		this.anIntArray126 = new int[local51];
		this.anIntArray137 = new int[local51];
		this.anIntArray139 = new int[local51];
		this.anIntArray138 = new int[local55];
		this.anIntArray135 = new int[local55];
		this.anIntArray130 = new int[local55];
		this.anIntArray144 = new int[local59];
		this.anIntArray127 = new int[local59];
		this.anIntArray136 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray141 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray132 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray131 = new int[local55];
		} else {
			this.anInt1600 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray133 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray140 = new int[local55];
		}
		this.anIntArray129 = new int[local55];
		local21.anInt2704 = local97;
		local26.anInt2704 = local196;
		local31.anInt2704 = local202;
		local36.anInt2704 = local103;
		local41.anInt2704 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1803();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1778();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1778();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1778();
			}
			this.anIntArray126[local321] = local315 + local328;
			this.anIntArray137[local321] = local317 + local338;
			this.anIntArray139[local321] = local319 + local348;
			local315 = this.anIntArray126[local321];
			local317 = this.anIntArray137[local321];
			local319 = this.anIntArray139[local321];
			if (this.anIntArray141 != null) {
				this.anIntArray141[local321] = local41.method1803();
			}
		}
		local21.anInt2704 = local180;
		local26.anInt2704 = local138;
		local31.anInt2704 = local111;
		local36.anInt2704 = local162;
		local41.anInt2704 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray129[local326] = local21.method1789();
			if (this.anIntArray132 != null) {
				this.anIntArray132[local326] = local26.method1803();
			}
			if (this.anIntArray131 != null) {
				this.anIntArray131[local326] = local31.method1803();
			}
			if (this.anIntArray133 != null) {
				this.anIntArray133[local326] = local36.method1803();
			}
			if (this.anIntArray140 != null) {
				this.anIntArray140[local326] = local41.method1803();
			}
		}
		local21.anInt2704 = local174;
		local26.anInt2704 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1803();
			if (local496 == 1) {
				local328 = local21.method1778() + local489;
				local338 = local21.method1778() + local328;
				local348 = local21.method1778() + local338;
				local489 = local348;
				this.anIntArray138[local491] = local328;
				this.anIntArray135[local491] = local338;
				this.anIntArray130[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1778() + local489;
				local489 = local348;
				this.anIntArray138[local491] = local328;
				this.anIntArray135[local491] = local338;
				this.anIntArray130[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1778() + local489;
				local489 = local348;
				this.anIntArray138[local491] = local328;
				this.anIntArray135[local491] = local338;
				this.anIntArray130[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1778() + local489;
				local489 = local348;
				this.anIntArray138[local491] = local328;
				this.anIntArray135[local491] = local599;
				this.anIntArray130[local491] = local348;
			}
		}
		local21.anInt2704 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray144[local496] = local21.method1789();
			this.anIntArray127[local496] = local21.method1789();
			this.anIntArray136[local496] = local21.method1789();
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub3_Sub3() {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([Lclient!lb;I)V")
	public Class3_Sub1_Sub3_Sub3(@OriginalArg(0) Class3_Sub1_Sub3_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1599 = 0;
		this.anInt1606 = 0;
		this.anInt1597 = 0;
		this.anInt1600 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub1_Sub3_Sub3 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1599 += local43.anInt1599;
				this.anInt1606 += local43.anInt1606;
				this.anInt1597 += local43.anInt1597;
				local18 |= local43.anIntArray132 != null;
				if (local43.anIntArray131 == null) {
					if (this.anInt1600 == -1) {
						this.anInt1600 = local43.anInt1600;
					}
					if (this.anInt1600 != local43.anInt1600) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray133 != null;
				local24 |= local43.anIntArray140 != null;
			}
		}
		this.anIntArray126 = new int[this.anInt1599];
		this.anIntArray137 = new int[this.anInt1599];
		this.anIntArray139 = new int[this.anInt1599];
		this.anIntArray141 = new int[this.anInt1599];
		this.anIntArray138 = new int[this.anInt1606];
		this.anIntArray135 = new int[this.anInt1606];
		this.anIntArray130 = new int[this.anInt1606];
		this.anIntArray144 = new int[this.anInt1597];
		this.anIntArray127 = new int[this.anInt1597];
		this.anIntArray136 = new int[this.anInt1597];
		if (local18) {
			this.anIntArray132 = new int[this.anInt1606];
		}
		if (local20) {
			this.anIntArray131 = new int[this.anInt1606];
		}
		if (local22) {
			this.anIntArray133 = new int[this.anInt1606];
		}
		if (local24) {
			this.anIntArray140 = new int[this.anInt1606];
		}
		this.anIntArray129 = new int[this.anInt1606];
		this.anInt1599 = 0;
		this.anInt1606 = 0;
		this.anInt1597 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class3_Sub1_Sub3_Sub3 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt1606; local223++) {
					if (local18) {
						if (local219.anIntArray132 == null) {
							this.anIntArray132[this.anInt1606] = 0;
						} else {
							local241 = local219.anIntArray132[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray132[this.anInt1606] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray131 == null) {
							this.anIntArray131[this.anInt1606] = local219.anInt1600;
						} else {
							this.anIntArray131[this.anInt1606] = local219.anIntArray131[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray133 == null) {
							this.anIntArray133[this.anInt1606] = 0;
						} else {
							this.anIntArray133[this.anInt1606] = local219.anIntArray133[local223];
						}
					}
					if (local24 && local219.anIntArray140 != null) {
						this.anIntArray140[this.anInt1606] = local219.anIntArray140[local223];
					}
					this.anIntArray129[this.anInt1606] = local219.anIntArray129[local223];
					this.anIntArray138[this.anInt1606] = this.method956(local219, local219.anIntArray138[local223]);
					this.anIntArray135[this.anInt1606] = this.method956(local219, local219.anIntArray135[local223]);
					this.anIntArray130[this.anInt1606] = this.method956(local219, local219.anIntArray130[local223]);
					this.anInt1606++;
				}
				for (local241 = 0; local241 < local219.anInt1597; local241++) {
					this.anIntArray144[this.anInt1597] = this.method956(local219, local219.anIntArray144[local241]);
					this.anIntArray127[this.anInt1597] = this.method956(local219, local219.anIntArray127[local241]);
					this.anIntArray136[this.anInt1597] = this.method956(local219, local219.anIntArray136[local241]);
					this.anInt1597++;
				}
				local212 += local219.anInt1597;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([Lclient!lb;IZ)V")
	public Class3_Sub1_Sub3_Sub3(@OriginalArg(0) Class3_Sub1_Sub3_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1599 = 0;
		this.anInt1606 = 0;
		this.anInt1597 = 0;
		this.anInt1600 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub1_Sub3_Sub3 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1599 += local43.anInt1599;
				this.anInt1606 += local43.anInt1606;
				this.anInt1597 += local43.anInt1597;
				local18 |= local43.anIntArray132 != null;
				if (local43.anIntArray131 == null) {
					if (this.anInt1600 == -1) {
						this.anInt1600 = local43.anInt1600;
					}
					if (this.anInt1600 != local43.anInt1600) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray133 != null;
				local24 |= local43.anIntArray129 != null;
			}
		}
		this.anIntArray126 = new int[this.anInt1599];
		this.anIntArray137 = new int[this.anInt1599];
		this.anIntArray139 = new int[this.anInt1599];
		this.anIntArray138 = new int[this.anInt1606];
		this.anIntArray135 = new int[this.anInt1606];
		this.anIntArray130 = new int[this.anInt1606];
		this.anIntArray143 = new int[this.anInt1606];
		this.anIntArray128 = new int[this.anInt1606];
		this.anIntArray134 = new int[this.anInt1606];
		this.anIntArray144 = new int[this.anInt1597];
		this.anIntArray127 = new int[this.anInt1597];
		this.anIntArray136 = new int[this.anInt1597];
		if (local18) {
			this.anIntArray132 = new int[this.anInt1606];
		}
		if (local20) {
			this.anIntArray131 = new int[this.anInt1606];
		}
		if (local22) {
			this.anIntArray133 = new int[this.anInt1606];
		}
		if (local24) {
			this.anIntArray129 = new int[this.anInt1606];
		}
		this.anInt1599 = 0;
		this.anInt1606 = 0;
		this.anInt1597 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class3_Sub1_Sub3_Sub3 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt1599;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt1599; local231++) {
					this.anIntArray126[this.anInt1599] = local224.anIntArray126[local231];
					this.anIntArray137[this.anInt1599] = local224.anIntArray137[local231];
					this.anIntArray139[this.anInt1599] = local224.anIntArray139[local231];
					this.anInt1599++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt1606; local272++) {
					this.anIntArray138[this.anInt1606] = local224.anIntArray138[local272] + local229;
					this.anIntArray135[this.anInt1606] = local224.anIntArray135[local272] + local229;
					this.anIntArray130[this.anInt1606] = local224.anIntArray130[local272] + local229;
					this.anIntArray143[this.anInt1606] = local224.anIntArray143[local272];
					this.anIntArray128[this.anInt1606] = local224.anIntArray128[local272];
					this.anIntArray134[this.anInt1606] = local224.anIntArray134[local272];
					if (local18) {
						if (local224.anIntArray132 == null) {
							this.anIntArray132[this.anInt1606] = 0;
						} else {
							local350 = local224.anIntArray132[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray132[this.anInt1606] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray131 == null) {
							this.anIntArray131[this.anInt1606] = local224.anInt1600;
						} else {
							this.anIntArray131[this.anInt1606] = local224.anIntArray131[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray133 == null) {
							this.anIntArray133[this.anInt1606] = 0;
						} else {
							this.anIntArray133[this.anInt1606] = local224.anIntArray133[local272];
						}
					}
					if (local24 && local224.anIntArray129 != null) {
						this.anIntArray129[this.anInt1606] = local224.anIntArray129[local272];
					}
					this.anInt1606++;
				}
				for (local350 = 0; local350 < local224.anInt1597; local350++) {
					this.anIntArray144[this.anInt1597] = local224.anIntArray144[local350] + local229;
					this.anIntArray127[this.anInt1597] = local224.anIntArray127[local350] + local229;
					this.anIntArray136[this.anInt1597] = local224.anIntArray136[local350] + local229;
					this.anInt1597++;
				}
				local217 += local224.anInt1597;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!lb;ZZZ)V")
	public Class3_Sub1_Sub3_Sub3(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1599 = arg0.anInt1599;
		this.anInt1606 = arg0.anInt1606;
		this.anInt1597 = arg0.anInt1597;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray126 = arg0.anIntArray126;
			this.anIntArray137 = arg0.anIntArray137;
			this.anIntArray139 = arg0.anIntArray139;
		} else {
			this.anIntArray126 = new int[this.anInt1599];
			this.anIntArray137 = new int[this.anInt1599];
			this.anIntArray139 = new int[this.anInt1599];
			for (local60 = 0; local60 < this.anInt1599; local60++) {
				this.anIntArray126[local60] = arg0.anIntArray126[local60];
				this.anIntArray137[local60] = arg0.anIntArray137[local60];
				this.anIntArray139[local60] = arg0.anIntArray139[local60];
			}
		}
		if (arg2) {
			this.anIntArray129 = arg0.anIntArray129;
		} else {
			this.anIntArray129 = new int[this.anInt1606];
			for (local60 = 0; local60 < this.anInt1606; local60++) {
				this.anIntArray129[local60] = arg0.anIntArray129[local60];
			}
		}
		this.anIntArray133 = arg0.anIntArray133;
		this.anIntArray141 = arg0.anIntArray141;
		this.anIntArray140 = arg0.anIntArray140;
		this.anIntArray132 = arg0.anIntArray132;
		this.anIntArray138 = arg0.anIntArray138;
		this.anIntArray135 = arg0.anIntArray135;
		this.anIntArray130 = arg0.anIntArray130;
		this.anIntArray131 = arg0.anIntArray131;
		this.anInt1600 = arg0.anInt1600;
		this.anIntArray144 = arg0.anIntArray144;
		this.anIntArray127 = arg0.anIntArray127;
		this.anIntArray136 = arg0.anIntArray136;
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!lb;ZZ)V")
	public Class3_Sub1_Sub3_Sub3(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt1599 = arg0.anInt1599;
		this.anInt1606 = arg0.anInt1606;
		this.anInt1597 = arg0.anInt1597;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray137 = new int[this.anInt1599];
			for (local37 = 0; local37 < this.anInt1599; local37++) {
				this.anIntArray137[local37] = arg0.anIntArray137[local37];
			}
		} else {
			this.anIntArray137 = arg0.anIntArray137;
		}
		if (arg2) {
			this.anIntArray143 = new int[this.anInt1606];
			this.anIntArray128 = new int[this.anInt1606];
			this.anIntArray134 = new int[this.anInt1606];
			for (local37 = 0; local37 < this.anInt1606; local37++) {
				this.anIntArray143[local37] = arg0.anIntArray143[local37];
				this.anIntArray128[local37] = arg0.anIntArray128[local37];
				this.anIntArray134[local37] = arg0.anIntArray134[local37];
			}
			this.anIntArray132 = new int[this.anInt1606];
			@Pc(115) int local115;
			if (arg0.anIntArray132 == null) {
				for (local115 = 0; local115 < this.anInt1606; local115++) {
					this.anIntArray132[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt1606; local115++) {
					this.anIntArray132[local115] = arg0.anIntArray132[local115];
				}
			}
			this.aClass51Array2 = new Class51[this.anInt1599];
			for (local115 = 0; local115 < this.anInt1599; local115++) {
				@Pc(160) Class51 local160 = this.aClass51Array2[local115] = new Class51();
				@Pc(165) Class51 local165 = arg0.aClass51Array2[local115];
				local160.anInt1970 = local165.anInt1970;
				local160.anInt1978 = local165.anInt1978;
				local160.anInt1979 = local165.anInt1979;
				local160.anInt1971 = local165.anInt1971;
			}
			this.aClass51Array1 = arg0.aClass51Array1;
		} else {
			this.anIntArray143 = arg0.anIntArray143;
			this.anIntArray128 = arg0.anIntArray128;
			this.anIntArray134 = arg0.anIntArray134;
			this.anIntArray132 = arg0.anIntArray132;
		}
		this.anIntArray126 = arg0.anIntArray126;
		this.anIntArray139 = arg0.anIntArray139;
		this.anIntArray129 = arg0.anIntArray129;
		this.anIntArray133 = arg0.anIntArray133;
		this.anIntArray131 = arg0.anIntArray131;
		this.anInt1600 = arg0.anInt1600;
		this.anIntArray138 = arg0.anIntArray138;
		this.anIntArray135 = arg0.anIntArray135;
		this.anIntArray130 = arg0.anIntArray130;
		this.anIntArray144 = arg0.anIntArray144;
		this.anIntArray127 = arg0.anIntArray127;
		this.anIntArray136 = arg0.anIntArray136;
		this.anInt1605 = arg0.anInt1605;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ua;I)V")
	public void method944(@OriginalArg(0) Class3_Sub1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray12 == null || arg1 == -1) {
			return;
		}
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		@Pc(18) Class32 local18 = arg0.aClass32Array1[arg1];
		@Pc(21) Class3_Sub12 local21 = local18.aClass3_Sub12_1;
		Static57.anInt1611 = 0;
		Static57.anInt1608 = 0;
		Static57.anInt1612 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt1221; local29++) {
			@Pc(35) int local35 = local18.anIntArray85[local29];
			this.method946(local21.anIntArray277[local35], local21.anIntArrayArray27[local35], local18.anIntArray92[local29], local18.anIntArray88[local29], local18.anIntArray91[local29]);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	public void method945() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray141 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1599; local9++) {
				local15 = this.anIntArray141[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray12 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray12[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1599) {
				local65 = this.anIntArray141[local59];
				this.anIntArrayArray12[local65][local5[local65]++] = local59++;
			}
			this.anIntArray141 = null;
		}
		if (this.anIntArray140 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1606; local9++) {
			local15 = this.anIntArray140[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray13 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray13[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1606) {
			local65 = this.anIntArray140[local59];
			this.anIntArrayArray13[local65][local5[local65]++] = local59++;
		}
		this.anIntArray140 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[IIII)V")
	private void method946(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static57.anInt1611 = 0;
			Static57.anInt1608 = 0;
			Static57.anInt1612 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray12.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray12[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static57.anInt1611 += this.anIntArray126[local36];
						Static57.anInt1608 += this.anIntArray137[local36];
						Static57.anInt1612 += this.anIntArray139[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static57.anInt1611 = Static57.anInt1611 / local6 + arg2;
				Static57.anInt1608 = Static57.anInt1608 / local6 + arg3;
				Static57.anInt1612 = Static57.anInt1612 / local6 + arg4;
			} else {
				Static57.anInt1611 = arg2;
				Static57.anInt1608 = arg3;
				Static57.anInt1612 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray12.length) {
					local115 = this.anIntArrayArray12[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray126[local31] += arg2;
						this.anIntArray137[local31] += arg3;
						this.anIntArray139[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray12.length) {
					local115 = this.anIntArrayArray12[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray126[local31] -= Static57.anInt1611;
						this.anIntArray137[local31] -= Static57.anInt1608;
						this.anIntArray139[local31] -= Static57.anInt1612;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static57.anIntArray156[local225];
							local235 = Static57.anIntArray161[local225];
							local251 = this.anIntArray137[local31] * local231 + this.anIntArray126[local31] * local235 >> 16;
							this.anIntArray137[local31] = this.anIntArray137[local31] * local235 - this.anIntArray126[local31] * local231 >> 16;
							this.anIntArray126[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static57.anIntArray156[local36];
							local235 = Static57.anIntArray161[local36];
							local251 = this.anIntArray137[local31] * local235 - this.anIntArray139[local31] * local231 >> 16;
							this.anIntArray139[local31] = this.anIntArray137[local31] * local231 + this.anIntArray139[local31] * local235 >> 16;
							this.anIntArray137[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static57.anIntArray156[local219];
							local235 = Static57.anIntArray161[local219];
							local251 = this.anIntArray139[local31] * local231 + this.anIntArray126[local31] * local235 >> 16;
							this.anIntArray139[local31] = this.anIntArray139[local31] * local235 - this.anIntArray126[local31] * local231 >> 16;
							this.anIntArray126[local31] = local251;
						}
						this.anIntArray126[local31] += Static57.anInt1611;
						this.anIntArray137[local31] += Static57.anInt1608;
						this.anIntArray139[local31] += Static57.anInt1612;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray12.length) {
					local115 = this.anIntArrayArray12[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray126[local31] -= Static57.anInt1611;
						this.anIntArray137[local31] -= Static57.anInt1608;
						this.anIntArray139[local31] -= Static57.anInt1612;
						this.anIntArray126[local31] = this.anIntArray126[local31] * arg2 / 128;
						this.anIntArray137[local31] = this.anIntArray137[local31] * arg3 / 128;
						this.anIntArray139[local31] = this.anIntArray139[local31] * arg4 / 128;
						this.anIntArray126[local31] += Static57.anInt1611;
						this.anIntArray137[local31] += Static57.anInt1608;
						this.anIntArray139[local31] += Static57.anInt1612;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray13 != null && this.anIntArray133 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray13.length) {
					local115 = this.anIntArrayArray13[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray133[local31] += arg2 * 8;
						if (this.anIntArray133[local31] < 0) {
							this.anIntArray133[local31] = 0;
						}
						if (this.anIntArray133[local31] > 255) {
							this.anIntArray133[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
	public void method947() {
		if (this.anInt1607 == 3) {
			return;
		}
		this.anInt1607 = 3;
		super.anInt2799 = 0;
		this.anInt1603 = 0;
		this.anInt1602 = 999999;
		this.anInt1598 = -999999;
		this.anInt1601 = -99999;
		this.anInt1604 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1599; local27++) {
			@Pc(33) int local33 = this.anIntArray126[local27];
			@Pc(38) int local38 = this.anIntArray137[local27];
			@Pc(43) int local43 = this.anIntArray139[local27];
			if (local33 < this.anInt1602) {
				this.anInt1602 = local33;
			}
			if (local33 > this.anInt1598) {
				this.anInt1598 = local33;
			}
			if (local43 < this.anInt1604) {
				this.anInt1604 = local43;
			}
			if (local43 > this.anInt1601) {
				this.anInt1601 = local43;
			}
			if (-local38 > super.anInt2799) {
				super.anInt2799 = -local38;
			}
			if (local38 > this.anInt1603) {
				this.anInt1603 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method950(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static57.anIntArray142.length < this.anInt1606) {
			Static57.anIntArray142 = new int[this.anInt1606 + 100];
		}
		return this.method958(arg0, Static57.aClass3_Sub1_Sub3_Sub3_2, Static57.anIntArray142);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method951(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static57.anIntArray152.length < this.anInt1606) {
			Static57.anIntArray152 = new int[this.anInt1606 + 100];
		}
		return this.method958(arg0, Static57.aClass3_Sub1_Sub3_Sub3_3, Static57.anIntArray152);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ua;ILclient!ua;I[I)V")
	public void method952(@OriginalArg(0) Class3_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method944(arg0, arg1);
			return;
		}
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		@Pc(24) Class32 local24 = arg0.aClass32Array1[arg1];
		@Pc(29) Class32 local29 = arg2.aClass32Array1[arg3];
		@Pc(32) Class3_Sub12 local32 = local24.aClass3_Sub12_1;
		Static57.anInt1611 = 0;
		Static57.anInt1608 = 0;
		Static57.anInt1612 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt1221; local47++) {
			local53 = local24.anIntArray85[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray277[local53] == 0) {
				this.method946(local32.anIntArray277[local53], local32.anIntArrayArray27[local53], local24.anIntArray92[local47], local24.anIntArray88[local47], local24.anIntArray91[local47]);
			}
		}
		Static57.anInt1611 = 0;
		Static57.anInt1608 = 0;
		Static57.anInt1612 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt1221; local53++) {
			@Pc(118) int local118 = local29.anIntArray85[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray277[local118] == 0) {
				this.method946(local32.anIntArray277[local118], local32.anIntArrayArray27[local118], local29.anIntArray92[local53], local29.anIntArray88[local53], local29.anIntArray91[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIZ)V")
	public void method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray143 == null) {
			this.anIntArray143 = new int[this.anInt1606];
			this.anIntArray128 = new int[this.anInt1606];
			this.anIntArray134 = new int[this.anInt1606];
		}
		@Pc(48) int local48;
		if (this.aClass51Array2 == null) {
			this.aClass51Array2 = new Class51[this.anInt1599];
			for (local48 = 0; local48 < this.anInt1599; local48++) {
				this.aClass51Array2[local48] = new Class51();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt1606; local48++) {
			local69 = this.anIntArray138[local48];
			@Pc(74) int local74 = this.anIntArray135[local48];
			@Pc(79) int local79 = this.anIntArray130[local48];
			@Pc(89) int local89 = this.anIntArray126[local74] - this.anIntArray126[local69];
			@Pc(99) int local99 = this.anIntArray137[local74] - this.anIntArray137[local69];
			@Pc(109) int local109 = this.anIntArray139[local74] - this.anIntArray139[local69];
			@Pc(119) int local119 = this.anIntArray126[local79] - this.anIntArray126[local69];
			@Pc(129) int local129 = this.anIntArray137[local79] - this.anIntArray137[local69];
			@Pc(139) int local139 = this.anIntArray139[local79] - this.anIntArray139[local69];
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
			if (this.anIntArray132 == null || (this.anIntArray132[local48] & 0x1) == 0) {
				@Pc(246) Class51 local246 = this.aClass51Array2[local69];
				local246.anInt1970 += local147;
				local246.anInt1978 += local155;
				local246.anInt1979 += local163;
				local246.anInt1971++;
				@Pc(275) Class51 local275 = this.aClass51Array2[local74];
				local275.anInt1970 += local147;
				local275.anInt1978 += local155;
				local275.anInt1979 += local163;
				local275.anInt1971++;
				@Pc(304) Class51 local304 = this.aClass51Array2[local79];
				local304.anInt1970 += local147;
				local304.anInt1978 += local155;
				local304.anInt1979 += local163;
				local304.anInt1971++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray143[local48] = Static57.method963(this.anIntArray129[local48], local349, this.anIntArray132[local48]);
			}
		}
		if (arg5) {
			this.method974(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass51Array1 = new Class51[this.anInt1599];
		for (local69 = 0; local69 < this.anInt1599; local69++) {
			@Pc(391) Class51 local391 = this.aClass51Array2[local69];
			@Pc(400) Class51 local400 = this.aClass51Array1[local69] = new Class51();
			local400.anInt1970 = local391.anInt1970;
			local400.anInt1978 = local391.anInt1978;
			local400.anInt1979 = local391.anInt1979;
			local400.anInt1971 = local391.anInt1971;
		}
		this.anInt1605 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V")
	public void method954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt1607 != 2 && this.anInt1607 != 1) {
			this.method959();
		}
		@Pc(11) int local11 = Static66.anInt1795;
		@Pc(13) int local13 = Static66.anInt1799;
		@Pc(17) int local17 = Static57.anIntArray156[0];
		@Pc(21) int local21 = Static57.anIntArray161[0];
		@Pc(25) int local25 = Static57.anIntArray156[arg0];
		@Pc(29) int local29 = Static57.anIntArray161[arg0];
		@Pc(33) int local33 = Static57.anIntArray156[arg1];
		@Pc(37) int local37 = Static57.anIntArray161[arg1];
		@Pc(41) int local41 = Static57.anIntArray156[arg2];
		@Pc(45) int local45 = Static57.anIntArray161[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt1599; local57++) {
			@Pc(63) int local63 = this.anIntArray126[local57];
			@Pc(68) int local68 = this.anIntArray137[local57];
			@Pc(73) int local73 = this.anIntArray139[local57];
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
			Static57.anIntArray157[local57] = local73 - local55;
			Static57.anIntArray164[local57] = local11 + (local63 << 9) / local73;
			Static57.anIntArray163[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt1597 > 0) {
				Static57.anIntArray146[local57] = local63;
				Static57.anIntArray158[local57] = local85;
				Static57.anIntArray150[local57] = local73;
			}
		}
		try {
			this.method962(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt1607 != 1) {
			this.method970();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt1602 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt1602 << 9;
		if (local60 / local36 >= Static66.anInt1796) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt1602 << 9;
		if (local73 / local36 <= Static66.anInt1803) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt1602 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static66.anInt1801) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2799 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static66.anInt1800) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2799 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt1597 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static57.aBoolean86) {
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
			local215 = Static57.anInt1609 - Static66.anInt1795;
			local219 = Static57.anInt1613 - Static66.anInt1799;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean85) {
					Static57.anIntArray149[Static57.anInt1610++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static66.anInt1795;
		local215 = Static66.anInt1799;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static57.anIntArray156[arg0];
			local253 = Static57.anIntArray161[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt1599; local265++) {
			@Pc(271) int local271 = this.anIntArray126[local265];
			@Pc(276) int local276 = this.anIntArray137[local265];
			@Pc(281) int local281 = this.anIntArray139[local265];
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
			Static57.anIntArray157[local265] = local281 - local25;
			if (local281 >= 50) {
				Static57.anIntArray164[local265] = local168 + (local271 << 9) / local281;
				Static57.anIntArray163[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static57.anIntArray164[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static57.anIntArray146[local265] = local271;
				Static57.anIntArray158[local265] = local293;
				Static57.anIntArray150[local265] = local281;
			}
		}
		try {
			this.method962(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!lb;I)I")
	private int method956(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray126[arg1];
		@Pc(11) int local11 = arg0.anIntArray137[arg1];
		@Pc(16) int local16 = arg0.anIntArray139[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1599; local18++) {
			if (local6 == this.anIntArray126[local18] && local11 == this.anIntArray137[local18] && local16 == this.anIntArray139[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray126[this.anInt1599] = local6;
			this.anIntArray137[this.anInt1599] = local11;
			this.anIntArray139[this.anInt1599] = local16;
			if (arg0.anIntArray141 != null) {
				this.anIntArray141[this.anInt1599] = arg0.anIntArray141[arg1];
			}
			local1 = this.anInt1599++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
	public void method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1599; local7++) {
			this.anIntArray126[local7] = this.anIntArray126[local7] * arg0 / 128;
			this.anIntArray137[local7] = this.anIntArray137[local7] * arg1 / 128;
			this.anIntArray139[local7] = this.anIntArray139[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!lb;[I)Lclient!lb;")
	private Class3_Sub1_Sub3_Sub3 method958(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub3_Sub3 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt1599 = this.anInt1599;
		arg1.anInt1606 = this.anInt1606;
		arg1.anInt1597 = this.anInt1597;
		if (arg1.anIntArray126 == null || arg1.anIntArray126.length < this.anInt1599) {
			arg1.anIntArray126 = new int[this.anInt1599 + 100];
			arg1.anIntArray137 = new int[this.anInt1599 + 100];
			arg1.anIntArray139 = new int[this.anInt1599 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1599; local43++) {
			arg1.anIntArray126[local43] = this.anIntArray126[local43];
			arg1.anIntArray137[local43] = this.anIntArray137[local43];
			arg1.anIntArray139[local43] = this.anIntArray139[local43];
		}
		if (arg0) {
			arg1.anIntArray133 = this.anIntArray133;
		} else {
			arg1.anIntArray133 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray133 == null) {
				for (local88 = 0; local88 < this.anInt1606; local88++) {
					arg1.anIntArray133[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1606; local88++) {
					arg1.anIntArray133[local88] = this.anIntArray133[local88];
				}
			}
		}
		arg1.anIntArray132 = this.anIntArray132;
		arg1.anIntArray129 = this.anIntArray129;
		arg1.anIntArray131 = this.anIntArray131;
		arg1.anInt1600 = this.anInt1600;
		arg1.anIntArrayArray13 = this.anIntArrayArray13;
		arg1.anIntArrayArray12 = this.anIntArrayArray12;
		arg1.anIntArray138 = this.anIntArray138;
		arg1.anIntArray135 = this.anIntArray135;
		arg1.anIntArray130 = this.anIntArray130;
		arg1.anIntArray143 = this.anIntArray143;
		arg1.anIntArray128 = this.anIntArray128;
		arg1.anIntArray134 = this.anIntArray134;
		arg1.anIntArray144 = this.anIntArray144;
		arg1.anIntArray127 = this.anIntArray127;
		arg1.anIntArray136 = this.anIntArray136;
		arg1.anInt1607 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()V")
	private void method959() {
		if (this.anInt1607 == 2) {
			return;
		}
		this.anInt1607 = 2;
		this.anInt1602 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1599; local12++) {
			@Pc(18) int local18 = this.anIntArray126[local12];
			@Pc(23) int local23 = this.anIntArray137[local12];
			@Pc(28) int local28 = this.anIntArray139[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1602) {
				this.anInt1602 = local40;
			}
		}
		this.anInt1602 = (int) (Math.sqrt((double) this.anInt1602) + 0.99D);
		this.anInt1601 = this.anInt1602;
		this.anInt1598 = this.anInt1602 + this.anInt1602;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
	public void method960() {
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1599; local7++) {
			@Pc(13) int local13 = this.anIntArray126[local7];
			this.anIntArray126[local7] = this.anIntArray139[local7];
			this.anIntArray139[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()V")
	public void method961() {
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1599; local7++) {
			this.anIntArray139[local7] = -this.anIntArray139[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt1606; local24++) {
			@Pc(30) int local30 = this.anIntArray138[local24];
			this.anIntArray138[local24] = this.anIntArray130[local24];
			this.anIntArray130[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZI)V")
	private void method962(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1598 >= 1500) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1598; local6++) {
			Static57.anIntArray151[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1606; local18++) {
			if (this.anIntArray132 == null || this.anIntArray132[local18] != -1) {
				local33 = this.anIntArray138[local18];
				local38 = this.anIntArray135[local18];
				local43 = this.anIntArray130[local18];
				local47 = Static57.anIntArray164[local33];
				local51 = Static57.anIntArray164[local38];
				local55 = Static57.anIntArray164[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static57.anIntArray146[local33];
					local74 = Static57.anIntArray146[local38];
					@Pc(78) int local78 = Static57.anIntArray146[local43];
					@Pc(82) int local82 = Static57.anIntArray158[local33];
					local86 = Static57.anIntArray158[local38];
					local90 = Static57.anIntArray158[local43];
					@Pc(94) int local94 = Static57.anIntArray150[local33];
					local98 = Static57.anIntArray150[local38];
					@Pc(102) int local102 = Static57.anIntArray150[local43];
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
						Static57.aBooleanArray6[local18] = true;
						@Pc(183) int local183 = (Static57.anIntArray157[local33] + Static57.anIntArray157[local38] + Static57.anIntArray157[local43]) / 3 + this.anInt1601;
						Static57.anIntArrayArray15[local183][Static57.anIntArray151[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method955(Static57.anInt1609, Static57.anInt1613, Static57.anIntArray163[local33], Static57.anIntArray163[local38], Static57.anIntArray163[local43], local47, local51, local55)) {
						Static57.anIntArray149[Static57.anInt1610++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static57.anIntArray163[local43] - Static57.anIntArray163[local38]) - (Static57.anIntArray163[local33] - Static57.anIntArray163[local38]) * (local55 - local51) > 0) {
						Static57.aBooleanArray6[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static66.anInt1797 && local51 <= Static66.anInt1797 && local55 <= Static66.anInt1797) {
							Static57.aBooleanArray7[local18] = false;
						} else {
							Static57.aBooleanArray7[local18] = true;
						}
						local70 = (Static57.anIntArray157[local33] + Static57.anIntArray157[local38] + Static57.anIntArray157[local43]) / 3 + this.anInt1601;
						Static57.anIntArrayArray15[local70][Static57.anIntArray151[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray131 == null) {
			for (local33 = this.anInt1598 - 1; local33 >= 0; local33--) {
				local38 = Static57.anIntArray151[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static57.anIntArrayArray15[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method968(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static57.anIntArray154[local33] = 0;
			Static57.anIntArray155[local33] = 0;
		}
		for (local38 = this.anInt1598 - 1; local38 >= 0; local38--) {
			local43 = Static57.anIntArray151[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static57.anIntArrayArray15[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray131[local55];
					local74 = Static57.anIntArray154[local70]++;
					Static57.anIntArrayArray14[local70][local74] = local55;
					if (local70 < 10) {
						Static57.anIntArray155[local70] += local38;
					} else if (local70 == 10) {
						Static57.anIntArray147[local74] = local38;
					} else {
						Static57.anIntArray153[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static57.anIntArray154[1] > 0 || Static57.anIntArray154[2] > 0) {
			local43 = (Static57.anIntArray155[1] + Static57.anIntArray155[2]) / (Static57.anIntArray154[1] + Static57.anIntArray154[2]);
		}
		local47 = 0;
		if (Static57.anIntArray154[3] > 0 || Static57.anIntArray154[4] > 0) {
			local47 = (Static57.anIntArray155[3] + Static57.anIntArray155[4]) / (Static57.anIntArray154[3] + Static57.anIntArray154[4]);
		}
		local51 = 0;
		if (Static57.anIntArray154[6] > 0 || Static57.anIntArray154[8] > 0) {
			local51 = (Static57.anIntArray155[6] + Static57.anIntArray155[8]) / (Static57.anIntArray154[6] + Static57.anIntArray154[8]);
		}
		local70 = 0;
		local74 = Static57.anIntArray154[10];
		@Pc(524) int[] local524 = Static57.anIntArrayArray14[10];
		@Pc(526) int[] local526 = Static57.anIntArray147;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static57.anIntArray154[11];
			local524 = Static57.anIntArrayArray14[11];
			local526 = Static57.anIntArray153;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method968(local524[local70++]);
				if (local70 == local74 && local524 != Static57.anIntArrayArray14[11]) {
					local70 = 0;
					local74 = Static57.anIntArray154[11];
					local524 = Static57.anIntArrayArray14[11];
					local526 = Static57.anIntArray153;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method968(local524[local70++]);
				if (local70 == local74 && local524 != Static57.anIntArrayArray14[11]) {
					local70 = 0;
					local74 = Static57.anIntArray154[11];
					local524 = Static57.anIntArrayArray14[11];
					local526 = Static57.anIntArray153;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method968(local524[local70++]);
				if (local70 == local74 && local524 != Static57.anIntArrayArray14[11]) {
					local70 = 0;
					local74 = Static57.anIntArray154[11];
					local524 = Static57.anIntArrayArray14[11];
					local526 = Static57.anIntArray153;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static57.anIntArray154[local86];
			@Pc(689) int[] local689 = Static57.anIntArrayArray14[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method968(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method968(local524[local70++]);
			if (local70 == local74 && local524 != Static57.anIntArrayArray14[11]) {
				local70 = 0;
				local524 = Static57.anIntArrayArray14[11];
				local74 = Static57.anIntArray154[11];
				local526 = Static57.anIntArray153;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(III)V")
	public void method964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1607 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1599; local4++) {
			this.anIntArray126[local4] += arg0;
			this.anIntArray137[local4] += arg1;
			this.anIntArray139[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public void method965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1606; local1++) {
			if (this.anIntArray129[local1] == arg0) {
				this.anIntArray129[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()V")
	public void method966() {
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1599; local7++) {
			this.anIntArray126[local7] = -this.anIntArray126[local7];
			this.anIntArray139[local7] = -this.anIntArray139[local7];
		}
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
	public int method967() {
		this.method970();
		return this.anInt1602;
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	private void method968(@OriginalArg(0) int arg0) {
		if (Static57.aBooleanArray6[arg0]) {
			this.method972(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray138[arg0];
		@Pc(17) int local17 = this.anIntArray135[arg0];
		@Pc(22) int local22 = this.anIntArray130[arg0];
		Static66.aBoolean106 = Static57.aBooleanArray7[arg0];
		if (this.anIntArray133 == null) {
			Static66.anInt1802 = 0;
		} else {
			Static66.anInt1802 = this.anIntArray133[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray132 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray132[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static66.method1118(Static57.anIntArray163[local12], Static57.anIntArray163[local17], Static57.anIntArray163[local22], Static57.anIntArray164[local12], Static57.anIntArray164[local17], Static57.anIntArray164[local22], this.anIntArray143[arg0], this.anIntArray128[arg0], this.anIntArray134[arg0]);
		} else if (local42 == 1) {
			Static66.method1128(Static57.anIntArray163[local12], Static57.anIntArray163[local17], Static57.anIntArray163[local22], Static57.anIntArray164[local12], Static57.anIntArray164[local17], Static57.anIntArray164[local22], Static57.anIntArray145[this.anIntArray143[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray132[arg0] >> 2;
				local128 = this.anIntArray144[local123];
				local133 = this.anIntArray127[local123];
				local138 = this.anIntArray136[local123];
				Static66.method1116(Static57.anIntArray163[local12], Static57.anIntArray163[local17], Static57.anIntArray163[local22], Static57.anIntArray164[local12], Static57.anIntArray164[local17], Static57.anIntArray164[local22], this.anIntArray143[arg0], this.anIntArray128[arg0], this.anIntArray134[arg0], Static57.anIntArray146[local128], Static57.anIntArray146[local133], Static57.anIntArray146[local138], Static57.anIntArray158[local128], Static57.anIntArray158[local133], Static57.anIntArray158[local138], Static57.anIntArray150[local128], Static57.anIntArray150[local133], Static57.anIntArray150[local138], this.anIntArray129[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray132[arg0] >> 2;
				local128 = this.anIntArray144[local123];
				local133 = this.anIntArray127[local123];
				local138 = this.anIntArray136[local123];
				Static66.method1116(Static57.anIntArray163[local12], Static57.anIntArray163[local17], Static57.anIntArray163[local22], Static57.anIntArray164[local12], Static57.anIntArray164[local17], Static57.anIntArray164[local22], this.anIntArray143[arg0], this.anIntArray143[arg0], this.anIntArray143[arg0], Static57.anIntArray146[local128], Static57.anIntArray146[local133], Static57.anIntArray146[local138], Static57.anIntArray158[local128], Static57.anIntArray158[local133], Static57.anIntArray158[local138], Static57.anIntArray150[local128], Static57.anIntArray150[local133], Static57.anIntArray150[local138], this.anIntArray129[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(III)V")
	public void method969() {
		@Pc(4) int local4 = this.anInt1605 >> 16;
		@Pc(11) int local11 = this.anInt1605 << 16 >> 16;
		this.method974(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()V")
	public void method970() {
		if (this.anInt1607 == 1) {
			return;
		}
		this.anInt1607 = 1;
		super.anInt2799 = 0;
		this.anInt1603 = 0;
		this.anInt1602 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1599; local18++) {
			@Pc(24) int local24 = this.anIntArray126[local18];
			@Pc(29) int local29 = this.anIntArray137[local18];
			@Pc(34) int local34 = this.anIntArray139[local18];
			if (-local29 > super.anInt2799) {
				super.anInt2799 = -local29;
			}
			if (local29 > this.anInt1603) {
				this.anInt1603 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1602) {
				this.anInt1602 = local58;
			}
		}
		this.anInt1602 = (int) (Math.sqrt((double) this.anInt1602) + 0.99D);
		this.anInt1601 = (int) (Math.sqrt((double) (this.anInt1602 * this.anInt1602 + super.anInt2799 * super.anInt2799)) + 0.99D);
		this.anInt1598 = this.anInt1601 + (int) (Math.sqrt((double) (this.anInt1602 * this.anInt1602 + this.anInt1603 * this.anInt1603)) + 0.99D);
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()V")
	public void method971() {
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1599; local7++) {
			@Pc(13) int local13 = this.anIntArray139[local7];
			this.anIntArray139[local7] = this.anIntArray126[local7];
			this.anIntArray126[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)V")
	private void method972(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static66.anInt1795;
		@Pc(3) int local3 = Static66.anInt1799;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray138[arg0];
		@Pc(15) int local15 = this.anIntArray135[arg0];
		@Pc(20) int local20 = this.anIntArray130[arg0];
		@Pc(24) int local24 = Static57.anIntArray150[local10];
		@Pc(28) int local28 = Static57.anIntArray150[local15];
		@Pc(32) int local32 = Static57.anIntArray150[local20];
		if (this.anIntArray133 == null) {
			Static66.anInt1802 = 0;
		} else {
			Static66.anInt1802 = this.anIntArray133[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static57.anIntArray162[0] = Static57.anIntArray164[local10];
			Static57.anIntArray159[0] = Static57.anIntArray163[local10];
			local5++;
			Static57.anIntArray148[0] = this.anIntArray143[arg0];
		} else {
			local71 = Static57.anIntArray146[local10];
			local75 = Static57.anIntArray158[local10];
			local80 = this.anIntArray143[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static57.anIntArray165[local32 - local24];
				Static57.anIntArray162[0] = local1 + (local71 + ((Static57.anIntArray146[local20] - local71) * local93 >> 16) << 9) / 50;
				Static57.anIntArray159[0] = local3 + (local75 + ((Static57.anIntArray158[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static57.anIntArray148[0] = local80 + ((this.anIntArray134[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static57.anIntArray165[local28 - local24];
				Static57.anIntArray162[local5] = local1 + (local71 + ((Static57.anIntArray146[local15] - local71) * local93 >> 16) << 9) / 50;
				Static57.anIntArray159[local5] = local3 + (local75 + ((Static57.anIntArray158[local15] - local75) * local93 >> 16) << 9) / 50;
				Static57.anIntArray148[local5++] = local80 + ((this.anIntArray128[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static57.anIntArray162[local5] = Static57.anIntArray164[local15];
			Static57.anIntArray159[local5] = Static57.anIntArray163[local15];
			Static57.anIntArray148[local5++] = this.anIntArray128[arg0];
		} else {
			local71 = Static57.anIntArray146[local15];
			local75 = Static57.anIntArray158[local15];
			local80 = this.anIntArray128[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static57.anIntArray165[local24 - local28];
				Static57.anIntArray162[local5] = local1 + (local71 + ((Static57.anIntArray146[local10] - local71) * local93 >> 16) << 9) / 50;
				Static57.anIntArray159[local5] = local3 + (local75 + ((Static57.anIntArray158[local10] - local75) * local93 >> 16) << 9) / 50;
				Static57.anIntArray148[local5++] = local80 + ((this.anIntArray143[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static57.anIntArray165[local32 - local28];
				Static57.anIntArray162[local5] = local1 + (local71 + ((Static57.anIntArray146[local20] - local71) * local93 >> 16) << 9) / 50;
				Static57.anIntArray159[local5] = local3 + (local75 + ((Static57.anIntArray158[local20] - local75) * local93 >> 16) << 9) / 50;
				Static57.anIntArray148[local5++] = local80 + ((this.anIntArray134[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static57.anIntArray162[local5] = Static57.anIntArray164[local20];
			Static57.anIntArray159[local5] = Static57.anIntArray163[local20];
			Static57.anIntArray148[local5++] = this.anIntArray134[arg0];
		} else {
			local71 = Static57.anIntArray146[local20];
			local75 = Static57.anIntArray158[local20];
			local80 = this.anIntArray134[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static57.anIntArray165[local28 - local32];
				Static57.anIntArray162[local5] = local1 + (local71 + ((Static57.anIntArray146[local15] - local71) * local93 >> 16) << 9) / 50;
				Static57.anIntArray159[local5] = local3 + (local75 + ((Static57.anIntArray158[local15] - local75) * local93 >> 16) << 9) / 50;
				Static57.anIntArray148[local5++] = local80 + ((this.anIntArray128[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static57.anIntArray165[local24 - local32];
				Static57.anIntArray162[local5] = local1 + (local71 + ((Static57.anIntArray146[local10] - local71) * local93 >> 16) << 9) / 50;
				Static57.anIntArray159[local5] = local3 + (local75 + ((Static57.anIntArray158[local10] - local75) * local93 >> 16) << 9) / 50;
				Static57.anIntArray148[local5++] = local80 + ((this.anIntArray143[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static57.anIntArray162[0];
		local75 = Static57.anIntArray162[1];
		local80 = Static57.anIntArray162[2];
		local93 = Static57.anIntArray159[0];
		@Pc(588) int local588 = Static57.anIntArray159[1];
		@Pc(592) int local592 = Static57.anIntArray159[2];
		Static66.aBoolean106 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static66.anInt1797 || local75 > Static66.anInt1797 || local80 > Static66.anInt1797) {
				Static66.aBoolean106 = true;
			}
			if (this.anIntArray132 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray132[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static66.method1118(local93, local588, local592, local71, local75, local80, Static57.anIntArray148[0], Static57.anIntArray148[1], Static57.anIntArray148[2]);
			} else if (local619 == 1) {
				Static66.method1128(local93, local588, local592, local71, local75, local80, Static57.anIntArray145[this.anIntArray143[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray132[arg0] >> 2;
				local678 = this.anIntArray144[local673];
				local683 = this.anIntArray127[local673];
				local688 = this.anIntArray136[local673];
				Static66.method1116(local93, local588, local592, local71, local75, local80, Static57.anIntArray148[0], Static57.anIntArray148[1], Static57.anIntArray148[2], Static57.anIntArray146[local678], Static57.anIntArray146[local683], Static57.anIntArray146[local688], Static57.anIntArray158[local678], Static57.anIntArray158[local683], Static57.anIntArray158[local688], Static57.anIntArray150[local678], Static57.anIntArray150[local683], Static57.anIntArray150[local688], this.anIntArray129[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray132[arg0] >> 2;
				local678 = this.anIntArray144[local673];
				local683 = this.anIntArray127[local673];
				local688 = this.anIntArray136[local673];
				Static66.method1116(local93, local588, local592, local71, local75, local80, this.anIntArray143[arg0], this.anIntArray143[arg0], this.anIntArray143[arg0], Static57.anIntArray146[local678], Static57.anIntArray146[local683], Static57.anIntArray146[local688], Static57.anIntArray158[local678], Static57.anIntArray158[local683], Static57.anIntArray158[local688], Static57.anIntArray150[local678], Static57.anIntArray150[local683], Static57.anIntArray150[local688], this.anIntArray129[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static66.anInt1797 || local75 > Static66.anInt1797 || local80 > Static66.anInt1797 || Static57.anIntArray162[3] < 0 || Static57.anIntArray162[3] > Static66.anInt1797) {
			Static66.aBoolean106 = true;
		}
		if (this.anIntArray132 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray132[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static66.method1118(local93, local588, local592, local71, local75, local80, Static57.anIntArray148[0], Static57.anIntArray148[1], Static57.anIntArray148[2]);
			Static66.method1118(local93, local592, Static57.anIntArray159[3], local71, local80, Static57.anIntArray162[3], Static57.anIntArray148[0], Static57.anIntArray148[2], Static57.anIntArray148[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static57.anIntArray145[this.anIntArray143[arg0]];
			Static66.method1128(local93, local588, local592, local71, local75, local80, local673);
			Static66.method1128(local93, local592, Static57.anIntArray159[3], local71, local80, Static57.anIntArray162[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray132[arg0] >> 2;
			local678 = this.anIntArray144[local673];
			local683 = this.anIntArray127[local673];
			local688 = this.anIntArray136[local673];
			Static66.method1116(local93, local588, local592, local71, local75, local80, Static57.anIntArray148[0], Static57.anIntArray148[1], Static57.anIntArray148[2], Static57.anIntArray146[local678], Static57.anIntArray146[local683], Static57.anIntArray146[local688], Static57.anIntArray158[local678], Static57.anIntArray158[local683], Static57.anIntArray158[local688], Static57.anIntArray150[local678], Static57.anIntArray150[local683], Static57.anIntArray150[local688], this.anIntArray129[arg0]);
			Static66.method1116(local93, local592, Static57.anIntArray159[3], local71, local80, Static57.anIntArray162[3], Static57.anIntArray148[0], Static57.anIntArray148[2], Static57.anIntArray148[3], Static57.anIntArray146[local678], Static57.anIntArray146[local683], Static57.anIntArray146[local688], Static57.anIntArray158[local678], Static57.anIntArray158[local683], Static57.anIntArray158[local688], Static57.anIntArray150[local678], Static57.anIntArray150[local683], Static57.anIntArray150[local688], this.anIntArray129[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray132[arg0] >> 2;
		local678 = this.anIntArray144[local673];
		local683 = this.anIntArray127[local673];
		local688 = this.anIntArray136[local673];
		Static66.method1116(local93, local588, local592, local71, local75, local80, this.anIntArray143[arg0], this.anIntArray143[arg0], this.anIntArray143[arg0], Static57.anIntArray146[local678], Static57.anIntArray146[local683], Static57.anIntArray146[local688], Static57.anIntArray158[local678], Static57.anIntArray158[local683], Static57.anIntArray158[local688], Static57.anIntArray150[local678], Static57.anIntArray150[local683], Static57.anIntArray150[local688], this.anIntArray129[arg0]);
		Static66.method1116(local93, local592, Static57.anIntArray159[3], local71, local80, Static57.anIntArray162[3], this.anIntArray143[arg0], this.anIntArray143[arg0], this.anIntArray143[arg0], Static57.anIntArray146[local678], Static57.anIntArray146[local683], Static57.anIntArray146[local688], Static57.anIntArray158[local678], Static57.anIntArray158[local683], Static57.anIntArray158[local688], Static57.anIntArray150[local678], Static57.anIntArray150[local683], Static57.anIntArray150[local688], this.anIntArray129[arg0]);
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "(I)V")
	public void method973(@OriginalArg(0) int arg0) {
		this.aClass51Array2 = null;
		this.anInt1607 = 0;
		@Pc(9) int local9 = Static57.anIntArray156[arg0];
		@Pc(13) int local13 = Static57.anIntArray161[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1599; local15++) {
			@Pc(32) int local32 = this.anIntArray137[local15] * local13 - this.anIntArray139[local15] * local9 >> 16;
			this.anIntArray139[local15] = this.anIntArray137[local15] * local9 + this.anIntArray139[local15] * local13 >> 16;
			this.anIntArray137[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	private void method974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1606; local1++) {
			local7 = this.anIntArray138[local1];
			@Pc(12) int local12 = this.anIntArray135[local1];
			@Pc(17) int local17 = this.anIntArray130[local1];
			@Pc(30) Class51 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray132 == null) {
				local25 = this.anIntArray129[local1];
				local30 = this.aClass51Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt1970 + arg3 * local30.anInt1978 + arg4 * local30.anInt1979) / (arg1 * local30.anInt1971);
				this.anIntArray143[local1] = Static57.method963(local25, local52, 0);
				@Pc(65) Class51 local65 = this.aClass51Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt1970 + arg3 * local65.anInt1978 + arg4 * local65.anInt1979) / (arg1 * local65.anInt1971);
				this.anIntArray128[local1] = Static57.method963(local25, local87, 0);
				@Pc(100) Class51 local100 = this.aClass51Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt1970 + arg3 * local100.anInt1978 + arg4 * local100.anInt1979) / (arg1 * local100.anInt1971);
				this.anIntArray134[local1] = Static57.method963(local25, local122, 0);
			} else if ((this.anIntArray132[local1] & 0x1) == 0) {
				local25 = this.anIntArray129[local1];
				@Pc(148) int local148 = this.anIntArray132[local1];
				local30 = this.aClass51Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt1970 + arg3 * local30.anInt1978 + arg4 * local30.anInt1979) / (arg1 * local30.anInt1971);
				this.anIntArray143[local1] = Static57.method963(local25, local52, local148);
				local30 = this.aClass51Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt1970 + arg3 * local30.anInt1978 + arg4 * local30.anInt1979) / (arg1 * local30.anInt1971);
				this.anIntArray128[local1] = Static57.method963(local25, local52, local148);
				local30 = this.aClass51Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt1970 + arg3 * local30.anInt1978 + arg4 * local30.anInt1979) / (arg1 * local30.anInt1971);
				this.anIntArray134[local1] = Static57.method963(local25, local52, local148);
			}
		}
		this.aClass51Array2 = null;
		this.aClass51Array1 = null;
		this.anIntArray141 = null;
		this.anIntArray140 = null;
		if (this.anIntArray132 != null) {
			for (local7 = 0; local7 < this.anInt1606; local7++) {
				if ((this.anIntArray132[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray129 = null;
	}
}
