import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub1_Sub8_Sub3 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!pc", name = "wc", descriptor = "[I")
	public static int[] anIntArray304 = new int[128];

	@OriginalMember(owner = "client!pc", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
	public int anInt1935;

	@OriginalMember(owner = "client!pc", name = "pb", descriptor = "I")
	private int anInt1936;

	@OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
	public int anInt1937;

	@OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
	public int anInt1938;

	@OriginalMember(owner = "client!pc", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!pc", name = "wb", descriptor = "[Lclient!fe;")
	public Class24[] aClass24Array1;

	@OriginalMember(owner = "client!pc", name = "Db", descriptor = "I")
	private int anInt1940;

	@OriginalMember(owner = "client!pc", name = "Fb", descriptor = "I")
	public int anInt1941;

	@OriginalMember(owner = "client!pc", name = "Lb", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!pc", name = "Pb", descriptor = "[Lclient!fe;")
	public Class24[] aClass24Array2;

	@OriginalMember(owner = "client!pc", name = "Rb", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!pc", name = "Tb", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!pc", name = "Ub", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!pc", name = "Bb", descriptor = "I")
	public int anInt1939 = 0;

	@OriginalMember(owner = "client!pc", name = "Qb", descriptor = "I")
	private int anInt1943 = 0;

	@OriginalMember(owner = "client!pc", name = "Ib", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!pc", name = "Hb", descriptor = "I")
	private int anInt1942 = 0;

	@OriginalMember(owner = "client!pc", name = "Sb", descriptor = "I")
	public int anInt1944 = 0;

	@OriginalMember(owner = "client!pc", name = "Ab", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!pc", name = "zb", descriptor = "[I")
	public int[] anIntArray274;

	@OriginalMember(owner = "client!pc", name = "Ob", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!pc", name = "Eb", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!pc", name = "Nb", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!pc", name = "vb", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!pc", name = "Vb", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!pc", name = "Mb", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!pc", name = "Cb", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!pc", name = "Kb", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!pc", name = "xb", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!pc", name = "Jb", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!pc", name = "yb", descriptor = "[I")
	private int[] anIntArray273;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray304[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray304[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray304[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray304[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray304[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub8_Sub3(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class1_Sub8 local21 = new Class1_Sub8(arg0);
		@Pc(26) Class1_Sub8 local26 = new Class1_Sub8(arg0);
		@Pc(31) Class1_Sub8 local31 = new Class1_Sub8(arg0);
		@Pc(36) Class1_Sub8 local36 = new Class1_Sub8(arg0);
		@Pc(41) Class1_Sub8 local41 = new Class1_Sub8(arg0);
		local21.anInt1692 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1199();
		@Pc(55) int local55 = local21.method1199();
		@Pc(59) int local59 = local21.method1186();
		@Pc(63) int local63 = local21.method1186();
		@Pc(67) int local67 = local21.method1186();
		@Pc(71) int local71 = local21.method1186();
		@Pc(75) int local75 = local21.method1186();
		@Pc(79) int local79 = local21.method1186();
		@Pc(83) int local83 = local21.method1199();
		@Pc(87) int local87 = local21.method1199();
		@Pc(91) int local91 = local21.method1199();
		@Pc(95) int local95 = local21.method1199();
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
		this.anInt1944 = local51;
		this.anInt1939 = local55;
		this.anInt1942 = local59;
		this.anIntArray275 = new int[local51];
		this.anIntArray274 = new int[local51];
		this.anIntArray283 = new int[local51];
		this.anIntArray277 = new int[local55];
		this.anIntArray282 = new int[local55];
		this.anIntArray269 = new int[local55];
		this.anIntArray271 = new int[local59];
		this.anIntArray286 = new int[local59];
		this.anIntArray270 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray281 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray276 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray279 = new int[local55];
		} else {
			this.anInt1943 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray272 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray278 = new int[local55];
		}
		this.anIntArray273 = new int[local55];
		local21.anInt1692 = local97;
		local26.anInt1692 = local196;
		local31.anInt1692 = local202;
		local36.anInt1692 = local103;
		local41.anInt1692 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1186();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1195();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1195();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1195();
			}
			this.anIntArray275[local321] = local315 + local328;
			this.anIntArray274[local321] = local317 + local338;
			this.anIntArray283[local321] = local319 + local348;
			local315 = this.anIntArray275[local321];
			local317 = this.anIntArray274[local321];
			local319 = this.anIntArray283[local321];
			if (this.anIntArray281 != null) {
				this.anIntArray281[local321] = local41.method1186();
			}
		}
		local21.anInt1692 = local180;
		local26.anInt1692 = local138;
		local31.anInt1692 = local111;
		local36.anInt1692 = local162;
		local41.anInt1692 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray273[local326] = local21.method1199();
			if (this.anIntArray276 != null) {
				this.anIntArray276[local326] = local26.method1186();
			}
			if (this.anIntArray279 != null) {
				this.anIntArray279[local326] = local31.method1186();
			}
			if (this.anIntArray272 != null) {
				this.anIntArray272[local326] = local36.method1186();
			}
			if (this.anIntArray278 != null) {
				this.anIntArray278[local326] = local41.method1186();
			}
		}
		local21.anInt1692 = local174;
		local26.anInt1692 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1186();
			if (local496 == 1) {
				local328 = local21.method1195() + local489;
				local338 = local21.method1195() + local328;
				local348 = local21.method1195() + local338;
				local489 = local348;
				this.anIntArray277[local491] = local328;
				this.anIntArray282[local491] = local338;
				this.anIntArray269[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1195() + local489;
				local489 = local348;
				this.anIntArray277[local491] = local328;
				this.anIntArray282[local491] = local338;
				this.anIntArray269[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1195() + local489;
				local489 = local348;
				this.anIntArray277[local491] = local328;
				this.anIntArray282[local491] = local338;
				this.anIntArray269[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1195() + local489;
				local489 = local348;
				this.anIntArray277[local491] = local328;
				this.anIntArray282[local491] = local599;
				this.anIntArray269[local491] = local348;
			}
		}
		local21.anInt1692 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray271[local496] = local21.method1199();
			this.anIntArray286[local496] = local21.method1199();
			this.anIntArray270[local496] = local21.method1199();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8_Sub3() {
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([Lclient!pc;I)V")
	public Class1_Sub1_Sub8_Sub3(@OriginalArg(0) Class1_Sub1_Sub8_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1944 = 0;
		this.anInt1939 = 0;
		this.anInt1942 = 0;
		this.anInt1943 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class1_Sub1_Sub8_Sub3 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1944 += local43.anInt1944;
				this.anInt1939 += local43.anInt1939;
				this.anInt1942 += local43.anInt1942;
				local18 |= local43.anIntArray276 != null;
				if (local43.anIntArray279 == null) {
					if (this.anInt1943 == -1) {
						this.anInt1943 = local43.anInt1943;
					}
					if (this.anInt1943 != local43.anInt1943) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray272 != null;
				local24 |= local43.anIntArray278 != null;
			}
		}
		this.anIntArray275 = new int[this.anInt1944];
		this.anIntArray274 = new int[this.anInt1944];
		this.anIntArray283 = new int[this.anInt1944];
		this.anIntArray281 = new int[this.anInt1944];
		this.anIntArray277 = new int[this.anInt1939];
		this.anIntArray282 = new int[this.anInt1939];
		this.anIntArray269 = new int[this.anInt1939];
		this.anIntArray271 = new int[this.anInt1942];
		this.anIntArray286 = new int[this.anInt1942];
		this.anIntArray270 = new int[this.anInt1942];
		if (local18) {
			this.anIntArray276 = new int[this.anInt1939];
		}
		if (local20) {
			this.anIntArray279 = new int[this.anInt1939];
		}
		if (local22) {
			this.anIntArray272 = new int[this.anInt1939];
		}
		if (local24) {
			this.anIntArray278 = new int[this.anInt1939];
		}
		this.anIntArray273 = new int[this.anInt1939];
		this.anInt1944 = 0;
		this.anInt1939 = 0;
		this.anInt1942 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class1_Sub1_Sub8_Sub3 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt1939; local223++) {
					if (local18) {
						if (local219.anIntArray276 == null) {
							this.anIntArray276[this.anInt1939] = 0;
						} else {
							local241 = local219.anIntArray276[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray276[this.anInt1939] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray279 == null) {
							this.anIntArray279[this.anInt1939] = local219.anInt1943;
						} else {
							this.anIntArray279[this.anInt1939] = local219.anIntArray279[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray272 == null) {
							this.anIntArray272[this.anInt1939] = 0;
						} else {
							this.anIntArray272[this.anInt1939] = local219.anIntArray272[local223];
						}
					}
					if (local24 && local219.anIntArray278 != null) {
						this.anIntArray278[this.anInt1939] = local219.anIntArray278[local223];
					}
					this.anIntArray273[this.anInt1939] = local219.anIntArray273[local223];
					this.anIntArray277[this.anInt1939] = this.method1385(local219, local219.anIntArray277[local223]);
					this.anIntArray282[this.anInt1939] = this.method1385(local219, local219.anIntArray282[local223]);
					this.anIntArray269[this.anInt1939] = this.method1385(local219, local219.anIntArray269[local223]);
					this.anInt1939++;
				}
				for (local241 = 0; local241 < local219.anInt1942; local241++) {
					this.anIntArray271[this.anInt1942] = this.method1385(local219, local219.anIntArray271[local241]);
					this.anIntArray286[this.anInt1942] = this.method1385(local219, local219.anIntArray286[local241]);
					this.anIntArray270[this.anInt1942] = this.method1385(local219, local219.anIntArray270[local241]);
					this.anInt1942++;
				}
				local212 += local219.anInt1942;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([Lclient!pc;IZ)V")
	public Class1_Sub1_Sub8_Sub3(@OriginalArg(0) Class1_Sub1_Sub8_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1944 = 0;
		this.anInt1939 = 0;
		this.anInt1942 = 0;
		this.anInt1943 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class1_Sub1_Sub8_Sub3 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1944 += local43.anInt1944;
				this.anInt1939 += local43.anInt1939;
				this.anInt1942 += local43.anInt1942;
				local18 |= local43.anIntArray276 != null;
				if (local43.anIntArray279 == null) {
					if (this.anInt1943 == -1) {
						this.anInt1943 = local43.anInt1943;
					}
					if (this.anInt1943 != local43.anInt1943) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray272 != null;
				local24 |= local43.anIntArray273 != null;
			}
		}
		this.anIntArray275 = new int[this.anInt1944];
		this.anIntArray274 = new int[this.anInt1944];
		this.anIntArray283 = new int[this.anInt1944];
		this.anIntArray277 = new int[this.anInt1939];
		this.anIntArray282 = new int[this.anInt1939];
		this.anIntArray269 = new int[this.anInt1939];
		this.anIntArray285 = new int[this.anInt1939];
		this.anIntArray280 = new int[this.anInt1939];
		this.anIntArray284 = new int[this.anInt1939];
		this.anIntArray271 = new int[this.anInt1942];
		this.anIntArray286 = new int[this.anInt1942];
		this.anIntArray270 = new int[this.anInt1942];
		if (local18) {
			this.anIntArray276 = new int[this.anInt1939];
		}
		if (local20) {
			this.anIntArray279 = new int[this.anInt1939];
		}
		if (local22) {
			this.anIntArray272 = new int[this.anInt1939];
		}
		if (local24) {
			this.anIntArray273 = new int[this.anInt1939];
		}
		this.anInt1944 = 0;
		this.anInt1939 = 0;
		this.anInt1942 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class1_Sub1_Sub8_Sub3 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt1944;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt1944; local231++) {
					this.anIntArray275[this.anInt1944] = local224.anIntArray275[local231];
					this.anIntArray274[this.anInt1944] = local224.anIntArray274[local231];
					this.anIntArray283[this.anInt1944] = local224.anIntArray283[local231];
					this.anInt1944++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt1939; local272++) {
					this.anIntArray277[this.anInt1939] = local224.anIntArray277[local272] + local229;
					this.anIntArray282[this.anInt1939] = local224.anIntArray282[local272] + local229;
					this.anIntArray269[this.anInt1939] = local224.anIntArray269[local272] + local229;
					this.anIntArray285[this.anInt1939] = local224.anIntArray285[local272];
					this.anIntArray280[this.anInt1939] = local224.anIntArray280[local272];
					this.anIntArray284[this.anInt1939] = local224.anIntArray284[local272];
					if (local18) {
						if (local224.anIntArray276 == null) {
							this.anIntArray276[this.anInt1939] = 0;
						} else {
							local350 = local224.anIntArray276[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray276[this.anInt1939] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray279 == null) {
							this.anIntArray279[this.anInt1939] = local224.anInt1943;
						} else {
							this.anIntArray279[this.anInt1939] = local224.anIntArray279[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray272 == null) {
							this.anIntArray272[this.anInt1939] = 0;
						} else {
							this.anIntArray272[this.anInt1939] = local224.anIntArray272[local272];
						}
					}
					if (local24 && local224.anIntArray273 != null) {
						this.anIntArray273[this.anInt1939] = local224.anIntArray273[local272];
					}
					this.anInt1939++;
				}
				for (local350 = 0; local350 < local224.anInt1942; local350++) {
					this.anIntArray271[this.anInt1942] = local224.anIntArray271[local350] + local229;
					this.anIntArray286[this.anInt1942] = local224.anIntArray286[local350] + local229;
					this.anIntArray270[this.anInt1942] = local224.anIntArray270[local350] + local229;
					this.anInt1942++;
				}
				local217 += local224.anInt1942;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pc;ZZZ)V")
	public Class1_Sub1_Sub8_Sub3(@OriginalArg(0) Class1_Sub1_Sub8_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1944 = arg0.anInt1944;
		this.anInt1939 = arg0.anInt1939;
		this.anInt1942 = arg0.anInt1942;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray275 = arg0.anIntArray275;
			this.anIntArray274 = arg0.anIntArray274;
			this.anIntArray283 = arg0.anIntArray283;
		} else {
			this.anIntArray275 = new int[this.anInt1944];
			this.anIntArray274 = new int[this.anInt1944];
			this.anIntArray283 = new int[this.anInt1944];
			for (local60 = 0; local60 < this.anInt1944; local60++) {
				this.anIntArray275[local60] = arg0.anIntArray275[local60];
				this.anIntArray274[local60] = arg0.anIntArray274[local60];
				this.anIntArray283[local60] = arg0.anIntArray283[local60];
			}
		}
		if (arg2) {
			this.anIntArray273 = arg0.anIntArray273;
		} else {
			this.anIntArray273 = new int[this.anInt1939];
			for (local60 = 0; local60 < this.anInt1939; local60++) {
				this.anIntArray273[local60] = arg0.anIntArray273[local60];
			}
		}
		this.anIntArray272 = arg0.anIntArray272;
		this.anIntArray281 = arg0.anIntArray281;
		this.anIntArray278 = arg0.anIntArray278;
		this.anIntArray276 = arg0.anIntArray276;
		this.anIntArray277 = arg0.anIntArray277;
		this.anIntArray282 = arg0.anIntArray282;
		this.anIntArray269 = arg0.anIntArray269;
		this.anIntArray279 = arg0.anIntArray279;
		this.anInt1943 = arg0.anInt1943;
		this.anIntArray271 = arg0.anIntArray271;
		this.anIntArray286 = arg0.anIntArray286;
		this.anIntArray270 = arg0.anIntArray270;
		this.aBoolean108 = arg0.aBoolean108;
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pc;ZZ)V")
	public Class1_Sub1_Sub8_Sub3(@OriginalArg(0) Class1_Sub1_Sub8_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt1944 = arg0.anInt1944;
		this.anInt1939 = arg0.anInt1939;
		this.anInt1942 = arg0.anInt1942;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray274 = new int[this.anInt1944];
			for (local37 = 0; local37 < this.anInt1944; local37++) {
				this.anIntArray274[local37] = arg0.anIntArray274[local37];
			}
		} else {
			this.anIntArray274 = arg0.anIntArray274;
		}
		if (arg2) {
			this.anIntArray285 = new int[this.anInt1939];
			this.anIntArray280 = new int[this.anInt1939];
			this.anIntArray284 = new int[this.anInt1939];
			for (local37 = 0; local37 < this.anInt1939; local37++) {
				this.anIntArray285[local37] = arg0.anIntArray285[local37];
				this.anIntArray280[local37] = arg0.anIntArray280[local37];
				this.anIntArray284[local37] = arg0.anIntArray284[local37];
			}
			this.anIntArray276 = new int[this.anInt1939];
			@Pc(115) int local115;
			if (arg0.anIntArray276 == null) {
				for (local115 = 0; local115 < this.anInt1939; local115++) {
					this.anIntArray276[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt1939; local115++) {
					this.anIntArray276[local115] = arg0.anIntArray276[local115];
				}
			}
			this.aClass24Array1 = new Class24[this.anInt1944];
			for (local115 = 0; local115 < this.anInt1944; local115++) {
				@Pc(160) Class24 local160 = this.aClass24Array1[local115] = new Class24();
				@Pc(165) Class24 local165 = arg0.aClass24Array1[local115];
				local160.anInt813 = local165.anInt813;
				local160.anInt821 = local165.anInt821;
				local160.anInt822 = local165.anInt822;
				local160.anInt818 = local165.anInt818;
			}
			this.aClass24Array2 = arg0.aClass24Array2;
		} else {
			this.anIntArray285 = arg0.anIntArray285;
			this.anIntArray280 = arg0.anIntArray280;
			this.anIntArray284 = arg0.anIntArray284;
			this.anIntArray276 = arg0.anIntArray276;
		}
		this.anIntArray275 = arg0.anIntArray275;
		this.anIntArray283 = arg0.anIntArray283;
		this.anIntArray273 = arg0.anIntArray273;
		this.anIntArray272 = arg0.anIntArray272;
		this.anIntArray279 = arg0.anIntArray279;
		this.anInt1943 = arg0.anInt1943;
		this.anIntArray277 = arg0.anIntArray277;
		this.anIntArray282 = arg0.anIntArray282;
		this.anIntArray269 = arg0.anIntArray269;
		this.anIntArray271 = arg0.anIntArray271;
		this.anIntArray286 = arg0.anIntArray286;
		this.anIntArray270 = arg0.anIntArray270;
		this.aBoolean108 = arg0.aBoolean108;
		this.anInt1940 = arg0.anInt1940;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public void method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1944; local7++) {
			this.anIntArray275[local7] = this.anIntArray275[local7] * arg0 / 128;
			this.anIntArray274[local7] = this.anIntArray274[local7] * arg1 / 128;
			this.anIntArray283[local7] = this.anIntArray283[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	private void method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1939; local1++) {
			local7 = this.anIntArray277[local1];
			@Pc(12) int local12 = this.anIntArray282[local1];
			@Pc(17) int local17 = this.anIntArray269[local1];
			@Pc(30) Class24 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray276 == null) {
				local25 = this.anIntArray273[local1];
				local30 = this.aClass24Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt813 + arg3 * local30.anInt821 + arg4 * local30.anInt822) / (arg1 * local30.anInt818);
				this.anIntArray285[local1] = Static76.method1371(local25, local52, 0);
				@Pc(65) Class24 local65 = this.aClass24Array1[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt813 + arg3 * local65.anInt821 + arg4 * local65.anInt822) / (arg1 * local65.anInt818);
				this.anIntArray280[local1] = Static76.method1371(local25, local87, 0);
				@Pc(100) Class24 local100 = this.aClass24Array1[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt813 + arg3 * local100.anInt821 + arg4 * local100.anInt822) / (arg1 * local100.anInt818);
				this.anIntArray284[local1] = Static76.method1371(local25, local122, 0);
			} else if ((this.anIntArray276[local1] & 0x1) == 0) {
				local25 = this.anIntArray273[local1];
				@Pc(148) int local148 = this.anIntArray276[local1];
				local30 = this.aClass24Array1[local7];
				local52 = arg0 + (arg2 * local30.anInt813 + arg3 * local30.anInt821 + arg4 * local30.anInt822) / (arg1 * local30.anInt818);
				this.anIntArray285[local1] = Static76.method1371(local25, local52, local148);
				local30 = this.aClass24Array1[local12];
				local52 = arg0 + (arg2 * local30.anInt813 + arg3 * local30.anInt821 + arg4 * local30.anInt822) / (arg1 * local30.anInt818);
				this.anIntArray280[local1] = Static76.method1371(local25, local52, local148);
				local30 = this.aClass24Array1[local17];
				local52 = arg0 + (arg2 * local30.anInt813 + arg3 * local30.anInt821 + arg4 * local30.anInt822) / (arg1 * local30.anInt818);
				this.anIntArray284[local1] = Static76.method1371(local25, local52, local148);
			}
		}
		this.aClass24Array1 = null;
		this.aClass24Array2 = null;
		this.anIntArray281 = null;
		this.anIntArray278 = null;
		if (this.anIntArray276 != null) {
			for (local7 = 0; local7 < this.anInt1939; local7++) {
				if ((this.anIntArray276[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray273 = null;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	private void method1366(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static41.anInt980;
		@Pc(3) int local3 = Static41.anInt976;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray277[arg0];
		@Pc(15) int local15 = this.anIntArray282[arg0];
		@Pc(20) int local20 = this.anIntArray269[arg0];
		@Pc(24) int local24 = Static76.anIntArray308[local10];
		@Pc(28) int local28 = Static76.anIntArray308[local15];
		@Pc(32) int local32 = Static76.anIntArray308[local20];
		if (this.anIntArray272 == null) {
			Static41.anInt984 = 0;
		} else {
			Static41.anInt984 = this.anIntArray272[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static76.anIntArray291[0] = Static76.anIntArray305[local10];
			Static76.anIntArray295[0] = Static76.anIntArray290[local10];
			local5++;
			Static76.anIntArray300[0] = this.anIntArray285[arg0];
		} else {
			local71 = Static76.anIntArray299[local10];
			local75 = Static76.anIntArray289[local10];
			local80 = this.anIntArray285[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static76.anIntArray307[local32 - local24];
				Static76.anIntArray291[0] = local1 + (local71 + ((Static76.anIntArray299[local20] - local71) * local93 >> 16) << 9) / 50;
				Static76.anIntArray295[0] = local3 + (local75 + ((Static76.anIntArray289[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static76.anIntArray300[0] = local80 + ((this.anIntArray284[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static76.anIntArray307[local28 - local24];
				Static76.anIntArray291[local5] = local1 + (local71 + ((Static76.anIntArray299[local15] - local71) * local93 >> 16) << 9) / 50;
				Static76.anIntArray295[local5] = local3 + (local75 + ((Static76.anIntArray289[local15] - local75) * local93 >> 16) << 9) / 50;
				Static76.anIntArray300[local5++] = local80 + ((this.anIntArray280[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static76.anIntArray291[local5] = Static76.anIntArray305[local15];
			Static76.anIntArray295[local5] = Static76.anIntArray290[local15];
			Static76.anIntArray300[local5++] = this.anIntArray280[arg0];
		} else {
			local71 = Static76.anIntArray299[local15];
			local75 = Static76.anIntArray289[local15];
			local80 = this.anIntArray280[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static76.anIntArray307[local24 - local28];
				Static76.anIntArray291[local5] = local1 + (local71 + ((Static76.anIntArray299[local10] - local71) * local93 >> 16) << 9) / 50;
				Static76.anIntArray295[local5] = local3 + (local75 + ((Static76.anIntArray289[local10] - local75) * local93 >> 16) << 9) / 50;
				Static76.anIntArray300[local5++] = local80 + ((this.anIntArray285[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static76.anIntArray307[local32 - local28];
				Static76.anIntArray291[local5] = local1 + (local71 + ((Static76.anIntArray299[local20] - local71) * local93 >> 16) << 9) / 50;
				Static76.anIntArray295[local5] = local3 + (local75 + ((Static76.anIntArray289[local20] - local75) * local93 >> 16) << 9) / 50;
				Static76.anIntArray300[local5++] = local80 + ((this.anIntArray284[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static76.anIntArray291[local5] = Static76.anIntArray305[local20];
			Static76.anIntArray295[local5] = Static76.anIntArray290[local20];
			Static76.anIntArray300[local5++] = this.anIntArray284[arg0];
		} else {
			local71 = Static76.anIntArray299[local20];
			local75 = Static76.anIntArray289[local20];
			local80 = this.anIntArray284[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static76.anIntArray307[local28 - local32];
				Static76.anIntArray291[local5] = local1 + (local71 + ((Static76.anIntArray299[local15] - local71) * local93 >> 16) << 9) / 50;
				Static76.anIntArray295[local5] = local3 + (local75 + ((Static76.anIntArray289[local15] - local75) * local93 >> 16) << 9) / 50;
				Static76.anIntArray300[local5++] = local80 + ((this.anIntArray280[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static76.anIntArray307[local24 - local32];
				Static76.anIntArray291[local5] = local1 + (local71 + ((Static76.anIntArray299[local10] - local71) * local93 >> 16) << 9) / 50;
				Static76.anIntArray295[local5] = local3 + (local75 + ((Static76.anIntArray289[local10] - local75) * local93 >> 16) << 9) / 50;
				Static76.anIntArray300[local5++] = local80 + ((this.anIntArray285[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static76.anIntArray291[0];
		local75 = Static76.anIntArray291[1];
		local80 = Static76.anIntArray291[2];
		local93 = Static76.anIntArray295[0];
		@Pc(588) int local588 = Static76.anIntArray295[1];
		@Pc(592) int local592 = Static76.anIntArray295[2];
		Static41.aBoolean52 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static41.anInt981 || local75 > Static41.anInt981 || local80 > Static41.anInt981) {
				Static41.aBoolean52 = true;
			}
			if (this.anIntArray276 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray276[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static41.method682(local93, local588, local592, local71, local75, local80, Static76.anIntArray300[0], Static76.anIntArray300[1], Static76.anIntArray300[2]);
			} else if (local619 == 1) {
				Static41.method681(local93, local588, local592, local71, local75, local80, Static76.anIntArray302[this.anIntArray285[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray276[arg0] >> 2;
				local678 = this.anIntArray271[local673];
				local683 = this.anIntArray286[local673];
				local688 = this.anIntArray270[local673];
				Static41.method688(local93, local588, local592, local71, local75, local80, Static76.anIntArray300[0], Static76.anIntArray300[1], Static76.anIntArray300[2], Static76.anIntArray299[local678], Static76.anIntArray299[local683], Static76.anIntArray299[local688], Static76.anIntArray289[local678], Static76.anIntArray289[local683], Static76.anIntArray289[local688], Static76.anIntArray308[local678], Static76.anIntArray308[local683], Static76.anIntArray308[local688], this.anIntArray273[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray276[arg0] >> 2;
				local678 = this.anIntArray271[local673];
				local683 = this.anIntArray286[local673];
				local688 = this.anIntArray270[local673];
				Static41.method688(local93, local588, local592, local71, local75, local80, this.anIntArray285[arg0], this.anIntArray285[arg0], this.anIntArray285[arg0], Static76.anIntArray299[local678], Static76.anIntArray299[local683], Static76.anIntArray299[local688], Static76.anIntArray289[local678], Static76.anIntArray289[local683], Static76.anIntArray289[local688], Static76.anIntArray308[local678], Static76.anIntArray308[local683], Static76.anIntArray308[local688], this.anIntArray273[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static41.anInt981 || local75 > Static41.anInt981 || local80 > Static41.anInt981 || Static76.anIntArray291[3] < 0 || Static76.anIntArray291[3] > Static41.anInt981) {
			Static41.aBoolean52 = true;
		}
		if (this.anIntArray276 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray276[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static41.method682(local93, local588, local592, local71, local75, local80, Static76.anIntArray300[0], Static76.anIntArray300[1], Static76.anIntArray300[2]);
			Static41.method682(local93, local592, Static76.anIntArray295[3], local71, local80, Static76.anIntArray291[3], Static76.anIntArray300[0], Static76.anIntArray300[2], Static76.anIntArray300[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static76.anIntArray302[this.anIntArray285[arg0]];
			Static41.method681(local93, local588, local592, local71, local75, local80, local673);
			Static41.method681(local93, local592, Static76.anIntArray295[3], local71, local80, Static76.anIntArray291[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray276[arg0] >> 2;
			local678 = this.anIntArray271[local673];
			local683 = this.anIntArray286[local673];
			local688 = this.anIntArray270[local673];
			Static41.method688(local93, local588, local592, local71, local75, local80, Static76.anIntArray300[0], Static76.anIntArray300[1], Static76.anIntArray300[2], Static76.anIntArray299[local678], Static76.anIntArray299[local683], Static76.anIntArray299[local688], Static76.anIntArray289[local678], Static76.anIntArray289[local683], Static76.anIntArray289[local688], Static76.anIntArray308[local678], Static76.anIntArray308[local683], Static76.anIntArray308[local688], this.anIntArray273[arg0]);
			Static41.method688(local93, local592, Static76.anIntArray295[3], local71, local80, Static76.anIntArray291[3], Static76.anIntArray300[0], Static76.anIntArray300[2], Static76.anIntArray300[3], Static76.anIntArray299[local678], Static76.anIntArray299[local683], Static76.anIntArray299[local688], Static76.anIntArray289[local678], Static76.anIntArray289[local683], Static76.anIntArray289[local688], Static76.anIntArray308[local678], Static76.anIntArray308[local683], Static76.anIntArray308[local688], this.anIntArray273[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray276[arg0] >> 2;
		local678 = this.anIntArray271[local673];
		local683 = this.anIntArray286[local673];
		local688 = this.anIntArray270[local673];
		Static41.method688(local93, local588, local592, local71, local75, local80, this.anIntArray285[arg0], this.anIntArray285[arg0], this.anIntArray285[arg0], Static76.anIntArray299[local678], Static76.anIntArray299[local683], Static76.anIntArray299[local688], Static76.anIntArray289[local678], Static76.anIntArray289[local683], Static76.anIntArray289[local688], Static76.anIntArray308[local678], Static76.anIntArray308[local683], Static76.anIntArray308[local688], this.anIntArray273[arg0]);
		Static41.method688(local93, local592, Static76.anIntArray295[3], local71, local80, Static76.anIntArray291[3], this.anIntArray285[arg0], this.anIntArray285[arg0], this.anIntArray285[arg0], Static76.anIntArray299[local678], Static76.anIntArray299[local683], Static76.anIntArray299[local688], Static76.anIntArray289[local678], Static76.anIntArray289[local683], Static76.anIntArray289[local688], Static76.anIntArray308[local678], Static76.anIntArray308[local683], Static76.anIntArray308[local688], this.anIntArray273[arg0]);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
	public void method1367() {
		if (this.anInt1936 == 3) {
			return;
		}
		this.anInt1936 = 3;
		super.anInt2716 = 0;
		this.anInt1941 = 0;
		this.anInt1945 = 999999;
		this.anInt1935 = -999999;
		this.anInt1937 = -99999;
		this.anInt1938 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1944; local27++) {
			@Pc(33) int local33 = this.anIntArray275[local27];
			@Pc(38) int local38 = this.anIntArray274[local27];
			@Pc(43) int local43 = this.anIntArray283[local27];
			if (local33 < this.anInt1945) {
				this.anInt1945 = local33;
			}
			if (local33 > this.anInt1935) {
				this.anInt1935 = local33;
			}
			if (local43 < this.anInt1938) {
				this.anInt1938 = local43;
			}
			if (local43 > this.anInt1937) {
				this.anInt1937 = local43;
			}
			if (-local38 > super.anInt2716) {
				super.anInt2716 = -local38;
			}
			if (local38 > this.anInt1941) {
				this.anInt1941 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1368(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static76.anIntArray297.length < this.anInt1939) {
			Static76.anIntArray297 = new int[this.anInt1939 + 100];
		}
		return this.method1369(arg0, Static76.aClass1_Sub1_Sub8_Sub3_2, Static76.anIntArray297);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!pc;[I)Lclient!pc;")
	private Class1_Sub1_Sub8_Sub3 method1369(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub8_Sub3 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt1944 = this.anInt1944;
		arg1.anInt1939 = this.anInt1939;
		arg1.anInt1942 = this.anInt1942;
		if (arg1.anIntArray275 == null || arg1.anIntArray275.length < this.anInt1944) {
			arg1.anIntArray275 = new int[this.anInt1944 + 100];
			arg1.anIntArray274 = new int[this.anInt1944 + 100];
			arg1.anIntArray283 = new int[this.anInt1944 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1944; local43++) {
			arg1.anIntArray275[local43] = this.anIntArray275[local43];
			arg1.anIntArray274[local43] = this.anIntArray274[local43];
			arg1.anIntArray283[local43] = this.anIntArray283[local43];
		}
		if (arg0) {
			arg1.anIntArray272 = this.anIntArray272;
		} else {
			arg1.anIntArray272 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray272 == null) {
				for (local88 = 0; local88 < this.anInt1939; local88++) {
					arg1.anIntArray272[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1939; local88++) {
					arg1.anIntArray272[local88] = this.anIntArray272[local88];
				}
			}
		}
		arg1.anIntArray276 = this.anIntArray276;
		arg1.anIntArray273 = this.anIntArray273;
		arg1.anIntArray279 = this.anIntArray279;
		arg1.anInt1943 = this.anInt1943;
		arg1.anIntArrayArray21 = this.anIntArrayArray21;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.anIntArray277 = this.anIntArray277;
		arg1.anIntArray282 = this.anIntArray282;
		arg1.anIntArray269 = this.anIntArray269;
		arg1.anIntArray285 = this.anIntArray285;
		arg1.anIntArray280 = this.anIntArray280;
		arg1.anIntArray284 = this.anIntArray284;
		arg1.anIntArray271 = this.anIntArray271;
		arg1.anIntArray286 = this.anIntArray286;
		arg1.anIntArray270 = this.anIntArray270;
		arg1.aBoolean108 = this.aBoolean108;
		arg1.anInt1936 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
	public void method1370(@OriginalArg(0) int arg0) {
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		@Pc(9) int local9 = Static76.anIntArray301[arg0];
		@Pc(13) int local13 = Static76.anIntArray306[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1944; local15++) {
			@Pc(32) int local32 = this.anIntArray274[local15] * local13 - this.anIntArray283[local15] * local9 >> 16;
			this.anIntArray283[local15] = this.anIntArray274[local15] * local9 + this.anIntArray283[local15] * local13 >> 16;
			this.anIntArray274[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
	private void method1373() {
		if (this.anInt1936 == 2) {
			return;
		}
		this.anInt1936 = 2;
		this.anInt1945 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1944; local12++) {
			@Pc(18) int local18 = this.anIntArray275[local12];
			@Pc(23) int local23 = this.anIntArray274[local12];
			@Pc(28) int local28 = this.anIntArray283[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1945) {
				this.anInt1945 = local40;
			}
		}
		this.anInt1945 = (int) (Math.sqrt((double) this.anInt1945) + 0.99D);
		this.anInt1937 = this.anInt1945;
		this.anInt1935 = this.anInt1945 + this.anInt1945;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)V")
	public void method1374() {
		@Pc(4) int local4 = this.anInt1940 >> 16;
		@Pc(11) int local11 = this.anInt1940 << 16 >> 16;
		this.method1365(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(III)V")
	public void method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1936 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1944; local4++) {
			this.anIntArray275[local4] += arg0;
			this.anIntArray274[local4] += arg1;
			this.anIntArray283[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()V")
	public void method1376() {
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1944; local7++) {
			@Pc(13) int local13 = this.anIntArray283[local7];
			this.anIntArray283[local7] = this.anIntArray275[local7];
			this.anIntArray275[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()V")
	public void method1377() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray281 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1944; local9++) {
				local15 = this.anIntArray281[local9];
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
			while (local59 < this.anInt1944) {
				local65 = this.anIntArray281[local59];
				this.anIntArrayArray22[local65][local5[local65]++] = local59++;
			}
			this.anIntArray281 = null;
		}
		if (this.anIntArray278 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1939; local9++) {
			local15 = this.anIntArray278[local9];
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
		while (local59 < this.anInt1939) {
			local65 = this.anIntArray278[local59];
			this.anIntArrayArray21[local65][local5[local65]++] = local59++;
		}
		this.anIntArray278 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[IIII)V")
	private void method1378(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static76.anInt1951 = 0;
			Static76.anInt1949 = 0;
			Static76.anInt1948 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray22.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray22[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static76.anInt1951 += this.anIntArray275[local36];
						Static76.anInt1949 += this.anIntArray274[local36];
						Static76.anInt1948 += this.anIntArray283[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static76.anInt1951 = Static76.anInt1951 / local6 + arg2;
				Static76.anInt1949 = Static76.anInt1949 / local6 + arg3;
				Static76.anInt1948 = Static76.anInt1948 / local6 + arg4;
			} else {
				Static76.anInt1951 = arg2;
				Static76.anInt1949 = arg3;
				Static76.anInt1948 = arg4;
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
						this.anIntArray275[local31] += arg2;
						this.anIntArray274[local31] += arg3;
						this.anIntArray283[local31] += arg4;
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
						this.anIntArray275[local31] -= Static76.anInt1951;
						this.anIntArray274[local31] -= Static76.anInt1949;
						this.anIntArray283[local31] -= Static76.anInt1948;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static76.anIntArray301[local225];
							local235 = Static76.anIntArray306[local225];
							local251 = this.anIntArray274[local31] * local231 + this.anIntArray275[local31] * local235 >> 16;
							this.anIntArray274[local31] = this.anIntArray274[local31] * local235 - this.anIntArray275[local31] * local231 >> 16;
							this.anIntArray275[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static76.anIntArray301[local36];
							local235 = Static76.anIntArray306[local36];
							local251 = this.anIntArray274[local31] * local235 - this.anIntArray283[local31] * local231 >> 16;
							this.anIntArray283[local31] = this.anIntArray274[local31] * local231 + this.anIntArray283[local31] * local235 >> 16;
							this.anIntArray274[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static76.anIntArray301[local219];
							local235 = Static76.anIntArray306[local219];
							local251 = this.anIntArray283[local31] * local231 + this.anIntArray275[local31] * local235 >> 16;
							this.anIntArray283[local31] = this.anIntArray283[local31] * local235 - this.anIntArray275[local31] * local231 >> 16;
							this.anIntArray275[local31] = local251;
						}
						this.anIntArray275[local31] += Static76.anInt1951;
						this.anIntArray274[local31] += Static76.anInt1949;
						this.anIntArray283[local31] += Static76.anInt1948;
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
						this.anIntArray275[local31] -= Static76.anInt1951;
						this.anIntArray274[local31] -= Static76.anInt1949;
						this.anIntArray283[local31] -= Static76.anInt1948;
						this.anIntArray275[local31] = this.anIntArray275[local31] * arg2 / 128;
						this.anIntArray274[local31] = this.anIntArray274[local31] * arg3 / 128;
						this.anIntArray283[local31] = this.anIntArray283[local31] * arg4 / 128;
						this.anIntArray275[local31] += Static76.anInt1951;
						this.anIntArray274[local31] += Static76.anInt1949;
						this.anIntArray283[local31] += Static76.anInt1948;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray21 != null && this.anIntArray272 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray272[local31] += arg2 * 8;
						if (this.anIntArray272[local31] < 0) {
							this.anIntArray272[local31] = 0;
						}
						if (this.anIntArray272[local31] > 255) {
							this.anIntArray272[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
	public void method1379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt1936 != 2 && this.anInt1936 != 1) {
			this.method1373();
		}
		@Pc(11) int local11 = Static41.anInt980;
		@Pc(13) int local13 = Static41.anInt976;
		@Pc(17) int local17 = Static76.anIntArray301[0];
		@Pc(21) int local21 = Static76.anIntArray306[0];
		@Pc(25) int local25 = Static76.anIntArray301[arg0];
		@Pc(29) int local29 = Static76.anIntArray306[arg0];
		@Pc(33) int local33 = Static76.anIntArray301[arg1];
		@Pc(37) int local37 = Static76.anIntArray306[arg1];
		@Pc(41) int local41 = Static76.anIntArray301[arg2];
		@Pc(45) int local45 = Static76.anIntArray306[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt1944; local57++) {
			@Pc(63) int local63 = this.anIntArray275[local57];
			@Pc(68) int local68 = this.anIntArray274[local57];
			@Pc(73) int local73 = this.anIntArray283[local57];
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
			Static76.anIntArray303[local57] = local73 - local55;
			Static76.anIntArray305[local57] = local11 + (local63 << 9) / local73;
			Static76.anIntArray290[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt1942 > 0) {
				Static76.anIntArray299[local57] = local63;
				Static76.anIntArray289[local57] = local85;
				Static76.anIntArray308[local57] = local73;
			}
		}
		try {
			this.method1384(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(Z)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1380(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static76.anIntArray287.length < this.anInt1939) {
			Static76.anIntArray287 = new int[this.anInt1939 + 100];
		}
		return this.method1369(arg0, Static76.aClass1_Sub1_Sub8_Sub3_1, Static76.anIntArray287);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()V")
	public void method1382() {
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1944; local7++) {
			this.anIntArray283[local7] = -this.anIntArray283[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt1939; local24++) {
			@Pc(30) int local30 = this.anIntArray277[local24];
			this.anIntArray277[local24] = this.anIntArray269[local24];
			this.anIntArray269[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)V")
	public void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1939; local1++) {
			if (this.anIntArray273[local1] == arg0) {
				this.anIntArray273[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZI)V")
	private void method1384(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1935 >= 1500) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1935; local6++) {
			Static76.anIntArray292[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1939; local18++) {
			if (this.anIntArray276 == null || this.anIntArray276[local18] != -1) {
				local33 = this.anIntArray277[local18];
				local38 = this.anIntArray282[local18];
				local43 = this.anIntArray269[local18];
				local47 = Static76.anIntArray305[local33];
				local51 = Static76.anIntArray305[local38];
				local55 = Static76.anIntArray305[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static76.anIntArray299[local33];
					local74 = Static76.anIntArray299[local38];
					@Pc(78) int local78 = Static76.anIntArray299[local43];
					@Pc(82) int local82 = Static76.anIntArray289[local33];
					local86 = Static76.anIntArray289[local38];
					local90 = Static76.anIntArray289[local43];
					@Pc(94) int local94 = Static76.anIntArray308[local33];
					local98 = Static76.anIntArray308[local38];
					@Pc(102) int local102 = Static76.anIntArray308[local43];
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
						Static76.aBooleanArray12[local18] = true;
						@Pc(183) int local183 = (Static76.anIntArray303[local33] + Static76.anIntArray303[local38] + Static76.anIntArray303[local43]) / 3 + this.anInt1937;
						Static76.anIntArrayArray23[local183][Static76.anIntArray292[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method1381(Static76.anInt1947, Static76.anInt1946, Static76.anIntArray290[local33], Static76.anIntArray290[local38], Static76.anIntArray290[local43], local47, local51, local55)) {
						Static76.anIntArray298[Static76.anInt1950++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static76.anIntArray290[local43] - Static76.anIntArray290[local38]) - (Static76.anIntArray290[local33] - Static76.anIntArray290[local38]) * (local55 - local51) > 0) {
						Static76.aBooleanArray12[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static41.anInt981 && local51 <= Static41.anInt981 && local55 <= Static41.anInt981) {
							Static76.aBooleanArray13[local18] = false;
						} else {
							Static76.aBooleanArray13[local18] = true;
						}
						local70 = (Static76.anIntArray303[local33] + Static76.anIntArray303[local38] + Static76.anIntArray303[local43]) / 3 + this.anInt1937;
						Static76.anIntArrayArray23[local70][Static76.anIntArray292[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray279 == null) {
			for (local33 = this.anInt1935 - 1; local33 >= 0; local33--) {
				local38 = Static76.anIntArray292[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static76.anIntArrayArray23[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method1389(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static76.anIntArray294[local33] = 0;
			Static76.anIntArray296[local33] = 0;
		}
		for (local38 = this.anInt1935 - 1; local38 >= 0; local38--) {
			local43 = Static76.anIntArray292[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static76.anIntArrayArray23[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray279[local55];
					local74 = Static76.anIntArray294[local70]++;
					Static76.anIntArrayArray24[local70][local74] = local55;
					if (local70 < 10) {
						Static76.anIntArray296[local70] += local38;
					} else if (local70 == 10) {
						Static76.anIntArray293[local74] = local38;
					} else {
						Static76.anIntArray288[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static76.anIntArray294[1] > 0 || Static76.anIntArray294[2] > 0) {
			local43 = (Static76.anIntArray296[1] + Static76.anIntArray296[2]) / (Static76.anIntArray294[1] + Static76.anIntArray294[2]);
		}
		local47 = 0;
		if (Static76.anIntArray294[3] > 0 || Static76.anIntArray294[4] > 0) {
			local47 = (Static76.anIntArray296[3] + Static76.anIntArray296[4]) / (Static76.anIntArray294[3] + Static76.anIntArray294[4]);
		}
		local51 = 0;
		if (Static76.anIntArray294[6] > 0 || Static76.anIntArray294[8] > 0) {
			local51 = (Static76.anIntArray296[6] + Static76.anIntArray296[8]) / (Static76.anIntArray294[6] + Static76.anIntArray294[8]);
		}
		local70 = 0;
		local74 = Static76.anIntArray294[10];
		@Pc(524) int[] local524 = Static76.anIntArrayArray24[10];
		@Pc(526) int[] local526 = Static76.anIntArray293;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static76.anIntArray294[11];
			local524 = Static76.anIntArrayArray24[11];
			local526 = Static76.anIntArray288;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method1389(local524[local70++]);
				if (local70 == local74 && local524 != Static76.anIntArrayArray24[11]) {
					local70 = 0;
					local74 = Static76.anIntArray294[11];
					local524 = Static76.anIntArrayArray24[11];
					local526 = Static76.anIntArray288;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method1389(local524[local70++]);
				if (local70 == local74 && local524 != Static76.anIntArrayArray24[11]) {
					local70 = 0;
					local74 = Static76.anIntArray294[11];
					local524 = Static76.anIntArrayArray24[11];
					local526 = Static76.anIntArray288;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method1389(local524[local70++]);
				if (local70 == local74 && local524 != Static76.anIntArrayArray24[11]) {
					local70 = 0;
					local74 = Static76.anIntArray294[11];
					local524 = Static76.anIntArrayArray24[11];
					local526 = Static76.anIntArray288;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static76.anIntArray294[local86];
			@Pc(689) int[] local689 = Static76.anIntArrayArray24[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method1389(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method1389(local524[local70++]);
			if (local70 == local74 && local524 != Static76.anIntArrayArray24[11]) {
				local70 = 0;
				local524 = Static76.anIntArrayArray24[11];
				local74 = Static76.anIntArray294[11];
				local526 = Static76.anIntArray288;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pc;I)I")
	private int method1385(@OriginalArg(0) Class1_Sub1_Sub8_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray275[arg1];
		@Pc(11) int local11 = arg0.anIntArray274[arg1];
		@Pc(16) int local16 = arg0.anIntArray283[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1944; local18++) {
			if (local6 == this.anIntArray275[local18] && local11 == this.anIntArray274[local18] && local16 == this.anIntArray283[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray275[this.anInt1944] = local6;
			this.anIntArray274[this.anInt1944] = local11;
			this.anIntArray283[this.anInt1944] = local16;
			if (arg0.anIntArray281 != null) {
				this.anIntArray281[this.anInt1944] = arg0.anIntArray281[arg1];
			}
			local1 = this.anInt1944++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ea;I)V")
	public void method1386(@OriginalArg(0) Class1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray22 == null || arg1 == -1) {
			return;
		}
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		@Pc(18) Class58 local18 = arg0.aClass58Array1[arg1];
		@Pc(21) Class1_Sub5 local21 = local18.aClass1_Sub5_1;
		Static76.anInt1951 = 0;
		Static76.anInt1949 = 0;
		Static76.anInt1948 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt2519; local29++) {
			@Pc(35) int local35 = local18.anIntArray385[local29];
			this.method1378(local21.anIntArray120[local35], local21.anIntArrayArray10[local35], local18.anIntArray382[local29], local18.anIntArray384[local29], local18.anIntArray380[local29]);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt1936 != 1) {
			this.method1392();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt1945 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt1945 << 9;
		if (local60 / local36 >= Static41.anInt978) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt1945 << 9;
		if (local73 / local36 <= Static41.anInt983) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt1945 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static41.anInt979) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2716 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static41.anInt977) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2716 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt1942 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static76.aBoolean109) {
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
			local215 = Static76.anInt1947 - Static41.anInt980;
			local219 = Static76.anInt1946 - Static41.anInt976;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean108) {
					Static76.anIntArray298[Static76.anInt1950++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static41.anInt980;
		local215 = Static41.anInt976;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static76.anIntArray301[arg0];
			local253 = Static76.anIntArray306[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt1944; local265++) {
			@Pc(271) int local271 = this.anIntArray275[local265];
			@Pc(276) int local276 = this.anIntArray274[local265];
			@Pc(281) int local281 = this.anIntArray283[local265];
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
			Static76.anIntArray303[local265] = local281 - local25;
			if (local281 >= 50) {
				Static76.anIntArray305[local265] = local168 + (local271 << 9) / local281;
				Static76.anIntArray290[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static76.anIntArray305[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static76.anIntArray299[local265] = local271;
				Static76.anIntArray289[local265] = local293;
				Static76.anIntArray308[local265] = local281;
			}
		}
		try {
			this.method1384(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ea;ILclient!ea;I[I)V")
	public void method1387(@OriginalArg(0) Class1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1386(arg0, arg1);
			return;
		}
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		@Pc(24) Class58 local24 = arg0.aClass58Array1[arg1];
		@Pc(29) Class58 local29 = arg2.aClass58Array1[arg3];
		@Pc(32) Class1_Sub5 local32 = local24.aClass1_Sub5_1;
		Static76.anInt1951 = 0;
		Static76.anInt1949 = 0;
		Static76.anInt1948 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt2519; local47++) {
			local53 = local24.anIntArray385[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray120[local53] == 0) {
				this.method1378(local32.anIntArray120[local53], local32.anIntArrayArray10[local53], local24.anIntArray382[local47], local24.anIntArray384[local47], local24.anIntArray380[local47]);
			}
		}
		Static76.anInt1951 = 0;
		Static76.anInt1949 = 0;
		Static76.anInt1948 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt2519; local53++) {
			@Pc(118) int local118 = local29.anIntArray385[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray120[local118] == 0) {
				this.method1378(local32.anIntArray120[local118], local32.anIntArrayArray10[local118], local29.anIntArray382[local53], local29.anIntArray384[local53], local29.anIntArray380[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "()V")
	public void method1388() {
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1944; local7++) {
			this.anIntArray275[local7] = -this.anIntArray275[local7];
			this.anIntArray283[local7] = -this.anIntArray283[local7];
		}
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
	private void method1389(@OriginalArg(0) int arg0) {
		if (Static76.aBooleanArray12[arg0]) {
			this.method1366(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray277[arg0];
		@Pc(17) int local17 = this.anIntArray282[arg0];
		@Pc(22) int local22 = this.anIntArray269[arg0];
		Static41.aBoolean52 = Static76.aBooleanArray13[arg0];
		if (this.anIntArray272 == null) {
			Static41.anInt984 = 0;
		} else {
			Static41.anInt984 = this.anIntArray272[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray276 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray276[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static41.method682(Static76.anIntArray290[local12], Static76.anIntArray290[local17], Static76.anIntArray290[local22], Static76.anIntArray305[local12], Static76.anIntArray305[local17], Static76.anIntArray305[local22], this.anIntArray285[arg0], this.anIntArray280[arg0], this.anIntArray284[arg0]);
		} else if (local42 == 1) {
			Static41.method681(Static76.anIntArray290[local12], Static76.anIntArray290[local17], Static76.anIntArray290[local22], Static76.anIntArray305[local12], Static76.anIntArray305[local17], Static76.anIntArray305[local22], Static76.anIntArray302[this.anIntArray285[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray276[arg0] >> 2;
				local128 = this.anIntArray271[local123];
				local133 = this.anIntArray286[local123];
				local138 = this.anIntArray270[local123];
				Static41.method688(Static76.anIntArray290[local12], Static76.anIntArray290[local17], Static76.anIntArray290[local22], Static76.anIntArray305[local12], Static76.anIntArray305[local17], Static76.anIntArray305[local22], this.anIntArray285[arg0], this.anIntArray280[arg0], this.anIntArray284[arg0], Static76.anIntArray299[local128], Static76.anIntArray299[local133], Static76.anIntArray299[local138], Static76.anIntArray289[local128], Static76.anIntArray289[local133], Static76.anIntArray289[local138], Static76.anIntArray308[local128], Static76.anIntArray308[local133], Static76.anIntArray308[local138], this.anIntArray273[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray276[arg0] >> 2;
				local128 = this.anIntArray271[local123];
				local133 = this.anIntArray286[local123];
				local138 = this.anIntArray270[local123];
				Static41.method688(Static76.anIntArray290[local12], Static76.anIntArray290[local17], Static76.anIntArray290[local22], Static76.anIntArray305[local12], Static76.anIntArray305[local17], Static76.anIntArray305[local22], this.anIntArray285[arg0], this.anIntArray285[arg0], this.anIntArray285[arg0], Static76.anIntArray299[local128], Static76.anIntArray299[local133], Static76.anIntArray299[local138], Static76.anIntArray289[local128], Static76.anIntArray289[local133], Static76.anIntArray289[local138], Static76.anIntArray308[local128], Static76.anIntArray308[local133], Static76.anIntArray308[local138], this.anIntArray273[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "()V")
	public void method1390() {
		this.aClass24Array1 = null;
		this.anInt1936 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1944; local7++) {
			@Pc(13) int local13 = this.anIntArray275[local7];
			this.anIntArray275[local7] = this.anIntArray283[local7];
			this.anIntArray283[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "()I")
	public int method1391() {
		this.method1392();
		return this.anInt1945;
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "()V")
	public void method1392() {
		if (this.anInt1936 == 1) {
			return;
		}
		this.anInt1936 = 1;
		super.anInt2716 = 0;
		this.anInt1941 = 0;
		this.anInt1945 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1944; local18++) {
			@Pc(24) int local24 = this.anIntArray275[local18];
			@Pc(29) int local29 = this.anIntArray274[local18];
			@Pc(34) int local34 = this.anIntArray283[local18];
			if (-local29 > super.anInt2716) {
				super.anInt2716 = -local29;
			}
			if (local29 > this.anInt1941) {
				this.anInt1941 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1945) {
				this.anInt1945 = local58;
			}
		}
		this.anInt1945 = (int) (Math.sqrt((double) this.anInt1945) + 0.99D);
		this.anInt1937 = (int) (Math.sqrt((double) (this.anInt1945 * this.anInt1945 + super.anInt2716 * super.anInt2716)) + 0.99D);
		this.anInt1935 = this.anInt1937 + (int) (Math.sqrt((double) (this.anInt1945 * this.anInt1945 + this.anInt1941 * this.anInt1941)) + 0.99D);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIZ)V")
	public void method1394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray285 == null) {
			this.anIntArray285 = new int[this.anInt1939];
			this.anIntArray280 = new int[this.anInt1939];
			this.anIntArray284 = new int[this.anInt1939];
		}
		@Pc(48) int local48;
		if (this.aClass24Array1 == null) {
			this.aClass24Array1 = new Class24[this.anInt1944];
			for (local48 = 0; local48 < this.anInt1944; local48++) {
				this.aClass24Array1[local48] = new Class24();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt1939; local48++) {
			local69 = this.anIntArray277[local48];
			@Pc(74) int local74 = this.anIntArray282[local48];
			@Pc(79) int local79 = this.anIntArray269[local48];
			@Pc(89) int local89 = this.anIntArray275[local74] - this.anIntArray275[local69];
			@Pc(99) int local99 = this.anIntArray274[local74] - this.anIntArray274[local69];
			@Pc(109) int local109 = this.anIntArray283[local74] - this.anIntArray283[local69];
			@Pc(119) int local119 = this.anIntArray275[local79] - this.anIntArray275[local69];
			@Pc(129) int local129 = this.anIntArray274[local79] - this.anIntArray274[local69];
			@Pc(139) int local139 = this.anIntArray283[local79] - this.anIntArray283[local69];
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
			if (this.anIntArray276 == null || (this.anIntArray276[local48] & 0x1) == 0) {
				@Pc(246) Class24 local246 = this.aClass24Array1[local69];
				local246.anInt813 += local147;
				local246.anInt821 += local155;
				local246.anInt822 += local163;
				local246.anInt818++;
				@Pc(275) Class24 local275 = this.aClass24Array1[local74];
				local275.anInt813 += local147;
				local275.anInt821 += local155;
				local275.anInt822 += local163;
				local275.anInt818++;
				@Pc(304) Class24 local304 = this.aClass24Array1[local79];
				local304.anInt813 += local147;
				local304.anInt821 += local155;
				local304.anInt822 += local163;
				local304.anInt818++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray285[local48] = Static76.method1371(this.anIntArray273[local48], local349, this.anIntArray276[local48]);
			}
		}
		if (arg5) {
			this.method1365(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass24Array2 = new Class24[this.anInt1944];
		for (local69 = 0; local69 < this.anInt1944; local69++) {
			@Pc(391) Class24 local391 = this.aClass24Array1[local69];
			@Pc(400) Class24 local400 = this.aClass24Array2[local69] = new Class24();
			local400.anInt813 = local391.anInt813;
			local400.anInt821 = local391.anInt821;
			local400.anInt822 = local391.anInt822;
			local400.anInt818 = local391.anInt818;
		}
		this.anInt1940 = (arg0 << 16) + (local20 & 0xFFFF);
	}
}
