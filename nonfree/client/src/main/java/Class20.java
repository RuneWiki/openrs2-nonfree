import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class Class20 {

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Lclient!cv;")
	public Class20 aClass20_67;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!cv;")
	public Class20 aClass20_68;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
	public final void method7704() {
		if (this.aClass20_68 != null) {
			this.aClass20_68.aClass20_67 = this.aClass20_67;
			this.aClass20_67.aClass20_68 = this.aClass20_68;
			this.aClass20_68 = null;
			this.aClass20_67 = null;
		}
	}
}
