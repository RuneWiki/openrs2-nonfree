import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub1_Sub4_Sub2_Sub1 extends Class2_Sub1_Sub4_Sub2 {

	@OriginalMember(owner = "client!kb", name = "Oc", descriptor = "Lclient!lc;")
	public Class2_Sub1_Sub9 aClass2_Sub1_Sub9_1;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)Lclient!fd;")
	@Override
	public Class2_Sub1_Sub4_Sub1 method2031() {
		if (this.aClass2_Sub1_Sub9_1 == null) {
			return null;
		}
		@Pc(25) Class2_Sub1_Sub14 local25 = super.anInt2168 != -1 && super.anInt2162 == 0 ? Static56.method1045(super.anInt2168) : null;
		@Pc(48) Class2_Sub1_Sub14 local48 = super.anInt2181 == -1 || super.anInt2200 == super.anInt2181 && local25 != null ? null : Static56.method1045(super.anInt2181);
		@Pc(59) Class2_Sub1_Sub4_Sub1 local59 = this.aClass2_Sub1_Sub9_1.method1072(super.anInt2147, local25, local48, super.anInt2174);
		if (local59 == null) {
			return null;
		}
		local59.method662();
		super.anInt2166 = local59.anInt2916;
		if (super.anInt2152 != -1 && super.anInt2151 != -1) {
			@Pc(94) Class2_Sub1_Sub4_Sub1 local94 = Static99.method1476(super.anInt2152).method1152(super.anInt2151);
			if (local94 != null) {
				@Pc(107) Class2_Sub1_Sub4_Sub1[] local107 = new Class2_Sub1_Sub4_Sub1[] { local59, local94 };
				local94.method677(0, -super.anInt2178, 0);
				local59 = new Class2_Sub1_Sub4_Sub1(local107, 2, true);
			}
		}
		if (this.aClass2_Sub1_Sub9_1.anInt1528 == 1) {
			local59.aBoolean45 = true;
		}
		return local59;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1554() {
		return this.aClass2_Sub1_Sub9_1 != null;
	}
}
