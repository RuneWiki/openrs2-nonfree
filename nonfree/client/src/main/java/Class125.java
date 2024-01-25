import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class125 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!bt;")
	public Class26_Sub2 aClass26_Sub2_1;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public int anInt3453;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!jc;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public void method2893() {
		if (Static165.anInt3105 >= 500) {
			return;
		}
		this.anInt3453 = 0;
		this.aClass125_1 = Static280.aClass125_2;
		this.aClass26_Sub2_1 = null;
		Static165.anInt3105++;
		Static280.aClass125_2 = this;
	}
}
