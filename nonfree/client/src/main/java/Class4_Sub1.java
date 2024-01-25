import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "Lclient!pw;")
	public Class4_Sub1 aClass4_Sub1_9;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "Lclient!pw;")
	public Class4_Sub1 aClass4_Sub1_10;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
	public final void method5235() {
		if (this.aClass4_Sub1_10 != null) {
			this.aClass4_Sub1_10.aClass4_Sub1_9 = this.aClass4_Sub1_9;
			this.aClass4_Sub1_9.aClass4_Sub1_10 = this.aClass4_Sub1_10;
			this.aClass4_Sub1_10 = null;
			this.aClass4_Sub1_9 = null;
		}
	}
}
