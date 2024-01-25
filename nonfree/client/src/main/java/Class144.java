import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class144 {

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!hba;")
	public Class144 aClass144_2;

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "Lclient!ar;")
	public Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	public void method3125() {
		if (Static71.anInt1496 < 500) {
			this.aClass144_2 = Static215.aClass144_3;
			this.aClass3_Sub1_Sub2_1 = null;
			Static71.anInt1496++;
			Static215.aClass144_3 = this;
		}
	}
}
