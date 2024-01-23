import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class Class1 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "J")
	public long aLong223;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!mg;")
	public Class1 aClass1_232;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!mg;")
	public Class1 aClass1_233;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
	public final boolean method4614() {
		return this.aClass1_232 != null;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	public final void method4616() {
		if (this.aClass1_232 != null) {
			this.aClass1_232.aClass1_233 = this.aClass1_233;
			this.aClass1_233.aClass1_232 = this.aClass1_232;
			this.aClass1_233 = null;
			this.aClass1_232 = null;
		}
	}
}
