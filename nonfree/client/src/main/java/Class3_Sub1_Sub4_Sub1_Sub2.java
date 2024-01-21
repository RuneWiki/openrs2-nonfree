import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class3_Sub1_Sub4_Sub1_Sub2 extends Class3_Sub1_Sub4_Sub1 {

	@OriginalMember(owner = "client!jf", name = "Lc", descriptor = "I")
	public int anInt1482;

	@OriginalMember(owner = "client!jf", name = "Sc", descriptor = "I")
	public int anInt1487;

	@OriginalMember(owner = "client!jf", name = "Tc", descriptor = "Lclient!i;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!jf", name = "Yc", descriptor = "Lclient!na;")
	public Class53 aClass53_668;

	@OriginalMember(owner = "client!jf", name = "cd", descriptor = "I")
	public int anInt1495;

	@OriginalMember(owner = "client!jf", name = "dd", descriptor = "I")
	public int anInt1496;

	@OriginalMember(owner = "client!jf", name = "ed", descriptor = "Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 aClass3_Sub1_Sub4_Sub7_1;

	@OriginalMember(owner = "client!jf", name = "hd", descriptor = "I")
	public int anInt1499;

	@OriginalMember(owner = "client!jf", name = "id", descriptor = "I")
	public int anInt1500;

	@OriginalMember(owner = "client!jf", name = "jd", descriptor = "I")
	public int anInt1501;

	@OriginalMember(owner = "client!jf", name = "qd", descriptor = "I")
	public int anInt1507;

	@OriginalMember(owner = "client!jf", name = "Pc", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!jf", name = "Xc", descriptor = "I")
	public int anInt1491 = 0;

	@OriginalMember(owner = "client!jf", name = "Kc", descriptor = "I")
	public int anInt1481 = -1;

	@OriginalMember(owner = "client!jf", name = "Vc", descriptor = "I")
	public int anInt1489 = 0;

	@OriginalMember(owner = "client!jf", name = "Mc", descriptor = "I")
	public int anInt1483 = -1;

	@OriginalMember(owner = "client!jf", name = "ld", descriptor = "I")
	public int anInt1503 = 0;

	@OriginalMember(owner = "client!jf", name = "pd", descriptor = "I")
	public int anInt1506 = 0;

	@OriginalMember(owner = "client!jf", name = "Zc", descriptor = "I")
	public int anInt1492 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ob;B)V")
	public void method1044(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.anInt964 = 0;
		@Pc(16) int local16 = arg0.method647();
		this.anInt1481 = arg0.method624();
		this.anInt1483 = arg0.method624();
		@Pc(33) int[] local33 = new int[12];
		this.anInt1506 = 0;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(101) int local101;
		for (@Pc(40) int local40 = 0; local40 < 12; local40++) {
			@Pc(46) int local46 = arg0.method647();
			if (local46 == 0) {
				local33[local40] = 0;
			} else {
				local61 = arg0.method647();
				local33[local40] = (local46 << 8) + local61;
				if (local40 == 0 && local33[0] == 65535) {
					local38 = arg0.method602();
					break;
				}
				if (local33[local40] >= 512) {
					local101 = Static2.method38(local33[local40] - 512).anInt1580;
					if (local101 != 0) {
						this.anInt1506 = local101;
					}
				}
			}
		}
		@Pc(118) int[] local118 = new int[5];
		for (local61 = 0; local61 < 5; local61++) {
			local101 = arg0.method647();
			if (local101 < 0 || local101 >= Static78.aShortArrayArray1[local61].length) {
				local101 = 0;
			}
			local118[local61] = local101;
		}
		super.anInt1449 = arg0.method602();
		if (super.anInt1449 == 65535) {
			super.anInt1449 = -1;
		}
		super.anInt1446 = arg0.method602();
		if (super.anInt1446 == 65535) {
			super.anInt1446 = -1;
		}
		super.anInt1428 = super.anInt1446;
		super.anInt1437 = arg0.method602();
		if (super.anInt1437 == 65535) {
			super.anInt1437 = -1;
		}
		super.anInt1441 = arg0.method602();
		if (super.anInt1441 == 65535) {
			super.anInt1441 = -1;
		}
		super.anInt1440 = arg0.method602();
		if (super.anInt1440 == 65535) {
			super.anInt1440 = -1;
		}
		super.anInt1414 = arg0.method602();
		if (super.anInt1414 == 65535) {
			super.anInt1414 = -1;
		}
		super.anInt1463 = arg0.method602();
		if (super.anInt1463 == 65535) {
			super.anInt1463 = -1;
		}
		this.aClass53_668 = Static106.method1712(arg0.method607()).method1263();
		this.anInt1489 = arg0.method647();
		this.anInt1503 = arg0.method602();
		if (this.aClass34_1 == null) {
			this.aClass34_1 = new Class34();
		}
		this.aClass34_1.method871(local16 == 1, local38, local33, local118);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method1036() {
		return this.aClass34_1 != null;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)Lclient!ua;")
	@Override
	public Class3_Sub1_Sub4_Sub7 method1750() {
		if (this.aClass34_1 == null) {
			return null;
		}
		@Pc(25) Class3_Sub1_Sub11 local25 = super.anInt1442 != -1 && super.anInt1460 == 0 ? Static97.method1629(super.anInt1442) : null;
		@Pc(50) Class3_Sub1_Sub11 local50 = super.anInt1436 == -1 || this.aBoolean55 || super.anInt1436 == super.anInt1449 && local25 != null ? null : Static97.method1629(super.anInt1436);
		@Pc(61) Class3_Sub1_Sub4_Sub7 local61 = this.aClass34_1.method879(local50, super.anInt1422, local25, super.anInt1415);
		if (local61 == null) {
			return null;
		}
		local61.method1761();
		super.anInt1465 = local61.anInt2525;
		@Pc(97) Class3_Sub1_Sub4_Sub7 local97;
		@Pc(117) Class3_Sub1_Sub4_Sub7[] local117;
		if (!this.aBoolean55 && super.anInt1439 != -1 && super.anInt1431 != -1) {
			local97 = Static89.method1461(super.anInt1439).method239(super.anInt1431);
			if (local97 != null) {
				local97.method1771(0, -super.anInt1425, 0);
				local117 = new Class3_Sub1_Sub4_Sub7[] { local61, local97 };
				local61 = new Class3_Sub1_Sub4_Sub7(local117, 2);
			}
		}
		if (!this.aBoolean55 && this.aClass3_Sub1_Sub4_Sub7_1 != null) {
			if (this.anInt1492 <= Static27.anInt843) {
				this.aClass3_Sub1_Sub4_Sub7_1 = null;
			}
			if (this.anInt1491 <= Static27.anInt843 && Static27.anInt843 < this.anInt1492) {
				local97 = this.aClass3_Sub1_Sub4_Sub7_1;
				local117 = new Class3_Sub1_Sub4_Sub7[] { local61, local97 };
				local97.method1771(this.anInt1487 - super.anInt1424, -this.anInt1482 + this.anInt1501, this.anInt1507 - super.anInt1427);
				if (super.anInt1430 == 512) {
					local97.method1769();
					local97.method1769();
					local97.method1769();
				} else if (super.anInt1430 == 1024) {
					local97.method1769();
					local97.method1769();
				} else if (super.anInt1430 == 1536) {
					local97.method1769();
				}
				local61 = new Class3_Sub1_Sub4_Sub7(local117, 2);
				if (super.anInt1430 == 512) {
					local97.method1769();
				} else if (super.anInt1430 == 1024) {
					local97.method1769();
					local97.method1769();
				} else if (super.anInt1430 == 1536) {
					local97.method1769();
					local97.method1769();
					local97.method1769();
				}
				local97.method1771(super.anInt1424 - this.anInt1487, -this.anInt1501 + this.anInt1482, super.anInt1427 - this.anInt1507);
			}
		}
		local61.aBoolean106 = true;
		return local61;
	}
}
