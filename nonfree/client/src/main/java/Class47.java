import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class47 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!fo;")
	public Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!db;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public void method1120() {
		if (Static35.anInt1011 >= 500) {
			return;
		}
		this.anInt1398 = 0;
		this.aClass47_2 = Static47.aClass47_1;
		this.aClass22_Sub2_1 = null;
		Static35.anInt1011++;
		Static47.aClass47_1 = this;
	}
}
