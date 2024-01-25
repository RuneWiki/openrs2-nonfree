import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class Class60 {

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "Lclient!ir;")
	public Class60 aClass60_23;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "Lclient!ir;")
	public Class60 aClass60_24;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public final void method7802() {
		if (this.aClass60_23 != null) {
			this.aClass60_23.aClass60_24 = this.aClass60_24;
			this.aClass60_24.aClass60_23 = this.aClass60_23;
			this.aClass60_24 = null;
			this.aClass60_23 = null;
		}
	}
}
