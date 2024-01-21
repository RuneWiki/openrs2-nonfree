import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "Lclient!ed;")
	public Class2_Sub1 aClass2_Sub1_59;

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "Lclient!ed;")
	public Class2_Sub1 aClass2_Sub1_60;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	public final void method1803() {
		if (this.aClass2_Sub1_60 != null) {
			this.aClass2_Sub1_60.aClass2_Sub1_59 = this.aClass2_Sub1_59;
			this.aClass2_Sub1_59.aClass2_Sub1_60 = this.aClass2_Sub1_60;
			this.aClass2_Sub1_59 = null;
			this.aClass2_Sub1_60 = null;
		}
	}
}
