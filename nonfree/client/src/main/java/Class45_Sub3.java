import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class Class45_Sub3 extends Class45 {

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!ni;")
	public Class45_Sub3 aClass45_Sub3_5;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Lclient!ni;")
	public Class45_Sub3 aClass45_Sub3_6;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	public final void method2454() {
		if (this.aClass45_Sub3_5 != null) {
			this.aClass45_Sub3_5.aClass45_Sub3_6 = this.aClass45_Sub3_6;
			this.aClass45_Sub3_6.aClass45_Sub3_5 = this.aClass45_Sub3_5;
			this.aClass45_Sub3_5 = null;
			this.aClass45_Sub3_6 = null;
		}
	}
}
