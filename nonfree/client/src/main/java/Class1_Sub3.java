import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!ue;")
	public Class1_Sub3 aClass1_Sub3_65;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!ue;")
	public Class1_Sub3 aClass1_Sub3_66;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	public final void method3367() {
		if (this.aClass1_Sub3_66 != null) {
			this.aClass1_Sub3_66.aClass1_Sub3_65 = this.aClass1_Sub3_65;
			this.aClass1_Sub3_65.aClass1_Sub3_66 = this.aClass1_Sub3_66;
			this.aClass1_Sub3_65 = null;
			this.aClass1_Sub3_66 = null;
		}
	}
}
