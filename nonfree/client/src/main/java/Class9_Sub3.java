import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!ug;")
	public Class9_Sub3 aClass9_Sub3_7;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Lclient!ug;")
	public Class9_Sub3 aClass9_Sub3_8;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public final void method5871() {
		if (this.aClass9_Sub3_7 != null) {
			this.aClass9_Sub3_7.aClass9_Sub3_8 = this.aClass9_Sub3_8;
			this.aClass9_Sub3_8.aClass9_Sub3_7 = this.aClass9_Sub3_7;
			this.aClass9_Sub3_7 = null;
			this.aClass9_Sub3_8 = null;
		}
	}
}
