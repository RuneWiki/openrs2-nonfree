import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!wf;")
	public Class4_Sub2 aClass4_Sub2_56;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!wf;")
	public Class4_Sub2 aClass4_Sub2_57;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public final void method5538() {
		if (this.aClass4_Sub2_56 != null) {
			this.aClass4_Sub2_56.aClass4_Sub2_57 = this.aClass4_Sub2_57;
			this.aClass4_Sub2_57.aClass4_Sub2_56 = this.aClass4_Sub2_56;
			this.aClass4_Sub2_56 = null;
			this.aClass4_Sub2_57 = null;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)Z")
	public final boolean method5539() {
		return this.aClass4_Sub2_56 != null;
	}
}
