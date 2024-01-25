import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!me;")
	public Class3_Sub3 aClass3_Sub3_9;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!me;")
	public Class3_Sub3 aClass3_Sub3_10;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	public final void method4806() {
		if (this.aClass3_Sub3_10 != null) {
			this.aClass3_Sub3_10.aClass3_Sub3_9 = this.aClass3_Sub3_9;
			this.aClass3_Sub3_9.aClass3_Sub3_10 = this.aClass3_Sub3_10;
			this.aClass3_Sub3_10 = null;
			this.aClass3_Sub3_9 = null;
		}
	}
}
