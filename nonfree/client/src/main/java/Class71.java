import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class Class71 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!fe;")
	public Class71 aClass71_23;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!fe;")
	public Class71 aClass71_24;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public final void method6187() {
		if (this.aClass71_23 != null) {
			this.aClass71_23.aClass71_24 = this.aClass71_24;
			this.aClass71_24.aClass71_23 = this.aClass71_23;
			this.aClass71_23 = null;
			this.aClass71_24 = null;
		}
	}
}
