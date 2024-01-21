import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class5_Sub1_Sub1_Sub7 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!wd", name = "vb", descriptor = "[I")
	public static int[] anIntArray303 = new int[128];

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!wd", name = "hb", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!wd", name = "ib", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!wd", name = "jb", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!wd", name = "kb", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!wd", name = "lb", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!wd", name = "mb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!wd", name = "ob", descriptor = "I")
	public int anInt2988;

	@OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!wd", name = "rb", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!wd", name = "sb", descriptor = "I")
	public int anInt2991;

	@OriginalMember(owner = "client!wd", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!wd", name = "ub", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!wd", name = "wb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!wd", name = "xb", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!wd", name = "yb", descriptor = "[Lclient!g;")
	public Class26[] aClass26Array1;

	@OriginalMember(owner = "client!wd", name = "zb", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!wd", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!wd", name = "Bb", descriptor = "[Lclient!df;")
	private Class17[] aClass17Array1;

	@OriginalMember(owner = "client!wd", name = "Db", descriptor = "[Lclient!g;")
	public Class26[] aClass26Array2;

	@OriginalMember(owner = "client!wd", name = "Eb", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!wd", name = "Hb", descriptor = "I")
	public int anInt2994;

	@OriginalMember(owner = "client!wd", name = "Ib", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!wd", name = "Kb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!wd", name = "Nb", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!wd", name = "Ob", descriptor = "I")
	public int anInt2996;

	@OriginalMember(owner = "client!wd", name = "Pb", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!wd", name = "qb", descriptor = "I")
	public int anInt2990 = 0;

	@OriginalMember(owner = "client!wd", name = "Fb", descriptor = "I")
	private int anInt2992 = 0;

	@OriginalMember(owner = "client!wd", name = "Cb", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!wd", name = "Gb", descriptor = "I")
	public int anInt2993 = 0;

	@OriginalMember(owner = "client!wd", name = "Mb", descriptor = "B")
	private byte aByte5 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray303[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray303[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray303[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray303[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray303[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	private Class5_Sub1_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class5_Sub1_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class5_Sub11 local25 = new Class5_Sub11(arg0);
		@Pc(30) Class5_Sub11 local30 = new Class5_Sub11(arg0);
		@Pc(35) Class5_Sub11 local35 = new Class5_Sub11(arg0);
		@Pc(40) Class5_Sub11 local40 = new Class5_Sub11(arg0);
		@Pc(45) Class5_Sub11 local45 = new Class5_Sub11(arg0);
		local25.anInt2233 = arg0.length - 18;
		@Pc(55) int local55 = local25.method1543();
		@Pc(59) int local59 = local25.method1543();
		@Pc(63) int local63 = local25.method1546();
		@Pc(67) int local67 = local25.method1546();
		@Pc(71) int local71 = local25.method1546();
		@Pc(75) int local75 = local25.method1546();
		@Pc(79) int local79 = local25.method1546();
		@Pc(83) int local83 = local25.method1546();
		@Pc(87) int local87 = local25.method1543();
		@Pc(91) int local91 = local25.method1543();
		@Pc(95) int local95 = local25.method1543();
		@Pc(99) int local99 = local25.method1543();
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
		this.anInt2993 = local55;
		this.anInt2990 = local59;
		this.anInt2992 = local63;
		this.anIntArray305 = new int[local55];
		this.anIntArray308 = new int[local55];
		this.anIntArray296 = new int[local55];
		this.anIntArray307 = new int[local59];
		this.anIntArray298 = new int[local59];
		this.anIntArray299 = new int[local59];
		if (local63 > 0) {
			this.anIntArray295 = new int[local63];
			this.anIntArray302 = new int[local63];
			this.anIntArray301 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray304 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray30 = new byte[local59];
			this.aByteArray32 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray33 = new byte[local59];
		} else {
			this.aByte5 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray31 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray297 = new int[local59];
		}
		this.aShortArray13 = new short[local59];
		local25.anInt2233 = local101;
		local30.anInt2233 = local182;
		local35.anInt2233 = local188;
		local40.anInt2233 = local107;
		local45.anInt2233 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method1546();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method1538();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method1538();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method1538();
			}
			this.anIntArray305[local316] = local310 + local323;
			this.anIntArray308[local316] = local312 + local333;
			this.anIntArray296[local316] = local314 + local343;
			local310 = this.anIntArray305[local316];
			local312 = this.anIntArray308[local316];
			local314 = this.anIntArray296[local316];
			if (local83 == 1) {
				this.anIntArray304[local316] = local45.method1546();
			}
		}
		local25.anInt2233 = local166;
		local30.anInt2233 = local133;
		local35.anInt2233 = local115;
		local40.anInt2233 = local151;
		local45.anInt2233 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray13[local321] = (short) local25.method1543();
			if (local67 == 1) {
				local323 = local30.method1546();
				if ((local323 & 0x1) == 1) {
					this.aByteArray30[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray30[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray32[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray32[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray33[local321] = local35.method1524();
			}
			if (local75 == 1) {
				this.aByteArray31[local321] = local40.method1524();
			}
			if (local79 == 1) {
				this.anIntArray297[local321] = local45.method1546();
			}
		}
		local25.anInt2233 = local160;
		local30.anInt2233 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method1546();
			if (local528 == 1) {
				local323 = local25.method1538() + local521;
				local333 = local25.method1538() + local323;
				local343 = local25.method1538() + local333;
				local521 = local343;
				this.anIntArray307[local523] = local323;
				this.anIntArray298[local523] = local333;
				this.anIntArray299[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method1538() + local521;
				local521 = local343;
				this.anIntArray307[local523] = local323;
				this.anIntArray298[local523] = local333;
				this.anIntArray299[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method1538() + local521;
				local521 = local343;
				this.anIntArray307[local523] = local323;
				this.anIntArray298[local523] = local333;
				this.anIntArray299[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method1538() + local521;
				local521 = local343;
				this.anIntArray307[local523] = local323;
				this.anIntArray298[local523] = local631;
				this.anIntArray299[local523] = local343;
			}
		}
		local25.anInt2233 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray295[local528] = local25.method1543();
			this.anIntArray302[local528] = local25.method1543();
			this.anIntArray301[local528] = local25.method1543();
		}
		if (!local18) {
			this.aByteArray32 = null;
		}
		if (!local20) {
			this.aByteArray30 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([Lclient!wd;I)V")
	public Class5_Sub1_Sub1_Sub7(@OriginalArg(0) Class5_Sub1_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt2993 = 0;
		this.anInt2990 = 0;
		this.anInt2992 = 0;
		this.aByte5 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class5_Sub1_Sub1_Sub7 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt2993 += local45.anInt2993;
				this.anInt2990 += local45.anInt2990;
				this.anInt2992 += local45.anInt2992;
				if (local45.aByteArray33 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local45.aByte5;
					}
					if (this.aByte5 != local45.aByte5) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray30 != null;
				local22 |= local45.aByteArray31 != null;
				local24 |= local45.anIntArray297 != null;
				local26 |= local45.aByteArray32 != null;
			}
		}
		this.anIntArray305 = new int[this.anInt2993];
		this.anIntArray308 = new int[this.anInt2993];
		this.anIntArray296 = new int[this.anInt2993];
		this.anIntArray304 = new int[this.anInt2993];
		this.anIntArray307 = new int[this.anInt2990];
		this.anIntArray298 = new int[this.anInt2990];
		this.anIntArray299 = new int[this.anInt2990];
		if (this.anInt2992 > 0) {
			this.anIntArray295 = new int[this.anInt2992];
			this.anIntArray302 = new int[this.anInt2992];
			this.anIntArray301 = new int[this.anInt2992];
		}
		if (local18) {
			this.aByteArray30 = new byte[this.anInt2990];
		}
		if (local20) {
			this.aByteArray33 = new byte[this.anInt2990];
		}
		if (local22) {
			this.aByteArray31 = new byte[this.anInt2990];
		}
		if (local26) {
			this.aByteArray32 = new byte[this.anInt2990];
		}
		if (local24) {
			this.anIntArray297 = new int[this.anInt2990];
		}
		this.aShortArray13 = new short[this.anInt2990];
		this.anInt2993 = 0;
		this.anInt2990 = 0;
		this.anInt2992 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class5_Sub1_Sub1_Sub7 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt2990; local244++) {
					if (local18 && local240.aByteArray30 != null) {
						this.aByteArray30[this.anInt2990] = local240.aByteArray30[local244];
					}
					if (local20) {
						if (local240.aByteArray33 == null) {
							this.aByteArray33[this.anInt2990] = local240.aByte5;
						} else {
							this.aByteArray33[this.anInt2990] = local240.aByteArray33[local244];
						}
					}
					if (local22 && local240.aByteArray31 != null) {
						this.aByteArray31[this.anInt2990] = local240.aByteArray31[local244];
					}
					if (local26) {
						if (local240.aByteArray32 == null || local240.aByteArray32[local244] == -1) {
							this.aByteArray32[this.anInt2990] = -1;
						} else {
							this.aByteArray32[this.anInt2990] = (byte) (local240.aByteArray32[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray297 != null) {
						this.anIntArray297[this.anInt2990] = local240.anIntArray297[local244];
					}
					this.aShortArray13[this.anInt2990] = local240.aShortArray13[local244];
					this.anIntArray307[this.anInt2990] = this.method1990(local240, local240.anIntArray307[local244]);
					this.anIntArray298[this.anInt2990] = this.method1990(local240, local240.anIntArray298[local244]);
					this.anIntArray299[this.anInt2990] = this.method1990(local240, local240.anIntArray299[local244]);
					this.anInt2990++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt2992; local397++) {
					this.anIntArray295[this.anInt2992] = this.method1990(local240, local240.anIntArray295[local397]);
					this.anIntArray302[this.anInt2992] = this.method1990(local240, local240.anIntArray302[local397]);
					this.anIntArray301[this.anInt2992] = this.method1990(local240, local240.anIntArray301[local397]);
					this.anInt2992++;
				}
				local233 += local240.anInt2992;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!wd;ZZZ)V")
	public Class5_Sub1_Sub1_Sub7(@OriginalArg(0) Class5_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2993 = arg0.anInt2993;
		this.anInt2990 = arg0.anInt2990;
		this.anInt2992 = arg0.anInt2992;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray305 = arg0.anIntArray305;
			this.anIntArray308 = arg0.anIntArray308;
			this.anIntArray296 = arg0.anIntArray296;
		} else {
			this.anIntArray305 = new int[this.anInt2993];
			this.anIntArray308 = new int[this.anInt2993];
			this.anIntArray296 = new int[this.anInt2993];
			for (local60 = 0; local60 < this.anInt2993; local60++) {
				this.anIntArray305[local60] = arg0.anIntArray305[local60];
				this.anIntArray308[local60] = arg0.anIntArray308[local60];
				this.anIntArray296[local60] = arg0.anIntArray296[local60];
			}
		}
		if (arg2) {
			this.aShortArray13 = arg0.aShortArray13;
		} else {
			this.aShortArray13 = new short[this.anInt2990];
			for (local60 = 0; local60 < this.anInt2990; local60++) {
				this.aShortArray13[local60] = arg0.aShortArray13[local60];
			}
		}
		this.aByteArray31 = arg0.aByteArray31;
		this.anIntArray307 = arg0.anIntArray307;
		this.anIntArray298 = arg0.anIntArray298;
		this.anIntArray299 = arg0.anIntArray299;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray33 = arg0.aByteArray33;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByte5 = arg0.aByte5;
		this.anIntArray295 = arg0.anIntArray295;
		this.anIntArray302 = arg0.anIntArray302;
		this.anIntArray301 = arg0.anIntArray301;
		this.anIntArray304 = arg0.anIntArray304;
		this.anIntArray297 = arg0.anIntArray297;
		this.anIntArrayArray29 = arg0.anIntArrayArray29;
		this.anIntArrayArray28 = arg0.anIntArrayArray28;
		this.aClass26Array1 = arg0.aClass26Array1;
		this.aClass17Array1 = arg0.aClass17Array1;
		this.aClass26Array2 = arg0.aClass26Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	public void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2993; local1++) {
			this.anIntArray305[local1] = this.anIntArray305[local1] * arg0 / 128;
			this.anIntArray308[local1] = this.anIntArray308[local1] * arg1 / 128;
			this.anIntArray296[local1] = this.anIntArray296[local1] * arg2 / 128;
		}
		this.method1993();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1983() {
		@Pc(3) Class5_Sub1_Sub1_Sub7 local3 = new Class5_Sub1_Sub1_Sub7();
		if (this.aByteArray30 != null) {
			local3.aByteArray30 = new byte[this.anInt2990];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2990; local13++) {
				local3.aByteArray30[local13] = this.aByteArray30[local13];
			}
		}
		local3.anInt2993 = this.anInt2993;
		local3.anInt2990 = this.anInt2990;
		local3.anInt2992 = this.anInt2992;
		local3.anIntArray305 = this.anIntArray305;
		local3.anIntArray308 = this.anIntArray308;
		local3.anIntArray296 = this.anIntArray296;
		local3.anIntArray307 = this.anIntArray307;
		local3.anIntArray298 = this.anIntArray298;
		local3.anIntArray299 = this.anIntArray299;
		local3.aByteArray33 = this.aByteArray33;
		local3.aByteArray31 = this.aByteArray31;
		local3.aByteArray32 = this.aByteArray32;
		local3.aShortArray13 = this.aShortArray13;
		local3.aByte5 = this.aByte5;
		local3.anIntArray295 = this.anIntArray295;
		local3.anIntArray302 = this.anIntArray302;
		local3.anIntArray301 = this.anIntArray301;
		local3.anIntArray304 = this.anIntArray304;
		local3.anIntArray297 = this.anIntArray297;
		local3.anIntArrayArray29 = this.anIntArrayArray29;
		local3.anIntArrayArray28 = this.anIntArrayArray28;
		local3.aClass26Array1 = this.aClass26Array1;
		local3.aClass17Array1 = this.aClass17Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()V")
	public void method1984() {
		if (this.aClass26Array1 != null) {
			return;
		}
		this.aClass26Array1 = new Class26[this.anInt2993];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2993; local10++) {
			this.aClass26Array1[local10] = new Class26();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2990; local25++) {
			@Pc(31) int local31 = this.anIntArray307[local25];
			@Pc(36) int local36 = this.anIntArray298[local25];
			@Pc(41) int local41 = this.anIntArray299[local25];
			@Pc(51) int local51 = this.anIntArray305[local36] - this.anIntArray305[local31];
			@Pc(61) int local61 = this.anIntArray308[local36] - this.anIntArray308[local31];
			@Pc(71) int local71 = this.anIntArray296[local36] - this.anIntArray296[local31];
			@Pc(81) int local81 = this.anIntArray305[local41] - this.anIntArray305[local31];
			@Pc(91) int local91 = this.anIntArray308[local41] - this.anIntArray308[local31];
			@Pc(101) int local101 = this.anIntArray296[local41] - this.anIntArray296[local31];
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
			if (this.aByteArray30 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray30[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class26 local211 = this.aClass26Array1[local31];
				local211.anInt989 += local109;
				local211.anInt987 += local117;
				local211.anInt988 += local125;
				local211.anInt985++;
				@Pc(240) Class26 local240 = this.aClass26Array1[local36];
				local240.anInt989 += local109;
				local240.anInt987 += local117;
				local240.anInt988 += local125;
				local240.anInt985++;
				@Pc(269) Class26 local269 = this.aClass26Array1[local41];
				local269.anInt989 += local109;
				local269.anInt987 += local117;
				local269.anInt988 += local125;
				local269.anInt985++;
			} else if (local198 == 1) {
				if (this.aClass17Array1 == null) {
					this.aClass17Array1 = new Class17[this.anInt2990];
				}
				@Pc(314) Class17 local314 = this.aClass17Array1[local25] = new Class17();
				local314.anInt726 = local109;
				local314.anInt732 = local117;
				local314.anInt724 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()V")
	private void method1986() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray304 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2993; local9++) {
				local15 = this.anIntArray304[local9];
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
			while (local59 < this.anInt2993) {
				local65 = this.anIntArray304[local59];
				this.anIntArrayArray29[local65][local5[local65]++] = local59++;
			}
			this.anIntArray304 = null;
		}
		if (this.anIntArray297 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2990; local9++) {
			local15 = this.anIntArray297[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray28 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray28[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2990) {
			local65 = this.anIntArray297[local59];
			this.anIntArrayArray28[local65][local5[local65]++] = local59++;
		}
		this.anIntArray297 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1984();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class5_Sub1_Sub1_Sub2 local26 = new Class5_Sub1_Sub1_Sub2();
		local26.anIntArray21 = new int[this.anInt2990];
		local26.anIntArray24 = new int[this.anInt2990];
		local26.anIntArray20 = new int[this.anInt2990];
		for (@Pc(43) int local43 = 0; local43 < this.anInt2990; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray30 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray30[local43];
			}
			@Pc(92) Class26 local92;
			@Pc(123) int local123;
			@Pc(253) Class17 local253;
			if (this.aByteArray32 == null || this.aByteArray32[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray13[local43] & 0xFFFF;
					if (this.aClass26Array2 == null || this.aClass26Array2[this.anIntArray307[local43]] == null) {
						local92 = this.aClass26Array1[this.anIntArray307[local43]];
					} else {
						local92 = this.aClass26Array2[this.anIntArray307[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt989 + arg3 * local92.anInt987 + arg4 * local92.anInt988) / (local22 * local92.anInt985);
					local26.anIntArray21[local43] = Static120.method1995(local73, local123);
					if (this.aClass26Array2 == null || this.aClass26Array2[this.anIntArray298[local43]] == null) {
						local92 = this.aClass26Array1[this.anIntArray298[local43]];
					} else {
						local92 = this.aClass26Array2[this.anIntArray298[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt989 + arg3 * local92.anInt987 + arg4 * local92.anInt988) / (local22 * local92.anInt985);
					local26.anIntArray24[local43] = Static120.method1995(local73, local123);
					if (this.aClass26Array2 == null || this.aClass26Array2[this.anIntArray299[local43]] == null) {
						local92 = this.aClass26Array1[this.anIntArray299[local43]];
					} else {
						local92 = this.aClass26Array2[this.anIntArray299[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt989 + arg3 * local92.anInt987 + arg4 * local92.anInt988) / (local22 * local92.anInt985);
					local26.anIntArray20[local43] = Static120.method1995(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass17Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt726 + arg3 * local253.anInt732 + arg4 * local253.anInt724) / (local22 + local22 / 2);
					local26.anIntArray21[local43] = Static120.method1995(this.aShortArray13[local43] & 0xFFFF, local123);
					local26.anIntArray20[local43] = -1;
				} else {
					local26.anIntArray20[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass26Array2 == null || this.aClass26Array2[this.anIntArray307[local43]] == null) {
					local92 = this.aClass26Array1[this.anIntArray307[local43]];
				} else {
					local92 = this.aClass26Array2[this.anIntArray307[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt989 + arg3 * local92.anInt987 + arg4 * local92.anInt988) / (local22 * local92.anInt985);
				local26.anIntArray21[local43] = Static120.method1981(local123);
				if (this.aClass26Array2 == null || this.aClass26Array2[this.anIntArray298[local43]] == null) {
					local92 = this.aClass26Array1[this.anIntArray298[local43]];
				} else {
					local92 = this.aClass26Array2[this.anIntArray298[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt989 + arg3 * local92.anInt987 + arg4 * local92.anInt988) / (local22 * local92.anInt985);
				local26.anIntArray24[local43] = Static120.method1981(local123);
				if (this.aClass26Array2 == null || this.aClass26Array2[this.anIntArray299[local43]] == null) {
					local92 = this.aClass26Array1[this.anIntArray299[local43]];
				} else {
					local92 = this.aClass26Array2[this.anIntArray299[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt989 + arg3 * local92.anInt987 + arg4 * local92.anInt988) / (local22 * local92.anInt985);
				local26.anIntArray20[local43] = Static120.method1981(local123);
			} else if (local49 == 1) {
				local253 = this.aClass17Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt726 + arg3 * local253.anInt732 + arg4 * local253.anInt724) / (local22 + local22 / 2);
				local26.anIntArray21[local43] = Static120.method1981(local123);
				local26.anIntArray20[local43] = -1;
			} else {
				local26.anIntArray20[local43] = -2;
			}
		}
		this.method1986();
		local26.anInt349 = this.anInt2993;
		local26.anIntArray26 = this.anIntArray305;
		local26.anIntArray29 = this.anIntArray308;
		local26.anIntArray22 = this.anIntArray296;
		local26.anInt347 = this.anInt2990;
		local26.anIntArray28 = this.anIntArray307;
		local26.anIntArray25 = this.anIntArray298;
		local26.anIntArray19 = this.anIntArray299;
		local26.aByteArray2 = this.aByteArray33;
		local26.aByteArray3 = this.aByteArray31;
		local26.aByteArray4 = this.aByteArray32;
		if (local26.aByteArray4 == null) {
			local26.aShortArray1 = null;
		} else {
			local26.aShortArray1 = this.aShortArray13;
		}
		local26.aByte1 = this.aByte5;
		local26.anInt345 = this.anInt2992;
		local26.anIntArray23 = this.anIntArray295;
		local26.anIntArray18 = this.anIntArray302;
		local26.anIntArray27 = this.anIntArray301;
		local26.anIntArrayArray4 = this.anIntArrayArray29;
		local26.anIntArrayArray3 = this.anIntArrayArray28;
		return local26;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(SS)V")
	public void method1988(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2990; local1++) {
			if (this.aShortArray13[local1] == arg0) {
				this.aShortArray13[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZ)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class5_Sub1_Sub1_Sub7 local16 = new Class5_Sub1_Sub1_Sub7();
		local16.anInt2993 = this.anInt2993;
		local16.anInt2990 = this.anInt2990;
		local16.anInt2992 = this.anInt2992;
		local16.anIntArray305 = this.anIntArray305;
		local16.anIntArray296 = this.anIntArray296;
		local16.anIntArray307 = this.anIntArray307;
		local16.anIntArray298 = this.anIntArray298;
		local16.anIntArray299 = this.anIntArray299;
		local16.aByteArray30 = this.aByteArray30;
		local16.aByteArray33 = this.aByteArray33;
		local16.aByteArray31 = this.aByteArray31;
		local16.aByteArray32 = this.aByteArray32;
		local16.aShortArray13 = this.aShortArray13;
		local16.aByte5 = this.aByte5;
		local16.anIntArray295 = this.anIntArray295;
		local16.anIntArray302 = this.anIntArray302;
		local16.anIntArray301 = this.anIntArray301;
		local16.anIntArray304 = this.anIntArray304;
		local16.anIntArray297 = this.anIntArray297;
		local16.anIntArrayArray29 = this.anIntArrayArray29;
		local16.anIntArrayArray28 = this.anIntArrayArray28;
		local16.aShort2 = this.aShort2;
		local16.aShort1 = this.aShort1;
		local16.anIntArray308 = new int[local16.anInt2993];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt2993; local128++) {
			@Pc(134) int local134 = this.anIntArray305[local128];
			@Pc(139) int local139 = this.anIntArray308[local128];
			@Pc(144) int local144 = this.anIntArray296[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray308[local128] = local139 + local180 - local126;
		}
		local16.method1993();
		return local16;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!wd;I)I")
	private int method1990(@OriginalArg(0) Class5_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray305[arg1];
		@Pc(11) int local11 = arg0.anIntArray308[arg1];
		@Pc(16) int local16 = arg0.anIntArray296[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2993; local18++) {
			if (local6 == this.anIntArray305[local18] && local11 == this.anIntArray308[local18] && local16 == this.anIntArray296[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray305[this.anInt2993] = local6;
			this.anIntArray308[this.anInt2993] = local11;
			this.anIntArray296[this.anInt2993] = local16;
			if (arg0.anIntArray304 != null) {
				this.anIntArray304[this.anInt2993] = arg0.anIntArray304[arg1];
			}
			local1 = this.anInt2993++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "()V")
	public void method1991() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2993; local1++) {
			@Pc(7) int local7 = this.anIntArray296[local1];
			this.anIntArray296[local1] = this.anIntArray305[local1];
			this.anIntArray305[local1] = -local7;
		}
		this.method1993();
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "()V")
	public void method1992() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2993; local1++) {
			this.anIntArray305[local1] = -this.anIntArray305[local1];
			this.anIntArray296[local1] = -this.anIntArray296[local1];
		}
		this.method1993();
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "()V")
	private void method1993() {
		this.aClass26Array1 = null;
		this.aClass26Array2 = null;
		this.aClass17Array1 = null;
		this.aBoolean130 = false;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V")
	public void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2993; local1++) {
			this.anIntArray305[local1] += arg0;
			this.anIntArray308[local1] += arg1;
			this.anIntArray296[local1] += arg2;
		}
		this.method1993();
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "()V")
	public void method1996() {
		if (this.aBoolean130) {
			return;
		}
		super.anInt2987 = 0;
		this.anInt2988 = 0;
		this.anInt2991 = 999999;
		this.anInt2994 = -999999;
		this.anInt2996 = -99999;
		this.anInt2989 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2993; local23++) {
			@Pc(29) int local29 = this.anIntArray305[local23];
			@Pc(34) int local34 = this.anIntArray308[local23];
			@Pc(39) int local39 = this.anIntArray296[local23];
			if (local29 < this.anInt2991) {
				this.anInt2991 = local29;
			}
			if (local29 > this.anInt2994) {
				this.anInt2994 = local29;
			}
			if (local39 < this.anInt2989) {
				this.anInt2989 = local39;
			}
			if (local39 > this.anInt2996) {
				this.anInt2996 = local39;
			}
			if (-local34 > super.anInt2987) {
				super.anInt2987 = -local34;
			}
			if (local34 > this.anInt2988) {
				this.anInt2988 = local34;
			}
		}
		this.aBoolean130 = true;
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "()V")
	public void method1997() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2993; local1++) {
			this.anIntArray296[local1] = -this.anIntArray296[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2990; local18++) {
			@Pc(24) int local24 = this.anIntArray307[local18];
			this.anIntArray307[local18] = this.anIntArray299[local18];
			this.anIntArray299[local18] = local24;
		}
		this.method1993();
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "()V")
	public void method1998() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2993; local1++) {
			@Pc(7) int local7 = this.anIntArray305[local1];
			this.anIntArray305[local1] = this.anIntArray296[local1];
			this.anIntArray296[local1] = -local7;
		}
		this.method1993();
	}
}
