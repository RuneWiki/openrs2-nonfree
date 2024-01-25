import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class Class25 {

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "Lclient!jea;")
	public Class25 aClass25_67;

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "Lclient!jea;")
	public Class25 aClass25_68;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)V")
	public final void method6959() {
		if (this.aClass25_67 != null) {
			this.aClass25_67.aClass25_68 = this.aClass25_68;
			this.aClass25_68.aClass25_67 = this.aClass25_67;
			this.aClass25_67 = null;
			this.aClass25_68 = null;
		}
	}
}
