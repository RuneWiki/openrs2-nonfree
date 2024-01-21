import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wa", name = "db", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
	public int anInt3043;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!wa", name = "Eb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!wa", name = "Fb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!wa", name = "Mb", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
	private int anInt3037 = 128;

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
	private int anInt3035 = 0;

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
	public int anInt3042 = 1;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
	public int anInt3044 = -1;

	@OriginalMember(owner = "client!wa", name = "kb", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
	private int anInt3049 = -1;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "Lclient!id;")
	public Class34 aClass34_1561 = Static132.aClass34_1588;

	@OriginalMember(owner = "client!wa", name = "pb", descriptor = "[Lclient!id;")
	public final Class34[] aClass34Array25 = new Class34[5];

	@OriginalMember(owner = "client!wa", name = "ub", descriptor = "Z")
	public boolean aBoolean180 = false;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	private int anInt3041 = -1;

	@OriginalMember(owner = "client!wa", name = "Bb", descriptor = "I")
	private int anInt3059 = 128;

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
	public int anInt3039 = -1;

	@OriginalMember(owner = "client!wa", name = "zb", descriptor = "I")
	public int anInt3057 = 32;

	@OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
	public int anInt3056 = -1;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	public int anInt3040 = -1;

	@OriginalMember(owner = "client!wa", name = "Hb", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!wa", name = "wb", descriptor = "I")
	private int anInt3055 = 0;

	@OriginalMember(owner = "client!wa", name = "Jb", descriptor = "I")
	public int anInt3063 = -1;

	@OriginalMember(owner = "client!wa", name = "Ib", descriptor = "I")
	public int anInt3062 = -1;

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
	public int anInt3046 = -1;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	public int anInt3036 = -1;

	@OriginalMember(owner = "client!wa", name = "Kb", descriptor = "Z")
	public boolean aBoolean182 = true;

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "I")
	public int anInt3065 = -1;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Lclient!wa;")
	public Class1_Sub1_Sub17 method2010() {
		@Pc(5) int local5 = -1;
		if (this.anInt3049 != -1) {
			local5 = Static67.method1129(this.anInt3049);
		} else if (this.anInt3041 != -1) {
			local5 = Static39.anIntArray116[this.anInt3041];
		}
		return local5 < 0 || this.anIntArray375.length <= local5 || this.anIntArray375[local5] == -1 ? null : Static65.method1119(this.anIntArray375[local5]);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
	public void method2013() {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!of;B)V")
	public void method2015(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2072();
			if (local17 == 0) {
				return;
			}
			this.method2019(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!gd;ILclient!gd;)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method2017(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub6 arg3) {
		if (this.anIntArray375 != null) {
			@Pc(12) Class1_Sub1_Sub17 local12 = this.method2010();
			return local12 == null ? null : local12.method2017(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class1_Sub1_Sub1_Sub2 local32 = (Class1_Sub1_Sub1_Sub2) Static77.aClass63_14.method1663((long) this.anInt3043);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray374.length; local38++) {
				if (!Static112.aClass35_28.method1561(0, this.anIntArray374[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(66) Class1_Sub1_Sub1_Sub4[] local66 = new Class1_Sub1_Sub1_Sub4[this.anIntArray374.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray374.length; local68++) {
				local66[local68] = Static83.method1412(Static112.aClass35_28, this.anIntArray374[local68]);
			}
			@Pc(96) Class1_Sub1_Sub1_Sub4 local96;
			if (local66.length == 1) {
				local96 = local66[0];
			} else {
				local96 = new Class1_Sub1_Sub1_Sub4(local66, local66.length);
			}
			if (this.aShortArray21 != null) {
				for (@Pc(110) int local110 = 0; local110 < this.aShortArray21.length; local110++) {
					local96.method1415(this.aShortArray21[local110], this.aShortArray20[local110]);
				}
			}
			local32 = local96.method1410(this.anInt3035 + 64, this.anInt3055 + 850, -30, -50, -30);
			Static77.aClass63_14.method1659(local32, (long) this.anInt3043);
		}
		@Pc(173) Class1_Sub1_Sub1_Sub2 local173;
		if (arg3 != null && arg1 != null) {
			local173 = arg3.method724(arg2, arg0, local32, arg1);
		} else if (arg3 != null) {
			local173 = arg3.method716(arg2, local32);
		} else if (arg1 == null) {
			local173 = local32.method1098(true);
		} else {
			local173 = arg1.method716(arg0, local32);
		}
		if (this.anInt3037 != 128 || this.anInt3059 != 128) {
			local173.method1084(this.anInt3037, this.anInt3059, this.anInt3037);
		}
		return local173;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!of;II)V")
	private void method2019(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		@Pc(232) int local232;
		@Pc(240) int local240;
		if (arg1 == 1) {
			local232 = arg0.method2072();
			this.anIntArray374 = new int[local232];
			for (local240 = 0; local240 < local232; local240++) {
				this.anIntArray374[local240] = arg0.method2051();
			}
		} else if (arg1 == 2) {
			this.aClass34_1561 = arg0.method2084();
		} else if (arg1 == 12) {
			this.anInt3042 = arg0.method2072();
		} else if (arg1 == 13) {
			this.anInt3036 = arg0.method2051();
		} else if (arg1 == 14) {
			this.anInt3062 = arg0.method2051();
		} else if (arg1 == 15) {
			this.anInt3044 = arg0.method2051();
		} else if (arg1 == 16) {
			this.anInt3040 = arg0.method2051();
		} else if (arg1 == 17) {
			this.anInt3062 = arg0.method2051();
			this.anInt3063 = arg0.method2051();
			this.anInt3056 = arg0.method2051();
			this.anInt3046 = arg0.method2051();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass34Array25[arg1 - 30] = arg0.method2084();
			if (this.aClass34Array25[arg1 - 30].method961(Static23.aClass34_402)) {
				this.aClass34Array25[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local232 = arg0.method2072();
			this.aShortArray20 = new short[local232];
			this.aShortArray21 = new short[local232];
			for (local240 = 0; local240 < local232; local240++) {
				this.aShortArray21[local240] = (short) arg0.method2051();
				this.aShortArray20[local240] = (short) arg0.method2051();
			}
		} else if (arg1 == 60) {
			local232 = arg0.method2072();
			this.anIntArray373 = new int[local232];
			for (local240 = 0; local240 < local232; local240++) {
				this.anIntArray373[local240] = arg0.method2051();
			}
		} else if (arg1 == 93) {
			this.aBoolean181 = false;
		} else if (arg1 == 95) {
			this.anInt3065 = arg0.method2051();
		} else if (arg1 == 97) {
			this.anInt3037 = arg0.method2051();
		} else if (arg1 == 98) {
			this.anInt3059 = arg0.method2051();
		} else if (arg1 == 99) {
			this.aBoolean180 = true;
		} else if (arg1 == 100) {
			this.anInt3035 = arg0.method2086();
		} else if (arg1 == 101) {
			this.anInt3055 = arg0.method2086() * 5;
		} else if (arg1 == 102) {
			this.anInt3039 = arg0.method2051();
		} else if (arg1 == 103) {
			this.anInt3057 = arg0.method2051();
		} else if (arg1 == 106) {
			this.anInt3049 = arg0.method2051();
			if (this.anInt3049 == 65535) {
				this.anInt3049 = -1;
			}
			this.anInt3041 = arg0.method2051();
			if (this.anInt3041 == 65535) {
				this.anInt3041 = -1;
			}
			local232 = arg0.method2072();
			this.anIntArray375 = new int[local232 + 1];
			for (local240 = 0; local240 <= local232; local240++) {
				this.anIntArray375[local240] = arg0.method2051();
				if (this.anIntArray375[local240] == 65535) {
					this.anIntArray375[local240] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean182 = false;
		} else if (arg1 == 109) {
			this.aBoolean179 = false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)Z")
	public boolean method2020() {
		if (this.anIntArray375 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3049 != -1) {
			local10 = Static67.method1129(this.anInt3049);
		} else if (this.anInt3041 != -1) {
			local10 = Static39.anIntArray116[this.anInt3041];
		}
		return local10 >= 0 && local10 < this.anIntArray375.length && this.anIntArray375[local10] != -1;
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)Lclient!nf;")
	public Class1_Sub1_Sub1_Sub4 method2021() {
		if (this.anIntArray375 != null) {
			@Pc(12) Class1_Sub1_Sub17 local12 = this.method2010();
			return local12 == null ? null : local12.method2021();
		} else if (this.anIntArray373 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray373.length; local34++) {
				if (!Static112.aClass35_28.method1561(0, this.anIntArray373[local34])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(66) Class1_Sub1_Sub1_Sub4[] local66 = new Class1_Sub1_Sub1_Sub4[this.anIntArray373.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray373.length; local68++) {
				local66[local68] = Static83.method1412(Static112.aClass35_28, this.anIntArray373[local68]);
			}
			@Pc(101) Class1_Sub1_Sub1_Sub4 local101;
			if (local66.length == 1) {
				local101 = local66[0];
			} else {
				local101 = new Class1_Sub1_Sub1_Sub4(local66, local66.length);
			}
			if (this.aShortArray21 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.aShortArray21.length; local112++) {
					local101.method1415(this.aShortArray21[local112], this.aShortArray20[local112]);
				}
			}
			return local101;
		}
	}
}
