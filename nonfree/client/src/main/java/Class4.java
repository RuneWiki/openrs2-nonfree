import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class Class4 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!rc;")
	public Class4 aClass4_287;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!rc;")
	public Class4 aClass4_288;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "J")
	public long aLong307;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public final void method8013() {
		if (this.aClass4_288 != null) {
			this.aClass4_288.aClass4_287 = this.aClass4_287;
			this.aClass4_287.aClass4_288 = this.aClass4_288;
			this.aClass4_287 = null;
			this.aClass4_288 = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Z")
	public final boolean method8014() {
		return this.aClass4_288 != null;
	}
}
