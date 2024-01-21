import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Lclient!be;")
	public Class4_Sub1 aClass4_Sub1_64;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "Lclient!be;")
	public Class4_Sub1 aClass4_Sub1_65;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public final void method1906() {
		if (this.aClass4_Sub1_65 != null) {
			this.aClass4_Sub1_65.aClass4_Sub1_64 = this.aClass4_Sub1_64;
			this.aClass4_Sub1_64.aClass4_Sub1_65 = this.aClass4_Sub1_65;
			this.aClass4_Sub1_64 = null;
			this.aClass4_Sub1_65 = null;
		}
	}
}
