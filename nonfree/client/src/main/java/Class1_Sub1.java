import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Lclient!jb;")
	public Class1_Sub1 aClass1_Sub1_65;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Lclient!jb;")
	public Class1_Sub1 aClass1_Sub1_66;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public final void method2079() {
		if (this.aClass1_Sub1_66 != null) {
			this.aClass1_Sub1_66.aClass1_Sub1_65 = this.aClass1_Sub1_65;
			this.aClass1_Sub1_65.aClass1_Sub1_66 = this.aClass1_Sub1_66;
			this.aClass1_Sub1_65 = null;
			this.aClass1_Sub1_66 = null;
		}
	}
}
