import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
	private int anInt1585;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
	public int anInt1594;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
	private int anInt1581 = -1;

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "Lclient!na;")
	public Class53 aClass53_706 = Static77.aClass53_869;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
	private int anInt1578 = -1;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	public int anInt1584 = -1;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
	private int anInt1586 = 128;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
	private int anInt1589 = -1;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
	public int anInt1598 = 2000;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
	public int anInt1587 = 0;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
	public int anInt1580 = 0;

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
	public int anInt1591 = 0;

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
	public int anInt1602 = 0;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
	public int anInt1603 = 0;

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "[Lclient!na;")
	public Class53[] aClass53Array13 = new Class53[] { null, null, null, null, Static16.aClass53_146 };

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "I")
	public int anInt1604 = 0;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public int anInt1577 = 0;

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
	private int anInt1588 = -1;

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
	public int anInt1608 = -1;

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
	private int anInt1599 = 128;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "I")
	private int anInt1609 = 128;

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
	private int anInt1607 = -1;

	@OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
	public int anInt1606 = 1;

	@OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
	private int anInt1613 = -1;

	@OriginalMember(owner = "client!kd", name = "tb", descriptor = "I")
	public int anInt1605 = 0;

	@OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
	private int anInt1617 = -1;

	@OriginalMember(owner = "client!kd", name = "Jb", descriptor = "[Lclient!na;")
	public Class53[] aClass53Array14 = new Class53[] { null, null, Static76.aClass53_850, null, null };

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
	private int anInt1612 = -1;

	@OriginalMember(owner = "client!kd", name = "Ib", descriptor = "I")
	private int anInt1616 = 0;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
	private int anInt1595 = 0;

	@OriginalMember(owner = "client!kd", name = "Sb", descriptor = "I")
	private int anInt1621 = -1;

	@OriginalMember(owner = "client!kd", name = "Pb", descriptor = "I")
	private int anInt1619 = -1;

	@OriginalMember(owner = "client!kd", name = "Nb", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
	public int anInt1596 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method1091(@OriginalArg(0) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray198 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray197[local17] <= arg0 && this.anIntArray197[local17] != 0) {
					local15 = this.anIntArray198[local17];
				}
			}
			if (local15 != -1) {
				return Static2.method38(local15).method1091(1);
			}
		}
		@Pc(65) Class3_Sub1_Sub4_Sub5 local65 = Static67.method1155(Static20.aClass62_2, this.anInt1585);
		if (local65 == null) {
			return null;
		}
		if (this.anInt1599 != 128 || this.anInt1609 != 128 || this.anInt1586 != 128) {
			local65.method1165(this.anInt1599, this.anInt1609, this.anInt1586);
		}
		if (this.aShortArray8 != null) {
			for (local17 = 0; local17 < this.aShortArray8.length; local17++) {
				local65.method1172(this.aShortArray8[local17], this.aShortArray9[local17]);
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLclient!ob;)V")
	private void method1092(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt1585 = arg1.method602();
		} else if (arg0 == 2) {
			this.aClass53_706 = arg1.method605();
		} else if (arg0 == 4) {
			this.anInt1598 = arg1.method602();
		} else if (arg0 == 5) {
			this.anInt1603 = arg1.method602();
		} else if (arg0 == 6) {
			this.anInt1577 = arg1.method602();
		} else if (arg0 == 7) {
			this.anInt1591 = arg1.method602();
			if (this.anInt1591 > 32767) {
				this.anInt1591 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt1604 = arg1.method602();
			if (this.anInt1604 > 32767) {
				this.anInt1604 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt1587 = 1;
		} else if (arg0 == 12) {
			this.anInt1606 = arg1.method638();
		} else if (arg0 == 16) {
			this.aBoolean57 = true;
		} else if (arg0 == 23) {
			this.anInt1617 = arg1.method602();
			this.anInt1616 = arg1.method647();
		} else if (arg0 == 24) {
			this.anInt1607 = arg1.method602();
		} else if (arg0 == 25) {
			this.anInt1578 = arg1.method602();
			this.anInt1595 = arg1.method647();
		} else if (arg0 == 26) {
			this.anInt1613 = arg1.method602();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass53Array14[arg0 - 30] = arg1.method605();
			if (this.aClass53Array14[arg0 - 30].method1274(Static36.aClass53_491)) {
				this.aClass53Array14[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass53Array13[arg0 - 35] = arg1.method605();
		} else if (arg0 == 40) {
			@Pc(392) int local392 = arg1.method647();
			this.aShortArray8 = new short[local392];
			this.aShortArray9 = new short[local392];
			for (@Pc(402) int local402 = 0; local402 < local392; local402++) {
				this.aShortArray8[local402] = (short) arg1.method602();
				this.aShortArray9[local402] = (short) arg1.method602();
			}
		} else if (arg0 == 78) {
			this.anInt1619 = arg1.method602();
		} else if (arg0 == 79) {
			this.anInt1581 = arg1.method602();
		} else if (arg0 == 90) {
			this.anInt1612 = arg1.method602();
		} else if (arg0 == 91) {
			this.anInt1588 = arg1.method602();
		} else if (arg0 == 92) {
			this.anInt1589 = arg1.method602();
		} else if (arg0 == 93) {
			this.anInt1621 = arg1.method602();
		} else if (arg0 == 95) {
			this.anInt1596 = arg1.method602();
		} else if (arg0 == 97) {
			this.anInt1584 = arg1.method602();
		} else if (arg0 == 98) {
			this.anInt1608 = arg1.method602();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray198 == null) {
				this.anIntArray198 = new int[10];
				this.anIntArray197 = new int[10];
			}
			this.anIntArray198[arg0 - 100] = arg1.method602();
			this.anIntArray197[arg0 - 100] = arg1.method602();
		} else if (arg0 == 110) {
			this.anInt1599 = arg1.method602();
		} else if (arg0 == 111) {
			this.anInt1609 = arg1.method602();
		} else if (arg0 == 112) {
			this.anInt1586 = arg1.method602();
		} else if (arg0 == 113) {
			this.anInt1602 = arg1.method624();
		} else if (arg0 == 114) {
			this.anInt1605 = arg1.method624() * 5;
		} else if (arg0 == 115) {
			this.anInt1580 = arg1.method647();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Lclient!kd;")
	public Class3_Sub1_Sub8 method1093(@OriginalArg(0) int arg0) {
		if (this.anIntArray198 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray197[local15] && this.anIntArray197[local15] != 0) {
					local13 = this.anIntArray198[local15];
				}
			}
			if (local13 != -1) {
				return Static2.method38(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kd;Lclient!kd;B)V")
	public void method1095(@OriginalArg(0) Class3_Sub1_Sub8 arg0, @OriginalArg(1) Class3_Sub1_Sub8 arg1) {
		this.anInt1591 = arg0.anInt1591;
		this.aShortArray8 = arg0.aShortArray8;
		this.anInt1604 = arg0.anInt1604;
		this.anInt1587 = 1;
		this.anInt1596 = arg0.anInt1596;
		this.anInt1577 = arg0.anInt1577;
		this.anInt1585 = arg0.anInt1585;
		this.anInt1606 = arg1.anInt1606;
		this.anInt1603 = arg0.anInt1603;
		this.aShortArray9 = arg0.aShortArray9;
		this.anInt1598 = arg0.anInt1598;
		this.aBoolean57 = arg1.aBoolean57;
		this.aClass53_706 = arg1.aClass53_706;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method1096(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1612;
		@Pc(11) int local11 = this.anInt1589;
		if (arg0) {
			local11 = this.anInt1621;
			local8 = this.anInt1588;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(29) Class3_Sub1_Sub4_Sub5 local29 = Static67.method1155(Static20.aClass62_2, local8);
		if (local11 != -1) {
			@Pc(42) Class3_Sub1_Sub4_Sub5 local42 = Static67.method1155(Static20.aClass62_2, local11);
			@Pc(53) Class3_Sub1_Sub4_Sub5[] local53 = new Class3_Sub1_Sub4_Sub5[] { local29, local42 };
			local29 = new Class3_Sub1_Sub4_Sub5(local53, 2);
		}
		if (this.aShortArray8 != null) {
			for (@Pc(64) int local64 = 0; local64 < this.aShortArray8.length; local64++) {
				local29.method1172(this.aShortArray8[local64], this.aShortArray9[local64]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZB)Z")
	public boolean method1097(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1589;
		@Pc(9) int local9 = this.anInt1612;
		if (arg0) {
			local6 = this.anInt1621;
			local9 = this.anInt1588;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static20.aClass62_2.method1515(0, local9)) {
			local24 = false;
		}
		if (local6 != -1 && !Static20.aClass62_2.method1515(0, local6)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)Z")
	public boolean method1098(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1617;
		@Pc(9) int local9 = this.anInt1607;
		@Pc(19) int local19 = this.anInt1619;
		if (arg0) {
			local6 = this.anInt1578;
			local9 = this.anInt1613;
			local19 = this.anInt1581;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(38) boolean local38 = true;
		if (!Static20.aClass62_2.method1515(0, local6)) {
			local38 = false;
		}
		if (local9 != -1 && !Static20.aClass62_2.method1515(0, local9)) {
			local38 = false;
		}
		if (local19 != -1 && !Static20.aClass62_2.method1515(0, local19)) {
			local38 = false;
		}
		return local38;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	public void method1100() {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method1101(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1617;
		@Pc(11) int local11 = this.anInt1607;
		@Pc(14) int local14 = this.anInt1619;
		if (arg0) {
			local8 = this.anInt1578;
			local14 = this.anInt1581;
			local11 = this.anInt1613;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class3_Sub1_Sub4_Sub5 local36 = Static67.method1155(Static20.aClass62_2, local8);
		if (local11 != -1) {
			@Pc(50) Class3_Sub1_Sub4_Sub5 local50 = Static67.method1155(Static20.aClass62_2, local11);
			if (local14 == -1) {
				@Pc(92) Class3_Sub1_Sub4_Sub5[] local92 = new Class3_Sub1_Sub4_Sub5[] { local36, local50 };
				local36 = new Class3_Sub1_Sub4_Sub5(local92, 2);
			} else {
				@Pc(58) Class3_Sub1_Sub4_Sub5 local58 = Static67.method1155(Static20.aClass62_2, local14);
				@Pc(73) Class3_Sub1_Sub4_Sub5[] local73 = new Class3_Sub1_Sub4_Sub5[] { local36, local50, local58 };
				local36 = new Class3_Sub1_Sub4_Sub5(local73, 3);
			}
		}
		if (!arg0 && this.anInt1616 != 0) {
			local36.method1171(0, this.anInt1616, 0);
		}
		if (arg0 && this.anInt1595 != 0) {
			local36.method1171(0, this.anInt1595, 0);
		}
		if (this.aShortArray8 != null) {
			for (@Pc(131) int local131 = 0; local131 < this.aShortArray8.length; local131++) {
				local36.method1172(this.aShortArray8[local131], this.aShortArray9[local131]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ob;)V")
	public void method1102(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method647();
			if (local5 == 0) {
				return;
			}
			this.method1092(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1103(@OriginalArg(1) int arg0) {
		if (this.anIntArray198 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray197[local15] <= arg0 && this.anIntArray197[local15] != 0) {
					local13 = this.anIntArray198[local15];
				}
			}
			if (local13 != -1) {
				return Static2.method38(local13).method1103(1);
			}
		}
		@Pc(61) Class3_Sub1_Sub4_Sub7 local61 = (Class3_Sub1_Sub4_Sub7) Static46.aClass75_79.method1728((long) this.anInt1594);
		if (local61 != null) {
			return local61;
		}
		@Pc(71) Class3_Sub1_Sub4_Sub5 local71 = Static67.method1155(Static20.aClass62_2, this.anInt1585);
		if (local71 == null) {
			return null;
		}
		if (this.anInt1599 != 128 || this.anInt1609 != 128 || this.anInt1586 != 128) {
			local71.method1165(this.anInt1599, this.anInt1609, this.anInt1586);
		}
		if (this.aShortArray8 != null) {
			for (@Pc(100) int local100 = 0; local100 < this.aShortArray8.length; local100++) {
				local71.method1172(this.aShortArray8[local100], this.aShortArray9[local100]);
			}
		}
		local61 = local71.method1156(this.anInt1602 + 64, this.anInt1605 + 768, -50, -10, -50);
		local61.aBoolean106 = true;
		Static46.aClass75_79.method1730(local61, (long) this.anInt1594);
		return local61;
	}
}
