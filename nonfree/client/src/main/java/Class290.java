import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class290 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!qi;")
	public Class290 aClass290_3;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!vp;")
	public Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public void method6826() {
		if (Static55.anInt1105 < 500) {
			this.aClass4_Sub2_Sub1_1 = null;
			this.aClass290_3 = Static316.aClass290_1;
			Static316.aClass290_1 = this;
			Static55.anInt1105++;
		}
	}
}
