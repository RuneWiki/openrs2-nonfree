import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub3_Sub4_Sub1 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!c", name = "Xb", descriptor = "[I")
	public static int[] anIntArray64 = new int[128];

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!c", name = "ub", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!c", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!c", name = "wb", descriptor = "I")
	public int anInt413;

	@OriginalMember(owner = "client!c", name = "xb", descriptor = "[I")
	public int[] anIntArray55;

	@OriginalMember(owner = "client!c", name = "yb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!c", name = "zb", descriptor = "I")
	public int anInt414;

	@OriginalMember(owner = "client!c", name = "Ab", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!c", name = "Cb", descriptor = "I")
	public int anInt416;

	@OriginalMember(owner = "client!c", name = "Db", descriptor = "[I")
	public int[] anIntArray57;

	@OriginalMember(owner = "client!c", name = "Eb", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!c", name = "Fb", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!c", name = "Gb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!c", name = "Hb", descriptor = "[Lclient!ib;")
	public Class36[] aClass36Array1;

	@OriginalMember(owner = "client!c", name = "Jb", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!c", name = "Kb", descriptor = "[I")
	public int[] anIntArray59;

	@OriginalMember(owner = "client!c", name = "Lb", descriptor = "I")
	public int anInt419;

	@OriginalMember(owner = "client!c", name = "Mb", descriptor = "[Lclient!ib;")
	public Class36[] aClass36Array2;

	@OriginalMember(owner = "client!c", name = "Nb", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!c", name = "Pb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!c", name = "Qb", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!c", name = "Rb", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!c", name = "Sb", descriptor = "[Lclient!db;")
	private Class14[] aClass14Array1;

	@OriginalMember(owner = "client!c", name = "Ub", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!c", name = "Vb", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!c", name = "Wb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!c", name = "qb", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!c", name = "Bb", descriptor = "I")
	public int anInt415 = 0;

	@OriginalMember(owner = "client!c", name = "pb", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!c", name = "Ob", descriptor = "I")
	private int anInt420 = 0;

	@OriginalMember(owner = "client!c", name = "Tb", descriptor = "I")
	public int anInt421 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray64[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray64[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray64[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray64[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray64[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	private Class1_Sub3_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub4_Sub1(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class1_Sub20 local25 = new Class1_Sub20(arg0);
		@Pc(30) Class1_Sub20 local30 = new Class1_Sub20(arg0);
		@Pc(35) Class1_Sub20 local35 = new Class1_Sub20(arg0);
		@Pc(40) Class1_Sub20 local40 = new Class1_Sub20(arg0);
		@Pc(45) Class1_Sub20 local45 = new Class1_Sub20(arg0);
		local25.anInt2951 = arg0.length - 18;
		@Pc(55) int local55 = local25.method2087();
		@Pc(59) int local59 = local25.method2087();
		@Pc(63) int local63 = local25.method2053();
		@Pc(67) int local67 = local25.method2053();
		@Pc(71) int local71 = local25.method2053();
		@Pc(75) int local75 = local25.method2053();
		@Pc(79) int local79 = local25.method2053();
		@Pc(83) int local83 = local25.method2053();
		@Pc(87) int local87 = local25.method2087();
		@Pc(91) int local91 = local25.method2087();
		@Pc(95) int local95 = local25.method2087();
		@Pc(99) int local99 = local25.method2087();
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
		this.anInt415 = local55;
		this.anInt421 = local59;
		this.anInt420 = local63;
		this.anIntArray54 = new int[local55];
		this.anIntArray58 = new int[local55];
		this.anIntArray59 = new int[local55];
		this.anIntArray55 = new int[local59];
		this.anIntArray60 = new int[local59];
		this.anIntArray57 = new int[local59];
		if (local63 > 0) {
			this.anIntArray56 = new int[local63];
			this.anIntArray52 = new int[local63];
			this.anIntArray61 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray62 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray13 = new byte[local59];
			this.aByteArray12 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray14 = new byte[local59];
		} else {
			this.aByte2 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray15 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray63 = new int[local59];
		}
		this.aShortArray2 = new short[local59];
		local25.anInt2951 = local101;
		local30.anInt2951 = local182;
		local35.anInt2951 = local188;
		local40.anInt2951 = local107;
		local45.anInt2951 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method2053();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method2080();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method2080();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method2080();
			}
			this.anIntArray54[local316] = local310 + local323;
			this.anIntArray58[local316] = local312 + local333;
			this.anIntArray59[local316] = local314 + local343;
			local310 = this.anIntArray54[local316];
			local312 = this.anIntArray58[local316];
			local314 = this.anIntArray59[local316];
			if (local83 == 1) {
				this.anIntArray62[local316] = local45.method2053();
			}
		}
		local25.anInt2951 = local166;
		local30.anInt2951 = local133;
		local35.anInt2951 = local115;
		local40.anInt2951 = local151;
		local45.anInt2951 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray2[local321] = (short) local25.method2087();
			if (local67 == 1) {
				local323 = local30.method2053();
				if ((local323 & 0x1) == 1) {
					this.aByteArray13[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray13[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray12[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray12[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray14[local321] = local35.method2099();
			}
			if (local75 == 1) {
				this.aByteArray15[local321] = local40.method2099();
			}
			if (local79 == 1) {
				this.anIntArray63[local321] = local45.method2053();
			}
		}
		local25.anInt2951 = local160;
		local30.anInt2951 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method2053();
			if (local528 == 1) {
				local323 = local25.method2080() + local521;
				local333 = local25.method2080() + local323;
				local343 = local25.method2080() + local333;
				local521 = local343;
				this.anIntArray55[local523] = local323;
				this.anIntArray60[local523] = local333;
				this.anIntArray57[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method2080() + local521;
				local521 = local343;
				this.anIntArray55[local523] = local323;
				this.anIntArray60[local523] = local333;
				this.anIntArray57[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method2080() + local521;
				local521 = local343;
				this.anIntArray55[local523] = local323;
				this.anIntArray60[local523] = local333;
				this.anIntArray57[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method2080() + local521;
				local521 = local343;
				this.anIntArray55[local523] = local323;
				this.anIntArray60[local523] = local631;
				this.anIntArray57[local523] = local343;
			}
		}
		local25.anInt2951 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray56[local528] = local25.method2087();
			this.anIntArray52[local528] = local25.method2087();
			this.anIntArray61[local528] = local25.method2087();
		}
		if (!local18) {
			this.aByteArray12 = null;
		}
		if (!local20) {
			this.aByteArray13 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([Lclient!c;I)V")
	public Class1_Sub3_Sub4_Sub1(@OriginalArg(0) Class1_Sub3_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt415 = 0;
		this.anInt421 = 0;
		this.anInt420 = 0;
		this.aByte2 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class1_Sub3_Sub4_Sub1 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt415 += local45.anInt415;
				this.anInt421 += local45.anInt421;
				this.anInt420 += local45.anInt420;
				if (local45.aByteArray14 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local45.aByte2;
					}
					if (this.aByte2 != local45.aByte2) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray13 != null;
				local22 |= local45.aByteArray15 != null;
				local24 |= local45.anIntArray63 != null;
				local26 |= local45.aByteArray12 != null;
			}
		}
		this.anIntArray54 = new int[this.anInt415];
		this.anIntArray58 = new int[this.anInt415];
		this.anIntArray59 = new int[this.anInt415];
		this.anIntArray62 = new int[this.anInt415];
		this.anIntArray55 = new int[this.anInt421];
		this.anIntArray60 = new int[this.anInt421];
		this.anIntArray57 = new int[this.anInt421];
		if (this.anInt420 > 0) {
			this.anIntArray56 = new int[this.anInt420];
			this.anIntArray52 = new int[this.anInt420];
			this.anIntArray61 = new int[this.anInt420];
		}
		if (local18) {
			this.aByteArray13 = new byte[this.anInt421];
		}
		if (local20) {
			this.aByteArray14 = new byte[this.anInt421];
		}
		if (local22) {
			this.aByteArray15 = new byte[this.anInt421];
		}
		if (local26) {
			this.aByteArray12 = new byte[this.anInt421];
		}
		if (local24) {
			this.anIntArray63 = new int[this.anInt421];
		}
		this.aShortArray2 = new short[this.anInt421];
		this.anInt415 = 0;
		this.anInt421 = 0;
		this.anInt420 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class1_Sub3_Sub4_Sub1 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt421; local244++) {
					if (local18 && local240.aByteArray13 != null) {
						this.aByteArray13[this.anInt421] = local240.aByteArray13[local244];
					}
					if (local20) {
						if (local240.aByteArray14 == null) {
							this.aByteArray14[this.anInt421] = local240.aByte2;
						} else {
							this.aByteArray14[this.anInt421] = local240.aByteArray14[local244];
						}
					}
					if (local22 && local240.aByteArray15 != null) {
						this.aByteArray15[this.anInt421] = local240.aByteArray15[local244];
					}
					if (local26) {
						if (local240.aByteArray12 == null || local240.aByteArray12[local244] == -1) {
							this.aByteArray12[this.anInt421] = -1;
						} else {
							this.aByteArray12[this.anInt421] = (byte) (local240.aByteArray12[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray63 != null) {
						this.anIntArray63[this.anInt421] = local240.anIntArray63[local244];
					}
					this.aShortArray2[this.anInt421] = local240.aShortArray2[local244];
					this.anIntArray55[this.anInt421] = this.method353(local240, local240.anIntArray55[local244]);
					this.anIntArray60[this.anInt421] = this.method353(local240, local240.anIntArray60[local244]);
					this.anIntArray57[this.anInt421] = this.method353(local240, local240.anIntArray57[local244]);
					this.anInt421++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt420; local397++) {
					this.anIntArray56[this.anInt420] = this.method353(local240, local240.anIntArray56[local397]);
					this.anIntArray52[this.anInt420] = this.method353(local240, local240.anIntArray52[local397]);
					this.anIntArray61[this.anInt420] = this.method353(local240, local240.anIntArray61[local397]);
					this.anInt420++;
				}
				local233 += local240.anInt420;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!c;ZZZ)V")
	public Class1_Sub3_Sub4_Sub1(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt415 = arg0.anInt415;
		this.anInt421 = arg0.anInt421;
		this.anInt420 = arg0.anInt420;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray54 = arg0.anIntArray54;
			this.anIntArray58 = arg0.anIntArray58;
			this.anIntArray59 = arg0.anIntArray59;
		} else {
			this.anIntArray54 = new int[this.anInt415];
			this.anIntArray58 = new int[this.anInt415];
			this.anIntArray59 = new int[this.anInt415];
			for (local60 = 0; local60 < this.anInt415; local60++) {
				this.anIntArray54[local60] = arg0.anIntArray54[local60];
				this.anIntArray58[local60] = arg0.anIntArray58[local60];
				this.anIntArray59[local60] = arg0.anIntArray59[local60];
			}
		}
		if (arg2) {
			this.aShortArray2 = arg0.aShortArray2;
		} else {
			this.aShortArray2 = new short[this.anInt421];
			for (local60 = 0; local60 < this.anInt421; local60++) {
				this.aShortArray2[local60] = arg0.aShortArray2[local60];
			}
		}
		this.aByteArray15 = arg0.aByteArray15;
		this.anIntArray55 = arg0.anIntArray55;
		this.anIntArray60 = arg0.anIntArray60;
		this.anIntArray57 = arg0.anIntArray57;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByteArray12 = arg0.aByteArray12;
		this.aByte2 = arg0.aByte2;
		this.anIntArray56 = arg0.anIntArray56;
		this.anIntArray52 = arg0.anIntArray52;
		this.anIntArray61 = arg0.anIntArray61;
		this.anIntArray62 = arg0.anIntArray62;
		this.anIntArray63 = arg0.anIntArray63;
		this.anIntArrayArray18 = arg0.anIntArrayArray18;
		this.anIntArrayArray19 = arg0.anIntArrayArray19;
		this.aClass36Array1 = arg0.aClass36Array1;
		this.aClass14Array1 = arg0.aClass14Array1;
		this.aClass36Array2 = arg0.aClass36Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	public void method345() {
		if (this.aClass36Array1 != null) {
			return;
		}
		this.aClass36Array1 = new Class36[this.anInt415];
		for (@Pc(10) int local10 = 0; local10 < this.anInt415; local10++) {
			this.aClass36Array1[local10] = new Class36();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt421; local25++) {
			@Pc(31) int local31 = this.anIntArray55[local25];
			@Pc(36) int local36 = this.anIntArray60[local25];
			@Pc(41) int local41 = this.anIntArray57[local25];
			@Pc(51) int local51 = this.anIntArray54[local36] - this.anIntArray54[local31];
			@Pc(61) int local61 = this.anIntArray58[local36] - this.anIntArray58[local31];
			@Pc(71) int local71 = this.anIntArray59[local36] - this.anIntArray59[local31];
			@Pc(81) int local81 = this.anIntArray54[local41] - this.anIntArray54[local31];
			@Pc(91) int local91 = this.anIntArray58[local41] - this.anIntArray58[local31];
			@Pc(101) int local101 = this.anIntArray59[local41] - this.anIntArray59[local31];
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
			if (this.aByteArray13 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray13[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class36 local211 = this.aClass36Array1[local31];
				local211.anInt1307 += local109;
				local211.anInt1304 += local117;
				local211.anInt1301 += local125;
				local211.anInt1305++;
				@Pc(240) Class36 local240 = this.aClass36Array1[local36];
				local240.anInt1307 += local109;
				local240.anInt1304 += local117;
				local240.anInt1301 += local125;
				local240.anInt1305++;
				@Pc(269) Class36 local269 = this.aClass36Array1[local41];
				local269.anInt1307 += local109;
				local269.anInt1304 += local117;
				local269.anInt1301 += local125;
				local269.anInt1305++;
			} else if (local198 == 1) {
				if (this.aClass14Array1 == null) {
					this.aClass14Array1 = new Class14[this.anInt421];
				}
				@Pc(314) Class14 local314 = this.aClass14Array1[local25] = new Class14();
				local314.anInt765 = local109;
				local314.anInt766 = local117;
				local314.anInt764 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(SS)V")
	public void method347(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt421; local1++) {
			if (this.aShortArray2[local1] == arg0) {
				this.aShortArray2[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()V")
	public void method348() {
		if (this.aBoolean8) {
			return;
		}
		super.anInt3024 = 0;
		this.anInt417 = 0;
		this.anInt416 = 999999;
		this.anInt419 = -999999;
		this.anInt413 = -99999;
		this.anInt414 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt415; local23++) {
			@Pc(29) int local29 = this.anIntArray54[local23];
			@Pc(34) int local34 = this.anIntArray58[local23];
			@Pc(39) int local39 = this.anIntArray59[local23];
			if (local29 < this.anInt416) {
				this.anInt416 = local29;
			}
			if (local29 > this.anInt419) {
				this.anInt419 = local29;
			}
			if (local39 < this.anInt414) {
				this.anInt414 = local39;
			}
			if (local39 > this.anInt413) {
				this.anInt413 = local39;
			}
			if (-local34 > super.anInt3024) {
				super.anInt3024 = -local34;
			}
			if (local34 > this.anInt417) {
				this.anInt417 = local34;
			}
		}
		this.aBoolean8 = true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub3_Sub4_Sub1 local16 = new Class1_Sub3_Sub4_Sub1();
		local16.anInt415 = this.anInt415;
		local16.anInt421 = this.anInt421;
		local16.anInt420 = this.anInt420;
		local16.anIntArray54 = this.anIntArray54;
		local16.anIntArray59 = this.anIntArray59;
		local16.anIntArray55 = this.anIntArray55;
		local16.anIntArray60 = this.anIntArray60;
		local16.anIntArray57 = this.anIntArray57;
		local16.aByteArray13 = this.aByteArray13;
		local16.aByteArray14 = this.aByteArray14;
		local16.aByteArray15 = this.aByteArray15;
		local16.aByteArray12 = this.aByteArray12;
		local16.aShortArray2 = this.aShortArray2;
		local16.aByte2 = this.aByte2;
		local16.anIntArray56 = this.anIntArray56;
		local16.anIntArray52 = this.anIntArray52;
		local16.anIntArray61 = this.anIntArray61;
		local16.anIntArray62 = this.anIntArray62;
		local16.anIntArray63 = this.anIntArray63;
		local16.anIntArrayArray18 = this.anIntArrayArray18;
		local16.anIntArrayArray19 = this.anIntArrayArray19;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray58 = new int[local16.anInt415];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt415; local128++) {
			@Pc(134) int local134 = this.anIntArray54[local128];
			@Pc(139) int local139 = this.anIntArray58[local128];
			@Pc(144) int local144 = this.anIntArray59[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray58[local128] = local139 + local180 - local126;
		}
		local16.method360();
		return local16;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method351() {
		@Pc(3) Class1_Sub3_Sub4_Sub1 local3 = new Class1_Sub3_Sub4_Sub1();
		if (this.aByteArray13 != null) {
			local3.aByteArray13 = new byte[this.anInt421];
			for (@Pc(13) int local13 = 0; local13 < this.anInt421; local13++) {
				local3.aByteArray13[local13] = this.aByteArray13[local13];
			}
		}
		local3.anInt415 = this.anInt415;
		local3.anInt421 = this.anInt421;
		local3.anInt420 = this.anInt420;
		local3.anIntArray54 = this.anIntArray54;
		local3.anIntArray58 = this.anIntArray58;
		local3.anIntArray59 = this.anIntArray59;
		local3.anIntArray55 = this.anIntArray55;
		local3.anIntArray60 = this.anIntArray60;
		local3.anIntArray57 = this.anIntArray57;
		local3.aByteArray14 = this.aByteArray14;
		local3.aByteArray15 = this.aByteArray15;
		local3.aByteArray12 = this.aByteArray12;
		local3.aShortArray2 = this.aShortArray2;
		local3.aByte2 = this.aByte2;
		local3.anIntArray56 = this.anIntArray56;
		local3.anIntArray52 = this.anIntArray52;
		local3.anIntArray61 = this.anIntArray61;
		local3.anIntArray62 = this.anIntArray62;
		local3.anIntArray63 = this.anIntArray63;
		local3.anIntArrayArray18 = this.anIntArrayArray18;
		local3.anIntArrayArray19 = this.anIntArrayArray19;
		local3.aClass36Array1 = this.aClass36Array1;
		local3.aClass14Array1 = this.aClass14Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;I)I")
	private int method353(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray54[arg1];
		@Pc(11) int local11 = arg0.anIntArray58[arg1];
		@Pc(16) int local16 = arg0.anIntArray59[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt415; local18++) {
			if (local6 == this.anIntArray54[local18] && local11 == this.anIntArray58[local18] && local16 == this.anIntArray59[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray54[this.anInt415] = local6;
			this.anIntArray58[this.anInt415] = local11;
			this.anIntArray59[this.anInt415] = local16;
			if (arg0.anIntArray62 != null) {
				this.anIntArray62[this.anInt415] = arg0.anIntArray62[arg1];
			}
			local1 = this.anInt415++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public void method354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt415; local1++) {
			this.anIntArray54[local1] = this.anIntArray54[local1] * arg0 / 128;
			this.anIntArray58[local1] = this.anIntArray58[local1] * arg1 / 128;
			this.anIntArray59[local1] = this.anIntArray59[local1] * arg2 / 128;
		}
		this.method360();
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
	public void method355() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt415; local1++) {
			@Pc(7) int local7 = this.anIntArray59[local1];
			this.anIntArray59[local1] = this.anIntArray54[local1];
			this.anIntArray54[local1] = -local7;
		}
		this.method360();
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIII)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method345();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class1_Sub3_Sub4_Sub4 local26 = new Class1_Sub3_Sub4_Sub4();
		local26.anIntArray124 = new int[this.anInt421];
		local26.anIntArray130 = new int[this.anInt421];
		local26.anIntArray128 = new int[this.anInt421];
		for (@Pc(43) int local43 = 0; local43 < this.anInt421; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray13 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray13[local43];
			}
			@Pc(92) Class36 local92;
			@Pc(123) int local123;
			@Pc(253) Class14 local253;
			if (this.aByteArray12 == null || this.aByteArray12[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray2[local43] & 0xFFFF;
					if (this.aClass36Array2 == null || this.aClass36Array2[this.anIntArray55[local43]] == null) {
						local92 = this.aClass36Array1[this.anIntArray55[local43]];
					} else {
						local92 = this.aClass36Array2[this.anIntArray55[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1307 + arg3 * local92.anInt1304 + arg4 * local92.anInt1301) / (local22 * local92.anInt1305);
					local26.anIntArray124[local43] = Static14.method349(local73, local123);
					if (this.aClass36Array2 == null || this.aClass36Array2[this.anIntArray60[local43]] == null) {
						local92 = this.aClass36Array1[this.anIntArray60[local43]];
					} else {
						local92 = this.aClass36Array2[this.anIntArray60[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1307 + arg3 * local92.anInt1304 + arg4 * local92.anInt1301) / (local22 * local92.anInt1305);
					local26.anIntArray130[local43] = Static14.method349(local73, local123);
					if (this.aClass36Array2 == null || this.aClass36Array2[this.anIntArray57[local43]] == null) {
						local92 = this.aClass36Array1[this.anIntArray57[local43]];
					} else {
						local92 = this.aClass36Array2[this.anIntArray57[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1307 + arg3 * local92.anInt1304 + arg4 * local92.anInt1301) / (local22 * local92.anInt1305);
					local26.anIntArray128[local43] = Static14.method349(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass14Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt765 + arg3 * local253.anInt766 + arg4 * local253.anInt764) / (local22 + local22 / 2);
					local26.anIntArray124[local43] = Static14.method349(this.aShortArray2[local43] & 0xFFFF, local123);
					local26.anIntArray128[local43] = -1;
				} else {
					local26.anIntArray128[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass36Array2 == null || this.aClass36Array2[this.anIntArray55[local43]] == null) {
					local92 = this.aClass36Array1[this.anIntArray55[local43]];
				} else {
					local92 = this.aClass36Array2[this.anIntArray55[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1307 + arg3 * local92.anInt1304 + arg4 * local92.anInt1301) / (local22 * local92.anInt1305);
				local26.anIntArray124[local43] = Static14.method352(local123);
				if (this.aClass36Array2 == null || this.aClass36Array2[this.anIntArray60[local43]] == null) {
					local92 = this.aClass36Array1[this.anIntArray60[local43]];
				} else {
					local92 = this.aClass36Array2[this.anIntArray60[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1307 + arg3 * local92.anInt1304 + arg4 * local92.anInt1301) / (local22 * local92.anInt1305);
				local26.anIntArray130[local43] = Static14.method352(local123);
				if (this.aClass36Array2 == null || this.aClass36Array2[this.anIntArray57[local43]] == null) {
					local92 = this.aClass36Array1[this.anIntArray57[local43]];
				} else {
					local92 = this.aClass36Array2[this.anIntArray57[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1307 + arg3 * local92.anInt1304 + arg4 * local92.anInt1301) / (local22 * local92.anInt1305);
				local26.anIntArray128[local43] = Static14.method352(local123);
			} else if (local49 == 1) {
				local253 = this.aClass14Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt765 + arg3 * local253.anInt766 + arg4 * local253.anInt764) / (local22 + local22 / 2);
				local26.anIntArray124[local43] = Static14.method352(local123);
				local26.anIntArray128[local43] = -1;
			} else {
				local26.anIntArray128[local43] = -2;
			}
		}
		this.method361();
		local26.anInt910 = this.anInt415;
		local26.anIntArray122 = this.anIntArray54;
		local26.anIntArray126 = this.anIntArray58;
		local26.anIntArray123 = this.anIntArray59;
		local26.anInt909 = this.anInt421;
		local26.anIntArray127 = this.anIntArray55;
		local26.anIntArray119 = this.anIntArray60;
		local26.anIntArray129 = this.anIntArray57;
		local26.aByteArray20 = this.aByteArray14;
		local26.aByteArray18 = this.aByteArray15;
		local26.aByteArray16 = this.aByteArray12;
		if (local26.aByteArray16 == null) {
			local26.aShortArray5 = null;
		} else {
			local26.aShortArray5 = this.aShortArray2;
		}
		local26.aByte3 = this.aByte2;
		local26.anInt915 = this.anInt420;
		local26.anIntArray120 = this.anIntArray56;
		local26.anIntArray121 = this.anIntArray52;
		local26.anIntArray125 = this.anIntArray61;
		local26.anIntArrayArray29 = this.anIntArrayArray18;
		local26.anIntArrayArray30 = this.anIntArrayArray19;
		return local26;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
	public void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt415; local1++) {
			this.anIntArray54[local1] += arg0;
			this.anIntArray58[local1] += arg1;
			this.anIntArray59[local1] += arg2;
		}
		this.method360();
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
	public void method359() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt415; local1++) {
			this.anIntArray59[local1] = -this.anIntArray59[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt421; local18++) {
			@Pc(24) int local24 = this.anIntArray55[local18];
			this.anIntArray55[local18] = this.anIntArray57[local18];
			this.anIntArray57[local18] = local24;
		}
		this.method360();
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "()V")
	private void method360() {
		this.aClass36Array1 = null;
		this.aClass36Array2 = null;
		this.aClass14Array1 = null;
		this.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "()V")
	private void method361() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray62 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt415; local9++) {
				local15 = this.anIntArray62[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray18 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray18[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt415) {
				local65 = this.anIntArray62[local59];
				this.anIntArrayArray18[local65][local5[local65]++] = local59++;
			}
			this.anIntArray62 = null;
		}
		if (this.anIntArray63 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt421; local9++) {
			local15 = this.anIntArray63[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray19 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray19[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt421) {
			local65 = this.anIntArray63[local59];
			this.anIntArrayArray19[local65][local5[local65]++] = local59++;
		}
		this.anIntArray63 = null;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "()V")
	public void method362() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt415; local1++) {
			@Pc(7) int local7 = this.anIntArray54[local1];
			this.anIntArray54[local1] = this.anIntArray59[local1];
			this.anIntArray59[local1] = -local7;
		}
		this.method360();
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "()V")
	public void method363() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt415; local1++) {
			this.anIntArray54[local1] = -this.anIntArray54[local1];
			this.anIntArray59[local1] = -this.anIntArray59[local1];
		}
		this.method360();
	}
}
