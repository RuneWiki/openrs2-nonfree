import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!uc;")
	public Class1_Sub2 aClass1_Sub2_71;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!uc;")
	public Class1_Sub2 aClass1_Sub2_72;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public final void method2789() {
		if (this.aClass1_Sub2_71 != null) {
			this.aClass1_Sub2_71.aClass1_Sub2_72 = this.aClass1_Sub2_72;
			this.aClass1_Sub2_72.aClass1_Sub2_71 = this.aClass1_Sub2_71;
			this.aClass1_Sub2_71 = null;
			this.aClass1_Sub2_72 = null;
		}
	}
}
