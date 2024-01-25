import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class180 {

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "Lclient!jp;")
	public Class180 aClass180_2;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "Lclient!wo;")
	public Class12_Sub2_Sub1 aClass12_Sub2_Sub1_1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public void method3654() {
		if (Static474.anInt7611 < 500) {
			this.aClass180_2 = Static256.aClass180_1;
			this.aClass12_Sub2_Sub1_1 = null;
			Static256.aClass180_1 = this;
			Static474.anInt7611++;
		}
	}
}
