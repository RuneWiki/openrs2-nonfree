import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class Class32 {

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!sa;")
	public Class32 aClass32_23;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!sa;")
	public Class32 aClass32_24;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public final void method5725() {
		if (this.aClass32_24 != null) {
			this.aClass32_24.aClass32_23 = this.aClass32_23;
			this.aClass32_23.aClass32_24 = this.aClass32_24;
			this.aClass32_23 = null;
			this.aClass32_24 = null;
		}
	}
}
