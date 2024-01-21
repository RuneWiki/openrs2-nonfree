import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
	public int anInt1734;

	@OriginalMember(owner = "client!ke", name = "lb", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
	private int anInt1743;

	@OriginalMember(owner = "client!ke", name = "Jb", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!ke", name = "Lb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
	private int anInt1733 = -1;

	@OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
	private int anInt1736 = 128;

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
	private int anInt1742 = -1;

	@OriginalMember(owner = "client!ke", name = "sb", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ke", name = "yb", descriptor = "I")
	private int anInt1750 = -1;

	@OriginalMember(owner = "client!ke", name = "Db", descriptor = "I")
	public int anInt1753 = 0;

	@OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
	public int anInt1740 = 2000;

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
	private int anInt1739 = -1;

	@OriginalMember(owner = "client!ke", name = "ub", descriptor = "Lclient!oa;")
	public Class56 aClass56_944 = Static52.aClass56_850;

	@OriginalMember(owner = "client!ke", name = "xb", descriptor = "[Lclient!oa;")
	public Class56[] aClass56Array6 = new Class56[] { null, null, Static81.aClass56_1168, null, null };

	@OriginalMember(owner = "client!ke", name = "Nb", descriptor = "I")
	public int anInt1760 = 0;

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
	private int anInt1747 = 0;

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
	public int anInt1731 = 0;

	@OriginalMember(owner = "client!ke", name = "Cb", descriptor = "[Lclient!oa;")
	public Class56[] aClass56Array7 = new Class56[] { null, null, null, null, Static108.aClass56_1496 };

	@OriginalMember(owner = "client!ke", name = "Kb", descriptor = "I")
	public int anInt1758 = 0;

	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "I")
	public int anInt1762 = -1;

	@OriginalMember(owner = "client!ke", name = "vb", descriptor = "I")
	private int anInt1749 = 128;

	@OriginalMember(owner = "client!ke", name = "Fb", descriptor = "I")
	public int anInt1754 = 1;

	@OriginalMember(owner = "client!ke", name = "Wb", descriptor = "I")
	private int anInt1769 = -1;

	@OriginalMember(owner = "client!ke", name = "Tb", descriptor = "I")
	public int anInt1766 = 0;

	@OriginalMember(owner = "client!ke", name = "zb", descriptor = "I")
	public int anInt1751 = 0;

	@OriginalMember(owner = "client!ke", name = "Hb", descriptor = "I")
	public int anInt1756 = 0;

	@OriginalMember(owner = "client!ke", name = "Yb", descriptor = "I")
	private int anInt1771 = -1;

	@OriginalMember(owner = "client!ke", name = "Gb", descriptor = "I")
	private int anInt1755 = -1;

	@OriginalMember(owner = "client!ke", name = "Mb", descriptor = "I")
	public int anInt1759 = 0;

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
	private int anInt1741 = 0;

	@OriginalMember(owner = "client!ke", name = "cc", descriptor = "I")
	public int anInt1774 = -1;

	@OriginalMember(owner = "client!ke", name = "Ib", descriptor = "I")
	public int anInt1757 = 0;

	@OriginalMember(owner = "client!ke", name = "bc", descriptor = "I")
	private int anInt1773 = -1;

	@OriginalMember(owner = "client!ke", name = "dc", descriptor = "I")
	private int anInt1775 = 128;

	@OriginalMember(owner = "client!ke", name = "fc", descriptor = "I")
	private int anInt1777 = -1;

	@OriginalMember(owner = "client!ke", name = "gc", descriptor = "I")
	private int anInt1778 = -1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method1185(@OriginalArg(0) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray136 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray135[local15] <= arg0 && this.anIntArray135[local15] != 0) {
					local13 = this.anIntArray136[local15];
				}
			}
			if (local13 != -1) {
				return Static12.method239(local13).method1185(1);
			}
		}
		@Pc(57) Class3_Sub1_Sub2_Sub1 local57 = Static10.method222(Static28.aClass44_18, this.anInt1743);
		if (local57 == null) {
			return null;
		}
		if (this.anInt1749 != 128 || this.anInt1736 != 128 || this.anInt1775 != 128) {
			local57.method217(this.anInt1749, this.anInt1736, this.anInt1775);
		}
		if (this.aShortArray6 != null) {
			for (local15 = 0; local15 < this.aShortArray6.length; local15++) {
				local57.method223(this.aShortArray6[local15], this.aShortArray5[local15]);
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!b;)V")
	public void method1186(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method270();
			if (local13 == 0) {
				return;
			}
			this.method1193(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZ)Z")
	public boolean method1188(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1778;
		@Pc(9) int local9 = this.anInt1755;
		if (arg0) {
			local6 = this.anInt1750;
			local9 = this.anInt1773;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static28.aClass44_18.method1137(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static28.aClass44_18.method1137(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ke;Lclient!ke;I)V")
	public void method1189(@OriginalArg(0) Class3_Sub1_Sub8 arg0, @OriginalArg(1) Class3_Sub1_Sub8 arg1) {
		this.anInt1766 = arg1.anInt1766;
		this.anInt1743 = arg1.anInt1743;
		this.anInt1731 = 1;
		this.aClass56_944 = arg0.aClass56_944;
		this.anInt1756 = arg1.anInt1756;
		this.aShortArray6 = arg1.aShortArray6;
		this.anInt1760 = arg1.anInt1760;
		this.aBoolean82 = arg0.aBoolean82;
		this.anInt1754 = arg0.anInt1754;
		this.aShortArray5 = arg1.aShortArray5;
		this.anInt1740 = arg1.anInt1740;
		this.anInt1751 = arg1.anInt1751;
		this.anInt1753 = arg1.anInt1753;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1190(@OriginalArg(0) int arg0) {
		if (this.anIntArray136 != null && arg0 > 1) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (this.anIntArray135[local21] <= arg0 && this.anIntArray135[local21] != 0) {
					local19 = this.anIntArray136[local21];
				}
			}
			if (local19 != -1) {
				return Static12.method239(local19).method1190(1);
			}
		}
		@Pc(63) Class3_Sub1_Sub2_Sub6 local63 = (Class3_Sub1_Sub2_Sub6) Static63.aClass52_37.method1342((long) this.anInt1734);
		if (local63 != null) {
			return local63;
		}
		@Pc(73) Class3_Sub1_Sub2_Sub1 local73 = Static10.method222(Static28.aClass44_18, this.anInt1743);
		if (local73 == null) {
			return null;
		}
		if (this.anInt1749 != 128 || this.anInt1736 != 128 || this.anInt1775 != 128) {
			local73.method217(this.anInt1749, this.anInt1736, this.anInt1775);
		}
		if (this.aShortArray6 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.aShortArray6.length; local106++) {
				local73.method223(this.aShortArray6[local106], this.aShortArray5[local106]);
			}
		}
		local63 = local73.method215(this.anInt1759 + 64, this.anInt1757 + 768, -50, -10, -50);
		local63.aBoolean125 = true;
		Static63.aClass52_37.method1344(local63, (long) this.anInt1734);
		return local63;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(ZI)Z")
	public boolean method1192(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt1742;
		@Pc(9) int local9 = this.anInt1769;
		@Pc(12) int local12 = this.anInt1733;
		if (arg0) {
			local2 = this.anInt1771;
			local9 = this.anInt1777;
			local12 = this.anInt1739;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static28.aClass44_18.method1137(local9, 0)) {
			local31 = false;
		}
		if (local2 != -1 && !Static28.aClass44_18.method1137(local2, 0)) {
			local31 = false;
		}
		if (local12 != -1 && !Static28.aClass44_18.method1137(local12, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!b;I)V")
	private void method1193(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1743 = arg0.method276();
		} else if (arg1 == 2) {
			this.aClass56_944 = arg0.method301();
		} else if (arg1 == 4) {
			this.anInt1740 = arg0.method276();
		} else if (arg1 == 5) {
			this.anInt1766 = arg0.method276();
		} else if (arg1 == 6) {
			this.anInt1751 = arg0.method276();
		} else if (arg1 == 7) {
			this.anInt1756 = arg0.method276();
			if (this.anInt1756 > 32767) {
				this.anInt1756 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1760 = arg0.method276();
			if (this.anInt1760 > 32767) {
				this.anInt1760 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1731 = 1;
		} else if (arg1 == 12) {
			this.anInt1754 = arg0.method278();
		} else if (arg1 == 16) {
			this.aBoolean82 = true;
		} else if (arg1 == 23) {
			this.anInt1769 = arg0.method276();
			this.anInt1747 = arg0.method270();
		} else if (arg1 == 24) {
			this.anInt1742 = arg0.method276();
		} else if (arg1 == 25) {
			this.anInt1777 = arg0.method276();
			this.anInt1741 = arg0.method270();
		} else if (arg1 == 26) {
			this.anInt1771 = arg0.method276();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass56Array6[arg1 - 30] = arg0.method301();
			if (this.aClass56Array6[arg1 - 30].method1418(Static15.aClass56_217)) {
				this.aClass56Array6[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass56Array7[arg1 - 35] = arg0.method301();
		} else if (arg1 == 40) {
			@Pc(196) int local196 = arg0.method270();
			this.aShortArray6 = new short[local196];
			this.aShortArray5 = new short[local196];
			for (@Pc(206) int local206 = 0; local206 < local196; local206++) {
				this.aShortArray6[local206] = (short) arg0.method276();
				this.aShortArray5[local206] = (short) arg0.method276();
			}
		} else if (arg1 == 78) {
			this.anInt1733 = arg0.method276();
		} else if (arg1 == 79) {
			this.anInt1739 = arg0.method276();
		} else if (arg1 == 90) {
			this.anInt1778 = arg0.method276();
		} else if (arg1 == 91) {
			this.anInt1750 = arg0.method276();
		} else if (arg1 == 92) {
			this.anInt1755 = arg0.method276();
		} else if (arg1 == 93) {
			this.anInt1773 = arg0.method276();
		} else if (arg1 == 95) {
			this.anInt1753 = arg0.method276();
		} else if (arg1 == 97) {
			this.anInt1774 = arg0.method276();
		} else if (arg1 == 98) {
			this.anInt1762 = arg0.method276();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray136 == null) {
				this.anIntArray136 = new int[10];
				this.anIntArray135 = new int[10];
			}
			this.anIntArray136[arg1 - 100] = arg0.method276();
			this.anIntArray135[arg1 - 100] = arg0.method276();
		} else if (arg1 == 110) {
			this.anInt1749 = arg0.method276();
		} else if (arg1 == 111) {
			this.anInt1736 = arg0.method276();
		} else if (arg1 == 112) {
			this.anInt1775 = arg0.method276();
		} else if (arg1 == 113) {
			this.anInt1759 = arg0.method265();
		} else if (arg1 == 114) {
			this.anInt1757 = arg0.method265() * 5;
		} else if (arg1 == 115) {
			this.anInt1758 = arg0.method270();
		}
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V")
	public void method1194() {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method1195(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1778;
		@Pc(11) int local11 = this.anInt1755;
		if (arg0) {
			local11 = this.anInt1773;
			local8 = this.anInt1750;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(29) Class3_Sub1_Sub2_Sub1 local29 = Static10.method222(Static28.aClass44_18, local8);
		if (local11 != -1) {
			@Pc(37) Class3_Sub1_Sub2_Sub1 local37 = Static10.method222(Static28.aClass44_18, local11);
			@Pc(48) Class3_Sub1_Sub2_Sub1[] local48 = new Class3_Sub1_Sub2_Sub1[] { local29, local37 };
			local29 = new Class3_Sub1_Sub2_Sub1(local48, 2);
		}
		if (this.aShortArray6 != null) {
			for (@Pc(59) int local59 = 0; local59 < this.aShortArray6.length; local59++) {
				local29.method223(this.aShortArray6[local59], this.aShortArray5[local59]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(ZI)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method1196(@OriginalArg(0) boolean arg0) {
		@Pc(16) int local16 = this.anInt1742;
		@Pc(19) int local19 = this.anInt1769;
		@Pc(22) int local22 = this.anInt1733;
		if (arg0) {
			local16 = this.anInt1771;
			local22 = this.anInt1739;
			local19 = this.anInt1777;
		}
		if (local19 == -1) {
			return null;
		}
		@Pc(43) Class3_Sub1_Sub2_Sub1 local43 = Static10.method222(Static28.aClass44_18, local19);
		if (local16 != -1) {
			@Pc(51) Class3_Sub1_Sub2_Sub1 local51 = Static10.method222(Static28.aClass44_18, local16);
			if (local22 == -1) {
				@Pc(66) Class3_Sub1_Sub2_Sub1[] local66 = new Class3_Sub1_Sub2_Sub1[] { local43, local51 };
				local43 = new Class3_Sub1_Sub2_Sub1(local66, 2);
			} else {
				@Pc(79) Class3_Sub1_Sub2_Sub1 local79 = Static10.method222(Static28.aClass44_18, local22);
				@Pc(94) Class3_Sub1_Sub2_Sub1[] local94 = new Class3_Sub1_Sub2_Sub1[] { local43, local51, local79 };
				local43 = new Class3_Sub1_Sub2_Sub1(local94, 3);
			}
		}
		if (!arg0 && this.anInt1747 != 0) {
			local43.method226(0, this.anInt1747, 0);
		}
		if (arg0 && this.anInt1741 != 0) {
			local43.method226(0, this.anInt1741, 0);
		}
		if (this.aShortArray6 != null) {
			for (@Pc(130) int local130 = 0; local130 < this.aShortArray6.length; local130++) {
				local43.method223(this.aShortArray6[local130], this.aShortArray5[local130]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Lclient!ke;")
	public Class3_Sub1_Sub8 method1197(@OriginalArg(0) int arg0) {
		if (this.anIntArray136 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray135[local17] <= arg0 && this.anIntArray135[local17] != 0) {
					local15 = this.anIntArray136[local17];
				}
			}
			if (local15 != -1) {
				return Static12.method239(local15);
			}
		}
		return this;
	}
}
