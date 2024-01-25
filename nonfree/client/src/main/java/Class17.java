import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class Class17 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Lclient!jq;")
	public Class17 aClass17_23;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!jq;")
	public Class17 aClass17_24;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public final void method5473() {
		if (this.aClass17_24 != null) {
			this.aClass17_24.aClass17_23 = this.aClass17_23;
			this.aClass17_23.aClass17_24 = this.aClass17_24;
			this.aClass17_23 = null;
			this.aClass17_24 = null;
		}
	}
}
