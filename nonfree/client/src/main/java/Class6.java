import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class Class6 {

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "Lclient!fga;")
	public Class6 aClass6_67;

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "Lclient!fga;")
	public Class6 aClass6_68;

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
	public final void method7989() {
		if (this.aClass6_68 != null) {
			this.aClass6_68.aClass6_67 = this.aClass6_67;
			this.aClass6_67.aClass6_68 = this.aClass6_68;
			this.aClass6_68 = null;
			this.aClass6_67 = null;
		}
	}
}
