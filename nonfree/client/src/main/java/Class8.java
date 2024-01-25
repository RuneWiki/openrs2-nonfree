import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class Class8 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Lclient!bk;")
	public Class8 aClass8_23;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!bk;")
	public Class8 aClass8_24;

	static {
		new Class209("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public final void method5780() {
		if (this.aClass8_23 != null) {
			this.aClass8_23.aClass8_24 = this.aClass8_24;
			this.aClass8_24.aClass8_23 = this.aClass8_23;
			this.aClass8_24 = null;
			this.aClass8_23 = null;
		}
	}
}
