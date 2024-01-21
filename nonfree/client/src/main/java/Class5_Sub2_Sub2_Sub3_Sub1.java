import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class5_Sub2_Sub2_Sub3_Sub1 extends Class5_Sub2_Sub2_Sub3 {

	@OriginalMember(owner = "client!m", name = "Bc", descriptor = "Lclient!pf;")
	public Class5_Sub2_Sub12 aClass5_Sub2_Sub12_1;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1855() {
		return this.aClass5_Sub2_Sub12_1 != null;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Lclient!wb;")
	@Override
	public Class5_Sub2_Sub2_Sub6 method2178() {
		if (this.aClass5_Sub2_Sub12_1 == null) {
			return null;
		}
		@Pc(25) Class5_Sub2_Sub17 local25 = super.anInt2903 != -1 && super.anInt2904 == 0 ? Static106.method1769(super.anInt2903) : null;
		@Pc(43) Class5_Sub2_Sub17 local43 = super.anInt2916 == -1 || super.anInt2917 == super.anInt2916 && local25 != null ? null : Static106.method1769(super.anInt2916);
		@Pc(59) Class5_Sub2_Sub2_Sub6 local59 = this.aClass5_Sub2_Sub12_1.method1636(super.anInt2882, local25, local43, super.anInt2880);
		if (local59 == null) {
			return null;
		}
		local59.method2141();
		super.anInt2910 = local59.anInt3358;
		if (super.anInt2893 != -1 && super.anInt2932 != -1) {
			@Pc(87) Class5_Sub2_Sub2_Sub6 local87 = Static1.method2(super.anInt2893).method850(super.anInt2932);
			if (local87 != null) {
				local87.method2159(0, -super.anInt2921, 0);
				@Pc(107) Class5_Sub2_Sub2_Sub6[] local107 = new Class5_Sub2_Sub2_Sub6[] { local59, local87 };
				local59 = new Class5_Sub2_Sub2_Sub6(local107, 2);
			}
		}
		if (this.aClass5_Sub2_Sub12_1.anInt2511 == 1) {
			local59.aBoolean120 = true;
		}
		return local59;
	}
}
