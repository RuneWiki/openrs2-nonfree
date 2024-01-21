import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class Class3 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!de;")
	public Class3 aClass3_95;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "J")
	public long aLong81;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!de;")
	public Class3 aClass3_96;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public final void method1852() {
		if (this.aClass3_95 != null) {
			this.aClass3_95.aClass3_96 = this.aClass3_96;
			this.aClass3_96.aClass3_95 = this.aClass3_95;
			this.aClass3_96 = null;
			this.aClass3_95 = null;
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z")
	protected final boolean method1858() {
		return this.aClass3_95 != null;
	}
}
