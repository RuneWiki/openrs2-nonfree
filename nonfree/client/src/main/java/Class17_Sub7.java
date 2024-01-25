import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class Class17_Sub7 extends Class17 {

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Lclient!wk;")
	public Class17_Sub7 aClass17_Sub7_7;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!wk;")
	public Class17_Sub7 aClass17_Sub7_8;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	public final void method5477() {
		if (this.aClass17_Sub7_7 != null) {
			this.aClass17_Sub7_7.aClass17_Sub7_8 = this.aClass17_Sub7_8;
			this.aClass17_Sub7_8.aClass17_Sub7_7 = this.aClass17_Sub7_7;
			this.aClass17_Sub7_8 = null;
			this.aClass17_Sub7_7 = null;
		}
	}
}
