import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class Class6 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
	public long aLong249;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!sf;")
	public Class6 aClass6_283;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!sf;")
	public Class6 aClass6_284;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Z")
	public final boolean method7848() {
		return this.aClass6_283 != null;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public final void method7849() {
		if (this.aClass6_283 != null) {
			this.aClass6_283.aClass6_284 = this.aClass6_284;
			this.aClass6_284.aClass6_283 = this.aClass6_283;
			this.aClass6_284 = null;
			this.aClass6_283 = null;
		}
	}
}
