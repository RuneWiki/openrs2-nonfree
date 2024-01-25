import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class Class23 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Lclient!gv;")
	public Class23 aClass23_67;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!gv;")
	public Class23 aClass23_68;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
	public final void method8588() {
		if (this.aClass23_68 != null) {
			this.aClass23_68.aClass23_67 = this.aClass23_67;
			this.aClass23_67.aClass23_68 = this.aClass23_68;
			this.aClass23_67 = null;
			this.aClass23_68 = null;
		}
	}
}
