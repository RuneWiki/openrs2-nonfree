import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Lclient!kf;")
	public Class4_Sub3 aClass4_Sub3_65;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Lclient!kf;")
	public Class4_Sub3 aClass4_Sub3_66;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
	public final void method1996() {
		if (this.aClass4_Sub3_66 != null) {
			this.aClass4_Sub3_66.aClass4_Sub3_65 = this.aClass4_Sub3_65;
			this.aClass4_Sub3_65.aClass4_Sub3_66 = this.aClass4_Sub3_66;
			this.aClass4_Sub3_65 = null;
			this.aClass4_Sub3_66 = null;
		}
	}
}
