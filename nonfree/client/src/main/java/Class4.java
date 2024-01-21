import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CSUKQTYW")
public class Class4 {

	@OriginalMember(owner = "client!CSUKQTYW", name = "a", descriptor = "J")
	public long aLong24;

	@OriginalMember(owner = "client!CSUKQTYW", name = "b", descriptor = "Lclient!CSUKQTYW;")
	public Class4 aClass4_41;

	@OriginalMember(owner = "client!CSUKQTYW", name = "c", descriptor = "Lclient!CSUKQTYW;")
	public Class4 aClass4_42;

	@OriginalMember(owner = "client!CSUKQTYW", name = "a", descriptor = "()V")
	public final void method556() {
		if (this.aClass4_42 != null) {
			this.aClass4_42.aClass4_41 = this.aClass4_41;
			this.aClass4_41.aClass4_42 = this.aClass4_42;
			this.aClass4_41 = null;
			this.aClass4_42 = null;
		}
	}
}
