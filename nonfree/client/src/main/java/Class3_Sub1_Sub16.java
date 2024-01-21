import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!tc", name = "vb", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!tc", name = "Ab", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!tc", name = "Ib", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!tc", name = "Sb", descriptor = "I")
	public int anInt3172;

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
	public int anInt3145 = -1;

	@OriginalMember(owner = "client!tc", name = "jb", descriptor = "Z")
	public boolean aBoolean110 = true;

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
	public int anInt3147 = -1;

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
	private int anInt3148 = -1;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
	private int anInt3143 = -1;

	@OriginalMember(owner = "client!tc", name = "qb", descriptor = "I")
	public int anInt3159 = -1;

	@OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
	private int anInt3153 = 0;

	@OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
	public int anInt3150 = 32;

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "I")
	public int anInt3160 = -1;

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
	public int anInt3155 = -1;

	@OriginalMember(owner = "client!tc", name = "Bb", descriptor = "[Lclient!qf;")
	public final Class60[] aClass60Array19 = new Class60[5];

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "Z")
	public boolean aBoolean109 = true;

	@OriginalMember(owner = "client!tc", name = "Eb", descriptor = "I")
	private int anInt3164 = 128;

	@OriginalMember(owner = "client!tc", name = "Cb", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!tc", name = "Ob", descriptor = "Z")
	public boolean aBoolean113 = true;

	@OriginalMember(owner = "client!tc", name = "Fb", descriptor = "I")
	public int anInt3165 = -1;

	@OriginalMember(owner = "client!tc", name = "Nb", descriptor = "Lclient!qf;")
	public Class60 aClass60_1327 = Static58.aClass60_803;

	@OriginalMember(owner = "client!tc", name = "wb", descriptor = "I")
	private int anInt3161 = 128;

	@OriginalMember(owner = "client!tc", name = "Hb", descriptor = "I")
	public int anInt3167 = 1;

	@OriginalMember(owner = "client!tc", name = "Rb", descriptor = "I")
	private int anInt3171 = 0;

	@OriginalMember(owner = "client!tc", name = "yb", descriptor = "I")
	public int anInt3162 = -1;

	@OriginalMember(owner = "client!tc", name = "Lb", descriptor = "I")
	public int anInt3170 = -1;

	@OriginalMember(owner = "client!tc", name = "Gb", descriptor = "I")
	public int anInt3166 = -1;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Lclient!ue;")
	public Class3_Sub1_Sub1_Sub7 method2089() {
		if (this.anIntArray334 != null) {
			@Pc(12) Class3_Sub1_Sub16 local12 = this.method2093();
			return local12 == null ? null : local12.method2089();
		} else if (this.anIntArray337 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray337.length; local29++) {
				if (!Static43.aClass25_9.method918(this.anIntArray337[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class3_Sub1_Sub1_Sub7[] local57 = new Class3_Sub1_Sub1_Sub7[this.anIntArray337.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray337.length; local59++) {
				local57[local59] = Static121.method2242(Static43.aClass25_9, this.anIntArray337[local59]);
			}
			@Pc(94) Class3_Sub1_Sub1_Sub7 local94;
			if (local57.length == 1) {
				local94 = local57[0];
			} else {
				local94 = new Class3_Sub1_Sub1_Sub7(local57, local57.length);
			}
			if (this.aShortArray10 != null) {
				for (@Pc(105) int local105 = 0; local105 < this.aShortArray10.length; local105++) {
					local94.method2233(this.aShortArray10[local105], this.aShortArray11[local105]);
				}
			}
			return local94;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!la;II)V")
	private void method2090(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(113) int local113;
		@Pc(119) int local119;
		if (arg1 == 1) {
			local113 = arg0.method1936();
			this.anIntArray336 = new int[local113];
			for (local119 = 0; local119 < local113; local119++) {
				this.anIntArray336[local119] = arg0.method1963();
			}
		} else if (arg1 == 2) {
			this.aClass60_1327 = arg0.method1943();
		} else if (arg1 == 12) {
			this.anInt3167 = arg0.method1936();
		} else if (arg1 == 13) {
			this.anInt3162 = arg0.method1963();
		} else if (arg1 == 14) {
			this.anInt3166 = arg0.method1963();
		} else if (arg1 == 15) {
			this.anInt3165 = arg0.method1963();
		} else if (arg1 == 16) {
			this.anInt3155 = arg0.method1963();
		} else if (arg1 == 17) {
			this.anInt3166 = arg0.method1963();
			this.anInt3170 = arg0.method1963();
			this.anInt3159 = arg0.method1963();
			this.anInt3145 = arg0.method1963();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass60Array19[arg1 - 30] = arg0.method1943();
			if (this.aClass60Array19[arg1 - 30].method1860(Static27.aClass60_383)) {
				this.aClass60Array19[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local113 = arg0.method1936();
			this.aShortArray11 = new short[local113];
			this.aShortArray10 = new short[local113];
			for (local119 = 0; local119 < local113; local119++) {
				this.aShortArray10[local119] = (short) arg0.method1963();
				this.aShortArray11[local119] = (short) arg0.method1963();
			}
		} else if (arg1 == 60) {
			local113 = arg0.method1936();
			this.anIntArray337 = new int[local113];
			for (local119 = 0; local119 < local113; local119++) {
				this.anIntArray337[local119] = arg0.method1963();
			}
		} else if (arg1 == 93) {
			this.aBoolean110 = false;
		} else if (arg1 == 95) {
			this.anInt3160 = arg0.method1963();
		} else if (arg1 == 97) {
			this.anInt3161 = arg0.method1963();
		} else if (arg1 == 98) {
			this.anInt3164 = arg0.method1963();
		} else if (arg1 == 99) {
			this.aBoolean111 = true;
		} else if (arg1 == 100) {
			this.anInt3153 = arg0.method1958();
		} else if (arg1 == 101) {
			this.anInt3171 = arg0.method1958() * 5;
		} else if (arg1 == 102) {
			this.anInt3147 = arg0.method1963();
		} else if (arg1 == 103) {
			this.anInt3150 = arg0.method1963();
		} else if (arg1 == 106) {
			this.anInt3143 = arg0.method1963();
			if (this.anInt3143 == 65535) {
				this.anInt3143 = -1;
			}
			this.anInt3148 = arg0.method1963();
			if (this.anInt3148 == 65535) {
				this.anInt3148 = -1;
			}
			local113 = arg0.method1936();
			this.anIntArray334 = new int[local113 + 1];
			for (local119 = 0; local119 <= local113; local119++) {
				this.anIntArray334[local119] = arg0.method1963();
				if (this.anIntArray334[local119] == 65535) {
					this.anIntArray334[local119] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean109 = false;
		} else if (arg1 == 109) {
			this.aBoolean113 = false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!nf;Lclient!nf;III)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method2091(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) Class3_Sub1_Sub14 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray334 != null) {
			@Pc(12) Class3_Sub1_Sub16 local12 = this.method2093();
			return local12 == null ? null : local12.method2091(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class3_Sub1_Sub1_Sub4 local32 = (Class3_Sub1_Sub1_Sub4) Static41.aClass17_22.method643((long) this.anInt3172);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray336.length; local38++) {
				if (!Static43.aClass25_9.method918(this.anIntArray336[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(66) Class3_Sub1_Sub1_Sub7[] local66 = new Class3_Sub1_Sub1_Sub7[this.anIntArray336.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray336.length; local68++) {
				local66[local68] = Static121.method2242(Static43.aClass25_9, this.anIntArray336[local68]);
			}
			@Pc(99) Class3_Sub1_Sub1_Sub7 local99;
			if (local66.length == 1) {
				local99 = local66[0];
			} else {
				local99 = new Class3_Sub1_Sub1_Sub7(local66, local66.length);
			}
			if (this.aShortArray10 != null) {
				for (@Pc(110) int local110 = 0; local110 < this.aShortArray10.length; local110++) {
					local99.method2233(this.aShortArray10[local110], this.aShortArray11[local110]);
				}
			}
			local32 = local99.method2229(this.anInt3153 + 64, this.anInt3171 + 850, -30, -50, -30);
			Static41.aClass17_22.method644((long) this.anInt3172, local32);
		}
		@Pc(167) Class3_Sub1_Sub1_Sub4 local167;
		if (arg0 != null && arg1 != null) {
			local167 = arg0.method1603(arg1, arg2, local32, arg3);
		} else if (arg0 != null) {
			local167 = arg0.method1597(local32, arg3);
		} else if (arg1 == null) {
			local167 = local32.method627(true);
		} else {
			local167 = arg1.method1597(local32, arg2);
		}
		if (this.anInt3161 != 128 || this.anInt3164 != 128) {
			local167.method632(this.anInt3161, this.anInt3164, this.anInt3161);
		}
		return local167;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
	public void method2092() {
	}

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)Lclient!tc;")
	public Class3_Sub1_Sub16 method2093() {
		@Pc(13) int local13 = -1;
		if (this.anInt3143 != -1) {
			local13 = Static35.method780(this.anInt3143);
		} else if (this.anInt3148 != -1) {
			local13 = Static18.anIntArray80[this.anInt3148];
		}
		return local13 < 0 || local13 >= this.anIntArray334.length || this.anIntArray334[local13] == -1 ? null : Static81.method1638(this.anIntArray334[local13]);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!la;B)V")
	public void method2095(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1936();
			if (local5 == 0) {
				return;
			}
			this.method2090(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "(I)Z")
	public boolean method2096() {
		if (this.anIntArray334 == null) {
			return true;
		}
		@Pc(18) int local18 = -1;
		if (this.anInt3143 != -1) {
			local18 = Static35.method780(this.anInt3143);
		} else if (this.anInt3148 != -1) {
			local18 = Static18.anIntArray80[this.anInt3148];
		}
		return local18 >= 0 && local18 < this.anIntArray334.length && this.anIntArray334[local18] != -1;
	}
}
