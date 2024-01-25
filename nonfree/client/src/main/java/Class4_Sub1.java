import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!ac;")
	public Class4_Sub1 aClass4_Sub1_9;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!ac;")
	public Class4_Sub1 aClass4_Sub1_10;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public final void method4555() {
		if (this.aClass4_Sub1_10 != null) {
			this.aClass4_Sub1_10.aClass4_Sub1_9 = this.aClass4_Sub1_9;
			this.aClass4_Sub1_9.aClass4_Sub1_10 = this.aClass4_Sub1_10;
			this.aClass4_Sub1_10 = null;
			this.aClass4_Sub1_9 = null;
		}
	}
}
