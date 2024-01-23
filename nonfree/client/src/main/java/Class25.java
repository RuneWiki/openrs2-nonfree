import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class25 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	public boolean aBoolean47;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public void method762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static128.anIntArray285[arg1];
		if (this.anIntArray86[local7] != 0 && Static25.method365(arg0) != null) {
			this.anIntArray86[local7] = arg0 | Integer.MIN_VALUE;
			this.method766();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILclient!tc;Lclient!tc;)Lclient!ra;")
	public Class20_Sub5 method764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class110 arg2, @OriginalArg(4) Class110 arg3) {
		if (this.anInt1037 != -1) {
			return Static162.method2710(this.anInt1037).method3122(arg1, arg3, arg0, arg2);
		}
		@Pc(23) int[] local23 = this.anIntArray86;
		@Pc(26) long local26 = this.aLong42;
		if (arg2 != null && (arg2.anInt4015 >= 0 || arg2.anInt4008 >= 0)) {
			local23 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local23[local42] = this.anIntArray86[local42];
			}
			if (arg2.anInt4015 >= 0) {
				if (arg2.anInt4015 == 65535) {
					local26 ^= 0xFFFFFFFF00000000L;
					local23[5] = 0;
				} else {
					local23[5] = arg2.anInt4015 | 0x40000000;
					local26 ^= (long) local23[5] << 32;
				}
			}
			if (arg2.anInt4008 >= 0) {
				if (arg2.anInt4008 == 65535) {
					local26 ^= 0xFFFFFFFFL;
					local23[3] = 0;
				} else {
					local23[3] = arg2.anInt4008 | 0x40000000;
					local26 ^= local23[3];
				}
			}
		}
		@Pc(133) Class20_Sub5 local133 = (Class20_Sub5) Static4.aClass84_7.method2579(local26);
		if (local133 == null) {
			@Pc(137) boolean local137 = false;
			for (@Pc(139) int local139 = 0; local139 < 12; local139++) {
				@Pc(145) int local145 = local23[local139];
				if ((local145 & 0x40000000) == 0) {
					if ((local145 & Integer.MIN_VALUE) != 0 && !Static25.method365(local145 & 0x3FFFFFFF).method1028()) {
						local137 = true;
					}
				} else if (!Static16.method227(local145 & 0x3FFFFFFF).method1954(this.aBoolean47)) {
					local137 = true;
				}
			}
			if (local137) {
				if (this.aLong41 != -1L) {
					local133 = (Class20_Sub5) Static4.aClass84_7.method2579(this.aLong41);
				}
				if (local133 == null) {
					return null;
				}
			}
			if (local133 == null) {
				@Pc(209) Class20_Sub4[] local209 = new Class20_Sub4[12];
				@Pc(211) int local211 = 0;
				@Pc(219) int local219;
				@Pc(233) Class20_Sub4 local233;
				for (@Pc(213) int local213 = 0; local213 < 12; local213++) {
					local219 = local23[local213];
					if ((local219 & 0x40000000) != 0) {
						local233 = Static16.method227(local219 & 0x3FFFFFFF).method1950(this.aBoolean47);
						if (local233 != null) {
							local209[local211++] = local233;
						}
					} else if ((Integer.MIN_VALUE & local219) != 0) {
						local233 = Static25.method365(local219 & 0x3FFFFFFF).method1021();
						if (local233 != null) {
							local209[local211++] = local233;
						}
					}
				}
				local219 = local23[0];
				@Pc(294) int local294;
				if ((local219 & 0x40000000) != 0) {
					@Pc(289) Class70 local289 = Static16.method227(local219 & 0x3FFFFFFF);
					if (local289.anIntArrayArray18 != null) {
						for (local294 = 0; local294 < local289.anIntArrayArray18.length; local294++) {
							if (local289.anIntArrayArray18[local294] != null && local209[local294 + 1] != null) {
								@Pc(316) int local316 = local289.anIntArrayArray18[local294][0];
								@Pc(323) int local323 = local289.anIntArrayArray18[local294][1];
								@Pc(330) int local330 = local289.anIntArrayArray18[local294][3];
								@Pc(337) int local337 = local289.anIntArrayArray18[local294][4];
								@Pc(344) int local344 = local289.anIntArrayArray18[local294][2];
								@Pc(351) int local351 = local289.anIntArrayArray18[local294][5];
								local209[local294 + 1].method1425(local316, local323, local344);
								local209[local294 + 1].method1424(local330, local337, local351);
							}
						}
					}
				}
				local233 = new Class20_Sub4(local209, local211);
				for (local294 = 0; local294 < 5; local294++) {
					if (this.anIntArray85[local294] < Static31.aShortArrayArray2[local294].length) {
						local233.method1406(Static213.aShortArray61[local294], Static31.aShortArrayArray2[local294][this.anIntArray85[local294]]);
					}
					if (Static60.aShortArrayArray4[local294].length > this.anIntArray85[local294]) {
						local233.method1406(Static112.aShortArray34[local294], Static60.aShortArrayArray4[local294][this.anIntArray85[local294]]);
					}
				}
				local133 = local233.method1402(64, 850, -30, -50, -30);
				Static4.aClass84_7.method2582(local133, local26);
				this.aLong41 = local26;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local133;
		}
		@Pc(469) Class20_Sub5 local469;
		if (arg2 != null && arg3 != null) {
			local469 = arg2.method3183(local133, arg3, arg1, arg0);
		} else if (arg2 == null) {
			local469 = arg3.method3182(arg0, local133);
		} else {
			local469 = arg2.method3182(arg1, local133);
		}
		return local469;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	private void method766() {
		@Pc(4) long local4 = this.aLong42;
		this.aLong42 = -1L;
		@Pc(13) long[] local13 = Class1_Sub3_Sub11.aLongArray3;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong42 = local13[(int) (((long) (this.anIntArray86[local15] >> 24) ^ this.aLong42) & 0xFFL)] ^ this.aLong42 >>> 8;
			this.aLong42 = local13[(int) ((this.aLong42 ^ (long) (this.anIntArray86[local15] >> 16)) & 0xFFL)] ^ this.aLong42 >>> 8;
			this.aLong42 = local13[(int) (((long) (this.anIntArray86[local15] >> 8) ^ this.aLong42) & 0xFFL)] ^ this.aLong42 >>> 8;
			this.aLong42 = local13[(int) ((this.aLong42 ^ (long) this.anIntArray86[local15]) & 0xFFL)] ^ this.aLong42 >>> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong42 = local13[(int) ((this.aLong42 ^ (long) this.anIntArray85[local109]) & 0xFFL)] ^ this.aLong42 >>> 8;
		}
		this.aLong42 = this.aLong42 >>> 8 ^ local13[(int) ((this.aLong42 ^ (long) (this.aBoolean47 ? 1 : 0)) & 0xFFL)];
		if (local4 != 0L && local4 != this.aLong42) {
			Static4.aClass84_7.method2581(local4);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLclient!tc;)Lclient!ra;")
	public Class20_Sub5 method767(@OriginalArg(0) int arg0, @OriginalArg(2) Class110 arg1) {
		if (this.anInt1037 != -1) {
			return Static162.method2710(this.anInt1037).method3119(arg0, arg1);
		}
		@Pc(32) Class20_Sub5 local32 = (Class20_Sub5) Static203.aClass84_14.method2579(this.aLong42);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
				@Pc(45) int local45 = this.anIntArray86[local38];
				if ((local45 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local45) != 0 && !Static25.method365(local45 & 0x3FFFFFFF).method1024()) {
						local36 = true;
					}
				} else if (!Static16.method227(local45 & 0x3FFFFFFF).method1951(this.aBoolean47)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(91) Class20_Sub4[] local91 = new Class20_Sub4[12];
			@Pc(93) int local93 = 0;
			for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
				@Pc(102) int local102 = this.anIntArray86[local95];
				@Pc(118) Class20_Sub4 local118;
				if ((local102 & 0x40000000) != 0) {
					local118 = Static16.method227(local102 & 0x3FFFFFFF).method1959(this.aBoolean47);
					if (local118 != null) {
						local91[local93++] = local118;
					}
				} else if ((Integer.MIN_VALUE & local102) != 0) {
					local118 = Static25.method365(local102 & 0x3FFFFFFF).method1026();
					if (local118 != null) {
						local91[local93++] = local118;
					}
				}
			}
			@Pc(158) Class20_Sub4 local158 = new Class20_Sub4(local91, local93);
			for (@Pc(160) int local160 = 0; local160 < 5; local160++) {
				if (this.anIntArray85[local160] < Static31.aShortArrayArray2[local160].length) {
					local158.method1406(Static213.aShortArray61[local160], Static31.aShortArrayArray2[local160][this.anIntArray85[local160]]);
				}
				if (Static60.aShortArrayArray4[local160].length > this.anIntArray85[local160]) {
					local158.method1406(Static112.aShortArray34[local160], Static60.aShortArrayArray4[local160][this.anIntArray85[local160]]);
				}
			}
			local32 = local158.method1402(64, 768, -50, -10, -50);
			Static203.aClass84_14.method2582(local32, this.aLong42);
		}
		if (arg1 != null) {
			local32 = arg1.method3191(arg0, local32);
		}
		return local32;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
	public void method768(@OriginalArg(1) boolean arg0) {
		this.aBoolean47 = arg0;
		this.method766();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZB[I[II)V")
	public void method769(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static40.anInt875; local12++) {
					@Pc(18) Class41 local18 = Static25.method365(local12);
					if (local18 != null && !local18.aBoolean66 && local18.anInt1335 == (arg0 ? 7 : 0) + local8) {
						arg2[Static128.anIntArray285[local8]] = local12 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt1037 = arg3;
		this.anIntArray85 = arg1;
		this.aBoolean47 = arg0;
		this.anIntArray86 = arg2;
		this.method766();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
	public void method771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray85[arg0] = arg1;
		this.method766();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)I")
	public int method772() {
		return this.anInt1037 == -1 ? this.anIntArray86[1] + (this.anIntArray86[11] << 5) + (this.anIntArray86[8] << 10) + (this.anIntArray86[0] << 15) + (this.anIntArray85[0] << 25) + (this.anIntArray85[4] << 20) : 305419896 - -Static162.method2710(this.anInt1037).anInt3917;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!tc;BI)Lclient!ra;")
	public Class20_Sub5 method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(4) int arg3) {
		@Pc(20) long local20 = (long) arg3 << 32 | (long) (arg0 << 16) | (long) arg3;
		@Pc(26) Class20_Sub5 local26 = (Class20_Sub5) Static203.aClass84_14.method2579(local20);
		if (local26 == null) {
			@Pc(35) Class20_Sub4[] local35 = new Class20_Sub4[2];
			@Pc(37) int local37 = 0;
			if (!Static25.method365(arg3).method1024() || !Static25.method365(arg0).method1024()) {
				return null;
			}
			@Pc(57) Class20_Sub4 local57 = Static25.method365(arg3).method1026();
			if (local57 != null) {
				local37++;
				local35[0] = local57;
			}
			local57 = Static25.method365(arg0).method1026();
			if (local57 != null) {
				local35[local37++] = local57;
			}
			local57 = new Class20_Sub4(local35, local37);
			for (@Pc(85) int local85 = 0; local85 < 5; local85++) {
				if (this.anIntArray85[local85] < Static31.aShortArrayArray2[local85].length) {
					local57.method1406(Static213.aShortArray61[local85], Static31.aShortArrayArray2[local85][this.anIntArray85[local85]]);
				}
				if (Static60.aShortArrayArray4[local85].length > this.anIntArray85[local85]) {
					local57.method1406(Static112.aShortArray34[local85], Static60.aShortArrayArray4[local85][this.anIntArray85[local85]]);
				}
			}
			local26 = local57.method1402(64, 768, -50, -10, -50);
			Static203.aClass84_14.method2582(local26, local20);
		}
		if (arg2 != null) {
			local26 = arg2.method3191(arg1, local26);
		}
		return local26;
	}
}
