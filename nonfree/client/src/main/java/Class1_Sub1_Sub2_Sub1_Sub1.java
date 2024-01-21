import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub1_Sub2_Sub1_Sub1 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!dd", name = "cd", descriptor = "Lclient!vc;")
	public Class1_Sub1_Sub16 aClass1_Sub1_Sub16_1;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1387() {
		return this.aClass1_Sub1_Sub16_1 != null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class1_Sub1_Sub2_Sub6 method1415() {
		if (this.aClass1_Sub1_Sub16_1 == null) {
			return null;
		}
		@Pc(26) Class1_Sub1_Sub8 local26 = super.anInt2213 != -1 && super.anInt2205 == 0 ? Static18.method249(super.anInt2213) : null;
		@Pc(49) Class1_Sub1_Sub8 local49 = super.anInt2184 == -1 || super.anInt2184 == super.anInt2225 && local26 != null ? null : Static18.method249(super.anInt2184);
		@Pc(60) Class1_Sub1_Sub2_Sub6 local60 = this.aClass1_Sub1_Sub16_1.method1821(super.anInt2201, local49, super.anInt2200, local26);
		if (local60 == null) {
			return null;
		}
		local60.method1443();
		super.anInt2217 = local60.anInt2285;
		if (super.anInt2222 != -1 && super.anInt2206 != -1) {
			@Pc(92) Class1_Sub1_Sub2_Sub6 local92 = Static48.method985(super.anInt2222).method889(super.anInt2206);
			if (local92 != null) {
				@Pc(105) Class1_Sub1_Sub2_Sub6[] local105 = new Class1_Sub1_Sub2_Sub6[] { local60, local92 };
				local92.method1424(0, -super.anInt2198, 0);
				local60 = new Class1_Sub1_Sub2_Sub6(local105, 2, true);
			}
		}
		if (this.aClass1_Sub1_Sub16_1.anInt2749 == 1) {
			local60.aBoolean107 = true;
		}
		return local60;
	}
}
