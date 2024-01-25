import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class Class4 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!oq;")
	public Class4 aClass4_337;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Lclient!oq;")
	public Class4 aClass4_338;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "J")
	public long aLong307;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)V")
	public final void method9000() {
		if (this.aClass4_338 != null) {
			this.aClass4_338.aClass4_337 = this.aClass4_337;
			this.aClass4_337.aClass4_338 = this.aClass4_338;
			this.aClass4_337 = null;
			this.aClass4_338 = null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)Z")
	public final boolean method9002() {
		return this.aClass4_338 != null;
	}
}
