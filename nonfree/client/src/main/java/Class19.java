import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class Class19 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "Lclient!bfa;")
	public Class19 aClass19_67;

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "Lclient!bfa;")
	public Class19 aClass19_68;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(B)V")
	public final void method9359() {
		if (this.aClass19_67 != null) {
			this.aClass19_67.aClass19_68 = this.aClass19_68;
			this.aClass19_68.aClass19_67 = this.aClass19_67;
			this.aClass19_68 = null;
			this.aClass19_67 = null;
		}
	}
}
