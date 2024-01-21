import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Lclient!kb;")
	public Class2_Sub1 aClass2_Sub1_58;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Lclient!kb;")
	public Class2_Sub1 aClass2_Sub1_59;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	public final void method1702() {
		if (this.aClass2_Sub1_59 != null) {
			this.aClass2_Sub1_59.aClass2_Sub1_58 = this.aClass2_Sub1_58;
			this.aClass2_Sub1_58.aClass2_Sub1_59 = this.aClass2_Sub1_59;
			this.aClass2_Sub1_59 = null;
			this.aClass2_Sub1_58 = null;
		}
	}
}
