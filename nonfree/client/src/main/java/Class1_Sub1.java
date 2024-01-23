import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "Lclient!qg;")
	public Class1_Sub1 aClass1_Sub1_65;

	@OriginalMember(owner = "client!qg", name = "E", descriptor = "Lclient!qg;")
	public Class1_Sub1 aClass1_Sub1_66;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public final void method3434() {
		if (this.aClass1_Sub1_65 != null) {
			this.aClass1_Sub1_65.aClass1_Sub1_66 = this.aClass1_Sub1_66;
			this.aClass1_Sub1_66.aClass1_Sub1_65 = this.aClass1_Sub1_65;
			this.aClass1_Sub1_66 = null;
			this.aClass1_Sub1_65 = null;
		}
	}
}
