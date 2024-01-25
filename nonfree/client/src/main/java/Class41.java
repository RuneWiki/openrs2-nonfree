import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class Class41 {

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "Lclient!sga;")
	public Class41 aClass41_67;

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "Lclient!sga;")
	public Class41 aClass41_68;

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)V")
	public final void method8644() {
		if (this.aClass41_68 != null) {
			this.aClass41_68.aClass41_67 = this.aClass41_67;
			this.aClass41_67.aClass41_68 = this.aClass41_68;
			this.aClass41_68 = null;
			this.aClass41_67 = null;
		}
	}
}
