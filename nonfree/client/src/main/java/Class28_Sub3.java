import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "Lclient!ica;")
	public Class28_Sub3 aClass28_Sub3_9;

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "Lclient!ica;")
	public Class28_Sub3 aClass28_Sub3_10;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	public final void method7882() {
		if (this.aClass28_Sub3_10 != null) {
			this.aClass28_Sub3_10.aClass28_Sub3_9 = this.aClass28_Sub3_9;
			this.aClass28_Sub3_9.aClass28_Sub3_10 = this.aClass28_Sub3_10;
			this.aClass28_Sub3_9 = null;
			this.aClass28_Sub3_10 = null;
		}
	}
}
