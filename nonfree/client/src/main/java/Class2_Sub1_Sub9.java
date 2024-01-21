import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!lc", name = "hb", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!lc", name = "zb", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!lc", name = "Db", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!lc", name = "Gb", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!lc", name = "Jb", descriptor = "I")
	public int anInt1546;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "[Lclient!kc;")
	public final Class36[] aClass36Array27 = new Class36[5];

	@OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
	private int anInt1530 = 128;

	@OriginalMember(owner = "client!lc", name = "nb", descriptor = "Z")
	public boolean aBoolean71 = true;

	@OriginalMember(owner = "client!lc", name = "ub", descriptor = "I")
	public int anInt1539 = -1;

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
	public int anInt1528 = 1;

	@OriginalMember(owner = "client!lc", name = "ib", descriptor = "I")
	public int anInt1532 = -1;

	@OriginalMember(owner = "client!lc", name = "ob", descriptor = "I")
	private int anInt1535 = -1;

	@OriginalMember(owner = "client!lc", name = "xb", descriptor = "Z")
	public boolean aBoolean72 = true;

	@OriginalMember(owner = "client!lc", name = "sb", descriptor = "I")
	public int anInt1537 = -1;

	@OriginalMember(owner = "client!lc", name = "Bb", descriptor = "I")
	private int anInt1542 = 0;

	@OriginalMember(owner = "client!lc", name = "Ib", descriptor = "I")
	public int anInt1545 = -1;

	@OriginalMember(owner = "client!lc", name = "gb", descriptor = "I")
	public int anInt1531 = -1;

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	public int anInt1525 = 32;

	@OriginalMember(owner = "client!lc", name = "vb", descriptor = "Lclient!kc;")
	public Class36 aClass36_738 = Static106.aClass36_1337;

	@OriginalMember(owner = "client!lc", name = "Hb", descriptor = "I")
	public int anInt1544 = -1;

	@OriginalMember(owner = "client!lc", name = "Ob", descriptor = "I")
	public int anInt1549 = -1;

	@OriginalMember(owner = "client!lc", name = "Fb", descriptor = "I")
	public int anInt1543 = -1;

	@OriginalMember(owner = "client!lc", name = "Nb", descriptor = "I")
	private int anInt1548 = 128;

	@OriginalMember(owner = "client!lc", name = "Cb", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!lc", name = "Mb", descriptor = "I")
	public int anInt1547 = -1;

	@OriginalMember(owner = "client!lc", name = "Pb", descriptor = "I")
	private int anInt1550 = 0;

	@OriginalMember(owner = "client!lc", name = "Tb", descriptor = "I")
	private int anInt1554 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)Lclient!lc;")
	public Class2_Sub1_Sub9 method1071() {
		@Pc(12) int local12 = -1;
		if (this.anInt1535 != -1) {
			local12 = Static4.method133(this.anInt1535);
		} else if (this.anInt1554 != -1) {
			local12 = Static4.anIntArray14[this.anInt1554];
		}
		return local12 < 0 || local12 >= this.anIntArray192.length || this.anIntArray192[local12] == -1 ? null : Static49.method953(this.anIntArray192[local12]);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!s;Lclient!s;II)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1072(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub14 arg1, @OriginalArg(2) Class2_Sub1_Sub14 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray192 != null) {
			@Pc(12) Class2_Sub1_Sub9 local12 = this.method1071();
			return local12 == null ? null : local12.method1072(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class2_Sub1_Sub4_Sub1 local32 = (Class2_Sub1_Sub4_Sub1) Static67.aClass22_25.method711((long) this.anInt1546);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray189.length; local38++) {
				if (!Static69.aClass3_17.method934(this.anIntArray189[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class2_Sub1_Sub4_Sub1[] local70 = new Class2_Sub1_Sub4_Sub1[this.anIntArray189.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray189.length; local72++) {
				local70[local72] = Static30.method669(Static69.aClass3_17, this.anIntArray189[local72]);
			}
			if (local70.length == 1) {
				local32 = local70[0];
			} else {
				local32 = new Class2_Sub1_Sub4_Sub1(local70, local70.length);
			}
			if (this.anIntArray190 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.anIntArray190.length; local112++) {
					local32.method674(this.anIntArray190[local112], this.anIntArray191[local112]);
				}
			}
			local32.method681();
			local32.method655(this.anInt1542 + 64, 850 - -this.anInt1550, -30, -50, -30, true);
			Static67.aClass22_25.method712(local32, (long) this.anInt1546);
		}
		@Pc(173) Class2_Sub1_Sub4_Sub1 local173;
		if (arg1 != null && arg2 != null) {
			local173 = arg1.method1679(arg0, arg2, local32, arg3);
		} else if (arg1 != null) {
			local173 = arg1.method1680(arg0, local32);
		} else if (arg2 == null) {
			local173 = local32.method657(true);
		} else {
			local173 = arg2.method1680(arg3, local32);
		}
		if (this.anInt1530 != 128 || this.anInt1548 != 128) {
			local173.method665(this.anInt1530, this.anInt1548, this.anInt1530);
		}
		return local173;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1074() {
		if (this.anIntArray192 != null) {
			@Pc(12) Class2_Sub1_Sub9 local12 = this.method1071();
			return local12 == null ? null : local12.method1074();
		} else if (this.anIntArray193 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray193.length; local34++) {
				if (!Static69.aClass3_17.method934(this.anIntArray193[local34], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(66) Class2_Sub1_Sub4_Sub1[] local66 = new Class2_Sub1_Sub4_Sub1[this.anIntArray193.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray193.length; local68++) {
				local66[local68] = Static30.method669(Static69.aClass3_17, this.anIntArray193[local68]);
			}
			@Pc(98) Class2_Sub1_Sub4_Sub1 local98;
			if (local66.length == 1) {
				local98 = local66[0];
			} else {
				local98 = new Class2_Sub1_Sub4_Sub1(local66, local66.length);
			}
			if (this.anIntArray190 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.anIntArray190.length; local112++) {
					local98.method674(this.anIntArray190[local112], this.anIntArray191[local112]);
				}
			}
			return local98;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!wd;)V")
	public void method1075(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1399();
			if (local3 == 0) {
				return;
			}
			this.method1081(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "(I)V")
	public void method1076() {
	}

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "(I)Z")
	public boolean method1080() {
		if (this.anIntArray192 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt1535 != -1) {
			local10 = Static4.method133(this.anInt1535);
		} else if (this.anInt1554 != -1) {
			local10 = Static4.anIntArray14[this.anInt1554];
		}
		return local10 >= 0 && this.anIntArray192.length > local10 && this.anIntArray192[local10] != -1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!wd;II)V")
	private void method1081(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg1 == 1) {
			local20 = arg0.method1399();
			this.anIntArray189 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray189[local26] = arg0.method1366();
			}
		} else if (arg1 == 2) {
			this.aClass36_738 = arg0.method1404();
		} else if (arg1 == 12) {
			this.anInt1528 = arg0.method1399();
		} else if (arg1 == 13) {
			this.anInt1543 = arg0.method1366();
		} else if (arg1 == 14) {
			this.anInt1532 = arg0.method1366();
		} else if (arg1 == 15) {
			this.anInt1544 = arg0.method1366();
		} else if (arg1 == 16) {
			this.anInt1545 = arg0.method1366();
		} else if (arg1 == 17) {
			this.anInt1532 = arg0.method1366();
			this.anInt1547 = arg0.method1366();
			this.anInt1537 = arg0.method1366();
			this.anInt1531 = arg0.method1366();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass36Array27[arg1 - 30] = arg0.method1404();
			if (this.aClass36Array27[arg1 - 30].method1024(Static59.aClass36_761)) {
				this.aClass36Array27[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local20 = arg0.method1399();
			this.anIntArray190 = new int[local20];
			this.anIntArray191 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray190[local26] = arg0.method1366();
				this.anIntArray191[local26] = arg0.method1366();
			}
		} else if (arg1 == 60) {
			local20 = arg0.method1399();
			this.anIntArray193 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray193[local26] = arg0.method1366();
			}
			return;
		} else if (arg1 == 93) {
			this.aBoolean71 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt1539 = arg0.method1366();
			return;
		} else if (arg1 == 97) {
			this.anInt1530 = arg0.method1366();
			return;
		} else if (arg1 == 98) {
			this.anInt1548 = arg0.method1366();
			return;
		} else if (arg1 == 99) {
			this.aBoolean73 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt1542 = arg0.method1406();
			return;
		} else if (arg1 == 101) {
			this.anInt1550 = arg0.method1406() * 5;
			return;
		} else {
			if (arg1 == 102) {
				this.anInt1549 = arg0.method1366();
			} else if (arg1 == 103) {
				this.anInt1525 = arg0.method1366();
				return;
			} else if (arg1 == 106) {
				this.anInt1535 = arg0.method1366();
				if (this.anInt1535 == 65535) {
					this.anInt1535 = -1;
				}
				this.anInt1554 = arg0.method1366();
				if (this.anInt1554 == 65535) {
					this.anInt1554 = -1;
				}
				local20 = arg0.method1399();
				this.anIntArray192 = new int[local20 + 1];
				for (local26 = 0; local26 <= local20; local26++) {
					this.anIntArray192[local26] = arg0.method1366();
					if (this.anIntArray192[local26] == 65535) {
						this.anIntArray192[local26] = -1;
					}
				}
				return;
			} else if (arg1 == 107) {
				this.aBoolean72 = false;
				return;
			}
			return;
		}
	}
}
