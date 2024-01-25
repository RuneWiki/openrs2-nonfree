import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class Class5 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Lclient!ko;")
	public Class5 aClass5_337;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "J")
	public long aLong307;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "Lclient!ko;")
	public Class5 aClass5_338;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Z")
	public final boolean method9048() {
		return this.aClass5_337 != null;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	public final void method9052() {
		if (this.aClass5_337 != null) {
			this.aClass5_337.aClass5_338 = this.aClass5_338;
			this.aClass5_338.aClass5_337 = this.aClass5_337;
			this.aClass5_338 = null;
			this.aClass5_337 = null;
		}
	}
}
