import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!ha;")
	public Class5_Sub2 aClass5_Sub2_61;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "Lclient!ha;")
	public Class5_Sub2 aClass5_Sub2_62;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public final void method3014() {
		if (this.aClass5_Sub2_62 != null) {
			this.aClass5_Sub2_62.aClass5_Sub2_61 = this.aClass5_Sub2_61;
			this.aClass5_Sub2_61.aClass5_Sub2_62 = this.aClass5_Sub2_62;
			this.aClass5_Sub2_61 = null;
			this.aClass5_Sub2_62 = null;
		}
	}
}
