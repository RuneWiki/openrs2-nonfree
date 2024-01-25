import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class Class5 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "J")
	public long aLong253;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!um;")
	public Class5 aClass5_283;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "Lclient!um;")
	public Class5 aClass5_284;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	public final void method7425() {
		if (this.aClass5_283 != null) {
			this.aClass5_283.aClass5_284 = this.aClass5_284;
			this.aClass5_284.aClass5_283 = this.aClass5_283;
			this.aClass5_284 = null;
			this.aClass5_283 = null;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)Z")
	public final boolean method7426() {
		return this.aClass5_283 != null;
	}
}
