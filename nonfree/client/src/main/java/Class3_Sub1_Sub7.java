import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ed", name = "Z", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!ed", name = "ab", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
	public int anInt910;

	@OriginalMember(owner = "client!ed", name = "mb", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!ed", name = "nb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ed", name = "sb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ed", name = "Ab", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	public int anInt899 = -1;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
	private int anInt898 = 128;

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Z")
	public boolean aBoolean41 = true;

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
	public int anInt897 = -1;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
	public int anInt909 = -1;

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "[Lclient!rd;")
	public final Class80[] aClass80Array7 = new Class80[5];

	@OriginalMember(owner = "client!ed", name = "kb", descriptor = "S")
	public short aShort2 = 0;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
	private int anInt902 = 0;

	@OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
	public int anInt913 = -1;

	@OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
	public int anInt907 = 32;

	@OriginalMember(owner = "client!ed", name = "jb", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
	private int anInt908 = 128;

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
	public int anInt912 = 1;

	@OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
	public int anInt915 = -1;

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "Z")
	public boolean aBoolean42 = true;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
	private int anInt903 = 0;

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
	public int anInt904 = -1;

	@OriginalMember(owner = "client!ed", name = "xb", descriptor = "I")
	public int anInt920 = -1;

	@OriginalMember(owner = "client!ed", name = "tb", descriptor = "I")
	public int anInt917 = -1;

	@OriginalMember(owner = "client!ed", name = "yb", descriptor = "I")
	public int anInt921 = -1;

	@OriginalMember(owner = "client!ed", name = "Cb", descriptor = "S")
	public short aShort3 = 0;

	@OriginalMember(owner = "client!ed", name = "wb", descriptor = "I")
	private int anInt919 = -1;

	@OriginalMember(owner = "client!ed", name = "vb", descriptor = "Lclient!rd;")
	public Class80 aClass80_333 = Static73.aClass80_622;

	@OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
	private int anInt916 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBLclient!ri;)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method619(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub15 arg1) {
		if (this.anIntArray133 != null) {
			@Pc(17) Class3_Sub1_Sub7 local17 = this.method623();
			return local17 == null ? null : local17.method619(arg0, arg1);
		} else if (this.anIntArray134 == null) {
			return null;
		} else {
			@Pc(42) Class3_Sub1_Sub5_Sub3 local42 = (Class3_Sub1_Sub5_Sub3) Static186.aClass5_61.method139((long) this.anInt910);
			if (local42 == null) {
				@Pc(46) boolean local46 = false;
				for (@Pc(48) int local48 = 0; local48 < this.anIntArray134.length; local48++) {
					if (!Static99.aClass1_15.method52(this.anIntArray134[local48], 0)) {
						local46 = true;
					}
				}
				if (local46) {
					return null;
				}
				@Pc(80) Class3_Sub1_Sub5_Sub5[] local80 = new Class3_Sub1_Sub5_Sub5[this.anIntArray134.length];
				for (@Pc(82) int local82 = 0; local82 < this.anIntArray134.length; local82++) {
					local80[local82] = Static127.method1911(Static99.aClass1_15, this.anIntArray134[local82]);
				}
				@Pc(111) Class3_Sub1_Sub5_Sub5 local111;
				if (local80.length == 1) {
					local111 = local80[0];
				} else {
					local111 = new Class3_Sub1_Sub5_Sub5(local80, local80.length);
				}
				@Pc(122) int local122;
				if (this.aShortArray13 != null) {
					for (local122 = 0; local122 < this.aShortArray13.length; local122++) {
						local111.method1901(this.aShortArray13[local122], this.aShortArray11[local122]);
					}
				}
				if (this.aShortArray10 != null) {
					for (local122 = 0; local122 < this.aShortArray10.length; local122++) {
						local111.method1899(this.aShortArray10[local122], this.aShortArray12[local122]);
					}
				}
				local42 = local111.method1908(64, 768, -50, -10, -50, true);
				Static186.aClass5_61.method145(local42, (long) this.anInt910);
			}
			if (arg1 != null) {
				local42 = arg1.method2545(local42, arg0);
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ri;ILclient!ri;II)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method620(@OriginalArg(0) Class3_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub15 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray133 != null) {
			@Pc(12) Class3_Sub1_Sub7 local12 = this.method623();
			return local12 == null ? null : local12.method620(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class3_Sub1_Sub5_Sub3 local32 = (Class3_Sub1_Sub5_Sub3) Static66.aClass5_19.method139((long) this.anInt910);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray132.length; local38++) {
				if (!Static99.aClass1_15.method52(this.anIntArray132[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(66) Class3_Sub1_Sub5_Sub5[] local66 = new Class3_Sub1_Sub5_Sub5[this.anIntArray132.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray132.length; local68++) {
				local66[local68] = Static127.method1911(Static99.aClass1_15, this.anIntArray132[local68]);
			}
			@Pc(100) Class3_Sub1_Sub5_Sub5 local100;
			if (local66.length == 1) {
				local100 = local66[0];
			} else {
				local100 = new Class3_Sub1_Sub5_Sub5(local66, local66.length);
			}
			@Pc(114) int local114;
			if (this.aShortArray13 != null) {
				for (local114 = 0; local114 < this.aShortArray13.length; local114++) {
					local100.method1901(this.aShortArray13[local114], this.aShortArray11[local114]);
				}
			}
			if (this.aShortArray10 != null) {
				for (local114 = 0; local114 < this.aShortArray10.length; local114++) {
					local100.method1899(this.aShortArray10[local114], this.aShortArray12[local114]);
				}
			}
			local32 = local100.method1908(this.anInt903 + 64, this.anInt902 + 850, -30, -50, -30, true);
			Static66.aClass5_19.method145(local32, (long) this.anInt910);
		}
		@Pc(201) Class3_Sub1_Sub5_Sub3 local201;
		if (arg2 != null && arg0 != null) {
			local201 = arg2.method2543(arg3, arg0, arg1, local32);
		} else if (arg2 != null) {
			local201 = arg2.method2535(arg3, local32);
		} else if (arg0 == null) {
			local201 = local32.method1371(true);
		} else {
			local201 = arg0.method2535(arg1, local32);
		}
		if (this.anInt898 != 128 || this.anInt908 != 128) {
			local201.method1369(this.anInt898, this.anInt908, this.anInt898);
		}
		return local201;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method621(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2107();
			if (local5 == 0) {
				return;
			}
			this.method626(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)Z")
	public boolean method622() {
		if (this.anIntArray133 == null) {
			return true;
		}
		@Pc(17) int local17 = -1;
		if (this.anInt916 != -1) {
			local17 = Static94.method1432(this.anInt916);
		} else if (this.anInt919 != -1) {
			local17 = Static41.anIntArray131[this.anInt919];
		}
		return local17 >= 0 && this.anIntArray133.length > local17 && this.anIntArray133[local17] != -1;
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(B)Lclient!ed;")
	public Class3_Sub1_Sub7 method623() {
		@Pc(5) int local5 = -1;
		if (this.anInt916 != -1) {
			local5 = Static94.method1432(this.anInt916);
		} else if (this.anInt919 != -1) {
			local5 = Static41.anIntArray131[this.anInt919];
		}
		return local5 < 0 || this.anIntArray133.length <= local5 || this.anIntArray133[local5] == -1 ? null : Static84.method3022(this.anIntArray133[local5]);
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
	public void method624() {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!mb;B)V")
	private void method626(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		@Pc(114) int local114;
		@Pc(124) int local124;
		if (arg0 == 1) {
			local114 = arg1.method2107();
			this.anIntArray132 = new int[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.anIntArray132[local124] = arg1.method2111();
			}
		} else if (arg0 == 2) {
			this.aClass80_333 = arg1.method2102();
		} else if (arg0 == 12) {
			this.anInt912 = arg1.method2107();
		} else if (arg0 == 13) {
			this.anInt915 = arg1.method2111();
		} else if (arg0 == 14) {
			this.anInt899 = arg1.method2111();
		} else if (arg0 == 15) {
			this.anInt917 = arg1.method2111();
		} else if (arg0 == 16) {
			this.anInt909 = arg1.method2111();
		} else if (arg0 == 17) {
			this.anInt899 = arg1.method2111();
			this.anInt904 = arg1.method2111();
			this.anInt920 = arg1.method2111();
			this.anInt921 = arg1.method2111();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass80Array7[arg0 - 30] = arg1.method2102();
			if (this.aClass80Array7[arg0 - 30].method2432(Static58.aClass80_509)) {
				this.aClass80Array7[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local114 = arg1.method2107();
			this.aShortArray13 = new short[local114];
			this.aShortArray11 = new short[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.aShortArray13[local124] = (short) arg1.method2111();
				this.aShortArray11[local124] = (short) arg1.method2111();
			}
			return;
		} else if (arg0 == 41) {
			local114 = arg1.method2107();
			this.aShortArray12 = new short[local114];
			this.aShortArray10 = new short[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.aShortArray10[local124] = (short) arg1.method2111();
				this.aShortArray12[local124] = (short) arg1.method2111();
			}
		} else if (arg0 == 60) {
			local114 = arg1.method2107();
			this.anIntArray134 = new int[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.anIntArray134[local124] = arg1.method2111();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean43 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt913 = arg1.method2111();
			return;
		} else if (arg0 == 97) {
			this.anInt898 = arg1.method2111();
			return;
		} else if (arg0 == 98) {
			this.anInt908 = arg1.method2111();
			return;
		} else if (arg0 == 99) {
			this.aBoolean40 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt903 = arg1.method2123();
			return;
		} else if (arg0 == 101) {
			this.anInt902 = arg1.method2123() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt897 = arg1.method2111();
			return;
		} else if (arg0 == 103) {
			this.anInt907 = arg1.method2111();
			return;
		} else if (arg0 == 106) {
			this.anInt916 = arg1.method2111();
			if (this.anInt916 == 65535) {
				this.anInt916 = -1;
			}
			this.anInt919 = arg1.method2111();
			if (this.anInt919 == 65535) {
				this.anInt919 = -1;
			}
			local114 = arg1.method2107();
			this.anIntArray133 = new int[local114 + 1];
			for (local124 = 0; local124 <= local114; local124++) {
				this.anIntArray133[local124] = arg1.method2111();
				if (this.anIntArray133[local124] == 65535) {
					this.anIntArray133[local124] = -1;
				}
			}
			return;
		} else {
			if (arg0 == 107) {
				this.aBoolean41 = false;
			} else if (arg0 == 109) {
				this.aBoolean42 = false;
				return;
			} else if (arg0 != 111) {
				if (arg0 == 113) {
					arg1.method2111();
					arg1.method2111();
				} else if (arg0 == 114) {
					arg1.method2123();
					arg1.method2123();
					return;
				} else if (arg0 == 115) {
					this.aShort2 = (short) (arg1.method2107() * 4);
					this.aShort3 = (short) (arg1.method2107() * 4);
					return;
				}
				return;
			}
			return;
		}
	}
}
