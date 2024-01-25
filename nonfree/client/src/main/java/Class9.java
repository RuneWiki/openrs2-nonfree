import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class Class9 {

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!vc;")
	public Class9 aClass9_67;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!vc;")
	public Class9 aClass9_68;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public final void method9182() {
		if (this.aClass9_68 != null) {
			this.aClass9_68.aClass9_67 = this.aClass9_67;
			this.aClass9_67.aClass9_68 = this.aClass9_68;
			this.aClass9_68 = null;
			this.aClass9_67 = null;
		}
	}
}
