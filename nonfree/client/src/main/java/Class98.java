import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class Class98 {

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "Lclient!gga;")
	public Class98 aClass98_25;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "Lclient!gga;")
	public Class98 aClass98_26;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
	public final void method7855() {
		if (this.aClass98_25 != null) {
			this.aClass98_25.aClass98_26 = this.aClass98_26;
			this.aClass98_26.aClass98_25 = this.aClass98_25;
			this.aClass98_26 = null;
			this.aClass98_25 = null;
		}
	}
}
