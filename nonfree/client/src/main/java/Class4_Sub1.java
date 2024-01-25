import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "J")
	public long aLong226;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "Lclient!jn;")
	public Class4_Sub1 aClass4_Sub1_57;

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "Lclient!jn;")
	public Class4_Sub1 aClass4_Sub1_58;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
	public final boolean method5861() {
		return this.aClass4_Sub1_58 != null;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public final void method5863() {
		if (this.aClass4_Sub1_58 != null) {
			this.aClass4_Sub1_58.aClass4_Sub1_57 = this.aClass4_Sub1_57;
			this.aClass4_Sub1_57.aClass4_Sub1_58 = this.aClass4_Sub1_58;
			this.aClass4_Sub1_58 = null;
			this.aClass4_Sub1_57 = null;
		}
	}
}
