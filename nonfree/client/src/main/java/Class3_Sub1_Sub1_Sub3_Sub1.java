import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class3_Sub1_Sub1_Sub3_Sub1 extends Class3_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!cf", name = "Pc", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!cf", name = "Tc", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!cf", name = "Yc", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!cf", name = "ad", descriptor = "I")
	public int anInt630;

	@OriginalMember(owner = "client!cf", name = "dd", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!cf", name = "gd", descriptor = "Lclient!ob;")
	public Class50 aClass50_1;

	@OriginalMember(owner = "client!cf", name = "hd", descriptor = "Lclient!qf;")
	public Class60 aClass60_245;

	@OriginalMember(owner = "client!cf", name = "id", descriptor = "Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!cf", name = "jd", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!cf", name = "rd", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!cf", name = "yd", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!cf", name = "Qc", descriptor = "I")
	public int anInt622 = 0;

	@OriginalMember(owner = "client!cf", name = "bd", descriptor = "I")
	public int anInt631 = 0;

	@OriginalMember(owner = "client!cf", name = "sd", descriptor = "I")
	public int anInt639 = -1;

	@OriginalMember(owner = "client!cf", name = "Sc", descriptor = "I")
	public int anInt624 = 0;

	@OriginalMember(owner = "client!cf", name = "od", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!cf", name = "qd", descriptor = "I")
	public int anInt637 = 0;

	@OriginalMember(owner = "client!cf", name = "Uc", descriptor = "I")
	public int anInt626 = 0;

	@OriginalMember(owner = "client!cf", name = "Xc", descriptor = "I")
	public int anInt628 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!la;I)V")
	public void method431(@OriginalArg(0) Class3_Sub12 arg0) {
		arg0.anInt2886 = 0;
		@Pc(12) int local12 = arg0.method1936();
		this.anInt628 = arg0.method1958();
		@Pc(28) int[] local28 = new int[12];
		@Pc(30) int local30 = -1;
		this.anInt639 = arg0.method1958();
		this.anInt637 = 0;
		@Pc(58) int local58;
		@Pc(95) int local95;
		for (@Pc(40) int local40 = 0; local40 < 12; local40++) {
			@Pc(46) int local46 = arg0.method1936();
			if (local46 == 0) {
				local28[local40] = 0;
			} else {
				local58 = arg0.method1936();
				local28[local40] = (local46 << 8) + local58;
				if (local40 == 0 && local28[0] == 65535) {
					local30 = arg0.method1963();
					break;
				}
				if (local28[local40] >= 512) {
					local95 = Static22.method568(local28[local40] - 512).anInt1853;
					if (local95 != 0) {
						this.anInt637 = local95;
					}
				}
			}
		}
		@Pc(112) int[] local112 = new int[5];
		for (local58 = 0; local58 < 5; local58++) {
			local95 = arg0.method1936();
			if (local95 < 0 || Static66.aShortArrayArray1[local58].length <= local95) {
				local95 = 0;
			}
			local112[local58] = local95;
		}
		super.anInt1539 = arg0.method1963();
		if (super.anInt1539 == 65535) {
			super.anInt1539 = -1;
		}
		super.anInt1505 = arg0.method1963();
		if (super.anInt1505 == 65535) {
			super.anInt1505 = -1;
		}
		super.anInt1484 = super.anInt1505;
		super.anInt1511 = arg0.method1963();
		if (super.anInt1511 == 65535) {
			super.anInt1511 = -1;
		}
		super.anInt1520 = arg0.method1963();
		if (super.anInt1520 == 65535) {
			super.anInt1520 = -1;
		}
		super.anInt1492 = arg0.method1963();
		if (super.anInt1492 == 65535) {
			super.anInt1492 = -1;
		}
		super.anInt1490 = arg0.method1963();
		if (super.anInt1490 == 65535) {
			super.anInt1490 = -1;
		}
		super.anInt1522 = arg0.method1963();
		if (super.anInt1522 == 65535) {
			super.anInt1522 = -1;
		}
		this.aClass60_245 = Static97.method1821(arg0.method1952()).method1866();
		this.anInt622 = arg0.method1936();
		this.anInt631 = arg0.method1963();
		if (this.aClass50_1 == null) {
			this.aClass50_1 = new Class50();
		}
		this.aClass50_1.method1635(local12 == 1, local112, local28, local30);
	}

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)Lclient!ea;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method2225() {
		if (this.aClass50_1 == null) {
			return null;
		}
		@Pc(27) Class3_Sub1_Sub14 local27 = super.anInt1538 != -1 && super.anInt1521 == 0 ? Static109.method2054(super.anInt1538) : null;
		@Pc(54) Class3_Sub1_Sub14 local54 = super.anInt1486 == -1 || this.aBoolean22 || super.anInt1486 == super.anInt1539 && local27 != null ? null : Static109.method2054(super.anInt1486);
		@Pc(65) Class3_Sub1_Sub1_Sub4 local65 = this.aClass50_1.method1639(super.anInt1489, local27, super.anInt1485, local54);
		if (local65 == null) {
			return null;
		}
		local65.method628();
		super.anInt1496 = local65.anInt3333;
		@Pc(102) Class3_Sub1_Sub1_Sub4 local102;
		@Pc(122) Class3_Sub1_Sub1_Sub4[] local122;
		if (!this.aBoolean22 && super.anInt1536 != -1 && super.anInt1495 != -1) {
			local102 = Static105.method2024(super.anInt1536).method1055(super.anInt1495);
			if (local102 != null) {
				local102.method631(0, -super.anInt1510, 0);
				local122 = new Class3_Sub1_Sub1_Sub4[] { local65, local102 };
				local65 = new Class3_Sub1_Sub1_Sub4(local122, 2);
			}
		}
		if (!this.aBoolean22 && this.aClass3_Sub1_Sub1_Sub4_1 != null) {
			if (this.anInt626 <= Static34.anInt1183) {
				this.aClass3_Sub1_Sub1_Sub4_1 = null;
			}
			if (this.anInt624 <= Static34.anInt1183 && Static34.anInt1183 < this.anInt626) {
				local102 = this.aClass3_Sub1_Sub1_Sub4_1;
				local102.method631(this.anInt632 - super.anInt1524, this.anInt629 + -this.anInt634, this.anInt625 - super.anInt1494);
				local122 = new Class3_Sub1_Sub1_Sub4[] { local65, local102 };
				if (super.anInt1501 == 512) {
					local102.method633();
					local102.method633();
					local102.method633();
				} else if (super.anInt1501 == 1024) {
					local102.method633();
					local102.method633();
				} else if (super.anInt1501 == 1536) {
					local102.method633();
				}
				local65 = new Class3_Sub1_Sub1_Sub4(local122, 2);
				if (super.anInt1501 == 512) {
					local102.method633();
				} else if (super.anInt1501 == 1024) {
					local102.method633();
					local102.method633();
				} else if (super.anInt1501 == 1536) {
					local102.method633();
					local102.method633();
					local102.method633();
				}
				local102.method631(super.anInt1524 - this.anInt632, this.anInt634 - this.anInt629, super.anInt1494 - this.anInt625);
			}
		}
		local65.aBoolean29 = true;
		return local65;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method1023() {
		return this.aClass50_1 != null;
	}
}
