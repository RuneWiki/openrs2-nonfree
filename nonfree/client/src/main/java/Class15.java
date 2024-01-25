import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class Class15 {

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "Lclient!jda;")
	public Class15 aClass15_67;

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "Lclient!jda;")
	public Class15 aClass15_68;

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V")
	public final void method9741() {
		if (this.aClass15_67 != null) {
			this.aClass15_67.aClass15_68 = this.aClass15_68;
			this.aClass15_68.aClass15_67 = this.aClass15_67;
			this.aClass15_68 = null;
			this.aClass15_67 = null;
		}
	}
}
