import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class Class4 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!cb;")
	public Class4 aClass4_123;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!cb;")
	public Class4 aClass4_124;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "J")
	public long aLong100;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public final void method2124() {
		if (this.aClass4_124 != null) {
			this.aClass4_124.aClass4_123 = this.aClass4_123;
			this.aClass4_123.aClass4_124 = this.aClass4_124;
			this.aClass4_123 = null;
			this.aClass4_124 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z")
	public final boolean method2125() {
		return this.aClass4_124 != null;
	}
}
