import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "Lclient!rc;")
	public Class3_Sub1 aClass3_Sub1_65;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "Lclient!rc;")
	public Class3_Sub1 aClass3_Sub1_66;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public final void method2210() {
		if (this.aClass3_Sub1_65 != null) {
			this.aClass3_Sub1_65.aClass3_Sub1_66 = this.aClass3_Sub1_66;
			this.aClass3_Sub1_66.aClass3_Sub1_65 = this.aClass3_Sub1_65;
			this.aClass3_Sub1_65 = null;
			this.aClass3_Sub1_66 = null;
		}
	}
}
