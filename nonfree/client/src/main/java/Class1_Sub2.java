import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!r;")
	public Class1_Sub2 aClass1_Sub2_65;

	@OriginalMember(owner = "client!r", name = "K", descriptor = "Lclient!r;")
	public Class1_Sub2 aClass1_Sub2_66;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	public final void method1964() {
		if (this.aClass1_Sub2_65 != null) {
			this.aClass1_Sub2_65.aClass1_Sub2_66 = this.aClass1_Sub2_66;
			this.aClass1_Sub2_66.aClass1_Sub2_65 = this.aClass1_Sub2_65;
			this.aClass1_Sub2_65 = null;
			this.aClass1_Sub2_66 = null;
		}
	}
}
