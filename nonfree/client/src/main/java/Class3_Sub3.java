import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "Lclient!ad;")
	public Class3_Sub3 aClass3_Sub3_59;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "Lclient!ad;")
	public Class3_Sub3 aClass3_Sub3_60;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public final void method1892() {
		if (this.aClass3_Sub3_60 != null) {
			this.aClass3_Sub3_60.aClass3_Sub3_59 = this.aClass3_Sub3_59;
			this.aClass3_Sub3_59.aClass3_Sub3_60 = this.aClass3_Sub3_60;
			this.aClass3_Sub3_59 = null;
			this.aClass3_Sub3_60 = null;
		}
	}
}
