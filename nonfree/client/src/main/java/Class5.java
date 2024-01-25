import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class Class5 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "J")
	public long aLong329;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Lclient!dn;")
	public Class5 aClass5_337;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!dn;")
	public Class5 aClass5_338;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z")
	public final boolean method8826() {
		return this.aClass5_338 != null;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	public final void method8829() {
		if (this.aClass5_338 != null) {
			this.aClass5_338.aClass5_337 = this.aClass5_337;
			this.aClass5_337.aClass5_338 = this.aClass5_338;
			this.aClass5_337 = null;
			this.aClass5_338 = null;
		}
	}
}
