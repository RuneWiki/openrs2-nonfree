import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "[I")
	public int[] anIntArray8;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
	public int anInt160 = 0;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	private int anInt158 = 0;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
	private int anInt159 = 0;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!se;IIIII)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2944();
		arg0.method2953();
		this.anInt160 = arg0.anInt3816;
		this.anIntArray8 = arg0.anIntArray322;
		this.anIntArray7 = arg0.anIntArray330;
		this.anIntArray11 = arg0.anIntArray327;
		this.anInt159 = arg0.anInt3817;
		this.anIntArray10 = arg0.anIntArray319;
		this.anIntArray6 = arg0.anIntArray320;
		this.anIntArray13 = arg0.anIntArray323;
		this.aByteArray1 = arg0.aByteArray40;
		this.aByteArray2 = arg0.aByteArray42;
		this.aByte2 = arg0.aByte7;
		this.anIntArrayArray2 = arg0.anIntArrayArray31;
		this.anIntArrayArray3 = arg0.anIntArrayArray32;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray15 = new int[this.anInt159];
		this.anIntArray16 = new int[this.anInt159];
		this.anIntArray12 = new int[this.anInt159];
		@Pc(118) int local118;
		if (arg0.aShortArray48 == null) {
			this.aShortArray3 = null;
		} else {
			this.aShortArray3 = new short[this.anInt159];
			for (local118 = 0; local118 < this.anInt159; local118++) {
				@Pc(124) short local124 = arg0.aShortArray48[local118];
				if (local124 != -1 && Static182.anInterface2_2.method1319(local124)) {
					this.aShortArray3[local118] = local124;
				} else {
					this.aShortArray3[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt3815 > 0 && arg0.aByteArray44 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt3815];
			for (@Pc(164) int local164 = 0; local164 < this.anInt159; local164++) {
				if (arg0.aByteArray44[local164] != -1) {
					local162[arg0.aByteArray44[local164] & 0xFF]++;
				}
			}
			this.anInt158 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt3815; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray48[local193] == 0) {
					this.anInt158++;
				}
			}
			this.anIntArray14 = new int[this.anInt158];
			this.anIntArray17 = new int[this.anInt158];
			this.anIntArray9 = new int[this.anInt158];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt3815; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray48[local233] == 0) {
					this.anIntArray14[local231] = arg0.aShortArray45[local233] & 0xFFFF;
					this.anIntArray17[local231] = arg0.aShortArray47[local233] & 0xFFFF;
					this.anIntArray9[local231] = arg0.aShortArray46[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray3 = new byte[this.anInt159];
			for (local295 = 0; local295 < this.anInt159; local295++) {
				if (arg0.aByteArray44[local295] == -1) {
					this.aByteArray3[local295] = -1;
				} else {
					this.aByteArray3[local295] = (byte) local162[arg0.aByteArray44[local295] & 0xFF];
					if (this.aByteArray3[local295] == -1 && this.aShortArray3 != null) {
						this.aShortArray3[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt159; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray47 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray47[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray42 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray42[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray3 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray3[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class38 local417;
			@Pc(578) Class35 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray43[local118] & 0xFFFF;
					if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray10[local118]] == null) {
						local417 = arg0.aClass38Array2[this.anIntArray10[local118]];
					} else {
						local417 = arg0.aClass38Array1[this.anIntArray10[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt1688 + arg4 * local417.anInt1689 + arg5 * local417.anInt1690) / (local93 * local417.anInt1691);
					this.anIntArray15[local118] = Static6.method176(local398, local295);
					if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray6[local118]] == null) {
						local417 = arg0.aClass38Array2[this.anIntArray6[local118]];
					} else {
						local417 = arg0.aClass38Array1[this.anIntArray6[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt1688 + arg4 * local417.anInt1689 + arg5 * local417.anInt1690) / (local93 * local417.anInt1691);
					this.anIntArray16[local118] = Static6.method176(local398, local295);
					if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray13[local118]] == null) {
						local417 = arg0.aClass38Array2[this.anIntArray13[local118]];
					} else {
						local417 = arg0.aClass38Array1[this.anIntArray13[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt1688 + arg4 * local417.anInt1689 + arg5 * local417.anInt1690) / (local93 * local417.anInt1691);
					this.anIntArray12[local118] = Static6.method176(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass35Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt1659 + arg4 * local578.anInt1658 + arg5 * local578.anInt1652) / (local93 + local93 / 2);
					this.anIntArray15[local118] = Static6.method176(arg0.aShortArray43[local118] & 0xFFFF, local295);
					this.anIntArray12[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray15[local118] = 128;
					this.anIntArray12[local118] = -1;
				} else {
					this.anIntArray12[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray10[local118]] == null) {
					local417 = arg0.aClass38Array2[this.anIntArray10[local118]];
				} else {
					local417 = arg0.aClass38Array1[this.anIntArray10[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt1688 + arg4 * local417.anInt1689 + arg5 * local417.anInt1690) / (local93 * local417.anInt1691);
				this.anIntArray15[local118] = Static6.method174(local295);
				if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray6[local118]] == null) {
					local417 = arg0.aClass38Array2[this.anIntArray6[local118]];
				} else {
					local417 = arg0.aClass38Array1[this.anIntArray6[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt1688 + arg4 * local417.anInt1689 + arg5 * local417.anInt1690) / (local93 * local417.anInt1691);
				this.anIntArray16[local118] = Static6.method174(local295);
				if (arg0.aClass38Array1 == null || arg0.aClass38Array1[this.anIntArray13[local118]] == null) {
					local417 = arg0.aClass38Array2[this.anIntArray13[local118]];
				} else {
					local417 = arg0.aClass38Array1[this.anIntArray13[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt1688 + arg4 * local417.anInt1689 + arg5 * local417.anInt1690) / (local93 * local417.anInt1691);
				this.anIntArray12[local118] = Static6.method174(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass35Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt1659 + arg4 * local578.anInt1658 + arg5 * local578.anInt1652) / (local93 + local93 / 2);
				this.anIntArray15[local118] = Static6.method174(local295);
				this.anIntArray12[local118] = -1;
			} else {
				this.anIntArray12[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([Lclient!ae;I)V")
	private Class5_Sub1_Sub1(@OriginalArg(0) Class5_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt160 = 0;
		this.anInt159 = 0;
		this.anInt158 = 0;
		this.aByte2 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class5_Sub1_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt160 += local43.anInt160;
				this.anInt159 += local43.anInt159;
				this.anInt158 += local43.anInt158;
				if (local43.aByteArray1 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local43.aByte2;
					}
					if (this.aByte2 != local43.aByte2) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray2 != null;
				local22 |= local43.aShortArray3 != null;
				local24 |= local43.aByteArray3 != null;
			}
		}
		this.anIntArray8 = new int[this.anInt160];
		this.anIntArray7 = new int[this.anInt160];
		this.anIntArray11 = new int[this.anInt160];
		this.anIntArray10 = new int[this.anInt159];
		this.anIntArray6 = new int[this.anInt159];
		this.anIntArray13 = new int[this.anInt159];
		this.anIntArray15 = new int[this.anInt159];
		this.anIntArray16 = new int[this.anInt159];
		this.anIntArray12 = new int[this.anInt159];
		if (local18) {
			this.aByteArray1 = new byte[this.anInt159];
		}
		if (local20) {
			this.aByteArray2 = new byte[this.anInt159];
		}
		if (local22) {
			this.aShortArray3 = new short[this.anInt159];
		}
		if (local24) {
			this.aByteArray3 = new byte[this.anInt159];
		}
		if (this.anInt158 > 0) {
			this.anIntArray14 = new int[this.anInt158];
			this.anIntArray17 = new int[this.anInt158];
			this.anIntArray9 = new int[this.anInt158];
		}
		this.anInt160 = 0;
		this.anInt159 = 0;
		this.anInt158 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class5_Sub1_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt159; local229++) {
					this.anIntArray10[this.anInt159] = local225.anIntArray10[local229] + this.anInt160;
					this.anIntArray6[this.anInt159] = local225.anIntArray6[local229] + this.anInt160;
					this.anIntArray13[this.anInt159] = local225.anIntArray13[local229] + this.anInt160;
					this.anIntArray15[this.anInt159] = local225.anIntArray15[local229];
					this.anIntArray16[this.anInt159] = local225.anIntArray16[local229];
					this.anIntArray12[this.anInt159] = local225.anIntArray12[local229];
					if (local18) {
						if (local225.aByteArray1 == null) {
							this.aByteArray1[this.anInt159] = local225.aByte2;
						} else {
							this.aByteArray1[this.anInt159] = local225.aByteArray1[local229];
						}
					}
					if (local20 && local225.aByteArray2 != null) {
						this.aByteArray2[this.anInt159] = local225.aByteArray2[local229];
					}
					if (local22) {
						if (local225.aShortArray3 == null) {
							this.aShortArray3[this.anInt159] = -1;
						} else {
							this.aShortArray3[this.anInt159] = local225.aShortArray3[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray3 == null || local225.aByteArray3[local229] == -1) {
							this.aByteArray3[this.anInt159] = -1;
						} else {
							this.aByteArray3[this.anInt159] = (byte) (local225.aByteArray3[local229] + this.anInt158);
						}
					}
					this.anInt159++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt158; local394++) {
					this.anIntArray14[this.anInt158] = local225.anIntArray14[local394] + this.anInt160;
					this.anIntArray17[this.anInt158] = local225.anIntArray17[local394] + this.anInt160;
					this.anIntArray9[this.anInt158] = local225.anIntArray9[local394] + this.anInt160;
					this.anInt158++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt160; local444++) {
					this.anIntArray8[this.anInt160] = local225.anIntArray8[local444];
					this.anIntArray7[this.anInt160] = local225.anIntArray7[local444];
					this.anIntArray11[this.anInt160] = local225.anIntArray11[local444];
					this.anInt160++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "()I")
	@Override
	public int method163() {
		if (!this.aBoolean7) {
			this.method175();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
	private void method171(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static182.anInt4072;
		@Pc(3) int local3 = Static182.anInt4069;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray10[arg0];
		@Pc(15) int local15 = this.anIntArray6[arg0];
		@Pc(20) int local20 = this.anIntArray13[arg0];
		@Pc(24) int local24 = Static6.anIntArray20[local10];
		@Pc(28) int local28 = Static6.anIntArray20[local15];
		@Pc(32) int local32 = Static6.anIntArray20[local20];
		if (this.aByteArray2 == null) {
			Static182.anInt4071 = 0;
		} else {
			Static182.anInt4071 = this.aByteArray2[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static6.anIntArray23[0] = Static6.anIntArray22[local10];
			Static6.anIntArray19[0] = Static6.anIntArray30[local10];
			local5++;
			Static6.anIntArray18[0] = this.anIntArray15[arg0];
		} else {
			local73 = Static6.anIntArray21[local10];
			local77 = Static6.anIntArray26[local10];
			local82 = this.anIntArray15[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class1_Sub2_Sub8_Sub4.anIntArray353[local32 - local24];
				Static6.anIntArray23[0] = local1 + (local73 + ((Static6.anIntArray21[local20] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray19[0] = local3 + (local77 + ((Static6.anIntArray26[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static6.anIntArray18[0] = local82 + ((this.anIntArray12[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class1_Sub2_Sub8_Sub4.anIntArray353[local28 - local24];
				Static6.anIntArray23[local5] = local1 + (local73 + ((Static6.anIntArray21[local15] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray19[local5] = local3 + (local77 + ((Static6.anIntArray26[local15] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray18[local5++] = local82 + ((this.anIntArray16[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static6.anIntArray23[local5] = Static6.anIntArray22[local15];
			Static6.anIntArray19[local5] = Static6.anIntArray30[local15];
			Static6.anIntArray18[local5++] = this.anIntArray16[arg0];
		} else {
			local73 = Static6.anIntArray21[local15];
			local77 = Static6.anIntArray26[local15];
			local82 = this.anIntArray16[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class1_Sub2_Sub8_Sub4.anIntArray353[local24 - local28];
				Static6.anIntArray23[local5] = local1 + (local73 + ((Static6.anIntArray21[local10] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray19[local5] = local3 + (local77 + ((Static6.anIntArray26[local10] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray18[local5++] = local82 + ((this.anIntArray15[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class1_Sub2_Sub8_Sub4.anIntArray353[local32 - local28];
				Static6.anIntArray23[local5] = local1 + (local73 + ((Static6.anIntArray21[local20] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray19[local5] = local3 + (local77 + ((Static6.anIntArray26[local20] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray18[local5++] = local82 + ((this.anIntArray12[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static6.anIntArray23[local5] = Static6.anIntArray22[local20];
			Static6.anIntArray19[local5] = Static6.anIntArray30[local20];
			Static6.anIntArray18[local5++] = this.anIntArray12[arg0];
		} else {
			local73 = Static6.anIntArray21[local20];
			local77 = Static6.anIntArray26[local20];
			local82 = this.anIntArray12[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class1_Sub2_Sub8_Sub4.anIntArray353[local28 - local32];
				Static6.anIntArray23[local5] = local1 + (local73 + ((Static6.anIntArray21[local15] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray19[local5] = local3 + (local77 + ((Static6.anIntArray26[local15] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray18[local5++] = local82 + ((this.anIntArray16[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class1_Sub2_Sub8_Sub4.anIntArray353[local24 - local32];
				Static6.anIntArray23[local5] = local1 + (local73 + ((Static6.anIntArray21[local10] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray19[local5] = local3 + (local77 + ((Static6.anIntArray26[local10] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray18[local5++] = local82 + ((this.anIntArray15[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static6.anIntArray23[0];
		local77 = Static6.anIntArray23[1];
		local82 = Static6.anIntArray23[2];
		local95 = Static6.anIntArray19[0];
		@Pc(590) int local590 = Static6.anIntArray19[1];
		@Pc(594) int local594 = Static6.anIntArray19[2];
		Static182.aBoolean191 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static182.anInt4068 || local77 > Static182.anInt4068 || local82 > Static182.anInt4068) {
				Static182.aBoolean191 = true;
			}
			if (this.aShortArray3 != null && this.aShortArray3[arg0] != -1) {
				if (this.aByteArray3 == null || this.aByteArray3[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray3[arg0] & 0xFF;
					local683 = this.anIntArray14[local678];
					local688 = this.anIntArray17[local678];
					local693 = this.anIntArray9[local678];
				}
				if (this.anIntArray12[arg0] == -1) {
					Static182.method3147(local95, local590, local594, local73, local77, local82, this.anIntArray15[arg0], this.anIntArray15[arg0], this.anIntArray15[arg0], Static6.anIntArray21[local683], Static6.anIntArray21[local688], Static6.anIntArray21[local693], Static6.anIntArray26[local683], Static6.anIntArray26[local688], Static6.anIntArray26[local693], Static6.anIntArray20[local683], Static6.anIntArray20[local688], Static6.anIntArray20[local693], this.aShortArray3[arg0]);
				} else {
					Static182.method3147(local95, local590, local594, local73, local77, local82, Static6.anIntArray18[0], Static6.anIntArray18[1], Static6.anIntArray18[2], Static6.anIntArray21[local683], Static6.anIntArray21[local688], Static6.anIntArray21[local693], Static6.anIntArray26[local683], Static6.anIntArray26[local688], Static6.anIntArray26[local693], Static6.anIntArray20[local683], Static6.anIntArray20[local688], Static6.anIntArray20[local693], this.aShortArray3[arg0]);
				}
			} else if (this.anIntArray12[arg0] == -1) {
				Static182.method3155(local95, local590, local594, local73, local77, local82, Static182.anIntArray354[this.anIntArray15[arg0]]);
			} else {
				Static182.method3149(local95, local590, local594, local73, local77, local82, Static6.anIntArray18[0], Static6.anIntArray18[1], Static6.anIntArray18[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static182.anInt4068 || local77 > Static182.anInt4068 || local82 > Static182.anInt4068 || Static6.anIntArray23[3] < 0 || Static6.anIntArray23[3] > Static182.anInt4068) {
			Static182.aBoolean191 = true;
		}
		if (this.aShortArray3 == null || this.aShortArray3[arg0] == -1) {
			if (this.anIntArray12[arg0] == -1) {
				local683 = Static182.anIntArray354[this.anIntArray15[arg0]];
				Static182.method3155(local95, local590, local594, local73, local77, local82, local683);
				Static182.method3155(local95, local594, Static6.anIntArray19[3], local73, local82, Static6.anIntArray23[3], local683);
				return;
			}
			Static182.method3149(local95, local590, local594, local73, local77, local82, Static6.anIntArray18[0], Static6.anIntArray18[1], Static6.anIntArray18[2]);
			Static182.method3149(local95, local594, Static6.anIntArray19[3], local73, local82, Static6.anIntArray23[3], Static6.anIntArray18[0], Static6.anIntArray18[2], Static6.anIntArray18[3]);
			return;
		}
		if (this.aByteArray3 == null || this.aByteArray3[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray3[arg0] & 0xFF;
			local683 = this.anIntArray14[local678];
			local688 = this.anIntArray17[local678];
			local693 = this.anIntArray9[local678];
		}
		@Pc(956) short local956 = this.aShortArray3[arg0];
		if (this.anIntArray12[arg0] == -1) {
			Static182.method3147(local95, local590, local594, local73, local77, local82, this.anIntArray15[arg0], this.anIntArray15[arg0], this.anIntArray15[arg0], Static6.anIntArray21[local683], Static6.anIntArray21[local688], Static6.anIntArray21[local693], Static6.anIntArray26[local683], Static6.anIntArray26[local688], Static6.anIntArray26[local693], Static6.anIntArray20[local683], Static6.anIntArray20[local688], Static6.anIntArray20[local693], local956);
			Static182.method3147(local95, local594, Static6.anIntArray19[3], local73, local82, Static6.anIntArray23[3], this.anIntArray15[arg0], this.anIntArray15[arg0], this.anIntArray15[arg0], Static6.anIntArray21[local683], Static6.anIntArray21[local688], Static6.anIntArray21[local693], Static6.anIntArray26[local683], Static6.anIntArray26[local688], Static6.anIntArray26[local693], Static6.anIntArray20[local683], Static6.anIntArray20[local688], Static6.anIntArray20[local693], local956);
			return;
		}
		Static182.method3147(local95, local590, local594, local73, local77, local82, Static6.anIntArray18[0], Static6.anIntArray18[1], Static6.anIntArray18[2], Static6.anIntArray21[local683], Static6.anIntArray21[local688], Static6.anIntArray21[local693], Static6.anIntArray26[local683], Static6.anIntArray26[local688], Static6.anIntArray26[local693], Static6.anIntArray20[local683], Static6.anIntArray20[local688], Static6.anIntArray20[local693], local956);
		Static182.method3147(local95, local594, Static6.anIntArray19[3], local73, local82, Static6.anIntArray23[3], Static6.anIntArray18[0], Static6.anIntArray18[2], Static6.anIntArray18[3], Static6.anIntArray21[local683], Static6.anIntArray21[local688], Static6.anIntArray21[local693], Static6.anIntArray26[local683], Static6.anIntArray26[local688], Static6.anIntArray26[local693], Static6.anIntArray20[local683], Static6.anIntArray20[local688], Static6.anIntArray20[local693], local956);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIII)V")
	public void method172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean7) {
				this.method175();
			}
			@Pc(6) int local6 = Static182.anInt4072;
			@Pc(8) int local8 = Static182.anInt4069;
			@Pc(12) int local12 = Class1_Sub2_Sub8_Sub4.anIntArray350[0];
			@Pc(16) int local16 = Class1_Sub2_Sub8_Sub4.anIntArray355[0];
			@Pc(20) int local20 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
			@Pc(24) int local24 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
			@Pc(28) int local28 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg1];
			@Pc(32) int local32 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg1];
			@Pc(36) int local36 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg2];
			@Pc(40) int local40 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt160; local52++) {
				@Pc(58) int local58 = this.anIntArray8[local52];
				@Pc(63) int local63 = this.anIntArray7[local52];
				@Pc(68) int local68 = this.anIntArray11[local52];
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
				Static6.anIntArray25[local52] = local68 - local50;
				Static6.anIntArray22[local52] = local6 + (local58 << 9) / arg6;
				Static6.anIntArray30[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt158 > 0) {
					Static6.anIntArray21[local52] = local58;
					Static6.anIntArray26[local52] = local80;
					Static6.anIntArray20[local52] = local68;
				}
			}
			this.method179(false, false, 0L, this.aShort3, this.aShort3 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean7) {
			this.method175();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort6 * arg2 + this.aShort4 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort6 * arg2 + this.aShort8 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort6 << 9;
		if (local78 / local38 <= Static55.anInt1374) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort6 << 9;
		if (local91 / local38 >= Static140.anInt3139) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort6 * arg1 + this.aShort4 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static105.anInt2371) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort6 * arg1 + this.aShort8 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static172.anInt3846) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt158 > 0;
		@Pc(172) int local172 = Static182.anInt4072;
		@Pc(174) int local174 = Static182.anInt4069;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
			local178 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static54.aBoolean178 && local57 > 0) {
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
			if (Static64.anInt1643 >= local204 && Static64.anInt1643 <= local208 && Static99.anInt2232 >= local223 && Static99.anInt2232 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort2, this.aShort5, this.aShort2, this.aShort5, this.aShort2, this.aShort5, this.aShort2, this.aShort5 };
				@Pc(342) int[] local342 = new int[] { this.aShort1, this.aShort1, this.aShort7, this.aShort7, this.aShort1, this.aShort1, this.aShort7, this.aShort7 };
				@Pc(385) int[] local385 = new int[] { this.aShort8, this.aShort8, this.aShort8, this.aShort8, this.aShort4, this.aShort4, this.aShort4, this.aShort4 };
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
				if (Static64.anInt1643 >= local204 && Static64.anInt1643 <= local208 && Static99.anInt2232 >= local223 && Static99.anInt2232 <= local227) {
					if (super.aBoolean6) {
						Static176.aLongArray40[Static168.anInt3728++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt160; local204++) {
			local223 = this.anIntArray8[local204];
			local208 = this.anIntArray7[local204];
			local227 = this.anIntArray11[local204];
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
			Static6.anIntArray25[local204] = local227 - local24;
			if (local227 >= 50) {
				Static6.anIntArray22[local204] = local172 + (local223 << 9) / local227;
				Static6.anIntArray30[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static6.anIntArray22[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static6.anIntArray21[local204] = local223;
				Static6.anIntArray26[local204] = local574;
				Static6.anIntArray20[local204] = local227;
			}
		}
		try {
			this.method179(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	@Override
	public void method156(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
		@Pc(7) int local7 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt160; local9++) {
			@Pc(26) int local26 = this.anIntArray7[local9] * local7 - this.anIntArray11[local9] * local3 >> 16;
			this.anIntArray11[local9] = this.anIntArray7[local9] * local3 + this.anIntArray11[local9] * local7 >> 16;
			this.anIntArray7[local9] = local26;
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
	@Override
	public void method157() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt160; local1++) {
			this.anIntArray8[local1] = -this.anIntArray8[local1];
			this.anIntArray11[local1] = -this.anIntArray11[local1];
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
	@Override
	public void method159() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt160; local1++) {
			@Pc(7) int local7 = this.anIntArray11[local1];
			this.anIntArray11[local1] = this.anIntArray8[local1];
			this.anIntArray8[local1] = -local7;
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "()I")
	@Override
	public int method161() {
		if (!this.aBoolean7) {
			this.method175();
		}
		return this.aShort1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean7) {
				this.method175();
			}
			@Pc(6) int local6 = Static182.anInt4072;
			@Pc(8) int local8 = Static182.anInt4069;
			@Pc(12) int local12 = Class1_Sub2_Sub8_Sub4.anIntArray350[0];
			@Pc(16) int local16 = Class1_Sub2_Sub8_Sub4.anIntArray355[0];
			@Pc(20) int local20 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
			@Pc(24) int local24 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
			@Pc(28) int local28 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg1];
			@Pc(32) int local32 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg1];
			@Pc(36) int local36 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg2];
			@Pc(40) int local40 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt160; local52++) {
				@Pc(58) int local58 = this.anIntArray8[local52];
				@Pc(63) int local63 = this.anIntArray7[local52];
				@Pc(68) int local68 = this.anIntArray11[local52];
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
				Static6.anIntArray25[local52] = local68 - local50;
				Static6.anIntArray22[local52] = local6 + (local58 << 9) / local68;
				Static6.anIntArray30[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt158 > 0) {
					Static6.anIntArray21[local52] = local58;
					Static6.anIntArray26[local52] = local80;
					Static6.anIntArray20[local52] = local68;
				}
			}
			this.method179(false, false, 0L, this.aShort3, this.aShort3 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!wh;I)V")
	@Override
	public void method170(@OriginalArg(0) Class1_Sub2_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray2 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class8 local12 = arg0.aClass8Array1[arg1];
		@Pc(15) Class1_Sub17 local15 = local12.aClass1_Sub17_1;
		Static6.anInt162 = 0;
		Static6.anInt163 = 0;
		Static6.anInt161 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt268; local23++) {
			@Pc(29) short local29 = local12.aShortArray10[local23];
			if (local12.aShortArray5[local23] != -1) {
				this.method182(0, local15.anIntArrayArray20[local12.aShortArray5[local23]], 0, 0, 0);
			}
			this.method182(local15.anIntArray223[local29], local15.anIntArrayArray20[local29], local12.aShortArray8[local23], local12.aShortArray12[local23], local12.aShortArray9[local23]);
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!ae;[B)Lclient!lg;")
	private Class5_Sub1 method173(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt160 = this.anInt160;
		arg1.anInt159 = this.anInt159;
		arg1.anInt158 = this.anInt158;
		if (arg1.anIntArray8 == null || arg1.anIntArray8.length < this.anInt160) {
			arg1.anIntArray8 = new int[this.anInt160 + 100];
			arg1.anIntArray7 = new int[this.anInt160 + 100];
			arg1.anIntArray11 = new int[this.anInt160 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt160; local43++) {
			arg1.anIntArray8[local43] = this.anIntArray8[local43];
			arg1.anIntArray7[local43] = this.anIntArray7[local43];
			arg1.anIntArray11[local43] = this.anIntArray11[local43];
		}
		if (arg0) {
			arg1.aByteArray2 = this.aByteArray2;
		} else {
			arg1.aByteArray2 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray2 == null) {
				for (local88 = 0; local88 < this.anInt159; local88++) {
					arg1.aByteArray2[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt159; local88++) {
					arg1.aByteArray2[local88] = this.aByteArray2[local88];
				}
			}
		}
		arg1.anIntArray10 = this.anIntArray10;
		arg1.anIntArray6 = this.anIntArray6;
		arg1.anIntArray13 = this.anIntArray13;
		arg1.anIntArray15 = this.anIntArray15;
		arg1.anIntArray16 = this.anIntArray16;
		arg1.anIntArray12 = this.anIntArray12;
		arg1.aByteArray1 = this.aByteArray1;
		arg1.aByteArray3 = this.aByteArray3;
		arg1.aShortArray3 = this.aShortArray3;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray14 = this.anIntArray14;
		arg1.anIntArray17 = this.anIntArray17;
		arg1.anIntArray9 = this.anIntArray9;
		arg1.anIntArrayArray2 = this.anIntArrayArray2;
		arg1.anIntArrayArray3 = this.anIntArrayArray3;
		arg1.aBoolean6 = super.aBoolean6;
		arg1.aBoolean7 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "()I")
	@Override
	public int method164() {
		if (!this.aBoolean7) {
			this.method175();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "()I")
	@Override
	public int method166() {
		if (!this.aBoolean7) {
			this.method175();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "()V")
	private void method175() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt160; local17++) {
			@Pc(23) int local23 = this.anIntArray8[local17];
			@Pc(28) int local28 = this.anIntArray7[local17];
			@Pc(33) int local33 = this.anIntArray11[local17];
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
		this.aShort2 = (short) local1;
		this.aShort5 = (short) local7;
		this.aShort8 = (short) local3;
		this.aShort4 = (short) local9;
		this.aShort1 = (short) local5;
		this.aShort7 = (short) local11;
		this.aShort6 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort3 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean7 = true;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
	@Override
	public void method165(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
		@Pc(7) int local7 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt160; local9++) {
			@Pc(26) int local26 = this.anIntArray7[local9] * local3 + this.anIntArray8[local9] * local7 >> 16;
			this.anIntArray7[local9] = this.anIntArray7[local9] * local7 - this.anIntArray8[local9] * local3 >> 16;
			this.anIntArray8[local9] = local26;
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V")
	private void method177(@OriginalArg(0) int arg0) {
		if (Static6.aBooleanArray1[arg0]) {
			this.method171(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray10[arg0];
		@Pc(17) int local17 = this.anIntArray6[arg0];
		@Pc(22) int local22 = this.anIntArray13[arg0];
		Static182.aBoolean191 = Static6.aBooleanArray2[arg0];
		if (this.aByteArray2 == null) {
			Static182.anInt4071 = 0;
		} else {
			Static182.anInt4071 = this.aByteArray2[arg0] & 0xFF;
		}
		if (this.aShortArray3 != null && this.aShortArray3[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray3 == null || this.aByteArray3[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray3[arg0] & 0xFF;
				local133 = this.anIntArray14[local128];
				local138 = this.anIntArray17[local128];
				local143 = this.anIntArray9[local128];
			}
			if (this.anIntArray12[arg0] == -1) {
				Static182.method3147(Static6.anIntArray30[local12], Static6.anIntArray30[local17], Static6.anIntArray30[local22], Static6.anIntArray22[local12], Static6.anIntArray22[local17], Static6.anIntArray22[local22], this.anIntArray15[arg0], this.anIntArray15[arg0], this.anIntArray15[arg0], Static6.anIntArray21[local133], Static6.anIntArray21[local138], Static6.anIntArray21[local143], Static6.anIntArray26[local133], Static6.anIntArray26[local138], Static6.anIntArray26[local143], Static6.anIntArray20[local133], Static6.anIntArray20[local138], Static6.anIntArray20[local143], this.aShortArray3[arg0]);
			} else {
				Static182.method3147(Static6.anIntArray30[local12], Static6.anIntArray30[local17], Static6.anIntArray30[local22], Static6.anIntArray22[local12], Static6.anIntArray22[local17], Static6.anIntArray22[local22], this.anIntArray15[arg0], this.anIntArray16[arg0], this.anIntArray12[arg0], Static6.anIntArray21[local133], Static6.anIntArray21[local138], Static6.anIntArray21[local143], Static6.anIntArray26[local133], Static6.anIntArray26[local138], Static6.anIntArray26[local143], Static6.anIntArray20[local133], Static6.anIntArray20[local138], Static6.anIntArray20[local143], this.aShortArray3[arg0]);
			}
		} else if (this.anIntArray12[arg0] == -1) {
			Static182.method3155(Static6.anIntArray30[local12], Static6.anIntArray30[local17], Static6.anIntArray30[local22], Static6.anIntArray22[local12], Static6.anIntArray22[local17], Static6.anIntArray22[local22], Static182.anIntArray354[this.anIntArray15[arg0]]);
		} else {
			Static182.method3149(Static6.anIntArray30[local12], Static6.anIntArray30[local17], Static6.anIntArray30[local22], Static6.anIntArray22[local12], Static6.anIntArray22[local17], Static6.anIntArray22[local22], this.anIntArray15[arg0], this.anIntArray16[arg0], this.anIntArray12[arg0]);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!lg;)Lclient!lg;")
	public Class5_Sub1 method178(@OriginalArg(0) Class5_Sub1 arg0) {
		return new Class5_Sub1_Sub1(new Class5_Sub1_Sub1[] { this, (Class5_Sub1_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "()I")
	@Override
	public int method155() {
		if (!this.aBoolean7) {
			this.method175();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZJII)V")
	private void method179(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static6.anIntArray27[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt159; local16++) {
			if (this.anIntArray12[local16] != -2) {
				local28 = this.anIntArray10[local16];
				local33 = this.anIntArray6[local16];
				local38 = this.anIntArray13[local16];
				local42 = Static6.anIntArray22[local28];
				local46 = Static6.anIntArray22[local33];
				local50 = Static6.anIntArray22[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static6.anIntArray21[local28];
					local69 = Static6.anIntArray21[local33];
					@Pc(73) int local73 = Static6.anIntArray21[local38];
					@Pc(77) int local77 = Static6.anIntArray26[local28];
					local81 = Static6.anIntArray26[local33];
					local85 = Static6.anIntArray26[local38];
					@Pc(89) int local89 = Static6.anIntArray20[local28];
					local93 = Static6.anIntArray20[local33];
					@Pc(97) int local97 = Static6.anIntArray20[local38];
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
						Static6.aBooleanArray1[local16] = true;
						@Pc(177) int local177 = (Static6.anIntArray25[local28] + Static6.anIntArray25[local33] + Static6.anIntArray25[local38]) / 3 + arg3;
						Static6.anIntArrayArray5[local177][Static6.anIntArray27[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method180(Static64.anInt1643 + Static182.anInt4072, Static99.anInt2232 + Static182.anInt4069, Static6.anIntArray30[local28], Static6.anIntArray30[local33], Static6.anIntArray30[local38], local42, local46, local50)) {
						Static176.aLongArray40[Static168.anInt3728++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static6.anIntArray30[local38] - Static6.anIntArray30[local33]) - (Static6.anIntArray30[local28] - Static6.anIntArray30[local33]) * (local50 - local46) > 0) {
						Static6.aBooleanArray1[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static182.anInt4068 && local46 <= Static182.anInt4068 && local50 <= Static182.anInt4068) {
							Static6.aBooleanArray2[local16] = false;
						} else {
							Static6.aBooleanArray2[local16] = true;
						}
						local65 = (Static6.anIntArray25[local28] + Static6.anIntArray25[local33] + Static6.anIntArray25[local38]) / 3 + arg3;
						Static6.anIntArrayArray5[local65][Static6.anIntArray27[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray1 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static6.anIntArray27[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static6.anIntArrayArray5[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method177(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static6.anIntArray28[local28] = 0;
			Static6.anIntArray29[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static6.anIntArray27[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static6.anIntArrayArray5[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray1[local50];
					local69 = Static6.anIntArray28[local386]++;
					Static6.anIntArrayArray4[local386][local69] = local50;
					if (local386 < 10) {
						Static6.anIntArray29[local386] += local33;
					} else if (local386 == 10) {
						Static6.anIntArray31[local69] = local33;
					} else {
						Static6.anIntArray24[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static6.anIntArray28[1] > 0 || Static6.anIntArray28[2] > 0) {
			local38 = (Static6.anIntArray29[1] + Static6.anIntArray29[2]) / (Static6.anIntArray28[1] + Static6.anIntArray28[2]);
		}
		local42 = 0;
		if (Static6.anIntArray28[3] > 0 || Static6.anIntArray28[4] > 0) {
			local42 = (Static6.anIntArray29[3] + Static6.anIntArray29[4]) / (Static6.anIntArray28[3] + Static6.anIntArray28[4]);
		}
		local46 = 0;
		if (Static6.anIntArray28[6] > 0 || Static6.anIntArray28[8] > 0) {
			local46 = (Static6.anIntArray29[6] + Static6.anIntArray29[8]) / (Static6.anIntArray28[6] + Static6.anIntArray28[8]);
		}
		local65 = 0;
		local69 = Static6.anIntArray28[10];
		@Pc(519) int[] local519 = Static6.anIntArrayArray4[10];
		@Pc(521) int[] local521 = Static6.anIntArray31;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static6.anIntArray28[11];
			local519 = Static6.anIntArrayArray4[11];
			local521 = Static6.anIntArray24;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method177(local519[local65++]);
				if (local65 == local69 && local519 != Static6.anIntArrayArray4[11]) {
					local65 = 0;
					local69 = Static6.anIntArray28[11];
					local519 = Static6.anIntArrayArray4[11];
					local521 = Static6.anIntArray24;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method177(local519[local65++]);
				if (local65 == local69 && local519 != Static6.anIntArrayArray4[11]) {
					local65 = 0;
					local69 = Static6.anIntArray28[11];
					local519 = Static6.anIntArrayArray4[11];
					local521 = Static6.anIntArray24;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method177(local519[local65++]);
				if (local65 == local69 && local519 != Static6.anIntArrayArray4[11]) {
					local65 = 0;
					local69 = Static6.anIntArray28[11];
					local519 = Static6.anIntArrayArray4[11];
					local521 = Static6.anIntArray24;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static6.anIntArray28[local81];
			@Pc(684) int[] local684 = Static6.anIntArrayArray4[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method177(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method177(local519[local65++]);
			if (local65 == local69 && local519 != Static6.anIntArrayArray4[11]) {
				local65 = 0;
				local519 = Static6.anIntArrayArray4[11];
				local69 = Static6.anIntArray28[11];
				local521 = Static6.anIntArray24;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
	@Override
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt160; local1++) {
			this.anIntArray8[local1] = this.anIntArray8[local1] * arg0 / 128;
			this.anIntArray7[local1] = this.anIntArray7[local1] * arg1 / 128;
			this.anIntArray11[local1] = this.anIntArray11[local1] * arg2 / 128;
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(III)V")
	@Override
	public void method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt160; local1++) {
			this.anIntArray8[local1] += arg0;
			this.anIntArray7[local1] += arg1;
			this.anIntArray11[local1] += arg2;
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "()V")
	@Override
	public void method168() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt160; local1++) {
			@Pc(7) int local7 = this.anIntArray8[local1];
			this.anIntArray8[local1] = this.anIntArray11[local1];
			this.anIntArray11[local1] = -local7;
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	@Override
	public void method158(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg0];
		@Pc(7) int local7 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt160; local9++) {
			@Pc(26) int local26 = this.anIntArray11[local9] * local3 + this.anIntArray8[local9] * local7 >> 16;
			this.anIntArray11[local9] = this.anIntArray11[local9] * local7 - this.anIntArray8[local9] * local3 >> 16;
			this.anIntArray8[local9] = local26;
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Lclient!lg;")
	@Override
	public Class5_Sub1 method153(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static6.aByteArray4.length < this.anInt159) {
			Static6.aByteArray4 = new byte[this.anInt159 + 100];
		}
		return this.method173(arg0, Static6.aClass5_Sub1_Sub1_1, Static6.aByteArray4);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		if (!this.aBoolean7) {
			this.method175();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!wh;ILclient!wh;I[I)V")
	@Override
	public void method169(@OriginalArg(0) Class1_Sub2_Sub25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub25 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method170(arg0, arg1);
			return;
		}
		@Pc(18) Class8 local18 = arg0.aClass8Array1[arg1];
		@Pc(23) Class8 local23 = arg2.aClass8Array1[arg3];
		@Pc(26) Class1_Sub17 local26 = local18.aClass1_Sub17_1;
		Static6.anInt162 = 0;
		Static6.anInt163 = 0;
		Static6.anInt161 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt268; local41++) {
			@Pc(47) short local47 = local18.aShortArray10[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray223[local47] == 0) {
				if (local18.aShortArray5[local41] != -1) {
					this.method182(0, local26.anIntArrayArray20[local18.aShortArray5[local41]], 0, 0, 0);
				}
				this.method182(local26.anIntArray223[local47], local26.anIntArrayArray20[local47], local18.aShortArray8[local41], local18.aShortArray12[local41], local18.aShortArray9[local41]);
			}
		}
		Static6.anInt162 = 0;
		Static6.anInt163 = 0;
		Static6.anInt161 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt268; local125++) {
			@Pc(131) short local131 = local23.aShortArray10[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray223[local131] == 0) {
				if (local23.aShortArray5[local125] != -1) {
					this.method182(0, local26.anIntArrayArray20[local23.aShortArray5[local125]], 0, 0, 0);
				}
				this.method182(local26.anIntArray223[local131], local26.anIntArrayArray20[local131], local23.aShortArray8[local125], local23.aShortArray12[local125], local23.aShortArray9[local125]);
			}
		}
		this.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[IIII)V")
	private void method182(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static6.anInt162 = 0;
			Static6.anInt163 = 0;
			Static6.anInt161 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray2.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray2[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static6.anInt162 += this.anIntArray8[local36];
						Static6.anInt163 += this.anIntArray7[local36];
						Static6.anInt161 += this.anIntArray11[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static6.anInt162 = Static6.anInt162 / local6 + arg2;
				Static6.anInt163 = Static6.anInt163 / local6 + arg3;
				Static6.anInt161 = Static6.anInt161 / local6 + arg4;
			} else {
				Static6.anInt162 = arg2;
				Static6.anInt163 = arg3;
				Static6.anInt161 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local115 = this.anIntArrayArray2[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray8[local31] += arg2;
						this.anIntArray7[local31] += arg3;
						this.anIntArray11[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local115 = this.anIntArrayArray2[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray8[local31] -= Static6.anInt162;
						this.anIntArray7[local31] -= Static6.anInt163;
						this.anIntArray11[local31] -= Static6.anInt161;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg4];
							local217 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg4];
							local235 = this.anIntArray7[local31] * local36 + this.anIntArray8[local31] * local217 + 32767 >> 16;
							this.anIntArray7[local31] = this.anIntArray7[local31] * local217 + 32767 - this.anIntArray8[local31] * local36 >> 16;
							this.anIntArray8[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg2];
							local217 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg2];
							local235 = this.anIntArray7[local31] * local217 + 32767 - this.anIntArray11[local31] * local36 >> 16;
							this.anIntArray11[local31] = this.anIntArray7[local31] * local36 + this.anIntArray11[local31] * local217 + 32767 >> 16;
							this.anIntArray7[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg3];
							local217 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg3];
							local235 = this.anIntArray11[local31] * local36 + this.anIntArray8[local31] * local217 + 32767 >> 16;
							this.anIntArray11[local31] = this.anIntArray11[local31] * local217 + 32767 - this.anIntArray8[local31] * local36 >> 16;
							this.anIntArray8[local31] = local235;
						}
						this.anIntArray8[local31] += Static6.anInt162;
						this.anIntArray7[local31] += Static6.anInt163;
						this.anIntArray11[local31] += Static6.anInt161;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local115 = this.anIntArrayArray2[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray8[local31] -= Static6.anInt162;
						this.anIntArray7[local31] -= Static6.anInt163;
						this.anIntArray11[local31] -= Static6.anInt161;
						this.anIntArray8[local31] = this.anIntArray8[local31] * arg2 / 128;
						this.anIntArray7[local31] = this.anIntArray7[local31] * arg3 / 128;
						this.anIntArray11[local31] = this.anIntArray11[local31] * arg4 / 128;
						this.anIntArray8[local31] += Static6.anInt162;
						this.anIntArray7[local31] += Static6.anInt163;
						this.anIntArray11[local31] += Static6.anInt161;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray3 != null && this.aByteArray2 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray3.length) {
					local115 = this.anIntArrayArray3[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray2[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray2[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([[IIIIZI)Lclient!ae;")
	public Class5_Sub1_Sub1 method183(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!this.aBoolean7) {
			this.method175();
		}
		@Pc(9) int local9 = arg1 + this.aShort2;
		@Pc(14) int local14 = arg1 + this.aShort5;
		@Pc(19) int local19 = arg3 + this.aShort1;
		@Pc(24) int local24 = arg3 + this.aShort7;
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
		@Pc(104) Class5_Sub1_Sub1 local104;
		if (arg4) {
			local104 = new Class5_Sub1_Sub1();
			local104.anInt160 = this.anInt160;
			local104.anInt159 = this.anInt159;
			local104.anInt158 = this.anInt158;
			local104.anIntArray8 = this.anIntArray8;
			local104.anIntArray11 = this.anIntArray11;
			local104.anIntArray10 = this.anIntArray10;
			local104.anIntArray6 = this.anIntArray6;
			local104.anIntArray13 = this.anIntArray13;
			local104.anIntArray15 = this.anIntArray15;
			local104.anIntArray16 = this.anIntArray16;
			local104.anIntArray12 = this.anIntArray12;
			local104.aByteArray1 = this.aByteArray1;
			local104.aByteArray2 = this.aByteArray2;
			local104.aByteArray3 = this.aByteArray3;
			local104.aShortArray3 = this.aShortArray3;
			local104.aByte2 = this.aByte2;
			local104.anIntArray14 = this.anIntArray14;
			local104.anIntArray17 = this.anIntArray17;
			local104.anIntArray9 = this.anIntArray9;
			local104.anIntArrayArray2 = this.anIntArrayArray2;
			local104.anIntArrayArray3 = this.anIntArrayArray3;
			local104.aBoolean6 = super.aBoolean6;
			local104.anIntArray7 = new int[local104.anInt160];
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
			for (local204 = 0; local204 < local104.anInt160; local204++) {
				local212 = this.anIntArray8[local204] + arg1;
				local219 = this.anIntArray11[local204] + arg3;
				local223 = local212 & 0x7F;
				local227 = local219 & 0x7F;
				local231 = local212 >> 7;
				local235 = local219 >> 7;
				local257 = arg0[local231][local235] * (128 - local223) + arg0[local231 + 1][local235] * local223 >> 7;
				local283 = arg0[local231][local235 + 1] * (128 - local223) + arg0[local231 + 1][local235 + 1] * local223 >> 7;
				local295 = local257 * (128 - local227) + local283 * local227 >> 7;
				local104.anIntArray7[local204] = this.anIntArray7[local204] + local295 - arg2;
			}
		} else {
			for (local204 = 0; local204 < local104.anInt160; local204++) {
				local212 = (this.anIntArray7[local204] << 16) / this.aShort8;
				if (local212 < arg5) {
					local219 = this.anIntArray8[local204] + arg1;
					local223 = this.anIntArray11[local204] + arg3;
					local227 = local219 & 0x7F;
					local231 = local223 & 0x7F;
					local235 = local219 >> 7;
					local257 = local223 >> 7;
					local283 = arg0[local235][local257] * (128 - local227) + arg0[local235 + 1][local257] * local227 >> 7;
					local295 = arg0[local235][local257 + 1] * (128 - local227) + arg0[local235 + 1][local257 + 1] * local227 >> 7;
					@Pc(419) int local419 = local283 * (128 - local231) + local295 * local231 >> 7;
					local104.anIntArray7[local204] = this.anIntArray7[local204] + (local419 - arg2) * (arg5 - local212) / arg5;
				} else {
					local104.anIntArray7[local204] = this.anIntArray7[local204];
				}
			}
		}
		local104.aBoolean7 = false;
		return local104;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lclient!lg;")
	@Override
	public Class5_Sub1 method162(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static6.aByteArray5.length < this.anInt159) {
			Static6.aByteArray5 = new byte[this.anInt159 + 100];
		}
		return this.method173(arg0, Static6.aClass5_Sub1_Sub1_2, Static6.aByteArray5);
	}
}
