import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class6_Sub3_Sub1_Sub1 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!bc", name = "Nb", descriptor = "[I")
	public static int[] anIntArray41 = new int[128];

	@OriginalMember(owner = "client!bc", name = "pb", descriptor = "[Lclient!w;")
	public Class75[] aClass75Array1;

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!bc", name = "rb", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!bc", name = "sb", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!bc", name = "tb", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!bc", name = "vb", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!bc", name = "xb", descriptor = "I")
	public int anInt273;

	@OriginalMember(owner = "client!bc", name = "yb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!bc", name = "Ab", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!bc", name = "Cb", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bc", name = "Db", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!bc", name = "Fb", descriptor = "[Lclient!w;")
	public Class75[] aClass75Array2;

	@OriginalMember(owner = "client!bc", name = "Gb", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!bc", name = "Hb", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!bc", name = "Ib", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!bc", name = "Jb", descriptor = "[Lclient!c;")
	private Class12[] aClass12Array1;

	@OriginalMember(owner = "client!bc", name = "Kb", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!bc", name = "Lb", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!bc", name = "Mb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!bc", name = "Pb", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!bc", name = "Qb", descriptor = "[I")
	public int[] anIntArray43;

	@OriginalMember(owner = "client!bc", name = "Rb", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!bc", name = "Sb", descriptor = "I")
	public int anInt278;

	@OriginalMember(owner = "client!bc", name = "Tb", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!bc", name = "Ub", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bc", name = "Vb", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!bc", name = "Wb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!bc", name = "Xb", descriptor = "I")
	public int anInt279;

	@OriginalMember(owner = "client!bc", name = "wb", descriptor = "I")
	private int anInt272 = 0;

	@OriginalMember(owner = "client!bc", name = "zb", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!bc", name = "Bb", descriptor = "I")
	public int anInt274 = 0;

	@OriginalMember(owner = "client!bc", name = "ub", descriptor = "I")
	public int anInt271 = 0;

	@OriginalMember(owner = "client!bc", name = "Yb", descriptor = "B")
	private byte aByte1 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray41[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray41[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray41[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray41[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray41[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class6_Sub3_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([B)V")
	public Class6_Sub3_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class6_Sub4 local25 = new Class6_Sub4(arg0);
		@Pc(30) Class6_Sub4 local30 = new Class6_Sub4(arg0);
		@Pc(35) Class6_Sub4 local35 = new Class6_Sub4(arg0);
		@Pc(40) Class6_Sub4 local40 = new Class6_Sub4(arg0);
		@Pc(45) Class6_Sub4 local45 = new Class6_Sub4(arg0);
		local25.anInt1949 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1306();
		@Pc(59) int local59 = local25.method1306();
		@Pc(63) int local63 = local25.method1321();
		@Pc(67) int local67 = local25.method1321();
		@Pc(71) int local71 = local25.method1321();
		@Pc(75) int local75 = local25.method1321();
		@Pc(79) int local79 = local25.method1321();
		@Pc(83) int local83 = local25.method1321();
		@Pc(87) int local87 = local25.method1306();
		@Pc(91) int local91 = local25.method1306();
		@Pc(95) int local95 = local25.method1306();
		@Pc(99) int local99 = local25.method1306();
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
		this.anInt274 = local55;
		this.anInt271 = local59;
		this.anInt272 = local63;
		this.anIntArray39 = new int[local55];
		this.anIntArray33 = new int[local55];
		this.anIntArray38 = new int[local55];
		this.anIntArray43 = new int[local59];
		this.anIntArray32 = new int[local59];
		this.anIntArray36 = new int[local59];
		if (local63 > 0) {
			this.anIntArray35 = new int[local63];
			this.anIntArray44 = new int[local63];
			this.anIntArray42 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray40 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray4 = new byte[local59];
			this.aByteArray2 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray3 = new byte[local59];
		} else {
			this.aByte1 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray5 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray34 = new int[local59];
		}
		this.aShortArray1 = new short[local59];
		local25.anInt1949 = local101;
		local30.anInt1949 = local182;
		local35.anInt1949 = local188;
		local40.anInt1949 = local107;
		local45.anInt1949 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1321();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1285();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1285();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1285();
			}
			this.anIntArray39[local316] = local310 + local323;
			this.anIntArray33[local316] = local312 + local333;
			this.anIntArray38[local316] = local314 + local343;
			local310 = this.anIntArray39[local316];
			local312 = this.anIntArray33[local316];
			local314 = this.anIntArray38[local316];
			if (local83 == 1) {
				this.anIntArray40[local316] = local45.method1321();
			}
		}
		local25.anInt1949 = local166;
		local30.anInt1949 = local133;
		local35.anInt1949 = local115;
		local40.anInt1949 = local151;
		local45.anInt1949 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray1[local321] = (short) local25.method1306();
			if (local67 == 1) {
				local323 = local30.method1321();
				if ((local323 & 0x1) == 1) {
					this.aByteArray4[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray4[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray2[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray2[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray3[local321] = local35.method1297();
			}
			if (local75 == 1) {
				this.aByteArray5[local321] = local40.method1297();
			}
			if (local79 == 1) {
				this.anIntArray34[local321] = local45.method1321();
			}
		}
		local25.anInt1949 = local160;
		local30.anInt1949 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1321();
			if (local528 == 1) {
				local323 = local25.method1285() + local521;
				local333 = local25.method1285() + local323;
				local343 = local25.method1285() + local333;
				local521 = local343;
				this.anIntArray43[local523] = local323;
				this.anIntArray32[local523] = local333;
				this.anIntArray36[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1285() + local521;
				local521 = local343;
				this.anIntArray43[local523] = local323;
				this.anIntArray32[local523] = local333;
				this.anIntArray36[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1285() + local521;
				local521 = local343;
				this.anIntArray43[local523] = local323;
				this.anIntArray32[local523] = local333;
				this.anIntArray36[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1285() + local521;
				local521 = local343;
				this.anIntArray43[local523] = local323;
				this.anIntArray32[local523] = local631;
				this.anIntArray36[local523] = local343;
			}
		}
		local25.anInt1949 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray35[local528] = local25.method1306();
			this.anIntArray44[local528] = local25.method1306();
			this.anIntArray42[local528] = local25.method1306();
		}
		if (!local18) {
			this.aByteArray2 = null;
		}
		if (!local20) {
			this.aByteArray4 = null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([Lclient!bc;I)V")
	public Class6_Sub3_Sub1_Sub1(@OriginalArg(0) Class6_Sub3_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt274 = 0;
		this.anInt271 = 0;
		this.anInt272 = 0;
		this.aByte1 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class6_Sub3_Sub1_Sub1 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt274 += local45.anInt274;
				this.anInt271 += local45.anInt271;
				this.anInt272 += local45.anInt272;
				if (local45.aByteArray3 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local45.aByte1;
					}
					if (this.aByte1 != local45.aByte1) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray4 != null;
				local22 |= local45.aByteArray5 != null;
				local24 |= local45.anIntArray34 != null;
				local26 |= local45.aByteArray2 != null;
			}
		}
		this.anIntArray39 = new int[this.anInt274];
		this.anIntArray33 = new int[this.anInt274];
		this.anIntArray38 = new int[this.anInt274];
		this.anIntArray40 = new int[this.anInt274];
		this.anIntArray43 = new int[this.anInt271];
		this.anIntArray32 = new int[this.anInt271];
		this.anIntArray36 = new int[this.anInt271];
		if (this.anInt272 > 0) {
			this.anIntArray35 = new int[this.anInt272];
			this.anIntArray44 = new int[this.anInt272];
			this.anIntArray42 = new int[this.anInt272];
		}
		if (local18) {
			this.aByteArray4 = new byte[this.anInt271];
		}
		if (local20) {
			this.aByteArray3 = new byte[this.anInt271];
		}
		if (local22) {
			this.aByteArray5 = new byte[this.anInt271];
		}
		if (local26) {
			this.aByteArray2 = new byte[this.anInt271];
		}
		if (local24) {
			this.anIntArray34 = new int[this.anInt271];
		}
		this.aShortArray1 = new short[this.anInt271];
		this.anInt274 = 0;
		this.anInt271 = 0;
		this.anInt272 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class6_Sub3_Sub1_Sub1 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt271; local244++) {
					if (local18 && local240.aByteArray4 != null) {
						this.aByteArray4[this.anInt271] = local240.aByteArray4[local244];
					}
					if (local20) {
						if (local240.aByteArray3 == null) {
							this.aByteArray3[this.anInt271] = local240.aByte1;
						} else {
							this.aByteArray3[this.anInt271] = local240.aByteArray3[local244];
						}
					}
					if (local22 && local240.aByteArray5 != null) {
						this.aByteArray5[this.anInt271] = local240.aByteArray5[local244];
					}
					if (local26) {
						if (local240.aByteArray2 == null || local240.aByteArray2[local244] == -1) {
							this.aByteArray2[this.anInt271] = -1;
						} else {
							this.aByteArray2[this.anInt271] = (byte) (local240.aByteArray2[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray34 != null) {
						this.anIntArray34[this.anInt271] = local240.anIntArray34[local244];
					}
					this.aShortArray1[this.anInt271] = local240.aShortArray1[local244];
					this.anIntArray43[this.anInt271] = this.method226(local240, local240.anIntArray43[local244]);
					this.anIntArray32[this.anInt271] = this.method226(local240, local240.anIntArray32[local244]);
					this.anIntArray36[this.anInt271] = this.method226(local240, local240.anIntArray36[local244]);
					this.anInt271++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt272; local397++) {
					this.anIntArray35[this.anInt272] = this.method226(local240, local240.anIntArray35[local397]);
					this.anIntArray44[this.anInt272] = this.method226(local240, local240.anIntArray44[local397]);
					this.anIntArray42[this.anInt272] = this.method226(local240, local240.anIntArray42[local397]);
					this.anInt272++;
				}
				local233 += local240.anInt272;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!bc;ZZZ)V")
	public Class6_Sub3_Sub1_Sub1(@OriginalArg(0) Class6_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt274 = arg0.anInt274;
		this.anInt271 = arg0.anInt271;
		this.anInt272 = arg0.anInt272;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray39 = arg0.anIntArray39;
			this.anIntArray33 = arg0.anIntArray33;
			this.anIntArray38 = arg0.anIntArray38;
		} else {
			this.anIntArray39 = new int[this.anInt274];
			this.anIntArray33 = new int[this.anInt274];
			this.anIntArray38 = new int[this.anInt274];
			for (local60 = 0; local60 < this.anInt274; local60++) {
				this.anIntArray39[local60] = arg0.anIntArray39[local60];
				this.anIntArray33[local60] = arg0.anIntArray33[local60];
				this.anIntArray38[local60] = arg0.anIntArray38[local60];
			}
		}
		if (arg2) {
			this.aShortArray1 = arg0.aShortArray1;
		} else {
			this.aShortArray1 = new short[this.anInt271];
			for (local60 = 0; local60 < this.anInt271; local60++) {
				this.aShortArray1[local60] = arg0.aShortArray1[local60];
			}
		}
		this.aByteArray5 = arg0.aByteArray5;
		this.anIntArray43 = arg0.anIntArray43;
		this.anIntArray32 = arg0.anIntArray32;
		this.anIntArray36 = arg0.anIntArray36;
		this.aByteArray4 = arg0.aByteArray4;
		this.aByteArray3 = arg0.aByteArray3;
		this.aByteArray2 = arg0.aByteArray2;
		this.aByte1 = arg0.aByte1;
		this.anIntArray35 = arg0.anIntArray35;
		this.anIntArray44 = arg0.anIntArray44;
		this.anIntArray42 = arg0.anIntArray42;
		this.anIntArray40 = arg0.anIntArray40;
		this.anIntArray34 = arg0.anIntArray34;
		this.anIntArrayArray8 = arg0.anIntArrayArray8;
		this.anIntArrayArray7 = arg0.anIntArrayArray7;
		this.aClass75Array2 = arg0.aClass75Array2;
		this.aClass12Array1 = arg0.aClass12Array1;
		this.aClass75Array1 = arg0.aClass75Array1;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
	private void method210() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray40 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt274; local9++) {
				local15 = this.anIntArray40[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray8 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray8[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt274) {
				local65 = this.anIntArray40[local59];
				this.anIntArrayArray8[local65][local5[local65]++] = local59++;
			}
			this.anIntArray40 = null;
		}
		if (this.anIntArray34 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt271; local9++) {
			local15 = this.anIntArray34[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray7 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray7[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt271) {
			local65 = this.anIntArray34[local59];
			this.anIntArrayArray7[local65][local5[local65]++] = local59++;
		}
		this.anIntArray34 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method214();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class6_Sub3_Sub1_Sub3 local26 = new Class6_Sub3_Sub1_Sub3();
		local26.anIntArray88 = new int[this.anInt271];
		local26.anIntArray89 = new int[this.anInt271];
		local26.anIntArray83 = new int[this.anInt271];
		for (@Pc(43) int local43 = 0; local43 < this.anInt271; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray4 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray4[local43];
			}
			@Pc(92) Class75 local92;
			@Pc(123) int local123;
			@Pc(253) Class12 local253;
			if (this.aByteArray2 == null || this.aByteArray2[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray1[local43] & 0xFFFF;
					if (this.aClass75Array1 == null || this.aClass75Array1[this.anIntArray43[local43]] == null) {
						local92 = this.aClass75Array2[this.anIntArray43[local43]];
					} else {
						local92 = this.aClass75Array1[this.anIntArray43[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt3190 + arg3 * local92.anInt3188 + arg4 * local92.anInt3187) / (local22 * local92.anInt3185);
					local26.anIntArray88[local43] = Static9.method228(local73, local123);
					if (this.aClass75Array1 == null || this.aClass75Array1[this.anIntArray32[local43]] == null) {
						local92 = this.aClass75Array2[this.anIntArray32[local43]];
					} else {
						local92 = this.aClass75Array1[this.anIntArray32[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt3190 + arg3 * local92.anInt3188 + arg4 * local92.anInt3187) / (local22 * local92.anInt3185);
					local26.anIntArray89[local43] = Static9.method228(local73, local123);
					if (this.aClass75Array1 == null || this.aClass75Array1[this.anIntArray36[local43]] == null) {
						local92 = this.aClass75Array2[this.anIntArray36[local43]];
					} else {
						local92 = this.aClass75Array1[this.anIntArray36[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt3190 + arg3 * local92.anInt3188 + arg4 * local92.anInt3187) / (local22 * local92.anInt3185);
					local26.anIntArray83[local43] = Static9.method228(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass12Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt416 + arg3 * local253.anInt414 + arg4 * local253.anInt418) / (local22 + local22 / 2);
					local26.anIntArray88[local43] = Static9.method228(this.aShortArray1[local43] & 0xFFFF, local123);
					local26.anIntArray83[local43] = -1;
				} else {
					local26.anIntArray83[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass75Array1 == null || this.aClass75Array1[this.anIntArray43[local43]] == null) {
					local92 = this.aClass75Array2[this.anIntArray43[local43]];
				} else {
					local92 = this.aClass75Array1[this.anIntArray43[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt3190 + arg3 * local92.anInt3188 + arg4 * local92.anInt3187) / (local22 * local92.anInt3185);
				local26.anIntArray88[local43] = Static9.method215(local123);
				if (this.aClass75Array1 == null || this.aClass75Array1[this.anIntArray32[local43]] == null) {
					local92 = this.aClass75Array2[this.anIntArray32[local43]];
				} else {
					local92 = this.aClass75Array1[this.anIntArray32[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt3190 + arg3 * local92.anInt3188 + arg4 * local92.anInt3187) / (local22 * local92.anInt3185);
				local26.anIntArray89[local43] = Static9.method215(local123);
				if (this.aClass75Array1 == null || this.aClass75Array1[this.anIntArray36[local43]] == null) {
					local92 = this.aClass75Array2[this.anIntArray36[local43]];
				} else {
					local92 = this.aClass75Array1[this.anIntArray36[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt3190 + arg3 * local92.anInt3188 + arg4 * local92.anInt3187) / (local22 * local92.anInt3185);
				local26.anIntArray83[local43] = Static9.method215(local123);
			} else if (local49 == 1) {
				local253 = this.aClass12Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt416 + arg3 * local253.anInt414 + arg4 * local253.anInt418) / (local22 + local22 / 2);
				local26.anIntArray88[local43] = Static9.method215(local123);
				local26.anIntArray83[local43] = -1;
			} else {
				local26.anIntArray83[local43] = -2;
			}
		}
		this.method210();
		local26.anInt884 = this.anInt274;
		local26.anIntArray86 = this.anIntArray39;
		local26.anIntArray87 = this.anIntArray33;
		local26.anIntArray78 = this.anIntArray38;
		local26.anInt885 = this.anInt271;
		local26.anIntArray79 = this.anIntArray43;
		local26.anIntArray84 = this.anIntArray32;
		local26.anIntArray81 = this.anIntArray36;
		local26.aByteArray12 = this.aByteArray3;
		local26.aByteArray10 = this.aByteArray5;
		local26.aByteArray13 = this.aByteArray2;
		if (local26.aByteArray13 == null) {
			local26.aShortArray4 = null;
		} else {
			local26.aShortArray4 = this.aShortArray1;
		}
		local26.aByte2 = this.aByte1;
		local26.anInt888 = this.anInt272;
		local26.anIntArray85 = this.anIntArray35;
		local26.anIntArray80 = this.anIntArray44;
		local26.anIntArray82 = this.anIntArray42;
		local26.anIntArrayArray12 = this.anIntArrayArray8;
		local26.anIntArrayArray11 = this.anIntArrayArray7;
		return local26;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	public void method213() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray38[local1] = -this.anIntArray38[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt271; local18++) {
			@Pc(24) int local24 = this.anIntArray43[local18];
			this.anIntArray43[local18] = this.anIntArray36[local18];
			this.anIntArray36[local18] = local24;
		}
		this.method216();
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
	public void method214() {
		if (this.aClass75Array2 != null) {
			return;
		}
		this.aClass75Array2 = new Class75[this.anInt274];
		for (@Pc(10) int local10 = 0; local10 < this.anInt274; local10++) {
			this.aClass75Array2[local10] = new Class75();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt271; local25++) {
			@Pc(31) int local31 = this.anIntArray43[local25];
			@Pc(36) int local36 = this.anIntArray32[local25];
			@Pc(41) int local41 = this.anIntArray36[local25];
			@Pc(51) int local51 = this.anIntArray39[local36] - this.anIntArray39[local31];
			@Pc(61) int local61 = this.anIntArray33[local36] - this.anIntArray33[local31];
			@Pc(71) int local71 = this.anIntArray38[local36] - this.anIntArray38[local31];
			@Pc(81) int local81 = this.anIntArray39[local41] - this.anIntArray39[local31];
			@Pc(91) int local91 = this.anIntArray33[local41] - this.anIntArray33[local31];
			@Pc(101) int local101 = this.anIntArray38[local41] - this.anIntArray38[local31];
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
			if (this.aByteArray4 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray4[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class75 local211 = this.aClass75Array2[local31];
				local211.anInt3190 += local109;
				local211.anInt3188 += local117;
				local211.anInt3187 += local125;
				local211.anInt3185++;
				@Pc(240) Class75 local240 = this.aClass75Array2[local36];
				local240.anInt3190 += local109;
				local240.anInt3188 += local117;
				local240.anInt3187 += local125;
				local240.anInt3185++;
				@Pc(269) Class75 local269 = this.aClass75Array2[local41];
				local269.anInt3190 += local109;
				local269.anInt3188 += local117;
				local269.anInt3187 += local125;
				local269.anInt3185++;
			} else if (local198 == 1) {
				if (this.aClass12Array1 == null) {
					this.aClass12Array1 = new Class12[this.anInt271];
				}
				@Pc(314) Class12 local314 = this.aClass12Array1[local25] = new Class12();
				local314.anInt416 = local109;
				local314.anInt414 = local117;
				local314.anInt418 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
	private void method216() {
		this.aClass75Array2 = null;
		this.aClass75Array1 = null;
		this.aClass12Array1 = null;
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIZ)Lclient!bc;")
	public Class6_Sub3_Sub1_Sub1 method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class6_Sub3_Sub1_Sub1 local16 = new Class6_Sub3_Sub1_Sub1();
		local16.anInt274 = this.anInt274;
		local16.anInt271 = this.anInt271;
		local16.anInt272 = this.anInt272;
		local16.anIntArray39 = this.anIntArray39;
		local16.anIntArray38 = this.anIntArray38;
		local16.anIntArray43 = this.anIntArray43;
		local16.anIntArray32 = this.anIntArray32;
		local16.anIntArray36 = this.anIntArray36;
		local16.aByteArray4 = this.aByteArray4;
		local16.aByteArray3 = this.aByteArray3;
		local16.aByteArray5 = this.aByteArray5;
		local16.aByteArray2 = this.aByteArray2;
		local16.aShortArray1 = this.aShortArray1;
		local16.aByte1 = this.aByte1;
		local16.anIntArray35 = this.anIntArray35;
		local16.anIntArray44 = this.anIntArray44;
		local16.anIntArray42 = this.anIntArray42;
		local16.anIntArray40 = this.anIntArray40;
		local16.anIntArray34 = this.anIntArray34;
		local16.anIntArrayArray8 = this.anIntArrayArray8;
		local16.anIntArrayArray7 = this.anIntArrayArray7;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray33 = new int[local16.anInt274];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt274; local128++) {
			@Pc(134) int local134 = this.anIntArray39[local128];
			@Pc(139) int local139 = this.anIntArray33[local128];
			@Pc(144) int local144 = this.anIntArray38[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray33[local128] = local139 + local180 - local126;
		}
		local16.method216();
		return local16;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
	public void method219() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray39[local1] = -this.anIntArray39[local1];
			this.anIntArray38[local1] = -this.anIntArray38[local1];
		}
		this.method216();
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "()V")
	public void method220() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			@Pc(7) int local7 = this.anIntArray38[local1];
			this.anIntArray38[local1] = this.anIntArray39[local1];
			this.anIntArray39[local1] = -local7;
		}
		this.method216();
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "()Lclient!bc;")
	public Class6_Sub3_Sub1_Sub1 method221() {
		@Pc(3) Class6_Sub3_Sub1_Sub1 local3 = new Class6_Sub3_Sub1_Sub1();
		if (this.aByteArray4 != null) {
			local3.aByteArray4 = new byte[this.anInt271];
			for (@Pc(13) int local13 = 0; local13 < this.anInt271; local13++) {
				local3.aByteArray4[local13] = this.aByteArray4[local13];
			}
		}
		local3.anInt274 = this.anInt274;
		local3.anInt271 = this.anInt271;
		local3.anInt272 = this.anInt272;
		local3.anIntArray39 = this.anIntArray39;
		local3.anIntArray33 = this.anIntArray33;
		local3.anIntArray38 = this.anIntArray38;
		local3.anIntArray43 = this.anIntArray43;
		local3.anIntArray32 = this.anIntArray32;
		local3.anIntArray36 = this.anIntArray36;
		local3.aByteArray3 = this.aByteArray3;
		local3.aByteArray5 = this.aByteArray5;
		local3.aByteArray2 = this.aByteArray2;
		local3.aShortArray1 = this.aShortArray1;
		local3.aByte1 = this.aByte1;
		local3.anIntArray35 = this.anIntArray35;
		local3.anIntArray44 = this.anIntArray44;
		local3.anIntArray42 = this.anIntArray42;
		local3.anIntArray40 = this.anIntArray40;
		local3.anIntArray34 = this.anIntArray34;
		local3.anIntArrayArray8 = this.anIntArrayArray8;
		local3.anIntArrayArray7 = this.anIntArrayArray7;
		local3.aClass75Array2 = this.aClass75Array2;
		local3.aClass12Array1 = this.aClass12Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "()V")
	public void method222() {
		if (this.aBoolean15) {
			return;
		}
		super.anInt3082 = 0;
		this.anInt273 = 0;
		this.anInt277 = 999999;
		this.anInt279 = -999999;
		this.anInt278 = -99999;
		this.anInt275 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt274; local23++) {
			@Pc(29) int local29 = this.anIntArray39[local23];
			@Pc(34) int local34 = this.anIntArray33[local23];
			@Pc(39) int local39 = this.anIntArray38[local23];
			if (local29 < this.anInt277) {
				this.anInt277 = local29;
			}
			if (local29 > this.anInt279) {
				this.anInt279 = local29;
			}
			if (local39 < this.anInt275) {
				this.anInt275 = local39;
			}
			if (local39 > this.anInt278) {
				this.anInt278 = local39;
			}
			if (-local34 > super.anInt3082) {
				super.anInt3082 = -local34;
			}
			if (local34 > this.anInt273) {
				this.anInt273 = local34;
			}
		}
		this.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V")
	public void method223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray39[local1] += arg0;
			this.anIntArray33[local1] += arg1;
			this.anIntArray38[local1] += arg2;
		}
		this.method216();
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
	public void method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			this.anIntArray39[local1] = this.anIntArray39[local1] * arg0 / 128;
			this.anIntArray33[local1] = this.anIntArray33[local1] * arg1 / 128;
			this.anIntArray38[local1] = this.anIntArray38[local1] * arg2 / 128;
		}
		this.method216();
	}

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "()V")
	public void method225() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
			@Pc(7) int local7 = this.anIntArray39[local1];
			this.anIntArray39[local1] = this.anIntArray38[local1];
			this.anIntArray38[local1] = -local7;
		}
		this.method216();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bc;I)I")
	private int method226(@OriginalArg(0) Class6_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray39[arg1];
		@Pc(11) int local11 = arg0.anIntArray33[arg1];
		@Pc(16) int local16 = arg0.anIntArray38[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt274; local18++) {
			if (local6 == this.anIntArray39[local18] && local11 == this.anIntArray33[local18] && local16 == this.anIntArray38[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray39[this.anInt274] = local6;
			this.anIntArray33[this.anInt274] = local11;
			this.anIntArray38[this.anInt274] = local16;
			if (arg0.anIntArray40 != null) {
				this.anIntArray40[this.anInt274] = arg0.anIntArray40[arg1];
			}
			local1 = this.anInt274++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(SS)V")
	public void method229(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt271; local1++) {
			if (this.aShortArray1[local1] == arg0) {
				this.aShortArray1[local1] = arg1;
			}
		}
	}
}
