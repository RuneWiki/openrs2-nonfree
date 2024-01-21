import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub2_Sub2_Sub5 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!na", name = "mb", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!na", name = "ob", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!na", name = "qb", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!na", name = "tb", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!na", name = "ub", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!na", name = "vb", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!na", name = "wb", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!na", name = "xb", descriptor = "I")
	private int anInt1624;

	@OriginalMember(owner = "client!na", name = "yb", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!na", name = "zb", descriptor = "I")
	private int anInt1625;

	@OriginalMember(owner = "client!na", name = "Ab", descriptor = "I")
	private int anInt1626;

	@OriginalMember(owner = "client!na", name = "Bb", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!na", name = "Cb", descriptor = "I")
	private int anInt1627;

	@OriginalMember(owner = "client!na", name = "Fb", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!na", name = "Gb", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!na", name = "Hb", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!na", name = "Ib", descriptor = "I")
	private int anInt1630;

	@OriginalMember(owner = "client!na", name = "Jb", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!na", name = "Kb", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!na", name = "Lb", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!na", name = "Nb", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!na", name = "Ob", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!na", name = "Pb", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!na", name = "rb", descriptor = "I")
	public int anInt1623 = 0;

	@OriginalMember(owner = "client!na", name = "Eb", descriptor = "I")
	public int anInt1629 = 0;

	@OriginalMember(owner = "client!na", name = "Db", descriptor = "I")
	public int anInt1628 = 0;

	@OriginalMember(owner = "client!na", name = "sb", descriptor = "B")
	public byte aByte2 = 0;

	@OriginalMember(owner = "client!na", name = "pb", descriptor = "Z")
	public boolean aBoolean63 = false;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2_Sub5() {
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([Lclient!na;I)V")
	public Class2_Sub2_Sub2_Sub5(@OriginalArg(0) Class2_Sub2_Sub2_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt1628 = 0;
		this.anInt1629 = 0;
		this.anInt1623 = 0;
		this.aByte2 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class2_Sub2_Sub2_Sub5 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt1628 += local41.anInt1628;
				this.anInt1629 += local41.anInt1629;
				this.anInt1623 += local41.anInt1623;
				if (local41.aByteArray17 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local41.aByte2;
					}
					if (this.aByte2 != local41.aByte2) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray15 != null;
				local22 |= local41.aByteArray16 != null;
			}
		}
		this.anIntArray221 = new int[this.anInt1628];
		this.anIntArray222 = new int[this.anInt1628];
		this.anIntArray215 = new int[this.anInt1628];
		this.anIntArray223 = new int[this.anInt1629];
		this.anIntArray214 = new int[this.anInt1629];
		this.anIntArray218 = new int[this.anInt1629];
		this.anIntArray216 = new int[this.anInt1629];
		this.anIntArray213 = new int[this.anInt1629];
		this.anIntArray224 = new int[this.anInt1629];
		if (this.anInt1623 > 0) {
			this.anIntArray220 = new int[this.anInt1623];
			this.anIntArray217 = new int[this.anInt1623];
			this.anIntArray219 = new int[this.anInt1623];
		}
		if (local18) {
			this.aByteArray17 = new byte[this.anInt1629];
		}
		if (local20) {
			this.aByteArray15 = new byte[this.anInt1629];
		}
		if (local22) {
			this.aByteArray16 = new byte[this.anInt1629];
			this.aShortArray9 = new short[this.anInt1629];
		}
		this.anInt1628 = 0;
		this.anInt1629 = 0;
		this.anInt1623 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class2_Sub2_Sub2_Sub5 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt1628;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt1628; local221++) {
					this.anIntArray221[this.anInt1628] = local214.anIntArray221[local221];
					this.anIntArray222[this.anInt1628] = local214.anIntArray222[local221];
					this.anIntArray215[this.anInt1628] = local214.anIntArray215[local221];
					this.anInt1628++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt1629; local262++) {
					this.anIntArray223[this.anInt1629] = local214.anIntArray223[local262] + local219;
					this.anIntArray214[this.anInt1629] = local214.anIntArray214[local262] + local219;
					this.anIntArray218[this.anInt1629] = local214.anIntArray218[local262] + local219;
					this.anIntArray216[this.anInt1629] = local214.anIntArray216[local262];
					this.anIntArray213[this.anInt1629] = local214.anIntArray213[local262];
					this.anIntArray224[this.anInt1629] = local214.anIntArray224[local262];
					if (local18) {
						if (local214.aByteArray17 == null) {
							this.aByteArray17[this.anInt1629] = local214.aByte2;
						} else {
							this.aByteArray17[this.anInt1629] = local214.aByteArray17[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray15 == null) {
							this.aByteArray15[this.anInt1629] = 0;
						} else {
							this.aByteArray15[this.anInt1629] = local214.aByteArray15[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray16 == null || local214.aByteArray16[local262] == -1) {
							this.aByteArray16[this.anInt1629] = -1;
						} else {
							this.aByteArray16[this.anInt1629] = (byte) (local214.aByteArray16[local262] + local207);
							this.aShortArray9[this.anInt1629] = local214.aShortArray9[local262];
						}
					}
					this.anInt1629++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt1623; local418++) {
					this.anIntArray220[this.anInt1623] = local214.anIntArray220[local418] + local219;
					this.anIntArray217[this.anInt1623] = local214.anIntArray217[local418] + local219;
					this.anIntArray219[this.anInt1623] = local214.anIntArray219[local418] + local219;
					this.anInt1623++;
				}
				local207 += local214.anInt1623;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
	public void method1117() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1628; local1++) {
			@Pc(7) int local7 = this.anIntArray215[local1];
			this.anIntArray215[local1] = this.anIntArray221[local1];
			this.anIntArray221[local1] = -local7;
		}
		this.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1118(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static76.aByteArray18.length < this.anInt1629) {
			Static76.aByteArray18 = new byte[this.anInt1629 + 100];
		}
		return this.method1131(arg0, Static76.aClass2_Sub2_Sub2_Sub5_1, Static76.aByteArray18);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ua;I)V")
	public void method1119(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray14 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class73 local12 = arg0.aClass73Array1[arg1];
		@Pc(15) Class2_Sub7 local15 = local12.aClass2_Sub7_1;
		Static76.anInt1633 = 0;
		Static76.anInt1632 = 0;
		Static76.anInt1636 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2462; local23++) {
			@Pc(29) int local29 = local12.anIntArray358[local23];
			this.method1120(local15.anIntArray64[local29], local15.anIntArrayArray6[local29], local12.anIntArray355[local23], local12.anIntArray357[local23], local12.anIntArray360[local23]);
		}
		this.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIII)V")
	private void method1120(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static76.anInt1633 = 0;
			Static76.anInt1632 = 0;
			Static76.anInt1636 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray14.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray14[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static76.anInt1633 += this.anIntArray221[local36];
						Static76.anInt1632 += this.anIntArray222[local36];
						Static76.anInt1636 += this.anIntArray215[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static76.anInt1633 = Static76.anInt1633 / local6 + arg2;
				Static76.anInt1632 = Static76.anInt1632 / local6 + arg3;
				Static76.anInt1636 = Static76.anInt1636 / local6 + arg4;
			} else {
				Static76.anInt1633 = arg2;
				Static76.anInt1632 = arg3;
				Static76.anInt1636 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray14.length) {
					local115 = this.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray221[local31] += arg2;
						this.anIntArray222[local31] += arg3;
						this.anIntArray215[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray14.length) {
					local115 = this.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray221[local31] -= Static76.anInt1633;
						this.anIntArray222[local31] -= Static76.anInt1632;
						this.anIntArray215[local31] -= Static76.anInt1636;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static76.anIntArray236[local225];
							local235 = Static76.anIntArray226[local225];
							local251 = this.anIntArray222[local31] * local231 + this.anIntArray221[local31] * local235 >> 16;
							this.anIntArray222[local31] = this.anIntArray222[local31] * local235 - this.anIntArray221[local31] * local231 >> 16;
							this.anIntArray221[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static76.anIntArray236[local36];
							local235 = Static76.anIntArray226[local36];
							local251 = this.anIntArray222[local31] * local235 - this.anIntArray215[local31] * local231 >> 16;
							this.anIntArray215[local31] = this.anIntArray222[local31] * local231 + this.anIntArray215[local31] * local235 >> 16;
							this.anIntArray222[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static76.anIntArray236[local219];
							local235 = Static76.anIntArray226[local219];
							local251 = this.anIntArray215[local31] * local231 + this.anIntArray221[local31] * local235 >> 16;
							this.anIntArray215[local31] = this.anIntArray215[local31] * local235 - this.anIntArray221[local31] * local231 >> 16;
							this.anIntArray221[local31] = local251;
						}
						this.anIntArray221[local31] += Static76.anInt1633;
						this.anIntArray222[local31] += Static76.anInt1632;
						this.anIntArray215[local31] += Static76.anInt1636;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray14.length) {
					local115 = this.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray221[local31] -= Static76.anInt1633;
						this.anIntArray222[local31] -= Static76.anInt1632;
						this.anIntArray215[local31] -= Static76.anInt1636;
						this.anIntArray221[local31] = this.anIntArray221[local31] * arg2 / 128;
						this.anIntArray222[local31] = this.anIntArray222[local31] * arg3 / 128;
						this.anIntArray215[local31] = this.anIntArray215[local31] * arg4 / 128;
						this.anIntArray221[local31] += Static76.anInt1633;
						this.anIntArray222[local31] += Static76.anInt1632;
						this.anIntArray215[local31] += Static76.anInt1636;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray15 != null && this.aByteArray15 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray15.length) {
					local115 = this.anIntArrayArray15[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray15[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray15[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()V")
	private void method1121() {
		if (this.anInt1625 == 2) {
			return;
		}
		this.anInt1625 = 2;
		this.anInt1626 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1628; local12++) {
			@Pc(18) int local18 = this.anIntArray221[local12];
			@Pc(23) int local23 = this.anIntArray222[local12];
			@Pc(28) int local28 = this.anIntArray215[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1626) {
				this.anInt1626 = local40;
			}
		}
		this.anInt1626 = (int) (Math.sqrt((double) this.anInt1626) + 0.99D);
		this.anInt1630 = this.anInt1626;
		this.anInt1627 = this.anInt1626 + this.anInt1626;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZI)V")
	private void method1122(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1627 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1627; local6++) {
			Static76.anIntArray228[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1629; local18++) {
			if (this.anIntArray224[local18] != -2) {
				local30 = this.anIntArray223[local18];
				local35 = this.anIntArray214[local18];
				local40 = this.anIntArray218[local18];
				local44 = Static76.anIntArray231[local30];
				local48 = Static76.anIntArray231[local35];
				local52 = Static76.anIntArray231[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static76.anIntArray229[local30];
					local71 = Static76.anIntArray229[local35];
					@Pc(75) int local75 = Static76.anIntArray229[local40];
					@Pc(79) int local79 = Static76.anIntArray241[local30];
					local83 = Static76.anIntArray241[local35];
					local87 = Static76.anIntArray241[local40];
					@Pc(91) int local91 = Static76.anIntArray232[local30];
					local95 = Static76.anIntArray232[local35];
					@Pc(99) int local99 = Static76.anIntArray232[local40];
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
						Static76.aBooleanArray4[local18] = true;
						@Pc(180) int local180 = (Static76.anIntArray242[local30] + Static76.anIntArray242[local35] + Static76.anIntArray242[local40]) / 3 + this.anInt1630;
						Static76.anIntArrayArray16[local180][Static76.anIntArray228[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1125(Static76.anInt1634, Static76.anInt1631, Static76.anIntArray240[local30], Static76.anIntArray240[local35], Static76.anIntArray240[local40], local44, local48, local52)) {
						Static76.anIntArray235[Static76.anInt1635++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static76.anIntArray240[local40] - Static76.anIntArray240[local35]) - (Static76.anIntArray240[local30] - Static76.anIntArray240[local35]) * (local52 - local48) > 0) {
						Static76.aBooleanArray4[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static44.anInt1019 && local48 <= Static44.anInt1019 && local52 <= Static44.anInt1019) {
							Static76.aBooleanArray3[local18] = false;
						} else {
							Static76.aBooleanArray3[local18] = true;
						}
						local67 = (Static76.anIntArray242[local30] + Static76.anIntArray242[local35] + Static76.anIntArray242[local40]) / 3 + this.anInt1630;
						Static76.anIntArrayArray16[local67][Static76.anIntArray228[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray17 == null) {
			for (local30 = this.anInt1627 - 1; local30 >= 0; local30--) {
				local35 = Static76.anIntArray228[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static76.anIntArrayArray16[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1135(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static76.anIntArray234[local30] = 0;
			Static76.anIntArray243[local30] = 0;
		}
		for (local35 = this.anInt1627 - 1; local35 >= 0; local35--) {
			local40 = Static76.anIntArray228[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static76.anIntArrayArray16[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray17[local52];
					local71 = Static76.anIntArray234[local388]++;
					Static76.anIntArrayArray17[local388][local71] = local52;
					if (local388 < 10) {
						Static76.anIntArray243[local388] += local35;
					} else if (local388 == 10) {
						Static76.anIntArray233[local71] = local35;
					} else {
						Static76.anIntArray239[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static76.anIntArray234[1] > 0 || Static76.anIntArray234[2] > 0) {
			local40 = (Static76.anIntArray243[1] + Static76.anIntArray243[2]) / (Static76.anIntArray234[1] + Static76.anIntArray234[2]);
		}
		local44 = 0;
		if (Static76.anIntArray234[3] > 0 || Static76.anIntArray234[4] > 0) {
			local44 = (Static76.anIntArray243[3] + Static76.anIntArray243[4]) / (Static76.anIntArray234[3] + Static76.anIntArray234[4]);
		}
		local48 = 0;
		if (Static76.anIntArray234[6] > 0 || Static76.anIntArray234[8] > 0) {
			local48 = (Static76.anIntArray243[6] + Static76.anIntArray243[8]) / (Static76.anIntArray234[6] + Static76.anIntArray234[8]);
		}
		local67 = 0;
		local71 = Static76.anIntArray234[10];
		@Pc(521) int[] local521 = Static76.anIntArrayArray17[10];
		@Pc(523) int[] local523 = Static76.anIntArray233;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static76.anIntArray234[11];
			local521 = Static76.anIntArrayArray17[11];
			local523 = Static76.anIntArray239;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1135(local521[local67++]);
				if (local67 == local71 && local521 != Static76.anIntArrayArray17[11]) {
					local67 = 0;
					local71 = Static76.anIntArray234[11];
					local521 = Static76.anIntArrayArray17[11];
					local523 = Static76.anIntArray239;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1135(local521[local67++]);
				if (local67 == local71 && local521 != Static76.anIntArrayArray17[11]) {
					local67 = 0;
					local71 = Static76.anIntArray234[11];
					local521 = Static76.anIntArrayArray17[11];
					local523 = Static76.anIntArray239;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1135(local521[local67++]);
				if (local67 == local71 && local521 != Static76.anIntArrayArray17[11]) {
					local67 = 0;
					local71 = Static76.anIntArray234[11];
					local521 = Static76.anIntArrayArray17[11];
					local523 = Static76.anIntArray239;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static76.anIntArray234[local83];
			@Pc(686) int[] local686 = Static76.anIntArrayArray17[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1135(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1135(local521[local67++]);
			if (local67 == local71 && local521 != Static76.anIntArrayArray17[11]) {
				local67 = 0;
				local521 = Static76.anIntArrayArray17[11];
				local71 = Static76.anIntArray234[11];
				local523 = Static76.anIntArray239;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static76.anIntArray228[0] = -1;
		if (this.anInt1625 != 1) {
			this.method1133();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt1626 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt1626 << 9;
		if (local64 / local40 >= Static44.anInt1022) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt1626 << 9;
		if (local77 / local40 <= Static44.anInt1017) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt1626 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static44.anInt1015) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2656 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static44.anInt1020) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2656 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt1623 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static76.aBoolean64) {
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
			local219 = Static76.anInt1634 - Static44.anInt1016;
			local223 = Static76.anInt1631 - Static44.anInt1014;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean63) {
					Static76.anIntArray235[Static76.anInt1635++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static44.anInt1016;
		local219 = Static44.anInt1014;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static76.anIntArray236[arg0];
			local257 = Static76.anIntArray226[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt1628; local269++) {
			@Pc(275) int local275 = this.anIntArray221[local269];
			@Pc(280) int local280 = this.anIntArray222[local269];
			@Pc(285) int local285 = this.anIntArray215[local269];
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
			Static76.anIntArray242[local269] = local285 - local29;
			if (local285 >= 50) {
				Static76.anIntArray231[local269] = local172 + (local275 << 9) / local285;
				Static76.anIntArray240[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static76.anIntArray231[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static76.anIntArray229[local269] = local275;
				Static76.anIntArray241[local269] = local297;
				Static76.anIntArray232[local269] = local285;
			}
		}
		try {
			this.method1122(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
	public void method1123() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1628; local1++) {
			@Pc(7) int local7 = this.anIntArray221[local1];
			this.anIntArray221[local1] = this.anIntArray215[local1];
			this.anIntArray215[local1] = -local7;
		}
		this.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	public void method1124() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1628; local1++) {
			this.anIntArray221[local1] = -this.anIntArray221[local1];
			this.anIntArray215[local1] = -this.anIntArray215[local1];
		}
		this.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()I")
	public int method1126() {
		this.method1133();
		return this.anInt1626;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ua;ILclient!ua;I[I)V")
	public void method1128(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1119(arg0, arg1);
			return;
		}
		@Pc(18) Class73 local18 = arg0.aClass73Array1[arg1];
		@Pc(23) Class73 local23 = arg2.aClass73Array1[arg3];
		@Pc(26) Class2_Sub7 local26 = local18.aClass2_Sub7_1;
		Static76.anInt1633 = 0;
		Static76.anInt1632 = 0;
		Static76.anInt1636 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2462; local41++) {
			local47 = local18.anIntArray358[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray64[local47] == 0) {
				this.method1120(local26.anIntArray64[local47], local26.anIntArrayArray6[local47], local18.anIntArray355[local41], local18.anIntArray357[local41], local18.anIntArray360[local41]);
			}
		}
		Static76.anInt1633 = 0;
		Static76.anInt1632 = 0;
		Static76.anInt1636 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2462; local47++) {
			@Pc(112) int local112 = local23.anIntArray358[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray64[local112] == 0) {
				this.method1120(local26.anIntArray64[local112], local26.anIntArrayArray6[local112], local23.anIntArray355[local47], local23.anIntArray357[local47], local23.anIntArray360[local47]);
			}
		}
		this.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public void method1129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1628; local1++) {
			this.anIntArray221[local1] = this.anIntArray221[local1] * arg0 / 128;
			this.anIntArray222[local1] = this.anIntArray222[local1] * arg1 / 128;
			this.anIntArray215[local1] = this.anIntArray215[local1] * arg2 / 128;
		}
		this.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	public void method1130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static76.anIntArray228[0] = -1;
		if (this.anInt1625 != 2 && this.anInt1625 != 1) {
			this.method1121();
		}
		@Pc(15) int local15 = Static44.anInt1016;
		@Pc(17) int local17 = Static44.anInt1014;
		@Pc(21) int local21 = Static76.anIntArray236[0];
		@Pc(25) int local25 = Static76.anIntArray226[0];
		@Pc(29) int local29 = Static76.anIntArray236[arg0];
		@Pc(33) int local33 = Static76.anIntArray226[arg0];
		@Pc(37) int local37 = Static76.anIntArray236[arg1];
		@Pc(41) int local41 = Static76.anIntArray226[arg1];
		@Pc(45) int local45 = Static76.anIntArray236[arg2];
		@Pc(49) int local49 = Static76.anIntArray226[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1628; local61++) {
			@Pc(67) int local67 = this.anIntArray221[local61];
			@Pc(72) int local72 = this.anIntArray222[local61];
			@Pc(77) int local77 = this.anIntArray215[local61];
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
			Static76.anIntArray242[local61] = local77 - local59;
			Static76.anIntArray231[local61] = local15 + (local67 << 9) / local77;
			Static76.anIntArray240[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt1623 > 0) {
				Static76.anIntArray229[local61] = local67;
				Static76.anIntArray241[local61] = local89;
				Static76.anIntArray232[local61] = local77;
			}
		}
		try {
			this.method1122(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!na;[B)Lclient!na;")
	private Class2_Sub2_Sub2_Sub5 method1131(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub2_Sub2_Sub5 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1628 = this.anInt1628;
		arg1.anInt1629 = this.anInt1629;
		arg1.anInt1623 = this.anInt1623;
		if (arg1.anIntArray221 == null || arg1.anIntArray221.length < this.anInt1628) {
			arg1.anIntArray221 = new int[this.anInt1628 + 100];
			arg1.anIntArray222 = new int[this.anInt1628 + 100];
			arg1.anIntArray215 = new int[this.anInt1628 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1628; local43++) {
			arg1.anIntArray221[local43] = this.anIntArray221[local43];
			arg1.anIntArray222[local43] = this.anIntArray222[local43];
			arg1.anIntArray215[local43] = this.anIntArray215[local43];
		}
		if (arg0) {
			arg1.aByteArray15 = this.aByteArray15;
		} else {
			arg1.aByteArray15 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray15 == null) {
				for (local88 = 0; local88 < this.anInt1629; local88++) {
					arg1.aByteArray15[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1629; local88++) {
					arg1.aByteArray15[local88] = this.aByteArray15[local88];
				}
			}
		}
		arg1.anIntArray223 = this.anIntArray223;
		arg1.anIntArray214 = this.anIntArray214;
		arg1.anIntArray218 = this.anIntArray218;
		arg1.anIntArray216 = this.anIntArray216;
		arg1.anIntArray213 = this.anIntArray213;
		arg1.anIntArray224 = this.anIntArray224;
		arg1.aByteArray17 = this.aByteArray17;
		arg1.aByteArray16 = this.aByteArray16;
		arg1.aShortArray9 = this.aShortArray9;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray220 = this.anIntArray220;
		arg1.anIntArray217 = this.anIntArray217;
		arg1.anIntArray219 = this.anIntArray219;
		arg1.anIntArrayArray14 = this.anIntArrayArray14;
		arg1.anIntArrayArray15 = this.anIntArrayArray15;
		arg1.aBoolean63 = this.aBoolean63;
		arg1.anInt1625 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
	private void method1132(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static44.anInt1016;
		@Pc(3) int local3 = Static44.anInt1014;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray223[arg0];
		@Pc(15) int local15 = this.anIntArray214[arg0];
		@Pc(20) int local20 = this.anIntArray218[arg0];
		@Pc(24) int local24 = Static76.anIntArray232[local10];
		@Pc(28) int local28 = Static76.anIntArray232[local15];
		@Pc(32) int local32 = Static76.anIntArray232[local20];
		if (this.aByteArray15 == null) {
			Static44.anInt1021 = 0;
		} else {
			Static44.anInt1021 = this.aByteArray15[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static76.anIntArray225[0] = Static76.anIntArray231[local10];
			Static76.anIntArray237[0] = Static76.anIntArray240[local10];
			local5++;
			Static76.anIntArray230[0] = this.anIntArray216[arg0];
		} else {
			local73 = Static76.anIntArray229[local10];
			local77 = Static76.anIntArray241[local10];
			local82 = this.anIntArray216[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static76.anIntArray227[local32 - local24];
				Static76.anIntArray225[0] = local1 + (local73 + ((Static76.anIntArray229[local20] - local73) * local95 >> 16) << 9) / 50;
				Static76.anIntArray237[0] = local3 + (local77 + ((Static76.anIntArray241[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static76.anIntArray230[0] = local82 + ((this.anIntArray224[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static76.anIntArray227[local28 - local24];
				Static76.anIntArray225[local5] = local1 + (local73 + ((Static76.anIntArray229[local15] - local73) * local95 >> 16) << 9) / 50;
				Static76.anIntArray237[local5] = local3 + (local77 + ((Static76.anIntArray241[local15] - local77) * local95 >> 16) << 9) / 50;
				Static76.anIntArray230[local5++] = local82 + ((this.anIntArray213[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static76.anIntArray225[local5] = Static76.anIntArray231[local15];
			Static76.anIntArray237[local5] = Static76.anIntArray240[local15];
			Static76.anIntArray230[local5++] = this.anIntArray213[arg0];
		} else {
			local73 = Static76.anIntArray229[local15];
			local77 = Static76.anIntArray241[local15];
			local82 = this.anIntArray213[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static76.anIntArray227[local24 - local28];
				Static76.anIntArray225[local5] = local1 + (local73 + ((Static76.anIntArray229[local10] - local73) * local95 >> 16) << 9) / 50;
				Static76.anIntArray237[local5] = local3 + (local77 + ((Static76.anIntArray241[local10] - local77) * local95 >> 16) << 9) / 50;
				Static76.anIntArray230[local5++] = local82 + ((this.anIntArray216[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static76.anIntArray227[local32 - local28];
				Static76.anIntArray225[local5] = local1 + (local73 + ((Static76.anIntArray229[local20] - local73) * local95 >> 16) << 9) / 50;
				Static76.anIntArray237[local5] = local3 + (local77 + ((Static76.anIntArray241[local20] - local77) * local95 >> 16) << 9) / 50;
				Static76.anIntArray230[local5++] = local82 + ((this.anIntArray224[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static76.anIntArray225[local5] = Static76.anIntArray231[local20];
			Static76.anIntArray237[local5] = Static76.anIntArray240[local20];
			Static76.anIntArray230[local5++] = this.anIntArray224[arg0];
		} else {
			local73 = Static76.anIntArray229[local20];
			local77 = Static76.anIntArray241[local20];
			local82 = this.anIntArray224[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static76.anIntArray227[local28 - local32];
				Static76.anIntArray225[local5] = local1 + (local73 + ((Static76.anIntArray229[local15] - local73) * local95 >> 16) << 9) / 50;
				Static76.anIntArray237[local5] = local3 + (local77 + ((Static76.anIntArray241[local15] - local77) * local95 >> 16) << 9) / 50;
				Static76.anIntArray230[local5++] = local82 + ((this.anIntArray213[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static76.anIntArray227[local24 - local32];
				Static76.anIntArray225[local5] = local1 + (local73 + ((Static76.anIntArray229[local10] - local73) * local95 >> 16) << 9) / 50;
				Static76.anIntArray237[local5] = local3 + (local77 + ((Static76.anIntArray241[local10] - local77) * local95 >> 16) << 9) / 50;
				Static76.anIntArray230[local5++] = local82 + ((this.anIntArray216[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static76.anIntArray225[0];
		local77 = Static76.anIntArray225[1];
		local82 = Static76.anIntArray225[2];
		local95 = Static76.anIntArray237[0];
		@Pc(590) int local590 = Static76.anIntArray237[1];
		@Pc(594) int local594 = Static76.anIntArray237[2];
		Static44.aBoolean40 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static44.anInt1019 || local77 > Static44.anInt1019 || local82 > Static44.anInt1019) {
				Static44.aBoolean40 = true;
			}
			if (this.aByteArray16 != null && this.aByteArray16[arg0] != -1) {
				local669 = this.aByteArray16[arg0] & 0xFF;
				local674 = this.anIntArray220[local669];
				local679 = this.anIntArray217[local669];
				local684 = this.anIntArray219[local669];
				if (this.anIntArray224[arg0] == -1) {
					Static44.method722(local95, local590, local594, local73, local77, local82, this.anIntArray216[arg0], this.anIntArray216[arg0], this.anIntArray216[arg0], Static76.anIntArray229[local674], Static76.anIntArray229[local679], Static76.anIntArray229[local684], Static76.anIntArray241[local674], Static76.anIntArray241[local679], Static76.anIntArray241[local684], Static76.anIntArray232[local674], Static76.anIntArray232[local679], Static76.anIntArray232[local684], this.aShortArray9[arg0]);
				} else {
					Static44.method722(local95, local590, local594, local73, local77, local82, Static76.anIntArray230[0], Static76.anIntArray230[1], Static76.anIntArray230[2], Static76.anIntArray229[local674], Static76.anIntArray229[local679], Static76.anIntArray229[local684], Static76.anIntArray241[local674], Static76.anIntArray241[local679], Static76.anIntArray241[local684], Static76.anIntArray232[local674], Static76.anIntArray232[local679], Static76.anIntArray232[local684], this.aShortArray9[arg0]);
				}
			} else if (this.anIntArray224[arg0] == -1) {
				Static44.method721(local95, local590, local594, local73, local77, local82, Static76.anIntArray238[this.anIntArray216[arg0]]);
			} else {
				Static44.method720(local95, local590, local594, local73, local77, local82, Static76.anIntArray230[0], Static76.anIntArray230[1], Static76.anIntArray230[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static44.anInt1019 || local77 > Static44.anInt1019 || local82 > Static44.anInt1019 || Static76.anIntArray225[3] < 0 || Static76.anIntArray225[3] > Static44.anInt1019) {
			Static44.aBoolean40 = true;
		}
		if (this.aByteArray16 == null || this.aByteArray16[arg0] == -1) {
			if (this.anIntArray224[arg0] == -1) {
				local669 = Static76.anIntArray238[this.anIntArray216[arg0]];
				Static44.method721(local95, local590, local594, local73, local77, local82, local669);
				Static44.method721(local95, local594, Static76.anIntArray237[3], local73, local82, Static76.anIntArray225[3], local669);
				return;
			}
			Static44.method720(local95, local590, local594, local73, local77, local82, Static76.anIntArray230[0], Static76.anIntArray230[1], Static76.anIntArray230[2]);
			Static44.method720(local95, local594, Static76.anIntArray237[3], local73, local82, Static76.anIntArray225[3], Static76.anIntArray230[0], Static76.anIntArray230[2], Static76.anIntArray230[3]);
			return;
		}
		local669 = this.aByteArray16[arg0] & 0xFF;
		local674 = this.anIntArray220[local669];
		local679 = this.anIntArray217[local669];
		local684 = this.anIntArray219[local669];
		@Pc(924) short local924 = this.aShortArray9[arg0];
		if (this.anIntArray224[arg0] == -1) {
			Static44.method722(local95, local590, local594, local73, local77, local82, this.anIntArray216[arg0], this.anIntArray216[arg0], this.anIntArray216[arg0], Static76.anIntArray229[local674], Static76.anIntArray229[local679], Static76.anIntArray229[local684], Static76.anIntArray241[local674], Static76.anIntArray241[local679], Static76.anIntArray241[local684], Static76.anIntArray232[local674], Static76.anIntArray232[local679], Static76.anIntArray232[local684], local924);
			Static44.method722(local95, local594, Static76.anIntArray237[3], local73, local82, Static76.anIntArray225[3], this.anIntArray216[arg0], this.anIntArray216[arg0], this.anIntArray216[arg0], Static76.anIntArray229[local674], Static76.anIntArray229[local679], Static76.anIntArray229[local684], Static76.anIntArray241[local674], Static76.anIntArray241[local679], Static76.anIntArray241[local684], Static76.anIntArray232[local674], Static76.anIntArray232[local679], Static76.anIntArray232[local684], local924);
			return;
		}
		Static44.method722(local95, local590, local594, local73, local77, local82, Static76.anIntArray230[0], Static76.anIntArray230[1], Static76.anIntArray230[2], Static76.anIntArray229[local674], Static76.anIntArray229[local679], Static76.anIntArray229[local684], Static76.anIntArray241[local674], Static76.anIntArray241[local679], Static76.anIntArray241[local684], Static76.anIntArray232[local674], Static76.anIntArray232[local679], Static76.anIntArray232[local684], local924);
		Static44.method722(local95, local594, Static76.anIntArray237[3], local73, local82, Static76.anIntArray225[3], Static76.anIntArray230[0], Static76.anIntArray230[2], Static76.anIntArray230[3], Static76.anIntArray229[local674], Static76.anIntArray229[local679], Static76.anIntArray229[local684], Static76.anIntArray241[local674], Static76.anIntArray241[local679], Static76.anIntArray241[local684], Static76.anIntArray232[local674], Static76.anIntArray232[local679], Static76.anIntArray232[local684], local924);
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()V")
	public void method1133() {
		if (this.anInt1625 == 1) {
			return;
		}
		this.anInt1625 = 1;
		super.anInt2656 = 0;
		this.anInt1624 = 0;
		this.anInt1626 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1628; local18++) {
			@Pc(24) int local24 = this.anIntArray221[local18];
			@Pc(29) int local29 = this.anIntArray222[local18];
			@Pc(34) int local34 = this.anIntArray215[local18];
			if (-local29 > super.anInt2656) {
				super.anInt2656 = -local29;
			}
			if (local29 > this.anInt1624) {
				this.anInt1624 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1626) {
				this.anInt1626 = local58;
			}
		}
		this.anInt1626 = (int) (Math.sqrt((double) this.anInt1626) + 0.99D);
		this.anInt1630 = (int) (Math.sqrt((double) (this.anInt1626 * this.anInt1626 + super.anInt2656 * super.anInt2656)) + 0.99D);
		this.anInt1627 = this.anInt1630 + (int) (Math.sqrt((double) (this.anInt1626 * this.anInt1626 + this.anInt1624 * this.anInt1624)) + 0.99D);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)V")
	public void method1134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static76.anIntArray228[0] = -1;
		if (this.anInt1625 != 2 && this.anInt1625 != 1) {
			this.method1121();
		}
		@Pc(15) int local15 = Static44.anInt1016;
		@Pc(17) int local17 = Static44.anInt1014;
		@Pc(21) int local21 = Static76.anIntArray236[0];
		@Pc(25) int local25 = Static76.anIntArray226[0];
		@Pc(29) int local29 = Static76.anIntArray236[arg0];
		@Pc(33) int local33 = Static76.anIntArray226[arg0];
		@Pc(37) int local37 = Static76.anIntArray236[arg1];
		@Pc(41) int local41 = Static76.anIntArray226[arg1];
		@Pc(45) int local45 = Static76.anIntArray236[arg2];
		@Pc(49) int local49 = Static76.anIntArray226[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1628; local61++) {
			@Pc(67) int local67 = this.anIntArray221[local61];
			@Pc(72) int local72 = this.anIntArray222[local61];
			@Pc(77) int local77 = this.anIntArray215[local61];
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
			Static76.anIntArray242[local61] = local77 - local59;
			Static76.anIntArray231[local61] = local15 + (local67 << 9) / arg6;
			Static76.anIntArray240[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt1623 > 0) {
				Static76.anIntArray229[local61] = local67;
				Static76.anIntArray241[local61] = local89;
				Static76.anIntArray232[local61] = local77;
			}
		}
		try {
			this.method1122(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)V")
	private void method1135(@OriginalArg(0) int arg0) {
		if (Static76.aBooleanArray4[arg0]) {
			this.method1132(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray223[arg0];
		@Pc(17) int local17 = this.anIntArray214[arg0];
		@Pc(22) int local22 = this.anIntArray218[arg0];
		Static44.aBoolean40 = Static76.aBooleanArray3[arg0];
		if (this.aByteArray15 == null) {
			Static44.anInt1021 = 0;
		} else {
			Static44.anInt1021 = this.aByteArray15[arg0] & 0xFF;
		}
		if (this.aByteArray16 != null && this.aByteArray16[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray16[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray220[local119];
			@Pc(129) int local129 = this.anIntArray217[local119];
			@Pc(134) int local134 = this.anIntArray219[local119];
			if (this.anIntArray224[arg0] == -1) {
				Static44.method722(Static76.anIntArray240[local12], Static76.anIntArray240[local17], Static76.anIntArray240[local22], Static76.anIntArray231[local12], Static76.anIntArray231[local17], Static76.anIntArray231[local22], this.anIntArray216[arg0], this.anIntArray216[arg0], this.anIntArray216[arg0], Static76.anIntArray229[local124], Static76.anIntArray229[local129], Static76.anIntArray229[local134], Static76.anIntArray241[local124], Static76.anIntArray241[local129], Static76.anIntArray241[local134], Static76.anIntArray232[local124], Static76.anIntArray232[local129], Static76.anIntArray232[local134], this.aShortArray9[arg0]);
			} else {
				Static44.method722(Static76.anIntArray240[local12], Static76.anIntArray240[local17], Static76.anIntArray240[local22], Static76.anIntArray231[local12], Static76.anIntArray231[local17], Static76.anIntArray231[local22], this.anIntArray216[arg0], this.anIntArray213[arg0], this.anIntArray224[arg0], Static76.anIntArray229[local124], Static76.anIntArray229[local129], Static76.anIntArray229[local134], Static76.anIntArray241[local124], Static76.anIntArray241[local129], Static76.anIntArray241[local134], Static76.anIntArray232[local124], Static76.anIntArray232[local129], Static76.anIntArray232[local134], this.aShortArray9[arg0]);
			}
		} else if (this.anIntArray224[arg0] == -1) {
			Static44.method721(Static76.anIntArray240[local12], Static76.anIntArray240[local17], Static76.anIntArray240[local22], Static76.anIntArray231[local12], Static76.anIntArray231[local17], Static76.anIntArray231[local22], Static76.anIntArray238[this.anIntArray216[arg0]]);
		} else {
			Static44.method720(Static76.anIntArray240[local12], Static76.anIntArray240[local17], Static76.anIntArray240[local22], Static76.anIntArray231[local12], Static76.anIntArray231[local17], Static76.anIntArray231[local22], this.anIntArray216[arg0], this.anIntArray213[arg0], this.anIntArray224[arg0]);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1136(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static76.aByteArray19.length < this.anInt1629) {
			Static76.aByteArray19 = new byte[this.anInt1629 + 100];
		}
		return this.method1131(arg0, Static76.aClass2_Sub2_Sub2_Sub5_2, Static76.aByteArray19);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZ)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class2_Sub2_Sub2_Sub5 local16;
		if (arg4) {
			local16 = new Class2_Sub2_Sub2_Sub5();
			local16.anInt1628 = this.anInt1628;
			local16.anInt1629 = this.anInt1629;
			local16.anInt1623 = this.anInt1623;
			local16.anIntArray221 = this.anIntArray221;
			local16.anIntArray215 = this.anIntArray215;
			local16.anIntArray223 = this.anIntArray223;
			local16.anIntArray214 = this.anIntArray214;
			local16.anIntArray218 = this.anIntArray218;
			local16.anIntArray216 = this.anIntArray216;
			local16.anIntArray213 = this.anIntArray213;
			local16.anIntArray224 = this.anIntArray224;
			local16.aByteArray17 = this.aByteArray17;
			local16.aByteArray15 = this.aByteArray15;
			local16.aByteArray16 = this.aByteArray16;
			local16.aShortArray9 = this.aShortArray9;
			local16.aByte2 = this.aByte2;
			local16.anIntArray220 = this.anIntArray220;
			local16.anIntArray217 = this.anIntArray217;
			local16.anIntArray219 = this.anIntArray219;
			local16.anIntArrayArray14 = this.anIntArrayArray14;
			local16.anIntArrayArray15 = this.anIntArrayArray15;
			local16.aBoolean63 = this.aBoolean63;
			local16.anIntArray222 = new int[local16.anInt1628];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt1628; local124++) {
			@Pc(130) int local130 = this.anIntArray221[local124];
			@Pc(135) int local135 = this.anIntArray222[local124];
			@Pc(140) int local140 = this.anIntArray215[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray222[local124] = local135 + local176 - local122;
		}
		local16.anInt1625 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	public void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1628; local1++) {
			this.anIntArray221[local1] += arg0;
			this.anIntArray222[local1] += arg1;
			this.anIntArray215[local1] += arg2;
		}
		this.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(I)V")
	public void method1139(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static76.anIntArray236[arg0];
		@Pc(7) int local7 = Static76.anIntArray226[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1628; local9++) {
			@Pc(26) int local26 = this.anIntArray222[local9] * local7 - this.anIntArray215[local9] * local3 >> 16;
			this.anIntArray215[local9] = this.anIntArray222[local9] * local3 + this.anIntArray215[local9] * local7 >> 16;
			this.anIntArray222[local9] = local26;
		}
		this.anInt1625 = 0;
	}
}
