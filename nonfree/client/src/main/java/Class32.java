import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class Class32 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!km;")
	public Class32 aClass32_23;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!km;")
	public Class32 aClass32_24;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public final void method5578() {
		if (this.aClass32_23 != null) {
			this.aClass32_23.aClass32_24 = this.aClass32_24;
			this.aClass32_24.aClass32_23 = this.aClass32_23;
			this.aClass32_24 = null;
			this.aClass32_23 = null;
		}
	}
}
