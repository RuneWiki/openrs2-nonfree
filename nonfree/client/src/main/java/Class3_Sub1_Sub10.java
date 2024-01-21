import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "[I")
	public static int[] anIntArray172 = new int[256];

	@OriginalMember(owner = "client!id", name = "M", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
	public int anInt1568;

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!id", name = "Cb", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!id", name = "W", descriptor = "I")
	public int anInt1559 = 32;

	@OriginalMember(owner = "client!id", name = "S", descriptor = "I")
	public int anInt1556 = 1;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "I")
	public int anInt1554 = -1;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
	public int anInt1564 = -1;

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
	private int anInt1566 = -1;

	@OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
	public int anInt1569 = -1;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "I")
	public int anInt1557 = -1;

	@OriginalMember(owner = "client!id", name = "P", descriptor = "I")
	public int anInt1555 = -1;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "I")
	private int anInt1558 = 128;

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!id", name = "sb", descriptor = "I")
	public int anInt1573 = -1;

	@OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
	private int anInt1570 = 128;

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "Z")
	public boolean aBoolean102 = true;

	@OriginalMember(owner = "client!id", name = "vb", descriptor = "[Lclient!sd;")
	public final Class73[] aClass73Array11 = new Class73[5];

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
	public int anInt1565 = -1;

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "Lclient!sd;")
	public Class73 aClass73_845 = Static132.aClass73_1682;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!id", name = "yb", descriptor = "I")
	private int anInt1574 = 0;

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
	public int anInt1562 = -1;

	@OriginalMember(owner = "client!id", name = "zb", descriptor = "I")
	private int anInt1575 = -1;

	@OriginalMember(owner = "client!id", name = "Db", descriptor = "I")
	private int anInt1577 = 0;

	@OriginalMember(owner = "client!id", name = "Hb", descriptor = "I")
	public int anInt1581 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray172[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
	public boolean method1198() {
		if (this.anIntArray174 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt1566 != -1) {
			local10 = Static78.method1323(this.anInt1566);
		} else if (this.anInt1575 != -1) {
			local10 = Static81.anIntArray186[this.anInt1575];
		}
		return local10 >= 0 && this.anIntArray174.length > local10 && this.anIntArray174[local10] != -1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ff;B)V")
	private void method1200(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub12 arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg0 == 1) {
			local18 = arg1.method1354();
			this.anIntArray173 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray173[local24] = arg1.method1359();
			}
		} else if (arg0 == 2) {
			this.aClass73_845 = arg1.method1390();
		} else if (arg0 == 12) {
			this.anInt1556 = arg1.method1354();
		} else if (arg0 == 13) {
			this.anInt1581 = arg1.method1359();
		} else if (arg0 == 14) {
			this.anInt1565 = arg1.method1359();
		} else if (arg0 == 15) {
			this.anInt1557 = arg1.method1359();
		} else if (arg0 == 16) {
			this.anInt1564 = arg1.method1359();
		} else if (arg0 == 17) {
			this.anInt1565 = arg1.method1359();
			this.anInt1562 = arg1.method1359();
			this.anInt1569 = arg1.method1359();
			this.anInt1555 = arg1.method1359();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass73Array11[arg0 - 30] = arg1.method1390();
			if (this.aClass73Array11[arg0 - 30].method2438(Static59.aClass73_1525)) {
				this.aClass73Array11[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local18 = arg1.method1354();
			this.aShortArray13 = new short[local18];
			this.aShortArray14 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray14[local24] = (short) arg1.method1359();
				this.aShortArray13[local24] = (short) arg1.method1359();
			}
		} else if (arg0 == 41) {
			local18 = arg1.method1354();
			this.aShortArray15 = new short[local18];
			this.aShortArray12 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray15[local24] = (short) arg1.method1359();
				this.aShortArray12[local24] = (short) arg1.method1359();
			}
		} else if (arg0 == 60) {
			local18 = arg1.method1354();
			this.anIntArray171 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray171[local24] = arg1.method1359();
			}
		} else if (arg0 == 93) {
			this.aBoolean100 = false;
		} else if (arg0 == 95) {
			this.anInt1554 = arg1.method1359();
		} else if (arg0 == 97) {
			this.anInt1558 = arg1.method1359();
		} else if (arg0 == 98) {
			this.anInt1570 = arg1.method1359();
		} else if (arg0 == 99) {
			this.aBoolean101 = true;
		} else if (arg0 == 100) {
			this.anInt1577 = arg1.method1342();
		} else if (arg0 == 101) {
			this.anInt1574 = arg1.method1342() * 5;
		} else if (arg0 == 102) {
			this.anInt1573 = arg1.method1359();
		} else if (arg0 == 103) {
			this.anInt1559 = arg1.method1359();
		} else if (arg0 == 106) {
			this.anInt1566 = arg1.method1359();
			if (this.anInt1566 == 65535) {
				this.anInt1566 = -1;
			}
			this.anInt1575 = arg1.method1359();
			if (this.anInt1575 == 65535) {
				this.anInt1575 = -1;
			}
			local18 = arg1.method1354();
			this.anIntArray174 = new int[local18 + 1];
			for (local24 = 0; local24 <= local18; local24++) {
				this.anIntArray174[local24] = arg1.method1359();
				if (this.anIntArray174[local24] == 65535) {
					this.anIntArray174[local24] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean99 = false;
		} else if (arg0 == 109) {
			this.aBoolean102 = false;
		}
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(I)Lclient!id;")
	public Class3_Sub1_Sub10 method1201() {
		@Pc(11) int local11 = -1;
		if (this.anInt1566 != -1) {
			local11 = Static78.method1323(this.anInt1566);
		} else if (this.anInt1575 != -1) {
			local11 = Static81.anIntArray186[this.anInt1575];
		}
		return local11 < 0 || this.anIntArray174.length <= local11 || this.anIntArray174[local11] == -1 ? null : Static164.method2578(this.anIntArray174[local11]);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ff;I)V")
	public void method1202(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1354();
			if (local15 == 0) {
				return;
			}
			this.method1200(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "k", descriptor = "(I)V")
	public void method1203() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!gg;I)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method1204(@OriginalArg(1) Class3_Sub1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray174 != null) {
			@Pc(17) Class3_Sub1_Sub10 local17 = this.method1201();
			return local17 == null ? null : local17.method1204(arg0, arg1);
		} else if (this.anIntArray171 == null) {
			return null;
		} else {
			@Pc(40) Class3_Sub1_Sub4_Sub5 local40 = (Class3_Sub1_Sub4_Sub5) Static10.aClass7_4.method183((long) this.anInt1568);
			if (local40 == null) {
				@Pc(44) boolean local44 = false;
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray171.length; local46++) {
					if (!Static4.aClass13_1.method349(0, this.anIntArray171[local46])) {
						local44 = true;
					}
				}
				if (local44) {
					return null;
				}
				@Pc(78) Class3_Sub1_Sub4_Sub4[] local78 = new Class3_Sub1_Sub4_Sub4[this.anIntArray171.length];
				for (@Pc(80) int local80 = 0; local80 < this.anIntArray171.length; local80++) {
					local78[local80] = Static89.method1571(Static4.aClass13_1, this.anIntArray171[local80]);
				}
				@Pc(115) Class3_Sub1_Sub4_Sub4 local115;
				if (local78.length == 1) {
					local115 = local78[0];
				} else {
					local115 = new Class3_Sub1_Sub4_Sub4(local78, local78.length);
				}
				@Pc(126) int local126;
				if (this.aShortArray14 != null) {
					for (local126 = 0; local126 < this.aShortArray14.length; local126++) {
						local115.method1552(this.aShortArray14[local126], this.aShortArray13[local126]);
					}
				}
				if (this.aShortArray15 != null) {
					for (local126 = 0; local126 < this.aShortArray15.length; local126++) {
						local115.method1565(this.aShortArray15[local126], this.aShortArray12[local126]);
					}
				}
				local40 = local115.method1558(64, 768, -50, -10, -50, true);
				Static10.aClass7_4.method186(local40, (long) this.anInt1568);
			}
			if (arg0 != null) {
				local40 = arg0.method988(local40, arg1);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLclient!gg;Lclient!gg;II)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method1205(@OriginalArg(1) Class3_Sub1_Sub8 arg0, @OriginalArg(2) Class3_Sub1_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray174 != null) {
			@Pc(20) Class3_Sub1_Sub10 local20 = this.method1201();
			return local20 == null ? null : local20.method1205(arg0, arg1, arg2, arg3);
		}
		@Pc(40) Class3_Sub1_Sub4_Sub5 local40 = (Class3_Sub1_Sub4_Sub5) Static168.aClass7_27.method183((long) this.anInt1568);
		if (local40 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray173.length; local46++) {
				if (!Static4.aClass13_1.method349(0, this.anIntArray173[local46])) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(74) Class3_Sub1_Sub4_Sub4[] local74 = new Class3_Sub1_Sub4_Sub4[this.anIntArray173.length];
			for (@Pc(76) int local76 = 0; local76 < this.anIntArray173.length; local76++) {
				local74[local76] = Static89.method1571(Static4.aClass13_1, this.anIntArray173[local76]);
			}
			@Pc(111) Class3_Sub1_Sub4_Sub4 local111;
			if (local74.length == 1) {
				local111 = local74[0];
			} else {
				local111 = new Class3_Sub1_Sub4_Sub4(local74, local74.length);
			}
			@Pc(122) int local122;
			if (this.aShortArray14 != null) {
				for (local122 = 0; local122 < this.aShortArray14.length; local122++) {
					local111.method1552(this.aShortArray14[local122], this.aShortArray13[local122]);
				}
			}
			if (this.aShortArray15 != null) {
				for (local122 = 0; local122 < this.aShortArray15.length; local122++) {
					local111.method1565(this.aShortArray15[local122], this.aShortArray12[local122]);
				}
			}
			local40 = local111.method1558(this.anInt1577 + 64, this.anInt1574 + 850, -30, -50, -30, true);
			Static168.aClass7_27.method186(local40, (long) this.anInt1568);
		}
		@Pc(198) Class3_Sub1_Sub4_Sub5 local198;
		if (arg0 != null && arg1 != null) {
			local198 = arg0.method984(arg1, arg3, local40, arg2);
		} else if (arg0 != null) {
			local198 = arg0.method993(arg2, local40);
		} else if (arg1 == null) {
			local198 = local40.method1886(true);
		} else {
			local198 = arg1.method993(arg3, local40);
		}
		if (this.anInt1558 != 128 || this.anInt1570 != 128) {
			local198.method1885(this.anInt1558, this.anInt1570, this.anInt1558);
		}
		return local198;
	}
}
