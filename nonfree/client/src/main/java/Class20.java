import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class Class20 {

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!gda;")
	public Class20 aClass20_67;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "Lclient!gda;")
	public Class20 aClass20_68;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)V")
	public final void method9004() {
		if (this.aClass20_68 != null) {
			this.aClass20_68.aClass20_67 = this.aClass20_67;
			this.aClass20_67.aClass20_68 = this.aClass20_68;
			this.aClass20_67 = null;
			this.aClass20_68 = null;
		}
	}
}
