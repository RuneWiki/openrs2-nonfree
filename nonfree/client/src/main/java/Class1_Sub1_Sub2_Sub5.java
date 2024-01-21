import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub1_Sub2_Sub5 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!je", name = "sb", descriptor = "[I")
	public static int[] anIntArray229 = new int[128];

	@OriginalMember(owner = "client!je", name = "pb", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!je", name = "qb", descriptor = "[Lclient!fa;")
	public Class17[] aClass17Array1;

	@OriginalMember(owner = "client!je", name = "rb", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!je", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!je", name = "vb", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!je", name = "wb", descriptor = "[Lclient!fa;")
	public Class17[] aClass17Array2;

	@OriginalMember(owner = "client!je", name = "xb", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!je", name = "yb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!je", name = "Ab", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!je", name = "Bb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!je", name = "Cb", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!je", name = "Eb", descriptor = "I")
	public int anInt1627;

	@OriginalMember(owner = "client!je", name = "Fb", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!je", name = "Gb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!je", name = "Hb", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!je", name = "Ib", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!je", name = "Jb", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!je", name = "Kb", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!je", name = "Lb", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!je", name = "Nb", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!je", name = "Pb", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!je", name = "Qb", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!je", name = "Sb", descriptor = "[I")
	public int[] anIntArray239;

	@OriginalMember(owner = "client!je", name = "Tb", descriptor = "[Lclient!pc;")
	private Class60[] aClass60Array1;

	@OriginalMember(owner = "client!je", name = "Ub", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!je", name = "Vb", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!je", name = "Wb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!je", name = "Xb", descriptor = "I")
	public int anInt1632;

	@OriginalMember(owner = "client!je", name = "ub", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!je", name = "ob", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!je", name = "Mb", descriptor = "I")
	private int anInt1629 = 0;

	@OriginalMember(owner = "client!je", name = "Rb", descriptor = "I")
	public int anInt1631 = 0;

	@OriginalMember(owner = "client!je", name = "Yb", descriptor = "I")
	public int anInt1633 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray229[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray229[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray229[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray229[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray229[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub2_Sub5() {
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub2_Sub5(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class1_Sub18 local25 = new Class1_Sub18(arg0);
		@Pc(30) Class1_Sub18 local30 = new Class1_Sub18(arg0);
		@Pc(35) Class1_Sub18 local35 = new Class1_Sub18(arg0);
		@Pc(40) Class1_Sub18 local40 = new Class1_Sub18(arg0);
		@Pc(45) Class1_Sub18 local45 = new Class1_Sub18(arg0);
		local25.anInt3078 = arg0.length - 18;
		@Pc(55) int local55 = local25.method2156();
		@Pc(59) int local59 = local25.method2156();
		@Pc(63) int local63 = local25.method2169();
		@Pc(67) int local67 = local25.method2169();
		@Pc(71) int local71 = local25.method2169();
		@Pc(75) int local75 = local25.method2169();
		@Pc(79) int local79 = local25.method2169();
		@Pc(83) int local83 = local25.method2169();
		@Pc(87) int local87 = local25.method2156();
		@Pc(91) int local91 = local25.method2156();
		@Pc(95) int local95 = local25.method2156();
		@Pc(99) int local99 = local25.method2156();
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
		this.anInt1631 = local55;
		this.anInt1633 = local59;
		this.anInt1629 = local63;
		this.anIntArray239 = new int[local55];
		this.anIntArray237 = new int[local55];
		this.anIntArray227 = new int[local55];
		this.anIntArray230 = new int[local59];
		this.anIntArray231 = new int[local59];
		this.anIntArray236 = new int[local59];
		if (local63 > 0) {
			this.anIntArray238 = new int[local63];
			this.anIntArray240 = new int[local63];
			this.anIntArray228 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray235 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray44 = new byte[local59];
			this.aByteArray43 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray42 = new byte[local59];
		} else {
			this.aByte2 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray45 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray233 = new int[local59];
		}
		this.aShortArray5 = new short[local59];
		local25.anInt3078 = local101;
		local30.anInt3078 = local182;
		local35.anInt3078 = local188;
		local40.anInt3078 = local107;
		local45.anInt3078 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method2169();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method2135();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method2135();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method2135();
			}
			this.anIntArray239[local316] = local310 + local323;
			this.anIntArray237[local316] = local312 + local333;
			this.anIntArray227[local316] = local314 + local343;
			local310 = this.anIntArray239[local316];
			local312 = this.anIntArray237[local316];
			local314 = this.anIntArray227[local316];
			if (local83 == 1) {
				this.anIntArray235[local316] = local45.method2169();
			}
		}
		local25.anInt3078 = local166;
		local30.anInt3078 = local133;
		local35.anInt3078 = local115;
		local40.anInt3078 = local151;
		local45.anInt3078 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray5[local321] = (short) local25.method2156();
			if (local67 == 1) {
				local323 = local30.method2169();
				if ((local323 & 0x1) == 1) {
					this.aByteArray44[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray44[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray43[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray43[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray42[local321] = local35.method2178();
			}
			if (local75 == 1) {
				this.aByteArray45[local321] = local40.method2178();
			}
			if (local79 == 1) {
				this.anIntArray233[local321] = local45.method2169();
			}
		}
		local25.anInt3078 = local160;
		local30.anInt3078 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method2169();
			if (local528 == 1) {
				local323 = local25.method2135() + local521;
				local333 = local25.method2135() + local323;
				local343 = local25.method2135() + local333;
				local521 = local343;
				this.anIntArray230[local523] = local323;
				this.anIntArray231[local523] = local333;
				this.anIntArray236[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method2135() + local521;
				local521 = local343;
				this.anIntArray230[local523] = local323;
				this.anIntArray231[local523] = local333;
				this.anIntArray236[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method2135() + local521;
				local521 = local343;
				this.anIntArray230[local523] = local323;
				this.anIntArray231[local523] = local333;
				this.anIntArray236[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method2135() + local521;
				local521 = local343;
				this.anIntArray230[local523] = local323;
				this.anIntArray231[local523] = local631;
				this.anIntArray236[local523] = local343;
			}
		}
		local25.anInt3078 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray238[local528] = local25.method2156();
			this.anIntArray240[local528] = local25.method2156();
			this.anIntArray228[local528] = local25.method2156();
		}
		if (!local18) {
			this.aByteArray43 = null;
		}
		if (!local20) {
			this.aByteArray44 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([Lclient!je;I)V")
	public Class1_Sub1_Sub2_Sub5(@OriginalArg(0) Class1_Sub1_Sub2_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt1631 = 0;
		this.anInt1633 = 0;
		this.anInt1629 = 0;
		this.aByte2 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class1_Sub1_Sub2_Sub5 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt1631 += local45.anInt1631;
				this.anInt1633 += local45.anInt1633;
				this.anInt1629 += local45.anInt1629;
				if (local45.aByteArray42 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local45.aByte2;
					}
					if (this.aByte2 != local45.aByte2) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray44 != null;
				local22 |= local45.aByteArray45 != null;
				local24 |= local45.anIntArray233 != null;
				local26 |= local45.aByteArray43 != null;
			}
		}
		this.anIntArray239 = new int[this.anInt1631];
		this.anIntArray237 = new int[this.anInt1631];
		this.anIntArray227 = new int[this.anInt1631];
		this.anIntArray235 = new int[this.anInt1631];
		this.anIntArray230 = new int[this.anInt1633];
		this.anIntArray231 = new int[this.anInt1633];
		this.anIntArray236 = new int[this.anInt1633];
		if (this.anInt1629 > 0) {
			this.anIntArray238 = new int[this.anInt1629];
			this.anIntArray240 = new int[this.anInt1629];
			this.anIntArray228 = new int[this.anInt1629];
		}
		if (local18) {
			this.aByteArray44 = new byte[this.anInt1633];
		}
		if (local20) {
			this.aByteArray42 = new byte[this.anInt1633];
		}
		if (local22) {
			this.aByteArray45 = new byte[this.anInt1633];
		}
		if (local26) {
			this.aByteArray43 = new byte[this.anInt1633];
		}
		if (local24) {
			this.anIntArray233 = new int[this.anInt1633];
		}
		this.aShortArray5 = new short[this.anInt1633];
		this.anInt1631 = 0;
		this.anInt1633 = 0;
		this.anInt1629 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class1_Sub1_Sub2_Sub5 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt1633; local244++) {
					if (local18 && local240.aByteArray44 != null) {
						this.aByteArray44[this.anInt1633] = local240.aByteArray44[local244];
					}
					if (local20) {
						if (local240.aByteArray42 == null) {
							this.aByteArray42[this.anInt1633] = local240.aByte2;
						} else {
							this.aByteArray42[this.anInt1633] = local240.aByteArray42[local244];
						}
					}
					if (local22 && local240.aByteArray45 != null) {
						this.aByteArray45[this.anInt1633] = local240.aByteArray45[local244];
					}
					if (local26) {
						if (local240.aByteArray43 == null || local240.aByteArray43[local244] == -1) {
							this.aByteArray43[this.anInt1633] = -1;
						} else {
							this.aByteArray43[this.anInt1633] = (byte) (local240.aByteArray43[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray233 != null) {
						this.anIntArray233[this.anInt1633] = local240.anIntArray233[local244];
					}
					this.aShortArray5[this.anInt1633] = local240.aShortArray5[local244];
					this.anIntArray230[this.anInt1633] = this.method1103(local240, local240.anIntArray230[local244]);
					this.anIntArray231[this.anInt1633] = this.method1103(local240, local240.anIntArray231[local244]);
					this.anIntArray236[this.anInt1633] = this.method1103(local240, local240.anIntArray236[local244]);
					this.anInt1633++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt1629; local397++) {
					this.anIntArray238[this.anInt1629] = this.method1103(local240, local240.anIntArray238[local397]);
					this.anIntArray240[this.anInt1629] = this.method1103(local240, local240.anIntArray240[local397]);
					this.anIntArray228[this.anInt1629] = this.method1103(local240, local240.anIntArray228[local397]);
					this.anInt1629++;
				}
				local233 += local240.anInt1629;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!je;ZZZ)V")
	public Class1_Sub1_Sub2_Sub5(@OriginalArg(0) Class1_Sub1_Sub2_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1631 = arg0.anInt1631;
		this.anInt1633 = arg0.anInt1633;
		this.anInt1629 = arg0.anInt1629;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray239 = arg0.anIntArray239;
			this.anIntArray237 = arg0.anIntArray237;
			this.anIntArray227 = arg0.anIntArray227;
		} else {
			this.anIntArray239 = new int[this.anInt1631];
			this.anIntArray237 = new int[this.anInt1631];
			this.anIntArray227 = new int[this.anInt1631];
			for (local60 = 0; local60 < this.anInt1631; local60++) {
				this.anIntArray239[local60] = arg0.anIntArray239[local60];
				this.anIntArray237[local60] = arg0.anIntArray237[local60];
				this.anIntArray227[local60] = arg0.anIntArray227[local60];
			}
		}
		if (arg2) {
			this.aShortArray5 = arg0.aShortArray5;
		} else {
			this.aShortArray5 = new short[this.anInt1633];
			for (local60 = 0; local60 < this.anInt1633; local60++) {
				this.aShortArray5[local60] = arg0.aShortArray5[local60];
			}
		}
		this.aByteArray45 = arg0.aByteArray45;
		this.anIntArray230 = arg0.anIntArray230;
		this.anIntArray231 = arg0.anIntArray231;
		this.anIntArray236 = arg0.anIntArray236;
		this.aByteArray44 = arg0.aByteArray44;
		this.aByteArray42 = arg0.aByteArray42;
		this.aByteArray43 = arg0.aByteArray43;
		this.aByte2 = arg0.aByte2;
		this.anIntArray238 = arg0.anIntArray238;
		this.anIntArray240 = arg0.anIntArray240;
		this.anIntArray228 = arg0.anIntArray228;
		this.anIntArray235 = arg0.anIntArray235;
		this.anIntArray233 = arg0.anIntArray233;
		this.anIntArrayArray13 = arg0.anIntArrayArray13;
		this.anIntArrayArray14 = arg0.anIntArrayArray14;
		this.aClass17Array1 = arg0.aClass17Array1;
		this.aClass60Array1 = arg0.aClass60Array1;
		this.aClass17Array2 = arg0.aClass17Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	private void method1086() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray235 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1631; local9++) {
				local15 = this.anIntArray235[local9];
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
			while (local59 < this.anInt1631) {
				local65 = this.anIntArray235[local59];
				this.anIntArrayArray13[local65][local5[local65]++] = local59++;
			}
			this.anIntArray235 = null;
		}
		if (this.anIntArray233 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1633; local9++) {
			local15 = this.anIntArray233[local9];
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
		while (local59 < this.anInt1633) {
			local65 = this.anIntArray233[local59];
			this.anIntArrayArray14[local65][local5[local65]++] = local59++;
		}
		this.anIntArray233 = null;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
	public void method1087() {
		if (this.aClass17Array1 != null) {
			return;
		}
		this.aClass17Array1 = new Class17[this.anInt1631];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1631; local10++) {
			this.aClass17Array1[local10] = new Class17();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1633; local25++) {
			@Pc(31) int local31 = this.anIntArray230[local25];
			@Pc(36) int local36 = this.anIntArray231[local25];
			@Pc(41) int local41 = this.anIntArray236[local25];
			@Pc(51) int local51 = this.anIntArray239[local36] - this.anIntArray239[local31];
			@Pc(61) int local61 = this.anIntArray237[local36] - this.anIntArray237[local31];
			@Pc(71) int local71 = this.anIntArray227[local36] - this.anIntArray227[local31];
			@Pc(81) int local81 = this.anIntArray239[local41] - this.anIntArray239[local31];
			@Pc(91) int local91 = this.anIntArray237[local41] - this.anIntArray237[local31];
			@Pc(101) int local101 = this.anIntArray227[local41] - this.anIntArray227[local31];
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
			if (this.aByteArray44 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray44[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class17 local211 = this.aClass17Array1[local31];
				local211.anInt1063 += local109;
				local211.anInt1055 += local117;
				local211.anInt1059 += local125;
				local211.anInt1056++;
				@Pc(240) Class17 local240 = this.aClass17Array1[local36];
				local240.anInt1063 += local109;
				local240.anInt1055 += local117;
				local240.anInt1059 += local125;
				local240.anInt1056++;
				@Pc(269) Class17 local269 = this.aClass17Array1[local41];
				local269.anInt1063 += local109;
				local269.anInt1055 += local117;
				local269.anInt1059 += local125;
				local269.anInt1056++;
			} else if (local198 == 1) {
				if (this.aClass60Array1 == null) {
					this.aClass60Array1 = new Class60[this.anInt1633];
				}
				@Pc(314) Class60 local314 = this.aClass60Array1[local25] = new Class60();
				local314.anInt2163 = local109;
				local314.anInt2164 = local117;
				local314.anInt2162 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
	public void method1088() {
		if (this.aBoolean141) {
			return;
		}
		super.anInt2467 = 0;
		this.anInt1628 = 0;
		this.anInt1625 = 999999;
		this.anInt1626 = -999999;
		this.anInt1627 = -99999;
		this.anInt1632 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1631; local23++) {
			@Pc(29) int local29 = this.anIntArray239[local23];
			@Pc(34) int local34 = this.anIntArray237[local23];
			@Pc(39) int local39 = this.anIntArray227[local23];
			if (local29 < this.anInt1625) {
				this.anInt1625 = local29;
			}
			if (local29 > this.anInt1626) {
				this.anInt1626 = local29;
			}
			if (local39 < this.anInt1632) {
				this.anInt1632 = local39;
			}
			if (local39 > this.anInt1627) {
				this.anInt1627 = local39;
			}
			if (-local34 > super.anInt2467) {
				super.anInt2467 = -local34;
			}
			if (local34 > this.anInt1628) {
				this.anInt1628 = local34;
			}
		}
		this.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
	public void method1090() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			this.anIntArray239[local1] = -this.anIntArray239[local1];
			this.anIntArray227[local1] = -this.anIntArray227[local1];
		}
		this.method1094();
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "()V")
	public void method1091() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			@Pc(7) int local7 = this.anIntArray227[local1];
			this.anIntArray227[local1] = this.anIntArray239[local1];
			this.anIntArray239[local1] = -local7;
		}
		this.method1094();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			this.anIntArray239[local1] += arg0;
			this.anIntArray237[local1] += arg1;
			this.anIntArray227[local1] += arg2;
		}
		this.method1094();
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "()V")
	public void method1093() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			this.anIntArray227[local1] = -this.anIntArray227[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1633; local18++) {
			@Pc(24) int local24 = this.anIntArray230[local18];
			this.anIntArray230[local18] = this.anIntArray236[local18];
			this.anIntArray236[local18] = local24;
		}
		this.method1094();
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "()V")
	private void method1094() {
		this.aClass17Array1 = null;
		this.aClass17Array2 = null;
		this.aClass60Array1 = null;
		this.aBoolean141 = false;
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "()V")
	public void method1095() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			@Pc(7) int local7 = this.anIntArray239[local1];
			this.anIntArray239[local1] = this.anIntArray227[local1];
			this.anIntArray227[local1] = -local7;
		}
		this.method1094();
	}

	@OriginalMember(owner = "client!je", name = "j", descriptor = "()Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method1096() {
		@Pc(3) Class1_Sub1_Sub2_Sub5 local3 = new Class1_Sub1_Sub2_Sub5();
		if (this.aByteArray44 != null) {
			local3.aByteArray44 = new byte[this.anInt1633];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1633; local13++) {
				local3.aByteArray44[local13] = this.aByteArray44[local13];
			}
		}
		local3.anInt1631 = this.anInt1631;
		local3.anInt1633 = this.anInt1633;
		local3.anInt1629 = this.anInt1629;
		local3.anIntArray239 = this.anIntArray239;
		local3.anIntArray237 = this.anIntArray237;
		local3.anIntArray227 = this.anIntArray227;
		local3.anIntArray230 = this.anIntArray230;
		local3.anIntArray231 = this.anIntArray231;
		local3.anIntArray236 = this.anIntArray236;
		local3.aByteArray42 = this.aByteArray42;
		local3.aByteArray45 = this.aByteArray45;
		local3.aByteArray43 = this.aByteArray43;
		local3.aShortArray5 = this.aShortArray5;
		local3.aByte2 = this.aByte2;
		local3.anIntArray238 = this.anIntArray238;
		local3.anIntArray240 = this.anIntArray240;
		local3.anIntArray228 = this.anIntArray228;
		local3.anIntArray235 = this.anIntArray235;
		local3.anIntArray233 = this.anIntArray233;
		local3.anIntArrayArray13 = this.anIntArrayArray13;
		local3.anIntArrayArray14 = this.anIntArrayArray14;
		local3.aClass17Array1 = this.aClass17Array1;
		local3.aClass60Array1 = this.aClass60Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIZ)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method1099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub1_Sub2_Sub5 local16 = new Class1_Sub1_Sub2_Sub5();
		local16.anInt1631 = this.anInt1631;
		local16.anInt1633 = this.anInt1633;
		local16.anInt1629 = this.anInt1629;
		local16.anIntArray239 = this.anIntArray239;
		local16.anIntArray227 = this.anIntArray227;
		local16.anIntArray230 = this.anIntArray230;
		local16.anIntArray231 = this.anIntArray231;
		local16.anIntArray236 = this.anIntArray236;
		local16.aByteArray44 = this.aByteArray44;
		local16.aByteArray42 = this.aByteArray42;
		local16.aByteArray45 = this.aByteArray45;
		local16.aByteArray43 = this.aByteArray43;
		local16.aShortArray5 = this.aShortArray5;
		local16.aByte2 = this.aByte2;
		local16.anIntArray238 = this.anIntArray238;
		local16.anIntArray240 = this.anIntArray240;
		local16.anIntArray228 = this.anIntArray228;
		local16.anIntArray235 = this.anIntArray235;
		local16.anIntArray233 = this.anIntArray233;
		local16.anIntArrayArray13 = this.anIntArrayArray13;
		local16.anIntArrayArray14 = this.anIntArrayArray14;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray237 = new int[local16.anInt1631];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt1631; local128++) {
			@Pc(134) int local134 = this.anIntArray239[local128];
			@Pc(139) int local139 = this.anIntArray237[local128];
			@Pc(144) int local144 = this.anIntArray227[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray237[local128] = local139 + local180 - local126;
		}
		local16.method1094();
		return local16;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
	public void method1100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1631; local1++) {
			this.anIntArray239[local1] = this.anIntArray239[local1] * arg0 / 128;
			this.anIntArray237[local1] = this.anIntArray237[local1] * arg1 / 128;
			this.anIntArray227[local1] = this.anIntArray227[local1] * arg2 / 128;
		}
		this.method1094();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIII)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method1101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1087();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class1_Sub1_Sub2_Sub7 local26 = new Class1_Sub1_Sub2_Sub7();
		local26.anIntArray286 = new int[this.anInt1633];
		local26.anIntArray279 = new int[this.anInt1633];
		local26.anIntArray278 = new int[this.anInt1633];
		for (@Pc(43) int local43 = 0; local43 < this.anInt1633; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray44 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray44[local43];
			}
			@Pc(92) Class17 local92;
			@Pc(123) int local123;
			@Pc(253) Class60 local253;
			if (this.aByteArray43 == null || this.aByteArray43[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray5[local43] & 0xFFFF;
					if (this.aClass17Array2 == null || this.aClass17Array2[this.anIntArray230[local43]] == null) {
						local92 = this.aClass17Array1[this.anIntArray230[local43]];
					} else {
						local92 = this.aClass17Array2[this.anIntArray230[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1063 + arg3 * local92.anInt1055 + arg4 * local92.anInt1059) / (local22 * local92.anInt1056);
					local26.anIntArray286[local43] = Static60.method1102(local73, local123);
					if (this.aClass17Array2 == null || this.aClass17Array2[this.anIntArray231[local43]] == null) {
						local92 = this.aClass17Array1[this.anIntArray231[local43]];
					} else {
						local92 = this.aClass17Array2[this.anIntArray231[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1063 + arg3 * local92.anInt1055 + arg4 * local92.anInt1059) / (local22 * local92.anInt1056);
					local26.anIntArray279[local43] = Static60.method1102(local73, local123);
					if (this.aClass17Array2 == null || this.aClass17Array2[this.anIntArray236[local43]] == null) {
						local92 = this.aClass17Array1[this.anIntArray236[local43]];
					} else {
						local92 = this.aClass17Array2[this.anIntArray236[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1063 + arg3 * local92.anInt1055 + arg4 * local92.anInt1059) / (local22 * local92.anInt1056);
					local26.anIntArray278[local43] = Static60.method1102(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass60Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt2163 + arg3 * local253.anInt2164 + arg4 * local253.anInt2162) / (local22 + local22 / 2);
					local26.anIntArray286[local43] = Static60.method1102(this.aShortArray5[local43] & 0xFFFF, local123);
					local26.anIntArray278[local43] = -1;
				} else {
					local26.anIntArray278[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass17Array2 == null || this.aClass17Array2[this.anIntArray230[local43]] == null) {
					local92 = this.aClass17Array1[this.anIntArray230[local43]];
				} else {
					local92 = this.aClass17Array2[this.anIntArray230[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1063 + arg3 * local92.anInt1055 + arg4 * local92.anInt1059) / (local22 * local92.anInt1056);
				local26.anIntArray286[local43] = Static60.method1105(local123);
				if (this.aClass17Array2 == null || this.aClass17Array2[this.anIntArray231[local43]] == null) {
					local92 = this.aClass17Array1[this.anIntArray231[local43]];
				} else {
					local92 = this.aClass17Array2[this.anIntArray231[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1063 + arg3 * local92.anInt1055 + arg4 * local92.anInt1059) / (local22 * local92.anInt1056);
				local26.anIntArray279[local43] = Static60.method1105(local123);
				if (this.aClass17Array2 == null || this.aClass17Array2[this.anIntArray236[local43]] == null) {
					local92 = this.aClass17Array1[this.anIntArray236[local43]];
				} else {
					local92 = this.aClass17Array2[this.anIntArray236[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1063 + arg3 * local92.anInt1055 + arg4 * local92.anInt1059) / (local22 * local92.anInt1056);
				local26.anIntArray278[local43] = Static60.method1105(local123);
			} else if (local49 == 1) {
				local253 = this.aClass60Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt2163 + arg3 * local253.anInt2164 + arg4 * local253.anInt2162) / (local22 + local22 / 2);
				local26.anIntArray286[local43] = Static60.method1105(local123);
				local26.anIntArray278[local43] = -1;
			} else {
				local26.anIntArray278[local43] = -2;
			}
		}
		this.method1086();
		local26.anInt1974 = this.anInt1631;
		local26.anIntArray281 = this.anIntArray239;
		local26.anIntArray283 = this.anIntArray237;
		local26.anIntArray285 = this.anIntArray227;
		local26.anInt1975 = this.anInt1633;
		local26.anIntArray288 = this.anIntArray230;
		local26.anIntArray282 = this.anIntArray231;
		local26.anIntArray287 = this.anIntArray236;
		local26.aByteArray60 = this.aByteArray42;
		local26.aByteArray61 = this.aByteArray45;
		local26.aByteArray59 = this.aByteArray43;
		if (local26.aByteArray59 == null) {
			local26.aShortArray6 = null;
		} else {
			local26.aShortArray6 = this.aShortArray5;
		}
		local26.aByte4 = this.aByte2;
		local26.anInt1977 = this.anInt1629;
		local26.anIntArray280 = this.anIntArray238;
		local26.anIntArray284 = this.anIntArray240;
		local26.anIntArray289 = this.anIntArray228;
		local26.anIntArrayArray16 = this.anIntArrayArray13;
		local26.anIntArrayArray17 = this.anIntArrayArray14;
		return local26;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!je;I)I")
	private int method1103(@OriginalArg(0) Class1_Sub1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray239[arg1];
		@Pc(11) int local11 = arg0.anIntArray237[arg1];
		@Pc(16) int local16 = arg0.anIntArray227[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1631; local18++) {
			if (local6 == this.anIntArray239[local18] && local11 == this.anIntArray237[local18] && local16 == this.anIntArray227[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray239[this.anInt1631] = local6;
			this.anIntArray237[this.anInt1631] = local11;
			this.anIntArray227[this.anInt1631] = local16;
			if (arg0.anIntArray235 != null) {
				this.anIntArray235[this.anInt1631] = arg0.anIntArray235[arg1];
			}
			local1 = this.anInt1631++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(SS)V")
	public void method1104(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1633; local1++) {
			if (this.aShortArray5[local1] == arg0) {
				this.aShortArray5[local1] = arg1;
			}
		}
	}
}
