import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class Class25_Sub5 extends Class25 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!gf;")
	public Class25_Sub5 aClass25_Sub5_9;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!gf;")
	public Class25_Sub5 aClass25_Sub5_10;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	public final void method6962() {
		if (this.aClass25_Sub5_9 != null) {
			this.aClass25_Sub5_9.aClass25_Sub5_10 = this.aClass25_Sub5_10;
			this.aClass25_Sub5_10.aClass25_Sub5_9 = this.aClass25_Sub5_9;
			this.aClass25_Sub5_9 = null;
			this.aClass25_Sub5_10 = null;
		}
	}
}
