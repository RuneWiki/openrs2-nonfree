import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class Class15_Sub5 extends Class15 {

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!wm;")
	public Class15_Sub5 aClass15_Sub5_9;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "Lclient!wm;")
	public Class15_Sub5 aClass15_Sub5_10;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
	public final void method8189() {
		if (this.aClass15_Sub5_10 != null) {
			this.aClass15_Sub5_10.aClass15_Sub5_9 = this.aClass15_Sub5_9;
			this.aClass15_Sub5_9.aClass15_Sub5_10 = this.aClass15_Sub5_10;
			this.aClass15_Sub5_9 = null;
			this.aClass15_Sub5_10 = null;
		}
	}
}
