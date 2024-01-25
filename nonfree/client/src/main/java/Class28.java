import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class Class28 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!pi;")
	public Class28 aClass28_25;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!pi;")
	public Class28 aClass28_26;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public final void method5642() {
		if (this.aClass28_26 != null) {
			this.aClass28_26.aClass28_25 = this.aClass28_25;
			this.aClass28_25.aClass28_26 = this.aClass28_26;
			this.aClass28_25 = null;
			this.aClass28_26 = null;
		}
	}
}
