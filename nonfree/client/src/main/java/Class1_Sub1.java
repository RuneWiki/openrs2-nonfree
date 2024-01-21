import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!eb;")
	public Class1_Sub1 aClass1_Sub1_65;

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "Lclient!eb;")
	public Class1_Sub1 aClass1_Sub1_66;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public final void method2004() {
		if (this.aClass1_Sub1_66 != null) {
			this.aClass1_Sub1_66.aClass1_Sub1_65 = this.aClass1_Sub1_65;
			this.aClass1_Sub1_65.aClass1_Sub1_66 = this.aClass1_Sub1_66;
			this.aClass1_Sub1_65 = null;
			this.aClass1_Sub1_66 = null;
		}
	}
}
