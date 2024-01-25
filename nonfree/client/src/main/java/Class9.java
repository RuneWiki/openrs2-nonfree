import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class Class9 {

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "Lclient!ru;")
	public Class9 aClass9_67;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!ru;")
	public Class9 aClass9_68;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	public final void method7465() {
		if (this.aClass9_67 != null) {
			this.aClass9_67.aClass9_68 = this.aClass9_68;
			this.aClass9_68.aClass9_67 = this.aClass9_67;
			this.aClass9_67 = null;
			this.aClass9_68 = null;
		}
	}
}
