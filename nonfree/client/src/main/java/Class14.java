import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class Class14 {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Lclient!lq;")
	public Class14 aClass14_337;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Lclient!lq;")
	public Class14 aClass14_338;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "J")
	public long aLong305;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)Z")
	public final boolean method9314() {
		return this.aClass14_337 != null;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	public final void method9315() {
		if (this.aClass14_337 != null) {
			this.aClass14_337.aClass14_338 = this.aClass14_338;
			this.aClass14_338.aClass14_337 = this.aClass14_337;
			this.aClass14_337 = null;
			this.aClass14_338 = null;
		}
	}
}
