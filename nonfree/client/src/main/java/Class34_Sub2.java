import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "Lclient!gg;")
	public Class34_Sub2 aClass34_Sub2_3;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "Lclient!gg;")
	public Class34_Sub2 aClass34_Sub2_4;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
	public final void method1567() {
		if (this.aClass34_Sub2_3 != null) {
			this.aClass34_Sub2_3.aClass34_Sub2_4 = this.aClass34_Sub2_4;
			this.aClass34_Sub2_4.aClass34_Sub2_3 = this.aClass34_Sub2_3;
			this.aClass34_Sub2_4 = null;
			this.aClass34_Sub2_3 = null;
		}
	}
}
