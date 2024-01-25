import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "Lclient!dv;")
	public Class4_Sub4 aClass4_Sub4_9;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Lclient!dv;")
	public Class4_Sub4 aClass4_Sub4_10;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public final void method8572() {
		if (this.aClass4_Sub4_9 != null) {
			this.aClass4_Sub4_9.aClass4_Sub4_10 = this.aClass4_Sub4_10;
			this.aClass4_Sub4_10.aClass4_Sub4_9 = this.aClass4_Sub4_9;
			this.aClass4_Sub4_9 = null;
			this.aClass4_Sub4_10 = null;
		}
	}
}
