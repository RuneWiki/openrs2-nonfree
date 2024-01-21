import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class Class6 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "J")
	public long aLong114;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!ke;")
	public Class6 aClass6_99;

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "Lclient!ke;")
	public Class6 aClass6_100;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public final void method2083() {
		if (this.aClass6_100 != null) {
			this.aClass6_100.aClass6_99 = this.aClass6_99;
			this.aClass6_99.aClass6_100 = this.aClass6_100;
			this.aClass6_100 = null;
			this.aClass6_99 = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Z")
	protected final boolean method2086() {
		return this.aClass6_100 != null;
	}
}
