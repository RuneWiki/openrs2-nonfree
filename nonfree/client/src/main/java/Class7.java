import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Class7 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!ea;")
	public Class7 aClass7_261;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "J")
	public long aLong230;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!ea;")
	public Class7 aClass7_262;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
	public final boolean method5801() {
		return this.aClass7_261 != null;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public final void method5802() {
		if (this.aClass7_261 != null) {
			this.aClass7_261.aClass7_262 = this.aClass7_262;
			this.aClass7_262.aClass7_261 = this.aClass7_261;
			this.aClass7_261 = null;
			this.aClass7_262 = null;
		}
	}
}
