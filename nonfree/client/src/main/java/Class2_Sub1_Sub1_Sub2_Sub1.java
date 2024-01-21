import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub1_Sub1_Sub2_Sub1 extends Class2_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!fb", name = "ed", descriptor = "Lclient!o;")
	public Class2_Sub1_Sub11 aClass2_Sub1_Sub11_1;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(B)Lclient!r;")
	@Override
	public Class2_Sub1_Sub1_Sub6 method1512() {
		if (this.aClass2_Sub1_Sub11_1 == null) {
			return null;
		}
		@Pc(31) Class2_Sub1_Sub6 local31 = super.anInt1552 != -1 && super.anInt1569 == 0 ? Static71.method1291(super.anInt1552) : null;
		@Pc(53) Class2_Sub1_Sub6 local53 = super.anInt1542 == -1 || super.anInt1542 == super.anInt1515 && local31 != null ? null : Static71.method1291(super.anInt1542);
		@Pc(64) Class2_Sub1_Sub1_Sub6 local64 = this.aClass2_Sub1_Sub11_1.method1270(super.anInt1549, local31, super.anInt1547, local53);
		if (local64 == null) {
			return null;
		}
		local64.method1516();
		super.anInt1523 = local64.anInt2496;
		if (super.anInt1554 != -1 && super.anInt1563 != -1) {
			@Pc(93) Class2_Sub1_Sub1_Sub6 local93 = Static20.method402(super.anInt1554).method1654(super.anInt1563);
			if (local93 != null) {
				@Pc(106) Class2_Sub1_Sub1_Sub6[] local106 = new Class2_Sub1_Sub1_Sub6[] { local64, local93 };
				local93.method1528(0, -super.anInt1537, 0);
				local64 = new Class2_Sub1_Sub1_Sub6(local106, 2, true);
			}
		}
		if (this.aClass2_Sub1_Sub11_1.anInt2105 == 1) {
			local64.aBoolean127 = true;
		}
		return local64;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method925() {
		return this.aClass2_Sub1_Sub11_1 != null;
	}
}
