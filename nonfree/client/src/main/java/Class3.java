import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class Class3 {

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "J")
	public long aLong273;

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "Lclient!iga;")
	public Class3 aClass3_285;

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "Lclient!iga;")
	public Class3 aClass3_286;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
	public final void method7812() {
		if (this.aClass3_286 != null) {
			this.aClass3_286.aClass3_285 = this.aClass3_285;
			this.aClass3_285.aClass3_286 = this.aClass3_286;
			this.aClass3_286 = null;
			this.aClass3_285 = null;
		}
	}

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "(I)Z")
	public final boolean method7813() {
		return this.aClass3_286 != null;
	}
}
