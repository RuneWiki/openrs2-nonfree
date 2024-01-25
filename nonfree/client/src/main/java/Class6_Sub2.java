import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Lclient!ig;")
	public Class6_Sub2 aClass6_Sub2_65;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "Lclient!ig;")
	public Class6_Sub2 aClass6_Sub2_66;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "J")
	public long aLong317;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
	public final void method8464() {
		if (this.aClass6_Sub2_66 != null) {
			this.aClass6_Sub2_66.aClass6_Sub2_65 = this.aClass6_Sub2_65;
			this.aClass6_Sub2_65.aClass6_Sub2_66 = this.aClass6_Sub2_66;
			this.aClass6_Sub2_65 = null;
			this.aClass6_Sub2_66 = null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Z")
	public final boolean method8470() {
		return this.aClass6_Sub2_66 != null;
	}
}
