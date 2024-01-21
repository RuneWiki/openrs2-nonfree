import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub1_Sub1_Sub3_Sub2 extends Class3_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!ib", name = "Qc", descriptor = "Lclient!tc;")
	public Class3_Sub1_Sub16 aClass3_Sub1_Sub16_1;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "(I)Lclient!ea;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method2225() {
		if (this.aClass3_Sub1_Sub16_1 == null) {
			return null;
		}
		@Pc(25) Class3_Sub1_Sub14 local25 = super.anInt1538 != -1 && super.anInt1521 == 0 ? Static109.method2054(super.anInt1538) : null;
		@Pc(47) Class3_Sub1_Sub14 local47 = super.anInt1486 == -1 || super.anInt1486 == super.anInt1539 && local25 != null ? null : Static109.method2054(super.anInt1486);
		@Pc(58) Class3_Sub1_Sub1_Sub4 local58 = this.aClass3_Sub1_Sub16_1.method2091(local25, local47, super.anInt1485, super.anInt1489);
		if (local58 == null) {
			return null;
		}
		local58.method628();
		super.anInt1496 = local58.anInt3333;
		if (super.anInt1536 != -1 && super.anInt1495 != -1) {
			@Pc(92) Class3_Sub1_Sub1_Sub4 local92 = Static105.method2024(super.anInt1536).method1055(super.anInt1495);
			if (local92 != null) {
				local92.method631(0, -super.anInt1510, 0);
				@Pc(112) Class3_Sub1_Sub1_Sub4[] local112 = new Class3_Sub1_Sub1_Sub4[] { local58, local92 };
				local58 = new Class3_Sub1_Sub1_Sub4(local112, 2);
			}
		}
		if (this.aClass3_Sub1_Sub16_1.anInt3167 == 1) {
			local58.aBoolean29 = true;
		}
		return local58;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method1023() {
		return this.aClass3_Sub1_Sub16_1 != null;
	}
}
