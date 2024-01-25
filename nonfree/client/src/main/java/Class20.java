import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class Class20 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!jt;")
	public Class20 aClass20_23;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!jt;")
	public Class20 aClass20_24;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	public final void method5771() {
		if (this.aClass20_23 != null) {
			this.aClass20_23.aClass20_24 = this.aClass20_24;
			this.aClass20_24.aClass20_23 = this.aClass20_23;
			this.aClass20_23 = null;
			this.aClass20_24 = null;
		}
	}
}
