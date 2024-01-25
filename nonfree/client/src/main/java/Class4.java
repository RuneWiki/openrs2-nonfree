import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class Class4 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!rf;")
	public Class4 aClass4_25;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!rf;")
	public Class4 aClass4_26;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public final void method5737() {
		if (this.aClass4_25 != null) {
			this.aClass4_25.aClass4_26 = this.aClass4_26;
			this.aClass4_26.aClass4_25 = this.aClass4_25;
			this.aClass4_25 = null;
			this.aClass4_26 = null;
		}
	}
}
