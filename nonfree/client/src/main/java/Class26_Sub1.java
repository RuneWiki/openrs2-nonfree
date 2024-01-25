import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!gk;")
	public Class26_Sub1 aClass26_Sub1_9;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "Lclient!gk;")
	public Class26_Sub1 aClass26_Sub1_10;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public final void method7579() {
		if (this.aClass26_Sub1_9 != null) {
			this.aClass26_Sub1_9.aClass26_Sub1_10 = this.aClass26_Sub1_10;
			this.aClass26_Sub1_10.aClass26_Sub1_9 = this.aClass26_Sub1_9;
			this.aClass26_Sub1_9 = null;
			this.aClass26_Sub1_10 = null;
		}
	}
}
