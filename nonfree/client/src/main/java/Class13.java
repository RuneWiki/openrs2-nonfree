import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class Class13 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ib;")
	public Class13 aClass13_67;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!ib;")
	public Class13 aClass13_68;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public final void method8394() {
		if (this.aClass13_68 != null) {
			this.aClass13_68.aClass13_67 = this.aClass13_67;
			this.aClass13_67.aClass13_68 = this.aClass13_68;
			this.aClass13_67 = null;
			this.aClass13_68 = null;
		}
	}
}
