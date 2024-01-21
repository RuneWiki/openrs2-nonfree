import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class5_Sub2_Sub4_Sub3_Sub1 extends Class5_Sub2_Sub4_Sub3 {

	@OriginalMember(owner = "client!j", name = "Wc", descriptor = "I")
	public int anInt1570;

	@OriginalMember(owner = "client!j", name = "Xc", descriptor = "I")
	public int anInt1571;

	@OriginalMember(owner = "client!j", name = "Zc", descriptor = "I")
	public int anInt1573;

	@OriginalMember(owner = "client!j", name = "bd", descriptor = "I")
	public int anInt1575;

	@OriginalMember(owner = "client!j", name = "gd", descriptor = "Lclient!hc;")
	public Class32 aClass32_2;

	@OriginalMember(owner = "client!j", name = "id", descriptor = "I")
	public int anInt1580;

	@OriginalMember(owner = "client!j", name = "kd", descriptor = "I")
	public int anInt1582;

	@OriginalMember(owner = "client!j", name = "nd", descriptor = "Lclient!mb;")
	public Class45 aClass45_629;

	@OriginalMember(owner = "client!j", name = "pd", descriptor = "Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 aClass5_Sub2_Sub4_Sub2_3;

	@OriginalMember(owner = "client!j", name = "rd", descriptor = "I")
	public int anInt1586;

	@OriginalMember(owner = "client!j", name = "td", descriptor = "I")
	public int anInt1587;

	@OriginalMember(owner = "client!j", name = "ed", descriptor = "I")
	public int anInt1577 = 0;

	@OriginalMember(owner = "client!j", name = "Vc", descriptor = "I")
	public int anInt1569 = 0;

	@OriginalMember(owner = "client!j", name = "cd", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!j", name = "fd", descriptor = "I")
	public int anInt1578 = -1;

	@OriginalMember(owner = "client!j", name = "md", descriptor = "I")
	public int anInt1584 = 0;

	@OriginalMember(owner = "client!j", name = "ad", descriptor = "I")
	public int anInt1574 = -1;

	@OriginalMember(owner = "client!j", name = "Yc", descriptor = "I")
	public int anInt1572 = 0;

	@OriginalMember(owner = "client!j", name = "qd", descriptor = "I")
	public int anInt1585 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!hb;B)V")
	public void method1102(@OriginalArg(0) Class5_Sub9 arg0) {
		arg0.anInt2140 = 0;
		@Pc(10) int local10 = arg0.method1408();
		this.anInt1574 = arg0.method1447();
		this.anInt1578 = arg0.method1447();
		this.anInt1577 = 0;
		@Pc(25) int local25 = -1;
		@Pc(28) int[] local28 = new int[12];
		@Pc(46) int local46;
		@Pc(85) int local85;
		for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
			@Pc(35) int local35 = arg0.method1408();
			if (local35 == 0) {
				local28[local30] = 0;
			} else {
				local46 = arg0.method1408();
				local28[local30] = (local35 << 8) + local46;
				if (local30 == 0 && local28[0] == 65535) {
					local25 = arg0.method1418();
					break;
				}
				if (local28[local30] >= 512) {
					local85 = Static81.method1515(local28[local30] - 512).anInt274;
					if (local85 != 0) {
						this.anInt1577 = local85;
					}
				}
			}
		}
		@Pc(100) int[] local100 = new int[5];
		for (local46 = 0; local46 < 5; local46++) {
			local85 = arg0.method1408();
			if (local85 < 0 || local85 >= Static91.aShortArrayArray1[local46].length) {
				local85 = 0;
			}
			local100[local46] = local85;
		}
		super.anInt2426 = arg0.method1418();
		if (super.anInt2426 == 65535) {
			super.anInt2426 = -1;
		}
		super.anInt2412 = arg0.method1418();
		if (super.anInt2412 == 65535) {
			super.anInt2412 = -1;
		}
		super.anInt2413 = super.anInt2412;
		super.anInt2435 = arg0.method1418();
		if (super.anInt2435 == 65535) {
			super.anInt2435 = -1;
		}
		super.anInt2421 = arg0.method1418();
		if (super.anInt2421 == 65535) {
			super.anInt2421 = -1;
		}
		super.anInt2380 = arg0.method1418();
		if (super.anInt2380 == 65535) {
			super.anInt2380 = -1;
		}
		super.anInt2437 = arg0.method1418();
		if (super.anInt2437 == 65535) {
			super.anInt2437 = -1;
		}
		super.anInt2410 = arg0.method1418();
		if (super.anInt2410 == 65535) {
			super.anInt2410 = -1;
		}
		this.aClass45_629 = Static10.method217(arg0.method1436()).method1303();
		this.anInt1569 = arg0.method1408();
		this.anInt1584 = arg0.method1418();
		if (this.aClass32_2 == null) {
			this.aClass32_2 = new Class32();
		}
		this.aClass32_2.method877(local28, local25, local100, local10 == 1);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1614() {
		return this.aClass32_2 != null;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)Lclient!dd;")
	@Override
	public Class5_Sub2_Sub4_Sub2 method1612() {
		if (this.aClass32_2 == null) {
			return null;
		}
		@Pc(24) Class5_Sub2_Sub9 local24 = super.anInt2436 != -1 && super.anInt2387 == 0 ? Static63.method1252(super.anInt2436) : null;
		@Pc(46) Class5_Sub2_Sub9 local46 = super.anInt2419 == -1 || this.aBoolean79 || super.anInt2419 == super.anInt2426 && local24 != null ? null : Static63.method1252(super.anInt2419);
		@Pc(57) Class5_Sub2_Sub4_Sub2 local57 = this.aClass32_2.method874(super.anInt2420, super.anInt2425, local24, local46);
		if (local57 == null) {
			return null;
		}
		local57.method419();
		super.anInt2431 = local57.anInt2379;
		@Pc(88) Class5_Sub2_Sub4_Sub2 local88;
		@Pc(108) Class5_Sub2_Sub4_Sub2[] local108;
		if (!this.aBoolean79 && super.anInt2434 != -1 && super.anInt2414 != -1) {
			local88 = Static91.method1710(super.anInt2434).method1965(super.anInt2414);
			if (local88 != null) {
				local88.method422(0, -super.anInt2432, 0);
				local108 = new Class5_Sub2_Sub4_Sub2[] { local57, local88 };
				local57 = new Class5_Sub2_Sub4_Sub2(local108, 2);
			}
		}
		if (!this.aBoolean79 && this.aClass5_Sub2_Sub4_Sub2_3 != null) {
			if (Static3.anInt94 >= this.anInt1585) {
				this.aClass5_Sub2_Sub4_Sub2_3 = null;
			}
			if (Static3.anInt94 >= this.anInt1572 && Static3.anInt94 < this.anInt1585) {
				local88 = this.aClass5_Sub2_Sub4_Sub2_3;
				local88.method422(this.anInt1570 - super.anInt2428, this.anInt1586 + -this.anInt1573, this.anInt1580 - super.anInt2417);
				if (super.anInt2393 == 512) {
					local88.method428();
					local88.method428();
					local88.method428();
				} else if (super.anInt2393 == 1024) {
					local88.method428();
					local88.method428();
				} else if (super.anInt2393 == 1536) {
					local88.method428();
				}
				local108 = new Class5_Sub2_Sub4_Sub2[] { local57, local88 };
				local57 = new Class5_Sub2_Sub4_Sub2(local108, 2);
				if (super.anInt2393 == 512) {
					local88.method428();
				} else if (super.anInt2393 == 1024) {
					local88.method428();
					local88.method428();
				} else if (super.anInt2393 == 1536) {
					local88.method428();
					local88.method428();
					local88.method428();
				}
				local88.method422(super.anInt2428 - this.anInt1570, -this.anInt1586 + this.anInt1573, super.anInt2417 - this.anInt1580);
			}
		}
		local57.aBoolean28 = true;
		return local57;
	}
}
