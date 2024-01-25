import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class Class36 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "Lclient!sq;")
	public Class36 aClass36_23;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "Lclient!sq;")
	public Class36 aClass36_24;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public final void method5317() {
		if (this.aClass36_23 != null) {
			this.aClass36_23.aClass36_24 = this.aClass36_24;
			this.aClass36_24.aClass36_23 = this.aClass36_23;
			this.aClass36_23 = null;
			this.aClass36_24 = null;
		}
	}
}
