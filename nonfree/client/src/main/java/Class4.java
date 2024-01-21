import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IHAIACWA")
public class Class4 {

	@OriginalMember(owner = "client!IHAIACWA", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!IHAIACWA", name = "c", descriptor = "Lclient!IHAIACWA;")
	public Class4 aClass4_41;

	@OriginalMember(owner = "client!IHAIACWA", name = "d", descriptor = "Lclient!IHAIACWA;")
	public Class4 aClass4_42;

	@OriginalMember(owner = "client!IHAIACWA", name = "a", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!IHAIACWA", name = "a", descriptor = "()V")
	public final void method528() {
		if (this.aClass4_42 != null) {
			this.aClass4_42.aClass4_41 = this.aClass4_41;
			this.aClass4_41.aClass4_42 = this.aClass4_42;
			this.aClass4_41 = null;
			this.aClass4_42 = null;
		}
	}
}
