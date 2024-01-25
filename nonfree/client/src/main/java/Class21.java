import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class Class21 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!vi;")
	public Class21 aClass21_25;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Lclient!vi;")
	public Class21 aClass21_26;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public final void method5593() {
		if (this.aClass21_25 != null) {
			this.aClass21_25.aClass21_26 = this.aClass21_26;
			this.aClass21_26.aClass21_25 = this.aClass21_25;
			this.aClass21_26 = null;
			this.aClass21_25 = null;
		}
	}
}
