import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "Lclient!aca;")
	public Class6_Sub1 aClass6_Sub1_9;

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "Lclient!aca;")
	public Class6_Sub1 aClass6_Sub1_10;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)V")
	public final void method6809() {
		if (this.aClass6_Sub1_10 != null) {
			this.aClass6_Sub1_10.aClass6_Sub1_9 = this.aClass6_Sub1_9;
			this.aClass6_Sub1_9.aClass6_Sub1_10 = this.aClass6_Sub1_10;
			this.aClass6_Sub1_9 = null;
			this.aClass6_Sub1_10 = null;
		}
	}
}
