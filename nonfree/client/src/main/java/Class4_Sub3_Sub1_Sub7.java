import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class4_Sub3_Sub1_Sub7 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
	private int anInt2173;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
	private int anInt2174;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!qb", name = "db", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "[I")
	public int[] anIntArray253;

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
	private int anInt2176;

	@OriginalMember(owner = "client!qb", name = "kb", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!qb", name = "mb", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "[[I")
	public int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "I")
	private int anInt2177;

	@OriginalMember(owner = "client!qb", name = "rb", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!qb", name = "sb", descriptor = "I")
	private int anInt2178;

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!qb", name = "wb", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!qb", name = "xb", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	public int anInt2171 = 0;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
	public int anInt2172 = 0;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
	public int anInt2175 = 0;

	@OriginalMember(owner = "client!qb", name = "jb", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([Lclient!qb;I)V")
	public Class4_Sub3_Sub1_Sub7(@OriginalArg(0) Class4_Sub3_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2172 = 0;
		this.anInt2171 = 0;
		this.anInt2175 = 0;
		this.aByte8 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class4_Sub3_Sub1_Sub7 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2172 += local43.anInt2172;
				this.anInt2171 += local43.anInt2171;
				this.anInt2175 += local43.anInt2175;
				if (local43.aByteArray32 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local43.aByte8;
					}
					if (this.aByte8 != local43.aByte8) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray30 != null;
				local22 |= local43.aShortArray30 != null;
				local24 |= local43.aByteArray31 != null;
			}
		}
		this.anIntArray254 = new int[this.anInt2172];
		this.anIntArray259 = new int[this.anInt2172];
		this.anIntArray252 = new int[this.anInt2172];
		this.anIntArray253 = new int[this.anInt2171];
		this.anIntArray250 = new int[this.anInt2171];
		this.anIntArray257 = new int[this.anInt2171];
		this.anIntArray249 = new int[this.anInt2171];
		this.anIntArray251 = new int[this.anInt2171];
		this.anIntArray258 = new int[this.anInt2171];
		if (local18) {
			this.aByteArray32 = new byte[this.anInt2171];
		}
		if (local20) {
			this.aByteArray30 = new byte[this.anInt2171];
		}
		if (local22) {
			this.aShortArray30 = new short[this.anInt2171];
		}
		if (local24) {
			this.aByteArray31 = new byte[this.anInt2171];
		}
		if (this.anInt2175 > 0) {
			this.anIntArray256 = new int[this.anInt2175];
			this.anIntArray255 = new int[this.anInt2175];
			this.anIntArray260 = new int[this.anInt2175];
		}
		this.anInt2172 = 0;
		this.anInt2171 = 0;
		this.anInt2175 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class4_Sub3_Sub1_Sub7 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2171; local229++) {
					this.anIntArray253[this.anInt2171] = local225.anIntArray253[local229] + this.anInt2172;
					this.anIntArray250[this.anInt2171] = local225.anIntArray250[local229] + this.anInt2172;
					this.anIntArray257[this.anInt2171] = local225.anIntArray257[local229] + this.anInt2172;
					this.anIntArray249[this.anInt2171] = local225.anIntArray249[local229];
					this.anIntArray251[this.anInt2171] = local225.anIntArray251[local229];
					this.anIntArray258[this.anInt2171] = local225.anIntArray258[local229];
					if (local18) {
						if (local225.aByteArray32 == null) {
							this.aByteArray32[this.anInt2171] = local225.aByte8;
						} else {
							this.aByteArray32[this.anInt2171] = local225.aByteArray32[local229];
						}
					}
					if (local20 && local225.aByteArray30 != null) {
						this.aByteArray30[this.anInt2171] = local225.aByteArray30[local229];
					}
					if (local22) {
						if (local225.aShortArray30 == null) {
							this.aShortArray30[this.anInt2171] = -1;
						} else {
							this.aShortArray30[this.anInt2171] = local225.aShortArray30[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray31 == null || local225.aByteArray31[local229] == -1) {
							this.aByteArray31[this.anInt2171] = -1;
						} else {
							this.aByteArray31[this.anInt2171] = (byte) (local225.aByteArray31[local229] + this.anInt2175);
						}
					}
					this.anInt2171++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2175; local394++) {
					this.anIntArray256[this.anInt2175] = local225.anIntArray256[local394] + this.anInt2172;
					this.anIntArray255[this.anInt2175] = local225.anIntArray255[local394] + this.anInt2172;
					this.anIntArray260[this.anInt2175] = local225.anIntArray260[local394] + this.anInt2172;
					this.anInt2175++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2172; local444++) {
					this.anIntArray254[this.anInt2172] = local225.anIntArray254[local444];
					this.anIntArray259[this.anInt2172] = local225.anIntArray259[local444];
					this.anIntArray252[this.anInt2172] = local225.anIntArray252[local444];
					this.anInt2172++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZI)V")
	private void method1489(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2173 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2173; local6++) {
			Static92.anIntArray266[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2171; local18++) {
			if (this.anIntArray258[local18] != -2) {
				local30 = this.anIntArray253[local18];
				local35 = this.anIntArray250[local18];
				local40 = this.anIntArray257[local18];
				local44 = Static92.anIntArray263[local30];
				local48 = Static92.anIntArray263[local35];
				local52 = Static92.anIntArray263[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static92.anIntArray271[local30];
					local71 = Static92.anIntArray271[local35];
					@Pc(75) int local75 = Static92.anIntArray271[local40];
					@Pc(79) int local79 = Static92.anIntArray274[local30];
					local83 = Static92.anIntArray274[local35];
					local87 = Static92.anIntArray274[local40];
					@Pc(91) int local91 = Static92.anIntArray265[local30];
					local95 = Static92.anIntArray265[local35];
					@Pc(99) int local99 = Static92.anIntArray265[local40];
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
						Static92.aBooleanArray12[local18] = true;
						@Pc(180) int local180 = (Static92.anIntArray269[local30] + Static92.anIntArray269[local35] + Static92.anIntArray269[local40]) / 3 + this.anInt2177;
						Static92.anIntArrayArray63[local180][Static92.anIntArray266[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1501(Static92.anInt2179, Static92.anInt2180, Static92.anIntArray275[local30], Static92.anIntArray275[local35], Static92.anIntArray275[local40], local44, local48, local52)) {
						Static92.anIntArray262[Static92.anInt2181++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static92.anIntArray275[local40] - Static92.anIntArray275[local35]) - (Static92.anIntArray275[local30] - Static92.anIntArray275[local35]) * (local52 - local48) > 0) {
						Static92.aBooleanArray12[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static100.anInt2353 && local48 <= Static100.anInt2353 && local52 <= Static100.anInt2353) {
							Static92.aBooleanArray13[local18] = false;
						} else {
							Static92.aBooleanArray13[local18] = true;
						}
						local67 = (Static92.anIntArray269[local30] + Static92.anIntArray269[local35] + Static92.anIntArray269[local40]) / 3 + this.anInt2177;
						Static92.anIntArrayArray63[local67][Static92.anIntArray266[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray32 == null) {
			for (local30 = this.anInt2173 - 1; local30 >= 0; local30--) {
				local35 = Static92.anIntArray266[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static92.anIntArrayArray63[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1504(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static92.anIntArray268[local30] = 0;
			Static92.anIntArray270[local30] = 0;
		}
		for (local35 = this.anInt2173 - 1; local35 >= 0; local35--) {
			local40 = Static92.anIntArray266[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static92.anIntArrayArray63[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray32[local52];
					local71 = Static92.anIntArray268[local388]++;
					Static92.anIntArrayArray62[local388][local71] = local52;
					if (local388 < 10) {
						Static92.anIntArray270[local388] += local35;
					} else if (local388 == 10) {
						Static92.anIntArray264[local71] = local35;
					} else {
						Static92.anIntArray276[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static92.anIntArray268[1] > 0 || Static92.anIntArray268[2] > 0) {
			local40 = (Static92.anIntArray270[1] + Static92.anIntArray270[2]) / (Static92.anIntArray268[1] + Static92.anIntArray268[2]);
		}
		local44 = 0;
		if (Static92.anIntArray268[3] > 0 || Static92.anIntArray268[4] > 0) {
			local44 = (Static92.anIntArray270[3] + Static92.anIntArray270[4]) / (Static92.anIntArray268[3] + Static92.anIntArray268[4]);
		}
		local48 = 0;
		if (Static92.anIntArray268[6] > 0 || Static92.anIntArray268[8] > 0) {
			local48 = (Static92.anIntArray270[6] + Static92.anIntArray270[8]) / (Static92.anIntArray268[6] + Static92.anIntArray268[8]);
		}
		local67 = 0;
		local71 = Static92.anIntArray268[10];
		@Pc(521) int[] local521 = Static92.anIntArrayArray62[10];
		@Pc(523) int[] local523 = Static92.anIntArray264;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static92.anIntArray268[11];
			local521 = Static92.anIntArrayArray62[11];
			local523 = Static92.anIntArray276;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1504(local521[local67++]);
				if (local67 == local71 && local521 != Static92.anIntArrayArray62[11]) {
					local67 = 0;
					local71 = Static92.anIntArray268[11];
					local521 = Static92.anIntArrayArray62[11];
					local523 = Static92.anIntArray276;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1504(local521[local67++]);
				if (local67 == local71 && local521 != Static92.anIntArrayArray62[11]) {
					local67 = 0;
					local71 = Static92.anIntArray268[11];
					local521 = Static92.anIntArrayArray62[11];
					local523 = Static92.anIntArray276;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1504(local521[local67++]);
				if (local67 == local71 && local521 != Static92.anIntArrayArray62[11]) {
					local67 = 0;
					local71 = Static92.anIntArray268[11];
					local521 = Static92.anIntArrayArray62[11];
					local523 = Static92.anIntArray276;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static92.anIntArray268[local83];
			@Pc(686) int[] local686 = Static92.anIntArrayArray62[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1504(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1504(local521[local67++]);
			if (local67 == local71 && local521 != Static92.anIntArrayArray62[11]) {
				local67 = 0;
				local521 = Static92.anIntArrayArray62[11];
				local71 = Static92.anIntArray268[11];
				local523 = Static92.anIntArray276;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static92.anIntArray266[0] = -1;
		if (this.anInt2178 != 1) {
			this.method1493();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2176 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2176 << 9;
		if (local64 / local40 >= Static100.anInt2357) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2176 << 9;
		if (local77 / local40 <= Static100.anInt2350) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2176 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static100.anInt2354) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2166 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static100.anInt2352) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2166 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2175 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static92.aBoolean77) {
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
			local219 = Static92.anInt2179 - Static100.anInt2358;
			local223 = Static92.anInt2180 - Static100.anInt2351;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean76) {
					Static92.anIntArray262[Static92.anInt2181++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static100.anInt2358;
		local219 = Static100.anInt2351;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static92.anIntArray279[arg0];
			local257 = Static92.anIntArray277[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2172; local269++) {
			@Pc(275) int local275 = this.anIntArray254[local269];
			@Pc(280) int local280 = this.anIntArray259[local269];
			@Pc(285) int local285 = this.anIntArray252[local269];
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
			Static92.anIntArray269[local269] = local285 - local29;
			if (local285 >= 50) {
				Static92.anIntArray263[local269] = local172 + (local275 << 9) / local285;
				Static92.anIntArray275[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static92.anIntArray263[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static92.anIntArray271[local269] = local275;
				Static92.anIntArray274[local269] = local297;
				Static92.anIntArray265[local269] = local285;
			}
		}
		try {
			this.method1489(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	public void method1490() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2172; local1++) {
			this.anIntArray254[local1] = -this.anIntArray254[local1];
			this.anIntArray252[local1] = -this.anIntArray252[local1];
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIII)V")
	private void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static92.anInt2182 = 0;
			Static92.anInt2183 = 0;
			Static92.anInt2184 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray61.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray61[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static92.anInt2182 += this.anIntArray254[local36];
						Static92.anInt2183 += this.anIntArray259[local36];
						Static92.anInt2184 += this.anIntArray252[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static92.anInt2182 = Static92.anInt2182 / local6 + arg2;
				Static92.anInt2183 = Static92.anInt2183 / local6 + arg3;
				Static92.anInt2184 = Static92.anInt2184 / local6 + arg4;
			} else {
				Static92.anInt2182 = arg2;
				Static92.anInt2183 = arg3;
				Static92.anInt2184 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray61.length) {
					local115 = this.anIntArrayArray61[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray254[local31] += arg2;
						this.anIntArray259[local31] += arg3;
						this.anIntArray252[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray61.length) {
					local115 = this.anIntArrayArray61[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray254[local31] -= Static92.anInt2182;
						this.anIntArray259[local31] -= Static92.anInt2183;
						this.anIntArray252[local31] -= Static92.anInt2184;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static92.anIntArray279[local225];
							local235 = Static92.anIntArray277[local225];
							local251 = this.anIntArray259[local31] * local231 + this.anIntArray254[local31] * local235 >> 16;
							this.anIntArray259[local31] = this.anIntArray259[local31] * local235 - this.anIntArray254[local31] * local231 >> 16;
							this.anIntArray254[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static92.anIntArray279[local36];
							local235 = Static92.anIntArray277[local36];
							local251 = this.anIntArray259[local31] * local235 - this.anIntArray252[local31] * local231 >> 16;
							this.anIntArray252[local31] = this.anIntArray259[local31] * local231 + this.anIntArray252[local31] * local235 >> 16;
							this.anIntArray259[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static92.anIntArray279[local219];
							local235 = Static92.anIntArray277[local219];
							local251 = this.anIntArray252[local31] * local231 + this.anIntArray254[local31] * local235 >> 16;
							this.anIntArray252[local31] = this.anIntArray252[local31] * local235 - this.anIntArray254[local31] * local231 >> 16;
							this.anIntArray254[local31] = local251;
						}
						this.anIntArray254[local31] += Static92.anInt2182;
						this.anIntArray259[local31] += Static92.anInt2183;
						this.anIntArray252[local31] += Static92.anInt2184;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray61.length) {
					local115 = this.anIntArrayArray61[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray254[local31] -= Static92.anInt2182;
						this.anIntArray259[local31] -= Static92.anInt2183;
						this.anIntArray252[local31] -= Static92.anInt2184;
						this.anIntArray254[local31] = this.anIntArray254[local31] * arg2 / 128;
						this.anIntArray259[local31] = this.anIntArray259[local31] * arg3 / 128;
						this.anIntArray252[local31] = this.anIntArray252[local31] * arg4 / 128;
						this.anIntArray254[local31] += Static92.anInt2182;
						this.anIntArray259[local31] += Static92.anInt2183;
						this.anIntArray252[local31] += Static92.anInt2184;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray60 != null && this.aByteArray30 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray60.length) {
					local115 = this.anIntArrayArray60[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray30[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray30[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIII)V")
	public void method1492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static92.anIntArray266[0] = -1;
		if (this.anInt2178 != 2 && this.anInt2178 != 1) {
			this.method1495();
		}
		@Pc(15) int local15 = Static100.anInt2358;
		@Pc(17) int local17 = Static100.anInt2351;
		@Pc(21) int local21 = Static92.anIntArray279[0];
		@Pc(25) int local25 = Static92.anIntArray277[0];
		@Pc(29) int local29 = Static92.anIntArray279[arg0];
		@Pc(33) int local33 = Static92.anIntArray277[arg0];
		@Pc(37) int local37 = Static92.anIntArray279[arg1];
		@Pc(41) int local41 = Static92.anIntArray277[arg1];
		@Pc(45) int local45 = Static92.anIntArray279[arg2];
		@Pc(49) int local49 = Static92.anIntArray277[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2172; local61++) {
			@Pc(67) int local67 = this.anIntArray254[local61];
			@Pc(72) int local72 = this.anIntArray259[local61];
			@Pc(77) int local77 = this.anIntArray252[local61];
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
			Static92.anIntArray269[local61] = local77 - local59;
			Static92.anIntArray263[local61] = local15 + (local67 << 9) / local77;
			Static92.anIntArray275[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2175 > 0) {
				Static92.anIntArray271[local61] = local67;
				Static92.anIntArray274[local61] = local89;
				Static92.anIntArray265[local61] = local77;
			}
		}
		try {
			this.method1489(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	public void method1493() {
		if (this.anInt2178 == 1) {
			return;
		}
		this.anInt2178 = 1;
		super.anInt2166 = 0;
		this.anInt2174 = 0;
		this.anInt2176 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2172; local18++) {
			@Pc(24) int local24 = this.anIntArray254[local18];
			@Pc(29) int local29 = this.anIntArray259[local18];
			@Pc(34) int local34 = this.anIntArray252[local18];
			if (-local29 > super.anInt2166) {
				super.anInt2166 = -local29;
			}
			if (local29 > this.anInt2174) {
				this.anInt2174 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2176) {
				this.anInt2176 = local58;
			}
		}
		this.anInt2176 = (int) (Math.sqrt((double) this.anInt2176) + 0.99D);
		this.anInt2177 = (int) (Math.sqrt((double) (this.anInt2176 * this.anInt2176 + super.anInt2166 * super.anInt2166)) + 0.99D);
		this.anInt2173 = this.anInt2177 + (int) (Math.sqrt((double) (this.anInt2176 * this.anInt2176 + this.anInt2174 * this.anInt2174)) + 0.99D);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
	public int method1494() {
		this.method1493();
		return this.anInt2176;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
	private void method1495() {
		if (this.anInt2178 == 2) {
			return;
		}
		this.anInt2178 = 2;
		this.anInt2176 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2172; local12++) {
			@Pc(18) int local18 = this.anIntArray254[local12];
			@Pc(23) int local23 = this.anIntArray259[local12];
			@Pc(28) int local28 = this.anIntArray252[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2176) {
				this.anInt2176 = local40;
			}
		}
		this.anInt2176 = (int) (Math.sqrt((double) this.anInt2176) + 0.99D);
		this.anInt2177 = this.anInt2176;
		this.anInt2173 = this.anInt2176 + this.anInt2176;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
	public void method1496() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2172; local1++) {
			@Pc(7) int local7 = this.anIntArray252[local1];
			this.anIntArray252[local1] = this.anIntArray254[local1];
			this.anIntArray254[local1] = -local7;
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
	public void method1497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static92.anIntArray266[0] = -1;
		if (this.anInt2178 != 2 && this.anInt2178 != 1) {
			this.method1495();
		}
		@Pc(15) int local15 = Static100.anInt2358;
		@Pc(17) int local17 = Static100.anInt2351;
		@Pc(21) int local21 = Static92.anIntArray279[0];
		@Pc(25) int local25 = Static92.anIntArray277[0];
		@Pc(29) int local29 = Static92.anIntArray279[arg0];
		@Pc(33) int local33 = Static92.anIntArray277[arg0];
		@Pc(37) int local37 = Static92.anIntArray279[arg1];
		@Pc(41) int local41 = Static92.anIntArray277[arg1];
		@Pc(45) int local45 = Static92.anIntArray279[arg2];
		@Pc(49) int local49 = Static92.anIntArray277[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2172; local61++) {
			@Pc(67) int local67 = this.anIntArray254[local61];
			@Pc(72) int local72 = this.anIntArray259[local61];
			@Pc(77) int local77 = this.anIntArray252[local61];
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
			Static92.anIntArray269[local61] = local77 - local59;
			Static92.anIntArray263[local61] = local15 + (local67 << 9) / arg6;
			Static92.anIntArray275[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2175 > 0) {
				Static92.anIntArray271[local61] = local67;
				Static92.anIntArray274[local61] = local89;
				Static92.anIntArray265[local61] = local77;
			}
		}
		try {
			this.method1489(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "(I)V")
	public void method1499(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static92.anIntArray279[arg0];
		@Pc(7) int local7 = Static92.anIntArray277[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2172; local9++) {
			@Pc(26) int local26 = this.anIntArray259[local9] * local7 - this.anIntArray252[local9] * local3 >> 16;
			this.anIntArray252[local9] = this.anIntArray259[local9] * local3 + this.anIntArray252[local9] * local7 >> 16;
			this.anIntArray259[local9] = local26;
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1500(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static92.aByteArray33.length < this.anInt2171) {
			Static92.aByteArray33 = new byte[this.anInt2171 + 100];
		}
		return this.method1511(arg0, Static92.aClass4_Sub3_Sub1_Sub7_2, Static92.aByteArray33);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "(I)V")
	private void method1502(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static100.anInt2358;
		@Pc(3) int local3 = Static100.anInt2351;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray253[arg0];
		@Pc(15) int local15 = this.anIntArray250[arg0];
		@Pc(20) int local20 = this.anIntArray257[arg0];
		@Pc(24) int local24 = Static92.anIntArray265[local10];
		@Pc(28) int local28 = Static92.anIntArray265[local15];
		@Pc(32) int local32 = Static92.anIntArray265[local20];
		if (this.aByteArray30 == null) {
			Static100.anInt2356 = 0;
		} else {
			Static100.anInt2356 = this.aByteArray30[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static92.anIntArray278[0] = Static92.anIntArray263[local10];
			Static92.anIntArray267[0] = Static92.anIntArray275[local10];
			local5++;
			Static92.anIntArray272[0] = this.anIntArray249[arg0];
		} else {
			local73 = Static92.anIntArray271[local10];
			local77 = Static92.anIntArray274[local10];
			local82 = this.anIntArray249[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static92.anIntArray261[local32 - local24];
				Static92.anIntArray278[0] = local1 + (local73 + ((Static92.anIntArray271[local20] - local73) * local95 >> 16) << 9) / 50;
				Static92.anIntArray267[0] = local3 + (local77 + ((Static92.anIntArray274[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static92.anIntArray272[0] = local82 + ((this.anIntArray258[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static92.anIntArray261[local28 - local24];
				Static92.anIntArray278[local5] = local1 + (local73 + ((Static92.anIntArray271[local15] - local73) * local95 >> 16) << 9) / 50;
				Static92.anIntArray267[local5] = local3 + (local77 + ((Static92.anIntArray274[local15] - local77) * local95 >> 16) << 9) / 50;
				Static92.anIntArray272[local5++] = local82 + ((this.anIntArray251[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static92.anIntArray278[local5] = Static92.anIntArray263[local15];
			Static92.anIntArray267[local5] = Static92.anIntArray275[local15];
			Static92.anIntArray272[local5++] = this.anIntArray251[arg0];
		} else {
			local73 = Static92.anIntArray271[local15];
			local77 = Static92.anIntArray274[local15];
			local82 = this.anIntArray251[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static92.anIntArray261[local24 - local28];
				Static92.anIntArray278[local5] = local1 + (local73 + ((Static92.anIntArray271[local10] - local73) * local95 >> 16) << 9) / 50;
				Static92.anIntArray267[local5] = local3 + (local77 + ((Static92.anIntArray274[local10] - local77) * local95 >> 16) << 9) / 50;
				Static92.anIntArray272[local5++] = local82 + ((this.anIntArray249[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static92.anIntArray261[local32 - local28];
				Static92.anIntArray278[local5] = local1 + (local73 + ((Static92.anIntArray271[local20] - local73) * local95 >> 16) << 9) / 50;
				Static92.anIntArray267[local5] = local3 + (local77 + ((Static92.anIntArray274[local20] - local77) * local95 >> 16) << 9) / 50;
				Static92.anIntArray272[local5++] = local82 + ((this.anIntArray258[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static92.anIntArray278[local5] = Static92.anIntArray263[local20];
			Static92.anIntArray267[local5] = Static92.anIntArray275[local20];
			Static92.anIntArray272[local5++] = this.anIntArray258[arg0];
		} else {
			local73 = Static92.anIntArray271[local20];
			local77 = Static92.anIntArray274[local20];
			local82 = this.anIntArray258[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static92.anIntArray261[local28 - local32];
				Static92.anIntArray278[local5] = local1 + (local73 + ((Static92.anIntArray271[local15] - local73) * local95 >> 16) << 9) / 50;
				Static92.anIntArray267[local5] = local3 + (local77 + ((Static92.anIntArray274[local15] - local77) * local95 >> 16) << 9) / 50;
				Static92.anIntArray272[local5++] = local82 + ((this.anIntArray251[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static92.anIntArray261[local24 - local32];
				Static92.anIntArray278[local5] = local1 + (local73 + ((Static92.anIntArray271[local10] - local73) * local95 >> 16) << 9) / 50;
				Static92.anIntArray267[local5] = local3 + (local77 + ((Static92.anIntArray274[local10] - local77) * local95 >> 16) << 9) / 50;
				Static92.anIntArray272[local5++] = local82 + ((this.anIntArray249[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static92.anIntArray278[0];
		local77 = Static92.anIntArray278[1];
		local82 = Static92.anIntArray278[2];
		local95 = Static92.anIntArray267[0];
		@Pc(590) int local590 = Static92.anIntArray267[1];
		@Pc(594) int local594 = Static92.anIntArray267[2];
		Static100.aBoolean87 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static100.anInt2353 || local77 > Static100.anInt2353 || local82 > Static100.anInt2353) {
				Static100.aBoolean87 = true;
			}
			if (this.aShortArray30 != null && this.aShortArray30[arg0] != -1) {
				if (this.aByteArray31 == null || this.aByteArray31[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray31[arg0] & 0xFF;
					local683 = this.anIntArray256[local678];
					local688 = this.anIntArray255[local678];
					local693 = this.anIntArray260[local678];
				}
				if (this.anIntArray258[arg0] == -1) {
					Static100.method1683(local95, local590, local594, local73, local77, local82, this.anIntArray249[arg0], this.anIntArray249[arg0], this.anIntArray249[arg0], Static92.anIntArray271[local683], Static92.anIntArray271[local688], Static92.anIntArray271[local693], Static92.anIntArray274[local683], Static92.anIntArray274[local688], Static92.anIntArray274[local693], Static92.anIntArray265[local683], Static92.anIntArray265[local688], Static92.anIntArray265[local693], this.aShortArray30[arg0]);
				} else {
					Static100.method1683(local95, local590, local594, local73, local77, local82, Static92.anIntArray272[0], Static92.anIntArray272[1], Static92.anIntArray272[2], Static92.anIntArray271[local683], Static92.anIntArray271[local688], Static92.anIntArray271[local693], Static92.anIntArray274[local683], Static92.anIntArray274[local688], Static92.anIntArray274[local693], Static92.anIntArray265[local683], Static92.anIntArray265[local688], Static92.anIntArray265[local693], this.aShortArray30[arg0]);
				}
			} else if (this.anIntArray258[arg0] == -1) {
				Static100.method1682(local95, local590, local594, local73, local77, local82, Static92.anIntArray273[this.anIntArray249[arg0]]);
			} else {
				Static100.method1673(local95, local590, local594, local73, local77, local82, Static92.anIntArray272[0], Static92.anIntArray272[1], Static92.anIntArray272[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static100.anInt2353 || local77 > Static100.anInt2353 || local82 > Static100.anInt2353 || Static92.anIntArray278[3] < 0 || Static92.anIntArray278[3] > Static100.anInt2353) {
			Static100.aBoolean87 = true;
		}
		if (this.aShortArray30 == null || this.aShortArray30[arg0] == -1) {
			if (this.anIntArray258[arg0] == -1) {
				local683 = Static92.anIntArray273[this.anIntArray249[arg0]];
				Static100.method1682(local95, local590, local594, local73, local77, local82, local683);
				Static100.method1682(local95, local594, Static92.anIntArray267[3], local73, local82, Static92.anIntArray278[3], local683);
				return;
			}
			Static100.method1673(local95, local590, local594, local73, local77, local82, Static92.anIntArray272[0], Static92.anIntArray272[1], Static92.anIntArray272[2]);
			Static100.method1673(local95, local594, Static92.anIntArray267[3], local73, local82, Static92.anIntArray278[3], Static92.anIntArray272[0], Static92.anIntArray272[2], Static92.anIntArray272[3]);
			return;
		}
		if (this.aByteArray31 == null || this.aByteArray31[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray31[arg0] & 0xFF;
			local683 = this.anIntArray256[local678];
			local688 = this.anIntArray255[local678];
			local693 = this.anIntArray260[local678];
		}
		@Pc(956) short local956 = this.aShortArray30[arg0];
		if (this.anIntArray258[arg0] == -1) {
			Static100.method1683(local95, local590, local594, local73, local77, local82, this.anIntArray249[arg0], this.anIntArray249[arg0], this.anIntArray249[arg0], Static92.anIntArray271[local683], Static92.anIntArray271[local688], Static92.anIntArray271[local693], Static92.anIntArray274[local683], Static92.anIntArray274[local688], Static92.anIntArray274[local693], Static92.anIntArray265[local683], Static92.anIntArray265[local688], Static92.anIntArray265[local693], local956);
			Static100.method1683(local95, local594, Static92.anIntArray267[3], local73, local82, Static92.anIntArray278[3], this.anIntArray249[arg0], this.anIntArray249[arg0], this.anIntArray249[arg0], Static92.anIntArray271[local683], Static92.anIntArray271[local688], Static92.anIntArray271[local693], Static92.anIntArray274[local683], Static92.anIntArray274[local688], Static92.anIntArray274[local693], Static92.anIntArray265[local683], Static92.anIntArray265[local688], Static92.anIntArray265[local693], local956);
			return;
		}
		Static100.method1683(local95, local590, local594, local73, local77, local82, Static92.anIntArray272[0], Static92.anIntArray272[1], Static92.anIntArray272[2], Static92.anIntArray271[local683], Static92.anIntArray271[local688], Static92.anIntArray271[local693], Static92.anIntArray274[local683], Static92.anIntArray274[local688], Static92.anIntArray274[local693], Static92.anIntArray265[local683], Static92.anIntArray265[local688], Static92.anIntArray265[local693], local956);
		Static100.method1683(local95, local594, Static92.anIntArray267[3], local73, local82, Static92.anIntArray278[3], Static92.anIntArray272[0], Static92.anIntArray272[2], Static92.anIntArray272[3], Static92.anIntArray271[local683], Static92.anIntArray271[local688], Static92.anIntArray271[local693], Static92.anIntArray274[local683], Static92.anIntArray274[local688], Static92.anIntArray274[local693], Static92.anIntArray265[local683], Static92.anIntArray265[local688], Static92.anIntArray265[local693], local956);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1503(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static92.aByteArray34.length < this.anInt2171) {
			Static92.aByteArray34 = new byte[this.anInt2171 + 100];
		}
		return this.method1511(arg0, Static92.aClass4_Sub3_Sub1_Sub7_3, Static92.aByteArray34);
	}

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "(I)V")
	private void method1504(@OriginalArg(0) int arg0) {
		if (Static92.aBooleanArray12[arg0]) {
			this.method1502(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray253[arg0];
		@Pc(17) int local17 = this.anIntArray250[arg0];
		@Pc(22) int local22 = this.anIntArray257[arg0];
		Static100.aBoolean87 = Static92.aBooleanArray13[arg0];
		if (this.aByteArray30 == null) {
			Static100.anInt2356 = 0;
		} else {
			Static100.anInt2356 = this.aByteArray30[arg0] & 0xFF;
		}
		if (this.aShortArray30 != null && this.aShortArray30[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray31 == null || this.aByteArray31[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray31[arg0] & 0xFF;
				local133 = this.anIntArray256[local128];
				local138 = this.anIntArray255[local128];
				local143 = this.anIntArray260[local128];
			}
			if (this.anIntArray258[arg0] == -1) {
				Static100.method1683(Static92.anIntArray275[local12], Static92.anIntArray275[local17], Static92.anIntArray275[local22], Static92.anIntArray263[local12], Static92.anIntArray263[local17], Static92.anIntArray263[local22], this.anIntArray249[arg0], this.anIntArray249[arg0], this.anIntArray249[arg0], Static92.anIntArray271[local133], Static92.anIntArray271[local138], Static92.anIntArray271[local143], Static92.anIntArray274[local133], Static92.anIntArray274[local138], Static92.anIntArray274[local143], Static92.anIntArray265[local133], Static92.anIntArray265[local138], Static92.anIntArray265[local143], this.aShortArray30[arg0]);
			} else {
				Static100.method1683(Static92.anIntArray275[local12], Static92.anIntArray275[local17], Static92.anIntArray275[local22], Static92.anIntArray263[local12], Static92.anIntArray263[local17], Static92.anIntArray263[local22], this.anIntArray249[arg0], this.anIntArray251[arg0], this.anIntArray258[arg0], Static92.anIntArray271[local133], Static92.anIntArray271[local138], Static92.anIntArray271[local143], Static92.anIntArray274[local133], Static92.anIntArray274[local138], Static92.anIntArray274[local143], Static92.anIntArray265[local133], Static92.anIntArray265[local138], Static92.anIntArray265[local143], this.aShortArray30[arg0]);
			}
		} else if (this.anIntArray258[arg0] == -1) {
			Static100.method1682(Static92.anIntArray275[local12], Static92.anIntArray275[local17], Static92.anIntArray275[local22], Static92.anIntArray263[local12], Static92.anIntArray263[local17], Static92.anIntArray263[local22], Static92.anIntArray273[this.anIntArray249[arg0]]);
		} else {
			Static100.method1673(Static92.anIntArray275[local12], Static92.anIntArray275[local17], Static92.anIntArray275[local22], Static92.anIntArray263[local12], Static92.anIntArray263[local17], Static92.anIntArray263[local22], this.anIntArray249[arg0], this.anIntArray251[arg0], this.anIntArray258[arg0]);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public void method1505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2172; local1++) {
			this.anIntArray254[local1] += arg0;
			this.anIntArray259[local1] += arg1;
			this.anIntArray252[local1] += arg2;
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([[IIIIZI)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1506(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1493();
		@Pc(6) int local6 = arg1 - this.anInt2176;
		@Pc(11) int local11 = arg1 + this.anInt2176;
		@Pc(16) int local16 = arg3 - this.anInt2176;
		@Pc(21) int local21 = arg3 + this.anInt2176;
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
		@Pc(101) Class4_Sub3_Sub1_Sub7 local101;
		if (arg4) {
			local101 = new Class4_Sub3_Sub1_Sub7();
			local101.anInt2172 = this.anInt2172;
			local101.anInt2171 = this.anInt2171;
			local101.anInt2175 = this.anInt2175;
			local101.anIntArray254 = this.anIntArray254;
			local101.anIntArray252 = this.anIntArray252;
			local101.anIntArray253 = this.anIntArray253;
			local101.anIntArray250 = this.anIntArray250;
			local101.anIntArray257 = this.anIntArray257;
			local101.anIntArray249 = this.anIntArray249;
			local101.anIntArray251 = this.anIntArray251;
			local101.anIntArray258 = this.anIntArray258;
			local101.aByteArray32 = this.aByteArray32;
			local101.aByteArray30 = this.aByteArray30;
			local101.aByteArray31 = this.aByteArray31;
			local101.aShortArray30 = this.aShortArray30;
			local101.aByte8 = this.aByte8;
			local101.anIntArray256 = this.anIntArray256;
			local101.anIntArray255 = this.anIntArray255;
			local101.anIntArray260 = this.anIntArray260;
			local101.anIntArrayArray61 = this.anIntArrayArray61;
			local101.anIntArrayArray60 = this.anIntArrayArray60;
			local101.aBoolean76 = this.aBoolean76;
			local101.anIntArray259 = new int[local101.anInt2172];
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
			for (local201 = 0; local201 < local101.anInt2172; local201++) {
				local209 = this.anIntArray254[local201] + arg1;
				local216 = this.anIntArray252[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray259[local201] = this.anIntArray259[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt2172; local201++) {
				local209 = (-this.anIntArray259[local201] << 16) / super.anInt2166;
				if (local209 < arg5) {
					local216 = this.anIntArray254[local201] + arg1;
					local220 = this.anIntArray252[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray259[local201] = this.anIntArray259[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt2178 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "()V")
	public void method1507() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2172; local1++) {
			@Pc(7) int local7 = this.anIntArray254[local1];
			this.anIntArray254[local1] = this.anIntArray252[local1];
			this.anIntArray252[local1] = -local7;
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!v;I)V")
	public void method1508(@OriginalArg(0) Class4_Sub3_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray61 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class67 local12 = arg0.aClass67Array1[arg1];
		@Pc(15) Class4_Sub20 local15 = local12.aClass4_Sub20_1;
		Static92.anInt2182 = 0;
		Static92.anInt2183 = 0;
		Static92.anInt2184 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2257; local23++) {
			@Pc(29) int local29 = local12.anIntArray289[local23];
			this.method1491(local15.anIntArray335[local29], local15.anIntArrayArray82[local29], local12.anIntArray287[local23], local12.anIntArray290[local23], local12.anIntArray293[local23]);
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
	public void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2172; local1++) {
			this.anIntArray254[local1] = this.anIntArray254[local1] * arg0 / 128;
			this.anIntArray259[local1] = this.anIntArray259[local1] * arg1 / 128;
			this.anIntArray252[local1] = this.anIntArray252[local1] * arg2 / 128;
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!v;ILclient!v;I[I)V")
	public void method1510(@OriginalArg(0) Class4_Sub3_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub3_Sub15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1508(arg0, arg1);
			return;
		}
		@Pc(18) Class67 local18 = arg0.aClass67Array1[arg1];
		@Pc(23) Class67 local23 = arg2.aClass67Array1[arg3];
		@Pc(26) Class4_Sub20 local26 = local18.aClass4_Sub20_1;
		Static92.anInt2182 = 0;
		Static92.anInt2183 = 0;
		Static92.anInt2184 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2257; local41++) {
			local47 = local18.anIntArray289[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray335[local47] == 0) {
				this.method1491(local26.anIntArray335[local47], local26.anIntArrayArray82[local47], local18.anIntArray287[local41], local18.anIntArray290[local41], local18.anIntArray293[local41]);
			}
		}
		Static92.anInt2182 = 0;
		Static92.anInt2183 = 0;
		Static92.anInt2184 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2257; local47++) {
			@Pc(112) int local112 = local23.anIntArray289[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray335[local112] == 0) {
				this.method1491(local26.anIntArray335[local112], local26.anIntArrayArray82[local112], local23.anIntArray287[local47], local23.anIntArray290[local47], local23.anIntArray293[local47]);
			}
		}
		this.anInt2178 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!qb;[B)Lclient!qb;")
	private Class4_Sub3_Sub1_Sub7 method1511(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub3_Sub1_Sub7 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2172 = this.anInt2172;
		arg1.anInt2171 = this.anInt2171;
		arg1.anInt2175 = this.anInt2175;
		if (arg1.anIntArray254 == null || arg1.anIntArray254.length < this.anInt2172) {
			arg1.anIntArray254 = new int[this.anInt2172 + 100];
			arg1.anIntArray259 = new int[this.anInt2172 + 100];
			arg1.anIntArray252 = new int[this.anInt2172 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2172; local43++) {
			arg1.anIntArray254[local43] = this.anIntArray254[local43];
			arg1.anIntArray259[local43] = this.anIntArray259[local43];
			arg1.anIntArray252[local43] = this.anIntArray252[local43];
		}
		if (arg0) {
			arg1.aByteArray30 = this.aByteArray30;
		} else {
			arg1.aByteArray30 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray30 == null) {
				for (local88 = 0; local88 < this.anInt2171; local88++) {
					arg1.aByteArray30[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2171; local88++) {
					arg1.aByteArray30[local88] = this.aByteArray30[local88];
				}
			}
		}
		arg1.anIntArray253 = this.anIntArray253;
		arg1.anIntArray250 = this.anIntArray250;
		arg1.anIntArray257 = this.anIntArray257;
		arg1.anIntArray249 = this.anIntArray249;
		arg1.anIntArray251 = this.anIntArray251;
		arg1.anIntArray258 = this.anIntArray258;
		arg1.aByteArray32 = this.aByteArray32;
		arg1.aByteArray31 = this.aByteArray31;
		arg1.aShortArray30 = this.aShortArray30;
		arg1.aByte8 = this.aByte8;
		arg1.anIntArray256 = this.anIntArray256;
		arg1.anIntArray255 = this.anIntArray255;
		arg1.anIntArray260 = this.anIntArray260;
		arg1.anIntArrayArray61 = this.anIntArrayArray61;
		arg1.anIntArrayArray60 = this.anIntArrayArray60;
		arg1.aBoolean76 = this.aBoolean76;
		arg1.anInt2178 = 0;
		return arg1;
	}
}
