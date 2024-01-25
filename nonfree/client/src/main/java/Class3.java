import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class Class3 {

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "Lclient!gga;")
	public Class3 aClass3_285;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "J")
	public long aLong273;

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "Lclient!gga;")
	public Class3 aClass3_286;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(I)V")
	public final void method7825() {
		if (this.aClass3_285 != null) {
			this.aClass3_285.aClass3_286 = this.aClass3_286;
			this.aClass3_286.aClass3_285 = this.aClass3_285;
			this.aClass3_286 = null;
			this.aClass3_285 = null;
		}
	}

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "(I)Z")
	public final boolean method7828() {
		return this.aClass3_285 != null;
	}
}
