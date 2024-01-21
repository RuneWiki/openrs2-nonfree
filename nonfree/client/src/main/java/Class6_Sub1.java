import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PFQOGDTY")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!PFQOGDTY", name = "g", descriptor = "Lclient!PFQOGDTY;")
	public Class6_Sub1 aClass6_Sub1_36;

	@OriginalMember(owner = "client!PFQOGDTY", name = "h", descriptor = "Lclient!PFQOGDTY;")
	public Class6_Sub1 aClass6_Sub1_37;

	@OriginalMember(owner = "client!PFQOGDTY", name = "f", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!PFQOGDTY", name = "b", descriptor = "()V")
	public final void method549() {
		if (this.aClass6_Sub1_37 != null) {
			this.aClass6_Sub1_37.aClass6_Sub1_36 = this.aClass6_Sub1_36;
			this.aClass6_Sub1_36.aClass6_Sub1_37 = this.aClass6_Sub1_37;
			this.aClass6_Sub1_36 = null;
			this.aClass6_Sub1_37 = null;
		}
	}
}
