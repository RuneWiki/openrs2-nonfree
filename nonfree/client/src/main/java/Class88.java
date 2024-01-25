import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class Class88 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!nk;")
	public Class88 aClass88_25;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!nk;")
	public Class88 aClass88_26;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public final void method5917() {
		if (this.aClass88_26 != null) {
			this.aClass88_26.aClass88_25 = this.aClass88_25;
			this.aClass88_25.aClass88_26 = this.aClass88_26;
			this.aClass88_26 = null;
			this.aClass88_25 = null;
		}
	}
}
