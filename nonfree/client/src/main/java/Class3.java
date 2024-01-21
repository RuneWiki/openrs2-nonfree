import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Class3 {

	@OriginalMember(owner = "client!w", name = "o", descriptor = "J")
	public long aLong83;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!w;")
	public Class3 aClass3_95;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!w;")
	public Class3 aClass3_96;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public final void method1883() {
		if (this.aClass3_96 != null) {
			this.aClass3_96.aClass3_95 = this.aClass3_95;
			this.aClass3_95.aClass3_96 = this.aClass3_96;
			this.aClass3_95 = null;
			this.aClass3_96 = null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Z")
	protected final boolean method1888() {
		return this.aClass3_96 != null;
	}
}
