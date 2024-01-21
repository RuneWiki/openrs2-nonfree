import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class5_Sub1_Sub1_Sub3_Sub1 extends Class5_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!i", name = "Sc", descriptor = "Lclient!ve;")
	public Class5_Sub1_Sub16 aClass5_Sub1_Sub16_1;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1680() {
		return this.aClass5_Sub1_Sub16_1 != null;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class5_Sub1_Sub1_Sub2 method1976() {
		if (this.aClass5_Sub1_Sub16_1 == null) {
			return null;
		}
		@Pc(25) Class5_Sub1_Sub18 local25 = super.anInt2458 != -1 && super.anInt2471 == 0 ? Static57.method1017(super.anInt2458) : null;
		@Pc(44) Class5_Sub1_Sub18 local44 = super.anInt2470 == -1 || super.anInt2487 == super.anInt2470 && local25 != null ? null : Static57.method1017(super.anInt2470);
		@Pc(55) Class5_Sub1_Sub1_Sub2 local55 = this.aClass5_Sub1_Sub16_1.method1888(local44, super.anInt2482, local25, super.anInt2446);
		if (local55 == null) {
			return null;
		}
		local55.method232();
		super.anInt2451 = local55.anInt2987;
		if (super.anInt2459 != -1 && super.anInt2464 != -1) {
			@Pc(84) Class5_Sub1_Sub1_Sub2 local84 = Static109.method1740(super.anInt2459).method1435(super.anInt2464);
			if (local84 != null) {
				local84.method249(0, -super.anInt2432, 0);
				@Pc(104) Class5_Sub1_Sub1_Sub2[] local104 = new Class5_Sub1_Sub1_Sub2[] { local55, local84 };
				local55 = new Class5_Sub1_Sub1_Sub2(local104, 2);
			}
		}
		if (this.aClass5_Sub1_Sub16_1.anInt2819 == 1) {
			local55.aBoolean8 = true;
		}
		return local55;
	}
}
