import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jb", name = "sb", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!jb", name = "tb", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!jb", name = "Db", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!jb", name = "Gb", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!jb", name = "Hb", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!jb", name = "ac", descriptor = "I")
	private int anInt1570;

	@OriginalMember(owner = "client!jb", name = "gc", descriptor = "I")
	public int anInt1576;

	@OriginalMember(owner = "client!jb", name = "jc", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "[Lclient!sc;")
	public Class66[] aClass66Array8 = new Class66[] { null, null, Static22.aClass66_390, null, null };

	@OriginalMember(owner = "client!jb", name = "rb", descriptor = "I")
	private int anInt1546 = 0;

	@OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
	private int anInt1548 = -1;

	@OriginalMember(owner = "client!jb", name = "mb", descriptor = "I")
	public int anInt1541 = 0;

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!jb", name = "ub", descriptor = "I")
	private int anInt1547 = -1;

	@OriginalMember(owner = "client!jb", name = "xb", descriptor = "I")
	public int anInt1550 = 1;

	@OriginalMember(owner = "client!jb", name = "lb", descriptor = "Lclient!sc;")
	public Class66 aClass66_847 = Static134.aClass66_1759;

	@OriginalMember(owner = "client!jb", name = "Eb", descriptor = "I")
	private int anInt1555 = -1;

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
	public int anInt1534 = 0;

	@OriginalMember(owner = "client!jb", name = "pb", descriptor = "I")
	private int anInt1544 = -1;

	@OriginalMember(owner = "client!jb", name = "ob", descriptor = "I")
	public int anInt1543 = 0;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
	public int anInt1536 = -1;

	@OriginalMember(owner = "client!jb", name = "Mb", descriptor = "I")
	private int anInt1559 = -1;

	@OriginalMember(owner = "client!jb", name = "Kb", descriptor = "I")
	public int anInt1557 = -1;

	@OriginalMember(owner = "client!jb", name = "qb", descriptor = "I")
	private int anInt1545 = -1;

	@OriginalMember(owner = "client!jb", name = "Zb", descriptor = "I")
	private int anInt1569 = 0;

	@OriginalMember(owner = "client!jb", name = "Pb", descriptor = "I")
	private int anInt1560 = -1;

	@OriginalMember(owner = "client!jb", name = "Wb", descriptor = "I")
	private int anInt1566 = 128;

	@OriginalMember(owner = "client!jb", name = "zb", descriptor = "I")
	public int anInt1552 = 0;

	@OriginalMember(owner = "client!jb", name = "cc", descriptor = "I")
	private int anInt1572 = -1;

	@OriginalMember(owner = "client!jb", name = "Ob", descriptor = "[Lclient!sc;")
	public Class66[] aClass66Array9 = new Class66[] { null, null, null, null, Static25.aClass66_435 };

	@OriginalMember(owner = "client!jb", name = "Yb", descriptor = "I")
	public int anInt1568 = 2000;

	@OriginalMember(owner = "client!jb", name = "Rb", descriptor = "I")
	public int anInt1562 = 0;

	@OriginalMember(owner = "client!jb", name = "Vb", descriptor = "I")
	private int anInt1565 = 128;

	@OriginalMember(owner = "client!jb", name = "yb", descriptor = "I")
	public int anInt1551 = 0;

	@OriginalMember(owner = "client!jb", name = "Qb", descriptor = "I")
	private int anInt1561 = -1;

	@OriginalMember(owner = "client!jb", name = "Bb", descriptor = "I")
	public int anInt1553 = 0;

	@OriginalMember(owner = "client!jb", name = "hc", descriptor = "I")
	private int anInt1577 = 128;

	@OriginalMember(owner = "client!jb", name = "ec", descriptor = "I")
	public int anInt1574 = 0;

	@OriginalMember(owner = "client!jb", name = "ic", descriptor = "I")
	public int anInt1578 = 0;

	@OriginalMember(owner = "client!jb", name = "kc", descriptor = "I")
	private int anInt1579 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!mc;II)V")
	private void method1072(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1570 = arg0.method1176();
		} else if (arg1 == 2) {
			this.aClass66_847 = arg0.method1214();
		} else if (arg1 == 4) {
			this.anInt1568 = arg0.method1176();
		} else if (arg1 == 5) {
			this.anInt1551 = arg0.method1176();
		} else if (arg1 == 6) {
			this.anInt1541 = arg0.method1176();
		} else if (arg1 == 7) {
			this.anInt1562 = arg0.method1176();
			if (this.anInt1562 > 32767) {
				this.anInt1562 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1534 = arg0.method1176();
			if (this.anInt1534 > 32767) {
				this.anInt1534 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1543 = 1;
		} else if (arg1 == 12) {
			this.anInt1550 = arg0.method1210();
		} else if (arg1 == 16) {
			this.aBoolean64 = true;
		} else if (arg1 == 23) {
			this.anInt1560 = arg0.method1176();
			this.anInt1546 = arg0.method1190();
		} else if (arg1 == 24) {
			this.anInt1547 = arg0.method1176();
		} else if (arg1 == 25) {
			this.anInt1544 = arg0.method1176();
			this.anInt1569 = arg0.method1190();
		} else if (arg1 == 26) {
			this.anInt1559 = arg0.method1176();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass66Array8[arg1 - 30] = arg0.method1214();
			if (this.aClass66Array8[arg1 - 30].method1843(Static39.aClass66_615)) {
				this.aClass66Array8[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass66Array9[arg1 - 35] = arg0.method1214();
		} else {
			@Pc(194) int local194;
			@Pc(204) int local204;
			if (arg1 == 40) {
				local194 = arg0.method1190();
				this.aShortArray43 = new short[local194];
				this.aShortArray42 = new short[local194];
				for (local204 = 0; local204 < local194; local204++) {
					this.aShortArray42[local204] = (short) arg0.method1176();
					this.aShortArray43[local204] = (short) arg0.method1176();
				}
			} else if (arg1 == 41) {
				local194 = arg0.method1190();
				this.aShortArray46 = new short[local194];
				this.aShortArray44 = new short[local194];
				for (local204 = 0; local204 < local194; local204++) {
					this.aShortArray44[local204] = (short) arg0.method1176();
					this.aShortArray46[local204] = (short) arg0.method1176();
				}
			} else if (arg1 == 78) {
				this.anInt1545 = arg0.method1176();
			} else if (arg1 == 79) {
				this.anInt1555 = arg0.method1176();
			} else if (arg1 == 90) {
				this.anInt1572 = arg0.method1176();
			} else if (arg1 == 91) {
				this.anInt1548 = arg0.method1176();
			} else if (arg1 == 92) {
				this.anInt1561 = arg0.method1176();
			} else if (arg1 == 93) {
				this.anInt1579 = arg0.method1176();
			} else if (arg1 == 95) {
				this.anInt1574 = arg0.method1176();
			} else if (arg1 == 97) {
				this.anInt1557 = arg0.method1176();
			} else if (arg1 == 98) {
				this.anInt1536 = arg0.method1176();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray235 == null) {
					this.anIntArray236 = new int[10];
					this.anIntArray235 = new int[10];
				}
				this.anIntArray235[arg1 - 100] = arg0.method1176();
				this.anIntArray236[arg1 - 100] = arg0.method1176();
			} else if (arg1 == 110) {
				this.anInt1565 = arg0.method1176();
			} else if (arg1 == 111) {
				this.anInt1566 = arg0.method1176();
			} else if (arg1 == 112) {
				this.anInt1577 = arg0.method1176();
			} else if (arg1 == 113) {
				this.anInt1578 = arg0.method1211();
			} else if (arg1 == 114) {
				this.anInt1553 = arg0.method1211() * 5;
			} else if (arg1 == 115) {
				this.anInt1552 = arg0.method1190();
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BZ)Z")
	public boolean method1073(@OriginalArg(1) boolean arg0) {
		@Pc(12) int local12 = this.anInt1560;
		@Pc(15) int local15 = this.anInt1547;
		@Pc(18) int local18 = this.anInt1545;
		if (arg0) {
			local15 = this.anInt1559;
			local12 = this.anInt1544;
			local18 = this.anInt1555;
		}
		if (local12 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static67.aClass5_49.method119(local12, 0)) {
			local36 = false;
		}
		if (local15 != -1 && !Static67.aClass5_49.method119(local15, 0)) {
			local36 = false;
		}
		if (local18 != -1 && !Static67.aClass5_49.method119(local18, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1074(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1572;
		@Pc(16) int local16 = this.anInt1561;
		if (arg0) {
			local16 = this.anInt1579;
			local8 = this.anInt1548;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(34) Class1_Sub1_Sub1_Sub7 local34 = Static113.method1911(Static67.aClass5_49, local8);
		if (local16 != -1) {
			@Pc(43) Class1_Sub1_Sub1_Sub7 local43 = Static113.method1911(Static67.aClass5_49, local16);
			@Pc(54) Class1_Sub1_Sub1_Sub7[] local54 = new Class1_Sub1_Sub1_Sub7[] { local34, local43 };
			local34 = new Class1_Sub1_Sub1_Sub7(local54, 2);
		}
		@Pc(65) int local65;
		if (this.aShortArray42 != null) {
			for (local65 = 0; local65 < this.aShortArray42.length; local65++) {
				local34.method1914(this.aShortArray42[local65], this.aShortArray43[local65]);
			}
		}
		if (this.aShortArray44 != null) {
			for (local65 = 0; local65 < this.aShortArray44.length; local65++) {
				local34.method1915(this.aShortArray44[local65], this.aShortArray46[local65]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
	public void method1078() {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!jb;Lclient!jb;I)V")
	public void method1079(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) Class1_Sub1_Sub6 arg1) {
		this.anInt1534 = arg1.anInt1534;
		this.aBoolean64 = arg0.aBoolean64;
		this.aShortArray43 = arg1.aShortArray43;
		this.anInt1570 = arg1.anInt1570;
		this.anInt1562 = arg1.anInt1562;
		this.aShortArray42 = arg1.aShortArray42;
		this.anInt1574 = arg1.anInt1574;
		this.anInt1551 = arg1.anInt1551;
		this.aShortArray46 = arg1.aShortArray46;
		this.aClass66_847 = arg0.aClass66_847;
		this.anInt1550 = arg0.anInt1550;
		this.anInt1568 = arg1.anInt1568;
		this.aShortArray44 = arg1.aShortArray44;
		this.anInt1543 = 1;
		this.anInt1541 = arg1.anInt1541;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)Lclient!jb;")
	public Class1_Sub1_Sub6 method1080(@OriginalArg(0) int arg0) {
		if (this.anIntArray235 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray236[local17] && this.anIntArray236[local17] != 0) {
					local15 = this.anIntArray235[local17];
				}
			}
			if (local15 != -1) {
				return Static20.method496(local15);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Z")
	public boolean method1081(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1572;
		@Pc(9) int local9 = this.anInt1561;
		if (arg0) {
			local9 = this.anInt1579;
			local6 = this.anInt1548;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static67.aClass5_49.method119(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static67.aClass5_49.method119(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!mc;)V")
	public void method1082(@OriginalArg(1) Class1_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1190();
			if (local15 == 0) {
				return;
			}
			this.method1072(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1084(@OriginalArg(0) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray235 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray236[local15] && this.anIntArray236[local15] != 0) {
					local13 = this.anIntArray235[local15];
				}
			}
			if (local13 != -1) {
				return Static20.method496(local13).method1084(1);
			}
		}
		@Pc(62) Class1_Sub1_Sub1_Sub7 local62 = Static113.method1911(Static67.aClass5_49, this.anInt1570);
		if (local62 == null) {
			return null;
		}
		if (this.anInt1565 != 128 || this.anInt1566 != 128 || this.anInt1577 != 128) {
			local62.method1901(this.anInt1565, this.anInt1566, this.anInt1577);
		}
		if (this.aShortArray42 != null) {
			for (local15 = 0; local15 < this.aShortArray42.length; local15++) {
				local62.method1914(this.aShortArray42[local15], this.aShortArray43[local15]);
			}
		}
		if (this.aShortArray44 != null) {
			for (local15 = 0; local15 < this.aShortArray44.length; local15++) {
				local62.method1915(this.aShortArray44[local15], this.aShortArray46[local15]);
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1085(@OriginalArg(0) int arg0) {
		if (this.anIntArray235 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray236[local15] && this.anIntArray236[local15] != 0) {
					local13 = this.anIntArray235[local15];
				}
			}
			if (local13 != -1) {
				return Static20.method496(local13).method1085(1);
			}
		}
		@Pc(57) Class1_Sub1_Sub1_Sub6 local57 = (Class1_Sub1_Sub1_Sub6) Static51.aClass60_53.method1745((long) this.anInt1576);
		if (local57 != null) {
			return local57;
		}
		@Pc(72) Class1_Sub1_Sub1_Sub7 local72 = Static113.method1911(Static67.aClass5_49, this.anInt1570);
		if (local72 == null) {
			return null;
		}
		if (this.anInt1565 != 128 || this.anInt1566 != 128 || this.anInt1577 != 128) {
			local72.method1901(this.anInt1565, this.anInt1566, this.anInt1577);
		}
		@Pc(105) int local105;
		if (this.aShortArray42 != null) {
			for (local105 = 0; local105 < this.aShortArray42.length; local105++) {
				local72.method1914(this.aShortArray42[local105], this.aShortArray43[local105]);
			}
		}
		if (this.aShortArray44 != null) {
			for (local105 = 0; local105 < this.aShortArray44.length; local105++) {
				local72.method1915(this.aShortArray44[local105], this.aShortArray46[local105]);
			}
		}
		local57 = local72.method1899(this.anInt1578 + 64, 768 - -this.anInt1553, -50, -10, -50);
		local57.aBoolean75 = true;
		Static51.aClass60_53.method1741((long) this.anInt1576, local57);
		return local57;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(ZI)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1086(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = this.anInt1560;
		@Pc(16) int local16 = this.anInt1547;
		@Pc(19) int local19 = this.anInt1545;
		if (arg0) {
			local19 = this.anInt1555;
			local16 = this.anInt1559;
			local13 = this.anInt1544;
		}
		if (local13 == -1) {
			return null;
		}
		@Pc(40) Class1_Sub1_Sub1_Sub7 local40 = Static113.method1911(Static67.aClass5_49, local13);
		if (local16 != -1) {
			@Pc(48) Class1_Sub1_Sub1_Sub7 local48 = Static113.method1911(Static67.aClass5_49, local16);
			if (local19 == -1) {
				@Pc(62) Class1_Sub1_Sub1_Sub7[] local62 = new Class1_Sub1_Sub1_Sub7[] { local40, local48 };
				local40 = new Class1_Sub1_Sub1_Sub7(local62, 2);
			} else {
				@Pc(75) Class1_Sub1_Sub1_Sub7 local75 = Static113.method1911(Static67.aClass5_49, local19);
				@Pc(90) Class1_Sub1_Sub1_Sub7[] local90 = new Class1_Sub1_Sub1_Sub7[] { local40, local48, local75 };
				local40 = new Class1_Sub1_Sub1_Sub7(local90, 3);
			}
		}
		if (!arg0 && this.anInt1546 != 0) {
			local40.method1916(0, this.anInt1546, 0);
		}
		if (arg0 && this.anInt1569 != 0) {
			local40.method1916(0, this.anInt1569, 0);
		}
		@Pc(123) int local123;
		if (this.aShortArray42 != null) {
			for (local123 = 0; local123 < this.aShortArray42.length; local123++) {
				local40.method1914(this.aShortArray42[local123], this.aShortArray43[local123]);
			}
		}
		if (this.aShortArray44 != null) {
			for (local123 = 0; local123 < this.aShortArray44.length; local123++) {
				local40.method1915(this.aShortArray44[local123], this.aShortArray46[local123]);
			}
		}
		return local40;
	}
}
