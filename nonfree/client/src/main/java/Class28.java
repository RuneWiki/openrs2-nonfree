import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class Class28 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!hc;")
	public Class28 aClass28_25;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!hc;")
	public Class28 aClass28_26;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public final void method5916() {
		if (this.aClass28_26 != null) {
			this.aClass28_26.aClass28_25 = this.aClass28_25;
			this.aClass28_25.aClass28_26 = this.aClass28_26;
			this.aClass28_25 = null;
			this.aClass28_26 = null;
		}
	}
}
