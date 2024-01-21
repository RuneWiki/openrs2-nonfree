import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class Class3 {

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!ad;")
	public Class3 aClass3_127;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "J")
	public long aLong100;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!ad;")
	public Class3 aClass3_128;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public final void method2201() {
		if (this.aClass3_128 != null) {
			this.aClass3_128.aClass3_127 = this.aClass3_127;
			this.aClass3_127.aClass3_128 = this.aClass3_128;
			this.aClass3_128 = null;
			this.aClass3_127 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
	public final boolean method2203() {
		return this.aClass3_128 != null;
	}
}
