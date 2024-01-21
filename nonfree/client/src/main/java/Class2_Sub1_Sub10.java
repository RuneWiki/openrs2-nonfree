import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ie", name = "jb", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ie", name = "qb", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ie", name = "Ib", descriptor = "I")
	public int anInt1638;

	@OriginalMember(owner = "client!ie", name = "Mb", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ie", name = "ec", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!ie", name = "ic", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
	public int anInt1614 = 0;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
	private int anInt1613 = 0;

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
	public int anInt1621 = 0;

	@OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
	public int anInt1624 = 0;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
	private int anInt1612 = 0;

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "I")
	public int anInt1622 = -1;

	@OriginalMember(owner = "client!ie", name = "Kb", descriptor = "I")
	public int anInt1640 = -1;

	@OriginalMember(owner = "client!ie", name = "Lb", descriptor = "I")
	public int anInt1641 = 2;

	@OriginalMember(owner = "client!ie", name = "yb", descriptor = "I")
	public int anInt1633 = -1;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
	private int anInt1616 = 0;

	@OriginalMember(owner = "client!ie", name = "Gb", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ie", name = "gb", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ie", name = "vb", descriptor = "I")
	private int anInt1631 = -1;

	@OriginalMember(owner = "client!ie", name = "Nb", descriptor = "I")
	public int anInt1642 = -1;

	@OriginalMember(owner = "client!ie", name = "Fb", descriptor = "I")
	private int anInt1637 = 0;

	@OriginalMember(owner = "client!ie", name = "lb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ie", name = "Sb", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!ie", name = "Bb", descriptor = "I")
	public int anInt1634 = 1;

	@OriginalMember(owner = "client!ie", name = "Yb", descriptor = "I")
	private int anInt1648 = 0;

	@OriginalMember(owner = "client!ie", name = "zb", descriptor = "[Lclient!wd;")
	public final Class80[] aClass80Array9 = new Class80[5];

	@OriginalMember(owner = "client!ie", name = "ac", descriptor = "I")
	public int anInt1650 = -1;

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
	private int anInt1623 = 128;

	@OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ie", name = "Pb", descriptor = "I")
	public int anInt1643 = 0;

	@OriginalMember(owner = "client!ie", name = "Ub", descriptor = "I")
	private int anInt1646 = 128;

	@OriginalMember(owner = "client!ie", name = "tb", descriptor = "I")
	public int anInt1630 = 1;

	@OriginalMember(owner = "client!ie", name = "dc", descriptor = "I")
	private int anInt1652 = 128;

	@OriginalMember(owner = "client!ie", name = "xb", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!ie", name = "fc", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ie", name = "Tb", descriptor = "I")
	public int anInt1645 = 16;

	@OriginalMember(owner = "client!ie", name = "Db", descriptor = "I")
	private int anInt1636 = -1;

	@OriginalMember(owner = "client!ie", name = "Ob", descriptor = "Z")
	public boolean aBoolean114 = true;

	@OriginalMember(owner = "client!ie", name = "jc", descriptor = "Lclient!wd;")
	public Class80 aClass80_580 = Static13.aClass80_152;

	@OriginalMember(owner = "client!ie", name = "gc", descriptor = "I")
	public int anInt1653 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Z")
	public boolean method955(@OriginalArg(0) int arg0) {
		if (this.anIntArray206 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray206.length; local15++) {
				if (arg0 == this.anIntArray206[local15]) {
					return Static87.aClass11_37.method384(0, this.anIntArray209[local15] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray209 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < this.anIntArray209.length; local58++) {
				local56 &= Static87.aClass11_37.method384(0, this.anIntArray209[local58] & 0xFFFF);
			}
			return local56;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Lclient!de;")
	private Class2_Sub1_Sub1_Sub6 method956(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub1_Sub1_Sub6 local7 = null;
		@Pc(14) int local14;
		@Pc(53) int local53;
		@Pc(116) boolean local116;
		@Pc(124) int local124;
		if (this.anIntArray206 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray209 == null) {
				return null;
			}
			local14 = this.anIntArray209.length;
			local116 = this.aBoolean116 ^ arg0 > 3;
			for (local53 = 0; local53 < local14; local53++) {
				local124 = this.anIntArray209[local53];
				if (local116) {
					local124 += 65536;
				}
				local7 = (Class2_Sub1_Sub1_Sub6) Static25.aClass32_16.method887((long) local124);
				if (local7 == null) {
					local7 = Static26.method540(Static87.aClass11_37, local124 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local116) {
						local7.method554();
					}
					Static25.aClass32_16.method880(local7, (long) local124);
				}
				if (local14 > 1) {
					Static64.aClass2_Sub1_Sub1_Sub6Array1[local53] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class2_Sub1_Sub1_Sub6(Static64.aClass2_Sub1_Sub1_Sub6Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray206.length; local14++) {
				if (this.anIntArray206[local14] == arg1) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			@Pc(48) boolean local48 = this.aBoolean116 ^ arg0 > 3;
			local53 = this.anIntArray209[local12];
			if (local48) {
				local53 += 65536;
			}
			local7 = (Class2_Sub1_Sub1_Sub6) Static25.aClass32_16.method887((long) local53);
			if (local7 == null) {
				local7 = Static26.method540(Static87.aClass11_37, local53 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local48) {
					local7.method554();
				}
				Static25.aClass32_16.method880(local7, (long) local53);
			}
		}
		@Pc(203) boolean local203;
		if (this.anInt1648 == 0 && this.anInt1613 == 0 && this.anInt1637 == 0) {
			local203 = false;
		} else {
			local203 = true;
		}
		if (this.anInt1652 == 128 && this.anInt1623 == 128 && this.anInt1646 == 128) {
			local116 = false;
		} else {
			local116 = true;
		}
		@Pc(251) Class2_Sub1_Sub1_Sub6 local251 = new Class2_Sub1_Sub1_Sub6(local7, arg0 == 0 && !local116 && !local203, this.aShortArray8 == null, true);
		@Pc(255) int local255 = arg0 & 0x3;
		if (local255 == 1) {
			local251.method549();
		} else if (local255 == 2) {
			local251.method550();
		} else if (local255 == 3) {
			local251.method552();
		}
		if (this.aShortArray8 != null) {
			for (local124 = 0; local124 < this.aShortArray8.length; local124++) {
				local251.method559(this.aShortArray8[local124], this.aShortArray9[local124]);
			}
		}
		if (local116) {
			local251.method542(this.anInt1652, this.anInt1623, this.anInt1646);
		}
		if (local203) {
			local251.method545(this.anInt1648, this.anInt1613, this.anInt1637);
		}
		return local251;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!wb;I)V")
	public void method957(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1780();
			if (local15 == 0) {
				return;
			}
			this.method964(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)Z")
	public boolean method958() {
		if (this.anIntArray209 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray209.length; local19++) {
			local17 &= Static87.aClass11_37.method384(0, this.anIntArray209[local19] & 0xFFFF);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray206 == null) {
			local14 = (this.anInt1638 << 10) + arg0;
		} else {
			local14 = arg0 + (arg3 << 3) + (this.anInt1638 << 10);
		}
		@Pc(39) Class2_Sub1_Sub1_Sub2 local39 = (Class2_Sub1_Sub1_Sub2) Static67.aClass32_36.method887(local14);
		if (local39 == null) {
			@Pc(47) Class2_Sub1_Sub1_Sub6 local47 = this.method956(arg0, arg3);
			if (local47 == null) {
				return null;
			}
			local39 = local47.method548(this.anInt1616 + 64, this.anInt1612 * 5 + 768, -50, -10, -50);
			Static67.aClass32_36.method880(local39, local14);
		}
		if (this.aBoolean113) {
			local39 = local39.method222(arg1, arg4, arg5, arg2, true);
		}
		return local39;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	public void method961() {
		if (this.anInt1653 == -1) {
			this.anInt1653 = 0;
			if (this.anIntArray209 != null && (this.anIntArray206 == null || this.anIntArray206[0] == 10)) {
				this.anInt1653 = 1;
			}
			for (@Pc(25) int local25 = 0; local25 < 5; local25++) {
				if (this.aClass80Array9[local25] != null) {
					this.anInt1653 = 1;
				}
			}
		}
		if (this.anInt1622 == -1) {
			this.anInt1622 = this.anInt1641 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIILclient!h;II)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray206 == null) {
			local16 = (this.anInt1638 << 10) + arg0;
		} else {
			local16 = (arg2 << 3) + (this.anInt1638 << 10) + arg0;
		}
		@Pc(33) Class2_Sub1_Sub1_Sub2 local33 = (Class2_Sub1_Sub1_Sub2) Static67.aClass32_36.method887(local16);
		if (local33 == null) {
			@Pc(45) Class2_Sub1_Sub1_Sub6 local45 = this.method956(arg0, arg2);
			if (local45 == null) {
				return null;
			}
			local33 = local45.method548(this.anInt1616 + 64, this.anInt1612 * 5 + 768, -50, -10, -50);
			Static67.aClass32_36.method880(local33, local16);
		}
		if (arg5 == null && !this.aBoolean113) {
			return local33;
		}
		if (arg5 == null) {
			local33 = local33.method212(true);
		} else {
			local33 = arg5.method732(local33, arg0, arg4);
		}
		if (this.aBoolean113) {
			local33.method222(arg1, arg6, arg3, arg7, false);
		}
		return local33;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIIIIII)Lclient!e;")
	public Class2_Sub1_Sub1 method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) long local26;
		if (this.anIntArray206 == null) {
			local26 = arg4 + (this.anInt1638 << 10);
		} else {
			local26 = arg4 + (this.anInt1638 << 10) + (arg1 << 3);
		}
		@Pc(42) Class2_Sub1_Sub1 local42 = (Class2_Sub1_Sub1) Static57.aClass32_33.method887(local26);
		if (local42 == null) {
			@Pc(50) Class2_Sub1_Sub1_Sub6 local50 = this.method956(arg4, arg1);
			if (local50 == null) {
				return null;
			}
			if (this.aBoolean115) {
				local50.aShort2 = (short) (this.anInt1616 + 64);
				local42 = local50;
				local50.aShort1 = (short) (this.anInt1612 * 5 + 768);
				local50.method556();
			} else {
				local42 = local50.method548(this.anInt1616 + 64, this.anInt1612 * 5 + 768, -50, -10, -50);
			}
			Static57.aClass32_33.method880(local42, local26);
		}
		if (this.aBoolean115) {
			local42 = ((Class2_Sub1_Sub1_Sub6) local42).method541();
		}
		if (this.aBoolean113) {
			if (local42 instanceof Class2_Sub1_Sub1_Sub2) {
				local42 = ((Class2_Sub1_Sub1_Sub2) local42).method222(arg2, arg5, arg3, arg0, true);
			} else if (local42 instanceof Class2_Sub1_Sub1_Sub6) {
				local42 = ((Class2_Sub1_Sub1_Sub6) local42).method557(arg2, arg5, arg3, arg0);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!wb;)V")
	private void method964(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		@Pc(17) int local17;
		@Pc(47) int local47;
		if (arg0 == 1) {
			local17 = arg1.method1780();
			if (local17 > 0) {
				if (this.anIntArray209 == null || Static59.aBoolean123) {
					this.anIntArray209 = new int[local17];
					this.anIntArray206 = new int[local17];
					for (local47 = 0; local47 < local17; local47++) {
						this.anIntArray209[local47] = arg1.method1783();
						this.anIntArray206[local47] = arg1.method1780();
					}
				} else {
					arg1.anInt2799 += local17 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass80_580 = arg1.method1797();
		} else if (arg0 == 5) {
			local17 = arg1.method1780();
			if (local17 > 0) {
				if (this.anIntArray209 == null || Static59.aBoolean123) {
					this.anIntArray206 = null;
					this.anIntArray209 = new int[local17];
					for (local47 = 0; local47 < local17; local47++) {
						this.anIntArray209[local47] = arg1.method1783();
					}
				} else {
					arg1.anInt2799 += local17 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt1634 = arg1.method1780();
		} else if (arg0 == 15) {
			this.anInt1630 = arg1.method1780();
		} else if (arg0 == 17) {
			this.aBoolean111 = false;
			this.anInt1641 = 0;
		} else if (arg0 == 18) {
			this.aBoolean111 = false;
		} else if (arg0 == 19) {
			this.anInt1653 = arg1.method1780();
		} else if (arg0 == 21) {
			this.aBoolean113 = true;
		} else if (arg0 == 22) {
			this.aBoolean115 = true;
		} else if (arg0 == 23) {
			this.aBoolean110 = true;
		} else if (arg0 == 24) {
			this.anInt1650 = arg1.method1783();
			if (this.anInt1650 == 65535) {
				this.anInt1650 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt1641 = 1;
		} else if (arg0 == 28) {
			this.anInt1645 = arg1.method1780();
		} else if (arg0 == 29) {
			this.anInt1616 = arg1.method1767();
		} else if (arg0 == 39) {
			this.anInt1612 = arg1.method1767() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass80Array9[arg0 - 30] = arg1.method1797();
			if (this.aClass80Array9[arg0 - 30].method2006(Static102.aClass80_1010)) {
				this.aClass80Array9[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local17 = arg1.method1780();
			this.aShortArray8 = new short[local17];
			this.aShortArray9 = new short[local17];
			for (local47 = 0; local47 < local17; local47++) {
				this.aShortArray8[local47] = (short) arg1.method1783();
				this.aShortArray9[local47] = (short) arg1.method1783();
			}
		} else if (arg0 == 60) {
			this.anInt1633 = arg1.method1783();
		} else if (arg0 == 62) {
			this.aBoolean116 = true;
		} else if (arg0 == 64) {
			this.aBoolean114 = false;
		} else if (arg0 == 65) {
			this.anInt1652 = arg1.method1783();
		} else if (arg0 == 66) {
			this.anInt1623 = arg1.method1783();
		} else if (arg0 == 67) {
			this.anInt1646 = arg1.method1783();
		} else if (arg0 == 68) {
			this.anInt1642 = arg1.method1783();
		} else if (arg0 == 69) {
			this.anInt1621 = arg1.method1780();
		} else if (arg0 == 70) {
			this.anInt1648 = arg1.method1784();
		} else if (arg0 == 71) {
			this.anInt1613 = arg1.method1784();
		} else if (arg0 == 72) {
			this.anInt1637 = arg1.method1784();
		} else if (arg0 == 73) {
			this.aBoolean112 = true;
		} else if (arg0 == 74) {
			this.aBoolean108 = true;
		} else if (arg0 == 75) {
			this.anInt1622 = arg1.method1780();
		} else if (arg0 == 77) {
			this.anInt1636 = arg1.method1783();
			if (this.anInt1636 == 65535) {
				this.anInt1636 = -1;
			}
			this.anInt1631 = arg1.method1783();
			if (this.anInt1631 == 65535) {
				this.anInt1631 = -1;
			}
			local17 = arg1.method1780();
			this.anIntArray207 = new int[local17 + 1];
			for (local47 = 0; local47 <= local17; local47++) {
				this.anIntArray207[local47] = arg1.method1783();
				if (this.anIntArray207[local47] == 65535) {
					this.anIntArray207[local47] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt1640 = arg1.method1783();
			this.anInt1614 = arg1.method1780();
		} else if (arg0 == 79) {
			this.anInt1624 = arg1.method1783();
			this.anInt1643 = arg1.method1783();
			this.anInt1614 = arg1.method1780();
			local17 = arg1.method1780();
			this.anIntArray210 = new int[local17];
			for (local47 = 0; local47 < local17; local47++) {
				this.anIntArray210[local47] = arg1.method1783();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)Lclient!ie;")
	public Class2_Sub1_Sub10 method965() {
		@Pc(5) int local5 = -1;
		if (this.anInt1636 != -1) {
			local5 = Static73.method1165(this.anInt1636);
		} else if (this.anInt1631 != -1) {
			local5 = Static15.anIntArray66[this.anInt1631];
		}
		return local5 < 0 || local5 >= this.anIntArray207.length || this.anIntArray207[local5] == -1 ? null : Static18.method404(this.anIntArray207[local5]);
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)Z")
	public boolean method967() {
		if (this.anIntArray207 == null) {
			return this.anInt1640 != -1 || this.anIntArray210 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray207.length; local22++) {
			if (this.anIntArray207[local22] != -1) {
				@Pc(38) Class2_Sub1_Sub10 local38 = Static18.method404(this.anIntArray207[local22]);
				if (local38.anInt1640 != -1 || local38.anIntArray210 != null) {
					return true;
				}
			}
		}
		return false;
	}
}
