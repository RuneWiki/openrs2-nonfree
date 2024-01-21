import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!h", name = "R", descriptor = "Lclient!h;")
	public Class3_Sub1 aClass3_Sub1_61;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!h;")
	public Class3_Sub1 aClass3_Sub1_62;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public final void method1909() {
		if (this.aClass3_Sub1_62 != null) {
			this.aClass3_Sub1_62.aClass3_Sub1_61 = this.aClass3_Sub1_61;
			this.aClass3_Sub1_61.aClass3_Sub1_62 = this.aClass3_Sub1_62;
			this.aClass3_Sub1_61 = null;
			this.aClass3_Sub1_62 = null;
		}
	}
}
