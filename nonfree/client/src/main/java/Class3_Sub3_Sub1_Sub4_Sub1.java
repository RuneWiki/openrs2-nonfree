import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class3_Sub3_Sub1_Sub4_Sub1 extends Class3_Sub3_Sub1_Sub4 {

	@OriginalMember(owner = "client!hd", name = "dd", descriptor = "Lclient!ha;")
	public Class3_Sub3_Sub3 aClass3_Sub3_Sub3_1;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Lclient!de;")
	@Override
	protected Class3_Sub3_Sub1_Sub1 method1667() {
		if (this.aClass3_Sub3_Sub3_1 == null) {
			return null;
		}
		@Pc(23) Class3_Sub3_Sub14 local23 = super.anInt2430 != -1 && super.anInt2388 == 0 ? Static16.method298(super.anInt2430) : null;
		@Pc(46) Class3_Sub3_Sub14 local46 = super.anInt2390 == -1 || super.anInt2410 == super.anInt2390 && local23 != null ? null : Static16.method298(super.anInt2390);
		@Pc(57) Class3_Sub3_Sub1_Sub1 local57 = this.aClass3_Sub3_Sub3_1.method719(local23, super.anInt2397, super.anInt2376, local46);
		if (local57 == null) {
			return null;
		}
		local57.method419();
		super.anInt2384 = local57.anInt2368;
		if (super.anInt2385 != -1 && super.anInt2404 != -1) {
			@Pc(86) Class3_Sub3_Sub1_Sub1 local86 = Static84.method1557(super.anInt2385).method1710(super.anInt2404);
			if (local86 != null) {
				local86.method412(0, -super.anInt2392, 0);
				@Pc(106) Class3_Sub3_Sub1_Sub1[] local106 = new Class3_Sub3_Sub1_Sub1[] { local57, local86 };
				local57 = new Class3_Sub3_Sub1_Sub1(local106, 2, true);
			}
		}
		if (this.aClass3_Sub3_Sub3_1.anInt920 == 1) {
			local57.aBoolean31 = true;
		}
		return local57;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1679() {
		return this.aClass3_Sub3_Sub3_1 != null;
	}
}
