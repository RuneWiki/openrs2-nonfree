import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "Lclient!lr;")
	public Class11_Sub5 aClass11_Sub5_9;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "Lclient!lr;")
	public Class11_Sub5 aClass11_Sub5_10;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	public final void method3920() {
		if (this.aClass11_Sub5_10 != null) {
			this.aClass11_Sub5_10.aClass11_Sub5_9 = this.aClass11_Sub5_9;
			this.aClass11_Sub5_9.aClass11_Sub5_10 = this.aClass11_Sub5_10;
			this.aClass11_Sub5_9 = null;
			this.aClass11_Sub5_10 = null;
		}
	}
}
