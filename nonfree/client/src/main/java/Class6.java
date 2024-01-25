import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class Class6 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!ia;")
	public Class6 aClass6_283;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "J")
	public long aLong245;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!ia;")
	public Class6 aClass6_284;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
	public final void method7948() {
		if (this.aClass6_283 != null) {
			this.aClass6_283.aClass6_284 = this.aClass6_284;
			this.aClass6_284.aClass6_283 = this.aClass6_283;
			this.aClass6_283 = null;
			this.aClass6_284 = null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)Z")
	public final boolean method7949() {
		return this.aClass6_283 != null;
	}
}
