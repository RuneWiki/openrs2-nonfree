import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class5_Sub10 extends Class5 {

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
	public volatile int anInt1414 = -1;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString10;

	static {
		new Class198("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub10(@OriginalArg(0) String arg0) {
		this.aString10 = arg0;
	}
}
