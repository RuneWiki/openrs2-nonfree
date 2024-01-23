import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class Class47 {

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Lclient!ki;")
	public Class47 aClass47_11;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!ki;")
	public Class47 aClass47_12;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public final void method4804() {
		if (this.aClass47_11 != null) {
			this.aClass47_11.aClass47_12 = this.aClass47_12;
			this.aClass47_12.aClass47_11 = this.aClass47_11;
			this.aClass47_12 = null;
			this.aClass47_11 = null;
		}
	}
}
