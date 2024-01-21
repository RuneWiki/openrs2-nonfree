import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!ta;")
	public Class5_Sub1 aClass5_Sub1_65;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "Lclient!ta;")
	public Class5_Sub1 aClass5_Sub1_66;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	public final void method2009() {
		if (this.aClass5_Sub1_66 != null) {
			this.aClass5_Sub1_66.aClass5_Sub1_65 = this.aClass5_Sub1_65;
			this.aClass5_Sub1_65.aClass5_Sub1_66 = this.aClass5_Sub1_66;
			this.aClass5_Sub1_66 = null;
			this.aClass5_Sub1_65 = null;
		}
	}
}
