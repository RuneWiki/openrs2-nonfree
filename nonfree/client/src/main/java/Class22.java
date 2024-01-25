import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class Class22 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!nb;")
	public Class22 aClass22_23;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!nb;")
	public Class22 aClass22_24;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public final void method5237() {
		if (this.aClass22_23 != null) {
			this.aClass22_23.aClass22_24 = this.aClass22_24;
			this.aClass22_24.aClass22_23 = this.aClass22_23;
			this.aClass22_24 = null;
			this.aClass22_23 = null;
		}
	}
}
