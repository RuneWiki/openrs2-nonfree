import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "Lclient!ci;")
	public Class3_Sub1 aClass3_Sub1_71;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Lclient!ci;")
	public Class3_Sub1 aClass3_Sub1_72;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
	public final void method3150() {
		if (this.aClass3_Sub1_72 != null) {
			this.aClass3_Sub1_72.aClass3_Sub1_71 = this.aClass3_Sub1_71;
			this.aClass3_Sub1_71.aClass3_Sub1_72 = this.aClass3_Sub1_72;
			this.aClass3_Sub1_72 = null;
			this.aClass3_Sub1_71 = null;
		}
	}
}
