import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!mc;")
	public Class4_Sub1 aClass4_Sub1_7;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!mc;")
	public Class4_Sub1 aClass4_Sub1_8;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public final void method5082() {
		if (this.aClass4_Sub1_7 != null) {
			this.aClass4_Sub1_7.aClass4_Sub1_8 = this.aClass4_Sub1_8;
			this.aClass4_Sub1_8.aClass4_Sub1_7 = this.aClass4_Sub1_7;
			this.aClass4_Sub1_8 = null;
			this.aClass4_Sub1_7 = null;
		}
	}
}
