import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class Class10 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!gh;")
	public Class10 aClass10_23;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!gh;")
	public Class10 aClass10_24;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public final void method4605() {
		if (this.aClass10_24 != null) {
			this.aClass10_24.aClass10_23 = this.aClass10_23;
			this.aClass10_23.aClass10_24 = this.aClass10_24;
			this.aClass10_24 = null;
			this.aClass10_23 = null;
		}
	}
}
