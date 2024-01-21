import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class1_Sub3_Sub4_Sub4 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!eb", name = "ob", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!eb", name = "rb", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!eb", name = "sb", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!eb", name = "zb", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!eb", name = "Ab", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!eb", name = "Cb", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!eb", name = "Db", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!eb", name = "Ib", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!eb", name = "Kb", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!eb", name = "Lb", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!eb", name = "Nb", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!eb", name = "Ob", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!eb", name = "Pb", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!eb", name = "Qb", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!eb", name = "Rb", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!eb", name = "vc", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "I")
	public int anInt909 = 0;

	@OriginalMember(owner = "client!eb", name = "tb", descriptor = "I")
	public int anInt910 = 0;

	@OriginalMember(owner = "client!eb", name = "Eb", descriptor = "I")
	public int anInt915 = 0;

	@OriginalMember(owner = "client!eb", name = "Gb", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!eb", name = "Mb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4_Sub4() {
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([Lclient!eb;I)V")
	public Class1_Sub3_Sub4_Sub4(@OriginalArg(0) Class1_Sub3_Sub4_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt910 = 0;
		this.anInt909 = 0;
		this.anInt915 = 0;
		this.aByte3 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class1_Sub3_Sub4_Sub4 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt910 += local41.anInt910;
				this.anInt909 += local41.anInt909;
				this.anInt915 += local41.anInt915;
				if (local41.aByteArray20 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local41.aByte3;
					}
					if (this.aByte3 != local41.aByte3) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray18 != null;
				local22 |= local41.aByteArray16 != null;
			}
		}
		this.anIntArray122 = new int[this.anInt910];
		this.anIntArray126 = new int[this.anInt910];
		this.anIntArray123 = new int[this.anInt910];
		this.anIntArray127 = new int[this.anInt909];
		this.anIntArray119 = new int[this.anInt909];
		this.anIntArray129 = new int[this.anInt909];
		this.anIntArray124 = new int[this.anInt909];
		this.anIntArray130 = new int[this.anInt909];
		this.anIntArray128 = new int[this.anInt909];
		if (this.anInt915 > 0) {
			this.anIntArray120 = new int[this.anInt915];
			this.anIntArray121 = new int[this.anInt915];
			this.anIntArray125 = new int[this.anInt915];
		}
		if (local18) {
			this.aByteArray20 = new byte[this.anInt909];
		}
		if (local20) {
			this.aByteArray18 = new byte[this.anInt909];
		}
		if (local22) {
			this.aByteArray16 = new byte[this.anInt909];
			this.aShortArray5 = new short[this.anInt909];
		}
		this.anInt910 = 0;
		this.anInt909 = 0;
		this.anInt915 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class1_Sub3_Sub4_Sub4 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt910;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt910; local221++) {
					this.anIntArray122[this.anInt910] = local214.anIntArray122[local221];
					this.anIntArray126[this.anInt910] = local214.anIntArray126[local221];
					this.anIntArray123[this.anInt910] = local214.anIntArray123[local221];
					this.anInt910++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt909; local262++) {
					this.anIntArray127[this.anInt909] = local214.anIntArray127[local262] + local219;
					this.anIntArray119[this.anInt909] = local214.anIntArray119[local262] + local219;
					this.anIntArray129[this.anInt909] = local214.anIntArray129[local262] + local219;
					this.anIntArray124[this.anInt909] = local214.anIntArray124[local262];
					this.anIntArray130[this.anInt909] = local214.anIntArray130[local262];
					this.anIntArray128[this.anInt909] = local214.anIntArray128[local262];
					if (local18) {
						if (local214.aByteArray20 == null) {
							this.aByteArray20[this.anInt909] = local214.aByte3;
						} else {
							this.aByteArray20[this.anInt909] = local214.aByteArray20[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray18 == null) {
							this.aByteArray18[this.anInt909] = 0;
						} else {
							this.aByteArray18[this.anInt909] = local214.aByteArray18[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray16 == null || local214.aByteArray16[local262] == -1) {
							this.aByteArray16[this.anInt909] = -1;
						} else {
							this.aByteArray16[this.anInt909] = (byte) (local214.aByteArray16[local262] + local207);
							this.aShortArray5[this.anInt909] = local214.aShortArray5[local262];
						}
					}
					this.anInt909++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt915; local418++) {
					this.anIntArray120[this.anInt915] = local214.anIntArray120[local418] + local219;
					this.anIntArray121[this.anInt915] = local214.anIntArray121[local418] + local219;
					this.anIntArray125[this.anInt915] = local214.anIntArray125[local418] + local219;
					this.anInt915++;
				}
				local207 += local214.anInt915;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	public void method632() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt910; local1++) {
			@Pc(7) int local7 = this.anIntArray122[local1];
			this.anIntArray122[local1] = this.anIntArray123[local1];
			this.anIntArray123[local1] = -local7;
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIZ)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub3_Sub4_Sub4 local16;
		if (arg4) {
			local16 = new Class1_Sub3_Sub4_Sub4();
			local16.anInt910 = this.anInt910;
			local16.anInt909 = this.anInt909;
			local16.anInt915 = this.anInt915;
			local16.anIntArray122 = this.anIntArray122;
			local16.anIntArray123 = this.anIntArray123;
			local16.anIntArray127 = this.anIntArray127;
			local16.anIntArray119 = this.anIntArray119;
			local16.anIntArray129 = this.anIntArray129;
			local16.anIntArray124 = this.anIntArray124;
			local16.anIntArray130 = this.anIntArray130;
			local16.anIntArray128 = this.anIntArray128;
			local16.aByteArray20 = this.aByteArray20;
			local16.aByteArray18 = this.aByteArray18;
			local16.aByteArray16 = this.aByteArray16;
			local16.aShortArray5 = this.aShortArray5;
			local16.aByte3 = this.aByte3;
			local16.anIntArray120 = this.anIntArray120;
			local16.anIntArray121 = this.anIntArray121;
			local16.anIntArray125 = this.anIntArray125;
			local16.anIntArrayArray29 = this.anIntArrayArray29;
			local16.anIntArrayArray30 = this.anIntArrayArray30;
			local16.aBoolean28 = this.aBoolean28;
			local16.anIntArray126 = new int[local16.anInt910];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt910; local124++) {
			@Pc(130) int local130 = this.anIntArray122[local124];
			@Pc(135) int local135 = this.anIntArray126[local124];
			@Pc(140) int local140 = this.anIntArray123[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray126[local124] = local135 + local176 - local122;
		}
		local16.anInt911 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()V")
	public void method634() {
		if (this.anInt911 == 1) {
			return;
		}
		this.anInt911 = 1;
		super.anInt3024 = 0;
		this.anInt912 = 0;
		this.anInt913 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt910; local18++) {
			@Pc(24) int local24 = this.anIntArray122[local18];
			@Pc(29) int local29 = this.anIntArray126[local18];
			@Pc(34) int local34 = this.anIntArray123[local18];
			if (-local29 > super.anInt3024) {
				super.anInt3024 = -local29;
			}
			if (local29 > this.anInt912) {
				this.anInt912 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt913) {
				this.anInt913 = local58;
			}
		}
		this.anInt913 = (int) (Math.sqrt((double) this.anInt913) + 0.99D);
		this.anInt908 = (int) (Math.sqrt((double) (this.anInt913 * this.anInt913 + super.anInt3024 * super.anInt3024)) + 0.99D);
		this.anInt914 = this.anInt908 + (int) (Math.sqrt((double) (this.anInt913 * this.anInt913 + this.anInt912 * this.anInt912)) + 0.99D);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public void method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt910; local1++) {
			this.anIntArray122[local1] = this.anIntArray122[local1] * arg0 / 128;
			this.anIntArray126[local1] = this.anIntArray126[local1] * arg1 / 128;
			this.anIntArray123[local1] = this.anIntArray123[local1] * arg2 / 128;
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()V")
	private void method636() {
		if (this.anInt911 == 2) {
			return;
		}
		this.anInt911 = 2;
		this.anInt913 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt910; local12++) {
			@Pc(18) int local18 = this.anIntArray122[local12];
			@Pc(23) int local23 = this.anIntArray126[local12];
			@Pc(28) int local28 = this.anIntArray123[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt913) {
				this.anInt913 = local40;
			}
		}
		this.anInt913 = (int) (Math.sqrt((double) this.anInt913) + 0.99D);
		this.anInt908 = this.anInt913;
		this.anInt914 = this.anInt913 + this.anInt913;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	private void method637(@OriginalArg(0) int arg0) {
		if (Static31.aBooleanArray12[arg0]) {
			this.method649(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray127[arg0];
		@Pc(17) int local17 = this.anIntArray119[arg0];
		@Pc(22) int local22 = this.anIntArray129[arg0];
		Static114.aBoolean110 = Static31.aBooleanArray11[arg0];
		if (this.aByteArray18 == null) {
			Static114.anInt2814 = 0;
		} else {
			Static114.anInt2814 = this.aByteArray18[arg0] & 0xFF;
		}
		if (this.aByteArray16 != null && this.aByteArray16[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray16[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray120[local119];
			@Pc(129) int local129 = this.anIntArray121[local119];
			@Pc(134) int local134 = this.anIntArray125[local119];
			if (this.anIntArray128[arg0] == -1) {
				Static114.method1992(Static31.anIntArray147[local12], Static31.anIntArray147[local17], Static31.anIntArray147[local22], Static31.anIntArray135[local12], Static31.anIntArray135[local17], Static31.anIntArray135[local22], this.anIntArray124[arg0], this.anIntArray124[arg0], this.anIntArray124[arg0], Static31.anIntArray149[local124], Static31.anIntArray149[local129], Static31.anIntArray149[local134], Static31.anIntArray143[local124], Static31.anIntArray143[local129], Static31.anIntArray143[local134], Static31.anIntArray145[local124], Static31.anIntArray145[local129], Static31.anIntArray145[local134], this.aShortArray5[arg0]);
			} else {
				Static114.method1992(Static31.anIntArray147[local12], Static31.anIntArray147[local17], Static31.anIntArray147[local22], Static31.anIntArray135[local12], Static31.anIntArray135[local17], Static31.anIntArray135[local22], this.anIntArray124[arg0], this.anIntArray130[arg0], this.anIntArray128[arg0], Static31.anIntArray149[local124], Static31.anIntArray149[local129], Static31.anIntArray149[local134], Static31.anIntArray143[local124], Static31.anIntArray143[local129], Static31.anIntArray143[local134], Static31.anIntArray145[local124], Static31.anIntArray145[local129], Static31.anIntArray145[local134], this.aShortArray5[arg0]);
			}
		} else if (this.anIntArray128[arg0] == -1) {
			Static114.method1993(Static31.anIntArray147[local12], Static31.anIntArray147[local17], Static31.anIntArray147[local22], Static31.anIntArray135[local12], Static31.anIntArray135[local17], Static31.anIntArray135[local22], Static31.anIntArray134[this.anIntArray124[arg0]]);
		} else {
			Static114.method2002(Static31.anIntArray147[local12], Static31.anIntArray147[local17], Static31.anIntArray147[local22], Static31.anIntArray135[local12], Static31.anIntArray135[local17], Static31.anIntArray135[local22], this.anIntArray124[arg0], this.anIntArray130[arg0], this.anIntArray128[arg0]);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static31.anIntArray131[0] = -1;
		if (this.anInt911 != 1) {
			this.method634();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt913 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt913 << 9;
		if (local64 / local40 >= Static114.anInt2817) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt913 << 9;
		if (local77 / local40 <= Static114.anInt2819) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt913 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static114.anInt2818) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3024 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static114.anInt2816) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3024 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt915 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static31.aBoolean29) {
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
			local219 = Static31.anInt916 - Static114.anInt2812;
			local223 = Static31.anInt919 - Static114.anInt2813;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean28) {
					Static31.anIntArray137[Static31.anInt918++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static114.anInt2812;
		local219 = Static114.anInt2813;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static31.anIntArray133[arg0];
			local257 = Static31.anIntArray141[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt910; local269++) {
			@Pc(275) int local275 = this.anIntArray122[local269];
			@Pc(280) int local280 = this.anIntArray126[local269];
			@Pc(285) int local285 = this.anIntArray123[local269];
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
			Static31.anIntArray136[local269] = local285 - local29;
			if (local285 >= 50) {
				Static31.anIntArray135[local269] = local172 + (local275 << 9) / local285;
				Static31.anIntArray147[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static31.anIntArray135[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static31.anIntArray149[local269] = local275;
				Static31.anIntArray143[local269] = local297;
				Static31.anIntArray145[local269] = local285;
			}
		}
		try {
			this.method654(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIII)V")
	public void method638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static31.anIntArray131[0] = -1;
		if (this.anInt911 != 2 && this.anInt911 != 1) {
			this.method636();
		}
		@Pc(15) int local15 = Static114.anInt2812;
		@Pc(17) int local17 = Static114.anInt2813;
		@Pc(21) int local21 = Static31.anIntArray133[0];
		@Pc(25) int local25 = Static31.anIntArray141[0];
		@Pc(29) int local29 = Static31.anIntArray133[arg0];
		@Pc(33) int local33 = Static31.anIntArray141[arg0];
		@Pc(37) int local37 = Static31.anIntArray133[arg1];
		@Pc(41) int local41 = Static31.anIntArray141[arg1];
		@Pc(45) int local45 = Static31.anIntArray133[arg2];
		@Pc(49) int local49 = Static31.anIntArray141[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt910; local61++) {
			@Pc(67) int local67 = this.anIntArray122[local61];
			@Pc(72) int local72 = this.anIntArray126[local61];
			@Pc(77) int local77 = this.anIntArray123[local61];
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
			Static31.anIntArray136[local61] = local77 - local59;
			Static31.anIntArray135[local61] = local15 + (local67 << 9) / arg6;
			Static31.anIntArray147[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt915 > 0) {
				Static31.anIntArray149[local61] = local67;
				Static31.anIntArray143[local61] = local89;
				Static31.anIntArray145[local61] = local77;
			}
		}
		try {
			this.method654(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method639(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static31.aByteArray19.length < this.anInt909) {
			Static31.aByteArray19 = new byte[this.anInt909 + 100];
		}
		return this.method643(arg0, Static31.aClass1_Sub3_Sub4_Sub4_2, Static31.aByteArray19);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "()I")
	public int method640() {
		this.method634();
		return this.anInt913;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "()V")
	public void method641() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt910; local1++) {
			this.anIntArray122[local1] = -this.anIntArray122[local1];
			this.anIntArray123[local1] = -this.anIntArray123[local1];
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!h;ILclient!h;I[I)V")
	public void method642(@OriginalArg(0) Class1_Sub3_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method646(arg0, arg1);
			return;
		}
		@Pc(18) Class59 local18 = arg0.aClass59Array1[arg1];
		@Pc(23) Class59 local23 = arg2.aClass59Array1[arg3];
		@Pc(26) Class1_Sub15 local26 = local18.aClass1_Sub15_1;
		Static31.anInt917 = 0;
		Static31.anInt920 = 0;
		Static31.anInt921 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2339; local41++) {
			local47 = local18.anIntArray354[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray298[local47] == 0) {
				this.method651(local26.anIntArray298[local47], local26.anIntArrayArray57[local47], local18.anIntArray358[local41], local18.anIntArray359[local41], local18.anIntArray357[local41]);
			}
		}
		Static31.anInt917 = 0;
		Static31.anInt920 = 0;
		Static31.anInt921 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2339; local47++) {
			@Pc(112) int local112 = local23.anIntArray354[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray298[local112] == 0) {
				this.method651(local26.anIntArray298[local112], local26.anIntArrayArray57[local112], local23.anIntArray358[local47], local23.anIntArray359[local47], local23.anIntArray357[local47]);
			}
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!eb;[B)Lclient!eb;")
	private Class1_Sub3_Sub4_Sub4 method643(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub3_Sub4_Sub4 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt910 = this.anInt910;
		arg1.anInt909 = this.anInt909;
		arg1.anInt915 = this.anInt915;
		if (arg1.anIntArray122 == null || arg1.anIntArray122.length < this.anInt910) {
			arg1.anIntArray122 = new int[this.anInt910 + 100];
			arg1.anIntArray126 = new int[this.anInt910 + 100];
			arg1.anIntArray123 = new int[this.anInt910 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt910; local43++) {
			arg1.anIntArray122[local43] = this.anIntArray122[local43];
			arg1.anIntArray126[local43] = this.anIntArray126[local43];
			arg1.anIntArray123[local43] = this.anIntArray123[local43];
		}
		if (arg0) {
			arg1.aByteArray18 = this.aByteArray18;
		} else {
			arg1.aByteArray18 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray18 == null) {
				for (local88 = 0; local88 < this.anInt909; local88++) {
					arg1.aByteArray18[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt909; local88++) {
					arg1.aByteArray18[local88] = this.aByteArray18[local88];
				}
			}
		}
		arg1.anIntArray127 = this.anIntArray127;
		arg1.anIntArray119 = this.anIntArray119;
		arg1.anIntArray129 = this.anIntArray129;
		arg1.anIntArray124 = this.anIntArray124;
		arg1.anIntArray130 = this.anIntArray130;
		arg1.anIntArray128 = this.anIntArray128;
		arg1.aByteArray20 = this.aByteArray20;
		arg1.aByteArray16 = this.aByteArray16;
		arg1.aShortArray5 = this.aShortArray5;
		arg1.aByte3 = this.aByte3;
		arg1.anIntArray120 = this.anIntArray120;
		arg1.anIntArray121 = this.anIntArray121;
		arg1.anIntArray125 = this.anIntArray125;
		arg1.anIntArrayArray29 = this.anIntArrayArray29;
		arg1.anIntArrayArray30 = this.anIntArrayArray30;
		arg1.aBoolean28 = this.aBoolean28;
		arg1.anInt911 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	public void method645(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static31.anIntArray133[arg0];
		@Pc(7) int local7 = Static31.anIntArray141[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt910; local9++) {
			@Pc(26) int local26 = this.anIntArray126[local9] * local7 - this.anIntArray123[local9] * local3 >> 16;
			this.anIntArray123[local9] = this.anIntArray126[local9] * local3 + this.anIntArray123[local9] * local7 >> 16;
			this.anIntArray126[local9] = local26;
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!h;I)V")
	public void method646(@OriginalArg(0) Class1_Sub3_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray29 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class59 local12 = arg0.aClass59Array1[arg1];
		@Pc(15) Class1_Sub15 local15 = local12.aClass1_Sub15_1;
		Static31.anInt917 = 0;
		Static31.anInt920 = 0;
		Static31.anInt921 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2339; local23++) {
			@Pc(29) int local29 = local12.anIntArray354[local23];
			this.method651(local15.anIntArray298[local29], local15.anIntArrayArray57[local29], local12.anIntArray358[local23], local12.anIntArray359[local23], local12.anIntArray357[local23]);
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)V")
	public void method647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static31.anIntArray131[0] = -1;
		if (this.anInt911 != 2 && this.anInt911 != 1) {
			this.method636();
		}
		@Pc(15) int local15 = Static114.anInt2812;
		@Pc(17) int local17 = Static114.anInt2813;
		@Pc(21) int local21 = Static31.anIntArray133[0];
		@Pc(25) int local25 = Static31.anIntArray141[0];
		@Pc(29) int local29 = Static31.anIntArray133[arg0];
		@Pc(33) int local33 = Static31.anIntArray141[arg0];
		@Pc(37) int local37 = Static31.anIntArray133[arg1];
		@Pc(41) int local41 = Static31.anIntArray141[arg1];
		@Pc(45) int local45 = Static31.anIntArray133[arg2];
		@Pc(49) int local49 = Static31.anIntArray141[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt910; local61++) {
			@Pc(67) int local67 = this.anIntArray122[local61];
			@Pc(72) int local72 = this.anIntArray126[local61];
			@Pc(77) int local77 = this.anIntArray123[local61];
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
			Static31.anIntArray136[local61] = local77 - local59;
			Static31.anIntArray135[local61] = local15 + (local67 << 9) / local77;
			Static31.anIntArray147[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt915 > 0) {
				Static31.anIntArray149[local61] = local67;
				Static31.anIntArray143[local61] = local89;
				Static31.anIntArray145[local61] = local77;
			}
		}
		try {
			this.method654(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
	private void method649(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static114.anInt2812;
		@Pc(3) int local3 = Static114.anInt2813;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray127[arg0];
		@Pc(15) int local15 = this.anIntArray119[arg0];
		@Pc(20) int local20 = this.anIntArray129[arg0];
		@Pc(24) int local24 = Static31.anIntArray145[local10];
		@Pc(28) int local28 = Static31.anIntArray145[local15];
		@Pc(32) int local32 = Static31.anIntArray145[local20];
		if (this.aByteArray18 == null) {
			Static114.anInt2814 = 0;
		} else {
			Static114.anInt2814 = this.aByteArray18[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static31.anIntArray138[0] = Static31.anIntArray135[local10];
			Static31.anIntArray132[0] = Static31.anIntArray147[local10];
			local5++;
			Static31.anIntArray142[0] = this.anIntArray124[arg0];
		} else {
			local73 = Static31.anIntArray149[local10];
			local77 = Static31.anIntArray143[local10];
			local82 = this.anIntArray124[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static31.anIntArray139[local32 - local24];
				Static31.anIntArray138[0] = local1 + (local73 + ((Static31.anIntArray149[local20] - local73) * local95 >> 16) << 9) / 50;
				Static31.anIntArray132[0] = local3 + (local77 + ((Static31.anIntArray143[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static31.anIntArray142[0] = local82 + ((this.anIntArray128[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static31.anIntArray139[local28 - local24];
				Static31.anIntArray138[local5] = local1 + (local73 + ((Static31.anIntArray149[local15] - local73) * local95 >> 16) << 9) / 50;
				Static31.anIntArray132[local5] = local3 + (local77 + ((Static31.anIntArray143[local15] - local77) * local95 >> 16) << 9) / 50;
				Static31.anIntArray142[local5++] = local82 + ((this.anIntArray130[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static31.anIntArray138[local5] = Static31.anIntArray135[local15];
			Static31.anIntArray132[local5] = Static31.anIntArray147[local15];
			Static31.anIntArray142[local5++] = this.anIntArray130[arg0];
		} else {
			local73 = Static31.anIntArray149[local15];
			local77 = Static31.anIntArray143[local15];
			local82 = this.anIntArray130[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static31.anIntArray139[local24 - local28];
				Static31.anIntArray138[local5] = local1 + (local73 + ((Static31.anIntArray149[local10] - local73) * local95 >> 16) << 9) / 50;
				Static31.anIntArray132[local5] = local3 + (local77 + ((Static31.anIntArray143[local10] - local77) * local95 >> 16) << 9) / 50;
				Static31.anIntArray142[local5++] = local82 + ((this.anIntArray124[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static31.anIntArray139[local32 - local28];
				Static31.anIntArray138[local5] = local1 + (local73 + ((Static31.anIntArray149[local20] - local73) * local95 >> 16) << 9) / 50;
				Static31.anIntArray132[local5] = local3 + (local77 + ((Static31.anIntArray143[local20] - local77) * local95 >> 16) << 9) / 50;
				Static31.anIntArray142[local5++] = local82 + ((this.anIntArray128[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static31.anIntArray138[local5] = Static31.anIntArray135[local20];
			Static31.anIntArray132[local5] = Static31.anIntArray147[local20];
			Static31.anIntArray142[local5++] = this.anIntArray128[arg0];
		} else {
			local73 = Static31.anIntArray149[local20];
			local77 = Static31.anIntArray143[local20];
			local82 = this.anIntArray128[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static31.anIntArray139[local28 - local32];
				Static31.anIntArray138[local5] = local1 + (local73 + ((Static31.anIntArray149[local15] - local73) * local95 >> 16) << 9) / 50;
				Static31.anIntArray132[local5] = local3 + (local77 + ((Static31.anIntArray143[local15] - local77) * local95 >> 16) << 9) / 50;
				Static31.anIntArray142[local5++] = local82 + ((this.anIntArray130[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static31.anIntArray139[local24 - local32];
				Static31.anIntArray138[local5] = local1 + (local73 + ((Static31.anIntArray149[local10] - local73) * local95 >> 16) << 9) / 50;
				Static31.anIntArray132[local5] = local3 + (local77 + ((Static31.anIntArray143[local10] - local77) * local95 >> 16) << 9) / 50;
				Static31.anIntArray142[local5++] = local82 + ((this.anIntArray124[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static31.anIntArray138[0];
		local77 = Static31.anIntArray138[1];
		local82 = Static31.anIntArray138[2];
		local95 = Static31.anIntArray132[0];
		@Pc(590) int local590 = Static31.anIntArray132[1];
		@Pc(594) int local594 = Static31.anIntArray132[2];
		Static114.aBoolean110 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static114.anInt2820 || local77 > Static114.anInt2820 || local82 > Static114.anInt2820) {
				Static114.aBoolean110 = true;
			}
			if (this.aByteArray16 != null && this.aByteArray16[arg0] != -1) {
				local669 = this.aByteArray16[arg0] & 0xFF;
				local674 = this.anIntArray120[local669];
				local679 = this.anIntArray121[local669];
				local684 = this.anIntArray125[local669];
				if (this.anIntArray128[arg0] == -1) {
					Static114.method1992(local95, local590, local594, local73, local77, local82, this.anIntArray124[arg0], this.anIntArray124[arg0], this.anIntArray124[arg0], Static31.anIntArray149[local674], Static31.anIntArray149[local679], Static31.anIntArray149[local684], Static31.anIntArray143[local674], Static31.anIntArray143[local679], Static31.anIntArray143[local684], Static31.anIntArray145[local674], Static31.anIntArray145[local679], Static31.anIntArray145[local684], this.aShortArray5[arg0]);
				} else {
					Static114.method1992(local95, local590, local594, local73, local77, local82, Static31.anIntArray142[0], Static31.anIntArray142[1], Static31.anIntArray142[2], Static31.anIntArray149[local674], Static31.anIntArray149[local679], Static31.anIntArray149[local684], Static31.anIntArray143[local674], Static31.anIntArray143[local679], Static31.anIntArray143[local684], Static31.anIntArray145[local674], Static31.anIntArray145[local679], Static31.anIntArray145[local684], this.aShortArray5[arg0]);
				}
			} else if (this.anIntArray128[arg0] == -1) {
				Static114.method1993(local95, local590, local594, local73, local77, local82, Static31.anIntArray134[this.anIntArray124[arg0]]);
			} else {
				Static114.method2002(local95, local590, local594, local73, local77, local82, Static31.anIntArray142[0], Static31.anIntArray142[1], Static31.anIntArray142[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static114.anInt2820 || local77 > Static114.anInt2820 || local82 > Static114.anInt2820 || Static31.anIntArray138[3] < 0 || Static31.anIntArray138[3] > Static114.anInt2820) {
			Static114.aBoolean110 = true;
		}
		if (this.aByteArray16 == null || this.aByteArray16[arg0] == -1) {
			if (this.anIntArray128[arg0] == -1) {
				local669 = Static31.anIntArray134[this.anIntArray124[arg0]];
				Static114.method1993(local95, local590, local594, local73, local77, local82, local669);
				Static114.method1993(local95, local594, Static31.anIntArray132[3], local73, local82, Static31.anIntArray138[3], local669);
				return;
			}
			Static114.method2002(local95, local590, local594, local73, local77, local82, Static31.anIntArray142[0], Static31.anIntArray142[1], Static31.anIntArray142[2]);
			Static114.method2002(local95, local594, Static31.anIntArray132[3], local73, local82, Static31.anIntArray138[3], Static31.anIntArray142[0], Static31.anIntArray142[2], Static31.anIntArray142[3]);
			return;
		}
		local669 = this.aByteArray16[arg0] & 0xFF;
		local674 = this.anIntArray120[local669];
		local679 = this.anIntArray121[local669];
		local684 = this.anIntArray125[local669];
		@Pc(924) short local924 = this.aShortArray5[arg0];
		if (this.anIntArray128[arg0] == -1) {
			Static114.method1992(local95, local590, local594, local73, local77, local82, this.anIntArray124[arg0], this.anIntArray124[arg0], this.anIntArray124[arg0], Static31.anIntArray149[local674], Static31.anIntArray149[local679], Static31.anIntArray149[local684], Static31.anIntArray143[local674], Static31.anIntArray143[local679], Static31.anIntArray143[local684], Static31.anIntArray145[local674], Static31.anIntArray145[local679], Static31.anIntArray145[local684], local924);
			Static114.method1992(local95, local594, Static31.anIntArray132[3], local73, local82, Static31.anIntArray138[3], this.anIntArray124[arg0], this.anIntArray124[arg0], this.anIntArray124[arg0], Static31.anIntArray149[local674], Static31.anIntArray149[local679], Static31.anIntArray149[local684], Static31.anIntArray143[local674], Static31.anIntArray143[local679], Static31.anIntArray143[local684], Static31.anIntArray145[local674], Static31.anIntArray145[local679], Static31.anIntArray145[local684], local924);
			return;
		}
		Static114.method1992(local95, local590, local594, local73, local77, local82, Static31.anIntArray142[0], Static31.anIntArray142[1], Static31.anIntArray142[2], Static31.anIntArray149[local674], Static31.anIntArray149[local679], Static31.anIntArray149[local684], Static31.anIntArray143[local674], Static31.anIntArray143[local679], Static31.anIntArray143[local684], Static31.anIntArray145[local674], Static31.anIntArray145[local679], Static31.anIntArray145[local684], local924);
		Static114.method1992(local95, local594, Static31.anIntArray132[3], local73, local82, Static31.anIntArray138[3], Static31.anIntArray142[0], Static31.anIntArray142[2], Static31.anIntArray142[3], Static31.anIntArray149[local674], Static31.anIntArray149[local679], Static31.anIntArray149[local684], Static31.anIntArray143[local674], Static31.anIntArray143[local679], Static31.anIntArray143[local684], Static31.anIntArray145[local674], Static31.anIntArray145[local679], Static31.anIntArray145[local684], local924);
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "()V")
	public void method650() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt910; local1++) {
			@Pc(7) int local7 = this.anIntArray123[local1];
			this.anIntArray123[local1] = this.anIntArray122[local1];
			this.anIntArray122[local1] = -local7;
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[IIII)V")
	private void method651(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static31.anInt917 = 0;
			Static31.anInt920 = 0;
			Static31.anInt921 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray29.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray29[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static31.anInt917 += this.anIntArray122[local36];
						Static31.anInt920 += this.anIntArray126[local36];
						Static31.anInt921 += this.anIntArray123[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static31.anInt917 = Static31.anInt917 / local6 + arg2;
				Static31.anInt920 = Static31.anInt920 / local6 + arg3;
				Static31.anInt921 = Static31.anInt921 / local6 + arg4;
			} else {
				Static31.anInt917 = arg2;
				Static31.anInt920 = arg3;
				Static31.anInt921 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray29.length) {
					local115 = this.anIntArrayArray29[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray122[local31] += arg2;
						this.anIntArray126[local31] += arg3;
						this.anIntArray123[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray29.length) {
					local115 = this.anIntArrayArray29[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray122[local31] -= Static31.anInt917;
						this.anIntArray126[local31] -= Static31.anInt920;
						this.anIntArray123[local31] -= Static31.anInt921;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static31.anIntArray133[local225];
							local235 = Static31.anIntArray141[local225];
							local251 = this.anIntArray126[local31] * local231 + this.anIntArray122[local31] * local235 >> 16;
							this.anIntArray126[local31] = this.anIntArray126[local31] * local235 - this.anIntArray122[local31] * local231 >> 16;
							this.anIntArray122[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static31.anIntArray133[local36];
							local235 = Static31.anIntArray141[local36];
							local251 = this.anIntArray126[local31] * local235 - this.anIntArray123[local31] * local231 >> 16;
							this.anIntArray123[local31] = this.anIntArray126[local31] * local231 + this.anIntArray123[local31] * local235 >> 16;
							this.anIntArray126[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static31.anIntArray133[local219];
							local235 = Static31.anIntArray141[local219];
							local251 = this.anIntArray123[local31] * local231 + this.anIntArray122[local31] * local235 >> 16;
							this.anIntArray123[local31] = this.anIntArray123[local31] * local235 - this.anIntArray122[local31] * local231 >> 16;
							this.anIntArray122[local31] = local251;
						}
						this.anIntArray122[local31] += Static31.anInt917;
						this.anIntArray126[local31] += Static31.anInt920;
						this.anIntArray123[local31] += Static31.anInt921;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray29.length) {
					local115 = this.anIntArrayArray29[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray122[local31] -= Static31.anInt917;
						this.anIntArray126[local31] -= Static31.anInt920;
						this.anIntArray123[local31] -= Static31.anInt921;
						this.anIntArray122[local31] = this.anIntArray122[local31] * arg2 / 128;
						this.anIntArray126[local31] = this.anIntArray126[local31] * arg3 / 128;
						this.anIntArray123[local31] = this.anIntArray123[local31] * arg4 / 128;
						this.anIntArray122[local31] += Static31.anInt917;
						this.anIntArray126[local31] += Static31.anInt920;
						this.anIntArray123[local31] += Static31.anInt921;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray30 != null && this.aByteArray18 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray30.length) {
					local115 = this.anIntArrayArray30[local14];
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

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method652(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static31.aByteArray17.length < this.anInt909) {
			Static31.aByteArray17 = new byte[this.anInt909 + 100];
		}
		return this.method643(arg0, Static31.aClass1_Sub3_Sub4_Sub4_1, Static31.aByteArray17);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
	public void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt910; local1++) {
			this.anIntArray122[local1] += arg0;
			this.anIntArray126[local1] += arg1;
			this.anIntArray123[local1] += arg2;
		}
		this.anInt911 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZI)V")
	private void method654(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt914 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt914; local6++) {
			Static31.anIntArray131[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt909; local18++) {
			if (this.anIntArray128[local18] != -2) {
				local30 = this.anIntArray127[local18];
				local35 = this.anIntArray119[local18];
				local40 = this.anIntArray129[local18];
				local44 = Static31.anIntArray135[local30];
				local48 = Static31.anIntArray135[local35];
				local52 = Static31.anIntArray135[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static31.anIntArray149[local30];
					local71 = Static31.anIntArray149[local35];
					@Pc(75) int local75 = Static31.anIntArray149[local40];
					@Pc(79) int local79 = Static31.anIntArray143[local30];
					local83 = Static31.anIntArray143[local35];
					local87 = Static31.anIntArray143[local40];
					@Pc(91) int local91 = Static31.anIntArray145[local30];
					local95 = Static31.anIntArray145[local35];
					@Pc(99) int local99 = Static31.anIntArray145[local40];
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
						Static31.aBooleanArray12[local18] = true;
						@Pc(180) int local180 = (Static31.anIntArray136[local30] + Static31.anIntArray136[local35] + Static31.anIntArray136[local40]) / 3 + this.anInt908;
						Static31.anIntArrayArray31[local180][Static31.anIntArray131[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method648(Static31.anInt916, Static31.anInt919, Static31.anIntArray147[local30], Static31.anIntArray147[local35], Static31.anIntArray147[local40], local44, local48, local52)) {
						Static31.anIntArray137[Static31.anInt918++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static31.anIntArray147[local40] - Static31.anIntArray147[local35]) - (Static31.anIntArray147[local30] - Static31.anIntArray147[local35]) * (local52 - local48) > 0) {
						Static31.aBooleanArray12[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static114.anInt2820 && local48 <= Static114.anInt2820 && local52 <= Static114.anInt2820) {
							Static31.aBooleanArray11[local18] = false;
						} else {
							Static31.aBooleanArray11[local18] = true;
						}
						local67 = (Static31.anIntArray136[local30] + Static31.anIntArray136[local35] + Static31.anIntArray136[local40]) / 3 + this.anInt908;
						Static31.anIntArrayArray31[local67][Static31.anIntArray131[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray20 == null) {
			for (local30 = this.anInt914 - 1; local30 >= 0; local30--) {
				local35 = Static31.anIntArray131[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static31.anIntArrayArray31[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method637(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static31.anIntArray140[local30] = 0;
			Static31.anIntArray144[local30] = 0;
		}
		for (local35 = this.anInt914 - 1; local35 >= 0; local35--) {
			local40 = Static31.anIntArray131[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static31.anIntArrayArray31[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray20[local52];
					local71 = Static31.anIntArray140[local388]++;
					Static31.anIntArrayArray32[local388][local71] = local52;
					if (local388 < 10) {
						Static31.anIntArray144[local388] += local35;
					} else if (local388 == 10) {
						Static31.anIntArray146[local71] = local35;
					} else {
						Static31.anIntArray148[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static31.anIntArray140[1] > 0 || Static31.anIntArray140[2] > 0) {
			local40 = (Static31.anIntArray144[1] + Static31.anIntArray144[2]) / (Static31.anIntArray140[1] + Static31.anIntArray140[2]);
		}
		local44 = 0;
		if (Static31.anIntArray140[3] > 0 || Static31.anIntArray140[4] > 0) {
			local44 = (Static31.anIntArray144[3] + Static31.anIntArray144[4]) / (Static31.anIntArray140[3] + Static31.anIntArray140[4]);
		}
		local48 = 0;
		if (Static31.anIntArray140[6] > 0 || Static31.anIntArray140[8] > 0) {
			local48 = (Static31.anIntArray144[6] + Static31.anIntArray144[8]) / (Static31.anIntArray140[6] + Static31.anIntArray140[8]);
		}
		local67 = 0;
		local71 = Static31.anIntArray140[10];
		@Pc(521) int[] local521 = Static31.anIntArrayArray32[10];
		@Pc(523) int[] local523 = Static31.anIntArray146;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static31.anIntArray140[11];
			local521 = Static31.anIntArrayArray32[11];
			local523 = Static31.anIntArray148;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method637(local521[local67++]);
				if (local67 == local71 && local521 != Static31.anIntArrayArray32[11]) {
					local67 = 0;
					local71 = Static31.anIntArray140[11];
					local521 = Static31.anIntArrayArray32[11];
					local523 = Static31.anIntArray148;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method637(local521[local67++]);
				if (local67 == local71 && local521 != Static31.anIntArrayArray32[11]) {
					local67 = 0;
					local71 = Static31.anIntArray140[11];
					local521 = Static31.anIntArrayArray32[11];
					local523 = Static31.anIntArray148;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method637(local521[local67++]);
				if (local67 == local71 && local521 != Static31.anIntArrayArray32[11]) {
					local67 = 0;
					local71 = Static31.anIntArray140[11];
					local521 = Static31.anIntArrayArray32[11];
					local523 = Static31.anIntArray148;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static31.anIntArray140[local83];
			@Pc(686) int[] local686 = Static31.anIntArrayArray32[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method637(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method637(local521[local67++]);
			if (local67 == local71 && local521 != Static31.anIntArrayArray32[11]) {
				local67 = 0;
				local521 = Static31.anIntArrayArray32[11];
				local71 = Static31.anIntArray140[11];
				local523 = Static31.anIntArray148;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}
}
