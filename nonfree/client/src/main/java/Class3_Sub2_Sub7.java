import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!fh", name = "R", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
	public int anInt1315;

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!fh", name = "ib", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!fh", name = "Db", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
	public int anInt1313 = -1;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
	public int anInt1311 = 32;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "S")
	public short aShort22 = 0;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
	public int anInt1310 = -1;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
	public int anInt1309 = -1;

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
	public int anInt1318 = -1;

	@OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
	public int anInt1324 = -1;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
	private int anInt1312 = 128;

	@OriginalMember(owner = "client!fh", name = "mb", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
	private int anInt1321 = 0;

	@OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
	private int anInt1326 = -1;

	@OriginalMember(owner = "client!fh", name = "qb", descriptor = "I")
	public int anInt1332 = -1;

	@OriginalMember(owner = "client!fh", name = "sb", descriptor = "Lclient!eh;")
	public Class28 aClass28_414 = Static167.aClass28_1418;

	@OriginalMember(owner = "client!fh", name = "nb", descriptor = "I")
	private int anInt1330 = 0;

	@OriginalMember(owner = "client!fh", name = "pb", descriptor = "Z")
	public boolean aBoolean72 = true;

	@OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
	private int anInt1327 = 128;

	@OriginalMember(owner = "client!fh", name = "V", descriptor = "Z")
	public boolean aBoolean70 = true;

	@OriginalMember(owner = "client!fh", name = "yb", descriptor = "S")
	public short aShort23 = 0;

	@OriginalMember(owner = "client!fh", name = "ub", descriptor = "I")
	public int anInt1335 = -1;

	@OriginalMember(owner = "client!fh", name = "Ab", descriptor = "[Lclient!eh;")
	public final Class28[] aClass28Array5 = new Class28[5];

	@OriginalMember(owner = "client!fh", name = "Ib", descriptor = "I")
	private int anInt1340 = -1;

	@OriginalMember(owner = "client!fh", name = "Cb", descriptor = "I")
	public int anInt1338 = 1;

	@OriginalMember(owner = "client!fh", name = "lb", descriptor = "I")
	public int anInt1329 = -1;

	@OriginalMember(owner = "client!fh", name = "rb", descriptor = "I")
	public int anInt1333 = -1;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)Z")
	public boolean method1114() {
		if (this.anIntArray242 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt1326 != -1) {
			local15 = Static138.method2708(this.anInt1326);
		} else if (this.anInt1340 != -1) {
			local15 = Static72.anIntArray354[this.anInt1340];
		}
		return local15 >= 0 && this.anIntArray242.length > local15 && this.anIntArray242[local15] != -1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!ca;Lclient!ca;II)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method1116(@OriginalArg(1) Class3_Sub2_Sub4 arg0, @OriginalArg(2) Class3_Sub2_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray242 != null) {
			@Pc(10) Class3_Sub2_Sub7 local10 = this.method1118();
			return local10 == null ? null : local10.method1116(arg0, arg1, arg2, arg3);
		}
		@Pc(30) Class3_Sub2_Sub1_Sub1 local30 = (Class3_Sub2_Sub1_Sub1) Static140.aClass63_26.method2337((long) this.anInt1315);
		if (local30 == null) {
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray244.length; local36++) {
				if (!Static174.aClass7_66.method1014(0, this.anIntArray244[local36])) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(67) Class3_Sub2_Sub1_Sub4[] local67 = new Class3_Sub2_Sub1_Sub4[this.anIntArray244.length];
			for (@Pc(69) int local69 = 0; local69 < this.anIntArray244.length; local69++) {
				local67[local69] = Static89.method2044(Static174.aClass7_66, this.anIntArray244[local69]);
			}
			@Pc(96) Class3_Sub2_Sub1_Sub4 local96;
			if (local67.length == 1) {
				local96 = local67[0];
			} else {
				local96 = new Class3_Sub2_Sub1_Sub4(local67, local67.length);
			}
			@Pc(109) int local109;
			if (this.aShortArray14 != null) {
				for (local109 = 0; local109 < this.aShortArray14.length; local109++) {
					local96.method2029(this.aShortArray14[local109], this.aShortArray17[local109]);
				}
			}
			if (this.aShortArray16 != null) {
				for (local109 = 0; local109 < this.aShortArray16.length; local109++) {
					local96.method2032(this.aShortArray16[local109], this.aShortArray15[local109]);
				}
			}
			local30 = local96.method2041(this.anInt1330 + 64, this.anInt1321 + 850, -30, -50, -30, true);
			Static140.aClass63_26.method2338((long) this.anInt1315, local30);
		}
		@Pc(192) Class3_Sub2_Sub1_Sub1 local192;
		if (arg0 != null && arg1 != null) {
			local192 = arg0.method569(local30, arg3, arg1, arg2);
		} else if (arg0 != null) {
			local192 = arg0.method565(local30, arg2);
		} else if (arg1 == null) {
			local192 = local30.method194(true);
		} else {
			local192 = arg1.method565(local30, arg3);
		}
		if (this.anInt1312 != 128 || this.anInt1327 != 128) {
			local192.method203(this.anInt1312, this.anInt1327, this.anInt1312);
		}
		return local192;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	public void method1117() {
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Lclient!fh;")
	public Class3_Sub2_Sub7 method1118() {
		@Pc(5) int local5 = -1;
		if (this.anInt1326 != -1) {
			local5 = Static138.method2708(this.anInt1326);
		} else if (this.anInt1340 != -1) {
			local5 = Static72.anIntArray354[this.anInt1340];
		}
		return local5 < 0 || this.anIntArray242.length <= local5 || this.anIntArray242[local5] == -1 ? null : Static170.method3103(this.anIntArray242[local5]);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BILclient!ca;)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method1119(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2_Sub4 arg1) {
		if (this.anIntArray242 != null) {
			@Pc(10) Class3_Sub2_Sub7 local10 = this.method1118();
			return local10 == null ? null : local10.method1119(arg0, arg1);
		} else if (this.anIntArray243 == null) {
			return null;
		} else {
			@Pc(33) Class3_Sub2_Sub1_Sub1 local33 = (Class3_Sub2_Sub1_Sub1) Static32.aClass63_5.method2337((long) this.anInt1315);
			if (local33 == null) {
				@Pc(37) boolean local37 = false;
				for (@Pc(39) int local39 = 0; local39 < this.anIntArray243.length; local39++) {
					if (!Static174.aClass7_66.method1014(0, this.anIntArray243[local39])) {
						local37 = true;
					}
				}
				if (local37) {
					return null;
				}
				@Pc(66) Class3_Sub2_Sub1_Sub4[] local66 = new Class3_Sub2_Sub1_Sub4[this.anIntArray243.length];
				for (@Pc(68) int local68 = 0; local68 < this.anIntArray243.length; local68++) {
					local66[local68] = Static89.method2044(Static174.aClass7_66, this.anIntArray243[local68]);
				}
				@Pc(97) Class3_Sub2_Sub1_Sub4 local97;
				if (local66.length == 1) {
					local97 = local66[0];
				} else {
					local97 = new Class3_Sub2_Sub1_Sub4(local66, local66.length);
				}
				@Pc(110) int local110;
				if (this.aShortArray14 != null) {
					for (local110 = 0; local110 < this.aShortArray14.length; local110++) {
						local97.method2029(this.aShortArray14[local110], this.aShortArray17[local110]);
					}
				}
				if (this.aShortArray16 != null) {
					for (local110 = 0; local110 < this.aShortArray16.length; local110++) {
						local97.method2032(this.aShortArray16[local110], this.aShortArray15[local110]);
					}
				}
				local33 = local97.method2041(64, 768, -50, -10, -50, true);
				Static32.aClass63_5.method2338((long) this.anInt1315, local33);
			}
			if (arg1 != null) {
				local33 = arg1.method570(arg0, local33);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!hd;I)V")
	private void method1121(@OriginalArg(1) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		if (arg1 == 1) {
			local12 = arg0.method1545();
			this.anIntArray244 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray244[local18] = arg0.method1510();
			}
		} else if (arg1 == 2) {
			this.aClass28_414 = arg0.method1516();
		} else if (arg1 == 12) {
			this.anInt1338 = arg0.method1545();
		} else if (arg1 == 13) {
			this.anInt1329 = arg0.method1510();
		} else if (arg1 == 14) {
			this.anInt1332 = arg0.method1510();
		} else if (arg1 == 15) {
			this.anInt1324 = arg0.method1510();
		} else if (arg1 == 16) {
			this.anInt1333 = arg0.method1510();
		} else if (arg1 == 17) {
			this.anInt1332 = arg0.method1510();
			this.anInt1309 = arg0.method1510();
			this.anInt1310 = arg0.method1510();
			this.anInt1335 = arg0.method1510();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass28Array5[arg1 - 30] = arg0.method1516();
			if (this.aClass28Array5[arg1 - 30].method936(Static4.aClass28_39)) {
				this.aClass28Array5[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local12 = arg0.method1545();
			this.aShortArray17 = new short[local12];
			this.aShortArray14 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray14[local18] = (short) arg0.method1510();
				this.aShortArray17[local18] = (short) arg0.method1510();
			}
		} else if (arg1 == 41) {
			local12 = arg0.method1545();
			this.aShortArray16 = new short[local12];
			this.aShortArray15 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray16[local18] = (short) arg0.method1510();
				this.aShortArray15[local18] = (short) arg0.method1510();
			}
		} else if (arg1 == 60) {
			local12 = arg0.method1545();
			this.anIntArray243 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray243[local18] = arg0.method1510();
			}
		} else if (arg1 == 93) {
			this.aBoolean70 = false;
		} else if (arg1 == 95) {
			this.anInt1318 = arg0.method1510();
		} else if (arg1 == 97) {
			this.anInt1312 = arg0.method1510();
		} else if (arg1 == 98) {
			this.anInt1327 = arg0.method1510();
		} else if (arg1 == 99) {
			this.aBoolean71 = true;
		} else if (arg1 == 100) {
			this.anInt1330 = arg0.method1508();
		} else if (arg1 == 101) {
			this.anInt1321 = arg0.method1508() * 5;
		} else if (arg1 == 102) {
			this.anInt1313 = arg0.method1510();
		} else if (arg1 == 103) {
			this.anInt1311 = arg0.method1510();
		} else if (arg1 == 106) {
			this.anInt1326 = arg0.method1510();
			if (this.anInt1326 == 65535) {
				this.anInt1326 = -1;
			}
			this.anInt1340 = arg0.method1510();
			if (this.anInt1340 == 65535) {
				this.anInt1340 = -1;
			}
			local12 = arg0.method1545();
			this.anIntArray242 = new int[local12 + 1];
			for (local18 = 0; local18 <= local12; local18++) {
				this.anIntArray242[local18] = arg0.method1510();
				if (this.anIntArray242[local18] == 65535) {
					this.anIntArray242[local18] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean69 = false;
		} else if (arg1 == 109) {
			this.aBoolean72 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method1510();
				arg0.method1510();
			} else if (arg1 == 114) {
				arg0.method1508();
				arg0.method1508();
			} else if (arg1 == 115) {
				this.aShort22 = (short) (arg0.method1545() * 4);
				this.aShort23 = (short) (arg0.method1545() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!hd;)V")
	public void method1124(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1545();
			if (local3 == 0) {
				return;
			}
			this.method1121(arg0, local3);
		}
	}
}
