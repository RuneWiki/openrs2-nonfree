import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class Class8 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!gj;")
	public Class8 aClass8_21;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Lclient!gj;")
	public Class8 aClass8_22;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public final void method4763() {
		if (this.aClass8_22 != null) {
			this.aClass8_22.aClass8_21 = this.aClass8_21;
			this.aClass8_21.aClass8_22 = this.aClass8_22;
			this.aClass8_21 = null;
			this.aClass8_22 = null;
		}
	}
}
