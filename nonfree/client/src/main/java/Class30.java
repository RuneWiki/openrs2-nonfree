import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class Class30 {

	static {
		new Class83("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)Z")
	public abstract boolean method741();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)J")
	public abstract long method742();

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
	public abstract int method745();

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)I")
	public abstract int method746();

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)C")
	public abstract char method749();
}
