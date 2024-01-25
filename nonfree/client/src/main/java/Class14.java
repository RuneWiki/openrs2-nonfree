import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class Class14 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!va;")
	public Class14 aClass14_67;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!va;")
	public Class14 aClass14_68;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public final void method8904() {
		if (this.aClass14_68 != null) {
			this.aClass14_68.aClass14_67 = this.aClass14_67;
			this.aClass14_67.aClass14_68 = this.aClass14_68;
			this.aClass14_67 = null;
			this.aClass14_68 = null;
		}
	}
}
