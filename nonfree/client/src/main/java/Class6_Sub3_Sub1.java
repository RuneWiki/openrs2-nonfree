import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class6_Sub3_Sub1 extends Class6_Sub3 {

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!h", name = "sb", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!h", name = "ub", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!h", name = "xb", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!h", name = "Hb", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!h", name = "Sb", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
	private int anInt1722 = 0;

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
	public int anInt1723 = 0;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "I")
	private int anInt1721 = 0;

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!ai;IIIII)V")
	public Class6_Sub3_Sub1(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method194();
		arg0.method197();
		this.anInt1723 = arg0.anInt250;
		this.anIntArray175 = arg0.anIntArray23;
		this.anIntArray176 = arg0.anIntArray22;
		this.anIntArray167 = arg0.anIntArray26;
		this.anInt1721 = arg0.anInt251;
		this.anIntArray170 = arg0.anIntArray20;
		this.anIntArray166 = arg0.anIntArray21;
		this.anIntArray182 = arg0.anIntArray25;
		this.aByteArray22 = arg0.aByteArray3;
		this.aByteArray21 = arg0.aByteArray1;
		this.aByte5 = arg0.aByte1;
		this.anIntArrayArray12 = arg0.anIntArrayArray4;
		this.anIntArrayArray13 = arg0.anIntArrayArray5;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray174 = new int[this.anInt1721];
		this.anIntArray173 = new int[this.anInt1721];
		this.anIntArray169 = new int[this.anInt1721];
		@Pc(118) int local118;
		if (arg0.aShortArray7 == null) {
			this.aShortArray30 = null;
		} else {
			this.aShortArray30 = new short[this.anInt1721];
			for (local118 = 0; local118 < this.anInt1721; local118++) {
				@Pc(124) short local124 = arg0.aShortArray7[local118];
				if (local124 != -1 && Static56.anInterface2_1.method1090(local124)) {
					this.aShortArray30[local118] = local124;
				} else {
					this.aShortArray30[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt253 > 0 && arg0.aByteArray4 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt253];
			for (@Pc(164) int local164 = 0; local164 < this.anInt1721; local164++) {
				if (arg0.aByteArray4[local164] != -1) {
					local162[arg0.aByteArray4[local164] & 0xFF]++;
				}
			}
			this.anInt1722 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt253; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray9[local193] == 0) {
					this.anInt1722++;
				}
			}
			this.anIntArray172 = new int[this.anInt1722];
			this.anIntArray168 = new int[this.anInt1722];
			this.anIntArray171 = new int[this.anInt1722];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt253; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray9[local233] == 0) {
					this.anIntArray172[local231] = arg0.aShortArray11[local233] & 0xFFFF;
					this.anIntArray168[local231] = arg0.aShortArray9[local233] & 0xFFFF;
					this.anIntArray171[local231] = arg0.aShortArray10[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray20 = new byte[this.anInt1721];
			for (local295 = 0; local295 < this.anInt1721; local295++) {
				if (arg0.aByteArray4[local295] == -1) {
					this.aByteArray20[local295] = -1;
				} else {
					this.aByteArray20[local295] = (byte) local162[arg0.aByteArray4[local295] & 0xFF];
					if (this.aByteArray20[local295] == -1 && this.aShortArray30 != null) {
						this.aShortArray30[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt1721; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray8 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray8[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray1 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray1[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray30 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray30[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class11 local417;
			@Pc(578) Class46 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray6[local118] & 0xFFFF;
					if (arg0.aClass11Array2 == null || arg0.aClass11Array2[this.anIntArray170[local118]] == null) {
						local417 = arg0.aClass11Array1[this.anIntArray170[local118]];
					} else {
						local417 = arg0.aClass11Array2[this.anIntArray170[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt735 + arg4 * local417.anInt734 + arg5 * local417.anInt732) / (local93 * local417.anInt736);
					this.anIntArray174[local118] = Static69.method1195(local398, local295);
					if (arg0.aClass11Array2 == null || arg0.aClass11Array2[this.anIntArray166[local118]] == null) {
						local417 = arg0.aClass11Array1[this.anIntArray166[local118]];
					} else {
						local417 = arg0.aClass11Array2[this.anIntArray166[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt735 + arg4 * local417.anInt734 + arg5 * local417.anInt732) / (local93 * local417.anInt736);
					this.anIntArray173[local118] = Static69.method1195(local398, local295);
					if (arg0.aClass11Array2 == null || arg0.aClass11Array2[this.anIntArray182[local118]] == null) {
						local417 = arg0.aClass11Array1[this.anIntArray182[local118]];
					} else {
						local417 = arg0.aClass11Array2[this.anIntArray182[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt735 + arg4 * local417.anInt734 + arg5 * local417.anInt732) / (local93 * local417.anInt736);
					this.anIntArray169[local118] = Static69.method1195(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass46Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt2070 + arg4 * local578.anInt2071 + arg5 * local578.anInt2073) / (local93 + local93 / 2);
					this.anIntArray174[local118] = Static69.method1195(arg0.aShortArray6[local118] & 0xFFFF, local295);
					this.anIntArray169[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray174[local118] = 128;
					this.anIntArray169[local118] = -1;
				} else {
					this.anIntArray169[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass11Array2 == null || arg0.aClass11Array2[this.anIntArray170[local118]] == null) {
					local417 = arg0.aClass11Array1[this.anIntArray170[local118]];
				} else {
					local417 = arg0.aClass11Array2[this.anIntArray170[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt735 + arg4 * local417.anInt734 + arg5 * local417.anInt732) / (local93 * local417.anInt736);
				this.anIntArray174[local118] = Static69.method1188(local295);
				if (arg0.aClass11Array2 == null || arg0.aClass11Array2[this.anIntArray166[local118]] == null) {
					local417 = arg0.aClass11Array1[this.anIntArray166[local118]];
				} else {
					local417 = arg0.aClass11Array2[this.anIntArray166[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt735 + arg4 * local417.anInt734 + arg5 * local417.anInt732) / (local93 * local417.anInt736);
				this.anIntArray173[local118] = Static69.method1188(local295);
				if (arg0.aClass11Array2 == null || arg0.aClass11Array2[this.anIntArray182[local118]] == null) {
					local417 = arg0.aClass11Array1[this.anIntArray182[local118]];
				} else {
					local417 = arg0.aClass11Array2[this.anIntArray182[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt735 + arg4 * local417.anInt734 + arg5 * local417.anInt732) / (local93 * local417.anInt736);
				this.anIntArray169[local118] = Static69.method1188(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass46Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt2070 + arg4 * local578.anInt2071 + arg5 * local578.anInt2073) / (local93 + local93 / 2);
				this.anIntArray174[local118] = Static69.method1188(local295);
				this.anIntArray169[local118] = -1;
			} else {
				this.anIntArray169[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "([Lclient!h;I)V")
	private Class6_Sub3_Sub1(@OriginalArg(0) Class6_Sub3_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt1723 = 0;
		this.anInt1721 = 0;
		this.anInt1722 = 0;
		this.aByte5 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class6_Sub3_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt1723 += local43.anInt1723;
				this.anInt1721 += local43.anInt1721;
				this.anInt1722 += local43.anInt1722;
				if (local43.aByteArray22 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local43.aByte5;
					}
					if (this.aByte5 != local43.aByte5) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray21 != null;
				local22 |= local43.aShortArray30 != null;
				local24 |= local43.aByteArray20 != null;
			}
		}
		this.anIntArray175 = new int[this.anInt1723];
		this.anIntArray176 = new int[this.anInt1723];
		this.anIntArray167 = new int[this.anInt1723];
		this.anIntArray170 = new int[this.anInt1721];
		this.anIntArray166 = new int[this.anInt1721];
		this.anIntArray182 = new int[this.anInt1721];
		this.anIntArray174 = new int[this.anInt1721];
		this.anIntArray173 = new int[this.anInt1721];
		this.anIntArray169 = new int[this.anInt1721];
		if (local18) {
			this.aByteArray22 = new byte[this.anInt1721];
		}
		if (local20) {
			this.aByteArray21 = new byte[this.anInt1721];
		}
		if (local22) {
			this.aShortArray30 = new short[this.anInt1721];
		}
		if (local24) {
			this.aByteArray20 = new byte[this.anInt1721];
		}
		if (this.anInt1722 > 0) {
			this.anIntArray172 = new int[this.anInt1722];
			this.anIntArray168 = new int[this.anInt1722];
			this.anIntArray171 = new int[this.anInt1722];
		}
		this.anInt1723 = 0;
		this.anInt1721 = 0;
		this.anInt1722 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class6_Sub3_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt1721; local229++) {
					this.anIntArray170[this.anInt1721] = local225.anIntArray170[local229] + this.anInt1723;
					this.anIntArray166[this.anInt1721] = local225.anIntArray166[local229] + this.anInt1723;
					this.anIntArray182[this.anInt1721] = local225.anIntArray182[local229] + this.anInt1723;
					this.anIntArray174[this.anInt1721] = local225.anIntArray174[local229];
					this.anIntArray173[this.anInt1721] = local225.anIntArray173[local229];
					this.anIntArray169[this.anInt1721] = local225.anIntArray169[local229];
					if (local18) {
						if (local225.aByteArray22 == null) {
							this.aByteArray22[this.anInt1721] = local225.aByte5;
						} else {
							this.aByteArray22[this.anInt1721] = local225.aByteArray22[local229];
						}
					}
					if (local20 && local225.aByteArray21 != null) {
						this.aByteArray21[this.anInt1721] = local225.aByteArray21[local229];
					}
					if (local22) {
						if (local225.aShortArray30 == null) {
							this.aShortArray30[this.anInt1721] = -1;
						} else {
							this.aShortArray30[this.anInt1721] = local225.aShortArray30[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray20 == null || local225.aByteArray20[local229] == -1) {
							this.aByteArray20[this.anInt1721] = -1;
						} else {
							this.aByteArray20[this.anInt1721] = (byte) (local225.aByteArray20[local229] + this.anInt1722);
						}
					}
					this.anInt1721++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt1722; local394++) {
					this.anIntArray172[this.anInt1722] = local225.anIntArray172[local394] + this.anInt1723;
					this.anIntArray168[this.anInt1722] = local225.anIntArray168[local394] + this.anInt1723;
					this.anIntArray171[this.anInt1722] = local225.anIntArray171[local394] + this.anInt1723;
					this.anInt1722++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt1723; local444++) {
					this.anIntArray175[this.anInt1723] = local225.anIntArray175[local444];
					this.anIntArray176[this.anInt1723] = local225.anIntArray176[local444];
					this.anIntArray167[this.anInt1723] = local225.anIntArray167[local444];
					this.anInt1723++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		if (!this.aBoolean77) {
			this.method1187();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(III)V")
	@Override
	public void method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1723; local1++) {
			this.anIntArray175[local1] += arg0;
			this.anIntArray176[local1] += arg1;
			this.anIntArray167[local1] += arg2;
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class6_Sub3 method1169(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static69.aByteArray24.length < this.anInt1721) {
			Static69.aByteArray24 = new byte[this.anInt1721 + 100];
		}
		return this.method1197(arg0, Static69.aClass6_Sub3_Sub1_2, Static69.aByteArray24);
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "()V")
	private void method1187() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1723; local17++) {
			@Pc(23) int local23 = this.anIntArray175[local17];
			@Pc(28) int local28 = this.anIntArray176[local17];
			@Pc(33) int local33 = this.anIntArray167[local17];
			if (local23 < local1) {
				local1 = local23;
			}
			if (local23 > local7) {
				local7 = local23;
			}
			if (local28 < local3) {
				local3 = local28;
			}
			if (local28 > local9) {
				local9 = local28;
			}
			if (local33 < local5) {
				local5 = local33;
			}
			if (local33 > local11) {
				local11 = local33;
			}
			@Pc(71) int local71 = local23 * local23 + local33 * local33;
			if (local71 > local13) {
				local13 = local71;
			}
			local71 = local23 * local23 + local33 * local33 + local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort18 = (short) local1;
		this.aShort14 = (short) local7;
		this.aShort19 = (short) local3;
		this.aShort17 = (short) local9;
		this.aShort15 = (short) local5;
		this.aShort13 = (short) local11;
		this.aShort16 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort20 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean77 = true;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()I")
	@Override
	public int method1176() {
		if (!this.aBoolean77) {
			this.method1187();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "()I")
	@Override
	public int method1181() {
		if (!this.aBoolean77) {
			this.method1187();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIII)V")
	public void method1189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean77) {
				this.method1187();
			}
			@Pc(6) int local6 = Static56.anInt1519;
			@Pc(8) int local8 = Static56.anInt1525;
			@Pc(12) int local12 = Class1_Sub2_Sub5_Sub2.anIntArray138[0];
			@Pc(16) int local16 = Class1_Sub2_Sub5_Sub2.anIntArray142[0];
			@Pc(20) int local20 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
			@Pc(24) int local24 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
			@Pc(28) int local28 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg1];
			@Pc(32) int local32 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg1];
			@Pc(36) int local36 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg2];
			@Pc(40) int local40 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt1723; local52++) {
				@Pc(58) int local58 = this.anIntArray175[local52];
				@Pc(63) int local63 = this.anIntArray176[local52];
				@Pc(68) int local68 = this.anIntArray167[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static69.anIntArray181[local52] = local68 - local50;
				Static69.anIntArray188[local52] = local6 + (local58 << 9) / arg6;
				Static69.anIntArray187[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt1722 > 0) {
					Static69.anIntArray185[local52] = local58;
					Static69.anIntArray178[local52] = local80;
					Static69.anIntArray184[local52] = local68;
				}
			}
			this.method1198(false, false, 0L, this.aShort20, this.aShort20 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([[IIIIZI)Lclient!h;")
	public Class6_Sub3_Sub1 method1190(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!this.aBoolean77) {
			this.method1187();
		}
		@Pc(9) int local9 = arg1 + this.aShort18;
		@Pc(14) int local14 = arg1 + this.aShort14;
		@Pc(19) int local19 = arg3 + this.aShort15;
		@Pc(24) int local24 = arg3 + this.aShort13;
		if (local9 < 0 || local14 + 128 >> 7 >= arg0.length || local19 < 0 || local24 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local9 >>= 0x7;
		local14 = local14 + 127 >> 7;
		local19 >>= 0x7;
		local24 = local24 + 127 >> 7;
		if (arg0[local9][local19] == arg2 && arg0[local14][local19] == arg2 && arg0[local9][local24] == arg2 && arg0[local14][local24] == arg2) {
			return this;
		}
		@Pc(104) Class6_Sub3_Sub1 local104;
		if (arg4) {
			local104 = new Class6_Sub3_Sub1();
			local104.anInt1723 = this.anInt1723;
			local104.anInt1721 = this.anInt1721;
			local104.anInt1722 = this.anInt1722;
			local104.anIntArray175 = this.anIntArray175;
			local104.anIntArray167 = this.anIntArray167;
			local104.anIntArray170 = this.anIntArray170;
			local104.anIntArray166 = this.anIntArray166;
			local104.anIntArray182 = this.anIntArray182;
			local104.anIntArray174 = this.anIntArray174;
			local104.anIntArray173 = this.anIntArray173;
			local104.anIntArray169 = this.anIntArray169;
			local104.aByteArray22 = this.aByteArray22;
			local104.aByteArray21 = this.aByteArray21;
			local104.aByteArray20 = this.aByteArray20;
			local104.aShortArray30 = this.aShortArray30;
			local104.aByte5 = this.aByte5;
			local104.anIntArray172 = this.anIntArray172;
			local104.anIntArray168 = this.anIntArray168;
			local104.anIntArray171 = this.anIntArray171;
			local104.anIntArrayArray12 = this.anIntArrayArray12;
			local104.anIntArrayArray13 = this.anIntArrayArray13;
			local104.aBoolean76 = super.aBoolean76;
			local104.anIntArray176 = new int[local104.anInt1723];
		} else {
			local104 = this;
		}
		@Pc(204) int local204;
		@Pc(212) int local212;
		@Pc(219) int local219;
		@Pc(223) int local223;
		@Pc(227) int local227;
		@Pc(231) int local231;
		@Pc(235) int local235;
		@Pc(257) int local257;
		@Pc(283) int local283;
		@Pc(295) int local295;
		if (arg5 == 0) {
			for (local204 = 0; local204 < local104.anInt1723; local204++) {
				local212 = this.anIntArray175[local204] + arg1;
				local219 = this.anIntArray167[local204] + arg3;
				local223 = local212 & 0x7F;
				local227 = local219 & 0x7F;
				local231 = local212 >> 7;
				local235 = local219 >> 7;
				local257 = arg0[local231][local235] * (128 - local223) + arg0[local231 + 1][local235] * local223 >> 7;
				local283 = arg0[local231][local235 + 1] * (128 - local223) + arg0[local231 + 1][local235 + 1] * local223 >> 7;
				local295 = local257 * (128 - local227) + local283 * local227 >> 7;
				local104.anIntArray176[local204] = this.anIntArray176[local204] + local295 - arg2;
			}
		} else {
			for (local204 = 0; local204 < local104.anInt1723; local204++) {
				local212 = (this.anIntArray176[local204] << 16) / this.aShort19;
				if (local212 < arg5) {
					local219 = this.anIntArray175[local204] + arg1;
					local223 = this.anIntArray167[local204] + arg3;
					local227 = local219 & 0x7F;
					local231 = local223 & 0x7F;
					local235 = local219 >> 7;
					local257 = local223 >> 7;
					local283 = arg0[local235][local257] * (128 - local227) + arg0[local235 + 1][local257] * local227 >> 7;
					local295 = arg0[local235][local257 + 1] * (128 - local227) + arg0[local235 + 1][local257 + 1] * local227 >> 7;
					@Pc(419) int local419 = local283 * (128 - local231) + local295 * local231 >> 7;
					local104.anIntArray176[local204] = this.anIntArray176[local204] + (local419 - arg2) * (arg5 - local212) / arg5;
				} else {
					local104.anIntArray176[local204] = this.anIntArray176[local204];
				}
			}
		}
		local104.aBoolean77 = false;
		return local104;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class6_Sub3 method1183(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static69.aByteArray23.length < this.anInt1721) {
			Static69.aByteArray23 = new byte[this.anInt1721 + 100];
		}
		return this.method1197(arg0, Static69.aClass6_Sub3_Sub1_1, Static69.aByteArray23);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean77) {
			this.method1187();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort16 * arg2 + this.aShort17 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort16 * arg2 + this.aShort19 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort16 << 9;
		if (local78 / local38 <= Static56.anInt1520) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort16 << 9;
		if (local91 / local38 >= Static56.anInt1521) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort16 * arg1 + this.aShort17 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static56.anInt1518) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort16 * arg1 + this.aShort19 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static56.anInt1526) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt1722 > 0;
		@Pc(172) int local172 = Static56.anInt1519;
		@Pc(174) int local174 = Static56.anInt1525;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
			local178 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static18.aBoolean22 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			local240 = Static181.anInt4057 - Static56.anInt1519;
			@Pc(244) int local244 = Static37.anInt1043 - Static56.anInt1525;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { this.aShort18, this.aShort14, this.aShort18, this.aShort14, this.aShort18, this.aShort14, this.aShort18, this.aShort14 };
				@Pc(350) int[] local350 = new int[] { this.aShort15, this.aShort15, this.aShort13, this.aShort13, this.aShort15, this.aShort15, this.aShort13, this.aShort13 };
				@Pc(393) int[] local393 = new int[] { this.aShort19, this.aShort19, this.aShort19, this.aShort19, this.aShort17, this.aShort17, this.aShort17, this.aShort17 };
				for (@Pc(395) int local395 = 0; local395 < 8; local395++) {
					@Pc(400) int local400 = local307[local395];
					@Pc(404) int local404 = local393[local395];
					@Pc(408) int local408 = local350[local395];
					@Pc(420) int local420;
					if (arg0 != 0) {
						local420 = local408 * local176 + local400 * local178 >> 16;
						local408 = local408 * local178 - local400 * local176 >> 16;
						local400 = local420;
					}
					local400 += arg5;
					local404 += arg6;
					local408 += arg7;
					local420 = local408 * arg3 + local400 * arg4 >> 16;
					local408 = local408 * arg4 - local400 * arg3 >> 16;
					local400 = local420;
					local420 = local404 * arg2 - local408 * arg1 >> 16;
					local408 = local404 * arg1 + local408 * arg2 >> 16;
					if (local408 > 0) {
						@Pc(496) int local496 = (local400 << 9) / local408;
						@Pc(502) int local502 = (local420 << 9) / local408;
						if (local496 < local204) {
							local204 = local496;
						}
						if (local496 > local208) {
							local208 = local496;
						}
						if (local502 < local223) {
							local223 = local502;
						}
						if (local502 > local227) {
							local227 = local502;
						}
					}
				}
				if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
					if (super.aBoolean76) {
						Static120.aLongArray6[Static64.anInt1667++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt1723; local204++) {
			local223 = this.anIntArray175[local204];
			local208 = this.anIntArray176[local204];
			local227 = this.anIntArray167[local204];
			if (arg0 != 0) {
				local240 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local240;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local240 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local240;
			local240 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static69.anIntArray181[local204] = local227 - local24;
			if (local227 >= 50) {
				Static69.anIntArray188[local204] = local172 + (local223 << 9) / local227;
				Static69.anIntArray187[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static69.anIntArray188[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static69.anIntArray185[local204] = local223;
				Static69.anIntArray178[local204] = local240;
				Static69.anIntArray184[local204] = local227;
			}
		}
		try {
			this.method1198(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	@Override
	public void method1174() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1723; local1++) {
			this.anIntArray175[local1] = -this.anIntArray175[local1];
			this.anIntArray167[local1] = -this.anIntArray167[local1];
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	private void method1193(@OriginalArg(0) int arg0) {
		if (Static69.aBooleanArray10[arg0]) {
			this.method1199(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray170[arg0];
		@Pc(17) int local17 = this.anIntArray166[arg0];
		@Pc(22) int local22 = this.anIntArray182[arg0];
		Static56.aBoolean61 = Static69.aBooleanArray11[arg0];
		if (this.aByteArray21 == null) {
			Static56.anInt1522 = 0;
		} else {
			Static56.anInt1522 = this.aByteArray21[arg0] & 0xFF;
		}
		if (this.aShortArray30 != null && this.aShortArray30[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray20 == null || this.aByteArray20[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray20[arg0] & 0xFF;
				local133 = this.anIntArray172[local128];
				local138 = this.anIntArray168[local128];
				local143 = this.anIntArray171[local128];
			}
			if (this.anIntArray169[arg0] == -1) {
				Static56.method1031(Static69.anIntArray187[local12], Static69.anIntArray187[local17], Static69.anIntArray187[local22], Static69.anIntArray188[local12], Static69.anIntArray188[local17], Static69.anIntArray188[local22], this.anIntArray174[arg0], this.anIntArray174[arg0], this.anIntArray174[arg0], Static69.anIntArray185[local133], Static69.anIntArray185[local138], Static69.anIntArray185[local143], Static69.anIntArray178[local133], Static69.anIntArray178[local138], Static69.anIntArray178[local143], Static69.anIntArray184[local133], Static69.anIntArray184[local138], Static69.anIntArray184[local143], this.aShortArray30[arg0]);
			} else {
				Static56.method1031(Static69.anIntArray187[local12], Static69.anIntArray187[local17], Static69.anIntArray187[local22], Static69.anIntArray188[local12], Static69.anIntArray188[local17], Static69.anIntArray188[local22], this.anIntArray174[arg0], this.anIntArray173[arg0], this.anIntArray169[arg0], Static69.anIntArray185[local133], Static69.anIntArray185[local138], Static69.anIntArray185[local143], Static69.anIntArray178[local133], Static69.anIntArray178[local138], Static69.anIntArray178[local143], Static69.anIntArray184[local133], Static69.anIntArray184[local138], Static69.anIntArray184[local143], this.aShortArray30[arg0]);
			}
		} else if (this.anIntArray169[arg0] == -1) {
			Static56.method1036(Static69.anIntArray187[local12], Static69.anIntArray187[local17], Static69.anIntArray187[local22], Static69.anIntArray188[local12], Static69.anIntArray188[local17], Static69.anIntArray188[local22], Static56.anIntArray141[this.anIntArray174[arg0]]);
		} else {
			Static56.method1026(Static69.anIntArray187[local12], Static69.anIntArray187[local17], Static69.anIntArray187[local22], Static69.anIntArray188[local12], Static69.anIntArray188[local17], Static69.anIntArray188[local22], this.anIntArray174[arg0], this.anIntArray173[arg0], this.anIntArray169[arg0]);
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "()V")
	@Override
	public void method1177() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1723; local1++) {
			@Pc(7) int local7 = this.anIntArray175[local1];
			this.anIntArray175[local1] = this.anIntArray167[local1];
			this.anIntArray167[local1] = -local7;
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!bf;)Lclient!bf;")
	public Class6_Sub3 method1194(@OriginalArg(0) Class6_Sub3 arg0) {
		return new Class6_Sub3_Sub1(new Class6_Sub3_Sub1[] { this, (Class6_Sub3_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(III)V")
	@Override
	public void method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1723; local1++) {
			this.anIntArray175[local1] = this.anIntArray175[local1] * arg0 / 128;
			this.anIntArray176[local1] = this.anIntArray176[local1] * arg1 / 128;
			this.anIntArray167[local1] = this.anIntArray167[local1] * arg2 / 128;
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public void method1175(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
		@Pc(7) int local7 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1723; local9++) {
			@Pc(26) int local26 = this.anIntArray167[local9] * local3 + this.anIntArray175[local9] * local7 >> 16;
			this.anIntArray167[local9] = this.anIntArray167[local9] * local7 - this.anIntArray175[local9] * local3 >> 16;
			this.anIntArray175[local9] = local26;
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!sg;I)V")
	@Override
	public void method1173(@OriginalArg(0) Class1_Sub2_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray12 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class51 local12 = arg0.aClass51Array1[arg1];
		@Pc(15) Class1_Sub22 local15 = local12.aClass1_Sub22_1;
		Static69.anInt1724 = 0;
		Static69.anInt1726 = 0;
		Static69.anInt1725 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2555; local23++) {
			@Pc(29) short local29 = local12.aShortArray41[local23];
			if (local12.aShortArray36[local23] != -1) {
				this.method1196(0, local15.anIntArrayArray34[local12.aShortArray36[local23]], 0, 0, 0);
			}
			this.method1196(local15.anIntArray403[local29], local15.anIntArrayArray34[local29], local12.aShortArray44[local23], local12.aShortArray40[local23], local12.aShortArray37[local23]);
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	@Override
	public void method1182(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
		@Pc(7) int local7 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1723; local9++) {
			@Pc(26) int local26 = this.anIntArray176[local9] * local7 - this.anIntArray167[local9] * local3 >> 16;
			this.anIntArray167[local9] = this.anIntArray176[local9] * local3 + this.anIntArray167[local9] * local7 >> 16;
			this.anIntArray176[local9] = local26;
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()V")
	@Override
	public void method1178() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1723; local1++) {
			@Pc(7) int local7 = this.anIntArray167[local1];
			this.anIntArray167[local1] = this.anIntArray175[local1];
			this.anIntArray175[local1] = -local7;
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	@Override
	public void method1180(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
		@Pc(7) int local7 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1723; local9++) {
			@Pc(26) int local26 = this.anIntArray176[local9] * local3 + this.anIntArray175[local9] * local7 >> 16;
			this.anIntArray176[local9] = this.anIntArray176[local9] * local7 - this.anIntArray175[local9] * local3 >> 16;
			this.anIntArray175[local9] = local26;
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean77) {
				this.method1187();
			}
			@Pc(6) int local6 = Static56.anInt1519;
			@Pc(8) int local8 = Static56.anInt1525;
			@Pc(12) int local12 = Class1_Sub2_Sub5_Sub2.anIntArray138[0];
			@Pc(16) int local16 = Class1_Sub2_Sub5_Sub2.anIntArray142[0];
			@Pc(20) int local20 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
			@Pc(24) int local24 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
			@Pc(28) int local28 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg1];
			@Pc(32) int local32 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg1];
			@Pc(36) int local36 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg2];
			@Pc(40) int local40 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt1723; local52++) {
				@Pc(58) int local58 = this.anIntArray175[local52];
				@Pc(63) int local63 = this.anIntArray176[local52];
				@Pc(68) int local68 = this.anIntArray167[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static69.anIntArray181[local52] = local68 - local50;
				Static69.anIntArray188[local52] = local6 + (local58 << 9) / local68;
				Static69.anIntArray187[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt1722 > 0) {
					Static69.anIntArray185[local52] = local58;
					Static69.anIntArray178[local52] = local80;
					Static69.anIntArray184[local52] = local68;
				}
			}
			this.method1198(false, false, 0L, this.aShort20, this.aShort20 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "()I")
	@Override
	public int method1186() {
		if (!this.aBoolean77) {
			this.method1187();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[IIII)V")
	private void method1196(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static69.anInt1724 = 0;
			Static69.anInt1726 = 0;
			Static69.anInt1725 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray12.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray12[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static69.anInt1724 += this.anIntArray175[local36];
						Static69.anInt1726 += this.anIntArray176[local36];
						Static69.anInt1725 += this.anIntArray167[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static69.anInt1724 = Static69.anInt1724 / local6 + arg2;
				Static69.anInt1726 = Static69.anInt1726 / local6 + arg3;
				Static69.anInt1725 = Static69.anInt1725 / local6 + arg4;
			} else {
				Static69.anInt1724 = arg2;
				Static69.anInt1726 = arg3;
				Static69.anInt1725 = arg4;
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
						this.anIntArray175[local31] += arg2;
						this.anIntArray176[local31] += arg3;
						this.anIntArray167[local31] += arg4;
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
						this.anIntArray175[local31] -= Static69.anInt1724;
						this.anIntArray176[local31] -= Static69.anInt1726;
						this.anIntArray167[local31] -= Static69.anInt1725;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg4];
							local217 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg4];
							local235 = this.anIntArray176[local31] * local36 + this.anIntArray175[local31] * local217 + 32767 >> 16;
							this.anIntArray176[local31] = this.anIntArray176[local31] * local217 + 32767 - this.anIntArray175[local31] * local36 >> 16;
							this.anIntArray175[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg2];
							local217 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg2];
							local235 = this.anIntArray176[local31] * local217 + 32767 - this.anIntArray167[local31] * local36 >> 16;
							this.anIntArray167[local31] = this.anIntArray176[local31] * local36 + this.anIntArray167[local31] * local217 + 32767 >> 16;
							this.anIntArray176[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg3];
							local217 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg3];
							local235 = this.anIntArray167[local31] * local36 + this.anIntArray175[local31] * local217 + 32767 >> 16;
							this.anIntArray167[local31] = this.anIntArray167[local31] * local217 + 32767 - this.anIntArray175[local31] * local36 >> 16;
							this.anIntArray175[local31] = local235;
						}
						this.anIntArray175[local31] += Static69.anInt1724;
						this.anIntArray176[local31] += Static69.anInt1726;
						this.anIntArray167[local31] += Static69.anInt1725;
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
						this.anIntArray175[local31] -= Static69.anInt1724;
						this.anIntArray176[local31] -= Static69.anInt1726;
						this.anIntArray167[local31] -= Static69.anInt1725;
						this.anIntArray175[local31] = this.anIntArray175[local31] * arg2 / 128;
						this.anIntArray176[local31] = this.anIntArray176[local31] * arg3 / 128;
						this.anIntArray167[local31] = this.anIntArray167[local31] * arg4 / 128;
						this.anIntArray175[local31] += Static69.anInt1724;
						this.anIntArray176[local31] += Static69.anInt1726;
						this.anIntArray167[local31] += Static69.anInt1725;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray13 != null && this.aByteArray21 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray13.length) {
					local115 = this.anIntArrayArray13[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray21[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray21[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!h;[B)Lclient!bf;")
	private Class6_Sub3 method1197(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub3_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1723 = this.anInt1723;
		arg1.anInt1721 = this.anInt1721;
		arg1.anInt1722 = this.anInt1722;
		if (arg1.anIntArray175 == null || arg1.anIntArray175.length < this.anInt1723) {
			arg1.anIntArray175 = new int[this.anInt1723 + 100];
			arg1.anIntArray176 = new int[this.anInt1723 + 100];
			arg1.anIntArray167 = new int[this.anInt1723 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt1723; local43++) {
			arg1.anIntArray175[local43] = this.anIntArray175[local43];
			arg1.anIntArray176[local43] = this.anIntArray176[local43];
			arg1.anIntArray167[local43] = this.anIntArray167[local43];
		}
		if (arg0) {
			arg1.aByteArray21 = this.aByteArray21;
		} else {
			arg1.aByteArray21 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray21 == null) {
				for (local88 = 0; local88 < this.anInt1721; local88++) {
					arg1.aByteArray21[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt1721; local88++) {
					arg1.aByteArray21[local88] = this.aByteArray21[local88];
				}
			}
		}
		arg1.anIntArray170 = this.anIntArray170;
		arg1.anIntArray166 = this.anIntArray166;
		arg1.anIntArray182 = this.anIntArray182;
		arg1.anIntArray174 = this.anIntArray174;
		arg1.anIntArray173 = this.anIntArray173;
		arg1.anIntArray169 = this.anIntArray169;
		arg1.aByteArray22 = this.aByteArray22;
		arg1.aByteArray20 = this.aByteArray20;
		arg1.aShortArray30 = this.aShortArray30;
		arg1.aByte5 = this.aByte5;
		arg1.anIntArray172 = this.anIntArray172;
		arg1.anIntArray168 = this.anIntArray168;
		arg1.anIntArray171 = this.anIntArray171;
		arg1.anIntArrayArray12 = this.anIntArrayArray12;
		arg1.anIntArrayArray13 = this.anIntArrayArray13;
		arg1.aBoolean76 = super.aBoolean76;
		arg1.aBoolean77 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZJII)V")
	private void method1198(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static69.anIntArray179[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < this.anInt1721; local16++) {
			if (this.anIntArray169[local16] != -2) {
				local28 = this.anIntArray170[local16];
				local33 = this.anIntArray166[local16];
				local38 = this.anIntArray182[local16];
				local42 = Static69.anIntArray188[local28];
				local46 = Static69.anIntArray188[local33];
				local50 = Static69.anIntArray188[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static69.anIntArray185[local28];
					local69 = Static69.anIntArray185[local33];
					@Pc(73) int local73 = Static69.anIntArray185[local38];
					@Pc(77) int local77 = Static69.anIntArray178[local28];
					local81 = Static69.anIntArray178[local33];
					local85 = Static69.anIntArray178[local38];
					@Pc(89) int local89 = Static69.anIntArray184[local28];
					local93 = Static69.anIntArray184[local33];
					@Pc(97) int local97 = Static69.anIntArray184[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static69.aBooleanArray10[local16] = true;
						@Pc(177) int local177 = (Static69.anIntArray181[local28] + Static69.anIntArray181[local33] + Static69.anIntArray181[local38]) / 3 + arg3;
						Static69.anIntArrayArray14[local177][Static69.anIntArray179[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1191(Static181.anInt4057, Static37.anInt1043, Static69.anIntArray187[local28], Static69.anIntArray187[local33], Static69.anIntArray187[local38], local42, local46, local50)) {
						Static120.aLongArray6[Static64.anInt1667++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static69.anIntArray187[local38] - Static69.anIntArray187[local33]) - (Static69.anIntArray187[local28] - Static69.anIntArray187[local33]) * (local50 - local46) > 0) {
						Static69.aBooleanArray10[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static56.anInt1524 && local46 <= Static56.anInt1524 && local50 <= Static56.anInt1524) {
							Static69.aBooleanArray11[local16] = false;
						} else {
							Static69.aBooleanArray11[local16] = true;
						}
						local65 = (Static69.anIntArray181[local28] + Static69.anIntArray181[local33] + Static69.anIntArray181[local38]) / 3 + arg3;
						Static69.anIntArrayArray14[local65][Static69.anIntArray179[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray22 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static69.anIntArray179[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static69.anIntArrayArray14[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1193(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static69.anIntArray180[local28] = 0;
			Static69.anIntArray191[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static69.anIntArray179[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static69.anIntArrayArray14[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray22[local50];
					local69 = Static69.anIntArray180[local382]++;
					Static69.anIntArrayArray15[local382][local69] = local50;
					if (local382 < 10) {
						Static69.anIntArray191[local382] += local33;
					} else if (local382 == 10) {
						Static69.anIntArray183[local69] = local33;
					} else {
						Static69.anIntArray189[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static69.anIntArray180[1] > 0 || Static69.anIntArray180[2] > 0) {
			local38 = (Static69.anIntArray191[1] + Static69.anIntArray191[2]) / (Static69.anIntArray180[1] + Static69.anIntArray180[2]);
		}
		local42 = 0;
		if (Static69.anIntArray180[3] > 0 || Static69.anIntArray180[4] > 0) {
			local42 = (Static69.anIntArray191[3] + Static69.anIntArray191[4]) / (Static69.anIntArray180[3] + Static69.anIntArray180[4]);
		}
		local46 = 0;
		if (Static69.anIntArray180[6] > 0 || Static69.anIntArray180[8] > 0) {
			local46 = (Static69.anIntArray191[6] + Static69.anIntArray191[8]) / (Static69.anIntArray180[6] + Static69.anIntArray180[8]);
		}
		local65 = 0;
		local69 = Static69.anIntArray180[10];
		@Pc(515) int[] local515 = Static69.anIntArrayArray15[10];
		@Pc(517) int[] local517 = Static69.anIntArray183;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static69.anIntArray180[11];
			local515 = Static69.anIntArrayArray15[11];
			local517 = Static69.anIntArray189;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1193(local515[local65++]);
				if (local65 == local69 && local515 != Static69.anIntArrayArray15[11]) {
					local65 = 0;
					local69 = Static69.anIntArray180[11];
					local515 = Static69.anIntArrayArray15[11];
					local517 = Static69.anIntArray189;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1193(local515[local65++]);
				if (local65 == local69 && local515 != Static69.anIntArrayArray15[11]) {
					local65 = 0;
					local69 = Static69.anIntArray180[11];
					local515 = Static69.anIntArrayArray15[11];
					local517 = Static69.anIntArray189;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1193(local515[local65++]);
				if (local65 == local69 && local515 != Static69.anIntArrayArray15[11]) {
					local65 = 0;
					local69 = Static69.anIntArray180[11];
					local515 = Static69.anIntArrayArray15[11];
					local517 = Static69.anIntArray189;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static69.anIntArray180[local81];
			@Pc(680) int[] local680 = Static69.anIntArrayArray15[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1193(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1193(local515[local65++]);
			if (local65 == local69 && local515 != Static69.anIntArrayArray15[11]) {
				local65 = 0;
				local515 = Static69.anIntArrayArray15[11];
				local69 = Static69.anIntArray180[11];
				local517 = Static69.anIntArray189;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	private void method1199(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static56.anInt1519;
		@Pc(3) int local3 = Static56.anInt1525;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray170[arg0];
		@Pc(15) int local15 = this.anIntArray166[arg0];
		@Pc(20) int local20 = this.anIntArray182[arg0];
		@Pc(24) int local24 = Static69.anIntArray184[local10];
		@Pc(28) int local28 = Static69.anIntArray184[local15];
		@Pc(32) int local32 = Static69.anIntArray184[local20];
		if (this.aByteArray21 == null) {
			Static56.anInt1522 = 0;
		} else {
			Static56.anInt1522 = this.aByteArray21[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static69.anIntArray190[0] = Static69.anIntArray188[local10];
			Static69.anIntArray186[0] = Static69.anIntArray187[local10];
			local5++;
			Static69.anIntArray177[0] = this.anIntArray174[arg0];
		} else {
			local73 = Static69.anIntArray185[local10];
			local77 = Static69.anIntArray178[local10];
			local82 = this.anIntArray174[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class1_Sub2_Sub5_Sub2.anIntArray140[local32 - local24];
				Static69.anIntArray190[0] = local1 + (local73 + ((Static69.anIntArray185[local20] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray186[0] = local3 + (local77 + ((Static69.anIntArray178[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static69.anIntArray177[0] = local82 + ((this.anIntArray169[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class1_Sub2_Sub5_Sub2.anIntArray140[local28 - local24];
				Static69.anIntArray190[local5] = local1 + (local73 + ((Static69.anIntArray185[local15] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray186[local5] = local3 + (local77 + ((Static69.anIntArray178[local15] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray177[local5++] = local82 + ((this.anIntArray173[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static69.anIntArray190[local5] = Static69.anIntArray188[local15];
			Static69.anIntArray186[local5] = Static69.anIntArray187[local15];
			Static69.anIntArray177[local5++] = this.anIntArray173[arg0];
		} else {
			local73 = Static69.anIntArray185[local15];
			local77 = Static69.anIntArray178[local15];
			local82 = this.anIntArray173[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class1_Sub2_Sub5_Sub2.anIntArray140[local24 - local28];
				Static69.anIntArray190[local5] = local1 + (local73 + ((Static69.anIntArray185[local10] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray186[local5] = local3 + (local77 + ((Static69.anIntArray178[local10] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray177[local5++] = local82 + ((this.anIntArray174[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class1_Sub2_Sub5_Sub2.anIntArray140[local32 - local28];
				Static69.anIntArray190[local5] = local1 + (local73 + ((Static69.anIntArray185[local20] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray186[local5] = local3 + (local77 + ((Static69.anIntArray178[local20] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray177[local5++] = local82 + ((this.anIntArray169[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static69.anIntArray190[local5] = Static69.anIntArray188[local20];
			Static69.anIntArray186[local5] = Static69.anIntArray187[local20];
			Static69.anIntArray177[local5++] = this.anIntArray169[arg0];
		} else {
			local73 = Static69.anIntArray185[local20];
			local77 = Static69.anIntArray178[local20];
			local82 = this.anIntArray169[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class1_Sub2_Sub5_Sub2.anIntArray140[local28 - local32];
				Static69.anIntArray190[local5] = local1 + (local73 + ((Static69.anIntArray185[local15] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray186[local5] = local3 + (local77 + ((Static69.anIntArray178[local15] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray177[local5++] = local82 + ((this.anIntArray173[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class1_Sub2_Sub5_Sub2.anIntArray140[local24 - local32];
				Static69.anIntArray190[local5] = local1 + (local73 + ((Static69.anIntArray185[local10] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray186[local5] = local3 + (local77 + ((Static69.anIntArray178[local10] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray177[local5++] = local82 + ((this.anIntArray174[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static69.anIntArray190[0];
		local77 = Static69.anIntArray190[1];
		local82 = Static69.anIntArray190[2];
		local95 = Static69.anIntArray186[0];
		@Pc(590) int local590 = Static69.anIntArray186[1];
		@Pc(594) int local594 = Static69.anIntArray186[2];
		Static56.aBoolean61 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static56.anInt1524 || local77 > Static56.anInt1524 || local82 > Static56.anInt1524) {
				Static56.aBoolean61 = true;
			}
			if (this.aShortArray30 != null && this.aShortArray30[arg0] != -1) {
				if (this.aByteArray20 == null || this.aByteArray20[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray20[arg0] & 0xFF;
					local683 = this.anIntArray172[local678];
					local688 = this.anIntArray168[local678];
					local693 = this.anIntArray171[local678];
				}
				if (this.anIntArray169[arg0] == -1) {
					Static56.method1031(local95, local590, local594, local73, local77, local82, this.anIntArray174[arg0], this.anIntArray174[arg0], this.anIntArray174[arg0], Static69.anIntArray185[local683], Static69.anIntArray185[local688], Static69.anIntArray185[local693], Static69.anIntArray178[local683], Static69.anIntArray178[local688], Static69.anIntArray178[local693], Static69.anIntArray184[local683], Static69.anIntArray184[local688], Static69.anIntArray184[local693], this.aShortArray30[arg0]);
				} else {
					Static56.method1031(local95, local590, local594, local73, local77, local82, Static69.anIntArray177[0], Static69.anIntArray177[1], Static69.anIntArray177[2], Static69.anIntArray185[local683], Static69.anIntArray185[local688], Static69.anIntArray185[local693], Static69.anIntArray178[local683], Static69.anIntArray178[local688], Static69.anIntArray178[local693], Static69.anIntArray184[local683], Static69.anIntArray184[local688], Static69.anIntArray184[local693], this.aShortArray30[arg0]);
				}
			} else if (this.anIntArray169[arg0] == -1) {
				Static56.method1036(local95, local590, local594, local73, local77, local82, Static56.anIntArray141[this.anIntArray174[arg0]]);
			} else {
				Static56.method1026(local95, local590, local594, local73, local77, local82, Static69.anIntArray177[0], Static69.anIntArray177[1], Static69.anIntArray177[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static56.anInt1524 || local77 > Static56.anInt1524 || local82 > Static56.anInt1524 || Static69.anIntArray190[3] < 0 || Static69.anIntArray190[3] > Static56.anInt1524) {
			Static56.aBoolean61 = true;
		}
		if (this.aShortArray30 == null || this.aShortArray30[arg0] == -1) {
			if (this.anIntArray169[arg0] == -1) {
				local683 = Static56.anIntArray141[this.anIntArray174[arg0]];
				Static56.method1036(local95, local590, local594, local73, local77, local82, local683);
				Static56.method1036(local95, local594, Static69.anIntArray186[3], local73, local82, Static69.anIntArray190[3], local683);
				return;
			}
			Static56.method1026(local95, local590, local594, local73, local77, local82, Static69.anIntArray177[0], Static69.anIntArray177[1], Static69.anIntArray177[2]);
			Static56.method1026(local95, local594, Static69.anIntArray186[3], local73, local82, Static69.anIntArray190[3], Static69.anIntArray177[0], Static69.anIntArray177[2], Static69.anIntArray177[3]);
			return;
		}
		if (this.aByteArray20 == null || this.aByteArray20[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray20[arg0] & 0xFF;
			local683 = this.anIntArray172[local678];
			local688 = this.anIntArray168[local678];
			local693 = this.anIntArray171[local678];
		}
		@Pc(956) short local956 = this.aShortArray30[arg0];
		if (this.anIntArray169[arg0] == -1) {
			Static56.method1031(local95, local590, local594, local73, local77, local82, this.anIntArray174[arg0], this.anIntArray174[arg0], this.anIntArray174[arg0], Static69.anIntArray185[local683], Static69.anIntArray185[local688], Static69.anIntArray185[local693], Static69.anIntArray178[local683], Static69.anIntArray178[local688], Static69.anIntArray178[local693], Static69.anIntArray184[local683], Static69.anIntArray184[local688], Static69.anIntArray184[local693], local956);
			Static56.method1031(local95, local594, Static69.anIntArray186[3], local73, local82, Static69.anIntArray190[3], this.anIntArray174[arg0], this.anIntArray174[arg0], this.anIntArray174[arg0], Static69.anIntArray185[local683], Static69.anIntArray185[local688], Static69.anIntArray185[local693], Static69.anIntArray178[local683], Static69.anIntArray178[local688], Static69.anIntArray178[local693], Static69.anIntArray184[local683], Static69.anIntArray184[local688], Static69.anIntArray184[local693], local956);
			return;
		}
		Static56.method1031(local95, local590, local594, local73, local77, local82, Static69.anIntArray177[0], Static69.anIntArray177[1], Static69.anIntArray177[2], Static69.anIntArray185[local683], Static69.anIntArray185[local688], Static69.anIntArray185[local693], Static69.anIntArray178[local683], Static69.anIntArray178[local688], Static69.anIntArray178[local693], Static69.anIntArray184[local683], Static69.anIntArray184[local688], Static69.anIntArray184[local693], local956);
		Static56.method1031(local95, local594, Static69.anIntArray186[3], local73, local82, Static69.anIntArray190[3], Static69.anIntArray177[0], Static69.anIntArray177[2], Static69.anIntArray177[3], Static69.anIntArray185[local683], Static69.anIntArray185[local688], Static69.anIntArray185[local693], Static69.anIntArray178[local683], Static69.anIntArray178[local688], Static69.anIntArray178[local693], Static69.anIntArray184[local683], Static69.anIntArray184[local688], Static69.anIntArray184[local693], local956);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!sg;ILclient!sg;I[I)V")
	@Override
	public void method1179(@OriginalArg(0) Class1_Sub2_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1173(arg0, arg1);
			return;
		}
		@Pc(18) Class51 local18 = arg0.aClass51Array1[arg1];
		@Pc(23) Class51 local23 = arg2.aClass51Array1[arg3];
		@Pc(26) Class1_Sub22 local26 = local18.aClass1_Sub22_1;
		Static69.anInt1724 = 0;
		Static69.anInt1726 = 0;
		Static69.anInt1725 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2555; local41++) {
			@Pc(47) short local47 = local18.aShortArray41[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray403[local47] == 0) {
				if (local18.aShortArray36[local41] != -1) {
					this.method1196(0, local26.anIntArrayArray34[local18.aShortArray36[local41]], 0, 0, 0);
				}
				this.method1196(local26.anIntArray403[local47], local26.anIntArrayArray34[local47], local18.aShortArray44[local41], local18.aShortArray40[local41], local18.aShortArray37[local41]);
			}
		}
		Static69.anInt1724 = 0;
		Static69.anInt1726 = 0;
		Static69.anInt1725 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt2555; local125++) {
			@Pc(131) short local131 = local23.aShortArray41[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray403[local131] == 0) {
				if (local23.aShortArray36[local125] != -1) {
					this.method1196(0, local26.anIntArrayArray34[local23.aShortArray36[local125]], 0, 0, 0);
				}
				this.method1196(local26.anIntArray403[local131], local26.anIntArrayArray34[local131], local23.aShortArray44[local125], local23.aShortArray40[local125], local23.aShortArray37[local125]);
			}
		}
		this.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()I")
	@Override
	public int method1170() {
		if (!this.aBoolean77) {
			this.method1187();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
	@Override
	public int method1172() {
		if (!this.aBoolean77) {
			this.method1187();
		}
		return this.aShort18;
	}
}
