import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class1_Sub1_Sub2_Sub7 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!na", name = "qb", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!na", name = "rb", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!na", name = "sb", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!na", name = "tb", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!na", name = "vb", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!na", name = "wb", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!na", name = "xb", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!na", name = "zb", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!na", name = "Ab", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!na", name = "Bb", descriptor = "I")
	private int anInt1976;

	@OriginalMember(owner = "client!na", name = "Cb", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!na", name = "Eb", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!na", name = "Fb", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!na", name = "Gb", descriptor = "I")
	private int anInt1978;

	@OriginalMember(owner = "client!na", name = "Hb", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!na", name = "Ib", descriptor = "I")
	private int anInt1979;

	@OriginalMember(owner = "client!na", name = "Jb", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!na", name = "Kb", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!na", name = "Lb", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!na", name = "Mb", descriptor = "I")
	private int anInt1980;

	@OriginalMember(owner = "client!na", name = "Nb", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!na", name = "Ob", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!na", name = "oc", descriptor = "I")
	private int anInt1987;

	@OriginalMember(owner = "client!na", name = "ub", descriptor = "I")
	public int anInt1974 = 0;

	@OriginalMember(owner = "client!na", name = "pb", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!na", name = "yb", descriptor = "I")
	public int anInt1975 = 0;

	@OriginalMember(owner = "client!na", name = "ob", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!na", name = "Db", descriptor = "I")
	public int anInt1977 = 0;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2_Sub7() {
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([Lclient!na;I)V")
	public Class1_Sub1_Sub2_Sub7(@OriginalArg(0) Class1_Sub1_Sub2_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt1974 = 0;
		this.anInt1975 = 0;
		this.anInt1977 = 0;
		this.aByte4 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class1_Sub1_Sub2_Sub7 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt1974 += local41.anInt1974;
				this.anInt1975 += local41.anInt1975;
				this.anInt1977 += local41.anInt1977;
				if (local41.aByteArray60 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local41.aByte4;
					}
					if (this.aByte4 != local41.aByte4) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray61 != null;
				local22 |= local41.aByteArray59 != null;
			}
		}
		this.anIntArray281 = new int[this.anInt1974];
		this.anIntArray283 = new int[this.anInt1974];
		this.anIntArray285 = new int[this.anInt1974];
		this.anIntArray288 = new int[this.anInt1975];
		this.anIntArray282 = new int[this.anInt1975];
		this.anIntArray287 = new int[this.anInt1975];
		this.anIntArray286 = new int[this.anInt1975];
		this.anIntArray279 = new int[this.anInt1975];
		this.anIntArray278 = new int[this.anInt1975];
		if (this.anInt1977 > 0) {
			this.anIntArray280 = new int[this.anInt1977];
			this.anIntArray284 = new int[this.anInt1977];
			this.anIntArray289 = new int[this.anInt1977];
		}
		if (local18) {
			this.aByteArray60 = new byte[this.anInt1975];
		}
		if (local20) {
			this.aByteArray61 = new byte[this.anInt1975];
		}
		if (local22) {
			this.aByteArray59 = new byte[this.anInt1975];
			this.aShortArray6 = new short[this.anInt1975];
		}
		this.anInt1974 = 0;
		this.anInt1975 = 0;
		this.anInt1977 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class1_Sub1_Sub2_Sub7 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt1974;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt1974; local221++) {
					this.anIntArray281[this.anInt1974] = local214.anIntArray281[local221];
					this.anIntArray283[this.anInt1974] = local214.anIntArray283[local221];
					this.anIntArray285[this.anInt1974] = local214.anIntArray285[local221];
					this.anInt1974++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt1975; local262++) {
					this.anIntArray288[this.anInt1975] = local214.anIntArray288[local262] + local219;
					this.anIntArray282[this.anInt1975] = local214.anIntArray282[local262] + local219;
					this.anIntArray287[this.anInt1975] = local214.anIntArray287[local262] + local219;
					this.anIntArray286[this.anInt1975] = local214.anIntArray286[local262];
					this.anIntArray279[this.anInt1975] = local214.anIntArray279[local262];
					this.anIntArray278[this.anInt1975] = local214.anIntArray278[local262];
					if (local18) {
						if (local214.aByteArray60 == null) {
							this.aByteArray60[this.anInt1975] = local214.aByte4;
						} else {
							this.aByteArray60[this.anInt1975] = local214.aByteArray60[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray61 == null) {
							this.aByteArray61[this.anInt1975] = 0;
						} else {
							this.aByteArray61[this.anInt1975] = local214.aByteArray61[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray59 == null || local214.aByteArray59[local262] == -1) {
							this.aByteArray59[this.anInt1975] = -1;
						} else {
							this.aByteArray59[this.anInt1975] = (byte) (local214.aByteArray59[local262] + local207);
							this.aShortArray6[this.anInt1975] = local214.aShortArray6[local262];
						}
					}
					this.anInt1975++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt1977; local418++) {
					this.anIntArray280[this.anInt1977] = local214.anIntArray280[local418] + local219;
					this.anIntArray284[this.anInt1977] = local214.anIntArray284[local418] + local219;
					this.anIntArray289[this.anInt1977] = local214.anIntArray289[local418] + local219;
					this.anInt1977++;
				}
				local207 += local214.anInt1977;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
	public int method1365() {
		this.method1371();
		return this.anInt1987;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
	public void method1366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static80.anIntArray291[0] = -1;
		if (this.anInt1976 != 2 && this.anInt1976 != 1) {
			this.method1377();
		}
		@Pc(15) int local15 = Static27.anInt952;
		@Pc(17) int local17 = Static27.anInt957;
		@Pc(21) int local21 = Static80.anIntArray299[0];
		@Pc(25) int local25 = Static80.anIntArray300[0];
		@Pc(29) int local29 = Static80.anIntArray299[arg0];
		@Pc(33) int local33 = Static80.anIntArray300[arg0];
		@Pc(37) int local37 = Static80.anIntArray299[arg1];
		@Pc(41) int local41 = Static80.anIntArray300[arg1];
		@Pc(45) int local45 = Static80.anIntArray299[arg2];
		@Pc(49) int local49 = Static80.anIntArray300[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1974; local61++) {
			@Pc(67) int local67 = this.anIntArray281[local61];
			@Pc(72) int local72 = this.anIntArray283[local61];
			@Pc(77) int local77 = this.anIntArray285[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static80.anIntArray295[local61] = local77 - local59;
			Static80.anIntArray294[local61] = local15 + (local67 << 9) / arg6;
			Static80.anIntArray297[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt1977 > 0) {
				Static80.anIntArray292[local61] = local67;
				Static80.anIntArray296[local61] = local89;
				Static80.anIntArray308[local61] = local77;
			}
		}
		try {
			this.method1368(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIII)V")
	private void method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static80.anInt1981 = 0;
			Static80.anInt1982 = 0;
			Static80.anInt1984 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray16.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray16[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static80.anInt1981 += this.anIntArray281[local36];
						Static80.anInt1982 += this.anIntArray283[local36];
						Static80.anInt1984 += this.anIntArray285[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static80.anInt1981 = Static80.anInt1981 / local6 + arg2;
				Static80.anInt1982 = Static80.anInt1982 / local6 + arg3;
				Static80.anInt1984 = Static80.anInt1984 / local6 + arg4;
			} else {
				Static80.anInt1981 = arg2;
				Static80.anInt1982 = arg3;
				Static80.anInt1984 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray16.length) {
					local115 = this.anIntArrayArray16[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray281[local31] += arg2;
						this.anIntArray283[local31] += arg3;
						this.anIntArray285[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray16.length) {
					local115 = this.anIntArrayArray16[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray281[local31] -= Static80.anInt1981;
						this.anIntArray283[local31] -= Static80.anInt1982;
						this.anIntArray285[local31] -= Static80.anInt1984;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static80.anIntArray299[local225];
							local235 = Static80.anIntArray300[local225];
							local251 = this.anIntArray283[local31] * local231 + this.anIntArray281[local31] * local235 >> 16;
							this.anIntArray283[local31] = this.anIntArray283[local31] * local235 - this.anIntArray281[local31] * local231 >> 16;
							this.anIntArray281[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static80.anIntArray299[local36];
							local235 = Static80.anIntArray300[local36];
							local251 = this.anIntArray283[local31] * local235 - this.anIntArray285[local31] * local231 >> 16;
							this.anIntArray285[local31] = this.anIntArray283[local31] * local231 + this.anIntArray285[local31] * local235 >> 16;
							this.anIntArray283[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static80.anIntArray299[local219];
							local235 = Static80.anIntArray300[local219];
							local251 = this.anIntArray285[local31] * local231 + this.anIntArray281[local31] * local235 >> 16;
							this.anIntArray285[local31] = this.anIntArray285[local31] * local235 - this.anIntArray281[local31] * local231 >> 16;
							this.anIntArray281[local31] = local251;
						}
						this.anIntArray281[local31] += Static80.anInt1981;
						this.anIntArray283[local31] += Static80.anInt1982;
						this.anIntArray285[local31] += Static80.anInt1984;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray16.length) {
					local115 = this.anIntArrayArray16[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray281[local31] -= Static80.anInt1981;
						this.anIntArray283[local31] -= Static80.anInt1982;
						this.anIntArray285[local31] -= Static80.anInt1984;
						this.anIntArray281[local31] = this.anIntArray281[local31] * arg2 / 128;
						this.anIntArray283[local31] = this.anIntArray283[local31] * arg3 / 128;
						this.anIntArray285[local31] = this.anIntArray285[local31] * arg4 / 128;
						this.anIntArray281[local31] += Static80.anInt1981;
						this.anIntArray283[local31] += Static80.anInt1982;
						this.anIntArray285[local31] += Static80.anInt1984;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray17 != null && this.aByteArray61 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray17.length) {
					local115 = this.anIntArrayArray17[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray61[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray61[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZI)V")
	private void method1368(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1978 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1978; local6++) {
			Static80.anIntArray291[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1975; local18++) {
			if (this.anIntArray278[local18] != -2) {
				local30 = this.anIntArray288[local18];
				local35 = this.anIntArray282[local18];
				local40 = this.anIntArray287[local18];
				local44 = Static80.anIntArray294[local30];
				local48 = Static80.anIntArray294[local35];
				local52 = Static80.anIntArray294[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static80.anIntArray292[local30];
					local71 = Static80.anIntArray292[local35];
					@Pc(75) int local75 = Static80.anIntArray292[local40];
					@Pc(79) int local79 = Static80.anIntArray296[local30];
					local83 = Static80.anIntArray296[local35];
					local87 = Static80.anIntArray296[local40];
					@Pc(91) int local91 = Static80.anIntArray308[local30];
					local95 = Static80.anIntArray308[local35];
					@Pc(99) int local99 = Static80.anIntArray308[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static80.aBooleanArray10[local18] = true;
						@Pc(180) int local180 = (Static80.anIntArray295[local30] + Static80.anIntArray295[local35] + Static80.anIntArray295[local40]) / 3 + this.anInt1979;
						Static80.anIntArrayArray19[local180][Static80.anIntArray291[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1370(Static80.anInt1986, Static80.anInt1985, Static80.anIntArray297[local30], Static80.anIntArray297[local35], Static80.anIntArray297[local40], local44, local48, local52)) {
						Static80.anIntArray307[Static80.anInt1983++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static80.anIntArray297[local40] - Static80.anIntArray297[local35]) - (Static80.anIntArray297[local30] - Static80.anIntArray297[local35]) * (local52 - local48) > 0) {
						Static80.aBooleanArray10[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static27.anInt953 && local48 <= Static27.anInt953 && local52 <= Static27.anInt953) {
							Static80.aBooleanArray9[local18] = false;
						} else {
							Static80.aBooleanArray9[local18] = true;
						}
						local67 = (Static80.anIntArray295[local30] + Static80.anIntArray295[local35] + Static80.anIntArray295[local40]) / 3 + this.anInt1979;
						Static80.anIntArrayArray19[local67][Static80.anIntArray291[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray60 == null) {
			for (local30 = this.anInt1978 - 1; local30 >= 0; local30--) {
				local35 = Static80.anIntArray291[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static80.anIntArrayArray19[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1369(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static80.anIntArray305[local30] = 0;
			Static80.anIntArray302[local30] = 0;
		}
		for (local35 = this.anInt1978 - 1; local35 >= 0; local35--) {
			local40 = Static80.anIntArray291[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static80.anIntArrayArray19[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray60[local52];
					local71 = Static80.anIntArray305[local388]++;
					Static80.anIntArrayArray18[local388][local71] = local52;
					if (local388 < 10) {
						Static80.anIntArray302[local388] += local35;
					} else if (local388 == 10) {
						Static80.anIntArray306[local71] = local35;
					} else {
						Static80.anIntArray304[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static80.anIntArray305[1] > 0 || Static80.anIntArray305[2] > 0) {
			local40 = (Static80.anIntArray302[1] + Static80.anIntArray302[2]) / (Static80.anIntArray305[1] + Static80.anIntArray305[2]);
		}
		local44 = 0;
		if (Static80.anIntArray305[3] > 0 || Static80.anIntArray305[4] > 0) {
			local44 = (Static80.anIntArray302[3] + Static80.anIntArray302[4]) / (Static80.anIntArray305[3] + Static80.anIntArray305[4]);
		}
		local48 = 0;
		if (Static80.anIntArray305[6] > 0 || Static80.anIntArray305[8] > 0) {
			local48 = (Static80.anIntArray302[6] + Static80.anIntArray302[8]) / (Static80.anIntArray305[6] + Static80.anIntArray305[8]);
		}
		local67 = 0;
		local71 = Static80.anIntArray305[10];
		@Pc(521) int[] local521 = Static80.anIntArrayArray18[10];
		@Pc(523) int[] local523 = Static80.anIntArray306;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static80.anIntArray305[11];
			local521 = Static80.anIntArrayArray18[11];
			local523 = Static80.anIntArray304;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1369(local521[local67++]);
				if (local67 == local71 && local521 != Static80.anIntArrayArray18[11]) {
					local67 = 0;
					local71 = Static80.anIntArray305[11];
					local521 = Static80.anIntArrayArray18[11];
					local523 = Static80.anIntArray304;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1369(local521[local67++]);
				if (local67 == local71 && local521 != Static80.anIntArrayArray18[11]) {
					local67 = 0;
					local71 = Static80.anIntArray305[11];
					local521 = Static80.anIntArrayArray18[11];
					local523 = Static80.anIntArray304;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1369(local521[local67++]);
				if (local67 == local71 && local521 != Static80.anIntArrayArray18[11]) {
					local67 = 0;
					local71 = Static80.anIntArray305[11];
					local521 = Static80.anIntArrayArray18[11];
					local523 = Static80.anIntArray304;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static80.anIntArray305[local83];
			@Pc(686) int[] local686 = Static80.anIntArrayArray18[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1369(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1369(local521[local67++]);
			if (local67 == local71 && local521 != Static80.anIntArrayArray18[11]) {
				local67 = 0;
				local521 = Static80.anIntArrayArray18[11];
				local71 = Static80.anIntArray305[11];
				local523 = Static80.anIntArray304;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	private void method1369(@OriginalArg(0) int arg0) {
		if (Static80.aBooleanArray10[arg0]) {
			this.method1381(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray288[arg0];
		@Pc(17) int local17 = this.anIntArray282[arg0];
		@Pc(22) int local22 = this.anIntArray287[arg0];
		Static27.aBoolean82 = Static80.aBooleanArray9[arg0];
		if (this.aByteArray61 == null) {
			Static27.anInt958 = 0;
		} else {
			Static27.anInt958 = this.aByteArray61[arg0] & 0xFF;
		}
		if (this.aByteArray59 != null && this.aByteArray59[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray59[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray280[local119];
			@Pc(129) int local129 = this.anIntArray284[local119];
			@Pc(134) int local134 = this.anIntArray289[local119];
			if (this.anIntArray278[arg0] == -1) {
				Static27.method568(Static80.anIntArray297[local12], Static80.anIntArray297[local17], Static80.anIntArray297[local22], Static80.anIntArray294[local12], Static80.anIntArray294[local17], Static80.anIntArray294[local22], this.anIntArray286[arg0], this.anIntArray286[arg0], this.anIntArray286[arg0], Static80.anIntArray292[local124], Static80.anIntArray292[local129], Static80.anIntArray292[local134], Static80.anIntArray296[local124], Static80.anIntArray296[local129], Static80.anIntArray296[local134], Static80.anIntArray308[local124], Static80.anIntArray308[local129], Static80.anIntArray308[local134], this.aShortArray6[arg0]);
			} else {
				Static27.method568(Static80.anIntArray297[local12], Static80.anIntArray297[local17], Static80.anIntArray297[local22], Static80.anIntArray294[local12], Static80.anIntArray294[local17], Static80.anIntArray294[local22], this.anIntArray286[arg0], this.anIntArray279[arg0], this.anIntArray278[arg0], Static80.anIntArray292[local124], Static80.anIntArray292[local129], Static80.anIntArray292[local134], Static80.anIntArray296[local124], Static80.anIntArray296[local129], Static80.anIntArray296[local134], Static80.anIntArray308[local124], Static80.anIntArray308[local129], Static80.anIntArray308[local134], this.aShortArray6[arg0]);
			}
		} else if (this.anIntArray278[arg0] == -1) {
			Static27.method571(Static80.anIntArray297[local12], Static80.anIntArray297[local17], Static80.anIntArray297[local22], Static80.anIntArray294[local12], Static80.anIntArray294[local17], Static80.anIntArray294[local22], Static80.anIntArray293[this.anIntArray286[arg0]]);
		} else {
			Static27.method563(Static80.anIntArray297[local12], Static80.anIntArray297[local17], Static80.anIntArray297[local22], Static80.anIntArray294[local12], Static80.anIntArray294[local17], Static80.anIntArray294[local22], this.anIntArray286[arg0], this.anIntArray279[arg0], this.anIntArray278[arg0]);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static80.anIntArray291[0] = -1;
		if (this.anInt1976 != 1) {
			this.method1371();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt1987 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt1987 << 9;
		if (local64 / local40 >= Static27.anInt959) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt1987 << 9;
		if (local77 / local40 <= Static27.anInt960) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt1987 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static27.anInt954) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2467 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static27.anInt956) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2467 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt1977 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static80.aBoolean163) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static80.anInt1986 - Static27.anInt952;
			local223 = Static80.anInt1985 - Static27.anInt957;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean162) {
					Static80.anIntArray307[Static80.anInt1983++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static27.anInt952;
		local219 = Static27.anInt957;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static80.anIntArray299[arg0];
			local257 = Static80.anIntArray300[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt1974; local269++) {
			@Pc(275) int local275 = this.anIntArray281[local269];
			@Pc(280) int local280 = this.anIntArray283[local269];
			@Pc(285) int local285 = this.anIntArray285[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static80.anIntArray295[local269] = local285 - local29;
			if (local285 >= 50) {
				Static80.anIntArray294[local269] = local172 + (local275 << 9) / local285;
				Static80.anIntArray297[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static80.anIntArray294[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static80.anIntArray292[local269] = local275;
				Static80.anIntArray296[local269] = local297;
				Static80.anIntArray308[local269] = local285;
			}
		}
		try {
			this.method1368(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
	public void method1371() {
		if (this.anInt1976 == 1) {
			return;
		}
		this.anInt1976 = 1;
		super.anInt2467 = 0;
		this.anInt1980 = 0;
		this.anInt1987 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1974; local18++) {
			@Pc(24) int local24 = this.anIntArray281[local18];
			@Pc(29) int local29 = this.anIntArray283[local18];
			@Pc(34) int local34 = this.anIntArray285[local18];
			if (-local29 > super.anInt2467) {
				super.anInt2467 = -local29;
			}
			if (local29 > this.anInt1980) {
				this.anInt1980 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1987) {
				this.anInt1987 = local58;
			}
		}
		this.anInt1987 = (int) (Math.sqrt((double) this.anInt1987) + 0.99D);
		this.anInt1979 = (int) (Math.sqrt((double) (this.anInt1987 * this.anInt1987 + super.anInt2467 * super.anInt2467)) + 0.99D);
		this.anInt1978 = this.anInt1979 + (int) (Math.sqrt((double) (this.anInt1987 * this.anInt1987 + this.anInt1980 * this.anInt1980)) + 0.99D);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	public void method1372() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1974; local1++) {
			this.anIntArray281[local1] = -this.anIntArray281[local1];
			this.anIntArray285[local1] = -this.anIntArray285[local1];
		}
		this.anInt1976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!na;[B)Lclient!na;")
	private Class1_Sub1_Sub2_Sub7 method1373(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub7 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1974 = this.anInt1974;
		arg1.anInt1975 = this.anInt1975;
		arg1.anInt1977 = this.anInt1977;
		if (arg1.anIntArray281 == null || arg1.anIntArray281.length < this.anInt1974) {
			arg1.anIntArray281 = new int[this.anInt1974 + 100];
			arg1.anIntArray283 = new int[this.anInt1974 + 100];
			arg1.anIntArray285 = new int[this.anInt1974 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1974; local43++) {
			arg1.anIntArray281[local43] = this.anIntArray281[local43];
			arg1.anIntArray283[local43] = this.anIntArray283[local43];
			arg1.anIntArray285[local43] = this.anIntArray285[local43];
		}
		if (arg0) {
			arg1.aByteArray61 = this.aByteArray61;
		} else {
			arg1.aByteArray61 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray61 == null) {
				for (local88 = 0; local88 < this.anInt1975; local88++) {
					arg1.aByteArray61[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1975; local88++) {
					arg1.aByteArray61[local88] = this.aByteArray61[local88];
				}
			}
		}
		arg1.anIntArray288 = this.anIntArray288;
		arg1.anIntArray282 = this.anIntArray282;
		arg1.anIntArray287 = this.anIntArray287;
		arg1.anIntArray286 = this.anIntArray286;
		arg1.anIntArray279 = this.anIntArray279;
		arg1.anIntArray278 = this.anIntArray278;
		arg1.aByteArray60 = this.aByteArray60;
		arg1.aByteArray59 = this.aByteArray59;
		arg1.aShortArray6 = this.aShortArray6;
		arg1.aByte4 = this.aByte4;
		arg1.anIntArray280 = this.anIntArray280;
		arg1.anIntArray284 = this.anIntArray284;
		arg1.anIntArray289 = this.anIntArray289;
		arg1.anIntArrayArray16 = this.anIntArrayArray16;
		arg1.anIntArrayArray17 = this.anIntArrayArray17;
		arg1.aBoolean162 = this.aBoolean162;
		arg1.anInt1976 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
	public void method1374() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1974; local1++) {
			@Pc(7) int local7 = this.anIntArray281[local1];
			this.anIntArray281[local1] = this.anIntArray285[local1];
			this.anIntArray285[local1] = -local7;
		}
		this.anInt1976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZ)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub1_Sub2_Sub7 local16;
		if (arg4) {
			local16 = new Class1_Sub1_Sub2_Sub7();
			local16.anInt1974 = this.anInt1974;
			local16.anInt1975 = this.anInt1975;
			local16.anInt1977 = this.anInt1977;
			local16.anIntArray281 = this.anIntArray281;
			local16.anIntArray285 = this.anIntArray285;
			local16.anIntArray288 = this.anIntArray288;
			local16.anIntArray282 = this.anIntArray282;
			local16.anIntArray287 = this.anIntArray287;
			local16.anIntArray286 = this.anIntArray286;
			local16.anIntArray279 = this.anIntArray279;
			local16.anIntArray278 = this.anIntArray278;
			local16.aByteArray60 = this.aByteArray60;
			local16.aByteArray61 = this.aByteArray61;
			local16.aByteArray59 = this.aByteArray59;
			local16.aShortArray6 = this.aShortArray6;
			local16.aByte4 = this.aByte4;
			local16.anIntArray280 = this.anIntArray280;
			local16.anIntArray284 = this.anIntArray284;
			local16.anIntArray289 = this.anIntArray289;
			local16.anIntArrayArray16 = this.anIntArrayArray16;
			local16.anIntArrayArray17 = this.anIntArrayArray17;
			local16.aBoolean162 = this.aBoolean162;
			local16.anIntArray283 = new int[local16.anInt1974];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt1974; local124++) {
			@Pc(130) int local130 = this.anIntArray281[local124];
			@Pc(135) int local135 = this.anIntArray283[local124];
			@Pc(140) int local140 = this.anIntArray285[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray283[local124] = local135 + local176 - local122;
		}
		local16.anInt1976 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public void method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1974; local1++) {
			this.anIntArray281[local1] += arg0;
			this.anIntArray283[local1] += arg1;
			this.anIntArray285[local1] += arg2;
		}
		this.anInt1976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
	private void method1377() {
		if (this.anInt1976 == 2) {
			return;
		}
		this.anInt1976 = 2;
		this.anInt1987 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1974; local12++) {
			@Pc(18) int local18 = this.anIntArray281[local12];
			@Pc(23) int local23 = this.anIntArray283[local12];
			@Pc(28) int local28 = this.anIntArray285[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1987) {
				this.anInt1987 = local40;
			}
		}
		this.anInt1987 = (int) (Math.sqrt((double) this.anInt1987) + 0.99D);
		this.anInt1979 = this.anInt1987;
		this.anInt1978 = this.anInt1987 + this.anInt1987;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	public void method1378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static80.anIntArray291[0] = -1;
		if (this.anInt1976 != 2 && this.anInt1976 != 1) {
			this.method1377();
		}
		@Pc(15) int local15 = Static27.anInt952;
		@Pc(17) int local17 = Static27.anInt957;
		@Pc(21) int local21 = Static80.anIntArray299[0];
		@Pc(25) int local25 = Static80.anIntArray300[0];
		@Pc(29) int local29 = Static80.anIntArray299[arg0];
		@Pc(33) int local33 = Static80.anIntArray300[arg0];
		@Pc(37) int local37 = Static80.anIntArray299[arg1];
		@Pc(41) int local41 = Static80.anIntArray300[arg1];
		@Pc(45) int local45 = Static80.anIntArray299[arg2];
		@Pc(49) int local49 = Static80.anIntArray300[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1974; local61++) {
			@Pc(67) int local67 = this.anIntArray281[local61];
			@Pc(72) int local72 = this.anIntArray283[local61];
			@Pc(77) int local77 = this.anIntArray285[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static80.anIntArray295[local61] = local77 - local59;
			Static80.anIntArray294[local61] = local15 + (local67 << 9) / local77;
			Static80.anIntArray297[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt1977 > 0) {
				Static80.anIntArray292[local61] = local67;
				Static80.anIntArray296[local61] = local89;
				Static80.anIntArray308[local61] = local77;
			}
		}
		try {
			this.method1368(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method1379(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static80.aByteArray63.length < this.anInt1975) {
			Static80.aByteArray63 = new byte[this.anInt1975 + 100];
		}
		return this.method1373(arg0, Static80.aClass1_Sub1_Sub2_Sub7_2, Static80.aByteArray63);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Z)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method1380(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static80.aByteArray62.length < this.anInt1975) {
			Static80.aByteArray62 = new byte[this.anInt1975 + 100];
		}
		return this.method1373(arg0, Static80.aClass1_Sub1_Sub2_Sub7_1, Static80.aByteArray62);
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
	private void method1381(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static27.anInt952;
		@Pc(3) int local3 = Static27.anInt957;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray288[arg0];
		@Pc(15) int local15 = this.anIntArray282[arg0];
		@Pc(20) int local20 = this.anIntArray287[arg0];
		@Pc(24) int local24 = Static80.anIntArray308[local10];
		@Pc(28) int local28 = Static80.anIntArray308[local15];
		@Pc(32) int local32 = Static80.anIntArray308[local20];
		if (this.aByteArray61 == null) {
			Static27.anInt958 = 0;
		} else {
			Static27.anInt958 = this.aByteArray61[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static80.anIntArray301[0] = Static80.anIntArray294[local10];
			Static80.anIntArray298[0] = Static80.anIntArray297[local10];
			local5++;
			Static80.anIntArray303[0] = this.anIntArray286[arg0];
		} else {
			local73 = Static80.anIntArray292[local10];
			local77 = Static80.anIntArray296[local10];
			local82 = this.anIntArray286[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static80.anIntArray290[local32 - local24];
				Static80.anIntArray301[0] = local1 + (local73 + ((Static80.anIntArray292[local20] - local73) * local95 >> 16) << 9) / 50;
				Static80.anIntArray298[0] = local3 + (local77 + ((Static80.anIntArray296[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static80.anIntArray303[0] = local82 + ((this.anIntArray278[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static80.anIntArray290[local28 - local24];
				Static80.anIntArray301[local5] = local1 + (local73 + ((Static80.anIntArray292[local15] - local73) * local95 >> 16) << 9) / 50;
				Static80.anIntArray298[local5] = local3 + (local77 + ((Static80.anIntArray296[local15] - local77) * local95 >> 16) << 9) / 50;
				Static80.anIntArray303[local5++] = local82 + ((this.anIntArray279[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static80.anIntArray301[local5] = Static80.anIntArray294[local15];
			Static80.anIntArray298[local5] = Static80.anIntArray297[local15];
			Static80.anIntArray303[local5++] = this.anIntArray279[arg0];
		} else {
			local73 = Static80.anIntArray292[local15];
			local77 = Static80.anIntArray296[local15];
			local82 = this.anIntArray279[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static80.anIntArray290[local24 - local28];
				Static80.anIntArray301[local5] = local1 + (local73 + ((Static80.anIntArray292[local10] - local73) * local95 >> 16) << 9) / 50;
				Static80.anIntArray298[local5] = local3 + (local77 + ((Static80.anIntArray296[local10] - local77) * local95 >> 16) << 9) / 50;
				Static80.anIntArray303[local5++] = local82 + ((this.anIntArray286[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static80.anIntArray290[local32 - local28];
				Static80.anIntArray301[local5] = local1 + (local73 + ((Static80.anIntArray292[local20] - local73) * local95 >> 16) << 9) / 50;
				Static80.anIntArray298[local5] = local3 + (local77 + ((Static80.anIntArray296[local20] - local77) * local95 >> 16) << 9) / 50;
				Static80.anIntArray303[local5++] = local82 + ((this.anIntArray278[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static80.anIntArray301[local5] = Static80.anIntArray294[local20];
			Static80.anIntArray298[local5] = Static80.anIntArray297[local20];
			Static80.anIntArray303[local5++] = this.anIntArray278[arg0];
		} else {
			local73 = Static80.anIntArray292[local20];
			local77 = Static80.anIntArray296[local20];
			local82 = this.anIntArray278[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static80.anIntArray290[local28 - local32];
				Static80.anIntArray301[local5] = local1 + (local73 + ((Static80.anIntArray292[local15] - local73) * local95 >> 16) << 9) / 50;
				Static80.anIntArray298[local5] = local3 + (local77 + ((Static80.anIntArray296[local15] - local77) * local95 >> 16) << 9) / 50;
				Static80.anIntArray303[local5++] = local82 + ((this.anIntArray279[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static80.anIntArray290[local24 - local32];
				Static80.anIntArray301[local5] = local1 + (local73 + ((Static80.anIntArray292[local10] - local73) * local95 >> 16) << 9) / 50;
				Static80.anIntArray298[local5] = local3 + (local77 + ((Static80.anIntArray296[local10] - local77) * local95 >> 16) << 9) / 50;
				Static80.anIntArray303[local5++] = local82 + ((this.anIntArray286[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static80.anIntArray301[0];
		local77 = Static80.anIntArray301[1];
		local82 = Static80.anIntArray301[2];
		local95 = Static80.anIntArray298[0];
		@Pc(590) int local590 = Static80.anIntArray298[1];
		@Pc(594) int local594 = Static80.anIntArray298[2];
		Static27.aBoolean82 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static27.anInt953 || local77 > Static27.anInt953 || local82 > Static27.anInt953) {
				Static27.aBoolean82 = true;
			}
			if (this.aByteArray59 != null && this.aByteArray59[arg0] != -1) {
				local669 = this.aByteArray59[arg0] & 0xFF;
				local674 = this.anIntArray280[local669];
				local679 = this.anIntArray284[local669];
				local684 = this.anIntArray289[local669];
				if (this.anIntArray278[arg0] == -1) {
					Static27.method568(local95, local590, local594, local73, local77, local82, this.anIntArray286[arg0], this.anIntArray286[arg0], this.anIntArray286[arg0], Static80.anIntArray292[local674], Static80.anIntArray292[local679], Static80.anIntArray292[local684], Static80.anIntArray296[local674], Static80.anIntArray296[local679], Static80.anIntArray296[local684], Static80.anIntArray308[local674], Static80.anIntArray308[local679], Static80.anIntArray308[local684], this.aShortArray6[arg0]);
				} else {
					Static27.method568(local95, local590, local594, local73, local77, local82, Static80.anIntArray303[0], Static80.anIntArray303[1], Static80.anIntArray303[2], Static80.anIntArray292[local674], Static80.anIntArray292[local679], Static80.anIntArray292[local684], Static80.anIntArray296[local674], Static80.anIntArray296[local679], Static80.anIntArray296[local684], Static80.anIntArray308[local674], Static80.anIntArray308[local679], Static80.anIntArray308[local684], this.aShortArray6[arg0]);
				}
			} else if (this.anIntArray278[arg0] == -1) {
				Static27.method571(local95, local590, local594, local73, local77, local82, Static80.anIntArray293[this.anIntArray286[arg0]]);
			} else {
				Static27.method563(local95, local590, local594, local73, local77, local82, Static80.anIntArray303[0], Static80.anIntArray303[1], Static80.anIntArray303[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static27.anInt953 || local77 > Static27.anInt953 || local82 > Static27.anInt953 || Static80.anIntArray301[3] < 0 || Static80.anIntArray301[3] > Static27.anInt953) {
			Static27.aBoolean82 = true;
		}
		if (this.aByteArray59 == null || this.aByteArray59[arg0] == -1) {
			if (this.anIntArray278[arg0] == -1) {
				local669 = Static80.anIntArray293[this.anIntArray286[arg0]];
				Static27.method571(local95, local590, local594, local73, local77, local82, local669);
				Static27.method571(local95, local594, Static80.anIntArray298[3], local73, local82, Static80.anIntArray301[3], local669);
				return;
			}
			Static27.method563(local95, local590, local594, local73, local77, local82, Static80.anIntArray303[0], Static80.anIntArray303[1], Static80.anIntArray303[2]);
			Static27.method563(local95, local594, Static80.anIntArray298[3], local73, local82, Static80.anIntArray301[3], Static80.anIntArray303[0], Static80.anIntArray303[2], Static80.anIntArray303[3]);
			return;
		}
		local669 = this.aByteArray59[arg0] & 0xFF;
		local674 = this.anIntArray280[local669];
		local679 = this.anIntArray284[local669];
		local684 = this.anIntArray289[local669];
		@Pc(924) short local924 = this.aShortArray6[arg0];
		if (this.anIntArray278[arg0] == -1) {
			Static27.method568(local95, local590, local594, local73, local77, local82, this.anIntArray286[arg0], this.anIntArray286[arg0], this.anIntArray286[arg0], Static80.anIntArray292[local674], Static80.anIntArray292[local679], Static80.anIntArray292[local684], Static80.anIntArray296[local674], Static80.anIntArray296[local679], Static80.anIntArray296[local684], Static80.anIntArray308[local674], Static80.anIntArray308[local679], Static80.anIntArray308[local684], local924);
			Static27.method568(local95, local594, Static80.anIntArray298[3], local73, local82, Static80.anIntArray301[3], this.anIntArray286[arg0], this.anIntArray286[arg0], this.anIntArray286[arg0], Static80.anIntArray292[local674], Static80.anIntArray292[local679], Static80.anIntArray292[local684], Static80.anIntArray296[local674], Static80.anIntArray296[local679], Static80.anIntArray296[local684], Static80.anIntArray308[local674], Static80.anIntArray308[local679], Static80.anIntArray308[local684], local924);
			return;
		}
		Static27.method568(local95, local590, local594, local73, local77, local82, Static80.anIntArray303[0], Static80.anIntArray303[1], Static80.anIntArray303[2], Static80.anIntArray292[local674], Static80.anIntArray292[local679], Static80.anIntArray292[local684], Static80.anIntArray296[local674], Static80.anIntArray296[local679], Static80.anIntArray296[local684], Static80.anIntArray308[local674], Static80.anIntArray308[local679], Static80.anIntArray308[local684], local924);
		Static27.method568(local95, local594, Static80.anIntArray298[3], local73, local82, Static80.anIntArray301[3], Static80.anIntArray303[0], Static80.anIntArray303[2], Static80.anIntArray303[3], Static80.anIntArray292[local674], Static80.anIntArray292[local679], Static80.anIntArray292[local684], Static80.anIntArray296[local674], Static80.anIntArray296[local679], Static80.anIntArray296[local684], Static80.anIntArray308[local674], Static80.anIntArray308[local679], Static80.anIntArray308[local684], local924);
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)V")
	public void method1382(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static80.anIntArray299[arg0];
		@Pc(7) int local7 = Static80.anIntArray300[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1974; local9++) {
			@Pc(26) int local26 = this.anIntArray283[local9] * local7 - this.anIntArray285[local9] * local3 >> 16;
			this.anIntArray285[local9] = this.anIntArray283[local9] * local3 + this.anIntArray285[local9] * local7 >> 16;
			this.anIntArray283[local9] = local26;
		}
		this.anInt1976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	public void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1974; local1++) {
			this.anIntArray281[local1] = this.anIntArray281[local1] * arg0 / 128;
			this.anIntArray283[local1] = this.anIntArray283[local1] * arg1 / 128;
			this.anIntArray285[local1] = this.anIntArray285[local1] * arg2 / 128;
		}
		this.anInt1976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!qd;I)V")
	public void method1384(@OriginalArg(0) Class1_Sub1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray16 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class65 local12 = arg0.aClass65Array1[arg1];
		@Pc(15) Class1_Sub13 local15 = local12.aClass1_Sub13_1;
		Static80.anInt1981 = 0;
		Static80.anInt1982 = 0;
		Static80.anInt1984 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2683; local23++) {
			@Pc(29) int local29 = local12.anIntArray412[local23];
			this.method1367(local15.anIntArray266[local29], local15.anIntArrayArray15[local29], local12.anIntArray407[local23], local12.anIntArray406[local23], local12.anIntArray408[local23]);
		}
		this.anInt1976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()V")
	public void method1385() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1974; local1++) {
			@Pc(7) int local7 = this.anIntArray285[local1];
			this.anIntArray285[local1] = this.anIntArray281[local1];
			this.anIntArray281[local1] = -local7;
		}
		this.anInt1976 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!qd;ILclient!qd;I[I)V")
	public void method1386(@OriginalArg(0) Class1_Sub1_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1384(arg0, arg1);
			return;
		}
		@Pc(18) Class65 local18 = arg0.aClass65Array1[arg1];
		@Pc(23) Class65 local23 = arg2.aClass65Array1[arg3];
		@Pc(26) Class1_Sub13 local26 = local18.aClass1_Sub13_1;
		Static80.anInt1981 = 0;
		Static80.anInt1982 = 0;
		Static80.anInt1984 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2683; local41++) {
			local47 = local18.anIntArray412[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray266[local47] == 0) {
				this.method1367(local26.anIntArray266[local47], local26.anIntArrayArray15[local47], local18.anIntArray407[local41], local18.anIntArray406[local41], local18.anIntArray408[local41]);
			}
		}
		Static80.anInt1981 = 0;
		Static80.anInt1982 = 0;
		Static80.anInt1984 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2683; local47++) {
			@Pc(112) int local112 = local23.anIntArray412[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray266[local112] == 0) {
				this.method1367(local26.anIntArray266[local112], local26.anIntArrayArray15[local112], local23.anIntArray407[local47], local23.anIntArray406[local47], local23.anIntArray408[local47]);
			}
		}
		this.anInt1976 = 0;
	}
}
