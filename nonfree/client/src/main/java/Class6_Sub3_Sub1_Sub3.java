import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class6_Sub3_Sub1_Sub3 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "[I")
	public int[] anIntArray78;

	@OriginalMember(owner = "client!df", name = "pb", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!df", name = "rb", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!df", name = "sb", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!df", name = "tb", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!df", name = "ub", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!df", name = "vb", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!df", name = "xb", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!df", name = "yb", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!df", name = "zb", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!df", name = "Ab", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!df", name = "Db", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!df", name = "Fb", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!df", name = "Gb", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!df", name = "Hb", descriptor = "[I")
	public int[] anIntArray87;

	@OriginalMember(owner = "client!df", name = "Ib", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!df", name = "Jb", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!df", name = "Kb", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!df", name = "Lb", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!df", name = "Nb", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!df", name = "Pb", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!df", name = "Qb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!df", name = "hc", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!df", name = "Bb", descriptor = "I")
	public int anInt884 = 0;

	@OriginalMember(owner = "client!df", name = "Eb", descriptor = "I")
	public int anInt885 = 0;

	@OriginalMember(owner = "client!df", name = "Cb", descriptor = "B")
	public byte aByte2 = 0;

	@OriginalMember(owner = "client!df", name = "qb", descriptor = "Z")
	public boolean aBoolean43 = false;

	@OriginalMember(owner = "client!df", name = "Mb", descriptor = "I")
	public int anInt888 = 0;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub1_Sub3() {
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([Lclient!df;I)V")
	public Class6_Sub3_Sub1_Sub3(@OriginalArg(0) Class6_Sub3_Sub1_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt884 = 0;
		this.anInt885 = 0;
		this.anInt888 = 0;
		this.aByte2 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class6_Sub3_Sub1_Sub3 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt884 += local41.anInt884;
				this.anInt885 += local41.anInt885;
				this.anInt888 += local41.anInt888;
				if (local41.aByteArray12 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local41.aByte2;
					}
					if (this.aByte2 != local41.aByte2) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray10 != null;
				local22 |= local41.aByteArray13 != null;
			}
		}
		this.anIntArray86 = new int[this.anInt884];
		this.anIntArray87 = new int[this.anInt884];
		this.anIntArray78 = new int[this.anInt884];
		this.anIntArray79 = new int[this.anInt885];
		this.anIntArray84 = new int[this.anInt885];
		this.anIntArray81 = new int[this.anInt885];
		this.anIntArray88 = new int[this.anInt885];
		this.anIntArray89 = new int[this.anInt885];
		this.anIntArray83 = new int[this.anInt885];
		if (this.anInt888 > 0) {
			this.anIntArray85 = new int[this.anInt888];
			this.anIntArray80 = new int[this.anInt888];
			this.anIntArray82 = new int[this.anInt888];
		}
		if (local18) {
			this.aByteArray12 = new byte[this.anInt885];
		}
		if (local20) {
			this.aByteArray10 = new byte[this.anInt885];
		}
		if (local22) {
			this.aByteArray13 = new byte[this.anInt885];
			this.aShortArray4 = new short[this.anInt885];
		}
		this.anInt884 = 0;
		this.anInt885 = 0;
		this.anInt888 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class6_Sub3_Sub1_Sub3 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt884;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt884; local221++) {
					this.anIntArray86[this.anInt884] = local214.anIntArray86[local221];
					this.anIntArray87[this.anInt884] = local214.anIntArray87[local221];
					this.anIntArray78[this.anInt884] = local214.anIntArray78[local221];
					this.anInt884++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt885; local262++) {
					this.anIntArray79[this.anInt885] = local214.anIntArray79[local262] + local219;
					this.anIntArray84[this.anInt885] = local214.anIntArray84[local262] + local219;
					this.anIntArray81[this.anInt885] = local214.anIntArray81[local262] + local219;
					this.anIntArray88[this.anInt885] = local214.anIntArray88[local262];
					this.anIntArray89[this.anInt885] = local214.anIntArray89[local262];
					this.anIntArray83[this.anInt885] = local214.anIntArray83[local262];
					if (local18) {
						if (local214.aByteArray12 == null) {
							this.aByteArray12[this.anInt885] = local214.aByte2;
						} else {
							this.aByteArray12[this.anInt885] = local214.aByteArray12[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray10 == null) {
							this.aByteArray10[this.anInt885] = 0;
						} else {
							this.aByteArray10[this.anInt885] = local214.aByteArray10[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray13 == null || local214.aByteArray13[local262] == -1) {
							this.aByteArray13[this.anInt885] = -1;
						} else {
							this.aByteArray13[this.anInt885] = (byte) (local214.aByteArray13[local262] + local207);
							this.aShortArray4[this.anInt885] = local214.aShortArray4[local262];
						}
					}
					this.anInt885++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt888; local418++) {
					this.anIntArray85[this.anInt888] = local214.anIntArray85[local418] + local219;
					this.anIntArray80[this.anInt888] = local214.anIntArray80[local418] + local219;
					this.anIntArray82[this.anInt888] = local214.anIntArray82[local418] + local219;
					this.anInt888++;
				}
				local207 += local214.anInt888;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public void method620() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt884; local1++) {
			@Pc(7) int local7 = this.anIntArray78[local1];
			this.anIntArray78[local1] = this.anIntArray86[local1];
			this.anIntArray86[local1] = -local7;
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method621(@OriginalArg(0) Class6_Sub3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray12 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class68 local12 = arg0.aClass68Array1[arg1];
		@Pc(15) Class6_Sub15 local15 = local12.aClass6_Sub15_1;
		Static26.anInt891 = 0;
		Static26.anInt894 = 0;
		Static26.anInt892 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2850; local23++) {
			@Pc(29) int local29 = local12.anIntArray310[local23];
			this.method633(local15.anIntArray291[local29], local15.anIntArrayArray34[local29], local12.anIntArray314[local23], local12.anIntArray315[local23], local12.anIntArray311[local23]);
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	public void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt884; local1++) {
			this.anIntArray86[local1] = this.anIntArray86[local1] * arg0 / 128;
			this.anIntArray87[local1] = this.anIntArray87[local1] * arg1 / 128;
			this.anIntArray78[local1] = this.anIntArray78[local1] * arg2 / 128;
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
	public void method623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static26.anIntArray91[0] = -1;
		if (this.anInt887 != 2 && this.anInt887 != 1) {
			this.method628();
		}
		@Pc(15) int local15 = Static107.anInt2995;
		@Pc(17) int local17 = Static107.anInt2996;
		@Pc(21) int local21 = Static26.anIntArray100[0];
		@Pc(25) int local25 = Static26.anIntArray96[0];
		@Pc(29) int local29 = Static26.anIntArray100[arg0];
		@Pc(33) int local33 = Static26.anIntArray96[arg0];
		@Pc(37) int local37 = Static26.anIntArray100[arg1];
		@Pc(41) int local41 = Static26.anIntArray96[arg1];
		@Pc(45) int local45 = Static26.anIntArray100[arg2];
		@Pc(49) int local49 = Static26.anIntArray96[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt884; local61++) {
			@Pc(67) int local67 = this.anIntArray86[local61];
			@Pc(72) int local72 = this.anIntArray87[local61];
			@Pc(77) int local77 = this.anIntArray78[local61];
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
			Static26.anIntArray101[local61] = local77 - local59;
			Static26.anIntArray105[local61] = local15 + (local67 << 9) / local77;
			Static26.anIntArray108[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt888 > 0) {
				Static26.anIntArray99[local61] = local67;
				Static26.anIntArray95[local61] = local89;
				Static26.anIntArray103[local61] = local77;
			}
		}
		try {
			this.method641(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
	public void method624(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static26.anIntArray100[arg0];
		@Pc(7) int local7 = Static26.anIntArray96[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt884; local9++) {
			@Pc(26) int local26 = this.anIntArray87[local9] * local7 - this.anIntArray78[local9] * local3 >> 16;
			this.anIntArray78[local9] = this.anIntArray87[local9] * local3 + this.anIntArray78[local9] * local7 >> 16;
			this.anIntArray87[local9] = local26;
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V")
	private void method625(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static107.anInt2995;
		@Pc(3) int local3 = Static107.anInt2996;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray79[arg0];
		@Pc(15) int local15 = this.anIntArray84[arg0];
		@Pc(20) int local20 = this.anIntArray81[arg0];
		@Pc(24) int local24 = Static26.anIntArray103[local10];
		@Pc(28) int local28 = Static26.anIntArray103[local15];
		@Pc(32) int local32 = Static26.anIntArray103[local20];
		if (this.aByteArray10 == null) {
			Static107.anInt2990 = 0;
		} else {
			Static107.anInt2990 = this.aByteArray10[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static26.anIntArray93[0] = Static26.anIntArray105[local10];
			Static26.anIntArray97[0] = Static26.anIntArray108[local10];
			local5++;
			Static26.anIntArray94[0] = this.anIntArray88[arg0];
		} else {
			local73 = Static26.anIntArray99[local10];
			local77 = Static26.anIntArray95[local10];
			local82 = this.anIntArray88[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static26.anIntArray107[local32 - local24];
				Static26.anIntArray93[0] = local1 + (local73 + ((Static26.anIntArray99[local20] - local73) * local95 >> 16) << 9) / 50;
				Static26.anIntArray97[0] = local3 + (local77 + ((Static26.anIntArray95[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static26.anIntArray94[0] = local82 + ((this.anIntArray83[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static26.anIntArray107[local28 - local24];
				Static26.anIntArray93[local5] = local1 + (local73 + ((Static26.anIntArray99[local15] - local73) * local95 >> 16) << 9) / 50;
				Static26.anIntArray97[local5] = local3 + (local77 + ((Static26.anIntArray95[local15] - local77) * local95 >> 16) << 9) / 50;
				Static26.anIntArray94[local5++] = local82 + ((this.anIntArray89[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static26.anIntArray93[local5] = Static26.anIntArray105[local15];
			Static26.anIntArray97[local5] = Static26.anIntArray108[local15];
			Static26.anIntArray94[local5++] = this.anIntArray89[arg0];
		} else {
			local73 = Static26.anIntArray99[local15];
			local77 = Static26.anIntArray95[local15];
			local82 = this.anIntArray89[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static26.anIntArray107[local24 - local28];
				Static26.anIntArray93[local5] = local1 + (local73 + ((Static26.anIntArray99[local10] - local73) * local95 >> 16) << 9) / 50;
				Static26.anIntArray97[local5] = local3 + (local77 + ((Static26.anIntArray95[local10] - local77) * local95 >> 16) << 9) / 50;
				Static26.anIntArray94[local5++] = local82 + ((this.anIntArray88[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static26.anIntArray107[local32 - local28];
				Static26.anIntArray93[local5] = local1 + (local73 + ((Static26.anIntArray99[local20] - local73) * local95 >> 16) << 9) / 50;
				Static26.anIntArray97[local5] = local3 + (local77 + ((Static26.anIntArray95[local20] - local77) * local95 >> 16) << 9) / 50;
				Static26.anIntArray94[local5++] = local82 + ((this.anIntArray83[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static26.anIntArray93[local5] = Static26.anIntArray105[local20];
			Static26.anIntArray97[local5] = Static26.anIntArray108[local20];
			Static26.anIntArray94[local5++] = this.anIntArray83[arg0];
		} else {
			local73 = Static26.anIntArray99[local20];
			local77 = Static26.anIntArray95[local20];
			local82 = this.anIntArray83[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static26.anIntArray107[local28 - local32];
				Static26.anIntArray93[local5] = local1 + (local73 + ((Static26.anIntArray99[local15] - local73) * local95 >> 16) << 9) / 50;
				Static26.anIntArray97[local5] = local3 + (local77 + ((Static26.anIntArray95[local15] - local77) * local95 >> 16) << 9) / 50;
				Static26.anIntArray94[local5++] = local82 + ((this.anIntArray89[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static26.anIntArray107[local24 - local32];
				Static26.anIntArray93[local5] = local1 + (local73 + ((Static26.anIntArray99[local10] - local73) * local95 >> 16) << 9) / 50;
				Static26.anIntArray97[local5] = local3 + (local77 + ((Static26.anIntArray95[local10] - local77) * local95 >> 16) << 9) / 50;
				Static26.anIntArray94[local5++] = local82 + ((this.anIntArray88[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static26.anIntArray93[0];
		local77 = Static26.anIntArray93[1];
		local82 = Static26.anIntArray93[2];
		local95 = Static26.anIntArray97[0];
		@Pc(590) int local590 = Static26.anIntArray97[1];
		@Pc(594) int local594 = Static26.anIntArray97[2];
		Static107.aBoolean161 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static107.anInt2997 || local77 > Static107.anInt2997 || local82 > Static107.anInt2997) {
				Static107.aBoolean161 = true;
			}
			if (this.aByteArray13 != null && this.aByteArray13[arg0] != -1) {
				local669 = this.aByteArray13[arg0] & 0xFF;
				local674 = this.anIntArray85[local669];
				local679 = this.anIntArray80[local669];
				local684 = this.anIntArray82[local669];
				if (this.anIntArray83[arg0] == -1) {
					Static107.method1998(local95, local590, local594, local73, local77, local82, this.anIntArray88[arg0], this.anIntArray88[arg0], this.anIntArray88[arg0], Static26.anIntArray99[local674], Static26.anIntArray99[local679], Static26.anIntArray99[local684], Static26.anIntArray95[local674], Static26.anIntArray95[local679], Static26.anIntArray95[local684], Static26.anIntArray103[local674], Static26.anIntArray103[local679], Static26.anIntArray103[local684], this.aShortArray4[arg0]);
				} else {
					Static107.method1998(local95, local590, local594, local73, local77, local82, Static26.anIntArray94[0], Static26.anIntArray94[1], Static26.anIntArray94[2], Static26.anIntArray99[local674], Static26.anIntArray99[local679], Static26.anIntArray99[local684], Static26.anIntArray95[local674], Static26.anIntArray95[local679], Static26.anIntArray95[local684], Static26.anIntArray103[local674], Static26.anIntArray103[local679], Static26.anIntArray103[local684], this.aShortArray4[arg0]);
				}
			} else if (this.anIntArray83[arg0] == -1) {
				Static107.method2000(local95, local590, local594, local73, local77, local82, Static26.anIntArray98[this.anIntArray88[arg0]]);
			} else {
				Static107.method1996(local95, local590, local594, local73, local77, local82, Static26.anIntArray94[0], Static26.anIntArray94[1], Static26.anIntArray94[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static107.anInt2997 || local77 > Static107.anInt2997 || local82 > Static107.anInt2997 || Static26.anIntArray93[3] < 0 || Static26.anIntArray93[3] > Static107.anInt2997) {
			Static107.aBoolean161 = true;
		}
		if (this.aByteArray13 == null || this.aByteArray13[arg0] == -1) {
			if (this.anIntArray83[arg0] == -1) {
				local669 = Static26.anIntArray98[this.anIntArray88[arg0]];
				Static107.method2000(local95, local590, local594, local73, local77, local82, local669);
				Static107.method2000(local95, local594, Static26.anIntArray97[3], local73, local82, Static26.anIntArray93[3], local669);
				return;
			}
			Static107.method1996(local95, local590, local594, local73, local77, local82, Static26.anIntArray94[0], Static26.anIntArray94[1], Static26.anIntArray94[2]);
			Static107.method1996(local95, local594, Static26.anIntArray97[3], local73, local82, Static26.anIntArray93[3], Static26.anIntArray94[0], Static26.anIntArray94[2], Static26.anIntArray94[3]);
			return;
		}
		local669 = this.aByteArray13[arg0] & 0xFF;
		local674 = this.anIntArray85[local669];
		local679 = this.anIntArray80[local669];
		local684 = this.anIntArray82[local669];
		@Pc(924) short local924 = this.aShortArray4[arg0];
		if (this.anIntArray83[arg0] == -1) {
			Static107.method1998(local95, local590, local594, local73, local77, local82, this.anIntArray88[arg0], this.anIntArray88[arg0], this.anIntArray88[arg0], Static26.anIntArray99[local674], Static26.anIntArray99[local679], Static26.anIntArray99[local684], Static26.anIntArray95[local674], Static26.anIntArray95[local679], Static26.anIntArray95[local684], Static26.anIntArray103[local674], Static26.anIntArray103[local679], Static26.anIntArray103[local684], local924);
			Static107.method1998(local95, local594, Static26.anIntArray97[3], local73, local82, Static26.anIntArray93[3], this.anIntArray88[arg0], this.anIntArray88[arg0], this.anIntArray88[arg0], Static26.anIntArray99[local674], Static26.anIntArray99[local679], Static26.anIntArray99[local684], Static26.anIntArray95[local674], Static26.anIntArray95[local679], Static26.anIntArray95[local684], Static26.anIntArray103[local674], Static26.anIntArray103[local679], Static26.anIntArray103[local684], local924);
			return;
		}
		Static107.method1998(local95, local590, local594, local73, local77, local82, Static26.anIntArray94[0], Static26.anIntArray94[1], Static26.anIntArray94[2], Static26.anIntArray99[local674], Static26.anIntArray99[local679], Static26.anIntArray99[local684], Static26.anIntArray95[local674], Static26.anIntArray95[local679], Static26.anIntArray95[local684], Static26.anIntArray103[local674], Static26.anIntArray103[local679], Static26.anIntArray103[local684], local924);
		Static107.method1998(local95, local594, Static26.anIntArray97[3], local73, local82, Static26.anIntArray93[3], Static26.anIntArray94[0], Static26.anIntArray94[2], Static26.anIntArray94[3], Static26.anIntArray99[local674], Static26.anIntArray99[local679], Static26.anIntArray99[local684], Static26.anIntArray95[local674], Static26.anIntArray95[local679], Static26.anIntArray95[local684], Static26.anIntArray103[local674], Static26.anIntArray103[local679], Static26.anIntArray103[local684], local924);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static26.anIntArray91[0] = -1;
		if (this.anInt887 != 1) {
			this.method632();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt886 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt886 << 9;
		if (local64 / local40 >= Static107.anInt2991) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt886 << 9;
		if (local77 / local40 <= Static107.anInt2993) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt886 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static107.anInt2994) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3082 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static107.anInt2998) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3082 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt888 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static26.aBoolean44) {
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
			local219 = Static26.anInt893 - Static107.anInt2995;
			local223 = Static26.anInt890 - Static107.anInt2996;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean43) {
					Static26.anIntArray106[Static26.anInt895++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static107.anInt2995;
		local219 = Static107.anInt2996;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static26.anIntArray100[arg0];
			local257 = Static26.anIntArray96[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt884; local269++) {
			@Pc(275) int local275 = this.anIntArray86[local269];
			@Pc(280) int local280 = this.anIntArray87[local269];
			@Pc(285) int local285 = this.anIntArray78[local269];
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
			Static26.anIntArray101[local269] = local285 - local29;
			if (local285 >= 50) {
				Static26.anIntArray105[local269] = local172 + (local275 << 9) / local285;
				Static26.anIntArray108[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static26.anIntArray105[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static26.anIntArray99[local269] = local275;
				Static26.anIntArray95[local269] = local297;
				Static26.anIntArray103[local269] = local285;
			}
		}
		try {
			this.method641(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method626(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static26.aByteArray11.length < this.anInt885) {
			Static26.aByteArray11 = new byte[this.anInt885 + 100];
		}
		return this.method630(arg0, Static26.aClass6_Sub3_Sub1_Sub3_1, Static26.aByteArray11);
	}

	@OriginalMember(owner = "client!df", name = "j", descriptor = "(I)V")
	private void method627(@OriginalArg(0) int arg0) {
		if (Static26.aBooleanArray5[arg0]) {
			this.method625(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray79[arg0];
		@Pc(17) int local17 = this.anIntArray84[arg0];
		@Pc(22) int local22 = this.anIntArray81[arg0];
		Static107.aBoolean161 = Static26.aBooleanArray6[arg0];
		if (this.aByteArray10 == null) {
			Static107.anInt2990 = 0;
		} else {
			Static107.anInt2990 = this.aByteArray10[arg0] & 0xFF;
		}
		if (this.aByteArray13 != null && this.aByteArray13[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray13[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray85[local119];
			@Pc(129) int local129 = this.anIntArray80[local119];
			@Pc(134) int local134 = this.anIntArray82[local119];
			if (this.anIntArray83[arg0] == -1) {
				Static107.method1998(Static26.anIntArray108[local12], Static26.anIntArray108[local17], Static26.anIntArray108[local22], Static26.anIntArray105[local12], Static26.anIntArray105[local17], Static26.anIntArray105[local22], this.anIntArray88[arg0], this.anIntArray88[arg0], this.anIntArray88[arg0], Static26.anIntArray99[local124], Static26.anIntArray99[local129], Static26.anIntArray99[local134], Static26.anIntArray95[local124], Static26.anIntArray95[local129], Static26.anIntArray95[local134], Static26.anIntArray103[local124], Static26.anIntArray103[local129], Static26.anIntArray103[local134], this.aShortArray4[arg0]);
			} else {
				Static107.method1998(Static26.anIntArray108[local12], Static26.anIntArray108[local17], Static26.anIntArray108[local22], Static26.anIntArray105[local12], Static26.anIntArray105[local17], Static26.anIntArray105[local22], this.anIntArray88[arg0], this.anIntArray89[arg0], this.anIntArray83[arg0], Static26.anIntArray99[local124], Static26.anIntArray99[local129], Static26.anIntArray99[local134], Static26.anIntArray95[local124], Static26.anIntArray95[local129], Static26.anIntArray95[local134], Static26.anIntArray103[local124], Static26.anIntArray103[local129], Static26.anIntArray103[local134], this.aShortArray4[arg0]);
			}
		} else if (this.anIntArray83[arg0] == -1) {
			Static107.method2000(Static26.anIntArray108[local12], Static26.anIntArray108[local17], Static26.anIntArray108[local22], Static26.anIntArray105[local12], Static26.anIntArray105[local17], Static26.anIntArray105[local22], Static26.anIntArray98[this.anIntArray88[arg0]]);
		} else {
			Static107.method1996(Static26.anIntArray108[local12], Static26.anIntArray108[local17], Static26.anIntArray108[local22], Static26.anIntArray105[local12], Static26.anIntArray105[local17], Static26.anIntArray105[local22], this.anIntArray88[arg0], this.anIntArray89[arg0], this.anIntArray83[arg0]);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
	private void method628() {
		if (this.anInt887 == 2) {
			return;
		}
		this.anInt887 = 2;
		this.anInt886 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt884; local12++) {
			@Pc(18) int local18 = this.anIntArray86[local12];
			@Pc(23) int local23 = this.anIntArray87[local12];
			@Pc(28) int local28 = this.anIntArray78[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt886) {
				this.anInt886 = local40;
			}
		}
		this.anInt886 = (int) (Math.sqrt((double) this.anInt886) + 0.99D);
		this.anInt889 = this.anInt886;
		this.anInt883 = this.anInt886 + this.anInt886;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(Z)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method629(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static26.aByteArray14.length < this.anInt885) {
			Static26.aByteArray14 = new byte[this.anInt885 + 100];
		}
		return this.method630(arg0, Static26.aClass6_Sub3_Sub1_Sub3_2, Static26.aByteArray14);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLclient!df;[B)Lclient!df;")
	private Class6_Sub3_Sub1_Sub3 method630(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub3_Sub1_Sub3 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt884 = this.anInt884;
		arg1.anInt885 = this.anInt885;
		arg1.anInt888 = this.anInt888;
		if (arg1.anIntArray86 == null || arg1.anIntArray86.length < this.anInt884) {
			arg1.anIntArray86 = new int[this.anInt884 + 100];
			arg1.anIntArray87 = new int[this.anInt884 + 100];
			arg1.anIntArray78 = new int[this.anInt884 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt884; local43++) {
			arg1.anIntArray86[local43] = this.anIntArray86[local43];
			arg1.anIntArray87[local43] = this.anIntArray87[local43];
			arg1.anIntArray78[local43] = this.anIntArray78[local43];
		}
		if (arg0) {
			arg1.aByteArray10 = this.aByteArray10;
		} else {
			arg1.aByteArray10 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray10 == null) {
				for (local88 = 0; local88 < this.anInt885; local88++) {
					arg1.aByteArray10[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt885; local88++) {
					arg1.aByteArray10[local88] = this.aByteArray10[local88];
				}
			}
		}
		arg1.anIntArray79 = this.anIntArray79;
		arg1.anIntArray84 = this.anIntArray84;
		arg1.anIntArray81 = this.anIntArray81;
		arg1.anIntArray88 = this.anIntArray88;
		arg1.anIntArray89 = this.anIntArray89;
		arg1.anIntArray83 = this.anIntArray83;
		arg1.aByteArray12 = this.aByteArray12;
		arg1.aByteArray13 = this.aByteArray13;
		arg1.aShortArray4 = this.aShortArray4;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray85 = this.anIntArray85;
		arg1.anIntArray80 = this.anIntArray80;
		arg1.anIntArray82 = this.anIntArray82;
		arg1.anIntArrayArray12 = this.anIntArrayArray12;
		arg1.anIntArrayArray11 = this.anIntArrayArray11;
		arg1.aBoolean43 = this.aBoolean43;
		arg1.anInt887 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIZ)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class6_Sub3_Sub1_Sub3 local16;
		if (arg4) {
			local16 = new Class6_Sub3_Sub1_Sub3();
			local16.anInt884 = this.anInt884;
			local16.anInt885 = this.anInt885;
			local16.anInt888 = this.anInt888;
			local16.anIntArray86 = this.anIntArray86;
			local16.anIntArray78 = this.anIntArray78;
			local16.anIntArray79 = this.anIntArray79;
			local16.anIntArray84 = this.anIntArray84;
			local16.anIntArray81 = this.anIntArray81;
			local16.anIntArray88 = this.anIntArray88;
			local16.anIntArray89 = this.anIntArray89;
			local16.anIntArray83 = this.anIntArray83;
			local16.aByteArray12 = this.aByteArray12;
			local16.aByteArray10 = this.aByteArray10;
			local16.aByteArray13 = this.aByteArray13;
			local16.aShortArray4 = this.aShortArray4;
			local16.aByte2 = this.aByte2;
			local16.anIntArray85 = this.anIntArray85;
			local16.anIntArray80 = this.anIntArray80;
			local16.anIntArray82 = this.anIntArray82;
			local16.anIntArrayArray12 = this.anIntArrayArray12;
			local16.anIntArrayArray11 = this.anIntArrayArray11;
			local16.aBoolean43 = this.aBoolean43;
			local16.anIntArray87 = new int[local16.anInt884];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt884; local124++) {
			@Pc(130) int local130 = this.anIntArray86[local124];
			@Pc(135) int local135 = this.anIntArray87[local124];
			@Pc(140) int local140 = this.anIntArray78[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray87[local124] = local135 + local176 - local122;
		}
		local16.anInt887 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
	public void method632() {
		if (this.anInt887 == 1) {
			return;
		}
		this.anInt887 = 1;
		super.anInt3082 = 0;
		this.anInt882 = 0;
		this.anInt886 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt884; local18++) {
			@Pc(24) int local24 = this.anIntArray86[local18];
			@Pc(29) int local29 = this.anIntArray87[local18];
			@Pc(34) int local34 = this.anIntArray78[local18];
			if (-local29 > super.anInt3082) {
				super.anInt3082 = -local29;
			}
			if (local29 > this.anInt882) {
				this.anInt882 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt886) {
				this.anInt886 = local58;
			}
		}
		this.anInt886 = (int) (Math.sqrt((double) this.anInt886) + 0.99D);
		this.anInt889 = (int) (Math.sqrt((double) (this.anInt886 * this.anInt886 + super.anInt3082 * super.anInt3082)) + 0.99D);
		this.anInt883 = this.anInt889 + (int) (Math.sqrt((double) (this.anInt886 * this.anInt886 + this.anInt882 * this.anInt882)) + 0.99D);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[IIII)V")
	private void method633(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static26.anInt891 = 0;
			Static26.anInt894 = 0;
			Static26.anInt892 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray12.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray12[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static26.anInt891 += this.anIntArray86[local36];
						Static26.anInt894 += this.anIntArray87[local36];
						Static26.anInt892 += this.anIntArray78[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static26.anInt891 = Static26.anInt891 / local6 + arg2;
				Static26.anInt894 = Static26.anInt894 / local6 + arg3;
				Static26.anInt892 = Static26.anInt892 / local6 + arg4;
			} else {
				Static26.anInt891 = arg2;
				Static26.anInt894 = arg3;
				Static26.anInt892 = arg4;
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
						this.anIntArray86[local31] += arg2;
						this.anIntArray87[local31] += arg3;
						this.anIntArray78[local31] += arg4;
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
						this.anIntArray86[local31] -= Static26.anInt891;
						this.anIntArray87[local31] -= Static26.anInt894;
						this.anIntArray78[local31] -= Static26.anInt892;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static26.anIntArray100[local225];
							local235 = Static26.anIntArray96[local225];
							local251 = this.anIntArray87[local31] * local231 + this.anIntArray86[local31] * local235 >> 16;
							this.anIntArray87[local31] = this.anIntArray87[local31] * local235 - this.anIntArray86[local31] * local231 >> 16;
							this.anIntArray86[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static26.anIntArray100[local36];
							local235 = Static26.anIntArray96[local36];
							local251 = this.anIntArray87[local31] * local235 - this.anIntArray78[local31] * local231 >> 16;
							this.anIntArray78[local31] = this.anIntArray87[local31] * local231 + this.anIntArray78[local31] * local235 >> 16;
							this.anIntArray87[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static26.anIntArray100[local219];
							local235 = Static26.anIntArray96[local219];
							local251 = this.anIntArray78[local31] * local231 + this.anIntArray86[local31] * local235 >> 16;
							this.anIntArray78[local31] = this.anIntArray78[local31] * local235 - this.anIntArray86[local31] * local231 >> 16;
							this.anIntArray86[local31] = local251;
						}
						this.anIntArray86[local31] += Static26.anInt891;
						this.anIntArray87[local31] += Static26.anInt894;
						this.anIntArray78[local31] += Static26.anInt892;
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
						this.anIntArray86[local31] -= Static26.anInt891;
						this.anIntArray87[local31] -= Static26.anInt894;
						this.anIntArray78[local31] -= Static26.anInt892;
						this.anIntArray86[local31] = this.anIntArray86[local31] * arg2 / 128;
						this.anIntArray87[local31] = this.anIntArray87[local31] * arg3 / 128;
						this.anIntArray78[local31] = this.anIntArray78[local31] * arg4 / 128;
						this.anIntArray86[local31] += Static26.anInt891;
						this.anIntArray87[local31] += Static26.anInt894;
						this.anIntArray78[local31] += Static26.anInt892;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray11 != null && this.aByteArray10 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray11.length) {
					local115 = this.anIntArrayArray11[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray10[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray10[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	public void method635() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt884; local1++) {
			this.anIntArray86[local1] = -this.anIntArray86[local1];
			this.anIntArray78[local1] = -this.anIntArray78[local1];
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(III)V")
	public void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt884; local1++) {
			this.anIntArray86[local1] += arg0;
			this.anIntArray87[local1] += arg1;
			this.anIntArray78[local1] += arg2;
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIIIIIII)V")
	public void method638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static26.anIntArray91[0] = -1;
		if (this.anInt887 != 2 && this.anInt887 != 1) {
			this.method628();
		}
		@Pc(15) int local15 = Static107.anInt2995;
		@Pc(17) int local17 = Static107.anInt2996;
		@Pc(21) int local21 = Static26.anIntArray100[0];
		@Pc(25) int local25 = Static26.anIntArray96[0];
		@Pc(29) int local29 = Static26.anIntArray100[arg0];
		@Pc(33) int local33 = Static26.anIntArray96[arg0];
		@Pc(37) int local37 = Static26.anIntArray100[arg1];
		@Pc(41) int local41 = Static26.anIntArray96[arg1];
		@Pc(45) int local45 = Static26.anIntArray100[arg2];
		@Pc(49) int local49 = Static26.anIntArray96[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt884; local61++) {
			@Pc(67) int local67 = this.anIntArray86[local61];
			@Pc(72) int local72 = this.anIntArray87[local61];
			@Pc(77) int local77 = this.anIntArray78[local61];
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
			Static26.anIntArray101[local61] = local77 - local59;
			Static26.anIntArray105[local61] = local15 + (local67 << 9) / arg6;
			Static26.anIntArray108[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt888 > 0) {
				Static26.anIntArray99[local61] = local67;
				Static26.anIntArray95[local61] = local89;
				Static26.anIntArray103[local61] = local77;
			}
		}
		try {
			this.method641(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!jd;ILclient!jd;I[I)V")
	public void method639(@OriginalArg(0) Class6_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub3_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method621(arg0, arg1);
			return;
		}
		@Pc(18) Class68 local18 = arg0.aClass68Array1[arg1];
		@Pc(23) Class68 local23 = arg2.aClass68Array1[arg3];
		@Pc(26) Class6_Sub15 local26 = local18.aClass6_Sub15_1;
		Static26.anInt891 = 0;
		Static26.anInt894 = 0;
		Static26.anInt892 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2850; local41++) {
			local47 = local18.anIntArray310[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray291[local47] == 0) {
				this.method633(local26.anIntArray291[local47], local26.anIntArrayArray34[local47], local18.anIntArray314[local41], local18.anIntArray315[local41], local18.anIntArray311[local41]);
			}
		}
		Static26.anInt891 = 0;
		Static26.anInt894 = 0;
		Static26.anInt892 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2850; local47++) {
			@Pc(112) int local112 = local23.anIntArray310[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray291[local112] == 0) {
				this.method633(local26.anIntArray291[local112], local26.anIntArrayArray34[local112], local23.anIntArray314[local47], local23.anIntArray315[local47], local23.anIntArray311[local47]);
			}
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "()V")
	public void method640() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt884; local1++) {
			@Pc(7) int local7 = this.anIntArray86[local1];
			this.anIntArray86[local1] = this.anIntArray78[local1];
			this.anIntArray78[local1] = -local7;
		}
		this.anInt887 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZI)V")
	private void method641(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt883 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt883; local6++) {
			Static26.anIntArray91[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt885; local18++) {
			if (this.anIntArray83[local18] != -2) {
				local30 = this.anIntArray79[local18];
				local35 = this.anIntArray84[local18];
				local40 = this.anIntArray81[local18];
				local44 = Static26.anIntArray105[local30];
				local48 = Static26.anIntArray105[local35];
				local52 = Static26.anIntArray105[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static26.anIntArray99[local30];
					local71 = Static26.anIntArray99[local35];
					@Pc(75) int local75 = Static26.anIntArray99[local40];
					@Pc(79) int local79 = Static26.anIntArray95[local30];
					local83 = Static26.anIntArray95[local35];
					local87 = Static26.anIntArray95[local40];
					@Pc(91) int local91 = Static26.anIntArray103[local30];
					local95 = Static26.anIntArray103[local35];
					@Pc(99) int local99 = Static26.anIntArray103[local40];
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
						Static26.aBooleanArray5[local18] = true;
						@Pc(180) int local180 = (Static26.anIntArray101[local30] + Static26.anIntArray101[local35] + Static26.anIntArray101[local40]) / 3 + this.anInt889;
						Static26.anIntArrayArray14[local180][Static26.anIntArray91[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method634(Static26.anInt893, Static26.anInt890, Static26.anIntArray108[local30], Static26.anIntArray108[local35], Static26.anIntArray108[local40], local44, local48, local52)) {
						Static26.anIntArray106[Static26.anInt895++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static26.anIntArray108[local40] - Static26.anIntArray108[local35]) - (Static26.anIntArray108[local30] - Static26.anIntArray108[local35]) * (local52 - local48) > 0) {
						Static26.aBooleanArray5[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static107.anInt2997 && local48 <= Static107.anInt2997 && local52 <= Static107.anInt2997) {
							Static26.aBooleanArray6[local18] = false;
						} else {
							Static26.aBooleanArray6[local18] = true;
						}
						local67 = (Static26.anIntArray101[local30] + Static26.anIntArray101[local35] + Static26.anIntArray101[local40]) / 3 + this.anInt889;
						Static26.anIntArrayArray14[local67][Static26.anIntArray91[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray12 == null) {
			for (local30 = this.anInt883 - 1; local30 >= 0; local30--) {
				local35 = Static26.anIntArray91[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static26.anIntArrayArray14[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method627(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static26.anIntArray104[local30] = 0;
			Static26.anIntArray102[local30] = 0;
		}
		for (local35 = this.anInt883 - 1; local35 >= 0; local35--) {
			local40 = Static26.anIntArray91[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static26.anIntArrayArray14[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray12[local52];
					local71 = Static26.anIntArray104[local388]++;
					Static26.anIntArrayArray13[local388][local71] = local52;
					if (local388 < 10) {
						Static26.anIntArray102[local388] += local35;
					} else if (local388 == 10) {
						Static26.anIntArray92[local71] = local35;
					} else {
						Static26.anIntArray90[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static26.anIntArray104[1] > 0 || Static26.anIntArray104[2] > 0) {
			local40 = (Static26.anIntArray102[1] + Static26.anIntArray102[2]) / (Static26.anIntArray104[1] + Static26.anIntArray104[2]);
		}
		local44 = 0;
		if (Static26.anIntArray104[3] > 0 || Static26.anIntArray104[4] > 0) {
			local44 = (Static26.anIntArray102[3] + Static26.anIntArray102[4]) / (Static26.anIntArray104[3] + Static26.anIntArray104[4]);
		}
		local48 = 0;
		if (Static26.anIntArray104[6] > 0 || Static26.anIntArray104[8] > 0) {
			local48 = (Static26.anIntArray102[6] + Static26.anIntArray102[8]) / (Static26.anIntArray104[6] + Static26.anIntArray104[8]);
		}
		local67 = 0;
		local71 = Static26.anIntArray104[10];
		@Pc(521) int[] local521 = Static26.anIntArrayArray13[10];
		@Pc(523) int[] local523 = Static26.anIntArray92;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static26.anIntArray104[11];
			local521 = Static26.anIntArrayArray13[11];
			local523 = Static26.anIntArray90;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method627(local521[local67++]);
				if (local67 == local71 && local521 != Static26.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static26.anIntArray104[11];
					local521 = Static26.anIntArrayArray13[11];
					local523 = Static26.anIntArray90;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method627(local521[local67++]);
				if (local67 == local71 && local521 != Static26.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static26.anIntArray104[11];
					local521 = Static26.anIntArrayArray13[11];
					local523 = Static26.anIntArray90;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method627(local521[local67++]);
				if (local67 == local71 && local521 != Static26.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static26.anIntArray104[11];
					local521 = Static26.anIntArrayArray13[11];
					local523 = Static26.anIntArray90;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static26.anIntArray104[local83];
			@Pc(686) int[] local686 = Static26.anIntArrayArray13[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method627(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method627(local521[local67++]);
			if (local67 == local71 && local521 != Static26.anIntArrayArray13[11]) {
				local67 = 0;
				local521 = Static26.anIntArrayArray13[11];
				local71 = Static26.anIntArray104[11];
				local523 = Static26.anIntArray90;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "()I")
	public int method642() {
		this.method632();
		return this.anInt886;
	}
}
