import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class67 {

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "Lclient!aaa;")
	public Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "Lclient!dja;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V")
	public void method1723() {
		if (Static298.anInt5008 < 500) {
			this.aClass67_1 = Static419.aClass67_2;
			this.aClass2_Sub1_Sub1_1 = null;
			Static298.anInt5008++;
			Static419.aClass67_2 = this;
		}
	}
}
