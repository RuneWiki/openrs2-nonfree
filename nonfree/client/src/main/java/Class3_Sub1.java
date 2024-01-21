import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "Lclient!ld;")
	public Class3_Sub1 aClass3_Sub1_63;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "Lclient!ld;")
	public Class3_Sub1 aClass3_Sub1_64;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	public final void method1931() {
		if (this.aClass3_Sub1_63 != null) {
			this.aClass3_Sub1_63.aClass3_Sub1_64 = this.aClass3_Sub1_64;
			this.aClass3_Sub1_64.aClass3_Sub1_63 = this.aClass3_Sub1_63;
			this.aClass3_Sub1_63 = null;
			this.aClass3_Sub1_64 = null;
		}
	}
}
