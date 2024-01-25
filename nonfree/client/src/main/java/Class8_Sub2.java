import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!wg;")
	public Class8_Sub2 aClass8_Sub2_7;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!wg;")
	public Class8_Sub2 aClass8_Sub2_8;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public final void method7400() {
		if (this.aClass8_Sub2_7 != null) {
			this.aClass8_Sub2_7.aClass8_Sub2_8 = this.aClass8_Sub2_8;
			this.aClass8_Sub2_8.aClass8_Sub2_7 = this.aClass8_Sub2_7;
			this.aClass8_Sub2_7 = null;
			this.aClass8_Sub2_8 = null;
		}
	}
}
