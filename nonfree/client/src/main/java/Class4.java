import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class Class4 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!mu;")
	public Class4 aClass4_23;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!mu;")
	public Class4 aClass4_24;

	static {
		new Class119("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
	public final void method5572() {
		if (this.aClass4_23 != null) {
			this.aClass4_23.aClass4_24 = this.aClass4_24;
			this.aClass4_24.aClass4_23 = this.aClass4_23;
			this.aClass4_24 = null;
			this.aClass4_23 = null;
		}
	}
}
