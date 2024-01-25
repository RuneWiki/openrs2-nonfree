import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class Class2 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Lclient!it;")
	public Class2 aClass2_337;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!it;")
	public Class2 aClass2_338;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "J")
	public long aLong313;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)Z")
	public final boolean method9823() {
		return this.aClass2_337 != null;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
	public final void method9825() {
		if (this.aClass2_337 != null) {
			this.aClass2_337.aClass2_338 = this.aClass2_338;
			this.aClass2_338.aClass2_337 = this.aClass2_337;
			this.aClass2_337 = null;
			this.aClass2_338 = null;
		}
	}
}
