import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class Class6 {

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "Lclient!sja;")
	public Class6 aClass6_337;

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "J")
	public long aLong314;

	@OriginalMember(owner = "client!sja", name = "h", descriptor = "Lclient!sja;")
	public Class6 aClass6_338;

	@OriginalMember(owner = "client!sja", name = "e", descriptor = "(I)V")
	public final void method9174() {
		if (this.aClass6_337 != null) {
			this.aClass6_337.aClass6_338 = this.aClass6_338;
			this.aClass6_338.aClass6_337 = this.aClass6_337;
			this.aClass6_338 = null;
			this.aClass6_337 = null;
		}
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(B)Z")
	public final boolean method9176() {
		return this.aClass6_337 != null;
	}
}
