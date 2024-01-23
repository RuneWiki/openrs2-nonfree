import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
	private int anInt549 = 0;

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
	private int anInt550 = 0;

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
	public int anInt551 = 0;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!ai;IIIII)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method269();
		arg0.method275();
		this.anInt551 = arg0.anInt274;
		this.anIntArray58 = arg0.anIntArray26;
		this.anIntArray50 = arg0.anIntArray29;
		this.anIntArray49 = arg0.anIntArray31;
		this.anInt549 = arg0.anInt273;
		this.anIntArray52 = arg0.anIntArray27;
		this.anIntArray48 = arg0.anIntArray22;
		this.anIntArray56 = arg0.anIntArray25;
		this.aByteArray19 = arg0.aByteArray4;
		this.aByteArray18 = arg0.aByteArray2;
		this.aByte5 = arg0.aByte1;
		this.anIntArrayArray7 = arg0.anIntArrayArray2;
		this.anIntArrayArray8 = arg0.anIntArrayArray3;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray51 = new int[this.anInt549];
		this.anIntArray59 = new int[this.anInt549];
		this.anIntArray53 = new int[this.anInt549];
		@Pc(118) int local118;
		if (arg0.aShortArray5 == null) {
			this.aShortArray11 = null;
		} else {
			this.aShortArray11 = new short[this.anInt549];
			for (local118 = 0; local118 < this.anInt549; local118++) {
				@Pc(124) short local124 = arg0.aShortArray5[local118];
				if (local124 != -1 && Static74.anInterface4_1.method1634(local124)) {
					this.aShortArray11[local118] = local124;
				} else {
					this.aShortArray11[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt272 > 0 && arg0.aByteArray10 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt272];
			for (@Pc(164) int local164 = 0; local164 < this.anInt549; local164++) {
				if (arg0.aByteArray10[local164] != -1) {
					local162[arg0.aByteArray10[local164] & 0xFF]++;
				}
			}
			this.anInt550 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt272; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray6[local193] == 0) {
					this.anInt550++;
				}
			}
			this.anIntArray54 = new int[this.anInt550];
			this.anIntArray57 = new int[this.anInt550];
			this.anIntArray55 = new int[this.anInt550];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt272; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray6[local233] == 0) {
					this.anIntArray54[local231] = arg0.aShortArray2[local233] & 0xFFFF;
					this.anIntArray57[local231] = arg0.aShortArray8[local233] & 0xFFFF;
					this.anIntArray55[local231] = arg0.aShortArray3[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray17 = new byte[this.anInt549];
			for (local295 = 0; local295 < this.anInt549; local295++) {
				if (arg0.aByteArray10[local295] == -1) {
					this.aByteArray17[local295] = -1;
				} else {
					this.aByteArray17[local295] = (byte) local162[arg0.aByteArray10[local295] & 0xFF];
					if (this.aByteArray17[local295] == -1 && this.aShortArray11 != null) {
						this.aShortArray11[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt549; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray9 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray9[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray2 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray2[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray11 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray11[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class106 local417;
			@Pc(578) Class36 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray4[local118] & 0xFFFF;
					if (arg0.aClass106Array1 == null || arg0.aClass106Array1[this.anIntArray52[local118]] == null) {
						local417 = arg0.aClass106Array2[this.anIntArray52[local118]];
					} else {
						local417 = arg0.aClass106Array1[this.anIntArray52[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt4170 + arg4 * local417.anInt4173 + arg5 * local417.anInt4171) / (local93 * local417.anInt4169);
					this.anIntArray51[local118] = Static28.method554(local398, local295);
					if (arg0.aClass106Array1 == null || arg0.aClass106Array1[this.anIntArray48[local118]] == null) {
						local417 = arg0.aClass106Array2[this.anIntArray48[local118]];
					} else {
						local417 = arg0.aClass106Array1[this.anIntArray48[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt4170 + arg4 * local417.anInt4173 + arg5 * local417.anInt4171) / (local93 * local417.anInt4169);
					this.anIntArray59[local118] = Static28.method554(local398, local295);
					if (arg0.aClass106Array1 == null || arg0.aClass106Array1[this.anIntArray56[local118]] == null) {
						local417 = arg0.aClass106Array2[this.anIntArray56[local118]];
					} else {
						local417 = arg0.aClass106Array1[this.anIntArray56[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt4170 + arg4 * local417.anInt4173 + arg5 * local417.anInt4171) / (local93 * local417.anInt4169);
					this.anIntArray53[local118] = Static28.method554(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass36Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt1427 + arg4 * local578.anInt1426 + arg5 * local578.anInt1430) / (local93 + local93 / 2);
					this.anIntArray51[local118] = Static28.method554(arg0.aShortArray4[local118] & 0xFFFF, local295);
					this.anIntArray53[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray51[local118] = 128;
					this.anIntArray53[local118] = -1;
				} else {
					this.anIntArray53[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass106Array1 == null || arg0.aClass106Array1[this.anIntArray52[local118]] == null) {
					local417 = arg0.aClass106Array2[this.anIntArray52[local118]];
				} else {
					local417 = arg0.aClass106Array1[this.anIntArray52[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt4170 + arg4 * local417.anInt4173 + arg5 * local417.anInt4171) / (local93 * local417.anInt4169);
				this.anIntArray51[local118] = Static28.method562(local295);
				if (arg0.aClass106Array1 == null || arg0.aClass106Array1[this.anIntArray48[local118]] == null) {
					local417 = arg0.aClass106Array2[this.anIntArray48[local118]];
				} else {
					local417 = arg0.aClass106Array1[this.anIntArray48[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt4170 + arg4 * local417.anInt4173 + arg5 * local417.anInt4171) / (local93 * local417.anInt4169);
				this.anIntArray59[local118] = Static28.method562(local295);
				if (arg0.aClass106Array1 == null || arg0.aClass106Array1[this.anIntArray56[local118]] == null) {
					local417 = arg0.aClass106Array2[this.anIntArray56[local118]];
				} else {
					local417 = arg0.aClass106Array1[this.anIntArray56[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt4170 + arg4 * local417.anInt4173 + arg5 * local417.anInt4171) / (local93 * local417.anInt4169);
				this.anIntArray53[local118] = Static28.method562(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass36Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt1427 + arg4 * local578.anInt1426 + arg5 * local578.anInt1430) / (local93 + local93 / 2);
				this.anIntArray51[local118] = Static28.method562(local295);
				this.anIntArray53[local118] = -1;
			} else {
				this.anIntArray53[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([Lclient!ce;I)V")
	private Class5_Sub3_Sub1(@OriginalArg(0) Class5_Sub3_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt551 = 0;
		this.anInt549 = 0;
		this.anInt550 = 0;
		this.aByte5 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class5_Sub3_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt551 += local43.anInt551;
				this.anInt549 += local43.anInt549;
				this.anInt550 += local43.anInt550;
				if (local43.aByteArray19 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local43.aByte5;
					}
					if (this.aByte5 != local43.aByte5) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray18 != null;
				local22 |= local43.aShortArray11 != null;
				local24 |= local43.aByteArray17 != null;
			}
		}
		this.anIntArray58 = new int[this.anInt551];
		this.anIntArray50 = new int[this.anInt551];
		this.anIntArray49 = new int[this.anInt551];
		this.anIntArray52 = new int[this.anInt549];
		this.anIntArray48 = new int[this.anInt549];
		this.anIntArray56 = new int[this.anInt549];
		this.anIntArray51 = new int[this.anInt549];
		this.anIntArray59 = new int[this.anInt549];
		this.anIntArray53 = new int[this.anInt549];
		if (local18) {
			this.aByteArray19 = new byte[this.anInt549];
		}
		if (local20) {
			this.aByteArray18 = new byte[this.anInt549];
		}
		if (local22) {
			this.aShortArray11 = new short[this.anInt549];
		}
		if (local24) {
			this.aByteArray17 = new byte[this.anInt549];
		}
		if (this.anInt550 > 0) {
			this.anIntArray54 = new int[this.anInt550];
			this.anIntArray57 = new int[this.anInt550];
			this.anIntArray55 = new int[this.anInt550];
		}
		this.anInt551 = 0;
		this.anInt549 = 0;
		this.anInt550 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class5_Sub3_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt549; local229++) {
					this.anIntArray52[this.anInt549] = local225.anIntArray52[local229] + this.anInt551;
					this.anIntArray48[this.anInt549] = local225.anIntArray48[local229] + this.anInt551;
					this.anIntArray56[this.anInt549] = local225.anIntArray56[local229] + this.anInt551;
					this.anIntArray51[this.anInt549] = local225.anIntArray51[local229];
					this.anIntArray59[this.anInt549] = local225.anIntArray59[local229];
					this.anIntArray53[this.anInt549] = local225.anIntArray53[local229];
					if (local18) {
						if (local225.aByteArray19 == null) {
							this.aByteArray19[this.anInt549] = local225.aByte5;
						} else {
							this.aByteArray19[this.anInt549] = local225.aByteArray19[local229];
						}
					}
					if (local20 && local225.aByteArray18 != null) {
						this.aByteArray18[this.anInt549] = local225.aByteArray18[local229];
					}
					if (local22) {
						if (local225.aShortArray11 == null) {
							this.aShortArray11[this.anInt549] = -1;
						} else {
							this.aShortArray11[this.anInt549] = local225.aShortArray11[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray17 == null || local225.aByteArray17[local229] == -1) {
							this.aByteArray17[this.anInt549] = -1;
						} else {
							this.aByteArray17[this.anInt549] = (byte) (local225.aByteArray17[local229] + this.anInt550);
						}
					}
					this.anInt549++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt550; local394++) {
					this.anIntArray54[this.anInt550] = local225.anIntArray54[local394] + this.anInt551;
					this.anIntArray57[this.anInt550] = local225.anIntArray57[local394] + this.anInt551;
					this.anIntArray55[this.anInt550] = local225.anIntArray55[local394] + this.anInt551;
					this.anInt550++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt551; local444++) {
					this.anIntArray58[this.anInt551] = local225.anIntArray58[local444];
					this.anIntArray50[this.anInt551] = local225.anIntArray50[local444];
					this.anIntArray49[this.anInt551] = local225.anIntArray49[local444];
					this.anInt551++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "()I")
	@Override
	public int method536() {
		if (!this.aBoolean46) {
			this.method556();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
	private void method549(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static74.anInt1682;
		@Pc(3) int local3 = Static74.anInt1680;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray52[arg0];
		@Pc(15) int local15 = this.anIntArray48[arg0];
		@Pc(20) int local20 = this.anIntArray56[arg0];
		@Pc(24) int local24 = Static28.anIntArray62[local10];
		@Pc(28) int local28 = Static28.anIntArray62[local15];
		@Pc(32) int local32 = Static28.anIntArray62[local20];
		if (this.aByteArray18 == null) {
			Static74.anInt1681 = 0;
		} else {
			Static74.anInt1681 = this.aByteArray18[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static28.anIntArray65[0] = Static28.anIntArray72[local10];
			Static28.anIntArray63[0] = Static28.anIntArray70[local10];
			local5++;
			Static28.anIntArray60[0] = this.anIntArray51[arg0];
		} else {
			local73 = Static28.anIntArray61[local10];
			local77 = Static28.anIntArray64[local10];
			local82 = this.anIntArray51[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class45.anIntArray155[local32 - local24];
				Static28.anIntArray65[0] = local1 + (local73 + ((Static28.anIntArray61[local20] - local73) * local95 >> 16) << 9) / 50;
				Static28.anIntArray63[0] = local3 + (local77 + ((Static28.anIntArray64[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static28.anIntArray60[0] = local82 + ((this.anIntArray53[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class45.anIntArray155[local28 - local24];
				Static28.anIntArray65[local5] = local1 + (local73 + ((Static28.anIntArray61[local15] - local73) * local95 >> 16) << 9) / 50;
				Static28.anIntArray63[local5] = local3 + (local77 + ((Static28.anIntArray64[local15] - local77) * local95 >> 16) << 9) / 50;
				Static28.anIntArray60[local5++] = local82 + ((this.anIntArray59[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static28.anIntArray65[local5] = Static28.anIntArray72[local15];
			Static28.anIntArray63[local5] = Static28.anIntArray70[local15];
			Static28.anIntArray60[local5++] = this.anIntArray59[arg0];
		} else {
			local73 = Static28.anIntArray61[local15];
			local77 = Static28.anIntArray64[local15];
			local82 = this.anIntArray59[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class45.anIntArray155[local24 - local28];
				Static28.anIntArray65[local5] = local1 + (local73 + ((Static28.anIntArray61[local10] - local73) * local95 >> 16) << 9) / 50;
				Static28.anIntArray63[local5] = local3 + (local77 + ((Static28.anIntArray64[local10] - local77) * local95 >> 16) << 9) / 50;
				Static28.anIntArray60[local5++] = local82 + ((this.anIntArray51[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class45.anIntArray155[local32 - local28];
				Static28.anIntArray65[local5] = local1 + (local73 + ((Static28.anIntArray61[local20] - local73) * local95 >> 16) << 9) / 50;
				Static28.anIntArray63[local5] = local3 + (local77 + ((Static28.anIntArray64[local20] - local77) * local95 >> 16) << 9) / 50;
				Static28.anIntArray60[local5++] = local82 + ((this.anIntArray53[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static28.anIntArray65[local5] = Static28.anIntArray72[local20];
			Static28.anIntArray63[local5] = Static28.anIntArray70[local20];
			Static28.anIntArray60[local5++] = this.anIntArray53[arg0];
		} else {
			local73 = Static28.anIntArray61[local20];
			local77 = Static28.anIntArray64[local20];
			local82 = this.anIntArray53[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class45.anIntArray155[local28 - local32];
				Static28.anIntArray65[local5] = local1 + (local73 + ((Static28.anIntArray61[local15] - local73) * local95 >> 16) << 9) / 50;
				Static28.anIntArray63[local5] = local3 + (local77 + ((Static28.anIntArray64[local15] - local77) * local95 >> 16) << 9) / 50;
				Static28.anIntArray60[local5++] = local82 + ((this.anIntArray59[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class45.anIntArray155[local24 - local32];
				Static28.anIntArray65[local5] = local1 + (local73 + ((Static28.anIntArray61[local10] - local73) * local95 >> 16) << 9) / 50;
				Static28.anIntArray63[local5] = local3 + (local77 + ((Static28.anIntArray64[local10] - local77) * local95 >> 16) << 9) / 50;
				Static28.anIntArray60[local5++] = local82 + ((this.anIntArray51[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static28.anIntArray65[0];
		local77 = Static28.anIntArray65[1];
		local82 = Static28.anIntArray65[2];
		local95 = Static28.anIntArray63[0];
		@Pc(590) int local590 = Static28.anIntArray63[1];
		@Pc(594) int local594 = Static28.anIntArray63[2];
		Static74.aBoolean154 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static74.anInt1684 || local77 > Static74.anInt1684 || local82 > Static74.anInt1684) {
				Static74.aBoolean154 = true;
			}
			if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
				if (this.aByteArray17 == null || this.aByteArray17[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray17[arg0] & 0xFF;
					local683 = this.anIntArray54[local678];
					local688 = this.anIntArray57[local678];
					local693 = this.anIntArray55[local678];
				}
				if (this.anIntArray53[arg0] == -1) {
					Static74.method1330(local95, local590, local594, local73, local77, local82, this.anIntArray51[arg0], this.anIntArray51[arg0], this.anIntArray51[arg0], Static28.anIntArray61[local683], Static28.anIntArray61[local688], Static28.anIntArray61[local693], Static28.anIntArray64[local683], Static28.anIntArray64[local688], Static28.anIntArray64[local693], Static28.anIntArray62[local683], Static28.anIntArray62[local688], Static28.anIntArray62[local693], this.aShortArray11[arg0]);
				} else {
					Static74.method1330(local95, local590, local594, local73, local77, local82, Static28.anIntArray60[0], Static28.anIntArray60[1], Static28.anIntArray60[2], Static28.anIntArray61[local683], Static28.anIntArray61[local688], Static28.anIntArray61[local693], Static28.anIntArray64[local683], Static28.anIntArray64[local688], Static28.anIntArray64[local693], Static28.anIntArray62[local683], Static28.anIntArray62[local688], Static28.anIntArray62[local693], this.aShortArray11[arg0]);
				}
			} else if (this.anIntArray53[arg0] == -1) {
				Static74.method1317(local95, local590, local594, local73, local77, local82, Static74.anIntArray158[this.anIntArray51[arg0]]);
			} else {
				Static74.method1323(local95, local590, local594, local73, local77, local82, Static28.anIntArray60[0], Static28.anIntArray60[1], Static28.anIntArray60[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static74.anInt1684 || local77 > Static74.anInt1684 || local82 > Static74.anInt1684 || Static28.anIntArray65[3] < 0 || Static28.anIntArray65[3] > Static74.anInt1684) {
			Static74.aBoolean154 = true;
		}
		if (this.aShortArray11 == null || this.aShortArray11[arg0] == -1) {
			if (this.anIntArray53[arg0] == -1) {
				local683 = Static74.anIntArray158[this.anIntArray51[arg0]];
				Static74.method1317(local95, local590, local594, local73, local77, local82, local683);
				Static74.method1317(local95, local594, Static28.anIntArray63[3], local73, local82, Static28.anIntArray65[3], local683);
				return;
			}
			Static74.method1323(local95, local590, local594, local73, local77, local82, Static28.anIntArray60[0], Static28.anIntArray60[1], Static28.anIntArray60[2]);
			Static74.method1323(local95, local594, Static28.anIntArray63[3], local73, local82, Static28.anIntArray65[3], Static28.anIntArray60[0], Static28.anIntArray60[2], Static28.anIntArray60[3]);
			return;
		}
		if (this.aByteArray17 == null || this.aByteArray17[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray17[arg0] & 0xFF;
			local683 = this.anIntArray54[local678];
			local688 = this.anIntArray57[local678];
			local693 = this.anIntArray55[local678];
		}
		@Pc(956) short local956 = this.aShortArray11[arg0];
		if (this.anIntArray53[arg0] == -1) {
			Static74.method1330(local95, local590, local594, local73, local77, local82, this.anIntArray51[arg0], this.anIntArray51[arg0], this.anIntArray51[arg0], Static28.anIntArray61[local683], Static28.anIntArray61[local688], Static28.anIntArray61[local693], Static28.anIntArray64[local683], Static28.anIntArray64[local688], Static28.anIntArray64[local693], Static28.anIntArray62[local683], Static28.anIntArray62[local688], Static28.anIntArray62[local693], local956);
			Static74.method1330(local95, local594, Static28.anIntArray63[3], local73, local82, Static28.anIntArray65[3], this.anIntArray51[arg0], this.anIntArray51[arg0], this.anIntArray51[arg0], Static28.anIntArray61[local683], Static28.anIntArray61[local688], Static28.anIntArray61[local693], Static28.anIntArray64[local683], Static28.anIntArray64[local688], Static28.anIntArray64[local693], Static28.anIntArray62[local683], Static28.anIntArray62[local688], Static28.anIntArray62[local693], local956);
			return;
		}
		Static74.method1330(local95, local590, local594, local73, local77, local82, Static28.anIntArray60[0], Static28.anIntArray60[1], Static28.anIntArray60[2], Static28.anIntArray61[local683], Static28.anIntArray61[local688], Static28.anIntArray61[local693], Static28.anIntArray64[local683], Static28.anIntArray64[local688], Static28.anIntArray64[local693], Static28.anIntArray62[local683], Static28.anIntArray62[local688], Static28.anIntArray62[local693], local956);
		Static74.method1330(local95, local594, Static28.anIntArray63[3], local73, local82, Static28.anIntArray65[3], Static28.anIntArray60[0], Static28.anIntArray60[2], Static28.anIntArray60[3], Static28.anIntArray61[local683], Static28.anIntArray61[local688], Static28.anIntArray61[local693], Static28.anIntArray64[local683], Static28.anIntArray64[local688], Static28.anIntArray64[local693], Static28.anIntArray62[local683], Static28.anIntArray62[local688], Static28.anIntArray62[local693], local956);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!cc;ILclient!cc;I[IZ)V")
	@Override
	public void method533(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method539(arg0, arg1, arg5);
			return;
		}
		@Pc(19) Class124 local19 = arg0.aClass124Array1[arg1];
		@Pc(24) Class124 local24 = arg2.aClass124Array1[arg3];
		@Pc(27) Class1_Sub23 local27 = local19.aClass1_Sub23_1;
		Static28.anInt554 = 0;
		Static28.anInt552 = 0;
		Static28.anInt553 = 0;
		@Pc(35) byte local35 = 0;
		@Pc(38) int local38 = local35 + 1;
		@Pc(40) int local40 = arg4[0];
		for (@Pc(42) int local42 = 0; local42 < local19.anInt4897; local42++) {
			@Pc(48) short local48 = local19.aShortArray60[local42];
			while (local48 > local40) {
				local40 = arg4[local38++];
			}
			if (local48 != local40 || local27.anIntArray310[local48] == 0) {
				if (local19.aShortArray54[local42] != -1) {
					this.method552(0, local27.anIntArrayArray34[local19.aShortArray54[local42]], 0, 0, 0);
				}
				this.method552(local27.anIntArray310[local48], local27.anIntArrayArray34[local48], local19.aShortArray61[local42], local19.aShortArray58[local42], local19.aShortArray53[local42]);
			}
		}
		Static28.anInt554 = 0;
		Static28.anInt552 = 0;
		Static28.anInt553 = 0;
		local35 = 0;
		local38 = local35 + 1;
		local40 = arg4[0];
		for (@Pc(126) int local126 = 0; local126 < local24.anInt4897; local126++) {
			@Pc(132) short local132 = local24.aShortArray60[local126];
			while (local132 > local40) {
				local40 = arg4[local38++];
			}
			if (local132 == local40 || local27.anIntArray310[local132] == 0) {
				if (local24.aShortArray54[local126] != -1) {
					this.method552(0, local27.anIntArrayArray34[local24.aShortArray54[local126]], 0, 0, 0);
				}
				this.method552(local27.anIntArray310[local132], local27.anIntArrayArray34[local132], local24.aShortArray61[local126], local24.aShortArray58[local126], local24.aShortArray53[local126]);
			}
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean46) {
				this.method556();
			}
			@Pc(6) int local6 = Static74.anInt1682;
			@Pc(8) int local8 = Static74.anInt1680;
			@Pc(12) int local12 = Class45.anIntArray159[0];
			@Pc(16) int local16 = Class45.anIntArray156[0];
			@Pc(20) int local20 = Class45.anIntArray159[arg0];
			@Pc(24) int local24 = Class45.anIntArray156[arg0];
			@Pc(28) int local28 = Class45.anIntArray159[arg1];
			@Pc(32) int local32 = Class45.anIntArray156[arg1];
			@Pc(36) int local36 = Class45.anIntArray159[arg2];
			@Pc(40) int local40 = Class45.anIntArray156[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt551; local52++) {
				@Pc(58) int local58 = this.anIntArray58[local52];
				@Pc(63) int local63 = this.anIntArray50[local52];
				@Pc(68) int local68 = this.anIntArray49[local52];
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
				Static28.anIntArray66[local52] = local68 - local50;
				Static28.anIntArray72[local52] = local6 + (local58 << 9) / local68;
				Static28.anIntArray70[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt550 > 0) {
					Static28.anIntArray61[local52] = local58;
					Static28.anIntArray64[local52] = local80;
					Static28.anIntArray62[local52] = local68;
				}
			}
			this.method550(false, false, 0L, this.aShort17, this.aShort17 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZJII)V")
	private void method550(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static28.anIntArray73[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt549; local16++) {
			if (this.anIntArray53[local16] != -2) {
				local28 = this.anIntArray52[local16];
				local33 = this.anIntArray48[local16];
				local38 = this.anIntArray56[local16];
				local42 = Static28.anIntArray72[local28];
				local46 = Static28.anIntArray72[local33];
				local50 = Static28.anIntArray72[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static28.anIntArray61[local28];
					local69 = Static28.anIntArray61[local33];
					@Pc(73) int local73 = Static28.anIntArray61[local38];
					@Pc(77) int local77 = Static28.anIntArray64[local28];
					local81 = Static28.anIntArray64[local33];
					local85 = Static28.anIntArray64[local38];
					@Pc(89) int local89 = Static28.anIntArray62[local28];
					local93 = Static28.anIntArray62[local33];
					@Pc(97) int local97 = Static28.anIntArray62[local38];
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
						Static28.aBooleanArray4[local16] = true;
						@Pc(177) int local177 = (Static28.anIntArray66[local28] + Static28.anIntArray66[local33] + Static28.anIntArray66[local38]) / 3 + arg3;
						Static28.anIntArrayArray9[local177][Static28.anIntArray73[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method555(Static208.anInt4453 + Static74.anInt1682, Static1.anInt69 + Static74.anInt1680, Static28.anIntArray70[local28], Static28.anIntArray70[local33], Static28.anIntArray70[local38], local42, local46, local50)) {
						Static83.aLongArray4[Static19.anInt394++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static28.anIntArray70[local38] - Static28.anIntArray70[local33]) - (Static28.anIntArray70[local28] - Static28.anIntArray70[local33]) * (local50 - local46) > 0) {
						Static28.aBooleanArray4[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static74.anInt1684 && local46 <= Static74.anInt1684 && local50 <= Static74.anInt1684) {
							Static28.aBooleanArray3[local16] = false;
						} else {
							Static28.aBooleanArray3[local16] = true;
						}
						local65 = (Static28.anIntArray66[local28] + Static28.anIntArray66[local33] + Static28.anIntArray66[local38]) / 3 + arg3;
						Static28.anIntArrayArray9[local65][Static28.anIntArray73[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray19 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static28.anIntArray73[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static28.anIntArrayArray9[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method560(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static28.anIntArray69[local28] = 0;
			Static28.anIntArray71[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static28.anIntArray73[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static28.anIntArrayArray9[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray19[local50];
					local69 = Static28.anIntArray69[local386]++;
					Static28.anIntArrayArray10[local386][local69] = local50;
					if (local386 < 10) {
						Static28.anIntArray71[local386] += local33;
					} else if (local386 == 10) {
						Static28.anIntArray68[local69] = local33;
					} else {
						Static28.anIntArray67[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static28.anIntArray69[1] > 0 || Static28.anIntArray69[2] > 0) {
			local38 = (Static28.anIntArray71[1] + Static28.anIntArray71[2]) / (Static28.anIntArray69[1] + Static28.anIntArray69[2]);
		}
		local42 = 0;
		if (Static28.anIntArray69[3] > 0 || Static28.anIntArray69[4] > 0) {
			local42 = (Static28.anIntArray71[3] + Static28.anIntArray71[4]) / (Static28.anIntArray69[3] + Static28.anIntArray69[4]);
		}
		local46 = 0;
		if (Static28.anIntArray69[6] > 0 || Static28.anIntArray69[8] > 0) {
			local46 = (Static28.anIntArray71[6] + Static28.anIntArray71[8]) / (Static28.anIntArray69[6] + Static28.anIntArray69[8]);
		}
		local65 = 0;
		local69 = Static28.anIntArray69[10];
		@Pc(519) int[] local519 = Static28.anIntArrayArray10[10];
		@Pc(521) int[] local521 = Static28.anIntArray68;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static28.anIntArray69[11];
			local519 = Static28.anIntArrayArray10[11];
			local521 = Static28.anIntArray67;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method560(local519[local65++]);
				if (local65 == local69 && local519 != Static28.anIntArrayArray10[11]) {
					local65 = 0;
					local69 = Static28.anIntArray69[11];
					local519 = Static28.anIntArrayArray10[11];
					local521 = Static28.anIntArray67;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method560(local519[local65++]);
				if (local65 == local69 && local519 != Static28.anIntArrayArray10[11]) {
					local65 = 0;
					local69 = Static28.anIntArray69[11];
					local519 = Static28.anIntArrayArray10[11];
					local521 = Static28.anIntArray67;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method560(local519[local65++]);
				if (local65 == local69 && local519 != Static28.anIntArrayArray10[11]) {
					local65 = 0;
					local69 = Static28.anIntArray69[11];
					local519 = Static28.anIntArrayArray10[11];
					local521 = Static28.anIntArray67;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static28.anIntArray69[local81];
			@Pc(684) int[] local684 = Static28.anIntArrayArray10[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method560(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method560(local519[local65++]);
			if (local65 == local69 && local519 != Static28.anIntArrayArray10[11]) {
				local65 = 0;
				local519 = Static28.anIntArrayArray10[11];
				local69 = Static28.anIntArray69[11];
				local521 = Static28.anIntArray67;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	@Override
	public void method528(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class45.anIntArray159[arg0];
		@Pc(7) int local7 = Class45.anIntArray156[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt551; local9++) {
			@Pc(26) int local26 = this.anIntArray50[local9] * local3 + this.anIntArray58[local9] * local7 >> 16;
			this.anIntArray50[local9] = this.anIntArray50[local9] * local7 - this.anIntArray58[local9] * local3 >> 16;
			this.anIntArray58[local9] = local26;
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	@Override
	public void method535(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class45.anIntArray159[arg0];
		@Pc(7) int local7 = Class45.anIntArray156[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt551; local9++) {
			@Pc(26) int local26 = this.anIntArray49[local9] * local3 + this.anIntArray58[local9] * local7 >> 16;
			this.anIntArray49[local9] = this.anIntArray49[local9] * local7 - this.anIntArray58[local9] * local3 >> 16;
			this.anIntArray58[local9] = local26;
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLclient!ce;[B)Lclient!nb;")
	private Class5_Sub3 method551(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub3_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt551 = this.anInt551;
		arg1.anInt549 = this.anInt549;
		arg1.anInt550 = this.anInt550;
		if (arg1.anIntArray58 == null || arg1.anIntArray58.length < this.anInt551) {
			arg1.anIntArray58 = new int[this.anInt551 + 100];
			arg1.anIntArray50 = new int[this.anInt551 + 100];
			arg1.anIntArray49 = new int[this.anInt551 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt551; local43++) {
			arg1.anIntArray58[local43] = this.anIntArray58[local43];
			arg1.anIntArray50[local43] = this.anIntArray50[local43];
			arg1.anIntArray49[local43] = this.anIntArray49[local43];
		}
		if (arg0) {
			arg1.aByteArray18 = this.aByteArray18;
		} else {
			arg1.aByteArray18 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray18 == null) {
				for (local88 = 0; local88 < this.anInt549; local88++) {
					arg1.aByteArray18[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt549; local88++) {
					arg1.aByteArray18[local88] = this.aByteArray18[local88];
				}
			}
		}
		arg1.anIntArray52 = this.anIntArray52;
		arg1.anIntArray48 = this.anIntArray48;
		arg1.anIntArray56 = this.anIntArray56;
		arg1.anIntArray51 = this.anIntArray51;
		arg1.anIntArray59 = this.anIntArray59;
		arg1.anIntArray53 = this.anIntArray53;
		arg1.aByteArray19 = this.aByteArray19;
		arg1.aByteArray17 = this.aByteArray17;
		arg1.aShortArray11 = this.aShortArray11;
		arg1.aByte5 = this.aByte5;
		arg1.anIntArray54 = this.anIntArray54;
		arg1.anIntArray57 = this.anIntArray57;
		arg1.anIntArray55 = this.anIntArray55;
		arg1.anIntArrayArray7 = this.anIntArrayArray7;
		arg1.anIntArrayArray8 = this.anIntArrayArray8;
		arg1.aBoolean45 = super.aBoolean45;
		arg1.aBoolean46 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "()I")
	@Override
	public int method545() {
		if (!this.aBoolean46) {
			this.method556();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "()V")
	@Override
	public void method547() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt551; local1++) {
			@Pc(7) int local7 = this.anIntArray58[local1];
			this.anIntArray58[local1] = this.anIntArray49[local1];
			this.anIntArray49[local1] = -local7;
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean46) {
			this.method556();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort10 * arg2 + this.aShort12 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort10 * arg2 + this.aShort16 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort10 << 9;
		if (local78 / local38 <= Static146.anInt3164) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort10 << 9;
		if (local91 / local38 >= Static232.anInt4367) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort10 * arg1 + this.aShort12 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static177.anInt3841) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort10 * arg1 + this.aShort16 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static75.anInt1690) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt550 > 0;
		@Pc(172) int local172 = Static74.anInt1682;
		@Pc(174) int local174 = Static74.anInt1680;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class45.anIntArray159[arg0];
			local178 = Class45.anIntArray156[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static140.aBoolean62 && local57 > 0) {
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
			if (Static208.anInt4453 >= local204 && Static208.anInt4453 <= local208 && Static1.anInt69 >= local223 && Static1.anInt69 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort15, this.aShort11, this.aShort15, this.aShort11, this.aShort15, this.aShort11, this.aShort15, this.aShort11 };
				@Pc(342) int[] local342 = new int[] { this.aShort13, this.aShort13, this.aShort14, this.aShort14, this.aShort13, this.aShort13, this.aShort14, this.aShort14 };
				@Pc(385) int[] local385 = new int[] { this.aShort16, this.aShort16, this.aShort16, this.aShort16, this.aShort12, this.aShort12, this.aShort12, this.aShort12 };
				for (@Pc(387) int local387 = 0; local387 < 8; local387++) {
					@Pc(392) int local392 = local299[local387];
					@Pc(396) int local396 = local385[local387];
					@Pc(400) int local400 = local342[local387];
					@Pc(412) int local412;
					if (arg0 != 0) {
						local412 = local400 * local176 + local392 * local178 >> 16;
						local400 = local400 * local178 - local392 * local176 >> 16;
						local392 = local412;
					}
					local392 += arg5;
					local396 += arg6;
					local400 += arg7;
					local412 = local400 * arg3 + local392 * arg4 >> 16;
					local400 = local400 * arg4 - local392 * arg3 >> 16;
					local392 = local412;
					local412 = local396 * arg2 - local400 * arg1 >> 16;
					local400 = local396 * arg1 + local400 * arg2 >> 16;
					if (local400 > 0) {
						@Pc(488) int local488 = (local392 << 9) / local400;
						@Pc(494) int local494 = (local412 << 9) / local400;
						if (local488 < local204) {
							local204 = local488;
						}
						if (local488 > local208) {
							local208 = local488;
						}
						if (local494 < local223) {
							local223 = local494;
						}
						if (local494 > local227) {
							local227 = local494;
						}
					}
				}
				if (Static208.anInt4453 >= local204 && Static208.anInt4453 <= local208 && Static1.anInt69 >= local223 && Static1.anInt69 <= local227) {
					if (super.aBoolean45) {
						Static83.aLongArray4[Static19.anInt394++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt551; local204++) {
			local223 = this.anIntArray58[local204];
			local208 = this.anIntArray50[local204];
			local227 = this.anIntArray49[local204];
			@Pc(574) int local574;
			if (arg0 != 0) {
				local574 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local574;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local574 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local574;
			local574 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static28.anIntArray66[local204] = local227 - local24;
			if (local227 >= 50) {
				Static28.anIntArray72[local204] = local172 + (local223 << 9) / local227;
				Static28.anIntArray70[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static28.anIntArray72[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static28.anIntArray61[local204] = local223;
				Static28.anIntArray64[local204] = local574;
				Static28.anIntArray62[local204] = local227;
			}
		}
		try {
			this.method550(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)V")
	@Override
	public void method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt551; local1++) {
			this.anIntArray58[local1] = this.anIntArray58[local1] * arg0 / 128;
			this.anIntArray50[local1] = this.anIntArray50[local1] * arg1 / 128;
			this.anIntArray49[local1] = this.anIntArray49[local1] * arg2 / 128;
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[IIII)V")
	private void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static28.anInt554 = 0;
			Static28.anInt552 = 0;
			Static28.anInt553 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray7.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray7[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static28.anInt554 += this.anIntArray58[local36];
						Static28.anInt552 += this.anIntArray50[local36];
						Static28.anInt553 += this.anIntArray49[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static28.anInt554 = Static28.anInt554 / local6 + arg2;
				Static28.anInt552 = Static28.anInt552 / local6 + arg3;
				Static28.anInt553 = Static28.anInt553 / local6 + arg4;
			} else {
				Static28.anInt554 = arg2;
				Static28.anInt552 = arg3;
				Static28.anInt553 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray7.length) {
					local115 = this.anIntArrayArray7[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray58[local31] += arg2;
						this.anIntArray50[local31] += arg3;
						this.anIntArray49[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray7.length) {
					local115 = this.anIntArrayArray7[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray58[local31] -= Static28.anInt554;
						this.anIntArray50[local31] -= Static28.anInt552;
						this.anIntArray49[local31] -= Static28.anInt553;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class45.anIntArray159[arg4];
							local217 = Class45.anIntArray156[arg4];
							local235 = this.anIntArray50[local31] * local36 + this.anIntArray58[local31] * local217 + 32767 >> 16;
							this.anIntArray50[local31] = this.anIntArray50[local31] * local217 + 32767 - this.anIntArray58[local31] * local36 >> 16;
							this.anIntArray58[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class45.anIntArray159[arg2];
							local217 = Class45.anIntArray156[arg2];
							local235 = this.anIntArray50[local31] * local217 + 32767 - this.anIntArray49[local31] * local36 >> 16;
							this.anIntArray49[local31] = this.anIntArray50[local31] * local36 + this.anIntArray49[local31] * local217 + 32767 >> 16;
							this.anIntArray50[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class45.anIntArray159[arg3];
							local217 = Class45.anIntArray156[arg3];
							local235 = this.anIntArray49[local31] * local36 + this.anIntArray58[local31] * local217 + 32767 >> 16;
							this.anIntArray49[local31] = this.anIntArray49[local31] * local217 + 32767 - this.anIntArray58[local31] * local36 >> 16;
							this.anIntArray58[local31] = local235;
						}
						this.anIntArray58[local31] += Static28.anInt554;
						this.anIntArray50[local31] += Static28.anInt552;
						this.anIntArray49[local31] += Static28.anInt553;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray7.length) {
					local115 = this.anIntArrayArray7[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray58[local31] -= Static28.anInt554;
						this.anIntArray50[local31] -= Static28.anInt552;
						this.anIntArray49[local31] -= Static28.anInt553;
						this.anIntArray58[local31] = this.anIntArray58[local31] * arg2 / 128;
						this.anIntArray50[local31] = this.anIntArray50[local31] * arg3 / 128;
						this.anIntArray49[local31] = this.anIntArray49[local31] * arg4 / 128;
						this.anIntArray58[local31] += Static28.anInt554;
						this.anIntArray50[local31] += Static28.anInt552;
						this.anIntArray49[local31] += Static28.anInt553;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray8 != null && this.aByteArray18 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray8.length) {
					local115 = this.anIntArrayArray8[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray18[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray18[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "()I")
	@Override
	public int method548() {
		if (!this.aBoolean46) {
			this.method556();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(ZZ)Lclient!nb;")
	@Override
	public Class5_Sub3 method546(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static28.aByteArray21.length < this.anInt549) {
			Static28.aByteArray21 = new byte[this.anInt549 + 100];
		}
		return this.method551(arg0, Static28.aClass5_Sub3_Sub1_2, Static28.aByteArray21);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!cc;I)V")
	@Override
	public void method544(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray7 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class124 local12 = arg0.aClass124Array1[arg1];
		@Pc(15) Class1_Sub23 local15 = local12.aClass1_Sub23_1;
		Static28.anInt554 = 0;
		Static28.anInt552 = 0;
		Static28.anInt553 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt4897; local23++) {
			@Pc(29) short local29 = local12.aShortArray60[local23];
			if (local15.aBooleanArray22[local29]) {
				if (local12.aShortArray54[local23] != -1) {
					this.method561(0, 0, 0, 0);
				}
				this.method561(local15.anIntArray310[local29], local12.aShortArray61[local23], local12.aShortArray58[local23], local12.aShortArray53[local23]);
			}
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "()I")
	@Override
	public int method542() {
		if (!this.aBoolean46) {
			this.method556();
		}
		return this.aShort11;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	@Override
	public void method534() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt551; local1++) {
			this.anIntArray58[local1] = -this.anIntArray58[local1];
			this.anIntArray49[local1] = -this.anIntArray49[local1];
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "()I")
	@Override
	public int method537() {
		if (!this.aBoolean46) {
			this.method556();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "()V")
	private void method556() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt551; local17++) {
			@Pc(23) int local23 = this.anIntArray58[local17];
			@Pc(28) int local28 = this.anIntArray50[local17];
			@Pc(33) int local33 = this.anIntArray49[local17];
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
			local71 += local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort15 = (short) local1;
		this.aShort11 = (short) local7;
		this.aShort16 = (short) local3;
		this.aShort12 = (short) local9;
		this.aShort13 = (short) local5;
		this.aShort14 = (short) local11;
		this.aShort10 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort17 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean46 = true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		if (!this.aBoolean46) {
			this.method556();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IIIIIIII)V")
	public void method557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean46) {
				this.method556();
			}
			@Pc(6) int local6 = Static74.anInt1682;
			@Pc(8) int local8 = Static74.anInt1680;
			@Pc(12) int local12 = Class45.anIntArray159[0];
			@Pc(16) int local16 = Class45.anIntArray156[0];
			@Pc(20) int local20 = Class45.anIntArray159[arg0];
			@Pc(24) int local24 = Class45.anIntArray156[arg0];
			@Pc(28) int local28 = Class45.anIntArray159[arg1];
			@Pc(32) int local32 = Class45.anIntArray156[arg1];
			@Pc(36) int local36 = Class45.anIntArray159[arg2];
			@Pc(40) int local40 = Class45.anIntArray156[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt551; local52++) {
				@Pc(58) int local58 = this.anIntArray58[local52];
				@Pc(63) int local63 = this.anIntArray50[local52];
				@Pc(68) int local68 = this.anIntArray49[local52];
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
				Static28.anIntArray66[local52] = local68 - local50;
				Static28.anIntArray72[local52] = local6 + (local58 << 9) / arg6;
				Static28.anIntArray70[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt550 > 0) {
					Static28.anIntArray61[local52] = local58;
					Static28.anIntArray64[local52] = local80;
					Static28.anIntArray62[local52] = local68;
				}
			}
			this.method550(false, false, 0L, this.aShort17, this.aShort17 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!ce;")
	public Class5_Sub3_Sub1 method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean46) {
			this.method556();
		}
		@Pc(9) int local9 = arg4 + this.aShort15;
		@Pc(14) int local14 = arg4 + this.aShort11;
		@Pc(19) int local19 = arg6 + this.aShort13;
		@Pc(24) int local24 = arg6 + this.aShort14;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + 128 >> 7 >= arg2.length || local19 < 0 || local24 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local9 < 0 || local14 + 128 >> 7 >= arg3.length || local19 < 0 || local24 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local9 >>= 0x7;
			local14 = local14 + 127 >> 7;
			local19 >>= 0x7;
			local24 = local24 + 127 >> 7;
			if (arg2[local9][local19] == arg5 && arg2[local14][local19] == arg5 && arg2[local9][local24] == arg5 && arg2[local14][local24] == arg5) {
				return this;
			}
		}
		@Pc(150) Class5_Sub3_Sub1 local150;
		if (arg7) {
			local150 = new Class5_Sub3_Sub1();
			local150.anInt551 = this.anInt551;
			local150.anInt549 = this.anInt549;
			local150.anInt550 = this.anInt550;
			local150.anIntArray52 = this.anIntArray52;
			local150.anIntArray48 = this.anIntArray48;
			local150.anIntArray56 = this.anIntArray56;
			local150.anIntArray51 = this.anIntArray51;
			local150.anIntArray59 = this.anIntArray59;
			local150.anIntArray53 = this.anIntArray53;
			local150.aByteArray19 = this.aByteArray19;
			local150.aByteArray18 = this.aByteArray18;
			local150.aByteArray17 = this.aByteArray17;
			local150.aShortArray11 = this.aShortArray11;
			local150.aByte5 = this.aByte5;
			local150.anIntArray54 = this.anIntArray54;
			local150.anIntArray57 = this.anIntArray57;
			local150.anIntArray55 = this.anIntArray55;
			local150.anIntArrayArray7 = this.anIntArrayArray7;
			local150.anIntArrayArray8 = this.anIntArrayArray8;
			local150.aBoolean45 = super.aBoolean45;
			if (arg0 == 3) {
				local150.anIntArray58 = Static70.method1252(this.anIntArray58);
				local150.anIntArray50 = Static70.method1252(this.anIntArray50);
				local150.anIntArray49 = Static70.method1252(this.anIntArray49);
			} else {
				local150.anIntArray58 = this.anIntArray58;
				local150.anIntArray50 = new int[local150.anInt551];
				local150.anIntArray49 = this.anIntArray49;
			}
		} else {
			local150 = this;
		}
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(288) int local288;
		@Pc(292) int local292;
		@Pc(296) int local296;
		@Pc(300) int local300;
		@Pc(304) int local304;
		@Pc(326) int local326;
		@Pc(352) int local352;
		@Pc(364) int local364;
		if (arg0 == 1) {
			for (local273 = 0; local273 < local150.anInt551; local273++) {
				local281 = this.anIntArray58[local273] + arg4;
				local288 = this.anIntArray49[local273] + arg6;
				local292 = local281 & 0x7F;
				local296 = local288 & 0x7F;
				local300 = local281 >> 7;
				local304 = local288 >> 7;
				local326 = arg2[local300][local304] * (128 - local292) + arg2[local300 + 1][local304] * local292 >> 7;
				local352 = arg2[local300][local304 + 1] * (128 - local292) + arg2[local300 + 1][local304 + 1] * local292 >> 7;
				local364 = local326 * (128 - local296) + local352 * local296 >> 7;
				local150.anIntArray50[local273] = this.anIntArray50[local273] + local364 - arg5;
			}
		} else {
			@Pc(491) int local491;
			if (arg0 == 2) {
				for (local273 = 0; local273 < local150.anInt551; local273++) {
					local281 = (this.anIntArray50[local273] << 16) / this.aShort16;
					if (local281 < arg1) {
						local288 = this.anIntArray58[local273] + arg4;
						local292 = this.anIntArray49[local273] + arg6;
						local296 = local288 & 0x7F;
						local300 = local292 & 0x7F;
						local304 = local288 >> 7;
						local326 = local292 >> 7;
						local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
						local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
						local491 = local352 * (128 - local300) + local364 * local300 >> 7;
						local150.anIntArray50[local273] = this.anIntArray50[local273] + (local491 - arg5) * (arg1 - local281) / arg1;
					} else {
						local150.anIntArray50[local273] = this.anIntArray50[local273];
					}
				}
			} else if (arg0 == 3) {
				local273 = (arg1 & 0xFF) * 4;
				local281 = (arg1 >> 8 & 0xFF) * 4;
				local150.method529(arg2, arg4, arg5, arg6, local273, local281);
			} else if (arg0 == 4) {
				local273 = this.aShort12 - this.aShort16;
				for (local281 = 0; local281 < this.anInt551; local281++) {
					local288 = this.anIntArray58[local281] + arg4;
					local292 = this.anIntArray49[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local150.anIntArray50[local281] = this.anIntArray50[local281] + local491 + local273 - arg5;
				}
			} else if (arg0 == 5) {
				local273 = this.aShort12 - this.aShort16;
				for (local281 = 0; local281 < this.anInt551; local281++) {
					local288 = this.anIntArray58[local281] + arg4;
					local292 = this.anIntArray49[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
					local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					@Pc(834) int local834 = local352 * (128 - local300) + local364 * local300 >> 7;
					@Pc(838) int local838 = local491 - local834;
					local150.anIntArray50[local281] = ((this.anIntArray50[local281] << 8) / local273 * local838 >> 8) - (arg5 - local491);
				}
			}
		}
		local150.aBoolean46 = false;
		return local150;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZ)Lclient!nb;")
	@Override
	public Class5_Sub3 method531(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static28.aByteArray20.length < this.anInt549) {
			Static28.aByteArray20 = new byte[this.anInt549 + 100];
		}
		return this.method551(arg0, Static28.aClass5_Sub3_Sub1_1, Static28.aByteArray20);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!cc;IZ)V")
	@Override
	public void method539(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArrayArray7 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class124 local12 = arg0.aClass124Array1[arg1];
		@Pc(15) Class1_Sub23 local15 = local12.aClass1_Sub23_1;
		Static28.anInt554 = 0;
		Static28.anInt552 = 0;
		Static28.anInt553 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt4897; local23++) {
			@Pc(29) short local29 = local12.aShortArray60[local23];
			if (local12.aShortArray54[local23] != -1) {
				this.method552(0, local15.anIntArrayArray34[local12.aShortArray54[local23]], 0, 0, 0);
			}
			this.method552(local15.anIntArray310[local29], local15.anIntArrayArray34[local29], local12.aShortArray61[local23], local12.aShortArray58[local23], local12.aShortArray53[local23]);
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!nb;)Lclient!nb;")
	public Class5_Sub3 method559(@OriginalArg(0) Class5_Sub3 arg0) {
		return new Class5_Sub3_Sub1(new Class5_Sub3_Sub1[] { this, (Class5_Sub3_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "()V")
	@Override
	public void method541() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt551; local1++) {
			@Pc(7) int local7 = this.anIntArray49[local1];
			this.anIntArray49[local1] = this.anIntArray58[local1];
			this.anIntArray58[local1] = -local7;
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(III)V")
	@Override
	public void method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt551; local1++) {
			this.anIntArray58[local1] += arg0;
			this.anIntArray50[local1] += arg1;
			this.anIntArray49[local1] += arg2;
		}
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
	private void method560(@OriginalArg(0) int arg0) {
		if (Static28.aBooleanArray4[arg0]) {
			this.method549(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray52[arg0];
		@Pc(17) int local17 = this.anIntArray48[arg0];
		@Pc(22) int local22 = this.anIntArray56[arg0];
		Static74.aBoolean154 = Static28.aBooleanArray3[arg0];
		if (this.aByteArray18 == null) {
			Static74.anInt1681 = 0;
		} else {
			Static74.anInt1681 = this.aByteArray18[arg0] & 0xFF;
		}
		if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray17 == null || this.aByteArray17[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray17[arg0] & 0xFF;
				local133 = this.anIntArray54[local128];
				local138 = this.anIntArray57[local128];
				local143 = this.anIntArray55[local128];
			}
			if (this.anIntArray53[arg0] == -1) {
				Static74.method1330(Static28.anIntArray70[local12], Static28.anIntArray70[local17], Static28.anIntArray70[local22], Static28.anIntArray72[local12], Static28.anIntArray72[local17], Static28.anIntArray72[local22], this.anIntArray51[arg0], this.anIntArray51[arg0], this.anIntArray51[arg0], Static28.anIntArray61[local133], Static28.anIntArray61[local138], Static28.anIntArray61[local143], Static28.anIntArray64[local133], Static28.anIntArray64[local138], Static28.anIntArray64[local143], Static28.anIntArray62[local133], Static28.anIntArray62[local138], Static28.anIntArray62[local143], this.aShortArray11[arg0]);
			} else {
				Static74.method1330(Static28.anIntArray70[local12], Static28.anIntArray70[local17], Static28.anIntArray70[local22], Static28.anIntArray72[local12], Static28.anIntArray72[local17], Static28.anIntArray72[local22], this.anIntArray51[arg0], this.anIntArray59[arg0], this.anIntArray53[arg0], Static28.anIntArray61[local133], Static28.anIntArray61[local138], Static28.anIntArray61[local143], Static28.anIntArray64[local133], Static28.anIntArray64[local138], Static28.anIntArray64[local143], Static28.anIntArray62[local133], Static28.anIntArray62[local138], Static28.anIntArray62[local143], this.aShortArray11[arg0]);
			}
		} else if (this.anIntArray53[arg0] == -1) {
			Static74.method1317(Static28.anIntArray70[local12], Static28.anIntArray70[local17], Static28.anIntArray70[local22], Static28.anIntArray72[local12], Static28.anIntArray72[local17], Static28.anIntArray72[local22], Static74.anIntArray158[this.anIntArray51[arg0]]);
		} else {
			Static74.method1323(Static28.anIntArray70[local12], Static28.anIntArray70[local17], Static28.anIntArray70[local22], Static28.anIntArray72[local12], Static28.anIntArray72[local17], Static28.anIntArray72[local22], this.anIntArray51[arg0], this.anIntArray59[arg0], this.anIntArray53[arg0]);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)V")
	private void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static28.anInt554 = 0;
			Static28.anInt552 = 0;
			Static28.anInt553 = 0;
			for (local11 = 0; local11 < this.anInt551; local11++) {
				Static28.anInt554 += this.anIntArray58[local11];
				Static28.anInt552 += this.anIntArray50[local11];
				Static28.anInt553 += this.anIntArray49[local11];
				local3++;
			}
			if (local3 > 0) {
				Static28.anInt554 = Static28.anInt554 / local3 + arg1;
				Static28.anInt552 = Static28.anInt552 / local3 + arg2;
				Static28.anInt553 = Static28.anInt553 / local3 + arg3;
			} else {
				Static28.anInt554 = arg1;
				Static28.anInt552 = arg2;
				Static28.anInt553 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt551; local3++) {
				this.anIntArray58[local3] += arg1;
				this.anIntArray50[local3] += arg2;
				this.anIntArray49[local3] += arg3;
			}
		} else if (arg0 == 2) {
			for (local3 = 0; local3 < this.anInt551; local3++) {
				this.anIntArray58[local3] -= Static28.anInt554;
				this.anIntArray50[local3] -= Static28.anInt552;
				this.anIntArray49[local3] -= Static28.anInt553;
				@Pc(143) int local143;
				@Pc(161) int local161;
				if (arg3 != 0) {
					local11 = Class45.anIntArray159[arg3];
					local143 = Class45.anIntArray156[arg3];
					local161 = this.anIntArray50[local3] * local11 + this.anIntArray58[local3] * local143 + 32767 >> 16;
					this.anIntArray50[local3] = this.anIntArray50[local3] * local143 + 32767 - this.anIntArray58[local3] * local11 >> 16;
					this.anIntArray58[local3] = local161;
				}
				if (arg1 != 0) {
					local11 = Class45.anIntArray159[arg1];
					local143 = Class45.anIntArray156[arg1];
					local161 = this.anIntArray50[local3] * local143 + 32767 - this.anIntArray49[local3] * local11 >> 16;
					this.anIntArray49[local3] = this.anIntArray50[local3] * local11 + this.anIntArray49[local3] * local143 + 32767 >> 16;
					this.anIntArray50[local3] = local161;
				}
				if (arg2 != 0) {
					local11 = Class45.anIntArray159[arg2];
					local143 = Class45.anIntArray156[arg2];
					local161 = this.anIntArray49[local3] * local11 + this.anIntArray58[local3] * local143 + 32767 >> 16;
					this.anIntArray49[local3] = this.anIntArray49[local3] * local143 + 32767 - this.anIntArray58[local3] * local11 >> 16;
					this.anIntArray58[local3] = local161;
				}
				this.anIntArray58[local3] += Static28.anInt554;
				this.anIntArray50[local3] += Static28.anInt552;
				this.anIntArray49[local3] += Static28.anInt553;
			}
		} else if (arg0 == 3) {
			for (local3 = 0; local3 < this.anInt551; local3++) {
				this.anIntArray58[local3] -= Static28.anInt554;
				this.anIntArray50[local3] -= Static28.anInt552;
				this.anIntArray49[local3] -= Static28.anInt553;
				this.anIntArray58[local3] = this.anIntArray58[local3] * arg1 / 128;
				this.anIntArray50[local3] = this.anIntArray50[local3] * arg2 / 128;
				this.anIntArray49[local3] = this.anIntArray49[local3] * arg3 / 128;
				this.anIntArray58[local3] += Static28.anInt554;
				this.anIntArray50[local3] += Static28.anInt552;
				this.anIntArray49[local3] += Static28.anInt553;
			}
		} else if (arg0 == 5) {
			for (local3 = 0; local3 < this.anInt549; local3++) {
				local11 = (this.aByteArray18[local3] & 0xFF) + arg1 * 8;
				if (local11 < 0) {
					local11 = 0;
				} else if (local11 > 255) {
					local11 = 255;
				}
				this.aByteArray18[local3] = (byte) local11;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	@Override
	public void method530(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class45.anIntArray159[arg0];
		@Pc(7) int local7 = Class45.anIntArray156[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt551; local9++) {
			@Pc(26) int local26 = this.anIntArray50[local9] * local7 - this.anIntArray49[local9] * local3 >> 16;
			this.anIntArray49[local9] = this.anIntArray50[local9] * local3 + this.anIntArray49[local9] * local7 >> 16;
			this.anIntArray50[local9] = local26;
		}
		this.aBoolean46 = false;
	}
}
