import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class Class1 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
	public long aLong247;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!ec;")
	public Class1 aClass1_232;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!ec;")
	public Class1 aClass1_233;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public final void method4767() {
		if (this.aClass1_232 != null) {
			this.aClass1_232.aClass1_233 = this.aClass1_233;
			this.aClass1_233.aClass1_232 = this.aClass1_232;
			this.aClass1_233 = null;
			this.aClass1_232 = null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z")
	public final boolean method4768() {
		return this.aClass1_232 != null;
	}
}
