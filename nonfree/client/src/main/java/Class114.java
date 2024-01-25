import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class114 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!hi;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public int anInt3395;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!j;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public void method2898() {
		if (Static420.anInt7106 >= 500) {
			return;
		}
		this.aClass1_Sub2_1 = null;
		this.anInt3395 = 0;
		this.aClass114_1 = Static455.aClass114_3;
		Static420.anInt7106++;
		Static455.aClass114_3 = this;
	}
}
