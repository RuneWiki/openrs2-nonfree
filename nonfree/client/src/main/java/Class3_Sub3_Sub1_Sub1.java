import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub3_Sub1_Sub1 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!de", name = "dc", descriptor = "[I")
	public static int[] anIntArray95 = new int[128];

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "[Lclient!uc;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!de", name = "Hb", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!de", name = "Jb", descriptor = "[Lclient!uc;")
	public Class62[] aClass62Array2;

	@OriginalMember(owner = "client!de", name = "Nb", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!de", name = "Ob", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!de", name = "Tb", descriptor = "I")
	public int anInt544;

	@OriginalMember(owner = "client!de", name = "Ub", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!de", name = "Wb", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!de", name = "Xb", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!de", name = "pc", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!de", name = "rb", descriptor = "I")
	public int anInt538 = 0;

	@OriginalMember(owner = "client!de", name = "Lb", descriptor = "I")
	public int anInt542 = 0;

	@OriginalMember(owner = "client!de", name = "Kb", descriptor = "I")
	private int anInt541 = 0;

	@OriginalMember(owner = "client!de", name = "Gb", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
	private int anInt536 = 0;

	@OriginalMember(owner = "client!de", name = "tb", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!de", name = "Db", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!de", name = "Sb", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!de", name = "Fb", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!de", name = "Vb", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!de", name = "Ib", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!de", name = "Mb", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!de", name = "Pb", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!de", name = "sb", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!de", name = "Bb", descriptor = "[I")
	public int[] anIntArray78;

	@OriginalMember(owner = "client!de", name = "Cb", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!de", name = "zb", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!de", name = "vb", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!de", name = "Eb", descriptor = "[I")
	private int[] anIntArray81;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray95[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray95[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray95[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray95[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray95[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class3_Sub11 local21 = new Class3_Sub11(arg0);
		@Pc(26) Class3_Sub11 local26 = new Class3_Sub11(arg0);
		@Pc(31) Class3_Sub11 local31 = new Class3_Sub11(arg0);
		@Pc(36) Class3_Sub11 local36 = new Class3_Sub11(arg0);
		@Pc(41) Class3_Sub11 local41 = new Class3_Sub11(arg0);
		local21.anInt2060 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1451();
		@Pc(55) int local55 = local21.method1451();
		@Pc(59) int local59 = local21.method1421();
		@Pc(63) int local63 = local21.method1421();
		@Pc(67) int local67 = local21.method1421();
		@Pc(71) int local71 = local21.method1421();
		@Pc(75) int local75 = local21.method1421();
		@Pc(79) int local79 = local21.method1421();
		@Pc(83) int local83 = local21.method1451();
		@Pc(87) int local87 = local21.method1451();
		@Pc(91) int local91 = local21.method1451();
		@Pc(95) int local95 = local21.method1451();
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
		this.anInt538 = local51;
		this.anInt542 = local55;
		this.anInt536 = local59;
		this.anIntArray74 = new int[local51];
		this.anIntArray76 = new int[local51];
		this.anIntArray80 = new int[local51];
		this.anIntArray88 = new int[local55];
		this.anIntArray82 = new int[local55];
		this.anIntArray89 = new int[local55];
		this.anIntArray83 = new int[local59];
		this.anIntArray84 = new int[local59];
		this.anIntArray86 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray73 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray78 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray79 = new int[local55];
		} else {
			this.anInt541 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray77 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray75 = new int[local55];
		}
		this.anIntArray81 = new int[local55];
		local21.anInt2060 = local97;
		local26.anInt2060 = local196;
		local31.anInt2060 = local202;
		local36.anInt2060 = local103;
		local41.anInt2060 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1421();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1446();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1446();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1446();
			}
			this.anIntArray74[local321] = local315 + local328;
			this.anIntArray76[local321] = local317 + local338;
			this.anIntArray80[local321] = local319 + local348;
			local315 = this.anIntArray74[local321];
			local317 = this.anIntArray76[local321];
			local319 = this.anIntArray80[local321];
			if (this.anIntArray73 != null) {
				this.anIntArray73[local321] = local41.method1421();
			}
		}
		local21.anInt2060 = local180;
		local26.anInt2060 = local138;
		local31.anInt2060 = local111;
		local36.anInt2060 = local162;
		local41.anInt2060 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray81[local326] = local21.method1451();
			if (this.anIntArray78 != null) {
				this.anIntArray78[local326] = local26.method1421();
			}
			if (this.anIntArray79 != null) {
				this.anIntArray79[local326] = local31.method1421();
			}
			if (this.anIntArray77 != null) {
				this.anIntArray77[local326] = local36.method1421();
			}
			if (this.anIntArray75 != null) {
				this.anIntArray75[local326] = local41.method1421();
			}
		}
		local21.anInt2060 = local174;
		local26.anInt2060 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1421();
			if (local496 == 1) {
				local328 = local21.method1446() + local489;
				local338 = local21.method1446() + local328;
				local348 = local21.method1446() + local338;
				local489 = local348;
				this.anIntArray88[local491] = local328;
				this.anIntArray82[local491] = local338;
				this.anIntArray89[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1446() + local489;
				local489 = local348;
				this.anIntArray88[local491] = local328;
				this.anIntArray82[local491] = local338;
				this.anIntArray89[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1446() + local489;
				local489 = local348;
				this.anIntArray88[local491] = local328;
				this.anIntArray82[local491] = local338;
				this.anIntArray89[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1446() + local489;
				local489 = local348;
				this.anIntArray88[local491] = local328;
				this.anIntArray82[local491] = local599;
				this.anIntArray89[local491] = local348;
			}
		}
		local21.anInt2060 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray83[local496] = local21.method1451();
			this.anIntArray84[local496] = local21.method1451();
			this.anIntArray86[local496] = local21.method1451();
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([Lclient!de;I)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) Class3_Sub3_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt538 = 0;
		this.anInt542 = 0;
		this.anInt536 = 0;
		this.anInt541 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub3_Sub1_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt538 += local43.anInt538;
				this.anInt542 += local43.anInt542;
				this.anInt536 += local43.anInt536;
				local18 |= local43.anIntArray78 != null;
				if (local43.anIntArray79 == null) {
					if (this.anInt541 == -1) {
						this.anInt541 = local43.anInt541;
					}
					if (this.anInt541 != local43.anInt541) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray77 != null;
				local24 |= local43.anIntArray75 != null;
			}
		}
		this.anIntArray74 = new int[this.anInt538];
		this.anIntArray76 = new int[this.anInt538];
		this.anIntArray80 = new int[this.anInt538];
		this.anIntArray73 = new int[this.anInt538];
		this.anIntArray88 = new int[this.anInt542];
		this.anIntArray82 = new int[this.anInt542];
		this.anIntArray89 = new int[this.anInt542];
		this.anIntArray83 = new int[this.anInt536];
		this.anIntArray84 = new int[this.anInt536];
		this.anIntArray86 = new int[this.anInt536];
		if (local18) {
			this.anIntArray78 = new int[this.anInt542];
		}
		if (local20) {
			this.anIntArray79 = new int[this.anInt542];
		}
		if (local22) {
			this.anIntArray77 = new int[this.anInt542];
		}
		if (local24) {
			this.anIntArray75 = new int[this.anInt542];
		}
		this.anIntArray81 = new int[this.anInt542];
		this.anInt538 = 0;
		this.anInt542 = 0;
		this.anInt536 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class3_Sub3_Sub1_Sub1 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt542; local223++) {
					if (local18) {
						if (local219.anIntArray78 == null) {
							this.anIntArray78[this.anInt542] = 0;
						} else {
							local241 = local219.anIntArray78[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray78[this.anInt542] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray79 == null) {
							this.anIntArray79[this.anInt542] = local219.anInt541;
						} else {
							this.anIntArray79[this.anInt542] = local219.anIntArray79[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray77 == null) {
							this.anIntArray77[this.anInt542] = 0;
						} else {
							this.anIntArray77[this.anInt542] = local219.anIntArray77[local223];
						}
					}
					if (local24 && local219.anIntArray75 != null) {
						this.anIntArray75[this.anInt542] = local219.anIntArray75[local223];
					}
					this.anIntArray81[this.anInt542] = local219.anIntArray81[local223];
					this.anIntArray88[this.anInt542] = this.method410(local219, local219.anIntArray88[local223]);
					this.anIntArray82[this.anInt542] = this.method410(local219, local219.anIntArray82[local223]);
					this.anIntArray89[this.anInt542] = this.method410(local219, local219.anIntArray89[local223]);
					this.anInt542++;
				}
				for (local241 = 0; local241 < local219.anInt536; local241++) {
					this.anIntArray83[this.anInt536] = this.method410(local219, local219.anIntArray83[local241]);
					this.anIntArray84[this.anInt536] = this.method410(local219, local219.anIntArray84[local241]);
					this.anIntArray86[this.anInt536] = this.method410(local219, local219.anIntArray86[local241]);
					this.anInt536++;
				}
				local212 += local219.anInt536;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([Lclient!de;IZ)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) Class3_Sub3_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt538 = 0;
		this.anInt542 = 0;
		this.anInt536 = 0;
		this.anInt541 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class3_Sub3_Sub1_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt538 += local43.anInt538;
				this.anInt542 += local43.anInt542;
				this.anInt536 += local43.anInt536;
				local18 |= local43.anIntArray78 != null;
				if (local43.anIntArray79 == null) {
					if (this.anInt541 == -1) {
						this.anInt541 = local43.anInt541;
					}
					if (this.anInt541 != local43.anInt541) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray77 != null;
				local24 |= local43.anIntArray81 != null;
			}
		}
		this.anIntArray74 = new int[this.anInt538];
		this.anIntArray76 = new int[this.anInt538];
		this.anIntArray80 = new int[this.anInt538];
		this.anIntArray88 = new int[this.anInt542];
		this.anIntArray82 = new int[this.anInt542];
		this.anIntArray89 = new int[this.anInt542];
		this.anIntArray90 = new int[this.anInt542];
		this.anIntArray85 = new int[this.anInt542];
		this.anIntArray105 = new int[this.anInt542];
		this.anIntArray83 = new int[this.anInt536];
		this.anIntArray84 = new int[this.anInt536];
		this.anIntArray86 = new int[this.anInt536];
		if (local18) {
			this.anIntArray78 = new int[this.anInt542];
		}
		if (local20) {
			this.anIntArray79 = new int[this.anInt542];
		}
		if (local22) {
			this.anIntArray77 = new int[this.anInt542];
		}
		if (local24) {
			this.anIntArray81 = new int[this.anInt542];
		}
		this.anInt538 = 0;
		this.anInt542 = 0;
		this.anInt536 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class3_Sub3_Sub1_Sub1 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt538;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt538; local231++) {
					this.anIntArray74[this.anInt538] = local224.anIntArray74[local231];
					this.anIntArray76[this.anInt538] = local224.anIntArray76[local231];
					this.anIntArray80[this.anInt538] = local224.anIntArray80[local231];
					this.anInt538++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt542; local272++) {
					this.anIntArray88[this.anInt542] = local224.anIntArray88[local272] + local229;
					this.anIntArray82[this.anInt542] = local224.anIntArray82[local272] + local229;
					this.anIntArray89[this.anInt542] = local224.anIntArray89[local272] + local229;
					this.anIntArray90[this.anInt542] = local224.anIntArray90[local272];
					this.anIntArray85[this.anInt542] = local224.anIntArray85[local272];
					this.anIntArray105[this.anInt542] = local224.anIntArray105[local272];
					if (local18) {
						if (local224.anIntArray78 == null) {
							this.anIntArray78[this.anInt542] = 0;
						} else {
							local350 = local224.anIntArray78[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray78[this.anInt542] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray79 == null) {
							this.anIntArray79[this.anInt542] = local224.anInt541;
						} else {
							this.anIntArray79[this.anInt542] = local224.anIntArray79[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray77 == null) {
							this.anIntArray77[this.anInt542] = 0;
						} else {
							this.anIntArray77[this.anInt542] = local224.anIntArray77[local272];
						}
					}
					if (local24 && local224.anIntArray81 != null) {
						this.anIntArray81[this.anInt542] = local224.anIntArray81[local272];
					}
					this.anInt542++;
				}
				for (local350 = 0; local350 < local224.anInt536; local350++) {
					this.anIntArray83[this.anInt536] = local224.anIntArray83[local350] + local229;
					this.anIntArray84[this.anInt536] = local224.anIntArray84[local350] + local229;
					this.anIntArray86[this.anInt536] = local224.anIntArray86[local350] + local229;
					this.anInt536++;
				}
				local217 += local224.anInt536;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!de;ZZZ)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt538 = arg0.anInt538;
		this.anInt542 = arg0.anInt542;
		this.anInt536 = arg0.anInt536;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray74 = arg0.anIntArray74;
			this.anIntArray76 = arg0.anIntArray76;
			this.anIntArray80 = arg0.anIntArray80;
		} else {
			this.anIntArray74 = new int[this.anInt538];
			this.anIntArray76 = new int[this.anInt538];
			this.anIntArray80 = new int[this.anInt538];
			for (local60 = 0; local60 < this.anInt538; local60++) {
				this.anIntArray74[local60] = arg0.anIntArray74[local60];
				this.anIntArray76[local60] = arg0.anIntArray76[local60];
				this.anIntArray80[local60] = arg0.anIntArray80[local60];
			}
		}
		if (arg2) {
			this.anIntArray81 = arg0.anIntArray81;
		} else {
			this.anIntArray81 = new int[this.anInt542];
			for (local60 = 0; local60 < this.anInt542; local60++) {
				this.anIntArray81[local60] = arg0.anIntArray81[local60];
			}
		}
		this.anIntArray77 = arg0.anIntArray77;
		this.anIntArray73 = arg0.anIntArray73;
		this.anIntArray75 = arg0.anIntArray75;
		this.anIntArray78 = arg0.anIntArray78;
		this.anIntArray88 = arg0.anIntArray88;
		this.anIntArray82 = arg0.anIntArray82;
		this.anIntArray89 = arg0.anIntArray89;
		this.anIntArray79 = arg0.anIntArray79;
		this.anInt541 = arg0.anInt541;
		this.anIntArray83 = arg0.anIntArray83;
		this.anIntArray84 = arg0.anIntArray84;
		this.anIntArray86 = arg0.anIntArray86;
		this.aBoolean31 = arg0.aBoolean31;
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!de;ZZ)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt538 = arg0.anInt538;
		this.anInt542 = arg0.anInt542;
		this.anInt536 = arg0.anInt536;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray76 = new int[this.anInt538];
			for (local37 = 0; local37 < this.anInt538; local37++) {
				this.anIntArray76[local37] = arg0.anIntArray76[local37];
			}
		} else {
			this.anIntArray76 = arg0.anIntArray76;
		}
		if (arg2) {
			this.anIntArray90 = new int[this.anInt542];
			this.anIntArray85 = new int[this.anInt542];
			this.anIntArray105 = new int[this.anInt542];
			for (local37 = 0; local37 < this.anInt542; local37++) {
				this.anIntArray90[local37] = arg0.anIntArray90[local37];
				this.anIntArray85[local37] = arg0.anIntArray85[local37];
				this.anIntArray105[local37] = arg0.anIntArray105[local37];
			}
			this.anIntArray78 = new int[this.anInt542];
			@Pc(115) int local115;
			if (arg0.anIntArray78 == null) {
				for (local115 = 0; local115 < this.anInt542; local115++) {
					this.anIntArray78[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt542; local115++) {
					this.anIntArray78[local115] = arg0.anIntArray78[local115];
				}
			}
			this.aClass62Array2 = new Class62[this.anInt538];
			for (local115 = 0; local115 < this.anInt538; local115++) {
				@Pc(160) Class62 local160 = this.aClass62Array2[local115] = new Class62();
				@Pc(165) Class62 local165 = arg0.aClass62Array2[local115];
				local160.anInt2634 = local165.anInt2634;
				local160.anInt2632 = local165.anInt2632;
				local160.anInt2636 = local165.anInt2636;
				local160.anInt2629 = local165.anInt2629;
			}
			this.aClass62Array1 = arg0.aClass62Array1;
		} else {
			this.anIntArray90 = arg0.anIntArray90;
			this.anIntArray85 = arg0.anIntArray85;
			this.anIntArray105 = arg0.anIntArray105;
			this.anIntArray78 = arg0.anIntArray78;
		}
		this.anIntArray74 = arg0.anIntArray74;
		this.anIntArray80 = arg0.anIntArray80;
		this.anIntArray81 = arg0.anIntArray81;
		this.anIntArray77 = arg0.anIntArray77;
		this.anIntArray79 = arg0.anIntArray79;
		this.anInt541 = arg0.anInt541;
		this.anIntArray88 = arg0.anIntArray88;
		this.anIntArray82 = arg0.anIntArray82;
		this.anIntArray89 = arg0.anIntArray89;
		this.anIntArray83 = arg0.anIntArray83;
		this.anIntArray84 = arg0.anIntArray84;
		this.anIntArray86 = arg0.anIntArray86;
		this.aBoolean31 = arg0.aBoolean31;
		this.anInt539 = arg0.anInt539;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)V")
	public void method393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt537 != 2 && this.anInt537 != 1) {
			this.method414();
		}
		@Pc(11) int local11 = Static51.anInt1370;
		@Pc(13) int local13 = Static51.anInt1368;
		@Pc(17) int local17 = Static21.anIntArray99[0];
		@Pc(21) int local21 = Static21.anIntArray96[0];
		@Pc(25) int local25 = Static21.anIntArray99[arg0];
		@Pc(29) int local29 = Static21.anIntArray96[arg0];
		@Pc(33) int local33 = Static21.anIntArray99[arg1];
		@Pc(37) int local37 = Static21.anIntArray96[arg1];
		@Pc(41) int local41 = Static21.anIntArray99[arg2];
		@Pc(45) int local45 = Static21.anIntArray96[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt538; local57++) {
			@Pc(63) int local63 = this.anIntArray74[local57];
			@Pc(68) int local68 = this.anIntArray76[local57];
			@Pc(73) int local73 = this.anIntArray80[local57];
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
			Static21.anIntArray108[local57] = local73 - local55;
			Static21.anIntArray92[local57] = local11 + (local63 << 9) / local73;
			Static21.anIntArray93[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt536 > 0) {
				Static21.anIntArray111[local57] = local63;
				Static21.anIntArray100[local57] = local85;
				Static21.anIntArray106[local57] = local73;
			}
		}
		try {
			this.method400(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!de", name = "j", descriptor = "(I)V")
	private void method394(@OriginalArg(0) int arg0) {
		if (Static21.aBooleanArray5[arg0]) {
			this.method402(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray88[arg0];
		@Pc(17) int local17 = this.anIntArray82[arg0];
		@Pc(22) int local22 = this.anIntArray89[arg0];
		Static51.aBoolean72 = Static21.aBooleanArray4[arg0];
		if (this.anIntArray77 == null) {
			Static51.anInt1369 = 0;
		} else {
			Static51.anInt1369 = this.anIntArray77[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray78 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray78[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static51.method1013(Static21.anIntArray93[local12], Static21.anIntArray93[local17], Static21.anIntArray93[local22], Static21.anIntArray92[local12], Static21.anIntArray92[local17], Static21.anIntArray92[local22], this.anIntArray90[arg0], this.anIntArray85[arg0], this.anIntArray105[arg0]);
		} else if (local42 == 1) {
			Static51.method1016(Static21.anIntArray93[local12], Static21.anIntArray93[local17], Static21.anIntArray93[local22], Static21.anIntArray92[local12], Static21.anIntArray92[local17], Static21.anIntArray92[local22], Static21.anIntArray109[this.anIntArray90[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray78[arg0] >> 2;
				local128 = this.anIntArray83[local123];
				local133 = this.anIntArray84[local123];
				local138 = this.anIntArray86[local123];
				Static51.method1023(Static21.anIntArray93[local12], Static21.anIntArray93[local17], Static21.anIntArray93[local22], Static21.anIntArray92[local12], Static21.anIntArray92[local17], Static21.anIntArray92[local22], this.anIntArray90[arg0], this.anIntArray85[arg0], this.anIntArray105[arg0], Static21.anIntArray111[local128], Static21.anIntArray111[local133], Static21.anIntArray111[local138], Static21.anIntArray100[local128], Static21.anIntArray100[local133], Static21.anIntArray100[local138], Static21.anIntArray106[local128], Static21.anIntArray106[local133], Static21.anIntArray106[local138], this.anIntArray81[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray78[arg0] >> 2;
				local128 = this.anIntArray83[local123];
				local133 = this.anIntArray84[local123];
				local138 = this.anIntArray86[local123];
				Static51.method1023(Static21.anIntArray93[local12], Static21.anIntArray93[local17], Static21.anIntArray93[local22], Static21.anIntArray92[local12], Static21.anIntArray92[local17], Static21.anIntArray92[local22], this.anIntArray90[arg0], this.anIntArray90[arg0], this.anIntArray90[arg0], Static21.anIntArray111[local128], Static21.anIntArray111[local133], Static21.anIntArray111[local138], Static21.anIntArray100[local128], Static21.anIntArray100[local133], Static21.anIntArray100[local138], Static21.anIntArray106[local128], Static21.anIntArray106[local133], Static21.anIntArray106[local138], this.anIntArray81[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "k", descriptor = "(I)V")
	public void method395(@OriginalArg(0) int arg0) {
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		@Pc(9) int local9 = Static21.anIntArray99[arg0];
		@Pc(13) int local13 = Static21.anIntArray96[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt538; local15++) {
			@Pc(32) int local32 = this.anIntArray76[local15] * local13 - this.anIntArray80[local15] * local9 >> 16;
			this.anIntArray80[local15] = this.anIntArray76[local15] * local9 + this.anIntArray80[local15] * local13 >> 16;
			this.anIntArray76[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
	public void method396() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray73 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt538; local9++) {
				local15 = this.anIntArray73[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray19 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray19[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt538) {
				local65 = this.anIntArray73[local59];
				this.anIntArrayArray19[local65][local5[local65]++] = local59++;
			}
			this.anIntArray73 = null;
		}
		if (this.anIntArray75 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt542; local9++) {
			local15 = this.anIntArray75[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray20 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray20[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt542) {
			local65 = this.anIntArray75[local59];
			this.anIntArrayArray20[local65][local5[local65]++] = local59++;
		}
		this.anIntArray75 = null;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
	public void method397() {
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt538; local7++) {
			this.anIntArray74[local7] = -this.anIntArray74[local7];
			this.anIntArray80[local7] = -this.anIntArray80[local7];
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
	public void method399() {
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt538; local7++) {
			this.anIntArray80[local7] = -this.anIntArray80[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt542; local24++) {
			@Pc(30) int local30 = this.anIntArray88[local24];
			this.anIntArray88[local24] = this.anIntArray89[local24];
			this.anIntArray89[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZI)V")
	private void method400(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt540 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt540; local6++) {
			Static21.anIntArray107[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt542; local18++) {
			if (this.anIntArray78 == null || this.anIntArray78[local18] != -1) {
				local33 = this.anIntArray88[local18];
				local38 = this.anIntArray82[local18];
				local43 = this.anIntArray89[local18];
				local47 = Static21.anIntArray92[local33];
				local51 = Static21.anIntArray92[local38];
				local55 = Static21.anIntArray92[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static21.anIntArray111[local33];
					local74 = Static21.anIntArray111[local38];
					@Pc(78) int local78 = Static21.anIntArray111[local43];
					@Pc(82) int local82 = Static21.anIntArray100[local33];
					local86 = Static21.anIntArray100[local38];
					local90 = Static21.anIntArray100[local43];
					@Pc(94) int local94 = Static21.anIntArray106[local33];
					local98 = Static21.anIntArray106[local38];
					@Pc(102) int local102 = Static21.anIntArray106[local43];
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
						Static21.aBooleanArray5[local18] = true;
						@Pc(183) int local183 = (Static21.anIntArray108[local33] + Static21.anIntArray108[local38] + Static21.anIntArray108[local43]) / 3 + this.anInt544;
						Static21.anIntArrayArray21[local183][Static21.anIntArray107[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method403(Static21.anInt551, Static21.anInt552, Static21.anIntArray93[local33], Static21.anIntArray93[local38], Static21.anIntArray93[local43], local47, local51, local55)) {
						Static21.anIntArray112[Static21.anInt550++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static21.anIntArray93[local43] - Static21.anIntArray93[local38]) - (Static21.anIntArray93[local33] - Static21.anIntArray93[local38]) * (local55 - local51) > 0) {
						Static21.aBooleanArray5[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static51.anInt1373 && local51 <= Static51.anInt1373 && local55 <= Static51.anInt1373) {
							Static21.aBooleanArray4[local18] = false;
						} else {
							Static21.aBooleanArray4[local18] = true;
						}
						local70 = (Static21.anIntArray108[local33] + Static21.anIntArray108[local38] + Static21.anIntArray108[local43]) / 3 + this.anInt544;
						Static21.anIntArrayArray21[local70][Static21.anIntArray107[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray79 == null) {
			for (local33 = this.anInt540 - 1; local33 >= 0; local33--) {
				local38 = Static21.anIntArray107[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static21.anIntArrayArray21[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method394(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static21.anIntArray91[local33] = 0;
			Static21.anIntArray97[local33] = 0;
		}
		for (local38 = this.anInt540 - 1; local38 >= 0; local38--) {
			local43 = Static21.anIntArray107[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static21.anIntArrayArray21[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray79[local55];
					local74 = Static21.anIntArray91[local70]++;
					Static21.anIntArrayArray22[local70][local74] = local55;
					if (local70 < 10) {
						Static21.anIntArray97[local70] += local38;
					} else if (local70 == 10) {
						Static21.anIntArray110[local74] = local38;
					} else {
						Static21.anIntArray103[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static21.anIntArray91[1] > 0 || Static21.anIntArray91[2] > 0) {
			local43 = (Static21.anIntArray97[1] + Static21.anIntArray97[2]) / (Static21.anIntArray91[1] + Static21.anIntArray91[2]);
		}
		local47 = 0;
		if (Static21.anIntArray91[3] > 0 || Static21.anIntArray91[4] > 0) {
			local47 = (Static21.anIntArray97[3] + Static21.anIntArray97[4]) / (Static21.anIntArray91[3] + Static21.anIntArray91[4]);
		}
		local51 = 0;
		if (Static21.anIntArray91[6] > 0 || Static21.anIntArray91[8] > 0) {
			local51 = (Static21.anIntArray97[6] + Static21.anIntArray97[8]) / (Static21.anIntArray91[6] + Static21.anIntArray91[8]);
		}
		local70 = 0;
		local74 = Static21.anIntArray91[10];
		@Pc(524) int[] local524 = Static21.anIntArrayArray22[10];
		@Pc(526) int[] local526 = Static21.anIntArray110;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static21.anIntArray91[11];
			local524 = Static21.anIntArrayArray22[11];
			local526 = Static21.anIntArray103;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method394(local524[local70++]);
				if (local70 == local74 && local524 != Static21.anIntArrayArray22[11]) {
					local70 = 0;
					local74 = Static21.anIntArray91[11];
					local524 = Static21.anIntArrayArray22[11];
					local526 = Static21.anIntArray103;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method394(local524[local70++]);
				if (local70 == local74 && local524 != Static21.anIntArrayArray22[11]) {
					local70 = 0;
					local74 = Static21.anIntArray91[11];
					local524 = Static21.anIntArrayArray22[11];
					local526 = Static21.anIntArray103;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method394(local524[local70++]);
				if (local70 == local74 && local524 != Static21.anIntArrayArray22[11]) {
					local70 = 0;
					local74 = Static21.anIntArray91[11];
					local524 = Static21.anIntArrayArray22[11];
					local526 = Static21.anIntArray103;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static21.anIntArray91[local86];
			@Pc(689) int[] local689 = Static21.anIntArrayArray22[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method394(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method394(local524[local70++]);
			if (local70 == local74 && local524 != Static21.anIntArrayArray22[11]) {
				local70 = 0;
				local524 = Static21.anIntArrayArray22[11];
				local74 = Static21.anIntArray91[11];
				local526 = Static21.anIntArray103;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt537 != 1) {
			this.method419();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt545 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt545 << 9;
		if (local60 / local36 >= Static51.anInt1366) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt545 << 9;
		if (local73 / local36 <= Static51.anInt1374) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt545 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static51.anInt1372) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2368 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static51.anInt1367) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2368 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt536 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static21.aBoolean32) {
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
			local215 = Static21.anInt551 - Static51.anInt1370;
			local219 = Static21.anInt552 - Static51.anInt1368;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean31) {
					Static21.anIntArray112[Static21.anInt550++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static51.anInt1370;
		local215 = Static51.anInt1368;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static21.anIntArray99[arg0];
			local253 = Static21.anIntArray96[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt538; local265++) {
			@Pc(271) int local271 = this.anIntArray74[local265];
			@Pc(276) int local276 = this.anIntArray76[local265];
			@Pc(281) int local281 = this.anIntArray80[local265];
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
			Static21.anIntArray108[local265] = local281 - local25;
			if (local281 >= 50) {
				Static21.anIntArray92[local265] = local168 + (local271 << 9) / local281;
				Static21.anIntArray93[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static21.anIntArray92[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static21.anIntArray111[local265] = local271;
				Static21.anIntArray100[local265] = local293;
				Static21.anIntArray106[local265] = local281;
			}
		}
		try {
			this.method400(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method401(@OriginalArg(0) Class3_Sub3_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray19 == null || arg1 == -1) {
			return;
		}
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		@Pc(18) Class38 local18 = arg0.aClass38Array1[arg1];
		@Pc(21) Class3_Sub2 local21 = local18.aClass3_Sub2_1;
		Static21.anInt548 = 0;
		Static21.anInt547 = 0;
		Static21.anInt549 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt1506; local29++) {
			@Pc(35) int local35 = local18.anIntArray251[local29];
			this.method417(local21.anIntArray12[local35], local21.anIntArrayArray8[local35], local18.anIntArray247[local29], local18.anIntArray252[local29], local18.anIntArray249[local29]);
		}
	}

	@OriginalMember(owner = "client!de", name = "l", descriptor = "(I)V")
	private void method402(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static51.anInt1370;
		@Pc(3) int local3 = Static51.anInt1368;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray88[arg0];
		@Pc(15) int local15 = this.anIntArray82[arg0];
		@Pc(20) int local20 = this.anIntArray89[arg0];
		@Pc(24) int local24 = Static21.anIntArray106[local10];
		@Pc(28) int local28 = Static21.anIntArray106[local15];
		@Pc(32) int local32 = Static21.anIntArray106[local20];
		if (this.anIntArray77 == null) {
			Static51.anInt1369 = 0;
		} else {
			Static51.anInt1369 = this.anIntArray77[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static21.anIntArray101[0] = Static21.anIntArray92[local10];
			Static21.anIntArray98[0] = Static21.anIntArray93[local10];
			local5++;
			Static21.anIntArray102[0] = this.anIntArray90[arg0];
		} else {
			local71 = Static21.anIntArray111[local10];
			local75 = Static21.anIntArray100[local10];
			local80 = this.anIntArray90[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static21.anIntArray94[local32 - local24];
				Static21.anIntArray101[0] = local1 + (local71 + ((Static21.anIntArray111[local20] - local71) * local93 >> 16) << 9) / 50;
				Static21.anIntArray98[0] = local3 + (local75 + ((Static21.anIntArray100[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static21.anIntArray102[0] = local80 + ((this.anIntArray105[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static21.anIntArray94[local28 - local24];
				Static21.anIntArray101[local5] = local1 + (local71 + ((Static21.anIntArray111[local15] - local71) * local93 >> 16) << 9) / 50;
				Static21.anIntArray98[local5] = local3 + (local75 + ((Static21.anIntArray100[local15] - local75) * local93 >> 16) << 9) / 50;
				Static21.anIntArray102[local5++] = local80 + ((this.anIntArray85[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static21.anIntArray101[local5] = Static21.anIntArray92[local15];
			Static21.anIntArray98[local5] = Static21.anIntArray93[local15];
			Static21.anIntArray102[local5++] = this.anIntArray85[arg0];
		} else {
			local71 = Static21.anIntArray111[local15];
			local75 = Static21.anIntArray100[local15];
			local80 = this.anIntArray85[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static21.anIntArray94[local24 - local28];
				Static21.anIntArray101[local5] = local1 + (local71 + ((Static21.anIntArray111[local10] - local71) * local93 >> 16) << 9) / 50;
				Static21.anIntArray98[local5] = local3 + (local75 + ((Static21.anIntArray100[local10] - local75) * local93 >> 16) << 9) / 50;
				Static21.anIntArray102[local5++] = local80 + ((this.anIntArray90[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static21.anIntArray94[local32 - local28];
				Static21.anIntArray101[local5] = local1 + (local71 + ((Static21.anIntArray111[local20] - local71) * local93 >> 16) << 9) / 50;
				Static21.anIntArray98[local5] = local3 + (local75 + ((Static21.anIntArray100[local20] - local75) * local93 >> 16) << 9) / 50;
				Static21.anIntArray102[local5++] = local80 + ((this.anIntArray105[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static21.anIntArray101[local5] = Static21.anIntArray92[local20];
			Static21.anIntArray98[local5] = Static21.anIntArray93[local20];
			Static21.anIntArray102[local5++] = this.anIntArray105[arg0];
		} else {
			local71 = Static21.anIntArray111[local20];
			local75 = Static21.anIntArray100[local20];
			local80 = this.anIntArray105[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static21.anIntArray94[local28 - local32];
				Static21.anIntArray101[local5] = local1 + (local71 + ((Static21.anIntArray111[local15] - local71) * local93 >> 16) << 9) / 50;
				Static21.anIntArray98[local5] = local3 + (local75 + ((Static21.anIntArray100[local15] - local75) * local93 >> 16) << 9) / 50;
				Static21.anIntArray102[local5++] = local80 + ((this.anIntArray85[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static21.anIntArray94[local24 - local32];
				Static21.anIntArray101[local5] = local1 + (local71 + ((Static21.anIntArray111[local10] - local71) * local93 >> 16) << 9) / 50;
				Static21.anIntArray98[local5] = local3 + (local75 + ((Static21.anIntArray100[local10] - local75) * local93 >> 16) << 9) / 50;
				Static21.anIntArray102[local5++] = local80 + ((this.anIntArray90[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static21.anIntArray101[0];
		local75 = Static21.anIntArray101[1];
		local80 = Static21.anIntArray101[2];
		local93 = Static21.anIntArray98[0];
		@Pc(588) int local588 = Static21.anIntArray98[1];
		@Pc(592) int local592 = Static21.anIntArray98[2];
		Static51.aBoolean72 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static51.anInt1373 || local75 > Static51.anInt1373 || local80 > Static51.anInt1373) {
				Static51.aBoolean72 = true;
			}
			if (this.anIntArray78 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray78[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static51.method1013(local93, local588, local592, local71, local75, local80, Static21.anIntArray102[0], Static21.anIntArray102[1], Static21.anIntArray102[2]);
			} else if (local619 == 1) {
				Static51.method1016(local93, local588, local592, local71, local75, local80, Static21.anIntArray109[this.anIntArray90[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray78[arg0] >> 2;
				local678 = this.anIntArray83[local673];
				local683 = this.anIntArray84[local673];
				local688 = this.anIntArray86[local673];
				Static51.method1023(local93, local588, local592, local71, local75, local80, Static21.anIntArray102[0], Static21.anIntArray102[1], Static21.anIntArray102[2], Static21.anIntArray111[local678], Static21.anIntArray111[local683], Static21.anIntArray111[local688], Static21.anIntArray100[local678], Static21.anIntArray100[local683], Static21.anIntArray100[local688], Static21.anIntArray106[local678], Static21.anIntArray106[local683], Static21.anIntArray106[local688], this.anIntArray81[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray78[arg0] >> 2;
				local678 = this.anIntArray83[local673];
				local683 = this.anIntArray84[local673];
				local688 = this.anIntArray86[local673];
				Static51.method1023(local93, local588, local592, local71, local75, local80, this.anIntArray90[arg0], this.anIntArray90[arg0], this.anIntArray90[arg0], Static21.anIntArray111[local678], Static21.anIntArray111[local683], Static21.anIntArray111[local688], Static21.anIntArray100[local678], Static21.anIntArray100[local683], Static21.anIntArray100[local688], Static21.anIntArray106[local678], Static21.anIntArray106[local683], Static21.anIntArray106[local688], this.anIntArray81[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static51.anInt1373 || local75 > Static51.anInt1373 || local80 > Static51.anInt1373 || Static21.anIntArray101[3] < 0 || Static21.anIntArray101[3] > Static51.anInt1373) {
			Static51.aBoolean72 = true;
		}
		if (this.anIntArray78 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray78[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static51.method1013(local93, local588, local592, local71, local75, local80, Static21.anIntArray102[0], Static21.anIntArray102[1], Static21.anIntArray102[2]);
			Static51.method1013(local93, local592, Static21.anIntArray98[3], local71, local80, Static21.anIntArray101[3], Static21.anIntArray102[0], Static21.anIntArray102[2], Static21.anIntArray102[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static21.anIntArray109[this.anIntArray90[arg0]];
			Static51.method1016(local93, local588, local592, local71, local75, local80, local673);
			Static51.method1016(local93, local592, Static21.anIntArray98[3], local71, local80, Static21.anIntArray101[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray78[arg0] >> 2;
			local678 = this.anIntArray83[local673];
			local683 = this.anIntArray84[local673];
			local688 = this.anIntArray86[local673];
			Static51.method1023(local93, local588, local592, local71, local75, local80, Static21.anIntArray102[0], Static21.anIntArray102[1], Static21.anIntArray102[2], Static21.anIntArray111[local678], Static21.anIntArray111[local683], Static21.anIntArray111[local688], Static21.anIntArray100[local678], Static21.anIntArray100[local683], Static21.anIntArray100[local688], Static21.anIntArray106[local678], Static21.anIntArray106[local683], Static21.anIntArray106[local688], this.anIntArray81[arg0]);
			Static51.method1023(local93, local592, Static21.anIntArray98[3], local71, local80, Static21.anIntArray101[3], Static21.anIntArray102[0], Static21.anIntArray102[2], Static21.anIntArray102[3], Static21.anIntArray111[local678], Static21.anIntArray111[local683], Static21.anIntArray111[local688], Static21.anIntArray100[local678], Static21.anIntArray100[local683], Static21.anIntArray100[local688], Static21.anIntArray106[local678], Static21.anIntArray106[local683], Static21.anIntArray106[local688], this.anIntArray81[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray78[arg0] >> 2;
		local678 = this.anIntArray83[local673];
		local683 = this.anIntArray84[local673];
		local688 = this.anIntArray86[local673];
		Static51.method1023(local93, local588, local592, local71, local75, local80, this.anIntArray90[arg0], this.anIntArray90[arg0], this.anIntArray90[arg0], Static21.anIntArray111[local678], Static21.anIntArray111[local683], Static21.anIntArray111[local688], Static21.anIntArray100[local678], Static21.anIntArray100[local683], Static21.anIntArray100[local688], Static21.anIntArray106[local678], Static21.anIntArray106[local683], Static21.anIntArray106[local688], this.anIntArray81[arg0]);
		Static51.method1023(local93, local592, Static21.anIntArray98[3], local71, local80, Static21.anIntArray101[3], this.anIntArray90[arg0], this.anIntArray90[arg0], this.anIntArray90[arg0], Static21.anIntArray111[local678], Static21.anIntArray111[local683], Static21.anIntArray111[local688], Static21.anIntArray100[local678], Static21.anIntArray100[local683], Static21.anIntArray100[local688], Static21.anIntArray106[local678], Static21.anIntArray106[local683], Static21.anIntArray106[local688], this.anIntArray81[arg0]);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
	public void method404() {
		if (this.anInt537 == 3) {
			return;
		}
		this.anInt537 = 3;
		super.anInt2368 = 0;
		this.anInt546 = 0;
		this.anInt545 = 999999;
		this.anInt540 = -999999;
		this.anInt544 = -99999;
		this.anInt543 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt538; local27++) {
			@Pc(33) int local33 = this.anIntArray74[local27];
			@Pc(38) int local38 = this.anIntArray76[local27];
			@Pc(43) int local43 = this.anIntArray80[local27];
			if (local33 < this.anInt545) {
				this.anInt545 = local33;
			}
			if (local33 > this.anInt540) {
				this.anInt540 = local33;
			}
			if (local43 < this.anInt543) {
				this.anInt543 = local43;
			}
			if (local43 > this.anInt544) {
				this.anInt544 = local43;
			}
			if (-local38 > super.anInt2368) {
				super.anInt2368 = -local38;
			}
			if (local38 > this.anInt546) {
				this.anInt546 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(Z)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method405(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static21.anIntArray87.length < this.anInt542) {
			Static21.anIntArray87 = new int[this.anInt542 + 100];
		}
		return this.method411(arg0, Static21.aClass3_Sub3_Sub1_Sub1_1, Static21.anIntArray87);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
	public void method406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt542; local1++) {
			if (this.anIntArray81[local1] == arg0) {
				this.anIntArray81[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIZ)V")
	public void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray90 == null) {
			this.anIntArray90 = new int[this.anInt542];
			this.anIntArray85 = new int[this.anInt542];
			this.anIntArray105 = new int[this.anInt542];
		}
		@Pc(48) int local48;
		if (this.aClass62Array2 == null) {
			this.aClass62Array2 = new Class62[this.anInt538];
			for (local48 = 0; local48 < this.anInt538; local48++) {
				this.aClass62Array2[local48] = new Class62();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt542; local48++) {
			local69 = this.anIntArray88[local48];
			@Pc(74) int local74 = this.anIntArray82[local48];
			@Pc(79) int local79 = this.anIntArray89[local48];
			@Pc(89) int local89 = this.anIntArray74[local74] - this.anIntArray74[local69];
			@Pc(99) int local99 = this.anIntArray76[local74] - this.anIntArray76[local69];
			@Pc(109) int local109 = this.anIntArray80[local74] - this.anIntArray80[local69];
			@Pc(119) int local119 = this.anIntArray74[local79] - this.anIntArray74[local69];
			@Pc(129) int local129 = this.anIntArray76[local79] - this.anIntArray76[local69];
			@Pc(139) int local139 = this.anIntArray80[local79] - this.anIntArray80[local69];
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
			if (this.anIntArray78 == null || (this.anIntArray78[local48] & 0x1) == 0) {
				@Pc(246) Class62 local246 = this.aClass62Array2[local69];
				local246.anInt2634 += local147;
				local246.anInt2632 += local155;
				local246.anInt2636 += local163;
				local246.anInt2629++;
				@Pc(275) Class62 local275 = this.aClass62Array2[local74];
				local275.anInt2634 += local147;
				local275.anInt2632 += local155;
				local275.anInt2636 += local163;
				local275.anInt2629++;
				@Pc(304) Class62 local304 = this.aClass62Array2[local79];
				local304.anInt2634 += local147;
				local304.anInt2632 += local155;
				local304.anInt2636 += local163;
				local304.anInt2629++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray90[local48] = Static21.method409(this.anIntArray81[local48], local349, this.anIntArray78[local48]);
			}
		}
		if (arg5) {
			this.method415(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass62Array1 = new Class62[this.anInt538];
		for (local69 = 0; local69 < this.anInt538; local69++) {
			@Pc(391) Class62 local391 = this.aClass62Array2[local69];
			@Pc(400) Class62 local400 = this.aClass62Array1[local69] = new Class62();
			local400.anInt2634 = local391.anInt2634;
			local400.anInt2632 = local391.anInt2632;
			local400.anInt2636 = local391.anInt2636;
			local400.anInt2629 = local391.anInt2629;
		}
		this.anInt539 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
	public void method408() {
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt538; local7++) {
			@Pc(13) int local13 = this.anIntArray74[local7];
			this.anIntArray74[local7] = this.anIntArray80[local7];
			this.anIntArray80[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!de;I)I")
	private int method410(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray74[arg1];
		@Pc(11) int local11 = arg0.anIntArray76[arg1];
		@Pc(16) int local16 = arg0.anIntArray80[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt538; local18++) {
			if (local6 == this.anIntArray74[local18] && local11 == this.anIntArray76[local18] && local16 == this.anIntArray80[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray74[this.anInt538] = local6;
			this.anIntArray76[this.anInt538] = local11;
			this.anIntArray80[this.anInt538] = local16;
			if (arg0.anIntArray73 != null) {
				this.anIntArray73[this.anInt538] = arg0.anIntArray73[arg1];
			}
			local1 = this.anInt538++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!de;[I)Lclient!de;")
	private Class3_Sub3_Sub1_Sub1 method411(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub3_Sub1_Sub1 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt538 = this.anInt538;
		arg1.anInt542 = this.anInt542;
		arg1.anInt536 = this.anInt536;
		if (arg1.anIntArray74 == null || arg1.anIntArray74.length < this.anInt538) {
			arg1.anIntArray74 = new int[this.anInt538 + 100];
			arg1.anIntArray76 = new int[this.anInt538 + 100];
			arg1.anIntArray80 = new int[this.anInt538 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt538; local43++) {
			arg1.anIntArray74[local43] = this.anIntArray74[local43];
			arg1.anIntArray76[local43] = this.anIntArray76[local43];
			arg1.anIntArray80[local43] = this.anIntArray80[local43];
		}
		if (arg0) {
			arg1.anIntArray77 = this.anIntArray77;
		} else {
			arg1.anIntArray77 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray77 == null) {
				for (local88 = 0; local88 < this.anInt542; local88++) {
					arg1.anIntArray77[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt542; local88++) {
					arg1.anIntArray77[local88] = this.anIntArray77[local88];
				}
			}
		}
		arg1.anIntArray78 = this.anIntArray78;
		arg1.anIntArray81 = this.anIntArray81;
		arg1.anIntArray79 = this.anIntArray79;
		arg1.anInt541 = this.anInt541;
		arg1.anIntArrayArray20 = this.anIntArrayArray20;
		arg1.anIntArrayArray19 = this.anIntArrayArray19;
		arg1.anIntArray88 = this.anIntArray88;
		arg1.anIntArray82 = this.anIntArray82;
		arg1.anIntArray89 = this.anIntArray89;
		arg1.anIntArray90 = this.anIntArray90;
		arg1.anIntArray85 = this.anIntArray85;
		arg1.anIntArray105 = this.anIntArray105;
		arg1.anIntArray83 = this.anIntArray83;
		arg1.anIntArray84 = this.anIntArray84;
		arg1.anIntArray86 = this.anIntArray86;
		arg1.aBoolean31 = this.aBoolean31;
		arg1.anInt537 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(III)V")
	public void method412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt537 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt538; local4++) {
			this.anIntArray74[local4] += arg0;
			this.anIntArray76[local4] += arg1;
			this.anIntArray80[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(III)V")
	public void method413() {
		@Pc(4) int local4 = this.anInt539 >> 16;
		@Pc(11) int local11 = this.anInt539 << 16 >> 16;
		this.method415(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "()V")
	private void method414() {
		if (this.anInt537 == 2) {
			return;
		}
		this.anInt537 = 2;
		this.anInt545 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt538; local12++) {
			@Pc(18) int local18 = this.anIntArray74[local12];
			@Pc(23) int local23 = this.anIntArray76[local12];
			@Pc(28) int local28 = this.anIntArray80[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt545) {
				this.anInt545 = local40;
			}
		}
		this.anInt545 = (int) (Math.sqrt((double) this.anInt545) + 0.99D);
		this.anInt544 = this.anInt545;
		this.anInt540 = this.anInt545 + this.anInt545;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
	private void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt542; local1++) {
			local7 = this.anIntArray88[local1];
			@Pc(12) int local12 = this.anIntArray82[local1];
			@Pc(17) int local17 = this.anIntArray89[local1];
			@Pc(30) Class62 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray78 == null) {
				local25 = this.anIntArray81[local1];
				local30 = this.aClass62Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2634 + arg3 * local30.anInt2632 + arg4 * local30.anInt2636) / (arg1 * local30.anInt2629);
				this.anIntArray90[local1] = Static21.method409(local25, local52, 0);
				@Pc(65) Class62 local65 = this.aClass62Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt2634 + arg3 * local65.anInt2632 + arg4 * local65.anInt2636) / (arg1 * local65.anInt2629);
				this.anIntArray85[local1] = Static21.method409(local25, local87, 0);
				@Pc(100) Class62 local100 = this.aClass62Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt2634 + arg3 * local100.anInt2632 + arg4 * local100.anInt2636) / (arg1 * local100.anInt2629);
				this.anIntArray105[local1] = Static21.method409(local25, local122, 0);
			} else if ((this.anIntArray78[local1] & 0x1) == 0) {
				local25 = this.anIntArray81[local1];
				@Pc(148) int local148 = this.anIntArray78[local1];
				local30 = this.aClass62Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt2634 + arg3 * local30.anInt2632 + arg4 * local30.anInt2636) / (arg1 * local30.anInt2629);
				this.anIntArray90[local1] = Static21.method409(local25, local52, local148);
				local30 = this.aClass62Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt2634 + arg3 * local30.anInt2632 + arg4 * local30.anInt2636) / (arg1 * local30.anInt2629);
				this.anIntArray85[local1] = Static21.method409(local25, local52, local148);
				local30 = this.aClass62Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt2634 + arg3 * local30.anInt2632 + arg4 * local30.anInt2636) / (arg1 * local30.anInt2629);
				this.anIntArray105[local1] = Static21.method409(local25, local52, local148);
			}
		}
		this.aClass62Array2 = null;
		this.aClass62Array1 = null;
		this.anIntArray73 = null;
		this.anIntArray75 = null;
		if (this.anIntArray78 != null) {
			for (local7 = 0; local7 < this.anInt542; local7++) {
				if ((this.anIntArray78[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray81 = null;
	}

	@OriginalMember(owner = "client!de", name = "h", descriptor = "()I")
	public int method416() {
		this.method419();
		return this.anInt545;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[IIII)V")
	private void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static21.anInt548 = 0;
			Static21.anInt547 = 0;
			Static21.anInt549 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray19.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray19[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static21.anInt548 += this.anIntArray74[local36];
						Static21.anInt547 += this.anIntArray76[local36];
						Static21.anInt549 += this.anIntArray80[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static21.anInt548 = Static21.anInt548 / local6 + arg2;
				Static21.anInt547 = Static21.anInt547 / local6 + arg3;
				Static21.anInt549 = Static21.anInt549 / local6 + arg4;
			} else {
				Static21.anInt548 = arg2;
				Static21.anInt547 = arg3;
				Static21.anInt549 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray19.length) {
					local115 = this.anIntArrayArray19[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray74[local31] += arg2;
						this.anIntArray76[local31] += arg3;
						this.anIntArray80[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray19.length) {
					local115 = this.anIntArrayArray19[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray74[local31] -= Static21.anInt548;
						this.anIntArray76[local31] -= Static21.anInt547;
						this.anIntArray80[local31] -= Static21.anInt549;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static21.anIntArray99[local225];
							local235 = Static21.anIntArray96[local225];
							local251 = this.anIntArray76[local31] * local231 + this.anIntArray74[local31] * local235 >> 16;
							this.anIntArray76[local31] = this.anIntArray76[local31] * local235 - this.anIntArray74[local31] * local231 >> 16;
							this.anIntArray74[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static21.anIntArray99[local36];
							local235 = Static21.anIntArray96[local36];
							local251 = this.anIntArray76[local31] * local235 - this.anIntArray80[local31] * local231 >> 16;
							this.anIntArray80[local31] = this.anIntArray76[local31] * local231 + this.anIntArray80[local31] * local235 >> 16;
							this.anIntArray76[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static21.anIntArray99[local219];
							local235 = Static21.anIntArray96[local219];
							local251 = this.anIntArray80[local31] * local231 + this.anIntArray74[local31] * local235 >> 16;
							this.anIntArray80[local31] = this.anIntArray80[local31] * local235 - this.anIntArray74[local31] * local231 >> 16;
							this.anIntArray74[local31] = local251;
						}
						this.anIntArray74[local31] += Static21.anInt548;
						this.anIntArray76[local31] += Static21.anInt547;
						this.anIntArray80[local31] += Static21.anInt549;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray19.length) {
					local115 = this.anIntArrayArray19[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray74[local31] -= Static21.anInt548;
						this.anIntArray76[local31] -= Static21.anInt547;
						this.anIntArray80[local31] -= Static21.anInt549;
						this.anIntArray74[local31] = this.anIntArray74[local31] * arg2 / 128;
						this.anIntArray76[local31] = this.anIntArray76[local31] * arg3 / 128;
						this.anIntArray80[local31] = this.anIntArray80[local31] * arg4 / 128;
						this.anIntArray74[local31] += Static21.anInt548;
						this.anIntArray76[local31] += Static21.anInt547;
						this.anIntArray80[local31] += Static21.anInt549;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray20 != null && this.anIntArray77 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray20.length) {
					local115 = this.anIntArrayArray20[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray77[local31] += arg2 * 8;
						if (this.anIntArray77[local31] < 0) {
							this.anIntArray77[local31] = 0;
						}
						if (this.anIntArray77[local31] > 255) {
							this.anIntArray77[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(III)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt538; local7++) {
			this.anIntArray74[local7] = this.anIntArray74[local7] * arg0 / 128;
			this.anIntArray76[local7] = this.anIntArray76[local7] * arg1 / 128;
			this.anIntArray80[local7] = this.anIntArray80[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "()V")
	public void method419() {
		if (this.anInt537 == 1) {
			return;
		}
		this.anInt537 = 1;
		super.anInt2368 = 0;
		this.anInt546 = 0;
		this.anInt545 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt538; local18++) {
			@Pc(24) int local24 = this.anIntArray74[local18];
			@Pc(29) int local29 = this.anIntArray76[local18];
			@Pc(34) int local34 = this.anIntArray80[local18];
			if (-local29 > super.anInt2368) {
				super.anInt2368 = -local29;
			}
			if (local29 > this.anInt546) {
				this.anInt546 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt545) {
				this.anInt545 = local58;
			}
		}
		this.anInt545 = (int) (Math.sqrt((double) this.anInt545) + 0.99D);
		this.anInt544 = (int) (Math.sqrt((double) (this.anInt545 * this.anInt545 + super.anInt2368 * super.anInt2368)) + 0.99D);
		this.anInt540 = this.anInt544 + (int) (Math.sqrt((double) (this.anInt545 * this.anInt545 + this.anInt546 * this.anInt546)) + 0.99D);
	}

	@OriginalMember(owner = "client!de", name = "j", descriptor = "()V")
	public void method420() {
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt538; local7++) {
			@Pc(13) int local13 = this.anIntArray80[local7];
			this.anIntArray80[local7] = this.anIntArray74[local7];
			this.anIntArray74[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ud;ILclient!ud;I[I)V")
	public void method421(@OriginalArg(0) Class3_Sub3_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method401(arg0, arg1);
			return;
		}
		this.aClass62Array2 = null;
		this.anInt537 = 0;
		@Pc(24) Class38 local24 = arg0.aClass38Array1[arg1];
		@Pc(29) Class38 local29 = arg2.aClass38Array1[arg3];
		@Pc(32) Class3_Sub2 local32 = local24.aClass3_Sub2_1;
		Static21.anInt548 = 0;
		Static21.anInt547 = 0;
		Static21.anInt549 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt1506; local47++) {
			local53 = local24.anIntArray251[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray12[local53] == 0) {
				this.method417(local32.anIntArray12[local53], local32.anIntArrayArray8[local53], local24.anIntArray247[local47], local24.anIntArray252[local47], local24.anIntArray249[local47]);
			}
		}
		Static21.anInt548 = 0;
		Static21.anInt547 = 0;
		Static21.anInt549 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt1506; local53++) {
			@Pc(118) int local118 = local29.anIntArray251[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray12[local118] == 0) {
				this.method417(local32.anIntArray12[local118], local32.anIntArrayArray8[local118], local29.anIntArray247[local53], local29.anIntArray252[local53], local29.anIntArray249[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method422(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static21.anIntArray104.length < this.anInt542) {
			Static21.anIntArray104 = new int[this.anInt542 + 100];
		}
		return this.method411(arg0, Static21.aClass3_Sub3_Sub1_Sub1_2, Static21.anIntArray104);
	}
}
