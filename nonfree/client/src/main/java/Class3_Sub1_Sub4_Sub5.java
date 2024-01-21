import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class3_Sub1_Sub4_Sub5 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!lc", name = "ub", descriptor = "[I")
	public static int[] anIntArray217 = new int[128];

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!lc", name = "fb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!lc", name = "gb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!lc", name = "hb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!lc", name = "ib", descriptor = "[Lclient!ld;")
	public Class47[] aClass47Array1;

	@OriginalMember(owner = "client!lc", name = "jb", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!lc", name = "kb", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!lc", name = "nb", descriptor = "I")
	public int anInt1711;

	@OriginalMember(owner = "client!lc", name = "ob", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!lc", name = "pb", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!lc", name = "qb", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!lc", name = "rb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!lc", name = "sb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!lc", name = "tb", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!lc", name = "vb", descriptor = "[Lclient!pe;")
	private Class61[] aClass61Array1;

	@OriginalMember(owner = "client!lc", name = "wb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!lc", name = "xb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!lc", name = "yb", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!lc", name = "Ab", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!lc", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!lc", name = "Cb", descriptor = "I")
	public int anInt1714;

	@OriginalMember(owner = "client!lc", name = "Gb", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "Hb", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!lc", name = "Jb", descriptor = "I")
	public int anInt1717;

	@OriginalMember(owner = "client!lc", name = "Kb", descriptor = "[Lclient!ld;")
	public Class47[] aClass47Array2;

	@OriginalMember(owner = "client!lc", name = "Lb", descriptor = "I")
	public int anInt1718;

	@OriginalMember(owner = "client!lc", name = "Nb", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!lc", name = "lb", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!lc", name = "Eb", descriptor = "I")
	private int anInt1715 = 0;

	@OriginalMember(owner = "client!lc", name = "Fb", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!lc", name = "zb", descriptor = "I")
	public int anInt1712 = 0;

	@OriginalMember(owner = "client!lc", name = "Mb", descriptor = "I")
	public int anInt1719 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray217[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray217[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray217[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray217[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray217[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class3_Sub1_Sub4_Sub5() {
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub4_Sub5(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class3_Sub7 local25 = new Class3_Sub7(arg0);
		@Pc(30) Class3_Sub7 local30 = new Class3_Sub7(arg0);
		@Pc(35) Class3_Sub7 local35 = new Class3_Sub7(arg0);
		@Pc(40) Class3_Sub7 local40 = new Class3_Sub7(arg0);
		@Pc(45) Class3_Sub7 local45 = new Class3_Sub7(arg0);
		local25.anInt964 = arg0.length - 18;
		@Pc(55) int local55 = local25.method602();
		@Pc(59) int local59 = local25.method602();
		@Pc(63) int local63 = local25.method647();
		@Pc(67) int local67 = local25.method647();
		@Pc(71) int local71 = local25.method647();
		@Pc(75) int local75 = local25.method647();
		@Pc(79) int local79 = local25.method647();
		@Pc(83) int local83 = local25.method647();
		@Pc(87) int local87 = local25.method602();
		@Pc(91) int local91 = local25.method602();
		@Pc(95) int local95 = local25.method602();
		@Pc(99) int local99 = local25.method602();
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
		this.anInt1719 = local55;
		this.anInt1712 = local59;
		this.anInt1715 = local63;
		this.anIntArray214 = new int[local55];
		this.anIntArray210 = new int[local55];
		this.anIntArray216 = new int[local55];
		this.anIntArray209 = new int[local59];
		this.anIntArray213 = new int[local59];
		this.anIntArray211 = new int[local59];
		if (local63 > 0) {
			this.anIntArray221 = new int[local63];
			this.anIntArray219 = new int[local63];
			this.anIntArray218 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray215 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray36 = new byte[local59];
			this.aByteArray38 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray37 = new byte[local59];
		} else {
			this.aByte2 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray35 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray208 = new int[local59];
		}
		this.aShortArray11 = new short[local59];
		local25.anInt964 = local101;
		local30.anInt964 = local182;
		local35.anInt964 = local188;
		local40.anInt964 = local107;
		local45.anInt964 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method647();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method635();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method635();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method635();
			}
			this.anIntArray214[local316] = local310 + local323;
			this.anIntArray210[local316] = local312 + local333;
			this.anIntArray216[local316] = local314 + local343;
			local310 = this.anIntArray214[local316];
			local312 = this.anIntArray210[local316];
			local314 = this.anIntArray216[local316];
			if (local83 == 1) {
				this.anIntArray215[local316] = local45.method647();
			}
		}
		local25.anInt964 = local166;
		local30.anInt964 = local133;
		local35.anInt964 = local115;
		local40.anInt964 = local151;
		local45.anInt964 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray11[local321] = (short) local25.method602();
			if (local67 == 1) {
				local323 = local30.method647();
				if ((local323 & 0x1) == 1) {
					this.aByteArray36[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray36[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray38[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray38[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray37[local321] = local35.method624();
			}
			if (local75 == 1) {
				this.aByteArray35[local321] = local40.method624();
			}
			if (local79 == 1) {
				this.anIntArray208[local321] = local45.method647();
			}
		}
		local25.anInt964 = local160;
		local30.anInt964 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method647();
			if (local528 == 1) {
				local323 = local25.method635() + local521;
				local333 = local25.method635() + local323;
				local343 = local25.method635() + local333;
				local521 = local343;
				this.anIntArray209[local523] = local323;
				this.anIntArray213[local523] = local333;
				this.anIntArray211[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method635() + local521;
				local521 = local343;
				this.anIntArray209[local523] = local323;
				this.anIntArray213[local523] = local333;
				this.anIntArray211[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method635() + local521;
				local521 = local343;
				this.anIntArray209[local523] = local323;
				this.anIntArray213[local523] = local333;
				this.anIntArray211[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method635() + local521;
				local521 = local343;
				this.anIntArray209[local523] = local323;
				this.anIntArray213[local523] = local631;
				this.anIntArray211[local523] = local343;
			}
		}
		local25.anInt964 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray221[local528] = local25.method602();
			this.anIntArray219[local528] = local25.method602();
			this.anIntArray218[local528] = local25.method602();
		}
		if (!local18) {
			this.aByteArray38 = null;
		}
		if (!local20) {
			this.aByteArray36 = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([Lclient!lc;I)V")
	public Class3_Sub1_Sub4_Sub5(@OriginalArg(0) Class3_Sub1_Sub4_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt1719 = 0;
		this.anInt1712 = 0;
		this.anInt1715 = 0;
		this.aByte2 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class3_Sub1_Sub4_Sub5 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt1719 += local45.anInt1719;
				this.anInt1712 += local45.anInt1712;
				this.anInt1715 += local45.anInt1715;
				if (local45.aByteArray37 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local45.aByte2;
					}
					if (this.aByte2 != local45.aByte2) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray36 != null;
				local22 |= local45.aByteArray35 != null;
				local24 |= local45.anIntArray208 != null;
				local26 |= local45.aByteArray38 != null;
			}
		}
		this.anIntArray214 = new int[this.anInt1719];
		this.anIntArray210 = new int[this.anInt1719];
		this.anIntArray216 = new int[this.anInt1719];
		this.anIntArray215 = new int[this.anInt1719];
		this.anIntArray209 = new int[this.anInt1712];
		this.anIntArray213 = new int[this.anInt1712];
		this.anIntArray211 = new int[this.anInt1712];
		if (this.anInt1715 > 0) {
			this.anIntArray221 = new int[this.anInt1715];
			this.anIntArray219 = new int[this.anInt1715];
			this.anIntArray218 = new int[this.anInt1715];
		}
		if (local18) {
			this.aByteArray36 = new byte[this.anInt1712];
		}
		if (local20) {
			this.aByteArray37 = new byte[this.anInt1712];
		}
		if (local22) {
			this.aByteArray35 = new byte[this.anInt1712];
		}
		if (local26) {
			this.aByteArray38 = new byte[this.anInt1712];
		}
		if (local24) {
			this.anIntArray208 = new int[this.anInt1712];
		}
		this.aShortArray11 = new short[this.anInt1712];
		this.anInt1719 = 0;
		this.anInt1712 = 0;
		this.anInt1715 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class3_Sub1_Sub4_Sub5 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt1712; local244++) {
					if (local18 && local240.aByteArray36 != null) {
						this.aByteArray36[this.anInt1712] = local240.aByteArray36[local244];
					}
					if (local20) {
						if (local240.aByteArray37 == null) {
							this.aByteArray37[this.anInt1712] = local240.aByte2;
						} else {
							this.aByteArray37[this.anInt1712] = local240.aByteArray37[local244];
						}
					}
					if (local22 && local240.aByteArray35 != null) {
						this.aByteArray35[this.anInt1712] = local240.aByteArray35[local244];
					}
					if (local26) {
						if (local240.aByteArray38 == null || local240.aByteArray38[local244] == -1) {
							this.aByteArray38[this.anInt1712] = -1;
						} else {
							this.aByteArray38[this.anInt1712] = (byte) (local240.aByteArray38[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray208 != null) {
						this.anIntArray208[this.anInt1712] = local240.anIntArray208[local244];
					}
					this.aShortArray11[this.anInt1712] = local240.aShortArray11[local244];
					this.anIntArray209[this.anInt1712] = this.method1158(local240, local240.anIntArray209[local244]);
					this.anIntArray213[this.anInt1712] = this.method1158(local240, local240.anIntArray213[local244]);
					this.anIntArray211[this.anInt1712] = this.method1158(local240, local240.anIntArray211[local244]);
					this.anInt1712++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt1715; local397++) {
					this.anIntArray221[this.anInt1715] = this.method1158(local240, local240.anIntArray221[local397]);
					this.anIntArray219[this.anInt1715] = this.method1158(local240, local240.anIntArray219[local397]);
					this.anIntArray218[this.anInt1715] = this.method1158(local240, local240.anIntArray218[local397]);
					this.anInt1715++;
				}
				local233 += local240.anInt1715;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!lc;ZZZ)V")
	public Class3_Sub1_Sub4_Sub5(@OriginalArg(0) Class3_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1719 = arg0.anInt1719;
		this.anInt1712 = arg0.anInt1712;
		this.anInt1715 = arg0.anInt1715;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray214 = arg0.anIntArray214;
			this.anIntArray210 = arg0.anIntArray210;
			this.anIntArray216 = arg0.anIntArray216;
		} else {
			this.anIntArray214 = new int[this.anInt1719];
			this.anIntArray210 = new int[this.anInt1719];
			this.anIntArray216 = new int[this.anInt1719];
			for (local60 = 0; local60 < this.anInt1719; local60++) {
				this.anIntArray214[local60] = arg0.anIntArray214[local60];
				this.anIntArray210[local60] = arg0.anIntArray210[local60];
				this.anIntArray216[local60] = arg0.anIntArray216[local60];
			}
		}
		if (arg2) {
			this.aShortArray11 = arg0.aShortArray11;
		} else {
			this.aShortArray11 = new short[this.anInt1712];
			for (local60 = 0; local60 < this.anInt1712; local60++) {
				this.aShortArray11[local60] = arg0.aShortArray11[local60];
			}
		}
		this.aByteArray35 = arg0.aByteArray35;
		this.anIntArray209 = arg0.anIntArray209;
		this.anIntArray213 = arg0.anIntArray213;
		this.anIntArray211 = arg0.anIntArray211;
		this.aByteArray36 = arg0.aByteArray36;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray38 = arg0.aByteArray38;
		this.aByte2 = arg0.aByte2;
		this.anIntArray221 = arg0.anIntArray221;
		this.anIntArray219 = arg0.anIntArray219;
		this.anIntArray218 = arg0.anIntArray218;
		this.anIntArray215 = arg0.anIntArray215;
		this.anIntArray208 = arg0.anIntArray208;
		this.anIntArrayArray11 = arg0.anIntArrayArray11;
		this.anIntArrayArray12 = arg0.anIntArrayArray12;
		this.aClass47Array1 = arg0.aClass47Array1;
		this.aClass61Array1 = arg0.aClass61Array1;
		this.aClass47Array2 = arg0.aClass47Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1164();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class3_Sub1_Sub4_Sub7 local26 = new Class3_Sub1_Sub4_Sub7();
		local26.anIntArray343 = new int[this.anInt1712];
		local26.anIntArray337 = new int[this.anInt1712];
		local26.anIntArray347 = new int[this.anInt1712];
		for (@Pc(43) int local43 = 0; local43 < this.anInt1712; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray36 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray36[local43];
			}
			@Pc(92) Class47 local92;
			@Pc(123) int local123;
			@Pc(253) Class61 local253;
			if (this.aByteArray38 == null || this.aByteArray38[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray11[local43] & 0xFFFF;
					if (this.aClass47Array2 == null || this.aClass47Array2[this.anIntArray209[local43]] == null) {
						local92 = this.aClass47Array1[this.anIntArray209[local43]];
					} else {
						local92 = this.aClass47Array2[this.anIntArray209[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1723 + arg3 * local92.anInt1729 + arg4 * local92.anInt1725) / (local22 * local92.anInt1722);
					local26.anIntArray343[local43] = Static67.method1162(local73, local123);
					if (this.aClass47Array2 == null || this.aClass47Array2[this.anIntArray213[local43]] == null) {
						local92 = this.aClass47Array1[this.anIntArray213[local43]];
					} else {
						local92 = this.aClass47Array2[this.anIntArray213[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1723 + arg3 * local92.anInt1729 + arg4 * local92.anInt1725) / (local22 * local92.anInt1722);
					local26.anIntArray337[local43] = Static67.method1162(local73, local123);
					if (this.aClass47Array2 == null || this.aClass47Array2[this.anIntArray211[local43]] == null) {
						local92 = this.aClass47Array1[this.anIntArray211[local43]];
					} else {
						local92 = this.aClass47Array2[this.anIntArray211[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt1723 + arg3 * local92.anInt1729 + arg4 * local92.anInt1725) / (local22 * local92.anInt1722);
					local26.anIntArray347[local43] = Static67.method1162(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass61Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt2119 + arg3 * local253.anInt2127 + arg4 * local253.anInt2121) / (local22 + local22 / 2);
					local26.anIntArray343[local43] = Static67.method1162(this.aShortArray11[local43] & 0xFFFF, local123);
					local26.anIntArray347[local43] = -1;
				} else {
					local26.anIntArray347[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass47Array2 == null || this.aClass47Array2[this.anIntArray209[local43]] == null) {
					local92 = this.aClass47Array1[this.anIntArray209[local43]];
				} else {
					local92 = this.aClass47Array2[this.anIntArray209[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1723 + arg3 * local92.anInt1729 + arg4 * local92.anInt1725) / (local22 * local92.anInt1722);
				local26.anIntArray343[local43] = Static67.method1169(local123);
				if (this.aClass47Array2 == null || this.aClass47Array2[this.anIntArray213[local43]] == null) {
					local92 = this.aClass47Array1[this.anIntArray213[local43]];
				} else {
					local92 = this.aClass47Array2[this.anIntArray213[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1723 + arg3 * local92.anInt1729 + arg4 * local92.anInt1725) / (local22 * local92.anInt1722);
				local26.anIntArray337[local43] = Static67.method1169(local123);
				if (this.aClass47Array2 == null || this.aClass47Array2[this.anIntArray211[local43]] == null) {
					local92 = this.aClass47Array1[this.anIntArray211[local43]];
				} else {
					local92 = this.aClass47Array2[this.anIntArray211[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt1723 + arg3 * local92.anInt1729 + arg4 * local92.anInt1725) / (local22 * local92.anInt1722);
				local26.anIntArray347[local43] = Static67.method1169(local123);
			} else if (local49 == 1) {
				local253 = this.aClass61Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt2119 + arg3 * local253.anInt2127 + arg4 * local253.anInt2121) / (local22 + local22 / 2);
				local26.anIntArray343[local43] = Static67.method1169(local123);
				local26.anIntArray347[local43] = -1;
			} else {
				local26.anIntArray347[local43] = -2;
			}
		}
		this.method1161();
		local26.anInt2538 = this.anInt1719;
		local26.anIntArray336 = this.anIntArray214;
		local26.anIntArray342 = this.anIntArray210;
		local26.anIntArray346 = this.anIntArray216;
		local26.anInt2536 = this.anInt1712;
		local26.anIntArray344 = this.anIntArray209;
		local26.anIntArray338 = this.anIntArray213;
		local26.anIntArray340 = this.anIntArray211;
		local26.aByteArray60 = this.aByteArray37;
		local26.aByteArray61 = this.aByteArray35;
		local26.aByteArray62 = this.aByteArray38;
		if (local26.aByteArray62 == null) {
			local26.aShortArray12 = null;
		} else {
			local26.aShortArray12 = this.aShortArray11;
		}
		local26.aByte5 = this.aByte2;
		local26.anInt2537 = this.anInt1715;
		local26.anIntArray341 = this.anIntArray221;
		local26.anIntArray345 = this.anIntArray219;
		local26.anIntArray339 = this.anIntArray218;
		local26.anIntArrayArray26 = this.anIntArrayArray11;
		local26.anIntArrayArray25 = this.anIntArrayArray12;
		return local26;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
	public void method1157() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1719; local1++) {
			this.anIntArray216[local1] = -this.anIntArray216[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1712; local18++) {
			@Pc(24) int local24 = this.anIntArray209[local18];
			this.anIntArray209[local18] = this.anIntArray211[local18];
			this.anIntArray211[local18] = local24;
		}
		this.method1163();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lc;I)I")
	private int method1158(@OriginalArg(0) Class3_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray214[arg1];
		@Pc(11) int local11 = arg0.anIntArray210[arg1];
		@Pc(16) int local16 = arg0.anIntArray216[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1719; local18++) {
			if (local6 == this.anIntArray214[local18] && local11 == this.anIntArray210[local18] && local16 == this.anIntArray216[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray214[this.anInt1719] = local6;
			this.anIntArray210[this.anInt1719] = local11;
			this.anIntArray216[this.anInt1719] = local16;
			if (arg0.anIntArray215 != null) {
				this.anIntArray215[this.anInt1719] = arg0.anIntArray215[arg1];
			}
			local1 = this.anInt1719++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method1159() {
		@Pc(3) Class3_Sub1_Sub4_Sub5 local3 = new Class3_Sub1_Sub4_Sub5();
		if (this.aByteArray36 != null) {
			local3.aByteArray36 = new byte[this.anInt1712];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1712; local13++) {
				local3.aByteArray36[local13] = this.aByteArray36[local13];
			}
		}
		local3.anInt1719 = this.anInt1719;
		local3.anInt1712 = this.anInt1712;
		local3.anInt1715 = this.anInt1715;
		local3.anIntArray214 = this.anIntArray214;
		local3.anIntArray210 = this.anIntArray210;
		local3.anIntArray216 = this.anIntArray216;
		local3.anIntArray209 = this.anIntArray209;
		local3.anIntArray213 = this.anIntArray213;
		local3.anIntArray211 = this.anIntArray211;
		local3.aByteArray37 = this.aByteArray37;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray38 = this.aByteArray38;
		local3.aShortArray11 = this.aShortArray11;
		local3.aByte2 = this.aByte2;
		local3.anIntArray221 = this.anIntArray221;
		local3.anIntArray219 = this.anIntArray219;
		local3.anIntArray218 = this.anIntArray218;
		local3.anIntArray215 = this.anIntArray215;
		local3.anIntArray208 = this.anIntArray208;
		local3.anIntArrayArray11 = this.anIntArrayArray11;
		local3.anIntArrayArray12 = this.anIntArrayArray12;
		local3.aClass47Array1 = this.aClass47Array1;
		local3.aClass61Array1 = this.aClass61Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()V")
	public void method1160() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1719; local1++) {
			this.anIntArray214[local1] = -this.anIntArray214[local1];
			this.anIntArray216[local1] = -this.anIntArray216[local1];
		}
		this.method1163();
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()V")
	private void method1161() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray215 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1719; local9++) {
				local15 = this.anIntArray215[local9];
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
			while (local59 < this.anInt1719) {
				local65 = this.anIntArray215[local59];
				this.anIntArrayArray11[local65][local5[local65]++] = local59++;
			}
			this.anIntArray215 = null;
		}
		if (this.anIntArray208 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1712; local9++) {
			local15 = this.anIntArray208[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray12 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray12[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1712) {
			local65 = this.anIntArray208[local59];
			this.anIntArrayArray12[local65][local5[local65]++] = local59++;
		}
		this.anIntArray208 = null;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "()V")
	private void method1163() {
		this.aClass47Array1 = null;
		this.aClass47Array2 = null;
		this.aClass61Array1 = null;
		this.aBoolean59 = false;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "()V")
	public void method1164() {
		if (this.aClass47Array1 != null) {
			return;
		}
		this.aClass47Array1 = new Class47[this.anInt1719];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1719; local10++) {
			this.aClass47Array1[local10] = new Class47();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1712; local25++) {
			@Pc(31) int local31 = this.anIntArray209[local25];
			@Pc(36) int local36 = this.anIntArray213[local25];
			@Pc(41) int local41 = this.anIntArray211[local25];
			@Pc(51) int local51 = this.anIntArray214[local36] - this.anIntArray214[local31];
			@Pc(61) int local61 = this.anIntArray210[local36] - this.anIntArray210[local31];
			@Pc(71) int local71 = this.anIntArray216[local36] - this.anIntArray216[local31];
			@Pc(81) int local81 = this.anIntArray214[local41] - this.anIntArray214[local31];
			@Pc(91) int local91 = this.anIntArray210[local41] - this.anIntArray210[local31];
			@Pc(101) int local101 = this.anIntArray216[local41] - this.anIntArray216[local31];
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
			if (this.aByteArray36 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray36[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class47 local211 = this.aClass47Array1[local31];
				local211.anInt1723 += local109;
				local211.anInt1729 += local117;
				local211.anInt1725 += local125;
				local211.anInt1722++;
				@Pc(240) Class47 local240 = this.aClass47Array1[local36];
				local240.anInt1723 += local109;
				local240.anInt1729 += local117;
				local240.anInt1725 += local125;
				local240.anInt1722++;
				@Pc(269) Class47 local269 = this.aClass47Array1[local41];
				local269.anInt1723 += local109;
				local269.anInt1729 += local117;
				local269.anInt1725 += local125;
				local269.anInt1722++;
			} else if (local198 == 1) {
				if (this.aClass61Array1 == null) {
					this.aClass61Array1 = new Class61[this.anInt1712];
				}
				@Pc(314) Class61 local314 = this.aClass61Array1[local25] = new Class61();
				local314.anInt2119 = local109;
				local314.anInt2127 = local117;
				local314.anInt2121 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public void method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1719; local1++) {
			this.anIntArray214[local1] = this.anIntArray214[local1] * arg0 / 128;
			this.anIntArray210[local1] = this.anIntArray210[local1] * arg1 / 128;
			this.anIntArray216[local1] = this.anIntArray216[local1] * arg2 / 128;
		}
		this.method1163();
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "()V")
	public void method1166() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1719; local1++) {
			@Pc(7) int local7 = this.anIntArray214[local1];
			this.anIntArray214[local1] = this.anIntArray216[local1];
			this.anIntArray216[local1] = -local7;
		}
		this.method1163();
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "()V")
	public void method1168() {
		if (this.aBoolean59) {
			return;
		}
		super.anInt2525 = 0;
		this.anInt1713 = 0;
		this.anInt1711 = 999999;
		this.anInt1718 = -999999;
		this.anInt1714 = -99999;
		this.anInt1717 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1719; local23++) {
			@Pc(29) int local29 = this.anIntArray214[local23];
			@Pc(34) int local34 = this.anIntArray210[local23];
			@Pc(39) int local39 = this.anIntArray216[local23];
			if (local29 < this.anInt1711) {
				this.anInt1711 = local29;
			}
			if (local29 > this.anInt1718) {
				this.anInt1718 = local29;
			}
			if (local39 < this.anInt1717) {
				this.anInt1717 = local39;
			}
			if (local39 > this.anInt1714) {
				this.anInt1714 = local39;
			}
			if (-local34 > super.anInt2525) {
				super.anInt2525 = -local34;
			}
			if (local34 > this.anInt1713) {
				this.anInt1713 = local34;
			}
		}
		this.aBoolean59 = true;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V")
	public void method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1719; local1++) {
			this.anIntArray214[local1] += arg0;
			this.anIntArray210[local1] += arg1;
			this.anIntArray216[local1] += arg2;
		}
		this.method1163();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(SS)V")
	public void method1172(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1712; local1++) {
			if (this.aShortArray11[local1] == arg0) {
				this.aShortArray11[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "()V")
	public void method1173() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1719; local1++) {
			@Pc(7) int local7 = this.anIntArray216[local1];
			this.anIntArray216[local1] = this.anIntArray214[local1];
			this.anIntArray214[local1] = -local7;
		}
		this.method1163();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIZ)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub4_Sub5 local16 = new Class3_Sub1_Sub4_Sub5();
		local16.anInt1719 = this.anInt1719;
		local16.anInt1712 = this.anInt1712;
		local16.anInt1715 = this.anInt1715;
		local16.anIntArray214 = this.anIntArray214;
		local16.anIntArray216 = this.anIntArray216;
		local16.anIntArray209 = this.anIntArray209;
		local16.anIntArray213 = this.anIntArray213;
		local16.anIntArray211 = this.anIntArray211;
		local16.aByteArray36 = this.aByteArray36;
		local16.aByteArray37 = this.aByteArray37;
		local16.aByteArray35 = this.aByteArray35;
		local16.aByteArray38 = this.aByteArray38;
		local16.aShortArray11 = this.aShortArray11;
		local16.aByte2 = this.aByte2;
		local16.anIntArray221 = this.anIntArray221;
		local16.anIntArray219 = this.anIntArray219;
		local16.anIntArray218 = this.anIntArray218;
		local16.anIntArray215 = this.anIntArray215;
		local16.anIntArray208 = this.anIntArray208;
		local16.anIntArrayArray11 = this.anIntArrayArray11;
		local16.anIntArrayArray12 = this.anIntArrayArray12;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray210 = new int[local16.anInt1719];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt1719; local128++) {
			@Pc(134) int local134 = this.anIntArray214[local128];
			@Pc(139) int local139 = this.anIntArray210[local128];
			@Pc(144) int local144 = this.anIntArray216[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray210[local128] = local139 + local180 - local126;
		}
		local16.method1163();
		return local16;
	}
}
