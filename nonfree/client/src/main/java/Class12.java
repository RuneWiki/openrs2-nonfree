import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class Class12 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!ik;")
	public Class12 aClass12_283;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!ik;")
	public Class12 aClass12_284;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "J")
	public long aLong248;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
	public final void method7967() {
		if (this.aClass12_284 != null) {
			this.aClass12_284.aClass12_283 = this.aClass12_283;
			this.aClass12_283.aClass12_284 = this.aClass12_284;
			this.aClass12_283 = null;
			this.aClass12_284 = null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)Z")
	public final boolean method7970() {
		return this.aClass12_284 != null;
	}
}
