import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class3_Sub1_Sub2_Sub4_Sub2 extends Class3_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!wd", name = "Rc", descriptor = "Lclient!uc;")
	public Class3_Sub1_Sub17 aClass3_Sub1_Sub17_1;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)Lclient!t;")
	@Override
	public Class3_Sub1_Sub2_Sub6 method2028() {
		if (this.aClass3_Sub1_Sub17_1 == null) {
			return null;
		}
		@Pc(22) Class3_Sub1_Sub4 local22 = super.anInt3149 != -1 && super.anInt3144 == 0 ? Static41.method770(super.anInt3149) : null;
		@Pc(40) Class3_Sub1_Sub4 local40 = super.anInt3186 == -1 || super.anInt3162 == super.anInt3186 && local22 != null ? null : Static41.method770(super.anInt3186);
		@Pc(51) Class3_Sub1_Sub2_Sub6 local51 = this.aClass3_Sub1_Sub17_1.method1897(super.anInt3175, local40, super.anInt3166, local22);
		if (local51 == null) {
			return null;
		}
		local51.method1798();
		super.anInt3181 = local51.anInt3141;
		if (super.anInt3198 != -1 && super.anInt3163 != -1) {
			@Pc(83) Class3_Sub1_Sub2_Sub6 local83 = Static43.method800(super.anInt3198).method341(super.anInt3163);
			if (local83 != null) {
				local83.method1783(0, -super.anInt3178, 0);
				@Pc(103) Class3_Sub1_Sub2_Sub6[] local103 = new Class3_Sub1_Sub2_Sub6[] { local51, local83 };
				local51 = new Class3_Sub1_Sub2_Sub6(local103, 2);
			}
		}
		if (this.aClass3_Sub1_Sub17_1.anInt2927 == 1) {
			local51.aBoolean125 = true;
		}
		return local51;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2033() {
		return this.aClass3_Sub1_Sub17_1 != null;
	}
}
