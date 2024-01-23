import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class Class20 {

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!qd;")
	public Class20 aClass20_11;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!qd;")
	public Class20 aClass20_12;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public final void method4753() {
		if (this.aClass20_11 != null) {
			this.aClass20_11.aClass20_12 = this.aClass20_12;
			this.aClass20_12.aClass20_11 = this.aClass20_11;
			this.aClass20_11 = null;
			this.aClass20_12 = null;
		}
	}
}
