import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class2_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!ga", name = "tc", descriptor = "[I")
	public static int[] anIntArray135 = new int[128];

	@OriginalMember(owner = "client!ga", name = "ob", descriptor = "[Lclient!db;")
	public Class14[] aClass14Array1;

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "I")
	public int anInt983;

	@OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
	public int anInt984;

	@OriginalMember(owner = "client!ga", name = "Bb", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!ga", name = "Db", descriptor = "[Lclient!db;")
	public Class14[] aClass14Array2;

	@OriginalMember(owner = "client!ga", name = "Fb", descriptor = "I")
	public int anInt989;

	@OriginalMember(owner = "client!ga", name = "Gb", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!ga", name = "Ib", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!ga", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ga", name = "Lb", descriptor = "I")
	public int anInt990;

	@OriginalMember(owner = "client!ga", name = "Pb", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!ga", name = "Qb", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ga", name = "Ub", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!ga", name = "Wb", descriptor = "I")
	public int anInt993;

	@OriginalMember(owner = "client!ga", name = "Eb", descriptor = "I")
	public int anInt988 = 0;

	@OriginalMember(owner = "client!ga", name = "zb", descriptor = "I")
	public int anInt985 = 0;

	@OriginalMember(owner = "client!ga", name = "Cb", descriptor = "I")
	private int anInt987 = 0;

	@OriginalMember(owner = "client!ga", name = "ub", descriptor = "Z")
	public boolean aBoolean56 = false;

	@OriginalMember(owner = "client!ga", name = "Mb", descriptor = "I")
	private int anInt991 = 0;

	@OriginalMember(owner = "client!ga", name = "Ob", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!ga", name = "Tb", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!ga", name = "Kb", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!ga", name = "Nb", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!ga", name = "Vb", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!ga", name = "Rb", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!ga", name = "vb", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!ga", name = "xb", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!ga", name = "Sb", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!ga", name = "wb", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!ga", name = "Ab", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!ga", name = "Hb", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!ga", name = "tb", descriptor = "[I")
	private int[] anIntArray104;

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

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class2_Sub5 local21 = new Class2_Sub5(arg0);
		@Pc(26) Class2_Sub5 local26 = new Class2_Sub5(arg0);
		@Pc(31) Class2_Sub5 local31 = new Class2_Sub5(arg0);
		@Pc(36) Class2_Sub5 local36 = new Class2_Sub5(arg0);
		@Pc(41) Class2_Sub5 local41 = new Class2_Sub5(arg0);
		local21.anInt1772 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1273();
		@Pc(55) int local55 = local21.method1273();
		@Pc(59) int local59 = local21.method1281();
		@Pc(63) int local63 = local21.method1281();
		@Pc(67) int local67 = local21.method1281();
		@Pc(71) int local71 = local21.method1281();
		@Pc(75) int local75 = local21.method1281();
		@Pc(79) int local79 = local21.method1281();
		@Pc(83) int local83 = local21.method1273();
		@Pc(87) int local87 = local21.method1273();
		@Pc(91) int local91 = local21.method1273();
		@Pc(95) int local95 = local21.method1273();
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
		this.anInt988 = local51;
		this.anInt985 = local55;
		this.anInt991 = local59;
		this.anIntArray114 = new int[local51];
		this.anIntArray118 = new int[local51];
		this.anIntArray112 = new int[local51];
		this.anIntArray113 = new int[local55];
		this.anIntArray119 = new int[local55];
		this.anIntArray116 = new int[local55];
		this.anIntArray105 = new int[local59];
		this.anIntArray107 = new int[local59];
		this.anIntArray117 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray102 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray106 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray108 = new int[local55];
		} else {
			this.anInt987 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray103 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray110 = new int[local55];
		}
		this.anIntArray104 = new int[local55];
		local21.anInt1772 = local97;
		local26.anInt1772 = local196;
		local31.anInt1772 = local202;
		local36.anInt1772 = local103;
		local41.anInt1772 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1281();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1251();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1251();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1251();
			}
			this.anIntArray114[local321] = local315 + local328;
			this.anIntArray118[local321] = local317 + local338;
			this.anIntArray112[local321] = local319 + local348;
			local315 = this.anIntArray114[local321];
			local317 = this.anIntArray118[local321];
			local319 = this.anIntArray112[local321];
			if (this.anIntArray102 != null) {
				this.anIntArray102[local321] = local41.method1281();
			}
		}
		local21.anInt1772 = local180;
		local26.anInt1772 = local138;
		local31.anInt1772 = local111;
		local36.anInt1772 = local162;
		local41.anInt1772 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray104[local326] = local21.method1273();
			if (this.anIntArray106 != null) {
				this.anIntArray106[local326] = local26.method1281();
			}
			if (this.anIntArray108 != null) {
				this.anIntArray108[local326] = local31.method1281();
			}
			if (this.anIntArray103 != null) {
				this.anIntArray103[local326] = local36.method1281();
			}
			if (this.anIntArray110 != null) {
				this.anIntArray110[local326] = local41.method1281();
			}
		}
		local21.anInt1772 = local174;
		local26.anInt1772 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1281();
			if (local496 == 1) {
				local328 = local21.method1251() + local489;
				local338 = local21.method1251() + local328;
				local348 = local21.method1251() + local338;
				local489 = local348;
				this.anIntArray113[local491] = local328;
				this.anIntArray119[local491] = local338;
				this.anIntArray116[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1251() + local489;
				local489 = local348;
				this.anIntArray113[local491] = local328;
				this.anIntArray119[local491] = local338;
				this.anIntArray116[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1251() + local489;
				local489 = local348;
				this.anIntArray113[local491] = local328;
				this.anIntArray119[local491] = local338;
				this.anIntArray116[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1251() + local489;
				local489 = local348;
				this.anIntArray113[local491] = local328;
				this.anIntArray119[local491] = local599;
				this.anIntArray116[local491] = local348;
			}
		}
		local21.anInt1772 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray105[local496] = local21.method1273();
			this.anIntArray107[local496] = local21.method1273();
			this.anIntArray117[local496] = local21.method1273();
		}
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([Lclient!ga;I)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) Class2_Sub1_Sub2_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt988 = 0;
		this.anInt985 = 0;
		this.anInt991 = 0;
		this.anInt987 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub2_Sub2 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt988 += local43.anInt988;
				this.anInt985 += local43.anInt985;
				this.anInt991 += local43.anInt991;
				local18 |= local43.anIntArray106 != null;
				if (local43.anIntArray108 == null) {
					if (this.anInt987 == -1) {
						this.anInt987 = local43.anInt987;
					}
					if (this.anInt987 != local43.anInt987) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray103 != null;
				local24 |= local43.anIntArray110 != null;
			}
		}
		this.anIntArray114 = new int[this.anInt988];
		this.anIntArray118 = new int[this.anInt988];
		this.anIntArray112 = new int[this.anInt988];
		this.anIntArray102 = new int[this.anInt988];
		this.anIntArray113 = new int[this.anInt985];
		this.anIntArray119 = new int[this.anInt985];
		this.anIntArray116 = new int[this.anInt985];
		this.anIntArray105 = new int[this.anInt991];
		this.anIntArray107 = new int[this.anInt991];
		this.anIntArray117 = new int[this.anInt991];
		if (local18) {
			this.anIntArray106 = new int[this.anInt985];
		}
		if (local20) {
			this.anIntArray108 = new int[this.anInt985];
		}
		if (local22) {
			this.anIntArray103 = new int[this.anInt985];
		}
		if (local24) {
			this.anIntArray110 = new int[this.anInt985];
		}
		this.anIntArray104 = new int[this.anInt985];
		this.anInt988 = 0;
		this.anInt985 = 0;
		this.anInt991 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class2_Sub1_Sub2_Sub2 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt985; local223++) {
					if (local18) {
						if (local219.anIntArray106 == null) {
							this.anIntArray106[this.anInt985] = 0;
						} else {
							local241 = local219.anIntArray106[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray106[this.anInt985] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray108 == null) {
							this.anIntArray108[this.anInt985] = local219.anInt987;
						} else {
							this.anIntArray108[this.anInt985] = local219.anIntArray108[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray103 == null) {
							this.anIntArray103[this.anInt985] = 0;
						} else {
							this.anIntArray103[this.anInt985] = local219.anIntArray103[local223];
						}
					}
					if (local24 && local219.anIntArray110 != null) {
						this.anIntArray110[this.anInt985] = local219.anIntArray110[local223];
					}
					this.anIntArray104[this.anInt985] = local219.anIntArray104[local223];
					this.anIntArray113[this.anInt985] = this.method696(local219, local219.anIntArray113[local223]);
					this.anIntArray119[this.anInt985] = this.method696(local219, local219.anIntArray119[local223]);
					this.anIntArray116[this.anInt985] = this.method696(local219, local219.anIntArray116[local223]);
					this.anInt985++;
				}
				for (local241 = 0; local241 < local219.anInt991; local241++) {
					this.anIntArray105[this.anInt991] = this.method696(local219, local219.anIntArray105[local241]);
					this.anIntArray107[this.anInt991] = this.method696(local219, local219.anIntArray107[local241]);
					this.anIntArray117[this.anInt991] = this.method696(local219, local219.anIntArray117[local241]);
					this.anInt991++;
				}
				local212 += local219.anInt991;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([Lclient!ga;IZ)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) Class2_Sub1_Sub2_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt988 = 0;
		this.anInt985 = 0;
		this.anInt991 = 0;
		this.anInt987 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub2_Sub2 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt988 += local43.anInt988;
				this.anInt985 += local43.anInt985;
				this.anInt991 += local43.anInt991;
				local18 |= local43.anIntArray106 != null;
				if (local43.anIntArray108 == null) {
					if (this.anInt987 == -1) {
						this.anInt987 = local43.anInt987;
					}
					if (this.anInt987 != local43.anInt987) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray103 != null;
				local24 |= local43.anIntArray104 != null;
			}
		}
		this.anIntArray114 = new int[this.anInt988];
		this.anIntArray118 = new int[this.anInt988];
		this.anIntArray112 = new int[this.anInt988];
		this.anIntArray113 = new int[this.anInt985];
		this.anIntArray119 = new int[this.anInt985];
		this.anIntArray116 = new int[this.anInt985];
		this.anIntArray115 = new int[this.anInt985];
		this.anIntArray111 = new int[this.anInt985];
		this.anIntArray109 = new int[this.anInt985];
		this.anIntArray105 = new int[this.anInt991];
		this.anIntArray107 = new int[this.anInt991];
		this.anIntArray117 = new int[this.anInt991];
		if (local18) {
			this.anIntArray106 = new int[this.anInt985];
		}
		if (local20) {
			this.anIntArray108 = new int[this.anInt985];
		}
		if (local22) {
			this.anIntArray103 = new int[this.anInt985];
		}
		if (local24) {
			this.anIntArray104 = new int[this.anInt985];
		}
		this.anInt988 = 0;
		this.anInt985 = 0;
		this.anInt991 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class2_Sub1_Sub2_Sub2 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt988;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt988; local231++) {
					this.anIntArray114[this.anInt988] = local224.anIntArray114[local231];
					this.anIntArray118[this.anInt988] = local224.anIntArray118[local231];
					this.anIntArray112[this.anInt988] = local224.anIntArray112[local231];
					this.anInt988++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt985; local272++) {
					this.anIntArray113[this.anInt985] = local224.anIntArray113[local272] + local229;
					this.anIntArray119[this.anInt985] = local224.anIntArray119[local272] + local229;
					this.anIntArray116[this.anInt985] = local224.anIntArray116[local272] + local229;
					this.anIntArray115[this.anInt985] = local224.anIntArray115[local272];
					this.anIntArray111[this.anInt985] = local224.anIntArray111[local272];
					this.anIntArray109[this.anInt985] = local224.anIntArray109[local272];
					if (local18) {
						if (local224.anIntArray106 == null) {
							this.anIntArray106[this.anInt985] = 0;
						} else {
							local350 = local224.anIntArray106[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray106[this.anInt985] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray108 == null) {
							this.anIntArray108[this.anInt985] = local224.anInt987;
						} else {
							this.anIntArray108[this.anInt985] = local224.anIntArray108[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray103 == null) {
							this.anIntArray103[this.anInt985] = 0;
						} else {
							this.anIntArray103[this.anInt985] = local224.anIntArray103[local272];
						}
					}
					if (local24 && local224.anIntArray104 != null) {
						this.anIntArray104[this.anInt985] = local224.anIntArray104[local272];
					}
					this.anInt985++;
				}
				for (local350 = 0; local350 < local224.anInt991; local350++) {
					this.anIntArray105[this.anInt991] = local224.anIntArray105[local350] + local229;
					this.anIntArray107[this.anInt991] = local224.anIntArray107[local350] + local229;
					this.anIntArray117[this.anInt991] = local224.anIntArray117[local350] + local229;
					this.anInt991++;
				}
				local217 += local224.anInt991;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!ga;ZZZ)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt988 = arg0.anInt988;
		this.anInt985 = arg0.anInt985;
		this.anInt991 = arg0.anInt991;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray114 = arg0.anIntArray114;
			this.anIntArray118 = arg0.anIntArray118;
			this.anIntArray112 = arg0.anIntArray112;
		} else {
			this.anIntArray114 = new int[this.anInt988];
			this.anIntArray118 = new int[this.anInt988];
			this.anIntArray112 = new int[this.anInt988];
			for (local60 = 0; local60 < this.anInt988; local60++) {
				this.anIntArray114[local60] = arg0.anIntArray114[local60];
				this.anIntArray118[local60] = arg0.anIntArray118[local60];
				this.anIntArray112[local60] = arg0.anIntArray112[local60];
			}
		}
		if (arg2) {
			this.anIntArray104 = arg0.anIntArray104;
		} else {
			this.anIntArray104 = new int[this.anInt985];
			for (local60 = 0; local60 < this.anInt985; local60++) {
				this.anIntArray104[local60] = arg0.anIntArray104[local60];
			}
		}
		this.anIntArray103 = arg0.anIntArray103;
		this.anIntArray102 = arg0.anIntArray102;
		this.anIntArray110 = arg0.anIntArray110;
		this.anIntArray106 = arg0.anIntArray106;
		this.anIntArray113 = arg0.anIntArray113;
		this.anIntArray119 = arg0.anIntArray119;
		this.anIntArray116 = arg0.anIntArray116;
		this.anIntArray108 = arg0.anIntArray108;
		this.anInt987 = arg0.anInt987;
		this.anIntArray105 = arg0.anIntArray105;
		this.anIntArray107 = arg0.anIntArray107;
		this.anIntArray117 = arg0.anIntArray117;
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!ga;ZZ)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt988 = arg0.anInt988;
		this.anInt985 = arg0.anInt985;
		this.anInt991 = arg0.anInt991;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray118 = new int[this.anInt988];
			for (local37 = 0; local37 < this.anInt988; local37++) {
				this.anIntArray118[local37] = arg0.anIntArray118[local37];
			}
		} else {
			this.anIntArray118 = arg0.anIntArray118;
		}
		if (arg2) {
			this.anIntArray115 = new int[this.anInt985];
			this.anIntArray111 = new int[this.anInt985];
			this.anIntArray109 = new int[this.anInt985];
			for (local37 = 0; local37 < this.anInt985; local37++) {
				this.anIntArray115[local37] = arg0.anIntArray115[local37];
				this.anIntArray111[local37] = arg0.anIntArray111[local37];
				this.anIntArray109[local37] = arg0.anIntArray109[local37];
			}
			this.anIntArray106 = new int[this.anInt985];
			@Pc(115) int local115;
			if (arg0.anIntArray106 == null) {
				for (local115 = 0; local115 < this.anInt985; local115++) {
					this.anIntArray106[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt985; local115++) {
					this.anIntArray106[local115] = arg0.anIntArray106[local115];
				}
			}
			this.aClass14Array2 = new Class14[this.anInt988];
			for (local115 = 0; local115 < this.anInt988; local115++) {
				@Pc(160) Class14 local160 = this.aClass14Array2[local115] = new Class14();
				@Pc(165) Class14 local165 = arg0.aClass14Array2[local115];
				local160.anInt569 = local165.anInt569;
				local160.anInt565 = local165.anInt565;
				local160.anInt567 = local165.anInt567;
				local160.anInt573 = local165.anInt573;
			}
			this.aClass14Array1 = arg0.aClass14Array1;
		} else {
			this.anIntArray115 = arg0.anIntArray115;
			this.anIntArray111 = arg0.anIntArray111;
			this.anIntArray109 = arg0.anIntArray109;
			this.anIntArray106 = arg0.anIntArray106;
		}
		this.anIntArray114 = arg0.anIntArray114;
		this.anIntArray112 = arg0.anIntArray112;
		this.anIntArray104 = arg0.anIntArray104;
		this.anIntArray103 = arg0.anIntArray103;
		this.anIntArray108 = arg0.anIntArray108;
		this.anInt987 = arg0.anInt987;
		this.anIntArray113 = arg0.anIntArray113;
		this.anIntArray119 = arg0.anIntArray119;
		this.anIntArray116 = arg0.anIntArray116;
		this.anIntArray105 = arg0.anIntArray105;
		this.anIntArray107 = arg0.anIntArray107;
		this.anIntArray117 = arg0.anIntArray117;
		this.anInt992 = arg0.anInt992;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
	public void method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt986 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt988; local4++) {
			this.anIntArray114[local4] += arg0;
			this.anIntArray118[local4] += arg1;
			this.anIntArray112[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	public void method693() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray102 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt988; local9++) {
				local15 = this.anIntArray102[local9];
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
			while (local59 < this.anInt988) {
				local65 = this.anIntArray102[local59];
				this.anIntArrayArray9[local65][local5[local65]++] = local59++;
			}
			this.anIntArray102 = null;
		}
		if (this.anIntArray110 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt985; local9++) {
			local15 = this.anIntArray110[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray8 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray8[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt985) {
			local65 = this.anIntArray110[local59];
			this.anIntArrayArray8[local65][local5[local65]++] = local59++;
		}
		this.anIntArray110 = null;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
	public void method694() {
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt988; local7++) {
			@Pc(13) int local13 = this.anIntArray114[local7];
			this.anIntArray114[local7] = this.anIntArray112[local7];
			this.anIntArray112[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ua;ILclient!ua;I[I)V")
	public void method695(@OriginalArg(0) Class2_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method715(arg0, arg1);
			return;
		}
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		@Pc(24) Class25 local24 = arg0.aClass25Array1[arg1];
		@Pc(29) Class25 local29 = arg2.aClass25Array1[arg3];
		@Pc(32) Class2_Sub2 local32 = local24.aClass2_Sub2_1;
		Static32.anInt996 = 0;
		Static32.anInt997 = 0;
		Static32.anInt998 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt1000; local47++) {
			local53 = local24.anIntArray146[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray28[local53] == 0) {
				this.method710(local32.anIntArray28[local53], local32.anIntArrayArray5[local53], local24.anIntArray149[local47], local24.anIntArray144[local47], local24.anIntArray147[local47]);
			}
		}
		Static32.anInt996 = 0;
		Static32.anInt997 = 0;
		Static32.anInt998 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt1000; local53++) {
			@Pc(118) int local118 = local29.anIntArray146[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray28[local118] == 0) {
				this.method710(local32.anIntArray28[local118], local32.anIntArrayArray5[local118], local29.anIntArray149[local53], local29.anIntArray144[local53], local29.anIntArray147[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ga;I)I")
	private int method696(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray114[arg1];
		@Pc(11) int local11 = arg0.anIntArray118[arg1];
		@Pc(16) int local16 = arg0.anIntArray112[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt988; local18++) {
			if (local6 == this.anIntArray114[local18] && local11 == this.anIntArray118[local18] && local16 == this.anIntArray112[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray114[this.anInt988] = local6;
			this.anIntArray118[this.anInt988] = local11;
			this.anIntArray112[this.anInt988] = local16;
			if (arg0.anIntArray102 != null) {
				this.anIntArray102[this.anInt988] = arg0.anIntArray102[arg1];
			}
			local1 = this.anInt988++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "()V")
	public void method697() {
		if (this.anInt986 == 1) {
			return;
		}
		this.anInt986 = 1;
		super.anInt2876 = 0;
		this.anInt993 = 0;
		this.anInt989 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt988; local18++) {
			@Pc(24) int local24 = this.anIntArray114[local18];
			@Pc(29) int local29 = this.anIntArray118[local18];
			@Pc(34) int local34 = this.anIntArray112[local18];
			if (-local29 > super.anInt2876) {
				super.anInt2876 = -local29;
			}
			if (local29 > this.anInt993) {
				this.anInt993 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt989) {
				this.anInt989 = local58;
			}
		}
		this.anInt989 = (int) (Math.sqrt((double) this.anInt989) + 0.99D);
		this.anInt990 = (int) (Math.sqrt((double) (this.anInt989 * this.anInt989 + super.anInt2876 * super.anInt2876)) + 0.99D);
		this.anInt984 = this.anInt990 + (int) (Math.sqrt((double) (this.anInt989 * this.anInt989 + this.anInt993 * this.anInt993)) + 0.99D);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIII)V")
	public void method699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt986 != 2 && this.anInt986 != 1) {
			this.method721();
		}
		@Pc(11) int local11 = Static106.anInt2840;
		@Pc(13) int local13 = Static106.anInt2846;
		@Pc(17) int local17 = Static32.anIntArray122[0];
		@Pc(21) int local21 = Static32.anIntArray129[0];
		@Pc(25) int local25 = Static32.anIntArray122[arg0];
		@Pc(29) int local29 = Static32.anIntArray129[arg0];
		@Pc(33) int local33 = Static32.anIntArray122[arg1];
		@Pc(37) int local37 = Static32.anIntArray129[arg1];
		@Pc(41) int local41 = Static32.anIntArray122[arg2];
		@Pc(45) int local45 = Static32.anIntArray129[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt988; local57++) {
			@Pc(63) int local63 = this.anIntArray114[local57];
			@Pc(68) int local68 = this.anIntArray118[local57];
			@Pc(73) int local73 = this.anIntArray112[local57];
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
			Static32.anIntArray121[local57] = local73 - local55;
			Static32.anIntArray138[local57] = local11 + (local63 << 9) / local73;
			Static32.anIntArray130[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt991 > 0) {
				Static32.anIntArray132[local57] = local63;
				Static32.anIntArray136[local57] = local85;
				Static32.anIntArray128[local57] = local73;
			}
		}
		try {
			this.method720(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
	private void method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt985; local1++) {
			local7 = this.anIntArray113[local1];
			@Pc(12) int local12 = this.anIntArray119[local1];
			@Pc(17) int local17 = this.anIntArray116[local1];
			@Pc(30) Class14 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray106 == null) {
				local25 = this.anIntArray104[local1];
				local30 = this.aClass14Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt569 + arg3 * local30.anInt565 + arg4 * local30.anInt567) / (arg1 * local30.anInt573);
				this.anIntArray115[local1] = Static32.method709(local25, local52, 0);
				@Pc(65) Class14 local65 = this.aClass14Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt569 + arg3 * local65.anInt565 + arg4 * local65.anInt567) / (arg1 * local65.anInt573);
				this.anIntArray111[local1] = Static32.method709(local25, local87, 0);
				@Pc(100) Class14 local100 = this.aClass14Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt569 + arg3 * local100.anInt565 + arg4 * local100.anInt567) / (arg1 * local100.anInt573);
				this.anIntArray109[local1] = Static32.method709(local25, local122, 0);
			} else if ((this.anIntArray106[local1] & 0x1) == 0) {
				local25 = this.anIntArray104[local1];
				@Pc(148) int local148 = this.anIntArray106[local1];
				local30 = this.aClass14Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt569 + arg3 * local30.anInt565 + arg4 * local30.anInt567) / (arg1 * local30.anInt573);
				this.anIntArray115[local1] = Static32.method709(local25, local52, local148);
				local30 = this.aClass14Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt569 + arg3 * local30.anInt565 + arg4 * local30.anInt567) / (arg1 * local30.anInt573);
				this.anIntArray111[local1] = Static32.method709(local25, local52, local148);
				local30 = this.aClass14Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt569 + arg3 * local30.anInt565 + arg4 * local30.anInt567) / (arg1 * local30.anInt573);
				this.anIntArray109[local1] = Static32.method709(local25, local52, local148);
			}
		}
		this.aClass14Array2 = null;
		this.aClass14Array1 = null;
		this.anIntArray102 = null;
		this.anIntArray110 = null;
		if (this.anIntArray106 != null) {
			for (local7 = 0; local7 < this.anInt985; local7++) {
				if ((this.anIntArray106[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray104 = null;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "()V")
	public void method701() {
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt988; local7++) {
			this.anIntArray114[local7] = -this.anIntArray114[local7];
			this.anIntArray112[local7] = -this.anIntArray112[local7];
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt986 != 1) {
			this.method697();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt989 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt989 << 9;
		if (local60 / local36 >= Static106.anInt2843) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt989 << 9;
		if (local73 / local36 <= Static106.anInt2838) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt989 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static106.anInt2841) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2876 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static106.anInt2844) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2876 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt991 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static32.aBoolean57) {
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
			local215 = Static32.anInt999 - Static106.anInt2840;
			local219 = Static32.anInt995 - Static106.anInt2846;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean56) {
					Static32.anIntArray140[Static32.anInt994++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static106.anInt2840;
		local215 = Static106.anInt2846;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static32.anIntArray122[arg0];
			local253 = Static32.anIntArray129[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt988; local265++) {
			@Pc(271) int local271 = this.anIntArray114[local265];
			@Pc(276) int local276 = this.anIntArray118[local265];
			@Pc(281) int local281 = this.anIntArray112[local265];
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
			Static32.anIntArray121[local265] = local281 - local25;
			if (local281 >= 50) {
				Static32.anIntArray138[local265] = local168 + (local271 << 9) / local281;
				Static32.anIntArray130[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static32.anIntArray138[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static32.anIntArray132[local265] = local271;
				Static32.anIntArray136[local265] = local293;
				Static32.anIntArray128[local265] = local281;
			}
		}
		try {
			this.method720(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "()V")
	public void method702() {
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt988; local7++) {
			@Pc(13) int local13 = this.anIntArray112[local7];
			this.anIntArray112[local7] = this.anIntArray114[local7];
			this.anIntArray114[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "()I")
	public int method703() {
		this.method697();
		return this.anInt989;
	}

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V")
	private void method704(@OriginalArg(0) int arg0) {
		if (Static32.aBooleanArray6[arg0]) {
			this.method711(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray113[arg0];
		@Pc(17) int local17 = this.anIntArray119[arg0];
		@Pc(22) int local22 = this.anIntArray116[arg0];
		Static106.aBoolean131 = Static32.aBooleanArray5[arg0];
		if (this.anIntArray103 == null) {
			Static106.anInt2842 = 0;
		} else {
			Static106.anInt2842 = this.anIntArray103[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray106 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray106[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static106.method2036(Static32.anIntArray130[local12], Static32.anIntArray130[local17], Static32.anIntArray130[local22], Static32.anIntArray138[local12], Static32.anIntArray138[local17], Static32.anIntArray138[local22], this.anIntArray115[arg0], this.anIntArray111[arg0], this.anIntArray109[arg0]);
		} else if (local42 == 1) {
			Static106.method2033(Static32.anIntArray130[local12], Static32.anIntArray130[local17], Static32.anIntArray130[local22], Static32.anIntArray138[local12], Static32.anIntArray138[local17], Static32.anIntArray138[local22], Static32.anIntArray124[this.anIntArray115[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray106[arg0] >> 2;
				local128 = this.anIntArray105[local123];
				local133 = this.anIntArray107[local123];
				local138 = this.anIntArray117[local123];
				Static106.method2028(Static32.anIntArray130[local12], Static32.anIntArray130[local17], Static32.anIntArray130[local22], Static32.anIntArray138[local12], Static32.anIntArray138[local17], Static32.anIntArray138[local22], this.anIntArray115[arg0], this.anIntArray111[arg0], this.anIntArray109[arg0], Static32.anIntArray132[local128], Static32.anIntArray132[local133], Static32.anIntArray132[local138], Static32.anIntArray136[local128], Static32.anIntArray136[local133], Static32.anIntArray136[local138], Static32.anIntArray128[local128], Static32.anIntArray128[local133], Static32.anIntArray128[local138], this.anIntArray104[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray106[arg0] >> 2;
				local128 = this.anIntArray105[local123];
				local133 = this.anIntArray107[local123];
				local138 = this.anIntArray117[local123];
				Static106.method2028(Static32.anIntArray130[local12], Static32.anIntArray130[local17], Static32.anIntArray130[local22], Static32.anIntArray138[local12], Static32.anIntArray138[local17], Static32.anIntArray138[local22], this.anIntArray115[arg0], this.anIntArray115[arg0], this.anIntArray115[arg0], Static32.anIntArray132[local128], Static32.anIntArray132[local133], Static32.anIntArray132[local138], Static32.anIntArray136[local128], Static32.anIntArray136[local133], Static32.anIntArray136[local138], Static32.anIntArray128[local128], Static32.anIntArray128[local133], Static32.anIntArray128[local138], this.anIntArray104[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "(I)V")
	public void method705(@OriginalArg(0) int arg0) {
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		@Pc(9) int local9 = Static32.anIntArray122[arg0];
		@Pc(13) int local13 = Static32.anIntArray129[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt988; local15++) {
			@Pc(32) int local32 = this.anIntArray118[local15] * local13 - this.anIntArray112[local15] * local9 >> 16;
			this.anIntArray112[local15] = this.anIntArray118[local15] * local9 + this.anIntArray112[local15] * local13 >> 16;
			this.anIntArray118[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)V")
	public void method706() {
		@Pc(4) int local4 = this.anInt992 >> 16;
		@Pc(11) int local11 = this.anInt992 << 16 >> 16;
		this.method700(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method707(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static32.anIntArray120.length < this.anInt985) {
			Static32.anIntArray120 = new int[this.anInt985 + 100];
		}
		return this.method719(arg0, Static32.aClass2_Sub1_Sub2_Sub2_1, Static32.anIntArray120);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[IIII)V")
	private void method710(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static32.anInt996 = 0;
			Static32.anInt997 = 0;
			Static32.anInt998 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray9.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray9[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static32.anInt996 += this.anIntArray114[local36];
						Static32.anInt997 += this.anIntArray118[local36];
						Static32.anInt998 += this.anIntArray112[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static32.anInt996 = Static32.anInt996 / local6 + arg2;
				Static32.anInt997 = Static32.anInt997 / local6 + arg3;
				Static32.anInt998 = Static32.anInt998 / local6 + arg4;
			} else {
				Static32.anInt996 = arg2;
				Static32.anInt997 = arg3;
				Static32.anInt998 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray9.length) {
					local115 = this.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray114[local31] += arg2;
						this.anIntArray118[local31] += arg3;
						this.anIntArray112[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray9.length) {
					local115 = this.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray114[local31] -= Static32.anInt996;
						this.anIntArray118[local31] -= Static32.anInt997;
						this.anIntArray112[local31] -= Static32.anInt998;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static32.anIntArray122[local225];
							local235 = Static32.anIntArray129[local225];
							local251 = this.anIntArray118[local31] * local231 + this.anIntArray114[local31] * local235 >> 16;
							this.anIntArray118[local31] = this.anIntArray118[local31] * local235 - this.anIntArray114[local31] * local231 >> 16;
							this.anIntArray114[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static32.anIntArray122[local36];
							local235 = Static32.anIntArray129[local36];
							local251 = this.anIntArray118[local31] * local235 - this.anIntArray112[local31] * local231 >> 16;
							this.anIntArray112[local31] = this.anIntArray118[local31] * local231 + this.anIntArray112[local31] * local235 >> 16;
							this.anIntArray118[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static32.anIntArray122[local219];
							local235 = Static32.anIntArray129[local219];
							local251 = this.anIntArray112[local31] * local231 + this.anIntArray114[local31] * local235 >> 16;
							this.anIntArray112[local31] = this.anIntArray112[local31] * local235 - this.anIntArray114[local31] * local231 >> 16;
							this.anIntArray114[local31] = local251;
						}
						this.anIntArray114[local31] += Static32.anInt996;
						this.anIntArray118[local31] += Static32.anInt997;
						this.anIntArray112[local31] += Static32.anInt998;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray9.length) {
					local115 = this.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray114[local31] -= Static32.anInt996;
						this.anIntArray118[local31] -= Static32.anInt997;
						this.anIntArray112[local31] -= Static32.anInt998;
						this.anIntArray114[local31] = this.anIntArray114[local31] * arg2 / 128;
						this.anIntArray118[local31] = this.anIntArray118[local31] * arg3 / 128;
						this.anIntArray112[local31] = this.anIntArray112[local31] * arg4 / 128;
						this.anIntArray114[local31] += Static32.anInt996;
						this.anIntArray118[local31] += Static32.anInt997;
						this.anIntArray112[local31] += Static32.anInt998;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray8 != null && this.anIntArray103 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray8.length) {
					local115 = this.anIntArrayArray8[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray103[local31] += arg2 * 8;
						if (this.anIntArray103[local31] < 0) {
							this.anIntArray103[local31] = 0;
						}
						if (this.anIntArray103[local31] > 255) {
							this.anIntArray103[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "(I)V")
	private void method711(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static106.anInt2840;
		@Pc(3) int local3 = Static106.anInt2846;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray113[arg0];
		@Pc(15) int local15 = this.anIntArray119[arg0];
		@Pc(20) int local20 = this.anIntArray116[arg0];
		@Pc(24) int local24 = Static32.anIntArray128[local10];
		@Pc(28) int local28 = Static32.anIntArray128[local15];
		@Pc(32) int local32 = Static32.anIntArray128[local20];
		if (this.anIntArray103 == null) {
			Static106.anInt2842 = 0;
		} else {
			Static106.anInt2842 = this.anIntArray103[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static32.anIntArray125[0] = Static32.anIntArray138[local10];
			Static32.anIntArray141[0] = Static32.anIntArray130[local10];
			local5++;
			Static32.anIntArray133[0] = this.anIntArray115[arg0];
		} else {
			local71 = Static32.anIntArray132[local10];
			local75 = Static32.anIntArray136[local10];
			local80 = this.anIntArray115[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static32.anIntArray126[local32 - local24];
				Static32.anIntArray125[0] = local1 + (local71 + ((Static32.anIntArray132[local20] - local71) * local93 >> 16) << 9) / 50;
				Static32.anIntArray141[0] = local3 + (local75 + ((Static32.anIntArray136[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static32.anIntArray133[0] = local80 + ((this.anIntArray109[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static32.anIntArray126[local28 - local24];
				Static32.anIntArray125[local5] = local1 + (local71 + ((Static32.anIntArray132[local15] - local71) * local93 >> 16) << 9) / 50;
				Static32.anIntArray141[local5] = local3 + (local75 + ((Static32.anIntArray136[local15] - local75) * local93 >> 16) << 9) / 50;
				Static32.anIntArray133[local5++] = local80 + ((this.anIntArray111[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static32.anIntArray125[local5] = Static32.anIntArray138[local15];
			Static32.anIntArray141[local5] = Static32.anIntArray130[local15];
			Static32.anIntArray133[local5++] = this.anIntArray111[arg0];
		} else {
			local71 = Static32.anIntArray132[local15];
			local75 = Static32.anIntArray136[local15];
			local80 = this.anIntArray111[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static32.anIntArray126[local24 - local28];
				Static32.anIntArray125[local5] = local1 + (local71 + ((Static32.anIntArray132[local10] - local71) * local93 >> 16) << 9) / 50;
				Static32.anIntArray141[local5] = local3 + (local75 + ((Static32.anIntArray136[local10] - local75) * local93 >> 16) << 9) / 50;
				Static32.anIntArray133[local5++] = local80 + ((this.anIntArray115[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static32.anIntArray126[local32 - local28];
				Static32.anIntArray125[local5] = local1 + (local71 + ((Static32.anIntArray132[local20] - local71) * local93 >> 16) << 9) / 50;
				Static32.anIntArray141[local5] = local3 + (local75 + ((Static32.anIntArray136[local20] - local75) * local93 >> 16) << 9) / 50;
				Static32.anIntArray133[local5++] = local80 + ((this.anIntArray109[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static32.anIntArray125[local5] = Static32.anIntArray138[local20];
			Static32.anIntArray141[local5] = Static32.anIntArray130[local20];
			Static32.anIntArray133[local5++] = this.anIntArray109[arg0];
		} else {
			local71 = Static32.anIntArray132[local20];
			local75 = Static32.anIntArray136[local20];
			local80 = this.anIntArray109[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static32.anIntArray126[local28 - local32];
				Static32.anIntArray125[local5] = local1 + (local71 + ((Static32.anIntArray132[local15] - local71) * local93 >> 16) << 9) / 50;
				Static32.anIntArray141[local5] = local3 + (local75 + ((Static32.anIntArray136[local15] - local75) * local93 >> 16) << 9) / 50;
				Static32.anIntArray133[local5++] = local80 + ((this.anIntArray111[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static32.anIntArray126[local24 - local32];
				Static32.anIntArray125[local5] = local1 + (local71 + ((Static32.anIntArray132[local10] - local71) * local93 >> 16) << 9) / 50;
				Static32.anIntArray141[local5] = local3 + (local75 + ((Static32.anIntArray136[local10] - local75) * local93 >> 16) << 9) / 50;
				Static32.anIntArray133[local5++] = local80 + ((this.anIntArray115[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static32.anIntArray125[0];
		local75 = Static32.anIntArray125[1];
		local80 = Static32.anIntArray125[2];
		local93 = Static32.anIntArray141[0];
		@Pc(588) int local588 = Static32.anIntArray141[1];
		@Pc(592) int local592 = Static32.anIntArray141[2];
		Static106.aBoolean131 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static106.anInt2839 || local75 > Static106.anInt2839 || local80 > Static106.anInt2839) {
				Static106.aBoolean131 = true;
			}
			if (this.anIntArray106 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray106[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static106.method2036(local93, local588, local592, local71, local75, local80, Static32.anIntArray133[0], Static32.anIntArray133[1], Static32.anIntArray133[2]);
			} else if (local619 == 1) {
				Static106.method2033(local93, local588, local592, local71, local75, local80, Static32.anIntArray124[this.anIntArray115[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray106[arg0] >> 2;
				local678 = this.anIntArray105[local673];
				local683 = this.anIntArray107[local673];
				local688 = this.anIntArray117[local673];
				Static106.method2028(local93, local588, local592, local71, local75, local80, Static32.anIntArray133[0], Static32.anIntArray133[1], Static32.anIntArray133[2], Static32.anIntArray132[local678], Static32.anIntArray132[local683], Static32.anIntArray132[local688], Static32.anIntArray136[local678], Static32.anIntArray136[local683], Static32.anIntArray136[local688], Static32.anIntArray128[local678], Static32.anIntArray128[local683], Static32.anIntArray128[local688], this.anIntArray104[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray106[arg0] >> 2;
				local678 = this.anIntArray105[local673];
				local683 = this.anIntArray107[local673];
				local688 = this.anIntArray117[local673];
				Static106.method2028(local93, local588, local592, local71, local75, local80, this.anIntArray115[arg0], this.anIntArray115[arg0], this.anIntArray115[arg0], Static32.anIntArray132[local678], Static32.anIntArray132[local683], Static32.anIntArray132[local688], Static32.anIntArray136[local678], Static32.anIntArray136[local683], Static32.anIntArray136[local688], Static32.anIntArray128[local678], Static32.anIntArray128[local683], Static32.anIntArray128[local688], this.anIntArray104[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static106.anInt2839 || local75 > Static106.anInt2839 || local80 > Static106.anInt2839 || Static32.anIntArray125[3] < 0 || Static32.anIntArray125[3] > Static106.anInt2839) {
			Static106.aBoolean131 = true;
		}
		if (this.anIntArray106 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray106[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static106.method2036(local93, local588, local592, local71, local75, local80, Static32.anIntArray133[0], Static32.anIntArray133[1], Static32.anIntArray133[2]);
			Static106.method2036(local93, local592, Static32.anIntArray141[3], local71, local80, Static32.anIntArray125[3], Static32.anIntArray133[0], Static32.anIntArray133[2], Static32.anIntArray133[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static32.anIntArray124[this.anIntArray115[arg0]];
			Static106.method2033(local93, local588, local592, local71, local75, local80, local673);
			Static106.method2033(local93, local592, Static32.anIntArray141[3], local71, local80, Static32.anIntArray125[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray106[arg0] >> 2;
			local678 = this.anIntArray105[local673];
			local683 = this.anIntArray107[local673];
			local688 = this.anIntArray117[local673];
			Static106.method2028(local93, local588, local592, local71, local75, local80, Static32.anIntArray133[0], Static32.anIntArray133[1], Static32.anIntArray133[2], Static32.anIntArray132[local678], Static32.anIntArray132[local683], Static32.anIntArray132[local688], Static32.anIntArray136[local678], Static32.anIntArray136[local683], Static32.anIntArray136[local688], Static32.anIntArray128[local678], Static32.anIntArray128[local683], Static32.anIntArray128[local688], this.anIntArray104[arg0]);
			Static106.method2028(local93, local592, Static32.anIntArray141[3], local71, local80, Static32.anIntArray125[3], Static32.anIntArray133[0], Static32.anIntArray133[2], Static32.anIntArray133[3], Static32.anIntArray132[local678], Static32.anIntArray132[local683], Static32.anIntArray132[local688], Static32.anIntArray136[local678], Static32.anIntArray136[local683], Static32.anIntArray136[local688], Static32.anIntArray128[local678], Static32.anIntArray128[local683], Static32.anIntArray128[local688], this.anIntArray104[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray106[arg0] >> 2;
		local678 = this.anIntArray105[local673];
		local683 = this.anIntArray107[local673];
		local688 = this.anIntArray117[local673];
		Static106.method2028(local93, local588, local592, local71, local75, local80, this.anIntArray115[arg0], this.anIntArray115[arg0], this.anIntArray115[arg0], Static32.anIntArray132[local678], Static32.anIntArray132[local683], Static32.anIntArray132[local688], Static32.anIntArray136[local678], Static32.anIntArray136[local683], Static32.anIntArray136[local688], Static32.anIntArray128[local678], Static32.anIntArray128[local683], Static32.anIntArray128[local688], this.anIntArray104[arg0]);
		Static106.method2028(local93, local592, Static32.anIntArray141[3], local71, local80, Static32.anIntArray125[3], this.anIntArray115[arg0], this.anIntArray115[arg0], this.anIntArray115[arg0], Static32.anIntArray132[local678], Static32.anIntArray132[local683], Static32.anIntArray132[local688], Static32.anIntArray136[local678], Static32.anIntArray136[local683], Static32.anIntArray136[local688], Static32.anIntArray128[local678], Static32.anIntArray128[local683], Static32.anIntArray128[local688], this.anIntArray104[arg0]);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIZ)V")
	public void method712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray115 == null) {
			this.anIntArray115 = new int[this.anInt985];
			this.anIntArray111 = new int[this.anInt985];
			this.anIntArray109 = new int[this.anInt985];
		}
		@Pc(48) int local48;
		if (this.aClass14Array2 == null) {
			this.aClass14Array2 = new Class14[this.anInt988];
			for (local48 = 0; local48 < this.anInt988; local48++) {
				this.aClass14Array2[local48] = new Class14();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt985; local48++) {
			local69 = this.anIntArray113[local48];
			@Pc(74) int local74 = this.anIntArray119[local48];
			@Pc(79) int local79 = this.anIntArray116[local48];
			@Pc(89) int local89 = this.anIntArray114[local74] - this.anIntArray114[local69];
			@Pc(99) int local99 = this.anIntArray118[local74] - this.anIntArray118[local69];
			@Pc(109) int local109 = this.anIntArray112[local74] - this.anIntArray112[local69];
			@Pc(119) int local119 = this.anIntArray114[local79] - this.anIntArray114[local69];
			@Pc(129) int local129 = this.anIntArray118[local79] - this.anIntArray118[local69];
			@Pc(139) int local139 = this.anIntArray112[local79] - this.anIntArray112[local69];
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
			if (this.anIntArray106 == null || (this.anIntArray106[local48] & 0x1) == 0) {
				@Pc(246) Class14 local246 = this.aClass14Array2[local69];
				local246.anInt569 += local147;
				local246.anInt565 += local155;
				local246.anInt567 += local163;
				local246.anInt573++;
				@Pc(275) Class14 local275 = this.aClass14Array2[local74];
				local275.anInt569 += local147;
				local275.anInt565 += local155;
				local275.anInt567 += local163;
				local275.anInt573++;
				@Pc(304) Class14 local304 = this.aClass14Array2[local79];
				local304.anInt569 += local147;
				local304.anInt565 += local155;
				local304.anInt567 += local163;
				local304.anInt573++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray115[local48] = Static32.method709(this.anIntArray104[local48], local349, this.anIntArray106[local48]);
			}
		}
		if (arg5) {
			this.method700(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass14Array1 = new Class14[this.anInt988];
		for (local69 = 0; local69 < this.anInt988; local69++) {
			@Pc(391) Class14 local391 = this.aClass14Array2[local69];
			@Pc(400) Class14 local400 = this.aClass14Array1[local69] = new Class14();
			local400.anInt569 = local391.anInt569;
			local400.anInt565 = local391.anInt565;
			local400.anInt567 = local391.anInt567;
			local400.anInt573 = local391.anInt573;
		}
		this.anInt992 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method713(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static32.anIntArray131.length < this.anInt985) {
			Static32.anIntArray131 = new int[this.anInt985 + 100];
		}
		return this.method719(arg0, Static32.aClass2_Sub1_Sub2_Sub2_2, Static32.anIntArray131);
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(III)V")
	public void method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt988; local7++) {
			this.anIntArray114[local7] = this.anIntArray114[local7] * arg0 / 128;
			this.anIntArray118[local7] = this.anIntArray118[local7] * arg1 / 128;
			this.anIntArray112[local7] = this.anIntArray112[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ua;I)V")
	public void method715(@OriginalArg(0) Class2_Sub1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray9 == null || arg1 == -1) {
			return;
		}
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		@Pc(18) Class25 local18 = arg0.aClass25Array1[arg1];
		@Pc(21) Class2_Sub2 local21 = local18.aClass2_Sub2_1;
		Static32.anInt996 = 0;
		Static32.anInt997 = 0;
		Static32.anInt998 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt1000; local29++) {
			@Pc(35) int local35 = local18.anIntArray146[local29];
			this.method710(local21.anIntArray28[local35], local21.anIntArrayArray5[local35], local18.anIntArray149[local29], local18.anIntArray144[local29], local18.anIntArray147[local29]);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	public void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt985; local1++) {
			if (this.anIntArray104[local1] == arg0) {
				this.anIntArray104[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "()V")
	public void method717() {
		this.aClass14Array2 = null;
		this.anInt986 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt988; local7++) {
			this.anIntArray112[local7] = -this.anIntArray112[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt985; local24++) {
			@Pc(30) int local30 = this.anIntArray113[local24];
			this.anIntArray113[local24] = this.anIntArray116[local24];
			this.anIntArray116[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "()V")
	public void method718() {
		if (this.anInt986 == 3) {
			return;
		}
		this.anInt986 = 3;
		super.anInt2876 = 0;
		this.anInt993 = 0;
		this.anInt989 = 999999;
		this.anInt984 = -999999;
		this.anInt990 = -99999;
		this.anInt983 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt988; local27++) {
			@Pc(33) int local33 = this.anIntArray114[local27];
			@Pc(38) int local38 = this.anIntArray118[local27];
			@Pc(43) int local43 = this.anIntArray112[local27];
			if (local33 < this.anInt989) {
				this.anInt989 = local33;
			}
			if (local33 > this.anInt984) {
				this.anInt984 = local33;
			}
			if (local43 < this.anInt983) {
				this.anInt983 = local43;
			}
			if (local43 > this.anInt990) {
				this.anInt990 = local43;
			}
			if (-local38 > super.anInt2876) {
				super.anInt2876 = -local38;
			}
			if (local38 > this.anInt993) {
				this.anInt993 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!ga;[I)Lclient!ga;")
	private Class2_Sub1_Sub2_Sub2 method719(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt988 = this.anInt988;
		arg1.anInt985 = this.anInt985;
		arg1.anInt991 = this.anInt991;
		if (arg1.anIntArray114 == null || arg1.anIntArray114.length < this.anInt988) {
			arg1.anIntArray114 = new int[this.anInt988 + 100];
			arg1.anIntArray118 = new int[this.anInt988 + 100];
			arg1.anIntArray112 = new int[this.anInt988 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt988; local43++) {
			arg1.anIntArray114[local43] = this.anIntArray114[local43];
			arg1.anIntArray118[local43] = this.anIntArray118[local43];
			arg1.anIntArray112[local43] = this.anIntArray112[local43];
		}
		if (arg0) {
			arg1.anIntArray103 = this.anIntArray103;
		} else {
			arg1.anIntArray103 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray103 == null) {
				for (local88 = 0; local88 < this.anInt985; local88++) {
					arg1.anIntArray103[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt985; local88++) {
					arg1.anIntArray103[local88] = this.anIntArray103[local88];
				}
			}
		}
		arg1.anIntArray106 = this.anIntArray106;
		arg1.anIntArray104 = this.anIntArray104;
		arg1.anIntArray108 = this.anIntArray108;
		arg1.anInt987 = this.anInt987;
		arg1.anIntArrayArray8 = this.anIntArrayArray8;
		arg1.anIntArrayArray9 = this.anIntArrayArray9;
		arg1.anIntArray113 = this.anIntArray113;
		arg1.anIntArray119 = this.anIntArray119;
		arg1.anIntArray116 = this.anIntArray116;
		arg1.anIntArray115 = this.anIntArray115;
		arg1.anIntArray111 = this.anIntArray111;
		arg1.anIntArray109 = this.anIntArray109;
		arg1.anIntArray105 = this.anIntArray105;
		arg1.anIntArray107 = this.anIntArray107;
		arg1.anIntArray117 = this.anIntArray117;
		arg1.anInt986 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZI)V")
	private void method720(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt984 >= 1500) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt984; local6++) {
			Static32.anIntArray137[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt985; local18++) {
			if (this.anIntArray106 == null || this.anIntArray106[local18] != -1) {
				local33 = this.anIntArray113[local18];
				local38 = this.anIntArray119[local18];
				local43 = this.anIntArray116[local18];
				local47 = Static32.anIntArray138[local33];
				local51 = Static32.anIntArray138[local38];
				local55 = Static32.anIntArray138[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static32.anIntArray132[local33];
					local74 = Static32.anIntArray132[local38];
					@Pc(78) int local78 = Static32.anIntArray132[local43];
					@Pc(82) int local82 = Static32.anIntArray136[local33];
					local86 = Static32.anIntArray136[local38];
					local90 = Static32.anIntArray136[local43];
					@Pc(94) int local94 = Static32.anIntArray128[local33];
					local98 = Static32.anIntArray128[local38];
					@Pc(102) int local102 = Static32.anIntArray128[local43];
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
						Static32.aBooleanArray6[local18] = true;
						@Pc(183) int local183 = (Static32.anIntArray121[local33] + Static32.anIntArray121[local38] + Static32.anIntArray121[local43]) / 3 + this.anInt990;
						Static32.anIntArrayArray10[local183][Static32.anIntArray137[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method698(Static32.anInt999, Static32.anInt995, Static32.anIntArray130[local33], Static32.anIntArray130[local38], Static32.anIntArray130[local43], local47, local51, local55)) {
						Static32.anIntArray140[Static32.anInt994++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static32.anIntArray130[local43] - Static32.anIntArray130[local38]) - (Static32.anIntArray130[local33] - Static32.anIntArray130[local38]) * (local55 - local51) > 0) {
						Static32.aBooleanArray6[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static106.anInt2839 && local51 <= Static106.anInt2839 && local55 <= Static106.anInt2839) {
							Static32.aBooleanArray5[local18] = false;
						} else {
							Static32.aBooleanArray5[local18] = true;
						}
						local70 = (Static32.anIntArray121[local33] + Static32.anIntArray121[local38] + Static32.anIntArray121[local43]) / 3 + this.anInt990;
						Static32.anIntArrayArray10[local70][Static32.anIntArray137[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray108 == null) {
			for (local33 = this.anInt984 - 1; local33 >= 0; local33--) {
				local38 = Static32.anIntArray137[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static32.anIntArrayArray10[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method704(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static32.anIntArray123[local33] = 0;
			Static32.anIntArray127[local33] = 0;
		}
		for (local38 = this.anInt984 - 1; local38 >= 0; local38--) {
			local43 = Static32.anIntArray137[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static32.anIntArrayArray10[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray108[local55];
					local74 = Static32.anIntArray123[local70]++;
					Static32.anIntArrayArray11[local70][local74] = local55;
					if (local70 < 10) {
						Static32.anIntArray127[local70] += local38;
					} else if (local70 == 10) {
						Static32.anIntArray134[local74] = local38;
					} else {
						Static32.anIntArray139[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static32.anIntArray123[1] > 0 || Static32.anIntArray123[2] > 0) {
			local43 = (Static32.anIntArray127[1] + Static32.anIntArray127[2]) / (Static32.anIntArray123[1] + Static32.anIntArray123[2]);
		}
		local47 = 0;
		if (Static32.anIntArray123[3] > 0 || Static32.anIntArray123[4] > 0) {
			local47 = (Static32.anIntArray127[3] + Static32.anIntArray127[4]) / (Static32.anIntArray123[3] + Static32.anIntArray123[4]);
		}
		local51 = 0;
		if (Static32.anIntArray123[6] > 0 || Static32.anIntArray123[8] > 0) {
			local51 = (Static32.anIntArray127[6] + Static32.anIntArray127[8]) / (Static32.anIntArray123[6] + Static32.anIntArray123[8]);
		}
		local70 = 0;
		local74 = Static32.anIntArray123[10];
		@Pc(524) int[] local524 = Static32.anIntArrayArray11[10];
		@Pc(526) int[] local526 = Static32.anIntArray134;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static32.anIntArray123[11];
			local524 = Static32.anIntArrayArray11[11];
			local526 = Static32.anIntArray139;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method704(local524[local70++]);
				if (local70 == local74 && local524 != Static32.anIntArrayArray11[11]) {
					local70 = 0;
					local74 = Static32.anIntArray123[11];
					local524 = Static32.anIntArrayArray11[11];
					local526 = Static32.anIntArray139;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method704(local524[local70++]);
				if (local70 == local74 && local524 != Static32.anIntArrayArray11[11]) {
					local70 = 0;
					local74 = Static32.anIntArray123[11];
					local524 = Static32.anIntArrayArray11[11];
					local526 = Static32.anIntArray139;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method704(local524[local70++]);
				if (local70 == local74 && local524 != Static32.anIntArrayArray11[11]) {
					local70 = 0;
					local74 = Static32.anIntArray123[11];
					local524 = Static32.anIntArrayArray11[11];
					local526 = Static32.anIntArray139;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static32.anIntArray123[local86];
			@Pc(689) int[] local689 = Static32.anIntArrayArray11[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method704(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method704(local524[local70++]);
			if (local70 == local74 && local524 != Static32.anIntArrayArray11[11]) {
				local70 = 0;
				local524 = Static32.anIntArrayArray11[11];
				local74 = Static32.anIntArray123[11];
				local526 = Static32.anIntArray139;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "()V")
	private void method721() {
		if (this.anInt986 == 2) {
			return;
		}
		this.anInt986 = 2;
		this.anInt989 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt988; local12++) {
			@Pc(18) int local18 = this.anIntArray114[local12];
			@Pc(23) int local23 = this.anIntArray118[local12];
			@Pc(28) int local28 = this.anIntArray112[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt989) {
				this.anInt989 = local40;
			}
		}
		this.anInt989 = (int) (Math.sqrt((double) this.anInt989) + 0.99D);
		this.anInt990 = this.anInt989;
		this.anInt984 = this.anInt989 + this.anInt989;
	}
}
