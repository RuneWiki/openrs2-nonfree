import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class Class1 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!sa;")
	public Class1 aClass1_101;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!sa;")
	public Class1 aClass1_102;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "J")
	public long aLong85;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z")
	protected final boolean method1910() {
		return this.aClass1_102 != null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public final void method1913() {
		if (this.aClass1_102 != null) {
			this.aClass1_102.aClass1_101 = this.aClass1_101;
			this.aClass1_101.aClass1_102 = this.aClass1_102;
			this.aClass1_102 = null;
			this.aClass1_101 = null;
		}
	}
}
