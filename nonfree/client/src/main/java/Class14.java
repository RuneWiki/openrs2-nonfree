import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class Class14 {

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!wj;")
	public Class14 aClass14_339;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "J")
	public long aLong324;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!wj;")
	public Class14 aClass14_340;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z")
	public final boolean method9512() {
		return this.aClass14_340 != null;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public final void method9513() {
		if (this.aClass14_340 != null) {
			this.aClass14_340.aClass14_339 = this.aClass14_339;
			this.aClass14_339.aClass14_340 = this.aClass14_340;
			this.aClass14_340 = null;
			this.aClass14_339 = null;
		}
	}
}
