import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!taa", name = "j", descriptor = "Lclient!taa;")
	public Class3_Sub2 aClass3_Sub2_9;

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "Lclient!taa;")
	public Class3_Sub2 aClass3_Sub2_10;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public final void method6948() {
		if (this.aClass3_Sub2_9 != null) {
			this.aClass3_Sub2_9.aClass3_Sub2_10 = this.aClass3_Sub2_10;
			this.aClass3_Sub2_10.aClass3_Sub2_9 = this.aClass3_Sub2_9;
			this.aClass3_Sub2_10 = null;
			this.aClass3_Sub2_9 = null;
		}
	}
}
