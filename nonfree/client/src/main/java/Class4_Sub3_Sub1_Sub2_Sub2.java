import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class4_Sub3_Sub1_Sub2_Sub2 extends Class4_Sub3_Sub1_Sub2 {

	@OriginalMember(owner = "client!j", name = "wc", descriptor = "Lclient!qd;")
	public Class4_Sub3_Sub13 aClass4_Sub3_Sub13_1;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class4_Sub3_Sub1_Sub7 method1484() {
		if (this.aClass4_Sub3_Sub13_1 == null) {
			return null;
		}
		@Pc(27) Class4_Sub3_Sub10 local27 = super.anInt1408 != -1 && super.anInt1411 == 0 ? Static7.method63(super.anInt1408) : null;
		@Pc(46) Class4_Sub3_Sub10 local46 = super.anInt1389 == -1 || super.anInt1399 == super.anInt1389 && local27 != null ? null : Static7.method63(super.anInt1389);
		@Pc(57) Class4_Sub3_Sub1_Sub7 local57 = this.aClass4_Sub3_Sub13_1.method1521(local27, local46, super.anInt1409, super.anInt1421);
		if (local57 == null) {
			return null;
		}
		local57.method1493();
		super.anInt1419 = local57.anInt2166;
		if (super.anInt1416 != -1 && super.anInt1431 != -1) {
			@Pc(84) Class4_Sub3_Sub1_Sub7 local84 = Static46.method642(super.anInt1416).method417(super.anInt1431);
			if (local84 != null) {
				local84.method1505(0, -super.anInt1432, 0);
				@Pc(104) Class4_Sub3_Sub1_Sub7[] local104 = new Class4_Sub3_Sub1_Sub7[] { local57, local84 };
				local57 = new Class4_Sub3_Sub1_Sub7(local104, 2);
			}
		}
		if (this.aClass4_Sub3_Sub13_1.anInt2214 == 1) {
			local57.aBoolean76 = true;
		}
		return local57;
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method852() {
		return this.aClass4_Sub3_Sub13_1 != null;
	}
}
