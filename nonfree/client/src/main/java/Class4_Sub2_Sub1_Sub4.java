import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class4_Sub2_Sub1_Sub4 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!qb", name = "Zb", descriptor = "[I")
	public static int[] anIntArray254 = new int[128];

	@OriginalMember(owner = "client!qb", name = "Wb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!qb", name = "Xb", descriptor = "[Lclient!ld;")
	public Class50[] aClass50Array1;

	@OriginalMember(owner = "client!qb", name = "Yb", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!qb", name = "bc", descriptor = "I")
	public int anInt2318;

	@OriginalMember(owner = "client!qb", name = "cc", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!qb", name = "dc", descriptor = "[Lclient!ld;")
	public Class50[] aClass50Array2;

	@OriginalMember(owner = "client!qb", name = "ec", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!qb", name = "fc", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!qb", name = "gc", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!qb", name = "hc", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!qb", name = "ic", descriptor = "I")
	public int anInt2319;

	@OriginalMember(owner = "client!qb", name = "kc", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!qb", name = "lc", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!qb", name = "mc", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!qb", name = "oc", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!qb", name = "pc", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!qb", name = "qc", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!qb", name = "sc", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!qb", name = "tc", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!qb", name = "uc", descriptor = "[Lclient!td;")
	private Class74[] aClass74Array1;

	@OriginalMember(owner = "client!qb", name = "vc", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!qb", name = "wc", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!qb", name = "xc", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!qb", name = "zc", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!qb", name = "Ac", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!qb", name = "Bc", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!qb", name = "Ec", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!qb", name = "Fc", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!qb", name = "Vb", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!qb", name = "ac", descriptor = "I")
	public int anInt2317 = 0;

	@OriginalMember(owner = "client!qb", name = "nc", descriptor = "I")
	public int anInt2320 = 0;

	@OriginalMember(owner = "client!qb", name = "yc", descriptor = "B")
	private byte aByte4 = 0;

	@OriginalMember(owner = "client!qb", name = "Cc", descriptor = "I")
	private int anInt2323 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray254[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray254[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray254[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray254[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray254[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	private Class4_Sub2_Sub1_Sub4() {
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub1_Sub4(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class4_Sub16 local25 = new Class4_Sub16(arg0);
		@Pc(30) Class4_Sub16 local30 = new Class4_Sub16(arg0);
		@Pc(35) Class4_Sub16 local35 = new Class4_Sub16(arg0);
		@Pc(40) Class4_Sub16 local40 = new Class4_Sub16(arg0);
		@Pc(45) Class4_Sub16 local45 = new Class4_Sub16(arg0);
		local25.anInt2019 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1490();
		@Pc(59) int local59 = local25.method1490();
		@Pc(63) int local63 = local25.method1474();
		@Pc(67) int local67 = local25.method1474();
		@Pc(71) int local71 = local25.method1474();
		@Pc(75) int local75 = local25.method1474();
		@Pc(79) int local79 = local25.method1474();
		@Pc(83) int local83 = local25.method1474();
		@Pc(87) int local87 = local25.method1490();
		@Pc(91) int local91 = local25.method1490();
		@Pc(95) int local95 = local25.method1490();
		@Pc(99) int local99 = local25.method1490();
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
		this.anInt2320 = local55;
		this.anInt2317 = local59;
		this.anInt2323 = local63;
		this.anIntArray267 = new int[local55];
		this.anIntArray261 = new int[local55];
		this.anIntArray258 = new int[local55];
		this.anIntArray265 = new int[local59];
		this.anIntArray255 = new int[local59];
		this.anIntArray263 = new int[local59];
		if (local63 > 0) {
			this.anIntArray266 = new int[local63];
			this.anIntArray260 = new int[local63];
			this.anIntArray264 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray257 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray29 = new byte[local59];
			this.aByteArray28 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray26 = new byte[local59];
		} else {
			this.aByte4 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray27 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray259 = new int[local59];
		}
		this.aShortArray7 = new short[local59];
		local25.anInt2019 = local101;
		local30.anInt2019 = local182;
		local35.anInt2019 = local188;
		local40.anInt2019 = local107;
		local45.anInt2019 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1474();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1478();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1478();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1478();
			}
			this.anIntArray267[local316] = local310 + local323;
			this.anIntArray261[local316] = local312 + local333;
			this.anIntArray258[local316] = local314 + local343;
			local310 = this.anIntArray267[local316];
			local312 = this.anIntArray261[local316];
			local314 = this.anIntArray258[local316];
			if (local83 == 1) {
				this.anIntArray257[local316] = local45.method1474();
			}
		}
		local25.anInt2019 = local166;
		local30.anInt2019 = local133;
		local35.anInt2019 = local115;
		local40.anInt2019 = local151;
		local45.anInt2019 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray7[local321] = (short) local25.method1490();
			if (local67 == 1) {
				local323 = local30.method1474();
				if ((local323 & 0x1) == 1) {
					this.aByteArray29[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray29[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray28[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray28[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray26[local321] = local35.method1477();
			}
			if (local75 == 1) {
				this.aByteArray27[local321] = local40.method1477();
			}
			if (local79 == 1) {
				this.anIntArray259[local321] = local45.method1474();
			}
		}
		local25.anInt2019 = local160;
		local30.anInt2019 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1474();
			if (local528 == 1) {
				local323 = local25.method1478() + local521;
				local333 = local25.method1478() + local323;
				local343 = local25.method1478() + local333;
				local521 = local343;
				this.anIntArray265[local523] = local323;
				this.anIntArray255[local523] = local333;
				this.anIntArray263[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1478() + local521;
				local521 = local343;
				this.anIntArray265[local523] = local323;
				this.anIntArray255[local523] = local333;
				this.anIntArray263[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1478() + local521;
				local521 = local343;
				this.anIntArray265[local523] = local323;
				this.anIntArray255[local523] = local333;
				this.anIntArray263[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1478() + local521;
				local521 = local343;
				this.anIntArray265[local523] = local323;
				this.anIntArray255[local523] = local631;
				this.anIntArray263[local523] = local343;
			}
		}
		local25.anInt2019 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray266[local528] = local25.method1490();
			this.anIntArray260[local528] = local25.method1490();
			this.anIntArray264[local528] = local25.method1490();
		}
		if (!local18) {
			this.aByteArray28 = null;
		}
		if (!local20) {
			this.aByteArray29 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([Lclient!qb;I)V")
	public Class4_Sub2_Sub1_Sub4(@OriginalArg(0) Class4_Sub2_Sub1_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt2320 = 0;
		this.anInt2317 = 0;
		this.anInt2323 = 0;
		this.aByte4 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class4_Sub2_Sub1_Sub4 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt2320 += local45.anInt2320;
				this.anInt2317 += local45.anInt2317;
				this.anInt2323 += local45.anInt2323;
				if (local45.aByteArray26 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local45.aByte4;
					}
					if (this.aByte4 != local45.aByte4) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray29 != null;
				local22 |= local45.aByteArray27 != null;
				local24 |= local45.anIntArray259 != null;
				local26 |= local45.aByteArray28 != null;
			}
		}
		this.anIntArray267 = new int[this.anInt2320];
		this.anIntArray261 = new int[this.anInt2320];
		this.anIntArray258 = new int[this.anInt2320];
		this.anIntArray257 = new int[this.anInt2320];
		this.anIntArray265 = new int[this.anInt2317];
		this.anIntArray255 = new int[this.anInt2317];
		this.anIntArray263 = new int[this.anInt2317];
		if (this.anInt2323 > 0) {
			this.anIntArray266 = new int[this.anInt2323];
			this.anIntArray260 = new int[this.anInt2323];
			this.anIntArray264 = new int[this.anInt2323];
		}
		if (local18) {
			this.aByteArray29 = new byte[this.anInt2317];
		}
		if (local20) {
			this.aByteArray26 = new byte[this.anInt2317];
		}
		if (local22) {
			this.aByteArray27 = new byte[this.anInt2317];
		}
		if (local26) {
			this.aByteArray28 = new byte[this.anInt2317];
		}
		if (local24) {
			this.anIntArray259 = new int[this.anInt2317];
		}
		this.aShortArray7 = new short[this.anInt2317];
		this.anInt2320 = 0;
		this.anInt2317 = 0;
		this.anInt2323 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class4_Sub2_Sub1_Sub4 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt2317; local244++) {
					if (local18 && local240.aByteArray29 != null) {
						this.aByteArray29[this.anInt2317] = local240.aByteArray29[local244];
					}
					if (local20) {
						if (local240.aByteArray26 == null) {
							this.aByteArray26[this.anInt2317] = local240.aByte4;
						} else {
							this.aByteArray26[this.anInt2317] = local240.aByteArray26[local244];
						}
					}
					if (local22 && local240.aByteArray27 != null) {
						this.aByteArray27[this.anInt2317] = local240.aByteArray27[local244];
					}
					if (local26) {
						if (local240.aByteArray28 == null || local240.aByteArray28[local244] == -1) {
							this.aByteArray28[this.anInt2317] = -1;
						} else {
							this.aByteArray28[this.anInt2317] = (byte) (local240.aByteArray28[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray259 != null) {
						this.anIntArray259[this.anInt2317] = local240.anIntArray259[local244];
					}
					this.aShortArray7[this.anInt2317] = local240.aShortArray7[local244];
					this.anIntArray265[this.anInt2317] = this.method1746(local240, local240.anIntArray265[local244]);
					this.anIntArray255[this.anInt2317] = this.method1746(local240, local240.anIntArray255[local244]);
					this.anIntArray263[this.anInt2317] = this.method1746(local240, local240.anIntArray263[local244]);
					this.anInt2317++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt2323; local397++) {
					this.anIntArray266[this.anInt2323] = this.method1746(local240, local240.anIntArray266[local397]);
					this.anIntArray260[this.anInt2323] = this.method1746(local240, local240.anIntArray260[local397]);
					this.anIntArray264[this.anInt2323] = this.method1746(local240, local240.anIntArray264[local397]);
					this.anInt2323++;
				}
				local233 += local240.anInt2323;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!qb;ZZZ)V")
	public Class4_Sub2_Sub1_Sub4(@OriginalArg(0) Class4_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2320 = arg0.anInt2320;
		this.anInt2317 = arg0.anInt2317;
		this.anInt2323 = arg0.anInt2323;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray267 = arg0.anIntArray267;
			this.anIntArray261 = arg0.anIntArray261;
			this.anIntArray258 = arg0.anIntArray258;
		} else {
			this.anIntArray267 = new int[this.anInt2320];
			this.anIntArray261 = new int[this.anInt2320];
			this.anIntArray258 = new int[this.anInt2320];
			for (local60 = 0; local60 < this.anInt2320; local60++) {
				this.anIntArray267[local60] = arg0.anIntArray267[local60];
				this.anIntArray261[local60] = arg0.anIntArray261[local60];
				this.anIntArray258[local60] = arg0.anIntArray258[local60];
			}
		}
		if (arg2) {
			this.aShortArray7 = arg0.aShortArray7;
		} else {
			this.aShortArray7 = new short[this.anInt2317];
			for (local60 = 0; local60 < this.anInt2317; local60++) {
				this.aShortArray7[local60] = arg0.aShortArray7[local60];
			}
		}
		this.aByteArray27 = arg0.aByteArray27;
		this.anIntArray265 = arg0.anIntArray265;
		this.anIntArray255 = arg0.anIntArray255;
		this.anIntArray263 = arg0.anIntArray263;
		this.aByteArray29 = arg0.aByteArray29;
		this.aByteArray26 = arg0.aByteArray26;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByte4 = arg0.aByte4;
		this.anIntArray266 = arg0.anIntArray266;
		this.anIntArray260 = arg0.anIntArray260;
		this.anIntArray264 = arg0.anIntArray264;
		this.anIntArray257 = arg0.anIntArray257;
		this.anIntArray259 = arg0.anIntArray259;
		this.anIntArrayArray20 = arg0.anIntArrayArray20;
		this.anIntArrayArray19 = arg0.anIntArrayArray19;
		this.aClass50Array1 = arg0.aClass50Array1;
		this.aClass74Array1 = arg0.aClass74Array1;
		this.aClass50Array2 = arg0.aClass50Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(SS)V")
	public void method1731(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2317; local1++) {
			if (this.aShortArray7[local1] == arg0) {
				this.aShortArray7[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method1732() {
		@Pc(3) Class4_Sub2_Sub1_Sub4 local3 = new Class4_Sub2_Sub1_Sub4();
		if (this.aByteArray29 != null) {
			local3.aByteArray29 = new byte[this.anInt2317];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2317; local13++) {
				local3.aByteArray29[local13] = this.aByteArray29[local13];
			}
		}
		local3.anInt2320 = this.anInt2320;
		local3.anInt2317 = this.anInt2317;
		local3.anInt2323 = this.anInt2323;
		local3.anIntArray267 = this.anIntArray267;
		local3.anIntArray261 = this.anIntArray261;
		local3.anIntArray258 = this.anIntArray258;
		local3.anIntArray265 = this.anIntArray265;
		local3.anIntArray255 = this.anIntArray255;
		local3.anIntArray263 = this.anIntArray263;
		local3.aByteArray26 = this.aByteArray26;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray28 = this.aByteArray28;
		local3.aShortArray7 = this.aShortArray7;
		local3.aByte4 = this.aByte4;
		local3.anIntArray266 = this.anIntArray266;
		local3.anIntArray260 = this.anIntArray260;
		local3.anIntArray264 = this.anIntArray264;
		local3.anIntArray257 = this.anIntArray257;
		local3.anIntArray259 = this.anIntArray259;
		local3.anIntArrayArray20 = this.anIntArrayArray20;
		local3.anIntArrayArray19 = this.anIntArrayArray19;
		local3.aClass50Array1 = this.aClass50Array1;
		local3.aClass74Array1 = this.aClass74Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIZ)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class4_Sub2_Sub1_Sub4 local16 = new Class4_Sub2_Sub1_Sub4();
		local16.anInt2320 = this.anInt2320;
		local16.anInt2317 = this.anInt2317;
		local16.anInt2323 = this.anInt2323;
		local16.anIntArray267 = this.anIntArray267;
		local16.anIntArray258 = this.anIntArray258;
		local16.anIntArray265 = this.anIntArray265;
		local16.anIntArray255 = this.anIntArray255;
		local16.anIntArray263 = this.anIntArray263;
		local16.aByteArray29 = this.aByteArray29;
		local16.aByteArray26 = this.aByteArray26;
		local16.aByteArray27 = this.aByteArray27;
		local16.aByteArray28 = this.aByteArray28;
		local16.aShortArray7 = this.aShortArray7;
		local16.aByte4 = this.aByte4;
		local16.anIntArray266 = this.anIntArray266;
		local16.anIntArray260 = this.anIntArray260;
		local16.anIntArray264 = this.anIntArray264;
		local16.anIntArray257 = this.anIntArray257;
		local16.anIntArray259 = this.anIntArray259;
		local16.anIntArrayArray20 = this.anIntArrayArray20;
		local16.anIntArrayArray19 = this.anIntArrayArray19;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray261 = new int[local16.anInt2320];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt2320; local128++) {
			@Pc(134) int local134 = this.anIntArray267[local128];
			@Pc(139) int local139 = this.anIntArray261[local128];
			@Pc(144) int local144 = this.anIntArray258[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray261[local128] = local139 + local180 - local126;
		}
		local16.method1739();
		return local16;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	private void method1734() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray257 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2320; local9++) {
				local15 = this.anIntArray257[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray20 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray20[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2320) {
				local65 = this.anIntArray257[local59];
				this.anIntArrayArray20[local65][local5[local65]++] = local59++;
			}
			this.anIntArray257 = null;
		}
		if (this.anIntArray259 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2317; local9++) {
			local15 = this.anIntArray259[local9];
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
		while (local59 < this.anInt2317) {
			local65 = this.anIntArray259[local59];
			this.anIntArrayArray19[local65][local5[local65]++] = local59++;
		}
		this.anIntArray259 = null;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
	public void method1735() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2320; local1++) {
			this.anIntArray258[local1] = -this.anIntArray258[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2317; local18++) {
			@Pc(24) int local24 = this.anIntArray265[local18];
			this.anIntArray265[local18] = this.anIntArray263[local18];
			this.anIntArray263[local18] = local24;
		}
		this.method1739();
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
	public void method1737() {
		if (this.aBoolean115) {
			return;
		}
		super.anInt3118 = 0;
		this.anInt2325 = 0;
		this.anInt2318 = 999999;
		this.anInt2321 = -999999;
		this.anInt2319 = -99999;
		this.anInt2322 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2320; local23++) {
			@Pc(29) int local29 = this.anIntArray267[local23];
			@Pc(34) int local34 = this.anIntArray261[local23];
			@Pc(39) int local39 = this.anIntArray258[local23];
			if (local29 < this.anInt2318) {
				this.anInt2318 = local29;
			}
			if (local29 > this.anInt2321) {
				this.anInt2321 = local29;
			}
			if (local39 < this.anInt2322) {
				this.anInt2322 = local39;
			}
			if (local39 > this.anInt2319) {
				this.anInt2319 = local39;
			}
			if (-local34 > super.anInt3118) {
				super.anInt3118 = -local34;
			}
			if (local34 > this.anInt2325) {
				this.anInt2325 = local34;
			}
		}
		this.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public void method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2320; local1++) {
			this.anIntArray267[local1] = this.anIntArray267[local1] * arg0 / 128;
			this.anIntArray261[local1] = this.anIntArray261[local1] * arg1 / 128;
			this.anIntArray258[local1] = this.anIntArray258[local1] * arg2 / 128;
		}
		this.method1739();
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
	private void method1739() {
		this.aClass50Array1 = null;
		this.aClass50Array2 = null;
		this.aClass74Array1 = null;
		this.aBoolean115 = false;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
	public void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2320; local1++) {
			this.anIntArray267[local1] += arg0;
			this.anIntArray261[local1] += arg1;
			this.anIntArray258[local1] += arg2;
		}
		this.method1739();
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "()V")
	public void method1741() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2320; local1++) {
			this.anIntArray267[local1] = -this.anIntArray267[local1];
			this.anIntArray258[local1] = -this.anIntArray258[local1];
		}
		this.method1739();
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "()V")
	public void method1742() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2320; local1++) {
			@Pc(7) int local7 = this.anIntArray267[local1];
			this.anIntArray267[local1] = this.anIntArray258[local1];
			this.anIntArray258[local1] = -local7;
		}
		this.method1739();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1748();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class4_Sub2_Sub1_Sub6 local26 = new Class4_Sub2_Sub1_Sub6();
		local26.anIntArray328 = new int[this.anInt2317];
		local26.anIntArray337 = new int[this.anInt2317];
		local26.anIntArray334 = new int[this.anInt2317];
		for (@Pc(43) int local43 = 0; local43 < this.anInt2317; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray29 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray29[local43];
			}
			@Pc(92) Class50 local92;
			@Pc(123) int local123;
			@Pc(253) Class74 local253;
			if (this.aByteArray28 == null || this.aByteArray28[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray7[local43] & 0xFFFF;
					if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray265[local43]] == null) {
						local92 = this.aClass50Array1[this.anIntArray265[local43]];
					} else {
						local92 = this.aClass50Array2[this.anIntArray265[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1706 + arg3 * local92.anInt1699 + arg4 * local92.anInt1709) / (local22 * local92.anInt1697);
					local26.anIntArray328[local43] = Static95.method1736(local73, local123);
					if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray255[local43]] == null) {
						local92 = this.aClass50Array1[this.anIntArray255[local43]];
					} else {
						local92 = this.aClass50Array2[this.anIntArray255[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1706 + arg3 * local92.anInt1699 + arg4 * local92.anInt1709) / (local22 * local92.anInt1697);
					local26.anIntArray337[local43] = Static95.method1736(local73, local123);
					if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray263[local43]] == null) {
						local92 = this.aClass50Array1[this.anIntArray263[local43]];
					} else {
						local92 = this.aClass50Array2[this.anIntArray263[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1706 + arg3 * local92.anInt1699 + arg4 * local92.anInt1709) / (local22 * local92.anInt1697);
					local26.anIntArray334[local43] = Static95.method1736(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass74Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt2846 + arg3 * local253.anInt2843 + arg4 * local253.anInt2845) / (local22 + local22 / 2);
					local26.anIntArray328[local43] = Static95.method1736(this.aShortArray7[local43] & 0xFFFF, local123);
					local26.anIntArray334[local43] = -1;
				} else {
					local26.anIntArray334[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray265[local43]] == null) {
					local92 = this.aClass50Array1[this.anIntArray265[local43]];
				} else {
					local92 = this.aClass50Array2[this.anIntArray265[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1706 + arg3 * local92.anInt1699 + arg4 * local92.anInt1709) / (local22 * local92.anInt1697);
				local26.anIntArray328[local43] = Static95.method1744(local123);
				if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray255[local43]] == null) {
					local92 = this.aClass50Array1[this.anIntArray255[local43]];
				} else {
					local92 = this.aClass50Array2[this.anIntArray255[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1706 + arg3 * local92.anInt1699 + arg4 * local92.anInt1709) / (local22 * local92.anInt1697);
				local26.anIntArray337[local43] = Static95.method1744(local123);
				if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray263[local43]] == null) {
					local92 = this.aClass50Array1[this.anIntArray263[local43]];
				} else {
					local92 = this.aClass50Array2[this.anIntArray263[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1706 + arg3 * local92.anInt1699 + arg4 * local92.anInt1709) / (local22 * local92.anInt1697);
				local26.anIntArray334[local43] = Static95.method1744(local123);
			} else if (local49 == 1) {
				local253 = this.aClass74Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt2846 + arg3 * local253.anInt2843 + arg4 * local253.anInt2845) / (local22 + local22 / 2);
				local26.anIntArray328[local43] = Static95.method1744(local123);
				local26.anIntArray334[local43] = -1;
			} else {
				local26.anIntArray334[local43] = -2;
			}
		}
		this.method1734();
		local26.anInt3084 = this.anInt2320;
		local26.anIntArray333 = this.anIntArray267;
		local26.anIntArray331 = this.anIntArray261;
		local26.anIntArray326 = this.anIntArray258;
		local26.anInt3081 = this.anInt2317;
		local26.anIntArray327 = this.anIntArray265;
		local26.anIntArray329 = this.anIntArray255;
		local26.anIntArray336 = this.anIntArray263;
		local26.aByteArray35 = this.aByteArray26;
		local26.aByteArray36 = this.aByteArray27;
		local26.aByteArray37 = this.aByteArray28;
		if (local26.aByteArray37 == null) {
			local26.aShortArray14 = null;
		} else {
			local26.aShortArray14 = this.aShortArray7;
		}
		local26.aByte8 = this.aByte4;
		local26.anInt3083 = this.anInt2323;
		local26.anIntArray330 = this.anIntArray266;
		local26.anIntArray335 = this.anIntArray260;
		local26.anIntArray332 = this.anIntArray264;
		local26.anIntArrayArray25 = this.anIntArrayArray20;
		local26.anIntArrayArray26 = this.anIntArrayArray19;
		return local26;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!qb;I)I")
	private int method1746(@OriginalArg(0) Class4_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray267[arg1];
		@Pc(11) int local11 = arg0.anIntArray261[arg1];
		@Pc(16) int local16 = arg0.anIntArray258[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2320; local18++) {
			if (local6 == this.anIntArray267[local18] && local11 == this.anIntArray261[local18] && local16 == this.anIntArray258[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray267[this.anInt2320] = local6;
			this.anIntArray261[this.anInt2320] = local11;
			this.anIntArray258[this.anInt2320] = local16;
			if (arg0.anIntArray257 != null) {
				this.anIntArray257[this.anInt2320] = arg0.anIntArray257[arg1];
			}
			local1 = this.anInt2320++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "()V")
	public void method1748() {
		if (this.aClass50Array1 != null) {
			return;
		}
		this.aClass50Array1 = new Class50[this.anInt2320];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2320; local10++) {
			this.aClass50Array1[local10] = new Class50();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2317; local25++) {
			@Pc(31) int local31 = this.anIntArray265[local25];
			@Pc(36) int local36 = this.anIntArray255[local25];
			@Pc(41) int local41 = this.anIntArray263[local25];
			@Pc(51) int local51 = this.anIntArray267[local36] - this.anIntArray267[local31];
			@Pc(61) int local61 = this.anIntArray261[local36] - this.anIntArray261[local31];
			@Pc(71) int local71 = this.anIntArray258[local36] - this.anIntArray258[local31];
			@Pc(81) int local81 = this.anIntArray267[local41] - this.anIntArray267[local31];
			@Pc(91) int local91 = this.anIntArray261[local41] - this.anIntArray261[local31];
			@Pc(101) int local101 = this.anIntArray258[local41] - this.anIntArray258[local31];
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
			if (this.aByteArray29 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray29[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class50 local211 = this.aClass50Array1[local31];
				local211.anInt1706 += local109;
				local211.anInt1699 += local117;
				local211.anInt1709 += local125;
				local211.anInt1697++;
				@Pc(240) Class50 local240 = this.aClass50Array1[local36];
				local240.anInt1706 += local109;
				local240.anInt1699 += local117;
				local240.anInt1709 += local125;
				local240.anInt1697++;
				@Pc(269) Class50 local269 = this.aClass50Array1[local41];
				local269.anInt1706 += local109;
				local269.anInt1699 += local117;
				local269.anInt1709 += local125;
				local269.anInt1697++;
			} else if (local198 == 1) {
				if (this.aClass74Array1 == null) {
					this.aClass74Array1 = new Class74[this.anInt2317];
				}
				@Pc(314) Class74 local314 = this.aClass74Array1[local25] = new Class74();
				local314.anInt2846 = local109;
				local314.anInt2843 = local117;
				local314.anInt2845 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "()V")
	public void method1749() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2320; local1++) {
			@Pc(7) int local7 = this.anIntArray258[local1];
			this.anIntArray258[local1] = this.anIntArray267[local1];
			this.anIntArray267[local1] = -local7;
		}
		this.method1739();
	}
}
