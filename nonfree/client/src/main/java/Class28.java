import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class Class28 {

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Lclient!gk;")
	public Class28 aClass28_67;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!gk;")
	public Class28 aClass28_68;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public final void method9276() {
		if (this.aClass28_67 != null) {
			this.aClass28_67.aClass28_68 = this.aClass28_68;
			this.aClass28_68.aClass28_67 = this.aClass28_67;
			this.aClass28_67 = null;
			this.aClass28_68 = null;
		}
	}
}
