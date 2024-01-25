import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class Class7 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!s;")
	public Class7 aClass7_247;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!s;")
	public Class7 aClass7_248;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "J")
	public long aLong232;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public final void method5648() {
		if (this.aClass7_248 != null) {
			this.aClass7_248.aClass7_247 = this.aClass7_247;
			this.aClass7_247.aClass7_248 = this.aClass7_248;
			this.aClass7_247 = null;
			this.aClass7_248 = null;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Z")
	public final boolean method5651() {
		return this.aClass7_248 != null;
	}
}
