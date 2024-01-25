import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class Class30 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient!po;")
	public Class30 aClass30_25;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Lclient!po;")
	public Class30 aClass30_26;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public final void method6004() {
		if (this.aClass30_25 != null) {
			this.aClass30_25.aClass30_26 = this.aClass30_26;
			this.aClass30_26.aClass30_25 = this.aClass30_25;
			this.aClass30_26 = null;
			this.aClass30_25 = null;
		}
	}
}
