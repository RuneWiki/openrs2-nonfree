import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class61 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "Lclient!bba;")
	public Class11_Sub1_Sub1 aClass11_Sub1_Sub1_1;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "Lclient!cu;")
	public Class61 aClass61_1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	public void method1456() {
		if (Static277.anInt5315 < 500) {
			this.aClass61_1 = Static555.aClass61_3;
			this.aClass11_Sub1_Sub1_1 = null;
			Static277.anInt5315++;
			Static555.aClass61_3 = this;
		}
	}
}
