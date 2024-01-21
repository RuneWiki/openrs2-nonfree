import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class6_Sub2_Sub3_Sub1_Sub2 extends Class6_Sub2_Sub3_Sub1 {

	@OriginalMember(owner = "client!ta", name = "qd", descriptor = "Lclient!d;")
	public Class6_Sub2_Sub4 aClass6_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method1826() {
		return this.aClass6_Sub2_Sub4_1 != null;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)Lclient!jb;")
	@Override
	public Class6_Sub2_Sub3_Sub3 method2063() {
		if (this.aClass6_Sub2_Sub4_1 == null) {
			return null;
		}
		@Pc(27) Class6_Sub2_Sub13 local27 = super.anInt2717 != -1 && super.anInt2711 == 0 ? Static4.method1608(super.anInt2717) : null;
		@Pc(46) Class6_Sub2_Sub13 local46 = super.anInt2741 == -1 || super.anInt2741 == super.anInt2756 && local27 != null ? null : Static4.method1608(super.anInt2741);
		@Pc(57) Class6_Sub2_Sub3_Sub3 local57 = this.aClass6_Sub2_Sub4_1.method537(super.anInt2738, local46, super.anInt2734, local27);
		if (local57 == null) {
			return null;
		}
		local57.method970();
		super.anInt2723 = local57.anInt3206;
		if (super.anInt2722 != -1 && super.anInt2699 != -1) {
			@Pc(86) Class6_Sub2_Sub3_Sub3 local86 = Static98.method1873(super.anInt2722).method1404(super.anInt2699);
			if (local86 != null) {
				local86.method971(0, -super.anInt2700, 0);
				@Pc(106) Class6_Sub2_Sub3_Sub3[] local106 = new Class6_Sub2_Sub3_Sub3[] { local57, local86 };
				local57 = new Class6_Sub2_Sub3_Sub3(local106, 2, true);
			}
		}
		if (this.aClass6_Sub2_Sub4_1.anInt857 == 1) {
			local57.aBoolean66 = true;
		}
		return local57;
	}
}
