import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kc", name = "Wb", descriptor = "[I")
	public static int[] anIntArray204 = new int[128];

	@OriginalMember(owner = "client!kc", name = "tb", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!kc", name = "ub", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "client!kc", name = "xb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!kc", name = "yb", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!kc", name = "zb", descriptor = "I")
	public int anInt1335;

	@OriginalMember(owner = "client!kc", name = "Bb", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!kc", name = "Cb", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!kc", name = "Db", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!kc", name = "Eb", descriptor = "I")
	public int anInt1337;

	@OriginalMember(owner = "client!kc", name = "Gb", descriptor = "I")
	public int anInt1338;

	@OriginalMember(owner = "client!kc", name = "Hb", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!kc", name = "Ib", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!kc", name = "Jb", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!kc", name = "Kb", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!kc", name = "Lb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!kc", name = "Mb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!kc", name = "Nb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!kc", name = "Ob", descriptor = "[Lclient!ab;")
	public Class3[] aClass3Array1;

	@OriginalMember(owner = "client!kc", name = "Pb", descriptor = "[Lclient!ie;")
	private Class35[] aClass35Array1;

	@OriginalMember(owner = "client!kc", name = "Qb", descriptor = "I")
	public int anInt1339;

	@OriginalMember(owner = "client!kc", name = "Sb", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!kc", name = "Ub", descriptor = "[Lclient!ab;")
	public Class3[] aClass3Array2;

	@OriginalMember(owner = "client!kc", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!kc", name = "Xb", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!kc", name = "Yb", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!kc", name = "Zb", descriptor = "I")
	public int anInt1341;

	@OriginalMember(owner = "client!kc", name = "ac", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!kc", name = "bc", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!kc", name = "Ab", descriptor = "I")
	public int anInt1336 = 0;

	@OriginalMember(owner = "client!kc", name = "vb", descriptor = "I")
	public int anInt1334 = 0;

	@OriginalMember(owner = "client!kc", name = "Fb", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!kc", name = "Rb", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!kc", name = "Tb", descriptor = "I")
	private int anInt1340 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray204[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray204[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray204[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray204[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray204[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub2_Sub3() {
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class1_Sub6 local25 = new Class1_Sub6(arg0);
		@Pc(30) Class1_Sub6 local30 = new Class1_Sub6(arg0);
		@Pc(35) Class1_Sub6 local35 = new Class1_Sub6(arg0);
		@Pc(40) Class1_Sub6 local40 = new Class1_Sub6(arg0);
		@Pc(45) Class1_Sub6 local45 = new Class1_Sub6(arg0);
		local25.anInt2574 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1842();
		@Pc(59) int local59 = local25.method1842();
		@Pc(63) int local63 = local25.method1837();
		@Pc(67) int local67 = local25.method1837();
		@Pc(71) int local71 = local25.method1837();
		@Pc(75) int local75 = local25.method1837();
		@Pc(79) int local79 = local25.method1837();
		@Pc(83) int local83 = local25.method1837();
		@Pc(87) int local87 = local25.method1842();
		@Pc(91) int local91 = local25.method1842();
		@Pc(95) int local95 = local25.method1842();
		@Pc(99) int local99 = local25.method1842();
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
		this.anInt1334 = local55;
		this.anInt1336 = local59;
		this.anInt1340 = local63;
		this.anIntArray202 = new int[local55];
		this.anIntArray203 = new int[local55];
		this.anIntArray205 = new int[local55];
		this.anIntArray198 = new int[local59];
		this.anIntArray195 = new int[local59];
		this.anIntArray201 = new int[local59];
		if (local63 > 0) {
			this.anIntArray199 = new int[local63];
			this.anIntArray197 = new int[local63];
			this.anIntArray200 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray206 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray11 = new byte[local59];
			this.aByteArray14 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray13 = new byte[local59];
		} else {
			this.aByte1 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray12 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray194 = new int[local59];
		}
		this.aShortArray8 = new short[local59];
		local25.anInt2574 = local101;
		local30.anInt2574 = local182;
		local35.anInt2574 = local188;
		local40.anInt2574 = local107;
		local45.anInt2574 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1837();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1834();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1834();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1834();
			}
			this.anIntArray202[local316] = local310 + local323;
			this.anIntArray203[local316] = local312 + local333;
			this.anIntArray205[local316] = local314 + local343;
			local310 = this.anIntArray202[local316];
			local312 = this.anIntArray203[local316];
			local314 = this.anIntArray205[local316];
			if (local83 == 1) {
				this.anIntArray206[local316] = local45.method1837();
			}
		}
		local25.anInt2574 = local166;
		local30.anInt2574 = local133;
		local35.anInt2574 = local115;
		local40.anInt2574 = local151;
		local45.anInt2574 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray8[local321] = (short) local25.method1842();
			if (local67 == 1) {
				local323 = local30.method1837();
				if ((local323 & 0x1) == 1) {
					this.aByteArray11[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray11[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray14[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray14[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray13[local321] = local35.method1824();
			}
			if (local75 == 1) {
				this.aByteArray12[local321] = local40.method1824();
			}
			if (local79 == 1) {
				this.anIntArray194[local321] = local45.method1837();
			}
		}
		local25.anInt2574 = local160;
		local30.anInt2574 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1837();
			if (local528 == 1) {
				local323 = local25.method1834() + local521;
				local333 = local25.method1834() + local323;
				local343 = local25.method1834() + local333;
				local521 = local343;
				this.anIntArray198[local523] = local323;
				this.anIntArray195[local523] = local333;
				this.anIntArray201[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1834() + local521;
				local521 = local343;
				this.anIntArray198[local523] = local323;
				this.anIntArray195[local523] = local333;
				this.anIntArray201[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1834() + local521;
				local521 = local343;
				this.anIntArray198[local523] = local323;
				this.anIntArray195[local523] = local333;
				this.anIntArray201[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1834() + local521;
				local521 = local343;
				this.anIntArray198[local523] = local323;
				this.anIntArray195[local523] = local631;
				this.anIntArray201[local523] = local343;
			}
		}
		local25.anInt2574 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray199[local528] = local25.method1842();
			this.anIntArray197[local528] = local25.method1842();
			this.anIntArray200[local528] = local25.method1842();
		}
		if (!local18) {
			this.aByteArray14 = null;
		}
		if (!local20) {
			this.aByteArray11 = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([Lclient!kc;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class1_Sub1_Sub2_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt1334 = 0;
		this.anInt1336 = 0;
		this.anInt1340 = 0;
		this.aByte1 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class1_Sub1_Sub2_Sub3 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt1334 += local45.anInt1334;
				this.anInt1336 += local45.anInt1336;
				this.anInt1340 += local45.anInt1340;
				if (local45.aByteArray13 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local45.aByte1;
					}
					if (this.aByte1 != local45.aByte1) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray11 != null;
				local22 |= local45.aByteArray12 != null;
				local24 |= local45.anIntArray194 != null;
				local26 |= local45.aByteArray14 != null;
			}
		}
		this.anIntArray202 = new int[this.anInt1334];
		this.anIntArray203 = new int[this.anInt1334];
		this.anIntArray205 = new int[this.anInt1334];
		this.anIntArray206 = new int[this.anInt1334];
		this.anIntArray198 = new int[this.anInt1336];
		this.anIntArray195 = new int[this.anInt1336];
		this.anIntArray201 = new int[this.anInt1336];
		if (this.anInt1340 > 0) {
			this.anIntArray199 = new int[this.anInt1340];
			this.anIntArray197 = new int[this.anInt1340];
			this.anIntArray200 = new int[this.anInt1340];
		}
		if (local18) {
			this.aByteArray11 = new byte[this.anInt1336];
		}
		if (local20) {
			this.aByteArray13 = new byte[this.anInt1336];
		}
		if (local22) {
			this.aByteArray12 = new byte[this.anInt1336];
		}
		if (local26) {
			this.aByteArray14 = new byte[this.anInt1336];
		}
		if (local24) {
			this.anIntArray194 = new int[this.anInt1336];
		}
		this.aShortArray8 = new short[this.anInt1336];
		this.anInt1334 = 0;
		this.anInt1336 = 0;
		this.anInt1340 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class1_Sub1_Sub2_Sub3 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt1336; local244++) {
					if (local18 && local240.aByteArray11 != null) {
						this.aByteArray11[this.anInt1336] = local240.aByteArray11[local244];
					}
					if (local20) {
						if (local240.aByteArray13 == null) {
							this.aByteArray13[this.anInt1336] = local240.aByte1;
						} else {
							this.aByteArray13[this.anInt1336] = local240.aByteArray13[local244];
						}
					}
					if (local22 && local240.aByteArray12 != null) {
						this.aByteArray12[this.anInt1336] = local240.aByteArray12[local244];
					}
					if (local26) {
						if (local240.aByteArray14 == null || local240.aByteArray14[local244] == -1) {
							this.aByteArray14[this.anInt1336] = -1;
						} else {
							this.aByteArray14[this.anInt1336] = (byte) (local240.aByteArray14[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray194 != null) {
						this.anIntArray194[this.anInt1336] = local240.anIntArray194[local244];
					}
					this.aShortArray8[this.anInt1336] = local240.aShortArray8[local244];
					this.anIntArray198[this.anInt1336] = this.method1015(local240, local240.anIntArray198[local244]);
					this.anIntArray195[this.anInt1336] = this.method1015(local240, local240.anIntArray195[local244]);
					this.anIntArray201[this.anInt1336] = this.method1015(local240, local240.anIntArray201[local244]);
					this.anInt1336++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt1340; local397++) {
					this.anIntArray199[this.anInt1340] = this.method1015(local240, local240.anIntArray199[local397]);
					this.anIntArray197[this.anInt1340] = this.method1015(local240, local240.anIntArray197[local397]);
					this.anIntArray200[this.anInt1340] = this.method1015(local240, local240.anIntArray200[local397]);
					this.anInt1340++;
				}
				local233 += local240.anInt1340;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!kc;ZZZ)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1334 = arg0.anInt1334;
		this.anInt1336 = arg0.anInt1336;
		this.anInt1340 = arg0.anInt1340;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray202 = arg0.anIntArray202;
			this.anIntArray203 = arg0.anIntArray203;
			this.anIntArray205 = arg0.anIntArray205;
		} else {
			this.anIntArray202 = new int[this.anInt1334];
			this.anIntArray203 = new int[this.anInt1334];
			this.anIntArray205 = new int[this.anInt1334];
			for (local60 = 0; local60 < this.anInt1334; local60++) {
				this.anIntArray202[local60] = arg0.anIntArray202[local60];
				this.anIntArray203[local60] = arg0.anIntArray203[local60];
				this.anIntArray205[local60] = arg0.anIntArray205[local60];
			}
		}
		if (arg2) {
			this.aShortArray8 = arg0.aShortArray8;
		} else {
			this.aShortArray8 = new short[this.anInt1336];
			for (local60 = 0; local60 < this.anInt1336; local60++) {
				this.aShortArray8[local60] = arg0.aShortArray8[local60];
			}
		}
		this.aByteArray12 = arg0.aByteArray12;
		this.anIntArray198 = arg0.anIntArray198;
		this.anIntArray195 = arg0.anIntArray195;
		this.anIntArray201 = arg0.anIntArray201;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByte1 = arg0.aByte1;
		this.anIntArray199 = arg0.anIntArray199;
		this.anIntArray197 = arg0.anIntArray197;
		this.anIntArray200 = arg0.anIntArray200;
		this.anIntArray206 = arg0.anIntArray206;
		this.anIntArray194 = arg0.anIntArray194;
		this.anIntArrayArray13 = arg0.anIntArrayArray13;
		this.anIntArrayArray14 = arg0.anIntArrayArray14;
		this.aClass3Array1 = arg0.aClass3Array1;
		this.aClass35Array1 = arg0.aClass35Array1;
		this.aClass3Array2 = arg0.aClass3Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	private void method996() {
		this.aClass3Array1 = null;
		this.aClass3Array2 = null;
		this.aClass35Array1 = null;
		this.aBoolean75 = false;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	public void method997() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1334; local1++) {
			@Pc(7) int local7 = this.anIntArray202[local1];
			this.anIntArray202[local1] = this.anIntArray205[local1];
			this.anIntArray205[local1] = -local7;
		}
		this.method996();
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method1001() {
		@Pc(3) Class1_Sub1_Sub2_Sub3 local3 = new Class1_Sub1_Sub2_Sub3();
		if (this.aByteArray11 != null) {
			local3.aByteArray11 = new byte[this.anInt1336];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1336; local13++) {
				local3.aByteArray11[local13] = this.aByteArray11[local13];
			}
		}
		local3.anInt1334 = this.anInt1334;
		local3.anInt1336 = this.anInt1336;
		local3.anInt1340 = this.anInt1340;
		local3.anIntArray202 = this.anIntArray202;
		local3.anIntArray203 = this.anIntArray203;
		local3.anIntArray205 = this.anIntArray205;
		local3.anIntArray198 = this.anIntArray198;
		local3.anIntArray195 = this.anIntArray195;
		local3.anIntArray201 = this.anIntArray201;
		local3.aByteArray13 = this.aByteArray13;
		local3.aByteArray12 = this.aByteArray12;
		local3.aByteArray14 = this.aByteArray14;
		local3.aShortArray8 = this.aShortArray8;
		local3.aByte1 = this.aByte1;
		local3.anIntArray199 = this.anIntArray199;
		local3.anIntArray197 = this.anIntArray197;
		local3.anIntArray200 = this.anIntArray200;
		local3.anIntArray206 = this.anIntArray206;
		local3.anIntArray194 = this.anIntArray194;
		local3.anIntArrayArray13 = this.anIntArrayArray13;
		local3.anIntArrayArray14 = this.anIntArrayArray14;
		local3.aClass3Array1 = this.aClass3Array1;
		local3.aClass35Array1 = this.aClass35Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1005();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class1_Sub1_Sub2_Sub7 local26 = new Class1_Sub1_Sub2_Sub7();
		local26.anIntArray394 = new int[this.anInt1336];
		local26.anIntArray400 = new int[this.anInt1336];
		local26.anIntArray393 = new int[this.anInt1336];
		for (@Pc(43) int local43 = 0; local43 < this.anInt1336; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray11 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray11[local43];
			}
			@Pc(92) Class3 local92;
			@Pc(123) int local123;
			@Pc(253) Class35 local253;
			if (this.aByteArray14 == null || this.aByteArray14[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray8[local43] & 0xFFFF;
					if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray198[local43]] == null) {
						local92 = this.aClass3Array1[this.anIntArray198[local43]];
					} else {
						local92 = this.aClass3Array2[this.anIntArray198[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt72 + arg3 * local92.anInt78 + arg4 * local92.anInt74) / (local22 * local92.anInt73);
					local26.anIntArray394[local43] = Static59.method998(local73, local123);
					if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray195[local43]] == null) {
						local92 = this.aClass3Array1[this.anIntArray195[local43]];
					} else {
						local92 = this.aClass3Array2[this.anIntArray195[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt72 + arg3 * local92.anInt78 + arg4 * local92.anInt74) / (local22 * local92.anInt73);
					local26.anIntArray400[local43] = Static59.method998(local73, local123);
					if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray201[local43]] == null) {
						local92 = this.aClass3Array1[this.anIntArray201[local43]];
					} else {
						local92 = this.aClass3Array2[this.anIntArray201[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt72 + arg3 * local92.anInt78 + arg4 * local92.anInt74) / (local22 * local92.anInt73);
					local26.anIntArray393[local43] = Static59.method998(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass35Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt1161 + arg3 * local253.anInt1164 + arg4 * local253.anInt1158) / (local22 + local22 / 2);
					local26.anIntArray394[local43] = Static59.method998(this.aShortArray8[local43] & 0xFFFF, local123);
					local26.anIntArray393[local43] = -1;
				} else {
					local26.anIntArray393[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray198[local43]] == null) {
					local92 = this.aClass3Array1[this.anIntArray198[local43]];
				} else {
					local92 = this.aClass3Array2[this.anIntArray198[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt72 + arg3 * local92.anInt78 + arg4 * local92.anInt74) / (local22 * local92.anInt73);
				local26.anIntArray394[local43] = Static59.method999(local123);
				if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray195[local43]] == null) {
					local92 = this.aClass3Array1[this.anIntArray195[local43]];
				} else {
					local92 = this.aClass3Array2[this.anIntArray195[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt72 + arg3 * local92.anInt78 + arg4 * local92.anInt74) / (local22 * local92.anInt73);
				local26.anIntArray400[local43] = Static59.method999(local123);
				if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray201[local43]] == null) {
					local92 = this.aClass3Array1[this.anIntArray201[local43]];
				} else {
					local92 = this.aClass3Array2[this.anIntArray201[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt72 + arg3 * local92.anInt78 + arg4 * local92.anInt74) / (local22 * local92.anInt73);
				local26.anIntArray393[local43] = Static59.method999(local123);
			} else if (local49 == 1) {
				local253 = this.aClass35Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt1161 + arg3 * local253.anInt1164 + arg4 * local253.anInt1158) / (local22 + local22 / 2);
				local26.anIntArray394[local43] = Static59.method999(local123);
				local26.anIntArray393[local43] = -1;
			} else {
				local26.anIntArray393[local43] = -2;
			}
		}
		this.method1003();
		local26.anInt2685 = this.anInt1334;
		local26.anIntArray399 = this.anIntArray202;
		local26.anIntArray392 = this.anIntArray203;
		local26.anIntArray397 = this.anIntArray205;
		local26.anInt2681 = this.anInt1336;
		local26.anIntArray396 = this.anIntArray198;
		local26.anIntArray390 = this.anIntArray195;
		local26.anIntArray391 = this.anIntArray201;
		local26.aByteArray28 = this.aByteArray13;
		local26.aByteArray30 = this.aByteArray12;
		local26.aByteArray31 = this.aByteArray14;
		if (local26.aByteArray31 == null) {
			local26.aShortArray11 = null;
		} else {
			local26.aShortArray11 = this.aShortArray8;
		}
		local26.aByte5 = this.aByte1;
		local26.anInt2680 = this.anInt1340;
		local26.anIntArray398 = this.anIntArray199;
		local26.anIntArray395 = this.anIntArray197;
		local26.anIntArray411 = this.anIntArray200;
		local26.anIntArrayArray34 = this.anIntArrayArray13;
		local26.anIntArrayArray37 = this.anIntArrayArray14;
		return local26;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
	private void method1003() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray206 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1334; local9++) {
				local15 = this.anIntArray206[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray13 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray13[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1334) {
				local65 = this.anIntArray206[local59];
				this.anIntArrayArray13[local65][local5[local65]++] = local59++;
			}
			this.anIntArray206 = null;
		}
		if (this.anIntArray194 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1336; local9++) {
			local15 = this.anIntArray194[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray14 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray14[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1336) {
			local65 = this.anIntArray194[local59];
			this.anIntArrayArray14[local65][local5[local65]++] = local59++;
		}
		this.anIntArray194 = null;
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "()V")
	public void method1004() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1334; local1++) {
			this.anIntArray202[local1] = -this.anIntArray202[local1];
			this.anIntArray205[local1] = -this.anIntArray205[local1];
		}
		this.method996();
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "()V")
	public void method1005() {
		if (this.aClass3Array1 != null) {
			return;
		}
		this.aClass3Array1 = new Class3[this.anInt1334];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1334; local10++) {
			this.aClass3Array1[local10] = new Class3();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1336; local25++) {
			@Pc(31) int local31 = this.anIntArray198[local25];
			@Pc(36) int local36 = this.anIntArray195[local25];
			@Pc(41) int local41 = this.anIntArray201[local25];
			@Pc(51) int local51 = this.anIntArray202[local36] - this.anIntArray202[local31];
			@Pc(61) int local61 = this.anIntArray203[local36] - this.anIntArray203[local31];
			@Pc(71) int local71 = this.anIntArray205[local36] - this.anIntArray205[local31];
			@Pc(81) int local81 = this.anIntArray202[local41] - this.anIntArray202[local31];
			@Pc(91) int local91 = this.anIntArray203[local41] - this.anIntArray203[local31];
			@Pc(101) int local101 = this.anIntArray205[local41] - this.anIntArray205[local31];
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
			if (this.aByteArray11 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray11[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class3 local211 = this.aClass3Array1[local31];
				local211.anInt72 += local109;
				local211.anInt78 += local117;
				local211.anInt74 += local125;
				local211.anInt73++;
				@Pc(240) Class3 local240 = this.aClass3Array1[local36];
				local240.anInt72 += local109;
				local240.anInt78 += local117;
				local240.anInt74 += local125;
				local240.anInt73++;
				@Pc(269) Class3 local269 = this.aClass3Array1[local41];
				local269.anInt72 += local109;
				local269.anInt78 += local117;
				local269.anInt74 += local125;
				local269.anInt73++;
			} else if (local198 == 1) {
				if (this.aClass35Array1 == null) {
					this.aClass35Array1 = new Class35[this.anInt1336];
				}
				@Pc(314) Class35 local314 = this.aClass35Array1[local25] = new Class35();
				local314.anInt1161 = local109;
				local314.anInt1164 = local117;
				local314.anInt1158 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "()V")
	public void method1006() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1334; local1++) {
			this.anIntArray205[local1] = -this.anIntArray205[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1336; local18++) {
			@Pc(24) int local24 = this.anIntArray198[local18];
			this.anIntArray198[local18] = this.anIntArray201[local18];
			this.anIntArray201[local18] = local24;
		}
		this.method996();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public void method1008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1334; local1++) {
			this.anIntArray202[local1] = this.anIntArray202[local1] * arg0 / 128;
			this.anIntArray203[local1] = this.anIntArray203[local1] * arg1 / 128;
			this.anIntArray205[local1] = this.anIntArray205[local1] * arg2 / 128;
		}
		this.method996();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V")
	public void method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1334; local1++) {
			this.anIntArray202[local1] += arg0;
			this.anIntArray203[local1] += arg1;
			this.anIntArray205[local1] += arg2;
		}
		this.method996();
	}

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "()V")
	public void method1011() {
		if (this.aBoolean75) {
			return;
		}
		super.anInt2678 = 0;
		this.anInt1341 = 0;
		this.anInt1339 = 999999;
		this.anInt1338 = -999999;
		this.anInt1337 = -99999;
		this.anInt1335 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1334; local23++) {
			@Pc(29) int local29 = this.anIntArray202[local23];
			@Pc(34) int local34 = this.anIntArray203[local23];
			@Pc(39) int local39 = this.anIntArray205[local23];
			if (local29 < this.anInt1339) {
				this.anInt1339 = local29;
			}
			if (local29 > this.anInt1338) {
				this.anInt1338 = local29;
			}
			if (local39 < this.anInt1335) {
				this.anInt1335 = local39;
			}
			if (local39 > this.anInt1337) {
				this.anInt1337 = local39;
			}
			if (-local34 > super.anInt2678) {
				super.anInt2678 = -local34;
			}
			if (local34 > this.anInt1341) {
				this.anInt1341 = local34;
			}
		}
		this.aBoolean75 = true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZ)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method1012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub1_Sub2_Sub3 local16 = new Class1_Sub1_Sub2_Sub3();
		local16.anInt1334 = this.anInt1334;
		local16.anInt1336 = this.anInt1336;
		local16.anInt1340 = this.anInt1340;
		local16.anIntArray202 = this.anIntArray202;
		local16.anIntArray205 = this.anIntArray205;
		local16.anIntArray198 = this.anIntArray198;
		local16.anIntArray195 = this.anIntArray195;
		local16.anIntArray201 = this.anIntArray201;
		local16.aByteArray11 = this.aByteArray11;
		local16.aByteArray13 = this.aByteArray13;
		local16.aByteArray12 = this.aByteArray12;
		local16.aByteArray14 = this.aByteArray14;
		local16.aShortArray8 = this.aShortArray8;
		local16.aByte1 = this.aByte1;
		local16.anIntArray199 = this.anIntArray199;
		local16.anIntArray197 = this.anIntArray197;
		local16.anIntArray200 = this.anIntArray200;
		local16.anIntArray206 = this.anIntArray206;
		local16.anIntArray194 = this.anIntArray194;
		local16.anIntArrayArray13 = this.anIntArrayArray13;
		local16.anIntArrayArray14 = this.anIntArrayArray14;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray203 = new int[local16.anInt1334];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt1334; local128++) {
			@Pc(134) int local134 = this.anIntArray202[local128];
			@Pc(139) int local139 = this.anIntArray203[local128];
			@Pc(144) int local144 = this.anIntArray205[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray203[local128] = local139 + local180 - local126;
		}
		local16.method996();
		return local16;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(SS)V")
	public void method1013(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1336; local1++) {
			if (this.aShortArray8[local1] == arg0) {
				this.aShortArray8[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "()V")
	public void method1014() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1334; local1++) {
			@Pc(7) int local7 = this.anIntArray205[local1];
			this.anIntArray205[local1] = this.anIntArray202[local1];
			this.anIntArray202[local1] = -local7;
		}
		this.method996();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!kc;I)I")
	private int method1015(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray202[arg1];
		@Pc(11) int local11 = arg0.anIntArray203[arg1];
		@Pc(16) int local16 = arg0.anIntArray205[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1334; local18++) {
			if (local6 == this.anIntArray202[local18] && local11 == this.anIntArray203[local18] && local16 == this.anIntArray205[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray202[this.anInt1334] = local6;
			this.anIntArray203[this.anInt1334] = local11;
			this.anIntArray205[this.anInt1334] = local16;
			if (arg0.anIntArray206 != null) {
				this.anIntArray206[this.anInt1334] = arg0.anIntArray206[arg1];
			}
			local1 = this.anInt1334++;
		}
		return local1;
	}
}
