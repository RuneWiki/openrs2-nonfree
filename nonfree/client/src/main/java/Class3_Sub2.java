import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!lg;")
	public Class3_Sub2 aClass3_Sub2_68;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "Lclient!lg;")
	public Class3_Sub2 aClass3_Sub2_69;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	public final void method3174() {
		if (this.aClass3_Sub2_68 != null) {
			this.aClass3_Sub2_68.aClass3_Sub2_69 = this.aClass3_Sub2_69;
			this.aClass3_Sub2_69.aClass3_Sub2_68 = this.aClass3_Sub2_68;
			this.aClass3_Sub2_68 = null;
			this.aClass3_Sub2_69 = null;
		}
	}
}
