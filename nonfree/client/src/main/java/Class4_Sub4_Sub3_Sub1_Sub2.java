import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class4_Sub4_Sub3_Sub1_Sub2 extends Class4_Sub4_Sub3_Sub1 {

	@OriginalMember(owner = "client!je", name = "Ac", descriptor = "I")
	public int anInt1440;

	@OriginalMember(owner = "client!je", name = "Cc", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!je", name = "Dc", descriptor = "I")
	public int anInt1443;

	@OriginalMember(owner = "client!je", name = "Hc", descriptor = "Lclient!v;")
	public Class76 aClass76_612;

	@OriginalMember(owner = "client!je", name = "Jc", descriptor = "I")
	public int anInt1446;

	@OriginalMember(owner = "client!je", name = "Lc", descriptor = "Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 aClass4_Sub4_Sub3_Sub7_1;

	@OriginalMember(owner = "client!je", name = "Mc", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!je", name = "Vc", descriptor = "I")
	public int anInt1454;

	@OriginalMember(owner = "client!je", name = "Yc", descriptor = "I")
	public int anInt1456;

	@OriginalMember(owner = "client!je", name = "md", descriptor = "Lclient!ff;")
	public Class26 aClass26_3;

	@OriginalMember(owner = "client!je", name = "pd", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!je", name = "Kc", descriptor = "I")
	public int anInt1447 = 0;

	@OriginalMember(owner = "client!je", name = "Rc", descriptor = "I")
	public int anInt1452 = 0;

	@OriginalMember(owner = "client!je", name = "Sc", descriptor = "I")
	public int anInt1453 = -1;

	@OriginalMember(owner = "client!je", name = "cd", descriptor = "I")
	public int anInt1459 = -1;

	@OriginalMember(owner = "client!je", name = "Bc", descriptor = "I")
	public int anInt1441 = 0;

	@OriginalMember(owner = "client!je", name = "jd", descriptor = "I")
	public int anInt1462 = 0;

	@OriginalMember(owner = "client!je", name = "id", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!je", name = "hd", descriptor = "I")
	public int anInt1461 = 0;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Lclient!u;")
	@Override
	public Class4_Sub4_Sub3_Sub7 method1754() {
		if (this.aClass26_3 == null) {
			return null;
		}
		@Pc(25) Class4_Sub4_Sub9 local25 = super.anInt1390 != -1 && super.anInt1417 == 0 ? Static118.method1796(super.anInt1390) : null;
		@Pc(51) Class4_Sub4_Sub9 local51 = super.anInt1432 == -1 || this.aBoolean84 || super.anInt1389 == super.anInt1432 && local25 != null ? null : Static118.method1796(super.anInt1432);
		@Pc(62) Class4_Sub4_Sub3_Sub7 local62 = this.aClass26_3.method629(local51, local25, super.anInt1385, super.anInt1419);
		if (local62 == null) {
			return null;
		}
		local62.method1767();
		super.anInt1400 = local62.anInt2514;
		@Pc(92) Class4_Sub4_Sub3_Sub7 local92;
		@Pc(112) Class4_Sub4_Sub3_Sub7[] local112;
		if (!this.aBoolean84 && super.anInt1439 != -1 && super.anInt1428 != -1) {
			local92 = Static84.method1424(super.anInt1439).method1545(super.anInt1428);
			if (local92 != null) {
				local92.method1773(0, -super.anInt1401, 0);
				local112 = new Class4_Sub4_Sub3_Sub7[] { local62, local92 };
				local62 = new Class4_Sub4_Sub3_Sub7(local112, 2);
			}
		}
		if (!this.aBoolean84 && this.aClass4_Sub4_Sub3_Sub7_1 != null) {
			if (this.anInt1447 <= Static78.anInt1981) {
				this.aClass4_Sub4_Sub3_Sub7_1 = null;
			}
			if (Static78.anInt1981 >= this.anInt1462 && Static78.anInt1981 < this.anInt1447) {
				local92 = this.aClass4_Sub4_Sub3_Sub7_1;
				local92.method1773(this.anInt1448 - super.anInt1393, -this.anInt1456 + this.anInt1446, this.anInt1454 - super.anInt1416);
				local112 = new Class4_Sub4_Sub3_Sub7[] { local62, local92 };
				if (super.anInt1409 == 512) {
					local92.method1765();
					local92.method1765();
					local92.method1765();
				} else if (super.anInt1409 == 1024) {
					local92.method1765();
					local92.method1765();
				} else if (super.anInt1409 == 1536) {
					local92.method1765();
				}
				local62 = new Class4_Sub4_Sub3_Sub7(local112, 2);
				if (super.anInt1409 == 512) {
					local92.method1765();
				} else if (super.anInt1409 == 1024) {
					local92.method1765();
					local92.method1765();
				} else if (super.anInt1409 == 1536) {
					local92.method1765();
					local92.method1765();
					local92.method1765();
				}
				local92.method1773(super.anInt1393 - this.anInt1448, -this.anInt1446 + this.anInt1456, super.anInt1416 - this.anInt1454);
			}
		}
		local62.aBoolean147 = true;
		return local62;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ne;I)V")
	public void method977(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.anInt931 = 0;
		@Pc(12) int local12 = arg0.method599();
		@Pc(14) int local14 = -1;
		this.anInt1453 = arg0.method579();
		@Pc(22) int[] local22 = new int[12];
		this.anInt1459 = arg0.method579();
		this.anInt1452 = 0;
		@Pc(53) int local53;
		@Pc(90) int local90;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method599();
			if (local38 == 0) {
				local22[local32] = 0;
			} else {
				local53 = arg0.method599();
				local22[local32] = local53 + (local38 << 8);
				if (local32 == 0 && local22[0] == 65535) {
					local14 = arg0.method604();
					break;
				}
				if (local22[local32] >= 512) {
					local90 = Static61.method1040(local22[local32] - 512).anInt1245;
					if (local90 != 0) {
						this.anInt1452 = local90;
					}
				}
			}
		}
		@Pc(104) int[] local104 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local90 = arg0.method599();
			if (local90 < 0 || local90 >= Static106.aShortArrayArray5[local53].length) {
				local90 = 0;
			}
			local104[local53] = local90;
		}
		super.anInt1389 = arg0.method604();
		if (super.anInt1389 == 65535) {
			super.anInt1389 = -1;
		}
		super.anInt1384 = arg0.method604();
		if (super.anInt1384 == 65535) {
			super.anInt1384 = -1;
		}
		super.anInt1430 = super.anInt1384;
		super.anInt1435 = arg0.method604();
		if (super.anInt1435 == 65535) {
			super.anInt1435 = -1;
		}
		super.anInt1412 = arg0.method604();
		if (super.anInt1412 == 65535) {
			super.anInt1412 = -1;
		}
		super.anInt1426 = arg0.method604();
		if (super.anInt1426 == 65535) {
			super.anInt1426 = -1;
		}
		super.anInt1388 = arg0.method604();
		if (super.anInt1388 == 65535) {
			super.anInt1388 = -1;
		}
		super.anInt1424 = arg0.method604();
		if (super.anInt1424 == 65535) {
			super.anInt1424 = -1;
		}
		this.aClass76_612 = Static56.method983(arg0.method605()).method1858();
		this.anInt1461 = arg0.method599();
		this.anInt1441 = arg0.method604();
		if (this.aClass26_3 == null) {
			this.aClass26_3 = new Class26();
		}
		this.aClass26_3.method633(local104, local14, local22, local12 == 1);
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method969() {
		return this.aClass26_3 != null;
	}
}
