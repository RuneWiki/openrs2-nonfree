import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class Class3 {

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Lclient!ka;")
	public Class3 aClass3_117;

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "Lclient!ka;")
	public Class3 aClass3_118;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "J")
	public long aLong107;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
	public final boolean method2259() {
		return this.aClass3_118 != null;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
	public final void method2264() {
		if (this.aClass3_118 != null) {
			this.aClass3_118.aClass3_117 = this.aClass3_117;
			this.aClass3_117.aClass3_118 = this.aClass3_118;
			this.aClass3_117 = null;
			this.aClass3_118 = null;
		}
	}
}
