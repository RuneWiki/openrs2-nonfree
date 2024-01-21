import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!n;")
	public Class4_Sub1 aClass4_Sub1_71;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!n;")
	public Class4_Sub1 aClass4_Sub1_72;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public final void method3176() {
		if (this.aClass4_Sub1_71 != null) {
			this.aClass4_Sub1_71.aClass4_Sub1_72 = this.aClass4_Sub1_72;
			this.aClass4_Sub1_72.aClass4_Sub1_71 = this.aClass4_Sub1_71;
			this.aClass4_Sub1_71 = null;
			this.aClass4_Sub1_72 = null;
		}
	}
}
