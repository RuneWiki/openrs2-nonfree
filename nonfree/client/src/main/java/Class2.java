import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class Class2 {

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!d;")
	public Class2 aClass2_285;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "J")
	public long aLong268;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!d;")
	public Class2 aClass2_286;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	public final void method7966() {
		if (this.aClass2_285 != null) {
			this.aClass2_285.aClass2_286 = this.aClass2_286;
			this.aClass2_286.aClass2_285 = this.aClass2_285;
			this.aClass2_285 = null;
			this.aClass2_286 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)Z")
	public final boolean method7968() {
		return this.aClass2_285 != null;
	}
}
