import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class Class2 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Lclient!du;")
	public Class2 aClass2_285;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!du;")
	public Class2 aClass2_286;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "J")
	public long aLong268;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)Z")
	public final boolean method7656() {
		return this.aClass2_285 != null;
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(B)V")
	public final void method7657() {
		if (this.aClass2_285 != null) {
			this.aClass2_285.aClass2_286 = this.aClass2_286;
			this.aClass2_286.aClass2_285 = this.aClass2_285;
			this.aClass2_285 = null;
			this.aClass2_286 = null;
		}
	}
}
