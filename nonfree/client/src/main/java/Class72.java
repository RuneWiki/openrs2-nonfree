import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class Class72 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!ui;")
	public Class72 aClass72_23;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!ui;")
	public Class72 aClass72_24;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
	public final void method6719() {
		if (this.aClass72_24 != null) {
			this.aClass72_24.aClass72_23 = this.aClass72_23;
			this.aClass72_23.aClass72_24 = this.aClass72_24;
			this.aClass72_24 = null;
			this.aClass72_23 = null;
		}
	}
}
