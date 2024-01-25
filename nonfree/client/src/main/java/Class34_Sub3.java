import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!nja", name = "h", descriptor = "Lclient!nja;")
	public Class34_Sub3 aClass34_Sub3_9;

	@OriginalMember(owner = "client!nja", name = "j", descriptor = "Lclient!nja;")
	public Class34_Sub3 aClass34_Sub3_10;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
	public final void method8658() {
		if (this.aClass34_Sub3_9 != null) {
			this.aClass34_Sub3_9.aClass34_Sub3_10 = this.aClass34_Sub3_10;
			this.aClass34_Sub3_10.aClass34_Sub3_9 = this.aClass34_Sub3_9;
			this.aClass34_Sub3_9 = null;
			this.aClass34_Sub3_10 = null;
		}
	}
}
