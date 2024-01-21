import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class Class1 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "J")
	public long aLong95;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!te;")
	public Class1 aClass1_123;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!te;")
	public Class1 aClass1_124;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public final void method2220() {
		if (this.aClass1_123 != null) {
			this.aClass1_123.aClass1_124 = this.aClass1_124;
			this.aClass1_124.aClass1_123 = this.aClass1_123;
			this.aClass1_123 = null;
			this.aClass1_124 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z")
	public final boolean method2226() {
		return this.aClass1_123 != null;
	}
}
