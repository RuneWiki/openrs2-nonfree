import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class43 {

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "Lclient!it;")
	public Class12_Sub2_Sub2 aClass12_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!bt;")
	public Class43 aClass43_3;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public void method1190() {
		if (Static561.anInt9756 < 500) {
			this.aClass43_3 = Static640.aClass43_5;
			this.aClass12_Sub2_Sub2_1 = null;
			Static640.aClass43_5 = this;
			Static561.anInt9756++;
		}
	}
}
