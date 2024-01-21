import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class4_Sub2_Sub1_Sub1_Sub2 extends Class4_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!se", name = "ud", descriptor = "Lclient!ua;")
	public Class4_Sub2_Sub16 aClass4_Sub2_Sub16_1;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method1915() {
		return this.aClass4_Sub2_Sub16_1 != null;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(B)Lclient!vb;")
	@Override
	public Class4_Sub2_Sub1_Sub6 method2172() {
		if (this.aClass4_Sub2_Sub16_1 == null) {
			return null;
		}
		@Pc(33) Class4_Sub2_Sub2 local33 = super.anInt2678 != -1 && super.anInt2659 == 0 ? Static116.method2017(super.anInt2678) : null;
		@Pc(55) Class4_Sub2_Sub2 local55 = super.anInt2691 == -1 || super.anInt2679 == super.anInt2691 && local33 != null ? null : Static116.method2017(super.anInt2691);
		@Pc(66) Class4_Sub2_Sub1_Sub6 local66 = this.aClass4_Sub2_Sub16_1.method2046(local33, super.anInt2671, super.anInt2663, local55);
		if (local66 == null) {
			return null;
		}
		local66.method2150();
		super.anInt2667 = local66.anInt3118;
		if (super.anInt2692 != -1 && super.anInt2684 != -1) {
			@Pc(96) Class4_Sub2_Sub1_Sub6 local96 = Static35.method590(super.anInt2692).method1843(super.anInt2684);
			if (local96 != null) {
				local96.method2146(0, -super.anInt2693, 0);
				@Pc(116) Class4_Sub2_Sub1_Sub6[] local116 = new Class4_Sub2_Sub1_Sub6[] { local66, local96 };
				local66 = new Class4_Sub2_Sub1_Sub6(local116, 2);
			}
		}
		if (this.aClass4_Sub2_Sub16_1.anInt2922 == 1) {
			local66.aBoolean152 = true;
		}
		return local66;
	}
}
