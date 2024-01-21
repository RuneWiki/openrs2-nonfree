import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class6_Sub3_Sub1_Sub2_Sub1 extends Class6_Sub3_Sub1_Sub2 {

	@OriginalMember(owner = "client!f", name = "Xc", descriptor = "Lclient!cb;")
	public Class6_Sub3_Sub2 aClass6_Sub3_Sub2_1;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)Lclient!df;")
	@Override
	public Class6_Sub3_Sub1_Sub3 method2062() {
		if (this.aClass6_Sub3_Sub2_1 == null) {
			return null;
		}
		@Pc(28) Class6_Sub3_Sub7 local28 = super.anInt2307 != -1 && super.anInt2314 == 0 ? Static30.method721(super.anInt2307) : null;
		@Pc(47) Class6_Sub3_Sub7 local47 = super.anInt2308 == -1 || super.anInt2308 == super.anInt2328 && local28 != null ? null : Static30.method721(super.anInt2308);
		@Pc(58) Class6_Sub3_Sub1_Sub3 local58 = this.aClass6_Sub3_Sub2_1.method370(super.anInt2298, local47, local28, super.anInt2329);
		if (local58 == null) {
			return null;
		}
		local58.method632();
		super.anInt2349 = local58.anInt3082;
		if (super.anInt2334 != -1 && super.anInt2342 != -1) {
			@Pc(85) Class6_Sub3_Sub1_Sub3 local85 = Static55.method1124(super.anInt2334).method1417(super.anInt2342);
			if (local85 != null) {
				local85.method637(0, -super.anInt2327, 0);
				@Pc(105) Class6_Sub3_Sub1_Sub3[] local105 = new Class6_Sub3_Sub1_Sub3[] { local58, local85 };
				local58 = new Class6_Sub3_Sub1_Sub3(local105, 2);
			}
		}
		if (this.aClass6_Sub3_Sub2_1.anInt466 == 1) {
			local58.aBoolean43 = true;
		}
		return local58;
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method1545() {
		return this.aClass6_Sub3_Sub2_1 != null;
	}
}
