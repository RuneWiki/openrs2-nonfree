import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class Class4 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!te;")
	public Class4 aClass4_232;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!te;")
	public Class4 aClass4_233;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public final void method4690() {
		if (this.aClass4_232 != null) {
			this.aClass4_232.aClass4_233 = this.aClass4_233;
			this.aClass4_233.aClass4_232 = this.aClass4_232;
			this.aClass4_233 = null;
			this.aClass4_232 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
	public final boolean method4694() {
		return this.aClass4_232 != null;
	}
}
