import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class Class6 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!wb;")
	public Class6 aClass6_339;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!wb;")
	public Class6 aClass6_340;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "J")
	public long aLong346;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)Z")
	public final boolean method9050() {
		return this.aClass6_340 != null;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public final void method9051() {
		if (this.aClass6_340 != null) {
			this.aClass6_340.aClass6_339 = this.aClass6_339;
			this.aClass6_339.aClass6_340 = this.aClass6_340;
			this.aClass6_340 = null;
			this.aClass6_339 = null;
		}
	}
}
