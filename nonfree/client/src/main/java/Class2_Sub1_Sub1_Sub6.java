import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class2_Sub1_Sub1_Sub6 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "[I")
	public static int[] anIntArray111 = new int[128];

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
	public int anInt1038;

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "[Lclient!ad;")
	public Class3[] aClass3Array1;

	@OriginalMember(owner = "client!de", name = "rb", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!de", name = "tb", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!de", name = "vb", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!de", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!de", name = "Db", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!de", name = "Eb", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!de", name = "Fb", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!de", name = "Hb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!de", name = "Ib", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!de", name = "Jb", descriptor = "[Lclient!ad;")
	public Class3[] aClass3Array2;

	@OriginalMember(owner = "client!de", name = "Kb", descriptor = "[Lclient!sb;")
	private Class65[] aClass65Array1;

	@OriginalMember(owner = "client!de", name = "Lb", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!de", name = "Mb", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!de", name = "Nb", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!de", name = "Ob", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!de", name = "Pb", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!de", name = "zb", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!de", name = "Cb", descriptor = "I")
	public int anInt1043 = 0;

	@OriginalMember(owner = "client!de", name = "Bb", descriptor = "I")
	public int anInt1042 = 0;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
	private int anInt1036 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray111[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray111[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray111[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray111[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray111[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class2_Sub17 local25 = new Class2_Sub17(arg0);
		@Pc(30) Class2_Sub17 local30 = new Class2_Sub17(arg0);
		@Pc(35) Class2_Sub17 local35 = new Class2_Sub17(arg0);
		@Pc(40) Class2_Sub17 local40 = new Class2_Sub17(arg0);
		@Pc(45) Class2_Sub17 local45 = new Class2_Sub17(arg0);
		local25.anInt2799 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1783();
		@Pc(59) int local59 = local25.method1783();
		@Pc(63) int local63 = local25.method1780();
		@Pc(67) int local67 = local25.method1780();
		@Pc(71) int local71 = local25.method1780();
		@Pc(75) int local75 = local25.method1780();
		@Pc(79) int local79 = local25.method1780();
		@Pc(83) int local83 = local25.method1780();
		@Pc(87) int local87 = local25.method1783();
		@Pc(91) int local91 = local25.method1783();
		@Pc(95) int local95 = local25.method1783();
		@Pc(99) int local99 = local25.method1783();
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
		this.anInt1042 = local55;
		this.anInt1043 = local59;
		this.anInt1036 = local63;
		this.anIntArray116 = new int[local55];
		this.anIntArray123 = new int[local55];
		this.anIntArray121 = new int[local55];
		this.anIntArray124 = new int[local59];
		this.anIntArray118 = new int[local59];
		this.anIntArray114 = new int[local59];
		if (local63 > 0) {
			this.anIntArray117 = new int[local63];
			this.anIntArray122 = new int[local63];
			this.anIntArray112 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray119 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray18 = new byte[local59];
			this.aByteArray19 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray17 = new byte[local59];
		} else {
			this.aByte3 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray16 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray115 = new int[local59];
		}
		this.aShortArray7 = new short[local59];
		local25.anInt2799 = local101;
		local30.anInt2799 = local182;
		local35.anInt2799 = local188;
		local40.anInt2799 = local107;
		local45.anInt2799 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1780();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1791();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1791();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1791();
			}
			this.anIntArray116[local316] = local310 + local323;
			this.anIntArray123[local316] = local312 + local333;
			this.anIntArray121[local316] = local314 + local343;
			local310 = this.anIntArray116[local316];
			local312 = this.anIntArray123[local316];
			local314 = this.anIntArray121[local316];
			if (local83 == 1) {
				this.anIntArray119[local316] = local45.method1780();
			}
		}
		local25.anInt2799 = local166;
		local30.anInt2799 = local133;
		local35.anInt2799 = local115;
		local40.anInt2799 = local151;
		local45.anInt2799 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray7[local321] = (short) local25.method1783();
			if (local67 == 1) {
				local323 = local30.method1780();
				if ((local323 & 0x1) == 1) {
					this.aByteArray18[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray18[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray19[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray19[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray17[local321] = local35.method1767();
			}
			if (local75 == 1) {
				this.aByteArray16[local321] = local40.method1767();
			}
			if (local79 == 1) {
				this.anIntArray115[local321] = local45.method1780();
			}
		}
		local25.anInt2799 = local160;
		local30.anInt2799 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1780();
			if (local528 == 1) {
				local323 = local25.method1791() + local521;
				local333 = local25.method1791() + local323;
				local343 = local25.method1791() + local333;
				local521 = local343;
				this.anIntArray124[local523] = local323;
				this.anIntArray118[local523] = local333;
				this.anIntArray114[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1791() + local521;
				local521 = local343;
				this.anIntArray124[local523] = local323;
				this.anIntArray118[local523] = local333;
				this.anIntArray114[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1791() + local521;
				local521 = local343;
				this.anIntArray124[local523] = local323;
				this.anIntArray118[local523] = local333;
				this.anIntArray114[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1791() + local521;
				local521 = local343;
				this.anIntArray124[local523] = local323;
				this.anIntArray118[local523] = local631;
				this.anIntArray114[local523] = local343;
			}
		}
		local25.anInt2799 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray117[local528] = local25.method1783();
			this.anIntArray122[local528] = local25.method1783();
			this.anIntArray112[local528] = local25.method1783();
		}
		if (!local18) {
			this.aByteArray19 = null;
		}
		if (!local20) {
			this.aByteArray18 = null;
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([Lclient!de;I)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) Class2_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt1042 = 0;
		this.anInt1043 = 0;
		this.anInt1036 = 0;
		this.aByte3 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class2_Sub1_Sub1_Sub6 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt1042 += local45.anInt1042;
				this.anInt1043 += local45.anInt1043;
				this.anInt1036 += local45.anInt1036;
				if (local45.aByteArray17 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local45.aByte3;
					}
					if (this.aByte3 != local45.aByte3) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray18 != null;
				local22 |= local45.aByteArray16 != null;
				local24 |= local45.anIntArray115 != null;
				local26 |= local45.aByteArray19 != null;
			}
		}
		this.anIntArray116 = new int[this.anInt1042];
		this.anIntArray123 = new int[this.anInt1042];
		this.anIntArray121 = new int[this.anInt1042];
		this.anIntArray119 = new int[this.anInt1042];
		this.anIntArray124 = new int[this.anInt1043];
		this.anIntArray118 = new int[this.anInt1043];
		this.anIntArray114 = new int[this.anInt1043];
		if (this.anInt1036 > 0) {
			this.anIntArray117 = new int[this.anInt1036];
			this.anIntArray122 = new int[this.anInt1036];
			this.anIntArray112 = new int[this.anInt1036];
		}
		if (local18) {
			this.aByteArray18 = new byte[this.anInt1043];
		}
		if (local20) {
			this.aByteArray17 = new byte[this.anInt1043];
		}
		if (local22) {
			this.aByteArray16 = new byte[this.anInt1043];
		}
		if (local26) {
			this.aByteArray19 = new byte[this.anInt1043];
		}
		if (local24) {
			this.anIntArray115 = new int[this.anInt1043];
		}
		this.aShortArray7 = new short[this.anInt1043];
		this.anInt1042 = 0;
		this.anInt1043 = 0;
		this.anInt1036 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class2_Sub1_Sub1_Sub6 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt1043; local244++) {
					if (local18 && local240.aByteArray18 != null) {
						this.aByteArray18[this.anInt1043] = local240.aByteArray18[local244];
					}
					if (local20) {
						if (local240.aByteArray17 == null) {
							this.aByteArray17[this.anInt1043] = local240.aByte3;
						} else {
							this.aByteArray17[this.anInt1043] = local240.aByteArray17[local244];
						}
					}
					if (local22 && local240.aByteArray16 != null) {
						this.aByteArray16[this.anInt1043] = local240.aByteArray16[local244];
					}
					if (local26) {
						if (local240.aByteArray19 == null || local240.aByteArray19[local244] == -1) {
							this.aByteArray19[this.anInt1043] = -1;
						} else {
							this.aByteArray19[this.anInt1043] = (byte) (local240.aByteArray19[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray115 != null) {
						this.anIntArray115[this.anInt1043] = local240.anIntArray115[local244];
					}
					this.aShortArray7[this.anInt1043] = local240.aShortArray7[local244];
					this.anIntArray124[this.anInt1043] = this.method558(local240, local240.anIntArray124[local244]);
					this.anIntArray118[this.anInt1043] = this.method558(local240, local240.anIntArray118[local244]);
					this.anIntArray114[this.anInt1043] = this.method558(local240, local240.anIntArray114[local244]);
					this.anInt1043++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt1036; local397++) {
					this.anIntArray117[this.anInt1036] = this.method558(local240, local240.anIntArray117[local397]);
					this.anIntArray122[this.anInt1036] = this.method558(local240, local240.anIntArray122[local397]);
					this.anIntArray112[this.anInt1036] = this.method558(local240, local240.anIntArray112[local397]);
					this.anInt1036++;
				}
				local233 += local240.anInt1036;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!de;ZZZ)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1042 = arg0.anInt1042;
		this.anInt1043 = arg0.anInt1043;
		this.anInt1036 = arg0.anInt1036;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray116 = arg0.anIntArray116;
			this.anIntArray123 = arg0.anIntArray123;
			this.anIntArray121 = arg0.anIntArray121;
		} else {
			this.anIntArray116 = new int[this.anInt1042];
			this.anIntArray123 = new int[this.anInt1042];
			this.anIntArray121 = new int[this.anInt1042];
			for (local60 = 0; local60 < this.anInt1042; local60++) {
				this.anIntArray116[local60] = arg0.anIntArray116[local60];
				this.anIntArray123[local60] = arg0.anIntArray123[local60];
				this.anIntArray121[local60] = arg0.anIntArray121[local60];
			}
		}
		if (arg2) {
			this.aShortArray7 = arg0.aShortArray7;
		} else {
			this.aShortArray7 = new short[this.anInt1043];
			for (local60 = 0; local60 < this.anInt1043; local60++) {
				this.aShortArray7[local60] = arg0.aShortArray7[local60];
			}
		}
		this.aByteArray16 = arg0.aByteArray16;
		this.anIntArray124 = arg0.anIntArray124;
		this.anIntArray118 = arg0.anIntArray118;
		this.anIntArray114 = arg0.anIntArray114;
		this.aByteArray18 = arg0.aByteArray18;
		this.aByteArray17 = arg0.aByteArray17;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByte3 = arg0.aByte3;
		this.anIntArray117 = arg0.anIntArray117;
		this.anIntArray122 = arg0.anIntArray122;
		this.anIntArray112 = arg0.anIntArray112;
		this.anIntArray119 = arg0.anIntArray119;
		this.anIntArray115 = arg0.anIntArray115;
		this.anIntArrayArray16 = arg0.anIntArrayArray16;
		this.anIntArrayArray15 = arg0.anIntArrayArray15;
		this.aClass3Array1 = arg0.aClass3Array1;
		this.aClass65Array1 = arg0.aClass65Array1;
		this.aClass3Array2 = arg0.aClass3Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method541() {
		@Pc(3) Class2_Sub1_Sub1_Sub6 local3 = new Class2_Sub1_Sub1_Sub6();
		if (this.aByteArray18 != null) {
			local3.aByteArray18 = new byte[this.anInt1043];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1043; local13++) {
				local3.aByteArray18[local13] = this.aByteArray18[local13];
			}
		}
		local3.anInt1042 = this.anInt1042;
		local3.anInt1043 = this.anInt1043;
		local3.anInt1036 = this.anInt1036;
		local3.anIntArray116 = this.anIntArray116;
		local3.anIntArray123 = this.anIntArray123;
		local3.anIntArray121 = this.anIntArray121;
		local3.anIntArray124 = this.anIntArray124;
		local3.anIntArray118 = this.anIntArray118;
		local3.anIntArray114 = this.anIntArray114;
		local3.aByteArray17 = this.aByteArray17;
		local3.aByteArray16 = this.aByteArray16;
		local3.aByteArray19 = this.aByteArray19;
		local3.aShortArray7 = this.aShortArray7;
		local3.aByte3 = this.aByte3;
		local3.anIntArray117 = this.anIntArray117;
		local3.anIntArray122 = this.anIntArray122;
		local3.anIntArray112 = this.anIntArray112;
		local3.anIntArray119 = this.anIntArray119;
		local3.anIntArray115 = this.anIntArray115;
		local3.anIntArrayArray16 = this.anIntArrayArray16;
		local3.anIntArrayArray15 = this.anIntArrayArray15;
		local3.aClass3Array1 = this.aClass3Array1;
		local3.aClass65Array1 = this.aClass65Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1042; local1++) {
			this.anIntArray116[local1] = this.anIntArray116[local1] * arg0 / 128;
			this.anIntArray123[local1] = this.anIntArray123[local1] * arg1 / 128;
			this.anIntArray121[local1] = this.anIntArray121[local1] * arg2 / 128;
		}
		this.method553();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V")
	public void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1042; local1++) {
			this.anIntArray116[local1] += arg0;
			this.anIntArray123[local1] += arg1;
			this.anIntArray121[local1] += arg2;
		}
		this.method553();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
	public void method546() {
		if (this.aBoolean67) {
			return;
		}
		super.anInt2306 = 0;
		this.anInt1044 = 0;
		this.anInt1040 = 999999;
		this.anInt1039 = -999999;
		this.anInt1038 = -99999;
		this.anInt1037 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1042; local23++) {
			@Pc(29) int local29 = this.anIntArray116[local23];
			@Pc(34) int local34 = this.anIntArray123[local23];
			@Pc(39) int local39 = this.anIntArray121[local23];
			if (local29 < this.anInt1040) {
				this.anInt1040 = local29;
			}
			if (local29 > this.anInt1039) {
				this.anInt1039 = local29;
			}
			if (local39 < this.anInt1037) {
				this.anInt1037 = local39;
			}
			if (local39 > this.anInt1038) {
				this.anInt1038 = local39;
			}
			if (-local34 > super.anInt2306) {
				super.anInt2306 = -local34;
			}
			if (local34 > this.anInt1044) {
				this.anInt1044 = local34;
			}
		}
		this.aBoolean67 = true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method556();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class2_Sub1_Sub1_Sub2 local26 = new Class2_Sub1_Sub1_Sub2();
		local26.anIntArray41 = new int[this.anInt1043];
		local26.anIntArray33 = new int[this.anInt1043];
		local26.anIntArray39 = new int[this.anInt1043];
		for (@Pc(43) int local43 = 0; local43 < this.anInt1043; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray18 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray18[local43];
			}
			@Pc(92) Class3 local92;
			@Pc(123) int local123;
			@Pc(253) Class65 local253;
			if (this.aByteArray19 == null || this.aByteArray19[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray7[local43] & 0xFFFF;
					if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray124[local43]] == null) {
						local92 = this.aClass3Array1[this.anIntArray124[local43]];
					} else {
						local92 = this.aClass3Array2[this.anIntArray124[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt162 + arg3 * local92.anInt161 + arg4 * local92.anInt159) / (local22 * local92.anInt167);
					local26.anIntArray41[local43] = Static26.method543(local73, local123);
					if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray118[local43]] == null) {
						local92 = this.aClass3Array1[this.anIntArray118[local43]];
					} else {
						local92 = this.aClass3Array2[this.anIntArray118[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt162 + arg3 * local92.anInt161 + arg4 * local92.anInt159) / (local22 * local92.anInt167);
					local26.anIntArray33[local43] = Static26.method543(local73, local123);
					if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray114[local43]] == null) {
						local92 = this.aClass3Array1[this.anIntArray114[local43]];
					} else {
						local92 = this.aClass3Array2[this.anIntArray114[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt162 + arg3 * local92.anInt161 + arg4 * local92.anInt159) / (local22 * local92.anInt167);
					local26.anIntArray39[local43] = Static26.method543(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass65Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt2667 + arg3 * local253.anInt2661 + arg4 * local253.anInt2663) / (local22 + local22 / 2);
					local26.anIntArray41[local43] = Static26.method543(this.aShortArray7[local43] & 0xFFFF, local123);
					local26.anIntArray39[local43] = -1;
				} else {
					local26.anIntArray39[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray124[local43]] == null) {
					local92 = this.aClass3Array1[this.anIntArray124[local43]];
				} else {
					local92 = this.aClass3Array2[this.anIntArray124[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt162 + arg3 * local92.anInt161 + arg4 * local92.anInt159) / (local22 * local92.anInt167);
				local26.anIntArray41[local43] = Static26.method544(local123);
				if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray118[local43]] == null) {
					local92 = this.aClass3Array1[this.anIntArray118[local43]];
				} else {
					local92 = this.aClass3Array2[this.anIntArray118[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt162 + arg3 * local92.anInt161 + arg4 * local92.anInt159) / (local22 * local92.anInt167);
				local26.anIntArray33[local43] = Static26.method544(local123);
				if (this.aClass3Array2 == null || this.aClass3Array2[this.anIntArray114[local43]] == null) {
					local92 = this.aClass3Array1[this.anIntArray114[local43]];
				} else {
					local92 = this.aClass3Array2[this.anIntArray114[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt162 + arg3 * local92.anInt161 + arg4 * local92.anInt159) / (local22 * local92.anInt167);
				local26.anIntArray39[local43] = Static26.method544(local123);
			} else if (local49 == 1) {
				local253 = this.aClass65Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt2667 + arg3 * local253.anInt2661 + arg4 * local253.anInt2663) / (local22 + local22 / 2);
				local26.anIntArray41[local43] = Static26.method544(local123);
				local26.anIntArray39[local43] = -1;
			} else {
				local26.anIntArray39[local43] = -2;
			}
		}
		this.method555();
		local26.anInt354 = this.anInt1042;
		local26.anIntArray37 = this.anIntArray116;
		local26.anIntArray36 = this.anIntArray123;
		local26.anIntArray38 = this.anIntArray121;
		local26.anInt356 = this.anInt1043;
		local26.anIntArray35 = this.anIntArray124;
		local26.anIntArray32 = this.anIntArray118;
		local26.anIntArray31 = this.anIntArray114;
		local26.aByteArray5 = this.aByteArray17;
		local26.aByteArray6 = this.aByteArray16;
		local26.aByteArray4 = this.aByteArray19;
		if (local26.aByteArray4 == null) {
			local26.aShortArray3 = null;
		} else {
			local26.aShortArray3 = this.aShortArray7;
		}
		local26.aByte1 = this.aByte3;
		local26.anInt352 = this.anInt1036;
		local26.anIntArray34 = this.anIntArray117;
		local26.anIntArray42 = this.anIntArray122;
		local26.anIntArray40 = this.anIntArray112;
		local26.anIntArrayArray3 = this.anIntArrayArray16;
		local26.anIntArrayArray2 = this.anIntArrayArray15;
		return local26;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
	public void method549() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1042; local1++) {
			@Pc(7) int local7 = this.anIntArray116[local1];
			this.anIntArray116[local1] = this.anIntArray121[local1];
			this.anIntArray121[local1] = -local7;
		}
		this.method553();
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
	public void method550() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1042; local1++) {
			this.anIntArray116[local1] = -this.anIntArray116[local1];
			this.anIntArray121[local1] = -this.anIntArray121[local1];
		}
		this.method553();
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
	public void method552() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1042; local1++) {
			@Pc(7) int local7 = this.anIntArray121[local1];
			this.anIntArray121[local1] = this.anIntArray116[local1];
			this.anIntArray116[local1] = -local7;
		}
		this.method553();
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "()V")
	private void method553() {
		this.aClass3Array1 = null;
		this.aClass3Array2 = null;
		this.aClass65Array1 = null;
		this.aBoolean67 = false;
	}

	@OriginalMember(owner = "client!de", name = "h", descriptor = "()V")
	public void method554() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1042; local1++) {
			this.anIntArray121[local1] = -this.anIntArray121[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1043; local18++) {
			@Pc(24) int local24 = this.anIntArray124[local18];
			this.anIntArray124[local18] = this.anIntArray114[local18];
			this.anIntArray114[local18] = local24;
		}
		this.method553();
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "()V")
	private void method555() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray119 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1042; local9++) {
				local15 = this.anIntArray119[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray16 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray16[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1042) {
				local65 = this.anIntArray119[local59];
				this.anIntArrayArray16[local65][local5[local65]++] = local59++;
			}
			this.anIntArray119 = null;
		}
		if (this.anIntArray115 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1043; local9++) {
			local15 = this.anIntArray115[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray15 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray15[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1043) {
			local65 = this.anIntArray115[local59];
			this.anIntArrayArray15[local65][local5[local65]++] = local59++;
		}
		this.anIntArray115 = null;
	}

	@OriginalMember(owner = "client!de", name = "j", descriptor = "()V")
	public void method556() {
		if (this.aClass3Array1 != null) {
			return;
		}
		this.aClass3Array1 = new Class3[this.anInt1042];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1042; local10++) {
			this.aClass3Array1[local10] = new Class3();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1043; local25++) {
			@Pc(31) int local31 = this.anIntArray124[local25];
			@Pc(36) int local36 = this.anIntArray118[local25];
			@Pc(41) int local41 = this.anIntArray114[local25];
			@Pc(51) int local51 = this.anIntArray116[local36] - this.anIntArray116[local31];
			@Pc(61) int local61 = this.anIntArray123[local36] - this.anIntArray123[local31];
			@Pc(71) int local71 = this.anIntArray121[local36] - this.anIntArray121[local31];
			@Pc(81) int local81 = this.anIntArray116[local41] - this.anIntArray116[local31];
			@Pc(91) int local91 = this.anIntArray123[local41] - this.anIntArray123[local31];
			@Pc(101) int local101 = this.anIntArray121[local41] - this.anIntArray121[local31];
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
			if (this.aByteArray18 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray18[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class3 local211 = this.aClass3Array1[local31];
				local211.anInt162 += local109;
				local211.anInt161 += local117;
				local211.anInt159 += local125;
				local211.anInt167++;
				@Pc(240) Class3 local240 = this.aClass3Array1[local36];
				local240.anInt162 += local109;
				local240.anInt161 += local117;
				local240.anInt159 += local125;
				local240.anInt167++;
				@Pc(269) Class3 local269 = this.aClass3Array1[local41];
				local269.anInt162 += local109;
				local269.anInt161 += local117;
				local269.anInt159 += local125;
				local269.anInt167++;
			} else if (local198 == 1) {
				if (this.aClass65Array1 == null) {
					this.aClass65Array1 = new Class65[this.anInt1043];
				}
				@Pc(314) Class65 local314 = this.aClass65Array1[local25] = new Class65();
				local314.anInt2667 = local109;
				local314.anInt2661 = local117;
				local314.anInt2663 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIZ)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class2_Sub1_Sub1_Sub6 local16 = new Class2_Sub1_Sub1_Sub6();
		local16.anInt1042 = this.anInt1042;
		local16.anInt1043 = this.anInt1043;
		local16.anInt1036 = this.anInt1036;
		local16.anIntArray116 = this.anIntArray116;
		local16.anIntArray121 = this.anIntArray121;
		local16.anIntArray124 = this.anIntArray124;
		local16.anIntArray118 = this.anIntArray118;
		local16.anIntArray114 = this.anIntArray114;
		local16.aByteArray18 = this.aByteArray18;
		local16.aByteArray17 = this.aByteArray17;
		local16.aByteArray16 = this.aByteArray16;
		local16.aByteArray19 = this.aByteArray19;
		local16.aShortArray7 = this.aShortArray7;
		local16.aByte3 = this.aByte3;
		local16.anIntArray117 = this.anIntArray117;
		local16.anIntArray122 = this.anIntArray122;
		local16.anIntArray112 = this.anIntArray112;
		local16.anIntArray119 = this.anIntArray119;
		local16.anIntArray115 = this.anIntArray115;
		local16.anIntArrayArray16 = this.anIntArrayArray16;
		local16.anIntArrayArray15 = this.anIntArrayArray15;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray123 = new int[local16.anInt1042];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt1042; local128++) {
			@Pc(134) int local134 = this.anIntArray116[local128];
			@Pc(139) int local139 = this.anIntArray123[local128];
			@Pc(144) int local144 = this.anIntArray121[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray123[local128] = local139 + local180 - local126;
		}
		local16.method553();
		return local16;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!de;I)I")
	private int method558(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray116[arg1];
		@Pc(11) int local11 = arg0.anIntArray123[arg1];
		@Pc(16) int local16 = arg0.anIntArray121[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1042; local18++) {
			if (local6 == this.anIntArray116[local18] && local11 == this.anIntArray123[local18] && local16 == this.anIntArray121[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray116[this.anInt1042] = local6;
			this.anIntArray123[this.anInt1042] = local11;
			this.anIntArray121[this.anInt1042] = local16;
			if (arg0.anIntArray119 != null) {
				this.anIntArray119[this.anInt1042] = arg0.anIntArray119[arg1];
			}
			local1 = this.anInt1042++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(SS)V")
	public void method559(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1043; local1++) {
			if (this.aShortArray7[local1] == arg0) {
				this.aShortArray7[local1] = arg1;
			}
		}
	}
}
