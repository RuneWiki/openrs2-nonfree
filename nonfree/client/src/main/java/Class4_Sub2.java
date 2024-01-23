import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!nh;")
	public Class4_Sub2 aClass4_Sub2_71;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "J")
	public long aLong212;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Lclient!nh;")
	public Class4_Sub2 aClass4_Sub2_72;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)Z")
	public final boolean method4695() {
		return this.aClass4_Sub2_71 != null;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public final void method4697() {
		if (this.aClass4_Sub2_71 != null) {
			this.aClass4_Sub2_71.aClass4_Sub2_72 = this.aClass4_Sub2_72;
			this.aClass4_Sub2_72.aClass4_Sub2_71 = this.aClass4_Sub2_71;
			this.aClass4_Sub2_72 = null;
			this.aClass4_Sub2_71 = null;
		}
	}
}
