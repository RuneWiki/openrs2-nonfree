import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class Class7 {

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "Lclient!ada;")
	public Class7 aClass7_25;

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "Lclient!ada;")
	public Class7 aClass7_26;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V")
	public final void method7760() {
		if (this.aClass7_26 != null) {
			this.aClass7_26.aClass7_25 = this.aClass7_25;
			this.aClass7_25.aClass7_26 = this.aClass7_26;
			this.aClass7_25 = null;
			this.aClass7_26 = null;
		}
	}
}
