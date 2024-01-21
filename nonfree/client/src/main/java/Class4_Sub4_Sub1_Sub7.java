import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class4_Sub4_Sub1_Sub7 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!u", name = "rb", descriptor = "[I")
	public static int[] anIntArray310 = new int[128];

	@OriginalMember(owner = "client!u", name = "V", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!u", name = "W", descriptor = "I")
	public int anInt2824;

	@OriginalMember(owner = "client!u", name = "X", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "[Lclient!p;")
	public Class57[] aClass57Array1;

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "[Lclient!p;")
	public Class57[] aClass57Array2;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!u", name = "db", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "[B")
	private byte[] aByteArray115;

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "[B")
	private byte[] aByteArray116;

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
	public int anInt2825;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!u", name = "ob", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!u", name = "pb", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!u", name = "sb", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "[B")
	private byte[] aByteArray117;

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!u", name = "wb", descriptor = "[Lclient!fa;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!u", name = "xb", descriptor = "I")
	public int anInt2829;

	@OriginalMember(owner = "client!u", name = "zb", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!u", name = "Ab", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!u", name = "Bb", descriptor = "I")
	public int anInt2830;

	@OriginalMember(owner = "client!u", name = "Db", descriptor = "I")
	public int anInt2831;

	@OriginalMember(owner = "client!u", name = "Eb", descriptor = "[B")
	public byte[] aByteArray118;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "I")
	public int anInt2826 = 0;

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "I")
	private int anInt2828 = 0;

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!u", name = "Fb", descriptor = "I")
	public int anInt2832 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray310[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray310[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray310[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray310[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray310[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	private Class4_Sub4_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
	public Class4_Sub4_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class4_Sub13 local25 = new Class4_Sub13(arg0);
		@Pc(30) Class4_Sub13 local30 = new Class4_Sub13(arg0);
		@Pc(35) Class4_Sub13 local35 = new Class4_Sub13(arg0);
		@Pc(40) Class4_Sub13 local40 = new Class4_Sub13(arg0);
		@Pc(45) Class4_Sub13 local45 = new Class4_Sub13(arg0);
		local25.anInt1643 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1244();
		@Pc(59) int local59 = local25.method1244();
		@Pc(63) int local63 = local25.method1223();
		@Pc(67) int local67 = local25.method1223();
		@Pc(71) int local71 = local25.method1223();
		@Pc(75) int local75 = local25.method1223();
		@Pc(79) int local79 = local25.method1223();
		@Pc(83) int local83 = local25.method1223();
		@Pc(87) int local87 = local25.method1244();
		@Pc(91) int local91 = local25.method1244();
		@Pc(95) int local95 = local25.method1244();
		@Pc(99) int local99 = local25.method1244();
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
		this.anInt2832 = local55;
		this.anInt2826 = local59;
		this.anInt2828 = local63;
		this.anIntArray307 = new int[local55];
		this.anIntArray304 = new int[local55];
		this.anIntArray306 = new int[local55];
		this.anIntArray311 = new int[local59];
		this.anIntArray312 = new int[local59];
		this.anIntArray305 = new int[local59];
		if (local63 > 0) {
			this.anIntArray315 = new int[local63];
			this.anIntArray314 = new int[local63];
			this.anIntArray303 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray308 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray118 = new byte[local59];
			this.aByteArray117 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray115 = new byte[local59];
		} else {
			this.aByte6 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray116 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray309 = new int[local59];
		}
		this.aShortArray14 = new short[local59];
		local25.anInt1643 = local101;
		local30.anInt1643 = local182;
		local35.anInt1643 = local188;
		local40.anInt1643 = local107;
		local45.anInt1643 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1223();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1212();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1212();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1212();
			}
			this.anIntArray307[local316] = local310 + local323;
			this.anIntArray304[local316] = local312 + local333;
			this.anIntArray306[local316] = local314 + local343;
			local310 = this.anIntArray307[local316];
			local312 = this.anIntArray304[local316];
			local314 = this.anIntArray306[local316];
			if (local83 == 1) {
				this.anIntArray308[local316] = local45.method1223();
			}
		}
		local25.anInt1643 = local166;
		local30.anInt1643 = local133;
		local35.anInt1643 = local115;
		local40.anInt1643 = local151;
		local45.anInt1643 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray14[local321] = (short) local25.method1244();
			if (local67 == 1) {
				local323 = local30.method1223();
				if ((local323 & 0x1) == 1) {
					this.aByteArray118[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray118[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray117[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray117[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray115[local321] = local35.method1224();
			}
			if (local75 == 1) {
				this.aByteArray116[local321] = local40.method1224();
			}
			if (local79 == 1) {
				this.anIntArray309[local321] = local45.method1223();
			}
		}
		local25.anInt1643 = local160;
		local30.anInt1643 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1223();
			if (local528 == 1) {
				local323 = local25.method1212() + local521;
				local333 = local25.method1212() + local323;
				local343 = local25.method1212() + local333;
				local521 = local343;
				this.anIntArray311[local523] = local323;
				this.anIntArray312[local523] = local333;
				this.anIntArray305[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1212() + local521;
				local521 = local343;
				this.anIntArray311[local523] = local323;
				this.anIntArray312[local523] = local333;
				this.anIntArray305[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1212() + local521;
				local521 = local343;
				this.anIntArray311[local523] = local323;
				this.anIntArray312[local523] = local333;
				this.anIntArray305[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1212() + local521;
				local521 = local343;
				this.anIntArray311[local523] = local323;
				this.anIntArray312[local523] = local631;
				this.anIntArray305[local523] = local343;
			}
		}
		local25.anInt1643 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray315[local528] = local25.method1244();
			this.anIntArray314[local528] = local25.method1244();
			this.anIntArray303[local528] = local25.method1244();
		}
		if (!local18) {
			this.aByteArray117 = null;
		}
		if (!local20) {
			this.aByteArray118 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([Lclient!u;I)V")
	public Class4_Sub4_Sub1_Sub7(@OriginalArg(0) Class4_Sub4_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt2832 = 0;
		this.anInt2826 = 0;
		this.anInt2828 = 0;
		this.aByte6 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class4_Sub4_Sub1_Sub7 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt2832 += local45.anInt2832;
				this.anInt2826 += local45.anInt2826;
				this.anInt2828 += local45.anInt2828;
				if (local45.aByteArray115 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local45.aByte6;
					}
					if (this.aByte6 != local45.aByte6) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray118 != null;
				local22 |= local45.aByteArray116 != null;
				local24 |= local45.anIntArray309 != null;
				local26 |= local45.aByteArray117 != null;
			}
		}
		this.anIntArray307 = new int[this.anInt2832];
		this.anIntArray304 = new int[this.anInt2832];
		this.anIntArray306 = new int[this.anInt2832];
		this.anIntArray308 = new int[this.anInt2832];
		this.anIntArray311 = new int[this.anInt2826];
		this.anIntArray312 = new int[this.anInt2826];
		this.anIntArray305 = new int[this.anInt2826];
		if (this.anInt2828 > 0) {
			this.anIntArray315 = new int[this.anInt2828];
			this.anIntArray314 = new int[this.anInt2828];
			this.anIntArray303 = new int[this.anInt2828];
		}
		if (local18) {
			this.aByteArray118 = new byte[this.anInt2826];
		}
		if (local20) {
			this.aByteArray115 = new byte[this.anInt2826];
		}
		if (local22) {
			this.aByteArray116 = new byte[this.anInt2826];
		}
		if (local26) {
			this.aByteArray117 = new byte[this.anInt2826];
		}
		if (local24) {
			this.anIntArray309 = new int[this.anInt2826];
		}
		this.aShortArray14 = new short[this.anInt2826];
		this.anInt2832 = 0;
		this.anInt2826 = 0;
		this.anInt2828 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class4_Sub4_Sub1_Sub7 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt2826; local244++) {
					if (local18 && local240.aByteArray118 != null) {
						this.aByteArray118[this.anInt2826] = local240.aByteArray118[local244];
					}
					if (local20) {
						if (local240.aByteArray115 == null) {
							this.aByteArray115[this.anInt2826] = local240.aByte6;
						} else {
							this.aByteArray115[this.anInt2826] = local240.aByteArray115[local244];
						}
					}
					if (local22 && local240.aByteArray116 != null) {
						this.aByteArray116[this.anInt2826] = local240.aByteArray116[local244];
					}
					if (local26) {
						if (local240.aByteArray117 == null || local240.aByteArray117[local244] == -1) {
							this.aByteArray117[this.anInt2826] = -1;
						} else {
							this.aByteArray117[this.anInt2826] = (byte) (local240.aByteArray117[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray309 != null) {
						this.anIntArray309[this.anInt2826] = local240.anIntArray309[local244];
					}
					this.aShortArray14[this.anInt2826] = local240.aShortArray14[local244];
					this.anIntArray311[this.anInt2826] = this.method1984(local240, local240.anIntArray311[local244]);
					this.anIntArray312[this.anInt2826] = this.method1984(local240, local240.anIntArray312[local244]);
					this.anIntArray305[this.anInt2826] = this.method1984(local240, local240.anIntArray305[local244]);
					this.anInt2826++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt2828; local397++) {
					this.anIntArray315[this.anInt2828] = this.method1984(local240, local240.anIntArray315[local397]);
					this.anIntArray314[this.anInt2828] = this.method1984(local240, local240.anIntArray314[local397]);
					this.anIntArray303[this.anInt2828] = this.method1984(local240, local240.anIntArray303[local397]);
					this.anInt2828++;
				}
				local233 += local240.anInt2828;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!u;ZZZ)V")
	public Class4_Sub4_Sub1_Sub7(@OriginalArg(0) Class4_Sub4_Sub1_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2832 = arg0.anInt2832;
		this.anInt2826 = arg0.anInt2826;
		this.anInt2828 = arg0.anInt2828;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray307 = arg0.anIntArray307;
			this.anIntArray304 = arg0.anIntArray304;
			this.anIntArray306 = arg0.anIntArray306;
		} else {
			this.anIntArray307 = new int[this.anInt2832];
			this.anIntArray304 = new int[this.anInt2832];
			this.anIntArray306 = new int[this.anInt2832];
			for (local60 = 0; local60 < this.anInt2832; local60++) {
				this.anIntArray307[local60] = arg0.anIntArray307[local60];
				this.anIntArray304[local60] = arg0.anIntArray304[local60];
				this.anIntArray306[local60] = arg0.anIntArray306[local60];
			}
		}
		if (arg2) {
			this.aShortArray14 = arg0.aShortArray14;
		} else {
			this.aShortArray14 = new short[this.anInt2826];
			for (local60 = 0; local60 < this.anInt2826; local60++) {
				this.aShortArray14[local60] = arg0.aShortArray14[local60];
			}
		}
		this.aByteArray116 = arg0.aByteArray116;
		this.anIntArray311 = arg0.anIntArray311;
		this.anIntArray312 = arg0.anIntArray312;
		this.anIntArray305 = arg0.anIntArray305;
		this.aByteArray118 = arg0.aByteArray118;
		this.aByteArray115 = arg0.aByteArray115;
		this.aByteArray117 = arg0.aByteArray117;
		this.aByte6 = arg0.aByte6;
		this.anIntArray315 = arg0.anIntArray315;
		this.anIntArray314 = arg0.anIntArray314;
		this.anIntArray303 = arg0.anIntArray303;
		this.anIntArray308 = arg0.anIntArray308;
		this.anIntArray309 = arg0.anIntArray309;
		this.anIntArrayArray29 = arg0.anIntArrayArray29;
		this.anIntArrayArray30 = arg0.anIntArrayArray30;
		this.aClass57Array2 = arg0.aClass57Array2;
		this.aClass20Array1 = arg0.aClass20Array1;
		this.aClass57Array1 = arg0.aClass57Array1;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!u;I)I")
	private int method1984(@OriginalArg(0) Class4_Sub4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray307[arg1];
		@Pc(11) int local11 = arg0.anIntArray304[arg1];
		@Pc(16) int local16 = arg0.anIntArray306[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2832; local18++) {
			if (local6 == this.anIntArray307[local18] && local11 == this.anIntArray304[local18] && local16 == this.anIntArray306[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray307[this.anInt2832] = local6;
			this.anIntArray304[this.anInt2832] = local11;
			this.anIntArray306[this.anInt2832] = local16;
			if (arg0.anIntArray308 != null) {
				this.anIntArray308[this.anInt2832] = arg0.anIntArray308[arg1];
			}
			local1 = this.anInt2832++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public void method1985() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2832; local1++) {
			@Pc(7) int local7 = this.anIntArray307[local1];
			this.anIntArray307[local1] = this.anIntArray306[local1];
			this.anIntArray306[local1] = -local7;
		}
		this.method1994();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()V")
	public void method1986() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2832; local1++) {
			this.anIntArray306[local1] = -this.anIntArray306[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2826; local18++) {
			@Pc(24) int local24 = this.anIntArray311[local18];
			this.anIntArray311[local18] = this.anIntArray305[local18];
			this.anIntArray305[local18] = local24;
		}
		this.method1994();
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
	public void method1987() {
		if (this.aClass57Array2 != null) {
			return;
		}
		this.aClass57Array2 = new Class57[this.anInt2832];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2832; local10++) {
			this.aClass57Array2[local10] = new Class57();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2826; local25++) {
			@Pc(31) int local31 = this.anIntArray311[local25];
			@Pc(36) int local36 = this.anIntArray312[local25];
			@Pc(41) int local41 = this.anIntArray305[local25];
			@Pc(51) int local51 = this.anIntArray307[local36] - this.anIntArray307[local31];
			@Pc(61) int local61 = this.anIntArray304[local36] - this.anIntArray304[local31];
			@Pc(71) int local71 = this.anIntArray306[local36] - this.anIntArray306[local31];
			@Pc(81) int local81 = this.anIntArray307[local41] - this.anIntArray307[local31];
			@Pc(91) int local91 = this.anIntArray304[local41] - this.anIntArray304[local31];
			@Pc(101) int local101 = this.anIntArray306[local41] - this.anIntArray306[local31];
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
			if (this.aByteArray118 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray118[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class57 local211 = this.aClass57Array2[local31];
				local211.anInt2037 += local109;
				local211.anInt2026 += local117;
				local211.anInt2027 += local125;
				local211.anInt2029++;
				@Pc(240) Class57 local240 = this.aClass57Array2[local36];
				local240.anInt2037 += local109;
				local240.anInt2026 += local117;
				local240.anInt2027 += local125;
				local240.anInt2029++;
				@Pc(269) Class57 local269 = this.aClass57Array2[local41];
				local269.anInt2037 += local109;
				local269.anInt2026 += local117;
				local269.anInt2027 += local125;
				local269.anInt2029++;
			} else if (local198 == 1) {
				if (this.aClass20Array1 == null) {
					this.aClass20Array1 = new Class20[this.anInt2826];
				}
				@Pc(314) Class20 local314 = this.aClass20Array1[local25] = new Class20();
				local314.anInt892 = local109;
				local314.anInt888 = local117;
				local314.anInt890 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "()Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method1989() {
		@Pc(3) Class4_Sub4_Sub1_Sub7 local3 = new Class4_Sub4_Sub1_Sub7();
		if (this.aByteArray118 != null) {
			local3.aByteArray118 = new byte[this.anInt2826];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2826; local13++) {
				local3.aByteArray118[local13] = this.aByteArray118[local13];
			}
		}
		local3.anInt2832 = this.anInt2832;
		local3.anInt2826 = this.anInt2826;
		local3.anInt2828 = this.anInt2828;
		local3.anIntArray307 = this.anIntArray307;
		local3.anIntArray304 = this.anIntArray304;
		local3.anIntArray306 = this.anIntArray306;
		local3.anIntArray311 = this.anIntArray311;
		local3.anIntArray312 = this.anIntArray312;
		local3.anIntArray305 = this.anIntArray305;
		local3.aByteArray115 = this.aByteArray115;
		local3.aByteArray116 = this.aByteArray116;
		local3.aByteArray117 = this.aByteArray117;
		local3.aShortArray14 = this.aShortArray14;
		local3.aByte6 = this.aByte6;
		local3.anIntArray315 = this.anIntArray315;
		local3.anIntArray314 = this.anIntArray314;
		local3.anIntArray303 = this.anIntArray303;
		local3.anIntArray308 = this.anIntArray308;
		local3.anIntArray309 = this.anIntArray309;
		local3.anIntArrayArray29 = this.anIntArrayArray29;
		local3.anIntArrayArray30 = this.anIntArrayArray30;
		local3.aClass57Array2 = this.aClass57Array2;
		local3.aClass20Array1 = this.aClass20Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)V")
	public void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2832; local1++) {
			this.anIntArray307[local1] = this.anIntArray307[local1] * arg0 / 128;
			this.anIntArray304[local1] = this.anIntArray304[local1] * arg1 / 128;
			this.anIntArray306[local1] = this.anIntArray306[local1] * arg2 / 128;
		}
		this.method1994();
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "()V")
	public void method1992() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2832; local1++) {
			this.anIntArray307[local1] = -this.anIntArray307[local1];
			this.anIntArray306[local1] = -this.anIntArray306[local1];
		}
		this.method1994();
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "()V")
	private void method1993() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray308 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2832; local9++) {
				local15 = this.anIntArray308[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray29 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray29[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2832) {
				local65 = this.anIntArray308[local59];
				this.anIntArrayArray29[local65][local5[local65]++] = local59++;
			}
			this.anIntArray308 = null;
		}
		if (this.anIntArray309 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2826; local9++) {
			local15 = this.anIntArray309[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray30 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray30[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2826) {
			local65 = this.anIntArray309[local59];
			this.anIntArrayArray30[local65][local5[local65]++] = local59++;
		}
		this.anIntArray309 = null;
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "()V")
	private void method1994() {
		this.aClass57Array2 = null;
		this.aClass57Array1 = null;
		this.aClass20Array1 = null;
		this.aBoolean118 = false;
	}

	@OriginalMember(owner = "client!u", name = "i", descriptor = "()V")
	public void method1996() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2832; local1++) {
			@Pc(7) int local7 = this.anIntArray306[local1];
			this.anIntArray306[local1] = this.anIntArray307[local1];
			this.anIntArray307[local1] = -local7;
		}
		this.method1994();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(SS)V")
	public void method1998(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2826; local1++) {
			if (this.aShortArray14[local1] == arg0) {
				this.aShortArray14[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIZ)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method1999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class4_Sub4_Sub1_Sub7 local16 = new Class4_Sub4_Sub1_Sub7();
		local16.anInt2832 = this.anInt2832;
		local16.anInt2826 = this.anInt2826;
		local16.anInt2828 = this.anInt2828;
		local16.anIntArray307 = this.anIntArray307;
		local16.anIntArray306 = this.anIntArray306;
		local16.anIntArray311 = this.anIntArray311;
		local16.anIntArray312 = this.anIntArray312;
		local16.anIntArray305 = this.anIntArray305;
		local16.aByteArray118 = this.aByteArray118;
		local16.aByteArray115 = this.aByteArray115;
		local16.aByteArray116 = this.aByteArray116;
		local16.aByteArray117 = this.aByteArray117;
		local16.aShortArray14 = this.aShortArray14;
		local16.aByte6 = this.aByte6;
		local16.anIntArray315 = this.anIntArray315;
		local16.anIntArray314 = this.anIntArray314;
		local16.anIntArray303 = this.anIntArray303;
		local16.anIntArray308 = this.anIntArray308;
		local16.anIntArray309 = this.anIntArray309;
		local16.anIntArrayArray29 = this.anIntArrayArray29;
		local16.anIntArrayArray30 = this.anIntArrayArray30;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray304 = new int[local16.anInt2832];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt2832; local128++) {
			@Pc(134) int local134 = this.anIntArray307[local128];
			@Pc(139) int local139 = this.anIntArray304[local128];
			@Pc(144) int local144 = this.anIntArray306[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray304[local128] = local139 + local180 - local126;
		}
		local16.method1994();
		return local16;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(III)V")
	public void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2832; local1++) {
			this.anIntArray307[local1] += arg0;
			this.anIntArray304[local1] += arg1;
			this.anIntArray306[local1] += arg2;
		}
		this.method1994();
	}

	@OriginalMember(owner = "client!u", name = "j", descriptor = "()V")
	public void method2002() {
		if (this.aBoolean118) {
			return;
		}
		super.anInt2816 = 0;
		this.anInt2831 = 0;
		this.anInt2830 = 999999;
		this.anInt2825 = -999999;
		this.anInt2824 = -99999;
		this.anInt2829 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2832; local23++) {
			@Pc(29) int local29 = this.anIntArray307[local23];
			@Pc(34) int local34 = this.anIntArray304[local23];
			@Pc(39) int local39 = this.anIntArray306[local23];
			if (local29 < this.anInt2830) {
				this.anInt2830 = local29;
			}
			if (local29 > this.anInt2825) {
				this.anInt2825 = local29;
			}
			if (local39 < this.anInt2829) {
				this.anInt2829 = local39;
			}
			if (local39 > this.anInt2824) {
				this.anInt2824 = local39;
			}
			if (-local34 > super.anInt2816) {
				super.anInt2816 = -local34;
			}
			if (local34 > this.anInt2831) {
				this.anInt2831 = local34;
			}
		}
		this.aBoolean118 = true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1987();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class4_Sub4_Sub1_Sub6 local26 = new Class4_Sub4_Sub1_Sub6();
		local26.anIntArray251 = new int[this.anInt2826];
		local26.anIntArray253 = new int[this.anInt2826];
		local26.anIntArray249 = new int[this.anInt2826];
		for (@Pc(43) int local43 = 0; local43 < this.anInt2826; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray118 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray118[local43];
			}
			@Pc(92) Class57 local92;
			@Pc(123) int local123;
			@Pc(253) Class20 local253;
			if (this.aByteArray117 == null || this.aByteArray117[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray14[local43] & 0xFFFF;
					if (this.aClass57Array1 == null || this.aClass57Array1[this.anIntArray311[local43]] == null) {
						local92 = this.aClass57Array2[this.anIntArray311[local43]];
					} else {
						local92 = this.aClass57Array1[this.anIntArray311[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2037 + arg3 * local92.anInt2026 + arg4 * local92.anInt2027) / (local22 * local92.anInt2029);
					local26.anIntArray251[local43] = Static118.method1997(local73, local123);
					if (this.aClass57Array1 == null || this.aClass57Array1[this.anIntArray312[local43]] == null) {
						local92 = this.aClass57Array2[this.anIntArray312[local43]];
					} else {
						local92 = this.aClass57Array1[this.anIntArray312[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2037 + arg3 * local92.anInt2026 + arg4 * local92.anInt2027) / (local22 * local92.anInt2029);
					local26.anIntArray253[local43] = Static118.method1997(local73, local123);
					if (this.aClass57Array1 == null || this.aClass57Array1[this.anIntArray305[local43]] == null) {
						local92 = this.aClass57Array2[this.anIntArray305[local43]];
					} else {
						local92 = this.aClass57Array1[this.anIntArray305[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2037 + arg3 * local92.anInt2026 + arg4 * local92.anInt2027) / (local22 * local92.anInt2029);
					local26.anIntArray249[local43] = Static118.method1997(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass20Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt892 + arg3 * local253.anInt888 + arg4 * local253.anInt890) / (local22 + local22 / 2);
					local26.anIntArray251[local43] = Static118.method1997(this.aShortArray14[local43] & 0xFFFF, local123);
					local26.anIntArray249[local43] = -1;
				} else {
					local26.anIntArray249[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass57Array1 == null || this.aClass57Array1[this.anIntArray311[local43]] == null) {
					local92 = this.aClass57Array2[this.anIntArray311[local43]];
				} else {
					local92 = this.aClass57Array1[this.anIntArray311[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2037 + arg3 * local92.anInt2026 + arg4 * local92.anInt2027) / (local22 * local92.anInt2029);
				local26.anIntArray251[local43] = Static118.method1988(local123);
				if (this.aClass57Array1 == null || this.aClass57Array1[this.anIntArray312[local43]] == null) {
					local92 = this.aClass57Array2[this.anIntArray312[local43]];
				} else {
					local92 = this.aClass57Array1[this.anIntArray312[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2037 + arg3 * local92.anInt2026 + arg4 * local92.anInt2027) / (local22 * local92.anInt2029);
				local26.anIntArray253[local43] = Static118.method1988(local123);
				if (this.aClass57Array1 == null || this.aClass57Array1[this.anIntArray305[local43]] == null) {
					local92 = this.aClass57Array2[this.anIntArray305[local43]];
				} else {
					local92 = this.aClass57Array1[this.anIntArray305[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2037 + arg3 * local92.anInt2026 + arg4 * local92.anInt2027) / (local22 * local92.anInt2029);
				local26.anIntArray249[local43] = Static118.method1988(local123);
			} else if (local49 == 1) {
				local253 = this.aClass20Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt892 + arg3 * local253.anInt888 + arg4 * local253.anInt890) / (local22 + local22 / 2);
				local26.anIntArray251[local43] = Static118.method1988(local123);
				local26.anIntArray249[local43] = -1;
			} else {
				local26.anIntArray249[local43] = -2;
			}
		}
		this.method1993();
		local26.anInt2454 = this.anInt2832;
		local26.anIntArray256 = this.anIntArray307;
		local26.anIntArray246 = this.anIntArray304;
		local26.anIntArray254 = this.anIntArray306;
		local26.anInt2457 = this.anInt2826;
		local26.anIntArray245 = this.anIntArray311;
		local26.anIntArray252 = this.anIntArray312;
		local26.anIntArray247 = this.anIntArray305;
		local26.aByteArray104 = this.aByteArray115;
		local26.aByteArray102 = this.aByteArray116;
		local26.aByteArray101 = this.aByteArray117;
		if (local26.aByteArray101 == null) {
			local26.aShortArray13 = null;
		} else {
			local26.aShortArray13 = this.aShortArray14;
		}
		local26.aByte4 = this.aByte6;
		local26.anInt2451 = this.anInt2828;
		local26.anIntArray250 = this.anIntArray315;
		local26.anIntArray255 = this.anIntArray314;
		local26.anIntArray248 = this.anIntArray303;
		local26.anIntArrayArray25 = this.anIntArrayArray29;
		local26.anIntArrayArray24 = this.anIntArrayArray30;
		return local26;
	}
}
