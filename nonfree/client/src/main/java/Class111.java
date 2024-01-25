import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class Class111 {

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Lclient!nn;")
	public Class111 aClass111_25;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Lclient!nn;")
	public Class111 aClass111_26;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	public final void method5886() {
		if (this.aClass111_26 != null) {
			this.aClass111_26.aClass111_25 = this.aClass111_25;
			this.aClass111_25.aClass111_26 = this.aClass111_26;
			this.aClass111_25 = null;
			this.aClass111_26 = null;
		}
	}
}
