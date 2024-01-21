import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!t;")
	public Class1_Sub2 aClass1_Sub2_65;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!t;")
	public Class1_Sub2 aClass1_Sub2_66;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public final void method3549() {
		if (this.aClass1_Sub2_66 != null) {
			this.aClass1_Sub2_66.aClass1_Sub2_65 = this.aClass1_Sub2_65;
			this.aClass1_Sub2_65.aClass1_Sub2_66 = this.aClass1_Sub2_66;
			this.aClass1_Sub2_66 = null;
			this.aClass1_Sub2_65 = null;
		}
	}
}
