import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class Class1 {

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "Lclient!wda;")
	public Class1 aClass1_283;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Lclient!wda;")
	public Class1 aClass1_284;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "J")
	public long aLong251;

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)V")
	public final void method8239() {
		if (this.aClass1_284 != null) {
			this.aClass1_284.aClass1_283 = this.aClass1_283;
			this.aClass1_283.aClass1_284 = this.aClass1_284;
			this.aClass1_283 = null;
			this.aClass1_284 = null;
		}
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)Z")
	public final boolean method8241() {
		return this.aClass1_284 != null;
	}
}
