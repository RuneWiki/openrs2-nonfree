import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!sd;")
	public Class21_Sub3 aClass21_Sub3_9;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!sd;")
	public Class21_Sub3 aClass21_Sub3_10;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public final void method8248() {
		if (this.aClass21_Sub3_10 != null) {
			this.aClass21_Sub3_10.aClass21_Sub3_9 = this.aClass21_Sub3_9;
			this.aClass21_Sub3_9.aClass21_Sub3_10 = this.aClass21_Sub3_10;
			this.aClass21_Sub3_9 = null;
			this.aClass21_Sub3_10 = null;
		}
	}
}
