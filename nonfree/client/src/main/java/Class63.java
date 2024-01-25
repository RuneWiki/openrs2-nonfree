import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class63 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!de;")
	public Class63 aClass63_1;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public int anInt1607;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!fu;")
	public Class49_Sub2 aClass49_Sub2_1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public void method1466() {
		if (Static415.anInt7308 >= 500) {
			return;
		}
		this.aClass63_1 = Static406.aClass63_2;
		this.aClass49_Sub2_1 = null;
		this.anInt1607 = 0;
		Static406.aClass63_2 = this;
		Static415.anInt7308++;
	}
}
