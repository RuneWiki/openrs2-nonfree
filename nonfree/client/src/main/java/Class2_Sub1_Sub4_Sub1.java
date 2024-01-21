import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!fd", name = "ic", descriptor = "[I")
	public static int[] anIntArray95 = new int[128];

	@OriginalMember(owner = "client!fd", name = "ob", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!fd", name = "pb", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!fd", name = "qb", descriptor = "I")
	public int anInt855;

	@OriginalMember(owner = "client!fd", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fd", name = "xb", descriptor = "I")
	public int anInt857;

	@OriginalMember(owner = "client!fd", name = "yb", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!fd", name = "Eb", descriptor = "[Lclient!qa;")
	public Class55[] aClass55Array1;

	@OriginalMember(owner = "client!fd", name = "Fb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!fd", name = "Gb", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!fd", name = "Jb", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!fd", name = "Lb", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!fd", name = "Mb", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!fd", name = "Nb", descriptor = "[Lclient!qa;")
	public Class55[] aClass55Array2;

	@OriginalMember(owner = "client!fd", name = "yc", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!fd", name = "ub", descriptor = "I")
	private int anInt856 = 0;

	@OriginalMember(owner = "client!fd", name = "Kb", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!fd", name = "Ab", descriptor = "I")
	public int anInt859 = 0;

	@OriginalMember(owner = "client!fd", name = "Ob", descriptor = "I")
	public int anInt862 = 0;

	@OriginalMember(owner = "client!fd", name = "Tb", descriptor = "I")
	private int anInt863 = 0;

	@OriginalMember(owner = "client!fd", name = "sb", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!fd", name = "cc", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!fd", name = "Hb", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!fd", name = "Db", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!fd", name = "Pb", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!fd", name = "vb", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!fd", name = "zb", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!fd", name = "Bb", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!fd", name = "Cb", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!fd", name = "wb", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!fd", name = "Rb", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!fd", name = "Ub", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!fd", name = "nc", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!fd", name = "vc", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!fd", name = "rb", descriptor = "[I")
	private int[] anIntArray73;

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

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class2_Sub12 local21 = new Class2_Sub12(arg0);
		@Pc(26) Class2_Sub12 local26 = new Class2_Sub12(arg0);
		@Pc(31) Class2_Sub12 local31 = new Class2_Sub12(arg0);
		@Pc(36) Class2_Sub12 local36 = new Class2_Sub12(arg0);
		@Pc(41) Class2_Sub12 local41 = new Class2_Sub12(arg0);
		local21.anInt1939 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1366();
		@Pc(55) int local55 = local21.method1366();
		@Pc(59) int local59 = local21.method1399();
		@Pc(63) int local63 = local21.method1399();
		@Pc(67) int local67 = local21.method1399();
		@Pc(71) int local71 = local21.method1399();
		@Pc(75) int local75 = local21.method1399();
		@Pc(79) int local79 = local21.method1399();
		@Pc(83) int local83 = local21.method1366();
		@Pc(87) int local87 = local21.method1366();
		@Pc(91) int local91 = local21.method1366();
		@Pc(95) int local95 = local21.method1366();
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
		this.anInt862 = local51;
		this.anInt859 = local55;
		this.anInt863 = local59;
		this.anIntArray74 = new int[local51];
		this.anIntArray92 = new int[local51];
		this.anIntArray82 = new int[local51];
		this.anIntArray80 = new int[local55];
		this.anIntArray84 = new int[local55];
		this.anIntArray75 = new int[local55];
		this.anIntArray77 = new int[local59];
		this.anIntArray78 = new int[local59];
		this.anIntArray79 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray76 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray86 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray87 = new int[local55];
		} else {
			this.anInt856 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray99 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray106 = new int[local55];
		}
		this.anIntArray73 = new int[local55];
		local21.anInt1939 = local97;
		local26.anInt1939 = local196;
		local31.anInt1939 = local202;
		local36.anInt1939 = local103;
		local41.anInt1939 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1399();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1407();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1407();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1407();
			}
			this.anIntArray74[local321] = local315 + local328;
			this.anIntArray92[local321] = local317 + local338;
			this.anIntArray82[local321] = local319 + local348;
			local315 = this.anIntArray74[local321];
			local317 = this.anIntArray92[local321];
			local319 = this.anIntArray82[local321];
			if (this.anIntArray76 != null) {
				this.anIntArray76[local321] = local41.method1399();
			}
		}
		local21.anInt1939 = local180;
		local26.anInt1939 = local138;
		local31.anInt1939 = local111;
		local36.anInt1939 = local162;
		local41.anInt1939 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray73[local326] = local21.method1366();
			if (this.anIntArray86 != null) {
				this.anIntArray86[local326] = local26.method1399();
			}
			if (this.anIntArray87 != null) {
				this.anIntArray87[local326] = local31.method1399();
			}
			if (this.anIntArray99 != null) {
				this.anIntArray99[local326] = local36.method1399();
			}
			if (this.anIntArray106 != null) {
				this.anIntArray106[local326] = local41.method1399();
			}
		}
		local21.anInt1939 = local174;
		local26.anInt1939 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1399();
			if (local496 == 1) {
				local328 = local21.method1407() + local489;
				local338 = local21.method1407() + local328;
				local348 = local21.method1407() + local338;
				local489 = local348;
				this.anIntArray80[local491] = local328;
				this.anIntArray84[local491] = local338;
				this.anIntArray75[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1407() + local489;
				local489 = local348;
				this.anIntArray80[local491] = local328;
				this.anIntArray84[local491] = local338;
				this.anIntArray75[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1407() + local489;
				local489 = local348;
				this.anIntArray80[local491] = local328;
				this.anIntArray84[local491] = local338;
				this.anIntArray75[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1407() + local489;
				local489 = local348;
				this.anIntArray80[local491] = local328;
				this.anIntArray84[local491] = local599;
				this.anIntArray75[local491] = local348;
			}
		}
		local21.anInt1939 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray77[local496] = local21.method1366();
			this.anIntArray78[local496] = local21.method1366();
			this.anIntArray79[local496] = local21.method1366();
		}
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([Lclient!fd;I)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) Class2_Sub1_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt862 = 0;
		this.anInt859 = 0;
		this.anInt863 = 0;
		this.anInt856 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub4_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt862 += local43.anInt862;
				this.anInt859 += local43.anInt859;
				this.anInt863 += local43.anInt863;
				local18 |= local43.anIntArray86 != null;
				if (local43.anIntArray87 == null) {
					if (this.anInt856 == -1) {
						this.anInt856 = local43.anInt856;
					}
					if (this.anInt856 != local43.anInt856) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray99 != null;
				local24 |= local43.anIntArray106 != null;
			}
		}
		this.anIntArray74 = new int[this.anInt862];
		this.anIntArray92 = new int[this.anInt862];
		this.anIntArray82 = new int[this.anInt862];
		this.anIntArray76 = new int[this.anInt862];
		this.anIntArray80 = new int[this.anInt859];
		this.anIntArray84 = new int[this.anInt859];
		this.anIntArray75 = new int[this.anInt859];
		this.anIntArray77 = new int[this.anInt863];
		this.anIntArray78 = new int[this.anInt863];
		this.anIntArray79 = new int[this.anInt863];
		if (local18) {
			this.anIntArray86 = new int[this.anInt859];
		}
		if (local20) {
			this.anIntArray87 = new int[this.anInt859];
		}
		if (local22) {
			this.anIntArray99 = new int[this.anInt859];
		}
		if (local24) {
			this.anIntArray106 = new int[this.anInt859];
		}
		this.anIntArray73 = new int[this.anInt859];
		this.anInt862 = 0;
		this.anInt859 = 0;
		this.anInt863 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class2_Sub1_Sub4_Sub1 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt859; local223++) {
					if (local18) {
						if (local219.anIntArray86 == null) {
							this.anIntArray86[this.anInt859] = 0;
						} else {
							local241 = local219.anIntArray86[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray86[this.anInt859] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray87 == null) {
							this.anIntArray87[this.anInt859] = local219.anInt856;
						} else {
							this.anIntArray87[this.anInt859] = local219.anIntArray87[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray99 == null) {
							this.anIntArray99[this.anInt859] = 0;
						} else {
							this.anIntArray99[this.anInt859] = local219.anIntArray99[local223];
						}
					}
					if (local24 && local219.anIntArray106 != null) {
						this.anIntArray106[this.anInt859] = local219.anIntArray106[local223];
					}
					this.anIntArray73[this.anInt859] = local219.anIntArray73[local223];
					this.anIntArray80[this.anInt859] = this.method666(local219, local219.anIntArray80[local223]);
					this.anIntArray84[this.anInt859] = this.method666(local219, local219.anIntArray84[local223]);
					this.anIntArray75[this.anInt859] = this.method666(local219, local219.anIntArray75[local223]);
					this.anInt859++;
				}
				for (local241 = 0; local241 < local219.anInt863; local241++) {
					this.anIntArray77[this.anInt863] = this.method666(local219, local219.anIntArray77[local241]);
					this.anIntArray78[this.anInt863] = this.method666(local219, local219.anIntArray78[local241]);
					this.anIntArray79[this.anInt863] = this.method666(local219, local219.anIntArray79[local241]);
					this.anInt863++;
				}
				local212 += local219.anInt863;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([Lclient!fd;IZ)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) Class2_Sub1_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt862 = 0;
		this.anInt859 = 0;
		this.anInt863 = 0;
		this.anInt856 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub4_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt862 += local43.anInt862;
				this.anInt859 += local43.anInt859;
				this.anInt863 += local43.anInt863;
				local18 |= local43.anIntArray86 != null;
				if (local43.anIntArray87 == null) {
					if (this.anInt856 == -1) {
						this.anInt856 = local43.anInt856;
					}
					if (this.anInt856 != local43.anInt856) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray99 != null;
				local24 |= local43.anIntArray73 != null;
			}
		}
		this.anIntArray74 = new int[this.anInt862];
		this.anIntArray92 = new int[this.anInt862];
		this.anIntArray82 = new int[this.anInt862];
		this.anIntArray80 = new int[this.anInt859];
		this.anIntArray84 = new int[this.anInt859];
		this.anIntArray75 = new int[this.anInt859];
		this.anIntArray81 = new int[this.anInt859];
		this.anIntArray83 = new int[this.anInt859];
		this.anIntArray72 = new int[this.anInt859];
		this.anIntArray77 = new int[this.anInt863];
		this.anIntArray78 = new int[this.anInt863];
		this.anIntArray79 = new int[this.anInt863];
		if (local18) {
			this.anIntArray86 = new int[this.anInt859];
		}
		if (local20) {
			this.anIntArray87 = new int[this.anInt859];
		}
		if (local22) {
			this.anIntArray99 = new int[this.anInt859];
		}
		if (local24) {
			this.anIntArray73 = new int[this.anInt859];
		}
		this.anInt862 = 0;
		this.anInt859 = 0;
		this.anInt863 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class2_Sub1_Sub4_Sub1 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt862;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt862; local231++) {
					this.anIntArray74[this.anInt862] = local224.anIntArray74[local231];
					this.anIntArray92[this.anInt862] = local224.anIntArray92[local231];
					this.anIntArray82[this.anInt862] = local224.anIntArray82[local231];
					this.anInt862++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt859; local272++) {
					this.anIntArray80[this.anInt859] = local224.anIntArray80[local272] + local229;
					this.anIntArray84[this.anInt859] = local224.anIntArray84[local272] + local229;
					this.anIntArray75[this.anInt859] = local224.anIntArray75[local272] + local229;
					this.anIntArray81[this.anInt859] = local224.anIntArray81[local272];
					this.anIntArray83[this.anInt859] = local224.anIntArray83[local272];
					this.anIntArray72[this.anInt859] = local224.anIntArray72[local272];
					if (local18) {
						if (local224.anIntArray86 == null) {
							this.anIntArray86[this.anInt859] = 0;
						} else {
							local350 = local224.anIntArray86[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray86[this.anInt859] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray87 == null) {
							this.anIntArray87[this.anInt859] = local224.anInt856;
						} else {
							this.anIntArray87[this.anInt859] = local224.anIntArray87[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray99 == null) {
							this.anIntArray99[this.anInt859] = 0;
						} else {
							this.anIntArray99[this.anInt859] = local224.anIntArray99[local272];
						}
					}
					if (local24 && local224.anIntArray73 != null) {
						this.anIntArray73[this.anInt859] = local224.anIntArray73[local272];
					}
					this.anInt859++;
				}
				for (local350 = 0; local350 < local224.anInt863; local350++) {
					this.anIntArray77[this.anInt863] = local224.anIntArray77[local350] + local229;
					this.anIntArray78[this.anInt863] = local224.anIntArray78[local350] + local229;
					this.anIntArray79[this.anInt863] = local224.anIntArray79[local350] + local229;
					this.anInt863++;
				}
				local217 += local224.anInt863;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!fd;ZZZ)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt862 = arg0.anInt862;
		this.anInt859 = arg0.anInt859;
		this.anInt863 = arg0.anInt863;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray74 = arg0.anIntArray74;
			this.anIntArray92 = arg0.anIntArray92;
			this.anIntArray82 = arg0.anIntArray82;
		} else {
			this.anIntArray74 = new int[this.anInt862];
			this.anIntArray92 = new int[this.anInt862];
			this.anIntArray82 = new int[this.anInt862];
			for (local60 = 0; local60 < this.anInt862; local60++) {
				this.anIntArray74[local60] = arg0.anIntArray74[local60];
				this.anIntArray92[local60] = arg0.anIntArray92[local60];
				this.anIntArray82[local60] = arg0.anIntArray82[local60];
			}
		}
		if (arg2) {
			this.anIntArray73 = arg0.anIntArray73;
		} else {
			this.anIntArray73 = new int[this.anInt859];
			for (local60 = 0; local60 < this.anInt859; local60++) {
				this.anIntArray73[local60] = arg0.anIntArray73[local60];
			}
		}
		this.anIntArray99 = arg0.anIntArray99;
		this.anIntArray76 = arg0.anIntArray76;
		this.anIntArray106 = arg0.anIntArray106;
		this.anIntArray86 = arg0.anIntArray86;
		this.anIntArray80 = arg0.anIntArray80;
		this.anIntArray84 = arg0.anIntArray84;
		this.anIntArray75 = arg0.anIntArray75;
		this.anIntArray87 = arg0.anIntArray87;
		this.anInt856 = arg0.anInt856;
		this.anIntArray77 = arg0.anIntArray77;
		this.anIntArray78 = arg0.anIntArray78;
		this.anIntArray79 = arg0.anIntArray79;
		this.aBoolean45 = arg0.aBoolean45;
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!fd;ZZ)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt862 = arg0.anInt862;
		this.anInt859 = arg0.anInt859;
		this.anInt863 = arg0.anInt863;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray92 = new int[this.anInt862];
			for (local37 = 0; local37 < this.anInt862; local37++) {
				this.anIntArray92[local37] = arg0.anIntArray92[local37];
			}
		} else {
			this.anIntArray92 = arg0.anIntArray92;
		}
		if (arg2) {
			this.anIntArray81 = new int[this.anInt859];
			this.anIntArray83 = new int[this.anInt859];
			this.anIntArray72 = new int[this.anInt859];
			for (local37 = 0; local37 < this.anInt859; local37++) {
				this.anIntArray81[local37] = arg0.anIntArray81[local37];
				this.anIntArray83[local37] = arg0.anIntArray83[local37];
				this.anIntArray72[local37] = arg0.anIntArray72[local37];
			}
			this.anIntArray86 = new int[this.anInt859];
			@Pc(115) int local115;
			if (arg0.anIntArray86 == null) {
				for (local115 = 0; local115 < this.anInt859; local115++) {
					this.anIntArray86[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt859; local115++) {
					this.anIntArray86[local115] = arg0.anIntArray86[local115];
				}
			}
			this.aClass55Array1 = new Class55[this.anInt862];
			for (local115 = 0; local115 < this.anInt862; local115++) {
				@Pc(160) Class55 local160 = this.aClass55Array1[local115] = new Class55();
				@Pc(165) Class55 local165 = arg0.aClass55Array1[local115];
				local160.anInt2098 = local165.anInt2098;
				local160.anInt2094 = local165.anInt2094;
				local160.anInt2093 = local165.anInt2093;
				local160.anInt2092 = local165.anInt2092;
			}
			this.aClass55Array2 = arg0.aClass55Array2;
		} else {
			this.anIntArray81 = arg0.anIntArray81;
			this.anIntArray83 = arg0.anIntArray83;
			this.anIntArray72 = arg0.anIntArray72;
			this.anIntArray86 = arg0.anIntArray86;
		}
		this.anIntArray74 = arg0.anIntArray74;
		this.anIntArray82 = arg0.anIntArray82;
		this.anIntArray73 = arg0.anIntArray73;
		this.anIntArray99 = arg0.anIntArray99;
		this.anIntArray87 = arg0.anIntArray87;
		this.anInt856 = arg0.anInt856;
		this.anIntArray80 = arg0.anIntArray80;
		this.anIntArray84 = arg0.anIntArray84;
		this.anIntArray75 = arg0.anIntArray75;
		this.anIntArray77 = arg0.anIntArray77;
		this.anIntArray78 = arg0.anIntArray78;
		this.anIntArray79 = arg0.anIntArray79;
		this.aBoolean45 = arg0.aBoolean45;
		this.anInt854 = arg0.anInt854;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V")
	public void method653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.anInt860 != 2 && this.anInt860 != 1) {
			this.method668();
		}
		@Pc(11) int local11 = Static87.anInt2268;
		@Pc(13) int local13 = Static87.anInt2263;
		@Pc(17) int local17 = Static30.anIntArray105[0];
		@Pc(21) int local21 = Static30.anIntArray96[0];
		@Pc(25) int local25 = Static30.anIntArray105[arg0];
		@Pc(29) int local29 = Static30.anIntArray96[arg0];
		@Pc(33) int local33 = Static30.anIntArray105[arg1];
		@Pc(37) int local37 = Static30.anIntArray96[arg1];
		@Pc(41) int local41 = Static30.anIntArray105[arg2];
		@Pc(45) int local45 = Static30.anIntArray96[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt862; local57++) {
			@Pc(63) int local63 = this.anIntArray74[local57];
			@Pc(68) int local68 = this.anIntArray92[local57];
			@Pc(73) int local73 = this.anIntArray82[local57];
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
			Static30.anIntArray111[local57] = local73 - local55;
			Static30.anIntArray108[local57] = local11 + (local63 << 9) / arg6;
			Static30.anIntArray107[local57] = local13 + (local85 << 9) / arg6;
			if (this.anInt863 > 0) {
				Static30.anIntArray88[local57] = local63;
				Static30.anIntArray93[local57] = local85;
				Static30.anIntArray109[local57] = local73;
			}
		}
		try {
			this.method659(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public void method654() {
		if (this.anInt860 == 3) {
			return;
		}
		this.anInt860 = 3;
		super.anInt2916 = 0;
		this.anInt869 = 0;
		this.anInt857 = 999999;
		this.anInt861 = -999999;
		this.anInt855 = -99999;
		this.anInt858 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt862; local27++) {
			@Pc(33) int local33 = this.anIntArray74[local27];
			@Pc(38) int local38 = this.anIntArray92[local27];
			@Pc(43) int local43 = this.anIntArray82[local27];
			if (local33 < this.anInt857) {
				this.anInt857 = local33;
			}
			if (local33 > this.anInt861) {
				this.anInt861 = local33;
			}
			if (local43 < this.anInt858) {
				this.anInt858 = local43;
			}
			if (local43 > this.anInt855) {
				this.anInt855 = local43;
			}
			if (-local38 > super.anInt2916) {
				super.anInt2916 = -local38;
			}
			if (local38 > this.anInt869) {
				this.anInt869 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIZ)V")
	public void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray81 == null) {
			this.anIntArray81 = new int[this.anInt859];
			this.anIntArray83 = new int[this.anInt859];
			this.anIntArray72 = new int[this.anInt859];
		}
		@Pc(48) int local48;
		if (this.aClass55Array1 == null) {
			this.aClass55Array1 = new Class55[this.anInt862];
			for (local48 = 0; local48 < this.anInt862; local48++) {
				this.aClass55Array1[local48] = new Class55();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt859; local48++) {
			local69 = this.anIntArray80[local48];
			@Pc(74) int local74 = this.anIntArray84[local48];
			@Pc(79) int local79 = this.anIntArray75[local48];
			@Pc(89) int local89 = this.anIntArray74[local74] - this.anIntArray74[local69];
			@Pc(99) int local99 = this.anIntArray92[local74] - this.anIntArray92[local69];
			@Pc(109) int local109 = this.anIntArray82[local74] - this.anIntArray82[local69];
			@Pc(119) int local119 = this.anIntArray74[local79] - this.anIntArray74[local69];
			@Pc(129) int local129 = this.anIntArray92[local79] - this.anIntArray92[local69];
			@Pc(139) int local139 = this.anIntArray82[local79] - this.anIntArray82[local69];
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
			if (this.anIntArray86 == null || (this.anIntArray86[local48] & 0x1) == 0) {
				@Pc(246) Class55 local246 = this.aClass55Array1[local69];
				local246.anInt2098 += local147;
				local246.anInt2094 += local155;
				local246.anInt2093 += local163;
				local246.anInt2092++;
				@Pc(275) Class55 local275 = this.aClass55Array1[local74];
				local275.anInt2098 += local147;
				local275.anInt2094 += local155;
				local275.anInt2093 += local163;
				local275.anInt2092++;
				@Pc(304) Class55 local304 = this.aClass55Array1[local79];
				local304.anInt2098 += local147;
				local304.anInt2094 += local155;
				local304.anInt2093 += local163;
				local304.anInt2092++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray81[local48] = Static30.method678(this.anIntArray73[local48], local349, this.anIntArray86[local48]);
			}
		}
		if (arg5) {
			this.method673(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass55Array2 = new Class55[this.anInt862];
		for (local69 = 0; local69 < this.anInt862; local69++) {
			@Pc(391) Class55 local391 = this.aClass55Array1[local69];
			@Pc(400) Class55 local400 = this.aClass55Array2[local69] = new Class55();
			local400.anInt2098 = local391.anInt2098;
			local400.anInt2094 = local391.anInt2094;
			local400.anInt2093 = local391.anInt2093;
			local400.anInt2092 = local391.anInt2092;
		}
		this.anInt854 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()I")
	public int method656() {
		this.method662();
		return this.anInt857;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method657(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static30.anIntArray85.length < this.anInt859) {
			Static30.anIntArray85 = new int[this.anInt859 + 100];
		}
		return this.method675(arg0, Static30.aClass2_Sub1_Sub4_Sub1_1, Static30.anIntArray85);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()V")
	public void method658() {
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt862; local7++) {
			this.anIntArray74[local7] = -this.anIntArray74[local7];
			this.anIntArray82[local7] = -this.anIntArray82[local7];
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZI)V")
	private void method659(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt861 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt861; local6++) {
			Static30.anIntArray90[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt859; local18++) {
			if (this.anIntArray86 == null || this.anIntArray86[local18] != -1) {
				local33 = this.anIntArray80[local18];
				local38 = this.anIntArray84[local18];
				local43 = this.anIntArray75[local18];
				local47 = Static30.anIntArray108[local33];
				local51 = Static30.anIntArray108[local38];
				local55 = Static30.anIntArray108[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static30.anIntArray88[local33];
					local74 = Static30.anIntArray88[local38];
					@Pc(78) int local78 = Static30.anIntArray88[local43];
					@Pc(82) int local82 = Static30.anIntArray93[local33];
					local86 = Static30.anIntArray93[local38];
					local90 = Static30.anIntArray93[local43];
					@Pc(94) int local94 = Static30.anIntArray109[local33];
					local98 = Static30.anIntArray109[local38];
					@Pc(102) int local102 = Static30.anIntArray109[local43];
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
						Static30.aBooleanArray3[local18] = true;
						@Pc(183) int local183 = (Static30.anIntArray111[local33] + Static30.anIntArray111[local38] + Static30.anIntArray111[local43]) / 3 + this.anInt855;
						Static30.anIntArrayArray11[local183][Static30.anIntArray90[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method676(Static30.anInt867, Static30.anInt868, Static30.anIntArray107[local33], Static30.anIntArray107[local38], Static30.anIntArray107[local43], local47, local51, local55)) {
						Static30.anIntArray98[Static30.anInt870++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static30.anIntArray107[local43] - Static30.anIntArray107[local38]) - (Static30.anIntArray107[local33] - Static30.anIntArray107[local38]) * (local55 - local51) > 0) {
						Static30.aBooleanArray3[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static87.anInt2266 && local51 <= Static87.anInt2266 && local55 <= Static87.anInt2266) {
							Static30.aBooleanArray4[local18] = false;
						} else {
							Static30.aBooleanArray4[local18] = true;
						}
						local70 = (Static30.anIntArray111[local33] + Static30.anIntArray111[local38] + Static30.anIntArray111[local43]) / 3 + this.anInt855;
						Static30.anIntArrayArray11[local70][Static30.anIntArray90[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray87 == null) {
			for (local33 = this.anInt861 - 1; local33 >= 0; local33--) {
				local38 = Static30.anIntArray90[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static30.anIntArrayArray11[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method679(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static30.anIntArray100[local33] = 0;
			Static30.anIntArray102[local33] = 0;
		}
		for (local38 = this.anInt861 - 1; local38 >= 0; local38--) {
			local43 = Static30.anIntArray90[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static30.anIntArrayArray11[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray87[local55];
					local74 = Static30.anIntArray100[local70]++;
					Static30.anIntArrayArray12[local70][local74] = local55;
					if (local70 < 10) {
						Static30.anIntArray102[local70] += local38;
					} else if (local70 == 10) {
						Static30.anIntArray89[local74] = local38;
					} else {
						Static30.anIntArray104[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static30.anIntArray100[1] > 0 || Static30.anIntArray100[2] > 0) {
			local43 = (Static30.anIntArray102[1] + Static30.anIntArray102[2]) / (Static30.anIntArray100[1] + Static30.anIntArray100[2]);
		}
		local47 = 0;
		if (Static30.anIntArray100[3] > 0 || Static30.anIntArray100[4] > 0) {
			local47 = (Static30.anIntArray102[3] + Static30.anIntArray102[4]) / (Static30.anIntArray100[3] + Static30.anIntArray100[4]);
		}
		local51 = 0;
		if (Static30.anIntArray100[6] > 0 || Static30.anIntArray100[8] > 0) {
			local51 = (Static30.anIntArray102[6] + Static30.anIntArray102[8]) / (Static30.anIntArray100[6] + Static30.anIntArray100[8]);
		}
		local70 = 0;
		local74 = Static30.anIntArray100[10];
		@Pc(524) int[] local524 = Static30.anIntArrayArray12[10];
		@Pc(526) int[] local526 = Static30.anIntArray89;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static30.anIntArray100[11];
			local524 = Static30.anIntArrayArray12[11];
			local526 = Static30.anIntArray104;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method679(local524[local70++]);
				if (local70 == local74 && local524 != Static30.anIntArrayArray12[11]) {
					local70 = 0;
					local74 = Static30.anIntArray100[11];
					local524 = Static30.anIntArrayArray12[11];
					local526 = Static30.anIntArray104;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method679(local524[local70++]);
				if (local70 == local74 && local524 != Static30.anIntArrayArray12[11]) {
					local70 = 0;
					local74 = Static30.anIntArray100[11];
					local524 = Static30.anIntArrayArray12[11];
					local526 = Static30.anIntArray104;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method679(local524[local70++]);
				if (local70 == local74 && local524 != Static30.anIntArrayArray12[11]) {
					local70 = 0;
					local74 = Static30.anIntArray100[11];
					local524 = Static30.anIntArrayArray12[11];
					local526 = Static30.anIntArray104;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static30.anIntArray100[local86];
			@Pc(689) int[] local689 = Static30.anIntArrayArray12[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method679(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method679(local524[local70++]);
			if (local70 == local74 && local524 != Static30.anIntArrayArray12[11]) {
				local70 = 0;
				local524 = Static30.anIntArrayArray12[11];
				local74 = Static30.anIntArray100[11];
				local526 = Static30.anIntArray104;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method660(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static30.anIntArray103.length < this.anInt859) {
			Static30.anIntArray103 = new int[this.anInt859 + 100];
		}
		return this.method675(arg0, Static30.aClass2_Sub1_Sub4_Sub1_2, Static30.anIntArray103);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()V")
	public void method661() {
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt862; local7++) {
			@Pc(13) int local13 = this.anIntArray82[local7];
			this.anIntArray82[local7] = this.anIntArray74[local7];
			this.anIntArray74[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "()V")
	public void method662() {
		if (this.anInt860 == 1) {
			return;
		}
		this.anInt860 = 1;
		super.anInt2916 = 0;
		this.anInt869 = 0;
		this.anInt857 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt862; local18++) {
			@Pc(24) int local24 = this.anIntArray74[local18];
			@Pc(29) int local29 = this.anIntArray92[local18];
			@Pc(34) int local34 = this.anIntArray82[local18];
			if (-local29 > super.anInt2916) {
				super.anInt2916 = -local29;
			}
			if (local29 > this.anInt869) {
				this.anInt869 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt857) {
				this.anInt857 = local58;
			}
		}
		this.anInt857 = (int) (Math.sqrt((double) this.anInt857) + 0.99D);
		this.anInt855 = (int) (Math.sqrt((double) (this.anInt857 * this.anInt857 + super.anInt2916 * super.anInt2916)) + 0.99D);
		this.anInt861 = this.anInt855 + (int) (Math.sqrt((double) (this.anInt857 * this.anInt857 + this.anInt869 * this.anInt869)) + 0.99D);
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)V")
	private void method663(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static87.anInt2268;
		@Pc(3) int local3 = Static87.anInt2263;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray80[arg0];
		@Pc(15) int local15 = this.anIntArray84[arg0];
		@Pc(20) int local20 = this.anIntArray75[arg0];
		@Pc(24) int local24 = Static30.anIntArray109[local10];
		@Pc(28) int local28 = Static30.anIntArray109[local15];
		@Pc(32) int local32 = Static30.anIntArray109[local20];
		if (this.anIntArray99 == null) {
			Static87.anInt2265 = 0;
		} else {
			Static87.anInt2265 = this.anIntArray99[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static30.anIntArray94[0] = Static30.anIntArray108[local10];
			Static30.anIntArray110[0] = Static30.anIntArray107[local10];
			local5++;
			Static30.anIntArray91[0] = this.anIntArray81[arg0];
		} else {
			local71 = Static30.anIntArray88[local10];
			local75 = Static30.anIntArray93[local10];
			local80 = this.anIntArray81[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static30.anIntArray97[local32 - local24];
				Static30.anIntArray94[0] = local1 + (local71 + ((Static30.anIntArray88[local20] - local71) * local93 >> 16) << 9) / 50;
				Static30.anIntArray110[0] = local3 + (local75 + ((Static30.anIntArray93[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static30.anIntArray91[0] = local80 + ((this.anIntArray72[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static30.anIntArray97[local28 - local24];
				Static30.anIntArray94[local5] = local1 + (local71 + ((Static30.anIntArray88[local15] - local71) * local93 >> 16) << 9) / 50;
				Static30.anIntArray110[local5] = local3 + (local75 + ((Static30.anIntArray93[local15] - local75) * local93 >> 16) << 9) / 50;
				Static30.anIntArray91[local5++] = local80 + ((this.anIntArray83[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static30.anIntArray94[local5] = Static30.anIntArray108[local15];
			Static30.anIntArray110[local5] = Static30.anIntArray107[local15];
			Static30.anIntArray91[local5++] = this.anIntArray83[arg0];
		} else {
			local71 = Static30.anIntArray88[local15];
			local75 = Static30.anIntArray93[local15];
			local80 = this.anIntArray83[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static30.anIntArray97[local24 - local28];
				Static30.anIntArray94[local5] = local1 + (local71 + ((Static30.anIntArray88[local10] - local71) * local93 >> 16) << 9) / 50;
				Static30.anIntArray110[local5] = local3 + (local75 + ((Static30.anIntArray93[local10] - local75) * local93 >> 16) << 9) / 50;
				Static30.anIntArray91[local5++] = local80 + ((this.anIntArray81[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static30.anIntArray97[local32 - local28];
				Static30.anIntArray94[local5] = local1 + (local71 + ((Static30.anIntArray88[local20] - local71) * local93 >> 16) << 9) / 50;
				Static30.anIntArray110[local5] = local3 + (local75 + ((Static30.anIntArray93[local20] - local75) * local93 >> 16) << 9) / 50;
				Static30.anIntArray91[local5++] = local80 + ((this.anIntArray72[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static30.anIntArray94[local5] = Static30.anIntArray108[local20];
			Static30.anIntArray110[local5] = Static30.anIntArray107[local20];
			Static30.anIntArray91[local5++] = this.anIntArray72[arg0];
		} else {
			local71 = Static30.anIntArray88[local20];
			local75 = Static30.anIntArray93[local20];
			local80 = this.anIntArray72[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static30.anIntArray97[local28 - local32];
				Static30.anIntArray94[local5] = local1 + (local71 + ((Static30.anIntArray88[local15] - local71) * local93 >> 16) << 9) / 50;
				Static30.anIntArray110[local5] = local3 + (local75 + ((Static30.anIntArray93[local15] - local75) * local93 >> 16) << 9) / 50;
				Static30.anIntArray91[local5++] = local80 + ((this.anIntArray83[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static30.anIntArray97[local24 - local32];
				Static30.anIntArray94[local5] = local1 + (local71 + ((Static30.anIntArray88[local10] - local71) * local93 >> 16) << 9) / 50;
				Static30.anIntArray110[local5] = local3 + (local75 + ((Static30.anIntArray93[local10] - local75) * local93 >> 16) << 9) / 50;
				Static30.anIntArray91[local5++] = local80 + ((this.anIntArray81[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static30.anIntArray94[0];
		local75 = Static30.anIntArray94[1];
		local80 = Static30.anIntArray94[2];
		local93 = Static30.anIntArray110[0];
		@Pc(588) int local588 = Static30.anIntArray110[1];
		@Pc(592) int local592 = Static30.anIntArray110[2];
		Static87.aBoolean90 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static87.anInt2266 || local75 > Static87.anInt2266 || local80 > Static87.anInt2266) {
				Static87.aBoolean90 = true;
			}
			if (this.anIntArray86 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray86[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static87.method1598(local93, local588, local592, local71, local75, local80, Static30.anIntArray91[0], Static30.anIntArray91[1], Static30.anIntArray91[2]);
			} else if (local619 == 1) {
				Static87.method1593(local93, local588, local592, local71, local75, local80, Static30.anIntArray101[this.anIntArray81[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray86[arg0] >> 2;
				local678 = this.anIntArray77[local673];
				local683 = this.anIntArray78[local673];
				local688 = this.anIntArray79[local673];
				Static87.method1609(local93, local588, local592, local71, local75, local80, Static30.anIntArray91[0], Static30.anIntArray91[1], Static30.anIntArray91[2], Static30.anIntArray88[local678], Static30.anIntArray88[local683], Static30.anIntArray88[local688], Static30.anIntArray93[local678], Static30.anIntArray93[local683], Static30.anIntArray93[local688], Static30.anIntArray109[local678], Static30.anIntArray109[local683], Static30.anIntArray109[local688], this.anIntArray73[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray86[arg0] >> 2;
				local678 = this.anIntArray77[local673];
				local683 = this.anIntArray78[local673];
				local688 = this.anIntArray79[local673];
				Static87.method1609(local93, local588, local592, local71, local75, local80, this.anIntArray81[arg0], this.anIntArray81[arg0], this.anIntArray81[arg0], Static30.anIntArray88[local678], Static30.anIntArray88[local683], Static30.anIntArray88[local688], Static30.anIntArray93[local678], Static30.anIntArray93[local683], Static30.anIntArray93[local688], Static30.anIntArray109[local678], Static30.anIntArray109[local683], Static30.anIntArray109[local688], this.anIntArray73[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static87.anInt2266 || local75 > Static87.anInt2266 || local80 > Static87.anInt2266 || Static30.anIntArray94[3] < 0 || Static30.anIntArray94[3] > Static87.anInt2266) {
			Static87.aBoolean90 = true;
		}
		if (this.anIntArray86 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray86[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static87.method1598(local93, local588, local592, local71, local75, local80, Static30.anIntArray91[0], Static30.anIntArray91[1], Static30.anIntArray91[2]);
			Static87.method1598(local93, local592, Static30.anIntArray110[3], local71, local80, Static30.anIntArray94[3], Static30.anIntArray91[0], Static30.anIntArray91[2], Static30.anIntArray91[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static30.anIntArray101[this.anIntArray81[arg0]];
			Static87.method1593(local93, local588, local592, local71, local75, local80, local673);
			Static87.method1593(local93, local592, Static30.anIntArray110[3], local71, local80, Static30.anIntArray94[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray86[arg0] >> 2;
			local678 = this.anIntArray77[local673];
			local683 = this.anIntArray78[local673];
			local688 = this.anIntArray79[local673];
			Static87.method1609(local93, local588, local592, local71, local75, local80, Static30.anIntArray91[0], Static30.anIntArray91[1], Static30.anIntArray91[2], Static30.anIntArray88[local678], Static30.anIntArray88[local683], Static30.anIntArray88[local688], Static30.anIntArray93[local678], Static30.anIntArray93[local683], Static30.anIntArray93[local688], Static30.anIntArray109[local678], Static30.anIntArray109[local683], Static30.anIntArray109[local688], this.anIntArray73[arg0]);
			Static87.method1609(local93, local592, Static30.anIntArray110[3], local71, local80, Static30.anIntArray94[3], Static30.anIntArray91[0], Static30.anIntArray91[2], Static30.anIntArray91[3], Static30.anIntArray88[local678], Static30.anIntArray88[local683], Static30.anIntArray88[local688], Static30.anIntArray93[local678], Static30.anIntArray93[local683], Static30.anIntArray93[local688], Static30.anIntArray109[local678], Static30.anIntArray109[local683], Static30.anIntArray109[local688], this.anIntArray73[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray86[arg0] >> 2;
		local678 = this.anIntArray77[local673];
		local683 = this.anIntArray78[local673];
		local688 = this.anIntArray79[local673];
		Static87.method1609(local93, local588, local592, local71, local75, local80, this.anIntArray81[arg0], this.anIntArray81[arg0], this.anIntArray81[arg0], Static30.anIntArray88[local678], Static30.anIntArray88[local683], Static30.anIntArray88[local688], Static30.anIntArray93[local678], Static30.anIntArray93[local683], Static30.anIntArray93[local688], Static30.anIntArray109[local678], Static30.anIntArray109[local683], Static30.anIntArray109[local688], this.anIntArray73[arg0]);
		Static87.method1609(local93, local592, Static30.anIntArray110[3], local71, local80, Static30.anIntArray94[3], this.anIntArray81[arg0], this.anIntArray81[arg0], this.anIntArray81[arg0], Static30.anIntArray88[local678], Static30.anIntArray88[local683], Static30.anIntArray88[local688], Static30.anIntArray93[local678], Static30.anIntArray93[local683], Static30.anIntArray93[local688], Static30.anIntArray109[local678], Static30.anIntArray109[local683], Static30.anIntArray109[local688], this.anIntArray73[arg0]);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public void method664() {
		@Pc(4) int local4 = this.anInt854 >> 16;
		@Pc(11) int local11 = this.anInt854 << 16 >> 16;
		this.method673(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
	public void method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt862; local7++) {
			this.anIntArray74[local7] = this.anIntArray74[local7] * arg0 / 128;
			this.anIntArray92[local7] = this.anIntArray92[local7] * arg1 / 128;
			this.anIntArray82[local7] = this.anIntArray82[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt860 != 1) {
			this.method662();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt857 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt857 << 9;
		if (local60 / local36 >= Static87.anInt2260) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt857 << 9;
		if (local73 / local36 <= Static87.anInt2262) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt857 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static87.anInt2264) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2916 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static87.anInt2267) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2916 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt863 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static30.aBoolean46) {
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
			local215 = Static30.anInt867 - Static87.anInt2268;
			local219 = Static30.anInt868 - Static87.anInt2263;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean45) {
					Static30.anIntArray98[Static30.anInt870++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static87.anInt2268;
		local215 = Static87.anInt2263;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static30.anIntArray105[arg0];
			local253 = Static30.anIntArray96[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt862; local265++) {
			@Pc(271) int local271 = this.anIntArray74[local265];
			@Pc(276) int local276 = this.anIntArray92[local265];
			@Pc(281) int local281 = this.anIntArray82[local265];
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
			Static30.anIntArray111[local265] = local281 - local25;
			if (local281 >= 50) {
				Static30.anIntArray108[local265] = local168 + (local271 << 9) / local281;
				Static30.anIntArray107[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static30.anIntArray108[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static30.anIntArray88[local265] = local271;
				Static30.anIntArray93[local265] = local293;
				Static30.anIntArray109[local265] = local281;
			}
		}
		try {
			this.method659(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!fd;I)I")
	private int method666(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray74[arg1];
		@Pc(11) int local11 = arg0.anIntArray92[arg1];
		@Pc(16) int local16 = arg0.anIntArray82[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt862; local18++) {
			if (local6 == this.anIntArray74[local18] && local11 == this.anIntArray92[local18] && local16 == this.anIntArray82[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray74[this.anInt862] = local6;
			this.anIntArray92[this.anInt862] = local11;
			this.anIntArray82[this.anInt862] = local16;
			if (arg0.anIntArray76 != null) {
				this.anIntArray76[this.anInt862] = arg0.anIntArray76[arg1];
			}
			local1 = this.anInt862++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
	public void method667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt860 != 2 && this.anInt860 != 1) {
			this.method668();
		}
		@Pc(11) int local11 = Static87.anInt2268;
		@Pc(13) int local13 = Static87.anInt2263;
		@Pc(17) int local17 = Static30.anIntArray105[0];
		@Pc(21) int local21 = Static30.anIntArray96[0];
		@Pc(25) int local25 = Static30.anIntArray105[arg0];
		@Pc(29) int local29 = Static30.anIntArray96[arg0];
		@Pc(33) int local33 = Static30.anIntArray105[arg1];
		@Pc(37) int local37 = Static30.anIntArray96[arg1];
		@Pc(41) int local41 = Static30.anIntArray105[arg2];
		@Pc(45) int local45 = Static30.anIntArray96[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt862; local57++) {
			@Pc(63) int local63 = this.anIntArray74[local57];
			@Pc(68) int local68 = this.anIntArray92[local57];
			@Pc(73) int local73 = this.anIntArray82[local57];
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
			Static30.anIntArray111[local57] = local73 - local55;
			Static30.anIntArray108[local57] = local11 + (local63 << 9) / local73;
			Static30.anIntArray107[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt863 > 0) {
				Static30.anIntArray88[local57] = local63;
				Static30.anIntArray93[local57] = local85;
				Static30.anIntArray109[local57] = local73;
			}
		}
		try {
			this.method659(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "()V")
	private void method668() {
		if (this.anInt860 == 2) {
			return;
		}
		this.anInt860 = 2;
		this.anInt857 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt862; local12++) {
			@Pc(18) int local18 = this.anIntArray74[local12];
			@Pc(23) int local23 = this.anIntArray92[local12];
			@Pc(28) int local28 = this.anIntArray82[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt857) {
				this.anInt857 = local40;
			}
		}
		this.anInt857 = (int) (Math.sqrt((double) this.anInt857) + 0.99D);
		this.anInt855 = this.anInt857;
		this.anInt861 = this.anInt857 + this.anInt857;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ba;ILclient!ba;I[I)V")
	public void method670(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method683(arg0, arg1);
			return;
		}
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		@Pc(24) Class69 local24 = arg0.aClass69Array1[arg1];
		@Pc(29) Class69 local29 = arg2.aClass69Array1[arg3];
		@Pc(32) Class2_Sub6 local32 = local24.aClass2_Sub6_1;
		Static30.anInt866 = 0;
		Static30.anInt864 = 0;
		Static30.anInt865 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt2995; local47++) {
			local53 = local24.anIntArray356[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray129[local53] == 0) {
				this.method672(local32.anIntArray129[local53], local32.anIntArrayArray15[local53], local24.anIntArray360[local47], local24.anIntArray357[local47], local24.anIntArray354[local47]);
			}
		}
		Static30.anInt866 = 0;
		Static30.anInt864 = 0;
		Static30.anInt865 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt2995; local53++) {
			@Pc(118) int local118 = local29.anIntArray356[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray129[local118] == 0) {
				this.method672(local32.anIntArray129[local118], local32.anIntArrayArray15[local118], local29.anIntArray360[local53], local29.anIntArray357[local53], local29.anIntArray354[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)V")
	public void method671(@OriginalArg(0) int arg0) {
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		@Pc(9) int local9 = Static30.anIntArray105[arg0];
		@Pc(13) int local13 = Static30.anIntArray96[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt862; local15++) {
			@Pc(32) int local32 = this.anIntArray92[local15] * local13 - this.anIntArray82[local15] * local9 >> 16;
			this.anIntArray82[local15] = this.anIntArray92[local15] * local9 + this.anIntArray82[local15] * local13 >> 16;
			this.anIntArray92[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[IIII)V")
	private void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static30.anInt866 = 0;
			Static30.anInt864 = 0;
			Static30.anInt865 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray10.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray10[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static30.anInt866 += this.anIntArray74[local36];
						Static30.anInt864 += this.anIntArray92[local36];
						Static30.anInt865 += this.anIntArray82[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static30.anInt866 = Static30.anInt866 / local6 + arg2;
				Static30.anInt864 = Static30.anInt864 / local6 + arg3;
				Static30.anInt865 = Static30.anInt865 / local6 + arg4;
			} else {
				Static30.anInt866 = arg2;
				Static30.anInt864 = arg3;
				Static30.anInt865 = arg4;
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
						this.anIntArray74[local31] += arg2;
						this.anIntArray92[local31] += arg3;
						this.anIntArray82[local31] += arg4;
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
						this.anIntArray74[local31] -= Static30.anInt866;
						this.anIntArray92[local31] -= Static30.anInt864;
						this.anIntArray82[local31] -= Static30.anInt865;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static30.anIntArray105[local225];
							local235 = Static30.anIntArray96[local225];
							local251 = this.anIntArray92[local31] * local231 + this.anIntArray74[local31] * local235 >> 16;
							this.anIntArray92[local31] = this.anIntArray92[local31] * local235 - this.anIntArray74[local31] * local231 >> 16;
							this.anIntArray74[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static30.anIntArray105[local36];
							local235 = Static30.anIntArray96[local36];
							local251 = this.anIntArray92[local31] * local235 - this.anIntArray82[local31] * local231 >> 16;
							this.anIntArray82[local31] = this.anIntArray92[local31] * local231 + this.anIntArray82[local31] * local235 >> 16;
							this.anIntArray92[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static30.anIntArray105[local219];
							local235 = Static30.anIntArray96[local219];
							local251 = this.anIntArray82[local31] * local231 + this.anIntArray74[local31] * local235 >> 16;
							this.anIntArray82[local31] = this.anIntArray82[local31] * local235 - this.anIntArray74[local31] * local231 >> 16;
							this.anIntArray74[local31] = local251;
						}
						this.anIntArray74[local31] += Static30.anInt866;
						this.anIntArray92[local31] += Static30.anInt864;
						this.anIntArray82[local31] += Static30.anInt865;
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
						this.anIntArray74[local31] -= Static30.anInt866;
						this.anIntArray92[local31] -= Static30.anInt864;
						this.anIntArray82[local31] -= Static30.anInt865;
						this.anIntArray74[local31] = this.anIntArray74[local31] * arg2 / 128;
						this.anIntArray92[local31] = this.anIntArray92[local31] * arg3 / 128;
						this.anIntArray82[local31] = this.anIntArray82[local31] * arg4 / 128;
						this.anIntArray74[local31] += Static30.anInt866;
						this.anIntArray92[local31] += Static30.anInt864;
						this.anIntArray82[local31] += Static30.anInt865;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray9 != null && this.anIntArray99 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray9.length) {
					local115 = this.anIntArrayArray9[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray99[local31] += arg2 * 8;
						if (this.anIntArray99[local31] < 0) {
							this.anIntArray99[local31] = 0;
						}
						if (this.anIntArray99[local31] > 255) {
							this.anIntArray99[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)V")
	private void method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt859; local1++) {
			local7 = this.anIntArray80[local1];
			@Pc(12) int local12 = this.anIntArray84[local1];
			@Pc(17) int local17 = this.anIntArray75[local1];
			@Pc(30) Class55 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray86 == null) {
				local25 = this.anIntArray73[local1];
				local30 = this.aClass55Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt2098 + arg3 * local30.anInt2094 + arg4 * local30.anInt2093) / (arg1 * local30.anInt2092);
				this.anIntArray81[local1] = Static30.method678(local25, local52, 0);
				@Pc(65) Class55 local65 = this.aClass55Array1[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt2098 + arg3 * local65.anInt2094 + arg4 * local65.anInt2093) / (arg1 * local65.anInt2092);
				this.anIntArray83[local1] = Static30.method678(local25, local87, 0);
				@Pc(100) Class55 local100 = this.aClass55Array1[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt2098 + arg3 * local100.anInt2094 + arg4 * local100.anInt2093) / (arg1 * local100.anInt2092);
				this.anIntArray72[local1] = Static30.method678(local25, local122, 0);
			} else if ((this.anIntArray86[local1] & 0x1) == 0) {
				local25 = this.anIntArray73[local1];
				@Pc(148) int local148 = this.anIntArray86[local1];
				local30 = this.aClass55Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt2098 + arg3 * local30.anInt2094 + arg4 * local30.anInt2093) / (arg1 * local30.anInt2092);
				this.anIntArray81[local1] = Static30.method678(local25, local52, local148);
				local30 = this.aClass55Array1[local12];
				local52 = arg0 + (arg2 * local30.anInt2098 + arg3 * local30.anInt2094 + arg4 * local30.anInt2093) / (arg1 * local30.anInt2092);
				this.anIntArray83[local1] = Static30.method678(local25, local52, local148);
				local30 = this.aClass55Array1[local17];
				local52 = arg0 + (arg2 * local30.anInt2098 + arg3 * local30.anInt2094 + arg4 * local30.anInt2093) / (arg1 * local30.anInt2092);
				this.anIntArray72[local1] = Static30.method678(local25, local52, local148);
			}
		}
		this.aClass55Array1 = null;
		this.aClass55Array2 = null;
		this.anIntArray76 = null;
		this.anIntArray106 = null;
		if (this.anIntArray86 != null) {
			for (local7 = 0; local7 < this.anInt859; local7++) {
				if ((this.anIntArray86[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray73 = null;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	public void method674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt859; local1++) {
			if (this.anIntArray73[local1] == arg0) {
				this.anIntArray73[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLclient!fd;[I)Lclient!fd;")
	private Class2_Sub1_Sub4_Sub1 method675(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub1 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt862 = this.anInt862;
		arg1.anInt859 = this.anInt859;
		arg1.anInt863 = this.anInt863;
		if (arg1.anIntArray74 == null || arg1.anIntArray74.length < this.anInt862) {
			arg1.anIntArray74 = new int[this.anInt862 + 100];
			arg1.anIntArray92 = new int[this.anInt862 + 100];
			arg1.anIntArray82 = new int[this.anInt862 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt862; local43++) {
			arg1.anIntArray74[local43] = this.anIntArray74[local43];
			arg1.anIntArray92[local43] = this.anIntArray92[local43];
			arg1.anIntArray82[local43] = this.anIntArray82[local43];
		}
		if (arg0) {
			arg1.anIntArray99 = this.anIntArray99;
		} else {
			arg1.anIntArray99 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray99 == null) {
				for (local88 = 0; local88 < this.anInt859; local88++) {
					arg1.anIntArray99[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt859; local88++) {
					arg1.anIntArray99[local88] = this.anIntArray99[local88];
				}
			}
		}
		arg1.anIntArray86 = this.anIntArray86;
		arg1.anIntArray73 = this.anIntArray73;
		arg1.anIntArray87 = this.anIntArray87;
		arg1.anInt856 = this.anInt856;
		arg1.anIntArrayArray9 = this.anIntArrayArray9;
		arg1.anIntArrayArray10 = this.anIntArrayArray10;
		arg1.anIntArray80 = this.anIntArray80;
		arg1.anIntArray84 = this.anIntArray84;
		arg1.anIntArray75 = this.anIntArray75;
		arg1.anIntArray81 = this.anIntArray81;
		arg1.anIntArray83 = this.anIntArray83;
		arg1.anIntArray72 = this.anIntArray72;
		arg1.anIntArray77 = this.anIntArray77;
		arg1.anIntArray78 = this.anIntArray78;
		arg1.anIntArray79 = this.anIntArray79;
		arg1.aBoolean45 = this.aBoolean45;
		arg1.anInt860 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(III)V")
	public void method677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt860 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt862; local4++) {
			this.anIntArray74[local4] += arg0;
			this.anIntArray92[local4] += arg1;
			this.anIntArray82[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(I)V")
	private void method679(@OriginalArg(0) int arg0) {
		if (Static30.aBooleanArray3[arg0]) {
			this.method663(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray80[arg0];
		@Pc(17) int local17 = this.anIntArray84[arg0];
		@Pc(22) int local22 = this.anIntArray75[arg0];
		Static87.aBoolean90 = Static30.aBooleanArray4[arg0];
		if (this.anIntArray99 == null) {
			Static87.anInt2265 = 0;
		} else {
			Static87.anInt2265 = this.anIntArray99[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray86 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray86[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static87.method1598(Static30.anIntArray107[local12], Static30.anIntArray107[local17], Static30.anIntArray107[local22], Static30.anIntArray108[local12], Static30.anIntArray108[local17], Static30.anIntArray108[local22], this.anIntArray81[arg0], this.anIntArray83[arg0], this.anIntArray72[arg0]);
		} else if (local42 == 1) {
			Static87.method1593(Static30.anIntArray107[local12], Static30.anIntArray107[local17], Static30.anIntArray107[local22], Static30.anIntArray108[local12], Static30.anIntArray108[local17], Static30.anIntArray108[local22], Static30.anIntArray101[this.anIntArray81[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray86[arg0] >> 2;
				local128 = this.anIntArray77[local123];
				local133 = this.anIntArray78[local123];
				local138 = this.anIntArray79[local123];
				Static87.method1609(Static30.anIntArray107[local12], Static30.anIntArray107[local17], Static30.anIntArray107[local22], Static30.anIntArray108[local12], Static30.anIntArray108[local17], Static30.anIntArray108[local22], this.anIntArray81[arg0], this.anIntArray83[arg0], this.anIntArray72[arg0], Static30.anIntArray88[local128], Static30.anIntArray88[local133], Static30.anIntArray88[local138], Static30.anIntArray93[local128], Static30.anIntArray93[local133], Static30.anIntArray93[local138], Static30.anIntArray109[local128], Static30.anIntArray109[local133], Static30.anIntArray109[local138], this.anIntArray73[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray86[arg0] >> 2;
				local128 = this.anIntArray77[local123];
				local133 = this.anIntArray78[local123];
				local138 = this.anIntArray79[local123];
				Static87.method1609(Static30.anIntArray107[local12], Static30.anIntArray107[local17], Static30.anIntArray107[local22], Static30.anIntArray108[local12], Static30.anIntArray108[local17], Static30.anIntArray108[local22], this.anIntArray81[arg0], this.anIntArray81[arg0], this.anIntArray81[arg0], Static30.anIntArray88[local128], Static30.anIntArray88[local133], Static30.anIntArray88[local138], Static30.anIntArray93[local128], Static30.anIntArray93[local133], Static30.anIntArray93[local138], Static30.anIntArray109[local128], Static30.anIntArray109[local133], Static30.anIntArray109[local138], this.anIntArray73[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "()V")
	public void method681() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray76 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt862; local9++) {
				local15 = this.anIntArray76[local9];
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
			while (local59 < this.anInt862) {
				local65 = this.anIntArray76[local59];
				this.anIntArrayArray10[local65][local5[local65]++] = local59++;
			}
			this.anIntArray76 = null;
		}
		if (this.anIntArray106 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt859; local9++) {
			local15 = this.anIntArray106[local9];
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
		while (local59 < this.anInt859) {
			local65 = this.anIntArray106[local59];
			this.anIntArrayArray9[local65][local5[local65]++] = local59++;
		}
		this.anIntArray106 = null;
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "()V")
	public void method682() {
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt862; local7++) {
			this.anIntArray82[local7] = -this.anIntArray82[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt859; local24++) {
			@Pc(30) int local30 = this.anIntArray80[local24];
			this.anIntArray80[local24] = this.anIntArray75[local24];
			this.anIntArray75[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ba;I)V")
	public void method683(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray10 == null || arg1 == -1) {
			return;
		}
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		@Pc(18) Class69 local18 = arg0.aClass69Array1[arg1];
		@Pc(21) Class2_Sub6 local21 = local18.aClass2_Sub6_1;
		Static30.anInt866 = 0;
		Static30.anInt864 = 0;
		Static30.anInt865 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt2995; local29++) {
			@Pc(35) int local35 = local18.anIntArray356[local29];
			this.method672(local21.anIntArray129[local35], local21.anIntArrayArray15[local35], local18.anIntArray360[local29], local18.anIntArray357[local29], local18.anIntArray354[local29]);
		}
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "()V")
	public void method684() {
		this.aClass55Array1 = null;
		this.anInt860 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt862; local7++) {
			@Pc(13) int local13 = this.anIntArray74[local7];
			this.anIntArray74[local7] = this.anIntArray82[local7];
			this.anIntArray82[local7] = -local13;
		}
	}
}
