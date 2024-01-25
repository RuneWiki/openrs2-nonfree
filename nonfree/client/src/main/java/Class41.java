import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class Class41 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!ki;")
	public Class41 aClass41_67;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!ki;")
	public Class41 aClass41_68;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public final void method7833() {
		if (this.aClass41_67 != null) {
			this.aClass41_67.aClass41_68 = this.aClass41_68;
			this.aClass41_68.aClass41_67 = this.aClass41_67;
			this.aClass41_67 = null;
			this.aClass41_68 = null;
		}
	}
}
