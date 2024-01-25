import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class Class34 {

	@OriginalMember(owner = "client!via", name = "d", descriptor = "Lclient!via;")
	public Class34 aClass34_67;

	@OriginalMember(owner = "client!via", name = "f", descriptor = "Lclient!via;")
	public Class34 aClass34_68;

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(I)V")
	public final void method8764() {
		if (this.aClass34_67 != null) {
			this.aClass34_67.aClass34_68 = this.aClass34_68;
			this.aClass34_68.aClass34_67 = this.aClass34_67;
			this.aClass34_67 = null;
			this.aClass34_68 = null;
		}
	}
}
