import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Lclient!ba;")
	public Class3_Sub2 aClass3_Sub2_69;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!ba;")
	public Class3_Sub2 aClass3_Sub2_70;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public final void method2886() {
		if (this.aClass3_Sub2_70 != null) {
			this.aClass3_Sub2_70.aClass3_Sub2_69 = this.aClass3_Sub2_69;
			this.aClass3_Sub2_69.aClass3_Sub2_70 = this.aClass3_Sub2_70;
			this.aClass3_Sub2_70 = null;
			this.aClass3_Sub2_69 = null;
		}
	}
}
