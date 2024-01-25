import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class Class12 {

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "Lclient!pk;")
	public Class12 aClass12_23;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!pk;")
	public Class12 aClass12_24;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	public final void method5277() {
		if (this.aClass12_24 != null) {
			this.aClass12_24.aClass12_23 = this.aClass12_23;
			this.aClass12_23.aClass12_24 = this.aClass12_24;
			this.aClass12_24 = null;
			this.aClass12_23 = null;
		}
	}
}
