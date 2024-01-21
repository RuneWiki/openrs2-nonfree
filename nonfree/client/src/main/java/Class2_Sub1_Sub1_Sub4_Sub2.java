import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub1_Sub1_Sub4_Sub2 extends Class2_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!pd", name = "Hc", descriptor = "Lclient!qb;")
	public Class2_Sub1_Sub12 aClass2_Sub1_Sub12_1;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method1466() {
		return this.aClass2_Sub1_Sub12_1 != null;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Lclient!wb;")
	@Override
	public Class2_Sub1_Sub1_Sub7 method1996() {
		if (this.aClass2_Sub1_Sub12_1 == null) {
			return null;
		}
		@Pc(23) Class2_Sub1_Sub2 local23 = super.anInt1972 != -1 && super.anInt1936 == 0 ? Static23.method1313(super.anInt1972) : null;
		@Pc(45) Class2_Sub1_Sub2 local45 = super.anInt1920 == -1 || super.anInt1920 == super.anInt1964 && local23 != null ? null : Static23.method1313(super.anInt1920);
		@Pc(56) Class2_Sub1_Sub1_Sub7 local56 = this.aClass2_Sub1_Sub12_1.method1560(super.anInt1926, local23, local45, super.anInt1970);
		if (local56 == null) {
			return null;
		}
		local56.method2006();
		super.anInt1942 = local56.anInt2855;
		if (super.anInt1975 != -1 && super.anInt1924 != -1) {
			@Pc(88) Class2_Sub1_Sub1_Sub7 local88 = Static69.method1228(super.anInt1975).method1224(super.anInt1924);
			if (local88 != null) {
				local88.method1998(0, -super.anInt1921, 0);
				@Pc(108) Class2_Sub1_Sub1_Sub7[] local108 = new Class2_Sub1_Sub1_Sub7[] { local56, local88 };
				local56 = new Class2_Sub1_Sub1_Sub7(local108, 2);
			}
		}
		if (this.aClass2_Sub1_Sub12_1.anInt2142 == 1) {
			local56.aBoolean130 = true;
		}
		return local56;
	}
}
