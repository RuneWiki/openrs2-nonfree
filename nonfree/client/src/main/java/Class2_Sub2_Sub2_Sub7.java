import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class2_Sub2_Sub2_Sub7 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!pf", name = "Qb", descriptor = "[I")
	public static int[] anIntArray288 = new int[128];

	@OriginalMember(owner = "client!pf", name = "mb", descriptor = "[Lclient!cf;")
	private Class11[] aClass11Array1;

	@OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
	public int anInt1995;

	@OriginalMember(owner = "client!pf", name = "pb", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!pf", name = "qb", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!pf", name = "sb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!pf", name = "tb", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!pf", name = "ub", descriptor = "I")
	public int anInt1996;

	@OriginalMember(owner = "client!pf", name = "vb", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!pf", name = "wb", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!pf", name = "xb", descriptor = "I")
	public int anInt1997;

	@OriginalMember(owner = "client!pf", name = "yb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!pf", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!pf", name = "Bb", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!pf", name = "Cb", descriptor = "I")
	public int anInt1999;

	@OriginalMember(owner = "client!pf", name = "Eb", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!pf", name = "Gb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!pf", name = "Ib", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!pf", name = "Jb", descriptor = "[Lclient!uc;")
	public Class76[] aClass76Array1;

	@OriginalMember(owner = "client!pf", name = "Kb", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!pf", name = "Lb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!pf", name = "Mb", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!pf", name = "Ob", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!pf", name = "Pb", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!pf", name = "Rb", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!pf", name = "Sb", descriptor = "[Lclient!uc;")
	public Class76[] aClass76Array2;

	@OriginalMember(owner = "client!pf", name = "Ub", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!pf", name = "Vb", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!pf", name = "Wb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!pf", name = "nb", descriptor = "I")
	private int anInt1994 = 0;

	@OriginalMember(owner = "client!pf", name = "zb", descriptor = "I")
	public int anInt1998 = 0;

	@OriginalMember(owner = "client!pf", name = "Db", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!pf", name = "Nb", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!pf", name = "Tb", descriptor = "I")
	public int anInt2001 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray288[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray288[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray288[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray288[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray288[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	private Class2_Sub2_Sub2_Sub7() {
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub2_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class2_Sub10 local25 = new Class2_Sub10(arg0);
		@Pc(30) Class2_Sub10 local30 = new Class2_Sub10(arg0);
		@Pc(35) Class2_Sub10 local35 = new Class2_Sub10(arg0);
		@Pc(40) Class2_Sub10 local40 = new Class2_Sub10(arg0);
		@Pc(45) Class2_Sub10 local45 = new Class2_Sub10(arg0);
		local25.anInt2187 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1517();
		@Pc(59) int local59 = local25.method1517();
		@Pc(63) int local63 = local25.method1514();
		@Pc(67) int local67 = local25.method1514();
		@Pc(71) int local71 = local25.method1514();
		@Pc(75) int local75 = local25.method1514();
		@Pc(79) int local79 = local25.method1514();
		@Pc(83) int local83 = local25.method1514();
		@Pc(87) int local87 = local25.method1517();
		@Pc(91) int local91 = local25.method1517();
		@Pc(95) int local95 = local25.method1517();
		@Pc(99) int local99 = local25.method1517();
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
		this.anInt2001 = local55;
		this.anInt1998 = local59;
		this.anInt1994 = local63;
		this.anIntArray287 = new int[local55];
		this.anIntArray280 = new int[local55];
		this.anIntArray284 = new int[local55];
		this.anIntArray278 = new int[local59];
		this.anIntArray289 = new int[local59];
		this.anIntArray290 = new int[local59];
		if (local63 > 0) {
			this.anIntArray281 = new int[local63];
			this.anIntArray285 = new int[local63];
			this.anIntArray277 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray286 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray25 = new byte[local59];
			this.aByteArray23 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray24 = new byte[local59];
		} else {
			this.aByte3 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray26 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray283 = new int[local59];
		}
		this.aShortArray12 = new short[local59];
		local25.anInt2187 = local101;
		local30.anInt2187 = local182;
		local35.anInt2187 = local188;
		local40.anInt2187 = local107;
		local45.anInt2187 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1514();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1513();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1513();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1513();
			}
			this.anIntArray287[local316] = local310 + local323;
			this.anIntArray280[local316] = local312 + local333;
			this.anIntArray284[local316] = local314 + local343;
			local310 = this.anIntArray287[local316];
			local312 = this.anIntArray280[local316];
			local314 = this.anIntArray284[local316];
			if (local83 == 1) {
				this.anIntArray286[local316] = local45.method1514();
			}
		}
		local25.anInt2187 = local166;
		local30.anInt2187 = local133;
		local35.anInt2187 = local115;
		local40.anInt2187 = local151;
		local45.anInt2187 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray12[local321] = (short) local25.method1517();
			if (local67 == 1) {
				local323 = local30.method1514();
				if ((local323 & 0x1) == 1) {
					this.aByteArray25[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray25[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray23[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray23[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray24[local321] = local35.method1509();
			}
			if (local75 == 1) {
				this.aByteArray26[local321] = local40.method1509();
			}
			if (local79 == 1) {
				this.anIntArray283[local321] = local45.method1514();
			}
		}
		local25.anInt2187 = local160;
		local30.anInt2187 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1514();
			if (local528 == 1) {
				local323 = local25.method1513() + local521;
				local333 = local25.method1513() + local323;
				local343 = local25.method1513() + local333;
				local521 = local343;
				this.anIntArray278[local523] = local323;
				this.anIntArray289[local523] = local333;
				this.anIntArray290[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1513() + local521;
				local521 = local343;
				this.anIntArray278[local523] = local323;
				this.anIntArray289[local523] = local333;
				this.anIntArray290[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1513() + local521;
				local521 = local343;
				this.anIntArray278[local523] = local323;
				this.anIntArray289[local523] = local333;
				this.anIntArray290[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1513() + local521;
				local521 = local343;
				this.anIntArray278[local523] = local323;
				this.anIntArray289[local523] = local631;
				this.anIntArray290[local523] = local343;
			}
		}
		local25.anInt2187 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray281[local528] = local25.method1517();
			this.anIntArray285[local528] = local25.method1517();
			this.anIntArray277[local528] = local25.method1517();
		}
		if (!local18) {
			this.aByteArray23 = null;
		}
		if (!local20) {
			this.aByteArray25 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([Lclient!pf;I)V")
	public Class2_Sub2_Sub2_Sub7(@OriginalArg(0) Class2_Sub2_Sub2_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt2001 = 0;
		this.anInt1998 = 0;
		this.anInt1994 = 0;
		this.aByte3 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class2_Sub2_Sub2_Sub7 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt2001 += local45.anInt2001;
				this.anInt1998 += local45.anInt1998;
				this.anInt1994 += local45.anInt1994;
				if (local45.aByteArray24 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local45.aByte3;
					}
					if (this.aByte3 != local45.aByte3) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray25 != null;
				local22 |= local45.aByteArray26 != null;
				local24 |= local45.anIntArray283 != null;
				local26 |= local45.aByteArray23 != null;
			}
		}
		this.anIntArray287 = new int[this.anInt2001];
		this.anIntArray280 = new int[this.anInt2001];
		this.anIntArray284 = new int[this.anInt2001];
		this.anIntArray286 = new int[this.anInt2001];
		this.anIntArray278 = new int[this.anInt1998];
		this.anIntArray289 = new int[this.anInt1998];
		this.anIntArray290 = new int[this.anInt1998];
		if (this.anInt1994 > 0) {
			this.anIntArray281 = new int[this.anInt1994];
			this.anIntArray285 = new int[this.anInt1994];
			this.anIntArray277 = new int[this.anInt1994];
		}
		if (local18) {
			this.aByteArray25 = new byte[this.anInt1998];
		}
		if (local20) {
			this.aByteArray24 = new byte[this.anInt1998];
		}
		if (local22) {
			this.aByteArray26 = new byte[this.anInt1998];
		}
		if (local26) {
			this.aByteArray23 = new byte[this.anInt1998];
		}
		if (local24) {
			this.anIntArray283 = new int[this.anInt1998];
		}
		this.aShortArray12 = new short[this.anInt1998];
		this.anInt2001 = 0;
		this.anInt1998 = 0;
		this.anInt1994 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class2_Sub2_Sub2_Sub7 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt1998; local244++) {
					if (local18 && local240.aByteArray25 != null) {
						this.aByteArray25[this.anInt1998] = local240.aByteArray25[local244];
					}
					if (local20) {
						if (local240.aByteArray24 == null) {
							this.aByteArray24[this.anInt1998] = local240.aByte3;
						} else {
							this.aByteArray24[this.anInt1998] = local240.aByteArray24[local244];
						}
					}
					if (local22 && local240.aByteArray26 != null) {
						this.aByteArray26[this.anInt1998] = local240.aByteArray26[local244];
					}
					if (local26) {
						if (local240.aByteArray23 == null || local240.aByteArray23[local244] == -1) {
							this.aByteArray23[this.anInt1998] = -1;
						} else {
							this.aByteArray23[this.anInt1998] = (byte) (local240.aByteArray23[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray283 != null) {
						this.anIntArray283[this.anInt1998] = local240.anIntArray283[local244];
					}
					this.aShortArray12[this.anInt1998] = local240.aShortArray12[local244];
					this.anIntArray278[this.anInt1998] = this.method1401(local240, local240.anIntArray278[local244]);
					this.anIntArray289[this.anInt1998] = this.method1401(local240, local240.anIntArray289[local244]);
					this.anIntArray290[this.anInt1998] = this.method1401(local240, local240.anIntArray290[local244]);
					this.anInt1998++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt1994; local397++) {
					this.anIntArray281[this.anInt1994] = this.method1401(local240, local240.anIntArray281[local397]);
					this.anIntArray285[this.anInt1994] = this.method1401(local240, local240.anIntArray285[local397]);
					this.anIntArray277[this.anInt1994] = this.method1401(local240, local240.anIntArray277[local397]);
					this.anInt1994++;
				}
				local233 += local240.anInt1994;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!pf;ZZZ)V")
	public Class2_Sub2_Sub2_Sub7(@OriginalArg(0) Class2_Sub2_Sub2_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2001 = arg0.anInt2001;
		this.anInt1998 = arg0.anInt1998;
		this.anInt1994 = arg0.anInt1994;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray287 = arg0.anIntArray287;
			this.anIntArray280 = arg0.anIntArray280;
			this.anIntArray284 = arg0.anIntArray284;
		} else {
			this.anIntArray287 = new int[this.anInt2001];
			this.anIntArray280 = new int[this.anInt2001];
			this.anIntArray284 = new int[this.anInt2001];
			for (local60 = 0; local60 < this.anInt2001; local60++) {
				this.anIntArray287[local60] = arg0.anIntArray287[local60];
				this.anIntArray280[local60] = arg0.anIntArray280[local60];
				this.anIntArray284[local60] = arg0.anIntArray284[local60];
			}
		}
		if (arg2) {
			this.aShortArray12 = arg0.aShortArray12;
		} else {
			this.aShortArray12 = new short[this.anInt1998];
			for (local60 = 0; local60 < this.anInt1998; local60++) {
				this.aShortArray12[local60] = arg0.aShortArray12[local60];
			}
		}
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray278 = arg0.anIntArray278;
		this.anIntArray289 = arg0.anIntArray289;
		this.anIntArray290 = arg0.anIntArray290;
		this.aByteArray25 = arg0.aByteArray25;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray23 = arg0.aByteArray23;
		this.aByte3 = arg0.aByte3;
		this.anIntArray281 = arg0.anIntArray281;
		this.anIntArray285 = arg0.anIntArray285;
		this.anIntArray277 = arg0.anIntArray277;
		this.anIntArray286 = arg0.anIntArray286;
		this.anIntArray283 = arg0.anIntArray283;
		this.anIntArrayArray22 = arg0.anIntArrayArray22;
		this.anIntArrayArray21 = arg0.anIntArrayArray21;
		this.aClass76Array2 = arg0.aClass76Array2;
		this.aClass11Array1 = arg0.aClass11Array1;
		this.aClass76Array1 = arg0.aClass76Array1;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
	public void method1400() {
		if (this.aClass76Array2 != null) {
			return;
		}
		this.aClass76Array2 = new Class76[this.anInt2001];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2001; local10++) {
			this.aClass76Array2[local10] = new Class76();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1998; local25++) {
			@Pc(31) int local31 = this.anIntArray278[local25];
			@Pc(36) int local36 = this.anIntArray289[local25];
			@Pc(41) int local41 = this.anIntArray290[local25];
			@Pc(51) int local51 = this.anIntArray287[local36] - this.anIntArray287[local31];
			@Pc(61) int local61 = this.anIntArray280[local36] - this.anIntArray280[local31];
			@Pc(71) int local71 = this.anIntArray284[local36] - this.anIntArray284[local31];
			@Pc(81) int local81 = this.anIntArray287[local41] - this.anIntArray287[local31];
			@Pc(91) int local91 = this.anIntArray280[local41] - this.anIntArray280[local31];
			@Pc(101) int local101 = this.anIntArray284[local41] - this.anIntArray284[local31];
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
			if (this.aByteArray25 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray25[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class76 local211 = this.aClass76Array2[local31];
				local211.anInt2542 += local109;
				local211.anInt2546 += local117;
				local211.anInt2541 += local125;
				local211.anInt2545++;
				@Pc(240) Class76 local240 = this.aClass76Array2[local36];
				local240.anInt2542 += local109;
				local240.anInt2546 += local117;
				local240.anInt2541 += local125;
				local240.anInt2545++;
				@Pc(269) Class76 local269 = this.aClass76Array2[local41];
				local269.anInt2542 += local109;
				local269.anInt2546 += local117;
				local269.anInt2541 += local125;
				local269.anInt2545++;
			} else if (local198 == 1) {
				if (this.aClass11Array1 == null) {
					this.aClass11Array1 = new Class11[this.anInt1998];
				}
				@Pc(314) Class11 local314 = this.aClass11Array1[local25] = new Class11();
				local314.anInt458 = local109;
				local314.anInt462 = local117;
				local314.anInt460 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!pf;I)I")
	private int method1401(@OriginalArg(0) Class2_Sub2_Sub2_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray287[arg1];
		@Pc(11) int local11 = arg0.anIntArray280[arg1];
		@Pc(16) int local16 = arg0.anIntArray284[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2001; local18++) {
			if (local6 == this.anIntArray287[local18] && local11 == this.anIntArray280[local18] && local16 == this.anIntArray284[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray287[this.anInt2001] = local6;
			this.anIntArray280[this.anInt2001] = local11;
			this.anIntArray284[this.anInt2001] = local16;
			if (arg0.anIntArray286 != null) {
				this.anIntArray286[this.anInt2001] = arg0.anIntArray286[arg1];
			}
			local1 = this.anInt2001++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method1402() {
		@Pc(3) Class2_Sub2_Sub2_Sub7 local3 = new Class2_Sub2_Sub2_Sub7();
		if (this.aByteArray25 != null) {
			local3.aByteArray25 = new byte[this.anInt1998];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1998; local13++) {
				local3.aByteArray25[local13] = this.aByteArray25[local13];
			}
		}
		local3.anInt2001 = this.anInt2001;
		local3.anInt1998 = this.anInt1998;
		local3.anInt1994 = this.anInt1994;
		local3.anIntArray287 = this.anIntArray287;
		local3.anIntArray280 = this.anIntArray280;
		local3.anIntArray284 = this.anIntArray284;
		local3.anIntArray278 = this.anIntArray278;
		local3.anIntArray289 = this.anIntArray289;
		local3.anIntArray290 = this.anIntArray290;
		local3.aByteArray24 = this.aByteArray24;
		local3.aByteArray26 = this.aByteArray26;
		local3.aByteArray23 = this.aByteArray23;
		local3.aShortArray12 = this.aShortArray12;
		local3.aByte3 = this.aByte3;
		local3.anIntArray281 = this.anIntArray281;
		local3.anIntArray285 = this.anIntArray285;
		local3.anIntArray277 = this.anIntArray277;
		local3.anIntArray286 = this.anIntArray286;
		local3.anIntArray283 = this.anIntArray283;
		local3.anIntArrayArray22 = this.anIntArrayArray22;
		local3.anIntArrayArray21 = this.anIntArrayArray21;
		local3.aClass76Array2 = this.aClass76Array2;
		local3.aClass11Array1 = this.aClass11Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public void method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2001; local1++) {
			this.anIntArray287[local1] = this.anIntArray287[local1] * arg0 / 128;
			this.anIntArray280[local1] = this.anIntArray280[local1] * arg1 / 128;
			this.anIntArray284[local1] = this.anIntArray284[local1] * arg2 / 128;
		}
		this.method1409();
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "()V")
	private void method1404() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray286 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2001; local9++) {
				local15 = this.anIntArray286[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray22 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray22[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2001) {
				local65 = this.anIntArray286[local59];
				this.anIntArrayArray22[local65][local5[local65]++] = local59++;
			}
			this.anIntArray286 = null;
		}
		if (this.anIntArray283 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1998; local9++) {
			local15 = this.anIntArray283[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray21 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray21[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1998) {
			local65 = this.anIntArray283[local59];
			this.anIntArrayArray21[local65][local5[local65]++] = local59++;
		}
		this.anIntArray283 = null;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "()V")
	public void method1407() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2001; local1++) {
			@Pc(7) int local7 = this.anIntArray284[local1];
			this.anIntArray284[local1] = this.anIntArray287[local1];
			this.anIntArray287[local1] = -local7;
		}
		this.method1409();
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "()V")
	public void method1408() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2001; local1++) {
			this.anIntArray287[local1] = -this.anIntArray287[local1];
			this.anIntArray284[local1] = -this.anIntArray284[local1];
		}
		this.method1409();
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "()V")
	private void method1409() {
		this.aClass76Array2 = null;
		this.aClass76Array1 = null;
		this.aClass11Array1 = null;
		this.aBoolean83 = false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIZ)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class2_Sub2_Sub2_Sub7 local16 = new Class2_Sub2_Sub2_Sub7();
		local16.anInt2001 = this.anInt2001;
		local16.anInt1998 = this.anInt1998;
		local16.anInt1994 = this.anInt1994;
		local16.anIntArray287 = this.anIntArray287;
		local16.anIntArray284 = this.anIntArray284;
		local16.anIntArray278 = this.anIntArray278;
		local16.anIntArray289 = this.anIntArray289;
		local16.anIntArray290 = this.anIntArray290;
		local16.aByteArray25 = this.aByteArray25;
		local16.aByteArray24 = this.aByteArray24;
		local16.aByteArray26 = this.aByteArray26;
		local16.aByteArray23 = this.aByteArray23;
		local16.aShortArray12 = this.aShortArray12;
		local16.aByte3 = this.aByte3;
		local16.anIntArray281 = this.anIntArray281;
		local16.anIntArray285 = this.anIntArray285;
		local16.anIntArray277 = this.anIntArray277;
		local16.anIntArray286 = this.anIntArray286;
		local16.anIntArray283 = this.anIntArray283;
		local16.anIntArrayArray22 = this.anIntArrayArray22;
		local16.anIntArrayArray21 = this.anIntArrayArray21;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray280 = new int[local16.anInt2001];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt2001; local128++) {
			@Pc(134) int local134 = this.anIntArray287[local128];
			@Pc(139) int local139 = this.anIntArray280[local128];
			@Pc(144) int local144 = this.anIntArray284[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray280[local128] = local139 + local180 - local126;
		}
		local16.method1409();
		return local16;
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "()V")
	public void method1411() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2001; local1++) {
			this.anIntArray284[local1] = -this.anIntArray284[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1998; local18++) {
			@Pc(24) int local24 = this.anIntArray278[local18];
			this.anIntArray278[local18] = this.anIntArray290[local18];
			this.anIntArray290[local18] = local24;
		}
		this.method1409();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1400();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class2_Sub2_Sub2_Sub5 local26 = new Class2_Sub2_Sub2_Sub5();
		local26.anIntArray216 = new int[this.anInt1998];
		local26.anIntArray213 = new int[this.anInt1998];
		local26.anIntArray224 = new int[this.anInt1998];
		for (@Pc(43) int local43 = 0; local43 < this.anInt1998; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray25 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray25[local43];
			}
			@Pc(92) Class76 local92;
			@Pc(123) int local123;
			@Pc(253) Class11 local253;
			if (this.aByteArray23 == null || this.aByteArray23[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray12[local43] & 0xFFFF;
					if (this.aClass76Array1 == null || this.aClass76Array1[this.anIntArray278[local43]] == null) {
						local92 = this.aClass76Array2[this.anIntArray278[local43]];
					} else {
						local92 = this.aClass76Array1[this.anIntArray278[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2542 + arg3 * local92.anInt2546 + arg4 * local92.anInt2541) / (local22 * local92.anInt2545);
					local26.anIntArray216[local43] = Static94.method1405(local73, local123);
					if (this.aClass76Array1 == null || this.aClass76Array1[this.anIntArray289[local43]] == null) {
						local92 = this.aClass76Array2[this.anIntArray289[local43]];
					} else {
						local92 = this.aClass76Array1[this.anIntArray289[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2542 + arg3 * local92.anInt2546 + arg4 * local92.anInt2541) / (local22 * local92.anInt2545);
					local26.anIntArray213[local43] = Static94.method1405(local73, local123);
					if (this.aClass76Array1 == null || this.aClass76Array1[this.anIntArray290[local43]] == null) {
						local92 = this.aClass76Array2[this.anIntArray290[local43]];
					} else {
						local92 = this.aClass76Array1[this.anIntArray290[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2542 + arg3 * local92.anInt2546 + arg4 * local92.anInt2541) / (local22 * local92.anInt2545);
					local26.anIntArray224[local43] = Static94.method1405(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass11Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt458 + arg3 * local253.anInt462 + arg4 * local253.anInt460) / (local22 + local22 / 2);
					local26.anIntArray216[local43] = Static94.method1405(this.aShortArray12[local43] & 0xFFFF, local123);
					local26.anIntArray224[local43] = -1;
				} else {
					local26.anIntArray224[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass76Array1 == null || this.aClass76Array1[this.anIntArray278[local43]] == null) {
					local92 = this.aClass76Array2[this.anIntArray278[local43]];
				} else {
					local92 = this.aClass76Array1[this.anIntArray278[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2542 + arg3 * local92.anInt2546 + arg4 * local92.anInt2541) / (local22 * local92.anInt2545);
				local26.anIntArray216[local43] = Static94.method1417(local123);
				if (this.aClass76Array1 == null || this.aClass76Array1[this.anIntArray289[local43]] == null) {
					local92 = this.aClass76Array2[this.anIntArray289[local43]];
				} else {
					local92 = this.aClass76Array1[this.anIntArray289[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2542 + arg3 * local92.anInt2546 + arg4 * local92.anInt2541) / (local22 * local92.anInt2545);
				local26.anIntArray213[local43] = Static94.method1417(local123);
				if (this.aClass76Array1 == null || this.aClass76Array1[this.anIntArray290[local43]] == null) {
					local92 = this.aClass76Array2[this.anIntArray290[local43]];
				} else {
					local92 = this.aClass76Array1[this.anIntArray290[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2542 + arg3 * local92.anInt2546 + arg4 * local92.anInt2541) / (local22 * local92.anInt2545);
				local26.anIntArray224[local43] = Static94.method1417(local123);
			} else if (local49 == 1) {
				local253 = this.aClass11Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt458 + arg3 * local253.anInt462 + arg4 * local253.anInt460) / (local22 + local22 / 2);
				local26.anIntArray216[local43] = Static94.method1417(local123);
				local26.anIntArray224[local43] = -1;
			} else {
				local26.anIntArray224[local43] = -2;
			}
		}
		this.method1404();
		local26.anInt1628 = this.anInt2001;
		local26.anIntArray221 = this.anIntArray287;
		local26.anIntArray222 = this.anIntArray280;
		local26.anIntArray215 = this.anIntArray284;
		local26.anInt1629 = this.anInt1998;
		local26.anIntArray223 = this.anIntArray278;
		local26.anIntArray214 = this.anIntArray289;
		local26.anIntArray218 = this.anIntArray290;
		local26.aByteArray17 = this.aByteArray24;
		local26.aByteArray15 = this.aByteArray26;
		local26.aByteArray16 = this.aByteArray23;
		if (local26.aByteArray16 == null) {
			local26.aShortArray9 = null;
		} else {
			local26.aShortArray9 = this.aShortArray12;
		}
		local26.aByte2 = this.aByte3;
		local26.anInt1623 = this.anInt1994;
		local26.anIntArray220 = this.anIntArray281;
		local26.anIntArray217 = this.anIntArray285;
		local26.anIntArray219 = this.anIntArray277;
		local26.anIntArrayArray14 = this.anIntArrayArray22;
		local26.anIntArrayArray15 = this.anIntArrayArray21;
		return local26;
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "()V")
	public void method1413() {
		if (this.aBoolean83) {
			return;
		}
		super.anInt2656 = 0;
		this.anInt2002 = 0;
		this.anInt1995 = 999999;
		this.anInt1997 = -999999;
		this.anInt1996 = -99999;
		this.anInt1999 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2001; local23++) {
			@Pc(29) int local29 = this.anIntArray287[local23];
			@Pc(34) int local34 = this.anIntArray280[local23];
			@Pc(39) int local39 = this.anIntArray284[local23];
			if (local29 < this.anInt1995) {
				this.anInt1995 = local29;
			}
			if (local29 > this.anInt1997) {
				this.anInt1997 = local29;
			}
			if (local39 < this.anInt1999) {
				this.anInt1999 = local39;
			}
			if (local39 > this.anInt1996) {
				this.anInt1996 = local39;
			}
			if (-local34 > super.anInt2656) {
				super.anInt2656 = -local34;
			}
			if (local34 > this.anInt2002) {
				this.anInt2002 = local34;
			}
		}
		this.aBoolean83 = true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(SS)V")
	public void method1415(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1998; local1++) {
			if (this.aShortArray12[local1] == arg0) {
				this.aShortArray12[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
	public void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2001; local1++) {
			this.anIntArray287[local1] += arg0;
			this.anIntArray280[local1] += arg1;
			this.anIntArray284[local1] += arg2;
		}
		this.method1409();
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "()V")
	public void method1418() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2001; local1++) {
			@Pc(7) int local7 = this.anIntArray287[local1];
			this.anIntArray287[local1] = this.anIntArray284[local1];
			this.anIntArray284[local1] = -local7;
		}
		this.method1409();
	}
}
