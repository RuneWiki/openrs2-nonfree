import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Lclient!fu;")
	public Class6_Sub2 aClass6_Sub2_61;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "J")
	public long aLong247;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "Lclient!fu;")
	public Class6_Sub2 aClass6_Sub2_62;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)Z")
	public final boolean method7403() {
		return this.aClass6_Sub2_61 != null;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public final void method7405() {
		if (this.aClass6_Sub2_61 != null) {
			this.aClass6_Sub2_61.aClass6_Sub2_62 = this.aClass6_Sub2_62;
			this.aClass6_Sub2_62.aClass6_Sub2_61 = this.aClass6_Sub2_61;
			this.aClass6_Sub2_61 = null;
			this.aClass6_Sub2_62 = null;
		}
	}
}
