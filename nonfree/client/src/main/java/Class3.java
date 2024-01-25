import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class Class3 {

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "J")
	public long aLong311;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "Lclient!dba;")
	public Class3 aClass3_337;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "Lclient!dba;")
	public Class3 aClass3_338;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)Z")
	public final boolean method9378() {
		return this.aClass3_338 != null;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
	public final void method9380() {
		if (this.aClass3_338 != null) {
			this.aClass3_338.aClass3_337 = this.aClass3_337;
			this.aClass3_337.aClass3_338 = this.aClass3_338;
			this.aClass3_337 = null;
			this.aClass3_338 = null;
		}
	}
}
