import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class Class36 {

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Lclient!du;")
	public Class36 aClass36_21;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "Lclient!du;")
	public Class36 aClass36_22;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public final void method5131() {
		if (this.aClass36_21 != null) {
			this.aClass36_21.aClass36_22 = this.aClass36_22;
			this.aClass36_22.aClass36_21 = this.aClass36_21;
			this.aClass36_22 = null;
			this.aClass36_21 = null;
		}
	}
}
