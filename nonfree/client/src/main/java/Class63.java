import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class Class63 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!qk;")
	public Class63 aClass63_23;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "Lclient!qk;")
	public Class63 aClass63_24;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public final void method5690() {
		if (this.aClass63_23 != null) {
			this.aClass63_23.aClass63_24 = this.aClass63_24;
			this.aClass63_24.aClass63_23 = this.aClass63_23;
			this.aClass63_24 = null;
			this.aClass63_23 = null;
		}
	}
}
