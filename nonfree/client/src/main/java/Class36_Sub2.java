import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!of;")
	public Class36_Sub2 aClass36_Sub2_7;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "Lclient!of;")
	public Class36_Sub2 aClass36_Sub2_8;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public final void method5323() {
		if (this.aClass36_Sub2_7 != null) {
			this.aClass36_Sub2_7.aClass36_Sub2_8 = this.aClass36_Sub2_8;
			this.aClass36_Sub2_8.aClass36_Sub2_7 = this.aClass36_Sub2_7;
			this.aClass36_Sub2_7 = null;
			this.aClass36_Sub2_8 = null;
		}
	}
}
