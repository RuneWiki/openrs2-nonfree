import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub1_Sub8_Sub1_Sub1 extends Class1_Sub1_Sub8_Sub1 {

	@OriginalMember(owner = "client!qa", name = "dd", descriptor = "Lclient!fc;")
	public Class1_Sub1_Sub6 aClass1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method1763() {
		return this.aClass1_Sub1_Sub6_1 != null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)Lclient!pc;")
	@Override
	protected Class1_Sub1_Sub8_Sub3 method1835() {
		if (this.aClass1_Sub1_Sub6_1 == null) {
			return null;
		}
		@Pc(30) Class1_Sub1_Sub14 local30 = super.anInt2601 != -1 && super.anInt2570 == 0 ? Static30.method574(super.anInt2601) : null;
		@Pc(52) Class1_Sub1_Sub14 local52 = super.anInt2563 == -1 || super.anInt2567 == super.anInt2563 && local30 != null ? null : Static30.method574(super.anInt2563);
		@Pc(63) Class1_Sub1_Sub8_Sub3 local63 = this.aClass1_Sub1_Sub6_1.method549(local52, super.anInt2600, super.anInt2607, local30);
		if (local63 == null) {
			return null;
		}
		local63.method1392();
		super.anInt2573 = local63.anInt2716;
		if (super.anInt2560 != -1 && super.anInt2593 != -1) {
			@Pc(91) Class1_Sub1_Sub8_Sub3 local91 = Static53.method1838(super.anInt2560).method1256(super.anInt2593);
			if (local91 != null) {
				@Pc(104) Class1_Sub1_Sub8_Sub3[] local104 = new Class1_Sub1_Sub8_Sub3[] { local63, local91 };
				local91.method1375(0, -super.anInt2605, 0);
				local63 = new Class1_Sub1_Sub8_Sub3(local104, 2, true);
			}
		}
		if (this.aClass1_Sub1_Sub6_1.anInt760 == 1) {
			local63.aBoolean108 = true;
		}
		return local63;
	}
}
