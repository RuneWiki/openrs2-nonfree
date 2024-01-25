import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class Class9 {

	@OriginalMember(owner = "client!pha", name = "h", descriptor = "Lclient!pha;")
	public Class9 aClass9_67;

	@OriginalMember(owner = "client!pha", name = "i", descriptor = "Lclient!pha;")
	public Class9 aClass9_68;

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "(B)V")
	public final void method8408() {
		if (this.aClass9_67 != null) {
			this.aClass9_67.aClass9_68 = this.aClass9_68;
			this.aClass9_68.aClass9_67 = this.aClass9_67;
			this.aClass9_68 = null;
			this.aClass9_67 = null;
		}
	}
}
