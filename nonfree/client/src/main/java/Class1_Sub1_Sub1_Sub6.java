import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "sb", descriptor = "I")
	private int anInt1900;

	@OriginalMember(owner = "client!lb", name = "tb", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!lb", name = "ub", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!lb", name = "vb", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!lb", name = "wb", descriptor = "I")
	private int anInt1901;

	@OriginalMember(owner = "client!lb", name = "zb", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!lb", name = "Bb", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!lb", name = "Db", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!lb", name = "Eb", descriptor = "I")
	private int anInt1904;

	@OriginalMember(owner = "client!lb", name = "Fb", descriptor = "I")
	private int anInt1905;

	@OriginalMember(owner = "client!lb", name = "Gb", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!lb", name = "Hb", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!lb", name = "Ib", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!lb", name = "Jb", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!lb", name = "Kb", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!lb", name = "Mb", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!lb", name = "Nb", descriptor = "[I")
	public int[] anIntArray268;

	@OriginalMember(owner = "client!lb", name = "Pb", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!lb", name = "Rb", descriptor = "I")
	private int anInt1907;

	@OriginalMember(owner = "client!lb", name = "Tb", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!lb", name = "Ub", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!lb", name = "Vb", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!lb", name = "ec", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!lb", name = "yb", descriptor = "I")
	public int anInt1903 = 0;

	@OriginalMember(owner = "client!lb", name = "xb", descriptor = "I")
	public int anInt1902 = 0;

	@OriginalMember(owner = "client!lb", name = "Ob", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!lb", name = "Cb", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!lb", name = "Lb", descriptor = "I")
	public int anInt1906 = 0;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([Lclient!lb;I)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) Class1_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1903 = 0;
		this.anInt1906 = 0;
		this.anInt1902 = 0;
		this.aByte4 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class1_Sub1_Sub1_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1903 += local43.anInt1903;
				this.anInt1906 += local43.anInt1906;
				this.anInt1902 += local43.anInt1902;
				if (local43.aByteArray14 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local43.aByte4;
					}
					if (this.aByte4 != local43.aByte4) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray16 != null;
				local22 |= local43.aShortArray51 != null;
				local24 |= local43.aByteArray13 != null;
			}
		}
		this.anIntArray269 = new int[this.anInt1903];
		this.anIntArray260 = new int[this.anInt1903];
		this.anIntArray265 = new int[this.anInt1903];
		this.anIntArray262 = new int[this.anInt1906];
		this.anIntArray267 = new int[this.anInt1906];
		this.anIntArray270 = new int[this.anInt1906];
		this.anIntArray263 = new int[this.anInt1906];
		this.anIntArray271 = new int[this.anInt1906];
		this.anIntArray266 = new int[this.anInt1906];
		if (local18) {
			this.aByteArray14 = new byte[this.anInt1906];
		}
		if (local20) {
			this.aByteArray16 = new byte[this.anInt1906];
		}
		if (local22) {
			this.aShortArray51 = new short[this.anInt1906];
		}
		if (local24) {
			this.aByteArray13 = new byte[this.anInt1906];
		}
		if (this.anInt1902 > 0) {
			this.anIntArray261 = new int[this.anInt1902];
			this.anIntArray264 = new int[this.anInt1902];
			this.anIntArray268 = new int[this.anInt1902];
		}
		this.anInt1903 = 0;
		this.anInt1906 = 0;
		this.anInt1902 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class1_Sub1_Sub1_Sub6 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt1906; local229++) {
					this.anIntArray262[this.anInt1906] = local225.anIntArray262[local229] + this.anInt1903;
					this.anIntArray267[this.anInt1906] = local225.anIntArray267[local229] + this.anInt1903;
					this.anIntArray270[this.anInt1906] = local225.anIntArray270[local229] + this.anInt1903;
					this.anIntArray263[this.anInt1906] = local225.anIntArray263[local229];
					this.anIntArray271[this.anInt1906] = local225.anIntArray271[local229];
					this.anIntArray266[this.anInt1906] = local225.anIntArray266[local229];
					if (local18) {
						if (local225.aByteArray14 == null) {
							this.aByteArray14[this.anInt1906] = local225.aByte4;
						} else {
							this.aByteArray14[this.anInt1906] = local225.aByteArray14[local229];
						}
					}
					if (local20 && local225.aByteArray16 != null) {
						this.aByteArray16[this.anInt1906] = local225.aByteArray16[local229];
					}
					if (local22) {
						if (local225.aShortArray51 == null) {
							this.aShortArray51[this.anInt1906] = -1;
						} else {
							this.aShortArray51[this.anInt1906] = local225.aShortArray51[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray13 == null || local225.aByteArray13[local229] == -1) {
							this.aByteArray13[this.anInt1906] = -1;
						} else {
							this.aByteArray13[this.anInt1906] = (byte) (local225.aByteArray13[local229] + this.anInt1902);
						}
					}
					this.anInt1906++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt1902; local394++) {
					this.anIntArray261[this.anInt1902] = local225.anIntArray261[local394] + this.anInt1903;
					this.anIntArray264[this.anInt1902] = local225.anIntArray264[local394] + this.anInt1903;
					this.anIntArray268[this.anInt1902] = local225.anIntArray268[local394] + this.anInt1903;
					this.anInt1902++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt1903; local444++) {
					this.anIntArray269[this.anInt1903] = local225.anIntArray269[local444];
					this.anIntArray260[this.anInt1903] = local225.anIntArray260[local444];
					this.anIntArray265[this.anInt1903] = local225.anIntArray265[local444];
					this.anInt1903++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1325(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static62.aByteArray15.length < this.anInt1906) {
			Static62.aByteArray15 = new byte[this.anInt1906 + 100];
		}
		return this.method1336(arg0, Static62.aClass1_Sub1_Sub1_Sub6_2, Static62.aByteArray15);
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	public void method1326(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static62.anIntArray288[arg0];
		@Pc(7) int local7 = Static62.anIntArray284[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1903; local9++) {
			@Pc(26) int local26 = this.anIntArray260[local9] * local7 - this.anIntArray265[local9] * local3 >> 16;
			this.anIntArray265[local9] = this.anIntArray260[local9] * local3 + this.anIntArray265[local9] * local7 >> 16;
			this.anIntArray260[local9] = local26;
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	public void method1327() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1903; local1++) {
			@Pc(7) int local7 = this.anIntArray265[local1];
			this.anIntArray265[local1] = this.anIntArray269[local1];
			this.anIntArray269[local1] = -local7;
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([[IIIIZI)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1328(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1338();
		@Pc(6) int local6 = arg1 - this.anInt1905;
		@Pc(11) int local11 = arg1 + this.anInt1905;
		@Pc(16) int local16 = arg3 - this.anInt1905;
		@Pc(21) int local21 = arg3 + this.anInt1905;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class1_Sub1_Sub1_Sub6 local101;
		if (arg4) {
			local101 = new Class1_Sub1_Sub1_Sub6();
			local101.anInt1903 = this.anInt1903;
			local101.anInt1906 = this.anInt1906;
			local101.anInt1902 = this.anInt1902;
			local101.anIntArray269 = this.anIntArray269;
			local101.anIntArray265 = this.anIntArray265;
			local101.anIntArray262 = this.anIntArray262;
			local101.anIntArray267 = this.anIntArray267;
			local101.anIntArray270 = this.anIntArray270;
			local101.anIntArray263 = this.anIntArray263;
			local101.anIntArray271 = this.anIntArray271;
			local101.anIntArray266 = this.anIntArray266;
			local101.aByteArray14 = this.aByteArray14;
			local101.aByteArray16 = this.aByteArray16;
			local101.aByteArray13 = this.aByteArray13;
			local101.aShortArray51 = this.aShortArray51;
			local101.aByte4 = this.aByte4;
			local101.anIntArray261 = this.anIntArray261;
			local101.anIntArray264 = this.anIntArray264;
			local101.anIntArray268 = this.anIntArray268;
			local101.anIntArrayArray19 = this.anIntArrayArray19;
			local101.anIntArrayArray18 = this.anIntArrayArray18;
			local101.aBoolean75 = this.aBoolean75;
			local101.anIntArray260 = new int[local101.anInt1903];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt1903; local201++) {
				local209 = this.anIntArray269[local201] + arg1;
				local216 = this.anIntArray265[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray260[local201] = this.anIntArray260[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1903; local201++) {
				local209 = (-this.anIntArray260[local201] << 16) / super.anInt2699;
				if (local209 < arg5) {
					local216 = this.anIntArray269[local201] + arg1;
					local220 = this.anIntArray265[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray260[local201] = this.anIntArray260[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt1900 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	public void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1903; local1++) {
			this.anIntArray269[local1] = this.anIntArray269[local1] * arg0 / 128;
			this.anIntArray260[local1] = this.anIntArray260[local1] * arg1 / 128;
			this.anIntArray265[local1] = this.anIntArray265[local1] * arg2 / 128;
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	private void method1331(@OriginalArg(0) int arg0) {
		if (Static62.aBooleanArray11[arg0]) {
			this.method1345(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray262[arg0];
		@Pc(17) int local17 = this.anIntArray267[arg0];
		@Pc(22) int local22 = this.anIntArray270[arg0];
		Static91.aBoolean101 = Static62.aBooleanArray10[arg0];
		if (this.aByteArray16 == null) {
			Static91.anInt2377 = 0;
		} else {
			Static91.anInt2377 = this.aByteArray16[arg0] & 0xFF;
		}
		if (this.aShortArray51 != null && this.aShortArray51[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray13 == null || this.aByteArray13[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray13[arg0] & 0xFF;
				local133 = this.anIntArray261[local128];
				local138 = this.anIntArray264[local128];
				local143 = this.anIntArray268[local128];
			}
			if (this.anIntArray266[arg0] == -1) {
				Static91.method1679(Static62.anIntArray280[local12], Static62.anIntArray280[local17], Static62.anIntArray280[local22], Static62.anIntArray282[local12], Static62.anIntArray282[local17], Static62.anIntArray282[local22], this.anIntArray263[arg0], this.anIntArray263[arg0], this.anIntArray263[arg0], Static62.anIntArray281[local133], Static62.anIntArray281[local138], Static62.anIntArray281[local143], Static62.anIntArray276[local133], Static62.anIntArray276[local138], Static62.anIntArray276[local143], Static62.anIntArray285[local133], Static62.anIntArray285[local138], Static62.anIntArray285[local143], this.aShortArray51[arg0]);
			} else {
				Static91.method1679(Static62.anIntArray280[local12], Static62.anIntArray280[local17], Static62.anIntArray280[local22], Static62.anIntArray282[local12], Static62.anIntArray282[local17], Static62.anIntArray282[local22], this.anIntArray263[arg0], this.anIntArray271[arg0], this.anIntArray266[arg0], Static62.anIntArray281[local133], Static62.anIntArray281[local138], Static62.anIntArray281[local143], Static62.anIntArray276[local133], Static62.anIntArray276[local138], Static62.anIntArray276[local143], Static62.anIntArray285[local133], Static62.anIntArray285[local138], Static62.anIntArray285[local143], this.aShortArray51[arg0]);
			}
		} else if (this.anIntArray266[arg0] == -1) {
			Static91.method1696(Static62.anIntArray280[local12], Static62.anIntArray280[local17], Static62.anIntArray280[local22], Static62.anIntArray282[local12], Static62.anIntArray282[local17], Static62.anIntArray282[local22], Static62.anIntArray273[this.anIntArray263[arg0]]);
		} else {
			Static91.method1683(Static62.anIntArray280[local12], Static62.anIntArray280[local17], Static62.anIntArray280[local22], Static62.anIntArray282[local12], Static62.anIntArray282[local17], Static62.anIntArray282[local22], this.anIntArray263[arg0], this.anIntArray271[arg0], this.anIntArray266[arg0]);
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
	public void method1332() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1903; local1++) {
			this.anIntArray269[local1] = -this.anIntArray269[local1];
			this.anIntArray265[local1] = -this.anIntArray265[local1];
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1333(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static62.aByteArray17.length < this.anInt1906) {
			Static62.aByteArray17 = new byte[this.anInt1906 + 100];
		}
		return this.method1336(arg0, Static62.aClass1_Sub1_Sub1_Sub6_3, Static62.aByteArray17);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
	public int method1334() {
		this.method1338();
		return this.anInt1905;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pd;ILclient!pd;I[I)V")
	public void method1335(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1339(arg0, arg1);
			return;
		}
		@Pc(18) Class50 local18 = arg0.aClass50Array1[arg1];
		@Pc(23) Class50 local23 = arg2.aClass50Array1[arg3];
		@Pc(26) Class1_Sub21 local26 = local18.aClass1_Sub21_1;
		Static62.anInt1909 = 0;
		Static62.anInt1913 = 0;
		Static62.anInt1908 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2153; local41++) {
			local47 = local18.anIntArray345[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray476[local47] == 0) {
				this.method1342(local26.anIntArray476[local47], local26.anIntArrayArray30[local47], local18.anIntArray352[local41], local18.anIntArray349[local41], local18.anIntArray346[local41]);
			}
		}
		Static62.anInt1909 = 0;
		Static62.anInt1913 = 0;
		Static62.anInt1908 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2153; local47++) {
			@Pc(112) int local112 = local23.anIntArray345[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray476[local112] == 0) {
				this.method1342(local26.anIntArray476[local112], local26.anIntArrayArray30[local112], local23.anIntArray352[local47], local23.anIntArray349[local47], local23.anIntArray346[local47]);
			}
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!lb;[B)Lclient!lb;")
	private Class1_Sub1_Sub1_Sub6 method1336(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1903 = this.anInt1903;
		arg1.anInt1906 = this.anInt1906;
		arg1.anInt1902 = this.anInt1902;
		if (arg1.anIntArray269 == null || arg1.anIntArray269.length < this.anInt1903) {
			arg1.anIntArray269 = new int[this.anInt1903 + 100];
			arg1.anIntArray260 = new int[this.anInt1903 + 100];
			arg1.anIntArray265 = new int[this.anInt1903 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1903; local43++) {
			arg1.anIntArray269[local43] = this.anIntArray269[local43];
			arg1.anIntArray260[local43] = this.anIntArray260[local43];
			arg1.anIntArray265[local43] = this.anIntArray265[local43];
		}
		if (arg0) {
			arg1.aByteArray16 = this.aByteArray16;
		} else {
			arg1.aByteArray16 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray16 == null) {
				for (local88 = 0; local88 < this.anInt1906; local88++) {
					arg1.aByteArray16[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1906; local88++) {
					arg1.aByteArray16[local88] = this.aByteArray16[local88];
				}
			}
		}
		arg1.anIntArray262 = this.anIntArray262;
		arg1.anIntArray267 = this.anIntArray267;
		arg1.anIntArray270 = this.anIntArray270;
		arg1.anIntArray263 = this.anIntArray263;
		arg1.anIntArray271 = this.anIntArray271;
		arg1.anIntArray266 = this.anIntArray266;
		arg1.aByteArray14 = this.aByteArray14;
		arg1.aByteArray13 = this.aByteArray13;
		arg1.aShortArray51 = this.aShortArray51;
		arg1.aByte4 = this.aByte4;
		arg1.anIntArray261 = this.anIntArray261;
		arg1.anIntArray264 = this.anIntArray264;
		arg1.anIntArray268 = this.anIntArray268;
		arg1.anIntArrayArray19 = this.anIntArrayArray19;
		arg1.anIntArrayArray18 = this.anIntArrayArray18;
		arg1.aBoolean75 = this.aBoolean75;
		arg1.anInt1900 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
	public void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1903; local1++) {
			this.anIntArray269[local1] += arg0;
			this.anIntArray260[local1] += arg1;
			this.anIntArray265[local1] += arg2;
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()V")
	public void method1338() {
		if (this.anInt1900 == 1) {
			return;
		}
		this.anInt1900 = 1;
		super.anInt2699 = 0;
		this.anInt1904 = 0;
		this.anInt1905 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1903; local18++) {
			@Pc(24) int local24 = this.anIntArray269[local18];
			@Pc(29) int local29 = this.anIntArray260[local18];
			@Pc(34) int local34 = this.anIntArray265[local18];
			if (-local29 > super.anInt2699) {
				super.anInt2699 = -local29;
			}
			if (local29 > this.anInt1904) {
				this.anInt1904 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1905) {
				this.anInt1905 = local58;
			}
		}
		this.anInt1905 = (int) (Math.sqrt((double) this.anInt1905) + 0.99D);
		this.anInt1901 = (int) (Math.sqrt((double) (this.anInt1905 * this.anInt1905 + super.anInt2699 * super.anInt2699)) + 0.99D);
		this.anInt1907 = this.anInt1901 + (int) (Math.sqrt((double) (this.anInt1905 * this.anInt1905 + this.anInt1904 * this.anInt1904)) + 0.99D);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pd;I)V")
	public void method1339(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray19 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class50 local12 = arg0.aClass50Array1[arg1];
		@Pc(15) Class1_Sub21 local15 = local12.aClass1_Sub21_1;
		Static62.anInt1909 = 0;
		Static62.anInt1913 = 0;
		Static62.anInt1908 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2153; local23++) {
			@Pc(29) int local29 = local12.anIntArray345[local23];
			this.method1342(local15.anIntArray476[local29], local15.anIntArrayArray30[local29], local12.anIntArray352[local23], local12.anIntArray349[local23], local12.anIntArray346[local23]);
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
	public void method1340() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1903; local1++) {
			@Pc(7) int local7 = this.anIntArray269[local1];
			this.anIntArray269[local1] = this.anIntArray265[local1];
			this.anIntArray265[local1] = -local7;
		}
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()V")
	private void method1341() {
		if (this.anInt1900 == 2) {
			return;
		}
		this.anInt1900 = 2;
		this.anInt1905 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1903; local12++) {
			@Pc(18) int local18 = this.anIntArray269[local12];
			@Pc(23) int local23 = this.anIntArray260[local12];
			@Pc(28) int local28 = this.anIntArray265[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1905) {
				this.anInt1905 = local40;
			}
		}
		this.anInt1905 = (int) (Math.sqrt((double) this.anInt1905) + 0.99D);
		this.anInt1901 = this.anInt1905;
		this.anInt1907 = this.anInt1905 + this.anInt1905;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[IIII)V")
	private void method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static62.anInt1909 = 0;
			Static62.anInt1913 = 0;
			Static62.anInt1908 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray19.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray19[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static62.anInt1909 += this.anIntArray269[local36];
						Static62.anInt1913 += this.anIntArray260[local36];
						Static62.anInt1908 += this.anIntArray265[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static62.anInt1909 = Static62.anInt1909 / local6 + arg2;
				Static62.anInt1913 = Static62.anInt1913 / local6 + arg3;
				Static62.anInt1908 = Static62.anInt1908 / local6 + arg4;
			} else {
				Static62.anInt1909 = arg2;
				Static62.anInt1913 = arg3;
				Static62.anInt1908 = arg4;
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
						this.anIntArray269[local31] += arg2;
						this.anIntArray260[local31] += arg3;
						this.anIntArray265[local31] += arg4;
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
						this.anIntArray269[local31] -= Static62.anInt1909;
						this.anIntArray260[local31] -= Static62.anInt1913;
						this.anIntArray265[local31] -= Static62.anInt1908;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static62.anIntArray288[local225];
							local235 = Static62.anIntArray284[local225];
							local251 = this.anIntArray260[local31] * local231 + this.anIntArray269[local31] * local235 >> 16;
							this.anIntArray260[local31] = this.anIntArray260[local31] * local235 - this.anIntArray269[local31] * local231 >> 16;
							this.anIntArray269[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static62.anIntArray288[local36];
							local235 = Static62.anIntArray284[local36];
							local251 = this.anIntArray260[local31] * local235 - this.anIntArray265[local31] * local231 >> 16;
							this.anIntArray265[local31] = this.anIntArray260[local31] * local231 + this.anIntArray265[local31] * local235 >> 16;
							this.anIntArray260[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static62.anIntArray288[local219];
							local235 = Static62.anIntArray284[local219];
							local251 = this.anIntArray265[local31] * local231 + this.anIntArray269[local31] * local235 >> 16;
							this.anIntArray265[local31] = this.anIntArray265[local31] * local235 - this.anIntArray269[local31] * local231 >> 16;
							this.anIntArray269[local31] = local251;
						}
						this.anIntArray269[local31] += Static62.anInt1909;
						this.anIntArray260[local31] += Static62.anInt1913;
						this.anIntArray265[local31] += Static62.anInt1908;
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
						this.anIntArray269[local31] -= Static62.anInt1909;
						this.anIntArray260[local31] -= Static62.anInt1913;
						this.anIntArray265[local31] -= Static62.anInt1908;
						this.anIntArray269[local31] = this.anIntArray269[local31] * arg2 / 128;
						this.anIntArray260[local31] = this.anIntArray260[local31] * arg3 / 128;
						this.anIntArray265[local31] = this.anIntArray265[local31] * arg4 / 128;
						this.anIntArray269[local31] += Static62.anInt1909;
						this.anIntArray260[local31] += Static62.anInt1913;
						this.anIntArray265[local31] += Static62.anInt1908;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray18 != null && this.aByteArray16 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray18.length) {
					local115 = this.anIntArrayArray18[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray16[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray16[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static62.anIntArray290[0] = -1;
		if (this.anInt1900 != 1) {
			this.method1338();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt1905 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt1905 << 9;
		if (local64 / local40 >= Static91.anInt2378) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt1905 << 9;
		if (local77 / local40 <= Static91.anInt2372) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt1905 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static91.anInt2379) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2699 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static91.anInt2380) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2699 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt1902 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static62.aBoolean76) {
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
			local219 = Static62.anInt1910 - Static91.anInt2376;
			local223 = Static62.anInt1911 - Static91.anInt2375;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean75) {
					Static62.anIntArray272[Static62.anInt1912++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static91.anInt2376;
		local219 = Static91.anInt2375;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static62.anIntArray288[arg0];
			local257 = Static62.anIntArray284[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt1903; local269++) {
			@Pc(275) int local275 = this.anIntArray269[local269];
			@Pc(280) int local280 = this.anIntArray260[local269];
			@Pc(285) int local285 = this.anIntArray265[local269];
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
			Static62.anIntArray278[local269] = local285 - local29;
			if (local285 >= 50) {
				Static62.anIntArray282[local269] = local172 + (local275 << 9) / local285;
				Static62.anIntArray280[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static62.anIntArray282[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static62.anIntArray281[local269] = local275;
				Static62.anIntArray276[local269] = local297;
				Static62.anIntArray285[local269] = local285;
			}
		}
		try {
			this.method1346(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IIIIIIII)V")
	public void method1343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static62.anIntArray290[0] = -1;
		if (this.anInt1900 != 2 && this.anInt1900 != 1) {
			this.method1341();
		}
		@Pc(15) int local15 = Static91.anInt2376;
		@Pc(17) int local17 = Static91.anInt2375;
		@Pc(21) int local21 = Static62.anIntArray288[0];
		@Pc(25) int local25 = Static62.anIntArray284[0];
		@Pc(29) int local29 = Static62.anIntArray288[arg0];
		@Pc(33) int local33 = Static62.anIntArray284[arg0];
		@Pc(37) int local37 = Static62.anIntArray288[arg1];
		@Pc(41) int local41 = Static62.anIntArray284[arg1];
		@Pc(45) int local45 = Static62.anIntArray288[arg2];
		@Pc(49) int local49 = Static62.anIntArray284[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1903; local61++) {
			@Pc(67) int local67 = this.anIntArray269[local61];
			@Pc(72) int local72 = this.anIntArray260[local61];
			@Pc(77) int local77 = this.anIntArray265[local61];
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
			Static62.anIntArray278[local61] = local77 - local59;
			Static62.anIntArray282[local61] = local15 + (local67 << 9) / arg6;
			Static62.anIntArray280[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt1902 > 0) {
				Static62.anIntArray281[local61] = local67;
				Static62.anIntArray276[local61] = local89;
				Static62.anIntArray285[local61] = local77;
			}
		}
		try {
			this.method1346(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V")
	public void method1344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static62.anIntArray290[0] = -1;
		if (this.anInt1900 != 2 && this.anInt1900 != 1) {
			this.method1341();
		}
		@Pc(15) int local15 = Static91.anInt2376;
		@Pc(17) int local17 = Static91.anInt2375;
		@Pc(21) int local21 = Static62.anIntArray288[0];
		@Pc(25) int local25 = Static62.anIntArray284[0];
		@Pc(29) int local29 = Static62.anIntArray288[arg0];
		@Pc(33) int local33 = Static62.anIntArray284[arg0];
		@Pc(37) int local37 = Static62.anIntArray288[arg1];
		@Pc(41) int local41 = Static62.anIntArray284[arg1];
		@Pc(45) int local45 = Static62.anIntArray288[arg2];
		@Pc(49) int local49 = Static62.anIntArray284[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt1903; local61++) {
			@Pc(67) int local67 = this.anIntArray269[local61];
			@Pc(72) int local72 = this.anIntArray260[local61];
			@Pc(77) int local77 = this.anIntArray265[local61];
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
			Static62.anIntArray278[local61] = local77 - local59;
			Static62.anIntArray282[local61] = local15 + (local67 << 9) / local77;
			Static62.anIntArray280[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt1902 > 0) {
				Static62.anIntArray281[local61] = local67;
				Static62.anIntArray276[local61] = local89;
				Static62.anIntArray285[local61] = local77;
			}
		}
		try {
			this.method1346(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)V")
	private void method1345(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static91.anInt2376;
		@Pc(3) int local3 = Static91.anInt2375;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray262[arg0];
		@Pc(15) int local15 = this.anIntArray267[arg0];
		@Pc(20) int local20 = this.anIntArray270[arg0];
		@Pc(24) int local24 = Static62.anIntArray285[local10];
		@Pc(28) int local28 = Static62.anIntArray285[local15];
		@Pc(32) int local32 = Static62.anIntArray285[local20];
		if (this.aByteArray16 == null) {
			Static91.anInt2377 = 0;
		} else {
			Static91.anInt2377 = this.aByteArray16[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static62.anIntArray277[0] = Static62.anIntArray282[local10];
			Static62.anIntArray275[0] = Static62.anIntArray280[local10];
			local5++;
			Static62.anIntArray283[0] = this.anIntArray263[arg0];
		} else {
			local73 = Static62.anIntArray281[local10];
			local77 = Static62.anIntArray276[local10];
			local82 = this.anIntArray263[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static62.anIntArray289[local32 - local24];
				Static62.anIntArray277[0] = local1 + (local73 + ((Static62.anIntArray281[local20] - local73) * local95 >> 16) << 9) / 50;
				Static62.anIntArray275[0] = local3 + (local77 + ((Static62.anIntArray276[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static62.anIntArray283[0] = local82 + ((this.anIntArray266[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static62.anIntArray289[local28 - local24];
				Static62.anIntArray277[local5] = local1 + (local73 + ((Static62.anIntArray281[local15] - local73) * local95 >> 16) << 9) / 50;
				Static62.anIntArray275[local5] = local3 + (local77 + ((Static62.anIntArray276[local15] - local77) * local95 >> 16) << 9) / 50;
				Static62.anIntArray283[local5++] = local82 + ((this.anIntArray271[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static62.anIntArray277[local5] = Static62.anIntArray282[local15];
			Static62.anIntArray275[local5] = Static62.anIntArray280[local15];
			Static62.anIntArray283[local5++] = this.anIntArray271[arg0];
		} else {
			local73 = Static62.anIntArray281[local15];
			local77 = Static62.anIntArray276[local15];
			local82 = this.anIntArray271[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static62.anIntArray289[local24 - local28];
				Static62.anIntArray277[local5] = local1 + (local73 + ((Static62.anIntArray281[local10] - local73) * local95 >> 16) << 9) / 50;
				Static62.anIntArray275[local5] = local3 + (local77 + ((Static62.anIntArray276[local10] - local77) * local95 >> 16) << 9) / 50;
				Static62.anIntArray283[local5++] = local82 + ((this.anIntArray263[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static62.anIntArray289[local32 - local28];
				Static62.anIntArray277[local5] = local1 + (local73 + ((Static62.anIntArray281[local20] - local73) * local95 >> 16) << 9) / 50;
				Static62.anIntArray275[local5] = local3 + (local77 + ((Static62.anIntArray276[local20] - local77) * local95 >> 16) << 9) / 50;
				Static62.anIntArray283[local5++] = local82 + ((this.anIntArray266[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static62.anIntArray277[local5] = Static62.anIntArray282[local20];
			Static62.anIntArray275[local5] = Static62.anIntArray280[local20];
			Static62.anIntArray283[local5++] = this.anIntArray266[arg0];
		} else {
			local73 = Static62.anIntArray281[local20];
			local77 = Static62.anIntArray276[local20];
			local82 = this.anIntArray266[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static62.anIntArray289[local28 - local32];
				Static62.anIntArray277[local5] = local1 + (local73 + ((Static62.anIntArray281[local15] - local73) * local95 >> 16) << 9) / 50;
				Static62.anIntArray275[local5] = local3 + (local77 + ((Static62.anIntArray276[local15] - local77) * local95 >> 16) << 9) / 50;
				Static62.anIntArray283[local5++] = local82 + ((this.anIntArray271[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static62.anIntArray289[local24 - local32];
				Static62.anIntArray277[local5] = local1 + (local73 + ((Static62.anIntArray281[local10] - local73) * local95 >> 16) << 9) / 50;
				Static62.anIntArray275[local5] = local3 + (local77 + ((Static62.anIntArray276[local10] - local77) * local95 >> 16) << 9) / 50;
				Static62.anIntArray283[local5++] = local82 + ((this.anIntArray263[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static62.anIntArray277[0];
		local77 = Static62.anIntArray277[1];
		local82 = Static62.anIntArray277[2];
		local95 = Static62.anIntArray275[0];
		@Pc(590) int local590 = Static62.anIntArray275[1];
		@Pc(594) int local594 = Static62.anIntArray275[2];
		Static91.aBoolean101 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static91.anInt2374 || local77 > Static91.anInt2374 || local82 > Static91.anInt2374) {
				Static91.aBoolean101 = true;
			}
			if (this.aShortArray51 != null && this.aShortArray51[arg0] != -1) {
				if (this.aByteArray13 == null || this.aByteArray13[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray13[arg0] & 0xFF;
					local683 = this.anIntArray261[local678];
					local688 = this.anIntArray264[local678];
					local693 = this.anIntArray268[local678];
				}
				if (this.anIntArray266[arg0] == -1) {
					Static91.method1679(local95, local590, local594, local73, local77, local82, this.anIntArray263[arg0], this.anIntArray263[arg0], this.anIntArray263[arg0], Static62.anIntArray281[local683], Static62.anIntArray281[local688], Static62.anIntArray281[local693], Static62.anIntArray276[local683], Static62.anIntArray276[local688], Static62.anIntArray276[local693], Static62.anIntArray285[local683], Static62.anIntArray285[local688], Static62.anIntArray285[local693], this.aShortArray51[arg0]);
				} else {
					Static91.method1679(local95, local590, local594, local73, local77, local82, Static62.anIntArray283[0], Static62.anIntArray283[1], Static62.anIntArray283[2], Static62.anIntArray281[local683], Static62.anIntArray281[local688], Static62.anIntArray281[local693], Static62.anIntArray276[local683], Static62.anIntArray276[local688], Static62.anIntArray276[local693], Static62.anIntArray285[local683], Static62.anIntArray285[local688], Static62.anIntArray285[local693], this.aShortArray51[arg0]);
				}
			} else if (this.anIntArray266[arg0] == -1) {
				Static91.method1696(local95, local590, local594, local73, local77, local82, Static62.anIntArray273[this.anIntArray263[arg0]]);
			} else {
				Static91.method1683(local95, local590, local594, local73, local77, local82, Static62.anIntArray283[0], Static62.anIntArray283[1], Static62.anIntArray283[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static91.anInt2374 || local77 > Static91.anInt2374 || local82 > Static91.anInt2374 || Static62.anIntArray277[3] < 0 || Static62.anIntArray277[3] > Static91.anInt2374) {
			Static91.aBoolean101 = true;
		}
		if (this.aShortArray51 == null || this.aShortArray51[arg0] == -1) {
			if (this.anIntArray266[arg0] == -1) {
				local683 = Static62.anIntArray273[this.anIntArray263[arg0]];
				Static91.method1696(local95, local590, local594, local73, local77, local82, local683);
				Static91.method1696(local95, local594, Static62.anIntArray275[3], local73, local82, Static62.anIntArray277[3], local683);
				return;
			}
			Static91.method1683(local95, local590, local594, local73, local77, local82, Static62.anIntArray283[0], Static62.anIntArray283[1], Static62.anIntArray283[2]);
			Static91.method1683(local95, local594, Static62.anIntArray275[3], local73, local82, Static62.anIntArray277[3], Static62.anIntArray283[0], Static62.anIntArray283[2], Static62.anIntArray283[3]);
			return;
		}
		if (this.aByteArray13 == null || this.aByteArray13[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray13[arg0] & 0xFF;
			local683 = this.anIntArray261[local678];
			local688 = this.anIntArray264[local678];
			local693 = this.anIntArray268[local678];
		}
		@Pc(956) short local956 = this.aShortArray51[arg0];
		if (this.anIntArray266[arg0] == -1) {
			Static91.method1679(local95, local590, local594, local73, local77, local82, this.anIntArray263[arg0], this.anIntArray263[arg0], this.anIntArray263[arg0], Static62.anIntArray281[local683], Static62.anIntArray281[local688], Static62.anIntArray281[local693], Static62.anIntArray276[local683], Static62.anIntArray276[local688], Static62.anIntArray276[local693], Static62.anIntArray285[local683], Static62.anIntArray285[local688], Static62.anIntArray285[local693], local956);
			Static91.method1679(local95, local594, Static62.anIntArray275[3], local73, local82, Static62.anIntArray277[3], this.anIntArray263[arg0], this.anIntArray263[arg0], this.anIntArray263[arg0], Static62.anIntArray281[local683], Static62.anIntArray281[local688], Static62.anIntArray281[local693], Static62.anIntArray276[local683], Static62.anIntArray276[local688], Static62.anIntArray276[local693], Static62.anIntArray285[local683], Static62.anIntArray285[local688], Static62.anIntArray285[local693], local956);
			return;
		}
		Static91.method1679(local95, local590, local594, local73, local77, local82, Static62.anIntArray283[0], Static62.anIntArray283[1], Static62.anIntArray283[2], Static62.anIntArray281[local683], Static62.anIntArray281[local688], Static62.anIntArray281[local693], Static62.anIntArray276[local683], Static62.anIntArray276[local688], Static62.anIntArray276[local693], Static62.anIntArray285[local683], Static62.anIntArray285[local688], Static62.anIntArray285[local693], local956);
		Static91.method1679(local95, local594, Static62.anIntArray275[3], local73, local82, Static62.anIntArray277[3], Static62.anIntArray283[0], Static62.anIntArray283[2], Static62.anIntArray283[3], Static62.anIntArray281[local683], Static62.anIntArray281[local688], Static62.anIntArray281[local693], Static62.anIntArray276[local683], Static62.anIntArray276[local688], Static62.anIntArray276[local693], Static62.anIntArray285[local683], Static62.anIntArray285[local688], Static62.anIntArray285[local693], local956);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZI)V")
	private void method1346(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1907 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1907; local6++) {
			Static62.anIntArray290[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt1906; local18++) {
			if (this.anIntArray266[local18] != -2) {
				local30 = this.anIntArray262[local18];
				local35 = this.anIntArray267[local18];
				local40 = this.anIntArray270[local18];
				local44 = Static62.anIntArray282[local30];
				local48 = Static62.anIntArray282[local35];
				local52 = Static62.anIntArray282[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static62.anIntArray281[local30];
					local71 = Static62.anIntArray281[local35];
					@Pc(75) int local75 = Static62.anIntArray281[local40];
					@Pc(79) int local79 = Static62.anIntArray276[local30];
					local83 = Static62.anIntArray276[local35];
					local87 = Static62.anIntArray276[local40];
					@Pc(91) int local91 = Static62.anIntArray285[local30];
					local95 = Static62.anIntArray285[local35];
					@Pc(99) int local99 = Static62.anIntArray285[local40];
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
						Static62.aBooleanArray11[local18] = true;
						@Pc(180) int local180 = (Static62.anIntArray278[local30] + Static62.anIntArray278[local35] + Static62.anIntArray278[local40]) / 3 + this.anInt1901;
						Static62.anIntArrayArray21[local180][Static62.anIntArray290[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1330(Static62.anInt1910, Static62.anInt1911, Static62.anIntArray280[local30], Static62.anIntArray280[local35], Static62.anIntArray280[local40], local44, local48, local52)) {
						Static62.anIntArray272[Static62.anInt1912++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static62.anIntArray280[local40] - Static62.anIntArray280[local35]) - (Static62.anIntArray280[local30] - Static62.anIntArray280[local35]) * (local52 - local48) > 0) {
						Static62.aBooleanArray11[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static91.anInt2374 && local48 <= Static91.anInt2374 && local52 <= Static91.anInt2374) {
							Static62.aBooleanArray10[local18] = false;
						} else {
							Static62.aBooleanArray10[local18] = true;
						}
						local67 = (Static62.anIntArray278[local30] + Static62.anIntArray278[local35] + Static62.anIntArray278[local40]) / 3 + this.anInt1901;
						Static62.anIntArrayArray21[local67][Static62.anIntArray290[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray14 == null) {
			for (local30 = this.anInt1907 - 1; local30 >= 0; local30--) {
				local35 = Static62.anIntArray290[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static62.anIntArrayArray21[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1331(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static62.anIntArray274[local30] = 0;
			Static62.anIntArray287[local30] = 0;
		}
		for (local35 = this.anInt1907 - 1; local35 >= 0; local35--) {
			local40 = Static62.anIntArray290[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static62.anIntArrayArray21[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray14[local52];
					local71 = Static62.anIntArray274[local388]++;
					Static62.anIntArrayArray20[local388][local71] = local52;
					if (local388 < 10) {
						Static62.anIntArray287[local388] += local35;
					} else if (local388 == 10) {
						Static62.anIntArray279[local71] = local35;
					} else {
						Static62.anIntArray286[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static62.anIntArray274[1] > 0 || Static62.anIntArray274[2] > 0) {
			local40 = (Static62.anIntArray287[1] + Static62.anIntArray287[2]) / (Static62.anIntArray274[1] + Static62.anIntArray274[2]);
		}
		local44 = 0;
		if (Static62.anIntArray274[3] > 0 || Static62.anIntArray274[4] > 0) {
			local44 = (Static62.anIntArray287[3] + Static62.anIntArray287[4]) / (Static62.anIntArray274[3] + Static62.anIntArray274[4]);
		}
		local48 = 0;
		if (Static62.anIntArray274[6] > 0 || Static62.anIntArray274[8] > 0) {
			local48 = (Static62.anIntArray287[6] + Static62.anIntArray287[8]) / (Static62.anIntArray274[6] + Static62.anIntArray274[8]);
		}
		local67 = 0;
		local71 = Static62.anIntArray274[10];
		@Pc(521) int[] local521 = Static62.anIntArrayArray20[10];
		@Pc(523) int[] local523 = Static62.anIntArray279;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static62.anIntArray274[11];
			local521 = Static62.anIntArrayArray20[11];
			local523 = Static62.anIntArray286;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1331(local521[local67++]);
				if (local67 == local71 && local521 != Static62.anIntArrayArray20[11]) {
					local67 = 0;
					local71 = Static62.anIntArray274[11];
					local521 = Static62.anIntArrayArray20[11];
					local523 = Static62.anIntArray286;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1331(local521[local67++]);
				if (local67 == local71 && local521 != Static62.anIntArrayArray20[11]) {
					local67 = 0;
					local71 = Static62.anIntArray274[11];
					local521 = Static62.anIntArrayArray20[11];
					local523 = Static62.anIntArray286;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1331(local521[local67++]);
				if (local67 == local71 && local521 != Static62.anIntArrayArray20[11]) {
					local67 = 0;
					local71 = Static62.anIntArray274[11];
					local521 = Static62.anIntArrayArray20[11];
					local523 = Static62.anIntArray286;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static62.anIntArray274[local83];
			@Pc(686) int[] local686 = Static62.anIntArrayArray20[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1331(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1331(local521[local67++]);
			if (local67 == local71 && local521 != Static62.anIntArrayArray20[11]) {
				local67 = 0;
				local521 = Static62.anIntArrayArray20[11];
				local71 = Static62.anIntArray274[11];
				local523 = Static62.anIntArray286;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}
}
