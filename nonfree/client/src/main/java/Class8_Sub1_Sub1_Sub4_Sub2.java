import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class8_Sub1_Sub1_Sub4_Sub2 extends Class8_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!n", name = "Oc", descriptor = "Lclient!s;")
	public Class8_Sub1_Sub16 aClass8_Sub1_Sub16_1;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1221() {
		return this.aClass8_Sub1_Sub16_1 != null;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(B)Lclient!nb;")
	@Override
	public Class8_Sub1_Sub1_Sub6 method1955() {
		if (this.aClass8_Sub1_Sub16_1 == null) {
			return null;
		}
		@Pc(26) Class8_Sub1_Sub6 local26 = super.anInt2009 != -1 && super.anInt2027 == 0 ? Static47.method733(super.anInt2009) : null;
		@Pc(49) Class8_Sub1_Sub6 local49 = super.anInt2010 == -1 || super.anInt2063 == super.anInt2010 && local26 != null ? null : Static47.method733(super.anInt2010);
		@Pc(67) Class8_Sub1_Sub1_Sub6 local67 = this.aClass8_Sub1_Sub16_1.method1508(local26, super.anInt2025, local49, super.anInt2015);
		if (local67 == null) {
			return null;
		}
		local67.method1269();
		super.anInt2046 = local67.anInt2957;
		if (super.anInt2006 != -1 && super.anInt2050 != -1) {
			@Pc(94) Class8_Sub1_Sub1_Sub6 local94 = Static14.method235(super.anInt2006).method381(super.anInt2050);
			if (local94 != null) {
				local94.method1286(0, -super.anInt2013, 0);
				@Pc(114) Class8_Sub1_Sub1_Sub6[] local114 = new Class8_Sub1_Sub1_Sub6[] { local67, local94 };
				local67 = new Class8_Sub1_Sub1_Sub6(local114, 2);
			}
		}
		if (this.aClass8_Sub1_Sub16_1.anInt2439 == 1) {
			local67.aBoolean81 = true;
		}
		return local67;
	}
}
