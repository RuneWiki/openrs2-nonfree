import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class Class45 {

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!en;")
	public Class45 aClass45_9;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "Lclient!en;")
	public Class45 aClass45_10;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public final void method2449() {
		if (this.aClass45_10 != null) {
			this.aClass45_10.aClass45_9 = this.aClass45_9;
			this.aClass45_9.aClass45_10 = this.aClass45_10;
			this.aClass45_10 = null;
			this.aClass45_9 = null;
		}
	}
}
