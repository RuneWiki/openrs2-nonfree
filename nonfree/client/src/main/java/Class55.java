import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class Class55 {

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Lclient!gs;")
	public Class55 aClass55_25;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!gs;")
	public Class55 aClass55_26;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public final void method7112() {
		if (this.aClass55_25 != null) {
			this.aClass55_25.aClass55_26 = this.aClass55_26;
			this.aClass55_26.aClass55_25 = this.aClass55_25;
			this.aClass55_25 = null;
			this.aClass55_26 = null;
		}
	}
}
