import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class66 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!dh;")
	public Class66 aClass66_2;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!hc;")
	public Class29_Sub2 aClass29_Sub2_1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public void method1418() {
		if (Static299.anInt4836 >= 500) {
			return;
		}
		this.aClass29_Sub2_1 = null;
		this.anInt1518 = 0;
		this.aClass66_2 = Static110.aClass66_3;
		Static110.aClass66_3 = this;
		Static299.anInt4836++;
	}
}
