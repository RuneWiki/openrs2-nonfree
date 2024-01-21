import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class10_Sub1_Sub5_Sub4 extends Class10_Sub1_Sub5 {

	@OriginalMember(owner = "client!rb", name = "ac", descriptor = "[I")
	public static int[] anIntArray277 = new int[128];

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "I")
	private int anInt2259;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!rb", name = "kb", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "[Lclient!lc;")
	public Class37[] aClass37Array1;

	@OriginalMember(owner = "client!rb", name = "vb", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!rb", name = "zb", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!rb", name = "Ab", descriptor = "I")
	public int anInt2262;

	@OriginalMember(owner = "client!rb", name = "Db", descriptor = "[Lclient!lc;")
	public Class37[] aClass37Array2;

	@OriginalMember(owner = "client!rb", name = "Gb", descriptor = "I")
	private int anInt2264;

	@OriginalMember(owner = "client!rb", name = "Hb", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!rb", name = "Ib", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!rb", name = "Kb", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!rb", name = "Nb", descriptor = "I")
	public int anInt2267;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
	private int anInt2258 = 0;

	@OriginalMember(owner = "client!rb", name = "tb", descriptor = "I")
	public int anInt2260 = 0;

	@OriginalMember(owner = "client!rb", name = "Cb", descriptor = "I")
	private int anInt2263 = 0;

	@OriginalMember(owner = "client!rb", name = "yb", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!rb", name = "xb", descriptor = "I")
	public int anInt2261 = 0;

	@OriginalMember(owner = "client!rb", name = "mb", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!rb", name = "Bb", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!rb", name = "qb", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!rb", name = "ob", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!rb", name = "Fb", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!rb", name = "wb", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!rb", name = "sb", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!rb", name = "Eb", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!rb", name = "ub", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "[I")
	private int[] anIntArray260;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray277[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray277[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray277[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray277[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray277[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V")
	public Class10_Sub1_Sub5_Sub4(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Class10_Sub10 local21 = new Class10_Sub10(arg0);
		@Pc(26) Class10_Sub10 local26 = new Class10_Sub10(arg0);
		@Pc(31) Class10_Sub10 local31 = new Class10_Sub10(arg0);
		@Pc(36) Class10_Sub10 local36 = new Class10_Sub10(arg0);
		@Pc(41) Class10_Sub10 local41 = new Class10_Sub10(arg0);
		local21.anInt1957 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1160();
		@Pc(55) int local55 = local21.method1160();
		@Pc(59) int local59 = local21.method1111();
		@Pc(63) int local63 = local21.method1111();
		@Pc(67) int local67 = local21.method1111();
		@Pc(71) int local71 = local21.method1111();
		@Pc(75) int local75 = local21.method1111();
		@Pc(79) int local79 = local21.method1111();
		@Pc(83) int local83 = local21.method1160();
		@Pc(87) int local87 = local21.method1160();
		@Pc(91) int local91 = local21.method1160();
		@Pc(95) int local95 = local21.method1160();
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
		this.anInt2261 = local51;
		this.anInt2260 = local55;
		this.anInt2258 = local59;
		this.anIntArray256 = new int[local51];
		this.anIntArray265 = new int[local51];
		this.anIntArray259 = new int[local51];
		this.anIntArray251 = new int[local55];
		this.anIntArray258 = new int[local55];
		this.anIntArray257 = new int[local55];
		this.anIntArray267 = new int[local59];
		this.anIntArray264 = new int[local59];
		this.anIntArray253 = new int[local59];
		if (local150 >= 0) {
			this.anIntArray261 = new int[local51];
		}
		if (local138 >= 0) {
			this.anIntArray266 = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray250 = new int[local55];
		} else {
			this.anInt2263 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.anIntArray262 = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray255 = new int[local55];
		}
		this.anIntArray260 = new int[local55];
		local21.anInt1957 = local97;
		local26.anInt1957 = local196;
		local31.anInt1957 = local202;
		local36.anInt1957 = local103;
		local41.anInt1957 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1111();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1121();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1121();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1121();
			}
			this.anIntArray256[local321] = local315 + local328;
			this.anIntArray265[local321] = local317 + local338;
			this.anIntArray259[local321] = local319 + local348;
			local315 = this.anIntArray256[local321];
			local317 = this.anIntArray265[local321];
			local319 = this.anIntArray259[local321];
			if (this.anIntArray261 != null) {
				this.anIntArray261[local321] = local41.method1111();
			}
		}
		local21.anInt1957 = local180;
		local26.anInt1957 = local138;
		local31.anInt1957 = local111;
		local36.anInt1957 = local162;
		local41.anInt1957 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.anIntArray260[local326] = local21.method1160();
			if (this.anIntArray266 != null) {
				this.anIntArray266[local326] = local26.method1111();
			}
			if (this.anIntArray250 != null) {
				this.anIntArray250[local326] = local31.method1111();
			}
			if (this.anIntArray262 != null) {
				this.anIntArray262[local326] = local36.method1111();
			}
			if (this.anIntArray255 != null) {
				this.anIntArray255[local326] = local41.method1111();
			}
		}
		local21.anInt1957 = local174;
		local26.anInt1957 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1111();
			if (local496 == 1) {
				local328 = local21.method1121() + local489;
				local338 = local21.method1121() + local328;
				local348 = local21.method1121() + local338;
				local489 = local348;
				this.anIntArray251[local491] = local328;
				this.anIntArray258[local491] = local338;
				this.anIntArray257[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1121() + local489;
				local489 = local348;
				this.anIntArray251[local491] = local328;
				this.anIntArray258[local491] = local338;
				this.anIntArray257[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1121() + local489;
				local489 = local348;
				this.anIntArray251[local491] = local328;
				this.anIntArray258[local491] = local338;
				this.anIntArray257[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1121() + local489;
				local489 = local348;
				this.anIntArray251[local491] = local328;
				this.anIntArray258[local491] = local599;
				this.anIntArray257[local491] = local348;
			}
		}
		local21.anInt1957 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.anIntArray267[local496] = local21.method1160();
			this.anIntArray264[local496] = local21.method1160();
			this.anIntArray253[local496] = local21.method1160();
		}
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class10_Sub1_Sub5_Sub4() {
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([Lclient!rb;I)V")
	public Class10_Sub1_Sub5_Sub4(@OriginalArg(0) Class10_Sub1_Sub5_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2261 = 0;
		this.anInt2260 = 0;
		this.anInt2258 = 0;
		this.anInt2263 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class10_Sub1_Sub5_Sub4 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2261 += local43.anInt2261;
				this.anInt2260 += local43.anInt2260;
				this.anInt2258 += local43.anInt2258;
				local18 |= local43.anIntArray266 != null;
				if (local43.anIntArray250 == null) {
					if (this.anInt2263 == -1) {
						this.anInt2263 = local43.anInt2263;
					}
					if (this.anInt2263 != local43.anInt2263) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray262 != null;
				local24 |= local43.anIntArray255 != null;
			}
		}
		this.anIntArray256 = new int[this.anInt2261];
		this.anIntArray265 = new int[this.anInt2261];
		this.anIntArray259 = new int[this.anInt2261];
		this.anIntArray261 = new int[this.anInt2261];
		this.anIntArray251 = new int[this.anInt2260];
		this.anIntArray258 = new int[this.anInt2260];
		this.anIntArray257 = new int[this.anInt2260];
		this.anIntArray267 = new int[this.anInt2258];
		this.anIntArray264 = new int[this.anInt2258];
		this.anIntArray253 = new int[this.anInt2258];
		if (local18) {
			this.anIntArray266 = new int[this.anInt2260];
		}
		if (local20) {
			this.anIntArray250 = new int[this.anInt2260];
		}
		if (local22) {
			this.anIntArray262 = new int[this.anInt2260];
		}
		if (local24) {
			this.anIntArray255 = new int[this.anInt2260];
		}
		this.anIntArray260 = new int[this.anInt2260];
		this.anInt2261 = 0;
		this.anInt2260 = 0;
		this.anInt2258 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Class10_Sub1_Sub5_Sub4 local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.anInt2260; local223++) {
					if (local18) {
						if (local219.anIntArray266 == null) {
							this.anIntArray266[this.anInt2260] = 0;
						} else {
							local241 = local219.anIntArray266[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.anIntArray266[this.anInt2260] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray250 == null) {
							this.anIntArray250[this.anInt2260] = local219.anInt2263;
						} else {
							this.anIntArray250[this.anInt2260] = local219.anIntArray250[local223];
						}
					}
					if (local22) {
						if (local219.anIntArray262 == null) {
							this.anIntArray262[this.anInt2260] = 0;
						} else {
							this.anIntArray262[this.anInt2260] = local219.anIntArray262[local223];
						}
					}
					if (local24 && local219.anIntArray255 != null) {
						this.anIntArray255[this.anInt2260] = local219.anIntArray255[local223];
					}
					this.anIntArray260[this.anInt2260] = local219.anIntArray260[local223];
					this.anIntArray251[this.anInt2260] = this.method1323(local219, local219.anIntArray251[local223]);
					this.anIntArray258[this.anInt2260] = this.method1323(local219, local219.anIntArray258[local223]);
					this.anIntArray257[this.anInt2260] = this.method1323(local219, local219.anIntArray257[local223]);
					this.anInt2260++;
				}
				for (local241 = 0; local241 < local219.anInt2258; local241++) {
					this.anIntArray267[this.anInt2258] = this.method1323(local219, local219.anIntArray267[local241]);
					this.anIntArray264[this.anInt2258] = this.method1323(local219, local219.anIntArray264[local241]);
					this.anIntArray253[this.anInt2258] = this.method1323(local219, local219.anIntArray253[local241]);
					this.anInt2258++;
				}
				local212 += local219.anInt2258;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([Lclient!rb;IZ)V")
	public Class10_Sub1_Sub5_Sub4(@OriginalArg(0) Class10_Sub1_Sub5_Sub4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2261 = 0;
		this.anInt2260 = 0;
		this.anInt2258 = 0;
		this.anInt2263 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class10_Sub1_Sub5_Sub4 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2261 += local43.anInt2261;
				this.anInt2260 += local43.anInt2260;
				this.anInt2258 += local43.anInt2258;
				local18 |= local43.anIntArray266 != null;
				if (local43.anIntArray250 == null) {
					if (this.anInt2263 == -1) {
						this.anInt2263 = local43.anInt2263;
					}
					if (this.anInt2263 != local43.anInt2263) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.anIntArray262 != null;
				local24 |= local43.anIntArray260 != null;
			}
		}
		this.anIntArray256 = new int[this.anInt2261];
		this.anIntArray265 = new int[this.anInt2261];
		this.anIntArray259 = new int[this.anInt2261];
		this.anIntArray251 = new int[this.anInt2260];
		this.anIntArray258 = new int[this.anInt2260];
		this.anIntArray257 = new int[this.anInt2260];
		this.anIntArray252 = new int[this.anInt2260];
		this.anIntArray254 = new int[this.anInt2260];
		this.anIntArray263 = new int[this.anInt2260];
		this.anIntArray267 = new int[this.anInt2258];
		this.anIntArray264 = new int[this.anInt2258];
		this.anIntArray253 = new int[this.anInt2258];
		if (local18) {
			this.anIntArray266 = new int[this.anInt2260];
		}
		if (local20) {
			this.anIntArray250 = new int[this.anInt2260];
		}
		if (local22) {
			this.anIntArray262 = new int[this.anInt2260];
		}
		if (local24) {
			this.anIntArray260 = new int[this.anInt2260];
		}
		this.anInt2261 = 0;
		this.anInt2260 = 0;
		this.anInt2258 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Class10_Sub1_Sub5_Sub4 local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.anInt2261;
				for (@Pc(231) int local231 = 0; local231 < local224.anInt2261; local231++) {
					this.anIntArray256[this.anInt2261] = local224.anIntArray256[local231];
					this.anIntArray265[this.anInt2261] = local224.anIntArray265[local231];
					this.anIntArray259[this.anInt2261] = local224.anIntArray259[local231];
					this.anInt2261++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.anInt2260; local272++) {
					this.anIntArray251[this.anInt2260] = local224.anIntArray251[local272] + local229;
					this.anIntArray258[this.anInt2260] = local224.anIntArray258[local272] + local229;
					this.anIntArray257[this.anInt2260] = local224.anIntArray257[local272] + local229;
					this.anIntArray252[this.anInt2260] = local224.anIntArray252[local272];
					this.anIntArray254[this.anInt2260] = local224.anIntArray254[local272];
					this.anIntArray263[this.anInt2260] = local224.anIntArray263[local272];
					if (local18) {
						if (local224.anIntArray266 == null) {
							this.anIntArray266[this.anInt2260] = 0;
						} else {
							local350 = local224.anIntArray266[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.anIntArray266[this.anInt2260] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray250 == null) {
							this.anIntArray250[this.anInt2260] = local224.anInt2263;
						} else {
							this.anIntArray250[this.anInt2260] = local224.anIntArray250[local272];
						}
					}
					if (local22) {
						if (local224.anIntArray262 == null) {
							this.anIntArray262[this.anInt2260] = 0;
						} else {
							this.anIntArray262[this.anInt2260] = local224.anIntArray262[local272];
						}
					}
					if (local24 && local224.anIntArray260 != null) {
						this.anIntArray260[this.anInt2260] = local224.anIntArray260[local272];
					}
					this.anInt2260++;
				}
				for (local350 = 0; local350 < local224.anInt2258; local350++) {
					this.anIntArray267[this.anInt2258] = local224.anIntArray267[local350] + local229;
					this.anIntArray264[this.anInt2258] = local224.anIntArray264[local350] + local229;
					this.anIntArray253[this.anInt2258] = local224.anIntArray253[local350] + local229;
					this.anInt2258++;
				}
				local217 += local224.anInt2258;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!rb;ZZZ)V")
	public Class10_Sub1_Sub5_Sub4(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2261 = arg0.anInt2261;
		this.anInt2260 = arg0.anInt2260;
		this.anInt2258 = arg0.anInt2258;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray256 = arg0.anIntArray256;
			this.anIntArray265 = arg0.anIntArray265;
			this.anIntArray259 = arg0.anIntArray259;
		} else {
			this.anIntArray256 = new int[this.anInt2261];
			this.anIntArray265 = new int[this.anInt2261];
			this.anIntArray259 = new int[this.anInt2261];
			for (local60 = 0; local60 < this.anInt2261; local60++) {
				this.anIntArray256[local60] = arg0.anIntArray256[local60];
				this.anIntArray265[local60] = arg0.anIntArray265[local60];
				this.anIntArray259[local60] = arg0.anIntArray259[local60];
			}
		}
		if (arg2) {
			this.anIntArray260 = arg0.anIntArray260;
		} else {
			this.anIntArray260 = new int[this.anInt2260];
			for (local60 = 0; local60 < this.anInt2260; local60++) {
				this.anIntArray260[local60] = arg0.anIntArray260[local60];
			}
		}
		this.anIntArray262 = arg0.anIntArray262;
		this.anIntArray261 = arg0.anIntArray261;
		this.anIntArray255 = arg0.anIntArray255;
		this.anIntArray266 = arg0.anIntArray266;
		this.anIntArray251 = arg0.anIntArray251;
		this.anIntArray258 = arg0.anIntArray258;
		this.anIntArray257 = arg0.anIntArray257;
		this.anIntArray250 = arg0.anIntArray250;
		this.anInt2263 = arg0.anInt2263;
		this.anIntArray267 = arg0.anIntArray267;
		this.anIntArray264 = arg0.anIntArray264;
		this.anIntArray253 = arg0.anIntArray253;
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!rb;ZZ)V")
	public Class10_Sub1_Sub5_Sub4(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.anInt2261 = arg0.anInt2261;
		this.anInt2260 = arg0.anInt2260;
		this.anInt2258 = arg0.anInt2258;
		@Pc(37) int local37;
		if (arg1) {
			this.anIntArray265 = new int[this.anInt2261];
			for (local37 = 0; local37 < this.anInt2261; local37++) {
				this.anIntArray265[local37] = arg0.anIntArray265[local37];
			}
		} else {
			this.anIntArray265 = arg0.anIntArray265;
		}
		if (arg2) {
			this.anIntArray252 = new int[this.anInt2260];
			this.anIntArray254 = new int[this.anInt2260];
			this.anIntArray263 = new int[this.anInt2260];
			for (local37 = 0; local37 < this.anInt2260; local37++) {
				this.anIntArray252[local37] = arg0.anIntArray252[local37];
				this.anIntArray254[local37] = arg0.anIntArray254[local37];
				this.anIntArray263[local37] = arg0.anIntArray263[local37];
			}
			this.anIntArray266 = new int[this.anInt2260];
			@Pc(115) int local115;
			if (arg0.anIntArray266 == null) {
				for (local115 = 0; local115 < this.anInt2260; local115++) {
					this.anIntArray266[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.anInt2260; local115++) {
					this.anIntArray266[local115] = arg0.anIntArray266[local115];
				}
			}
			this.aClass37Array2 = new Class37[this.anInt2261];
			for (local115 = 0; local115 < this.anInt2261; local115++) {
				@Pc(160) Class37 local160 = this.aClass37Array2[local115] = new Class37();
				@Pc(165) Class37 local165 = arg0.aClass37Array2[local115];
				local160.anInt1504 = local165.anInt1504;
				local160.anInt1507 = local165.anInt1507;
				local160.anInt1513 = local165.anInt1513;
				local160.anInt1510 = local165.anInt1510;
			}
			this.aClass37Array1 = arg0.aClass37Array1;
		} else {
			this.anIntArray252 = arg0.anIntArray252;
			this.anIntArray254 = arg0.anIntArray254;
			this.anIntArray263 = arg0.anIntArray263;
			this.anIntArray266 = arg0.anIntArray266;
		}
		this.anIntArray256 = arg0.anIntArray256;
		this.anIntArray259 = arg0.anIntArray259;
		this.anIntArray260 = arg0.anIntArray260;
		this.anIntArray262 = arg0.anIntArray262;
		this.anIntArray250 = arg0.anIntArray250;
		this.anInt2263 = arg0.anInt2263;
		this.anIntArray251 = arg0.anIntArray251;
		this.anIntArray258 = arg0.anIntArray258;
		this.anIntArray257 = arg0.anIntArray257;
		this.anIntArray267 = arg0.anIntArray267;
		this.anIntArray264 = arg0.anIntArray264;
		this.anIntArray253 = arg0.anIntArray253;
		this.anInt2264 = arg0.anInt2264;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()V")
	public void method1310() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray261 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2261; local9++) {
				local15 = this.anIntArray261[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray18 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray18[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2261) {
				local65 = this.anIntArray261[local59];
				this.anIntArrayArray18[local65][local5[local65]++] = local59++;
			}
			this.anIntArray261 = null;
		}
		if (this.anIntArray255 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2260; local9++) {
			local15 = this.anIntArray255[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray17 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray17[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2260) {
			local65 = this.anIntArray255[local59];
			this.anIntArrayArray17[local65][local5[local65]++] = local59++;
		}
		this.anIntArray255 = null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
	public void method1311() {
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2261; local7++) {
			@Pc(13) int local13 = this.anIntArray259[local7];
			this.anIntArray259[local7] = this.anIntArray256[local7];
			this.anIntArray256[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
	public void method1312() {
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2261; local7++) {
			@Pc(13) int local13 = this.anIntArray256[local7];
			this.anIntArray256[local7] = this.anIntArray259[local7];
			this.anIntArray259[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZI)V")
	private void method1313(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2262 >= 1500) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2262; local6++) {
			Static84.anIntArray278[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2260; local18++) {
			if (this.anIntArray266 == null || this.anIntArray266[local18] != -1) {
				local33 = this.anIntArray251[local18];
				local38 = this.anIntArray258[local18];
				local43 = this.anIntArray257[local18];
				local47 = Static84.anIntArray284[local33];
				local51 = Static84.anIntArray284[local38];
				local55 = Static84.anIntArray284[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static84.anIntArray276[local33];
					local74 = Static84.anIntArray276[local38];
					@Pc(78) int local78 = Static84.anIntArray276[local43];
					@Pc(82) int local82 = Static84.anIntArray282[local33];
					local86 = Static84.anIntArray282[local38];
					local90 = Static84.anIntArray282[local43];
					@Pc(94) int local94 = Static84.anIntArray270[local33];
					local98 = Static84.anIntArray270[local38];
					@Pc(102) int local102 = Static84.anIntArray270[local43];
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
						Static84.aBooleanArray10[local18] = true;
						@Pc(183) int local183 = (Static84.anIntArray287[local33] + Static84.anIntArray287[local38] + Static84.anIntArray287[local43]) / 3 + this.anInt2257;
						Static84.anIntArrayArray19[local183][Static84.anIntArray278[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method1327(Static84.anInt2272, Static84.anInt2270, Static84.anIntArray283[local33], Static84.anIntArray283[local38], Static84.anIntArray283[local43], local47, local51, local55)) {
						Static84.anIntArray274[Static84.anInt2268++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static84.anIntArray283[local43] - Static84.anIntArray283[local38]) - (Static84.anIntArray283[local33] - Static84.anIntArray283[local38]) * (local55 - local51) > 0) {
						Static84.aBooleanArray10[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static68.anInt1807 && local51 <= Static68.anInt1807 && local55 <= Static68.anInt1807) {
							Static84.aBooleanArray11[local18] = false;
						} else {
							Static84.aBooleanArray11[local18] = true;
						}
						local70 = (Static84.anIntArray287[local33] + Static84.anIntArray287[local38] + Static84.anIntArray287[local43]) / 3 + this.anInt2257;
						Static84.anIntArrayArray19[local70][Static84.anIntArray278[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray250 == null) {
			for (local33 = this.anInt2262 - 1; local33 >= 0; local33--) {
				local38 = Static84.anIntArray278[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static84.anIntArrayArray19[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.method1330(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static84.anIntArray285[local33] = 0;
			Static84.anIntArray273[local33] = 0;
		}
		for (local38 = this.anInt2262 - 1; local38 >= 0; local38--) {
			local43 = Static84.anIntArray278[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static84.anIntArrayArray19[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray250[local55];
					local74 = Static84.anIntArray285[local70]++;
					Static84.anIntArrayArray20[local70][local74] = local55;
					if (local70 < 10) {
						Static84.anIntArray273[local70] += local38;
					} else if (local70 == 10) {
						Static84.anIntArray286[local74] = local38;
					} else {
						Static84.anIntArray289[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static84.anIntArray285[1] > 0 || Static84.anIntArray285[2] > 0) {
			local43 = (Static84.anIntArray273[1] + Static84.anIntArray273[2]) / (Static84.anIntArray285[1] + Static84.anIntArray285[2]);
		}
		local47 = 0;
		if (Static84.anIntArray285[3] > 0 || Static84.anIntArray285[4] > 0) {
			local47 = (Static84.anIntArray273[3] + Static84.anIntArray273[4]) / (Static84.anIntArray285[3] + Static84.anIntArray285[4]);
		}
		local51 = 0;
		if (Static84.anIntArray285[6] > 0 || Static84.anIntArray285[8] > 0) {
			local51 = (Static84.anIntArray273[6] + Static84.anIntArray273[8]) / (Static84.anIntArray285[6] + Static84.anIntArray285[8]);
		}
		local70 = 0;
		local74 = Static84.anIntArray285[10];
		@Pc(524) int[] local524 = Static84.anIntArrayArray20[10];
		@Pc(526) int[] local526 = Static84.anIntArray286;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static84.anIntArray285[11];
			local524 = Static84.anIntArrayArray20[11];
			local526 = Static84.anIntArray289;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.method1330(local524[local70++]);
				if (local70 == local74 && local524 != Static84.anIntArrayArray20[11]) {
					local70 = 0;
					local74 = Static84.anIntArray285[11];
					local524 = Static84.anIntArrayArray20[11];
					local526 = Static84.anIntArray289;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.method1330(local524[local70++]);
				if (local70 == local74 && local524 != Static84.anIntArrayArray20[11]) {
					local70 = 0;
					local74 = Static84.anIntArray285[11];
					local524 = Static84.anIntArrayArray20[11];
					local526 = Static84.anIntArray289;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.method1330(local524[local70++]);
				if (local70 == local74 && local524 != Static84.anIntArrayArray20[11]) {
					local70 = 0;
					local74 = Static84.anIntArray285[11];
					local524 = Static84.anIntArrayArray20[11];
					local526 = Static84.anIntArray289;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static84.anIntArray285[local86];
			@Pc(689) int[] local689 = Static84.anIntArrayArray20[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.method1330(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.method1330(local524[local70++]);
			if (local70 == local74 && local524 != Static84.anIntArrayArray20[11]) {
				local70 = 0;
				local524 = Static84.anIntArrayArray20[11];
				local74 = Static84.anIntArray285[11];
				local526 = Static84.anIntArray289;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method1314(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static84.anIntArray288.length < this.anInt2260) {
			Static84.anIntArray288 = new int[this.anInt2260 + 100];
		}
		return this.method1319(arg0, Static84.aClass10_Sub1_Sub5_Sub4_3, Static84.anIntArray288);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	public void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2259 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2261; local4++) {
			this.anIntArray256[local4] += arg0;
			this.anIntArray265[local4] += arg1;
			this.anIntArray259[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(III)V")
	public void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2261; local7++) {
			this.anIntArray256[local7] = this.anIntArray256[local7] * arg0 / 128;
			this.anIntArray265[local7] = this.anIntArray265[local7] * arg1 / 128;
			this.anIntArray259[local7] = this.anIntArray259[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "()V")
	private void method1317() {
		if (this.anInt2259 == 2) {
			return;
		}
		this.anInt2259 = 2;
		this.anInt2266 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2261; local12++) {
			@Pc(18) int local18 = this.anIntArray256[local12];
			@Pc(23) int local23 = this.anIntArray265[local12];
			@Pc(28) int local28 = this.anIntArray259[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2266) {
				this.anInt2266 = local40;
			}
		}
		this.anInt2266 = (int) (Math.sqrt((double) this.anInt2266) + 0.99D);
		this.anInt2257 = this.anInt2266;
		this.anInt2262 = this.anInt2266 + this.anInt2266;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!rb;[I)Lclient!rb;")
	private Class10_Sub1_Sub5_Sub4 method1319(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class10_Sub1_Sub5_Sub4 arg1, @OriginalArg(2) int[] arg2) {
		arg1.anInt2261 = this.anInt2261;
		arg1.anInt2260 = this.anInt2260;
		arg1.anInt2258 = this.anInt2258;
		if (arg1.anIntArray256 == null || arg1.anIntArray256.length < this.anInt2261) {
			arg1.anIntArray256 = new int[this.anInt2261 + 100];
			arg1.anIntArray265 = new int[this.anInt2261 + 100];
			arg1.anIntArray259 = new int[this.anInt2261 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2261; local43++) {
			arg1.anIntArray256[local43] = this.anIntArray256[local43];
			arg1.anIntArray265[local43] = this.anIntArray265[local43];
			arg1.anIntArray259[local43] = this.anIntArray259[local43];
		}
		if (arg0) {
			arg1.anIntArray262 = this.anIntArray262;
		} else {
			arg1.anIntArray262 = arg2;
			@Pc(88) int local88;
			if (this.anIntArray262 == null) {
				for (local88 = 0; local88 < this.anInt2260; local88++) {
					arg1.anIntArray262[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2260; local88++) {
					arg1.anIntArray262[local88] = this.anIntArray262[local88];
				}
			}
		}
		arg1.anIntArray266 = this.anIntArray266;
		arg1.anIntArray260 = this.anIntArray260;
		arg1.anIntArray250 = this.anIntArray250;
		arg1.anInt2263 = this.anInt2263;
		arg1.anIntArrayArray17 = this.anIntArrayArray17;
		arg1.anIntArrayArray18 = this.anIntArrayArray18;
		arg1.anIntArray251 = this.anIntArray251;
		arg1.anIntArray258 = this.anIntArray258;
		arg1.anIntArray257 = this.anIntArray257;
		arg1.anIntArray252 = this.anIntArray252;
		arg1.anIntArray254 = this.anIntArray254;
		arg1.anIntArray263 = this.anIntArray263;
		arg1.anIntArray267 = this.anIntArray267;
		arg1.anIntArray264 = this.anIntArray264;
		arg1.anIntArray253 = this.anIntArray253;
		arg1.anInt2259 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "()V")
	public void method1320() {
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2261; local7++) {
			this.anIntArray259[local7] = -this.anIntArray259[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt2260; local24++) {
			@Pc(30) int local30 = this.anIntArray251[local24];
			this.anIntArray251[local24] = this.anIntArray257[local24];
			this.anIntArray257[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "()V")
	public void method1321() {
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2261; local7++) {
			this.anIntArray256[local7] = -this.anIntArray256[local7];
			this.anIntArray259[local7] = -this.anIntArray259[local7];
		}
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	private void method1322(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static68.anInt1810;
		@Pc(3) int local3 = Static68.anInt1808;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray251[arg0];
		@Pc(15) int local15 = this.anIntArray258[arg0];
		@Pc(20) int local20 = this.anIntArray257[arg0];
		@Pc(24) int local24 = Static84.anIntArray270[local10];
		@Pc(28) int local28 = Static84.anIntArray270[local15];
		@Pc(32) int local32 = Static84.anIntArray270[local20];
		if (this.anIntArray262 == null) {
			Static68.anInt1806 = 0;
		} else {
			Static68.anInt1806 = this.anIntArray262[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static84.anIntArray272[0] = Static84.anIntArray284[local10];
			Static84.anIntArray271[0] = Static84.anIntArray283[local10];
			local5++;
			Static84.anIntArray269[0] = this.anIntArray252[arg0];
		} else {
			local71 = Static84.anIntArray276[local10];
			local75 = Static84.anIntArray282[local10];
			local80 = this.anIntArray252[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static84.anIntArray275[local32 - local24];
				Static84.anIntArray272[0] = local1 + (local71 + ((Static84.anIntArray276[local20] - local71) * local93 >> 16) << 9) / 50;
				Static84.anIntArray271[0] = local3 + (local75 + ((Static84.anIntArray282[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static84.anIntArray269[0] = local80 + ((this.anIntArray263[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static84.anIntArray275[local28 - local24];
				Static84.anIntArray272[local5] = local1 + (local71 + ((Static84.anIntArray276[local15] - local71) * local93 >> 16) << 9) / 50;
				Static84.anIntArray271[local5] = local3 + (local75 + ((Static84.anIntArray282[local15] - local75) * local93 >> 16) << 9) / 50;
				Static84.anIntArray269[local5++] = local80 + ((this.anIntArray254[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static84.anIntArray272[local5] = Static84.anIntArray284[local15];
			Static84.anIntArray271[local5] = Static84.anIntArray283[local15];
			Static84.anIntArray269[local5++] = this.anIntArray254[arg0];
		} else {
			local71 = Static84.anIntArray276[local15];
			local75 = Static84.anIntArray282[local15];
			local80 = this.anIntArray254[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static84.anIntArray275[local24 - local28];
				Static84.anIntArray272[local5] = local1 + (local71 + ((Static84.anIntArray276[local10] - local71) * local93 >> 16) << 9) / 50;
				Static84.anIntArray271[local5] = local3 + (local75 + ((Static84.anIntArray282[local10] - local75) * local93 >> 16) << 9) / 50;
				Static84.anIntArray269[local5++] = local80 + ((this.anIntArray252[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static84.anIntArray275[local32 - local28];
				Static84.anIntArray272[local5] = local1 + (local71 + ((Static84.anIntArray276[local20] - local71) * local93 >> 16) << 9) / 50;
				Static84.anIntArray271[local5] = local3 + (local75 + ((Static84.anIntArray282[local20] - local75) * local93 >> 16) << 9) / 50;
				Static84.anIntArray269[local5++] = local80 + ((this.anIntArray263[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static84.anIntArray272[local5] = Static84.anIntArray284[local20];
			Static84.anIntArray271[local5] = Static84.anIntArray283[local20];
			Static84.anIntArray269[local5++] = this.anIntArray263[arg0];
		} else {
			local71 = Static84.anIntArray276[local20];
			local75 = Static84.anIntArray282[local20];
			local80 = this.anIntArray263[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static84.anIntArray275[local28 - local32];
				Static84.anIntArray272[local5] = local1 + (local71 + ((Static84.anIntArray276[local15] - local71) * local93 >> 16) << 9) / 50;
				Static84.anIntArray271[local5] = local3 + (local75 + ((Static84.anIntArray282[local15] - local75) * local93 >> 16) << 9) / 50;
				Static84.anIntArray269[local5++] = local80 + ((this.anIntArray254[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static84.anIntArray275[local24 - local32];
				Static84.anIntArray272[local5] = local1 + (local71 + ((Static84.anIntArray276[local10] - local71) * local93 >> 16) << 9) / 50;
				Static84.anIntArray271[local5] = local3 + (local75 + ((Static84.anIntArray282[local10] - local75) * local93 >> 16) << 9) / 50;
				Static84.anIntArray269[local5++] = local80 + ((this.anIntArray252[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static84.anIntArray272[0];
		local75 = Static84.anIntArray272[1];
		local80 = Static84.anIntArray272[2];
		local93 = Static84.anIntArray271[0];
		@Pc(588) int local588 = Static84.anIntArray271[1];
		@Pc(592) int local592 = Static84.anIntArray271[2];
		Static68.aBoolean83 = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static68.anInt1807 || local75 > Static68.anInt1807 || local80 > Static68.anInt1807) {
				Static68.aBoolean83 = true;
			}
			if (this.anIntArray266 == null) {
				local619 = 0;
			} else {
				local619 = this.anIntArray266[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static68.method1000(local93, local588, local592, local71, local75, local80, Static84.anIntArray269[0], Static84.anIntArray269[1], Static84.anIntArray269[2]);
			} else if (local619 == 1) {
				Static68.method1002(local93, local588, local592, local71, local75, local80, Static84.anIntArray279[this.anIntArray252[arg0]]);
			} else if (local619 == 2) {
				local673 = this.anIntArray266[arg0] >> 2;
				local678 = this.anIntArray267[local673];
				local683 = this.anIntArray264[local673];
				local688 = this.anIntArray253[local673];
				Static68.method999(local93, local588, local592, local71, local75, local80, Static84.anIntArray269[0], Static84.anIntArray269[1], Static84.anIntArray269[2], Static84.anIntArray276[local678], Static84.anIntArray276[local683], Static84.anIntArray276[local688], Static84.anIntArray282[local678], Static84.anIntArray282[local683], Static84.anIntArray282[local688], Static84.anIntArray270[local678], Static84.anIntArray270[local683], Static84.anIntArray270[local688], this.anIntArray260[arg0]);
			} else if (local619 == 3) {
				local673 = this.anIntArray266[arg0] >> 2;
				local678 = this.anIntArray267[local673];
				local683 = this.anIntArray264[local673];
				local688 = this.anIntArray253[local673];
				Static68.method999(local93, local588, local592, local71, local75, local80, this.anIntArray252[arg0], this.anIntArray252[arg0], this.anIntArray252[arg0], Static84.anIntArray276[local678], Static84.anIntArray276[local683], Static84.anIntArray276[local688], Static84.anIntArray282[local678], Static84.anIntArray282[local683], Static84.anIntArray282[local688], Static84.anIntArray270[local678], Static84.anIntArray270[local683], Static84.anIntArray270[local688], this.anIntArray260[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static68.anInt1807 || local75 > Static68.anInt1807 || local80 > Static68.anInt1807 || Static84.anIntArray272[3] < 0 || Static84.anIntArray272[3] > Static68.anInt1807) {
			Static68.aBoolean83 = true;
		}
		if (this.anIntArray266 == null) {
			local619 = 0;
		} else {
			local619 = this.anIntArray266[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static68.method1000(local93, local588, local592, local71, local75, local80, Static84.anIntArray269[0], Static84.anIntArray269[1], Static84.anIntArray269[2]);
			Static68.method1000(local93, local592, Static84.anIntArray271[3], local71, local80, Static84.anIntArray272[3], Static84.anIntArray269[0], Static84.anIntArray269[2], Static84.anIntArray269[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static84.anIntArray279[this.anIntArray252[arg0]];
			Static68.method1002(local93, local588, local592, local71, local75, local80, local673);
			Static68.method1002(local93, local592, Static84.anIntArray271[3], local71, local80, Static84.anIntArray272[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.anIntArray266[arg0] >> 2;
			local678 = this.anIntArray267[local673];
			local683 = this.anIntArray264[local673];
			local688 = this.anIntArray253[local673];
			Static68.method999(local93, local588, local592, local71, local75, local80, Static84.anIntArray269[0], Static84.anIntArray269[1], Static84.anIntArray269[2], Static84.anIntArray276[local678], Static84.anIntArray276[local683], Static84.anIntArray276[local688], Static84.anIntArray282[local678], Static84.anIntArray282[local683], Static84.anIntArray282[local688], Static84.anIntArray270[local678], Static84.anIntArray270[local683], Static84.anIntArray270[local688], this.anIntArray260[arg0]);
			Static68.method999(local93, local592, Static84.anIntArray271[3], local71, local80, Static84.anIntArray272[3], Static84.anIntArray269[0], Static84.anIntArray269[2], Static84.anIntArray269[3], Static84.anIntArray276[local678], Static84.anIntArray276[local683], Static84.anIntArray276[local688], Static84.anIntArray282[local678], Static84.anIntArray282[local683], Static84.anIntArray282[local688], Static84.anIntArray270[local678], Static84.anIntArray270[local683], Static84.anIntArray270[local688], this.anIntArray260[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.anIntArray266[arg0] >> 2;
		local678 = this.anIntArray267[local673];
		local683 = this.anIntArray264[local673];
		local688 = this.anIntArray253[local673];
		Static68.method999(local93, local588, local592, local71, local75, local80, this.anIntArray252[arg0], this.anIntArray252[arg0], this.anIntArray252[arg0], Static84.anIntArray276[local678], Static84.anIntArray276[local683], Static84.anIntArray276[local688], Static84.anIntArray282[local678], Static84.anIntArray282[local683], Static84.anIntArray282[local688], Static84.anIntArray270[local678], Static84.anIntArray270[local683], Static84.anIntArray270[local688], this.anIntArray260[arg0]);
		Static68.method999(local93, local592, Static84.anIntArray271[3], local71, local80, Static84.anIntArray272[3], this.anIntArray252[arg0], this.anIntArray252[arg0], this.anIntArray252[arg0], Static84.anIntArray276[local678], Static84.anIntArray276[local683], Static84.anIntArray276[local688], Static84.anIntArray282[local678], Static84.anIntArray282[local683], Static84.anIntArray282[local688], Static84.anIntArray270[local678], Static84.anIntArray270[local683], Static84.anIntArray270[local688], this.anIntArray260[arg0]);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!rb;I)I")
	private int method1323(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray256[arg1];
		@Pc(11) int local11 = arg0.anIntArray265[arg1];
		@Pc(16) int local16 = arg0.anIntArray259[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2261; local18++) {
			if (local6 == this.anIntArray256[local18] && local11 == this.anIntArray265[local18] && local16 == this.anIntArray259[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray256[this.anInt2261] = local6;
			this.anIntArray265[this.anInt2261] = local11;
			this.anIntArray259[this.anInt2261] = local16;
			if (arg0.anIntArray261 != null) {
				this.anIntArray261[this.anInt2261] = arg0.anIntArray261[arg1];
			}
			local1 = this.anInt2261++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIZ)V")
	public void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(14) int local14 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(20) int local20 = arg1 * local14 >> 8;
		if (this.anIntArray252 == null) {
			this.anIntArray252 = new int[this.anInt2260];
			this.anIntArray254 = new int[this.anInt2260];
			this.anIntArray263 = new int[this.anInt2260];
		}
		@Pc(48) int local48;
		if (this.aClass37Array2 == null) {
			this.aClass37Array2 = new Class37[this.anInt2261];
			for (local48 = 0; local48 < this.anInt2261; local48++) {
				this.aClass37Array2[local48] = new Class37();
			}
		}
		@Pc(69) int local69;
		for (local48 = 0; local48 < this.anInt2260; local48++) {
			local69 = this.anIntArray251[local48];
			@Pc(74) int local74 = this.anIntArray258[local48];
			@Pc(79) int local79 = this.anIntArray257[local48];
			@Pc(89) int local89 = this.anIntArray256[local74] - this.anIntArray256[local69];
			@Pc(99) int local99 = this.anIntArray265[local74] - this.anIntArray265[local69];
			@Pc(109) int local109 = this.anIntArray259[local74] - this.anIntArray259[local69];
			@Pc(119) int local119 = this.anIntArray256[local79] - this.anIntArray256[local69];
			@Pc(129) int local129 = this.anIntArray265[local79] - this.anIntArray265[local69];
			@Pc(139) int local139 = this.anIntArray259[local79] - this.anIntArray259[local69];
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
			if (this.anIntArray266 == null || (this.anIntArray266[local48] & 0x1) == 0) {
				@Pc(246) Class37 local246 = this.aClass37Array2[local69];
				local246.anInt1504 += local147;
				local246.anInt1507 += local155;
				local246.anInt1513 += local163;
				local246.anInt1510++;
				@Pc(275) Class37 local275 = this.aClass37Array2[local74];
				local275.anInt1504 += local147;
				local275.anInt1507 += local155;
				local275.anInt1513 += local163;
				local275.anInt1510++;
				@Pc(304) Class37 local304 = this.aClass37Array2[local79];
				local304.anInt1504 += local147;
				local304.anInt1507 += local155;
				local304.anInt1513 += local163;
				local304.anInt1510++;
			} else {
				@Pc(349) int local349 = arg0 + (arg2 * local147 + arg3 * local155 + arg4 * local163) / (local20 + local20 / 2);
				this.anIntArray252[local48] = Static84.method1318(this.anIntArray260[local48], local349, this.anIntArray266[local48]);
			}
		}
		if (arg5) {
			this.method1332(arg0, local20, arg2, arg3, arg4);
			return;
		}
		this.aClass37Array1 = new Class37[this.anInt2261];
		for (local69 = 0; local69 < this.anInt2261; local69++) {
			@Pc(391) Class37 local391 = this.aClass37Array2[local69];
			@Pc(400) Class37 local400 = this.aClass37Array1[local69] = new Class37();
			local400.anInt1504 = local391.anInt1504;
			local400.anInt1507 = local391.anInt1507;
			local400.anInt1513 = local391.anInt1513;
			local400.anInt1510 = local391.anInt1510;
		}
		this.anInt2264 = (arg0 << 16) + (local20 & 0xFFFF);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt2259 != 1) {
			this.method1338();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt2266 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt2266 << 9;
		if (local60 / local36 >= Static68.anInt1811) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt2266 << 9;
		if (local73 / local36 <= Static68.anInt1813) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt2266 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static68.anInt1809) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2674 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static68.anInt1814) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2674 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt2258 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static84.aBoolean99) {
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
			local215 = Static84.anInt2272 - Static68.anInt1810;
			local219 = Static84.anInt2270 - Static68.anInt1808;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean98) {
					Static84.anIntArray274[Static84.anInt2268++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static68.anInt1810;
		local215 = Static68.anInt1808;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static84.anIntArray280[arg0];
			local253 = Static84.anIntArray281[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt2261; local265++) {
			@Pc(271) int local271 = this.anIntArray256[local265];
			@Pc(276) int local276 = this.anIntArray265[local265];
			@Pc(281) int local281 = this.anIntArray259[local265];
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
			Static84.anIntArray287[local265] = local281 - local25;
			if (local281 >= 50) {
				Static84.anIntArray284[local265] = local168 + (local271 << 9) / local281;
				Static84.anIntArray283[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static84.anIntArray284[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static84.anIntArray276[local265] = local271;
				Static84.anIntArray282[local265] = local293;
				Static84.anIntArray270[local265] = local281;
			}
		}
		try {
			this.method1313(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "()V")
	public void method1325() {
		if (this.anInt2259 == 3) {
			return;
		}
		this.anInt2259 = 3;
		super.anInt2674 = 0;
		this.anInt2267 = 0;
		this.anInt2266 = 999999;
		this.anInt2262 = -999999;
		this.anInt2257 = -99999;
		this.anInt2265 = 99999;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2261; local27++) {
			@Pc(33) int local33 = this.anIntArray256[local27];
			@Pc(38) int local38 = this.anIntArray265[local27];
			@Pc(43) int local43 = this.anIntArray259[local27];
			if (local33 < this.anInt2266) {
				this.anInt2266 = local33;
			}
			if (local33 > this.anInt2262) {
				this.anInt2262 = local33;
			}
			if (local43 < this.anInt2265) {
				this.anInt2265 = local43;
			}
			if (local43 > this.anInt2257) {
				this.anInt2257 = local43;
			}
			if (-local38 > super.anInt2674) {
				super.anInt2674 = -local38;
			}
			if (local38 > this.anInt2267) {
				this.anInt2267 = local38;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(III)V")
	public void method1326() {
		@Pc(4) int local4 = this.anInt2264 >> 16;
		@Pc(11) int local11 = this.anInt2264 << 16 >> 16;
		this.method1332(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2260; local1++) {
			if (this.anIntArray260[local1] == arg0) {
				this.anIntArray260[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!hd;ILclient!hd;I[I)V")
	public void method1329(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1334(arg0, arg1);
			return;
		}
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		@Pc(24) Class39 local24 = arg0.aClass39Array1[arg1];
		@Pc(29) Class39 local29 = arg2.aClass39Array1[arg3];
		@Pc(32) Class10_Sub6 local32 = local24.aClass10_Sub6_1;
		Static84.anInt2273 = 0;
		Static84.anInt2269 = 0;
		Static84.anInt2271 = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt1571; local47++) {
			local53 = local24.anIntArray174[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray103[local53] == 0) {
				this.method1339(local32.anIntArray103[local53], local32.anIntArrayArray8[local53], local24.anIntArray177[local47], local24.anIntArray181[local47], local24.anIntArray178[local47]);
			}
		}
		Static84.anInt2273 = 0;
		Static84.anInt2269 = 0;
		Static84.anInt2271 = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt1571; local53++) {
			@Pc(118) int local118 = local29.anIntArray174[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray103[local118] == 0) {
				this.method1339(local32.anIntArray103[local118], local32.anIntArrayArray8[local118], local29.anIntArray177[local53], local29.anIntArray181[local53], local29.anIntArray178[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	private void method1330(@OriginalArg(0) int arg0) {
		if (Static84.aBooleanArray10[arg0]) {
			this.method1322(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray251[arg0];
		@Pc(17) int local17 = this.anIntArray258[arg0];
		@Pc(22) int local22 = this.anIntArray257[arg0];
		Static68.aBoolean83 = Static84.aBooleanArray11[arg0];
		if (this.anIntArray262 == null) {
			Static68.anInt1806 = 0;
		} else {
			Static68.anInt1806 = this.anIntArray262[arg0];
		}
		@Pc(42) int local42;
		if (this.anIntArray266 == null) {
			local42 = 0;
		} else {
			local42 = this.anIntArray266[arg0] & 0x3;
		}
		if (local42 == 0) {
			Static68.method1000(Static84.anIntArray283[local12], Static84.anIntArray283[local17], Static84.anIntArray283[local22], Static84.anIntArray284[local12], Static84.anIntArray284[local17], Static84.anIntArray284[local22], this.anIntArray252[arg0], this.anIntArray254[arg0], this.anIntArray263[arg0]);
		} else if (local42 == 1) {
			Static68.method1002(Static84.anIntArray283[local12], Static84.anIntArray283[local17], Static84.anIntArray283[local22], Static84.anIntArray284[local12], Static84.anIntArray284[local17], Static84.anIntArray284[local22], Static84.anIntArray279[this.anIntArray252[arg0]]);
		} else {
			@Pc(123) int local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			if (local42 == 2) {
				local123 = this.anIntArray266[arg0] >> 2;
				local128 = this.anIntArray267[local123];
				local133 = this.anIntArray264[local123];
				local138 = this.anIntArray253[local123];
				Static68.method999(Static84.anIntArray283[local12], Static84.anIntArray283[local17], Static84.anIntArray283[local22], Static84.anIntArray284[local12], Static84.anIntArray284[local17], Static84.anIntArray284[local22], this.anIntArray252[arg0], this.anIntArray254[arg0], this.anIntArray263[arg0], Static84.anIntArray276[local128], Static84.anIntArray276[local133], Static84.anIntArray276[local138], Static84.anIntArray282[local128], Static84.anIntArray282[local133], Static84.anIntArray282[local138], Static84.anIntArray270[local128], Static84.anIntArray270[local133], Static84.anIntArray270[local138], this.anIntArray260[arg0]);
			} else if (local42 == 3) {
				local123 = this.anIntArray266[arg0] >> 2;
				local128 = this.anIntArray267[local123];
				local133 = this.anIntArray264[local123];
				local138 = this.anIntArray253[local123];
				Static68.method999(Static84.anIntArray283[local12], Static84.anIntArray283[local17], Static84.anIntArray283[local22], Static84.anIntArray284[local12], Static84.anIntArray284[local17], Static84.anIntArray284[local22], this.anIntArray252[arg0], this.anIntArray252[arg0], this.anIntArray252[arg0], Static84.anIntArray276[local128], Static84.anIntArray276[local133], Static84.anIntArray276[local138], Static84.anIntArray282[local128], Static84.anIntArray282[local133], Static84.anIntArray282[local138], Static84.anIntArray270[local128], Static84.anIntArray270[local133], Static84.anIntArray270[local138], this.anIntArray260[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)V")
	public void method1331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt2259 != 2 && this.anInt2259 != 1) {
			this.method1317();
		}
		@Pc(11) int local11 = Static68.anInt1810;
		@Pc(13) int local13 = Static68.anInt1808;
		@Pc(17) int local17 = Static84.anIntArray280[0];
		@Pc(21) int local21 = Static84.anIntArray281[0];
		@Pc(25) int local25 = Static84.anIntArray280[arg0];
		@Pc(29) int local29 = Static84.anIntArray281[arg0];
		@Pc(33) int local33 = Static84.anIntArray280[arg1];
		@Pc(37) int local37 = Static84.anIntArray281[arg1];
		@Pc(41) int local41 = Static84.anIntArray280[arg2];
		@Pc(45) int local45 = Static84.anIntArray281[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2261; local57++) {
			@Pc(63) int local63 = this.anIntArray256[local57];
			@Pc(68) int local68 = this.anIntArray265[local57];
			@Pc(73) int local73 = this.anIntArray259[local57];
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
			Static84.anIntArray287[local57] = local73 - local55;
			Static84.anIntArray284[local57] = local11 + (local63 << 9) / local73;
			Static84.anIntArray283[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt2258 > 0) {
				Static84.anIntArray276[local57] = local63;
				Static84.anIntArray282[local57] = local85;
				Static84.anIntArray270[local57] = local73;
			}
		}
		try {
			this.method1313(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
	private void method1332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2260; local1++) {
			local7 = this.anIntArray251[local1];
			@Pc(12) int local12 = this.anIntArray258[local1];
			@Pc(17) int local17 = this.anIntArray257[local1];
			@Pc(30) Class37 local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.anIntArray266 == null) {
				local25 = this.anIntArray260[local1];
				local30 = this.aClass37Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt1504 + arg3 * local30.anInt1507 + arg4 * local30.anInt1513) / (arg1 * local30.anInt1510);
				this.anIntArray252[local1] = Static84.method1318(local25, local52, 0);
				@Pc(65) Class37 local65 = this.aClass37Array2[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.anInt1504 + arg3 * local65.anInt1507 + arg4 * local65.anInt1513) / (arg1 * local65.anInt1510);
				this.anIntArray254[local1] = Static84.method1318(local25, local87, 0);
				@Pc(100) Class37 local100 = this.aClass37Array2[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.anInt1504 + arg3 * local100.anInt1507 + arg4 * local100.anInt1513) / (arg1 * local100.anInt1510);
				this.anIntArray263[local1] = Static84.method1318(local25, local122, 0);
			} else if ((this.anIntArray266[local1] & 0x1) == 0) {
				local25 = this.anIntArray260[local1];
				@Pc(148) int local148 = this.anIntArray266[local1];
				local30 = this.aClass37Array2[local7];
				local52 = arg0 + (arg2 * local30.anInt1504 + arg3 * local30.anInt1507 + arg4 * local30.anInt1513) / (arg1 * local30.anInt1510);
				this.anIntArray252[local1] = Static84.method1318(local25, local52, local148);
				local30 = this.aClass37Array2[local12];
				local52 = arg0 + (arg2 * local30.anInt1504 + arg3 * local30.anInt1507 + arg4 * local30.anInt1513) / (arg1 * local30.anInt1510);
				this.anIntArray254[local1] = Static84.method1318(local25, local52, local148);
				local30 = this.aClass37Array2[local17];
				local52 = arg0 + (arg2 * local30.anInt1504 + arg3 * local30.anInt1507 + arg4 * local30.anInt1513) / (arg1 * local30.anInt1510);
				this.anIntArray263[local1] = Static84.method1318(local25, local52, local148);
			}
		}
		this.aClass37Array2 = null;
		this.aClass37Array1 = null;
		this.anIntArray261 = null;
		this.anIntArray255 = null;
		if (this.anIntArray266 != null) {
			for (local7 = 0; local7 < this.anInt2260; local7++) {
				if ((this.anIntArray266[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray260 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!hd;I)V")
	public void method1334(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray18 == null || arg1 == -1) {
			return;
		}
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		@Pc(18) Class39 local18 = arg0.aClass39Array1[arg1];
		@Pc(21) Class10_Sub6 local21 = local18.aClass10_Sub6_1;
		Static84.anInt2273 = 0;
		Static84.anInt2269 = 0;
		Static84.anInt2271 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt1571; local29++) {
			@Pc(35) int local35 = local18.anIntArray174[local29];
			this.method1339(local21.anIntArray103[local35], local21.anIntArrayArray8[local35], local18.anIntArray177[local29], local18.anIntArray181[local29], local18.anIntArray178[local29]);
		}
	}

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "()I")
	public int method1336() {
		this.method1338();
		return this.anInt2266;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(Z)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method1337(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static84.anIntArray268.length < this.anInt2260) {
			Static84.anIntArray268 = new int[this.anInt2260 + 100];
		}
		return this.method1319(arg0, Static84.aClass10_Sub1_Sub5_Sub4_2, Static84.anIntArray268);
	}

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "()V")
	public void method1338() {
		if (this.anInt2259 == 1) {
			return;
		}
		this.anInt2259 = 1;
		super.anInt2674 = 0;
		this.anInt2267 = 0;
		this.anInt2266 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2261; local18++) {
			@Pc(24) int local24 = this.anIntArray256[local18];
			@Pc(29) int local29 = this.anIntArray265[local18];
			@Pc(34) int local34 = this.anIntArray259[local18];
			if (-local29 > super.anInt2674) {
				super.anInt2674 = -local29;
			}
			if (local29 > this.anInt2267) {
				this.anInt2267 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2266) {
				this.anInt2266 = local58;
			}
		}
		this.anInt2266 = (int) (Math.sqrt((double) this.anInt2266) + 0.99D);
		this.anInt2257 = (int) (Math.sqrt((double) (this.anInt2266 * this.anInt2266 + super.anInt2674 * super.anInt2674)) + 0.99D);
		this.anInt2262 = this.anInt2257 + (int) (Math.sqrt((double) (this.anInt2266 * this.anInt2266 + this.anInt2267 * this.anInt2267)) + 0.99D);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[IIII)V")
	private void method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static84.anInt2273 = 0;
			Static84.anInt2269 = 0;
			Static84.anInt2271 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray18.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray18[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static84.anInt2273 += this.anIntArray256[local36];
						Static84.anInt2269 += this.anIntArray265[local36];
						Static84.anInt2271 += this.anIntArray259[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static84.anInt2273 = Static84.anInt2273 / local6 + arg2;
				Static84.anInt2269 = Static84.anInt2269 / local6 + arg3;
				Static84.anInt2271 = Static84.anInt2271 / local6 + arg4;
			} else {
				Static84.anInt2273 = arg2;
				Static84.anInt2269 = arg3;
				Static84.anInt2271 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray18.length) {
					local115 = this.anIntArrayArray18[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray256[local31] += arg2;
						this.anIntArray265[local31] += arg3;
						this.anIntArray259[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray18.length) {
					local115 = this.anIntArrayArray18[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray256[local31] -= Static84.anInt2273;
						this.anIntArray265[local31] -= Static84.anInt2269;
						this.anIntArray259[local31] -= Static84.anInt2271;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static84.anIntArray280[local225];
							local235 = Static84.anIntArray281[local225];
							local251 = this.anIntArray265[local31] * local231 + this.anIntArray256[local31] * local235 >> 16;
							this.anIntArray265[local31] = this.anIntArray265[local31] * local235 - this.anIntArray256[local31] * local231 >> 16;
							this.anIntArray256[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static84.anIntArray280[local36];
							local235 = Static84.anIntArray281[local36];
							local251 = this.anIntArray265[local31] * local235 - this.anIntArray259[local31] * local231 >> 16;
							this.anIntArray259[local31] = this.anIntArray265[local31] * local231 + this.anIntArray259[local31] * local235 >> 16;
							this.anIntArray265[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static84.anIntArray280[local219];
							local235 = Static84.anIntArray281[local219];
							local251 = this.anIntArray259[local31] * local231 + this.anIntArray256[local31] * local235 >> 16;
							this.anIntArray259[local31] = this.anIntArray259[local31] * local235 - this.anIntArray256[local31] * local231 >> 16;
							this.anIntArray256[local31] = local251;
						}
						this.anIntArray256[local31] += Static84.anInt2273;
						this.anIntArray265[local31] += Static84.anInt2269;
						this.anIntArray259[local31] += Static84.anInt2271;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray18.length) {
					local115 = this.anIntArrayArray18[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray256[local31] -= Static84.anInt2273;
						this.anIntArray265[local31] -= Static84.anInt2269;
						this.anIntArray259[local31] -= Static84.anInt2271;
						this.anIntArray256[local31] = this.anIntArray256[local31] * arg2 / 128;
						this.anIntArray265[local31] = this.anIntArray265[local31] * arg3 / 128;
						this.anIntArray259[local31] = this.anIntArray259[local31] * arg4 / 128;
						this.anIntArray256[local31] += Static84.anInt2273;
						this.anIntArray265[local31] += Static84.anInt2269;
						this.anIntArray259[local31] += Static84.anInt2271;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray17 != null && this.anIntArray262 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray17.length) {
					local115 = this.anIntArrayArray17[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray262[local31] += arg2 * 8;
						if (this.anIntArray262[local31] < 0) {
							this.anIntArray262[local31] = 0;
						}
						if (this.anIntArray262[local31] > 255) {
							this.anIntArray262[local31] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
	public void method1340(@OriginalArg(0) int arg0) {
		this.aClass37Array2 = null;
		this.anInt2259 = 0;
		@Pc(9) int local9 = Static84.anIntArray280[arg0];
		@Pc(13) int local13 = Static84.anIntArray281[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2261; local15++) {
			@Pc(32) int local32 = this.anIntArray265[local15] * local13 - this.anIntArray259[local15] * local9 >> 16;
			this.anIntArray259[local15] = this.anIntArray265[local15] * local9 + this.anIntArray259[local15] * local13 >> 16;
			this.anIntArray265[local15] = local32;
		}
	}
}
