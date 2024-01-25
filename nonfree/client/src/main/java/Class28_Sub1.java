import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!tg;")
	public Class28_Sub1 aClass28_Sub1_9;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Lclient!tg;")
	public Class28_Sub1 aClass28_Sub1_10;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public final void method5645() {
		if (this.aClass28_Sub1_9 != null) {
			this.aClass28_Sub1_9.aClass28_Sub1_10 = this.aClass28_Sub1_10;
			this.aClass28_Sub1_10.aClass28_Sub1_9 = this.aClass28_Sub1_9;
			this.aClass28_Sub1_9 = null;
			this.aClass28_Sub1_10 = null;
		}
	}
}
