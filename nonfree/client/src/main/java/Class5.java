import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OWNYSRQV")
public class Class5 {

	@OriginalMember(owner = "client!OWNYSRQV", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!OWNYSRQV", name = "b", descriptor = "Lclient!OWNYSRQV;")
	public Class5 aClass5_41;

	@OriginalMember(owner = "client!OWNYSRQV", name = "c", descriptor = "Lclient!OWNYSRQV;")
	public Class5 aClass5_42;

	@OriginalMember(owner = "client!OWNYSRQV", name = "a", descriptor = "()V")
	public final void method423() {
		if (this.aClass5_42 != null) {
			this.aClass5_42.aClass5_41 = this.aClass5_41;
			this.aClass5_41.aClass5_42 = this.aClass5_42;
			this.aClass5_41 = null;
			this.aClass5_42 = null;
		}
	}
}
