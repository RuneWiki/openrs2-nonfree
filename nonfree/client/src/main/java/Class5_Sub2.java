import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!qd;")
	public Class5_Sub2 aClass5_Sub2_63;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!qd;")
	public Class5_Sub2 aClass5_Sub2_64;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public final void method2116() {
		if (this.aClass5_Sub2_64 != null) {
			this.aClass5_Sub2_64.aClass5_Sub2_63 = this.aClass5_Sub2_63;
			this.aClass5_Sub2_63.aClass5_Sub2_64 = this.aClass5_Sub2_64;
			this.aClass5_Sub2_63 = null;
			this.aClass5_Sub2_64 = null;
		}
	}
}
