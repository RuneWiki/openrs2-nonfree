import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Lclient!mg;")
	public Class6_Sub2 aClass6_Sub2_55;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "Lclient!mg;")
	public Class6_Sub2 aClass6_Sub2_56;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "J")
	public long aLong225;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)Z")
	public final boolean method6371() {
		return this.aClass6_Sub2_55 != null;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V")
	public final void method6373() {
		if (this.aClass6_Sub2_55 != null) {
			this.aClass6_Sub2_55.aClass6_Sub2_56 = this.aClass6_Sub2_56;
			this.aClass6_Sub2_56.aClass6_Sub2_55 = this.aClass6_Sub2_55;
			this.aClass6_Sub2_55 = null;
			this.aClass6_Sub2_56 = null;
		}
	}
}
