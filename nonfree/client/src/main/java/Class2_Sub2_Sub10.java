import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
	public int anInt1590;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!ie", name = "nb", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!ie", name = "yb", descriptor = "I")
	private int anInt1618;

	@OriginalMember(owner = "client!ie", name = "Ab", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ie", name = "Eb", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
	public int anInt1586 = 0;

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
	public int anInt1587 = 0;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
	public int anInt1585 = -1;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
	private int anInt1593 = 0;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
	private int anInt1591 = -1;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
	private int anInt1594 = 0;

	@OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
	public int anInt1605 = 1;

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
	public int anInt1600 = 0;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
	private int anInt1584 = -1;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	private int anInt1589 = 0;

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
	private int anInt1604 = -1;

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
	private int anInt1596 = 128;

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
	private int anInt1603 = -1;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!lf;")
	public Class49 aClass49_834 = Static140.aClass49_1355;

	@OriginalMember(owner = "client!ie", name = "wb", descriptor = "I")
	private int anInt1616 = -1;

	@OriginalMember(owner = "client!ie", name = "tb", descriptor = "I")
	public int anInt1613 = -1;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
	private int anInt1582 = 0;

	@OriginalMember(owner = "client!ie", name = "mb", descriptor = "I")
	public int anInt1608 = 2000;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
	public int anInt1592 = -1;

	@OriginalMember(owner = "client!ie", name = "Db", descriptor = "[Lclient!lf;")
	public Class49[] aClass49Array11 = new Class49[] { null, null, Static112.aClass49_1078, null, null };

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!ie", name = "xb", descriptor = "I")
	public int anInt1617 = 0;

	@OriginalMember(owner = "client!ie", name = "zb", descriptor = "I")
	private int anInt1619 = -1;

	@OriginalMember(owner = "client!ie", name = "rb", descriptor = "I")
	private int anInt1611 = 128;

	@OriginalMember(owner = "client!ie", name = "Fb", descriptor = "[Lclient!lf;")
	public Class49[] aClass49Array12 = new Class49[] { null, null, null, null, Static71.aClass49_778 };

	@OriginalMember(owner = "client!ie", name = "Cb", descriptor = "I")
	public int anInt1621 = 0;

	@OriginalMember(owner = "client!ie", name = "Hb", descriptor = "I")
	private int anInt1623 = -1;

	@OriginalMember(owner = "client!ie", name = "Gb", descriptor = "I")
	private int anInt1622 = 128;

	@OriginalMember(owner = "client!ie", name = "Jb", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
	private int anInt1602 = -1;

	@OriginalMember(owner = "client!ie", name = "Ib", descriptor = "I")
	public int anInt1624 = 0;

	@OriginalMember(owner = "client!ie", name = "ub", descriptor = "I")
	public int anInt1614 = -1;

	@OriginalMember(owner = "client!ie", name = "vb", descriptor = "I")
	public int anInt1615 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ja;B)V")
	public void method1240(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2962();
			if (local5 == 0) {
				return;
			}
			this.method1251(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)Z")
	public boolean method1241(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1604;
		@Pc(9) int local9 = this.anInt1619;
		@Pc(12) int local12 = this.anInt1585;
		if (arg0) {
			local6 = this.anInt1602;
			local9 = this.anInt1616;
			local12 = this.anInt1613;
		}
		if (local12 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static8.aClass11_88.method2063(0, local12)) {
			local31 = false;
		}
		if (local9 != -1 && !Static8.aClass11_88.method2063(0, local9)) {
			local31 = false;
		}
		if (local6 != -1 && !Static8.aClass11_88.method2063(0, local6)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Lclient!gf;")
	public Class2_Sub2_Sub3_Sub4_Sub1 method1242() {
		@Pc(7) Class2_Sub2_Sub3_Sub6 local7 = Static119.method2029(Static8.aClass11_88, this.anInt1618);
		if (local7 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray16 != null) {
			for (local20 = 0; local20 < this.aShortArray16.length; local20++) {
				local7.method2025(this.aShortArray16[local20], this.aShortArray15[local20]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local20 = 0; local20 < this.aShortArray14.length; local20++) {
				local7.method2034(this.aShortArray14[local20], this.aShortArray13[local20]);
			}
		}
		@Pc(83) Class2_Sub2_Sub3_Sub4_Sub1 local83 = local7.method2026(this.anInt1589 + 64, this.anInt1593 + 768);
		local83.aBoolean52 = true;
		if (this.anInt1596 != 128 || this.anInt1611 != 128 || this.anInt1622 != 128) {
			local83.method1048(this.anInt1596, this.anInt1611, this.anInt1622);
		}
		return local83;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Z")
	public boolean method1243(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1623;
		@Pc(9) int local9 = this.anInt1603;
		if (arg0) {
			local9 = this.anInt1591;
			local6 = this.anInt1584;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static8.aClass11_88.method2063(0, local6)) {
			local31 = false;
		}
		if (local9 != -1 && !Static8.aClass11_88.method2063(0, local9)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lclient!ie;")
	public Class2_Sub2_Sub10 method1244(@OriginalArg(0) int arg0) {
		if (this.anIntArray181 != null && arg0 > 1) {
			@Pc(22) int local22 = -1;
			for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
				if (arg0 >= this.anIntArray182[local24] && this.anIntArray182[local24] != 0) {
					local22 = this.anIntArray181[local24];
				}
			}
			if (local22 != -1) {
				return Static113.method1913(local22);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!bi;II)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method1245(@OriginalArg(1) Class2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray181 != null && arg2 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg2 >= this.anIntArray182[local15] && this.anIntArray182[local15] != 0) {
					local13 = this.anIntArray181[local15];
				}
			}
			if (local13 != -1) {
				return Static113.method1913(local13).method1245(arg0, arg1, 1);
			}
		}
		@Pc(65) Class2_Sub2_Sub3_Sub4 local65 = (Class2_Sub2_Sub3_Sub4) Static131.aClass74_93.method2345((long) this.anInt1590);
		if (local65 == null) {
			@Pc(73) Class2_Sub2_Sub3_Sub6 local73 = Static119.method2029(Static8.aClass11_88, this.anInt1618);
			if (local73 == null) {
				return null;
			}
			@Pc(82) int local82;
			if (this.aShortArray16 != null) {
				for (local82 = 0; local82 < this.aShortArray16.length; local82++) {
					local73.method2025(this.aShortArray16[local82], this.aShortArray15[local82]);
				}
			}
			if (this.aShortArray14 != null) {
				for (local82 = 0; local82 < this.aShortArray14.length; local82++) {
					local73.method2034(this.aShortArray14[local82], this.aShortArray13[local82]);
				}
			}
			local65 = local73.method2027(this.anInt1589 + 64, this.anInt1593 + 768, -50, -10, -50, false);
			if (this.anInt1596 != 128 || this.anInt1611 != 128 || this.anInt1622 != 128) {
				local65.method1048(this.anInt1596, this.anInt1611, this.anInt1622);
			}
			Static131.aClass74_93.method2341((long) this.anInt1590, local65);
		}
		if (arg0 != null) {
			local65 = arg0.method363(local65, arg1);
		}
		return local65;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public void method1246() {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ie;Lclient!ie;B)V")
	public void method1248(@OriginalArg(0) Class2_Sub2_Sub10 arg0, @OriginalArg(1) Class2_Sub2_Sub10 arg1) {
		this.aShortArray15 = arg1.aShortArray15;
		this.aShortArray14 = arg1.aShortArray14;
		this.aShortArray13 = arg1.aShortArray13;
		this.aClass49_834 = arg0.aClass49_834;
		this.anInt1618 = arg1.anInt1618;
		this.anInt1617 = arg1.anInt1617;
		this.anInt1605 = arg0.anInt1605;
		this.anInt1624 = arg1.anInt1624;
		this.anInt1587 = arg1.anInt1587;
		this.anInt1586 = 1;
		this.anInt1600 = arg1.anInt1600;
		this.aBoolean69 = arg0.aBoolean69;
		this.aShortArray16 = arg1.aShortArray16;
		this.anInt1608 = arg1.anInt1608;
		this.anInt1615 = arg1.anInt1615;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ja;BI)V")
	private void method1251(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1618 = arg0.method2933();
		} else if (arg1 == 2) {
			this.aClass49_834 = arg0.method2926();
		} else if (arg1 == 4) {
			this.anInt1608 = arg0.method2933();
		} else if (arg1 == 5) {
			this.anInt1587 = arg0.method2933();
		} else if (arg1 == 6) {
			this.anInt1624 = arg0.method2933();
		} else if (arg1 == 7) {
			this.anInt1600 = arg0.method2933();
			if (this.anInt1600 > 32767) {
				this.anInt1600 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1617 = arg0.method2933();
			if (this.anInt1617 > 32767) {
				this.anInt1617 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1586 = 1;
		} else if (arg1 == 12) {
			this.anInt1605 = arg0.method2946();
		} else if (arg1 == 16) {
			this.aBoolean69 = true;
		} else if (arg1 == 23) {
			this.anInt1585 = arg0.method2933();
			this.anInt1582 = arg0.method2962();
		} else if (arg1 == 24) {
			this.anInt1619 = arg0.method2933();
		} else if (arg1 == 25) {
			this.anInt1613 = arg0.method2933();
			this.anInt1594 = arg0.method2962();
		} else if (arg1 == 26) {
			this.anInt1616 = arg0.method2933();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass49Array11[arg1 - 30] = arg0.method2926();
			if (this.aClass49Array11[arg1 - 30].method1645(Static141.aClass49_1360)) {
				this.aClass49Array11[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass49Array12[arg1 - 35] = arg0.method2926();
		} else {
			@Pc(214) int local214;
			@Pc(224) int local224;
			if (arg1 == 40) {
				local214 = arg0.method2962();
				this.aShortArray15 = new short[local214];
				this.aShortArray16 = new short[local214];
				for (local224 = 0; local224 < local214; local224++) {
					this.aShortArray16[local224] = (short) arg0.method2933();
					this.aShortArray15[local224] = (short) arg0.method2933();
				}
			} else if (arg1 == 41) {
				local214 = arg0.method2962();
				this.aShortArray14 = new short[local214];
				this.aShortArray13 = new short[local214];
				for (local224 = 0; local224 < local214; local224++) {
					this.aShortArray14[local224] = (short) arg0.method2933();
					this.aShortArray13[local224] = (short) arg0.method2933();
				}
			} else if (arg1 == 65) {
				this.aBoolean70 = true;
			} else if (arg1 == 78) {
				this.anInt1604 = arg0.method2933();
			} else if (arg1 == 79) {
				this.anInt1602 = arg0.method2933();
			} else if (arg1 == 90) {
				this.anInt1623 = arg0.method2933();
			} else if (arg1 == 91) {
				this.anInt1584 = arg0.method2933();
			} else if (arg1 == 92) {
				this.anInt1603 = arg0.method2933();
			} else if (arg1 == 93) {
				this.anInt1591 = arg0.method2933();
			} else if (arg1 == 95) {
				this.anInt1615 = arg0.method2933();
			} else if (arg1 == 97) {
				this.anInt1592 = arg0.method2933();
			} else if (arg1 == 98) {
				this.anInt1614 = arg0.method2933();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray181 == null) {
					this.anIntArray182 = new int[10];
					this.anIntArray181 = new int[10];
				}
				this.anIntArray181[arg1 - 100] = arg0.method2933();
				this.anIntArray182[arg1 - 100] = arg0.method2933();
			} else if (arg1 == 110) {
				this.anInt1596 = arg0.method2933();
			} else if (arg1 == 111) {
				this.anInt1611 = arg0.method2933();
			} else if (arg1 == 112) {
				this.anInt1622 = arg0.method2933();
			} else if (arg1 == 113) {
				this.anInt1589 = arg0.method2948();
			} else if (arg1 == 114) {
				this.anInt1593 = arg0.method2948() * 5;
			} else if (arg1 == 115) {
				this.anInt1621 = arg0.method2962();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BZ)Lclient!oe;")
	public Class2_Sub2_Sub3_Sub6 method1252(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt1619;
		@Pc(7) int local7 = this.anInt1585;
		@Pc(14) int local14 = this.anInt1604;
		if (arg0) {
			local7 = this.anInt1613;
			local14 = this.anInt1602;
			local4 = this.anInt1616;
		}
		if (local7 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub2_Sub3_Sub6 local35 = Static119.method2029(Static8.aClass11_88, local7);
		if (local4 != -1) {
			@Pc(43) Class2_Sub2_Sub3_Sub6 local43 = Static119.method2029(Static8.aClass11_88, local4);
			if (local14 == -1) {
				@Pc(85) Class2_Sub2_Sub3_Sub6[] local85 = new Class2_Sub2_Sub3_Sub6[] { local35, local43 };
				local35 = new Class2_Sub2_Sub3_Sub6(local85, 2);
			} else {
				@Pc(51) Class2_Sub2_Sub3_Sub6 local51 = Static119.method2029(Static8.aClass11_88, local14);
				@Pc(66) Class2_Sub2_Sub3_Sub6[] local66 = new Class2_Sub2_Sub3_Sub6[] { local35, local43, local51 };
				local35 = new Class2_Sub2_Sub3_Sub6(local66, 3);
			}
		}
		if (!arg0 && this.anInt1582 != 0) {
			local35.method2036(0, this.anInt1582, 0);
		}
		if (arg0 && this.anInt1594 != 0) {
			local35.method2036(0, this.anInt1594, 0);
		}
		@Pc(131) int local131;
		if (this.aShortArray16 != null) {
			for (local131 = 0; local131 < this.aShortArray16.length; local131++) {
				local35.method2025(this.aShortArray16[local131], this.aShortArray15[local131]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local131 = 0; local131 < this.aShortArray14.length; local131++) {
				local35.method2034(this.aShortArray14[local131], this.aShortArray13[local131]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)Lclient!oe;")
	public Class2_Sub2_Sub3_Sub6 method1253(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1623;
		@Pc(11) int local11 = this.anInt1603;
		if (arg0) {
			local8 = this.anInt1584;
			local11 = this.anInt1591;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(29) Class2_Sub2_Sub3_Sub6 local29 = Static119.method2029(Static8.aClass11_88, local8);
		if (local11 != -1) {
			@Pc(38) Class2_Sub2_Sub3_Sub6 local38 = Static119.method2029(Static8.aClass11_88, local11);
			@Pc(49) Class2_Sub2_Sub3_Sub6[] local49 = new Class2_Sub2_Sub3_Sub6[] { local29, local38 };
			local29 = new Class2_Sub2_Sub3_Sub6(local49, 2);
		}
		@Pc(60) int local60;
		if (this.aShortArray16 != null) {
			for (local60 = 0; local60 < this.aShortArray16.length; local60++) {
				local29.method2025(this.aShortArray16[local60], this.aShortArray15[local60]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local60 = 0; local60 < this.aShortArray14.length; local60++) {
				local29.method2034(this.aShortArray14[local60], this.aShortArray13[local60]);
			}
		}
		return local29;
	}
}
