import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!df;")
	public Class4_Sub2 aClass4_Sub2_63;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "Lclient!df;")
	public Class4_Sub2 aClass4_Sub2_64;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
	public final void method2201() {
		if (this.aClass4_Sub2_63 != null) {
			this.aClass4_Sub2_63.aClass4_Sub2_64 = this.aClass4_Sub2_64;
			this.aClass4_Sub2_64.aClass4_Sub2_63 = this.aClass4_Sub2_63;
			this.aClass4_Sub2_63 = null;
			this.aClass4_Sub2_64 = null;
		}
	}
}
