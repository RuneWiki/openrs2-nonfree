import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class3_Sub1_Sub5_Sub2 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!fe", name = "ub", descriptor = "[I")
	public static int[] anIntArray116 = new int[128];

	@OriginalMember(owner = "client!fe", name = "pb", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!fe", name = "qb", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!fe", name = "rb", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!fe", name = "sb", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!fe", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!fe", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!fe", name = "wb", descriptor = "I")
	public int anInt1116;

	@OriginalMember(owner = "client!fe", name = "zb", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!fe", name = "Ab", descriptor = "I")
	public int anInt1119;

	@OriginalMember(owner = "client!fe", name = "Cb", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!fe", name = "Db", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!fe", name = "Eb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!fe", name = "Fb", descriptor = "[Lclient!bd;")
	public Class8[] aClass8Array1;

	@OriginalMember(owner = "client!fe", name = "Gb", descriptor = "[Lclient!bd;")
	public Class8[] aClass8Array2;

	@OriginalMember(owner = "client!fe", name = "Hb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!fe", name = "Ib", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!fe", name = "Kb", descriptor = "[Lclient!pa;")
	private Class54[] aClass54Array1;

	@OriginalMember(owner = "client!fe", name = "Mb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!fe", name = "Ob", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!fe", name = "Pb", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!fe", name = "Rb", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!fe", name = "Sb", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!fe", name = "Tb", descriptor = "I")
	public int anInt1122;

	@OriginalMember(owner = "client!fe", name = "Ub", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!fe", name = "Wb", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!fe", name = "Xb", descriptor = "I")
	public int anInt1124;

	@OriginalMember(owner = "client!fe", name = "Yb", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!fe", name = "Zb", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!fe", name = "Lb", descriptor = "I")
	private int anInt1120 = 0;

	@OriginalMember(owner = "client!fe", name = "Bb", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!fe", name = "Nb", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!fe", name = "xb", descriptor = "I")
	public int anInt1117 = 0;

	@OriginalMember(owner = "client!fe", name = "Vb", descriptor = "I")
	public int anInt1123 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray116[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray116[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray116[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray116[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray116[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	private Class3_Sub1_Sub5_Sub2() {
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub5_Sub2(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class3_Sub11 local25 = new Class3_Sub11(arg0);
		@Pc(30) Class3_Sub11 local30 = new Class3_Sub11(arg0);
		@Pc(35) Class3_Sub11 local35 = new Class3_Sub11(arg0);
		@Pc(40) Class3_Sub11 local40 = new Class3_Sub11(arg0);
		@Pc(45) Class3_Sub11 local45 = new Class3_Sub11(arg0);
		local25.anInt1562 = arg0.length - 18;
		@Pc(55) int local55 = local25.method974();
		@Pc(59) int local59 = local25.method974();
		@Pc(63) int local63 = local25.method981();
		@Pc(67) int local67 = local25.method981();
		@Pc(71) int local71 = local25.method981();
		@Pc(75) int local75 = local25.method981();
		@Pc(79) int local79 = local25.method981();
		@Pc(83) int local83 = local25.method981();
		@Pc(87) int local87 = local25.method974();
		@Pc(91) int local91 = local25.method974();
		@Pc(95) int local95 = local25.method974();
		@Pc(99) int local99 = local25.method974();
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
		this.anInt1123 = local55;
		this.anInt1117 = local59;
		this.anInt1120 = local63;
		this.anIntArray125 = new int[local55];
		this.anIntArray119 = new int[local55];
		this.anIntArray118 = new int[local55];
		this.anIntArray128 = new int[local59];
		this.anIntArray121 = new int[local59];
		this.anIntArray124 = new int[local59];
		if (local63 > 0) {
			this.anIntArray122 = new int[local63];
			this.anIntArray126 = new int[local63];
			this.anIntArray115 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray123 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray6 = new byte[local59];
			this.aByteArray4 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray3 = new byte[local59];
		} else {
			this.aByte2 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray5 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray127 = new int[local59];
		}
		this.aShortArray9 = new short[local59];
		local25.anInt1562 = local101;
		local30.anInt1562 = local182;
		local35.anInt1562 = local188;
		local40.anInt1562 = local107;
		local45.anInt1562 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method981();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1025();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1025();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1025();
			}
			this.anIntArray125[local316] = local310 + local323;
			this.anIntArray119[local316] = local312 + local333;
			this.anIntArray118[local316] = local314 + local343;
			local310 = this.anIntArray125[local316];
			local312 = this.anIntArray119[local316];
			local314 = this.anIntArray118[local316];
			if (local83 == 1) {
				this.anIntArray123[local316] = local45.method981();
			}
		}
		local25.anInt1562 = local166;
		local30.anInt1562 = local133;
		local35.anInt1562 = local115;
		local40.anInt1562 = local151;
		local45.anInt1562 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray9[local321] = (short) local25.method974();
			if (local67 == 1) {
				local323 = local30.method981();
				if ((local323 & 0x1) == 1) {
					this.aByteArray6[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray6[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray4[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray4[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray3[local321] = local35.method994();
			}
			if (local75 == 1) {
				this.aByteArray5[local321] = local40.method994();
			}
			if (local79 == 1) {
				this.anIntArray127[local321] = local45.method981();
			}
		}
		local25.anInt1562 = local160;
		local30.anInt1562 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method981();
			if (local528 == 1) {
				local323 = local25.method1025() + local521;
				local333 = local25.method1025() + local323;
				local343 = local25.method1025() + local333;
				local521 = local343;
				this.anIntArray128[local523] = local323;
				this.anIntArray121[local523] = local333;
				this.anIntArray124[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1025() + local521;
				local521 = local343;
				this.anIntArray128[local523] = local323;
				this.anIntArray121[local523] = local333;
				this.anIntArray124[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1025() + local521;
				local521 = local343;
				this.anIntArray128[local523] = local323;
				this.anIntArray121[local523] = local333;
				this.anIntArray124[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1025() + local521;
				local521 = local343;
				this.anIntArray128[local523] = local323;
				this.anIntArray121[local523] = local631;
				this.anIntArray124[local523] = local343;
			}
		}
		local25.anInt1562 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray122[local528] = local25.method974();
			this.anIntArray126[local528] = local25.method974();
			this.anIntArray115[local528] = local25.method974();
		}
		if (!local18) {
			this.aByteArray4 = null;
		}
		if (!local20) {
			this.aByteArray6 = null;
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([Lclient!fe;I)V")
	public Class3_Sub1_Sub5_Sub2(@OriginalArg(0) Class3_Sub1_Sub5_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt1123 = 0;
		this.anInt1117 = 0;
		this.anInt1120 = 0;
		this.aByte2 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class3_Sub1_Sub5_Sub2 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt1123 += local45.anInt1123;
				this.anInt1117 += local45.anInt1117;
				this.anInt1120 += local45.anInt1120;
				if (local45.aByteArray3 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local45.aByte2;
					}
					if (this.aByte2 != local45.aByte2) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray6 != null;
				local22 |= local45.aByteArray5 != null;
				local24 |= local45.anIntArray127 != null;
				local26 |= local45.aByteArray4 != null;
			}
		}
		this.anIntArray125 = new int[this.anInt1123];
		this.anIntArray119 = new int[this.anInt1123];
		this.anIntArray118 = new int[this.anInt1123];
		this.anIntArray123 = new int[this.anInt1123];
		this.anIntArray128 = new int[this.anInt1117];
		this.anIntArray121 = new int[this.anInt1117];
		this.anIntArray124 = new int[this.anInt1117];
		if (this.anInt1120 > 0) {
			this.anIntArray122 = new int[this.anInt1120];
			this.anIntArray126 = new int[this.anInt1120];
			this.anIntArray115 = new int[this.anInt1120];
		}
		if (local18) {
			this.aByteArray6 = new byte[this.anInt1117];
		}
		if (local20) {
			this.aByteArray3 = new byte[this.anInt1117];
		}
		if (local22) {
			this.aByteArray5 = new byte[this.anInt1117];
		}
		if (local26) {
			this.aByteArray4 = new byte[this.anInt1117];
		}
		if (local24) {
			this.anIntArray127 = new int[this.anInt1117];
		}
		this.aShortArray9 = new short[this.anInt1117];
		this.anInt1123 = 0;
		this.anInt1117 = 0;
		this.anInt1120 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class3_Sub1_Sub5_Sub2 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt1117; local244++) {
					if (local18 && local240.aByteArray6 != null) {
						this.aByteArray6[this.anInt1117] = local240.aByteArray6[local244];
					}
					if (local20) {
						if (local240.aByteArray3 == null) {
							this.aByteArray3[this.anInt1117] = local240.aByte2;
						} else {
							this.aByteArray3[this.anInt1117] = local240.aByteArray3[local244];
						}
					}
					if (local22 && local240.aByteArray5 != null) {
						this.aByteArray5[this.anInt1117] = local240.aByteArray5[local244];
					}
					if (local26) {
						if (local240.aByteArray4 == null || local240.aByteArray4[local244] == -1) {
							this.aByteArray4[this.anInt1117] = -1;
						} else {
							this.aByteArray4[this.anInt1117] = (byte) (local240.aByteArray4[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray127 != null) {
						this.anIntArray127[this.anInt1117] = local240.anIntArray127[local244];
					}
					this.aShortArray9[this.anInt1117] = local240.aShortArray9[local244];
					this.anIntArray128[this.anInt1117] = this.method675(local240, local240.anIntArray128[local244]);
					this.anIntArray121[this.anInt1117] = this.method675(local240, local240.anIntArray121[local244]);
					this.anIntArray124[this.anInt1117] = this.method675(local240, local240.anIntArray124[local244]);
					this.anInt1117++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt1120; local397++) {
					this.anIntArray122[this.anInt1120] = this.method675(local240, local240.anIntArray122[local397]);
					this.anIntArray126[this.anInt1120] = this.method675(local240, local240.anIntArray126[local397]);
					this.anIntArray115[this.anInt1120] = this.method675(local240, local240.anIntArray115[local397]);
					this.anInt1120++;
				}
				local233 += local240.anInt1120;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!fe;ZZZ)V")
	public Class3_Sub1_Sub5_Sub2(@OriginalArg(0) Class3_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1123 = arg0.anInt1123;
		this.anInt1117 = arg0.anInt1117;
		this.anInt1120 = arg0.anInt1120;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray125 = arg0.anIntArray125;
			this.anIntArray119 = arg0.anIntArray119;
			this.anIntArray118 = arg0.anIntArray118;
		} else {
			this.anIntArray125 = new int[this.anInt1123];
			this.anIntArray119 = new int[this.anInt1123];
			this.anIntArray118 = new int[this.anInt1123];
			for (local60 = 0; local60 < this.anInt1123; local60++) {
				this.anIntArray125[local60] = arg0.anIntArray125[local60];
				this.anIntArray119[local60] = arg0.anIntArray119[local60];
				this.anIntArray118[local60] = arg0.anIntArray118[local60];
			}
		}
		if (arg2) {
			this.aShortArray9 = arg0.aShortArray9;
		} else {
			this.aShortArray9 = new short[this.anInt1117];
			for (local60 = 0; local60 < this.anInt1117; local60++) {
				this.aShortArray9[local60] = arg0.aShortArray9[local60];
			}
		}
		this.aByteArray5 = arg0.aByteArray5;
		this.anIntArray128 = arg0.anIntArray128;
		this.anIntArray121 = arg0.anIntArray121;
		this.anIntArray124 = arg0.anIntArray124;
		this.aByteArray6 = arg0.aByteArray6;
		this.aByteArray3 = arg0.aByteArray3;
		this.aByteArray4 = arg0.aByteArray4;
		this.aByte2 = arg0.aByte2;
		this.anIntArray122 = arg0.anIntArray122;
		this.anIntArray126 = arg0.anIntArray126;
		this.anIntArray115 = arg0.anIntArray115;
		this.anIntArray123 = arg0.anIntArray123;
		this.anIntArray127 = arg0.anIntArray127;
		this.anIntArrayArray11 = arg0.anIntArrayArray11;
		this.anIntArrayArray10 = arg0.anIntArrayArray10;
		this.aClass8Array1 = arg0.aClass8Array1;
		this.aClass54Array1 = arg0.aClass54Array1;
		this.aClass8Array2 = arg0.aClass8Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public void method674() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1123; local1++) {
			this.anIntArray118[local1] = -this.anIntArray118[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1117; local18++) {
			@Pc(24) int local24 = this.anIntArray128[local18];
			this.anIntArray128[local18] = this.anIntArray124[local18];
			this.anIntArray124[local18] = local24;
		}
		this.method686();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!fe;I)I")
	private int method675(@OriginalArg(0) Class3_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray125[arg1];
		@Pc(11) int local11 = arg0.anIntArray119[arg1];
		@Pc(16) int local16 = arg0.anIntArray118[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1123; local18++) {
			if (local6 == this.anIntArray125[local18] && local11 == this.anIntArray119[local18] && local16 == this.anIntArray118[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray125[this.anInt1123] = local6;
			this.anIntArray119[this.anInt1123] = local11;
			this.anIntArray118[this.anInt1123] = local16;
			if (arg0.anIntArray123 != null) {
				this.anIntArray123[this.anInt1123] = arg0.anIntArray123[arg1];
			}
			local1 = this.anInt1123++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method677() {
		@Pc(3) Class3_Sub1_Sub5_Sub2 local3 = new Class3_Sub1_Sub5_Sub2();
		if (this.aByteArray6 != null) {
			local3.aByteArray6 = new byte[this.anInt1117];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1117; local13++) {
				local3.aByteArray6[local13] = this.aByteArray6[local13];
			}
		}
		local3.anInt1123 = this.anInt1123;
		local3.anInt1117 = this.anInt1117;
		local3.anInt1120 = this.anInt1120;
		local3.anIntArray125 = this.anIntArray125;
		local3.anIntArray119 = this.anIntArray119;
		local3.anIntArray118 = this.anIntArray118;
		local3.anIntArray128 = this.anIntArray128;
		local3.anIntArray121 = this.anIntArray121;
		local3.anIntArray124 = this.anIntArray124;
		local3.aByteArray3 = this.aByteArray3;
		local3.aByteArray5 = this.aByteArray5;
		local3.aByteArray4 = this.aByteArray4;
		local3.aShortArray9 = this.aShortArray9;
		local3.aByte2 = this.aByte2;
		local3.anIntArray122 = this.anIntArray122;
		local3.anIntArray126 = this.anIntArray126;
		local3.anIntArray115 = this.anIntArray115;
		local3.anIntArray123 = this.anIntArray123;
		local3.anIntArray127 = this.anIntArray127;
		local3.anIntArrayArray11 = this.anIntArrayArray11;
		local3.anIntArrayArray10 = this.anIntArrayArray10;
		local3.aClass8Array1 = this.aClass8Array1;
		local3.aClass54Array1 = this.aClass54Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	public void method678() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1123; local1++) {
			this.anIntArray125[local1] = -this.anIntArray125[local1];
			this.anIntArray118[local1] = -this.anIntArray118[local1];
		}
		this.method686();
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
	public void method680() {
		if (this.aBoolean62) {
			return;
		}
		super.anInt2680 = 0;
		this.anInt1116 = 0;
		this.anInt1119 = 999999;
		this.anInt1122 = -999999;
		this.anInt1124 = -99999;
		this.anInt1118 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1123; local23++) {
			@Pc(29) int local29 = this.anIntArray125[local23];
			@Pc(34) int local34 = this.anIntArray119[local23];
			@Pc(39) int local39 = this.anIntArray118[local23];
			if (local29 < this.anInt1119) {
				this.anInt1119 = local29;
			}
			if (local29 > this.anInt1122) {
				this.anInt1122 = local29;
			}
			if (local39 < this.anInt1118) {
				this.anInt1118 = local39;
			}
			if (local39 > this.anInt1124) {
				this.anInt1124 = local39;
			}
			if (-local34 > super.anInt2680) {
				super.anInt2680 = -local34;
			}
			if (local34 > this.anInt1116) {
				this.anInt1116 = local34;
			}
		}
		this.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIZ)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub5_Sub2 local16 = new Class3_Sub1_Sub5_Sub2();
		local16.anInt1123 = this.anInt1123;
		local16.anInt1117 = this.anInt1117;
		local16.anInt1120 = this.anInt1120;
		local16.anIntArray125 = this.anIntArray125;
		local16.anIntArray118 = this.anIntArray118;
		local16.anIntArray128 = this.anIntArray128;
		local16.anIntArray121 = this.anIntArray121;
		local16.anIntArray124 = this.anIntArray124;
		local16.aByteArray6 = this.aByteArray6;
		local16.aByteArray3 = this.aByteArray3;
		local16.aByteArray5 = this.aByteArray5;
		local16.aByteArray4 = this.aByteArray4;
		local16.aShortArray9 = this.aShortArray9;
		local16.aByte2 = this.aByte2;
		local16.anIntArray122 = this.anIntArray122;
		local16.anIntArray126 = this.anIntArray126;
		local16.anIntArray115 = this.anIntArray115;
		local16.anIntArray123 = this.anIntArray123;
		local16.anIntArray127 = this.anIntArray127;
		local16.anIntArrayArray11 = this.anIntArrayArray11;
		local16.anIntArrayArray10 = this.anIntArrayArray10;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray119 = new int[local16.anInt1123];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt1123; local128++) {
			@Pc(134) int local134 = this.anIntArray125[local128];
			@Pc(139) int local139 = this.anIntArray119[local128];
			@Pc(144) int local144 = this.anIntArray118[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray119[local128] = local139 + local180 - local126;
		}
		local16.method686();
		return local16;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "()V")
	public void method682() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1123; local1++) {
			@Pc(7) int local7 = this.anIntArray118[local1];
			this.anIntArray118[local1] = this.anIntArray125[local1];
			this.anIntArray125[local1] = -local7;
		}
		this.method686();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public void method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1123; local1++) {
			this.anIntArray125[local1] = this.anIntArray125[local1] * arg0 / 128;
			this.anIntArray119[local1] = this.anIntArray119[local1] * arg1 / 128;
			this.anIntArray118[local1] = this.anIntArray118[local1] * arg2 / 128;
		}
		this.method686();
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "()V")
	public void method685() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1123; local1++) {
			@Pc(7) int local7 = this.anIntArray125[local1];
			this.anIntArray125[local1] = this.anIntArray118[local1];
			this.anIntArray118[local1] = -local7;
		}
		this.method686();
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "()V")
	private void method686() {
		this.aClass8Array1 = null;
		this.aClass8Array2 = null;
		this.aClass54Array1 = null;
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public void method687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1123; local1++) {
			this.anIntArray125[local1] += arg0;
			this.anIntArray119[local1] += arg1;
			this.anIntArray118[local1] += arg2;
		}
		this.method686();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method691();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class3_Sub1_Sub5_Sub7 local26 = new Class3_Sub1_Sub5_Sub7();
		local26.anIntArray250 = new int[this.anInt1117];
		local26.anIntArray255 = new int[this.anInt1117];
		local26.anIntArray246 = new int[this.anInt1117];
		for (@Pc(43) int local43 = 0; local43 < this.anInt1117; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray6 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray6[local43];
			}
			@Pc(92) Class8 local92;
			@Pc(123) int local123;
			@Pc(253) Class54 local253;
			if (this.aByteArray4 == null || this.aByteArray4[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray9[local43] & 0xFFFF;
					if (this.aClass8Array2 == null || this.aClass8Array2[this.anIntArray128[local43]] == null) {
						local92 = this.aClass8Array1[this.anIntArray128[local43]];
					} else {
						local92 = this.aClass8Array2[this.anIntArray128[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt291 + arg3 * local92.anInt292 + arg4 * local92.anInt295) / (local22 * local92.anInt290);
					local26.anIntArray250[local43] = Static34.method689(local73, local123);
					if (this.aClass8Array2 == null || this.aClass8Array2[this.anIntArray121[local43]] == null) {
						local92 = this.aClass8Array1[this.anIntArray121[local43]];
					} else {
						local92 = this.aClass8Array2[this.anIntArray121[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt291 + arg3 * local92.anInt292 + arg4 * local92.anInt295) / (local22 * local92.anInt290);
					local26.anIntArray255[local43] = Static34.method689(local73, local123);
					if (this.aClass8Array2 == null || this.aClass8Array2[this.anIntArray124[local43]] == null) {
						local92 = this.aClass8Array1[this.anIntArray124[local43]];
					} else {
						local92 = this.aClass8Array2[this.anIntArray124[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt291 + arg3 * local92.anInt292 + arg4 * local92.anInt295) / (local22 * local92.anInt290);
					local26.anIntArray246[local43] = Static34.method689(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass54Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt2462 + arg3 * local253.anInt2461 + arg4 * local253.anInt2460) / (local22 + local22 / 2);
					local26.anIntArray250[local43] = Static34.method689(this.aShortArray9[local43] & 0xFFFF, local123);
					local26.anIntArray246[local43] = -1;
				} else {
					local26.anIntArray246[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass8Array2 == null || this.aClass8Array2[this.anIntArray128[local43]] == null) {
					local92 = this.aClass8Array1[this.anIntArray128[local43]];
				} else {
					local92 = this.aClass8Array2[this.anIntArray128[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt291 + arg3 * local92.anInt292 + arg4 * local92.anInt295) / (local22 * local92.anInt290);
				local26.anIntArray250[local43] = Static34.method684(local123);
				if (this.aClass8Array2 == null || this.aClass8Array2[this.anIntArray121[local43]] == null) {
					local92 = this.aClass8Array1[this.anIntArray121[local43]];
				} else {
					local92 = this.aClass8Array2[this.anIntArray121[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt291 + arg3 * local92.anInt292 + arg4 * local92.anInt295) / (local22 * local92.anInt290);
				local26.anIntArray255[local43] = Static34.method684(local123);
				if (this.aClass8Array2 == null || this.aClass8Array2[this.anIntArray124[local43]] == null) {
					local92 = this.aClass8Array1[this.anIntArray124[local43]];
				} else {
					local92 = this.aClass8Array2[this.anIntArray124[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt291 + arg3 * local92.anInt292 + arg4 * local92.anInt295) / (local22 * local92.anInt290);
				local26.anIntArray246[local43] = Static34.method684(local123);
			} else if (local49 == 1) {
				local253 = this.aClass54Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt2462 + arg3 * local253.anInt2461 + arg4 * local253.anInt2460) / (local22 + local22 / 2);
				local26.anIntArray250[local43] = Static34.method684(local123);
				local26.anIntArray246[local43] = -1;
			} else {
				local26.anIntArray246[local43] = -2;
			}
		}
		this.method690();
		local26.anInt2327 = this.anInt1123;
		local26.anIntArray270 = this.anIntArray125;
		local26.anIntArray248 = this.anIntArray119;
		local26.anIntArray247 = this.anIntArray118;
		local26.anInt2324 = this.anInt1117;
		local26.anIntArray252 = this.anIntArray128;
		local26.anIntArray249 = this.anIntArray121;
		local26.anIntArray251 = this.anIntArray124;
		local26.aByteArray27 = this.aByteArray3;
		local26.aByteArray25 = this.aByteArray5;
		local26.aByteArray24 = this.aByteArray4;
		if (local26.aByteArray24 == null) {
			local26.aShortArray18 = null;
		} else {
			local26.aShortArray18 = this.aShortArray9;
		}
		local26.aByte7 = this.aByte2;
		local26.anInt2326 = this.anInt1120;
		local26.anIntArray271 = this.anIntArray122;
		local26.anIntArray253 = this.anIntArray126;
		local26.anIntArray254 = this.anIntArray115;
		local26.anIntArrayArray21 = this.anIntArrayArray11;
		local26.anIntArrayArray23 = this.anIntArrayArray10;
		return local26;
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "()V")
	private void method690() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray123 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1123; local9++) {
				local15 = this.anIntArray123[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray11 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray11[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1123) {
				local65 = this.anIntArray123[local59];
				this.anIntArrayArray11[local65][local5[local65]++] = local59++;
			}
			this.anIntArray123 = null;
		}
		if (this.anIntArray127 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1117; local9++) {
			local15 = this.anIntArray127[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray10 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray10[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1117) {
			local65 = this.anIntArray127[local59];
			this.anIntArrayArray10[local65][local5[local65]++] = local59++;
		}
		this.anIntArray127 = null;
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "()V")
	public void method691() {
		if (this.aClass8Array1 != null) {
			return;
		}
		this.aClass8Array1 = new Class8[this.anInt1123];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1123; local10++) {
			this.aClass8Array1[local10] = new Class8();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1117; local25++) {
			@Pc(31) int local31 = this.anIntArray128[local25];
			@Pc(36) int local36 = this.anIntArray121[local25];
			@Pc(41) int local41 = this.anIntArray124[local25];
			@Pc(51) int local51 = this.anIntArray125[local36] - this.anIntArray125[local31];
			@Pc(61) int local61 = this.anIntArray119[local36] - this.anIntArray119[local31];
			@Pc(71) int local71 = this.anIntArray118[local36] - this.anIntArray118[local31];
			@Pc(81) int local81 = this.anIntArray125[local41] - this.anIntArray125[local31];
			@Pc(91) int local91 = this.anIntArray119[local41] - this.anIntArray119[local31];
			@Pc(101) int local101 = this.anIntArray118[local41] - this.anIntArray118[local31];
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
			if (this.aByteArray6 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray6[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class8 local211 = this.aClass8Array1[local31];
				local211.anInt291 += local109;
				local211.anInt292 += local117;
				local211.anInt295 += local125;
				local211.anInt290++;
				@Pc(240) Class8 local240 = this.aClass8Array1[local36];
				local240.anInt291 += local109;
				local240.anInt292 += local117;
				local240.anInt295 += local125;
				local240.anInt290++;
				@Pc(269) Class8 local269 = this.aClass8Array1[local41];
				local269.anInt291 += local109;
				local269.anInt292 += local117;
				local269.anInt295 += local125;
				local269.anInt290++;
			} else if (local198 == 1) {
				if (this.aClass54Array1 == null) {
					this.aClass54Array1 = new Class54[this.anInt1117];
				}
				@Pc(314) Class54 local314 = this.aClass54Array1[local25] = new Class54();
				local314.anInt2462 = local109;
				local314.anInt2461 = local117;
				local314.anInt2460 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(SS)V")
	public void method693(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1117; local1++) {
			if (this.aShortArray9[local1] == arg0) {
				this.aShortArray9[local1] = arg1;
			}
		}
	}
}
