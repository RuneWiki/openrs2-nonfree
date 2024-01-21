import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub1_Sub1_Sub5_Sub1 extends Class1_Sub1_Sub1_Sub5 {

	@OriginalMember(owner = "client!hb", name = "Vc", descriptor = "Lclient!id;")
	public Class1_Sub1_Sub5 aClass1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)Lclient!lb;")
	@Override
	public Class1_Sub1_Sub1_Sub6 method1897() {
		if (this.aClass1_Sub1_Sub5_1 == null) {
			return null;
		}
		@Pc(25) Class1_Sub1_Sub15 local25 = super.anInt1266 != -1 && super.anInt1257 == 0 ? Static56.method1247(super.anInt1266) : null;
		@Pc(44) Class1_Sub1_Sub15 local44 = super.anInt1247 == -1 || super.anInt1288 == super.anInt1247 && local25 != null ? null : Static56.method1247(super.anInt1247);
		@Pc(60) Class1_Sub1_Sub1_Sub6 local60 = this.aClass1_Sub1_Sub5_1.method1048(local25, super.anInt1244, super.anInt1259, local44);
		if (local60 == null) {
			return null;
		}
		local60.method1338();
		super.anInt1245 = local60.anInt2699;
		if (super.anInt1255 != -1 && super.anInt1279 != -1) {
			@Pc(92) Class1_Sub1_Sub1_Sub6 local92 = Static122.method1994(super.anInt1255).method1643(super.anInt1279);
			if (local92 != null) {
				local92.method1337(0, -super.anInt1249, 0);
				@Pc(112) Class1_Sub1_Sub1_Sub6[] local112 = new Class1_Sub1_Sub1_Sub6[] { local60, local92 };
				local60 = new Class1_Sub1_Sub1_Sub6(local112, 2);
			}
		}
		if (this.aClass1_Sub1_Sub5_1.anInt1474 == 1) {
			local60.aBoolean75 = true;
		}
		return local60;
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method931() {
		return this.aClass1_Sub1_Sub5_1 != null;
	}
}
