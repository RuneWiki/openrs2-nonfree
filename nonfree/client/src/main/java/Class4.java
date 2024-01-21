import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class Class4 {

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!vd;")
	public Class4 aClass4_123;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!vd;")
	public Class4 aClass4_124;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "J")
	public long aLong155;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public final void method2189() {
		if (this.aClass4_124 != null) {
			this.aClass4_124.aClass4_123 = this.aClass4_123;
			this.aClass4_123.aClass4_124 = this.aClass4_124;
			this.aClass4_123 = null;
			this.aClass4_124 = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Z")
	public final boolean method2193() {
		return this.aClass4_124 != null;
	}
}
