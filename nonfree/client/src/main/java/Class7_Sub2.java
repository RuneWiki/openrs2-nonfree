import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!ok;")
	public Class7_Sub2 aClass7_Sub2_5;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Lclient!ok;")
	public Class7_Sub2 aClass7_Sub2_6;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	public final void method740() {
		if (this.aClass7_Sub2_6 != null) {
			this.aClass7_Sub2_6.aClass7_Sub2_5 = this.aClass7_Sub2_5;
			this.aClass7_Sub2_5.aClass7_Sub2_6 = this.aClass7_Sub2_6;
			this.aClass7_Sub2_6 = null;
			this.aClass7_Sub2_5 = null;
		}
	}
}
