import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class Class1 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!rb;")
	public Class1 aClass1_203;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "J")
	public long aLong177;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!rb;")
	public Class1 aClass1_204;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
	public final boolean method3732() {
		return this.aClass1_204 != null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public final void method3735() {
		if (this.aClass1_204 != null) {
			this.aClass1_204.aClass1_203 = this.aClass1_203;
			this.aClass1_203.aClass1_204 = this.aClass1_204;
			this.aClass1_204 = null;
			this.aClass1_203 = null;
		}
	}
}
