import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class126 {

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Lclient!fe;")
	public Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Lclient!lk;")
	public Class126 aClass126_1;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	public void method3468() {
		if (Static12.anInt404 >= 500) {
			return;
		}
		this.aClass126_1 = Static344.aClass126_3;
		this.aClass17_Sub1_1 = null;
		this.anInt3791 = 0;
		Static344.aClass126_3 = this;
		Static12.anInt404++;
	}
}
