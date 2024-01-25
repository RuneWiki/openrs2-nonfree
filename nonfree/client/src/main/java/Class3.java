import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Class3 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "J")
	public long aLong262;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!u;")
	public Class3 aClass3_285;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!u;")
	public Class3 aClass3_286;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	public final void method8128() {
		if (this.aClass3_286 != null) {
			this.aClass3_286.aClass3_285 = this.aClass3_285;
			this.aClass3_285.aClass3_286 = this.aClass3_286;
			this.aClass3_286 = null;
			this.aClass3_285 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Z")
	public final boolean method8129() {
		return this.aClass3_286 != null;
	}
}
