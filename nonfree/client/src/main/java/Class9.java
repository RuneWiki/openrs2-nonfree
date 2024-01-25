import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class Class9 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!mg;")
	public Class9 aClass9_67;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!mg;")
	public Class9 aClass9_68;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
	public final void method8593() {
		if (this.aClass9_67 != null) {
			this.aClass9_67.aClass9_68 = this.aClass9_68;
			this.aClass9_68.aClass9_67 = this.aClass9_67;
			this.aClass9_67 = null;
			this.aClass9_68 = null;
		}
	}
}
