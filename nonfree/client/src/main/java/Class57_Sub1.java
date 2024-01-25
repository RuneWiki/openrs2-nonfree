import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!e;")
	public Class57_Sub1 aClass57_Sub1_7;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!e;")
	public Class57_Sub1 aClass57_Sub1_8;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
	public final void method4328() {
		if (this.aClass57_Sub1_8 != null) {
			this.aClass57_Sub1_8.aClass57_Sub1_7 = this.aClass57_Sub1_7;
			this.aClass57_Sub1_7.aClass57_Sub1_8 = this.aClass57_Sub1_8;
			this.aClass57_Sub1_8 = null;
			this.aClass57_Sub1_7 = null;
		}
	}
}
