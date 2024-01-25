import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class Class8 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!qp;")
	public Class8 aClass8_67;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!qp;")
	public Class8 aClass8_68;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)V")
	public final void method7615() {
		if (this.aClass8_68 != null) {
			this.aClass8_68.aClass8_67 = this.aClass8_67;
			this.aClass8_67.aClass8_68 = this.aClass8_68;
			this.aClass8_68 = null;
			this.aClass8_67 = null;
		}
	}
}
