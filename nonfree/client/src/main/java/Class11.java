import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class Class11 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!ia;")
	public Class11 aClass11_67;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!ia;")
	public Class11 aClass11_68;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
	public final void method7200() {
		if (this.aClass11_68 != null) {
			this.aClass11_68.aClass11_67 = this.aClass11_67;
			this.aClass11_67.aClass11_68 = this.aClass11_68;
			this.aClass11_68 = null;
			this.aClass11_67 = null;
		}
	}
}
