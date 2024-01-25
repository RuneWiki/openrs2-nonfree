import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class Class4 {

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "Lclient!tv;")
	public Class4 aClass4_285;

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "Lclient!tv;")
	public Class4 aClass4_286;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "J")
	public long aLong295;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
	public final void method8193() {
		if (this.aClass4_285 != null) {
			this.aClass4_285.aClass4_286 = this.aClass4_286;
			this.aClass4_286.aClass4_285 = this.aClass4_285;
			this.aClass4_285 = null;
			this.aClass4_286 = null;
		}
	}

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)Z")
	public final boolean method8199() {
		return this.aClass4_285 != null;
	}
}
