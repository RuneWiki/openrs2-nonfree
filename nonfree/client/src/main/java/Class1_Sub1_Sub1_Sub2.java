import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ka", name = "lb", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "I")
	private int anInt1705;

	@OriginalMember(owner = "client!ka", name = "qb", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!ka", name = "rb", descriptor = "[I")
	public int[] anIntArray183;

	@OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
	private int anInt1706;

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "I")
	private int anInt1707;

	@OriginalMember(owner = "client!ka", name = "ub", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!ka", name = "wb", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ka", name = "xb", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ka", name = "yb", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!ka", name = "Ab", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!ka", name = "Bb", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!ka", name = "Cb", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!ka", name = "Fb", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!ka", name = "Gb", descriptor = "I")
	private int anInt1709;

	@OriginalMember(owner = "client!ka", name = "Ib", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!ka", name = "Jb", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!ka", name = "Kb", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ka", name = "Lb", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!ka", name = "Mb", descriptor = "I")
	private int anInt1710;

	@OriginalMember(owner = "client!ka", name = "zb", descriptor = "B")
	public byte aByte6 = 0;

	@OriginalMember(owner = "client!ka", name = "Eb", descriptor = "I")
	public int anInt1708 = 0;

	@OriginalMember(owner = "client!ka", name = "Db", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "I")
	public int anInt1704 = 0;

	@OriginalMember(owner = "client!ka", name = "Nb", descriptor = "I")
	public int anInt1711 = 0;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([Lclient!ka;I)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) Class1_Sub1_Sub1_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt1711 = 0;
		this.anInt1704 = 0;
		this.anInt1708 = 0;
		this.aByte6 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class1_Sub1_Sub1_Sub2 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt1711 += local41.anInt1711;
				this.anInt1704 += local41.anInt1704;
				this.anInt1708 += local41.anInt1708;
				if (local41.aByteArray22 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local41.aByte6;
					}
					if (this.aByte6 != local41.aByte6) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray24 != null;
				local22 |= local41.aByteArray23 != null;
			}
		}
		this.anIntArray185 = new int[this.anInt1711];
		this.anIntArray188 = new int[this.anInt1711];
		this.anIntArray180 = new int[this.anInt1711];
		this.anIntArray181 = new int[this.anInt1704];
		this.anIntArray183 = new int[this.anInt1704];
		this.anIntArray187 = new int[this.anInt1704];
		this.anIntArray182 = new int[this.anInt1704];
		this.anIntArray186 = new int[this.anInt1704];
		this.anIntArray190 = new int[this.anInt1704];
		if (this.anInt1708 > 0) {
			this.anIntArray189 = new int[this.anInt1708];
			this.anIntArray184 = new int[this.anInt1708];
			this.anIntArray191 = new int[this.anInt1708];
		}
		if (local18) {
			this.aByteArray22 = new byte[this.anInt1704];
		}
		if (local20) {
			this.aByteArray24 = new byte[this.anInt1704];
		}
		if (local22) {
			this.aByteArray23 = new byte[this.anInt1704];
			this.aShortArray5 = new short[this.anInt1704];
		}
		this.anInt1711 = 0;
		this.anInt1704 = 0;
		this.anInt1708 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class1_Sub1_Sub1_Sub2 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt1711;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt1711; local221++) {
					this.anIntArray185[this.anInt1711] = local214.anIntArray185[local221];
					this.anIntArray188[this.anInt1711] = local214.anIntArray188[local221];
					this.anIntArray180[this.anInt1711] = local214.anIntArray180[local221];
					this.anInt1711++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt1704; local262++) {
					this.anIntArray181[this.anInt1704] = local214.anIntArray181[local262] + local219;
					this.anIntArray183[this.anInt1704] = local214.anIntArray183[local262] + local219;
					this.anIntArray187[this.anInt1704] = local214.anIntArray187[local262] + local219;
					this.anIntArray182[this.anInt1704] = local214.anIntArray182[local262];
					this.anIntArray186[this.anInt1704] = local214.anIntArray186[local262];
					this.anIntArray190[this.anInt1704] = local214.anIntArray190[local262];
					if (local18) {
						if (local214.aByteArray22 == null) {
							this.aByteArray22[this.anInt1704] = local214.aByte6;
						} else {
							this.aByteArray22[this.anInt1704] = local214.aByteArray22[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray24 == null) {
							this.aByteArray24[this.anInt1704] = 0;
						} else {
							this.aByteArray24[this.anInt1704] = local214.aByteArray24[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray23 == null || local214.aByteArray23[local262] == -1) {
							this.aByteArray23[this.anInt1704] = -1;
						} else {
							this.aByteArray23[this.anInt1704] = (byte) (local214.aByteArray23[local262] + local207);
							this.aShortArray5[this.anInt1704] = local214.aShortArray5[local262];
						}
					}
					this.anInt1704++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt1708; local418++) {
					this.anIntArray189[this.anInt1708] = local214.anIntArray189[local418] + local219;
					this.anIntArray184[this.anInt1708] = local214.anIntArray184[local418] + local219;
					this.anIntArray191[this.anInt1708] = local214.anIntArray191[local418] + local219;
					this.anInt1708++;
				}
				local207 += local214.anInt1708;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public void method1081() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1711; local1++) {
			@Pc(7) int local7 = this.anIntArray185[local1];
			this.anIntArray185[local1] = this.anIntArray180[local1];
			this.anIntArray180[local1] = -local7;
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII)V")
	public void method1082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static63.anIntArray199[0] = -1;
		if (this.anInt1706 != 2 && this.anInt1706 != 1) {
			this.method1096();
		}
		@Pc(15) int local15 = Static108.anInt2647;
		@Pc(17) int local17 = Static108.anInt2643;
		@Pc(21) int local21 = Static63.anIntArray193[0];
		@Pc(25) int local25 = Static63.anIntArray206[0];
		@Pc(29) int local29 = Static63.anIntArray193[arg0];
		@Pc(33) int local33 = Static63.anIntArray206[arg0];
		@Pc(37) int local37 = Static63.anIntArray193[arg1];
		@Pc(41) int local41 = Static63.anIntArray206[arg1];
		@Pc(45) int local45 = Static63.anIntArray193[arg2];
		@Pc(49) int local49 = Static63.anIntArray206[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1711; local61++) {
			@Pc(67) int local67 = this.anIntArray185[local61];
			@Pc(72) int local72 = this.anIntArray188[local61];
			@Pc(77) int local77 = this.anIntArray180[local61];
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
			Static63.anIntArray198[local61] = local77 - local59;
			Static63.anIntArray204[local61] = local15 + (local67 << 9) / local77;
			Static63.anIntArray203[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt1708 > 0) {
				Static63.anIntArray208[local61] = local67;
				Static63.anIntArray197[local61] = local89;
				Static63.anIntArray192[local61] = local77;
			}
		}
		try {
			this.method1088(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIII)V")
	public void method1083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static63.anIntArray199[0] = -1;
		if (this.anInt1706 != 2 && this.anInt1706 != 1) {
			this.method1096();
		}
		@Pc(15) int local15 = Static108.anInt2647;
		@Pc(17) int local17 = Static108.anInt2643;
		@Pc(21) int local21 = Static63.anIntArray193[0];
		@Pc(25) int local25 = Static63.anIntArray206[0];
		@Pc(29) int local29 = Static63.anIntArray193[arg0];
		@Pc(33) int local33 = Static63.anIntArray206[arg0];
		@Pc(37) int local37 = Static63.anIntArray193[arg1];
		@Pc(41) int local41 = Static63.anIntArray206[arg1];
		@Pc(45) int local45 = Static63.anIntArray193[arg2];
		@Pc(49) int local49 = Static63.anIntArray206[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1711; local61++) {
			@Pc(67) int local67 = this.anIntArray185[local61];
			@Pc(72) int local72 = this.anIntArray188[local61];
			@Pc(77) int local77 = this.anIntArray180[local61];
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
			Static63.anIntArray198[local61] = local77 - local59;
			Static63.anIntArray204[local61] = local15 + (local67 << 9) / arg6;
			Static63.anIntArray203[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt1708 > 0) {
				Static63.anIntArray208[local61] = local67;
				Static63.anIntArray197[local61] = local89;
				Static63.anIntArray192[local61] = local77;
			}
		}
		try {
			this.method1088(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	public void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1711; local1++) {
			this.anIntArray185[local1] = this.anIntArray185[local1] * arg0 / 128;
			this.anIntArray188[local1] = this.anIntArray188[local1] * arg1 / 128;
			this.anIntArray180[local1] = this.anIntArray180[local1] * arg2 / 128;
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1085(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static63.aByteArray26.length < this.anInt1704) {
			Static63.aByteArray26 = new byte[this.anInt1704 + 100];
		}
		return this.method1101(arg0, Static63.aClass1_Sub1_Sub1_Sub2_3, Static63.aByteArray26);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()I")
	public int method1086() {
		this.method1103();
		return this.anInt1709;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
	public void method1087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1711; local1++) {
			this.anIntArray185[local1] += arg0;
			this.anIntArray188[local1] += arg1;
			this.anIntArray180[local1] += arg2;
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZI)V")
	private void method1088(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1710 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1710; local6++) {
			Static63.anIntArray199[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1704; local18++) {
			if (this.anIntArray190[local18] != -2) {
				local30 = this.anIntArray181[local18];
				local35 = this.anIntArray183[local18];
				local40 = this.anIntArray187[local18];
				local44 = Static63.anIntArray204[local30];
				local48 = Static63.anIntArray204[local35];
				local52 = Static63.anIntArray204[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static63.anIntArray208[local30];
					local71 = Static63.anIntArray208[local35];
					@Pc(75) int local75 = Static63.anIntArray208[local40];
					@Pc(79) int local79 = Static63.anIntArray197[local30];
					local83 = Static63.anIntArray197[local35];
					local87 = Static63.anIntArray197[local40];
					@Pc(91) int local91 = Static63.anIntArray192[local30];
					local95 = Static63.anIntArray192[local35];
					@Pc(99) int local99 = Static63.anIntArray192[local40];
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
						Static63.aBooleanArray14[local18] = true;
						@Pc(180) int local180 = (Static63.anIntArray198[local30] + Static63.anIntArray198[local35] + Static63.anIntArray198[local40]) / 3 + this.anInt1707;
						Static63.anIntArrayArray14[local180][Static63.anIntArray199[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1093(Static63.anInt1713, Static63.anInt1715, Static63.anIntArray203[local30], Static63.anIntArray203[local35], Static63.anIntArray203[local40], local44, local48, local52)) {
						Static63.anIntArray209[Static63.anInt1717++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static63.anIntArray203[local40] - Static63.anIntArray203[local35]) - (Static63.anIntArray203[local30] - Static63.anIntArray203[local35]) * (local52 - local48) > 0) {
						Static63.aBooleanArray14[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static108.anInt2649 && local48 <= Static108.anInt2649 && local52 <= Static108.anInt2649) {
							Static63.aBooleanArray13[local18] = false;
						} else {
							Static63.aBooleanArray13[local18] = true;
						}
						local67 = (Static63.anIntArray198[local30] + Static63.anIntArray198[local35] + Static63.anIntArray198[local40]) / 3 + this.anInt1707;
						Static63.anIntArrayArray14[local67][Static63.anIntArray199[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray22 == null) {
			for (local30 = this.anInt1710 - 1; local30 >= 0; local30--) {
				local35 = Static63.anIntArray199[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static63.anIntArrayArray14[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1090(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static63.anIntArray207[local30] = 0;
			Static63.anIntArray205[local30] = 0;
		}
		for (local35 = this.anInt1710 - 1; local35 >= 0; local35--) {
			local40 = Static63.anIntArray199[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static63.anIntArrayArray14[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray22[local52];
					local71 = Static63.anIntArray207[local388]++;
					Static63.anIntArrayArray13[local388][local71] = local52;
					if (local388 < 10) {
						Static63.anIntArray205[local388] += local35;
					} else if (local388 == 10) {
						Static63.anIntArray195[local71] = local35;
					} else {
						Static63.anIntArray210[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static63.anIntArray207[1] > 0 || Static63.anIntArray207[2] > 0) {
			local40 = (Static63.anIntArray205[1] + Static63.anIntArray205[2]) / (Static63.anIntArray207[1] + Static63.anIntArray207[2]);
		}
		local44 = 0;
		if (Static63.anIntArray207[3] > 0 || Static63.anIntArray207[4] > 0) {
			local44 = (Static63.anIntArray205[3] + Static63.anIntArray205[4]) / (Static63.anIntArray207[3] + Static63.anIntArray207[4]);
		}
		local48 = 0;
		if (Static63.anIntArray207[6] > 0 || Static63.anIntArray207[8] > 0) {
			local48 = (Static63.anIntArray205[6] + Static63.anIntArray205[8]) / (Static63.anIntArray207[6] + Static63.anIntArray207[8]);
		}
		local67 = 0;
		local71 = Static63.anIntArray207[10];
		@Pc(521) int[] local521 = Static63.anIntArrayArray13[10];
		@Pc(523) int[] local523 = Static63.anIntArray195;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static63.anIntArray207[11];
			local521 = Static63.anIntArrayArray13[11];
			local523 = Static63.anIntArray210;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1090(local521[local67++]);
				if (local67 == local71 && local521 != Static63.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static63.anIntArray207[11];
					local521 = Static63.anIntArrayArray13[11];
					local523 = Static63.anIntArray210;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1090(local521[local67++]);
				if (local67 == local71 && local521 != Static63.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static63.anIntArray207[11];
					local521 = Static63.anIntArrayArray13[11];
					local523 = Static63.anIntArray210;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1090(local521[local67++]);
				if (local67 == local71 && local521 != Static63.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static63.anIntArray207[11];
					local521 = Static63.anIntArrayArray13[11];
					local523 = Static63.anIntArray210;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static63.anIntArray207[local83];
			@Pc(686) int[] local686 = Static63.anIntArrayArray13[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1090(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1090(local521[local67++]);
			if (local67 == local71 && local521 != Static63.anIntArrayArray13[11]) {
				local67 = 0;
				local521 = Static63.anIntArrayArray13[11];
				local71 = Static63.anIntArray207[11];
				local523 = Static63.anIntArray210;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public void method1089() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1711; local1++) {
			@Pc(7) int local7 = this.anIntArray180[local1];
			this.anIntArray180[local1] = this.anIntArray185[local1];
			this.anIntArray185[local1] = -local7;
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V")
	private void method1090(@OriginalArg(0) int arg0) {
		if (Static63.aBooleanArray14[arg0]) {
			this.method1097(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray181[arg0];
		@Pc(17) int local17 = this.anIntArray183[arg0];
		@Pc(22) int local22 = this.anIntArray187[arg0];
		Static108.aBoolean146 = Static63.aBooleanArray13[arg0];
		if (this.aByteArray24 == null) {
			Static108.anInt2644 = 0;
		} else {
			Static108.anInt2644 = this.aByteArray24[arg0] & 0xFF;
		}
		if (this.aByteArray23 != null && this.aByteArray23[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray23[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray189[local119];
			@Pc(129) int local129 = this.anIntArray184[local119];
			@Pc(134) int local134 = this.anIntArray191[local119];
			if (this.anIntArray190[arg0] == -1) {
				Static108.method1782(Static63.anIntArray203[local12], Static63.anIntArray203[local17], Static63.anIntArray203[local22], Static63.anIntArray204[local12], Static63.anIntArray204[local17], Static63.anIntArray204[local22], this.anIntArray182[arg0], this.anIntArray182[arg0], this.anIntArray182[arg0], Static63.anIntArray208[local124], Static63.anIntArray208[local129], Static63.anIntArray208[local134], Static63.anIntArray197[local124], Static63.anIntArray197[local129], Static63.anIntArray197[local134], Static63.anIntArray192[local124], Static63.anIntArray192[local129], Static63.anIntArray192[local134], this.aShortArray5[arg0]);
			} else {
				Static108.method1782(Static63.anIntArray203[local12], Static63.anIntArray203[local17], Static63.anIntArray203[local22], Static63.anIntArray204[local12], Static63.anIntArray204[local17], Static63.anIntArray204[local22], this.anIntArray182[arg0], this.anIntArray186[arg0], this.anIntArray190[arg0], Static63.anIntArray208[local124], Static63.anIntArray208[local129], Static63.anIntArray208[local134], Static63.anIntArray197[local124], Static63.anIntArray197[local129], Static63.anIntArray197[local134], Static63.anIntArray192[local124], Static63.anIntArray192[local129], Static63.anIntArray192[local134], this.aShortArray5[arg0]);
			}
		} else if (this.anIntArray190[arg0] == -1) {
			Static108.method1779(Static63.anIntArray203[local12], Static63.anIntArray203[local17], Static63.anIntArray203[local22], Static63.anIntArray204[local12], Static63.anIntArray204[local17], Static63.anIntArray204[local22], Static63.anIntArray200[this.anIntArray182[arg0]]);
		} else {
			Static108.method1774(Static63.anIntArray203[local12], Static63.anIntArray203[local17], Static63.anIntArray203[local22], Static63.anIntArray204[local12], Static63.anIntArray204[local17], Static63.anIntArray204[local22], this.anIntArray182[arg0], this.anIntArray186[arg0], this.anIntArray190[arg0]);
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public void method1091() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1711; local1++) {
			this.anIntArray185[local1] = -this.anIntArray185[local1];
			this.anIntArray180[local1] = -this.anIntArray180[local1];
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ge;ILclient!ge;I[I)V")
	public void method1092(@OriginalArg(0) Class1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1099(arg0, arg1);
			return;
		}
		@Pc(18) Class13 local18 = arg0.aClass13Array1[arg1];
		@Pc(23) Class13 local23 = arg2.aClass13Array1[arg3];
		@Pc(26) Class1_Sub10 local26 = local18.aClass1_Sub10_1;
		Static63.anInt1716 = 0;
		Static63.anInt1714 = 0;
		Static63.anInt1712 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt653; local41++) {
			local47 = local18.anIntArray71[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray118[local47] == 0) {
				this.method1095(local26.anIntArray118[local47], local26.anIntArrayArray6[local47], local18.anIntArray67[local41], local18.anIntArray73[local41], local18.anIntArray74[local41]);
			}
		}
		Static63.anInt1716 = 0;
		Static63.anInt1714 = 0;
		Static63.anInt1712 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt653; local47++) {
			@Pc(112) int local112 = local23.anIntArray71[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray118[local112] == 0) {
				this.method1095(local26.anIntArray118[local112], local26.anIntArrayArray6[local112], local23.anIntArray67[local47], local23.anIntArray73[local47], local23.anIntArray74[local47]);
			}
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static63.anIntArray199[0] = -1;
		if (this.anInt1706 != 1) {
			this.method1103();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt1709 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt1709 << 9;
		if (local64 / local40 >= Static108.anInt2650) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt1709 << 9;
		if (local77 / local40 <= Static108.anInt2646) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt1709 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static108.anInt2648) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2759 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static108.anInt2651) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2759 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt1708 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static63.aBoolean93) {
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
			local219 = Static63.anInt1713 - Static108.anInt2647;
			local223 = Static63.anInt1715 - Static108.anInt2643;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean92) {
					Static63.anIntArray209[Static63.anInt1717++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static108.anInt2647;
		local219 = Static108.anInt2643;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static63.anIntArray193[arg0];
			local257 = Static63.anIntArray206[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt1711; local269++) {
			@Pc(275) int local275 = this.anIntArray185[local269];
			@Pc(280) int local280 = this.anIntArray188[local269];
			@Pc(285) int local285 = this.anIntArray180[local269];
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
			Static63.anIntArray198[local269] = local285 - local29;
			if (local285 >= 50) {
				Static63.anIntArray204[local269] = local172 + (local275 << 9) / local285;
				Static63.anIntArray203[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static63.anIntArray204[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static63.anIntArray208[local269] = local275;
				Static63.anIntArray197[local269] = local297;
				Static63.anIntArray192[local269] = local285;
			}
		}
		try {
			this.method1088(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIZ)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub1_Sub1_Sub2 local16;
		if (arg4) {
			local16 = new Class1_Sub1_Sub1_Sub2();
			local16.anInt1711 = this.anInt1711;
			local16.anInt1704 = this.anInt1704;
			local16.anInt1708 = this.anInt1708;
			local16.anIntArray185 = this.anIntArray185;
			local16.anIntArray180 = this.anIntArray180;
			local16.anIntArray181 = this.anIntArray181;
			local16.anIntArray183 = this.anIntArray183;
			local16.anIntArray187 = this.anIntArray187;
			local16.anIntArray182 = this.anIntArray182;
			local16.anIntArray186 = this.anIntArray186;
			local16.anIntArray190 = this.anIntArray190;
			local16.aByteArray22 = this.aByteArray22;
			local16.aByteArray24 = this.aByteArray24;
			local16.aByteArray23 = this.aByteArray23;
			local16.aShortArray5 = this.aShortArray5;
			local16.aByte6 = this.aByte6;
			local16.anIntArray189 = this.anIntArray189;
			local16.anIntArray184 = this.anIntArray184;
			local16.anIntArray191 = this.anIntArray191;
			local16.anIntArrayArray12 = this.anIntArrayArray12;
			local16.anIntArrayArray11 = this.anIntArrayArray11;
			local16.aBoolean92 = this.aBoolean92;
			local16.anIntArray188 = new int[local16.anInt1711];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt1711; local124++) {
			@Pc(130) int local130 = this.anIntArray185[local124];
			@Pc(135) int local135 = this.anIntArray188[local124];
			@Pc(140) int local140 = this.anIntArray180[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray188[local124] = local135 + local176 - local122;
		}
		local16.anInt1706 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIII)V")
	private void method1095(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static63.anInt1716 = 0;
			Static63.anInt1714 = 0;
			Static63.anInt1712 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray12.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray12[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static63.anInt1716 += this.anIntArray185[local36];
						Static63.anInt1714 += this.anIntArray188[local36];
						Static63.anInt1712 += this.anIntArray180[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static63.anInt1716 = Static63.anInt1716 / local6 + arg2;
				Static63.anInt1714 = Static63.anInt1714 / local6 + arg3;
				Static63.anInt1712 = Static63.anInt1712 / local6 + arg4;
			} else {
				Static63.anInt1716 = arg2;
				Static63.anInt1714 = arg3;
				Static63.anInt1712 = arg4;
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
						this.anIntArray185[local31] += arg2;
						this.anIntArray188[local31] += arg3;
						this.anIntArray180[local31] += arg4;
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
						this.anIntArray185[local31] -= Static63.anInt1716;
						this.anIntArray188[local31] -= Static63.anInt1714;
						this.anIntArray180[local31] -= Static63.anInt1712;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static63.anIntArray193[local225];
							local235 = Static63.anIntArray206[local225];
							local251 = this.anIntArray188[local31] * local231 + this.anIntArray185[local31] * local235 >> 16;
							this.anIntArray188[local31] = this.anIntArray188[local31] * local235 - this.anIntArray185[local31] * local231 >> 16;
							this.anIntArray185[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static63.anIntArray193[local36];
							local235 = Static63.anIntArray206[local36];
							local251 = this.anIntArray188[local31] * local235 - this.anIntArray180[local31] * local231 >> 16;
							this.anIntArray180[local31] = this.anIntArray188[local31] * local231 + this.anIntArray180[local31] * local235 >> 16;
							this.anIntArray188[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static63.anIntArray193[local219];
							local235 = Static63.anIntArray206[local219];
							local251 = this.anIntArray180[local31] * local231 + this.anIntArray185[local31] * local235 >> 16;
							this.anIntArray180[local31] = this.anIntArray180[local31] * local235 - this.anIntArray185[local31] * local231 >> 16;
							this.anIntArray185[local31] = local251;
						}
						this.anIntArray185[local31] += Static63.anInt1716;
						this.anIntArray188[local31] += Static63.anInt1714;
						this.anIntArray180[local31] += Static63.anInt1712;
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
						this.anIntArray185[local31] -= Static63.anInt1716;
						this.anIntArray188[local31] -= Static63.anInt1714;
						this.anIntArray180[local31] -= Static63.anInt1712;
						this.anIntArray185[local31] = this.anIntArray185[local31] * arg2 / 128;
						this.anIntArray188[local31] = this.anIntArray188[local31] * arg3 / 128;
						this.anIntArray180[local31] = this.anIntArray180[local31] * arg4 / 128;
						this.anIntArray185[local31] += Static63.anInt1716;
						this.anIntArray188[local31] += Static63.anInt1714;
						this.anIntArray180[local31] += Static63.anInt1712;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray11 != null && this.aByteArray24 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray11.length) {
					local115 = this.anIntArrayArray11[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray24[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray24[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	private void method1096() {
		if (this.anInt1706 == 2) {
			return;
		}
		this.anInt1706 = 2;
		this.anInt1709 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1711; local12++) {
			@Pc(18) int local18 = this.anIntArray185[local12];
			@Pc(23) int local23 = this.anIntArray188[local12];
			@Pc(28) int local28 = this.anIntArray180[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1709) {
				this.anInt1709 = local40;
			}
		}
		this.anInt1709 = (int) (Math.sqrt((double) this.anInt1709) + 0.99D);
		this.anInt1707 = this.anInt1709;
		this.anInt1710 = this.anInt1709 + this.anInt1709;
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)V")
	private void method1097(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static108.anInt2647;
		@Pc(3) int local3 = Static108.anInt2643;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray181[arg0];
		@Pc(15) int local15 = this.anIntArray183[arg0];
		@Pc(20) int local20 = this.anIntArray187[arg0];
		@Pc(24) int local24 = Static63.anIntArray192[local10];
		@Pc(28) int local28 = Static63.anIntArray192[local15];
		@Pc(32) int local32 = Static63.anIntArray192[local20];
		if (this.aByteArray24 == null) {
			Static108.anInt2644 = 0;
		} else {
			Static108.anInt2644 = this.aByteArray24[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static63.anIntArray196[0] = Static63.anIntArray204[local10];
			Static63.anIntArray202[0] = Static63.anIntArray203[local10];
			local5++;
			Static63.anIntArray194[0] = this.anIntArray182[arg0];
		} else {
			local73 = Static63.anIntArray208[local10];
			local77 = Static63.anIntArray197[local10];
			local82 = this.anIntArray182[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static63.anIntArray201[local32 - local24];
				Static63.anIntArray196[0] = local1 + (local73 + ((Static63.anIntArray208[local20] - local73) * local95 >> 16) << 9) / 50;
				Static63.anIntArray202[0] = local3 + (local77 + ((Static63.anIntArray197[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static63.anIntArray194[0] = local82 + ((this.anIntArray190[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static63.anIntArray201[local28 - local24];
				Static63.anIntArray196[local5] = local1 + (local73 + ((Static63.anIntArray208[local15] - local73) * local95 >> 16) << 9) / 50;
				Static63.anIntArray202[local5] = local3 + (local77 + ((Static63.anIntArray197[local15] - local77) * local95 >> 16) << 9) / 50;
				Static63.anIntArray194[local5++] = local82 + ((this.anIntArray186[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static63.anIntArray196[local5] = Static63.anIntArray204[local15];
			Static63.anIntArray202[local5] = Static63.anIntArray203[local15];
			Static63.anIntArray194[local5++] = this.anIntArray186[arg0];
		} else {
			local73 = Static63.anIntArray208[local15];
			local77 = Static63.anIntArray197[local15];
			local82 = this.anIntArray186[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static63.anIntArray201[local24 - local28];
				Static63.anIntArray196[local5] = local1 + (local73 + ((Static63.anIntArray208[local10] - local73) * local95 >> 16) << 9) / 50;
				Static63.anIntArray202[local5] = local3 + (local77 + ((Static63.anIntArray197[local10] - local77) * local95 >> 16) << 9) / 50;
				Static63.anIntArray194[local5++] = local82 + ((this.anIntArray182[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static63.anIntArray201[local32 - local28];
				Static63.anIntArray196[local5] = local1 + (local73 + ((Static63.anIntArray208[local20] - local73) * local95 >> 16) << 9) / 50;
				Static63.anIntArray202[local5] = local3 + (local77 + ((Static63.anIntArray197[local20] - local77) * local95 >> 16) << 9) / 50;
				Static63.anIntArray194[local5++] = local82 + ((this.anIntArray190[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static63.anIntArray196[local5] = Static63.anIntArray204[local20];
			Static63.anIntArray202[local5] = Static63.anIntArray203[local20];
			Static63.anIntArray194[local5++] = this.anIntArray190[arg0];
		} else {
			local73 = Static63.anIntArray208[local20];
			local77 = Static63.anIntArray197[local20];
			local82 = this.anIntArray190[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static63.anIntArray201[local28 - local32];
				Static63.anIntArray196[local5] = local1 + (local73 + ((Static63.anIntArray208[local15] - local73) * local95 >> 16) << 9) / 50;
				Static63.anIntArray202[local5] = local3 + (local77 + ((Static63.anIntArray197[local15] - local77) * local95 >> 16) << 9) / 50;
				Static63.anIntArray194[local5++] = local82 + ((this.anIntArray186[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static63.anIntArray201[local24 - local32];
				Static63.anIntArray196[local5] = local1 + (local73 + ((Static63.anIntArray208[local10] - local73) * local95 >> 16) << 9) / 50;
				Static63.anIntArray202[local5] = local3 + (local77 + ((Static63.anIntArray197[local10] - local77) * local95 >> 16) << 9) / 50;
				Static63.anIntArray194[local5++] = local82 + ((this.anIntArray182[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static63.anIntArray196[0];
		local77 = Static63.anIntArray196[1];
		local82 = Static63.anIntArray196[2];
		local95 = Static63.anIntArray202[0];
		@Pc(590) int local590 = Static63.anIntArray202[1];
		@Pc(594) int local594 = Static63.anIntArray202[2];
		Static108.aBoolean146 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static108.anInt2649 || local77 > Static108.anInt2649 || local82 > Static108.anInt2649) {
				Static108.aBoolean146 = true;
			}
			if (this.aByteArray23 != null && this.aByteArray23[arg0] != -1) {
				local669 = this.aByteArray23[arg0] & 0xFF;
				local674 = this.anIntArray189[local669];
				local679 = this.anIntArray184[local669];
				local684 = this.anIntArray191[local669];
				if (this.anIntArray190[arg0] == -1) {
					Static108.method1782(local95, local590, local594, local73, local77, local82, this.anIntArray182[arg0], this.anIntArray182[arg0], this.anIntArray182[arg0], Static63.anIntArray208[local674], Static63.anIntArray208[local679], Static63.anIntArray208[local684], Static63.anIntArray197[local674], Static63.anIntArray197[local679], Static63.anIntArray197[local684], Static63.anIntArray192[local674], Static63.anIntArray192[local679], Static63.anIntArray192[local684], this.aShortArray5[arg0]);
				} else {
					Static108.method1782(local95, local590, local594, local73, local77, local82, Static63.anIntArray194[0], Static63.anIntArray194[1], Static63.anIntArray194[2], Static63.anIntArray208[local674], Static63.anIntArray208[local679], Static63.anIntArray208[local684], Static63.anIntArray197[local674], Static63.anIntArray197[local679], Static63.anIntArray197[local684], Static63.anIntArray192[local674], Static63.anIntArray192[local679], Static63.anIntArray192[local684], this.aShortArray5[arg0]);
				}
			} else if (this.anIntArray190[arg0] == -1) {
				Static108.method1779(local95, local590, local594, local73, local77, local82, Static63.anIntArray200[this.anIntArray182[arg0]]);
			} else {
				Static108.method1774(local95, local590, local594, local73, local77, local82, Static63.anIntArray194[0], Static63.anIntArray194[1], Static63.anIntArray194[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static108.anInt2649 || local77 > Static108.anInt2649 || local82 > Static108.anInt2649 || Static63.anIntArray196[3] < 0 || Static63.anIntArray196[3] > Static108.anInt2649) {
			Static108.aBoolean146 = true;
		}
		if (this.aByteArray23 == null || this.aByteArray23[arg0] == -1) {
			if (this.anIntArray190[arg0] == -1) {
				local669 = Static63.anIntArray200[this.anIntArray182[arg0]];
				Static108.method1779(local95, local590, local594, local73, local77, local82, local669);
				Static108.method1779(local95, local594, Static63.anIntArray202[3], local73, local82, Static63.anIntArray196[3], local669);
				return;
			}
			Static108.method1774(local95, local590, local594, local73, local77, local82, Static63.anIntArray194[0], Static63.anIntArray194[1], Static63.anIntArray194[2]);
			Static108.method1774(local95, local594, Static63.anIntArray202[3], local73, local82, Static63.anIntArray196[3], Static63.anIntArray194[0], Static63.anIntArray194[2], Static63.anIntArray194[3]);
			return;
		}
		local669 = this.aByteArray23[arg0] & 0xFF;
		local674 = this.anIntArray189[local669];
		local679 = this.anIntArray184[local669];
		local684 = this.anIntArray191[local669];
		@Pc(924) short local924 = this.aShortArray5[arg0];
		if (this.anIntArray190[arg0] == -1) {
			Static108.method1782(local95, local590, local594, local73, local77, local82, this.anIntArray182[arg0], this.anIntArray182[arg0], this.anIntArray182[arg0], Static63.anIntArray208[local674], Static63.anIntArray208[local679], Static63.anIntArray208[local684], Static63.anIntArray197[local674], Static63.anIntArray197[local679], Static63.anIntArray197[local684], Static63.anIntArray192[local674], Static63.anIntArray192[local679], Static63.anIntArray192[local684], local924);
			Static108.method1782(local95, local594, Static63.anIntArray202[3], local73, local82, Static63.anIntArray196[3], this.anIntArray182[arg0], this.anIntArray182[arg0], this.anIntArray182[arg0], Static63.anIntArray208[local674], Static63.anIntArray208[local679], Static63.anIntArray208[local684], Static63.anIntArray197[local674], Static63.anIntArray197[local679], Static63.anIntArray197[local684], Static63.anIntArray192[local674], Static63.anIntArray192[local679], Static63.anIntArray192[local684], local924);
			return;
		}
		Static108.method1782(local95, local590, local594, local73, local77, local82, Static63.anIntArray194[0], Static63.anIntArray194[1], Static63.anIntArray194[2], Static63.anIntArray208[local674], Static63.anIntArray208[local679], Static63.anIntArray208[local684], Static63.anIntArray197[local674], Static63.anIntArray197[local679], Static63.anIntArray197[local684], Static63.anIntArray192[local674], Static63.anIntArray192[local679], Static63.anIntArray192[local684], local924);
		Static108.method1782(local95, local594, Static63.anIntArray202[3], local73, local82, Static63.anIntArray196[3], Static63.anIntArray194[0], Static63.anIntArray194[2], Static63.anIntArray194[3], Static63.anIntArray208[local674], Static63.anIntArray208[local679], Static63.anIntArray208[local684], Static63.anIntArray197[local674], Static63.anIntArray197[local679], Static63.anIntArray197[local684], Static63.anIntArray192[local674], Static63.anIntArray192[local679], Static63.anIntArray192[local684], local924);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1098(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static63.aByteArray25.length < this.anInt1704) {
			Static63.aByteArray25 = new byte[this.anInt1704 + 100];
		}
		return this.method1101(arg0, Static63.aClass1_Sub1_Sub1_Sub2_2, Static63.aByteArray25);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method1099(@OriginalArg(0) Class1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray12 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class13 local12 = arg0.aClass13Array1[arg1];
		@Pc(15) Class1_Sub10 local15 = local12.aClass1_Sub10_1;
		Static63.anInt1716 = 0;
		Static63.anInt1714 = 0;
		Static63.anInt1712 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt653; local23++) {
			@Pc(29) int local29 = local12.anIntArray71[local23];
			this.method1095(local15.anIntArray118[local29], local15.anIntArrayArray6[local29], local12.anIntArray67[local23], local12.anIntArray73[local23], local12.anIntArray74[local23]);
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!ka;[B)Lclient!ka;")
	private Class1_Sub1_Sub1_Sub2 method1101(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1711 = this.anInt1711;
		arg1.anInt1704 = this.anInt1704;
		arg1.anInt1708 = this.anInt1708;
		if (arg1.anIntArray185 == null || arg1.anIntArray185.length < this.anInt1711) {
			arg1.anIntArray185 = new int[this.anInt1711 + 100];
			arg1.anIntArray188 = new int[this.anInt1711 + 100];
			arg1.anIntArray180 = new int[this.anInt1711 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1711; local43++) {
			arg1.anIntArray185[local43] = this.anIntArray185[local43];
			arg1.anIntArray188[local43] = this.anIntArray188[local43];
			arg1.anIntArray180[local43] = this.anIntArray180[local43];
		}
		if (arg0) {
			arg1.aByteArray24 = this.aByteArray24;
		} else {
			arg1.aByteArray24 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray24 == null) {
				for (local88 = 0; local88 < this.anInt1704; local88++) {
					arg1.aByteArray24[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1704; local88++) {
					arg1.aByteArray24[local88] = this.aByteArray24[local88];
				}
			}
		}
		arg1.anIntArray181 = this.anIntArray181;
		arg1.anIntArray183 = this.anIntArray183;
		arg1.anIntArray187 = this.anIntArray187;
		arg1.anIntArray182 = this.anIntArray182;
		arg1.anIntArray186 = this.anIntArray186;
		arg1.anIntArray190 = this.anIntArray190;
		arg1.aByteArray22 = this.aByteArray22;
		arg1.aByteArray23 = this.aByteArray23;
		arg1.aShortArray5 = this.aShortArray5;
		arg1.aByte6 = this.aByte6;
		arg1.anIntArray189 = this.anIntArray189;
		arg1.anIntArray184 = this.anIntArray184;
		arg1.anIntArray191 = this.anIntArray191;
		arg1.anIntArrayArray12 = this.anIntArrayArray12;
		arg1.anIntArrayArray11 = this.anIntArrayArray11;
		arg1.aBoolean92 = this.aBoolean92;
		arg1.anInt1706 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)V")
	public void method1102(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static63.anIntArray193[arg0];
		@Pc(7) int local7 = Static63.anIntArray206[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1711; local9++) {
			@Pc(26) int local26 = this.anIntArray188[local9] * local7 - this.anIntArray180[local9] * local3 >> 16;
			this.anIntArray180[local9] = this.anIntArray188[local9] * local3 + this.anIntArray180[local9] * local7 >> 16;
			this.anIntArray188[local9] = local26;
		}
		this.anInt1706 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	public void method1103() {
		if (this.anInt1706 == 1) {
			return;
		}
		this.anInt1706 = 1;
		super.anInt2759 = 0;
		this.anInt1705 = 0;
		this.anInt1709 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1711; local18++) {
			@Pc(24) int local24 = this.anIntArray185[local18];
			@Pc(29) int local29 = this.anIntArray188[local18];
			@Pc(34) int local34 = this.anIntArray180[local18];
			if (-local29 > super.anInt2759) {
				super.anInt2759 = -local29;
			}
			if (local29 > this.anInt1705) {
				this.anInt1705 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1709) {
				this.anInt1709 = local58;
			}
		}
		this.anInt1709 = (int) (Math.sqrt((double) this.anInt1709) + 0.99D);
		this.anInt1707 = (int) (Math.sqrt((double) (this.anInt1709 * this.anInt1709 + super.anInt2759 * super.anInt2759)) + 0.99D);
		this.anInt1710 = this.anInt1707 + (int) (Math.sqrt((double) (this.anInt1709 * this.anInt1709 + this.anInt1705 * this.anInt1705)) + 0.99D);
	}
}
