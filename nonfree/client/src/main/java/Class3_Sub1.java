import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "Lclient!ac;")
	public Class3_Sub1 aClass3_Sub1_63;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "Lclient!ac;")
	public Class3_Sub1 aClass3_Sub1_64;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public final void method2024() {
		if (this.aClass3_Sub1_64 != null) {
			this.aClass3_Sub1_64.aClass3_Sub1_63 = this.aClass3_Sub1_63;
			this.aClass3_Sub1_63.aClass3_Sub1_64 = this.aClass3_Sub1_64;
			this.aClass3_Sub1_63 = null;
			this.aClass3_Sub1_64 = null;
		}
	}
}
