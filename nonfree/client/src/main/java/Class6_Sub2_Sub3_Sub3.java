import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class6_Sub2_Sub3_Sub3 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!jb", name = "oc", descriptor = "[I")
	public static int[] anIntArray129 = new int[128];

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!jb", name = "ob", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!jb", name = "rb", descriptor = "I")
	public int anInt1441;

	@OriginalMember(owner = "client!jb", name = "tb", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!jb", name = "wb", descriptor = "I")
	private int anInt1444;

	@OriginalMember(owner = "client!jb", name = "yb", descriptor = "[Lclient!p;")
	public Class47[] aClass47Array1;

	@OriginalMember(owner = "client!jb", name = "Db", descriptor = "I")
	public int anInt1447;

	@OriginalMember(owner = "client!jb", name = "Fb", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!jb", name = "Gb", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!jb", name = "Ib", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!jb", name = "Kb", descriptor = "I")
	public int anInt1449;

	@OriginalMember(owner = "client!jb", name = "Lb", descriptor = "I")
	public int anInt1450;

	@OriginalMember(owner = "client!jb", name = "Rb", descriptor = "[Lclient!p;")
	public Class47[] aClass47Array2;

	@OriginalMember(owner = "client!jb", name = "Ub", descriptor = "I")
	private int anInt1451;

	@OriginalMember(owner = "client!jb", name = "Eb", descriptor = "I")
	private int anInt1448 = 0;

	@OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
	public int anInt1443 = 0;

	@OriginalMember(owner = "client!jb", name = "Cb", descriptor = "I")
	public int anInt1446 = 0;

	@OriginalMember(owner = "client!jb", name = "zb", descriptor = "I")
	private int anInt1445 = 0;

	@OriginalMember(owner = "client!jb", name = "Jb", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!jb", name = "Tb", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!jb", name = "Pb", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!jb", name = "Nb", descriptor = "[I")
	public int[] anIntArray110;

	@OriginalMember(owner = "client!jb", name = "qb", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!jb", name = "Ab", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!jb", name = "sb", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!jb", name = "Bb", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!jb", name = "Mb", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!jb", name = "Wb", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!jb", name = "Ob", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!jb", name = "pb", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!jb", name = "Hb", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!jb", name = "ub", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!jb", name = "xb", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!jb", name = "Qb", descriptor = "[I")
	private int[] anIntArray113;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray129[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray129[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray129[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray129[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray129[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([B)V")
	public Class6_Sub2_Sub3_Sub3(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class6_Sub1 local21 = new Class6_Sub1(arg0);
		@Pc(26) Class6_Sub1 local26 = new Class6_Sub1(arg0);
		@Pc(31) Class6_Sub1 local31 = new Class6_Sub1(arg0);
		@Pc(36) Class6_Sub1 local36 = new Class6_Sub1(arg0);
		@Pc(41) Class6_Sub1 local41 = new Class6_Sub1(arg0);
		local21.anInt2209 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1500();
		@Pc(55) int local55 = local21.method1500();
		@Pc(59) int local59 = local21.method1495();
		@Pc(63) int local63 = local21.method1495();
		@Pc(67) int local67 = local21.method1495();
		@Pc(71) int local71 = local21.method1495();
		@Pc(75) int local75 = local21.method1495();
		@Pc(79) int local79 = local21.method1495();
		@Pc(83) int local83 = local21.method1500();
		@Pc(87) int local87 = local21.method1500();
		@Pc(91) int local91 = local21.method1500();
		@Pc(95) int local95 = local21.method1500();
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
		this.anInt1446 = local51;
		this.anInt1443 = local55;
		this.anInt1448 = local59;
		this.anIntArray114 = new int[local51];
		this.anIntArray112 = new int[local51];
		this.anIntArray110 = new int[local51];
		this.anIntArray101 = new int[local55];
		this.anIntArray105 = new int[local55];
		this.anIntArray102 = new int[local55];
		this.anIntArray106 = new int[local59];
		this.anIntArray109 = new int[local59];
		this.anIntArray115 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray111 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray100 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray108 = new int[local55];
		} else {
			this.anInt1445 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray103 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray104 = new int[local55];
		}
		this.anIntArray113 = new int[local55];
		local21.anInt2209 = local97;
		local26.anInt2209 = local196;
		local31.anInt2209 = local202;
		local36.anInt2209 = local103;
		local41.anInt2209 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1495();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1492();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1492();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1492();
			}
			this.anIntArray114[local321] = local315 + local328;
			this.anIntArray112[local321] = local317 + local338;
			this.anIntArray110[local321] = local319 + local348;
			local315 = this.anIntArray114[local321];
			local317 = this.anIntArray112[local321];
			local319 = this.anIntArray110[local321];
			if (this.anIntArray111 != null) {
				this.anIntArray111[local321] = local41.method1495();
			}
		}
		local21.anInt2209 = local180;
		local26.anInt2209 = local138;
		local31.anInt2209 = local111;
		local36.anInt2209 = local162;
		local41.anInt2209 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray113[local326] = local21.method1500();
			if (this.anIntArray100 != null) {
				this.anIntArray100[local326] = local26.method1495();
			}
			if (this.anIntArray108 != null) {
				this.anIntArray108[local326] = local31.method1495();
			}
			if (this.anIntArray103 != null) {
				this.anIntArray103[local326] = local36.method1495();
			}
			if (this.anIntArray104 != null) {
				this.anIntArray104[local326] = local41.method1495();
			}
		}
		local21.anInt2209 = local174;
		local26.anInt2209 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1495();
			if (local496 == 1) {
				local328 = local21.method1492() + local489;
				local338 = local21.method1492() + local328;
				local348 = local21.method1492() + local338;
				local489 = local348;
				this.anIntArray101[local491] = local328;
				this.anIntArray105[local491] = local338;
				this.anIntArray102[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1492() + local489;
				local489 = local348;
				this.anIntArray101[local491] = local328;
				this.anIntArray105[local491] = local338;
				this.anIntArray102[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1492() + local489;
				local489 = local348;
				this.anIntArray101[local491] = local328;
				this.anIntArray105[local491] = local338;
				this.anIntArray102[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1492() + local489;
				local489 = local348;
				this.anIntArray101[local491] = local328;
				this.anIntArray105[local491] = local599;
				this.anIntArray102[local491] = local348;
			}
		}
		local21.anInt2209 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray106[local496] = local21.method1500();
			this.anIntArray109[local496] = local21.method1500();
			this.anIntArray115[local496] = local21.method1500();
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub3_Sub3() {
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([Lclient!jb;I)V")
	public Class6_Sub2_Sub3_Sub3(@OriginalArg(0) Class6_Sub2_Sub3_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1446 = 0;
		this.anInt1443 = 0;
		this.anInt1448 = 0;
		this.anInt1445 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class6_Sub2_Sub3_Sub3 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1446 += local43.anInt1446;
				this.anInt1443 += local43.anInt1443;
				this.anInt1448 += local43.anInt1448;
				local18 |= local43.anIntArray100 != null;
				if (local43.anIntArray108 == null) {
					if (this.anInt1445 == -1) {
						this.anInt1445 = local43.anInt1445;
					}
					if (this.anInt1445 != local43.anInt1445) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray103 != null;
				local24 |= local43.anIntArray104 != null;
			}
		}
		this.anIntArray114 = new int[this.anInt1446];
		this.anIntArray112 = new int[this.anInt1446];
		this.anIntArray110 = new int[this.anInt1446];
		this.anIntArray111 = new int[this.anInt1446];
		this.anIntArray101 = new int[this.anInt1443];
		this.anIntArray105 = new int[this.anInt1443];
		this.anIntArray102 = new int[this.anInt1443];
		this.anIntArray106 = new int[this.anInt1448];
		this.anIntArray109 = new int[this.anInt1448];
		this.anIntArray115 = new int[this.anInt1448];
		if (local18) {
			this.anIntArray100 = new int[this.anInt1443];
		}
		if (local20) {
			this.anIntArray108 = new int[this.anInt1443];
		}
		if (local22) {
			this.anIntArray103 = new int[this.anInt1443];
		}
		if (local24) {
			this.anIntArray104 = new int[this.anInt1443];
		}
		this.anIntArray113 = new int[this.anInt1443];
		this.anInt1446 = 0;
		this.anInt1443 = 0;
		this.anInt1448 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class6_Sub2_Sub3_Sub3 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt1443; local223++) {
					if (local18) {
						if (local219.anIntArray100 == null) {
							this.anIntArray100[this.anInt1443] = 0;
						} else {
							local241 = local219.anIntArray100[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray100[this.anInt1443] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray108 == null) {
							this.anIntArray108[this.anInt1443] = local219.anInt1445;
						} else {
							this.anIntArray108[this.anInt1443] = local219.anIntArray108[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray103 == null) {
							this.anIntArray103[this.anInt1443] = 0;
						} else {
							this.anIntArray103[this.anInt1443] = local219.anIntArray103[local223];
						}
					}
					if (local24 && local219.anIntArray104 != null) {
						this.anIntArray104[this.anInt1443] = local219.anIntArray104[local223];
					}
					this.anIntArray113[this.anInt1443] = local219.anIntArray113[local223];
					this.anIntArray101[this.anInt1443] = this.method973(local219, local219.anIntArray101[local223]);
					this.anIntArray105[this.anInt1443] = this.method973(local219, local219.anIntArray105[local223]);
					this.anIntArray102[this.anInt1443] = this.method973(local219, local219.anIntArray102[local223]);
					this.anInt1443++;
				}
				for (local241 = 0; local241 < local219.anInt1448; local241++) {
					this.anIntArray106[this.anInt1448] = this.method973(local219, local219.anIntArray106[local241]);
					this.anIntArray109[this.anInt1448] = this.method973(local219, local219.anIntArray109[local241]);
					this.anIntArray115[this.anInt1448] = this.method973(local219, local219.anIntArray115[local241]);
					this.anInt1448++;
				}
				local212 += local219.anInt1448;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([Lclient!jb;IZ)V")
	public Class6_Sub2_Sub3_Sub3(@OriginalArg(0) Class6_Sub2_Sub3_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1446 = 0;
		this.anInt1443 = 0;
		this.anInt1448 = 0;
		this.anInt1445 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class6_Sub2_Sub3_Sub3 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1446 += local43.anInt1446;
				this.anInt1443 += local43.anInt1443;
				this.anInt1448 += local43.anInt1448;
				local18 |= local43.anIntArray100 != null;
				if (local43.anIntArray108 == null) {
					if (this.anInt1445 == -1) {
						this.anInt1445 = local43.anInt1445;
					}
					if (this.anInt1445 != local43.anInt1445) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray103 != null;
				local24 |= local43.anIntArray113 != null;
			}
		}
		this.anIntArray114 = new int[this.anInt1446];
		this.anIntArray112 = new int[this.anInt1446];
		this.anIntArray110 = new int[this.anInt1446];
		this.anIntArray101 = new int[this.anInt1443];
		this.anIntArray105 = new int[this.anInt1443];
		this.anIntArray102 = new int[this.anInt1443];
		this.anIntArray99 = new int[this.anInt1443];
		this.anIntArray98 = new int[this.anInt1443];
		this.anIntArray107 = new int[this.anInt1443];
		this.anIntArray106 = new int[this.anInt1448];
		this.anIntArray109 = new int[this.anInt1448];
		this.anIntArray115 = new int[this.anInt1448];
		if (local18) {
			this.anIntArray100 = new int[this.anInt1443];
		}
		if (local20) {
			this.anIntArray108 = new int[this.anInt1443];
		}
		if (local22) {
			this.anIntArray103 = new int[this.anInt1443];
		}
		if (local24) {
			this.anIntArray113 = new int[this.anInt1443];
		}
		this.anInt1446 = 0;
		this.anInt1443 = 0;
		this.anInt1448 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class6_Sub2_Sub3_Sub3 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt1446;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt1446; local231++) {
					this.anIntArray114[this.anInt1446] = local224.anIntArray114[local231];
					this.anIntArray112[this.anInt1446] = local224.anIntArray112[local231];
					this.anIntArray110[this.anInt1446] = local224.anIntArray110[local231];
					this.anInt1446++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt1443; local272++) {
					this.anIntArray101[this.anInt1443] = local224.anIntArray101[local272] + local229;
					this.anIntArray105[this.anInt1443] = local224.anIntArray105[local272] + local229;
					this.anIntArray102[this.anInt1443] = local224.anIntArray102[local272] + local229;
					this.anIntArray99[this.anInt1443] = local224.anIntArray99[local272];
					this.anIntArray98[this.anInt1443] = local224.anIntArray98[local272];
					this.anIntArray107[this.anInt1443] = local224.anIntArray107[local272];
					if (local18) {
						if (local224.anIntArray100 == null) {
							this.anIntArray100[this.anInt1443] = 0;
						} else {
							local350 = local224.anIntArray100[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray100[this.anInt1443] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray108 == null) {
							this.anIntArray108[this.anInt1443] = local224.anInt1445;
						} else {
							this.anIntArray108[this.anInt1443] = local224.anIntArray108[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray103 == null) {
							this.anIntArray103[this.anInt1443] = 0;
						} else {
							this.anIntArray103[this.anInt1443] = local224.anIntArray103[local272];
						}
					}
					if (local24 && local224.anIntArray113 != null) {
						this.anIntArray113[this.anInt1443] = local224.anIntArray113[local272];
					}
					this.anInt1443++;
				}
				for (local350 = 0; local350 < local224.anInt1448; local350++) {
					this.anIntArray106[this.anInt1448] = local224.anIntArray106[local350] + local229;
					this.anIntArray109[this.anInt1448] = local224.anIntArray109[local350] + local229;
					this.anIntArray115[this.anInt1448] = local224.anIntArray115[local350] + local229;
					this.anInt1448++;
				}
				local217 += local224.anInt1448;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!jb;ZZZ)V")
	public Class6_Sub2_Sub3_Sub3(@OriginalArg(0) Class6_Sub2_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1446 = arg0.anInt1446;
		this.anInt1443 = arg0.anInt1443;
		this.anInt1448 = arg0.anInt1448;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray114 = arg0.anIntArray114;
			this.anIntArray112 = arg0.anIntArray112;
			this.anIntArray110 = arg0.anIntArray110;
		} else {
			this.anIntArray114 = new int[this.anInt1446];
			this.anIntArray112 = new int[this.anInt1446];
			this.anIntArray110 = new int[this.anInt1446];
			for (local60 = 0; local60 < this.anInt1446; local60++) {
				this.anIntArray114[local60] = arg0.anIntArray114[local60];
				this.anIntArray112[local60] = arg0.anIntArray112[local60];
				this.anIntArray110[local60] = arg0.anIntArray110[local60];
			}
		}
		if (arg2) {
			this.anIntArray113 = arg0.anIntArray113;
		} else {
			this.anIntArray113 = new int[this.anInt1443];
			for (local60 = 0; local60 < this.anInt1443; local60++) {
				this.anIntArray113[local60] = arg0.anIntArray113[local60];
			}
		}
		this.anIntArray103 = arg0.anIntArray103;
		this.anIntArray111 = arg0.anIntArray111;
		this.anIntArray104 = arg0.anIntArray104;
		this.anIntArray100 = arg0.anIntArray100;
		this.anIntArray101 = arg0.anIntArray101;
		this.anIntArray105 = arg0.anIntArray105;
		this.anIntArray102 = arg0.anIntArray102;
		this.anIntArray108 = arg0.anIntArray108;
		this.anInt1445 = arg0.anInt1445;
		this.anIntArray106 = arg0.anIntArray106;
		this.anIntArray109 = arg0.anIntArray109;
		this.anIntArray115 = arg0.anIntArray115;
		this.aBoolean66 = arg0.aBoolean66;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!jb;ZZ)V")
	public Class6_Sub2_Sub3_Sub3(@OriginalArg(0) Class6_Sub2_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt1446 = arg0.anInt1446;
		this.anInt1443 = arg0.anInt1443;
		this.anInt1448 = arg0.anInt1448;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray112 = new int[this.anInt1446];
			for (local37 = 0; local37 < this.anInt1446; local37++) {
				this.anIntArray112[local37] = arg0.anIntArray112[local37];
			}
		} else {
			this.anIntArray112 = arg0.anIntArray112;
		}
		if (arg2) {
			this.anIntArray99 = new int[this.anInt1443];
			this.anIntArray98 = new int[this.anInt1443];
			this.anIntArray107 = new int[this.anInt1443];
			for (local37 = 0; local37 < this.anInt1443; local37++) {
				this.anIntArray99[local37] = arg0.anIntArray99[local37];
				this.anIntArray98[local37] = arg0.anIntArray98[local37];
				this.anIntArray107[local37] = arg0.anIntArray107[local37];
			}
			this.anIntArray100 = new int[this.anInt1443];
			@Pc(115) int local115;
			if (arg0.anIntArray100 == null) {
				for (local115 = 0; local115 < this.anInt1443; local115++) {
					this.anIntArray100[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt1443; local115++) {
					this.anIntArray100[local115] = arg0.anIntArray100[local115];
				}
			}
			this.aClass47Array2 = new Class47[this.anInt1446];
			for (local115 = 0; local115 < this.anInt1446; local115++) {
				@Pc(160) Class47 local160 = this.aClass47Array2[local115] = new Class47();
				@Pc(165) Class47 local165 = arg0.aClass47Array2[local115];
				local160.anInt2113 = local165.anInt2113;
				local160.anInt2123 = local165.anInt2123;
				local160.anInt2115 = local165.anInt2115;
				local160.anInt2114 = local165.anInt2114;
			}
			this.aClass47Array1 = arg0.aClass47Array1;
		} else {
			this.anIntArray99 = arg0.anIntArray99;
			this.anIntArray98 = arg0.anIntArray98;
			this.anIntArray107 = arg0.anIntArray107;
			this.anIntArray100 = arg0.anIntArray100;
		}
		this.anIntArray114 = arg0.anIntArray114;
		this.anIntArray110 = arg0.anIntArray110;
		this.anIntArray113 = arg0.anIntArray113;
		this.anIntArray103 = arg0.anIntArray103;
		this.anIntArray108 = arg0.anIntArray108;
		this.anInt1445 = arg0.anInt1445;
		this.anIntArray101 = arg0.anIntArray101;
		this.anIntArray105 = arg0.anIntArray105;
		this.anIntArray102 = arg0.anIntArray102;
		this.anIntArray106 = arg0.anIntArray106;
		this.anIntArray109 = arg0.anIntArray109;
		this.anIntArray115 = arg0.anIntArray115;
		this.aBoolean66 = arg0.aBoolean66;
		this.anInt1451 = arg0.anInt1451;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	public void method948() {
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1446; local7++) {
			@Pc(13) int local13 = this.anIntArray110[local7];
			this.anIntArray110[local7] = this.anIntArray114[local7];
			this.anIntArray114[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ka;ILclient!ka;I[I)V")
	public void method950(@OriginalArg(0) Class6_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method969(arg0, arg1);
			return;
		}
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		@Pc(24) Class52 local24 = arg0.aClass52Array1[arg1];
		@Pc(29) Class52 local29 = arg2.aClass52Array1[arg3];
		@Pc(32) Class6_Sub14 local32 = local24.aClass6_Sub14_1;
		Static42.anInt1452 = 0;
		Static42.anInt1457 = 0;
		Static42.anInt1456 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt2295; local47++) {
			local53 = local24.anIntArray229[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray291[local53] == 0) {
				this.method977(local32.anIntArray291[local53], local32.anIntArrayArray23[local53], local24.anIntArray225[local47], local24.anIntArray228[local47], local24.anIntArray226[local47]);
			}
		}
		Static42.anInt1452 = 0;
		Static42.anInt1457 = 0;
		Static42.anInt1456 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt2295; local53++) {
			@Pc(118) int local118 = local29.anIntArray229[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray291[local118] == 0) {
				this.method977(local32.anIntArray291[local118], local32.anIntArrayArray23[local118], local29.anIntArray225[local53], local29.anIntArray228[local53], local29.anIntArray226[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V")
	public void method952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt1444 != 2 && this.anInt1444 != 1) {
			this.method956();
		}
		@Pc(11) int local11 = Static30.anInt1193;
		@Pc(13) int local13 = Static30.anInt1196;
		@Pc(17) int local17 = Static42.anIntArray117[0];
		@Pc(21) int local21 = Static42.anIntArray124[0];
		@Pc(25) int local25 = Static42.anIntArray117[arg0];
		@Pc(29) int local29 = Static42.anIntArray124[arg0];
		@Pc(33) int local33 = Static42.anIntArray117[arg1];
		@Pc(37) int local37 = Static42.anIntArray124[arg1];
		@Pc(41) int local41 = Static42.anIntArray117[arg2];
		@Pc(45) int local45 = Static42.anIntArray124[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt1446; local57++) {
			@Pc(63) int local63 = this.anIntArray114[local57];
			@Pc(68) int local68 = this.anIntArray112[local57];
			@Pc(73) int local73 = this.anIntArray110[local57];
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
			Static42.anIntArray126[local57] = local73 - local55;
			Static42.anIntArray123[local57] = local11 + (local63 << 9) / local73;
			Static42.anIntArray137[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt1448 > 0) {
				Static42.anIntArray136[local57] = local63;
				Static42.anIntArray130[local57] = local85;
				Static42.anIntArray131[local57] = local73;
			}
		}
		try {
			this.method975(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
	public void method953() {
		if (this.anInt1444 == 3) {
			return;
		}
		this.anInt1444 = 3;
		super.anInt3206 = 0;
		this.anInt1447 = 0;
		this.anInt1442 = 999999;
		this.anInt1441 = -999999;
		this.anInt1449 = -99999;
		this.anInt1450 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1446; local27++) {
			@Pc(33) int local33 = this.anIntArray114[local27];
			@Pc(38) int local38 = this.anIntArray112[local27];
			@Pc(43) int local43 = this.anIntArray110[local27];
			if (local33 < this.anInt1442) {
				this.anInt1442 = local33;
			}
			if (local33 > this.anInt1441) {
				this.anInt1441 = local33;
			}
			if (local43 < this.anInt1450) {
				this.anInt1450 = local43;
			}
			if (local43 > this.anInt1449) {
				this.anInt1449 = local43;
			}
			if (-local38 > super.anInt3206) {
				super.anInt3206 = -local38;
			}
			if (local38 > this.anInt1447) {
				this.anInt1447 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
	private void method954(@OriginalArg(0) int arg0) {
		if (Static42.aBooleanArray4[arg0]) {
			this.method967(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray101[arg0];
		@Pc(17) int local17 = this.anIntArray105[arg0];
		@Pc(22) int local22 = this.anIntArray102[arg0];
		Static30.aBoolean51 = Static42.aBooleanArray5[arg0];
		if (this.anIntArray103 == null) {
			Static30.anInt1191 = 0;
		} else {
			Static30.anInt1191 = this.anIntArray103[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray100 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray100[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static30.method794(Static42.anIntArray137[local12], Static42.anIntArray137[local17], Static42.anIntArray137[local22], Static42.anIntArray123[local12], Static42.anIntArray123[local17], Static42.anIntArray123[local22], this.anIntArray99[arg0], this.anIntArray98[arg0], this.anIntArray107[arg0]);
		} else if (local42 == 1) {
			Static30.method795(Static42.anIntArray137[local12], Static42.anIntArray137[local17], Static42.anIntArray137[local22], Static42.anIntArray123[local12], Static42.anIntArray123[local17], Static42.anIntArray123[local22], Static42.anIntArray125[this.anIntArray99[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray100[arg0] >> 2;
				local128 = this.anIntArray106[local123];
				local133 = this.anIntArray109[local123];
				local138 = this.anIntArray115[local123];
				Static30.method781(Static42.anIntArray137[local12], Static42.anIntArray137[local17], Static42.anIntArray137[local22], Static42.anIntArray123[local12], Static42.anIntArray123[local17], Static42.anIntArray123[local22], this.anIntArray99[arg0], this.anIntArray98[arg0], this.anIntArray107[arg0], Static42.anIntArray136[local128], Static42.anIntArray136[local133], Static42.anIntArray136[local138], Static42.anIntArray130[local128], Static42.anIntArray130[local133], Static42.anIntArray130[local138], Static42.anIntArray131[local128], Static42.anIntArray131[local133], Static42.anIntArray131[local138], this.anIntArray113[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray100[arg0] >> 2;
				local128 = this.anIntArray106[local123];
				local133 = this.anIntArray109[local123];
				local138 = this.anIntArray115[local123];
				Static30.method781(Static42.anIntArray137[local12], Static42.anIntArray137[local17], Static42.anIntArray137[local22], Static42.anIntArray123[local12], Static42.anIntArray123[local17], Static42.anIntArray123[local22], this.anIntArray99[arg0], this.anIntArray99[arg0], this.anIntArray99[arg0], Static42.anIntArray136[local128], Static42.anIntArray136[local133], Static42.anIntArray136[local138], Static42.anIntArray130[local128], Static42.anIntArray130[local133], Static42.anIntArray130[local138], Static42.anIntArray131[local128], Static42.anIntArray131[local133], Static42.anIntArray131[local138], this.anIntArray113[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
	public void method955(@OriginalArg(0) int arg0) {
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		@Pc(9) int local9 = Static42.anIntArray117[arg0];
		@Pc(13) int local13 = Static42.anIntArray124[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1446; local15++) {
			@Pc(32) int local32 = this.anIntArray112[local15] * local13 - this.anIntArray110[local15] * local9 >> 16;
			this.anIntArray110[local15] = this.anIntArray112[local15] * local9 + this.anIntArray110[local15] * local13 >> 16;
			this.anIntArray112[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
	private void method956() {
		if (this.anInt1444 == 2) {
			return;
		}
		this.anInt1444 = 2;
		this.anInt1442 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1446; local12++) {
			@Pc(18) int local18 = this.anIntArray114[local12];
			@Pc(23) int local23 = this.anIntArray112[local12];
			@Pc(28) int local28 = this.anIntArray110[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1442) {
				this.anInt1442 = local40;
			}
		}
		this.anInt1442 = (int) (Math.sqrt((double) this.anInt1442) + 0.99D);
		this.anInt1449 = this.anInt1442;
		this.anInt1441 = this.anInt1442 + this.anInt1442;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(III)V")
	public void method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1446; local7++) {
			this.anIntArray114[local7] = this.anIntArray114[local7] * arg0 / 128;
			this.anIntArray112[local7] = this.anIntArray112[local7] * arg1 / 128;
			this.anIntArray110[local7] = this.anIntArray110[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	private void method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1443; local1++) {
			local7 = this.anIntArray101[local1];
			@Pc(12) int local12 = this.anIntArray105[local1];
			@Pc(17) int local17 = this.anIntArray102[local1];
			@Pc(30) Class47 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray100 == null) {
				local25 = this.anIntArray113[local1];
				local30 = this.aClass47Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2113 + arg3 * local30.anInt2123 + arg4 * local30.anInt2115) / (arg1 * local30.anInt2114);
				this.anIntArray99[local1] = Static42.method949(local25, local52, 0);
				@Pc(65) Class47 local65 = this.aClass47Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt2113 + arg3 * local65.anInt2123 + arg4 * local65.anInt2115) / (arg1 * local65.anInt2114);
				this.anIntArray98[local1] = Static42.method949(local25, local87, 0);
				@Pc(100) Class47 local100 = this.aClass47Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt2113 + arg3 * local100.anInt2123 + arg4 * local100.anInt2115) / (arg1 * local100.anInt2114);
				this.anIntArray107[local1] = Static42.method949(local25, local122, 0);
			} else if ((this.anIntArray100[local1] & 0x1) == 0) {
				local25 = this.anIntArray113[local1];
				@Pc(148) int local148 = this.anIntArray100[local1];
				local30 = this.aClass47Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2113 + arg3 * local30.anInt2123 + arg4 * local30.anInt2115) / (arg1 * local30.anInt2114);
				this.anIntArray99[local1] = Static42.method949(local25, local52, local148);
				local30 = this.aClass47Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt2113 + arg3 * local30.anInt2123 + arg4 * local30.anInt2115) / (arg1 * local30.anInt2114);
				this.anIntArray98[local1] = Static42.method949(local25, local52, local148);
				local30 = this.aClass47Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt2113 + arg3 * local30.anInt2123 + arg4 * local30.anInt2115) / (arg1 * local30.anInt2114);
				this.anIntArray107[local1] = Static42.method949(local25, local52, local148);
			}
		}
		this.aClass47Array2 = null;
		this.aClass47Array1 = null;
		this.anIntArray111 = null;
		this.anIntArray104 = null;
		if (this.anIntArray100 != null) {
			for (local7 = 0; local7 < this.anInt1443; local7++) {
				if ((this.anIntArray100[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray113 = null;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method959(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static42.anIntArray121.length < this.anInt1443) {
			Static42.anIntArray121 = new int[this.anInt1443 + 100];
		}
		return this.method960(arg0, Static42.aClass6_Sub2_Sub3_Sub3_3, Static42.anIntArray121);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!jb;[I)Lclient!jb;")
	private Class6_Sub2_Sub3_Sub3 method960(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub2_Sub3_Sub3 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt1446 = this.anInt1446;
		arg1.anInt1443 = this.anInt1443;
		arg1.anInt1448 = this.anInt1448;
		if (arg1.anIntArray114 == null || arg1.anIntArray114.length < this.anInt1446) {
			arg1.anIntArray114 = new int[this.anInt1446 + 100];
			arg1.anIntArray112 = new int[this.anInt1446 + 100];
			arg1.anIntArray110 = new int[this.anInt1446 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1446; local43++) {
			arg1.anIntArray114[local43] = this.anIntArray114[local43];
			arg1.anIntArray112[local43] = this.anIntArray112[local43];
			arg1.anIntArray110[local43] = this.anIntArray110[local43];
		}
		if (arg0) {
			arg1.anIntArray103 = this.anIntArray103;
		} else {
			arg1.anIntArray103 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray103 == null) {
				for (local88 = 0; local88 < this.anInt1443; local88++) {
					arg1.anIntArray103[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1443; local88++) {
					arg1.anIntArray103[local88] = this.anIntArray103[local88];
				}
			}
		}
		arg1.anIntArray100 = this.anIntArray100;
		arg1.anIntArray113 = this.anIntArray113;
		arg1.anIntArray108 = this.anIntArray108;
		arg1.anInt1445 = this.anInt1445;
		arg1.anIntArrayArray5 = this.anIntArrayArray5;
		arg1.anIntArrayArray6 = this.anIntArrayArray6;
		arg1.anIntArray101 = this.anIntArray101;
		arg1.anIntArray105 = this.anIntArray105;
		arg1.anIntArray102 = this.anIntArray102;
		arg1.anIntArray99 = this.anIntArray99;
		arg1.anIntArray98 = this.anIntArray98;
		arg1.anIntArray107 = this.anIntArray107;
		arg1.anIntArray106 = this.anIntArray106;
		arg1.anIntArray109 = this.anIntArray109;
		arg1.anIntArray115 = this.anIntArray115;
		arg1.aBoolean66 = this.aBoolean66;
		arg1.anInt1444 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public void method961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1443; local1++) {
			if (this.anIntArray113[local1] == arg0) {
				this.anIntArray113[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIIIII)V")
	public void method963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.anInt1444 != 2 && this.anInt1444 != 1) {
			this.method956();
		}
		@Pc(11) int local11 = Static30.anInt1193;
		@Pc(13) int local13 = Static30.anInt1196;
		@Pc(17) int local17 = Static42.anIntArray117[0];
		@Pc(21) int local21 = Static42.anIntArray124[0];
		@Pc(25) int local25 = Static42.anIntArray117[arg0];
		@Pc(29) int local29 = Static42.anIntArray124[arg0];
		@Pc(33) int local33 = Static42.anIntArray117[arg1];
		@Pc(37) int local37 = Static42.anIntArray124[arg1];
		@Pc(41) int local41 = Static42.anIntArray117[arg2];
		@Pc(45) int local45 = Static42.anIntArray124[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt1446; local57++) {
			@Pc(63) int local63 = this.anIntArray114[local57];
			@Pc(68) int local68 = this.anIntArray112[local57];
			@Pc(73) int local73 = this.anIntArray110[local57];
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
			Static42.anIntArray126[local57] = local73 - local55;
			Static42.anIntArray123[local57] = local11 + (local63 << 9) / arg6;
			Static42.anIntArray137[local57] = local13 + (local85 << 9) / arg6;
			if (this.anInt1448 > 0) {
				Static42.anIntArray136[local57] = local63;
				Static42.anIntArray130[local57] = local85;
				Static42.anIntArray131[local57] = local73;
			}
		}
		try {
			this.method975(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()V")
	public void method964() {
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1446; local7++) {
			this.anIntArray110[local7] = -this.anIntArray110[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt1443; local24++) {
			@Pc(30) int local30 = this.anIntArray101[local24];
			this.anIntArray101[local24] = this.anIntArray102[local24];
			this.anIntArray102[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZ)V")
	public void method965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray99 == null) {
			this.anIntArray99 = new int[this.anInt1443];
			this.anIntArray98 = new int[this.anInt1443];
			this.anIntArray107 = new int[this.anInt1443];
		}
		@Pc(48) int local48;
		if (this.aClass47Array2 == null) {
			this.aClass47Array2 = new Class47[this.anInt1446];
			for (local48 = 0; local48 < this.anInt1446; local48++) {
				this.aClass47Array2[local48] = new Class47();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt1443; local48++) {
			local69 = this.anIntArray101[local48];
			@Pc(74) int local74 = this.anIntArray105[local48];
			@Pc(79) int local79 = this.anIntArray102[local48];
			@Pc(89) int local89 = this.anIntArray114[local74] - this.anIntArray114[local69];
			@Pc(99) int local99 = this.anIntArray112[local74] - this.anIntArray112[local69];
			@Pc(109) int local109 = this.anIntArray110[local74] - this.anIntArray110[local69];
			@Pc(119) int local119 = this.anIntArray114[local79] - this.anIntArray114[local69];
			@Pc(129) int local129 = this.anIntArray112[local79] - this.anIntArray112[local69];
			@Pc(139) int local139 = this.anIntArray110[local79] - this.anIntArray110[local69];
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
			if (this.anIntArray100 == null || (this.anIntArray100[local48] & 0x1) == 0) {
				@Pc(246) Class47 local246 = this.aClass47Array2[local69];
				local246.anInt2113 += local147;
				local246.anInt2123 += local155;
				local246.anInt2115 += local163;
				local246.anInt2114++;
				@Pc(275) Class47 local275 = this.aClass47Array2[local74];
				local275.anInt2113 += local147;
				local275.anInt2123 += local155;
				local275.anInt2115 += local163;
				local275.anInt2114++;
				@Pc(304) Class47 local304 = this.aClass47Array2[local79];
				local304.anInt2113 += local147;
				local304.anInt2123 += local155;
				local304.anInt2115 += local163;
				local304.anInt2114++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray99[local48] = Static42.method949(this.anIntArray113[local48], local349, this.anIntArray100[local48]);
			}
		}
		if (arg5) {
			this.method958(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass47Array1 = new Class47[this.anInt1446];
		for (local69 = 0; local69 < this.anInt1446; local69++) {
			@Pc(391) Class47 local391 = this.aClass47Array2[local69];
			@Pc(400) Class47 local400 = this.aClass47Array1[local69] = new Class47();
			local400.anInt2113 = local391.anInt2113;
			local400.anInt2123 = local391.anInt2123;
			local400.anInt2115 = local391.anInt2115;
			local400.anInt2114 = local391.anInt2114;
		}
		this.anInt1451 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method966(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static42.anIntArray116.length < this.anInt1443) {
			Static42.anIntArray116 = new int[this.anInt1443 + 100];
		}
		return this.method960(arg0, Static42.aClass6_Sub2_Sub3_Sub3_2, Static42.anIntArray116);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt1444 != 1) {
			this.method970();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt1442 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt1442 << 9;
		if (local60 / local36 >= Static30.anInt1197) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt1442 << 9;
		if (local73 / local36 <= Static30.anInt1192) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt1442 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static30.anInt1190) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt3206 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static30.anInt1194) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt3206 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt1448 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static42.aBoolean67) {
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
			local215 = Static42.anInt1454 - Static30.anInt1193;
			local219 = Static42.anInt1455 - Static30.anInt1196;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean66) {
					Static42.anIntArray119[Static42.anInt1453++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static30.anInt1193;
		local215 = Static30.anInt1196;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static42.anIntArray117[arg0];
			local253 = Static42.anIntArray124[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt1446; local265++) {
			@Pc(271) int local271 = this.anIntArray114[local265];
			@Pc(276) int local276 = this.anIntArray112[local265];
			@Pc(281) int local281 = this.anIntArray110[local265];
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
			Static42.anIntArray126[local265] = local281 - local25;
			if (local281 >= 50) {
				Static42.anIntArray123[local265] = local168 + (local271 << 9) / local281;
				Static42.anIntArray137[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static42.anIntArray123[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static42.anIntArray136[local265] = local271;
				Static42.anIntArray130[local265] = local293;
				Static42.anIntArray131[local265] = local281;
			}
		}
		try {
			this.method975(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "(I)V")
	private void method967(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static30.anInt1193;
		@Pc(3) int local3 = Static30.anInt1196;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray101[arg0];
		@Pc(15) int local15 = this.anIntArray105[arg0];
		@Pc(20) int local20 = this.anIntArray102[arg0];
		@Pc(24) int local24 = Static42.anIntArray131[local10];
		@Pc(28) int local28 = Static42.anIntArray131[local15];
		@Pc(32) int local32 = Static42.anIntArray131[local20];
		if (this.anIntArray103 == null) {
			Static30.anInt1191 = 0;
		} else {
			Static30.anInt1191 = this.anIntArray103[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static42.anIntArray134[0] = Static42.anIntArray123[local10];
			Static42.anIntArray122[0] = Static42.anIntArray137[local10];
			local5++;
			Static42.anIntArray120[0] = this.anIntArray99[arg0];
		} else {
			local71 = Static42.anIntArray136[local10];
			local75 = Static42.anIntArray130[local10];
			local80 = this.anIntArray99[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static42.anIntArray128[local32 - local24];
				Static42.anIntArray134[0] = local1 + (local71 + ((Static42.anIntArray136[local20] - local71) * local93 >> 16) << 9) / 50;
				Static42.anIntArray122[0] = local3 + (local75 + ((Static42.anIntArray130[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static42.anIntArray120[0] = local80 + ((this.anIntArray107[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static42.anIntArray128[local28 - local24];
				Static42.anIntArray134[local5] = local1 + (local71 + ((Static42.anIntArray136[local15] - local71) * local93 >> 16) << 9) / 50;
				Static42.anIntArray122[local5] = local3 + (local75 + ((Static42.anIntArray130[local15] - local75) * local93 >> 16) << 9) / 50;
				Static42.anIntArray120[local5++] = local80 + ((this.anIntArray98[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static42.anIntArray134[local5] = Static42.anIntArray123[local15];
			Static42.anIntArray122[local5] = Static42.anIntArray137[local15];
			Static42.anIntArray120[local5++] = this.anIntArray98[arg0];
		} else {
			local71 = Static42.anIntArray136[local15];
			local75 = Static42.anIntArray130[local15];
			local80 = this.anIntArray98[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static42.anIntArray128[local24 - local28];
				Static42.anIntArray134[local5] = local1 + (local71 + ((Static42.anIntArray136[local10] - local71) * local93 >> 16) << 9) / 50;
				Static42.anIntArray122[local5] = local3 + (local75 + ((Static42.anIntArray130[local10] - local75) * local93 >> 16) << 9) / 50;
				Static42.anIntArray120[local5++] = local80 + ((this.anIntArray99[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static42.anIntArray128[local32 - local28];
				Static42.anIntArray134[local5] = local1 + (local71 + ((Static42.anIntArray136[local20] - local71) * local93 >> 16) << 9) / 50;
				Static42.anIntArray122[local5] = local3 + (local75 + ((Static42.anIntArray130[local20] - local75) * local93 >> 16) << 9) / 50;
				Static42.anIntArray120[local5++] = local80 + ((this.anIntArray107[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static42.anIntArray134[local5] = Static42.anIntArray123[local20];
			Static42.anIntArray122[local5] = Static42.anIntArray137[local20];
			Static42.anIntArray120[local5++] = this.anIntArray107[arg0];
		} else {
			local71 = Static42.anIntArray136[local20];
			local75 = Static42.anIntArray130[local20];
			local80 = this.anIntArray107[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static42.anIntArray128[local28 - local32];
				Static42.anIntArray134[local5] = local1 + (local71 + ((Static42.anIntArray136[local15] - local71) * local93 >> 16) << 9) / 50;
				Static42.anIntArray122[local5] = local3 + (local75 + ((Static42.anIntArray130[local15] - local75) * local93 >> 16) << 9) / 50;
				Static42.anIntArray120[local5++] = local80 + ((this.anIntArray98[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static42.anIntArray128[local24 - local32];
				Static42.anIntArray134[local5] = local1 + (local71 + ((Static42.anIntArray136[local10] - local71) * local93 >> 16) << 9) / 50;
				Static42.anIntArray122[local5] = local3 + (local75 + ((Static42.anIntArray130[local10] - local75) * local93 >> 16) << 9) / 50;
				Static42.anIntArray120[local5++] = local80 + ((this.anIntArray99[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static42.anIntArray134[0];
		local75 = Static42.anIntArray134[1];
		local80 = Static42.anIntArray134[2];
		local93 = Static42.anIntArray122[0];
		@Pc(588) int local588 = Static42.anIntArray122[1];
		@Pc(592) int local592 = Static42.anIntArray122[2];
		Static30.aBoolean51 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static30.anInt1189 || local75 > Static30.anInt1189 || local80 > Static30.anInt1189) {
				Static30.aBoolean51 = true;
			}
			if (this.anIntArray100 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray100[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static30.method794(local93, local588, local592, local71, local75, local80, Static42.anIntArray120[0], Static42.anIntArray120[1], Static42.anIntArray120[2]);
			} else if (local619 == 1) {
				Static30.method795(local93, local588, local592, local71, local75, local80, Static42.anIntArray125[this.anIntArray99[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray100[arg0] >> 2;
				local678 = this.anIntArray106[local673];
				local683 = this.anIntArray109[local673];
				local688 = this.anIntArray115[local673];
				Static30.method781(local93, local588, local592, local71, local75, local80, Static42.anIntArray120[0], Static42.anIntArray120[1], Static42.anIntArray120[2], Static42.anIntArray136[local678], Static42.anIntArray136[local683], Static42.anIntArray136[local688], Static42.anIntArray130[local678], Static42.anIntArray130[local683], Static42.anIntArray130[local688], Static42.anIntArray131[local678], Static42.anIntArray131[local683], Static42.anIntArray131[local688], this.anIntArray113[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray100[arg0] >> 2;
				local678 = this.anIntArray106[local673];
				local683 = this.anIntArray109[local673];
				local688 = this.anIntArray115[local673];
				Static30.method781(local93, local588, local592, local71, local75, local80, this.anIntArray99[arg0], this.anIntArray99[arg0], this.anIntArray99[arg0], Static42.anIntArray136[local678], Static42.anIntArray136[local683], Static42.anIntArray136[local688], Static42.anIntArray130[local678], Static42.anIntArray130[local683], Static42.anIntArray130[local688], Static42.anIntArray131[local678], Static42.anIntArray131[local683], Static42.anIntArray131[local688], this.anIntArray113[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static30.anInt1189 || local75 > Static30.anInt1189 || local80 > Static30.anInt1189 || Static42.anIntArray134[3] < 0 || Static42.anIntArray134[3] > Static30.anInt1189) {
			Static30.aBoolean51 = true;
		}
		if (this.anIntArray100 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray100[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static30.method794(local93, local588, local592, local71, local75, local80, Static42.anIntArray120[0], Static42.anIntArray120[1], Static42.anIntArray120[2]);
			Static30.method794(local93, local592, Static42.anIntArray122[3], local71, local80, Static42.anIntArray134[3], Static42.anIntArray120[0], Static42.anIntArray120[2], Static42.anIntArray120[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static42.anIntArray125[this.anIntArray99[arg0]];
			Static30.method795(local93, local588, local592, local71, local75, local80, local673);
			Static30.method795(local93, local592, Static42.anIntArray122[3], local71, local80, Static42.anIntArray134[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray100[arg0] >> 2;
			local678 = this.anIntArray106[local673];
			local683 = this.anIntArray109[local673];
			local688 = this.anIntArray115[local673];
			Static30.method781(local93, local588, local592, local71, local75, local80, Static42.anIntArray120[0], Static42.anIntArray120[1], Static42.anIntArray120[2], Static42.anIntArray136[local678], Static42.anIntArray136[local683], Static42.anIntArray136[local688], Static42.anIntArray130[local678], Static42.anIntArray130[local683], Static42.anIntArray130[local688], Static42.anIntArray131[local678], Static42.anIntArray131[local683], Static42.anIntArray131[local688], this.anIntArray113[arg0]);
			Static30.method781(local93, local592, Static42.anIntArray122[3], local71, local80, Static42.anIntArray134[3], Static42.anIntArray120[0], Static42.anIntArray120[2], Static42.anIntArray120[3], Static42.anIntArray136[local678], Static42.anIntArray136[local683], Static42.anIntArray136[local688], Static42.anIntArray130[local678], Static42.anIntArray130[local683], Static42.anIntArray130[local688], Static42.anIntArray131[local678], Static42.anIntArray131[local683], Static42.anIntArray131[local688], this.anIntArray113[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray100[arg0] >> 2;
		local678 = this.anIntArray106[local673];
		local683 = this.anIntArray109[local673];
		local688 = this.anIntArray115[local673];
		Static30.method781(local93, local588, local592, local71, local75, local80, this.anIntArray99[arg0], this.anIntArray99[arg0], this.anIntArray99[arg0], Static42.anIntArray136[local678], Static42.anIntArray136[local683], Static42.anIntArray136[local688], Static42.anIntArray130[local678], Static42.anIntArray130[local683], Static42.anIntArray130[local688], Static42.anIntArray131[local678], Static42.anIntArray131[local683], Static42.anIntArray131[local688], this.anIntArray113[arg0]);
		Static30.method781(local93, local592, Static42.anIntArray122[3], local71, local80, Static42.anIntArray134[3], this.anIntArray99[arg0], this.anIntArray99[arg0], this.anIntArray99[arg0], Static42.anIntArray136[local678], Static42.anIntArray136[local683], Static42.anIntArray136[local688], Static42.anIntArray130[local678], Static42.anIntArray130[local683], Static42.anIntArray130[local688], Static42.anIntArray131[local678], Static42.anIntArray131[local683], Static42.anIntArray131[local688], this.anIntArray113[arg0]);
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()V")
	public void method968() {
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1446; local7++) {
			@Pc(13) int local13 = this.anIntArray114[local7];
			this.anIntArray114[local7] = this.anIntArray110[local7];
			this.anIntArray110[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method969(@OriginalArg(0) Class6_Sub2_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray6 == null || arg1 == -1) {
			return;
		}
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		@Pc(18) Class52 local18 = arg0.aClass52Array1[arg1];
		@Pc(21) Class6_Sub14 local21 = local18.aClass6_Sub14_1;
		Static42.anInt1452 = 0;
		Static42.anInt1457 = 0;
		Static42.anInt1456 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt2295; local29++) {
			@Pc(35) int local35 = local18.anIntArray229[local29];
			this.method977(local21.anIntArray291[local35], local21.anIntArrayArray23[local35], local18.anIntArray225[local29], local18.anIntArray228[local29], local18.anIntArray226[local29]);
		}
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "()V")
	public void method970() {
		if (this.anInt1444 == 1) {
			return;
		}
		this.anInt1444 = 1;
		super.anInt3206 = 0;
		this.anInt1447 = 0;
		this.anInt1442 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1446; local18++) {
			@Pc(24) int local24 = this.anIntArray114[local18];
			@Pc(29) int local29 = this.anIntArray112[local18];
			@Pc(34) int local34 = this.anIntArray110[local18];
			if (-local29 > super.anInt3206) {
				super.anInt3206 = -local29;
			}
			if (local29 > this.anInt1447) {
				this.anInt1447 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1442) {
				this.anInt1442 = local58;
			}
		}
		this.anInt1442 = (int) (Math.sqrt((double) this.anInt1442) + 0.99D);
		this.anInt1449 = (int) (Math.sqrt((double) (this.anInt1442 * this.anInt1442 + super.anInt3206 * super.anInt3206)) + 0.99D);
		this.anInt1441 = this.anInt1449 + (int) (Math.sqrt((double) (this.anInt1442 * this.anInt1442 + this.anInt1447 * this.anInt1447)) + 0.99D);
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(III)V")
	public void method971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1444 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1446; local4++) {
			this.anIntArray114[local4] += arg0;
			this.anIntArray112[local4] += arg1;
			this.anIntArray110[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "()I")
	public int method972() {
		this.method970();
		return this.anInt1442;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!jb;I)I")
	private int method973(@OriginalArg(0) Class6_Sub2_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray114[arg1];
		@Pc(11) int local11 = arg0.anIntArray112[arg1];
		@Pc(16) int local16 = arg0.anIntArray110[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1446; local18++) {
			if (local6 == this.anIntArray114[local18] && local11 == this.anIntArray112[local18] && local16 == this.anIntArray110[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray114[this.anInt1446] = local6;
			this.anIntArray112[this.anInt1446] = local11;
			this.anIntArray110[this.anInt1446] = local16;
			if (arg0.anIntArray111 != null) {
				this.anIntArray111[this.anInt1446] = arg0.anIntArray111[arg1];
			}
			local1 = this.anInt1446++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZI)V")
	private void method975(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1441 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1441; local6++) {
			Static42.anIntArray133[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1443; local18++) {
			if (this.anIntArray100 == null || this.anIntArray100[local18] != -1) {
				local33 = this.anIntArray101[local18];
				local38 = this.anIntArray105[local18];
				local43 = this.anIntArray102[local18];
				local47 = Static42.anIntArray123[local33];
				local51 = Static42.anIntArray123[local38];
				local55 = Static42.anIntArray123[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static42.anIntArray136[local33];
					local74 = Static42.anIntArray136[local38];
					@Pc(78) int local78 = Static42.anIntArray136[local43];
					@Pc(82) int local82 = Static42.anIntArray130[local33];
					local86 = Static42.anIntArray130[local38];
					local90 = Static42.anIntArray130[local43];
					@Pc(94) int local94 = Static42.anIntArray131[local33];
					local98 = Static42.anIntArray131[local38];
					@Pc(102) int local102 = Static42.anIntArray131[local43];
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
						Static42.aBooleanArray4[local18] = true;
						@Pc(183) int local183 = (Static42.anIntArray126[local33] + Static42.anIntArray126[local38] + Static42.anIntArray126[local43]) / 3 + this.anInt1449;
						Static42.anIntArrayArray7[local183][Static42.anIntArray133[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method951(Static42.anInt1454, Static42.anInt1455, Static42.anIntArray137[local33], Static42.anIntArray137[local38], Static42.anIntArray137[local43], local47, local51, local55)) {
						Static42.anIntArray119[Static42.anInt1453++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static42.anIntArray137[local43] - Static42.anIntArray137[local38]) - (Static42.anIntArray137[local33] - Static42.anIntArray137[local38]) * (local55 - local51) > 0) {
						Static42.aBooleanArray4[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static30.anInt1189 && local51 <= Static30.anInt1189 && local55 <= Static30.anInt1189) {
							Static42.aBooleanArray5[local18] = false;
						} else {
							Static42.aBooleanArray5[local18] = true;
						}
						local70 = (Static42.anIntArray126[local33] + Static42.anIntArray126[local38] + Static42.anIntArray126[local43]) / 3 + this.anInt1449;
						Static42.anIntArrayArray7[local70][Static42.anIntArray133[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray108 == null) {
			for (local33 = this.anInt1441 - 1; local33 >= 0; local33--) {
				local38 = Static42.anIntArray133[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static42.anIntArrayArray7[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method954(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static42.anIntArray127[local33] = 0;
			Static42.anIntArray118[local33] = 0;
		}
		for (local38 = this.anInt1441 - 1; local38 >= 0; local38--) {
			local43 = Static42.anIntArray133[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static42.anIntArrayArray7[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray108[local55];
					local74 = Static42.anIntArray127[local70]++;
					Static42.anIntArrayArray8[local70][local74] = local55;
					if (local70 < 10) {
						Static42.anIntArray118[local70] += local38;
					} else if (local70 == 10) {
						Static42.anIntArray135[local74] = local38;
					} else {
						Static42.anIntArray132[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static42.anIntArray127[1] > 0 || Static42.anIntArray127[2] > 0) {
			local43 = (Static42.anIntArray118[1] + Static42.anIntArray118[2]) / (Static42.anIntArray127[1] + Static42.anIntArray127[2]);
		}
		local47 = 0;
		if (Static42.anIntArray127[3] > 0 || Static42.anIntArray127[4] > 0) {
			local47 = (Static42.anIntArray118[3] + Static42.anIntArray118[4]) / (Static42.anIntArray127[3] + Static42.anIntArray127[4]);
		}
		local51 = 0;
		if (Static42.anIntArray127[6] > 0 || Static42.anIntArray127[8] > 0) {
			local51 = (Static42.anIntArray118[6] + Static42.anIntArray118[8]) / (Static42.anIntArray127[6] + Static42.anIntArray127[8]);
		}
		local70 = 0;
		local74 = Static42.anIntArray127[10];
		@Pc(524) int[] local524 = Static42.anIntArrayArray8[10];
		@Pc(526) int[] local526 = Static42.anIntArray135;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static42.anIntArray127[11];
			local524 = Static42.anIntArrayArray8[11];
			local526 = Static42.anIntArray132;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method954(local524[local70++]);
				if (local70 == local74 && local524 != Static42.anIntArrayArray8[11]) {
					local70 = 0;
					local74 = Static42.anIntArray127[11];
					local524 = Static42.anIntArrayArray8[11];
					local526 = Static42.anIntArray132;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method954(local524[local70++]);
				if (local70 == local74 && local524 != Static42.anIntArrayArray8[11]) {
					local70 = 0;
					local74 = Static42.anIntArray127[11];
					local524 = Static42.anIntArrayArray8[11];
					local526 = Static42.anIntArray132;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method954(local524[local70++]);
				if (local70 == local74 && local524 != Static42.anIntArrayArray8[11]) {
					local70 = 0;
					local74 = Static42.anIntArray127[11];
					local524 = Static42.anIntArrayArray8[11];
					local526 = Static42.anIntArray132;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static42.anIntArray127[local86];
			@Pc(689) int[] local689 = Static42.anIntArrayArray8[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method954(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method954(local524[local70++]);
			if (local70 == local74 && local524 != Static42.anIntArrayArray8[11]) {
				local70 = 0;
				local524 = Static42.anIntArrayArray8[11];
				local74 = Static42.anIntArray127[11];
				local526 = Static42.anIntArray132;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "()V")
	public void method976() {
		this.aClass47Array2 = null;
		this.anInt1444 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1446; local7++) {
			this.anIntArray114[local7] = -this.anIntArray114[local7];
			this.anIntArray110[local7] = -this.anIntArray110[local7];
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIII)V")
	private void method977(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static42.anInt1452 = 0;
			Static42.anInt1457 = 0;
			Static42.anInt1456 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray6.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray6[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static42.anInt1452 += this.anIntArray114[local36];
						Static42.anInt1457 += this.anIntArray112[local36];
						Static42.anInt1456 += this.anIntArray110[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static42.anInt1452 = Static42.anInt1452 / local6 + arg2;
				Static42.anInt1457 = Static42.anInt1457 / local6 + arg3;
				Static42.anInt1456 = Static42.anInt1456 / local6 + arg4;
			} else {
				Static42.anInt1452 = arg2;
				Static42.anInt1457 = arg3;
				Static42.anInt1456 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local115 = this.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray114[local31] += arg2;
						this.anIntArray112[local31] += arg3;
						this.anIntArray110[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local115 = this.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray114[local31] -= Static42.anInt1452;
						this.anIntArray112[local31] -= Static42.anInt1457;
						this.anIntArray110[local31] -= Static42.anInt1456;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static42.anIntArray117[local225];
							local235 = Static42.anIntArray124[local225];
							local251 = this.anIntArray112[local31] * local231 + this.anIntArray114[local31] * local235 >> 16;
							this.anIntArray112[local31] = this.anIntArray112[local31] * local235 - this.anIntArray114[local31] * local231 >> 16;
							this.anIntArray114[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static42.anIntArray117[local36];
							local235 = Static42.anIntArray124[local36];
							local251 = this.anIntArray112[local31] * local235 - this.anIntArray110[local31] * local231 >> 16;
							this.anIntArray110[local31] = this.anIntArray112[local31] * local231 + this.anIntArray110[local31] * local235 >> 16;
							this.anIntArray112[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static42.anIntArray117[local219];
							local235 = Static42.anIntArray124[local219];
							local251 = this.anIntArray110[local31] * local231 + this.anIntArray114[local31] * local235 >> 16;
							this.anIntArray110[local31] = this.anIntArray110[local31] * local235 - this.anIntArray114[local31] * local231 >> 16;
							this.anIntArray114[local31] = local251;
						}
						this.anIntArray114[local31] += Static42.anInt1452;
						this.anIntArray112[local31] += Static42.anInt1457;
						this.anIntArray110[local31] += Static42.anInt1456;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local115 = this.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray114[local31] -= Static42.anInt1452;
						this.anIntArray112[local31] -= Static42.anInt1457;
						this.anIntArray110[local31] -= Static42.anInt1456;
						this.anIntArray114[local31] = this.anIntArray114[local31] * arg2 / 128;
						this.anIntArray112[local31] = this.anIntArray112[local31] * arg3 / 128;
						this.anIntArray110[local31] = this.anIntArray110[local31] * arg4 / 128;
						this.anIntArray114[local31] += Static42.anInt1452;
						this.anIntArray112[local31] += Static42.anInt1457;
						this.anIntArray110[local31] += Static42.anInt1456;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray5 != null && this.anIntArray103 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray5.length) {
					local115 = this.anIntArrayArray5[local14];
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

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "()V")
	public void method978() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray111 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1446; local9++) {
				local15 = this.anIntArray111[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray6 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray6[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1446) {
				local65 = this.anIntArray111[local59];
				this.anIntArrayArray6[local65][local5[local65]++] = local59++;
			}
			this.anIntArray111 = null;
		}
		if (this.anIntArray104 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1443; local9++) {
			local15 = this.anIntArray104[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray5 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray5[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1443) {
			local65 = this.anIntArray104[local59];
			this.anIntArrayArray5[local65][local5[local65]++] = local59++;
		}
		this.anIntArray104 = null;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(III)V")
	public void method979() {
		@Pc(4) int local4 = this.anInt1451 >> 16;
		@Pc(11) int local11 = this.anInt1451 << 16 >> 16;
		this.method958(local4, local11, -50, -10, -50);
	}
}
