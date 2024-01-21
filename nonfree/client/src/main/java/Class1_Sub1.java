import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "Lclient!gb;")
	public Class1_Sub1 aClass1_Sub1_65;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "Lclient!gb;")
	public Class1_Sub1 aClass1_Sub1_66;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public final void method2110() {
		if (this.aClass1_Sub1_65 != null) {
			this.aClass1_Sub1_65.aClass1_Sub1_66 = this.aClass1_Sub1_66;
			this.aClass1_Sub1_66.aClass1_Sub1_65 = this.aClass1_Sub1_65;
			this.aClass1_Sub1_66 = null;
			this.aClass1_Sub1_65 = null;
		}
	}
}
