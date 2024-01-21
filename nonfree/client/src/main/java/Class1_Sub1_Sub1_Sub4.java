import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!nf", name = "Ib", descriptor = "[I")
	public static int[] anIntArray289 = new int[128];

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!nf", name = "qb", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!nf", name = "rb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!nf", name = "sb", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!nf", name = "tb", descriptor = "I")
	public int anInt2169;

	@OriginalMember(owner = "client!nf", name = "ub", descriptor = "[Lclient!jb;")
	public Class37[] aClass37Array1;

	@OriginalMember(owner = "client!nf", name = "vb", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!nf", name = "wb", descriptor = "I")
	public int anInt2170;

	@OriginalMember(owner = "client!nf", name = "xb", descriptor = "I")
	public int anInt2171;

	@OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
	public int anInt2173;

	@OriginalMember(owner = "client!nf", name = "Ab", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!nf", name = "Cb", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!nf", name = "Fb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!nf", name = "Gb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!nf", name = "Hb", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!nf", name = "Jb", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!nf", name = "Kb", descriptor = "[Lclient!ed;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!nf", name = "Lb", descriptor = "[Lclient!jb;")
	public Class37[] aClass37Array2;

	@OriginalMember(owner = "client!nf", name = "Mb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!nf", name = "Ob", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!nf", name = "Pb", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!nf", name = "Qb", descriptor = "I")
	public int anInt2176;

	@OriginalMember(owner = "client!nf", name = "Rb", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!nf", name = "Tb", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!nf", name = "Ub", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!nf", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
	public int anInt2168 = 0;

	@OriginalMember(owner = "client!nf", name = "yb", descriptor = "I")
	private int anInt2172 = 0;

	@OriginalMember(owner = "client!nf", name = "Nb", descriptor = "I")
	public int anInt2175 = 0;

	@OriginalMember(owner = "client!nf", name = "Sb", descriptor = "Z")
	private boolean aBoolean118 = false;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray289[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray289[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray289[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray289[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray289[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub1_Sub4() {
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class1_Sub19 local25 = new Class1_Sub19(arg0);
		@Pc(30) Class1_Sub19 local30 = new Class1_Sub19(arg0);
		@Pc(35) Class1_Sub19 local35 = new Class1_Sub19(arg0);
		@Pc(40) Class1_Sub19 local40 = new Class1_Sub19(arg0);
		@Pc(45) Class1_Sub19 local45 = new Class1_Sub19(arg0);
		local25.anInt3111 = arg0.length - 18;
		@Pc(55) int local55 = local25.method2051();
		@Pc(59) int local59 = local25.method2051();
		@Pc(63) int local63 = local25.method2072();
		@Pc(67) int local67 = local25.method2072();
		@Pc(71) int local71 = local25.method2072();
		@Pc(75) int local75 = local25.method2072();
		@Pc(79) int local79 = local25.method2072();
		@Pc(83) int local83 = local25.method2072();
		@Pc(87) int local87 = local25.method2051();
		@Pc(91) int local91 = local25.method2051();
		@Pc(95) int local95 = local25.method2051();
		@Pc(99) int local99 = local25.method2051();
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
		this.anInt2168 = local55;
		this.anInt2175 = local59;
		this.anInt2172 = local63;
		this.anIntArray281 = new int[local55];
		this.anIntArray285 = new int[local55];
		this.anIntArray279 = new int[local55];
		this.anIntArray282 = new int[local59];
		this.anIntArray286 = new int[local59];
		this.anIntArray290 = new int[local59];
		if (local63 > 0) {
			this.anIntArray283 = new int[local63];
			this.anIntArray284 = new int[local63];
			this.anIntArray280 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray291 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray37 = new byte[local59];
			this.aByteArray34 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray35 = new byte[local59];
		} else {
			this.aByte9 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray36 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray292 = new int[local59];
		}
		this.aShortArray11 = new short[local59];
		local25.anInt3111 = local101;
		local30.anInt3111 = local182;
		local35.anInt3111 = local188;
		local40.anInt3111 = local107;
		local45.anInt3111 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method2072();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method2060();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method2060();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method2060();
			}
			this.anIntArray281[local316] = local310 + local323;
			this.anIntArray285[local316] = local312 + local333;
			this.anIntArray279[local316] = local314 + local343;
			local310 = this.anIntArray281[local316];
			local312 = this.anIntArray285[local316];
			local314 = this.anIntArray279[local316];
			if (local83 == 1) {
				this.anIntArray291[local316] = local45.method2072();
			}
		}
		local25.anInt3111 = local166;
		local30.anInt3111 = local133;
		local35.anInt3111 = local115;
		local40.anInt3111 = local151;
		local45.anInt3111 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray11[local321] = (short) local25.method2051();
			if (local67 == 1) {
				local323 = local30.method2072();
				if ((local323 & 0x1) == 1) {
					this.aByteArray37[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray37[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray34[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray34[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray35[local321] = local35.method2086();
			}
			if (local75 == 1) {
				this.aByteArray36[local321] = local40.method2086();
			}
			if (local79 == 1) {
				this.anIntArray292[local321] = local45.method2072();
			}
		}
		local25.anInt3111 = local160;
		local30.anInt3111 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method2072();
			if (local528 == 1) {
				local323 = local25.method2060() + local521;
				local333 = local25.method2060() + local323;
				local343 = local25.method2060() + local333;
				local521 = local343;
				this.anIntArray282[local523] = local323;
				this.anIntArray286[local523] = local333;
				this.anIntArray290[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method2060() + local521;
				local521 = local343;
				this.anIntArray282[local523] = local323;
				this.anIntArray286[local523] = local333;
				this.anIntArray290[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method2060() + local521;
				local521 = local343;
				this.anIntArray282[local523] = local323;
				this.anIntArray286[local523] = local333;
				this.anIntArray290[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method2060() + local521;
				local521 = local343;
				this.anIntArray282[local523] = local323;
				this.anIntArray286[local523] = local631;
				this.anIntArray290[local523] = local343;
			}
		}
		local25.anInt3111 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray283[local528] = local25.method2051();
			this.anIntArray284[local528] = local25.method2051();
			this.anIntArray280[local528] = local25.method2051();
		}
		if (!local18) {
			this.aByteArray34 = null;
		}
		if (!local20) {
			this.aByteArray37 = null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([Lclient!nf;I)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) Class1_Sub1_Sub1_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt2168 = 0;
		this.anInt2175 = 0;
		this.anInt2172 = 0;
		this.aByte9 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class1_Sub1_Sub1_Sub4 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt2168 += local45.anInt2168;
				this.anInt2175 += local45.anInt2175;
				this.anInt2172 += local45.anInt2172;
				if (local45.aByteArray35 == null) {
					if (this.aByte9 == -1) {
						this.aByte9 = local45.aByte9;
					}
					if (this.aByte9 != local45.aByte9) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray37 != null;
				local22 |= local45.aByteArray36 != null;
				local24 |= local45.anIntArray292 != null;
				local26 |= local45.aByteArray34 != null;
			}
		}
		this.anIntArray281 = new int[this.anInt2168];
		this.anIntArray285 = new int[this.anInt2168];
		this.anIntArray279 = new int[this.anInt2168];
		this.anIntArray291 = new int[this.anInt2168];
		this.anIntArray282 = new int[this.anInt2175];
		this.anIntArray286 = new int[this.anInt2175];
		this.anIntArray290 = new int[this.anInt2175];
		if (this.anInt2172 > 0) {
			this.anIntArray283 = new int[this.anInt2172];
			this.anIntArray284 = new int[this.anInt2172];
			this.anIntArray280 = new int[this.anInt2172];
		}
		if (local18) {
			this.aByteArray37 = new byte[this.anInt2175];
		}
		if (local20) {
			this.aByteArray35 = new byte[this.anInt2175];
		}
		if (local22) {
			this.aByteArray36 = new byte[this.anInt2175];
		}
		if (local26) {
			this.aByteArray34 = new byte[this.anInt2175];
		}
		if (local24) {
			this.anIntArray292 = new int[this.anInt2175];
		}
		this.aShortArray11 = new short[this.anInt2175];
		this.anInt2168 = 0;
		this.anInt2175 = 0;
		this.anInt2172 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class1_Sub1_Sub1_Sub4 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt2175; local244++) {
					if (local18 && local240.aByteArray37 != null) {
						this.aByteArray37[this.anInt2175] = local240.aByteArray37[local244];
					}
					if (local20) {
						if (local240.aByteArray35 == null) {
							this.aByteArray35[this.anInt2175] = local240.aByte9;
						} else {
							this.aByteArray35[this.anInt2175] = local240.aByteArray35[local244];
						}
					}
					if (local22 && local240.aByteArray36 != null) {
						this.aByteArray36[this.anInt2175] = local240.aByteArray36[local244];
					}
					if (local26) {
						if (local240.aByteArray34 == null || local240.aByteArray34[local244] == -1) {
							this.aByteArray34[this.anInt2175] = -1;
						} else {
							this.aByteArray34[this.anInt2175] = (byte) (local240.aByteArray34[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray292 != null) {
						this.anIntArray292[this.anInt2175] = local240.anIntArray292[local244];
					}
					this.aShortArray11[this.anInt2175] = local240.aShortArray11[local244];
					this.anIntArray282[this.anInt2175] = this.method1411(local240, local240.anIntArray282[local244]);
					this.anIntArray286[this.anInt2175] = this.method1411(local240, local240.anIntArray286[local244]);
					this.anIntArray290[this.anInt2175] = this.method1411(local240, local240.anIntArray290[local244]);
					this.anInt2175++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt2172; local397++) {
					this.anIntArray283[this.anInt2172] = this.method1411(local240, local240.anIntArray283[local397]);
					this.anIntArray284[this.anInt2172] = this.method1411(local240, local240.anIntArray284[local397]);
					this.anIntArray280[this.anInt2172] = this.method1411(local240, local240.anIntArray280[local397]);
					this.anInt2172++;
				}
				local233 += local240.anInt2172;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!nf;ZZZ)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2168 = arg0.anInt2168;
		this.anInt2175 = arg0.anInt2175;
		this.anInt2172 = arg0.anInt2172;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray281 = arg0.anIntArray281;
			this.anIntArray285 = arg0.anIntArray285;
			this.anIntArray279 = arg0.anIntArray279;
		} else {
			this.anIntArray281 = new int[this.anInt2168];
			this.anIntArray285 = new int[this.anInt2168];
			this.anIntArray279 = new int[this.anInt2168];
			for (local60 = 0; local60 < this.anInt2168; local60++) {
				this.anIntArray281[local60] = arg0.anIntArray281[local60];
				this.anIntArray285[local60] = arg0.anIntArray285[local60];
				this.anIntArray279[local60] = arg0.anIntArray279[local60];
			}
		}
		if (arg2) {
			this.aShortArray11 = arg0.aShortArray11;
		} else {
			this.aShortArray11 = new short[this.anInt2175];
			for (local60 = 0; local60 < this.anInt2175; local60++) {
				this.aShortArray11[local60] = arg0.aShortArray11[local60];
			}
		}
		this.aByteArray36 = arg0.aByteArray36;
		this.anIntArray282 = arg0.anIntArray282;
		this.anIntArray286 = arg0.anIntArray286;
		this.anIntArray290 = arg0.anIntArray290;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByte9 = arg0.aByte9;
		this.anIntArray283 = arg0.anIntArray283;
		this.anIntArray284 = arg0.anIntArray284;
		this.anIntArray280 = arg0.anIntArray280;
		this.anIntArray291 = arg0.anIntArray291;
		this.anIntArray292 = arg0.anIntArray292;
		this.anIntArrayArray22 = arg0.anIntArrayArray22;
		this.anIntArrayArray21 = arg0.anIntArrayArray21;
		this.aClass37Array2 = arg0.aClass37Array2;
		this.aClass20Array1 = arg0.aClass20Array1;
		this.aClass37Array1 = arg0.aClass37Array1;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1421();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class1_Sub1_Sub1_Sub2 local26 = new Class1_Sub1_Sub1_Sub2();
		local26.anIntArray182 = new int[this.anInt2175];
		local26.anIntArray186 = new int[this.anInt2175];
		local26.anIntArray190 = new int[this.anInt2175];
		for (@Pc(43) int local43 = 0; local43 < this.anInt2175; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray37 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray37[local43];
			}
			@Pc(92) Class37 local92;
			@Pc(123) int local123;
			@Pc(253) Class20 local253;
			if (this.aByteArray34 == null || this.aByteArray34[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray11[local43] & 0xFFFF;
					if (this.aClass37Array1 == null || this.aClass37Array1[this.anIntArray282[local43]] == null) {
						local92 = this.aClass37Array2[this.anIntArray282[local43]];
					} else {
						local92 = this.aClass37Array1[this.anIntArray282[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1628 + arg3 * local92.anInt1634 + arg4 * local92.anInt1630) / (local22 * local92.anInt1627);
					local26.anIntArray182[local43] = Static83.method1423(local73, local123);
					if (this.aClass37Array1 == null || this.aClass37Array1[this.anIntArray286[local43]] == null) {
						local92 = this.aClass37Array2[this.anIntArray286[local43]];
					} else {
						local92 = this.aClass37Array1[this.anIntArray286[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1628 + arg3 * local92.anInt1634 + arg4 * local92.anInt1630) / (local22 * local92.anInt1627);
					local26.anIntArray186[local43] = Static83.method1423(local73, local123);
					if (this.aClass37Array1 == null || this.aClass37Array1[this.anIntArray290[local43]] == null) {
						local92 = this.aClass37Array2[this.anIntArray290[local43]];
					} else {
						local92 = this.aClass37Array1[this.anIntArray290[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1628 + arg3 * local92.anInt1634 + arg4 * local92.anInt1630) / (local22 * local92.anInt1627);
					local26.anIntArray190[local43] = Static83.method1423(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass20Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt918 + arg3 * local253.anInt907 + arg4 * local253.anInt914) / (local22 + local22 / 2);
					local26.anIntArray182[local43] = Static83.method1423(this.aShortArray11[local43] & 0xFFFF, local123);
					local26.anIntArray190[local43] = -1;
				} else {
					local26.anIntArray190[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass37Array1 == null || this.aClass37Array1[this.anIntArray282[local43]] == null) {
					local92 = this.aClass37Array2[this.anIntArray282[local43]];
				} else {
					local92 = this.aClass37Array1[this.anIntArray282[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1628 + arg3 * local92.anInt1634 + arg4 * local92.anInt1630) / (local22 * local92.anInt1627);
				local26.anIntArray182[local43] = Static83.method1418(local123);
				if (this.aClass37Array1 == null || this.aClass37Array1[this.anIntArray286[local43]] == null) {
					local92 = this.aClass37Array2[this.anIntArray286[local43]];
				} else {
					local92 = this.aClass37Array1[this.anIntArray286[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1628 + arg3 * local92.anInt1634 + arg4 * local92.anInt1630) / (local22 * local92.anInt1627);
				local26.anIntArray186[local43] = Static83.method1418(local123);
				if (this.aClass37Array1 == null || this.aClass37Array1[this.anIntArray290[local43]] == null) {
					local92 = this.aClass37Array2[this.anIntArray290[local43]];
				} else {
					local92 = this.aClass37Array1[this.anIntArray290[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1628 + arg3 * local92.anInt1634 + arg4 * local92.anInt1630) / (local22 * local92.anInt1627);
				local26.anIntArray190[local43] = Static83.method1418(local123);
			} else if (local49 == 1) {
				local253 = this.aClass20Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt918 + arg3 * local253.anInt907 + arg4 * local253.anInt914) / (local22 + local22 / 2);
				local26.anIntArray182[local43] = Static83.method1418(local123);
				local26.anIntArray190[local43] = -1;
			} else {
				local26.anIntArray190[local43] = -2;
			}
		}
		this.method1419();
		local26.anInt1711 = this.anInt2168;
		local26.anIntArray185 = this.anIntArray281;
		local26.anIntArray188 = this.anIntArray285;
		local26.anIntArray180 = this.anIntArray279;
		local26.anInt1704 = this.anInt2175;
		local26.anIntArray181 = this.anIntArray282;
		local26.anIntArray183 = this.anIntArray286;
		local26.anIntArray187 = this.anIntArray290;
		local26.aByteArray22 = this.aByteArray35;
		local26.aByteArray24 = this.aByteArray36;
		local26.aByteArray23 = this.aByteArray34;
		if (local26.aByteArray23 == null) {
			local26.aShortArray5 = null;
		} else {
			local26.aShortArray5 = this.aShortArray11;
		}
		local26.aByte6 = this.aByte9;
		local26.anInt1708 = this.anInt2172;
		local26.anIntArray189 = this.anIntArray283;
		local26.anIntArray184 = this.anIntArray284;
		local26.anIntArray191 = this.anIntArray280;
		local26.anIntArrayArray12 = this.anIntArrayArray22;
		local26.anIntArrayArray11 = this.anIntArrayArray21;
		return local26;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!nf;I)I")
	private int method1411(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray281[arg1];
		@Pc(11) int local11 = arg0.anIntArray285[arg1];
		@Pc(16) int local16 = arg0.anIntArray279[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2168; local18++) {
			if (local6 == this.anIntArray281[local18] && local11 == this.anIntArray285[local18] && local16 == this.anIntArray279[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray281[this.anInt2168] = local6;
			this.anIntArray285[this.anInt2168] = local11;
			this.anIntArray279[this.anInt2168] = local16;
			if (arg0.anIntArray291 != null) {
				this.anIntArray291[this.anInt2168] = arg0.anIntArray291[arg1];
			}
			local1 = this.anInt2168++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method1413() {
		@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = new Class1_Sub1_Sub1_Sub4();
		if (this.aByteArray37 != null) {
			local3.aByteArray37 = new byte[this.anInt2175];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2175; local13++) {
				local3.aByteArray37[local13] = this.aByteArray37[local13];
			}
		}
		local3.anInt2168 = this.anInt2168;
		local3.anInt2175 = this.anInt2175;
		local3.anInt2172 = this.anInt2172;
		local3.anIntArray281 = this.anIntArray281;
		local3.anIntArray285 = this.anIntArray285;
		local3.anIntArray279 = this.anIntArray279;
		local3.anIntArray282 = this.anIntArray282;
		local3.anIntArray286 = this.anIntArray286;
		local3.anIntArray290 = this.anIntArray290;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray36 = this.aByteArray36;
		local3.aByteArray34 = this.aByteArray34;
		local3.aShortArray11 = this.aShortArray11;
		local3.aByte9 = this.aByte9;
		local3.anIntArray283 = this.anIntArray283;
		local3.anIntArray284 = this.anIntArray284;
		local3.anIntArray280 = this.anIntArray280;
		local3.anIntArray291 = this.anIntArray291;
		local3.anIntArray292 = this.anIntArray292;
		local3.anIntArrayArray22 = this.anIntArrayArray22;
		local3.anIntArrayArray21 = this.anIntArrayArray21;
		local3.aClass37Array2 = this.aClass37Array2;
		local3.aClass20Array1 = this.aClass20Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(SS)V")
	public void method1415(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2175; local1++) {
			if (this.aShortArray11[local1] == arg0) {
				this.aShortArray11[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	public void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2168; local1++) {
			this.anIntArray281[local1] += arg0;
			this.anIntArray285[local1] += arg1;
			this.anIntArray279[local1] += arg2;
		}
		this.method1424();
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()V")
	public void method1417() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2168; local1++) {
			this.anIntArray281[local1] = -this.anIntArray281[local1];
			this.anIntArray279[local1] = -this.anIntArray279[local1];
		}
		this.method1424();
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "()V")
	private void method1419() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray291 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2168; local9++) {
				local15 = this.anIntArray291[local9];
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
			while (local59 < this.anInt2168) {
				local65 = this.anIntArray291[local59];
				this.anIntArrayArray22[local65][local5[local65]++] = local59++;
			}
			this.anIntArray291 = null;
		}
		if (this.anIntArray292 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2175; local9++) {
			local15 = this.anIntArray292[local9];
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
		while (local59 < this.anInt2175) {
			local65 = this.anIntArray292[local59];
			this.anIntArrayArray21[local65][local5[local65]++] = local59++;
		}
		this.anIntArray292 = null;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "()V")
	public void method1420() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2168; local1++) {
			this.anIntArray279[local1] = -this.anIntArray279[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2175; local18++) {
			@Pc(24) int local24 = this.anIntArray282[local18];
			this.anIntArray282[local18] = this.anIntArray290[local18];
			this.anIntArray290[local18] = local24;
		}
		this.method1424();
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "()V")
	public void method1421() {
		if (this.aClass37Array2 != null) {
			return;
		}
		this.aClass37Array2 = new Class37[this.anInt2168];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2168; local10++) {
			this.aClass37Array2[local10] = new Class37();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2175; local25++) {
			@Pc(31) int local31 = this.anIntArray282[local25];
			@Pc(36) int local36 = this.anIntArray286[local25];
			@Pc(41) int local41 = this.anIntArray290[local25];
			@Pc(51) int local51 = this.anIntArray281[local36] - this.anIntArray281[local31];
			@Pc(61) int local61 = this.anIntArray285[local36] - this.anIntArray285[local31];
			@Pc(71) int local71 = this.anIntArray279[local36] - this.anIntArray279[local31];
			@Pc(81) int local81 = this.anIntArray281[local41] - this.anIntArray281[local31];
			@Pc(91) int local91 = this.anIntArray285[local41] - this.anIntArray285[local31];
			@Pc(101) int local101 = this.anIntArray279[local41] - this.anIntArray279[local31];
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
			if (this.aByteArray37 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray37[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class37 local211 = this.aClass37Array2[local31];
				local211.anInt1628 += local109;
				local211.anInt1634 += local117;
				local211.anInt1630 += local125;
				local211.anInt1627++;
				@Pc(240) Class37 local240 = this.aClass37Array2[local36];
				local240.anInt1628 += local109;
				local240.anInt1634 += local117;
				local240.anInt1630 += local125;
				local240.anInt1627++;
				@Pc(269) Class37 local269 = this.aClass37Array2[local41];
				local269.anInt1628 += local109;
				local269.anInt1634 += local117;
				local269.anInt1630 += local125;
				local269.anInt1627++;
			} else if (local198 == 1) {
				if (this.aClass20Array1 == null) {
					this.aClass20Array1 = new Class20[this.anInt2175];
				}
				@Pc(314) Class20 local314 = this.aClass20Array1[local25] = new Class20();
				local314.anInt918 = local109;
				local314.anInt907 = local117;
				local314.anInt914 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "()V")
	public void method1422() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2168; local1++) {
			@Pc(7) int local7 = this.anIntArray281[local1];
			this.anIntArray281[local1] = this.anIntArray279[local1];
			this.anIntArray279[local1] = -local7;
		}
		this.method1424();
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "()V")
	private void method1424() {
		this.aClass37Array2 = null;
		this.aClass37Array1 = null;
		this.aClass20Array1 = null;
		this.aBoolean118 = false;
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "()V")
	public void method1425() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2168; local1++) {
			@Pc(7) int local7 = this.anIntArray279[local1];
			this.anIntArray279[local1] = this.anIntArray281[local1];
			this.anIntArray281[local1] = -local7;
		}
		this.method1424();
	}

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "()V")
	public void method1426() {
		if (this.aBoolean118) {
			return;
		}
		super.anInt2759 = 0;
		this.anInt2170 = 0;
		this.anInt2169 = 999999;
		this.anInt2171 = -999999;
		this.anInt2173 = -99999;
		this.anInt2176 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2168; local23++) {
			@Pc(29) int local29 = this.anIntArray281[local23];
			@Pc(34) int local34 = this.anIntArray285[local23];
			@Pc(39) int local39 = this.anIntArray279[local23];
			if (local29 < this.anInt2169) {
				this.anInt2169 = local29;
			}
			if (local29 > this.anInt2171) {
				this.anInt2171 = local29;
			}
			if (local39 < this.anInt2176) {
				this.anInt2176 = local39;
			}
			if (local39 > this.anInt2173) {
				this.anInt2173 = local39;
			}
			if (-local34 > super.anInt2759) {
				super.anInt2759 = -local34;
			}
			if (local34 > this.anInt2170) {
				this.anInt2170 = local34;
			}
		}
		this.aBoolean118 = true;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
	public void method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2168; local1++) {
			this.anIntArray281[local1] = this.anIntArray281[local1] * arg0 / 128;
			this.anIntArray285[local1] = this.anIntArray285[local1] * arg1 / 128;
			this.anIntArray279[local1] = this.anIntArray279[local1] * arg2 / 128;
		}
		this.method1424();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIZ)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub1_Sub1_Sub4 local16 = new Class1_Sub1_Sub1_Sub4();
		local16.anInt2168 = this.anInt2168;
		local16.anInt2175 = this.anInt2175;
		local16.anInt2172 = this.anInt2172;
		local16.anIntArray281 = this.anIntArray281;
		local16.anIntArray279 = this.anIntArray279;
		local16.anIntArray282 = this.anIntArray282;
		local16.anIntArray286 = this.anIntArray286;
		local16.anIntArray290 = this.anIntArray290;
		local16.aByteArray37 = this.aByteArray37;
		local16.aByteArray35 = this.aByteArray35;
		local16.aByteArray36 = this.aByteArray36;
		local16.aByteArray34 = this.aByteArray34;
		local16.aShortArray11 = this.aShortArray11;
		local16.aByte9 = this.aByte9;
		local16.anIntArray283 = this.anIntArray283;
		local16.anIntArray284 = this.anIntArray284;
		local16.anIntArray280 = this.anIntArray280;
		local16.anIntArray291 = this.anIntArray291;
		local16.anIntArray292 = this.anIntArray292;
		local16.anIntArrayArray22 = this.anIntArrayArray22;
		local16.anIntArrayArray21 = this.anIntArrayArray21;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray285 = new int[local16.anInt2168];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt2168; local128++) {
			@Pc(134) int local134 = this.anIntArray281[local128];
			@Pc(139) int local139 = this.anIntArray285[local128];
			@Pc(144) int local144 = this.anIntArray279[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray285[local128] = local139 + local180 - local126;
		}
		local16.method1424();
		return local16;
	}
}
