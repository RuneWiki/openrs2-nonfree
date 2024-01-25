import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class Class48 {

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!jo;")
	public Class48 aClass48_23;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!jo;")
	public Class48 aClass48_24;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public final void method5436() {
		if (this.aClass48_23 != null) {
			this.aClass48_23.aClass48_24 = this.aClass48_24;
			this.aClass48_24.aClass48_23 = this.aClass48_23;
			this.aClass48_23 = null;
			this.aClass48_24 = null;
		}
	}
}
