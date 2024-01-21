import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class10_Sub1_Sub5_Sub2_Sub1 extends Class10_Sub1_Sub5_Sub2 {

	@OriginalMember(owner = "client!ib", name = "Jc", descriptor = "Lclient!cc;")
	public Class10_Sub1_Sub3 aClass10_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method927() {
		return this.aClass10_Sub1_Sub3_1 != null;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Lclient!rb;")
	@Override
	protected Class10_Sub1_Sub5_Sub4 method1663() {
		if (this.aClass10_Sub1_Sub3_1 == null) {
			return null;
		}
		@Pc(22) Class10_Sub1_Sub6 local22 = super.anInt1688 != -1 && super.anInt1675 == 0 ? Static5.method33(super.anInt1688) : null;
		@Pc(44) Class10_Sub1_Sub6 local44 = super.anInt1674 == -1 || super.anInt1647 == super.anInt1674 && local22 != null ? null : Static5.method33(super.anInt1674);
		@Pc(60) Class10_Sub1_Sub5_Sub4 local60 = this.aClass10_Sub1_Sub3_1.method274(local44, super.anInt1641, local22, super.anInt1680);
		if (local60 == null) {
			return null;
		}
		local60.method1338();
		super.anInt1679 = local60.anInt2674;
		if (super.anInt1655 != -1 && super.anInt1640 != -1) {
			@Pc(88) Class10_Sub1_Sub5_Sub4 local88 = Static51.method789(super.anInt1655).method1273(super.anInt1640);
			if (local88 != null) {
				@Pc(101) Class10_Sub1_Sub5_Sub4[] local101 = new Class10_Sub1_Sub5_Sub4[] { local60, local88 };
				local88.method1315(0, -super.anInt1670, 0);
				local60 = new Class10_Sub1_Sub5_Sub4(local101, 2, true);
			}
		}
		if (this.aClass10_Sub1_Sub3_1.anInt397 == 1) {
			local60.aBoolean98 = true;
		}
		return local60;
	}
}
