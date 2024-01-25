import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!we", name = "p", descriptor = "J")
	public long aLong272;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!we;")
	public Class6_Sub2 aClass6_Sub2_66;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!we;")
	public Class6_Sub2 aClass6_Sub2_67;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z")
	public final boolean method8752() {
		return this.aClass6_Sub2_67 != null;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public final void method8754() {
		if (this.aClass6_Sub2_67 != null) {
			this.aClass6_Sub2_67.aClass6_Sub2_66 = this.aClass6_Sub2_66;
			this.aClass6_Sub2_66.aClass6_Sub2_67 = this.aClass6_Sub2_67;
			this.aClass6_Sub2_66 = null;
			this.aClass6_Sub2_67 = null;
		}
	}
}
