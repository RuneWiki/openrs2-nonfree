import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Lclient!nk;")
	public Class4_Sub2 aClass4_Sub2_9;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Lclient!nk;")
	public Class4_Sub2 aClass4_Sub2_10;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	public final void method5702() {
		if (this.aClass4_Sub2_10 != null) {
			this.aClass4_Sub2_10.aClass4_Sub2_9 = this.aClass4_Sub2_9;
			this.aClass4_Sub2_9.aClass4_Sub2_10 = this.aClass4_Sub2_10;
			this.aClass4_Sub2_9 = null;
			this.aClass4_Sub2_10 = null;
		}
	}
}
