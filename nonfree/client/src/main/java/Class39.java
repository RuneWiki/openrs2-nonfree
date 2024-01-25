import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class Class39 {

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Lclient!gj;")
	public Class39 aClass39_23;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Lclient!gj;")
	public Class39 aClass39_24;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public final void method5616() {
		if (this.aClass39_23 != null) {
			this.aClass39_23.aClass39_24 = this.aClass39_24;
			this.aClass39_24.aClass39_23 = this.aClass39_23;
			this.aClass39_24 = null;
			this.aClass39_23 = null;
		}
	}
}
