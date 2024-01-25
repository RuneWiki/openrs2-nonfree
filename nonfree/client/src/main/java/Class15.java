import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class Class15 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!tm;")
	public Class15 aClass15_67;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!tm;")
	public Class15 aClass15_68;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(B)V")
	public final void method8314() {
		if (this.aClass15_67 != null) {
			this.aClass15_67.aClass15_68 = this.aClass15_68;
			this.aClass15_68.aClass15_67 = this.aClass15_67;
			this.aClass15_67 = null;
			this.aClass15_68 = null;
		}
	}
}
