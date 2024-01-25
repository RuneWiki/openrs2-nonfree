import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class105 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!fe;")
	public Class105 aClass105_1;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!ht;")
	public Class9_Sub2_Sub1 aClass9_Sub2_Sub1_1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public void method2553() {
		if (Static153.anInt3137 < 500) {
			this.aClass9_Sub2_Sub1_1 = null;
			this.aClass105_1 = Static521.aClass105_2;
			Static153.anInt3137++;
			Static521.aClass105_2 = this;
		}
	}
}
