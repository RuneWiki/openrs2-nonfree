import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OYTUMBCI")
public class Class3 {

	@OriginalMember(owner = "client!OYTUMBCI", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!OYTUMBCI", name = "c", descriptor = "Lclient!OYTUMBCI;")
	public Class3 aClass3_39;

	@OriginalMember(owner = "client!OYTUMBCI", name = "d", descriptor = "Lclient!OYTUMBCI;")
	public Class3 aClass3_40;

	@OriginalMember(owner = "client!OYTUMBCI", name = "a", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!OYTUMBCI", name = "a", descriptor = "()V")
	public final void method559() {
		if (this.aClass3_40 != null) {
			this.aClass3_40.aClass3_39 = this.aClass3_39;
			this.aClass3_39.aClass3_40 = this.aClass3_40;
			this.aClass3_39 = null;
			this.aClass3_40 = null;
		}
	}
}
