import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!ea;")
	public Class2_Sub1 aClass2_Sub1_61;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Lclient!ea;")
	public Class2_Sub1 aClass2_Sub1_62;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
	public final void method3186() {
		if (this.aClass2_Sub1_62 != null) {
			this.aClass2_Sub1_62.aClass2_Sub1_61 = this.aClass2_Sub1_61;
			this.aClass2_Sub1_61.aClass2_Sub1_62 = this.aClass2_Sub1_62;
			this.aClass2_Sub1_61 = null;
			this.aClass2_Sub1_62 = null;
		}
	}
}
