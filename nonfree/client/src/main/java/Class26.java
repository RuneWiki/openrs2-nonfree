import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class Class26 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!bf;")
	public Class26 aClass26_25;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!bf;")
	public Class26 aClass26_26;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public final void method7575() {
		if (this.aClass26_25 != null) {
			this.aClass26_25.aClass26_26 = this.aClass26_26;
			this.aClass26_26.aClass26_25 = this.aClass26_25;
			this.aClass26_25 = null;
			this.aClass26_26 = null;
		}
	}
}
