import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class Class8 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!gp;")
	public Class8 aClass8_23;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!gp;")
	public Class8 aClass8_24;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public final void method4645() {
		if (this.aClass8_24 != null) {
			this.aClass8_24.aClass8_23 = this.aClass8_23;
			this.aClass8_23.aClass8_24 = this.aClass8_24;
			this.aClass8_24 = null;
			this.aClass8_23 = null;
		}
	}
}
