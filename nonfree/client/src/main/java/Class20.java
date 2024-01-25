import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class Class20 {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!kc;")
	public Class20 aClass20_23;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!kc;")
	public Class20 aClass20_24;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public final void method5103() {
		if (this.aClass20_23 != null) {
			this.aClass20_23.aClass20_24 = this.aClass20_24;
			this.aClass20_24.aClass20_23 = this.aClass20_23;
			this.aClass20_24 = null;
			this.aClass20_23 = null;
		}
	}
}
