import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class Class3 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "J")
	public long aLong240;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!ah;")
	public Class3 aClass3_243;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!ah;")
	public Class3 aClass3_244;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public final void method5700() {
		if (this.aClass3_244 != null) {
			this.aClass3_244.aClass3_243 = this.aClass3_243;
			this.aClass3_243.aClass3_244 = this.aClass3_244;
			this.aClass3_244 = null;
			this.aClass3_243 = null;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)Z")
	public final boolean method5702() {
		return this.aClass3_244 != null;
	}
}
