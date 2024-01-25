import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class146 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public int anInt3663;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!sq;")
	public Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!lg;")
	public Class146 aClass146_3;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method2997() {
		if (Static31.anInt625 >= 500) {
			return;
		}
		this.aClass20_Sub3_1 = null;
		this.aClass146_3 = Static120.aClass146_4;
		this.anInt3663 = 0;
		Static31.anInt625++;
		Static120.aClass146_4 = this;
	}
}
