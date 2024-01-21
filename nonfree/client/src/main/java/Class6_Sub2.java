import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!re", name = "I", descriptor = "Lclient!re;")
	public Class6_Sub2 aClass6_Sub2_61;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "Lclient!re;")
	public Class6_Sub2 aClass6_Sub2_62;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	public final void method2094() {
		if (this.aClass6_Sub2_62 != null) {
			this.aClass6_Sub2_62.aClass6_Sub2_61 = this.aClass6_Sub2_61;
			this.aClass6_Sub2_61.aClass6_Sub2_62 = this.aClass6_Sub2_62;
			this.aClass6_Sub2_62 = null;
			this.aClass6_Sub2_61 = null;
		}
	}
}
