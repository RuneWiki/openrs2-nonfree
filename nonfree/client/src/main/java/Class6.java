import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class Class6 {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!gs;")
	public Class6 aClass6_23;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!gs;")
	public Class6 aClass6_24;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
	public final void method5914() {
		if (this.aClass6_23 != null) {
			this.aClass6_23.aClass6_24 = this.aClass6_24;
			this.aClass6_24.aClass6_23 = this.aClass6_23;
			this.aClass6_24 = null;
			this.aClass6_23 = null;
		}
	}
}
