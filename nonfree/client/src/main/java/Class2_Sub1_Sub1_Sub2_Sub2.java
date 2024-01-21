import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class2_Sub1_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!je", name = "Vc", descriptor = "I")
	public int anInt1575;

	@OriginalMember(owner = "client!je", name = "Wc", descriptor = "I")
	public int anInt1576;

	@OriginalMember(owner = "client!je", name = "Yc", descriptor = "I")
	public int anInt1578;

	@OriginalMember(owner = "client!je", name = "bd", descriptor = "Lclient!qe;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!je", name = "dd", descriptor = "I")
	public int anInt1581;

	@OriginalMember(owner = "client!je", name = "ed", descriptor = "I")
	public int anInt1582;

	@OriginalMember(owner = "client!je", name = "rd", descriptor = "I")
	public int anInt1591;

	@OriginalMember(owner = "client!je", name = "yd", descriptor = "I")
	public int anInt1595;

	@OriginalMember(owner = "client!je", name = "zd", descriptor = "Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 aClass2_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!je", name = "Gd", descriptor = "Lclient!wb;")
	public Class65 aClass65_726;

	@OriginalMember(owner = "client!je", name = "Hd", descriptor = "I")
	public int anInt1598;

	@OriginalMember(owner = "client!je", name = "Rc", descriptor = "I")
	public int anInt1573 = 0;

	@OriginalMember(owner = "client!je", name = "nd", descriptor = "I")
	public int anInt1588 = 0;

	@OriginalMember(owner = "client!je", name = "Dd", descriptor = "I")
	public int anInt1596 = 0;

	@OriginalMember(owner = "client!je", name = "wd", descriptor = "I")
	public int anInt1593 = 0;

	@OriginalMember(owner = "client!je", name = "Fd", descriptor = "I")
	public int anInt1597 = -1;

	@OriginalMember(owner = "client!je", name = "gd", descriptor = "I")
	public int anInt1583 = 0;

	@OriginalMember(owner = "client!je", name = "Ed", descriptor = "Z")
	public boolean aBoolean87 = false;

	@OriginalMember(owner = "client!je", name = "md", descriptor = "I")
	public int anInt1587 = -1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!fe;)V")
	public void method930(@OriginalArg(1) Class2_Sub8 arg0) {
		arg0.anInt2342 = 0;
		@Pc(11) int[] local11 = new int[12];
		@Pc(15) int local15 = arg0.method1410();
		@Pc(17) int local17 = -1;
		this.anInt1597 = arg0.method1380();
		this.anInt1587 = arg0.method1380();
		this.anInt1593 = 0;
		@Pc(53) int local53;
		@Pc(88) int local88;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1410();
			if (local38 == 0) {
				local11[local32] = 0;
			} else {
				local53 = arg0.method1410();
				local11[local32] = (local38 << 8) + local53;
				if (local32 == 0 && local11[0] == 65535) {
					local17 = arg0.method1396();
					break;
				}
				if (local11[local32] >= 512) {
					local88 = Static70.method1263(local11[local32] - 512).anInt1824;
					if (local88 != 0) {
						this.anInt1593 = local88;
					}
				}
			}
		}
		@Pc(103) int[] local103 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local88 = arg0.method1410();
			if (local88 < 0 || local88 >= Static2.anIntArrayArray1[local53].length) {
				local88 = 0;
			}
			local103[local53] = local88;
		}
		super.anInt1515 = arg0.method1396();
		if (super.anInt1515 == 65535) {
			super.anInt1515 = -1;
		}
		super.anInt1571 = arg0.method1396();
		if (super.anInt1571 == 65535) {
			super.anInt1571 = -1;
		}
		super.anInt1559 = super.anInt1571;
		super.anInt1528 = arg0.method1396();
		if (super.anInt1528 == 65535) {
			super.anInt1528 = -1;
		}
		super.anInt1548 = arg0.method1396();
		if (super.anInt1548 == 65535) {
			super.anInt1548 = -1;
		}
		super.anInt1558 = arg0.method1396();
		if (super.anInt1558 == 65535) {
			super.anInt1558 = -1;
		}
		super.anInt1555 = arg0.method1396();
		if (super.anInt1555 == 65535) {
			super.anInt1555 = -1;
		}
		super.anInt1568 = arg0.method1396();
		if (super.anInt1568 == 65535) {
			super.anInt1568 = -1;
		}
		this.aClass65_726 = Static24.method442(arg0.method1405()).method1787();
		this.anInt1583 = arg0.method1410();
		this.anInt1573 = arg0.method1396();
		if (this.aClass49_1 == null) {
			this.aClass49_1 = new Class49();
		}
		this.aClass49_1.method1493(local15 == 1, local103, local17, local11);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method925() {
		return this.aClass49_1 != null;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(B)Lclient!r;")
	@Override
	public Class2_Sub1_Sub1_Sub6 method1512() {
		if (this.aClass49_1 == null) {
			return null;
		}
		@Pc(25) Class2_Sub1_Sub6 local25 = super.anInt1552 != -1 && super.anInt1569 == 0 ? Static71.method1291(super.anInt1552) : null;
		@Pc(46) Class2_Sub1_Sub6 local46 = super.anInt1542 == -1 || this.aBoolean87 || super.anInt1542 == super.anInt1515 && local25 != null ? null : Static71.method1291(super.anInt1542);
		@Pc(57) Class2_Sub1_Sub1_Sub6 local57 = this.aClass49_1.method1492(local25, super.anInt1549, super.anInt1547, local46);
		if (local57 == null) {
			return null;
		}
		local57.method1516();
		super.anInt1523 = local57.anInt2496;
		@Pc(92) Class2_Sub1_Sub1_Sub6 local92;
		@Pc(112) Class2_Sub1_Sub1_Sub6[] local112;
		if (!this.aBoolean87 && super.anInt1554 != -1 && super.anInt1563 != -1) {
			local92 = Static20.method402(super.anInt1554).method1654(super.anInt1563);
			if (local92 != null) {
				local92.method1528(0, -super.anInt1537, 0);
				local112 = new Class2_Sub1_Sub1_Sub6[] { local57, local92 };
				local57 = new Class2_Sub1_Sub1_Sub6(local112, 2, true);
			}
		}
		if (!this.aBoolean87 && this.aClass2_Sub1_Sub1_Sub6_1 != null) {
			if (Static108.anInt2902 >= this.anInt1596) {
				this.aClass2_Sub1_Sub1_Sub6_1 = null;
			}
			if (Static108.anInt2902 >= this.anInt1588 && Static108.anInt2902 < this.anInt1596) {
				local92 = this.aClass2_Sub1_Sub1_Sub6_1;
				local112 = new Class2_Sub1_Sub1_Sub6[] { local57, local92 };
				local92.method1528(this.anInt1578 - super.anInt1518, -this.anInt1591 + this.anInt1582, this.anInt1581 - super.anInt1562);
				if (super.anInt1545 == 512) {
					local92.method1539();
					local92.method1539();
					local92.method1539();
				} else if (super.anInt1545 == 1024) {
					local92.method1539();
					local92.method1539();
				} else if (super.anInt1545 == 1536) {
					local92.method1539();
				}
				local57 = new Class2_Sub1_Sub1_Sub6(local112, 2, true);
				if (super.anInt1545 == 512) {
					local92.method1539();
				} else if (super.anInt1545 == 1024) {
					local92.method1539();
					local92.method1539();
				} else if (super.anInt1545 == 1536) {
					local92.method1539();
					local92.method1539();
					local92.method1539();
				}
				local92.method1528(super.anInt1518 - this.anInt1578, -this.anInt1582 + this.anInt1591, super.anInt1562 - this.anInt1581);
			}
		}
		local57.aBoolean127 = true;
		return local57;
	}
}
