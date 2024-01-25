import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class Class6 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!mu;")
	public Class6 aClass6_283;

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "Lclient!mu;")
	public Class6 aClass6_284;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "J")
	public long aLong252;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
	public final void method8151() {
		if (this.aClass6_284 != null) {
			this.aClass6_284.aClass6_283 = this.aClass6_283;
			this.aClass6_283.aClass6_284 = this.aClass6_284;
			this.aClass6_283 = null;
			this.aClass6_284 = null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)Z")
	public final boolean method8152() {
		return this.aClass6_284 != null;
	}
}
