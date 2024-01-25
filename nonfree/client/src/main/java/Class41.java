import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class Class41 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Lclient!cv;")
	public Class41 aClass41_23;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "Lclient!cv;")
	public Class41 aClass41_24;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	public final void method5818() {
		if (this.aClass41_24 != null) {
			this.aClass41_24.aClass41_23 = this.aClass41_23;
			this.aClass41_23.aClass41_24 = this.aClass41_24;
			this.aClass41_23 = null;
			this.aClass41_24 = null;
		}
	}
}
