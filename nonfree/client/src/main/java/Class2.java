import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class Class2 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "J")
	public long aLong96;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!fe;")
	public Class2 aClass2_117;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!fe;")
	public Class2 aClass2_118;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public final void method1930() {
		if (this.aClass2_118 != null) {
			this.aClass2_118.aClass2_117 = this.aClass2_117;
			this.aClass2_117.aClass2_118 = this.aClass2_118;
			this.aClass2_117 = null;
			this.aClass2_118 = null;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Z")
	public final boolean method1932() {
		return this.aClass2_118 != null;
	}
}
