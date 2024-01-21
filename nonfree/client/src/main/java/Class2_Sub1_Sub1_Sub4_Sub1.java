import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class2_Sub1_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!he", name = "P", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!he", name = "U", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!he", name = "X", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!he", name = "db", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!he", name = "jb", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!he", name = "lb", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!he", name = "mb", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!he", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!he", name = "ob", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!he", name = "rb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!he", name = "tb", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!he", name = "ub", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!he", name = "kb", descriptor = "I")
	private int anInt2130 = 0;

	@OriginalMember(owner = "client!he", name = "ib", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
	private int anInt2129 = 0;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
	private int anInt2128 = 0;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!cb;IIIII)V")
	public Class2_Sub1_Sub1_Sub4_Sub1(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method587();
		arg0.method585();
		this.anInt2128 = arg0.anInt732;
		this.anIntArray221 = arg0.anIntArray69;
		this.anIntArray223 = arg0.anIntArray71;
		this.anIntArray216 = arg0.anIntArray66;
		this.anInt2130 = arg0.anInt731;
		this.anIntArray214 = arg0.anIntArray72;
		this.anIntArray218 = arg0.anIntArray76;
		this.anIntArray213 = arg0.anIntArray75;
		this.aByteArray24 = arg0.aByteArray12;
		this.aByteArray25 = arg0.aByteArray14;
		this.aByte2 = arg0.aByte1;
		this.anIntArrayArray10 = arg0.anIntArrayArray5;
		this.anIntArrayArray11 = arg0.anIntArrayArray6;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray217 = new int[this.anInt2130];
		this.anIntArray222 = new int[this.anInt2130];
		this.anIntArray215 = new int[this.anInt2130];
		@Pc(118) int local118;
		if (arg0.aShortArray8 == null) {
			this.aShortArray41 = null;
		} else {
			this.aShortArray41 = new short[this.anInt2130];
			for (local118 = 0; local118 < this.anInt2130; local118++) {
				@Pc(124) short local124 = arg0.aShortArray8[local118];
				if (local124 != -1 && Static45.anInterface1_2.method2882(local124)) {
					this.aShortArray41[local118] = local124;
				} else {
					this.aShortArray41[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt733 > 0 && arg0.aByteArray9 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt733];
			for (@Pc(164) int local164 = 0; local164 < this.anInt2130; local164++) {
				if (arg0.aByteArray9[local164] != -1) {
					local162[arg0.aByteArray9[local164] & 0xFF]++;
				}
			}
			this.anInt2129 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt733; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray5[local193] == 0) {
					this.anInt2129++;
				}
			}
			this.anIntArray224 = new int[this.anInt2129];
			this.anIntArray219 = new int[this.anInt2129];
			this.anIntArray220 = new int[this.anInt2129];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt733; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray5[local233] == 0) {
					this.anIntArray224[local231] = arg0.aShortArray12[local233] & 0xFFFF;
					this.anIntArray219[local231] = arg0.aShortArray10[local233] & 0xFFFF;
					this.anIntArray220[local231] = arg0.aShortArray9[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray23 = new byte[this.anInt2130];
			for (local295 = 0; local295 < this.anInt2130; local295++) {
				if (arg0.aByteArray9[local295] == -1) {
					this.aByteArray23[local295] = -1;
				} else {
					this.aByteArray23[local295] = (byte) local162[arg0.aByteArray9[local295] & 0xFF];
					if (this.aByteArray23[local295] == -1 && this.aShortArray41 != null) {
						this.aShortArray41[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt2130; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray8 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray8[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray14 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray14[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray41 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray41[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class7 local417;
			@Pc(578) Class87 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray11[local118] & 0xFFFF;
					if (arg0.aClass7Array2 == null || arg0.aClass7Array2[this.anIntArray214[local118]] == null) {
						local417 = arg0.aClass7Array1[this.anIntArray214[local118]];
					} else {
						local417 = arg0.aClass7Array2[this.anIntArray214[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt390 + arg4 * local417.anInt391 + arg5 * local417.anInt388) / (local93 * local417.anInt389);
					this.anIntArray217[local118] = Static69.method1631(local398, local295);
					if (arg0.aClass7Array2 == null || arg0.aClass7Array2[this.anIntArray218[local118]] == null) {
						local417 = arg0.aClass7Array1[this.anIntArray218[local118]];
					} else {
						local417 = arg0.aClass7Array2[this.anIntArray218[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt390 + arg4 * local417.anInt391 + arg5 * local417.anInt388) / (local93 * local417.anInt389);
					this.anIntArray222[local118] = Static69.method1631(local398, local295);
					if (arg0.aClass7Array2 == null || arg0.aClass7Array2[this.anIntArray213[local118]] == null) {
						local417 = arg0.aClass7Array1[this.anIntArray213[local118]];
					} else {
						local417 = arg0.aClass7Array2[this.anIntArray213[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt390 + arg4 * local417.anInt391 + arg5 * local417.anInt388) / (local93 * local417.anInt389);
					this.anIntArray215[local118] = Static69.method1631(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass87Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt4445 + arg4 * local578.anInt4443 + arg5 * local578.anInt4442) / (local93 + local93 / 2);
					this.anIntArray217[local118] = Static69.method1631(arg0.aShortArray11[local118] & 0xFFFF, local295);
					this.anIntArray215[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray217[local118] = 128;
					this.anIntArray215[local118] = -1;
				} else {
					this.anIntArray215[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass7Array2 == null || arg0.aClass7Array2[this.anIntArray214[local118]] == null) {
					local417 = arg0.aClass7Array1[this.anIntArray214[local118]];
				} else {
					local417 = arg0.aClass7Array2[this.anIntArray214[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt390 + arg4 * local417.anInt391 + arg5 * local417.anInt388) / (local93 * local417.anInt389);
				this.anIntArray217[local118] = Static69.method1628(local295);
				if (arg0.aClass7Array2 == null || arg0.aClass7Array2[this.anIntArray218[local118]] == null) {
					local417 = arg0.aClass7Array1[this.anIntArray218[local118]];
				} else {
					local417 = arg0.aClass7Array2[this.anIntArray218[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt390 + arg4 * local417.anInt391 + arg5 * local417.anInt388) / (local93 * local417.anInt389);
				this.anIntArray222[local118] = Static69.method1628(local295);
				if (arg0.aClass7Array2 == null || arg0.aClass7Array2[this.anIntArray213[local118]] == null) {
					local417 = arg0.aClass7Array1[this.anIntArray213[local118]];
				} else {
					local417 = arg0.aClass7Array2[this.anIntArray213[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt390 + arg4 * local417.anInt391 + arg5 * local417.anInt388) / (local93 * local417.anInt389);
				this.anIntArray215[local118] = Static69.method1628(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass87Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt4445 + arg4 * local578.anInt4443 + arg5 * local578.anInt4442) / (local93 + local93 / 2);
				this.anIntArray217[local118] = Static69.method1628(local295);
				this.anIntArray215[local118] = -1;
			} else {
				this.anIntArray215[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([Lclient!he;I)V")
	private Class2_Sub1_Sub1_Sub4_Sub1(@OriginalArg(0) Class2_Sub1_Sub1_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2128 = 0;
		this.anInt2130 = 0;
		this.anInt2129 = 0;
		this.aByte2 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub1_Sub4_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2128 += local43.anInt2128;
				this.anInt2130 += local43.anInt2130;
				this.anInt2129 += local43.anInt2129;
				if (local43.aByteArray24 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local43.aByte2;
					}
					if (this.aByte2 != local43.aByte2) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray25 != null;
				local22 |= local43.aShortArray41 != null;
				local24 |= local43.aByteArray23 != null;
			}
		}
		this.anIntArray221 = new int[this.anInt2128];
		this.anIntArray223 = new int[this.anInt2128];
		this.anIntArray216 = new int[this.anInt2128];
		this.anIntArray214 = new int[this.anInt2130];
		this.anIntArray218 = new int[this.anInt2130];
		this.anIntArray213 = new int[this.anInt2130];
		this.anIntArray217 = new int[this.anInt2130];
		this.anIntArray222 = new int[this.anInt2130];
		this.anIntArray215 = new int[this.anInt2130];
		if (local18) {
			this.aByteArray24 = new byte[this.anInt2130];
		}
		if (local20) {
			this.aByteArray25 = new byte[this.anInt2130];
		}
		if (local22) {
			this.aShortArray41 = new short[this.anInt2130];
		}
		if (local24) {
			this.aByteArray23 = new byte[this.anInt2130];
		}
		if (this.anInt2129 > 0) {
			this.anIntArray224 = new int[this.anInt2129];
			this.anIntArray219 = new int[this.anInt2129];
			this.anIntArray220 = new int[this.anInt2129];
		}
		this.anInt2128 = 0;
		this.anInt2130 = 0;
		this.anInt2129 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class2_Sub1_Sub1_Sub4_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2130; local229++) {
					this.anIntArray214[this.anInt2130] = local225.anIntArray214[local229] + this.anInt2128;
					this.anIntArray218[this.anInt2130] = local225.anIntArray218[local229] + this.anInt2128;
					this.anIntArray213[this.anInt2130] = local225.anIntArray213[local229] + this.anInt2128;
					this.anIntArray217[this.anInt2130] = local225.anIntArray217[local229];
					this.anIntArray222[this.anInt2130] = local225.anIntArray222[local229];
					this.anIntArray215[this.anInt2130] = local225.anIntArray215[local229];
					if (local18) {
						if (local225.aByteArray24 == null) {
							this.aByteArray24[this.anInt2130] = local225.aByte2;
						} else {
							this.aByteArray24[this.anInt2130] = local225.aByteArray24[local229];
						}
					}
					if (local20 && local225.aByteArray25 != null) {
						this.aByteArray25[this.anInt2130] = local225.aByteArray25[local229];
					}
					if (local22) {
						if (local225.aShortArray41 == null) {
							this.aShortArray41[this.anInt2130] = -1;
						} else {
							this.aShortArray41[this.anInt2130] = local225.aShortArray41[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray23 == null || local225.aByteArray23[local229] == -1) {
							this.aByteArray23[this.anInt2130] = -1;
						} else {
							this.aByteArray23[this.anInt2130] = (byte) (local225.aByteArray23[local229] + this.anInt2129);
						}
					}
					this.anInt2130++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2129; local394++) {
					this.anIntArray224[this.anInt2129] = local225.anIntArray224[local394] + this.anInt2128;
					this.anIntArray219[this.anInt2129] = local225.anIntArray219[local394] + this.anInt2128;
					this.anIntArray220[this.anInt2129] = local225.anIntArray220[local394] + this.anInt2128;
					this.anInt2129++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2128; local444++) {
					this.anIntArray221[this.anInt2128] = local225.anIntArray221[local444];
					this.anIntArray223[this.anInt2128] = local225.anIntArray223[local444];
					this.anIntArray216[this.anInt2128] = local225.anIntArray216[local444];
					this.anInt2128++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean90) {
			this.method1636();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort17 * arg2 + this.aShort14 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort17 * arg2 + this.aShort16 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort17 << 9;
		if (local78 / local38 <= Static45.anInt1427) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort17 << 9;
		if (local91 / local38 >= Static45.anInt1426) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort17 * arg1 + this.aShort14 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static45.anInt1429) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort17 * arg1 + this.aShort16 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static45.anInt1425) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt2129 > 0;
		@Pc(172) int local172 = Static45.anInt1423;
		@Pc(174) int local174 = Static45.anInt1421;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg0];
			local178 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static84.aBoolean99 && local57 > 0) {
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
			local240 = Static182.anInt4410 - Static45.anInt1423;
			@Pc(244) int local244 = Static57.anInt1788 - Static45.anInt1421;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { this.aShort18, this.aShort15, this.aShort18, this.aShort15, this.aShort18, this.aShort15, this.aShort18, this.aShort15 };
				@Pc(350) int[] local350 = new int[] { this.aShort20, this.aShort20, this.aShort19, this.aShort19, this.aShort20, this.aShort20, this.aShort19, this.aShort19 };
				@Pc(393) int[] local393 = new int[] { this.aShort16, this.aShort16, this.aShort16, this.aShort16, this.aShort14, this.aShort14, this.aShort14, this.aShort14 };
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
					if (super.aBoolean89) {
						Static119.aLongArray6[Static125.anInt3409++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt2128; local204++) {
			local223 = this.anIntArray221[local204];
			local208 = this.anIntArray223[local204];
			local227 = this.anIntArray216[local204];
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
			Static69.anIntArray237[local204] = local227 - local24;
			if (local227 >= 50) {
				Static69.anIntArray233[local204] = local172 + (local223 << 9) / local227;
				Static69.anIntArray235[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static69.anIntArray233[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static69.anIntArray228[local204] = local223;
				Static69.anIntArray236[local204] = local240;
				Static69.anIntArray227[local204] = local227;
			}
		}
		try {
			this.method1625(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZJII)V")
	private void method1625(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static69.anIntArray225[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt2130; local16++) {
			if (this.anIntArray215[local16] != -2) {
				local28 = this.anIntArray214[local16];
				local33 = this.anIntArray218[local16];
				local38 = this.anIntArray213[local16];
				local42 = Static69.anIntArray233[local28];
				local46 = Static69.anIntArray233[local33];
				local50 = Static69.anIntArray233[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static69.anIntArray228[local28];
					local69 = Static69.anIntArray228[local33];
					@Pc(73) int local73 = Static69.anIntArray228[local38];
					@Pc(77) int local77 = Static69.anIntArray236[local28];
					local81 = Static69.anIntArray236[local33];
					local85 = Static69.anIntArray236[local38];
					@Pc(89) int local89 = Static69.anIntArray227[local28];
					local93 = Static69.anIntArray227[local33];
					@Pc(97) int local97 = Static69.anIntArray227[local38];
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
						@Pc(177) int local177 = (Static69.anIntArray237[local28] + Static69.anIntArray237[local33] + Static69.anIntArray237[local38]) / 3 + arg3;
						Static69.anIntArrayArray12[local177][Static69.anIntArray225[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1632(Static182.anInt4410, Static57.anInt1788, Static69.anIntArray235[local28], Static69.anIntArray235[local33], Static69.anIntArray235[local38], local42, local46, local50)) {
						Static119.aLongArray6[Static125.anInt3409++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static69.anIntArray235[local38] - Static69.anIntArray235[local33]) - (Static69.anIntArray235[local28] - Static69.anIntArray235[local33]) * (local50 - local46) > 0) {
						Static69.aBooleanArray10[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static45.anInt1424 && local46 <= Static45.anInt1424 && local50 <= Static45.anInt1424) {
							Static69.aBooleanArray11[local16] = false;
						} else {
							Static69.aBooleanArray11[local16] = true;
						}
						local65 = (Static69.anIntArray237[local28] + Static69.anIntArray237[local33] + Static69.anIntArray237[local38]) / 3 + arg3;
						Static69.anIntArrayArray12[local65][Static69.anIntArray225[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray24 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static69.anIntArray225[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static69.anIntArrayArray12[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1634(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static69.anIntArray232[local28] = 0;
			Static69.anIntArray230[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static69.anIntArray225[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static69.anIntArrayArray12[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray24[local50];
					local69 = Static69.anIntArray232[local382]++;
					Static69.anIntArrayArray13[local382][local69] = local50;
					if (local382 < 10) {
						Static69.anIntArray230[local382] += local33;
					} else if (local382 == 10) {
						Static69.anIntArray234[local69] = local33;
					} else {
						Static69.anIntArray238[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static69.anIntArray232[1] > 0 || Static69.anIntArray232[2] > 0) {
			local38 = (Static69.anIntArray230[1] + Static69.anIntArray230[2]) / (Static69.anIntArray232[1] + Static69.anIntArray232[2]);
		}
		local42 = 0;
		if (Static69.anIntArray232[3] > 0 || Static69.anIntArray232[4] > 0) {
			local42 = (Static69.anIntArray230[3] + Static69.anIntArray230[4]) / (Static69.anIntArray232[3] + Static69.anIntArray232[4]);
		}
		local46 = 0;
		if (Static69.anIntArray232[6] > 0 || Static69.anIntArray232[8] > 0) {
			local46 = (Static69.anIntArray230[6] + Static69.anIntArray230[8]) / (Static69.anIntArray232[6] + Static69.anIntArray232[8]);
		}
		local65 = 0;
		local69 = Static69.anIntArray232[10];
		@Pc(515) int[] local515 = Static69.anIntArrayArray13[10];
		@Pc(517) int[] local517 = Static69.anIntArray234;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static69.anIntArray232[11];
			local515 = Static69.anIntArrayArray13[11];
			local517 = Static69.anIntArray238;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1634(local515[local65++]);
				if (local65 == local69 && local515 != Static69.anIntArrayArray13[11]) {
					local65 = 0;
					local69 = Static69.anIntArray232[11];
					local515 = Static69.anIntArrayArray13[11];
					local517 = Static69.anIntArray238;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1634(local515[local65++]);
				if (local65 == local69 && local515 != Static69.anIntArrayArray13[11]) {
					local65 = 0;
					local69 = Static69.anIntArray232[11];
					local515 = Static69.anIntArrayArray13[11];
					local517 = Static69.anIntArray238;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1634(local515[local65++]);
				if (local65 == local69 && local515 != Static69.anIntArrayArray13[11]) {
					local65 = 0;
					local69 = Static69.anIntArray232[11];
					local515 = Static69.anIntArrayArray13[11];
					local517 = Static69.anIntArray238;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static69.anIntArray232[local81];
			@Pc(680) int[] local680 = Static69.anIntArrayArray13[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1634(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1634(local515[local65++]);
			if (local65 == local69 && local515 != Static69.anIntArrayArray13[11]) {
				local65 = 0;
				local515 = Static69.anIntArrayArray13[11];
				local69 = Static69.anIntArray232[11];
				local517 = Static69.anIntArray238;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "()V")
	@Override
	public void method1620() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2128; local1++) {
			this.anIntArray221[local1] = -this.anIntArray221[local1];
			this.anIntArray216[local1] = -this.anIntArray216[local1];
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!fe;)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method1626(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0) {
		return new Class2_Sub1_Sub1_Sub4_Sub1(new Class2_Sub1_Sub1_Sub4_Sub1[] { this, (Class2_Sub1_Sub1_Sub4_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
	@Override
	public void method1617() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2128; local1++) {
			@Pc(7) int local7 = this.anIntArray221[local1];
			this.anIntArray221[local1] = this.anIntArray216[local1];
			this.anIntArray216[local1] = -local7;
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([[IIIIZI)Lclient!he;")
	public Class2_Sub1_Sub1_Sub4_Sub1 method1627(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!this.aBoolean90) {
			this.method1636();
		}
		@Pc(9) int local9 = arg1 + this.aShort18;
		@Pc(14) int local14 = arg1 + this.aShort15;
		@Pc(19) int local19 = arg3 + this.aShort20;
		@Pc(24) int local24 = arg3 + this.aShort19;
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
		@Pc(104) Class2_Sub1_Sub1_Sub4_Sub1 local104;
		if (arg4) {
			local104 = new Class2_Sub1_Sub1_Sub4_Sub1();
			local104.anInt2128 = this.anInt2128;
			local104.anInt2130 = this.anInt2130;
			local104.anInt2129 = this.anInt2129;
			local104.anIntArray221 = this.anIntArray221;
			local104.anIntArray216 = this.anIntArray216;
			local104.anIntArray214 = this.anIntArray214;
			local104.anIntArray218 = this.anIntArray218;
			local104.anIntArray213 = this.anIntArray213;
			local104.anIntArray217 = this.anIntArray217;
			local104.anIntArray222 = this.anIntArray222;
			local104.anIntArray215 = this.anIntArray215;
			local104.aByteArray24 = this.aByteArray24;
			local104.aByteArray25 = this.aByteArray25;
			local104.aByteArray23 = this.aByteArray23;
			local104.aShortArray41 = this.aShortArray41;
			local104.aByte2 = this.aByte2;
			local104.anIntArray224 = this.anIntArray224;
			local104.anIntArray219 = this.anIntArray219;
			local104.anIntArray220 = this.anIntArray220;
			local104.anIntArrayArray10 = this.anIntArrayArray10;
			local104.anIntArrayArray11 = this.anIntArrayArray11;
			local104.aBoolean89 = super.aBoolean89;
			local104.anIntArray223 = new int[local104.anInt2128];
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
			for (local204 = 0; local204 < local104.anInt2128; local204++) {
				local212 = this.anIntArray221[local204] + arg1;
				local219 = this.anIntArray216[local204] + arg3;
				local223 = local212 & 0x7F;
				local227 = local219 & 0x7F;
				local231 = local212 >> 7;
				local235 = local219 >> 7;
				local257 = arg0[local231][local235] * (128 - local223) + arg0[local231 + 1][local235] * local223 >> 7;
				local283 = arg0[local231][local235 + 1] * (128 - local223) + arg0[local231 + 1][local235 + 1] * local223 >> 7;
				local295 = local257 * (128 - local227) + local283 * local227 >> 7;
				local104.anIntArray223[local204] = this.anIntArray223[local204] + local295 - arg2;
			}
		} else {
			for (local204 = 0; local204 < local104.anInt2128; local204++) {
				local212 = (this.anIntArray223[local204] << 16) / this.aShort16;
				if (local212 < arg5) {
					local219 = this.anIntArray221[local204] + arg1;
					local223 = this.anIntArray216[local204] + arg3;
					local227 = local219 & 0x7F;
					local231 = local223 & 0x7F;
					local235 = local219 >> 7;
					local257 = local223 >> 7;
					local283 = arg0[local235][local257] * (128 - local227) + arg0[local235 + 1][local257] * local227 >> 7;
					local295 = arg0[local235][local257 + 1] * (128 - local227) + arg0[local235 + 1][local257 + 1] * local227 >> 7;
					@Pc(419) int local419 = local283 * (128 - local231) + local295 * local231 >> 7;
					local104.anIntArray223[local204] = this.anIntArray223[local204] + (local419 - arg2) * (arg5 - local212) / arg5;
				} else {
					local104.anIntArray223[local204] = this.anIntArray223[local204];
				}
			}
		}
		local104.aBoolean90 = false;
		return local104;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
	@Override
	public void method1616(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg0];
		@Pc(7) int local7 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2128; local9++) {
			@Pc(26) int local26 = this.anIntArray223[local9] * local7 - this.anIntArray216[local9] * local3 >> 16;
			this.anIntArray216[local9] = this.anIntArray223[local9] * local3 + this.anIntArray216[local9] * local7 >> 16;
			this.anIntArray223[local9] = local26;
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!he;[B)Lclient!fe;")
	private Class2_Sub1_Sub1_Sub4 method1629(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub4_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2128 = this.anInt2128;
		arg1.anInt2130 = this.anInt2130;
		arg1.anInt2129 = this.anInt2129;
		if (arg1.anIntArray221 == null || arg1.anIntArray221.length < this.anInt2128) {
			arg1.anIntArray221 = new int[this.anInt2128 + 100];
			arg1.anIntArray223 = new int[this.anInt2128 + 100];
			arg1.anIntArray216 = new int[this.anInt2128 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2128; local43++) {
			arg1.anIntArray221[local43] = this.anIntArray221[local43];
			arg1.anIntArray223[local43] = this.anIntArray223[local43];
			arg1.anIntArray216[local43] = this.anIntArray216[local43];
		}
		if (arg0) {
			arg1.aByteArray25 = this.aByteArray25;
		} else {
			arg1.aByteArray25 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray25 == null) {
				for (local88 = 0; local88 < this.anInt2130; local88++) {
					arg1.aByteArray25[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2130; local88++) {
					arg1.aByteArray25[local88] = this.aByteArray25[local88];
				}
			}
		}
		arg1.anIntArray214 = this.anIntArray214;
		arg1.anIntArray218 = this.anIntArray218;
		arg1.anIntArray213 = this.anIntArray213;
		arg1.anIntArray217 = this.anIntArray217;
		arg1.anIntArray222 = this.anIntArray222;
		arg1.anIntArray215 = this.anIntArray215;
		arg1.aByteArray24 = this.aByteArray24;
		arg1.aByteArray23 = this.aByteArray23;
		arg1.aShortArray41 = this.aShortArray41;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray224 = this.anIntArray224;
		arg1.anIntArray219 = this.anIntArray219;
		arg1.anIntArray220 = this.anIntArray220;
		arg1.anIntArrayArray10 = this.anIntArrayArray10;
		arg1.anIntArrayArray11 = this.anIntArrayArray11;
		arg1.aBoolean89 = super.aBoolean89;
		arg1.aBoolean90 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!he", name = "j", descriptor = "(I)V")
	private void method1630(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static45.anInt1423;
		@Pc(3) int local3 = Static45.anInt1421;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray214[arg0];
		@Pc(15) int local15 = this.anIntArray218[arg0];
		@Pc(20) int local20 = this.anIntArray213[arg0];
		@Pc(24) int local24 = Static69.anIntArray227[local10];
		@Pc(28) int local28 = Static69.anIntArray227[local15];
		@Pc(32) int local32 = Static69.anIntArray227[local20];
		if (this.aByteArray25 == null) {
			Static45.anInt1422 = 0;
		} else {
			Static45.anInt1422 = this.aByteArray25[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static69.anIntArray229[0] = Static69.anIntArray233[local10];
			Static69.anIntArray226[0] = Static69.anIntArray235[local10];
			local5++;
			Static69.anIntArray231[0] = this.anIntArray217[arg0];
		} else {
			local73 = Static69.anIntArray228[local10];
			local77 = Static69.anIntArray236[local10];
			local82 = this.anIntArray217[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class2_Sub1_Sub7_Sub1.anIntArray130[local32 - local24];
				Static69.anIntArray229[0] = local1 + (local73 + ((Static69.anIntArray228[local20] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray226[0] = local3 + (local77 + ((Static69.anIntArray236[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static69.anIntArray231[0] = local82 + ((this.anIntArray215[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class2_Sub1_Sub7_Sub1.anIntArray130[local28 - local24];
				Static69.anIntArray229[local5] = local1 + (local73 + ((Static69.anIntArray228[local15] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray226[local5] = local3 + (local77 + ((Static69.anIntArray236[local15] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray231[local5++] = local82 + ((this.anIntArray222[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static69.anIntArray229[local5] = Static69.anIntArray233[local15];
			Static69.anIntArray226[local5] = Static69.anIntArray235[local15];
			Static69.anIntArray231[local5++] = this.anIntArray222[arg0];
		} else {
			local73 = Static69.anIntArray228[local15];
			local77 = Static69.anIntArray236[local15];
			local82 = this.anIntArray222[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class2_Sub1_Sub7_Sub1.anIntArray130[local24 - local28];
				Static69.anIntArray229[local5] = local1 + (local73 + ((Static69.anIntArray228[local10] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray226[local5] = local3 + (local77 + ((Static69.anIntArray236[local10] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray231[local5++] = local82 + ((this.anIntArray217[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class2_Sub1_Sub7_Sub1.anIntArray130[local32 - local28];
				Static69.anIntArray229[local5] = local1 + (local73 + ((Static69.anIntArray228[local20] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray226[local5] = local3 + (local77 + ((Static69.anIntArray236[local20] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray231[local5++] = local82 + ((this.anIntArray215[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static69.anIntArray229[local5] = Static69.anIntArray233[local20];
			Static69.anIntArray226[local5] = Static69.anIntArray235[local20];
			Static69.anIntArray231[local5++] = this.anIntArray215[arg0];
		} else {
			local73 = Static69.anIntArray228[local20];
			local77 = Static69.anIntArray236[local20];
			local82 = this.anIntArray215[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class2_Sub1_Sub7_Sub1.anIntArray130[local28 - local32];
				Static69.anIntArray229[local5] = local1 + (local73 + ((Static69.anIntArray228[local15] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray226[local5] = local3 + (local77 + ((Static69.anIntArray236[local15] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray231[local5++] = local82 + ((this.anIntArray222[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class2_Sub1_Sub7_Sub1.anIntArray130[local24 - local32];
				Static69.anIntArray229[local5] = local1 + (local73 + ((Static69.anIntArray228[local10] - local73) * local95 >> 16) << 9) / 50;
				Static69.anIntArray226[local5] = local3 + (local77 + ((Static69.anIntArray236[local10] - local77) * local95 >> 16) << 9) / 50;
				Static69.anIntArray231[local5++] = local82 + ((this.anIntArray217[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static69.anIntArray229[0];
		local77 = Static69.anIntArray229[1];
		local82 = Static69.anIntArray229[2];
		local95 = Static69.anIntArray226[0];
		@Pc(590) int local590 = Static69.anIntArray226[1];
		@Pc(594) int local594 = Static69.anIntArray226[2];
		Static45.aBoolean49 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static45.anInt1424 || local77 > Static45.anInt1424 || local82 > Static45.anInt1424) {
				Static45.aBoolean49 = true;
			}
			if (this.aShortArray41 != null && this.aShortArray41[arg0] != -1) {
				if (this.aByteArray23 == null || this.aByteArray23[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray23[arg0] & 0xFF;
					local683 = this.anIntArray224[local678];
					local688 = this.anIntArray219[local678];
					local693 = this.anIntArray220[local678];
				}
				if (this.anIntArray215[arg0] == -1) {
					Static45.method1054(local95, local590, local594, local73, local77, local82, this.anIntArray217[arg0], this.anIntArray217[arg0], this.anIntArray217[arg0], Static69.anIntArray228[local683], Static69.anIntArray228[local688], Static69.anIntArray228[local693], Static69.anIntArray236[local683], Static69.anIntArray236[local688], Static69.anIntArray236[local693], Static69.anIntArray227[local683], Static69.anIntArray227[local688], Static69.anIntArray227[local693], this.aShortArray41[arg0]);
				} else {
					Static45.method1054(local95, local590, local594, local73, local77, local82, Static69.anIntArray231[0], Static69.anIntArray231[1], Static69.anIntArray231[2], Static69.anIntArray228[local683], Static69.anIntArray228[local688], Static69.anIntArray228[local693], Static69.anIntArray236[local683], Static69.anIntArray236[local688], Static69.anIntArray236[local693], Static69.anIntArray227[local683], Static69.anIntArray227[local688], Static69.anIntArray227[local693], this.aShortArray41[arg0]);
				}
			} else if (this.anIntArray215[arg0] == -1) {
				Static45.method1040(local95, local590, local594, local73, local77, local82, Static45.anIntArray131[this.anIntArray217[arg0]]);
			} else {
				Static45.method1052(local95, local590, local594, local73, local77, local82, Static69.anIntArray231[0], Static69.anIntArray231[1], Static69.anIntArray231[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static45.anInt1424 || local77 > Static45.anInt1424 || local82 > Static45.anInt1424 || Static69.anIntArray229[3] < 0 || Static69.anIntArray229[3] > Static45.anInt1424) {
			Static45.aBoolean49 = true;
		}
		if (this.aShortArray41 == null || this.aShortArray41[arg0] == -1) {
			if (this.anIntArray215[arg0] == -1) {
				local683 = Static45.anIntArray131[this.anIntArray217[arg0]];
				Static45.method1040(local95, local590, local594, local73, local77, local82, local683);
				Static45.method1040(local95, local594, Static69.anIntArray226[3], local73, local82, Static69.anIntArray229[3], local683);
				return;
			}
			Static45.method1052(local95, local590, local594, local73, local77, local82, Static69.anIntArray231[0], Static69.anIntArray231[1], Static69.anIntArray231[2]);
			Static45.method1052(local95, local594, Static69.anIntArray226[3], local73, local82, Static69.anIntArray229[3], Static69.anIntArray231[0], Static69.anIntArray231[2], Static69.anIntArray231[3]);
			return;
		}
		if (this.aByteArray23 == null || this.aByteArray23[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray23[arg0] & 0xFF;
			local683 = this.anIntArray224[local678];
			local688 = this.anIntArray219[local678];
			local693 = this.anIntArray220[local678];
		}
		@Pc(956) short local956 = this.aShortArray41[arg0];
		if (this.anIntArray215[arg0] == -1) {
			Static45.method1054(local95, local590, local594, local73, local77, local82, this.anIntArray217[arg0], this.anIntArray217[arg0], this.anIntArray217[arg0], Static69.anIntArray228[local683], Static69.anIntArray228[local688], Static69.anIntArray228[local693], Static69.anIntArray236[local683], Static69.anIntArray236[local688], Static69.anIntArray236[local693], Static69.anIntArray227[local683], Static69.anIntArray227[local688], Static69.anIntArray227[local693], local956);
			Static45.method1054(local95, local594, Static69.anIntArray226[3], local73, local82, Static69.anIntArray229[3], this.anIntArray217[arg0], this.anIntArray217[arg0], this.anIntArray217[arg0], Static69.anIntArray228[local683], Static69.anIntArray228[local688], Static69.anIntArray228[local693], Static69.anIntArray236[local683], Static69.anIntArray236[local688], Static69.anIntArray236[local693], Static69.anIntArray227[local683], Static69.anIntArray227[local688], Static69.anIntArray227[local693], local956);
			return;
		}
		Static45.method1054(local95, local590, local594, local73, local77, local82, Static69.anIntArray231[0], Static69.anIntArray231[1], Static69.anIntArray231[2], Static69.anIntArray228[local683], Static69.anIntArray228[local688], Static69.anIntArray228[local693], Static69.anIntArray236[local683], Static69.anIntArray236[local688], Static69.anIntArray236[local693], Static69.anIntArray227[local683], Static69.anIntArray227[local688], Static69.anIntArray227[local693], local956);
		Static45.method1054(local95, local594, Static69.anIntArray226[3], local73, local82, Static69.anIntArray229[3], Static69.anIntArray231[0], Static69.anIntArray231[2], Static69.anIntArray231[3], Static69.anIntArray228[local683], Static69.anIntArray228[local688], Static69.anIntArray228[local693], Static69.anIntArray236[local683], Static69.anIntArray236[local688], Static69.anIntArray236[local693], Static69.anIntArray227[local683], Static69.anIntArray227[local688], Static69.anIntArray227[local693], local956);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean90) {
				this.method1636();
			}
			@Pc(6) int local6 = Static45.anInt1423;
			@Pc(8) int local8 = Static45.anInt1421;
			@Pc(12) int local12 = Class2_Sub1_Sub7_Sub1.anIntArray133[0];
			@Pc(16) int local16 = Class2_Sub1_Sub7_Sub1.anIntArray129[0];
			@Pc(20) int local20 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg0];
			@Pc(24) int local24 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg0];
			@Pc(28) int local28 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg1];
			@Pc(32) int local32 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg1];
			@Pc(36) int local36 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg2];
			@Pc(40) int local40 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2128; local52++) {
				@Pc(58) int local58 = this.anIntArray221[local52];
				@Pc(63) int local63 = this.anIntArray223[local52];
				@Pc(68) int local68 = this.anIntArray216[local52];
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
				Static69.anIntArray237[local52] = local68 - local50;
				Static69.anIntArray233[local52] = local6 + (local58 << 9) / local68;
				Static69.anIntArray235[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt2129 > 0) {
					Static69.anIntArray228[local52] = local58;
					Static69.anIntArray236[local52] = local80;
					Static69.anIntArray227[local52] = local68;
				}
			}
			this.method1625(false, false, 0L, this.aShort13, this.aShort13 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
	@Override
	public void method1612() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2128; local1++) {
			@Pc(7) int local7 = this.anIntArray216[local1];
			this.anIntArray216[local1] = this.anIntArray221[local1];
			this.anIntArray221[local1] = -local7;
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!hh;I)V")
	@Override
	public void method1613(@OriginalArg(0) Class2_Sub1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray10 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class15 local12 = arg0.aClass15Array1[arg1];
		@Pc(15) Class2_Sub11 local15 = local12.aClass2_Sub11_1;
		Static69.anInt2131 = 0;
		Static69.anInt2133 = 0;
		Static69.anInt2132 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1075; local23++) {
			@Pc(29) short local29 = local12.aShortArray21[local23];
			if (local12.aShortArray17[local23] != -1) {
				this.method1633(0, local15.anIntArrayArray15[local12.aShortArray17[local23]], 0, 0, 0);
			}
			this.method1633(local15.anIntArray267[local29], local15.anIntArrayArray15[local29], local12.aShortArray20[local23], local12.aShortArray16[local23], local12.aShortArray19[local23]);
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(III)V")
	@Override
	public void method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2128; local1++) {
			this.anIntArray221[local1] += arg0;
			this.anIntArray223[local1] += arg1;
			this.anIntArray216[local1] += arg2;
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)Lclient!fe;")
	@Override
	public Class2_Sub1_Sub1_Sub4 method1619(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static69.aByteArray27.length < this.anInt2130) {
			Static69.aByteArray27 = new byte[this.anInt2130 + 100];
		}
		return this.method1629(arg0, Static69.aClass2_Sub1_Sub1_Sub4_Sub1_2, Static69.aByteArray27);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[IIII)V")
	private void method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static69.anInt2131 = 0;
			Static69.anInt2133 = 0;
			Static69.anInt2132 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray10.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray10[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static69.anInt2131 += this.anIntArray221[local36];
						Static69.anInt2133 += this.anIntArray223[local36];
						Static69.anInt2132 += this.anIntArray216[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static69.anInt2131 = Static69.anInt2131 / local6 + arg2;
				Static69.anInt2133 = Static69.anInt2133 / local6 + arg3;
				Static69.anInt2132 = Static69.anInt2132 / local6 + arg4;
			} else {
				Static69.anInt2131 = arg2;
				Static69.anInt2133 = arg3;
				Static69.anInt2132 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local115 = this.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray221[local31] += arg2;
						this.anIntArray223[local31] += arg3;
						this.anIntArray216[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local115 = this.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray221[local31] -= Static69.anInt2131;
						this.anIntArray223[local31] -= Static69.anInt2133;
						this.anIntArray216[local31] -= Static69.anInt2132;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg4];
							local217 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg4];
							local235 = this.anIntArray223[local31] * local36 + this.anIntArray221[local31] * local217 + 32767 >> 16;
							this.anIntArray223[local31] = this.anIntArray223[local31] * local217 + 32767 - this.anIntArray221[local31] * local36 >> 16;
							this.anIntArray221[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg2];
							local217 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg2];
							local235 = this.anIntArray223[local31] * local217 + 32767 - this.anIntArray216[local31] * local36 >> 16;
							this.anIntArray216[local31] = this.anIntArray223[local31] * local36 + this.anIntArray216[local31] * local217 + 32767 >> 16;
							this.anIntArray223[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg3];
							local217 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg3];
							local235 = this.anIntArray216[local31] * local36 + this.anIntArray221[local31] * local217 + 32767 >> 16;
							this.anIntArray216[local31] = this.anIntArray216[local31] * local217 + 32767 - this.anIntArray221[local31] * local36 >> 16;
							this.anIntArray221[local31] = local235;
						}
						this.anIntArray221[local31] += Static69.anInt2131;
						this.anIntArray223[local31] += Static69.anInt2133;
						this.anIntArray216[local31] += Static69.anInt2132;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local115 = this.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray221[local31] -= Static69.anInt2131;
						this.anIntArray223[local31] -= Static69.anInt2133;
						this.anIntArray216[local31] -= Static69.anInt2132;
						this.anIntArray221[local31] = this.anIntArray221[local31] * arg2 / 128;
						this.anIntArray223[local31] = this.anIntArray223[local31] * arg3 / 128;
						this.anIntArray216[local31] = this.anIntArray216[local31] * arg4 / 128;
						this.anIntArray221[local31] += Static69.anInt2131;
						this.anIntArray223[local31] += Static69.anInt2133;
						this.anIntArray216[local31] += Static69.anInt2132;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray11 != null && this.aByteArray25 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray11.length) {
					local115 = this.anIntArrayArray11[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray25[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray25[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "()I")
	@Override
	public int method1621() {
		if (!this.aBoolean90) {
			this.method1636();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!he", name = "k", descriptor = "(I)V")
	private void method1634(@OriginalArg(0) int arg0) {
		if (Static69.aBooleanArray10[arg0]) {
			this.method1630(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray214[arg0];
		@Pc(17) int local17 = this.anIntArray218[arg0];
		@Pc(22) int local22 = this.anIntArray213[arg0];
		Static45.aBoolean49 = Static69.aBooleanArray11[arg0];
		if (this.aByteArray25 == null) {
			Static45.anInt1422 = 0;
		} else {
			Static45.anInt1422 = this.aByteArray25[arg0] & 0xFF;
		}
		if (this.aShortArray41 != null && this.aShortArray41[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray23 == null || this.aByteArray23[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray23[arg0] & 0xFF;
				local133 = this.anIntArray224[local128];
				local138 = this.anIntArray219[local128];
				local143 = this.anIntArray220[local128];
			}
			if (this.anIntArray215[arg0] == -1) {
				Static45.method1054(Static69.anIntArray235[local12], Static69.anIntArray235[local17], Static69.anIntArray235[local22], Static69.anIntArray233[local12], Static69.anIntArray233[local17], Static69.anIntArray233[local22], this.anIntArray217[arg0], this.anIntArray217[arg0], this.anIntArray217[arg0], Static69.anIntArray228[local133], Static69.anIntArray228[local138], Static69.anIntArray228[local143], Static69.anIntArray236[local133], Static69.anIntArray236[local138], Static69.anIntArray236[local143], Static69.anIntArray227[local133], Static69.anIntArray227[local138], Static69.anIntArray227[local143], this.aShortArray41[arg0]);
			} else {
				Static45.method1054(Static69.anIntArray235[local12], Static69.anIntArray235[local17], Static69.anIntArray235[local22], Static69.anIntArray233[local12], Static69.anIntArray233[local17], Static69.anIntArray233[local22], this.anIntArray217[arg0], this.anIntArray222[arg0], this.anIntArray215[arg0], Static69.anIntArray228[local133], Static69.anIntArray228[local138], Static69.anIntArray228[local143], Static69.anIntArray236[local133], Static69.anIntArray236[local138], Static69.anIntArray236[local143], Static69.anIntArray227[local133], Static69.anIntArray227[local138], Static69.anIntArray227[local143], this.aShortArray41[arg0]);
			}
		} else if (this.anIntArray215[arg0] == -1) {
			Static45.method1040(Static69.anIntArray235[local12], Static69.anIntArray235[local17], Static69.anIntArray235[local22], Static69.anIntArray233[local12], Static69.anIntArray233[local17], Static69.anIntArray233[local22], Static45.anIntArray131[this.anIntArray217[arg0]]);
		} else {
			Static45.method1052(Static69.anIntArray235[local12], Static69.anIntArray235[local17], Static69.anIntArray235[local22], Static69.anIntArray233[local12], Static69.anIntArray233[local17], Static69.anIntArray233[local22], this.anIntArray217[arg0], this.anIntArray222[arg0], this.anIntArray215[arg0]);
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V")
	@Override
	public void method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2128; local1++) {
			this.anIntArray221[local1] = this.anIntArray221[local1] * arg0 / 128;
			this.anIntArray223[local1] = this.anIntArray223[local1] * arg1 / 128;
			this.anIntArray216[local1] = this.anIntArray216[local1] * arg2 / 128;
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!hh;ILclient!hh;I[I)V")
	@Override
	public void method1623(@OriginalArg(0) Class2_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1613(arg0, arg1);
			return;
		}
		@Pc(18) Class15 local18 = arg0.aClass15Array1[arg1];
		@Pc(23) Class15 local23 = arg2.aClass15Array1[arg3];
		@Pc(26) Class2_Sub11 local26 = local18.aClass2_Sub11_1;
		Static69.anInt2131 = 0;
		Static69.anInt2133 = 0;
		Static69.anInt2132 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1075; local41++) {
			@Pc(47) short local47 = local18.aShortArray21[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray267[local47] == 0) {
				if (local18.aShortArray17[local41] != -1) {
					this.method1633(0, local26.anIntArrayArray15[local18.aShortArray17[local41]], 0, 0, 0);
				}
				this.method1633(local26.anIntArray267[local47], local26.anIntArrayArray15[local47], local18.aShortArray20[local41], local18.aShortArray16[local41], local18.aShortArray19[local41]);
			}
		}
		Static69.anInt2131 = 0;
		Static69.anInt2133 = 0;
		Static69.anInt2132 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt1075; local125++) {
			@Pc(131) short local131 = local23.aShortArray21[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray267[local131] == 0) {
				if (local23.aShortArray17[local125] != -1) {
					this.method1633(0, local26.anIntArrayArray15[local23.aShortArray17[local125]], 0, 0, 0);
				}
				this.method1633(local26.anIntArray267[local131], local26.anIntArrayArray15[local131], local23.aShortArray20[local125], local23.aShortArray16[local125], local23.aShortArray19[local125]);
			}
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lclient!fe;")
	@Override
	public Class2_Sub1_Sub1_Sub4 method1615(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static69.aByteArray26.length < this.anInt2130) {
			Static69.aByteArray26 = new byte[this.anInt2130 + 100];
		}
		return this.method1629(arg0, Static69.aClass2_Sub1_Sub1_Sub4_Sub1_1, Static69.aByteArray26);
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "()V")
	private void method1636() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2128; local17++) {
			@Pc(23) int local23 = this.anIntArray221[local17];
			@Pc(28) int local28 = this.anIntArray223[local17];
			@Pc(33) int local33 = this.anIntArray216[local17];
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
		this.aShort15 = (short) local7;
		this.aShort16 = (short) local3;
		this.aShort14 = (short) local9;
		this.aShort20 = (short) local5;
		this.aShort19 = (short) local11;
		this.aShort17 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort13 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean90 = true;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		if (!this.aBoolean90) {
			this.method1636();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V")
	@Override
	public void method1618(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg0];
		@Pc(7) int local7 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2128; local9++) {
			@Pc(26) int local26 = this.anIntArray223[local9] * local3 + this.anIntArray221[local9] * local7 >> 16;
			this.anIntArray223[local9] = this.anIntArray223[local9] * local7 - this.anIntArray221[local9] * local3 >> 16;
			this.anIntArray221[local9] = local26;
		}
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean90) {
				this.method1636();
			}
			@Pc(6) int local6 = Static45.anInt1423;
			@Pc(8) int local8 = Static45.anInt1421;
			@Pc(12) int local12 = Class2_Sub1_Sub7_Sub1.anIntArray133[0];
			@Pc(16) int local16 = Class2_Sub1_Sub7_Sub1.anIntArray129[0];
			@Pc(20) int local20 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg0];
			@Pc(24) int local24 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg0];
			@Pc(28) int local28 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg1];
			@Pc(32) int local32 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg1];
			@Pc(36) int local36 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg2];
			@Pc(40) int local40 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2128; local52++) {
				@Pc(58) int local58 = this.anIntArray221[local52];
				@Pc(63) int local63 = this.anIntArray223[local52];
				@Pc(68) int local68 = this.anIntArray216[local52];
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
				Static69.anIntArray237[local52] = local68 - local50;
				Static69.anIntArray233[local52] = local6 + (local58 << 9) / arg6;
				Static69.anIntArray235[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt2129 > 0) {
					Static69.anIntArray228[local52] = local58;
					Static69.anIntArray236[local52] = local80;
					Static69.anIntArray227[local52] = local68;
				}
			}
			this.method1625(false, false, 0L, this.aShort13, this.aShort13 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}
}
