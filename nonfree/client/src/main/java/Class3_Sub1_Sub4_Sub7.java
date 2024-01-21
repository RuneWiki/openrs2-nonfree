import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class3_Sub1_Sub4_Sub7 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
	private int anInt2539;

	@OriginalMember(owner = "client!ua", name = "qb", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "[I")
	public int[] anIntArray341;

	@OriginalMember(owner = "client!ua", name = "sb", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!ua", name = "tb", descriptor = "[I")
	public int[] anIntArray342;

	@OriginalMember(owner = "client!ua", name = "ub", descriptor = "I")
	private int anInt2540;

	@OriginalMember(owner = "client!ua", name = "vb", descriptor = "I")
	private int anInt2541;

	@OriginalMember(owner = "client!ua", name = "wb", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!ua", name = "xb", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!ua", name = "yb", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!ua", name = "zb", descriptor = "I")
	private int anInt2542;

	@OriginalMember(owner = "client!ua", name = "Ab", descriptor = "I")
	private int anInt2543;

	@OriginalMember(owner = "client!ua", name = "Bb", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!ua", name = "Cb", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!ua", name = "Db", descriptor = "[I")
	public int[] anIntArray345;

	@OriginalMember(owner = "client!ua", name = "Eb", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!ua", name = "Fb", descriptor = "[I")
	public int[] anIntArray347;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
	public int anInt2538 = 0;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
	public int anInt2537 = 0;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	public int anInt2536 = 0;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "B")
	public byte aByte5 = 0;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4_Sub7() {
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([Lclient!ua;I)V")
	public Class3_Sub1_Sub4_Sub7(@OriginalArg(0) Class3_Sub1_Sub4_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt2538 = 0;
		this.anInt2536 = 0;
		this.anInt2537 = 0;
		this.aByte5 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class3_Sub1_Sub4_Sub7 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt2538 += local41.anInt2538;
				this.anInt2536 += local41.anInt2536;
				this.anInt2537 += local41.anInt2537;
				if (local41.aByteArray60 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local41.aByte5;
					}
					if (this.aByte5 != local41.aByte5) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray61 != null;
				local22 |= local41.aByteArray62 != null;
			}
		}
		this.anIntArray336 = new int[this.anInt2538];
		this.anIntArray342 = new int[this.anInt2538];
		this.anIntArray346 = new int[this.anInt2538];
		this.anIntArray344 = new int[this.anInt2536];
		this.anIntArray338 = new int[this.anInt2536];
		this.anIntArray340 = new int[this.anInt2536];
		this.anIntArray343 = new int[this.anInt2536];
		this.anIntArray337 = new int[this.anInt2536];
		this.anIntArray347 = new int[this.anInt2536];
		if (this.anInt2537 > 0) {
			this.anIntArray341 = new int[this.anInt2537];
			this.anIntArray345 = new int[this.anInt2537];
			this.anIntArray339 = new int[this.anInt2537];
		}
		if (local18) {
			this.aByteArray60 = new byte[this.anInt2536];
		}
		if (local20) {
			this.aByteArray61 = new byte[this.anInt2536];
		}
		if (local22) {
			this.aByteArray62 = new byte[this.anInt2536];
			this.aShortArray12 = new short[this.anInt2536];
		}
		this.anInt2538 = 0;
		this.anInt2536 = 0;
		this.anInt2537 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class3_Sub1_Sub4_Sub7 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt2538;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt2538; local221++) {
					this.anIntArray336[this.anInt2538] = local214.anIntArray336[local221];
					this.anIntArray342[this.anInt2538] = local214.anIntArray342[local221];
					this.anIntArray346[this.anInt2538] = local214.anIntArray346[local221];
					this.anInt2538++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt2536; local262++) {
					this.anIntArray344[this.anInt2536] = local214.anIntArray344[local262] + local219;
					this.anIntArray338[this.anInt2536] = local214.anIntArray338[local262] + local219;
					this.anIntArray340[this.anInt2536] = local214.anIntArray340[local262] + local219;
					this.anIntArray343[this.anInt2536] = local214.anIntArray343[local262];
					this.anIntArray337[this.anInt2536] = local214.anIntArray337[local262];
					this.anIntArray347[this.anInt2536] = local214.anIntArray347[local262];
					if (local18) {
						if (local214.aByteArray60 == null) {
							this.aByteArray60[this.anInt2536] = local214.aByte5;
						} else {
							this.aByteArray60[this.anInt2536] = local214.aByteArray60[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray61 == null) {
							this.aByteArray61[this.anInt2536] = 0;
						} else {
							this.aByteArray61[this.anInt2536] = local214.aByteArray61[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray62 == null || local214.aByteArray62[local262] == -1) {
							this.aByteArray62[this.anInt2536] = -1;
						} else {
							this.aByteArray62[this.anInt2536] = (byte) (local214.aByteArray62[local262] + local207);
							this.aShortArray12[this.anInt2536] = local214.aShortArray12[local262];
						}
					}
					this.anInt2536++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt2537; local418++) {
					this.anIntArray341[this.anInt2537] = local214.anIntArray341[local418] + local219;
					this.anIntArray345[this.anInt2537] = local214.anIntArray345[local418] + local219;
					this.anIntArray339[this.anInt2537] = local214.anIntArray339[local418] + local219;
					this.anInt2537++;
				}
				local207 += local214.anInt2537;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method1756(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray26 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class20 local12 = arg0.aClass20Array1[arg1];
		@Pc(15) Class3_Sub5 local15 = local12.aClass3_Sub5_1;
		Static110.anInt2545 = 0;
		Static110.anInt2549 = 0;
		Static110.anInt2547 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt806; local23++) {
			@Pc(29) int local29 = local12.anIntArray88[local23];
			this.method1772(local15.anIntArray74[local29], local15.anIntArrayArray4[local29], local12.anIntArray93[local23], local12.anIntArray89[local23], local12.anIntArray92[local23]);
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	public void method1757() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2538; local1++) {
			@Pc(7) int local7 = this.anIntArray346[local1];
			this.anIntArray346[local1] = this.anIntArray336[local1];
			this.anIntArray336[local1] = -local7;
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
	private void method1758() {
		if (this.anInt2539 == 2) {
			return;
		}
		this.anInt2539 = 2;
		this.anInt2543 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2538; local12++) {
			@Pc(18) int local18 = this.anIntArray336[local12];
			@Pc(23) int local23 = this.anIntArray342[local12];
			@Pc(28) int local28 = this.anIntArray346[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2543) {
				this.anInt2543 = local40;
			}
		}
		this.anInt2543 = (int) (Math.sqrt((double) this.anInt2543) + 0.99D);
		this.anInt2540 = this.anInt2543;
		this.anInt2542 = this.anInt2543 + this.anInt2543;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static110.anIntArray358[0] = -1;
		if (this.anInt2539 != 1) {
			this.method1761();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2543 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2543 << 9;
		if (local64 / local40 >= Static24.anInt779) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2543 << 9;
		if (local77 / local40 <= Static24.anInt783) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2543 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static24.anInt782) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2525 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static24.anInt787) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2525 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2537 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static110.aBoolean107) {
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
			local219 = Static110.anInt2548 - Static24.anInt786;
			local223 = Static110.anInt2546 - Static24.anInt781;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean106) {
					Static110.anIntArray354[Static110.anInt2544++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static24.anInt786;
		local219 = Static24.anInt781;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static110.anIntArray348[arg0];
			local257 = Static110.anIntArray366[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2538; local269++) {
			@Pc(275) int local275 = this.anIntArray336[local269];
			@Pc(280) int local280 = this.anIntArray342[local269];
			@Pc(285) int local285 = this.anIntArray346[local269];
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
			Static110.anIntArray353[local269] = local285 - local29;
			if (local285 >= 50) {
				Static110.anIntArray351[local269] = local172 + (local275 << 9) / local285;
				Static110.anIntArray361[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static110.anIntArray351[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static110.anIntArray349[local269] = local275;
				Static110.anIntArray355[local269] = local297;
				Static110.anIntArray360[local269] = local285;
			}
		}
		try {
			this.method1773(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V")
	public void method1759(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static110.anIntArray348[arg0];
		@Pc(7) int local7 = Static110.anIntArray366[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2538; local9++) {
			@Pc(26) int local26 = this.anIntArray342[local9] * local7 - this.anIntArray346[local9] * local3 >> 16;
			this.anIntArray346[local9] = this.anIntArray342[local9] * local3 + this.anIntArray346[local9] * local7 >> 16;
			this.anIntArray342[local9] = local26;
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1760(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static110.aByteArray63.length < this.anInt2536) {
			Static110.aByteArray63 = new byte[this.anInt2536 + 100];
		}
		return this.method1762(arg0, Static110.aClass3_Sub1_Sub4_Sub7_2, Static110.aByteArray63);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
	public void method1761() {
		if (this.anInt2539 == 1) {
			return;
		}
		this.anInt2539 = 1;
		super.anInt2525 = 0;
		this.anInt2541 = 0;
		this.anInt2543 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2538; local18++) {
			@Pc(24) int local24 = this.anIntArray336[local18];
			@Pc(29) int local29 = this.anIntArray342[local18];
			@Pc(34) int local34 = this.anIntArray346[local18];
			if (-local29 > super.anInt2525) {
				super.anInt2525 = -local29;
			}
			if (local29 > this.anInt2541) {
				this.anInt2541 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2543) {
				this.anInt2543 = local58;
			}
		}
		this.anInt2543 = (int) (Math.sqrt((double) this.anInt2543) + 0.99D);
		this.anInt2540 = (int) (Math.sqrt((double) (this.anInt2543 * this.anInt2543 + super.anInt2525 * super.anInt2525)) + 0.99D);
		this.anInt2542 = this.anInt2540 + (int) (Math.sqrt((double) (this.anInt2543 * this.anInt2543 + this.anInt2541 * this.anInt2541)) + 0.99D);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!ua;[B)Lclient!ua;")
	private Class3_Sub1_Sub4_Sub7 method1762(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2538 = this.anInt2538;
		arg1.anInt2536 = this.anInt2536;
		arg1.anInt2537 = this.anInt2537;
		if (arg1.anIntArray336 == null || arg1.anIntArray336.length < this.anInt2538) {
			arg1.anIntArray336 = new int[this.anInt2538 + 100];
			arg1.anIntArray342 = new int[this.anInt2538 + 100];
			arg1.anIntArray346 = new int[this.anInt2538 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2538; local43++) {
			arg1.anIntArray336[local43] = this.anIntArray336[local43];
			arg1.anIntArray342[local43] = this.anIntArray342[local43];
			arg1.anIntArray346[local43] = this.anIntArray346[local43];
		}
		if (arg0) {
			arg1.aByteArray61 = this.aByteArray61;
		} else {
			arg1.aByteArray61 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray61 == null) {
				for (local88 = 0; local88 < this.anInt2536; local88++) {
					arg1.aByteArray61[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2536; local88++) {
					arg1.aByteArray61[local88] = this.aByteArray61[local88];
				}
			}
		}
		arg1.anIntArray344 = this.anIntArray344;
		arg1.anIntArray338 = this.anIntArray338;
		arg1.anIntArray340 = this.anIntArray340;
		arg1.anIntArray343 = this.anIntArray343;
		arg1.anIntArray337 = this.anIntArray337;
		arg1.anIntArray347 = this.anIntArray347;
		arg1.aByteArray60 = this.aByteArray60;
		arg1.aByteArray62 = this.aByteArray62;
		arg1.aShortArray12 = this.aShortArray12;
		arg1.aByte5 = this.aByte5;
		arg1.anIntArray341 = this.anIntArray341;
		arg1.anIntArray345 = this.anIntArray345;
		arg1.anIntArray339 = this.anIntArray339;
		arg1.anIntArrayArray26 = this.anIntArrayArray26;
		arg1.anIntArrayArray25 = this.anIntArrayArray25;
		arg1.aBoolean106 = this.aBoolean106;
		arg1.anInt2539 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()V")
	public void method1763() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2538; local1++) {
			this.anIntArray336[local1] = -this.anIntArray336[local1];
			this.anIntArray346[local1] = -this.anIntArray346[local1];
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)V")
	private void method1764(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static24.anInt786;
		@Pc(3) int local3 = Static24.anInt781;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray344[arg0];
		@Pc(15) int local15 = this.anIntArray338[arg0];
		@Pc(20) int local20 = this.anIntArray340[arg0];
		@Pc(24) int local24 = Static110.anIntArray360[local10];
		@Pc(28) int local28 = Static110.anIntArray360[local15];
		@Pc(32) int local32 = Static110.anIntArray360[local20];
		if (this.aByteArray61 == null) {
			Static24.anInt785 = 0;
		} else {
			Static24.anInt785 = this.aByteArray61[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static110.anIntArray364[0] = Static110.anIntArray351[local10];
			Static110.anIntArray362[0] = Static110.anIntArray361[local10];
			local5++;
			Static110.anIntArray356[0] = this.anIntArray343[arg0];
		} else {
			local73 = Static110.anIntArray349[local10];
			local77 = Static110.anIntArray355[local10];
			local82 = this.anIntArray343[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static110.anIntArray359[local32 - local24];
				Static110.anIntArray364[0] = local1 + (local73 + ((Static110.anIntArray349[local20] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray362[0] = local3 + (local77 + ((Static110.anIntArray355[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static110.anIntArray356[0] = local82 + ((this.anIntArray347[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static110.anIntArray359[local28 - local24];
				Static110.anIntArray364[local5] = local1 + (local73 + ((Static110.anIntArray349[local15] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray362[local5] = local3 + (local77 + ((Static110.anIntArray355[local15] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray356[local5++] = local82 + ((this.anIntArray337[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static110.anIntArray364[local5] = Static110.anIntArray351[local15];
			Static110.anIntArray362[local5] = Static110.anIntArray361[local15];
			Static110.anIntArray356[local5++] = this.anIntArray337[arg0];
		} else {
			local73 = Static110.anIntArray349[local15];
			local77 = Static110.anIntArray355[local15];
			local82 = this.anIntArray337[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static110.anIntArray359[local24 - local28];
				Static110.anIntArray364[local5] = local1 + (local73 + ((Static110.anIntArray349[local10] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray362[local5] = local3 + (local77 + ((Static110.anIntArray355[local10] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray356[local5++] = local82 + ((this.anIntArray343[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static110.anIntArray359[local32 - local28];
				Static110.anIntArray364[local5] = local1 + (local73 + ((Static110.anIntArray349[local20] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray362[local5] = local3 + (local77 + ((Static110.anIntArray355[local20] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray356[local5++] = local82 + ((this.anIntArray347[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static110.anIntArray364[local5] = Static110.anIntArray351[local20];
			Static110.anIntArray362[local5] = Static110.anIntArray361[local20];
			Static110.anIntArray356[local5++] = this.anIntArray347[arg0];
		} else {
			local73 = Static110.anIntArray349[local20];
			local77 = Static110.anIntArray355[local20];
			local82 = this.anIntArray347[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static110.anIntArray359[local28 - local32];
				Static110.anIntArray364[local5] = local1 + (local73 + ((Static110.anIntArray349[local15] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray362[local5] = local3 + (local77 + ((Static110.anIntArray355[local15] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray356[local5++] = local82 + ((this.anIntArray337[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static110.anIntArray359[local24 - local32];
				Static110.anIntArray364[local5] = local1 + (local73 + ((Static110.anIntArray349[local10] - local73) * local95 >> 16) << 9) / 50;
				Static110.anIntArray362[local5] = local3 + (local77 + ((Static110.anIntArray355[local10] - local77) * local95 >> 16) << 9) / 50;
				Static110.anIntArray356[local5++] = local82 + ((this.anIntArray343[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static110.anIntArray364[0];
		local77 = Static110.anIntArray364[1];
		local82 = Static110.anIntArray364[2];
		local95 = Static110.anIntArray362[0];
		@Pc(590) int local590 = Static110.anIntArray362[1];
		@Pc(594) int local594 = Static110.anIntArray362[2];
		Static24.aBoolean33 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static24.anInt784 || local77 > Static24.anInt784 || local82 > Static24.anInt784) {
				Static24.aBoolean33 = true;
			}
			if (this.aByteArray62 != null && this.aByteArray62[arg0] != -1) {
				local669 = this.aByteArray62[arg0] & 0xFF;
				local674 = this.anIntArray341[local669];
				local679 = this.anIntArray345[local669];
				local684 = this.anIntArray339[local669];
				if (this.anIntArray347[arg0] == -1) {
					Static24.method460(local95, local590, local594, local73, local77, local82, this.anIntArray343[arg0], this.anIntArray343[arg0], this.anIntArray343[arg0], Static110.anIntArray349[local674], Static110.anIntArray349[local679], Static110.anIntArray349[local684], Static110.anIntArray355[local674], Static110.anIntArray355[local679], Static110.anIntArray355[local684], Static110.anIntArray360[local674], Static110.anIntArray360[local679], Static110.anIntArray360[local684], this.aShortArray12[arg0]);
				} else {
					Static24.method460(local95, local590, local594, local73, local77, local82, Static110.anIntArray356[0], Static110.anIntArray356[1], Static110.anIntArray356[2], Static110.anIntArray349[local674], Static110.anIntArray349[local679], Static110.anIntArray349[local684], Static110.anIntArray355[local674], Static110.anIntArray355[local679], Static110.anIntArray355[local684], Static110.anIntArray360[local674], Static110.anIntArray360[local679], Static110.anIntArray360[local684], this.aShortArray12[arg0]);
				}
			} else if (this.anIntArray347[arg0] == -1) {
				Static24.method470(local95, local590, local594, local73, local77, local82, Static110.anIntArray352[this.anIntArray343[arg0]]);
			} else {
				Static24.method471(local95, local590, local594, local73, local77, local82, Static110.anIntArray356[0], Static110.anIntArray356[1], Static110.anIntArray356[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static24.anInt784 || local77 > Static24.anInt784 || local82 > Static24.anInt784 || Static110.anIntArray364[3] < 0 || Static110.anIntArray364[3] > Static24.anInt784) {
			Static24.aBoolean33 = true;
		}
		if (this.aByteArray62 == null || this.aByteArray62[arg0] == -1) {
			if (this.anIntArray347[arg0] == -1) {
				local669 = Static110.anIntArray352[this.anIntArray343[arg0]];
				Static24.method470(local95, local590, local594, local73, local77, local82, local669);
				Static24.method470(local95, local594, Static110.anIntArray362[3], local73, local82, Static110.anIntArray364[3], local669);
				return;
			}
			Static24.method471(local95, local590, local594, local73, local77, local82, Static110.anIntArray356[0], Static110.anIntArray356[1], Static110.anIntArray356[2]);
			Static24.method471(local95, local594, Static110.anIntArray362[3], local73, local82, Static110.anIntArray364[3], Static110.anIntArray356[0], Static110.anIntArray356[2], Static110.anIntArray356[3]);
			return;
		}
		local669 = this.aByteArray62[arg0] & 0xFF;
		local674 = this.anIntArray341[local669];
		local679 = this.anIntArray345[local669];
		local684 = this.anIntArray339[local669];
		@Pc(924) short local924 = this.aShortArray12[arg0];
		if (this.anIntArray347[arg0] == -1) {
			Static24.method460(local95, local590, local594, local73, local77, local82, this.anIntArray343[arg0], this.anIntArray343[arg0], this.anIntArray343[arg0], Static110.anIntArray349[local674], Static110.anIntArray349[local679], Static110.anIntArray349[local684], Static110.anIntArray355[local674], Static110.anIntArray355[local679], Static110.anIntArray355[local684], Static110.anIntArray360[local674], Static110.anIntArray360[local679], Static110.anIntArray360[local684], local924);
			Static24.method460(local95, local594, Static110.anIntArray362[3], local73, local82, Static110.anIntArray364[3], this.anIntArray343[arg0], this.anIntArray343[arg0], this.anIntArray343[arg0], Static110.anIntArray349[local674], Static110.anIntArray349[local679], Static110.anIntArray349[local684], Static110.anIntArray355[local674], Static110.anIntArray355[local679], Static110.anIntArray355[local684], Static110.anIntArray360[local674], Static110.anIntArray360[local679], Static110.anIntArray360[local684], local924);
			return;
		}
		Static24.method460(local95, local590, local594, local73, local77, local82, Static110.anIntArray356[0], Static110.anIntArray356[1], Static110.anIntArray356[2], Static110.anIntArray349[local674], Static110.anIntArray349[local679], Static110.anIntArray349[local684], Static110.anIntArray355[local674], Static110.anIntArray355[local679], Static110.anIntArray355[local684], Static110.anIntArray360[local674], Static110.anIntArray360[local679], Static110.anIntArray360[local684], local924);
		Static24.method460(local95, local594, Static110.anIntArray362[3], local73, local82, Static110.anIntArray364[3], Static110.anIntArray356[0], Static110.anIntArray356[2], Static110.anIntArray356[3], Static110.anIntArray349[local674], Static110.anIntArray349[local679], Static110.anIntArray349[local684], Static110.anIntArray355[local674], Static110.anIntArray355[local679], Static110.anIntArray355[local684], Static110.anIntArray360[local674], Static110.anIntArray360[local679], Static110.anIntArray360[local684], local924);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
	public void method1766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static110.anIntArray358[0] = -1;
		if (this.anInt2539 != 2 && this.anInt2539 != 1) {
			this.method1758();
		}
		@Pc(15) int local15 = Static24.anInt786;
		@Pc(17) int local17 = Static24.anInt781;
		@Pc(21) int local21 = Static110.anIntArray348[0];
		@Pc(25) int local25 = Static110.anIntArray366[0];
		@Pc(29) int local29 = Static110.anIntArray348[arg0];
		@Pc(33) int local33 = Static110.anIntArray366[arg0];
		@Pc(37) int local37 = Static110.anIntArray348[arg1];
		@Pc(41) int local41 = Static110.anIntArray366[arg1];
		@Pc(45) int local45 = Static110.anIntArray348[arg2];
		@Pc(49) int local49 = Static110.anIntArray366[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2538; local61++) {
			@Pc(67) int local67 = this.anIntArray336[local61];
			@Pc(72) int local72 = this.anIntArray342[local61];
			@Pc(77) int local77 = this.anIntArray346[local61];
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
			Static110.anIntArray353[local61] = local77 - local59;
			Static110.anIntArray351[local61] = local15 + (local67 << 9) / local77;
			Static110.anIntArray361[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2537 > 0) {
				Static110.anIntArray349[local61] = local67;
				Static110.anIntArray355[local61] = local89;
				Static110.anIntArray360[local61] = local77;
			}
		}
		try {
			this.method1773(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "(I)V")
	private void method1767(@OriginalArg(0) int arg0) {
		if (Static110.aBooleanArray14[arg0]) {
			this.method1764(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray344[arg0];
		@Pc(17) int local17 = this.anIntArray338[arg0];
		@Pc(22) int local22 = this.anIntArray340[arg0];
		Static24.aBoolean33 = Static110.aBooleanArray15[arg0];
		if (this.aByteArray61 == null) {
			Static24.anInt785 = 0;
		} else {
			Static24.anInt785 = this.aByteArray61[arg0] & 0xFF;
		}
		if (this.aByteArray62 != null && this.aByteArray62[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray62[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray341[local119];
			@Pc(129) int local129 = this.anIntArray345[local119];
			@Pc(134) int local134 = this.anIntArray339[local119];
			if (this.anIntArray347[arg0] == -1) {
				Static24.method460(Static110.anIntArray361[local12], Static110.anIntArray361[local17], Static110.anIntArray361[local22], Static110.anIntArray351[local12], Static110.anIntArray351[local17], Static110.anIntArray351[local22], this.anIntArray343[arg0], this.anIntArray343[arg0], this.anIntArray343[arg0], Static110.anIntArray349[local124], Static110.anIntArray349[local129], Static110.anIntArray349[local134], Static110.anIntArray355[local124], Static110.anIntArray355[local129], Static110.anIntArray355[local134], Static110.anIntArray360[local124], Static110.anIntArray360[local129], Static110.anIntArray360[local134], this.aShortArray12[arg0]);
			} else {
				Static24.method460(Static110.anIntArray361[local12], Static110.anIntArray361[local17], Static110.anIntArray361[local22], Static110.anIntArray351[local12], Static110.anIntArray351[local17], Static110.anIntArray351[local22], this.anIntArray343[arg0], this.anIntArray337[arg0], this.anIntArray347[arg0], Static110.anIntArray349[local124], Static110.anIntArray349[local129], Static110.anIntArray349[local134], Static110.anIntArray355[local124], Static110.anIntArray355[local129], Static110.anIntArray355[local134], Static110.anIntArray360[local124], Static110.anIntArray360[local129], Static110.anIntArray360[local134], this.aShortArray12[arg0]);
			}
		} else if (this.anIntArray347[arg0] == -1) {
			Static24.method470(Static110.anIntArray361[local12], Static110.anIntArray361[local17], Static110.anIntArray361[local22], Static110.anIntArray351[local12], Static110.anIntArray351[local17], Static110.anIntArray351[local22], Static110.anIntArray352[this.anIntArray343[arg0]]);
		} else {
			Static24.method471(Static110.anIntArray361[local12], Static110.anIntArray361[local17], Static110.anIntArray361[local22], Static110.anIntArray351[local12], Static110.anIntArray351[local17], Static110.anIntArray351[local22], this.anIntArray343[arg0], this.anIntArray337[arg0], this.anIntArray347[arg0]);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "()V")
	public void method1769() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2538; local1++) {
			@Pc(7) int local7 = this.anIntArray336[local1];
			this.anIntArray336[local1] = this.anIntArray346[local1];
			this.anIntArray346[local1] = -local7;
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ie;ILclient!ie;I[I)V")
	public void method1770(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1756(arg0, arg1);
			return;
		}
		@Pc(18) Class20 local18 = arg0.aClass20Array1[arg1];
		@Pc(23) Class20 local23 = arg2.aClass20Array1[arg3];
		@Pc(26) Class3_Sub5 local26 = local18.aClass3_Sub5_1;
		Static110.anInt2545 = 0;
		Static110.anInt2549 = 0;
		Static110.anInt2547 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt806; local41++) {
			local47 = local18.anIntArray88[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray74[local47] == 0) {
				this.method1772(local26.anIntArray74[local47], local26.anIntArrayArray4[local47], local18.anIntArray93[local41], local18.anIntArray89[local41], local18.anIntArray92[local41]);
			}
		}
		Static110.anInt2545 = 0;
		Static110.anInt2549 = 0;
		Static110.anInt2547 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt806; local47++) {
			@Pc(112) int local112 = local23.anIntArray88[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray74[local112] == 0) {
				this.method1772(local26.anIntArray74[local112], local26.anIntArrayArray4[local112], local23.anIntArray93[local47], local23.anIntArray89[local47], local23.anIntArray92[local47]);
			}
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public void method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2538; local1++) {
			this.anIntArray336[local1] += arg0;
			this.anIntArray342[local1] += arg1;
			this.anIntArray346[local1] += arg2;
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[IIII)V")
	private void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static110.anInt2545 = 0;
			Static110.anInt2549 = 0;
			Static110.anInt2547 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray26.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray26[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static110.anInt2545 += this.anIntArray336[local36];
						Static110.anInt2549 += this.anIntArray342[local36];
						Static110.anInt2547 += this.anIntArray346[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static110.anInt2545 = Static110.anInt2545 / local6 + arg2;
				Static110.anInt2549 = Static110.anInt2549 / local6 + arg3;
				Static110.anInt2547 = Static110.anInt2547 / local6 + arg4;
			} else {
				Static110.anInt2545 = arg2;
				Static110.anInt2549 = arg3;
				Static110.anInt2547 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray336[local31] += arg2;
						this.anIntArray342[local31] += arg3;
						this.anIntArray346[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray336[local31] -= Static110.anInt2545;
						this.anIntArray342[local31] -= Static110.anInt2549;
						this.anIntArray346[local31] -= Static110.anInt2547;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static110.anIntArray348[local225];
							local235 = Static110.anIntArray366[local225];
							local251 = this.anIntArray342[local31] * local231 + this.anIntArray336[local31] * local235 >> 16;
							this.anIntArray342[local31] = this.anIntArray342[local31] * local235 - this.anIntArray336[local31] * local231 >> 16;
							this.anIntArray336[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static110.anIntArray348[local36];
							local235 = Static110.anIntArray366[local36];
							local251 = this.anIntArray342[local31] * local235 - this.anIntArray346[local31] * local231 >> 16;
							this.anIntArray346[local31] = this.anIntArray342[local31] * local231 + this.anIntArray346[local31] * local235 >> 16;
							this.anIntArray342[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static110.anIntArray348[local219];
							local235 = Static110.anIntArray366[local219];
							local251 = this.anIntArray346[local31] * local231 + this.anIntArray336[local31] * local235 >> 16;
							this.anIntArray346[local31] = this.anIntArray346[local31] * local235 - this.anIntArray336[local31] * local231 >> 16;
							this.anIntArray336[local31] = local251;
						}
						this.anIntArray336[local31] += Static110.anInt2545;
						this.anIntArray342[local31] += Static110.anInt2549;
						this.anIntArray346[local31] += Static110.anInt2547;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray336[local31] -= Static110.anInt2545;
						this.anIntArray342[local31] -= Static110.anInt2549;
						this.anIntArray346[local31] -= Static110.anInt2547;
						this.anIntArray336[local31] = this.anIntArray336[local31] * arg2 / 128;
						this.anIntArray342[local31] = this.anIntArray342[local31] * arg3 / 128;
						this.anIntArray346[local31] = this.anIntArray346[local31] * arg4 / 128;
						this.anIntArray336[local31] += Static110.anInt2545;
						this.anIntArray342[local31] += Static110.anInt2549;
						this.anIntArray346[local31] += Static110.anInt2547;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray25 != null && this.aByteArray61 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray25.length) {
					local115 = this.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray61[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray61[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZZI)V")
	private void method1773(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2542 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2542; local6++) {
			Static110.anIntArray358[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2536; local18++) {
			if (this.anIntArray347[local18] != -2) {
				local30 = this.anIntArray344[local18];
				local35 = this.anIntArray338[local18];
				local40 = this.anIntArray340[local18];
				local44 = Static110.anIntArray351[local30];
				local48 = Static110.anIntArray351[local35];
				local52 = Static110.anIntArray351[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static110.anIntArray349[local30];
					local71 = Static110.anIntArray349[local35];
					@Pc(75) int local75 = Static110.anIntArray349[local40];
					@Pc(79) int local79 = Static110.anIntArray355[local30];
					local83 = Static110.anIntArray355[local35];
					local87 = Static110.anIntArray355[local40];
					@Pc(91) int local91 = Static110.anIntArray360[local30];
					local95 = Static110.anIntArray360[local35];
					@Pc(99) int local99 = Static110.anIntArray360[local40];
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
						Static110.aBooleanArray14[local18] = true;
						@Pc(180) int local180 = (Static110.anIntArray353[local30] + Static110.anIntArray353[local35] + Static110.anIntArray353[local40]) / 3 + this.anInt2540;
						Static110.anIntArrayArray28[local180][Static110.anIntArray358[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1768(Static110.anInt2548, Static110.anInt2546, Static110.anIntArray361[local30], Static110.anIntArray361[local35], Static110.anIntArray361[local40], local44, local48, local52)) {
						Static110.anIntArray354[Static110.anInt2544++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static110.anIntArray361[local40] - Static110.anIntArray361[local35]) - (Static110.anIntArray361[local30] - Static110.anIntArray361[local35]) * (local52 - local48) > 0) {
						Static110.aBooleanArray14[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static24.anInt784 && local48 <= Static24.anInt784 && local52 <= Static24.anInt784) {
							Static110.aBooleanArray15[local18] = false;
						} else {
							Static110.aBooleanArray15[local18] = true;
						}
						local67 = (Static110.anIntArray353[local30] + Static110.anIntArray353[local35] + Static110.anIntArray353[local40]) / 3 + this.anInt2540;
						Static110.anIntArrayArray28[local67][Static110.anIntArray358[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray60 == null) {
			for (local30 = this.anInt2542 - 1; local30 >= 0; local30--) {
				local35 = Static110.anIntArray358[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static110.anIntArrayArray28[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1767(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static110.anIntArray365[local30] = 0;
			Static110.anIntArray350[local30] = 0;
		}
		for (local35 = this.anInt2542 - 1; local35 >= 0; local35--) {
			local40 = Static110.anIntArray358[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static110.anIntArrayArray28[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray60[local52];
					local71 = Static110.anIntArray365[local388]++;
					Static110.anIntArrayArray27[local388][local71] = local52;
					if (local388 < 10) {
						Static110.anIntArray350[local388] += local35;
					} else if (local388 == 10) {
						Static110.anIntArray357[local71] = local35;
					} else {
						Static110.anIntArray363[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static110.anIntArray365[1] > 0 || Static110.anIntArray365[2] > 0) {
			local40 = (Static110.anIntArray350[1] + Static110.anIntArray350[2]) / (Static110.anIntArray365[1] + Static110.anIntArray365[2]);
		}
		local44 = 0;
		if (Static110.anIntArray365[3] > 0 || Static110.anIntArray365[4] > 0) {
			local44 = (Static110.anIntArray350[3] + Static110.anIntArray350[4]) / (Static110.anIntArray365[3] + Static110.anIntArray365[4]);
		}
		local48 = 0;
		if (Static110.anIntArray365[6] > 0 || Static110.anIntArray365[8] > 0) {
			local48 = (Static110.anIntArray350[6] + Static110.anIntArray350[8]) / (Static110.anIntArray365[6] + Static110.anIntArray365[8]);
		}
		local67 = 0;
		local71 = Static110.anIntArray365[10];
		@Pc(521) int[] local521 = Static110.anIntArrayArray27[10];
		@Pc(523) int[] local523 = Static110.anIntArray357;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static110.anIntArray365[11];
			local521 = Static110.anIntArrayArray27[11];
			local523 = Static110.anIntArray363;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1767(local521[local67++]);
				if (local67 == local71 && local521 != Static110.anIntArrayArray27[11]) {
					local67 = 0;
					local71 = Static110.anIntArray365[11];
					local521 = Static110.anIntArrayArray27[11];
					local523 = Static110.anIntArray363;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1767(local521[local67++]);
				if (local67 == local71 && local521 != Static110.anIntArrayArray27[11]) {
					local67 = 0;
					local71 = Static110.anIntArray365[11];
					local521 = Static110.anIntArrayArray27[11];
					local523 = Static110.anIntArray363;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1767(local521[local67++]);
				if (local67 == local71 && local521 != Static110.anIntArrayArray27[11]) {
					local67 = 0;
					local71 = Static110.anIntArray365[11];
					local521 = Static110.anIntArrayArray27[11];
					local523 = Static110.anIntArray363;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static110.anIntArray365[local83];
			@Pc(686) int[] local686 = Static110.anIntArrayArray27[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1767(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1767(local521[local67++]);
			if (local67 == local71 && local521 != Static110.anIntArrayArray27[11]) {
				local67 = 0;
				local521 = Static110.anIntArrayArray27[11];
				local71 = Static110.anIntArray365[11];
				local523 = Static110.anIntArray363;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIIIIIII)V")
	public void method1774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static110.anIntArray358[0] = -1;
		if (this.anInt2539 != 2 && this.anInt2539 != 1) {
			this.method1758();
		}
		@Pc(15) int local15 = Static24.anInt786;
		@Pc(17) int local17 = Static24.anInt781;
		@Pc(21) int local21 = Static110.anIntArray348[0];
		@Pc(25) int local25 = Static110.anIntArray366[0];
		@Pc(29) int local29 = Static110.anIntArray348[arg0];
		@Pc(33) int local33 = Static110.anIntArray366[arg0];
		@Pc(37) int local37 = Static110.anIntArray348[arg1];
		@Pc(41) int local41 = Static110.anIntArray366[arg1];
		@Pc(45) int local45 = Static110.anIntArray348[arg2];
		@Pc(49) int local49 = Static110.anIntArray366[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2538; local61++) {
			@Pc(67) int local67 = this.anIntArray336[local61];
			@Pc(72) int local72 = this.anIntArray342[local61];
			@Pc(77) int local77 = this.anIntArray346[local61];
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
			Static110.anIntArray353[local61] = local77 - local59;
			Static110.anIntArray351[local61] = local15 + (local67 << 9) / arg6;
			Static110.anIntArray361[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2537 > 0) {
				Static110.anIntArray349[local61] = local67;
				Static110.anIntArray355[local61] = local89;
				Static110.anIntArray360[local61] = local77;
			}
		}
		try {
			this.method1773(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZ)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub4_Sub7 local16;
		if (arg4) {
			local16 = new Class3_Sub1_Sub4_Sub7();
			local16.anInt2538 = this.anInt2538;
			local16.anInt2536 = this.anInt2536;
			local16.anInt2537 = this.anInt2537;
			local16.anIntArray336 = this.anIntArray336;
			local16.anIntArray346 = this.anIntArray346;
			local16.anIntArray344 = this.anIntArray344;
			local16.anIntArray338 = this.anIntArray338;
			local16.anIntArray340 = this.anIntArray340;
			local16.anIntArray343 = this.anIntArray343;
			local16.anIntArray337 = this.anIntArray337;
			local16.anIntArray347 = this.anIntArray347;
			local16.aByteArray60 = this.aByteArray60;
			local16.aByteArray61 = this.aByteArray61;
			local16.aByteArray62 = this.aByteArray62;
			local16.aShortArray12 = this.aShortArray12;
			local16.aByte5 = this.aByte5;
			local16.anIntArray341 = this.anIntArray341;
			local16.anIntArray345 = this.anIntArray345;
			local16.anIntArray339 = this.anIntArray339;
			local16.anIntArrayArray26 = this.anIntArrayArray26;
			local16.anIntArrayArray25 = this.anIntArrayArray25;
			local16.aBoolean106 = this.aBoolean106;
			local16.anIntArray342 = new int[local16.anInt2538];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt2538; local124++) {
			@Pc(130) int local130 = this.anIntArray336[local124];
			@Pc(135) int local135 = this.anIntArray342[local124];
			@Pc(140) int local140 = this.anIntArray346[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray342[local124] = local135 + local176 - local122;
		}
		local16.anInt2539 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1776(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static110.aByteArray64.length < this.anInt2536) {
			Static110.aByteArray64 = new byte[this.anInt2536 + 100];
		}
		return this.method1762(arg0, Static110.aClass3_Sub1_Sub4_Sub7_3, Static110.aByteArray64);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V")
	public void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2538; local1++) {
			this.anIntArray336[local1] = this.anIntArray336[local1] * arg0 / 128;
			this.anIntArray342[local1] = this.anIntArray342[local1] * arg1 / 128;
			this.anIntArray346[local1] = this.anIntArray346[local1] * arg2 / 128;
		}
		this.anInt2539 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "()I")
	public int method1778() {
		this.method1761();
		return this.anInt2543;
	}
}
