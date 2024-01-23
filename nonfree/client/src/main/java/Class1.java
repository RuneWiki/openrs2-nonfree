import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class Class1 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "J")
	public long aLong173;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!sa;")
	public Class1 aClass1_203;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!sa;")
	public Class1 aClass1_204;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public final void method3525() {
		if (this.aClass1_204 != null) {
			this.aClass1_204.aClass1_203 = this.aClass1_203;
			this.aClass1_203.aClass1_204 = this.aClass1_204;
			this.aClass1_203 = null;
			this.aClass1_204 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
	public final boolean method3529() {
		return this.aClass1_204 != null;
	}
}
