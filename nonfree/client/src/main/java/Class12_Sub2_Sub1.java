import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!le", name = "o", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!le", name = "A", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!le", name = "E", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!le", name = "K", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!le", name = "N", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!le", name = "O", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!le", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!le", name = "W", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!le", name = "C", descriptor = "I")
	public int anInt2632 = 0;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	private int anInt2631 = 0;

	@OriginalMember(owner = "client!le", name = "X", descriptor = "I")
	private int anInt2633 = 0;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!he;IIIII)V")
	public Class12_Sub2_Sub1(@OriginalArg(0) Class12_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1317();
		arg0.method1337();
		this.anInt2632 = arg0.anInt1892;
		this.anIntArray269 = arg0.anIntArray188;
		this.anIntArray276 = arg0.anIntArray177;
		this.anIntArray277 = arg0.anIntArray183;
		this.anInt2633 = arg0.anInt1891;
		this.anIntArray272 = arg0.anIntArray185;
		this.anIntArray274 = arg0.anIntArray187;
		this.anIntArray270 = arg0.anIntArray182;
		this.aByteArray35 = arg0.aByteArray19;
		this.aByteArray37 = arg0.aByteArray21;
		this.aByte5 = arg0.aByte3;
		this.anIntArrayArray23 = arg0.anIntArrayArray18;
		this.anIntArrayArray22 = arg0.anIntArrayArray17;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray278 = new int[this.anInt2633];
		this.anIntArray275 = new int[this.anInt2633];
		this.anIntArray267 = new int[this.anInt2633];
		@Pc(118) int local118;
		if (arg0.aShortArray55 == null) {
			this.aShortArray76 = null;
		} else {
			this.aShortArray76 = new short[this.anInt2633];
			for (local118 = 0; local118 < this.anInt2633; local118++) {
				@Pc(124) short local124 = arg0.aShortArray55[local118];
				if (local124 != -1 && Static155.anInterface1_1.method1133(local124)) {
					this.aShortArray76[local118] = local124;
				} else {
					this.aShortArray76[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt1893 > 0 && arg0.aByteArray18 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt1893];
			for (@Pc(164) int local164 = 0; local164 < this.anInt2633; local164++) {
				if (arg0.aByteArray18[local164] != -1) {
					local162[arg0.aByteArray18[local164] & 0xFF]++;
				}
			}
			this.anInt2631 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt1893; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray25[local193] == 0) {
					this.anInt2631++;
				}
			}
			this.anIntArray273 = new int[this.anInt2631];
			this.anIntArray268 = new int[this.anInt2631];
			this.anIntArray271 = new int[this.anInt2631];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt1893; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray25[local233] == 0) {
					this.anIntArray273[local231] = arg0.aShortArray54[local233] & 0xFFFF;
					this.anIntArray268[local231] = arg0.aShortArray53[local233] & 0xFFFF;
					this.anIntArray271[local231] = arg0.aShortArray50[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray36 = new byte[this.anInt2633];
			for (local295 = 0; local295 < this.anInt2633; local295++) {
				if (arg0.aByteArray18[local295] == -1) {
					this.aByteArray36[local295] = -1;
				} else {
					this.aByteArray36[local295] = (byte) local162[arg0.aByteArray18[local295] & 0xFF];
					if (this.aByteArray36[local295] == -1 && this.aShortArray76 != null) {
						this.aShortArray76[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt2633; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray17 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray17[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray21 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray21[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray76 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray76[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class44 local417;
			@Pc(578) Class87 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray51[local118] & 0xFFFF;
					if (arg0.aClass44Array1 == null || arg0.aClass44Array1[this.anIntArray272[local118]] == null) {
						local417 = arg0.aClass44Array2[this.anIntArray272[local118]];
					} else {
						local417 = arg0.aClass44Array1[this.anIntArray272[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2074 + arg4 * local417.anInt2071 + arg5 * local417.anInt2072) / (local93 * local417.anInt2073);
					this.anIntArray278[local118] = Static110.method1873(local398, local295);
					if (arg0.aClass44Array1 == null || arg0.aClass44Array1[this.anIntArray274[local118]] == null) {
						local417 = arg0.aClass44Array2[this.anIntArray274[local118]];
					} else {
						local417 = arg0.aClass44Array1[this.anIntArray274[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2074 + arg4 * local417.anInt2071 + arg5 * local417.anInt2072) / (local93 * local417.anInt2073);
					this.anIntArray275[local118] = Static110.method1873(local398, local295);
					if (arg0.aClass44Array1 == null || arg0.aClass44Array1[this.anIntArray270[local118]] == null) {
						local417 = arg0.aClass44Array2[this.anIntArray270[local118]];
					} else {
						local417 = arg0.aClass44Array1[this.anIntArray270[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2074 + arg4 * local417.anInt2071 + arg5 * local417.anInt2072) / (local93 * local417.anInt2073);
					this.anIntArray267[local118] = Static110.method1873(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass87Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt4122 + arg4 * local578.anInt4125 + arg5 * local578.anInt4124) / (local93 + local93 / 2);
					this.anIntArray278[local118] = Static110.method1873(arg0.aShortArray51[local118] & 0xFFFF, local295);
					this.anIntArray267[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray278[local118] = 128;
					this.anIntArray267[local118] = -1;
				} else {
					this.anIntArray267[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass44Array1 == null || arg0.aClass44Array1[this.anIntArray272[local118]] == null) {
					local417 = arg0.aClass44Array2[this.anIntArray272[local118]];
				} else {
					local417 = arg0.aClass44Array1[this.anIntArray272[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2074 + arg4 * local417.anInt2071 + arg5 * local417.anInt2072) / (local93 * local417.anInt2073);
				this.anIntArray278[local118] = Static110.method1872(local295);
				if (arg0.aClass44Array1 == null || arg0.aClass44Array1[this.anIntArray274[local118]] == null) {
					local417 = arg0.aClass44Array2[this.anIntArray274[local118]];
				} else {
					local417 = arg0.aClass44Array1[this.anIntArray274[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2074 + arg4 * local417.anInt2071 + arg5 * local417.anInt2072) / (local93 * local417.anInt2073);
				this.anIntArray275[local118] = Static110.method1872(local295);
				if (arg0.aClass44Array1 == null || arg0.aClass44Array1[this.anIntArray270[local118]] == null) {
					local417 = arg0.aClass44Array2[this.anIntArray270[local118]];
				} else {
					local417 = arg0.aClass44Array1[this.anIntArray270[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2074 + arg4 * local417.anInt2071 + arg5 * local417.anInt2072) / (local93 * local417.anInt2073);
				this.anIntArray267[local118] = Static110.method1872(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass87Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt4122 + arg4 * local578.anInt4125 + arg5 * local578.anInt4124) / (local93 + local93 / 2);
				this.anIntArray278[local118] = Static110.method1872(local295);
				this.anIntArray267[local118] = -1;
			} else {
				this.anIntArray267[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([Lclient!le;I)V")
	private Class12_Sub2_Sub1(@OriginalArg(0) Class12_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2632 = 0;
		this.anInt2633 = 0;
		this.anInt2631 = 0;
		this.aByte5 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class12_Sub2_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2632 += local43.anInt2632;
				this.anInt2633 += local43.anInt2633;
				this.anInt2631 += local43.anInt2631;
				if (local43.aByteArray35 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local43.aByte5;
					}
					if (this.aByte5 != local43.aByte5) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray37 != null;
				local22 |= local43.aShortArray76 != null;
				local24 |= local43.aByteArray36 != null;
			}
		}
		this.anIntArray269 = new int[this.anInt2632];
		this.anIntArray276 = new int[this.anInt2632];
		this.anIntArray277 = new int[this.anInt2632];
		this.anIntArray272 = new int[this.anInt2633];
		this.anIntArray274 = new int[this.anInt2633];
		this.anIntArray270 = new int[this.anInt2633];
		this.anIntArray278 = new int[this.anInt2633];
		this.anIntArray275 = new int[this.anInt2633];
		this.anIntArray267 = new int[this.anInt2633];
		if (local18) {
			this.aByteArray35 = new byte[this.anInt2633];
		}
		if (local20) {
			this.aByteArray37 = new byte[this.anInt2633];
		}
		if (local22) {
			this.aShortArray76 = new short[this.anInt2633];
		}
		if (local24) {
			this.aByteArray36 = new byte[this.anInt2633];
		}
		if (this.anInt2631 > 0) {
			this.anIntArray273 = new int[this.anInt2631];
			this.anIntArray268 = new int[this.anInt2631];
			this.anIntArray271 = new int[this.anInt2631];
		}
		this.anInt2632 = 0;
		this.anInt2633 = 0;
		this.anInt2631 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class12_Sub2_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2633; local229++) {
					this.anIntArray272[this.anInt2633] = local225.anIntArray272[local229] + this.anInt2632;
					this.anIntArray274[this.anInt2633] = local225.anIntArray274[local229] + this.anInt2632;
					this.anIntArray270[this.anInt2633] = local225.anIntArray270[local229] + this.anInt2632;
					this.anIntArray278[this.anInt2633] = local225.anIntArray278[local229];
					this.anIntArray275[this.anInt2633] = local225.anIntArray275[local229];
					this.anIntArray267[this.anInt2633] = local225.anIntArray267[local229];
					if (local18) {
						if (local225.aByteArray35 == null) {
							this.aByteArray35[this.anInt2633] = local225.aByte5;
						} else {
							this.aByteArray35[this.anInt2633] = local225.aByteArray35[local229];
						}
					}
					if (local20 && local225.aByteArray37 != null) {
						this.aByteArray37[this.anInt2633] = local225.aByteArray37[local229];
					}
					if (local22) {
						if (local225.aShortArray76 == null) {
							this.aShortArray76[this.anInt2633] = -1;
						} else {
							this.aShortArray76[this.anInt2633] = local225.aShortArray76[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray36 == null || local225.aByteArray36[local229] == -1) {
							this.aByteArray36[this.anInt2633] = -1;
						} else {
							this.aByteArray36[this.anInt2633] = (byte) (local225.aByteArray36[local229] + this.anInt2631);
						}
					}
					this.anInt2633++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2631; local394++) {
					this.anIntArray273[this.anInt2631] = local225.anIntArray273[local394] + this.anInt2632;
					this.anIntArray268[this.anInt2631] = local225.anIntArray268[local394] + this.anInt2632;
					this.anIntArray271[this.anInt2631] = local225.anIntArray271[local394] + this.anInt2632;
					this.anInt2631++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2632; local444++) {
					this.anIntArray269[this.anInt2632] = local225.anIntArray269[local444];
					this.anIntArray276[this.anInt2632] = local225.anIntArray276[local444];
					this.anIntArray277[this.anInt2632] = local225.anIntArray277[local444];
					this.anInt2632++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "()I")
	@Override
	public int method1863() {
		if (!this.aBoolean140) {
			this.method1874();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZJII)V")
	private void method1869(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static110.anIntArray282[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt2633; local16++) {
			if (this.anIntArray267[local16] != -2) {
				local28 = this.anIntArray272[local16];
				local33 = this.anIntArray274[local16];
				local38 = this.anIntArray270[local16];
				local42 = Static110.anIntArray290[local28];
				local46 = Static110.anIntArray290[local33];
				local50 = Static110.anIntArray290[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static110.anIntArray283[local28];
					local69 = Static110.anIntArray283[local33];
					@Pc(73) int local73 = Static110.anIntArray283[local38];
					@Pc(77) int local77 = Static110.anIntArray281[local28];
					local81 = Static110.anIntArray281[local33];
					local85 = Static110.anIntArray281[local38];
					@Pc(89) int local89 = Static110.anIntArray291[local28];
					local93 = Static110.anIntArray291[local33];
					@Pc(97) int local97 = Static110.anIntArray291[local38];
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
						Static110.aBooleanArray14[local16] = true;
						@Pc(177) int local177 = (Static110.anIntArray287[local28] + Static110.anIntArray287[local33] + Static110.anIntArray287[local38]) / 3 + arg3;
						Static110.anIntArrayArray25[local177][Static110.anIntArray282[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1878(Static126.anInt2959 + Static155.anInt3625, Static163.anInt3819 + Static155.anInt3624, Static110.anIntArray285[local28], Static110.anIntArray285[local33], Static110.anIntArray285[local38], local42, local46, local50)) {
						Static26.aLongArray1[Static146.anInt3314++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static110.anIntArray285[local38] - Static110.anIntArray285[local33]) - (Static110.anIntArray285[local28] - Static110.anIntArray285[local33]) * (local50 - local46) > 0) {
						Static110.aBooleanArray14[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static155.anInt3622 && local46 <= Static155.anInt3622 && local50 <= Static155.anInt3622) {
							Static110.aBooleanArray15[local16] = false;
						} else {
							Static110.aBooleanArray15[local16] = true;
						}
						local65 = (Static110.anIntArray287[local28] + Static110.anIntArray287[local33] + Static110.anIntArray287[local38]) / 3 + arg3;
						Static110.anIntArrayArray25[local65][Static110.anIntArray282[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray35 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static110.anIntArray282[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static110.anIntArrayArray25[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1881(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static110.anIntArray284[local28] = 0;
			Static110.anIntArray288[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static110.anIntArray282[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static110.anIntArrayArray25[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray35[local50];
					local69 = Static110.anIntArray284[local386]++;
					Static110.anIntArrayArray24[local386][local69] = local50;
					if (local386 < 10) {
						Static110.anIntArray288[local386] += local33;
					} else if (local386 == 10) {
						Static110.anIntArray279[local69] = local33;
					} else {
						Static110.anIntArray280[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static110.anIntArray284[1] > 0 || Static110.anIntArray284[2] > 0) {
			local38 = (Static110.anIntArray288[1] + Static110.anIntArray288[2]) / (Static110.anIntArray284[1] + Static110.anIntArray284[2]);
		}
		local42 = 0;
		if (Static110.anIntArray284[3] > 0 || Static110.anIntArray284[4] > 0) {
			local42 = (Static110.anIntArray288[3] + Static110.anIntArray288[4]) / (Static110.anIntArray284[3] + Static110.anIntArray284[4]);
		}
		local46 = 0;
		if (Static110.anIntArray284[6] > 0 || Static110.anIntArray284[8] > 0) {
			local46 = (Static110.anIntArray288[6] + Static110.anIntArray288[8]) / (Static110.anIntArray284[6] + Static110.anIntArray284[8]);
		}
		local65 = 0;
		local69 = Static110.anIntArray284[10];
		@Pc(519) int[] local519 = Static110.anIntArrayArray24[10];
		@Pc(521) int[] local521 = Static110.anIntArray279;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static110.anIntArray284[11];
			local519 = Static110.anIntArrayArray24[11];
			local521 = Static110.anIntArray280;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1881(local519[local65++]);
				if (local65 == local69 && local519 != Static110.anIntArrayArray24[11]) {
					local65 = 0;
					local69 = Static110.anIntArray284[11];
					local519 = Static110.anIntArrayArray24[11];
					local521 = Static110.anIntArray280;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1881(local519[local65++]);
				if (local65 == local69 && local519 != Static110.anIntArrayArray24[11]) {
					local65 = 0;
					local69 = Static110.anIntArray284[11];
					local519 = Static110.anIntArrayArray24[11];
					local521 = Static110.anIntArray280;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1881(local519[local65++]);
				if (local65 == local69 && local519 != Static110.anIntArrayArray24[11]) {
					local65 = 0;
					local69 = Static110.anIntArray284[11];
					local519 = Static110.anIntArrayArray24[11];
					local521 = Static110.anIntArray280;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static110.anIntArray284[local81];
			@Pc(684) int[] local684 = Static110.anIntArrayArray24[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1881(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1881(local519[local65++]);
			if (local65 == local69 && local519 != Static110.anIntArrayArray24[11]) {
				local65 = 0;
				local519 = Static110.anIntArrayArray24[11];
				local69 = Static110.anIntArray284[11];
				local521 = Static110.anIntArray280;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[IIII)V")
	private void method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static110.anInt2634 = 0;
			Static110.anInt2636 = 0;
			Static110.anInt2635 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray23.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray23[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static110.anInt2634 += this.anIntArray269[local36];
						Static110.anInt2636 += this.anIntArray276[local36];
						Static110.anInt2635 += this.anIntArray277[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static110.anInt2634 = Static110.anInt2634 / local6 + arg2;
				Static110.anInt2636 = Static110.anInt2636 / local6 + arg3;
				Static110.anInt2635 = Static110.anInt2635 / local6 + arg4;
			} else {
				Static110.anInt2634 = arg2;
				Static110.anInt2636 = arg3;
				Static110.anInt2635 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray269[local31] += arg2;
						this.anIntArray276[local31] += arg3;
						this.anIntArray277[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray269[local31] -= Static110.anInt2634;
						this.anIntArray276[local31] -= Static110.anInt2636;
						this.anIntArray277[local31] -= Static110.anInt2635;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class79.anIntArray377[arg4];
							local217 = Class79.anIntArray375[arg4];
							local235 = this.anIntArray276[local31] * local36 + this.anIntArray269[local31] * local217 + 32767 >> 16;
							this.anIntArray276[local31] = this.anIntArray276[local31] * local217 + 32767 - this.anIntArray269[local31] * local36 >> 16;
							this.anIntArray269[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class79.anIntArray377[arg2];
							local217 = Class79.anIntArray375[arg2];
							local235 = this.anIntArray276[local31] * local217 + 32767 - this.anIntArray277[local31] * local36 >> 16;
							this.anIntArray277[local31] = this.anIntArray276[local31] * local36 + this.anIntArray277[local31] * local217 + 32767 >> 16;
							this.anIntArray276[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class79.anIntArray377[arg3];
							local217 = Class79.anIntArray375[arg3];
							local235 = this.anIntArray277[local31] * local36 + this.anIntArray269[local31] * local217 + 32767 >> 16;
							this.anIntArray277[local31] = this.anIntArray277[local31] * local217 + 32767 - this.anIntArray269[local31] * local36 >> 16;
							this.anIntArray269[local31] = local235;
						}
						this.anIntArray269[local31] += Static110.anInt2634;
						this.anIntArray276[local31] += Static110.anInt2636;
						this.anIntArray277[local31] += Static110.anInt2635;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray269[local31] -= Static110.anInt2634;
						this.anIntArray276[local31] -= Static110.anInt2636;
						this.anIntArray277[local31] -= Static110.anInt2635;
						this.anIntArray269[local31] = this.anIntArray269[local31] * arg2 / 128;
						this.anIntArray276[local31] = this.anIntArray276[local31] * arg3 / 128;
						this.anIntArray277[local31] = this.anIntArray277[local31] * arg4 / 128;
						this.anIntArray269[local31] += Static110.anInt2634;
						this.anIntArray276[local31] += Static110.anInt2636;
						this.anIntArray277[local31] += Static110.anInt2635;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray22 != null && this.aByteArray37 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray37[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray37[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(ZZ)Lclient!cg;")
	@Override
	public Class12_Sub2 method1854(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static110.aByteArray39.length < this.anInt2633) {
			Static110.aByteArray39 = new byte[this.anInt2633 + 100];
		}
		return this.method1876(arg0, Static110.aClass12_Sub2_Sub1_2, Static110.aByteArray39);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)Lclient!cg;")
	@Override
	public Class12_Sub2 method1853(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static110.aByteArray38.length < this.anInt2633) {
			Static110.aByteArray38 = new byte[this.anInt2633 + 100];
		}
		return this.method1876(arg0, Static110.aClass12_Sub2_Sub1_1, Static110.aByteArray38);
	}

	@OriginalMember(owner = "client!le", name = "i", descriptor = "()I")
	@Override
	public int method1865() {
		if (!this.aBoolean140) {
			this.method1874();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(III)V")
	@Override
	public void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2632; local1++) {
			this.anIntArray269[local1] = this.anIntArray269[local1] * arg0 / 128;
			this.anIntArray276[local1] = this.anIntArray276[local1] * arg1 / 128;
			this.anIntArray277[local1] = this.anIntArray277[local1] * arg2 / 128;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
	private void method1871(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static155.anInt3625;
		@Pc(3) int local3 = Static155.anInt3624;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray272[arg0];
		@Pc(15) int local15 = this.anIntArray274[arg0];
		@Pc(20) int local20 = this.anIntArray270[arg0];
		@Pc(24) int local24 = Static110.anIntArray291[local10];
		@Pc(28) int local28 = Static110.anIntArray291[local15];
		@Pc(32) int local32 = Static110.anIntArray291[local20];
		if (this.aByteArray37 == null) {
			Static155.anInt3621 = 0;
		} else {
			Static155.anInt3621 = this.aByteArray37[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static110.anIntArray292[0] = Static110.anIntArray290[local10];
			Static110.anIntArray289[0] = Static110.anIntArray285[local10];
			local5++;
			Static110.anIntArray286[0] = this.anIntArray278[arg0];
		} else {
			local73 = Static110.anIntArray283[local10];
			local77 = Static110.anIntArray281[local10];
			local82 = this.anIntArray278[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class79.anIntArray374[local32 - local24];
				Static110.anIntArray292[0] = local1 + (local73 + ((Static110.anIntArray283[local20] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray289[0] = local3 + (local77 + ((Static110.anIntArray281[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static110.anIntArray286[0] = local82 + ((this.anIntArray267[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class79.anIntArray374[local28 - local24];
				Static110.anIntArray292[local5] = local1 + (local73 + ((Static110.anIntArray283[local15] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray289[local5] = local3 + (local77 + ((Static110.anIntArray281[local15] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray286[local5++] = local82 + ((this.anIntArray275[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static110.anIntArray292[local5] = Static110.anIntArray290[local15];
			Static110.anIntArray289[local5] = Static110.anIntArray285[local15];
			Static110.anIntArray286[local5++] = this.anIntArray275[arg0];
		} else {
			local73 = Static110.anIntArray283[local15];
			local77 = Static110.anIntArray281[local15];
			local82 = this.anIntArray275[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class79.anIntArray374[local24 - local28];
				Static110.anIntArray292[local5] = local1 + (local73 + ((Static110.anIntArray283[local10] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray289[local5] = local3 + (local77 + ((Static110.anIntArray281[local10] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray286[local5++] = local82 + ((this.anIntArray278[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class79.anIntArray374[local32 - local28];
				Static110.anIntArray292[local5] = local1 + (local73 + ((Static110.anIntArray283[local20] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray289[local5] = local3 + (local77 + ((Static110.anIntArray281[local20] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray286[local5++] = local82 + ((this.anIntArray267[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static110.anIntArray292[local5] = Static110.anIntArray290[local20];
			Static110.anIntArray289[local5] = Static110.anIntArray285[local20];
			Static110.anIntArray286[local5++] = this.anIntArray267[arg0];
		} else {
			local73 = Static110.anIntArray283[local20];
			local77 = Static110.anIntArray281[local20];
			local82 = this.anIntArray267[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class79.anIntArray374[local28 - local32];
				Static110.anIntArray292[local5] = local1 + (local73 + ((Static110.anIntArray283[local15] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray289[local5] = local3 + (local77 + ((Static110.anIntArray281[local15] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray286[local5++] = local82 + ((this.anIntArray275[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class79.anIntArray374[local24 - local32];
				Static110.anIntArray292[local5] = local1 + (local73 + ((Static110.anIntArray283[local10] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray289[local5] = local3 + (local77 + ((Static110.anIntArray281[local10] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray286[local5++] = local82 + ((this.anIntArray278[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static110.anIntArray292[0];
		local77 = Static110.anIntArray292[1];
		local82 = Static110.anIntArray292[2];
		local95 = Static110.anIntArray289[0];
		@Pc(590) int local590 = Static110.anIntArray289[1];
		@Pc(594) int local594 = Static110.anIntArray289[2];
		Static155.aBoolean209 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static155.anInt3622 || local77 > Static155.anInt3622 || local82 > Static155.anInt3622) {
				Static155.aBoolean209 = true;
			}
			if (this.aShortArray76 != null && this.aShortArray76[arg0] != -1) {
				if (this.aByteArray36 == null || this.aByteArray36[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray36[arg0] & 0xFF;
					local683 = this.anIntArray273[local678];
					local688 = this.anIntArray268[local678];
					local693 = this.anIntArray271[local678];
				}
				if (this.anIntArray267[arg0] == -1) {
					Static155.method2534(local95, local590, local594, local73, local77, local82, this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static110.anIntArray283[local683], Static110.anIntArray283[local688], Static110.anIntArray283[local693], Static110.anIntArray281[local683], Static110.anIntArray281[local688], Static110.anIntArray281[local693], Static110.anIntArray291[local683], Static110.anIntArray291[local688], Static110.anIntArray291[local693], this.aShortArray76[arg0]);
				} else {
					Static155.method2534(local95, local590, local594, local73, local77, local82, Static110.anIntArray286[0], Static110.anIntArray286[1], Static110.anIntArray286[2], Static110.anIntArray283[local683], Static110.anIntArray283[local688], Static110.anIntArray283[local693], Static110.anIntArray281[local683], Static110.anIntArray281[local688], Static110.anIntArray281[local693], Static110.anIntArray291[local683], Static110.anIntArray291[local688], Static110.anIntArray291[local693], this.aShortArray76[arg0]);
				}
			} else if (this.anIntArray267[arg0] == -1) {
				Static155.method2530(local95, local590, local594, local73, local77, local82, Static155.anIntArray373[this.anIntArray278[arg0]]);
			} else {
				Static155.method2524(local95, local590, local594, local73, local77, local82, Static110.anIntArray286[0], Static110.anIntArray286[1], Static110.anIntArray286[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static155.anInt3622 || local77 > Static155.anInt3622 || local82 > Static155.anInt3622 || Static110.anIntArray292[3] < 0 || Static110.anIntArray292[3] > Static155.anInt3622) {
			Static155.aBoolean209 = true;
		}
		if (this.aShortArray76 == null || this.aShortArray76[arg0] == -1) {
			if (this.anIntArray267[arg0] == -1) {
				local683 = Static155.anIntArray373[this.anIntArray278[arg0]];
				Static155.method2530(local95, local590, local594, local73, local77, local82, local683);
				Static155.method2530(local95, local594, Static110.anIntArray289[3], local73, local82, Static110.anIntArray292[3], local683);
				return;
			}
			Static155.method2524(local95, local590, local594, local73, local77, local82, Static110.anIntArray286[0], Static110.anIntArray286[1], Static110.anIntArray286[2]);
			Static155.method2524(local95, local594, Static110.anIntArray289[3], local73, local82, Static110.anIntArray292[3], Static110.anIntArray286[0], Static110.anIntArray286[2], Static110.anIntArray286[3]);
			return;
		}
		if (this.aByteArray36 == null || this.aByteArray36[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray36[arg0] & 0xFF;
			local683 = this.anIntArray273[local678];
			local688 = this.anIntArray268[local678];
			local693 = this.anIntArray271[local678];
		}
		@Pc(956) short local956 = this.aShortArray76[arg0];
		if (this.anIntArray267[arg0] == -1) {
			Static155.method2534(local95, local590, local594, local73, local77, local82, this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static110.anIntArray283[local683], Static110.anIntArray283[local688], Static110.anIntArray283[local693], Static110.anIntArray281[local683], Static110.anIntArray281[local688], Static110.anIntArray281[local693], Static110.anIntArray291[local683], Static110.anIntArray291[local688], Static110.anIntArray291[local693], local956);
			Static155.method2534(local95, local594, Static110.anIntArray289[3], local73, local82, Static110.anIntArray292[3], this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static110.anIntArray283[local683], Static110.anIntArray283[local688], Static110.anIntArray283[local693], Static110.anIntArray281[local683], Static110.anIntArray281[local688], Static110.anIntArray281[local693], Static110.anIntArray291[local683], Static110.anIntArray291[local688], Static110.anIntArray291[local693], local956);
			return;
		}
		Static155.method2534(local95, local590, local594, local73, local77, local82, Static110.anIntArray286[0], Static110.anIntArray286[1], Static110.anIntArray286[2], Static110.anIntArray283[local683], Static110.anIntArray283[local688], Static110.anIntArray283[local693], Static110.anIntArray281[local683], Static110.anIntArray281[local688], Static110.anIntArray281[local693], Static110.anIntArray291[local683], Static110.anIntArray291[local688], Static110.anIntArray291[local693], local956);
		Static155.method2534(local95, local594, Static110.anIntArray289[3], local73, local82, Static110.anIntArray292[3], Static110.anIntArray286[0], Static110.anIntArray286[2], Static110.anIntArray286[3], Static110.anIntArray283[local683], Static110.anIntArray283[local688], Static110.anIntArray283[local693], Static110.anIntArray281[local683], Static110.anIntArray281[local688], Static110.anIntArray281[local693], Static110.anIntArray291[local683], Static110.anIntArray291[local688], Static110.anIntArray291[local693], local956);
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "()I")
	@Override
	public int method1867() {
		if (!this.aBoolean140) {
			this.method1874();
		}
		return this.aShort34;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "()V")
	@Override
	public void method1859() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2632; local1++) {
			this.anIntArray269[local1] = -this.anIntArray269[local1];
			this.anIntArray277[local1] = -this.anIntArray277[local1];
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!li;IZ)V")
	@Override
	public void method1856(@OriginalArg(0) Class2_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArrayArray23 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class86 local12 = arg0.aClass86Array1[arg1];
		@Pc(15) Class2_Sub12 local15 = local12.aClass2_Sub12_1;
		Static110.anInt2634 = 0;
		Static110.anInt2636 = 0;
		Static110.anInt2635 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt4088; local23++) {
			@Pc(29) short local29 = local12.aShortArray129[local23];
			if (local12.aShortArray124[local23] != -1) {
				this.method1870(0, local15.anIntArrayArray16[local12.aShortArray124[local23]], 0, 0, 0);
			}
			this.method1870(local15.anIntArray169[local29], local15.anIntArrayArray16[local29], local12.aShortArray131[local23], local12.aShortArray128[local23], local12.aShortArray133[local23]);
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!li;ILclient!li;I[IZ)V")
	@Override
	public void method1858(@OriginalArg(0) Class2_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1856(arg0, arg1, arg5);
			return;
		}
		@Pc(19) Class86 local19 = arg0.aClass86Array1[arg1];
		@Pc(24) Class86 local24 = arg2.aClass86Array1[arg3];
		@Pc(27) Class2_Sub12 local27 = local19.aClass2_Sub12_1;
		Static110.anInt2634 = 0;
		Static110.anInt2636 = 0;
		Static110.anInt2635 = 0;
		@Pc(35) byte local35 = 0;
		@Pc(38) int local38 = local35 + 1;
		@Pc(40) int local40 = arg4[0];
		for (@Pc(42) int local42 = 0; local42 < local19.anInt4088; local42++) {
			@Pc(48) short local48 = local19.aShortArray129[local42];
			while (local48 > local40) {
				local40 = arg4[local38++];
			}
			if (local48 != local40 || local27.anIntArray169[local48] == 0) {
				if (local19.aShortArray124[local42] != -1) {
					this.method1870(0, local27.anIntArrayArray16[local19.aShortArray124[local42]], 0, 0, 0);
				}
				this.method1870(local27.anIntArray169[local48], local27.anIntArrayArray16[local48], local19.aShortArray131[local42], local19.aShortArray128[local42], local19.aShortArray133[local42]);
			}
		}
		Static110.anInt2634 = 0;
		Static110.anInt2636 = 0;
		Static110.anInt2635 = 0;
		local35 = 0;
		local38 = local35 + 1;
		local40 = arg4[0];
		for (@Pc(126) int local126 = 0; local126 < local24.anInt4088; local126++) {
			@Pc(132) short local132 = local24.aShortArray129[local126];
			while (local132 > local40) {
				local40 = arg4[local38++];
			}
			if (local132 == local40 || local27.anIntArray169[local132] == 0) {
				if (local24.aShortArray124[local126] != -1) {
					this.method1870(0, local27.anIntArrayArray16[local24.aShortArray124[local126]], 0, 0, 0);
				}
				this.method1870(local27.anIntArray169[local132], local27.anIntArrayArray16[local132], local24.aShortArray131[local126], local24.aShortArray128[local126], local24.aShortArray133[local126]);
			}
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "k", descriptor = "()V")
	private void method1874() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2632; local17++) {
			@Pc(23) int local23 = this.anIntArray269[local17];
			@Pc(28) int local28 = this.anIntArray276[local17];
			@Pc(33) int local33 = this.anIntArray277[local17];
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
		this.aShort33 = (short) local1;
		this.aShort38 = (short) local7;
		this.aShort39 = (short) local3;
		this.aShort40 = (short) local9;
		this.aShort36 = (short) local5;
		this.aShort34 = (short) local11;
		this.aShort37 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort35 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean140 = true;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		if (!this.aBoolean140) {
			this.method1874();
		}
		return this.aShort39;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public void method1866(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class79.anIntArray377[arg0];
		@Pc(7) int local7 = Class79.anIntArray375[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2632; local9++) {
			@Pc(26) int local26 = this.anIntArray276[local9] * local7 - this.anIntArray277[local9] * local3 >> 16;
			this.anIntArray277[local9] = this.anIntArray276[local9] * local3 + this.anIntArray277[local9] * local7 >> 16;
			this.anIntArray276[local9] = local26;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	@Override
	public void method1860(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class79.anIntArray377[arg0];
		@Pc(7) int local7 = Class79.anIntArray375[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2632; local9++) {
			@Pc(26) int local26 = this.anIntArray276[local9] * local3 + this.anIntArray269[local9] * local7 >> 16;
			this.anIntArray276[local9] = this.anIntArray276[local9] * local7 - this.anIntArray269[local9] * local3 >> 16;
			this.anIntArray269[local9] = local26;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLclient!le;[B)Lclient!cg;")
	private Class12_Sub2 method1876(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2632 = this.anInt2632;
		arg1.anInt2633 = this.anInt2633;
		arg1.anInt2631 = this.anInt2631;
		if (arg1.anIntArray269 == null || arg1.anIntArray269.length < this.anInt2632) {
			arg1.anIntArray269 = new int[this.anInt2632 + 100];
			arg1.anIntArray276 = new int[this.anInt2632 + 100];
			arg1.anIntArray277 = new int[this.anInt2632 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2632; local43++) {
			arg1.anIntArray269[local43] = this.anIntArray269[local43];
			arg1.anIntArray276[local43] = this.anIntArray276[local43];
			arg1.anIntArray277[local43] = this.anIntArray277[local43];
		}
		if (arg0) {
			arg1.aByteArray37 = this.aByteArray37;
		} else {
			arg1.aByteArray37 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray37 == null) {
				for (local88 = 0; local88 < this.anInt2633; local88++) {
					arg1.aByteArray37[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2633; local88++) {
					arg1.aByteArray37[local88] = this.aByteArray37[local88];
				}
			}
		}
		arg1.anIntArray272 = this.anIntArray272;
		arg1.anIntArray274 = this.anIntArray274;
		arg1.anIntArray270 = this.anIntArray270;
		arg1.anIntArray278 = this.anIntArray278;
		arg1.anIntArray275 = this.anIntArray275;
		arg1.anIntArray267 = this.anIntArray267;
		arg1.aByteArray35 = this.aByteArray35;
		arg1.aByteArray36 = this.aByteArray36;
		arg1.aShortArray76 = this.aShortArray76;
		arg1.aByte5 = this.aByte5;
		arg1.anIntArray273 = this.anIntArray273;
		arg1.anIntArray268 = this.anIntArray268;
		arg1.anIntArray271 = this.anIntArray271;
		arg1.anIntArrayArray23 = this.anIntArrayArray23;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.aBoolean139 = super.aBoolean139;
		arg1.aBoolean140 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!le;")
	public Class12_Sub2_Sub1 method1877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean140) {
			this.method1874();
		}
		@Pc(9) int local9 = arg4 + this.aShort33;
		@Pc(14) int local14 = arg4 + this.aShort38;
		@Pc(19) int local19 = arg6 + this.aShort36;
		@Pc(24) int local24 = arg6 + this.aShort34;
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
		@Pc(150) Class12_Sub2_Sub1 local150;
		if (arg7) {
			local150 = new Class12_Sub2_Sub1();
			local150.anInt2632 = this.anInt2632;
			local150.anInt2633 = this.anInt2633;
			local150.anInt2631 = this.anInt2631;
			local150.anIntArray272 = this.anIntArray272;
			local150.anIntArray274 = this.anIntArray274;
			local150.anIntArray270 = this.anIntArray270;
			local150.anIntArray278 = this.anIntArray278;
			local150.anIntArray275 = this.anIntArray275;
			local150.anIntArray267 = this.anIntArray267;
			local150.aByteArray35 = this.aByteArray35;
			local150.aByteArray37 = this.aByteArray37;
			local150.aByteArray36 = this.aByteArray36;
			local150.aShortArray76 = this.aShortArray76;
			local150.aByte5 = this.aByte5;
			local150.anIntArray273 = this.anIntArray273;
			local150.anIntArray268 = this.anIntArray268;
			local150.anIntArray271 = this.anIntArray271;
			local150.anIntArrayArray23 = this.anIntArrayArray23;
			local150.anIntArrayArray22 = this.anIntArrayArray22;
			local150.aBoolean139 = super.aBoolean139;
			if (arg0 == 3) {
				local150.anIntArray269 = Static25.method3302(this.anIntArray269);
				local150.anIntArray276 = Static25.method3302(this.anIntArray276);
				local150.anIntArray277 = Static25.method3302(this.anIntArray277);
			} else {
				local150.anIntArray269 = this.anIntArray269;
				local150.anIntArray276 = new int[local150.anInt2632];
				local150.anIntArray277 = this.anIntArray277;
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
			for (local273 = 0; local273 < local150.anInt2632; local273++) {
				local281 = this.anIntArray269[local273] + arg4;
				local288 = this.anIntArray277[local273] + arg6;
				local292 = local281 & 0x7F;
				local296 = local288 & 0x7F;
				local300 = local281 >> 7;
				local304 = local288 >> 7;
				local326 = arg2[local300][local304] * (128 - local292) + arg2[local300 + 1][local304] * local292 >> 7;
				local352 = arg2[local300][local304 + 1] * (128 - local292) + arg2[local300 + 1][local304 + 1] * local292 >> 7;
				local364 = local326 * (128 - local296) + local352 * local296 >> 7;
				local150.anIntArray276[local273] = this.anIntArray276[local273] + local364 - arg5;
			}
		} else {
			@Pc(491) int local491;
			if (arg0 == 2) {
				for (local273 = 0; local273 < local150.anInt2632; local273++) {
					local281 = (this.anIntArray276[local273] << 16) / this.aShort39;
					if (local281 < arg1) {
						local288 = this.anIntArray269[local273] + arg4;
						local292 = this.anIntArray277[local273] + arg6;
						local296 = local288 & 0x7F;
						local300 = local292 & 0x7F;
						local304 = local288 >> 7;
						local326 = local292 >> 7;
						local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
						local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
						local491 = local352 * (128 - local300) + local364 * local300 >> 7;
						local150.anIntArray276[local273] = this.anIntArray276[local273] + (local491 - arg5) * (arg1 - local281) / arg1;
					} else {
						local150.anIntArray276[local273] = this.anIntArray276[local273];
					}
				}
			} else if (arg0 == 3) {
				local273 = (arg1 & 0xFF) * 4;
				local281 = (arg1 >> 8 & 0xFF) * 4;
				local150.method1868(arg2, arg4, arg5, arg6, local273, local281);
			} else if (arg0 == 4) {
				local273 = this.aShort40 - this.aShort39;
				for (local281 = 0; local281 < this.anInt2632; local281++) {
					local288 = this.anIntArray269[local281] + arg4;
					local292 = this.anIntArray277[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local150.anIntArray276[local281] = this.anIntArray276[local281] + local491 + local273 - arg5;
				}
			} else if (arg0 == 5) {
				local273 = this.aShort40 - this.aShort39;
				for (local281 = 0; local281 < this.anInt2632; local281++) {
					local288 = this.anIntArray269[local281] + arg4;
					local292 = this.anIntArray277[local281] + arg6;
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
					local150.anIntArray276[local281] = ((this.anIntArray276[local281] << 8) / local273 * local838 >> 8) - (arg5 - local491);
				}
			}
		}
		local150.aBoolean140 = false;
		return local150;
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "()I")
	@Override
	public int method1855() {
		if (!this.aBoolean140) {
			this.method1874();
		}
		return this.aShort36;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIIIII)V")
	public void method1879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean140) {
				this.method1874();
			}
			@Pc(6) int local6 = Static155.anInt3625;
			@Pc(8) int local8 = Static155.anInt3624;
			@Pc(12) int local12 = Class79.anIntArray377[0];
			@Pc(16) int local16 = Class79.anIntArray375[0];
			@Pc(20) int local20 = Class79.anIntArray377[arg0];
			@Pc(24) int local24 = Class79.anIntArray375[arg0];
			@Pc(28) int local28 = Class79.anIntArray377[arg1];
			@Pc(32) int local32 = Class79.anIntArray375[arg1];
			@Pc(36) int local36 = Class79.anIntArray377[arg2];
			@Pc(40) int local40 = Class79.anIntArray375[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2632; local52++) {
				@Pc(58) int local58 = this.anIntArray269[local52];
				@Pc(63) int local63 = this.anIntArray276[local52];
				@Pc(68) int local68 = this.anIntArray277[local52];
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
				Static110.anIntArray287[local52] = local68 - local50;
				Static110.anIntArray290[local52] = local6 + (local58 << 9) / arg6;
				Static110.anIntArray285[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt2631 > 0) {
					Static110.anIntArray283[local52] = local58;
					Static110.anIntArray281[local52] = local80;
					Static110.anIntArray291[local52] = local68;
				}
			}
			this.method1869(false, false, 0L, this.aShort35, this.aShort35 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	@Override
	public void method1850() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2632; local1++) {
			@Pc(7) int local7 = this.anIntArray277[local1];
			this.anIntArray277[local1] = this.anIntArray269[local1];
			this.anIntArray269[local1] = -local7;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V")
	@Override
	public void method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2632; local1++) {
			this.anIntArray269[local1] += arg0;
			this.anIntArray276[local1] += arg1;
			this.anIntArray277[local1] += arg2;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	@Override
	public void method1857(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class79.anIntArray377[arg0];
		@Pc(7) int local7 = Class79.anIntArray375[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2632; local9++) {
			@Pc(26) int local26 = this.anIntArray277[local9] * local3 + this.anIntArray269[local9] * local7 >> 16;
			this.anIntArray277[local9] = this.anIntArray277[local9] * local7 - this.anIntArray269[local9] * local3 >> 16;
			this.anIntArray269[local9] = local26;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
	@Override
	public void method1851() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2632; local1++) {
			@Pc(7) int local7 = this.anIntArray269[local1];
			this.anIntArray269[local1] = this.anIntArray277[local1];
			this.anIntArray277[local1] = -local7;
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean140) {
				this.method1874();
			}
			@Pc(6) int local6 = Static155.anInt3625;
			@Pc(8) int local8 = Static155.anInt3624;
			@Pc(12) int local12 = Class79.anIntArray377[0];
			@Pc(16) int local16 = Class79.anIntArray375[0];
			@Pc(20) int local20 = Class79.anIntArray377[arg0];
			@Pc(24) int local24 = Class79.anIntArray375[arg0];
			@Pc(28) int local28 = Class79.anIntArray377[arg1];
			@Pc(32) int local32 = Class79.anIntArray375[arg1];
			@Pc(36) int local36 = Class79.anIntArray377[arg2];
			@Pc(40) int local40 = Class79.anIntArray375[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2632; local52++) {
				@Pc(58) int local58 = this.anIntArray269[local52];
				@Pc(63) int local63 = this.anIntArray276[local52];
				@Pc(68) int local68 = this.anIntArray277[local52];
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
				Static110.anIntArray287[local52] = local68 - local50;
				Static110.anIntArray290[local52] = local6 + (local58 << 9) / local68;
				Static110.anIntArray285[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt2631 > 0) {
					Static110.anIntArray283[local52] = local58;
					Static110.anIntArray281[local52] = local80;
					Static110.anIntArray291[local52] = local68;
				}
			}
			this.method1869(false, false, 0L, this.aShort35, this.aShort35 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "()I")
	@Override
	public int method1861() {
		if (!this.aBoolean140) {
			this.method1874();
		}
		return this.aShort37;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!cg;)Lclient!cg;")
	public Class12_Sub2 method1880(@OriginalArg(0) Class12_Sub2 arg0) {
		return new Class12_Sub2_Sub1(new Class12_Sub2_Sub1[] { this, (Class12_Sub2_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean140) {
			this.method1874();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort37 * arg2 + this.aShort40 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort37 * arg2 + this.aShort39 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort37 << 9;
		if (local78 / local38 <= Static132.anInt3021) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort37 << 9;
		if (local91 / local38 >= Static136.anInt3159) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort37 * arg1 + this.aShort40 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static53.anInt1533) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort37 * arg1 + this.aShort39 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static192.anInt4375) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt2631 > 0;
		@Pc(172) int local172 = Static155.anInt3625;
		@Pc(174) int local174 = Static155.anInt3624;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class79.anIntArray377[arg0];
			local178 = Class79.anIntArray375[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static48.aBoolean71 && local57 > 0) {
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
			if (Static126.anInt2959 >= local204 && Static126.anInt2959 <= local208 && Static163.anInt3819 >= local223 && Static163.anInt3819 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort33, this.aShort38, this.aShort33, this.aShort38, this.aShort33, this.aShort38, this.aShort33, this.aShort38 };
				@Pc(342) int[] local342 = new int[] { this.aShort36, this.aShort36, this.aShort34, this.aShort34, this.aShort36, this.aShort36, this.aShort34, this.aShort34 };
				@Pc(385) int[] local385 = new int[] { this.aShort39, this.aShort39, this.aShort39, this.aShort39, this.aShort40, this.aShort40, this.aShort40, this.aShort40 };
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
				if (Static126.anInt2959 >= local204 && Static126.anInt2959 <= local208 && Static163.anInt3819 >= local223 && Static163.anInt3819 <= local227) {
					if (super.aBoolean139) {
						Static26.aLongArray1[Static146.anInt3314++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt2632; local204++) {
			local223 = this.anIntArray269[local204];
			local208 = this.anIntArray276[local204];
			local227 = this.anIntArray277[local204];
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
			Static110.anIntArray287[local204] = local227 - local24;
			if (local227 >= 50) {
				Static110.anIntArray290[local204] = local172 + (local223 << 9) / local227;
				Static110.anIntArray285[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static110.anIntArray290[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static110.anIntArray283[local204] = local223;
				Static110.anIntArray281[local204] = local574;
				Static110.anIntArray291[local204] = local227;
			}
		}
		try {
			this.method1869(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V")
	private void method1881(@OriginalArg(0) int arg0) {
		if (Static110.aBooleanArray14[arg0]) {
			this.method1871(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray272[arg0];
		@Pc(17) int local17 = this.anIntArray274[arg0];
		@Pc(22) int local22 = this.anIntArray270[arg0];
		Static155.aBoolean209 = Static110.aBooleanArray15[arg0];
		if (this.aByteArray37 == null) {
			Static155.anInt3621 = 0;
		} else {
			Static155.anInt3621 = this.aByteArray37[arg0] & 0xFF;
		}
		if (this.aShortArray76 != null && this.aShortArray76[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray36 == null || this.aByteArray36[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray36[arg0] & 0xFF;
				local133 = this.anIntArray273[local128];
				local138 = this.anIntArray268[local128];
				local143 = this.anIntArray271[local128];
			}
			if (this.anIntArray267[arg0] == -1) {
				Static155.method2534(Static110.anIntArray285[local12], Static110.anIntArray285[local17], Static110.anIntArray285[local22], Static110.anIntArray290[local12], Static110.anIntArray290[local17], Static110.anIntArray290[local22], this.anIntArray278[arg0], this.anIntArray278[arg0], this.anIntArray278[arg0], Static110.anIntArray283[local133], Static110.anIntArray283[local138], Static110.anIntArray283[local143], Static110.anIntArray281[local133], Static110.anIntArray281[local138], Static110.anIntArray281[local143], Static110.anIntArray291[local133], Static110.anIntArray291[local138], Static110.anIntArray291[local143], this.aShortArray76[arg0]);
			} else {
				Static155.method2534(Static110.anIntArray285[local12], Static110.anIntArray285[local17], Static110.anIntArray285[local22], Static110.anIntArray290[local12], Static110.anIntArray290[local17], Static110.anIntArray290[local22], this.anIntArray278[arg0], this.anIntArray275[arg0], this.anIntArray267[arg0], Static110.anIntArray283[local133], Static110.anIntArray283[local138], Static110.anIntArray283[local143], Static110.anIntArray281[local133], Static110.anIntArray281[local138], Static110.anIntArray281[local143], Static110.anIntArray291[local133], Static110.anIntArray291[local138], Static110.anIntArray291[local143], this.aShortArray76[arg0]);
			}
		} else if (this.anIntArray267[arg0] == -1) {
			Static155.method2530(Static110.anIntArray285[local12], Static110.anIntArray285[local17], Static110.anIntArray285[local22], Static110.anIntArray290[local12], Static110.anIntArray290[local17], Static110.anIntArray290[local22], Static155.anIntArray373[this.anIntArray278[arg0]]);
		} else {
			Static155.method2524(Static110.anIntArray285[local12], Static110.anIntArray285[local17], Static110.anIntArray285[local22], Static110.anIntArray290[local12], Static110.anIntArray290[local17], Static110.anIntArray290[local22], this.anIntArray278[arg0], this.anIntArray275[arg0], this.anIntArray267[arg0]);
		}
	}
}
