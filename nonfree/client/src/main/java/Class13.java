import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class Class13 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!ts;")
	public Class13 aClass13_23;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!ts;")
	public Class13 aClass13_24;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public final void method5413() {
		if (this.aClass13_23 != null) {
			this.aClass13_23.aClass13_24 = this.aClass13_24;
			this.aClass13_24.aClass13_23 = this.aClass13_23;
			this.aClass13_24 = null;
			this.aClass13_23 = null;
		}
	}
}
