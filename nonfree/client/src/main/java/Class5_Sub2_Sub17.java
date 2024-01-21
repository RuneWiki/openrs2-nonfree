import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!ve", name = "nb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ve", name = "Jb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ve", name = "Kb", descriptor = "I")
	public int anInt3079;

	@OriginalMember(owner = "client!ve", name = "Ob", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
	public int anInt3057 = 1;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
	public int anInt3060 = -1;

	@OriginalMember(owner = "client!ve", name = "pb", descriptor = "[Lclient!mb;")
	public final Class45[] aClass45Array19 = new Class45[5];

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
	private int anInt3058 = -1;

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
	private int anInt3066 = -1;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
	public int anInt3056 = -1;

	@OriginalMember(owner = "client!ve", name = "Ab", descriptor = "I")
	public int anInt3073 = -1;

	@OriginalMember(owner = "client!ve", name = "wb", descriptor = "I")
	public int anInt3072 = -1;

	@OriginalMember(owner = "client!ve", name = "qb", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!ve", name = "ob", descriptor = "I")
	public int anInt3068 = -1;

	@OriginalMember(owner = "client!ve", name = "Fb", descriptor = "I")
	public int anInt3076 = -1;

	@OriginalMember(owner = "client!ve", name = "Bb", descriptor = "Z")
	public boolean aBoolean134 = true;

	@OriginalMember(owner = "client!ve", name = "Gb", descriptor = "I")
	public int anInt3077 = -1;

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "Lclient!mb;")
	public Class45 aClass45_1342 = Static76.aClass45_915;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
	public int anInt3063 = -1;

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
	private int anInt3062 = 128;

	@OriginalMember(owner = "client!ve", name = "Nb", descriptor = "I")
	public int anInt3082 = 32;

	@OriginalMember(owner = "client!ve", name = "yb", descriptor = "Z")
	public boolean aBoolean133 = true;

	@OriginalMember(owner = "client!ve", name = "Lb", descriptor = "I")
	private int anInt3080 = 0;

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
	public int anInt3059 = -1;

	@OriginalMember(owner = "client!ve", name = "Pb", descriptor = "Z")
	public boolean aBoolean136 = true;

	@OriginalMember(owner = "client!ve", name = "Sb", descriptor = "I")
	private int anInt3084 = 0;

	@OriginalMember(owner = "client!ve", name = "vb", descriptor = "I")
	private int anInt3071 = 128;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!hb;Z)V")
	public void method2118(@OriginalArg(0) Class5_Sub9 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1408();
			if (local3 == 0) {
				return;
			}
			this.method2121(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V")
	public void method2119() {
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)Z")
	public boolean method2120() {
		if (this.anIntArray479 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3066 != -1) {
			local10 = Static112.method2047(this.anInt3066);
		} else if (this.anInt3058 != -1) {
			local10 = Static117.anIntArray483[this.anInt3058];
		}
		return local10 >= 0 && local10 < this.anIntArray479.length && this.anIntArray479[local10] != -1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!hb;I)V")
	private void method2121(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub9 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		if (arg0 == 1) {
			local12 = arg1.method1408();
			this.anIntArray480 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray480[local18] = arg1.method1418();
			}
		} else if (arg0 == 2) {
			this.aClass45_1342 = arg1.method1448();
		} else if (arg0 == 12) {
			this.anInt3057 = arg1.method1408();
		} else if (arg0 == 13) {
			this.anInt3059 = arg1.method1418();
		} else if (arg0 == 14) {
			this.anInt3076 = arg1.method1418();
		} else if (arg0 == 15) {
			this.anInt3072 = arg1.method1418();
		} else if (arg0 == 16) {
			this.anInt3060 = arg1.method1418();
		} else if (arg0 == 17) {
			this.anInt3076 = arg1.method1418();
			this.anInt3068 = arg1.method1418();
			this.anInt3063 = arg1.method1418();
			this.anInt3073 = arg1.method1418();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass45Array19[arg0 - 30] = arg1.method1448();
			if (this.aClass45Array19[arg0 - 30].method1330(Static50.aClass45_642)) {
				this.aClass45Array19[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local12 = arg1.method1408();
			this.aShortArray14 = new short[local12];
			this.aShortArray13 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray14[local18] = (short) arg1.method1418();
				this.aShortArray13[local18] = (short) arg1.method1418();
			}
		} else if (arg0 == 60) {
			local12 = arg1.method1408();
			this.anIntArray482 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray482[local18] = arg1.method1418();
			}
		} else if (arg0 == 93) {
			this.aBoolean136 = false;
		} else if (arg0 == 95) {
			this.anInt3056 = arg1.method1418();
		} else if (arg0 == 97) {
			this.anInt3071 = arg1.method1418();
		} else if (arg0 == 98) {
			this.anInt3062 = arg1.method1418();
		} else if (arg0 == 99) {
			this.aBoolean132 = true;
		} else if (arg0 == 100) {
			this.anInt3080 = arg1.method1447();
		} else if (arg0 == 101) {
			this.anInt3084 = arg1.method1447() * 5;
		} else if (arg0 == 102) {
			this.anInt3077 = arg1.method1418();
		} else if (arg0 == 103) {
			this.anInt3082 = arg1.method1418();
		} else if (arg0 == 106) {
			this.anInt3066 = arg1.method1418();
			if (this.anInt3066 == 65535) {
				this.anInt3066 = -1;
			}
			this.anInt3058 = arg1.method1418();
			if (this.anInt3058 == 65535) {
				this.anInt3058 = -1;
			}
			local12 = arg1.method1408();
			this.anIntArray479 = new int[local12 + 1];
			for (local18 = 0; local18 <= local12; local18++) {
				this.anIntArray479[local18] = arg1.method1418();
				if (this.anIntArray479[local18] == 65535) {
					this.anIntArray479[local18] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean133 = false;
		} else if (arg0 == 109) {
			this.aBoolean134 = false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)Lclient!ve;")
	public Class5_Sub2_Sub17 method2122() {
		@Pc(5) int local5 = -1;
		if (this.anInt3066 != -1) {
			local5 = Static112.method2047(this.anInt3066);
		} else if (this.anInt3058 != -1) {
			local5 = Static117.anIntArray483[this.anInt3058];
		}
		return local5 < 0 || this.anIntArray479.length <= local5 || this.anIntArray479[local5] == -1 ? null : Static63.method1254(this.anIntArray479[local5]);
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method2125() {
		if (this.anIntArray479 != null) {
			@Pc(10) Class5_Sub2_Sub17 local10 = this.method2122();
			return local10 == null ? null : local10.method2125();
		} else if (this.anIntArray482 == null) {
			return null;
		} else {
			@Pc(25) boolean local25 = false;
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray482.length; local27++) {
				if (!Static85.aClass29_57.method739(this.anIntArray482[local27], 0)) {
					local25 = true;
				}
			}
			if (local25) {
				return null;
			}
			@Pc(54) Class5_Sub2_Sub4_Sub7[] local54 = new Class5_Sub2_Sub4_Sub7[this.anIntArray482.length];
			for (@Pc(56) int local56 = 0; local56 < this.anIntArray482.length; local56++) {
				local54[local56] = Static83.method1570(Static85.aClass29_57, this.anIntArray482[local56]);
			}
			@Pc(90) Class5_Sub2_Sub4_Sub7 local90;
			if (local54.length == 1) {
				local90 = local54[0];
			} else {
				local90 = new Class5_Sub2_Sub4_Sub7(local54, local54.length);
			}
			if (this.aShortArray14 != null) {
				for (@Pc(100) int local100 = 0; local100 < this.aShortArray14.length; local100++) {
					local90.method1575(this.aShortArray14[local100], this.aShortArray13[local100]);
				}
			}
			return local90;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!ka;Lclient!ka;I)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method2127(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub2_Sub9 arg1, @OriginalArg(3) Class5_Sub2_Sub9 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray479 != null) {
			@Pc(12) Class5_Sub2_Sub17 local12 = this.method2122();
			return local12 == null ? null : local12.method2127(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class5_Sub2_Sub4_Sub2 local32 = (Class5_Sub2_Sub4_Sub2) Static71.aClass67_16.method1823((long) this.anInt3079);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray480.length; local38++) {
				if (!Static85.aClass29_57.method739(this.anIntArray480[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class5_Sub2_Sub4_Sub7[] local70 = new Class5_Sub2_Sub4_Sub7[this.anIntArray480.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray480.length; local72++) {
				local70[local72] = Static83.method1570(Static85.aClass29_57, this.anIntArray480[local72]);
			}
			@Pc(105) Class5_Sub2_Sub4_Sub7 local105;
			if (local70.length == 1) {
				local105 = local70[0];
			} else {
				local105 = new Class5_Sub2_Sub4_Sub7(local70, local70.length);
			}
			if (this.aShortArray14 != null) {
				for (@Pc(116) int local116 = 0; local116 < this.aShortArray14.length; local116++) {
					local105.method1575(this.aShortArray14[local116], this.aShortArray13[local116]);
				}
			}
			local32 = local105.method1579(this.anInt3080 + 64, this.anInt3084 + 850, -30, -50, -30);
			Static71.aClass67_16.method1818(local32, (long) this.anInt3079);
		}
		@Pc(171) Class5_Sub2_Sub4_Sub2 local171;
		if (arg2 != null && arg1 != null) {
			local171 = arg2.method1147(arg0, local32, arg1, arg3);
		} else if (arg2 != null) {
			local171 = arg2.method1151(arg3, local32);
		} else if (arg1 == null) {
			local171 = local32.method436(true);
		} else {
			local171 = arg1.method1151(arg0, local32);
		}
		if (this.anInt3071 != 128 || this.anInt3062 != 128) {
			local171.method435(this.anInt3071, this.anInt3062, this.anInt3071);
		}
		return local171;
	}
}
