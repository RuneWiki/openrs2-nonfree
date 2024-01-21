import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OHSXMHUZ")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!OHSXMHUZ", name = "e", descriptor = "Lclient!OHSXMHUZ;")
	public Class1_Sub2 aClass1_Sub2_36;

	@OriginalMember(owner = "client!OHSXMHUZ", name = "f", descriptor = "Lclient!OHSXMHUZ;")
	public Class1_Sub2 aClass1_Sub2_37;

	@OriginalMember(owner = "client!OHSXMHUZ", name = "b", descriptor = "()V")
	public final void method572() {
		if (this.aClass1_Sub2_37 != null) {
			this.aClass1_Sub2_37.aClass1_Sub2_36 = this.aClass1_Sub2_36;
			this.aClass1_Sub2_36.aClass1_Sub2_37 = this.aClass1_Sub2_37;
			this.aClass1_Sub2_36 = null;
			this.aClass1_Sub2_37 = null;
		}
	}
}
