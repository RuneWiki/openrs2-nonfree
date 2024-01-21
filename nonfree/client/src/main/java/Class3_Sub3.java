import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!ni;")
	public Class3_Sub3 aClass3_Sub3_65;

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Lclient!ni;")
	public Class3_Sub3 aClass3_Sub3_66;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public final void method3214() {
		if (this.aClass3_Sub3_66 != null) {
			this.aClass3_Sub3_66.aClass3_Sub3_65 = this.aClass3_Sub3_65;
			this.aClass3_Sub3_65.aClass3_Sub3_66 = this.aClass3_Sub3_66;
			this.aClass3_Sub3_65 = null;
			this.aClass3_Sub3_66 = null;
		}
	}
}
