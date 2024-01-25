import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class152 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Lclient!cs;")
	public Class15_Sub1_Sub2 aClass15_Sub1_Sub2_1;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "Lclient!jba;")
	public Class152 aClass152_3;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
	public void method4440() {
		if (Static396.anInt9379 < 500) {
			this.aClass15_Sub1_Sub2_1 = null;
			this.aClass152_3 = Static29.aClass152_1;
			Static396.anInt9379++;
			Static29.aClass152_1 = this;
		}
	}
}
