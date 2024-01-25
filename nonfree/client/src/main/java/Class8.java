import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class Class8 {

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!te;")
	public Class8 aClass8_67;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!te;")
	public Class8 aClass8_68;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	public final void method8893() {
		if (this.aClass8_67 != null) {
			this.aClass8_67.aClass8_68 = this.aClass8_68;
			this.aClass8_68.aClass8_67 = this.aClass8_67;
			this.aClass8_67 = null;
			this.aClass8_68 = null;
		}
	}
}
