import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class3_Sub1_Sub1_Sub4 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!hc", name = "ec", descriptor = "[I")
	public static int[] anIntArray135 = new int[128];

	@OriginalMember(owner = "client!hc", name = "tb", descriptor = "I")
	public int anInt1108;

	@OriginalMember(owner = "client!hc", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!hc", name = "yb", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!hc", name = "zb", descriptor = "I")
	public int anInt1109;

	@OriginalMember(owner = "client!hc", name = "Db", descriptor = "I")
	public int anInt1110;

	@OriginalMember(owner = "client!hc", name = "Fb", descriptor = "I")
	private int anInt1111;

	@OriginalMember(owner = "client!hc", name = "Gb", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!hc", name = "Jb", descriptor = "[Lclient!a;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!hc", name = "Kb", descriptor = "I")
	public int anInt1112;

	@OriginalMember(owner = "client!hc", name = "Lb", descriptor = "I")
	private int anInt1113;

	@OriginalMember(owner = "client!hc", name = "Pb", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!hc", name = "Qb", descriptor = "[Lclient!a;")
	public Class1[] aClass1Array2;

	@OriginalMember(owner = "client!hc", name = "Ub", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!hc", name = "Zb", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!hc", name = "Nb", descriptor = "I")
	public int anInt1115 = 0;

	@OriginalMember(owner = "client!hc", name = "wb", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!hc", name = "Yb", descriptor = "I")
	private int anInt1117 = 0;

	@OriginalMember(owner = "client!hc", name = "Sb", descriptor = "I")
	public int anInt1116 = 0;

	@OriginalMember(owner = "client!hc", name = "Mb", descriptor = "I")
	private int anInt1114 = 0;

	@OriginalMember(owner = "client!hc", name = "Vb", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!hc", name = "Tb", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!hc", name = "Wb", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!hc", name = "cc", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!hc", name = "Eb", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!hc", name = "xb", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!hc", name = "Ib", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!hc", name = "vb", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!hc", name = "Ab", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!hc", name = "bc", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!hc", name = "Bb", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!hc", name = "Cb", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!hc", name = "Ob", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!hc", name = "Hb", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!hc", name = "Xb", descriptor = "[I")
	private int[] anIntArray131;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray135[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray135[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray135[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray135[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray135[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class3_Sub4 local21 = new Class3_Sub4(arg0);
		@Pc(26) Class3_Sub4 local26 = new Class3_Sub4(arg0);
		@Pc(31) Class3_Sub4 local31 = new Class3_Sub4(arg0);
		@Pc(36) Class3_Sub4 local36 = new Class3_Sub4(arg0);
		@Pc(41) Class3_Sub4 local41 = new Class3_Sub4(arg0);
		local21.anInt627 = arg0.length - 18;
		@Pc(51) int local51 = local21.method459();
		@Pc(55) int local55 = local21.method459();
		@Pc(59) int local59 = local21.method446();
		@Pc(63) int local63 = local21.method446();
		@Pc(67) int local67 = local21.method446();
		@Pc(71) int local71 = local21.method446();
		@Pc(75) int local75 = local21.method446();
		@Pc(79) int local79 = local21.method446();
		@Pc(83) int local83 = local21.method459();
		@Pc(87) int local87 = local21.method459();
		@Pc(91) int local91 = local21.method459();
		@Pc(95) int local95 = local21.method459();
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
		this.anInt1115 = local51;
		this.anInt1116 = local55;
		this.anInt1117 = local59;
		this.anIntArray129 = new int[local51];
		this.anIntArray127 = new int[local51];
		this.anIntArray130 = new int[local51];
		this.anIntArray133 = new int[local55];
		this.anIntArray121 = new int[local55];
		this.anIntArray117 = new int[local55];
		this.anIntArray124 = new int[local59];
		this.anIntArray116 = new int[local59];
		this.anIntArray118 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray132 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray119 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray120 = new int[local55];
		} else {
			this.anInt1114 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray125 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray123 = new int[local55];
		}
		this.anIntArray131 = new int[local55];
		local21.anInt627 = local97;
		local26.anInt627 = local196;
		local31.anInt627 = local202;
		local36.anInt627 = local103;
		local41.anInt627 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method446();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method436();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method436();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method436();
			}
			this.anIntArray129[local321] = local315 + local328;
			this.anIntArray127[local321] = local317 + local338;
			this.anIntArray130[local321] = local319 + local348;
			local315 = this.anIntArray129[local321];
			local317 = this.anIntArray127[local321];
			local319 = this.anIntArray130[local321];
			if (this.anIntArray132 != null) {
				this.anIntArray132[local321] = local41.method446();
			}
		}
		local21.anInt627 = local180;
		local26.anInt627 = local138;
		local31.anInt627 = local111;
		local36.anInt627 = local162;
		local41.anInt627 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray131[local326] = local21.method459();
			if (this.anIntArray119 != null) {
				this.anIntArray119[local326] = local26.method446();
			}
			if (this.anIntArray120 != null) {
				this.anIntArray120[local326] = local31.method446();
			}
			if (this.anIntArray125 != null) {
				this.anIntArray125[local326] = local36.method446();
			}
			if (this.anIntArray123 != null) {
				this.anIntArray123[local326] = local41.method446();
			}
		}
		local21.anInt627 = local174;
		local26.anInt627 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method446();
			if (local496 == 1) {
				local328 = local21.method436() + local489;
				local338 = local21.method436() + local328;
				local348 = local21.method436() + local338;
				local489 = local348;
				this.anIntArray133[local491] = local328;
				this.anIntArray121[local491] = local338;
				this.anIntArray117[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method436() + local489;
				local489 = local348;
				this.anIntArray133[local491] = local328;
				this.anIntArray121[local491] = local338;
				this.anIntArray117[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method436() + local489;
				local489 = local348;
				this.anIntArray133[local491] = local328;
				this.anIntArray121[local491] = local338;
				this.anIntArray117[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method436() + local489;
				local489 = local348;
				this.anIntArray133[local491] = local328;
				this.anIntArray121[local491] = local599;
				this.anIntArray117[local491] = local348;
			}
		}
		local21.anInt627 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray124[local496] = local21.method459();
			this.anIntArray116[local496] = local21.method459();
			this.anIntArray118[local496] = local21.method459();
		}
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1_Sub4() {
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([Lclient!hc;I)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) Class3_Sub1_Sub1_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1115 = 0;
		this.anInt1116 = 0;
		this.anInt1117 = 0;
		this.anInt1114 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub1_Sub1_Sub4 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1115 += local43.anInt1115;
				this.anInt1116 += local43.anInt1116;
				this.anInt1117 += local43.anInt1117;
				local18 |= local43.anIntArray119 != null;
				if (local43.anIntArray120 == null) {
					if (this.anInt1114 == -1) {
						this.anInt1114 = local43.anInt1114;
					}
					if (this.anInt1114 != local43.anInt1114) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray125 != null;
				local24 |= local43.anIntArray123 != null;
			}
		}
		this.anIntArray129 = new int[this.anInt1115];
		this.anIntArray127 = new int[this.anInt1115];
		this.anIntArray130 = new int[this.anInt1115];
		this.anIntArray132 = new int[this.anInt1115];
		this.anIntArray133 = new int[this.anInt1116];
		this.anIntArray121 = new int[this.anInt1116];
		this.anIntArray117 = new int[this.anInt1116];
		this.anIntArray124 = new int[this.anInt1117];
		this.anIntArray116 = new int[this.anInt1117];
		this.anIntArray118 = new int[this.anInt1117];
		if (local18) {
			this.anIntArray119 = new int[this.anInt1116];
		}
		if (local20) {
			this.anIntArray120 = new int[this.anInt1116];
		}
		if (local22) {
			this.anIntArray125 = new int[this.anInt1116];
		}
		if (local24) {
			this.anIntArray123 = new int[this.anInt1116];
		}
		this.anIntArray131 = new int[this.anInt1116];
		this.anInt1115 = 0;
		this.anInt1116 = 0;
		this.anInt1117 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class3_Sub1_Sub1_Sub4 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt1116; local223++) {
					if (local18) {
						if (local219.anIntArray119 == null) {
							this.anIntArray119[this.anInt1116] = 0;
						} else {
							local241 = local219.anIntArray119[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray119[this.anInt1116] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray120 == null) {
							this.anIntArray120[this.anInt1116] = local219.anInt1114;
						} else {
							this.anIntArray120[this.anInt1116] = local219.anIntArray120[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray125 == null) {
							this.anIntArray125[this.anInt1116] = 0;
						} else {
							this.anIntArray125[this.anInt1116] = local219.anIntArray125[local223];
						}
					}
					if (local24 && local219.anIntArray123 != null) {
						this.anIntArray123[this.anInt1116] = local219.anIntArray123[local223];
					}
					this.anIntArray131[this.anInt1116] = local219.anIntArray131[local223];
					this.anIntArray133[this.anInt1116] = this.method773(local219, local219.anIntArray133[local223]);
					this.anIntArray121[this.anInt1116] = this.method773(local219, local219.anIntArray121[local223]);
					this.anIntArray117[this.anInt1116] = this.method773(local219, local219.anIntArray117[local223]);
					this.anInt1116++;
				}
				for (local241 = 0; local241 < local219.anInt1117; local241++) {
					this.anIntArray124[this.anInt1117] = this.method773(local219, local219.anIntArray124[local241]);
					this.anIntArray116[this.anInt1117] = this.method773(local219, local219.anIntArray116[local241]);
					this.anIntArray118[this.anInt1117] = this.method773(local219, local219.anIntArray118[local241]);
					this.anInt1117++;
				}
				local212 += local219.anInt1117;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([Lclient!hc;IZ)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) Class3_Sub1_Sub1_Sub4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1115 = 0;
		this.anInt1116 = 0;
		this.anInt1117 = 0;
		this.anInt1114 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub1_Sub1_Sub4 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1115 += local43.anInt1115;
				this.anInt1116 += local43.anInt1116;
				this.anInt1117 += local43.anInt1117;
				local18 |= local43.anIntArray119 != null;
				if (local43.anIntArray120 == null) {
					if (this.anInt1114 == -1) {
						this.anInt1114 = local43.anInt1114;
					}
					if (this.anInt1114 != local43.anInt1114) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray125 != null;
				local24 |= local43.anIntArray131 != null;
			}
		}
		this.anIntArray129 = new int[this.anInt1115];
		this.anIntArray127 = new int[this.anInt1115];
		this.anIntArray130 = new int[this.anInt1115];
		this.anIntArray133 = new int[this.anInt1116];
		this.anIntArray121 = new int[this.anInt1116];
		this.anIntArray117 = new int[this.anInt1116];
		this.anIntArray122 = new int[this.anInt1116];
		this.anIntArray126 = new int[this.anInt1116];
		this.anIntArray128 = new int[this.anInt1116];
		this.anIntArray124 = new int[this.anInt1117];
		this.anIntArray116 = new int[this.anInt1117];
		this.anIntArray118 = new int[this.anInt1117];
		if (local18) {
			this.anIntArray119 = new int[this.anInt1116];
		}
		if (local20) {
			this.anIntArray120 = new int[this.anInt1116];
		}
		if (local22) {
			this.anIntArray125 = new int[this.anInt1116];
		}
		if (local24) {
			this.anIntArray131 = new int[this.anInt1116];
		}
		this.anInt1115 = 0;
		this.anInt1116 = 0;
		this.anInt1117 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class3_Sub1_Sub1_Sub4 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt1115;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt1115; local231++) {
					this.anIntArray129[this.anInt1115] = local224.anIntArray129[local231];
					this.anIntArray127[this.anInt1115] = local224.anIntArray127[local231];
					this.anIntArray130[this.anInt1115] = local224.anIntArray130[local231];
					this.anInt1115++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt1116; local272++) {
					this.anIntArray133[this.anInt1116] = local224.anIntArray133[local272] + local229;
					this.anIntArray121[this.anInt1116] = local224.anIntArray121[local272] + local229;
					this.anIntArray117[this.anInt1116] = local224.anIntArray117[local272] + local229;
					this.anIntArray122[this.anInt1116] = local224.anIntArray122[local272];
					this.anIntArray126[this.anInt1116] = local224.anIntArray126[local272];
					this.anIntArray128[this.anInt1116] = local224.anIntArray128[local272];
					if (local18) {
						if (local224.anIntArray119 == null) {
							this.anIntArray119[this.anInt1116] = 0;
						} else {
							local350 = local224.anIntArray119[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray119[this.anInt1116] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray120 == null) {
							this.anIntArray120[this.anInt1116] = local224.anInt1114;
						} else {
							this.anIntArray120[this.anInt1116] = local224.anIntArray120[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray125 == null) {
							this.anIntArray125[this.anInt1116] = 0;
						} else {
							this.anIntArray125[this.anInt1116] = local224.anIntArray125[local272];
						}
					}
					if (local24 && local224.anIntArray131 != null) {
						this.anIntArray131[this.anInt1116] = local224.anIntArray131[local272];
					}
					this.anInt1116++;
				}
				for (local350 = 0; local350 < local224.anInt1117; local350++) {
					this.anIntArray124[this.anInt1117] = local224.anIntArray124[local350] + local229;
					this.anIntArray116[this.anInt1117] = local224.anIntArray116[local350] + local229;
					this.anIntArray118[this.anInt1117] = local224.anIntArray118[local350] + local229;
					this.anInt1117++;
				}
				local217 += local224.anInt1117;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!hc;ZZZ)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1115 = arg0.anInt1115;
		this.anInt1116 = arg0.anInt1116;
		this.anInt1117 = arg0.anInt1117;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray129 = arg0.anIntArray129;
			this.anIntArray127 = arg0.anIntArray127;
			this.anIntArray130 = arg0.anIntArray130;
		} else {
			this.anIntArray129 = new int[this.anInt1115];
			this.anIntArray127 = new int[this.anInt1115];
			this.anIntArray130 = new int[this.anInt1115];
			for (local60 = 0; local60 < this.anInt1115; local60++) {
				this.anIntArray129[local60] = arg0.anIntArray129[local60];
				this.anIntArray127[local60] = arg0.anIntArray127[local60];
				this.anIntArray130[local60] = arg0.anIntArray130[local60];
			}
		}
		if (arg2) {
			this.anIntArray131 = arg0.anIntArray131;
		} else {
			this.anIntArray131 = new int[this.anInt1116];
			for (local60 = 0; local60 < this.anInt1116; local60++) {
				this.anIntArray131[local60] = arg0.anIntArray131[local60];
			}
		}
		this.anIntArray125 = arg0.anIntArray125;
		this.anIntArray132 = arg0.anIntArray132;
		this.anIntArray123 = arg0.anIntArray123;
		this.anIntArray119 = arg0.anIntArray119;
		this.anIntArray133 = arg0.anIntArray133;
		this.anIntArray121 = arg0.anIntArray121;
		this.anIntArray117 = arg0.anIntArray117;
		this.anIntArray120 = arg0.anIntArray120;
		this.anInt1114 = arg0.anInt1114;
		this.anIntArray124 = arg0.anIntArray124;
		this.anIntArray116 = arg0.anIntArray116;
		this.anIntArray118 = arg0.anIntArray118;
		this.aBoolean78 = arg0.aBoolean78;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!hc;ZZ)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt1115 = arg0.anInt1115;
		this.anInt1116 = arg0.anInt1116;
		this.anInt1117 = arg0.anInt1117;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray127 = new int[this.anInt1115];
			for (local37 = 0; local37 < this.anInt1115; local37++) {
				this.anIntArray127[local37] = arg0.anIntArray127[local37];
			}
		} else {
			this.anIntArray127 = arg0.anIntArray127;
		}
		if (arg2) {
			this.anIntArray122 = new int[this.anInt1116];
			this.anIntArray126 = new int[this.anInt1116];
			this.anIntArray128 = new int[this.anInt1116];
			for (local37 = 0; local37 < this.anInt1116; local37++) {
				this.anIntArray122[local37] = arg0.anIntArray122[local37];
				this.anIntArray126[local37] = arg0.anIntArray126[local37];
				this.anIntArray128[local37] = arg0.anIntArray128[local37];
			}
			this.anIntArray119 = new int[this.anInt1116];
			@Pc(115) int local115;
			if (arg0.anIntArray119 == null) {
				for (local115 = 0; local115 < this.anInt1116; local115++) {
					this.anIntArray119[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt1116; local115++) {
					this.anIntArray119[local115] = arg0.anIntArray119[local115];
				}
			}
			this.aClass1Array2 = new Class1[this.anInt1115];
			for (local115 = 0; local115 < this.anInt1115; local115++) {
				@Pc(160) Class1 local160 = this.aClass1Array2[local115] = new Class1();
				@Pc(165) Class1 local165 = arg0.aClass1Array2[local115];
				local160.anInt6 = local165.anInt6;
				local160.anInt9 = local165.anInt9;
				local160.anInt7 = local165.anInt7;
				local160.anInt5 = local165.anInt5;
			}
			this.aClass1Array1 = arg0.aClass1Array1;
		} else {
			this.anIntArray122 = arg0.anIntArray122;
			this.anIntArray126 = arg0.anIntArray126;
			this.anIntArray128 = arg0.anIntArray128;
			this.anIntArray119 = arg0.anIntArray119;
		}
		this.anIntArray129 = arg0.anIntArray129;
		this.anIntArray130 = arg0.anIntArray130;
		this.anIntArray131 = arg0.anIntArray131;
		this.anIntArray125 = arg0.anIntArray125;
		this.anIntArray120 = arg0.anIntArray120;
		this.anInt1114 = arg0.anInt1114;
		this.anIntArray133 = arg0.anIntArray133;
		this.anIntArray121 = arg0.anIntArray121;
		this.anIntArray117 = arg0.anIntArray117;
		this.anIntArray124 = arg0.anIntArray124;
		this.anIntArray116 = arg0.anIntArray116;
		this.anIntArray118 = arg0.anIntArray118;
		this.aBoolean78 = arg0.aBoolean78;
		this.anInt1111 = arg0.anInt1111;
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
	private void method761(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static99.anInt2402;
		@Pc(3) int local3 = Static99.anInt2403;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray133[arg0];
		@Pc(15) int local15 = this.anIntArray121[arg0];
		@Pc(20) int local20 = this.anIntArray117[arg0];
		@Pc(24) int local24 = Static41.anIntArray148[local10];
		@Pc(28) int local28 = Static41.anIntArray148[local15];
		@Pc(32) int local32 = Static41.anIntArray148[local20];
		if (this.anIntArray125 == null) {
			Static99.anInt2395 = 0;
		} else {
			Static99.anInt2395 = this.anIntArray125[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static41.anIntArray146[0] = Static41.anIntArray136[local10];
			Static41.anIntArray153[0] = Static41.anIntArray140[local10];
			local5++;
			Static41.anIntArray143[0] = this.anIntArray122[arg0];
		} else {
			local71 = Static41.anIntArray147[local10];
			local75 = Static41.anIntArray144[local10];
			local80 = this.anIntArray122[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static41.anIntArray138[local32 - local24];
				Static41.anIntArray146[0] = local1 + (local71 + ((Static41.anIntArray147[local20] - local71) * local93 >> 16) << 9) / 50;
				Static41.anIntArray153[0] = local3 + (local75 + ((Static41.anIntArray144[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static41.anIntArray143[0] = local80 + ((this.anIntArray128[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static41.anIntArray138[local28 - local24];
				Static41.anIntArray146[local5] = local1 + (local71 + ((Static41.anIntArray147[local15] - local71) * local93 >> 16) << 9) / 50;
				Static41.anIntArray153[local5] = local3 + (local75 + ((Static41.anIntArray144[local15] - local75) * local93 >> 16) << 9) / 50;
				Static41.anIntArray143[local5++] = local80 + ((this.anIntArray126[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static41.anIntArray146[local5] = Static41.anIntArray136[local15];
			Static41.anIntArray153[local5] = Static41.anIntArray140[local15];
			Static41.anIntArray143[local5++] = this.anIntArray126[arg0];
		} else {
			local71 = Static41.anIntArray147[local15];
			local75 = Static41.anIntArray144[local15];
			local80 = this.anIntArray126[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static41.anIntArray138[local24 - local28];
				Static41.anIntArray146[local5] = local1 + (local71 + ((Static41.anIntArray147[local10] - local71) * local93 >> 16) << 9) / 50;
				Static41.anIntArray153[local5] = local3 + (local75 + ((Static41.anIntArray144[local10] - local75) * local93 >> 16) << 9) / 50;
				Static41.anIntArray143[local5++] = local80 + ((this.anIntArray122[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static41.anIntArray138[local32 - local28];
				Static41.anIntArray146[local5] = local1 + (local71 + ((Static41.anIntArray147[local20] - local71) * local93 >> 16) << 9) / 50;
				Static41.anIntArray153[local5] = local3 + (local75 + ((Static41.anIntArray144[local20] - local75) * local93 >> 16) << 9) / 50;
				Static41.anIntArray143[local5++] = local80 + ((this.anIntArray128[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static41.anIntArray146[local5] = Static41.anIntArray136[local20];
			Static41.anIntArray153[local5] = Static41.anIntArray140[local20];
			Static41.anIntArray143[local5++] = this.anIntArray128[arg0];
		} else {
			local71 = Static41.anIntArray147[local20];
			local75 = Static41.anIntArray144[local20];
			local80 = this.anIntArray128[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static41.anIntArray138[local28 - local32];
				Static41.anIntArray146[local5] = local1 + (local71 + ((Static41.anIntArray147[local15] - local71) * local93 >> 16) << 9) / 50;
				Static41.anIntArray153[local5] = local3 + (local75 + ((Static41.anIntArray144[local15] - local75) * local93 >> 16) << 9) / 50;
				Static41.anIntArray143[local5++] = local80 + ((this.anIntArray126[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static41.anIntArray138[local24 - local32];
				Static41.anIntArray146[local5] = local1 + (local71 + ((Static41.anIntArray147[local10] - local71) * local93 >> 16) << 9) / 50;
				Static41.anIntArray153[local5] = local3 + (local75 + ((Static41.anIntArray144[local10] - local75) * local93 >> 16) << 9) / 50;
				Static41.anIntArray143[local5++] = local80 + ((this.anIntArray122[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static41.anIntArray146[0];
		local75 = Static41.anIntArray146[1];
		local80 = Static41.anIntArray146[2];
		local93 = Static41.anIntArray153[0];
		@Pc(588) int local588 = Static41.anIntArray153[1];
		@Pc(592) int local592 = Static41.anIntArray153[2];
		Static99.aBoolean201 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static99.anInt2399 || local75 > Static99.anInt2399 || local80 > Static99.anInt2399) {
				Static99.aBoolean201 = true;
			}
			if (this.anIntArray119 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray119[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static99.method1602(local93, local588, local592, local71, local75, local80, Static41.anIntArray143[0], Static41.anIntArray143[1], Static41.anIntArray143[2]);
			} else if (local619 == 1) {
				Static99.method1598(local93, local588, local592, local71, local75, local80, Static41.anIntArray151[this.anIntArray122[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray119[arg0] >> 2;
				local678 = this.anIntArray124[local673];
				local683 = this.anIntArray116[local673];
				local688 = this.anIntArray118[local673];
				Static99.method1604(local93, local588, local592, local71, local75, local80, Static41.anIntArray143[0], Static41.anIntArray143[1], Static41.anIntArray143[2], Static41.anIntArray147[local678], Static41.anIntArray147[local683], Static41.anIntArray147[local688], Static41.anIntArray144[local678], Static41.anIntArray144[local683], Static41.anIntArray144[local688], Static41.anIntArray148[local678], Static41.anIntArray148[local683], Static41.anIntArray148[local688], this.anIntArray131[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray119[arg0] >> 2;
				local678 = this.anIntArray124[local673];
				local683 = this.anIntArray116[local673];
				local688 = this.anIntArray118[local673];
				Static99.method1604(local93, local588, local592, local71, local75, local80, this.anIntArray122[arg0], this.anIntArray122[arg0], this.anIntArray122[arg0], Static41.anIntArray147[local678], Static41.anIntArray147[local683], Static41.anIntArray147[local688], Static41.anIntArray144[local678], Static41.anIntArray144[local683], Static41.anIntArray144[local688], Static41.anIntArray148[local678], Static41.anIntArray148[local683], Static41.anIntArray148[local688], this.anIntArray131[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static99.anInt2399 || local75 > Static99.anInt2399 || local80 > Static99.anInt2399 || Static41.anIntArray146[3] < 0 || Static41.anIntArray146[3] > Static99.anInt2399) {
			Static99.aBoolean201 = true;
		}
		if (this.anIntArray119 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray119[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static99.method1602(local93, local588, local592, local71, local75, local80, Static41.anIntArray143[0], Static41.anIntArray143[1], Static41.anIntArray143[2]);
			Static99.method1602(local93, local592, Static41.anIntArray153[3], local71, local80, Static41.anIntArray146[3], Static41.anIntArray143[0], Static41.anIntArray143[2], Static41.anIntArray143[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static41.anIntArray151[this.anIntArray122[arg0]];
			Static99.method1598(local93, local588, local592, local71, local75, local80, local673);
			Static99.method1598(local93, local592, Static41.anIntArray153[3], local71, local80, Static41.anIntArray146[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray119[arg0] >> 2;
			local678 = this.anIntArray124[local673];
			local683 = this.anIntArray116[local673];
			local688 = this.anIntArray118[local673];
			Static99.method1604(local93, local588, local592, local71, local75, local80, Static41.anIntArray143[0], Static41.anIntArray143[1], Static41.anIntArray143[2], Static41.anIntArray147[local678], Static41.anIntArray147[local683], Static41.anIntArray147[local688], Static41.anIntArray144[local678], Static41.anIntArray144[local683], Static41.anIntArray144[local688], Static41.anIntArray148[local678], Static41.anIntArray148[local683], Static41.anIntArray148[local688], this.anIntArray131[arg0]);
			Static99.method1604(local93, local592, Static41.anIntArray153[3], local71, local80, Static41.anIntArray146[3], Static41.anIntArray143[0], Static41.anIntArray143[2], Static41.anIntArray143[3], Static41.anIntArray147[local678], Static41.anIntArray147[local683], Static41.anIntArray147[local688], Static41.anIntArray144[local678], Static41.anIntArray144[local683], Static41.anIntArray144[local688], Static41.anIntArray148[local678], Static41.anIntArray148[local683], Static41.anIntArray148[local688], this.anIntArray131[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray119[arg0] >> 2;
		local678 = this.anIntArray124[local673];
		local683 = this.anIntArray116[local673];
		local688 = this.anIntArray118[local673];
		Static99.method1604(local93, local588, local592, local71, local75, local80, this.anIntArray122[arg0], this.anIntArray122[arg0], this.anIntArray122[arg0], Static41.anIntArray147[local678], Static41.anIntArray147[local683], Static41.anIntArray147[local688], Static41.anIntArray144[local678], Static41.anIntArray144[local683], Static41.anIntArray144[local688], Static41.anIntArray148[local678], Static41.anIntArray148[local683], Static41.anIntArray148[local688], this.anIntArray131[arg0]);
		Static99.method1604(local93, local592, Static41.anIntArray153[3], local71, local80, Static41.anIntArray146[3], this.anIntArray122[arg0], this.anIntArray122[arg0], this.anIntArray122[arg0], Static41.anIntArray147[local678], Static41.anIntArray147[local683], Static41.anIntArray147[local688], Static41.anIntArray144[local678], Static41.anIntArray144[local683], Static41.anIntArray144[local688], Static41.anIntArray148[local678], Static41.anIntArray148[local683], Static41.anIntArray148[local688], this.anIntArray131[arg0]);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!qb;ILclient!qb;I[I)V")
	public void method762(@OriginalArg(0) Class3_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method778(arg0, arg1);
			return;
		}
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		@Pc(24) Class32 local24 = arg0.aClass32Array1[arg1];
		@Pc(29) Class32 local29 = arg2.aClass32Array1[arg3];
		@Pc(32) Class3_Sub13 local32 = local24.aClass3_Sub13_1;
		Static41.anInt1122 = 0;
		Static41.anInt1124 = 0;
		Static41.anInt1121 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt1050; local47++) {
			local53 = local24.anIntArray108[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray338[local53] == 0) {
				this.method764(local32.anIntArray338[local53], local32.anIntArrayArray26[local53], local24.anIntArray102[local47], local24.anIntArray105[local47], local24.anIntArray109[local47]);
			}
		}
		Static41.anInt1122 = 0;
		Static41.anInt1124 = 0;
		Static41.anInt1121 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt1050; local53++) {
			@Pc(118) int local118 = local29.anIntArray108[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray338[local118] == 0) {
				this.method764(local32.anIntArray338[local118], local32.anIntArrayArray26[local118], local29.anIntArray102[local53], local29.anIntArray105[local53], local29.anIntArray109[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public void method763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1115; local7++) {
			this.anIntArray129[local7] = this.anIntArray129[local7] * arg0 / 128;
			this.anIntArray127[local7] = this.anIntArray127[local7] * arg1 / 128;
			this.anIntArray130[local7] = this.anIntArray130[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[IIII)V")
	private void method764(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static41.anInt1122 = 0;
			Static41.anInt1124 = 0;
			Static41.anInt1121 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray10.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray10[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static41.anInt1122 += this.anIntArray129[local36];
						Static41.anInt1124 += this.anIntArray127[local36];
						Static41.anInt1121 += this.anIntArray130[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static41.anInt1122 = Static41.anInt1122 / local6 + arg2;
				Static41.anInt1124 = Static41.anInt1124 / local6 + arg3;
				Static41.anInt1121 = Static41.anInt1121 / local6 + arg4;
			} else {
				Static41.anInt1122 = arg2;
				Static41.anInt1124 = arg3;
				Static41.anInt1121 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local115 = this.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray129[local31] += arg2;
						this.anIntArray127[local31] += arg3;
						this.anIntArray130[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local115 = this.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray129[local31] -= Static41.anInt1122;
						this.anIntArray127[local31] -= Static41.anInt1124;
						this.anIntArray130[local31] -= Static41.anInt1121;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static41.anIntArray149[local225];
							local235 = Static41.anIntArray142[local225];
							local251 = this.anIntArray127[local31] * local231 + this.anIntArray129[local31] * local235 >> 16;
							this.anIntArray127[local31] = this.anIntArray127[local31] * local235 - this.anIntArray129[local31] * local231 >> 16;
							this.anIntArray129[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static41.anIntArray149[local36];
							local235 = Static41.anIntArray142[local36];
							local251 = this.anIntArray127[local31] * local235 - this.anIntArray130[local31] * local231 >> 16;
							this.anIntArray130[local31] = this.anIntArray127[local31] * local231 + this.anIntArray130[local31] * local235 >> 16;
							this.anIntArray127[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static41.anIntArray149[local219];
							local235 = Static41.anIntArray142[local219];
							local251 = this.anIntArray130[local31] * local231 + this.anIntArray129[local31] * local235 >> 16;
							this.anIntArray130[local31] = this.anIntArray130[local31] * local235 - this.anIntArray129[local31] * local231 >> 16;
							this.anIntArray129[local31] = local251;
						}
						this.anIntArray129[local31] += Static41.anInt1122;
						this.anIntArray127[local31] += Static41.anInt1124;
						this.anIntArray130[local31] += Static41.anInt1121;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local115 = this.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray129[local31] -= Static41.anInt1122;
						this.anIntArray127[local31] -= Static41.anInt1124;
						this.anIntArray130[local31] -= Static41.anInt1121;
						this.anIntArray129[local31] = this.anIntArray129[local31] * arg2 / 128;
						this.anIntArray127[local31] = this.anIntArray127[local31] * arg3 / 128;
						this.anIntArray130[local31] = this.anIntArray130[local31] * arg4 / 128;
						this.anIntArray129[local31] += Static41.anInt1122;
						this.anIntArray127[local31] += Static41.anInt1124;
						this.anIntArray130[local31] += Static41.anInt1121;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray9 != null && this.anIntArray125 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray9.length) {
					local115 = this.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray125[local31] += arg2 * 8;
						if (this.anIntArray125[local31] < 0) {
							this.anIntArray125[local31] = 0;
						}
						if (this.anIntArray125[local31] > 255) {
							this.anIntArray125[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()I")
	public int method765() {
		this.method776();
		return this.anInt1118;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
	public void method767() {
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1115; local7++) {
			@Pc(13) int local13 = this.anIntArray130[local7];
			this.anIntArray130[local7] = this.anIntArray129[local7];
			this.anIntArray129[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "()V")
	public void method768() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray132 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1115; local9++) {
				local15 = this.anIntArray132[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray10 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray10[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1115) {
				local65 = this.anIntArray132[local59];
				this.anIntArrayArray10[local65][local5[local65]++] = local59++;
			}
			this.anIntArray132 = null;
		}
		if (this.anIntArray123 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1116; local9++) {
			local15 = this.anIntArray123[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray9 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray9[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1116) {
			local65 = this.anIntArray123[local59];
			this.anIntArrayArray9[local65][local5[local65]++] = local59++;
		}
		this.anIntArray123 = null;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "()V")
	public void method770() {
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1115; local7++) {
			@Pc(13) int local13 = this.anIntArray129[local7];
			this.anIntArray129[local7] = this.anIntArray130[local7];
			this.anIntArray130[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V")
	public void method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1116; local1++) {
			if (this.anIntArray131[local1] == arg0) {
				this.anIntArray131[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "()V")
	public void method772() {
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1115; local7++) {
			this.anIntArray129[local7] = -this.anIntArray129[local7];
			this.anIntArray130[local7] = -this.anIntArray130[local7];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!hc;I)I")
	private int method773(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray129[arg1];
		@Pc(11) int local11 = arg0.anIntArray127[arg1];
		@Pc(16) int local16 = arg0.anIntArray130[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1115; local18++) {
			if (local6 == this.anIntArray129[local18] && local11 == this.anIntArray127[local18] && local16 == this.anIntArray130[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray129[this.anInt1115] = local6;
			this.anIntArray127[this.anInt1115] = local11;
			this.anIntArray130[this.anInt1115] = local16;
			if (arg0.anIntArray132 != null) {
				this.anIntArray132[this.anInt1115] = arg0.anIntArray132[arg1];
			}
			local1 = this.anInt1115++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZI)V")
	private void method774(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1108 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1108; local6++) {
			Static41.anIntArray137[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1116; local18++) {
			if (this.anIntArray119 == null || this.anIntArray119[local18] != -1) {
				local33 = this.anIntArray133[local18];
				local38 = this.anIntArray121[local18];
				local43 = this.anIntArray117[local18];
				local47 = Static41.anIntArray136[local33];
				local51 = Static41.anIntArray136[local38];
				local55 = Static41.anIntArray136[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static41.anIntArray147[local33];
					local74 = Static41.anIntArray147[local38];
					@Pc(78) int local78 = Static41.anIntArray147[local43];
					@Pc(82) int local82 = Static41.anIntArray144[local33];
					local86 = Static41.anIntArray144[local38];
					local90 = Static41.anIntArray144[local43];
					@Pc(94) int local94 = Static41.anIntArray148[local33];
					local98 = Static41.anIntArray148[local38];
					@Pc(102) int local102 = Static41.anIntArray148[local43];
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
						Static41.aBooleanArray10[local18] = true;
						@Pc(183) int local183 = (Static41.anIntArray150[local33] + Static41.anIntArray150[local38] + Static41.anIntArray150[local43]) / 3 + this.anInt1112;
						Static41.anIntArrayArray12[local183][Static41.anIntArray137[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method766(Static41.anInt1119, Static41.anInt1123, Static41.anIntArray140[local33], Static41.anIntArray140[local38], Static41.anIntArray140[local43], local47, local51, local55)) {
						Static41.anIntArray139[Static41.anInt1120++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static41.anIntArray140[local43] - Static41.anIntArray140[local38]) - (Static41.anIntArray140[local33] - Static41.anIntArray140[local38]) * (local55 - local51) > 0) {
						Static41.aBooleanArray10[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static99.anInt2399 && local51 <= Static99.anInt2399 && local55 <= Static99.anInt2399) {
							Static41.aBooleanArray9[local18] = false;
						} else {
							Static41.aBooleanArray9[local18] = true;
						}
						local70 = (Static41.anIntArray150[local33] + Static41.anIntArray150[local38] + Static41.anIntArray150[local43]) / 3 + this.anInt1112;
						Static41.anIntArrayArray12[local70][Static41.anIntArray137[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray120 == null) {
			for (local33 = this.anInt1108 - 1; local33 >= 0; local33--) {
				local38 = Static41.anIntArray137[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static41.anIntArrayArray12[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method787(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static41.anIntArray154[local33] = 0;
			Static41.anIntArray155[local33] = 0;
		}
		for (local38 = this.anInt1108 - 1; local38 >= 0; local38--) {
			local43 = Static41.anIntArray137[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static41.anIntArrayArray12[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray120[local55];
					local74 = Static41.anIntArray154[local70]++;
					Static41.anIntArrayArray11[local70][local74] = local55;
					if (local70 < 10) {
						Static41.anIntArray155[local70] += local38;
					} else if (local70 == 10) {
						Static41.anIntArray145[local74] = local38;
					} else {
						Static41.anIntArray141[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static41.anIntArray154[1] > 0 || Static41.anIntArray154[2] > 0) {
			local43 = (Static41.anIntArray155[1] + Static41.anIntArray155[2]) / (Static41.anIntArray154[1] + Static41.anIntArray154[2]);
		}
		local47 = 0;
		if (Static41.anIntArray154[3] > 0 || Static41.anIntArray154[4] > 0) {
			local47 = (Static41.anIntArray155[3] + Static41.anIntArray155[4]) / (Static41.anIntArray154[3] + Static41.anIntArray154[4]);
		}
		local51 = 0;
		if (Static41.anIntArray154[6] > 0 || Static41.anIntArray154[8] > 0) {
			local51 = (Static41.anIntArray155[6] + Static41.anIntArray155[8]) / (Static41.anIntArray154[6] + Static41.anIntArray154[8]);
		}
		local70 = 0;
		local74 = Static41.anIntArray154[10];
		@Pc(524) int[] local524 = Static41.anIntArrayArray11[10];
		@Pc(526) int[] local526 = Static41.anIntArray145;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static41.anIntArray154[11];
			local524 = Static41.anIntArrayArray11[11];
			local526 = Static41.anIntArray141;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method787(local524[local70++]);
				if (local70 == local74 && local524 != Static41.anIntArrayArray11[11]) {
					local70 = 0;
					local74 = Static41.anIntArray154[11];
					local524 = Static41.anIntArrayArray11[11];
					local526 = Static41.anIntArray141;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method787(local524[local70++]);
				if (local70 == local74 && local524 != Static41.anIntArrayArray11[11]) {
					local70 = 0;
					local74 = Static41.anIntArray154[11];
					local524 = Static41.anIntArrayArray11[11];
					local526 = Static41.anIntArray141;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method787(local524[local70++]);
				if (local70 == local74 && local524 != Static41.anIntArrayArray11[11]) {
					local70 = 0;
					local74 = Static41.anIntArray154[11];
					local524 = Static41.anIntArrayArray11[11];
					local526 = Static41.anIntArray141;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static41.anIntArray154[local86];
			@Pc(689) int[] local689 = Static41.anIntArrayArray11[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method787(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method787(local524[local70++]);
			if (local70 == local74 && local524 != Static41.anIntArrayArray11[11]) {
				local70 = 0;
				local524 = Static41.anIntArrayArray11[11];
				local74 = Static41.anIntArray154[11];
				local526 = Static41.anIntArray141;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method775(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static41.anIntArray152.length < this.anInt1116) {
			Static41.anIntArray152 = new int[this.anInt1116 + 100];
		}
		return this.method779(arg0, Static41.aClass3_Sub1_Sub1_Sub4_2, Static41.anIntArray152);
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "()V")
	public void method776() {
		if (this.anInt1113 == 1) {
			return;
		}
		this.anInt1113 = 1;
		super.anInt2808 = 0;
		this.anInt1109 = 0;
		this.anInt1118 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1115; local18++) {
			@Pc(24) int local24 = this.anIntArray129[local18];
			@Pc(29) int local29 = this.anIntArray127[local18];
			@Pc(34) int local34 = this.anIntArray130[local18];
			if (-local29 > super.anInt2808) {
				super.anInt2808 = -local29;
			}
			if (local29 > this.anInt1109) {
				this.anInt1109 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1118) {
				this.anInt1118 = local58;
			}
		}
		this.anInt1118 = (int) (Math.sqrt((double) this.anInt1118) + 0.99D);
		this.anInt1112 = (int) (Math.sqrt((double) (this.anInt1118 * this.anInt1118 + super.anInt2808 * super.anInt2808)) + 0.99D);
		this.anInt1108 = this.anInt1112 + (int) (Math.sqrt((double) (this.anInt1118 * this.anInt1118 + this.anInt1109 * this.anInt1109)) + 0.99D);
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "()V")
	private void method777() {
		if (this.anInt1113 == 2) {
			return;
		}
		this.anInt1113 = 2;
		this.anInt1118 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1115; local12++) {
			@Pc(18) int local18 = this.anIntArray129[local12];
			@Pc(23) int local23 = this.anIntArray127[local12];
			@Pc(28) int local28 = this.anIntArray130[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1118) {
				this.anInt1118 = local40;
			}
		}
		this.anInt1118 = (int) (Math.sqrt((double) this.anInt1118) + 0.99D);
		this.anInt1112 = this.anInt1118;
		this.anInt1108 = this.anInt1118 + this.anInt1118;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt1113 != 1) {
			this.method776();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt1118 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt1118 << 9;
		if (local60 / local36 >= Static99.anInt2401) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt1118 << 9;
		if (local73 / local36 <= Static99.anInt2398) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt1118 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static99.anInt2396) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2808 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static99.anInt2400) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2808 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt1117 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static41.aBoolean79) {
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
			local215 = Static41.anInt1119 - Static99.anInt2402;
			local219 = Static41.anInt1123 - Static99.anInt2403;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean78) {
					Static41.anIntArray139[Static41.anInt1120++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static99.anInt2402;
		local215 = Static99.anInt2403;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static41.anIntArray149[arg0];
			local253 = Static41.anIntArray142[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt1115; local265++) {
			@Pc(271) int local271 = this.anIntArray129[local265];
			@Pc(276) int local276 = this.anIntArray127[local265];
			@Pc(281) int local281 = this.anIntArray130[local265];
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
			Static41.anIntArray150[local265] = local281 - local25;
			if (local281 >= 50) {
				Static41.anIntArray136[local265] = local168 + (local271 << 9) / local281;
				Static41.anIntArray140[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static41.anIntArray136[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static41.anIntArray147[local265] = local271;
				Static41.anIntArray144[local265] = local293;
				Static41.anIntArray148[local265] = local281;
			}
		}
		try {
			this.method774(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!qb;I)V")
	public void method778(@OriginalArg(0) Class3_Sub1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray10 == null || arg1 == -1) {
			return;
		}
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		@Pc(18) Class32 local18 = arg0.aClass32Array1[arg1];
		@Pc(21) Class3_Sub13 local21 = local18.aClass3_Sub13_1;
		Static41.anInt1122 = 0;
		Static41.anInt1124 = 0;
		Static41.anInt1121 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt1050; local29++) {
			@Pc(35) int local35 = local18.anIntArray108[local29];
			this.method764(local21.anIntArray338[local35], local21.anIntArrayArray26[local35], local18.anIntArray102[local29], local18.anIntArray105[local29], local18.anIntArray109[local29]);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!hc;[I)Lclient!hc;")
	private Class3_Sub1_Sub1_Sub4 method779(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt1115 = this.anInt1115;
		arg1.anInt1116 = this.anInt1116;
		arg1.anInt1117 = this.anInt1117;
		if (arg1.anIntArray129 == null || arg1.anIntArray129.length < this.anInt1115) {
			arg1.anIntArray129 = new int[this.anInt1115 + 100];
			arg1.anIntArray127 = new int[this.anInt1115 + 100];
			arg1.anIntArray130 = new int[this.anInt1115 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1115; local43++) {
			arg1.anIntArray129[local43] = this.anIntArray129[local43];
			arg1.anIntArray127[local43] = this.anIntArray127[local43];
			arg1.anIntArray130[local43] = this.anIntArray130[local43];
		}
		if (arg0) {
			arg1.anIntArray125 = this.anIntArray125;
		} else {
			arg1.anIntArray125 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray125 == null) {
				for (local88 = 0; local88 < this.anInt1116; local88++) {
					arg1.anIntArray125[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1116; local88++) {
					arg1.anIntArray125[local88] = this.anIntArray125[local88];
				}
			}
		}
		arg1.anIntArray119 = this.anIntArray119;
		arg1.anIntArray131 = this.anIntArray131;
		arg1.anIntArray120 = this.anIntArray120;
		arg1.anInt1114 = this.anInt1114;
		arg1.anIntArrayArray9 = this.anIntArrayArray9;
		arg1.anIntArrayArray10 = this.anIntArrayArray10;
		arg1.anIntArray133 = this.anIntArray133;
		arg1.anIntArray121 = this.anIntArray121;
		arg1.anIntArray117 = this.anIntArray117;
		arg1.anIntArray122 = this.anIntArray122;
		arg1.anIntArray126 = this.anIntArray126;
		arg1.anIntArray128 = this.anIntArray128;
		arg1.anIntArray124 = this.anIntArray124;
		arg1.anIntArray116 = this.anIntArray116;
		arg1.anIntArray118 = this.anIntArray118;
		arg1.aBoolean78 = this.aBoolean78;
		arg1.anInt1113 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "()V")
	public void method780() {
		if (this.anInt1113 == 3) {
			return;
		}
		this.anInt1113 = 3;
		super.anInt2808 = 0;
		this.anInt1109 = 0;
		this.anInt1118 = 999999;
		this.anInt1108 = -999999;
		this.anInt1112 = -99999;
		this.anInt1110 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1115; local27++) {
			@Pc(33) int local33 = this.anIntArray129[local27];
			@Pc(38) int local38 = this.anIntArray127[local27];
			@Pc(43) int local43 = this.anIntArray130[local27];
			if (local33 < this.anInt1118) {
				this.anInt1118 = local33;
			}
			if (local33 > this.anInt1108) {
				this.anInt1108 = local33;
			}
			if (local43 < this.anInt1110) {
				this.anInt1110 = local43;
			}
			if (local43 > this.anInt1112) {
				this.anInt1112 = local43;
			}
			if (-local38 > super.anInt2808) {
				super.anInt2808 = -local38;
			}
			if (local38 > this.anInt1109) {
				this.anInt1109 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIZ)V")
	public void method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray122 == null) {
			this.anIntArray122 = new int[this.anInt1116];
			this.anIntArray126 = new int[this.anInt1116];
			this.anIntArray128 = new int[this.anInt1116];
		}
		@Pc(48) int local48;
		if (this.aClass1Array2 == null) {
			this.aClass1Array2 = new Class1[this.anInt1115];
			for (local48 = 0; local48 < this.anInt1115; local48++) {
				this.aClass1Array2[local48] = new Class1();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt1116; local48++) {
			local69 = this.anIntArray133[local48];
			@Pc(74) int local74 = this.anIntArray121[local48];
			@Pc(79) int local79 = this.anIntArray117[local48];
			@Pc(89) int local89 = this.anIntArray129[local74] - this.anIntArray129[local69];
			@Pc(99) int local99 = this.anIntArray127[local74] - this.anIntArray127[local69];
			@Pc(109) int local109 = this.anIntArray130[local74] - this.anIntArray130[local69];
			@Pc(119) int local119 = this.anIntArray129[local79] - this.anIntArray129[local69];
			@Pc(129) int local129 = this.anIntArray127[local79] - this.anIntArray127[local69];
			@Pc(139) int local139 = this.anIntArray130[local79] - this.anIntArray130[local69];
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
			if (this.anIntArray119 == null || (this.anIntArray119[local48] & 0x1) == 0) {
				@Pc(246) Class1 local246 = this.aClass1Array2[local69];
				local246.anInt6 += local147;
				local246.anInt9 += local155;
				local246.anInt7 += local163;
				local246.anInt5++;
				@Pc(275) Class1 local275 = this.aClass1Array2[local74];
				local275.anInt6 += local147;
				local275.anInt9 += local155;
				local275.anInt7 += local163;
				local275.anInt5++;
				@Pc(304) Class1 local304 = this.aClass1Array2[local79];
				local304.anInt6 += local147;
				local304.anInt9 += local155;
				local304.anInt7 += local163;
				local304.anInt5++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray122[local48] = Static41.method769(this.anIntArray131[local48], local349, this.anIntArray119[local48]);
			}
		}
		if (arg5) {
			this.method782(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass1Array1 = new Class1[this.anInt1115];
		for (local69 = 0; local69 < this.anInt1115; local69++) {
			@Pc(391) Class1 local391 = this.aClass1Array2[local69];
			@Pc(400) Class1 local400 = this.aClass1Array1[local69] = new Class1();
			local400.anInt6 = local391.anInt6;
			local400.anInt9 = local391.anInt9;
			local400.anInt7 = local391.anInt7;
			local400.anInt5 = local391.anInt5;
		}
		this.anInt1111 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
	private void method782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1116; local1++) {
			local7 = this.anIntArray133[local1];
			@Pc(12) int local12 = this.anIntArray121[local1];
			@Pc(17) int local17 = this.anIntArray117[local1];
			@Pc(30) Class1 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray119 == null) {
				local25 = this.anIntArray131[local1];
				local30 = this.aClass1Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt6 + arg3 * local30.anInt9 + arg4 * local30.anInt7) / (arg1 * local30.anInt5);
				this.anIntArray122[local1] = Static41.method769(local25, local52, 0);
				@Pc(65) Class1 local65 = this.aClass1Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt6 + arg3 * local65.anInt9 + arg4 * local65.anInt7) / (arg1 * local65.anInt5);
				this.anIntArray126[local1] = Static41.method769(local25, local87, 0);
				@Pc(100) Class1 local100 = this.aClass1Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt6 + arg3 * local100.anInt9 + arg4 * local100.anInt7) / (arg1 * local100.anInt5);
				this.anIntArray128[local1] = Static41.method769(local25, local122, 0);
			} else if ((this.anIntArray119[local1] & 0x1) == 0) {
				local25 = this.anIntArray131[local1];
				@Pc(148) int local148 = this.anIntArray119[local1];
				local30 = this.aClass1Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt6 + arg3 * local30.anInt9 + arg4 * local30.anInt7) / (arg1 * local30.anInt5);
				this.anIntArray122[local1] = Static41.method769(local25, local52, local148);
				local30 = this.aClass1Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt6 + arg3 * local30.anInt9 + arg4 * local30.anInt7) / (arg1 * local30.anInt5);
				this.anIntArray126[local1] = Static41.method769(local25, local52, local148);
				local30 = this.aClass1Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt6 + arg3 * local30.anInt9 + arg4 * local30.anInt7) / (arg1 * local30.anInt5);
				this.anIntArray128[local1] = Static41.method769(local25, local52, local148);
			}
		}
		this.aClass1Array2 = null;
		this.aClass1Array1 = null;
		this.anIntArray132 = null;
		this.anIntArray123 = null;
		if (this.anIntArray119 != null) {
			for (local7 = 0; local7 < this.anInt1116; local7++) {
				if ((this.anIntArray119[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray131 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
	public void method783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt1113 != 2 && this.anInt1113 != 1) {
			this.method777();
		}
		@Pc(11) int local11 = Static99.anInt2402;
		@Pc(13) int local13 = Static99.anInt2403;
		@Pc(17) int local17 = Static41.anIntArray149[0];
		@Pc(21) int local21 = Static41.anIntArray142[0];
		@Pc(25) int local25 = Static41.anIntArray149[arg0];
		@Pc(29) int local29 = Static41.anIntArray142[arg0];
		@Pc(33) int local33 = Static41.anIntArray149[arg1];
		@Pc(37) int local37 = Static41.anIntArray142[arg1];
		@Pc(41) int local41 = Static41.anIntArray149[arg2];
		@Pc(45) int local45 = Static41.anIntArray142[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt1115; local57++) {
			@Pc(63) int local63 = this.anIntArray129[local57];
			@Pc(68) int local68 = this.anIntArray127[local57];
			@Pc(73) int local73 = this.anIntArray130[local57];
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
			Static41.anIntArray150[local57] = local73 - local55;
			Static41.anIntArray136[local57] = local11 + (local63 << 9) / local73;
			Static41.anIntArray140[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt1117 > 0) {
				Static41.anIntArray147[local57] = local63;
				Static41.anIntArray144[local57] = local85;
				Static41.anIntArray148[local57] = local73;
			}
		}
		try {
			this.method774(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "()V")
	public void method784() {
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1115; local7++) {
			this.anIntArray130[local7] = -this.anIntArray130[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt1116; local24++) {
			@Pc(30) int local30 = this.anIntArray133[local24];
			this.anIntArray133[local24] = this.anIntArray117[local24];
			this.anIntArray117[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)V")
	public void method785() {
		@Pc(4) int local4 = this.anInt1111 >> 16;
		@Pc(11) int local11 = this.anInt1111 << 16 >> 16;
		this.method782(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(III)V")
	public void method786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1113 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1115; local4++) {
			this.anIntArray129[local4] += arg0;
			this.anIntArray127[local4] += arg1;
			this.anIntArray130[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V")
	private void method787(@OriginalArg(0) int arg0) {
		if (Static41.aBooleanArray10[arg0]) {
			this.method761(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray133[arg0];
		@Pc(17) int local17 = this.anIntArray121[arg0];
		@Pc(22) int local22 = this.anIntArray117[arg0];
		Static99.aBoolean201 = Static41.aBooleanArray9[arg0];
		if (this.anIntArray125 == null) {
			Static99.anInt2395 = 0;
		} else {
			Static99.anInt2395 = this.anIntArray125[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray119 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray119[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static99.method1602(Static41.anIntArray140[local12], Static41.anIntArray140[local17], Static41.anIntArray140[local22], Static41.anIntArray136[local12], Static41.anIntArray136[local17], Static41.anIntArray136[local22], this.anIntArray122[arg0], this.anIntArray126[arg0], this.anIntArray128[arg0]);
		} else if (local42 == 1) {
			Static99.method1598(Static41.anIntArray140[local12], Static41.anIntArray140[local17], Static41.anIntArray140[local22], Static41.anIntArray136[local12], Static41.anIntArray136[local17], Static41.anIntArray136[local22], Static41.anIntArray151[this.anIntArray122[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray119[arg0] >> 2;
				local128 = this.anIntArray124[local123];
				local133 = this.anIntArray116[local123];
				local138 = this.anIntArray118[local123];
				Static99.method1604(Static41.anIntArray140[local12], Static41.anIntArray140[local17], Static41.anIntArray140[local22], Static41.anIntArray136[local12], Static41.anIntArray136[local17], Static41.anIntArray136[local22], this.anIntArray122[arg0], this.anIntArray126[arg0], this.anIntArray128[arg0], Static41.anIntArray147[local128], Static41.anIntArray147[local133], Static41.anIntArray147[local138], Static41.anIntArray144[local128], Static41.anIntArray144[local133], Static41.anIntArray144[local138], Static41.anIntArray148[local128], Static41.anIntArray148[local133], Static41.anIntArray148[local138], this.anIntArray131[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray119[arg0] >> 2;
				local128 = this.anIntArray124[local123];
				local133 = this.anIntArray116[local123];
				local138 = this.anIntArray118[local123];
				Static99.method1604(Static41.anIntArray140[local12], Static41.anIntArray140[local17], Static41.anIntArray140[local22], Static41.anIntArray136[local12], Static41.anIntArray136[local17], Static41.anIntArray136[local22], this.anIntArray122[arg0], this.anIntArray122[arg0], this.anIntArray122[arg0], Static41.anIntArray147[local128], Static41.anIntArray147[local133], Static41.anIntArray147[local138], Static41.anIntArray144[local128], Static41.anIntArray144[local133], Static41.anIntArray144[local138], Static41.anIntArray148[local128], Static41.anIntArray148[local133], Static41.anIntArray148[local138], this.anIntArray131[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(Z)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method788(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static41.anIntArray134.length < this.anInt1116) {
			Static41.anIntArray134 = new int[this.anInt1116 + 100];
		}
		return this.method779(arg0, Static41.aClass3_Sub1_Sub1_Sub4_1, Static41.anIntArray134);
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
	public void method791(@OriginalArg(0) int arg0) {
		this.aClass1Array2 = null;
		this.anInt1113 = 0;
		@Pc(9) int local9 = Static41.anIntArray149[arg0];
		@Pc(13) int local13 = Static41.anIntArray142[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1115; local15++) {
			@Pc(32) int local32 = this.anIntArray127[local15] * local13 - this.anIntArray130[local15] * local9 >> 16;
			this.anIntArray130[local15] = this.anIntArray127[local15] * local9 + this.anIntArray130[local15] * local13 >> 16;
			this.anIntArray127[local15] = local32;
		}
	}
}
