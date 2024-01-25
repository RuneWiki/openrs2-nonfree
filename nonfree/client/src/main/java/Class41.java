import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class Class41 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!ul;")
	public Class41 aClass41_23;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!ul;")
	public Class41 aClass41_24;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public final void method5475() {
		if (this.aClass41_23 != null) {
			this.aClass41_23.aClass41_24 = this.aClass41_24;
			this.aClass41_24.aClass41_23 = this.aClass41_23;
			this.aClass41_24 = null;
			this.aClass41_23 = null;
		}
	}
}
