import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class4_Sub4_Sub1_Sub2_Sub1 extends Class4_Sub4_Sub1_Sub2 {

	@OriginalMember(owner = "client!ca", name = "Ac", descriptor = "Lclient!of;")
	public Class4_Sub4_Sub11 aClass4_Sub4_Sub11_1;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)Lclient!rb;")
	@Override
	public Class4_Sub4_Sub1_Sub6 method1976() {
		if (this.aClass4_Sub4_Sub11_1 == null) {
			return null;
		}
		@Pc(30) Class4_Sub4_Sub14 local30 = super.anInt2633 != -1 && super.anInt2645 == 0 ? Static127.method2102(super.anInt2633) : null;
		@Pc(49) Class4_Sub4_Sub14 local49 = super.anInt2632 == -1 || super.anInt2594 == super.anInt2632 && local30 != null ? null : Static127.method2102(super.anInt2632);
		@Pc(60) Class4_Sub4_Sub1_Sub6 local60 = this.aClass4_Sub4_Sub11_1.method1493(super.anInt2595, local30, super.anInt2629, local49);
		if (local60 == null) {
			return null;
		}
		local60.method1799();
		super.anInt2605 = local60.anInt2816;
		if (super.anInt2630 != -1 && super.anInt2617 != -1) {
			@Pc(88) Class4_Sub4_Sub1_Sub6 local88 = Static92.method1610(super.anInt2630).method853(super.anInt2617);
			if (local88 != null) {
				local88.method1783(0, -super.anInt2642, 0);
				@Pc(108) Class4_Sub4_Sub1_Sub6[] local108 = new Class4_Sub4_Sub1_Sub6[] { local60, local88 };
				local60 = new Class4_Sub4_Sub1_Sub6(local108, 2);
			}
		}
		if (this.aClass4_Sub4_Sub11_1.anInt2008 == 1) {
			local60.aBoolean110 = true;
		}
		return local60;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1877() {
		return this.aClass4_Sub4_Sub11_1 != null;
	}
}
