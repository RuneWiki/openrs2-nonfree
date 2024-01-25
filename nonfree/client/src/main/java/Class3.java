import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class Class3 {

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!qg;")
	public Class3 aClass3_261;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "J")
	public long aLong234;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Lclient!qg;")
	public Class3 aClass3_262;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public final void method5977() {
		if (this.aClass3_262 != null) {
			this.aClass3_262.aClass3_261 = this.aClass3_261;
			this.aClass3_261.aClass3_262 = this.aClass3_262;
			this.aClass3_261 = null;
			this.aClass3_262 = null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)Z")
	public final boolean method5978() {
		return this.aClass3_262 != null;
	}
}
