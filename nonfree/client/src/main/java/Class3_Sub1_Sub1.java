import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!ac", name = "sb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ac", name = "ub", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ac", name = "Fb", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!ac", name = "Jb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ac", name = "Lb", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!ac", name = "Wb", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!ac", name = "Xb", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Z")
	public boolean aBoolean9 = true;

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
	public int anInt141 = -1;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "Z")
	public boolean aBoolean8 = true;

	@OriginalMember(owner = "client!ac", name = "fb", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	public int anInt130 = -1;

	@OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
	public int anInt145 = 1;

	@OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
	public int anInt148 = 0;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
	private int anInt136 = -1;

	@OriginalMember(owner = "client!ac", name = "pb", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
	public int anInt142 = -1;

	@OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
	private int anInt152 = 0;

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "Z")
	public boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
	public int anInt140 = -1;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	public int anInt131 = 0;

	@OriginalMember(owner = "client!ac", name = "ob", descriptor = "I")
	public int anInt150 = 1;

	@OriginalMember(owner = "client!ac", name = "qb", descriptor = "I")
	private int anInt151 = 128;

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "Lclient!rd;")
	public Class80 aClass80_36 = Static180.aClass80_1540;

	@OriginalMember(owner = "client!ac", name = "wb", descriptor = "I")
	public int anInt155 = 0;

	@OriginalMember(owner = "client!ac", name = "xb", descriptor = "I")
	private int anInt156 = -1;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
	public int anInt144 = 0;

	@OriginalMember(owner = "client!ac", name = "Gb", descriptor = "I")
	public int anInt163 = 16;

	@OriginalMember(owner = "client!ac", name = "Bb", descriptor = "I")
	public int anInt159 = -1;

	@OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
	private int anInt149 = 0;

	@OriginalMember(owner = "client!ac", name = "Kb", descriptor = "I")
	private int anInt166 = -1;

	@OriginalMember(owner = "client!ac", name = "Eb", descriptor = "I")
	private int anInt162 = 0;

	@OriginalMember(owner = "client!ac", name = "yb", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!ac", name = "Ab", descriptor = "I")
	private int anInt158 = 0;

	@OriginalMember(owner = "client!ac", name = "Ib", descriptor = "I")
	private int anInt165 = 128;

	@OriginalMember(owner = "client!ac", name = "Rb", descriptor = "[Lclient!rd;")
	public final Class80[] aClass80Array1 = new Class80[5];

	@OriginalMember(owner = "client!ac", name = "Ob", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ac", name = "Cb", descriptor = "I")
	private int anInt160 = 128;

	@OriginalMember(owner = "client!ac", name = "Hb", descriptor = "I")
	public int anInt164 = -1;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
	public int anInt134 = 2;

	@OriginalMember(owner = "client!ac", name = "Vb", descriptor = "Z")
	public boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ac", name = "Mb", descriptor = "I")
	private int anInt168 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)Z")
	public boolean method111(@OriginalArg(0) int arg0) {
		if (this.anIntArray27 != null) {
			for (@Pc(58) int local58 = 0; local58 < this.anIntArray27.length; local58++) {
				if (this.anIntArray27[local58] == arg0) {
					return Static104.aClass1_16.method52(this.anIntArray22[local58] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray22 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(27) boolean local27 = true;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray22.length; local29++) {
				local27 &= Static104.aClass1_16.method52(this.anIntArray22[local29] & 0xFFFF, 0);
			}
			return local27;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)Lclient!ob;")
	private Class3_Sub1_Sub5_Sub5 method113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) boolean local4 = this.aBoolean12;
		if (arg1 == 2 && arg0 > 3) {
			local4 = !local4;
		}
		@Pc(18) Class3_Sub1_Sub5_Sub5 local18 = null;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(58) int local58;
		if (this.anIntArray27 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray22 == null) {
				return null;
			}
			local27 = this.anIntArray22.length;
			for (local29 = 0; local29 < local27; local29++) {
				local58 = this.anIntArray22[local29];
				if (local4) {
					local58 += 65536;
				}
				local18 = (Class3_Sub1_Sub5_Sub5) Static10.aClass5_3.method139((long) local58);
				if (local18 == null) {
					local18 = Static127.method1911(Static104.aClass1_16, local58 & 0xFFFF);
					if (local18 == null) {
						return null;
					}
					if (local4) {
						local18.method1904();
					}
					Static10.aClass5_3.method145(local18, (long) local58);
				}
				if (local27 > 1) {
					Static87.aClass3_Sub1_Sub5_Sub5Array1[local29] = local18;
				}
			}
			if (local27 > 1) {
				local18 = new Class3_Sub1_Sub5_Sub5(Static87.aClass3_Sub1_Sub5_Sub5Array1, local27);
			}
		} else {
			local27 = -1;
			for (local29 = 0; local29 < this.anIntArray27.length; local29++) {
				if (arg1 == this.anIntArray27[local29]) {
					local27 = local29;
					break;
				}
			}
			if (local27 == -1) {
				return null;
			}
			local58 = this.anIntArray22[local27];
			if (local4) {
				local58 += 65536;
			}
			local18 = (Class3_Sub1_Sub5_Sub5) Static10.aClass5_3.method139((long) local58);
			if (local18 == null) {
				local18 = Static127.method1911(Static104.aClass1_16, local58 & 0xFFFF);
				if (local18 == null) {
					return null;
				}
				if (local4) {
					local18.method1904();
				}
				Static10.aClass5_3.method145(local18, (long) local58);
			}
		}
		@Pc(196) boolean local196;
		if (this.anInt168 == 0 && this.anInt152 == 0 && this.anInt162 == 0) {
			local196 = false;
		} else {
			local196 = true;
		}
		@Pc(216) boolean local216;
		if (this.anInt160 == 128 && this.anInt151 == 128 && this.anInt165 == 128) {
			local216 = false;
		} else {
			local216 = true;
		}
		@Pc(252) Class3_Sub1_Sub5_Sub5 local252 = new Class3_Sub1_Sub5_Sub5(local18, arg0 == 0 && !local216 && !local196 && !local4, this.aShortArray2 == null, this.aShortArray1 == null, true);
		if (local4) {
			local252.method1897();
		}
		if (arg1 == 4 && arg0 > 3) {
			local252.method1893();
			local252.method1905(45, 0, -45);
		}
		@Pc(285) int local285 = arg0 & 0x3;
		if (local285 == 1) {
			local252.method1909();
		} else if (local285 == 2) {
			local252.method1898();
		} else if (local285 == 3) {
			local252.method1890();
		}
		@Pc(311) int local311;
		if (this.aShortArray2 != null) {
			for (local311 = 0; local311 < this.aShortArray2.length; local311++) {
				local252.method1901(this.aShortArray2[local311], this.aShortArray3[local311]);
			}
		}
		if (this.aShortArray1 != null) {
			for (local311 = 0; local311 < this.aShortArray1.length; local311++) {
				local252.method1899(this.aShortArray1[local311], this.aShortArray4[local311]);
			}
		}
		if (local216) {
			local252.method1894(this.anInt160, this.anInt151, this.anInt165);
		}
		if (local196) {
			local252.method1905(this.anInt168, this.anInt152, this.anInt162);
		}
		return local252;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method115(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2107();
			if (local5 == 0) {
				return;
			}
			this.method121(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI[[IIIILclient!ri;II)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method116(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub1_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(21) long local21;
		if (this.anIntArray27 == null) {
			local21 = arg3 + (this.anInt167 << 10);
		} else {
			local21 = (arg6 << 3) + (this.anInt167 << 10) + arg3;
		}
		@Pc(46) Class3_Sub1_Sub5_Sub3 local46 = (Class3_Sub1_Sub5_Sub3) Static136.aClass5_40.method139(local21);
		if (local46 == null) {
			@Pc(54) Class3_Sub1_Sub5_Sub5 local54 = this.method113(arg3, arg6);
			if (local54 == null) {
				return null;
			}
			local46 = local54.method1908(this.anInt158 + 64, 768 - -(this.anInt149 * 5), -50, -10, -50, true);
			Static136.aClass5_40.method145(local46, local21);
		}
		if (arg5 == null && this.anInt166 == -1) {
			return local46;
		}
		if (arg5 == null) {
			local46 = local46.method1371(true);
		} else {
			local46 = arg5.method2540(arg3, local46, arg7);
		}
		if (this.anInt166 >= 0) {
			local46 = local46.method1379(arg1, arg4, arg2, arg0, false, this.anInt166);
		}
		return local46;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZIII[[I)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(14) long local14;
		if (this.anIntArray27 == null) {
			local14 = arg0 + (this.anInt167 << 10);
		} else {
			local14 = arg0 + (arg2 << 3) + (this.anInt167 << 10);
		}
		@Pc(49) Class3_Sub1_Sub5_Sub3 local49 = (Class3_Sub1_Sub5_Sub3) Static156.aClass5_45.method139(local14);
		if (local49 == null) {
			@Pc(57) Class3_Sub1_Sub5_Sub5 local57 = this.method113(arg0, arg2);
			if (local57 == null) {
				return null;
			}
			local49 = local57.method1908(this.anInt158 + 64, this.anInt149 * 5 + 768, -50, -10, -50, this.anInt166 >= 0);
			Static156.aClass5_45.method145(local49, local14);
		}
		if (this.anInt166 >= 0) {
			local49 = local49.method1379(arg5, arg4, arg1, arg3, true, this.anInt166);
		}
		return local49;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	public void method118() {
		if (this.anInt159 == -1) {
			this.anInt159 = 0;
			if (this.anIntArray22 != null && (this.anIntArray27 == null || this.anIntArray27[0] == 10)) {
				this.anInt159 = 1;
			}
			for (@Pc(32) int local32 = 0; local32 < 5; local32++) {
				if (this.aClass80Array1[local32] != null) {
					this.anInt159 = 1;
				}
			}
		}
		if (this.anInt130 == -1) {
			this.anInt130 = this.anInt134 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII[[IZ)Lclient!fh;")
	public Class3_Sub1_Sub9 method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(16) long local16;
		if (this.anIntArray27 == null) {
			local16 = arg4 + (this.anInt167 << 10);
		} else {
			local16 = arg4 + (this.anInt167 << 10) + (arg3 << 3);
		}
		@Pc(36) Class3_Sub1_Sub9 local36 = (Class3_Sub1_Sub9) Static167.aClass5_52.method139(local16);
		if (local36 == null) {
			local36 = new Class3_Sub1_Sub9();
			@Pc(48) Class3_Sub1_Sub5_Sub5 local48 = this.method113(arg4, arg3);
			if (local48 == null) {
				return local36;
			}
			if (this.aBoolean13) {
				local48.aShort31 = (short) (this.anInt149 * 5 + 768);
				local48.aShort28 = (short) (this.anInt158 + 64);
				local48.method1896();
				local36.aClass3_Sub1_Sub5_3 = local48;
			} else {
				local36.aClass3_Sub1_Sub5_3 = local48.method1908(this.anInt158 + 64, 768 - -(this.anInt149 * 5), -50, -10, -50, ~this.anInt166 <= -1);
			}
			Static167.aClass5_52.method145(local36, local16);
		}
		if (this.aBoolean13 || this.anInt166 >= 0) {
			@Pc(129) Class3_Sub1_Sub9 local129 = new Class3_Sub1_Sub9();
			local129.aClass3_Sub1_Sub5_3 = local36.aClass3_Sub1_Sub5_3;
			local36 = local129;
			if (this.aBoolean13) {
				local129.aClass3_Sub1_Sub5_3 = ((Class3_Sub1_Sub5_Sub5) local129.aClass3_Sub1_Sub5_3).method1910();
			}
			if (this.anInt166 >= 0) {
				if (local129.aClass3_Sub1_Sub5_3 instanceof Class3_Sub1_Sub5_Sub3) {
					local129.aClass3_Sub1_Sub5_3 = ((Class3_Sub1_Sub5_Sub3) local129.aClass3_Sub1_Sub5_3).method1379(arg5, arg2, arg0, arg1, true, this.anInt166);
				} else if (local129.aClass3_Sub1_Sub5_3 instanceof Class3_Sub1_Sub5_Sub5) {
					local129.aClass3_Sub1_Sub5_3 = ((Class3_Sub1_Sub5_Sub5) local129.aClass3_Sub1_Sub5_3).method1892(arg5, arg2, arg0, arg1, this.anInt166);
				}
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!mb;)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		@Pc(27) int local27;
		@Pc(53) int local53;
		if (arg0 == 1) {
			local27 = arg1.method2107();
			if (local27 > 0) {
				if (this.anIntArray22 == null || Static22.aBoolean30) {
					this.anIntArray22 = new int[local27];
					this.anIntArray27 = new int[local27];
					for (local53 = 0; local53 < local27; local53++) {
						this.anIntArray22[local53] = arg1.method2111();
						this.anIntArray27[local53] = arg1.method2107();
					}
				} else {
					arg1.anInt2923 += local27 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass80_36 = arg1.method2102();
		} else if (arg0 == 5) {
			local27 = arg1.method2107();
			if (local27 > 0) {
				if (this.anIntArray22 == null || Static22.aBoolean30) {
					this.anIntArray22 = new int[local27];
					this.anIntArray27 = null;
					for (local53 = 0; local53 < local27; local53++) {
						this.anIntArray22[local53] = arg1.method2111();
					}
				} else {
					arg1.anInt2923 += local27 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt145 = arg1.method2107();
		} else if (arg0 == 15) {
			this.anInt150 = arg1.method2107();
		} else if (arg0 == 17) {
			this.aBoolean14 = false;
			this.anInt134 = 0;
		} else if (arg0 == 18) {
			this.aBoolean14 = false;
		} else if (arg0 == 19) {
			this.anInt159 = arg1.method2107();
		} else if (arg0 == 21) {
			this.anInt166 = 0;
		} else if (arg0 == 22) {
			this.aBoolean13 = true;
		} else if (arg0 == 23) {
			this.aBoolean11 = true;
		} else if (arg0 == 24) {
			this.anInt142 = arg1.method2111();
			if (this.anInt142 == 65535) {
				this.anInt142 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt134 = 1;
		} else if (arg0 == 28) {
			this.anInt163 = arg1.method2107();
		} else if (arg0 == 29) {
			this.anInt158 = arg1.method2123();
		} else if (arg0 == 39) {
			this.anInt149 = arg1.method2123() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass80Array1[arg0 - 30] = arg1.method2102();
			if (this.aClass80Array1[arg0 - 30].method2432(Static58.aClass80_509)) {
				this.aClass80Array1[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local27 = arg1.method2107();
			this.aShortArray2 = new short[local27];
			this.aShortArray3 = new short[local27];
			for (local53 = 0; local53 < local27; local53++) {
				this.aShortArray2[local53] = (short) arg1.method2111();
				this.aShortArray3[local53] = (short) arg1.method2111();
			}
		} else if (arg0 == 41) {
			local27 = arg1.method2107();
			this.aShortArray4 = new short[local27];
			this.aShortArray1 = new short[local27];
			for (local53 = 0; local53 < local27; local53++) {
				this.aShortArray1[local53] = (short) arg1.method2111();
				this.aShortArray4[local53] = (short) arg1.method2111();
			}
		} else if (arg0 == 60) {
			this.anInt141 = arg1.method2111();
		} else if (arg0 == 62) {
			this.aBoolean12 = true;
		} else if (arg0 == 64) {
			this.aBoolean9 = false;
		} else if (arg0 == 65) {
			this.anInt160 = arg1.method2111();
		} else if (arg0 == 66) {
			this.anInt151 = arg1.method2111();
		} else if (arg0 == 67) {
			this.anInt165 = arg1.method2111();
		} else if (arg0 == 68) {
			this.anInt164 = arg1.method2111();
		} else if (arg0 == 69) {
			this.anInt144 = arg1.method2107();
		} else if (arg0 == 70) {
			this.anInt168 = arg1.method2138();
		} else if (arg0 == 71) {
			this.anInt152 = arg1.method2138();
		} else if (arg0 == 72) {
			this.anInt162 = arg1.method2138();
		} else if (arg0 == 73) {
			this.aBoolean15 = true;
		} else if (arg0 == 74) {
			this.aBoolean16 = true;
		} else if (arg0 == 75) {
			this.anInt130 = arg1.method2107();
		} else if (arg0 == 77) {
			this.anInt136 = arg1.method2111();
			if (this.anInt136 == 65535) {
				this.anInt136 = -1;
			}
			this.anInt156 = arg1.method2111();
			if (this.anInt156 == 65535) {
				this.anInt156 = -1;
			}
			local27 = arg1.method2107();
			this.anIntArray23 = new int[local27 + 1];
			for (local53 = 0; local53 <= local27; local53++) {
				this.anIntArray23[local53] = arg1.method2111();
				if (this.anIntArray23[local53] == 65535) {
					this.anIntArray23[local53] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt140 = arg1.method2111();
			this.anInt131 = arg1.method2107();
		} else if (arg0 == 79) {
			this.anInt148 = arg1.method2111();
			this.anInt155 = arg1.method2111();
			this.anInt131 = arg1.method2107();
			local27 = arg1.method2107();
			this.anIntArray26 = new int[local27];
			for (local53 = 0; local53 < local27; local53++) {
				this.anIntArray26[local53] = arg1.method2111();
			}
		} else if (arg0 == 81) {
			this.anInt166 = arg1.method2107() * 256;
		} else if (arg0 != 82) {
			if (arg0 == 83) {
				arg1.method2107();
			} else if (arg0 == 84) {
				arg1.method2138();
			} else if (arg0 == 85) {
				arg1.method2138();
			} else if (arg0 == 86) {
				arg1.method2138();
			} else if (arg0 == 87) {
				arg1.method2111();
			} else if (arg0 != 88) {
				if (arg0 == 89) {
					this.aBoolean8 = false;
				} else if (arg0 == 90) {
					this.aBoolean10 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)Z")
	public boolean method123() {
		if (this.anIntArray23 == null) {
			return this.anInt140 != -1 || this.anIntArray26 != null;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray23.length; local27++) {
			if (this.anIntArray23[local27] != -1) {
				@Pc(42) Class3_Sub1_Sub1 local42 = Static162.method2627(this.anIntArray23[local27]);
				if (local42.anInt140 != -1 || local42.anIntArray26 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Z")
	public boolean method124() {
		if (this.anIntArray22 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray22.length; local14++) {
			local12 &= Static104.aClass1_16.method52(this.anIntArray22[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)Lclient!ac;")
	public Class3_Sub1_Sub1 method125() {
		@Pc(11) int local11 = -1;
		if (this.anInt136 != -1) {
			local11 = Static94.method1432(this.anInt136);
		} else if (this.anInt156 != -1) {
			local11 = Static41.anIntArray131[this.anInt156];
		}
		return local11 < 0 || this.anIntArray23.length <= local11 || this.anIntArray23[local11] == -1 ? null : Static162.method2627(this.anIntArray23[local11]);
	}
}
