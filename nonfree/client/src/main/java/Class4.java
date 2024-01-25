import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class Class4 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!vg;")
	public Class4 aClass4_261;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "J")
	public long aLong225;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Lclient!vg;")
	public Class4 aClass4_262;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public final void method5854() {
		if (this.aClass4_262 != null) {
			this.aClass4_262.aClass4_261 = this.aClass4_261;
			this.aClass4_261.aClass4_262 = this.aClass4_262;
			this.aClass4_261 = null;
			this.aClass4_262 = null;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z")
	public final boolean method5857() {
		return this.aClass4_262 != null;
	}
}
