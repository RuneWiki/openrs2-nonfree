import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!en", name = "j", descriptor = "Lclient!en;")
	public Class28_Sub2 aClass28_Sub2_9;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "Lclient!en;")
	public Class28_Sub2 aClass28_Sub2_10;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	public final void method4121() {
		if (this.aClass28_Sub2_10 != null) {
			this.aClass28_Sub2_10.aClass28_Sub2_9 = this.aClass28_Sub2_9;
			this.aClass28_Sub2_9.aClass28_Sub2_10 = this.aClass28_Sub2_10;
			this.aClass28_Sub2_9 = null;
			this.aClass28_Sub2_10 = null;
		}
	}
}
