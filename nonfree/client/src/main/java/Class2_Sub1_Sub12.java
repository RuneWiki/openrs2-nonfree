import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
	public int anInt2128;

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!qb", name = "Eb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!qb", name = "Ib", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!qb", name = "Jb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	public int anInt2126 = -1;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lclient!pe;")
	public Class65 aClass65_894 = Static91.aClass65_849;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
	public int anInt2127 = -1;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
	public int anInt2123 = -1;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	public int anInt2125 = -1;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Z")
	public boolean aBoolean82 = true;

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "I")
	private int anInt2134 = 0;

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "I")
	private int anInt2137 = 0;

	@OriginalMember(owner = "client!qb", name = "vb", descriptor = "[Lclient!pe;")
	public final Class65[] aClass65Array51 = new Class65[5];

	@OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
	public int anInt2136 = -1;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "Z")
	public boolean aBoolean83 = true;

	@OriginalMember(owner = "client!qb", name = "yb", descriptor = "I")
	private int anInt2141 = 128;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
	private int anInt2120 = 128;

	@OriginalMember(owner = "client!qb", name = "Bb", descriptor = "I")
	public int anInt2143 = -1;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
	public int anInt2119 = 32;

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "Z")
	public boolean aBoolean84 = true;

	@OriginalMember(owner = "client!qb", name = "Ab", descriptor = "I")
	public int anInt2142 = 1;

	@OriginalMember(owner = "client!qb", name = "Hb", descriptor = "I")
	private int anInt2148 = -1;

	@OriginalMember(owner = "client!qb", name = "Gb", descriptor = "I")
	public int anInt2147 = -1;

	@OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
	private int anInt2133 = -1;

	@OriginalMember(owner = "client!qb", name = "Db", descriptor = "I")
	public int anInt2145 = -1;

	@OriginalMember(owner = "client!qb", name = "Kb", descriptor = "I")
	public int anInt2149 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!qb;")
	public Class2_Sub1_Sub12 method1557() {
		@Pc(5) int local5 = -1;
		if (this.anInt2133 != -1) {
			local5 = Static100.method1644(this.anInt2133);
		} else if (this.anInt2148 != -1) {
			local5 = Static129.anIntArray363[this.anInt2148];
		}
		return local5 < 0 || this.anIntArray282.length <= local5 || this.anIntArray282[local5] == -1 ? null : Static116.method1856(this.anIntArray282[local5]);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public void method1558() {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ae;BLclient!ae;I)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method1560(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1, @OriginalArg(3) Class2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray282 != null) {
			@Pc(10) Class2_Sub1_Sub12 local10 = this.method1557();
			return local10 == null ? null : local10.method1560(arg0, arg1, arg2, arg3);
		}
		@Pc(38) Class2_Sub1_Sub1_Sub7 local38 = (Class2_Sub1_Sub1_Sub7) Static120.aClass8_58.method172((long) this.anInt2128);
		if (local38 == null) {
			@Pc(42) boolean local42 = false;
			for (@Pc(44) int local44 = 0; local44 < this.anIntArray283.length; local44++) {
				if (!Static18.aClass56_10.method1670(this.anIntArray283[local44], 0)) {
					local42 = true;
				}
			}
			if (local42) {
				return null;
			}
			@Pc(77) Class2_Sub1_Sub1_Sub2[] local77 = new Class2_Sub1_Sub1_Sub2[this.anIntArray283.length];
			for (@Pc(79) int local79 = 0; local79 < this.anIntArray283.length; local79++) {
				local77[local79] = Static27.method559(Static18.aClass56_10, this.anIntArray283[local79]);
			}
			@Pc(110) Class2_Sub1_Sub1_Sub2 local110;
			if (local77.length == 1) {
				local110 = local77[0];
			} else {
				local110 = new Class2_Sub1_Sub1_Sub2(local77, local77.length);
			}
			@Pc(123) int local123;
			if (this.aShortArray30 != null) {
				for (local123 = 0; local123 < this.aShortArray30.length; local123++) {
					local110.method544(this.aShortArray30[local123], this.aShortArray31[local123]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local123 = 0; local123 < this.aShortArray28.length; local123++) {
					local110.method555(this.aShortArray28[local123], this.aShortArray29[local123]);
				}
			}
			local38 = local110.method542(this.anInt2134 + 64, this.anInt2137 + 850, -30, -50, -30);
			Static120.aClass8_58.method176((long) this.anInt2128, local38);
		}
		@Pc(199) Class2_Sub1_Sub1_Sub7 local199;
		if (arg1 != null && arg2 != null) {
			local199 = arg1.method118(arg2, arg3, arg0, local38);
		} else if (arg1 != null) {
			local199 = arg1.method120(arg3, local38);
		} else if (arg2 == null) {
			local199 = local38.method2012(true);
		} else {
			local199 = arg2.method120(arg0, local38);
		}
		if (this.anInt2120 != 128 || this.anInt2141 != 128) {
			local199.method2007(this.anInt2120, this.anInt2141, this.anInt2120);
		}
		return local199;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method1561() {
		if (this.anIntArray282 != null) {
			@Pc(12) Class2_Sub1_Sub12 local12 = this.method1557();
			return local12 == null ? null : local12.method1561();
		} else if (this.anIntArray281 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray281.length; local29++) {
				if (!Static18.aClass56_10.method1670(this.anIntArray281[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class2_Sub1_Sub1_Sub2[] local61 = new Class2_Sub1_Sub1_Sub2[this.anIntArray281.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray281.length; local63++) {
				local61[local63] = Static27.method559(Static18.aClass56_10, this.anIntArray281[local63]);
			}
			@Pc(100) Class2_Sub1_Sub1_Sub2 local100;
			if (local61.length == 1) {
				local100 = local61[0];
			} else {
				local100 = new Class2_Sub1_Sub1_Sub2(local61, local61.length);
			}
			@Pc(114) int local114;
			if (this.aShortArray30 != null) {
				for (local114 = 0; local114 < this.aShortArray30.length; local114++) {
					local100.method544(this.aShortArray30[local114], this.aShortArray31[local114]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local114 = 0; local114 < this.aShortArray28.length; local114++) {
					local100.method555(this.aShortArray28[local114], this.aShortArray29[local114]);
				}
			}
			return local100;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Z")
	public boolean method1562() {
		if (this.anIntArray282 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2133 != -1) {
			local10 = Static100.method1644(this.anInt2133);
		} else if (this.anInt2148 != -1) {
			local10 = Static129.anIntArray363[this.anInt2148];
		}
		return local10 >= 0 && local10 < this.anIntArray282.length && this.anIntArray282[local10] != -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!be;)V")
	public void method1563(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method933();
			if (local10 == 0) {
				return;
			}
			this.method1564(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!be;I)V")
	private void method1564(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(71) int local71;
		@Pc(81) int local81;
		if (arg1 == 1) {
			local71 = arg0.method933();
			this.anIntArray283 = new int[local71];
			for (local81 = 0; local81 < local71; local81++) {
				this.anIntArray283[local81] = arg0.method896();
			}
		} else if (arg1 == 2) {
			this.aClass65_894 = arg0.method931();
		} else if (arg1 == 12) {
			this.anInt2142 = arg0.method933();
		} else if (arg1 == 13) {
			this.anInt2127 = arg0.method896();
		} else if (arg1 == 14) {
			this.anInt2147 = arg0.method896();
		} else if (arg1 == 15) {
			this.anInt2125 = arg0.method896();
		} else if (arg1 == 16) {
			this.anInt2126 = arg0.method896();
		} else if (arg1 == 17) {
			this.anInt2147 = arg0.method896();
			this.anInt2145 = arg0.method896();
			this.anInt2136 = arg0.method896();
			this.anInt2149 = arg0.method896();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass65Array51[arg1 - 30] = arg0.method931();
			if (this.aClass65Array51[arg1 - 30].method1488(Static18.aClass65_140)) {
				this.aClass65Array51[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local71 = arg0.method933();
			this.aShortArray30 = new short[local71];
			this.aShortArray31 = new short[local71];
			for (local81 = 0; local81 < local71; local81++) {
				this.aShortArray30[local81] = (short) arg0.method896();
				this.aShortArray31[local81] = (short) arg0.method896();
			}
			return;
		} else if (arg1 == 41) {
			local71 = arg0.method933();
			this.aShortArray28 = new short[local71];
			this.aShortArray29 = new short[local71];
			for (local81 = 0; local81 < local71; local81++) {
				this.aShortArray28[local81] = (short) arg0.method896();
				this.aShortArray29[local81] = (short) arg0.method896();
			}
			return;
		} else if (arg1 == 60) {
			local71 = arg0.method933();
			this.anIntArray281 = new int[local71];
			for (local81 = 0; local81 < local71; local81++) {
				this.anIntArray281[local81] = arg0.method896();
			}
			return;
		} else if (arg1 == 93) {
			this.aBoolean84 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt2123 = arg0.method896();
			return;
		} else if (arg1 == 97) {
			this.anInt2120 = arg0.method896();
			return;
		} else if (arg1 == 98) {
			this.anInt2141 = arg0.method896();
			return;
		} else if (arg1 == 99) {
			this.aBoolean81 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt2134 = arg0.method922();
			return;
		} else if (arg1 == 101) {
			this.anInt2137 = arg0.method922() * 5;
			return;
		} else if (arg1 == 102) {
			this.anInt2143 = arg0.method896();
			return;
		} else if (arg1 == 103) {
			this.anInt2119 = arg0.method896();
			return;
		} else {
			if (arg1 == 106) {
				this.anInt2133 = arg0.method896();
				if (this.anInt2133 == 65535) {
					this.anInt2133 = -1;
				}
				this.anInt2148 = arg0.method896();
				if (this.anInt2148 == 65535) {
					this.anInt2148 = -1;
				}
				local71 = arg0.method933();
				this.anIntArray282 = new int[local71 + 1];
				for (local81 = 0; local81 <= local71; local81++) {
					this.anIntArray282[local81] = arg0.method896();
					if (this.anIntArray282[local81] == 65535) {
						this.anIntArray282[local81] = -1;
					}
				}
			} else if (arg1 == 107) {
				this.aBoolean83 = false;
				return;
			} else if (arg1 == 109) {
				this.aBoolean82 = false;
				return;
			}
			return;
		}
	}
}
