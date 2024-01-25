import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class Class1 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!cf;")
	public Class1 aClass1_261;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "J")
	public long aLong222;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!cf;")
	public Class1 aClass1_262;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Z")
	public final boolean method6017() {
		return this.aClass1_262 != null;
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	public final void method6020() {
		if (this.aClass1_262 != null) {
			this.aClass1_262.aClass1_261 = this.aClass1_261;
			this.aClass1_261.aClass1_262 = this.aClass1_262;
			this.aClass1_262 = null;
			this.aClass1_261 = null;
		}
	}
}
