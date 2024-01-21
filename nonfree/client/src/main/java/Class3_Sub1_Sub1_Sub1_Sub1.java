import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Pc", descriptor = "Lclient!qc;")
	public Class3_Sub1_Sub13 aClass3_Sub1_Sub13_1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)Lclient!v;")
	@Override
	public Class3_Sub1_Sub1_Sub6 method1792() {
		if (this.aClass3_Sub1_Sub13_1 == null) {
			return null;
		}
		@Pc(22) Class3_Sub1_Sub11 local22 = super.anInt1536 != -1 && super.anInt1570 == 0 ? Static31.method778(super.anInt1536) : null;
		@Pc(45) Class3_Sub1_Sub11 local45 = super.anInt1568 == -1 || super.anInt1568 == super.anInt1579 && local22 != null ? null : Static31.method778(super.anInt1568);
		@Pc(56) Class3_Sub1_Sub1_Sub6 local56 = this.aClass3_Sub1_Sub13_1.method1484(super.anInt1532, local45, local22, super.anInt1571);
		if (local56 == null) {
			return null;
		}
		local56.method1800();
		super.anInt1572 = local56.anInt2758;
		if (super.anInt1538 != -1 && super.anInt1545 != -1) {
			@Pc(84) Class3_Sub1_Sub1_Sub6 local84 = Static61.method1063(super.anInt1538).method1935(super.anInt1545);
			if (local84 != null) {
				@Pc(97) Class3_Sub1_Sub1_Sub6[] local97 = new Class3_Sub1_Sub1_Sub6[] { local56, local84 };
				local84.method1812(0, -super.anInt1555, 0);
				local56 = new Class3_Sub1_Sub1_Sub6(local97, 2, true);
			}
		}
		if (this.aClass3_Sub1_Sub13_1.anInt2203 == 1) {
			local56.aBoolean149 = true;
		}
		return local56;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method993() {
		return this.aClass3_Sub1_Sub13_1 != null;
	}
}
