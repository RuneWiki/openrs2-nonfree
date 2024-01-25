import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Lclient!aq;")
	public Class4_Sub2 aClass4_Sub2_9;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "Lclient!aq;")
	public Class4_Sub2 aClass4_Sub2_10;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	public final void method6693() {
		if (this.aClass4_Sub2_9 != null) {
			this.aClass4_Sub2_9.aClass4_Sub2_10 = this.aClass4_Sub2_10;
			this.aClass4_Sub2_10.aClass4_Sub2_9 = this.aClass4_Sub2_9;
			this.aClass4_Sub2_9 = null;
			this.aClass4_Sub2_10 = null;
		}
	}
}
