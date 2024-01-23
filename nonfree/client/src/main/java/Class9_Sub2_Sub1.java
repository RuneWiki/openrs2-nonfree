import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class9_Sub2_Sub1 extends Class9_Sub2 {

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!ji", name = "T", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!ji", name = "Y", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!ji", name = "cb", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
	private int anInt2278 = 0;

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
	public int anInt2279 = 0;

	@OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
	private int anInt2280 = 0;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class9_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!bc;IIIII)V")
	public Class9_Sub2_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method268();
		arg0.method293();
		this.anInt2279 = arg0.anInt400;
		this.anIntArray267 = arg0.anIntArray61;
		this.anIntArray276 = arg0.anIntArray58;
		this.anIntArray266 = arg0.anIntArray57;
		this.anInt2278 = arg0.anInt403;
		this.anIntArray272 = arg0.anIntArray54;
		this.anIntArray273 = arg0.anIntArray62;
		this.anIntArray269 = arg0.anIntArray56;
		this.aByteArray26 = arg0.aByteArray13;
		this.aByteArray27 = arg0.aByteArray8;
		this.aByte8 = arg0.aByte7;
		this.anIntArrayArray35 = arg0.anIntArrayArray11;
		this.anIntArrayArray36 = arg0.anIntArrayArray10;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray274 = new int[this.anInt2278];
		this.anIntArray270 = new int[this.anInt2278];
		this.anIntArray268 = new int[this.anInt2278];
		@Pc(118) int local118;
		if (arg0.aShortArray5 == null) {
			this.aShortArray26 = null;
		} else {
			this.aShortArray26 = new short[this.anInt2278];
			for (local118 = 0; local118 < this.anInt2278; local118++) {
				@Pc(124) short local124 = arg0.aShortArray5[local118];
				if (local124 != -1 && Static81.anInterface1_1.method1246(local124)) {
					this.aShortArray26[local118] = local124;
				} else {
					this.aShortArray26[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt401 > 0 && arg0.aByteArray5 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt401];
			for (@Pc(164) int local164 = 0; local164 < this.anInt2278; local164++) {
				if (arg0.aByteArray5[local164] != -1) {
					local162[arg0.aByteArray5[local164] & 0xFF]++;
				}
			}
			this.anInt2280 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt401; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray9[local193] == 0) {
					this.anInt2280++;
				}
			}
			this.anIntArray271 = new int[this.anInt2280];
			this.anIntArray265 = new int[this.anInt2280];
			this.anIntArray275 = new int[this.anInt2280];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt401; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray9[local233] == 0) {
					this.anIntArray271[local231] = arg0.aShortArray7[local233] & 0xFFFF;
					this.anIntArray265[local231] = arg0.aShortArray8[local233] & 0xFFFF;
					this.anIntArray275[local231] = arg0.aShortArray10[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray28 = new byte[this.anInt2278];
			for (local295 = 0; local295 < this.anInt2278; local295++) {
				if (arg0.aByteArray5[local295] == -1) {
					this.aByteArray28[local295] = -1;
				} else {
					this.aByteArray28[local295] = (byte) local162[arg0.aByteArray5[local295] & 0xFF];
					if (this.aByteArray28[local295] == -1 && this.aShortArray26 != null) {
						this.aShortArray26[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt2278; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray11 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray11[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray8 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray8[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray26 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray26[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class85 local417;
			@Pc(578) Class56 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray11[local118] & 0xFFFF;
					if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray272[local118]] == null) {
						local417 = arg0.aClass85Array1[this.anIntArray272[local118]];
					} else {
						local417 = arg0.aClass85Array2[this.anIntArray272[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3704 + arg4 * local417.anInt3702 + arg5 * local417.anInt3705) / (local93 * local417.anInt3708);
					this.anIntArray274[local118] = Static98.method1718(local398, local295);
					if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray273[local118]] == null) {
						local417 = arg0.aClass85Array1[this.anIntArray273[local118]];
					} else {
						local417 = arg0.aClass85Array2[this.anIntArray273[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3704 + arg4 * local417.anInt3702 + arg5 * local417.anInt3705) / (local93 * local417.anInt3708);
					this.anIntArray270[local118] = Static98.method1718(local398, local295);
					if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray269[local118]] == null) {
						local417 = arg0.aClass85Array1[this.anIntArray269[local118]];
					} else {
						local417 = arg0.aClass85Array2[this.anIntArray269[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3704 + arg4 * local417.anInt3702 + arg5 * local417.anInt3705) / (local93 * local417.anInt3708);
					this.anIntArray268[local118] = Static98.method1718(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass56Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt2350 + arg4 * local578.anInt2353 + arg5 * local578.anInt2349) / (local93 + local93 / 2);
					this.anIntArray274[local118] = Static98.method1718(arg0.aShortArray11[local118] & 0xFFFF, local295);
					this.anIntArray268[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray274[local118] = 128;
					this.anIntArray268[local118] = -1;
				} else {
					this.anIntArray268[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray272[local118]] == null) {
					local417 = arg0.aClass85Array1[this.anIntArray272[local118]];
				} else {
					local417 = arg0.aClass85Array2[this.anIntArray272[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3704 + arg4 * local417.anInt3702 + arg5 * local417.anInt3705) / (local93 * local417.anInt3708);
				this.anIntArray274[local118] = Static98.method1722(local295);
				if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray273[local118]] == null) {
					local417 = arg0.aClass85Array1[this.anIntArray273[local118]];
				} else {
					local417 = arg0.aClass85Array2[this.anIntArray273[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3704 + arg4 * local417.anInt3702 + arg5 * local417.anInt3705) / (local93 * local417.anInt3708);
				this.anIntArray270[local118] = Static98.method1722(local295);
				if (arg0.aClass85Array2 == null || arg0.aClass85Array2[this.anIntArray269[local118]] == null) {
					local417 = arg0.aClass85Array1[this.anIntArray269[local118]];
				} else {
					local417 = arg0.aClass85Array2[this.anIntArray269[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3704 + arg4 * local417.anInt3702 + arg5 * local417.anInt3705) / (local93 * local417.anInt3708);
				this.anIntArray268[local118] = Static98.method1722(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass56Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt2350 + arg4 * local578.anInt2353 + arg5 * local578.anInt2349) / (local93 + local93 / 2);
				this.anIntArray274[local118] = Static98.method1722(local295);
				this.anIntArray268[local118] = -1;
			} else {
				this.anIntArray268[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([Lclient!ji;I)V")
	private Class9_Sub2_Sub1(@OriginalArg(0) Class9_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2279 = 0;
		this.anInt2278 = 0;
		this.anInt2280 = 0;
		this.aByte8 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class9_Sub2_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2279 += local43.anInt2279;
				this.anInt2278 += local43.anInt2278;
				this.anInt2280 += local43.anInt2280;
				if (local43.aByteArray26 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local43.aByte8;
					}
					if (this.aByte8 != local43.aByte8) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray27 != null;
				local22 |= local43.aShortArray26 != null;
				local24 |= local43.aByteArray28 != null;
			}
		}
		this.anIntArray267 = new int[this.anInt2279];
		this.anIntArray276 = new int[this.anInt2279];
		this.anIntArray266 = new int[this.anInt2279];
		this.anIntArray272 = new int[this.anInt2278];
		this.anIntArray273 = new int[this.anInt2278];
		this.anIntArray269 = new int[this.anInt2278];
		this.anIntArray274 = new int[this.anInt2278];
		this.anIntArray270 = new int[this.anInt2278];
		this.anIntArray268 = new int[this.anInt2278];
		if (local18) {
			this.aByteArray26 = new byte[this.anInt2278];
		}
		if (local20) {
			this.aByteArray27 = new byte[this.anInt2278];
		}
		if (local22) {
			this.aShortArray26 = new short[this.anInt2278];
		}
		if (local24) {
			this.aByteArray28 = new byte[this.anInt2278];
		}
		if (this.anInt2280 > 0) {
			this.anIntArray271 = new int[this.anInt2280];
			this.anIntArray265 = new int[this.anInt2280];
			this.anIntArray275 = new int[this.anInt2280];
		}
		this.anInt2279 = 0;
		this.anInt2278 = 0;
		this.anInt2280 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class9_Sub2_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2278; local229++) {
					this.anIntArray272[this.anInt2278] = local225.anIntArray272[local229] + this.anInt2279;
					this.anIntArray273[this.anInt2278] = local225.anIntArray273[local229] + this.anInt2279;
					this.anIntArray269[this.anInt2278] = local225.anIntArray269[local229] + this.anInt2279;
					this.anIntArray274[this.anInt2278] = local225.anIntArray274[local229];
					this.anIntArray270[this.anInt2278] = local225.anIntArray270[local229];
					this.anIntArray268[this.anInt2278] = local225.anIntArray268[local229];
					if (local18) {
						if (local225.aByteArray26 == null) {
							this.aByteArray26[this.anInt2278] = local225.aByte8;
						} else {
							this.aByteArray26[this.anInt2278] = local225.aByteArray26[local229];
						}
					}
					if (local20 && local225.aByteArray27 != null) {
						this.aByteArray27[this.anInt2278] = local225.aByteArray27[local229];
					}
					if (local22) {
						if (local225.aShortArray26 == null) {
							this.aShortArray26[this.anInt2278] = -1;
						} else {
							this.aShortArray26[this.anInt2278] = local225.aShortArray26[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray28 == null || local225.aByteArray28[local229] == -1) {
							this.aByteArray28[this.anInt2278] = -1;
						} else {
							this.aByteArray28[this.anInt2278] = (byte) (local225.aByteArray28[local229] + this.anInt2280);
						}
					}
					this.anInt2278++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2280; local394++) {
					this.anIntArray271[this.anInt2280] = local225.anIntArray271[local394] + this.anInt2279;
					this.anIntArray265[this.anInt2280] = local225.anIntArray265[local394] + this.anInt2279;
					this.anIntArray275[this.anInt2280] = local225.anIntArray275[local394] + this.anInt2279;
					this.anInt2280++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2279; local444++) {
					this.anIntArray267[this.anInt2279] = local225.anIntArray267[local444];
					this.anIntArray276[this.anInt2279] = local225.anIntArray276[local444];
					this.anIntArray266[this.anInt2279] = local225.anIntArray266[local444];
					this.anInt2279++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean123) {
			this.method1716();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort15 * arg2 + this.aShort22 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort15 * arg2 + this.aShort18 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort15 << 9;
		if (local78 / local38 <= Static150.anInt3353) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort15 << 9;
		if (local91 / local38 >= Static135.anInt2931) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort15 * arg1 + this.aShort22 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static177.anInt3788) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort15 * arg1 + this.aShort18 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static182.anInt3877) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt2280 > 0;
		@Pc(172) int local172 = Static81.anInt1940;
		@Pc(174) int local174 = Static81.anInt1941;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class46.anIntArray226[arg0];
			local178 = Class46.anIntArray225[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static172.aBoolean205 && local57 > 0) {
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
			if (Static114.anInt2617 >= local204 && Static114.anInt2617 <= local208 && Static77.anInt1868 >= local223 && Static77.anInt1868 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort16, this.aShort17, this.aShort16, this.aShort17, this.aShort16, this.aShort17, this.aShort16, this.aShort17 };
				@Pc(342) int[] local342 = new int[] { this.aShort21, this.aShort21, this.aShort20, this.aShort20, this.aShort21, this.aShort21, this.aShort20, this.aShort20 };
				@Pc(385) int[] local385 = new int[] { this.aShort18, this.aShort18, this.aShort18, this.aShort18, this.aShort22, this.aShort22, this.aShort22, this.aShort22 };
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
				if (Static114.anInt2617 >= local204 && Static114.anInt2617 <= local208 && Static77.anInt1868 >= local223 && Static77.anInt1868 <= local227) {
					if (super.aBoolean122) {
						Static79.aLongArray5[Static140.anInt3125++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt2279; local204++) {
			local223 = this.anIntArray267[local204];
			local208 = this.anIntArray276[local204];
			local227 = this.anIntArray266[local204];
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
			Static98.anIntArray288[local204] = local227 - local24;
			if (local227 >= 50) {
				Static98.anIntArray277[local204] = local172 + (local223 << 9) / local227;
				Static98.anIntArray290[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static98.anIntArray277[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static98.anIntArray287[local204] = local223;
				Static98.anIntArray279[local204] = local574;
				Static98.anIntArray286[local204] = local227;
			}
		}
		try {
			this.method1712(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "()V")
	@Override
	public void method1704() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2279; local1++) {
			@Pc(7) int local7 = this.anIntArray266[local1];
			this.anIntArray266[local1] = this.anIntArray267[local1];
			this.anIntArray267[local1] = -local7;
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()I")
	@Override
	public int method1692() {
		if (!this.aBoolean123) {
			this.method1716();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	private void method1711(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static81.anInt1940;
		@Pc(3) int local3 = Static81.anInt1941;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray272[arg0];
		@Pc(15) int local15 = this.anIntArray273[arg0];
		@Pc(20) int local20 = this.anIntArray269[arg0];
		@Pc(24) int local24 = Static98.anIntArray286[local10];
		@Pc(28) int local28 = Static98.anIntArray286[local15];
		@Pc(32) int local32 = Static98.anIntArray286[local20];
		if (this.aByteArray27 == null) {
			Static81.anInt1939 = 0;
		} else {
			Static81.anInt1939 = this.aByteArray27[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static98.anIntArray280[0] = Static98.anIntArray277[local10];
			Static98.anIntArray289[0] = Static98.anIntArray290[local10];
			local5++;
			Static98.anIntArray278[0] = this.anIntArray274[arg0];
		} else {
			local73 = Static98.anIntArray287[local10];
			local77 = Static98.anIntArray279[local10];
			local82 = this.anIntArray274[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class46.anIntArray224[local32 - local24];
				Static98.anIntArray280[0] = local1 + (local73 + ((Static98.anIntArray287[local20] - local73) * local95 >> 16) << 9) / 50;
				Static98.anIntArray289[0] = local3 + (local77 + ((Static98.anIntArray279[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static98.anIntArray278[0] = local82 + ((this.anIntArray268[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class46.anIntArray224[local28 - local24];
				Static98.anIntArray280[local5] = local1 + (local73 + ((Static98.anIntArray287[local15] - local73) * local95 >> 16) << 9) / 50;
				Static98.anIntArray289[local5] = local3 + (local77 + ((Static98.anIntArray279[local15] - local77) * local95 >> 16) << 9) / 50;
				Static98.anIntArray278[local5++] = local82 + ((this.anIntArray270[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static98.anIntArray280[local5] = Static98.anIntArray277[local15];
			Static98.anIntArray289[local5] = Static98.anIntArray290[local15];
			Static98.anIntArray278[local5++] = this.anIntArray270[arg0];
		} else {
			local73 = Static98.anIntArray287[local15];
			local77 = Static98.anIntArray279[local15];
			local82 = this.anIntArray270[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class46.anIntArray224[local24 - local28];
				Static98.anIntArray280[local5] = local1 + (local73 + ((Static98.anIntArray287[local10] - local73) * local95 >> 16) << 9) / 50;
				Static98.anIntArray289[local5] = local3 + (local77 + ((Static98.anIntArray279[local10] - local77) * local95 >> 16) << 9) / 50;
				Static98.anIntArray278[local5++] = local82 + ((this.anIntArray274[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class46.anIntArray224[local32 - local28];
				Static98.anIntArray280[local5] = local1 + (local73 + ((Static98.anIntArray287[local20] - local73) * local95 >> 16) << 9) / 50;
				Static98.anIntArray289[local5] = local3 + (local77 + ((Static98.anIntArray279[local20] - local77) * local95 >> 16) << 9) / 50;
				Static98.anIntArray278[local5++] = local82 + ((this.anIntArray268[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static98.anIntArray280[local5] = Static98.anIntArray277[local20];
			Static98.anIntArray289[local5] = Static98.anIntArray290[local20];
			Static98.anIntArray278[local5++] = this.anIntArray268[arg0];
		} else {
			local73 = Static98.anIntArray287[local20];
			local77 = Static98.anIntArray279[local20];
			local82 = this.anIntArray268[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class46.anIntArray224[local28 - local32];
				Static98.anIntArray280[local5] = local1 + (local73 + ((Static98.anIntArray287[local15] - local73) * local95 >> 16) << 9) / 50;
				Static98.anIntArray289[local5] = local3 + (local77 + ((Static98.anIntArray279[local15] - local77) * local95 >> 16) << 9) / 50;
				Static98.anIntArray278[local5++] = local82 + ((this.anIntArray270[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class46.anIntArray224[local24 - local32];
				Static98.anIntArray280[local5] = local1 + (local73 + ((Static98.anIntArray287[local10] - local73) * local95 >> 16) << 9) / 50;
				Static98.anIntArray289[local5] = local3 + (local77 + ((Static98.anIntArray279[local10] - local77) * local95 >> 16) << 9) / 50;
				Static98.anIntArray278[local5++] = local82 + ((this.anIntArray274[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static98.anIntArray280[0];
		local77 = Static98.anIntArray280[1];
		local82 = Static98.anIntArray280[2];
		local95 = Static98.anIntArray289[0];
		@Pc(590) int local590 = Static98.anIntArray289[1];
		@Pc(594) int local594 = Static98.anIntArray289[2];
		Static81.aBoolean103 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static81.anInt1937 || local77 > Static81.anInt1937 || local82 > Static81.anInt1937) {
				Static81.aBoolean103 = true;
			}
			if (this.aShortArray26 != null && this.aShortArray26[arg0] != -1) {
				if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray28[arg0] & 0xFF;
					local683 = this.anIntArray271[local678];
					local688 = this.anIntArray265[local678];
					local693 = this.anIntArray275[local678];
				}
				if (this.anIntArray268[arg0] == -1) {
					Static81.method1441(local95, local590, local594, local73, local77, local82, this.anIntArray274[arg0], this.anIntArray274[arg0], this.anIntArray274[arg0], Static98.anIntArray287[local683], Static98.anIntArray287[local688], Static98.anIntArray287[local693], Static98.anIntArray279[local683], Static98.anIntArray279[local688], Static98.anIntArray279[local693], Static98.anIntArray286[local683], Static98.anIntArray286[local688], Static98.anIntArray286[local693], this.aShortArray26[arg0]);
				} else {
					Static81.method1441(local95, local590, local594, local73, local77, local82, Static98.anIntArray278[0], Static98.anIntArray278[1], Static98.anIntArray278[2], Static98.anIntArray287[local683], Static98.anIntArray287[local688], Static98.anIntArray287[local693], Static98.anIntArray279[local683], Static98.anIntArray279[local688], Static98.anIntArray279[local693], Static98.anIntArray286[local683], Static98.anIntArray286[local688], Static98.anIntArray286[local693], this.aShortArray26[arg0]);
				}
			} else if (this.anIntArray268[arg0] == -1) {
				Static81.method1449(local95, local590, local594, local73, local77, local82, Static81.anIntArray227[this.anIntArray274[arg0]]);
			} else {
				Static81.method1447(local95, local590, local594, local73, local77, local82, Static98.anIntArray278[0], Static98.anIntArray278[1], Static98.anIntArray278[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static81.anInt1937 || local77 > Static81.anInt1937 || local82 > Static81.anInt1937 || Static98.anIntArray280[3] < 0 || Static98.anIntArray280[3] > Static81.anInt1937) {
			Static81.aBoolean103 = true;
		}
		if (this.aShortArray26 == null || this.aShortArray26[arg0] == -1) {
			if (this.anIntArray268[arg0] == -1) {
				local683 = Static81.anIntArray227[this.anIntArray274[arg0]];
				Static81.method1449(local95, local590, local594, local73, local77, local82, local683);
				Static81.method1449(local95, local594, Static98.anIntArray289[3], local73, local82, Static98.anIntArray280[3], local683);
				return;
			}
			Static81.method1447(local95, local590, local594, local73, local77, local82, Static98.anIntArray278[0], Static98.anIntArray278[1], Static98.anIntArray278[2]);
			Static81.method1447(local95, local594, Static98.anIntArray289[3], local73, local82, Static98.anIntArray280[3], Static98.anIntArray278[0], Static98.anIntArray278[2], Static98.anIntArray278[3]);
			return;
		}
		if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray28[arg0] & 0xFF;
			local683 = this.anIntArray271[local678];
			local688 = this.anIntArray265[local678];
			local693 = this.anIntArray275[local678];
		}
		@Pc(956) short local956 = this.aShortArray26[arg0];
		if (this.anIntArray268[arg0] == -1) {
			Static81.method1441(local95, local590, local594, local73, local77, local82, this.anIntArray274[arg0], this.anIntArray274[arg0], this.anIntArray274[arg0], Static98.anIntArray287[local683], Static98.anIntArray287[local688], Static98.anIntArray287[local693], Static98.anIntArray279[local683], Static98.anIntArray279[local688], Static98.anIntArray279[local693], Static98.anIntArray286[local683], Static98.anIntArray286[local688], Static98.anIntArray286[local693], local956);
			Static81.method1441(local95, local594, Static98.anIntArray289[3], local73, local82, Static98.anIntArray280[3], this.anIntArray274[arg0], this.anIntArray274[arg0], this.anIntArray274[arg0], Static98.anIntArray287[local683], Static98.anIntArray287[local688], Static98.anIntArray287[local693], Static98.anIntArray279[local683], Static98.anIntArray279[local688], Static98.anIntArray279[local693], Static98.anIntArray286[local683], Static98.anIntArray286[local688], Static98.anIntArray286[local693], local956);
			return;
		}
		Static81.method1441(local95, local590, local594, local73, local77, local82, Static98.anIntArray278[0], Static98.anIntArray278[1], Static98.anIntArray278[2], Static98.anIntArray287[local683], Static98.anIntArray287[local688], Static98.anIntArray287[local693], Static98.anIntArray279[local683], Static98.anIntArray279[local688], Static98.anIntArray279[local693], Static98.anIntArray286[local683], Static98.anIntArray286[local688], Static98.anIntArray286[local693], local956);
		Static81.method1441(local95, local594, Static98.anIntArray289[3], local73, local82, Static98.anIntArray280[3], Static98.anIntArray278[0], Static98.anIntArray278[2], Static98.anIntArray278[3], Static98.anIntArray287[local683], Static98.anIntArray287[local688], Static98.anIntArray287[local693], Static98.anIntArray279[local683], Static98.anIntArray279[local688], Static98.anIntArray279[local693], Static98.anIntArray286[local683], Static98.anIntArray286[local688], Static98.anIntArray286[local693], local956);
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "()V")
	@Override
	public void method1708() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2279; local1++) {
			this.anIntArray267[local1] = -this.anIntArray267[local1];
			this.anIntArray266[local1] = -this.anIntArray266[local1];
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZJII)V")
	private void method1712(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static98.anIntArray281[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt2278; local16++) {
			if (this.anIntArray268[local16] != -2) {
				local28 = this.anIntArray272[local16];
				local33 = this.anIntArray273[local16];
				local38 = this.anIntArray269[local16];
				local42 = Static98.anIntArray277[local28];
				local46 = Static98.anIntArray277[local33];
				local50 = Static98.anIntArray277[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static98.anIntArray287[local28];
					local69 = Static98.anIntArray287[local33];
					@Pc(73) int local73 = Static98.anIntArray287[local38];
					@Pc(77) int local77 = Static98.anIntArray279[local28];
					local81 = Static98.anIntArray279[local33];
					local85 = Static98.anIntArray279[local38];
					@Pc(89) int local89 = Static98.anIntArray286[local28];
					local93 = Static98.anIntArray286[local33];
					@Pc(97) int local97 = Static98.anIntArray286[local38];
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
						Static98.aBooleanArray14[local16] = true;
						@Pc(177) int local177 = (Static98.anIntArray288[local28] + Static98.anIntArray288[local33] + Static98.anIntArray288[local38]) / 3 + arg3;
						Static98.anIntArrayArray37[local177][Static98.anIntArray281[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1717(Static114.anInt2617 + Static81.anInt1940, Static77.anInt1868 + Static81.anInt1941, Static98.anIntArray290[local28], Static98.anIntArray290[local33], Static98.anIntArray290[local38], local42, local46, local50)) {
						Static79.aLongArray5[Static140.anInt3125++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static98.anIntArray290[local38] - Static98.anIntArray290[local33]) - (Static98.anIntArray290[local28] - Static98.anIntArray290[local33]) * (local50 - local46) > 0) {
						Static98.aBooleanArray14[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static81.anInt1937 && local46 <= Static81.anInt1937 && local50 <= Static81.anInt1937) {
							Static98.aBooleanArray15[local16] = false;
						} else {
							Static98.aBooleanArray15[local16] = true;
						}
						local65 = (Static98.anIntArray288[local28] + Static98.anIntArray288[local33] + Static98.anIntArray288[local38]) / 3 + arg3;
						Static98.anIntArrayArray37[local65][Static98.anIntArray281[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray26 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static98.anIntArray281[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static98.anIntArrayArray37[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1723(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static98.anIntArray283[local28] = 0;
			Static98.anIntArray285[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static98.anIntArray281[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static98.anIntArrayArray37[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray26[local50];
					local69 = Static98.anIntArray283[local386]++;
					Static98.anIntArrayArray38[local386][local69] = local50;
					if (local386 < 10) {
						Static98.anIntArray285[local386] += local33;
					} else if (local386 == 10) {
						Static98.anIntArray282[local69] = local33;
					} else {
						Static98.anIntArray284[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static98.anIntArray283[1] > 0 || Static98.anIntArray283[2] > 0) {
			local38 = (Static98.anIntArray285[1] + Static98.anIntArray285[2]) / (Static98.anIntArray283[1] + Static98.anIntArray283[2]);
		}
		local42 = 0;
		if (Static98.anIntArray283[3] > 0 || Static98.anIntArray283[4] > 0) {
			local42 = (Static98.anIntArray285[3] + Static98.anIntArray285[4]) / (Static98.anIntArray283[3] + Static98.anIntArray283[4]);
		}
		local46 = 0;
		if (Static98.anIntArray283[6] > 0 || Static98.anIntArray283[8] > 0) {
			local46 = (Static98.anIntArray285[6] + Static98.anIntArray285[8]) / (Static98.anIntArray283[6] + Static98.anIntArray283[8]);
		}
		local65 = 0;
		local69 = Static98.anIntArray283[10];
		@Pc(519) int[] local519 = Static98.anIntArrayArray38[10];
		@Pc(521) int[] local521 = Static98.anIntArray282;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static98.anIntArray283[11];
			local519 = Static98.anIntArrayArray38[11];
			local521 = Static98.anIntArray284;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1723(local519[local65++]);
				if (local65 == local69 && local519 != Static98.anIntArrayArray38[11]) {
					local65 = 0;
					local69 = Static98.anIntArray283[11];
					local519 = Static98.anIntArrayArray38[11];
					local521 = Static98.anIntArray284;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1723(local519[local65++]);
				if (local65 == local69 && local519 != Static98.anIntArrayArray38[11]) {
					local65 = 0;
					local69 = Static98.anIntArray283[11];
					local519 = Static98.anIntArrayArray38[11];
					local521 = Static98.anIntArray284;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1723(local519[local65++]);
				if (local65 == local69 && local519 != Static98.anIntArrayArray38[11]) {
					local65 = 0;
					local69 = Static98.anIntArray283[11];
					local519 = Static98.anIntArrayArray38[11];
					local521 = Static98.anIntArray284;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static98.anIntArray283[local81];
			@Pc(684) int[] local684 = Static98.anIntArrayArray38[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1723(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1723(local519[local65++]);
			if (local65 == local69 && local519 != Static98.anIntArrayArray38[11]) {
				local65 = 0;
				local519 = Static98.anIntArrayArray38[11];
				local69 = Static98.anIntArray283[11];
				local521 = Static98.anIntArray284;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "()I")
	@Override
	public int method1707() {
		if (!this.aBoolean123) {
			this.method1716();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()I")
	@Override
	public int method1693() {
		if (!this.aBoolean123) {
			this.method1716();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!ji;")
	public Class9_Sub2_Sub1 method1714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean123) {
			this.method1716();
		}
		@Pc(9) int local9 = arg4 + this.aShort16;
		@Pc(14) int local14 = arg4 + this.aShort17;
		@Pc(19) int local19 = arg6 + this.aShort21;
		@Pc(24) int local24 = arg6 + this.aShort20;
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
		@Pc(150) Class9_Sub2_Sub1 local150;
		if (arg7) {
			local150 = new Class9_Sub2_Sub1();
			local150.anInt2279 = this.anInt2279;
			local150.anInt2278 = this.anInt2278;
			local150.anInt2280 = this.anInt2280;
			local150.anIntArray272 = this.anIntArray272;
			local150.anIntArray273 = this.anIntArray273;
			local150.anIntArray269 = this.anIntArray269;
			local150.anIntArray274 = this.anIntArray274;
			local150.anIntArray270 = this.anIntArray270;
			local150.anIntArray268 = this.anIntArray268;
			local150.aByteArray26 = this.aByteArray26;
			local150.aByteArray27 = this.aByteArray27;
			local150.aByteArray28 = this.aByteArray28;
			local150.aShortArray26 = this.aShortArray26;
			local150.aByte8 = this.aByte8;
			local150.anIntArray271 = this.anIntArray271;
			local150.anIntArray265 = this.anIntArray265;
			local150.anIntArray275 = this.anIntArray275;
			local150.anIntArrayArray35 = this.anIntArrayArray35;
			local150.anIntArrayArray36 = this.anIntArrayArray36;
			local150.aBoolean122 = super.aBoolean122;
			if (arg0 == 3) {
				local150.anIntArray267 = Static66.method1179(this.anIntArray267);
				local150.anIntArray276 = Static66.method1179(this.anIntArray276);
				local150.anIntArray266 = Static66.method1179(this.anIntArray266);
			} else {
				local150.anIntArray267 = this.anIntArray267;
				local150.anIntArray276 = new int[local150.anInt2279];
				local150.anIntArray266 = this.anIntArray266;
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
			for (local273 = 0; local273 < local150.anInt2279; local273++) {
				local281 = this.anIntArray267[local273] + arg4;
				local288 = this.anIntArray266[local273] + arg6;
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
				for (local273 = 0; local273 < local150.anInt2279; local273++) {
					local281 = (this.anIntArray276[local273] << 16) / this.aShort18;
					if (local281 < arg1) {
						local288 = this.anIntArray267[local273] + arg4;
						local292 = this.anIntArray266[local273] + arg6;
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
				local150.method1697(arg2, arg4, arg5, arg6, local273, local281);
			} else if (arg0 == 4) {
				local273 = this.aShort22 - this.aShort18;
				for (local281 = 0; local281 < this.anInt2279; local281++) {
					local288 = this.anIntArray267[local281] + arg4;
					local292 = this.anIntArray266[local281] + arg6;
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
				local273 = this.aShort22 - this.aShort18;
				for (local281 = 0; local281 < this.anInt2279; local281++) {
					local288 = this.anIntArray267[local281] + arg4;
					local292 = this.anIntArray266[local281] + arg6;
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
		local150.aBoolean123 = false;
		return local150;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!cf;)Lclient!cf;")
	public Class9_Sub2 method1715(@OriginalArg(0) Class9_Sub2 arg0) {
		return new Class9_Sub2_Sub1(new Class9_Sub2_Sub1[] { this, (Class9_Sub2_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	@Override
	public void method1698(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class46.anIntArray226[arg0];
		@Pc(7) int local7 = Class46.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2279; local9++) {
			@Pc(26) int local26 = this.anIntArray276[local9] * local7 - this.anIntArray266[local9] * local3 >> 16;
			this.anIntArray266[local9] = this.anIntArray276[local9] * local3 + this.anIntArray266[local9] * local7 >> 16;
			this.anIntArray276[local9] = local26;
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "()I")
	@Override
	public int method1695() {
		if (!this.aBoolean123) {
			this.method1716();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "()V")
	private void method1716() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2279; local17++) {
			@Pc(23) int local23 = this.anIntArray267[local17];
			@Pc(28) int local28 = this.anIntArray276[local17];
			@Pc(33) int local33 = this.anIntArray266[local17];
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
		this.aShort16 = (short) local1;
		this.aShort17 = (short) local7;
		this.aShort18 = (short) local3;
		this.aShort22 = (short) local9;
		this.aShort21 = (short) local5;
		this.aShort20 = (short) local11;
		this.aShort15 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort19 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean123 = true;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(III)V")
	@Override
	public void method1696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2279; local1++) {
			this.anIntArray267[local1] = this.anIntArray267[local1] * arg0 / 128;
			this.anIntArray276[local1] = this.anIntArray276[local1] * arg1 / 128;
			this.anIntArray266[local1] = this.anIntArray266[local1] * arg2 / 128;
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(ZZ)Lclient!cf;")
	@Override
	public Class9_Sub2 method1703(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static98.aByteArray29.length < this.anInt2278) {
			Static98.aByteArray29 = new byte[this.anInt2278 + 100];
		}
		return this.method1721(arg0, Static98.aClass9_Sub2_Sub1_1, Static98.aByteArray29);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!lb;IZ)V")
	@Override
	public void method1709(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArrayArray35 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class69 local12 = arg0.aClass69Array1[arg1];
		@Pc(15) Class1_Sub4 local15 = local12.aClass1_Sub4_1;
		Static98.anInt2281 = 0;
		Static98.anInt2283 = 0;
		Static98.anInt2282 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2794; local23++) {
			@Pc(29) short local29 = local12.aShortArray37[local23];
			if (local12.aShortArray39[local23] != -1) {
				this.method1719(0, local15.anIntArrayArray12[local12.aShortArray39[local23]], 0, 0, 0);
			}
			this.method1719(local15.anIntArray87[local29], local15.anIntArrayArray12[local29], local12.aShortArray41[local23], local12.aShortArray35[local23], local12.aShortArray38[local23]);
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!lb;ILclient!lb;I[IZ)V")
	@Override
	public void method1705(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1709(arg0, arg1, arg5);
			return;
		}
		@Pc(19) Class69 local19 = arg0.aClass69Array1[arg1];
		@Pc(24) Class69 local24 = arg2.aClass69Array1[arg3];
		@Pc(27) Class1_Sub4 local27 = local19.aClass1_Sub4_1;
		Static98.anInt2281 = 0;
		Static98.anInt2283 = 0;
		Static98.anInt2282 = 0;
		@Pc(35) byte local35 = 0;
		@Pc(38) int local38 = local35 + 1;
		@Pc(40) int local40 = arg4[0];
		for (@Pc(42) int local42 = 0; local42 < local19.anInt2794; local42++) {
			@Pc(48) short local48 = local19.aShortArray37[local42];
			while (local48 > local40) {
				local40 = arg4[local38++];
			}
			if (local48 != local40 || local27.anIntArray87[local48] == 0) {
				if (local19.aShortArray39[local42] != -1) {
					this.method1719(0, local27.anIntArrayArray12[local19.aShortArray39[local42]], 0, 0, 0);
				}
				this.method1719(local27.anIntArray87[local48], local27.anIntArrayArray12[local48], local19.aShortArray41[local42], local19.aShortArray35[local42], local19.aShortArray38[local42]);
			}
		}
		Static98.anInt2281 = 0;
		Static98.anInt2283 = 0;
		Static98.anInt2282 = 0;
		local35 = 0;
		local38 = local35 + 1;
		local40 = arg4[0];
		for (@Pc(126) int local126 = 0; local126 < local24.anInt2794; local126++) {
			@Pc(132) short local132 = local24.aShortArray37[local126];
			while (local132 > local40) {
				local40 = arg4[local38++];
			}
			if (local132 == local40 || local27.anIntArray87[local132] == 0) {
				if (local24.aShortArray39[local126] != -1) {
					this.method1719(0, local27.anIntArrayArray12[local24.aShortArray39[local126]], 0, 0, 0);
				}
				this.method1719(local27.anIntArray87[local132], local27.anIntArrayArray12[local132], local24.aShortArray41[local126], local24.aShortArray35[local126], local24.aShortArray38[local126]);
			}
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	@Override
	public void method1691(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class46.anIntArray226[arg0];
		@Pc(7) int local7 = Class46.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2279; local9++) {
			@Pc(26) int local26 = this.anIntArray266[local9] * local3 + this.anIntArray267[local9] * local7 >> 16;
			this.anIntArray266[local9] = this.anIntArray266[local9] * local7 - this.anIntArray267[local9] * local3 >> 16;
			this.anIntArray267[local9] = local26;
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(III)V")
	@Override
	public void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2279; local1++) {
			this.anIntArray267[local1] += arg0;
			this.anIntArray276[local1] += arg1;
			this.anIntArray266[local1] += arg2;
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[IIII)V")
	private void method1719(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static98.anInt2281 = 0;
			Static98.anInt2283 = 0;
			Static98.anInt2282 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray35.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray35[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static98.anInt2281 += this.anIntArray267[local36];
						Static98.anInt2283 += this.anIntArray276[local36];
						Static98.anInt2282 += this.anIntArray266[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static98.anInt2281 = Static98.anInt2281 / local6 + arg2;
				Static98.anInt2283 = Static98.anInt2283 / local6 + arg3;
				Static98.anInt2282 = Static98.anInt2282 / local6 + arg4;
			} else {
				Static98.anInt2281 = arg2;
				Static98.anInt2283 = arg3;
				Static98.anInt2282 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray35.length) {
					local115 = this.anIntArrayArray35[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray267[local31] += arg2;
						this.anIntArray276[local31] += arg3;
						this.anIntArray266[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray35.length) {
					local115 = this.anIntArrayArray35[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray267[local31] -= Static98.anInt2281;
						this.anIntArray276[local31] -= Static98.anInt2283;
						this.anIntArray266[local31] -= Static98.anInt2282;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class46.anIntArray226[arg4];
							local217 = Class46.anIntArray225[arg4];
							local235 = this.anIntArray276[local31] * local36 + this.anIntArray267[local31] * local217 + 32767 >> 16;
							this.anIntArray276[local31] = this.anIntArray276[local31] * local217 + 32767 - this.anIntArray267[local31] * local36 >> 16;
							this.anIntArray267[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class46.anIntArray226[arg2];
							local217 = Class46.anIntArray225[arg2];
							local235 = this.anIntArray276[local31] * local217 + 32767 - this.anIntArray266[local31] * local36 >> 16;
							this.anIntArray266[local31] = this.anIntArray276[local31] * local36 + this.anIntArray266[local31] * local217 + 32767 >> 16;
							this.anIntArray276[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class46.anIntArray226[arg3];
							local217 = Class46.anIntArray225[arg3];
							local235 = this.anIntArray266[local31] * local36 + this.anIntArray267[local31] * local217 + 32767 >> 16;
							this.anIntArray266[local31] = this.anIntArray266[local31] * local217 + 32767 - this.anIntArray267[local31] * local36 >> 16;
							this.anIntArray267[local31] = local235;
						}
						this.anIntArray267[local31] += Static98.anInt2281;
						this.anIntArray276[local31] += Static98.anInt2283;
						this.anIntArray266[local31] += Static98.anInt2282;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray35.length) {
					local115 = this.anIntArrayArray35[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray267[local31] -= Static98.anInt2281;
						this.anIntArray276[local31] -= Static98.anInt2283;
						this.anIntArray266[local31] -= Static98.anInt2282;
						this.anIntArray267[local31] = this.anIntArray267[local31] * arg2 / 128;
						this.anIntArray276[local31] = this.anIntArray276[local31] * arg3 / 128;
						this.anIntArray266[local31] = this.anIntArray266[local31] * arg4 / 128;
						this.anIntArray267[local31] += Static98.anInt2281;
						this.anIntArray276[local31] += Static98.anInt2283;
						this.anIntArray266[local31] += Static98.anInt2282;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray36 != null && this.aByteArray27 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray36.length) {
					local115 = this.anIntArrayArray36[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray27[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray27[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		if (!this.aBoolean123) {
			this.method1716();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIIIII)V")
	public void method1720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean123) {
				this.method1716();
			}
			@Pc(6) int local6 = Static81.anInt1940;
			@Pc(8) int local8 = Static81.anInt1941;
			@Pc(12) int local12 = Class46.anIntArray226[0];
			@Pc(16) int local16 = Class46.anIntArray225[0];
			@Pc(20) int local20 = Class46.anIntArray226[arg0];
			@Pc(24) int local24 = Class46.anIntArray225[arg0];
			@Pc(28) int local28 = Class46.anIntArray226[arg1];
			@Pc(32) int local32 = Class46.anIntArray225[arg1];
			@Pc(36) int local36 = Class46.anIntArray226[arg2];
			@Pc(40) int local40 = Class46.anIntArray225[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2279; local52++) {
				@Pc(58) int local58 = this.anIntArray267[local52];
				@Pc(63) int local63 = this.anIntArray276[local52];
				@Pc(68) int local68 = this.anIntArray266[local52];
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
				Static98.anIntArray288[local52] = local68 - local50;
				Static98.anIntArray277[local52] = local6 + (local58 << 9) / arg6;
				Static98.anIntArray290[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt2280 > 0) {
					Static98.anIntArray287[local52] = local58;
					Static98.anIntArray279[local52] = local80;
					Static98.anIntArray286[local52] = local68;
				}
			}
			this.method1712(false, false, 0L, this.aShort19, this.aShort19 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "()I")
	@Override
	public int method1700() {
		if (!this.aBoolean123) {
			this.method1716();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!ji;[B)Lclient!cf;")
	private Class9_Sub2 method1721(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9_Sub2_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2279 = this.anInt2279;
		arg1.anInt2278 = this.anInt2278;
		arg1.anInt2280 = this.anInt2280;
		if (arg1.anIntArray267 == null || arg1.anIntArray267.length < this.anInt2279) {
			arg1.anIntArray267 = new int[this.anInt2279 + 100];
			arg1.anIntArray276 = new int[this.anInt2279 + 100];
			arg1.anIntArray266 = new int[this.anInt2279 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2279; local43++) {
			arg1.anIntArray267[local43] = this.anIntArray267[local43];
			arg1.anIntArray276[local43] = this.anIntArray276[local43];
			arg1.anIntArray266[local43] = this.anIntArray266[local43];
		}
		if (arg0) {
			arg1.aByteArray27 = this.aByteArray27;
		} else {
			arg1.aByteArray27 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray27 == null) {
				for (local88 = 0; local88 < this.anInt2278; local88++) {
					arg1.aByteArray27[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2278; local88++) {
					arg1.aByteArray27[local88] = this.aByteArray27[local88];
				}
			}
		}
		arg1.anIntArray272 = this.anIntArray272;
		arg1.anIntArray273 = this.anIntArray273;
		arg1.anIntArray269 = this.anIntArray269;
		arg1.anIntArray274 = this.anIntArray274;
		arg1.anIntArray270 = this.anIntArray270;
		arg1.anIntArray268 = this.anIntArray268;
		arg1.aByteArray26 = this.aByteArray26;
		arg1.aByteArray28 = this.aByteArray28;
		arg1.aShortArray26 = this.aShortArray26;
		arg1.aByte8 = this.aByte8;
		arg1.anIntArray271 = this.anIntArray271;
		arg1.anIntArray265 = this.anIntArray265;
		arg1.anIntArray275 = this.anIntArray275;
		arg1.anIntArrayArray35 = this.anIntArrayArray35;
		arg1.anIntArrayArray36 = this.anIntArrayArray36;
		arg1.aBoolean122 = super.aBoolean122;
		arg1.aBoolean123 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "()V")
	@Override
	public void method1701() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2279; local1++) {
			@Pc(7) int local7 = this.anIntArray267[local1];
			this.anIntArray267[local1] = this.anIntArray266[local1];
			this.anIntArray266[local1] = -local7;
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean123) {
				this.method1716();
			}
			@Pc(6) int local6 = Static81.anInt1940;
			@Pc(8) int local8 = Static81.anInt1941;
			@Pc(12) int local12 = Class46.anIntArray226[0];
			@Pc(16) int local16 = Class46.anIntArray225[0];
			@Pc(20) int local20 = Class46.anIntArray226[arg0];
			@Pc(24) int local24 = Class46.anIntArray225[arg0];
			@Pc(28) int local28 = Class46.anIntArray226[arg1];
			@Pc(32) int local32 = Class46.anIntArray225[arg1];
			@Pc(36) int local36 = Class46.anIntArray226[arg2];
			@Pc(40) int local40 = Class46.anIntArray225[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2279; local52++) {
				@Pc(58) int local58 = this.anIntArray267[local52];
				@Pc(63) int local63 = this.anIntArray276[local52];
				@Pc(68) int local68 = this.anIntArray266[local52];
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
				Static98.anIntArray288[local52] = local68 - local50;
				Static98.anIntArray277[local52] = local6 + (local58 << 9) / local68;
				Static98.anIntArray290[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt2280 > 0) {
					Static98.anIntArray287[local52] = local58;
					Static98.anIntArray279[local52] = local80;
					Static98.anIntArray286[local52] = local68;
				}
			}
			this.method1712(false, false, 0L, this.aShort19, this.aShort19 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZ)Lclient!cf;")
	@Override
	public Class9_Sub2 method1699(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static98.aByteArray30.length < this.anInt2278) {
			Static98.aByteArray30 = new byte[this.anInt2278 + 100];
		}
		return this.method1721(arg0, Static98.aClass9_Sub2_Sub1_2, Static98.aByteArray30);
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
	@Override
	public void method1702(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class46.anIntArray226[arg0];
		@Pc(7) int local7 = Class46.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2279; local9++) {
			@Pc(26) int local26 = this.anIntArray276[local9] * local3 + this.anIntArray267[local9] * local7 >> 16;
			this.anIntArray276[local9] = this.anIntArray276[local9] * local7 - this.anIntArray267[local9] * local3 >> 16;
			this.anIntArray267[local9] = local26;
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V")
	private void method1723(@OriginalArg(0) int arg0) {
		if (Static98.aBooleanArray14[arg0]) {
			this.method1711(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray272[arg0];
		@Pc(17) int local17 = this.anIntArray273[arg0];
		@Pc(22) int local22 = this.anIntArray269[arg0];
		Static81.aBoolean103 = Static98.aBooleanArray15[arg0];
		if (this.aByteArray27 == null) {
			Static81.anInt1939 = 0;
		} else {
			Static81.anInt1939 = this.aByteArray27[arg0] & 0xFF;
		}
		if (this.aShortArray26 != null && this.aShortArray26[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray28[arg0] & 0xFF;
				local133 = this.anIntArray271[local128];
				local138 = this.anIntArray265[local128];
				local143 = this.anIntArray275[local128];
			}
			if (this.anIntArray268[arg0] == -1) {
				Static81.method1441(Static98.anIntArray290[local12], Static98.anIntArray290[local17], Static98.anIntArray290[local22], Static98.anIntArray277[local12], Static98.anIntArray277[local17], Static98.anIntArray277[local22], this.anIntArray274[arg0], this.anIntArray274[arg0], this.anIntArray274[arg0], Static98.anIntArray287[local133], Static98.anIntArray287[local138], Static98.anIntArray287[local143], Static98.anIntArray279[local133], Static98.anIntArray279[local138], Static98.anIntArray279[local143], Static98.anIntArray286[local133], Static98.anIntArray286[local138], Static98.anIntArray286[local143], this.aShortArray26[arg0]);
			} else {
				Static81.method1441(Static98.anIntArray290[local12], Static98.anIntArray290[local17], Static98.anIntArray290[local22], Static98.anIntArray277[local12], Static98.anIntArray277[local17], Static98.anIntArray277[local22], this.anIntArray274[arg0], this.anIntArray270[arg0], this.anIntArray268[arg0], Static98.anIntArray287[local133], Static98.anIntArray287[local138], Static98.anIntArray287[local143], Static98.anIntArray279[local133], Static98.anIntArray279[local138], Static98.anIntArray279[local143], Static98.anIntArray286[local133], Static98.anIntArray286[local138], Static98.anIntArray286[local143], this.aShortArray26[arg0]);
			}
		} else if (this.anIntArray268[arg0] == -1) {
			Static81.method1449(Static98.anIntArray290[local12], Static98.anIntArray290[local17], Static98.anIntArray290[local22], Static98.anIntArray277[local12], Static98.anIntArray277[local17], Static98.anIntArray277[local22], Static81.anIntArray227[this.anIntArray274[arg0]]);
		} else {
			Static81.method1447(Static98.anIntArray290[local12], Static98.anIntArray290[local17], Static98.anIntArray290[local22], Static98.anIntArray277[local12], Static98.anIntArray277[local17], Static98.anIntArray277[local22], this.anIntArray274[arg0], this.anIntArray270[arg0], this.anIntArray268[arg0]);
		}
	}
}
