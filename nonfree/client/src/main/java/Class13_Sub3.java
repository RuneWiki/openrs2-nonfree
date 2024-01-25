import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "Lclient!fp;")
	public Class13_Sub3 aClass13_Sub3_9;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Lclient!fp;")
	public Class13_Sub3 aClass13_Sub3_10;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public final void method5088() {
		if (this.aClass13_Sub3_10 != null) {
			this.aClass13_Sub3_10.aClass13_Sub3_9 = this.aClass13_Sub3_9;
			this.aClass13_Sub3_9.aClass13_Sub3_10 = this.aClass13_Sub3_10;
			this.aClass13_Sub3_9 = null;
			this.aClass13_Sub3_10 = null;
		}
	}
}
