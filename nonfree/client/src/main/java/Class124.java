import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class Class124 {

	static {
		new Class15("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	protected Class124() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
	public abstract void method5832(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Lclient!f;")
	public abstract Class77 method5834();

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)I")
	public abstract int method5837(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(II)[B")
	public abstract byte[] method5839(@OriginalArg(1) int arg0);
}
