import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "Lclient!cd;")
	public Class2_Sub1 aClass2_Sub1_63;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "Lclient!cd;")
	public Class2_Sub1 aClass2_Sub1_64;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public final void method2025() {
		if (this.aClass2_Sub1_63 != null) {
			this.aClass2_Sub1_63.aClass2_Sub1_64 = this.aClass2_Sub1_64;
			this.aClass2_Sub1_64.aClass2_Sub1_63 = this.aClass2_Sub1_63;
			this.aClass2_Sub1_64 = null;
			this.aClass2_Sub1_63 = null;
		}
	}
}
