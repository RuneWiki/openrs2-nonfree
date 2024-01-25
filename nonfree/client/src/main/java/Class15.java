import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class Class15 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "Lclient!rs;")
	public Class15 aClass15_23;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!rs;")
	public Class15 aClass15_24;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public final void method5441() {
		if (this.aClass15_23 != null) {
			this.aClass15_23.aClass15_24 = this.aClass15_24;
			this.aClass15_24.aClass15_23 = this.aClass15_23;
			this.aClass15_23 = null;
			this.aClass15_24 = null;
		}
	}
}
