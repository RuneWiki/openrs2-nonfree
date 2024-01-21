import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub1_Sub1_Sub7 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ue", name = "wb", descriptor = "[I")
	public static int[] anIntArray366 = new int[128];

	@OriginalMember(owner = "client!ue", name = "ob", descriptor = "I")
	public int anInt3337;

	@OriginalMember(owner = "client!ue", name = "pb", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!ue", name = "qb", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!ue", name = "rb", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!ue", name = "sb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!ue", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray81;

	@OriginalMember(owner = "client!ue", name = "ub", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!ue", name = "vb", descriptor = "[Lclient!ef;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!ue", name = "xb", descriptor = "I")
	public int anInt3338;

	@OriginalMember(owner = "client!ue", name = "zb", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!ue", name = "Ab", descriptor = "[I")
	public int[] anIntArray368;

	@OriginalMember(owner = "client!ue", name = "Bb", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!ue", name = "Cb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ue", name = "Eb", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!ue", name = "Fb", descriptor = "[Lclient!m;")
	public Class44[] aClass44Array1;

	@OriginalMember(owner = "client!ue", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!ue", name = "Hb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ue", name = "Ib", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!ue", name = "Jb", descriptor = "I")
	public int anInt3340;

	@OriginalMember(owner = "client!ue", name = "Kb", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!ue", name = "Mb", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!ue", name = "Pb", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!ue", name = "Qb", descriptor = "[Lclient!m;")
	public Class44[] aClass44Array2;

	@OriginalMember(owner = "client!ue", name = "Rb", descriptor = "I")
	public int anInt3343;

	@OriginalMember(owner = "client!ue", name = "Sb", descriptor = "I")
	public int anInt3344;

	@OriginalMember(owner = "client!ue", name = "Tb", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!ue", name = "Ub", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!ue", name = "Xb", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!ue", name = "Ob", descriptor = "I")
	private int anInt3342 = 0;

	@OriginalMember(owner = "client!ue", name = "Db", descriptor = "I")
	public int anInt3339 = 0;

	@OriginalMember(owner = "client!ue", name = "yb", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!ue", name = "Vb", descriptor = "I")
	public int anInt3345 = 0;

	@OriginalMember(owner = "client!ue", name = "Wb", descriptor = "B")
	private byte aByte14 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray366[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray366[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray366[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray366[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray366[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	private Class3_Sub1_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class3_Sub12 local25 = new Class3_Sub12(arg0);
		@Pc(30) Class3_Sub12 local30 = new Class3_Sub12(arg0);
		@Pc(35) Class3_Sub12 local35 = new Class3_Sub12(arg0);
		@Pc(40) Class3_Sub12 local40 = new Class3_Sub12(arg0);
		@Pc(45) Class3_Sub12 local45 = new Class3_Sub12(arg0);
		local25.anInt2886 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1963();
		@Pc(59) int local59 = local25.method1963();
		@Pc(63) int local63 = local25.method1936();
		@Pc(67) int local67 = local25.method1936();
		@Pc(71) int local71 = local25.method1936();
		@Pc(75) int local75 = local25.method1936();
		@Pc(79) int local79 = local25.method1936();
		@Pc(83) int local83 = local25.method1936();
		@Pc(87) int local87 = local25.method1963();
		@Pc(91) int local91 = local25.method1963();
		@Pc(95) int local95 = local25.method1963();
		@Pc(99) int local99 = local25.method1963();
		@Pc(101) byte local101 = 0;
		@Pc(107) int local107 = local101 + local55;
		@Pc(109) int local109 = local107;
		local107 += local59;
		@Pc(115) int local115 = local107;
		if (local71 == 255) {
			local107 += local59;
		}
		@Pc(124) int local124 = local107;
		if (local79 == 1) {
			local107 += local59;
		}
		@Pc(133) int local133 = local107;
		if (local67 == 1) {
			local107 += local59;
		}
		@Pc(142) int local142 = local107;
		if (local83 == 1) {
			local107 += local55;
		}
		@Pc(151) int local151 = local107;
		if (local75 == 1) {
			local107 += local59;
		}
		@Pc(160) int local160 = local107;
		local107 += local99;
		@Pc(166) int local166 = local107;
		local107 += local59 * 2;
		@Pc(174) int local174 = local107;
		local107 += local63 * 6;
		@Pc(182) int local182 = local107;
		local107 += local87;
		@Pc(188) int local188 = local107;
		local107 += local91;
		this.anInt3345 = local55;
		this.anInt3339 = local59;
		this.anInt3342 = local63;
		this.anIntArray368 = new int[local55];
		this.anIntArray363 = new int[local55];
		this.anIntArray369 = new int[local55];
		this.anIntArray367 = new int[local59];
		this.anIntArray365 = new int[local59];
		this.anIntArray364 = new int[local59];
		if (local63 > 0) {
			this.anIntArray374 = new int[local63];
			this.anIntArray372 = new int[local63];
			this.anIntArray373 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray370 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray89 = new byte[local59];
			this.aByteArray88 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray86 = new byte[local59];
		} else {
			this.aByte14 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray87 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray375 = new int[local59];
		}
		this.aShortArray12 = new short[local59];
		local25.anInt2886 = local101;
		local30.anInt2886 = local182;
		local35.anInt2886 = local188;
		local40.anInt2886 = local107;
		local45.anInt2886 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1936();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1944();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1944();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1944();
			}
			this.anIntArray368[local316] = local310 + local323;
			this.anIntArray363[local316] = local312 + local333;
			this.anIntArray369[local316] = local314 + local343;
			local310 = this.anIntArray368[local316];
			local312 = this.anIntArray363[local316];
			local314 = this.anIntArray369[local316];
			if (local83 == 1) {
				this.anIntArray370[local316] = local45.method1936();
			}
		}
		local25.anInt2886 = local166;
		local30.anInt2886 = local133;
		local35.anInt2886 = local115;
		local40.anInt2886 = local151;
		local45.anInt2886 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray12[local321] = (short) local25.method1963();
			if (local67 == 1) {
				local323 = local30.method1936();
				if ((local323 & 0x1) == 1) {
					this.aByteArray89[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray89[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray88[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray88[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray86[local321] = local35.method1958();
			}
			if (local75 == 1) {
				this.aByteArray87[local321] = local40.method1958();
			}
			if (local79 == 1) {
				this.anIntArray375[local321] = local45.method1936();
			}
		}
		local25.anInt2886 = local160;
		local30.anInt2886 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1936();
			if (local528 == 1) {
				local323 = local25.method1944() + local521;
				local333 = local25.method1944() + local323;
				local343 = local25.method1944() + local333;
				local521 = local343;
				this.anIntArray367[local523] = local323;
				this.anIntArray365[local523] = local333;
				this.anIntArray364[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1944() + local521;
				local521 = local343;
				this.anIntArray367[local523] = local323;
				this.anIntArray365[local523] = local333;
				this.anIntArray364[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1944() + local521;
				local521 = local343;
				this.anIntArray367[local523] = local323;
				this.anIntArray365[local523] = local333;
				this.anIntArray364[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1944() + local521;
				local521 = local343;
				this.anIntArray367[local523] = local323;
				this.anIntArray365[local523] = local631;
				this.anIntArray364[local523] = local343;
			}
		}
		local25.anInt2886 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray374[local528] = local25.method1963();
			this.anIntArray372[local528] = local25.method1963();
			this.anIntArray373[local528] = local25.method1963();
		}
		if (!local18) {
			this.aByteArray88 = null;
		}
		if (!local20) {
			this.aByteArray89 = null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([Lclient!ue;I)V")
	public Class3_Sub1_Sub1_Sub7(@OriginalArg(0) Class3_Sub1_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt3345 = 0;
		this.anInt3339 = 0;
		this.anInt3342 = 0;
		this.aByte14 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class3_Sub1_Sub1_Sub7 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt3345 += local45.anInt3345;
				this.anInt3339 += local45.anInt3339;
				this.anInt3342 += local45.anInt3342;
				if (local45.aByteArray86 == null) {
					if (this.aByte14 == -1) {
						this.aByte14 = local45.aByte14;
					}
					if (this.aByte14 != local45.aByte14) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray89 != null;
				local22 |= local45.aByteArray87 != null;
				local24 |= local45.anIntArray375 != null;
				local26 |= local45.aByteArray88 != null;
			}
		}
		this.anIntArray368 = new int[this.anInt3345];
		this.anIntArray363 = new int[this.anInt3345];
		this.anIntArray369 = new int[this.anInt3345];
		this.anIntArray370 = new int[this.anInt3345];
		this.anIntArray367 = new int[this.anInt3339];
		this.anIntArray365 = new int[this.anInt3339];
		this.anIntArray364 = new int[this.anInt3339];
		if (this.anInt3342 > 0) {
			this.anIntArray374 = new int[this.anInt3342];
			this.anIntArray372 = new int[this.anInt3342];
			this.anIntArray373 = new int[this.anInt3342];
		}
		if (local18) {
			this.aByteArray89 = new byte[this.anInt3339];
		}
		if (local20) {
			this.aByteArray86 = new byte[this.anInt3339];
		}
		if (local22) {
			this.aByteArray87 = new byte[this.anInt3339];
		}
		if (local26) {
			this.aByteArray88 = new byte[this.anInt3339];
		}
		if (local24) {
			this.anIntArray375 = new int[this.anInt3339];
		}
		this.aShortArray12 = new short[this.anInt3339];
		this.anInt3345 = 0;
		this.anInt3339 = 0;
		this.anInt3342 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class3_Sub1_Sub1_Sub7 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt3339; local244++) {
					if (local18 && local240.aByteArray89 != null) {
						this.aByteArray89[this.anInt3339] = local240.aByteArray89[local244];
					}
					if (local20) {
						if (local240.aByteArray86 == null) {
							this.aByteArray86[this.anInt3339] = local240.aByte14;
						} else {
							this.aByteArray86[this.anInt3339] = local240.aByteArray86[local244];
						}
					}
					if (local22 && local240.aByteArray87 != null) {
						this.aByteArray87[this.anInt3339] = local240.aByteArray87[local244];
					}
					if (local26) {
						if (local240.aByteArray88 == null || local240.aByteArray88[local244] == -1) {
							this.aByteArray88[this.anInt3339] = -1;
						} else {
							this.aByteArray88[this.anInt3339] = (byte) (local240.aByteArray88[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray375 != null) {
						this.anIntArray375[this.anInt3339] = local240.anIntArray375[local244];
					}
					this.aShortArray12[this.anInt3339] = local240.aShortArray12[local244];
					this.anIntArray367[this.anInt3339] = this.method2239(local240, local240.anIntArray367[local244]);
					this.anIntArray365[this.anInt3339] = this.method2239(local240, local240.anIntArray365[local244]);
					this.anIntArray364[this.anInt3339] = this.method2239(local240, local240.anIntArray364[local244]);
					this.anInt3339++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt3342; local397++) {
					this.anIntArray374[this.anInt3342] = this.method2239(local240, local240.anIntArray374[local397]);
					this.anIntArray372[this.anInt3342] = this.method2239(local240, local240.anIntArray372[local397]);
					this.anIntArray373[this.anInt3342] = this.method2239(local240, local240.anIntArray373[local397]);
					this.anInt3342++;
				}
				local233 += local240.anInt3342;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!ue;ZZZ)V")
	public Class3_Sub1_Sub1_Sub7(@OriginalArg(0) Class3_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3345 = arg0.anInt3345;
		this.anInt3339 = arg0.anInt3339;
		this.anInt3342 = arg0.anInt3342;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray368 = arg0.anIntArray368;
			this.anIntArray363 = arg0.anIntArray363;
			this.anIntArray369 = arg0.anIntArray369;
		} else {
			this.anIntArray368 = new int[this.anInt3345];
			this.anIntArray363 = new int[this.anInt3345];
			this.anIntArray369 = new int[this.anInt3345];
			for (local60 = 0; local60 < this.anInt3345; local60++) {
				this.anIntArray368[local60] = arg0.anIntArray368[local60];
				this.anIntArray363[local60] = arg0.anIntArray363[local60];
				this.anIntArray369[local60] = arg0.anIntArray369[local60];
			}
		}
		if (arg2) {
			this.aShortArray12 = arg0.aShortArray12;
		} else {
			this.aShortArray12 = new short[this.anInt3339];
			for (local60 = 0; local60 < this.anInt3339; local60++) {
				this.aShortArray12[local60] = arg0.aShortArray12[local60];
			}
		}
		this.aByteArray87 = arg0.aByteArray87;
		this.anIntArray367 = arg0.anIntArray367;
		this.anIntArray365 = arg0.anIntArray365;
		this.anIntArray364 = arg0.anIntArray364;
		this.aByteArray89 = arg0.aByteArray89;
		this.aByteArray86 = arg0.aByteArray86;
		this.aByteArray88 = arg0.aByteArray88;
		this.aByte14 = arg0.aByte14;
		this.anIntArray374 = arg0.anIntArray374;
		this.anIntArray372 = arg0.anIntArray372;
		this.anIntArray373 = arg0.anIntArray373;
		this.anIntArray370 = arg0.anIntArray370;
		this.anIntArray375 = arg0.anIntArray375;
		this.anIntArrayArray82 = arg0.anIntArrayArray82;
		this.anIntArrayArray81 = arg0.anIntArrayArray81;
		this.aClass44Array2 = arg0.aClass44Array2;
		this.aClass20Array1 = arg0.aClass20Array1;
		this.aClass44Array1 = arg0.aClass44Array1;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public void method2226() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3345; local1++) {
			this.anIntArray369[local1] = -this.anIntArray369[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3339; local18++) {
			@Pc(24) int local24 = this.anIntArray367[local18];
			this.anIntArray367[local18] = this.anIntArray364[local18];
			this.anIntArray364[local18] = local24;
		}
		this.method2234();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
	public void method2227() {
		if (this.aBoolean122) {
			return;
		}
		super.anInt3333 = 0;
		this.anInt3344 = 0;
		this.anInt3340 = 999999;
		this.anInt3338 = -999999;
		this.anInt3343 = -99999;
		this.anInt3337 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3345; local23++) {
			@Pc(29) int local29 = this.anIntArray368[local23];
			@Pc(34) int local34 = this.anIntArray363[local23];
			@Pc(39) int local39 = this.anIntArray369[local23];
			if (local29 < this.anInt3340) {
				this.anInt3340 = local29;
			}
			if (local29 > this.anInt3338) {
				this.anInt3338 = local29;
			}
			if (local39 < this.anInt3337) {
				this.anInt3337 = local39;
			}
			if (local39 > this.anInt3343) {
				this.anInt3343 = local39;
			}
			if (-local34 > super.anInt3333) {
				super.anInt3333 = -local34;
			}
			if (local34 > this.anInt3344) {
				this.anInt3344 = local34;
			}
		}
		this.aBoolean122 = true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public void method2228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3345; local1++) {
			this.anIntArray368[local1] = this.anIntArray368[local1] * arg0 / 128;
			this.anIntArray363[local1] = this.anIntArray363[local1] * arg1 / 128;
			this.anIntArray369[local1] = this.anIntArray369[local1] * arg2 / 128;
		}
		this.method2234();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2241();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class3_Sub1_Sub1_Sub4 local26 = new Class3_Sub1_Sub1_Sub4();
		local26.anIntArray100 = new int[this.anInt3339];
		local26.anIntArray97 = new int[this.anInt3339];
		local26.anIntArray96 = new int[this.anInt3339];
		for (@Pc(43) int local43 = 0; local43 < this.anInt3339; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray89 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray89[local43];
			}
			@Pc(92) Class44 local92;
			@Pc(123) int local123;
			@Pc(253) Class20 local253;
			if (this.aByteArray88 == null || this.aByteArray88[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray12[local43] & 0xFFFF;
					if (this.aClass44Array1 == null || this.aClass44Array1[this.anIntArray367[local43]] == null) {
						local92 = this.aClass44Array2[this.anIntArray367[local43]];
					} else {
						local92 = this.aClass44Array1[this.anIntArray367[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2156 + arg3 * local92.anInt2147 + arg4 * local92.anInt2151) / (local22 * local92.anInt2146);
					local26.anIntArray100[local43] = Static121.method2240(local73, local123);
					if (this.aClass44Array1 == null || this.aClass44Array1[this.anIntArray365[local43]] == null) {
						local92 = this.aClass44Array2[this.anIntArray365[local43]];
					} else {
						local92 = this.aClass44Array1[this.anIntArray365[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2156 + arg3 * local92.anInt2147 + arg4 * local92.anInt2151) / (local22 * local92.anInt2146);
					local26.anIntArray97[local43] = Static121.method2240(local73, local123);
					if (this.aClass44Array1 == null || this.aClass44Array1[this.anIntArray364[local43]] == null) {
						local92 = this.aClass44Array2[this.anIntArray364[local43]];
					} else {
						local92 = this.aClass44Array1[this.anIntArray364[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2156 + arg3 * local92.anInt2147 + arg4 * local92.anInt2151) / (local22 * local92.anInt2146);
					local26.anIntArray96[local43] = Static121.method2240(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass20Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt999 + arg3 * local253.anInt1007 + arg4 * local253.anInt1003) / (local22 + local22 / 2);
					local26.anIntArray100[local43] = Static121.method2240(this.aShortArray12[local43] & 0xFFFF, local123);
					local26.anIntArray96[local43] = -1;
				} else {
					local26.anIntArray96[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass44Array1 == null || this.aClass44Array1[this.anIntArray367[local43]] == null) {
					local92 = this.aClass44Array2[this.anIntArray367[local43]];
				} else {
					local92 = this.aClass44Array1[this.anIntArray367[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2156 + arg3 * local92.anInt2147 + arg4 * local92.anInt2151) / (local22 * local92.anInt2146);
				local26.anIntArray100[local43] = Static121.method2235(local123);
				if (this.aClass44Array1 == null || this.aClass44Array1[this.anIntArray365[local43]] == null) {
					local92 = this.aClass44Array2[this.anIntArray365[local43]];
				} else {
					local92 = this.aClass44Array1[this.anIntArray365[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2156 + arg3 * local92.anInt2147 + arg4 * local92.anInt2151) / (local22 * local92.anInt2146);
				local26.anIntArray97[local43] = Static121.method2235(local123);
				if (this.aClass44Array1 == null || this.aClass44Array1[this.anIntArray364[local43]] == null) {
					local92 = this.aClass44Array2[this.anIntArray364[local43]];
				} else {
					local92 = this.aClass44Array1[this.anIntArray364[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2156 + arg3 * local92.anInt2147 + arg4 * local92.anInt2151) / (local22 * local92.anInt2146);
				local26.anIntArray96[local43] = Static121.method2235(local123);
			} else if (local49 == 1) {
				local253 = this.aClass20Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt999 + arg3 * local253.anInt1007 + arg4 * local253.anInt1003) / (local22 + local22 / 2);
				local26.anIntArray100[local43] = Static121.method2235(local123);
				local26.anIntArray96[local43] = -1;
			} else {
				local26.anIntArray96[local43] = -2;
			}
		}
		this.method2238();
		local26.anInt966 = this.anInt3345;
		local26.anIntArray102 = this.anIntArray368;
		local26.anIntArray98 = this.anIntArray363;
		local26.anIntArray94 = this.anIntArray369;
		local26.anInt967 = this.anInt3339;
		local26.anIntArray93 = this.anIntArray367;
		local26.anIntArray91 = this.anIntArray365;
		local26.anIntArray95 = this.anIntArray364;
		local26.aByteArray25 = this.aByteArray86;
		local26.aByteArray23 = this.aByteArray87;
		local26.aByteArray24 = this.aByteArray88;
		if (local26.aByteArray24 == null) {
			local26.aShortArray4 = null;
		} else {
			local26.aShortArray4 = this.aShortArray12;
		}
		local26.aByte8 = this.aByte14;
		local26.anInt965 = this.anInt3342;
		local26.anIntArray99 = this.anIntArray374;
		local26.anIntArray101 = this.anIntArray372;
		local26.anIntArray92 = this.anIntArray373;
		local26.anIntArrayArray23 = this.anIntArrayArray82;
		local26.anIntArrayArray24 = this.anIntArrayArray81;
		return local26;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()V")
	public void method2231() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3345; local1++) {
			@Pc(7) int local7 = this.anIntArray369[local1];
			this.anIntArray369[local1] = this.anIntArray368[local1];
			this.anIntArray368[local1] = -local7;
		}
		this.method2234();
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()V")
	public void method2232() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3345; local1++) {
			@Pc(7) int local7 = this.anIntArray368[local1];
			this.anIntArray368[local1] = this.anIntArray369[local1];
			this.anIntArray369[local1] = -local7;
		}
		this.method2234();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(SS)V")
	public void method2233(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3339; local1++) {
			if (this.aShortArray12[local1] == arg0) {
				this.aShortArray12[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
	private void method2234() {
		this.aClass44Array2 = null;
		this.aClass44Array1 = null;
		this.aClass20Array1 = null;
		this.aBoolean122 = false;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()Lclient!ue;")
	public Class3_Sub1_Sub1_Sub7 method2236() {
		@Pc(3) Class3_Sub1_Sub1_Sub7 local3 = new Class3_Sub1_Sub1_Sub7();
		if (this.aByteArray89 != null) {
			local3.aByteArray89 = new byte[this.anInt3339];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3339; local13++) {
				local3.aByteArray89[local13] = this.aByteArray89[local13];
			}
		}
		local3.anInt3345 = this.anInt3345;
		local3.anInt3339 = this.anInt3339;
		local3.anInt3342 = this.anInt3342;
		local3.anIntArray368 = this.anIntArray368;
		local3.anIntArray363 = this.anIntArray363;
		local3.anIntArray369 = this.anIntArray369;
		local3.anIntArray367 = this.anIntArray367;
		local3.anIntArray365 = this.anIntArray365;
		local3.anIntArray364 = this.anIntArray364;
		local3.aByteArray86 = this.aByteArray86;
		local3.aByteArray87 = this.aByteArray87;
		local3.aByteArray88 = this.aByteArray88;
		local3.aShortArray12 = this.aShortArray12;
		local3.aByte14 = this.aByte14;
		local3.anIntArray374 = this.anIntArray374;
		local3.anIntArray372 = this.anIntArray372;
		local3.anIntArray373 = this.anIntArray373;
		local3.anIntArray370 = this.anIntArray370;
		local3.anIntArray375 = this.anIntArray375;
		local3.anIntArrayArray82 = this.anIntArrayArray82;
		local3.anIntArrayArray81 = this.anIntArrayArray81;
		local3.aClass44Array2 = this.aClass44Array2;
		local3.aClass20Array1 = this.aClass20Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public void method2237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3345; local1++) {
			this.anIntArray368[local1] += arg0;
			this.anIntArray363[local1] += arg1;
			this.anIntArray369[local1] += arg2;
		}
		this.method2234();
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "()V")
	private void method2238() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray370 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3345; local9++) {
				local15 = this.anIntArray370[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray82 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray82[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt3345) {
				local65 = this.anIntArray370[local59];
				this.anIntArrayArray82[local65][local5[local65]++] = local59++;
			}
			this.anIntArray370 = null;
		}
		if (this.anIntArray375 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3339; local9++) {
			local15 = this.anIntArray375[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray81 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray81[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt3339) {
			local65 = this.anIntArray375[local59];
			this.anIntArrayArray81[local65][local5[local65]++] = local59++;
		}
		this.anIntArray375 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ue;I)I")
	private int method2239(@OriginalArg(0) Class3_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray368[arg1];
		@Pc(11) int local11 = arg0.anIntArray363[arg1];
		@Pc(16) int local16 = arg0.anIntArray369[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3345; local18++) {
			if (local6 == this.anIntArray368[local18] && local11 == this.anIntArray363[local18] && local16 == this.anIntArray369[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray368[this.anInt3345] = local6;
			this.anIntArray363[this.anInt3345] = local11;
			this.anIntArray369[this.anInt3345] = local16;
			if (arg0.anIntArray370 != null) {
				this.anIntArray370[this.anInt3345] = arg0.anIntArray370[arg1];
			}
			local1 = this.anInt3345++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "()V")
	public void method2241() {
		if (this.aClass44Array2 != null) {
			return;
		}
		this.aClass44Array2 = new Class44[this.anInt3345];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3345; local10++) {
			this.aClass44Array2[local10] = new Class44();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3339; local25++) {
			@Pc(31) int local31 = this.anIntArray367[local25];
			@Pc(36) int local36 = this.anIntArray365[local25];
			@Pc(41) int local41 = this.anIntArray364[local25];
			@Pc(51) int local51 = this.anIntArray368[local36] - this.anIntArray368[local31];
			@Pc(61) int local61 = this.anIntArray363[local36] - this.anIntArray363[local31];
			@Pc(71) int local71 = this.anIntArray369[local36] - this.anIntArray369[local31];
			@Pc(81) int local81 = this.anIntArray368[local41] - this.anIntArray368[local31];
			@Pc(91) int local91 = this.anIntArray363[local41] - this.anIntArray363[local31];
			@Pc(101) int local101 = this.anIntArray369[local41] - this.anIntArray369[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray89 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray89[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class44 local211 = this.aClass44Array2[local31];
				local211.anInt2156 += local109;
				local211.anInt2147 += local117;
				local211.anInt2151 += local125;
				local211.anInt2146++;
				@Pc(240) Class44 local240 = this.aClass44Array2[local36];
				local240.anInt2156 += local109;
				local240.anInt2147 += local117;
				local240.anInt2151 += local125;
				local240.anInt2146++;
				@Pc(269) Class44 local269 = this.aClass44Array2[local41];
				local269.anInt2156 += local109;
				local269.anInt2147 += local117;
				local269.anInt2151 += local125;
				local269.anInt2146++;
			} else if (local198 == 1) {
				if (this.aClass20Array1 == null) {
					this.aClass20Array1 = new Class20[this.anInt3339];
				}
				@Pc(314) Class20 local314 = this.aClass20Array1[local25] = new Class20();
				local314.anInt999 = local109;
				local314.anInt1007 = local117;
				local314.anInt1003 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZ)Lclient!ue;")
	public Class3_Sub1_Sub1_Sub7 method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub1_Sub7 local16 = new Class3_Sub1_Sub1_Sub7();
		local16.anInt3345 = this.anInt3345;
		local16.anInt3339 = this.anInt3339;
		local16.anInt3342 = this.anInt3342;
		local16.anIntArray368 = this.anIntArray368;
		local16.anIntArray369 = this.anIntArray369;
		local16.anIntArray367 = this.anIntArray367;
		local16.anIntArray365 = this.anIntArray365;
		local16.anIntArray364 = this.anIntArray364;
		local16.aByteArray89 = this.aByteArray89;
		local16.aByteArray86 = this.aByteArray86;
		local16.aByteArray87 = this.aByteArray87;
		local16.aByteArray88 = this.aByteArray88;
		local16.aShortArray12 = this.aShortArray12;
		local16.aByte14 = this.aByte14;
		local16.anIntArray374 = this.anIntArray374;
		local16.anIntArray372 = this.anIntArray372;
		local16.anIntArray373 = this.anIntArray373;
		local16.anIntArray370 = this.anIntArray370;
		local16.anIntArray375 = this.anIntArray375;
		local16.anIntArrayArray82 = this.anIntArrayArray82;
		local16.anIntArrayArray81 = this.anIntArrayArray81;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray363 = new int[local16.anInt3345];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt3345; local128++) {
			@Pc(134) int local134 = this.anIntArray368[local128];
			@Pc(139) int local139 = this.anIntArray363[local128];
			@Pc(144) int local144 = this.anIntArray369[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray363[local128] = local139 + local180 - local126;
		}
		local16.method2234();
		return local16;
	}

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "()V")
	public void method2245() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3345; local1++) {
			this.anIntArray368[local1] = -this.anIntArray368[local1];
			this.anIntArray369[local1] = -this.anIntArray369[local1];
		}
		this.method2234();
	}
}
