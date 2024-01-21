import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!ja;")
	public Class2_Sub2 aClass2_Sub2_59;

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "Lclient!ja;")
	public Class2_Sub2 aClass2_Sub2_60;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
	public final void method1637() {
		if (this.aClass2_Sub2_60 != null) {
			this.aClass2_Sub2_60.aClass2_Sub2_59 = this.aClass2_Sub2_59;
			this.aClass2_Sub2_59.aClass2_Sub2_60 = this.aClass2_Sub2_60;
			this.aClass2_Sub2_59 = null;
			this.aClass2_Sub2_60 = null;
		}
	}
}
