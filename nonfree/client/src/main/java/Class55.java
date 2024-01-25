import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class Class55 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!hg;")
	public Class55 aClass55_23;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!hg;")
	public Class55 aClass55_24;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public final void method4599() {
		if (this.aClass55_24 != null) {
			this.aClass55_24.aClass55_23 = this.aClass55_23;
			this.aClass55_23.aClass55_24 = this.aClass55_24;
			this.aClass55_24 = null;
			this.aClass55_23 = null;
		}
	}
}
