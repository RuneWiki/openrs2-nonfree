import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DRKSBDQX")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!DRKSBDQX", name = "f", descriptor = "Lclient!DRKSBDQX;")
	public Class3_Sub1 aClass3_Sub1_34;

	@OriginalMember(owner = "client!DRKSBDQX", name = "g", descriptor = "Lclient!DRKSBDQX;")
	public Class3_Sub1 aClass3_Sub1_35;

	@OriginalMember(owner = "client!DRKSBDQX", name = "b", descriptor = "()V")
	public final void method560() {
		if (this.aClass3_Sub1_35 != null) {
			this.aClass3_Sub1_35.aClass3_Sub1_34 = this.aClass3_Sub1_34;
			this.aClass3_Sub1_34.aClass3_Sub1_35 = this.aClass3_Sub1_35;
			this.aClass3_Sub1_34 = null;
			this.aClass3_Sub1_35 = null;
		}
	}
}
