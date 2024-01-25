import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class Class4 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "J")
	public long aLong268;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!ii;")
	public Class4 aClass4_285;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!ii;")
	public Class4 aClass4_286;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V")
	public final void method8379() {
		if (this.aClass4_286 != null) {
			this.aClass4_286.aClass4_285 = this.aClass4_285;
			this.aClass4_285.aClass4_286 = this.aClass4_286;
			this.aClass4_285 = null;
			this.aClass4_286 = null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)Z")
	public final boolean method8381() {
		return this.aClass4_286 != null;
	}
}
