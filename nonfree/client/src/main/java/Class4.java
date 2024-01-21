import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class Class4 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!ec;")
	public Class4 aClass4_127;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!ec;")
	public Class4 aClass4_128;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "J")
	public long aLong99;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public final void method2004() {
		if (this.aClass4_128 != null) {
			this.aClass4_128.aClass4_127 = this.aClass4_127;
			this.aClass4_127.aClass4_128 = this.aClass4_128;
			this.aClass4_127 = null;
			this.aClass4_128 = null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Z")
	public final boolean method2005() {
		return this.aClass4_128 != null;
	}
}
