import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class Class3 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!la;")
	public Class3 aClass3_101;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "J")
	public long aLong85;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!la;")
	public Class3 aClass3_102;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public final void method1966() {
		if (this.aClass3_101 != null) {
			this.aClass3_101.aClass3_102 = this.aClass3_102;
			this.aClass3_102.aClass3_101 = this.aClass3_101;
			this.aClass3_101 = null;
			this.aClass3_102 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z")
	protected final boolean method1967() {
		return this.aClass3_101 != null;
	}
}
