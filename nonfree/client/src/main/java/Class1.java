import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class Class1 {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "J")
	public long aLong149;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!rb;")
	public Class1 aClass1_213;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!rb;")
	public Class1 aClass1_214;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
	public final boolean method3561() {
		return this.aClass1_213 != null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public final void method3563() {
		if (this.aClass1_213 != null) {
			this.aClass1_213.aClass1_214 = this.aClass1_214;
			this.aClass1_214.aClass1_213 = this.aClass1_213;
			this.aClass1_214 = null;
			this.aClass1_213 = null;
		}
	}
}
