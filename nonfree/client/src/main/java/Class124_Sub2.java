import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class Class124_Sub2 extends Class124 {

	static {
		new Class88("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	protected Class124_Sub2() {
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)Lclient!jg;")
	public abstract Interface8 method4974();
}
