import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class315 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!bt;")
	public Class15_Sub2 aClass15_Sub2_2;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!ub;")
	public Class315 aClass315_3;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public int anInt8858;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public void method7058() {
		if (Static449.anInt7947 >= 500) {
			return;
		}
		this.aClass15_Sub2_2 = null;
		this.aClass315_3 = Static268.aClass315_2;
		this.anInt8858 = 0;
		Static449.anInt7947++;
		Static268.aClass315_2 = this;
	}
}
