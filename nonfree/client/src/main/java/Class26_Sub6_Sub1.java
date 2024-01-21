import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class26_Sub6_Sub1 extends Class26_Sub6 {

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
	private int anInt3421 = 0;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
	public int anInt3422 = 0;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
	private int anInt3426 = 0;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class26_Sub6_Sub1() {
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!md;IIIII)V")
	public Class26_Sub6_Sub1(@OriginalArg(0) Class26_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1801();
		arg0.method1795();
		this.anInt3422 = arg0.anInt2512;
		this.anIntArray261 = arg0.anIntArray165;
		this.anIntArray266 = arg0.anIntArray170;
		this.anIntArray258 = arg0.anIntArray175;
		this.anInt3421 = arg0.anInt2509;
		this.anIntArray256 = arg0.anIntArray173;
		this.anIntArray265 = arg0.anIntArray174;
		this.anIntArray257 = arg0.anIntArray172;
		this.aByteArray42 = arg0.aByteArray21;
		this.aByteArray40 = arg0.aByteArray25;
		this.aByte12 = arg0.aByte11;
		this.anIntArrayArray27 = arg0.anIntArrayArray20;
		this.anIntArrayArray26 = arg0.anIntArrayArray19;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray259 = new int[this.anInt3421];
		this.anIntArray262 = new int[this.anInt3421];
		this.anIntArray263 = new int[this.anInt3421];
		@Pc(118) int local118;
		if (arg0.aShortArray32 == null) {
			this.aShortArray58 = null;
		} else {
			this.aShortArray58 = new short[this.anInt3421];
			for (local118 = 0; local118 < this.anInt3421; local118++) {
				@Pc(124) short local124 = arg0.aShortArray32[local118];
				if (local124 != -1 && Static177.anInterface1_7.method564(local124)) {
					this.aShortArray58[local118] = local124;
				} else {
					this.aShortArray58[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt2511 > 0 && arg0.aByteArray23 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt2511];
			for (@Pc(164) int local164 = 0; local164 < this.anInt3421; local164++) {
				if (arg0.aByteArray23[local164] != -1) {
					local162[arg0.aByteArray23[local164] & 0xFF]++;
				}
			}
			this.anInt3426 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt2511; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray27[local193] == 0) {
					this.anInt3426++;
				}
			}
			this.anIntArray260 = new int[this.anInt3426];
			this.anIntArray264 = new int[this.anInt3426];
			this.anIntArray267 = new int[this.anInt3426];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt2511; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray27[local233] == 0) {
					this.anIntArray260[local231] = arg0.aShortArray34[local233] & 0xFFFF;
					this.anIntArray264[local231] = arg0.aShortArray39[local233] & 0xFFFF;
					this.anIntArray267[local231] = arg0.aShortArray36[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray39 = new byte[this.anInt3421];
			for (local295 = 0; local295 < this.anInt3421; local295++) {
				if (arg0.aByteArray23[local295] == -1) {
					this.aByteArray39[local295] = -1;
				} else {
					this.aByteArray39[local295] = (byte) local162[arg0.aByteArray23[local295] & 0xFF];
					if (this.aByteArray39[local295] == -1 && this.aShortArray58 != null) {
						this.aShortArray58[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt3421; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray26 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray26[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray25 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray25[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray58 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray58[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class21 local417;
			@Pc(578) Class54 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray35[local118] & 0xFFFF;
					if (arg0.aClass21Array1 == null || arg0.aClass21Array1[this.anIntArray256[local118]] == null) {
						local417 = arg0.aClass21Array2[this.anIntArray256[local118]];
					} else {
						local417 = arg0.aClass21Array1[this.anIntArray256[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt717 + arg4 * local417.anInt716 + arg5 * local417.anInt723) / (local93 * local417.anInt720);
					this.anIntArray259[local118] = Static168.method2550(local398, local295);
					if (arg0.aClass21Array1 == null || arg0.aClass21Array1[this.anIntArray265[local118]] == null) {
						local417 = arg0.aClass21Array2[this.anIntArray265[local118]];
					} else {
						local417 = arg0.aClass21Array1[this.anIntArray265[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt717 + arg4 * local417.anInt716 + arg5 * local417.anInt723) / (local93 * local417.anInt720);
					this.anIntArray262[local118] = Static168.method2550(local398, local295);
					if (arg0.aClass21Array1 == null || arg0.aClass21Array1[this.anIntArray257[local118]] == null) {
						local417 = arg0.aClass21Array2[this.anIntArray257[local118]];
					} else {
						local417 = arg0.aClass21Array1[this.anIntArray257[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt717 + arg4 * local417.anInt716 + arg5 * local417.anInt723) / (local93 * local417.anInt720);
					this.anIntArray263[local118] = Static168.method2550(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass54Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt2258 + arg4 * local578.anInt2260 + arg5 * local578.anInt2259) / (local93 + local93 / 2);
					this.anIntArray259[local118] = Static168.method2550(arg0.aShortArray35[local118] & 0xFFFF, local295);
					this.anIntArray263[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray259[local118] = 128;
					this.anIntArray263[local118] = -1;
				} else {
					this.anIntArray263[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass21Array1 == null || arg0.aClass21Array1[this.anIntArray256[local118]] == null) {
					local417 = arg0.aClass21Array2[this.anIntArray256[local118]];
				} else {
					local417 = arg0.aClass21Array1[this.anIntArray256[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt717 + arg4 * local417.anInt716 + arg5 * local417.anInt723) / (local93 * local417.anInt720);
				this.anIntArray259[local118] = Static168.method2544(local295);
				if (arg0.aClass21Array1 == null || arg0.aClass21Array1[this.anIntArray265[local118]] == null) {
					local417 = arg0.aClass21Array2[this.anIntArray265[local118]];
				} else {
					local417 = arg0.aClass21Array1[this.anIntArray265[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt717 + arg4 * local417.anInt716 + arg5 * local417.anInt723) / (local93 * local417.anInt720);
				this.anIntArray262[local118] = Static168.method2544(local295);
				if (arg0.aClass21Array1 == null || arg0.aClass21Array1[this.anIntArray257[local118]] == null) {
					local417 = arg0.aClass21Array2[this.anIntArray257[local118]];
				} else {
					local417 = arg0.aClass21Array1[this.anIntArray257[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt717 + arg4 * local417.anInt716 + arg5 * local417.anInt723) / (local93 * local417.anInt720);
				this.anIntArray263[local118] = Static168.method2544(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass54Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt2258 + arg4 * local578.anInt2260 + arg5 * local578.anInt2259) / (local93 + local93 / 2);
				this.anIntArray259[local118] = Static168.method2544(local295);
				this.anIntArray263[local118] = -1;
			} else {
				this.anIntArray263[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([Lclient!rh;I)V")
	private Class26_Sub6_Sub1(@OriginalArg(0) Class26_Sub6_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt3422 = 0;
		this.anInt3421 = 0;
		this.anInt3426 = 0;
		this.aByte12 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class26_Sub6_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt3422 += local43.anInt3422;
				this.anInt3421 += local43.anInt3421;
				this.anInt3426 += local43.anInt3426;
				if (local43.aByteArray42 == null) {
					if (this.aByte12 == -1) {
						this.aByte12 = local43.aByte12;
					}
					if (this.aByte12 != local43.aByte12) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray40 != null;
				local22 |= local43.aShortArray58 != null;
				local24 |= local43.aByteArray39 != null;
			}
		}
		this.anIntArray261 = new int[this.anInt3422];
		this.anIntArray266 = new int[this.anInt3422];
		this.anIntArray258 = new int[this.anInt3422];
		this.anIntArray256 = new int[this.anInt3421];
		this.anIntArray265 = new int[this.anInt3421];
		this.anIntArray257 = new int[this.anInt3421];
		this.anIntArray259 = new int[this.anInt3421];
		this.anIntArray262 = new int[this.anInt3421];
		this.anIntArray263 = new int[this.anInt3421];
		if (local18) {
			this.aByteArray42 = new byte[this.anInt3421];
		}
		if (local20) {
			this.aByteArray40 = new byte[this.anInt3421];
		}
		if (local22) {
			this.aShortArray58 = new short[this.anInt3421];
		}
		if (local24) {
			this.aByteArray39 = new byte[this.anInt3421];
		}
		if (this.anInt3426 > 0) {
			this.anIntArray260 = new int[this.anInt3426];
			this.anIntArray264 = new int[this.anInt3426];
			this.anIntArray267 = new int[this.anInt3426];
		}
		this.anInt3422 = 0;
		this.anInt3421 = 0;
		this.anInt3426 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class26_Sub6_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt3421; local229++) {
					this.anIntArray256[this.anInt3421] = local225.anIntArray256[local229] + this.anInt3422;
					this.anIntArray265[this.anInt3421] = local225.anIntArray265[local229] + this.anInt3422;
					this.anIntArray257[this.anInt3421] = local225.anIntArray257[local229] + this.anInt3422;
					this.anIntArray259[this.anInt3421] = local225.anIntArray259[local229];
					this.anIntArray262[this.anInt3421] = local225.anIntArray262[local229];
					this.anIntArray263[this.anInt3421] = local225.anIntArray263[local229];
					if (local18) {
						if (local225.aByteArray42 == null) {
							this.aByteArray42[this.anInt3421] = local225.aByte12;
						} else {
							this.aByteArray42[this.anInt3421] = local225.aByteArray42[local229];
						}
					}
					if (local20 && local225.aByteArray40 != null) {
						this.aByteArray40[this.anInt3421] = local225.aByteArray40[local229];
					}
					if (local22) {
						if (local225.aShortArray58 == null) {
							this.aShortArray58[this.anInt3421] = -1;
						} else {
							this.aShortArray58[this.anInt3421] = local225.aShortArray58[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray39 == null || local225.aByteArray39[local229] == -1) {
							this.aByteArray39[this.anInt3421] = -1;
						} else {
							this.aByteArray39[this.anInt3421] = (byte) (local225.aByteArray39[local229] + this.anInt3426);
						}
					}
					this.anInt3421++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt3426; local394++) {
					this.anIntArray260[this.anInt3426] = local225.anIntArray260[local394] + this.anInt3422;
					this.anIntArray264[this.anInt3426] = local225.anIntArray264[local394] + this.anInt3422;
					this.anIntArray267[this.anInt3426] = local225.anIntArray267[local394] + this.anInt3422;
					this.anInt3426++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt3422; local444++) {
					this.anIntArray261[this.anInt3422] = local225.anIntArray261[local444];
					this.anIntArray266[this.anInt3422] = local225.anIntArray266[local444];
					this.anIntArray258[this.anInt3422] = local225.anIntArray258[local444];
					this.anInt3422++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	@Override
	public void method2532(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
		@Pc(7) int local7 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3422; local9++) {
			@Pc(26) int local26 = this.anIntArray266[local9] * local7 - this.anIntArray258[local9] * local3 >> 16;
			this.anIntArray258[local9] = this.anIntArray266[local9] * local3 + this.anIntArray258[local9] * local7 >> 16;
			this.anIntArray266[local9] = local26;
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	private void method2540(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static177.anInt3609;
		@Pc(3) int local3 = Static177.anInt3610;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray256[arg0];
		@Pc(15) int local15 = this.anIntArray265[arg0];
		@Pc(20) int local20 = this.anIntArray257[arg0];
		@Pc(24) int local24 = Static168.anIntArray281[local10];
		@Pc(28) int local28 = Static168.anIntArray281[local15];
		@Pc(32) int local32 = Static168.anIntArray281[local20];
		if (this.aByteArray40 == null) {
			Static177.anInt3611 = 0;
		} else {
			Static177.anInt3611 = this.aByteArray40[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static168.anIntArray269[0] = Static168.anIntArray273[local10];
			Static168.anIntArray271[0] = Static168.anIntArray274[local10];
			local5++;
			Static168.anIntArray280[0] = this.anIntArray259[arg0];
		} else {
			local73 = Static168.anIntArray272[local10];
			local77 = Static168.anIntArray278[local10];
			local82 = this.anIntArray259[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class3_Sub3_Sub2_Sub5.anIntArray304[local32 - local24];
				Static168.anIntArray269[0] = local1 + (local73 + ((Static168.anIntArray272[local20] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray271[0] = local3 + (local77 + ((Static168.anIntArray278[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static168.anIntArray280[0] = local82 + ((this.anIntArray263[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class3_Sub3_Sub2_Sub5.anIntArray304[local28 - local24];
				Static168.anIntArray269[local5] = local1 + (local73 + ((Static168.anIntArray272[local15] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray271[local5] = local3 + (local77 + ((Static168.anIntArray278[local15] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray280[local5++] = local82 + ((this.anIntArray262[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static168.anIntArray269[local5] = Static168.anIntArray273[local15];
			Static168.anIntArray271[local5] = Static168.anIntArray274[local15];
			Static168.anIntArray280[local5++] = this.anIntArray262[arg0];
		} else {
			local73 = Static168.anIntArray272[local15];
			local77 = Static168.anIntArray278[local15];
			local82 = this.anIntArray262[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class3_Sub3_Sub2_Sub5.anIntArray304[local24 - local28];
				Static168.anIntArray269[local5] = local1 + (local73 + ((Static168.anIntArray272[local10] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray271[local5] = local3 + (local77 + ((Static168.anIntArray278[local10] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray280[local5++] = local82 + ((this.anIntArray259[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class3_Sub3_Sub2_Sub5.anIntArray304[local32 - local28];
				Static168.anIntArray269[local5] = local1 + (local73 + ((Static168.anIntArray272[local20] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray271[local5] = local3 + (local77 + ((Static168.anIntArray278[local20] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray280[local5++] = local82 + ((this.anIntArray263[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static168.anIntArray269[local5] = Static168.anIntArray273[local20];
			Static168.anIntArray271[local5] = Static168.anIntArray274[local20];
			Static168.anIntArray280[local5++] = this.anIntArray263[arg0];
		} else {
			local73 = Static168.anIntArray272[local20];
			local77 = Static168.anIntArray278[local20];
			local82 = this.anIntArray263[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class3_Sub3_Sub2_Sub5.anIntArray304[local28 - local32];
				Static168.anIntArray269[local5] = local1 + (local73 + ((Static168.anIntArray272[local15] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray271[local5] = local3 + (local77 + ((Static168.anIntArray278[local15] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray280[local5++] = local82 + ((this.anIntArray262[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class3_Sub3_Sub2_Sub5.anIntArray304[local24 - local32];
				Static168.anIntArray269[local5] = local1 + (local73 + ((Static168.anIntArray272[local10] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray271[local5] = local3 + (local77 + ((Static168.anIntArray278[local10] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray280[local5++] = local82 + ((this.anIntArray259[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static168.anIntArray269[0];
		local77 = Static168.anIntArray269[1];
		local82 = Static168.anIntArray269[2];
		local95 = Static168.anIntArray271[0];
		@Pc(590) int local590 = Static168.anIntArray271[1];
		@Pc(594) int local594 = Static168.anIntArray271[2];
		Static177.aBoolean160 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static177.anInt3612 || local77 > Static177.anInt3612 || local82 > Static177.anInt3612) {
				Static177.aBoolean160 = true;
			}
			if (this.aShortArray58 != null && this.aShortArray58[arg0] != -1) {
				if (this.aByteArray39 == null || this.aByteArray39[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray39[arg0] & 0xFF;
					local683 = this.anIntArray260[local678];
					local688 = this.anIntArray264[local678];
					local693 = this.anIntArray267[local678];
				}
				if (this.anIntArray263[arg0] == -1) {
					Static177.method2784(local95, local590, local594, local73, local77, local82, this.anIntArray259[arg0], this.anIntArray259[arg0], this.anIntArray259[arg0], Static168.anIntArray272[local683], Static168.anIntArray272[local688], Static168.anIntArray272[local693], Static168.anIntArray278[local683], Static168.anIntArray278[local688], Static168.anIntArray278[local693], Static168.anIntArray281[local683], Static168.anIntArray281[local688], Static168.anIntArray281[local693], this.aShortArray58[arg0]);
				} else {
					Static177.method2784(local95, local590, local594, local73, local77, local82, Static168.anIntArray280[0], Static168.anIntArray280[1], Static168.anIntArray280[2], Static168.anIntArray272[local683], Static168.anIntArray272[local688], Static168.anIntArray272[local693], Static168.anIntArray278[local683], Static168.anIntArray278[local688], Static168.anIntArray278[local693], Static168.anIntArray281[local683], Static168.anIntArray281[local688], Static168.anIntArray281[local693], this.aShortArray58[arg0]);
				}
			} else if (this.anIntArray263[arg0] == -1) {
				Static177.method2782(local95, local590, local594, local73, local77, local82, Static177.anIntArray299[this.anIntArray259[arg0]]);
			} else {
				Static177.method2785(local95, local590, local594, local73, local77, local82, Static168.anIntArray280[0], Static168.anIntArray280[1], Static168.anIntArray280[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static177.anInt3612 || local77 > Static177.anInt3612 || local82 > Static177.anInt3612 || Static168.anIntArray269[3] < 0 || Static168.anIntArray269[3] > Static177.anInt3612) {
			Static177.aBoolean160 = true;
		}
		if (this.aShortArray58 == null || this.aShortArray58[arg0] == -1) {
			if (this.anIntArray263[arg0] == -1) {
				local683 = Static177.anIntArray299[this.anIntArray259[arg0]];
				Static177.method2782(local95, local590, local594, local73, local77, local82, local683);
				Static177.method2782(local95, local594, Static168.anIntArray271[3], local73, local82, Static168.anIntArray269[3], local683);
				return;
			}
			Static177.method2785(local95, local590, local594, local73, local77, local82, Static168.anIntArray280[0], Static168.anIntArray280[1], Static168.anIntArray280[2]);
			Static177.method2785(local95, local594, Static168.anIntArray271[3], local73, local82, Static168.anIntArray269[3], Static168.anIntArray280[0], Static168.anIntArray280[2], Static168.anIntArray280[3]);
			return;
		}
		if (this.aByteArray39 == null || this.aByteArray39[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray39[arg0] & 0xFF;
			local683 = this.anIntArray260[local678];
			local688 = this.anIntArray264[local678];
			local693 = this.anIntArray267[local678];
		}
		@Pc(956) short local956 = this.aShortArray58[arg0];
		if (this.anIntArray263[arg0] == -1) {
			Static177.method2784(local95, local590, local594, local73, local77, local82, this.anIntArray259[arg0], this.anIntArray259[arg0], this.anIntArray259[arg0], Static168.anIntArray272[local683], Static168.anIntArray272[local688], Static168.anIntArray272[local693], Static168.anIntArray278[local683], Static168.anIntArray278[local688], Static168.anIntArray278[local693], Static168.anIntArray281[local683], Static168.anIntArray281[local688], Static168.anIntArray281[local693], local956);
			Static177.method2784(local95, local594, Static168.anIntArray271[3], local73, local82, Static168.anIntArray269[3], this.anIntArray259[arg0], this.anIntArray259[arg0], this.anIntArray259[arg0], Static168.anIntArray272[local683], Static168.anIntArray272[local688], Static168.anIntArray272[local693], Static168.anIntArray278[local683], Static168.anIntArray278[local688], Static168.anIntArray278[local693], Static168.anIntArray281[local683], Static168.anIntArray281[local688], Static168.anIntArray281[local693], local956);
			return;
		}
		Static177.method2784(local95, local590, local594, local73, local77, local82, Static168.anIntArray280[0], Static168.anIntArray280[1], Static168.anIntArray280[2], Static168.anIntArray272[local683], Static168.anIntArray272[local688], Static168.anIntArray272[local693], Static168.anIntArray278[local683], Static168.anIntArray278[local688], Static168.anIntArray278[local693], Static168.anIntArray281[local683], Static168.anIntArray281[local688], Static168.anIntArray281[local693], local956);
		Static177.method2784(local95, local594, Static168.anIntArray271[3], local73, local82, Static168.anIntArray269[3], Static168.anIntArray280[0], Static168.anIntArray280[2], Static168.anIntArray280[3], Static168.anIntArray272[local683], Static168.anIntArray272[local688], Static168.anIntArray272[local693], Static168.anIntArray278[local683], Static168.anIntArray278[local688], Static168.anIntArray278[local693], Static168.anIntArray281[local683], Static168.anIntArray281[local688], Static168.anIntArray281[local693], local956);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean155) {
			this.method2552();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort15 * arg2 + this.aShort13 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort15 * arg2 + this.aShort12 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort15 << 9;
		if (local78 / local38 <= Static163.anInt3325) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort15 << 9;
		if (local91 / local38 >= Static205.anInt4176) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort15 * arg1 + this.aShort13 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static192.anInt3907) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort15 * arg1 + this.aShort12 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static8.anInt190) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt3426 > 0;
		@Pc(172) int local172 = Static177.anInt3609;
		@Pc(174) int local174 = Static177.anInt3610;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
			local178 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static58.aBoolean78 && local57 > 0) {
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
			if (Static25.anInt541 >= local204 && Static25.anInt541 <= local208 && Static207.anInt4208 >= local223 && Static207.anInt4208 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort18, this.aShort11, this.aShort18, this.aShort11, this.aShort18, this.aShort11, this.aShort18, this.aShort11 };
				@Pc(342) int[] local342 = new int[] { this.aShort16, this.aShort16, this.aShort14, this.aShort14, this.aShort16, this.aShort16, this.aShort14, this.aShort14 };
				@Pc(385) int[] local385 = new int[] { this.aShort12, this.aShort12, this.aShort12, this.aShort12, this.aShort13, this.aShort13, this.aShort13, this.aShort13 };
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
				if (Static25.anInt541 >= local204 && Static25.anInt541 <= local208 && Static207.anInt4208 >= local223 && Static207.anInt4208 <= local227) {
					if (super.aBoolean154) {
						Static111.aLongArray4[Static126.anInt2490++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt3422; local204++) {
			local223 = this.anIntArray261[local204];
			local208 = this.anIntArray266[local204];
			local227 = this.anIntArray258[local204];
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
			Static168.anIntArray276[local204] = local227 - local24;
			if (local227 >= 50) {
				Static168.anIntArray273[local204] = local172 + (local223 << 9) / local227;
				Static168.anIntArray274[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static168.anIntArray273[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static168.anIntArray272[local204] = local223;
				Static168.anIntArray278[local204] = local574;
				Static168.anIntArray281[local204] = local227;
			}
		}
		try {
			this.method2543(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		if (!this.aBoolean155) {
			this.method2552();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[IIII)V")
	private void method2541(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static168.anInt3424 = 0;
			Static168.anInt3423 = 0;
			Static168.anInt3425 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray27.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray27[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static168.anInt3424 += this.anIntArray261[local36];
						Static168.anInt3423 += this.anIntArray266[local36];
						Static168.anInt3425 += this.anIntArray258[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static168.anInt3424 = Static168.anInt3424 / local6 + arg2;
				Static168.anInt3423 = Static168.anInt3423 / local6 + arg3;
				Static168.anInt3425 = Static168.anInt3425 / local6 + arg4;
			} else {
				Static168.anInt3424 = arg2;
				Static168.anInt3423 = arg3;
				Static168.anInt3425 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray261[local31] += arg2;
						this.anIntArray266[local31] += arg3;
						this.anIntArray258[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray261[local31] -= Static168.anInt3424;
						this.anIntArray266[local31] -= Static168.anInt3423;
						this.anIntArray258[local31] -= Static168.anInt3425;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg4];
							local217 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg4];
							local235 = this.anIntArray266[local31] * local36 + this.anIntArray261[local31] * local217 + 32767 >> 16;
							this.anIntArray266[local31] = this.anIntArray266[local31] * local217 + 32767 - this.anIntArray261[local31] * local36 >> 16;
							this.anIntArray261[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg2];
							local217 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg2];
							local235 = this.anIntArray266[local31] * local217 + 32767 - this.anIntArray258[local31] * local36 >> 16;
							this.anIntArray258[local31] = this.anIntArray266[local31] * local36 + this.anIntArray258[local31] * local217 + 32767 >> 16;
							this.anIntArray266[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg3];
							local217 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg3];
							local235 = this.anIntArray258[local31] * local36 + this.anIntArray261[local31] * local217 + 32767 >> 16;
							this.anIntArray258[local31] = this.anIntArray258[local31] * local217 + 32767 - this.anIntArray261[local31] * local36 >> 16;
							this.anIntArray261[local31] = local235;
						}
						this.anIntArray261[local31] += Static168.anInt3424;
						this.anIntArray266[local31] += Static168.anInt3423;
						this.anIntArray258[local31] += Static168.anInt3425;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray261[local31] -= Static168.anInt3424;
						this.anIntArray266[local31] -= Static168.anInt3423;
						this.anIntArray258[local31] -= Static168.anInt3425;
						this.anIntArray261[local31] = this.anIntArray261[local31] * arg2 / 128;
						this.anIntArray266[local31] = this.anIntArray266[local31] * arg3 / 128;
						this.anIntArray258[local31] = this.anIntArray258[local31] * arg4 / 128;
						this.anIntArray261[local31] += Static168.anInt3424;
						this.anIntArray266[local31] += Static168.anInt3423;
						this.anIntArray258[local31] += Static168.anInt3425;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray26 != null && this.aByteArray40 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray40[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray40[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	@Override
	public void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3422; local1++) {
			this.anIntArray261[local1] += arg0;
			this.anIntArray266[local1] += arg1;
			this.anIntArray258[local1] += arg2;
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZZJII)V")
	private void method2543(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static168.anIntArray275[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt3421; local16++) {
			if (this.anIntArray263[local16] != -2) {
				local28 = this.anIntArray256[local16];
				local33 = this.anIntArray265[local16];
				local38 = this.anIntArray257[local16];
				local42 = Static168.anIntArray273[local28];
				local46 = Static168.anIntArray273[local33];
				local50 = Static168.anIntArray273[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static168.anIntArray272[local28];
					local69 = Static168.anIntArray272[local33];
					@Pc(73) int local73 = Static168.anIntArray272[local38];
					@Pc(77) int local77 = Static168.anIntArray278[local28];
					local81 = Static168.anIntArray278[local33];
					local85 = Static168.anIntArray278[local38];
					@Pc(89) int local89 = Static168.anIntArray281[local28];
					local93 = Static168.anIntArray281[local33];
					@Pc(97) int local97 = Static168.anIntArray281[local38];
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
						Static168.aBooleanArray16[local16] = true;
						@Pc(177) int local177 = (Static168.anIntArray276[local28] + Static168.anIntArray276[local33] + Static168.anIntArray276[local38]) / 3 + arg3;
						Static168.anIntArrayArray29[local177][Static168.anIntArray275[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method2547(Static25.anInt541 + Static177.anInt3609, Static207.anInt4208 + Static177.anInt3610, Static168.anIntArray274[local28], Static168.anIntArray274[local33], Static168.anIntArray274[local38], local42, local46, local50)) {
						Static111.aLongArray4[Static126.anInt2490++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static168.anIntArray274[local38] - Static168.anIntArray274[local33]) - (Static168.anIntArray274[local28] - Static168.anIntArray274[local33]) * (local50 - local46) > 0) {
						Static168.aBooleanArray16[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static177.anInt3612 && local46 <= Static177.anInt3612 && local50 <= Static177.anInt3612) {
							Static168.aBooleanArray15[local16] = false;
						} else {
							Static168.aBooleanArray15[local16] = true;
						}
						local65 = (Static168.anIntArray276[local28] + Static168.anIntArray276[local33] + Static168.anIntArray276[local38]) / 3 + arg3;
						Static168.anIntArrayArray29[local65][Static168.anIntArray275[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray42 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static168.anIntArray275[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static168.anIntArrayArray29[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method2551(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static168.anIntArray279[local28] = 0;
			Static168.anIntArray270[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static168.anIntArray275[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static168.anIntArrayArray29[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray42[local50];
					local69 = Static168.anIntArray279[local386]++;
					Static168.anIntArrayArray28[local386][local69] = local50;
					if (local386 < 10) {
						Static168.anIntArray270[local386] += local33;
					} else if (local386 == 10) {
						Static168.anIntArray268[local69] = local33;
					} else {
						Static168.anIntArray277[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static168.anIntArray279[1] > 0 || Static168.anIntArray279[2] > 0) {
			local38 = (Static168.anIntArray270[1] + Static168.anIntArray270[2]) / (Static168.anIntArray279[1] + Static168.anIntArray279[2]);
		}
		local42 = 0;
		if (Static168.anIntArray279[3] > 0 || Static168.anIntArray279[4] > 0) {
			local42 = (Static168.anIntArray270[3] + Static168.anIntArray270[4]) / (Static168.anIntArray279[3] + Static168.anIntArray279[4]);
		}
		local46 = 0;
		if (Static168.anIntArray279[6] > 0 || Static168.anIntArray279[8] > 0) {
			local46 = (Static168.anIntArray270[6] + Static168.anIntArray270[8]) / (Static168.anIntArray279[6] + Static168.anIntArray279[8]);
		}
		local65 = 0;
		local69 = Static168.anIntArray279[10];
		@Pc(519) int[] local519 = Static168.anIntArrayArray28[10];
		@Pc(521) int[] local521 = Static168.anIntArray268;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static168.anIntArray279[11];
			local519 = Static168.anIntArrayArray28[11];
			local521 = Static168.anIntArray277;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method2551(local519[local65++]);
				if (local65 == local69 && local519 != Static168.anIntArrayArray28[11]) {
					local65 = 0;
					local69 = Static168.anIntArray279[11];
					local519 = Static168.anIntArrayArray28[11];
					local521 = Static168.anIntArray277;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method2551(local519[local65++]);
				if (local65 == local69 && local519 != Static168.anIntArrayArray28[11]) {
					local65 = 0;
					local69 = Static168.anIntArray279[11];
					local519 = Static168.anIntArrayArray28[11];
					local521 = Static168.anIntArray277;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method2551(local519[local65++]);
				if (local65 == local69 && local519 != Static168.anIntArrayArray28[11]) {
					local65 = 0;
					local69 = Static168.anIntArray279[11];
					local519 = Static168.anIntArrayArray28[11];
					local521 = Static168.anIntArray277;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static168.anIntArray279[local81];
			@Pc(684) int[] local684 = Static168.anIntArrayArray28[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method2551(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method2551(local519[local65++]);
			if (local65 == local69 && local519 != Static168.anIntArrayArray28[11]) {
				local65 = 0;
				local519 = Static168.anIntArrayArray28[11];
				local69 = Static168.anIntArray279[11];
				local521 = Static168.anIntArray277;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean155) {
				this.method2552();
			}
			@Pc(6) int local6 = Static177.anInt3609;
			@Pc(8) int local8 = Static177.anInt3610;
			@Pc(12) int local12 = Class3_Sub3_Sub2_Sub5.anIntArray300[0];
			@Pc(16) int local16 = Class3_Sub3_Sub2_Sub5.anIntArray303[0];
			@Pc(20) int local20 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
			@Pc(24) int local24 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
			@Pc(28) int local28 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg1];
			@Pc(32) int local32 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg1];
			@Pc(36) int local36 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg2];
			@Pc(40) int local40 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3422; local52++) {
				@Pc(58) int local58 = this.anIntArray261[local52];
				@Pc(63) int local63 = this.anIntArray266[local52];
				@Pc(68) int local68 = this.anIntArray258[local52];
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
				Static168.anIntArray276[local52] = local68 - local50;
				Static168.anIntArray273[local52] = local6 + (local58 << 9) / local68;
				Static168.anIntArray274[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt3426 > 0) {
					Static168.anIntArray272[local52] = local58;
					Static168.anIntArray278[local52] = local80;
					Static168.anIntArray281[local52] = local68;
				}
			}
			this.method2543(false, false, 0L, this.aShort17, this.aShort17 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIII)V")
	public void method2545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean155) {
				this.method2552();
			}
			@Pc(6) int local6 = Static177.anInt3609;
			@Pc(8) int local8 = Static177.anInt3610;
			@Pc(12) int local12 = Class3_Sub3_Sub2_Sub5.anIntArray300[0];
			@Pc(16) int local16 = Class3_Sub3_Sub2_Sub5.anIntArray303[0];
			@Pc(20) int local20 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
			@Pc(24) int local24 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
			@Pc(28) int local28 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg1];
			@Pc(32) int local32 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg1];
			@Pc(36) int local36 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg2];
			@Pc(40) int local40 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3422; local52++) {
				@Pc(58) int local58 = this.anIntArray261[local52];
				@Pc(63) int local63 = this.anIntArray266[local52];
				@Pc(68) int local68 = this.anIntArray258[local52];
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
				Static168.anIntArray276[local52] = local68 - local50;
				Static168.anIntArray273[local52] = local6 + (local58 << 9) / arg6;
				Static168.anIntArray274[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt3426 > 0) {
					Static168.anIntArray272[local52] = local58;
					Static168.anIntArray278[local52] = local80;
					Static168.anIntArray281[local52] = local68;
				}
			}
			this.method2543(false, false, 0L, this.aShort17, this.aShort17 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "()I")
	@Override
	public int method2533() {
		if (!this.aBoolean155) {
			this.method2552();
		}
		return this.aShort11;
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "()V")
	@Override
	public void method2531() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3422; local1++) {
			@Pc(7) int local7 = this.anIntArray261[local1];
			this.anIntArray261[local1] = this.anIntArray258[local1];
			this.anIntArray258[local1] = -local7;
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(III)V")
	@Override
	public void method2536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3422; local1++) {
			this.anIntArray261[local1] = this.anIntArray261[local1] * arg0 / 128;
			this.anIntArray266[local1] = this.anIntArray266[local1] * arg1 / 128;
			this.anIntArray258[local1] = this.anIntArray258[local1] * arg2 / 128;
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "()I")
	@Override
	public int method2530() {
		if (!this.aBoolean155) {
			this.method2552();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLclient!rh;[B)Lclient!wa;")
	private Class26_Sub6 method2546(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class26_Sub6_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3422 = this.anInt3422;
		arg1.anInt3421 = this.anInt3421;
		arg1.anInt3426 = this.anInt3426;
		if (arg1.anIntArray261 == null || arg1.anIntArray261.length < this.anInt3422) {
			arg1.anIntArray261 = new int[this.anInt3422 + 100];
			arg1.anIntArray266 = new int[this.anInt3422 + 100];
			arg1.anIntArray258 = new int[this.anInt3422 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt3422; local43++) {
			arg1.anIntArray261[local43] = this.anIntArray261[local43];
			arg1.anIntArray266[local43] = this.anIntArray266[local43];
			arg1.anIntArray258[local43] = this.anIntArray258[local43];
		}
		if (arg0) {
			arg1.aByteArray40 = this.aByteArray40;
		} else {
			arg1.aByteArray40 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray40 == null) {
				for (local88 = 0; local88 < this.anInt3421; local88++) {
					arg1.aByteArray40[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt3421; local88++) {
					arg1.aByteArray40[local88] = this.aByteArray40[local88];
				}
			}
		}
		arg1.anIntArray256 = this.anIntArray256;
		arg1.anIntArray265 = this.anIntArray265;
		arg1.anIntArray257 = this.anIntArray257;
		arg1.anIntArray259 = this.anIntArray259;
		arg1.anIntArray262 = this.anIntArray262;
		arg1.anIntArray263 = this.anIntArray263;
		arg1.aByteArray42 = this.aByteArray42;
		arg1.aByteArray39 = this.aByteArray39;
		arg1.aShortArray58 = this.aShortArray58;
		arg1.aByte12 = this.aByte12;
		arg1.anIntArray260 = this.anIntArray260;
		arg1.anIntArray264 = this.anIntArray264;
		arg1.anIntArray267 = this.anIntArray267;
		arg1.anIntArrayArray27 = this.anIntArrayArray27;
		arg1.anIntArrayArray26 = this.anIntArrayArray26;
		arg1.aBoolean154 = super.aBoolean154;
		arg1.aBoolean155 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	@Override
	public void method2529(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
		@Pc(7) int local7 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3422; local9++) {
			@Pc(26) int local26 = this.anIntArray258[local9] * local3 + this.anIntArray261[local9] * local7 >> 16;
			this.anIntArray258[local9] = this.anIntArray258[local9] * local7 - this.anIntArray261[local9] * local3 >> 16;
			this.anIntArray261[local9] = local26;
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!pg;I)V")
	@Override
	public void method2539(@OriginalArg(0) Class3_Sub3_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray27 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class81 local12 = arg0.aClass81Array1[arg1];
		@Pc(15) Class3_Sub12 local15 = local12.aClass3_Sub12_1;
		Static168.anInt3424 = 0;
		Static168.anInt3423 = 0;
		Static168.anInt3425 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3315; local23++) {
			@Pc(29) short local29 = local12.aShortArray53[local23];
			if (local12.aShortArray45[local23] != -1) {
				this.method2541(0, local15.anIntArrayArray8[local12.aShortArray45[local23]], 0, 0, 0);
			}
			this.method2541(local15.anIntArray89[local29], local15.anIntArrayArray8[local29], local12.aShortArray47[local23], local12.aShortArray46[local23], local12.aShortArray52[local23]);
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()V")
	@Override
	public void method2526() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3422; local1++) {
			@Pc(7) int local7 = this.anIntArray258[local1];
			this.anIntArray258[local1] = this.anIntArray261[local1];
			this.anIntArray261[local1] = -local7;
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([[IIIIZI)Lclient!rh;")
	public Class26_Sub6_Sub1 method2548(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!this.aBoolean155) {
			this.method2552();
		}
		@Pc(9) int local9 = arg1 + this.aShort18;
		@Pc(14) int local14 = arg1 + this.aShort11;
		@Pc(19) int local19 = arg3 + this.aShort16;
		@Pc(24) int local24 = arg3 + this.aShort14;
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
		@Pc(104) Class26_Sub6_Sub1 local104;
		if (arg4) {
			local104 = new Class26_Sub6_Sub1();
			local104.anInt3422 = this.anInt3422;
			local104.anInt3421 = this.anInt3421;
			local104.anInt3426 = this.anInt3426;
			local104.anIntArray261 = this.anIntArray261;
			local104.anIntArray258 = this.anIntArray258;
			local104.anIntArray256 = this.anIntArray256;
			local104.anIntArray265 = this.anIntArray265;
			local104.anIntArray257 = this.anIntArray257;
			local104.anIntArray259 = this.anIntArray259;
			local104.anIntArray262 = this.anIntArray262;
			local104.anIntArray263 = this.anIntArray263;
			local104.aByteArray42 = this.aByteArray42;
			local104.aByteArray40 = this.aByteArray40;
			local104.aByteArray39 = this.aByteArray39;
			local104.aShortArray58 = this.aShortArray58;
			local104.aByte12 = this.aByte12;
			local104.anIntArray260 = this.anIntArray260;
			local104.anIntArray264 = this.anIntArray264;
			local104.anIntArray267 = this.anIntArray267;
			local104.anIntArrayArray27 = this.anIntArrayArray27;
			local104.anIntArrayArray26 = this.anIntArrayArray26;
			local104.aBoolean154 = super.aBoolean154;
			local104.anIntArray266 = new int[local104.anInt3422];
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
			for (local204 = 0; local204 < local104.anInt3422; local204++) {
				local212 = this.anIntArray261[local204] + arg1;
				local219 = this.anIntArray258[local204] + arg3;
				local223 = local212 & 0x7F;
				local227 = local219 & 0x7F;
				local231 = local212 >> 7;
				local235 = local219 >> 7;
				local257 = arg0[local231][local235] * (128 - local223) + arg0[local231 + 1][local235] * local223 >> 7;
				local283 = arg0[local231][local235 + 1] * (128 - local223) + arg0[local231 + 1][local235 + 1] * local223 >> 7;
				local295 = local257 * (128 - local227) + local283 * local227 >> 7;
				local104.anIntArray266[local204] = this.anIntArray266[local204] + local295 - arg2;
			}
		} else {
			for (local204 = 0; local204 < local104.anInt3422; local204++) {
				local212 = (this.anIntArray266[local204] << 16) / this.aShort12;
				if (local212 < arg5) {
					local219 = this.anIntArray261[local204] + arg1;
					local223 = this.anIntArray258[local204] + arg3;
					local227 = local219 & 0x7F;
					local231 = local223 & 0x7F;
					local235 = local219 >> 7;
					local257 = local223 >> 7;
					local283 = arg0[local235][local257] * (128 - local227) + arg0[local235 + 1][local257] * local227 >> 7;
					local295 = arg0[local235][local257 + 1] * (128 - local227) + arg0[local235 + 1][local257 + 1] * local227 >> 7;
					@Pc(419) int local419 = local283 * (128 - local231) + local295 * local231 >> 7;
					local104.anIntArray266[local204] = this.anIntArray266[local204] + (local419 - arg2) * (arg5 - local212) / arg5;
				} else {
					local104.anIntArray266[local204] = this.anIntArray266[local204];
				}
			}
		}
		local104.aBoolean155 = false;
		return local104;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!wa;)Lclient!wa;")
	public Class26_Sub6 method2549(@OriginalArg(0) Class26_Sub6 arg0) {
		return new Class26_Sub6_Sub1(new Class26_Sub6_Sub1[] { this, (Class26_Sub6_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)Lclient!wa;")
	@Override
	public Class26_Sub6 method2527(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static168.aByteArray41.length < this.anInt3421) {
			Static168.aByteArray41 = new byte[this.anInt3421 + 100];
		}
		return this.method2546(arg0, Static168.aClass26_Sub6_Sub1_1, Static168.aByteArray41);
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()V")
	@Override
	public void method2528() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3422; local1++) {
			this.anIntArray261[local1] = -this.anIntArray261[local1];
			this.anIntArray258[local1] = -this.anIntArray258[local1];
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Lclient!wa;")
	@Override
	public Class26_Sub6 method2524(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static168.aByteArray43.length < this.anInt3421) {
			Static168.aByteArray43 = new byte[this.anInt3421 + 100];
		}
		return this.method2546(arg0, Static168.aClass26_Sub6_Sub1_2, Static168.aByteArray43);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	@Override
	public void method2522(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
		@Pc(7) int local7 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3422; local9++) {
			@Pc(26) int local26 = this.anIntArray266[local9] * local3 + this.anIntArray261[local9] * local7 >> 16;
			this.anIntArray266[local9] = this.anIntArray266[local9] * local7 - this.anIntArray261[local9] * local3 >> 16;
			this.anIntArray261[local9] = local26;
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
	private void method2551(@OriginalArg(0) int arg0) {
		if (Static168.aBooleanArray16[arg0]) {
			this.method2540(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray256[arg0];
		@Pc(17) int local17 = this.anIntArray265[arg0];
		@Pc(22) int local22 = this.anIntArray257[arg0];
		Static177.aBoolean160 = Static168.aBooleanArray15[arg0];
		if (this.aByteArray40 == null) {
			Static177.anInt3611 = 0;
		} else {
			Static177.anInt3611 = this.aByteArray40[arg0] & 0xFF;
		}
		if (this.aShortArray58 != null && this.aShortArray58[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray39 == null || this.aByteArray39[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray39[arg0] & 0xFF;
				local133 = this.anIntArray260[local128];
				local138 = this.anIntArray264[local128];
				local143 = this.anIntArray267[local128];
			}
			if (this.anIntArray263[arg0] == -1) {
				Static177.method2784(Static168.anIntArray274[local12], Static168.anIntArray274[local17], Static168.anIntArray274[local22], Static168.anIntArray273[local12], Static168.anIntArray273[local17], Static168.anIntArray273[local22], this.anIntArray259[arg0], this.anIntArray259[arg0], this.anIntArray259[arg0], Static168.anIntArray272[local133], Static168.anIntArray272[local138], Static168.anIntArray272[local143], Static168.anIntArray278[local133], Static168.anIntArray278[local138], Static168.anIntArray278[local143], Static168.anIntArray281[local133], Static168.anIntArray281[local138], Static168.anIntArray281[local143], this.aShortArray58[arg0]);
			} else {
				Static177.method2784(Static168.anIntArray274[local12], Static168.anIntArray274[local17], Static168.anIntArray274[local22], Static168.anIntArray273[local12], Static168.anIntArray273[local17], Static168.anIntArray273[local22], this.anIntArray259[arg0], this.anIntArray262[arg0], this.anIntArray263[arg0], Static168.anIntArray272[local133], Static168.anIntArray272[local138], Static168.anIntArray272[local143], Static168.anIntArray278[local133], Static168.anIntArray278[local138], Static168.anIntArray278[local143], Static168.anIntArray281[local133], Static168.anIntArray281[local138], Static168.anIntArray281[local143], this.aShortArray58[arg0]);
			}
		} else if (this.anIntArray263[arg0] == -1) {
			Static177.method2782(Static168.anIntArray274[local12], Static168.anIntArray274[local17], Static168.anIntArray274[local22], Static168.anIntArray273[local12], Static168.anIntArray273[local17], Static168.anIntArray273[local22], Static177.anIntArray299[this.anIntArray259[arg0]]);
		} else {
			Static177.method2785(Static168.anIntArray274[local12], Static168.anIntArray274[local17], Static168.anIntArray274[local22], Static168.anIntArray273[local12], Static168.anIntArray273[local17], Static168.anIntArray273[local22], this.anIntArray259[arg0], this.anIntArray262[arg0], this.anIntArray263[arg0]);
		}
	}

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "()I")
	@Override
	public int method2535() {
		if (!this.aBoolean155) {
			this.method2552();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!pg;ILclient!pg;I[I)V")
	@Override
	public void method2523(@OriginalArg(0) Class3_Sub3_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2539(arg0, arg1);
			return;
		}
		@Pc(18) Class81 local18 = arg0.aClass81Array1[arg1];
		@Pc(23) Class81 local23 = arg2.aClass81Array1[arg3];
		@Pc(26) Class3_Sub12 local26 = local18.aClass3_Sub12_1;
		Static168.anInt3424 = 0;
		Static168.anInt3423 = 0;
		Static168.anInt3425 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3315; local41++) {
			@Pc(47) short local47 = local18.aShortArray53[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray89[local47] == 0) {
				if (local18.aShortArray45[local41] != -1) {
					this.method2541(0, local26.anIntArrayArray8[local18.aShortArray45[local41]], 0, 0, 0);
				}
				this.method2541(local26.anIntArray89[local47], local26.anIntArrayArray8[local47], local18.aShortArray47[local41], local18.aShortArray46[local41], local18.aShortArray52[local41]);
			}
		}
		Static168.anInt3424 = 0;
		Static168.anInt3423 = 0;
		Static168.anInt3425 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt3315; local125++) {
			@Pc(131) short local131 = local23.aShortArray53[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray89[local131] == 0) {
				if (local23.aShortArray45[local125] != -1) {
					this.method2541(0, local26.anIntArrayArray8[local23.aShortArray45[local125]], 0, 0, 0);
				}
				this.method2541(local26.anIntArray89[local131], local26.anIntArrayArray8[local131], local23.aShortArray47[local125], local23.aShortArray46[local125], local23.aShortArray52[local125]);
			}
		}
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "()I")
	@Override
	public int method2537() {
		if (!this.aBoolean155) {
			this.method2552();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "()V")
	private void method2552() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3422; local17++) {
			@Pc(23) int local23 = this.anIntArray261[local17];
			@Pc(28) int local28 = this.anIntArray266[local17];
			@Pc(33) int local33 = this.anIntArray258[local17];
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
		this.aShort11 = (short) local7;
		this.aShort12 = (short) local3;
		this.aShort13 = (short) local9;
		this.aShort16 = (short) local5;
		this.aShort14 = (short) local11;
		this.aShort15 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort17 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "()I")
	@Override
	public int method2538() {
		if (!this.aBoolean155) {
			this.method2552();
		}
		return this.aShort15;
	}
}
