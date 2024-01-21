import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class Class4 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "J")
	public long aLong100;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!s;")
	public Class4 aClass4_127;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Lclient!s;")
	public Class4 aClass4_128;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public final void method1989() {
		if (this.aClass4_127 != null) {
			this.aClass4_127.aClass4_128 = this.aClass4_128;
			this.aClass4_128.aClass4_127 = this.aClass4_127;
			this.aClass4_127 = null;
			this.aClass4_128 = null;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Z")
	public final boolean method1992() {
		return this.aClass4_127 != null;
	}
}
