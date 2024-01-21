import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!db", name = "I", descriptor = "Lclient!db;")
	public Class3_Sub1 aClass3_Sub1_63;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "Lclient!db;")
	public Class3_Sub1 aClass3_Sub1_64;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public final void method2270() {
		if (this.aClass3_Sub1_63 != null) {
			this.aClass3_Sub1_63.aClass3_Sub1_64 = this.aClass3_Sub1_64;
			this.aClass3_Sub1_64.aClass3_Sub1_63 = this.aClass3_Sub1_63;
			this.aClass3_Sub1_64 = null;
			this.aClass3_Sub1_63 = null;
		}
	}
}
