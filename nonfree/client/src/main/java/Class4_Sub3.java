import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "Lclient!ii;")
	public Class4_Sub3 aClass4_Sub3_9;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Lclient!ii;")
	public Class4_Sub3 aClass4_Sub3_10;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
	public final void method5698() {
		if (this.aClass4_Sub3_9 != null) {
			this.aClass4_Sub3_9.aClass4_Sub3_10 = this.aClass4_Sub3_10;
			this.aClass4_Sub3_10.aClass4_Sub3_9 = this.aClass4_Sub3_9;
			this.aClass4_Sub3_9 = null;
			this.aClass4_Sub3_10 = null;
		}
	}
}
