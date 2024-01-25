import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class Class21 {

	static {
		new Class84("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
	public abstract boolean method3177();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
	public abstract int method3178();

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)C")
	public abstract char method3180();

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
	public abstract int method3182();

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)J")
	public abstract long method3184();
}
