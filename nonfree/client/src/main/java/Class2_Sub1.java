import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "Lclient!ea;")
	public Class2_Sub1 aClass2_Sub1_65;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Lclient!ea;")
	public Class2_Sub1 aClass2_Sub1_66;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
	public final void method2211() {
		if (this.aClass2_Sub1_66 != null) {
			this.aClass2_Sub1_66.aClass2_Sub1_65 = this.aClass2_Sub1_65;
			this.aClass2_Sub1_65.aClass2_Sub1_66 = this.aClass2_Sub1_66;
			this.aClass2_Sub1_65 = null;
			this.aClass2_Sub1_66 = null;
		}
	}
}
