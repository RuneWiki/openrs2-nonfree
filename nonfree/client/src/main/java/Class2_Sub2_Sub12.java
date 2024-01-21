import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nd", name = "nb", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!nd", name = "Lb", descriptor = "I")
	public int anInt1717;

	@OriginalMember(owner = "client!nd", name = "Qb", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!nd", name = "Sb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!nd", name = "Zb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!nd", name = "dc", descriptor = "I")
	private int anInt1730;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
	public int anInt1690 = 0;

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
	private int anInt1692 = -1;

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
	public int anInt1691 = 0;

	@OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
	public int anInt1705 = 2000;

	@OriginalMember(owner = "client!nd", name = "tb", descriptor = "I")
	private int anInt1703 = 0;

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
	public int anInt1693 = 0;

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
	public int anInt1696 = 0;

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
	private int anInt1695 = -1;

	@OriginalMember(owner = "client!nd", name = "ub", descriptor = "I")
	private int anInt1704 = 128;

	@OriginalMember(owner = "client!nd", name = "ob", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!nd", name = "Cb", descriptor = "I")
	public int anInt1710 = 0;

	@OriginalMember(owner = "client!nd", name = "Db", descriptor = "I")
	private int anInt1711 = -1;

	@OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
	private int anInt1698 = -1;

	@OriginalMember(owner = "client!nd", name = "wb", descriptor = "[Lclient!u;")
	public Class74[] aClass74Array11 = new Class74[] { null, null, Static105.aClass74_1489, null, null };

	@OriginalMember(owner = "client!nd", name = "sb", descriptor = "I")
	private int anInt1702 = -1;

	@OriginalMember(owner = "client!nd", name = "Gb", descriptor = "I")
	public int anInt1714 = 0;

	@OriginalMember(owner = "client!nd", name = "Jb", descriptor = "I")
	private int anInt1716 = 128;

	@OriginalMember(owner = "client!nd", name = "Rb", descriptor = "I")
	private int anInt1721 = -1;

	@OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
	private int anInt1700 = -1;

	@OriginalMember(owner = "client!nd", name = "Wb", descriptor = "I")
	public int anInt1725 = -1;

	@OriginalMember(owner = "client!nd", name = "Fb", descriptor = "I")
	private int anInt1713 = 128;

	@OriginalMember(owner = "client!nd", name = "Hb", descriptor = "I")
	private int anInt1715 = -1;

	@OriginalMember(owner = "client!nd", name = "Nb", descriptor = "I")
	public int anInt1719 = -1;

	@OriginalMember(owner = "client!nd", name = "Vb", descriptor = "I")
	public int anInt1724 = 0;

	@OriginalMember(owner = "client!nd", name = "cc", descriptor = "I")
	private int anInt1729 = -1;

	@OriginalMember(owner = "client!nd", name = "Kb", descriptor = "[Lclient!u;")
	public Class74[] aClass74Array12 = new Class74[] { null, null, null, null, Static120.aClass74_1606 };

	@OriginalMember(owner = "client!nd", name = "Ub", descriptor = "I")
	public int anInt1723 = 0;

	@OriginalMember(owner = "client!nd", name = "ac", descriptor = "I")
	public int anInt1727 = 0;

	@OriginalMember(owner = "client!nd", name = "Mb", descriptor = "I")
	private int anInt1718 = -1;

	@OriginalMember(owner = "client!nd", name = "bc", descriptor = "I")
	public int anInt1728 = 1;

	@OriginalMember(owner = "client!nd", name = "mc", descriptor = "Lclient!u;")
	public Class74 aClass74_1184 = Static36.aClass74_655;

	@OriginalMember(owner = "client!nd", name = "Eb", descriptor = "I")
	private int anInt1712 = 0;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public void method1218() {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BZ)Z")
	public boolean method1219(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt1721;
		@Pc(9) int local9 = this.anInt1711;
		if (arg0) {
			local9 = this.anInt1698;
			local2 = this.anInt1718;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static67.aClass26_13.method1375(0, local2)) {
			local32 = false;
		}
		if (local9 != -1 && !Static67.aClass26_13.method1375(0, local9)) {
			local32 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!ic;I)V")
	private void method1220(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1730 = arg0.method1517();
		} else if (arg1 == 2) {
			this.aClass74_1184 = arg0.method1530();
		} else if (arg1 == 4) {
			this.anInt1705 = arg0.method1517();
		} else if (arg1 == 5) {
			this.anInt1696 = arg0.method1517();
		} else if (arg1 == 6) {
			this.anInt1690 = arg0.method1517();
		} else if (arg1 == 7) {
			this.anInt1710 = arg0.method1517();
			if (this.anInt1710 > 32767) {
				this.anInt1710 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1714 = arg0.method1517();
			if (this.anInt1714 > 32767) {
				this.anInt1714 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1727 = 1;
		} else if (arg1 == 12) {
			this.anInt1728 = arg0.method1532();
		} else if (arg1 == 16) {
			this.aBoolean69 = true;
		} else if (arg1 == 23) {
			this.anInt1695 = arg0.method1517();
			this.anInt1712 = arg0.method1514();
		} else if (arg1 == 24) {
			this.anInt1700 = arg0.method1517();
		} else if (arg1 == 25) {
			this.anInt1729 = arg0.method1517();
			this.anInt1703 = arg0.method1514();
		} else if (arg1 == 26) {
			this.anInt1692 = arg0.method1517();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass74Array11[arg1 - 30] = arg0.method1530();
			if (this.aClass74Array11[arg1 - 30].method1701(Static79.aClass74_1213)) {
				this.aClass74Array11[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass74Array12[arg1 - 35] = arg0.method1530();
		} else if (arg1 == 40) {
			@Pc(342) int local342 = arg0.method1514();
			this.aShortArray11 = new short[local342];
			this.aShortArray10 = new short[local342];
			for (@Pc(352) int local352 = 0; local352 < local342; local352++) {
				this.aShortArray11[local352] = (short) arg0.method1517();
				this.aShortArray10[local352] = (short) arg0.method1517();
			}
		} else if (arg1 == 78) {
			this.anInt1715 = arg0.method1517();
		} else if (arg1 == 79) {
			this.anInt1702 = arg0.method1517();
		} else if (arg1 == 90) {
			this.anInt1721 = arg0.method1517();
		} else if (arg1 == 91) {
			this.anInt1718 = arg0.method1517();
		} else if (arg1 == 92) {
			this.anInt1711 = arg0.method1517();
		} else if (arg1 == 93) {
			this.anInt1698 = arg0.method1517();
		} else if (arg1 == 95) {
			this.anInt1691 = arg0.method1517();
		} else if (arg1 == 97) {
			this.anInt1719 = arg0.method1517();
		} else if (arg1 == 98) {
			this.anInt1725 = arg0.method1517();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray250 == null) {
				this.anIntArray250 = new int[10];
				this.anIntArray249 = new int[10];
			}
			this.anIntArray250[arg1 - 100] = arg0.method1517();
			this.anIntArray249[arg1 - 100] = arg0.method1517();
		} else if (arg1 == 110) {
			this.anInt1713 = arg0.method1517();
		} else if (arg1 == 111) {
			this.anInt1716 = arg0.method1517();
		} else if (arg1 == 112) {
			this.anInt1704 = arg0.method1517();
		} else if (arg1 == 113) {
			this.anInt1723 = arg0.method1509();
		} else if (arg1 == 114) {
			this.anInt1724 = arg0.method1509() * 5;
		} else if (arg1 == 115) {
			this.anInt1693 = arg0.method1514();
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BZ)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method1223(@OriginalArg(1) boolean arg0) {
		@Pc(13) int local13 = this.anInt1721;
		@Pc(16) int local16 = this.anInt1711;
		if (arg0) {
			local13 = this.anInt1718;
			local16 = this.anInt1698;
		}
		if (local13 == -1) {
			return null;
		}
		@Pc(34) Class2_Sub2_Sub2_Sub7 local34 = Static94.method1414(Static67.aClass26_13, local13);
		if (local16 != -1) {
			@Pc(43) Class2_Sub2_Sub2_Sub7 local43 = Static94.method1414(Static67.aClass26_13, local16);
			@Pc(54) Class2_Sub2_Sub2_Sub7[] local54 = new Class2_Sub2_Sub2_Sub7[] { local34, local43 };
			local34 = new Class2_Sub2_Sub2_Sub7(local54, 2);
		}
		if (this.aShortArray11 != null) {
			for (@Pc(65) int local65 = 0; local65 < this.aShortArray11.length; local65++) {
				local34.method1415(this.aShortArray11[local65], this.aShortArray10[local65]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)Lclient!nd;")
	public Class2_Sub2_Sub12 method1224(@OriginalArg(0) int arg0) {
		if (this.anIntArray250 != null && arg0 > 1) {
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
				if (arg0 >= this.anIntArray249[local25] && this.anIntArray249[local25] != 0) {
					local23 = this.anIntArray250[local25];
				}
			}
			if (local23 != -1) {
				return Static35.method1934(local23);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)Z")
	public boolean method1225(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1695;
		@Pc(9) int local9 = this.anInt1700;
		@Pc(17) int local17 = this.anInt1715;
		if (arg0) {
			local6 = this.anInt1729;
			local9 = this.anInt1692;
			local17 = this.anInt1702;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static67.aClass26_13.method1375(0, local6)) {
			local36 = false;
		}
		if (local9 != -1 && !Static67.aClass26_13.method1375(0, local9)) {
			local36 = false;
		}
		if (local17 != -1 && !Static67.aClass26_13.method1375(0, local17)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!ic;)V")
	public void method1226(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1514();
			if (local10 == 0) {
				return;
			}
			this.method1220(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!nd;ZLclient!nd;)V")
	public void method1227(@OriginalArg(0) Class2_Sub2_Sub12 arg0, @OriginalArg(2) Class2_Sub2_Sub12 arg1) {
		this.aBoolean69 = arg1.aBoolean69;
		this.anInt1705 = arg0.anInt1705;
		this.anInt1728 = arg1.anInt1728;
		this.anInt1691 = arg0.anInt1691;
		this.anInt1714 = arg0.anInt1714;
		this.anInt1730 = arg0.anInt1730;
		this.anInt1696 = arg0.anInt1696;
		this.anInt1690 = arg0.anInt1690;
		this.anInt1710 = arg0.anInt1710;
		this.anInt1727 = 1;
		this.aShortArray11 = arg0.aShortArray11;
		this.aClass74_1184 = arg1.aClass74_1184;
		this.aShortArray10 = arg0.aShortArray10;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZB)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method1229(@OriginalArg(0) boolean arg0) {
		@Pc(14) int local14 = this.anInt1695;
		@Pc(17) int local17 = this.anInt1700;
		@Pc(20) int local20 = this.anInt1715;
		if (arg0) {
			local17 = this.anInt1692;
			local20 = this.anInt1702;
			local14 = this.anInt1729;
		}
		if (local14 == -1) {
			return null;
		}
		@Pc(42) Class2_Sub2_Sub2_Sub7 local42 = Static94.method1414(Static67.aClass26_13, local14);
		if (local17 != -1) {
			@Pc(50) Class2_Sub2_Sub2_Sub7 local50 = Static94.method1414(Static67.aClass26_13, local17);
			if (local20 == -1) {
				@Pc(92) Class2_Sub2_Sub2_Sub7[] local92 = new Class2_Sub2_Sub2_Sub7[] { local42, local50 };
				local42 = new Class2_Sub2_Sub2_Sub7(local92, 2);
			} else {
				@Pc(58) Class2_Sub2_Sub2_Sub7 local58 = Static94.method1414(Static67.aClass26_13, local20);
				@Pc(73) Class2_Sub2_Sub2_Sub7[] local73 = new Class2_Sub2_Sub2_Sub7[] { local42, local50, local58 };
				local42 = new Class2_Sub2_Sub2_Sub7(local73, 3);
			}
		}
		if (!arg0 && this.anInt1712 != 0) {
			local42.method1416(0, this.anInt1712, 0);
		}
		if (arg0 && this.anInt1703 != 0) {
			local42.method1416(0, this.anInt1703, 0);
		}
		if (this.aShortArray11 != null) {
			for (@Pc(128) int local128 = 0; local128 < this.aShortArray11.length; local128++) {
				local42.method1415(this.aShortArray11[local128], this.aShortArray10[local128]);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1231(@OriginalArg(1) int arg0) {
		if (this.anIntArray250 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray249[local15] <= arg0 && this.anIntArray249[local15] != 0) {
					local13 = this.anIntArray250[local15];
				}
			}
			if (local13 != -1) {
				return Static35.method1934(local13).method1231(1);
			}
		}
		@Pc(55) Class2_Sub2_Sub2_Sub5 local55 = (Class2_Sub2_Sub2_Sub5) Static95.aClass16_74.method490((long) this.anInt1717);
		if (local55 != null) {
			return local55;
		}
		@Pc(65) Class2_Sub2_Sub2_Sub7 local65 = Static94.method1414(Static67.aClass26_13, this.anInt1730);
		if (local65 == null) {
			return null;
		}
		if (this.anInt1713 != 128 || this.anInt1716 != 128 || this.anInt1704 != 128) {
			local65.method1403(this.anInt1713, this.anInt1716, this.anInt1704);
		}
		if (this.aShortArray11 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.aShortArray11.length; local106++) {
				local65.method1415(this.aShortArray11[local106], this.aShortArray10[local106]);
			}
		}
		local55 = local65.method1412(this.anInt1723 + 64, 768 - -this.anInt1724, -50, -10, -50);
		local55.aBoolean63 = true;
		Static95.aClass16_74.method492(local55, (long) this.anInt1717);
		return local55;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(II)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method1232(@OriginalArg(0) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray250 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray249[local17] <= arg0 && this.anIntArray249[local17] != 0) {
					local15 = this.anIntArray250[local17];
				}
			}
			if (local15 != -1) {
				return Static35.method1934(local15).method1232(1);
			}
		}
		@Pc(62) Class2_Sub2_Sub2_Sub7 local62 = Static94.method1414(Static67.aClass26_13, this.anInt1730);
		if (local62 == null) {
			return null;
		}
		if (this.anInt1713 != 128 || this.anInt1716 != 128 || this.anInt1704 != 128) {
			local62.method1403(this.anInt1713, this.anInt1716, this.anInt1704);
		}
		if (this.aShortArray11 != null) {
			for (local17 = 0; local17 < this.aShortArray11.length; local17++) {
				local62.method1415(this.aShortArray11[local17], this.aShortArray10[local17]);
			}
		}
		return local62;
	}
}
