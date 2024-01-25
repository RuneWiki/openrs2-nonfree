import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class Class102 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Lclient!uv;")
	public Class102 aClass102_25;

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "Lclient!uv;")
	public Class102 aClass102_26;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	public final void method7587() {
		if (this.aClass102_25 != null) {
			this.aClass102_25.aClass102_26 = this.aClass102_26;
			this.aClass102_26.aClass102_25 = this.aClass102_25;
			this.aClass102_25 = null;
			this.aClass102_26 = null;
		}
	}
}
