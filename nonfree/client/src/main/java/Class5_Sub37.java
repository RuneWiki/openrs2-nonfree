import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class5_Sub37 extends Class5 {

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	public final int anInt5625;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	public final int anInt5628;

	static {
		new Class85("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
	public Class5_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5625 = arg1;
		this.anInt5628 = arg0;
	}
}
