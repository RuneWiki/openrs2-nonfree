import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EWMBJETC")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!EWMBJETC", name = "f", descriptor = "Lclient!EWMBJETC;")
	public Class6_Sub2 aClass6_Sub2_36;

	@OriginalMember(owner = "client!EWMBJETC", name = "g", descriptor = "Lclient!EWMBJETC;")
	public Class6_Sub2 aClass6_Sub2_37;

	@OriginalMember(owner = "client!EWMBJETC", name = "e", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!EWMBJETC", name = "b", descriptor = "()V")
	public final void method513() {
		if (this.aClass6_Sub2_37 != null) {
			this.aClass6_Sub2_37.aClass6_Sub2_36 = this.aClass6_Sub2_36;
			this.aClass6_Sub2_36.aClass6_Sub2_37 = this.aClass6_Sub2_37;
			this.aClass6_Sub2_36 = null;
			this.aClass6_Sub2_37 = null;
		}
	}
}
