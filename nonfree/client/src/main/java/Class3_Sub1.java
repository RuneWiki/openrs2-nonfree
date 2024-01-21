import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!jd;")
	public Class3_Sub1 aClass3_Sub1_63;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!jd;")
	public Class3_Sub1 aClass3_Sub1_64;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public final void method1956() {
		if (this.aClass3_Sub1_64 != null) {
			this.aClass3_Sub1_64.aClass3_Sub1_63 = this.aClass3_Sub1_63;
			this.aClass3_Sub1_63.aClass3_Sub1_64 = this.aClass3_Sub1_64;
			this.aClass3_Sub1_64 = null;
			this.aClass3_Sub1_63 = null;
		}
	}
}
