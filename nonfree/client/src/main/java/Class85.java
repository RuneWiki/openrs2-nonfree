import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class85 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!dm;")
	public Class85 aClass85_1;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Lclient!fe;")
	public Class23_Sub2_Sub1 aClass23_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public void method2102() {
		if (Static283.anInt5294 < 500) {
			this.aClass85_1 = Static154.aClass85_2;
			this.aClass23_Sub2_Sub1_1 = null;
			Static283.anInt5294++;
			Static154.aClass85_2 = this;
		}
	}
}
