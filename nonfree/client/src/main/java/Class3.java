import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class Class3 {

	@OriginalMember(owner = "client!an", name = "g", descriptor = "J")
	public long aLong382;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!an;")
	public Class3 aClass3_341;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Lclient!an;")
	public Class3 aClass3_342;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)Z")
	public final boolean method9443() {
		return this.aClass3_342 != null;
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V")
	public final void method9446() {
		if (this.aClass3_342 != null) {
			this.aClass3_342.aClass3_341 = this.aClass3_341;
			this.aClass3_341.aClass3_342 = this.aClass3_342;
			this.aClass3_342 = null;
			this.aClass3_341 = null;
		}
	}
}
