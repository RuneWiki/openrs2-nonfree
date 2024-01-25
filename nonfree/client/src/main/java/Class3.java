import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class Class3 {

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!lf;")
	public Class3 aClass3_261;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!lf;")
	public Class3 aClass3_262;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "J")
	public long aLong227;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
	public final boolean method5985() {
		return this.aClass3_262 != null;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public final void method5987() {
		if (this.aClass3_262 != null) {
			this.aClass3_262.aClass3_261 = this.aClass3_261;
			this.aClass3_261.aClass3_262 = this.aClass3_262;
			this.aClass3_262 = null;
			this.aClass3_261 = null;
		}
	}
}
