import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class37 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "[Lclient!mf;")
	public Class158[] aClass158Array1;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "[Lclient!tb;")
	public Class239[] aClass239Array1;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "[Lclient!eh;")
	public Class61[] aClass61Array1;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!ch", name = "bb", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public int anInt1038 = 0;

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
	public int anInt1051 = 0;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public int anInt1042 = 0;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "B")
	public byte aByte5 = 0;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	public int anInt1041 = 0;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public int anInt1037 = 12;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
	public Class37(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1009(arg0);
		} else {
			this.method1000(arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(III)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray10 = new short[arg1];
		this.aShortArray4 = new short[arg1];
		this.anIntArray66 = new int[arg0];
		this.anIntArray72 = new int[arg0];
		this.aByteArray7 = new byte[arg1];
		this.aShortArray11 = new short[arg1];
		this.aByteArray8 = new byte[arg1];
		this.aByteArray9 = new byte[arg1];
		this.aByteArray12 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray11 = new byte[arg2];
			this.anIntArray64 = new int[arg2];
			this.anIntArray73 = new int[arg2];
			this.aByteArray13 = new byte[arg2];
			this.aShortArray5 = new short[arg2];
			this.anIntArray65 = new int[arg2];
			this.aByteArray10 = new byte[arg2];
			this.anIntArray70 = new int[arg2];
			this.anIntArray68 = new int[arg2];
			this.aShortArray7 = new short[arg2];
			this.aShortArray6 = new short[arg2];
			this.anIntArray63 = new int[arg2];
		}
		this.aShortArray3 = new short[arg1];
		this.aShortArray9 = new short[arg1];
		this.anIntArray67 = new int[arg0];
		this.anIntArray71 = new int[arg1];
		this.anIntArray69 = new int[arg0];
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([Lclient!ch;I)V")
	public Class37(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1038 = 0;
		this.anInt1041 = 0;
		this.anInt1051 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte5 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class37 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt1038 += local59.anInt1038;
				this.anInt1051 += local59.anInt1051;
				this.anInt1041 += local59.anInt1041;
				if (local59.aClass61Array1 != null) {
					local32 += local59.aClass61Array1.length;
				}
				local38 |= local59.aByteArray8 != null;
				if (local59.aClass239Array1 != null) {
					local34 += local59.aClass239Array1.length;
				}
				if (local59.aClass158Array1 != null) {
					local36 += local59.aClass158Array1.length;
				}
				if (local59.aByteArray9 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local59.aByte5;
					}
					if (local59.aByte5 != this.aByte5) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray7 != null;
				local46 |= local59.aShortArray11 != null;
				local51 |= local59.anIntArray71 != null;
				local42 |= local59.aByteArray12 != null;
			}
		}
		this.aShortArray8 = new short[this.anInt1041];
		this.anIntArray66 = new int[this.anInt1051];
		if (this.anInt1038 > 0) {
			this.anIntArray65 = new int[this.anInt1038];
			this.aShortArray5 = new short[this.anInt1038];
			this.aByteArray10 = new byte[this.anInt1038];
			this.anIntArray68 = new int[this.anInt1038];
			this.anIntArray70 = new int[this.anInt1038];
			this.aShortArray7 = new short[this.anInt1038];
			this.aShortArray6 = new short[this.anInt1038];
			this.aByteArray13 = new byte[this.anInt1038];
			this.aByteArray11 = new byte[this.anInt1038];
			this.anIntArray64 = new int[this.anInt1038];
			this.anIntArray73 = new int[this.anInt1038];
			this.anIntArray63 = new int[this.anInt1038];
		}
		this.aShortArray10 = new short[this.anInt1041];
		this.anIntArray67 = new int[this.anInt1051];
		this.aShortArray9 = new short[this.anInt1041];
		this.aShortArray4 = new short[this.anInt1041];
		if (local51) {
			this.anIntArray71 = new int[this.anInt1041];
		}
		if (local40) {
			this.aByteArray9 = new byte[this.anInt1041];
		}
		this.anIntArray72 = new int[this.anInt1051];
		this.anIntArray69 = new int[this.anInt1051];
		this.aShortArray3 = new short[this.anInt1041];
		if (local32 > 0) {
			this.aClass61Array1 = new Class61[local32];
		}
		if (local38) {
			this.aByteArray8 = new byte[this.anInt1041];
		}
		if (local36 > 0) {
			this.aClass158Array1 = new Class158[local36];
		}
		if (local46) {
			this.aShortArray11 = new short[this.anInt1041];
		}
		this.aShortArray2 = new short[this.anInt1051];
		if (local44) {
			this.aByteArray7 = new byte[this.anInt1041];
		}
		if (local34 > 0) {
			this.aClass239Array1 = new Class239[local34];
		}
		if (local42) {
			this.aByteArray12 = new byte[this.anInt1041];
		}
		this.anInt1051 = 0;
		this.anInt1041 = 0;
		local34 = 0;
		local32 = 0;
		this.anInt1038 = 0;
		local36 = 0;
		@Pc(620) int local620;
		@Pc(631) int local631;
		for (@Pc(384) int local384 = 0; local384 < arg1; local384++) {
			@Pc(391) short local391 = (short) (0x1 << local384);
			@Pc(395) Class37 local395 = arg0[local384];
			if (local395 != null) {
				@Pc(402) int local402;
				if (local395.aClass158Array1 != null) {
					for (local402 = 0; local402 < local395.aClass158Array1.length; local402++) {
						@Pc(409) Class158 local409 = local395.aClass158Array1[local402];
						this.aClass158Array1[local36++] = local409.method4030(local409.anInt4729 + this.anInt1041);
					}
				}
				for (local402 = 0; local402 < local395.anInt1041; local402++) {
					if (local38 && local395.aByteArray8 != null) {
						this.aByteArray8[this.anInt1041] = local395.aByteArray8[local402];
					}
					if (local40) {
						if (local395.aByteArray9 == null) {
							this.aByteArray9[this.anInt1041] = local395.aByte5;
						} else {
							this.aByteArray9[this.anInt1041] = local395.aByteArray9[local402];
						}
					}
					if (local42 && local395.aByteArray12 != null) {
						this.aByteArray12[this.anInt1041] = local395.aByteArray12[local402];
					}
					if (local46) {
						if (local395.aShortArray11 == null) {
							this.aShortArray11[this.anInt1041] = -1;
						} else {
							this.aShortArray11[this.anInt1041] = local395.aShortArray11[local402];
						}
					}
					if (local51) {
						if (local395.anIntArray71 == null) {
							this.anIntArray71[this.anInt1041] = -1;
						} else {
							this.anIntArray71[this.anInt1041] = local395.anIntArray71[local402];
						}
					}
					this.aShortArray9[this.anInt1041] = (short) this.method1010(local395.aShortArray9[local402], local395, local391);
					this.aShortArray4[this.anInt1041] = (short) this.method1010(local395.aShortArray4[local402], local395, local391);
					this.aShortArray3[this.anInt1041] = (short) this.method1010(local395.aShortArray3[local402], local395, local391);
					this.aShortArray8[this.anInt1041] = local391;
					this.aShortArray10[this.anInt1041] = local395.aShortArray10[local402];
					this.anInt1041++;
				}
				@Pc(607) int local607;
				if (local395.aClass61Array1 != null) {
					for (local607 = 0; local607 < local395.aClass61Array1.length; local607++) {
						local620 = this.method1010(local395.aClass61Array1[local607].anInt1987, local395, local391);
						local631 = this.method1010(local395.aClass61Array1[local607].anInt1985, local395, local391);
						@Pc(642) int local642 = this.method1010(local395.aClass61Array1[local607].anInt1983, local395, local391);
						this.aClass61Array1[local32] = local395.aClass61Array1[local607].method1770(local620, local631, local642);
						local32++;
					}
				}
				if (local395.aClass239Array1 != null) {
					for (local607 = 0; local607 < local395.aClass239Array1.length; local607++) {
						local620 = this.method1010(local395.aClass239Array1[local607].anInt6763, local395, local391);
						this.aClass239Array1[local34] = local395.aClass239Array1[local607].method5454(local620);
						local34++;
					}
				}
			}
		}
		@Pc(712) int local712 = 0;
		this.anInt1042 = this.anInt1051;
		for (@Pc(718) int local718 = 0; local718 < arg1; local718++) {
			@Pc(725) short local725 = (short) (0x1 << local718);
			@Pc(729) Class37 local729 = arg0[local718];
			if (local729 != null) {
				for (local620 = 0; local620 < local729.anInt1041; local620++) {
					if (local44) {
						this.aByteArray7[local712++] = (byte) (local729.aByteArray7 == null || local729.aByteArray7[local620] == -1 ? -1 : this.anInt1038 + local729.aByteArray7[local620]);
					}
				}
				for (local631 = 0; local631 < local729.anInt1038; local631++) {
					@Pc(781) byte local781 = this.aByteArray11[this.anInt1038] = local729.aByteArray11[local631];
					if (local781 == 0) {
						this.aShortArray7[this.anInt1038] = (short) this.method1010(local729.aShortArray7[local631], local729, local725);
						this.aShortArray5[this.anInt1038] = (short) this.method1010(local729.aShortArray5[local631], local729, local725);
						this.aShortArray6[this.anInt1038] = (short) this.method1010(local729.aShortArray6[local631], local729, local725);
					}
					if (local781 >= 1 && local781 <= 3) {
						this.aShortArray7[this.anInt1038] = local729.aShortArray7[local631];
						this.aShortArray5[this.anInt1038] = local729.aShortArray5[local631];
						this.aShortArray6[this.anInt1038] = local729.aShortArray6[local631];
						this.anIntArray63[this.anInt1038] = local729.anIntArray63[local631];
						this.anIntArray73[this.anInt1038] = local729.anIntArray73[local631];
						this.anIntArray68[this.anInt1038] = local729.anIntArray68[local631];
						this.aByteArray13[this.anInt1038] = local729.aByteArray13[local631];
						this.aByteArray10[this.anInt1038] = local729.aByteArray10[local631];
						this.anIntArray64[this.anInt1038] = local729.anIntArray64[local631];
					}
					if (local781 == 2) {
						this.anIntArray70[this.anInt1038] = local729.anIntArray70[local631];
						this.anIntArray65[this.anInt1038] = local729.anIntArray65[local631];
					}
					this.anInt1038++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	public void method999() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1051; local7++) {
			this.anIntArray69[local7] <<= 0x0;
			this.anIntArray67[local7] <<= 0x0;
			this.anIntArray66[local7] <<= 0x0;
		}
		if (this.anInt1038 <= 0 || this.anIntArray63 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray63.length; local53++) {
			this.anIntArray63[local53] <<= 0x0;
			this.anIntArray73[local53] <<= 0x0;
			if (this.aByteArray11[local53] != 1) {
				this.anIntArray68[local53] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([BI)V")
	private void method1000(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(23) Class4_Sub20 local23 = new Class4_Sub20(arg0);
		@Pc(28) Class4_Sub20 local28 = new Class4_Sub20(arg0);
		@Pc(33) Class4_Sub20 local33 = new Class4_Sub20(arg0);
		@Pc(38) Class4_Sub20 local38 = new Class4_Sub20(arg0);
		@Pc(43) Class4_Sub20 local43 = new Class4_Sub20(arg0);
		local23.anInt5526 = arg0.length - 18;
		this.anInt1051 = local23.method4560();
		this.anInt1041 = local23.method4560();
		this.anInt1038 = local23.method4614();
		@Pc(68) int local68 = local23.method4614();
		@Pc(72) int local72 = local23.method4614();
		@Pc(76) int local76 = local23.method4614();
		@Pc(80) int local80 = local23.method4614();
		@Pc(84) int local84 = local23.method4614();
		@Pc(88) int local88 = local23.method4560();
		@Pc(94) int local94 = local23.method4560();
		@Pc(98) int local98 = local23.method4560();
		@Pc(104) int local104 = local23.method4560();
		@Pc(113) int local113 = this.anInt1051;
		@Pc(115) int local115 = local113;
		local113 += this.anInt1041;
		@Pc(122) int local122 = local113;
		if (local72 == 255) {
			local113 += this.anInt1041;
		}
		@Pc(132) int local132 = local113;
		if (local80 == 1) {
			local113 += this.anInt1041;
		}
		@Pc(142) int local142 = local113;
		if (local68 == 1) {
			local113 += this.anInt1041;
		}
		@Pc(154) int local154 = local113;
		if (local84 == 1) {
			local113 += this.anInt1051;
		}
		@Pc(164) int local164 = local113;
		if (local76 == 1) {
			local113 += this.anInt1041;
		}
		@Pc(174) int local174 = local113;
		local113 += local104;
		@Pc(180) int local180 = local113;
		local113 += this.anInt1041 * 2;
		@Pc(189) int local189 = local113;
		local113 += this.anInt1038 * 6;
		@Pc(198) int local198 = local113;
		local113 += local88;
		@Pc(204) int local204 = local113;
		local113 += local94;
		if (local84 == 1) {
			this.anIntArray72 = new int[this.anInt1051];
		}
		this.anIntArray66 = new int[this.anInt1051];
		local23.anInt5526 = 0;
		this.aShortArray4 = new short[this.anInt1041];
		if (local68 == 1) {
			this.aShortArray11 = new short[this.anInt1041];
			this.aByteArray7 = new byte[this.anInt1041];
			this.aByteArray8 = new byte[this.anInt1041];
		}
		this.aShortArray3 = new short[this.anInt1041];
		this.anIntArray67 = new int[this.anInt1051];
		this.aShortArray9 = new short[this.anInt1041];
		this.aShortArray10 = new short[this.anInt1041];
		if (local72 == 255) {
			this.aByteArray9 = new byte[this.anInt1041];
		} else {
			this.aByte5 = (byte) local72;
		}
		if (this.anInt1038 > 0) {
			this.aShortArray7 = new short[this.anInt1038];
			this.aShortArray5 = new short[this.anInt1038];
			this.aByteArray11 = new byte[this.anInt1038];
			this.aShortArray6 = new short[this.anInt1038];
		}
		if (local76 == 1) {
			this.aByteArray12 = new byte[this.anInt1041];
		}
		if (local80 == 1) {
			this.anIntArray71 = new int[this.anInt1041];
		}
		this.anIntArray69 = new int[this.anInt1051];
		local28.anInt5526 = local198;
		local33.anInt5526 = local204;
		local38.anInt5526 = local113;
		local43.anInt5526 = local154;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < this.anInt1051; local353++) {
			local359 = local23.method4614();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local28.method4619();
			}
			@Pc(374) int local374 = 0;
			if ((local359 & 0x2) != 0) {
				local374 = local33.method4619();
			}
			@Pc(384) int local384 = 0;
			if ((local359 & 0x4) != 0) {
				local384 = local38.method4619();
			}
			this.anIntArray69[local353] = local361 + local347;
			this.anIntArray67[local353] = local349 + local374;
			this.anIntArray66[local353] = local384 + local351;
			local349 = this.anIntArray67[local353];
			local347 = this.anIntArray69[local353];
			local351 = this.anIntArray66[local353];
			if (local84 == 1) {
				this.anIntArray72[local353] = local43.method4614();
			}
		}
		local23.anInt5526 = local180;
		local28.anInt5526 = local142;
		local33.anInt5526 = local122;
		local38.anInt5526 = local164;
		local43.anInt5526 = local132;
		for (local359 = 0; local359 < this.anInt1041; local359++) {
			this.aShortArray10[local359] = (short) local23.method4560();
			if (local68 == 1) {
				local361 = local28.method4614();
				if ((local361 & 0x1) == 1) {
					local7 = true;
					this.aByteArray8[local359] = 1;
				} else {
					this.aByteArray8[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray7[local359] = (byte) (local361 >> 2);
					this.aShortArray11[local359] = this.aShortArray10[local359];
					this.aShortArray10[local359] = 127;
					if (this.aShortArray11[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray7[local359] = -1;
					this.aShortArray11[local359] = -1;
				}
			}
			if (local72 == 255) {
				this.aByteArray9[local359] = local33.method4576();
			}
			if (local76 == 1) {
				this.aByteArray12[local359] = local38.method4576();
			}
			if (local80 == 1) {
				this.anIntArray71[local359] = local43.method4614();
			}
		}
		local23.anInt5526 = local174;
		this.anInt1042 = -1;
		local28.anInt5526 = local115;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(614) int local614;
		for (@Pc(608) int local608 = 0; local608 < this.anInt1041; local608++) {
			local614 = local28.method4614();
			if (local614 == 1) {
				local600 = (short) (local23.method4619() + local606);
				local602 = (short) (local600 + local23.method4619());
				local604 = (short) (local602 + local23.method4619());
				this.aShortArray9[local608] = local600;
				local606 = local604;
				this.aShortArray4[local608] = local602;
				this.aShortArray3[local608] = local604;
				if (this.anInt1042 < local600) {
					this.anInt1042 = local600;
				}
				if (this.anInt1042 < local602) {
					this.anInt1042 = local602;
				}
				if (this.anInt1042 < local604) {
					this.anInt1042 = local604;
				}
			}
			if (local614 == 2) {
				local602 = local604;
				local604 = (short) (local23.method4619() + local606);
				local606 = local604;
				this.aShortArray9[local608] = local600;
				this.aShortArray4[local608] = local602;
				this.aShortArray3[local608] = local604;
				if (this.anInt1042 < local604) {
					this.anInt1042 = local604;
				}
			}
			if (local614 == 3) {
				local600 = local604;
				local604 = (short) (local606 + local23.method4619());
				this.aShortArray9[local608] = local600;
				local606 = local604;
				this.aShortArray4[local608] = local602;
				this.aShortArray3[local608] = local604;
				if (local604 > this.anInt1042) {
					this.anInt1042 = local604;
				}
			}
			if (local614 == 4) {
				@Pc(777) short local777 = local600;
				local600 = local602;
				local604 = (short) (local606 + local23.method4619());
				local602 = local777;
				local606 = local604;
				this.aShortArray9[local608] = local600;
				this.aShortArray4[local608] = local777;
				this.aShortArray3[local608] = local604;
				if (this.anInt1042 < local604) {
					this.anInt1042 = local604;
				}
			}
		}
		local23.anInt5526 = local189;
		this.anInt1042++;
		for (local614 = 0; local614 < this.anInt1038; local614++) {
			this.aByteArray11[local614] = 0;
			this.aShortArray7[local614] = (short) local23.method4560();
			this.aShortArray5[local614] = (short) local23.method4560();
			this.aShortArray6[local614] = (short) local23.method4560();
		}
		if (this.aByteArray7 != null) {
			@Pc(879) boolean local879 = false;
			for (@Pc(881) int local881 = 0; local881 < this.anInt1041; local881++) {
				@Pc(890) int local890 = this.aByteArray7[local881] & 0xFF;
				if (local890 != 255) {
					if ((this.aShortArray7[local890] & 0xFFFF) == this.aShortArray9[local881] && (this.aShortArray5[local890] & 0xFFFF) == this.aShortArray4[local881] && this.aShortArray3[local881] == (this.aShortArray6[local890] & 0xFFFF)) {
						this.aByteArray7[local881] = -1;
					} else {
						local879 = true;
					}
				}
			}
			if (!local879) {
				this.aByteArray7 = null;
			}
		}
		if (!local7) {
			this.aByteArray8 = null;
		}
		if (!local9) {
			this.aShortArray11 = null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIII)I")
	public int method1001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1051; local7++) {
			if (this.anIntArray69[local7] == arg0 && arg2 == this.anIntArray67[local7] && arg1 == this.anIntArray66[local7]) {
				return local7;
			}
		}
		this.anIntArray69[this.anInt1051] = arg0;
		this.anIntArray67[this.anInt1051] = arg2;
		this.anIntArray66[this.anInt1051] = arg1;
		this.anInt1042 = this.anInt1051 + 1;
		return this.anInt1051++;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBII)V")
	public void method1002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg0 != 0) {
			local10 = Class4_Sub13.anIntArray497[arg0];
			local14 = Class4_Sub13.anIntArray496[arg0];
			for (local16 = 0; local16 < this.anInt1051; local16++) {
				local34 = local10 * this.anIntArray67[local16] + local14 * this.anIntArray69[local16] >> 15;
				this.anIntArray67[local16] = this.anIntArray67[local16] * local14 - local10 * this.anIntArray69[local16] >> 15;
				this.anIntArray69[local16] = local34;
			}
		}
		if (arg1 != 0) {
			local10 = Class4_Sub13.anIntArray497[arg1];
			local14 = Class4_Sub13.anIntArray496[arg1];
			for (local16 = 0; local16 < this.anInt1051; local16++) {
				local34 = this.anIntArray67[local16] * local14 - local10 * this.anIntArray66[local16] >> 15;
				this.anIntArray66[local16] = this.anIntArray67[local16] * local10 + this.anIntArray66[local16] * local14 >> 15;
				this.anIntArray67[local16] = local34;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local10 = Class4_Sub13.anIntArray497[arg2];
		local14 = Class4_Sub13.anIntArray496[arg2];
		for (local16 = 0; local16 < this.anInt1051; local16++) {
			local34 = local10 * this.anIntArray66[local16] + this.anIntArray69[local16] * local14 >> 15;
			this.anIntArray66[local16] = this.anIntArray66[local16] * local14 - local10 * this.anIntArray69[local16] >> 15;
			this.anIntArray69[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)[[I")
	public int[][] method1004() {
		@Pc(15) int[] local15 = new int[256];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.aClass158Array1.length; local19++) {
			@Pc(27) int local27 = this.aClass158Array1[local19].anInt4733;
			if (local27 >= 0) {
				@Pc(36) int local36 = local15[local27]++;
				if (local17 < local27) {
					local17 = local27;
				}
			}
		}
		@Pc(63) int[][] local63 = new int[local17 + 1][];
		for (@Pc(65) int local65 = 0; local65 <= local17; local65++) {
			local63[local65] = new int[local15[local65]];
			local15[local65] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < this.aClass158Array1.length; local84++) {
			@Pc(92) int local92 = this.aClass158Array1[local84].anInt4733;
			if (local92 >= 0) {
				local63[local92][local15[local92]++] = local84;
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IISIBBBIS)I")
	public int method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray9[this.anInt1041] = (short) arg0;
		this.aShortArray4[this.anInt1041] = (short) arg3;
		this.aShortArray3[this.anInt1041] = (short) arg1;
		this.aByteArray8[this.anInt1041] = arg4;
		this.aByteArray7[this.anInt1041] = arg5;
		this.aShortArray10[this.anInt1041] = arg7;
		this.aByteArray12[this.anInt1041] = arg6;
		this.aShortArray11[this.anInt1041] = arg2;
		return this.anInt1041++;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)[[I")
	public int[][] method1006() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1041; local12++) {
			@Pc(19) int local19 = this.anIntArray71[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt1041; local72++) {
			@Pc(79) int local79 = this.anIntArray71[local72];
			if (local79 >= 0) {
				local47[local79][local8[local79]++] = local72;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(SBS)V")
	public void method1007(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1041; local3++) {
			if (arg0 == this.aShortArray10[local3]) {
				this.aShortArray10[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V")
	public void method1008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1051; local13++) {
			this.anIntArray69[local13] += arg2;
			this.anIntArray67[local13] += arg0;
			this.anIntArray66[local13] += arg1;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([BB)V")
	private void method1009(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub20 local10 = new Class4_Sub20(arg0);
		@Pc(15) Class4_Sub20 local15 = new Class4_Sub20(arg0);
		@Pc(20) Class4_Sub20 local20 = new Class4_Sub20(arg0);
		@Pc(25) Class4_Sub20 local25 = new Class4_Sub20(arg0);
		@Pc(30) Class4_Sub20 local30 = new Class4_Sub20(arg0);
		@Pc(35) Class4_Sub20 local35 = new Class4_Sub20(arg0);
		@Pc(40) Class4_Sub20 local40 = new Class4_Sub20(arg0);
		local10.anInt5526 = arg0.length - 23;
		this.anInt1051 = local10.method4560();
		this.anInt1041 = local10.method4560();
		this.anInt1038 = local10.method4614();
		@Pc(67) int local67 = local10.method4614();
		@Pc(76) boolean local76 = (local67 & 0x1) == 1;
		@Pc(87) boolean local87 = (local67 & 0x2) == 2;
		@Pc(96) boolean local96 = (local67 & 0x4) == 4;
		@Pc(105) boolean local105 = (local67 & 0x8) == 8;
		if (local105) {
			local10.anInt5526 -= 7;
			this.anInt1037 = local10.method4614();
			local10.anInt5526 += 6;
		}
		@Pc(128) int local128 = local10.method4614();
		@Pc(132) int local132 = local10.method4614();
		@Pc(136) int local136 = local10.method4614();
		@Pc(140) int local140 = local10.method4614();
		@Pc(144) int local144 = local10.method4614();
		@Pc(155) int local155 = local10.method4560();
		@Pc(159) int local159 = local10.method4560();
		@Pc(165) int local165 = local10.method4560();
		@Pc(169) int local169 = local10.method4560();
		@Pc(173) int local173 = local10.method4560();
		@Pc(175) int local175 = 0;
		@Pc(177) int local177 = 0;
		@Pc(179) int local179 = 0;
		@Pc(195) int local195;
		if (this.anInt1038 > 0) {
			this.aByteArray11 = new byte[this.anInt1038];
			local10.anInt5526 = 0;
			for (local195 = 0; local195 < this.anInt1038; local195++) {
				@Pc(206) byte local206 = this.aByteArray11[local195] = local10.method4576();
				if (local206 >= 1 && local206 <= 3) {
					local177++;
				}
				if (local206 == 0) {
					local175++;
				}
				if (local206 == 2) {
					local179++;
				}
			}
		}
		local195 = this.anInt1038;
		@Pc(233) int local233 = local195;
		local195 += this.anInt1051;
		@Pc(240) int local240 = local195;
		if (local76) {
			local195 += this.anInt1041;
		}
		@Pc(249) int local249 = local195;
		local195 += this.anInt1041;
		@Pc(256) int local256 = local195;
		if (local128 == 255) {
			local195 += this.anInt1041;
		}
		@Pc(268) int local268 = local195;
		if (local136 == 1) {
			local195 += this.anInt1041;
		}
		@Pc(278) int local278 = local195;
		if (local144 == 1) {
			local195 += this.anInt1051;
		}
		@Pc(290) int local290 = local195;
		if (local132 == 1) {
			local195 += this.anInt1041;
		}
		@Pc(300) int local300 = local195;
		local195 += local169;
		@Pc(306) int local306 = local195;
		if (local140 == 1) {
			local195 += this.anInt1041 * 2;
		}
		@Pc(320) int local320 = local195;
		local195 += local173;
		@Pc(326) int local326 = local195;
		local195 += this.anInt1041 * 2;
		@Pc(335) int local335 = local195;
		local195 += local155;
		@Pc(341) int local341 = local195;
		local195 += local159;
		@Pc(347) int local347 = local195;
		local195 += local165;
		@Pc(353) int local353 = local195;
		local195 += local175 * 6;
		@Pc(361) int local361 = local195;
		local195 += local177 * 6;
		@Pc(377) int local377 = this.anInt1037 >= 14 ? 7 : 6;
		@Pc(379) int local379 = local195;
		local195 += local177 * local377;
		@Pc(387) int local387 = local195;
		local195 += local177;
		@Pc(393) int local393 = local195;
		local195 += local177;
		@Pc(399) int local399 = local195;
		local195 += local179 * 2 + local177;
		this.aShortArray3 = new short[this.anInt1041];
		this.anIntArray67 = new int[this.anInt1051];
		if (this.anInt1038 > 0) {
			this.aShortArray6 = new short[this.anInt1038];
			if (local179 > 0) {
				this.anIntArray65 = new int[local179];
				this.anIntArray70 = new int[local179];
			}
			if (local177 > 0) {
				this.aByteArray10 = new byte[local177];
				this.anIntArray73 = new int[local177];
				this.anIntArray64 = new int[local177];
				this.anIntArray68 = new int[local177];
				this.anIntArray63 = new int[local177];
				this.aByteArray13 = new byte[local177];
			}
			this.aShortArray5 = new short[this.anInt1038];
			this.aShortArray7 = new short[this.anInt1038];
		}
		this.aShortArray10 = new short[this.anInt1041];
		if (local144 == 1) {
			this.anIntArray72 = new int[this.anInt1051];
		}
		local10.anInt5526 = local233;
		this.anIntArray69 = new int[this.anInt1051];
		if (local128 == 255) {
			this.aByteArray9 = new byte[this.anInt1041];
		} else {
			this.aByte5 = (byte) local128;
		}
		if (local136 == 1) {
			this.anIntArray71 = new int[this.anInt1041];
		}
		if (local76) {
			this.aByteArray8 = new byte[this.anInt1041];
		}
		this.anIntArray66 = new int[this.anInt1051];
		if (local140 == 1) {
			this.aShortArray11 = new short[this.anInt1041];
		}
		if (local132 == 1) {
			this.aByteArray12 = new byte[this.anInt1041];
		}
		this.aShortArray4 = new short[this.anInt1041];
		if (local140 == 1 && this.anInt1038 > 0) {
			this.aByteArray7 = new byte[this.anInt1041];
		}
		this.aShortArray9 = new short[this.anInt1041];
		local15.anInt5526 = local335;
		local20.anInt5526 = local341;
		local25.anInt5526 = local347;
		local30.anInt5526 = local278;
		@Pc(596) int local596 = 0;
		@Pc(598) int local598 = 0;
		@Pc(600) int local600 = 0;
		@Pc(608) int local608;
		for (@Pc(602) int local602 = 0; local602 < this.anInt1051; local602++) {
			local608 = local10.method4614();
			@Pc(610) int local610 = 0;
			if ((local608 & 0x1) != 0) {
				local610 = local15.method4619();
			}
			@Pc(620) int local620 = 0;
			if ((local608 & 0x2) != 0) {
				local620 = local20.method4619();
			}
			@Pc(630) int local630 = 0;
			if ((local608 & 0x4) != 0) {
				local630 = local25.method4619();
			}
			this.anIntArray69[local602] = local596 + local610;
			this.anIntArray67[local602] = local598 + local620;
			this.anIntArray66[local602] = local630 + local600;
			local598 = this.anIntArray67[local602];
			local596 = this.anIntArray69[local602];
			local600 = this.anIntArray66[local602];
			if (local144 == 1) {
				this.anIntArray72[local602] = local30.method4614();
			}
		}
		local10.anInt5526 = local326;
		local15.anInt5526 = local240;
		local20.anInt5526 = local256;
		local25.anInt5526 = local290;
		local30.anInt5526 = local268;
		local35.anInt5526 = local306;
		local40.anInt5526 = local320;
		for (local608 = 0; local608 < this.anInt1041; local608++) {
			this.aShortArray10[local608] = (short) local10.method4560();
			if (local76) {
				this.aByteArray8[local608] = local15.method4576();
			}
			if (local128 == 255) {
				this.aByteArray9[local608] = local20.method4576();
			}
			if (local132 == 1) {
				this.aByteArray12[local608] = local25.method4576();
			}
			if (local136 == 1) {
				this.anIntArray71[local608] = local30.method4614();
			}
			if (local140 == 1) {
				this.aShortArray11[local608] = (short) (local35.method4560() - 1);
			}
			if (this.aByteArray7 != null) {
				if (this.aShortArray11[local608] == -1) {
					this.aByteArray7[local608] = -1;
				} else {
					this.aByteArray7[local608] = (byte) (local40.method4614() - 1);
				}
			}
		}
		local10.anInt5526 = local300;
		this.anInt1042 = -1;
		local15.anInt5526 = local249;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(831) short local831 = 0;
		@Pc(833) short local833 = 0;
		@Pc(841) int local841;
		for (@Pc(835) int local835 = 0; local835 < this.anInt1041; local835++) {
			local841 = local15.method4614();
			if (local841 == 1) {
				local827 = (short) (local10.method4619() + local833);
				local829 = (short) (local827 + local10.method4619());
				local831 = (short) (local829 + local10.method4619());
				this.aShortArray9[local835] = local827;
				local833 = local831;
				this.aShortArray4[local835] = local829;
				this.aShortArray3[local835] = local831;
				if (local827 > this.anInt1042) {
					this.anInt1042 = local827;
				}
				if (this.anInt1042 < local829) {
					this.anInt1042 = local829;
				}
				if (local831 > this.anInt1042) {
					this.anInt1042 = local831;
				}
			}
			if (local841 == 2) {
				local829 = local831;
				local831 = (short) (local10.method4619() + local833);
				this.aShortArray9[local835] = local827;
				local833 = local831;
				this.aShortArray4[local835] = local829;
				this.aShortArray3[local835] = local831;
				if (local831 > this.anInt1042) {
					this.anInt1042 = local831;
				}
			}
			if (local841 == 3) {
				local827 = local831;
				local831 = (short) (local833 + local10.method4619());
				local833 = local831;
				this.aShortArray9[local835] = local827;
				this.aShortArray4[local835] = local829;
				this.aShortArray3[local835] = local831;
				if (local831 > this.anInt1042) {
					this.anInt1042 = local831;
				}
			}
			if (local841 == 4) {
				@Pc(998) short local998 = local827;
				local827 = local829;
				local829 = local998;
				local831 = (short) (local833 + local10.method4619());
				this.aShortArray9[local835] = local827;
				local833 = local831;
				this.aShortArray4[local835] = local998;
				this.aShortArray3[local835] = local831;
				if (this.anInt1042 < local831) {
					this.anInt1042 = local831;
				}
			}
		}
		this.anInt1042++;
		local10.anInt5526 = local353;
		local15.anInt5526 = local361;
		local20.anInt5526 = local379;
		local25.anInt5526 = local387;
		local30.anInt5526 = local393;
		local35.anInt5526 = local399;
		@Pc(1077) int local1077;
		for (local841 = 0; local841 < this.anInt1038; local841++) {
			local1077 = this.aByteArray11[local841] & 0xFF;
			if (local1077 == 0) {
				this.aShortArray7[local841] = (short) local10.method4560();
				this.aShortArray5[local841] = (short) local10.method4560();
				this.aShortArray6[local841] = (short) local10.method4560();
			}
			if (local1077 == 1) {
				this.aShortArray7[local841] = (short) local15.method4560();
				this.aShortArray5[local841] = (short) local15.method4560();
				this.aShortArray6[local841] = (short) local15.method4560();
				this.anIntArray63[local841] = local20.method4560();
				if (this.anInt1037 >= 14) {
					this.anIntArray73[local841] = local20.method4582();
				} else {
					this.anIntArray73[local841] = local20.method4560();
				}
				this.anIntArray68[local841] = local20.method4560();
				this.aByteArray13[local841] = local25.method4576();
				this.aByteArray10[local841] = local30.method4576();
				this.anIntArray64[local841] = local35.method4576();
			}
			if (local1077 == 2) {
				this.aShortArray7[local841] = (short) local15.method4560();
				this.aShortArray5[local841] = (short) local15.method4560();
				this.aShortArray6[local841] = (short) local15.method4560();
				this.anIntArray63[local841] = local20.method4560();
				if (this.anInt1037 < 14) {
					this.anIntArray73[local841] = local20.method4560();
				} else {
					this.anIntArray73[local841] = local20.method4582();
				}
				this.anIntArray68[local841] = local20.method4560();
				this.aByteArray13[local841] = local25.method4576();
				this.aByteArray10[local841] = local30.method4576();
				this.anIntArray64[local841] = local35.method4576();
				this.anIntArray70[local841] = local35.method4576();
				this.anIntArray65[local841] = local35.method4576();
			}
			if (local1077 == 3) {
				this.aShortArray7[local841] = (short) local15.method4560();
				this.aShortArray5[local841] = (short) local15.method4560();
				this.aShortArray6[local841] = (short) local15.method4560();
				this.anIntArray63[local841] = local20.method4560();
				if (this.anInt1037 >= 14) {
					this.anIntArray73[local841] = local20.method4582();
				} else {
					this.anIntArray73[local841] = local20.method4560();
				}
				this.anIntArray68[local841] = local20.method4560();
				this.aByteArray13[local841] = local25.method4576();
				this.aByteArray10[local841] = local30.method4576();
				this.anIntArray64[local841] = local35.method4576();
			}
		}
		local10.anInt5526 = local195;
		@Pc(1411) int local1411;
		@Pc(1417) int local1417;
		@Pc(1423) int local1423;
		@Pc(1485) int local1485;
		if (local87) {
			local1077 = local10.method4614();
			if (local1077 > 0) {
				this.aClass61Array1 = new Class61[local1077];
				for (local1411 = 0; local1411 < local1077; local1411++) {
					local1417 = local10.method4560();
					local1423 = local10.method4560();
					@Pc(1433) byte local1433;
					if (local128 == 255) {
						local1433 = this.aByteArray9[local1423];
					} else {
						local1433 = (byte) local128;
					}
					this.aClass61Array1[local1411] = new Class61(local1417, this.aShortArray9[local1423], this.aShortArray4[local1423], this.aShortArray3[local1423], local1433);
				}
			}
			local1411 = local10.method4614();
			if (local1411 > 0) {
				this.aClass239Array1 = new Class239[local1411];
				for (local1417 = 0; local1417 < local1411; local1417++) {
					local1423 = local10.method4560();
					local1485 = local10.method4560();
					this.aClass239Array1[local1417] = new Class239(local1423, local1485);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1077 = local10.method4614();
		if (local1077 <= 0) {
			return;
		}
		this.aClass158Array1 = new Class158[local1077];
		for (local1411 = 0; local1411 < local1077; local1411++) {
			local1417 = local10.method4560();
			local1423 = local10.method4560();
			local1485 = local10.method4614();
			@Pc(1532) byte local1532 = local10.method4576();
			this.aClass158Array1[local1411] = new Class158(local1417, local1423, local1485, local1532);
		}
		return;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!ch;S)I")
	private int method1010(@OriginalArg(0) int arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray69[arg0];
		@Pc(15) int local15 = arg1.anIntArray67[arg0];
		@Pc(20) int local20 = arg1.anIntArray66[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1051; local22++) {
			if (local10 == this.anIntArray69[local22] && local15 == this.anIntArray67[local22] && this.anIntArray66[local22] == local20) {
				this.aShortArray2[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray69[this.anInt1051] = local10;
		this.anIntArray67[this.anInt1051] = local15;
		this.anIntArray66[this.anInt1051] = local20;
		this.aShortArray2[this.anInt1051] = arg2;
		this.anIntArray72[this.anInt1051] = arg1.anIntArray72 == null ? -1 : arg1.anIntArray72[arg0];
		return this.anInt1051++;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(SSBISBSSSB)B")
	public byte method1011() {
		if (this.anInt1038 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray11[this.anInt1038] = 3;
		this.aShortArray7[this.anInt1038] = 0;
		this.aShortArray5[this.anInt1038] = 32767;
		this.aShortArray6[this.anInt1038] = 0;
		this.anIntArray63[this.anInt1038] = 1024;
		this.anIntArray73[this.anInt1038] = 1024;
		this.anIntArray68[this.anInt1038] = 1024;
		this.aByteArray13[this.anInt1038] = 0;
		this.aByteArray10[this.anInt1038] = 0;
		this.anIntArray64[this.anInt1038] = 0;
		return (byte) this.anInt1038++;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)[[I")
	public int[][] method1012(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt1051 : this.anInt1042;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray72[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local54[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < local18; local80++) {
			@Pc(87) int local87 = this.anIntArray72[local80];
			if (local87 >= 0) {
				local54[local87][local8[local87]++] = local80;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ISS)V")
	public void method1013(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray11 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt1041; local11++) {
			if (this.aShortArray11[local11] == arg0) {
				this.aShortArray11[local11] = arg1;
			}
		}
	}
}
