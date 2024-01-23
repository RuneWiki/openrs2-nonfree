import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "Lclient!uo;")
	public Class47_Sub2 aClass47_Sub2_5;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "Lclient!uo;")
	public Class47_Sub2 aClass47_Sub2_6;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	public final void method4483() {
		if (this.aClass47_Sub2_5 != null) {
			this.aClass47_Sub2_5.aClass47_Sub2_6 = this.aClass47_Sub2_6;
			this.aClass47_Sub2_6.aClass47_Sub2_5 = this.aClass47_Sub2_5;
			this.aClass47_Sub2_5 = null;
			this.aClass47_Sub2_6 = null;
		}
	}
}
