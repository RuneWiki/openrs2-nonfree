import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class199 {

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!pr;")
	public Class199 aClass199_2;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Lclient!sv;")
	public Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	public int anInt5745;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	public void method4767() {
		if (Static170.anInt3346 >= 500) {
			return;
		}
		this.aClass11_Sub5_1 = null;
		this.aClass199_2 = Static455.aClass199_3;
		this.anInt5745 = 0;
		Static455.aClass199_3 = this;
		Static170.anInt3346++;
	}
}
