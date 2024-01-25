import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "Lclient!taa;")
	public Class15_Sub2 aClass15_Sub2_7;

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "Lclient!taa;")
	public Class15_Sub2 aClass15_Sub2_8;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public final void method9316() {
		if (this.aClass15_Sub2_7 != null) {
			this.aClass15_Sub2_7.aClass15_Sub2_8 = this.aClass15_Sub2_8;
			this.aClass15_Sub2_8.aClass15_Sub2_7 = this.aClass15_Sub2_7;
			this.aClass15_Sub2_8 = null;
			this.aClass15_Sub2_7 = null;
		}
	}
}
