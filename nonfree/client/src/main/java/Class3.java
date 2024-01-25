import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class Class3 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!md;")
	public Class3 aClass3_23;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!md;")
	public Class3 aClass3_24;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public final void method5676() {
		if (this.aClass3_24 != null) {
			this.aClass3_24.aClass3_23 = this.aClass3_23;
			this.aClass3_23.aClass3_24 = this.aClass3_24;
			this.aClass3_24 = null;
			this.aClass3_23 = null;
		}
	}
}
