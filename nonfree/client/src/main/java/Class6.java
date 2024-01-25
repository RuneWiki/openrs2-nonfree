import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class Class6 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!bk;")
	public Class6 aClass6_25;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!bk;")
	public Class6 aClass6_26;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public final void method7058() {
		if (this.aClass6_25 != null) {
			this.aClass6_25.aClass6_26 = this.aClass6_26;
			this.aClass6_26.aClass6_25 = this.aClass6_25;
			this.aClass6_25 = null;
			this.aClass6_26 = null;
		}
	}
}
