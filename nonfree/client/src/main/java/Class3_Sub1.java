import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WLTWEDNK")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!WLTWEDNK", name = "f", descriptor = "Lclient!WLTWEDNK;")
	public Class3_Sub1 aClass3_Sub1_36;

	@OriginalMember(owner = "client!WLTWEDNK", name = "g", descriptor = "Lclient!WLTWEDNK;")
	public Class3_Sub1 aClass3_Sub1_37;

	@OriginalMember(owner = "client!WLTWEDNK", name = "e", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!WLTWEDNK", name = "b", descriptor = "()V")
	public final void method536() {
		if (this.aClass3_Sub1_37 != null) {
			this.aClass3_Sub1_37.aClass3_Sub1_36 = this.aClass3_Sub1_36;
			this.aClass3_Sub1_36.aClass3_Sub1_37 = this.aClass3_Sub1_37;
			this.aClass3_Sub1_36 = null;
			this.aClass3_Sub1_37 = null;
		}
	}
}
