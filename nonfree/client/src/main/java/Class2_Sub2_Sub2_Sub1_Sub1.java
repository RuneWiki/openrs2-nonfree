import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub2_Sub2_Sub1_Sub1 extends Class2_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!q", name = "Vc", descriptor = "Lclient!hf;")
	public Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method1861() {
		return this.aClass2_Sub2_Sub9_1 != null;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lclient!na;")
	@Override
	public Class2_Sub2_Sub2_Sub5 method1855() {
		if (this.aClass2_Sub2_Sub9_1 == null) {
			return null;
		}
		@Pc(25) Class2_Sub2_Sub11 local25 = super.anInt2670 != -1 && super.anInt2675 == 0 ? Static12.method270(super.anInt2670) : null;
		@Pc(44) Class2_Sub2_Sub11 local44 = super.anInt2663 == -1 || super.anInt2663 == super.anInt2722 && local25 != null ? null : Static12.method270(super.anInt2663);
		@Pc(55) Class2_Sub2_Sub2_Sub5 local55 = this.aClass2_Sub2_Sub9_1.method764(local44, super.anInt2690, super.anInt2666, local25);
		if (local55 == null) {
			return null;
		}
		local55.method1133();
		super.anInt2668 = local55.anInt2656;
		if (super.anInt2660 != -1 && super.anInt2696 != -1) {
			@Pc(82) Class2_Sub2_Sub2_Sub5 local82 = Static38.method653(super.anInt2660).method341(super.anInt2696);
			if (local82 != null) {
				local82.method1138(0, -super.anInt2685, 0);
				@Pc(102) Class2_Sub2_Sub2_Sub5[] local102 = new Class2_Sub2_Sub2_Sub5[] { local55, local82 };
				local55 = new Class2_Sub2_Sub2_Sub5(local102, 2);
			}
		}
		if (this.aClass2_Sub2_Sub9_1.anInt1103 == 1) {
			local55.aBoolean63 = true;
		}
		return local55;
	}
}
