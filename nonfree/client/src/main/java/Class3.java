import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class Class3 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!be;")
	public Class3 aClass3_97;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "J")
	public long aLong88;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "Lclient!be;")
	public Class3 aClass3_98;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Z")
	protected final boolean method1926() {
		return this.aClass3_97 != null;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public final void method1930() {
		if (this.aClass3_97 != null) {
			this.aClass3_97.aClass3_98 = this.aClass3_98;
			this.aClass3_98.aClass3_97 = this.aClass3_97;
			this.aClass3_97 = null;
			this.aClass3_98 = null;
		}
	}
}
