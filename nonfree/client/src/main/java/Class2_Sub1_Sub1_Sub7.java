import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub1_Sub1_Sub7 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!wb", name = "ib", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!wb", name = "jb", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
	private int anInt2863;

	@OriginalMember(owner = "client!wb", name = "mb", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
	private int anInt2864;

	@OriginalMember(owner = "client!wb", name = "ob", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!wb", name = "pb", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!wb", name = "sb", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!wb", name = "tb", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!wb", name = "vb", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!wb", name = "wb", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!wb", name = "yb", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!wb", name = "zb", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!wb", name = "Bb", descriptor = "I")
	private int anInt2868;

	@OriginalMember(owner = "client!wb", name = "Cb", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!wb", name = "Db", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!wb", name = "Eb", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!wb", name = "rb", descriptor = "I")
	public int anInt2865 = 0;

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "I")
	public int anInt2866 = 0;

	@OriginalMember(owner = "client!wb", name = "Ab", descriptor = "I")
	public int anInt2867 = 0;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([Lclient!wb;I)V")
	public Class2_Sub1_Sub1_Sub7(@OriginalArg(0) Class2_Sub1_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2866 = 0;
		this.anInt2865 = 0;
		this.anInt2867 = 0;
		this.aByte7 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub1_Sub7 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2866 += local43.anInt2866;
				this.anInt2865 += local43.anInt2865;
				this.anInt2867 += local43.anInt2867;
				if (local43.aByteArray41 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local43.aByte7;
					}
					if (this.aByte7 != local43.aByte7) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray39 != null;
				local22 |= local43.aShortArray39 != null;
				local24 |= local43.aByteArray40 != null;
			}
		}
		this.anIntArray385 = new int[this.anInt2866];
		this.anIntArray386 = new int[this.anInt2866];
		this.anIntArray388 = new int[this.anInt2866];
		this.anIntArray379 = new int[this.anInt2865];
		this.anIntArray383 = new int[this.anInt2865];
		this.anIntArray381 = new int[this.anInt2865];
		this.anIntArray384 = new int[this.anInt2865];
		this.anIntArray380 = new int[this.anInt2865];
		this.anIntArray382 = new int[this.anInt2865];
		if (local18) {
			this.aByteArray41 = new byte[this.anInt2865];
		}
		if (local20) {
			this.aByteArray39 = new byte[this.anInt2865];
		}
		if (local22) {
			this.aShortArray39 = new short[this.anInt2865];
		}
		if (local24) {
			this.aByteArray40 = new byte[this.anInt2865];
		}
		if (this.anInt2867 > 0) {
			this.anIntArray387 = new int[this.anInt2867];
			this.anIntArray378 = new int[this.anInt2867];
			this.anIntArray377 = new int[this.anInt2867];
		}
		this.anInt2866 = 0;
		this.anInt2865 = 0;
		this.anInt2867 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class2_Sub1_Sub1_Sub7 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2865; local229++) {
					this.anIntArray379[this.anInt2865] = local225.anIntArray379[local229] + this.anInt2866;
					this.anIntArray383[this.anInt2865] = local225.anIntArray383[local229] + this.anInt2866;
					this.anIntArray381[this.anInt2865] = local225.anIntArray381[local229] + this.anInt2866;
					this.anIntArray384[this.anInt2865] = local225.anIntArray384[local229];
					this.anIntArray380[this.anInt2865] = local225.anIntArray380[local229];
					this.anIntArray382[this.anInt2865] = local225.anIntArray382[local229];
					if (local18) {
						if (local225.aByteArray41 == null) {
							this.aByteArray41[this.anInt2865] = local225.aByte7;
						} else {
							this.aByteArray41[this.anInt2865] = local225.aByteArray41[local229];
						}
					}
					if (local20 && local225.aByteArray39 != null) {
						this.aByteArray39[this.anInt2865] = local225.aByteArray39[local229];
					}
					if (local22) {
						if (local225.aShortArray39 == null) {
							this.aShortArray39[this.anInt2865] = -1;
						} else {
							this.aShortArray39[this.anInt2865] = local225.aShortArray39[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray40 == null || local225.aByteArray40[local229] == -1) {
							this.aByteArray40[this.anInt2865] = -1;
						} else {
							this.aByteArray40[this.anInt2865] = (byte) (local225.aByteArray40[local229] + this.anInt2867);
						}
					}
					this.anInt2865++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2867; local394++) {
					this.anIntArray387[this.anInt2867] = local225.anIntArray387[local394] + this.anInt2866;
					this.anIntArray378[this.anInt2867] = local225.anIntArray378[local394] + this.anInt2866;
					this.anIntArray377[this.anInt2867] = local225.anIntArray377[local394] + this.anInt2866;
					this.anInt2867++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2866; local444++) {
					this.anIntArray385[this.anInt2866] = local225.anIntArray385[local444];
					this.anIntArray386[this.anInt2866] = local225.anIntArray386[local444];
					this.anIntArray388[this.anInt2866] = local225.anIntArray388[local444];
					this.anInt2866++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([[IIIIZI)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method1997(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2006();
		@Pc(6) int local6 = arg1 - this.anInt2863;
		@Pc(11) int local11 = arg1 + this.anInt2863;
		@Pc(16) int local16 = arg3 - this.anInt2863;
		@Pc(21) int local21 = arg3 + this.anInt2863;
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
		@Pc(101) Class2_Sub1_Sub1_Sub7 local101;
		if (arg4) {
			local101 = new Class2_Sub1_Sub1_Sub7();
			local101.anInt2866 = this.anInt2866;
			local101.anInt2865 = this.anInt2865;
			local101.anInt2867 = this.anInt2867;
			local101.anIntArray385 = this.anIntArray385;
			local101.anIntArray388 = this.anIntArray388;
			local101.anIntArray379 = this.anIntArray379;
			local101.anIntArray383 = this.anIntArray383;
			local101.anIntArray381 = this.anIntArray381;
			local101.anIntArray384 = this.anIntArray384;
			local101.anIntArray380 = this.anIntArray380;
			local101.anIntArray382 = this.anIntArray382;
			local101.aByteArray41 = this.aByteArray41;
			local101.aByteArray39 = this.aByteArray39;
			local101.aByteArray40 = this.aByteArray40;
			local101.aShortArray39 = this.aShortArray39;
			local101.aByte7 = this.aByte7;
			local101.anIntArray387 = this.anIntArray387;
			local101.anIntArray378 = this.anIntArray378;
			local101.anIntArray377 = this.anIntArray377;
			local101.anIntArrayArray27 = this.anIntArrayArray27;
			local101.anIntArrayArray26 = this.anIntArrayArray26;
			local101.aBoolean130 = this.aBoolean130;
			local101.anIntArray386 = new int[local101.anInt2866];
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
			for (local201 = 0; local201 < local101.anInt2866; local201++) {
				local209 = this.anIntArray385[local201] + arg1;
				local216 = this.anIntArray388[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray386[local201] = this.anIntArray386[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt2866; local201++) {
				local209 = (-this.anIntArray386[local201] << 16) / super.anInt2855;
				if (local209 < arg5) {
					local216 = this.anIntArray385[local201] + arg1;
					local220 = this.anIntArray388[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray386[local201] = this.anIntArray386[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt2868 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static131.anIntArray402[0] = -1;
		if (this.anInt2868 != 1) {
			this.method2006();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2863 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2863 << 9;
		if (local64 / local40 >= Static87.anInt1866) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2863 << 9;
		if (local77 / local40 <= Static87.anInt1867) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2863 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static87.anInt1869) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2855 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static87.anInt1872) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2855 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2867 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static131.aBoolean131) {
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
			local219 = Static131.anInt2872 - Static87.anInt1868;
			local223 = Static131.anInt2870 - Static87.anInt1870;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean130) {
					Static131.anIntArray404[Static131.anInt2871++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static87.anInt1868;
		local219 = Static87.anInt1870;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static131.anIntArray400[arg0];
			local257 = Static131.anIntArray406[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2866; local269++) {
			@Pc(275) int local275 = this.anIntArray385[local269];
			@Pc(280) int local280 = this.anIntArray386[local269];
			@Pc(285) int local285 = this.anIntArray388[local269];
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
			Static131.anIntArray392[local269] = local285 - local29;
			if (local285 >= 50) {
				Static131.anIntArray394[local269] = local172 + (local275 << 9) / local285;
				Static131.anIntArray407[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static131.anIntArray394[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static131.anIntArray395[local269] = local275;
				Static131.anIntArray401[local269] = local297;
				Static131.anIntArray389[local269] = local285;
			}
		}
		try {
			this.method2003(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
	public void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2866; local1++) {
			this.anIntArray385[local1] += arg0;
			this.anIntArray386[local1] += arg1;
			this.anIntArray388[local1] += arg2;
		}
		this.anInt2868 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method1999(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static131.aByteArray43.length < this.anInt2865) {
			Static131.aByteArray43 = new byte[this.anInt2865 + 100];
		}
		return this.method2005(arg0, Static131.aClass2_Sub1_Sub1_Sub7_3, Static131.aByteArray43);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[IIII)V")
	private void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static131.anInt2873 = 0;
			Static131.anInt2874 = 0;
			Static131.anInt2869 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray27.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray27[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static131.anInt2873 += this.anIntArray385[local36];
						Static131.anInt2874 += this.anIntArray386[local36];
						Static131.anInt2869 += this.anIntArray388[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static131.anInt2873 = Static131.anInt2873 / local6 + arg2;
				Static131.anInt2874 = Static131.anInt2874 / local6 + arg3;
				Static131.anInt2869 = Static131.anInt2869 / local6 + arg4;
			} else {
				Static131.anInt2873 = arg2;
				Static131.anInt2874 = arg3;
				Static131.anInt2869 = arg4;
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
						this.anIntArray385[local31] += arg2;
						this.anIntArray386[local31] += arg3;
						this.anIntArray388[local31] += arg4;
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
						this.anIntArray385[local31] -= Static131.anInt2873;
						this.anIntArray386[local31] -= Static131.anInt2874;
						this.anIntArray388[local31] -= Static131.anInt2869;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static131.anIntArray400[local225];
							local235 = Static131.anIntArray406[local225];
							local251 = this.anIntArray386[local31] * local231 + this.anIntArray385[local31] * local235 >> 16;
							this.anIntArray386[local31] = this.anIntArray386[local31] * local235 - this.anIntArray385[local31] * local231 >> 16;
							this.anIntArray385[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static131.anIntArray400[local36];
							local235 = Static131.anIntArray406[local36];
							local251 = this.anIntArray386[local31] * local235 - this.anIntArray388[local31] * local231 >> 16;
							this.anIntArray388[local31] = this.anIntArray386[local31] * local231 + this.anIntArray388[local31] * local235 >> 16;
							this.anIntArray386[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static131.anIntArray400[local219];
							local235 = Static131.anIntArray406[local219];
							local251 = this.anIntArray388[local31] * local231 + this.anIntArray385[local31] * local235 >> 16;
							this.anIntArray388[local31] = this.anIntArray388[local31] * local235 - this.anIntArray385[local31] * local231 >> 16;
							this.anIntArray385[local31] = local251;
						}
						this.anIntArray385[local31] += Static131.anInt2873;
						this.anIntArray386[local31] += Static131.anInt2874;
						this.anIntArray388[local31] += Static131.anInt2869;
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
						this.anIntArray385[local31] -= Static131.anInt2873;
						this.anIntArray386[local31] -= Static131.anInt2874;
						this.anIntArray388[local31] -= Static131.anInt2869;
						this.anIntArray385[local31] = this.anIntArray385[local31] * arg2 / 128;
						this.anIntArray386[local31] = this.anIntArray386[local31] * arg3 / 128;
						this.anIntArray388[local31] = this.anIntArray388[local31] * arg4 / 128;
						this.anIntArray385[local31] += Static131.anInt2873;
						this.anIntArray386[local31] += Static131.anInt2874;
						this.anIntArray388[local31] += Static131.anInt2869;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray26 != null && this.aByteArray39 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray39[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray39[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public void method2001() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2866; local1++) {
			this.anIntArray385[local1] = -this.anIntArray385[local1];
			this.anIntArray388[local1] = -this.anIntArray388[local1];
		}
		this.anInt2868 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public void method2002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static131.anIntArray402[0] = -1;
		if (this.anInt2868 != 2 && this.anInt2868 != 1) {
			this.method2016();
		}
		@Pc(15) int local15 = Static87.anInt1868;
		@Pc(17) int local17 = Static87.anInt1870;
		@Pc(21) int local21 = Static131.anIntArray400[0];
		@Pc(25) int local25 = Static131.anIntArray406[0];
		@Pc(29) int local29 = Static131.anIntArray400[arg0];
		@Pc(33) int local33 = Static131.anIntArray406[arg0];
		@Pc(37) int local37 = Static131.anIntArray400[arg1];
		@Pc(41) int local41 = Static131.anIntArray406[arg1];
		@Pc(45) int local45 = Static131.anIntArray400[arg2];
		@Pc(49) int local49 = Static131.anIntArray406[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2866; local61++) {
			@Pc(67) int local67 = this.anIntArray385[local61];
			@Pc(72) int local72 = this.anIntArray386[local61];
			@Pc(77) int local77 = this.anIntArray388[local61];
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
			Static131.anIntArray392[local61] = local77 - local59;
			Static131.anIntArray394[local61] = local15 + (local67 << 9) / arg6;
			Static131.anIntArray407[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2867 > 0) {
				Static131.anIntArray395[local61] = local67;
				Static131.anIntArray401[local61] = local89;
				Static131.anIntArray389[local61] = local77;
			}
		}
		try {
			this.method2003(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZI)V")
	private void method2003(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2861 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2861; local6++) {
			Static131.anIntArray402[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2865; local18++) {
			if (this.anIntArray382[local18] != -2) {
				local30 = this.anIntArray379[local18];
				local35 = this.anIntArray383[local18];
				local40 = this.anIntArray381[local18];
				local44 = Static131.anIntArray394[local30];
				local48 = Static131.anIntArray394[local35];
				local52 = Static131.anIntArray394[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static131.anIntArray395[local30];
					local71 = Static131.anIntArray395[local35];
					@Pc(75) int local75 = Static131.anIntArray395[local40];
					@Pc(79) int local79 = Static131.anIntArray401[local30];
					local83 = Static131.anIntArray401[local35];
					local87 = Static131.anIntArray401[local40];
					@Pc(91) int local91 = Static131.anIntArray389[local30];
					local95 = Static131.anIntArray389[local35];
					@Pc(99) int local99 = Static131.anIntArray389[local40];
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
						Static131.aBooleanArray20[local18] = true;
						@Pc(180) int local180 = (Static131.anIntArray392[local30] + Static131.anIntArray392[local35] + Static131.anIntArray392[local40]) / 3 + this.anInt2864;
						Static131.anIntArrayArray29[local180][Static131.anIntArray402[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method2004(Static131.anInt2872, Static131.anInt2870, Static131.anIntArray407[local30], Static131.anIntArray407[local35], Static131.anIntArray407[local40], local44, local48, local52)) {
						Static131.anIntArray404[Static131.anInt2871++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static131.anIntArray407[local40] - Static131.anIntArray407[local35]) - (Static131.anIntArray407[local30] - Static131.anIntArray407[local35]) * (local52 - local48) > 0) {
						Static131.aBooleanArray20[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static87.anInt1874 && local48 <= Static87.anInt1874 && local52 <= Static87.anInt1874) {
							Static131.aBooleanArray19[local18] = false;
						} else {
							Static131.aBooleanArray19[local18] = true;
						}
						local67 = (Static131.anIntArray392[local30] + Static131.anIntArray392[local35] + Static131.anIntArray392[local40]) / 3 + this.anInt2864;
						Static131.anIntArrayArray29[local67][Static131.anIntArray402[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray41 == null) {
			for (local30 = this.anInt2861 - 1; local30 >= 0; local30--) {
				local35 = Static131.anIntArray402[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static131.anIntArrayArray29[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method2018(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static131.anIntArray393[local30] = 0;
			Static131.anIntArray390[local30] = 0;
		}
		for (local35 = this.anInt2861 - 1; local35 >= 0; local35--) {
			local40 = Static131.anIntArray402[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static131.anIntArrayArray29[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray41[local52];
					local71 = Static131.anIntArray393[local388]++;
					Static131.anIntArrayArray28[local388][local71] = local52;
					if (local388 < 10) {
						Static131.anIntArray390[local388] += local35;
					} else if (local388 == 10) {
						Static131.anIntArray399[local71] = local35;
					} else {
						Static131.anIntArray397[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static131.anIntArray393[1] > 0 || Static131.anIntArray393[2] > 0) {
			local40 = (Static131.anIntArray390[1] + Static131.anIntArray390[2]) / (Static131.anIntArray393[1] + Static131.anIntArray393[2]);
		}
		local44 = 0;
		if (Static131.anIntArray393[3] > 0 || Static131.anIntArray393[4] > 0) {
			local44 = (Static131.anIntArray390[3] + Static131.anIntArray390[4]) / (Static131.anIntArray393[3] + Static131.anIntArray393[4]);
		}
		local48 = 0;
		if (Static131.anIntArray393[6] > 0 || Static131.anIntArray393[8] > 0) {
			local48 = (Static131.anIntArray390[6] + Static131.anIntArray390[8]) / (Static131.anIntArray393[6] + Static131.anIntArray393[8]);
		}
		local67 = 0;
		local71 = Static131.anIntArray393[10];
		@Pc(521) int[] local521 = Static131.anIntArrayArray28[10];
		@Pc(523) int[] local523 = Static131.anIntArray399;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static131.anIntArray393[11];
			local521 = Static131.anIntArrayArray28[11];
			local523 = Static131.anIntArray397;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method2018(local521[local67++]);
				if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static131.anIntArray393[11];
					local521 = Static131.anIntArrayArray28[11];
					local523 = Static131.anIntArray397;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method2018(local521[local67++]);
				if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static131.anIntArray393[11];
					local521 = Static131.anIntArrayArray28[11];
					local523 = Static131.anIntArray397;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method2018(local521[local67++]);
				if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static131.anIntArray393[11];
					local521 = Static131.anIntArrayArray28[11];
					local523 = Static131.anIntArray397;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static131.anIntArray393[local83];
			@Pc(686) int[] local686 = Static131.anIntArrayArray28[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method2018(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method2018(local521[local67++]);
			if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
				local67 = 0;
				local521 = Static131.anIntArrayArray28[11];
				local71 = Static131.anIntArray393[11];
				local523 = Static131.anIntArray397;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!wb;[B)Lclient!wb;")
	private Class2_Sub1_Sub1_Sub7 method2005(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub7 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2866 = this.anInt2866;
		arg1.anInt2865 = this.anInt2865;
		arg1.anInt2867 = this.anInt2867;
		if (arg1.anIntArray385 == null || arg1.anIntArray385.length < this.anInt2866) {
			arg1.anIntArray385 = new int[this.anInt2866 + 100];
			arg1.anIntArray386 = new int[this.anInt2866 + 100];
			arg1.anIntArray388 = new int[this.anInt2866 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2866; local43++) {
			arg1.anIntArray385[local43] = this.anIntArray385[local43];
			arg1.anIntArray386[local43] = this.anIntArray386[local43];
			arg1.anIntArray388[local43] = this.anIntArray388[local43];
		}
		if (arg0) {
			arg1.aByteArray39 = this.aByteArray39;
		} else {
			arg1.aByteArray39 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray39 == null) {
				for (local88 = 0; local88 < this.anInt2865; local88++) {
					arg1.aByteArray39[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2865; local88++) {
					arg1.aByteArray39[local88] = this.aByteArray39[local88];
				}
			}
		}
		arg1.anIntArray379 = this.anIntArray379;
		arg1.anIntArray383 = this.anIntArray383;
		arg1.anIntArray381 = this.anIntArray381;
		arg1.anIntArray384 = this.anIntArray384;
		arg1.anIntArray380 = this.anIntArray380;
		arg1.anIntArray382 = this.anIntArray382;
		arg1.aByteArray41 = this.aByteArray41;
		arg1.aByteArray40 = this.aByteArray40;
		arg1.aShortArray39 = this.aShortArray39;
		arg1.aByte7 = this.aByte7;
		arg1.anIntArray387 = this.anIntArray387;
		arg1.anIntArray378 = this.anIntArray378;
		arg1.anIntArray377 = this.anIntArray377;
		arg1.anIntArrayArray27 = this.anIntArrayArray27;
		arg1.anIntArrayArray26 = this.anIntArrayArray26;
		arg1.aBoolean130 = this.aBoolean130;
		arg1.anInt2868 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	public void method2006() {
		if (this.anInt2868 == 1) {
			return;
		}
		this.anInt2868 = 1;
		super.anInt2855 = 0;
		this.anInt2862 = 0;
		this.anInt2863 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2866; local18++) {
			@Pc(24) int local24 = this.anIntArray385[local18];
			@Pc(29) int local29 = this.anIntArray386[local18];
			@Pc(34) int local34 = this.anIntArray388[local18];
			if (-local29 > super.anInt2855) {
				super.anInt2855 = -local29;
			}
			if (local29 > this.anInt2862) {
				this.anInt2862 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2863) {
				this.anInt2863 = local58;
			}
		}
		this.anInt2863 = (int) (Math.sqrt((double) this.anInt2863) + 0.99D);
		this.anInt2864 = (int) (Math.sqrt((double) (this.anInt2863 * this.anInt2863 + super.anInt2855 * super.anInt2855)) + 0.99D);
		this.anInt2861 = this.anInt2864 + (int) (Math.sqrt((double) (this.anInt2863 * this.anInt2863 + this.anInt2862 * this.anInt2862)) + 0.99D);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(III)V")
	public void method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2866; local1++) {
			this.anIntArray385[local1] = this.anIntArray385[local1] * arg0 / 128;
			this.anIntArray386[local1] = this.anIntArray386[local1] * arg1 / 128;
			this.anIntArray388[local1] = this.anIntArray388[local1] * arg2 / 128;
		}
		this.anInt2868 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	public void method2008() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2866; local1++) {
			@Pc(7) int local7 = this.anIntArray385[local1];
			this.anIntArray385[local1] = this.anIntArray388[local1];
			this.anIntArray388[local1] = -local7;
		}
		this.anInt2868 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
	public void method2009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static131.anIntArray402[0] = -1;
		if (this.anInt2868 != 2 && this.anInt2868 != 1) {
			this.method2016();
		}
		@Pc(15) int local15 = Static87.anInt1868;
		@Pc(17) int local17 = Static87.anInt1870;
		@Pc(21) int local21 = Static131.anIntArray400[0];
		@Pc(25) int local25 = Static131.anIntArray406[0];
		@Pc(29) int local29 = Static131.anIntArray400[arg0];
		@Pc(33) int local33 = Static131.anIntArray406[arg0];
		@Pc(37) int local37 = Static131.anIntArray400[arg1];
		@Pc(41) int local41 = Static131.anIntArray406[arg1];
		@Pc(45) int local45 = Static131.anIntArray400[arg2];
		@Pc(49) int local49 = Static131.anIntArray406[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2866; local61++) {
			@Pc(67) int local67 = this.anIntArray385[local61];
			@Pc(72) int local72 = this.anIntArray386[local61];
			@Pc(77) int local77 = this.anIntArray388[local61];
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
			Static131.anIntArray392[local61] = local77 - local59;
			Static131.anIntArray394[local61] = local15 + (local67 << 9) / local77;
			Static131.anIntArray407[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2867 > 0) {
				Static131.anIntArray395[local61] = local67;
				Static131.anIntArray401[local61] = local89;
				Static131.anIntArray389[local61] = local77;
			}
		}
		try {
			this.method2003(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method2010(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray27 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class55 local12 = arg0.aClass55Array1[arg1];
		@Pc(15) Class2_Sub6 local15 = local12.aClass2_Sub6_1;
		Static131.anInt2873 = 0;
		Static131.anInt2874 = 0;
		Static131.anInt2869 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1664; local23++) {
			@Pc(29) int local29 = local12.anIntArray207[local23];
			this.method2000(local15.anIntArray134[local29], local15.anIntArrayArray11[local29], local12.anIntArray204[local23], local12.anIntArray202[local23], local12.anIntArray205[local23]);
		}
		this.anInt2868 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	private void method2011(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static87.anInt1868;
		@Pc(3) int local3 = Static87.anInt1870;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray379[arg0];
		@Pc(15) int local15 = this.anIntArray383[arg0];
		@Pc(20) int local20 = this.anIntArray381[arg0];
		@Pc(24) int local24 = Static131.anIntArray389[local10];
		@Pc(28) int local28 = Static131.anIntArray389[local15];
		@Pc(32) int local32 = Static131.anIntArray389[local20];
		if (this.aByteArray39 == null) {
			Static87.anInt1871 = 0;
		} else {
			Static87.anInt1871 = this.aByteArray39[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static131.anIntArray398[0] = Static131.anIntArray394[local10];
			Static131.anIntArray403[0] = Static131.anIntArray407[local10];
			local5++;
			Static131.anIntArray405[0] = this.anIntArray384[arg0];
		} else {
			local73 = Static131.anIntArray395[local10];
			local77 = Static131.anIntArray401[local10];
			local82 = this.anIntArray384[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static131.anIntArray391[local32 - local24];
				Static131.anIntArray398[0] = local1 + (local73 + ((Static131.anIntArray395[local20] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray403[0] = local3 + (local77 + ((Static131.anIntArray401[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static131.anIntArray405[0] = local82 + ((this.anIntArray382[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static131.anIntArray391[local28 - local24];
				Static131.anIntArray398[local5] = local1 + (local73 + ((Static131.anIntArray395[local15] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray403[local5] = local3 + (local77 + ((Static131.anIntArray401[local15] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray405[local5++] = local82 + ((this.anIntArray380[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static131.anIntArray398[local5] = Static131.anIntArray394[local15];
			Static131.anIntArray403[local5] = Static131.anIntArray407[local15];
			Static131.anIntArray405[local5++] = this.anIntArray380[arg0];
		} else {
			local73 = Static131.anIntArray395[local15];
			local77 = Static131.anIntArray401[local15];
			local82 = this.anIntArray380[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static131.anIntArray391[local24 - local28];
				Static131.anIntArray398[local5] = local1 + (local73 + ((Static131.anIntArray395[local10] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray403[local5] = local3 + (local77 + ((Static131.anIntArray401[local10] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray405[local5++] = local82 + ((this.anIntArray384[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static131.anIntArray391[local32 - local28];
				Static131.anIntArray398[local5] = local1 + (local73 + ((Static131.anIntArray395[local20] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray403[local5] = local3 + (local77 + ((Static131.anIntArray401[local20] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray405[local5++] = local82 + ((this.anIntArray382[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static131.anIntArray398[local5] = Static131.anIntArray394[local20];
			Static131.anIntArray403[local5] = Static131.anIntArray407[local20];
			Static131.anIntArray405[local5++] = this.anIntArray382[arg0];
		} else {
			local73 = Static131.anIntArray395[local20];
			local77 = Static131.anIntArray401[local20];
			local82 = this.anIntArray382[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static131.anIntArray391[local28 - local32];
				Static131.anIntArray398[local5] = local1 + (local73 + ((Static131.anIntArray395[local15] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray403[local5] = local3 + (local77 + ((Static131.anIntArray401[local15] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray405[local5++] = local82 + ((this.anIntArray380[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static131.anIntArray391[local24 - local32];
				Static131.anIntArray398[local5] = local1 + (local73 + ((Static131.anIntArray395[local10] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray403[local5] = local3 + (local77 + ((Static131.anIntArray401[local10] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray405[local5++] = local82 + ((this.anIntArray384[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static131.anIntArray398[0];
		local77 = Static131.anIntArray398[1];
		local82 = Static131.anIntArray398[2];
		local95 = Static131.anIntArray403[0];
		@Pc(590) int local590 = Static131.anIntArray403[1];
		@Pc(594) int local594 = Static131.anIntArray403[2];
		Static87.aBoolean76 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static87.anInt1874 || local77 > Static87.anInt1874 || local82 > Static87.anInt1874) {
				Static87.aBoolean76 = true;
			}
			if (this.aShortArray39 != null && this.aShortArray39[arg0] != -1) {
				if (this.aByteArray40 == null || this.aByteArray40[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray40[arg0] & 0xFF;
					local683 = this.anIntArray387[local678];
					local688 = this.anIntArray378[local678];
					local693 = this.anIntArray377[local678];
				}
				if (this.anIntArray382[arg0] == -1) {
					Static87.method1429(local95, local590, local594, local73, local77, local82, this.anIntArray384[arg0], this.anIntArray384[arg0], this.anIntArray384[arg0], Static131.anIntArray395[local683], Static131.anIntArray395[local688], Static131.anIntArray395[local693], Static131.anIntArray401[local683], Static131.anIntArray401[local688], Static131.anIntArray401[local693], Static131.anIntArray389[local683], Static131.anIntArray389[local688], Static131.anIntArray389[local693], this.aShortArray39[arg0]);
				} else {
					Static87.method1429(local95, local590, local594, local73, local77, local82, Static131.anIntArray405[0], Static131.anIntArray405[1], Static131.anIntArray405[2], Static131.anIntArray395[local683], Static131.anIntArray395[local688], Static131.anIntArray395[local693], Static131.anIntArray401[local683], Static131.anIntArray401[local688], Static131.anIntArray401[local693], Static131.anIntArray389[local683], Static131.anIntArray389[local688], Static131.anIntArray389[local693], this.aShortArray39[arg0]);
				}
			} else if (this.anIntArray382[arg0] == -1) {
				Static87.method1419(local95, local590, local594, local73, local77, local82, Static131.anIntArray396[this.anIntArray384[arg0]]);
			} else {
				Static87.method1428(local95, local590, local594, local73, local77, local82, Static131.anIntArray405[0], Static131.anIntArray405[1], Static131.anIntArray405[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static87.anInt1874 || local77 > Static87.anInt1874 || local82 > Static87.anInt1874 || Static131.anIntArray398[3] < 0 || Static131.anIntArray398[3] > Static87.anInt1874) {
			Static87.aBoolean76 = true;
		}
		if (this.aShortArray39 == null || this.aShortArray39[arg0] == -1) {
			if (this.anIntArray382[arg0] == -1) {
				local683 = Static131.anIntArray396[this.anIntArray384[arg0]];
				Static87.method1419(local95, local590, local594, local73, local77, local82, local683);
				Static87.method1419(local95, local594, Static131.anIntArray403[3], local73, local82, Static131.anIntArray398[3], local683);
				return;
			}
			Static87.method1428(local95, local590, local594, local73, local77, local82, Static131.anIntArray405[0], Static131.anIntArray405[1], Static131.anIntArray405[2]);
			Static87.method1428(local95, local594, Static131.anIntArray403[3], local73, local82, Static131.anIntArray398[3], Static131.anIntArray405[0], Static131.anIntArray405[2], Static131.anIntArray405[3]);
			return;
		}
		if (this.aByteArray40 == null || this.aByteArray40[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray40[arg0] & 0xFF;
			local683 = this.anIntArray387[local678];
			local688 = this.anIntArray378[local678];
			local693 = this.anIntArray377[local678];
		}
		@Pc(956) short local956 = this.aShortArray39[arg0];
		if (this.anIntArray382[arg0] == -1) {
			Static87.method1429(local95, local590, local594, local73, local77, local82, this.anIntArray384[arg0], this.anIntArray384[arg0], this.anIntArray384[arg0], Static131.anIntArray395[local683], Static131.anIntArray395[local688], Static131.anIntArray395[local693], Static131.anIntArray401[local683], Static131.anIntArray401[local688], Static131.anIntArray401[local693], Static131.anIntArray389[local683], Static131.anIntArray389[local688], Static131.anIntArray389[local693], local956);
			Static87.method1429(local95, local594, Static131.anIntArray403[3], local73, local82, Static131.anIntArray398[3], this.anIntArray384[arg0], this.anIntArray384[arg0], this.anIntArray384[arg0], Static131.anIntArray395[local683], Static131.anIntArray395[local688], Static131.anIntArray395[local693], Static131.anIntArray401[local683], Static131.anIntArray401[local688], Static131.anIntArray401[local693], Static131.anIntArray389[local683], Static131.anIntArray389[local688], Static131.anIntArray389[local693], local956);
			return;
		}
		Static87.method1429(local95, local590, local594, local73, local77, local82, Static131.anIntArray405[0], Static131.anIntArray405[1], Static131.anIntArray405[2], Static131.anIntArray395[local683], Static131.anIntArray395[local688], Static131.anIntArray395[local693], Static131.anIntArray401[local683], Static131.anIntArray401[local688], Static131.anIntArray401[local693], Static131.anIntArray389[local683], Static131.anIntArray389[local688], Static131.anIntArray389[local693], local956);
		Static87.method1429(local95, local594, Static131.anIntArray403[3], local73, local82, Static131.anIntArray398[3], Static131.anIntArray405[0], Static131.anIntArray405[2], Static131.anIntArray405[3], Static131.anIntArray395[local683], Static131.anIntArray395[local688], Static131.anIntArray395[local693], Static131.anIntArray401[local683], Static131.anIntArray401[local688], Static131.anIntArray401[local693], Static131.anIntArray389[local683], Static131.anIntArray389[local688], Static131.anIntArray389[local693], local956);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method2012(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static131.aByteArray42.length < this.anInt2865) {
			Static131.aByteArray42 = new byte[this.anInt2865 + 100];
		}
		return this.method2005(arg0, Static131.aClass2_Sub1_Sub1_Sub7_2, Static131.aByteArray42);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	public int method2013() {
		this.method2006();
		return this.anInt2863;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public void method2014(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static131.anIntArray400[arg0];
		@Pc(7) int local7 = Static131.anIntArray406[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2866; local9++) {
			@Pc(26) int local26 = this.anIntArray386[local9] * local7 - this.anIntArray388[local9] * local3 >> 16;
			this.anIntArray388[local9] = this.anIntArray386[local9] * local3 + this.anIntArray388[local9] * local7 >> 16;
			this.anIntArray386[local9] = local26;
		}
		this.anInt2868 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "()V")
	private void method2016() {
		if (this.anInt2868 == 2) {
			return;
		}
		this.anInt2868 = 2;
		this.anInt2863 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2866; local12++) {
			@Pc(18) int local18 = this.anIntArray385[local12];
			@Pc(23) int local23 = this.anIntArray386[local12];
			@Pc(28) int local28 = this.anIntArray388[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2863) {
				this.anInt2863 = local40;
			}
		}
		this.anInt2863 = (int) (Math.sqrt((double) this.anInt2863) + 0.99D);
		this.anInt2864 = this.anInt2863;
		this.anInt2861 = this.anInt2863 + this.anInt2863;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
	public void method2017() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2866; local1++) {
			@Pc(7) int local7 = this.anIntArray388[local1];
			this.anIntArray388[local1] = this.anIntArray385[local1];
			this.anIntArray385[local1] = -local7;
		}
		this.anInt2868 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	private void method2018(@OriginalArg(0) int arg0) {
		if (Static131.aBooleanArray20[arg0]) {
			this.method2011(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray379[arg0];
		@Pc(17) int local17 = this.anIntArray383[arg0];
		@Pc(22) int local22 = this.anIntArray381[arg0];
		Static87.aBoolean76 = Static131.aBooleanArray19[arg0];
		if (this.aByteArray39 == null) {
			Static87.anInt1871 = 0;
		} else {
			Static87.anInt1871 = this.aByteArray39[arg0] & 0xFF;
		}
		if (this.aShortArray39 != null && this.aShortArray39[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray40 == null || this.aByteArray40[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray40[arg0] & 0xFF;
				local133 = this.anIntArray387[local128];
				local138 = this.anIntArray378[local128];
				local143 = this.anIntArray377[local128];
			}
			if (this.anIntArray382[arg0] == -1) {
				Static87.method1429(Static131.anIntArray407[local12], Static131.anIntArray407[local17], Static131.anIntArray407[local22], Static131.anIntArray394[local12], Static131.anIntArray394[local17], Static131.anIntArray394[local22], this.anIntArray384[arg0], this.anIntArray384[arg0], this.anIntArray384[arg0], Static131.anIntArray395[local133], Static131.anIntArray395[local138], Static131.anIntArray395[local143], Static131.anIntArray401[local133], Static131.anIntArray401[local138], Static131.anIntArray401[local143], Static131.anIntArray389[local133], Static131.anIntArray389[local138], Static131.anIntArray389[local143], this.aShortArray39[arg0]);
			} else {
				Static87.method1429(Static131.anIntArray407[local12], Static131.anIntArray407[local17], Static131.anIntArray407[local22], Static131.anIntArray394[local12], Static131.anIntArray394[local17], Static131.anIntArray394[local22], this.anIntArray384[arg0], this.anIntArray380[arg0], this.anIntArray382[arg0], Static131.anIntArray395[local133], Static131.anIntArray395[local138], Static131.anIntArray395[local143], Static131.anIntArray401[local133], Static131.anIntArray401[local138], Static131.anIntArray401[local143], Static131.anIntArray389[local133], Static131.anIntArray389[local138], Static131.anIntArray389[local143], this.aShortArray39[arg0]);
			}
		} else if (this.anIntArray382[arg0] == -1) {
			Static87.method1419(Static131.anIntArray407[local12], Static131.anIntArray407[local17], Static131.anIntArray407[local22], Static131.anIntArray394[local12], Static131.anIntArray394[local17], Static131.anIntArray394[local22], Static131.anIntArray396[this.anIntArray384[arg0]]);
		} else {
			Static87.method1428(Static131.anIntArray407[local12], Static131.anIntArray407[local17], Static131.anIntArray407[local22], Static131.anIntArray394[local12], Static131.anIntArray394[local17], Static131.anIntArray394[local22], this.anIntArray384[arg0], this.anIntArray380[arg0], this.anIntArray382[arg0]);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ge;ILclient!ge;I[I)V")
	public void method2019(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2010(arg0, arg1);
			return;
		}
		@Pc(18) Class55 local18 = arg0.aClass55Array1[arg1];
		@Pc(23) Class55 local23 = arg2.aClass55Array1[arg3];
		@Pc(26) Class2_Sub6 local26 = local18.aClass2_Sub6_1;
		Static131.anInt2873 = 0;
		Static131.anInt2874 = 0;
		Static131.anInt2869 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1664; local41++) {
			local47 = local18.anIntArray207[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray134[local47] == 0) {
				this.method2000(local26.anIntArray134[local47], local26.anIntArrayArray11[local47], local18.anIntArray204[local41], local18.anIntArray202[local41], local18.anIntArray205[local41]);
			}
		}
		Static131.anInt2873 = 0;
		Static131.anInt2874 = 0;
		Static131.anInt2869 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1664; local47++) {
			@Pc(112) int local112 = local23.anIntArray207[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray134[local112] == 0) {
				this.method2000(local26.anIntArray134[local112], local26.anIntArrayArray11[local112], local23.anIntArray204[local47], local23.anIntArray202[local47], local23.anIntArray205[local47]);
			}
		}
		this.anInt2868 = 0;
	}
}
