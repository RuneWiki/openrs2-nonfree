import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!uha", name = "n", descriptor = "Lclient!uha;")
	public Class9_Sub2 aClass9_Sub2_7;

	@OriginalMember(owner = "client!uha", name = "o", descriptor = "Lclient!uha;")
	public Class9_Sub2 aClass9_Sub2_8;

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	public final void method2168() {
		if (this.aClass9_Sub2_7 != null) {
			this.aClass9_Sub2_7.aClass9_Sub2_8 = this.aClass9_Sub2_8;
			this.aClass9_Sub2_8.aClass9_Sub2_7 = this.aClass9_Sub2_7;
			this.aClass9_Sub2_8 = null;
			this.aClass9_Sub2_7 = null;
		}
	}
}
