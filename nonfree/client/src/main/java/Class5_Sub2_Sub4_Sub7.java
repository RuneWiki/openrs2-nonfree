import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class5_Sub2_Sub4_Sub7 extends Class5_Sub2_Sub4 {

	@OriginalMember(owner = "client!pa", name = "sb", descriptor = "[I")
	public static int[] anIntArray330 = new int[128];

	@OriginalMember(owner = "client!pa", name = "tb", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!pa", name = "ub", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!pa", name = "vb", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!pa", name = "wb", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!pa", name = "zb", descriptor = "[Lclient!ae;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!pa", name = "Ab", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!pa", name = "Bb", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!pa", name = "Cb", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!pa", name = "Db", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!pa", name = "Fb", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!pa", name = "Gb", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!pa", name = "Hb", descriptor = "I")
	public int anInt2327;

	@OriginalMember(owner = "client!pa", name = "Ib", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!pa", name = "Jb", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!pa", name = "Kb", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!pa", name = "Lb", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!pa", name = "Mb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!pa", name = "Qb", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!pa", name = "Rb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!pa", name = "Sb", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!pa", name = "Tb", descriptor = "I")
	public int anInt2329;

	@OriginalMember(owner = "client!pa", name = "Ub", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!pa", name = "Vb", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!pa", name = "Wb", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!pa", name = "Yb", descriptor = "[Lclient!ne;")
	public Class50[] aClass50Array1;

	@OriginalMember(owner = "client!pa", name = "ac", descriptor = "[I")
	public int[] anIntArray342;

	@OriginalMember(owner = "client!pa", name = "bc", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!pa", name = "cc", descriptor = "[Lclient!ne;")
	public Class50[] aClass50Array2;

	@OriginalMember(owner = "client!pa", name = "yb", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!pa", name = "Eb", descriptor = "I")
	private int anInt2325 = 0;

	@OriginalMember(owner = "client!pa", name = "xb", descriptor = "B")
	private byte aByte4 = 0;

	@OriginalMember(owner = "client!pa", name = "Xb", descriptor = "I")
	public int anInt2330 = 0;

	@OriginalMember(owner = "client!pa", name = "Ob", descriptor = "I")
	public int anInt2328 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray330[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray330[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray330[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray330[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray330[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	private Class5_Sub2_Sub4_Sub7() {
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub4_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class5_Sub9 local25 = new Class5_Sub9(arg0);
		@Pc(30) Class5_Sub9 local30 = new Class5_Sub9(arg0);
		@Pc(35) Class5_Sub9 local35 = new Class5_Sub9(arg0);
		@Pc(40) Class5_Sub9 local40 = new Class5_Sub9(arg0);
		@Pc(45) Class5_Sub9 local45 = new Class5_Sub9(arg0);
		local25.anInt2140 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1418();
		@Pc(59) int local59 = local25.method1418();
		@Pc(63) int local63 = local25.method1408();
		@Pc(67) int local67 = local25.method1408();
		@Pc(71) int local71 = local25.method1408();
		@Pc(75) int local75 = local25.method1408();
		@Pc(79) int local79 = local25.method1408();
		@Pc(83) int local83 = local25.method1408();
		@Pc(87) int local87 = local25.method1418();
		@Pc(91) int local91 = local25.method1418();
		@Pc(95) int local95 = local25.method1418();
		@Pc(99) int local99 = local25.method1418();
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
		this.anInt2328 = local55;
		this.anInt2330 = local59;
		this.anInt2325 = local63;
		this.anIntArray343 = new int[local55];
		this.anIntArray342 = new int[local55];
		this.anIntArray335 = new int[local55];
		this.anIntArray339 = new int[local59];
		this.anIntArray340 = new int[local59];
		this.anIntArray333 = new int[local59];
		if (local63 > 0) {
			this.anIntArray332 = new int[local63];
			this.anIntArray331 = new int[local63];
			this.anIntArray336 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray334 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray33 = new byte[local59];
			this.aByteArray32 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray34 = new byte[local59];
		} else {
			this.aByte4 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray35 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray341 = new int[local59];
		}
		this.aShortArray10 = new short[local59];
		local25.anInt2140 = local101;
		local30.anInt2140 = local182;
		local35.anInt2140 = local188;
		local40.anInt2140 = local107;
		local45.anInt2140 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1408();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1445();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1445();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1445();
			}
			this.anIntArray343[local316] = local310 + local323;
			this.anIntArray342[local316] = local312 + local333;
			this.anIntArray335[local316] = local314 + local343;
			local310 = this.anIntArray343[local316];
			local312 = this.anIntArray342[local316];
			local314 = this.anIntArray335[local316];
			if (local83 == 1) {
				this.anIntArray334[local316] = local45.method1408();
			}
		}
		local25.anInt2140 = local166;
		local30.anInt2140 = local133;
		local35.anInt2140 = local115;
		local40.anInt2140 = local151;
		local45.anInt2140 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray10[local321] = (short) local25.method1418();
			if (local67 == 1) {
				local323 = local30.method1408();
				if ((local323 & 0x1) == 1) {
					this.aByteArray33[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray33[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray32[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray32[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray34[local321] = local35.method1447();
			}
			if (local75 == 1) {
				this.aByteArray35[local321] = local40.method1447();
			}
			if (local79 == 1) {
				this.anIntArray341[local321] = local45.method1408();
			}
		}
		local25.anInt2140 = local160;
		local30.anInt2140 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1408();
			if (local528 == 1) {
				local323 = local25.method1445() + local521;
				local333 = local25.method1445() + local323;
				local343 = local25.method1445() + local333;
				local521 = local343;
				this.anIntArray339[local523] = local323;
				this.anIntArray340[local523] = local333;
				this.anIntArray333[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1445() + local521;
				local521 = local343;
				this.anIntArray339[local523] = local323;
				this.anIntArray340[local523] = local333;
				this.anIntArray333[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1445() + local521;
				local521 = local343;
				this.anIntArray339[local523] = local323;
				this.anIntArray340[local523] = local333;
				this.anIntArray333[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1445() + local521;
				local521 = local343;
				this.anIntArray339[local523] = local323;
				this.anIntArray340[local523] = local631;
				this.anIntArray333[local523] = local343;
			}
		}
		local25.anInt2140 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray332[local528] = local25.method1418();
			this.anIntArray331[local528] = local25.method1418();
			this.anIntArray336[local528] = local25.method1418();
		}
		if (!local18) {
			this.aByteArray32 = null;
		}
		if (!local20) {
			this.aByteArray33 = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([Lclient!pa;I)V")
	public Class5_Sub2_Sub4_Sub7(@OriginalArg(0) Class5_Sub2_Sub4_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt2328 = 0;
		this.anInt2330 = 0;
		this.anInt2325 = 0;
		this.aByte4 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class5_Sub2_Sub4_Sub7 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt2328 += local45.anInt2328;
				this.anInt2330 += local45.anInt2330;
				this.anInt2325 += local45.anInt2325;
				if (local45.aByteArray34 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local45.aByte4;
					}
					if (this.aByte4 != local45.aByte4) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray33 != null;
				local22 |= local45.aByteArray35 != null;
				local24 |= local45.anIntArray341 != null;
				local26 |= local45.aByteArray32 != null;
			}
		}
		this.anIntArray343 = new int[this.anInt2328];
		this.anIntArray342 = new int[this.anInt2328];
		this.anIntArray335 = new int[this.anInt2328];
		this.anIntArray334 = new int[this.anInt2328];
		this.anIntArray339 = new int[this.anInt2330];
		this.anIntArray340 = new int[this.anInt2330];
		this.anIntArray333 = new int[this.anInt2330];
		if (this.anInt2325 > 0) {
			this.anIntArray332 = new int[this.anInt2325];
			this.anIntArray331 = new int[this.anInt2325];
			this.anIntArray336 = new int[this.anInt2325];
		}
		if (local18) {
			this.aByteArray33 = new byte[this.anInt2330];
		}
		if (local20) {
			this.aByteArray34 = new byte[this.anInt2330];
		}
		if (local22) {
			this.aByteArray35 = new byte[this.anInt2330];
		}
		if (local26) {
			this.aByteArray32 = new byte[this.anInt2330];
		}
		if (local24) {
			this.anIntArray341 = new int[this.anInt2330];
		}
		this.aShortArray10 = new short[this.anInt2330];
		this.anInt2328 = 0;
		this.anInt2330 = 0;
		this.anInt2325 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class5_Sub2_Sub4_Sub7 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt2330; local244++) {
					if (local18 && local240.aByteArray33 != null) {
						this.aByteArray33[this.anInt2330] = local240.aByteArray33[local244];
					}
					if (local20) {
						if (local240.aByteArray34 == null) {
							this.aByteArray34[this.anInt2330] = local240.aByte4;
						} else {
							this.aByteArray34[this.anInt2330] = local240.aByteArray34[local244];
						}
					}
					if (local22 && local240.aByteArray35 != null) {
						this.aByteArray35[this.anInt2330] = local240.aByteArray35[local244];
					}
					if (local26) {
						if (local240.aByteArray32 == null || local240.aByteArray32[local244] == -1) {
							this.aByteArray32[this.anInt2330] = -1;
						} else {
							this.aByteArray32[this.anInt2330] = (byte) (local240.aByteArray32[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray341 != null) {
						this.anIntArray341[this.anInt2330] = local240.anIntArray341[local244];
					}
					this.aShortArray10[this.anInt2330] = local240.aShortArray10[local244];
					this.anIntArray339[this.anInt2330] = this.method1571(local240, local240.anIntArray339[local244]);
					this.anIntArray340[this.anInt2330] = this.method1571(local240, local240.anIntArray340[local244]);
					this.anIntArray333[this.anInt2330] = this.method1571(local240, local240.anIntArray333[local244]);
					this.anInt2330++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt2325; local397++) {
					this.anIntArray332[this.anInt2325] = this.method1571(local240, local240.anIntArray332[local397]);
					this.anIntArray331[this.anInt2325] = this.method1571(local240, local240.anIntArray331[local397]);
					this.anIntArray336[this.anInt2325] = this.method1571(local240, local240.anIntArray336[local397]);
					this.anInt2325++;
				}
				local233 += local240.anInt2325;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!pa;ZZZ)V")
	public Class5_Sub2_Sub4_Sub7(@OriginalArg(0) Class5_Sub2_Sub4_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2328 = arg0.anInt2328;
		this.anInt2330 = arg0.anInt2330;
		this.anInt2325 = arg0.anInt2325;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray343 = arg0.anIntArray343;
			this.anIntArray342 = arg0.anIntArray342;
			this.anIntArray335 = arg0.anIntArray335;
		} else {
			this.anIntArray343 = new int[this.anInt2328];
			this.anIntArray342 = new int[this.anInt2328];
			this.anIntArray335 = new int[this.anInt2328];
			for (local60 = 0; local60 < this.anInt2328; local60++) {
				this.anIntArray343[local60] = arg0.anIntArray343[local60];
				this.anIntArray342[local60] = arg0.anIntArray342[local60];
				this.anIntArray335[local60] = arg0.anIntArray335[local60];
			}
		}
		if (arg2) {
			this.aShortArray10 = arg0.aShortArray10;
		} else {
			this.aShortArray10 = new short[this.anInt2330];
			for (local60 = 0; local60 < this.anInt2330; local60++) {
				this.aShortArray10[local60] = arg0.aShortArray10[local60];
			}
		}
		this.aByteArray35 = arg0.aByteArray35;
		this.anIntArray339 = arg0.anIntArray339;
		this.anIntArray340 = arg0.anIntArray340;
		this.anIntArray333 = arg0.anIntArray333;
		this.aByteArray33 = arg0.aByteArray33;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByte4 = arg0.aByte4;
		this.anIntArray332 = arg0.anIntArray332;
		this.anIntArray331 = arg0.anIntArray331;
		this.anIntArray336 = arg0.anIntArray336;
		this.anIntArray334 = arg0.anIntArray334;
		this.anIntArray341 = arg0.anIntArray341;
		this.anIntArrayArray25 = arg0.anIntArrayArray25;
		this.anIntArrayArray24 = arg0.anIntArrayArray24;
		this.aClass50Array1 = arg0.aClass50Array1;
		this.aClass6Array1 = arg0.aClass6Array1;
		this.aClass50Array2 = arg0.aClass50Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
	private void method1568() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray334 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2328; local9++) {
				local15 = this.anIntArray334[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray25 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray25[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2328) {
				local65 = this.anIntArray334[local59];
				this.anIntArrayArray25[local65][local5[local65]++] = local59++;
			}
			this.anIntArray334 = null;
		}
		if (this.anIntArray341 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2330; local9++) {
			local15 = this.anIntArray341[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray24 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray24[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2330) {
			local65 = this.anIntArray341[local59];
			this.anIntArrayArray24[local65][local5[local65]++] = local59++;
		}
		this.anIntArray341 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!pa;I)I")
	private int method1571(@OriginalArg(0) Class5_Sub2_Sub4_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray343[arg1];
		@Pc(11) int local11 = arg0.anIntArray342[arg1];
		@Pc(16) int local16 = arg0.anIntArray335[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2328; local18++) {
			if (local6 == this.anIntArray343[local18] && local11 == this.anIntArray342[local18] && local16 == this.anIntArray335[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray343[this.anInt2328] = local6;
			this.anIntArray342[this.anInt2328] = local11;
			this.anIntArray335[this.anInt2328] = local16;
			if (arg0.anIntArray334 != null) {
				this.anIntArray334[this.anInt2328] = arg0.anIntArray334[arg1];
			}
			local1 = this.anInt2328++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "()Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method1572() {
		@Pc(3) Class5_Sub2_Sub4_Sub7 local3 = new Class5_Sub2_Sub4_Sub7();
		if (this.aByteArray33 != null) {
			local3.aByteArray33 = new byte[this.anInt2330];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2330; local13++) {
				local3.aByteArray33[local13] = this.aByteArray33[local13];
			}
		}
		local3.anInt2328 = this.anInt2328;
		local3.anInt2330 = this.anInt2330;
		local3.anInt2325 = this.anInt2325;
		local3.anIntArray343 = this.anIntArray343;
		local3.anIntArray342 = this.anIntArray342;
		local3.anIntArray335 = this.anIntArray335;
		local3.anIntArray339 = this.anIntArray339;
		local3.anIntArray340 = this.anIntArray340;
		local3.anIntArray333 = this.anIntArray333;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray32 = this.aByteArray32;
		local3.aShortArray10 = this.aShortArray10;
		local3.aByte4 = this.aByte4;
		local3.anIntArray332 = this.anIntArray332;
		local3.anIntArray331 = this.anIntArray331;
		local3.anIntArray336 = this.anIntArray336;
		local3.anIntArray334 = this.anIntArray334;
		local3.anIntArray341 = this.anIntArray341;
		local3.anIntArrayArray25 = this.anIntArrayArray25;
		local3.anIntArrayArray24 = this.anIntArrayArray24;
		local3.aClass50Array1 = this.aClass50Array1;
		local3.aClass6Array1 = this.aClass6Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "()V")
	private void method1573() {
		this.aClass50Array1 = null;
		this.aClass50Array2 = null;
		this.aClass6Array1 = null;
		this.aBoolean107 = false;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(SS)V")
	public void method1575(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2330; local1++) {
			if (this.aShortArray10[local1] == arg0) {
				this.aShortArray10[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
	public void method1577() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2328; local1++) {
			@Pc(7) int local7 = this.anIntArray335[local1];
			this.anIntArray335[local1] = this.anIntArray343[local1];
			this.anIntArray343[local1] = -local7;
		}
		this.method1573();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1583();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class5_Sub2_Sub4_Sub2 local26 = new Class5_Sub2_Sub4_Sub2();
		local26.anIntArray84 = new int[this.anInt2330];
		local26.anIntArray91 = new int[this.anInt2330];
		local26.anIntArray90 = new int[this.anInt2330];
		for (@Pc(43) int local43 = 0; local43 < this.anInt2330; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray33 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray33[local43];
			}
			@Pc(92) Class50 local92;
			@Pc(123) int local123;
			@Pc(253) Class6 local253;
			if (this.aByteArray32 == null || this.aByteArray32[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray10[local43] & 0xFFFF;
					if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray339[local43]] == null) {
						local92 = this.aClass50Array1[this.anIntArray339[local43]];
					} else {
						local92 = this.aClass50Array2[this.anIntArray339[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2195 + arg3 * local92.anInt2192 + arg4 * local92.anInt2188) / (local22 * local92.anInt2189);
					local26.anIntArray84[local43] = Static83.method1578(local73, local123);
					if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray340[local43]] == null) {
						local92 = this.aClass50Array1[this.anIntArray340[local43]];
					} else {
						local92 = this.aClass50Array2[this.anIntArray340[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2195 + arg3 * local92.anInt2192 + arg4 * local92.anInt2188) / (local22 * local92.anInt2189);
					local26.anIntArray91[local43] = Static83.method1578(local73, local123);
					if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray333[local43]] == null) {
						local92 = this.aClass50Array1[this.anIntArray333[local43]];
					} else {
						local92 = this.aClass50Array2[this.anIntArray333[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2195 + arg3 * local92.anInt2192 + arg4 * local92.anInt2188) / (local22 * local92.anInt2189);
					local26.anIntArray90[local43] = Static83.method1578(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass6Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt100 + arg3 * local253.anInt105 + arg4 * local253.anInt99) / (local22 + local22 / 2);
					local26.anIntArray84[local43] = Static83.method1578(this.aShortArray10[local43] & 0xFFFF, local123);
					local26.anIntArray90[local43] = -1;
				} else {
					local26.anIntArray90[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray339[local43]] == null) {
					local92 = this.aClass50Array1[this.anIntArray339[local43]];
				} else {
					local92 = this.aClass50Array2[this.anIntArray339[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2195 + arg3 * local92.anInt2192 + arg4 * local92.anInt2188) / (local22 * local92.anInt2189);
				local26.anIntArray84[local43] = Static83.method1576(local123);
				if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray340[local43]] == null) {
					local92 = this.aClass50Array1[this.anIntArray340[local43]];
				} else {
					local92 = this.aClass50Array2[this.anIntArray340[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2195 + arg3 * local92.anInt2192 + arg4 * local92.anInt2188) / (local22 * local92.anInt2189);
				local26.anIntArray91[local43] = Static83.method1576(local123);
				if (this.aClass50Array2 == null || this.aClass50Array2[this.anIntArray333[local43]] == null) {
					local92 = this.aClass50Array1[this.anIntArray333[local43]];
				} else {
					local92 = this.aClass50Array2[this.anIntArray333[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2195 + arg3 * local92.anInt2192 + arg4 * local92.anInt2188) / (local22 * local92.anInt2189);
				local26.anIntArray90[local43] = Static83.method1576(local123);
			} else if (local49 == 1) {
				local253 = this.aClass6Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt100 + arg3 * local253.anInt105 + arg4 * local253.anInt99) / (local22 + local22 / 2);
				local26.anIntArray84[local43] = Static83.method1576(local123);
				local26.anIntArray90[local43] = -1;
			} else {
				local26.anIntArray90[local43] = -2;
			}
		}
		this.method1568();
		local26.anInt682 = this.anInt2328;
		local26.anIntArray87 = this.anIntArray343;
		local26.anIntArray88 = this.anIntArray342;
		local26.anIntArray83 = this.anIntArray335;
		local26.anInt683 = this.anInt2330;
		local26.anIntArray85 = this.anIntArray339;
		local26.anIntArray89 = this.anIntArray340;
		local26.anIntArray92 = this.anIntArray333;
		local26.aByteArray14 = this.aByteArray34;
		local26.aByteArray13 = this.aByteArray35;
		local26.aByteArray15 = this.aByteArray32;
		if (local26.aByteArray15 == null) {
			local26.aShortArray3 = null;
		} else {
			local26.aShortArray3 = this.aShortArray10;
		}
		local26.aByte2 = this.aByte4;
		local26.anInt686 = this.anInt2325;
		local26.anIntArray94 = this.anIntArray332;
		local26.anIntArray86 = this.anIntArray331;
		local26.anIntArray93 = this.anIntArray336;
		local26.anIntArrayArray7 = this.anIntArrayArray25;
		local26.anIntArrayArray6 = this.anIntArrayArray24;
		return local26;
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "()V")
	public void method1580() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2328; local1++) {
			this.anIntArray343[local1] = -this.anIntArray343[local1];
			this.anIntArray335[local1] = -this.anIntArray335[local1];
		}
		this.method1573();
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "()V")
	public void method1581() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2328; local1++) {
			@Pc(7) int local7 = this.anIntArray343[local1];
			this.anIntArray343[local1] = this.anIntArray335[local1];
			this.anIntArray335[local1] = -local7;
		}
		this.method1573();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public void method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2328; local1++) {
			this.anIntArray343[local1] += arg0;
			this.anIntArray342[local1] += arg1;
			this.anIntArray335[local1] += arg2;
		}
		this.method1573();
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "()V")
	public void method1583() {
		if (this.aClass50Array1 != null) {
			return;
		}
		this.aClass50Array1 = new Class50[this.anInt2328];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2328; local10++) {
			this.aClass50Array1[local10] = new Class50();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2330; local25++) {
			@Pc(31) int local31 = this.anIntArray339[local25];
			@Pc(36) int local36 = this.anIntArray340[local25];
			@Pc(41) int local41 = this.anIntArray333[local25];
			@Pc(51) int local51 = this.anIntArray343[local36] - this.anIntArray343[local31];
			@Pc(61) int local61 = this.anIntArray342[local36] - this.anIntArray342[local31];
			@Pc(71) int local71 = this.anIntArray335[local36] - this.anIntArray335[local31];
			@Pc(81) int local81 = this.anIntArray343[local41] - this.anIntArray343[local31];
			@Pc(91) int local91 = this.anIntArray342[local41] - this.anIntArray342[local31];
			@Pc(101) int local101 = this.anIntArray335[local41] - this.anIntArray335[local31];
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
			if (this.aByteArray33 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray33[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class50 local211 = this.aClass50Array1[local31];
				local211.anInt2195 += local109;
				local211.anInt2192 += local117;
				local211.anInt2188 += local125;
				local211.anInt2189++;
				@Pc(240) Class50 local240 = this.aClass50Array1[local36];
				local240.anInt2195 += local109;
				local240.anInt2192 += local117;
				local240.anInt2188 += local125;
				local240.anInt2189++;
				@Pc(269) Class50 local269 = this.aClass50Array1[local41];
				local269.anInt2195 += local109;
				local269.anInt2192 += local117;
				local269.anInt2188 += local125;
				local269.anInt2189++;
			} else if (local198 == 1) {
				if (this.aClass6Array1 == null) {
					this.aClass6Array1 = new Class6[this.anInt2330];
				}
				@Pc(314) Class6 local314 = this.aClass6Array1[local25] = new Class6();
				local314.anInt100 = local109;
				local314.anInt105 = local117;
				local314.anInt99 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class5_Sub2_Sub4_Sub7 local16 = new Class5_Sub2_Sub4_Sub7();
		local16.anInt2328 = this.anInt2328;
		local16.anInt2330 = this.anInt2330;
		local16.anInt2325 = this.anInt2325;
		local16.anIntArray343 = this.anIntArray343;
		local16.anIntArray335 = this.anIntArray335;
		local16.anIntArray339 = this.anIntArray339;
		local16.anIntArray340 = this.anIntArray340;
		local16.anIntArray333 = this.anIntArray333;
		local16.aByteArray33 = this.aByteArray33;
		local16.aByteArray34 = this.aByteArray34;
		local16.aByteArray35 = this.aByteArray35;
		local16.aByteArray32 = this.aByteArray32;
		local16.aShortArray10 = this.aShortArray10;
		local16.aByte4 = this.aByte4;
		local16.anIntArray332 = this.anIntArray332;
		local16.anIntArray331 = this.anIntArray331;
		local16.anIntArray336 = this.anIntArray336;
		local16.anIntArray334 = this.anIntArray334;
		local16.anIntArray341 = this.anIntArray341;
		local16.anIntArrayArray25 = this.anIntArrayArray25;
		local16.anIntArrayArray24 = this.anIntArrayArray24;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray342 = new int[local16.anInt2328];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt2328; local128++) {
			@Pc(134) int local134 = this.anIntArray343[local128];
			@Pc(139) int local139 = this.anIntArray342[local128];
			@Pc(144) int local144 = this.anIntArray335[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray342[local128] = local139 + local180 - local126;
		}
		local16.method1573();
		return local16;
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "()V")
	public void method1585() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2328; local1++) {
			this.anIntArray335[local1] = -this.anIntArray335[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2330; local18++) {
			@Pc(24) int local24 = this.anIntArray339[local18];
			this.anIntArray339[local18] = this.anIntArray333[local18];
			this.anIntArray333[local18] = local24;
		}
		this.method1573();
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "()V")
	public void method1586() {
		if (this.aBoolean107) {
			return;
		}
		super.anInt2379 = 0;
		this.anInt2326 = 0;
		this.anInt2324 = 999999;
		this.anInt2323 = -999999;
		this.anInt2327 = -99999;
		this.anInt2329 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2328; local23++) {
			@Pc(29) int local29 = this.anIntArray343[local23];
			@Pc(34) int local34 = this.anIntArray342[local23];
			@Pc(39) int local39 = this.anIntArray335[local23];
			if (local29 < this.anInt2324) {
				this.anInt2324 = local29;
			}
			if (local29 > this.anInt2323) {
				this.anInt2323 = local29;
			}
			if (local39 < this.anInt2329) {
				this.anInt2329 = local39;
			}
			if (local39 > this.anInt2327) {
				this.anInt2327 = local39;
			}
			if (-local34 > super.anInt2379) {
				super.anInt2379 = -local34;
			}
			if (local34 > this.anInt2326) {
				this.anInt2326 = local34;
			}
		}
		this.aBoolean107 = true;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
	public void method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2328; local1++) {
			this.anIntArray343[local1] = this.anIntArray343[local1] * arg0 / 128;
			this.anIntArray342[local1] = this.anIntArray342[local1] * arg1 / 128;
			this.anIntArray335[local1] = this.anIntArray335[local1] * arg2 / 128;
		}
		this.method1573();
	}
}
