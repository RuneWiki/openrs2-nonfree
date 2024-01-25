import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class Class7 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!af;")
	public Class7 aClass7_23;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!af;")
	public Class7 aClass7_24;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public final void method3450() {
		if (this.aClass7_23 != null) {
			this.aClass7_23.aClass7_24 = this.aClass7_24;
			this.aClass7_24.aClass7_23 = this.aClass7_23;
			this.aClass7_23 = null;
			this.aClass7_24 = null;
		}
	}
}
