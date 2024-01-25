import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class Class36_Sub3 extends Class36 {

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!ve;")
	public Class36_Sub3 aClass36_Sub3_5;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!ve;")
	public Class36_Sub3 aClass36_Sub3_6;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public final void method1667() {
		if (this.aClass36_Sub3_5 != null) {
			this.aClass36_Sub3_5.aClass36_Sub3_6 = this.aClass36_Sub3_6;
			this.aClass36_Sub3_6.aClass36_Sub3_5 = this.aClass36_Sub3_5;
			this.aClass36_Sub3_5 = null;
			this.aClass36_Sub3_6 = null;
		}
	}
}
